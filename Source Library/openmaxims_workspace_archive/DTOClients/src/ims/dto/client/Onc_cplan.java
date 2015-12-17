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
// Template ver. 1.0.9 - Last modified on 20/09/2004 11:20 by Marius Mihalec

package ims.dto.client;

public final class Onc_cplan implements ims.vo.ImsCloneable
{
	private Onc_cplanFilter lastGetFilter = null;
	private final String serviceName = "ONC_CPLAN";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Onc_cplanFilter Filter = new Onc_cplanFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Onc_cplanEditFilter EditFilter = new Onc_cplanEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Onc_cplanCollection DataCollection = new Onc_cplanCollection();

	/**
	 * Creates a new Onc_cplan Data Transfer Object.
	 */ 
	public Onc_cplan(ims.dto.Connection connection)
	{	
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Object clone()
	{
		return cloneObject();
	}
	/**
	 * Creates a new typed copy of the current Data Transfer Object
	 */
	public Onc_cplan cloneObject()
	{
		Onc_cplan cloneObject = new Onc_cplan(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Onc_cplan_id = DataCollection.get(x).Onc_cplan_id;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Rhcp = DataCollection.get(x).Rhcp;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Uhcp = DataCollection.get(x).Uhcp;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Modu = DataCollection.get(x).Modu;
			cloneObject.DataCollection.get(index).Ccs_epid = DataCollection.get(x).Ccs_epid;
			cloneObject.DataCollection.get(index).Cp_active = DataCollection.get(x).Cp_active;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Cp_dte = DataCollection.get(x).Cp_dte;
			cloneObject.DataCollection.get(index).Cp_cons = DataCollection.get(x).Cp_cons;
			cloneObject.DataCollection.get(index).Cp_agreeddt = DataCollection.get(x).Cp_agreeddt;
			cloneObject.DataCollection.get(index).Cp_recurrind = DataCollection.get(x).Cp_recurrind;
			cloneObject.DataCollection.get(index).Cp_intent = DataCollection.get(x).Cp_intent;
			cloneObject.DataCollection.get(index).Cp_noanticatx = DataCollection.get(x).Cp_noanticatx;
			cloneObject.DataCollection.get(index).Cp_assmdt = DataCollection.get(x).Cp_assmdt;
			cloneObject.DataCollection.get(index).Cp_patagreed = DataCollection.get(x).Cp_patagreed;
			cloneObject.DataCollection.get(index).Cp_notes = DataCollection.get(x).Cp_notes;
			cloneObject.DataCollection.get(index).Cp_mdt_id = DataCollection.get(x).Cp_mdt_id;
			cloneObject.DataCollection.get(index).Cp_other_trmts = DataCollection.get(x).Cp_other_trmts;
			cloneObject.DataCollection.get(index).Cp_reason_change = DataCollection.get(x).Cp_reason_change;
							
			
			for(int iSeqno = 0; iSeqno < DataCollection.get(x).SeqnoCollection.count(); iSeqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnoCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Seqno = DataCollection.get(x).SeqnoCollection.get(iSeqno).Seqno;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Cp_reasnotx = DataCollection.get(x).SeqnoCollection.get(iSeqno).Cp_reasnotx;
										
			}
			
			for(int iSeqno2 = 0; iSeqno2 < DataCollection.get(x).Seqno2Collection.count(); iSeqno2++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno2Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Seqno2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Seqno2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Cp_mxmodtxt = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Cp_mxmodtxt;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Cp_mxmod = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Cp_mxmod;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Mdt_chosen = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Mdt_chosen;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Mdt_seq = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Mdt_seq;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Pat_agreed = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Pat_agreed;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Pat_seq = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Pat_seq;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Mod_stat = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Mod_stat;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Mod_statdt = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Mod_statdt;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Origflg = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Origflg;
										
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
		return "Onc_cplan.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_cplan.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Onc_cplan.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_cplan.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_cplan.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_cplan.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Onc_cplan.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Onc_cplan.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_cplan.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Onc_cplan.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Onc_cplan.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Onc_cplan.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Onc_cplan.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Onc_cplan.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_cplan.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Onc_cplan.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Onc_cplan.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Onc_cplan.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Onc_cplan.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Onc_cplan.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_cplan.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Onc_cplan.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Onc_cplan.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_cplan.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Onc_cplan.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Onc_cplan.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Onc_cplan.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_cplan.List");
							
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
						
		listInProgress = false;

		if(execResult != null)
		{ 
			if(execResult.getId() != -3) 
			{
				Connection.stopList(serviceName);
				return execResult;
			}

			return null;
		}
		
		Connection.stopList(serviceName);
		return null; 
	}	

	private String encodeNASFilter()
	{
		return encodeNASFilter(Filter);
	}
	private String encodeNASFilter(Onc_cplanFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Onc_cplan_id != null && filter.Onc_cplan_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ONC_CPLAN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Onc_cplan_id;
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey;
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
		
		if(Filter.Ccs_epid != null && filter.Ccs_epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccs_epid;
		}
		
		if(Filter.Cp_active != null && filter.Cp_active.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CP_ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cp_active;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Cp_dte != null && filter.Cp_dte.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CP_DTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cp_dte;
		}
		
		if(Filter.Cp_cons != null && filter.Cp_cons.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CP_CONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cp_cons;
		}
		
		if(Filter.Cp_agreeddt != null && filter.Cp_agreeddt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CP_AGREEDDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cp_agreeddt;
		}
		
		if(Filter.Cp_recurrind != null && filter.Cp_recurrind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CP_RECURRIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cp_recurrind;
		}
		
		if(Filter.Cp_intent != null && filter.Cp_intent.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CP_INTENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cp_intent;
		}
		
		if(Filter.Cp_noanticatx != null && filter.Cp_noanticatx.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CP_NOANTICATX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cp_noanticatx;
		}
		
		if(Filter.Cp_assmdt != null && filter.Cp_assmdt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CP_ASSMDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cp_assmdt;
		}
		
		if(Filter.Cp_patagreed != null && filter.Cp_patagreed.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CP_PATAGREED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cp_patagreed;
		}
		
		if(Filter.Cp_notes != null && filter.Cp_notes.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CP_NOTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cp_notes;
		}
		
		if(Filter.Cp_mdt_id != null && filter.Cp_mdt_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CP_MDT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cp_mdt_id;
		}
		
		if(Filter.Cp_other_trmts != null && filter.Cp_other_trmts.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CP_OTHER_TRMTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cp_other_trmts;
		}
		
		if(Filter.Cp_reason_change != null && filter.Cp_reason_change.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CP_REASON_CHANGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cp_reason_change;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Onc_cplanRecord data = (Onc_cplanRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeOnc_cplan_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ONC_CPLAN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Onc_cplan_id);
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
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
		
		if(EditFilter.IncludeCcs_epid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccs_epid);
		}
		
		if(EditFilter.IncludeCp_active)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cp_active);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeCp_dte)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_DTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cp_dte);
		}
		
		if(EditFilter.IncludeCp_cons)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_CONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cp_cons);
		}
		
		if(EditFilter.IncludeCp_agreeddt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_AGREEDDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cp_agreeddt);
		}
		
		if(EditFilter.IncludeCp_recurrind)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_RECURRIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cp_recurrind);
		}
		
		if(EditFilter.IncludeCp_intent)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_INTENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cp_intent);
		}
		
		if(EditFilter.IncludeCp_noanticatx)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_NOANTICATX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cp_noanticatx);
		}
		
		if(EditFilter.IncludeCp_assmdt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_ASSMDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cp_assmdt);
		}
		
		if(EditFilter.IncludeCp_patagreed)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_PATAGREED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cp_patagreed);
		}
		
		if(EditFilter.IncludeCp_notes)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_NOTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cp_notes);
		}
		
		if(EditFilter.IncludeCp_mdt_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_MDT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cp_mdt_id);
		}
		
		if(EditFilter.IncludeCp_other_trmts)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_OTHER_TRMTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cp_other_trmts);
		}
		
		if(EditFilter.IncludeCp_reason_change)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_REASON_CHANGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cp_reason_change);
		}
		
		
		for(int x = 0; x < data.SeqnoCollection.count(); x++)
		{
			Onc_cplanSeqnoRecord rgRecord = (Onc_cplanSeqnoRecord)data.SeqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_REASNOTX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Cp_reasnotx);
			
		}
		for(int x = 0; x < data.Seqno2Collection.count(); x++)
		{
			Onc_cplanSeqno2Record rgRecord = (Onc_cplanSeqno2Record)data.Seqno2Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno2);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_MXMODTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Cp_mxmodtxt);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CP_MXMOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Cp_mxmod);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MDT_CHOSEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mdt_chosen);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MDT_SEQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mdt_seq);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PAT_AGREED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Pat_agreed);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PAT_SEQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Pat_seq);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MOD_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mod_stat);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MOD_STATDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mod_statdt);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORIGFLG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Origflg);
			
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
			Onc_cplanRecord record = new Onc_cplanRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Onc_cplan_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONC_CPLAN_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Cp_active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_ACTIVE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Cp_dte = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_DTE"));
			record.Cp_cons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_CONS"));
			record.Cp_agreeddt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_AGREEDDT"));
			record.Cp_recurrind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_RECURRIND"));
			record.Cp_intent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_INTENT"));
			record.Cp_noanticatx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_NOANTICATX"));
			record.Cp_assmdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_ASSMDT"));
			record.Cp_patagreed = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_PATAGREED"));
			record.Cp_notes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_NOTES"));
			record.Cp_mdt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_MDT_ID"));
			record.Cp_other_trmts = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_OTHER_TRMTS"));
			record.Cp_reason_change = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_REASON_CHANGE"));
									
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
			Onc_cplanRecord record = new Onc_cplanRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Onc_cplan_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONC_CPLAN_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Cp_active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_ACTIVE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Cp_dte = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_DTE"));
			record.Cp_cons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_CONS"));
			record.Cp_agreeddt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_AGREEDDT"));
			record.Cp_recurrind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_RECURRIND"));
			record.Cp_intent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_INTENT"));
			record.Cp_noanticatx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_NOANTICATX"));
			record.Cp_assmdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_ASSMDT"));
			record.Cp_patagreed = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_PATAGREED"));
			record.Cp_notes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_NOTES"));
			record.Cp_mdt_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_MDT_ID"));
			record.Cp_other_trmts = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_OTHER_TRMTS"));
			record.Cp_reason_change = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CP_REASON_CHANGE"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					record.SeqnoCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno2"))
					record.Seqno2Collection.add();
			
									
			rgCount = record.SeqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					{
						Onc_cplanSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("cp_reasnotx"))
					{
						Onc_cplanSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Cp_reasnotx = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Seqno2Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno2"))
					{
						Onc_cplanSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Seqno2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("cp_mxmodtxt"))
					{
						Onc_cplanSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Cp_mxmodtxt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("cp_mxmod"))
					{
						Onc_cplanSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Cp_mxmod = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("mdt_chosen"))
					{
						Onc_cplanSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Mdt_chosen = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("mdt_seq"))
					{
						Onc_cplanSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Mdt_seq = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("pat_agreed"))
					{
						Onc_cplanSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Pat_agreed = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("pat_seq"))
					{
						Onc_cplanSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Pat_seq = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("mod_stat"))
					{
						Onc_cplanSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Mod_stat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("mod_statdt"))
					{
						Onc_cplanSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Mod_statdt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("origflg"))
					{
						Onc_cplanSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Origflg = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Onc_cplanCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_cplanRecord newRecord = new Onc_cplanRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_cplanRecord record)
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
		public Onc_cplanRecord get(int index)
		{
			return (Onc_cplanRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Onc_cplanRecord
	{
		public String Onc_cplan_id = "";
		public String Pkey = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Modu = "";
		public String Ccs_epid = "";
		public String Cp_active = "";
		public String Tstp = "";
		public String Cp_dte = "";
		public String Cp_cons = "";
		public String Cp_agreeddt = "";
		public String Cp_recurrind = "";
		public String Cp_intent = "";
		public String Cp_noanticatx = "";
		public String Cp_assmdt = "";
		public String Cp_patagreed = "";
		public String Cp_notes = "";
		public String Cp_mdt_id = "";
		public String Cp_other_trmts = "";
		public String Cp_reason_change = "";
		
		public Onc_cplanSeqnoCollection SeqnoCollection = new Onc_cplanSeqnoCollection();
		public Onc_cplanSeqno2Collection Seqno2Collection = new Onc_cplanSeqno2Collection();		
		
		public void clear()
		{
			Onc_cplan_id = "";
			Pkey = "";
			Rdat = "";
			Rtim = "";
			Rhcp = "";
			Rusr = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Uusr = "";
			Cdat = "";
			Ctim = "";
			Modu = "";
			Ccs_epid = "";
			Cp_active = "";
			Tstp = "";
			Cp_dte = "";
			Cp_cons = "";
			Cp_agreeddt = "";
			Cp_recurrind = "";
			Cp_intent = "";
			Cp_noanticatx = "";
			Cp_assmdt = "";
			Cp_patagreed = "";
			Cp_notes = "";
			Cp_mdt_id = "";
			Cp_other_trmts = "";
			Cp_reason_change = "";
			
			SeqnoCollection.clear();
			Seqno2Collection.clear();
		}		
	}
	
	public final class Onc_cplanSeqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_cplanSeqnoRecord newRecord = new Onc_cplanSeqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_cplanSeqnoRecord record)
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
		public Onc_cplanSeqnoRecord get(int index)
		{
			return (Onc_cplanSeqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Onc_cplanSeqno2Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_cplanSeqno2Record newRecord = new Onc_cplanSeqno2Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_cplanSeqno2Record record)
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
		public Onc_cplanSeqno2Record get(int index)
		{
			return (Onc_cplanSeqno2Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Onc_cplanSeqnoRecord
	{
		public String Seqno = "";
		public String Cp_reasnotx = "";
		
		public void clear()
		{
			Seqno = "";
			Cp_reasnotx = "";
			
		}
	}
	public final class Onc_cplanSeqno2Record
	{
		public String Seqno2 = "";
		public String Cp_mxmodtxt = "";
		public String Cp_mxmod = "";
		public String Mdt_chosen = "";
		public String Mdt_seq = "";
		public String Pat_agreed = "";
		public String Pat_seq = "";
		public String Mod_stat = "";
		public String Mod_statdt = "";
		public String Origflg = "";
		
		public void clear()
		{
			Seqno2 = "";
			Cp_mxmodtxt = "";
			Cp_mxmod = "";
			Mdt_chosen = "";
			Mdt_seq = "";
			Pat_agreed = "";
			Pat_seq = "";
			Mod_stat = "";
			Mod_statdt = "";
			Origflg = "";
			
		}
	}	
	public final class Onc_cplanFilter
	{			
		public String Onc_cplan_id = "";
		public String Pkey = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Modu = "";
		public String Ccs_epid = "";
		public String Cp_active = "";
		public String Tstp = "";
		public String Cp_dte = "";
		public String Cp_cons = "";
		public String Cp_agreeddt = "";
		public String Cp_recurrind = "";
		public String Cp_intent = "";
		public String Cp_noanticatx = "";
		public String Cp_assmdt = "";
		public String Cp_patagreed = "";
		public String Cp_notes = "";
		public String Cp_mdt_id = "";
		public String Cp_other_trmts = "";
		public String Cp_reason_change = "";
		
		public void clear()
		{				
			Onc_cplan_id = "";
			Pkey = "";
			Rdat = "";
			Rtim = "";
			Rhcp = "";
			Rusr = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Uusr = "";
			Cdat = "";
			Ctim = "";
			Modu = "";
			Ccs_epid = "";
			Cp_active = "";
			Tstp = "";
			Cp_dte = "";
			Cp_cons = "";
			Cp_agreeddt = "";
			Cp_recurrind = "";
			Cp_intent = "";
			Cp_noanticatx = "";
			Cp_assmdt = "";
			Cp_patagreed = "";
			Cp_notes = "";
			Cp_mdt_id = "";
			Cp_other_trmts = "";
			Cp_reason_change = "";
		}	
		public Onc_cplanFilter cloneObject()
		{
			Onc_cplanFilter newFilter = new Onc_cplanFilter();
			
			newFilter.Onc_cplan_id = this.Onc_cplan_id;
			newFilter.Pkey = this.Pkey;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Rhcp = this.Rhcp;
			newFilter.Rusr = this.Rusr;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Uhcp = this.Uhcp;
			newFilter.Uusr = this.Uusr;
			newFilter.Cdat = this.Cdat;
			newFilter.Ctim = this.Ctim;
			newFilter.Modu = this.Modu;
			newFilter.Ccs_epid = this.Ccs_epid;
			newFilter.Cp_active = this.Cp_active;
			newFilter.Tstp = this.Tstp;
			newFilter.Cp_dte = this.Cp_dte;
			newFilter.Cp_cons = this.Cp_cons;
			newFilter.Cp_agreeddt = this.Cp_agreeddt;
			newFilter.Cp_recurrind = this.Cp_recurrind;
			newFilter.Cp_intent = this.Cp_intent;
			newFilter.Cp_noanticatx = this.Cp_noanticatx;
			newFilter.Cp_assmdt = this.Cp_assmdt;
			newFilter.Cp_patagreed = this.Cp_patagreed;
			newFilter.Cp_notes = this.Cp_notes;
			newFilter.Cp_mdt_id = this.Cp_mdt_id;
			newFilter.Cp_other_trmts = this.Cp_other_trmts;
			newFilter.Cp_reason_change = this.Cp_reason_change;
			
			return newFilter;
		}
	}
	public final class Onc_cplanEditFilter
	{			
		public boolean IncludeOnc_cplan_id = true;
		public boolean IncludePkey = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeRhcp = true;
		public boolean IncludeRusr = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeUhcp = true;
		public boolean IncludeUusr = true;
		public boolean IncludeCdat = true;
		public boolean IncludeCtim = true;
		public boolean IncludeModu = true;
		public boolean IncludeCcs_epid = true;
		public boolean IncludeCp_active = true;
		public boolean IncludeTstp = true;
		public boolean IncludeCp_dte = true;
		public boolean IncludeCp_cons = true;
		public boolean IncludeCp_agreeddt = true;
		public boolean IncludeCp_recurrind = true;
		public boolean IncludeCp_intent = true;
		public boolean IncludeCp_noanticatx = true;
		public boolean IncludeCp_assmdt = true;
		public boolean IncludeCp_patagreed = true;
		public boolean IncludeCp_notes = true;
		public boolean IncludeCp_mdt_id = true;
		public boolean IncludeCp_other_trmts = true;
		public boolean IncludeCp_reason_change = true;
		
		public void includeAll()
		{				
			IncludeOnc_cplan_id = true;
			IncludePkey = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeRhcp = true;
			IncludeRusr = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeUhcp = true;
			IncludeUusr = true;
			IncludeCdat = true;
			IncludeCtim = true;
			IncludeModu = true;
			IncludeCcs_epid = true;
			IncludeCp_active = true;
			IncludeTstp = true;
			IncludeCp_dte = true;
			IncludeCp_cons = true;
			IncludeCp_agreeddt = true;
			IncludeCp_recurrind = true;
			IncludeCp_intent = true;
			IncludeCp_noanticatx = true;
			IncludeCp_assmdt = true;
			IncludeCp_patagreed = true;
			IncludeCp_notes = true;
			IncludeCp_mdt_id = true;
			IncludeCp_other_trmts = true;
			IncludeCp_reason_change = true;
		}	
		public void excludeAll()
		{				
			IncludeOnc_cplan_id = false;
			IncludePkey = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeRhcp = false;
			IncludeRusr = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeUhcp = false;
			IncludeUusr = false;
			IncludeCdat = false;
			IncludeCtim = false;
			IncludeModu = false;
			IncludeCcs_epid = false;
			IncludeCp_active = false;
			IncludeTstp = false;
			IncludeCp_dte = false;
			IncludeCp_cons = false;
			IncludeCp_agreeddt = false;
			IncludeCp_recurrind = false;
			IncludeCp_intent = false;
			IncludeCp_noanticatx = false;
			IncludeCp_assmdt = false;
			IncludeCp_patagreed = false;
			IncludeCp_notes = false;
			IncludeCp_mdt_id = false;
			IncludeCp_other_trmts = false;
			IncludeCp_reason_change = false;
		}
		public Onc_cplanEditFilter cloneObject()
		{
			Onc_cplanEditFilter newEditFilter = new Onc_cplanEditFilter();
			
			newEditFilter.IncludeOnc_cplan_id = this.IncludeOnc_cplan_id;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeRhcp = this.IncludeRhcp;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeUhcp = this.IncludeUhcp;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeModu = this.IncludeModu;
			newEditFilter.IncludeCcs_epid = this.IncludeCcs_epid;
			newEditFilter.IncludeCp_active = this.IncludeCp_active;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeCp_dte = this.IncludeCp_dte;
			newEditFilter.IncludeCp_cons = this.IncludeCp_cons;
			newEditFilter.IncludeCp_agreeddt = this.IncludeCp_agreeddt;
			newEditFilter.IncludeCp_recurrind = this.IncludeCp_recurrind;
			newEditFilter.IncludeCp_intent = this.IncludeCp_intent;
			newEditFilter.IncludeCp_noanticatx = this.IncludeCp_noanticatx;
			newEditFilter.IncludeCp_assmdt = this.IncludeCp_assmdt;
			newEditFilter.IncludeCp_patagreed = this.IncludeCp_patagreed;
			newEditFilter.IncludeCp_notes = this.IncludeCp_notes;
			newEditFilter.IncludeCp_mdt_id = this.IncludeCp_mdt_id;
			newEditFilter.IncludeCp_other_trmts = this.IncludeCp_other_trmts;
			newEditFilter.IncludeCp_reason_change = this.IncludeCp_reason_change;
			
			return newEditFilter;
		}
	}
}
