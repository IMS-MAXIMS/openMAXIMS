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

public final class Sd_aalst implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_aalst.class);
	
	private Sd_aalstFilter lastGetFilter = null;
	private final String serviceName = "SD_AALST";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_aalstFilter Filter = new Sd_aalstFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_aalstEditFilter EditFilter = new Sd_aalstEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_aalstCollection DataCollection = new Sd_aalstCollection();

	/**
	 * Creates a new Sd_aalst Data Transfer Object.
	 */ 
	public Sd_aalst(ims.dto.Connection connection)
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
	public Sd_aalst cloneObject()
	{
		Sd_aalst cloneObject = new Sd_aalst(Connection);
			
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
			cloneObject.DataCollection.get(index).Modu = DataCollection.get(x).Modu;
			cloneObject.DataCollection.get(index).Ccs_epid = DataCollection.get(x).Ccs_epid;
			cloneObject.DataCollection.get(index).Activitygrp = DataCollection.get(x).Activitygrp;
			cloneObject.DataCollection.get(index).Activity_id = DataCollection.get(x).Activity_id;
			cloneObject.DataCollection.get(index).Action_id = DataCollection.get(x).Action_id;
			cloneObject.DataCollection.get(index).Act_priorty = DataCollection.get(x).Act_priorty;
			cloneObject.DataCollection.get(index).Act_consult = DataCollection.get(x).Act_consult;
			cloneObject.DataCollection.get(index).Act_consultxt = DataCollection.get(x).Act_consultxt;
			cloneObject.DataCollection.get(index).Appt_head_id = DataCollection.get(x).Appt_head_id;
			cloneObject.DataCollection.get(index).Attnd_as = DataCollection.get(x).Attnd_as;
			cloneObject.DataCollection.get(index).Attend_astxt = DataCollection.get(x).Attend_astxt;
			cloneObject.DataCollection.get(index).Act_status = DataCollection.get(x).Act_status;
			cloneObject.DataCollection.get(index).Act_statustxt = DataCollection.get(x).Act_statustxt;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Pat_stat = DataCollection.get(x).Pat_stat;
			cloneObject.DataCollection.get(index).Stat_reas = DataCollection.get(x).Stat_reas;
			cloneObject.DataCollection.get(index).Opa_date = DataCollection.get(x).Opa_date;
			cloneObject.DataCollection.get(index).Act_wld_id = DataCollection.get(x).Act_wld_id;
			cloneObject.DataCollection.get(index).Act_bk_date = DataCollection.get(x).Act_bk_date;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Actdstat = DataCollection.get(x).Actdstat;
			cloneObject.DataCollection.get(index).Eststartdt = DataCollection.get(x).Eststartdt;
			cloneObject.DataCollection.get(index).Estenddate = DataCollection.get(x).Estenddate;
			cloneObject.DataCollection.get(index).Sd_apptdt = DataCollection.get(x).Sd_apptdt;
			cloneObject.DataCollection.get(index).Sd_apptm = DataCollection.get(x).Sd_apptm;
			cloneObject.DataCollection.get(index).Snm = DataCollection.get(x).Snm;
			cloneObject.DataCollection.get(index).Fnm = DataCollection.get(x).Fnm;
			cloneObject.DataCollection.get(index).Durwait = DataCollection.get(x).Durwait;
			cloneObject.DataCollection.get(index).Tp_des_treat = DataCollection.get(x).Tp_des_treat;
			cloneObject.DataCollection.get(index).Txcattype = DataCollection.get(x).Txcattype;
			cloneObject.DataCollection.get(index).Txcattypetxt = DataCollection.get(x).Txcattypetxt;
			cloneObject.DataCollection.get(index).Actstat = DataCollection.get(x).Actstat;
							
			
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
		return "Sd_aalst.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_aalst.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_aalst.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_aalst.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_aalst.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_aalst.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_aalst.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_aalst.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_aalst.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_aalst.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_aalst.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_aalst.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_aalst.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_aalst.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_aalst.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_aalst.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_aalst.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_aalst.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_aalst.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_aalst.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_aalst.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_aalst.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_aalst.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_aalst.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_aalst.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_aalst.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_aalst.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_aalst nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_aalst After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_aalst After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_aalst.List");
							
		listInProgress = true;	
		logger.debug("Sd_aalst Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_aalst After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_aalst After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_aalstFilter filter)
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
		
		if(Filter.Act_priorty != null && filter.Act_priorty.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_PRIORTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_priorty);
		}
		
		if(Filter.Act_consult != null && filter.Act_consult.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_CONSULT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_consult);
		}
		
		if(Filter.Act_consultxt != null && filter.Act_consultxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_CONSULTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_consultxt);
		}
		
		if(Filter.Appt_head_id != null && filter.Appt_head_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_HEAD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_head_id);
		}
		
		if(Filter.Attnd_as != null && filter.Attnd_as.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ATTND_AS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Attnd_as);
		}
		
		if(Filter.Attend_astxt != null && filter.Attend_astxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ATTEND_ASTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Attend_astxt);
		}
		
		if(Filter.Act_status != null && filter.Act_status.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_status);
		}
		
		if(Filter.Act_statustxt != null && filter.Act_statustxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_STATUSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_statustxt);
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum);
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
		
		if(Filter.Opa_date != null && filter.Opa_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OPA_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Opa_date);
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
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
		}
		
		if(Filter.Actdstat != null && filter.Actdstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTDSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Actdstat);
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
		
		if(Filter.Sd_apptdt != null && filter.Sd_apptdt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SD_APPTDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sd_apptdt);
		}
		
		if(Filter.Sd_apptm != null && filter.Sd_apptm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SD_APPTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sd_apptm);
		}
		
		if(Filter.Snm != null && filter.Snm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Snm);
		}
		
		if(Filter.Fnm != null && filter.Fnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fnm);
		}
		
		if(Filter.Durwait != null && filter.Durwait.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DURWAIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Durwait);
		}
		
		if(Filter.Tp_des_treat != null && filter.Tp_des_treat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TP_DES_TREAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tp_des_treat);
		}
		
		if(Filter.Txcattype != null && filter.Txcattype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TXCATTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Txcattype);
		}
		
		if(Filter.Txcattypetxt != null && filter.Txcattypetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TXCATTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Txcattypetxt);
		}
		
		if(Filter.Actstat != null && filter.Actstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Actstat);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_aalstRecord data = (Sd_aalstRecord)DataCollection.get(0);
		
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
		
		if(EditFilter.IncludeAct_priorty)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_PRIORTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_priorty));
		}
		
		if(EditFilter.IncludeAct_consult)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_CONSULT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_consult));
		}
		
		if(EditFilter.IncludeAct_consultxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_CONSULTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_consultxt));
		}
		
		if(EditFilter.IncludeAppt_head_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_HEAD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_head_id));
		}
		
		if(EditFilter.IncludeAttnd_as)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ATTND_AS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Attnd_as));
		}
		
		if(EditFilter.IncludeAttend_astxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ATTEND_ASTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Attend_astxt));
		}
		
		if(EditFilter.IncludeAct_status)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_status));
		}
		
		if(EditFilter.IncludeAct_statustxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_STATUSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_statustxt));
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum));
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
		
		if(EditFilter.IncludeOpa_date)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OPA_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Opa_date));
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
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
		}
		
		if(EditFilter.IncludeActdstat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTDSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Actdstat));
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
		
		if(EditFilter.IncludeSd_apptdt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SD_APPTDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sd_apptdt));
		}
		
		if(EditFilter.IncludeSd_apptm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SD_APPTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sd_apptm));
		}
		
		if(EditFilter.IncludeSnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Snm));
		}
		
		if(EditFilter.IncludeFnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fnm));
		}
		
		if(EditFilter.IncludeDurwait)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DURWAIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Durwait));
		}
		
		if(EditFilter.IncludeTp_des_treat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TP_DES_TREAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tp_des_treat));
		}
		
		if(EditFilter.IncludeTxcattype)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXCATTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Txcattype));
		}
		
		if(EditFilter.IncludeTxcattypetxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXCATTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Txcattypetxt));
		}
		
		if(EditFilter.IncludeActstat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Actstat));
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
			Sd_aalstRecord record = new Sd_aalstRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Pt_act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PT_ACT_ID"));
			record.Pt_tp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PT_TP_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Activitygrp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITYGRP"));
			record.Activity_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITY_ID"));
			record.Action_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_ID"));
			record.Act_priorty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_PRIORTY"));
			record.Act_consult = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULT"));
			record.Act_consultxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULTXT"));
			record.Appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HEAD_ID"));
			record.Attnd_as = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTND_AS"));
			record.Attend_astxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTEND_ASTXT"));
			record.Act_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STATUS"));
			record.Act_statustxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STATUSTXT"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Pat_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_STAT"));
			record.Stat_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT_REAS"));
			record.Opa_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPA_DATE"));
			record.Act_wld_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_WLD_ID"));
			record.Act_bk_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_BK_DATE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Actdstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTDSTAT"));
			record.Eststartdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTSTARTDT"));
			record.Estenddate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTENDDATE"));
			record.Sd_apptdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_APPTDT"));
			record.Sd_apptm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_APPTM"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM"));
			record.Durwait = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DURWAIT"));
			record.Tp_des_treat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TP_DES_TREAT"));
			record.Txcattype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPE"));
			record.Txcattypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPETXT"));
			record.Actstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTSTAT"));
									
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
			Sd_aalstRecord record = new Sd_aalstRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pt_act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PT_ACT_ID"));
			record.Pt_tp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PT_TP_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Activitygrp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITYGRP"));
			record.Activity_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITY_ID"));
			record.Action_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_ID"));
			record.Act_priorty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_PRIORTY"));
			record.Act_consult = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULT"));
			record.Act_consultxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULTXT"));
			record.Appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HEAD_ID"));
			record.Attnd_as = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTND_AS"));
			record.Attend_astxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTEND_ASTXT"));
			record.Act_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STATUS"));
			record.Act_statustxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STATUSTXT"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Pat_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_STAT"));
			record.Stat_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT_REAS"));
			record.Opa_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPA_DATE"));
			record.Act_wld_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_WLD_ID"));
			record.Act_bk_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_BK_DATE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Actdstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTDSTAT"));
			record.Eststartdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTSTARTDT"));
			record.Estenddate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTENDDATE"));
			record.Sd_apptdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_APPTDT"));
			record.Sd_apptm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_APPTM"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM"));
			record.Durwait = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DURWAIT"));
			record.Tp_des_treat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TP_DES_TREAT"));
			record.Txcattype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPE"));
			record.Txcattypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPETXT"));
			record.Actstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTSTAT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Sd_aalstCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_aalstRecord newRecord = new Sd_aalstRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_aalstRecord record)
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
		public Sd_aalstRecord get(int index)
		{
			return (Sd_aalstRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_aalstRecord
	{
		public String Pt_act_id = "";
		public String Pt_tp_id = "";
		public String Pkey = "";
		public String Modu = "";
		public String Ccs_epid = "";
		public String Activitygrp = "";
		public String Activity_id = "";
		public String Action_id = "";
		public String Act_priorty = "";
		public String Act_consult = "";
		public String Act_consultxt = "";
		public String Appt_head_id = "";
		public String Attnd_as = "";
		public String Attend_astxt = "";
		public String Act_status = "";
		public String Act_statustxt = "";
		public String Hospnum = "";
		public String Pat_stat = "";
		public String Stat_reas = "";
		public String Opa_date = "";
		public String Act_wld_id = "";
		public String Act_bk_date = "";
		public String Tstp = "";
		public String Actdstat = "";
		public String Eststartdt = "";
		public String Estenddate = "";
		public String Sd_apptdt = "";
		public String Sd_apptm = "";
		public String Snm = "";
		public String Fnm = "";
		public String Durwait = "";
		public String Tp_des_treat = "";
		public String Txcattype = "";
		public String Txcattypetxt = "";
		public String Actstat = "";
				
		
		public void clear()
		{
			Pt_act_id = "";
			Pt_tp_id = "";
			Pkey = "";
			Modu = "";
			Ccs_epid = "";
			Activitygrp = "";
			Activity_id = "";
			Action_id = "";
			Act_priorty = "";
			Act_consult = "";
			Act_consultxt = "";
			Appt_head_id = "";
			Attnd_as = "";
			Attend_astxt = "";
			Act_status = "";
			Act_statustxt = "";
			Hospnum = "";
			Pat_stat = "";
			Stat_reas = "";
			Opa_date = "";
			Act_wld_id = "";
			Act_bk_date = "";
			Tstp = "";
			Actdstat = "";
			Eststartdt = "";
			Estenddate = "";
			Sd_apptdt = "";
			Sd_apptm = "";
			Snm = "";
			Fnm = "";
			Durwait = "";
			Tp_des_treat = "";
			Txcattype = "";
			Txcattypetxt = "";
			Actstat = "";
			
		}		
	}
		
		
	public final class Sd_aalstFilter
	{			
		public String Pt_act_id = "";
		public String Pt_tp_id = "";
		public String Pkey = "";
		public String Modu = "";
		public String Ccs_epid = "";
		public String Activitygrp = "";
		public String Activity_id = "";
		public String Action_id = "";
		public String Act_priorty = "";
		public String Act_consult = "";
		public String Act_consultxt = "";
		public String Appt_head_id = "";
		public String Attnd_as = "";
		public String Attend_astxt = "";
		public String Act_status = "";
		public String Act_statustxt = "";
		public String Hospnum = "";
		public String Pat_stat = "";
		public String Stat_reas = "";
		public String Opa_date = "";
		public String Act_wld_id = "";
		public String Act_bk_date = "";
		public String Tstp = "";
		public String Actdstat = "";
		public String Eststartdt = "";
		public String Estenddate = "";
		public String Sd_apptdt = "";
		public String Sd_apptm = "";
		public String Snm = "";
		public String Fnm = "";
		public String Durwait = "";
		public String Tp_des_treat = "";
		public String Txcattype = "";
		public String Txcattypetxt = "";
		public String Actstat = "";
		
		public void clear()
		{				
			Pt_act_id = "";
			Pt_tp_id = "";
			Pkey = "";
			Modu = "";
			Ccs_epid = "";
			Activitygrp = "";
			Activity_id = "";
			Action_id = "";
			Act_priorty = "";
			Act_consult = "";
			Act_consultxt = "";
			Appt_head_id = "";
			Attnd_as = "";
			Attend_astxt = "";
			Act_status = "";
			Act_statustxt = "";
			Hospnum = "";
			Pat_stat = "";
			Stat_reas = "";
			Opa_date = "";
			Act_wld_id = "";
			Act_bk_date = "";
			Tstp = "";
			Actdstat = "";
			Eststartdt = "";
			Estenddate = "";
			Sd_apptdt = "";
			Sd_apptm = "";
			Snm = "";
			Fnm = "";
			Durwait = "";
			Tp_des_treat = "";
			Txcattype = "";
			Txcattypetxt = "";
			Actstat = "";
		}	
		public Sd_aalstFilter cloneObject()
		{
			Sd_aalstFilter newFilter = new Sd_aalstFilter();
			
			newFilter.Pt_act_id = this.Pt_act_id;
			newFilter.Pt_tp_id = this.Pt_tp_id;
			newFilter.Pkey = this.Pkey;
			newFilter.Modu = this.Modu;
			newFilter.Ccs_epid = this.Ccs_epid;
			newFilter.Activitygrp = this.Activitygrp;
			newFilter.Activity_id = this.Activity_id;
			newFilter.Action_id = this.Action_id;
			newFilter.Act_priorty = this.Act_priorty;
			newFilter.Act_consult = this.Act_consult;
			newFilter.Act_consultxt = this.Act_consultxt;
			newFilter.Appt_head_id = this.Appt_head_id;
			newFilter.Attnd_as = this.Attnd_as;
			newFilter.Attend_astxt = this.Attend_astxt;
			newFilter.Act_status = this.Act_status;
			newFilter.Act_statustxt = this.Act_statustxt;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Pat_stat = this.Pat_stat;
			newFilter.Stat_reas = this.Stat_reas;
			newFilter.Opa_date = this.Opa_date;
			newFilter.Act_wld_id = this.Act_wld_id;
			newFilter.Act_bk_date = this.Act_bk_date;
			newFilter.Tstp = this.Tstp;
			newFilter.Actdstat = this.Actdstat;
			newFilter.Eststartdt = this.Eststartdt;
			newFilter.Estenddate = this.Estenddate;
			newFilter.Sd_apptdt = this.Sd_apptdt;
			newFilter.Sd_apptm = this.Sd_apptm;
			newFilter.Snm = this.Snm;
			newFilter.Fnm = this.Fnm;
			newFilter.Durwait = this.Durwait;
			newFilter.Tp_des_treat = this.Tp_des_treat;
			newFilter.Txcattype = this.Txcattype;
			newFilter.Txcattypetxt = this.Txcattypetxt;
			newFilter.Actstat = this.Actstat;
			
			return newFilter;
		}
	}
	public final class Sd_aalstEditFilter
	{			
		public boolean IncludePt_act_id = true;
		public boolean IncludePt_tp_id = true;
		public boolean IncludePkey = true;
		public boolean IncludeModu = true;
		public boolean IncludeCcs_epid = true;
		public boolean IncludeActivitygrp = true;
		public boolean IncludeActivity_id = true;
		public boolean IncludeAction_id = true;
		public boolean IncludeAct_priorty = true;
		public boolean IncludeAct_consult = true;
		public boolean IncludeAct_consultxt = true;
		public boolean IncludeAppt_head_id = true;
		public boolean IncludeAttnd_as = true;
		public boolean IncludeAttend_astxt = true;
		public boolean IncludeAct_status = true;
		public boolean IncludeAct_statustxt = true;
		public boolean IncludeHospnum = true;
		public boolean IncludePat_stat = true;
		public boolean IncludeStat_reas = true;
		public boolean IncludeOpa_date = true;
		public boolean IncludeAct_wld_id = true;
		public boolean IncludeAct_bk_date = true;
		public boolean IncludeTstp = true;
		public boolean IncludeActdstat = true;
		public boolean IncludeEststartdt = true;
		public boolean IncludeEstenddate = true;
		public boolean IncludeSd_apptdt = true;
		public boolean IncludeSd_apptm = true;
		public boolean IncludeSnm = true;
		public boolean IncludeFnm = true;
		public boolean IncludeDurwait = true;
		public boolean IncludeTp_des_treat = true;
		public boolean IncludeTxcattype = true;
		public boolean IncludeTxcattypetxt = true;
		public boolean IncludeActstat = true;
		
		public void includeAll()
		{				
			IncludePt_act_id = true;
			IncludePt_tp_id = true;
			IncludePkey = true;
			IncludeModu = true;
			IncludeCcs_epid = true;
			IncludeActivitygrp = true;
			IncludeActivity_id = true;
			IncludeAction_id = true;
			IncludeAct_priorty = true;
			IncludeAct_consult = true;
			IncludeAct_consultxt = true;
			IncludeAppt_head_id = true;
			IncludeAttnd_as = true;
			IncludeAttend_astxt = true;
			IncludeAct_status = true;
			IncludeAct_statustxt = true;
			IncludeHospnum = true;
			IncludePat_stat = true;
			IncludeStat_reas = true;
			IncludeOpa_date = true;
			IncludeAct_wld_id = true;
			IncludeAct_bk_date = true;
			IncludeTstp = true;
			IncludeActdstat = true;
			IncludeEststartdt = true;
			IncludeEstenddate = true;
			IncludeSd_apptdt = true;
			IncludeSd_apptm = true;
			IncludeSnm = true;
			IncludeFnm = true;
			IncludeDurwait = true;
			IncludeTp_des_treat = true;
			IncludeTxcattype = true;
			IncludeTxcattypetxt = true;
			IncludeActstat = true;
		}	
		public void excludeAll()
		{				
			IncludePt_act_id = false;
			IncludePt_tp_id = false;
			IncludePkey = false;
			IncludeModu = false;
			IncludeCcs_epid = false;
			IncludeActivitygrp = false;
			IncludeActivity_id = false;
			IncludeAction_id = false;
			IncludeAct_priorty = false;
			IncludeAct_consult = false;
			IncludeAct_consultxt = false;
			IncludeAppt_head_id = false;
			IncludeAttnd_as = false;
			IncludeAttend_astxt = false;
			IncludeAct_status = false;
			IncludeAct_statustxt = false;
			IncludeHospnum = false;
			IncludePat_stat = false;
			IncludeStat_reas = false;
			IncludeOpa_date = false;
			IncludeAct_wld_id = false;
			IncludeAct_bk_date = false;
			IncludeTstp = false;
			IncludeActdstat = false;
			IncludeEststartdt = false;
			IncludeEstenddate = false;
			IncludeSd_apptdt = false;
			IncludeSd_apptm = false;
			IncludeSnm = false;
			IncludeFnm = false;
			IncludeDurwait = false;
			IncludeTp_des_treat = false;
			IncludeTxcattype = false;
			IncludeTxcattypetxt = false;
			IncludeActstat = false;
		}
		public Sd_aalstEditFilter cloneObject()
		{
			Sd_aalstEditFilter newEditFilter = new Sd_aalstEditFilter();
			
			newEditFilter.IncludePt_act_id = this.IncludePt_act_id;
			newEditFilter.IncludePt_tp_id = this.IncludePt_tp_id;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeModu = this.IncludeModu;
			newEditFilter.IncludeCcs_epid = this.IncludeCcs_epid;
			newEditFilter.IncludeActivitygrp = this.IncludeActivitygrp;
			newEditFilter.IncludeActivity_id = this.IncludeActivity_id;
			newEditFilter.IncludeAction_id = this.IncludeAction_id;
			newEditFilter.IncludeAct_priorty = this.IncludeAct_priorty;
			newEditFilter.IncludeAct_consult = this.IncludeAct_consult;
			newEditFilter.IncludeAct_consultxt = this.IncludeAct_consultxt;
			newEditFilter.IncludeAppt_head_id = this.IncludeAppt_head_id;
			newEditFilter.IncludeAttnd_as = this.IncludeAttnd_as;
			newEditFilter.IncludeAttend_astxt = this.IncludeAttend_astxt;
			newEditFilter.IncludeAct_status = this.IncludeAct_status;
			newEditFilter.IncludeAct_statustxt = this.IncludeAct_statustxt;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludePat_stat = this.IncludePat_stat;
			newEditFilter.IncludeStat_reas = this.IncludeStat_reas;
			newEditFilter.IncludeOpa_date = this.IncludeOpa_date;
			newEditFilter.IncludeAct_wld_id = this.IncludeAct_wld_id;
			newEditFilter.IncludeAct_bk_date = this.IncludeAct_bk_date;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeActdstat = this.IncludeActdstat;
			newEditFilter.IncludeEststartdt = this.IncludeEststartdt;
			newEditFilter.IncludeEstenddate = this.IncludeEstenddate;
			newEditFilter.IncludeSd_apptdt = this.IncludeSd_apptdt;
			newEditFilter.IncludeSd_apptm = this.IncludeSd_apptm;
			newEditFilter.IncludeSnm = this.IncludeSnm;
			newEditFilter.IncludeFnm = this.IncludeFnm;
			newEditFilter.IncludeDurwait = this.IncludeDurwait;
			newEditFilter.IncludeTp_des_treat = this.IncludeTp_des_treat;
			newEditFilter.IncludeTxcattype = this.IncludeTxcattype;
			newEditFilter.IncludeTxcattypetxt = this.IncludeTxcattypetxt;
			newEditFilter.IncludeActstat = this.IncludeActstat;
			
			return newEditFilter;
		}
	}
}
