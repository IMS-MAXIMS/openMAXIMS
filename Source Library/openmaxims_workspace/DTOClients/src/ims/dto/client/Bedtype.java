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
// Template ver. 1.0.2 - Last modified on 08/03/2004 10:42 by Marius Mihalec

package ims.dto.client;

public final class Bedtype
{
	private BedtypeFilter lastGetFilter = null;
	private final String serviceName = "BEDTYPE";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public BedtypeFilter Filter = new BedtypeFilter();			
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public BedtypeCollection DataCollection = new BedtypeCollection();

	/**
	 * Creates a new Bedtype Data Transfer Object.
	 */ 
	public Bedtype(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Bedtype cloneObject() throws ims.dto.Exception
	{
		Bedtype cloneObject = new Bedtype(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Rsno = DataCollection.get(x).Rsno;
			cloneObject.DataCollection.get(index).Hpcd = DataCollection.get(x).Hpcd;
			cloneObject.DataCollection.get(index).Site = DataCollection.get(x).Site;
			cloneObject.DataCollection.get(index).Cfgdate = DataCollection.get(x).Cfgdate;
			cloneObject.DataCollection.get(index).Name = DataCollection.get(x).Name;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).At01 = DataCollection.get(x).At01;
			cloneObject.DataCollection.get(index).Desc = DataCollection.get(x).Desc;
			cloneObject.DataCollection.get(index).Allstat = DataCollection.get(x).Allstat;
			cloneObject.DataCollection.get(index).Btyp = DataCollection.get(x).Btyp;
			cloneObject.DataCollection.get(index).Mors = DataCollection.get(x).Mors;
			cloneObject.DataCollection.get(index).Dofw = DataCollection.get(x).Dofw;
			cloneObject.DataCollection.get(index).Nbed = DataCollection.get(x).Nbed;
			cloneObject.DataCollection.get(index).Maxno = DataCollection.get(x).Maxno;
							
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Bedtype.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Bedtype.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Bedtype.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Bedtype.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Bedtype.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Bedtype.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Bedtype.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Bedtype.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Bedtype.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Bedtype.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Bedtype.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Bedtype.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Bedtype.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Bedtype.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Bedtype.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Bedtype.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Bedtype.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Bedtype.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Bedtype.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Bedtype.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Bedtype.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Bedtype.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Bedtype.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Bedtype.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Bedtype.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Bedtype.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Bedtype.List");
							
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
	private String encodeNASFilter(BedtypeFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Rsno != null && filter.Rsno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RSNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rsno;
		}
		
		if(Filter.Hpcd != null && filter.Hpcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hpcd;
		}
		
		if(Filter.Site != null && filter.Site.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Site;
		}
		
		if(Filter.Cfgdate != null && filter.Cfgdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CFGDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cfgdate;
		}
		
		if(Filter.Name != null && filter.Name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Name;
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat;
		}
		
		if(Filter.At01 != null && filter.At01.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT01" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At01;
		}
		
		if(Filter.Desc != null && filter.Desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Desc;
		}
		
		if(Filter.Allstat != null && filter.Allstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ALLSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Allstat;
		}
		
		if(Filter.Btyp != null && filter.Btyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Btyp;
		}
		
		if(Filter.Mors != null && filter.Mors.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MORS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mors;
		}
		
		if(Filter.Dofw != null && filter.Dofw.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOFW" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dofw;
		}
		
		if(Filter.Nbed != null && filter.Nbed.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NBED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nbed;
		}
		
		if(Filter.Maxno != null && filter.Maxno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAXNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Maxno;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		BedtypeRecord data = (BedtypeRecord)DataCollection.get(0);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RSNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rsno);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hpcd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Site);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "CFGDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cfgdate);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Name);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT01" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At01);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Desc);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ALLSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Allstat);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "BTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Btyp);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "MORS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mors);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "DOFW" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dofw);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "NBED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nbed);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "MAXNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Maxno);
		
		
			
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
			BedtypeRecord record = new BedtypeRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSNO"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
			record.Site = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SITE"));
			record.Cfgdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFGDATE"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.At01 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT01"));
			record.Desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DESC"));
			record.Allstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALLSTAT"));
			record.Btyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BTYP"));
			record.Mors = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MORS"));
			record.Dofw = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOFW"));
			record.Nbed = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NBED"));
			record.Maxno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXNO"));
									
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
			BedtypeRecord record = new BedtypeRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSNO"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
			record.Site = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SITE"));
			record.Cfgdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFGDATE"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.At01 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT01"));
			record.Desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DESC"));
			record.Allstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALLSTAT"));
			record.Btyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BTYP"));
			record.Mors = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MORS"));
			record.Dofw = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOFW"));
			record.Nbed = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NBED"));
			record.Maxno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXNO"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class BedtypeCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			BedtypeRecord newRecord = new BedtypeRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(BedtypeRecord record)
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
		public BedtypeRecord get(int index)
		{
			return (BedtypeRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class BedtypeRecord
	{
		public String Rsno = "";
		public String Hpcd = "";
		public String Site = "";
		public String Cfgdate = "";
		public String Name = "";
		public String Stat = "";
		public String At01 = "";
		public String Desc = "";
		public String Allstat = "";
		public String Btyp = "";
		public String Mors = "";
		public String Dofw = "";
		public String Nbed = "";
		public String Maxno = "";
				
		
		public void clear()
		{
			Rsno = "";
			Hpcd = "";
			Site = "";
			Cfgdate = "";
			Name = "";
			Stat = "";
			At01 = "";
			Desc = "";
			Allstat = "";
			Btyp = "";
			Mors = "";
			Dofw = "";
			Nbed = "";
			Maxno = "";
			
		}		
	}
		
		
	public final class BedtypeFilter
	{			
		public String Rsno = "";
		public String Hpcd = "";
		public String Site = "";
		public String Cfgdate = "";
		public String Name = "";
		public String Stat = "";
		public String At01 = "";
		public String Desc = "";
		public String Allstat = "";
		public String Btyp = "";
		public String Mors = "";
		public String Dofw = "";
		public String Nbed = "";
		public String Maxno = "";
		
		public void clear()
		{				
			Rsno = "";
			Hpcd = "";
			Site = "";
			Cfgdate = "";
			Name = "";
			Stat = "";
			At01 = "";
			Desc = "";
			Allstat = "";
			Btyp = "";
			Mors = "";
			Dofw = "";
			Nbed = "";
			Maxno = "";
		}	
		public BedtypeFilter cloneObject()
		{
			BedtypeFilter newFilter = new BedtypeFilter();
			
			newFilter.Rsno = this.Rsno;
			newFilter.Hpcd = this.Hpcd;
			newFilter.Site = this.Site;
			newFilter.Cfgdate = this.Cfgdate;
			newFilter.Name = this.Name;
			newFilter.Stat = this.Stat;
			newFilter.At01 = this.At01;
			newFilter.Desc = this.Desc;
			newFilter.Allstat = this.Allstat;
			newFilter.Btyp = this.Btyp;
			newFilter.Mors = this.Mors;
			newFilter.Dofw = this.Dofw;
			newFilter.Nbed = this.Nbed;
			newFilter.Maxno = this.Maxno;
			
			return newFilter;
		}
	}
}
