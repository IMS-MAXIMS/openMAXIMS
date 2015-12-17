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

public final class Sd_sess_avail implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_sess_avail.class);
	
	private Sd_sess_availFilter lastGetFilter = null;
	private final String serviceName = "SD_SESS_AVAIL";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_sess_availFilter Filter = new Sd_sess_availFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_sess_availEditFilter EditFilter = new Sd_sess_availEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_sess_availCollection DataCollection = new Sd_sess_availCollection();

	/**
	 * Creates a new Sd_sess_avail Data Transfer Object.
	 */ 
	public Sd_sess_avail(ims.dto.Connection connection)
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
	public Sd_sess_avail cloneObject()
	{
		Sd_sess_avail cloneObject = new Sd_sess_avail(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Sess_dt = DataCollection.get(x).Sess_dt;
			cloneObject.DataCollection.get(index).Total_tm = DataCollection.get(x).Total_tm;
			cloneObject.DataCollection.get(index).Rem_tm = DataCollection.get(x).Rem_tm;
			cloneObject.DataCollection.get(index).Sessd_stat = DataCollection.get(x).Sessd_stat;
			cloneObject.DataCollection.get(index).Sessd_act_ind = DataCollection.get(x).Sessd_act_ind;
			cloneObject.DataCollection.get(index).Grp_id = DataCollection.get(x).Grp_id;
			cloneObject.DataCollection.get(index).Activ_id = DataCollection.get(x).Activ_id;
			cloneObject.DataCollection.get(index).Lo_id = DataCollection.get(x).Lo_id;
			cloneObject.DataCollection.get(index).Lo_sessiond_id = DataCollection.get(x).Lo_sessiond_id;
			cloneObject.DataCollection.get(index).Lo_act_ind = DataCollection.get(x).Lo_act_ind;
			cloneObject.DataCollection.get(index).Mc_id = DataCollection.get(x).Mc_id;
			cloneObject.DataCollection.get(index).Act_id = DataCollection.get(x).Act_id;
			cloneObject.DataCollection.get(index).Act_sessiond_id = DataCollection.get(x).Act_sessiond_id;
			cloneObject.DataCollection.get(index).Action_act_ind = DataCollection.get(x).Action_act_ind;
			cloneObject.DataCollection.get(index).Max_apps = DataCollection.get(x).Max_apps;
			cloneObject.DataCollection.get(index).Rem_apps = DataCollection.get(x).Rem_apps;
			cloneObject.DataCollection.get(index).Session_id = DataCollection.get(x).Session_id;
			cloneObject.DataCollection.get(index).Sessiond_id = DataCollection.get(x).Sessiond_id;
			cloneObject.DataCollection.get(index).Sessiond_ids = DataCollection.get(x).Sessiond_ids;
							
			
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
		return "Sd_sess_avail.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_avail.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_sess_avail.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_avail.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_avail.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_avail.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_sess_avail.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_sess_avail.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_avail.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_sess_avail.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_sess_avail.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_sess_avail.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_sess_avail.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_sess_avail.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_avail.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_sess_avail.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_sess_avail.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_sess_avail.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_sess_avail.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_sess_avail.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_avail.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_sess_avail.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_sess_avail.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_avail.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_sess_avail.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_sess_avail.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_sess_avail.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_sess_avail nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_sess_avail After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_sess_avail After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_avail.List");
							
		listInProgress = true;	
		logger.debug("Sd_sess_avail Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_sess_avail After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_sess_avail After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_sess_availFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Sess_dt != null && filter.Sess_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SESS_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sess_dt);
		}
		
		if(Filter.Total_tm != null && filter.Total_tm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TOTAL_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Total_tm);
		}
		
		if(Filter.Rem_tm != null && filter.Rem_tm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REM_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rem_tm);
		}
		
		if(Filter.Sessd_stat != null && filter.Sessd_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SESSD_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sessd_stat);
		}
		
		if(Filter.Sessd_act_ind != null && filter.Sessd_act_ind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SESSD_ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sessd_act_ind);
		}
		
		if(Filter.Grp_id != null && filter.Grp_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GRP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Grp_id);
		}
		
		if(Filter.Activ_id != null && filter.Activ_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activ_id);
		}
		
		if(Filter.Lo_id != null && filter.Lo_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LO_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lo_id);
		}
		
		if(Filter.Lo_sessiond_id != null && filter.Lo_sessiond_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LO_SESSIOND_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lo_sessiond_id);
		}
		
		if(Filter.Lo_act_ind != null && filter.Lo_act_ind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LO_ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lo_act_ind);
		}
		
		if(Filter.Mc_id != null && filter.Mc_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_id);
		}
		
		if(Filter.Act_id != null && filter.Act_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_id);
		}
		
		if(Filter.Act_sessiond_id != null && filter.Act_sessiond_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_SESSIOND_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_sessiond_id);
		}
		
		if(Filter.Action_act_ind != null && filter.Action_act_ind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTION_ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Action_act_ind);
		}
		
		if(Filter.Max_apps != null && filter.Max_apps.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MAX_APPS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Max_apps);
		}
		
		if(Filter.Rem_apps != null && filter.Rem_apps.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REM_APPS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rem_apps);
		}
		
		if(Filter.Session_id != null && filter.Session_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SESSION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Session_id);
		}
		
		if(Filter.Sessiond_id != null && filter.Sessiond_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SESSIOND_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sessiond_id);
		}
		
		if(Filter.Sessiond_ids != null && filter.Sessiond_ids.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SESSIOND_IDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sessiond_ids);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_sess_availRecord data = (Sd_sess_availRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeSess_dt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESS_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sess_dt));
		}
		
		if(EditFilter.IncludeTotal_tm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TOTAL_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Total_tm));
		}
		
		if(EditFilter.IncludeRem_tm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REM_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rem_tm));
		}
		
		if(EditFilter.IncludeSessd_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESSD_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sessd_stat));
		}
		
		if(EditFilter.IncludeSessd_act_ind)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESSD_ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sessd_act_ind));
		}
		
		if(EditFilter.IncludeGrp_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GRP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Grp_id));
		}
		
		if(EditFilter.IncludeActiv_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activ_id));
		}
		
		if(EditFilter.IncludeLo_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LO_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lo_id));
		}
		
		if(EditFilter.IncludeLo_sessiond_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LO_SESSIOND_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lo_sessiond_id));
		}
		
		if(EditFilter.IncludeLo_act_ind)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LO_ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lo_act_ind));
		}
		
		if(EditFilter.IncludeMc_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_id));
		}
		
		if(EditFilter.IncludeAct_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_id));
		}
		
		if(EditFilter.IncludeAct_sessiond_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_SESSIOND_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_sessiond_id));
		}
		
		if(EditFilter.IncludeAction_act_ind)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Action_act_ind));
		}
		
		if(EditFilter.IncludeMax_apps)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MAX_APPS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Max_apps));
		}
		
		if(EditFilter.IncludeRem_apps)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REM_APPS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rem_apps));
		}
		
		if(EditFilter.IncludeSession_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESSION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Session_id));
		}
		
		if(EditFilter.IncludeSessiond_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESSIOND_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sessiond_id));
		}
		
		if(EditFilter.IncludeSessiond_ids)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESSIOND_IDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sessiond_ids));
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
			Sd_sess_availRecord record = new Sd_sess_availRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Sess_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_DT"));
			record.Total_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TOTAL_TM"));
			record.Rem_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REM_TM"));
			record.Sessd_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSD_STAT"));
			record.Sessd_act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSD_ACT_IND"));
			record.Grp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GRP_ID"));
			record.Activ_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIV_ID"));
			record.Lo_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LO_ID"));
			record.Lo_sessiond_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LO_SESSIOND_ID"));
			record.Lo_act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LO_ACT_IND"));
			record.Mc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID"));
			record.Act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_ID"));
			record.Act_sessiond_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_SESSIOND_ID"));
			record.Action_act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_ACT_IND"));
			record.Max_apps = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAX_APPS"));
			record.Rem_apps = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REM_APPS"));
			record.Session_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSION_ID"));
			record.Sessiond_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSIOND_ID"));
			record.Sessiond_ids = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSIOND_IDS"));
									
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
			Sd_sess_availRecord record = new Sd_sess_availRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Sess_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_DT"));
			record.Total_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TOTAL_TM"));
			record.Rem_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REM_TM"));
			record.Sessd_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSD_STAT"));
			record.Sessd_act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSD_ACT_IND"));
			record.Grp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GRP_ID"));
			record.Activ_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIV_ID"));
			record.Lo_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LO_ID"));
			record.Lo_sessiond_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LO_SESSIOND_ID"));
			record.Lo_act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LO_ACT_IND"));
			record.Mc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID"));
			record.Act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_ID"));
			record.Act_sessiond_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_SESSIOND_ID"));
			record.Action_act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_ACT_IND"));
			record.Max_apps = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAX_APPS"));
			record.Rem_apps = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REM_APPS"));
			record.Session_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSION_ID"));
			record.Sessiond_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSIOND_ID"));
			record.Sessiond_ids = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSIOND_IDS"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Sd_sess_availCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_sess_availRecord newRecord = new Sd_sess_availRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_sess_availRecord record)
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
		public Sd_sess_availRecord get(int index)
		{
			return (Sd_sess_availRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_sess_availRecord
	{
		public String Sess_dt = "";
		public String Total_tm = "";
		public String Rem_tm = "";
		public String Sessd_stat = "";
		public String Sessd_act_ind = "";
		public String Grp_id = "";
		public String Activ_id = "";
		public String Lo_id = "";
		public String Lo_sessiond_id = "";
		public String Lo_act_ind = "";
		public String Mc_id = "";
		public String Act_id = "";
		public String Act_sessiond_id = "";
		public String Action_act_ind = "";
		public String Max_apps = "";
		public String Rem_apps = "";
		public String Session_id = "";
		public String Sessiond_id = "";
		public String Sessiond_ids = "";
				
		
		public void clear()
		{
			Sess_dt = "";
			Total_tm = "";
			Rem_tm = "";
			Sessd_stat = "";
			Sessd_act_ind = "";
			Grp_id = "";
			Activ_id = "";
			Lo_id = "";
			Lo_sessiond_id = "";
			Lo_act_ind = "";
			Mc_id = "";
			Act_id = "";
			Act_sessiond_id = "";
			Action_act_ind = "";
			Max_apps = "";
			Rem_apps = "";
			Session_id = "";
			Sessiond_id = "";
			Sessiond_ids = "";
			
		}		
	}
		
		
	public final class Sd_sess_availFilter
	{			
		public String Sess_dt = "";
		public String Total_tm = "";
		public String Rem_tm = "";
		public String Sessd_stat = "";
		public String Sessd_act_ind = "";
		public String Grp_id = "";
		public String Activ_id = "";
		public String Lo_id = "";
		public String Lo_sessiond_id = "";
		public String Lo_act_ind = "";
		public String Mc_id = "";
		public String Act_id = "";
		public String Act_sessiond_id = "";
		public String Action_act_ind = "";
		public String Max_apps = "";
		public String Rem_apps = "";
		public String Session_id = "";
		public String Sessiond_id = "";
		public String Sessiond_ids = "";
		
		public void clear()
		{				
			Sess_dt = "";
			Total_tm = "";
			Rem_tm = "";
			Sessd_stat = "";
			Sessd_act_ind = "";
			Grp_id = "";
			Activ_id = "";
			Lo_id = "";
			Lo_sessiond_id = "";
			Lo_act_ind = "";
			Mc_id = "";
			Act_id = "";
			Act_sessiond_id = "";
			Action_act_ind = "";
			Max_apps = "";
			Rem_apps = "";
			Session_id = "";
			Sessiond_id = "";
			Sessiond_ids = "";
		}	
		public Sd_sess_availFilter cloneObject()
		{
			Sd_sess_availFilter newFilter = new Sd_sess_availFilter();
			
			newFilter.Sess_dt = this.Sess_dt;
			newFilter.Total_tm = this.Total_tm;
			newFilter.Rem_tm = this.Rem_tm;
			newFilter.Sessd_stat = this.Sessd_stat;
			newFilter.Sessd_act_ind = this.Sessd_act_ind;
			newFilter.Grp_id = this.Grp_id;
			newFilter.Activ_id = this.Activ_id;
			newFilter.Lo_id = this.Lo_id;
			newFilter.Lo_sessiond_id = this.Lo_sessiond_id;
			newFilter.Lo_act_ind = this.Lo_act_ind;
			newFilter.Mc_id = this.Mc_id;
			newFilter.Act_id = this.Act_id;
			newFilter.Act_sessiond_id = this.Act_sessiond_id;
			newFilter.Action_act_ind = this.Action_act_ind;
			newFilter.Max_apps = this.Max_apps;
			newFilter.Rem_apps = this.Rem_apps;
			newFilter.Session_id = this.Session_id;
			newFilter.Sessiond_id = this.Sessiond_id;
			newFilter.Sessiond_ids = this.Sessiond_ids;
			
			return newFilter;
		}
	}
	public final class Sd_sess_availEditFilter
	{			
		public boolean IncludeSess_dt = true;
		public boolean IncludeTotal_tm = true;
		public boolean IncludeRem_tm = true;
		public boolean IncludeSessd_stat = true;
		public boolean IncludeSessd_act_ind = true;
		public boolean IncludeGrp_id = true;
		public boolean IncludeActiv_id = true;
		public boolean IncludeLo_id = true;
		public boolean IncludeLo_sessiond_id = true;
		public boolean IncludeLo_act_ind = true;
		public boolean IncludeMc_id = true;
		public boolean IncludeAct_id = true;
		public boolean IncludeAct_sessiond_id = true;
		public boolean IncludeAction_act_ind = true;
		public boolean IncludeMax_apps = true;
		public boolean IncludeRem_apps = true;
		public boolean IncludeSession_id = true;
		public boolean IncludeSessiond_id = true;
		public boolean IncludeSessiond_ids = true;
		
		public void includeAll()
		{				
			IncludeSess_dt = true;
			IncludeTotal_tm = true;
			IncludeRem_tm = true;
			IncludeSessd_stat = true;
			IncludeSessd_act_ind = true;
			IncludeGrp_id = true;
			IncludeActiv_id = true;
			IncludeLo_id = true;
			IncludeLo_sessiond_id = true;
			IncludeLo_act_ind = true;
			IncludeMc_id = true;
			IncludeAct_id = true;
			IncludeAct_sessiond_id = true;
			IncludeAction_act_ind = true;
			IncludeMax_apps = true;
			IncludeRem_apps = true;
			IncludeSession_id = true;
			IncludeSessiond_id = true;
			IncludeSessiond_ids = true;
		}	
		public void excludeAll()
		{				
			IncludeSess_dt = false;
			IncludeTotal_tm = false;
			IncludeRem_tm = false;
			IncludeSessd_stat = false;
			IncludeSessd_act_ind = false;
			IncludeGrp_id = false;
			IncludeActiv_id = false;
			IncludeLo_id = false;
			IncludeLo_sessiond_id = false;
			IncludeLo_act_ind = false;
			IncludeMc_id = false;
			IncludeAct_id = false;
			IncludeAct_sessiond_id = false;
			IncludeAction_act_ind = false;
			IncludeMax_apps = false;
			IncludeRem_apps = false;
			IncludeSession_id = false;
			IncludeSessiond_id = false;
			IncludeSessiond_ids = false;
		}
		public Sd_sess_availEditFilter cloneObject()
		{
			Sd_sess_availEditFilter newEditFilter = new Sd_sess_availEditFilter();
			
			newEditFilter.IncludeSess_dt = this.IncludeSess_dt;
			newEditFilter.IncludeTotal_tm = this.IncludeTotal_tm;
			newEditFilter.IncludeRem_tm = this.IncludeRem_tm;
			newEditFilter.IncludeSessd_stat = this.IncludeSessd_stat;
			newEditFilter.IncludeSessd_act_ind = this.IncludeSessd_act_ind;
			newEditFilter.IncludeGrp_id = this.IncludeGrp_id;
			newEditFilter.IncludeActiv_id = this.IncludeActiv_id;
			newEditFilter.IncludeLo_id = this.IncludeLo_id;
			newEditFilter.IncludeLo_sessiond_id = this.IncludeLo_sessiond_id;
			newEditFilter.IncludeLo_act_ind = this.IncludeLo_act_ind;
			newEditFilter.IncludeMc_id = this.IncludeMc_id;
			newEditFilter.IncludeAct_id = this.IncludeAct_id;
			newEditFilter.IncludeAct_sessiond_id = this.IncludeAct_sessiond_id;
			newEditFilter.IncludeAction_act_ind = this.IncludeAction_act_ind;
			newEditFilter.IncludeMax_apps = this.IncludeMax_apps;
			newEditFilter.IncludeRem_apps = this.IncludeRem_apps;
			newEditFilter.IncludeSession_id = this.IncludeSession_id;
			newEditFilter.IncludeSessiond_id = this.IncludeSessiond_id;
			newEditFilter.IncludeSessiond_ids = this.IncludeSessiond_ids;
			
			return newEditFilter;
		}
	}
}
