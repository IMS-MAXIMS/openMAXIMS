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

public final class Genprc
{
	private GenprcFilter lastGetFilter = null;
	private final String serviceName = "GENPRC";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public GenprcFilter Filter = new GenprcFilter();			
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public GenprcCollection DataCollection = new GenprcCollection();

	/**
	 * Creates a new Genprc Data Transfer Object.
	 */ 
	public Genprc(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Genprc cloneObject() throws ims.dto.Exception
	{
		Genprc cloneObject = new Genprc(Connection);
			
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
			cloneObject.DataCollection.get(index).Fpc = DataCollection.get(x).Fpc;
			cloneObject.DataCollection.get(index).Gpcd = DataCollection.get(x).Gpcd;
			cloneObject.DataCollection.get(index).Prcd = DataCollection.get(x).Prcd;
			cloneObject.DataCollection.get(index).Ngpc = DataCollection.get(x).Ngpc;
			cloneObject.DataCollection.get(index).Ngpf = DataCollection.get(x).Ngpf;
			cloneObject.DataCollection.get(index).Pcg = DataCollection.get(x).Pcg;
			cloneObject.DataCollection.get(index).Adr1 = DataCollection.get(x).Adr1;
			cloneObject.DataCollection.get(index).Adr2 = DataCollection.get(x).Adr2;
			cloneObject.DataCollection.get(index).Adr3 = DataCollection.get(x).Adr3;
			cloneObject.DataCollection.get(index).Adr4 = DataCollection.get(x).Adr4;
			cloneObject.DataCollection.get(index).Adr5 = DataCollection.get(x).Adr5;
			cloneObject.DataCollection.get(index).Pcod = DataCollection.get(x).Pcod;
			cloneObject.DataCollection.get(index).Main = DataCollection.get(x).Main;
			cloneObject.DataCollection.get(index).Fax = DataCollection.get(x).Fax;
			cloneObject.DataCollection.get(index).Tel = DataCollection.get(x).Tel;
			cloneObject.DataCollection.get(index).Emal = DataCollection.get(x).Emal;
			cloneObject.DataCollection.get(index).Pref = DataCollection.get(x).Pref;
			cloneObject.DataCollection.get(index).Sdat = DataCollection.get(x).Sdat;
			cloneObject.DataCollection.get(index).Edat = DataCollection.get(x).Edat;
			cloneObject.DataCollection.get(index).Rgp = DataCollection.get(x).Rgp;
			cloneObject.DataCollection.get(index).Adnm = DataCollection.get(x).Adnm;
			cloneObject.DataCollection.get(index).Surn = DataCollection.get(x).Surn;
			cloneObject.DataCollection.get(index).Roc = DataCollection.get(x).Roc;
			cloneObject.DataCollection.get(index).Hac = DataCollection.get(x).Hac;
			cloneObject.DataCollection.get(index).Code = DataCollection.get(x).Code;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).Loc = DataCollection.get(x).Loc;
			cloneObject.DataCollection.get(index).Date = DataCollection.get(x).Date;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).__orderby = DataCollection.get(x).__orderby;
							
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Genprc.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Genprc.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Genprc.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Genprc.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Genprc.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Genprc.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Genprc.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Genprc.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Genprc.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Genprc.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Genprc.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Genprc.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Genprc.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Genprc.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Genprc.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Genprc.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Genprc.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Genprc.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Genprc.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Genprc.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Genprc.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Genprc.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Genprc.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Genprc.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Genprc.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Genprc.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Genprc.List");
							
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
	private String encodeNASFilter(GenprcFilter filter)
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
		
		if(Filter.Fpc != null && filter.Fpc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FPC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fpc;
		}
		
		if(Filter.Gpcd != null && filter.Gpcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpcd;
		}
		
		if(Filter.Prcd != null && filter.Prcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PRCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prcd;
		}
		
		if(Filter.Ngpc != null && filter.Ngpc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NGPC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ngpc;
		}
		
		if(Filter.Ngpf != null && filter.Ngpf.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NGPF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ngpf;
		}
		
