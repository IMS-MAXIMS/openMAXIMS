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

public final class Dojrsf
{
	private DojrsfFilter lastGetFilter = null;
	private final String serviceName = "DOJRSF";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public DojrsfFilter Filter = new DojrsfFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public DojrsfEditFilter EditFilter = new DojrsfEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public DojrsfCollection DataCollection = new DojrsfCollection();

	/**
	 * Creates a new Dojrsf Data Transfer Object.
	 */ 
	public Dojrsf(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Dojrsf cloneObject() throws ims.dto.Exception
	{
		Dojrsf cloneObject = new Dojrsf(Connection);
			
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
			cloneObject.DataCollection.get(index).Estabcd = DataCollection.get(x).Estabcd;
			cloneObject.DataCollection.get(index).Name = DataCollection.get(x).Name;
			cloneObject.DataCollection.get(index).Restype = DataCollection.get(x).Restype;
			cloneObject.DataCollection.get(index).Prescribe = DataCollection.get(x).Prescribe;
			cloneObject.DataCollection.get(index).Stoppres = DataCollection.get(x).Stoppres;
			cloneObject.DataCollection.get(index).Request = DataCollection.get(x).Request;
			cloneObject.DataCollection.get(index).At01 = DataCollection.get(x).At01;
			cloneObject.DataCollection.get(index).At02 = DataCollection.get(x).At02;
			cloneObject.DataCollection.get(index).At03 = DataCollection.get(x).At03;
			cloneObject.DataCollection.get(index).At04 = DataCollection.get(x).At04;
			cloneObject.DataCollection.get(index).At06 = DataCollection.get(x).At06;
			cloneObject.DataCollection.get(index).Template = DataCollection.get(x).Template;
			cloneObject.DataCollection.get(index).Restypetxt = DataCollection.get(x).Restypetxt;
							
			
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
		return "Dojrsf.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrsf.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Dojrsf.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrsf.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrsf.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrsf.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Dojrsf.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Dojrsf.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrsf.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Dojrsf.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Dojrsf.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Dojrsf.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Dojrsf.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojrsf.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrsf.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Dojrsf.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Dojrsf.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Dojrsf.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Dojrsf.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojrsf.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrsf.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Dojrsf.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Dojrsf.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrsf.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Dojrsf.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Dojrsf.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Dojrsf.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrsf.List");
							
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
	private String encodeNASFilter(DojrsfFilter filter)
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
		
		if(Filter.Estabcd != null && filter.Estabcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ESTABCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Estabcd;
		}
		
		if(Filter.Name != null && filter.Name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Name;
		}
		
		if(Filter.Restype != null && filter.Restype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Restype;
		}
		
		if(Filter.Prescribe != null && filter.Prescribe.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PRESCRIBE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prescribe;
		}
		
		if(Filter.Stoppres != null && filter.Stoppres.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STOPPRES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stoppres;
		}
		
		if(Filter.Request != null && filter.Request.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQUEST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Request;
		}
		
		if(Filter.At01 != null && filter.At01.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT01" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At01;
		}
		
		if(Filter.At02 != null && filter.At02.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT02" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At02;
		}
		
		if(Filter.At03 != null && filter.At03.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT03" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At03;
		}
		
		if(Filter.At04 != null && filter.At04.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT04" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At04;
		}
		
		if(Filter.At06 != null && filter.At06.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT06" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At06;
		}
		
		if(Filter.Template != null && filter.Template.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TEMPLATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Template;
		}
		
		if(Filter.Restypetxt != null && filter.Restypetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Restypetxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		DojrsfRecord data = (DojrsfRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeUnid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unid);
		}
		
		if(EditFilter.IncludeEstabcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ESTABCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Estabcd);
		}
		
