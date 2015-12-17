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

public final class Doj_resource
{
	private Doj_resourceFilter lastGetFilter = null;
	private final String serviceName = "DOJ_RESOURCE";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Doj_resourceFilter Filter = new Doj_resourceFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Doj_resourceEditFilter EditFilter = new Doj_resourceEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Doj_resourceCollection DataCollection = new Doj_resourceCollection();

	/**
	 * Creates a new Doj_resource Data Transfer Object.
	 */ 
	public Doj_resource(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Doj_resource cloneObject() throws ims.dto.Exception
	{
		Doj_resource cloneObject = new Doj_resource(Connection);
			
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
			cloneObject.DataCollection.get(index).Name = DataCollection.get(x).Name;
			cloneObject.DataCollection.get(index).Code = DataCollection.get(x).Code;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).Srcc = DataCollection.get(x).Srcc;
			cloneObject.DataCollection.get(index).Type = DataCollection.get(x).Type;
			cloneObject.DataCollection.get(index).Adnm = DataCollection.get(x).Adnm;
			cloneObject.DataCollection.get(index).Restype = DataCollection.get(x).Restype;
			cloneObject.DataCollection.get(index).Adr1 = DataCollection.get(x).Adr1;
			cloneObject.DataCollection.get(index).Adr2 = DataCollection.get(x).Adr2;
			cloneObject.DataCollection.get(index).Adr3 = DataCollection.get(x).Adr3;
			cloneObject.DataCollection.get(index).Adr4 = DataCollection.get(x).Adr4;
			cloneObject.DataCollection.get(index).Tel = DataCollection.get(x).Tel;
			cloneObject.DataCollection.get(index).Pcod = DataCollection.get(x).Pcod;
			cloneObject.DataCollection.get(index).At01 = DataCollection.get(x).At01;
			cloneObject.DataCollection.get(index).At18 = DataCollection.get(x).At18;
			cloneObject.DataCollection.get(index).Prescribe = DataCollection.get(x).Prescribe;
			cloneObject.DataCollection.get(index).Stoppres = DataCollection.get(x).Stoppres;
			cloneObject.DataCollection.get(index).Request = DataCollection.get(x).Request;
			cloneObject.DataCollection.get(index).At02 = DataCollection.get(x).At02;
			cloneObject.DataCollection.get(index).At03 = DataCollection.get(x).At03;
			cloneObject.DataCollection.get(index).At04 = DataCollection.get(x).At04;
			cloneObject.DataCollection.get(index).At06 = DataCollection.get(x).At06;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Restypetxt = DataCollection.get(x).Restypetxt;
			cloneObject.DataCollection.get(index).Estab = DataCollection.get(x).Estab;
			cloneObject.DataCollection.get(index).Estabtxt = DataCollection.get(x).Estabtxt;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "17";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Doj_resource.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doj_resource.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Doj_resource.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doj_resource.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doj_resource.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doj_resource.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Doj_resource.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Doj_resource.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doj_resource.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Doj_resource.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Doj_resource.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Doj_resource.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Doj_resource.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Doj_resource.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doj_resource.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Doj_resource.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Doj_resource.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Doj_resource.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Doj_resource.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Doj_resource.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doj_resource.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Doj_resource.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Doj_resource.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doj_resource.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Doj_resource.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Doj_resource.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Doj_resource.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Doj_resource.List");
							
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
	private String encodeNASFilter(Doj_resourceFilter filter)
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
		
		if(Filter.Name != null && filter.Name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Name;
		}
		
		if(Filter.Code != null && filter.Code.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Code;
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat;
		}
		
		if(Filter.Srcc != null && filter.Srcc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SRCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Srcc;
		}
		
		if(Filter.Type != null && filter.Type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Type;
		}
		
		if(Filter.Adnm != null && filter.Adnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adnm;
		}
		
		if(Filter.Restype != null && filter.Restype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Restype;
		}
		
		if(Filter.Adr1 != null && filter.Adr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr1;
		}
		
		if(Filter.Adr2 != null && filter.Adr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr2;
		}
		
		if(Filter.Adr3 != null && filter.Adr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr3;
		}
		
		if(Filter.Adr4 != null && filter.Adr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr4;
		}
		
		if(Filter.Tel != null && filter.Tel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tel;
		}
		
		if(Filter.Pcod != null && filter.Pcod.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PCOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pcod;
		}
		
		if(Filter.At01 != null && filter.At01.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT01" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At01;
		}
		
		if(Filter.At18 != null && filter.At18.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT18" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At18;
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
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Restypetxt != null && filter.Restypetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Restypetxt;
		}
		
		if(Filter.Estab != null && filter.Estab.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ESTAB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Estab;
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
			
		Doj_resourceRecord data = (Doj_resourceRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeRsno)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RSNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rsno);
		}
		