		if(Filter.Pcg != null && filter.Pcg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PCG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pcg;
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
		
		if(Filter.Adr5 != null && filter.Adr5.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr5;
		}
		
		if(Filter.Pcod != null && filter.Pcod.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PCOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pcod;
		}
		
		if(Filter.Main != null && filter.Main.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Main;
		}
		
		if(Filter.Fax != null && filter.Fax.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FAX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fax;
		}
		
		if(Filter.Tel != null && filter.Tel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tel;
		}
		
		if(Filter.Emal != null && filter.Emal.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EMAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Emal;
		}
		
		if(Filter.Pref != null && filter.Pref.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PREF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pref;
		}
		
		if(Filter.Sdat != null && filter.Sdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sdat;
		}
		
		if(Filter.Edat != null && filter.Edat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Edat;
		}
		
		if(Filter.Rgp != null && filter.Rgp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RGP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rgp;
		}
		
		if(Filter.Adnm != null && filter.Adnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adnm;
		}
		
		if(Filter.Surn != null && filter.Surn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SURN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Surn;
		}
		
		if(Filter.Roc != null && filter.Roc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ROC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Roc;
		}
		
		if(Filter.Hac != null && filter.Hac.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HAC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hac;
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
		
		if(Filter.Loc != null && filter.Loc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Loc;
		}
		
		if(Filter.Date != null && filter.Date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Date;
		}
		
		if(Filter.Active != null && filter.Active.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Active;
		}
		
		if(Filter.__orderby != null && filter.__orderby.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "__ORDERBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.__orderby;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		GenprcRecord data = (GenprcRecord)DataCollection.get(0);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RSNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rsno);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Name);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "FPC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fpc);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "GPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpcd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PRCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prcd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "NGPC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ngpc);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "NGPF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ngpf);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PCG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pcg);
		
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
		dataString += "ADR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr5);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PCOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pcod);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "MAIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Main);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "FAX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fax);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tel);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "EMAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Emal);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PREF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pref);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sdat);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "EDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Edat);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RGP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rgp);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adnm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SURN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Surn);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ROC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Roc);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "HAC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hac);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Code);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "LOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Loc);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Date);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Active);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "__ORDERBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.__orderby);
		
		
			
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
			GenprcRecord record = new GenprcRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSNO"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Fpc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FPC"));
			record.Gpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCD"));
			record.Prcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRCD"));
			record.Ngpc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NGPC"));
			record.Ngpf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NGPF"));
			record.Pcg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCG"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Adr5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR5"));
			record.Pcod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCOD"));
			record.Main = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAIN"));
			record.Fax = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FAX"));
			record.Tel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEL"));
			record.Emal = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMAL"));
			record.Pref = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PREF"));
			record.Sdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SDAT"));
			record.Edat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EDAT"));
			record.Rgp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RGP"));
			record.Adnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADNM"));
			record.Surn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SURN"));
			record.Roc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ROC"));
			record.Hac = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HAC"));
			record.Code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CODE"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Loc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LOC"));
			record.Date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATE"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.__orderby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "__ORDERBY"));
									
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
			GenprcRecord record = new GenprcRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSNO"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Fpc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FPC"));
			record.Gpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCD"));
			record.Prcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRCD"));
			record.Ngpc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NGPC"));
			record.Ngpf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NGPF"));
			record.Pcg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCG"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Adr5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR5"));
			record.Pcod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCOD"));
			record.Main = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAIN"));
			record.Fax = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FAX"));
			record.Tel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEL"));
			record.Emal = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMAL"));
			record.Pref = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PREF"));
			record.Sdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SDAT"));
			record.Edat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EDAT"));
			record.Rgp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RGP"));
			record.Adnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADNM"));
			record.Surn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SURN"));
			record.Roc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ROC"));
			record.Hac = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HAC"));
			record.Code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CODE"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Loc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LOC"));
			record.Date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATE"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.__orderby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "__ORDERBY"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class GenprcCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			GenprcRecord newRecord = new GenprcRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(GenprcRecord record)
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
		public GenprcRecord get(int index)
		{
			return (GenprcRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class GenprcRecord
	{
		public String Rsno = "";
		public String Name = "";
		public String Fpc = "";
		public String Gpcd = "";
		public String Prcd = "";
		public String Ngpc = "";
		public String Ngpf = "";
		public String Pcg = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Adr5 = "";
		public String Pcod = "";
		public String Main = "";
		public String Fax = "";
		public String Tel = "";
		public String Emal = "";
		public String Pref = "";
		public String Sdat = "";
		public String Edat = "";
		public String Rgp = "";
		public String Adnm = "";
		public String Surn = "";
		public String Roc = "";
		public String Hac = "";
		public String Code = "";
		public String Stat = "";
		public String Loc = "";
		public String Date = "";
		public String Active = "";
		public String __orderby = "";
				
		
		public void clear()
		{
			Rsno = "";
			Name = "";
			Fpc = "";
			Gpcd = "";
			Prcd = "";
			Ngpc = "";
			Ngpf = "";
			Pcg = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Adr5 = "";
			Pcod = "";
			Main = "";
			Fax = "";
			Tel = "";
			Emal = "";
			Pref = "";
			Sdat = "";
			Edat = "";
			Rgp = "";
			Adnm = "";
			Surn = "";
			Roc = "";
			Hac = "";
			Code = "";
			Stat = "";
			Loc = "";
			Date = "";
			Active = "";
			__orderby = "";
			
		}		
	}
		
		
	public final class GenprcFilter
	{			
		public String Rsno = "";
		public String Name = "";
		public String Fpc = "";
		public String Gpcd = "";
		public String Prcd = "";
		public String Ngpc = "";
		public String Ngpf = "";
		public String Pcg = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Adr5 = "";
		public String Pcod = "";
		public String Main = "";
		public String Fax = "";
		public String Tel = "";
		public String Emal = "";
		public String Pref = "";
		public String Sdat = "";
		public String Edat = "";
		public String Rgp = "";
		public String Adnm = "";
		public String Surn = "";
		public String Roc = "";
		public String Hac = "";
		public String Code = "";
		public String Stat = "";
		public String Loc = "";
		public String Date = "";
		public String Active = "";
		public String __orderby = "";
		
		public void clear()
		{				
			Rsno = "";
			Name = "";
			Fpc = "";
			Gpcd = "";
			Prcd = "";
			Ngpc = "";
			Ngpf = "";
			Pcg = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Adr5 = "";
			Pcod = "";
			Main = "";
			Fax = "";
			Tel = "";
			Emal = "";
			Pref = "";
			Sdat = "";
			Edat = "";
			Rgp = "";
			Adnm = "";
			Surn = "";
			Roc = "";
			Hac = "";
			Code = "";
			Stat = "";
			Loc = "";
			Date = "";
			Active = "";
			__orderby = "";
		}	
		public GenprcFilter cloneObject()
		{
			GenprcFilter newFilter = new GenprcFilter();
			
			newFilter.Rsno = this.Rsno;
			newFilter.Name = this.Name;
			newFilter.Fpc = this.Fpc;
			newFilter.Gpcd = this.Gpcd;
			newFilter.Prcd = this.Prcd;
			newFilter.Ngpc = this.Ngpc;
			newFilter.Ngpf = this.Ngpf;
			newFilter.Pcg = this.Pcg;
			newFilter.Adr1 = this.Adr1;
			newFilter.Adr2 = this.Adr2;
			newFilter.Adr3 = this.Adr3;
			newFilter.Adr4 = this.Adr4;
			newFilter.Adr5 = this.Adr5;
			newFilter.Pcod = this.Pcod;
			newFilter.Main = this.Main;
			newFilter.Fax = this.Fax;
			newFilter.Tel = this.Tel;
			newFilter.Emal = this.Emal;
			newFilter.Pref = this.Pref;
			newFilter.Sdat = this.Sdat;
			newFilter.Edat = this.Edat;
			newFilter.Rgp = this.Rgp;
			newFilter.Adnm = this.Adnm;
			newFilter.Surn = this.Surn;
			newFilter.Roc = this.Roc;
			newFilter.Hac = this.Hac;
			newFilter.Code = this.Code;
			newFilter.Stat = this.Stat;
			newFilter.Loc = this.Loc;
			newFilter.Date = this.Date;
			newFilter.Active = this.Active;
			newFilter.__orderby = this.__orderby;
			
			return newFilter;
		}
	}
}
