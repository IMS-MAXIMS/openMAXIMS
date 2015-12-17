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
// Template ver. 1.0.3 - Last modified on 12/03/2004 10:13 by Marius Mihalec

package ims.dto.client;

public final class Ocs_ord_item
{
	private Ocs_ord_itemFilter lastGetFilter = null;
	private final String serviceName = "OCS_ORD_ITEM";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Ocs_ord_itemFilter Filter = new Ocs_ord_itemFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Ocs_ord_itemEditFilter EditFilter = new Ocs_ord_itemEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Ocs_ord_itemCollection DataCollection = new Ocs_ord_itemCollection();

	/**
	 * Creates a new Ocs_ord_item Data Transfer Object.
	 */ 
	public Ocs_ord_item(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Ocs_ord_item cloneObject() throws ims.dto.Exception
	{
		Ocs_ord_item cloneObject = new Ocs_ord_item(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Item_id = DataCollection.get(x).Item_id;
			cloneObject.DataCollection.get(index).Order_id = DataCollection.get(x).Order_id;
			cloneObject.DataCollection.get(index).Specimen_id = DataCollection.get(x).Specimen_id;
			cloneObject.DataCollection.get(index).Reqtd_item_id = DataCollection.get(x).Reqtd_item_id;
			cloneObject.DataCollection.get(index).Perf_proc_nm = DataCollection.get(x).Perf_proc_nm;
			cloneObject.DataCollection.get(index).Perf_proc_code = DataCollection.get(x).Perf_proc_code;
			cloneObject.DataCollection.get(index).Perf_ord_no = DataCollection.get(x).Perf_ord_no;
			cloneObject.DataCollection.get(index).Msg_src_id = DataCollection.get(x).Msg_src_id;
			cloneObject.DataCollection.get(index).Item_status = DataCollection.get(x).Item_status;
							
			
		}
		
		return cloneObject;
	}		
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_item.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Ocs_ord_item.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_item.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_item.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_item.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Ocs_ord_item.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Ocs_ord_item.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_item.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Ocs_ord_item.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Ocs_ord_item.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Ocs_ord_item.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Ocs_ord_item.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Ocs_ord_item.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_item.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Ocs_ord_item.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Ocs_ord_item.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Ocs_ord_item.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Ocs_ord_item.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Ocs_ord_item.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_item.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Ocs_ord_item.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Ocs_ord_item.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_item.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Ocs_ord_item.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Ocs_ord_item.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Ocs_ord_item.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ocs_ord_item.List");
							
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
						
		if(execResult != null)
		{
			if(execResult.getId() != -3) 
			{
				listInProgress = false;
				return execResult;
			}
		}
		else // NAS next list empty
		{
			listInProgress = false;
			return null;
		}				
					
		if(!loadAllRecords || !listInProgress)
		{
			listInProgress = false;
			return Connection.stopList(serviceName);
		}
		
		listInProgress = false;
		return null;
	}	

	private String encodeNASFilter()
	{
		return encodeNASFilter(Filter);
	}
	private String encodeNASFilter(Ocs_ord_itemFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Item_id != null && filter.Item_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ITEM_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Item_id;
		}
		
		if(Filter.Order_id != null && filter.Order_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORDER_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Order_id;
		}
		
		if(Filter.Specimen_id != null && filter.Specimen_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPECIMEN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Specimen_id;
		}
		
		if(Filter.Reqtd_item_id != null && filter.Reqtd_item_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQTD_ITEM_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reqtd_item_id;
		}
		
		if(Filter.Perf_proc_nm != null && filter.Perf_proc_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PERF_PROC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Perf_proc_nm;
		}
		
		if(Filter.Perf_proc_code != null && filter.Perf_proc_code.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PERF_PROC_CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Perf_proc_code;
		}
		
		if(Filter.Perf_ord_no != null && filter.Perf_ord_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PERF_ORD_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Perf_ord_no;
		}
		
		if(Filter.Msg_src_id != null && filter.Msg_src_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MSG_SRC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Msg_src_id;
		}
		
		if(Filter.Item_status != null && filter.Item_status.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ITEM_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Item_status;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Ocs_ord_itemRecord data = (Ocs_ord_itemRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeItem_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ITEM_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Item_id);
		}
		
