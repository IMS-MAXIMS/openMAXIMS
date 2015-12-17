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

public final class Eqploan
{
	private EqploanFilter lastGetFilter = null;
	private final String serviceName = "EQPLOAN";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public EqploanFilter Filter = new EqploanFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public EqploanEditFilter EditFilter = new EqploanEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public EqploanCollection DataCollection = new EqploanCollection();

	/**
	 * Creates a new Eqploan Data Transfer Object.
	 */ 
	public Eqploan(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Eqploan cloneObject() throws ims.dto.Exception
	{
		Eqploan cloneObject = new Eqploan(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Lnid = DataCollection.get(x).Lnid;
			cloneObject.DataCollection.get(index).Pnum = DataCollection.get(x).Pnum;
			cloneObject.DataCollection.get(index).Itemid = DataCollection.get(x).Itemid;
			cloneObject.DataCollection.get(index).Datout = DataCollection.get(x).Datout;
			cloneObject.DataCollection.get(index).Datdue = DataCollection.get(x).Datdue;
			cloneObject.DataCollection.get(index).Datin = DataCollection.get(x).Datin;
			cloneObject.DataCollection.get(index).Fine = DataCollection.get(x).Fine;
			cloneObject.DataCollection.get(index).Woff = DataCollection.get(x).Woff;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Desc = DataCollection.get(x).Desc;
			cloneObject.DataCollection.get(index).Sernum = DataCollection.get(x).Sernum;
							
			
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
		return "Eqploan.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Eqploan.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Eqploan.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Eqploan.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Eqploan.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Eqploan.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Eqploan.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Eqploan.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Eqploan.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Eqploan.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Eqploan.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Eqploan.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Eqploan.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Eqploan.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Eqploan.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Eqploan.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Eqploan.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Eqploan.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Eqploan.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Eqploan.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Eqploan.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Eqploan.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Eqploan.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Eqploan.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Eqploan.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Eqploan.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Eqploan.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Eqploan.List");
							
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
	private String encodeNASFilter(EqploanFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Lnid != null && filter.Lnid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lnid;
		}
		
		if(Filter.Pnum != null && filter.Pnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnum;
		}
		
		if(Filter.Itemid != null && filter.Itemid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ITEMID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Itemid;
		}
		
		if(Filter.Datout != null && filter.Datout.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DATOUT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Datout;
		}
		
		if(Filter.Datdue != null && filter.Datdue.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DATDUE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Datdue;
		}
		
		if(Filter.Datin != null && filter.Datin.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DATIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Datin;
		}
		
		if(Filter.Fine != null && filter.Fine.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FINE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fine;
		}
		
		if(Filter.Woff != null && filter.Woff.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WOFF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Woff;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Desc != null && filter.Desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Desc;
		}
		
		if(Filter.Sernum != null && filter.Sernum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SERNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sernum;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		EqploanRecord data = (EqploanRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeLnid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lnid);
		}
		
		if(EditFilter.IncludePnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnum);
		}
		
		if(EditFilter.IncludeItemid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ITEMID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Itemid);
		}
		
