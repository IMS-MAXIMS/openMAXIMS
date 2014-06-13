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
// Template ver. 1.0.2 - Last modified on 08/03/2004 10:42 by Marius Mihalec

package ims.dto.client;

public final class Ocs_results
{
	private Ocs_resultsFilter lastGetFilter = null;
	private final String serviceName = "OCS_RESULTS";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Ocs_resultsFilter Filter = new Ocs_resultsFilter();			
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Ocs_resultsCollection DataCollection = new Ocs_resultsCollection();

	/**
	 * Creates a new Ocs_results Data Transfer Object.
	 */ 
	public Ocs_results(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Ocs_results cloneObject() throws ims.dto.Exception
	{
		Ocs_results cloneObject = new Ocs_results(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Res_id = DataCollection.get(x).Res_id;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Ahid = DataCollection.get(x).Ahid;
			cloneObject.DataCollection.get(index).Perf_ord_num = DataCollection.get(x).Perf_ord_num;
			cloneObject.DataCollection.get(index).Dept_discip = DataCollection.get(x).Dept_discip;
			cloneObject.DataCollection.get(index).Discip_ext_cd = DataCollection.get(x).Discip_ext_cd;
			cloneObject.DataCollection.get(index).Perf_name = DataCollection.get(x).Perf_name;
			cloneObject.DataCollection.get(index).Parent_ord_no = DataCollection.get(x).Parent_ord_no;
			cloneObject.DataCollection.get(index).Rep_date = DataCollection.get(x).Rep_date;
			cloneObject.DataCollection.get(index).Rep_time = DataCollection.get(x).Rep_time;
			cloneObject.DataCollection.get(index).Res_stat_hd = DataCollection.get(x).Res_stat_hd;
			cloneObject.DataCollection.get(index).Parent_res_id = DataCollection.get(x).Parent_res_id;
			cloneObject.DataCollection.get(index).Pr_res_interp_cd = DataCollection.get(x).Pr_res_interp_cd;
			cloneObject.DataCollection.get(index).Pr_res_interp_nm = DataCollection.get(x).Pr_res_interp_nm;
			cloneObject.DataCollection.get(index).Ass_res_interp_cd = DataCollection.get(x).Ass_res_interp_cd;
			cloneObject.DataCollection.get(index).Ass_res_interp_nm = DataCollection.get(x).Ass_res_interp_nm;
			cloneObject.DataCollection.get(index).Tech_code = DataCollection.get(x).Tech_code;
			cloneObject.DataCollection.get(index).Tech_name = DataCollection.get(x).Tech_name;
			cloneObject.DataCollection.get(index).Trans_code = DataCollection.get(x).Trans_code;
			cloneObject.DataCollection.get(index).Trans_name = DataCollection.get(x).Trans_name;
			cloneObject.DataCollection.get(index).Cr_dt = DataCollection.get(x).Cr_dt;
			cloneObject.DataCollection.get(index).Cr_tm = DataCollection.get(x).Cr_tm;
			cloneObject.DataCollection.get(index).Vw_stat = DataCollection.get(x).Vw_stat;
			cloneObject.DataCollection.get(index).Abn_fl = DataCollection.get(x).Abn_fl;
			cloneObject.DataCollection.get(index).Perf_tel = DataCollection.get(x).Perf_tel;
			cloneObject.DataCollection.get(index).Code_context_id = DataCollection.get(x).Code_context_id;
			cloneObject.DataCollection.get(index).Test_cd = DataCollection.get(x).Test_cd;
			cloneObject.DataCollection.get(index).Test_ext_nm = DataCollection.get(x).Test_ext_nm;
			cloneObject.DataCollection.get(index).Test_ext_cd = DataCollection.get(x).Test_ext_cd;
			cloneObject.DataCollection.get(index).Test_cat = DataCollection.get(x).Test_cat;
			cloneObject.DataCollection.get(index).Test_note = DataCollection.get(x).Test_note;
			cloneObject.DataCollection.get(index).Perf_org_nm = DataCollection.get(x).Perf_org_nm;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Display_date = DataCollection.get(x).Display_date;
			cloneObject.DataCollection.get(index).Display_time = DataCollection.get(x).Display_time;
			cloneObject.DataCollection.get(index).Msg_src_id = DataCollection.get(x).Msg_src_id;
			cloneObject.DataCollection.get(index).Vw_stat_txt = DataCollection.get(x).Vw_stat_txt;
			cloneObject.DataCollection.get(index).Test_nm = DataCollection.get(x).Test_nm;
			cloneObject.DataCollection.get(index).Order_id = DataCollection.get(x).Order_id;
			cloneObject.DataCollection.get(index).Req_ordno = DataCollection.get(x).Req_ordno;
			cloneObject.DataCollection.get(index).Req_user_id = DataCollection.get(x).Req_user_id;
			cloneObject.DataCollection.get(index).Req_user_nm = DataCollection.get(x).Req_user_nm;
			cloneObject.DataCollection.get(index).Req_contact_no = DataCollection.get(x).Req_contact_no;
			cloneObject.DataCollection.get(index).Req_dt = DataCollection.get(x).Req_dt;
			cloneObject.DataCollection.get(index).Req_tm = DataCollection.get(x).Req_tm;
			cloneObject.DataCollection.get(index).Proc_cd = DataCollection.get(x).Proc_cd;
			cloneObject.DataCollection.get(index).Proc_nm = DataCollection.get(x).Proc_nm;
			cloneObject.DataCollection.get(index).Prty_cd = DataCollection.get(x).Prty_cd;
			cloneObject.DataCollection.get(index).Dngr_cd = DataCollection.get(x).Dngr_cd;
			cloneObject.DataCollection.get(index).Dngr_nm = DataCollection.get(x).Dngr_nm;
			cloneObject.DataCollection.get(index).Clnc_note = DataCollection.get(x).Clnc_note;
			cloneObject.DataCollection.get(index).Ord_loc_cd = DataCollection.get(x).Ord_loc_cd;
			cloneObject.DataCollection.get(index).Ord_loc_ext_cd = DataCollection.get(x).Ord_loc_ext_cd;
			cloneObject.DataCollection.get(index).Resp_cons_cd = DataCollection.get(x).Resp_cons_cd;
			cloneObject.DataCollection.get(index).Resp_cons_ext_cd = DataCollection.get(x).Resp_cons_ext_cd;
			cloneObject.DataCollection.get(index).Ord_loc_nm = DataCollection.get(x).Ord_loc_nm;
			cloneObject.DataCollection.get(index).Ord_loc_ext_nm = DataCollection.get(x).Ord_loc_ext_nm;
			cloneObject.DataCollection.get(index).Resp_cons_nm = DataCollection.get(x).Resp_cons_nm;
			cloneObject.DataCollection.get(index).Resp_cons_ext_nm = DataCollection.get(x).Resp_cons_ext_nm;
			cloneObject.DataCollection.get(index).Ext_patid = DataCollection.get(x).Ext_patid;
			cloneObject.DataCollection.get(index).Sname = DataCollection.get(x).Sname;
			cloneObject.DataCollection.get(index).Res_pat_id = DataCollection.get(x).Res_pat_id;
			cloneObject.DataCollection.get(index).Int_patid = DataCollection.get(x).Int_patid;
			cloneObject.DataCollection.get(index).Title = DataCollection.get(x).Title;
			cloneObject.DataCollection.get(index).Fname = DataCollection.get(x).Fname;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Sexcode = DataCollection.get(x).Sexcode;
			cloneObject.DataCollection.get(index).Sex = DataCollection.get(x).Sex;
			cloneObject.DataCollection.get(index).Add1 = DataCollection.get(x).Add1;
			cloneObject.DataCollection.get(index).Add2 = DataCollection.get(x).Add2;
			cloneObject.DataCollection.get(index).Add3 = DataCollection.get(x).Add3;
			cloneObject.DataCollection.get(index).Add4 = DataCollection.get(x).Add4;
			cloneObject.DataCollection.get(index).Add5 = DataCollection.get(x).Add5;
			cloneObject.DataCollection.get(index).Ac_no = DataCollection.get(x).Ac_no;
			cloneObject.DataCollection.get(index).Ss_no = DataCollection.get(x).Ss_no;
			cloneObject.DataCollection.get(index).Nhs_no = DataCollection.get(x).Nhs_no;
			cloneObject.DataCollection.get(index).Res_nhs_no = DataCollection.get(x).Res_nhs_no;
			cloneObject.DataCollection.get(index).Res_ext_patid = DataCollection.get(x).Res_ext_patid;
			cloneObject.DataCollection.get(index).Res_ext_patid_type = DataCollection.get(x).Res_ext_patid_type;
			cloneObject.DataCollection.get(index).Res_sname = DataCollection.get(x).Res_sname;
			cloneObject.DataCollection.get(index).Res_title = DataCollection.get(x).Res_title;
			cloneObject.DataCollection.get(index).Res_fname = DataCollection.get(x).Res_fname;
			cloneObject.DataCollection.get(index).Res_dob = DataCollection.get(x).Res_dob;
			cloneObject.DataCollection.get(index).Res_sex = DataCollection.get(x).Res_sex;
			cloneObject.DataCollection.get(index).Res_add1 = DataCollection.get(x).Res_add1;
			cloneObject.DataCollection.get(index).Res_add2 = DataCollection.get(x).Res_add2;
			cloneObject.DataCollection.get(index).Res_add3 = DataCollection.get(x).Res_add3;
			cloneObject.DataCollection.get(index).Res_add4 = DataCollection.get(x).Res_add4;
			cloneObject.DataCollection.get(index).Rej_reason = DataCollection.get(x).Rej_reason;
			cloneObject.DataCollection.get(index).Rej_reason_txt = DataCollection.get(x).Rej_reason_txt;
			cloneObject.DataCollection.get(index).Res_spec_id = DataCollection.get(x).Res_spec_id;
			cloneObject.DataCollection.get(index).Spc_coll_dt = DataCollection.get(x).Spc_coll_dt;
			cloneObject.DataCollection.get(index).Spc_coll_tm = DataCollection.get(x).Spc_coll_tm;
			cloneObject.DataCollection.get(index).Spc_coll_end_dt = DataCollection.get(x).Spc_coll_end_dt;
			cloneObject.DataCollection.get(index).Spc_coll_end_tm = DataCollection.get(x).Spc_coll_end_tm;
			cloneObject.DataCollection.get(index).Spc_coll_vol = DataCollection.get(x).Spc_coll_vol;
			cloneObject.DataCollection.get(index).Spc_coll_cd = DataCollection.get(x).Spc_coll_cd;
			cloneObject.DataCollection.get(index).Spc_act_cd = DataCollection.get(x).Spc_act_cd;
			cloneObject.DataCollection.get(index).Spc_rx_dt = DataCollection.get(x).Spc_rx_dt;
			cloneObject.DataCollection.get(index).Spc_rx_time = DataCollection.get(x).Spc_rx_time;
			cloneObject.DataCollection.get(index).Spc_site_cd = DataCollection.get(x).Spc_site_cd;
			cloneObject.DataCollection.get(index).Spc_site_ext_cd = DataCollection.get(x).Spc_site_ext_cd;
			cloneObject.DataCollection.get(index).Spc_site_nm = DataCollection.get(x).Spc_site_nm;
			cloneObject.DataCollection.get(index).Spc_src_cd = DataCollection.get(x).Spc_src_cd;
			cloneObject.DataCollection.get(index).Spc_src_ext_cd = DataCollection.get(x).Spc_src_ext_cd;
			cloneObject.DataCollection.get(index).Spc_src_nm = DataCollection.get(x).Spc_src_nm;
			cloneObject.DataCollection.get(index).Spc_no_cont = DataCollection.get(x).Spc_no_cont;
			cloneObject.DataCollection.get(index).Spc_tport = DataCollection.get(x).Spc_tport;
			cloneObject.DataCollection.get(index).Spc_cmnt_txt = DataCollection.get(x).Spc_cmnt_txt;
			cloneObject.DataCollection.get(index).Spc_perf_cd = DataCollection.get(x).Spc_perf_cd;
			cloneObject.DataCollection.get(index).Res_cmnt = DataCollection.get(x).Res_cmnt;
			cloneObject.DataCollection.get(index).Spec_results = DataCollection.get(x).Spec_results;
			cloneObject.DataCollection.get(index).Resord_msg_src_id = DataCollection.get(x).Resord_msg_src_id;
			cloneObject.DataCollection.get(index).Numdays = DataCollection.get(x).Numdays;
			cloneObject.DataCollection.get(index).Display_flag = DataCollection.get(x).Display_flag;
			cloneObject.DataCollection.get(index).Chart_flag = DataCollection.get(x).Chart_flag;
			cloneObject.DataCollection.get(index).Rg_update_flag = DataCollection.get(x).Rg_update_flag;
			cloneObject.DataCollection.get(index).Authorised_flag = DataCollection.get(x).Authorised_flag;
							
			
			for(int iRescomm_seqno = 0; iRescomm_seqno < DataCollection.get(x).Rescomm_seqnoCollection.count(); iRescomm_seqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Rescomm_seqnoCollection.add();
					
				cloneObject.DataCollection.get(index).Rescomm_seqnoCollection.get(rIndex).Rescomm_seqno = DataCollection.get(x).Rescomm_seqnoCollection.get(iRescomm_seqno).Rescomm_seqno;
				cloneObject.DataCollection.get(index).Rescomm_seqnoCollection.get(rIndex).Cmnt_type_cd = DataCollection.get(x).Rescomm_seqnoCollection.get(iRescomm_seqno).Cmnt_type_cd;
				cloneObject.DataCollection.get(index).Rescomm_seqnoCollection.get(rIndex).Cmnt_src = DataCollection.get(x).Rescomm_seqnoCollection.get(iRescomm_seqno).Cmnt_src;
				cloneObject.DataCollection.get(index).Rescomm_seqnoCollection.get(rIndex).Rescomm_txt = DataCollection.get(x).Rescomm_seqnoCollection.get(iRescomm_seqno).Rescomm_txt;
										
			}
			
			for(int iRes_comp_seq = 0; iRes_comp_seq < DataCollection.get(x).Res_comp_seqCollection.count(); iRes_comp_seq++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Res_comp_seqCollection.add();
					
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Res_comp_seq = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Res_comp_seq;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Comp_msg_src_id = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Comp_msg_src_id;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Res_comp_id = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Res_comp_id;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Res_cd = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Res_cd;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Res_name = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Res_name;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Res_ext_name = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Res_ext_name;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Res_val_type = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Res_val_type;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Res_val = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Res_val;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Unit_of_measure = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Unit_of_measure;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Ref_range = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Ref_range;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Abnormal_flag = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Abnormal_flag;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Res_stat = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Res_stat;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Date_of_obs = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Date_of_obs;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Time_of_obs = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Time_of_obs;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Res_comp_cmnt = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Res_comp_cmnt;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Res_comp_txt = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Res_comp_txt;
				cloneObject.DataCollection.get(index).Res_comp_seqCollection.get(rIndex).Res_ext_cd = DataCollection.get(x).Res_comp_seqCollection.get(iRes_comp_seq).Res_ext_cd;
										
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_results.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Ocs_results.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_results.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_results.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_results.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Ocs_results.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Ocs_results.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_results.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Ocs_results.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Ocs_results.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Ocs_results.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Ocs_results.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Ocs_results.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_results.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Ocs_results.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Ocs_results.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Ocs_results.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Ocs_results.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Ocs_results.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_results.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Ocs_results.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Ocs_results.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_results.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Ocs_results.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Ocs_results.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Ocs_results.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_results.List");
							
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
	private String encodeNASFilter(Ocs_resultsFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Res_id != null && filter.Res_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_id;
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey;
		}
		
		if(Filter.Ahid != null && filter.Ahid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AHID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ahid;
		}
		
		if(Filter.Perf_ord_num != null && filter.Perf_ord_num.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PERF_ORD_NUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Perf_ord_num;
		}
		
		if(Filter.Dept_discip != null && filter.Dept_discip.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DEPT_DISCIP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dept_discip;
		}
		
		if(Filter.Discip_ext_cd != null && filter.Discip_ext_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DISCIP_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Discip_ext_cd;
		}
		
		if(Filter.Perf_name != null && filter.Perf_name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PERF_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Perf_name;
		}
		
		if(Filter.Parent_ord_no != null && filter.Parent_ord_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PARENT_ORD_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Parent_ord_no;
		}
		
		if(Filter.Rep_date != null && filter.Rep_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REP_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rep_date;
		}
		
		if(Filter.Rep_time != null && filter.Rep_time.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REP_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rep_time;
		}
		
		if(Filter.Res_stat_hd != null && filter.Res_stat_hd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_STAT_HD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_stat_hd;
		}
		
		if(Filter.Parent_res_id != null && filter.Parent_res_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PARENT_RES_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Parent_res_id;
		}
		
		if(Filter.Pr_res_interp_cd != null && filter.Pr_res_interp_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PR_RES_INTERP_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pr_res_interp_cd;
		}
		
		if(Filter.Pr_res_interp_nm != null && filter.Pr_res_interp_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PR_RES_INTERP_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pr_res_interp_nm;
		}
		
		if(Filter.Ass_res_interp_cd != null && filter.Ass_res_interp_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ASS_RES_INTERP_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ass_res_interp_cd;
		}
		
		if(Filter.Ass_res_interp_nm != null && filter.Ass_res_interp_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ASS_RES_INTERP_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ass_res_interp_nm;
		}
		
		if(Filter.Tech_code != null && filter.Tech_code.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TECH_CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tech_code;
		}
		
		if(Filter.Tech_name != null && filter.Tech_name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TECH_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tech_name;
		}
		
		if(Filter.Trans_code != null && filter.Trans_code.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TRANS_CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Trans_code;
		}
		
		if(Filter.Trans_name != null && filter.Trans_name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TRANS_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Trans_name;
		}
		
		if(Filter.Cr_dt != null && filter.Cr_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CR_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cr_dt;
		}
		
		if(Filter.Cr_tm != null && filter.Cr_tm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CR_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cr_tm;
		}
		
		if(Filter.Vw_stat != null && filter.Vw_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "VW_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Vw_stat;
		}
		
		if(Filter.Abn_fl != null && filter.Abn_fl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ABN_FL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Abn_fl;
		}
		
		if(Filter.Perf_tel != null && filter.Perf_tel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PERF_TEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Perf_tel;
		}
		
		if(Filter.Code_context_id != null && filter.Code_context_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CODE_CONTEXT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Code_context_id;
		}
		
		if(Filter.Test_cd != null && filter.Test_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TEST_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Test_cd;
		}
		
		if(Filter.Test_ext_nm != null && filter.Test_ext_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TEST_EXT_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Test_ext_nm;
		}
		
		if(Filter.Test_ext_cd != null && filter.Test_ext_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TEST_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Test_ext_cd;
		}
		
		if(Filter.Test_cat != null && filter.Test_cat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TEST_CAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Test_cat;
		}
		
		if(Filter.Test_note != null && filter.Test_note.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TEST_NOTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Test_note;
		}
		
		if(Filter.Perf_org_nm != null && filter.Perf_org_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PERF_ORG_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Perf_org_nm;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
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
		
		if(Filter.Msg_src_id != null && filter.Msg_src_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MSG_SRC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Msg_src_id;
		}
		
		if(Filter.Vw_stat_txt != null && filter.Vw_stat_txt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "VW_STAT_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Vw_stat_txt;
		}
		
		if(Filter.Test_nm != null && filter.Test_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TEST_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Test_nm;
		}
		
		if(Filter.Order_id != null && filter.Order_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORDER_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Order_id;
		}
		
		if(Filter.Req_ordno != null && filter.Req_ordno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQ_ORDNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Req_ordno;
		}
		
		if(Filter.Req_user_id != null && filter.Req_user_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQ_USER_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Req_user_id;
		}
		
		if(Filter.Req_user_nm != null && filter.Req_user_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQ_USER_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Req_user_nm;
		}
		
		if(Filter.Req_contact_no != null && filter.Req_contact_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQ_CONTACT_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Req_contact_no;
		}
		
		if(Filter.Req_dt != null && filter.Req_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQ_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Req_dt;
		}
		
		if(Filter.Req_tm != null && filter.Req_tm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQ_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Req_tm;
		}
		
		if(Filter.Proc_cd != null && filter.Proc_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PROC_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Proc_cd;
		}
		
		if(Filter.Proc_nm != null && filter.Proc_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PROC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Proc_nm;
		}
		
		if(Filter.Prty_cd != null && filter.Prty_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PRTY_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prty_cd;
		}
		
		if(Filter.Dngr_cd != null && filter.Dngr_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DNGR_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dngr_cd;
		}
		
		if(Filter.Dngr_nm != null && filter.Dngr_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DNGR_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dngr_nm;
		}
		
		if(Filter.Clnc_note != null && filter.Clnc_note.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLNC_NOTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clnc_note;
		}
		
		if(Filter.Ord_loc_cd != null && filter.Ord_loc_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORD_LOC_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ord_loc_cd;
		}
		
		if(Filter.Ord_loc_ext_cd != null && filter.Ord_loc_ext_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORD_LOC_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ord_loc_ext_cd;
		}
		
		if(Filter.Resp_cons_cd != null && filter.Resp_cons_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESP_CONS_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resp_cons_cd;
		}
		
		if(Filter.Resp_cons_ext_cd != null && filter.Resp_cons_ext_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESP_CONS_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resp_cons_ext_cd;
		}
		
		if(Filter.Ord_loc_nm != null && filter.Ord_loc_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORD_LOC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ord_loc_nm;
		}
		
		if(Filter.Ord_loc_ext_nm != null && filter.Ord_loc_ext_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORD_LOC_EXT_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ord_loc_ext_nm;
		}
		
		if(Filter.Resp_cons_nm != null && filter.Resp_cons_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESP_CONS_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resp_cons_nm;
		}
		
		if(Filter.Resp_cons_ext_nm != null && filter.Resp_cons_ext_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESP_CONS_EXT_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resp_cons_ext_nm;
		}
		
		if(Filter.Ext_patid != null && filter.Ext_patid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EXT_PATID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ext_patid;
		}
		
		if(Filter.Sname != null && filter.Sname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sname;
		}
		
		if(Filter.Res_pat_id != null && filter.Res_pat_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_PAT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_pat_id;
		}
		
		if(Filter.Int_patid != null && filter.Int_patid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_PATID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_patid;
		}
		
		if(Filter.Title != null && filter.Title.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TITLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Title;
		}
		
		if(Filter.Fname != null && filter.Fname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fname;
		}
		
		if(Filter.Dob != null && filter.Dob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dob;
		}
		
		if(Filter.Sexcode != null && filter.Sexcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SEXCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sexcode;
		}
		
		if(Filter.Sex != null && filter.Sex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sex;
		}
		
		if(Filter.Add1 != null && filter.Add1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADD1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Add1;
		}
		
		if(Filter.Add2 != null && filter.Add2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADD2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Add2;
		}
		
		if(Filter.Add3 != null && filter.Add3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADD3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Add3;
		}
		
		if(Filter.Add4 != null && filter.Add4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADD4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Add4;
		}
		
		if(Filter.Add5 != null && filter.Add5.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADD5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Add5;
		}
		
		if(Filter.Ac_no != null && filter.Ac_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AC_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ac_no;
		}
		
		if(Filter.Ss_no != null && filter.Ss_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SS_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ss_no;
		}
		
		if(Filter.Nhs_no != null && filter.Nhs_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NHS_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhs_no;
		}
		
		if(Filter.Res_nhs_no != null && filter.Res_nhs_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_NHS_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_nhs_no;
		}
		
		if(Filter.Res_ext_patid != null && filter.Res_ext_patid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_EXT_PATID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_ext_patid;
		}
		
		if(Filter.Res_ext_patid_type != null && filter.Res_ext_patid_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_EXT_PATID_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_ext_patid_type;
		}
		
		if(Filter.Res_sname != null && filter.Res_sname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_SNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_sname;
		}
		
		if(Filter.Res_title != null && filter.Res_title.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_TITLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_title;
		}
		
		if(Filter.Res_fname != null && filter.Res_fname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_FNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_fname;
		}
		
		if(Filter.Res_dob != null && filter.Res_dob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_dob;
		}
		
		if(Filter.Res_sex != null && filter.Res_sex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_sex;
		}
		
		if(Filter.Res_add1 != null && filter.Res_add1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_ADD1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_add1;
		}
		
		if(Filter.Res_add2 != null && filter.Res_add2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_ADD2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_add2;
		}
		
		if(Filter.Res_add3 != null && filter.Res_add3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_ADD3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_add3;
		}
		
		if(Filter.Res_add4 != null && filter.Res_add4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_ADD4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_add4;
		}
		
		if(Filter.Rej_reason != null && filter.Rej_reason.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REJ_REASON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rej_reason;
		}
		
		if(Filter.Rej_reason_txt != null && filter.Rej_reason_txt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REJ_REASON_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rej_reason_txt;
		}
		
		if(Filter.Res_spec_id != null && filter.Res_spec_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_SPEC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_spec_id;
		}
		
		if(Filter.Spc_coll_dt != null && filter.Spc_coll_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_COLL_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_coll_dt;
		}
		
		if(Filter.Spc_coll_tm != null && filter.Spc_coll_tm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_COLL_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_coll_tm;
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
		
		if(Filter.Spc_coll_cd != null && filter.Spc_coll_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_COLL_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_coll_cd;
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
		
		if(Filter.Spc_rx_time != null && filter.Spc_rx_time.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_RX_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_rx_time;
		}
		
		if(Filter.Spc_site_cd != null && filter.Spc_site_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_SITE_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_site_cd;
		}
		
		if(Filter.Spc_site_ext_cd != null && filter.Spc_site_ext_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_SITE_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_site_ext_cd;
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
		
		if(Filter.Spc_src_ext_cd != null && filter.Spc_src_ext_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_SRC_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_src_ext_cd;
		}
		
		if(Filter.Spc_src_nm != null && filter.Spc_src_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_SRC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_src_nm;
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
		
		if(Filter.Spc_cmnt_txt != null && filter.Spc_cmnt_txt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_CMNT_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_cmnt_txt;
		}
		
		if(Filter.Spc_perf_cd != null && filter.Spc_perf_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPC_PERF_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spc_perf_cd;
		}
		
		if(Filter.Res_cmnt != null && filter.Res_cmnt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_CMNT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_cmnt;
		}
		
		if(Filter.Spec_results != null && filter.Spec_results.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPEC_RESULTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spec_results;
		}
		
		if(Filter.Resord_msg_src_id != null && filter.Resord_msg_src_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESORD_MSG_SRC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resord_msg_src_id;
		}
		
		if(Filter.Numdays != null && filter.Numdays.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NUMDAYS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Numdays;
		}
		
		if(Filter.Display_flag != null && filter.Display_flag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DISPLAY_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Display_flag;
		}
		
		if(Filter.Chart_flag != null && filter.Chart_flag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CHART_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Chart_flag;
		}
		
		if(Filter.Rg_update_flag != null && filter.Rg_update_flag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RG_UPDATE_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rg_update_flag;
		}
		
		if(Filter.Authorised_flag != null && filter.Authorised_flag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AUTHORISED_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Authorised_flag;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Ocs_resultsRecord data = (Ocs_resultsRecord)DataCollection.get(0);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_id);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AHID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ahid);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PERF_ORD_NUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Perf_ord_num);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "DEPT_DISCIP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dept_discip);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "DISCIP_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Discip_ext_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PERF_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Perf_name);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PARENT_ORD_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Parent_ord_no);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "REP_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rep_date);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "REP_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rep_time);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_STAT_HD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_stat_hd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PARENT_RES_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Parent_res_id);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PR_RES_INTERP_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pr_res_interp_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PR_RES_INTERP_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pr_res_interp_nm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ASS_RES_INTERP_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ass_res_interp_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ASS_RES_INTERP_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ass_res_interp_nm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TECH_CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tech_code);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TECH_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tech_name);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TRANS_CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Trans_code);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TRANS_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Trans_name);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "CR_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cr_dt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "CR_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cr_tm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "VW_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Vw_stat);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ABN_FL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Abn_fl);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PERF_TEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Perf_tel);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "CODE_CONTEXT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Code_context_id);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TEST_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Test_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TEST_EXT_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Test_ext_nm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TEST_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Test_ext_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TEST_CAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Test_cat);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TEST_NOTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Test_note);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PERF_ORG_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Perf_org_nm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "DISPLAY_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Display_date);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "DISPLAY_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Display_time);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "MSG_SRC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Msg_src_id);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "VW_STAT_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Vw_stat_txt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TEST_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Test_nm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ORDER_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Order_id);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "REQ_ORDNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Req_ordno);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "REQ_USER_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Req_user_id);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "REQ_USER_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Req_user_nm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "REQ_CONTACT_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Req_contact_no);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "REQ_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Req_dt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "REQ_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Req_tm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PROC_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Proc_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PROC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Proc_nm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PRTY_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prty_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "DNGR_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dngr_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "DNGR_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dngr_nm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "CLNC_NOTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clnc_note);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ORD_LOC_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ord_loc_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ORD_LOC_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ord_loc_ext_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RESP_CONS_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resp_cons_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RESP_CONS_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resp_cons_ext_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ORD_LOC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ord_loc_nm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ORD_LOC_EXT_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ord_loc_ext_nm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RESP_CONS_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resp_cons_nm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RESP_CONS_EXT_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resp_cons_ext_nm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "EXT_PATID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ext_patid);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sname);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_PAT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_pat_id);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "INT_PATID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_patid);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TITLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Title);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "FNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fname);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dob);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SEXCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sexcode);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sex);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADD1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Add1);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADD2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Add2);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADD3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Add3);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADD4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Add4);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADD5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Add5);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AC_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ac_no);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SS_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ss_no);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "NHS_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhs_no);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_NHS_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_nhs_no);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_EXT_PATID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_ext_patid);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_EXT_PATID_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_ext_patid_type);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_SNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_sname);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_TITLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_title);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_FNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_fname);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_dob);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_sex);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_ADD1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_add1);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_ADD2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_add2);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_ADD3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_add3);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_ADD4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_add4);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "REJ_REASON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rej_reason);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "REJ_REASON_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rej_reason_txt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_SPEC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_spec_id);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_COLL_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_coll_dt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_COLL_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_coll_tm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_COLL_END_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_coll_end_dt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_COLL_END_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_coll_end_tm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_COLL_VOL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_coll_vol);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_COLL_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_coll_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_ACT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_act_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_RX_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_rx_dt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_RX_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_rx_time);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_SITE_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_site_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_SITE_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_site_ext_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_SITE_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_site_nm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_SRC_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_src_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_SRC_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_src_ext_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_SRC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_src_nm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_NO_CONT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_no_cont);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_TPORT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_tport);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_CMNT_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_cmnt_txt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPC_PERF_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spc_perf_cd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RES_CMNT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_cmnt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPEC_RESULTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spec_results);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RESORD_MSG_SRC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resord_msg_src_id);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "NUMDAYS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Numdays);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "DISPLAY_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Display_flag);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "CHART_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Chart_flag);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RG_UPDATE_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rg_update_flag);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AUTHORISED_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Authorised_flag);
		
		
		for(int x = 0; x < data.Rescomm_seqnoCollection.count(); x++)
		{
			Ocs_resultsRescomm_seqnoRecord rgRecord = (Ocs_resultsRescomm_seqnoRecord)data.Rescomm_seqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESCOMM_SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Rescomm_seqno);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CMNT_TYPE_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Cmnt_type_cd);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CMNT_SRC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Cmnt_src);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESCOMM_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Rescomm_txt);
			
		}
		for(int x = 0; x < data.Res_comp_seqCollection.count(); x++)
		{
			Ocs_resultsRes_comp_seqRecord rgRecord = (Ocs_resultsRes_comp_seqRecord)data.Res_comp_seqCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_COMP_SEQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_comp_seq);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COMP_MSG_SRC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Comp_msg_src_id);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_COMP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_comp_id);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_cd);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_name);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_EXT_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_ext_name);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_VAL_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_val_type);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_VAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_val);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNIT_OF_MEASURE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Unit_of_measure);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REF_RANGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ref_range);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ABNORMAL_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Abnormal_flag);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_stat);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DATE_OF_OBS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Date_of_obs);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TIME_OF_OBS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Time_of_obs);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_COMP_CMNT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_comp_cmnt);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_COMP_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_comp_txt);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_EXT_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_ext_cd);
			
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
			Ocs_resultsRecord record = new Ocs_resultsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Res_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Ahid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AHID"));
			record.Perf_ord_num = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_ORD_NUM"));
			record.Dept_discip = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DEPT_DISCIP"));
			record.Discip_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISCIP_EXT_CD"));
			record.Perf_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_NAME"));
			record.Parent_ord_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PARENT_ORD_NO"));
			record.Rep_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REP_DATE"));
			record.Rep_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REP_TIME"));
			record.Res_stat_hd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_STAT_HD"));
			record.Parent_res_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PARENT_RES_ID"));
			record.Pr_res_interp_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PR_RES_INTERP_CD"));
			record.Pr_res_interp_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PR_RES_INTERP_NM"));
			record.Ass_res_interp_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ASS_RES_INTERP_CD"));
			record.Ass_res_interp_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ASS_RES_INTERP_NM"));
			record.Tech_code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TECH_CODE"));
			record.Tech_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TECH_NAME"));
			record.Trans_code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRANS_CODE"));
			record.Trans_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRANS_NAME"));
			record.Cr_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CR_DT"));
			record.Cr_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CR_TM"));
			record.Vw_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VW_STAT"));
			record.Abn_fl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ABN_FL"));
			record.Perf_tel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_TEL"));
			record.Code_context_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CODE_CONTEXT_ID"));
			record.Test_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEST_CD"));
			record.Test_ext_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEST_EXT_NM"));
			record.Test_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEST_EXT_CD"));
			record.Test_cat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEST_CAT"));
			record.Test_note = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEST_NOTE"));
			record.Perf_org_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_ORG_NM"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Display_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISPLAY_DATE"));
			record.Display_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISPLAY_TIME"));
			record.Msg_src_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSG_SRC_ID"));
			record.Vw_stat_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VW_STAT_TXT"));
			record.Test_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEST_NM"));
			record.Order_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORDER_ID"));
			record.Req_ordno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQ_ORDNO"));
			record.Req_user_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQ_USER_ID"));
			record.Req_user_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQ_USER_NM"));
			record.Req_contact_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQ_CONTACT_NO"));
			record.Req_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQ_DT"));
			record.Req_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQ_TM"));
			record.Proc_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROC_CD"));
			record.Proc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROC_NM"));
			record.Prty_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRTY_CD"));
			record.Dngr_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DNGR_CD"));
			record.Dngr_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DNGR_NM"));
			record.Clnc_note = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLNC_NOTE"));
			record.Ord_loc_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_LOC_CD"));
			record.Ord_loc_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_LOC_EXT_CD"));
			record.Resp_cons_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESP_CONS_CD"));
			record.Resp_cons_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESP_CONS_EXT_CD"));
			record.Ord_loc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_LOC_NM"));
			record.Ord_loc_ext_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_LOC_EXT_NM"));
			record.Resp_cons_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESP_CONS_NM"));
			record.Resp_cons_ext_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESP_CONS_EXT_NM"));
			record.Ext_patid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXT_PATID"));
			record.Sname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNAME"));
			record.Res_pat_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_PAT_ID"));
			record.Int_patid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_PATID"));
			record.Title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLE"));
			record.Fname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNAME"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sexcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEXCODE"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Add1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADD1"));
			record.Add2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADD2"));
			record.Add3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADD3"));
			record.Add4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADD4"));
			record.Add5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADD5"));
			record.Ac_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AC_NO"));
			record.Ss_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SS_NO"));
			record.Nhs_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHS_NO"));
			record.Res_nhs_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_NHS_NO"));
			record.Res_ext_patid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_EXT_PATID"));
			record.Res_ext_patid_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_EXT_PATID_TYPE"));
			record.Res_sname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_SNAME"));
			record.Res_title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_TITLE"));
			record.Res_fname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_FNAME"));
			record.Res_dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_DOB"));
			record.Res_sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_SEX"));
			record.Res_add1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_ADD1"));
			record.Res_add2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_ADD2"));
			record.Res_add3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_ADD3"));
			record.Res_add4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_ADD4"));
			record.Rej_reason = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REJ_REASON"));
			record.Rej_reason_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REJ_REASON_TXT"));
			record.Res_spec_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_SPEC_ID"));
			record.Spc_coll_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_DT"));
			record.Spc_coll_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_TM"));
			record.Spc_coll_end_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_END_DT"));
			record.Spc_coll_end_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_END_TM"));
			record.Spc_coll_vol = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_VOL"));
			record.Spc_coll_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_CD"));
			record.Spc_act_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_ACT_CD"));
			record.Spc_rx_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_RX_DT"));
			record.Spc_rx_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_RX_TIME"));
			record.Spc_site_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SITE_CD"));
			record.Spc_site_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SITE_EXT_CD"));
			record.Spc_site_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SITE_NM"));
			record.Spc_src_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SRC_CD"));
			record.Spc_src_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SRC_EXT_CD"));
			record.Spc_src_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SRC_NM"));
			record.Spc_no_cont = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_NO_CONT"));
			record.Spc_tport = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_TPORT"));
			record.Spc_cmnt_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_CMNT_TXT"));
			record.Spc_perf_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_PERF_CD"));
			record.Res_cmnt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_CMNT"));
			record.Spec_results = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPEC_RESULTS"));
			record.Resord_msg_src_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESORD_MSG_SRC_ID"));
			record.Numdays = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NUMDAYS"));
			record.Display_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISPLAY_FLAG"));
			record.Chart_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHART_FLAG"));
			record.Rg_update_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RG_UPDATE_FLAG"));
			record.Authorised_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AUTHORISED_FLAG"));
									
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
			Ocs_resultsRecord record = new Ocs_resultsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Res_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Ahid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AHID"));
			record.Perf_ord_num = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_ORD_NUM"));
			record.Dept_discip = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DEPT_DISCIP"));
			record.Discip_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISCIP_EXT_CD"));
			record.Perf_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_NAME"));
			record.Parent_ord_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PARENT_ORD_NO"));
			record.Rep_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REP_DATE"));
			record.Rep_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REP_TIME"));
			record.Res_stat_hd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_STAT_HD"));
			record.Parent_res_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PARENT_RES_ID"));
			record.Pr_res_interp_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PR_RES_INTERP_CD"));
			record.Pr_res_interp_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PR_RES_INTERP_NM"));
			record.Ass_res_interp_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ASS_RES_INTERP_CD"));
			record.Ass_res_interp_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ASS_RES_INTERP_NM"));
			record.Tech_code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TECH_CODE"));
			record.Tech_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TECH_NAME"));
			record.Trans_code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRANS_CODE"));
			record.Trans_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRANS_NAME"));
			record.Cr_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CR_DT"));
			record.Cr_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CR_TM"));
			record.Vw_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VW_STAT"));
			record.Abn_fl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ABN_FL"));
			record.Perf_tel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_TEL"));
			record.Code_context_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CODE_CONTEXT_ID"));
			record.Test_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEST_CD"));
			record.Test_ext_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEST_EXT_NM"));
			record.Test_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEST_EXT_CD"));
			record.Test_cat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEST_CAT"));
			record.Test_note = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEST_NOTE"));
			record.Perf_org_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_ORG_NM"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Display_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISPLAY_DATE"));
			record.Display_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISPLAY_TIME"));
			record.Msg_src_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSG_SRC_ID"));
			record.Vw_stat_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VW_STAT_TXT"));
			record.Test_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEST_NM"));
			record.Order_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORDER_ID"));
			record.Req_ordno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQ_ORDNO"));
			record.Req_user_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQ_USER_ID"));
			record.Req_user_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQ_USER_NM"));
			record.Req_contact_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQ_CONTACT_NO"));
			record.Req_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQ_DT"));
			record.Req_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQ_TM"));
			record.Proc_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROC_CD"));
			record.Proc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROC_NM"));
			record.Prty_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRTY_CD"));
			record.Dngr_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DNGR_CD"));
			record.Dngr_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DNGR_NM"));
			record.Clnc_note = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLNC_NOTE"));
			record.Ord_loc_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_LOC_CD"));
			record.Ord_loc_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_LOC_EXT_CD"));
			record.Resp_cons_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESP_CONS_CD"));
			record.Resp_cons_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESP_CONS_EXT_CD"));
			record.Ord_loc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_LOC_NM"));
			record.Ord_loc_ext_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORD_LOC_EXT_NM"));
			record.Resp_cons_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESP_CONS_NM"));
			record.Resp_cons_ext_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESP_CONS_EXT_NM"));
			record.Ext_patid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXT_PATID"));
			record.Sname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNAME"));
			record.Res_pat_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_PAT_ID"));
			record.Int_patid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_PATID"));
			record.Title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLE"));
			record.Fname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNAME"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sexcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEXCODE"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Add1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADD1"));
			record.Add2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADD2"));
			record.Add3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADD3"));
			record.Add4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADD4"));
			record.Add5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADD5"));
			record.Ac_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AC_NO"));
			record.Ss_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SS_NO"));
			record.Nhs_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHS_NO"));
			record.Res_nhs_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_NHS_NO"));
			record.Res_ext_patid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_EXT_PATID"));
			record.Res_ext_patid_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_EXT_PATID_TYPE"));
			record.Res_sname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_SNAME"));
			record.Res_title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_TITLE"));
			record.Res_fname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_FNAME"));
			record.Res_dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_DOB"));
			record.Res_sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_SEX"));
			record.Res_add1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_ADD1"));
			record.Res_add2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_ADD2"));
			record.Res_add3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_ADD3"));
			record.Res_add4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_ADD4"));
			record.Rej_reason = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REJ_REASON"));
			record.Rej_reason_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REJ_REASON_TXT"));
			record.Res_spec_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_SPEC_ID"));
			record.Spc_coll_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_DT"));
			record.Spc_coll_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_TM"));
			record.Spc_coll_end_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_END_DT"));
			record.Spc_coll_end_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_END_TM"));
			record.Spc_coll_vol = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_VOL"));
			record.Spc_coll_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_COLL_CD"));
			record.Spc_act_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_ACT_CD"));
			record.Spc_rx_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_RX_DT"));
			record.Spc_rx_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_RX_TIME"));
			record.Spc_site_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SITE_CD"));
			record.Spc_site_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SITE_EXT_CD"));
			record.Spc_site_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SITE_NM"));
			record.Spc_src_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SRC_CD"));
			record.Spc_src_ext_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SRC_EXT_CD"));
			record.Spc_src_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_SRC_NM"));
			record.Spc_no_cont = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_NO_CONT"));
			record.Spc_tport = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_TPORT"));
			record.Spc_cmnt_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_CMNT_TXT"));
			record.Spc_perf_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPC_PERF_CD"));
			record.Res_cmnt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_CMNT"));
			record.Spec_results = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPEC_RESULTS"));
			record.Resord_msg_src_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESORD_MSG_SRC_ID"));
			record.Numdays = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NUMDAYS"));
			record.Display_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISPLAY_FLAG"));
			record.Chart_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHART_FLAG"));
			record.Rg_update_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RG_UPDATE_FLAG"));
			record.Authorised_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AUTHORISED_FLAG"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("rescomm_seqno"))
					record.Rescomm_seqnoCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_comp_seq"))
					record.Res_comp_seqCollection.add();
			
									
			rgCount = record.Rescomm_seqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("rescomm_seqno"))
					{
						Ocs_resultsRescomm_seqnoRecord rgRecord = record.Rescomm_seqnoCollection.get(recCount);
						rgRecord.Rescomm_seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("cmnt_type_cd"))
					{
						Ocs_resultsRescomm_seqnoRecord rgRecord = record.Rescomm_seqnoCollection.get(recCount);
						rgRecord.Cmnt_type_cd = Connection.getAttributeValue(valueItems[i]);
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
						Ocs_resultsRescomm_seqnoRecord rgRecord = record.Rescomm_seqnoCollection.get(recCount);
						rgRecord.Cmnt_src = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("rescomm_txt"))
					{
						Ocs_resultsRescomm_seqnoRecord rgRecord = record.Rescomm_seqnoCollection.get(recCount);
						rgRecord.Rescomm_txt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Res_comp_seqCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_comp_seq"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Res_comp_seq = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("comp_msg_src_id"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Comp_msg_src_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_comp_id"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Res_comp_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_cd"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Res_cd = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_name"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Res_name = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_ext_name"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Res_ext_name = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_val_type"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Res_val_type = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_val"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Res_val = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("unit_of_measure"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Unit_of_measure = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ref_range"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Ref_range = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("abnormal_flag"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Abnormal_flag = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_stat"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Res_stat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("date_of_obs"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Date_of_obs = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("time_of_obs"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Time_of_obs = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_comp_cmnt"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Res_comp_cmnt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_comp_txt"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Res_comp_txt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_ext_cd"))
					{
						Ocs_resultsRes_comp_seqRecord rgRecord = record.Res_comp_seqCollection.get(recCount);
						rgRecord.Res_ext_cd = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Ocs_resultsCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Ocs_resultsRecord newRecord = new Ocs_resultsRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Ocs_resultsRecord record)
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
		public Ocs_resultsRecord get(int index)
		{
			return (Ocs_resultsRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Ocs_resultsRecord
	{
		public String Res_id = "";
		public String Pkey = "";
		public String Ahid = "";
		public String Perf_ord_num = "";
		public String Dept_discip = "";
		public String Discip_ext_cd = "";
		public String Perf_name = "";
		public String Parent_ord_no = "";
		public String Rep_date = "";
		public String Rep_time = "";
		public String Res_stat_hd = "";
		public String Parent_res_id = "";
		public String Pr_res_interp_cd = "";
		public String Pr_res_interp_nm = "";
		public String Ass_res_interp_cd = "";
		public String Ass_res_interp_nm = "";
		public String Tech_code = "";
		public String Tech_name = "";
		public String Trans_code = "";
		public String Trans_name = "";
		public String Cr_dt = "";
		public String Cr_tm = "";
		public String Vw_stat = "";
		public String Abn_fl = "";
		public String Perf_tel = "";
		public String Code_context_id = "";
		public String Test_cd = "";
		public String Test_ext_nm = "";
		public String Test_ext_cd = "";
		public String Test_cat = "";
		public String Test_note = "";
		public String Perf_org_nm = "";
		public String Tstp = "";
		public String Display_date = "";
		public String Display_time = "";
		public String Msg_src_id = "";
		public String Vw_stat_txt = "";
		public String Test_nm = "";
		public String Order_id = "";
		public String Req_ordno = "";
		public String Req_user_id = "";
		public String Req_user_nm = "";
		public String Req_contact_no = "";
		public String Req_dt = "";
		public String Req_tm = "";
		public String Proc_cd = "";
		public String Proc_nm = "";
		public String Prty_cd = "";
		public String Dngr_cd = "";
		public String Dngr_nm = "";
		public String Clnc_note = "";
		public String Ord_loc_cd = "";
		public String Ord_loc_ext_cd = "";
		public String Resp_cons_cd = "";
		public String Resp_cons_ext_cd = "";
		public String Ord_loc_nm = "";
		public String Ord_loc_ext_nm = "";
		public String Resp_cons_nm = "";
		public String Resp_cons_ext_nm = "";
		public String Ext_patid = "";
		public String Sname = "";
		public String Res_pat_id = "";
		public String Int_patid = "";
		public String Title = "";
		public String Fname = "";
		public String Dob = "";
		public String Sexcode = "";
		public String Sex = "";
		public String Add1 = "";
		public String Add2 = "";
		public String Add3 = "";
		public String Add4 = "";
		public String Add5 = "";
		public String Ac_no = "";
		public String Ss_no = "";
		public String Nhs_no = "";
		public String Res_nhs_no = "";
		public String Res_ext_patid = "";
		public String Res_ext_patid_type = "";
		public String Res_sname = "";
		public String Res_title = "";
		public String Res_fname = "";
		public String Res_dob = "";
		public String Res_sex = "";
		public String Res_add1 = "";
		public String Res_add2 = "";
		public String Res_add3 = "";
		public String Res_add4 = "";
		public String Rej_reason = "";
		public String Rej_reason_txt = "";
		public String Res_spec_id = "";
		public String Spc_coll_dt = "";
		public String Spc_coll_tm = "";
		public String Spc_coll_end_dt = "";
		public String Spc_coll_end_tm = "";
		public String Spc_coll_vol = "";
		public String Spc_coll_cd = "";
		public String Spc_act_cd = "";
		public String Spc_rx_dt = "";
		public String Spc_rx_time = "";
		public String Spc_site_cd = "";
		public String Spc_site_ext_cd = "";
		public String Spc_site_nm = "";
		public String Spc_src_cd = "";
		public String Spc_src_ext_cd = "";
		public String Spc_src_nm = "";
		public String Spc_no_cont = "";
		public String Spc_tport = "";
		public String Spc_cmnt_txt = "";
		public String Spc_perf_cd = "";
		public String Res_cmnt = "";
		public String Spec_results = "";
		public String Resord_msg_src_id = "";
		public String Numdays = "";
		public String Display_flag = "";
		public String Chart_flag = "";
		public String Rg_update_flag = "";
		public String Authorised_flag = "";
		
		public Ocs_resultsRescomm_seqnoCollection Rescomm_seqnoCollection = new Ocs_resultsRescomm_seqnoCollection();
		public Ocs_resultsRes_comp_seqCollection Res_comp_seqCollection = new Ocs_resultsRes_comp_seqCollection();		
		
		public void clear()
		{
			Res_id = "";
			Pkey = "";
			Ahid = "";
			Perf_ord_num = "";
			Dept_discip = "";
			Discip_ext_cd = "";
			Perf_name = "";
			Parent_ord_no = "";
			Rep_date = "";
			Rep_time = "";
			Res_stat_hd = "";
			Parent_res_id = "";
			Pr_res_interp_cd = "";
			Pr_res_interp_nm = "";
			Ass_res_interp_cd = "";
			Ass_res_interp_nm = "";
			Tech_code = "";
			Tech_name = "";
			Trans_code = "";
			Trans_name = "";
			Cr_dt = "";
			Cr_tm = "";
			Vw_stat = "";
			Abn_fl = "";
			Perf_tel = "";
			Code_context_id = "";
			Test_cd = "";
			Test_ext_nm = "";
			Test_ext_cd = "";
			Test_cat = "";
			Test_note = "";
			Perf_org_nm = "";
			Tstp = "";
			Display_date = "";
			Display_time = "";
			Msg_src_id = "";
			Vw_stat_txt = "";
			Test_nm = "";
			Order_id = "";
			Req_ordno = "";
			Req_user_id = "";
			Req_user_nm = "";
			Req_contact_no = "";
			Req_dt = "";
			Req_tm = "";
			Proc_cd = "";
			Proc_nm = "";
			Prty_cd = "";
			Dngr_cd = "";
			Dngr_nm = "";
			Clnc_note = "";
			Ord_loc_cd = "";
			Ord_loc_ext_cd = "";
			Resp_cons_cd = "";
			Resp_cons_ext_cd = "";
			Ord_loc_nm = "";
			Ord_loc_ext_nm = "";
			Resp_cons_nm = "";
			Resp_cons_ext_nm = "";
			Ext_patid = "";
			Sname = "";
			Res_pat_id = "";
			Int_patid = "";
			Title = "";
			Fname = "";
			Dob = "";
			Sexcode = "";
			Sex = "";
			Add1 = "";
			Add2 = "";
			Add3 = "";
			Add4 = "";
			Add5 = "";
			Ac_no = "";
			Ss_no = "";
			Nhs_no = "";
			Res_nhs_no = "";
			Res_ext_patid = "";
			Res_ext_patid_type = "";
			Res_sname = "";
			Res_title = "";
			Res_fname = "";
			Res_dob = "";
			Res_sex = "";
			Res_add1 = "";
			Res_add2 = "";
			Res_add3 = "";
			Res_add4 = "";
			Rej_reason = "";
			Rej_reason_txt = "";
			Res_spec_id = "";
			Spc_coll_dt = "";
			Spc_coll_tm = "";
			Spc_coll_end_dt = "";
			Spc_coll_end_tm = "";
			Spc_coll_vol = "";
			Spc_coll_cd = "";
			Spc_act_cd = "";
			Spc_rx_dt = "";
			Spc_rx_time = "";
			Spc_site_cd = "";
			Spc_site_ext_cd = "";
			Spc_site_nm = "";
			Spc_src_cd = "";
			Spc_src_ext_cd = "";
			Spc_src_nm = "";
			Spc_no_cont = "";
			Spc_tport = "";
			Spc_cmnt_txt = "";
			Spc_perf_cd = "";
			Res_cmnt = "";
			Spec_results = "";
			Resord_msg_src_id = "";
			Numdays = "";
			Display_flag = "";
			Chart_flag = "";
			Rg_update_flag = "";
			Authorised_flag = "";
			
			Rescomm_seqnoCollection.clear();
			Res_comp_seqCollection.clear();
		}		
	}
	
	public final class Ocs_resultsRescomm_seqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Ocs_resultsRescomm_seqnoRecord newRecord = new Ocs_resultsRescomm_seqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Ocs_resultsRescomm_seqnoRecord record)
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
		public Ocs_resultsRescomm_seqnoRecord get(int index)
		{
			return (Ocs_resultsRescomm_seqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Ocs_resultsRes_comp_seqCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Ocs_resultsRes_comp_seqRecord newRecord = new Ocs_resultsRes_comp_seqRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Ocs_resultsRes_comp_seqRecord record)
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
		public Ocs_resultsRes_comp_seqRecord get(int index)
		{
			return (Ocs_resultsRes_comp_seqRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Ocs_resultsRescomm_seqnoRecord
	{
		public String Rescomm_seqno = "";
		public String Cmnt_type_cd = "";
		public String Cmnt_src = "";
		public String Rescomm_txt = "";
		
		public void clear()
		{
			Rescomm_seqno = "";
			Cmnt_type_cd = "";
			Cmnt_src = "";
			Rescomm_txt = "";
			
		}
	}
	public final class Ocs_resultsRes_comp_seqRecord
	{
		public String Res_comp_seq = "";
		public String Comp_msg_src_id = "";
		public String Res_comp_id = "";
		public String Res_cd = "";
		public String Res_name = "";
		public String Res_ext_name = "";
		public String Res_val_type = "";
		public String Res_val = "";
		public String Unit_of_measure = "";
		public String Ref_range = "";
		public String Abnormal_flag = "";
		public String Res_stat = "";
		public String Date_of_obs = "";
		public String Time_of_obs = "";
		public String Res_comp_cmnt = "";
		public String Res_comp_txt = "";
		public String Res_ext_cd = "";
		
		public void clear()
		{
			Res_comp_seq = "";
			Comp_msg_src_id = "";
			Res_comp_id = "";
			Res_cd = "";
			Res_name = "";
			Res_ext_name = "";
			Res_val_type = "";
			Res_val = "";
			Unit_of_measure = "";
			Ref_range = "";
			Abnormal_flag = "";
			Res_stat = "";
			Date_of_obs = "";
			Time_of_obs = "";
			Res_comp_cmnt = "";
			Res_comp_txt = "";
			Res_ext_cd = "";
			
		}
	}	
	public final class Ocs_resultsFilter
	{			
		public String Res_id = "";
		public String Pkey = "";
		public String Ahid = "";
		public String Perf_ord_num = "";
		public String Dept_discip = "";
		public String Discip_ext_cd = "";
		public String Perf_name = "";
		public String Parent_ord_no = "";
		public String Rep_date = "";
		public String Rep_time = "";
		public String Res_stat_hd = "";
		public String Parent_res_id = "";
		public String Pr_res_interp_cd = "";
		public String Pr_res_interp_nm = "";
		public String Ass_res_interp_cd = "";
		public String Ass_res_interp_nm = "";
		public String Tech_code = "";
		public String Tech_name = "";
		public String Trans_code = "";
		public String Trans_name = "";
		public String Cr_dt = "";
		public String Cr_tm = "";
		public String Vw_stat = "";
		public String Abn_fl = "";
		public String Perf_tel = "";
		public String Code_context_id = "";
		public String Test_cd = "";
		public String Test_ext_nm = "";
		public String Test_ext_cd = "";
		public String Test_cat = "";
		public String Test_note = "";
		public String Perf_org_nm = "";
		public String Tstp = "";
		public String Display_date = "";
		public String Display_time = "";
		public String Msg_src_id = "";
		public String Vw_stat_txt = "";
		public String Test_nm = "";
		public String Order_id = "";
		public String Req_ordno = "";
		public String Req_user_id = "";
		public String Req_user_nm = "";
		public String Req_contact_no = "";
		public String Req_dt = "";
		public String Req_tm = "";
		public String Proc_cd = "";
		public String Proc_nm = "";
		public String Prty_cd = "";
		public String Dngr_cd = "";
		public String Dngr_nm = "";
		public String Clnc_note = "";
		public String Ord_loc_cd = "";
		public String Ord_loc_ext_cd = "";
		public String Resp_cons_cd = "";
		public String Resp_cons_ext_cd = "";
		public String Ord_loc_nm = "";
		public String Ord_loc_ext_nm = "";
		public String Resp_cons_nm = "";
		public String Resp_cons_ext_nm = "";
		public String Ext_patid = "";
		public String Sname = "";
		public String Res_pat_id = "";
		public String Int_patid = "";
		public String Title = "";
		public String Fname = "";
		public String Dob = "";
		public String Sexcode = "";
		public String Sex = "";
		public String Add1 = "";
		public String Add2 = "";
		public String Add3 = "";
		public String Add4 = "";
		public String Add5 = "";
		public String Ac_no = "";
		public String Ss_no = "";
		public String Nhs_no = "";
		public String Res_nhs_no = "";
		public String Res_ext_patid = "";
		public String Res_ext_patid_type = "";
		public String Res_sname = "";
		public String Res_title = "";
		public String Res_fname = "";
		public String Res_dob = "";
		public String Res_sex = "";
		public String Res_add1 = "";
		public String Res_add2 = "";
		public String Res_add3 = "";
		public String Res_add4 = "";
		public String Rej_reason = "";
		public String Rej_reason_txt = "";
		public String Res_spec_id = "";
		public String Spc_coll_dt = "";
		public String Spc_coll_tm = "";
		public String Spc_coll_end_dt = "";
		public String Spc_coll_end_tm = "";
		public String Spc_coll_vol = "";
		public String Spc_coll_cd = "";
		public String Spc_act_cd = "";
		public String Spc_rx_dt = "";
		public String Spc_rx_time = "";
		public String Spc_site_cd = "";
		public String Spc_site_ext_cd = "";
		public String Spc_site_nm = "";
		public String Spc_src_cd = "";
		public String Spc_src_ext_cd = "";
		public String Spc_src_nm = "";
		public String Spc_no_cont = "";
		public String Spc_tport = "";
		public String Spc_cmnt_txt = "";
		public String Spc_perf_cd = "";
		public String Res_cmnt = "";
		public String Spec_results = "";
		public String Resord_msg_src_id = "";
		public String Numdays = "";
		public String Display_flag = "";
		public String Chart_flag = "";
		public String Rg_update_flag = "";
		public String Authorised_flag = "";
		
		public void clear()
		{				
			Res_id = "";
			Pkey = "";
			Ahid = "";
			Perf_ord_num = "";
			Dept_discip = "";
			Discip_ext_cd = "";
			Perf_name = "";
			Parent_ord_no = "";
			Rep_date = "";
			Rep_time = "";
			Res_stat_hd = "";
			Parent_res_id = "";
			Pr_res_interp_cd = "";
			Pr_res_interp_nm = "";
			Ass_res_interp_cd = "";
			Ass_res_interp_nm = "";
			Tech_code = "";
			Tech_name = "";
			Trans_code = "";
			Trans_name = "";
			Cr_dt = "";
			Cr_tm = "";
			Vw_stat = "";
			Abn_fl = "";
			Perf_tel = "";
			Code_context_id = "";
			Test_cd = "";
			Test_ext_nm = "";
			Test_ext_cd = "";
			Test_cat = "";
			Test_note = "";
			Perf_org_nm = "";
			Tstp = "";
			Display_date = "";
			Display_time = "";
			Msg_src_id = "";
			Vw_stat_txt = "";
			Test_nm = "";
			Order_id = "";
			Req_ordno = "";
			Req_user_id = "";
			Req_user_nm = "";
			Req_contact_no = "";
			Req_dt = "";
			Req_tm = "";
			Proc_cd = "";
			Proc_nm = "";
			Prty_cd = "";
			Dngr_cd = "";
			Dngr_nm = "";
			Clnc_note = "";
			Ord_loc_cd = "";
			Ord_loc_ext_cd = "";
			Resp_cons_cd = "";
			Resp_cons_ext_cd = "";
			Ord_loc_nm = "";
			Ord_loc_ext_nm = "";
			Resp_cons_nm = "";
			Resp_cons_ext_nm = "";
			Ext_patid = "";
			Sname = "";
			Res_pat_id = "";
			Int_patid = "";
			Title = "";
			Fname = "";
			Dob = "";
			Sexcode = "";
			Sex = "";
			Add1 = "";
			Add2 = "";
			Add3 = "";
			Add4 = "";
			Add5 = "";
			Ac_no = "";
			Ss_no = "";
			Nhs_no = "";
			Res_nhs_no = "";
			Res_ext_patid = "";
			Res_ext_patid_type = "";
			Res_sname = "";
			Res_title = "";
			Res_fname = "";
			Res_dob = "";
			Res_sex = "";
			Res_add1 = "";
			Res_add2 = "";
			Res_add3 = "";
			Res_add4 = "";
			Rej_reason = "";
			Rej_reason_txt = "";
			Res_spec_id = "";
			Spc_coll_dt = "";
			Spc_coll_tm = "";
			Spc_coll_end_dt = "";
			Spc_coll_end_tm = "";
			Spc_coll_vol = "";
			Spc_coll_cd = "";
			Spc_act_cd = "";
			Spc_rx_dt = "";
			Spc_rx_time = "";
			Spc_site_cd = "";
			Spc_site_ext_cd = "";
			Spc_site_nm = "";
			Spc_src_cd = "";
			Spc_src_ext_cd = "";
			Spc_src_nm = "";
			Spc_no_cont = "";
			Spc_tport = "";
			Spc_cmnt_txt = "";
			Spc_perf_cd = "";
			Res_cmnt = "";
			Spec_results = "";
			Resord_msg_src_id = "";
			Numdays = "";
			Display_flag = "";
			Chart_flag = "";
			Rg_update_flag = "";
			Authorised_flag = "";
		}	
		public Ocs_resultsFilter cloneObject()
		{
			Ocs_resultsFilter newFilter = new Ocs_resultsFilter();
			
			newFilter.Res_id = this.Res_id;
			newFilter.Pkey = this.Pkey;
			newFilter.Ahid = this.Ahid;
			newFilter.Perf_ord_num = this.Perf_ord_num;
			newFilter.Dept_discip = this.Dept_discip;
			newFilter.Discip_ext_cd = this.Discip_ext_cd;
			newFilter.Perf_name = this.Perf_name;
			newFilter.Parent_ord_no = this.Parent_ord_no;
			newFilter.Rep_date = this.Rep_date;
			newFilter.Rep_time = this.Rep_time;
			newFilter.Res_stat_hd = this.Res_stat_hd;
			newFilter.Parent_res_id = this.Parent_res_id;
			newFilter.Pr_res_interp_cd = this.Pr_res_interp_cd;
			newFilter.Pr_res_interp_nm = this.Pr_res_interp_nm;
			newFilter.Ass_res_interp_cd = this.Ass_res_interp_cd;
			newFilter.Ass_res_interp_nm = this.Ass_res_interp_nm;
			newFilter.Tech_code = this.Tech_code;
			newFilter.Tech_name = this.Tech_name;
			newFilter.Trans_code = this.Trans_code;
			newFilter.Trans_name = this.Trans_name;
			newFilter.Cr_dt = this.Cr_dt;
			newFilter.Cr_tm = this.Cr_tm;
			newFilter.Vw_stat = this.Vw_stat;
			newFilter.Abn_fl = this.Abn_fl;
			newFilter.Perf_tel = this.Perf_tel;
			newFilter.Code_context_id = this.Code_context_id;
			newFilter.Test_cd = this.Test_cd;
			newFilter.Test_ext_nm = this.Test_ext_nm;
			newFilter.Test_ext_cd = this.Test_ext_cd;
			newFilter.Test_cat = this.Test_cat;
			newFilter.Test_note = this.Test_note;
			newFilter.Perf_org_nm = this.Perf_org_nm;
			newFilter.Tstp = this.Tstp;
			newFilter.Display_date = this.Display_date;
			newFilter.Display_time = this.Display_time;
			newFilter.Msg_src_id = this.Msg_src_id;
			newFilter.Vw_stat_txt = this.Vw_stat_txt;
			newFilter.Test_nm = this.Test_nm;
			newFilter.Order_id = this.Order_id;
			newFilter.Req_ordno = this.Req_ordno;
			newFilter.Req_user_id = this.Req_user_id;
			newFilter.Req_user_nm = this.Req_user_nm;
			newFilter.Req_contact_no = this.Req_contact_no;
			newFilter.Req_dt = this.Req_dt;
			newFilter.Req_tm = this.Req_tm;
			newFilter.Proc_cd = this.Proc_cd;
			newFilter.Proc_nm = this.Proc_nm;
			newFilter.Prty_cd = this.Prty_cd;
			newFilter.Dngr_cd = this.Dngr_cd;
			newFilter.Dngr_nm = this.Dngr_nm;
			newFilter.Clnc_note = this.Clnc_note;
			newFilter.Ord_loc_cd = this.Ord_loc_cd;
			newFilter.Ord_loc_ext_cd = this.Ord_loc_ext_cd;
			newFilter.Resp_cons_cd = this.Resp_cons_cd;
			newFilter.Resp_cons_ext_cd = this.Resp_cons_ext_cd;
			newFilter.Ord_loc_nm = this.Ord_loc_nm;
			newFilter.Ord_loc_ext_nm = this.Ord_loc_ext_nm;
			newFilter.Resp_cons_nm = this.Resp_cons_nm;
			newFilter.Resp_cons_ext_nm = this.Resp_cons_ext_nm;
			newFilter.Ext_patid = this.Ext_patid;
			newFilter.Sname = this.Sname;
			newFilter.Res_pat_id = this.Res_pat_id;
			newFilter.Int_patid = this.Int_patid;
			newFilter.Title = this.Title;
			newFilter.Fname = this.Fname;
			newFilter.Dob = this.Dob;
			newFilter.Sexcode = this.Sexcode;
			newFilter.Sex = this.Sex;
			newFilter.Add1 = this.Add1;
			newFilter.Add2 = this.Add2;
			newFilter.Add3 = this.Add3;
			newFilter.Add4 = this.Add4;
			newFilter.Add5 = this.Add5;
			newFilter.Ac_no = this.Ac_no;
			newFilter.Ss_no = this.Ss_no;
			newFilter.Nhs_no = this.Nhs_no;
			newFilter.Res_nhs_no = this.Res_nhs_no;
			newFilter.Res_ext_patid = this.Res_ext_patid;
			newFilter.Res_ext_patid_type = this.Res_ext_patid_type;
			newFilter.Res_sname = this.Res_sname;
			newFilter.Res_title = this.Res_title;
			newFilter.Res_fname = this.Res_fname;
			newFilter.Res_dob = this.Res_dob;
			newFilter.Res_sex = this.Res_sex;
			newFilter.Res_add1 = this.Res_add1;
			newFilter.Res_add2 = this.Res_add2;
			newFilter.Res_add3 = this.Res_add3;
			newFilter.Res_add4 = this.Res_add4;
			newFilter.Rej_reason = this.Rej_reason;
			newFilter.Rej_reason_txt = this.Rej_reason_txt;
			newFilter.Res_spec_id = this.Res_spec_id;
			newFilter.Spc_coll_dt = this.Spc_coll_dt;
			newFilter.Spc_coll_tm = this.Spc_coll_tm;
			newFilter.Spc_coll_end_dt = this.Spc_coll_end_dt;
			newFilter.Spc_coll_end_tm = this.Spc_coll_end_tm;
			newFilter.Spc_coll_vol = this.Spc_coll_vol;
			newFilter.Spc_coll_cd = this.Spc_coll_cd;
			newFilter.Spc_act_cd = this.Spc_act_cd;
			newFilter.Spc_rx_dt = this.Spc_rx_dt;
			newFilter.Spc_rx_time = this.Spc_rx_time;
			newFilter.Spc_site_cd = this.Spc_site_cd;
			newFilter.Spc_site_ext_cd = this.Spc_site_ext_cd;
			newFilter.Spc_site_nm = this.Spc_site_nm;
			newFilter.Spc_src_cd = this.Spc_src_cd;
			newFilter.Spc_src_ext_cd = this.Spc_src_ext_cd;
			newFilter.Spc_src_nm = this.Spc_src_nm;
			newFilter.Spc_no_cont = this.Spc_no_cont;
			newFilter.Spc_tport = this.Spc_tport;
			newFilter.Spc_cmnt_txt = this.Spc_cmnt_txt;
			newFilter.Spc_perf_cd = this.Spc_perf_cd;
			newFilter.Res_cmnt = this.Res_cmnt;
			newFilter.Spec_results = this.Spec_results;
			newFilter.Resord_msg_src_id = this.Resord_msg_src_id;
			newFilter.Numdays = this.Numdays;
			newFilter.Display_flag = this.Display_flag;
			newFilter.Chart_flag = this.Chart_flag;
			newFilter.Rg_update_flag = this.Rg_update_flag;
			newFilter.Authorised_flag = this.Authorised_flag;
			
			return newFilter;
		}
	}
}
