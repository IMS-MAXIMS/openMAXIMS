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
// Template ver. 1.1.0 - Last modified on 04/10/2004 11:00 by Marius Mihalec

package ims.dto.client;

public final class Diagnosis implements ims.vo.ImsCloneable
{
	private DiagnosisFilter lastGetFilter = null;
	private final String serviceName = "DIAGNOSIS";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public DiagnosisFilter Filter = new DiagnosisFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public DiagnosisEditFilter EditFilter = new DiagnosisEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public DiagnosisCollection DataCollection = new DiagnosisCollection();

	/**
	 * Creates a new Diagnosis Data Transfer Object.
	 */ 
	public Diagnosis(ims.dto.Connection connection)
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
	public Diagnosis cloneObject()
	{
		Diagnosis cloneObject = new Diagnosis(Connection);
			
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
			cloneObject.DataCollection.get(index).Ccs_epid = DataCollection.get(x).Ccs_epid;
			cloneObject.DataCollection.get(index).Session_id = DataCollection.get(x).Session_id;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).Curr_stat = DataCollection.get(x).Curr_stat;
			cloneObject.DataCollection.get(index).Dcde = DataCollection.get(x).Dcde;
			cloneObject.DataCollection.get(index).Dtrm = DataCollection.get(x).Dtrm;
			cloneObject.DataCollection.get(index).Dtxt = DataCollection.get(x).Dtxt;
			cloneObject.DataCollection.get(index).Dicl = DataCollection.get(x).Dicl;
			cloneObject.DataCollection.get(index).Stcd = DataCollection.get(x).Stcd;
			cloneObject.DataCollection.get(index).Sevr = DataCollection.get(x).Sevr;
			cloneObject.DataCollection.get(index).Svcd = DataCollection.get(x).Svcd;
			cloneObject.DataCollection.get(index).Diad = DataCollection.get(x).Diad;
			cloneObject.DataCollection.get(index).Edat = DataCollection.get(x).Edat;
			cloneObject.DataCollection.get(index).Diad_day = DataCollection.get(x).Diad_day;
			cloneObject.DataCollection.get(index).Diad_month = DataCollection.get(x).Diad_month;
			cloneObject.DataCollection.get(index).Diad_year = DataCollection.get(x).Diad_year;
			cloneObject.DataCollection.get(index).Onstd = DataCollection.get(x).Onstd;
			cloneObject.DataCollection.get(index).Onstd_day = DataCollection.get(x).Onstd_day;
			cloneObject.DataCollection.get(index).Onstd_month = DataCollection.get(x).Onstd_month;
			cloneObject.DataCollection.get(index).Onstd_year = DataCollection.get(x).Onstd_year;
			cloneObject.DataCollection.get(index).Dhcp = DataCollection.get(x).Dhcp;
			cloneObject.DataCollection.get(index).Diaghcp = DataCollection.get(x).Diaghcp;
			cloneObject.DataCollection.get(index).Dept = DataCollection.get(x).Dept;
			cloneObject.DataCollection.get(index).Exclude_oth = DataCollection.get(x).Exclude_oth;
			cloneObject.DataCollection.get(index).Diag_srce = DataCollection.get(x).Diag_srce;
			cloneObject.DataCollection.get(index).Axis = DataCollection.get(x).Axis;
			cloneObject.DataCollection.get(index).Body_sys = DataCollection.get(x).Body_sys;
			cloneObject.DataCollection.get(index).Acqd = DataCollection.get(x).Acqd;
			cloneObject.DataCollection.get(index).Eust = DataCollection.get(x).Eust;
			cloneObject.DataCollection.get(index).Kind = DataCollection.get(x).Kind;
			cloneObject.DataCollection.get(index).Pmh_flag = DataCollection.get(x).Pmh_flag;
			cloneObject.DataCollection.get(index).Investigated = DataCollection.get(x).Investigated;
			cloneObject.DataCollection.get(index).Confirmed = DataCollection.get(x).Confirmed;
			cloneObject.DataCollection.get(index).Inv_conf_comm = DataCollection.get(x).Inv_conf_comm;
			cloneObject.DataCollection.get(index).Lateral = DataCollection.get(x).Lateral;
			cloneObject.DataCollection.get(index).Clasdiag = DataCollection.get(x).Clasdiag;
			cloneObject.DataCollection.get(index).Clasdiagtxt = DataCollection.get(x).Clasdiagtxt;
			cloneObject.DataCollection.get(index).Sevrtxt = DataCollection.get(x).Sevrtxt;
			cloneObject.DataCollection.get(index).Dhcptxt = DataCollection.get(x).Dhcptxt;
			cloneObject.DataCollection.get(index).Depttxt = DataCollection.get(x).Depttxt;
			cloneObject.DataCollection.get(index).Latertxt = DataCollection.get(x).Latertxt;
			cloneObject.DataCollection.get(index).Diaglkupid = DataCollection.get(x).Diaglkupid;
							
			
			for(int iSeqno = 0; iSeqno < DataCollection.get(x).SeqnoCollection.count(); iSeqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnoCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Seqno = DataCollection.get(x).SeqnoCollection.get(iSeqno).Seqno;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Episode_id = DataCollection.get(x).SeqnoCollection.get(iSeqno).Episode_id;
										
			}
			
