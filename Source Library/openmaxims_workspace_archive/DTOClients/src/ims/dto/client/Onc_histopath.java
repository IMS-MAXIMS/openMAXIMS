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

public final class Onc_histopath implements ims.vo.ImsCloneable
{
	private Onc_histopathFilter lastGetFilter = null;
	private final String serviceName = "ONC_HISTOPATH";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Onc_histopathFilter Filter = new Onc_histopathFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Onc_histopathEditFilter EditFilter = new Onc_histopathEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Onc_histopathCollection DataCollection = new Onc_histopathCollection();

	/**
	 * Creates a new Onc_histopath Data Transfer Object.
	 */ 
	public Onc_histopath(ims.dto.Connection connection)
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
	public Onc_histopath cloneObject()
	{
		Onc_histopath cloneObject = new Onc_histopath(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Onc_histopath_id = DataCollection.get(x).Onc_histopath_id;
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
			cloneObject.DataCollection.get(index).Dat_recie = DataCollection.get(x).Dat_recie;
			cloneObject.DataCollection.get(index).Dat_report = DataCollection.get(x).Dat_report;
			cloneObject.DataCollection.get(index).Rep_no = DataCollection.get(x).Rep_no;
			cloneObject.DataCollection.get(index).Rep_path = DataCollection.get(x).Rep_path;
			cloneObject.DataCollection.get(index).Rep_cons = DataCollection.get(x).Rep_cons;
			cloneObject.DataCollection.get(index).Rep_labno = DataCollection.get(x).Rep_labno;
			cloneObject.DataCollection.get(index).Spec_lat = DataCollection.get(x).Spec_lat;
			cloneObject.DataCollection.get(index).Spec_type = DataCollection.get(x).Spec_type;
			cloneObject.DataCollection.get(index).Tsize = DataCollection.get(x).Tsize;
			cloneObject.DataCollection.get(index).Tdist = DataCollection.get(x).Tdist;
			cloneObject.DataCollection.get(index).Extaop = DataCollection.get(x).Extaop;
			cloneObject.DataCollection.get(index).Histo_typ = DataCollection.get(x).Histo_typ;
			cloneObject.DataCollection.get(index).Histo_type_txt = DataCollection.get(x).Histo_type_txt;
			cloneObject.DataCollection.get(index).Metastases = DataCollection.get(x).Metastases;
			cloneObject.DataCollection.get(index).Metastasestxt = DataCollection.get(x).Metastasestxt;
			cloneObject.DataCollection.get(index).Cresmrg = DataCollection.get(x).Cresmrg;
			cloneObject.DataCollection.get(index).Pathtxt = DataCollection.get(x).Pathtxt;
			cloneObject.DataCollection.get(index).Specimentext = DataCollection.get(x).Specimentext;
			cloneObject.DataCollection.get(index).Rep_org = DataCollection.get(x).Rep_org;
			cloneObject.DataCollection.get(index).Synctum = DataCollection.get(x).Synctum;
			cloneObject.DataCollection.get(index).Path_t = DataCollection.get(x).Path_t;
			cloneObject.DataCollection.get(index).Path_n = DataCollection.get(x).Path_n;
			cloneObject.DataCollection.get(index).Patm_m = DataCollection.get(x).Patm_m;
			cloneObject.DataCollection.get(index).Path_ostage = DataCollection.get(x).Path_ostage;
			cloneObject.DataCollection.get(index).Pts_groupid = DataCollection.get(x).Pts_groupid;
			cloneObject.DataCollection.get(index).Pts_siteid = DataCollection.get(x).Pts_siteid;
			cloneObject.DataCollection.get(index).Prim_tum_stat_id = DataCollection.get(x).Prim_tum_stat_id;
							
			
			for(int iSeqno1 = 0; iSeqno1 < DataCollection.get(x).Seqno1Collection.count(); iSeqno1++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno1Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno1Collection.get(rIndex).Seqno1 = DataCollection.get(x).Seqno1Collection.get(iSeqno1).Seqno1;
				cloneObject.DataCollection.get(index).Seqno1Collection.get(rIndex).Loc_site = DataCollection.get(x).Seqno1Collection.get(iSeqno1).Loc_site;
										
			}
			
			for(int iSeqno2 = 0; iSeqno2 < DataCollection.get(x).Seqno2Collection.count(); iSeqno2++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno2Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Seqno2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Seqno2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Loc_inv_site = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Loc_inv_site;
										
			}
			
			for(int iSeqno3 = 0; iSeqno3 < DataCollection.get(x).Seqno3Collection.count(); iSeqno3++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno3Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Seqno3 = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Seqno3;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Lns_sub = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Lns_sub;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Lns_find = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Lns_find;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Lns_site = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Lns_site;
										
			}
			
			for(int iSeqno4 = 0; iSeqno4 < DataCollection.get(x).Seqno4Collection.count(); iSeqno4++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno4Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Seqno4 = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Seqno4;
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Marg_find = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Marg_find;
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Marg_typ = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Marg_typ;
										
			}
			
			for(int iSeqno5 = 0; iSeqno5 < DataCollection.get(x).Seqno5Collection.count(); iSeqno5++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno5Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno5Collection.get(rIndex).Seqno5 = DataCollection.get(x).Seqno5Collection.get(iSeqno5).Seqno5;
				cloneObject.DataCollection.get(index).Seqno5Collection.get(rIndex).Of_txt = DataCollection.get(x).Seqno5Collection.get(iSeqno5).Of_txt;
				cloneObject.DataCollection.get(index).Seqno5Collection.get(rIndex).Ofind_type = DataCollection.get(x).Seqno5Collection.get(iSeqno5).Ofind_type;
										
			}
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.2 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Onc_histopath.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_histopath.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Onc_histopath.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_histopath.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_histopath.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_histopath.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Onc_histopath.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Onc_histopath.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_histopath.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Onc_histopath.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Onc_histopath.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Onc_histopath.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Onc_histopath.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Onc_histopath.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_histopath.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Onc_histopath.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Onc_histopath.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Onc_histopath.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Onc_histopath.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Onc_histopath.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_histopath.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Onc_histopath.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Onc_histopath.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_histopath.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Onc_histopath.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Onc_histopath.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Onc_histopath.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_histopath.List");
							
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
	private String encodeNASFilter(Onc_histopathFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Onc_histopath_id != null && filter.Onc_histopath_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ONC_HISTOPATH_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Onc_histopath_id;
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
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Dat_recie != null && filter.Dat_recie.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DAT_RECIE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dat_recie;
		}
		
		if(Filter.Dat_report != null && filter.Dat_report.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DAT_REPORT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dat_report;
		}
		
		if(Filter.Rep_no != null && filter.Rep_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REP_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rep_no;
		}
		
		if(Filter.Rep_path != null && filter.Rep_path.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REP_PATH" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rep_path;
		}
		
		if(Filter.Rep_cons != null && filter.Rep_cons.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REP_CONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rep_cons;
		}
		
		if(Filter.Rep_labno != null && filter.Rep_labno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REP_LABNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rep_labno;
		}
		
		if(Filter.Spec_lat != null && filter.Spec_lat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPEC_LAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spec_lat;
		}
		
		if(Filter.Spec_type != null && filter.Spec_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPEC_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spec_type;
		}
		
		if(Filter.Tsize != null && filter.Tsize.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSIZE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tsize;
		}
		
		if(Filter.Tdist != null && filter.Tdist.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TDIST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tdist;
		}
		
		if(Filter.Extaop != null && filter.Extaop.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EXTAOP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Extaop;
		}
		
		if(Filter.Histo_typ != null && filter.Histo_typ.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HISTO_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Histo_typ;
		}
		
		if(Filter.Histo_type_txt != null && filter.Histo_type_txt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HISTO_TYPE_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Histo_type_txt;
		}
		
		if(Filter.Metastases != null && filter.Metastases.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "METASTASES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Metastases;
		}
		
		if(Filter.Metastasestxt != null && filter.Metastasestxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "METASTASESTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Metastasestxt;
		}
		
		if(Filter.Cresmrg != null && filter.Cresmrg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CRESMRG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cresmrg;
		}
		
		if(Filter.Pathtxt != null && filter.Pathtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PATHTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pathtxt;
		}
		
		if(Filter.Specimentext != null && filter.Specimentext.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPECIMENTEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Specimentext;
		}
		
		if(Filter.Rep_org != null && filter.Rep_org.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REP_ORG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rep_org;
		}
		
		if(Filter.Synctum != null && filter.Synctum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SYNCTUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Synctum;
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
		
		if(Filter.Patm_m != null && filter.Patm_m.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PATM_M" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Patm_m;
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
			
		Onc_histopathRecord data = (Onc_histopathRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeOnc_histopath_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ONC_HISTOPATH_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Onc_histopath_id);
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
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeDat_recie)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DAT_RECIE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dat_recie);
		}
		
		if(EditFilter.IncludeDat_report)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DAT_REPORT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dat_report);
		}
		
		if(EditFilter.IncludeRep_no)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REP_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rep_no);
		}
		
		if(EditFilter.IncludeRep_path)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REP_PATH" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rep_path);
		}
		
		if(EditFilter.IncludeRep_cons)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REP_CONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rep_cons);
		}
		
		if(EditFilter.IncludeRep_labno)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REP_LABNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rep_labno);
		}
		
		if(EditFilter.IncludeSpec_lat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPEC_LAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spec_lat);
		}
		
		if(EditFilter.IncludeSpec_type)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPEC_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spec_type);
		}
		
		if(EditFilter.IncludeTsize)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSIZE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tsize);
		}
		
		if(EditFilter.IncludeTdist)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TDIST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tdist);
		}
		
		if(EditFilter.IncludeExtaop)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EXTAOP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Extaop);
		}
		
		if(EditFilter.IncludeHisto_typ)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HISTO_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Histo_typ);
		}
		
		if(EditFilter.IncludeHisto_type_txt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HISTO_TYPE_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Histo_type_txt);
		}
		
		if(EditFilter.IncludeMetastases)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "METASTASES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Metastases);
		}
		
		if(EditFilter.IncludeMetastasestxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "METASTASESTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Metastasestxt);
		}
		
		if(EditFilter.IncludeCresmrg)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CRESMRG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cresmrg);
		}
		
		if(EditFilter.IncludePathtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PATHTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pathtxt);
		}
		
		if(EditFilter.IncludeSpecimentext)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPECIMENTEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Specimentext);
		}
		
		if(EditFilter.IncludeRep_org)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REP_ORG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rep_org);
		}
		
		if(EditFilter.IncludeSynctum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SYNCTUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Synctum);
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
		
		if(EditFilter.IncludePatm_m)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PATM_M" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Patm_m);
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
		
		
		for(int x = 0; x < data.Seqno1Collection.count(); x++)
		{
			Onc_histopathSeqno1Record rgRecord = (Onc_histopathSeqno1Record)data.Seqno1Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno1);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LOC_SITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Loc_site);
			
		}
		for(int x = 0; x < data.Seqno2Collection.count(); x++)
		{
			Onc_histopathSeqno2Record rgRecord = (Onc_histopathSeqno2Record)data.Seqno2Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno2);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LOC_INV_SITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Loc_inv_site);
			
		}
		for(int x = 0; x < data.Seqno3Collection.count(); x++)
		{
			Onc_histopathSeqno3Record rgRecord = (Onc_histopathSeqno3Record)data.Seqno3Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno3);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LNS_SUB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Lns_sub);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LNS_FIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Lns_find);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LNS_SITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Lns_site);
			
		}
		for(int x = 0; x < data.Seqno4Collection.count(); x++)
		{
			Onc_histopathSeqno4Record rgRecord = (Onc_histopathSeqno4Record)data.Seqno4Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno4);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MARG_FIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Marg_find);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MARG_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Marg_typ);
			
		}
		for(int x = 0; x < data.Seqno5Collection.count(); x++)
		{
			Onc_histopathSeqno5Record rgRecord = (Onc_histopathSeqno5Record)data.Seqno5Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno5);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OF_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Of_txt);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OFIND_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ofind_type);
			
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
			Onc_histopathRecord record = new Onc_histopathRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Onc_histopath_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONC_HISTOPATH_ID"));
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
			record.Dat_recie = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DAT_RECIE"));
			record.Dat_report = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DAT_REPORT"));
			record.Rep_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REP_NO"));
			record.Rep_path = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REP_PATH"));
			record.Rep_cons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REP_CONS"));
			record.Rep_labno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REP_LABNO"));
			record.Spec_lat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPEC_LAT"));
			record.Spec_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPEC_TYPE"));
			record.Tsize = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSIZE"));
			record.Tdist = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TDIST"));
			record.Extaop = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXTAOP"));
			record.Histo_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_TYP"));
			record.Histo_type_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_TYPE_TXT"));
			record.Metastases = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "METASTASES"));
			record.Metastasestxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "METASTASESTXT"));
			record.Cresmrg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CRESMRG"));
			record.Pathtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATHTXT"));
			record.Specimentext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPECIMENTEXT"));
			record.Rep_org = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REP_ORG"));
			record.Synctum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYNCTUM"));
			record.Path_t = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATH_T"));
			record.Path_n = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATH_N"));
			record.Patm_m = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATM_M"));
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
			Onc_histopathRecord record = new Onc_histopathRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Onc_histopath_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONC_HISTOPATH_ID"));
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
			record.Dat_recie = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DAT_RECIE"));
			record.Dat_report = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DAT_REPORT"));
			record.Rep_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REP_NO"));
			record.Rep_path = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REP_PATH"));
			record.Rep_cons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REP_CONS"));
			record.Rep_labno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REP_LABNO"));
			record.Spec_lat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPEC_LAT"));
			record.Spec_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPEC_TYPE"));
			record.Tsize = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSIZE"));
			record.Tdist = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TDIST"));
			record.Extaop = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXTAOP"));
			record.Histo_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_TYP"));
			record.Histo_type_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HISTO_TYPE_TXT"));
			record.Metastases = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "METASTASES"));
			record.Metastasestxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "METASTASESTXT"));
			record.Cresmrg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CRESMRG"));
			record.Pathtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATHTXT"));
			record.Specimentext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPECIMENTEXT"));
			record.Rep_org = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REP_ORG"));
			record.Synctum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYNCTUM"));
			record.Path_t = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATH_T"));
			record.Path_n = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATH_N"));
			record.Patm_m = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATM_M"));
			record.Path_ostage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATH_OSTAGE"));
			record.Pts_groupid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PTS_GROUPID"));
			record.Pts_siteid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PTS_SITEID"));
			record.Prim_tum_stat_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRIM_TUM_STAT_ID"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno1"))
					record.Seqno1Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno2"))
					record.Seqno2Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno3"))
					record.Seqno3Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno4"))
					record.Seqno4Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno5"))
					record.Seqno5Collection.add();
			
									
			rgCount = record.Seqno1Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno1"))
					{
						Onc_histopathSeqno1Record rgRecord = record.Seqno1Collection.get(recCount);
						rgRecord.Seqno1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("loc_site"))
					{
						Onc_histopathSeqno1Record rgRecord = record.Seqno1Collection.get(recCount);
						rgRecord.Loc_site = Connection.getAttributeValue(valueItems[i]);
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
						Onc_histopathSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Seqno2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("loc_inv_site"))
					{
						Onc_histopathSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Loc_inv_site = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Seqno3Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno3"))
					{
						Onc_histopathSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Seqno3 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("lns_sub"))
					{
						Onc_histopathSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Lns_sub = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("lns_find"))
					{
						Onc_histopathSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Lns_find = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("lns_site"))
					{
						Onc_histopathSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Lns_site = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Seqno4Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno4"))
					{
						Onc_histopathSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Seqno4 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("marg_find"))
					{
						Onc_histopathSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Marg_find = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("marg_typ"))
					{
						Onc_histopathSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Marg_typ = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Seqno5Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno5"))
					{
						Onc_histopathSeqno5Record rgRecord = record.Seqno5Collection.get(recCount);
						rgRecord.Seqno5 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("of_txt"))
					{
						Onc_histopathSeqno5Record rgRecord = record.Seqno5Collection.get(recCount);
						rgRecord.Of_txt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ofind_type"))
					{
						Onc_histopathSeqno5Record rgRecord = record.Seqno5Collection.get(recCount);
						rgRecord.Ofind_type = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Onc_histopathCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_histopathRecord newRecord = new Onc_histopathRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_histopathRecord record)
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
		public Onc_histopathRecord get(int index)
		{
			return (Onc_histopathRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Onc_histopathRecord
	{
		public String Onc_histopath_id = "";
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
		public String Dat_recie = "";
		public String Dat_report = "";
		public String Rep_no = "";
		public String Rep_path = "";
		public String Rep_cons = "";
		public String Rep_labno = "";
		public String Spec_lat = "";
		public String Spec_type = "";
		public String Tsize = "";
		public String Tdist = "";
		public String Extaop = "";
		public String Histo_typ = "";
		public String Histo_type_txt = "";
		public String Metastases = "";
		public String Metastasestxt = "";
		public String Cresmrg = "";
		public String Pathtxt = "";
		public String Specimentext = "";
		public String Rep_org = "";
		public String Synctum = "";
		public String Path_t = "";
		public String Path_n = "";
		public String Patm_m = "";
		public String Path_ostage = "";
		public String Pts_groupid = "";
		public String Pts_siteid = "";
		public String Prim_tum_stat_id = "";
		
		public Onc_histopathSeqno1Collection Seqno1Collection = new Onc_histopathSeqno1Collection();
		public Onc_histopathSeqno2Collection Seqno2Collection = new Onc_histopathSeqno2Collection();
		public Onc_histopathSeqno3Collection Seqno3Collection = new Onc_histopathSeqno3Collection();
		public Onc_histopathSeqno4Collection Seqno4Collection = new Onc_histopathSeqno4Collection();
		public Onc_histopathSeqno5Collection Seqno5Collection = new Onc_histopathSeqno5Collection();		
		
		public void clear()
		{
			Onc_histopath_id = "";
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
			Dat_recie = "";
			Dat_report = "";
			Rep_no = "";
			Rep_path = "";
			Rep_cons = "";
			Rep_labno = "";
			Spec_lat = "";
			Spec_type = "";
			Tsize = "";
			Tdist = "";
			Extaop = "";
			Histo_typ = "";
			Histo_type_txt = "";
			Metastases = "";
			Metastasestxt = "";
			Cresmrg = "";
			Pathtxt = "";
			Specimentext = "";
			Rep_org = "";
			Synctum = "";
			Path_t = "";
			Path_n = "";
			Patm_m = "";
			Path_ostage = "";
			Pts_groupid = "";
			Pts_siteid = "";
			Prim_tum_stat_id = "";
			
			Seqno1Collection.clear();
			Seqno2Collection.clear();
			Seqno3Collection.clear();
			Seqno4Collection.clear();
			Seqno5Collection.clear();
		}		
	}
	
	public final class Onc_histopathSeqno1Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_histopathSeqno1Record newRecord = new Onc_histopathSeqno1Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_histopathSeqno1Record record)
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
		public Onc_histopathSeqno1Record get(int index)
		{
			return (Onc_histopathSeqno1Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Onc_histopathSeqno2Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_histopathSeqno2Record newRecord = new Onc_histopathSeqno2Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_histopathSeqno2Record record)
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
		public Onc_histopathSeqno2Record get(int index)
		{
			return (Onc_histopathSeqno2Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Onc_histopathSeqno3Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_histopathSeqno3Record newRecord = new Onc_histopathSeqno3Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_histopathSeqno3Record record)
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
		public Onc_histopathSeqno3Record get(int index)
		{
			return (Onc_histopathSeqno3Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Onc_histopathSeqno4Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_histopathSeqno4Record newRecord = new Onc_histopathSeqno4Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_histopathSeqno4Record record)
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
		public Onc_histopathSeqno4Record get(int index)
		{
			return (Onc_histopathSeqno4Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Onc_histopathSeqno5Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_histopathSeqno5Record newRecord = new Onc_histopathSeqno5Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_histopathSeqno5Record record)
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
		public Onc_histopathSeqno5Record get(int index)
		{
			return (Onc_histopathSeqno5Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Onc_histopathSeqno1Record
	{
		public String Seqno1 = "";
		public String Loc_site = "";
		
		public void clear()
		{
			Seqno1 = "";
			Loc_site = "";
			
		}
	}
	public final class Onc_histopathSeqno2Record
	{
		public String Seqno2 = "";
		public String Loc_inv_site = "";
		
		public void clear()
		{
			Seqno2 = "";
			Loc_inv_site = "";
			
		}
	}
	public final class Onc_histopathSeqno3Record
	{
		public String Seqno3 = "";
		public String Lns_sub = "";
		public String Lns_find = "";
		public String Lns_site = "";
		
		public void clear()
		{
			Seqno3 = "";
			Lns_sub = "";
			Lns_find = "";
			Lns_site = "";
			
		}
	}
	public final class Onc_histopathSeqno4Record
	{
		public String Seqno4 = "";
		public String Marg_find = "";
		public String Marg_typ = "";
		
		public void clear()
		{
			Seqno4 = "";
			Marg_find = "";
			Marg_typ = "";
			
		}
	}
	public final class Onc_histopathSeqno5Record
	{
		public String Seqno5 = "";
		public String Of_txt = "";
		public String Ofind_type = "";
		
		public void clear()
		{
			Seqno5 = "";
			Of_txt = "";
			Ofind_type = "";
			
		}
	}	
	public final class Onc_histopathFilter
	{			
		public String Onc_histopath_id = "";
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
		public String Dat_recie = "";
		public String Dat_report = "";
		public String Rep_no = "";
		public String Rep_path = "";
		public String Rep_cons = "";
		public String Rep_labno = "";
		public String Spec_lat = "";
		public String Spec_type = "";
		public String Tsize = "";
		public String Tdist = "";
		public String Extaop = "";
		public String Histo_typ = "";
		public String Histo_type_txt = "";
		public String Metastases = "";
		public String Metastasestxt = "";
		public String Cresmrg = "";
		public String Pathtxt = "";
		public String Specimentext = "";
		public String Rep_org = "";
		public String Synctum = "";
		public String Path_t = "";
		public String Path_n = "";
		public String Patm_m = "";
		public String Path_ostage = "";
		public String Pts_groupid = "";
		public String Pts_siteid = "";
		public String Prim_tum_stat_id = "";
		
		public void clear()
		{				
			Onc_histopath_id = "";
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
			Dat_recie = "";
			Dat_report = "";
			Rep_no = "";
			Rep_path = "";
			Rep_cons = "";
			Rep_labno = "";
			Spec_lat = "";
			Spec_type = "";
			Tsize = "";
			Tdist = "";
			Extaop = "";
			Histo_typ = "";
			Histo_type_txt = "";
			Metastases = "";
			Metastasestxt = "";
			Cresmrg = "";
			Pathtxt = "";
			Specimentext = "";
			Rep_org = "";
			Synctum = "";
			Path_t = "";
			Path_n = "";
			Patm_m = "";
			Path_ostage = "";
			Pts_groupid = "";
			Pts_siteid = "";
			Prim_tum_stat_id = "";
		}	
		public Onc_histopathFilter cloneObject()
		{
			Onc_histopathFilter newFilter = new Onc_histopathFilter();
			
			newFilter.Onc_histopath_id = this.Onc_histopath_id;
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
			newFilter.Dat_recie = this.Dat_recie;
			newFilter.Dat_report = this.Dat_report;
			newFilter.Rep_no = this.Rep_no;
			newFilter.Rep_path = this.Rep_path;
			newFilter.Rep_cons = this.Rep_cons;
			newFilter.Rep_labno = this.Rep_labno;
			newFilter.Spec_lat = this.Spec_lat;
			newFilter.Spec_type = this.Spec_type;
			newFilter.Tsize = this.Tsize;
			newFilter.Tdist = this.Tdist;
			newFilter.Extaop = this.Extaop;
			newFilter.Histo_typ = this.Histo_typ;
			newFilter.Histo_type_txt = this.Histo_type_txt;
			newFilter.Metastases = this.Metastases;
			newFilter.Metastasestxt = this.Metastasestxt;
			newFilter.Cresmrg = this.Cresmrg;
			newFilter.Pathtxt = this.Pathtxt;
			newFilter.Specimentext = this.Specimentext;
			newFilter.Rep_org = this.Rep_org;
			newFilter.Synctum = this.Synctum;
			newFilter.Path_t = this.Path_t;
			newFilter.Path_n = this.Path_n;
			newFilter.Patm_m = this.Patm_m;
			newFilter.Path_ostage = this.Path_ostage;
			newFilter.Pts_groupid = this.Pts_groupid;
			newFilter.Pts_siteid = this.Pts_siteid;
			newFilter.Prim_tum_stat_id = this.Prim_tum_stat_id;
			
			return newFilter;
		}
	}
	public final class Onc_histopathEditFilter
	{			
		public boolean IncludeOnc_histopath_id = true;
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
		public boolean IncludeDat_recie = true;
		public boolean IncludeDat_report = true;
		public boolean IncludeRep_no = true;
		public boolean IncludeRep_path = true;
		public boolean IncludeRep_cons = true;
		public boolean IncludeRep_labno = true;
		public boolean IncludeSpec_lat = true;
		public boolean IncludeSpec_type = true;
		public boolean IncludeTsize = true;
		public boolean IncludeTdist = true;
		public boolean IncludeExtaop = true;
		public boolean IncludeHisto_typ = true;
		public boolean IncludeHisto_type_txt = true;
		public boolean IncludeMetastases = true;
		public boolean IncludeMetastasestxt = true;
		public boolean IncludeCresmrg = true;
		public boolean IncludePathtxt = true;
		public boolean IncludeSpecimentext = true;
		public boolean IncludeRep_org = true;
		public boolean IncludeSynctum = true;
		public boolean IncludePath_t = true;
		public boolean IncludePath_n = true;
		public boolean IncludePatm_m = true;
		public boolean IncludePath_ostage = true;
		public boolean IncludePts_groupid = true;
		public boolean IncludePts_siteid = true;
		public boolean IncludePrim_tum_stat_id = true;
		
		public void includeAll()
		{				
			IncludeOnc_histopath_id = true;
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
			IncludeDat_recie = true;
			IncludeDat_report = true;
			IncludeRep_no = true;
			IncludeRep_path = true;
			IncludeRep_cons = true;
			IncludeRep_labno = true;
			IncludeSpec_lat = true;
			IncludeSpec_type = true;
			IncludeTsize = true;
			IncludeTdist = true;
			IncludeExtaop = true;
			IncludeHisto_typ = true;
			IncludeHisto_type_txt = true;
			IncludeMetastases = true;
			IncludeMetastasestxt = true;
			IncludeCresmrg = true;
			IncludePathtxt = true;
			IncludeSpecimentext = true;
			IncludeRep_org = true;
			IncludeSynctum = true;
			IncludePath_t = true;
			IncludePath_n = true;
			IncludePatm_m = true;
			IncludePath_ostage = true;
			IncludePts_groupid = true;
			IncludePts_siteid = true;
			IncludePrim_tum_stat_id = true;
		}	
		public void excludeAll()
		{				
			IncludeOnc_histopath_id = false;
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
			IncludeDat_recie = false;
			IncludeDat_report = false;
			IncludeRep_no = false;
			IncludeRep_path = false;
			IncludeRep_cons = false;
			IncludeRep_labno = false;
			IncludeSpec_lat = false;
			IncludeSpec_type = false;
			IncludeTsize = false;
			IncludeTdist = false;
			IncludeExtaop = false;
			IncludeHisto_typ = false;
			IncludeHisto_type_txt = false;
			IncludeMetastases = false;
			IncludeMetastasestxt = false;
			IncludeCresmrg = false;
			IncludePathtxt = false;
			IncludeSpecimentext = false;
			IncludeRep_org = false;
			IncludeSynctum = false;
			IncludePath_t = false;
			IncludePath_n = false;
			IncludePatm_m = false;
			IncludePath_ostage = false;
			IncludePts_groupid = false;
			IncludePts_siteid = false;
			IncludePrim_tum_stat_id = false;
		}
		public Onc_histopathEditFilter cloneObject()
		{
			Onc_histopathEditFilter newEditFilter = new Onc_histopathEditFilter();
			
			newEditFilter.IncludeOnc_histopath_id = this.IncludeOnc_histopath_id;
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
			newEditFilter.IncludeDat_recie = this.IncludeDat_recie;
			newEditFilter.IncludeDat_report = this.IncludeDat_report;
			newEditFilter.IncludeRep_no = this.IncludeRep_no;
			newEditFilter.IncludeRep_path = this.IncludeRep_path;
			newEditFilter.IncludeRep_cons = this.IncludeRep_cons;
			newEditFilter.IncludeRep_labno = this.IncludeRep_labno;
			newEditFilter.IncludeSpec_lat = this.IncludeSpec_lat;
			newEditFilter.IncludeSpec_type = this.IncludeSpec_type;
			newEditFilter.IncludeTsize = this.IncludeTsize;
			newEditFilter.IncludeTdist = this.IncludeTdist;
			newEditFilter.IncludeExtaop = this.IncludeExtaop;
			newEditFilter.IncludeHisto_typ = this.IncludeHisto_typ;
			newEditFilter.IncludeHisto_type_txt = this.IncludeHisto_type_txt;
			newEditFilter.IncludeMetastases = this.IncludeMetastases;
			newEditFilter.IncludeMetastasestxt = this.IncludeMetastasestxt;
			newEditFilter.IncludeCresmrg = this.IncludeCresmrg;
			newEditFilter.IncludePathtxt = this.IncludePathtxt;
			newEditFilter.IncludeSpecimentext = this.IncludeSpecimentext;
			newEditFilter.IncludeRep_org = this.IncludeRep_org;
			newEditFilter.IncludeSynctum = this.IncludeSynctum;
			newEditFilter.IncludePath_t = this.IncludePath_t;
			newEditFilter.IncludePath_n = this.IncludePath_n;
			newEditFilter.IncludePatm_m = this.IncludePatm_m;
			newEditFilter.IncludePath_ostage = this.IncludePath_ostage;
			newEditFilter.IncludePts_groupid = this.IncludePts_groupid;
			newEditFilter.IncludePts_siteid = this.IncludePts_siteid;
			newEditFilter.IncludePrim_tum_stat_id = this.IncludePrim_tum_stat_id;
			
			return newEditFilter;
		}
	}
}
