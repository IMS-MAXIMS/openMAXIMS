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

public final class Sd_comp_plan_lst implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_comp_plan_lst.class);
	
	private Sd_comp_plan_lstFilter lastGetFilter = null;
	private final String serviceName = "SD_COMP_PLAN_LST";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_comp_plan_lstFilter Filter = new Sd_comp_plan_lstFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_comp_plan_lstEditFilter EditFilter = new Sd_comp_plan_lstEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_comp_plan_lstCollection DataCollection = new Sd_comp_plan_lstCollection();

	/**
	 * Creates a new Sd_comp_plan_lst Data Transfer Object.
	 */ 
	public Sd_comp_plan_lst(ims.dto.Connection connection)
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
	public Sd_comp_plan_lst cloneObject()
	{
		Sd_comp_plan_lst cloneObject = new Sd_comp_plan_lst(Connection);
			
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
			cloneObject.DataCollection.get(index).Outcomereas = DataCollection.get(x).Outcomereas;
			cloneObject.DataCollection.get(index).Activoutcome = DataCollection.get(x).Activoutcome;
			cloneObject.DataCollection.get(index).Activdone = DataCollection.get(x).Activdone;
			cloneObject.DataCollection.get(index).Completeddate = DataCollection.get(x).Completeddate;
			cloneObject.DataCollection.get(index).Targetdate = DataCollection.get(x).Targetdate;
			cloneObject.DataCollection.get(index).Activityorder = DataCollection.get(x).Activityorder;
			cloneObject.DataCollection.get(index).Planactivity = DataCollection.get(x).Planactivity;
			cloneObject.DataCollection.get(index).Prevplanactiv = DataCollection.get(x).Prevplanactiv;
			cloneObject.DataCollection.get(index).Prevplancompdate = DataCollection.get(x).Prevplancompdate;
			cloneObject.DataCollection.get(index).Planhcp = DataCollection.get(x).Planhcp;
			cloneObject.DataCollection.get(index).Comphcp = DataCollection.get(x).Comphcp;
			cloneObject.DataCollection.get(index).Go_ptplact_id = DataCollection.get(x).Go_ptplact_id;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Act_consult = DataCollection.get(x).Act_consult;
			cloneObject.DataCollection.get(index).Act_consulttxt = DataCollection.get(x).Act_consulttxt;
			cloneObject.DataCollection.get(index).Planhcptxt = DataCollection.get(x).Planhcptxt;
			cloneObject.DataCollection.get(index).Compplantxt = DataCollection.get(x).Compplantxt;
			cloneObject.DataCollection.get(index).Targetdeadline = DataCollection.get(x).Targetdeadline;
			cloneObject.DataCollection.get(index).Nhsn = DataCollection.get(x).Nhsn;
			cloneObject.DataCollection.get(index).Pat_title = DataCollection.get(x).Pat_title;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Pat_surname = DataCollection.get(x).Pat_surname;
			cloneObject.DataCollection.get(index).Pat_forname = DataCollection.get(x).Pat_forname;
			cloneObject.DataCollection.get(index).Act_status = DataCollection.get(x).Act_status;
			cloneObject.DataCollection.get(index).Stat_reas = DataCollection.get(x).Stat_reas;
			cloneObject.DataCollection.get(index).Remfromlist = DataCollection.get(x).Remfromlist;
			cloneObject.DataCollection.get(index).Nextplanactiv = DataCollection.get(x).Nextplanactiv;
			cloneObject.DataCollection.get(index).Nextplanactivcompdate = DataCollection.get(x).Nextplanactivcompdate;
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
			cloneObject.DataCollection.get(index).Tpactivitytxt = DataCollection.get(x).Tpactivitytxt;
			cloneObject.DataCollection.get(index).Requiresconsultant = DataCollection.get(x).Requiresconsultant;
							
			
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
		return "Sd_comp_plan_lst.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan_lst.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_comp_plan_lst.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan_lst.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan_lst.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan_lst.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_comp_plan_lst.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_comp_plan_lst.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan_lst.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_comp_plan_lst.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_comp_plan_lst.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_comp_plan_lst.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_comp_plan_lst.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_comp_plan_lst.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan_lst.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_comp_plan_lst.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_comp_plan_lst.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_comp_plan_lst.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_comp_plan_lst.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_comp_plan_lst.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan_lst.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_comp_plan_lst.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_comp_plan_lst.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan_lst.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_comp_plan_lst.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_comp_plan_lst.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_comp_plan_lst.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_comp_plan_lst nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_comp_plan_lst After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_comp_plan_lst After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan_lst.List");
							
		listInProgress = true;	
		logger.debug("Sd_comp_plan_lst Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_comp_plan_lst After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_comp_plan_lst After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_comp_plan_lstFilter filter)
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
		
		if(Filter.Outcomereas != null && filter.Outcomereas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OUTCOMEREAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Outcomereas);
		}
		
		if(Filter.Activoutcome != null && filter.Activoutcome.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIVOUTCOME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activoutcome);
		}
		
		if(Filter.Activdone != null && filter.Activdone.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIVDONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activdone);
		}
		
		if(Filter.Completeddate != null && filter.Completeddate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("COMPLETEDDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Completeddate);
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
		
		if(Filter.Prevplanactiv != null && filter.Prevplanactiv.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PREVPLANACTIV" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prevplanactiv);
		}
		
		if(Filter.Prevplancompdate != null && filter.Prevplancompdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PREVPLANCOMPDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prevplancompdate);
		}
		
		if(Filter.Planhcp != null && filter.Planhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PLANHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Planhcp);
		}
		
		if(Filter.Comphcp != null && filter.Comphcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("COMPHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Comphcp);
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
		
		if(Filter.Planhcptxt != null && filter.Planhcptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PLANHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Planhcptxt);
		}
		
		if(Filter.Compplantxt != null && filter.Compplantxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("COMPPLANTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Compplantxt);
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
		
		if(Filter.Stat_reas != null && filter.Stat_reas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STAT_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat_reas);
		}
		
		if(Filter.Remfromlist != null && filter.Remfromlist.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REMFROMLIST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Remfromlist);
		}
		
		if(Filter.Nextplanactiv != null && filter.Nextplanactiv.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NEXTPLANACTIV" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nextplanactiv);
		}
		
		if(Filter.Nextplanactivcompdate != null && filter.Nextplanactivcompdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NEXTPLANACTIVCOMPDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nextplanactivcompdate);
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
		
		if(Filter.Tpactivitytxt != null && filter.Tpactivitytxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TPACTIVITYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tpactivitytxt);
		}
		
		if(Filter.Requiresconsultant != null && filter.Requiresconsultant.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REQUIRESCONSULTANT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Requiresconsultant);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_comp_plan_lstRecord data = (Sd_comp_plan_lstRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeSd_comp_plan_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SD_COMP_PLAN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sd_comp_plan_id));
		}
		
		if(EditFilter.IncludeOutcomereas)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OUTCOMEREAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Outcomereas));
		}
		
		if(EditFilter.IncludeActivoutcome)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIVOUTCOME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activoutcome));
		}
		
		if(EditFilter.IncludeActivdone)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIVDONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activdone));
		}
		
		if(EditFilter.IncludeCompleteddate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("COMPLETEDDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Completeddate));
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
		
		if(EditFilter.IncludePrevplanactiv)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PREVPLANACTIV" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prevplanactiv));
		}
		
		if(EditFilter.IncludePrevplancompdate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PREVPLANCOMPDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prevplancompdate));
		}
		
		if(EditFilter.IncludePlanhcp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PLANHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Planhcp));
		}
		
		if(EditFilter.IncludeComphcp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("COMPHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Comphcp));
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
		
		if(EditFilter.IncludePlanhcptxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PLANHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Planhcptxt));
		}
		
		if(EditFilter.IncludeCompplantxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("COMPPLANTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Compplantxt));
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
		
		if(EditFilter.IncludeStat_reas)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STAT_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat_reas));
		}
		
		if(EditFilter.IncludeRemfromlist)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REMFROMLIST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Remfromlist));
		}
		
		if(EditFilter.IncludeNextplanactiv)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NEXTPLANACTIV" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nextplanactiv));
		}
		
		if(EditFilter.IncludeNextplanactivcompdate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NEXTPLANACTIVCOMPDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nextplanactivcompdate));
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
		
		if(EditFilter.IncludeTpactivitytxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TPACTIVITYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tpactivitytxt));
		}
		
		if(EditFilter.IncludeRequiresconsultant)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REQUIRESCONSULTANT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Requiresconsultant));
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
			Sd_comp_plan_lstRecord record = new Sd_comp_plan_lstRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Sd_comp_plan_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_COMP_PLAN_ID"));
			record.Outcomereas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUTCOMEREAS"));
			record.Activoutcome = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVOUTCOME"));
			record.Activdone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVDONE"));
			record.Completeddate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPLETEDDATE"));
			record.Targetdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TARGETDATE"));
			record.Activityorder = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITYORDER"));
			record.Planactivity = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLANACTIVITY"));
			record.Prevplanactiv = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PREVPLANACTIV"));
			record.Prevplancompdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PREVPLANCOMPDATE"));
			record.Planhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLANHCP"));
			record.Comphcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPHCP"));
			record.Go_ptplact_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_PTPLACT_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Act_consult = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULT"));
			record.Act_consulttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULTTXT"));
			record.Planhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLANHCPTXT"));
			record.Compplantxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPPLANTXT"));
			record.Targetdeadline = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TARGETDEADLINE"));
			record.Nhsn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSN"));
			record.Pat_title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_TITLE"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Pat_surname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_SURNAME"));
			record.Pat_forname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_FORNAME"));
			record.Act_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STATUS"));
			record.Stat_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT_REAS"));
			record.Remfromlist = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REMFROMLIST"));
			record.Nextplanactiv = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NEXTPLANACTIV"));
			record.Nextplanactivcompdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NEXTPLANACTIVCOMPDATE"));
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
			record.Tpactivitytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TPACTIVITYTXT"));
			record.Requiresconsultant = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQUIRESCONSULTANT"));
									
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
			Sd_comp_plan_lstRecord record = new Sd_comp_plan_lstRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Sd_comp_plan_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_COMP_PLAN_ID"));
			record.Outcomereas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUTCOMEREAS"));
			record.Activoutcome = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVOUTCOME"));
			record.Activdone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVDONE"));
			record.Completeddate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPLETEDDATE"));
			record.Targetdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TARGETDATE"));
			record.Activityorder = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVITYORDER"));
			record.Planactivity = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLANACTIVITY"));
			record.Prevplanactiv = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PREVPLANACTIV"));
			record.Prevplancompdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PREVPLANCOMPDATE"));
			record.Planhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLANHCP"));
			record.Comphcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPHCP"));
			record.Go_ptplact_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_PTPLACT_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Act_consult = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULT"));
			record.Act_consulttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULTTXT"));
			record.Planhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLANHCPTXT"));
			record.Compplantxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPPLANTXT"));
			record.Targetdeadline = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TARGETDEADLINE"));
			record.Nhsn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSN"));
			record.Pat_title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_TITLE"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Pat_surname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_SURNAME"));
			record.Pat_forname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_FORNAME"));
			record.Act_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STATUS"));
			record.Stat_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT_REAS"));
			record.Remfromlist = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REMFROMLIST"));
			record.Nextplanactiv = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NEXTPLANACTIV"));
			record.Nextplanactivcompdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NEXTPLANACTIVCOMPDATE"));
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
			record.Tpactivitytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TPACTIVITYTXT"));
			record.Requiresconsultant = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQUIRESCONSULTANT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Sd_comp_plan_lstCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_comp_plan_lstRecord newRecord = new Sd_comp_plan_lstRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_comp_plan_lstRecord record)
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
		public Sd_comp_plan_lstRecord get(int index)
		{
			return (Sd_comp_plan_lstRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_comp_plan_lstRecord
	{
		public String Sd_comp_plan_id = "";
		public String Outcomereas = "";
		public String Activoutcome = "";
		public String Activdone = "";
		public String Completeddate = "";
		public String Targetdate = "";
		public String Activityorder = "";
		public String Planactivity = "";
		public String Prevplanactiv = "";
		public String Prevplancompdate = "";
		public String Planhcp = "";
		public String Comphcp = "";
		public String Go_ptplact_id = "";
		public String Pkey = "";
		public String Act_consult = "";
		public String Act_consulttxt = "";
		public String Planhcptxt = "";
		public String Compplantxt = "";
		public String Targetdeadline = "";
		public String Nhsn = "";
		public String Pat_title = "";
		public String Hospnum = "";
		public String Pat_surname = "";
		public String Pat_forname = "";
		public String Act_status = "";
		public String Stat_reas = "";
		public String Remfromlist = "";
		public String Nextplanactiv = "";
		public String Nextplanactivcompdate = "";
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
		public String Tpactivitytxt = "";
		public String Requiresconsultant = "";
				
		
		public void clear()
		{
			Sd_comp_plan_id = "";
			Outcomereas = "";
			Activoutcome = "";
			Activdone = "";
			Completeddate = "";
			Targetdate = "";
			Activityorder = "";
			Planactivity = "";
			Prevplanactiv = "";
			Prevplancompdate = "";
			Planhcp = "";
			Comphcp = "";
			Go_ptplact_id = "";
			Pkey = "";
			Act_consult = "";
			Act_consulttxt = "";
			Planhcptxt = "";
			Compplantxt = "";
			Targetdeadline = "";
			Nhsn = "";
			Pat_title = "";
			Hospnum = "";
			Pat_surname = "";
			Pat_forname = "";
			Act_status = "";
			Stat_reas = "";
			Remfromlist = "";
			Nextplanactiv = "";
			Nextplanactivcompdate = "";
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
			Tpactivitytxt = "";
			Requiresconsultant = "";
			
		}		
	}
		
		
	public final class Sd_comp_plan_lstFilter
	{			
		public String Sd_comp_plan_id = "";
		public String Outcomereas = "";
		public String Activoutcome = "";
		public String Activdone = "";
		public String Completeddate = "";
		public String Targetdate = "";
		public String Activityorder = "";
		public String Planactivity = "";
		public String Prevplanactiv = "";
		public String Prevplancompdate = "";
		public String Planhcp = "";
		public String Comphcp = "";
		public String Go_ptplact_id = "";
		public String Pkey = "";
		public String Act_consult = "";
		public String Act_consulttxt = "";
		public String Planhcptxt = "";
		public String Compplantxt = "";
		public String Targetdeadline = "";
		public String Nhsn = "";
		public String Pat_title = "";
		public String Hospnum = "";
		public String Pat_surname = "";
		public String Pat_forname = "";
		public String Act_status = "";
		public String Stat_reas = "";
		public String Remfromlist = "";
		public String Nextplanactiv = "";
		public String Nextplanactivcompdate = "";
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
		public String Tpactivitytxt = "";
		public String Requiresconsultant = "";
		
		public void clear()
		{				
			Sd_comp_plan_id = "";
			Outcomereas = "";
			Activoutcome = "";
			Activdone = "";
			Completeddate = "";
			Targetdate = "";
			Activityorder = "";
			Planactivity = "";
			Prevplanactiv = "";
			Prevplancompdate = "";
			Planhcp = "";
			Comphcp = "";
			Go_ptplact_id = "";
			Pkey = "";
			Act_consult = "";
			Act_consulttxt = "";
			Planhcptxt = "";
			Compplantxt = "";
			Targetdeadline = "";
			Nhsn = "";
			Pat_title = "";
			Hospnum = "";
			Pat_surname = "";
			Pat_forname = "";
			Act_status = "";
			Stat_reas = "";
			Remfromlist = "";
			Nextplanactiv = "";
			Nextplanactivcompdate = "";
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
			Tpactivitytxt = "";
			Requiresconsultant = "";
		}	
		public Sd_comp_plan_lstFilter cloneObject()
		{
			Sd_comp_plan_lstFilter newFilter = new Sd_comp_plan_lstFilter();
			
			newFilter.Sd_comp_plan_id = this.Sd_comp_plan_id;
			newFilter.Outcomereas = this.Outcomereas;
			newFilter.Activoutcome = this.Activoutcome;
			newFilter.Activdone = this.Activdone;
			newFilter.Completeddate = this.Completeddate;
			newFilter.Targetdate = this.Targetdate;
			newFilter.Activityorder = this.Activityorder;
			newFilter.Planactivity = this.Planactivity;
			newFilter.Prevplanactiv = this.Prevplanactiv;
			newFilter.Prevplancompdate = this.Prevplancompdate;
			newFilter.Planhcp = this.Planhcp;
			newFilter.Comphcp = this.Comphcp;
			newFilter.Go_ptplact_id = this.Go_ptplact_id;
			newFilter.Pkey = this.Pkey;
			newFilter.Act_consult = this.Act_consult;
			newFilter.Act_consulttxt = this.Act_consulttxt;
			newFilter.Planhcptxt = this.Planhcptxt;
			newFilter.Compplantxt = this.Compplantxt;
			newFilter.Targetdeadline = this.Targetdeadline;
			newFilter.Nhsn = this.Nhsn;
			newFilter.Pat_title = this.Pat_title;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Pat_surname = this.Pat_surname;
			newFilter.Pat_forname = this.Pat_forname;
			newFilter.Act_status = this.Act_status;
			newFilter.Stat_reas = this.Stat_reas;
			newFilter.Remfromlist = this.Remfromlist;
			newFilter.Nextplanactiv = this.Nextplanactiv;
			newFilter.Nextplanactivcompdate = this.Nextplanactivcompdate;
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
			newFilter.Tpactivitytxt = this.Tpactivitytxt;
			newFilter.Requiresconsultant = this.Requiresconsultant;
			
			return newFilter;
		}
	}
	public final class Sd_comp_plan_lstEditFilter
	{			
		public boolean IncludeSd_comp_plan_id = true;
		public boolean IncludeOutcomereas = true;
		public boolean IncludeActivoutcome = true;
		public boolean IncludeActivdone = true;
		public boolean IncludeCompleteddate = true;
		public boolean IncludeTargetdate = true;
		public boolean IncludeActivityorder = true;
		public boolean IncludePlanactivity = true;
		public boolean IncludePrevplanactiv = true;
		public boolean IncludePrevplancompdate = true;
		public boolean IncludePlanhcp = true;
		public boolean IncludeComphcp = true;
		public boolean IncludeGo_ptplact_id = true;
		public boolean IncludePkey = true;
		public boolean IncludeAct_consult = true;
		public boolean IncludeAct_consulttxt = true;
		public boolean IncludePlanhcptxt = true;
		public boolean IncludeCompplantxt = true;
		public boolean IncludeTargetdeadline = true;
		public boolean IncludeNhsn = true;
		public boolean IncludePat_title = true;
		public boolean IncludeHospnum = true;
		public boolean IncludePat_surname = true;
		public boolean IncludePat_forname = true;
		public boolean IncludeAct_status = true;
		public boolean IncludeStat_reas = true;
		public boolean IncludeRemfromlist = true;
		public boolean IncludeNextplanactiv = true;
		public boolean IncludeNextplanactivcompdate = true;
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
		public boolean IncludeTpactivitytxt = true;
		public boolean IncludeRequiresconsultant = true;
		
		public void includeAll()
		{				
			IncludeSd_comp_plan_id = true;
			IncludeOutcomereas = true;
			IncludeActivoutcome = true;
			IncludeActivdone = true;
			IncludeCompleteddate = true;
			IncludeTargetdate = true;
			IncludeActivityorder = true;
			IncludePlanactivity = true;
			IncludePrevplanactiv = true;
			IncludePrevplancompdate = true;
			IncludePlanhcp = true;
			IncludeComphcp = true;
			IncludeGo_ptplact_id = true;
			IncludePkey = true;
			IncludeAct_consult = true;
			IncludeAct_consulttxt = true;
			IncludePlanhcptxt = true;
			IncludeCompplantxt = true;
			IncludeTargetdeadline = true;
			IncludeNhsn = true;
			IncludePat_title = true;
			IncludeHospnum = true;
			IncludePat_surname = true;
			IncludePat_forname = true;
			IncludeAct_status = true;
			IncludeStat_reas = true;
			IncludeRemfromlist = true;
			IncludeNextplanactiv = true;
			IncludeNextplanactivcompdate = true;
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
			IncludeTpactivitytxt = true;
			IncludeRequiresconsultant = true;
		}	
		public void excludeAll()
		{				
			IncludeSd_comp_plan_id = false;
			IncludeOutcomereas = false;
			IncludeActivoutcome = false;
			IncludeActivdone = false;
			IncludeCompleteddate = false;
			IncludeTargetdate = false;
			IncludeActivityorder = false;
			IncludePlanactivity = false;
			IncludePrevplanactiv = false;
			IncludePrevplancompdate = false;
			IncludePlanhcp = false;
			IncludeComphcp = false;
			IncludeGo_ptplact_id = false;
			IncludePkey = false;
			IncludeAct_consult = false;
			IncludeAct_consulttxt = false;
			IncludePlanhcptxt = false;
			IncludeCompplantxt = false;
			IncludeTargetdeadline = false;
			IncludeNhsn = false;
			IncludePat_title = false;
			IncludeHospnum = false;
			IncludePat_surname = false;
			IncludePat_forname = false;
			IncludeAct_status = false;
			IncludeStat_reas = false;
			IncludeRemfromlist = false;
			IncludeNextplanactiv = false;
			IncludeNextplanactivcompdate = false;
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
			IncludeTpactivitytxt = false;
			IncludeRequiresconsultant = false;
		}
		public Sd_comp_plan_lstEditFilter cloneObject()
		{
			Sd_comp_plan_lstEditFilter newEditFilter = new Sd_comp_plan_lstEditFilter();
			
			newEditFilter.IncludeSd_comp_plan_id = this.IncludeSd_comp_plan_id;
			newEditFilter.IncludeOutcomereas = this.IncludeOutcomereas;
			newEditFilter.IncludeActivoutcome = this.IncludeActivoutcome;
			newEditFilter.IncludeActivdone = this.IncludeActivdone;
			newEditFilter.IncludeCompleteddate = this.IncludeCompleteddate;
			newEditFilter.IncludeTargetdate = this.IncludeTargetdate;
			newEditFilter.IncludeActivityorder = this.IncludeActivityorder;
			newEditFilter.IncludePlanactivity = this.IncludePlanactivity;
			newEditFilter.IncludePrevplanactiv = this.IncludePrevplanactiv;
			newEditFilter.IncludePrevplancompdate = this.IncludePrevplancompdate;
			newEditFilter.IncludePlanhcp = this.IncludePlanhcp;
			newEditFilter.IncludeComphcp = this.IncludeComphcp;
			newEditFilter.IncludeGo_ptplact_id = this.IncludeGo_ptplact_id;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeAct_consult = this.IncludeAct_consult;
			newEditFilter.IncludeAct_consulttxt = this.IncludeAct_consulttxt;
			newEditFilter.IncludePlanhcptxt = this.IncludePlanhcptxt;
			newEditFilter.IncludeCompplantxt = this.IncludeCompplantxt;
			newEditFilter.IncludeTargetdeadline = this.IncludeTargetdeadline;
			newEditFilter.IncludeNhsn = this.IncludeNhsn;
			newEditFilter.IncludePat_title = this.IncludePat_title;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludePat_surname = this.IncludePat_surname;
			newEditFilter.IncludePat_forname = this.IncludePat_forname;
			newEditFilter.IncludeAct_status = this.IncludeAct_status;
			newEditFilter.IncludeStat_reas = this.IncludeStat_reas;
			newEditFilter.IncludeRemfromlist = this.IncludeRemfromlist;
			newEditFilter.IncludeNextplanactiv = this.IncludeNextplanactiv;
			newEditFilter.IncludeNextplanactivcompdate = this.IncludeNextplanactivcompdate;
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
			newEditFilter.IncludeTpactivitytxt = this.IncludeTpactivitytxt;
			newEditFilter.IncludeRequiresconsultant = this.IncludeRequiresconsultant;
			
			return newEditFilter;
		}
	}
}
