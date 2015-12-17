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

public final class Sd_mc implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_mc.class);
	
	private Sd_mcFilter lastGetFilter = null;
	private final String serviceName = "SD_MC";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_mcFilter Filter = new Sd_mcFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_mcEditFilter EditFilter = new Sd_mcEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_mcCollection DataCollection = new Sd_mcCollection();

	/**
	 * Creates a new Sd_mc Data Transfer Object.
	 */ 
	public Sd_mc(ims.dto.Connection connection)
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
	public Sd_mc cloneObject()
	{
		Sd_mc cloneObject = new Sd_mc(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Mc_id = DataCollection.get(x).Mc_id;
			cloneObject.DataCollection.get(index).Int_loc_id = DataCollection.get(x).Int_loc_id;
			cloneObject.DataCollection.get(index).Mc_nm = DataCollection.get(x).Mc_nm;
			cloneObject.DataCollection.get(index).Dt_comm = DataCollection.get(x).Dt_comm;
			cloneObject.DataCollection.get(index).Mc_typ = DataCollection.get(x).Mc_typ;
			cloneObject.DataCollection.get(index).Act_ind = DataCollection.get(x).Act_ind;
			cloneObject.DataCollection.get(index).Dt_decomm = DataCollection.get(x).Dt_decomm;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Loc_nm = DataCollection.get(x).Loc_nm;
							
			
			for(int iModal_id = 0; iModal_id < DataCollection.get(x).Modal_idCollection.count(); iModal_id++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Modal_idCollection.add();
					
				cloneObject.DataCollection.get(index).Modal_idCollection.get(rIndex).Modal_id = DataCollection.get(x).Modal_idCollection.get(iModal_id).Modal_id;
				cloneObject.DataCollection.get(index).Modal_idCollection.get(rIndex).Modal_type_id = DataCollection.get(x).Modal_idCollection.get(iModal_id).Modal_type_id;
				cloneObject.DataCollection.get(index).Modal_idCollection.get(rIndex).Energy = DataCollection.get(x).Modal_idCollection.get(iModal_id).Energy;
				cloneObject.DataCollection.get(index).Modal_idCollection.get(rIndex).Energy_unit = DataCollection.get(x).Modal_idCollection.get(iModal_id).Energy_unit;
				cloneObject.DataCollection.get(index).Modal_idCollection.get(rIndex).End_date = DataCollection.get(x).Modal_idCollection.get(iModal_id).End_date;
				cloneObject.DataCollection.get(index).Modal_idCollection.get(rIndex).Act_ind_modal = DataCollection.get(x).Modal_idCollection.get(iModal_id).Act_ind_modal;
										
			}
			
			for(int iExcl_time_id = 0; iExcl_time_id < DataCollection.get(x).Excl_time_idCollection.count(); iExcl_time_id++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Excl_time_idCollection.add();
					
				cloneObject.DataCollection.get(index).Excl_time_idCollection.get(rIndex).Excl_time_id = DataCollection.get(x).Excl_time_idCollection.get(iExcl_time_id).Excl_time_id;
				cloneObject.DataCollection.get(index).Excl_time_idCollection.get(rIndex).Starttime = DataCollection.get(x).Excl_time_idCollection.get(iExcl_time_id).Starttime;
				cloneObject.DataCollection.get(index).Excl_time_idCollection.get(rIndex).Endtime = DataCollection.get(x).Excl_time_idCollection.get(iExcl_time_id).Endtime;
				cloneObject.DataCollection.get(index).Excl_time_idCollection.get(rIndex).Act_ind_time = DataCollection.get(x).Excl_time_idCollection.get(iExcl_time_id).Act_ind_time;
										
			}
			
			for(int iExcl_date_id = 0; iExcl_date_id < DataCollection.get(x).Excl_date_idCollection.count(); iExcl_date_id++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Excl_date_idCollection.add();
					
				cloneObject.DataCollection.get(index).Excl_date_idCollection.get(rIndex).Excl_date_id = DataCollection.get(x).Excl_date_idCollection.get(iExcl_date_id).Excl_date_id;
				cloneObject.DataCollection.get(index).Excl_date_idCollection.get(rIndex).Startdatim = DataCollection.get(x).Excl_date_idCollection.get(iExcl_date_id).Startdatim;
				cloneObject.DataCollection.get(index).Excl_date_idCollection.get(rIndex).Enddatim = DataCollection.get(x).Excl_date_idCollection.get(iExcl_date_id).Enddatim;
				cloneObject.DataCollection.get(index).Excl_date_idCollection.get(rIndex).Act_ind_date = DataCollection.get(x).Excl_date_idCollection.get(iExcl_date_id).Act_ind_date;
										
			}
			
			for(int iAction_id = 0; iAction_id < DataCollection.get(x).Action_idCollection.count(); iAction_id++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Action_idCollection.add();
					
				cloneObject.DataCollection.get(index).Action_idCollection.get(rIndex).Action_id = DataCollection.get(x).Action_idCollection.get(iAction_id).Action_id;
				cloneObject.DataCollection.get(index).Action_idCollection.get(rIndex).Act_ind_action = DataCollection.get(x).Action_idCollection.get(iAction_id).Act_ind_action;
										
			}
			
			for(int iAct_res_id = 0; iAct_res_id < DataCollection.get(x).Act_res_idCollection.count(); iAct_res_id++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Act_res_idCollection.add();
					
				cloneObject.DataCollection.get(index).Act_res_idCollection.get(rIndex).Act_res_id = DataCollection.get(x).Act_res_idCollection.get(iAct_res_id).Act_res_id;
				cloneObject.DataCollection.get(index).Act_res_idCollection.get(rIndex).Actgrp_id = DataCollection.get(x).Act_res_idCollection.get(iAct_res_id).Actgrp_id;
				cloneObject.DataCollection.get(index).Act_res_idCollection.get(rIndex).Act_id = DataCollection.get(x).Act_res_idCollection.get(iAct_res_id).Act_id;
				cloneObject.DataCollection.get(index).Act_res_idCollection.get(rIndex).Act_ind_actres = DataCollection.get(x).Act_res_idCollection.get(iAct_res_id).Act_ind_actres;
										
			}
			
			for(int iSitech_id = 0; iSitech_id < DataCollection.get(x).Sitech_idCollection.count(); iSitech_id++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Sitech_idCollection.add();
					
				cloneObject.DataCollection.get(index).Sitech_idCollection.get(rIndex).Sitech_id = DataCollection.get(x).Sitech_idCollection.get(iSitech_id).Sitech_id;
				cloneObject.DataCollection.get(index).Sitech_idCollection.get(rIndex).Site_desc = DataCollection.get(x).Sitech_idCollection.get(iSitech_id).Site_desc;
				cloneObject.DataCollection.get(index).Sitech_idCollection.get(rIndex).Group_id = DataCollection.get(x).Sitech_idCollection.get(iSitech_id).Group_id;
				cloneObject.DataCollection.get(index).Sitech_idCollection.get(rIndex).Site_id = DataCollection.get(x).Sitech_idCollection.get(iSitech_id).Site_id;
				cloneObject.DataCollection.get(index).Sitech_idCollection.get(rIndex).Tech_id = DataCollection.get(x).Sitech_idCollection.get(iSitech_id).Tech_id;
				cloneObject.DataCollection.get(index).Sitech_idCollection.get(rIndex).Startdate = DataCollection.get(x).Sitech_idCollection.get(iSitech_id).Startdate;
				cloneObject.DataCollection.get(index).Sitech_idCollection.get(rIndex).Enddate = DataCollection.get(x).Sitech_idCollection.get(iSitech_id).Enddate;
				cloneObject.DataCollection.get(index).Sitech_idCollection.get(rIndex).Act_ind_st = DataCollection.get(x).Sitech_idCollection.get(iSitech_id).Act_ind_st;
										
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
		return "Sd_mc.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mc.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_mc.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mc.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mc.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mc.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_mc.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_mc.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mc.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_mc.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_mc.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_mc.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_mc.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_mc.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mc.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_mc.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_mc.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_mc.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_mc.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_mc.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mc.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_mc.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_mc.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mc.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_mc.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_mc.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_mc.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_mc nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_mc After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_mc After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mc.List");
							
		listInProgress = true;	
		logger.debug("Sd_mc Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_mc After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_mc After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_mcFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Mc_id != null && filter.Mc_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_id);
		}
		
		if(Filter.Int_loc_id != null && filter.Int_loc_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INT_LOC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_loc_id);
		}
		
		if(Filter.Mc_nm != null && filter.Mc_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_nm);
		}
		
		if(Filter.Dt_comm != null && filter.Dt_comm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DT_COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dt_comm);
		}
		
		if(Filter.Mc_typ != null && filter.Mc_typ.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_typ);
		}
		
		if(Filter.Act_ind != null && filter.Act_ind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_ind);
		}
		
		if(Filter.Dt_decomm != null && filter.Dt_decomm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DT_DECOMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dt_decomm);
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
		}
		
		if(Filter.Loc_nm != null && filter.Loc_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LOC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Loc_nm);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_mcRecord data = (Sd_mcRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeMc_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_id));
		}
		
		if(EditFilter.IncludeInt_loc_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INT_LOC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_loc_id));
		}
		
		if(EditFilter.IncludeMc_nm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_nm));
		}
		
		if(EditFilter.IncludeDt_comm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DT_COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dt_comm));
		}
		
		if(EditFilter.IncludeMc_typ)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_typ));
		}
		
		if(EditFilter.IncludeAct_ind)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_ind));
		}
		
		if(EditFilter.IncludeDt_decomm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DT_DECOMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dt_decomm));
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
		}
		
		if(EditFilter.IncludeLoc_nm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LOC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Loc_nm));
		}
		
		
		for(int x = 0; x < data.Modal_idCollection.count(); x++)
		{
			Sd_mcModal_idRecord rgRecord = (Sd_mcModal_idRecord)data.Modal_idCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODAL_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Modal_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODAL_TYPE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Modal_type_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ENERGY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Energy));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ENERGY_UNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Energy_unit));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("END_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.End_date));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_MODAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_modal));
			
		}
		for(int x = 0; x < data.Excl_time_idCollection.count(); x++)
		{
			Sd_mcExcl_time_idRecord rgRecord = (Sd_mcExcl_time_idRecord)data.Excl_time_idCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EXCL_TIME_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Excl_time_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STARTTIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Starttime));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ENDTIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Endtime));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_time));
			
		}
		for(int x = 0; x < data.Excl_date_idCollection.count(); x++)
		{
			Sd_mcExcl_date_idRecord rgRecord = (Sd_mcExcl_date_idRecord)data.Excl_date_idCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EXCL_DATE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Excl_date_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STARTDATIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Startdatim));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ENDDATIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Enddatim));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_date));
			
		}
		for(int x = 0; x < data.Action_idCollection.count(); x++)
		{
			Sd_mcAction_idRecord rgRecord = (Sd_mcAction_idRecord)data.Action_idCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Action_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_ACTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_action));
			
		}
		for(int x = 0; x < data.Act_res_idCollection.count(); x++)
		{
			Sd_mcAct_res_idRecord rgRecord = (Sd_mcAct_res_idRecord)data.Act_res_idCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_RES_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_res_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTGRP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Actgrp_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_ACTRES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_actres));
			
		}
		for(int x = 0; x < data.Sitech_idCollection.count(); x++)
		{
			Sd_mcSitech_idRecord rgRecord = (Sd_mcSitech_idRecord)data.Sitech_idCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SITECH_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Sitech_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SITE_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Site_desc));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GROUP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Group_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SITE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Site_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TECH_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Tech_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STARTDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Startdate));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ENDDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Enddate));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_ST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_st));
			
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
			Sd_mcRecord record = new Sd_mcRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Mc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID"));
			record.Int_loc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_LOC_ID"));
			record.Mc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_NM"));
			record.Dt_comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DT_COMM"));
			record.Mc_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_TYP"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
			record.Dt_decomm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DT_DECOMM"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Loc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LOC_NM"));
									
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
			Sd_mcRecord record = new Sd_mcRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Mc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID"));
			record.Int_loc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_LOC_ID"));
			record.Mc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_NM"));
			record.Dt_comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DT_COMM"));
			record.Mc_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_TYP"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
			record.Dt_decomm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DT_DECOMM"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Loc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LOC_NM"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("modal_id"))
					record.Modal_idCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("excl_time_id"))
					record.Excl_time_idCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("excl_date_id"))
					record.Excl_date_idCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("action_id"))
					record.Action_idCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_res_id"))
					record.Act_res_idCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("sitech_id"))
					record.Sitech_idCollection.add();
			
									
			rgCount = record.Modal_idCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("modal_id"))
					{
						Sd_mcModal_idRecord rgRecord = record.Modal_idCollection.get(recCount);
						rgRecord.Modal_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("modal_type_id"))
					{
						Sd_mcModal_idRecord rgRecord = record.Modal_idCollection.get(recCount);
						rgRecord.Modal_type_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("energy"))
					{
						Sd_mcModal_idRecord rgRecord = record.Modal_idCollection.get(recCount);
						rgRecord.Energy = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("energy_unit"))
					{
						Sd_mcModal_idRecord rgRecord = record.Modal_idCollection.get(recCount);
						rgRecord.Energy_unit = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("end_date"))
					{
						Sd_mcModal_idRecord rgRecord = record.Modal_idCollection.get(recCount);
						rgRecord.End_date = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind_modal"))
					{
						Sd_mcModal_idRecord rgRecord = record.Modal_idCollection.get(recCount);
						rgRecord.Act_ind_modal = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Excl_time_idCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("excl_time_id"))
					{
						Sd_mcExcl_time_idRecord rgRecord = record.Excl_time_idCollection.get(recCount);
						rgRecord.Excl_time_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("starttime"))
					{
						Sd_mcExcl_time_idRecord rgRecord = record.Excl_time_idCollection.get(recCount);
						rgRecord.Starttime = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("endtime"))
					{
						Sd_mcExcl_time_idRecord rgRecord = record.Excl_time_idCollection.get(recCount);
						rgRecord.Endtime = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind_time"))
					{
						Sd_mcExcl_time_idRecord rgRecord = record.Excl_time_idCollection.get(recCount);
						rgRecord.Act_ind_time = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Excl_date_idCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("excl_date_id"))
					{
						Sd_mcExcl_date_idRecord rgRecord = record.Excl_date_idCollection.get(recCount);
						rgRecord.Excl_date_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("startdatim"))
					{
						Sd_mcExcl_date_idRecord rgRecord = record.Excl_date_idCollection.get(recCount);
						rgRecord.Startdatim = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("enddatim"))
					{
						Sd_mcExcl_date_idRecord rgRecord = record.Excl_date_idCollection.get(recCount);
						rgRecord.Enddatim = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind_date"))
					{
						Sd_mcExcl_date_idRecord rgRecord = record.Excl_date_idCollection.get(recCount);
						rgRecord.Act_ind_date = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Action_idCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("action_id"))
					{
						Sd_mcAction_idRecord rgRecord = record.Action_idCollection.get(recCount);
						rgRecord.Action_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind_action"))
					{
						Sd_mcAction_idRecord rgRecord = record.Action_idCollection.get(recCount);
						rgRecord.Act_ind_action = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Act_res_idCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_res_id"))
					{
						Sd_mcAct_res_idRecord rgRecord = record.Act_res_idCollection.get(recCount);
						rgRecord.Act_res_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("actgrp_id"))
					{
						Sd_mcAct_res_idRecord rgRecord = record.Act_res_idCollection.get(recCount);
						rgRecord.Actgrp_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_id"))
					{
						Sd_mcAct_res_idRecord rgRecord = record.Act_res_idCollection.get(recCount);
						rgRecord.Act_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind_actres"))
					{
						Sd_mcAct_res_idRecord rgRecord = record.Act_res_idCollection.get(recCount);
						rgRecord.Act_ind_actres = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Sitech_idCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("sitech_id"))
					{
						Sd_mcSitech_idRecord rgRecord = record.Sitech_idCollection.get(recCount);
						rgRecord.Sitech_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("site_desc"))
					{
						Sd_mcSitech_idRecord rgRecord = record.Sitech_idCollection.get(recCount);
						rgRecord.Site_desc = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("group_id"))
					{
						Sd_mcSitech_idRecord rgRecord = record.Sitech_idCollection.get(recCount);
						rgRecord.Group_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("site_id"))
					{
						Sd_mcSitech_idRecord rgRecord = record.Sitech_idCollection.get(recCount);
						rgRecord.Site_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("tech_id"))
					{
						Sd_mcSitech_idRecord rgRecord = record.Sitech_idCollection.get(recCount);
						rgRecord.Tech_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("startdate"))
					{
						Sd_mcSitech_idRecord rgRecord = record.Sitech_idCollection.get(recCount);
						rgRecord.Startdate = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("enddate"))
					{
						Sd_mcSitech_idRecord rgRecord = record.Sitech_idCollection.get(recCount);
						rgRecord.Enddate = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind_st"))
					{
						Sd_mcSitech_idRecord rgRecord = record.Sitech_idCollection.get(recCount);
						rgRecord.Act_ind_st = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Sd_mcCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_mcRecord newRecord = new Sd_mcRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_mcRecord record)
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
		public Sd_mcRecord get(int index)
		{
			return (Sd_mcRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_mcRecord
	{
		public String Mc_id = "";
		public String Int_loc_id = "";
		public String Mc_nm = "";
		public String Dt_comm = "";
		public String Mc_typ = "";
		public String Act_ind = "";
		public String Dt_decomm = "";
		public String Tstp = "";
		public String Loc_nm = "";
		
		public Sd_mcModal_idCollection Modal_idCollection = new Sd_mcModal_idCollection();
		public Sd_mcExcl_time_idCollection Excl_time_idCollection = new Sd_mcExcl_time_idCollection();
		public Sd_mcExcl_date_idCollection Excl_date_idCollection = new Sd_mcExcl_date_idCollection();
		public Sd_mcAction_idCollection Action_idCollection = new Sd_mcAction_idCollection();
		public Sd_mcAct_res_idCollection Act_res_idCollection = new Sd_mcAct_res_idCollection();
		public Sd_mcSitech_idCollection Sitech_idCollection = new Sd_mcSitech_idCollection();		
		
		public void clear()
		{
			Mc_id = "";
			Int_loc_id = "";
			Mc_nm = "";
			Dt_comm = "";
			Mc_typ = "";
			Act_ind = "";
			Dt_decomm = "";
			Tstp = "";
			Loc_nm = "";
			
			Modal_idCollection.clear();
			Excl_time_idCollection.clear();
			Excl_date_idCollection.clear();
			Action_idCollection.clear();
			Act_res_idCollection.clear();
			Sitech_idCollection.clear();
		}		
	}
	
	public final class Sd_mcModal_idCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_mcModal_idRecord newRecord = new Sd_mcModal_idRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_mcModal_idRecord record)
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
		public Sd_mcModal_idRecord get(int index)
		{
			return (Sd_mcModal_idRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_mcExcl_time_idCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_mcExcl_time_idRecord newRecord = new Sd_mcExcl_time_idRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_mcExcl_time_idRecord record)
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
		public Sd_mcExcl_time_idRecord get(int index)
		{
			return (Sd_mcExcl_time_idRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_mcExcl_date_idCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_mcExcl_date_idRecord newRecord = new Sd_mcExcl_date_idRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_mcExcl_date_idRecord record)
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
		public Sd_mcExcl_date_idRecord get(int index)
		{
			return (Sd_mcExcl_date_idRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_mcAction_idCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_mcAction_idRecord newRecord = new Sd_mcAction_idRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_mcAction_idRecord record)
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
		public Sd_mcAction_idRecord get(int index)
		{
			return (Sd_mcAction_idRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_mcAct_res_idCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_mcAct_res_idRecord newRecord = new Sd_mcAct_res_idRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_mcAct_res_idRecord record)
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
		public Sd_mcAct_res_idRecord get(int index)
		{
			return (Sd_mcAct_res_idRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_mcSitech_idCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_mcSitech_idRecord newRecord = new Sd_mcSitech_idRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_mcSitech_idRecord record)
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
		public Sd_mcSitech_idRecord get(int index)
		{
			return (Sd_mcSitech_idRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Sd_mcModal_idRecord
	{
		public String Modal_id = "";
		public String Modal_type_id = "";
		public String Energy = "";
		public String Energy_unit = "";
		public String End_date = "";
		public String Act_ind_modal = "";
		
		public void clear()
		{
			Modal_id = "";
			Modal_type_id = "";
			Energy = "";
			Energy_unit = "";
			End_date = "";
			Act_ind_modal = "";
			
		}
	}
	public final class Sd_mcExcl_time_idRecord
	{
		public String Excl_time_id = "";
		public String Starttime = "";
		public String Endtime = "";
		public String Act_ind_time = "";
		
		public void clear()
		{
			Excl_time_id = "";
			Starttime = "";
			Endtime = "";
			Act_ind_time = "";
			
		}
	}
	public final class Sd_mcExcl_date_idRecord
	{
		public String Excl_date_id = "";
		public String Startdatim = "";
		public String Enddatim = "";
		public String Act_ind_date = "";
		
		public void clear()
		{
			Excl_date_id = "";
			Startdatim = "";
			Enddatim = "";
			Act_ind_date = "";
			
		}
	}
	public final class Sd_mcAction_idRecord
	{
		public String Action_id = "";
		public String Act_ind_action = "";
		
		public void clear()
		{
			Action_id = "";
			Act_ind_action = "";
			
		}
	}
	public final class Sd_mcAct_res_idRecord
	{
		public String Act_res_id = "";
		public String Actgrp_id = "";
		public String Act_id = "";
		public String Act_ind_actres = "";
		
		public void clear()
		{
			Act_res_id = "";
			Actgrp_id = "";
			Act_id = "";
			Act_ind_actres = "";
			
		}
	}
	public final class Sd_mcSitech_idRecord
	{
		public String Sitech_id = "";
		public String Site_desc = "";
		public String Group_id = "";
		public String Site_id = "";
		public String Tech_id = "";
		public String Startdate = "";
		public String Enddate = "";
		public String Act_ind_st = "";
		
		public void clear()
		{
			Sitech_id = "";
			Site_desc = "";
			Group_id = "";
			Site_id = "";
			Tech_id = "";
			Startdate = "";
			Enddate = "";
			Act_ind_st = "";
			
		}
	}	
	public final class Sd_mcFilter
	{			
		public String Mc_id = "";
		public String Int_loc_id = "";
		public String Mc_nm = "";
		public String Dt_comm = "";
		public String Mc_typ = "";
		public String Act_ind = "";
		public String Dt_decomm = "";
		public String Tstp = "";
		public String Loc_nm = "";
		
		public void clear()
		{				
			Mc_id = "";
			Int_loc_id = "";
			Mc_nm = "";
			Dt_comm = "";
			Mc_typ = "";
			Act_ind = "";
			Dt_decomm = "";
			Tstp = "";
			Loc_nm = "";
		}	
		public Sd_mcFilter cloneObject()
		{
			Sd_mcFilter newFilter = new Sd_mcFilter();
			
			newFilter.Mc_id = this.Mc_id;
			newFilter.Int_loc_id = this.Int_loc_id;
			newFilter.Mc_nm = this.Mc_nm;
			newFilter.Dt_comm = this.Dt_comm;
			newFilter.Mc_typ = this.Mc_typ;
			newFilter.Act_ind = this.Act_ind;
			newFilter.Dt_decomm = this.Dt_decomm;
			newFilter.Tstp = this.Tstp;
			newFilter.Loc_nm = this.Loc_nm;
			
			return newFilter;
		}
	}
	public final class Sd_mcEditFilter
	{			
		public boolean IncludeMc_id = true;
		public boolean IncludeInt_loc_id = true;
		public boolean IncludeMc_nm = true;
		public boolean IncludeDt_comm = true;
		public boolean IncludeMc_typ = true;
		public boolean IncludeAct_ind = true;
		public boolean IncludeDt_decomm = true;
		public boolean IncludeTstp = true;
		public boolean IncludeLoc_nm = true;
		
		public void includeAll()
		{				
			IncludeMc_id = true;
			IncludeInt_loc_id = true;
			IncludeMc_nm = true;
			IncludeDt_comm = true;
			IncludeMc_typ = true;
			IncludeAct_ind = true;
			IncludeDt_decomm = true;
			IncludeTstp = true;
			IncludeLoc_nm = true;
		}	
		public void excludeAll()
		{				
			IncludeMc_id = false;
			IncludeInt_loc_id = false;
			IncludeMc_nm = false;
			IncludeDt_comm = false;
			IncludeMc_typ = false;
			IncludeAct_ind = false;
			IncludeDt_decomm = false;
			IncludeTstp = false;
			IncludeLoc_nm = false;
		}
		public Sd_mcEditFilter cloneObject()
		{
			Sd_mcEditFilter newEditFilter = new Sd_mcEditFilter();
			
			newEditFilter.IncludeMc_id = this.IncludeMc_id;
			newEditFilter.IncludeInt_loc_id = this.IncludeInt_loc_id;
			newEditFilter.IncludeMc_nm = this.IncludeMc_nm;
			newEditFilter.IncludeDt_comm = this.IncludeDt_comm;
			newEditFilter.IncludeMc_typ = this.IncludeMc_typ;
			newEditFilter.IncludeAct_ind = this.IncludeAct_ind;
			newEditFilter.IncludeDt_decomm = this.IncludeDt_decomm;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeLoc_nm = this.IncludeLoc_nm;
			
			return newEditFilter;
		}
	}
}
