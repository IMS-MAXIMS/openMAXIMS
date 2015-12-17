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

public final class Famhist
{
	private FamhistFilter lastGetFilter = null;
	private final String serviceName = "FAMHIST";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public FamhistFilter Filter = new FamhistFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public FamhistEditFilter EditFilter = new FamhistEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public FamhistCollection DataCollection = new FamhistCollection();

	/**
	 * Creates a new Famhist Data Transfer Object.
	 */ 
	public Famhist(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Famhist cloneObject() throws ims.dto.Exception
	{
		Famhist cloneObject = new Famhist(Connection);
			
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
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Rhcp = DataCollection.get(x).Rhcp;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Uhcp = DataCollection.get(x).Uhcp;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Modu = DataCollection.get(x).Modu;
			cloneObject.DataCollection.get(index).Ccsepid = DataCollection.get(x).Ccsepid;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Name = DataCollection.get(x).Name;
			cloneObject.DataCollection.get(index).Famhosp = DataCollection.get(x).Famhosp;
			cloneObject.DataCollection.get(index).Relt = DataCollection.get(x).Relt;
			cloneObject.DataCollection.get(index).Relf = DataCollection.get(x).Relf;
			cloneObject.DataCollection.get(index).Live = DataCollection.get(x).Live;
			cloneObject.DataCollection.get(index).Age = DataCollection.get(x).Age;
			cloneObject.DataCollection.get(index).Ageons = DataCollection.get(x).Ageons;
			cloneObject.DataCollection.get(index).Crcod = DataCollection.get(x).Crcod;
			cloneObject.DataCollection.get(index).Ctrm = DataCollection.get(x).Ctrm;
			cloneObject.DataCollection.get(index).Clstr = DataCollection.get(x).Clstr;
			cloneObject.DataCollection.get(index).Ctxt = DataCollection.get(x).Ctxt;
			cloneObject.DataCollection.get(index).Ccod2 = DataCollection.get(x).Ccod2;
			cloneObject.DataCollection.get(index).Ctrm2 = DataCollection.get(x).Ctrm2;
			cloneObject.DataCollection.get(index).Ccstr2 = DataCollection.get(x).Ccstr2;
			cloneObject.DataCollection.get(index).Ctxt2 = DataCollection.get(x).Ctxt2;
			cloneObject.DataCollection.get(index).Agtd = DataCollection.get(x).Agtd;
			cloneObject.DataCollection.get(index).Dcod = DataCollection.get(x).Dcod;
			cloneObject.DataCollection.get(index).Dtrm = DataCollection.get(x).Dtrm;
			cloneObject.DataCollection.get(index).Dclust = DataCollection.get(x).Dclust;
			cloneObject.DataCollection.get(index).Dtxt = DataCollection.get(x).Dtxt;
			cloneObject.DataCollection.get(index).Dcod2 = DataCollection.get(x).Dcod2;
			cloneObject.DataCollection.get(index).Dtrm2 = DataCollection.get(x).Dtrm2;
			cloneObject.DataCollection.get(index).Dclust2 = DataCollection.get(x).Dclust2;
			cloneObject.DataCollection.get(index).Dtxt2 = DataCollection.get(x).Dtxt2;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).Notes = DataCollection.get(x).Notes;
			cloneObject.DataCollection.get(index).Rhcptxt = DataCollection.get(x).Rhcptxt;
			cloneObject.DataCollection.get(index).Rusrtxt = DataCollection.get(x).Rusrtxt;
			cloneObject.DataCollection.get(index).Uhcptxt = DataCollection.get(x).Uhcptxt;
			cloneObject.DataCollection.get(index).Uusrtxt = DataCollection.get(x).Uusrtxt;
			cloneObject.DataCollection.get(index).Modutxt = DataCollection.get(x).Modutxt;
			cloneObject.DataCollection.get(index).Relttxt = DataCollection.get(x).Relttxt;
			cloneObject.DataCollection.get(index).Relftxt = DataCollection.get(x).Relftxt;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "8";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Famhist.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Famhist.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Famhist.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Famhist.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Famhist.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Famhist.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Famhist.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Famhist.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Famhist.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Famhist.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Famhist.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Famhist.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Famhist.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Famhist.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Famhist.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Famhist.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Famhist.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Famhist.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Famhist.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Famhist.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Famhist.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Famhist.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Famhist.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Famhist.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Famhist.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Famhist.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Famhist.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Famhist.List");
							
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
	private String encodeNASFilter(FamhistFilter filter)
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
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey;
		}
		
