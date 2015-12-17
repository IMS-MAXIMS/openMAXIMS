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
// Template ver. 1.0.3 - Last modified on 12/03/2004 10:13 by Marius Mihalec

package ims.dto.client;

public final class Waitlist
{
	private WaitlistFilter lastGetFilter = null;
	private final String serviceName = "WAITLIST";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public WaitlistFilter Filter = new WaitlistFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public WaitlistEditFilter EditFilter = new WaitlistEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public WaitlistCollection DataCollection = new WaitlistCollection();

	/**
	 * Creates a new Waitlist Data Transfer Object.
	 */ 
	public Waitlist(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Waitlist cloneObject() throws ims.dto.Exception
	{
		Waitlist cloneObject = new Waitlist(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Wkey = DataCollection.get(x).Wkey;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Hcpcode = DataCollection.get(x).Hcpcode;
			cloneObject.DataCollection.get(index).Rescode = DataCollection.get(x).Rescode;
			cloneObject.DataCollection.get(index).Prty = DataCollection.get(x).Prty;
			cloneObject.DataCollection.get(index).Donl = DataCollection.get(x).Donl;
			cloneObject.DataCollection.get(index).Time = DataCollection.get(x).Time;
			cloneObject.DataCollection.get(index).Stay = DataCollection.get(x).Stay;
			cloneObject.DataCollection.get(index).Intn = DataCollection.get(x).Intn;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).Rfcd = DataCollection.get(x).Rfcd;
			cloneObject.DataCollection.get(index).Refr = DataCollection.get(x).Refr;
			cloneObject.DataCollection.get(index).Guad = DataCollection.get(x).Guad;
			cloneObject.DataCollection.get(index).Orad = DataCollection.get(x).Orad;
			cloneObject.DataCollection.get(index).Spcd = DataCollection.get(x).Spcd;
			cloneObject.DataCollection.get(index).Harc = DataCollection.get(x).Harc;
			cloneObject.DataCollection.get(index).Rfgp = DataCollection.get(x).Rfgp;
			cloneObject.DataCollection.get(index).Outc = DataCollection.get(x).Outc;
			cloneObject.DataCollection.get(index).Oudt = DataCollection.get(x).Oudt;
			cloneObject.DataCollection.get(index).Outm = DataCollection.get(x).Outm;
			cloneObject.DataCollection.get(index).Rrea = DataCollection.get(x).Rrea;
			cloneObject.DataCollection.get(index).Conf = DataCollection.get(x).Conf;
			cloneObject.DataCollection.get(index).Reas = DataCollection.get(x).Reas;
			cloneObject.DataCollection.get(index).Comm = DataCollection.get(x).Comm;
			cloneObject.DataCollection.get(index).Sqr1 = DataCollection.get(x).Sqr1;
			cloneObject.DataCollection.get(index).Sqr2 = DataCollection.get(x).Sqr2;
			cloneObject.DataCollection.get(index).Sqr3 = DataCollection.get(x).Sqr3;
			cloneObject.DataCollection.get(index).Sqr4 = DataCollection.get(x).Sqr4;
			cloneObject.DataCollection.get(index).Sqr5 = DataCollection.get(x).Sqr5;
			cloneObject.DataCollection.get(index).Sqr6 = DataCollection.get(x).Sqr6;
			cloneObject.DataCollection.get(index).Sqr7 = DataCollection.get(x).Sqr7;
			cloneObject.DataCollection.get(index).Sqr8 = DataCollection.get(x).Sqr8;
			cloneObject.DataCollection.get(index).Acco = DataCollection.get(x).Acco;
			cloneObject.DataCollection.get(index).Naf1 = DataCollection.get(x).Naf1;
			cloneObject.DataCollection.get(index).Naf2 = DataCollection.get(x).Naf2;
			cloneObject.DataCollection.get(index).Naf3 = DataCollection.get(x).Naf3;
			cloneObject.DataCollection.get(index).Naf4 = DataCollection.get(x).Naf4;
			cloneObject.DataCollection.get(index).Nat1 = DataCollection.get(x).Nat1;
			cloneObject.DataCollection.get(index).Nat2 = DataCollection.get(x).Nat2;
			cloneObject.DataCollection.get(index).Nat3 = DataCollection.get(x).Nat3;
			cloneObject.DataCollection.get(index).Nat4 = DataCollection.get(x).Nat4;
			cloneObject.DataCollection.get(index).Notp = DataCollection.get(x).Notp;
			cloneObject.DataCollection.get(index).Xrea = DataCollection.get(x).Xrea;
			cloneObject.DataCollection.get(index).Xcom = DataCollection.get(x).Xcom;
			cloneObject.DataCollection.get(index).Hpcd = DataCollection.get(x).Hpcd;
			cloneObject.DataCollection.get(index).Hcpname = DataCollection.get(x).Hcpname;
			cloneObject.DataCollection.get(index).Resname = DataCollection.get(x).Resname;
			cloneObject.DataCollection.get(index).Titl = DataCollection.get(x).Titl;
			cloneObject.DataCollection.get(index).Snm = DataCollection.get(x).Snm;
			cloneObject.DataCollection.get(index).Fnm1 = DataCollection.get(x).Fnm1;
			cloneObject.DataCollection.get(index).Fnm2 = DataCollection.get(x).Fnm2;
			cloneObject.DataCollection.get(index).Nhsnum = DataCollection.get(x).Nhsnum;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Maxno = DataCollection.get(x).Maxno;
			cloneObject.DataCollection.get(index).Pcho = DataCollection.get(x).Pcho;
			cloneObject.DataCollection.get(index).Pcln = DataCollection.get(x).Pcln;
			cloneObject.DataCollection.get(index).Current = DataCollection.get(x).Current;
							
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Waitlist.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Waitlist.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Waitlist.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Waitlist.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Waitlist.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Waitlist.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Waitlist.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Waitlist.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Waitlist.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Waitlist.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Waitlist.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Waitlist.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Waitlist.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Waitlist.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Waitlist.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Waitlist.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Waitlist.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Waitlist.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Waitlist.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Waitlist.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Waitlist.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Waitlist.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Waitlist.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Waitlist.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Waitlist.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Waitlist.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Waitlist.List");
							
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
	private String encodeNASFilter(WaitlistFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Wkey != null && filter.Wkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wkey;
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey;
		}
		
		if(Filter.Hcpcode != null && filter.Hcpcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpcode;
		}
		
		if(Filter.Rescode != null && filter.Rescode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rescode;
		}
		
		if(Filter.Prty != null && filter.Prty.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PRTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prty;
		}
		
		if(Filter.Donl != null && filter.Donl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DONL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Donl;
		}
		
		if(Filter.Time != null && filter.Time.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Time;
		}
		
		if(Filter.Stay != null && filter.Stay.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STAY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stay;
		}
		
		if(Filter.Intn != null && filter.Intn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INTN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Intn;
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat;
		}
		
		if(Filter.Rfcd != null && filter.Rfcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RFCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rfcd;
		}
		
		if(Filter.Refr != null && filter.Refr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refr;
		}
		
		if(Filter.Guad != null && filter.Guad.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GUAD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Guad;
		}
		
		if(Filter.Orad != null && filter.Orad.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORAD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Orad;
		}
		
		if(Filter.Spcd != null && filter.Spcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spcd;
		}
		
		if(Filter.Harc != null && filter.Harc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HARC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Harc;
		}
		
		if(Filter.Rfgp != null && filter.Rfgp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RFGP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rfgp;
		}
		
		if(Filter.Outc != null && filter.Outc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OUTC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Outc;
		}
		
		if(Filter.Oudt != null && filter.Oudt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OUDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Oudt;
		}
		
		if(Filter.Outm != null && filter.Outm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OUTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Outm;
		}
		
		if(Filter.Rrea != null && filter.Rrea.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RREA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rrea;
		}
		
		if(Filter.Conf != null && filter.Conf.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Conf;
		}
		
		if(Filter.Reas != null && filter.Reas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reas;
		}
		
		if(Filter.Comm != null && filter.Comm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Comm;
		}
		
		if(Filter.Sqr1 != null && filter.Sqr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SQR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sqr1;
		}
		
		if(Filter.Sqr2 != null && filter.Sqr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SQR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sqr2;
		}
		
		if(Filter.Sqr3 != null && filter.Sqr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SQR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sqr3;
		}
		
		if(Filter.Sqr4 != null && filter.Sqr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SQR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sqr4;
		}
		
		if(Filter.Sqr5 != null && filter.Sqr5.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SQR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sqr5;
		}
		
		if(Filter.Sqr6 != null && filter.Sqr6.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SQR6" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sqr6;
		}
		
		if(Filter.Sqr7 != null && filter.Sqr7.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SQR7" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sqr7;
		}
		
		if(Filter.Sqr8 != null && filter.Sqr8.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SQR8" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sqr8;
		}
		
		if(Filter.Acco != null && filter.Acco.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACCO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Acco;
		}
		
		if(Filter.Naf1 != null && filter.Naf1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAF1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Naf1;
		}
		
		if(Filter.Naf2 != null && filter.Naf2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAF2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Naf2;
		}
		
		if(Filter.Naf3 != null && filter.Naf3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAF3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Naf3;
		}
		
		if(Filter.Naf4 != null && filter.Naf4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAF4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Naf4;
		}
		
		if(Filter.Nat1 != null && filter.Nat1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAT1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nat1;
		}
		
		if(Filter.Nat2 != null && filter.Nat2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAT2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nat2;
		}
		
		if(Filter.Nat3 != null && filter.Nat3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAT3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nat3;
		}
		
		if(Filter.Nat4 != null && filter.Nat4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAT4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nat4;
		}
		
		if(Filter.Notp != null && filter.Notp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NOTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Notp;
		}
		
		if(Filter.Xrea != null && filter.Xrea.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "XREA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Xrea;
		}
		
		if(Filter.Xcom != null && filter.Xcom.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "XCOM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Xcom;
		}
		
		if(Filter.Hpcd != null && filter.Hpcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hpcd;
		}
		
		if(Filter.Hcpname != null && filter.Hcpname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpname;
		}
		
		if(Filter.Resname != null && filter.Resname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resname;
		}
		
		if(Filter.Titl != null && filter.Titl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Titl;
		}
		
		if(Filter.Snm != null && filter.Snm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Snm;
		}
		
		if(Filter.Fnm1 != null && filter.Fnm1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fnm1;
		}
		
		if(Filter.Fnm2 != null && filter.Fnm2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FNM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fnm2;
		}
		
		if(Filter.Nhsnum != null && filter.Nhsnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NHSNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsnum;
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum;
		}
		
		if(Filter.Maxno != null && filter.Maxno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAXNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Maxno;
		}
		
		if(Filter.Pcho != null && filter.Pcho.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PCHO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pcho;
		}
		
		if(Filter.Pcln != null && filter.Pcln.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PCLN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pcln;
		}
		
		if(Filter.Current != null && filter.Current.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CURRENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Current;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		WaitlistRecord data = (WaitlistRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeWkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wkey);
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
		}
		
		if(EditFilter.IncludeHcpcode)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpcode);
		}
		
