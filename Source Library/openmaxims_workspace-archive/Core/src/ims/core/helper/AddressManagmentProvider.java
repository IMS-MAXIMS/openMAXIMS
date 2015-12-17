//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
package ims.core.helper;

import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

import capscan.client.McConnection;
import capscan.client.NcConnection;

import ims.configuration.EnvironmentConfig;
import ims.configuration.gen.ConfigFlag;
import ims.core.resource.place.domain.objects.CCGPCTPCCodes;
import ims.core.vo.GeoCoOrdVo;
import ims.core.vo.PersonAddress;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.impl.DomainImpl;
import ims.domain.addressmanager.AddressManager;
import ims.framework.enumerations.LatitudeLogitudeFormat;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.interfaces.IAddress;
import ims.framework.interfaces.IAddressProvider;

public class AddressManagmentProvider extends DomainImpl implements IAddressProvider {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final org.apache.log4j.Logger LOG = ims.utils.Logging.getLogger(AddressManagmentProvider.class);
	
	//private capscan.client.McConnection connection = null;    // Connection to Matchcode server .. Moved to AddressManager
	private int searchType = -1;
    private Vector<String> select;                 // Result fields to ask for
    private Vector where;                  // Query input field names
    private Vector data;                   // Query input field values
    private String resultsSearch[] = null;       // Result fields returned by server
    private Map<String, String> resultMap = null;
    
    /*****  Constants  *****/

    private static final String searchTypes[] = {
        "XMATCH",
        "BROWSE",
        "PCLOOKUP",
        "AKLOOKUP",
        "CSEARCH",
        "HSEARCH",
        "SSEARCH",
        "PSEARCH",
        "SELECT",
        "FOCUS",
        "QBROWSE",
        "SEARCH",
    };

    private static final int READING_FIELD = 0;
    private static final int READING_VALUE = 1;
	        
    public synchronized IAddress[] getAddress(IAddress searchCriteria, String searchTypeText, String listItem, String searchStatus) throws PresentationLogicException
    {
    	//WDEV-17296
    	String lSearchText = searchCriteria.getAddressSearchText();
    	//WDEV-17296
    	
    	if (searchCriteria == null)
    	{
    		throw new PresentationLogicException("No address search criteria provided.");
    	}
    	    	
    	ims.core.vo.PersonAddress[] l_address_results;
    	ims.core.vo.PersonAddress l_address = new ims.core.vo.PersonAddress();
    	
    	select = new Vector<String>();
        where = new Vector();
        data = new Vector();
        
    	l_address = (PersonAddress) searchForAddress(searchCriteria,searchTypeText,listItem,searchStatus);
    	
    	if (l_address ==  null)
    		return null;
    	
    	int ambiguitySize = getAmbiguitySize();
    	
    	l_address_results = new ims.core.vo.PersonAddress[ambiguitySize + 1];
    	l_address_results[0] = l_address;
    	
    	l_address_results = getAmbiguityList(l_address_results);
    	    	
		// WDEV-16590 
		String ccgCode=null;
		if (ConfigFlag.UI.DISPLAY_PCT_CODE.getValue() && l_address != null && l_address.getPostCodeIsNotNull())
		{
			String pCode = l_address.getPostCode().replaceAll(" ", "");			

			//WDEV-17296
			if (pCode == null || pCode.equals(""))
			{				
				pCode = lSearchText.replaceAll(" ", "");
			}
			//WDEV-17296
			
			CCGPCTPCCodes domCCG = CCGPCTPCCodes.getCCGPCTPCCodesFromPostcode(getDomainFactory(), pCode);
			if (domCCG != null && domCCG.getCCGCode() != null)
			{
				l_address.setPCT(domCCG.getCCGCode());
				l_address_results[0].setPCT(domCCG.getCCGCode());
				l_address_results[0].setPCTcode(domCCG.getCCGCode());
			}
			else
			{
				l_address_results[0].setPCT(null);
				l_address_results[0].setPCTcode(null);				
			}
		}

    	
    	return l_address_results;
    }
    
	public synchronized HashMap<String, String> computeDistances(IAddress searchCriteria, String units) throws PresentationLogicException 
	{
    	
    	if (searchCriteria == null)
    	{
    		throw new PresentationLogicException("Please provide address search criteria.");
    	}
    	
    	select = new Vector<String>();
        where = new Vector();
        data = new Vector();
        
    	return searchForDistance(searchCriteria,units);
    }

