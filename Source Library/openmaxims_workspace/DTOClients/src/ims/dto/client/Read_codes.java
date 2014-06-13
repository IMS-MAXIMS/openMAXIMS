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

public final class Read_codes implements ims.vo.ImsCloneable
{
	private Read_codesFilter lastGetFilter = null;
	private final String serviceName = "READ_CODES";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Read_codesFilter Filter = new Read_codesFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Read_codesEditFilter EditFilter = new Read_codesEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Read_codesCollection DataCollection = new Read_codesCollection();

	/**
	 * Creates a new Read_codes Data Transfer Object.
	 */ 
	public Read_codes(ims.dto.Connection connection)
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
	public Read_codes cloneObject()
	{
		Read_codes cloneObject = new Read_codes(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Term_id = DataCollection.get(x).Term_id;
			cloneObject.DataCollection.get(index).Term_status = DataCollection.get(x).Term_status;
			cloneObject.DataCollection.get(index).Term_30 = DataCollection.get(x).Term_30;
			cloneObject.DataCollection.get(index).Term_60 = DataCollection.get(x).Term_60;
			cloneObject.DataCollection.get(index).Term_198 = DataCollection.get(x).Term_198;
			cloneObject.DataCollection.get(index).Read_code = DataCollection.get(x).Read_code;
			cloneObject.DataCollection.get(index).Desc_type = DataCollection.get(x).Desc_type;
			cloneObject.DataCollection.get(index).Term_key = DataCollection.get(x).Term_key;
			cloneObject.DataCollection.get(index).Ling_role = DataCollection.get(x).Ling_role;
			cloneObject.DataCollection.get(index).Concept_status = DataCollection.get(x).Concept_status;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.7 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Read_codes.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Read_codes.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Read_codes.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Read_codes.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Read_codes.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Read_codes.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Read_codes.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Read_codes.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Read_codes.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Read_codes.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Read_codes.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Read_codes.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Read_codes.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Read_codes.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Read_codes.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Read_codes.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Read_codes.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Read_codes.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Read_codes.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Read_codes.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Read_codes.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Read_codes.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Read_codes.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Read_codes.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Read_codes.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Read_codes.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Read_codes.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Read_codes.List");
							
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
	private String encodeNASFilter(Read_codesFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Term_id != null && filter.Term_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TERM_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Term_id;
		}
		
		if(Filter.Term_status != null && filter.Term_status.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TERM_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Term_status;
		}
		
		if(Filter.Term_30 != null && filter.Term_30.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TERM_30" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Term_30;
		}
		
		if(Filter.Term_60 != null && filter.Term_60.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TERM_60" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Term_60;
		}
		
		if(Filter.Term_198 != null && filter.Term_198.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TERM_198" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Term_198;
		}
		
		if(Filter.Read_code != null && filter.Read_code.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "READ_CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Read_code;
		}
		
		if(Filter.Desc_type != null && filter.Desc_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DESC_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Desc_type;
		}
		
		if(Filter.Term_key != null && filter.Term_key.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TERM_KEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Term_key;
		}
		
		if(Filter.Ling_role != null && filter.Ling_role.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LING_ROLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ling_role;
		}
		
		if(Filter.Concept_status != null && filter.Concept_status.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONCEPT_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Concept_status;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Read_codesRecord data = (Read_codesRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeTerm_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TERM_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Term_id);
		}
		
		if(EditFilter.IncludeTerm_status)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TERM_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Term_status);
		}
		
