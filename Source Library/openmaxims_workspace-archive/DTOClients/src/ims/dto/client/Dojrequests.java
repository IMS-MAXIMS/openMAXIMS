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
// Template ver. 1.0.6 - Last modified on 25/05/2004 15:00 by Marius Mihalec

package ims.dto.client;

public final class Dojrequests
{
	private DojrequestsFilter lastGetFilter = null;
	private final String serviceName = "DOJREQUESTS";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public DojrequestsFilter Filter = new DojrequestsFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public DojrequestsEditFilter EditFilter = new DojrequestsEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public DojrequestsCollection DataCollection = new DojrequestsCollection();

	/**
	 * Creates a new Dojrequests Data Transfer Object.
	 */ 
	public Dojrequests(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Dojrequests cloneObject() throws ims.dto.Exception
	{
		Dojrequests cloneObject = new Dojrequests(Connection);
			
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
			cloneObject.DataCollection.get(index).Pnum = DataCollection.get(x).Pnum;
			cloneObject.DataCollection.get(index).Estabcd = DataCollection.get(x).Estabcd;
			cloneObject.DataCollection.get(index).Ahid = DataCollection.get(x).Ahid;
			cloneObject.DataCollection.get(index).Reqtyp = DataCollection.get(x).Reqtyp;
			cloneObject.DataCollection.get(index).Clinid = DataCollection.get(x).Clinid;
			cloneObject.DataCollection.get(index).Scheddt = DataCollection.get(x).Scheddt;
			cloneObject.DataCollection.get(index).Reqdt = DataCollection.get(x).Reqdt;
			cloneObject.DataCollection.get(index).Reqby = DataCollection.get(x).Reqby;
			cloneObject.DataCollection.get(index).Enteredby = DataCollection.get(x).Enteredby;
			cloneObject.DataCollection.get(index).Entrydate = DataCollection.get(x).Entrydate;
			cloneObject.DataCollection.get(index).Duecomp = DataCollection.get(x).Duecomp;
			cloneObject.DataCollection.get(index).Datecomp = DataCollection.get(x).Datecomp;
			cloneObject.DataCollection.get(index).Compusr = DataCollection.get(x).Compusr;
			cloneObject.DataCollection.get(index).Comptime = DataCollection.get(x).Comptime;
			cloneObject.DataCollection.get(index).Reqstatus = DataCollection.get(x).Reqstatus;
			cloneObject.DataCollection.get(index).Statreas = DataCollection.get(x).Statreas;
			cloneObject.DataCollection.get(index).Reqcomment = DataCollection.get(x).Reqcomment;
			cloneObject.DataCollection.get(index).Cancelusr = DataCollection.get(x).Cancelusr;
			cloneObject.DataCollection.get(index).Canceldate = DataCollection.get(x).Canceldate;
			cloneObject.DataCollection.get(index).Canceltime = DataCollection.get(x).Canceltime;
			cloneObject.DataCollection.get(index).Attended = DataCollection.get(x).Attended;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Clintyp = DataCollection.get(x).Clintyp;
			cloneObject.DataCollection.get(index).Clinnm = DataCollection.get(x).Clinnm;
			cloneObject.DataCollection.get(index).Reqtyptxt = DataCollection.get(x).Reqtyptxt;
			cloneObject.DataCollection.get(index).Reqbytxt = DataCollection.get(x).Reqbytxt;
			cloneObject.DataCollection.get(index).Enteredbytxt = DataCollection.get(x).Enteredbytxt;
			cloneObject.DataCollection.get(index).Cancelusrtxt = DataCollection.get(x).Cancelusrtxt;
			cloneObject.DataCollection.get(index).Reqstatustxt = DataCollection.get(x).Reqstatustxt;
			cloneObject.DataCollection.get(index).Compusrtxt = DataCollection.get(x).Compusrtxt;
			cloneObject.DataCollection.get(index).Pris_loc = DataCollection.get(x).Pris_loc;
			cloneObject.DataCollection.get(index).Mainid = DataCollection.get(x).Mainid;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.1.14.4 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Dojrequests.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrequests.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Dojrequests.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrequests.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrequests.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrequests.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Dojrequests.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Dojrequests.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrequests.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Dojrequests.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Dojrequests.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Dojrequests.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Dojrequests.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojrequests.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrequests.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Dojrequests.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Dojrequests.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Dojrequests.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Dojrequests.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojrequests.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrequests.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Dojrequests.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Dojrequests.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrequests.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Dojrequests.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Dojrequests.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Dojrequests.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojrequests.List");
							
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
	private String encodeNASFilter(DojrequestsFilter filter)
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
		
		if(Filter.Pnum != null && filter.Pnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnum;
		}
		
		if(Filter.Estabcd != null && filter.Estabcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ESTABCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Estabcd;
		}
		
		if(Filter.Ahid != null && filter.Ahid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AHID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ahid;
		}
		
		if(Filter.Reqtyp != null && filter.Reqtyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reqtyp;
		}
		
		if(Filter.Clinid != null && filter.Clinid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLINID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clinid;
		}
		
		if(Filter.Scheddt != null && filter.Scheddt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SCHEDDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Scheddt;
		}
		
		if(Filter.Reqdt != null && filter.Reqdt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reqdt;
		}
		
		if(Filter.Reqby != null && filter.Reqby.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reqby;
		}
		
		if(Filter.Enteredby != null && filter.Enteredby.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ENTEREDBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Enteredby;
		}
		
		if(Filter.Entrydate != null && filter.Entrydate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ENTRYDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Entrydate;
		}
		
		if(Filter.Duecomp != null && filter.Duecomp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DUECOMP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Duecomp;
		}
		
		if(Filter.Datecomp != null && filter.Datecomp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DATECOMP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Datecomp;
		}
		
		if(Filter.Compusr != null && filter.Compusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COMPUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Compusr;
		}
		
		if(Filter.Comptime != null && filter.Comptime.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COMPTIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Comptime;
		}
		
		if(Filter.Reqstatus != null && filter.Reqstatus.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQSTATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reqstatus;
		}
		
		if(Filter.Statreas != null && filter.Statreas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STATREAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Statreas;
		}
		
		if(Filter.Reqcomment != null && filter.Reqcomment.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQCOMMENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reqcomment;
		}
		
		if(Filter.Cancelusr != null && filter.Cancelusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CANCELUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cancelusr;
		}
		
		if(Filter.Canceldate != null && filter.Canceldate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CANCELDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Canceldate;
		}
		
		if(Filter.Canceltime != null && filter.Canceltime.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CANCELTIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Canceltime;
		}
		
		if(Filter.Attended != null && filter.Attended.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ATTENDED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Attended;
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
		
		if(Filter.Clintyp != null && filter.Clintyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLINTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clintyp;
		}
		
		if(Filter.Clinnm != null && filter.Clinnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLINNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clinnm;
		}
		
		if(Filter.Reqtyptxt != null && filter.Reqtyptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQTYPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reqtyptxt;
		}
		
		if(Filter.Reqbytxt != null && filter.Reqbytxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQBYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reqbytxt;
		}
		
		if(Filter.Enteredbytxt != null && filter.Enteredbytxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ENTEREDBYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Enteredbytxt;
		}
		
		if(Filter.Cancelusrtxt != null && filter.Cancelusrtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CANCELUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cancelusrtxt;
		}
		
		if(Filter.Reqstatustxt != null && filter.Reqstatustxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQSTATUSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reqstatustxt;
		}
		
		if(Filter.Compusrtxt != null && filter.Compusrtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COMPUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Compusrtxt;
		}
		
		if(Filter.Pris_loc != null && filter.Pris_loc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PRIS_LOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pris_loc;
		}
		
		if(Filter.Mainid != null && filter.Mainid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAINID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mainid;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		DojrequestsRecord data = (DojrequestsRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeUnid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unid);
		}
		
		if(EditFilter.IncludePnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnum);
		}
		
		if(EditFilter.IncludeEstabcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ESTABCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Estabcd);
		}
		
		if(EditFilter.IncludeAhid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AHID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ahid);
		}
		