		if(EditFilter.IncludeRescode)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rescode);
		}
		
		if(EditFilter.IncludePrty)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PRTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prty);
		}
		
		if(EditFilter.IncludeDonl)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DONL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Donl);
		}
		
		if(EditFilter.IncludeTime)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Time);
		}
		
		if(EditFilter.IncludeStay)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STAY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stay);
		}
		
		if(EditFilter.IncludeIntn)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INTN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Intn);
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat);
		}
		
		if(EditFilter.IncludeRfcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RFCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rfcd);
		}
		
		if(EditFilter.IncludeRefr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refr);
		}
		
		if(EditFilter.IncludeGuad)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "GUAD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Guad);
		}
		
		if(EditFilter.IncludeOrad)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORAD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Orad);
		}
		
		if(EditFilter.IncludeSpcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spcd);
		}
		
		if(EditFilter.IncludeHarc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HARC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Harc);
		}
		
		if(EditFilter.IncludeRfgp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RFGP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rfgp);
		}
		
		if(EditFilter.IncludeOutc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OUTC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Outc);
		}
		
		if(EditFilter.IncludeOudt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OUDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Oudt);
		}
		
		if(EditFilter.IncludeOutm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OUTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Outm);
		}
		
		if(EditFilter.IncludeRrea)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RREA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rrea);
		}
		
		if(EditFilter.IncludeConf)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Conf);
		}
		
		if(EditFilter.IncludeReas)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reas);
		}
		
		if(EditFilter.IncludeComm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Comm);
		}
		
		if(EditFilter.IncludeSqr1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SQR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sqr1);
		}
		
		if(EditFilter.IncludeSqr2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SQR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sqr2);
		}
		
		if(EditFilter.IncludeSqr3)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SQR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sqr3);
		}
		
		if(EditFilter.IncludeSqr4)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SQR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sqr4);
		}
		
		if(EditFilter.IncludeSqr5)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SQR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sqr5);
		}
		
		if(EditFilter.IncludeSqr6)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SQR6" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sqr6);
		}
		
		if(EditFilter.IncludeSqr7)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SQR7" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sqr7);
		}
		
		if(EditFilter.IncludeSqr8)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SQR8" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sqr8);
		}
		
		if(EditFilter.IncludeAcco)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACCO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Acco);
		}
		
		if(EditFilter.IncludeNaf1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NAF1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Naf1);
		}
		
		if(EditFilter.IncludeNaf2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NAF2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Naf2);
		}
		
		if(EditFilter.IncludeNaf3)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NAF3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Naf3);
		}
		
		if(EditFilter.IncludeNaf4)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NAF4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Naf4);
		}
		
		if(EditFilter.IncludeNat1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NAT1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nat1);
		}
		
		if(EditFilter.IncludeNat2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NAT2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nat2);
		}
		
		if(EditFilter.IncludeNat3)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NAT3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nat3);
		}
		
		if(EditFilter.IncludeNat4)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NAT4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nat4);
		}
		
		if(EditFilter.IncludeNotp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NOTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Notp);
		}
		
		if(EditFilter.IncludeXrea)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "XREA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Xrea);
		}
		
		if(EditFilter.IncludeXcom)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "XCOM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Xcom);
		}
		
		if(EditFilter.IncludeHpcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hpcd);
		}
		
		if(EditFilter.IncludeHcpname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpname);
		}
		
		if(EditFilter.IncludeResname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resname);
		}
		
		if(EditFilter.IncludeTitl)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Titl);
		}
		
		if(EditFilter.IncludeSnm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Snm);
		}
		
		if(EditFilter.IncludeFnm1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "FNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fnm1);
		}
		
		if(EditFilter.IncludeFnm2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "FNM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fnm2);
		}
		
		if(EditFilter.IncludeNhsnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NHSNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsnum);
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum);
		}
		
		if(EditFilter.IncludeMaxno)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MAXNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Maxno);
		}
		
		if(EditFilter.IncludePcho)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PCHO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pcho);
		}
		
		if(EditFilter.IncludePcln)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PCLN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pcln);
		}
		
		if(EditFilter.IncludeCurrent)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CURRENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Current);
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
			WaitlistRecord record = new WaitlistRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Wkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WKEY"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Hcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPCODE"));
			record.Rescode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESCODE"));
			record.Prty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRTY"));
			record.Donl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DONL"));
			record.Time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TIME"));
			record.Stay = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAY"));
			record.Intn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INTN"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Rfcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFCD"));
			record.Refr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFR"));
			record.Guad = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GUAD"));
			record.Orad = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORAD"));
			record.Spcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCD"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
			record.Rfgp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFGP"));
			record.Outc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUTC"));
			record.Oudt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUDT"));
			record.Outm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUTM"));
			record.Rrea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RREA"));
			record.Conf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONF"));
			record.Reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REAS"));
			record.Comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMM"));
			record.Sqr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR1"));
			record.Sqr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR2"));
			record.Sqr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR3"));
			record.Sqr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR4"));
			record.Sqr5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR5"));
			record.Sqr6 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR6"));
			record.Sqr7 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR7"));
			record.Sqr8 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR8"));
			record.Acco = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACCO"));
			record.Naf1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAF1"));
			record.Naf2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAF2"));
			record.Naf3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAF3"));
			record.Naf4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAF4"));
			record.Nat1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAT1"));
			record.Nat2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAT2"));
			record.Nat3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAT3"));
			record.Nat4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAT4"));
			record.Notp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOTP"));
			record.Xrea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "XREA"));
			record.Xcom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "XCOM"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
			record.Hcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNAME"));
			record.Resname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESNAME"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Fnm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM2"));
			record.Nhsnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNUM"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Maxno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXNO"));
			record.Pcho = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCHO"));
			record.Pcln = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCLN"));
			record.Current = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURRENT"));
									
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
			WaitlistRecord record = new WaitlistRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Wkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WKEY"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Hcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPCODE"));
			record.Rescode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESCODE"));
			record.Prty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRTY"));
			record.Donl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DONL"));
			record.Time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TIME"));
			record.Stay = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAY"));
			record.Intn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INTN"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Rfcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFCD"));
			record.Refr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFR"));
			record.Guad = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GUAD"));
			record.Orad = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORAD"));
			record.Spcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCD"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
			record.Rfgp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFGP"));
			record.Outc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUTC"));
			record.Oudt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUDT"));
			record.Outm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUTM"));
			record.Rrea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RREA"));
			record.Conf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONF"));
			record.Reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REAS"));
			record.Comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMM"));
			record.Sqr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR1"));
			record.Sqr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR2"));
			record.Sqr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR3"));
			record.Sqr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR4"));
			record.Sqr5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR5"));
			record.Sqr6 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR6"));
			record.Sqr7 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR7"));
			record.Sqr8 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SQR8"));
			record.Acco = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACCO"));
			record.Naf1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAF1"));
			record.Naf2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAF2"));
			record.Naf3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAF3"));
			record.Naf4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAF4"));
			record.Nat1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAT1"));
			record.Nat2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAT2"));
			record.Nat3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAT3"));
			record.Nat4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAT4"));
			record.Notp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOTP"));
			record.Xrea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "XREA"));
			record.Xcom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "XCOM"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
			record.Hcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNAME"));
			record.Resname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESNAME"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Fnm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM2"));
			record.Nhsnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNUM"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Maxno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXNO"));
			record.Pcho = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCHO"));
			record.Pcln = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCLN"));
			record.Current = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURRENT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class WaitlistCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			WaitlistRecord newRecord = new WaitlistRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(WaitlistRecord record)
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
		public WaitlistRecord get(int index)
		{
			return (WaitlistRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class WaitlistRecord
	{
		public String Wkey = "";
		public String Pkey = "";
		public String Hcpcode = "";
		public String Rescode = "";
		public String Prty = "";
		public String Donl = "";
		public String Time = "";
		public String Stay = "";
		public String Intn = "";
		public String Stat = "";
		public String Rfcd = "";
		public String Refr = "";
		public String Guad = "";
		public String Orad = "";
		public String Spcd = "";
		public String Harc = "";
		public String Rfgp = "";
		public String Outc = "";
		public String Oudt = "";
		public String Outm = "";
		public String Rrea = "";
		public String Conf = "";
		public String Reas = "";
		public String Comm = "";
		public String Sqr1 = "";
		public String Sqr2 = "";
		public String Sqr3 = "";
		public String Sqr4 = "";
		public String Sqr5 = "";
		public String Sqr6 = "";
		public String Sqr7 = "";
		public String Sqr8 = "";
		public String Acco = "";
		public String Naf1 = "";
		public String Naf2 = "";
		public String Naf3 = "";
		public String Naf4 = "";
		public String Nat1 = "";
		public String Nat2 = "";
		public String Nat3 = "";
		public String Nat4 = "";
		public String Notp = "";
		public String Xrea = "";
		public String Xcom = "";
		public String Hpcd = "";
		public String Hcpname = "";
		public String Resname = "";
		public String Titl = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Fnm2 = "";
		public String Nhsnum = "";
		public String Hospnum = "";
		public String Maxno = "";
		public String Pcho = "";
		public String Pcln = "";
		public String Current = "";
				
		
		public void clear()
		{
			Wkey = "";
			Pkey = "";
			Hcpcode = "";
			Rescode = "";
			Prty = "";
			Donl = "";
			Time = "";
			Stay = "";
			Intn = "";
			Stat = "";
			Rfcd = "";
			Refr = "";
			Guad = "";
			Orad = "";
			Spcd = "";
			Harc = "";
			Rfgp = "";
			Outc = "";
			Oudt = "";
			Outm = "";
			Rrea = "";
			Conf = "";
			Reas = "";
			Comm = "";
			Sqr1 = "";
			Sqr2 = "";
			Sqr3 = "";
			Sqr4 = "";
			Sqr5 = "";
			Sqr6 = "";
			Sqr7 = "";
			Sqr8 = "";
			Acco = "";
			Naf1 = "";
			Naf2 = "";
			Naf3 = "";
			Naf4 = "";
			Nat1 = "";
			Nat2 = "";
			Nat3 = "";
			Nat4 = "";
			Notp = "";
			Xrea = "";
			Xcom = "";
			Hpcd = "";
			Hcpname = "";
			Resname = "";
			Titl = "";
			Snm = "";
			Fnm1 = "";
			Fnm2 = "";
			Nhsnum = "";
			Hospnum = "";
			Maxno = "";
			Pcho = "";
			Pcln = "";
			Current = "";
			
		}		
	}
		
		
	public final class WaitlistFilter
	{			
		public String Wkey = "";
		public String Pkey = "";
		public String Hcpcode = "";
		public String Rescode = "";
		public String Prty = "";
		public String Donl = "";
		public String Time = "";
		public String Stay = "";
		public String Intn = "";
		public String Stat = "";
		public String Rfcd = "";
		public String Refr = "";
		public String Guad = "";
		public String Orad = "";
		public String Spcd = "";
		public String Harc = "";
		public String Rfgp = "";
		public String Outc = "";
		public String Oudt = "";
		public String Outm = "";
		public String Rrea = "";
		public String Conf = "";
		public String Reas = "";
		public String Comm = "";
		public String Sqr1 = "";
		public String Sqr2 = "";
		public String Sqr3 = "";
		public String Sqr4 = "";
		public String Sqr5 = "";
		public String Sqr6 = "";
		public String Sqr7 = "";
		public String Sqr8 = "";
		public String Acco = "";
		public String Naf1 = "";
		public String Naf2 = "";
		public String Naf3 = "";
		public String Naf4 = "";
		public String Nat1 = "";
		public String Nat2 = "";
		public String Nat3 = "";
		public String Nat4 = "";
		public String Notp = "";
		public String Xrea = "";
		public String Xcom = "";
		public String Hpcd = "";
		public String Hcpname = "";
		public String Resname = "";
		public String Titl = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Fnm2 = "";
		public String Nhsnum = "";
		public String Hospnum = "";
		public String Maxno = "";
		public String Pcho = "";
		public String Pcln = "";
		public String Current = "";
		
		public void clear()
		{				
			Wkey = "";
			Pkey = "";
			Hcpcode = "";
			Rescode = "";
			Prty = "";
			Donl = "";
			Time = "";
			Stay = "";
			Intn = "";
			Stat = "";
			Rfcd = "";
			Refr = "";
			Guad = "";
			Orad = "";
			Spcd = "";
			Harc = "";
			Rfgp = "";
			Outc = "";
			Oudt = "";
			Outm = "";
			Rrea = "";
			Conf = "";
			Reas = "";
			Comm = "";
			Sqr1 = "";
			Sqr2 = "";
			Sqr3 = "";
			Sqr4 = "";
			Sqr5 = "";
			Sqr6 = "";
			Sqr7 = "";
			Sqr8 = "";
			Acco = "";
			Naf1 = "";
			Naf2 = "";
			Naf3 = "";
			Naf4 = "";
			Nat1 = "";
			Nat2 = "";
			Nat3 = "";
			Nat4 = "";
			Notp = "";
			Xrea = "";
			Xcom = "";
			Hpcd = "";
			Hcpname = "";
			Resname = "";
			Titl = "";
			Snm = "";
			Fnm1 = "";
			Fnm2 = "";
			Nhsnum = "";
			Hospnum = "";
			Maxno = "";
			Pcho = "";
			Pcln = "";
			Current = "";
		}	
		public WaitlistFilter cloneObject()
		{
			WaitlistFilter newFilter = new WaitlistFilter();
			
			newFilter.Wkey = this.Wkey;
			newFilter.Pkey = this.Pkey;
			newFilter.Hcpcode = this.Hcpcode;
			newFilter.Rescode = this.Rescode;
			newFilter.Prty = this.Prty;
			newFilter.Donl = this.Donl;
			newFilter.Time = this.Time;
			newFilter.Stay = this.Stay;
			newFilter.Intn = this.Intn;
			newFilter.Stat = this.Stat;
			newFilter.Rfcd = this.Rfcd;
			newFilter.Refr = this.Refr;
			newFilter.Guad = this.Guad;
			newFilter.Orad = this.Orad;
			newFilter.Spcd = this.Spcd;
			newFilter.Harc = this.Harc;
			newFilter.Rfgp = this.Rfgp;
			newFilter.Outc = this.Outc;
			newFilter.Oudt = this.Oudt;
			newFilter.Outm = this.Outm;
			newFilter.Rrea = this.Rrea;
			newFilter.Conf = this.Conf;
			newFilter.Reas = this.Reas;
			newFilter.Comm = this.Comm;
			newFilter.Sqr1 = this.Sqr1;
			newFilter.Sqr2 = this.Sqr2;
			newFilter.Sqr3 = this.Sqr3;
			newFilter.Sqr4 = this.Sqr4;
			newFilter.Sqr5 = this.Sqr5;
			newFilter.Sqr6 = this.Sqr6;
			newFilter.Sqr7 = this.Sqr7;
			newFilter.Sqr8 = this.Sqr8;
			newFilter.Acco = this.Acco;
			newFilter.Naf1 = this.Naf1;
			newFilter.Naf2 = this.Naf2;
			newFilter.Naf3 = this.Naf3;
			newFilter.Naf4 = this.Naf4;
			newFilter.Nat1 = this.Nat1;
			newFilter.Nat2 = this.Nat2;
			newFilter.Nat3 = this.Nat3;
			newFilter.Nat4 = this.Nat4;
			newFilter.Notp = this.Notp;
			newFilter.Xrea = this.Xrea;
			newFilter.Xcom = this.Xcom;
			newFilter.Hpcd = this.Hpcd;
			newFilter.Hcpname = this.Hcpname;
			newFilter.Resname = this.Resname;
			newFilter.Titl = this.Titl;
			newFilter.Snm = this.Snm;
			newFilter.Fnm1 = this.Fnm1;
			newFilter.Fnm2 = this.Fnm2;
			newFilter.Nhsnum = this.Nhsnum;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Maxno = this.Maxno;
			newFilter.Pcho = this.Pcho;
			newFilter.Pcln = this.Pcln;
			newFilter.Current = this.Current;
			
			return newFilter;
		}
	}
	public final class WaitlistEditFilter
	{			
		public boolean IncludeWkey = true;
		public boolean IncludePkey = true;
		public boolean IncludeHcpcode = true;
		public boolean IncludeRescode = true;
		public boolean IncludePrty = true;
		public boolean IncludeDonl = true;
		public boolean IncludeTime = true;
		public boolean IncludeStay = true;
		public boolean IncludeIntn = true;
		public boolean IncludeStat = true;
		public boolean IncludeRfcd = true;
		public boolean IncludeRefr = true;
		public boolean IncludeGuad = true;
		public boolean IncludeOrad = true;
		public boolean IncludeSpcd = true;
		public boolean IncludeHarc = true;
		public boolean IncludeRfgp = true;
		public boolean IncludeOutc = true;
		public boolean IncludeOudt = true;
		public boolean IncludeOutm = true;
		public boolean IncludeRrea = true;
		public boolean IncludeConf = true;
		public boolean IncludeReas = true;
		public boolean IncludeComm = true;
		public boolean IncludeSqr1 = true;
		public boolean IncludeSqr2 = true;
		public boolean IncludeSqr3 = true;
		public boolean IncludeSqr4 = true;
		public boolean IncludeSqr5 = true;
		public boolean IncludeSqr6 = true;
		public boolean IncludeSqr7 = true;
		public boolean IncludeSqr8 = true;
		public boolean IncludeAcco = true;
		public boolean IncludeNaf1 = true;
		public boolean IncludeNaf2 = true;
		public boolean IncludeNaf3 = true;
		public boolean IncludeNaf4 = true;
		public boolean IncludeNat1 = true;
		public boolean IncludeNat2 = true;
		public boolean IncludeNat3 = true;
		public boolean IncludeNat4 = true;
		public boolean IncludeNotp = true;
		public boolean IncludeXrea = true;
		public boolean IncludeXcom = true;
		public boolean IncludeHpcd = true;
		public boolean IncludeHcpname = true;
		public boolean IncludeResname = true;
		public boolean IncludeTitl = true;
		public boolean IncludeSnm = true;
		public boolean IncludeFnm1 = true;
		public boolean IncludeFnm2 = true;
		public boolean IncludeNhsnum = true;
		public boolean IncludeHospnum = true;
		public boolean IncludeMaxno = true;
		public boolean IncludePcho = true;
		public boolean IncludePcln = true;
		public boolean IncludeCurrent = true;
		
		public void includeAll()
		{				
			IncludeWkey = true;
			IncludePkey = true;
			IncludeHcpcode = true;
			IncludeRescode = true;
			IncludePrty = true;
			IncludeDonl = true;
			IncludeTime = true;
			IncludeStay = true;
			IncludeIntn = true;
			IncludeStat = true;
			IncludeRfcd = true;
			IncludeRefr = true;
			IncludeGuad = true;
			IncludeOrad = true;
			IncludeSpcd = true;
			IncludeHarc = true;
			IncludeRfgp = true;
			IncludeOutc = true;
			IncludeOudt = true;
			IncludeOutm = true;
			IncludeRrea = true;
			IncludeConf = true;
			IncludeReas = true;
			IncludeComm = true;
			IncludeSqr1 = true;
			IncludeSqr2 = true;
			IncludeSqr3 = true;
			IncludeSqr4 = true;
			IncludeSqr5 = true;
			IncludeSqr6 = true;
			IncludeSqr7 = true;
			IncludeSqr8 = true;
			IncludeAcco = true;
			IncludeNaf1 = true;
			IncludeNaf2 = true;
			IncludeNaf3 = true;
			IncludeNaf4 = true;
			IncludeNat1 = true;
			IncludeNat2 = true;
			IncludeNat3 = true;
			IncludeNat4 = true;
			IncludeNotp = true;
			IncludeXrea = true;
			IncludeXcom = true;
			IncludeHpcd = true;
			IncludeHcpname = true;
			IncludeResname = true;
			IncludeTitl = true;
			IncludeSnm = true;
			IncludeFnm1 = true;
			IncludeFnm2 = true;
			IncludeNhsnum = true;
			IncludeHospnum = true;
			IncludeMaxno = true;
			IncludePcho = true;
			IncludePcln = true;
			IncludeCurrent = true;
		}	
		public void excludeAll()
		{				
			IncludeWkey = false;
			IncludePkey = false;
			IncludeHcpcode = false;
			IncludeRescode = false;
			IncludePrty = false;
			IncludeDonl = false;
			IncludeTime = false;
			IncludeStay = false;
			IncludeIntn = false;
			IncludeStat = false;
			IncludeRfcd = false;
			IncludeRefr = false;
			IncludeGuad = false;
			IncludeOrad = false;
			IncludeSpcd = false;
			IncludeHarc = false;
			IncludeRfgp = false;
			IncludeOutc = false;
			IncludeOudt = false;
			IncludeOutm = false;
			IncludeRrea = false;
			IncludeConf = false;
			IncludeReas = false;
			IncludeComm = false;
			IncludeSqr1 = false;
			IncludeSqr2 = false;
			IncludeSqr3 = false;
			IncludeSqr4 = false;
			IncludeSqr5 = false;
			IncludeSqr6 = false;
			IncludeSqr7 = false;
			IncludeSqr8 = false;
			IncludeAcco = false;
			IncludeNaf1 = false;
			IncludeNaf2 = false;
			IncludeNaf3 = false;
			IncludeNaf4 = false;
			IncludeNat1 = false;
			IncludeNat2 = false;
			IncludeNat3 = false;
			IncludeNat4 = false;
			IncludeNotp = false;
			IncludeXrea = false;
			IncludeXcom = false;
			IncludeHpcd = false;
			IncludeHcpname = false;
			IncludeResname = false;
			IncludeTitl = false;
			IncludeSnm = false;
			IncludeFnm1 = false;
			IncludeFnm2 = false;
			IncludeNhsnum = false;
			IncludeHospnum = false;
			IncludeMaxno = false;
			IncludePcho = false;
			IncludePcln = false;
			IncludeCurrent = false;
		}
		public WaitlistEditFilter cloneObject()
		{
			WaitlistEditFilter newEditFilter = new WaitlistEditFilter();
			
			newEditFilter.IncludeWkey = this.IncludeWkey;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeHcpcode = this.IncludeHcpcode;
			newEditFilter.IncludeRescode = this.IncludeRescode;
			newEditFilter.IncludePrty = this.IncludePrty;
			newEditFilter.IncludeDonl = this.IncludeDonl;
			newEditFilter.IncludeTime = this.IncludeTime;
			newEditFilter.IncludeStay = this.IncludeStay;
			newEditFilter.IncludeIntn = this.IncludeIntn;
			newEditFilter.IncludeStat = this.IncludeStat;
			newEditFilter.IncludeRfcd = this.IncludeRfcd;
			newEditFilter.IncludeRefr = this.IncludeRefr;
			newEditFilter.IncludeGuad = this.IncludeGuad;
			newEditFilter.IncludeOrad = this.IncludeOrad;
			newEditFilter.IncludeSpcd = this.IncludeSpcd;
			newEditFilter.IncludeHarc = this.IncludeHarc;
			newEditFilter.IncludeRfgp = this.IncludeRfgp;
			newEditFilter.IncludeOutc = this.IncludeOutc;
			newEditFilter.IncludeOudt = this.IncludeOudt;
			newEditFilter.IncludeOutm = this.IncludeOutm;
			newEditFilter.IncludeRrea = this.IncludeRrea;
			newEditFilter.IncludeConf = this.IncludeConf;
			newEditFilter.IncludeReas = this.IncludeReas;
			newEditFilter.IncludeComm = this.IncludeComm;
			newEditFilter.IncludeSqr1 = this.IncludeSqr1;
			newEditFilter.IncludeSqr2 = this.IncludeSqr2;
			newEditFilter.IncludeSqr3 = this.IncludeSqr3;
			newEditFilter.IncludeSqr4 = this.IncludeSqr4;
			newEditFilter.IncludeSqr5 = this.IncludeSqr5;
			newEditFilter.IncludeSqr6 = this.IncludeSqr6;
			newEditFilter.IncludeSqr7 = this.IncludeSqr7;
			newEditFilter.IncludeSqr8 = this.IncludeSqr8;
			newEditFilter.IncludeAcco = this.IncludeAcco;
			newEditFilter.IncludeNaf1 = this.IncludeNaf1;
			newEditFilter.IncludeNaf2 = this.IncludeNaf2;
			newEditFilter.IncludeNaf3 = this.IncludeNaf3;
			newEditFilter.IncludeNaf4 = this.IncludeNaf4;
			newEditFilter.IncludeNat1 = this.IncludeNat1;
			newEditFilter.IncludeNat2 = this.IncludeNat2;
			newEditFilter.IncludeNat3 = this.IncludeNat3;
			newEditFilter.IncludeNat4 = this.IncludeNat4;
			newEditFilter.IncludeNotp = this.IncludeNotp;
			newEditFilter.IncludeXrea = this.IncludeXrea;
			newEditFilter.IncludeXcom = this.IncludeXcom;
			newEditFilter.IncludeHpcd = this.IncludeHpcd;
			newEditFilter.IncludeHcpname = this.IncludeHcpname;
			newEditFilter.IncludeResname = this.IncludeResname;
			newEditFilter.IncludeTitl = this.IncludeTitl;
			newEditFilter.IncludeSnm = this.IncludeSnm;
			newEditFilter.IncludeFnm1 = this.IncludeFnm1;
			newEditFilter.IncludeFnm2 = this.IncludeFnm2;
			newEditFilter.IncludeNhsnum = this.IncludeNhsnum;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeMaxno = this.IncludeMaxno;
			newEditFilter.IncludePcho = this.IncludePcho;
			newEditFilter.IncludePcln = this.IncludePcln;
			newEditFilter.IncludeCurrent = this.IncludeCurrent;
			
			return newEditFilter;
		}
	}
}
