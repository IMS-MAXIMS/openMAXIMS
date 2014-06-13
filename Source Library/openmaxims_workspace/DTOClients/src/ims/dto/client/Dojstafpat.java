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

public final class Dojstafpat
{
	private DojstafpatFilter lastGetFilter = null;
	private final String serviceName = "DOJSTAFPAT";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public DojstafpatFilter Filter = new DojstafpatFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public DojstafpatEditFilter EditFilter = new DojstafpatEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public DojstafpatCollection DataCollection = new DojstafpatCollection();

	/**
	 * Creates a new Dojstafpat Data Transfer Object.
	 */ 
	public Dojstafpat(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Dojstafpat cloneObject() throws ims.dto.Exception
	{
		Dojstafpat cloneObject = new Dojstafpat(Connection);
			
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
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Accessid = DataCollection.get(x).Accessid;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Hcp_id = DataCollection.get(x).Hcp_id;
			cloneObject.DataCollection.get(index).Startd = DataCollection.get(x).Startd;
			cloneObject.DataCollection.get(index).Endd = DataCollection.get(x).Endd;
			cloneObject.DataCollection.get(index).Hcprole = DataCollection.get(x).Hcprole;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Hcp_nm = DataCollection.get(x).Hcp_nm;
			cloneObject.DataCollection.get(index).Hcp_prof = DataCollection.get(x).Hcp_prof;
			cloneObject.DataCollection.get(index).Hcp_adr1 = DataCollection.get(x).Hcp_adr1;
			cloneObject.DataCollection.get(index).Hcp_adr2 = DataCollection.get(x).Hcp_adr2;
			cloneObject.DataCollection.get(index).Hcp_adr3 = DataCollection.get(x).Hcp_adr3;
			cloneObject.DataCollection.get(index).Hcp_adr4 = DataCollection.get(x).Hcp_adr4;
			cloneObject.DataCollection.get(index).Hcp_pc = DataCollection.get(x).Hcp_pc;
			cloneObject.DataCollection.get(index).Hcp_phone = DataCollection.get(x).Hcp_phone;
			cloneObject.DataCollection.get(index).Hcprolet = DataCollection.get(x).Hcprolet;
			cloneObject.DataCollection.get(index).Hcp_proft = DataCollection.get(x).Hcp_proft;
							
			
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
		return "Dojstafpat.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojstafpat.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Dojstafpat.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojstafpat.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojstafpat.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojstafpat.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Dojstafpat.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Dojstafpat.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojstafpat.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Dojstafpat.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Dojstafpat.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Dojstafpat.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Dojstafpat.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojstafpat.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojstafpat.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Dojstafpat.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Dojstafpat.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Dojstafpat.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Dojstafpat.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojstafpat.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojstafpat.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Dojstafpat.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Dojstafpat.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojstafpat.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Dojstafpat.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Dojstafpat.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Dojstafpat.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojstafpat.List");
							
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
	private String encodeNASFilter(DojstafpatFilter filter)
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
		
		if(Filter.Uusr != null && filter.Uusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uusr;
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
		
		if(Filter.Accessid != null && filter.Accessid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACCESSID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Accessid;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Hcp_id != null && filter.Hcp_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_id;
		}
		
		if(Filter.Startd != null && filter.Startd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STARTD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Startd;
		}
		
		if(Filter.Endd != null && filter.Endd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ENDD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Endd;
		}
		
		if(Filter.Hcprole != null && filter.Hcprole.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPROLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcprole;
		}
		
		if(Filter.Active != null && filter.Active.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Active;
		}
		
		if(Filter.Hcp_nm != null && filter.Hcp_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCP_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_nm;
		}
		
		if(Filter.Hcp_prof != null && filter.Hcp_prof.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCP_PROF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_prof;
		}
		
		if(Filter.Hcp_adr1 != null && filter.Hcp_adr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCP_ADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_adr1;
		}
		
		if(Filter.Hcp_adr2 != null && filter.Hcp_adr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCP_ADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_adr2;
		}
		
		if(Filter.Hcp_adr3 != null && filter.Hcp_adr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCP_ADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_adr3;
		}
		
		if(Filter.Hcp_adr4 != null && filter.Hcp_adr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCP_ADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_adr4;
		}
		
		if(Filter.Hcp_pc != null && filter.Hcp_pc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCP_PC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_pc;
		}
		
		if(Filter.Hcp_phone != null && filter.Hcp_phone.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCP_PHONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_phone;
		}
		
		if(Filter.Hcprolet != null && filter.Hcprolet.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPROLET" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcprolet;
		}
		
		if(Filter.Hcp_proft != null && filter.Hcp_proft.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCP_PROFT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_proft;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		DojstafpatRecord data = (DojstafpatRecord)DataCollection.get(0);
		
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
		
		if(EditFilter.IncludeUusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uusr);
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
		
		if(EditFilter.IncludeAccessid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACCESSID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Accessid);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeHcp_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_id);
		}
		
		if(EditFilter.IncludeStartd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STARTD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Startd);
		}
		
