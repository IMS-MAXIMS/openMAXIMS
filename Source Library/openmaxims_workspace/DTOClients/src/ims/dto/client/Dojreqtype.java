//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// Template ver. 1.0.5 - Last modified on 30/04/2004 10:13 by Marius Mihalec

package ims.dto.client;

public final class Dojreqtype
{
	private DojreqtypeFilter lastGetFilter = null;
	private final String serviceName = "DOJREQTYPE";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public DojreqtypeFilter Filter = new DojreqtypeFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public DojreqtypeEditFilter EditFilter = new DojreqtypeEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public DojreqtypeCollection DataCollection = new DojreqtypeCollection();

	/**
	 * Creates a new Dojreqtype Data Transfer Object.
	 */ 
	public Dojreqtype(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Dojreqtype cloneObject() throws ims.dto.Exception
	{
		Dojreqtype cloneObject = new Dojreqtype(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Unid = DataCollection.get(x).Unid;
			cloneObject.DataCollection.get(index).Name = DataCollection.get(x).Name;
			cloneObject.DataCollection.get(index).Dayscomp = DataCollection.get(x).Dayscomp;
			cloneObject.DataCollection.get(index).Targettab = DataCollection.get(x).Targettab;
			cloneObject.DataCollection.get(index).Urineflag = DataCollection.get(x).Urineflag;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "7";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Dojreqtype.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojreqtype.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Dojreqtype.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojreqtype.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojreqtype.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojreqtype.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Dojreqtype.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Dojreqtype.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojreqtype.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Dojreqtype.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Dojreqtype.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Dojreqtype.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Dojreqtype.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojreqtype.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojreqtype.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Dojreqtype.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Dojreqtype.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Dojreqtype.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Dojreqtype.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojreqtype.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojreqtype.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Dojreqtype.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Dojreqtype.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojreqtype.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Dojreqtype.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Dojreqtype.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Dojreqtype.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojreqtype.List");
							
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
	private String encodeNASFilter(DojreqtypeFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Unid != null && filter.Unid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Unid;
		}
		
		if(Filter.Name != null && filter.Name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Name;
		}
		
		if(Filter.Dayscomp != null && filter.Dayscomp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DAYSCOMP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dayscomp;
		}
		
		if(Filter.Targettab != null && filter.Targettab.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TARGETTAB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Targettab;
		}
		
		if(Filter.Urineflag != null && filter.Urineflag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "URINEFLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Urineflag;
		}
		
		if(Filter.Active != null && filter.Active.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Active;
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
			
		DojreqtypeRecord data = (DojreqtypeRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeUnid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unid);
		}
		
		if(EditFilter.IncludeName)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Name);
		}
		
		if(EditFilter.IncludeDayscomp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DAYSCOMP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dayscomp);
		}
		
		if(EditFilter.IncludeTargettab)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TARGETTAB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Targettab);
		}
		
		if(EditFilter.IncludeUrineflag)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "URINEFLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Urineflag);
		}
		
		if(EditFilter.IncludeActive)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Active);
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
			DojreqtypeRecord record = new DojreqtypeRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Dayscomp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DAYSCOMP"));
			record.Targettab = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TARGETTAB"));
			record.Urineflag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "URINEFLAG"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
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
			DojreqtypeRecord record = new DojreqtypeRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Dayscomp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DAYSCOMP"));
			record.Targettab = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TARGETTAB"));
			record.Urineflag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "URINEFLAG"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class DojreqtypeCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DojreqtypeRecord newRecord = new DojreqtypeRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DojreqtypeRecord record)
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
		public DojreqtypeRecord get(int index)
		{
			return (DojreqtypeRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class DojreqtypeRecord
	{
		public String Unid = "";
		public String Name = "";
		public String Dayscomp = "";
		public String Targettab = "";
		public String Urineflag = "";
		public String Active = "";
		public String Tstp = "";
				
		
		public void clear()
		{
			Unid = "";
			Name = "";
			Dayscomp = "";
			Targettab = "";
			Urineflag = "";
			Active = "";
			Tstp = "";
			
		}		
	}
		
		
	public final class DojreqtypeFilter
	{			
		public String Unid = "";
		public String Name = "";
		public String Dayscomp = "";
		public String Targettab = "";
		public String Urineflag = "";
		public String Active = "";
		public String Tstp = "";
		
		public void clear()
		{				
			Unid = "";
			Name = "";
			Dayscomp = "";
			Targettab = "";
			Urineflag = "";
			Active = "";
			Tstp = "";
		}	
		public DojreqtypeFilter cloneObject()
		{
			DojreqtypeFilter newFilter = new DojreqtypeFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Name = this.Name;
			newFilter.Dayscomp = this.Dayscomp;
			newFilter.Targettab = this.Targettab;
			newFilter.Urineflag = this.Urineflag;
			newFilter.Active = this.Active;
			newFilter.Tstp = this.Tstp;
			
			return newFilter;
		}
	}
	public final class DojreqtypeEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludeName = true;
		public boolean IncludeDayscomp = true;
		public boolean IncludeTargettab = true;
		public boolean IncludeUrineflag = true;
		public boolean IncludeActive = true;
		public boolean IncludeTstp = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludeName = true;
			IncludeDayscomp = true;
			IncludeTargettab = true;
			IncludeUrineflag = true;
			IncludeActive = true;
			IncludeTstp = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludeName = false;
			IncludeDayscomp = false;
			IncludeTargettab = false;
			IncludeUrineflag = false;
			IncludeActive = false;
			IncludeTstp = false;
		}
		public DojreqtypeEditFilter cloneObject()
		{
			DojreqtypeEditFilter newEditFilter = new DojreqtypeEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludeName = this.IncludeName;
			newEditFilter.IncludeDayscomp = this.IncludeDayscomp;
			newEditFilter.IncludeTargettab = this.IncludeTargettab;
			newEditFilter.IncludeUrineflag = this.IncludeUrineflag;
			newEditFilter.IncludeActive = this.IncludeActive;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			
			return newEditFilter;
		}
	}
}