	@SuppressWarnings("static-access")
	private HashMap<String, String> searchForDistance(IAddress searchCriteria, String units) 
    {    	
    	    	    	    	
        StringBuilder l_query = new StringBuilder();
        StringBuilder l_restQuery = new StringBuilder();
        
        l_query.append(units + ",NEARESTRECORDS from PSEARCH");
        
        if (searchCriteria.getAddressPostCode() == null)
        	return null;
        		
        String strPostCode = stripspaces(searchCriteria.getAddressPostCode().toString());
        
        if (strPostCode.length() > 7)
        {
        	strPostCode = strPostCode.substring(0, 7); //only take full postcode for nearcode criteria
        }
        
        l_restQuery.append(" WHERE ADDR=" + "\"" + strPostCode + "\"");
        
        //apply radius
        if (ConfigFlag.UI.CAPSCAN_DIST_SEARCH_RADIUS.getValue() != "" && !ConfigFlag.UI.CAPSCAN_DIST_SEARCH_RADIUS.getValue().equals("-1"))
        	l_restQuery.append(",RADIUS=" + ConfigFlag.UI.CAPSCAN_DIST_SEARCH_RADIUS.getValue()); 
        
        //apply maxrecords
        if (ConfigFlag.UI.CAPSCAN_DIST_MAX_RECORDS.getValue() != "")
        	l_restQuery.append(",MAXRECORDS=" + ConfigFlag.UI.CAPSCAN_DIST_MAX_RECORDS.getValue());         
    	    	    	
    	l_query.append(l_restQuery);
    	
    	try
    	{
    		parseQuery(l_query.toString());
    		LOG.info("Nearcode Query: " + l_query.toString());
    	}
    	catch (Exception e)
    	{
    		LOG.error(e.getMessage());
    		return null;
    	}
    	 
    	capscan.client.NcConnection distanceManagerConnection = null;

    	try
    	{
    		//WDEV-17607
    		distanceManagerConnection = AddressManager.getncConnection(); 
    		if (distanceManagerConnection == null || (distanceManagerConnection != null && distanceManagerConnection.errno() != 0))
    		{
    			AddressManager.ncConnect(EnvironmentConfig.getCapscanServerName(), EnvironmentConfig.getCapscanDistPool(), NcConnection.STATELESS);
    			distanceManagerConnection = AddressManager.getncConnection();
    		}    		
    		//WDEV-17607
    		
    		distanceManagerConnection = AddressManager.getncConnection();
    	}
    	catch (Exception e)
    	{
    		LOG.error(e.getMessage());
    		return null;
    	}
    	
    	if (distanceManagerConnection == null)
    	{
    		LOG.error("Error getting Distance Manager connection. Please see server logs for more information.");
    		return null;
    	}

    	resultsSearch = distanceManagerConnection.search(searchType, select, where, data, 15);
    	
        if (resultsSearch != null && distanceManagerConnection != null && distanceManagerConnection.errno() == capscan.client.NcConnection.OK) 
        {
            if (select.size() > 1)
            {
            	//fill Map here            	
                String pools[] = distanceManagerConnection.pools();
                LOG.info("QUERY RESULTS");
                pools = distanceManagerConnection.pools();
            	String column;
                int count = 0;
                int k;
                int j;
                count = resultsSearch.length;
                StringBuffer strUnitDistances,strCodes;
                
                strUnitDistances = new StringBuffer();
                strCodes = new StringBuffer();
                
                for (j = k = 0 ; j < pools.length ; j++) {
                    if (pools.length > 1) {                
                        LOG.info("Pool " + pools[j] + ":\r\n");
                    }
                    
                    //Get unit distances first
                    for(k = 0; k < count; k++ )
                    {
	            		if (k < select.size())
	            			column = (String) select.elementAt(k);
	            		else
	            			column = "";	            		
	            		if (column.equals("MILES") || column.equals("KILOMETERS"))
	            			strUnitDistances.append(resultsSearch[k]);
                    }
                    
                    //get corresponding codes
                    for(k = 0; k < count; k++ )
                    {
	            		if (k < select.size())
	            			column = (String) select.elementAt(k);
	            		else
	            			column = "";	            		
	            		if (column.equals("NEARESTRECORDS"))
	            			strCodes.append(resultsSearch[k]);
                    }                    
                    
                }    
                
                putResultDistanceAndCode(strUnitDistances,strCodes);
            }
        } else {
        	if (distanceManagerConnection != null)
        	{
        		LOG.error("error: " + distanceManagerConnection.strerror(distanceManagerConnection.errno()));
        		return null;
        	}
        	else
        	{
        		LOG.error("error: connection null");
        		return null;
        	}
        }
        
        if (resultMap == null)
        	return null;
        
        return new HashMap<String, String>(resultMap);
        
	}

	private String stripspaces(String addressPostCode) 
	{
		StringTokenizer st = null;
		String t="";
		
		if (addressPostCode!= null)
			st = new StringTokenizer(addressPostCode);		
		if (st!=null)
			while (st.hasMoreElements()) t += st.nextElement();
		return t;
	}
	
	private void putResultDistanceAndCode(StringBuffer strDistances,StringBuffer strCodes) 
	{
		if (strDistances != null && strCodes != null)
		{
			if (resultMap == null)
				resultMap = new ConcurrentHashMap<String, String>();
			else
				resultMap.clear();
			
			
			String arrDist[] = strDistances.toString().split("\\|");
			String arrCodes[] = strCodes.toString().split("\\|");
						
			String strPostCode="";
			int iDistance=0;
			for (String strCode:arrCodes)
			{				
				if (strCode.lastIndexOf(",") != -1)
					strPostCode = strCode.substring(strCode.lastIndexOf(",") + 1,strCode.length());
				else
					strPostCode="";
				
				if (iDistance < arrDist.length)
					resultMap.put(stripspaces(strPostCode),arrDist[iDistance]);
				
				iDistance++;
			}
			
		}
	}
	
