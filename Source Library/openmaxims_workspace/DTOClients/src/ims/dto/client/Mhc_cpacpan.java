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

public final class Mhc_cpacpan
{
	private Mhc_cpacpanFilter lastGetFilter = null;
	private final String serviceName = "MHC_CPACPAN";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Mhc_cpacpanFilter Filter = new Mhc_cpacpanFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Mhc_cpacpanEditFilter EditFilter = new Mhc_cpacpanEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Mhc_cpacpanCollection DataCollection = new Mhc_cpacpanCollection();

	/**
	 * Creates a new Mhc_cpacpan Data Transfer Object.
	 */ 
	public Mhc_cpacpan(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Mhc_cpacpan cloneObject() throws ims.dto.Exception
	{
		Mhc_cpacpan cloneObject = new Mhc_cpacpan(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Cpacpan_id = DataCollection.get(x).Cpacpan_id;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Ccs_epid = DataCollection.get(x).Ccs_epid;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Rhcp = DataCollection.get(x).Rhcp;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Uhcp = DataCollection.get(x).Uhcp;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Modu = DataCollection.get(x).Modu;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Reftype = DataCollection.get(x).Reftype;
			cloneObject.DataCollection.get(index).Refid = DataCollection.get(x).Refid;
			cloneObject.DataCollection.get(index).Rev_id = DataCollection.get(x).Rev_id;
			cloneObject.DataCollection.get(index).An_typ = DataCollection.get(x).An_typ;
			cloneObject.DataCollection.get(index).An_desc = DataCollection.get(x).An_desc;
			cloneObject.DataCollection.get(index).An_idat = DataCollection.get(x).An_idat;
			cloneObject.DataCollection.get(index).An_iusr = DataCollection.get(x).An_iusr;
			cloneObject.DataCollection.get(index).Coplas = DataCollection.get(x).Coplas;
			cloneObject.DataCollection.get(index).Cursta = DataCollection.get(x).Cursta;
			cloneObject.DataCollection.get(index).Curstareas = DataCollection.get(x).Curstareas;
			cloneObject.DataCollection.get(index).Curstad = DataCollection.get(x).Curstad;
			cloneObject.DataCollection.get(index).Curstausr = DataCollection.get(x).Curstausr;
							
			
			for(int iSeqno = 0; iSeqno < DataCollection.get(x).SeqnoCollection.count(); iSeqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnoCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Seqno = DataCollection.get(x).SeqnoCollection.get(iSeqno).Seqno;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Ans_sta = DataCollection.get(x).SeqnoCollection.get(iSeqno).Ans_sta;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Ans_stareas = DataCollection.get(x).SeqnoCollection.get(iSeqno).Ans_stareas;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Ans_usr = DataCollection.get(x).SeqnoCollection.get(iSeqno).Ans_usr;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Ans_dat = DataCollection.get(x).SeqnoCollection.get(iSeqno).Ans_dat;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Ans_act = DataCollection.get(x).SeqnoCollection.get(iSeqno).Ans_act;
										
			}
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "40";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Mhc_cpacpan.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpan.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Mhc_cpacpan.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpan.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpan.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpan.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Mhc_cpacpan.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Mhc_cpacpan.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpan.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Mhc_cpacpan.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Mhc_cpacpan.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Mhc_cpacpan.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Mhc_cpacpan.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Mhc_cpacpan.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpan.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Mhc_cpacpan.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Mhc_cpacpan.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Mhc_cpacpan.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Mhc_cpacpan.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Mhc_cpacpan.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpan.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Mhc_cpacpan.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Mhc_cpacpan.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpan.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Mhc_cpacpan.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Mhc_cpacpan.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Mhc_cpacpan.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpan.List");
							
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
	private String encodeNASFilter(Mhc_cpacpanFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Cpacpan_id != null && filter.Cpacpan_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CPACPAN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cpacpan_id;
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey;
		}
		
		if(Filter.Ccs_epid != null && filter.Ccs_epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccs_epid;
		}
		
		if(Filter.Rusr != null && filter.Rusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusr;
		}
		
		if(Filter.Rhcp != null && filter.Rhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rhcp;
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
		
		if(Filter.Uhcp != null && filter.Uhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uhcp;
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
		
		if(Filter.Ctim != null && filter.Ctim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ctim;
		}
		
		if(Filter.Cdat != null && filter.Cdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cdat;
		}
		
		if(Filter.Modu != null && filter.Modu.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modu;
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
		
		if(Filter.Reftype != null && filter.Reftype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reftype;
		}
		
		if(Filter.Refid != null && filter.Refid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refid;
		}
		
		if(Filter.Rev_id != null && filter.Rev_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rev_id;
		}
		
		if(Filter.An_typ != null && filter.An_typ.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AN_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.An_typ;
		}
		
		if(Filter.An_desc != null && filter.An_desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AN_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.An_desc;
		}
		
		if(Filter.An_idat != null && filter.An_idat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AN_IDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.An_idat;
		}
		
		if(Filter.An_iusr != null && filter.An_iusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AN_IUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.An_iusr;
		}
		
		if(Filter.Coplas != null && filter.Coplas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COPLAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Coplas;
		}
		
		if(Filter.Cursta != null && filter.Cursta.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CURSTA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cursta;
		}
		
		if(Filter.Curstareas != null && filter.Curstareas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CURSTAREAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Curstareas;
		}
		
		if(Filter.Curstad != null && filter.Curstad.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CURSTAD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Curstad;
		}
		
		if(Filter.Curstausr != null && filter.Curstausr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CURSTAUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Curstausr;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Mhc_cpacpanRecord data = (Mhc_cpacpanRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeCpacpan_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CPACPAN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cpacpan_id);
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
		}
		
		if(EditFilter.IncludeCcs_epid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccs_epid);
		}
		
		if(EditFilter.IncludeRusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusr);
		}
		
		if(EditFilter.IncludeRhcp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rhcp);
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
		
		if(EditFilter.IncludeUhcp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uhcp);
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
		
		if(EditFilter.IncludeCtim)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ctim);
		}
		
		if(EditFilter.IncludeCdat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cdat);
		}
		
		if(EditFilter.IncludeModu)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modu);
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
		
