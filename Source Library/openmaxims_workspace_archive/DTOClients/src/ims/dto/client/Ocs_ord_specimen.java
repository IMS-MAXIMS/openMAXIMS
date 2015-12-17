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

public final class Ocs_ord_specimen
{
	private Ocs_ord_specimenFilter lastGetFilter = null;
	private final String serviceName = "OCS_ORD_SPECIMEN";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Ocs_ord_specimenFilter Filter = new Ocs_ord_specimenFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Ocs_ord_specimenEditFilter EditFilter = new Ocs_ord_specimenEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Ocs_ord_specimenCollection DataCollection = new Ocs_ord_specimenCollection();

	/**
	 * Creates a new Ocs_ord_specimen Data Transfer Object.
	 */ 
	public Ocs_ord_specimen(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Ocs_ord_specimen cloneObject() throws ims.dto.Exception
	{
		Ocs_ord_specimen cloneObject = new Ocs_ord_specimen(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Specimen_id = DataCollection.get(x).Specimen_id;
			cloneObject.DataCollection.get(index).Order_id = DataCollection.get(x).Order_id;
			cloneObject.DataCollection.get(index).Spc_coll_date = DataCollection.get(x).Spc_coll_date;
			cloneObject.DataCollection.get(index).Spc_coll_time = DataCollection.get(x).Spc_coll_time;
			cloneObject.DataCollection.get(index).Spc_coll_end_dt = DataCollection.get(x).Spc_coll_end_dt;
			cloneObject.DataCollection.get(index).Spc_coll_end_tm = DataCollection.get(x).Spc_coll_end_tm;
			cloneObject.DataCollection.get(index).Spc_coll_vol = DataCollection.get(x).Spc_coll_vol;
			cloneObject.DataCollection.get(index).Spc_coll_id = DataCollection.get(x).Spc_coll_id;
			cloneObject.DataCollection.get(index).Spc_act_cd = DataCollection.get(x).Spc_act_cd;
			cloneObject.DataCollection.get(index).Spc_rx_dt = DataCollection.get(x).Spc_rx_dt;
			cloneObject.DataCollection.get(index).Spc_rx_tm = DataCollection.get(x).Spc_rx_tm;
			cloneObject.DataCollection.get(index).Spc_site_cd = DataCollection.get(x).Spc_site_cd;
			cloneObject.DataCollection.get(index).Spc_site_nm = DataCollection.get(x).Spc_site_nm;
			cloneObject.DataCollection.get(index).Spc_src_cd = DataCollection.get(x).Spc_src_cd;
			cloneObject.DataCollection.get(index).Spc_src_nm = DataCollection.get(x).Spc_src_nm;
			cloneObject.DataCollection.get(index).Spc_cmnt_txt = DataCollection.get(x).Spc_cmnt_txt;
			cloneObject.DataCollection.get(index).Spc_no_cont = DataCollection.get(x).Spc_no_cont;
			cloneObject.DataCollection.get(index).Spc_tport = DataCollection.get(x).Spc_tport;
			cloneObject.DataCollection.get(index).Spc_perf_cd = DataCollection.get(x).Spc_perf_cd;
			cloneObject.DataCollection.get(index).Perf_id = DataCollection.get(x).Perf_id;
			cloneObject.DataCollection.get(index).Discip_ext_cd = DataCollection.get(x).Discip_ext_cd;
			cloneObject.DataCollection.get(index).Abn_flag = DataCollection.get(x).Abn_flag;
			cloneObject.DataCollection.get(index).Vw_stat = DataCollection.get(x).Vw_stat;
			cloneObject.DataCollection.get(index).Spc_item_list = DataCollection.get(x).Spc_item_list;
			cloneObject.DataCollection.get(index).Test_cat = DataCollection.get(x).Test_cat;
			cloneObject.DataCollection.get(index).Display_date = DataCollection.get(x).Display_date;
			cloneObject.DataCollection.get(index).Display_time = DataCollection.get(x).Display_time;
			cloneObject.DataCollection.get(index).Display_flag = DataCollection.get(x).Display_flag;
			cloneObject.DataCollection.get(index).Discipline = DataCollection.get(x).Discipline;
			cloneObject.DataCollection.get(index).Vw_stat_txt = DataCollection.get(x).Vw_stat_txt;
			cloneObject.DataCollection.get(index).Date_of_reqt = DataCollection.get(x).Date_of_reqt;
			cloneObject.DataCollection.get(index).Time_of_reqt = DataCollection.get(x).Time_of_reqt;
			cloneObject.DataCollection.get(index).Reqtg_user_id = DataCollection.get(x).Reqtg_user_id;
			cloneObject.DataCollection.get(index).Resp_cons_cd = DataCollection.get(x).Resp_cons_cd;
			cloneObject.DataCollection.get(index).Ord_loc_cd = DataCollection.get(x).Ord_loc_cd;
			cloneObject.DataCollection.get(index).Ord_loc_nm = DataCollection.get(x).Ord_loc_nm;
			cloneObject.DataCollection.get(index).Resp_cons_nm = DataCollection.get(x).Resp_cons_nm;
			cloneObject.DataCollection.get(index).Req_user_nm = DataCollection.get(x).Req_user_nm;
			cloneObject.DataCollection.get(index).Perf_ord_no = DataCollection.get(x).Perf_ord_no;
			cloneObject.DataCollection.get(index).Msg_src_id = DataCollection.get(x).Msg_src_id;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Ord_sname = DataCollection.get(x).Ord_sname;
			cloneObject.DataCollection.get(index).Ord_fname = DataCollection.get(x).Ord_fname;
			cloneObject.DataCollection.get(index).Ord_sex = DataCollection.get(x).Ord_sex;
			cloneObject.DataCollection.get(index).Ord_dob = DataCollection.get(x).Ord_dob;
			cloneObject.DataCollection.get(index).Ord_title = DataCollection.get(x).Ord_title;
			cloneObject.DataCollection.get(index).Ord_nhs_no = DataCollection.get(x).Ord_nhs_no;
			cloneObject.DataCollection.get(index).Ord_ext_patid = DataCollection.get(x).Ord_ext_patid;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Clnc_note = DataCollection.get(x).Clnc_note;
			cloneObject.DataCollection.get(index).Perf_tel = DataCollection.get(x).Perf_tel;
			cloneObject.DataCollection.get(index).Perf_org_nm = DataCollection.get(x).Perf_org_nm;
			cloneObject.DataCollection.get(index).Numdays = DataCollection.get(x).Numdays;
							
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_specimen.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Ocs_ord_specimen.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_specimen.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_specimen.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_specimen.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Ocs_ord_specimen.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Ocs_ord_specimen.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_specimen.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Ocs_ord_specimen.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Ocs_ord_specimen.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Ocs_ord_specimen.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Ocs_ord_specimen.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Ocs_ord_specimen.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_specimen.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Ocs_ord_specimen.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Ocs_ord_specimen.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Ocs_ord_specimen.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Ocs_ord_specimen.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Ocs_ord_specimen.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_specimen.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Ocs_ord_specimen.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Ocs_ord_specimen.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_specimen.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Ocs_ord_specimen.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Ocs_ord_specimen.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Ocs_ord_specimen.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_specimen.List");
							
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
	private String encodeNASFilter(Ocs_ord_specimenFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Specimen_id != null && filter.Specimen_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPECIMEN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Specimen_id;
		}
		
		if(Filter.Order_id != null && filter.Order_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORDER_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Order_id;
		}
		
		if(Filter.Spc_coll_date != null && filter.Spc_coll_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_COLL_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_coll_date;
		}
		
		if(Filter.Spc_coll_time != null && filter.Spc_coll_time.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_COLL_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_coll_time;
		}
		
		if(Filter.Spc_coll_end_dt != null && filter.Spc_coll_end_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_COLL_END_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_coll_end_dt;
		}
		
		if(Filter.Spc_coll_end_tm != null && filter.Spc_coll_end_tm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_COLL_END_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_coll_end_tm;
		}
		
		if(Filter.Spc_coll_vol != null && filter.Spc_coll_vol.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_COLL_VOL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_coll_vol;
		}
		
		if(Filter.Spc_coll_id != null && filter.Spc_coll_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_COLL_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_coll_id;
		}
		
		if(Filter.Spc_act_cd != null && filter.Spc_act_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_ACT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_act_cd;
		}
		
		if(Filter.Spc_rx_dt != null && filter.Spc_rx_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_RX_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_rx_dt;
		}
		
		if(Filter.Spc_rx_tm != null && filter.Spc_rx_tm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_RX_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_rx_tm;
		}
		
		if(Filter.Spc_site_cd != null && filter.Spc_site_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_SITE_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_site_cd;
		}
		
		if(Filter.Spc_site_nm != null && filter.Spc_site_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_SITE_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_site_nm;
		}
		
		if(Filter.Spc_src_cd != null && filter.Spc_src_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_SRC_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_src_cd;
		}
		
		if(Filter.Spc_src_nm != null && filter.Spc_src_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_SRC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_src_nm;
		}
		
		if(Filter.Spc_cmnt_txt != null && filter.Spc_cmnt_txt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_CMNT_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_cmnt_txt;
		}
		
		if(Filter.Spc_no_cont != null && filter.Spc_no_cont.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_NO_CONT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_no_cont;
		}
		
		if(Filter.Spc_tport != null && filter.Spc_tport.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_TPORT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_tport;
		}
		
		if(Filter.Spc_perf_cd != null && filter.Spc_perf_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_PERF_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_perf_cd;
		}
		
		if(Filter.Perf_id != null && filter.Perf_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PERF_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Perf_id;
		}
		
		if(Filter.Discip_ext_cd != null && filter.Discip_ext_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DISCIP_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Discip_ext_cd;
		}
		
		if(Filter.Abn_flag != null && filter.Abn_flag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ABN_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Abn_flag;
		}
		
		if(Filter.Vw_stat != null && filter.Vw_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "VW_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Vw_stat;
		}
		
		if(Filter.Spc_item_list != null && filter.Spc_item_list.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_ITEM_LIST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_item_list;
		}
		
		if(Filter.Test_cat != null && filter.Test_cat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TEST_CAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Test_cat;
		}
		
		if(Filter.Display_date != null && filter.Display_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DISPLAY_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Display_date;
		}
		
		if(Filter.Display_time != null && filter.Display_time.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DISPLAY_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Display_time;
		}
		
		if(Filter.Display_flag != null && filter.Display_flag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DISPLAY_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Display_flag;
		}
		
		if(Filter.Discipline != null && filter.Discipline.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DISCIPLINE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Discipline;
		}
		
		if(Filter.Vw_stat_txt != null && filter.Vw_stat_txt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "VW_STAT_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Vw_stat_txt;
		}
		
		if(Filter.Date_of_reqt != null && filter.Date_of_reqt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DATE_OF_REQT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Date_of_reqt;
		}
		
		if(Filter.Time_of_reqt != null && filter.Time_of_reqt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TIME_OF_REQT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Time_of_reqt;
		}
		
		if(Filter.Reqtg_user_id != null && filter.Reqtg_user_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQTG_USER_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reqtg_user_id;
		}
		
		if(Filter.Resp_cons_cd != null && filter.Resp_cons_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESP_CONS_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resp_cons_cd;
		}
		
		if(Filter.Ord_loc_cd != null && filter.Ord_loc_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORD_LOC_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ord_loc_cd;
		}
		
		if(Filter.Ord_loc_nm != null && filter.Ord_loc_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORD_LOC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ord_loc_nm;
		}
		
		if(Filter.Resp_cons_nm != null && filter.Resp_cons_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESP_CONS_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resp_cons_nm;
		}
		
		if(Filter.Req_user_nm != null && filter.Req_user_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQ_USER_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Req_user_nm;
		}
		
		if(Filter.Perf_ord_no != null && filter.Perf_ord_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PERF_ORD_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Perf_ord_no;
		}
		
		if(Filter.Msg_src_id != null && filter.Msg_src_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MSG_SRC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Msg_src_id;
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey;
		}
		
		if(Filter.Ord_sname != null && filter.Ord_sname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORD_SNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ord_sname;
		}
		
		if(Filter.Ord_fname != null && filter.Ord_fname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORD_FNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ord_fname;
		}
		
		if(Filter.Ord_sex != null && filter.Ord_sex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORD_SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ord_sex;
		}
		
		if(Filter.Ord_dob != null && filter.Ord_dob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORD_DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ord_dob;
		}
		
		if(Filter.Ord_title != null && filter.Ord_title.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORD_TITLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ord_title;
		}
		
		if(Filter.Ord_nhs_no != null && filter.Ord_nhs_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORD_NHS_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ord_nhs_no;
		}
		
		if(Filter.Ord_ext_patid != null && filter.Ord_ext_patid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORD_EXT_PATID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ord_ext_patid;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Clnc_note != null && filter.Clnc_note.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLNC_NOTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clnc_note;
		}
		
		if(Filter.Perf_tel != null && filter.Perf_tel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PERF_TEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Perf_tel;
		}
		
		if(Filter.Perf_org_nm != null && filter.Perf_org_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PERF_ORG_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Perf_org_nm;
		}
		
		if(Filter.Numdays != null && filter.Numdays.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NUMDAYS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Numdays;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Ocs_ord_specimenRecord data = (Ocs_ord_specimenRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeSpecimen_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPECIMEN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Specimen_id);
		}
		
		if(EditFilter.IncludeOrder_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORDER_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Order_id);
		}
		
		if(EditFilter.IncludeSpc_coll_date)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_COLL_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_coll_date);
		}
		
