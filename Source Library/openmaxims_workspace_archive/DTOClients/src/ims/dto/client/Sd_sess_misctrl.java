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

public final class Sd_sess_misctrl implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_sess_misctrl.class);
	
	private Sd_sess_misctrlFilter lastGetFilter = null;
	private final String serviceName = "SD_SESS_MISCTRL";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_sess_misctrlFilter Filter = new Sd_sess_misctrlFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_sess_misctrlEditFilter EditFilter = new Sd_sess_misctrlEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_sess_misctrlCollection DataCollection = new Sd_sess_misctrlCollection();

	/**
	 * Creates a new Sd_sess_misctrl Data Transfer Object.
	 */ 
	public Sd_sess_misctrl(ims.dto.Connection connection)
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
	public Sd_sess_misctrl cloneObject()
	{
		Sd_sess_misctrl cloneObject = new Sd_sess_misctrl(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Max_apps = DataCollection.get(x).Max_apps;
			cloneObject.DataCollection.get(index).Rem_apps = DataCollection.get(x).Rem_apps;
			cloneObject.DataCollection.get(index).Session_id = DataCollection.get(x).Session_id;
			cloneObject.DataCollection.get(index).Sessiond_id = DataCollection.get(x).Sessiond_id;
			cloneObject.DataCollection.get(index).Appt_stat = DataCollection.get(x).Appt_stat;
			cloneObject.DataCollection.get(index).Sess_mcnm = DataCollection.get(x).Sess_mcnm;
			cloneObject.DataCollection.get(index).Sess_lcnm = DataCollection.get(x).Sess_lcnm;
			cloneObject.DataCollection.get(index).Mc_id = DataCollection.get(x).Mc_id;
							
			
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
		return "Sd_sess_misctrl.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_misctrl.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_sess_misctrl.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_misctrl.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_misctrl.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_misctrl.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_sess_misctrl.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_sess_misctrl.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_misctrl.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_sess_misctrl.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_sess_misctrl.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_sess_misctrl.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_sess_misctrl.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_sess_misctrl.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_misctrl.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_sess_misctrl.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_sess_misctrl.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_sess_misctrl.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_sess_misctrl.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_sess_misctrl.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_misctrl.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_sess_misctrl.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_sess_misctrl.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_misctrl.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_sess_misctrl.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_sess_misctrl.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_sess_misctrl.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_sess_misctrl nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_sess_misctrl After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_sess_misctrl After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_misctrl.List");
							
		listInProgress = true;	
		logger.debug("Sd_sess_misctrl Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_sess_misctrl After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_sess_misctrl After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_sess_misctrlFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Max_apps != null && filter.Max_apps.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MAX_APPS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Max_apps);
		}
		
		if(Filter.Rem_apps != null && filter.Rem_apps.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REM_APPS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rem_apps);
		}
		
		if(Filter.Session_id != null && filter.Session_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SESSION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Session_id);
		}
		
		if(Filter.Sessiond_id != null && filter.Sessiond_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SESSIOND_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sessiond_id);
		}
		
		if(Filter.Appt_stat != null && filter.Appt_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appt_stat);
		}
		
		if(Filter.Sess_mcnm != null && filter.Sess_mcnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SESS_MCNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sess_mcnm);
		}
		
		if(Filter.Sess_lcnm != null && filter.Sess_lcnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SESS_LCNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sess_lcnm);
		}
		
		if(Filter.Mc_id != null && filter.Mc_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_id);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_sess_misctrlRecord data = (Sd_sess_misctrlRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeMax_apps)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MAX_APPS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Max_apps));
		}
		
		if(EditFilter.IncludeRem_apps)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REM_APPS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rem_apps));
		}
		
		if(EditFilter.IncludeSession_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESSION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Session_id));
		}
		
		if(EditFilter.IncludeSessiond_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESSIOND_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sessiond_id));
		}
		
		if(EditFilter.IncludeAppt_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appt_stat));
		}
		
		if(EditFilter.IncludeSess_mcnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESS_MCNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sess_mcnm));
		}
		
		if(EditFilter.IncludeSess_lcnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESS_LCNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sess_lcnm));
		}
		
		if(EditFilter.IncludeMc_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_id));
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
			Sd_sess_misctrlRecord record = new Sd_sess_misctrlRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Max_apps = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAX_APPS"));
			record.Rem_apps = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REM_APPS"));
			record.Session_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSION_ID"));
			record.Sessiond_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSIOND_ID"));
			record.Appt_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_STAT"));
			record.Sess_mcnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_MCNM"));
			record.Sess_lcnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_LCNM"));
			record.Mc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID"));
									
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
			Sd_sess_misctrlRecord record = new Sd_sess_misctrlRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Max_apps = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAX_APPS"));
			record.Rem_apps = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REM_APPS"));
			record.Session_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSION_ID"));
			record.Sessiond_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSIOND_ID"));
			record.Appt_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPT_STAT"));
			record.Sess_mcnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_MCNM"));
			record.Sess_lcnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_LCNM"));
			record.Mc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Sd_sess_misctrlCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_sess_misctrlRecord newRecord = new Sd_sess_misctrlRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_sess_misctrlRecord record)
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
		public Sd_sess_misctrlRecord get(int index)
		{
			return (Sd_sess_misctrlRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_sess_misctrlRecord
	{
		public String Max_apps = "";
		public String Rem_apps = "";
		public String Session_id = "";
		public String Sessiond_id = "";
		public String Appt_stat = "";
		public String Sess_mcnm = "";
		public String Sess_lcnm = "";
		public String Mc_id = "";
				
		
		public void clear()
		{
			Max_apps = "";
			Rem_apps = "";
			Session_id = "";
			Sessiond_id = "";
			Appt_stat = "";
			Sess_mcnm = "";
			Sess_lcnm = "";
			Mc_id = "";
			
		}		
	}
		
		
	public final class Sd_sess_misctrlFilter
	{			
		public String Max_apps = "";
		public String Rem_apps = "";
		public String Session_id = "";
		public String Sessiond_id = "";
		public String Appt_stat = "";
		public String Sess_mcnm = "";
		public String Sess_lcnm = "";
		public String Mc_id = "";
		
		public void clear()
		{				
			Max_apps = "";
			Rem_apps = "";
			Session_id = "";
			Sessiond_id = "";
			Appt_stat = "";
			Sess_mcnm = "";
			Sess_lcnm = "";
			Mc_id = "";
		}	
		public Sd_sess_misctrlFilter cloneObject()
		{
			Sd_sess_misctrlFilter newFilter = new Sd_sess_misctrlFilter();
			
			newFilter.Max_apps = this.Max_apps;
			newFilter.Rem_apps = this.Rem_apps;
			newFilter.Session_id = this.Session_id;
			newFilter.Sessiond_id = this.Sessiond_id;
			newFilter.Appt_stat = this.Appt_stat;
			newFilter.Sess_mcnm = this.Sess_mcnm;
			newFilter.Sess_lcnm = this.Sess_lcnm;
			newFilter.Mc_id = this.Mc_id;
			
			return newFilter;
		}
	}
	public final class Sd_sess_misctrlEditFilter
	{			
		public boolean IncludeMax_apps = true;
		public boolean IncludeRem_apps = true;
		public boolean IncludeSession_id = true;
		public boolean IncludeSessiond_id = true;
		public boolean IncludeAppt_stat = true;
		public boolean IncludeSess_mcnm = true;
		public boolean IncludeSess_lcnm = true;
		public boolean IncludeMc_id = true;
		
		public void includeAll()
		{				
			IncludeMax_apps = true;
			IncludeRem_apps = true;
			IncludeSession_id = true;
			IncludeSessiond_id = true;
			IncludeAppt_stat = true;
			IncludeSess_mcnm = true;
			IncludeSess_lcnm = true;
			IncludeMc_id = true;
		}	
		public void excludeAll()
		{				
			IncludeMax_apps = false;
			IncludeRem_apps = false;
			IncludeSession_id = false;
			IncludeSessiond_id = false;
			IncludeAppt_stat = false;
			IncludeSess_mcnm = false;
			IncludeSess_lcnm = false;
			IncludeMc_id = false;
		}
		public Sd_sess_misctrlEditFilter cloneObject()
		{
			Sd_sess_misctrlEditFilter newEditFilter = new Sd_sess_misctrlEditFilter();
			
			newEditFilter.IncludeMax_apps = this.IncludeMax_apps;
			newEditFilter.IncludeRem_apps = this.IncludeRem_apps;
			newEditFilter.IncludeSession_id = this.IncludeSession_id;
			newEditFilter.IncludeSessiond_id = this.IncludeSessiond_id;
			newEditFilter.IncludeAppt_stat = this.IncludeAppt_stat;
			newEditFilter.IncludeSess_mcnm = this.IncludeSess_mcnm;
			newEditFilter.IncludeSess_lcnm = this.IncludeSess_lcnm;
			newEditFilter.IncludeMc_id = this.IncludeMc_id;
			
			return newEditFilter;
		}
	}
}
