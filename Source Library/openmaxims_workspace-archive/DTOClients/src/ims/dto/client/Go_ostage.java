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
// Template ver. 1.0.9 - Last modified on 20/09/2004 11:20 by Marius Mihalec

package ims.dto.client;

public final class Go_ostage implements ims.vo.ImsCloneable
{
	private Go_ostageFilter lastGetFilter = null;
	private final String serviceName = "GO_OSTAGE";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Go_ostageFilter Filter = new Go_ostageFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Go_ostageEditFilter EditFilter = new Go_ostageEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Go_ostageCollection DataCollection = new Go_ostageCollection();

	/**
	 * Creates a new Go_ostage Data Transfer Object.
	 */ 
	public Go_ostage(ims.dto.Connection connection)
	{	
		this.Connection = connection;
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
	public Go_ostage cloneObject()
	{
		Go_ostage cloneObject = new Go_ostage(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Go_ostage_id = DataCollection.get(x).Go_ostage_id;
			cloneObject.DataCollection.get(index).Tgroup_id = DataCollection.get(x).Tgroup_id;
			cloneObject.DataCollection.get(index).Tsite_id = DataCollection.get(x).Tsite_id;
			cloneObject.DataCollection.get(index).Tval = DataCollection.get(x).Tval;
			cloneObject.DataCollection.get(index).Nval = DataCollection.get(x).Nval;
			cloneObject.DataCollection.get(index).Mval = DataCollection.get(x).Mval;
			cloneObject.DataCollection.get(index).Histval = DataCollection.get(x).Histval;
			cloneObject.DataCollection.get(index).Diffval = DataCollection.get(x).Diffval;
			cloneObject.DataCollection.get(index).O45 = DataCollection.get(x).O45;
			cloneObject.DataCollection.get(index).Ostage = DataCollection.get(x).Ostage;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Act_ind = DataCollection.get(x).Act_ind;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.3 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Go_ostage.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ostage.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Go_ostage.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ostage.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ostage.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ostage.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Go_ostage.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Go_ostage.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ostage.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Go_ostage.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Go_ostage.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Go_ostage.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Go_ostage.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Go_ostage.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ostage.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Go_ostage.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Go_ostage.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Go_ostage.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Go_ostage.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Go_ostage.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ostage.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Go_ostage.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Go_ostage.TransferData");
			
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
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ostage.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Go_ostage.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Go_ostage.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Go_ostage.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
					
		decodeNASMessage();		
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ostage.List");
							
		listInProgress = true;	
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
						
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
	private String encodeNASFilter(Go_ostageFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Go_ostage_id != null && filter.Go_ostage_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GO_OSTAGE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Go_ostage_id;
		}
		
		if(Filter.Tgroup_id != null && filter.Tgroup_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TGROUP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tgroup_id;
		}
		
		if(Filter.Tsite_id != null && filter.Tsite_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSITE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tsite_id;
		}
		
		if(Filter.Tval != null && filter.Tval.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tval;
		}
		
		if(Filter.Nval != null && filter.Nval.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nval;
		}
		
		if(Filter.Mval != null && filter.Mval.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mval;
		}
		
		if(Filter.Histval != null && filter.Histval.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HISTVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Histval;
		}
		
		if(Filter.Diffval != null && filter.Diffval.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DIFFVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Diffval;
		}
		
		if(Filter.O45 != null && filter.O45.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "O45" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.O45;
		}
		
		if(Filter.Ostage != null && filter.Ostage.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OSTAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ostage;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Act_ind != null && filter.Act_ind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_ind;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Go_ostageRecord data = (Go_ostageRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeGo_ostage_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "GO_OSTAGE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Go_ostage_id);
		}
		
		if(EditFilter.IncludeTgroup_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TGROUP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tgroup_id);
		}
		
		if(EditFilter.IncludeTsite_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSITE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tsite_id);
		}
		
		if(EditFilter.IncludeTval)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tval);
		}
		
