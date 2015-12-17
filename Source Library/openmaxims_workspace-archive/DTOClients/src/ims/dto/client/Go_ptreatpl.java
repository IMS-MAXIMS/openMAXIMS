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

public final class Go_ptreatpl implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Go_ptreatpl.class);
	
	private Go_ptreatplFilter lastGetFilter = null;
	private final String serviceName = "GO_PTREATPL";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Go_ptreatplFilter Filter = new Go_ptreatplFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Go_ptreatplEditFilter EditFilter = new Go_ptreatplEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Go_ptreatplCollection DataCollection = new Go_ptreatplCollection();

	/**
	 * Creates a new Go_ptreatpl Data Transfer Object.
	 */ 
	public Go_ptreatpl(ims.dto.Connection connection)
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
	public Go_ptreatpl cloneObject()
	{
		Go_ptreatpl cloneObject = new Go_ptreatpl(Connection);
			
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
			cloneObject.DataCollection.get(index).Rkey = DataCollection.get(x).Rkey;
			cloneObject.DataCollection.get(index).Dt_seen = DataCollection.get(x).Dt_seen;
			cloneObject.DataCollection.get(index).Tp_des_treat = DataCollection.get(x).Tp_des_treat;
			cloneObject.DataCollection.get(index).Ecad_date = DataCollection.get(x).Ecad_date;
			cloneObject.DataCollection.get(index).Chcp = DataCollection.get(x).Chcp;
			cloneObject.DataCollection.get(index).Seen_loc = DataCollection.get(x).Seen_loc;
			cloneObject.DataCollection.get(index).Pat_stat = DataCollection.get(x).Pat_stat;
			cloneObject.DataCollection.get(index).Tsite = DataCollection.get(x).Tsite;
			cloneObject.DataCollection.get(index).Tr_intent = DataCollection.get(x).Tr_intent;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Tp_cmnt = DataCollection.get(x).Tp_cmnt;
			cloneObject.DataCollection.get(index).Actstat = DataCollection.get(x).Actstat;
			cloneObject.DataCollection.get(index).Surgf = DataCollection.get(x).Surgf;
			cloneObject.DataCollection.get(index).Snm = DataCollection.get(x).Snm;
			cloneObject.DataCollection.get(index).Fnm1 = DataCollection.get(x).Fnm1;
			cloneObject.DataCollection.get(index).Titl = DataCollection.get(x).Titl;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Patsex = DataCollection.get(x).Patsex;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Tumsitetxt = DataCollection.get(x).Tumsitetxt;
			cloneObject.DataCollection.get(index).Cshisttxt = DataCollection.get(x).Cshisttxt;
			cloneObject.DataCollection.get(index).Tumgrouptxt = DataCollection.get(x).Tumgrouptxt;
			cloneObject.DataCollection.get(index).Chcptxt = DataCollection.get(x).Chcptxt;
			cloneObject.DataCollection.get(index).Pat_stattxt = DataCollection.get(x).Pat_stattxt;
			cloneObject.DataCollection.get(index).Tr_intenttxt = DataCollection.get(x).Tr_intenttxt;
							
			
			for(int iSeqno = 0; iSeqno < DataCollection.get(x).SeqnoCollection.count(); iSeqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnoCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Seqno = DataCollection.get(x).SeqnoCollection.get(iSeqno).Seqno;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Tgroupid = DataCollection.get(x).SeqnoCollection.get(iSeqno).Tgroupid;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Tgroupidtxt = DataCollection.get(x).SeqnoCollection.get(iSeqno).Tgroupidtxt;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Tsitetxt = DataCollection.get(x).SeqnoCollection.get(iSeqno).Tsitetxt;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Act_stat = DataCollection.get(x).SeqnoCollection.get(iSeqno).Act_stat;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Txsiteprnt = DataCollection.get(x).SeqnoCollection.get(iSeqno).Txsiteprnt;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Txsite = DataCollection.get(x).SeqnoCollection.get(iSeqno).Txsite;
										
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
		return "Go_ptreatpl.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptreatpl.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Go_ptreatpl.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptreatpl.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptreatpl.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptreatpl.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Go_ptreatpl.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Go_ptreatpl.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptreatpl.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Go_ptreatpl.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Go_ptreatpl.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Go_ptreatpl.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Go_ptreatpl.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Go_ptreatpl.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptreatpl.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Go_ptreatpl.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Go_ptreatpl.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Go_ptreatpl.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Go_ptreatpl.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Go_ptreatpl.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptreatpl.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Go_ptreatpl.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Go_ptreatpl.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptreatpl.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Go_ptreatpl.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Go_ptreatpl.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Go_ptreatpl.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Go_ptreatpl nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Go_ptreatpl After NextList ");
				
		decodeNASMessage();		
		logger.debug("Go_ptreatpl After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Go_ptreatpl.List");
							
		listInProgress = true;	
		logger.debug("Go_ptreatpl Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Go_ptreatpl After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Go_ptreatpl After Parse Message");
		
						
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
	private String encodeNASFilter(Go_ptreatplFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Unid != null && filter.Unid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Unid);
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
		
		if(Filter.Rkey != null && filter.Rkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rkey);
		}
		
		if(Filter.Dt_seen != null && filter.Dt_seen.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DT_SEEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dt_seen);
		}
		
		if(Filter.Tp_des_treat != null && filter.Tp_des_treat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TP_DES_TREAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tp_des_treat);
		}
		
		if(Filter.Ecad_date != null && filter.Ecad_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ECAD_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ecad_date);
		}
		
		if(Filter.Chcp != null && filter.Chcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Chcp);
		}
		
		if(Filter.Seen_loc != null && filter.Seen_loc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SEEN_LOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Seen_loc);
		}
		
		if(Filter.Pat_stat != null && filter.Pat_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PAT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pat_stat);
		}
		
		if(Filter.Tsite != null && filter.Tsite.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tsite);
		}
		
		if(Filter.Tr_intent != null && filter.Tr_intent.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TR_INTENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tr_intent);
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
		}
		
		if(Filter.Tp_cmnt != null && filter.Tp_cmnt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TP_CMNT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tp_cmnt);
		}
		
		if(Filter.Actstat != null && filter.Actstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Actstat);
		}
		
		if(Filter.Surgf != null && filter.Surgf.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SURGF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Surgf);
		}
		
		if(Filter.Snm != null && filter.Snm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Snm);
		}
		
		if(Filter.Fnm1 != null && filter.Fnm1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fnm1);
		}
		
		if(Filter.Titl != null && filter.Titl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Titl);
		}
		
		if(Filter.Dob != null && filter.Dob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dob);
		}
		
		if(Filter.Patsex != null && filter.Patsex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PATSEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Patsex);
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum);
		}
		
		if(Filter.Tumsitetxt != null && filter.Tumsitetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TUMSITETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tumsitetxt);
		}
		
		if(Filter.Cshisttxt != null && filter.Cshisttxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CSHISTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cshisttxt);
		}
		
		if(Filter.Tumgrouptxt != null && filter.Tumgrouptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TUMGROUPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tumgrouptxt);
		}
		
		if(Filter.Chcptxt != null && filter.Chcptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Chcptxt);
		}
		
		if(Filter.Pat_stattxt != null && filter.Pat_stattxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PAT_STATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pat_stattxt);
		}
		
		if(Filter.Tr_intenttxt != null && filter.Tr_intenttxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TR_INTENTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tr_intenttxt);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Go_ptreatplRecord data = (Go_ptreatplRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeUnid)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unid));
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
		
		if(EditFilter.IncludeRkey)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rkey));
		}
		
		if(EditFilter.IncludeDt_seen)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DT_SEEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dt_seen));
		}
		
		if(EditFilter.IncludeTp_des_treat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TP_DES_TREAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tp_des_treat));
		}
		
		if(EditFilter.IncludeEcad_date)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ECAD_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ecad_date));
		}
		
		if(EditFilter.IncludeChcp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Chcp));
		}
		
		if(EditFilter.IncludeSeen_loc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEEN_LOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Seen_loc));
		}
		
		if(EditFilter.IncludePat_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PAT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pat_stat));
		}
		
		if(EditFilter.IncludeTsite)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tsite));
		}
		
		if(EditFilter.IncludeTr_intent)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TR_INTENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tr_intent));
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
		}
		
		if(EditFilter.IncludeTp_cmnt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TP_CMNT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tp_cmnt));
		}
		
		if(EditFilter.IncludeActstat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Actstat));
		}
		
		if(EditFilter.IncludeSurgf)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SURGF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Surgf));
		}
		
		if(EditFilter.IncludeSnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Snm));
		}
		
		if(EditFilter.IncludeFnm1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fnm1));
		}
		
		if(EditFilter.IncludeTitl)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Titl));
		}
		
		if(EditFilter.IncludeDob)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dob));
		}
		
		if(EditFilter.IncludePatsex)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PATSEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Patsex));
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum));
		}
		
		if(EditFilter.IncludeTumsitetxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TUMSITETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tumsitetxt));
		}
		
		if(EditFilter.IncludeCshisttxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CSHISTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cshisttxt));
		}
		
		if(EditFilter.IncludeTumgrouptxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TUMGROUPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tumgrouptxt));
		}
		
		if(EditFilter.IncludeChcptxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Chcptxt));
		}
		
		if(EditFilter.IncludePat_stattxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PAT_STATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pat_stattxt));
		}
		
		if(EditFilter.IncludeTr_intenttxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TR_INTENTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tr_intenttxt));
		}
		
		
		for(int x = 0; x < data.SeqnoCollection.count(); x++)
		{
			Go_ptreatplSeqnoRecord rgRecord = (Go_ptreatplSeqnoRecord)data.SeqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TGROUPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Tgroupid));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TGROUPIDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Tgroupidtxt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSITETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Tsitetxt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_stat));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXSITEPRNT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Txsiteprnt));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TXSITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Txsite));
			
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
			Go_ptreatplRecord record = new Go_ptreatplRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
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
			record.Rkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RKEY"));
			record.Dt_seen = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DT_SEEN"));
			record.Tp_des_treat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TP_DES_TREAT"));
			record.Ecad_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ECAD_DATE"));
			record.Chcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHCP"));
			record.Seen_loc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEEN_LOC"));
			record.Pat_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_STAT"));
			record.Tsite = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSITE"));
			record.Tr_intent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TR_INTENT"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Tp_cmnt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TP_CMNT"));
			record.Actstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTSTAT"));
			record.Surgf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SURGF"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Patsex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATSEX"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Tumsitetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TUMSITETXT"));
			record.Cshisttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CSHISTTXT"));
			record.Tumgrouptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TUMGROUPTXT"));
			record.Chcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHCPTXT"));
			record.Pat_stattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_STATTXT"));
			record.Tr_intenttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TR_INTENTTXT"));
									
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
			Go_ptreatplRecord record = new Go_ptreatplRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
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
			record.Rkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RKEY"));
			record.Dt_seen = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DT_SEEN"));
			record.Tp_des_treat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TP_DES_TREAT"));
			record.Ecad_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ECAD_DATE"));
			record.Chcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHCP"));
			record.Seen_loc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEEN_LOC"));
			record.Pat_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_STAT"));
			record.Tsite = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSITE"));
			record.Tr_intent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TR_INTENT"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Tp_cmnt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TP_CMNT"));
			record.Actstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTSTAT"));
			record.Surgf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SURGF"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Patsex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATSEX"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Tumsitetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TUMSITETXT"));
			record.Cshisttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CSHISTTXT"));
			record.Tumgrouptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TUMGROUPTXT"));
			record.Chcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHCPTXT"));
			record.Pat_stattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAT_STATTXT"));
			record.Tr_intenttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TR_INTENTTXT"));
									
			
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
						Go_ptreatplSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("tgroupid"))
					{
						Go_ptreatplSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Tgroupid = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("tgroupidtxt"))
					{
						Go_ptreatplSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Tgroupidtxt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("tsitetxt"))
					{
						Go_ptreatplSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Tsitetxt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_stat"))
					{
						Go_ptreatplSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Act_stat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("txsiteprnt"))
					{
						Go_ptreatplSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Txsiteprnt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("txsite"))
					{
						Go_ptreatplSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Txsite = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Go_ptreatplCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Go_ptreatplRecord newRecord = new Go_ptreatplRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Go_ptreatplRecord record)
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
		public Go_ptreatplRecord get(int index)
		{
			return (Go_ptreatplRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Go_ptreatplRecord
	{
		public String Unid = "";
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
		public String Rkey = "";
		public String Dt_seen = "";
		public String Tp_des_treat = "";
		public String Ecad_date = "";
		public String Chcp = "";
		public String Seen_loc = "";
		public String Pat_stat = "";
		public String Tsite = "";
		public String Tr_intent = "";
		public String Tstp = "";
		public String Tp_cmnt = "";
		public String Actstat = "";
		public String Surgf = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Titl = "";
		public String Dob = "";
		public String Patsex = "";
		public String Hospnum = "";
		public String Tumsitetxt = "";
		public String Cshisttxt = "";
		public String Tumgrouptxt = "";
		public String Chcptxt = "";
		public String Pat_stattxt = "";
		public String Tr_intenttxt = "";
		
		public Go_ptreatplSeqnoCollection SeqnoCollection = new Go_ptreatplSeqnoCollection();		
		
		public void clear()
		{
			Unid = "";
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
			Rkey = "";
			Dt_seen = "";
			Tp_des_treat = "";
			Ecad_date = "";
			Chcp = "";
			Seen_loc = "";
			Pat_stat = "";
			Tsite = "";
			Tr_intent = "";
			Tstp = "";
			Tp_cmnt = "";
			Actstat = "";
			Surgf = "";
			Snm = "";
			Fnm1 = "";
			Titl = "";
			Dob = "";
			Patsex = "";
			Hospnum = "";
			Tumsitetxt = "";
			Cshisttxt = "";
			Tumgrouptxt = "";
			Chcptxt = "";
			Pat_stattxt = "";
			Tr_intenttxt = "";
			
			SeqnoCollection.clear();
		}		
	}
	
	public final class Go_ptreatplSeqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Go_ptreatplSeqnoRecord newRecord = new Go_ptreatplSeqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Go_ptreatplSeqnoRecord record)
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
		public Go_ptreatplSeqnoRecord get(int index)
		{
			return (Go_ptreatplSeqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Go_ptreatplSeqnoRecord
	{
		public String Seqno = "";
		public String Tgroupid = "";
		public String Tgroupidtxt = "";
		public String Tsitetxt = "";
		public String Act_stat = "";
		public String Txsiteprnt = "";
		public String Txsite = "";
		
		public void clear()
		{
			Seqno = "";
			Tgroupid = "";
			Tgroupidtxt = "";
			Tsitetxt = "";
			Act_stat = "";
			Txsiteprnt = "";
			Txsite = "";
			
		}
	}	
	public final class Go_ptreatplFilter
	{			
		public String Unid = "";
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
		public String Rkey = "";
		public String Dt_seen = "";
		public String Tp_des_treat = "";
		public String Ecad_date = "";
		public String Chcp = "";
		public String Seen_loc = "";
		public String Pat_stat = "";
		public String Tsite = "";
		public String Tr_intent = "";
		public String Tstp = "";
		public String Tp_cmnt = "";
		public String Actstat = "";
		public String Surgf = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Titl = "";
		public String Dob = "";
		public String Patsex = "";
		public String Hospnum = "";
		public String Tumsitetxt = "";
		public String Cshisttxt = "";
		public String Tumgrouptxt = "";
		public String Chcptxt = "";
		public String Pat_stattxt = "";
		public String Tr_intenttxt = "";
		
		public void clear()
		{				
			Unid = "";
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
			Rkey = "";
			Dt_seen = "";
			Tp_des_treat = "";
			Ecad_date = "";
			Chcp = "";
			Seen_loc = "";
			Pat_stat = "";
			Tsite = "";
			Tr_intent = "";
			Tstp = "";
			Tp_cmnt = "";
			Actstat = "";
			Surgf = "";
			Snm = "";
			Fnm1 = "";
			Titl = "";
			Dob = "";
			Patsex = "";
			Hospnum = "";
			Tumsitetxt = "";
			Cshisttxt = "";
			Tumgrouptxt = "";
			Chcptxt = "";
			Pat_stattxt = "";
			Tr_intenttxt = "";
		}	
		public Go_ptreatplFilter cloneObject()
		{
			Go_ptreatplFilter newFilter = new Go_ptreatplFilter();
			
			newFilter.Unid = this.Unid;
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
			newFilter.Rkey = this.Rkey;
			newFilter.Dt_seen = this.Dt_seen;
			newFilter.Tp_des_treat = this.Tp_des_treat;
			newFilter.Ecad_date = this.Ecad_date;
			newFilter.Chcp = this.Chcp;
			newFilter.Seen_loc = this.Seen_loc;
			newFilter.Pat_stat = this.Pat_stat;
			newFilter.Tsite = this.Tsite;
			newFilter.Tr_intent = this.Tr_intent;
			newFilter.Tstp = this.Tstp;
			newFilter.Tp_cmnt = this.Tp_cmnt;
			newFilter.Actstat = this.Actstat;
			newFilter.Surgf = this.Surgf;
			newFilter.Snm = this.Snm;
			newFilter.Fnm1 = this.Fnm1;
			newFilter.Titl = this.Titl;
			newFilter.Dob = this.Dob;
			newFilter.Patsex = this.Patsex;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Tumsitetxt = this.Tumsitetxt;
			newFilter.Cshisttxt = this.Cshisttxt;
			newFilter.Tumgrouptxt = this.Tumgrouptxt;
			newFilter.Chcptxt = this.Chcptxt;
			newFilter.Pat_stattxt = this.Pat_stattxt;
			newFilter.Tr_intenttxt = this.Tr_intenttxt;
			
			return newFilter;
		}
	}
	public final class Go_ptreatplEditFilter
	{			
		public boolean IncludeUnid = true;
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
		public boolean IncludeRkey = true;
		public boolean IncludeDt_seen = true;
		public boolean IncludeTp_des_treat = true;
		public boolean IncludeEcad_date = true;
		public boolean IncludeChcp = true;
		public boolean IncludeSeen_loc = true;
		public boolean IncludePat_stat = true;
		public boolean IncludeTsite = true;
		public boolean IncludeTr_intent = true;
		public boolean IncludeTstp = true;
		public boolean IncludeTp_cmnt = true;
		public boolean IncludeActstat = true;
		public boolean IncludeSurgf = true;
		public boolean IncludeSnm = true;
		public boolean IncludeFnm1 = true;
		public boolean IncludeTitl = true;
		public boolean IncludeDob = true;
		public boolean IncludePatsex = true;
		public boolean IncludeHospnum = true;
		public boolean IncludeTumsitetxt = true;
		public boolean IncludeCshisttxt = true;
		public boolean IncludeTumgrouptxt = true;
		public boolean IncludeChcptxt = true;
		public boolean IncludePat_stattxt = true;
		public boolean IncludeTr_intenttxt = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
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
			IncludeRkey = true;
			IncludeDt_seen = true;
			IncludeTp_des_treat = true;
			IncludeEcad_date = true;
			IncludeChcp = true;
			IncludeSeen_loc = true;
			IncludePat_stat = true;
			IncludeTsite = true;
			IncludeTr_intent = true;
			IncludeTstp = true;
			IncludeTp_cmnt = true;
			IncludeActstat = true;
			IncludeSurgf = true;
			IncludeSnm = true;
			IncludeFnm1 = true;
			IncludeTitl = true;
			IncludeDob = true;
			IncludePatsex = true;
			IncludeHospnum = true;
			IncludeTumsitetxt = true;
			IncludeCshisttxt = true;
			IncludeTumgrouptxt = true;
			IncludeChcptxt = true;
			IncludePat_stattxt = true;
			IncludeTr_intenttxt = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
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
			IncludeRkey = false;
			IncludeDt_seen = false;
			IncludeTp_des_treat = false;
			IncludeEcad_date = false;
			IncludeChcp = false;
			IncludeSeen_loc = false;
			IncludePat_stat = false;
			IncludeTsite = false;
			IncludeTr_intent = false;
			IncludeTstp = false;
			IncludeTp_cmnt = false;
			IncludeActstat = false;
			IncludeSurgf = false;
			IncludeSnm = false;
			IncludeFnm1 = false;
			IncludeTitl = false;
			IncludeDob = false;
			IncludePatsex = false;
			IncludeHospnum = false;
			IncludeTumsitetxt = false;
			IncludeCshisttxt = false;
			IncludeTumgrouptxt = false;
			IncludeChcptxt = false;
			IncludePat_stattxt = false;
			IncludeTr_intenttxt = false;
		}
		public Go_ptreatplEditFilter cloneObject()
		{
			Go_ptreatplEditFilter newEditFilter = new Go_ptreatplEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
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
			newEditFilter.IncludeRkey = this.IncludeRkey;
			newEditFilter.IncludeDt_seen = this.IncludeDt_seen;
			newEditFilter.IncludeTp_des_treat = this.IncludeTp_des_treat;
			newEditFilter.IncludeEcad_date = this.IncludeEcad_date;
			newEditFilter.IncludeChcp = this.IncludeChcp;
			newEditFilter.IncludeSeen_loc = this.IncludeSeen_loc;
			newEditFilter.IncludePat_stat = this.IncludePat_stat;
			newEditFilter.IncludeTsite = this.IncludeTsite;
			newEditFilter.IncludeTr_intent = this.IncludeTr_intent;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeTp_cmnt = this.IncludeTp_cmnt;
			newEditFilter.IncludeActstat = this.IncludeActstat;
			newEditFilter.IncludeSurgf = this.IncludeSurgf;
			newEditFilter.IncludeSnm = this.IncludeSnm;
			newEditFilter.IncludeFnm1 = this.IncludeFnm1;
			newEditFilter.IncludeTitl = this.IncludeTitl;
			newEditFilter.IncludeDob = this.IncludeDob;
			newEditFilter.IncludePatsex = this.IncludePatsex;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeTumsitetxt = this.IncludeTumsitetxt;
			newEditFilter.IncludeCshisttxt = this.IncludeCshisttxt;
			newEditFilter.IncludeTumgrouptxt = this.IncludeTumgrouptxt;
			newEditFilter.IncludeChcptxt = this.IncludeChcptxt;
			newEditFilter.IncludePat_stattxt = this.IncludePat_stattxt;
			newEditFilter.IncludeTr_intenttxt = this.IncludeTr_intenttxt;
			
			return newEditFilter;
		}
	}
}
