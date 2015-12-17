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

public final class Mhc_cpacpint
{
	private Mhc_cpacpintFilter lastGetFilter = null;
	private final String serviceName = "MHC_CPACPINT";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Mhc_cpacpintFilter Filter = new Mhc_cpacpintFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Mhc_cpacpintEditFilter EditFilter = new Mhc_cpacpintEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Mhc_cpacpintCollection DataCollection = new Mhc_cpacpintCollection();

	/**
	 * Creates a new Mhc_cpacpint Data Transfer Object.
	 */ 
	public Mhc_cpacpint(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Mhc_cpacpint cloneObject() throws ims.dto.Exception
	{
		Mhc_cpacpint cloneObject = new Mhc_cpacpint(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Cpacpint_id = DataCollection.get(x).Cpacpint_id;
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
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Modu = DataCollection.get(x).Modu;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Reftype = DataCollection.get(x).Reftype;
			cloneObject.DataCollection.get(index).Refid = DataCollection.get(x).Refid;
			cloneObject.DataCollection.get(index).Rev_id = DataCollection.get(x).Rev_id;
			cloneObject.DataCollection.get(index).Int_type = DataCollection.get(x).Int_type;
			cloneObject.DataCollection.get(index).Int_sub = DataCollection.get(x).Int_sub;
			cloneObject.DataCollection.get(index).Int_int = DataCollection.get(x).Int_int;
			cloneObject.DataCollection.get(index).Int_desc = DataCollection.get(x).Int_desc;
			cloneObject.DataCollection.get(index).Int_ident = DataCollection.get(x).Int_ident;
			cloneObject.DataCollection.get(index).Int_identd = DataCollection.get(x).Int_identd;
			cloneObject.DataCollection.get(index).Int_alloc = DataCollection.get(x).Int_alloc;
			cloneObject.DataCollection.get(index).Int_allocd = DataCollection.get(x).Int_allocd;
			cloneObject.DataCollection.get(index).Int_nr = DataCollection.get(x).Int_nr;
			cloneObject.DataCollection.get(index).Int_nrunit = DataCollection.get(x).Int_nrunit;
			cloneObject.DataCollection.get(index).Int_freq = DataCollection.get(x).Int_freq;
			cloneObject.DataCollection.get(index).Int_frequnit = DataCollection.get(x).Int_frequnit;
			cloneObject.DataCollection.get(index).Int_dur = DataCollection.get(x).Int_dur;
			cloneObject.DataCollection.get(index).Int_durunit = DataCollection.get(x).Int_durunit;
			cloneObject.DataCollection.get(index).Coplas = DataCollection.get(x).Coplas;
			cloneObject.DataCollection.get(index).Cursta = DataCollection.get(x).Cursta;
			cloneObject.DataCollection.get(index).Curstad = DataCollection.get(x).Curstad;
			cloneObject.DataCollection.get(index).Curstausr = DataCollection.get(x).Curstausr;
							
			
			for(int iSeqno = 0; iSeqno < DataCollection.get(x).SeqnoCollection.count(); iSeqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnoCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Seqno = DataCollection.get(x).SeqnoCollection.get(iSeqno).Seqno;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Ints_sta = DataCollection.get(x).SeqnoCollection.get(iSeqno).Ints_sta;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Ints_stad = DataCollection.get(x).SeqnoCollection.get(iSeqno).Ints_stad;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Ints_usr = DataCollection.get(x).SeqnoCollection.get(iSeqno).Ints_usr;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Ints_comm = DataCollection.get(x).SeqnoCollection.get(iSeqno).Ints_comm;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Ints_act = DataCollection.get(x).SeqnoCollection.get(iSeqno).Ints_act;
										
			}
			
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
		return "Mhc_cpacpint.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpint.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Mhc_cpacpint.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpint.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpint.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpint.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Mhc_cpacpint.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Mhc_cpacpint.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpint.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Mhc_cpacpint.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Mhc_cpacpint.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Mhc_cpacpint.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Mhc_cpacpint.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Mhc_cpacpint.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpint.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Mhc_cpacpint.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Mhc_cpacpint.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Mhc_cpacpint.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Mhc_cpacpint.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Mhc_cpacpint.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpint.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Mhc_cpacpint.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Mhc_cpacpint.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpint.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Mhc_cpacpint.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Mhc_cpacpint.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Mhc_cpacpint.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_cpacpint.List");
							
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
	private String encodeNASFilter(Mhc_cpacpintFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Cpacpint_id != null && filter.Cpacpint_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CPACPINT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cpacpint_id;
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
		
		if(Filter.Int_type != null && filter.Int_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_type;
		}
		
		if(Filter.Int_sub != null && filter.Int_sub.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_SUB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_sub;
		}
		
		if(Filter.Int_int != null && filter.Int_int.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_INT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_int;
		}
		
		if(Filter.Int_desc != null && filter.Int_desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_desc;
		}
		
		if(Filter.Int_ident != null && filter.Int_ident.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_IDENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_ident;
		}
		
		if(Filter.Int_identd != null && filter.Int_identd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_IDENTD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_identd;
		}
		
		if(Filter.Int_alloc != null && filter.Int_alloc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_ALLOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_alloc;
		}
		
		if(Filter.Int_allocd != null && filter.Int_allocd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_ALLOCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_allocd;
		}
		
		if(Filter.Int_nr != null && filter.Int_nr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_NR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_nr;
		}
		
		if(Filter.Int_nrunit != null && filter.Int_nrunit.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_NRUNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_nrunit;
		}
		
		if(Filter.Int_freq != null && filter.Int_freq.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_FREQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_freq;
		}
		
		if(Filter.Int_frequnit != null && filter.Int_frequnit.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_FREQUNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_frequnit;
		}
		
		if(Filter.Int_dur != null && filter.Int_dur.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_DUR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_dur;
		}
		
		if(Filter.Int_durunit != null && filter.Int_durunit.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INT_DURUNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_durunit;
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
			
		Mhc_cpacpintRecord data = (Mhc_cpacpintRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeCpacpint_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CPACPINT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cpacpint_id);
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
		
		if(EditFilter.IncludeInt_type)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INT_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_type);
		}
		
		if(EditFilter.IncludeInt_sub)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INT_SUB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_sub);
		}
		