		if(Filter.Cdat != null && filter.Cdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cdat;
		}
		
		if(Filter.Ctim != null && filter.Ctim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ctim;
		}
		
		if(Filter.Rhcp != null && filter.Rhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rhcp;
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
		
		if(Filter.Rtim != null && filter.Rtim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rtim;
		}
		
		if(Filter.Udat != null && filter.Udat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Udat;
		}
		
		if(Filter.Utim != null && filter.Utim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Utim;
		}
		
		if(Filter.Uhcp != null && filter.Uhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uhcp;
		}
		
		if(Filter.Uusr != null && filter.Uusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uusr;
		}
		
		if(Filter.Modu != null && filter.Modu.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modu;
		}
		
		if(Filter.Ccsepid != null && filter.Ccsepid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CCSEPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccsepid;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Name != null && filter.Name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Name;
		}
		
		if(Filter.Famhosp != null && filter.Famhosp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FAMHOSP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Famhosp;
		}
		
		if(Filter.Relt != null && filter.Relt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RELT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Relt;
		}
		
		if(Filter.Relf != null && filter.Relf.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RELF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Relf;
		}
		
		if(Filter.Live != null && filter.Live.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Live;
		}
		
		if(Filter.Age != null && filter.Age.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Age;
		}
		
		if(Filter.Ageons != null && filter.Ageons.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AGEONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ageons;
		}
		
		if(Filter.Crcod != null && filter.Crcod.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CRCOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Crcod;
		}
		
		if(Filter.Ctrm != null && filter.Ctrm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CTRM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ctrm;
		}
		
		if(Filter.Clstr != null && filter.Clstr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLSTR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clstr;
		}
		
		if(Filter.Ctxt != null && filter.Ctxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ctxt;
		}
		
		if(Filter.Ccod2 != null && filter.Ccod2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CCOD2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccod2;
		}
		
		if(Filter.Ctrm2 != null && filter.Ctrm2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CTRM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ctrm2;
		}
		
		if(Filter.Ccstr2 != null && filter.Ccstr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CCSTR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccstr2;
		}
		
		if(Filter.Ctxt2 != null && filter.Ctxt2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CTXT2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ctxt2;
		}
		
		if(Filter.Agtd != null && filter.Agtd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AGTD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Agtd;
		}
		
		if(Filter.Dcod != null && filter.Dcod.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DCOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dcod;
		}
		
		if(Filter.Dtrm != null && filter.Dtrm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DTRM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dtrm;
		}
		
		if(Filter.Dclust != null && filter.Dclust.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DCLUST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dclust;
		}
		
		if(Filter.Dtxt != null && filter.Dtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dtxt;
		}
		
		if(Filter.Dcod2 != null && filter.Dcod2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DCOD2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dcod2;
		}
		
		if(Filter.Dtrm2 != null && filter.Dtrm2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DTRM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dtrm2;
		}
		
		if(Filter.Dclust2 != null && filter.Dclust2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DCLUST2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dclust2;
		}
		
		if(Filter.Dtxt2 != null && filter.Dtxt2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DTXT2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dtxt2;
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat;
		}
		
		if(Filter.Notes != null && filter.Notes.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NOTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Notes;
		}
		
		if(Filter.Rhcptxt != null && filter.Rhcptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rhcptxt;
		}
		
		if(Filter.Rusrtxt != null && filter.Rusrtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusrtxt;
		}
		
		if(Filter.Uhcptxt != null && filter.Uhcptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uhcptxt;
		}
		
		if(Filter.Uusrtxt != null && filter.Uusrtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uusrtxt;
		}
		
		if(Filter.Modutxt != null && filter.Modutxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MODUTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modutxt;
		}
		
		if(Filter.Relttxt != null && filter.Relttxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RELTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Relttxt;
		}
		
		if(Filter.Relftxt != null && filter.Relftxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RELFTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Relftxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		FamhistRecord data = (FamhistRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeUnid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unid);
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
		}
		
		if(EditFilter.IncludeCdat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cdat);
		}
		
