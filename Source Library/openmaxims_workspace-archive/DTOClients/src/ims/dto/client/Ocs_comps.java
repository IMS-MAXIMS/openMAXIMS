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
// Template ver. 1.0.3 - Last modified on 12/03/2004 10:13 by Marius Mihalec

package ims.dto.client;

public final class Ocs_comps
{
	private Ocs_compsFilter lastGetFilter = null;
	private final String serviceName = "OCS_COMPS";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Ocs_compsFilter Filter = new Ocs_compsFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Ocs_compsEditFilter EditFilter = new Ocs_compsEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Ocs_compsCollection DataCollection = new Ocs_compsCollection();

	/**
	 * Creates a new Ocs_comps Data Transfer Object.
	 */ 
	public Ocs_comps(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Ocs_comps cloneObject() throws ims.dto.Exception
	{
		Ocs_comps cloneObject = new Ocs_comps(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Res_comp_id = DataCollection.get(x).Res_comp_id;
			cloneObject.DataCollection.get(index).Res_id = DataCollection.get(x).Res_id;
			cloneObject.DataCollection.get(index).Res_comp_seq = DataCollection.get(x).Res_comp_seq;
			cloneObject.DataCollection.get(index).Res_cd = DataCollection.get(x).Res_cd;
			cloneObject.DataCollection.get(index).Res_ext_cd = DataCollection.get(x).Res_ext_cd;
			cloneObject.DataCollection.get(index).Res_val_type = DataCollection.get(x).Res_val_type;
			cloneObject.DataCollection.get(index).Res_val = DataCollection.get(x).Res_val;
			cloneObject.DataCollection.get(index).Unit_of_measure = DataCollection.get(x).Unit_of_measure;
			cloneObject.DataCollection.get(index).Ref_range = DataCollection.get(x).Ref_range;
			cloneObject.DataCollection.get(index).Abnormal_flag = DataCollection.get(x).Abnormal_flag;
			cloneObject.DataCollection.get(index).Res_stat = DataCollection.get(x).Res_stat;
			cloneObject.DataCollection.get(index).Date_of_obs = DataCollection.get(x).Date_of_obs;
			cloneObject.DataCollection.get(index).Time_of_obs = DataCollection.get(x).Time_of_obs;
			cloneObject.DataCollection.get(index).Res_ext_name = DataCollection.get(x).Res_ext_name;
			cloneObject.DataCollection.get(index).Res_name = DataCollection.get(x).Res_name;
			cloneObject.DataCollection.get(index).Comp_msg_src_id = DataCollection.get(x).Comp_msg_src_id;
			cloneObject.DataCollection.get(index).Perf_org_nm = DataCollection.get(x).Perf_org_nm;
							
			
			for(int iCmnt_seqno = 0; iCmnt_seqno < DataCollection.get(x).Cmnt_seqnoCollection.count(); iCmnt_seqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Cmnt_seqnoCollection.add();
					
				cloneObject.DataCollection.get(index).Cmnt_seqnoCollection.get(rIndex).Cmnt_seqno = DataCollection.get(x).Cmnt_seqnoCollection.get(iCmnt_seqno).Cmnt_seqno;
				cloneObject.DataCollection.get(index).Cmnt_seqnoCollection.get(rIndex).Cmnt_txt = DataCollection.get(x).Cmnt_seqnoCollection.get(iCmnt_seqno).Cmnt_txt;
				cloneObject.DataCollection.get(index).Cmnt_seqnoCollection.get(rIndex).Cmnt_type = DataCollection.get(x).Cmnt_seqnoCollection.get(iCmnt_seqno).Cmnt_type;
				cloneObject.DataCollection.get(index).Cmnt_seqnoCollection.get(rIndex).Cmnt_src = DataCollection.get(x).Cmnt_seqnoCollection.get(iCmnt_seqno).Cmnt_src;
										
			}
			
			for(int iTxt_seqno = 0; iTxt_seqno < DataCollection.get(x).Txt_seqnoCollection.count(); iTxt_seqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Txt_seqnoCollection.add();
					
				cloneObject.DataCollection.get(index).Txt_seqnoCollection.get(rIndex).Txt_seqno = DataCollection.get(x).Txt_seqnoCollection.get(iTxt_seqno).Txt_seqno;
				cloneObject.DataCollection.get(index).Txt_seqnoCollection.get(rIndex).Res_text = DataCollection.get(x).Txt_seqnoCollection.get(iTxt_seqno).Res_text;
										
			}
			
		}
		
		return cloneObject;
	}		
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_comps.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Ocs_comps.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_comps.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_comps.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_comps.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Ocs_comps.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Ocs_comps.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_comps.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Ocs_comps.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Ocs_comps.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Ocs_comps.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Ocs_comps.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Ocs_comps.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_comps.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Ocs_comps.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Ocs_comps.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Ocs_comps.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Ocs_comps.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Ocs_comps.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_comps.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Ocs_comps.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Ocs_comps.TransferData");
			
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
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_comps.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Ocs_comps.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Ocs_comps.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Ocs_comps.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
					
		decodeNASMessage();		
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_comps.List");
							
		listInProgress = true;	
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
						
		ims.dto.Result execResult = null;
		while(execResult == null && canContinueToList(loadAllRecords, maxRecords))
			execResult = nextList();
						
		if(execResult != null)
		{
			if(execResult.getId() != -3) 
			{
				listInProgress = false;
				return execResult;
			}
		}
		else // NAS next list empty
		{
			listInProgress = false;
			return null;
		}				
					
		if(!loadAllRecords || !listInProgress)
		{
			listInProgress = false;
			return Connection.stopList(serviceName);
		}
		
		listInProgress = false;
		return null;
	}	