		if(EditFilter.IncludeInt_int)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INT_INT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_int);
		}
		
		if(EditFilter.IncludeInt_desc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INT_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_desc);
		}
		
		if(EditFilter.IncludeInt_ident)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INT_IDENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_ident);
		}
		
		if(EditFilter.IncludeInt_identd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INT_IDENTD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_identd);
		}
		
		if(EditFilter.IncludeInt_alloc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INT_ALLOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_alloc);
		}
		
		if(EditFilter.IncludeInt_allocd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INT_ALLOCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_allocd);
		}
		
		if(EditFilter.IncludeInt_nr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INT_NR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_nr);
		}
		
		if(EditFilter.IncludeInt_nrunit)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INT_NRUNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_nrunit);
		}
		
		if(EditFilter.IncludeInt_freq)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INT_FREQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_freq);
		}
		
		if(EditFilter.IncludeInt_frequnit)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INT_FREQUNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_frequnit);
		}
		
		if(EditFilter.IncludeInt_dur)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INT_DUR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_dur);
		}
		
		if(EditFilter.IncludeInt_durunit)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INT_DURUNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_durunit);
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
			Mhc_cpacpintSeqnoRecord rgRecord = (Mhc_cpacpintSeqnoRecord)data.SeqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INTS_STA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ints_sta);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INTS_STAD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ints_stad);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INTS_USR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ints_usr);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INTS_COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ints_comm);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INTS_ACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ints_act);
			
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
			Mhc_cpacpintRecord record = new Mhc_cpacpintRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Cpacpint_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CPACPINT_ID"));
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
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Reftype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFTYPE"));
			record.Refid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFID"));
			record.Rev_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REV_ID"));
			record.Int_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_TYPE"));
			record.Int_sub = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_SUB"));
			record.Int_int = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_INT"));
			record.Int_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_DESC"));
			record.Int_ident = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_IDENT"));
			record.Int_identd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_IDENTD"));
			record.Int_alloc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_ALLOC"));
			record.Int_allocd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_ALLOCD"));
			record.Int_nr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_NR"));
			record.Int_nrunit = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_NRUNIT"));
			record.Int_freq = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_FREQ"));
			record.Int_frequnit = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_FREQUNIT"));
			record.Int_dur = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_DUR"));
			record.Int_durunit = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_DURUNIT"));
			record.Coplas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COPLAS"));
			record.Cursta = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURSTA"));
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
			Mhc_cpacpintRecord record = new Mhc_cpacpintRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Cpacpint_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CPACPINT_ID"));
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
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Reftype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFTYPE"));
			record.Refid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFID"));
			record.Rev_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REV_ID"));
			record.Int_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_TYPE"));
			record.Int_sub = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_SUB"));
			record.Int_int = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_INT"));
			record.Int_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_DESC"));
			record.Int_ident = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_IDENT"));
			record.Int_identd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_IDENTD"));
			record.Int_alloc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_ALLOC"));
			record.Int_allocd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_ALLOCD"));
			record.Int_nr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_NR"));
			record.Int_nrunit = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_NRUNIT"));
			record.Int_freq = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_FREQ"));
			record.Int_frequnit = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_FREQUNIT"));
			record.Int_dur = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_DUR"));
			record.Int_durunit = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_DURUNIT"));
			record.Coplas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COPLAS"));
			record.Cursta = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURSTA"));
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
						Mhc_cpacpintSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ints_sta"))
					{
						Mhc_cpacpintSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Ints_sta = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ints_stad"))
					{
						Mhc_cpacpintSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Ints_stad = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ints_usr"))
					{
						Mhc_cpacpintSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Ints_usr = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ints_comm"))
					{
						Mhc_cpacpintSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Ints_comm = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ints_act"))
					{
						Mhc_cpacpintSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Ints_act = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Mhc_cpacpintCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Mhc_cpacpintRecord newRecord = new Mhc_cpacpintRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Mhc_cpacpintRecord record)
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
		public Mhc_cpacpintRecord get(int index)
		{
			return (Mhc_cpacpintRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Mhc_cpacpintRecord
	{
		public String Cpacpint_id = "";
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
		public String Cdat = "";
		public String Ctim = "";
		public String Modu = "";
		public String Active = "";
		public String Tstp = "";
		public String Reftype = "";
		public String Refid = "";
		public String Rev_id = "";
		public String Int_type = "";
		public String Int_sub = "";
		public String Int_int = "";
		public String Int_desc = "";
		public String Int_ident = "";
		public String Int_identd = "";
		public String Int_alloc = "";
		public String Int_allocd = "";
		public String Int_nr = "";
		public String Int_nrunit = "";
		public String Int_freq = "";
		public String Int_frequnit = "";
		public String Int_dur = "";
		public String Int_durunit = "";
		public String Coplas = "";
		public String Cursta = "";
		public String Curstad = "";
		public String Curstausr = "";
		
		public Mhc_cpacpintSeqnoCollection SeqnoCollection = new Mhc_cpacpintSeqnoCollection();		
		
		public void clear()
		{
			Cpacpint_id = "";
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
			Cdat = "";
			Ctim = "";
			Modu = "";
			Active = "";
			Tstp = "";
			Reftype = "";
			Refid = "";
			Rev_id = "";
			Int_type = "";
			Int_sub = "";
			Int_int = "";
			Int_desc = "";
			Int_ident = "";
			Int_identd = "";
			Int_alloc = "";
			Int_allocd = "";
			Int_nr = "";
			Int_nrunit = "";
			Int_freq = "";
			Int_frequnit = "";
			Int_dur = "";
			Int_durunit = "";
			Coplas = "";
			Cursta = "";
			Curstad = "";
			Curstausr = "";
			
			SeqnoCollection.clear();
		}		
	}
	
	public final class Mhc_cpacpintSeqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Mhc_cpacpintSeqnoRecord newRecord = new Mhc_cpacpintSeqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Mhc_cpacpintSeqnoRecord record)
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
		public Mhc_cpacpintSeqnoRecord get(int index)
		{
			return (Mhc_cpacpintSeqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Mhc_cpacpintSeqnoRecord
	{
		public String Seqno = "";
		public String Ints_sta = "";
		public String Ints_stad = "";
		public String Ints_usr = "";
		public String Ints_comm = "";
		public String Ints_act = "";
		
		public void clear()
		{
			Seqno = "";
			Ints_sta = "";
			Ints_stad = "";
			Ints_usr = "";
			Ints_comm = "";
			Ints_act = "";
			
		}
	}	
	public final class Mhc_cpacpintFilter
	{			
		public String Cpacpint_id = "";
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
		public String Cdat = "";
		public String Ctim = "";
		public String Modu = "";
		public String Active = "";
		public String Tstp = "";
		public String Reftype = "";
		public String Refid = "";
		public String Rev_id = "";
		public String Int_type = "";
		public String Int_sub = "";
		public String Int_int = "";
		public String Int_desc = "";
		public String Int_ident = "";
		public String Int_identd = "";
		public String Int_alloc = "";
		public String Int_allocd = "";
		public String Int_nr = "";
		public String Int_nrunit = "";
		public String Int_freq = "";
		public String Int_frequnit = "";
		public String Int_dur = "";
		public String Int_durunit = "";
		public String Coplas = "";
		public String Cursta = "";
		public String Curstad = "";
		public String Curstausr = "";
		
		public void clear()
		{				
			Cpacpint_id = "";
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
			Cdat = "";
			Ctim = "";
			Modu = "";
			Active = "";
			Tstp = "";
			Reftype = "";
			Refid = "";
			Rev_id = "";
			Int_type = "";
			Int_sub = "";
			Int_int = "";
			Int_desc = "";
			Int_ident = "";
			Int_identd = "";
			Int_alloc = "";
			Int_allocd = "";
			Int_nr = "";
			Int_nrunit = "";
			Int_freq = "";
			Int_frequnit = "";
			Int_dur = "";
			Int_durunit = "";
			Coplas = "";
			Cursta = "";
			Curstad = "";
			Curstausr = "";
		}	
		public Mhc_cpacpintFilter cloneObject()
		{
			Mhc_cpacpintFilter newFilter = new Mhc_cpacpintFilter();
			
			newFilter.Cpacpint_id = this.Cpacpint_id;
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
			newFilter.Cdat = this.Cdat;
			newFilter.Ctim = this.Ctim;
			newFilter.Modu = this.Modu;
			newFilter.Active = this.Active;
			newFilter.Tstp = this.Tstp;
			newFilter.Reftype = this.Reftype;
			newFilter.Refid = this.Refid;
			newFilter.Rev_id = this.Rev_id;
			newFilter.Int_type = this.Int_type;
			newFilter.Int_sub = this.Int_sub;
			newFilter.Int_int = this.Int_int;
			newFilter.Int_desc = this.Int_desc;
			newFilter.Int_ident = this.Int_ident;
			newFilter.Int_identd = this.Int_identd;
			newFilter.Int_alloc = this.Int_alloc;
			newFilter.Int_allocd = this.Int_allocd;
			newFilter.Int_nr = this.Int_nr;
			newFilter.Int_nrunit = this.Int_nrunit;
			newFilter.Int_freq = this.Int_freq;
			newFilter.Int_frequnit = this.Int_frequnit;
			newFilter.Int_dur = this.Int_dur;
			newFilter.Int_durunit = this.Int_durunit;
			newFilter.Coplas = this.Coplas;
			newFilter.Cursta = this.Cursta;
			newFilter.Curstad = this.Curstad;
			newFilter.Curstausr = this.Curstausr;
			
			return newFilter;
		}
	}
	public final class Mhc_cpacpintEditFilter
	{			
		public boolean IncludeCpacpint_id = true;
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
		public boolean IncludeCdat = true;
		public boolean IncludeCtim = true;
		public boolean IncludeModu = true;
		public boolean IncludeActive = true;
		public boolean IncludeTstp = true;
		public boolean IncludeReftype = true;
		public boolean IncludeRefid = true;
		public boolean IncludeRev_id = true;
		public boolean IncludeInt_type = true;
		public boolean IncludeInt_sub = true;
		public boolean IncludeInt_int = true;
		public boolean IncludeInt_desc = true;
		public boolean IncludeInt_ident = true;
		public boolean IncludeInt_identd = true;
		public boolean IncludeInt_alloc = true;
		public boolean IncludeInt_allocd = true;
		public boolean IncludeInt_nr = true;
		public boolean IncludeInt_nrunit = true;
		public boolean IncludeInt_freq = true;
		public boolean IncludeInt_frequnit = true;
		public boolean IncludeInt_dur = true;
		public boolean IncludeInt_durunit = true;
		public boolean IncludeCoplas = true;
		public boolean IncludeCursta = true;
		public boolean IncludeCurstad = true;
		public boolean IncludeCurstausr = true;
		
		public void includeAll()
		{				
			IncludeCpacpint_id = true;
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
			IncludeCdat = true;
			IncludeCtim = true;
			IncludeModu = true;
			IncludeActive = true;
			IncludeTstp = true;
			IncludeReftype = true;
			IncludeRefid = true;
			IncludeRev_id = true;
			IncludeInt_type = true;
			IncludeInt_sub = true;
			IncludeInt_int = true;
			IncludeInt_desc = true;
			IncludeInt_ident = true;
			IncludeInt_identd = true;
			IncludeInt_alloc = true;
			IncludeInt_allocd = true;
			IncludeInt_nr = true;
			IncludeInt_nrunit = true;
			IncludeInt_freq = true;
			IncludeInt_frequnit = true;
			IncludeInt_dur = true;
			IncludeInt_durunit = true;
			IncludeCoplas = true;
			IncludeCursta = true;
			IncludeCurstad = true;
			IncludeCurstausr = true;
		}	
		public void excludeAll()
		{				
			IncludeCpacpint_id = false;
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
			IncludeCdat = false;
			IncludeCtim = false;
			IncludeModu = false;
			IncludeActive = false;
			IncludeTstp = false;
			IncludeReftype = false;
			IncludeRefid = false;
			IncludeRev_id = false;
			IncludeInt_type = false;
			IncludeInt_sub = false;
			IncludeInt_int = false;
			IncludeInt_desc = false;
			IncludeInt_ident = false;
			IncludeInt_identd = false;
			IncludeInt_alloc = false;
			IncludeInt_allocd = false;
			IncludeInt_nr = false;
			IncludeInt_nrunit = false;
			IncludeInt_freq = false;
			IncludeInt_frequnit = false;
			IncludeInt_dur = false;
			IncludeInt_durunit = false;
			IncludeCoplas = false;
			IncludeCursta = false;
			IncludeCurstad = false;
			IncludeCurstausr = false;
		}
		public Mhc_cpacpintEditFilter cloneObject()
		{
			Mhc_cpacpintEditFilter newEditFilter = new Mhc_cpacpintEditFilter();
			
			newEditFilter.IncludeCpacpint_id = this.IncludeCpacpint_id;
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
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeModu = this.IncludeModu;
			newEditFilter.IncludeActive = this.IncludeActive;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeReftype = this.IncludeReftype;
			newEditFilter.IncludeRefid = this.IncludeRefid;
			newEditFilter.IncludeRev_id = this.IncludeRev_id;
			newEditFilter.IncludeInt_type = this.IncludeInt_type;
			newEditFilter.IncludeInt_sub = this.IncludeInt_sub;
			newEditFilter.IncludeInt_int = this.IncludeInt_int;
			newEditFilter.IncludeInt_desc = this.IncludeInt_desc;
			newEditFilter.IncludeInt_ident = this.IncludeInt_ident;
			newEditFilter.IncludeInt_identd = this.IncludeInt_identd;
			newEditFilter.IncludeInt_alloc = this.IncludeInt_alloc;
			newEditFilter.IncludeInt_allocd = this.IncludeInt_allocd;
			newEditFilter.IncludeInt_nr = this.IncludeInt_nr;
			newEditFilter.IncludeInt_nrunit = this.IncludeInt_nrunit;
			newEditFilter.IncludeInt_freq = this.IncludeInt_freq;
			newEditFilter.IncludeInt_frequnit = this.IncludeInt_frequnit;
			newEditFilter.IncludeInt_dur = this.IncludeInt_dur;
			newEditFilter.IncludeInt_durunit = this.IncludeInt_durunit;
			newEditFilter.IncludeCoplas = this.IncludeCoplas;
			newEditFilter.IncludeCursta = this.IncludeCursta;
			newEditFilter.IncludeCurstad = this.IncludeCurstad;
			newEditFilter.IncludeCurstausr = this.IncludeCurstausr;
			
			return newEditFilter;
		}
	}
}
