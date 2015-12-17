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
// Template ver. 1.1.2 - Last modified on 19/10/2005 13:00 by Barbara Worwood

package ims.dto.client;


import java.util.HashMap;

public final class Go_primtumstat implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Go_primtumstat.class);
	
	private Go_primtumstatFilter lastGetFilter = null;
	private final String serviceName = "GO_PRIMTUMSTAT";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Go_primtumstatFilter Filter = new Go_primtumstatFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Go_primtumstatEditFilter EditFilter = new Go_primtumstatEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Go_primtumstatCollection DataCollection = new Go_primtumstatCollection();

	/**
	 * Creates a new Go_primtumstat Data Transfer Object.
	 */ 
	public Go_primtumstat(ims.dto.Connection connection)
	{	
		this.Connection = connection;
	}
	/**
	 * Returns the last result data after an insert or an update call
	 */
	public ims.dto.ResultData getLastResultData()
	{
		return this.lastResultData;
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
	public Go_primtumstat cloneObject()
	{
		Go_primtumstat cloneObject = new Go_primtumstat(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Go_primtumstat = DataCollection.get(x).Go_primtumstat;
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
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Tgroup = DataCollection.get(x).Tgroup;
			cloneObject.DataCollection.get(index).Fbenign = DataCollection.get(x).Fbenign;
			cloneObject.DataCollection.get(index).Tsite = DataCollection.get(x).Tsite;
			cloneObject.DataCollection.get(index).Tstatus = DataCollection.get(x).Tstatus;
			cloneObject.DataCollection.get(index).Thist = DataCollection.get(x).Thist;
			cloneObject.DataCollection.get(index).Tidff = DataCollection.get(x).Tidff;
			cloneObject.DataCollection.get(index).Diag_dt = DataCollection.get(x).Diag_dt;
			cloneObject.DataCollection.get(index).End_date = DataCollection.get(x).End_date;
			cloneObject.DataCollection.get(index).Tpresstat = DataCollection.get(x).Tpresstat;
			cloneObject.DataCollection.get(index).Tlat = DataCollection.get(x).Tlat;
			cloneObject.DataCollection.get(index).Tstage = DataCollection.get(x).Tstage;
			cloneObject.DataCollection.get(index).Tcert = DataCollection.get(x).Tcert;
			cloneObject.DataCollection.get(index).Mstage = DataCollection.get(x).Mstage;
			cloneObject.DataCollection.get(index).Mcert = DataCollection.get(x).Mcert;
			cloneObject.DataCollection.get(index).Nstage = DataCollection.get(x).Nstage;
			cloneObject.DataCollection.get(index).Ncert = DataCollection.get(x).Ncert;
			cloneObject.DataCollection.get(index).Ostage = DataCollection.get(x).Ostage;
			cloneObject.DataCollection.get(index).S_smll_cell = DataCollection.get(x).S_smll_cell;
			cloneObject.DataCollection.get(index).S_figo = DataCollection.get(x).S_figo;
			cloneObject.DataCollection.get(index).S_dukes = DataCollection.get(x).S_dukes;
			cloneObject.DataCollection.get(index).S_lym = DataCollection.get(x).S_lym;
			cloneObject.DataCollection.get(index).Sym_lym = DataCollection.get(x).Sym_lym;
			cloneObject.DataCollection.get(index).S_lym_lens = DataCollection.get(x).S_lym_lens;
			cloneObject.DataCollection.get(index).S_lym_mens = DataCollection.get(x).S_lym_mens;
			cloneObject.DataCollection.get(index).S_lym_ldh = DataCollection.get(x).S_lym_ldh;
			cloneObject.DataCollection.get(index).G_btum = DataCollection.get(x).G_btum;
			cloneObject.DataCollection.get(index).S_germc = DataCollection.get(x).S_germc;
			cloneObject.DataCollection.get(index).P_germc = DataCollection.get(x).P_germc;
			cloneObject.DataCollection.get(index).S_leuk = DataCollection.get(x).S_leuk;
			cloneObject.DataCollection.get(index).Cspell = DataCollection.get(x).Cspell;
			cloneObject.DataCollection.get(index).O45f = DataCollection.get(x).O45f;
			cloneObject.DataCollection.get(index).Tgrouptxt = DataCollection.get(x).Tgrouptxt;
			cloneObject.DataCollection.get(index).Cshisttxt = DataCollection.get(x).Cshisttxt;
			cloneObject.DataCollection.get(index).Tsitetxt = DataCollection.get(x).Tsitetxt;
			cloneObject.DataCollection.get(index).Tlattxt = DataCollection.get(x).Tlattxt;
			cloneObject.DataCollection.get(index).Basofdiag = DataCollection.get(x).Basofdiag;
			cloneObject.DataCollection.get(index).Histosrce = DataCollection.get(x).Histosrce;
			cloneObject.DataCollection.get(index).Diffsrce = DataCollection.get(x).Diffsrce;
			cloneObject.DataCollection.get(index).Oapathstge = DataCollection.get(x).Oapathstge;
			cloneObject.DataCollection.get(index).Curr_record = DataCollection.get(x).Curr_record;
			cloneObject.DataCollection.get(index).Tdifftxt = DataCollection.get(x).Tdifftxt;
			cloneObject.DataCollection.get(index).Tstagetxt = DataCollection.get(x).Tstagetxt;
			cloneObject.DataCollection.get(index).Nstagetxt = DataCollection.get(x).Nstagetxt;
			cloneObject.DataCollection.get(index).Mstagetxt = DataCollection.get(x).Mstagetxt;
			cloneObject.DataCollection.get(index).S_smll_celltxt = DataCollection.get(x).S_smll_celltxt;
			cloneObject.DataCollection.get(index).Diag_icd = DataCollection.get(x).Diag_icd;
							
			
			for(int iSeqno = 0; iSeqno < DataCollection.get(x).SeqnoCollection.count(); iSeqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnoCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Seqno = DataCollection.get(x).SeqnoCollection.get(iSeqno).Seqno;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Site_rec = DataCollection.get(x).SeqnoCollection.get(iSeqno).Site_rec;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Dt_rec = DataCollection.get(x).SeqnoCollection.get(iSeqno).Dt_rec;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Active_rec = DataCollection.get(x).SeqnoCollection.get(iSeqno).Active_rec;
										
			}
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.6.92.4 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Go_primtumstat.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_primtumstat.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Go_primtumstat.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_primtumstat.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_primtumstat.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_primtumstat.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Go_primtumstat.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Go_primtumstat.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_primtumstat.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Go_primtumstat.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Go_primtumstat.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Go_primtumstat.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Go_primtumstat.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Go_primtumstat.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_primtumstat.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Go_primtumstat.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Go_primtumstat.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Go_primtumstat.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Go_primtumstat.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Go_primtumstat.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_primtumstat.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Go_primtumstat.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Go_primtumstat.TransferData");
			
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
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_primtumstat.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Go_primtumstat.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Go_primtumstat.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Go_primtumstat.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Go_primtumstat nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Go_primtumstat After NextList ");
				
		decodeNASMessage();		
		logger.debug("Go_primtumstat After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_primtumstat.List");
							
		listInProgress = true;	
		logger.debug("Go_primtumstat Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Go_primtumstat After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Go_primtumstat After Parse Message");
		
						
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
	private String encodeNASFilter(Go_primtumstatFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Go_primtumstat != null && filter.Go_primtumstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GO_PRIMTUMSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Go_primtumstat);
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey);
		}
		
		if(Filter.Rdat != null && filter.Rdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rdat);
		}
		
		if(Filter.Rtim != null && filter.Rtim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rtim);
		}
		
		if(Filter.Rhcp != null && filter.Rhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rhcp);
		}
		
		if(Filter.Rusr != null && filter.Rusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusr);
		}
		
		if(Filter.Udat != null && filter.Udat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Udat);
		}
		
		if(Filter.Utim != null && filter.Utim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Utim);
		}
		
		if(Filter.Uhcp != null && filter.Uhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uhcp);
		}
		
		if(Filter.Uusr != null && filter.Uusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uusr);
		}
		
		if(Filter.Cdat != null && filter.Cdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cdat);
		}
		
		if(Filter.Ctim != null && filter.Ctim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ctim);
		}
		
		if(Filter.Modu != null && filter.Modu.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modu);
		}
		
		if(Filter.Ccs_epid != null && filter.Ccs_epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccs_epid);
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
		}
		
		if(Filter.Tgroup != null && filter.Tgroup.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TGROUP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tgroup);
		}
		
		if(Filter.Fbenign != null && filter.Fbenign.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FBENIGN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fbenign);
		}
		
		if(Filter.Tsite != null && filter.Tsite.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tsite);
		}
		
		if(Filter.Tstatus != null && filter.Tstatus.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstatus);
		}
		
		if(Filter.Thist != null && filter.Thist.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("THIST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Thist);
		}
		
		if(Filter.Tidff != null && filter.Tidff.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TIDFF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tidff);
		}
		
		if(Filter.Diag_dt != null && filter.Diag_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DIAG_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Diag_dt);
		}
		
		if(Filter.End_date != null && filter.End_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("END_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.End_date);
		}
		
		if(Filter.Tpresstat != null && filter.Tpresstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TPRESSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tpresstat);
		}
		
		if(Filter.Tlat != null && filter.Tlat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TLAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tlat);
		}
		
		if(Filter.Tstage != null && filter.Tstage.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstage);
		}
		
		if(Filter.Tcert != null && filter.Tcert.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TCERT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tcert);
		}
		
		if(Filter.Mstage != null && filter.Mstage.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MSTAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mstage);
		}
		
		if(Filter.Mcert != null && filter.Mcert.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MCERT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mcert);
		}
		
		if(Filter.Nstage != null && filter.Nstage.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NSTAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nstage);
		}
		
		if(Filter.Ncert != null && filter.Ncert.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NCERT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ncert);
		}
		
		if(Filter.Ostage != null && filter.Ostage.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OSTAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ostage);
		}
		
		if(Filter.S_smll_cell != null && filter.S_smll_cell.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("S_SMLL_CELL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.S_smll_cell);
		}
		
		if(Filter.S_figo != null && filter.S_figo.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("S_FIGO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.S_figo);
		}
		
		if(Filter.S_dukes != null && filter.S_dukes.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("S_DUKES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.S_dukes);
		}
		
		if(Filter.S_lym != null && filter.S_lym.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("S_LYM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.S_lym);
		}
		
		if(Filter.Sym_lym != null && filter.Sym_lym.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SYM_LYM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sym_lym);
		}
		
		if(Filter.S_lym_lens != null && filter.S_lym_lens.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("S_LYM_LENS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.S_lym_lens);
		}
		
		if(Filter.S_lym_mens != null && filter.S_lym_mens.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("S_LYM_MENS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.S_lym_mens);
		}
		
		if(Filter.S_lym_ldh != null && filter.S_lym_ldh.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("S_LYM_LDH" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.S_lym_ldh);
		}
		
		if(Filter.G_btum != null && filter.G_btum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("G_BTUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.G_btum);
		}
		
		if(Filter.S_germc != null && filter.S_germc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("S_GERMC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.S_germc);
		}
		
		if(Filter.P_germc != null && filter.P_germc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("P_GERMC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.P_germc);
		}
		
		if(Filter.S_leuk != null && filter.S_leuk.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("S_LEUK" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.S_leuk);
		}
		
		if(Filter.Cspell != null && filter.Cspell.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CSPELL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cspell);
		}
		
		if(Filter.O45f != null && filter.O45f.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("O45F" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.O45f);
		}
		
		if(Filter.Tgrouptxt != null && filter.Tgrouptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TGROUPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tgrouptxt);
		}
		
		if(Filter.Cshisttxt != null && filter.Cshisttxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CSHISTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cshisttxt);
		}
		
		if(Filter.Tsitetxt != null && filter.Tsitetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSITETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tsitetxt);
		}
		
		if(Filter.Tlattxt != null && filter.Tlattxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TLATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tlattxt);
		}
		
		if(Filter.Basofdiag != null && filter.Basofdiag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("BASOFDIAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Basofdiag);
		}
		
		if(Filter.Histosrce != null && filter.Histosrce.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HISTOSRCE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Histosrce);
		}
		
		if(Filter.Diffsrce != null && filter.Diffsrce.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DIFFSRCE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Diffsrce);
		}
		
		if(Filter.Oapathstge != null && filter.Oapathstge.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OAPATHSTGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Oapathstge);
		}
		
		if(Filter.Curr_record != null && filter.Curr_record.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CURR_RECORD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Curr_record);
		}
		
		if(Filter.Tdifftxt != null && filter.Tdifftxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TDIFFTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tdifftxt);
		}
		
		if(Filter.Tstagetxt != null && filter.Tstagetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTAGETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstagetxt);
		}
		
		if(Filter.Nstagetxt != null && filter.Nstagetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NSTAGETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nstagetxt);
		}
		
		if(Filter.Mstagetxt != null && filter.Mstagetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MSTAGETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mstagetxt);
		}
		
		if(Filter.S_smll_celltxt != null && filter.S_smll_celltxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("S_SMLL_CELLTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.S_smll_celltxt);
		}
		
		if(Filter.Diag_icd != null && filter.Diag_icd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DIAG_ICD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Diag_icd);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Go_primtumstatRecord data = (Go_primtumstatRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeGo_primtumstat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GO_PRIMTUMSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Go_primtumstat));
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey));
		}
		
		if(EditFilter.IncludeRdat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rdat));
		}
		
		if(EditFilter.IncludeRtim)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rtim));
		}
		
		if(EditFilter.IncludeRhcp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rhcp));
		}
		
		if(EditFilter.IncludeRusr)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusr));
		}
		
		if(EditFilter.IncludeUdat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Udat));
		}
		
		if(EditFilter.IncludeUtim)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Utim));
		}
		
		if(EditFilter.IncludeUhcp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uhcp));
		}
		
		if(EditFilter.IncludeUusr)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uusr));
		}
		
		if(EditFilter.IncludeCdat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cdat));
		}
		
		if(EditFilter.IncludeCtim)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ctim));
		}
		
		if(EditFilter.IncludeModu)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modu));
		}
		
		if(EditFilter.IncludeCcs_epid)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccs_epid));
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
		}
		
		if(EditFilter.IncludeTgroup)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TGROUP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tgroup));
		}
		
		if(EditFilter.IncludeFbenign)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FBENIGN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fbenign));
		}
		
		if(EditFilter.IncludeTsite)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tsite));
		}
		
		if(EditFilter.IncludeTstatus)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstatus));
		}
		
		if(EditFilter.IncludeThist)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("THIST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Thist));
		}
		
		if(EditFilter.IncludeTidff)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TIDFF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tidff));
		}
		
		if(EditFilter.IncludeDiag_dt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DIAG_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Diag_dt));
		}
		
		if(EditFilter.IncludeEnd_date)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("END_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.End_date));
		}
		
		if(EditFilter.IncludeTpresstat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TPRESSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tpresstat));
		}
		
		if(EditFilter.IncludeTlat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TLAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tlat));
		}
		
		if(EditFilter.IncludeTstage)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstage));
		}
		
		if(EditFilter.IncludeTcert)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TCERT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tcert));
		}
		
		if(EditFilter.IncludeMstage)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MSTAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mstage));
		}
		
		if(EditFilter.IncludeMcert)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MCERT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mcert));
		}
		
		if(EditFilter.IncludeNstage)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NSTAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nstage));
		}
		
		if(EditFilter.IncludeNcert)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NCERT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ncert));
		}
		
		if(EditFilter.IncludeOstage)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OSTAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ostage));
		}
		
		if(EditFilter.IncludeS_smll_cell)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("S_SMLL_CELL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.S_smll_cell));
		}
		
		if(EditFilter.IncludeS_figo)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("S_FIGO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.S_figo));
		}
		
		if(EditFilter.IncludeS_dukes)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("S_DUKES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.S_dukes));
		}
		
		if(EditFilter.IncludeS_lym)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("S_LYM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.S_lym));
		}
		
		if(EditFilter.IncludeSym_lym)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SYM_LYM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sym_lym));
		}
		
		if(EditFilter.IncludeS_lym_lens)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("S_LYM_LENS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.S_lym_lens));
		}
		
		if(EditFilter.IncludeS_lym_mens)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("S_LYM_MENS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.S_lym_mens));
		}
		
		if(EditFilter.IncludeS_lym_ldh)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("S_LYM_LDH" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.S_lym_ldh));
		}
		
		if(EditFilter.IncludeG_btum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("G_BTUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.G_btum));
		}
		
		if(EditFilter.IncludeS_germc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("S_GERMC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.S_germc));
		}
		
		if(EditFilter.IncludeP_germc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("P_GERMC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.P_germc));
		}
		
		if(EditFilter.IncludeS_leuk)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("S_LEUK" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.S_leuk));
		}
		
		if(EditFilter.IncludeCspell)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CSPELL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cspell));
		}
		
		if(EditFilter.IncludeO45f)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("O45F" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.O45f));
		}
		
		if(EditFilter.IncludeTgrouptxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TGROUPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tgrouptxt));
		}
		
		if(EditFilter.IncludeCshisttxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CSHISTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cshisttxt));
		}
		
		if(EditFilter.IncludeTsitetxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSITETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tsitetxt));
		}
		
		if(EditFilter.IncludeTlattxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TLATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tlattxt));
		}
		
		if(EditFilter.IncludeBasofdiag)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("BASOFDIAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Basofdiag));
		}
		
		if(EditFilter.IncludeHistosrce)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HISTOSRCE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Histosrce));
		}
		
		if(EditFilter.IncludeDiffsrce)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DIFFSRCE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Diffsrce));
		}
		
		if(EditFilter.IncludeOapathstge)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OAPATHSTGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Oapathstge));
		}
		
		if(EditFilter.IncludeCurr_record)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CURR_RECORD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Curr_record));
		}
		
		if(EditFilter.IncludeTdifftxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TDIFFTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tdifftxt));
		}
		
		if(EditFilter.IncludeTstagetxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTAGETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstagetxt));
		}
		
		if(EditFilter.IncludeNstagetxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NSTAGETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nstagetxt));
		}
		
		if(EditFilter.IncludeMstagetxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MSTAGETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mstagetxt));
		}
		
		if(EditFilter.IncludeS_smll_celltxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("S_SMLL_CELLTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.S_smll_celltxt));
		}
		
		if(EditFilter.IncludeDiag_icd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DIAG_ICD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Diag_icd));
		}
		
		
		for(int x = 0; x < data.SeqnoCollection.count(); x++)
		{
			Go_primtumstatSeqnoRecord rgRecord = (Go_primtumstatSeqnoRecord)data.SeqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SITE_REC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Site_rec));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DT_REC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Dt_rec));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIVE_REC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Active_rec));
			
		}
			
		return dataString.toString();	
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
			Go_primtumstatRecord record = new Go_primtumstatRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Go_primtumstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_PRIMTUMSTAT"));
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
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Tgroup = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TGROUP"));
			record.Fbenign = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FBENIGN"));
			record.Tsite = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSITE"));
			record.Tstatus = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTATUS"));
			record.Thist = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "THIST"));
			record.Tidff = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TIDFF"));
			record.Diag_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAG_DT"));
			record.End_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "END_DATE"));
			record.Tpresstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TPRESSTAT"));
			record.Tlat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TLAT"));
			record.Tstage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTAGE"));
			record.Tcert = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TCERT"));
			record.Mstage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSTAGE"));
			record.Mcert = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MCERT"));
			record.Nstage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NSTAGE"));
			record.Ncert = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NCERT"));
			record.Ostage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OSTAGE"));
			record.S_smll_cell = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_SMLL_CELL"));
			record.S_figo = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_FIGO"));
			record.S_dukes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_DUKES"));
			record.S_lym = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_LYM"));
			record.Sym_lym = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYM_LYM"));
			record.S_lym_lens = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_LYM_LENS"));
			record.S_lym_mens = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_LYM_MENS"));
			record.S_lym_ldh = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_LYM_LDH"));
			record.G_btum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "G_BTUM"));
			record.S_germc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_GERMC"));
			record.P_germc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "P_GERMC"));
			record.S_leuk = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_LEUK"));
			record.Cspell = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CSPELL"));
			record.O45f = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "O45F"));
			record.Tgrouptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TGROUPTXT"));
			record.Cshisttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CSHISTTXT"));
			record.Tsitetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSITETXT"));
			record.Tlattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TLATTXT"));
			record.Basofdiag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BASOFDIAG"));
			record.Histosrce = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTOSRCE"));
			record.Diffsrce = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIFFSRCE"));
			record.Oapathstge = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OAPATHSTGE"));
			record.Curr_record = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURR_RECORD"));
			record.Tdifftxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TDIFFTXT"));
			record.Tstagetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTAGETXT"));
			record.Nstagetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NSTAGETXT"));
			record.Mstagetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSTAGETXT"));
			record.S_smll_celltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_SMLL_CELLTXT"));
			record.Diag_icd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAG_ICD"));
									
			DataCollection.add(record);
		}	
		
		return records;
	}
	private void decodeResultData()
	{
		this.lastResultData = null;
		String[] items = Connection.getResponseItems(Connection.getValueAt(6));
		if(items == null)
			return;
		int records = items.length;
		if(records == 0)
			return;
		
		String[] valueItems = Connection.splitResponseItem(items[0]);
		
		this.lastResultData = new ims.dto.ResultData();
		String attName = "";
		for(int x = 0; x < valueItems.length; x++)
		{
			attName = Connection.getAttributeName(valueItems[x]);
			this.lastResultData.add(attName, Connection.getValueFor(valueItems, attName));
		}
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
			Go_primtumstatRecord record = new Go_primtumstatRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Go_primtumstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GO_PRIMTUMSTAT"));
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
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Tgroup = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TGROUP"));
			record.Fbenign = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FBENIGN"));
			record.Tsite = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSITE"));
			record.Tstatus = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTATUS"));
			record.Thist = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "THIST"));
			record.Tidff = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TIDFF"));
			record.Diag_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAG_DT"));
			record.End_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "END_DATE"));
			record.Tpresstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TPRESSTAT"));
			record.Tlat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TLAT"));
			record.Tstage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTAGE"));
			record.Tcert = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TCERT"));
			record.Mstage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSTAGE"));
			record.Mcert = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MCERT"));
			record.Nstage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NSTAGE"));
			record.Ncert = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NCERT"));
			record.Ostage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OSTAGE"));
			record.S_smll_cell = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_SMLL_CELL"));
			record.S_figo = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_FIGO"));
			record.S_dukes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_DUKES"));
			record.S_lym = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_LYM"));
			record.Sym_lym = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYM_LYM"));
			record.S_lym_lens = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_LYM_LENS"));
			record.S_lym_mens = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_LYM_MENS"));
			record.S_lym_ldh = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_LYM_LDH"));
			record.G_btum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "G_BTUM"));
			record.S_germc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_GERMC"));
			record.P_germc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "P_GERMC"));
			record.S_leuk = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_LEUK"));
			record.Cspell = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CSPELL"));
			record.O45f = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "O45F"));
			record.Tgrouptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TGROUPTXT"));
			record.Cshisttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CSHISTTXT"));
			record.Tsitetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSITETXT"));
			record.Tlattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TLATTXT"));
			record.Basofdiag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BASOFDIAG"));
			record.Histosrce = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTOSRCE"));
			record.Diffsrce = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIFFSRCE"));
			record.Oapathstge = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OAPATHSTGE"));
			record.Curr_record = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURR_RECORD"));
			record.Tdifftxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TDIFFTXT"));
			record.Tstagetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTAGETXT"));
			record.Nstagetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NSTAGETXT"));
			record.Mstagetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSTAGETXT"));
			record.S_smll_celltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "S_SMLL_CELLTXT"));
			record.Diag_icd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAG_ICD"));
									
			
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
						Go_primtumstatSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("site_rec"))
					{
						Go_primtumstatSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Site_rec = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("dt_rec"))
					{
						Go_primtumstatSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Dt_rec = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("active_rec"))
					{
						Go_primtumstatSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Active_rec = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Go_primtumstatCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Go_primtumstatRecord newRecord = new Go_primtumstatRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Go_primtumstatRecord record)
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
		public Go_primtumstatRecord get(int index)
		{
			return (Go_primtumstatRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Go_primtumstatRecord
	{
		public String Go_primtumstat = "";
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
		public String Tstp = "";
		public String Tgroup = "";
		public String Fbenign = "";
		public String Tsite = "";
		public String Tstatus = "";
		public String Thist = "";
		public String Tidff = "";
		public String Diag_dt = "";
		public String End_date = "";
		public String Tpresstat = "";
		public String Tlat = "";
		public String Tstage = "";
		public String Tcert = "";
		public String Mstage = "";
		public String Mcert = "";
		public String Nstage = "";
		public String Ncert = "";
		public String Ostage = "";
		public String S_smll_cell = "";
		public String S_figo = "";
		public String S_dukes = "";
		public String S_lym = "";
		public String Sym_lym = "";
		public String S_lym_lens = "";
		public String S_lym_mens = "";
		public String S_lym_ldh = "";
		public String G_btum = "";
		public String S_germc = "";
		public String P_germc = "";
		public String S_leuk = "";
		public String Cspell = "";
		public String O45f = "";
		public String Tgrouptxt = "";
		public String Cshisttxt = "";
		public String Tsitetxt = "";
		public String Tlattxt = "";
		public String Basofdiag = "";
		public String Histosrce = "";
		public String Diffsrce = "";
		public String Oapathstge = "";
		public String Curr_record = "";
		public String Tdifftxt = "";
		public String Tstagetxt = "";
		public String Nstagetxt = "";
		public String Mstagetxt = "";
		public String S_smll_celltxt = "";
		public String Diag_icd = "";
		
		public Go_primtumstatSeqnoCollection SeqnoCollection = new Go_primtumstatSeqnoCollection();		
		
		public void clear()
		{
			Go_primtumstat = "";
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
			Tstp = "";
			Tgroup = "";
			Fbenign = "";
			Tsite = "";
			Tstatus = "";
			Thist = "";
			Tidff = "";
			Diag_dt = "";
			End_date = "";
			Tpresstat = "";
			Tlat = "";
			Tstage = "";
			Tcert = "";
			Mstage = "";
			Mcert = "";
			Nstage = "";
			Ncert = "";
			Ostage = "";
			S_smll_cell = "";
			S_figo = "";
			S_dukes = "";
			S_lym = "";
			Sym_lym = "";
			S_lym_lens = "";
			S_lym_mens = "";
			S_lym_ldh = "";
			G_btum = "";
			S_germc = "";
			P_germc = "";
			S_leuk = "";
			Cspell = "";
			O45f = "";
			Tgrouptxt = "";
			Cshisttxt = "";
			Tsitetxt = "";
			Tlattxt = "";
			Basofdiag = "";
			Histosrce = "";
			Diffsrce = "";
			Oapathstge = "";
			Curr_record = "";
			Tdifftxt = "";
			Tstagetxt = "";
			Nstagetxt = "";
			Mstagetxt = "";
			S_smll_celltxt = "";
			Diag_icd = "";
			
			SeqnoCollection.clear();
		}		
	}
	
	public final class Go_primtumstatSeqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Go_primtumstatSeqnoRecord newRecord = new Go_primtumstatSeqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Go_primtumstatSeqnoRecord record)
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
		public Go_primtumstatSeqnoRecord get(int index)
		{
			return (Go_primtumstatSeqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Go_primtumstatSeqnoRecord
	{
		public String Seqno = "";
		public String Site_rec = "";
		public String Dt_rec = "";
		public String Active_rec = "";
		
		public void clear()
		{
			Seqno = "";
			Site_rec = "";
			Dt_rec = "";
			Active_rec = "";
			
		}
	}	
	public final class Go_primtumstatFilter
	{			
		public String Go_primtumstat = "";
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
		public String Tstp = "";
		public String Tgroup = "";
		public String Fbenign = "";
		public String Tsite = "";
		public String Tstatus = "";
		public String Thist = "";
		public String Tidff = "";
		public String Diag_dt = "";
		public String End_date = "";
		public String Tpresstat = "";
		public String Tlat = "";
		public String Tstage = "";
		public String Tcert = "";
		public String Mstage = "";
		public String Mcert = "";
		public String Nstage = "";
		public String Ncert = "";
		public String Ostage = "";
		public String S_smll_cell = "";
		public String S_figo = "";
		public String S_dukes = "";
		public String S_lym = "";
		public String Sym_lym = "";
		public String S_lym_lens = "";
		public String S_lym_mens = "";
		public String S_lym_ldh = "";
		public String G_btum = "";
		public String S_germc = "";
		public String P_germc = "";
		public String S_leuk = "";
		public String Cspell = "";
		public String O45f = "";
		public String Tgrouptxt = "";
		public String Cshisttxt = "";
		public String Tsitetxt = "";
		public String Tlattxt = "";
		public String Basofdiag = "";
		public String Histosrce = "";
		public String Diffsrce = "";
		public String Oapathstge = "";
		public String Curr_record = "";
		public String Tdifftxt = "";
		public String Tstagetxt = "";
		public String Nstagetxt = "";
		public String Mstagetxt = "";
		public String S_smll_celltxt = "";
		public String Diag_icd = "";
		
		public void clear()
		{				
			Go_primtumstat = "";
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
			Tstp = "";
			Tgroup = "";
			Fbenign = "";
			Tsite = "";
			Tstatus = "";
			Thist = "";
			Tidff = "";
			Diag_dt = "";
			End_date = "";
			Tpresstat = "";
			Tlat = "";
			Tstage = "";
			Tcert = "";
			Mstage = "";
			Mcert = "";
			Nstage = "";
			Ncert = "";
			Ostage = "";
			S_smll_cell = "";
			S_figo = "";
			S_dukes = "";
			S_lym = "";
			Sym_lym = "";
			S_lym_lens = "";
			S_lym_mens = "";
			S_lym_ldh = "";
			G_btum = "";
			S_germc = "";
			P_germc = "";
			S_leuk = "";
			Cspell = "";
			O45f = "";
			Tgrouptxt = "";
			Cshisttxt = "";
			Tsitetxt = "";
			Tlattxt = "";
			Basofdiag = "";
			Histosrce = "";
			Diffsrce = "";
			Oapathstge = "";
			Curr_record = "";
			Tdifftxt = "";
			Tstagetxt = "";
			Nstagetxt = "";
			Mstagetxt = "";
			S_smll_celltxt = "";
			Diag_icd = "";
		}	
		public Go_primtumstatFilter cloneObject()
		{
			Go_primtumstatFilter newFilter = new Go_primtumstatFilter();
			
			newFilter.Go_primtumstat = this.Go_primtumstat;
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
			newFilter.Tstp = this.Tstp;
			newFilter.Tgroup = this.Tgroup;
			newFilter.Fbenign = this.Fbenign;
			newFilter.Tsite = this.Tsite;
			newFilter.Tstatus = this.Tstatus;
			newFilter.Thist = this.Thist;
			newFilter.Tidff = this.Tidff;
			newFilter.Diag_dt = this.Diag_dt;
			newFilter.End_date = this.End_date;
			newFilter.Tpresstat = this.Tpresstat;
			newFilter.Tlat = this.Tlat;
			newFilter.Tstage = this.Tstage;
			newFilter.Tcert = this.Tcert;
			newFilter.Mstage = this.Mstage;
			newFilter.Mcert = this.Mcert;
			newFilter.Nstage = this.Nstage;
			newFilter.Ncert = this.Ncert;
			newFilter.Ostage = this.Ostage;
			newFilter.S_smll_cell = this.S_smll_cell;
			newFilter.S_figo = this.S_figo;
			newFilter.S_dukes = this.S_dukes;
			newFilter.S_lym = this.S_lym;
			newFilter.Sym_lym = this.Sym_lym;
			newFilter.S_lym_lens = this.S_lym_lens;
			newFilter.S_lym_mens = this.S_lym_mens;
			newFilter.S_lym_ldh = this.S_lym_ldh;
			newFilter.G_btum = this.G_btum;
			newFilter.S_germc = this.S_germc;
			newFilter.P_germc = this.P_germc;
			newFilter.S_leuk = this.S_leuk;
			newFilter.Cspell = this.Cspell;
			newFilter.O45f = this.O45f;
			newFilter.Tgrouptxt = this.Tgrouptxt;
			newFilter.Cshisttxt = this.Cshisttxt;
			newFilter.Tsitetxt = this.Tsitetxt;
			newFilter.Tlattxt = this.Tlattxt;
			newFilter.Basofdiag = this.Basofdiag;
			newFilter.Histosrce = this.Histosrce;
			newFilter.Diffsrce = this.Diffsrce;
			newFilter.Oapathstge = this.Oapathstge;
			newFilter.Curr_record = this.Curr_record;
			newFilter.Tdifftxt = this.Tdifftxt;
			newFilter.Tstagetxt = this.Tstagetxt;
			newFilter.Nstagetxt = this.Nstagetxt;
			newFilter.Mstagetxt = this.Mstagetxt;
			newFilter.S_smll_celltxt = this.S_smll_celltxt;
			newFilter.Diag_icd = this.Diag_icd;
			
			return newFilter;
		}
	}
	public final class Go_primtumstatEditFilter
	{			
		public boolean IncludeGo_primtumstat = true;
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
		public boolean IncludeTstp = true;
		public boolean IncludeTgroup = true;
		public boolean IncludeFbenign = true;
		public boolean IncludeTsite = true;
		public boolean IncludeTstatus = true;
		public boolean IncludeThist = true;
		public boolean IncludeTidff = true;
		public boolean IncludeDiag_dt = true;
		public boolean IncludeEnd_date = true;
		public boolean IncludeTpresstat = true;
		public boolean IncludeTlat = true;
		public boolean IncludeTstage = true;
		public boolean IncludeTcert = true;
		public boolean IncludeMstage = true;
		public boolean IncludeMcert = true;
		public boolean IncludeNstage = true;
		public boolean IncludeNcert = true;
		public boolean IncludeOstage = true;
		public boolean IncludeS_smll_cell = true;
		public boolean IncludeS_figo = true;
		public boolean IncludeS_dukes = true;
		public boolean IncludeS_lym = true;
		public boolean IncludeSym_lym = true;
		public boolean IncludeS_lym_lens = true;
		public boolean IncludeS_lym_mens = true;
		public boolean IncludeS_lym_ldh = true;
		public boolean IncludeG_btum = true;
		public boolean IncludeS_germc = true;
		public boolean IncludeP_germc = true;
		public boolean IncludeS_leuk = true;
		public boolean IncludeCspell = true;
		public boolean IncludeO45f = true;
		public boolean IncludeTgrouptxt = true;
		public boolean IncludeCshisttxt = true;
		public boolean IncludeTsitetxt = true;
		public boolean IncludeTlattxt = true;
		public boolean IncludeBasofdiag = true;
		public boolean IncludeHistosrce = true;
		public boolean IncludeDiffsrce = true;
		public boolean IncludeOapathstge = true;
		public boolean IncludeCurr_record = true;
		public boolean IncludeTdifftxt = true;
		public boolean IncludeTstagetxt = true;
		public boolean IncludeNstagetxt = true;
		public boolean IncludeMstagetxt = true;
		public boolean IncludeS_smll_celltxt = true;
		public boolean IncludeDiag_icd = true;
		
		public void includeAll()
		{				
			IncludeGo_primtumstat = true;
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
			IncludeTstp = true;
			IncludeTgroup = true;
			IncludeFbenign = true;
			IncludeTsite = true;
			IncludeTstatus = true;
			IncludeThist = true;
			IncludeTidff = true;
			IncludeDiag_dt = true;
			IncludeEnd_date = true;
			IncludeTpresstat = true;
			IncludeTlat = true;
			IncludeTstage = true;
			IncludeTcert = true;
			IncludeMstage = true;
			IncludeMcert = true;
			IncludeNstage = true;
			IncludeNcert = true;
			IncludeOstage = true;
			IncludeS_smll_cell = true;
			IncludeS_figo = true;
			IncludeS_dukes = true;
			IncludeS_lym = true;
			IncludeSym_lym = true;
			IncludeS_lym_lens = true;
			IncludeS_lym_mens = true;
			IncludeS_lym_ldh = true;
			IncludeG_btum = true;
			IncludeS_germc = true;
			IncludeP_germc = true;
			IncludeS_leuk = true;
			IncludeCspell = true;
			IncludeO45f = true;
			IncludeTgrouptxt = true;
			IncludeCshisttxt = true;
			IncludeTsitetxt = true;
			IncludeTlattxt = true;
			IncludeBasofdiag = true;
			IncludeHistosrce = true;
			IncludeDiffsrce = true;
			IncludeOapathstge = true;
			IncludeCurr_record = true;
			IncludeTdifftxt = true;
			IncludeTstagetxt = true;
			IncludeNstagetxt = true;
			IncludeMstagetxt = true;
			IncludeS_smll_celltxt = true;
			IncludeDiag_icd = true;
		}	
		public void excludeAll()
		{				
			IncludeGo_primtumstat = false;
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
			IncludeTstp = false;
			IncludeTgroup = false;
			IncludeFbenign = false;
			IncludeTsite = false;
			IncludeTstatus = false;
			IncludeThist = false;
			IncludeTidff = false;
			IncludeDiag_dt = false;
			IncludeEnd_date = false;
			IncludeTpresstat = false;
			IncludeTlat = false;
			IncludeTstage = false;
			IncludeTcert = false;
			IncludeMstage = false;
			IncludeMcert = false;
			IncludeNstage = false;
			IncludeNcert = false;
			IncludeOstage = false;
			IncludeS_smll_cell = false;
			IncludeS_figo = false;
			IncludeS_dukes = false;
			IncludeS_lym = false;
			IncludeSym_lym = false;
			IncludeS_lym_lens = false;
			IncludeS_lym_mens = false;
			IncludeS_lym_ldh = false;
			IncludeG_btum = false;
			IncludeS_germc = false;
			IncludeP_germc = false;
			IncludeS_leuk = false;
			IncludeCspell = false;
			IncludeO45f = false;
			IncludeTgrouptxt = false;
			IncludeCshisttxt = false;
			IncludeTsitetxt = false;
			IncludeTlattxt = false;
			IncludeBasofdiag = false;
			IncludeHistosrce = false;
			IncludeDiffsrce = false;
			IncludeOapathstge = false;
			IncludeCurr_record = false;
			IncludeTdifftxt = false;
			IncludeTstagetxt = false;
			IncludeNstagetxt = false;
			IncludeMstagetxt = false;
			IncludeS_smll_celltxt = false;
			IncludeDiag_icd = false;
		}
		public Go_primtumstatEditFilter cloneObject()
		{
			Go_primtumstatEditFilter newEditFilter = new Go_primtumstatEditFilter();
			
			newEditFilter.IncludeGo_primtumstat = this.IncludeGo_primtumstat;
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
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeTgroup = this.IncludeTgroup;
			newEditFilter.IncludeFbenign = this.IncludeFbenign;
			newEditFilter.IncludeTsite = this.IncludeTsite;
			newEditFilter.IncludeTstatus = this.IncludeTstatus;
			newEditFilter.IncludeThist = this.IncludeThist;
			newEditFilter.IncludeTidff = this.IncludeTidff;
			newEditFilter.IncludeDiag_dt = this.IncludeDiag_dt;
			newEditFilter.IncludeEnd_date = this.IncludeEnd_date;
			newEditFilter.IncludeTpresstat = this.IncludeTpresstat;
			newEditFilter.IncludeTlat = this.IncludeTlat;
			newEditFilter.IncludeTstage = this.IncludeTstage;
			newEditFilter.IncludeTcert = this.IncludeTcert;
			newEditFilter.IncludeMstage = this.IncludeMstage;
			newEditFilter.IncludeMcert = this.IncludeMcert;
			newEditFilter.IncludeNstage = this.IncludeNstage;
			newEditFilter.IncludeNcert = this.IncludeNcert;
			newEditFilter.IncludeOstage = this.IncludeOstage;
			newEditFilter.IncludeS_smll_cell = this.IncludeS_smll_cell;
			newEditFilter.IncludeS_figo = this.IncludeS_figo;
			newEditFilter.IncludeS_dukes = this.IncludeS_dukes;
			newEditFilter.IncludeS_lym = this.IncludeS_lym;
			newEditFilter.IncludeSym_lym = this.IncludeSym_lym;
			newEditFilter.IncludeS_lym_lens = this.IncludeS_lym_lens;
			newEditFilter.IncludeS_lym_mens = this.IncludeS_lym_mens;
			newEditFilter.IncludeS_lym_ldh = this.IncludeS_lym_ldh;
			newEditFilter.IncludeG_btum = this.IncludeG_btum;
			newEditFilter.IncludeS_germc = this.IncludeS_germc;
			newEditFilter.IncludeP_germc = this.IncludeP_germc;
			newEditFilter.IncludeS_leuk = this.IncludeS_leuk;
			newEditFilter.IncludeCspell = this.IncludeCspell;
			newEditFilter.IncludeO45f = this.IncludeO45f;
			newEditFilter.IncludeTgrouptxt = this.IncludeTgrouptxt;
			newEditFilter.IncludeCshisttxt = this.IncludeCshisttxt;
			newEditFilter.IncludeTsitetxt = this.IncludeTsitetxt;
			newEditFilter.IncludeTlattxt = this.IncludeTlattxt;
			newEditFilter.IncludeBasofdiag = this.IncludeBasofdiag;
			newEditFilter.IncludeHistosrce = this.IncludeHistosrce;
			newEditFilter.IncludeDiffsrce = this.IncludeDiffsrce;
			newEditFilter.IncludeOapathstge = this.IncludeOapathstge;
			newEditFilter.IncludeCurr_record = this.IncludeCurr_record;
			newEditFilter.IncludeTdifftxt = this.IncludeTdifftxt;
			newEditFilter.IncludeTstagetxt = this.IncludeTstagetxt;
			newEditFilter.IncludeNstagetxt = this.IncludeNstagetxt;
			newEditFilter.IncludeMstagetxt = this.IncludeMstagetxt;
			newEditFilter.IncludeS_smll_celltxt = this.IncludeS_smll_celltxt;
			newEditFilter.IncludeDiag_icd = this.IncludeDiag_icd;
			
			return newEditFilter;
		}
	}
}
