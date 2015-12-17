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

public final class Generic_schedule implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Generic_schedule.class);
	
	private Generic_scheduleFilter lastGetFilter = null;
	private final String serviceName = "GENERIC_SCHEDULE";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Generic_scheduleFilter Filter = new Generic_scheduleFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Generic_scheduleEditFilter EditFilter = new Generic_scheduleEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Generic_scheduleCollection DataCollection = new Generic_scheduleCollection();

	/**
	 * Creates a new Generic_schedule Data Transfer Object.
	 */ 
	public Generic_schedule(ims.dto.Connection connection)
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
	public Generic_schedule cloneObject()
	{
		Generic_schedule cloneObject = new Generic_schedule(Connection);
			
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
			cloneObject.DataCollection.get(index).F_appt_id = DataCollection.get(x).F_appt_id;
			cloneObject.DataCollection.get(index).F_appl = DataCollection.get(x).F_appl;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Ev_reas = DataCollection.get(x).Ev_reas;
			cloneObject.DataCollection.get(index).App_reas = DataCollection.get(x).App_reas;
			cloneObject.DataCollection.get(index).St_time = DataCollection.get(x).St_time;
			cloneObject.DataCollection.get(index).App_st_time = DataCollection.get(x).App_st_time;
			cloneObject.DataCollection.get(index).App_end_time = DataCollection.get(x).App_end_time;
			cloneObject.DataCollection.get(index).F_per = DataCollection.get(x).F_per;
			cloneObject.DataCollection.get(index).F_phone = DataCollection.get(x).F_phone;
			cloneObject.DataCollection.get(index).E_per = DataCollection.get(x).E_per;
			cloneObject.DataCollection.get(index).E_phone = DataCollection.get(x).E_phone;
			cloneObject.DataCollection.get(index).F_status = DataCollection.get(x).F_status;
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Clin_nm = DataCollection.get(x).Clin_nm;
							
			
			for(int iRes_seqno = 0; iRes_seqno < DataCollection.get(x).Res_seqnoCollection.count(); iRes_seqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Res_seqnoCollection.add();
					
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Res_seqno = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Res_seqno;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Res_id = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Res_id;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Res_nm = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Res_nm;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Res_type = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Res_type;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Res_ty_rol = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Res_ty_rol;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Res_gp = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Res_gp;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Resst_time = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Resst_time;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Resend_time = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Resend_time;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Res_qty = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Res_qty;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Res_qt_ut = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Res_qt_ut;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Rescdat = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Rescdat;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Resctim = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Resctim;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Resrdat = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Resrdat;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Resrtim = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Resrtim;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Resudat = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Resudat;
				cloneObject.DataCollection.get(index).Res_seqnoCollection.get(rIndex).Resutim = DataCollection.get(x).Res_seqnoCollection.get(iRes_seqno).Resutim;
										
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
		return "Generic_schedule.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Generic_schedule.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Generic_schedule.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Generic_schedule.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Generic_schedule.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Generic_schedule.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Generic_schedule.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Generic_schedule.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Generic_schedule.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Generic_schedule.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Generic_schedule.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Generic_schedule.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Generic_schedule.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Generic_schedule.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Generic_schedule.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Generic_schedule.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Generic_schedule.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Generic_schedule.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Generic_schedule.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Generic_schedule.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Generic_schedule.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Generic_schedule.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Generic_schedule.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Generic_schedule.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Generic_schedule.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Generic_schedule.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Generic_schedule.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Generic_schedule nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Generic_schedule After NextList ");
				
		decodeNASMessage();		
		logger.debug("Generic_schedule After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Generic_schedule.List");
							
		listInProgress = true;	
		logger.debug("Generic_schedule Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Generic_schedule After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Generic_schedule After Parse Message");
		
						
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
	private String encodeNASFilter(Generic_scheduleFilter filter)
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
		
		if(Filter.F_appt_id != null && filter.F_appt_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("F_APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.F_appt_id);
		}
		
		if(Filter.F_appl != null && filter.F_appl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("F_APPL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.F_appl);
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey);
		}
		
		if(Filter.Ev_reas != null && filter.Ev_reas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EV_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ev_reas);
		}
		
		if(Filter.App_reas != null && filter.App_reas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APP_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.App_reas);
		}
		
		if(Filter.St_time != null && filter.St_time.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ST_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.St_time);
		}
		
		if(Filter.App_st_time != null && filter.App_st_time.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APP_ST_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.App_st_time);
		}
		
		if(Filter.App_end_time != null && filter.App_end_time.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APP_END_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.App_end_time);
		}
		
		if(Filter.F_per != null && filter.F_per.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("F_PER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.F_per);
		}
		
		if(Filter.F_phone != null && filter.F_phone.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("F_PHONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.F_phone);
		}
		
		if(Filter.E_per != null && filter.E_per.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("E_PER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.E_per);
		}
		
		if(Filter.E_phone != null && filter.E_phone.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("E_PHONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.E_phone);
		}
		
		if(Filter.F_status != null && filter.F_status.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("F_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.F_status);
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
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
		}
		
		if(Filter.Clin_nm != null && filter.Clin_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CLIN_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clin_nm);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Generic_scheduleRecord data = (Generic_scheduleRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeAppt_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_id));
		}
		
		if(EditFilter.IncludeF_appt_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("F_APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.F_appt_id));
		}
		
		if(EditFilter.IncludeF_appl)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("F_APPL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.F_appl));
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey));
		}
		
		if(EditFilter.IncludeEv_reas)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EV_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ev_reas));
		}
		
		if(EditFilter.IncludeApp_reas)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APP_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.App_reas));
		}
		
		if(EditFilter.IncludeSt_time)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ST_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.St_time));
		}
		
		if(EditFilter.IncludeApp_st_time)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APP_ST_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.App_st_time));
		}
		
		if(EditFilter.IncludeApp_end_time)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APP_END_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.App_end_time));
		}
		
		if(EditFilter.IncludeF_per)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("F_PER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.F_per));
		}
		
		if(EditFilter.IncludeF_phone)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("F_PHONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.F_phone));
		}
		
		if(EditFilter.IncludeE_per)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("E_PER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.E_per));
		}
		
		if(EditFilter.IncludeE_phone)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("E_PHONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.E_phone));
		}
		
		if(EditFilter.IncludeF_status)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("F_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.F_status));
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
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
		}
		
		if(EditFilter.IncludeClin_nm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CLIN_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clin_nm));
		}
		
		
		for(int x = 0; x < data.Res_seqnoCollection.count(); x++)
		{
			Generic_scheduleRes_seqnoRecord rgRecord = (Generic_scheduleRes_seqnoRecord)data.Res_seqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RES_SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_seqno));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RES_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RES_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_nm));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RES_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_type));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RES_TY_ROL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_ty_rol));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RES_GP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_gp));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESST_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Resst_time));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESEND_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Resend_time));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RES_QTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_qty));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RES_QT_UT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Res_qt_ut));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESCDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Rescdat));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESCTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Resctim));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESRDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Resrdat));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESRTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Resrtim));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESUDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Resudat));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESUTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Resutim));
			
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
			Generic_scheduleRecord record = new Generic_scheduleRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_ID"));
			record.F_appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "F_APPT_ID"));
			record.F_appl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "F_APPL"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Ev_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EV_REAS"));
			record.App_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APP_REAS"));
			record.St_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ST_TIME"));
			record.App_st_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APP_ST_TIME"));
			record.App_end_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APP_END_TIME"));
			record.F_per = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "F_PER"));
			record.F_phone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "F_PHONE"));
			record.E_per = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "E_PER"));
			record.E_phone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "E_PHONE"));
			record.F_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "F_STATUS"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Clin_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLIN_NM"));
									
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
			Generic_scheduleRecord record = new Generic_scheduleRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_ID"));
			record.F_appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "F_APPT_ID"));
			record.F_appl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "F_APPL"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Ev_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EV_REAS"));
			record.App_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APP_REAS"));
			record.St_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ST_TIME"));
			record.App_st_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APP_ST_TIME"));
			record.App_end_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APP_END_TIME"));
			record.F_per = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "F_PER"));
			record.F_phone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "F_PHONE"));
			record.E_per = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "E_PER"));
			record.E_phone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "E_PHONE"));
			record.F_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "F_STATUS"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Clin_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLIN_NM"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_seqno"))
					record.Res_seqnoCollection.add();
			
									
			rgCount = record.Res_seqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_seqno"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Res_seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_id"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Res_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_nm"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Res_nm = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_type"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Res_type = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_ty_rol"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Res_ty_rol = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_gp"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Res_gp = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("resst_time"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Resst_time = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("resend_time"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Resend_time = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_qty"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Res_qty = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("res_qt_ut"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Res_qt_ut = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("rescdat"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Rescdat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("resctim"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Resctim = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("resrdat"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Resrdat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("resrtim"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Resrtim = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("resudat"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Resudat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("resutim"))
					{
						Generic_scheduleRes_seqnoRecord rgRecord = record.Res_seqnoCollection.get(recCount);
						rgRecord.Resutim = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Generic_scheduleCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Generic_scheduleRecord newRecord = new Generic_scheduleRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Generic_scheduleRecord record)
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
		public Generic_scheduleRecord get(int index)
		{
			return (Generic_scheduleRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Generic_scheduleRecord
	{
		public String Appt_id = "";
		public String F_appt_id = "";
		public String F_appl = "";
		public String Pkey = "";
		public String Ev_reas = "";
		public String App_reas = "";
		public String St_time = "";
		public String App_st_time = "";
		public String App_end_time = "";
		public String F_per = "";
		public String F_phone = "";
		public String E_per = "";
		public String E_phone = "";
		public String F_status = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Udat = "";
		public String Utim = "";
		public String Tstp = "";
		public String Clin_nm = "";
		
		public Generic_scheduleRes_seqnoCollection Res_seqnoCollection = new Generic_scheduleRes_seqnoCollection();		
		
		public void clear()
		{
			Appt_id = "";
			F_appt_id = "";
			F_appl = "";
			Pkey = "";
			Ev_reas = "";
			App_reas = "";
			St_time = "";
			App_st_time = "";
			App_end_time = "";
			F_per = "";
			F_phone = "";
			E_per = "";
			E_phone = "";
			F_status = "";
			Cdat = "";
			Ctim = "";
			Rdat = "";
			Rtim = "";
			Udat = "";
			Utim = "";
			Tstp = "";
			Clin_nm = "";
			
			Res_seqnoCollection.clear();
		}		
	}
	
	public final class Generic_scheduleRes_seqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Generic_scheduleRes_seqnoRecord newRecord = new Generic_scheduleRes_seqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Generic_scheduleRes_seqnoRecord record)
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
		public Generic_scheduleRes_seqnoRecord get(int index)
		{
			return (Generic_scheduleRes_seqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Generic_scheduleRes_seqnoRecord
	{
		public String Res_seqno = "";
		public String Res_id = "";
		public String Res_nm = "";
		public String Res_type = "";
		public String Res_ty_rol = "";
		public String Res_gp = "";
		public String Resst_time = "";
		public String Resend_time = "";
		public String Res_qty = "";
		public String Res_qt_ut = "";
		public String Rescdat = "";
		public String Resctim = "";
		public String Resrdat = "";
		public String Resrtim = "";
		public String Resudat = "";
		public String Resutim = "";
		
		public void clear()
		{
			Res_seqno = "";
			Res_id = "";
			Res_nm = "";
			Res_type = "";
			Res_ty_rol = "";
			Res_gp = "";
			Resst_time = "";
			Resend_time = "";
			Res_qty = "";
			Res_qt_ut = "";
			Rescdat = "";
			Resctim = "";
			Resrdat = "";
			Resrtim = "";
			Resudat = "";
			Resutim = "";
			
		}
	}	
	public final class Generic_scheduleFilter
	{			
		public String Appt_id = "";
		public String F_appt_id = "";
		public String F_appl = "";
		public String Pkey = "";
		public String Ev_reas = "";
		public String App_reas = "";
		public String St_time = "";
		public String App_st_time = "";
		public String App_end_time = "";
		public String F_per = "";
		public String F_phone = "";
		public String E_per = "";
		public String E_phone = "";
		public String F_status = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Udat = "";
		public String Utim = "";
		public String Tstp = "";
		public String Clin_nm = "";
		
		public void clear()
		{				
			Appt_id = "";
			F_appt_id = "";
			F_appl = "";
			Pkey = "";
			Ev_reas = "";
			App_reas = "";
			St_time = "";
			App_st_time = "";
			App_end_time = "";
			F_per = "";
			F_phone = "";
			E_per = "";
			E_phone = "";
			F_status = "";
			Cdat = "";
			Ctim = "";
			Rdat = "";
			Rtim = "";
			Udat = "";
			Utim = "";
			Tstp = "";
			Clin_nm = "";
		}	
		public Generic_scheduleFilter cloneObject()
		{
			Generic_scheduleFilter newFilter = new Generic_scheduleFilter();
			
			newFilter.Appt_id = this.Appt_id;
			newFilter.F_appt_id = this.F_appt_id;
			newFilter.F_appl = this.F_appl;
			newFilter.Pkey = this.Pkey;
			newFilter.Ev_reas = this.Ev_reas;
			newFilter.App_reas = this.App_reas;
			newFilter.St_time = this.St_time;
			newFilter.App_st_time = this.App_st_time;
			newFilter.App_end_time = this.App_end_time;
			newFilter.F_per = this.F_per;
			newFilter.F_phone = this.F_phone;
			newFilter.E_per = this.E_per;
			newFilter.E_phone = this.E_phone;
			newFilter.F_status = this.F_status;
			newFilter.Cdat = this.Cdat;
			newFilter.Ctim = this.Ctim;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Tstp = this.Tstp;
			newFilter.Clin_nm = this.Clin_nm;
			
			return newFilter;
		}
	}
	public final class Generic_scheduleEditFilter
	{			
		public boolean IncludeAppt_id = true;
		public boolean IncludeF_appt_id = true;
		public boolean IncludeF_appl = true;
		public boolean IncludePkey = true;
		public boolean IncludeEv_reas = true;
		public boolean IncludeApp_reas = true;
		public boolean IncludeSt_time = true;
		public boolean IncludeApp_st_time = true;
		public boolean IncludeApp_end_time = true;
		public boolean IncludeF_per = true;
		public boolean IncludeF_phone = true;
		public boolean IncludeE_per = true;
		public boolean IncludeE_phone = true;
		public boolean IncludeF_status = true;
		public boolean IncludeCdat = true;
		public boolean IncludeCtim = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeTstp = true;
		public boolean IncludeClin_nm = true;
		
		public void includeAll()
		{				
			IncludeAppt_id = true;
			IncludeF_appt_id = true;
			IncludeF_appl = true;
			IncludePkey = true;
			IncludeEv_reas = true;
			IncludeApp_reas = true;
			IncludeSt_time = true;
			IncludeApp_st_time = true;
			IncludeApp_end_time = true;
			IncludeF_per = true;
			IncludeF_phone = true;
			IncludeE_per = true;
			IncludeE_phone = true;
			IncludeF_status = true;
			IncludeCdat = true;
			IncludeCtim = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeTstp = true;
			IncludeClin_nm = true;
		}	
		public void excludeAll()
		{				
			IncludeAppt_id = false;
			IncludeF_appt_id = false;
			IncludeF_appl = false;
			IncludePkey = false;
			IncludeEv_reas = false;
			IncludeApp_reas = false;
			IncludeSt_time = false;
			IncludeApp_st_time = false;
			IncludeApp_end_time = false;
			IncludeF_per = false;
			IncludeF_phone = false;
			IncludeE_per = false;
			IncludeE_phone = false;
			IncludeF_status = false;
			IncludeCdat = false;
			IncludeCtim = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeTstp = false;
			IncludeClin_nm = false;
		}
		public Generic_scheduleEditFilter cloneObject()
		{
			Generic_scheduleEditFilter newEditFilter = new Generic_scheduleEditFilter();
			
			newEditFilter.IncludeAppt_id = this.IncludeAppt_id;
			newEditFilter.IncludeF_appt_id = this.IncludeF_appt_id;
			newEditFilter.IncludeF_appl = this.IncludeF_appl;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeEv_reas = this.IncludeEv_reas;
			newEditFilter.IncludeApp_reas = this.IncludeApp_reas;
			newEditFilter.IncludeSt_time = this.IncludeSt_time;
			newEditFilter.IncludeApp_st_time = this.IncludeApp_st_time;
			newEditFilter.IncludeApp_end_time = this.IncludeApp_end_time;
			newEditFilter.IncludeF_per = this.IncludeF_per;
			newEditFilter.IncludeF_phone = this.IncludeF_phone;
			newEditFilter.IncludeE_per = this.IncludeE_per;
			newEditFilter.IncludeE_phone = this.IncludeE_phone;
			newEditFilter.IncludeF_status = this.IncludeF_status;
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeClin_nm = this.IncludeClin_nm;
			
			return newEditFilter;
		}
	}
}
