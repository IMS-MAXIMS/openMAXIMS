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

public final class Dojequipment
{
	private DojequipmentFilter lastGetFilter = null;
	private final String serviceName = "DOJEQUIPMENT";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public DojequipmentFilter Filter = new DojequipmentFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public DojequipmentEditFilter EditFilter = new DojequipmentEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public DojequipmentCollection DataCollection = new DojequipmentCollection();

	/**
	 * Creates a new Dojequipment Data Transfer Object.
	 */ 
	public Dojequipment(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Dojequipment cloneObject() throws ims.dto.Exception
	{
		Dojequipment cloneObject = new Dojequipment(Connection);
			
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
			cloneObject.DataCollection.get(index).Serial = DataCollection.get(x).Serial;
			cloneObject.DataCollection.get(index).Eqptype = DataCollection.get(x).Eqptype;
			cloneObject.DataCollection.get(index).Dscp = DataCollection.get(x).Dscp;
			cloneObject.DataCollection.get(index).Estab = DataCollection.get(x).Estab;
			cloneObject.DataCollection.get(index).Wo = DataCollection.get(x).Wo;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Comment = DataCollection.get(x).Comment;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Eqptypetxt = DataCollection.get(x).Eqptypetxt;
			cloneObject.DataCollection.get(index).Datedue = DataCollection.get(x).Datedue;
			cloneObject.DataCollection.get(index).Dateret = DataCollection.get(x).Dateret;
			cloneObject.DataCollection.get(index).Estabtxt = DataCollection.get(x).Estabtxt;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "5";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Dojequipment.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojequipment.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Dojequipment.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojequipment.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojequipment.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojequipment.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Dojequipment.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Dojequipment.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojequipment.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Dojequipment.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Dojequipment.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Dojequipment.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Dojequipment.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojequipment.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojequipment.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Dojequipment.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Dojequipment.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Dojequipment.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Dojequipment.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojequipment.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojequipment.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Dojequipment.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Dojequipment.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojequipment.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Dojequipment.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Dojequipment.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Dojequipment.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojequipment.List");
							
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
	private String encodeNASFilter(DojequipmentFilter filter)
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
		
		if(Filter.Serial != null && filter.Serial.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SERIAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Serial;
		}
		
		if(Filter.Eqptype != null && filter.Eqptype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EQPTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eqptype;
		}
		
		if(Filter.Dscp != null && filter.Dscp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DSCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dscp;
		}
		
		if(Filter.Estab != null && filter.Estab.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ESTAB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Estab;
		}
		
		if(Filter.Wo != null && filter.Wo.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wo;
		}
		
		if(Filter.Active != null && filter.Active.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Active;
		}
		
		if(Filter.Comment != null && filter.Comment.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COMMENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Comment;
		}
		
		if(Filter.Rusr != null && filter.Rusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusr;
		}
		
		if(Filter.Rdat != null && filter.Rdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rdat;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Eqptypetxt != null && filter.Eqptypetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EQPTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eqptypetxt;
		}
		
		if(Filter.Datedue != null && filter.Datedue.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DATEDUE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Datedue;
		}
		
		if(Filter.Dateret != null && filter.Dateret.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DATERET" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dateret;
		}
		
		if(Filter.Estabtxt != null && filter.Estabtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ESTABTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Estabtxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		DojequipmentRecord data = (DojequipmentRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeUnid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unid);
		}
		
		if(EditFilter.IncludeSerial)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SERIAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Serial);
		}
		