		if(EditFilter.IncludeTerm_30)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TERM_30" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Term_30);
		}
		
		if(EditFilter.IncludeTerm_60)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TERM_60" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Term_60);
		}
		
		if(EditFilter.IncludeTerm_198)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TERM_198" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Term_198);
		}
		
		if(EditFilter.IncludeRead_code)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "READ_CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Read_code);
		}
		
		if(EditFilter.IncludeDesc_type)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DESC_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Desc_type);
		}
		
		if(EditFilter.IncludeTerm_key)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TERM_KEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Term_key);
		}
		
		if(EditFilter.IncludeLing_role)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LING_ROLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ling_role);
		}
		
		if(EditFilter.IncludeConcept_status)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONCEPT_STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Concept_status);
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
			Read_codesRecord record = new Read_codesRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Term_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TERM_ID"));
			record.Term_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TERM_STATUS"));
			record.Term_30 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TERM_30"));
			record.Term_60 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TERM_60"));
			record.Term_198 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TERM_198"));
			record.Read_code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "READ_CODE"));
			record.Desc_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DESC_TYPE"));
			record.Term_key = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TERM_KEY"));
			record.Ling_role = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LING_ROLE"));
			record.Concept_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONCEPT_STATUS"));
									
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
			Read_codesRecord record = new Read_codesRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Term_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TERM_ID"));
			record.Term_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TERM_STATUS"));
			record.Term_30 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TERM_30"));
			record.Term_60 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TERM_60"));
			record.Term_198 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TERM_198"));
			record.Read_code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "READ_CODE"));
			record.Desc_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DESC_TYPE"));
			record.Term_key = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TERM_KEY"));
			record.Ling_role = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LING_ROLE"));
			record.Concept_status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONCEPT_STATUS"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Read_codesCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Read_codesRecord newRecord = new Read_codesRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Read_codesRecord record)
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
		public Read_codesRecord get(int index)
		{
			return (Read_codesRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Read_codesRecord
	{
		public String Term_id = "";
		public String Term_status = "";
		public String Term_30 = "";
		public String Term_60 = "";
		public String Term_198 = "";
		public String Read_code = "";
		public String Desc_type = "";
		public String Term_key = "";
		public String Ling_role = "";
		public String Concept_status = "";
				
		
		public void clear()
		{
			Term_id = "";
			Term_status = "";
			Term_30 = "";
			Term_60 = "";
			Term_198 = "";
			Read_code = "";
			Desc_type = "";
			Term_key = "";
			Ling_role = "";
			Concept_status = "";
			
		}		
	}
		
		
	public final class Read_codesFilter
	{			
		public String Term_id = "";
		public String Term_status = "";
		public String Term_30 = "";
		public String Term_60 = "";
		public String Term_198 = "";
		public String Read_code = "";
		public String Desc_type = "";
		public String Term_key = "";
		public String Ling_role = "";
		public String Concept_status = "";
		
		public void clear()
		{				
			Term_id = "";
			Term_status = "";
			Term_30 = "";
			Term_60 = "";
			Term_198 = "";
			Read_code = "";
			Desc_type = "";
			Term_key = "";
			Ling_role = "";
			Concept_status = "";
		}	
		public Read_codesFilter cloneObject()
		{
			Read_codesFilter newFilter = new Read_codesFilter();
			
			newFilter.Term_id = this.Term_id;
			newFilter.Term_status = this.Term_status;
			newFilter.Term_30 = this.Term_30;
			newFilter.Term_60 = this.Term_60;
			newFilter.Term_198 = this.Term_198;
			newFilter.Read_code = this.Read_code;
			newFilter.Desc_type = this.Desc_type;
			newFilter.Term_key = this.Term_key;
			newFilter.Ling_role = this.Ling_role;
			newFilter.Concept_status = this.Concept_status;
			
			return newFilter;
		}
	}
	public final class Read_codesEditFilter
	{			
		public boolean IncludeTerm_id = true;
		public boolean IncludeTerm_status = true;
		public boolean IncludeTerm_30 = true;
		public boolean IncludeTerm_60 = true;
		public boolean IncludeTerm_198 = true;
		public boolean IncludeRead_code = true;
		public boolean IncludeDesc_type = true;
		public boolean IncludeTerm_key = true;
		public boolean IncludeLing_role = true;
		public boolean IncludeConcept_status = true;
		
		public void includeAll()
		{				
			IncludeTerm_id = true;
			IncludeTerm_status = true;
			IncludeTerm_30 = true;
			IncludeTerm_60 = true;
			IncludeTerm_198 = true;
			IncludeRead_code = true;
			IncludeDesc_type = true;
			IncludeTerm_key = true;
			IncludeLing_role = true;
			IncludeConcept_status = true;
		}	
		public void excludeAll()
		{				
			IncludeTerm_id = false;
			IncludeTerm_status = false;
			IncludeTerm_30 = false;
			IncludeTerm_60 = false;
			IncludeTerm_198 = false;
			IncludeRead_code = false;
			IncludeDesc_type = false;
			IncludeTerm_key = false;
			IncludeLing_role = false;
			IncludeConcept_status = false;
		}
		public Read_codesEditFilter cloneObject()
		{
			Read_codesEditFilter newEditFilter = new Read_codesEditFilter();
			
			newEditFilter.IncludeTerm_id = this.IncludeTerm_id;
			newEditFilter.IncludeTerm_status = this.IncludeTerm_status;
			newEditFilter.IncludeTerm_30 = this.IncludeTerm_30;
			newEditFilter.IncludeTerm_60 = this.IncludeTerm_60;
			newEditFilter.IncludeTerm_198 = this.IncludeTerm_198;
			newEditFilter.IncludeRead_code = this.IncludeRead_code;
			newEditFilter.IncludeDesc_type = this.IncludeDesc_type;
			newEditFilter.IncludeTerm_key = this.IncludeTerm_key;
			newEditFilter.IncludeLing_role = this.IncludeLing_role;
			newEditFilter.IncludeConcept_status = this.IncludeConcept_status;
			
			return newEditFilter;
		}
	}
}