		if(EditFilter.IncludeDatout)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DATOUT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Datout);
		}
		
		if(EditFilter.IncludeDatdue)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DATDUE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Datdue);
		}
		
		if(EditFilter.IncludeDatin)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DATIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Datin);
		}
		
		if(EditFilter.IncludeFine)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "FINE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fine);
		}
		
		if(EditFilter.IncludeWoff)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WOFF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Woff);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeDesc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Desc);
		}
		
		if(EditFilter.IncludeSernum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SERNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sernum);
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
			EqploanRecord record = new EqploanRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Lnid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LNID"));
			record.Pnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNUM"));
			record.Itemid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ITEMID"));
			record.Datout = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATOUT"));
			record.Datdue = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATDUE"));
			record.Datin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATIN"));
			record.Fine = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FINE"));
			record.Woff = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WOFF"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DESC"));
			record.Sernum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SERNUM"));
									
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
			EqploanRecord record = new EqploanRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Lnid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LNID"));
			record.Pnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNUM"));
			record.Itemid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ITEMID"));
			record.Datout = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATOUT"));
			record.Datdue = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATDUE"));
			record.Datin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATIN"));
			record.Fine = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FINE"));
			record.Woff = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WOFF"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DESC"));
			record.Sernum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SERNUM"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class EqploanCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			EqploanRecord newRecord = new EqploanRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(EqploanRecord record)
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
		public EqploanRecord get(int index)
		{
			return (EqploanRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class EqploanRecord
	{
		public String Lnid = "";
		public String Pnum = "";
		public String Itemid = "";
		public String Datout = "";
		public String Datdue = "";
		public String Datin = "";
		public String Fine = "";
		public String Woff = "";
		public String Tstp = "";
		public String Desc = "";
		public String Sernum = "";
				
		
		public void clear()
		{
			Lnid = "";
			Pnum = "";
			Itemid = "";
			Datout = "";
			Datdue = "";
			Datin = "";
			Fine = "";
			Woff = "";
			Tstp = "";
			Desc = "";
			Sernum = "";
			
		}		
	}
		
		
	public final class EqploanFilter
	{			
		public String Lnid = "";
		public String Pnum = "";
		public String Itemid = "";
		public String Datout = "";
		public String Datdue = "";
		public String Datin = "";
		public String Fine = "";
		public String Woff = "";
		public String Tstp = "";
		public String Desc = "";
		public String Sernum = "";
		
		public void clear()
		{				
			Lnid = "";
			Pnum = "";
			Itemid = "";
			Datout = "";
			Datdue = "";
			Datin = "";
			Fine = "";
			Woff = "";
			Tstp = "";
			Desc = "";
			Sernum = "";
		}	
		public EqploanFilter cloneObject()
		{
			EqploanFilter newFilter = new EqploanFilter();
			
			newFilter.Lnid = this.Lnid;
			newFilter.Pnum = this.Pnum;
			newFilter.Itemid = this.Itemid;
			newFilter.Datout = this.Datout;
			newFilter.Datdue = this.Datdue;
			newFilter.Datin = this.Datin;
			newFilter.Fine = this.Fine;
			newFilter.Woff = this.Woff;
			newFilter.Tstp = this.Tstp;
			newFilter.Desc = this.Desc;
			newFilter.Sernum = this.Sernum;
			
			return newFilter;
		}
	}
	public final class EqploanEditFilter
	{			
		public boolean IncludeLnid = true;
		public boolean IncludePnum = true;
		public boolean IncludeItemid = true;
		public boolean IncludeDatout = true;
		public boolean IncludeDatdue = true;
		public boolean IncludeDatin = true;
		public boolean IncludeFine = true;
		public boolean IncludeWoff = true;
		public boolean IncludeTstp = true;
		public boolean IncludeDesc = true;
		public boolean IncludeSernum = true;
		
		public void includeAll()
		{				
			IncludeLnid = true;
			IncludePnum = true;
			IncludeItemid = true;
			IncludeDatout = true;
			IncludeDatdue = true;
			IncludeDatin = true;
			IncludeFine = true;
			IncludeWoff = true;
			IncludeTstp = true;
			IncludeDesc = true;
			IncludeSernum = true;
		}	
		public void excludeAll()
		{				
			IncludeLnid = false;
			IncludePnum = false;
			IncludeItemid = false;
			IncludeDatout = false;
			IncludeDatdue = false;
			IncludeDatin = false;
			IncludeFine = false;
			IncludeWoff = false;
			IncludeTstp = false;
			IncludeDesc = false;
			IncludeSernum = false;
		}
		public EqploanEditFilter cloneObject()
		{
			EqploanEditFilter newEditFilter = new EqploanEditFilter();
			
			newEditFilter.IncludeLnid = this.IncludeLnid;
			newEditFilter.IncludePnum = this.IncludePnum;
			newEditFilter.IncludeItemid = this.IncludeItemid;
			newEditFilter.IncludeDatout = this.IncludeDatout;
			newEditFilter.IncludeDatdue = this.IncludeDatdue;
			newEditFilter.IncludeDatin = this.IncludeDatin;
			newEditFilter.IncludeFine = this.IncludeFine;
			newEditFilter.IncludeWoff = this.IncludeWoff;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeDesc = this.IncludeDesc;
			newEditFilter.IncludeSernum = this.IncludeSernum;
			
			return newEditFilter;
		}
	}
}