		if(EditFilter.IncludeName)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Name);
		}
		
		if(EditFilter.IncludeRestype)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Restype);
		}
		
		if(EditFilter.IncludePrescribe)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PRESCRIBE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prescribe);
		}
		
		if(EditFilter.IncludeStoppres)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STOPPRES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stoppres);
		}
		
		if(EditFilter.IncludeRequest)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQUEST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Request);
		}
		
		if(EditFilter.IncludeAt01)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AT01" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At01);
		}
		
		if(EditFilter.IncludeAt02)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AT02" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At02);
		}
		
		if(EditFilter.IncludeAt03)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AT03" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At03);
		}
		
		if(EditFilter.IncludeAt04)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AT04" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At04);
		}
		
		if(EditFilter.IncludeAt06)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AT06" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At06);
		}
		
		if(EditFilter.IncludeTemplate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TEMPLATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Template);
		}
		
		if(EditFilter.IncludeRestypetxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Restypetxt);
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
			DojrsfRecord record = new DojrsfRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Estabcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTABCD"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Restype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESTYPE"));
			record.Prescribe = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRESCRIBE"));
			record.Stoppres = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STOPPRES"));
			record.Request = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQUEST"));
			record.At01 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT01"));
			record.At02 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT02"));
			record.At03 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT03"));
			record.At04 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT04"));
			record.At06 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT06"));
			record.Template = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEMPLATE"));
			record.Restypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESTYPETXT"));
									
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
			DojrsfRecord record = new DojrsfRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Estabcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTABCD"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Restype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESTYPE"));
			record.Prescribe = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRESCRIBE"));
			record.Stoppres = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STOPPRES"));
			record.Request = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQUEST"));
			record.At01 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT01"));
			record.At02 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT02"));
			record.At03 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT03"));
			record.At04 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT04"));
			record.At06 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT06"));
			record.Template = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEMPLATE"));
			record.Restypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESTYPETXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class DojrsfCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DojrsfRecord newRecord = new DojrsfRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DojrsfRecord record)
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
		public DojrsfRecord get(int index)
		{
			return (DojrsfRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class DojrsfRecord
	{
		public String Unid = "";
		public String Estabcd = "";
		public String Name = "";
		public String Restype = "";
		public String Prescribe = "";
		public String Stoppres = "";
		public String Request = "";
		public String At01 = "";
		public String At02 = "";
		public String At03 = "";
		public String At04 = "";
		public String At06 = "";
		public String Template = "";
		public String Restypetxt = "";
				
		
		public void clear()
		{
			Unid = "";
			Estabcd = "";
			Name = "";
			Restype = "";
			Prescribe = "";
			Stoppres = "";
			Request = "";
			At01 = "";
			At02 = "";
			At03 = "";
			At04 = "";
			At06 = "";
			Template = "";
			Restypetxt = "";
			
		}		
	}
		
		
	public final class DojrsfFilter
	{			
		public String Unid = "";
		public String Estabcd = "";
		public String Name = "";
		public String Restype = "";
		public String Prescribe = "";
		public String Stoppres = "";
		public String Request = "";
		public String At01 = "";
		public String At02 = "";
		public String At03 = "";
		public String At04 = "";
		public String At06 = "";
		public String Template = "";
		public String Restypetxt = "";
		
		public void clear()
		{				
			Unid = "";
			Estabcd = "";
			Name = "";
			Restype = "";
			Prescribe = "";
			Stoppres = "";
			Request = "";
			At01 = "";
			At02 = "";
			At03 = "";
			At04 = "";
			At06 = "";
			Template = "";
			Restypetxt = "";
		}	
		public DojrsfFilter cloneObject()
		{
			DojrsfFilter newFilter = new DojrsfFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Estabcd = this.Estabcd;
			newFilter.Name = this.Name;
			newFilter.Restype = this.Restype;
			newFilter.Prescribe = this.Prescribe;
			newFilter.Stoppres = this.Stoppres;
			newFilter.Request = this.Request;
			newFilter.At01 = this.At01;
			newFilter.At02 = this.At02;
			newFilter.At03 = this.At03;
			newFilter.At04 = this.At04;
			newFilter.At06 = this.At06;
			newFilter.Template = this.Template;
			newFilter.Restypetxt = this.Restypetxt;
			
			return newFilter;
		}
	}
	public final class DojrsfEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludeEstabcd = true;
		public boolean IncludeName = true;
		public boolean IncludeRestype = true;
		public boolean IncludePrescribe = true;
		public boolean IncludeStoppres = true;
		public boolean IncludeRequest = true;
		public boolean IncludeAt01 = true;
		public boolean IncludeAt02 = true;
		public boolean IncludeAt03 = true;
		public boolean IncludeAt04 = true;
		public boolean IncludeAt06 = true;
		public boolean IncludeTemplate = true;
		public boolean IncludeRestypetxt = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludeEstabcd = true;
			IncludeName = true;
			IncludeRestype = true;
			IncludePrescribe = true;
			IncludeStoppres = true;
			IncludeRequest = true;
			IncludeAt01 = true;
			IncludeAt02 = true;
			IncludeAt03 = true;
			IncludeAt04 = true;
			IncludeAt06 = true;
			IncludeTemplate = true;
			IncludeRestypetxt = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludeEstabcd = false;
			IncludeName = false;
			IncludeRestype = false;
			IncludePrescribe = false;
			IncludeStoppres = false;
			IncludeRequest = false;
			IncludeAt01 = false;
			IncludeAt02 = false;
			IncludeAt03 = false;
			IncludeAt04 = false;
			IncludeAt06 = false;
			IncludeTemplate = false;
			IncludeRestypetxt = false;
		}
		public DojrsfEditFilter cloneObject()
		{
			DojrsfEditFilter newEditFilter = new DojrsfEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludeEstabcd = this.IncludeEstabcd;
			newEditFilter.IncludeName = this.IncludeName;
			newEditFilter.IncludeRestype = this.IncludeRestype;
			newEditFilter.IncludePrescribe = this.IncludePrescribe;
			newEditFilter.IncludeStoppres = this.IncludeStoppres;
			newEditFilter.IncludeRequest = this.IncludeRequest;
			newEditFilter.IncludeAt01 = this.IncludeAt01;
			newEditFilter.IncludeAt02 = this.IncludeAt02;
			newEditFilter.IncludeAt03 = this.IncludeAt03;
			newEditFilter.IncludeAt04 = this.IncludeAt04;
			newEditFilter.IncludeAt06 = this.IncludeAt06;
			newEditFilter.IncludeTemplate = this.IncludeTemplate;
			newEditFilter.IncludeRestypetxt = this.IncludeRestypetxt;
			
			return newEditFilter;
		}
	}
}
