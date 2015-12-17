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

public final class Sd_appt implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_appt.class);
	
	private Sd_apptFilter lastGetFilter = null;
	private final String serviceName = "SD_APPT";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_apptFilter Filter = new Sd_apptFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_apptEditFilter EditFilter = new Sd_apptEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_apptCollection DataCollection = new Sd_apptCollection();

	/**
	 * Creates a new Sd_appt Data Transfer Object.
	 */ 
	public Sd_appt(ims.dto.Connection connection)
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
	public Sd_appt cloneObject()
	{
		Sd_appt cloneObject = new Sd_appt(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Appt_head_id = DataCollection.get(x).Appt_head_id;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Patient = DataCollection.get(x).Patient;
			cloneObject.DataCollection.get(index).First_appt_id = DataCollection.get(x).First_appt_id;
			cloneObject.DataCollection.get(index).Last_appt_id = DataCollection.get(x).Last_appt_id;
			cloneObject.DataCollection.get(index).No_cancelled = DataCollection.get(x).No_cancelled;
			cloneObject.DataCollection.get(index).No_dna = DataCollection.get(x).No_dna;
			cloneObject.DataCollection.get(index).Booking_sys_type = DataCollection.get(x).Booking_sys_type;
			cloneObject.DataCollection.get(index).Rel_appt_head_id = DataCollection.get(x).Rel_appt_head_id;
			cloneObject.DataCollection.get(index).Pat_let = DataCollection.get(x).Pat_let;
			cloneObject.DataCollection.get(index).Gp_let = DataCollection.get(x).Gp_let;
			cloneObject.DataCollection.get(index).Cmts = DataCollection.get(x).Cmts;
			cloneObject.DataCollection.get(index).Hcp_booking = DataCollection.get(x).Hcp_booking;
			cloneObject.DataCollection.get(index).Datebkd = DataCollection.get(x).Datebkd;
			cloneObject.DataCollection.get(index).Priordatoff = DataCollection.get(x).Priordatoff;
			cloneObject.DataCollection.get(index).Head_stat = DataCollection.get(x).Head_stat;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Surname = DataCollection.get(x).Surname;
			cloneObject.DataCollection.get(index).Forname = DataCollection.get(x).Forname;
			cloneObject.DataCollection.get(index).Title = DataCollection.get(x).Title;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Sex = DataCollection.get(x).Sex;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Treatpl_act_id = DataCollection.get(x).Treatpl_act_id;
			cloneObject.DataCollection.get(index).First_appt_activity_gr = DataCollection.get(x).First_appt_activity_gr;
			cloneObject.DataCollection.get(index).First_appt_activity = DataCollection.get(x).First_appt_activity;
			cloneObject.DataCollection.get(index).First_appt_date = DataCollection.get(x).First_appt_date;
			cloneObject.DataCollection.get(index).First_appt_activitytxt = DataCollection.get(x).First_appt_activitytxt;
			cloneObject.DataCollection.get(index).Last_appt_date = DataCollection.get(x).Last_appt_date;
			cloneObject.DataCollection.get(index).Tran_arrnge_req = DataCollection.get(x).Tran_arrnge_req;
			cloneObject.DataCollection.get(index).Act_consult = DataCollection.get(x).Act_consult;
			cloneObject.DataCollection.get(index).Act_consulttxt = DataCollection.get(x).Act_consulttxt;
			cloneObject.DataCollection.get(index).Transp_cmnt = DataCollection.get(x).Transp_cmnt;
			cloneObject.DataCollection.get(index).Pat_stat = DataCollection.get(x).Pat_stat;
			cloneObject.DataCollection.get(index).First_appt_att_time = DataCollection.get(x).First_appt_att_time;
			cloneObject.DataCollection.get(index).Actplanupdate = DataCollection.get(x).Actplanupdate;
			cloneObject.DataCollection.get(index).Ccs_epid = DataCollection.get(x).Ccs_epid;
							
			
			for(int iAppt_id = 0; iAppt_id < DataCollection.get(x).Appt_idCollection.count(); iAppt_id++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Appt_idCollection.add();
					
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Appt_id = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Appt_id;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Appinpatstat = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Appinpatstat;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Mod_id = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Mod_id;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Energy_val = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Energy_val;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Unit_id = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Unit_id;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Trans_typtxt = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Trans_typtxt;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Act_comp_flg = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Act_comp_flg;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Appt_stat_reason = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Appt_stat_reason;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Lo_id = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Lo_id;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Mc_id = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Mc_id;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Date_chngd = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Date_chngd;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Act_complete_tm = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Act_complete_tm;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Hcp_present = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Hcp_present;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Hcp_seen = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Hcp_seen;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Tm_seen = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Tm_seen;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Disp_cde = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Disp_cde;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Act_loc_att = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Act_loc_att;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Priorty = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Priorty;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Appt_cmts = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Appt_cmts;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Modality_id = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Modality_id;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Hcp_booking1 = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Hcp_booking1;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Prfileass_id = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Prfileass_id;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Trans_typ = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Trans_typ;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Appt_stat = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Appt_stat;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Arr_tme = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Arr_tme;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Att_stat = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Att_stat;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Att_tm = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Att_tm;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).App_dur = DataCollection.get(x).Appt_idCollection.get(iAppt_id).App_dur;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).App_etm = DataCollection.get(x).Appt_idCollection.get(iAppt_id).App_etm;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).App_stm = DataCollection.get(x).Appt_idCollection.get(iAppt_id).App_stm;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Prfiled_sess_id = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Prfiled_sess_id;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Prfile_sess_id = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Prfile_sess_id;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Pkey1 = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Pkey1;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Patient1 = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Patient1;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Appt_dt = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Appt_dt;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Confirm_stat = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Confirm_stat;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Contract_id = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Contract_id;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Recipient1 = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Recipient1;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Recipient2 = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Recipient2;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Recipient3 = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Recipient3;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Recipient4 = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Recipient4;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Recipient5 = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Recipient5;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Recipient6 = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Recipient6;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Recipient7 = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Recipient7;
				cloneObject.DataCollection.get(index).Appt_idCollection.get(rIndex).Action_dets = DataCollection.get(x).Appt_idCollection.get(iAppt_id).Action_dets;
										
			}
			
			for(int iAppt_hist_id = 0; iAppt_hist_id < DataCollection.get(x).Appt_hist_idCollection.count(); iAppt_hist_id++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Appt_hist_idCollection.add();
					
				cloneObject.DataCollection.get(index).Appt_hist_idCollection.get(rIndex).Appt_hist_id = DataCollection.get(x).Appt_hist_idCollection.get(iAppt_hist_id).Appt_hist_id;
				cloneObject.DataCollection.get(index).Appt_hist_idCollection.get(rIndex).Hist_cdate = DataCollection.get(x).Appt_hist_idCollection.get(iAppt_hist_id).Hist_cdate;
				cloneObject.DataCollection.get(index).Appt_hist_idCollection.get(rIndex).First_flag = DataCollection.get(x).Appt_hist_idCollection.get(iAppt_hist_id).First_flag;
				cloneObject.DataCollection.get(index).Appt_hist_idCollection.get(rIndex).Origsessd = DataCollection.get(x).Appt_hist_idCollection.get(iAppt_hist_id).Origsessd;
				cloneObject.DataCollection.get(index).Appt_hist_idCollection.get(rIndex).Hist_dt = DataCollection.get(x).Appt_hist_idCollection.get(iAppt_hist_id).Hist_dt;
				cloneObject.DataCollection.get(index).Appt_hist_idCollection.get(rIndex).Origsess = DataCollection.get(x).Appt_hist_idCollection.get(iAppt_hist_id).Origsess;
				cloneObject.DataCollection.get(index).Appt_hist_idCollection.get(rIndex).Endsess = DataCollection.get(x).Appt_hist_idCollection.get(iAppt_hist_id).Endsess;
				cloneObject.DataCollection.get(index).Appt_hist_idCollection.get(rIndex).Hcp_booking3 = DataCollection.get(x).Appt_hist_idCollection.get(iAppt_hist_id).Hcp_booking3;
				cloneObject.DataCollection.get(index).Appt_hist_idCollection.get(rIndex).Hist_reas = DataCollection.get(x).Appt_hist_idCollection.get(iAppt_hist_id).Hist_reas;
				cloneObject.DataCollection.get(index).Appt_hist_idCollection.get(rIndex).Hist_type = DataCollection.get(x).Appt_hist_idCollection.get(iAppt_hist_id).Hist_type;
				cloneObject.DataCollection.get(index).Appt_hist_idCollection.get(rIndex).Appt_id3 = DataCollection.get(x).Appt_hist_idCollection.get(iAppt_hist_id).Appt_id3;
										
			}
			
			for(int iTrans_seq = 0; iTrans_seq < DataCollection.get(x).Trans_seqCollection.count(); iTrans_seq++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Trans_seqCollection.add();
					
				cloneObject.DataCollection.get(index).Trans_seqCollection.get(rIndex).Trans_seq = DataCollection.get(x).Trans_seqCollection.get(iTrans_seq).Trans_seq;
				cloneObject.DataCollection.get(index).Trans_seqCollection.get(rIndex).Refend_dt = DataCollection.get(x).Trans_seqCollection.get(iTrans_seq).Refend_dt;
				cloneObject.DataCollection.get(index).Trans_seqCollection.get(rIndex).Refstart_dt = DataCollection.get(x).Trans_seqCollection.get(iTrans_seq).Refstart_dt;
				cloneObject.DataCollection.get(index).Trans_seqCollection.get(rIndex).Outref = DataCollection.get(x).Trans_seqCollection.get(iTrans_seq).Outref;
				cloneObject.DataCollection.get(index).Trans_seqCollection.get(rIndex).In_ref = DataCollection.get(x).Trans_seqCollection.get(iTrans_seq).In_ref;
										
			}
			
			for(int iSpec_req_seq = 0; iSpec_req_seq < DataCollection.get(x).Spec_req_seqCollection.count(); iSpec_req_seq++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Spec_req_seqCollection.add();
					
				cloneObject.DataCollection.get(index).Spec_req_seqCollection.get(rIndex).Spec_req_seq = DataCollection.get(x).Spec_req_seqCollection.get(iSpec_req_seq).Spec_req_seq;
				cloneObject.DataCollection.get(index).Spec_req_seqCollection.get(rIndex).Spec_req_id = DataCollection.get(x).Spec_req_seqCollection.get(iSpec_req_seq).Spec_req_id;
				cloneObject.DataCollection.get(index).Spec_req_seqCollection.get(rIndex).Act_ind = DataCollection.get(x).Spec_req_seqCollection.get(iSpec_req_seq).Act_ind;
										
			}
			
			for(int iSeqno = 0; iSeqno < DataCollection.get(x).SeqnoCollection.count(); iSeqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnoCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Seqno = DataCollection.get(x).SeqnoCollection.get(iSeqno).Seqno;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Action_stat = DataCollection.get(x).SeqnoCollection.get(iSeqno).Action_stat;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Appt_id1 = DataCollection.get(x).SeqnoCollection.get(iSeqno).Appt_id1;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Action_id = DataCollection.get(x).SeqnoCollection.get(iSeqno).Action_id;
										
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
		return "Sd_appt.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_appt.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_appt.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_appt.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_appt.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_appt.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_appt.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_appt.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_appt.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_appt.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_appt.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_appt.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_appt.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_appt.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_appt.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_appt.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_appt.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_appt.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_appt.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_appt nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_appt After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_appt After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt.List");
							
		listInProgress = true;	
		logger.debug("Sd_appt Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_appt After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_appt After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_apptFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Appt_head_id != null && filter.Appt_head_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_HEAD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_head_id);
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey);
		}
		
		if(Filter.Patient != null && filter.Patient.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PATIENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Patient);
		}
		
		if(Filter.First_appt_id != null && filter.First_appt_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FIRST_APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.First_appt_id);
		}
		
		if(Filter.Last_appt_id != null && filter.Last_appt_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LAST_APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Last_appt_id);
		}
		
		if(Filter.No_cancelled != null && filter.No_cancelled.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NO_CANCELLED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.No_cancelled);
		}
		
		if(Filter.No_dna != null && filter.No_dna.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NO_DNA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.No_dna);
		}
		
		if(Filter.Booking_sys_type != null && filter.Booking_sys_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("BOOKING_SYS_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Booking_sys_type);
		}
		
		if(Filter.Rel_appt_head_id != null && filter.Rel_appt_head_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REL_APPT_HEAD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rel_appt_head_id);
		}
		
		if(Filter.Pat_let != null && filter.Pat_let.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PAT_LET" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pat_let);
		}
		
		if(Filter.Gp_let != null && filter.Gp_let.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GP_LET" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gp_let);
		}
		
		if(Filter.Cmts != null && filter.Cmts.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CMTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cmts);
		}
		
		if(Filter.Hcp_booking != null && filter.Hcp_booking.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HCP_BOOKING" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_booking);
		}
		
		if(Filter.Datebkd != null && filter.Datebkd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DATEBKD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Datebkd);
		}
		
		if(Filter.Priordatoff != null && filter.Priordatoff.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRIORDATOFF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Priordatoff);
		}
		
		if(Filter.Head_stat != null && filter.Head_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HEAD_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Head_stat);
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum);
		}
		
		if(Filter.Surname != null && filter.Surname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SURNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Surname);
		}
		
		if(Filter.Forname != null && filter.Forname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FORNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Forname);
		}
		
		if(Filter.Title != null && filter.Title.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TITLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Title);
		}
		
		if(Filter.Dob != null && filter.Dob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dob);
		}
		
		if(Filter.Sex != null && filter.Sex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sex);
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
		}
		
		if(Filter.Treatpl_act_id != null && filter.Treatpl_act_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TREATPL_ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Treatpl_act_id);
		}
		
		if(Filter.First_appt_activity_gr != null && filter.First_appt_activity_gr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FIRST_APPT_ACTIVITY_GR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.First_appt_activity_gr);
		}
		
		if(Filter.First_appt_activity != null && filter.First_appt_activity.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FIRST_APPT_ACTIVITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.First_appt_activity);
		}
		
		if(Filter.First_appt_date != null && filter.First_appt_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FIRST_APPT_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.First_appt_date);
		}
		
		if(Filter.First_appt_activitytxt != null && filter.First_appt_activitytxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FIRST_APPT_ACTIVITYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.First_appt_activitytxt);
		}
		
		if(Filter.Last_appt_date != null && filter.Last_appt_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LAST_APPT_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Last_appt_date);
		}
		
		if(Filter.Tran_arrnge_req != null && filter.Tran_arrnge_req.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TRAN_ARRNGE_REQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tran_arrnge_req);
		}
		
		if(Filter.Act_consult != null && filter.Act_consult.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_CONSULT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_consult);
		}
		
		if(Filter.Act_consulttxt != null && filter.Act_consulttxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_CONSULTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_consulttxt);
		}
		
		if(Filter.Transp_cmnt != null && filter.Transp_cmnt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TRANSP_CMNT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Transp_cmnt);
		}
		
		if(Filter.Pat_stat != null && filter.Pat_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PAT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pat_stat);
		}
		
		if(Filter.First_appt_att_time != null && filter.First_appt_att_time.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FIRST_APPT_ATT_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.First_appt_att_time);
		}
		
		if(Filter.Actplanupdate != null && filter.Actplanupdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTPLANUPDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Actplanupdate);
		}
		
		if(Filter.Ccs_epid != null && filter.Ccs_epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccs_epid);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_apptRecord data = (Sd_apptRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeAppt_head_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_HEAD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_head_id));
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey));
		}
		
		if(EditFilter.IncludePatient)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PATIENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Patient));
		}
		
		if(EditFilter.IncludeFirst_appt_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FIRST_APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.First_appt_id));
		}
		
		if(EditFilter.IncludeLast_appt_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LAST_APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Last_appt_id));
		}
		
		if(EditFilter.IncludeNo_cancelled)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NO_CANCELLED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.No_cancelled));
		}
		
		if(EditFilter.IncludeNo_dna)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NO_DNA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.No_dna));
		}
		
		if(EditFilter.IncludeBooking_sys_type)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("BOOKING_SYS_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Booking_sys_type));
		}
		
		if(EditFilter.IncludeRel_appt_head_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REL_APPT_HEAD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rel_appt_head_id));
		}
		
		if(EditFilter.IncludePat_let)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PAT_LET" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pat_let));
		}
		
		if(EditFilter.IncludeGp_let)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GP_LET" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gp_let));
		}
		
		if(EditFilter.IncludeCmts)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CMTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cmts));
		}
		
		if(EditFilter.IncludeHcp_booking)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HCP_BOOKING" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_booking));
		}
		
		if(EditFilter.IncludeDatebkd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DATEBKD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Datebkd));
		}
		
		if(EditFilter.IncludePriordatoff)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRIORDATOFF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Priordatoff));
		}
		
		if(EditFilter.IncludeHead_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HEAD_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Head_stat));
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum));
		}
		
		if(EditFilter.IncludeSurname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SURNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Surname));
		}
		
		if(EditFilter.IncludeForname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FORNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Forname));
		}
		
		if(EditFilter.IncludeTitle)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TITLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Title));
		}
		
		if(EditFilter.IncludeDob)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dob));
		}
		
		if(EditFilter.IncludeSex)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sex));
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
		}
		
		if(EditFilter.IncludeTreatpl_act_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TREATPL_ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Treatpl_act_id));
		}
		
		if(EditFilter.IncludeFirst_appt_activity_gr)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FIRST_APPT_ACTIVITY_GR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.First_appt_activity_gr));
		}
		
		if(EditFilter.IncludeFirst_appt_activity)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FIRST_APPT_ACTIVITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.First_appt_activity));
		}
		
		if(EditFilter.IncludeFirst_appt_date)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FIRST_APPT_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.First_appt_date));
		}
		
		if(EditFilter.IncludeFirst_appt_activitytxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FIRST_APPT_ACTIVITYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.First_appt_activitytxt));
		}
		
		if(EditFilter.IncludeLast_appt_date)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LAST_APPT_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Last_appt_date));
		}
		
		if(EditFilter.IncludeTran_arrnge_req)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TRAN_ARRNGE_REQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tran_arrnge_req));
		}
		
		if(EditFilter.IncludeAct_consult)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_CONSULT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_consult));
		}
		
		if(EditFilter.IncludeAct_consulttxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_CONSULTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_consulttxt));
		}
		
		if(EditFilter.IncludeTransp_cmnt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TRANSP_CMNT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Transp_cmnt));
		}
		
		if(EditFilter.IncludePat_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PAT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pat_stat));
		}
		
		if(EditFilter.IncludeFirst_appt_att_time)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FIRST_APPT_ATT_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.First_appt_att_time));
		}
		
		if(EditFilter.IncludeActplanupdate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTPLANUPDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Actplanupdate));
		}
		
		if(EditFilter.IncludeCcs_epid)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccs_epid));
		}
		
		
		for(int x = 0; x < data.Appt_idCollection.count(); x++)
		{
			Sd_apptAppt_idRecord rgRecord = (Sd_apptAppt_idRecord)data.Appt_idCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Appt_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPINPATSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Appinpatstat));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MOD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mod_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ENERGY_VAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Energy_val));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UNIT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Unit_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TRANS_TYPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Trans_typtxt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_COMP_FLG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_comp_flg));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_STAT_REASON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Appt_stat_reason));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LO_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Lo_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mc_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DATE_CHNGD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Date_chngd));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_COMPLETE_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_complete_tm));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HCP_PRESENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Hcp_present));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HCP_SEEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Hcp_seen));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TM_SEEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Tm_seen));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DISP_CDE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Disp_cde));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_LOC_ATT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_loc_att));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRIORTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Priorty));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_CMTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Appt_cmts));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODALITY_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Modality_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HCP_BOOKING1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Hcp_booking1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILEASS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Prfileass_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TRANS_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Trans_typ));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Appt_stat));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ARR_TME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Arr_tme));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ATT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Att_stat));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ATT_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Att_tm));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APP_DUR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.App_dur));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APP_ETM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.App_etm));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APP_STM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.App_stm));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILED_SESS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Prfiled_sess_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILE_SESS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Prfile_sess_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PKEY1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Pkey1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PATIENT1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Patient1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Appt_dt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONFIRM_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Confirm_stat));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONTRACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Contract_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RECIPIENT1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Recipient1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RECIPIENT2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Recipient2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RECIPIENT3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Recipient3));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RECIPIENT4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Recipient4));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RECIPIENT5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Recipient5));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RECIPIENT6" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Recipient6));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RECIPIENT7" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Recipient7));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_DETS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Action_dets));
			
		}
		for(int x = 0; x < data.Appt_hist_idCollection.count(); x++)
		{
			Sd_apptAppt_hist_idRecord rgRecord = (Sd_apptAppt_hist_idRecord)data.Appt_hist_idCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_HIST_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Appt_hist_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HIST_CDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Hist_cdate));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FIRST_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.First_flag));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ORIGSESSD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Origsessd));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HIST_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Hist_dt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ORIGSESS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Origsess));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ENDSESS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Endsess));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HCP_BOOKING3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Hcp_booking3));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HIST_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Hist_reas));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HIST_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Hist_type));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_ID3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Appt_id3));
			
		}
		for(int x = 0; x < data.Trans_seqCollection.count(); x++)
		{
			Sd_apptTrans_seqRecord rgRecord = (Sd_apptTrans_seqRecord)data.Trans_seqCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TRANS_SEQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Trans_seq));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REFEND_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Refend_dt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REFSTART_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Refstart_dt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OUTREF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Outref));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("IN_REF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.In_ref));
			
		}
		for(int x = 0; x < data.Spec_req_seqCollection.count(); x++)
		{
			Sd_apptSpec_req_seqRecord rgRecord = (Sd_apptSpec_req_seqRecord)data.Spec_req_seqCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SPEC_REQ_SEQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Spec_req_seq));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SPEC_REQ_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Spec_req_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind));
			
		}
		for(int x = 0; x < data.SeqnoCollection.count(); x++)
		{
			Sd_apptSeqnoRecord rgRecord = (Sd_apptSeqnoRecord)data.SeqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Action_stat));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_ID1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Appt_id1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Action_id));
			
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
			Sd_apptRecord record = new Sd_apptRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HEAD_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Patient = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATIENT"));
			record.First_appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_ID"));
			record.Last_appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LAST_APPT_ID"));
			record.No_cancelled = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NO_CANCELLED"));
			record.No_dna = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NO_DNA"));
			record.Booking_sys_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BOOKING_SYS_TYPE"));
			record.Rel_appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REL_APPT_HEAD_ID"));
			record.Pat_let = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_LET"));
			record.Gp_let = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_LET"));
			record.Cmts = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CMTS"));
			record.Hcp_booking = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_BOOKING"));
			record.Datebkd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATEBKD"));
			record.Priordatoff = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRIORDATOFF"));
			record.Head_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HEAD_STAT"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Surname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SURNAME"));
			record.Forname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FORNAME"));
			record.Title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLE"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Treatpl_act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TREATPL_ACT_ID"));
			record.First_appt_activity_gr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_ACTIVITY_GR"));
			record.First_appt_activity = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_ACTIVITY"));
			record.First_appt_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_DATE"));
			record.First_appt_activitytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_ACTIVITYTXT"));
			record.Last_appt_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LAST_APPT_DATE"));
			record.Tran_arrnge_req = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRAN_ARRNGE_REQ"));
			record.Act_consult = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULT"));
			record.Act_consulttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULTTXT"));
			record.Transp_cmnt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRANSP_CMNT"));
			record.Pat_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_STAT"));
			record.First_appt_att_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_ATT_TIME"));
			record.Actplanupdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTPLANUPDATE"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
									
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
			Sd_apptRecord record = new Sd_apptRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HEAD_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Patient = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATIENT"));
			record.First_appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_ID"));
			record.Last_appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LAST_APPT_ID"));
			record.No_cancelled = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NO_CANCELLED"));
			record.No_dna = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NO_DNA"));
			record.Booking_sys_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BOOKING_SYS_TYPE"));
			record.Rel_appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REL_APPT_HEAD_ID"));
			record.Pat_let = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_LET"));
			record.Gp_let = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_LET"));
			record.Cmts = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CMTS"));
			record.Hcp_booking = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_BOOKING"));
			record.Datebkd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATEBKD"));
			record.Priordatoff = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRIORDATOFF"));
			record.Head_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HEAD_STAT"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Surname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SURNAME"));
			record.Forname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FORNAME"));
			record.Title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLE"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Treatpl_act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TREATPL_ACT_ID"));
			record.First_appt_activity_gr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_ACTIVITY_GR"));
			record.First_appt_activity = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_ACTIVITY"));
			record.First_appt_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_DATE"));
			record.First_appt_activitytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_ACTIVITYTXT"));
			record.Last_appt_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LAST_APPT_DATE"));
			record.Tran_arrnge_req = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRAN_ARRNGE_REQ"));
			record.Act_consult = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULT"));
			record.Act_consulttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULTTXT"));
			record.Transp_cmnt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRANSP_CMNT"));
			record.Pat_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_STAT"));
			record.First_appt_att_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_ATT_TIME"));
			record.Actplanupdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTPLANUPDATE"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appt_id"))
					record.Appt_idCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appt_hist_id"))
					record.Appt_hist_idCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("trans_seq"))
					record.Trans_seqCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("spec_req_seq"))
					record.Spec_req_seqCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					record.SeqnoCollection.add();
			
									
			rgCount = record.Appt_idCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appt_id"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Appt_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appinpatstat"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Appinpatstat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("mod_id"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Mod_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("energy_val"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Energy_val = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("unit_id"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Unit_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("trans_typtxt"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Trans_typtxt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_comp_flg"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Act_comp_flg = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appt_stat_reason"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Appt_stat_reason = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("lo_id"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Lo_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("mc_id"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Mc_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("date_chngd"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Date_chngd = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_complete_tm"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Act_complete_tm = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("hcp_present"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Hcp_present = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("hcp_seen"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Hcp_seen = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("tm_seen"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Tm_seen = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("disp_cde"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Disp_cde = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_loc_att"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Act_loc_att = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("priorty"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Priorty = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appt_cmts"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Appt_cmts = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("modality_id"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Modality_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("hcp_booking1"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Hcp_booking1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfileass_id"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Prfileass_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("trans_typ"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Trans_typ = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appt_stat"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Appt_stat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("arr_tme"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Arr_tme = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("att_stat"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Att_stat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("att_tm"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Att_tm = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("app_dur"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.App_dur = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("app_etm"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.App_etm = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("app_stm"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.App_stm = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfiled_sess_id"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Prfiled_sess_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfile_sess_id"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Prfile_sess_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("pkey1"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Pkey1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("patient1"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Patient1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appt_dt"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Appt_dt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("confirm_stat"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Confirm_stat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("contract_id"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Contract_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("recipient1"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Recipient1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("recipient2"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Recipient2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("recipient3"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Recipient3 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("recipient4"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Recipient4 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("recipient5"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Recipient5 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("recipient6"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Recipient6 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("recipient7"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Recipient7 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("action_dets"))
					{
						Sd_apptAppt_idRecord rgRecord = record.Appt_idCollection.get(recCount);
						rgRecord.Action_dets = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Appt_hist_idCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appt_hist_id"))
					{
						Sd_apptAppt_hist_idRecord rgRecord = record.Appt_hist_idCollection.get(recCount);
						rgRecord.Appt_hist_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("hist_cdate"))
					{
						Sd_apptAppt_hist_idRecord rgRecord = record.Appt_hist_idCollection.get(recCount);
						rgRecord.Hist_cdate = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("first_flag"))
					{
						Sd_apptAppt_hist_idRecord rgRecord = record.Appt_hist_idCollection.get(recCount);
						rgRecord.First_flag = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("origsessd"))
					{
						Sd_apptAppt_hist_idRecord rgRecord = record.Appt_hist_idCollection.get(recCount);
						rgRecord.Origsessd = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("hist_dt"))
					{
						Sd_apptAppt_hist_idRecord rgRecord = record.Appt_hist_idCollection.get(recCount);
						rgRecord.Hist_dt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("origsess"))
					{
						Sd_apptAppt_hist_idRecord rgRecord = record.Appt_hist_idCollection.get(recCount);
						rgRecord.Origsess = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("endsess"))
					{
						Sd_apptAppt_hist_idRecord rgRecord = record.Appt_hist_idCollection.get(recCount);
						rgRecord.Endsess = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("hcp_booking3"))
					{
						Sd_apptAppt_hist_idRecord rgRecord = record.Appt_hist_idCollection.get(recCount);
						rgRecord.Hcp_booking3 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("hist_reas"))
					{
						Sd_apptAppt_hist_idRecord rgRecord = record.Appt_hist_idCollection.get(recCount);
						rgRecord.Hist_reas = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("hist_type"))
					{
						Sd_apptAppt_hist_idRecord rgRecord = record.Appt_hist_idCollection.get(recCount);
						rgRecord.Hist_type = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appt_id3"))
					{
						Sd_apptAppt_hist_idRecord rgRecord = record.Appt_hist_idCollection.get(recCount);
						rgRecord.Appt_id3 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Trans_seqCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("trans_seq"))
					{
						Sd_apptTrans_seqRecord rgRecord = record.Trans_seqCollection.get(recCount);
						rgRecord.Trans_seq = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("refend_dt"))
					{
						Sd_apptTrans_seqRecord rgRecord = record.Trans_seqCollection.get(recCount);
						rgRecord.Refend_dt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("refstart_dt"))
					{
						Sd_apptTrans_seqRecord rgRecord = record.Trans_seqCollection.get(recCount);
						rgRecord.Refstart_dt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("outref"))
					{
						Sd_apptTrans_seqRecord rgRecord = record.Trans_seqCollection.get(recCount);
						rgRecord.Outref = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("in_ref"))
					{
						Sd_apptTrans_seqRecord rgRecord = record.Trans_seqCollection.get(recCount);
						rgRecord.In_ref = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Spec_req_seqCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("spec_req_seq"))
					{
						Sd_apptSpec_req_seqRecord rgRecord = record.Spec_req_seqCollection.get(recCount);
						rgRecord.Spec_req_seq = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("spec_req_id"))
					{
						Sd_apptSpec_req_seqRecord rgRecord = record.Spec_req_seqCollection.get(recCount);
						rgRecord.Spec_req_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind"))
					{
						Sd_apptSpec_req_seqRecord rgRecord = record.Spec_req_seqCollection.get(recCount);
						rgRecord.Act_ind = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.SeqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					{
						Sd_apptSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("action_stat"))
					{
						Sd_apptSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Action_stat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appt_id1"))
					{
						Sd_apptSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Appt_id1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("action_id"))
					{
						Sd_apptSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Action_id = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Sd_apptCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_apptRecord newRecord = new Sd_apptRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_apptRecord record)
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
		public Sd_apptRecord get(int index)
		{
			return (Sd_apptRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_apptRecord
	{
		public String Appt_head_id = "";
		public String Pkey = "";
		public String Patient = "";
		public String First_appt_id = "";
		public String Last_appt_id = "";
		public String No_cancelled = "";
		public String No_dna = "";
		public String Booking_sys_type = "";
		public String Rel_appt_head_id = "";
		public String Pat_let = "";
		public String Gp_let = "";
		public String Cmts = "";
		public String Hcp_booking = "";
		public String Datebkd = "";
		public String Priordatoff = "";
		public String Head_stat = "";
		public String Hospnum = "";
		public String Surname = "";
		public String Forname = "";
		public String Title = "";
		public String Dob = "";
		public String Sex = "";
		public String Tstp = "";
		public String Treatpl_act_id = "";
		public String First_appt_activity_gr = "";
		public String First_appt_activity = "";
		public String First_appt_date = "";
		public String First_appt_activitytxt = "";
		public String Last_appt_date = "";
		public String Tran_arrnge_req = "";
		public String Act_consult = "";
		public String Act_consulttxt = "";
		public String Transp_cmnt = "";
		public String Pat_stat = "";
		public String First_appt_att_time = "";
		public String Actplanupdate = "";
		public String Ccs_epid = "";
		
		public Sd_apptAppt_idCollection Appt_idCollection = new Sd_apptAppt_idCollection();
		public Sd_apptAppt_hist_idCollection Appt_hist_idCollection = new Sd_apptAppt_hist_idCollection();
		public Sd_apptTrans_seqCollection Trans_seqCollection = new Sd_apptTrans_seqCollection();
		public Sd_apptSpec_req_seqCollection Spec_req_seqCollection = new Sd_apptSpec_req_seqCollection();
		public Sd_apptSeqnoCollection SeqnoCollection = new Sd_apptSeqnoCollection();		
		
		public void clear()
		{
			Appt_head_id = "";
			Pkey = "";
			Patient = "";
			First_appt_id = "";
			Last_appt_id = "";
			No_cancelled = "";
			No_dna = "";
			Booking_sys_type = "";
			Rel_appt_head_id = "";
			Pat_let = "";
			Gp_let = "";
			Cmts = "";
			Hcp_booking = "";
			Datebkd = "";
			Priordatoff = "";
			Head_stat = "";
			Hospnum = "";
			Surname = "";
			Forname = "";
			Title = "";
			Dob = "";
			Sex = "";
			Tstp = "";
			Treatpl_act_id = "";
			First_appt_activity_gr = "";
			First_appt_activity = "";
			First_appt_date = "";
			First_appt_activitytxt = "";
			Last_appt_date = "";
			Tran_arrnge_req = "";
			Act_consult = "";
			Act_consulttxt = "";
			Transp_cmnt = "";
			Pat_stat = "";
			First_appt_att_time = "";
			Actplanupdate = "";
			Ccs_epid = "";
			
			Appt_idCollection.clear();
			Appt_hist_idCollection.clear();
			Trans_seqCollection.clear();
			Spec_req_seqCollection.clear();
			SeqnoCollection.clear();
		}		
	}
	
	public final class Sd_apptAppt_idCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_apptAppt_idRecord newRecord = new Sd_apptAppt_idRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_apptAppt_idRecord record)
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
		public Sd_apptAppt_idRecord get(int index)
		{
			return (Sd_apptAppt_idRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_apptAppt_hist_idCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_apptAppt_hist_idRecord newRecord = new Sd_apptAppt_hist_idRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_apptAppt_hist_idRecord record)
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
		public Sd_apptAppt_hist_idRecord get(int index)
		{
			return (Sd_apptAppt_hist_idRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_apptTrans_seqCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_apptTrans_seqRecord newRecord = new Sd_apptTrans_seqRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_apptTrans_seqRecord record)
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
		public Sd_apptTrans_seqRecord get(int index)
		{
			return (Sd_apptTrans_seqRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_apptSpec_req_seqCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_apptSpec_req_seqRecord newRecord = new Sd_apptSpec_req_seqRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_apptSpec_req_seqRecord record)
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
		public Sd_apptSpec_req_seqRecord get(int index)
		{
			return (Sd_apptSpec_req_seqRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_apptSeqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_apptSeqnoRecord newRecord = new Sd_apptSeqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_apptSeqnoRecord record)
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
		public Sd_apptSeqnoRecord get(int index)
		{
			return (Sd_apptSeqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Sd_apptAppt_idRecord
	{
		public String Appt_id = "";
		public String Appinpatstat = "";
		public String Mod_id = "";
		public String Energy_val = "";
		public String Unit_id = "";
		public String Trans_typtxt = "";
		public String Act_comp_flg = "";
		public String Appt_stat_reason = "";
		public String Lo_id = "";
		public String Mc_id = "";
		public String Date_chngd = "";
		public String Act_complete_tm = "";
		public String Hcp_present = "";
		public String Hcp_seen = "";
		public String Tm_seen = "";
		public String Disp_cde = "";
		public String Act_loc_att = "";
		public String Priorty = "";
		public String Appt_cmts = "";
		public String Modality_id = "";
		public String Hcp_booking1 = "";
		public String Prfileass_id = "";
		public String Trans_typ = "";
		public String Appt_stat = "";
		public String Arr_tme = "";
		public String Att_stat = "";
		public String Att_tm = "";
		public String App_dur = "";
		public String App_etm = "";
		public String App_stm = "";
		public String Prfiled_sess_id = "";
		public String Prfile_sess_id = "";
		public String Pkey1 = "";
		public String Patient1 = "";
		public String Appt_dt = "";
		public String Confirm_stat = "";
		public String Contract_id = "";
		public String Recipient1 = "";
		public String Recipient2 = "";
		public String Recipient3 = "";
		public String Recipient4 = "";
		public String Recipient5 = "";
		public String Recipient6 = "";
		public String Recipient7 = "";
		public String Action_dets = "";
		
		public void clear()
		{
			Appt_id = "";
			Appinpatstat = "";
			Mod_id = "";
			Energy_val = "";
			Unit_id = "";
			Trans_typtxt = "";
			Act_comp_flg = "";
			Appt_stat_reason = "";
			Lo_id = "";
			Mc_id = "";
			Date_chngd = "";
			Act_complete_tm = "";
			Hcp_present = "";
			Hcp_seen = "";
			Tm_seen = "";
			Disp_cde = "";
			Act_loc_att = "";
			Priorty = "";
			Appt_cmts = "";
			Modality_id = "";
			Hcp_booking1 = "";
			Prfileass_id = "";
			Trans_typ = "";
			Appt_stat = "";
			Arr_tme = "";
			Att_stat = "";
			Att_tm = "";
			App_dur = "";
			App_etm = "";
			App_stm = "";
			Prfiled_sess_id = "";
			Prfile_sess_id = "";
			Pkey1 = "";
			Patient1 = "";
			Appt_dt = "";
			Confirm_stat = "";
			Contract_id = "";
			Recipient1 = "";
			Recipient2 = "";
			Recipient3 = "";
			Recipient4 = "";
			Recipient5 = "";
			Recipient6 = "";
			Recipient7 = "";
			Action_dets = "";
			
		}
	}
	public final class Sd_apptAppt_hist_idRecord
	{
		public String Appt_hist_id = "";
		public String Hist_cdate = "";
		public String First_flag = "";
		public String Origsessd = "";
		public String Hist_dt = "";
		public String Origsess = "";
		public String Endsess = "";
		public String Hcp_booking3 = "";
		public String Hist_reas = "";
		public String Hist_type = "";
		public String Appt_id3 = "";
		
		public void clear()
		{
			Appt_hist_id = "";
			Hist_cdate = "";
			First_flag = "";
			Origsessd = "";
			Hist_dt = "";
			Origsess = "";
			Endsess = "";
			Hcp_booking3 = "";
			Hist_reas = "";
			Hist_type = "";
			Appt_id3 = "";
			
		}
	}
	public final class Sd_apptTrans_seqRecord
	{
		public String Trans_seq = "";
		public String Refend_dt = "";
		public String Refstart_dt = "";
		public String Outref = "";
		public String In_ref = "";
		
		public void clear()
		{
			Trans_seq = "";
			Refend_dt = "";
			Refstart_dt = "";
			Outref = "";
			In_ref = "";
			
		}
	}
	public final class Sd_apptSpec_req_seqRecord
	{
		public String Spec_req_seq = "";
		public String Spec_req_id = "";
		public String Act_ind = "";
		
		public void clear()
		{
			Spec_req_seq = "";
			Spec_req_id = "";
			Act_ind = "";
			
		}
	}
	public final class Sd_apptSeqnoRecord
	{
		public String Seqno = "";
		public String Action_stat = "";
		public String Appt_id1 = "";
		public String Action_id = "";
		
		public void clear()
		{
			Seqno = "";
			Action_stat = "";
			Appt_id1 = "";
			Action_id = "";
			
		}
	}	
	public final class Sd_apptFilter
	{			
		public String Appt_head_id = "";
		public String Pkey = "";
		public String Patient = "";
		public String First_appt_id = "";
		public String Last_appt_id = "";
		public String No_cancelled = "";
		public String No_dna = "";
		public String Booking_sys_type = "";
		public String Rel_appt_head_id = "";
		public String Pat_let = "";
		public String Gp_let = "";
		public String Cmts = "";
		public String Hcp_booking = "";
		public String Datebkd = "";
		public String Priordatoff = "";
		public String Head_stat = "";
		public String Hospnum = "";
		public String Surname = "";
		public String Forname = "";
		public String Title = "";
		public String Dob = "";
		public String Sex = "";
		public String Tstp = "";
		public String Treatpl_act_id = "";
		public String First_appt_activity_gr = "";
		public String First_appt_activity = "";
		public String First_appt_date = "";
		public String First_appt_activitytxt = "";
		public String Last_appt_date = "";
		public String Tran_arrnge_req = "";
		public String Act_consult = "";
		public String Act_consulttxt = "";
		public String Transp_cmnt = "";
		public String Pat_stat = "";
		public String First_appt_att_time = "";
		public String Actplanupdate = "";
		public String Ccs_epid = "";
		
		public void clear()
		{				
			Appt_head_id = "";
			Pkey = "";
			Patient = "";
			First_appt_id = "";
			Last_appt_id = "";
			No_cancelled = "";
			No_dna = "";
			Booking_sys_type = "";
			Rel_appt_head_id = "";
			Pat_let = "";
			Gp_let = "";
			Cmts = "";
			Hcp_booking = "";
			Datebkd = "";
			Priordatoff = "";
			Head_stat = "";
			Hospnum = "";
			Surname = "";
			Forname = "";
			Title = "";
			Dob = "";
			Sex = "";
			Tstp = "";
			Treatpl_act_id = "";
			First_appt_activity_gr = "";
			First_appt_activity = "";
			First_appt_date = "";
			First_appt_activitytxt = "";
			Last_appt_date = "";
			Tran_arrnge_req = "";
			Act_consult = "";
			Act_consulttxt = "";
			Transp_cmnt = "";
			Pat_stat = "";
			First_appt_att_time = "";
			Actplanupdate = "";
			Ccs_epid = "";
		}	
		public Sd_apptFilter cloneObject()
		{
			Sd_apptFilter newFilter = new Sd_apptFilter();
			
			newFilter.Appt_head_id = this.Appt_head_id;
			newFilter.Pkey = this.Pkey;
			newFilter.Patient = this.Patient;
			newFilter.First_appt_id = this.First_appt_id;
			newFilter.Last_appt_id = this.Last_appt_id;
			newFilter.No_cancelled = this.No_cancelled;
			newFilter.No_dna = this.No_dna;
			newFilter.Booking_sys_type = this.Booking_sys_type;
			newFilter.Rel_appt_head_id = this.Rel_appt_head_id;
			newFilter.Pat_let = this.Pat_let;
			newFilter.Gp_let = this.Gp_let;
			newFilter.Cmts = this.Cmts;
			newFilter.Hcp_booking = this.Hcp_booking;
			newFilter.Datebkd = this.Datebkd;
			newFilter.Priordatoff = this.Priordatoff;
			newFilter.Head_stat = this.Head_stat;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Surname = this.Surname;
			newFilter.Forname = this.Forname;
			newFilter.Title = this.Title;
			newFilter.Dob = this.Dob;
			newFilter.Sex = this.Sex;
			newFilter.Tstp = this.Tstp;
			newFilter.Treatpl_act_id = this.Treatpl_act_id;
			newFilter.First_appt_activity_gr = this.First_appt_activity_gr;
			newFilter.First_appt_activity = this.First_appt_activity;
			newFilter.First_appt_date = this.First_appt_date;
			newFilter.First_appt_activitytxt = this.First_appt_activitytxt;
			newFilter.Last_appt_date = this.Last_appt_date;
			newFilter.Tran_arrnge_req = this.Tran_arrnge_req;
			newFilter.Act_consult = this.Act_consult;
			newFilter.Act_consulttxt = this.Act_consulttxt;
			newFilter.Transp_cmnt = this.Transp_cmnt;
			newFilter.Pat_stat = this.Pat_stat;
			newFilter.First_appt_att_time = this.First_appt_att_time;
			newFilter.Actplanupdate = this.Actplanupdate;
			newFilter.Ccs_epid = this.Ccs_epid;
			
			return newFilter;
		}
	}
	public final class Sd_apptEditFilter
	{			
		public boolean IncludeAppt_head_id = true;
		public boolean IncludePkey = true;
		public boolean IncludePatient = true;
		public boolean IncludeFirst_appt_id = true;
		public boolean IncludeLast_appt_id = true;
		public boolean IncludeNo_cancelled = true;
		public boolean IncludeNo_dna = true;
		public boolean IncludeBooking_sys_type = true;
		public boolean IncludeRel_appt_head_id = true;
		public boolean IncludePat_let = true;
		public boolean IncludeGp_let = true;
		public boolean IncludeCmts = true;
		public boolean IncludeHcp_booking = true;
		public boolean IncludeDatebkd = true;
		public boolean IncludePriordatoff = true;
		public boolean IncludeHead_stat = true;
		public boolean IncludeHospnum = true;
		public boolean IncludeSurname = true;
		public boolean IncludeForname = true;
		public boolean IncludeTitle = true;
		public boolean IncludeDob = true;
		public boolean IncludeSex = true;
		public boolean IncludeTstp = true;
		public boolean IncludeTreatpl_act_id = true;
		public boolean IncludeFirst_appt_activity_gr = true;
		public boolean IncludeFirst_appt_activity = true;
		public boolean IncludeFirst_appt_date = true;
		public boolean IncludeFirst_appt_activitytxt = true;
		public boolean IncludeLast_appt_date = true;
		public boolean IncludeTran_arrnge_req = true;
		public boolean IncludeAct_consult = true;
		public boolean IncludeAct_consulttxt = true;
		public boolean IncludeTransp_cmnt = true;
		public boolean IncludePat_stat = true;
		public boolean IncludeFirst_appt_att_time = true;
		public boolean IncludeActplanupdate = true;
		public boolean IncludeCcs_epid = true;
		
		public void includeAll()
		{				
			IncludeAppt_head_id = true;
			IncludePkey = true;
			IncludePatient = true;
			IncludeFirst_appt_id = true;
			IncludeLast_appt_id = true;
			IncludeNo_cancelled = true;
			IncludeNo_dna = true;
			IncludeBooking_sys_type = true;
			IncludeRel_appt_head_id = true;
			IncludePat_let = true;
			IncludeGp_let = true;
			IncludeCmts = true;
			IncludeHcp_booking = true;
			IncludeDatebkd = true;
			IncludePriordatoff = true;
			IncludeHead_stat = true;
			IncludeHospnum = true;
			IncludeSurname = true;
			IncludeForname = true;
			IncludeTitle = true;
			IncludeDob = true;
			IncludeSex = true;
			IncludeTstp = true;
			IncludeTreatpl_act_id = true;
			IncludeFirst_appt_activity_gr = true;
			IncludeFirst_appt_activity = true;
			IncludeFirst_appt_date = true;
			IncludeFirst_appt_activitytxt = true;
			IncludeLast_appt_date = true;
			IncludeTran_arrnge_req = true;
			IncludeAct_consult = true;
			IncludeAct_consulttxt = true;
			IncludeTransp_cmnt = true;
			IncludePat_stat = true;
			IncludeFirst_appt_att_time = true;
			IncludeActplanupdate = true;
			IncludeCcs_epid = true;
		}	
		public void excludeAll()
		{				
			IncludeAppt_head_id = false;
			IncludePkey = false;
			IncludePatient = false;
			IncludeFirst_appt_id = false;
			IncludeLast_appt_id = false;
			IncludeNo_cancelled = false;
			IncludeNo_dna = false;
			IncludeBooking_sys_type = false;
			IncludeRel_appt_head_id = false;
			IncludePat_let = false;
			IncludeGp_let = false;
			IncludeCmts = false;
			IncludeHcp_booking = false;
			IncludeDatebkd = false;
			IncludePriordatoff = false;
			IncludeHead_stat = false;
			IncludeHospnum = false;
			IncludeSurname = false;
			IncludeForname = false;
			IncludeTitle = false;
			IncludeDob = false;
			IncludeSex = false;
			IncludeTstp = false;
			IncludeTreatpl_act_id = false;
			IncludeFirst_appt_activity_gr = false;
			IncludeFirst_appt_activity = false;
			IncludeFirst_appt_date = false;
			IncludeFirst_appt_activitytxt = false;
			IncludeLast_appt_date = false;
			IncludeTran_arrnge_req = false;
			IncludeAct_consult = false;
			IncludeAct_consulttxt = false;
			IncludeTransp_cmnt = false;
			IncludePat_stat = false;
			IncludeFirst_appt_att_time = false;
			IncludeActplanupdate = false;
			IncludeCcs_epid = false;
		}
		public Sd_apptEditFilter cloneObject()
		{
			Sd_apptEditFilter newEditFilter = new Sd_apptEditFilter();
			
			newEditFilter.IncludeAppt_head_id = this.IncludeAppt_head_id;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludePatient = this.IncludePatient;
			newEditFilter.IncludeFirst_appt_id = this.IncludeFirst_appt_id;
			newEditFilter.IncludeLast_appt_id = this.IncludeLast_appt_id;
			newEditFilter.IncludeNo_cancelled = this.IncludeNo_cancelled;
			newEditFilter.IncludeNo_dna = this.IncludeNo_dna;
			newEditFilter.IncludeBooking_sys_type = this.IncludeBooking_sys_type;
			newEditFilter.IncludeRel_appt_head_id = this.IncludeRel_appt_head_id;
			newEditFilter.IncludePat_let = this.IncludePat_let;
			newEditFilter.IncludeGp_let = this.IncludeGp_let;
			newEditFilter.IncludeCmts = this.IncludeCmts;
			newEditFilter.IncludeHcp_booking = this.IncludeHcp_booking;
			newEditFilter.IncludeDatebkd = this.IncludeDatebkd;
			newEditFilter.IncludePriordatoff = this.IncludePriordatoff;
			newEditFilter.IncludeHead_stat = this.IncludeHead_stat;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeSurname = this.IncludeSurname;
			newEditFilter.IncludeForname = this.IncludeForname;
			newEditFilter.IncludeTitle = this.IncludeTitle;
			newEditFilter.IncludeDob = this.IncludeDob;
			newEditFilter.IncludeSex = this.IncludeSex;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeTreatpl_act_id = this.IncludeTreatpl_act_id;
			newEditFilter.IncludeFirst_appt_activity_gr = this.IncludeFirst_appt_activity_gr;
			newEditFilter.IncludeFirst_appt_activity = this.IncludeFirst_appt_activity;
			newEditFilter.IncludeFirst_appt_date = this.IncludeFirst_appt_date;
			newEditFilter.IncludeFirst_appt_activitytxt = this.IncludeFirst_appt_activitytxt;
			newEditFilter.IncludeLast_appt_date = this.IncludeLast_appt_date;
			newEditFilter.IncludeTran_arrnge_req = this.IncludeTran_arrnge_req;
			newEditFilter.IncludeAct_consult = this.IncludeAct_consult;
			newEditFilter.IncludeAct_consulttxt = this.IncludeAct_consulttxt;
			newEditFilter.IncludeTransp_cmnt = this.IncludeTransp_cmnt;
			newEditFilter.IncludePat_stat = this.IncludePat_stat;
			newEditFilter.IncludeFirst_appt_att_time = this.IncludeFirst_appt_att_time;
			newEditFilter.IncludeActplanupdate = this.IncludeActplanupdate;
			newEditFilter.IncludeCcs_epid = this.IncludeCcs_epid;
			
			return newEditFilter;
		}
	}
}
