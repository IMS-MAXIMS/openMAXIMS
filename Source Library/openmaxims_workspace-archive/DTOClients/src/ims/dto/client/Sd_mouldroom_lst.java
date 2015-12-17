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

public final class Sd_mouldroom_lst implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_mouldroom_lst.class);
	
	private Sd_mouldroom_lstFilter lastGetFilter = null;
	private final String serviceName = "SD_MOULDROOM_LST";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_mouldroom_lstFilter Filter = new Sd_mouldroom_lstFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_mouldroom_lstEditFilter EditFilter = new Sd_mouldroom_lstEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_mouldroom_lstCollection DataCollection = new Sd_mouldroom_lstCollection();

	/**
	 * Creates a new Sd_mouldroom_lst Data Transfer Object.
	 */ 
	public Sd_mouldroom_lst(ims.dto.Connection connection)
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
	public Sd_mouldroom_lst cloneObject()
	{
		Sd_mouldroom_lst cloneObject = new Sd_mouldroom_lst(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Sd_comp_plan_id = DataCollection.get(x).Sd_comp_plan_id;
			cloneObject.DataCollection.get(index).Activdone = DataCollection.get(x).Activdone;
			cloneObject.DataCollection.get(index).Targetdate = DataCollection.get(x).Targetdate;
			cloneObject.DataCollection.get(index).Activityorder = DataCollection.get(x).Activityorder;
			cloneObject.DataCollection.get(index).Planactivity = DataCollection.get(x).Planactivity;
			cloneObject.DataCollection.get(index).Go_ptplact_id = DataCollection.get(x).Go_ptplact_id;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Act_consult = DataCollection.get(x).Act_consult;
			cloneObject.DataCollection.get(index).Act_consulttxt = DataCollection.get(x).Act_consulttxt;
			cloneObject.DataCollection.get(index).Targetdeadline = DataCollection.get(x).Targetdeadline;
			cloneObject.DataCollection.get(index).Nhsn = DataCollection.get(x).Nhsn;
			cloneObject.DataCollection.get(index).Pat_title = DataCollection.get(x).Pat_title;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Pat_surname = DataCollection.get(x).Pat_surname;
			cloneObject.DataCollection.get(index).Pat_forname = DataCollection.get(x).Pat_forname;
			cloneObject.DataCollection.get(index).Act_status = DataCollection.get(x).Act_status;
			cloneObject.DataCollection.get(index).Appt_head = DataCollection.get(x).Appt_head;
			cloneObject.DataCollection.get(index).Treatmentaction = DataCollection.get(x).Treatmentaction;
			cloneObject.DataCollection.get(index).Mc_id = DataCollection.get(x).Mc_id;
			cloneObject.DataCollection.get(index).First_appt_id = DataCollection.get(x).First_appt_id;
			cloneObject.DataCollection.get(index).Appt_head_id = DataCollection.get(x).Appt_head_id;
			cloneObject.DataCollection.get(index).Mc_nm = DataCollection.get(x).Mc_nm;
			cloneObject.DataCollection.get(index).Completinghcp = DataCollection.get(x).Completinghcp;
			cloneObject.DataCollection.get(index).Planactivitytxt = DataCollection.get(x).Planactivitytxt;
			cloneObject.DataCollection.get(index).Tpaction_id = DataCollection.get(x).Tpaction_id;
			cloneObject.DataCollection.get(index).Tpactiontxt = DataCollection.get(x).Tpactiontxt;
			cloneObject.DataCollection.get(index).Activity = DataCollection.get(x).Activity;
			cloneObject.DataCollection.get(index).Prfile_sess_id = DataCollection.get(x).Prfile_sess_id;
			cloneObject.DataCollection.get(index).Appt_date = DataCollection.get(x).Appt_date;
			cloneObject.DataCollection.get(index).Currentactivity = DataCollection.get(x).Currentactivity;
			cloneObject.DataCollection.get(index).Stm = DataCollection.get(x).Stm;
			cloneObject.DataCollection.get(index).Etm = DataCollection.get(x).Etm;
			cloneObject.DataCollection.get(index).Txcattype = DataCollection.get(x).Txcattype;
			cloneObject.DataCollection.get(index).Tl_dose = DataCollection.get(x).Tl_dose;
			cloneObject.DataCollection.get(index).Tl_fractions = DataCollection.get(x).Tl_fractions;
			cloneObject.DataCollection.get(index).Tl_dur = DataCollection.get(x).Tl_dur;
			cloneObject.DataCollection.get(index).Txcattypetxt = DataCollection.get(x).Txcattypetxt;
			cloneObject.DataCollection.get(index).Cmts = DataCollection.get(x).Cmts;
			cloneObject.DataCollection.get(index).Pt_tp_id = DataCollection.get(x).Pt_tp_id;
			cloneObject.DataCollection.get(index).Ismouldroom = DataCollection.get(x).Ismouldroom;
			cloneObject.DataCollection.get(index).Mouldroomnotes = DataCollection.get(x).Mouldroomnotes;
			cloneObject.DataCollection.get(index).Seqno = DataCollection.get(x).Seqno;
							
			
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
		return "Sd_mouldroom_lst.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mouldroom_lst.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_mouldroom_lst.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mouldroom_lst.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mouldroom_lst.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mouldroom_lst.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_mouldroom_lst.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_mouldroom_lst.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mouldroom_lst.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_mouldroom_lst.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_mouldroom_lst.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_mouldroom_lst.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_mouldroom_lst.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_mouldroom_lst.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mouldroom_lst.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_mouldroom_lst.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_mouldroom_lst.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_mouldroom_lst.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_mouldroom_lst.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_mouldroom_lst.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mouldroom_lst.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_mouldroom_lst.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_mouldroom_lst.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mouldroom_lst.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_mouldroom_lst.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_mouldroom_lst.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_mouldroom_lst.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_mouldroom_lst nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_mouldroom_lst After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_mouldroom_lst After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_mouldroom_lst.List");
							
		listInProgress = true;	
		logger.debug("Sd_mouldroom_lst Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_mouldroom_lst After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_mouldroom_lst After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_mouldroom_lstFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Sd_comp_plan_id != null && filter.Sd_comp_plan_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SD_COMP_PLAN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sd_comp_plan_id);
		}
		
		if(Filter.Activdone != null && filter.Activdone.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIVDONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activdone);
		}
		
		if(Filter.Targetdate != null && filter.Targetdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TARGETDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Targetdate);
		}
		
		if(Filter.Activityorder != null && filter.Activityorder.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIVITYORDER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activityorder);
		}
		
		if(Filter.Planactivity != null && filter.Planactivity.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PLANACTIVITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Planactivity);
		}
		
		if(Filter.Go_ptplact_id != null && filter.Go_ptplact_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GO_PTPLACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Go_ptplact_id);
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey);
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
		
		if(Filter.Targetdeadline != null && filter.Targetdeadline.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TARGETDEADLINE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Targetdeadline);
		}
		
		if(Filter.Nhsn != null && filter.Nhsn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NHSN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsn);
		}
		
		if(Filter.Pat_title != null && filter.Pat_title.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PAT_TITLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pat_title);
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum);
		}
		
		if(Filter.Pat_surname != null && filter.Pat_surname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PAT_SURNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pat_surname);
		}
		
		if(Filter.Pat_forname != null && filter.Pat_forname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PAT_FORNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pat_forname);
		}
		
		if(Filter.Act_status != null && filter.Act_status.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_status);
		}
		
		if(Filter.Appt_head != null && filter.Appt_head.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_HEAD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_head);
		}
		
		if(Filter.Treatmentaction != null && filter.Treatmentaction.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TREATMENTACTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Treatmentaction);
		}
		
		if(Filter.Mc_id != null && filter.Mc_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_id);
		}
		
		if(Filter.First_appt_id != null && filter.First_appt_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FIRST_APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.First_appt_id);
		}
		
		if(Filter.Appt_head_id != null && filter.Appt_head_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_HEAD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_head_id);
		}
		
		if(Filter.Mc_nm != null && filter.Mc_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_nm);
		}
		
		if(Filter.Completinghcp != null && filter.Completinghcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("COMPLETINGHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Completinghcp);
		}
		
		if(Filter.Planactivitytxt != null && filter.Planactivitytxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PLANACTIVITYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Planactivitytxt);
		}
		
		if(Filter.Tpaction_id != null && filter.Tpaction_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TPACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tpaction_id);
		}
		
		if(Filter.Tpactiontxt != null && filter.Tpactiontxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TPACTIONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tpactiontxt);
		}
		
		if(Filter.Activity != null && filter.Activity.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIVITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activity);
		}
		
		if(Filter.Prfile_sess_id != null && filter.Prfile_sess_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRFILE_SESS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prfile_sess_id);
		}
		
		if(Filter.Appt_date != null && filter.Appt_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_date);
		}
		
		if(Filter.Currentactivity != null && filter.Currentactivity.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CURRENTACTIVITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Currentactivity);
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
		
		if(Filter.Txcattype != null && filter.Txcattype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TXCATTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Txcattype);
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
		
		if(Filter.Txcattypetxt != null && filter.Txcattypetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TXCATTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Txcattypetxt);
		}
		
		if(Filter.Cmts != null && filter.Cmts.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CMTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cmts);
		}
		
		if(Filter.Pt_tp_id != null && filter.Pt_tp_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PT_TP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pt_tp_id);
		}
		
		if(Filter.Ismouldroom != null && filter.Ismouldroom.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ISMOULDROOM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ismouldroom);
		}
		
		if(Filter.Mouldroomnotes != null && filter.Mouldroomnotes.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MOULDROOMNOTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mouldroomnotes);
		}
		
		if(Filter.Seqno != null && filter.Seqno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Seqno);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_mouldroom_lstRecord data = (Sd_mouldroom_lstRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeSd_comp_plan_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SD_COMP_PLAN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sd_comp_plan_id));
		}
		
		if(EditFilter.IncludeActivdone)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIVDONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activdone));
		}
		
		if(EditFilter.IncludeTargetdate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TARGETDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Targetdate));
		}
		
		if(EditFilter.IncludeActivityorder)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIVITYORDER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activityorder));
		}
		
		if(EditFilter.IncludePlanactivity)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PLANACTIVITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Planactivity));
		}
		
		if(EditFilter.IncludeGo_ptplact_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GO_PTPLACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Go_ptplact_id));
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey));
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
		
		if(EditFilter.IncludeTargetdeadline)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TARGETDEADLINE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Targetdeadline));
		}
		
		if(EditFilter.IncludeNhsn)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NHSN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsn));
		}
		
		if(EditFilter.IncludePat_title)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PAT_TITLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pat_title));
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum));
		}
		
		if(EditFilter.IncludePat_surname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PAT_SURNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pat_surname));
		}
		
		if(EditFilter.IncludePat_forname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PAT_FORNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pat_forname));
		}
		
		if(EditFilter.IncludeAct_status)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_status));
		}
		
		if(EditFilter.IncludeAppt_head)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_HEAD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_head));
		}
		
		if(EditFilter.IncludeTreatmentaction)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TREATMENTACTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Treatmentaction));
		}
		
		if(EditFilter.IncludeMc_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_id));
		}
		
		if(EditFilter.IncludeFirst_appt_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FIRST_APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.First_appt_id));
		}
		
		if(EditFilter.IncludeAppt_head_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_HEAD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_head_id));
		}
		
		if(EditFilter.IncludeMc_nm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_nm));
		}
		
		if(EditFilter.IncludeCompletinghcp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("COMPLETINGHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Completinghcp));
		}
		
		if(EditFilter.IncludePlanactivitytxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PLANACTIVITYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Planactivitytxt));
		}
		
		if(EditFilter.IncludeTpaction_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TPACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tpaction_id));
		}
		
		if(EditFilter.IncludeTpactiontxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TPACTIONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tpactiontxt));
		}
		
		if(EditFilter.IncludeActivity)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIVITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activity));
		}
		
		if(EditFilter.IncludePrfile_sess_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILE_SESS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prfile_sess_id));
		}
		
		if(EditFilter.IncludeAppt_date)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_date));
		}
		
		if(EditFilter.IncludeCurrentactivity)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CURRENTACTIVITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Currentactivity));
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
		
		if(EditFilter.IncludeTxcattype)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXCATTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Txcattype));
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
		
		if(EditFilter.IncludeTxcattypetxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXCATTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Txcattypetxt));
		}
		
		if(EditFilter.IncludeCmts)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CMTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cmts));
		}
		
		if(EditFilter.IncludePt_tp_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PT_TP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pt_tp_id));
		}
		
		if(EditFilter.IncludeIsmouldroom)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ISMOULDROOM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ismouldroom));
		}
		
		if(EditFilter.IncludeMouldroomnotes)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MOULDROOMNOTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mouldroomnotes));
		}
		
		if(EditFilter.IncludeSeqno)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Seqno));
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
			Sd_mouldroom_lstRecord record = new Sd_mouldroom_lstRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Sd_comp_plan_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_COMP_PLAN_ID"));
			record.Activdone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVDONE"));
			record.Targetdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TARGETDATE"));
			record.Activityorder = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITYORDER"));
			record.Planactivity = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLANACTIVITY"));
			record.Go_ptplact_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_PTPLACT_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Act_consult = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULT"));
			record.Act_consulttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULTTXT"));
			record.Targetdeadline = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TARGETDEADLINE"));
			record.Nhsn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSN"));
			record.Pat_title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_TITLE"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Pat_surname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_SURNAME"));
			record.Pat_forname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_FORNAME"));
			record.Act_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STATUS"));
			record.Appt_head = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HEAD"));
			record.Treatmentaction = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TREATMENTACTION"));
			record.Mc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID"));
			record.First_appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_ID"));
			record.Appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HEAD_ID"));
			record.Mc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_NM"));
			record.Completinghcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPLETINGHCP"));
			record.Planactivitytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLANACTIVITYTXT"));
			record.Tpaction_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TPACTION_ID"));
			record.Tpactiontxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TPACTIONTXT"));
			record.Activity = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITY"));
			record.Prfile_sess_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_ID"));
			record.Appt_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_DATE"));
			record.Currentactivity = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURRENTACTIVITY"));
			record.Stm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STM"));
			record.Etm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETM"));
			record.Txcattype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPE"));
			record.Tl_dose = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TL_DOSE"));
			record.Tl_fractions = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TL_FRACTIONS"));
			record.Tl_dur = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TL_DUR"));
			record.Txcattypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPETXT"));
			record.Cmts = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CMTS"));
			record.Pt_tp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PT_TP_ID"));
			record.Ismouldroom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ISMOULDROOM"));
			record.Mouldroomnotes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOULDROOMNOTES"));
			record.Seqno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEQNO"));
									
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
			Sd_mouldroom_lstRecord record = new Sd_mouldroom_lstRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Sd_comp_plan_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_COMP_PLAN_ID"));
			record.Activdone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVDONE"));
			record.Targetdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TARGETDATE"));
			record.Activityorder = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITYORDER"));
			record.Planactivity = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLANACTIVITY"));
			record.Go_ptplact_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_PTPLACT_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Act_consult = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULT"));
			record.Act_consulttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULTTXT"));
			record.Targetdeadline = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TARGETDEADLINE"));
			record.Nhsn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSN"));
			record.Pat_title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_TITLE"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Pat_surname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_SURNAME"));
			record.Pat_forname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_FORNAME"));
			record.Act_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STATUS"));
			record.Appt_head = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HEAD"));
			record.Treatmentaction = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TREATMENTACTION"));
			record.Mc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID"));
			record.First_appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_APPT_ID"));
			record.Appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HEAD_ID"));
			record.Mc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_NM"));
			record.Completinghcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPLETINGHCP"));
			record.Planactivitytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLANACTIVITYTXT"));
			record.Tpaction_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TPACTION_ID"));
			record.Tpactiontxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TPACTIONTXT"));
			record.Activity = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITY"));
			record.Prfile_sess_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_ID"));
			record.Appt_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_DATE"));
			record.Currentactivity = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURRENTACTIVITY"));
			record.Stm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STM"));
			record.Etm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETM"));
			record.Txcattype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPE"));
			record.Tl_dose = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TL_DOSE"));
			record.Tl_fractions = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TL_FRACTIONS"));
			record.Tl_dur = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TL_DUR"));
			record.Txcattypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCATTYPETXT"));
			record.Cmts = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CMTS"));
			record.Pt_tp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PT_TP_ID"));
			record.Ismouldroom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ISMOULDROOM"));
			record.Mouldroomnotes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOULDROOMNOTES"));
			record.Seqno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEQNO"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Sd_mouldroom_lstCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_mouldroom_lstRecord newRecord = new Sd_mouldroom_lstRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_mouldroom_lstRecord record)
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
		public Sd_mouldroom_lstRecord get(int index)
		{
			return (Sd_mouldroom_lstRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_mouldroom_lstRecord
	{
		public String Sd_comp_plan_id = "";
		public String Activdone = "";
		public String Targetdate = "";
		public String Activityorder = "";
		public String Planactivity = "";
		public String Go_ptplact_id = "";
		public String Pkey = "";
		public String Act_consult = "";
		public String Act_consulttxt = "";
		public String Targetdeadline = "";
		public String Nhsn = "";
		public String Pat_title = "";
		public String Hospnum = "";
		public String Pat_surname = "";
		public String Pat_forname = "";
		public String Act_status = "";
		public String Appt_head = "";
		public String Treatmentaction = "";
		public String Mc_id = "";
		public String First_appt_id = "";
		public String Appt_head_id = "";
		public String Mc_nm = "";
		public String Completinghcp = "";
		public String Planactivitytxt = "";
		public String Tpaction_id = "";
		public String Tpactiontxt = "";
		public String Activity = "";
		public String Prfile_sess_id = "";
		public String Appt_date = "";
		public String Currentactivity = "";
		public String Stm = "";
		public String Etm = "";
		public String Txcattype = "";
		public String Tl_dose = "";
		public String Tl_fractions = "";
		public String Tl_dur = "";
		public String Txcattypetxt = "";
		public String Cmts = "";
		public String Pt_tp_id = "";
		public String Ismouldroom = "";
		public String Mouldroomnotes = "";
		public String Seqno = "";
				
		
		public void clear()
		{
			Sd_comp_plan_id = "";
			Activdone = "";
			Targetdate = "";
			Activityorder = "";
			Planactivity = "";
			Go_ptplact_id = "";
			Pkey = "";
			Act_consult = "";
			Act_consulttxt = "";
			Targetdeadline = "";
			Nhsn = "";
			Pat_title = "";
			Hospnum = "";
			Pat_surname = "";
			Pat_forname = "";
			Act_status = "";
			Appt_head = "";
			Treatmentaction = "";
			Mc_id = "";
			First_appt_id = "";
			Appt_head_id = "";
			Mc_nm = "";
			Completinghcp = "";
			Planactivitytxt = "";
			Tpaction_id = "";
			Tpactiontxt = "";
			Activity = "";
			Prfile_sess_id = "";
			Appt_date = "";
			Currentactivity = "";
			Stm = "";
			Etm = "";
			Txcattype = "";
			Tl_dose = "";
			Tl_fractions = "";
			Tl_dur = "";
			Txcattypetxt = "";
			Cmts = "";
			Pt_tp_id = "";
			Ismouldroom = "";
			Mouldroomnotes = "";
			Seqno = "";
			
		}		
	}
		
		
	public final class Sd_mouldroom_lstFilter
	{			
		public String Sd_comp_plan_id = "";
		public String Activdone = "";
		public String Targetdate = "";
		public String Activityorder = "";
		public String Planactivity = "";
		public String Go_ptplact_id = "";
		public String Pkey = "";
		public String Act_consult = "";
		public String Act_consulttxt = "";
		public String Targetdeadline = "";
		public String Nhsn = "";
		public String Pat_title = "";
		public String Hospnum = "";
		public String Pat_surname = "";
		public String Pat_forname = "";
		public String Act_status = "";
		public String Appt_head = "";
		public String Treatmentaction = "";
		public String Mc_id = "";
		public String First_appt_id = "";
		public String Appt_head_id = "";
		public String Mc_nm = "";
		public String Completinghcp = "";
		public String Planactivitytxt = "";
		public String Tpaction_id = "";
		public String Tpactiontxt = "";
		public String Activity = "";
		public String Prfile_sess_id = "";
		public String Appt_date = "";
		public String Currentactivity = "";
		public String Stm = "";
		public String Etm = "";
		public String Txcattype = "";
		public String Tl_dose = "";
		public String Tl_fractions = "";
		public String Tl_dur = "";
		public String Txcattypetxt = "";
		public String Cmts = "";
		public String Pt_tp_id = "";
		public String Ismouldroom = "";
		public String Mouldroomnotes = "";
		public String Seqno = "";
		
		public void clear()
		{				
			Sd_comp_plan_id = "";
			Activdone = "";
			Targetdate = "";
			Activityorder = "";
			Planactivity = "";
			Go_ptplact_id = "";
			Pkey = "";
			Act_consult = "";
			Act_consulttxt = "";
			Targetdeadline = "";
			Nhsn = "";
			Pat_title = "";
			Hospnum = "";
			Pat_surname = "";
			Pat_forname = "";
			Act_status = "";
			Appt_head = "";
			Treatmentaction = "";
			Mc_id = "";
			First_appt_id = "";
			Appt_head_id = "";
			Mc_nm = "";
			Completinghcp = "";
			Planactivitytxt = "";
			Tpaction_id = "";
			Tpactiontxt = "";
			Activity = "";
			Prfile_sess_id = "";
			Appt_date = "";
			Currentactivity = "";
			Stm = "";
			Etm = "";
			Txcattype = "";
			Tl_dose = "";
			Tl_fractions = "";
			Tl_dur = "";
			Txcattypetxt = "";
			Cmts = "";
			Pt_tp_id = "";
			Ismouldroom = "";
			Mouldroomnotes = "";
			Seqno = "";
		}	
		public Sd_mouldroom_lstFilter cloneObject()
		{
			Sd_mouldroom_lstFilter newFilter = new Sd_mouldroom_lstFilter();
			
			newFilter.Sd_comp_plan_id = this.Sd_comp_plan_id;
			newFilter.Activdone = this.Activdone;
			newFilter.Targetdate = this.Targetdate;
			newFilter.Activityorder = this.Activityorder;
			newFilter.Planactivity = this.Planactivity;
			newFilter.Go_ptplact_id = this.Go_ptplact_id;
			newFilter.Pkey = this.Pkey;
			newFilter.Act_consult = this.Act_consult;
			newFilter.Act_consulttxt = this.Act_consulttxt;
			newFilter.Targetdeadline = this.Targetdeadline;
			newFilter.Nhsn = this.Nhsn;
			newFilter.Pat_title = this.Pat_title;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Pat_surname = this.Pat_surname;
			newFilter.Pat_forname = this.Pat_forname;
			newFilter.Act_status = this.Act_status;
			newFilter.Appt_head = this.Appt_head;
			newFilter.Treatmentaction = this.Treatmentaction;
			newFilter.Mc_id = this.Mc_id;
			newFilter.First_appt_id = this.First_appt_id;
			newFilter.Appt_head_id = this.Appt_head_id;
			newFilter.Mc_nm = this.Mc_nm;
			newFilter.Completinghcp = this.Completinghcp;
			newFilter.Planactivitytxt = this.Planactivitytxt;
			newFilter.Tpaction_id = this.Tpaction_id;
			newFilter.Tpactiontxt = this.Tpactiontxt;
			newFilter.Activity = this.Activity;
			newFilter.Prfile_sess_id = this.Prfile_sess_id;
			newFilter.Appt_date = this.Appt_date;
			newFilter.Currentactivity = this.Currentactivity;
			newFilter.Stm = this.Stm;
			newFilter.Etm = this.Etm;
			newFilter.Txcattype = this.Txcattype;
			newFilter.Tl_dose = this.Tl_dose;
			newFilter.Tl_fractions = this.Tl_fractions;
			newFilter.Tl_dur = this.Tl_dur;
			newFilter.Txcattypetxt = this.Txcattypetxt;
			newFilter.Cmts = this.Cmts;
			newFilter.Pt_tp_id = this.Pt_tp_id;
			newFilter.Ismouldroom = this.Ismouldroom;
			newFilter.Mouldroomnotes = this.Mouldroomnotes;
			newFilter.Seqno = this.Seqno;
			
			return newFilter;
		}
	}
	public final class Sd_mouldroom_lstEditFilter
	{			
		public boolean IncludeSd_comp_plan_id = true;
		public boolean IncludeActivdone = true;
		public boolean IncludeTargetdate = true;
		public boolean IncludeActivityorder = true;
		public boolean IncludePlanactivity = true;
		public boolean IncludeGo_ptplact_id = true;
		public boolean IncludePkey = true;
		public boolean IncludeAct_consult = true;
		public boolean IncludeAct_consulttxt = true;
		public boolean IncludeTargetdeadline = true;
		public boolean IncludeNhsn = true;
		public boolean IncludePat_title = true;
		public boolean IncludeHospnum = true;
		public boolean IncludePat_surname = true;
		public boolean IncludePat_forname = true;
		public boolean IncludeAct_status = true;
		public boolean IncludeAppt_head = true;
		public boolean IncludeTreatmentaction = true;
		public boolean IncludeMc_id = true;
		public boolean IncludeFirst_appt_id = true;
		public boolean IncludeAppt_head_id = true;
		public boolean IncludeMc_nm = true;
		public boolean IncludeCompletinghcp = true;
		public boolean IncludePlanactivitytxt = true;
		public boolean IncludeTpaction_id = true;
		public boolean IncludeTpactiontxt = true;
		public boolean IncludeActivity = true;
		public boolean IncludePrfile_sess_id = true;
		public boolean IncludeAppt_date = true;
		public boolean IncludeCurrentactivity = true;
		public boolean IncludeStm = true;
		public boolean IncludeEtm = true;
		public boolean IncludeTxcattype = true;
		public boolean IncludeTl_dose = true;
		public boolean IncludeTl_fractions = true;
		public boolean IncludeTl_dur = true;
		public boolean IncludeTxcattypetxt = true;
		public boolean IncludeCmts = true;
		public boolean IncludePt_tp_id = true;
		public boolean IncludeIsmouldroom = true;
		public boolean IncludeMouldroomnotes = true;
		public boolean IncludeSeqno = true;
		
		public void includeAll()
		{				
			IncludeSd_comp_plan_id = true;
			IncludeActivdone = true;
			IncludeTargetdate = true;
			IncludeActivityorder = true;
			IncludePlanactivity = true;
			IncludeGo_ptplact_id = true;
			IncludePkey = true;
			IncludeAct_consult = true;
			IncludeAct_consulttxt = true;
			IncludeTargetdeadline = true;
			IncludeNhsn = true;
			IncludePat_title = true;
			IncludeHospnum = true;
			IncludePat_surname = true;
			IncludePat_forname = true;
			IncludeAct_status = true;
			IncludeAppt_head = true;
			IncludeTreatmentaction = true;
			IncludeMc_id = true;
			IncludeFirst_appt_id = true;
			IncludeAppt_head_id = true;
			IncludeMc_nm = true;
			IncludeCompletinghcp = true;
			IncludePlanactivitytxt = true;
			IncludeTpaction_id = true;
			IncludeTpactiontxt = true;
			IncludeActivity = true;
			IncludePrfile_sess_id = true;
			IncludeAppt_date = true;
			IncludeCurrentactivity = true;
			IncludeStm = true;
			IncludeEtm = true;
			IncludeTxcattype = true;
			IncludeTl_dose = true;
			IncludeTl_fractions = true;
			IncludeTl_dur = true;
			IncludeTxcattypetxt = true;
			IncludeCmts = true;
			IncludePt_tp_id = true;
			IncludeIsmouldroom = true;
			IncludeMouldroomnotes = true;
			IncludeSeqno = true;
		}	
		public void excludeAll()
		{				
			IncludeSd_comp_plan_id = false;
			IncludeActivdone = false;
			IncludeTargetdate = false;
			IncludeActivityorder = false;
			IncludePlanactivity = false;
			IncludeGo_ptplact_id = false;
			IncludePkey = false;
			IncludeAct_consult = false;
			IncludeAct_consulttxt = false;
			IncludeTargetdeadline = false;
			IncludeNhsn = false;
			IncludePat_title = false;
			IncludeHospnum = false;
			IncludePat_surname = false;
			IncludePat_forname = false;
			IncludeAct_status = false;
			IncludeAppt_head = false;
			IncludeTreatmentaction = false;
			IncludeMc_id = false;
			IncludeFirst_appt_id = false;
			IncludeAppt_head_id = false;
			IncludeMc_nm = false;
			IncludeCompletinghcp = false;
			IncludePlanactivitytxt = false;
			IncludeTpaction_id = false;
			IncludeTpactiontxt = false;
			IncludeActivity = false;
			IncludePrfile_sess_id = false;
			IncludeAppt_date = false;
			IncludeCurrentactivity = false;
			IncludeStm = false;
			IncludeEtm = false;
			IncludeTxcattype = false;
			IncludeTl_dose = false;
			IncludeTl_fractions = false;
			IncludeTl_dur = false;
			IncludeTxcattypetxt = false;
			IncludeCmts = false;
			IncludePt_tp_id = false;
			IncludeIsmouldroom = false;
			IncludeMouldroomnotes = false;
			IncludeSeqno = false;
		}
		public Sd_mouldroom_lstEditFilter cloneObject()
		{
			Sd_mouldroom_lstEditFilter newEditFilter = new Sd_mouldroom_lstEditFilter();
			
			newEditFilter.IncludeSd_comp_plan_id = this.IncludeSd_comp_plan_id;
			newEditFilter.IncludeActivdone = this.IncludeActivdone;
			newEditFilter.IncludeTargetdate = this.IncludeTargetdate;
			newEditFilter.IncludeActivityorder = this.IncludeActivityorder;
			newEditFilter.IncludePlanactivity = this.IncludePlanactivity;
			newEditFilter.IncludeGo_ptplact_id = this.IncludeGo_ptplact_id;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeAct_consult = this.IncludeAct_consult;
			newEditFilter.IncludeAct_consulttxt = this.IncludeAct_consulttxt;
			newEditFilter.IncludeTargetdeadline = this.IncludeTargetdeadline;
			newEditFilter.IncludeNhsn = this.IncludeNhsn;
			newEditFilter.IncludePat_title = this.IncludePat_title;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludePat_surname = this.IncludePat_surname;
			newEditFilter.IncludePat_forname = this.IncludePat_forname;
			newEditFilter.IncludeAct_status = this.IncludeAct_status;
			newEditFilter.IncludeAppt_head = this.IncludeAppt_head;
			newEditFilter.IncludeTreatmentaction = this.IncludeTreatmentaction;
			newEditFilter.IncludeMc_id = this.IncludeMc_id;
			newEditFilter.IncludeFirst_appt_id = this.IncludeFirst_appt_id;
			newEditFilter.IncludeAppt_head_id = this.IncludeAppt_head_id;
			newEditFilter.IncludeMc_nm = this.IncludeMc_nm;
			newEditFilter.IncludeCompletinghcp = this.IncludeCompletinghcp;
			newEditFilter.IncludePlanactivitytxt = this.IncludePlanactivitytxt;
			newEditFilter.IncludeTpaction_id = this.IncludeTpaction_id;
			newEditFilter.IncludeTpactiontxt = this.IncludeTpactiontxt;
			newEditFilter.IncludeActivity = this.IncludeActivity;
			newEditFilter.IncludePrfile_sess_id = this.IncludePrfile_sess_id;
			newEditFilter.IncludeAppt_date = this.IncludeAppt_date;
			newEditFilter.IncludeCurrentactivity = this.IncludeCurrentactivity;
			newEditFilter.IncludeStm = this.IncludeStm;
			newEditFilter.IncludeEtm = this.IncludeEtm;
			newEditFilter.IncludeTxcattype = this.IncludeTxcattype;
			newEditFilter.IncludeTl_dose = this.IncludeTl_dose;
			newEditFilter.IncludeTl_fractions = this.IncludeTl_fractions;
			newEditFilter.IncludeTl_dur = this.IncludeTl_dur;
			newEditFilter.IncludeTxcattypetxt = this.IncludeTxcattypetxt;
			newEditFilter.IncludeCmts = this.IncludeCmts;
			newEditFilter.IncludePt_tp_id = this.IncludePt_tp_id;
			newEditFilter.IncludeIsmouldroom = this.IncludeIsmouldroom;
			newEditFilter.IncludeMouldroomnotes = this.IncludeMouldroomnotes;
			newEditFilter.IncludeSeqno = this.IncludeSeqno;
			
			return newEditFilter;
		}
	}
}