	private PersonAddress[] getAmbiguityList(ims.core.vo.PersonAddress[] l_address_results) 
    {
        int i;
        int j;
        int k;
        int count = 0; //skip first entry
        String liststr = getColumnValue("AMBIGLIST");
        String l_str = "";
        
        int len = 0;
        
        if (liststr != null)
        	len = liststr.length();
        else
        	return l_address_results;

        if (len == 0) {
            return l_address_results;
        }

        for (i = j = k = 0 ; i < len && j < len ; j = i + 1, k++) {
            i = liststr.indexOf(';', j);
            if (i == -1) {
                break;
            }

            count++;
            l_address_results[count] = new ims.core.vo.PersonAddress();
            l_address_results[count].setAddressBuildingNumber(liststr.substring(j, i));
            
            j = i + 1;
            i = liststr.indexOf(',', j);
            if (i == -1) {
                i = len - 1;
            }

            if (i > j) {
            	l_str = l_address_results[count].getAddressBuildingNumber();
            	l_str += " ";
            	l_str += liststr.substring(j, i);
            	l_address_results[count].setAddressBuildingNumber(l_str);
            } 
        }        	
		return l_address_results;
	}

    private String getColumnValue(String f_column)
    {
      	String column;
        int count = 0;
        int i;
        int k;
    	
        count = resultsSearch.length;
        
        for (i = k = 0 ; k < count && i < select.size() ; i++, k++) {
            column = (String) select.elementAt(i);
            if (column.equals(f_column))
            {
              	return resultsSearch[k];
            }
        }
    	
        return null;
    }
    
    private int getAmbiguitySize()
    {
        int i;
        int j;
        int k;
        int count = 0;
        String liststr = getColumnValue("AMBIGLIST");
        
        int len = 0;
        
        if (liststr != null)
        	len = liststr.length();
        else
        	return 0;

        if (len == 0) {
            return count;
        }

        for (i = j = k = 0 ; i < len && j < len ; j = i + 1, k++) {
            i = liststr.indexOf(';', j);
            if (i == -1) {
                break;
            }

            count++;
            j = i + 1;
            i = liststr.indexOf(',', j);
            if (i == -1) {
                i = len - 1;
            }
        }    
        
        return count;
    }
    //-------------------------------------------------------------------------
    /*
     * parseQuery()
     *
     * DESCRIPTION
     *   Parse the query string entered after a "select" command, populating
     *   the arrays select (the result fields to be requested from the
     *   Matchcode server), where (the names of the query input fields) and
     *   data (the values for the input fields) with the relevant data.
     *
     *   The query string (including the initial "select" command) is expected
     *   to take the following form:
     *
     *   SELECT ofld[,ofld...] FROM srchtype WHERE ifld=value[,ifld=value...]
     *
     *   * ofld is the name of an result field to be requested from the server.
     *   * srchtype is the kind of search to be performed and must be one of
     *     the following values:
     *       XMATCH   (Cross Matching, input expected in ADDR field)
     *       BROWSE   (Browsing, input expected in address element fields)
     *       PCLOOKUP (Postcode Lookup, input expected in POSTCODE field)
     *       AKLOOKUP (Address Key Lookup, input expected in ADDKEY/ORGKEY
     *                 fields)
     *       CSEARCH  (Search by Company and optional premise name/number,
     *                 input expected in ADDR field)
     *       HSEARCH  (Search by Premise Name, input expected in ADDR field)
     *       SSEARCH  (Search by Street and optional premise name/number,
     *                 input expected in ADDR field)
     *       PSEARCH  (Search by Postcode and optional premise name/number,
     *                 input expected in ADDR field)
     *       SELECT   (Select an item from a previously generated Ambiguity
     *                 List, input expected in LISTITEM field)
     *       FOCUS    (Change a previously generated Ambiguity List to show
     *                 items of a different address element type, e.g. show
     *                 Organisation names instead of Building Numbers; input
     *                 expected in LISTTYPE field)
     *       QBROWSE  (Quick Browse - a combination of CSEARCH, HSEARCH,
     *                 SSEARCH and PSEARCH; input expected in ADDR field)
     *   * ifld is the name of a field to be supplied as input, followed by an
     *     equals sign and the value to be given. The entire value, or parts
     *     of it, may be placed in apostrophes or quotation marks if it
     *     contains spaces.
     *
     *   Case is insignificant for the query string.
     *
     * ARGUMENTS
     *   query: The query string entered after the "select" command.
     *
     * RETURN VALUE
     *   Nothing.
     *
     * ERROR CONDITIONS
     *   1. A blank query string was supplied.
     *   2. The query's syntax is otherwise incorrect.
     *   A generic exception is thrown in all the above cases.
     */
    private void
    parseQuery(String query)
    throws Exception
    {
        int select_end;
        int from_start;
        int from_end;
        int where_start;

        // Initialise input strings
        select.removeAllElements();
        where.removeAllElements();
        data.removeAllElements();

        if (query.length() == 0) {
            throw new Exception("blank query");
        }

        query = query.toUpperCase();

        from_start = query.indexOf("FROM");
        where_start = query.indexOf("WHERE");

        if (from_start == -1) {
            throw new Exception("query contains no FROM clause");
        }
        if (where_start == -1) {
            throw new Exception("query contains no WHERE clause");
        }
        if (from_start > where_start) {
            throw new Exception("WHERE clause must follow FROM clause");
        }

        select_end = from_start;
        from_start += 4;
        from_end = where_start;
        where_start += 5;

        readColumns(query.substring(0, select_end));
        readSearchType(query.substring(from_start, from_end));
        readCriteria(query.substring(where_start));
    }
    