	private String encodeNASFilter()
	{
		return encodeNASFilter(Filter);
	}
	private String encodeNASFilter(Ocs_compsFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Res_comp_id != null && filter.Res_comp_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_COMP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_comp_id;
		}
		
		if(Filter.Res_id != null && filter.Res_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_id;
		}
		
		if(Filter.Res_comp_seq != null && filter.Res_comp_seq.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_COMP_SEQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_comp_seq;
		}
		
		if(Filter.Res_cd != null && filter.Res_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_cd;
		}
		
		if(Filter.Res_ext_cd != null && filter.Res_ext_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_ext_cd;
		}
		
		if(Filter.Res_val_type != null && filter.Res_val_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_VAL_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_val_type;
		}
		
		if(Filter.Res_val != null && filter.Res_val.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_VAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_val;
		}
		
		if(Filter.Unit_of_measure != null && filter.Unit_of_measure.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UNIT_OF_MEASURE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Unit_of_measure;
		}
		
		if(Filter.Ref_range != null && filter.Ref_range.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REF_RANGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ref_range;
		}
		
		if(Filter.Abnormal_flag != null && filter.Abnormal_flag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ABNORMAL_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Abnormal_flag;
		}
		
		if(Filter.Res_stat != null && filter.Res_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_stat;
		}
		
		if(Filter.Date_of_obs != null && filter.Date_of_obs.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DATE_OF_OBS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Date_of_obs;
		}
		
		if(Filter.Time_of_obs != null && filter.Time_of_obs.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TIME_OF_OBS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Time_of_obs;
		}
		
		if(Filter.Res_ext_name != null && filter.Res_ext_name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_EXT_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_ext_name;
		}
		
		if(Filter.Res_name != null && filter.Res_name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_name;
		}
		
		if(Filter.Comp_msg_src_id != null && filter.Comp_msg_src_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COMP_MSG_SRC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Comp_msg_src_id;
		}
		
		if(Filter.Perf_org_nm != null && filter.Perf_org_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PERF_ORG_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Perf_org_nm;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Ocs_compsRecord data = (Ocs_compsRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeRes_comp_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_COMP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_comp_id);
		}
		
