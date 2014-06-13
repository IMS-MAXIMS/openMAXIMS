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
// Template ver. 1.0.5 - Last modified on 30/04/2004 10:13 by Marius Mihalec

package ims.dto.client;

public final class Prismarks
{
	private PrismarksFilter lastGetFilter = null;
	private final String serviceName = "PRISMARKS";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public PrismarksFilter Filter = new PrismarksFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public PrismarksEditFilter EditFilter = new PrismarksEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public PrismarksCollection DataCollection = new PrismarksCollection();

	/**
	 * Creates a new Prismarks Data Transfer Object.
	 */ 
	public Prismarks(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Prismarks cloneObject() throws ims.dto.Exception
	{
		Prismarks cloneObject = new Prismarks(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Pnum = DataCollection.get(x).Pnum;
			cloneObject.DataCollection.get(index).Msscarnumber = DataCollection.get(x).Msscarnumber;
			cloneObject.DataCollection.get(index).Mslocation = DataCollection.get(x).Mslocation;
			cloneObject.DataCollection.get(index).Mstyp = DataCollection.get(x).Mstyp;
			cloneObject.DataCollection.get(index).Mstattootyp = DataCollection.get(x).Mstattootyp;
			cloneObject.DataCollection.get(index).Msdscp = DataCollection.get(x).Msdscp;
			cloneObject.DataCollection.get(index).Lkupdscp = DataCollection.get(x).Lkupdscp;
			cloneObject.DataCollection.get(index).Tattyptxt = DataCollection.get(x).Tattyptxt;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "9";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Prismarks.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prismarks.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Prismarks.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prismarks.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prismarks.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prismarks.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Prismarks.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Prismarks.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prismarks.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Prismarks.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Prismarks.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Prismarks.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Prismarks.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Prismarks.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prismarks.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Prismarks.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Prismarks.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Prismarks.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Prismarks.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Prismarks.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prismarks.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Prismarks.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Prismarks.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prismarks.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Prismarks.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Prismarks.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Prismarks.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prismarks.List");
							
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
	private String encodeNASFilter(PrismarksFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Pnum != null && filter.Pnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnum;
		}
		
		if(Filter.Msscarnumber != null && filter.Msscarnumber.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MSSCARNUMBER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Msscarnumber;
		}
		
		if(Filter.Mslocation != null && filter.Mslocation.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MSLOCATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mslocation;
		}
		
		if(Filter.Mstyp != null && filter.Mstyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MSTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mstyp;
		}
		
		if(Filter.Mstattootyp != null && filter.Mstattootyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MSTATTOOTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mstattootyp;
		}
		
		if(Filter.Msdscp != null && filter.Msdscp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MSDSCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Msdscp;
		}
		
		if(Filter.Lkupdscp != null && filter.Lkupdscp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUPDSCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkupdscp;
		}
		
		if(Filter.Tattyptxt != null && filter.Tattyptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TATTYPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tattyptxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		PrismarksRecord data = (PrismarksRecord)DataCollection.get(0);
		
		if(EditFilter.IncludePnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnum);
		}
		
		if(EditFilter.IncludeMsscarnumber)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MSSCARNUMBER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Msscarnumber);
		}
		
		if(EditFilter.IncludeMslocation)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MSLOCATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mslocation);
		}
		
		if(EditFilter.IncludeMstyp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MSTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mstyp);
		}
		
		if(EditFilter.IncludeMstattootyp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MSTATTOOTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mstattootyp);
		}
		
		if(EditFilter.IncludeMsdscp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MSDSCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Msdscp);
		}
		
		if(EditFilter.IncludeLkupdscp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUPDSCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkupdscp);
		}
		
		if(EditFilter.IncludeTattyptxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TATTYPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tattyptxt);
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
			PrismarksRecord record = new PrismarksRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNUM"));
			record.Msscarnumber = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSSCARNUMBER"));
			record.Mslocation = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSLOCATION"));
			record.Mstyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSTYP"));
			record.Mstattootyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSTATTOOTYP"));
			record.Msdscp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSDSCP"));
			record.Lkupdscp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUPDSCP"));
			record.Tattyptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TATTYPTXT"));
									
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
			PrismarksRecord record = new PrismarksRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNUM"));
			record.Msscarnumber = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSSCARNUMBER"));
			record.Mslocation = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSLOCATION"));
			record.Mstyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSTYP"));
			record.Mstattootyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSTATTOOTYP"));
			record.Msdscp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSDSCP"));
			record.Lkupdscp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUPDSCP"));
			record.Tattyptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TATTYPTXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class PrismarksCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			PrismarksRecord newRecord = new PrismarksRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(PrismarksRecord record)
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
		public PrismarksRecord get(int index)
		{
			return (PrismarksRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class PrismarksRecord
	{
		public String Pnum = "";
		public String Msscarnumber = "";
		public String Mslocation = "";
		public String Mstyp = "";
		public String Mstattootyp = "";
		public String Msdscp = "";
		public String Lkupdscp = "";
		public String Tattyptxt = "";
				
		
		public void clear()
		{
			Pnum = "";
			Msscarnumber = "";
			Mslocation = "";
			Mstyp = "";
			Mstattootyp = "";
			Msdscp = "";
			Lkupdscp = "";
			Tattyptxt = "";
			
		}		
	}
		
		
	public final class PrismarksFilter
	{			
		public String Pnum = "";
		public String Msscarnumber = "";
		public String Mslocation = "";
		public String Mstyp = "";
		public String Mstattootyp = "";
		public String Msdscp = "";
		public String Lkupdscp = "";
		public String Tattyptxt = "";
		
		public void clear()
		{				
			Pnum = "";
			Msscarnumber = "";
			Mslocation = "";
			Mstyp = "";
			Mstattootyp = "";
			Msdscp = "";
			Lkupdscp = "";
			Tattyptxt = "";
		}	
		public PrismarksFilter cloneObject()
		{
			PrismarksFilter newFilter = new PrismarksFilter();
			
			newFilter.Pnum = this.Pnum;
			newFilter.Msscarnumber = this.Msscarnumber;
			newFilter.Mslocation = this.Mslocation;
			newFilter.Mstyp = this.Mstyp;
			newFilter.Mstattootyp = this.Mstattootyp;
			newFilter.Msdscp = this.Msdscp;
			newFilter.Lkupdscp = this.Lkupdscp;
			newFilter.Tattyptxt = this.Tattyptxt;
			
			return newFilter;
		}
	}
	public final class PrismarksEditFilter
	{			
		public boolean IncludePnum = true;
		public boolean IncludeMsscarnumber = true;
		public boolean IncludeMslocation = true;
		public boolean IncludeMstyp = true;
		public boolean IncludeMstattootyp = true;
		public boolean IncludeMsdscp = true;
		public boolean IncludeLkupdscp = true;
		public boolean IncludeTattyptxt = true;
		
		public void includeAll()
		{				
			IncludePnum = true;
			IncludeMsscarnumber = true;
			IncludeMslocation = true;
			IncludeMstyp = true;
			IncludeMstattootyp = true;
			IncludeMsdscp = true;
			IncludeLkupdscp = true;
			IncludeTattyptxt = true;
		}	
		public void excludeAll()
		{				
			IncludePnum = false;
			IncludeMsscarnumber = false;
			IncludeMslocation = false;
			IncludeMstyp = false;
			IncludeMstattootyp = false;
			IncludeMsdscp = false;
			IncludeLkupdscp = false;
			IncludeTattyptxt = false;
		}
		public PrismarksEditFilter cloneObject()
		{
			PrismarksEditFilter newEditFilter = new PrismarksEditFilter();
			
			newEditFilter.IncludePnum = this.IncludePnum;
			newEditFilter.IncludeMsscarnumber = this.IncludeMsscarnumber;
			newEditFilter.IncludeMslocation = this.IncludeMslocation;
			newEditFilter.IncludeMstyp = this.IncludeMstyp;
			newEditFilter.IncludeMstattootyp = this.IncludeMstattootyp;
			newEditFilter.IncludeMsdscp = this.IncludeMsdscp;
			newEditFilter.IncludeLkupdscp = this.IncludeLkupdscp;
			newEditFilter.IncludeTattyptxt = this.IncludeTattyptxt;
			
			return newEditFilter;
		}
	}
}
