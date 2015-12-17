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

public final class Prislochist
{
	private PrislochistFilter lastGetFilter = null;
	private final String serviceName = "PRISLOCHIST";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public PrislochistFilter Filter = new PrislochistFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public PrislochistEditFilter EditFilter = new PrislochistEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public PrislochistCollection DataCollection = new PrislochistCollection();

	/**
	 * Creates a new Prislochist Data Transfer Object.
	 */ 
	public Prislochist(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Prislochist cloneObject() throws ims.dto.Exception
	{
		Prislochist cloneObject = new Prislochist(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Pprisnum = DataCollection.get(x).Pprisnum;
			cloneObject.DataCollection.get(index).Eestabcd = DataCollection.get(x).Eestabcd;
			cloneObject.DataCollection.get(index).Hhcdto = DataCollection.get(x).Hhcdto;
			cloneObject.DataCollection.get(index).Clcellcdto = DataCollection.get(x).Clcellcdto;
			cloneObject.DataCollection.get(index).Hhcdfrom = DataCollection.get(x).Hhcdfrom;
			cloneObject.DataCollection.get(index).Clcellcdfrom = DataCollection.get(x).Clcellcdfrom;
			cloneObject.DataCollection.get(index).Pmintnum = DataCollection.get(x).Pmintnum;
			cloneObject.DataCollection.get(index).Pmintdatin = DataCollection.get(x).Pmintdatin;
			cloneObject.DataCollection.get(index).Padcellreason = DataCollection.get(x).Padcellreason;
			cloneObject.DataCollection.get(index).Padcellvalidatdby = DataCollection.get(x).Padcellvalidatdby;
			cloneObject.DataCollection.get(index).Isolstartdat = DataCollection.get(x).Isolstartdat;
			cloneObject.DataCollection.get(index).Isolenddat = DataCollection.get(x).Isolenddat;
			cloneObject.DataCollection.get(index).Eestabnam = DataCollection.get(x).Eestabnam;
			cloneObject.DataCollection.get(index).Halltotxt = DataCollection.get(x).Halltotxt;
			cloneObject.DataCollection.get(index).Hallfromtxt = DataCollection.get(x).Hallfromtxt;
			cloneObject.DataCollection.get(index).Cellfeatcd = DataCollection.get(x).Cellfeatcd;
			cloneObject.DataCollection.get(index).Clfeattxt = DataCollection.get(x).Clfeattxt;
			cloneObject.DataCollection.get(index).Padcellreastxt = DataCollection.get(x).Padcellreastxt;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "7";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Prislochist.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prislochist.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Prislochist.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prislochist.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prislochist.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prislochist.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Prislochist.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Prislochist.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prislochist.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Prislochist.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Prislochist.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Prislochist.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Prislochist.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Prislochist.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prislochist.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Prislochist.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Prislochist.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Prislochist.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Prislochist.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Prislochist.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prislochist.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Prislochist.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Prislochist.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prislochist.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Prislochist.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Prislochist.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Prislochist.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Prislochist.List");
							
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
	private String encodeNASFilter(PrislochistFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Pprisnum != null && filter.Pprisnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PPRISNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pprisnum;
		}
		
		if(Filter.Eestabcd != null && filter.Eestabcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EESTABCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eestabcd;
		}
		
		if(Filter.Hhcdto != null && filter.Hhcdto.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HHCDTO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hhcdto;
		}
		
		if(Filter.Clcellcdto != null && filter.Clcellcdto.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLCELLCDTO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clcellcdto;
		}
		
		if(Filter.Hhcdfrom != null && filter.Hhcdfrom.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HHCDFROM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hhcdfrom;
		}
		
		if(Filter.Clcellcdfrom != null && filter.Clcellcdfrom.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLCELLCDFROM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clcellcdfrom;
		}
		
		if(Filter.Pmintnum != null && filter.Pmintnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PMINTNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pmintnum;
		}
		
		if(Filter.Pmintdatin != null && filter.Pmintdatin.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PMINTDATIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pmintdatin;
		}
		
		if(Filter.Padcellreason != null && filter.Padcellreason.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PADCELLREASON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Padcellreason;
		}
		
		if(Filter.Padcellvalidatdby != null && filter.Padcellvalidatdby.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PADCELLVALIDATDBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Padcellvalidatdby;
		}
		
		if(Filter.Isolstartdat != null && filter.Isolstartdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ISOLSTARTDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Isolstartdat;
		}
		
		if(Filter.Isolenddat != null && filter.Isolenddat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ISOLENDDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Isolenddat;
		}
		
		if(Filter.Eestabnam != null && filter.Eestabnam.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EESTABNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eestabnam;
		}
		
		if(Filter.Halltotxt != null && filter.Halltotxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HALLTOTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Halltotxt;
		}
		
		if(Filter.Hallfromtxt != null && filter.Hallfromtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HALLFROMTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hallfromtxt;
		}
		
		if(Filter.Cellfeatcd != null && filter.Cellfeatcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CELLFEATCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cellfeatcd;
		}
		
		if(Filter.Clfeattxt != null && filter.Clfeattxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLFEATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clfeattxt;
		}
		
		if(Filter.Padcellreastxt != null && filter.Padcellreastxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PADCELLREASTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Padcellreastxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		PrislochistRecord data = (PrislochistRecord)DataCollection.get(0);
		
		if(EditFilter.IncludePprisnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PPRISNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pprisnum);
		}
		
		if(EditFilter.IncludeEestabcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EESTABCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eestabcd);
		}
		
		if(EditFilter.IncludeHhcdto)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HHCDTO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hhcdto);
		}
		
