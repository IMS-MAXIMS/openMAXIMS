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

public final class Sd_appt_hist implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_appt_hist.class);
	
	private Sd_appt_histFilter lastGetFilter = null;
	private final String serviceName = "SD_APPT_HIST";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_appt_histFilter Filter = new Sd_appt_histFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_appt_histEditFilter EditFilter = new Sd_appt_histEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_appt_histCollection DataCollection = new Sd_appt_histCollection();

	/**
	 * Creates a new Sd_appt_hist Data Transfer Object.
	 */ 
	public Sd_appt_hist(ims.dto.Connection connection)
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
	public Sd_appt_hist cloneObject()
	{
		Sd_appt_hist cloneObject = new Sd_appt_hist(Connection);
			
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
			cloneObject.DataCollection.get(index).Appt_id = DataCollection.get(x).Appt_id;
			cloneObject.DataCollection.get(index).Appt_hist_id = DataCollection.get(x).Appt_hist_id;
			cloneObject.DataCollection.get(index).Hist_cdate = DataCollection.get(x).Hist_cdate;
			cloneObject.DataCollection.get(index).First_flag = DataCollection.get(x).First_flag;
			cloneObject.DataCollection.get(index).Origsessd = DataCollection.get(x).Origsessd;
			cloneObject.DataCollection.get(index).Hist_dt = DataCollection.get(x).Hist_dt;
			cloneObject.DataCollection.get(index).Origsess = DataCollection.get(x).Origsess;
			cloneObject.DataCollection.get(index).Endsess = DataCollection.get(x).Endsess;
			cloneObject.DataCollection.get(index).Hcp_booking3 = DataCollection.get(x).Hcp_booking3;
			cloneObject.DataCollection.get(index).Hist_reas = DataCollection.get(x).Hist_reas;
			cloneObject.DataCollection.get(index).Hist_type = DataCollection.get(x).Hist_type;
			cloneObject.DataCollection.get(index).Appt_id3 = DataCollection.get(x).Appt_id3;
			cloneObject.DataCollection.get(index).Hist_reastxt = DataCollection.get(x).Hist_reastxt;
			cloneObject.DataCollection.get(index).Hist_typetxt = DataCollection.get(x).Hist_typetxt;
							
			
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
		return "Sd_appt_hist.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt_hist.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_appt_hist.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt_hist.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt_hist.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt_hist.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_appt_hist.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_appt_hist.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt_hist.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_appt_hist.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_appt_hist.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_appt_hist.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_appt_hist.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_appt_hist.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt_hist.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_appt_hist.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_appt_hist.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_appt_hist.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_appt_hist.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_appt_hist.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt_hist.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_appt_hist.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_appt_hist.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt_hist.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_appt_hist.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_appt_hist.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_appt_hist.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_appt_hist nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_appt_hist After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_appt_hist After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_appt_hist.List");
							
		listInProgress = true;	
		logger.debug("Sd_appt_hist Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_appt_hist After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_appt_hist After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_appt_histFilter filter)
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
		
		if(Filter.Appt_id != null && filter.Appt_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_id);
		}
		
		if(Filter.Appt_hist_id != null && filter.Appt_hist_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_HIST_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_hist_id);
		}
		
		if(Filter.Hist_cdate != null && filter.Hist_cdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HIST_CDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hist_cdate);
		}
		
		if(Filter.First_flag != null && filter.First_flag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FIRST_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.First_flag);
		}
		
		if(Filter.Origsessd != null && filter.Origsessd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ORIGSESSD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Origsessd);
		}
		
		if(Filter.Hist_dt != null && filter.Hist_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HIST_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hist_dt);
		}
		
		if(Filter.Origsess != null && filter.Origsess.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ORIGSESS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Origsess);
		}
		
		if(Filter.Endsess != null && filter.Endsess.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ENDSESS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Endsess);
		}
		
		if(Filter.Hcp_booking3 != null && filter.Hcp_booking3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HCP_BOOKING3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_booking3);
		}
		
		if(Filter.Hist_reas != null && filter.Hist_reas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HIST_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hist_reas);
		}
		
		if(Filter.Hist_type != null && filter.Hist_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HIST_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hist_type);
		}
		
		if(Filter.Appt_id3 != null && filter.Appt_id3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_ID3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_id3);
		}
		
		if(Filter.Hist_reastxt != null && filter.Hist_reastxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HIST_REASTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hist_reastxt);
		}
		
		if(Filter.Hist_typetxt != null && filter.Hist_typetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HIST_TYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hist_typetxt);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_appt_histRecord data = (Sd_appt_histRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeAppt_head_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_HEAD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_head_id));
		}
		
		if(EditFilter.IncludeAppt_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_id));
		}
		
		if(EditFilter.IncludeAppt_hist_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_HIST_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_hist_id));
		}
		
		if(EditFilter.IncludeHist_cdate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HIST_CDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hist_cdate));
		}
		
		if(EditFilter.IncludeFirst_flag)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FIRST_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.First_flag));
		}
		
		if(EditFilter.IncludeOrigsessd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ORIGSESSD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Origsessd));
		}
		
		if(EditFilter.IncludeHist_dt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HIST_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hist_dt));
		}
		
		if(EditFilter.IncludeOrigsess)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ORIGSESS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Origsess));
		}
		
		if(EditFilter.IncludeEndsess)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ENDSESS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Endsess));
		}
		
		if(EditFilter.IncludeHcp_booking3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HCP_BOOKING3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_booking3));
		}
		
		if(EditFilter.IncludeHist_reas)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HIST_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hist_reas));
		}
		
		if(EditFilter.IncludeHist_type)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HIST_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hist_type));
		}
		
		if(EditFilter.IncludeAppt_id3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_ID3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_id3));
		}
		
		if(EditFilter.IncludeHist_reastxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HIST_REASTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hist_reastxt));
		}
		
		if(EditFilter.IncludeHist_typetxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HIST_TYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hist_typetxt));
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
			Sd_appt_histRecord record = new Sd_appt_histRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HEAD_ID"));
			record.Appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_ID"));
			record.Appt_hist_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HIST_ID"));
			record.Hist_cdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HIST_CDATE"));
			record.First_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_FLAG"));
			record.Origsessd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORIGSESSD"));
			record.Hist_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HIST_DT"));
			record.Origsess = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORIGSESS"));
			record.Endsess = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENDSESS"));
			record.Hcp_booking3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_BOOKING3"));
			record.Hist_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HIST_REAS"));
			record.Hist_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HIST_TYPE"));
			record.Appt_id3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_ID3"));
			record.Hist_reastxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HIST_REASTXT"));
			record.Hist_typetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HIST_TYPETXT"));
									
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
			Sd_appt_histRecord record = new Sd_appt_histRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Appt_head_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HEAD_ID"));
			record.Appt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_ID"));
			record.Appt_hist_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_HIST_ID"));
			record.Hist_cdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HIST_CDATE"));
			record.First_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRST_FLAG"));
			record.Origsessd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORIGSESSD"));
			record.Hist_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HIST_DT"));
			record.Origsess = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORIGSESS"));
			record.Endsess = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENDSESS"));
			record.Hcp_booking3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_BOOKING3"));
			record.Hist_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HIST_REAS"));
			record.Hist_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HIST_TYPE"));
			record.Appt_id3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_ID3"));
			record.Hist_reastxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HIST_REASTXT"));
			record.Hist_typetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HIST_TYPETXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Sd_appt_histCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_appt_histRecord newRecord = new Sd_appt_histRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_appt_histRecord record)
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
		public Sd_appt_histRecord get(int index)
		{
			return (Sd_appt_histRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_appt_histRecord
	{
		public String Appt_head_id = "";
		public String Appt_id = "";
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
		public String Hist_reastxt = "";
		public String Hist_typetxt = "";
				
		
		public void clear()
		{
			Appt_head_id = "";
			Appt_id = "";
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
			Hist_reastxt = "";
			Hist_typetxt = "";
			
		}		
	}
		
		
	public final class Sd_appt_histFilter
	{			
		public String Appt_head_id = "";
		public String Appt_id = "";
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
		public String Hist_reastxt = "";
		public String Hist_typetxt = "";
		
		public void clear()
		{				
			Appt_head_id = "";
			Appt_id = "";
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
			Hist_reastxt = "";
			Hist_typetxt = "";
		}	
		public Sd_appt_histFilter cloneObject()
		{
			Sd_appt_histFilter newFilter = new Sd_appt_histFilter();
			
			newFilter.Appt_head_id = this.Appt_head_id;
			newFilter.Appt_id = this.Appt_id;
			newFilter.Appt_hist_id = this.Appt_hist_id;
			newFilter.Hist_cdate = this.Hist_cdate;
			newFilter.First_flag = this.First_flag;
			newFilter.Origsessd = this.Origsessd;
			newFilter.Hist_dt = this.Hist_dt;
			newFilter.Origsess = this.Origsess;
			newFilter.Endsess = this.Endsess;
			newFilter.Hcp_booking3 = this.Hcp_booking3;
			newFilter.Hist_reas = this.Hist_reas;
			newFilter.Hist_type = this.Hist_type;
			newFilter.Appt_id3 = this.Appt_id3;
			newFilter.Hist_reastxt = this.Hist_reastxt;
			newFilter.Hist_typetxt = this.Hist_typetxt;
			
			return newFilter;
		}
	}
	public final class Sd_appt_histEditFilter
	{			
		public boolean IncludeAppt_head_id = true;
		public boolean IncludeAppt_id = true;
		public boolean IncludeAppt_hist_id = true;
		public boolean IncludeHist_cdate = true;
		public boolean IncludeFirst_flag = true;
		public boolean IncludeOrigsessd = true;
		public boolean IncludeHist_dt = true;
		public boolean IncludeOrigsess = true;
		public boolean IncludeEndsess = true;
		public boolean IncludeHcp_booking3 = true;
		public boolean IncludeHist_reas = true;
		public boolean IncludeHist_type = true;
		public boolean IncludeAppt_id3 = true;
		public boolean IncludeHist_reastxt = true;
		public boolean IncludeHist_typetxt = true;
		
		public void includeAll()
		{				
			IncludeAppt_head_id = true;
			IncludeAppt_id = true;
			IncludeAppt_hist_id = true;
			IncludeHist_cdate = true;
			IncludeFirst_flag = true;
			IncludeOrigsessd = true;
			IncludeHist_dt = true;
			IncludeOrigsess = true;
			IncludeEndsess = true;
			IncludeHcp_booking3 = true;
			IncludeHist_reas = true;
			IncludeHist_type = true;
			IncludeAppt_id3 = true;
			IncludeHist_reastxt = true;
			IncludeHist_typetxt = true;
		}	
		public void excludeAll()
		{				
			IncludeAppt_head_id = false;
			IncludeAppt_id = false;
			IncludeAppt_hist_id = false;
			IncludeHist_cdate = false;
			IncludeFirst_flag = false;
			IncludeOrigsessd = false;
			IncludeHist_dt = false;
			IncludeOrigsess = false;
			IncludeEndsess = false;
			IncludeHcp_booking3 = false;
			IncludeHist_reas = false;
			IncludeHist_type = false;
			IncludeAppt_id3 = false;
			IncludeHist_reastxt = false;
			IncludeHist_typetxt = false;
		}
		public Sd_appt_histEditFilter cloneObject()
		{
			Sd_appt_histEditFilter newEditFilter = new Sd_appt_histEditFilter();
			
			newEditFilter.IncludeAppt_head_id = this.IncludeAppt_head_id;
			newEditFilter.IncludeAppt_id = this.IncludeAppt_id;
			newEditFilter.IncludeAppt_hist_id = this.IncludeAppt_hist_id;
			newEditFilter.IncludeHist_cdate = this.IncludeHist_cdate;
			newEditFilter.IncludeFirst_flag = this.IncludeFirst_flag;
			newEditFilter.IncludeOrigsessd = this.IncludeOrigsessd;
			newEditFilter.IncludeHist_dt = this.IncludeHist_dt;
			newEditFilter.IncludeOrigsess = this.IncludeOrigsess;
			newEditFilter.IncludeEndsess = this.IncludeEndsess;
			newEditFilter.IncludeHcp_booking3 = this.IncludeHcp_booking3;
			newEditFilter.IncludeHist_reas = this.IncludeHist_reas;
			newEditFilter.IncludeHist_type = this.IncludeHist_type;
			newEditFilter.IncludeAppt_id3 = this.IncludeAppt_id3;
			newEditFilter.IncludeHist_reastxt = this.IncludeHist_reastxt;
			newEditFilter.IncludeHist_typetxt = this.IncludeHist_typetxt;
			
			return newEditFilter;
		}
	}
}