		if(EditFilter.IncludeEqptype)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EQPTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eqptype);
		}
		
		if(EditFilter.IncludeDscp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DSCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dscp);
		}
		
		if(EditFilter.IncludeEstab)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ESTAB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Estab);
		}
		
		if(EditFilter.IncludeWo)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wo);
		}
		
		if(EditFilter.IncludeActive)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Active);
		}
		
		if(EditFilter.IncludeComment)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COMMENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Comment);
		}
		
		if(EditFilter.IncludeRusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusr);
		}
		
		if(EditFilter.IncludeRdat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rdat);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeEqptypetxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EQPTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eqptypetxt);
		}
		
		if(EditFilter.IncludeDatedue)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DATEDUE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Datedue);
		}
		
		if(EditFilter.IncludeDateret)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DATERET" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dateret);
		}
		
		if(EditFilter.IncludeEstabtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ESTABTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Estabtxt);
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
			DojequipmentRecord record = new DojequipmentRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Serial = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SERIAL"));
			record.Eqptype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EQPTYPE"));
			record.Dscp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSCP"));
			record.Estab = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTAB"));
			record.Wo = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WO"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Comment = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMMENT"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Eqptypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EQPTYPETXT"));
			record.Datedue = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATEDUE"));
			record.Dateret = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATERET"));
			record.Estabtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTABTXT"));
									
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
			DojequipmentRecord record = new DojequipmentRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Serial = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SERIAL"));
			record.Eqptype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EQPTYPE"));
			record.Dscp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSCP"));
			record.Estab = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTAB"));
			record.Wo = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WO"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Comment = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMMENT"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Eqptypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EQPTYPETXT"));
			record.Datedue = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATEDUE"));
			record.Dateret = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATERET"));
			record.Estabtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTABTXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class DojequipmentCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DojequipmentRecord newRecord = new DojequipmentRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DojequipmentRecord record)
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
		public DojequipmentRecord get(int index)
		{
			return (DojequipmentRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class DojequipmentRecord
	{
		public String Unid = "";
		public String Serial = "";
		public String Eqptype = "";
		public String Dscp = "";
		public String Estab = "";
		public String Wo = "";
		public String Active = "";
		public String Comment = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Tstp = "";
		public String Eqptypetxt = "";
		public String Datedue = "";
		public String Dateret = "";
		public String Estabtxt = "";
				
		
		public void clear()
		{
			Unid = "";
			Serial = "";
			Eqptype = "";
			Dscp = "";
			Estab = "";
			Wo = "";
			Active = "";
			Comment = "";
			Rusr = "";
			Rdat = "";
			Tstp = "";
			Eqptypetxt = "";
			Datedue = "";
			Dateret = "";
			Estabtxt = "";
			
		}		
	}
		
		
	public final class DojequipmentFilter
	{			
		public String Unid = "";
		public String Serial = "";
		public String Eqptype = "";
		public String Dscp = "";
		public String Estab = "";
		public String Wo = "";
		public String Active = "";
		public String Comment = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Tstp = "";
		public String Eqptypetxt = "";
		public String Datedue = "";
		public String Dateret = "";
		public String Estabtxt = "";
		
		public void clear()
		{				
			Unid = "";
			Serial = "";
			Eqptype = "";
			Dscp = "";
			Estab = "";
			Wo = "";
			Active = "";
			Comment = "";
			Rusr = "";
			Rdat = "";
			Tstp = "";
			Eqptypetxt = "";
			Datedue = "";
			Dateret = "";
			Estabtxt = "";
		}	
		public DojequipmentFilter cloneObject()
		{
			DojequipmentFilter newFilter = new DojequipmentFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Serial = this.Serial;
			newFilter.Eqptype = this.Eqptype;
			newFilter.Dscp = this.Dscp;
			newFilter.Estab = this.Estab;
			newFilter.Wo = this.Wo;
			newFilter.Active = this.Active;
			newFilter.Comment = this.Comment;
			newFilter.Rusr = this.Rusr;
			newFilter.Rdat = this.Rdat;
			newFilter.Tstp = this.Tstp;
			newFilter.Eqptypetxt = this.Eqptypetxt;
			newFilter.Datedue = this.Datedue;
			newFilter.Dateret = this.Dateret;
			newFilter.Estabtxt = this.Estabtxt;
			
			return newFilter;
		}
	}
	public final class DojequipmentEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludeSerial = true;
		public boolean IncludeEqptype = true;
		public boolean IncludeDscp = true;
		public boolean IncludeEstab = true;
		public boolean IncludeWo = true;
		public boolean IncludeActive = true;
		public boolean IncludeComment = true;
		public boolean IncludeRusr = true;
		public boolean IncludeRdat = true;
		public boolean IncludeTstp = true;
		public boolean IncludeEqptypetxt = true;
		public boolean IncludeDatedue = true;
		public boolean IncludeDateret = true;
		public boolean IncludeEstabtxt = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludeSerial = true;
			IncludeEqptype = true;
			IncludeDscp = true;
			IncludeEstab = true;
			IncludeWo = true;
			IncludeActive = true;
			IncludeComment = true;
			IncludeRusr = true;
			IncludeRdat = true;
			IncludeTstp = true;
			IncludeEqptypetxt = true;
			IncludeDatedue = true;
			IncludeDateret = true;
			IncludeEstabtxt = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludeSerial = false;
			IncludeEqptype = false;
			IncludeDscp = false;
			IncludeEstab = false;
			IncludeWo = false;
			IncludeActive = false;
			IncludeComment = false;
			IncludeRusr = false;
			IncludeRdat = false;
			IncludeTstp = false;
			IncludeEqptypetxt = false;
			IncludeDatedue = false;
			IncludeDateret = false;
			IncludeEstabtxt = false;
		}
		public DojequipmentEditFilter cloneObject()
		{
			DojequipmentEditFilter newEditFilter = new DojequipmentEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludeSerial = this.IncludeSerial;
			newEditFilter.IncludeEqptype = this.IncludeEqptype;
			newEditFilter.IncludeDscp = this.IncludeDscp;
			newEditFilter.IncludeEstab = this.IncludeEstab;
			newEditFilter.IncludeWo = this.IncludeWo;
			newEditFilter.IncludeActive = this.IncludeActive;
			newEditFilter.IncludeComment = this.IncludeComment;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeEqptypetxt = this.IncludeEqptypetxt;
			newEditFilter.IncludeDatedue = this.IncludeDatedue;
			newEditFilter.IncludeDateret = this.IncludeDateret;
			newEditFilter.IncludeEstabtxt = this.IncludeEstabtxt;
			
			return newEditFilter;
		}
	}
}