		if(EditFilter.IncludeReftype)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reftype);
		}
		
		if(EditFilter.IncludeRefid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refid);
		}
		
		if(EditFilter.IncludeRev_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rev_id);
		}
		
		if(EditFilter.IncludeAn_typ)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AN_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.An_typ);
		}
		
		if(EditFilter.IncludeAn_desc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AN_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.An_desc);
		}
		
		if(EditFilter.IncludeAn_idat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AN_IDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.An_idat);
		}
		
		if(EditFilter.IncludeAn_iusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AN_IUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.An_iusr);
		}
		
		if(EditFilter.IncludeCoplas)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COPLAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Coplas);
		}
		
		if(EditFilter.IncludeCursta)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CURSTA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cursta);
		}
		
		if(EditFilter.IncludeCurstareas)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CURSTAREAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Curstareas);
		}
		
		if(EditFilter.IncludeCurstad)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CURSTAD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Curstad);
		}
		
		if(EditFilter.IncludeCurstausr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CURSTAUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Curstausr);
		}
		
		
		for(int x = 0; x < data.SeqnoCollection.count(); x++)
		{
			Mhc_cpacpanSeqnoRecord rgRecord = (Mhc_cpacpanSeqnoRecord)data.SeqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ANS_STA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ans_sta);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ANS_STAREAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ans_stareas);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ANS_USR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ans_usr);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ANS_DAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ans_dat);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ANS_ACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ans_act);
			
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
			Mhc_cpacpanRecord record = new Mhc_cpacpanRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Cpacpan_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CPACPAN_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Reftype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFTYPE"));
			record.Refid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFID"));
			record.Rev_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REV_ID"));
			record.An_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AN_TYP"));
			record.An_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AN_DESC"));
			record.An_idat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AN_IDAT"));
			record.An_iusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AN_IUSR"));
			record.Coplas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COPLAS"));
			record.Cursta = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURSTA"));
			record.Curstareas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURSTAREAS"));
			record.Curstad = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURSTAD"));
			record.Curstausr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURSTAUSR"));
									
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
			Mhc_cpacpanRecord record = new Mhc_cpacpanRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Cpacpan_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CPACPAN_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Reftype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFTYPE"));
			record.Refid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFID"));
			record.Rev_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REV_ID"));
			record.An_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AN_TYP"));
			record.An_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AN_DESC"));
			record.An_idat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AN_IDAT"));
			record.An_iusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AN_IUSR"));
			record.Coplas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COPLAS"));
			record.Cursta = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURSTA"));
			record.Curstareas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURSTAREAS"));
			record.Curstad = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURSTAD"));
			record.Curstausr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURSTAUSR"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					record.SeqnoCollection.add();
			
									
			rgCount = record.SeqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					{
						Mhc_cpacpanSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ans_sta"))
					{
						Mhc_cpacpanSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Ans_sta = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ans_stareas"))
					{
						Mhc_cpacpanSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Ans_stareas = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ans_usr"))
					{
						Mhc_cpacpanSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Ans_usr = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ans_dat"))
					{
						Mhc_cpacpanSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Ans_dat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ans_act"))
					{
						Mhc_cpacpanSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Ans_act = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Mhc_cpacpanCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Mhc_cpacpanRecord newRecord = new Mhc_cpacpanRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Mhc_cpacpanRecord record)
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
		public Mhc_cpacpanRecord get(int index)
		{
			return (Mhc_cpacpanRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Mhc_cpacpanRecord
	{
		public String Cpacpan_id = "";
		public String Pkey = "";
		public String Ccs_epid = "";
		public String Rusr = "";
		public String Rhcp = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Uusr = "";
		public String Uhcp = "";
		public String Udat = "";
		public String Utim = "";
		public String Ctim = "";
		public String Cdat = "";
		public String Modu = "";
		public String Active = "";
		public String Tstp = "";
		public String Reftype = "";
		public String Refid = "";
		public String Rev_id = "";
		public String An_typ = "";
		public String An_desc = "";
		public String An_idat = "";
		public String An_iusr = "";
		public String Coplas = "";
		public String Cursta = "";
		public String Curstareas = "";
		public String Curstad = "";
		public String Curstausr = "";
		
		public Mhc_cpacpanSeqnoCollection SeqnoCollection = new Mhc_cpacpanSeqnoCollection();		
		
		public void clear()
		{
			Cpacpan_id = "";
			Pkey = "";
			Ccs_epid = "";
			Rusr = "";
			Rhcp = "";
			Rdat = "";
			Rtim = "";
			Uusr = "";
			Uhcp = "";
			Udat = "";
			Utim = "";
			Ctim = "";
			Cdat = "";
			Modu = "";
			Active = "";
			Tstp = "";
			Reftype = "";
			Refid = "";
			Rev_id = "";
			An_typ = "";
			An_desc = "";
			An_idat = "";
			An_iusr = "";
			Coplas = "";
			Cursta = "";
			Curstareas = "";
			Curstad = "";
			Curstausr = "";
			
			SeqnoCollection.clear();
		}		
	}
	
	public final class Mhc_cpacpanSeqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Mhc_cpacpanSeqnoRecord newRecord = new Mhc_cpacpanSeqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Mhc_cpacpanSeqnoRecord record)
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
		public Mhc_cpacpanSeqnoRecord get(int index)
		{
			return (Mhc_cpacpanSeqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Mhc_cpacpanSeqnoRecord
	{
		public String Seqno = "";
		public String Ans_sta = "";
		public String Ans_stareas = "";
		public String Ans_usr = "";
		public String Ans_dat = "";
		public String Ans_act = "";
		
		public void clear()
		{
			Seqno = "";
			Ans_sta = "";
			Ans_stareas = "";
			Ans_usr = "";
			Ans_dat = "";
			Ans_act = "";
			
		}
	}	
	public final class Mhc_cpacpanFilter
	{			
		public String Cpacpan_id = "";
		public String Pkey = "";
		public String Ccs_epid = "";
		public String Rusr = "";
		public String Rhcp = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Uusr = "";
		public String Uhcp = "";
		public String Udat = "";
		public String Utim = "";
		public String Ctim = "";
		public String Cdat = "";
		public String Modu = "";
		public String Active = "";
		public String Tstp = "";
		public String Reftype = "";
		public String Refid = "";
		public String Rev_id = "";
		public String An_typ = "";
		public String An_desc = "";
		public String An_idat = "";
		public String An_iusr = "";
		public String Coplas = "";
		public String Cursta = "";
		public String Curstareas = "";
		public String Curstad = "";
		public String Curstausr = "";
		
		public void clear()
		{				
			Cpacpan_id = "";
			Pkey = "";
			Ccs_epid = "";
			Rusr = "";
			Rhcp = "";
			Rdat = "";
			Rtim = "";
			Uusr = "";
			Uhcp = "";
			Udat = "";
			Utim = "";
			Ctim = "";
			Cdat = "";
			Modu = "";
			Active = "";
			Tstp = "";
			Reftype = "";
			Refid = "";
			Rev_id = "";
			An_typ = "";
			An_desc = "";
			An_idat = "";
			An_iusr = "";
			Coplas = "";
			Cursta = "";
			Curstareas = "";
			Curstad = "";
			Curstausr = "";
		}	
		public Mhc_cpacpanFilter cloneObject()
		{
			Mhc_cpacpanFilter newFilter = new Mhc_cpacpanFilter();
			
			newFilter.Cpacpan_id = this.Cpacpan_id;
			newFilter.Pkey = this.Pkey;
			newFilter.Ccs_epid = this.Ccs_epid;
			newFilter.Rusr = this.Rusr;
			newFilter.Rhcp = this.Rhcp;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Uusr = this.Uusr;
			newFilter.Uhcp = this.Uhcp;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Ctim = this.Ctim;
			newFilter.Cdat = this.Cdat;
			newFilter.Modu = this.Modu;
			newFilter.Active = this.Active;
			newFilter.Tstp = this.Tstp;
			newFilter.Reftype = this.Reftype;
			newFilter.Refid = this.Refid;
			newFilter.Rev_id = this.Rev_id;
			newFilter.An_typ = this.An_typ;
			newFilter.An_desc = this.An_desc;
			newFilter.An_idat = this.An_idat;
			newFilter.An_iusr = this.An_iusr;
			newFilter.Coplas = this.Coplas;
			newFilter.Cursta = this.Cursta;
			newFilter.Curstareas = this.Curstareas;
			newFilter.Curstad = this.Curstad;
			newFilter.Curstausr = this.Curstausr;
			
			return newFilter;
		}
	}
	public final class Mhc_cpacpanEditFilter
	{			
		public boolean IncludeCpacpan_id = true;
		public boolean IncludePkey = true;
		public boolean IncludeCcs_epid = true;
		public boolean IncludeRusr = true;
		public boolean IncludeRhcp = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeUusr = true;
		public boolean IncludeUhcp = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeCtim = true;
		public boolean IncludeCdat = true;
		public boolean IncludeModu = true;
		public boolean IncludeActive = true;
		public boolean IncludeTstp = true;
		public boolean IncludeReftype = true;
		public boolean IncludeRefid = true;
		public boolean IncludeRev_id = true;
		public boolean IncludeAn_typ = true;
		public boolean IncludeAn_desc = true;
		public boolean IncludeAn_idat = true;
		public boolean IncludeAn_iusr = true;
		public boolean IncludeCoplas = true;
		public boolean IncludeCursta = true;
		public boolean IncludeCurstareas = true;
		public boolean IncludeCurstad = true;
		public boolean IncludeCurstausr = true;
		
		public void includeAll()
		{				
			IncludeCpacpan_id = true;
			IncludePkey = true;
			IncludeCcs_epid = true;
			IncludeRusr = true;
			IncludeRhcp = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeUusr = true;
			IncludeUhcp = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeCtim = true;
			IncludeCdat = true;
			IncludeModu = true;
			IncludeActive = true;
			IncludeTstp = true;
			IncludeReftype = true;
			IncludeRefid = true;
			IncludeRev_id = true;
			IncludeAn_typ = true;
			IncludeAn_desc = true;
			IncludeAn_idat = true;
			IncludeAn_iusr = true;
			IncludeCoplas = true;
			IncludeCursta = true;
			IncludeCurstareas = true;
			IncludeCurstad = true;
			IncludeCurstausr = true;
		}	
		public void excludeAll()
		{				
			IncludeCpacpan_id = false;
			IncludePkey = false;
			IncludeCcs_epid = false;
			IncludeRusr = false;
			IncludeRhcp = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeUusr = false;
			IncludeUhcp = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeCtim = false;
			IncludeCdat = false;
			IncludeModu = false;
			IncludeActive = false;
			IncludeTstp = false;
			IncludeReftype = false;
			IncludeRefid = false;
			IncludeRev_id = false;
			IncludeAn_typ = false;
			IncludeAn_desc = false;
			IncludeAn_idat = false;
			IncludeAn_iusr = false;
			IncludeCoplas = false;
			IncludeCursta = false;
			IncludeCurstareas = false;
			IncludeCurstad = false;
			IncludeCurstausr = false;
		}
		public Mhc_cpacpanEditFilter cloneObject()
		{
			Mhc_cpacpanEditFilter newEditFilter = new Mhc_cpacpanEditFilter();
			
			newEditFilter.IncludeCpacpan_id = this.IncludeCpacpan_id;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeCcs_epid = this.IncludeCcs_epid;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeRhcp = this.IncludeRhcp;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeUhcp = this.IncludeUhcp;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeModu = this.IncludeModu;
			newEditFilter.IncludeActive = this.IncludeActive;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeReftype = this.IncludeReftype;
			newEditFilter.IncludeRefid = this.IncludeRefid;
			newEditFilter.IncludeRev_id = this.IncludeRev_id;
			newEditFilter.IncludeAn_typ = this.IncludeAn_typ;
			newEditFilter.IncludeAn_desc = this.IncludeAn_desc;
			newEditFilter.IncludeAn_idat = this.IncludeAn_idat;
			newEditFilter.IncludeAn_iusr = this.IncludeAn_iusr;
			newEditFilter.IncludeCoplas = this.IncludeCoplas;
			newEditFilter.IncludeCursta = this.IncludeCursta;
			newEditFilter.IncludeCurstareas = this.IncludeCurstareas;
			newEditFilter.IncludeCurstad = this.IncludeCurstad;
			newEditFilter.IncludeCurstausr = this.IncludeCurstausr;
			
			return newEditFilter;
		}
	}
}
