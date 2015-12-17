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

public final class Doctype implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Doctype.class);
	
	private DoctypeFilter lastGetFilter = null;
	private final String serviceName = "DOCTYPE";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public DoctypeFilter Filter = new DoctypeFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public DoctypeEditFilter EditFilter = new DoctypeEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public DoctypeCollection DataCollection = new DoctypeCollection();

	/**
	 * Creates a new Doctype Data Transfer Object.
	 */ 
	public Doctype(ims.dto.Connection connection)
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
	public Doctype cloneObject()
	{
		Doctype cloneObject = new Doctype(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Doc_id = DataCollection.get(x).Doc_id;
			cloneObject.DataCollection.get(index).Doc_cat = DataCollection.get(x).Doc_cat;
			cloneObject.DataCollection.get(index).Doc_name = DataCollection.get(x).Doc_name;
			cloneObject.DataCollection.get(index).Doc_flds_id = DataCollection.get(x).Doc_flds_id;
			cloneObject.DataCollection.get(index).Doc_spec = DataCollection.get(x).Doc_spec;
			cloneObject.DataCollection.get(index).Doc_user = DataCollection.get(x).Doc_user;
			cloneObject.DataCollection.get(index).Doc_stat = DataCollection.get(x).Doc_stat;
			cloneObject.DataCollection.get(index).Inactfilter = DataCollection.get(x).Inactfilter;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Doc_script = DataCollection.get(x).Doc_script;
			cloneObject.DataCollection.get(index).Tmpl_content = DataCollection.get(x).Tmpl_content;
			cloneObject.DataCollection.get(index).Leftmargin = DataCollection.get(x).Leftmargin;
			cloneObject.DataCollection.get(index).Rightmargin = DataCollection.get(x).Rightmargin;
			cloneObject.DataCollection.get(index).Topmargin = DataCollection.get(x).Topmargin;
			cloneObject.DataCollection.get(index).Bottommargin = DataCollection.get(x).Bottommargin;
			cloneObject.DataCollection.get(index).Papersize = DataCollection.get(x).Papersize;
			cloneObject.DataCollection.get(index).Orientation = DataCollection.get(x).Orientation;
			cloneObject.DataCollection.get(index).Doc_script_prj = DataCollection.get(x).Doc_script_prj;
			cloneObject.DataCollection.get(index).Headerfooter = DataCollection.get(x).Headerfooter;
			cloneObject.DataCollection.get(index).Section = DataCollection.get(x).Section;
			cloneObject.DataCollection.get(index).Doc_cattxt = DataCollection.get(x).Doc_cattxt;
			cloneObject.DataCollection.get(index).Doc_spectxt = DataCollection.get(x).Doc_spectxt;
			cloneObject.DataCollection.get(index).Doc_templ = DataCollection.get(x).Doc_templ;
			cloneObject.DataCollection.get(index).Doc_sfile = DataCollection.get(x).Doc_sfile;
			cloneObject.DataCollection.get(index).Doc_sprjfile = DataCollection.get(x).Doc_sprjfile;
			cloneObject.DataCollection.get(index).Doc_dfile = DataCollection.get(x).Doc_dfile;
			cloneObject.DataCollection.get(index).Tmpl_type = DataCollection.get(x).Tmpl_type;
			cloneObject.DataCollection.get(index).Script_type = DataCollection.get(x).Script_type;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.1.14.4 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Doctype.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doctype.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Doctype.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doctype.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doctype.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doctype.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Doctype.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Doctype.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doctype.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Doctype.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Doctype.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Doctype.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Doctype.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Doctype.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doctype.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Doctype.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Doctype.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Doctype.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Doctype.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Doctype.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doctype.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Doctype.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Doctype.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doctype.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Doctype.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Doctype.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Doctype.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Doctype nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Doctype After NextList ");
				
		decodeNASMessage();		
		logger.debug("Doctype After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doctype.List");
							
		listInProgress = true;	
		logger.debug("Doctype Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Doctype After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Doctype After Parse Message");
		
						
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
	private String encodeNASFilter(DoctypeFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Doc_id != null && filter.Doc_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_id);
		}
		
		if(Filter.Doc_cat != null && filter.Doc_cat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_CAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_cat);
		}
		
		if(Filter.Doc_name != null && filter.Doc_name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_name);
		}
		
		if(Filter.Doc_flds_id != null && filter.Doc_flds_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_FLDS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_flds_id);
		}
		
		if(Filter.Doc_spec != null && filter.Doc_spec.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_SPEC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_spec);
		}
		
		if(Filter.Doc_user != null && filter.Doc_user.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_USER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_user);
		}
		
		if(Filter.Doc_stat != null && filter.Doc_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_stat);
		}
		
		if(Filter.Inactfilter != null && filter.Inactfilter.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INACTFILTER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Inactfilter);
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
		}
		
		if(Filter.Doc_script != null && filter.Doc_script.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_SCRIPT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_script);
		}
		
		if(Filter.Tmpl_content != null && filter.Tmpl_content.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TMPL_CONTENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tmpl_content);
		}
		
		if(Filter.Leftmargin != null && filter.Leftmargin.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LEFTMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Leftmargin);
		}
		
		if(Filter.Rightmargin != null && filter.Rightmargin.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RIGHTMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rightmargin);
		}
		
		if(Filter.Topmargin != null && filter.Topmargin.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TOPMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Topmargin);
		}
		
		if(Filter.Bottommargin != null && filter.Bottommargin.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("BOTTOMMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Bottommargin);
		}
		
		if(Filter.Papersize != null && filter.Papersize.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PAPERSIZE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Papersize);
		}
		
		if(Filter.Orientation != null && filter.Orientation.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ORIENTATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Orientation);
		}
		
		if(Filter.Doc_script_prj != null && filter.Doc_script_prj.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_SCRIPT_PRJ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_script_prj);
		}
		
		if(Filter.Headerfooter != null && filter.Headerfooter.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HEADERFOOTER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Headerfooter);
		}
		
		if(Filter.Section != null && filter.Section.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SECTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Section);
		}
		
		if(Filter.Doc_cattxt != null && filter.Doc_cattxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_CATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_cattxt);
		}
		
		if(Filter.Doc_spectxt != null && filter.Doc_spectxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_SPECTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_spectxt);
		}
		
		if(Filter.Doc_templ != null && filter.Doc_templ.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_TEMPL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_templ);
		}
		
		if(Filter.Doc_sfile != null && filter.Doc_sfile.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_SFILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_sfile);
		}
		
		if(Filter.Doc_sprjfile != null && filter.Doc_sprjfile.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_SPRJFILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_sprjfile);
		}
		
		if(Filter.Doc_dfile != null && filter.Doc_dfile.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOC_DFILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_dfile);
		}
		
		if(Filter.Tmpl_type != null && filter.Tmpl_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TMPL_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tmpl_type);
		}
		
		if(Filter.Script_type != null && filter.Script_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCRIPT_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Script_type);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		DoctypeRecord data = (DoctypeRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeDoc_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_id));
		}
		
		if(EditFilter.IncludeDoc_cat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_CAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_cat));
		}
		
		if(EditFilter.IncludeDoc_name)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_name));
		}
		
		if(EditFilter.IncludeDoc_flds_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_FLDS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_flds_id));
		}
		
		if(EditFilter.IncludeDoc_spec)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_SPEC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_spec));
		}
		
		if(EditFilter.IncludeDoc_user)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_USER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_user));
		}
		
		if(EditFilter.IncludeDoc_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_stat));
		}
		
		if(EditFilter.IncludeInactfilter)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INACTFILTER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Inactfilter));
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
		}
		
		if(EditFilter.IncludeDoc_script)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_SCRIPT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_script));
		}
		
		if(EditFilter.IncludeTmpl_content)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TMPL_CONTENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tmpl_content));
		}
		
		if(EditFilter.IncludeLeftmargin)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LEFTMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Leftmargin));
		}
		
		if(EditFilter.IncludeRightmargin)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RIGHTMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rightmargin));
		}
		
		if(EditFilter.IncludeTopmargin)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TOPMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Topmargin));
		}
		
		if(EditFilter.IncludeBottommargin)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("BOTTOMMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Bottommargin));
		}
		
		if(EditFilter.IncludePapersize)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PAPERSIZE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Papersize));
		}
		
		if(EditFilter.IncludeOrientation)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ORIENTATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Orientation));
		}
		
		if(EditFilter.IncludeDoc_script_prj)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_SCRIPT_PRJ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_script_prj));
		}
		
		if(EditFilter.IncludeHeaderfooter)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HEADERFOOTER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Headerfooter));
		}
		
		if(EditFilter.IncludeSection)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SECTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Section));
		}
		
		if(EditFilter.IncludeDoc_cattxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_CATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_cattxt));
		}
		
		if(EditFilter.IncludeDoc_spectxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_SPECTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_spectxt));
		}
		
		if(EditFilter.IncludeDoc_templ)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_TEMPL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_templ));
		}
		
		if(EditFilter.IncludeDoc_sfile)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_SFILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_sfile));
		}
		
		if(EditFilter.IncludeDoc_sprjfile)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_SPRJFILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_sprjfile));
		}
		
		if(EditFilter.IncludeDoc_dfile)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOC_DFILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_dfile));
		}
		
		if(EditFilter.IncludeTmpl_type)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TMPL_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tmpl_type));
		}
		
		if(EditFilter.IncludeScript_type)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCRIPT_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Script_type));
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
			DoctypeRecord record = new DoctypeRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Doc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_ID"));
			record.Doc_cat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_CAT"));
			record.Doc_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_NAME"));
			record.Doc_flds_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_FLDS_ID"));
			record.Doc_spec = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_SPEC"));
			record.Doc_user = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_USER"));
			record.Doc_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_STAT"));
			record.Inactfilter = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INACTFILTER"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Doc_script = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_SCRIPT"));
			record.Tmpl_content = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TMPL_CONTENT"));
			record.Leftmargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LEFTMARGIN"));
			record.Rightmargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RIGHTMARGIN"));
			record.Topmargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TOPMARGIN"));
			record.Bottommargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BOTTOMMARGIN"));
			record.Papersize = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAPERSIZE"));
			record.Orientation = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORIENTATION"));
			record.Doc_script_prj = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_SCRIPT_PRJ"));
			record.Headerfooter = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HEADERFOOTER"));
			record.Section = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SECTION"));
			record.Doc_cattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_CATTXT"));
			record.Doc_spectxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_SPECTXT"));
			record.Doc_templ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_TEMPL"));
			record.Doc_sfile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_SFILE"));
			record.Doc_sprjfile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_SPRJFILE"));
			record.Doc_dfile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_DFILE"));
			record.Tmpl_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TMPL_TYPE"));
			record.Script_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCRIPT_TYPE"));
									
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
			DoctypeRecord record = new DoctypeRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Doc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_ID"));
			record.Doc_cat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_CAT"));
			record.Doc_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_NAME"));
			record.Doc_flds_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_FLDS_ID"));
			record.Doc_spec = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_SPEC"));
			record.Doc_user = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_USER"));
			record.Doc_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_STAT"));
			record.Inactfilter = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INACTFILTER"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Doc_script = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_SCRIPT"));
			record.Tmpl_content = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TMPL_CONTENT"));
			record.Leftmargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LEFTMARGIN"));
			record.Rightmargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RIGHTMARGIN"));
			record.Topmargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TOPMARGIN"));
			record.Bottommargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BOTTOMMARGIN"));
			record.Papersize = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAPERSIZE"));
			record.Orientation = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORIENTATION"));
			record.Doc_script_prj = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_SCRIPT_PRJ"));
			record.Headerfooter = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HEADERFOOTER"));
			record.Section = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SECTION"));
			record.Doc_cattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_CATTXT"));
			record.Doc_spectxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_SPECTXT"));
			record.Doc_templ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_TEMPL"));
			record.Doc_sfile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_SFILE"));
			record.Doc_sprjfile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_SPRJFILE"));
			record.Doc_dfile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_DFILE"));
			record.Tmpl_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TMPL_TYPE"));
			record.Script_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCRIPT_TYPE"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class DoctypeCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DoctypeRecord newRecord = new DoctypeRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DoctypeRecord record)
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
		public DoctypeRecord get(int index)
		{
			return (DoctypeRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class DoctypeRecord
	{
		public String Doc_id = "";
		public String Doc_cat = "";
		public String Doc_name = "";
		public String Doc_flds_id = "";
		public String Doc_spec = "";
		public String Doc_user = "";
		public String Doc_stat = "";
		public String Inactfilter = "";
		public String Tstp = "";
		public String Doc_script = "";
		public String Tmpl_content = "";
		public String Leftmargin = "";
		public String Rightmargin = "";
		public String Topmargin = "";
		public String Bottommargin = "";
		public String Papersize = "";
		public String Orientation = "";
		public String Doc_script_prj = "";
		public String Headerfooter = "";
		public String Section = "";
		public String Doc_cattxt = "";
		public String Doc_spectxt = "";
		public String Doc_templ = "";
		public String Doc_sfile = "";
		public String Doc_sprjfile = "";
		public String Doc_dfile = "";
		public String Tmpl_type = "";
		public String Script_type = "";
				
		
		public void clear()
		{
			Doc_id = "";
			Doc_cat = "";
			Doc_name = "";
			Doc_flds_id = "";
			Doc_spec = "";
			Doc_user = "";
			Doc_stat = "";
			Inactfilter = "";
			Tstp = "";
			Doc_script = "";
			Tmpl_content = "";
			Leftmargin = "";
			Rightmargin = "";
			Topmargin = "";
			Bottommargin = "";
			Papersize = "";
			Orientation = "";
			Doc_script_prj = "";
			Headerfooter = "";
			Section = "";
			Doc_cattxt = "";
			Doc_spectxt = "";
			Doc_templ = "";
			Doc_sfile = "";
			Doc_sprjfile = "";
			Doc_dfile = "";
			Tmpl_type = "";
			Script_type = "";
			
		}		
	}
		
		
	public final class DoctypeFilter
	{			
		public String Doc_id = "";
		public String Doc_cat = "";
		public String Doc_name = "";
		public String Doc_flds_id = "";
		public String Doc_spec = "";
		public String Doc_user = "";
		public String Doc_stat = "";
		public String Inactfilter = "";
		public String Tstp = "";
		public String Doc_script = "";
		public String Tmpl_content = "";
		public String Leftmargin = "";
		public String Rightmargin = "";
		public String Topmargin = "";
		public String Bottommargin = "";
		public String Papersize = "";
		public String Orientation = "";
		public String Doc_script_prj = "";
		public String Headerfooter = "";
		public String Section = "";
		public String Doc_cattxt = "";
		public String Doc_spectxt = "";
		public String Doc_templ = "";
		public String Doc_sfile = "";
		public String Doc_sprjfile = "";
		public String Doc_dfile = "";
		public String Tmpl_type = "";
		public String Script_type = "";
		
		public void clear()
		{				
			Doc_id = "";
			Doc_cat = "";
			Doc_name = "";
			Doc_flds_id = "";
			Doc_spec = "";
			Doc_user = "";
			Doc_stat = "";
			Inactfilter = "";
			Tstp = "";
			Doc_script = "";
			Tmpl_content = "";
			Leftmargin = "";
			Rightmargin = "";
			Topmargin = "";
			Bottommargin = "";
			Papersize = "";
			Orientation = "";
			Doc_script_prj = "";
			Headerfooter = "";
			Section = "";
			Doc_cattxt = "";
			Doc_spectxt = "";
			Doc_templ = "";
			Doc_sfile = "";
			Doc_sprjfile = "";
			Doc_dfile = "";
			Tmpl_type = "";
			Script_type = "";
		}	
		public DoctypeFilter cloneObject()
		{
			DoctypeFilter newFilter = new DoctypeFilter();
			
			newFilter.Doc_id = this.Doc_id;
			newFilter.Doc_cat = this.Doc_cat;
			newFilter.Doc_name = this.Doc_name;
			newFilter.Doc_flds_id = this.Doc_flds_id;
			newFilter.Doc_spec = this.Doc_spec;
			newFilter.Doc_user = this.Doc_user;
			newFilter.Doc_stat = this.Doc_stat;
			newFilter.Inactfilter = this.Inactfilter;
			newFilter.Tstp = this.Tstp;
			newFilter.Doc_script = this.Doc_script;
			newFilter.Tmpl_content = this.Tmpl_content;
			newFilter.Leftmargin = this.Leftmargin;
			newFilter.Rightmargin = this.Rightmargin;
			newFilter.Topmargin = this.Topmargin;
			newFilter.Bottommargin = this.Bottommargin;
			newFilter.Papersize = this.Papersize;
			newFilter.Orientation = this.Orientation;
			newFilter.Doc_script_prj = this.Doc_script_prj;
			newFilter.Headerfooter = this.Headerfooter;
			newFilter.Section = this.Section;
			newFilter.Doc_cattxt = this.Doc_cattxt;
			newFilter.Doc_spectxt = this.Doc_spectxt;
			newFilter.Doc_templ = this.Doc_templ;
			newFilter.Doc_sfile = this.Doc_sfile;
			newFilter.Doc_sprjfile = this.Doc_sprjfile;
			newFilter.Doc_dfile = this.Doc_dfile;
			newFilter.Tmpl_type = this.Tmpl_type;
			newFilter.Script_type = this.Script_type;
			
			return newFilter;
		}
	}
	public final class DoctypeEditFilter
	{			
		public boolean IncludeDoc_id = true;
		public boolean IncludeDoc_cat = true;
		public boolean IncludeDoc_name = true;
		public boolean IncludeDoc_flds_id = true;
		public boolean IncludeDoc_spec = true;
		public boolean IncludeDoc_user = true;
		public boolean IncludeDoc_stat = true;
		public boolean IncludeInactfilter = true;
		public boolean IncludeTstp = true;
		public boolean IncludeDoc_script = true;
		public boolean IncludeTmpl_content = true;
		public boolean IncludeLeftmargin = true;
		public boolean IncludeRightmargin = true;
		public boolean IncludeTopmargin = true;
		public boolean IncludeBottommargin = true;
		public boolean IncludePapersize = true;
		public boolean IncludeOrientation = true;
		public boolean IncludeDoc_script_prj = true;
		public boolean IncludeHeaderfooter = true;
		public boolean IncludeSection = true;
		public boolean IncludeDoc_cattxt = true;
		public boolean IncludeDoc_spectxt = true;
		public boolean IncludeDoc_templ = true;
		public boolean IncludeDoc_sfile = true;
		public boolean IncludeDoc_sprjfile = true;
		public boolean IncludeDoc_dfile = true;
		public boolean IncludeTmpl_type = true;
		public boolean IncludeScript_type = true;
		
		public void includeAll()
		{				
			IncludeDoc_id = true;
			IncludeDoc_cat = true;
			IncludeDoc_name = true;
			IncludeDoc_flds_id = true;
			IncludeDoc_spec = true;
			IncludeDoc_user = true;
			IncludeDoc_stat = true;
			IncludeInactfilter = true;
			IncludeTstp = true;
			IncludeDoc_script = true;
			IncludeTmpl_content = true;
			IncludeLeftmargin = true;
			IncludeRightmargin = true;
			IncludeTopmargin = true;
			IncludeBottommargin = true;
			IncludePapersize = true;
			IncludeOrientation = true;
			IncludeDoc_script_prj = true;
			IncludeHeaderfooter = true;
			IncludeSection = true;
			IncludeDoc_cattxt = true;
			IncludeDoc_spectxt = true;
			IncludeDoc_templ = true;
			IncludeDoc_sfile = true;
			IncludeDoc_sprjfile = true;
			IncludeDoc_dfile = true;
			IncludeTmpl_type = true;
			IncludeScript_type = true;
		}	
		public void excludeAll()
		{				
			IncludeDoc_id = false;
			IncludeDoc_cat = false;
			IncludeDoc_name = false;
			IncludeDoc_flds_id = false;
			IncludeDoc_spec = false;
			IncludeDoc_user = false;
			IncludeDoc_stat = false;
			IncludeInactfilter = false;
			IncludeTstp = false;
			IncludeDoc_script = false;
			IncludeTmpl_content = false;
			IncludeLeftmargin = false;
			IncludeRightmargin = false;
			IncludeTopmargin = false;
			IncludeBottommargin = false;
			IncludePapersize = false;
			IncludeOrientation = false;
			IncludeDoc_script_prj = false;
			IncludeHeaderfooter = false;
			IncludeSection = false;
			IncludeDoc_cattxt = false;
			IncludeDoc_spectxt = false;
			IncludeDoc_templ = false;
			IncludeDoc_sfile = false;
			IncludeDoc_sprjfile = false;
			IncludeDoc_dfile = false;
			IncludeTmpl_type = false;
			IncludeScript_type = false;
		}
		public DoctypeEditFilter cloneObject()
		{
			DoctypeEditFilter newEditFilter = new DoctypeEditFilter();
			
			newEditFilter.IncludeDoc_id = this.IncludeDoc_id;
			newEditFilter.IncludeDoc_cat = this.IncludeDoc_cat;
			newEditFilter.IncludeDoc_name = this.IncludeDoc_name;
			newEditFilter.IncludeDoc_flds_id = this.IncludeDoc_flds_id;
			newEditFilter.IncludeDoc_spec = this.IncludeDoc_spec;
			newEditFilter.IncludeDoc_user = this.IncludeDoc_user;
			newEditFilter.IncludeDoc_stat = this.IncludeDoc_stat;
			newEditFilter.IncludeInactfilter = this.IncludeInactfilter;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeDoc_script = this.IncludeDoc_script;
			newEditFilter.IncludeTmpl_content = this.IncludeTmpl_content;
			newEditFilter.IncludeLeftmargin = this.IncludeLeftmargin;
			newEditFilter.IncludeRightmargin = this.IncludeRightmargin;
			newEditFilter.IncludeTopmargin = this.IncludeTopmargin;
			newEditFilter.IncludeBottommargin = this.IncludeBottommargin;
			newEditFilter.IncludePapersize = this.IncludePapersize;
			newEditFilter.IncludeOrientation = this.IncludeOrientation;
			newEditFilter.IncludeDoc_script_prj = this.IncludeDoc_script_prj;
			newEditFilter.IncludeHeaderfooter = this.IncludeHeaderfooter;
			newEditFilter.IncludeSection = this.IncludeSection;
			newEditFilter.IncludeDoc_cattxt = this.IncludeDoc_cattxt;
			newEditFilter.IncludeDoc_spectxt = this.IncludeDoc_spectxt;
			newEditFilter.IncludeDoc_templ = this.IncludeDoc_templ;
			newEditFilter.IncludeDoc_sfile = this.IncludeDoc_sfile;
			newEditFilter.IncludeDoc_sprjfile = this.IncludeDoc_sprjfile;
			newEditFilter.IncludeDoc_dfile = this.IncludeDoc_dfile;
			newEditFilter.IncludeTmpl_type = this.IncludeTmpl_type;
			newEditFilter.IncludeScript_type = this.IncludeScript_type;
			
			return newEditFilter;
		}
	}
}