		if(EditFilter.IncludeSpc_coll_time)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_COLL_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_coll_time);
		}
		
		if(EditFilter.IncludeSpc_coll_end_dt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_COLL_END_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_coll_end_dt);
		}
		
		if(EditFilter.IncludeSpc_coll_end_tm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_COLL_END_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_coll_end_tm);
		}
		
		if(EditFilter.IncludeSpc_coll_vol)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_COLL_VOL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_coll_vol);
		}
		
		if(EditFilter.IncludeSpc_coll_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_COLL_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_coll_id);
		}
		
		if(EditFilter.IncludeSpc_act_cd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_ACT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_act_cd);
		}
		
		if(EditFilter.IncludeSpc_rx_dt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_RX_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_rx_dt);
		}
		
		if(EditFilter.IncludeSpc_rx_tm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_RX_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_rx_tm);
		}
		
		if(EditFilter.IncludeSpc_site_cd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_SITE_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_site_cd);
		}
		
		if(EditFilter.IncludeSpc_site_nm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_SITE_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_site_nm);
		}
		
		if(EditFilter.IncludeSpc_src_cd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_SRC_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_src_cd);
		}
		
		if(EditFilter.IncludeSpc_src_nm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_SRC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_src_nm);
		}
		
		if(EditFilter.IncludeSpc_cmnt_txt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_CMNT_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_cmnt_txt);
		}
		
		if(EditFilter.IncludeSpc_no_cont)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_NO_CONT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_no_cont);
		}
		
		if(EditFilter.IncludeSpc_tport)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_TPORT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_tport);
		}
		
		if(EditFilter.IncludeSpc_perf_cd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_PERF_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_perf_cd);
		}
		
		if(EditFilter.IncludePerf_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PERF_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Perf_id);
		}
		
		if(EditFilter.IncludeDiscip_ext_cd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DISCIP_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Discip_ext_cd);
		}
		
		if(EditFilter.IncludeAbn_flag)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ABN_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Abn_flag);
		}
		
		if(EditFilter.IncludeVw_stat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "VW_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Vw_stat);
		}
		
		if(EditFilter.IncludeSpc_item_list)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPC_ITEM_LIST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_item_list);
		}
		
		if(EditFilter.IncludeTest_cat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TEST_CAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Test_cat);
		}
		
		if(EditFilter.IncludeDisplay_date)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DISPLAY_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Display_date);
		}
		
		if(EditFilter.IncludeDisplay_time)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DISPLAY_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Display_time);
		}
		
		if(EditFilter.IncludeDisplay_flag)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DISPLAY_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Display_flag);
		}
		
		if(EditFilter.IncludeDiscipline)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DISCIPLINE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Discipline);
		}
		
		if(EditFilter.IncludeVw_stat_txt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "VW_STAT_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Vw_stat_txt);
		}
		
		if(EditFilter.IncludeDate_of_reqt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DATE_OF_REQT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Date_of_reqt);
		}
		
		if(EditFilter.IncludeTime_of_reqt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TIME_OF_REQT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Time_of_reqt);
		}
		
		if(EditFilter.IncludeReqtg_user_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQTG_USER_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reqtg_user_id);
		}
		
		if(EditFilter.IncludeResp_cons_cd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESP_CONS_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resp_cons_cd);
		}
		
		if(EditFilter.IncludeOrd_loc_cd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORD_LOC_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ord_loc_cd);
		}
		
		if(EditFilter.IncludeOrd_loc_nm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORD_LOC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ord_loc_nm);
		}
		
		if(EditFilter.IncludeResp_cons_nm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESP_CONS_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resp_cons_nm);
		}
		
		if(EditFilter.IncludeReq_user_nm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQ_USER_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Req_user_nm);
		}
		
		if(EditFilter.IncludePerf_ord_no)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PERF_ORD_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Perf_ord_no);
		}
		
		if(EditFilter.IncludeMsg_src_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MSG_SRC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Msg_src_id);
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
		}
		
		if(EditFilter.IncludeOrd_sname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORD_SNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ord_sname);
		}
		
		if(EditFilter.IncludeOrd_fname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORD_FNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ord_fname);
		}
		
		if(EditFilter.IncludeOrd_sex)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORD_SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ord_sex);
		}
		
		if(EditFilter.IncludeOrd_dob)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORD_DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ord_dob);
		}
		
		if(EditFilter.IncludeOrd_title)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORD_TITLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ord_title);
		}
		
		if(EditFilter.IncludeOrd_nhs_no)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORD_NHS_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ord_nhs_no);
		}
		
		if(EditFilter.IncludeOrd_ext_patid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORD_EXT_PATID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ord_ext_patid);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeClnc_note)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLNC_NOTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clnc_note);
		}
		
		if(EditFilter.IncludePerf_tel)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PERF_TEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Perf_tel);
		}
		
		if(EditFilter.IncludePerf_org_nm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PERF_ORG_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Perf_org_nm);
		}
		
		if(EditFilter.IncludeNumdays)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NUMDAYS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Numdays);
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
			Ocs_ord_specimenRecord record = new Ocs_ord_specimenRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Specimen_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPECIMEN_ID"));
			record.Order_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORDER_ID"));
			record.Spc_coll_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_DATE"));
			record.Spc_coll_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_TIME"));
			record.Spc_coll_end_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_END_DT"));
			record.Spc_coll_end_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_END_TM"));
			record.Spc_coll_vol = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_VOL"));
			record.Spc_coll_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_ID"));
			record.Spc_act_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_ACT_CD"));
			record.Spc_rx_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_RX_DT"));
			record.Spc_rx_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_RX_TM"));
			record.Spc_site_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SITE_CD"));
			record.Spc_site_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SITE_NM"));
			record.Spc_src_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SRC_CD"));
			record.Spc_src_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SRC_NM"));
			record.Spc_cmnt_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_CMNT_TXT"));
			record.Spc_no_cont = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_NO_CONT"));
			record.Spc_tport = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_TPORT"));
			record.Spc_perf_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_PERF_CD"));
			record.Perf_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_ID"));
			record.Discip_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISCIP_EXT_CD"));
			record.Abn_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ABN_FLAG"));
			record.Vw_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VW_STAT"));
			record.Spc_item_list = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_ITEM_LIST"));
			record.Test_cat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEST_CAT"));
			record.Display_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISPLAY_DATE"));
			record.Display_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISPLAY_TIME"));
			record.Display_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISPLAY_FLAG"));
			record.Discipline = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISCIPLINE"));
			record.Vw_stat_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VW_STAT_TXT"));
			record.Date_of_reqt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATE_OF_REQT"));
			record.Time_of_reqt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TIME_OF_REQT"));
			record.Reqtg_user_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQTG_USER_ID"));
			record.Resp_cons_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESP_CONS_CD"));
			record.Ord_loc_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_LOC_CD"));
			record.Ord_loc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_LOC_NM"));
			record.Resp_cons_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESP_CONS_NM"));
			record.Req_user_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQ_USER_NM"));
			record.Perf_ord_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_ORD_NO"));
			record.Msg_src_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSG_SRC_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Ord_sname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_SNAME"));
			record.Ord_fname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_FNAME"));
			record.Ord_sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_SEX"));
			record.Ord_dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_DOB"));
			record.Ord_title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_TITLE"));
			record.Ord_nhs_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_NHS_NO"));
			record.Ord_ext_patid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_EXT_PATID"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Clnc_note = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLNC_NOTE"));
			record.Perf_tel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_TEL"));
			record.Perf_org_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_ORG_NM"));
			record.Numdays = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NUMDAYS"));
									
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
			Ocs_ord_specimenRecord record = new Ocs_ord_specimenRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Specimen_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPECIMEN_ID"));
			record.Order_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORDER_ID"));
			record.Spc_coll_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_DATE"));
			record.Spc_coll_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_TIME"));
			record.Spc_coll_end_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_END_DT"));
			record.Spc_coll_end_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_END_TM"));
			record.Spc_coll_vol = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_VOL"));
			record.Spc_coll_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_ID"));
			record.Spc_act_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_ACT_CD"));
			record.Spc_rx_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_RX_DT"));
			record.Spc_rx_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_RX_TM"));
			record.Spc_site_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SITE_CD"));
			record.Spc_site_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SITE_NM"));
			record.Spc_src_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SRC_CD"));
			record.Spc_src_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SRC_NM"));
			record.Spc_cmnt_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_CMNT_TXT"));
			record.Spc_no_cont = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_NO_CONT"));
			record.Spc_tport = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_TPORT"));
			record.Spc_perf_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_PERF_CD"));
			record.Perf_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_ID"));
			record.Discip_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISCIP_EXT_CD"));
			record.Abn_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ABN_FLAG"));
			record.Vw_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VW_STAT"));
			record.Spc_item_list = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_ITEM_LIST"));
			record.Test_cat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEST_CAT"));
			record.Display_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISPLAY_DATE"));
			record.Display_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISPLAY_TIME"));
			record.Display_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISPLAY_FLAG"));
			record.Discipline = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISCIPLINE"));
			record.Vw_stat_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VW_STAT_TXT"));
			record.Date_of_reqt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATE_OF_REQT"));
			record.Time_of_reqt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TIME_OF_REQT"));
			record.Reqtg_user_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQTG_USER_ID"));
			record.Resp_cons_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESP_CONS_CD"));
			record.Ord_loc_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_LOC_CD"));
			record.Ord_loc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_LOC_NM"));
			record.Resp_cons_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESP_CONS_NM"));
			record.Req_user_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQ_USER_NM"));
			record.Perf_ord_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_ORD_NO"));
			record.Msg_src_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSG_SRC_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Ord_sname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_SNAME"));
			record.Ord_fname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_FNAME"));
			record.Ord_sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_SEX"));
			record.Ord_dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_DOB"));
			record.Ord_title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_TITLE"));
			record.Ord_nhs_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_NHS_NO"));
			record.Ord_ext_patid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_EXT_PATID"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Clnc_note = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLNC_NOTE"));
			record.Perf_tel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_TEL"));
			record.Perf_org_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_ORG_NM"));
			record.Numdays = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NUMDAYS"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Ocs_ord_specimenCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Ocs_ord_specimenRecord newRecord = new Ocs_ord_specimenRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Ocs_ord_specimenRecord record)
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
		public Ocs_ord_specimenRecord get(int index)
		{
			return (Ocs_ord_specimenRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Ocs_ord_specimenRecord
	{
		public String Specimen_id = "";
		public String Order_id = "";
		public String Spc_coll_date = "";
		public String Spc_coll_time = "";
		public String Spc_coll_end_dt = "";
		public String Spc_coll_end_tm = "";
		public String Spc_coll_vol = "";
		public String Spc_coll_id = "";
		public String Spc_act_cd = "";
		public String Spc_rx_dt = "";
		public String Spc_rx_tm = "";
		public String Spc_site_cd = "";
		public String Spc_site_nm = "";
		public String Spc_src_cd = "";
		public String Spc_src_nm = "";
		public String Spc_cmnt_txt = "";
		public String Spc_no_cont = "";
		public String Spc_tport = "";
		public String Spc_perf_cd = "";
		public String Perf_id = "";
		public String Discip_ext_cd = "";
		public String Abn_flag = "";
		public String Vw_stat = "";
		public String Spc_item_list = "";
		public String Test_cat = "";
		public String Display_date = "";
		public String Display_time = "";
		public String Display_flag = "";
		public String Discipline = "";
		public String Vw_stat_txt = "";
		public String Date_of_reqt = "";
		public String Time_of_reqt = "";
		public String Reqtg_user_id = "";
		public String Resp_cons_cd = "";
		public String Ord_loc_cd = "";
		public String Ord_loc_nm = "";
		public String Resp_cons_nm = "";
		public String Req_user_nm = "";
		public String Perf_ord_no = "";
		public String Msg_src_id = "";
		public String Pkey = "";
		public String Ord_sname = "";
		public String Ord_fname = "";
		public String Ord_sex = "";
		public String Ord_dob = "";
		public String Ord_title = "";
		public String Ord_nhs_no = "";
		public String Ord_ext_patid = "";
		public String Tstp = "";
		public String Clnc_note = "";
		public String Perf_tel = "";
		public String Perf_org_nm = "";
		public String Numdays = "";
				
		
		public void clear()
		{
			Specimen_id = "";
			Order_id = "";
			Spc_coll_date = "";
			Spc_coll_time = "";
			Spc_coll_end_dt = "";
			Spc_coll_end_tm = "";
			Spc_coll_vol = "";
			Spc_coll_id = "";
			Spc_act_cd = "";
			Spc_rx_dt = "";
			Spc_rx_tm = "";
			Spc_site_cd = "";
			Spc_site_nm = "";
			Spc_src_cd = "";
			Spc_src_nm = "";
			Spc_cmnt_txt = "";
			Spc_no_cont = "";
			Spc_tport = "";
			Spc_perf_cd = "";
			Perf_id = "";
			Discip_ext_cd = "";
			Abn_flag = "";
			Vw_stat = "";
			Spc_item_list = "";
			Test_cat = "";
			Display_date = "";
			Display_time = "";
			Display_flag = "";
			Discipline = "";
			Vw_stat_txt = "";
			Date_of_reqt = "";
			Time_of_reqt = "";
			Reqtg_user_id = "";
			Resp_cons_cd = "";
			Ord_loc_cd = "";
			Ord_loc_nm = "";
			Resp_cons_nm = "";
			Req_user_nm = "";
			Perf_ord_no = "";
			Msg_src_id = "";
			Pkey = "";
			Ord_sname = "";
			Ord_fname = "";
			Ord_sex = "";
			Ord_dob = "";
			Ord_title = "";
			Ord_nhs_no = "";
			Ord_ext_patid = "";
			Tstp = "";
			Clnc_note = "";
			Perf_tel = "";
			Perf_org_nm = "";
			Numdays = "";
			
		}		
	}
		
		
	public final class Ocs_ord_specimenFilter
	{			
		public String Specimen_id = "";
		public String Order_id = "";
		public String Spc_coll_date = "";
		public String Spc_coll_time = "";
		public String Spc_coll_end_dt = "";
		public String Spc_coll_end_tm = "";
		public String Spc_coll_vol = "";
		public String Spc_coll_id = "";
		public String Spc_act_cd = "";
		public String Spc_rx_dt = "";
		public String Spc_rx_tm = "";
		public String Spc_site_cd = "";
		public String Spc_site_nm = "";
		public String Spc_src_cd = "";
		public String Spc_src_nm = "";
		public String Spc_cmnt_txt = "";
		public String Spc_no_cont = "";
		public String Spc_tport = "";
		public String Spc_perf_cd = "";
		public String Perf_id = "";
		public String Discip_ext_cd = "";
		public String Abn_flag = "";
		public String Vw_stat = "";
		public String Spc_item_list = "";
		public String Test_cat = "";
		public String Display_date = "";
		public String Display_time = "";
		public String Display_flag = "";
		public String Discipline = "";
		public String Vw_stat_txt = "";
		public String Date_of_reqt = "";
		public String Time_of_reqt = "";
		public String Reqtg_user_id = "";
		public String Resp_cons_cd = "";
		public String Ord_loc_cd = "";
		public String Ord_loc_nm = "";
		public String Resp_cons_nm = "";
		public String Req_user_nm = "";
		public String Perf_ord_no = "";
		public String Msg_src_id = "";
		public String Pkey = "";
		public String Ord_sname = "";
		public String Ord_fname = "";
		public String Ord_sex = "";
		public String Ord_dob = "";
		public String Ord_title = "";
		public String Ord_nhs_no = "";
		public String Ord_ext_patid = "";
		public String Tstp = "";
		public String Clnc_note = "";
		public String Perf_tel = "";
		public String Perf_org_nm = "";
		public String Numdays = "";
		
		public void clear()
		{				
			Specimen_id = "";
			Order_id = "";
			Spc_coll_date = "";
			Spc_coll_time = "";
			Spc_coll_end_dt = "";
			Spc_coll_end_tm = "";
			Spc_coll_vol = "";
			Spc_coll_id = "";
			Spc_act_cd = "";
			Spc_rx_dt = "";
			Spc_rx_tm = "";
			Spc_site_cd = "";
			Spc_site_nm = "";
			Spc_src_cd = "";
			Spc_src_nm = "";
			Spc_cmnt_txt = "";
			Spc_no_cont = "";
			Spc_tport = "";
			Spc_perf_cd = "";
			Perf_id = "";
			Discip_ext_cd = "";
			Abn_flag = "";
			Vw_stat = "";
			Spc_item_list = "";
			Test_cat = "";
			Display_date = "";
			Display_time = "";
			Display_flag = "";
			Discipline = "";
			Vw_stat_txt = "";
			Date_of_reqt = "";
			Time_of_reqt = "";
			Reqtg_user_id = "";
			Resp_cons_cd = "";
			Ord_loc_cd = "";
			Ord_loc_nm = "";
			Resp_cons_nm = "";
			Req_user_nm = "";
			Perf_ord_no = "";
			Msg_src_id = "";
			Pkey = "";
			Ord_sname = "";
			Ord_fname = "";
			Ord_sex = "";
			Ord_dob = "";
			Ord_title = "";
			Ord_nhs_no = "";
			Ord_ext_patid = "";
			Tstp = "";
			Clnc_note = "";
			Perf_tel = "";
			Perf_org_nm = "";
			Numdays = "";
		}	
		public Ocs_ord_specimenFilter cloneObject()
		{
			Ocs_ord_specimenFilter newFilter = new Ocs_ord_specimenFilter();
			
			newFilter.Specimen_id = this.Specimen_id;
			newFilter.Order_id = this.Order_id;
			newFilter.Spc_coll_date = this.Spc_coll_date;
			newFilter.Spc_coll_time = this.Spc_coll_time;
			newFilter.Spc_coll_end_dt = this.Spc_coll_end_dt;
			newFilter.Spc_coll_end_tm = this.Spc_coll_end_tm;
			newFilter.Spc_coll_vol = this.Spc_coll_vol;
			newFilter.Spc_coll_id = this.Spc_coll_id;
			newFilter.Spc_act_cd = this.Spc_act_cd;
			newFilter.Spc_rx_dt = this.Spc_rx_dt;
			newFilter.Spc_rx_tm = this.Spc_rx_tm;
			newFilter.Spc_site_cd = this.Spc_site_cd;
			newFilter.Spc_site_nm = this.Spc_site_nm;
			newFilter.Spc_src_cd = this.Spc_src_cd;
			newFilter.Spc_src_nm = this.Spc_src_nm;
			newFilter.Spc_cmnt_txt = this.Spc_cmnt_txt;
			newFilter.Spc_no_cont = this.Spc_no_cont;
			newFilter.Spc_tport = this.Spc_tport;
			newFilter.Spc_perf_cd = this.Spc_perf_cd;
			newFilter.Perf_id = this.Perf_id;
			newFilter.Discip_ext_cd = this.Discip_ext_cd;
			newFilter.Abn_flag = this.Abn_flag;
			newFilter.Vw_stat = this.Vw_stat;
			newFilter.Spc_item_list = this.Spc_item_list;
			newFilter.Test_cat = this.Test_cat;
			newFilter.Display_date = this.Display_date;
			newFilter.Display_time = this.Display_time;
			newFilter.Display_flag = this.Display_flag;
			newFilter.Discipline = this.Discipline;
			newFilter.Vw_stat_txt = this.Vw_stat_txt;
			newFilter.Date_of_reqt = this.Date_of_reqt;
			newFilter.Time_of_reqt = this.Time_of_reqt;
			newFilter.Reqtg_user_id = this.Reqtg_user_id;
			newFilter.Resp_cons_cd = this.Resp_cons_cd;
			newFilter.Ord_loc_cd = this.Ord_loc_cd;
			newFilter.Ord_loc_nm = this.Ord_loc_nm;
			newFilter.Resp_cons_nm = this.Resp_cons_nm;
			newFilter.Req_user_nm = this.Req_user_nm;
			newFilter.Perf_ord_no = this.Perf_ord_no;
			newFilter.Msg_src_id = this.Msg_src_id;
			newFilter.Pkey = this.Pkey;
			newFilter.Ord_sname = this.Ord_sname;
			newFilter.Ord_fname = this.Ord_fname;
			newFilter.Ord_sex = this.Ord_sex;
			newFilter.Ord_dob = this.Ord_dob;
			newFilter.Ord_title = this.Ord_title;
			newFilter.Ord_nhs_no = this.Ord_nhs_no;
			newFilter.Ord_ext_patid = this.Ord_ext_patid;
			newFilter.Tstp = this.Tstp;
			newFilter.Clnc_note = this.Clnc_note;
			newFilter.Perf_tel = this.Perf_tel;
			newFilter.Perf_org_nm = this.Perf_org_nm;
			newFilter.Numdays = this.Numdays;
			
			return newFilter;
		}
	}
	public final class Ocs_ord_specimenEditFilter
	{			
		public boolean IncludeSpecimen_id = true;
		public boolean IncludeOrder_id = true;
		public boolean IncludeSpc_coll_date = true;
		public boolean IncludeSpc_coll_time = true;
		public boolean IncludeSpc_coll_end_dt = true;
		public boolean IncludeSpc_coll_end_tm = true;
		public boolean IncludeSpc_coll_vol = true;
		public boolean IncludeSpc_coll_id = true;
		public boolean IncludeSpc_act_cd = true;
		public boolean IncludeSpc_rx_dt = true;
		public boolean IncludeSpc_rx_tm = true;
		public boolean IncludeSpc_site_cd = true;
		public boolean IncludeSpc_site_nm = true;
		public boolean IncludeSpc_src_cd = true;
		public boolean IncludeSpc_src_nm = true;
		public boolean IncludeSpc_cmnt_txt = true;
		public boolean IncludeSpc_no_cont = true;
		public boolean IncludeSpc_tport = true;
		public boolean IncludeSpc_perf_cd = true;
		public boolean IncludePerf_id = true;
		public boolean IncludeDiscip_ext_cd = true;
		public boolean IncludeAbn_flag = true;
		public boolean IncludeVw_stat = true;
		public boolean IncludeSpc_item_list = true;
		public boolean IncludeTest_cat = true;
		public boolean IncludeDisplay_date = true;
		public boolean IncludeDisplay_time = true;
		public boolean IncludeDisplay_flag = true;
		public boolean IncludeDiscipline = true;
		public boolean IncludeVw_stat_txt = true;
		public boolean IncludeDate_of_reqt = true;
		public boolean IncludeTime_of_reqt = true;
		public boolean IncludeReqtg_user_id = true;
		public boolean IncludeResp_cons_cd = true;
		public boolean IncludeOrd_loc_cd = true;
		public boolean IncludeOrd_loc_nm = true;
		public boolean IncludeResp_cons_nm = true;
		public boolean IncludeReq_user_nm = true;
		public boolean IncludePerf_ord_no = true;
		public boolean IncludeMsg_src_id = true;
		public boolean IncludePkey = true;
		public boolean IncludeOrd_sname = true;
		public boolean IncludeOrd_fname = true;
		public boolean IncludeOrd_sex = true;
		public boolean IncludeOrd_dob = true;
		public boolean IncludeOrd_title = true;
		public boolean IncludeOrd_nhs_no = true;
		public boolean IncludeOrd_ext_patid = true;
		public boolean IncludeTstp = true;
		public boolean IncludeClnc_note = true;
		public boolean IncludePerf_tel = true;
		public boolean IncludePerf_org_nm = true;
		public boolean IncludeNumdays = true;
		
		public void includeAll()
		{				
			IncludeSpecimen_id = true;
			IncludeOrder_id = true;
			IncludeSpc_coll_date = true;
			IncludeSpc_coll_time = true;
			IncludeSpc_coll_end_dt = true;
			IncludeSpc_coll_end_tm = true;
			IncludeSpc_coll_vol = true;
			IncludeSpc_coll_id = true;
			IncludeSpc_act_cd = true;
			IncludeSpc_rx_dt = true;
			IncludeSpc_rx_tm = true;
			IncludeSpc_site_cd = true;
			IncludeSpc_site_nm = true;
			IncludeSpc_src_cd = true;
			IncludeSpc_src_nm = true;
			IncludeSpc_cmnt_txt = true;
			IncludeSpc_no_cont = true;
			IncludeSpc_tport = true;
			IncludeSpc_perf_cd = true;
			IncludePerf_id = true;
			IncludeDiscip_ext_cd = true;
			IncludeAbn_flag = true;
			IncludeVw_stat = true;
			IncludeSpc_item_list = true;
			IncludeTest_cat = true;
			IncludeDisplay_date = true;
			IncludeDisplay_time = true;
			IncludeDisplay_flag = true;
			IncludeDiscipline = true;
			IncludeVw_stat_txt = true;
			IncludeDate_of_reqt = true;
			IncludeTime_of_reqt = true;
			IncludeReqtg_user_id = true;
			IncludeResp_cons_cd = true;
			IncludeOrd_loc_cd = true;
			IncludeOrd_loc_nm = true;
			IncludeResp_cons_nm = true;
			IncludeReq_user_nm = true;
			IncludePerf_ord_no = true;
			IncludeMsg_src_id = true;
			IncludePkey = true;
			IncludeOrd_sname = true;
			IncludeOrd_fname = true;
			IncludeOrd_sex = true;
			IncludeOrd_dob = true;
			IncludeOrd_title = true;
			IncludeOrd_nhs_no = true;
			IncludeOrd_ext_patid = true;
			IncludeTstp = true;
			IncludeClnc_note = true;
			IncludePerf_tel = true;
			IncludePerf_org_nm = true;
			IncludeNumdays = true;
		}	
		public void excludeAll()
		{				
			IncludeSpecimen_id = false;
			IncludeOrder_id = false;
			IncludeSpc_coll_date = false;
			IncludeSpc_coll_time = false;
			IncludeSpc_coll_end_dt = false;
			IncludeSpc_coll_end_tm = false;
			IncludeSpc_coll_vol = false;
			IncludeSpc_coll_id = false;
			IncludeSpc_act_cd = false;
			IncludeSpc_rx_dt = false;
			IncludeSpc_rx_tm = false;
			IncludeSpc_site_cd = false;
			IncludeSpc_site_nm = false;
			IncludeSpc_src_cd = false;
			IncludeSpc_src_nm = false;
			IncludeSpc_cmnt_txt = false;
			IncludeSpc_no_cont = false;
			IncludeSpc_tport = false;
			IncludeSpc_perf_cd = false;
			IncludePerf_id = false;
			IncludeDiscip_ext_cd = false;
			IncludeAbn_flag = false;
			IncludeVw_stat = false;
			IncludeSpc_item_list = false;
			IncludeTest_cat = false;
			IncludeDisplay_date = false;
			IncludeDisplay_time = false;
			IncludeDisplay_flag = false;
			IncludeDiscipline = false;
			IncludeVw_stat_txt = false;
			IncludeDate_of_reqt = false;
			IncludeTime_of_reqt = false;
			IncludeReqtg_user_id = false;
			IncludeResp_cons_cd = false;
			IncludeOrd_loc_cd = false;
			IncludeOrd_loc_nm = false;
			IncludeResp_cons_nm = false;
			IncludeReq_user_nm = false;
			IncludePerf_ord_no = false;
			IncludeMsg_src_id = false;
			IncludePkey = false;
			IncludeOrd_sname = false;
			IncludeOrd_fname = false;
			IncludeOrd_sex = false;
			IncludeOrd_dob = false;
			IncludeOrd_title = false;
			IncludeOrd_nhs_no = false;
			IncludeOrd_ext_patid = false;
			IncludeTstp = false;
			IncludeClnc_note = false;
			IncludePerf_tel = false;
			IncludePerf_org_nm = false;
			IncludeNumdays = false;
		}
		public Ocs_ord_specimenEditFilter cloneObject()
		{
			Ocs_ord_specimenEditFilter newEditFilter = new Ocs_ord_specimenEditFilter();
			
			newEditFilter.IncludeSpecimen_id = this.IncludeSpecimen_id;
			newEditFilter.IncludeOrder_id = this.IncludeOrder_id;
			newEditFilter.IncludeSpc_coll_date = this.IncludeSpc_coll_date;
			newEditFilter.IncludeSpc_coll_time = this.IncludeSpc_coll_time;
			newEditFilter.IncludeSpc_coll_end_dt = this.IncludeSpc_coll_end_dt;
			newEditFilter.IncludeSpc_coll_end_tm = this.IncludeSpc_coll_end_tm;
			newEditFilter.IncludeSpc_coll_vol = this.IncludeSpc_coll_vol;
			newEditFilter.IncludeSpc_coll_id = this.IncludeSpc_coll_id;
			newEditFilter.IncludeSpc_act_cd = this.IncludeSpc_act_cd;
			newEditFilter.IncludeSpc_rx_dt = this.IncludeSpc_rx_dt;
			newEditFilter.IncludeSpc_rx_tm = this.IncludeSpc_rx_tm;
			newEditFilter.IncludeSpc_site_cd = this.IncludeSpc_site_cd;
			newEditFilter.IncludeSpc_site_nm = this.IncludeSpc_site_nm;
			newEditFilter.IncludeSpc_src_cd = this.IncludeSpc_src_cd;
			newEditFilter.IncludeSpc_src_nm = this.IncludeSpc_src_nm;
			newEditFilter.IncludeSpc_cmnt_txt = this.IncludeSpc_cmnt_txt;
			newEditFilter.IncludeSpc_no_cont = this.IncludeSpc_no_cont;
			newEditFilter.IncludeSpc_tport = this.IncludeSpc_tport;
			newEditFilter.IncludeSpc_perf_cd = this.IncludeSpc_perf_cd;
			newEditFilter.IncludePerf_id = this.IncludePerf_id;
			newEditFilter.IncludeDiscip_ext_cd = this.IncludeDiscip_ext_cd;
			newEditFilter.IncludeAbn_flag = this.IncludeAbn_flag;
			newEditFilter.IncludeVw_stat = this.IncludeVw_stat;
			newEditFilter.IncludeSpc_item_list = this.IncludeSpc_item_list;
			newEditFilter.IncludeTest_cat = this.IncludeTest_cat;
			newEditFilter.IncludeDisplay_date = this.IncludeDisplay_date;
			newEditFilter.IncludeDisplay_time = this.IncludeDisplay_time;
			newEditFilter.IncludeDisplay_flag = this.IncludeDisplay_flag;
			newEditFilter.IncludeDiscipline = this.IncludeDiscipline;
			newEditFilter.IncludeVw_stat_txt = this.IncludeVw_stat_txt;
			newEditFilter.IncludeDate_of_reqt = this.IncludeDate_of_reqt;
			newEditFilter.IncludeTime_of_reqt = this.IncludeTime_of_reqt;
			newEditFilter.IncludeReqtg_user_id = this.IncludeReqtg_user_id;
			newEditFilter.IncludeResp_cons_cd = this.IncludeResp_cons_cd;
			newEditFilter.IncludeOrd_loc_cd = this.IncludeOrd_loc_cd;
			newEditFilter.IncludeOrd_loc_nm = this.IncludeOrd_loc_nm;
			newEditFilter.IncludeResp_cons_nm = this.IncludeResp_cons_nm;
			newEditFilter.IncludeReq_user_nm = this.IncludeReq_user_nm;
			newEditFilter.IncludePerf_ord_no = this.IncludePerf_ord_no;
			newEditFilter.IncludeMsg_src_id = this.IncludeMsg_src_id;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeOrd_sname = this.IncludeOrd_sname;
			newEditFilter.IncludeOrd_fname = this.IncludeOrd_fname;
			newEditFilter.IncludeOrd_sex = this.IncludeOrd_sex;
			newEditFilter.IncludeOrd_dob = this.IncludeOrd_dob;
			newEditFilter.IncludeOrd_title = this.IncludeOrd_title;
			newEditFilter.IncludeOrd_nhs_no = this.IncludeOrd_nhs_no;
			newEditFilter.IncludeOrd_ext_patid = this.IncludeOrd_ext_patid;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeClnc_note = this.IncludeClnc_note;
			newEditFilter.IncludePerf_tel = this.IncludePerf_tel;
			newEditFilter.IncludePerf_org_nm = this.IncludePerf_org_nm;
			newEditFilter.IncludeNumdays = this.IncludeNumdays;
			
			return newEditFilter;
		}
	}
}