		if(EditFilter.IncludeClcellcdto)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLCELLCDTO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clcellcdto);
		}
		
		if(EditFilter.IncludeHhcdfrom)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HHCDFROM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hhcdfrom);
		}
		
		if(EditFilter.IncludeClcellcdfrom)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLCELLCDFROM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clcellcdfrom);
		}
		
		if(EditFilter.IncludePmintnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PMINTNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pmintnum);
		}
		
		if(EditFilter.IncludePmintdatin)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PMINTDATIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pmintdatin);
		}
		
		if(EditFilter.IncludePadcellreason)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PADCELLREASON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Padcellreason);
		}
		
		if(EditFilter.IncludePadcellvalidatdby)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PADCELLVALIDATDBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Padcellvalidatdby);
		}
		
		if(EditFilter.IncludeIsolstartdat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ISOLSTARTDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Isolstartdat);
		}
		
		if(EditFilter.IncludeIsolenddat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ISOLENDDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Isolenddat);
		}
		
		if(EditFilter.IncludeEestabnam)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EESTABNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eestabnam);
		}
		
		if(EditFilter.IncludeHalltotxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HALLTOTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Halltotxt);
		}
		
		if(EditFilter.IncludeHallfromtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HALLFROMTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hallfromtxt);
		}
		
		if(EditFilter.IncludeCellfeatcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CELLFEATCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cellfeatcd);
		}
		
		if(EditFilter.IncludeClfeattxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLFEATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clfeattxt);
		}
		
		if(EditFilter.IncludePadcellreastxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PADCELLREASTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Padcellreastxt);
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
			PrislochistRecord record = new PrislochistRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pprisnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PPRISNUM"));
			record.Eestabcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EESTABCD"));
			record.Hhcdto = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HHCDTO"));
			record.Clcellcdto = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLCELLCDTO"));
			record.Hhcdfrom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HHCDFROM"));
			record.Clcellcdfrom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLCELLCDFROM"));
			record.Pmintnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PMINTNUM"));
			record.Pmintdatin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PMINTDATIN"));
			record.Padcellreason = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PADCELLREASON"));
			record.Padcellvalidatdby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PADCELLVALIDATDBY"));
			record.Isolstartdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ISOLSTARTDAT"));
			record.Isolenddat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ISOLENDDAT"));
			record.Eestabnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EESTABNAM"));
			record.Halltotxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HALLTOTXT"));
			record.Hallfromtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HALLFROMTXT"));
			record.Cellfeatcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CELLFEATCD"));
			record.Clfeattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLFEATTXT"));
			record.Padcellreastxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PADCELLREASTXT"));
									
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
			PrislochistRecord record = new PrislochistRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pprisnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PPRISNUM"));
			record.Eestabcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EESTABCD"));
			record.Hhcdto = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HHCDTO"));
			record.Clcellcdto = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLCELLCDTO"));
			record.Hhcdfrom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HHCDFROM"));
			record.Clcellcdfrom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLCELLCDFROM"));
			record.Pmintnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PMINTNUM"));
			record.Pmintdatin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PMINTDATIN"));
			record.Padcellreason = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PADCELLREASON"));
			record.Padcellvalidatdby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PADCELLVALIDATDBY"));
			record.Isolstartdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ISOLSTARTDAT"));
			record.Isolenddat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ISOLENDDAT"));
			record.Eestabnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EESTABNAM"));
			record.Halltotxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HALLTOTXT"));
			record.Hallfromtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HALLFROMTXT"));
			record.Cellfeatcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CELLFEATCD"));
			record.Clfeattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLFEATTXT"));
			record.Padcellreastxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PADCELLREASTXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class PrislochistCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			PrislochistRecord newRecord = new PrislochistRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(PrislochistRecord record)
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
		public PrislochistRecord get(int index)
		{
			return (PrislochistRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class PrislochistRecord
	{
		public String Pprisnum = "";
		public String Eestabcd = "";
		public String Hhcdto = "";
		public String Clcellcdto = "";
		public String Hhcdfrom = "";
		public String Clcellcdfrom = "";
		public String Pmintnum = "";
		public String Pmintdatin = "";
		public String Padcellreason = "";
		public String Padcellvalidatdby = "";
		public String Isolstartdat = "";
		public String Isolenddat = "";
		public String Eestabnam = "";
		public String Halltotxt = "";
		public String Hallfromtxt = "";
		public String Cellfeatcd = "";
		public String Clfeattxt = "";
		public String Padcellreastxt = "";
				
		
		public void clear()
		{
			Pprisnum = "";
			Eestabcd = "";
			Hhcdto = "";
			Clcellcdto = "";
			Hhcdfrom = "";
			Clcellcdfrom = "";
			Pmintnum = "";
			Pmintdatin = "";
			Padcellreason = "";
			Padcellvalidatdby = "";
			Isolstartdat = "";
			Isolenddat = "";
			Eestabnam = "";
			Halltotxt = "";
			Hallfromtxt = "";
			Cellfeatcd = "";
			Clfeattxt = "";
			Padcellreastxt = "";
			
		}		
	}
		
		
	public final class PrislochistFilter
	{			
		public String Pprisnum = "";
		public String Eestabcd = "";
		public String Hhcdto = "";
		public String Clcellcdto = "";
		public String Hhcdfrom = "";
		public String Clcellcdfrom = "";
		public String Pmintnum = "";
		public String Pmintdatin = "";
		public String Padcellreason = "";
		public String Padcellvalidatdby = "";
		public String Isolstartdat = "";
		public String Isolenddat = "";
		public String Eestabnam = "";
		public String Halltotxt = "";
		public String Hallfromtxt = "";
		public String Cellfeatcd = "";
		public String Clfeattxt = "";
		public String Padcellreastxt = "";
		
		public void clear()
		{				
			Pprisnum = "";
			Eestabcd = "";
			Hhcdto = "";
			Clcellcdto = "";
			Hhcdfrom = "";
			Clcellcdfrom = "";
			Pmintnum = "";
			Pmintdatin = "";
			Padcellreason = "";
			Padcellvalidatdby = "";
			Isolstartdat = "";
			Isolenddat = "";
			Eestabnam = "";
			Halltotxt = "";
			Hallfromtxt = "";
			Cellfeatcd = "";
			Clfeattxt = "";
			Padcellreastxt = "";
		}	
		public PrislochistFilter cloneObject()
		{
			PrislochistFilter newFilter = new PrislochistFilter();
			
			newFilter.Pprisnum = this.Pprisnum;
			newFilter.Eestabcd = this.Eestabcd;
			newFilter.Hhcdto = this.Hhcdto;
			newFilter.Clcellcdto = this.Clcellcdto;
			newFilter.Hhcdfrom = this.Hhcdfrom;
			newFilter.Clcellcdfrom = this.Clcellcdfrom;
			newFilter.Pmintnum = this.Pmintnum;
			newFilter.Pmintdatin = this.Pmintdatin;
			newFilter.Padcellreason = this.Padcellreason;
			newFilter.Padcellvalidatdby = this.Padcellvalidatdby;
			newFilter.Isolstartdat = this.Isolstartdat;
			newFilter.Isolenddat = this.Isolenddat;
			newFilter.Eestabnam = this.Eestabnam;
			newFilter.Halltotxt = this.Halltotxt;
			newFilter.Hallfromtxt = this.Hallfromtxt;
			newFilter.Cellfeatcd = this.Cellfeatcd;
			newFilter.Clfeattxt = this.Clfeattxt;
			newFilter.Padcellreastxt = this.Padcellreastxt;
			
			return newFilter;
		}
	}
	public final class PrislochistEditFilter
	{			
		public boolean IncludePprisnum = true;
		public boolean IncludeEestabcd = true;
		public boolean IncludeHhcdto = true;
		public boolean IncludeClcellcdto = true;
		public boolean IncludeHhcdfrom = true;
		public boolean IncludeClcellcdfrom = true;
		public boolean IncludePmintnum = true;
		public boolean IncludePmintdatin = true;
		public boolean IncludePadcellreason = true;
		public boolean IncludePadcellvalidatdby = true;
		public boolean IncludeIsolstartdat = true;
		public boolean IncludeIsolenddat = true;
		public boolean IncludeEestabnam = true;
		public boolean IncludeHalltotxt = true;
		public boolean IncludeHallfromtxt = true;
		public boolean IncludeCellfeatcd = true;
		public boolean IncludeClfeattxt = true;
		public boolean IncludePadcellreastxt = true;
		
		public void includeAll()
		{				
			IncludePprisnum = true;
			IncludeEestabcd = true;
			IncludeHhcdto = true;
			IncludeClcellcdto = true;
			IncludeHhcdfrom = true;
			IncludeClcellcdfrom = true;
			IncludePmintnum = true;
			IncludePmintdatin = true;
			IncludePadcellreason = true;
			IncludePadcellvalidatdby = true;
			IncludeIsolstartdat = true;
			IncludeIsolenddat = true;
			IncludeEestabnam = true;
			IncludeHalltotxt = true;
			IncludeHallfromtxt = true;
			IncludeCellfeatcd = true;
			IncludeClfeattxt = true;
			IncludePadcellreastxt = true;
		}	
		public void excludeAll()
		{				
			IncludePprisnum = false;
			IncludeEestabcd = false;
			IncludeHhcdto = false;
			IncludeClcellcdto = false;
			IncludeHhcdfrom = false;
			IncludeClcellcdfrom = false;
			IncludePmintnum = false;
			IncludePmintdatin = false;
			IncludePadcellreason = false;
			IncludePadcellvalidatdby = false;
			IncludeIsolstartdat = false;
			IncludeIsolenddat = false;
			IncludeEestabnam = false;
			IncludeHalltotxt = false;
			IncludeHallfromtxt = false;
			IncludeCellfeatcd = false;
			IncludeClfeattxt = false;
			IncludePadcellreastxt = false;
		}
		public PrislochistEditFilter cloneObject()
		{
			PrislochistEditFilter newEditFilter = new PrislochistEditFilter();
			
			newEditFilter.IncludePprisnum = this.IncludePprisnum;
			newEditFilter.IncludeEestabcd = this.IncludeEestabcd;
			newEditFilter.IncludeHhcdto = this.IncludeHhcdto;
			newEditFilter.IncludeClcellcdto = this.IncludeClcellcdto;
			newEditFilter.IncludeHhcdfrom = this.IncludeHhcdfrom;
			newEditFilter.IncludeClcellcdfrom = this.IncludeClcellcdfrom;
			newEditFilter.IncludePmintnum = this.IncludePmintnum;
			newEditFilter.IncludePmintdatin = this.IncludePmintdatin;
			newEditFilter.IncludePadcellreason = this.IncludePadcellreason;
			newEditFilter.IncludePadcellvalidatdby = this.IncludePadcellvalidatdby;
			newEditFilter.IncludeIsolstartdat = this.IncludeIsolstartdat;
			newEditFilter.IncludeIsolenddat = this.IncludeIsolenddat;
			newEditFilter.IncludeEestabnam = this.IncludeEestabnam;
			newEditFilter.IncludeHalltotxt = this.IncludeHalltotxt;
			newEditFilter.IncludeHallfromtxt = this.IncludeHallfromtxt;
			newEditFilter.IncludeCellfeatcd = this.IncludeCellfeatcd;
			newEditFilter.IncludeClfeattxt = this.IncludeClfeattxt;
			newEditFilter.IncludePadcellreastxt = this.IncludePadcellreastxt;
			
			return newEditFilter;
		}
	}
}
