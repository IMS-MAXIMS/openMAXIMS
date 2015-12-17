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

public final class Go_tgroup_chklst implements ims.vo.ImsCloneable
{
	private Go_tgroup_chklstFilter lastGetFilter = null;
	private final String serviceName = "GO_TGROUP_CHKLST";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Go_tgroup_chklstFilter Filter = new Go_tgroup_chklstFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Go_tgroup_chklstEditFilter EditFilter = new Go_tgroup_chklstEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Go_tgroup_chklstCollection DataCollection = new Go_tgroup_chklstCollection();

	/**
	 * Creates a new Go_tgroup_chklst Data Transfer Object.
	 */ 
	public Go_tgroup_chklst(ims.dto.Connection connection)
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
	public Go_tgroup_chklst cloneObject()
	{
		Go_tgroup_chklst cloneObject = new Go_tgroup_chklst(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Go_tgroup_chklst_id = DataCollection.get(x).Go_tgroup_chklst_id;
			cloneObject.DataCollection.get(index).Tgroupid = DataCollection.get(x).Tgroupid;
			cloneObject.DataCollection.get(index).Item_desc = DataCollection.get(x).Item_desc;
			cloneObject.DataCollection.get(index).Item_parent = DataCollection.get(x).Item_parent;
			cloneObject.DataCollection.get(index).Actind = DataCollection.get(x).Actind;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
							
			
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
		return "Go_tgroup_chklst.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgroup_chklst.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Go_tgroup_chklst.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgroup_chklst.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgroup_chklst.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgroup_chklst.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Go_tgroup_chklst.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Go_tgroup_chklst.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgroup_chklst.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Go_tgroup_chklst.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Go_tgroup_chklst.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Go_tgroup_chklst.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Go_tgroup_chklst.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Go_tgroup_chklst.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgroup_chklst.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Go_tgroup_chklst.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Go_tgroup_chklst.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Go_tgroup_chklst.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Go_tgroup_chklst.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Go_tgroup_chklst.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgroup_chklst.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Go_tgroup_chklst.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Go_tgroup_chklst.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgroup_chklst.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Go_tgroup_chklst.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Go_tgroup_chklst.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Go_tgroup_chklst.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgroup_chklst.List");
							
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
	private String encodeNASFilter(Go_tgroup_chklstFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Go_tgroup_chklst_id != null && filter.Go_tgroup_chklst_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GO_TGROUP_CHKLST_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Go_tgroup_chklst_id;
		}
		
		if(Filter.Tgroupid != null && filter.Tgroupid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TGROUPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tgroupid;
		}
		
		if(Filter.Item_desc != null && filter.Item_desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ITEM_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Item_desc;
		}
		
		if(Filter.Item_parent != null && filter.Item_parent.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ITEM_PARENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Item_parent;
		}
		
		if(Filter.Actind != null && filter.Actind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Actind;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Go_tgroup_chklstRecord data = (Go_tgroup_chklstRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeGo_tgroup_chklst_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "GO_TGROUP_CHKLST_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Go_tgroup_chklst_id);
		}
		
		if(EditFilter.IncludeTgroupid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TGROUPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tgroupid);
		}
		
		if(EditFilter.IncludeItem_desc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ITEM_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Item_desc);
		}
		
		if(EditFilter.IncludeItem_parent)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ITEM_PARENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Item_parent);
		}
		
		if(EditFilter.IncludeActind)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Actind);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
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
			Go_tgroup_chklstRecord record = new Go_tgroup_chklstRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Go_tgroup_chklst_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_TGROUP_CHKLST_ID"));
			record.Tgroupid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TGROUPID"));
			record.Item_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ITEM_DESC"));
			record.Item_parent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ITEM_PARENT"));
			record.Actind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIND"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
									
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
			Go_tgroup_chklstRecord record = new Go_tgroup_chklstRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Go_tgroup_chklst_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_TGROUP_CHKLST_ID"));
			record.Tgroupid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TGROUPID"));
			record.Item_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ITEM_DESC"));
			record.Item_parent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ITEM_PARENT"));
			record.Actind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIND"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Go_tgroup_chklstCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Go_tgroup_chklstRecord newRecord = new Go_tgroup_chklstRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Go_tgroup_chklstRecord record)
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
		public Go_tgroup_chklstRecord get(int index)
		{
			return (Go_tgroup_chklstRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Go_tgroup_chklstRecord
	{
		public String Go_tgroup_chklst_id = "";
		public String Tgroupid = "";
		public String Item_desc = "";
		public String Item_parent = "";
		public String Actind = "";
		public String Tstp = "";
				
		
		public void clear()
		{
			Go_tgroup_chklst_id = "";
			Tgroupid = "";
			Item_desc = "";
			Item_parent = "";
			Actind = "";
			Tstp = "";
			
		}		
	}
		
		
	public final class Go_tgroup_chklstFilter
	{			
		public String Go_tgroup_chklst_id = "";
		public String Tgroupid = "";
		public String Item_desc = "";
		public String Item_parent = "";
		public String Actind = "";
		public String Tstp = "";
		
		public void clear()
		{				
			Go_tgroup_chklst_id = "";
			Tgroupid = "";
			Item_desc = "";
			Item_parent = "";
			Actind = "";
			Tstp = "";
		}	
		public Go_tgroup_chklstFilter cloneObject()
		{
			Go_tgroup_chklstFilter newFilter = new Go_tgroup_chklstFilter();
			
			newFilter.Go_tgroup_chklst_id = this.Go_tgroup_chklst_id;
			newFilter.Tgroupid = this.Tgroupid;
			newFilter.Item_desc = this.Item_desc;
			newFilter.Item_parent = this.Item_parent;
			newFilter.Actind = this.Actind;
			newFilter.Tstp = this.Tstp;
			
			return newFilter;
		}
	}
	public final class Go_tgroup_chklstEditFilter
	{			
		public boolean IncludeGo_tgroup_chklst_id = true;
		public boolean IncludeTgroupid = true;
		public boolean IncludeItem_desc = true;
		public boolean IncludeItem_parent = true;
		public boolean IncludeActind = true;
		public boolean IncludeTstp = true;
		
		public void includeAll()
		{				
			IncludeGo_tgroup_chklst_id = true;
			IncludeTgroupid = true;
			IncludeItem_desc = true;
			IncludeItem_parent = true;
			IncludeActind = true;
			IncludeTstp = true;
		}	
		public void excludeAll()
		{				
			IncludeGo_tgroup_chklst_id = false;
			IncludeTgroupid = false;
			IncludeItem_desc = false;
			IncludeItem_parent = false;
			IncludeActind = false;
			IncludeTstp = false;
		}
		public Go_tgroup_chklstEditFilter cloneObject()
		{
			Go_tgroup_chklstEditFilter newEditFilter = new Go_tgroup_chklstEditFilter();
			
			newEditFilter.IncludeGo_tgroup_chklst_id = this.IncludeGo_tgroup_chklst_id;
			newEditFilter.IncludeTgroupid = this.IncludeTgroupid;
			newEditFilter.IncludeItem_desc = this.IncludeItem_desc;
			newEditFilter.IncludeItem_parent = this.IncludeItem_parent;
			newEditFilter.IncludeActind = this.IncludeActind;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			
			return newEditFilter;
		}
	}
}
