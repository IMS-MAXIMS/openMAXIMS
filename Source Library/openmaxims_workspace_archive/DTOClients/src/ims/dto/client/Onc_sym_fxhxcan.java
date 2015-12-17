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

public final class Onc_sym_fxhxcan implements ims.vo.ImsCloneable
{
	private Onc_sym_fxhxcanFilter lastGetFilter = null;
	private final String serviceName = "ONC_SYM_FXHXCAN";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Onc_sym_fxhxcanFilter Filter = new Onc_sym_fxhxcanFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Onc_sym_fxhxcanEditFilter EditFilter = new Onc_sym_fxhxcanEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Onc_sym_fxhxcanCollection DataCollection = new Onc_sym_fxhxcanCollection();

	/**
	 * Creates a new Onc_sym_fxhxcan Data Transfer Object.
	 */ 
	public Onc_sym_fxhxcan(ims.dto.Connection connection)
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
	public Onc_sym_fxhxcan cloneObject()
	{
		Onc_sym_fxhxcan cloneObject = new Onc_sym_fxhxcan(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Onc_sym_fxhxcan_id = DataCollection.get(x).Onc_sym_fxhxcan_id;
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
			cloneObject.DataCollection.get(index).Actind = DataCollection.get(x).Actind;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Co_morb = DataCollection.get(x).Co_morb;
							
			
			for(int iSeqnosym = 0; iSeqnosym < DataCollection.get(x).SeqnosymCollection.count(); iSeqnosym++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnosymCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnosymCollection.get(rIndex).Seqnosym = DataCollection.get(x).SeqnosymCollection.get(iSeqnosym).Seqnosym;
				cloneObject.DataCollection.get(index).SeqnosymCollection.get(rIndex).Act_indsym = DataCollection.get(x).SeqnosymCollection.get(iSeqnosym).Act_indsym;
				cloneObject.DataCollection.get(index).SeqnosymCollection.get(rIndex).Symtdurunit = DataCollection.get(x).SeqnosymCollection.get(iSeqnosym).Symtdurunit;
				cloneObject.DataCollection.get(index).SeqnosymCollection.get(rIndex).Symdur = DataCollection.get(x).SeqnosymCollection.get(iSeqnosym).Symdur;
				cloneObject.DataCollection.get(index).SeqnosymCollection.get(rIndex).Pres_abs = DataCollection.get(x).SeqnosymCollection.get(iSeqnosym).Pres_abs;
				cloneObject.DataCollection.get(index).SeqnosymCollection.get(rIndex).Sympt = DataCollection.get(x).SeqnosymCollection.get(iSeqnosym).Sympt;
										
			}
			
			for(int iSeqnofxhx = 0; iSeqnofxhx < DataCollection.get(x).SeqnofxhxCollection.count(); iSeqnofxhx++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnofxhxCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnofxhxCollection.get(rIndex).Seqnofxhx = DataCollection.get(x).SeqnofxhxCollection.get(iSeqnofxhx).Seqnofxhx;
				cloneObject.DataCollection.get(index).SeqnofxhxCollection.get(rIndex).Act_indfxhx = DataCollection.get(x).SeqnofxhxCollection.get(iSeqnofxhx).Act_indfxhx;
				cloneObject.DataCollection.get(index).SeqnofxhxCollection.get(rIndex).Relincidence = DataCollection.get(x).SeqnofxhxCollection.get(iSeqnofxhx).Relincidence;
				cloneObject.DataCollection.get(index).SeqnofxhxCollection.get(rIndex).Relrelationship = DataCollection.get(x).SeqnofxhxCollection.get(iSeqnofxhx).Relrelationship;
				cloneObject.DataCollection.get(index).SeqnofxhxCollection.get(rIndex).Canccat = DataCollection.get(x).SeqnofxhxCollection.get(iSeqnofxhx).Canccat;
										
			}
			
			for(int iSeqillhx = 0; iSeqillhx < DataCollection.get(x).SeqillhxCollection.count(); iSeqillhx++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqillhxCollection.add();
					
				cloneObject.DataCollection.get(index).SeqillhxCollection.get(rIndex).Seqillhx = DataCollection.get(x).SeqillhxCollection.get(iSeqillhx).Seqillhx;
				cloneObject.DataCollection.get(index).SeqillhxCollection.get(rIndex).Act_indillhx = DataCollection.get(x).SeqillhxCollection.get(iSeqillhx).Act_indillhx;
				cloneObject.DataCollection.get(index).SeqillhxCollection.get(rIndex).Eventdetails = DataCollection.get(x).SeqillhxCollection.get(iSeqillhx).Eventdetails;
				cloneObject.DataCollection.get(index).SeqillhxCollection.get(rIndex).Eventdate = DataCollection.get(x).SeqillhxCollection.get(iSeqillhx).Eventdate;
										
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
		return "Onc_sym_fxhxcan.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_sym_fxhxcan.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Onc_sym_fxhxcan.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_sym_fxhxcan.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_sym_fxhxcan.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_sym_fxhxcan.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Onc_sym_fxhxcan.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Onc_sym_fxhxcan.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_sym_fxhxcan.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Onc_sym_fxhxcan.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Onc_sym_fxhxcan.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Onc_sym_fxhxcan.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Onc_sym_fxhxcan.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Onc_sym_fxhxcan.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_sym_fxhxcan.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Onc_sym_fxhxcan.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Onc_sym_fxhxcan.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Onc_sym_fxhxcan.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Onc_sym_fxhxcan.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Onc_sym_fxhxcan.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_sym_fxhxcan.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Onc_sym_fxhxcan.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Onc_sym_fxhxcan.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_sym_fxhxcan.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Onc_sym_fxhxcan.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Onc_sym_fxhxcan.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Onc_sym_fxhxcan.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_sym_fxhxcan.List");
							
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
	private String encodeNASFilter(Onc_sym_fxhxcanFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Onc_sym_fxhxcan_id != null && filter.Onc_sym_fxhxcan_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ONC_SYM_FXHXCAN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Onc_sym_fxhxcan_id;
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
		
		if(Filter.Actind != null && filter.Actind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Actind;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Co_morb != null && filter.Co_morb.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CO_MORB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Co_morb;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Onc_sym_fxhxcanRecord data = (Onc_sym_fxhxcanRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeOnc_sym_fxhxcan_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ONC_SYM_FXHXCAN_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Onc_sym_fxhxcan_id);
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
		
		if(EditFilter.IncludeActind)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Actind);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeCo_morb)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CO_MORB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Co_morb);
		}
		
		
		for(int x = 0; x < data.SeqnosymCollection.count(); x++)
		{
			Onc_sym_fxhxcanSeqnosymRecord rgRecord = (Onc_sym_fxhxcanSeqnosymRecord)data.SeqnosymCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNOSYM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqnosym);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACT_INDSYM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_indsym);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SYMTDURUNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Symtdurunit);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SYMDUR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Symdur);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PRES_ABS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Pres_abs);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SYMPT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Sympt);
			
		}
		for(int x = 0; x < data.SeqnofxhxCollection.count(); x++)
		{
			Onc_sym_fxhxcanSeqnofxhxRecord rgRecord = (Onc_sym_fxhxcanSeqnofxhxRecord)data.SeqnofxhxCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNOFXHX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqnofxhx);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACT_INDFXHX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_indfxhx);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RELINCIDENCE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Relincidence);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RELRELATIONSHIP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Relrelationship);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CANCCAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Canccat);
			
		}
		for(int x = 0; x < data.SeqillhxCollection.count(); x++)
		{
			Onc_sym_fxhxcanSeqillhxRecord rgRecord = (Onc_sym_fxhxcanSeqillhxRecord)data.SeqillhxCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQILLHX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqillhx);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACT_INDILLHX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_indillhx);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EVENTDETAILS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Eventdetails);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EVENTDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Eventdate);
			
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
			Onc_sym_fxhxcanRecord record = new Onc_sym_fxhxcanRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Onc_sym_fxhxcan_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONC_SYM_FXHXCAN_ID"));
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
			record.Actind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIND"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Co_morb = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CO_MORB"));
									
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
			Onc_sym_fxhxcanRecord record = new Onc_sym_fxhxcanRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Onc_sym_fxhxcan_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONC_SYM_FXHXCAN_ID"));
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
			record.Actind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIND"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Co_morb = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CO_MORB"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqnosym"))
					record.SeqnosymCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqnofxhx"))
					record.SeqnofxhxCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqillhx"))
					record.SeqillhxCollection.add();
			
									
			rgCount = record.SeqnosymCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqnosym"))
					{
						Onc_sym_fxhxcanSeqnosymRecord rgRecord = record.SeqnosymCollection.get(recCount);
						rgRecord.Seqnosym = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_indsym"))
					{
						Onc_sym_fxhxcanSeqnosymRecord rgRecord = record.SeqnosymCollection.get(recCount);
						rgRecord.Act_indsym = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("symtdurunit"))
					{
						Onc_sym_fxhxcanSeqnosymRecord rgRecord = record.SeqnosymCollection.get(recCount);
						rgRecord.Symtdurunit = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("symdur"))
					{
						Onc_sym_fxhxcanSeqnosymRecord rgRecord = record.SeqnosymCollection.get(recCount);
						rgRecord.Symdur = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("pres_abs"))
					{
						Onc_sym_fxhxcanSeqnosymRecord rgRecord = record.SeqnosymCollection.get(recCount);
						rgRecord.Pres_abs = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("sympt"))
					{
						Onc_sym_fxhxcanSeqnosymRecord rgRecord = record.SeqnosymCollection.get(recCount);
						rgRecord.Sympt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.SeqnofxhxCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqnofxhx"))
					{
						Onc_sym_fxhxcanSeqnofxhxRecord rgRecord = record.SeqnofxhxCollection.get(recCount);
						rgRecord.Seqnofxhx = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_indfxhx"))
					{
						Onc_sym_fxhxcanSeqnofxhxRecord rgRecord = record.SeqnofxhxCollection.get(recCount);
						rgRecord.Act_indfxhx = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("relincidence"))
					{
						Onc_sym_fxhxcanSeqnofxhxRecord rgRecord = record.SeqnofxhxCollection.get(recCount);
						rgRecord.Relincidence = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("relrelationship"))
					{
						Onc_sym_fxhxcanSeqnofxhxRecord rgRecord = record.SeqnofxhxCollection.get(recCount);
						rgRecord.Relrelationship = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("canccat"))
					{
						Onc_sym_fxhxcanSeqnofxhxRecord rgRecord = record.SeqnofxhxCollection.get(recCount);
						rgRecord.Canccat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.SeqillhxCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqillhx"))
					{
						Onc_sym_fxhxcanSeqillhxRecord rgRecord = record.SeqillhxCollection.get(recCount);
						rgRecord.Seqillhx = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_indillhx"))
					{
						Onc_sym_fxhxcanSeqillhxRecord rgRecord = record.SeqillhxCollection.get(recCount);
						rgRecord.Act_indillhx = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("eventdetails"))
					{
						Onc_sym_fxhxcanSeqillhxRecord rgRecord = record.SeqillhxCollection.get(recCount);
						rgRecord.Eventdetails = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("eventdate"))
					{
						Onc_sym_fxhxcanSeqillhxRecord rgRecord = record.SeqillhxCollection.get(recCount);
						rgRecord.Eventdate = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Onc_sym_fxhxcanCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_sym_fxhxcanRecord newRecord = new Onc_sym_fxhxcanRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_sym_fxhxcanRecord record)
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
		public Onc_sym_fxhxcanRecord get(int index)
		{
			return (Onc_sym_fxhxcanRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Onc_sym_fxhxcanRecord
	{
		public String Onc_sym_fxhxcan_id = "";
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
		public String Actind = "";
		public String Tstp = "";
		public String Co_morb = "";
		
		public Onc_sym_fxhxcanSeqnosymCollection SeqnosymCollection = new Onc_sym_fxhxcanSeqnosymCollection();
		public Onc_sym_fxhxcanSeqnofxhxCollection SeqnofxhxCollection = new Onc_sym_fxhxcanSeqnofxhxCollection();
		public Onc_sym_fxhxcanSeqillhxCollection SeqillhxCollection = new Onc_sym_fxhxcanSeqillhxCollection();		
		
		public void clear()
		{
			Onc_sym_fxhxcan_id = "";
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
			Actind = "";
			Tstp = "";
			Co_morb = "";
			
			SeqnosymCollection.clear();
			SeqnofxhxCollection.clear();
			SeqillhxCollection.clear();
		}		
	}
	
	public final class Onc_sym_fxhxcanSeqnosymCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_sym_fxhxcanSeqnosymRecord newRecord = new Onc_sym_fxhxcanSeqnosymRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_sym_fxhxcanSeqnosymRecord record)
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
		public Onc_sym_fxhxcanSeqnosymRecord get(int index)
		{
			return (Onc_sym_fxhxcanSeqnosymRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Onc_sym_fxhxcanSeqnofxhxCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_sym_fxhxcanSeqnofxhxRecord newRecord = new Onc_sym_fxhxcanSeqnofxhxRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_sym_fxhxcanSeqnofxhxRecord record)
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
		public Onc_sym_fxhxcanSeqnofxhxRecord get(int index)
		{
			return (Onc_sym_fxhxcanSeqnofxhxRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Onc_sym_fxhxcanSeqillhxCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_sym_fxhxcanSeqillhxRecord newRecord = new Onc_sym_fxhxcanSeqillhxRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_sym_fxhxcanSeqillhxRecord record)
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
		public Onc_sym_fxhxcanSeqillhxRecord get(int index)
		{
			return (Onc_sym_fxhxcanSeqillhxRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Onc_sym_fxhxcanSeqnosymRecord
	{
		public String Seqnosym = "";
		public String Act_indsym = "";
		public String Symtdurunit = "";
		public String Symdur = "";
		public String Pres_abs = "";
		public String Sympt = "";
		
		public void clear()
		{
			Seqnosym = "";
			Act_indsym = "";
			Symtdurunit = "";
			Symdur = "";
			Pres_abs = "";
			Sympt = "";
			
		}
	}
	public final class Onc_sym_fxhxcanSeqnofxhxRecord
	{
		public String Seqnofxhx = "";
		public String Act_indfxhx = "";
		public String Relincidence = "";
		public String Relrelationship = "";
		public String Canccat = "";
		
		public void clear()
		{
			Seqnofxhx = "";
			Act_indfxhx = "";
			Relincidence = "";
			Relrelationship = "";
			Canccat = "";
			
		}
	}
	public final class Onc_sym_fxhxcanSeqillhxRecord
	{
		public String Seqillhx = "";
		public String Act_indillhx = "";
		public String Eventdetails = "";
		public String Eventdate = "";
		
		public void clear()
		{
			Seqillhx = "";
			Act_indillhx = "";
			Eventdetails = "";
			Eventdate = "";
			
		}
	}	
	public final class Onc_sym_fxhxcanFilter
	{			
		public String Onc_sym_fxhxcan_id = "";
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
		public String Actind = "";
		public String Tstp = "";
		public String Co_morb = "";
		
		public void clear()
		{				
			Onc_sym_fxhxcan_id = "";
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
			Actind = "";
			Tstp = "";
			Co_morb = "";
		}	
		public Onc_sym_fxhxcanFilter cloneObject()
		{
			Onc_sym_fxhxcanFilter newFilter = new Onc_sym_fxhxcanFilter();
			
			newFilter.Onc_sym_fxhxcan_id = this.Onc_sym_fxhxcan_id;
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
			newFilter.Actind = this.Actind;
			newFilter.Tstp = this.Tstp;
			newFilter.Co_morb = this.Co_morb;
			
			return newFilter;
		}
	}
	public final class Onc_sym_fxhxcanEditFilter
	{			
		public boolean IncludeOnc_sym_fxhxcan_id = true;
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
		public boolean IncludeActind = true;
		public boolean IncludeTstp = true;
		public boolean IncludeCo_morb = true;
		
		public void includeAll()
		{				
			IncludeOnc_sym_fxhxcan_id = true;
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
			IncludeActind = true;
			IncludeTstp = true;
			IncludeCo_morb = true;
		}	
		public void excludeAll()
		{				
			IncludeOnc_sym_fxhxcan_id = false;
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
			IncludeActind = false;
			IncludeTstp = false;
			IncludeCo_morb = false;
		}
		public Onc_sym_fxhxcanEditFilter cloneObject()
		{
			Onc_sym_fxhxcanEditFilter newEditFilter = new Onc_sym_fxhxcanEditFilter();
			
			newEditFilter.IncludeOnc_sym_fxhxcan_id = this.IncludeOnc_sym_fxhxcan_id;
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
			newEditFilter.IncludeActind = this.IncludeActind;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeCo_morb = this.IncludeCo_morb;
			
			return newEditFilter;
		}
	}
}
