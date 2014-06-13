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

public final class User implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(User.class);
	
	private UserFilter lastGetFilter = null;
	private final String serviceName = "USER";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public UserFilter Filter = new UserFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public UserEditFilter EditFilter = new UserEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public UserCollection DataCollection = new UserCollection();

	/**
	 * Creates a new User Data Transfer Object.
	 */ 
	public User(ims.dto.Connection connection)
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
	public User cloneObject()
	{
		User cloneObject = new User(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).User = DataCollection.get(x).User;
			cloneObject.DataCollection.get(index).Hpcd = DataCollection.get(x).Hpcd;
			cloneObject.DataCollection.get(index).Pass = DataCollection.get(x).Pass;
			cloneObject.DataCollection.get(index).Ntyp = DataCollection.get(x).Ntyp;
			cloneObject.DataCollection.get(index).Maxims = DataCollection.get(x).Maxims;
			cloneObject.DataCollection.get(index).Opt = DataCollection.get(x).Opt;
			cloneObject.DataCollection.get(index).Dateauthfr = DataCollection.get(x).Dateauthfr;
			cloneObject.DataCollection.get(index).Dateauthto = DataCollection.get(x).Dateauthto;
			cloneObject.DataCollection.get(index).Daysleft = DataCollection.get(x).Daysleft;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "1";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "User.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.User.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.User.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.User.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.User.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.User.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.User.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.User.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.User.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.User.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.User.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.User.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.User.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.User.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.User.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.User.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.User.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.User.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.User.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.User.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.User.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.User.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.User.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.User.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.User.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.User.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.User.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("User nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("User After NextList ");
				
		decodeNASMessage();		
		logger.debug("User After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.User.List");
							
		listInProgress = true;	
		logger.debug("User Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("User After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("User After Parse Message");
		
						
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
	private String encodeNASFilter(UserFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.User != null && filter.User.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("USER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.User);
		}
		
		if(Filter.Hpcd != null && filter.Hpcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hpcd);
		}
		
		if(Filter.Pass != null && filter.Pass.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PASS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pass);
		}
		
		if(Filter.Ntyp != null && filter.Ntyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ntyp);
		}
		
		if(Filter.Maxims != null && filter.Maxims.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MAXIMS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Maxims);
		}
		
		if(Filter.Opt != null && filter.Opt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OPT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Opt);
		}
		
		if(Filter.Dateauthfr != null && filter.Dateauthfr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DATEAUTHFR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dateauthfr);
		}
		
		if(Filter.Dateauthto != null && filter.Dateauthto.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DATEAUTHTO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dateauthto);
		}
		
		if(Filter.Daysleft != null && filter.Daysleft.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DAYSLEFT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Daysleft);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		UserRecord data = (UserRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeUser)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("USER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.User));
		}
		
		if(EditFilter.IncludeHpcd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hpcd));
		}
		
		if(EditFilter.IncludePass)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PASS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pass));
		}
		
		if(EditFilter.IncludeNtyp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ntyp));
		}
		
		if(EditFilter.IncludeMaxims)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MAXIMS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Maxims));
		}
		
		if(EditFilter.IncludeOpt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OPT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Opt));
		}
		
		if(EditFilter.IncludeDateauthfr)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DATEAUTHFR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dateauthfr));
		}
		
		if(EditFilter.IncludeDateauthto)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DATEAUTHTO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dateauthto));
		}
		
		if(EditFilter.IncludeDaysleft)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DAYSLEFT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Daysleft));
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
			UserRecord record = new UserRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.User = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "USER"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
			record.Pass = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PASS"));
			record.Ntyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NTYP"));
			record.Maxims = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXIMS"));
			record.Opt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPT"));
			record.Dateauthfr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATEAUTHFR"));
			record.Dateauthto = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATEAUTHTO"));
			record.Daysleft = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DAYSLEFT"));
									
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
			UserRecord record = new UserRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.User = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "USER"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
			record.Pass = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PASS"));
			record.Ntyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NTYP"));
			record.Maxims = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXIMS"));
			record.Opt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPT"));
			record.Dateauthfr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATEAUTHFR"));
			record.Dateauthto = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATEAUTHTO"));
			record.Daysleft = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DAYSLEFT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class UserCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			UserRecord newRecord = new UserRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(UserRecord record)
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
		public UserRecord get(int index)
		{
			return (UserRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class UserRecord
	{
		public String User = "";
		public String Hpcd = "";
		public String Pass = "";
		public String Ntyp = "";
		public String Maxims = "";
		public String Opt = "";
		public String Dateauthfr = "";
		public String Dateauthto = "";
		public String Daysleft = "";
				
		
		public void clear()
		{
			User = "";
			Hpcd = "";
			Pass = "";
			Ntyp = "";
			Maxims = "";
			Opt = "";
			Dateauthfr = "";
			Dateauthto = "";
			Daysleft = "";
			
		}		
	}
		
		
	public final class UserFilter
	{			
		public String User = "";
		public String Hpcd = "";
		public String Pass = "";
		public String Ntyp = "";
		public String Maxims = "";
		public String Opt = "";
		public String Dateauthfr = "";
		public String Dateauthto = "";
		public String Daysleft = "";
		
		public void clear()
		{				
			User = "";
			Hpcd = "";
			Pass = "";
			Ntyp = "";
			Maxims = "";
			Opt = "";
			Dateauthfr = "";
			Dateauthto = "";
			Daysleft = "";
		}	
		public UserFilter cloneObject()
		{
			UserFilter newFilter = new UserFilter();
			
			newFilter.User = this.User;
			newFilter.Hpcd = this.Hpcd;
			newFilter.Pass = this.Pass;
			newFilter.Ntyp = this.Ntyp;
			newFilter.Maxims = this.Maxims;
			newFilter.Opt = this.Opt;
			newFilter.Dateauthfr = this.Dateauthfr;
			newFilter.Dateauthto = this.Dateauthto;
			newFilter.Daysleft = this.Daysleft;
			
			return newFilter;
		}
	}
	public final class UserEditFilter
	{			
		public boolean IncludeUser = true;
		public boolean IncludeHpcd = true;
		public boolean IncludePass = true;
		public boolean IncludeNtyp = true;
		public boolean IncludeMaxims = true;
		public boolean IncludeOpt = true;
		public boolean IncludeDateauthfr = true;
		public boolean IncludeDateauthto = true;
		public boolean IncludeDaysleft = true;
		
		public void includeAll()
		{				
			IncludeUser = true;
			IncludeHpcd = true;
			IncludePass = true;
			IncludeNtyp = true;
			IncludeMaxims = true;
			IncludeOpt = true;
			IncludeDateauthfr = true;
			IncludeDateauthto = true;
			IncludeDaysleft = true;
		}	
		public void excludeAll()
		{				
			IncludeUser = false;
			IncludeHpcd = false;
			IncludePass = false;
			IncludeNtyp = false;
			IncludeMaxims = false;
			IncludeOpt = false;
			IncludeDateauthfr = false;
			IncludeDateauthto = false;
			IncludeDaysleft = false;
		}
		public UserEditFilter cloneObject()
		{
			UserEditFilter newEditFilter = new UserEditFilter();
			
			newEditFilter.IncludeUser = this.IncludeUser;
			newEditFilter.IncludeHpcd = this.IncludeHpcd;
			newEditFilter.IncludePass = this.IncludePass;
			newEditFilter.IncludeNtyp = this.IncludeNtyp;
			newEditFilter.IncludeMaxims = this.IncludeMaxims;
			newEditFilter.IncludeOpt = this.IncludeOpt;
			newEditFilter.IncludeDateauthfr = this.IncludeDateauthfr;
			newEditFilter.IncludeDateauthto = this.IncludeDateauthto;
			newEditFilter.IncludeDaysleft = this.IncludeDaysleft;
			
			return newEditFilter;
		}
	}
}