    //-------------------------------------------------------------------------
    /*
     * readColumns()
     *
     * DESCRIPTION
     *   Parse the names of the requested result fields entered in the query
     *   string.
     *
     * ARGUMENTS
     *   cols: Comma-separated list of field names.
     *
     * RETURN VALUE
     *   Nothing.
     *
     * ERROR CONDITIONS
     *   1. No field names were found, in which case a generic exception is
     *      thrown.
     *
     * SEE ALSO
     *   parseQuery()
     */
    private void
    readColumns(String cols)
    throws Exception
    {
        String currentToken;
        StringBuffer previousToken = new StringBuffer();
        StringTokenizer tok;
        int optionsOpen = 0;
        
        cols = cols.trim();
        if (cols.length() == 0) {
            throw new Exception("empty SELECT clause");
        }
        
        tok = new StringTokenizer(cols, ",()", true);
        
        while (tok.hasMoreTokens()) {
            // Get the next token
            currentToken = tok.nextToken().trim();
            
            // Skip blank tokens
            if (currentToken.length() == 0) {
                continue;
            }
            
            switch (currentToken.charAt(0)) {
                case ',':
                    if (optionsOpen > 0) {
                        // Token is a field options separator
                        previousToken.append(currentToken);
                    } else {
                        // Token is a field separator
                        select.addElement(previousToken.toString());
                        previousToken = new StringBuffer();
                    }
                    break;
                case '(':
                    // We have started reading field options
                    optionsOpen++;
                    previousToken.append(currentToken);
                    break;
                case ')':
                    // We have finished reading field options
                    optionsOpen--;
                    previousToken.append(currentToken);
                    break;
                default:
                    // Token is not a special character
                    previousToken.append(currentToken);
                    break;
            }
        }
        // Add the last token
        if (previousToken.length() > 0) {
            select.addElement(previousToken.toString());
            previousToken = new StringBuffer();
        }
    }

    //-------------------------------------------------------------------------
    /*
     * readSearchType()
     *
     * DESCRIPTION
     *   Parse the name of the search type entered in the query string, and
     *   find the matching numeric constant for it.
     *
     * ARGUMENTS
     *   type: Search type name.
     *
     * RETURN VALUE
     *   Nothing.
     *
     * ERROR CONDITIONS
     *   1. No name was found, in which case a generic exception is thrown.
     *
     * SEE ALSO
     *   parseQuery()
     */
    private void
    readSearchType(String type)
    throws Exception
    {
        int i;

        type = type.trim();
        if (type.length() == 0) {
            throw new Exception("empty FROM clause");
        }

        for (i = 0; i < searchTypes.length; i++) {
            if (searchTypes[i].equals(type)) {
                searchType = i;
                break;
            }
        }

        if (i == searchTypes.length) {
            throw new Exception("unrecognised search type '" + type + "'");
        }
    }

    //-------------------------------------------------------------------------
    /*
     * readCriteria()
     *
     * DESCRIPTION
     *   Parse the set of field=value input field specifications supplied in
     *   the final part of the query string, placing the field names into the
     *   where array and the field values into the data array.
     *
     * ARGUMENTS
     *   crit: The set of input field specifications.
     *
     * RETURN VALUE
     *   Nothing.
     *
     * ERROR CONDITIONS
     *   1. No input field specifications were found.
     *   2. A field name was specified without a corresponding value.
     *   3. An quoted section was missing its closing apostrophe or quotation
     *      mark.
     *   In all above cases a generic exception is thrown.
     *
     * SEE ALSO
     *   parseQuery()
     */
    @SuppressWarnings("unchecked")
	private void
    readCriteria(String crit)
    throws Exception
    {
        int state = READING_FIELD;
        String next;
        Vector<String> dst;
        char delim;
        char ch;
        int i = 0;
        int openquote;

        crit = crit.trim();             // Remove leading/trailing whitespace
        if (crit.length() == 0) {
            throw new Exception("empty WHERE clause");
        }

        while (i != -1) {
            // Look for an = sign if reading a field name, a comma otherwise
            delim = (state == READING_FIELD) ? '=' : ',';

            // Write to where if reading a field name, data otherwise
            dst = (state == READING_FIELD) ? where : data;

            i = skipWS(crit, i);
            if (i == -1) {
                // Unexpected end of string
                if (state == READING_VALUE) {
                    throw new Exception("missing field value");
                }
                continue;
            }

            for (next = new String() ; i != -1 ; i++) {
                try {
                    ch = crit.charAt(i);
                } catch (Exception e) {
                    break;
                }

                if (ch == delim || Character.isWhitespace(ch)) {
                    // End of token reached
                    break;
                } else if (ch == '\'' || ch == '"') {
                    // Skip quoted sections
                    openquote = i;
                    i = crit.indexOf(ch, ++i);
                    if (i == -1) {
                        throw new Exception("unbalanced quote " + ch);
                    }
                    next += crit.substring(openquote + 1, i);
                } else {
                    // Add character to present token
                    next += ch;
                }
            }

            // Add token to appropriate array
            dst.addElement(next);

            i = skipWS(crit, i);
            if (i != -1) {
                ch = crit.charAt(i);
            } else {
                ch = 0;
            }

            if (state == READING_FIELD) {           // Switch state
                if (i == -1 || ch != '=') {
                    // Unexpected end of string
                    throw new Exception("missing field value");
                }
                i++;
                state = READING_VALUE;
            } else {
                state = READING_FIELD;
                if (i != -1) {
                    i++;
                }
            }
        }
    }
    