		if(EditFilter.IncludeEndd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ENDD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Endd);
		}
		
		if(EditFilter.IncludeHcprole)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPROLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcprole);
		}
		
		if(EditFilter.IncludeActive)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Active);
		}
		
		if(EditFilter.IncludeHcp_nm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCP_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_nm);
		}
		
		if(EditFilter.IncludeHcp_prof)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCP_PROF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_prof);
		}
		
		if(EditFilter.IncludeHcp_adr1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCP_ADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_adr1);
		}
		
		if(EditFilter.IncludeHcp_adr2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCP_ADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_adr2);
		}
		
		if(EditFilter.IncludeHcp_adr3)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCP_ADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_adr3);
		}
		
		if(EditFilter.IncludeHcp_adr4)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCP_ADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_adr4);
		}
		
		if(EditFilter.IncludeHcp_pc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCP_PC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_pc);
		}
		
		if(EditFilter.IncludeHcp_phone)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCP_PHONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_phone);
		}
		
		if(EditFilter.IncludeHcprolet)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPROLET" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcprolet);
		}
		
		if(EditFilter.IncludeHcp_proft)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCP_PROFT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_proft);
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
			DojstafpatRecord record = new DojstafpatRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Accessid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACCESSID"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Hcp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_ID"));
			record.Startd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STARTD"));
			record.Endd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENDD"));
			record.Hcprole = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPROLE"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Hcp_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_NM"));
			record.Hcp_prof = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_PROF"));
			record.Hcp_adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_ADR1"));
			record.Hcp_adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_ADR2"));
			record.Hcp_adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_ADR3"));
			record.Hcp_adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_ADR4"));
			record.Hcp_pc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_PC"));
			record.Hcp_phone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_PHONE"));
			record.Hcprolet = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPROLET"));
			record.Hcp_proft = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_PROFT"));
									
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
			DojstafpatRecord record = new DojstafpatRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Accessid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACCESSID"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Hcp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_ID"));
			record.Startd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STARTD"));
			record.Endd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENDD"));
			record.Hcprole = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPROLE"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Hcp_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_NM"));
			record.Hcp_prof = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_PROF"));
			record.Hcp_adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_ADR1"));
			record.Hcp_adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_ADR2"));
			record.Hcp_adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_ADR3"));
			record.Hcp_adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_ADR4"));
			record.Hcp_pc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_PC"));
			record.Hcp_phone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_PHONE"));
			record.Hcprolet = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPROLET"));
			record.Hcp_proft = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_PROFT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class DojstafpatCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DojstafpatRecord newRecord = new DojstafpatRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DojstafpatRecord record)
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
		public DojstafpatRecord get(int index)
		{
			return (DojstafpatRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class DojstafpatRecord
	{
		public String Unid = "";
		public String Pkey = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Uusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Accessid = "";
		public String Tstp = "";
		public String Hcp_id = "";
		public String Startd = "";
		public String Endd = "";
		public String Hcprole = "";
		public String Active = "";
		public String Hcp_nm = "";
		public String Hcp_prof = "";
		public String Hcp_adr1 = "";
		public String Hcp_adr2 = "";
		public String Hcp_adr3 = "";
		public String Hcp_adr4 = "";
		public String Hcp_pc = "";
		public String Hcp_phone = "";
		public String Hcprolet = "";
		public String Hcp_proft = "";
				
		
		public void clear()
		{
			Unid = "";
			Pkey = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Uusr = "";
			Udat = "";
			Utim = "";
			Accessid = "";
			Tstp = "";
			Hcp_id = "";
			Startd = "";
			Endd = "";
			Hcprole = "";
			Active = "";
			Hcp_nm = "";
			Hcp_prof = "";
			Hcp_adr1 = "";
			Hcp_adr2 = "";
			Hcp_adr3 = "";
			Hcp_adr4 = "";
			Hcp_pc = "";
			Hcp_phone = "";
			Hcprolet = "";
			Hcp_proft = "";
			
		}		
	}
		
		
	public final class DojstafpatFilter
	{			
		public String Unid = "";
		public String Pkey = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Uusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Accessid = "";
		public String Tstp = "";
		public String Hcp_id = "";
		public String Startd = "";
		public String Endd = "";
		public String Hcprole = "";
		public String Active = "";
		public String Hcp_nm = "";
		public String Hcp_prof = "";
		public String Hcp_adr1 = "";
		public String Hcp_adr2 = "";
		public String Hcp_adr3 = "";
		public String Hcp_adr4 = "";
		public String Hcp_pc = "";
		public String Hcp_phone = "";
		public String Hcprolet = "";
		public String Hcp_proft = "";
		
		public void clear()
		{				
			Unid = "";
			Pkey = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Uusr = "";
			Udat = "";
			Utim = "";
			Accessid = "";
			Tstp = "";
			Hcp_id = "";
			Startd = "";
			Endd = "";
			Hcprole = "";
			Active = "";
			Hcp_nm = "";
			Hcp_prof = "";
			Hcp_adr1 = "";
			Hcp_adr2 = "";
			Hcp_adr3 = "";
			Hcp_adr4 = "";
			Hcp_pc = "";
			Hcp_phone = "";
			Hcprolet = "";
			Hcp_proft = "";
		}	
		public DojstafpatFilter cloneObject()
		{
			DojstafpatFilter newFilter = new DojstafpatFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Pkey = this.Pkey;
			newFilter.Rusr = this.Rusr;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Uusr = this.Uusr;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Accessid = this.Accessid;
			newFilter.Tstp = this.Tstp;
			newFilter.Hcp_id = this.Hcp_id;
			newFilter.Startd = this.Startd;
			newFilter.Endd = this.Endd;
			newFilter.Hcprole = this.Hcprole;
			newFilter.Active = this.Active;
			newFilter.Hcp_nm = this.Hcp_nm;
			newFilter.Hcp_prof = this.Hcp_prof;
			newFilter.Hcp_adr1 = this.Hcp_adr1;
			newFilter.Hcp_adr2 = this.Hcp_adr2;
			newFilter.Hcp_adr3 = this.Hcp_adr3;
			newFilter.Hcp_adr4 = this.Hcp_adr4;
			newFilter.Hcp_pc = this.Hcp_pc;
			newFilter.Hcp_phone = this.Hcp_phone;
			newFilter.Hcprolet = this.Hcprolet;
			newFilter.Hcp_proft = this.Hcp_proft;
			
			return newFilter;
		}
	}
	public final class DojstafpatEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludePkey = true;
		public boolean IncludeRusr = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeUusr = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeAccessid = true;
		public boolean IncludeTstp = true;
		public boolean IncludeHcp_id = true;
		public boolean IncludeStartd = true;
		public boolean IncludeEndd = true;
		public boolean IncludeHcprole = true;
		public boolean IncludeActive = true;
		public boolean IncludeHcp_nm = true;
		public boolean IncludeHcp_prof = true;
		public boolean IncludeHcp_adr1 = true;
		public boolean IncludeHcp_adr2 = true;
		public boolean IncludeHcp_adr3 = true;
		public boolean IncludeHcp_adr4 = true;
		public boolean IncludeHcp_pc = true;
		public boolean IncludeHcp_phone = true;
		public boolean IncludeHcprolet = true;
		public boolean IncludeHcp_proft = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludePkey = true;
			IncludeRusr = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeUusr = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeAccessid = true;
			IncludeTstp = true;
			IncludeHcp_id = true;
			IncludeStartd = true;
			IncludeEndd = true;
			IncludeHcprole = true;
			IncludeActive = true;
			IncludeHcp_nm = true;
			IncludeHcp_prof = true;
			IncludeHcp_adr1 = true;
			IncludeHcp_adr2 = true;
			IncludeHcp_adr3 = true;
			IncludeHcp_adr4 = true;
			IncludeHcp_pc = true;
			IncludeHcp_phone = true;
			IncludeHcprolet = true;
			IncludeHcp_proft = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludePkey = false;
			IncludeRusr = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeUusr = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeAccessid = false;
			IncludeTstp = false;
			IncludeHcp_id = false;
			IncludeStartd = false;
			IncludeEndd = false;
			IncludeHcprole = false;
			IncludeActive = false;
			IncludeHcp_nm = false;
			IncludeHcp_prof = false;
			IncludeHcp_adr1 = false;
			IncludeHcp_adr2 = false;
			IncludeHcp_adr3 = false;
			IncludeHcp_adr4 = false;
			IncludeHcp_pc = false;
			IncludeHcp_phone = false;
			IncludeHcprolet = false;
			IncludeHcp_proft = false;
		}
		public DojstafpatEditFilter cloneObject()
		{
			DojstafpatEditFilter newEditFilter = new DojstafpatEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeAccessid = this.IncludeAccessid;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeHcp_id = this.IncludeHcp_id;
			newEditFilter.IncludeStartd = this.IncludeStartd;
			newEditFilter.IncludeEndd = this.IncludeEndd;
			newEditFilter.IncludeHcprole = this.IncludeHcprole;
			newEditFilter.IncludeActive = this.IncludeActive;
			newEditFilter.IncludeHcp_nm = this.IncludeHcp_nm;
			newEditFilter.IncludeHcp_prof = this.IncludeHcp_prof;
			newEditFilter.IncludeHcp_adr1 = this.IncludeHcp_adr1;
			newEditFilter.IncludeHcp_adr2 = this.IncludeHcp_adr2;
			newEditFilter.IncludeHcp_adr3 = this.IncludeHcp_adr3;
			newEditFilter.IncludeHcp_adr4 = this.IncludeHcp_adr4;
			newEditFilter.IncludeHcp_pc = this.IncludeHcp_pc;
			newEditFilter.IncludeHcp_phone = this.IncludeHcp_phone;
			newEditFilter.IncludeHcprolet = this.IncludeHcprolet;
			newEditFilter.IncludeHcp_proft = this.IncludeHcp_proft;
			
			return newEditFilter;
		}
	}
}
