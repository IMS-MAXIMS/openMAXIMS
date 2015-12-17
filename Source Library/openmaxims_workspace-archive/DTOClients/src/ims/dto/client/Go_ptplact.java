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

public final class Go_ptplact implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Go_ptplact.class);
	
	private Go_ptplactFilter lastGetFilter = null;
	private final String serviceName = "GO_PTPLACT";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Go_ptplactFilter Filter = new Go_ptplactFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Go_ptplactEditFilter EditFilter = new Go_ptplactEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Go_ptplactCollection DataCollection = new Go_ptplactCollection();

	/**
	 * Creates a new Go_ptplact Data Transfer Object.
	 */ 
	public Go_ptplact(ims.dto.Connection connection)
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
	public Go_ptplact cloneObject()
	{
		Go_ptplact cloneObject = new Go_ptplact(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Pt_act_id = DataCollection.get(x).Pt_act_id;
			cloneObject.DataCollection.get(index).Pt_tp_id = DataCollection.get(x).Pt_tp_id;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Rhcp = DataCollection.get(x).Rhcp;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Uhcp = DataCollection.get(x).Uhcp;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Modu = DataCollection.get(x).Modu;
			cloneObject.DataCollection.get(index).Ccs_epid = DataCollection.get(x).Ccs_epid;
			cloneObject.DataCollection.get(index).Act_ordno = DataCollection.get(x).Act_ordno;
			cloneObject.DataCollection.get(index).Act_consult = DataCollection.get(x).Act_consult;
			cloneObject.DataCollection.get(index).Attnd_as = DataCollection.get(x).Attnd_as;
			cloneObject.DataCollection.get(index).Act_priorty = DataCollection.get(x).Act_priorty;
			cloneObject.DataCollection.get(index).Txtact_priorty = DataCollection.get(x).Txtact_priorty;
			cloneObject.DataCollection.get(index).Act_status = DataCollection.get(x).Act_status;
			cloneObject.DataCollection.get(index).Txtact_status = DataCollection.get(x).Txtact_status;
			cloneObject.DataCollection.get(index).Trans_req = DataCollection.get(x).Trans_req;
			cloneObject.DataCollection.get(index).Txttrans_req = DataCollection.get(x).Txttrans_req;
			cloneObject.DataCollection.get(index).Pat_stat = DataCollection.get(x).Pat_stat;
			cloneObject.DataCollection.get(index).Stat_reas = DataCollection.get(x).Stat_reas;
			cloneObject.DataCollection.get(index).Opa_rsno = DataCollection.get(x).Opa_rsno;
			cloneObject.DataCollection.get(index).Opa_date = DataCollection.get(x).Opa_date;
			cloneObject.DataCollection.get(index).Opa_time = DataCollection.get(x).Opa_time;
			cloneObject.DataCollection.get(index).Act_wld_id = DataCollection.get(x).Act_wld_id;
			cloneObject.DataCollection.get(index).Act_bk_date = DataCollection.get(x).Act_bk_date;
			cloneObject.DataCollection.get(index).Act_bk_time = DataCollection.get(x).Act_bk_time;
			cloneObject.DataCollection.get(index).Tl_dose = DataCollection.get(x).Tl_dose;
			cloneObject.DataCollection.get(index).Tl_fractions = DataCollection.get(x).Tl_fractions;
			cloneObject.DataCollection.get(index).Tl_dur = DataCollection.get(x).Tl_dur;
			cloneObject.DataCollection.get(index).Ch_pl_st_dt = DataCollection.get(x).Ch_pl_st_dt;
			cloneObject.DataCollection.get(index).Ch_pl_reg = DataCollection.get(x).Ch_pl_reg;
			cloneObject.DataCollection.get(index).Txtch_pl_reg = DataCollection.get(x).Txtch_pl_reg;
			cloneObject.DataCollection.get(index).Imag_dt = DataCollection.get(x).Imag_dt;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Opa_rsnodesc = DataCollection.get(x).Opa_rsnodesc;
			cloneObject.DataCollection.get(index).Opa_statustxt = DataCollection.get(x).Opa_statustxt;
			cloneObject.DataCollection.get(index).Attend_astxt = DataCollection.get(x).Attend_astxt;
			cloneObject.DataCollection.get(index).Actdstat = DataCollection.get(x).Actdstat;
			cloneObject.DataCollection.get(index).Cr_id = DataCollection.get(x).Cr_id;
			cloneObject.DataCollection.get(index).Act_consultxt = DataCollection.get(x).Act_consultxt;
			cloneObject.DataCollection.get(index).Activitygrp = DataCollection.get(x).Activitygrp;
			cloneObject.DataCollection.get(index).Activity_id = DataCollection.get(x).Activity_id;
			cloneObject.DataCollection.get(index).Action_id = DataCollection.get(x).Action_id;
			cloneObject.DataCollection.get(index).Modality_id = DataCollection.get(x).Modality_id;
			cloneObject.DataCollection.get(index).Anaesthetic = DataCollection.get(x).Anaesthetic;
			cloneObject.DataCollection.get(index).Modality_idtxt = DataCollection.get(x).Modality_idtxt;
			cloneObject.DataCollection.get(index).Modality_enrgy = DataCollection.get(x).Modality_enrgy;
			cloneObject.DataCollection.get(index).Modalty_unit_id = DataCollection.get(x).Modalty_unit_id;
			cloneObject.DataCollection.get(index).Eststartdt = DataCollection.get(x).Eststartdt;
			cloneObject.DataCollection.get(index).Estenddate = DataCollection.get(x).Estenddate;
			cloneObject.DataCollection.get(index).Activitygrptxt = DataCollection.get(x).Activitygrptxt;
			cloneObject.DataCollection.get(index).Activity_idtxt = DataCollection.get(x).Activity_idtxt;
			cloneObject.DataCollection.get(index).Action_idtxt = DataCollection.get(x).Action_idtxt;
			cloneObject.DataCollection.get(index).Sd_apptdt = DataCollection.get(x).Sd_apptdt;
			cloneObject.DataCollection.get(index).Sd_appttm = DataCollection.get(x).Sd_appttm;
			cloneObject.DataCollection.get(index).Modality_unit_idtxt = DataCollection.get(x).Modality_unit_idtxt;
			cloneObject.DataCollection.get(index).Transreq_txt = DataCollection.get(x).Transreq_txt;
			cloneObject.DataCollection.get(index).Txcattype = DataCollection.get(x).Txcattype;
			cloneObject.DataCollection.get(index).Act_statusdt = DataCollection.get(x).Act_statusdt;
			cloneObject.DataCollection.get(index).Txcattypetxt = DataCollection.get(x).Txcattypetxt;
			cloneObject.DataCollection.get(index).Appt_id = DataCollection.get(x).Appt_id;
			cloneObject.DataCollection.get(index).Appt_head_id = DataCollection.get(x).Appt_head_id;
			cloneObject.DataCollection.get(index).Appt_stat = DataCollection.get(x).Appt_stat;
			cloneObject.DataCollection.get(index).Appt_date = DataCollection.get(x).Appt_date;
			cloneObject.DataCollection.get(index).Last_appt_date = DataCollection.get(x).Last_appt_date;
			cloneObject.DataCollection.get(index).Anaesttxt = DataCollection.get(x).Anaesttxt;
			cloneObject.DataCollection.get(index).Treatmentaction = DataCollection.get(x).Treatmentaction;
							
			
			for(int iSeqno = 0; iSeqno < DataCollection.get(x).SeqnoCollection.count(); iSeqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnoCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Seqno = DataCollection.get(x).SeqnoCollection.get(iSeqno).Seqno;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Techniqtxt = DataCollection.get(x).SeqnoCollection.get(iSeqno).Techniqtxt;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Tgrouptxt = DataCollection.get(x).SeqnoCollection.get(iSeqno).Tgrouptxt;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Tgroup = DataCollection.get(x).SeqnoCollection.get(iSeqno).Tgroup;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Sntact_stat = DataCollection.get(x).SeqnoCollection.get(iSeqno).Sntact_stat;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Txsitetxt = DataCollection.get(x).SeqnoCollection.get(iSeqno).Txsitetxt;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Techniq = DataCollection.get(x).SeqnoCollection.get(iSeqno).Techniq;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Txsiteprnt = DataCollection.get(x).SeqnoCollection.get(iSeqno).Txsiteprnt;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Txsite = DataCollection.get(x).SeqnoCollection.get(iSeqno).Txsite;
										
			}
			
			for(int iStatseqno = 0; iStatseqno < DataCollection.get(x).StatseqnoCollection.count(); iStatseqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).StatseqnoCollection.add();
					
				cloneObject.DataCollection.get(index).StatseqnoCollection.get(rIndex).Statseqno = DataCollection.get(x).StatseqnoCollection.get(iStatseqno).Statseqno;
				cloneObject.DataCollection.get(index).StatseqnoCollection.get(rIndex).Actstatreaspt = DataCollection.get(x).StatseqnoCollection.get(iStatseqno).Actstatreaspt;
				cloneObject.DataCollection.get(index).StatseqnoCollection.get(rIndex).Actstatedt = DataCollection.get(x).StatseqnoCollection.get(iStatseqno).Actstatedt;
				cloneObject.DataCollection.get(index).StatseqnoCollection.get(rIndex).Actstatsdt = DataCollection.get(x).StatseqnoCollection.get(iStatseqno).Actstatsdt;
				cloneObject.DataCollection.get(index).StatseqnoCollection.get(rIndex).Actstatpt = DataCollection.get(x).StatseqnoCollection.get(iStatseqno).Actstatpt;
										
			}
			
			for(int iDose_seq = 0; iDose_seq < DataCollection.get(x).Dose_seqCollection.count(); iDose_seq++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Dose_seqCollection.add();
					
				cloneObject.DataCollection.get(index).Dose_seqCollection.get(rIndex).Dose_seq = DataCollection.get(x).Dose_seqCollection.get(iDose_seq).Dose_seq;
				cloneObject.DataCollection.get(index).Dose_seqCollection.get(rIndex).Ed_isbooked = DataCollection.get(x).Dose_seqCollection.get(iDose_seq).Ed_isbooked;
				cloneObject.DataCollection.get(index).Dose_seqCollection.get(rIndex).Ed_dose_astat = DataCollection.get(x).Dose_seqCollection.get(iDose_seq).Ed_dose_astat;
				cloneObject.DataCollection.get(index).Dose_seqCollection.get(rIndex).Eb_dur = DataCollection.get(x).Dose_seqCollection.get(iDose_seq).Eb_dur;
				cloneObject.DataCollection.get(index).Dose_seqCollection.get(rIndex).Eb_fractions = DataCollection.get(x).Dose_seqCollection.get(iDose_seq).Eb_fractions;
				cloneObject.DataCollection.get(index).Dose_seqCollection.get(rIndex).Eb_dose = DataCollection.get(x).Dose_seqCollection.get(iDose_seq).Eb_dose;
										
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
		return "Go_ptplact.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptplact.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Go_ptplact.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptplact.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptplact.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptplact.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Go_ptplact.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Go_ptplact.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptplact.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Go_ptplact.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Go_ptplact.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Go_ptplact.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Go_ptplact.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Go_ptplact.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptplact.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Go_ptplact.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Go_ptplact.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Go_ptplact.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Go_ptplact.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Go_ptplact.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptplact.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Go_ptplact.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Go_ptplact.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptplact.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Go_ptplact.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Go_ptplact.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Go_ptplact.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Go_ptplact nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Go_ptplact After NextList ");
				
		decodeNASMessage();		
		logger.debug("Go_ptplact After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptplact.List");
							
		listInProgress = true;	
		logger.debug("Go_ptplact Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Go_ptplact After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Go_ptplact After Parse Message");
		
						
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
	private String encodeNASFilter(Go_ptplactFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Pt_act_id != null && filter.Pt_act_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PT_ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pt_act_id);
		}
		
		if(Filter.Pt_tp_id != null && filter.Pt_tp_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PT_TP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pt_tp_id);
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey);
		}
		
		if(Filter.Rdat != null && filter.Rdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rdat);
		}
		
		if(Filter.Rtim != null && filter.Rtim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rtim);
		}
		
		if(Filter.Rhcp != null && filter.Rhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rhcp);
		}
		
		if(Filter.Rusr != null && filter.Rusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusr);
		}
		
		if(Filter.Udat != null && filter.Udat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Udat);
		}
		
		if(Filter.Utim != null && filter.Utim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Utim);
		}
		
		if(Filter.Uhcp != null && filter.Uhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uhcp);
		}
		
		if(Filter.Uusr != null && filter.Uusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uusr);
		}
		
		if(Filter.Cdat != null && filter.Cdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cdat);
		}
		
		if(Filter.Ctim != null && filter.Ctim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ctim);
		}
		
		if(Filter.Modu != null && filter.Modu.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modu);
		}
		
		if(Filter.Ccs_epid != null && filter.Ccs_epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccs_epid);
		}
		
		if(Filter.Act_ordno != null && filter.Act_ordno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_ORDNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_ordno);
		}
		
		if(Filter.Act_consult != null && filter.Act_consult.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_CONSULT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_consult);
		}
		
		if(Filter.Attnd_as != null && filter.Attnd_as.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ATTND_AS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Attnd_as);
		}
		
		if(Filter.Act_priorty != null && filter.Act_priorty.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_PRIORTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_priorty);
		}
		
		if(Filter.Txtact_priorty != null && filter.Txtact_priorty.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TXTACT_PRIORTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Txtact_priorty);
		}
		
		if(Filter.Act_status != null && filter.Act_status.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_status);
		}
		
		if(Filter.Txtact_status != null && filter.Txtact_status.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TXTACT_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Txtact_status);
		}
		
		if(Filter.Trans_req != null && filter.Trans_req.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TRANS_REQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Trans_req);
		}
		
		if(Filter.Txttrans_req != null && filter.Txttrans_req.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TXTTRANS_REQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Txttrans_req);
		}
		
		if(Filter.Pat_stat != null && filter.Pat_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PAT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pat_stat);
		}
		
		if(Filter.Stat_reas != null && filter.Stat_reas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STAT_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat_reas);
		}
		
		if(Filter.Opa_rsno != null && filter.Opa_rsno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OPA_RSNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Opa_rsno);
		}
		
		if(Filter.Opa_date != null && filter.Opa_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OPA_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Opa_date);
		}
		
		if(Filter.Opa_time != null && filter.Opa_time.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OPA_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Opa_time);
		}
		
		if(Filter.Act_wld_id != null && filter.Act_wld_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_WLD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_wld_id);
		}
		
		if(Filter.Act_bk_date != null && filter.Act_bk_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_BK_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_bk_date);
		}
		
		if(Filter.Act_bk_time != null && filter.Act_bk_time.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_BK_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_bk_time);
		}
		
		if(Filter.Tl_dose != null && filter.Tl_dose.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TL_DOSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tl_dose);
		}
		
		if(Filter.Tl_fractions != null && filter.Tl_fractions.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TL_FRACTIONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tl_fractions);
		}
		
		if(Filter.Tl_dur != null && filter.Tl_dur.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TL_DUR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tl_dur);
		}
		
		if(Filter.Ch_pl_st_dt != null && filter.Ch_pl_st_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CH_PL_ST_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ch_pl_st_dt);
		}
		
		if(Filter.Ch_pl_reg != null && filter.Ch_pl_reg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CH_PL_REG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ch_pl_reg);
		}
		
		if(Filter.Txtch_pl_reg != null && filter.Txtch_pl_reg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TXTCH_PL_REG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Txtch_pl_reg);
		}
		
		if(Filter.Imag_dt != null && filter.Imag_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("IMAG_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Imag_dt);
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
		}
		
		if(Filter.Opa_rsnodesc != null && filter.Opa_rsnodesc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OPA_RSNODESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Opa_rsnodesc);
		}
		
		if(Filter.Opa_statustxt != null && filter.Opa_statustxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OPA_STATUSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Opa_statustxt);
		}
		
		if(Filter.Attend_astxt != null && filter.Attend_astxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ATTEND_ASTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Attend_astxt);
		}
		
		if(Filter.Actdstat != null && filter.Actdstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTDSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Actdstat);
		}
		
		if(Filter.Cr_id != null && filter.Cr_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CR_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cr_id);
		}
		
		if(Filter.Act_consultxt != null && filter.Act_consultxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_CONSULTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_consultxt);
		}
		
		if(Filter.Activitygrp != null && filter.Activitygrp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIVITYGRP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activitygrp);
		}
		
		if(Filter.Activity_id != null && filter.Activity_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIVITY_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activity_id);
		}
		
		if(Filter.Action_id != null && filter.Action_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Action_id);
		}
		
		if(Filter.Modality_id != null && filter.Modality_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MODALITY_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modality_id);
		}
		
		if(Filter.Anaesthetic != null && filter.Anaesthetic.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ANAESTHETIC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Anaesthetic);
		}
		
		if(Filter.Modality_idtxt != null && filter.Modality_idtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MODALITY_IDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modality_idtxt);
		}
		
		if(Filter.Modality_enrgy != null && filter.Modality_enrgy.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MODALITY_ENRGY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modality_enrgy);
		}
		
		if(Filter.Modalty_unit_id != null && filter.Modalty_unit_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MODALTY_UNIT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modalty_unit_id);
		}
		
		if(Filter.Eststartdt != null && filter.Eststartdt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ESTSTARTDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eststartdt);
		}
		
		if(Filter.Estenddate != null && filter.Estenddate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ESTENDDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Estenddate);
		}
		
		if(Filter.Activitygrptxt != null && filter.Activitygrptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIVITYGRPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activitygrptxt);
		}
		
		if(Filter.Activity_idtxt != null && filter.Activity_idtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIVITY_IDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activity_idtxt);
		}
		
		if(Filter.Action_idtxt != null && filter.Action_idtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTION_IDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Action_idtxt);
		}
		
		if(Filter.Sd_apptdt != null && filter.Sd_apptdt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SD_APPTDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sd_apptdt);
		}
		
		if(Filter.Sd_appttm != null && filter.Sd_appttm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SD_APPTTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sd_appttm);
		}
		
		if(Filter.Modality_unit_idtxt != null && filter.Modality_unit_idtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MODALITY_UNIT_IDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modality_unit_idtxt);
		}
		
		if(Filter.Transreq_txt != null && filter.Transreq_txt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TRANSREQ_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Transreq_txt);
		}
		
		if(Filter.Txcattype != null && filter.Txcattype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TXCATTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Txcattype);
		}
		
		if(Filter.Act_statusdt != null && filter.Act_statusdt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_STATUSDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_statusdt);
		}
		
		if(Filter.Txcattypetxt != null && filter.Txcattypetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TXCATTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Txcattypetxt);
		}
		
		if(Filter.Appt_id != null && filter.Appt_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_id);
		}
		
		if(Filter.Appt_head_id != null && filter.Appt_head_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_HEAD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_head_id);
		}
		
		if(Filter.Appt_stat != null && filter.Appt_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_stat);
		}
		
		if(Filter.Appt_date != null && filter.Appt_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_date);
		}
		
		if(Filter.Last_appt_date != null && filter.Last_appt_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LAST_APPT_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Last_appt_date);
		}
		
		if(Filter.Anaesttxt != null && filter.Anaesttxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ANAESTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Anaesttxt);
		}
		
		if(Filter.Treatmentaction != null && filter.Treatmentaction.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TREATMENTACTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Treatmentaction);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Go_ptplactRecord data = (Go_ptplactRecord)DataCollection.get(0);
		
		if(EditFilter.IncludePt_act_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PT_ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pt_act_id));
		}
		
		if(EditFilter.IncludePt_tp_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PT_TP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pt_tp_id));
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey));
		}
		
		if(EditFilter.IncludeRdat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rdat));
		}
		
		if(EditFilter.IncludeRtim)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rtim));
		}
		
		if(EditFilter.IncludeRhcp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rhcp));
		}
		
		if(EditFilter.IncludeRusr)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusr));
		}
		
		if(EditFilter.IncludeUdat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Udat));
		}
		
		if(EditFilter.IncludeUtim)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Utim));
		}
		
		if(EditFilter.IncludeUhcp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uhcp));
		}
		
		if(EditFilter.IncludeUusr)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uusr));
		}
		
		if(EditFilter.IncludeCdat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cdat));
		}
		
		if(EditFilter.IncludeCtim)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ctim));
		}
		
		if(EditFilter.IncludeModu)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modu));
		}
		
		if(EditFilter.IncludeCcs_epid)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccs_epid));
		}
		
		if(EditFilter.IncludeAct_ordno)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_ORDNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_ordno));
		}
		
		if(EditFilter.IncludeAct_consult)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_CONSULT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_consult));
		}
		
		if(EditFilter.IncludeAttnd_as)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ATTND_AS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Attnd_as));
		}
		
		if(EditFilter.IncludeAct_priorty)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_PRIORTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_priorty));
		}
		
		if(EditFilter.IncludeTxtact_priorty)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXTACT_PRIORTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Txtact_priorty));
		}
		
		if(EditFilter.IncludeAct_status)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_status));
		}
		
		if(EditFilter.IncludeTxtact_status)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXTACT_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Txtact_status));
		}
		
		if(EditFilter.IncludeTrans_req)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TRANS_REQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Trans_req));
		}
		
		if(EditFilter.IncludeTxttrans_req)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXTTRANS_REQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Txttrans_req));
		}
		
		if(EditFilter.IncludePat_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PAT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pat_stat));
		}
		
		if(EditFilter.IncludeStat_reas)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STAT_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat_reas));
		}
		
		if(EditFilter.IncludeOpa_rsno)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OPA_RSNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Opa_rsno));
		}
		
		if(EditFilter.IncludeOpa_date)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OPA_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Opa_date));
		}
		
		if(EditFilter.IncludeOpa_time)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OPA_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Opa_time));
		}
		
		if(EditFilter.IncludeAct_wld_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_WLD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_wld_id));
		}
		
		if(EditFilter.IncludeAct_bk_date)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_BK_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_bk_date));
		}
		
		if(EditFilter.IncludeAct_bk_time)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_BK_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_bk_time));
		}
		
		if(EditFilter.IncludeTl_dose)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TL_DOSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tl_dose));
		}
		
		if(EditFilter.IncludeTl_fractions)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TL_FRACTIONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tl_fractions));
		}
		
		if(EditFilter.IncludeTl_dur)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TL_DUR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tl_dur));
		}
		
		if(EditFilter.IncludeCh_pl_st_dt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CH_PL_ST_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ch_pl_st_dt));
		}
		
		if(EditFilter.IncludeCh_pl_reg)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CH_PL_REG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ch_pl_reg));
		}
		
		if(EditFilter.IncludeTxtch_pl_reg)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXTCH_PL_REG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Txtch_pl_reg));
		}
		
		if(EditFilter.IncludeImag_dt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("IMAG_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Imag_dt));
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
		}
		
		if(EditFilter.IncludeOpa_rsnodesc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OPA_RSNODESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Opa_rsnodesc));
		}
		
		if(EditFilter.IncludeOpa_statustxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OPA_STATUSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Opa_statustxt));
		}
		
		if(EditFilter.IncludeAttend_astxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ATTEND_ASTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Attend_astxt));
		}
		
		if(EditFilter.IncludeActdstat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTDSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Actdstat));
		}
		
		if(EditFilter.IncludeCr_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CR_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cr_id));
		}
		
		if(EditFilter.IncludeAct_consultxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_CONSULTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_consultxt));
		}
		
		if(EditFilter.IncludeActivitygrp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIVITYGRP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activitygrp));
		}
		
		if(EditFilter.IncludeActivity_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIVITY_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activity_id));
		}
		
		if(EditFilter.IncludeAction_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Action_id));
		}
		
		if(EditFilter.IncludeModality_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODALITY_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modality_id));
		}
		
		if(EditFilter.IncludeAnaesthetic)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ANAESTHETIC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Anaesthetic));
		}
		
		if(EditFilter.IncludeModality_idtxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODALITY_IDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modality_idtxt));
		}
		
		if(EditFilter.IncludeModality_enrgy)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODALITY_ENRGY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modality_enrgy));
		}
		
		if(EditFilter.IncludeModalty_unit_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODALTY_UNIT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modalty_unit_id));
		}
		
		if(EditFilter.IncludeEststartdt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ESTSTARTDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eststartdt));
		}
		
		if(EditFilter.IncludeEstenddate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ESTENDDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Estenddate));
		}
		
		if(EditFilter.IncludeActivitygrptxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIVITYGRPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activitygrptxt));
		}
		
		if(EditFilter.IncludeActivity_idtxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIVITY_IDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activity_idtxt));
		}
		
		if(EditFilter.IncludeAction_idtxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_IDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Action_idtxt));
		}
		
		if(EditFilter.IncludeSd_apptdt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SD_APPTDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sd_apptdt));
		}
		
		if(EditFilter.IncludeSd_appttm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SD_APPTTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sd_appttm));
		}
		
		if(EditFilter.IncludeModality_unit_idtxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODALITY_UNIT_IDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modality_unit_idtxt));
		}
		
		if(EditFilter.IncludeTransreq_txt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TRANSREQ_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Transreq_txt));
		}
		
		if(EditFilter.IncludeTxcattype)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXCATTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Txcattype));
		}
		
		if(EditFilter.IncludeAct_statusdt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_STATUSDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_statusdt));
		}
		
		if(EditFilter.IncludeTxcattypetxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXCATTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Txcattypetxt));
		}
		
		if(EditFilter.IncludeAppt_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_id));
		}
		
		if(EditFilter.IncludeAppt_head_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_HEAD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_head_id));
		}
		
		if(EditFilter.IncludeAppt_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_stat));
		}
		
		if(EditFilter.IncludeAppt_date)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_date));
		}
		
		if(EditFilter.IncludeLast_appt_date)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LAST_APPT_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Last_appt_date));
		}
		
		if(EditFilter.IncludeAnaesttxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ANAESTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Anaesttxt));
		}
		
		if(EditFilter.IncludeTreatmentaction)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TREATMENTACTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Treatmentaction));
		}
		
		
		for(int x = 0; x < data.SeqnoCollection.count(); x++)
		{
			Go_ptplactSeqnoRecord rgRecord = (Go_ptplactSeqnoRecord)data.SeqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TECHNIQTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Techniqtxt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TGROUPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Tgrouptxt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TGROUP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Tgroup));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SNTACT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Sntact_stat));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXSITETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Txsitetxt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TECHNIQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Techniq));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXSITEPRNT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Txsiteprnt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXSITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Txsite));
			
		}
		for(int x = 0; x < data.StatseqnoCollection.count(); x++)
		{
			Go_ptplactStatseqnoRecord rgRecord = (Go_ptplactStatseqnoRecord)data.StatseqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STATSEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Statseqno));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTSTATREASPT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Actstatreaspt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTSTATEDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Actstatedt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTSTATSDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Actstatsdt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTSTATPT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Actstatpt));
			
		}
		for(int x = 0; x < data.Dose_seqCollection.count(); x++)
		{
			Go_ptplactDose_seqRecord rgRecord = (Go_ptplactDose_seqRecord)data.Dose_seqCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOSE_SEQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Dose_seq));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ED_ISBOOKED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ed_isbooked));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ED_DOSE_ASTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ed_dose_astat));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EB_DUR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Eb_dur));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EB_FRACTIONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Eb_fractions));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EB_DOSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Eb_dose));
			
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
			Go_ptplactRecord record = new Go_ptplactRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Pt_act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PT_ACT_ID"));
			record.Pt_tp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PT_TP_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Act_ordno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_ORDNO"));
			record.Act_consult = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULT"));
			record.Attnd_as = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTND_AS"));
			record.Act_priorty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_PRIORTY"));
			record.Txtact_priorty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXTACT_PRIORTY"));
			record.Act_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STATUS"));
			record.Txtact_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXTACT_STATUS"));
			record.Trans_req = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRANS_REQ"));
			record.Txttrans_req = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXTTRANS_REQ"));
			record.Pat_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_STAT"));
			record.Stat_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT_REAS"));
			record.Opa_rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPA_RSNO"));
			record.Opa_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPA_DATE"));
			record.Opa_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPA_TIME"));
			record.Act_wld_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_WLD_ID"));
			record.Act_bk_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_BK_DATE"));
			record.Act_bk_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_BK_TIME"));
			record.Tl_dose = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TL_DOSE"));
			record.Tl_fractions = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TL_FRACTIONS"));
			record.Tl_dur = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TL_DUR"));
			record.Ch_pl_st_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CH_PL_ST_DT"));
			record.Ch_pl_reg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CH_PL_REG"));
			record.Txtch_pl_reg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXTCH_PL_REG"));
			record.Imag_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "IMAG_DT"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Opa_rsnodesc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPA_RSNODESC"));
			record.Opa_statustxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPA_STATUSTXT"));
			record.Attend_astxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTEND_ASTXT"));
			record.Actdstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTDSTAT"));
			record.Cr_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CR_ID"));
			record.Act_consultxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULTXT"));
			record.Activitygrp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITYGRP"));
			record.Activity_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITY_ID"));
			record.Action_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_ID"));
			record.Modality_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODALITY_ID"));
			record.Anaesthetic = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ANAESTHETIC"));
			record.Modality_idtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODALITY_IDTXT"));
			record.Modality_enrgy = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODALITY_ENRGY"));
			record.Modalty_unit_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODALTY_UNIT_ID"));
			record.Eststartdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTSTARTDT"));
			record.Estenddate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTENDDATE"));
			record.Activitygrptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITYGRPTXT"));
			record.Activity_idtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITY_IDTXT"));
			record.Action_idtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_IDTXT"));
			record.Sd_apptdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_APPTDT"));
			record.Sd_appttm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_APPTTM"));
			record.Modality_unit_idtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODALITY_UNIT_IDTXT"));
			record.Transreq_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRANSREQ_TXT"));
			record.Txcattype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPE"));
			record.Act_statusdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STATUSDT"));
			record.Txcattypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPETXT"));
			record.Appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_ID"));
			record.Appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HEAD_ID"));
			record.Appt_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_STAT"));
			record.Appt_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_DATE"));
			record.Last_appt_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LAST_APPT_DATE"));
			record.Anaesttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ANAESTTXT"));
			record.Treatmentaction = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TREATMENTACTION"));
									
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
			Go_ptplactRecord record = new Go_ptplactRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pt_act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PT_ACT_ID"));
			record.Pt_tp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PT_TP_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Act_ordno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_ORDNO"));
			record.Act_consult = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULT"));
			record.Attnd_as = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTND_AS"));
			record.Act_priorty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_PRIORTY"));
			record.Txtact_priorty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXTACT_PRIORTY"));
			record.Act_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STATUS"));
			record.Txtact_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXTACT_STATUS"));
			record.Trans_req = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRANS_REQ"));
			record.Txttrans_req = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXTTRANS_REQ"));
			record.Pat_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_STAT"));
			record.Stat_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT_REAS"));
			record.Opa_rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPA_RSNO"));
			record.Opa_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPA_DATE"));
			record.Opa_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPA_TIME"));
			record.Act_wld_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_WLD_ID"));
			record.Act_bk_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_BK_DATE"));
			record.Act_bk_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_BK_TIME"));
			record.Tl_dose = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TL_DOSE"));
			record.Tl_fractions = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TL_FRACTIONS"));
			record.Tl_dur = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TL_DUR"));
			record.Ch_pl_st_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CH_PL_ST_DT"));
			record.Ch_pl_reg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CH_PL_REG"));
			record.Txtch_pl_reg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXTCH_PL_REG"));
			record.Imag_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "IMAG_DT"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Opa_rsnodesc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPA_RSNODESC"));
			record.Opa_statustxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPA_STATUSTXT"));
			record.Attend_astxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTEND_ASTXT"));
			record.Actdstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTDSTAT"));
			record.Cr_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CR_ID"));
			record.Act_consultxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULTXT"));
			record.Activitygrp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITYGRP"));
			record.Activity_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITY_ID"));
			record.Action_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_ID"));
			record.Modality_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODALITY_ID"));
			record.Anaesthetic = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ANAESTHETIC"));
			record.Modality_idtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODALITY_IDTXT"));
			record.Modality_enrgy = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODALITY_ENRGY"));
			record.Modalty_unit_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODALTY_UNIT_ID"));
			record.Eststartdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTSTARTDT"));
			record.Estenddate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTENDDATE"));
			record.Activitygrptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITYGRPTXT"));
			record.Activity_idtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITY_IDTXT"));
			record.Action_idtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_IDTXT"));
			record.Sd_apptdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_APPTDT"));
			record.Sd_appttm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_APPTTM"));
			record.Modality_unit_idtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODALITY_UNIT_IDTXT"));
			record.Transreq_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRANSREQ_TXT"));
			record.Txcattype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPE"));
			record.Act_statusdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STATUSDT"));
			record.Txcattypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPETXT"));
			record.Appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_ID"));
			record.Appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HEAD_ID"));
			record.Appt_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_STAT"));
			record.Appt_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_DATE"));
			record.Last_appt_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LAST_APPT_DATE"));
			record.Anaesttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ANAESTTXT"));
			record.Treatmentaction = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TREATMENTACTION"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					record.SeqnoCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("statseqno"))
					record.StatseqnoCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("dose_seq"))
					record.Dose_seqCollection.add();
			
									
			rgCount = record.SeqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					{
						Go_ptplactSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("techniqtxt"))
					{
						Go_ptplactSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Techniqtxt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("tgrouptxt"))
					{
						Go_ptplactSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Tgrouptxt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("tgroup"))
					{
						Go_ptplactSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Tgroup = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("sntact_stat"))
					{
						Go_ptplactSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Sntact_stat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("txsitetxt"))
					{
						Go_ptplactSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Txsitetxt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("techniq"))
					{
						Go_ptplactSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Techniq = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("txsiteprnt"))
					{
						Go_ptplactSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Txsiteprnt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("txsite"))
					{
						Go_ptplactSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Txsite = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.StatseqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("statseqno"))
					{
						Go_ptplactStatseqnoRecord rgRecord = record.StatseqnoCollection.get(recCount);
						rgRecord.Statseqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("actstatreaspt"))
					{
						Go_ptplactStatseqnoRecord rgRecord = record.StatseqnoCollection.get(recCount);
						rgRecord.Actstatreaspt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("actstatedt"))
					{
						Go_ptplactStatseqnoRecord rgRecord = record.StatseqnoCollection.get(recCount);
						rgRecord.Actstatedt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("actstatsdt"))
					{
						Go_ptplactStatseqnoRecord rgRecord = record.StatseqnoCollection.get(recCount);
						rgRecord.Actstatsdt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("actstatpt"))
					{
						Go_ptplactStatseqnoRecord rgRecord = record.StatseqnoCollection.get(recCount);
						rgRecord.Actstatpt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Dose_seqCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("dose_seq"))
					{
						Go_ptplactDose_seqRecord rgRecord = record.Dose_seqCollection.get(recCount);
						rgRecord.Dose_seq = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ed_isbooked"))
					{
						Go_ptplactDose_seqRecord rgRecord = record.Dose_seqCollection.get(recCount);
						rgRecord.Ed_isbooked = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ed_dose_astat"))
					{
						Go_ptplactDose_seqRecord rgRecord = record.Dose_seqCollection.get(recCount);
						rgRecord.Ed_dose_astat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("eb_dur"))
					{
						Go_ptplactDose_seqRecord rgRecord = record.Dose_seqCollection.get(recCount);
						rgRecord.Eb_dur = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("eb_fractions"))
					{
						Go_ptplactDose_seqRecord rgRecord = record.Dose_seqCollection.get(recCount);
						rgRecord.Eb_fractions = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("eb_dose"))
					{
						Go_ptplactDose_seqRecord rgRecord = record.Dose_seqCollection.get(recCount);
						rgRecord.Eb_dose = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Go_ptplactCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Go_ptplactRecord newRecord = new Go_ptplactRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Go_ptplactRecord record)
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
		public Go_ptplactRecord get(int index)
		{
			return (Go_ptplactRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Go_ptplactRecord
	{
		public String Pt_act_id = "";
		public String Pt_tp_id = "";
		public String Pkey = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Modu = "";
		public String Ccs_epid = "";
		public String Act_ordno = "";
		public String Act_consult = "";
		public String Attnd_as = "";
		public String Act_priorty = "";
		public String Txtact_priorty = "";
		public String Act_status = "";
		public String Txtact_status = "";
		public String Trans_req = "";
		public String Txttrans_req = "";
		public String Pat_stat = "";
		public String Stat_reas = "";
		public String Opa_rsno = "";
		public String Opa_date = "";
		public String Opa_time = "";
		public String Act_wld_id = "";
		public String Act_bk_date = "";
		public String Act_bk_time = "";
		public String Tl_dose = "";
		public String Tl_fractions = "";
		public String Tl_dur = "";
		public String Ch_pl_st_dt = "";
		public String Ch_pl_reg = "";
		public String Txtch_pl_reg = "";
		public String Imag_dt = "";
		public String Tstp = "";
		public String Opa_rsnodesc = "";
		public String Opa_statustxt = "";
		public String Attend_astxt = "";
		public String Actdstat = "";
		public String Cr_id = "";
		public String Act_consultxt = "";
		public String Activitygrp = "";
		public String Activity_id = "";
		public String Action_id = "";
		public String Modality_id = "";
		public String Anaesthetic = "";
		public String Modality_idtxt = "";
		public String Modality_enrgy = "";
		public String Modalty_unit_id = "";
		public String Eststartdt = "";
		public String Estenddate = "";
		public String Activitygrptxt = "";
		public String Activity_idtxt = "";
		public String Action_idtxt = "";
		public String Sd_apptdt = "";
		public String Sd_appttm = "";
		public String Modality_unit_idtxt = "";
		public String Transreq_txt = "";
		public String Txcattype = "";
		public String Act_statusdt = "";
		public String Txcattypetxt = "";
		public String Appt_id = "";
		public String Appt_head_id = "";
		public String Appt_stat = "";
		public String Appt_date = "";
		public String Last_appt_date = "";
		public String Anaesttxt = "";
		public String Treatmentaction = "";
		
		public Go_ptplactSeqnoCollection SeqnoCollection = new Go_ptplactSeqnoCollection();
		public Go_ptplactStatseqnoCollection StatseqnoCollection = new Go_ptplactStatseqnoCollection();
		public Go_ptplactDose_seqCollection Dose_seqCollection = new Go_ptplactDose_seqCollection();		
		
		public void clear()
		{
			Pt_act_id = "";
			Pt_tp_id = "";
			Pkey = "";
			Rdat = "";
			Rtim = "";
			Rhcp = "";
			Rusr = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Uusr = "";
			Cdat = "";
			Ctim = "";
			Modu = "";
			Ccs_epid = "";
			Act_ordno = "";
			Act_consult = "";
			Attnd_as = "";
			Act_priorty = "";
			Txtact_priorty = "";
			Act_status = "";
			Txtact_status = "";
			Trans_req = "";
			Txttrans_req = "";
			Pat_stat = "";
			Stat_reas = "";
			Opa_rsno = "";
			Opa_date = "";
			Opa_time = "";
			Act_wld_id = "";
			Act_bk_date = "";
			Act_bk_time = "";
			Tl_dose = "";
			Tl_fractions = "";
			Tl_dur = "";
			Ch_pl_st_dt = "";
			Ch_pl_reg = "";
			Txtch_pl_reg = "";
			Imag_dt = "";
			Tstp = "";
			Opa_rsnodesc = "";
			Opa_statustxt = "";
			Attend_astxt = "";
			Actdstat = "";
			Cr_id = "";
			Act_consultxt = "";
			Activitygrp = "";
			Activity_id = "";
			Action_id = "";
			Modality_id = "";
			Anaesthetic = "";
			Modality_idtxt = "";
			Modality_enrgy = "";
			Modalty_unit_id = "";
			Eststartdt = "";
			Estenddate = "";
			Activitygrptxt = "";
			Activity_idtxt = "";
			Action_idtxt = "";
			Sd_apptdt = "";
			Sd_appttm = "";
			Modality_unit_idtxt = "";
			Transreq_txt = "";
			Txcattype = "";
			Act_statusdt = "";
			Txcattypetxt = "";
			Appt_id = "";
			Appt_head_id = "";
			Appt_stat = "";
			Appt_date = "";
			Last_appt_date = "";
			Anaesttxt = "";
			Treatmentaction = "";
			
			SeqnoCollection.clear();
			StatseqnoCollection.clear();
			Dose_seqCollection.clear();
		}		
	}
	
	public final class Go_ptplactSeqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Go_ptplactSeqnoRecord newRecord = new Go_ptplactSeqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Go_ptplactSeqnoRecord record)
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
		public Go_ptplactSeqnoRecord get(int index)
		{
			return (Go_ptplactSeqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Go_ptplactStatseqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Go_ptplactStatseqnoRecord newRecord = new Go_ptplactStatseqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Go_ptplactStatseqnoRecord record)
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
		public Go_ptplactStatseqnoRecord get(int index)
		{
			return (Go_ptplactStatseqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Go_ptplactDose_seqCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Go_ptplactDose_seqRecord newRecord = new Go_ptplactDose_seqRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Go_ptplactDose_seqRecord record)
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
		public Go_ptplactDose_seqRecord get(int index)
		{
			return (Go_ptplactDose_seqRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Go_ptplactSeqnoRecord
	{
		public String Seqno = "";
		public String Techniqtxt = "";
		public String Tgrouptxt = "";
		public String Tgroup = "";
		public String Sntact_stat = "";
		public String Txsitetxt = "";
		public String Techniq = "";
		public String Txsiteprnt = "";
		public String Txsite = "";
		
		public void clear()
		{
			Seqno = "";
			Techniqtxt = "";
			Tgrouptxt = "";
			Tgroup = "";
			Sntact_stat = "";
			Txsitetxt = "";
			Techniq = "";
			Txsiteprnt = "";
			Txsite = "";
			
		}
	}
	public final class Go_ptplactStatseqnoRecord
	{
		public String Statseqno = "";
		public String Actstatreaspt = "";
		public String Actstatedt = "";
		public String Actstatsdt = "";
		public String Actstatpt = "";
		
		public void clear()
		{
			Statseqno = "";
			Actstatreaspt = "";
			Actstatedt = "";
			Actstatsdt = "";
			Actstatpt = "";
			
		}
	}
	public final class Go_ptplactDose_seqRecord
	{
		public String Dose_seq = "";
		public String Ed_isbooked = "";
		public String Ed_dose_astat = "";
		public String Eb_dur = "";
		public String Eb_fractions = "";
		public String Eb_dose = "";
		
		public void clear()
		{
			Dose_seq = "";
			Ed_isbooked = "";
			Ed_dose_astat = "";
			Eb_dur = "";
			Eb_fractions = "";
			Eb_dose = "";
			
		}
	}	
	public final class Go_ptplactFilter
	{			
		public String Pt_act_id = "";
		public String Pt_tp_id = "";
		public String Pkey = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Modu = "";
		public String Ccs_epid = "";
		public String Act_ordno = "";
		public String Act_consult = "";
		public String Attnd_as = "";
		public String Act_priorty = "";
		public String Txtact_priorty = "";
		public String Act_status = "";
		public String Txtact_status = "";
		public String Trans_req = "";
		public String Txttrans_req = "";
		public String Pat_stat = "";
		public String Stat_reas = "";
		public String Opa_rsno = "";
		public String Opa_date = "";
		public String Opa_time = "";
		public String Act_wld_id = "";
		public String Act_bk_date = "";
		public String Act_bk_time = "";
		public String Tl_dose = "";
		public String Tl_fractions = "";
		public String Tl_dur = "";
		public String Ch_pl_st_dt = "";
		public String Ch_pl_reg = "";
		public String Txtch_pl_reg = "";
		public String Imag_dt = "";
		public String Tstp = "";
		public String Opa_rsnodesc = "";
		public String Opa_statustxt = "";
		public String Attend_astxt = "";
		public String Actdstat = "";
		public String Cr_id = "";
		public String Act_consultxt = "";
		public String Activitygrp = "";
		public String Activity_id = "";
		public String Action_id = "";
		public String Modality_id = "";
		public String Anaesthetic = "";
		public String Modality_idtxt = "";
		public String Modality_enrgy = "";
		public String Modalty_unit_id = "";
		public String Eststartdt = "";
		public String Estenddate = "";
		public String Activitygrptxt = "";
		public String Activity_idtxt = "";
		public String Action_idtxt = "";
		public String Sd_apptdt = "";
		public String Sd_appttm = "";
		public String Modality_unit_idtxt = "";
		public String Transreq_txt = "";
		public String Txcattype = "";
		public String Act_statusdt = "";
		public String Txcattypetxt = "";
		public String Appt_id = "";
		public String Appt_head_id = "";
		public String Appt_stat = "";
		public String Appt_date = "";
		public String Last_appt_date = "";
		public String Anaesttxt = "";
		public String Treatmentaction = "";
		
		public void clear()
		{				
			Pt_act_id = "";
			Pt_tp_id = "";
			Pkey = "";
			Rdat = "";
			Rtim = "";
			Rhcp = "";
			Rusr = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Uusr = "";
			Cdat = "";
			Ctim = "";
			Modu = "";
			Ccs_epid = "";
			Act_ordno = "";
			Act_consult = "";
			Attnd_as = "";
			Act_priorty = "";
			Txtact_priorty = "";
			Act_status = "";
			Txtact_status = "";
			Trans_req = "";
			Txttrans_req = "";
			Pat_stat = "";
			Stat_reas = "";
			Opa_rsno = "";
			Opa_date = "";
			Opa_time = "";
			Act_wld_id = "";
			Act_bk_date = "";
			Act_bk_time = "";
			Tl_dose = "";
			Tl_fractions = "";
			Tl_dur = "";
			Ch_pl_st_dt = "";
			Ch_pl_reg = "";
			Txtch_pl_reg = "";
			Imag_dt = "";
			Tstp = "";
			Opa_rsnodesc = "";
			Opa_statustxt = "";
			Attend_astxt = "";
			Actdstat = "";
			Cr_id = "";
			Act_consultxt = "";
			Activitygrp = "";
			Activity_id = "";
			Action_id = "";
			Modality_id = "";
			Anaesthetic = "";
			Modality_idtxt = "";
			Modality_enrgy = "";
			Modalty_unit_id = "";
			Eststartdt = "";
			Estenddate = "";
			Activitygrptxt = "";
			Activity_idtxt = "";
			Action_idtxt = "";
			Sd_apptdt = "";
			Sd_appttm = "";
			Modality_unit_idtxt = "";
			Transreq_txt = "";
			Txcattype = "";
			Act_statusdt = "";
			Txcattypetxt = "";
			Appt_id = "";
			Appt_head_id = "";
			Appt_stat = "";
			Appt_date = "";
			Last_appt_date = "";
			Anaesttxt = "";
			Treatmentaction = "";
		}	
		public Go_ptplactFilter cloneObject()
		{
			Go_ptplactFilter newFilter = new Go_ptplactFilter();
			
			newFilter.Pt_act_id = this.Pt_act_id;
			newFilter.Pt_tp_id = this.Pt_tp_id;
			newFilter.Pkey = this.Pkey;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Rhcp = this.Rhcp;
			newFilter.Rusr = this.Rusr;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Uhcp = this.Uhcp;
			newFilter.Uusr = this.Uusr;
			newFilter.Cdat = this.Cdat;
			newFilter.Ctim = this.Ctim;
			newFilter.Modu = this.Modu;
			newFilter.Ccs_epid = this.Ccs_epid;
			newFilter.Act_ordno = this.Act_ordno;
			newFilter.Act_consult = this.Act_consult;
			newFilter.Attnd_as = this.Attnd_as;
			newFilter.Act_priorty = this.Act_priorty;
			newFilter.Txtact_priorty = this.Txtact_priorty;
			newFilter.Act_status = this.Act_status;
			newFilter.Txtact_status = this.Txtact_status;
			newFilter.Trans_req = this.Trans_req;
			newFilter.Txttrans_req = this.Txttrans_req;
			newFilter.Pat_stat = this.Pat_stat;
			newFilter.Stat_reas = this.Stat_reas;
			newFilter.Opa_rsno = this.Opa_rsno;
			newFilter.Opa_date = this.Opa_date;
			newFilter.Opa_time = this.Opa_time;
			newFilter.Act_wld_id = this.Act_wld_id;
			newFilter.Act_bk_date = this.Act_bk_date;
			newFilter.Act_bk_time = this.Act_bk_time;
			newFilter.Tl_dose = this.Tl_dose;
			newFilter.Tl_fractions = this.Tl_fractions;
			newFilter.Tl_dur = this.Tl_dur;
			newFilter.Ch_pl_st_dt = this.Ch_pl_st_dt;
			newFilter.Ch_pl_reg = this.Ch_pl_reg;
			newFilter.Txtch_pl_reg = this.Txtch_pl_reg;
			newFilter.Imag_dt = this.Imag_dt;
			newFilter.Tstp = this.Tstp;
			newFilter.Opa_rsnodesc = this.Opa_rsnodesc;
			newFilter.Opa_statustxt = this.Opa_statustxt;
			newFilter.Attend_astxt = this.Attend_astxt;
			newFilter.Actdstat = this.Actdstat;
			newFilter.Cr_id = this.Cr_id;
			newFilter.Act_consultxt = this.Act_consultxt;
			newFilter.Activitygrp = this.Activitygrp;
			newFilter.Activity_id = this.Activity_id;
			newFilter.Action_id = this.Action_id;
			newFilter.Modality_id = this.Modality_id;
			newFilter.Anaesthetic = this.Anaesthetic;
			newFilter.Modality_idtxt = this.Modality_idtxt;
			newFilter.Modality_enrgy = this.Modality_enrgy;
			newFilter.Modalty_unit_id = this.Modalty_unit_id;
			newFilter.Eststartdt = this.Eststartdt;
			newFilter.Estenddate = this.Estenddate;
			newFilter.Activitygrptxt = this.Activitygrptxt;
			newFilter.Activity_idtxt = this.Activity_idtxt;
			newFilter.Action_idtxt = this.Action_idtxt;
			newFilter.Sd_apptdt = this.Sd_apptdt;
			newFilter.Sd_appttm = this.Sd_appttm;
			newFilter.Modality_unit_idtxt = this.Modality_unit_idtxt;
			newFilter.Transreq_txt = this.Transreq_txt;
			newFilter.Txcattype = this.Txcattype;
			newFilter.Act_statusdt = this.Act_statusdt;
			newFilter.Txcattypetxt = this.Txcattypetxt;
			newFilter.Appt_id = this.Appt_id;
			newFilter.Appt_head_id = this.Appt_head_id;
			newFilter.Appt_stat = this.Appt_stat;
			newFilter.Appt_date = this.Appt_date;
			newFilter.Last_appt_date = this.Last_appt_date;
			newFilter.Anaesttxt = this.Anaesttxt;
			newFilter.Treatmentaction = this.Treatmentaction;
			
			return newFilter;
		}
	}
	public final class Go_ptplactEditFilter
	{			
		public boolean IncludePt_act_id = true;
		public boolean IncludePt_tp_id = true;
		public boolean IncludePkey = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeRhcp = true;
		public boolean IncludeRusr = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeUhcp = true;
		public boolean IncludeUusr = true;
		public boolean IncludeCdat = true;
		public boolean IncludeCtim = true;
		public boolean IncludeModu = true;
		public boolean IncludeCcs_epid = true;
		public boolean IncludeAct_ordno = true;
		public boolean IncludeAct_consult = true;
		public boolean IncludeAttnd_as = true;
		public boolean IncludeAct_priorty = true;
		public boolean IncludeTxtact_priorty = true;
		public boolean IncludeAct_status = true;
		public boolean IncludeTxtact_status = true;
		public boolean IncludeTrans_req = true;
		public boolean IncludeTxttrans_req = true;
		public boolean IncludePat_stat = true;
		public boolean IncludeStat_reas = true;
		public boolean IncludeOpa_rsno = true;
		public boolean IncludeOpa_date = true;
		public boolean IncludeOpa_time = true;
		public boolean IncludeAct_wld_id = true;
		public boolean IncludeAct_bk_date = true;
		public boolean IncludeAct_bk_time = true;
		public boolean IncludeTl_dose = true;
		public boolean IncludeTl_fractions = true;
		public boolean IncludeTl_dur = true;
		public boolean IncludeCh_pl_st_dt = true;
		public boolean IncludeCh_pl_reg = true;
		public boolean IncludeTxtch_pl_reg = true;
		public boolean IncludeImag_dt = true;
		public boolean IncludeTstp = true;
		public boolean IncludeOpa_rsnodesc = true;
		public boolean IncludeOpa_statustxt = true;
		public boolean IncludeAttend_astxt = true;
		public boolean IncludeActdstat = true;
		public boolean IncludeCr_id = true;
		public boolean IncludeAct_consultxt = true;
		public boolean IncludeActivitygrp = true;
		public boolean IncludeActivity_id = true;
		public boolean IncludeAction_id = true;
		public boolean IncludeModality_id = true;
		public boolean IncludeAnaesthetic = true;
		public boolean IncludeModality_idtxt = true;
		public boolean IncludeModality_enrgy = true;
		public boolean IncludeModalty_unit_id = true;
		public boolean IncludeEststartdt = true;
		public boolean IncludeEstenddate = true;
		public boolean IncludeActivitygrptxt = true;
		public boolean IncludeActivity_idtxt = true;
		public boolean IncludeAction_idtxt = true;
		public boolean IncludeSd_apptdt = true;
		public boolean IncludeSd_appttm = true;
		public boolean IncludeModality_unit_idtxt = true;
		public boolean IncludeTransreq_txt = true;
		public boolean IncludeTxcattype = true;
		public boolean IncludeAct_statusdt = true;
		public boolean IncludeTxcattypetxt = true;
		public boolean IncludeAppt_id = true;
		public boolean IncludeAppt_head_id = true;
		public boolean IncludeAppt_stat = true;
		public boolean IncludeAppt_date = true;
		public boolean IncludeLast_appt_date = true;
		public boolean IncludeAnaesttxt = true;
		public boolean IncludeTreatmentaction = true;
		
		public void includeAll()
		{				
			IncludePt_act_id = true;
			IncludePt_tp_id = true;
			IncludePkey = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeRhcp = true;
			IncludeRusr = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeUhcp = true;
			IncludeUusr = true;
			IncludeCdat = true;
			IncludeCtim = true;
			IncludeModu = true;
			IncludeCcs_epid = true;
			IncludeAct_ordno = true;
			IncludeAct_consult = true;
			IncludeAttnd_as = true;
			IncludeAct_priorty = true;
			IncludeTxtact_priorty = true;
			IncludeAct_status = true;
			IncludeTxtact_status = true;
			IncludeTrans_req = true;
			IncludeTxttrans_req = true;
			IncludePat_stat = true;
			IncludeStat_reas = true;
			IncludeOpa_rsno = true;
			IncludeOpa_date = true;
			IncludeOpa_time = true;
			IncludeAct_wld_id = true;
			IncludeAct_bk_date = true;
			IncludeAct_bk_time = true;
			IncludeTl_dose = true;
			IncludeTl_fractions = true;
			IncludeTl_dur = true;
			IncludeCh_pl_st_dt = true;
			IncludeCh_pl_reg = true;
			IncludeTxtch_pl_reg = true;
			IncludeImag_dt = true;
			IncludeTstp = true;
			IncludeOpa_rsnodesc = true;
			IncludeOpa_statustxt = true;
			IncludeAttend_astxt = true;
			IncludeActdstat = true;
			IncludeCr_id = true;
			IncludeAct_consultxt = true;
			IncludeActivitygrp = true;
			IncludeActivity_id = true;
			IncludeAction_id = true;
			IncludeModality_id = true;
			IncludeAnaesthetic = true;
			IncludeModality_idtxt = true;
			IncludeModality_enrgy = true;
			IncludeModalty_unit_id = true;
			IncludeEststartdt = true;
			IncludeEstenddate = true;
			IncludeActivitygrptxt = true;
			IncludeActivity_idtxt = true;
			IncludeAction_idtxt = true;
			IncludeSd_apptdt = true;
			IncludeSd_appttm = true;
			IncludeModality_unit_idtxt = true;
			IncludeTransreq_txt = true;
			IncludeTxcattype = true;
			IncludeAct_statusdt = true;
			IncludeTxcattypetxt = true;
			IncludeAppt_id = true;
			IncludeAppt_head_id = true;
			IncludeAppt_stat = true;
			IncludeAppt_date = true;
			IncludeLast_appt_date = true;
			IncludeAnaesttxt = true;
			IncludeTreatmentaction = true;
		}	
		public void excludeAll()
		{				
			IncludePt_act_id = false;
			IncludePt_tp_id = false;
			IncludePkey = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeRhcp = false;
			IncludeRusr = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeUhcp = false;
			IncludeUusr = false;
			IncludeCdat = false;
			IncludeCtim = false;
			IncludeModu = false;
			IncludeCcs_epid = false;
			IncludeAct_ordno = false;
			IncludeAct_consult = false;
			IncludeAttnd_as = false;
			IncludeAct_priorty = false;
			IncludeTxtact_priorty = false;
			IncludeAct_status = false;
			IncludeTxtact_status = false;
			IncludeTrans_req = false;
			IncludeTxttrans_req = false;
			IncludePat_stat = false;
			IncludeStat_reas = false;
			IncludeOpa_rsno = false;
			IncludeOpa_date = false;
			IncludeOpa_time = false;
			IncludeAct_wld_id = false;
			IncludeAct_bk_date = false;
			IncludeAct_bk_time = false;
			IncludeTl_dose = false;
			IncludeTl_fractions = false;
			IncludeTl_dur = false;
			IncludeCh_pl_st_dt = false;
			IncludeCh_pl_reg = false;
			IncludeTxtch_pl_reg = false;
			IncludeImag_dt = false;
			IncludeTstp = false;
			IncludeOpa_rsnodesc = false;
			IncludeOpa_statustxt = false;
			IncludeAttend_astxt = false;
			IncludeActdstat = false;
			IncludeCr_id = false;
			IncludeAct_consultxt = false;
			IncludeActivitygrp = false;
			IncludeActivity_id = false;
			IncludeAction_id = false;
			IncludeModality_id = false;
			IncludeAnaesthetic = false;
			IncludeModality_idtxt = false;
			IncludeModality_enrgy = false;
			IncludeModalty_unit_id = false;
			IncludeEststartdt = false;
			IncludeEstenddate = false;
			IncludeActivitygrptxt = false;
			IncludeActivity_idtxt = false;
			IncludeAction_idtxt = false;
			IncludeSd_apptdt = false;
			IncludeSd_appttm = false;
			IncludeModality_unit_idtxt = false;
			IncludeTransreq_txt = false;
			IncludeTxcattype = false;
			IncludeAct_statusdt = false;
			IncludeTxcattypetxt = false;
			IncludeAppt_id = false;
			IncludeAppt_head_id = false;
			IncludeAppt_stat = false;
			IncludeAppt_date = false;
			IncludeLast_appt_date = false;
			IncludeAnaesttxt = false;
			IncludeTreatmentaction = false;
		}
		public Go_ptplactEditFilter cloneObject()
		{
			Go_ptplactEditFilter newEditFilter = new Go_ptplactEditFilter();
			
			newEditFilter.IncludePt_act_id = this.IncludePt_act_id;
			newEditFilter.IncludePt_tp_id = this.IncludePt_tp_id;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeRhcp = this.IncludeRhcp;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeUhcp = this.IncludeUhcp;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeModu = this.IncludeModu;
			newEditFilter.IncludeCcs_epid = this.IncludeCcs_epid;
			newEditFilter.IncludeAct_ordno = this.IncludeAct_ordno;
			newEditFilter.IncludeAct_consult = this.IncludeAct_consult;
			newEditFilter.IncludeAttnd_as = this.IncludeAttnd_as;
			newEditFilter.IncludeAct_priorty = this.IncludeAct_priorty;
			newEditFilter.IncludeTxtact_priorty = this.IncludeTxtact_priorty;
			newEditFilter.IncludeAct_status = this.IncludeAct_status;
			newEditFilter.IncludeTxtact_status = this.IncludeTxtact_status;
			newEditFilter.IncludeTrans_req = this.IncludeTrans_req;
			newEditFilter.IncludeTxttrans_req = this.IncludeTxttrans_req;
			newEditFilter.IncludePat_stat = this.IncludePat_stat;
			newEditFilter.IncludeStat_reas = this.IncludeStat_reas;
			newEditFilter.IncludeOpa_rsno = this.IncludeOpa_rsno;
			newEditFilter.IncludeOpa_date = this.IncludeOpa_date;
			newEditFilter.IncludeOpa_time = this.IncludeOpa_time;
			newEditFilter.IncludeAct_wld_id = this.IncludeAct_wld_id;
			newEditFilter.IncludeAct_bk_date = this.IncludeAct_bk_date;
			newEditFilter.IncludeAct_bk_time = this.IncludeAct_bk_time;
			newEditFilter.IncludeTl_dose = this.IncludeTl_dose;
			newEditFilter.IncludeTl_fractions = this.IncludeTl_fractions;
			newEditFilter.IncludeTl_dur = this.IncludeTl_dur;
			newEditFilter.IncludeCh_pl_st_dt = this.IncludeCh_pl_st_dt;
			newEditFilter.IncludeCh_pl_reg = this.IncludeCh_pl_reg;
			newEditFilter.IncludeTxtch_pl_reg = this.IncludeTxtch_pl_reg;
			newEditFilter.IncludeImag_dt = this.IncludeImag_dt;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeOpa_rsnodesc = this.IncludeOpa_rsnodesc;
			newEditFilter.IncludeOpa_statustxt = this.IncludeOpa_statustxt;
			newEditFilter.IncludeAttend_astxt = this.IncludeAttend_astxt;
			newEditFilter.IncludeActdstat = this.IncludeActdstat;
			newEditFilter.IncludeCr_id = this.IncludeCr_id;
			newEditFilter.IncludeAct_consultxt = this.IncludeAct_consultxt;
			newEditFilter.IncludeActivitygrp = this.IncludeActivitygrp;
			newEditFilter.IncludeActivity_id = this.IncludeActivity_id;
			newEditFilter.IncludeAction_id = this.IncludeAction_id;
			newEditFilter.IncludeModality_id = this.IncludeModality_id;
			newEditFilter.IncludeAnaesthetic = this.IncludeAnaesthetic;
			newEditFilter.IncludeModality_idtxt = this.IncludeModality_idtxt;
			newEditFilter.IncludeModality_enrgy = this.IncludeModality_enrgy;
			newEditFilter.IncludeModalty_unit_id = this.IncludeModalty_unit_id;
			newEditFilter.IncludeEststartdt = this.IncludeEststartdt;
			newEditFilter.IncludeEstenddate = this.IncludeEstenddate;
			newEditFilter.IncludeActivitygrptxt = this.IncludeActivitygrptxt;
			newEditFilter.IncludeActivity_idtxt = this.IncludeActivity_idtxt;
			newEditFilter.IncludeAction_idtxt = this.IncludeAction_idtxt;
			newEditFilter.IncludeSd_apptdt = this.IncludeSd_apptdt;
			newEditFilter.IncludeSd_appttm = this.IncludeSd_appttm;
			newEditFilter.IncludeModality_unit_idtxt = this.IncludeModality_unit_idtxt;
			newEditFilter.IncludeTransreq_txt = this.IncludeTransreq_txt;
			newEditFilter.IncludeTxcattype = this.IncludeTxcattype;
			newEditFilter.IncludeAct_statusdt = this.IncludeAct_statusdt;
			newEditFilter.IncludeTxcattypetxt = this.IncludeTxcattypetxt;
			newEditFilter.IncludeAppt_id = this.IncludeAppt_id;
			newEditFilter.IncludeAppt_head_id = this.IncludeAppt_head_id;
			newEditFilter.IncludeAppt_stat = this.IncludeAppt_stat;
			newEditFilter.IncludeAppt_date = this.IncludeAppt_date;
			newEditFilter.IncludeLast_appt_date = this.IncludeLast_appt_date;
			newEditFilter.IncludeAnaesttxt = this.IncludeAnaesttxt;
			newEditFilter.IncludeTreatmentaction = this.IncludeTreatmentaction;
			
			return newEditFilter;
		}
	}
}