		if(EditFilter.IncludeNval)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nval);
		}
		
		if(EditFilter.IncludeMval)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mval);
		}
		
		if(EditFilter.IncludeHistval)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HISTVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Histval);
		}
		
		if(EditFilter.IncludeDiffval)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DIFFVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Diffval);
		}
		
		if(EditFilter.IncludeO45)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "O45" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.O45);
		}
		
		if(EditFilter.IncludeOstage)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OSTAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ostage);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeAct_ind)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_ind);
		}
		
		
			
		return dataString;	
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
			Go_ostageRecord record = new Go_ostageRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Go_ostage_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_OSTAGE_ID"));
			record.Tgroup_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TGROUP_ID"));
			record.Tsite_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSITE_ID"));
			record.Tval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TVAL"));
			record.Nval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NVAL"));
			record.Mval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MVAL"));
			record.Histval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTVAL"));
			record.Diffval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIFFVAL"));
			record.O45 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "O45"));
			record.Ostage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OSTAGE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
									
			DataCollection.add(record);
		}	
		
		return records;
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
			Go_ostageRecord record = new Go_ostageRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Go_ostage_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_OSTAGE_ID"));
			record.Tgroup_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TGROUP_ID"));
			record.Tsite_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSITE_ID"));
			record.Tval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TVAL"));
			record.Nval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NVAL"));
			record.Mval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MVAL"));
			record.Histval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTVAL"));
			record.Diffval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIFFVAL"));
			record.O45 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "O45"));
			record.Ostage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OSTAGE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Go_ostageCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Go_ostageRecord newRecord = new Go_ostageRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Go_ostageRecord record)
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
		public Go_ostageRecord get(int index)
		{
			return (Go_ostageRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Go_ostageRecord
	{
		public String Go_ostage_id = "";
		public String Tgroup_id = "";
		public String Tsite_id = "";
		public String Tval = "";
		public String Nval = "";
		public String Mval = "";
		public String Histval = "";
		public String Diffval = "";
		public String O45 = "";
		public String Ostage = "";
		public String Tstp = "";
		public String Act_ind = "";
				
		
		public void clear()
		{
			Go_ostage_id = "";
			Tgroup_id = "";
			Tsite_id = "";
			Tval = "";
			Nval = "";
			Mval = "";
			Histval = "";
			Diffval = "";
			O45 = "";
			Ostage = "";
			Tstp = "";
			Act_ind = "";
			
		}		
	}
		
		
	public final class Go_ostageFilter
	{			
		public String Go_ostage_id = "";
		public String Tgroup_id = "";
		public String Tsite_id = "";
		public String Tval = "";
		public String Nval = "";
		public String Mval = "";
		public String Histval = "";
		public String Diffval = "";
		public String O45 = "";
		public String Ostage = "";
		public String Tstp = "";
		public String Act_ind = "";
		
		public void clear()
		{				
			Go_ostage_id = "";
			Tgroup_id = "";
			Tsite_id = "";
			Tval = "";
			Nval = "";
			Mval = "";
			Histval = "";
			Diffval = "";
			O45 = "";
			Ostage = "";
			Tstp = "";
			Act_ind = "";
		}	
		public Go_ostageFilter cloneObject()
		{
			Go_ostageFilter newFilter = new Go_ostageFilter();
			
			newFilter.Go_ostage_id = this.Go_ostage_id;
			newFilter.Tgroup_id = this.Tgroup_id;
			newFilter.Tsite_id = this.Tsite_id;
			newFilter.Tval = this.Tval;
			newFilter.Nval = this.Nval;
			newFilter.Mval = this.Mval;
			newFilter.Histval = this.Histval;
			newFilter.Diffval = this.Diffval;
			newFilter.O45 = this.O45;
			newFilter.Ostage = this.Ostage;
			newFilter.Tstp = this.Tstp;
			newFilter.Act_ind = this.Act_ind;
			
			return newFilter;
		}
	}
	public final class Go_ostageEditFilter
	{			
		public boolean IncludeGo_ostage_id = true;
		public boolean IncludeTgroup_id = true;
		public boolean IncludeTsite_id = true;
		public boolean IncludeTval = true;
		public boolean IncludeNval = true;
		public boolean IncludeMval = true;
		public boolean IncludeHistval = true;
		public boolean IncludeDiffval = true;
		public boolean IncludeO45 = true;
		public boolean IncludeOstage = true;
		public boolean IncludeTstp = true;
		public boolean IncludeAct_ind = true;
		
		public void includeAll()
		{				
			IncludeGo_ostage_id = true;
			IncludeTgroup_id = true;
			IncludeTsite_id = true;
			IncludeTval = true;
			IncludeNval = true;
			IncludeMval = true;
			IncludeHistval = true;
			IncludeDiffval = true;
			IncludeO45 = true;
			IncludeOstage = true;
			IncludeTstp = true;
			IncludeAct_ind = true;
		}	
		public void excludeAll()
		{				
			IncludeGo_ostage_id = false;
			IncludeTgroup_id = false;
			IncludeTsite_id = false;
			IncludeTval = false;
			IncludeNval = false;
			IncludeMval = false;
			IncludeHistval = false;
			IncludeDiffval = false;
			IncludeO45 = false;
			IncludeOstage = false;
			IncludeTstp = false;
			IncludeAct_ind = false;
		}
		public Go_ostageEditFilter cloneObject()
		{
			Go_ostageEditFilter newEditFilter = new Go_ostageEditFilter();
			
			newEditFilter.IncludeGo_ostage_id = this.IncludeGo_ostage_id;
			newEditFilter.IncludeTgroup_id = this.IncludeTgroup_id;
			newEditFilter.IncludeTsite_id = this.IncludeTsite_id;
			newEditFilter.IncludeTval = this.IncludeTval;
			newEditFilter.IncludeNval = this.IncludeNval;
			newEditFilter.IncludeMval = this.IncludeMval;
			newEditFilter.IncludeHistval = this.IncludeHistval;
			newEditFilter.IncludeDiffval = this.IncludeDiffval;
			newEditFilter.IncludeO45 = this.IncludeO45;
			newEditFilter.IncludeOstage = this.IncludeOstage;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeAct_ind = this.IncludeAct_ind;
			
			return newEditFilter;
		}
	}
}