			for(int iSeqno1 = 0; iSeqno1 < DataCollection.get(x).Seqno1Collection.count(); iSeqno1++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno1Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno1Collection.get(rIndex).Seqno1 = DataCollection.get(x).Seqno1Collection.get(iSeqno1).Seqno1;
				cloneObject.DataCollection.get(index).Seqno1Collection.get(rIndex).Spced_diag_id = DataCollection.get(x).Seqno1Collection.get(iSeqno1).Spced_diag_id;
				cloneObject.DataCollection.get(index).Seqno1Collection.get(rIndex).Refine_id = DataCollection.get(x).Seqno1Collection.get(iSeqno1).Refine_id;
										
			}
			
			for(int iSeqno2 = 0; iSeqno2 < DataCollection.get(x).Seqno2Collection.count(); iSeqno2++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno2Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Seqno2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Seqno2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Informed_id = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Informed_id;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Inform_stat = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Inform_stat;
										
			}
			
			for(int iSeqno3 = 0; iSeqno3 < DataCollection.get(x).Seqno3Collection.count(); iSeqno3++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno3Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Seqno3 = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Seqno3;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Basis_type = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Basis_type;
										
			}
			
			for(int iSeqno4 = 0; iSeqno4 < DataCollection.get(x).Seqno4Collection.count(); iSeqno4++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno4Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Seqno4 = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Seqno4;
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Status_id = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Status_id;
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Status_dat = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Status_dat;
										
			}
			
			for(int iSeqno5 = 0; iSeqno5 < DataCollection.get(x).Seqno5Collection.count(); iSeqno5++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno5Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno5Collection.get(rIndex).Seqno5 = DataCollection.get(x).Seqno5Collection.get(iSeqno5).Seqno5;
				cloneObject.DataCollection.get(index).Seqno5Collection.get(rIndex).Assoc_id = DataCollection.get(x).Seqno5Collection.get(iSeqno5).Assoc_id;
										
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
		return "Diagnosis.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Diagnosis.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Diagnosis.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Diagnosis.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Diagnosis.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Diagnosis.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Diagnosis.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Diagnosis.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Diagnosis.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Diagnosis.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Diagnosis.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Diagnosis.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Diagnosis.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Diagnosis.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Diagnosis.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Diagnosis.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Diagnosis.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Diagnosis.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Diagnosis.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Diagnosis.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Diagnosis.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Diagnosis.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Diagnosis.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Diagnosis.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Diagnosis.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Diagnosis.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Diagnosis.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Diagnosis.List");
							
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
	private String encodeNASFilter(DiagnosisFilter filter)
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
		
		if(Filter.Ccs_epid != null && filter.Ccs_epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccs_epid;
		}
		
		if(Filter.Session_id != null && filter.Session_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SESSION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Session_id;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat;
		}
		
		if(Filter.Curr_stat != null && filter.Curr_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CURR_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Curr_stat;
		}
		
		if(Filter.Dcde != null && filter.Dcde.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DCDE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dcde;
		}
		
		if(Filter.Dtrm != null && filter.Dtrm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DTRM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dtrm;
		}
		
		if(Filter.Dtxt != null && filter.Dtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dtxt;
		}
		
		if(Filter.Dicl != null && filter.Dicl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DICL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dicl;
		}
		
		if(Filter.Stcd != null && filter.Stcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stcd;
		}
		
		if(Filter.Sevr != null && filter.Sevr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SEVR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sevr;
		}
		
		if(Filter.Svcd != null && filter.Svcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SVCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Svcd;
		}
		
		if(Filter.Diad != null && filter.Diad.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DIAD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Diad;
		}
		
		if(Filter.Edat != null && filter.Edat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Edat;
		}
		
		if(Filter.Diad_day != null && filter.Diad_day.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DIAD_DAY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Diad_day;
		}
		
		if(Filter.Diad_month != null && filter.Diad_month.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DIAD_MONTH" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Diad_month;
		}
		
		if(Filter.Diad_year != null && filter.Diad_year.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DIAD_YEAR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Diad_year;
		}
		
		if(Filter.Onstd != null && filter.Onstd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ONSTD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Onstd;
		}
		
		if(Filter.Onstd_day != null && filter.Onstd_day.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ONSTD_DAY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Onstd_day;
		}
		
		if(Filter.Onstd_month != null && filter.Onstd_month.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ONSTD_MONTH" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Onstd_month;
		}
		
		if(Filter.Onstd_year != null && filter.Onstd_year.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ONSTD_YEAR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Onstd_year;
		}
		
		if(Filter.Dhcp != null && filter.Dhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dhcp;
		}
		
		if(Filter.Diaghcp != null && filter.Diaghcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DIAGHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Diaghcp;
		}
		
		if(Filter.Dept != null && filter.Dept.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DEPT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dept;
		}
		
		if(Filter.Exclude_oth != null && filter.Exclude_oth.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EXCLUDE_OTH" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Exclude_oth;
		}
		
		if(Filter.Diag_srce != null && filter.Diag_srce.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DIAG_SRCE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Diag_srce;
		}
		
		if(Filter.Axis != null && filter.Axis.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AXIS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Axis;
		}
		
		if(Filter.Body_sys != null && filter.Body_sys.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BODY_SYS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Body_sys;
		}
		
		if(Filter.Acqd != null && filter.Acqd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACQD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Acqd;
		}
		
