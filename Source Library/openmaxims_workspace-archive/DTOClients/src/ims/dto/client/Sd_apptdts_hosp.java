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

public final class Sd_apptdts_hosp implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_apptdts_hosp.class);
	
	private Sd_apptdts_hospFilter lastGetFilter = null;
	private final String serviceName = "SD_APPTDTS_HOSP";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_apptdts_hospFilter Filter = new Sd_apptdts_hospFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_apptdts_hospEditFilter EditFilter = new Sd_apptdts_hospEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_apptdts_hospCollection DataCollection = new Sd_apptdts_hospCollection();

	/**
	 * Creates a new Sd_apptdts_hosp Data Transfer Object.
	 */ 
	public Sd_apptdts_hosp(ims.dto.Connection connection)
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
	public Sd_apptdts_hosp cloneObject()
	{
		Sd_apptdts_hosp cloneObject = new Sd_apptdts_hosp(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Appt_id = DataCollection.get(x).Appt_id;
			cloneObject.DataCollection.get(index).Appt_head_id = DataCollection.get(x).Appt_head_id;
			cloneObject.DataCollection.get(index).Prfile_sess_id = DataCollection.get(x).Prfile_sess_id;
			cloneObject.DataCollection.get(index).Prfiled_sess_id = DataCollection.get(x).Prfiled_sess_id;
			cloneObject.DataCollection.get(index).Contract_id = DataCollection.get(x).Contract_id;
			cloneObject.DataCollection.get(index).Att_stat = DataCollection.get(x).Att_stat;
			cloneObject.DataCollection.get(index).Att_stat_reas = DataCollection.get(x).Att_stat_reas;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Snm = DataCollection.get(x).Snm;
			cloneObject.DataCollection.get(index).Fnm1 = DataCollection.get(x).Fnm1;
			cloneObject.DataCollection.get(index).Titl = DataCollection.get(x).Titl;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Sex = DataCollection.get(x).Sex;
			cloneObject.DataCollection.get(index).Stm = DataCollection.get(x).Stm;
			cloneObject.DataCollection.get(index).Etm = DataCollection.get(x).Etm;
			cloneObject.DataCollection.get(index).Appt_dt = DataCollection.get(x).Appt_dt;
			cloneObject.DataCollection.get(index).Appt_stat = DataCollection.get(x).Appt_stat;
			cloneObject.DataCollection.get(index).Prty = DataCollection.get(x).Prty;
			cloneObject.DataCollection.get(index).Mc_id = DataCollection.get(x).Mc_id;
			cloneObject.DataCollection.get(index).Mcmodality_id = DataCollection.get(x).Mcmodality_id;
			cloneObject.DataCollection.get(index).Modid = DataCollection.get(x).Modid;
			cloneObject.DataCollection.get(index).Modidtxt = DataCollection.get(x).Modidtxt;
			cloneObject.DataCollection.get(index).Modenrgy = DataCollection.get(x).Modenrgy;
			cloneObject.DataCollection.get(index).Modenrgyunit = DataCollection.get(x).Modenrgyunit;
			cloneObject.DataCollection.get(index).Modenrgyunittxt = DataCollection.get(x).Modenrgyunittxt;
			cloneObject.DataCollection.get(index).Treatpl_act_id = DataCollection.get(x).Treatpl_act_id;
			cloneObject.DataCollection.get(index).Attnd_asid = DataCollection.get(x).Attnd_asid;
			cloneObject.DataCollection.get(index).Pat_stat = DataCollection.get(x).Pat_stat;
			cloneObject.DataCollection.get(index).Txcattype = DataCollection.get(x).Txcattype;
			cloneObject.DataCollection.get(index).Attnd_astxt = DataCollection.get(x).Attnd_astxt;
			cloneObject.DataCollection.get(index).Txcattypetxt = DataCollection.get(x).Txcattypetxt;
			cloneObject.DataCollection.get(index).Att_tm = DataCollection.get(x).Att_tm;
			cloneObject.DataCollection.get(index).Lo_id = DataCollection.get(x).Lo_id;
			cloneObject.DataCollection.get(index).Lo_idtxt = DataCollection.get(x).Lo_idtxt;
			cloneObject.DataCollection.get(index).Rel_appt_head_id = DataCollection.get(x).Rel_appt_head_id;
			cloneObject.DataCollection.get(index).Appt_stattxt = DataCollection.get(x).Appt_stattxt;
			cloneObject.DataCollection.get(index).Att_stattxt = DataCollection.get(x).Att_stattxt;
			cloneObject.DataCollection.get(index).Appt_cmts = DataCollection.get(x).Appt_cmts;
			cloneObject.DataCollection.get(index).Activ_id = DataCollection.get(x).Activ_id;
			cloneObject.DataCollection.get(index).Spec_cd = DataCollection.get(x).Spec_cd;
			cloneObject.DataCollection.get(index).Grp_id = DataCollection.get(x).Grp_id;
			cloneObject.DataCollection.get(index).Sess_dt = DataCollection.get(x).Sess_dt;
			cloneObject.DataCollection.get(index).Prtytxt = DataCollection.get(x).Prtytxt;
			cloneObject.DataCollection.get(index).Action_id = DataCollection.get(x).Action_id;
			cloneObject.DataCollection.get(index).Action_idtxt = DataCollection.get(x).Action_idtxt;
			cloneObject.DataCollection.get(index).Activitytxt = DataCollection.get(x).Activitytxt;
			cloneObject.DataCollection.get(index).Trans_typ = DataCollection.get(x).Trans_typ;
			cloneObject.DataCollection.get(index).First_appt_id = DataCollection.get(x).First_appt_id;
			cloneObject.DataCollection.get(index).Last_appt_id = DataCollection.get(x).Last_appt_id;
			cloneObject.DataCollection.get(index).Trans_typtxt = DataCollection.get(x).Trans_typtxt;
			cloneObject.DataCollection.get(index).Clinicflag = DataCollection.get(x).Clinicflag;
			cloneObject.DataCollection.get(index).Prfile_sess_idtxt = DataCollection.get(x).Prfile_sess_idtxt;
			cloneObject.DataCollection.get(index).Arr_tme = DataCollection.get(x).Arr_tme;
			cloneObject.DataCollection.get(index).Act_comp_flg = DataCollection.get(x).Act_comp_flg;
			cloneObject.DataCollection.get(index).Mc_nm = DataCollection.get(x).Mc_nm;
			cloneObject.DataCollection.get(index).Confirm_stat = DataCollection.get(x).Confirm_stat;
			cloneObject.DataCollection.get(index).Confirm_stattxt = DataCollection.get(x).Confirm_stattxt;
			cloneObject.DataCollection.get(index).Act_consult = DataCollection.get(x).Act_consult;
			cloneObject.DataCollection.get(index).Act_consulttxt = DataCollection.get(x).Act_consulttxt;
			cloneObject.DataCollection.get(index).Rel_appt_tm = DataCollection.get(x).Rel_appt_tm;
			cloneObject.DataCollection.get(index).Rel_appt_stattxt = DataCollection.get(x).Rel_appt_stattxt;
			cloneObject.DataCollection.get(index).Rel_appt_sesstxt = DataCollection.get(x).Rel_appt_sesstxt;
							
			
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
		return "Sd_apptdts_hosp.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_apptdts_hosp.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_apptdts_hosp.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_apptdts_hosp.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_apptdts_hosp.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_apptdts_hosp.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_apptdts_hosp.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_apptdts_hosp.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_apptdts_hosp.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_apptdts_hosp.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_apptdts_hosp.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_apptdts_hosp.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_apptdts_hosp.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_apptdts_hosp.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_apptdts_hosp.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_apptdts_hosp.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_apptdts_hosp.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_apptdts_hosp.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_apptdts_hosp.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_apptdts_hosp.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_apptdts_hosp.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_apptdts_hosp.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_apptdts_hosp.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_apptdts_hosp.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_apptdts_hosp.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_apptdts_hosp.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_apptdts_hosp.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_apptdts_hosp nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_apptdts_hosp After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_apptdts_hosp After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_apptdts_hosp.List");
							
		listInProgress = true;	
		logger.debug("Sd_apptdts_hosp Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_apptdts_hosp After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_apptdts_hosp After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_apptdts_hospFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
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
		
		if(Filter.Prfile_sess_id != null && filter.Prfile_sess_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRFILE_SESS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prfile_sess_id);
		}
		
		if(Filter.Prfiled_sess_id != null && filter.Prfiled_sess_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRFILED_SESS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prfiled_sess_id);
		}
		
		if(Filter.Contract_id != null && filter.Contract_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONTRACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Contract_id);
		}
		
		if(Filter.Att_stat != null && filter.Att_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ATT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Att_stat);
		}
		
		if(Filter.Att_stat_reas != null && filter.Att_stat_reas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ATT_STAT_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Att_stat_reas);
		}
		
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
		
		if(Filter.Titl != null && filter.Titl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Titl);
		}
		
		if(Filter.Dob != null && filter.Dob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dob);
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum);
		}
		
		if(Filter.Sex != null && filter.Sex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sex);
		}
		
		if(Filter.Stm != null && filter.Stm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stm);
		}
		
		if(Filter.Etm != null && filter.Etm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ETM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Etm);
		}
		
		if(Filter.Appt_dt != null && filter.Appt_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_dt);
		}
		
		if(Filter.Appt_stat != null && filter.Appt_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_stat);
		}
		
		if(Filter.Prty != null && filter.Prty.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prty);
		}
		
		if(Filter.Mc_id != null && filter.Mc_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_id);
		}
		
		if(Filter.Mcmodality_id != null && filter.Mcmodality_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MCMODALITY_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mcmodality_id);
		}
		
		if(Filter.Modid != null && filter.Modid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MODID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modid);
		}
		
		if(Filter.Modidtxt != null && filter.Modidtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MODIDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modidtxt);
		}
		
		if(Filter.Modenrgy != null && filter.Modenrgy.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MODENRGY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modenrgy);
		}
		
		if(Filter.Modenrgyunit != null && filter.Modenrgyunit.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MODENRGYUNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modenrgyunit);
		}
		
		if(Filter.Modenrgyunittxt != null && filter.Modenrgyunittxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MODENRGYUNITTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modenrgyunittxt);
		}
		
		if(Filter.Treatpl_act_id != null && filter.Treatpl_act_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TREATPL_ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Treatpl_act_id);
		}
		
		if(Filter.Attnd_asid != null && filter.Attnd_asid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ATTND_ASID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Attnd_asid);
		}
		
		if(Filter.Pat_stat != null && filter.Pat_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PAT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pat_stat);
		}
		
		if(Filter.Txcattype != null && filter.Txcattype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TXCATTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Txcattype);
		}
		
		if(Filter.Attnd_astxt != null && filter.Attnd_astxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ATTND_ASTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Attnd_astxt);
		}
		
		if(Filter.Txcattypetxt != null && filter.Txcattypetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TXCATTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Txcattypetxt);
		}
		
		if(Filter.Att_tm != null && filter.Att_tm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ATT_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Att_tm);
		}
		
		if(Filter.Lo_id != null && filter.Lo_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LO_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lo_id);
		}
		
		if(Filter.Lo_idtxt != null && filter.Lo_idtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LO_IDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lo_idtxt);
		}
		
		if(Filter.Rel_appt_head_id != null && filter.Rel_appt_head_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REL_APPT_HEAD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rel_appt_head_id);
		}
		
		if(Filter.Appt_stattxt != null && filter.Appt_stattxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_STATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_stattxt);
		}
		
		if(Filter.Att_stattxt != null && filter.Att_stattxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ATT_STATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Att_stattxt);
		}
		
		if(Filter.Appt_cmts != null && filter.Appt_cmts.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_CMTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_cmts);
		}
		
		if(Filter.Activ_id != null && filter.Activ_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activ_id);
		}
		
		if(Filter.Spec_cd != null && filter.Spec_cd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SPEC_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spec_cd);
		}
		
		if(Filter.Grp_id != null && filter.Grp_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GRP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Grp_id);
		}
		
		if(Filter.Sess_dt != null && filter.Sess_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SESS_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sess_dt);
		}
		
		if(Filter.Prtytxt != null && filter.Prtytxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRTYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prtytxt);
		}
		
		if(Filter.Action_id != null && filter.Action_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Action_id);
		}
		
		if(Filter.Action_idtxt != null && filter.Action_idtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTION_IDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Action_idtxt);
		}
		
		if(Filter.Activitytxt != null && filter.Activitytxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIVITYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activitytxt);
		}
		
		if(Filter.Trans_typ != null && filter.Trans_typ.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TRANS_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Trans_typ);
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
		
		if(Filter.Trans_typtxt != null && filter.Trans_typtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TRANS_TYPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Trans_typtxt);
		}
		
		if(Filter.Clinicflag != null && filter.Clinicflag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CLINICFLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clinicflag);
		}
		
		if(Filter.Prfile_sess_idtxt != null && filter.Prfile_sess_idtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRFILE_SESS_IDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prfile_sess_idtxt);
		}
		
		if(Filter.Arr_tme != null && filter.Arr_tme.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ARR_TME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Arr_tme);
		}
		
		if(Filter.Act_comp_flg != null && filter.Act_comp_flg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_COMP_FLG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_comp_flg);
		}
		
		if(Filter.Mc_nm != null && filter.Mc_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_nm);
		}
		
		if(Filter.Confirm_stat != null && filter.Confirm_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONFIRM_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Confirm_stat);
		}
		
		if(Filter.Confirm_stattxt != null && filter.Confirm_stattxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONFIRM_STATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Confirm_stattxt);
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
		
		if(Filter.Rel_appt_tm != null && filter.Rel_appt_tm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REL_APPT_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rel_appt_tm);
		}
		
		if(Filter.Rel_appt_stattxt != null && filter.Rel_appt_stattxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REL_APPT_STATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rel_appt_stattxt);
		}
		
		if(Filter.Rel_appt_sesstxt != null && filter.Rel_appt_sesstxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REL_APPT_SESSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rel_appt_sesstxt);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_apptdts_hospRecord data = (Sd_apptdts_hospRecord)DataCollection.get(0);
		
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
		
		if(EditFilter.IncludePrfile_sess_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILE_SESS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prfile_sess_id));
		}
		
		if(EditFilter.IncludePrfiled_sess_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILED_SESS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prfiled_sess_id));
		}
		
		if(EditFilter.IncludeContract_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONTRACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Contract_id));
		}
		
		if(EditFilter.IncludeAtt_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ATT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Att_stat));
		}
		
		if(EditFilter.IncludeAtt_stat_reas)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ATT_STAT_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Att_stat_reas));
		}
		
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
		
		if(EditFilter.IncludeTitl)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Titl));
		}
		
		if(EditFilter.IncludeDob)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dob));
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum));
		}
		
		if(EditFilter.IncludeSex)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sex));
		}
		
		if(EditFilter.IncludeStm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stm));
		}
		
		if(EditFilter.IncludeEtm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ETM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Etm));
		}
		
		if(EditFilter.IncludeAppt_dt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_dt));
		}
		
		if(EditFilter.IncludeAppt_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_stat));
		}
		
		if(EditFilter.IncludePrty)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prty));
		}
		
		if(EditFilter.IncludeMc_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_id));
		}
		
		if(EditFilter.IncludeMcmodality_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MCMODALITY_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mcmodality_id));
		}
		
		if(EditFilter.IncludeModid)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modid));
		}
		
		if(EditFilter.IncludeModidtxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODIDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modidtxt));
		}
		
		if(EditFilter.IncludeModenrgy)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODENRGY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modenrgy));
		}
		
		if(EditFilter.IncludeModenrgyunit)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODENRGYUNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modenrgyunit));
		}
		
		if(EditFilter.IncludeModenrgyunittxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODENRGYUNITTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modenrgyunittxt));
		}
		
		if(EditFilter.IncludeTreatpl_act_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TREATPL_ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Treatpl_act_id));
		}
		
		if(EditFilter.IncludeAttnd_asid)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ATTND_ASID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Attnd_asid));
		}
		
		if(EditFilter.IncludePat_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PAT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pat_stat));
		}
		
		if(EditFilter.IncludeTxcattype)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXCATTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Txcattype));
		}
		
		if(EditFilter.IncludeAttnd_astxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ATTND_ASTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Attnd_astxt));
		}
		
		if(EditFilter.IncludeTxcattypetxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXCATTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Txcattypetxt));
		}
		
		if(EditFilter.IncludeAtt_tm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ATT_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Att_tm));
		}
		
		if(EditFilter.IncludeLo_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LO_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lo_id));
		}
		
		if(EditFilter.IncludeLo_idtxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LO_IDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lo_idtxt));
		}
		
		if(EditFilter.IncludeRel_appt_head_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REL_APPT_HEAD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rel_appt_head_id));
		}
		
		if(EditFilter.IncludeAppt_stattxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_STATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_stattxt));
		}
		
		if(EditFilter.IncludeAtt_stattxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ATT_STATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Att_stattxt));
		}
		
		if(EditFilter.IncludeAppt_cmts)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_CMTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_cmts));
		}
		
		if(EditFilter.IncludeActiv_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activ_id));
		}
		
		if(EditFilter.IncludeSpec_cd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SPEC_CD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spec_cd));
		}
		
		if(EditFilter.IncludeGrp_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GRP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Grp_id));
		}
		
		if(EditFilter.IncludeSess_dt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESS_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sess_dt));
		}
		
		if(EditFilter.IncludePrtytxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRTYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prtytxt));
		}
		
		if(EditFilter.IncludeAction_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Action_id));
		}
		
		if(EditFilter.IncludeAction_idtxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_IDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Action_idtxt));
		}
		
		if(EditFilter.IncludeActivitytxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIVITYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activitytxt));
		}
		
		if(EditFilter.IncludeTrans_typ)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TRANS_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Trans_typ));
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
		
		if(EditFilter.IncludeTrans_typtxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TRANS_TYPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Trans_typtxt));
		}
		
		if(EditFilter.IncludeClinicflag)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CLINICFLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clinicflag));
		}
		
		if(EditFilter.IncludePrfile_sess_idtxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILE_SESS_IDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prfile_sess_idtxt));
		}
		
		if(EditFilter.IncludeArr_tme)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ARR_TME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Arr_tme));
		}
		
		if(EditFilter.IncludeAct_comp_flg)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_COMP_FLG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_comp_flg));
		}
		
		if(EditFilter.IncludeMc_nm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_nm));
		}
		
		if(EditFilter.IncludeConfirm_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONFIRM_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Confirm_stat));
		}
		
		if(EditFilter.IncludeConfirm_stattxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONFIRM_STATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Confirm_stattxt));
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
		
		if(EditFilter.IncludeRel_appt_tm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REL_APPT_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rel_appt_tm));
		}
		
		if(EditFilter.IncludeRel_appt_stattxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REL_APPT_STATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rel_appt_stattxt));
		}
		
		if(EditFilter.IncludeRel_appt_sesstxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REL_APPT_SESSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rel_appt_sesstxt));
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
			Sd_apptdts_hospRecord record = new Sd_apptdts_hospRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_ID"));
			record.Appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HEAD_ID"));
			record.Prfile_sess_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_ID"));
			record.Prfiled_sess_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILED_SESS_ID"));
			record.Contract_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTRACT_ID"));
			record.Att_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT_STAT"));
			record.Att_stat_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT_STAT_REAS"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Stm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STM"));
			record.Etm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETM"));
			record.Appt_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_DT"));
			record.Appt_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_STAT"));
			record.Prty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRTY"));
			record.Mc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID"));
			record.Mcmodality_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MCMODALITY_ID"));
			record.Modid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODID"));
			record.Modidtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODIDTXT"));
			record.Modenrgy = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODENRGY"));
			record.Modenrgyunit = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODENRGYUNIT"));
			record.Modenrgyunittxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODENRGYUNITTXT"));
			record.Treatpl_act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TREATPL_ACT_ID"));
			record.Attnd_asid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTND_ASID"));
			record.Pat_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_STAT"));
			record.Txcattype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPE"));
			record.Attnd_astxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTND_ASTXT"));
			record.Txcattypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPETXT"));
			record.Att_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT_TM"));
			record.Lo_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LO_ID"));
			record.Lo_idtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LO_IDTXT"));
			record.Rel_appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REL_APPT_HEAD_ID"));
			record.Appt_stattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_STATTXT"));
			record.Att_stattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT_STATTXT"));
			record.Appt_cmts = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_CMTS"));
			record.Activ_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIV_ID"));
			record.Spec_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPEC_CD"));
			record.Grp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GRP_ID"));
			record.Sess_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_DT"));
			record.Prtytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRTYTXT"));
			record.Action_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_ID"));
			record.Action_idtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_IDTXT"));
			record.Activitytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITYTXT"));
			record.Trans_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRANS_TYP"));
			record.First_appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_ID"));
			record.Last_appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LAST_APPT_ID"));
			record.Trans_typtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRANS_TYPTXT"));
			record.Clinicflag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLINICFLAG"));
			record.Prfile_sess_idtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_IDTXT"));
			record.Arr_tme = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ARR_TME"));
			record.Act_comp_flg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_COMP_FLG"));
			record.Mc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_NM"));
			record.Confirm_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONFIRM_STAT"));
			record.Confirm_stattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONFIRM_STATTXT"));
			record.Act_consult = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULT"));
			record.Act_consulttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULTTXT"));
			record.Rel_appt_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REL_APPT_TM"));
			record.Rel_appt_stattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REL_APPT_STATTXT"));
			record.Rel_appt_sesstxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REL_APPT_SESSTXT"));
									
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
			Sd_apptdts_hospRecord record = new Sd_apptdts_hospRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_ID"));
			record.Appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HEAD_ID"));
			record.Prfile_sess_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_ID"));
			record.Prfiled_sess_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILED_SESS_ID"));
			record.Contract_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTRACT_ID"));
			record.Att_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT_STAT"));
			record.Att_stat_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT_STAT_REAS"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Stm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STM"));
			record.Etm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETM"));
			record.Appt_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_DT"));
			record.Appt_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_STAT"));
			record.Prty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRTY"));
			record.Mc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID"));
			record.Mcmodality_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MCMODALITY_ID"));
			record.Modid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODID"));
			record.Modidtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODIDTXT"));
			record.Modenrgy = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODENRGY"));
			record.Modenrgyunit = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODENRGYUNIT"));
			record.Modenrgyunittxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODENRGYUNITTXT"));
			record.Treatpl_act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TREATPL_ACT_ID"));
			record.Attnd_asid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTND_ASID"));
			record.Pat_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_STAT"));
			record.Txcattype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPE"));
			record.Attnd_astxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTND_ASTXT"));
			record.Txcattypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPETXT"));
			record.Att_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT_TM"));
			record.Lo_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LO_ID"));
			record.Lo_idtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LO_IDTXT"));
			record.Rel_appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REL_APPT_HEAD_ID"));
			record.Appt_stattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_STATTXT"));
			record.Att_stattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT_STATTXT"));
			record.Appt_cmts = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_CMTS"));
			record.Activ_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIV_ID"));
			record.Spec_cd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPEC_CD"));
			record.Grp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GRP_ID"));
			record.Sess_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_DT"));
			record.Prtytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRTYTXT"));
			record.Action_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_ID"));
			record.Action_idtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_IDTXT"));
			record.Activitytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITYTXT"));
			record.Trans_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRANS_TYP"));
			record.First_appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_ID"));
			record.Last_appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LAST_APPT_ID"));
			record.Trans_typtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRANS_TYPTXT"));
			record.Clinicflag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLINICFLAG"));
			record.Prfile_sess_idtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_IDTXT"));
			record.Arr_tme = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ARR_TME"));
			record.Act_comp_flg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_COMP_FLG"));
			record.Mc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_NM"));
			record.Confirm_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONFIRM_STAT"));
			record.Confirm_stattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONFIRM_STATTXT"));
			record.Act_consult = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULT"));
			record.Act_consulttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULTTXT"));
			record.Rel_appt_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REL_APPT_TM"));
			record.Rel_appt_stattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REL_APPT_STATTXT"));
			record.Rel_appt_sesstxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REL_APPT_SESSTXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Sd_apptdts_hospCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_apptdts_hospRecord newRecord = new Sd_apptdts_hospRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_apptdts_hospRecord record)
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
		public Sd_apptdts_hospRecord get(int index)
		{
			return (Sd_apptdts_hospRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_apptdts_hospRecord
	{
		public String Appt_id = "";
		public String Appt_head_id = "";
		public String Prfile_sess_id = "";
		public String Prfiled_sess_id = "";
		public String Contract_id = "";
		public String Att_stat = "";
		public String Att_stat_reas = "";
		public String Pkey = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Titl = "";
		public String Dob = "";
		public String Hospnum = "";
		public String Sex = "";
		public String Stm = "";
		public String Etm = "";
		public String Appt_dt = "";
		public String Appt_stat = "";
		public String Prty = "";
		public String Mc_id = "";
		public String Mcmodality_id = "";
		public String Modid = "";
		public String Modidtxt = "";
		public String Modenrgy = "";
		public String Modenrgyunit = "";
		public String Modenrgyunittxt = "";
		public String Treatpl_act_id = "";
		public String Attnd_asid = "";
		public String Pat_stat = "";
		public String Txcattype = "";
		public String Attnd_astxt = "";
		public String Txcattypetxt = "";
		public String Att_tm = "";
		public String Lo_id = "";
		public String Lo_idtxt = "";
		public String Rel_appt_head_id = "";
		public String Appt_stattxt = "";
		public String Att_stattxt = "";
		public String Appt_cmts = "";
		public String Activ_id = "";
		public String Spec_cd = "";
		public String Grp_id = "";
		public String Sess_dt = "";
		public String Prtytxt = "";
		public String Action_id = "";
		public String Action_idtxt = "";
		public String Activitytxt = "";
		public String Trans_typ = "";
		public String First_appt_id = "";
		public String Last_appt_id = "";
		public String Trans_typtxt = "";
		public String Clinicflag = "";
		public String Prfile_sess_idtxt = "";
		public String Arr_tme = "";
		public String Act_comp_flg = "";
		public String Mc_nm = "";
		public String Confirm_stat = "";
		public String Confirm_stattxt = "";
		public String Act_consult = "";
		public String Act_consulttxt = "";
		public String Rel_appt_tm = "";
		public String Rel_appt_stattxt = "";
		public String Rel_appt_sesstxt = "";
				
		
		public void clear()
		{
			Appt_id = "";
			Appt_head_id = "";
			Prfile_sess_id = "";
			Prfiled_sess_id = "";
			Contract_id = "";
			Att_stat = "";
			Att_stat_reas = "";
			Pkey = "";
			Snm = "";
			Fnm1 = "";
			Titl = "";
			Dob = "";
			Hospnum = "";
			Sex = "";
			Stm = "";
			Etm = "";
			Appt_dt = "";
			Appt_stat = "";
			Prty = "";
			Mc_id = "";
			Mcmodality_id = "";
			Modid = "";
			Modidtxt = "";
			Modenrgy = "";
			Modenrgyunit = "";
			Modenrgyunittxt = "";
			Treatpl_act_id = "";
			Attnd_asid = "";
			Pat_stat = "";
			Txcattype = "";
			Attnd_astxt = "";
			Txcattypetxt = "";
			Att_tm = "";
			Lo_id = "";
			Lo_idtxt = "";
			Rel_appt_head_id = "";
			Appt_stattxt = "";
			Att_stattxt = "";
			Appt_cmts = "";
			Activ_id = "";
			Spec_cd = "";
			Grp_id = "";
			Sess_dt = "";
			Prtytxt = "";
			Action_id = "";
			Action_idtxt = "";
			Activitytxt = "";
			Trans_typ = "";
			First_appt_id = "";
			Last_appt_id = "";
			Trans_typtxt = "";
			Clinicflag = "";
			Prfile_sess_idtxt = "";
			Arr_tme = "";
			Act_comp_flg = "";
			Mc_nm = "";
			Confirm_stat = "";
			Confirm_stattxt = "";
			Act_consult = "";
			Act_consulttxt = "";
			Rel_appt_tm = "";
			Rel_appt_stattxt = "";
			Rel_appt_sesstxt = "";
			
		}		
	}
		
		
	public final class Sd_apptdts_hospFilter
	{			
		public String Appt_id = "";
		public String Appt_head_id = "";
		public String Prfile_sess_id = "";
		public String Prfiled_sess_id = "";
		public String Contract_id = "";
		public String Att_stat = "";
		public String Att_stat_reas = "";
		public String Pkey = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Titl = "";
		public String Dob = "";
		public String Hospnum = "";
		public String Sex = "";
		public String Stm = "";
		public String Etm = "";
		public String Appt_dt = "";
		public String Appt_stat = "";
		public String Prty = "";
		public String Mc_id = "";
		public String Mcmodality_id = "";
		public String Modid = "";
		public String Modidtxt = "";
		public String Modenrgy = "";
		public String Modenrgyunit = "";
		public String Modenrgyunittxt = "";
		public String Treatpl_act_id = "";
		public String Attnd_asid = "";
		public String Pat_stat = "";
		public String Txcattype = "";
		public String Attnd_astxt = "";
		public String Txcattypetxt = "";
		public String Att_tm = "";
		public String Lo_id = "";
		public String Lo_idtxt = "";
		public String Rel_appt_head_id = "";
		public String Appt_stattxt = "";
		public String Att_stattxt = "";
		public String Appt_cmts = "";
		public String Activ_id = "";
		public String Spec_cd = "";
		public String Grp_id = "";
		public String Sess_dt = "";
		public String Prtytxt = "";
		public String Action_id = "";
		public String Action_idtxt = "";
		public String Activitytxt = "";
		public String Trans_typ = "";
		public String First_appt_id = "";
		public String Last_appt_id = "";
		public String Trans_typtxt = "";
		public String Clinicflag = "";
		public String Prfile_sess_idtxt = "";
		public String Arr_tme = "";
		public String Act_comp_flg = "";
		public String Mc_nm = "";
		public String Confirm_stat = "";
		public String Confirm_stattxt = "";
		public String Act_consult = "";
		public String Act_consulttxt = "";
		public String Rel_appt_tm = "";
		public String Rel_appt_stattxt = "";
		public String Rel_appt_sesstxt = "";
		
		public void clear()
		{				
			Appt_id = "";
			Appt_head_id = "";
			Prfile_sess_id = "";
			Prfiled_sess_id = "";
			Contract_id = "";
			Att_stat = "";
			Att_stat_reas = "";
			Pkey = "";
			Snm = "";
			Fnm1 = "";
			Titl = "";
			Dob = "";
			Hospnum = "";
			Sex = "";
			Stm = "";
			Etm = "";
			Appt_dt = "";
			Appt_stat = "";
			Prty = "";
			Mc_id = "";
			Mcmodality_id = "";
			Modid = "";
			Modidtxt = "";
			Modenrgy = "";
			Modenrgyunit = "";
			Modenrgyunittxt = "";
			Treatpl_act_id = "";
			Attnd_asid = "";
			Pat_stat = "";
			Txcattype = "";
			Attnd_astxt = "";
			Txcattypetxt = "";
			Att_tm = "";
			Lo_id = "";
			Lo_idtxt = "";
			Rel_appt_head_id = "";
			Appt_stattxt = "";
			Att_stattxt = "";
			Appt_cmts = "";
			Activ_id = "";
			Spec_cd = "";
			Grp_id = "";
			Sess_dt = "";
			Prtytxt = "";
			Action_id = "";
			Action_idtxt = "";
			Activitytxt = "";
			Trans_typ = "";
			First_appt_id = "";
			Last_appt_id = "";
			Trans_typtxt = "";
			Clinicflag = "";
			Prfile_sess_idtxt = "";
			Arr_tme = "";
			Act_comp_flg = "";
			Mc_nm = "";
			Confirm_stat = "";
			Confirm_stattxt = "";
			Act_consult = "";
			Act_consulttxt = "";
			Rel_appt_tm = "";
			Rel_appt_stattxt = "";
			Rel_appt_sesstxt = "";
		}	
		public Sd_apptdts_hospFilter cloneObject()
		{
			Sd_apptdts_hospFilter newFilter = new Sd_apptdts_hospFilter();
			
			newFilter.Appt_id = this.Appt_id;
			newFilter.Appt_head_id = this.Appt_head_id;
			newFilter.Prfile_sess_id = this.Prfile_sess_id;
			newFilter.Prfiled_sess_id = this.Prfiled_sess_id;
			newFilter.Contract_id = this.Contract_id;
			newFilter.Att_stat = this.Att_stat;
			newFilter.Att_stat_reas = this.Att_stat_reas;
			newFilter.Pkey = this.Pkey;
			newFilter.Snm = this.Snm;
			newFilter.Fnm1 = this.Fnm1;
			newFilter.Titl = this.Titl;
			newFilter.Dob = this.Dob;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Sex = this.Sex;
			newFilter.Stm = this.Stm;
			newFilter.Etm = this.Etm;
			newFilter.Appt_dt = this.Appt_dt;
			newFilter.Appt_stat = this.Appt_stat;
			newFilter.Prty = this.Prty;
			newFilter.Mc_id = this.Mc_id;
			newFilter.Mcmodality_id = this.Mcmodality_id;
			newFilter.Modid = this.Modid;
			newFilter.Modidtxt = this.Modidtxt;
			newFilter.Modenrgy = this.Modenrgy;
			newFilter.Modenrgyunit = this.Modenrgyunit;
			newFilter.Modenrgyunittxt = this.Modenrgyunittxt;
			newFilter.Treatpl_act_id = this.Treatpl_act_id;
			newFilter.Attnd_asid = this.Attnd_asid;
			newFilter.Pat_stat = this.Pat_stat;
			newFilter.Txcattype = this.Txcattype;
			newFilter.Attnd_astxt = this.Attnd_astxt;
			newFilter.Txcattypetxt = this.Txcattypetxt;
			newFilter.Att_tm = this.Att_tm;
			newFilter.Lo_id = this.Lo_id;
			newFilter.Lo_idtxt = this.Lo_idtxt;
			newFilter.Rel_appt_head_id = this.Rel_appt_head_id;
			newFilter.Appt_stattxt = this.Appt_stattxt;
			newFilter.Att_stattxt = this.Att_stattxt;
			newFilter.Appt_cmts = this.Appt_cmts;
			newFilter.Activ_id = this.Activ_id;
			newFilter.Spec_cd = this.Spec_cd;
			newFilter.Grp_id = this.Grp_id;
			newFilter.Sess_dt = this.Sess_dt;
			newFilter.Prtytxt = this.Prtytxt;
			newFilter.Action_id = this.Action_id;
			newFilter.Action_idtxt = this.Action_idtxt;
			newFilter.Activitytxt = this.Activitytxt;
			newFilter.Trans_typ = this.Trans_typ;
			newFilter.First_appt_id = this.First_appt_id;
			newFilter.Last_appt_id = this.Last_appt_id;
			newFilter.Trans_typtxt = this.Trans_typtxt;
			newFilter.Clinicflag = this.Clinicflag;
			newFilter.Prfile_sess_idtxt = this.Prfile_sess_idtxt;
			newFilter.Arr_tme = this.Arr_tme;
			newFilter.Act_comp_flg = this.Act_comp_flg;
			newFilter.Mc_nm = this.Mc_nm;
			newFilter.Confirm_stat = this.Confirm_stat;
			newFilter.Confirm_stattxt = this.Confirm_stattxt;
			newFilter.Act_consult = this.Act_consult;
			newFilter.Act_consulttxt = this.Act_consulttxt;
			newFilter.Rel_appt_tm = this.Rel_appt_tm;
			newFilter.Rel_appt_stattxt = this.Rel_appt_stattxt;
			newFilter.Rel_appt_sesstxt = this.Rel_appt_sesstxt;
			
			return newFilter;
		}
	}
	public final class Sd_apptdts_hospEditFilter
	{			
		public boolean IncludeAppt_id = true;
		public boolean IncludeAppt_head_id = true;
		public boolean IncludePrfile_sess_id = true;
		public boolean IncludePrfiled_sess_id = true;
		public boolean IncludeContract_id = true;
		public boolean IncludeAtt_stat = true;
		public boolean IncludeAtt_stat_reas = true;
		public boolean IncludePkey = true;
		public boolean IncludeSnm = true;
		public boolean IncludeFnm1 = true;
		public boolean IncludeTitl = true;
		public boolean IncludeDob = true;
		public boolean IncludeHospnum = true;
		public boolean IncludeSex = true;
		public boolean IncludeStm = true;
		public boolean IncludeEtm = true;
		public boolean IncludeAppt_dt = true;
		public boolean IncludeAppt_stat = true;
		public boolean IncludePrty = true;
		public boolean IncludeMc_id = true;
		public boolean IncludeMcmodality_id = true;
		public boolean IncludeModid = true;
		public boolean IncludeModidtxt = true;
		public boolean IncludeModenrgy = true;
		public boolean IncludeModenrgyunit = true;
		public boolean IncludeModenrgyunittxt = true;
		public boolean IncludeTreatpl_act_id = true;
		public boolean IncludeAttnd_asid = true;
		public boolean IncludePat_stat = true;
		public boolean IncludeTxcattype = true;
		public boolean IncludeAttnd_astxt = true;
		public boolean IncludeTxcattypetxt = true;
		public boolean IncludeAtt_tm = true;
		public boolean IncludeLo_id = true;
		public boolean IncludeLo_idtxt = true;
		public boolean IncludeRel_appt_head_id = true;
		public boolean IncludeAppt_stattxt = true;
		public boolean IncludeAtt_stattxt = true;
		public boolean IncludeAppt_cmts = true;
		public boolean IncludeActiv_id = true;
		public boolean IncludeSpec_cd = true;
		public boolean IncludeGrp_id = true;
		public boolean IncludeSess_dt = true;
		public boolean IncludePrtytxt = true;
		public boolean IncludeAction_id = true;
		public boolean IncludeAction_idtxt = true;
		public boolean IncludeActivitytxt = true;
		public boolean IncludeTrans_typ = true;
		public boolean IncludeFirst_appt_id = true;
		public boolean IncludeLast_appt_id = true;
		public boolean IncludeTrans_typtxt = true;
		public boolean IncludeClinicflag = true;
		public boolean IncludePrfile_sess_idtxt = true;
		public boolean IncludeArr_tme = true;
		public boolean IncludeAct_comp_flg = true;
		public boolean IncludeMc_nm = true;
		public boolean IncludeConfirm_stat = true;
		public boolean IncludeConfirm_stattxt = true;
		public boolean IncludeAct_consult = true;
		public boolean IncludeAct_consulttxt = true;
		public boolean IncludeRel_appt_tm = true;
		public boolean IncludeRel_appt_stattxt = true;
		public boolean IncludeRel_appt_sesstxt = true;
		
		public void includeAll()
		{				
			IncludeAppt_id = true;
			IncludeAppt_head_id = true;
			IncludePrfile_sess_id = true;
			IncludePrfiled_sess_id = true;
			IncludeContract_id = true;
			IncludeAtt_stat = true;
			IncludeAtt_stat_reas = true;
			IncludePkey = true;
			IncludeSnm = true;
			IncludeFnm1 = true;
			IncludeTitl = true;
			IncludeDob = true;
			IncludeHospnum = true;
			IncludeSex = true;
			IncludeStm = true;
			IncludeEtm = true;
			IncludeAppt_dt = true;
			IncludeAppt_stat = true;
			IncludePrty = true;
			IncludeMc_id = true;
			IncludeMcmodality_id = true;
			IncludeModid = true;
			IncludeModidtxt = true;
			IncludeModenrgy = true;
			IncludeModenrgyunit = true;
			IncludeModenrgyunittxt = true;
			IncludeTreatpl_act_id = true;
			IncludeAttnd_asid = true;
			IncludePat_stat = true;
			IncludeTxcattype = true;
			IncludeAttnd_astxt = true;
			IncludeTxcattypetxt = true;
			IncludeAtt_tm = true;
			IncludeLo_id = true;
			IncludeLo_idtxt = true;
			IncludeRel_appt_head_id = true;
			IncludeAppt_stattxt = true;
			IncludeAtt_stattxt = true;
			IncludeAppt_cmts = true;
			IncludeActiv_id = true;
			IncludeSpec_cd = true;
			IncludeGrp_id = true;
			IncludeSess_dt = true;
			IncludePrtytxt = true;
			IncludeAction_id = true;
			IncludeAction_idtxt = true;
			IncludeActivitytxt = true;
			IncludeTrans_typ = true;
			IncludeFirst_appt_id = true;
			IncludeLast_appt_id = true;
			IncludeTrans_typtxt = true;
			IncludeClinicflag = true;
			IncludePrfile_sess_idtxt = true;
			IncludeArr_tme = true;
			IncludeAct_comp_flg = true;
			IncludeMc_nm = true;
			IncludeConfirm_stat = true;
			IncludeConfirm_stattxt = true;
			IncludeAct_consult = true;
			IncludeAct_consulttxt = true;
			IncludeRel_appt_tm = true;
			IncludeRel_appt_stattxt = true;
			IncludeRel_appt_sesstxt = true;
		}	
		public void excludeAll()
		{				
			IncludeAppt_id = false;
			IncludeAppt_head_id = false;
			IncludePrfile_sess_id = false;
			IncludePrfiled_sess_id = false;
			IncludeContract_id = false;
			IncludeAtt_stat = false;
			IncludeAtt_stat_reas = false;
			IncludePkey = false;
			IncludeSnm = false;
			IncludeFnm1 = false;
			IncludeTitl = false;
			IncludeDob = false;
			IncludeHospnum = false;
			IncludeSex = false;
			IncludeStm = false;
			IncludeEtm = false;
			IncludeAppt_dt = false;
			IncludeAppt_stat = false;
			IncludePrty = false;
			IncludeMc_id = false;
			IncludeMcmodality_id = false;
			IncludeModid = false;
			IncludeModidtxt = false;
			IncludeModenrgy = false;
			IncludeModenrgyunit = false;
			IncludeModenrgyunittxt = false;
			IncludeTreatpl_act_id = false;
			IncludeAttnd_asid = false;
			IncludePat_stat = false;
			IncludeTxcattype = false;
			IncludeAttnd_astxt = false;
			IncludeTxcattypetxt = false;
			IncludeAtt_tm = false;
			IncludeLo_id = false;
			IncludeLo_idtxt = false;
			IncludeRel_appt_head_id = false;
			IncludeAppt_stattxt = false;
			IncludeAtt_stattxt = false;
			IncludeAppt_cmts = false;
			IncludeActiv_id = false;
			IncludeSpec_cd = false;
			IncludeGrp_id = false;
			IncludeSess_dt = false;
			IncludePrtytxt = false;
			IncludeAction_id = false;
			IncludeAction_idtxt = false;
			IncludeActivitytxt = false;
			IncludeTrans_typ = false;
			IncludeFirst_appt_id = false;
			IncludeLast_appt_id = false;
			IncludeTrans_typtxt = false;
			IncludeClinicflag = false;
			IncludePrfile_sess_idtxt = false;
			IncludeArr_tme = false;
			IncludeAct_comp_flg = false;
			IncludeMc_nm = false;
			IncludeConfirm_stat = false;
			IncludeConfirm_stattxt = false;
			IncludeAct_consult = false;
			IncludeAct_consulttxt = false;
			IncludeRel_appt_tm = false;
			IncludeRel_appt_stattxt = false;
			IncludeRel_appt_sesstxt = false;
		}
		public Sd_apptdts_hospEditFilter cloneObject()
		{
			Sd_apptdts_hospEditFilter newEditFilter = new Sd_apptdts_hospEditFilter();
			
			newEditFilter.IncludeAppt_id = this.IncludeAppt_id;
			newEditFilter.IncludeAppt_head_id = this.IncludeAppt_head_id;
			newEditFilter.IncludePrfile_sess_id = this.IncludePrfile_sess_id;
			newEditFilter.IncludePrfiled_sess_id = this.IncludePrfiled_sess_id;
			newEditFilter.IncludeContract_id = this.IncludeContract_id;
			newEditFilter.IncludeAtt_stat = this.IncludeAtt_stat;
			newEditFilter.IncludeAtt_stat_reas = this.IncludeAtt_stat_reas;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeSnm = this.IncludeSnm;
			newEditFilter.IncludeFnm1 = this.IncludeFnm1;
			newEditFilter.IncludeTitl = this.IncludeTitl;
			newEditFilter.IncludeDob = this.IncludeDob;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeSex = this.IncludeSex;
			newEditFilter.IncludeStm = this.IncludeStm;
			newEditFilter.IncludeEtm = this.IncludeEtm;
			newEditFilter.IncludeAppt_dt = this.IncludeAppt_dt;
			newEditFilter.IncludeAppt_stat = this.IncludeAppt_stat;
			newEditFilter.IncludePrty = this.IncludePrty;
			newEditFilter.IncludeMc_id = this.IncludeMc_id;
			newEditFilter.IncludeMcmodality_id = this.IncludeMcmodality_id;
			newEditFilter.IncludeModid = this.IncludeModid;
			newEditFilter.IncludeModidtxt = this.IncludeModidtxt;
			newEditFilter.IncludeModenrgy = this.IncludeModenrgy;
			newEditFilter.IncludeModenrgyunit = this.IncludeModenrgyunit;
			newEditFilter.IncludeModenrgyunittxt = this.IncludeModenrgyunittxt;
			newEditFilter.IncludeTreatpl_act_id = this.IncludeTreatpl_act_id;
			newEditFilter.IncludeAttnd_asid = this.IncludeAttnd_asid;
			newEditFilter.IncludePat_stat = this.IncludePat_stat;
			newEditFilter.IncludeTxcattype = this.IncludeTxcattype;
			newEditFilter.IncludeAttnd_astxt = this.IncludeAttnd_astxt;
			newEditFilter.IncludeTxcattypetxt = this.IncludeTxcattypetxt;
			newEditFilter.IncludeAtt_tm = this.IncludeAtt_tm;
			newEditFilter.IncludeLo_id = this.IncludeLo_id;
			newEditFilter.IncludeLo_idtxt = this.IncludeLo_idtxt;
			newEditFilter.IncludeRel_appt_head_id = this.IncludeRel_appt_head_id;
			newEditFilter.IncludeAppt_stattxt = this.IncludeAppt_stattxt;
			newEditFilter.IncludeAtt_stattxt = this.IncludeAtt_stattxt;
			newEditFilter.IncludeAppt_cmts = this.IncludeAppt_cmts;
			newEditFilter.IncludeActiv_id = this.IncludeActiv_id;
			newEditFilter.IncludeSpec_cd = this.IncludeSpec_cd;
			newEditFilter.IncludeGrp_id = this.IncludeGrp_id;
			newEditFilter.IncludeSess_dt = this.IncludeSess_dt;
			newEditFilter.IncludePrtytxt = this.IncludePrtytxt;
			newEditFilter.IncludeAction_id = this.IncludeAction_id;
			newEditFilter.IncludeAction_idtxt = this.IncludeAction_idtxt;
			newEditFilter.IncludeActivitytxt = this.IncludeActivitytxt;
			newEditFilter.IncludeTrans_typ = this.IncludeTrans_typ;
			newEditFilter.IncludeFirst_appt_id = this.IncludeFirst_appt_id;
			newEditFilter.IncludeLast_appt_id = this.IncludeLast_appt_id;
			newEditFilter.IncludeTrans_typtxt = this.IncludeTrans_typtxt;
			newEditFilter.IncludeClinicflag = this.IncludeClinicflag;
			newEditFilter.IncludePrfile_sess_idtxt = this.IncludePrfile_sess_idtxt;
			newEditFilter.IncludeArr_tme = this.IncludeArr_tme;
			newEditFilter.IncludeAct_comp_flg = this.IncludeAct_comp_flg;
			newEditFilter.IncludeMc_nm = this.IncludeMc_nm;
			newEditFilter.IncludeConfirm_stat = this.IncludeConfirm_stat;
			newEditFilter.IncludeConfirm_stattxt = this.IncludeConfirm_stattxt;
			newEditFilter.IncludeAct_consult = this.IncludeAct_consult;
			newEditFilter.IncludeAct_consulttxt = this.IncludeAct_consulttxt;
			newEditFilter.IncludeRel_appt_tm = this.IncludeRel_appt_tm;
			newEditFilter.IncludeRel_appt_stattxt = this.IncludeRel_appt_stattxt;
			newEditFilter.IncludeRel_appt_sesstxt = this.IncludeRel_appt_sesstxt;
			
			return newEditFilter;
		}
	}
}