		if(EditFilter.IncludeName)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Name);
		}
		
		if(EditFilter.IncludeCode)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Code);
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat);
		}
		
		if(EditFilter.IncludeSrcc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SRCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Srcc);
		}
		
		if(EditFilter.IncludeType)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Type);
		}
		
		if(EditFilter.IncludeAdnm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adnm);
		}
		
		if(EditFilter.IncludeRestype)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Restype);
		}
		
		if(EditFilter.IncludeAdr1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr1);
		}
		
		if(EditFilter.IncludeAdr2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr2);
		}
		
		if(EditFilter.IncludeAdr3)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr3);
		}
		
		if(EditFilter.IncludeAdr4)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr4);
		}
		
		if(EditFilter.IncludeTel)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tel);
		}
		
		if(EditFilter.IncludePcod)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PCOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pcod);
		}
		
		if(EditFilter.IncludeAt01)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AT01" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At01);
		}
		
		if(EditFilter.IncludeAt18)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AT18" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At18);
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
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeRestypetxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Restypetxt);
		}
		
		if(EditFilter.IncludeEstab)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ESTAB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Estab);
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
			Doj_resourceRecord record = new Doj_resourceRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSNO"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CODE"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Srcc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRCC"));
			record.Type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TYPE"));
			record.Adnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADNM"));
			record.Restype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESTYPE"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Tel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEL"));
			record.Pcod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCOD"));
			record.At01 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT01"));
			record.At18 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT18"));
			record.Prescribe = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRESCRIBE"));
			record.Stoppres = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STOPPRES"));
			record.Request = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQUEST"));
			record.At02 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT02"));
			record.At03 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT03"));
			record.At04 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT04"));
			record.At06 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT06"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Restypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESTYPETXT"));
			record.Estab = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTAB"));
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
			Doj_resourceRecord record = new Doj_resourceRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSNO"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CODE"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Srcc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRCC"));
			record.Type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TYPE"));
			record.Adnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADNM"));
			record.Restype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESTYPE"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Tel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEL"));
			record.Pcod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCOD"));
			record.At01 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT01"));
			record.At18 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT18"));
			record.Prescribe = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRESCRIBE"));
			record.Stoppres = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STOPPRES"));
			record.Request = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQUEST"));
			record.At02 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT02"));
			record.At03 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT03"));
			record.At04 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT04"));
			record.At06 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT06"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Restypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESTYPETXT"));
			record.Estab = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTAB"));
			record.Estabtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTABTXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Doj_resourceCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Doj_resourceRecord newRecord = new Doj_resourceRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Doj_resourceRecord record)
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
		public Doj_resourceRecord get(int index)
		{
			return (Doj_resourceRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Doj_resourceRecord
	{
		public String Rsno = "";
		public String Name = "";
		public String Code = "";
		public String Stat = "";
		public String Srcc = "";
		public String Type = "";
		public String Adnm = "";
		public String Restype = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Tel = "";
		public String Pcod = "";
		public String At01 = "";
		public String At18 = "";
		public String Prescribe = "";
		public String Stoppres = "";
		public String Request = "";
		public String At02 = "";
		public String At03 = "";
		public String At04 = "";
		public String At06 = "";
		public String Tstp = "";
		public String Restypetxt = "";
		public String Estab = "";
		public String Estabtxt = "";
				
		
		public void clear()
		{
			Rsno = "";
			Name = "";
			Code = "";
			Stat = "";
			Srcc = "";
			Type = "";
			Adnm = "";
			Restype = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Tel = "";
			Pcod = "";
			At01 = "";
			At18 = "";
			Prescribe = "";
			Stoppres = "";
			Request = "";
			At02 = "";
			At03 = "";
			At04 = "";
			At06 = "";
			Tstp = "";
			Restypetxt = "";
			Estab = "";
			Estabtxt = "";
			
		}		
	}
		
		
	public final class Doj_resourceFilter
	{			
		public String Rsno = "";
		public String Name = "";
		public String Code = "";
		public String Stat = "";
		public String Srcc = "";
		public String Type = "";
		public String Adnm = "";
		public String Restype = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Tel = "";
		public String Pcod = "";
		public String At01 = "";
		public String At18 = "";
		public String Prescribe = "";
		public String Stoppres = "";
		public String Request = "";
		public String At02 = "";
		public String At03 = "";
		public String At04 = "";
		public String At06 = "";
		public String Tstp = "";
		public String Restypetxt = "";
		public String Estab = "";
		public String Estabtxt = "";
		
		public void clear()
		{				
			Rsno = "";
			Name = "";
			Code = "";
			Stat = "";
			Srcc = "";
			Type = "";
			Adnm = "";
			Restype = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Tel = "";
			Pcod = "";
			At01 = "";
			At18 = "";
			Prescribe = "";
			Stoppres = "";
			Request = "";
			At02 = "";
			At03 = "";
			At04 = "";
			At06 = "";
			Tstp = "";
			Restypetxt = "";
			Estab = "";
			Estabtxt = "";
		}	
		public Doj_resourceFilter cloneObject()
		{
			Doj_resourceFilter newFilter = new Doj_resourceFilter();
			
			newFilter.Rsno = this.Rsno;
			newFilter.Name = this.Name;
			newFilter.Code = this.Code;
			newFilter.Stat = this.Stat;
			newFilter.Srcc = this.Srcc;
			newFilter.Type = this.Type;
			newFilter.Adnm = this.Adnm;
			newFilter.Restype = this.Restype;
			newFilter.Adr1 = this.Adr1;
			newFilter.Adr2 = this.Adr2;
			newFilter.Adr3 = this.Adr3;
			newFilter.Adr4 = this.Adr4;
			newFilter.Tel = this.Tel;
			newFilter.Pcod = this.Pcod;
			newFilter.At01 = this.At01;
			newFilter.At18 = this.At18;
			newFilter.Prescribe = this.Prescribe;
			newFilter.Stoppres = this.Stoppres;
			newFilter.Request = this.Request;
			newFilter.At02 = this.At02;
			newFilter.At03 = this.At03;
			newFilter.At04 = this.At04;
			newFilter.At06 = this.At06;
			newFilter.Tstp = this.Tstp;
			newFilter.Restypetxt = this.Restypetxt;
			newFilter.Estab = this.Estab;
			newFilter.Estabtxt = this.Estabtxt;
			
			return newFilter;
		}
	}
	public final class Doj_resourceEditFilter
	{			
		public boolean IncludeRsno = true;
		public boolean IncludeName = true;
		public boolean IncludeCode = true;
		public boolean IncludeStat = true;
		public boolean IncludeSrcc = true;
		public boolean IncludeType = true;
		public boolean IncludeAdnm = true;
		public boolean IncludeRestype = true;
		public boolean IncludeAdr1 = true;
		public boolean IncludeAdr2 = true;
		public boolean IncludeAdr3 = true;
		public boolean IncludeAdr4 = true;
		public boolean IncludeTel = true;
		public boolean IncludePcod = true;
		public boolean IncludeAt01 = true;
		public boolean IncludeAt18 = true;
		public boolean IncludePrescribe = true;
		public boolean IncludeStoppres = true;
		public boolean IncludeRequest = true;
		public boolean IncludeAt02 = true;
		public boolean IncludeAt03 = true;
		public boolean IncludeAt04 = true;
		public boolean IncludeAt06 = true;
		public boolean IncludeTstp = true;
		public boolean IncludeRestypetxt = true;
		public boolean IncludeEstab = true;
		public boolean IncludeEstabtxt = true;
		
		public void includeAll()
		{				
			IncludeRsno = true;
			IncludeName = true;
			IncludeCode = true;
			IncludeStat = true;
			IncludeSrcc = true;
			IncludeType = true;
			IncludeAdnm = true;
			IncludeRestype = true;
			IncludeAdr1 = true;
			IncludeAdr2 = true;
			IncludeAdr3 = true;
			IncludeAdr4 = true;
			IncludeTel = true;
			IncludePcod = true;
			IncludeAt01 = true;
			IncludeAt18 = true;
			IncludePrescribe = true;
			IncludeStoppres = true;
			IncludeRequest = true;
			IncludeAt02 = true;
			IncludeAt03 = true;
			IncludeAt04 = true;
			IncludeAt06 = true;
			IncludeTstp = true;
			IncludeRestypetxt = true;
			IncludeEstab = true;
			IncludeEstabtxt = true;
		}	
		public void excludeAll()
		{				
			IncludeRsno = false;
			IncludeName = false;
			IncludeCode = false;
			IncludeStat = false;
			IncludeSrcc = false;
			IncludeType = false;
			IncludeAdnm = false;
			IncludeRestype = false;
			IncludeAdr1 = false;
			IncludeAdr2 = false;
			IncludeAdr3 = false;
			IncludeAdr4 = false;
			IncludeTel = false;
			IncludePcod = false;
			IncludeAt01 = false;
			IncludeAt18 = false;
			IncludePrescribe = false;
			IncludeStoppres = false;
			IncludeRequest = false;
			IncludeAt02 = false;
			IncludeAt03 = false;
			IncludeAt04 = false;
			IncludeAt06 = false;
			IncludeTstp = false;
			IncludeRestypetxt = false;
			IncludeEstab = false;
			IncludeEstabtxt = false;
		}
		public Doj_resourceEditFilter cloneObject()
		{
			Doj_resourceEditFilter newEditFilter = new Doj_resourceEditFilter();
			
			newEditFilter.IncludeRsno = this.IncludeRsno;
			newEditFilter.IncludeName = this.IncludeName;
			newEditFilter.IncludeCode = this.IncludeCode;
			newEditFilter.IncludeStat = this.IncludeStat;
			newEditFilter.IncludeSrcc = this.IncludeSrcc;
			newEditFilter.IncludeType = this.IncludeType;
			newEditFilter.IncludeAdnm = this.IncludeAdnm;
			newEditFilter.IncludeRestype = this.IncludeRestype;
			newEditFilter.IncludeAdr1 = this.IncludeAdr1;
			newEditFilter.IncludeAdr2 = this.IncludeAdr2;
			newEditFilter.IncludeAdr3 = this.IncludeAdr3;
			newEditFilter.IncludeAdr4 = this.IncludeAdr4;
			newEditFilter.IncludeTel = this.IncludeTel;
			newEditFilter.IncludePcod = this.IncludePcod;
			newEditFilter.IncludeAt01 = this.IncludeAt01;
			newEditFilter.IncludeAt18 = this.IncludeAt18;
			newEditFilter.IncludePrescribe = this.IncludePrescribe;
			newEditFilter.IncludeStoppres = this.IncludeStoppres;
			newEditFilter.IncludeRequest = this.IncludeRequest;
			newEditFilter.IncludeAt02 = this.IncludeAt02;
			newEditFilter.IncludeAt03 = this.IncludeAt03;
			newEditFilter.IncludeAt04 = this.IncludeAt04;
			newEditFilter.IncludeAt06 = this.IncludeAt06;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeRestypetxt = this.IncludeRestypetxt;
			newEditFilter.IncludeEstab = this.IncludeEstab;
			newEditFilter.IncludeEstabtxt = this.IncludeEstabtxt;
			
			return newEditFilter;
		}
	}
}