		if(Filter.Eust != null && filter.Eust.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EUST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eust;
		}
		
		if(Filter.Kind != null && filter.Kind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "KIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Kind;
		}
		
		if(Filter.Pmh_flag != null && filter.Pmh_flag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PMH_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pmh_flag;
		}
		
		if(Filter.Investigated != null && filter.Investigated.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INVESTIGATED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Investigated;
		}
		
		if(Filter.Confirmed != null && filter.Confirmed.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONFIRMED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Confirmed;
		}
		
		if(Filter.Inv_conf_comm != null && filter.Inv_conf_comm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INV_CONF_COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Inv_conf_comm;
		}
		
		if(Filter.Lateral != null && filter.Lateral.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LATERAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lateral;
		}
		
		if(Filter.Clasdiag != null && filter.Clasdiag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLASDIAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clasdiag;
		}
		
		if(Filter.Clasdiagtxt != null && filter.Clasdiagtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLASDIAGTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clasdiagtxt;
		}
		
		if(Filter.Sevrtxt != null && filter.Sevrtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SEVRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sevrtxt;
		}
		
		if(Filter.Dhcptxt != null && filter.Dhcptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dhcptxt;
		}
		
		if(Filter.Depttxt != null && filter.Depttxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DEPTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Depttxt;
		}
		
		if(Filter.Latertxt != null && filter.Latertxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LATERTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Latertxt;
		}
		
		if(Filter.Diaglkupid != null && filter.Diaglkupid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DIAGLKUPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Diaglkupid;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		DiagnosisRecord data = (DiagnosisRecord)DataCollection.get(0);
		
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
		
		if(EditFilter.IncludeCcs_epid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccs_epid);
		}
		