    //-------------------------------------------------------------------------
    /*
     * skipWS()
     *
     * DESCRIPTION
     *   Skip whitespace in a string 'str', starting from index position
     *   'from'.
     *
     * ARGUMENTS
     *   str:  The string to be looked at.
     *   from: Character index (starting from zero) to start from.
     *
     * RETURN VALUE
     *   The index position of the first non-whitespace character found. If
     *   the end of the string was reached, the return value is -1.
     *
     * ERROR CONDITIONS
     *   None.
     */
    private int
    skipWS(String str, int from)
    {
        int max = str.length();
        while (from < max) {
            if (!Character.isWhitespace(str.charAt(from))) {
                break;
            }
            from++;
        }

        if (from >= max) {
            from = -1;
        }

        return from;
    }
    
    private synchronized IAddress searchForAddress(IAddress searchCriteria, String searchTypeText, String listItem, String searchStatus) throws PresentationLogicException    
	{    	
    	//LOG.info("getAddressByPostcode:");
    	
    	if (searchCriteria == null)
    		throw new PresentationLogicException("No Search Criteria given.");

    	//select AMBIGLIST,ORGANISATION,SUBBUILDING,BUILDINGNAME,BUILDINGNUMBER,DEPSTREET,STREET,DEPLOCALITY,LOCALITY,POSTTOWN,COUNTY,POSTCODE,ADDR,ADDKEY,ORGKEY,LISTTYPE,SEARCHSTATUS,LISTCOUNT,AMBIGLIST,BARCODE,ADEPOS,ADESCORE,ADPNRLOC,MSCORE,FFLAG,RESCODE,ERRNO,ERRTEXT,COUNTRY,COUNTRYCODE,MATCHLVL,PCLVL,INPCLVL,PCCHGLVL,PCCHGTYP,VANITYFLAGS,ELEMS_UNMATCHED,ELEMS_MATCHED,ELEMS_CORRECT,ELEMS_MISSPELLED,ELEMS_MISSING,FIELDSTATUS,OUTPUTSTATUS,ADDFMT_ABBR,ADDFMT_CONC,ADDFMT_TRUN,ADDFMT_ELIM,ADMINNUMBER,TRADNUMBER,LONLOCOUT,ADMINCOUNTY,TRADCOUNTY from PCLOOKUP where POSTCODE=
        
        StringBuilder l_query = new StringBuilder();
        StringBuilder l_restQuery = new StringBuilder();
        StringBuilder l_queryType = new StringBuilder();
        
        l_query.append("AMBIGLIST,ORGANISATION,SUBBUILDING,BUILDINGNAME,BUILDINGNUMBER," +
		"DEPSTREET,STREET,DEPLOCALITY,LOCALITY,POSTTOWN,COUNTY," +
		"POSTCODE(PP=16),ADDR,ADDKEY,ORGKEY,LISTTYPE,SEARCHSTATUS," +
		"LISTCOUNT,AMBIGLIST,BARCODE,ADEPOS,ADESCORE,ADPNRLOC," +
		"MSCORE,FFLAG,RESCODE,ERRNO,ERRTEXT,COUNTRY,COUNTRYCODE," +
		"MATCHLVL,PCLVL,INPCLVL,PCCHGLVL,PCCHGTYP,VANITYFLAGS," +
		"ELEMS_UNMATCHED,ELEMS_MATCHED,ELEMS_CORRECT," +
		"ELEMS_MISSPELLED,ELEMS_MISSING,FIELDSTATUS," +
		"OUTPUTSTATUS,ADDFMT_ABBR,ADDFMT_CONC,ADDFMT_TRUN," +
		"ADDFMT_ELIM,ADMINNUMBER,TRADNUMBER,LONLOCOUT,ADMINCOUNTY," +
		"TRADCOUNTY,PCG,DHA,OLDPCG,OLDDHA from "); //WDEV-14455 
        
        String postcode = "";        
        String Addr = "";
        String buildingNumber = "";
        String street = "";
        String postTown = "";
        String county = "";
        
        l_restQuery.append("");
        
        if (searchTypeText.equals("SEARCH"))
        {
	    	if (searchCriteria.getAddressSearchText() != null && searchCriteria.getAddressSearchText() != "")
	    	{
	    		Addr = searchCriteria.getAddressSearchText();
	    		if (l_restQuery.length()==0)
	    			l_restQuery.append(" WHERE ADDR=" + "\"" + Addr + "\"");
	    	}
        }
        else if (searchTypeText.equals("SELECT"))
        {
	    	if (searchCriteria.getAddressPostCode() != null)
	    	{
	        	postcode = searchCriteria.getAddressPostCode().toString();
	        	l_restQuery.append(" WHERE POSTCODE=" + "\"" + postcode + "\"");
	    	}

        	if (searchStatus != null && !searchStatus.equals(""))
        	{
	    		if (l_restQuery.length()==0)
	    			l_restQuery.append(" WHERE SEARCHSTATUS=" + "\"" + searchStatus + "\"");
	    		else
	    			l_restQuery.append(",SEARCHSTATUS=" + "\"" + searchStatus + "\"");
        	}
	    	
	    	if (searchCriteria.getAddressBuildingNumber() != null && searchCriteria.getAddressBuildingNumber() != "")
	    	{
	    		buildingNumber = searchCriteria.getAddressBuildingNumber().toString();
	    		if (l_restQuery.length()==0)
	    			l_restQuery.append(" WHERE BUILDINGNUMBER=" + "\"" + buildingNumber + "\"");
	    		else
	    			l_restQuery.append(",BUILDINGNUMBER=" + "\"" + buildingNumber + "\"");
	    	}
	    	if (searchCriteria.getAddressStreet() != null && searchCriteria.getAddressStreet() != "")
	    	{
	    		street = searchCriteria.getAddressStreet().toString();
	    		if (l_restQuery.length()==0)
	    			l_restQuery.append(" WHERE STREET=" + "\"" + street + "\"");
	    		else
	    			l_restQuery.append(",STREET=" + "\"" + street + "\"");
	    	}
	
	    	if (searchCriteria.getAddressPostTown() != null && searchCriteria.getAddressPostTown() != "")
	    	{
	    		postTown = searchCriteria.getAddressPostTown().toString();    		
	    		if (l_restQuery.length()==0)
	    			l_restQuery.append(" WHERE POSTTOWN=" + "\"" + postTown + "\"");
	    		else
	    			l_restQuery.append(",POSTTOWN=" + "\"" + postTown + "\"");
	    	}
	    	if (searchCriteria.getAddressCounty() != null && searchCriteria.getAddressCounty() != "")
	    	{
	    		county = searchCriteria.getAddressCounty().toString();
	    		if (l_restQuery.length()==0)
	    			l_restQuery.append(" WHERE COUNTY=" + "\"" + county + "\"");
	    		else
	    			l_restQuery.append(",COUNTY=" + "\"" + county + "\"");
	    	}
	    	
	    	//ListItem for Ambiguity selection
	    	if (listItem != null && listItem != "")
	    	{
	    		if (l_restQuery.length()==0)
	    			l_restQuery.append(" WHERE LISTITEM=" + "\"" + listItem + "\"");
	    		else
	    			l_restQuery.append(",LISTITEM=" + "\"" + listItem + "\"");
	    	}    		    	
        }
        else if (searchTypeText.equals("PCLOOKUP"))
        {
	    	if (searchCriteria.getAddressPostCode() != null)
	    	{
	        	postcode = searchCriteria.getAddressPostCode().toString();
	        	l_restQuery.append(" WHERE POSTCODE=" + "\"" + postcode + "\"");
	    	}
        }
            	
    	l_queryType.append(searchTypeText);
    	    	    	
    	l_query.append(l_queryType);
    	l_query.append(l_restQuery);
    	
    	try
    	{
    		parseQuery(l_query.toString());
    		LOG.info("CAPSCAN Query: " + l_query.toString());
    	}
    	catch (Exception e)
    	{
    		LOG.error(e.getMessage());
    		return null;
    	}
    	 
    	capscan.client.McConnection addressManagerConnection = null;

    	try
    	{    		
    		//WDEV-17607
    		addressManagerConnection = AddressManager.getConnection(); 
    		if (addressManagerConnection == null || 
    				(addressManagerConnection != null && addressManagerConnection.errno() != 0)
    				|| (addressManagerConnection != null && addressManagerConnection.errno() != 1))
    		{
    			AddressManager.connect(EnvironmentConfig.getCapscanServerName(), EnvironmentConfig.getCapscanPool(), McConnection.STATELESS);
    			addressManagerConnection = AddressManager.getConnection();
    		}    		
    		//WDEV-17607
    	}
    	catch (Exception e)
    	{
    		LOG.error(e.getMessage());
    		return null;
    	}
    	
    	if (addressManagerConnection == null)
    	{
    		LOG.error("Error getting Address Manager connection. Please see server logs for more information.");
    		return null;
    	}

    	resultsSearch = addressManagerConnection.search(searchType, select, where, data, 15);
    	
        if (resultsSearch != null && addressManagerConnection != null && addressManagerConnection.errno() == capscan.client.McConnection.OK) 
        {
            // Display results
            //int count = results.length;
        	
//	
// use for logging search query at level ERROR

            String pools[] = addressManagerConnection.pools();
            LOG.info("QUERY RESULTS");
            pools = addressManagerConnection.pools();
        	String column;
            int count = 0;
            int i;
            int k;
            int j;
            count = resultsSearch.length;
            
            for (j = k = 0 ; j < pools.length ; j++) {
                if (pools.length > 1) {                
                    LOG.info("Pool " + pools[j] + ":\r\n");
                }

                for (i = 0 ; k < count && i < select.size() ; i++, k++) {
                    column = (String) select.elementAt(i);
                    LOG.info(column + ":\r\n");
                    if (column.equals("AMBIGLIST")) {
                        printAmbigList(resultsSearch[k]);
                    } else {
                    	LOG.info("\t" + resultsSearch[k] + "\r\n");
                    }
                }
            }

            
            if (select.size() > 1)
            {  
            	String strSubBuildingName = getColumnValue("SUBBUILDING");
            	String strBuildingName = getColumnValue("BUILDINGNAME");
            	if (strSubBuildingName != null && !strSubBuildingName.equals(""))
            	{
            		if (!strBuildingName.equals(""))
            			searchCriteria.setAddressBuildingName(strSubBuildingName + ", " + getColumnValue("BUILDINGNAME"));
            		else
            			searchCriteria.setAddressBuildingName(strSubBuildingName);
            	}
            	else
            	{
            		searchCriteria.setAddressBuildingName(strBuildingName);
            	}
            	searchCriteria.setAddressBuildingNumber(getColumnValue("BUILDINGNUMBER"));            	
            	searchCriteria.setAddressLocality(getColumnValue("LOCALITY"));
            	//WDEV-15963
            	//support for DEPSTREET
            	if (getColumnValue("DEPSTREET") != null && !getColumnValue("DEPSTREET").equals(""))
            		searchCriteria.setAddressStreet(getColumnValue("DEPSTREET") + "," + getColumnValue("STREET"));
            	else
            		searchCriteria.setAddressStreet(getColumnValue("STREET"));
            	
            	//WDEV-17553
            	searchCriteria.setAddressPostTown(getColumnValue("POSTTOWN"));
				if (getColumnValue("POSTTOWN") != null && !getColumnValue("POSTTOWN").equals(getColumnValue("COUNTY")))
					searchCriteria.setAddressCounty(getColumnValue("COUNTY"));
				else
					searchCriteria.setAddressCounty("");	

            	//WDEV-15963            	
            	searchCriteria.setAddressPostCode(getColumnValue("POSTCODE(PP=16)"));
            	searchCriteria.setAddressSearchText(getColumnValue("SEARCHSTATUS"));
            	searchCriteria.setAddressOrganisation(getColumnValue("ORGANISATION"));
            	
            	//WDEV-14455
            	if (ConfigFlag.UI.CAPSCAN_USE_OLDPCT_CODE.getValue()) 
        		{
            		searchCriteria.setPCTcode(stripspaces(getColumnValue("OLDPCG")));
        		}
            	else
            	{
            		searchCriteria.setPCTcode(stripspaces(getColumnValue("PCG")));
            	}
            }
        } else {
        	if (addressManagerConnection != null)
        	{
        		LOG.error("error: " + addressManagerConnection.strerror(addressManagerConnection.errno()));
        		return null;
        	}
        	else
        	{
        		LOG.error("error: connection null");
        		return null;
        	}
        }
        
        return searchCriteria;
	}
    
