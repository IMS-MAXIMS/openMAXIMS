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

public final class Go_tgp_clas implements ims.vo.ImsCloneable
{
	private Go_tgp_clasFilter lastGetFilter = null;
	private final String serviceName = "GO_TGP_CLAS";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Go_tgp_clasFilter Filter = new Go_tgp_clasFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Go_tgp_clasEditFilter EditFilter = new Go_tgp_clasEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Go_tgp_clasCollection DataCollection = new Go_tgp_clasCollection();

	/**
	 * Creates a new Go_tgp_clas Data Transfer Object.
	 */ 
	public Go_tgp_clas(ims.dto.Connection connection)
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
	public Go_tgp_clas cloneObject()
	{
		Go_tgp_clas cloneObject = new Go_tgp_clas(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Go_tgp_clas_id = DataCollection.get(x).Go_tgp_clas_id;
			cloneObject.DataCollection.get(index).Orderno = DataCollection.get(x).Orderno;
			cloneObject.DataCollection.get(index).Go_tgroup_id = DataCollection.get(x).Go_tgroup_id;
			cloneObject.DataCollection.get(index).Go_tsite_id = DataCollection.get(x).Go_tsite_id;
			cloneObject.DataCollection.get(index).Cattype = DataCollection.get(x).Cattype;
			cloneObject.DataCollection.get(index).Clasval = DataCollection.get(x).Clasval;
			cloneObject.DataCollection.get(index).Clasdesc = DataCollection.get(x).Clasdesc;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.2.92.4 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Go_tgp_clas.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgp_clas.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Go_tgp_clas.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgp_clas.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgp_clas.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgp_clas.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Go_tgp_clas.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Go_tgp_clas.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgp_clas.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Go_tgp_clas.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Go_tgp_clas.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Go_tgp_clas.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Go_tgp_clas.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Go_tgp_clas.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgp_clas.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Go_tgp_clas.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Go_tgp_clas.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Go_tgp_clas.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Go_tgp_clas.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Go_tgp_clas.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgp_clas.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Go_tgp_clas.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Go_tgp_clas.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgp_clas.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Go_tgp_clas.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Go_tgp_clas.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Go_tgp_clas.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_tgp_clas.List");
							
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
	private String encodeNASFilter(Go_tgp_clasFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Go_tgp_clas_id != null && filter.Go_tgp_clas_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GO_TGP_CLAS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Go_tgp_clas_id;
		}
		
		if(Filter.Orderno != null && filter.Orderno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORDERNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Orderno;
		}
		
		if(Filter.Go_tgroup_id != null && filter.Go_tgroup_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GO_TGROUP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Go_tgroup_id;
		}
		
		if(Filter.Go_tsite_id != null && filter.Go_tsite_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GO_TSITE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Go_tsite_id;
		}
		
		if(Filter.Cattype != null && filter.Cattype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CATTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cattype;
		}
		
		if(Filter.Clasval != null && filter.Clasval.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLASVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clasval;
		}
		
		if(Filter.Clasdesc != null && filter.Clasdesc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLASDESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clasdesc;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Go_tgp_clasRecord data = (Go_tgp_clasRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeGo_tgp_clas_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "GO_TGP_CLAS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Go_tgp_clas_id);
		}
		
		if(EditFilter.IncludeOrderno)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORDERNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Orderno);
		}
		
		if(EditFilter.IncludeGo_tgroup_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "GO_TGROUP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Go_tgroup_id);
		}
		
		if(EditFilter.IncludeGo_tsite_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "GO_TSITE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Go_tsite_id);
		}
		
		if(EditFilter.IncludeCattype)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CATTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cattype);
		}
		
		if(EditFilter.IncludeClasval)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLASVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clasval);
		}
		
		if(EditFilter.IncludeClasdesc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLASDESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clasdesc);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat);
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
			Go_tgp_clasRecord record = new Go_tgp_clasRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Go_tgp_clas_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_TGP_CLAS_ID"));
			record.Orderno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORDERNO"));
			record.Go_tgroup_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_TGROUP_ID"));
			record.Go_tsite_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_TSITE_ID"));
			record.Cattype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CATTYPE"));
			record.Clasval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLASVAL"));
			record.Clasdesc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLASDESC"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
									
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
			Go_tgp_clasRecord record = new Go_tgp_clasRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Go_tgp_clas_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_TGP_CLAS_ID"));
			record.Orderno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORDERNO"));
			record.Go_tgroup_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_TGROUP_ID"));
			record.Go_tsite_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_TSITE_ID"));
			record.Cattype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CATTYPE"));
			record.Clasval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLASVAL"));
			record.Clasdesc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLASDESC"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Go_tgp_clasCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Go_tgp_clasRecord newRecord = new Go_tgp_clasRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Go_tgp_clasRecord record)
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
		public Go_tgp_clasRecord get(int index)
		{
			return (Go_tgp_clasRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Go_tgp_clasRecord
	{
		public String Go_tgp_clas_id = "";
		public String Orderno = "";
		public String Go_tgroup_id = "";
		public String Go_tsite_id = "";
		public String Cattype = "";
		public String Clasval = "";
		public String Clasdesc = "";
		public String Tstp = "";
		public String Stat = "";
				
		
		public void clear()
		{
			Go_tgp_clas_id = "";
			Orderno = "";
			Go_tgroup_id = "";
			Go_tsite_id = "";
			Cattype = "";
			Clasval = "";
			Clasdesc = "";
			Tstp = "";
			Stat = "";
			
		}		
	}
		
		
	public final class Go_tgp_clasFilter
	{			
		public String Go_tgp_clas_id = "";
		public String Orderno = "";
		public String Go_tgroup_id = "";
		public String Go_tsite_id = "";
		public String Cattype = "";
		public String Clasval = "";
		public String Clasdesc = "";
		public String Tstp = "";
		public String Stat = "";
		
		public void clear()
		{				
			Go_tgp_clas_id = "";
			Orderno = "";
			Go_tgroup_id = "";
			Go_tsite_id = "";
			Cattype = "";
			Clasval = "";
			Clasdesc = "";
			Tstp = "";
			Stat = "";
		}	
		public Go_tgp_clasFilter cloneObject()
		{
			Go_tgp_clasFilter newFilter = new Go_tgp_clasFilter();
			
			newFilter.Go_tgp_clas_id = this.Go_tgp_clas_id;
			newFilter.Orderno = this.Orderno;
			newFilter.Go_tgroup_id = this.Go_tgroup_id;
			newFilter.Go_tsite_id = this.Go_tsite_id;
			newFilter.Cattype = this.Cattype;
			newFilter.Clasval = this.Clasval;
			newFilter.Clasdesc = this.Clasdesc;
			newFilter.Tstp = this.Tstp;
			newFilter.Stat = this.Stat;
			
			return newFilter;
		}
	}
	public final class Go_tgp_clasEditFilter
	{			
		public boolean IncludeGo_tgp_clas_id = true;
		public boolean IncludeOrderno = true;
		public boolean IncludeGo_tgroup_id = true;
		public boolean IncludeGo_tsite_id = true;
		public boolean IncludeCattype = true;
		public boolean IncludeClasval = true;
		public boolean IncludeClasdesc = true;
		public boolean IncludeTstp = true;
		public boolean IncludeStat = true;
		
		public void includeAll()
		{				
			IncludeGo_tgp_clas_id = true;
			IncludeOrderno = true;
			IncludeGo_tgroup_id = true;
			IncludeGo_tsite_id = true;
			IncludeCattype = true;
			IncludeClasval = true;
			IncludeClasdesc = true;
			IncludeTstp = true;
			IncludeStat = true;
		}	
		public void excludeAll()
		{				
			IncludeGo_tgp_clas_id = false;
			IncludeOrderno = false;
			IncludeGo_tgroup_id = false;
			IncludeGo_tsite_id = false;
			IncludeCattype = false;
			IncludeClasval = false;
			IncludeClasdesc = false;
			IncludeTstp = false;
			IncludeStat = false;
		}
		public Go_tgp_clasEditFilter cloneObject()
		{
			Go_tgp_clasEditFilter newEditFilter = new Go_tgp_clasEditFilter();
			
			newEditFilter.IncludeGo_tgp_clas_id = this.IncludeGo_tgp_clas_id;
			newEditFilter.IncludeOrderno = this.IncludeOrderno;
			newEditFilter.IncludeGo_tgroup_id = this.IncludeGo_tgroup_id;
			newEditFilter.IncludeGo_tsite_id = this.IncludeGo_tsite_id;
			newEditFilter.IncludeCattype = this.IncludeCattype;
			newEditFilter.IncludeClasval = this.IncludeClasval;
			newEditFilter.IncludeClasdesc = this.IncludeClasdesc;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeStat = this.IncludeStat;
			
			return newEditFilter;
		}
	}
}
