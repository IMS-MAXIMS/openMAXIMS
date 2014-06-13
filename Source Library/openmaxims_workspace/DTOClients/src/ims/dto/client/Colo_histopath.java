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

public final class Colo_histopath
{
	private Colo_histopathFilter lastGetFilter = null;
	private final String serviceName = "COLO_HISTOPATH";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Colo_histopathFilter Filter = new Colo_histopathFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Colo_histopathEditFilter EditFilter = new Colo_histopathEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Colo_histopathCollection DataCollection = new Colo_histopathCollection();

	/**
	 * Creates a new Colo_histopath Data Transfer Object.
	 */ 
	public Colo_histopath(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Colo_histopath cloneObject() throws ims.dto.Exception
	{
		Colo_histopath cloneObject = new Colo_histopath(Connection);
			
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
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rhcp = DataCollection.get(x).Rhcp;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Uhcp = DataCollection.get(x).Uhcp;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Modu = DataCollection.get(x).Modu;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Ccs_epid = DataCollection.get(x).Ccs_epid;
			cloneObject.DataCollection.get(index).Histo_spmn_unid = DataCollection.get(x).Histo_spmn_unid;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Reciept_dat = DataCollection.get(x).Reciept_dat;
			cloneObject.DataCollection.get(index).Report_dat = DataCollection.get(x).Report_dat;
			cloneObject.DataCollection.get(index).Report_num = DataCollection.get(x).Report_num;
			cloneObject.DataCollection.get(index).Pat_hcp = DataCollection.get(x).Pat_hcp;
			cloneObject.DataCollection.get(index).Cons_hcp = DataCollection.get(x).Cons_hcp;
			cloneObject.DataCollection.get(index).Site = DataCollection.get(x).Site;
			cloneObject.DataCollection.get(index).Max_diameter = DataCollection.get(x).Max_diameter;
			cloneObject.DataCollection.get(index).Nearest_margin = DataCollection.get(x).Nearest_margin;
			cloneObject.DataCollection.get(index).Tumour_perf = DataCollection.get(x).Tumour_perf;
			cloneObject.DataCollection.get(index).Peritoneal_refl = DataCollection.get(x).Peritoneal_refl;
			cloneObject.DataCollection.get(index).Dentate_line = DataCollection.get(x).Dentate_line;
			cloneObject.DataCollection.get(index).Histo_type = DataCollection.get(x).Histo_type;
			cloneObject.DataCollection.get(index).Histo_other = DataCollection.get(x).Histo_other;
			cloneObject.DataCollection.get(index).Histo_differ = DataCollection.get(x).Histo_differ;
			cloneObject.DataCollection.get(index).Histo_local_inv = DataCollection.get(x).Histo_local_inv;
			cloneObject.DataCollection.get(index).Histo_meas_cicr_m = DataCollection.get(x).Histo_meas_cicr_m;
			cloneObject.DataCollection.get(index).Meta_nodes_ex = DataCollection.get(x).Meta_nodes_ex;
			cloneObject.DataCollection.get(index).Meta_pos_nodes = DataCollection.get(x).Meta_pos_nodes;
			cloneObject.DataCollection.get(index).Meta_apical = DataCollection.get(x).Meta_apical;
			cloneObject.DataCollection.get(index).Meta_extramural = DataCollection.get(x).Meta_extramural;
			cloneObject.DataCollection.get(index).Notes = DataCollection.get(x).Notes;
			cloneObject.DataCollection.get(index).Resection = DataCollection.get(x).Resection;
			cloneObject.DataCollection.get(index).Liver_met = DataCollection.get(x).Liver_met;
			cloneObject.DataCollection.get(index).Path_t = DataCollection.get(x).Path_t;
			cloneObject.DataCollection.get(index).Path_n = DataCollection.get(x).Path_n;
			cloneObject.DataCollection.get(index).Path_m = DataCollection.get(x).Path_m;
			cloneObject.DataCollection.get(index).Path_ostage = DataCollection.get(x).Path_ostage;
			cloneObject.DataCollection.get(index).Pts_groupid = DataCollection.get(x).Pts_groupid;
			cloneObject.DataCollection.get(index).Pts_siteid = DataCollection.get(x).Pts_siteid;
			cloneObject.DataCollection.get(index).Prim_tum_stat_id = DataCollection.get(x).Prim_tum_stat_id;
							
			
			for(int iSeqno = 0; iSeqno < DataCollection.get(x).SeqnoCollection.count(); iSeqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnoCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Seqno = DataCollection.get(x).SeqnoCollection.get(iSeqno).Seqno;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Margin_finding = DataCollection.get(x).SeqnoCollection.get(iSeqno).Margin_finding;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Margin_no_na_yes = DataCollection.get(x).SeqnoCollection.get(iSeqno).Margin_no_na_yes;
										
			}
			
			for(int iSeqno1 = 0; iSeqno1 < DataCollection.get(x).Seqno1Collection.count(); iSeqno1++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno1Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno1Collection.get(rIndex).Seqno1 = DataCollection.get(x).Seqno1Collection.get(iSeqno1).Seqno1;
				cloneObject.DataCollection.get(index).Seqno1Collection.get(rIndex).Abn_id = DataCollection.get(x).Seqno1Collection.get(iSeqno1).Abn_id;
				cloneObject.DataCollection.get(index).Seqno1Collection.get(rIndex).Abn_pres_abs = DataCollection.get(x).Seqno1Collection.get(iSeqno1).Abn_pres_abs;
										
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
		return "Colo_histopath.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Colo_histopath.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Colo_histopath.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Colo_histopath.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Colo_histopath.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Colo_histopath.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Colo_histopath.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Colo_histopath.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Colo_histopath.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Colo_histopath.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Colo_histopath.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Colo_histopath.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Colo_histopath.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Colo_histopath.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Colo_histopath.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Colo_histopath.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Colo_histopath.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Colo_histopath.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Colo_histopath.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Colo_histopath.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Colo_histopath.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Colo_histopath.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Colo_histopath.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Colo_histopath.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Colo_histopath.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Colo_histopath.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Colo_histopath.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Colo_histopath.List");
							
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
	private String encodeNASFilter(Colo_histopathFilter filter)
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
		
		if(Filter.Rdat != null && filter.Rdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rdat;
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
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
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
		
		if(Filter.Histo_spmn_unid != null && filter.Histo_spmn_unid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HISTO_SPMN_UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Histo_spmn_unid;
		}
		
		if(Filter.Active != null && filter.Active.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Active;
		}
		
		if(Filter.Reciept_dat != null && filter.Reciept_dat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RECIEPT_DAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reciept_dat;
		}
		
		if(Filter.Report_dat != null && filter.Report_dat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REPORT_DAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Report_dat;
		}
		
		if(Filter.Report_num != null && filter.Report_num.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REPORT_NUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Report_num;
		}
		
		if(Filter.Pat_hcp != null && filter.Pat_hcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PAT_HCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pat_hcp;
		}
		
		if(Filter.Cons_hcp != null && filter.Cons_hcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONS_HCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cons_hcp;
		}
		
		if(Filter.Site != null && filter.Site.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Site;
		}
		
		if(Filter.Max_diameter != null && filter.Max_diameter.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAX_DIAMETER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Max_diameter;
		}
		
		if(Filter.Nearest_margin != null && filter.Nearest_margin.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NEAREST_MARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nearest_margin;
		}
		
		if(Filter.Tumour_perf != null && filter.Tumour_perf.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TUMOUR_PERF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tumour_perf;
		}
		
		if(Filter.Peritoneal_refl != null && filter.Peritoneal_refl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PERITONEAL_REFL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Peritoneal_refl;
		}
		
		if(Filter.Dentate_line != null && filter.Dentate_line.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DENTATE_LINE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dentate_line;
		}
		
		if(Filter.Histo_type != null && filter.Histo_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HISTO_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Histo_type;
		}
		
		if(Filter.Histo_other != null && filter.Histo_other.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HISTO_OTHER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Histo_other;
		}
		
		if(Filter.Histo_differ != null && filter.Histo_differ.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HISTO_DIFFER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Histo_differ;
		}
		
		if(Filter.Histo_local_inv != null && filter.Histo_local_inv.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HISTO_LOCAL_INV" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Histo_local_inv;
		}
		
		if(Filter.Histo_meas_cicr_m != null && filter.Histo_meas_cicr_m.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HISTO_MEAS_CICR_M" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Histo_meas_cicr_m;
		}
		
		if(Filter.Meta_nodes_ex != null && filter.Meta_nodes_ex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "META_NODES_EX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Meta_nodes_ex;
		}
		
		if(Filter.Meta_pos_nodes != null && filter.Meta_pos_nodes.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "META_POS_NODES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Meta_pos_nodes;
		}
		
		if(Filter.Meta_apical != null && filter.Meta_apical.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "META_APICAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Meta_apical;
		}
		
		if(Filter.Meta_extramural != null && filter.Meta_extramural.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "META_EXTRAMURAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Meta_extramural;
		}
		
		if(Filter.Notes != null && filter.Notes.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NOTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Notes;
		}
		
		if(Filter.Resection != null && filter.Resection.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESECTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resection;
		}
		
		if(Filter.Liver_met != null && filter.Liver_met.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LIVER_MET" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Liver_met;
		}
		
		if(Filter.Path_t != null && filter.Path_t.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PATH_T" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Path_t;
		}
		
		if(Filter.Path_n != null && filter.Path_n.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PATH_N" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Path_n;
		}
		
		if(Filter.Path_m != null && filter.Path_m.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PATH_M" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Path_m;
		}
		
		if(Filter.Path_ostage != null && filter.Path_ostage.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PATH_OSTAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Path_ostage;
		}
		
		if(Filter.Pts_groupid != null && filter.Pts_groupid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PTS_GROUPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pts_groupid;
		}
		
		if(Filter.Pts_siteid != null && filter.Pts_siteid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PTS_SITEID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pts_siteid;
		}
		
		if(Filter.Prim_tum_stat_id != null && filter.Prim_tum_stat_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PRIM_TUM_STAT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prim_tum_stat_id;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Colo_histopathRecord data = (Colo_histopathRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeUnid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unid);
		}
		
		if(EditFilter.IncludeRdat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rdat);
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
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
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
		
		if(EditFilter.IncludeHisto_spmn_unid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HISTO_SPMN_UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Histo_spmn_unid);
		}
		
		if(EditFilter.IncludeActive)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Active);
		}
		