	private void
    printAmbigList(String liststr)
    {
        int i;
        int j;
        int k;
        int len = liststr.length();

        if (len == 0) {
            LOG.info("\t<<<<<  Empty  >>>>>");
            return;
        }

        for (i = j = k = 0 ; i < len && j < len ; j = i + 1, k++) {
            i = liststr.indexOf(';', j);
            if (i == -1) {
                break;
            }

            LOG.info("\t" + k + ". " + liststr.substring(j, i));
            j = i + 1;
            i = liststr.indexOf(',', j);
            if (i == -1) {
                i = len - 1;
            }

            if (i > j) {
            	LOG.info("\t (" + liststr.substring(j, i) + ")");
            } else {
            	LOG.info("\r\n");
            }
        }
    }

	public String[] getLatitudeLogitude(IAddress searchCriteria, LatitudeLogitudeFormat latlongFormat) throws DomainRuntimeException 
	{    	        
        LatitudeLogitudeFormat[] lf = new LatitudeLogitudeFormat[1];
        lf[0] = latlongFormat;
        
        return getLatitudeLogitude(searchCriteria,lf);
	}

	public String[] getLatitudeLogitude(IAddress searchCriteria, LatitudeLogitudeFormat[] latlongFormat) throws DomainRuntimeException 
	{
    	if (searchCriteria == null)
    	{
    		throw new DomainRuntimeException("No address search criteria provided.");
    	}
    	
       	select = new Vector<String>();
        where = new Vector();
        data = new Vector();
        
        String[] l_latlong_result = getCoOrds(searchCriteria,latlongFormat);
    	
		return l_latlong_result;
	}
	