		if(EditFilter.IncludeReqtyp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reqtyp);
		}
		
		if(EditFilter.IncludeClinid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLINID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clinid);
		}
		
		if(EditFilter.IncludeScheddt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SCHEDDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Scheddt);
		}
		
		if(EditFilter.IncludeReqdt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reqdt);
		}
		
		if(EditFilter.IncludeReqby)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reqby);
		}
		
		if(EditFilter.IncludeEnteredby)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ENTEREDBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Enteredby);
		}
		
		if(EditFilter.IncludeEntrydate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ENTRYDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Entrydate);
		}
		
		if(EditFilter.IncludeDuecomp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DUECOMP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Duecomp);
		}
		
		if(EditFilter.IncludeDatecomp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DATECOMP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Datecomp);
		}
		
		if(EditFilter.IncludeCompusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COMPUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Compusr);
		}
		
		if(EditFilter.IncludeComptime)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COMPTIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Comptime);
		}
		
		if(EditFilter.IncludeReqstatus)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQSTATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reqstatus);
		}
		
		if(EditFilter.IncludeStatreas)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STATREAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Statreas);
		}
		
		if(EditFilter.IncludeReqcomment)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQCOMMENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reqcomment);
		}
		
		if(EditFilter.IncludeCancelusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CANCELUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cancelusr);
		}
		
		if(EditFilter.IncludeCanceldate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CANCELDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Canceldate);
		}
		
		if(EditFilter.IncludeCanceltime)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CANCELTIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Canceltime);
		}
		
		if(EditFilter.IncludeAttended)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ATTENDED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Attended);
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
		
		if(EditFilter.IncludeClintyp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLINTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clintyp);
		}
		
		if(EditFilter.IncludeClinnm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLINNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clinnm);
		}
		
		if(EditFilter.IncludeReqtyptxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQTYPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reqtyptxt);
		}
		
		if(EditFilter.IncludeReqbytxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQBYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reqbytxt);
		}
		
		if(EditFilter.IncludeEnteredbytxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ENTEREDBYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Enteredbytxt);
		}
		
		if(EditFilter.IncludeCancelusrtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CANCELUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cancelusrtxt);
		}
		
		if(EditFilter.IncludeReqstatustxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQSTATUSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reqstatustxt);
		}
		
		if(EditFilter.IncludeCompusrtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COMPUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Compusrtxt);
		}
		
		if(EditFilter.IncludePris_loc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PRIS_LOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pris_loc);
		}
		
		if(EditFilter.IncludeMainid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MAINID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mainid);
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
			DojrequestsRecord record = new DojrequestsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNUM"));
			record.Estabcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTABCD"));
			record.Ahid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AHID"));
			record.Reqtyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQTYP"));
			record.Clinid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLINID"));
			record.Scheddt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCHEDDT"));
			record.Reqdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQDT"));
			record.Reqby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQBY"));
			record.Enteredby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENTEREDBY"));
			record.Entrydate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENTRYDATE"));
			record.Duecomp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DUECOMP"));
			record.Datecomp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATECOMP"));
			record.Compusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPUSR"));
			record.Comptime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPTIME"));
			record.Reqstatus = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQSTATUS"));
			record.Statreas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STATREAS"));
			record.Reqcomment = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQCOMMENT"));
			record.Cancelusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CANCELUSR"));
			record.Canceldate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CANCELDATE"));
			record.Canceltime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CANCELTIME"));
			record.Attended = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTENDED"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Clintyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLINTYP"));
			record.Clinnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLINNM"));
			record.Reqtyptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQTYPTXT"));
			record.Reqbytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQBYTXT"));
			record.Enteredbytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENTEREDBYTXT"));
			record.Cancelusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CANCELUSRTXT"));
			record.Reqstatustxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQSTATUSTXT"));
			record.Compusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPUSRTXT"));
			record.Pris_loc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRIS_LOC"));
			record.Mainid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAINID"));
									
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
			DojrequestsRecord record = new DojrequestsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNUM"));
			record.Estabcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTABCD"));
			record.Ahid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AHID"));
			record.Reqtyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQTYP"));
			record.Clinid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLINID"));
			record.Scheddt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCHEDDT"));
			record.Reqdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQDT"));
			record.Reqby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQBY"));
			record.Enteredby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENTEREDBY"));
			record.Entrydate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENTRYDATE"));
			record.Duecomp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DUECOMP"));
			record.Datecomp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATECOMP"));
			record.Compusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPUSR"));
			record.Comptime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPTIME"));
			record.Reqstatus = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQSTATUS"));
			record.Statreas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STATREAS"));
			record.Reqcomment = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQCOMMENT"));
			record.Cancelusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CANCELUSR"));
			record.Canceldate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CANCELDATE"));
			record.Canceltime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CANCELTIME"));
			record.Attended = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTENDED"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Clintyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLINTYP"));
			record.Clinnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLINNM"));
			record.Reqtyptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQTYPTXT"));
			record.Reqbytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQBYTXT"));
			record.Enteredbytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENTEREDBYTXT"));
			record.Cancelusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CANCELUSRTXT"));
			record.Reqstatustxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQSTATUSTXT"));
			record.Compusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPUSRTXT"));
			record.Pris_loc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRIS_LOC"));
			record.Mainid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAINID"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class DojrequestsCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DojrequestsRecord newRecord = new DojrequestsRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DojrequestsRecord record)
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
		public DojrequestsRecord get(int index)
		{
			return (DojrequestsRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class DojrequestsRecord
	{
		public String Unid = "";
		public String Pnum = "";
		public String Estabcd = "";
		public String Ahid = "";
		public String Reqtyp = "";
		public String Clinid = "";
		public String Scheddt = "";
		public String Reqdt = "";
		public String Reqby = "";
		public String Enteredby = "";
		public String Entrydate = "";
		public String Duecomp = "";
		public String Datecomp = "";
		public String Compusr = "";
		public String Comptime = "";
		public String Reqstatus = "";
		public String Statreas = "";
		public String Reqcomment = "";
		public String Cancelusr = "";
		public String Canceldate = "";
		public String Canceltime = "";
		public String Attended = "";
		public String Active = "";
		public String Tstp = "";
		public String Clintyp = "";
		public String Clinnm = "";
		public String Reqtyptxt = "";
		public String Reqbytxt = "";
		public String Enteredbytxt = "";
		public String Cancelusrtxt = "";
		public String Reqstatustxt = "";
		public String Compusrtxt = "";
		public String Pris_loc = "";
		public String Mainid = "";
				
		
		public void clear()
		{
			Unid = "";
			Pnum = "";
			Estabcd = "";
			Ahid = "";
			Reqtyp = "";
			Clinid = "";
			Scheddt = "";
			Reqdt = "";
			Reqby = "";
			Enteredby = "";
			Entrydate = "";
			Duecomp = "";
			Datecomp = "";
			Compusr = "";
			Comptime = "";
			Reqstatus = "";
			Statreas = "";
			Reqcomment = "";
			Cancelusr = "";
			Canceldate = "";
			Canceltime = "";
			Attended = "";
			Active = "";
			Tstp = "";
			Clintyp = "";
			Clinnm = "";
			Reqtyptxt = "";
			Reqbytxt = "";
			Enteredbytxt = "";
			Cancelusrtxt = "";
			Reqstatustxt = "";
			Compusrtxt = "";
			Pris_loc = "";
			Mainid = "";
			
		}		
	}
		
		
	public final class DojrequestsFilter
	{			
		public String Unid = "";
		public String Pnum = "";
		public String Estabcd = "";
		public String Ahid = "";
		public String Reqtyp = "";
		public String Clinid = "";
		public String Scheddt = "";
		public String Reqdt = "";
		public String Reqby = "";
		public String Enteredby = "";
		public String Entrydate = "";
		public String Duecomp = "";
		public String Datecomp = "";
		public String Compusr = "";
		public String Comptime = "";
		public String Reqstatus = "";
		public String Statreas = "";
		public String Reqcomment = "";
		public String Cancelusr = "";
		public String Canceldate = "";
		public String Canceltime = "";
		public String Attended = "";
		public String Active = "";
		public String Tstp = "";
		public String Clintyp = "";
		public String Clinnm = "";
		public String Reqtyptxt = "";
		public String Reqbytxt = "";
		public String Enteredbytxt = "";
		public String Cancelusrtxt = "";
		public String Reqstatustxt = "";
		public String Compusrtxt = "";
		public String Pris_loc = "";
		public String Mainid = "";
		
		public void clear()
		{				
			Unid = "";
			Pnum = "";
			Estabcd = "";
			Ahid = "";
			Reqtyp = "";
			Clinid = "";
			Scheddt = "";
			Reqdt = "";
			Reqby = "";
			Enteredby = "";
			Entrydate = "";
			Duecomp = "";
			Datecomp = "";
			Compusr = "";
			Comptime = "";
			Reqstatus = "";
			Statreas = "";
			Reqcomment = "";
			Cancelusr = "";
			Canceldate = "";
			Canceltime = "";
			Attended = "";
			Active = "";
			Tstp = "";
			Clintyp = "";
			Clinnm = "";
			Reqtyptxt = "";
			Reqbytxt = "";
			Enteredbytxt = "";
			Cancelusrtxt = "";
			Reqstatustxt = "";
			Compusrtxt = "";
			Pris_loc = "";
			Mainid = "";
		}	
		public DojrequestsFilter cloneObject()
		{
			DojrequestsFilter newFilter = new DojrequestsFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Pnum = this.Pnum;
			newFilter.Estabcd = this.Estabcd;
			newFilter.Ahid = this.Ahid;
			newFilter.Reqtyp = this.Reqtyp;
			newFilter.Clinid = this.Clinid;
			newFilter.Scheddt = this.Scheddt;
			newFilter.Reqdt = this.Reqdt;
			newFilter.Reqby = this.Reqby;
			newFilter.Enteredby = this.Enteredby;
			newFilter.Entrydate = this.Entrydate;
			newFilter.Duecomp = this.Duecomp;
			newFilter.Datecomp = this.Datecomp;
			newFilter.Compusr = this.Compusr;
			newFilter.Comptime = this.Comptime;
			newFilter.Reqstatus = this.Reqstatus;
			newFilter.Statreas = this.Statreas;
			newFilter.Reqcomment = this.Reqcomment;
			newFilter.Cancelusr = this.Cancelusr;
			newFilter.Canceldate = this.Canceldate;
			newFilter.Canceltime = this.Canceltime;
			newFilter.Attended = this.Attended;
			newFilter.Active = this.Active;
			newFilter.Tstp = this.Tstp;
			newFilter.Clintyp = this.Clintyp;
			newFilter.Clinnm = this.Clinnm;
			newFilter.Reqtyptxt = this.Reqtyptxt;
			newFilter.Reqbytxt = this.Reqbytxt;
			newFilter.Enteredbytxt = this.Enteredbytxt;
			newFilter.Cancelusrtxt = this.Cancelusrtxt;
			newFilter.Reqstatustxt = this.Reqstatustxt;
			newFilter.Compusrtxt = this.Compusrtxt;
			newFilter.Pris_loc = this.Pris_loc;
			newFilter.Mainid = this.Mainid;
			
			return newFilter;
		}
	}
	public final class DojrequestsEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludePnum = true;
		public boolean IncludeEstabcd = true;
		public boolean IncludeAhid = true;
		public boolean IncludeReqtyp = true;
		public boolean IncludeClinid = true;
		public boolean IncludeScheddt = true;
		public boolean IncludeReqdt = true;
		public boolean IncludeReqby = true;
		public boolean IncludeEnteredby = true;
		public boolean IncludeEntrydate = true;
		public boolean IncludeDuecomp = true;
		public boolean IncludeDatecomp = true;
		public boolean IncludeCompusr = true;
		public boolean IncludeComptime = true;
		public boolean IncludeReqstatus = true;
		public boolean IncludeStatreas = true;
		public boolean IncludeReqcomment = true;
		public boolean IncludeCancelusr = true;
		public boolean IncludeCanceldate = true;
		public boolean IncludeCanceltime = true;
		public boolean IncludeAttended = true;
		public boolean IncludeActive = true;
		public boolean IncludeTstp = true;
		public boolean IncludeClintyp = true;
		public boolean IncludeClinnm = true;
		public boolean IncludeReqtyptxt = true;
		public boolean IncludeReqbytxt = true;
		public boolean IncludeEnteredbytxt = true;
		public boolean IncludeCancelusrtxt = true;
		public boolean IncludeReqstatustxt = true;
		public boolean IncludeCompusrtxt = true;
		public boolean IncludePris_loc = true;
		public boolean IncludeMainid = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludePnum = true;
			IncludeEstabcd = true;
			IncludeAhid = true;
			IncludeReqtyp = true;
			IncludeClinid = true;
			IncludeScheddt = true;
			IncludeReqdt = true;
			IncludeReqby = true;
			IncludeEnteredby = true;
			IncludeEntrydate = true;
			IncludeDuecomp = true;
			IncludeDatecomp = true;
			IncludeCompusr = true;
			IncludeComptime = true;
			IncludeReqstatus = true;
			IncludeStatreas = true;
			IncludeReqcomment = true;
			IncludeCancelusr = true;
			IncludeCanceldate = true;
			IncludeCanceltime = true;
			IncludeAttended = true;
			IncludeActive = true;
			IncludeTstp = true;
			IncludeClintyp = true;
			IncludeClinnm = true;
			IncludeReqtyptxt = true;
			IncludeReqbytxt = true;
			IncludeEnteredbytxt = true;
			IncludeCancelusrtxt = true;
			IncludeReqstatustxt = true;
			IncludeCompusrtxt = true;
			IncludePris_loc = true;
			IncludeMainid = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludePnum = false;
			IncludeEstabcd = false;
			IncludeAhid = false;
			IncludeReqtyp = false;
			IncludeClinid = false;
			IncludeScheddt = false;
			IncludeReqdt = false;
			IncludeReqby = false;
			IncludeEnteredby = false;
			IncludeEntrydate = false;
			IncludeDuecomp = false;
			IncludeDatecomp = false;
			IncludeCompusr = false;
			IncludeComptime = false;
			IncludeReqstatus = false;
			IncludeStatreas = false;
			IncludeReqcomment = false;
			IncludeCancelusr = false;
			IncludeCanceldate = false;
			IncludeCanceltime = false;
			IncludeAttended = false;
			IncludeActive = false;
			IncludeTstp = false;
			IncludeClintyp = false;
			IncludeClinnm = false;
			IncludeReqtyptxt = false;
			IncludeReqbytxt = false;
			IncludeEnteredbytxt = false;
			IncludeCancelusrtxt = false;
			IncludeReqstatustxt = false;
			IncludeCompusrtxt = false;
			IncludePris_loc = false;
			IncludeMainid = false;
		}
		public DojrequestsEditFilter cloneObject()
		{
			DojrequestsEditFilter newEditFilter = new DojrequestsEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludePnum = this.IncludePnum;
			newEditFilter.IncludeEstabcd = this.IncludeEstabcd;
			newEditFilter.IncludeAhid = this.IncludeAhid;
			newEditFilter.IncludeReqtyp = this.IncludeReqtyp;
			newEditFilter.IncludeClinid = this.IncludeClinid;
			newEditFilter.IncludeScheddt = this.IncludeScheddt;
			newEditFilter.IncludeReqdt = this.IncludeReqdt;
			newEditFilter.IncludeReqby = this.IncludeReqby;
			newEditFilter.IncludeEnteredby = this.IncludeEnteredby;
			newEditFilter.IncludeEntrydate = this.IncludeEntrydate;
			newEditFilter.IncludeDuecomp = this.IncludeDuecomp;
			newEditFilter.IncludeDatecomp = this.IncludeDatecomp;
			newEditFilter.IncludeCompusr = this.IncludeCompusr;
			newEditFilter.IncludeComptime = this.IncludeComptime;
			newEditFilter.IncludeReqstatus = this.IncludeReqstatus;
			newEditFilter.IncludeStatreas = this.IncludeStatreas;
			newEditFilter.IncludeReqcomment = this.IncludeReqcomment;
			newEditFilter.IncludeCancelusr = this.IncludeCancelusr;
			newEditFilter.IncludeCanceldate = this.IncludeCanceldate;
			newEditFilter.IncludeCanceltime = this.IncludeCanceltime;
			newEditFilter.IncludeAttended = this.IncludeAttended;
			newEditFilter.IncludeActive = this.IncludeActive;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeClintyp = this.IncludeClintyp;
			newEditFilter.IncludeClinnm = this.IncludeClinnm;
			newEditFilter.IncludeReqtyptxt = this.IncludeReqtyptxt;
			newEditFilter.IncludeReqbytxt = this.IncludeReqbytxt;
			newEditFilter.IncludeEnteredbytxt = this.IncludeEnteredbytxt;
			newEditFilter.IncludeCancelusrtxt = this.IncludeCancelusrtxt;
			newEditFilter.IncludeReqstatustxt = this.IncludeReqstatustxt;
			newEditFilter.IncludeCompusrtxt = this.IncludeCompusrtxt;
			newEditFilter.IncludePris_loc = this.IncludePris_loc;
			newEditFilter.IncludeMainid = this.IncludeMainid;
			
			return newEditFilter;
		}
	}
}