		if(EditFilter.IncludeSession_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SESSION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Session_id);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat);
		}
		
		if(EditFilter.IncludeCurr_stat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CURR_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Curr_stat);
		}
		
		if(EditFilter.IncludeDcde)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DCDE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dcde);
		}
		
		if(EditFilter.IncludeDtrm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DTRM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dtrm);
		}
		
		if(EditFilter.IncludeDtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dtxt);
		}
		
		if(EditFilter.IncludeDicl)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DICL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dicl);
		}
		
		if(EditFilter.IncludeStcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stcd);
		}
		
		if(EditFilter.IncludeSevr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEVR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sevr);
		}
		
		if(EditFilter.IncludeSvcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SVCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Svcd);
		}
		
		if(EditFilter.IncludeDiad)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DIAD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Diad);
		}
		
		if(EditFilter.IncludeEdat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Edat);
		}
		
		if(EditFilter.IncludeDiad_day)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DIAD_DAY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Diad_day);
		}
		
		if(EditFilter.IncludeDiad_month)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DIAD_MONTH" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Diad_month);
		}
		
		if(EditFilter.IncludeDiad_year)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DIAD_YEAR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Diad_year);
		}
		
		if(EditFilter.IncludeOnstd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ONSTD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Onstd);
		}
		
		if(EditFilter.IncludeOnstd_day)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ONSTD_DAY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Onstd_day);
		}
		
		if(EditFilter.IncludeOnstd_month)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ONSTD_MONTH" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Onstd_month);
		}
		
		if(EditFilter.IncludeOnstd_year)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ONSTD_YEAR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Onstd_year);
		}
		
		if(EditFilter.IncludeDhcp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dhcp);
		}
		
		if(EditFilter.IncludeDiaghcp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DIAGHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Diaghcp);
		}
		
		if(EditFilter.IncludeDept)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DEPT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dept);
		}
		
		if(EditFilter.IncludeExclude_oth)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EXCLUDE_OTH" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Exclude_oth);
		}
		
		if(EditFilter.IncludeDiag_srce)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DIAG_SRCE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Diag_srce);
		}
		
		if(EditFilter.IncludeAxis)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AXIS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Axis);
		}
		
		if(EditFilter.IncludeBody_sys)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BODY_SYS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Body_sys);
		}
		
		if(EditFilter.IncludeAcqd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACQD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Acqd);
		}
		
		if(EditFilter.IncludeEust)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EUST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eust);
		}
		
		if(EditFilter.IncludeKind)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "KIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Kind);
		}
		
		if(EditFilter.IncludePmh_flag)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PMH_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pmh_flag);
		}
		
		if(EditFilter.IncludeInvestigated)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INVESTIGATED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Investigated);
		}
		
		if(EditFilter.IncludeConfirmed)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONFIRMED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Confirmed);
		}
		
		if(EditFilter.IncludeInv_conf_comm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INV_CONF_COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Inv_conf_comm);
		}
		
		if(EditFilter.IncludeLateral)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LATERAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lateral);
		}
		
		if(EditFilter.IncludeClasdiag)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLASDIAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clasdiag);
		}
		
		if(EditFilter.IncludeClasdiagtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLASDIAGTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clasdiagtxt);
		}
		
		if(EditFilter.IncludeSevrtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEVRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sevrtxt);
		}
		
		if(EditFilter.IncludeDhcptxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dhcptxt);
		}
		
		if(EditFilter.IncludeDepttxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DEPTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Depttxt);
		}
		
		if(EditFilter.IncludeLatertxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LATERTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Latertxt);
		}
		
		if(EditFilter.IncludeDiaglkupid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DIAGLKUPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Diaglkupid);
		}
		
		
		for(int x = 0; x < data.SeqnoCollection.count(); x++)
		{
			DiagnosisSeqnoRecord rgRecord = (DiagnosisSeqnoRecord)data.SeqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EPISODE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Episode_id);
			
		}
		for(int x = 0; x < data.Seqno1Collection.count(); x++)
		{
			DiagnosisSeqno1Record rgRecord = (DiagnosisSeqno1Record)data.Seqno1Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno1);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPCED_DIAG_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Spced_diag_id);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFINE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Refine_id);
			
		}
		for(int x = 0; x < data.Seqno2Collection.count(); x++)
		{
			DiagnosisSeqno2Record rgRecord = (DiagnosisSeqno2Record)data.Seqno2Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno2);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INFORMED_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Informed_id);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INFORM_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Inform_stat);
			
		}
		for(int x = 0; x < data.Seqno3Collection.count(); x++)
		{
			DiagnosisSeqno3Record rgRecord = (DiagnosisSeqno3Record)data.Seqno3Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno3);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BASIS_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Basis_type);
			
		}
		for(int x = 0; x < data.Seqno4Collection.count(); x++)
		{
			DiagnosisSeqno4Record rgRecord = (DiagnosisSeqno4Record)data.Seqno4Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno4);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STATUS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Status_id);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STATUS_DAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Status_dat);
			
		}
		for(int x = 0; x < data.Seqno5Collection.count(); x++)
		{
			DiagnosisSeqno5Record rgRecord = (DiagnosisSeqno5Record)data.Seqno5Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno5);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ASSOC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Assoc_id);
			
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
			DiagnosisRecord record = new DiagnosisRecord();
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
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Session_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSION_ID"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Curr_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURR_STAT"));
			record.Dcde = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DCDE"));
			record.Dtrm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTRM"));
			record.Dtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTXT"));
			record.Dicl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DICL"));
			record.Stcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STCD"));
			record.Sevr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEVR"));
			record.Svcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SVCD"));
			record.Diad = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAD"));
			record.Edat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EDAT"));
			record.Diad_day = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAD_DAY"));
			record.Diad_month = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAD_MONTH"));
			record.Diad_year = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAD_YEAR"));
			record.Onstd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONSTD"));
			record.Onstd_day = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONSTD_DAY"));
			record.Onstd_month = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONSTD_MONTH"));
			record.Onstd_year = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONSTD_YEAR"));
			record.Dhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DHCP"));
			record.Diaghcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAGHCP"));
			record.Dept = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DEPT"));
			record.Exclude_oth = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXCLUDE_OTH"));
			record.Diag_srce = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAG_SRCE"));
			record.Axis = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AXIS"));
			record.Body_sys = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BODY_SYS"));
			record.Acqd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACQD"));
			record.Eust = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EUST"));
			record.Kind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "KIND"));
			record.Pmh_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PMH_FLAG"));
			record.Investigated = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVESTIGATED"));
			record.Confirmed = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONFIRMED"));
			record.Inv_conf_comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INV_CONF_COMM"));
			record.Lateral = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LATERAL"));
			record.Clasdiag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLASDIAG"));
			record.Clasdiagtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLASDIAGTXT"));
			record.Sevrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEVRTXT"));
			record.Dhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DHCPTXT"));
			record.Depttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DEPTTXT"));
			record.Latertxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LATERTXT"));
			record.Diaglkupid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAGLKUPID"));
									
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
			DiagnosisRecord record = new DiagnosisRecord();
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
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Session_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESSION_ID"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Curr_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURR_STAT"));
			record.Dcde = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DCDE"));
			record.Dtrm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTRM"));
			record.Dtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTXT"));
			record.Dicl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DICL"));
			record.Stcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STCD"));
			record.Sevr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEVR"));
			record.Svcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SVCD"));
			record.Diad = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAD"));
			record.Edat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EDAT"));
			record.Diad_day = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAD_DAY"));
			record.Diad_month = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAD_MONTH"));
			record.Diad_year = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAD_YEAR"));
			record.Onstd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONSTD"));
			record.Onstd_day = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONSTD_DAY"));
			record.Onstd_month = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONSTD_MONTH"));
			record.Onstd_year = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONSTD_YEAR"));
			record.Dhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DHCP"));
			record.Diaghcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAGHCP"));
			record.Dept = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DEPT"));
			record.Exclude_oth = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXCLUDE_OTH"));
			record.Diag_srce = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAG_SRCE"));
			record.Axis = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AXIS"));
			record.Body_sys = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BODY_SYS"));
			record.Acqd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACQD"));
			record.Eust = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EUST"));
			record.Kind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "KIND"));
			record.Pmh_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PMH_FLAG"));
			record.Investigated = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVESTIGATED"));
			record.Confirmed = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONFIRMED"));
			record.Inv_conf_comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INV_CONF_COMM"));
			record.Lateral = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LATERAL"));
			record.Clasdiag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLASDIAG"));
			record.Clasdiagtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLASDIAGTXT"));
			record.Sevrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEVRTXT"));
			record.Dhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DHCPTXT"));
			record.Depttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DEPTTXT"));
			record.Latertxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LATERTXT"));
			record.Diaglkupid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIAGLKUPID"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					record.SeqnoCollection.add();
			
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
			
									
			rgCount = record.SeqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					{
						DiagnosisSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("episode_id"))
					{
						DiagnosisSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Episode_id = Connection.getAttributeValue(valueItems[i]);
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
						DiagnosisSeqno1Record rgRecord = record.Seqno1Collection.get(recCount);
						rgRecord.Seqno1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("spced_diag_id"))
					{
						DiagnosisSeqno1Record rgRecord = record.Seqno1Collection.get(recCount);
						rgRecord.Spced_diag_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("refine_id"))
					{
						DiagnosisSeqno1Record rgRecord = record.Seqno1Collection.get(recCount);
						rgRecord.Refine_id = Connection.getAttributeValue(valueItems[i]);
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
						DiagnosisSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Seqno2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("informed_id"))
					{
						DiagnosisSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Informed_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("inform_stat"))
					{
						DiagnosisSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Inform_stat = Connection.getAttributeValue(valueItems[i]);
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
						DiagnosisSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Seqno3 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("basis_type"))
					{
						DiagnosisSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Basis_type = Connection.getAttributeValue(valueItems[i]);
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
						DiagnosisSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Seqno4 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("status_id"))
					{
						DiagnosisSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Status_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("status_dat"))
					{
						DiagnosisSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Status_dat = Connection.getAttributeValue(valueItems[i]);
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
						DiagnosisSeqno5Record rgRecord = record.Seqno5Collection.get(recCount);
						rgRecord.Seqno5 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("assoc_id"))
					{
						DiagnosisSeqno5Record rgRecord = record.Seqno5Collection.get(recCount);
						rgRecord.Assoc_id = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class DiagnosisCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DiagnosisRecord newRecord = new DiagnosisRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DiagnosisRecord record)
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
		public DiagnosisRecord get(int index)
		{
			return (DiagnosisRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class DiagnosisRecord
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
		public String Ccs_epid = "";
		public String Session_id = "";
		public String Tstp = "";
		public String Stat = "";
		public String Curr_stat = "";
		public String Dcde = "";
		public String Dtrm = "";
		public String Dtxt = "";
		public String Dicl = "";
		public String Stcd = "";
		public String Sevr = "";
		public String Svcd = "";
		public String Diad = "";
		public String Edat = "";
		public String Diad_day = "";
		public String Diad_month = "";
		public String Diad_year = "";
		public String Onstd = "";
		public String Onstd_day = "";
		public String Onstd_month = "";
		public String Onstd_year = "";
		public String Dhcp = "";
		public String Diaghcp = "";
		public String Dept = "";
		public String Exclude_oth = "";
		public String Diag_srce = "";
		public String Axis = "";
		public String Body_sys = "";
		public String Acqd = "";
		public String Eust = "";
		public String Kind = "";
		public String Pmh_flag = "";
		public String Investigated = "";
		public String Confirmed = "";
		public String Inv_conf_comm = "";
		public String Lateral = "";
		public String Clasdiag = "";
		public String Clasdiagtxt = "";
		public String Sevrtxt = "";
		public String Dhcptxt = "";
		public String Depttxt = "";
		public String Latertxt = "";
		public String Diaglkupid = "";
		
		public DiagnosisSeqnoCollection SeqnoCollection = new DiagnosisSeqnoCollection();
		public DiagnosisSeqno1Collection Seqno1Collection = new DiagnosisSeqno1Collection();
		public DiagnosisSeqno2Collection Seqno2Collection = new DiagnosisSeqno2Collection();
		public DiagnosisSeqno3Collection Seqno3Collection = new DiagnosisSeqno3Collection();
		public DiagnosisSeqno4Collection Seqno4Collection = new DiagnosisSeqno4Collection();
		public DiagnosisSeqno5Collection Seqno5Collection = new DiagnosisSeqno5Collection();		
		
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
			Ccs_epid = "";
			Session_id = "";
			Tstp = "";
			Stat = "";
			Curr_stat = "";
			Dcde = "";
			Dtrm = "";
			Dtxt = "";
			Dicl = "";
			Stcd = "";
			Sevr = "";
			Svcd = "";
			Diad = "";
			Edat = "";
			Diad_day = "";
			Diad_month = "";
			Diad_year = "";
			Onstd = "";
			Onstd_day = "";
			Onstd_month = "";
			Onstd_year = "";
			Dhcp = "";
			Diaghcp = "";
			Dept = "";
			Exclude_oth = "";
			Diag_srce = "";
			Axis = "";
			Body_sys = "";
			Acqd = "";
			Eust = "";
			Kind = "";
			Pmh_flag = "";
			Investigated = "";
			Confirmed = "";
			Inv_conf_comm = "";
			Lateral = "";
			Clasdiag = "";
			Clasdiagtxt = "";
			Sevrtxt = "";
			Dhcptxt = "";
			Depttxt = "";
			Latertxt = "";
			Diaglkupid = "";
			
			SeqnoCollection.clear();
			Seqno1Collection.clear();
			Seqno2Collection.clear();
			Seqno3Collection.clear();
			Seqno4Collection.clear();
			Seqno5Collection.clear();
		}		
	}
	
	public final class DiagnosisSeqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DiagnosisSeqnoRecord newRecord = new DiagnosisSeqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DiagnosisSeqnoRecord record)
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
		public DiagnosisSeqnoRecord get(int index)
		{
			return (DiagnosisSeqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class DiagnosisSeqno1Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DiagnosisSeqno1Record newRecord = new DiagnosisSeqno1Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DiagnosisSeqno1Record record)
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
		public DiagnosisSeqno1Record get(int index)
		{
			return (DiagnosisSeqno1Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class DiagnosisSeqno2Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DiagnosisSeqno2Record newRecord = new DiagnosisSeqno2Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DiagnosisSeqno2Record record)
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
		public DiagnosisSeqno2Record get(int index)
		{
			return (DiagnosisSeqno2Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class DiagnosisSeqno3Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DiagnosisSeqno3Record newRecord = new DiagnosisSeqno3Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DiagnosisSeqno3Record record)
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
		public DiagnosisSeqno3Record get(int index)
		{
			return (DiagnosisSeqno3Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class DiagnosisSeqno4Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DiagnosisSeqno4Record newRecord = new DiagnosisSeqno4Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DiagnosisSeqno4Record record)
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
		public DiagnosisSeqno4Record get(int index)
		{
			return (DiagnosisSeqno4Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class DiagnosisSeqno5Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DiagnosisSeqno5Record newRecord = new DiagnosisSeqno5Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DiagnosisSeqno5Record record)
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
		public DiagnosisSeqno5Record get(int index)
		{
			return (DiagnosisSeqno5Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class DiagnosisSeqnoRecord
	{
		public String Seqno = "";
		public String Episode_id = "";
		
		public void clear()
		{
			Seqno = "";
			Episode_id = "";
			
		}
	}
	public final class DiagnosisSeqno1Record
	{
		public String Seqno1 = "";
		public String Spced_diag_id = "";
		public String Refine_id = "";
		
		public void clear()
		{
			Seqno1 = "";
			Spced_diag_id = "";
			Refine_id = "";
			
		}
	}
	public final class DiagnosisSeqno2Record
	{
		public String Seqno2 = "";
		public String Informed_id = "";
		public String Inform_stat = "";
		
		public void clear()
		{
			Seqno2 = "";
			Informed_id = "";
			Inform_stat = "";
			
		}
	}
	public final class DiagnosisSeqno3Record
	{
		public String Seqno3 = "";
		public String Basis_type = "";
		
		public void clear()
		{
			Seqno3 = "";
			Basis_type = "";
			
		}
	}
	public final class DiagnosisSeqno4Record
	{
		public String Seqno4 = "";
		public String Status_id = "";
		public String Status_dat = "";
		
		public void clear()
		{
			Seqno4 = "";
			Status_id = "";
			Status_dat = "";
			
		}
	}
	public final class DiagnosisSeqno5Record
	{
		public String Seqno5 = "";
		public String Assoc_id = "";
		
		public void clear()
		{
			Seqno5 = "";
			Assoc_id = "";
			
		}
	}	
	public final class DiagnosisFilter
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
		public String Ccs_epid = "";
		public String Session_id = "";
		public String Tstp = "";
		public String Stat = "";
		public String Curr_stat = "";
		public String Dcde = "";
		public String Dtrm = "";
		public String Dtxt = "";
		public String Dicl = "";
		public String Stcd = "";
		public String Sevr = "";
		public String Svcd = "";
		public String Diad = "";
		public String Edat = "";
		public String Diad_day = "";
		public String Diad_month = "";
		public String Diad_year = "";
		public String Onstd = "";
		public String Onstd_day = "";
		public String Onstd_month = "";
		public String Onstd_year = "";
		public String Dhcp = "";
		public String Diaghcp = "";
		public String Dept = "";
		public String Exclude_oth = "";
		public String Diag_srce = "";
		public String Axis = "";
		public String Body_sys = "";
		public String Acqd = "";
		public String Eust = "";
		public String Kind = "";
		public String Pmh_flag = "";
		public String Investigated = "";
		public String Confirmed = "";
		public String Inv_conf_comm = "";
		public String Lateral = "";
		public String Clasdiag = "";
		public String Clasdiagtxt = "";
		public String Sevrtxt = "";
		public String Dhcptxt = "";
		public String Depttxt = "";
		public String Latertxt = "";
		public String Diaglkupid = "";
		
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
			Ccs_epid = "";
			Session_id = "";
			Tstp = "";
			Stat = "";
			Curr_stat = "";
			Dcde = "";
			Dtrm = "";
			Dtxt = "";
			Dicl = "";
			Stcd = "";
			Sevr = "";
			Svcd = "";
			Diad = "";
			Edat = "";
			Diad_day = "";
			Diad_month = "";
			Diad_year = "";
			Onstd = "";
			Onstd_day = "";
			Onstd_month = "";
			Onstd_year = "";
			Dhcp = "";
			Diaghcp = "";
			Dept = "";
			Exclude_oth = "";
			Diag_srce = "";
			Axis = "";
			Body_sys = "";
			Acqd = "";
			Eust = "";
			Kind = "";
			Pmh_flag = "";
			Investigated = "";
			Confirmed = "";
			Inv_conf_comm = "";
			Lateral = "";
			Clasdiag = "";
			Clasdiagtxt = "";
			Sevrtxt = "";
			Dhcptxt = "";
			Depttxt = "";
			Latertxt = "";
			Diaglkupid = "";
		}	
		public DiagnosisFilter cloneObject()
		{
			DiagnosisFilter newFilter = new DiagnosisFilter();
			
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
			newFilter.Ccs_epid = this.Ccs_epid;
			newFilter.Session_id = this.Session_id;
			newFilter.Tstp = this.Tstp;
			newFilter.Stat = this.Stat;
			newFilter.Curr_stat = this.Curr_stat;
			newFilter.Dcde = this.Dcde;
			newFilter.Dtrm = this.Dtrm;
			newFilter.Dtxt = this.Dtxt;
			newFilter.Dicl = this.Dicl;
			newFilter.Stcd = this.Stcd;
			newFilter.Sevr = this.Sevr;
			newFilter.Svcd = this.Svcd;
			newFilter.Diad = this.Diad;
			newFilter.Edat = this.Edat;
			newFilter.Diad_day = this.Diad_day;
			newFilter.Diad_month = this.Diad_month;
			newFilter.Diad_year = this.Diad_year;
			newFilter.Onstd = this.Onstd;
			newFilter.Onstd_day = this.Onstd_day;
			newFilter.Onstd_month = this.Onstd_month;
			newFilter.Onstd_year = this.Onstd_year;
			newFilter.Dhcp = this.Dhcp;
			newFilter.Diaghcp = this.Diaghcp;
			newFilter.Dept = this.Dept;
			newFilter.Exclude_oth = this.Exclude_oth;
			newFilter.Diag_srce = this.Diag_srce;
			newFilter.Axis = this.Axis;
			newFilter.Body_sys = this.Body_sys;
			newFilter.Acqd = this.Acqd;
			newFilter.Eust = this.Eust;
			newFilter.Kind = this.Kind;
			newFilter.Pmh_flag = this.Pmh_flag;
			newFilter.Investigated = this.Investigated;
			newFilter.Confirmed = this.Confirmed;
			newFilter.Inv_conf_comm = this.Inv_conf_comm;
			newFilter.Lateral = this.Lateral;
			newFilter.Clasdiag = this.Clasdiag;
			newFilter.Clasdiagtxt = this.Clasdiagtxt;
			newFilter.Sevrtxt = this.Sevrtxt;
			newFilter.Dhcptxt = this.Dhcptxt;
			newFilter.Depttxt = this.Depttxt;
			newFilter.Latertxt = this.Latertxt;
			newFilter.Diaglkupid = this.Diaglkupid;
			
			return newFilter;
		}
	}
	public final class DiagnosisEditFilter
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
		public boolean IncludeCcs_epid = true;
		public boolean IncludeSession_id = true;
		public boolean IncludeTstp = true;
		public boolean IncludeStat = true;
		public boolean IncludeCurr_stat = true;
		public boolean IncludeDcde = true;
		public boolean IncludeDtrm = true;
		public boolean IncludeDtxt = true;
		public boolean IncludeDicl = true;
		public boolean IncludeStcd = true;
		public boolean IncludeSevr = true;
		public boolean IncludeSvcd = true;
		public boolean IncludeDiad = true;
		public boolean IncludeEdat = true;
		public boolean IncludeDiad_day = true;
		public boolean IncludeDiad_month = true;
		public boolean IncludeDiad_year = true;
		public boolean IncludeOnstd = true;
		public boolean IncludeOnstd_day = true;
		public boolean IncludeOnstd_month = true;
		public boolean IncludeOnstd_year = true;
		public boolean IncludeDhcp = true;
		public boolean IncludeDiaghcp = true;
		public boolean IncludeDept = true;
		public boolean IncludeExclude_oth = true;
		public boolean IncludeDiag_srce = true;
		public boolean IncludeAxis = true;
		public boolean IncludeBody_sys = true;
		public boolean IncludeAcqd = true;
		public boolean IncludeEust = true;
		public boolean IncludeKind = true;
		public boolean IncludePmh_flag = true;
		public boolean IncludeInvestigated = true;
		public boolean IncludeConfirmed = true;
		public boolean IncludeInv_conf_comm = true;
		public boolean IncludeLateral = true;
		public boolean IncludeClasdiag = true;
		public boolean IncludeClasdiagtxt = true;
		public boolean IncludeSevrtxt = true;
		public boolean IncludeDhcptxt = true;
		public boolean IncludeDepttxt = true;
		public boolean IncludeLatertxt = true;
		public boolean IncludeDiaglkupid = true;
		
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
			IncludeCcs_epid = true;
			IncludeSession_id = true;
			IncludeTstp = true;
			IncludeStat = true;
			IncludeCurr_stat = true;
			IncludeDcde = true;
			IncludeDtrm = true;
			IncludeDtxt = true;
			IncludeDicl = true;
			IncludeStcd = true;
			IncludeSevr = true;
			IncludeSvcd = true;
			IncludeDiad = true;
			IncludeEdat = true;
			IncludeDiad_day = true;
			IncludeDiad_month = true;
			IncludeDiad_year = true;
			IncludeOnstd = true;
			IncludeOnstd_day = true;
			IncludeOnstd_month = true;
			IncludeOnstd_year = true;
			IncludeDhcp = true;
			IncludeDiaghcp = true;
			IncludeDept = true;
			IncludeExclude_oth = true;
			IncludeDiag_srce = true;
			IncludeAxis = true;
			IncludeBody_sys = true;
			IncludeAcqd = true;
			IncludeEust = true;
			IncludeKind = true;
			IncludePmh_flag = true;
			IncludeInvestigated = true;
			IncludeConfirmed = true;
			IncludeInv_conf_comm = true;
			IncludeLateral = true;
			IncludeClasdiag = true;
			IncludeClasdiagtxt = true;
			IncludeSevrtxt = true;
			IncludeDhcptxt = true;
			IncludeDepttxt = true;
			IncludeLatertxt = true;
			IncludeDiaglkupid = true;
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
			IncludeCcs_epid = false;
			IncludeSession_id = false;
			IncludeTstp = false;
			IncludeStat = false;
			IncludeCurr_stat = false;
			IncludeDcde = false;
			IncludeDtrm = false;
			IncludeDtxt = false;
			IncludeDicl = false;
			IncludeStcd = false;
			IncludeSevr = false;
			IncludeSvcd = false;
			IncludeDiad = false;
			IncludeEdat = false;
			IncludeDiad_day = false;
			IncludeDiad_month = false;
			IncludeDiad_year = false;
			IncludeOnstd = false;
			IncludeOnstd_day = false;
			IncludeOnstd_month = false;
			IncludeOnstd_year = false;
			IncludeDhcp = false;
			IncludeDiaghcp = false;
			IncludeDept = false;
			IncludeExclude_oth = false;
			IncludeDiag_srce = false;
			IncludeAxis = false;
			IncludeBody_sys = false;
			IncludeAcqd = false;
			IncludeEust = false;
			IncludeKind = false;
			IncludePmh_flag = false;
			IncludeInvestigated = false;
			IncludeConfirmed = false;
			IncludeInv_conf_comm = false;
			IncludeLateral = false;
			IncludeClasdiag = false;
			IncludeClasdiagtxt = false;
			IncludeSevrtxt = false;
			IncludeDhcptxt = false;
			IncludeDepttxt = false;
			IncludeLatertxt = false;
			IncludeDiaglkupid = false;
		}
		public DiagnosisEditFilter cloneObject()
		{
			DiagnosisEditFilter newEditFilter = new DiagnosisEditFilter();
			
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
			newEditFilter.IncludeCcs_epid = this.IncludeCcs_epid;
			newEditFilter.IncludeSession_id = this.IncludeSession_id;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeStat = this.IncludeStat;
			newEditFilter.IncludeCurr_stat = this.IncludeCurr_stat;
			newEditFilter.IncludeDcde = this.IncludeDcde;
			newEditFilter.IncludeDtrm = this.IncludeDtrm;
			newEditFilter.IncludeDtxt = this.IncludeDtxt;
			newEditFilter.IncludeDicl = this.IncludeDicl;
			newEditFilter.IncludeStcd = this.IncludeStcd;
			newEditFilter.IncludeSevr = this.IncludeSevr;
			newEditFilter.IncludeSvcd = this.IncludeSvcd;
			newEditFilter.IncludeDiad = this.IncludeDiad;
			newEditFilter.IncludeEdat = this.IncludeEdat;
			newEditFilter.IncludeDiad_day = this.IncludeDiad_day;
			newEditFilter.IncludeDiad_month = this.IncludeDiad_month;
			newEditFilter.IncludeDiad_year = this.IncludeDiad_year;
			newEditFilter.IncludeOnstd = this.IncludeOnstd;
			newEditFilter.IncludeOnstd_day = this.IncludeOnstd_day;
			newEditFilter.IncludeOnstd_month = this.IncludeOnstd_month;
			newEditFilter.IncludeOnstd_year = this.IncludeOnstd_year;
			newEditFilter.IncludeDhcp = this.IncludeDhcp;
			newEditFilter.IncludeDiaghcp = this.IncludeDiaghcp;
			newEditFilter.IncludeDept = this.IncludeDept;
			newEditFilter.IncludeExclude_oth = this.IncludeExclude_oth;
			newEditFilter.IncludeDiag_srce = this.IncludeDiag_srce;
			newEditFilter.IncludeAxis = this.IncludeAxis;
			newEditFilter.IncludeBody_sys = this.IncludeBody_sys;
			newEditFilter.IncludeAcqd = this.IncludeAcqd;
			newEditFilter.IncludeEust = this.IncludeEust;
			newEditFilter.IncludeKind = this.IncludeKind;
			newEditFilter.IncludePmh_flag = this.IncludePmh_flag;
			newEditFilter.IncludeInvestigated = this.IncludeInvestigated;
			newEditFilter.IncludeConfirmed = this.IncludeConfirmed;
			newEditFilter.IncludeInv_conf_comm = this.IncludeInv_conf_comm;
			newEditFilter.IncludeLateral = this.IncludeLateral;
			newEditFilter.IncludeClasdiag = this.IncludeClasdiag;
			newEditFilter.IncludeClasdiagtxt = this.IncludeClasdiagtxt;
			newEditFilter.IncludeSevrtxt = this.IncludeSevrtxt;
			newEditFilter.IncludeDhcptxt = this.IncludeDhcptxt;
			newEditFilter.IncludeDepttxt = this.IncludeDepttxt;
			newEditFilter.IncludeLatertxt = this.IncludeLatertxt;
			newEditFilter.IncludeDiaglkupid = this.IncludeDiaglkupid;
			
			return newEditFilter;
		}
	}
}
