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
// Template ver. 1.1.2 - Last modified on 19/10/2005 13:00 by Barbara Worwood

package ims.dto.client;


import java.util.HashMap;

public final class Demographics implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Demographics.class);
	
	private DemographicsFilter lastGetFilter = null;
	private final String serviceName = "DEMOGRAPHICS";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public DemographicsFilter Filter = new DemographicsFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public DemographicsEditFilter EditFilter = new DemographicsEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public DemographicsCollection DataCollection = new DemographicsCollection();

	/**
	 * Creates a new Demographics Data Transfer Object.
	 */ 
	public Demographics(ims.dto.Connection connection)
	{	
		this.Connection = connection;
	}
	/**
	 * Returns the last result data after an insert or an update call
	 */
	public ims.dto.ResultData getLastResultData()
	{
		return this.lastResultData;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Object clone()
	{
		return cloneObject();
	}
	/**
	 * Creates a new typed copy of the current Data Transfer Object
	 */
	public Demographics cloneObject()
	{
		Demographics cloneObject = new Demographics(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Snm = DataCollection.get(x).Snm;
			cloneObject.DataCollection.get(index).Fnm1 = DataCollection.get(x).Fnm1;
			cloneObject.DataCollection.get(index).Fnm2 = DataCollection.get(x).Fnm2;
			cloneObject.DataCollection.get(index).Uppsnm = DataCollection.get(x).Uppsnm;
			cloneObject.DataCollection.get(index).Uppfnm = DataCollection.get(x).Uppfnm;
			cloneObject.DataCollection.get(index).Titl = DataCollection.get(x).Titl;
			cloneObject.DataCollection.get(index).Titltxt = DataCollection.get(x).Titltxt;
			cloneObject.DataCollection.get(index).Soundex = DataCollection.get(x).Soundex;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Dod = DataCollection.get(x).Dod;
			cloneObject.DataCollection.get(index).Sex = DataCollection.get(x).Sex;
			cloneObject.DataCollection.get(index).Ppsn = DataCollection.get(x).Ppsn;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Nhsn = DataCollection.get(x).Nhsn;
			cloneObject.DataCollection.get(index).Csta = DataCollection.get(x).Csta;
			cloneObject.DataCollection.get(index).Ploc = DataCollection.get(x).Ploc;
			cloneObject.DataCollection.get(index).Adr1 = DataCollection.get(x).Adr1;
			cloneObject.DataCollection.get(index).Adr2 = DataCollection.get(x).Adr2;
			cloneObject.DataCollection.get(index).Adr3 = DataCollection.get(x).Adr3;
			cloneObject.DataCollection.get(index).Adr4 = DataCollection.get(x).Adr4;
			cloneObject.DataCollection.get(index).Post = DataCollection.get(x).Post;
			cloneObject.DataCollection.get(index).Ntel = DataCollection.get(x).Ntel;
			cloneObject.DataCollection.get(index).Dtel = DataCollection.get(x).Dtel;
			cloneObject.DataCollection.get(index).Mobile = DataCollection.get(x).Mobile;
			cloneObject.DataCollection.get(index).Fax = DataCollection.get(x).Fax;
			cloneObject.DataCollection.get(index).Email = DataCollection.get(x).Email;
			cloneObject.DataCollection.get(index).Tadr1 = DataCollection.get(x).Tadr1;
			cloneObject.DataCollection.get(index).Tadr2 = DataCollection.get(x).Tadr2;
			cloneObject.DataCollection.get(index).Tadr3 = DataCollection.get(x).Tadr3;
			cloneObject.DataCollection.get(index).Tadr4 = DataCollection.get(x).Tadr4;
			cloneObject.DataCollection.get(index).Tdtel = DataCollection.get(x).Tdtel;
			cloneObject.DataCollection.get(index).Tntel = DataCollection.get(x).Tntel;
			cloneObject.DataCollection.get(index).Tpost = DataCollection.get(x).Tpost;
			cloneObject.DataCollection.get(index).Mart = DataCollection.get(x).Mart;
			cloneObject.DataCollection.get(index).Ethc = DataCollection.get(x).Ethc;
			cloneObject.DataCollection.get(index).Relg = DataCollection.get(x).Relg;
			cloneObject.DataCollection.get(index).Relgtxt = DataCollection.get(x).Relgtxt;
			cloneObject.DataCollection.get(index).Marttxt = DataCollection.get(x).Marttxt;
			cloneObject.DataCollection.get(index).Sextxt = DataCollection.get(x).Sextxt;
			cloneObject.DataCollection.get(index).Gpcd = DataCollection.get(x).Gpcd;
			cloneObject.DataCollection.get(index).Prcd = DataCollection.get(x).Prcd;
			cloneObject.DataCollection.get(index).Pocc = DataCollection.get(x).Pocc;
			cloneObject.DataCollection.get(index).Poccdesc = DataCollection.get(x).Poccdesc;
			cloneObject.DataCollection.get(index).Gpcdname = DataCollection.get(x).Gpcdname;
			cloneObject.DataCollection.get(index).Gptitlftxt = DataCollection.get(x).Gptitlftxt;
			cloneObject.DataCollection.get(index).Kinname = DataCollection.get(x).Kinname;
			cloneObject.DataCollection.get(index).Name = DataCollection.get(x).Name;
			cloneObject.DataCollection.get(index).Nkfnam = DataCollection.get(x).Nkfnam;
			cloneObject.DataCollection.get(index).Ntitl = DataCollection.get(x).Ntitl;
			cloneObject.DataCollection.get(index).Nadr1 = DataCollection.get(x).Nadr1;
			cloneObject.DataCollection.get(index).Nadr2 = DataCollection.get(x).Nadr2;
			cloneObject.DataCollection.get(index).Nadr3 = DataCollection.get(x).Nadr3;
			cloneObject.DataCollection.get(index).Nadr4 = DataCollection.get(x).Nadr4;
			cloneObject.DataCollection.get(index).Npost = DataCollection.get(x).Npost;
			cloneObject.DataCollection.get(index).Nntel = DataCollection.get(x).Nntel;
			cloneObject.DataCollection.get(index).Ndtel = DataCollection.get(x).Ndtel;
			cloneObject.DataCollection.get(index).Nkmobile = DataCollection.get(x).Nkmobile;
			cloneObject.DataCollection.get(index).Rel = DataCollection.get(x).Rel;
			cloneObject.DataCollection.get(index).Kinreldesc = DataCollection.get(x).Kinreldesc;
			cloneObject.DataCollection.get(index).Snmb = DataCollection.get(x).Snmb;
			cloneObject.DataCollection.get(index).Remote = DataCollection.get(x).Remote;
			cloneObject.DataCollection.get(index).Healthcat = DataCollection.get(x).Healthcat;
			cloneObject.DataCollection.get(index).Medcardno = DataCollection.get(x).Medcardno;
			cloneObject.DataCollection.get(index).Chartnum = DataCollection.get(x).Chartnum;
			cloneObject.DataCollection.get(index).Oidtype = DataCollection.get(x).Oidtype;
			cloneObject.DataCollection.get(index).Oidval = DataCollection.get(x).Oidval;
			cloneObject.DataCollection.get(index).Cnt = DataCollection.get(x).Cnt;
			cloneObject.DataCollection.get(index).Harc = DataCollection.get(x).Harc;
			cloneObject.DataCollection.get(index).Nhsnfmtver = DataCollection.get(x).Nhsnfmtver;
			cloneObject.DataCollection.get(index).Nhsnfmt = DataCollection.get(x).Nhsnfmt;
			cloneObject.DataCollection.get(index).Nhsnfmtvflag = DataCollection.get(x).Nhsnfmtvflag;
			cloneObject.DataCollection.get(index).Nhsnver = DataCollection.get(x).Nhsnver;
			cloneObject.DataCollection.get(index).Capfnm1 = DataCollection.get(x).Capfnm1;
			cloneObject.DataCollection.get(index).Gmcnum = DataCollection.get(x).Gmcnum;
			cloneObject.DataCollection.get(index).Delpatact = DataCollection.get(x).Delpatact;
			cloneObject.DataCollection.get(index).Webadt = DataCollection.get(x).Webadt;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.9.4.3 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Demographics.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Demographics.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Demographics.Count");
				
		return Connection.getLastError();				
	}		
	/**
	 * Returns the list of records using the specified filter. Use maxRecords to limit the number of records returned. If the result returned is not null an error occured.
	 */
	public ims.dto.Result list(int maxRecords)
	{
		if(maxRecords <= 0)
			return list();		
				
		return list(false, maxRecords);
	}	
	/**
	* Returns the list of records using the specified filter. If the result returned is not null an error occured.
	*/
	public ims.dto.Result list()
	{	
		return list(true, 0);
	}				
	/**
	* Returns one record using the specified filter. If the result returned is not null an error occured.
	*/
	public ims.dto.Result get()
	{	
		DataCollection.clear();
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Demographics.Get");
			
		ims.dto.Result result = Connection.get(serviceName, encodeNASFilter());
		if(result != null)
			return result;
			
		lastGetFilter = Filter.cloneObject();						
		decodeNASMessageWithRepeatingGroups();		
			
		return null;
	}	
	/**
	* Returns one record using the specified filter. If the result returned is not null an error occured.
	*/
	public ims.dto.Result getLast()
	{	
		DataCollection.clear();
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Demographics.Get");
			
		ims.dto.Result result = Connection.getLast(serviceName, encodeNASFilter());
		if(result != null)
			return result;
			
		lastGetFilter = Filter.cloneObject();						
		decodeNASMessageWithRepeatingGroups();	
			
		return null;
	}					
	/**
	* Performs data validation prior to update. If the result returned is not null an error occured.
	*/
	public ims.dto.Result getForUpdate()
	{						
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Demographics.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Demographics.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Demographics.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Demographics.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Demographics.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Demographics.Insert");
			
		ims.dto.Result result = Connection.insert(serviceName, encodeNASMessage());
		if(result != null)
			return result;
					
		int recordID = 0;
					
		try
		{
			recordID = new Integer(Connection.getValueAt(2)).intValue();
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Demographics.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Demographics.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Demographics.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Demographics.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Demographics.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Demographics.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Demographics.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Demographics.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Demographics.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Demographics.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Demographics.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Demographics.TransferData");
			
		ims.dto.Result result = Connection.transferData(serviceName, encodeNASMessage(), action.toUpperCase());
		if(result != null)
			return result;
		
		DataCollection.clear();
		decodeNASMessageWithRepeatingGroups();	
		
		return null;
	}
	/**
	 * Updates a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result update()
	{			
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Demographics.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Demographics.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Demographics.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Demographics.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Demographics nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Demographics After NextList ");
				
		decodeNASMessage();		
		logger.debug("Demographics After decode NasMsg NextList");
		return null;
	}
		
	private boolean canContinueToList(boolean loadAllRecords, int maxRecords)
	{
		if(!listInProgress)
			return false;				
		if(loadAllRecords)
			return true;			
		return DataCollection.count() < maxRecords;
	}
	
	private ims.dto.Result list(boolean loadAllRecords, int maxRecords)
	{	
		DataCollection.clear();
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Demographics.List");
							
		listInProgress = true;	
		logger.debug("Demographics Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Demographics After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Demographics After Parse Message");
		
						
		ims.dto.Result execResult = null;
		while(execResult == null && canContinueToList(loadAllRecords, maxRecords))
			execResult = nextList();
						
		listInProgress = false;

		if(execResult != null)
		{ 
			if(execResult.getId() != -3) 
			{
				Connection.stopList(serviceName);
				return execResult;
			}

			return null;
		}
		
		Connection.stopList(serviceName);
		return null; 
	}	

	private String encodeNASFilter()
	{
		return encodeNASFilter(Filter);
	}
	private String encodeNASFilter(DemographicsFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey);
		}
		
		if(Filter.Snm != null && filter.Snm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Snm);
		}
		
		if(Filter.Fnm1 != null && filter.Fnm1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fnm1);
		}
		
		if(Filter.Fnm2 != null && filter.Fnm2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FNM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fnm2);
		}
		
		if(Filter.Uppsnm != null && filter.Uppsnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UPPSNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uppsnm);
		}
		
		if(Filter.Uppfnm != null && filter.Uppfnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UPPFNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uppfnm);
		}
		
		if(Filter.Titl != null && filter.Titl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Titl);
		}
		
		if(Filter.Titltxt != null && filter.Titltxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TITLTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Titltxt);
		}
		
		if(Filter.Soundex != null && filter.Soundex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SOUNDEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Soundex);
		}
		
		if(Filter.Dob != null && filter.Dob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dob);
		}
		
		if(Filter.Dod != null && filter.Dod.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dod);
		}
		
		if(Filter.Sex != null && filter.Sex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sex);
		}
		
		if(Filter.Ppsn != null && filter.Ppsn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PPSN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ppsn);
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum);
		}
		
		if(Filter.Nhsn != null && filter.Nhsn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NHSN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsn);
		}
		
		if(Filter.Csta != null && filter.Csta.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CSTA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Csta);
		}
		
		if(Filter.Ploc != null && filter.Ploc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PLOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ploc);
		}
		
		if(Filter.Adr1 != null && filter.Adr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr1);
		}
		
		if(Filter.Adr2 != null && filter.Adr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr2);
		}
		
		if(Filter.Adr3 != null && filter.Adr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr3);
		}
		
		if(Filter.Adr4 != null && filter.Adr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr4);
		}
		
		if(Filter.Post != null && filter.Post.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("POST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Post);
		}
		
		if(Filter.Ntel != null && filter.Ntel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ntel);
		}
		
		if(Filter.Dtel != null && filter.Dtel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dtel);
		}
		
		if(Filter.Mobile != null && filter.Mobile.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MOBILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mobile);
		}
		
		if(Filter.Fax != null && filter.Fax.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FAX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fax);
		}
		
		if(Filter.Email != null && filter.Email.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EMAIL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Email);
		}
		
		if(Filter.Tadr1 != null && filter.Tadr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tadr1);
		}
		
		if(Filter.Tadr2 != null && filter.Tadr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tadr2);
		}
		
		if(Filter.Tadr3 != null && filter.Tadr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tadr3);
		}
		
		if(Filter.Tadr4 != null && filter.Tadr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tadr4);
		}
		
		if(Filter.Tdtel != null && filter.Tdtel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TDTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tdtel);
		}
		
		if(Filter.Tntel != null && filter.Tntel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TNTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tntel);
		}
		
		if(Filter.Tpost != null && filter.Tpost.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TPOST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tpost);
		}
		
		if(Filter.Mart != null && filter.Mart.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MART" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mart);
		}
		
		if(Filter.Ethc != null && filter.Ethc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ETHC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ethc);
		}
		
		if(Filter.Relg != null && filter.Relg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RELG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Relg);
		}
		
		if(Filter.Relgtxt != null && filter.Relgtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RELGTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Relgtxt);
		}
		
		if(Filter.Marttxt != null && filter.Marttxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MARTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Marttxt);
		}
		
		if(Filter.Sextxt != null && filter.Sextxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SEXTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sextxt);
		}
		
		if(Filter.Gpcd != null && filter.Gpcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpcd);
		}
		
		if(Filter.Prcd != null && filter.Prcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prcd);
		}
		
		if(Filter.Pocc != null && filter.Pocc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("POCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pocc);
		}
		
		if(Filter.Poccdesc != null && filter.Poccdesc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("POCCDESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Poccdesc);
		}
		
		if(Filter.Gpcdname != null && filter.Gpcdname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPCDNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpcdname);
		}
		
		if(Filter.Gptitlftxt != null && filter.Gptitlftxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPTITLFTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gptitlftxt);
		}
		
		if(Filter.Kinname != null && filter.Kinname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("KINNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Kinname);
		}
		
		if(Filter.Name != null && filter.Name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Name);
		}
		
		if(Filter.Nkfnam != null && filter.Nkfnam.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NKFNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nkfnam);
		}
		
		if(Filter.Ntitl != null && filter.Ntitl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NTITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ntitl);
		}
		
		if(Filter.Nadr1 != null && filter.Nadr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nadr1);
		}
		
		if(Filter.Nadr2 != null && filter.Nadr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nadr2);
		}
		
		if(Filter.Nadr3 != null && filter.Nadr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nadr3);
		}
		
		if(Filter.Nadr4 != null && filter.Nadr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nadr4);
		}
		
		if(Filter.Npost != null && filter.Npost.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NPOST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Npost);
		}
		
		if(Filter.Nntel != null && filter.Nntel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NNTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nntel);
		}
		
		if(Filter.Ndtel != null && filter.Ndtel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NDTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ndtel);
		}
		
		if(Filter.Nkmobile != null && filter.Nkmobile.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NKMOBILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nkmobile);
		}
		
		if(Filter.Rel != null && filter.Rel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rel);
		}
		
		if(Filter.Kinreldesc != null && filter.Kinreldesc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("KINRELDESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Kinreldesc);
		}
		
		if(Filter.Snmb != null && filter.Snmb.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SNMB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Snmb);
		}
		
		if(Filter.Remote != null && filter.Remote.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REMOTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Remote);
		}
		
		if(Filter.Healthcat != null && filter.Healthcat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HEALTHCAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Healthcat);
		}
		
		if(Filter.Medcardno != null && filter.Medcardno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MEDCARDNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Medcardno);
		}
		
		if(Filter.Chartnum != null && filter.Chartnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CHARTNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Chartnum);
		}
		
		if(Filter.Oidtype != null && filter.Oidtype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OIDTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Oidtype);
		}
		
		if(Filter.Oidval != null && filter.Oidval.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OIDVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Oidval);
		}
		
		if(Filter.Cnt != null && filter.Cnt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CNT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cnt);
		}
		
		if(Filter.Harc != null && filter.Harc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HARC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Harc);
		}
		
		if(Filter.Nhsnfmtver != null && filter.Nhsnfmtver.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NHSNFMTVER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsnfmtver);
		}
		
		if(Filter.Nhsnfmt != null && filter.Nhsnfmt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NHSNFMT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsnfmt);
		}
		
		if(Filter.Nhsnfmtvflag != null && filter.Nhsnfmtvflag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NHSNFMTVFLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsnfmtvflag);
		}
		
		if(Filter.Nhsnver != null && filter.Nhsnver.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NHSNVER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsnver);
		}
		
		if(Filter.Capfnm1 != null && filter.Capfnm1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CAPFNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Capfnm1);
		}
		
		if(Filter.Gmcnum != null && filter.Gmcnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GMCNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gmcnum);
		}
		
		if(Filter.Delpatact != null && filter.Delpatact.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DELPATACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Delpatact);
		}
		
		if(Filter.Webadt != null && filter.Webadt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("WEBADT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Webadt);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		DemographicsRecord data = (DemographicsRecord)DataCollection.get(0);
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey));
		}
		
		if(EditFilter.IncludeSnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Snm));
		}
		
		if(EditFilter.IncludeFnm1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fnm1));
		}
		
		if(EditFilter.IncludeFnm2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FNM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fnm2));
		}
		
		if(EditFilter.IncludeUppsnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UPPSNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uppsnm));
		}
		
		if(EditFilter.IncludeUppfnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UPPFNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uppfnm));
		}
		
		if(EditFilter.IncludeTitl)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Titl));
		}
		
		if(EditFilter.IncludeTitltxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TITLTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Titltxt));
		}
		
		if(EditFilter.IncludeSoundex)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SOUNDEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Soundex));
		}
		
		if(EditFilter.IncludeDob)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dob));
		}
		
		if(EditFilter.IncludeDod)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dod));
		}
		
		if(EditFilter.IncludeSex)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sex));
		}
		
		if(EditFilter.IncludePpsn)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PPSN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ppsn));
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum));
		}
		
		if(EditFilter.IncludeNhsn)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NHSN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsn));
		}
		
		if(EditFilter.IncludeCsta)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CSTA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Csta));
		}
		
		if(EditFilter.IncludePloc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PLOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ploc));
		}
		
		if(EditFilter.IncludeAdr1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr1));
		}
		
		if(EditFilter.IncludeAdr2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr2));
		}
		
		if(EditFilter.IncludeAdr3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr3));
		}
		
		if(EditFilter.IncludeAdr4)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr4));
		}
		
		if(EditFilter.IncludePost)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("POST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Post));
		}
		
		if(EditFilter.IncludeNtel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ntel));
		}
		
		if(EditFilter.IncludeDtel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dtel));
		}
		
		if(EditFilter.IncludeMobile)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MOBILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mobile));
		}
		
		if(EditFilter.IncludeFax)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FAX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fax));
		}
		
		if(EditFilter.IncludeEmail)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EMAIL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Email));
		}
		
		if(EditFilter.IncludeTadr1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tadr1));
		}
		
		if(EditFilter.IncludeTadr2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tadr2));
		}
		
		if(EditFilter.IncludeTadr3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tadr3));
		}
		
		if(EditFilter.IncludeTadr4)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tadr4));
		}
		
		if(EditFilter.IncludeTdtel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TDTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tdtel));
		}
		
		if(EditFilter.IncludeTntel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TNTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tntel));
		}
		
		if(EditFilter.IncludeTpost)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TPOST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tpost));
		}
		
		if(EditFilter.IncludeMart)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MART" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mart));
		}
		
		if(EditFilter.IncludeEthc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ETHC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ethc));
		}
		
		if(EditFilter.IncludeRelg)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RELG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Relg));
		}
		
		if(EditFilter.IncludeRelgtxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RELGTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Relgtxt));
		}
		
		if(EditFilter.IncludeMarttxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MARTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Marttxt));
		}
		
		if(EditFilter.IncludeSextxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEXTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sextxt));
		}
		
		if(EditFilter.IncludeGpcd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpcd));
		}
		
		if(EditFilter.IncludePrcd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prcd));
		}
		
		if(EditFilter.IncludePocc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("POCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pocc));
		}
		
		if(EditFilter.IncludePoccdesc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("POCCDESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Poccdesc));
		}
		
		if(EditFilter.IncludeGpcdname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPCDNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpcdname));
		}
		
		if(EditFilter.IncludeGptitlftxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPTITLFTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gptitlftxt));
		}
		
		if(EditFilter.IncludeKinname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("KINNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Kinname));
		}
		
		if(EditFilter.IncludeName)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Name));
		}
		
		if(EditFilter.IncludeNkfnam)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NKFNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nkfnam));
		}
		
		if(EditFilter.IncludeNtitl)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NTITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ntitl));
		}
		
		if(EditFilter.IncludeNadr1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nadr1));
		}
		
		if(EditFilter.IncludeNadr2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nadr2));
		}
		
		if(EditFilter.IncludeNadr3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nadr3));
		}
		
		if(EditFilter.IncludeNadr4)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nadr4));
		}
		
		if(EditFilter.IncludeNpost)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NPOST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Npost));
		}
		
		if(EditFilter.IncludeNntel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NNTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nntel));
		}
		
		if(EditFilter.IncludeNdtel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NDTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ndtel));
		}
		
		if(EditFilter.IncludeNkmobile)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NKMOBILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nkmobile));
		}
		
		if(EditFilter.IncludeRel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rel));
		}
		
		if(EditFilter.IncludeKinreldesc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("KINRELDESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Kinreldesc));
		}
		
		if(EditFilter.IncludeSnmb)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SNMB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Snmb));
		}
		
		if(EditFilter.IncludeRemote)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REMOTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Remote));
		}
		
		if(EditFilter.IncludeHealthcat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HEALTHCAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Healthcat));
		}
		
		if(EditFilter.IncludeMedcardno)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MEDCARDNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Medcardno));
		}
		
		if(EditFilter.IncludeChartnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CHARTNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Chartnum));
		}
		
		if(EditFilter.IncludeOidtype)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OIDTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Oidtype));
		}
		
		if(EditFilter.IncludeOidval)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OIDVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Oidval));
		}
		
		if(EditFilter.IncludeCnt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CNT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cnt));
		}
		
		if(EditFilter.IncludeHarc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HARC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Harc));
		}
		
		if(EditFilter.IncludeNhsnfmtver)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NHSNFMTVER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsnfmtver));
		}
		
		if(EditFilter.IncludeNhsnfmt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NHSNFMT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsnfmt));
		}
		
		if(EditFilter.IncludeNhsnfmtvflag)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NHSNFMTVFLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsnfmtvflag));
		}
		
		if(EditFilter.IncludeNhsnver)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NHSNVER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsnver));
		}
		
		if(EditFilter.IncludeCapfnm1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CAPFNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Capfnm1));
		}
		
		if(EditFilter.IncludeGmcnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GMCNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gmcnum));
		}
		
		if(EditFilter.IncludeDelpatact)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DELPATACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Delpatact));
		}
		
		if(EditFilter.IncludeWebadt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("WEBADT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Webadt));
		}
		
		
			
		return dataString.toString();	
	}
	
	private int decodeNASMessage()
	{
		String[] items = Connection.getResponseItems(Connection.getValueAt(6));
		if(items == null)
			return 0;
		int records = items.length;
		if(records == 0)
			return 0;
					
		for(int x = 0; x < records; x++)
		{
			DemographicsRecord record = new DemographicsRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Fnm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM2"));
			record.Uppsnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UPPSNM"));
			record.Uppfnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UPPFNM"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Titltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLTXT"));
			record.Soundex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOUNDEX"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Dod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOD"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Ppsn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PPSN"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Nhsn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSN"));
			record.Csta = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CSTA"));
			record.Ploc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLOC"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Post = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POST"));
			record.Ntel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NTEL"));
			record.Dtel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTEL"));
			record.Mobile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOBILE"));
			record.Fax = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FAX"));
			record.Email = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMAIL"));
			record.Tadr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR1"));
			record.Tadr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR2"));
			record.Tadr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR3"));
			record.Tadr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR4"));
			record.Tdtel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TDTEL"));
			record.Tntel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TNTEL"));
			record.Tpost = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TPOST"));
			record.Mart = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MART"));
			record.Ethc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETHC"));
			record.Relg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELG"));
			record.Relgtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELGTXT"));
			record.Marttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MARTTXT"));
			record.Sextxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEXTXT"));
			record.Gpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCD"));
			record.Prcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRCD"));
			record.Pocc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POCC"));
			record.Poccdesc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POCCDESC"));
			record.Gpcdname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCDNAME"));
			record.Gptitlftxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPTITLFTXT"));
			record.Kinname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "KINNAME"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Nkfnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NKFNAM"));
			record.Ntitl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NTITL"));
			record.Nadr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR1"));
			record.Nadr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR2"));
			record.Nadr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR3"));
			record.Nadr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR4"));
			record.Npost = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NPOST"));
			record.Nntel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NNTEL"));
			record.Ndtel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NDTEL"));
			record.Nkmobile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NKMOBILE"));
			record.Rel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REL"));
			record.Kinreldesc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "KINRELDESC"));
			record.Snmb = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNMB"));
			record.Remote = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REMOTE"));
			record.Healthcat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HEALTHCAT"));
			record.Medcardno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDCARDNO"));
			record.Chartnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHARTNUM"));
			record.Oidtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OIDTYPE"));
			record.Oidval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OIDVAL"));
			record.Cnt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CNT"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
			record.Nhsnfmtver = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNFMTVER"));
			record.Nhsnfmt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNFMT"));
			record.Nhsnfmtvflag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNFMTVFLAG"));
			record.Nhsnver = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNVER"));
			record.Capfnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CAPFNM1"));
			record.Gmcnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GMCNUM"));
			record.Delpatact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DELPATACT"));
			record.Webadt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WEBADT"));
									
			DataCollection.add(record);
		}	
		
		return records;
	}
	private void decodeResultData()
	{
		this.lastResultData = null;
		String[] items = Connection.getResponseItems(Connection.getValueAt(6));
		if(items == null)
			return;
		int records = items.length;
		if(records == 0)
			return;
		
		String[] valueItems = Connection.splitResponseItem(items[0]);
		
		this.lastResultData = new ims.dto.ResultData();
		String attName = "";
		for(int x = 0; x < valueItems.length; x++)
		{
			attName = Connection.getAttributeName(valueItems[x]);
			this.lastResultData.add(attName, Connection.getValueFor(valueItems, attName));
		}
	}
	private int decodeNASMessageWithRepeatingGroups()
	{
		String[] items = Connection.getResponseItems(Connection.getValueAt(6));
		if(items == null)
			return 0;
		int records = items.length;
		if(records == 0)
			return 0;
			
		int recCount = 0;
		int rgCount = 0;
					
		for(int x = 0; x < records; x++)
		{
			DemographicsRecord record = new DemographicsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Fnm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM2"));
			record.Uppsnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UPPSNM"));
			record.Uppfnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UPPFNM"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Titltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLTXT"));
			record.Soundex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOUNDEX"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Dod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOD"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Ppsn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PPSN"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Nhsn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSN"));
			record.Csta = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CSTA"));
			record.Ploc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLOC"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Post = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POST"));
			record.Ntel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NTEL"));
			record.Dtel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTEL"));
			record.Mobile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOBILE"));
			record.Fax = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FAX"));
			record.Email = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMAIL"));
			record.Tadr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR1"));
			record.Tadr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR2"));
			record.Tadr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR3"));
			record.Tadr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR4"));
			record.Tdtel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TDTEL"));
			record.Tntel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TNTEL"));
			record.Tpost = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TPOST"));
			record.Mart = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MART"));
			record.Ethc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETHC"));
			record.Relg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELG"));
			record.Relgtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELGTXT"));
			record.Marttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MARTTXT"));
			record.Sextxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEXTXT"));
			record.Gpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCD"));
			record.Prcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRCD"));
			record.Pocc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POCC"));
			record.Poccdesc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POCCDESC"));
			record.Gpcdname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCDNAME"));
			record.Gptitlftxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPTITLFTXT"));
			record.Kinname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "KINNAME"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Nkfnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NKFNAM"));
			record.Ntitl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NTITL"));
			record.Nadr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR1"));
			record.Nadr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR2"));
			record.Nadr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR3"));
			record.Nadr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR4"));
			record.Npost = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NPOST"));
			record.Nntel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NNTEL"));
			record.Ndtel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NDTEL"));
			record.Nkmobile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NKMOBILE"));
			record.Rel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REL"));
			record.Kinreldesc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "KINRELDESC"));
			record.Snmb = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNMB"));
			record.Remote = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REMOTE"));
			record.Healthcat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HEALTHCAT"));
			record.Medcardno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDCARDNO"));
			record.Chartnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHARTNUM"));
			record.Oidtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OIDTYPE"));
			record.Oidval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OIDVAL"));
			record.Cnt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CNT"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
			record.Nhsnfmtver = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNFMTVER"));
			record.Nhsnfmt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNFMT"));
			record.Nhsnfmtvflag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNFMTVFLAG"));
			record.Nhsnver = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNVER"));
			record.Capfnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CAPFNM1"));
			record.Gmcnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GMCNUM"));
			record.Delpatact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DELPATACT"));
			record.Webadt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WEBADT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class DemographicsCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DemographicsRecord newRecord = new DemographicsRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DemographicsRecord record)
		{
			recordCollection.add(record);
			return count() - 1;
		}
		public void clear()
		{
			recordCollection.clear();
		}
		public int count()
		{
			return recordCollection.size();
		}
		public DemographicsRecord get(int index)
		{
			return (DemographicsRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class DemographicsRecord
	{
		public String Pkey = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Fnm2 = "";
		public String Uppsnm = "";
		public String Uppfnm = "";
		public String Titl = "";
		public String Titltxt = "";
		public String Soundex = "";
		public String Dob = "";
		public String Dod = "";
		public String Sex = "";
		public String Ppsn = "";
		public String Hospnum = "";
		public String Nhsn = "";
		public String Csta = "";
		public String Ploc = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Post = "";
		public String Ntel = "";
		public String Dtel = "";
		public String Mobile = "";
		public String Fax = "";
		public String Email = "";
		public String Tadr1 = "";
		public String Tadr2 = "";
		public String Tadr3 = "";
		public String Tadr4 = "";
		public String Tdtel = "";
		public String Tntel = "";
		public String Tpost = "";
		public String Mart = "";
		public String Ethc = "";
		public String Relg = "";
		public String Relgtxt = "";
		public String Marttxt = "";
		public String Sextxt = "";
		public String Gpcd = "";
		public String Prcd = "";
		public String Pocc = "";
		public String Poccdesc = "";
		public String Gpcdname = "";
		public String Gptitlftxt = "";
		public String Kinname = "";
		public String Name = "";
		public String Nkfnam = "";
		public String Ntitl = "";
		public String Nadr1 = "";
		public String Nadr2 = "";
		public String Nadr3 = "";
		public String Nadr4 = "";
		public String Npost = "";
		public String Nntel = "";
		public String Ndtel = "";
		public String Nkmobile = "";
		public String Rel = "";
		public String Kinreldesc = "";
		public String Snmb = "";
		public String Remote = "";
		public String Healthcat = "";
		public String Medcardno = "";
		public String Chartnum = "";
		public String Oidtype = "";
		public String Oidval = "";
		public String Cnt = "";
		public String Harc = "";
		public String Nhsnfmtver = "";
		public String Nhsnfmt = "";
		public String Nhsnfmtvflag = "";
		public String Nhsnver = "";
		public String Capfnm1 = "";
		public String Gmcnum = "";
		public String Delpatact = "";
		public String Webadt = "";
				
		
		public void clear()
		{
			Pkey = "";
			Snm = "";
			Fnm1 = "";
			Fnm2 = "";
			Uppsnm = "";
			Uppfnm = "";
			Titl = "";
			Titltxt = "";
			Soundex = "";
			Dob = "";
			Dod = "";
			Sex = "";
			Ppsn = "";
			Hospnum = "";
			Nhsn = "";
			Csta = "";
			Ploc = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Post = "";
			Ntel = "";
			Dtel = "";
			Mobile = "";
			Fax = "";
			Email = "";
			Tadr1 = "";
			Tadr2 = "";
			Tadr3 = "";
			Tadr4 = "";
			Tdtel = "";
			Tntel = "";
			Tpost = "";
			Mart = "";
			Ethc = "";
			Relg = "";
			Relgtxt = "";
			Marttxt = "";
			Sextxt = "";
			Gpcd = "";
			Prcd = "";
			Pocc = "";
			Poccdesc = "";
			Gpcdname = "";
			Gptitlftxt = "";
			Kinname = "";
			Name = "";
			Nkfnam = "";
			Ntitl = "";
			Nadr1 = "";
			Nadr2 = "";
			Nadr3 = "";
			Nadr4 = "";
			Npost = "";
			Nntel = "";
			Ndtel = "";
			Nkmobile = "";
			Rel = "";
			Kinreldesc = "";
			Snmb = "";
			Remote = "";
			Healthcat = "";
			Medcardno = "";
			Chartnum = "";
			Oidtype = "";
			Oidval = "";
			Cnt = "";
			Harc = "";
			Nhsnfmtver = "";
			Nhsnfmt = "";
			Nhsnfmtvflag = "";
			Nhsnver = "";
			Capfnm1 = "";
			Gmcnum = "";
			Delpatact = "";
			Webadt = "";
			
		}		
	}
		
		
	public final class DemographicsFilter
	{			
		public String Pkey = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Fnm2 = "";
		public String Uppsnm = "";
		public String Uppfnm = "";
		public String Titl = "";
		public String Titltxt = "";
		public String Soundex = "";
		public String Dob = "";
		public String Dod = "";
		public String Sex = "";
		public String Ppsn = "";
		public String Hospnum = "";
		public String Nhsn = "";
		public String Csta = "";
		public String Ploc = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Post = "";
		public String Ntel = "";
		public String Dtel = "";
		public String Mobile = "";
		public String Fax = "";
		public String Email = "";
		public String Tadr1 = "";
		public String Tadr2 = "";
		public String Tadr3 = "";
		public String Tadr4 = "";
		public String Tdtel = "";
		public String Tntel = "";
		public String Tpost = "";
		public String Mart = "";
		public String Ethc = "";
		public String Relg = "";
		public String Relgtxt = "";
		public String Marttxt = "";
		public String Sextxt = "";
		public String Gpcd = "";
		public String Prcd = "";
		public String Pocc = "";
		public String Poccdesc = "";
		public String Gpcdname = "";
		public String Gptitlftxt = "";
		public String Kinname = "";
		public String Name = "";
		public String Nkfnam = "";
		public String Ntitl = "";
		public String Nadr1 = "";
		public String Nadr2 = "";
		public String Nadr3 = "";
		public String Nadr4 = "";
		public String Npost = "";
		public String Nntel = "";
		public String Ndtel = "";
		public String Nkmobile = "";
		public String Rel = "";
		public String Kinreldesc = "";
		public String Snmb = "";
		public String Remote = "";
		public String Healthcat = "";
		public String Medcardno = "";
		public String Chartnum = "";
		public String Oidtype = "";
		public String Oidval = "";
		public String Cnt = "";
		public String Harc = "";
		public String Nhsnfmtver = "";
		public String Nhsnfmt = "";
		public String Nhsnfmtvflag = "";
		public String Nhsnver = "";
		public String Capfnm1 = "";
		public String Gmcnum = "";
		public String Delpatact = "";
		public String Webadt = "";
		
		public void clear()
		{				
			Pkey = "";
			Snm = "";
			Fnm1 = "";
			Fnm2 = "";
			Uppsnm = "";
			Uppfnm = "";
			Titl = "";
			Titltxt = "";
			Soundex = "";
			Dob = "";
			Dod = "";
			Sex = "";
			Ppsn = "";
			Hospnum = "";
			Nhsn = "";
			Csta = "";
			Ploc = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Post = "";
			Ntel = "";
			Dtel = "";
			Mobile = "";
			Fax = "";
			Email = "";
			Tadr1 = "";
			Tadr2 = "";
			Tadr3 = "";
			Tadr4 = "";
			Tdtel = "";
			Tntel = "";
			Tpost = "";
			Mart = "";
			Ethc = "";
			Relg = "";
			Relgtxt = "";
			Marttxt = "";
			Sextxt = "";
			Gpcd = "";
			Prcd = "";
			Pocc = "";
			Poccdesc = "";
			Gpcdname = "";
			Gptitlftxt = "";
			Kinname = "";
			Name = "";
			Nkfnam = "";
			Ntitl = "";
			Nadr1 = "";
			Nadr2 = "";
			Nadr3 = "";
			Nadr4 = "";
			Npost = "";
			Nntel = "";
			Ndtel = "";
			Nkmobile = "";
			Rel = "";
			Kinreldesc = "";
			Snmb = "";
			Remote = "";
			Healthcat = "";
			Medcardno = "";
			Chartnum = "";
			Oidtype = "";
			Oidval = "";
			Cnt = "";
			Harc = "";
			Nhsnfmtver = "";
			Nhsnfmt = "";
			Nhsnfmtvflag = "";
			Nhsnver = "";
			Capfnm1 = "";
			Gmcnum = "";
			Delpatact = "";
			Webadt = "";
		}	
		public DemographicsFilter cloneObject()
		{
			DemographicsFilter newFilter = new DemographicsFilter();
			
			newFilter.Pkey = this.Pkey;
			newFilter.Snm = this.Snm;
			newFilter.Fnm1 = this.Fnm1;
			newFilter.Fnm2 = this.Fnm2;
			newFilter.Uppsnm = this.Uppsnm;
			newFilter.Uppfnm = this.Uppfnm;
			newFilter.Titl = this.Titl;
			newFilter.Titltxt = this.Titltxt;
			newFilter.Soundex = this.Soundex;
			newFilter.Dob = this.Dob;
			newFilter.Dod = this.Dod;
			newFilter.Sex = this.Sex;
			newFilter.Ppsn = this.Ppsn;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Nhsn = this.Nhsn;
			newFilter.Csta = this.Csta;
			newFilter.Ploc = this.Ploc;
			newFilter.Adr1 = this.Adr1;
			newFilter.Adr2 = this.Adr2;
			newFilter.Adr3 = this.Adr3;
			newFilter.Adr4 = this.Adr4;
			newFilter.Post = this.Post;
			newFilter.Ntel = this.Ntel;
			newFilter.Dtel = this.Dtel;
			newFilter.Mobile = this.Mobile;
			newFilter.Fax = this.Fax;
			newFilter.Email = this.Email;
			newFilter.Tadr1 = this.Tadr1;
			newFilter.Tadr2 = this.Tadr2;
			newFilter.Tadr3 = this.Tadr3;
			newFilter.Tadr4 = this.Tadr4;
			newFilter.Tdtel = this.Tdtel;
			newFilter.Tntel = this.Tntel;
			newFilter.Tpost = this.Tpost;
			newFilter.Mart = this.Mart;
			newFilter.Ethc = this.Ethc;
			newFilter.Relg = this.Relg;
			newFilter.Relgtxt = this.Relgtxt;
			newFilter.Marttxt = this.Marttxt;
			newFilter.Sextxt = this.Sextxt;
			newFilter.Gpcd = this.Gpcd;
			newFilter.Prcd = this.Prcd;
			newFilter.Pocc = this.Pocc;
			newFilter.Poccdesc = this.Poccdesc;
			newFilter.Gpcdname = this.Gpcdname;
			newFilter.Gptitlftxt = this.Gptitlftxt;
			newFilter.Kinname = this.Kinname;
			newFilter.Name = this.Name;
			newFilter.Nkfnam = this.Nkfnam;
			newFilter.Ntitl = this.Ntitl;
			newFilter.Nadr1 = this.Nadr1;
			newFilter.Nadr2 = this.Nadr2;
			newFilter.Nadr3 = this.Nadr3;
			newFilter.Nadr4 = this.Nadr4;
			newFilter.Npost = this.Npost;
			newFilter.Nntel = this.Nntel;
			newFilter.Ndtel = this.Ndtel;
			newFilter.Nkmobile = this.Nkmobile;
			newFilter.Rel = this.Rel;
			newFilter.Kinreldesc = this.Kinreldesc;
			newFilter.Snmb = this.Snmb;
			newFilter.Remote = this.Remote;
			newFilter.Healthcat = this.Healthcat;
			newFilter.Medcardno = this.Medcardno;
			newFilter.Chartnum = this.Chartnum;
			newFilter.Oidtype = this.Oidtype;
			newFilter.Oidval = this.Oidval;
			newFilter.Cnt = this.Cnt;
			newFilter.Harc = this.Harc;
			newFilter.Nhsnfmtver = this.Nhsnfmtver;
			newFilter.Nhsnfmt = this.Nhsnfmt;
			newFilter.Nhsnfmtvflag = this.Nhsnfmtvflag;
			newFilter.Nhsnver = this.Nhsnver;
			newFilter.Capfnm1 = this.Capfnm1;
			newFilter.Gmcnum = this.Gmcnum;
			newFilter.Delpatact = this.Delpatact;
			newFilter.Webadt = this.Webadt;
			
			return newFilter;
		}
	}
	public final class DemographicsEditFilter
	{			
		public boolean IncludePkey = true;
		public boolean IncludeSnm = true;
		public boolean IncludeFnm1 = true;
		public boolean IncludeFnm2 = true;
		public boolean IncludeUppsnm = true;
		public boolean IncludeUppfnm = true;
		public boolean IncludeTitl = true;
		public boolean IncludeTitltxt = true;
		public boolean IncludeSoundex = true;
		public boolean IncludeDob = true;
		public boolean IncludeDod = true;
		public boolean IncludeSex = true;
		public boolean IncludePpsn = true;
		public boolean IncludeHospnum = true;
		public boolean IncludeNhsn = true;
		public boolean IncludeCsta = true;
		public boolean IncludePloc = true;
		public boolean IncludeAdr1 = true;
		public boolean IncludeAdr2 = true;
		public boolean IncludeAdr3 = true;
		public boolean IncludeAdr4 = true;
		public boolean IncludePost = true;
		public boolean IncludeNtel = true;
		public boolean IncludeDtel = true;
		public boolean IncludeMobile = true;
		public boolean IncludeFax = true;
		public boolean IncludeEmail = true;
		public boolean IncludeTadr1 = true;
		public boolean IncludeTadr2 = true;
		public boolean IncludeTadr3 = true;
		public boolean IncludeTadr4 = true;
		public boolean IncludeTdtel = true;
		public boolean IncludeTntel = true;
		public boolean IncludeTpost = true;
		public boolean IncludeMart = true;
		public boolean IncludeEthc = true;
		public boolean IncludeRelg = true;
		public boolean IncludeRelgtxt = true;
		public boolean IncludeMarttxt = true;
		public boolean IncludeSextxt = true;
		public boolean IncludeGpcd = true;
		public boolean IncludePrcd = true;
		public boolean IncludePocc = true;
		public boolean IncludePoccdesc = true;
		public boolean IncludeGpcdname = true;
		public boolean IncludeGptitlftxt = true;
		public boolean IncludeKinname = true;
		public boolean IncludeName = true;
		public boolean IncludeNkfnam = true;
		public boolean IncludeNtitl = true;
		public boolean IncludeNadr1 = true;
		public boolean IncludeNadr2 = true;
		public boolean IncludeNadr3 = true;
		public boolean IncludeNadr4 = true;
		public boolean IncludeNpost = true;
		public boolean IncludeNntel = true;
		public boolean IncludeNdtel = true;
		public boolean IncludeNkmobile = true;
		public boolean IncludeRel = true;
		public boolean IncludeKinreldesc = true;
		public boolean IncludeSnmb = true;
		public boolean IncludeRemote = true;
		public boolean IncludeHealthcat = true;
		public boolean IncludeMedcardno = true;
		public boolean IncludeChartnum = true;
		public boolean IncludeOidtype = true;
		public boolean IncludeOidval = true;
		public boolean IncludeCnt = true;
		public boolean IncludeHarc = true;
		public boolean IncludeNhsnfmtver = true;
		public boolean IncludeNhsnfmt = true;
		public boolean IncludeNhsnfmtvflag = true;
		public boolean IncludeNhsnver = true;
		public boolean IncludeCapfnm1 = true;
		public boolean IncludeGmcnum = true;
		public boolean IncludeDelpatact = true;
		public boolean IncludeWebadt = true;
		
		public void includeAll()
		{				
			IncludePkey = true;
			IncludeSnm = true;
			IncludeFnm1 = true;
			IncludeFnm2 = true;
			IncludeUppsnm = true;
			IncludeUppfnm = true;
			IncludeTitl = true;
			IncludeTitltxt = true;
			IncludeSoundex = true;
			IncludeDob = true;
			IncludeDod = true;
			IncludeSex = true;
			IncludePpsn = true;
			IncludeHospnum = true;
			IncludeNhsn = true;
			IncludeCsta = true;
			IncludePloc = true;
			IncludeAdr1 = true;
			IncludeAdr2 = true;
			IncludeAdr3 = true;
			IncludeAdr4 = true;
			IncludePost = true;
			IncludeNtel = true;
			IncludeDtel = true;
			IncludeMobile = true;
			IncludeFax = true;
			IncludeEmail = true;
			IncludeTadr1 = true;
			IncludeTadr2 = true;
			IncludeTadr3 = true;
			IncludeTadr4 = true;
			IncludeTdtel = true;
			IncludeTntel = true;
			IncludeTpost = true;
			IncludeMart = true;
			IncludeEthc = true;
			IncludeRelg = true;
			IncludeRelgtxt = true;
			IncludeMarttxt = true;
			IncludeSextxt = true;
			IncludeGpcd = true;
			IncludePrcd = true;
			IncludePocc = true;
			IncludePoccdesc = true;
			IncludeGpcdname = true;
			IncludeGptitlftxt = true;
			IncludeKinname = true;
			IncludeName = true;
			IncludeNkfnam = true;
			IncludeNtitl = true;
			IncludeNadr1 = true;
			IncludeNadr2 = true;
			IncludeNadr3 = true;
			IncludeNadr4 = true;
			IncludeNpost = true;
			IncludeNntel = true;
			IncludeNdtel = true;
			IncludeNkmobile = true;
			IncludeRel = true;
			IncludeKinreldesc = true;
			IncludeSnmb = true;
			IncludeRemote = true;
			IncludeHealthcat = true;
			IncludeMedcardno = true;
			IncludeChartnum = true;
			IncludeOidtype = true;
			IncludeOidval = true;
			IncludeCnt = true;
			IncludeHarc = true;
			IncludeNhsnfmtver = true;
			IncludeNhsnfmt = true;
			IncludeNhsnfmtvflag = true;
			IncludeNhsnver = true;
			IncludeCapfnm1 = true;
			IncludeGmcnum = true;
			IncludeDelpatact = true;
			IncludeWebadt = true;
		}	
		public void excludeAll()
		{				
			IncludePkey = false;
			IncludeSnm = false;
			IncludeFnm1 = false;
			IncludeFnm2 = false;
			IncludeUppsnm = false;
			IncludeUppfnm = false;
			IncludeTitl = false;
			IncludeTitltxt = false;
			IncludeSoundex = false;
			IncludeDob = false;
			IncludeDod = false;
			IncludeSex = false;
			IncludePpsn = false;
			IncludeHospnum = false;
			IncludeNhsn = false;
			IncludeCsta = false;
			IncludePloc = false;
			IncludeAdr1 = false;
			IncludeAdr2 = false;
			IncludeAdr3 = false;
			IncludeAdr4 = false;
			IncludePost = false;
			IncludeNtel = false;
			IncludeDtel = false;
			IncludeMobile = false;
			IncludeFax = false;
			IncludeEmail = false;
			IncludeTadr1 = false;
			IncludeTadr2 = false;
			IncludeTadr3 = false;
			IncludeTadr4 = false;
			IncludeTdtel = false;
			IncludeTntel = false;
			IncludeTpost = false;
			IncludeMart = false;
			IncludeEthc = false;
			IncludeRelg = false;
			IncludeRelgtxt = false;
			IncludeMarttxt = false;
			IncludeSextxt = false;
			IncludeGpcd = false;
			IncludePrcd = false;
			IncludePocc = false;
			IncludePoccdesc = false;
			IncludeGpcdname = false;
			IncludeGptitlftxt = false;
			IncludeKinname = false;
			IncludeName = false;
			IncludeNkfnam = false;
			IncludeNtitl = false;
			IncludeNadr1 = false;
			IncludeNadr2 = false;
			IncludeNadr3 = false;
			IncludeNadr4 = false;
			IncludeNpost = false;
			IncludeNntel = false;
			IncludeNdtel = false;
			IncludeNkmobile = false;
			IncludeRel = false;
			IncludeKinreldesc = false;
			IncludeSnmb = false;
			IncludeRemote = false;
			IncludeHealthcat = false;
			IncludeMedcardno = false;
			IncludeChartnum = false;
			IncludeOidtype = false;
			IncludeOidval = false;
			IncludeCnt = false;
			IncludeHarc = false;
			IncludeNhsnfmtver = false;
			IncludeNhsnfmt = false;
			IncludeNhsnfmtvflag = false;
			IncludeNhsnver = false;
			IncludeCapfnm1 = false;
			IncludeGmcnum = false;
			IncludeDelpatact = false;
			IncludeWebadt = false;
		}
		public DemographicsEditFilter cloneObject()
		{
			DemographicsEditFilter newEditFilter = new DemographicsEditFilter();
			
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeSnm = this.IncludeSnm;
			newEditFilter.IncludeFnm1 = this.IncludeFnm1;
			newEditFilter.IncludeFnm2 = this.IncludeFnm2;
			newEditFilter.IncludeUppsnm = this.IncludeUppsnm;
			newEditFilter.IncludeUppfnm = this.IncludeUppfnm;
			newEditFilter.IncludeTitl = this.IncludeTitl;
			newEditFilter.IncludeTitltxt = this.IncludeTitltxt;
			newEditFilter.IncludeSoundex = this.IncludeSoundex;
			newEditFilter.IncludeDob = this.IncludeDob;
			newEditFilter.IncludeDod = this.IncludeDod;
			newEditFilter.IncludeSex = this.IncludeSex;
			newEditFilter.IncludePpsn = this.IncludePpsn;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeNhsn = this.IncludeNhsn;
			newEditFilter.IncludeCsta = this.IncludeCsta;
			newEditFilter.IncludePloc = this.IncludePloc;
			newEditFilter.IncludeAdr1 = this.IncludeAdr1;
			newEditFilter.IncludeAdr2 = this.IncludeAdr2;
			newEditFilter.IncludeAdr3 = this.IncludeAdr3;
			newEditFilter.IncludeAdr4 = this.IncludeAdr4;
			newEditFilter.IncludePost = this.IncludePost;
			newEditFilter.IncludeNtel = this.IncludeNtel;
			newEditFilter.IncludeDtel = this.IncludeDtel;
			newEditFilter.IncludeMobile = this.IncludeMobile;
			newEditFilter.IncludeFax = this.IncludeFax;
			newEditFilter.IncludeEmail = this.IncludeEmail;
			newEditFilter.IncludeTadr1 = this.IncludeTadr1;
			newEditFilter.IncludeTadr2 = this.IncludeTadr2;
			newEditFilter.IncludeTadr3 = this.IncludeTadr3;
			newEditFilter.IncludeTadr4 = this.IncludeTadr4;
			newEditFilter.IncludeTdtel = this.IncludeTdtel;
			newEditFilter.IncludeTntel = this.IncludeTntel;
			newEditFilter.IncludeTpost = this.IncludeTpost;
			newEditFilter.IncludeMart = this.IncludeMart;
			newEditFilter.IncludeEthc = this.IncludeEthc;
			newEditFilter.IncludeRelg = this.IncludeRelg;
			newEditFilter.IncludeRelgtxt = this.IncludeRelgtxt;
			newEditFilter.IncludeMarttxt = this.IncludeMarttxt;
			newEditFilter.IncludeSextxt = this.IncludeSextxt;
			newEditFilter.IncludeGpcd = this.IncludeGpcd;
			newEditFilter.IncludePrcd = this.IncludePrcd;
			newEditFilter.IncludePocc = this.IncludePocc;
			newEditFilter.IncludePoccdesc = this.IncludePoccdesc;
			newEditFilter.IncludeGpcdname = this.IncludeGpcdname;
			newEditFilter.IncludeGptitlftxt = this.IncludeGptitlftxt;
			newEditFilter.IncludeKinname = this.IncludeKinname;
			newEditFilter.IncludeName = this.IncludeName;
			newEditFilter.IncludeNkfnam = this.IncludeNkfnam;
			newEditFilter.IncludeNtitl = this.IncludeNtitl;
			newEditFilter.IncludeNadr1 = this.IncludeNadr1;
			newEditFilter.IncludeNadr2 = this.IncludeNadr2;
			newEditFilter.IncludeNadr3 = this.IncludeNadr3;
			newEditFilter.IncludeNadr4 = this.IncludeNadr4;
			newEditFilter.IncludeNpost = this.IncludeNpost;
			newEditFilter.IncludeNntel = this.IncludeNntel;
			newEditFilter.IncludeNdtel = this.IncludeNdtel;
			newEditFilter.IncludeNkmobile = this.IncludeNkmobile;
			newEditFilter.IncludeRel = this.IncludeRel;
			newEditFilter.IncludeKinreldesc = this.IncludeKinreldesc;
			newEditFilter.IncludeSnmb = this.IncludeSnmb;
			newEditFilter.IncludeRemote = this.IncludeRemote;
			newEditFilter.IncludeHealthcat = this.IncludeHealthcat;
			newEditFilter.IncludeMedcardno = this.IncludeMedcardno;
			newEditFilter.IncludeChartnum = this.IncludeChartnum;
			newEditFilter.IncludeOidtype = this.IncludeOidtype;
			newEditFilter.IncludeOidval = this.IncludeOidval;
			newEditFilter.IncludeCnt = this.IncludeCnt;
			newEditFilter.IncludeHarc = this.IncludeHarc;
			newEditFilter.IncludeNhsnfmtver = this.IncludeNhsnfmtver;
			newEditFilter.IncludeNhsnfmt = this.IncludeNhsnfmt;
			newEditFilter.IncludeNhsnfmtvflag = this.IncludeNhsnfmtvflag;
			newEditFilter.IncludeNhsnver = this.IncludeNhsnver;
			newEditFilter.IncludeCapfnm1 = this.IncludeCapfnm1;
			newEditFilter.IncludeGmcnum = this.IncludeGmcnum;
			newEditFilter.IncludeDelpatact = this.IncludeDelpatact;
			newEditFilter.IncludeWebadt = this.IncludeWebadt;
			
			return newEditFilter;
		}
	}
}