		if(EditFilter.IncludeOrder_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORDER_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Order_id);
		}
		
		if(EditFilter.IncludeSpecimen_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPECIMEN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Specimen_id);
		}
		
		if(EditFilter.IncludeReqtd_item_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQTD_ITEM_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reqtd_item_id);
		}
		
		if(EditFilter.IncludePerf_proc_nm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PERF_PROC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Perf_proc_nm);
		}
		
		if(EditFilter.IncludePerf_proc_code)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PERF_PROC_CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Perf_proc_code);
		}
		
		if(EditFilter.IncludePerf_ord_no)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PERF_ORD_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Perf_ord_no);
		}
		
		if(EditFilter.IncludeMsg_src_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MSG_SRC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Msg_src_id);
		}
		
		if(EditFilter.IncludeItem_status)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ITEM_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Item_status);
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
			Ocs_ord_itemRecord record = new Ocs_ord_itemRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Item_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ITEM_ID"));
			record.Order_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORDER_ID"));
			record.Specimen_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPECIMEN_ID"));
			record.Reqtd_item_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQTD_ITEM_ID"));
			record.Perf_proc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_PROC_NM"));
			record.Perf_proc_code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_PROC_CODE"));
			record.Perf_ord_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_ORD_NO"));
			record.Msg_src_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSG_SRC_ID"));
			record.Item_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ITEM_STATUS"));
									
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
			Ocs_ord_itemRecord record = new Ocs_ord_itemRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Item_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ITEM_ID"));
			record.Order_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORDER_ID"));
			record.Specimen_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPECIMEN_ID"));
			record.Reqtd_item_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQTD_ITEM_ID"));
			record.Perf_proc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_PROC_NM"));
			record.Perf_proc_code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_PROC_CODE"));
			record.Perf_ord_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERF_ORD_NO"));
			record.Msg_src_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSG_SRC_ID"));
			record.Item_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ITEM_STATUS"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Ocs_ord_itemCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Ocs_ord_itemRecord newRecord = new Ocs_ord_itemRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Ocs_ord_itemRecord record)
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
		public Ocs_ord_itemRecord get(int index)
		{
			return (Ocs_ord_itemRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Ocs_ord_itemRecord
	{
		public String Item_id = "";
		public String Order_id = "";
		public String Specimen_id = "";
		public String Reqtd_item_id = "";
		public String Perf_proc_nm = "";
		public String Perf_proc_code = "";
		public String Perf_ord_no = "";
		public String Msg_src_id = "";
		public String Item_status = "";
				
		
		public void clear()
		{
			Item_id = "";
			Order_id = "";
			Specimen_id = "";
			Reqtd_item_id = "";
			Perf_proc_nm = "";
			Perf_proc_code = "";
			Perf_ord_no = "";
			Msg_src_id = "";
			Item_status = "";
			
		}		
	}
		
		
	public final class Ocs_ord_itemFilter
	{			
		public String Item_id = "";
		public String Order_id = "";
		public String Specimen_id = "";
		public String Reqtd_item_id = "";
		public String Perf_proc_nm = "";
		public String Perf_proc_code = "";
		public String Perf_ord_no = "";
		public String Msg_src_id = "";
		public String Item_status = "";
		
		public void clear()
		{				
			Item_id = "";
			Order_id = "";
			Specimen_id = "";
			Reqtd_item_id = "";
			Perf_proc_nm = "";
			Perf_proc_code = "";
			Perf_ord_no = "";
			Msg_src_id = "";
			Item_status = "";
		}	
		public Ocs_ord_itemFilter cloneObject()
		{
			Ocs_ord_itemFilter newFilter = new Ocs_ord_itemFilter();
			
			newFilter.Item_id = this.Item_id;
			newFilter.Order_id = this.Order_id;
			newFilter.Specimen_id = this.Specimen_id;
			newFilter.Reqtd_item_id = this.Reqtd_item_id;
			newFilter.Perf_proc_nm = this.Perf_proc_nm;
			newFilter.Perf_proc_code = this.Perf_proc_code;
			newFilter.Perf_ord_no = this.Perf_ord_no;
			newFilter.Msg_src_id = this.Msg_src_id;
			newFilter.Item_status = this.Item_status;
			
			return newFilter;
		}
	}
	public final class Ocs_ord_itemEditFilter
	{			
		public boolean IncludeItem_id = true;
		public boolean IncludeOrder_id = true;
		public boolean IncludeSpecimen_id = true;
		public boolean IncludeReqtd_item_id = true;
		public boolean IncludePerf_proc_nm = true;
		public boolean IncludePerf_proc_code = true;
		public boolean IncludePerf_ord_no = true;
		public boolean IncludeMsg_src_id = true;
		public boolean IncludeItem_status = true;
		
		public void includeAll()
		{				
			IncludeItem_id = true;
			IncludeOrder_id = true;
			IncludeSpecimen_id = true;
			IncludeReqtd_item_id = true;
			IncludePerf_proc_nm = true;
			IncludePerf_proc_code = true;
			IncludePerf_ord_no = true;
			IncludeMsg_src_id = true;
			IncludeItem_status = true;
		}	
		public void excludeAll()
		{				
			IncludeItem_id = false;
			IncludeOrder_id = false;
			IncludeSpecimen_id = false;
			IncludeReqtd_item_id = false;
			IncludePerf_proc_nm = false;
			IncludePerf_proc_code = false;
			IncludePerf_ord_no = false;
			IncludeMsg_src_id = false;
			IncludeItem_status = false;
		}
		public Ocs_ord_itemEditFilter cloneObject()
		{
			Ocs_ord_itemEditFilter newEditFilter = new Ocs_ord_itemEditFilter();
			
			newEditFilter.IncludeItem_id = this.IncludeItem_id;
			newEditFilter.IncludeOrder_id = this.IncludeOrder_id;
			newEditFilter.IncludeSpecimen_id = this.IncludeSpecimen_id;
			newEditFilter.IncludeReqtd_item_id = this.IncludeReqtd_item_id;
			newEditFilter.IncludePerf_proc_nm = this.IncludePerf_proc_nm;
			newEditFilter.IncludePerf_proc_code = this.IncludePerf_proc_code;
			newEditFilter.IncludePerf_ord_no = this.IncludePerf_ord_no;
			newEditFilter.IncludeMsg_src_id = this.IncludeMsg_src_id;
			newEditFilter.IncludeItem_status = this.IncludeItem_status;
			
			return newEditFilter;
		}
	}
}