    private synchronized String[] getCoOrds(IAddress searchCriteria, LatitudeLogitudeFormat[] lformat) throws DomainRuntimeException    
	{    	
    	//DEGREES DEG
    	//RADIANS RAD
    	//SPACES  SPA Spaces instead of colons
    	//SYMBOLS SYM Degrees, Minutes and Seconds symbols instead of colons
    	//OSGB36  Ordnance Survey of Great Britain (default) datum (default)
    	//WGS84   World Geodetic Standard 1984 datum

    	LOG.info("getLatitudeLogitude:");
    	
    	if (searchCriteria == null && searchCriteria.getAddressPostCode() == null)
    		throw new DomainRuntimeException("No Search Criteria given.");
        
        StringBuilder l_query = new StringBuilder();
        StringBuilder l_latitudeQuery = new StringBuilder();
        StringBuilder l_longitudeQuery = new StringBuilder();
        
        String strPostCode = stripspaces(searchCriteria.getAddressPostCode().toString());
        
        if (lformat == null)
        {
        	l_query.append(" LATITUDE(DEG),LONGITUDE(DEG) from ");
        }
        else if (lformat.length == 1)
        {
	        switch (lformat[0].getId()) 
	        {
		        case LatitudeLogitudeFormat.EDEGREES: l_query.append(" LATITUDE(DEG),LONGITUDE(DEG) from "); break;
		        case LatitudeLogitudeFormat.ERADIANS: l_query.append(" LATITUDE(RAD),LONGITUDE(RAD) from "); break;
		        case LatitudeLogitudeFormat.ESPACES: l_query.append(" LATITUDE(SPA),LONGITUDE(SPA) from "); break;
		        case LatitudeLogitudeFormat.ESYMBOLS: l_query.append(" LATITUDE(SYM),LONGITUDE(SYM) from "); break;
		        default: l_query.append(" LATITUDE(DEG),LONGITUDE(DEG) from ");break;
	        }
        }
        else if (lformat.length == 2)
        {
        	//two formats specified
	        switch (lformat[0].getId()) 
	        {
		        case LatitudeLogitudeFormat.EDEGREES: l_latitudeQuery.append(" LATITUDE(DEG,"); l_longitudeQuery.append(" LONGITUDE(DEG,"); break;
		        case LatitudeLogitudeFormat.ERADIANS: l_latitudeQuery.append(" LATITUDE(RAD,"); l_longitudeQuery.append(" LONGITUDE(RAD,"); break;
		        case LatitudeLogitudeFormat.ESPACES: l_latitudeQuery.append(" LATITUDE(SPA,"); l_longitudeQuery.append(" LONGITUDE(SPA,"); break;
		        case LatitudeLogitudeFormat.ESYMBOLS: l_latitudeQuery.append(" LATITUDE(SYM,"); l_longitudeQuery.append(" LONGITUDE(SYM,"); break;
		        default: l_query.append(" LATITUDE(DEG),LONGITUDE(DEG) from ");break;
	        }
	        switch (lformat[1].getId()) 
	        {
		        case LatitudeLogitudeFormat.ESPACES: l_latitudeQuery.append("SPA)"); l_longitudeQuery.append("SPA)"); break;
		        case LatitudeLogitudeFormat.ESYMBOLS: l_latitudeQuery.append("SYM)"); l_longitudeQuery.append("SYM)"); break;
		        case LatitudeLogitudeFormat.EOSGB36: l_latitudeQuery.append("OSGB36)"); l_longitudeQuery.append("OSGB36)"); break;
		        case LatitudeLogitudeFormat.EWGS84: l_latitudeQuery.append("WGS84)"); l_longitudeQuery.append("WGS84)"); break;
		        default: if (l_query.toString() == "") l_query.append(" LATITUDE(DEG),LONGITUDE(DEG) from "); else break; break;
	        }
        	
        }        
            
    	try
    	{
    		l_query.append("PCLOOKUP WHERE POSTCODE = " + strPostCode); 
    		parseQuery(l_query.toString());
    		LOG.info("CAPSCAN GEO Query: " + l_query.toString());
    	}
    	catch (Exception e)
    	{
    		throw new DomainRuntimeException(e.getMessage());    		
    	}
    	 
    	capscan.client.McConnection addressManagerConnection = null;

    	try
    	{    		
    		addressManagerConnection = AddressManager.getConnection();
    	}
    	catch (Exception e)
    	{
    		LOG.error(e.getMessage());
    		return null;
    	}
    	
    	if (addressManagerConnection == null)
    	{
    		LOG.error("Error getting Address Manager connection. Please see server logs for more information.");
    		return null;
    	}

    	resultsSearch = addressManagerConnection.search(searchType, select, where, data, 15);
    	
    	return resultsSearch;
	}

