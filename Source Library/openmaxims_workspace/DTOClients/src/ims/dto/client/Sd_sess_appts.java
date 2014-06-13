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

public final class Sd_sess_appts implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_sess_appts.class);
	
	private Sd_sess_apptsFilter lastGetFilter = null;
	private final String serviceName = "SD_SESS_APPTS";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_sess_apptsFilter Filter = new Sd_sess_apptsFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_sess_apptsEditFilter EditFilter = new Sd_sess_apptsEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_sess_apptsCollection DataCollection = new Sd_sess_apptsCollection();

	/**
	 * Creates a new Sd_sess_appts Data Transfer Object.
	 */ 
	public Sd_sess_appts(ims.dto.Connection connection)
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
	public Sd_sess_appts cloneObject()
	{
		Sd_sess_appts cloneObject = new Sd_sess_appts(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Prfile_sess_id = DataCollection.get(x).Prfile_sess_id;
			cloneObject.DataCollection.get(index).Prfiled_sess_id = DataCollection.get(x).Prfiled_sess_id;
			cloneObject.DataCollection.get(index).Sess_dt = DataCollection.get(x).Sess_dt;
			cloneObject.DataCollection.get(index).Stm = DataCollection.get(x).Stm;
			cloneObject.DataCollection.get(index).Etm = DataCollection.get(x).Etm;
			cloneObject.DataCollection.get(index).Mc_nm = DataCollection.get(x).Mc_nm;
			cloneObject.DataCollection.get(index).Loc_nm = DataCollection.get(x).Loc_nm;
			cloneObject.DataCollection.get(index).Mc_id = DataCollection.get(x).Mc_id;
			cloneObject.DataCollection.get(index).Int_loc_id = DataCollection.get(x).Int_loc_id;
			cloneObject.DataCollection.get(index).Mc_id1 = DataCollection.get(x).Mc_id1;
			cloneObject.DataCollection.get(index).Int_loc_id1 = DataCollection.get(x).Int_loc_id1;
			cloneObject.DataCollection.get(index).Userrights = DataCollection.get(x).Userrights;
			cloneObject.DataCollection.get(index).Loid = DataCollection.get(x).Loid;
			cloneObject.DataCollection.get(index).Tno_appts = DataCollection.get(x).Tno_appts;
			cloneObject.DataCollection.get(index).Tno_fappts = DataCollection.get(x).Tno_fappts;
							
			
			for(int iSeqno2 = 0; iSeqno2 < DataCollection.get(x).Seqno2Collection.count(); iSeqno2++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno2Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Seqno2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Seqno2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Etm2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Etm2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Stm2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Stm2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Act_ind_tm = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Act_ind_tm;
										
			}
			
			for(int iSeqno3 = 0; iSeqno3 < DataCollection.get(x).Seqno3Collection.count(); iSeqno3++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno3Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Seqno3 = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Seqno3;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).First_appt_id = DataCollection.get(x).Seqno3Collection.get(iSeqno3).First_appt_id;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Appt_stat = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Appt_stat;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Appt_head_id = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Appt_head_id;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Pkey = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Pkey;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Appt_etm = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Appt_etm;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Appt_stm = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Appt_stm;
										
			}
			
			for(int iSeqno = 0; iSeqno < DataCollection.get(x).SeqnoCollection.count(); iSeqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnoCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Seqno = DataCollection.get(x).SeqnoCollection.get(iSeqno).Seqno;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Act_ind_usr = DataCollection.get(x).SeqnoCollection.get(iSeqno).Act_ind_usr;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Susr = DataCollection.get(x).SeqnoCollection.get(iSeqno).Susr;
										
			}
			
			for(int iLoseqno = 0; iLoseqno < DataCollection.get(x).LoseqnoCollection.count(); iLoseqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).LoseqnoCollection.add();
					
				cloneObject.DataCollection.get(index).LoseqnoCollection.get(rIndex).Loseqno = DataCollection.get(x).LoseqnoCollection.get(iLoseqno).Loseqno;
				cloneObject.DataCollection.get(index).LoseqnoCollection.get(rIndex).Loremnoapp = DataCollection.get(x).LoseqnoCollection.get(iLoseqno).Loremnoapp;
				cloneObject.DataCollection.get(index).LoseqnoCollection.get(rIndex).Lomaxnoapp = DataCollection.get(x).LoseqnoCollection.get(iLoseqno).Lomaxnoapp;
				cloneObject.DataCollection.get(index).LoseqnoCollection.get(rIndex).Mos_id = DataCollection.get(x).LoseqnoCollection.get(iLoseqno).Mos_id;
				cloneObject.DataCollection.get(index).LoseqnoCollection.get(rIndex).Etm1 = DataCollection.get(x).LoseqnoCollection.get(iLoseqno).Etm1;
				cloneObject.DataCollection.get(index).LoseqnoCollection.get(rIndex).Stm1 = DataCollection.get(x).LoseqnoCollection.get(iLoseqno).Stm1;
										
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
		return "Sd_sess_appts.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_appts.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_sess_appts.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_appts.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_appts.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_appts.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_sess_appts.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_sess_appts.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_appts.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_sess_appts.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_sess_appts.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_sess_appts.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_sess_appts.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_sess_appts.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_appts.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_sess_appts.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_sess_appts.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_sess_appts.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_sess_appts.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_sess_appts.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_appts.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_sess_appts.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_sess_appts.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_appts.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_sess_appts.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_sess_appts.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_sess_appts.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_sess_appts nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_sess_appts After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_sess_appts After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_sess_appts.List");
							
		listInProgress = true;	
		logger.debug("Sd_sess_appts Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_sess_appts After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_sess_appts After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_sess_apptsFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Prfile_sess_id != null && filter.Prfile_sess_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRFILE_SESS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prfile_sess_id);
		}
		
		if(Filter.Prfiled_sess_id != null && filter.Prfiled_sess_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRFILED_SESS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prfiled_sess_id);
		}
		
		if(Filter.Sess_dt != null && filter.Sess_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SESS_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sess_dt);
		}
		
		if(Filter.Stm != null && filter.Stm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stm);
		}
		
		if(Filter.Etm != null && filter.Etm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ETM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Etm);
		}
		
		if(Filter.Mc_nm != null && filter.Mc_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_nm);
		}
		
		if(Filter.Loc_nm != null && filter.Loc_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LOC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Loc_nm);
		}
		
		if(Filter.Mc_id != null && filter.Mc_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_id);
		}
		
		if(Filter.Int_loc_id != null && filter.Int_loc_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INT_LOC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_loc_id);
		}
		
		if(Filter.Mc_id1 != null && filter.Mc_id1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_ID1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_id1);
		}
		
		if(Filter.Int_loc_id1 != null && filter.Int_loc_id1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INT_LOC_ID1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_loc_id1);
		}
		
		if(Filter.Userrights != null && filter.Userrights.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("USERRIGHTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Userrights);
		}
		
		if(Filter.Loid != null && filter.Loid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LOID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Loid);
		}
		
		if(Filter.Tno_appts != null && filter.Tno_appts.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TNO_APPTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tno_appts);
		}
		
		if(Filter.Tno_fappts != null && filter.Tno_fappts.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TNO_FAPPTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tno_fappts);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_sess_apptsRecord data = (Sd_sess_apptsRecord)DataCollection.get(0);
		
		if(EditFilter.IncludePrfile_sess_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILE_SESS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prfile_sess_id));
		}
		
		if(EditFilter.IncludePrfiled_sess_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILED_SESS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prfiled_sess_id));
		}
		
		if(EditFilter.IncludeSess_dt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESS_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sess_dt));
		}
		
		if(EditFilter.IncludeStm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stm));
		}
		
		if(EditFilter.IncludeEtm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ETM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Etm));
		}
		
		if(EditFilter.IncludeMc_nm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_nm));
		}
		
		if(EditFilter.IncludeLoc_nm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LOC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Loc_nm));
		}
		
		if(EditFilter.IncludeMc_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_id));
		}
		
		if(EditFilter.IncludeInt_loc_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INT_LOC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_loc_id));
		}
		
		if(EditFilter.IncludeMc_id1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_ID1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_id1));
		}
		
		if(EditFilter.IncludeInt_loc_id1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INT_LOC_ID1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_loc_id1));
		}
		
		if(EditFilter.IncludeUserrights)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("USERRIGHTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Userrights));
		}
		
		if(EditFilter.IncludeLoid)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LOID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Loid));
		}
		
		if(EditFilter.IncludeTno_appts)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TNO_APPTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tno_appts));
		}
		
		if(EditFilter.IncludeTno_fappts)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TNO_FAPPTS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tno_fappts));
		}
		
		
		for(int x = 0; x < data.Seqno2Collection.count(); x++)
		{
			Sd_sess_apptsSeqno2Record rgRecord = (Sd_sess_apptsSeqno2Record)data.Seqno2Collection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ETM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Etm2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Stm2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_tm));
			
		}
		for(int x = 0; x < data.Seqno3Collection.count(); x++)
		{
			Sd_sess_apptsSeqno3Record rgRecord = (Sd_sess_apptsSeqno3Record)data.Seqno3Collection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno3));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FIRST_APPT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.First_appt_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Appt_stat));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_HEAD_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Appt_head_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Pkey));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_ETM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Appt_etm));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPT_STM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Appt_stm));
			
		}
		for(int x = 0; x < data.SeqnoCollection.count(); x++)
		{
			Sd_sess_apptsSeqnoRecord rgRecord = (Sd_sess_apptsSeqnoRecord)data.SeqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_USR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_usr));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Susr));
			
		}
		for(int x = 0; x < data.LoseqnoCollection.count(); x++)
		{
			Sd_sess_apptsLoseqnoRecord rgRecord = (Sd_sess_apptsLoseqnoRecord)data.LoseqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LOSEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Loseqno));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LOREMNOAPP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Loremnoapp));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LOMAXNOAPP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Lomaxnoapp));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MOS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mos_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ETM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Etm1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Stm1));
			
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
			Sd_sess_apptsRecord record = new Sd_sess_apptsRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Prfile_sess_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_ID"));
			record.Prfiled_sess_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILED_SESS_ID"));
			record.Sess_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_DT"));
			record.Stm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STM"));
			record.Etm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETM"));
			record.Mc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_NM"));
			record.Loc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LOC_NM"));
			record.Mc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID"));
			record.Int_loc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_LOC_ID"));
			record.Mc_id1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID1"));
			record.Int_loc_id1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_LOC_ID1"));
			record.Userrights = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "USERRIGHTS"));
			record.Loid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LOID"));
			record.Tno_appts = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TNO_APPTS"));
			record.Tno_fappts = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TNO_FAPPTS"));
									
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
			Sd_sess_apptsRecord record = new Sd_sess_apptsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Prfile_sess_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_ID"));
			record.Prfiled_sess_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILED_SESS_ID"));
			record.Sess_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_DT"));
			record.Stm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STM"));
			record.Etm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETM"));
			record.Mc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_NM"));
			record.Loc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LOC_NM"));
			record.Mc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID"));
			record.Int_loc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_LOC_ID"));
			record.Mc_id1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID1"));
			record.Int_loc_id1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_LOC_ID1"));
			record.Userrights = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "USERRIGHTS"));
			record.Loid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LOID"));
			record.Tno_appts = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TNO_APPTS"));
			record.Tno_fappts = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TNO_FAPPTS"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno2"))
					record.Seqno2Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno3"))
					record.Seqno3Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					record.SeqnoCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("loseqno"))
					record.LoseqnoCollection.add();
			
									
			rgCount = record.Seqno2Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno2"))
					{
						Sd_sess_apptsSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Seqno2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("etm2"))
					{
						Sd_sess_apptsSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Etm2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("stm2"))
					{
						Sd_sess_apptsSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Stm2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind_tm"))
					{
						Sd_sess_apptsSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Act_ind_tm = Connection.getAttributeValue(valueItems[i]);
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
						Sd_sess_apptsSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Seqno3 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("first_appt_id"))
					{
						Sd_sess_apptsSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.First_appt_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appt_stat"))
					{
						Sd_sess_apptsSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Appt_stat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appt_head_id"))
					{
						Sd_sess_apptsSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Appt_head_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("pkey"))
					{
						Sd_sess_apptsSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Pkey = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appt_etm"))
					{
						Sd_sess_apptsSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Appt_etm = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("appt_stm"))
					{
						Sd_sess_apptsSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Appt_stm = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.SeqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					{
						Sd_sess_apptsSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind_usr"))
					{
						Sd_sess_apptsSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Act_ind_usr = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("susr"))
					{
						Sd_sess_apptsSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Susr = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.LoseqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("loseqno"))
					{
						Sd_sess_apptsLoseqnoRecord rgRecord = record.LoseqnoCollection.get(recCount);
						rgRecord.Loseqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("loremnoapp"))
					{
						Sd_sess_apptsLoseqnoRecord rgRecord = record.LoseqnoCollection.get(recCount);
						rgRecord.Loremnoapp = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("lomaxnoapp"))
					{
						Sd_sess_apptsLoseqnoRecord rgRecord = record.LoseqnoCollection.get(recCount);
						rgRecord.Lomaxnoapp = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("mos_id"))
					{
						Sd_sess_apptsLoseqnoRecord rgRecord = record.LoseqnoCollection.get(recCount);
						rgRecord.Mos_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("etm1"))
					{
						Sd_sess_apptsLoseqnoRecord rgRecord = record.LoseqnoCollection.get(recCount);
						rgRecord.Etm1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("stm1"))
					{
						Sd_sess_apptsLoseqnoRecord rgRecord = record.LoseqnoCollection.get(recCount);
						rgRecord.Stm1 = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Sd_sess_apptsCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_sess_apptsRecord newRecord = new Sd_sess_apptsRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_sess_apptsRecord record)
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
		public Sd_sess_apptsRecord get(int index)
		{
			return (Sd_sess_apptsRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_sess_apptsRecord
	{
		public String Prfile_sess_id = "";
		public String Prfiled_sess_id = "";
		public String Sess_dt = "";
		public String Stm = "";
		public String Etm = "";
		public String Mc_nm = "";
		public String Loc_nm = "";
		public String Mc_id = "";
		public String Int_loc_id = "";
		public String Mc_id1 = "";
		public String Int_loc_id1 = "";
		public String Userrights = "";
		public String Loid = "";
		public String Tno_appts = "";
		public String Tno_fappts = "";
		
		public Sd_sess_apptsSeqno2Collection Seqno2Collection = new Sd_sess_apptsSeqno2Collection();
		public Sd_sess_apptsSeqno3Collection Seqno3Collection = new Sd_sess_apptsSeqno3Collection();
		public Sd_sess_apptsSeqnoCollection SeqnoCollection = new Sd_sess_apptsSeqnoCollection();
		public Sd_sess_apptsLoseqnoCollection LoseqnoCollection = new Sd_sess_apptsLoseqnoCollection();		
		
		public void clear()
		{
			Prfile_sess_id = "";
			Prfiled_sess_id = "";
			Sess_dt = "";
			Stm = "";
			Etm = "";
			Mc_nm = "";
			Loc_nm = "";
			Mc_id = "";
			Int_loc_id = "";
			Mc_id1 = "";
			Int_loc_id1 = "";
			Userrights = "";
			Loid = "";
			Tno_appts = "";
			Tno_fappts = "";
			
			Seqno2Collection.clear();
			Seqno3Collection.clear();
			SeqnoCollection.clear();
			LoseqnoCollection.clear();
		}		
	}
	
	public final class Sd_sess_apptsSeqno2Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_sess_apptsSeqno2Record newRecord = new Sd_sess_apptsSeqno2Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_sess_apptsSeqno2Record record)
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
		public Sd_sess_apptsSeqno2Record get(int index)
		{
			return (Sd_sess_apptsSeqno2Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_sess_apptsSeqno3Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_sess_apptsSeqno3Record newRecord = new Sd_sess_apptsSeqno3Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_sess_apptsSeqno3Record record)
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
		public Sd_sess_apptsSeqno3Record get(int index)
		{
			return (Sd_sess_apptsSeqno3Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_sess_apptsSeqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_sess_apptsSeqnoRecord newRecord = new Sd_sess_apptsSeqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_sess_apptsSeqnoRecord record)
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
		public Sd_sess_apptsSeqnoRecord get(int index)
		{
			return (Sd_sess_apptsSeqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_sess_apptsLoseqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_sess_apptsLoseqnoRecord newRecord = new Sd_sess_apptsLoseqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_sess_apptsLoseqnoRecord record)
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
		public Sd_sess_apptsLoseqnoRecord get(int index)
		{
			return (Sd_sess_apptsLoseqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Sd_sess_apptsSeqno2Record
	{
		public String Seqno2 = "";
		public String Etm2 = "";
		public String Stm2 = "";
		public String Act_ind_tm = "";
		
		public void clear()
		{
			Seqno2 = "";
			Etm2 = "";
			Stm2 = "";
			Act_ind_tm = "";
			
		}
	}
	public final class Sd_sess_apptsSeqno3Record
	{
		public String Seqno3 = "";
		public String First_appt_id = "";
		public String Appt_stat = "";
		public String Appt_head_id = "";
		public String Pkey = "";
		public String Appt_etm = "";
		public String Appt_stm = "";
		
		public void clear()
		{
			Seqno3 = "";
			First_appt_id = "";
			Appt_stat = "";
			Appt_head_id = "";
			Pkey = "";
			Appt_etm = "";
			Appt_stm = "";
			
		}
	}
	public final class Sd_sess_apptsSeqnoRecord
	{
		public String Seqno = "";
		public String Act_ind_usr = "";
		public String Susr = "";
		
		public void clear()
		{
			Seqno = "";
			Act_ind_usr = "";
			Susr = "";
			
		}
	}
	public final class Sd_sess_apptsLoseqnoRecord
	{
		public String Loseqno = "";
		public String Loremnoapp = "";
		public String Lomaxnoapp = "";
		public String Mos_id = "";
		public String Etm1 = "";
		public String Stm1 = "";
		
		public void clear()
		{
			Loseqno = "";
			Loremnoapp = "";
			Lomaxnoapp = "";
			Mos_id = "";
			Etm1 = "";
			Stm1 = "";
			
		}
	}	
	public final class Sd_sess_apptsFilter
	{			
		public String Prfile_sess_id = "";
		public String Prfiled_sess_id = "";
		public String Sess_dt = "";
		public String Stm = "";
		public String Etm = "";
		public String Mc_nm = "";
		public String Loc_nm = "";
		public String Mc_id = "";
		public String Int_loc_id = "";
		public String Mc_id1 = "";
		public String Int_loc_id1 = "";
		public String Userrights = "";
		public String Loid = "";
		public String Tno_appts = "";
		public String Tno_fappts = "";
		
		public void clear()
		{				
			Prfile_sess_id = "";
			Prfiled_sess_id = "";
			Sess_dt = "";
			Stm = "";
			Etm = "";
			Mc_nm = "";
			Loc_nm = "";
			Mc_id = "";
			Int_loc_id = "";
			Mc_id1 = "";
			Int_loc_id1 = "";
			Userrights = "";
			Loid = "";
			Tno_appts = "";
			Tno_fappts = "";
		}	
		public Sd_sess_apptsFilter cloneObject()
		{
			Sd_sess_apptsFilter newFilter = new Sd_sess_apptsFilter();
			
			newFilter.Prfile_sess_id = this.Prfile_sess_id;
			newFilter.Prfiled_sess_id = this.Prfiled_sess_id;
			newFilter.Sess_dt = this.Sess_dt;
			newFilter.Stm = this.Stm;
			newFilter.Etm = this.Etm;
			newFilter.Mc_nm = this.Mc_nm;
			newFilter.Loc_nm = this.Loc_nm;
			newFilter.Mc_id = this.Mc_id;
			newFilter.Int_loc_id = this.Int_loc_id;
			newFilter.Mc_id1 = this.Mc_id1;
			newFilter.Int_loc_id1 = this.Int_loc_id1;
			newFilter.Userrights = this.Userrights;
			newFilter.Loid = this.Loid;
			newFilter.Tno_appts = this.Tno_appts;
			newFilter.Tno_fappts = this.Tno_fappts;
			
			return newFilter;
		}
	}
	public final class Sd_sess_apptsEditFilter
	{			
		public boolean IncludePrfile_sess_id = true;
		public boolean IncludePrfiled_sess_id = true;
		public boolean IncludeSess_dt = true;
		public boolean IncludeStm = true;
		public boolean IncludeEtm = true;
		public boolean IncludeMc_nm = true;
		public boolean IncludeLoc_nm = true;
		public boolean IncludeMc_id = true;
		public boolean IncludeInt_loc_id = true;
		public boolean IncludeMc_id1 = true;
		public boolean IncludeInt_loc_id1 = true;
		public boolean IncludeUserrights = true;
		public boolean IncludeLoid = true;
		public boolean IncludeTno_appts = true;
		public boolean IncludeTno_fappts = true;
		
		public void includeAll()
		{				
			IncludePrfile_sess_id = true;
			IncludePrfiled_sess_id = true;
			IncludeSess_dt = true;
			IncludeStm = true;
			IncludeEtm = true;
			IncludeMc_nm = true;
			IncludeLoc_nm = true;
			IncludeMc_id = true;
			IncludeInt_loc_id = true;
			IncludeMc_id1 = true;
			IncludeInt_loc_id1 = true;
			IncludeUserrights = true;
			IncludeLoid = true;
			IncludeTno_appts = true;
			IncludeTno_fappts = true;
		}	
		public void excludeAll()
		{				
			IncludePrfile_sess_id = false;
			IncludePrfiled_sess_id = false;
			IncludeSess_dt = false;
			IncludeStm = false;
			IncludeEtm = false;
			IncludeMc_nm = false;
			IncludeLoc_nm = false;
			IncludeMc_id = false;
			IncludeInt_loc_id = false;
			IncludeMc_id1 = false;
			IncludeInt_loc_id1 = false;
			IncludeUserrights = false;
			IncludeLoid = false;
			IncludeTno_appts = false;
			IncludeTno_fappts = false;
		}
		public Sd_sess_apptsEditFilter cloneObject()
		{
			Sd_sess_apptsEditFilter newEditFilter = new Sd_sess_apptsEditFilter();
			
			newEditFilter.IncludePrfile_sess_id = this.IncludePrfile_sess_id;
			newEditFilter.IncludePrfiled_sess_id = this.IncludePrfiled_sess_id;
			newEditFilter.IncludeSess_dt = this.IncludeSess_dt;
			newEditFilter.IncludeStm = this.IncludeStm;
			newEditFilter.IncludeEtm = this.IncludeEtm;
			newEditFilter.IncludeMc_nm = this.IncludeMc_nm;
			newEditFilter.IncludeLoc_nm = this.IncludeLoc_nm;
			newEditFilter.IncludeMc_id = this.IncludeMc_id;
			newEditFilter.IncludeInt_loc_id = this.IncludeInt_loc_id;
			newEditFilter.IncludeMc_id1 = this.IncludeMc_id1;
			newEditFilter.IncludeInt_loc_id1 = this.IncludeInt_loc_id1;
			newEditFilter.IncludeUserrights = this.IncludeUserrights;
			newEditFilter.IncludeLoid = this.IncludeLoid;
			newEditFilter.IncludeTno_appts = this.IncludeTno_appts;
			newEditFilter.IncludeTno_fappts = this.IncludeTno_fappts;
			
			return newEditFilter;
		}
	}
}
