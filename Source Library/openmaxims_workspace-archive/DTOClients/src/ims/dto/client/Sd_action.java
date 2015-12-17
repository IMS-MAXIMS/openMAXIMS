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

public final class Sd_action implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_action.class);
	
	private Sd_actionFilter lastGetFilter = null;
	private final String serviceName = "SD_ACTION";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_actionFilter Filter = new Sd_actionFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_actionEditFilter EditFilter = new Sd_actionEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_actionCollection DataCollection = new Sd_actionCollection();

	/**
	 * Creates a new Sd_action Data Transfer Object.
	 */ 
	public Sd_action(ims.dto.Connection connection)
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
	public Sd_action cloneObject()
	{
		Sd_action cloneObject = new Sd_action(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Action_id = DataCollection.get(x).Action_id;
			cloneObject.DataCollection.get(index).Action_nm = DataCollection.get(x).Action_nm;
			cloneObject.DataCollection.get(index).Action_desc = DataCollection.get(x).Action_desc;
			cloneObject.DataCollection.get(index).Tim_req = DataCollection.get(x).Tim_req;
			cloneObject.DataCollection.get(index).Int_req = DataCollection.get(x).Int_req;
			cloneObject.DataCollection.get(index).Pat_req = DataCollection.get(x).Pat_req;
			cloneObject.DataCollection.get(index).Sched_flag = DataCollection.get(x).Sched_flag;
			cloneObject.DataCollection.get(index).Act_ind = DataCollection.get(x).Act_ind;
			cloneObject.DataCollection.get(index).Act_reason = DataCollection.get(x).Act_reason;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
							
			
			for(int iReqmnt_id = 0; iReqmnt_id < DataCollection.get(x).Reqmnt_idCollection.count(); iReqmnt_id++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Reqmnt_idCollection.add();
					
				cloneObject.DataCollection.get(index).Reqmnt_idCollection.get(rIndex).Reqmnt_id = DataCollection.get(x).Reqmnt_idCollection.get(iReqmnt_id).Reqmnt_id;
				cloneObject.DataCollection.get(index).Reqmnt_idCollection.get(rIndex).Act_ind_rq = DataCollection.get(x).Reqmnt_idCollection.get(iReqmnt_id).Act_ind_rq;
										
			}
			
			for(int iActiv_act_id = 0; iActiv_act_id < DataCollection.get(x).Activ_act_idCollection.count(); iActiv_act_id++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Activ_act_idCollection.add();
					
				cloneObject.DataCollection.get(index).Activ_act_idCollection.get(rIndex).Activ_act_id = DataCollection.get(x).Activ_act_idCollection.get(iActiv_act_id).Activ_act_id;
				cloneObject.DataCollection.get(index).Activ_act_idCollection.get(rIndex).Activ_id = DataCollection.get(x).Activ_act_idCollection.get(iActiv_act_id).Activ_id;
				cloneObject.DataCollection.get(index).Activ_act_idCollection.get(rIndex).Activ_grp_id = DataCollection.get(x).Activ_act_idCollection.get(iActiv_act_id).Activ_grp_id;
				cloneObject.DataCollection.get(index).Activ_act_idCollection.get(rIndex).Act_ind_activ = DataCollection.get(x).Activ_act_idCollection.get(iActiv_act_id).Act_ind_activ;
										
			}
			
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
		return "Sd_action.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_action.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_action.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_action.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_action.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_action.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_action.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_action.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_action.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_action.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_action.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_action.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_action.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_action.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_action.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_action.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_action.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_action.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_action.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_action.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_action.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_action.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_action.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_action.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_action.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_action.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_action.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_action nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_action After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_action After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_action.List");
							
		listInProgress = true;	
		logger.debug("Sd_action Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_action After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_action After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_actionFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Action_id != null && filter.Action_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Action_id);
		}
		
		if(Filter.Action_nm != null && filter.Action_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTION_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Action_nm);
		}
		
		if(Filter.Action_desc != null && filter.Action_desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTION_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Action_desc);
		}
		
		if(Filter.Tim_req != null && filter.Tim_req.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TIM_REQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tim_req);
		}
		
		if(Filter.Int_req != null && filter.Int_req.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INT_REQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_req);
		}
		
		if(Filter.Pat_req != null && filter.Pat_req.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PAT_REQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pat_req);
		}
		
		if(Filter.Sched_flag != null && filter.Sched_flag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCHED_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sched_flag);
		}
		
		if(Filter.Act_ind != null && filter.Act_ind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_ind);
		}
		
		if(Filter.Act_reason != null && filter.Act_reason.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_REASON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_reason);
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_actionRecord data = (Sd_actionRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeAction_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Action_id));
		}
		
		if(EditFilter.IncludeAction_nm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Action_nm));
		}
		
		if(EditFilter.IncludeAction_desc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Action_desc));
		}
		
		if(EditFilter.IncludeTim_req)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TIM_REQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tim_req));
		}
		
		if(EditFilter.IncludeInt_req)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INT_REQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_req));
		}
		
		if(EditFilter.IncludePat_req)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PAT_REQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pat_req));
		}
		
		if(EditFilter.IncludeSched_flag)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCHED_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sched_flag));
		}
		
		if(EditFilter.IncludeAct_ind)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_ind));
		}
		
		if(EditFilter.IncludeAct_reason)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_REASON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_reason));
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
		}
		
		
		for(int x = 0; x < data.Reqmnt_idCollection.count(); x++)
		{
			Sd_actionReqmnt_idRecord rgRecord = (Sd_actionReqmnt_idRecord)data.Reqmnt_idCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REQMNT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Reqmnt_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_RQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_rq));
			
		}
		for(int x = 0; x < data.Activ_act_idCollection.count(); x++)
		{
			Sd_actionActiv_act_idRecord rgRecord = (Sd_actionActiv_act_idRecord)data.Activ_act_idCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIV_ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Activ_act_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Activ_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIV_GRP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Activ_grp_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_ACTIV" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_activ));
			
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
			Sd_actionRecord record = new Sd_actionRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Action_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_ID"));
			record.Action_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_NM"));
			record.Action_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_DESC"));
			record.Tim_req = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TIM_REQ"));
			record.Int_req = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_REQ"));
			record.Pat_req = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_REQ"));
			record.Sched_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCHED_FLAG"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
			record.Act_reason = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_REASON"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
									
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
			Sd_actionRecord record = new Sd_actionRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Action_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_ID"));
			record.Action_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_NM"));
			record.Action_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_DESC"));
			record.Tim_req = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TIM_REQ"));
			record.Int_req = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_REQ"));
			record.Pat_req = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_REQ"));
			record.Sched_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCHED_FLAG"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
			record.Act_reason = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_REASON"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("reqmnt_id"))
					record.Reqmnt_idCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("activ_act_id"))
					record.Activ_act_idCollection.add();
			
									
			rgCount = record.Reqmnt_idCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("reqmnt_id"))
					{
						Sd_actionReqmnt_idRecord rgRecord = record.Reqmnt_idCollection.get(recCount);
						rgRecord.Reqmnt_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind_rq"))
					{
						Sd_actionReqmnt_idRecord rgRecord = record.Reqmnt_idCollection.get(recCount);
						rgRecord.Act_ind_rq = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Activ_act_idCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("activ_act_id"))
					{
						Sd_actionActiv_act_idRecord rgRecord = record.Activ_act_idCollection.get(recCount);
						rgRecord.Activ_act_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("activ_id"))
					{
						Sd_actionActiv_act_idRecord rgRecord = record.Activ_act_idCollection.get(recCount);
						rgRecord.Activ_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("activ_grp_id"))
					{
						Sd_actionActiv_act_idRecord rgRecord = record.Activ_act_idCollection.get(recCount);
						rgRecord.Activ_grp_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind_activ"))
					{
						Sd_actionActiv_act_idRecord rgRecord = record.Activ_act_idCollection.get(recCount);
						rgRecord.Act_ind_activ = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Sd_actionCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_actionRecord newRecord = new Sd_actionRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_actionRecord record)
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
		public Sd_actionRecord get(int index)
		{
			return (Sd_actionRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_actionRecord
	{
		public String Action_id = "";
		public String Action_nm = "";
		public String Action_desc = "";
		public String Tim_req = "";
		public String Int_req = "";
		public String Pat_req = "";
		public String Sched_flag = "";
		public String Act_ind = "";
		public String Act_reason = "";
		public String Tstp = "";
		
		public Sd_actionReqmnt_idCollection Reqmnt_idCollection = new Sd_actionReqmnt_idCollection();
		public Sd_actionActiv_act_idCollection Activ_act_idCollection = new Sd_actionActiv_act_idCollection();		
		
		public void clear()
		{
			Action_id = "";
			Action_nm = "";
			Action_desc = "";
			Tim_req = "";
			Int_req = "";
			Pat_req = "";
			Sched_flag = "";
			Act_ind = "";
			Act_reason = "";
			Tstp = "";
			
			Reqmnt_idCollection.clear();
			Activ_act_idCollection.clear();
		}		
	}
	
	public final class Sd_actionReqmnt_idCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_actionReqmnt_idRecord newRecord = new Sd_actionReqmnt_idRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_actionReqmnt_idRecord record)
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
		public Sd_actionReqmnt_idRecord get(int index)
		{
			return (Sd_actionReqmnt_idRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_actionActiv_act_idCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_actionActiv_act_idRecord newRecord = new Sd_actionActiv_act_idRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_actionActiv_act_idRecord record)
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
		public Sd_actionActiv_act_idRecord get(int index)
		{
			return (Sd_actionActiv_act_idRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Sd_actionReqmnt_idRecord
	{
		public String Reqmnt_id = "";
		public String Act_ind_rq = "";
		
		public void clear()
		{
			Reqmnt_id = "";
			Act_ind_rq = "";
			
		}
	}
	public final class Sd_actionActiv_act_idRecord
	{
		public String Activ_act_id = "";
		public String Activ_id = "";
		public String Activ_grp_id = "";
		public String Act_ind_activ = "";
		
		public void clear()
		{
			Activ_act_id = "";
			Activ_id = "";
			Activ_grp_id = "";
			Act_ind_activ = "";
			
		}
	}	
	public final class Sd_actionFilter
	{			
		public String Action_id = "";
		public String Action_nm = "";
		public String Action_desc = "";
		public String Tim_req = "";
		public String Int_req = "";
		public String Pat_req = "";
		public String Sched_flag = "";
		public String Act_ind = "";
		public String Act_reason = "";
		public String Tstp = "";
		
		public void clear()
		{				
			Action_id = "";
			Action_nm = "";
			Action_desc = "";
			Tim_req = "";
			Int_req = "";
			Pat_req = "";
			Sched_flag = "";
			Act_ind = "";
			Act_reason = "";
			Tstp = "";
		}	
		public Sd_actionFilter cloneObject()
		{
			Sd_actionFilter newFilter = new Sd_actionFilter();
			
			newFilter.Action_id = this.Action_id;
			newFilter.Action_nm = this.Action_nm;
			newFilter.Action_desc = this.Action_desc;
			newFilter.Tim_req = this.Tim_req;
			newFilter.Int_req = this.Int_req;
			newFilter.Pat_req = this.Pat_req;
			newFilter.Sched_flag = this.Sched_flag;
			newFilter.Act_ind = this.Act_ind;
			newFilter.Act_reason = this.Act_reason;
			newFilter.Tstp = this.Tstp;
			
			return newFilter;
		}
	}
	public final class Sd_actionEditFilter
	{			
		public boolean IncludeAction_id = true;
		public boolean IncludeAction_nm = true;
		public boolean IncludeAction_desc = true;
		public boolean IncludeTim_req = true;
		public boolean IncludeInt_req = true;
		public boolean IncludePat_req = true;
		public boolean IncludeSched_flag = true;
		public boolean IncludeAct_ind = true;
		public boolean IncludeAct_reason = true;
		public boolean IncludeTstp = true;
		
		public void includeAll()
		{				
			IncludeAction_id = true;
			IncludeAction_nm = true;
			IncludeAction_desc = true;
			IncludeTim_req = true;
			IncludeInt_req = true;
			IncludePat_req = true;
			IncludeSched_flag = true;
			IncludeAct_ind = true;
			IncludeAct_reason = true;
			IncludeTstp = true;
		}	
		public void excludeAll()
		{				
			IncludeAction_id = false;
			IncludeAction_nm = false;
			IncludeAction_desc = false;
			IncludeTim_req = false;
			IncludeInt_req = false;
			IncludePat_req = false;
			IncludeSched_flag = false;
			IncludeAct_ind = false;
			IncludeAct_reason = false;
			IncludeTstp = false;
		}
		public Sd_actionEditFilter cloneObject()
		{
			Sd_actionEditFilter newEditFilter = new Sd_actionEditFilter();
			
			newEditFilter.IncludeAction_id = this.IncludeAction_id;
			newEditFilter.IncludeAction_nm = this.IncludeAction_nm;
			newEditFilter.IncludeAction_desc = this.IncludeAction_desc;
			newEditFilter.IncludeTim_req = this.IncludeTim_req;
			newEditFilter.IncludeInt_req = this.IncludeInt_req;
			newEditFilter.IncludePat_req = this.IncludePat_req;
			newEditFilter.IncludeSched_flag = this.IncludeSched_flag;
			newEditFilter.IncludeAct_ind = this.IncludeAct_ind;
			newEditFilter.IncludeAct_reason = this.IncludeAct_reason;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			
			return newEditFilter;
		}
	}
}