	public double[] getLatitudeLogitude(IAddress searchCriteria) throws DomainRuntimeException 
	{
		String[] l_latlong =  getLatitudeLogitude(searchCriteria,LatitudeLogitudeFormat.DEGREES);		
		double[] l_dLatLong = new double[2];
		
		if (l_latlong != null)		
		{
			if (l_latlong.length == 2)
			{
				if (l_latlong[0] == null || l_latlong[1] == null)
					return null;
				
				try
				{
					//we have two entries to convert
					if (l_latlong[0] != null && l_latlong[0] != "")
						l_dLatLong[0] = Double.parseDouble(l_latlong[0]);
					if (l_latlong[1] != null && l_latlong[1] != "")
						l_dLatLong[1] = Double.parseDouble(l_latlong[1]);
				}
				catch (IllegalFormatConversionException e)
				{
					throw new DomainRuntimeException(e.getMessage());
				}
				return l_dLatLong;
			}
		}		
		
		return null;
	}

	public GeoCoOrdVo getGPSCoordinatesForPostCode(String postCode) 
	{
		GeoCoOrdVo geoCoOrdvo = new GeoCoOrdVo();
		AddressManagmentProvider amf = new AddressManagmentProvider();
		
		ims.core.vo.PersonAddress lpa = new ims.core.vo.PersonAddress();
		lpa.setPostCode(postCode);
		
		double[] coOrds;
		try 
		{
			coOrds = amf.getLatitudeLogitude(lpa);
		} 
		catch (DomainRuntimeException e) 
		{
			return null;
		}			
		if (coOrds != null && coOrds.length == 2)
		{
			geoCoOrdvo.setLatitude((float)coOrds[0]);
			geoCoOrdvo.setLogitude((float)coOrds[1]);
			return geoCoOrdvo;
		}
		
		return null;
	}
	
}