		if(EditFilter.IncludeReciept_dat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RECIEPT_DAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reciept_dat);
		}
		
		if(EditFilter.IncludeReport_dat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REPORT_DAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Report_dat);
		}
		
		if(EditFilter.IncludeReport_num)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REPORT_NUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Report_num);
		}
		
		if(EditFilter.IncludePat_hcp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PAT_HCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pat_hcp);
		}
		
		if(EditFilter.IncludeCons_hcp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONS_HCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cons_hcp);
		}
		
		if(EditFilter.IncludeSite)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Site);
		}
		
		if(EditFilter.IncludeMax_diameter)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MAX_DIAMETER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Max_diameter);
		}
		
		if(EditFilter.IncludeNearest_margin)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NEAREST_MARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nearest_margin);
		}
		
		if(EditFilter.IncludeTumour_perf)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TUMOUR_PERF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tumour_perf);
		}
		
		if(EditFilter.IncludePeritoneal_refl)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PERITONEAL_REFL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Peritoneal_refl);
		}
		
		if(EditFilter.IncludeDentate_line)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DENTATE_LINE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dentate_line);
		}
		
		if(EditFilter.IncludeHisto_type)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HISTO_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Histo_type);
		}
		
		if(EditFilter.IncludeHisto_other)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HISTO_OTHER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Histo_other);
		}
		
		if(EditFilter.IncludeHisto_differ)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HISTO_DIFFER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Histo_differ);
		}
		
		if(EditFilter.IncludeHisto_local_inv)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HISTO_LOCAL_INV" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Histo_local_inv);
		}
		
		if(EditFilter.IncludeHisto_meas_cicr_m)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HISTO_MEAS_CICR_M" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Histo_meas_cicr_m);
		}
		
		if(EditFilter.IncludeMeta_nodes_ex)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "META_NODES_EX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Meta_nodes_ex);
		}
		
		if(EditFilter.IncludeMeta_pos_nodes)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "META_POS_NODES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Meta_pos_nodes);
		}
		
		if(EditFilter.IncludeMeta_apical)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "META_APICAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Meta_apical);
		}
		
		if(EditFilter.IncludeMeta_extramural)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "META_EXTRAMURAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Meta_extramural);
		}
		
		if(EditFilter.IncludeNotes)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NOTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Notes);
		}
		
		if(EditFilter.IncludeResection)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESECTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resection);
		}
		
		if(EditFilter.IncludeLiver_met)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LIVER_MET" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Liver_met);
		}
		
		if(EditFilter.IncludePath_t)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PATH_T" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Path_t);
		}
		
		if(EditFilter.IncludePath_n)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PATH_N" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Path_n);
		}
		
		if(EditFilter.IncludePath_m)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PATH_M" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Path_m);
		}
		
		if(EditFilter.IncludePath_ostage)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PATH_OSTAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Path_ostage);
		}
		
		if(EditFilter.IncludePts_groupid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PTS_GROUPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pts_groupid);
		}
		
		if(EditFilter.IncludePts_siteid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PTS_SITEID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pts_siteid);
		}
		
		if(EditFilter.IncludePrim_tum_stat_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PRIM_TUM_STAT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prim_tum_stat_id);
		}
		
		
		for(int x = 0; x < data.SeqnoCollection.count(); x++)
		{
			Colo_histopathSeqnoRecord rgRecord = (Colo_histopathSeqnoRecord)data.SeqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MARGIN_FINDING" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Margin_finding);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MARGIN_NO_NA_YES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Margin_no_na_yes);
			
		}
		for(int x = 0; x < data.Seqno1Collection.count(); x++)
		{
			Colo_histopathSeqno1Record rgRecord = (Colo_histopathSeqno1Record)data.Seqno1Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno1);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ABN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Abn_id);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ABN_PRES_ABS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Abn_pres_abs);
			
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
			Colo_histopathRecord record = new Colo_histopathRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Histo_spmn_unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_SPMN_UNID"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Reciept_dat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RECIEPT_DAT"));
			record.Report_dat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REPORT_DAT"));
			record.Report_num = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REPORT_NUM"));
			record.Pat_hcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_HCP"));
			record.Cons_hcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONS_HCP"));
			record.Site = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SITE"));
			record.Max_diameter = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAX_DIAMETER"));
			record.Nearest_margin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NEAREST_MARGIN"));
			record.Tumour_perf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TUMOUR_PERF"));
			record.Peritoneal_refl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERITONEAL_REFL"));
			record.Dentate_line = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DENTATE_LINE"));
			record.Histo_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_TYPE"));
			record.Histo_other = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_OTHER"));
			record.Histo_differ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_DIFFER"));
			record.Histo_local_inv = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_LOCAL_INV"));
			record.Histo_meas_cicr_m = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_MEAS_CICR_M"));
			record.Meta_nodes_ex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "META_NODES_EX"));
			record.Meta_pos_nodes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "META_POS_NODES"));
			record.Meta_apical = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "META_APICAL"));
			record.Meta_extramural = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "META_EXTRAMURAL"));
			record.Notes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOTES"));
			record.Resection = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESECTION"));
			record.Liver_met = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LIVER_MET"));
			record.Path_t = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATH_T"));
			record.Path_n = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATH_N"));
			record.Path_m = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATH_M"));
			record.Path_ostage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATH_OSTAGE"));
			record.Pts_groupid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PTS_GROUPID"));
			record.Pts_siteid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PTS_SITEID"));
			record.Prim_tum_stat_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRIM_TUM_STAT_ID"));
									
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
			Colo_histopathRecord record = new Colo_histopathRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Histo_spmn_unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_SPMN_UNID"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Reciept_dat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RECIEPT_DAT"));
			record.Report_dat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REPORT_DAT"));
			record.Report_num = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REPORT_NUM"));
			record.Pat_hcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_HCP"));
			record.Cons_hcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONS_HCP"));
			record.Site = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SITE"));
			record.Max_diameter = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAX_DIAMETER"));
			record.Nearest_margin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NEAREST_MARGIN"));
			record.Tumour_perf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TUMOUR_PERF"));
			record.Peritoneal_refl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERITONEAL_REFL"));
			record.Dentate_line = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DENTATE_LINE"));
			record.Histo_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_TYPE"));
			record.Histo_other = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_OTHER"));
			record.Histo_differ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_DIFFER"));
			record.Histo_local_inv = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_LOCAL_INV"));
			record.Histo_meas_cicr_m = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_MEAS_CICR_M"));
			record.Meta_nodes_ex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "META_NODES_EX"));
			record.Meta_pos_nodes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "META_POS_NODES"));
			record.Meta_apical = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "META_APICAL"));
			record.Meta_extramural = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "META_EXTRAMURAL"));
			record.Notes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOTES"));
			record.Resection = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESECTION"));
			record.Liver_met = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LIVER_MET"));
			record.Path_t = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATH_T"));
			record.Path_n = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATH_N"));
			record.Path_m = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATH_M"));
			record.Path_ostage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATH_OSTAGE"));
			record.Pts_groupid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PTS_GROUPID"));
			record.Pts_siteid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PTS_SITEID"));
			record.Prim_tum_stat_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRIM_TUM_STAT_ID"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					record.SeqnoCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno1"))
					record.Seqno1Collection.add();
			
									
			rgCount = record.SeqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					{
						Colo_histopathSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("margin_finding"))
					{
						Colo_histopathSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Margin_finding = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("margin_no_na_yes"))
					{
						Colo_histopathSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Margin_no_na_yes = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Seqno1Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno1"))
					{
						Colo_histopathSeqno1Record rgRecord = record.Seqno1Collection.get(recCount);
						rgRecord.Seqno1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("abn_id"))
					{
						Colo_histopathSeqno1Record rgRecord = record.Seqno1Collection.get(recCount);
						rgRecord.Abn_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("abn_pres_abs"))
					{
						Colo_histopathSeqno1Record rgRecord = record.Seqno1Collection.get(recCount);
						rgRecord.Abn_pres_abs = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Colo_histopathCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Colo_histopathRecord newRecord = new Colo_histopathRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Colo_histopathRecord record)
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
		public Colo_histopathRecord get(int index)
		{
			return (Colo_histopathRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Colo_histopathRecord
	{
		public String Unid = "";
		public String Rdat = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Rtim = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Modu = "";
		public String Tstp = "";
		public String Pkey = "";
		public String Ccs_epid = "";
		public String Histo_spmn_unid = "";
		public String Active = "";
		public String Reciept_dat = "";
		public String Report_dat = "";
		public String Report_num = "";
		public String Pat_hcp = "";
		public String Cons_hcp = "";
		public String Site = "";
		public String Max_diameter = "";
		public String Nearest_margin = "";
		public String Tumour_perf = "";
		public String Peritoneal_refl = "";
		public String Dentate_line = "";
		public String Histo_type = "";
		public String Histo_other = "";
		public String Histo_differ = "";
		public String Histo_local_inv = "";
		public String Histo_meas_cicr_m = "";
		public String Meta_nodes_ex = "";
		public String Meta_pos_nodes = "";
		public String Meta_apical = "";
		public String Meta_extramural = "";
		public String Notes = "";
		public String Resection = "";
		public String Liver_met = "";
		public String Path_t = "";
		public String Path_n = "";
		public String Path_m = "";
		public String Path_ostage = "";
		public String Pts_groupid = "";
		public String Pts_siteid = "";
		public String Prim_tum_stat_id = "";
		
		public Colo_histopathSeqnoCollection SeqnoCollection = new Colo_histopathSeqnoCollection();
		public Colo_histopathSeqno1Collection Seqno1Collection = new Colo_histopathSeqno1Collection();		
		
		public void clear()
		{
			Unid = "";
			Rdat = "";
			Rhcp = "";
			Rusr = "";
			Rtim = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Uusr = "";
			Cdat = "";
			Ctim = "";
			Modu = "";
			Tstp = "";
			Pkey = "";
			Ccs_epid = "";
			Histo_spmn_unid = "";
			Active = "";
			Reciept_dat = "";
			Report_dat = "";
			Report_num = "";
			Pat_hcp = "";
			Cons_hcp = "";
			Site = "";
			Max_diameter = "";
			Nearest_margin = "";
			Tumour_perf = "";
			Peritoneal_refl = "";
			Dentate_line = "";
			Histo_type = "";
			Histo_other = "";
			Histo_differ = "";
			Histo_local_inv = "";
			Histo_meas_cicr_m = "";
			Meta_nodes_ex = "";
			Meta_pos_nodes = "";
			Meta_apical = "";
			Meta_extramural = "";
			Notes = "";
			Resection = "";
			Liver_met = "";
			Path_t = "";
			Path_n = "";
			Path_m = "";
			Path_ostage = "";
			Pts_groupid = "";
			Pts_siteid = "";
			Prim_tum_stat_id = "";
			
			SeqnoCollection.clear();
			Seqno1Collection.clear();
		}		
	}
	
	public final class Colo_histopathSeqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Colo_histopathSeqnoRecord newRecord = new Colo_histopathSeqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Colo_histopathSeqnoRecord record)
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
		public Colo_histopathSeqnoRecord get(int index)
		{
			return (Colo_histopathSeqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Colo_histopathSeqno1Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Colo_histopathSeqno1Record newRecord = new Colo_histopathSeqno1Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Colo_histopathSeqno1Record record)
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
		public Colo_histopathSeqno1Record get(int index)
		{
			return (Colo_histopathSeqno1Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Colo_histopathSeqnoRecord
	{
		public String Seqno = "";
		public String Margin_finding = "";
		public String Margin_no_na_yes = "";
		
		public void clear()
		{
			Seqno = "";
			Margin_finding = "";
			Margin_no_na_yes = "";
			
		}
	}
	public final class Colo_histopathSeqno1Record
	{
		public String Seqno1 = "";
		public String Abn_id = "";
		public String Abn_pres_abs = "";
		
		public void clear()
		{
			Seqno1 = "";
			Abn_id = "";
			Abn_pres_abs = "";
			
		}
	}	
	public final class Colo_histopathFilter
	{			
		public String Unid = "";
		public String Rdat = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Rtim = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Modu = "";
		public String Tstp = "";
		public String Pkey = "";
		public String Ccs_epid = "";
		public String Histo_spmn_unid = "";
		public String Active = "";
		public String Reciept_dat = "";
		public String Report_dat = "";
		public String Report_num = "";
		public String Pat_hcp = "";
		public String Cons_hcp = "";
		public String Site = "";
		public String Max_diameter = "";
		public String Nearest_margin = "";
		public String Tumour_perf = "";
		public String Peritoneal_refl = "";
		public String Dentate_line = "";
		public String Histo_type = "";
		public String Histo_other = "";
		public String Histo_differ = "";
		public String Histo_local_inv = "";
		public String Histo_meas_cicr_m = "";
		public String Meta_nodes_ex = "";
		public String Meta_pos_nodes = "";
		public String Meta_apical = "";
		public String Meta_extramural = "";
		public String Notes = "";
		public String Resection = "";
		public String Liver_met = "";
		public String Path_t = "";
		public String Path_n = "";
		public String Path_m = "";
		public String Path_ostage = "";
		public String Pts_groupid = "";
		public String Pts_siteid = "";
		public String Prim_tum_stat_id = "";
		
		public void clear()
		{				
			Unid = "";
			Rdat = "";
			Rhcp = "";
			Rusr = "";
			Rtim = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Uusr = "";
			Cdat = "";
			Ctim = "";
			Modu = "";
			Tstp = "";
			Pkey = "";
			Ccs_epid = "";
			Histo_spmn_unid = "";
			Active = "";
			Reciept_dat = "";
			Report_dat = "";
			Report_num = "";
			Pat_hcp = "";
			Cons_hcp = "";
			Site = "";
			Max_diameter = "";
			Nearest_margin = "";
			Tumour_perf = "";
			Peritoneal_refl = "";
			Dentate_line = "";
			Histo_type = "";
			Histo_other = "";
			Histo_differ = "";
			Histo_local_inv = "";
			Histo_meas_cicr_m = "";
			Meta_nodes_ex = "";
			Meta_pos_nodes = "";
			Meta_apical = "";
			Meta_extramural = "";
			Notes = "";
			Resection = "";
			Liver_met = "";
			Path_t = "";
			Path_n = "";
			Path_m = "";
			Path_ostage = "";
			Pts_groupid = "";
			Pts_siteid = "";
			Prim_tum_stat_id = "";
		}	
		public Colo_histopathFilter cloneObject()
		{
			Colo_histopathFilter newFilter = new Colo_histopathFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Rdat = this.Rdat;
			newFilter.Rhcp = this.Rhcp;
			newFilter.Rusr = this.Rusr;
			newFilter.Rtim = this.Rtim;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Uhcp = this.Uhcp;
			newFilter.Uusr = this.Uusr;
			newFilter.Cdat = this.Cdat;
			newFilter.Ctim = this.Ctim;
			newFilter.Modu = this.Modu;
			newFilter.Tstp = this.Tstp;
			newFilter.Pkey = this.Pkey;
			newFilter.Ccs_epid = this.Ccs_epid;
			newFilter.Histo_spmn_unid = this.Histo_spmn_unid;
			newFilter.Active = this.Active;
			newFilter.Reciept_dat = this.Reciept_dat;
			newFilter.Report_dat = this.Report_dat;
			newFilter.Report_num = this.Report_num;
			newFilter.Pat_hcp = this.Pat_hcp;
			newFilter.Cons_hcp = this.Cons_hcp;
			newFilter.Site = this.Site;
			newFilter.Max_diameter = this.Max_diameter;
			newFilter.Nearest_margin = this.Nearest_margin;
			newFilter.Tumour_perf = this.Tumour_perf;
			newFilter.Peritoneal_refl = this.Peritoneal_refl;
			newFilter.Dentate_line = this.Dentate_line;
			newFilter.Histo_type = this.Histo_type;
			newFilter.Histo_other = this.Histo_other;
			newFilter.Histo_differ = this.Histo_differ;
			newFilter.Histo_local_inv = this.Histo_local_inv;
			newFilter.Histo_meas_cicr_m = this.Histo_meas_cicr_m;
			newFilter.Meta_nodes_ex = this.Meta_nodes_ex;
			newFilter.Meta_pos_nodes = this.Meta_pos_nodes;
			newFilter.Meta_apical = this.Meta_apical;
			newFilter.Meta_extramural = this.Meta_extramural;
			newFilter.Notes = this.Notes;
			newFilter.Resection = this.Resection;
			newFilter.Liver_met = this.Liver_met;
			newFilter.Path_t = this.Path_t;
			newFilter.Path_n = this.Path_n;
			newFilter.Path_m = this.Path_m;
			newFilter.Path_ostage = this.Path_ostage;
			newFilter.Pts_groupid = this.Pts_groupid;
			newFilter.Pts_siteid = this.Pts_siteid;
			newFilter.Prim_tum_stat_id = this.Prim_tum_stat_id;
			
			return newFilter;
		}
	}
	public final class Colo_histopathEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRhcp = true;
		public boolean IncludeRusr = true;
		public boolean IncludeRtim = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeUhcp = true;
		public boolean IncludeUusr = true;
		public boolean IncludeCdat = true;
		public boolean IncludeCtim = true;
		public boolean IncludeModu = true;
		public boolean IncludeTstp = true;
		public boolean IncludePkey = true;
		public boolean IncludeCcs_epid = true;
		public boolean IncludeHisto_spmn_unid = true;
		public boolean IncludeActive = true;
		public boolean IncludeReciept_dat = true;
		public boolean IncludeReport_dat = true;
		public boolean IncludeReport_num = true;
		public boolean IncludePat_hcp = true;
		public boolean IncludeCons_hcp = true;
		public boolean IncludeSite = true;
		public boolean IncludeMax_diameter = true;
		public boolean IncludeNearest_margin = true;
		public boolean IncludeTumour_perf = true;
		public boolean IncludePeritoneal_refl = true;
		public boolean IncludeDentate_line = true;
		public boolean IncludeHisto_type = true;
		public boolean IncludeHisto_other = true;
		public boolean IncludeHisto_differ = true;
		public boolean IncludeHisto_local_inv = true;
		public boolean IncludeHisto_meas_cicr_m = true;
		public boolean IncludeMeta_nodes_ex = true;
		public boolean IncludeMeta_pos_nodes = true;
		public boolean IncludeMeta_apical = true;
		public boolean IncludeMeta_extramural = true;
		public boolean IncludeNotes = true;
		public boolean IncludeResection = true;
		public boolean IncludeLiver_met = true;
		public boolean IncludePath_t = true;
		public boolean IncludePath_n = true;
		public boolean IncludePath_m = true;
		public boolean IncludePath_ostage = true;
		public boolean IncludePts_groupid = true;
		public boolean IncludePts_siteid = true;
		public boolean IncludePrim_tum_stat_id = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludeRdat = true;
			IncludeRhcp = true;
			IncludeRusr = true;
			IncludeRtim = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeUhcp = true;
			IncludeUusr = true;
			IncludeCdat = true;
			IncludeCtim = true;
			IncludeModu = true;
			IncludeTstp = true;
			IncludePkey = true;
			IncludeCcs_epid = true;
			IncludeHisto_spmn_unid = true;
			IncludeActive = true;
			IncludeReciept_dat = true;
			IncludeReport_dat = true;
			IncludeReport_num = true;
			IncludePat_hcp = true;
			IncludeCons_hcp = true;
			IncludeSite = true;
			IncludeMax_diameter = true;
			IncludeNearest_margin = true;
			IncludeTumour_perf = true;
			IncludePeritoneal_refl = true;
			IncludeDentate_line = true;
			IncludeHisto_type = true;
			IncludeHisto_other = true;
			IncludeHisto_differ = true;
			IncludeHisto_local_inv = true;
			IncludeHisto_meas_cicr_m = true;
			IncludeMeta_nodes_ex = true;
			IncludeMeta_pos_nodes = true;
			IncludeMeta_apical = true;
			IncludeMeta_extramural = true;
			IncludeNotes = true;
			IncludeResection = true;
			IncludeLiver_met = true;
			IncludePath_t = true;
			IncludePath_n = true;
			IncludePath_m = true;
			IncludePath_ostage = true;
			IncludePts_groupid = true;
			IncludePts_siteid = true;
			IncludePrim_tum_stat_id = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludeRdat = false;
			IncludeRhcp = false;
			IncludeRusr = false;
			IncludeRtim = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeUhcp = false;
			IncludeUusr = false;
			IncludeCdat = false;
			IncludeCtim = false;
			IncludeModu = false;
			IncludeTstp = false;
			IncludePkey = false;
			IncludeCcs_epid = false;
			IncludeHisto_spmn_unid = false;
			IncludeActive = false;
			IncludeReciept_dat = false;
			IncludeReport_dat = false;
			IncludeReport_num = false;
			IncludePat_hcp = false;
			IncludeCons_hcp = false;
			IncludeSite = false;
			IncludeMax_diameter = false;
			IncludeNearest_margin = false;
			IncludeTumour_perf = false;
			IncludePeritoneal_refl = false;
			IncludeDentate_line = false;
			IncludeHisto_type = false;
			IncludeHisto_other = false;
			IncludeHisto_differ = false;
			IncludeHisto_local_inv = false;
			IncludeHisto_meas_cicr_m = false;
			IncludeMeta_nodes_ex = false;
			IncludeMeta_pos_nodes = false;
			IncludeMeta_apical = false;
			IncludeMeta_extramural = false;
			IncludeNotes = false;
			IncludeResection = false;
			IncludeLiver_met = false;
			IncludePath_t = false;
			IncludePath_n = false;
			IncludePath_m = false;
			IncludePath_ostage = false;
			IncludePts_groupid = false;
			IncludePts_siteid = false;
			IncludePrim_tum_stat_id = false;
		}
		public Colo_histopathEditFilter cloneObject()
		{
			Colo_histopathEditFilter newEditFilter = new Colo_histopathEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRhcp = this.IncludeRhcp;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeUhcp = this.IncludeUhcp;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeModu = this.IncludeModu;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeCcs_epid = this.IncludeCcs_epid;
			newEditFilter.IncludeHisto_spmn_unid = this.IncludeHisto_spmn_unid;
			newEditFilter.IncludeActive = this.IncludeActive;
			newEditFilter.IncludeReciept_dat = this.IncludeReciept_dat;
			newEditFilter.IncludeReport_dat = this.IncludeReport_dat;
			newEditFilter.IncludeReport_num = this.IncludeReport_num;
			newEditFilter.IncludePat_hcp = this.IncludePat_hcp;
			newEditFilter.IncludeCons_hcp = this.IncludeCons_hcp;
			newEditFilter.IncludeSite = this.IncludeSite;
			newEditFilter.IncludeMax_diameter = this.IncludeMax_diameter;
			newEditFilter.IncludeNearest_margin = this.IncludeNearest_margin;
			newEditFilter.IncludeTumour_perf = this.IncludeTumour_perf;
			newEditFilter.IncludePeritoneal_refl = this.IncludePeritoneal_refl;
			newEditFilter.IncludeDentate_line = this.IncludeDentate_line;
			newEditFilter.IncludeHisto_type = this.IncludeHisto_type;
			newEditFilter.IncludeHisto_other = this.IncludeHisto_other;
			newEditFilter.IncludeHisto_differ = this.IncludeHisto_differ;
			newEditFilter.IncludeHisto_local_inv = this.IncludeHisto_local_inv;
			newEditFilter.IncludeHisto_meas_cicr_m = this.IncludeHisto_meas_cicr_m;
			newEditFilter.IncludeMeta_nodes_ex = this.IncludeMeta_nodes_ex;
			newEditFilter.IncludeMeta_pos_nodes = this.IncludeMeta_pos_nodes;
			newEditFilter.IncludeMeta_apical = this.IncludeMeta_apical;
			newEditFilter.IncludeMeta_extramural = this.IncludeMeta_extramural;
			newEditFilter.IncludeNotes = this.IncludeNotes;
			newEditFilter.IncludeResection = this.IncludeResection;
			newEditFilter.IncludeLiver_met = this.IncludeLiver_met;
			newEditFilter.IncludePath_t = this.IncludePath_t;
			newEditFilter.IncludePath_n = this.IncludePath_n;
			newEditFilter.IncludePath_m = this.IncludePath_m;
			newEditFilter.IncludePath_ostage = this.IncludePath_ostage;
			newEditFilter.IncludePts_groupid = this.IncludePts_groupid;
			newEditFilter.IncludePts_siteid = this.IncludePts_siteid;
			newEditFilter.IncludePrim_tum_stat_id = this.IncludePrim_tum_stat_id;
			
			return newEditFilter;
		}
	}
}
