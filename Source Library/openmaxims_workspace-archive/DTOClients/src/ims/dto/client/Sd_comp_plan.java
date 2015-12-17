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

public final class Sd_comp_plan implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_comp_plan.class);
	
	private Sd_comp_planFilter lastGetFilter = null;
	private final String serviceName = "SD_COMP_PLAN";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_comp_planFilter Filter = new Sd_comp_planFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_comp_planEditFilter EditFilter = new Sd_comp_planEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_comp_planCollection DataCollection = new Sd_comp_planCollection();

	/**
	 * Creates a new Sd_comp_plan Data Transfer Object.
	 */ 
	public Sd_comp_plan(ims.dto.Connection connection)
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
	public Sd_comp_plan cloneObject()
	{
		Sd_comp_plan cloneObject = new Sd_comp_plan(Connection);
			
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
			cloneObject.DataCollection.get(index).Actind = DataCollection.get(x).Actind;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Planhcp = DataCollection.get(x).Planhcp;
			cloneObject.DataCollection.get(index).Comphcp = DataCollection.get(x).Comphcp;
			cloneObject.DataCollection.get(index).Targetdeadline = DataCollection.get(x).Targetdeadline;
			cloneObject.DataCollection.get(index).Go_ptplactid = DataCollection.get(x).Go_ptplactid;
			cloneObject.DataCollection.get(index).Plandelayed = DataCollection.get(x).Plandelayed;
			cloneObject.DataCollection.get(index).Remfromlist = DataCollection.get(x).Remfromlist;
			cloneObject.DataCollection.get(index).Act_stat = DataCollection.get(x).Act_stat;
			cloneObject.DataCollection.get(index).Act_statreas = DataCollection.get(x).Act_statreas;
			cloneObject.DataCollection.get(index).Act_consult = DataCollection.get(x).Act_consult;
			cloneObject.DataCollection.get(index).Act_consulttxt = DataCollection.get(x).Act_consulttxt;
							
			
			for(int iSeqno = 0; iSeqno < DataCollection.get(x).SeqnoCollection.count(); iSeqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnoCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Seqno = DataCollection.get(x).SeqnoCollection.get(iSeqno).Seqno;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Mouldroomnotes = DataCollection.get(x).SeqnoCollection.get(iSeqno).Mouldroomnotes;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Completinghcp = DataCollection.get(x).SeqnoCollection.get(iSeqno).Completinghcp;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Comp_perf = DataCollection.get(x).SeqnoCollection.get(iSeqno).Comp_perf;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Hcp_plan = DataCollection.get(x).SeqnoCollection.get(iSeqno).Hcp_plan;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Outcomereas = DataCollection.get(x).SeqnoCollection.get(iSeqno).Outcomereas;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Activoutcome = DataCollection.get(x).SeqnoCollection.get(iSeqno).Activoutcome;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Activdone = DataCollection.get(x).SeqnoCollection.get(iSeqno).Activdone;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Completeddate = DataCollection.get(x).SeqnoCollection.get(iSeqno).Completeddate;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Targetdate = DataCollection.get(x).SeqnoCollection.get(iSeqno).Targetdate;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Activityorder = DataCollection.get(x).SeqnoCollection.get(iSeqno).Activityorder;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Planactivity = DataCollection.get(x).SeqnoCollection.get(iSeqno).Planactivity;
										
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
		return "Sd_comp_plan.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_comp_plan.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_comp_plan.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_comp_plan.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_comp_plan.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_comp_plan.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_comp_plan.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_comp_plan.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_comp_plan.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_comp_plan.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_comp_plan.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_comp_plan.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_comp_plan.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_comp_plan.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_comp_plan.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_comp_plan.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_comp_plan.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_comp_plan.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_comp_plan.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_comp_plan nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_comp_plan After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_comp_plan After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_comp_plan.List");
							
		listInProgress = true;	
		logger.debug("Sd_comp_plan Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_comp_plan After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_comp_plan After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_comp_planFilter filter)
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
		
		if(Filter.Actind != null && filter.Actind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Actind);
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
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
		
		if(Filter.Targetdeadline != null && filter.Targetdeadline.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TARGETDEADLINE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Targetdeadline);
		}
		
		if(Filter.Go_ptplactid != null && filter.Go_ptplactid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GO_PTPLACTID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Go_ptplactid);
		}
		
		if(Filter.Plandelayed != null && filter.Plandelayed.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PLANDELAYED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Plandelayed);
		}
		
		if(Filter.Remfromlist != null && filter.Remfromlist.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REMFROMLIST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Remfromlist);
		}
		
		if(Filter.Act_stat != null && filter.Act_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_stat);
		}
		
		if(Filter.Act_statreas != null && filter.Act_statreas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_STATREAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_statreas);
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
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_comp_planRecord data = (Sd_comp_planRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeSd_comp_plan_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SD_COMP_PLAN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sd_comp_plan_id));
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
		
		if(EditFilter.IncludeActind)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Actind));
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
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
		
		if(EditFilter.IncludeTargetdeadline)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TARGETDEADLINE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Targetdeadline));
		}
		
		if(EditFilter.IncludeGo_ptplactid)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GO_PTPLACTID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Go_ptplactid));
		}
		
		if(EditFilter.IncludePlandelayed)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PLANDELAYED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Plandelayed));
		}
		
		if(EditFilter.IncludeRemfromlist)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REMFROMLIST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Remfromlist));
		}
		
		if(EditFilter.IncludeAct_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_stat));
		}
		
		if(EditFilter.IncludeAct_statreas)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_STATREAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_statreas));
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
		
		
		for(int x = 0; x < data.SeqnoCollection.count(); x++)
		{
			Sd_comp_planSeqnoRecord rgRecord = (Sd_comp_planSeqnoRecord)data.SeqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MOULDROOMNOTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mouldroomnotes));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("COMPLETINGHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Completinghcp));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("COMP_PERF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Comp_perf));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HCP_PLAN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Hcp_plan));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OUTCOMEREAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Outcomereas));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIVOUTCOME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Activoutcome));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIVDONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Activdone));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("COMPLETEDDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Completeddate));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TARGETDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Targetdate));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIVITYORDER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Activityorder));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PLANACTIVITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Planactivity));
			
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
			Sd_comp_planRecord record = new Sd_comp_planRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Sd_comp_plan_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_COMP_PLAN_ID"));
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
			record.Actind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIND"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Planhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLANHCP"));
			record.Comphcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPHCP"));
			record.Targetdeadline = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TARGETDEADLINE"));
			record.Go_ptplactid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_PTPLACTID"));
			record.Plandelayed = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLANDELAYED"));
			record.Remfromlist = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REMFROMLIST"));
			record.Act_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STAT"));
			record.Act_statreas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STATREAS"));
			record.Act_consult = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULT"));
			record.Act_consulttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULTTXT"));
									
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
			Sd_comp_planRecord record = new Sd_comp_planRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Sd_comp_plan_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_COMP_PLAN_ID"));
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
			record.Actind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIND"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Planhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLANHCP"));
			record.Comphcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPHCP"));
			record.Targetdeadline = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TARGETDEADLINE"));
			record.Go_ptplactid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_PTPLACTID"));
			record.Plandelayed = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLANDELAYED"));
			record.Remfromlist = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REMFROMLIST"));
			record.Act_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STAT"));
			record.Act_statreas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STATREAS"));
			record.Act_consult = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULT"));
			record.Act_consulttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_CONSULTTXT"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					record.SeqnoCollection.add();
			
									
			rgCount = record.SeqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					{
						Sd_comp_planSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("mouldroomnotes"))
					{
						Sd_comp_planSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Mouldroomnotes = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("completinghcp"))
					{
						Sd_comp_planSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Completinghcp = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("comp_perf"))
					{
						Sd_comp_planSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Comp_perf = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("hcp_plan"))
					{
						Sd_comp_planSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Hcp_plan = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("outcomereas"))
					{
						Sd_comp_planSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Outcomereas = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("activoutcome"))
					{
						Sd_comp_planSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Activoutcome = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("activdone"))
					{
						Sd_comp_planSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Activdone = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("completeddate"))
					{
						Sd_comp_planSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Completeddate = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("targetdate"))
					{
						Sd_comp_planSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Targetdate = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("activityorder"))
					{
						Sd_comp_planSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Activityorder = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("planactivity"))
					{
						Sd_comp_planSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Planactivity = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Sd_comp_planCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_comp_planRecord newRecord = new Sd_comp_planRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_comp_planRecord record)
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
		public Sd_comp_planRecord get(int index)
		{
			return (Sd_comp_planRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_comp_planRecord
	{
		public String Sd_comp_plan_id = "";
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
		public String Actind = "";
		public String Tstp = "";
		public String Planhcp = "";
		public String Comphcp = "";
		public String Targetdeadline = "";
		public String Go_ptplactid = "";
		public String Plandelayed = "";
		public String Remfromlist = "";
		public String Act_stat = "";
		public String Act_statreas = "";
		public String Act_consult = "";
		public String Act_consulttxt = "";
		
		public Sd_comp_planSeqnoCollection SeqnoCollection = new Sd_comp_planSeqnoCollection();		
		
		public void clear()
		{
			Sd_comp_plan_id = "";
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
			Actind = "";
			Tstp = "";
			Planhcp = "";
			Comphcp = "";
			Targetdeadline = "";
			Go_ptplactid = "";
			Plandelayed = "";
			Remfromlist = "";
			Act_stat = "";
			Act_statreas = "";
			Act_consult = "";
			Act_consulttxt = "";
			
			SeqnoCollection.clear();
		}		
	}
	
	public final class Sd_comp_planSeqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_comp_planSeqnoRecord newRecord = new Sd_comp_planSeqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_comp_planSeqnoRecord record)
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
		public Sd_comp_planSeqnoRecord get(int index)
		{
			return (Sd_comp_planSeqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Sd_comp_planSeqnoRecord
	{
		public String Seqno = "";
		public String Mouldroomnotes = "";
		public String Completinghcp = "";
		public String Comp_perf = "";
		public String Hcp_plan = "";
		public String Outcomereas = "";
		public String Activoutcome = "";
		public String Activdone = "";
		public String Completeddate = "";
		public String Targetdate = "";
		public String Activityorder = "";
		public String Planactivity = "";
		
		public void clear()
		{
			Seqno = "";
			Mouldroomnotes = "";
			Completinghcp = "";
			Comp_perf = "";
			Hcp_plan = "";
			Outcomereas = "";
			Activoutcome = "";
			Activdone = "";
			Completeddate = "";
			Targetdate = "";
			Activityorder = "";
			Planactivity = "";
			
		}
	}	
	public final class Sd_comp_planFilter
	{			
		public String Sd_comp_plan_id = "";
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
		public String Actind = "";
		public String Tstp = "";
		public String Planhcp = "";
		public String Comphcp = "";
		public String Targetdeadline = "";
		public String Go_ptplactid = "";
		public String Plandelayed = "";
		public String Remfromlist = "";
		public String Act_stat = "";
		public String Act_statreas = "";
		public String Act_consult = "";
		public String Act_consulttxt = "";
		
		public void clear()
		{				
			Sd_comp_plan_id = "";
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
			Actind = "";
			Tstp = "";
			Planhcp = "";
			Comphcp = "";
			Targetdeadline = "";
			Go_ptplactid = "";
			Plandelayed = "";
			Remfromlist = "";
			Act_stat = "";
			Act_statreas = "";
			Act_consult = "";
			Act_consulttxt = "";
		}	
		public Sd_comp_planFilter cloneObject()
		{
			Sd_comp_planFilter newFilter = new Sd_comp_planFilter();
			
			newFilter.Sd_comp_plan_id = this.Sd_comp_plan_id;
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
			newFilter.Actind = this.Actind;
			newFilter.Tstp = this.Tstp;
			newFilter.Planhcp = this.Planhcp;
			newFilter.Comphcp = this.Comphcp;
			newFilter.Targetdeadline = this.Targetdeadline;
			newFilter.Go_ptplactid = this.Go_ptplactid;
			newFilter.Plandelayed = this.Plandelayed;
			newFilter.Remfromlist = this.Remfromlist;
			newFilter.Act_stat = this.Act_stat;
			newFilter.Act_statreas = this.Act_statreas;
			newFilter.Act_consult = this.Act_consult;
			newFilter.Act_consulttxt = this.Act_consulttxt;
			
			return newFilter;
		}
	}
	public final class Sd_comp_planEditFilter
	{			
		public boolean IncludeSd_comp_plan_id = true;
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
		public boolean IncludeActind = true;
		public boolean IncludeTstp = true;
		public boolean IncludePlanhcp = true;
		public boolean IncludeComphcp = true;
		public boolean IncludeTargetdeadline = true;
		public boolean IncludeGo_ptplactid = true;
		public boolean IncludePlandelayed = true;
		public boolean IncludeRemfromlist = true;
		public boolean IncludeAct_stat = true;
		public boolean IncludeAct_statreas = true;
		public boolean IncludeAct_consult = true;
		public boolean IncludeAct_consulttxt = true;
		
		public void includeAll()
		{				
			IncludeSd_comp_plan_id = true;
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
			IncludeActind = true;
			IncludeTstp = true;
			IncludePlanhcp = true;
			IncludeComphcp = true;
			IncludeTargetdeadline = true;
			IncludeGo_ptplactid = true;
			IncludePlandelayed = true;
			IncludeRemfromlist = true;
			IncludeAct_stat = true;
			IncludeAct_statreas = true;
			IncludeAct_consult = true;
			IncludeAct_consulttxt = true;
		}	
		public void excludeAll()
		{				
			IncludeSd_comp_plan_id = false;
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
			IncludeActind = false;
			IncludeTstp = false;
			IncludePlanhcp = false;
			IncludeComphcp = false;
			IncludeTargetdeadline = false;
			IncludeGo_ptplactid = false;
			IncludePlandelayed = false;
			IncludeRemfromlist = false;
			IncludeAct_stat = false;
			IncludeAct_statreas = false;
			IncludeAct_consult = false;
			IncludeAct_consulttxt = false;
		}
		public Sd_comp_planEditFilter cloneObject()
		{
			Sd_comp_planEditFilter newEditFilter = new Sd_comp_planEditFilter();
			
			newEditFilter.IncludeSd_comp_plan_id = this.IncludeSd_comp_plan_id;
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
			newEditFilter.IncludeActind = this.IncludeActind;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludePlanhcp = this.IncludePlanhcp;
			newEditFilter.IncludeComphcp = this.IncludeComphcp;
			newEditFilter.IncludeTargetdeadline = this.IncludeTargetdeadline;
			newEditFilter.IncludeGo_ptplactid = this.IncludeGo_ptplactid;
			newEditFilter.IncludePlandelayed = this.IncludePlandelayed;
			newEditFilter.IncludeRemfromlist = this.IncludeRemfromlist;
			newEditFilter.IncludeAct_stat = this.IncludeAct_stat;
			newEditFilter.IncludeAct_statreas = this.IncludeAct_statreas;
			newEditFilter.IncludeAct_consult = this.IncludeAct_consult;
			newEditFilter.IncludeAct_consulttxt = this.IncludeAct_consulttxt;
			
			return newEditFilter;
		}
	}
}
