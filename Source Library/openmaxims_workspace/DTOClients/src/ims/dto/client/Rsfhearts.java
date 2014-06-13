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
// Template ver. 1.0.2 - Last modified on 08/03/2004 10:42 by Marius Mihalec

package ims.dto.client;

public final class Rsfhearts
{
	private RsfheartsFilter lastGetFilter = null;
	private final String serviceName = "RSFHEARTS";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public RsfheartsFilter Filter = new RsfheartsFilter();			
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public RsfheartsCollection DataCollection = new RsfheartsCollection();

	/**
	 * Creates a new Rsfhearts Data Transfer Object.
	 */ 
	public Rsfhearts(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Rsfhearts cloneObject() throws ims.dto.Exception
	{
		Rsfhearts cloneObject = new Rsfhearts(Connection);
			
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
			cloneObject.DataCollection.get(index).Adnm = DataCollection.get(x).Adnm;
			cloneObject.DataCollection.get(index).Adr1 = DataCollection.get(x).Adr1;
			cloneObject.DataCollection.get(index).Adr2 = DataCollection.get(x).Adr2;
			cloneObject.DataCollection.get(index).Adr3 = DataCollection.get(x).Adr3;
			cloneObject.DataCollection.get(index).Adr4 = DataCollection.get(x).Adr4;
			cloneObject.DataCollection.get(index).Pcod = DataCollection.get(x).Pcod;
			cloneObject.DataCollection.get(index).Tel = DataCollection.get(x).Tel;
			cloneObject.DataCollection.get(index).At01 = DataCollection.get(x).At01;
			cloneObject.DataCollection.get(index).At02 = DataCollection.get(x).At02;
			cloneObject.DataCollection.get(index).At03 = DataCollection.get(x).At03;
			cloneObject.DataCollection.get(index).At04 = DataCollection.get(x).At04;
			cloneObject.DataCollection.get(index).At05 = DataCollection.get(x).At05;
			cloneObject.DataCollection.get(index).At06 = DataCollection.get(x).At06;
			cloneObject.DataCollection.get(index).At07 = DataCollection.get(x).At07;
			cloneObject.DataCollection.get(index).At08 = DataCollection.get(x).At08;
			cloneObject.DataCollection.get(index).At09 = DataCollection.get(x).At09;
			cloneObject.DataCollection.get(index).At10 = DataCollection.get(x).At10;
			cloneObject.DataCollection.get(index).At11 = DataCollection.get(x).At11;
			cloneObject.DataCollection.get(index).At12 = DataCollection.get(x).At12;
			cloneObject.DataCollection.get(index).At13 = DataCollection.get(x).At13;
			cloneObject.DataCollection.get(index).At14 = DataCollection.get(x).At14;
			cloneObject.DataCollection.get(index).At15 = DataCollection.get(x).At15;
			cloneObject.DataCollection.get(index).At16 = DataCollection.get(x).At16;
			cloneObject.DataCollection.get(index).At17 = DataCollection.get(x).At17;
			cloneObject.DataCollection.get(index).At18 = DataCollection.get(x).At18;
			cloneObject.DataCollection.get(index).At19 = DataCollection.get(x).At19;
			cloneObject.DataCollection.get(index).At20 = DataCollection.get(x).At20;
			cloneObject.DataCollection.get(index).At21 = DataCollection.get(x).At21;
			cloneObject.DataCollection.get(index).At22 = DataCollection.get(x).At22;
			cloneObject.DataCollection.get(index).At23 = DataCollection.get(x).At23;
			cloneObject.DataCollection.get(index).At24 = DataCollection.get(x).At24;
			cloneObject.DataCollection.get(index).At25 = DataCollection.get(x).At25;
			cloneObject.DataCollection.get(index).At26 = DataCollection.get(x).At26;
			cloneObject.DataCollection.get(index).At27 = DataCollection.get(x).At27;
			cloneObject.DataCollection.get(index).At28 = DataCollection.get(x).At28;
			cloneObject.DataCollection.get(index).At29 = DataCollection.get(x).At29;
			cloneObject.DataCollection.get(index).At30 = DataCollection.get(x).At30;
			cloneObject.DataCollection.get(index).At31 = DataCollection.get(x).At31;
			cloneObject.DataCollection.get(index).At32 = DataCollection.get(x).At32;
			cloneObject.DataCollection.get(index).At33 = DataCollection.get(x).At33;
			cloneObject.DataCollection.get(index).At34 = DataCollection.get(x).At34;
			cloneObject.DataCollection.get(index).At35 = DataCollection.get(x).At35;
			cloneObject.DataCollection.get(index).At36 = DataCollection.get(x).At36;
			cloneObject.DataCollection.get(index).At37 = DataCollection.get(x).At37;
			cloneObject.DataCollection.get(index).At38 = DataCollection.get(x).At38;
			cloneObject.DataCollection.get(index).At39 = DataCollection.get(x).At39;
			cloneObject.DataCollection.get(index).At40 = DataCollection.get(x).At40;
			cloneObject.DataCollection.get(index).At41 = DataCollection.get(x).At41;
			cloneObject.DataCollection.get(index).At42 = DataCollection.get(x).At42;
			cloneObject.DataCollection.get(index).At43 = DataCollection.get(x).At43;
			cloneObject.DataCollection.get(index).At44 = DataCollection.get(x).At44;
			cloneObject.DataCollection.get(index).At45 = DataCollection.get(x).At45;
			cloneObject.DataCollection.get(index).At46 = DataCollection.get(x).At46;
			cloneObject.DataCollection.get(index).At47 = DataCollection.get(x).At47;
			cloneObject.DataCollection.get(index).At48 = DataCollection.get(x).At48;
			cloneObject.DataCollection.get(index).Prov = DataCollection.get(x).Prov;
			cloneObject.DataCollection.get(index).Blp = DataCollection.get(x).Blp;
			cloneObject.DataCollection.get(index).Eml = DataCollection.get(x).Eml;
			cloneObject.DataCollection.get(index).Dept = DataCollection.get(x).Dept;
			cloneObject.DataCollection.get(index).Hpcd = DataCollection.get(x).Hpcd;
							
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Rsfhearts.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Rsfhearts.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Rsfhearts.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Rsfhearts.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Rsfhearts.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Rsfhearts.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Rsfhearts.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Rsfhearts.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Rsfhearts.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Rsfhearts.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Rsfhearts.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Rsfhearts.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Rsfhearts.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Rsfhearts.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Rsfhearts.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Rsfhearts.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Rsfhearts.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Rsfhearts.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Rsfhearts.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Rsfhearts.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Rsfhearts.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Rsfhearts.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Rsfhearts.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Rsfhearts.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Rsfhearts.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Rsfhearts.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Rsfhearts.List");
							
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
	private String encodeNASFilter(RsfheartsFilter filter)
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
		
		if(Filter.Adnm != null && filter.Adnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adnm;
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
		
		if(Filter.Pcod != null && filter.Pcod.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PCOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pcod;
		}
		
		if(Filter.Tel != null && filter.Tel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tel;
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
		
		if(Filter.At05 != null && filter.At05.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT05" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At05;
		}
		
		if(Filter.At06 != null && filter.At06.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT06" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At06;
		}
		
		if(Filter.At07 != null && filter.At07.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT07" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At07;
		}
		
		if(Filter.At08 != null && filter.At08.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT08" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At08;
		}
		
		if(Filter.At09 != null && filter.At09.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT09" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At09;
		}
		
		if(Filter.At10 != null && filter.At10.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT10" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At10;
		}
		
		if(Filter.At11 != null && filter.At11.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT11" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At11;
		}
		
		if(Filter.At12 != null && filter.At12.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT12" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At12;
		}
		
		if(Filter.At13 != null && filter.At13.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT13" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At13;
		}
		
		if(Filter.At14 != null && filter.At14.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT14" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At14;
		}
		
		if(Filter.At15 != null && filter.At15.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT15" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At15;
		}
		
		if(Filter.At16 != null && filter.At16.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT16" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At16;
		}
		
		if(Filter.At17 != null && filter.At17.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT17" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At17;
		}
		
		if(Filter.At18 != null && filter.At18.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT18" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At18;
		}
		
		if(Filter.At19 != null && filter.At19.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT19" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At19;
		}
		
		if(Filter.At20 != null && filter.At20.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT20" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At20;
		}
		
		if(Filter.At21 != null && filter.At21.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT21" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At21;
		}
		
		if(Filter.At22 != null && filter.At22.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT22" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At22;
		}
		
		if(Filter.At23 != null && filter.At23.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT23" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At23;
		}
		
		if(Filter.At24 != null && filter.At24.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT24" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At24;
		}
		
		if(Filter.At25 != null && filter.At25.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT25" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At25;
		}
		
		if(Filter.At26 != null && filter.At26.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT26" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At26;
		}
		
		if(Filter.At27 != null && filter.At27.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT27" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At27;
		}
		
		if(Filter.At28 != null && filter.At28.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT28" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At28;
		}
		
		if(Filter.At29 != null && filter.At29.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT29" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At29;
		}
		
		if(Filter.At30 != null && filter.At30.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT30" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At30;
		}
		
		if(Filter.At31 != null && filter.At31.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT31" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At31;
		}
		
		if(Filter.At32 != null && filter.At32.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT32" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At32;
		}
		
		if(Filter.At33 != null && filter.At33.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT33" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At33;
		}
		
		if(Filter.At34 != null && filter.At34.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT34" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At34;
		}
		
		if(Filter.At35 != null && filter.At35.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT35" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At35;
		}
		
		if(Filter.At36 != null && filter.At36.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT36" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At36;
		}
		
		if(Filter.At37 != null && filter.At37.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT37" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At37;
		}
		
		if(Filter.At38 != null && filter.At38.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT38" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At38;
		}
		
		if(Filter.At39 != null && filter.At39.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT39" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At39;
		}
		
		if(Filter.At40 != null && filter.At40.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT40" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At40;
		}
		
		if(Filter.At41 != null && filter.At41.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT41" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At41;
		}
		
		if(Filter.At42 != null && filter.At42.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT42" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At42;
		}
		
		if(Filter.At43 != null && filter.At43.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT43" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At43;
		}
		
		if(Filter.At44 != null && filter.At44.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT44" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At44;
		}
		
		if(Filter.At45 != null && filter.At45.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT45" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At45;
		}
		
		if(Filter.At46 != null && filter.At46.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT46" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At46;
		}
		
		if(Filter.At47 != null && filter.At47.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT47" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At47;
		}
		
		if(Filter.At48 != null && filter.At48.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT48" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At48;
		}
		
		if(Filter.Prov != null && filter.Prov.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PROV" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prov;
		}
		
		if(Filter.Blp != null && filter.Blp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BLP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Blp;
		}
		
		if(Filter.Eml != null && filter.Eml.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EML" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eml;
		}
		
		if(Filter.Dept != null && filter.Dept.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DEPT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dept;
		}
		
		if(Filter.Hpcd != null && filter.Hpcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hpcd;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		RsfheartsRecord data = (RsfheartsRecord)DataCollection.get(0);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RSNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rsno);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Name);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Code);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adnm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr1);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr2);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr3);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr4);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PCOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pcod);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tel);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT01" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At01);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT02" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At02);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT03" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At03);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT04" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At04);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT05" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At05);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT06" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At06);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT07" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At07);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT08" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At08);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT09" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At09);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT10" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At10);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT11" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At11);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT12" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At12);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT13" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At13);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT14" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At14);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT15" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At15);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT16" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At16);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT17" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At17);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT18" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At18);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT19" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At19);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT20" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At20);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT21" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At21);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT22" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At22);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT23" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At23);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT24" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At24);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT25" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At25);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT26" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At26);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT27" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At27);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT28" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At28);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT29" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At29);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT30" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At30);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT31" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At31);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT32" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At32);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT33" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At33);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT34" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At34);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT35" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At35);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT36" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At36);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT37" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At37);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT38" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At38);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT39" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At39);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT40" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At40);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT41" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At41);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT42" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At42);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT43" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At43);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT44" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At44);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT45" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At45);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT46" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At46);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT47" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At47);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "AT48" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At48);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PROV" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prov);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "BLP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Blp);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "EML" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eml);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "DEPT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dept);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hpcd);
		
		
			
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
			RsfheartsRecord record = new RsfheartsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSNO"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CODE"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Adnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADNM"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Pcod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCOD"));
			record.Tel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEL"));
			record.At01 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT01"));
			record.At02 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT02"));
			record.At03 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT03"));
			record.At04 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT04"));
			record.At05 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT05"));
			record.At06 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT06"));
			record.At07 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT07"));
			record.At08 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT08"));
			record.At09 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT09"));
			record.At10 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT10"));
			record.At11 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT11"));
			record.At12 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT12"));
			record.At13 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT13"));
			record.At14 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT14"));
			record.At15 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT15"));
			record.At16 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT16"));
			record.At17 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT17"));
			record.At18 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT18"));
			record.At19 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT19"));
			record.At20 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT20"));
			record.At21 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT21"));
			record.At22 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT22"));
			record.At23 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT23"));
			record.At24 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT24"));
			record.At25 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT25"));
			record.At26 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT26"));
			record.At27 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT27"));
			record.At28 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT28"));
			record.At29 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT29"));
			record.At30 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT30"));
			record.At31 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT31"));
			record.At32 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT32"));
			record.At33 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT33"));
			record.At34 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT34"));
			record.At35 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT35"));
			record.At36 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT36"));
			record.At37 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT37"));
			record.At38 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT38"));
			record.At39 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT39"));
			record.At40 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT40"));
			record.At41 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT41"));
			record.At42 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT42"));
			record.At43 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT43"));
			record.At44 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT44"));
			record.At45 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT45"));
			record.At46 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT46"));
			record.At47 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT47"));
			record.At48 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT48"));
			record.Prov = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROV"));
			record.Blp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BLP"));
			record.Eml = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EML"));
			record.Dept = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DEPT"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
									
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
			RsfheartsRecord record = new RsfheartsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSNO"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CODE"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Adnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADNM"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Pcod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCOD"));
			record.Tel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEL"));
			record.At01 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT01"));
			record.At02 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT02"));
			record.At03 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT03"));
			record.At04 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT04"));
			record.At05 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT05"));
			record.At06 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT06"));
			record.At07 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT07"));
			record.At08 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT08"));
			record.At09 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT09"));
			record.At10 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT10"));
			record.At11 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT11"));
			record.At12 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT12"));
			record.At13 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT13"));
			record.At14 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT14"));
			record.At15 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT15"));
			record.At16 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT16"));
			record.At17 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT17"));
			record.At18 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT18"));
			record.At19 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT19"));
			record.At20 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT20"));
			record.At21 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT21"));
			record.At22 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT22"));
			record.At23 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT23"));
			record.At24 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT24"));
			record.At25 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT25"));
			record.At26 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT26"));
			record.At27 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT27"));
			record.At28 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT28"));
			record.At29 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT29"));
			record.At30 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT30"));
			record.At31 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT31"));
			record.At32 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT32"));
			record.At33 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT33"));
			record.At34 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT34"));
			record.At35 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT35"));
			record.At36 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT36"));
			record.At37 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT37"));
			record.At38 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT38"));
			record.At39 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT39"));
			record.At40 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT40"));
			record.At41 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT41"));
			record.At42 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT42"));
			record.At43 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT43"));
			record.At44 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT44"));
			record.At45 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT45"));
			record.At46 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT46"));
			record.At47 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT47"));
			record.At48 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT48"));
			record.Prov = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROV"));
			record.Blp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BLP"));
			record.Eml = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EML"));
			record.Dept = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DEPT"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class RsfheartsCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			RsfheartsRecord newRecord = new RsfheartsRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(RsfheartsRecord record)
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
		public RsfheartsRecord get(int index)
		{
			return (RsfheartsRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class RsfheartsRecord
	{
		public String Rsno = "";
		public String Name = "";
		public String Code = "";
		public String Stat = "";
		public String Adnm = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Pcod = "";
		public String Tel = "";
		public String At01 = "";
		public String At02 = "";
		public String At03 = "";
		public String At04 = "";
		public String At05 = "";
		public String At06 = "";
		public String At07 = "";
		public String At08 = "";
		public String At09 = "";
		public String At10 = "";
		public String At11 = "";
		public String At12 = "";
		public String At13 = "";
		public String At14 = "";
		public String At15 = "";
		public String At16 = "";
		public String At17 = "";
		public String At18 = "";
		public String At19 = "";
		public String At20 = "";
		public String At21 = "";
		public String At22 = "";
		public String At23 = "";
		public String At24 = "";
		public String At25 = "";
		public String At26 = "";
		public String At27 = "";
		public String At28 = "";
		public String At29 = "";
		public String At30 = "";
		public String At31 = "";
		public String At32 = "";
		public String At33 = "";
		public String At34 = "";
		public String At35 = "";
		public String At36 = "";
		public String At37 = "";
		public String At38 = "";
		public String At39 = "";
		public String At40 = "";
		public String At41 = "";
		public String At42 = "";
		public String At43 = "";
		public String At44 = "";
		public String At45 = "";
		public String At46 = "";
		public String At47 = "";
		public String At48 = "";
		public String Prov = "";
		public String Blp = "";
		public String Eml = "";
		public String Dept = "";
		public String Hpcd = "";
				
		
		public void clear()
		{
			Rsno = "";
			Name = "";
			Code = "";
			Stat = "";
			Adnm = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Pcod = "";
			Tel = "";
			At01 = "";
			At02 = "";
			At03 = "";
			At04 = "";
			At05 = "";
			At06 = "";
			At07 = "";
			At08 = "";
			At09 = "";
			At10 = "";
			At11 = "";
			At12 = "";
			At13 = "";
			At14 = "";
			At15 = "";
			At16 = "";
			At17 = "";
			At18 = "";
			At19 = "";
			At20 = "";
			At21 = "";
			At22 = "";
			At23 = "";
			At24 = "";
			At25 = "";
			At26 = "";
			At27 = "";
			At28 = "";
			At29 = "";
			At30 = "";
			At31 = "";
			At32 = "";
			At33 = "";
			At34 = "";
			At35 = "";
			At36 = "";
			At37 = "";
			At38 = "";
			At39 = "";
			At40 = "";
			At41 = "";
			At42 = "";
			At43 = "";
			At44 = "";
			At45 = "";
			At46 = "";
			At47 = "";
			At48 = "";
			Prov = "";
			Blp = "";
			Eml = "";
			Dept = "";
			Hpcd = "";
			
		}		
	}
		
		
	public final class RsfheartsFilter
	{			
		public String Rsno = "";
		public String Name = "";
		public String Code = "";
		public String Stat = "";
		public String Adnm = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Pcod = "";
		public String Tel = "";
		public String At01 = "";
		public String At02 = "";
		public String At03 = "";
		public String At04 = "";
		public String At05 = "";
		public String At06 = "";
		public String At07 = "";
		public String At08 = "";
		public String At09 = "";
		public String At10 = "";
		public String At11 = "";
		public String At12 = "";
		public String At13 = "";
		public String At14 = "";
		public String At15 = "";
		public String At16 = "";
		public String At17 = "";
		public String At18 = "";
		public String At19 = "";
		public String At20 = "";
		public String At21 = "";
		public String At22 = "";
		public String At23 = "";
		public String At24 = "";
		public String At25 = "";
		public String At26 = "";
		public String At27 = "";
		public String At28 = "";
		public String At29 = "";
		public String At30 = "";
		public String At31 = "";
		public String At32 = "";
		public String At33 = "";
		public String At34 = "";
		public String At35 = "";
		public String At36 = "";
		public String At37 = "";
		public String At38 = "";
		public String At39 = "";
		public String At40 = "";
		public String At41 = "";
		public String At42 = "";
		public String At43 = "";
		public String At44 = "";
		public String At45 = "";
		public String At46 = "";
		public String At47 = "";
		public String At48 = "";
		public String Prov = "";
		public String Blp = "";
		public String Eml = "";
		public String Dept = "";
		public String Hpcd = "";
		
		public void clear()
		{				
			Rsno = "";
			Name = "";
			Code = "";
			Stat = "";
			Adnm = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Pcod = "";
			Tel = "";
			At01 = "";
			At02 = "";
			At03 = "";
			At04 = "";
			At05 = "";
			At06 = "";
			At07 = "";
			At08 = "";
			At09 = "";
			At10 = "";
			At11 = "";
			At12 = "";
			At13 = "";
			At14 = "";
			At15 = "";
			At16 = "";
			At17 = "";
			At18 = "";
			At19 = "";
			At20 = "";
			At21 = "";
			At22 = "";
			At23 = "";
			At24 = "";
			At25 = "";
			At26 = "";
			At27 = "";
			At28 = "";
			At29 = "";
			At30 = "";
			At31 = "";
			At32 = "";
			At33 = "";
			At34 = "";
			At35 = "";
			At36 = "";
			At37 = "";
			At38 = "";
			At39 = "";
			At40 = "";
			At41 = "";
			At42 = "";
			At43 = "";
			At44 = "";
			At45 = "";
			At46 = "";
			At47 = "";
			At48 = "";
			Prov = "";
			Blp = "";
			Eml = "";
			Dept = "";
			Hpcd = "";
		}	
		public RsfheartsFilter cloneObject()
		{
			RsfheartsFilter newFilter = new RsfheartsFilter();
			
			newFilter.Rsno = this.Rsno;
			newFilter.Name = this.Name;
			newFilter.Code = this.Code;
			newFilter.Stat = this.Stat;
			newFilter.Adnm = this.Adnm;
			newFilter.Adr1 = this.Adr1;
			newFilter.Adr2 = this.Adr2;
			newFilter.Adr3 = this.Adr3;
			newFilter.Adr4 = this.Adr4;
			newFilter.Pcod = this.Pcod;
			newFilter.Tel = this.Tel;
			newFilter.At01 = this.At01;
			newFilter.At02 = this.At02;
			newFilter.At03 = this.At03;
			newFilter.At04 = this.At04;
			newFilter.At05 = this.At05;
			newFilter.At06 = this.At06;
			newFilter.At07 = this.At07;
			newFilter.At08 = this.At08;
			newFilter.At09 = this.At09;
			newFilter.At10 = this.At10;
			newFilter.At11 = this.At11;
			newFilter.At12 = this.At12;
			newFilter.At13 = this.At13;
			newFilter.At14 = this.At14;
			newFilter.At15 = this.At15;
			newFilter.At16 = this.At16;
			newFilter.At17 = this.At17;
			newFilter.At18 = this.At18;
			newFilter.At19 = this.At19;
			newFilter.At20 = this.At20;
			newFilter.At21 = this.At21;
			newFilter.At22 = this.At22;
			newFilter.At23 = this.At23;
			newFilter.At24 = this.At24;
			newFilter.At25 = this.At25;
			newFilter.At26 = this.At26;
			newFilter.At27 = this.At27;
			newFilter.At28 = this.At28;
			newFilter.At29 = this.At29;
			newFilter.At30 = this.At30;
			newFilter.At31 = this.At31;
			newFilter.At32 = this.At32;
			newFilter.At33 = this.At33;
			newFilter.At34 = this.At34;
			newFilter.At35 = this.At35;
			newFilter.At36 = this.At36;
			newFilter.At37 = this.At37;
			newFilter.At38 = this.At38;
			newFilter.At39 = this.At39;
			newFilter.At40 = this.At40;
			newFilter.At41 = this.At41;
			newFilter.At42 = this.At42;
			newFilter.At43 = this.At43;
			newFilter.At44 = this.At44;
			newFilter.At45 = this.At45;
			newFilter.At46 = this.At46;
			newFilter.At47 = this.At47;
			newFilter.At48 = this.At48;
			newFilter.Prov = this.Prov;
			newFilter.Blp = this.Blp;
			newFilter.Eml = this.Eml;
			newFilter.Dept = this.Dept;
			newFilter.Hpcd = this.Hpcd;
			
			return newFilter;
		}
	}
}