		if(EditFilter.IncludeRes_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_id);
		}
		
		if(EditFilter.IncludeRes_comp_seq)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_COMP_SEQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_comp_seq);
		}
		
		if(EditFilter.IncludeRes_cd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_cd);
		}
		
		if(EditFilter.IncludeRes_ext_cd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_ext_cd);
		}
		
		if(EditFilter.IncludeRes_val_type)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_VAL_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_val_type);
		}
		
		if(EditFilter.IncludeRes_val)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_VAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_val);
		}
		
		if(EditFilter.IncludeUnit_of_measure)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNIT_OF_MEASURE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unit_of_measure);
		}
		
		if(EditFilter.IncludeRef_range)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REF_RANGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ref_range);
		}
		
		if(EditFilter.IncludeAbnormal_flag)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ABNORMAL_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Abnormal_flag);
		}
		
		if(EditFilter.IncludeRes_stat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_stat);
		}
		
		if(EditFilter.IncludeDate_of_obs)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DATE_OF_OBS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Date_of_obs);
		}
		
		if(EditFilter.IncludeTime_of_obs)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TIME_OF_OBS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Time_of_obs);
		}
		
		if(EditFilter.IncludeRes_ext_name)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_EXT_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_ext_name);
		}
		
		if(EditFilter.IncludeRes_name)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_name);
		}
		
		if(EditFilter.IncludeComp_msg_src_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COMP_MSG_SRC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Comp_msg_src_id);
		}
		
		if(EditFilter.IncludePerf_org_nm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PERF_ORG_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Perf_org_nm);
		}
		
		
		for(int x = 0; x < data.Cmnt_seqnoCollection.count(); x++)
		{
			Ocs_compsCmnt_seqnoRecord rgRecord = (Ocs_compsCmnt_seqnoRecord)data.Cmnt_seqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CMNT_SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Cmnt_seqno);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CMNT_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Cmnt_txt);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CMNT_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Cmnt_type);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CMNT_SRC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Cmnt_src);
			
		}
		for(int x = 0; x < data.Txt_seqnoCollection.count(); x++)
		{
			Ocs_compsTxt_seqnoRecord rgRecord = (Ocs_compsTxt_seqnoRecord)data.Txt_seqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TXT_SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Txt_seqno);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_TEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_text);
			
		}
			
		return dataString;	
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
			Ocs_compsRecord record = new Ocs_compsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Res_comp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_COMP_ID"));
			record.Res_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_ID"));
			record.Res_comp_seq = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_COMP_SEQ"));
			record.Res_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_CD"));
			record.Res_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_EXT_CD"));
			record.Res_val_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_VAL_TYPE"));
			record.Res_val = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_VAL"));
			record.Unit_of_measure = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNIT_OF_MEASURE"));
			record.Ref_range = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REF_RANGE"));
			record.Abnormal_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ABNORMAL_FLAG"));
			record.Res_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_STAT"));
			record.Date_of_obs = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATE_OF_OBS"));
			record.Time_of_obs = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TIME_OF_OBS"));
			record.Res_ext_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_EXT_NAME"));
			record.Res_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_NAME"));
			record.Comp_msg_src_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMP_MSG_SRC_ID"));
			record.Perf_org_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_ORG_NM"));
									
			DataCollection.add(record);
		}	
		
		return records;
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
			Ocs_compsRecord record = new Ocs_compsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Res_comp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_COMP_ID"));
			record.Res_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_ID"));
			record.Res_comp_seq = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_COMP_SEQ"));
			record.Res_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_CD"));
			record.Res_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_EXT_CD"));
			record.Res_val_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_VAL_TYPE"));
			record.Res_val = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_VAL"));
			record.Unit_of_measure = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNIT_OF_MEASURE"));
			record.Ref_range = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REF_RANGE"));
			record.Abnormal_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ABNORMAL_FLAG"));
			record.Res_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_STAT"));
			record.Date_of_obs = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATE_OF_OBS"));
			record.Time_of_obs = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TIME_OF_OBS"));
			record.Res_ext_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_EXT_NAME"));
			record.Res_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_NAME"));
			record.Comp_msg_src_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMP_MSG_SRC_ID"));
			record.Perf_org_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_ORG_NM"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("cmnt_seqno"))
					record.Cmnt_seqnoCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("txt_seqno"))
					record.Txt_seqnoCollection.add();
			
									
			rgCount = record.Cmnt_seqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("cmnt_seqno"))
					{
						Ocs_compsCmnt_seqnoRecord rgRecord = record.Cmnt_seqnoCollection.get(recCount);
						rgRecord.Cmnt_seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("cmnt_txt"))
					{
						Ocs_compsCmnt_seqnoRecord rgRecord = record.Cmnt_seqnoCollection.get(recCount);
						rgRecord.Cmnt_txt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("cmnt_type"))
					{
						Ocs_compsCmnt_seqnoRecord rgRecord = record.Cmnt_seqnoCollection.get(recCount);
						rgRecord.Cmnt_type = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("cmnt_src"))
					{
						Ocs_compsCmnt_seqnoRecord rgRecord = record.Cmnt_seqnoCollection.get(recCount);
						rgRecord.Cmnt_src = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Txt_seqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("txt_seqno"))
					{
						Ocs_compsTxt_seqnoRecord rgRecord = record.Txt_seqnoCollection.get(recCount);
						rgRecord.Txt_seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_text"))
					{
						Ocs_compsTxt_seqnoRecord rgRecord = record.Txt_seqnoCollection.get(recCount);
						rgRecord.Res_text = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Ocs_compsCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Ocs_compsRecord newRecord = new Ocs_compsRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Ocs_compsRecord record)
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
		public Ocs_compsRecord get(int index)
		{
			return (Ocs_compsRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Ocs_compsRecord
	{
		public String Res_comp_id = "";
		public String Res_id = "";
		public String Res_comp_seq = "";
		public String Res_cd = "";
		public String Res_ext_cd = "";
		public String Res_val_type = "";
		public String Res_val = "";
		public String Unit_of_measure = "";
		public String Ref_range = "";
		public String Abnormal_flag = "";
		public String Res_stat = "";
		public String Date_of_obs = "";
		public String Time_of_obs = "";
		public String Res_ext_name = "";
		public String Res_name = "";
		public String Comp_msg_src_id = "";
		public String Perf_org_nm = "";
		
		public Ocs_compsCmnt_seqnoCollection Cmnt_seqnoCollection = new Ocs_compsCmnt_seqnoCollection();
		public Ocs_compsTxt_seqnoCollection Txt_seqnoCollection = new Ocs_compsTxt_seqnoCollection();		
		
		public void clear()
		{
			Res_comp_id = "";
			Res_id = "";
			Res_comp_seq = "";
			Res_cd = "";
			Res_ext_cd = "";
			Res_val_type = "";
			Res_val = "";
			Unit_of_measure = "";
			Ref_range = "";
			Abnormal_flag = "";
			Res_stat = "";
			Date_of_obs = "";
			Time_of_obs = "";
			Res_ext_name = "";
			Res_name = "";
			Comp_msg_src_id = "";
			Perf_org_nm = "";
			
			Cmnt_seqnoCollection.clear();
			Txt_seqnoCollection.clear();
		}		
	}
	
	public final class Ocs_compsCmnt_seqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Ocs_compsCmnt_seqnoRecord newRecord = new Ocs_compsCmnt_seqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Ocs_compsCmnt_seqnoRecord record)
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
		public Ocs_compsCmnt_seqnoRecord get(int index)
		{
			return (Ocs_compsCmnt_seqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Ocs_compsTxt_seqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Ocs_compsTxt_seqnoRecord newRecord = new Ocs_compsTxt_seqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Ocs_compsTxt_seqnoRecord record)
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
		public Ocs_compsTxt_seqnoRecord get(int index)
		{
			return (Ocs_compsTxt_seqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Ocs_compsCmnt_seqnoRecord
	{
		public String Cmnt_seqno = "";
		public String Cmnt_txt = "";
		public String Cmnt_type = "";
		public String Cmnt_src = "";
		
		public void clear()
		{
			Cmnt_seqno = "";
			Cmnt_txt = "";
			Cmnt_type = "";
			Cmnt_src = "";
			
		}
	}
	public final class Ocs_compsTxt_seqnoRecord
	{
		public String Txt_seqno = "";
		public String Res_text = "";
		
		public void clear()
		{
			Txt_seqno = "";
			Res_text = "";
			
		}
	}	
	public final class Ocs_compsFilter
	{			
		public String Res_comp_id = "";
		public String Res_id = "";
		public String Res_comp_seq = "";
		public String Res_cd = "";
		public String Res_ext_cd = "";
		public String Res_val_type = "";
		public String Res_val = "";
		public String Unit_of_measure = "";
		public String Ref_range = "";
		public String Abnormal_flag = "";
		public String Res_stat = "";
		public String Date_of_obs = "";
		public String Time_of_obs = "";
		public String Res_ext_name = "";
		public String Res_name = "";
		public String Comp_msg_src_id = "";
		public String Perf_org_nm = "";
		
		public void clear()
		{				
			Res_comp_id = "";
			Res_id = "";
			Res_comp_seq = "";
			Res_cd = "";
			Res_ext_cd = "";
			Res_val_type = "";
			Res_val = "";
			Unit_of_measure = "";
			Ref_range = "";
			Abnormal_flag = "";
			Res_stat = "";
			Date_of_obs = "";
			Time_of_obs = "";
			Res_ext_name = "";
			Res_name = "";
			Comp_msg_src_id = "";
			Perf_org_nm = "";
		}	
		public Ocs_compsFilter cloneObject()
		{
			Ocs_compsFilter newFilter = new Ocs_compsFilter();
			
			newFilter.Res_comp_id = this.Res_comp_id;
			newFilter.Res_id = this.Res_id;
			newFilter.Res_comp_seq = this.Res_comp_seq;
			newFilter.Res_cd = this.Res_cd;
			newFilter.Res_ext_cd = this.Res_ext_cd;
			newFilter.Res_val_type = this.Res_val_type;
			newFilter.Res_val = this.Res_val;
			newFilter.Unit_of_measure = this.Unit_of_measure;
			newFilter.Ref_range = this.Ref_range;
			newFilter.Abnormal_flag = this.Abnormal_flag;
			newFilter.Res_stat = this.Res_stat;
			newFilter.Date_of_obs = this.Date_of_obs;
			newFilter.Time_of_obs = this.Time_of_obs;
			newFilter.Res_ext_name = this.Res_ext_name;
			newFilter.Res_name = this.Res_name;
			newFilter.Comp_msg_src_id = this.Comp_msg_src_id;
			newFilter.Perf_org_nm = this.Perf_org_nm;
			
			return newFilter;
		}
	}
	public final class Ocs_compsEditFilter
	{			
		public boolean IncludeRes_comp_id = true;
		public boolean IncludeRes_id = true;
		public boolean IncludeRes_comp_seq = true;
		public boolean IncludeRes_cd = true;
		public boolean IncludeRes_ext_cd = true;
		public boolean IncludeRes_val_type = true;
		public boolean IncludeRes_val = true;
		public boolean IncludeUnit_of_measure = true;
		public boolean IncludeRef_range = true;
		public boolean IncludeAbnormal_flag = true;
		public boolean IncludeRes_stat = true;
		public boolean IncludeDate_of_obs = true;
		public boolean IncludeTime_of_obs = true;
		public boolean IncludeRes_ext_name = true;
		public boolean IncludeRes_name = true;
		public boolean IncludeComp_msg_src_id = true;
		public boolean IncludePerf_org_nm = true;
		
		public void includeAll()
		{				
			IncludeRes_comp_id = true;
			IncludeRes_id = true;
			IncludeRes_comp_seq = true;
			IncludeRes_cd = true;
			IncludeRes_ext_cd = true;
			IncludeRes_val_type = true;
			IncludeRes_val = true;
			IncludeUnit_of_measure = true;
			IncludeRef_range = true;
			IncludeAbnormal_flag = true;
			IncludeRes_stat = true;
			IncludeDate_of_obs = true;
			IncludeTime_of_obs = true;
			IncludeRes_ext_name = true;
			IncludeRes_name = true;
			IncludeComp_msg_src_id = true;
			IncludePerf_org_nm = true;
		}	
		public void excludeAll()
		{				
			IncludeRes_comp_id = false;
			IncludeRes_id = false;
			IncludeRes_comp_seq = false;
			IncludeRes_cd = false;
			IncludeRes_ext_cd = false;
			IncludeRes_val_type = false;
			IncludeRes_val = false;
			IncludeUnit_of_measure = false;
			IncludeRef_range = false;
			IncludeAbnormal_flag = false;
			IncludeRes_stat = false;
			IncludeDate_of_obs = false;
			IncludeTime_of_obs = false;
			IncludeRes_ext_name = false;
			IncludeRes_name = false;
			IncludeComp_msg_src_id = false;
			IncludePerf_org_nm = false;
		}
		public Ocs_compsEditFilter cloneObject()
		{
			Ocs_compsEditFilter newEditFilter = new Ocs_compsEditFilter();
			
			newEditFilter.IncludeRes_comp_id = this.IncludeRes_comp_id;
			newEditFilter.IncludeRes_id = this.IncludeRes_id;
			newEditFilter.IncludeRes_comp_seq = this.IncludeRes_comp_seq;
			newEditFilter.IncludeRes_cd = this.IncludeRes_cd;
			newEditFilter.IncludeRes_ext_cd = this.IncludeRes_ext_cd;
			newEditFilter.IncludeRes_val_type = this.IncludeRes_val_type;
			newEditFilter.IncludeRes_val = this.IncludeRes_val;
			newEditFilter.IncludeUnit_of_measure = this.IncludeUnit_of_measure;
			newEditFilter.IncludeRef_range = this.IncludeRef_range;
			newEditFilter.IncludeAbnormal_flag = this.IncludeAbnormal_flag;
			newEditFilter.IncludeRes_stat = this.IncludeRes_stat;
			newEditFilter.IncludeDate_of_obs = this.IncludeDate_of_obs;
			newEditFilter.IncludeTime_of_obs = this.IncludeTime_of_obs;
			newEditFilter.IncludeRes_ext_name = this.IncludeRes_ext_name;
			newEditFilter.IncludeRes_name = this.IncludeRes_name;
			newEditFilter.IncludeComp_msg_src_id = this.IncludeComp_msg_src_id;
			newEditFilter.IncludePerf_org_nm = this.IncludePerf_org_nm;
			
			return newEditFilter;
		}
	}
}