		if(EditFilter.IncludeCtim)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ctim);
		}
		
		if(EditFilter.IncludeRhcp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rhcp);
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
		
		if(EditFilter.IncludeRtim)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rtim);
		}
		
		if(EditFilter.IncludeUdat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Udat);
		}
		
		if(EditFilter.IncludeUtim)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Utim);
		}
		
		if(EditFilter.IncludeUhcp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uhcp);
		}
		
		if(EditFilter.IncludeUusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uusr);
		}
		
		if(EditFilter.IncludeModu)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modu);
		}
		
		if(EditFilter.IncludeCcsepid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CCSEPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccsepid);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeName)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Name);
		}
		
		if(EditFilter.IncludeFamhosp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "FAMHOSP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Famhosp);
		}
		
		if(EditFilter.IncludeRelt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RELT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Relt);
		}
		
		if(EditFilter.IncludeRelf)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RELF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Relf);
		}
		
		if(EditFilter.IncludeLive)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Live);
		}
		
		if(EditFilter.IncludeAge)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Age);
		}
		
		if(EditFilter.IncludeAgeons)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AGEONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ageons);
		}
		
		if(EditFilter.IncludeCrcod)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CRCOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Crcod);
		}
		
		if(EditFilter.IncludeCtrm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CTRM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ctrm);
		}
		
		if(EditFilter.IncludeClstr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLSTR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clstr);
		}
		
		if(EditFilter.IncludeCtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ctxt);
		}
		
		if(EditFilter.IncludeCcod2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CCOD2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccod2);
		}
		
		if(EditFilter.IncludeCtrm2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CTRM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ctrm2);
		}
		
		if(EditFilter.IncludeCcstr2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CCSTR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccstr2);
		}
		
		if(EditFilter.IncludeCtxt2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CTXT2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ctxt2);
		}
		
		if(EditFilter.IncludeAgtd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AGTD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Agtd);
		}
		
		if(EditFilter.IncludeDcod)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DCOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dcod);
		}
		
		if(EditFilter.IncludeDtrm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DTRM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dtrm);
		}
		
		if(EditFilter.IncludeDclust)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DCLUST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dclust);
		}
		
		if(EditFilter.IncludeDtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dtxt);
		}
		
		if(EditFilter.IncludeDcod2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DCOD2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dcod2);
		}
		
		if(EditFilter.IncludeDtrm2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DTRM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dtrm2);
		}
		
		if(EditFilter.IncludeDclust2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DCLUST2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dclust2);
		}
		
		if(EditFilter.IncludeDtxt2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DTXT2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dtxt2);
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat);
		}
		
		if(EditFilter.IncludeNotes)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NOTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Notes);
		}
		
		if(EditFilter.IncludeRhcptxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rhcptxt);
		}
		
		if(EditFilter.IncludeRusrtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusrtxt);
		}
		
		if(EditFilter.IncludeUhcptxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uhcptxt);
		}
		
		if(EditFilter.IncludeUusrtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uusrtxt);
		}
		
		if(EditFilter.IncludeModutxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MODUTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modutxt);
		}
		
		if(EditFilter.IncludeRelttxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RELTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Relttxt);
		}
		
		if(EditFilter.IncludeRelftxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RELFTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Relftxt);
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
			FamhistRecord record = new FamhistRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ccsepid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCSEPID"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Famhosp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FAMHOSP"));
			record.Relt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELT"));
			record.Relf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELF"));
			record.Live = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LIVE"));
			record.Age = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AGE"));
			record.Ageons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AGEONS"));
			record.Crcod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CRCOD"));
			record.Ctrm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTRM"));
			record.Clstr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLSTR"));
			record.Ctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTXT"));
			record.Ccod2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCOD2"));
			record.Ctrm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTRM2"));
			record.Ccstr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCSTR2"));
			record.Ctxt2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTXT2"));
			record.Agtd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AGTD"));
			record.Dcod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DCOD"));
			record.Dtrm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTRM"));
			record.Dclust = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DCLUST"));
			record.Dtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTXT"));
			record.Dcod2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DCOD2"));
			record.Dtrm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTRM2"));
			record.Dclust2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DCLUST2"));
			record.Dtxt2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTXT2"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Notes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOTES"));
			record.Rhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCPTXT"));
			record.Rusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSRTXT"));
			record.Uhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCPTXT"));
			record.Uusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSRTXT"));
			record.Modutxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODUTXT"));
			record.Relttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELTTXT"));
			record.Relftxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELFTXT"));
									
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
			FamhistRecord record = new FamhistRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ccsepid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCSEPID"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Famhosp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FAMHOSP"));
			record.Relt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELT"));
			record.Relf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELF"));
			record.Live = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LIVE"));
			record.Age = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AGE"));
			record.Ageons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AGEONS"));
			record.Crcod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CRCOD"));
			record.Ctrm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTRM"));
			record.Clstr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLSTR"));
			record.Ctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTXT"));
			record.Ccod2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCOD2"));
			record.Ctrm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTRM2"));
			record.Ccstr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCSTR2"));
			record.Ctxt2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTXT2"));
			record.Agtd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AGTD"));
			record.Dcod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DCOD"));
			record.Dtrm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTRM"));
			record.Dclust = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DCLUST"));
			record.Dtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTXT"));
			record.Dcod2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DCOD2"));
			record.Dtrm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTRM2"));
			record.Dclust2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DCLUST2"));
			record.Dtxt2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTXT2"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Notes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOTES"));
			record.Rhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCPTXT"));
			record.Rusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSRTXT"));
			record.Uhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCPTXT"));
			record.Uusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSRTXT"));
			record.Modutxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODUTXT"));
			record.Relttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELTTXT"));
			record.Relftxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELFTXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class FamhistCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			FamhistRecord newRecord = new FamhistRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(FamhistRecord record)
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
		public FamhistRecord get(int index)
		{
			return (FamhistRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class FamhistRecord
	{
		public String Unid = "";
		public String Pkey = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Modu = "";
		public String Ccsepid = "";
		public String Tstp = "";
		public String Name = "";
		public String Famhosp = "";
		public String Relt = "";
		public String Relf = "";
		public String Live = "";
		public String Age = "";
		public String Ageons = "";
		public String Crcod = "";
		public String Ctrm = "";
		public String Clstr = "";
		public String Ctxt = "";
		public String Ccod2 = "";
		public String Ctrm2 = "";
		public String Ccstr2 = "";
		public String Ctxt2 = "";
		public String Agtd = "";
		public String Dcod = "";
		public String Dtrm = "";
		public String Dclust = "";
		public String Dtxt = "";
		public String Dcod2 = "";
		public String Dtrm2 = "";
		public String Dclust2 = "";
		public String Dtxt2 = "";
		public String Stat = "";
		public String Notes = "";
		public String Rhcptxt = "";
		public String Rusrtxt = "";
		public String Uhcptxt = "";
		public String Uusrtxt = "";
		public String Modutxt = "";
		public String Relttxt = "";
		public String Relftxt = "";
				
		
		public void clear()
		{
			Unid = "";
			Pkey = "";
			Cdat = "";
			Ctim = "";
			Rhcp = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Uusr = "";
			Modu = "";
			Ccsepid = "";
			Tstp = "";
			Name = "";
			Famhosp = "";
			Relt = "";
			Relf = "";
			Live = "";
			Age = "";
			Ageons = "";
			Crcod = "";
			Ctrm = "";
			Clstr = "";
			Ctxt = "";
			Ccod2 = "";
			Ctrm2 = "";
			Ccstr2 = "";
			Ctxt2 = "";
			Agtd = "";
			Dcod = "";
			Dtrm = "";
			Dclust = "";
			Dtxt = "";
			Dcod2 = "";
			Dtrm2 = "";
			Dclust2 = "";
			Dtxt2 = "";
			Stat = "";
			Notes = "";
			Rhcptxt = "";
			Rusrtxt = "";
			Uhcptxt = "";
			Uusrtxt = "";
			Modutxt = "";
			Relttxt = "";
			Relftxt = "";
			
		}		
	}
		
		
	public final class FamhistFilter
	{			
		public String Unid = "";
		public String Pkey = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Modu = "";
		public String Ccsepid = "";
		public String Tstp = "";
		public String Name = "";
		public String Famhosp = "";
		public String Relt = "";
		public String Relf = "";
		public String Live = "";
		public String Age = "";
		public String Ageons = "";
		public String Crcod = "";
		public String Ctrm = "";
		public String Clstr = "";
		public String Ctxt = "";
		public String Ccod2 = "";
		public String Ctrm2 = "";
		public String Ccstr2 = "";
		public String Ctxt2 = "";
		public String Agtd = "";
		public String Dcod = "";
		public String Dtrm = "";
		public String Dclust = "";
		public String Dtxt = "";
		public String Dcod2 = "";
		public String Dtrm2 = "";
		public String Dclust2 = "";
		public String Dtxt2 = "";
		public String Stat = "";
		public String Notes = "";
		public String Rhcptxt = "";
		public String Rusrtxt = "";
		public String Uhcptxt = "";
		public String Uusrtxt = "";
		public String Modutxt = "";
		public String Relttxt = "";
		public String Relftxt = "";
		
		public void clear()
		{				
			Unid = "";
			Pkey = "";
			Cdat = "";
			Ctim = "";
			Rhcp = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Uusr = "";
			Modu = "";
			Ccsepid = "";
			Tstp = "";
			Name = "";
			Famhosp = "";
			Relt = "";
			Relf = "";
			Live = "";
			Age = "";
			Ageons = "";
			Crcod = "";
			Ctrm = "";
			Clstr = "";
			Ctxt = "";
			Ccod2 = "";
			Ctrm2 = "";
			Ccstr2 = "";
			Ctxt2 = "";
			Agtd = "";
			Dcod = "";
			Dtrm = "";
			Dclust = "";
			Dtxt = "";
			Dcod2 = "";
			Dtrm2 = "";
			Dclust2 = "";
			Dtxt2 = "";
			Stat = "";
			Notes = "";
			Rhcptxt = "";
			Rusrtxt = "";
			Uhcptxt = "";
			Uusrtxt = "";
			Modutxt = "";
			Relttxt = "";
			Relftxt = "";
		}	
		public FamhistFilter cloneObject()
		{
			FamhistFilter newFilter = new FamhistFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Pkey = this.Pkey;
			newFilter.Cdat = this.Cdat;
			newFilter.Ctim = this.Ctim;
			newFilter.Rhcp = this.Rhcp;
			newFilter.Rusr = this.Rusr;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Uhcp = this.Uhcp;
			newFilter.Uusr = this.Uusr;
			newFilter.Modu = this.Modu;
			newFilter.Ccsepid = this.Ccsepid;
			newFilter.Tstp = this.Tstp;
			newFilter.Name = this.Name;
			newFilter.Famhosp = this.Famhosp;
			newFilter.Relt = this.Relt;
			newFilter.Relf = this.Relf;
			newFilter.Live = this.Live;
			newFilter.Age = this.Age;
			newFilter.Ageons = this.Ageons;
			newFilter.Crcod = this.Crcod;
			newFilter.Ctrm = this.Ctrm;
			newFilter.Clstr = this.Clstr;
			newFilter.Ctxt = this.Ctxt;
			newFilter.Ccod2 = this.Ccod2;
			newFilter.Ctrm2 = this.Ctrm2;
			newFilter.Ccstr2 = this.Ccstr2;
			newFilter.Ctxt2 = this.Ctxt2;
			newFilter.Agtd = this.Agtd;
			newFilter.Dcod = this.Dcod;
			newFilter.Dtrm = this.Dtrm;
			newFilter.Dclust = this.Dclust;
			newFilter.Dtxt = this.Dtxt;
			newFilter.Dcod2 = this.Dcod2;
			newFilter.Dtrm2 = this.Dtrm2;
			newFilter.Dclust2 = this.Dclust2;
			newFilter.Dtxt2 = this.Dtxt2;
			newFilter.Stat = this.Stat;
			newFilter.Notes = this.Notes;
			newFilter.Rhcptxt = this.Rhcptxt;
			newFilter.Rusrtxt = this.Rusrtxt;
			newFilter.Uhcptxt = this.Uhcptxt;
			newFilter.Uusrtxt = this.Uusrtxt;
			newFilter.Modutxt = this.Modutxt;
			newFilter.Relttxt = this.Relttxt;
			newFilter.Relftxt = this.Relftxt;
			
			return newFilter;
		}
	}
	public final class FamhistEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludePkey = true;
		public boolean IncludeCdat = true;
		public boolean IncludeCtim = true;
		public boolean IncludeRhcp = true;
		public boolean IncludeRusr = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeUhcp = true;
		public boolean IncludeUusr = true;
		public boolean IncludeModu = true;
		public boolean IncludeCcsepid = true;
		public boolean IncludeTstp = true;
		public boolean IncludeName = true;
		public boolean IncludeFamhosp = true;
		public boolean IncludeRelt = true;
		public boolean IncludeRelf = true;
		public boolean IncludeLive = true;
		public boolean IncludeAge = true;
		public boolean IncludeAgeons = true;
		public boolean IncludeCrcod = true;
		public boolean IncludeCtrm = true;
		public boolean IncludeClstr = true;
		public boolean IncludeCtxt = true;
		public boolean IncludeCcod2 = true;
		public boolean IncludeCtrm2 = true;
		public boolean IncludeCcstr2 = true;
		public boolean IncludeCtxt2 = true;
		public boolean IncludeAgtd = true;
		public boolean IncludeDcod = true;
		public boolean IncludeDtrm = true;
		public boolean IncludeDclust = true;
		public boolean IncludeDtxt = true;
		public boolean IncludeDcod2 = true;
		public boolean IncludeDtrm2 = true;
		public boolean IncludeDclust2 = true;
		public boolean IncludeDtxt2 = true;
		public boolean IncludeStat = true;
		public boolean IncludeNotes = true;
		public boolean IncludeRhcptxt = true;
		public boolean IncludeRusrtxt = true;
		public boolean IncludeUhcptxt = true;
		public boolean IncludeUusrtxt = true;
		public boolean IncludeModutxt = true;
		public boolean IncludeRelttxt = true;
		public boolean IncludeRelftxt = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludePkey = true;
			IncludeCdat = true;
			IncludeCtim = true;
			IncludeRhcp = true;
			IncludeRusr = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeUhcp = true;
			IncludeUusr = true;
			IncludeModu = true;
			IncludeCcsepid = true;
			IncludeTstp = true;
			IncludeName = true;
			IncludeFamhosp = true;
			IncludeRelt = true;
			IncludeRelf = true;
			IncludeLive = true;
			IncludeAge = true;
			IncludeAgeons = true;
			IncludeCrcod = true;
			IncludeCtrm = true;
			IncludeClstr = true;
			IncludeCtxt = true;
			IncludeCcod2 = true;
			IncludeCtrm2 = true;
			IncludeCcstr2 = true;
			IncludeCtxt2 = true;
			IncludeAgtd = true;
			IncludeDcod = true;
			IncludeDtrm = true;
			IncludeDclust = true;
			IncludeDtxt = true;
			IncludeDcod2 = true;
			IncludeDtrm2 = true;
			IncludeDclust2 = true;
			IncludeDtxt2 = true;
			IncludeStat = true;
			IncludeNotes = true;
			IncludeRhcptxt = true;
			IncludeRusrtxt = true;
			IncludeUhcptxt = true;
			IncludeUusrtxt = true;
			IncludeModutxt = true;
			IncludeRelttxt = true;
			IncludeRelftxt = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludePkey = false;
			IncludeCdat = false;
			IncludeCtim = false;
			IncludeRhcp = false;
			IncludeRusr = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeUhcp = false;
			IncludeUusr = false;
			IncludeModu = false;
			IncludeCcsepid = false;
			IncludeTstp = false;
			IncludeName = false;
			IncludeFamhosp = false;
			IncludeRelt = false;
			IncludeRelf = false;
			IncludeLive = false;
			IncludeAge = false;
			IncludeAgeons = false;
			IncludeCrcod = false;
			IncludeCtrm = false;
			IncludeClstr = false;
			IncludeCtxt = false;
			IncludeCcod2 = false;
			IncludeCtrm2 = false;
			IncludeCcstr2 = false;
			IncludeCtxt2 = false;
			IncludeAgtd = false;
			IncludeDcod = false;
			IncludeDtrm = false;
			IncludeDclust = false;
			IncludeDtxt = false;
			IncludeDcod2 = false;
			IncludeDtrm2 = false;
			IncludeDclust2 = false;
			IncludeDtxt2 = false;
			IncludeStat = false;
			IncludeNotes = false;
			IncludeRhcptxt = false;
			IncludeRusrtxt = false;
			IncludeUhcptxt = false;
			IncludeUusrtxt = false;
			IncludeModutxt = false;
			IncludeRelttxt = false;
			IncludeRelftxt = false;
		}
		public FamhistEditFilter cloneObject()
		{
			FamhistEditFilter newEditFilter = new FamhistEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeRhcp = this.IncludeRhcp;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeUhcp = this.IncludeUhcp;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeModu = this.IncludeModu;
			newEditFilter.IncludeCcsepid = this.IncludeCcsepid;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeName = this.IncludeName;
			newEditFilter.IncludeFamhosp = this.IncludeFamhosp;
			newEditFilter.IncludeRelt = this.IncludeRelt;
			newEditFilter.IncludeRelf = this.IncludeRelf;
			newEditFilter.IncludeLive = this.IncludeLive;
			newEditFilter.IncludeAge = this.IncludeAge;
			newEditFilter.IncludeAgeons = this.IncludeAgeons;
			newEditFilter.IncludeCrcod = this.IncludeCrcod;
			newEditFilter.IncludeCtrm = this.IncludeCtrm;
			newEditFilter.IncludeClstr = this.IncludeClstr;
			newEditFilter.IncludeCtxt = this.IncludeCtxt;
			newEditFilter.IncludeCcod2 = this.IncludeCcod2;
			newEditFilter.IncludeCtrm2 = this.IncludeCtrm2;
			newEditFilter.IncludeCcstr2 = this.IncludeCcstr2;
			newEditFilter.IncludeCtxt2 = this.IncludeCtxt2;
			newEditFilter.IncludeAgtd = this.IncludeAgtd;
			newEditFilter.IncludeDcod = this.IncludeDcod;
			newEditFilter.IncludeDtrm = this.IncludeDtrm;
			newEditFilter.IncludeDclust = this.IncludeDclust;
			newEditFilter.IncludeDtxt = this.IncludeDtxt;
			newEditFilter.IncludeDcod2 = this.IncludeDcod2;
			newEditFilter.IncludeDtrm2 = this.IncludeDtrm2;
			newEditFilter.IncludeDclust2 = this.IncludeDclust2;
			newEditFilter.IncludeDtxt2 = this.IncludeDtxt2;
			newEditFilter.IncludeStat = this.IncludeStat;
			newEditFilter.IncludeNotes = this.IncludeNotes;
			newEditFilter.IncludeRhcptxt = this.IncludeRhcptxt;
			newEditFilter.IncludeRusrtxt = this.IncludeRusrtxt;
			newEditFilter.IncludeUhcptxt = this.IncludeUhcptxt;
			newEditFilter.IncludeUusrtxt = this.IncludeUusrtxt;
			newEditFilter.IncludeModutxt = this.IncludeModutxt;
			newEditFilter.IncludeRelttxt = this.IncludeRelttxt;
			newEditFilter.IncludeRelftxt = this.IncludeRelftxt;
			
			return newEditFilter;
		}
	}
}
