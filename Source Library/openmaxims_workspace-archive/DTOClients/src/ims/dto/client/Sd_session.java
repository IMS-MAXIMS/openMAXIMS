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

public final class Sd_session implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_session.class);
	
	private Sd_sessionFilter lastGetFilter = null;
	private final String serviceName = "SD_SESSION";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_sessionFilter Filter = new Sd_sessionFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_sessionEditFilter EditFilter = new Sd_sessionEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_sessionCollection DataCollection = new Sd_sessionCollection();

	/**
	 * Creates a new Sd_session Data Transfer Object.
	 */ 
	public Sd_session(ims.dto.Connection connection)
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
	public Sd_session cloneObject()
	{
		Sd_session cloneObject = new Sd_session(Connection);
			
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
			cloneObject.DataCollection.get(index).Prfile_id = DataCollection.get(x).Prfile_id;
			cloneObject.DataCollection.get(index).Grp_id = DataCollection.get(x).Grp_id;
			cloneObject.DataCollection.get(index).Activ_id = DataCollection.get(x).Activ_id;
			cloneObject.DataCollection.get(index).Sess_dt = DataCollection.get(x).Sess_dt;
			cloneObject.DataCollection.get(index).Stm = DataCollection.get(x).Stm;
			cloneObject.DataCollection.get(index).Etm = DataCollection.get(x).Etm;
			cloneObject.DataCollection.get(index).Sess_desc = DataCollection.get(x).Sess_desc;
			cloneObject.DataCollection.get(index).Max_app = DataCollection.get(x).Max_app;
			cloneObject.DataCollection.get(index).Lastapptint = DataCollection.get(x).Lastapptint;
			cloneObject.DataCollection.get(index).Rem_apps = DataCollection.get(x).Rem_apps;
			cloneObject.DataCollection.get(index).Int_loc_id = DataCollection.get(x).Int_loc_id;
			cloneObject.DataCollection.get(index).Tci_rnding_int = DataCollection.get(x).Tci_rnding_int;
			cloneObject.DataCollection.get(index).Prfile_sess_stat = DataCollection.get(x).Prfile_sess_stat;
			cloneObject.DataCollection.get(index).Prfile_sess_dur = DataCollection.get(x).Prfile_sess_dur;
			cloneObject.DataCollection.get(index).Rem_tm = DataCollection.get(x).Rem_tm;
			cloneObject.DataCollection.get(index).Act_ind = DataCollection.get(x).Act_ind;
			cloneObject.DataCollection.get(index).Act_stm = DataCollection.get(x).Act_stm;
			cloneObject.DataCollection.get(index).Act_etm = DataCollection.get(x).Act_etm;
			cloneObject.DataCollection.get(index).Stat_reas = DataCollection.get(x).Stat_reas;
			cloneObject.DataCollection.get(index).Min_int = DataCollection.get(x).Min_int;
			cloneObject.DataCollection.get(index).Mod_ind = DataCollection.get(x).Mod_ind;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Sched_cat = DataCollection.get(x).Sched_cat;
			cloneObject.DataCollection.get(index).Activ_name = DataCollection.get(x).Activ_name;
			cloneObject.DataCollection.get(index).Adhoc = DataCollection.get(x).Adhoc;
							
			
			for(int iUsr_id = 0; iUsr_id < DataCollection.get(x).Usr_idCollection.count(); iUsr_id++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Usr_idCollection.add();
					
				cloneObject.DataCollection.get(index).Usr_idCollection.get(rIndex).Usr_id = DataCollection.get(x).Usr_idCollection.get(iUsr_id).Usr_id;
				cloneObject.DataCollection.get(index).Usr_idCollection.get(rIndex).Susr = DataCollection.get(x).Usr_idCollection.get(iUsr_id).Susr;
				cloneObject.DataCollection.get(index).Usr_idCollection.get(rIndex).Act_ind_usr = DataCollection.get(x).Usr_idCollection.get(iUsr_id).Act_ind_usr;
										
			}
			
			for(int iSeqno2 = 0; iSeqno2 < DataCollection.get(x).Seqno2Collection.count(); iSeqno2++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno2Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Seqno2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Seqno2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Act_prfile_id = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Act_prfile_id;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Sessiond_id2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Sessiond_id2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Action_id = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Action_id;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Rm_no_act = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Rm_no_act;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Max_no = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Max_no;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Act_ind_prsess = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Act_ind_prsess;
										
			}
			
			for(int iSeqno3 = 0; iSeqno3 < DataCollection.get(x).Seqno3Collection.count(); iSeqno3++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno3Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Seqno3 = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Seqno3;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Excl_tm_id = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Excl_tm_id;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Sessiond_id3 = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Sessiond_id3;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Stm2 = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Stm2;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Etm2 = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Etm2;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Act_ind_tm = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Act_ind_tm;
										
			}
			
			for(int iPrfileass_s_id = 0; iPrfileass_s_id < DataCollection.get(x).Prfileass_s_idCollection.count(); iPrfileass_s_id++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Prfileass_s_idCollection.add();
					
				cloneObject.DataCollection.get(index).Prfileass_s_idCollection.get(rIndex).Prfileass_s_id = DataCollection.get(x).Prfileass_s_idCollection.get(iPrfileass_s_id).Prfileass_s_id;
				cloneObject.DataCollection.get(index).Prfileass_s_idCollection.get(rIndex).Prfileass_id = DataCollection.get(x).Prfileass_s_idCollection.get(iPrfileass_s_id).Prfileass_id;
				cloneObject.DataCollection.get(index).Prfileass_s_idCollection.get(rIndex).Sessiond_id = DataCollection.get(x).Prfileass_s_idCollection.get(iPrfileass_s_id).Sessiond_id;
				cloneObject.DataCollection.get(index).Prfileass_s_idCollection.get(rIndex).Mos_id = DataCollection.get(x).Prfileass_s_idCollection.get(iPrfileass_s_id).Mos_id;
				cloneObject.DataCollection.get(index).Prfileass_s_idCollection.get(rIndex).Stm1 = DataCollection.get(x).Prfileass_s_idCollection.get(iPrfileass_s_id).Stm1;
				cloneObject.DataCollection.get(index).Prfileass_s_idCollection.get(rIndex).Etm1 = DataCollection.get(x).Prfileass_s_idCollection.get(iPrfileass_s_id).Etm1;
				cloneObject.DataCollection.get(index).Prfileass_s_idCollection.get(rIndex).Dur = DataCollection.get(x).Prfileass_s_idCollection.get(iPrfileass_s_id).Dur;
				cloneObject.DataCollection.get(index).Prfileass_s_idCollection.get(rIndex).Rem_tm1 = DataCollection.get(x).Prfileass_s_idCollection.get(iPrfileass_s_id).Rem_tm1;
				cloneObject.DataCollection.get(index).Prfileass_s_idCollection.get(rIndex).Max_app1 = DataCollection.get(x).Prfileass_s_idCollection.get(iPrfileass_s_id).Max_app1;
				cloneObject.DataCollection.get(index).Prfileass_s_idCollection.get(rIndex).Rem_apps1 = DataCollection.get(x).Prfileass_s_idCollection.get(iPrfileass_s_id).Rem_apps1;
				cloneObject.DataCollection.get(index).Prfileass_s_idCollection.get(rIndex).Act_ind_ass = DataCollection.get(x).Prfileass_s_idCollection.get(iPrfileass_s_id).Act_ind_ass;
										
			}
			
			for(int iPrfiled_sess_id1 = 0; iPrfiled_sess_id1 < DataCollection.get(x).Prfiled_sess_id1Collection.count(); iPrfiled_sess_id1++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.add();
					
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Prfiled_sess_id1 = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Prfiled_sess_id1;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Sess_stat_reason = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Sess_stat_reason;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Sess_stat = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Sess_stat;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Mod_ind1 = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Mod_ind1;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Sess_int_loc = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Sess_int_loc;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Prfiled_id1 = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Prfiled_id1;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Mc_id = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Mc_id;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Sessd_desc = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Sessd_desc;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Max_app2 = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Max_app2;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Rem_apps2 = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Rem_apps2;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Min_int1 = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Min_int1;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Dur5 = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Dur5;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Rem_time = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Rem_time;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Act_ind2 = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Act_ind2;
										
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
		return "Sd_session.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_session.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_session.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_session.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_session.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_session.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_session.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_session.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_session.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_session.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_session.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_session.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_session.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_session.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_session.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_session.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_session.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_session.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_session.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_session.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_session.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_session.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_session.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_session.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_session.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_session.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_session.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_session nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_session After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_session After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_session.List");
							
		listInProgress = true;	
		logger.debug("Sd_session Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_session After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_session After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_sessionFilter filter)
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
		
		if(Filter.Prfile_id != null && filter.Prfile_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRFILE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prfile_id);
		}
		
		if(Filter.Grp_id != null && filter.Grp_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GRP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Grp_id);
		}
		
		if(Filter.Activ_id != null && filter.Activ_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activ_id);
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
		
		if(Filter.Sess_desc != null && filter.Sess_desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SESS_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sess_desc);
		}
		
		if(Filter.Max_app != null && filter.Max_app.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MAX_APP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Max_app);
		}
		
		if(Filter.Lastapptint != null && filter.Lastapptint.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LASTAPPTINT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lastapptint);
		}
		
		if(Filter.Rem_apps != null && filter.Rem_apps.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REM_APPS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rem_apps);
		}
		
		if(Filter.Int_loc_id != null && filter.Int_loc_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INT_LOC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_loc_id);
		}
		
		if(Filter.Tci_rnding_int != null && filter.Tci_rnding_int.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TCI_RNDING_INT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tci_rnding_int);
		}
		
		if(Filter.Prfile_sess_stat != null && filter.Prfile_sess_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRFILE_SESS_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prfile_sess_stat);
		}
		
		if(Filter.Prfile_sess_dur != null && filter.Prfile_sess_dur.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRFILE_SESS_DUR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prfile_sess_dur);
		}
		
		if(Filter.Rem_tm != null && filter.Rem_tm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REM_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rem_tm);
		}
		
		if(Filter.Act_ind != null && filter.Act_ind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_ind);
		}
		
		if(Filter.Act_stm != null && filter.Act_stm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_STM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_stm);
		}
		
		if(Filter.Act_etm != null && filter.Act_etm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_ETM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_etm);
		}
		
		if(Filter.Stat_reas != null && filter.Stat_reas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STAT_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat_reas);
		}
		
		if(Filter.Min_int != null && filter.Min_int.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MIN_INT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Min_int);
		}
		
		if(Filter.Mod_ind != null && filter.Mod_ind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MOD_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mod_ind);
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
		}
		
		if(Filter.Sched_cat != null && filter.Sched_cat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCHED_CAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sched_cat);
		}
		
		if(Filter.Activ_name != null && filter.Activ_name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIV_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activ_name);
		}
		
		if(Filter.Adhoc != null && filter.Adhoc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADHOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adhoc);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_sessionRecord data = (Sd_sessionRecord)DataCollection.get(0);
		
		if(EditFilter.IncludePrfile_sess_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILE_SESS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prfile_sess_id));
		}
		
		if(EditFilter.IncludePrfile_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prfile_id));
		}
		
		if(EditFilter.IncludeGrp_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GRP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Grp_id));
		}
		
		if(EditFilter.IncludeActiv_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activ_id));
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
		
		if(EditFilter.IncludeSess_desc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESS_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sess_desc));
		}
		
		if(EditFilter.IncludeMax_app)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MAX_APP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Max_app));
		}
		
		if(EditFilter.IncludeLastapptint)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LASTAPPTINT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lastapptint));
		}
		
		if(EditFilter.IncludeRem_apps)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REM_APPS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rem_apps));
		}
		
		if(EditFilter.IncludeInt_loc_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INT_LOC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_loc_id));
		}
		
		if(EditFilter.IncludeTci_rnding_int)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TCI_RNDING_INT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tci_rnding_int));
		}
		
		if(EditFilter.IncludePrfile_sess_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILE_SESS_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prfile_sess_stat));
		}
		
		if(EditFilter.IncludePrfile_sess_dur)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILE_SESS_DUR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prfile_sess_dur));
		}
		
		if(EditFilter.IncludeRem_tm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REM_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rem_tm));
		}
		
		if(EditFilter.IncludeAct_ind)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_ind));
		}
		
		if(EditFilter.IncludeAct_stm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_STM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_stm));
		}
		
		if(EditFilter.IncludeAct_etm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_ETM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_etm));
		}
		
		if(EditFilter.IncludeStat_reas)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STAT_REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat_reas));
		}
		
		if(EditFilter.IncludeMin_int)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MIN_INT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Min_int));
		}
		
		if(EditFilter.IncludeMod_ind)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MOD_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mod_ind));
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
		}
		
		if(EditFilter.IncludeSched_cat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCHED_CAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sched_cat));
		}
		
		if(EditFilter.IncludeActiv_name)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIV_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activ_name));
		}
		
		if(EditFilter.IncludeAdhoc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADHOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adhoc));
		}
		
		
		for(int x = 0; x < data.Usr_idCollection.count(); x++)
		{
			Sd_sessionUsr_idRecord rgRecord = (Sd_sessionUsr_idRecord)data.Usr_idCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("USR_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Usr_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Susr));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_USR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_usr));
			
		}
		for(int x = 0; x < data.Seqno2Collection.count(); x++)
		{
			Sd_sessionSeqno2Record rgRecord = (Sd_sessionSeqno2Record)data.Seqno2Collection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_PRFILE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_prfile_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESSIOND_ID2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Sessiond_id2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Action_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RM_NO_ACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Rm_no_act));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MAX_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Max_no));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_PRSESS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_prsess));
			
		}
		for(int x = 0; x < data.Seqno3Collection.count(); x++)
		{
			Sd_sessionSeqno3Record rgRecord = (Sd_sessionSeqno3Record)data.Seqno3Collection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno3));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EXCL_TM_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Excl_tm_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESSIOND_ID3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Sessiond_id3));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Stm2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ETM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Etm2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_tm));
			
		}
		for(int x = 0; x < data.Prfileass_s_idCollection.count(); x++)
		{
			Sd_sessionPrfileass_s_idRecord rgRecord = (Sd_sessionPrfileass_s_idRecord)data.Prfileass_s_idCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILEASS_S_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Prfileass_s_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILEASS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Prfileass_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESSIOND_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Sessiond_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MOS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mos_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Stm1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ETM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Etm1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DUR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Dur));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REM_TM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Rem_tm1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MAX_APP1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Max_app1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REM_APPS1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Rem_apps1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_ASS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_ass));
			
		}
		for(int x = 0; x < data.Prfiled_sess_id1Collection.count(); x++)
		{
			Sd_sessionPrfiled_sess_id1Record rgRecord = (Sd_sessionPrfiled_sess_id1Record)data.Prfiled_sess_id1Collection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILED_SESS_ID1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Prfiled_sess_id1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESS_STAT_REASON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Sess_stat_reason));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESS_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Sess_stat));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MOD_IND1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mod_ind1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESS_INT_LOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Sess_int_loc));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILED_ID1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Prfiled_id1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mc_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESSD_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Sessd_desc));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MAX_APP2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Max_app2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REM_APPS2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Rem_apps2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MIN_INT1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Min_int1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DUR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Dur5));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REM_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Rem_time));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind2));
			
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
			Sd_sessionRecord record = new Sd_sessionRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Prfile_sess_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_ID"));
			record.Prfile_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_ID"));
			record.Grp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GRP_ID"));
			record.Activ_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIV_ID"));
			record.Sess_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_DT"));
			record.Stm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STM"));
			record.Etm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETM"));
			record.Sess_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_DESC"));
			record.Max_app = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAX_APP"));
			record.Lastapptint = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LASTAPPTINT"));
			record.Rem_apps = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REM_APPS"));
			record.Int_loc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_LOC_ID"));
			record.Tci_rnding_int = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TCI_RNDING_INT"));
			record.Prfile_sess_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_STAT"));
			record.Prfile_sess_dur = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_DUR"));
			record.Rem_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REM_TM"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
			record.Act_stm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STM"));
			record.Act_etm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_ETM"));
			record.Stat_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT_REAS"));
			record.Min_int = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MIN_INT"));
			record.Mod_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOD_IND"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Sched_cat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCHED_CAT"));
			record.Activ_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIV_NAME"));
			record.Adhoc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADHOC"));
									
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
			Sd_sessionRecord record = new Sd_sessionRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Prfile_sess_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_ID"));
			record.Prfile_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_ID"));
			record.Grp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GRP_ID"));
			record.Activ_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIV_ID"));
			record.Sess_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_DT"));
			record.Stm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STM"));
			record.Etm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETM"));
			record.Sess_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_DESC"));
			record.Max_app = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAX_APP"));
			record.Lastapptint = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LASTAPPTINT"));
			record.Rem_apps = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REM_APPS"));
			record.Int_loc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_LOC_ID"));
			record.Tci_rnding_int = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TCI_RNDING_INT"));
			record.Prfile_sess_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_STAT"));
			record.Prfile_sess_dur = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_DUR"));
			record.Rem_tm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REM_TM"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
			record.Act_stm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STM"));
			record.Act_etm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_ETM"));
			record.Stat_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT_REAS"));
			record.Min_int = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MIN_INT"));
			record.Mod_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOD_IND"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Sched_cat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCHED_CAT"));
			record.Activ_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIV_NAME"));
			record.Adhoc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADHOC"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("usr_id"))
					record.Usr_idCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno2"))
					record.Seqno2Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno3"))
					record.Seqno3Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfileass_s_id"))
					record.Prfileass_s_idCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfiled_sess_id1"))
					record.Prfiled_sess_id1Collection.add();
			
									
			rgCount = record.Usr_idCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("usr_id"))
					{
						Sd_sessionUsr_idRecord rgRecord = record.Usr_idCollection.get(recCount);
						rgRecord.Usr_id = Connection.getAttributeValue(valueItems[i]);
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
						Sd_sessionUsr_idRecord rgRecord = record.Usr_idCollection.get(recCount);
						rgRecord.Susr = Connection.getAttributeValue(valueItems[i]);
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
						Sd_sessionUsr_idRecord rgRecord = record.Usr_idCollection.get(recCount);
						rgRecord.Act_ind_usr = Connection.getAttributeValue(valueItems[i]);
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
						Sd_sessionSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Seqno2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_prfile_id"))
					{
						Sd_sessionSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Act_prfile_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("sessiond_id2"))
					{
						Sd_sessionSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Sessiond_id2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("action_id"))
					{
						Sd_sessionSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Action_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("rm_no_act"))
					{
						Sd_sessionSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Rm_no_act = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("max_no"))
					{
						Sd_sessionSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Max_no = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind_prsess"))
					{
						Sd_sessionSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Act_ind_prsess = Connection.getAttributeValue(valueItems[i]);
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
						Sd_sessionSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Seqno3 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("excl_tm_id"))
					{
						Sd_sessionSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Excl_tm_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("sessiond_id3"))
					{
						Sd_sessionSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Sessiond_id3 = Connection.getAttributeValue(valueItems[i]);
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
						Sd_sessionSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Stm2 = Connection.getAttributeValue(valueItems[i]);
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
						Sd_sessionSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Etm2 = Connection.getAttributeValue(valueItems[i]);
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
						Sd_sessionSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Act_ind_tm = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Prfileass_s_idCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfileass_s_id"))
					{
						Sd_sessionPrfileass_s_idRecord rgRecord = record.Prfileass_s_idCollection.get(recCount);
						rgRecord.Prfileass_s_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfileass_id"))
					{
						Sd_sessionPrfileass_s_idRecord rgRecord = record.Prfileass_s_idCollection.get(recCount);
						rgRecord.Prfileass_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("sessiond_id"))
					{
						Sd_sessionPrfileass_s_idRecord rgRecord = record.Prfileass_s_idCollection.get(recCount);
						rgRecord.Sessiond_id = Connection.getAttributeValue(valueItems[i]);
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
						Sd_sessionPrfileass_s_idRecord rgRecord = record.Prfileass_s_idCollection.get(recCount);
						rgRecord.Mos_id = Connection.getAttributeValue(valueItems[i]);
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
						Sd_sessionPrfileass_s_idRecord rgRecord = record.Prfileass_s_idCollection.get(recCount);
						rgRecord.Stm1 = Connection.getAttributeValue(valueItems[i]);
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
						Sd_sessionPrfileass_s_idRecord rgRecord = record.Prfileass_s_idCollection.get(recCount);
						rgRecord.Etm1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("dur"))
					{
						Sd_sessionPrfileass_s_idRecord rgRecord = record.Prfileass_s_idCollection.get(recCount);
						rgRecord.Dur = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("rem_tm1"))
					{
						Sd_sessionPrfileass_s_idRecord rgRecord = record.Prfileass_s_idCollection.get(recCount);
						rgRecord.Rem_tm1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("max_app1"))
					{
						Sd_sessionPrfileass_s_idRecord rgRecord = record.Prfileass_s_idCollection.get(recCount);
						rgRecord.Max_app1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("rem_apps1"))
					{
						Sd_sessionPrfileass_s_idRecord rgRecord = record.Prfileass_s_idCollection.get(recCount);
						rgRecord.Rem_apps1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind_ass"))
					{
						Sd_sessionPrfileass_s_idRecord rgRecord = record.Prfileass_s_idCollection.get(recCount);
						rgRecord.Act_ind_ass = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Prfiled_sess_id1Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfiled_sess_id1"))
					{
						Sd_sessionPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Prfiled_sess_id1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("sess_stat_reason"))
					{
						Sd_sessionPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Sess_stat_reason = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("sess_stat"))
					{
						Sd_sessionPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Sess_stat = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("mod_ind1"))
					{
						Sd_sessionPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Mod_ind1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("sess_int_loc"))
					{
						Sd_sessionPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Sess_int_loc = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfiled_id1"))
					{
						Sd_sessionPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Prfiled_id1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("mc_id"))
					{
						Sd_sessionPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Mc_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("sessd_desc"))
					{
						Sd_sessionPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Sessd_desc = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("max_app2"))
					{
						Sd_sessionPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Max_app2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("rem_apps2"))
					{
						Sd_sessionPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Rem_apps2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("min_int1"))
					{
						Sd_sessionPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Min_int1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("dur5"))
					{
						Sd_sessionPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Dur5 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("rem_time"))
					{
						Sd_sessionPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Rem_time = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind2"))
					{
						Sd_sessionPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Act_ind2 = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Sd_sessionCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_sessionRecord newRecord = new Sd_sessionRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_sessionRecord record)
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
		public Sd_sessionRecord get(int index)
		{
			return (Sd_sessionRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_sessionRecord
	{
		public String Prfile_sess_id = "";
		public String Prfile_id = "";
		public String Grp_id = "";
		public String Activ_id = "";
		public String Sess_dt = "";
		public String Stm = "";
		public String Etm = "";
		public String Sess_desc = "";
		public String Max_app = "";
		public String Lastapptint = "";
		public String Rem_apps = "";
		public String Int_loc_id = "";
		public String Tci_rnding_int = "";
		public String Prfile_sess_stat = "";
		public String Prfile_sess_dur = "";
		public String Rem_tm = "";
		public String Act_ind = "";
		public String Act_stm = "";
		public String Act_etm = "";
		public String Stat_reas = "";
		public String Min_int = "";
		public String Mod_ind = "";
		public String Tstp = "";
		public String Sched_cat = "";
		public String Activ_name = "";
		public String Adhoc = "";
		
		public Sd_sessionUsr_idCollection Usr_idCollection = new Sd_sessionUsr_idCollection();
		public Sd_sessionSeqno2Collection Seqno2Collection = new Sd_sessionSeqno2Collection();
		public Sd_sessionSeqno3Collection Seqno3Collection = new Sd_sessionSeqno3Collection();
		public Sd_sessionPrfileass_s_idCollection Prfileass_s_idCollection = new Sd_sessionPrfileass_s_idCollection();
		public Sd_sessionPrfiled_sess_id1Collection Prfiled_sess_id1Collection = new Sd_sessionPrfiled_sess_id1Collection();		
		
		public void clear()
		{
			Prfile_sess_id = "";
			Prfile_id = "";
			Grp_id = "";
			Activ_id = "";
			Sess_dt = "";
			Stm = "";
			Etm = "";
			Sess_desc = "";
			Max_app = "";
			Lastapptint = "";
			Rem_apps = "";
			Int_loc_id = "";
			Tci_rnding_int = "";
			Prfile_sess_stat = "";
			Prfile_sess_dur = "";
			Rem_tm = "";
			Act_ind = "";
			Act_stm = "";
			Act_etm = "";
			Stat_reas = "";
			Min_int = "";
			Mod_ind = "";
			Tstp = "";
			Sched_cat = "";
			Activ_name = "";
			Adhoc = "";
			
			Usr_idCollection.clear();
			Seqno2Collection.clear();
			Seqno3Collection.clear();
			Prfileass_s_idCollection.clear();
			Prfiled_sess_id1Collection.clear();
		}		
	}
	
	public final class Sd_sessionUsr_idCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_sessionUsr_idRecord newRecord = new Sd_sessionUsr_idRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_sessionUsr_idRecord record)
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
		public Sd_sessionUsr_idRecord get(int index)
		{
			return (Sd_sessionUsr_idRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_sessionSeqno2Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_sessionSeqno2Record newRecord = new Sd_sessionSeqno2Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_sessionSeqno2Record record)
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
		public Sd_sessionSeqno2Record get(int index)
		{
			return (Sd_sessionSeqno2Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_sessionSeqno3Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_sessionSeqno3Record newRecord = new Sd_sessionSeqno3Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_sessionSeqno3Record record)
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
		public Sd_sessionSeqno3Record get(int index)
		{
			return (Sd_sessionSeqno3Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_sessionPrfileass_s_idCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_sessionPrfileass_s_idRecord newRecord = new Sd_sessionPrfileass_s_idRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_sessionPrfileass_s_idRecord record)
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
		public Sd_sessionPrfileass_s_idRecord get(int index)
		{
			return (Sd_sessionPrfileass_s_idRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_sessionPrfiled_sess_id1Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_sessionPrfiled_sess_id1Record newRecord = new Sd_sessionPrfiled_sess_id1Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_sessionPrfiled_sess_id1Record record)
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
		public Sd_sessionPrfiled_sess_id1Record get(int index)
		{
			return (Sd_sessionPrfiled_sess_id1Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Sd_sessionUsr_idRecord
	{
		public String Usr_id = "";
		public String Susr = "";
		public String Act_ind_usr = "";
		
		public void clear()
		{
			Usr_id = "";
			Susr = "";
			Act_ind_usr = "";
			
		}
	}
	public final class Sd_sessionSeqno2Record
	{
		public String Seqno2 = "";
		public String Act_prfile_id = "";
		public String Sessiond_id2 = "";
		public String Action_id = "";
		public String Rm_no_act = "";
		public String Max_no = "";
		public String Act_ind_prsess = "";
		
		public void clear()
		{
			Seqno2 = "";
			Act_prfile_id = "";
			Sessiond_id2 = "";
			Action_id = "";
			Rm_no_act = "";
			Max_no = "";
			Act_ind_prsess = "";
			
		}
	}
	public final class Sd_sessionSeqno3Record
	{
		public String Seqno3 = "";
		public String Excl_tm_id = "";
		public String Sessiond_id3 = "";
		public String Stm2 = "";
		public String Etm2 = "";
		public String Act_ind_tm = "";
		
		public void clear()
		{
			Seqno3 = "";
			Excl_tm_id = "";
			Sessiond_id3 = "";
			Stm2 = "";
			Etm2 = "";
			Act_ind_tm = "";
			
		}
	}
	public final class Sd_sessionPrfileass_s_idRecord
	{
		public String Prfileass_s_id = "";
		public String Prfileass_id = "";
		public String Sessiond_id = "";
		public String Mos_id = "";
		public String Stm1 = "";
		public String Etm1 = "";
		public String Dur = "";
		public String Rem_tm1 = "";
		public String Max_app1 = "";
		public String Rem_apps1 = "";
		public String Act_ind_ass = "";
		
		public void clear()
		{
			Prfileass_s_id = "";
			Prfileass_id = "";
			Sessiond_id = "";
			Mos_id = "";
			Stm1 = "";
			Etm1 = "";
			Dur = "";
			Rem_tm1 = "";
			Max_app1 = "";
			Rem_apps1 = "";
			Act_ind_ass = "";
			
		}
	}
	public final class Sd_sessionPrfiled_sess_id1Record
	{
		public String Prfiled_sess_id1 = "";
		public String Sess_stat_reason = "";
		public String Sess_stat = "";
		public String Mod_ind1 = "";
		public String Sess_int_loc = "";
		public String Prfiled_id1 = "";
		public String Mc_id = "";
		public String Sessd_desc = "";
		public String Max_app2 = "";
		public String Rem_apps2 = "";
		public String Min_int1 = "";
		public String Dur5 = "";
		public String Rem_time = "";
		public String Act_ind2 = "";
		
		public void clear()
		{
			Prfiled_sess_id1 = "";
			Sess_stat_reason = "";
			Sess_stat = "";
			Mod_ind1 = "";
			Sess_int_loc = "";
			Prfiled_id1 = "";
			Mc_id = "";
			Sessd_desc = "";
			Max_app2 = "";
			Rem_apps2 = "";
			Min_int1 = "";
			Dur5 = "";
			Rem_time = "";
			Act_ind2 = "";
			
		}
	}	
	public final class Sd_sessionFilter
	{			
		public String Prfile_sess_id = "";
		public String Prfile_id = "";
		public String Grp_id = "";
		public String Activ_id = "";
		public String Sess_dt = "";
		public String Stm = "";
		public String Etm = "";
		public String Sess_desc = "";
		public String Max_app = "";
		public String Lastapptint = "";
		public String Rem_apps = "";
		public String Int_loc_id = "";
		public String Tci_rnding_int = "";
		public String Prfile_sess_stat = "";
		public String Prfile_sess_dur = "";
		public String Rem_tm = "";
		public String Act_ind = "";
		public String Act_stm = "";
		public String Act_etm = "";
		public String Stat_reas = "";
		public String Min_int = "";
		public String Mod_ind = "";
		public String Tstp = "";
		public String Sched_cat = "";
		public String Activ_name = "";
		public String Adhoc = "";
		
		public void clear()
		{				
			Prfile_sess_id = "";
			Prfile_id = "";
			Grp_id = "";
			Activ_id = "";
			Sess_dt = "";
			Stm = "";
			Etm = "";
			Sess_desc = "";
			Max_app = "";
			Lastapptint = "";
			Rem_apps = "";
			Int_loc_id = "";
			Tci_rnding_int = "";
			Prfile_sess_stat = "";
			Prfile_sess_dur = "";
			Rem_tm = "";
			Act_ind = "";
			Act_stm = "";
			Act_etm = "";
			Stat_reas = "";
			Min_int = "";
			Mod_ind = "";
			Tstp = "";
			Sched_cat = "";
			Activ_name = "";
			Adhoc = "";
		}	
		public Sd_sessionFilter cloneObject()
		{
			Sd_sessionFilter newFilter = new Sd_sessionFilter();
			
			newFilter.Prfile_sess_id = this.Prfile_sess_id;
			newFilter.Prfile_id = this.Prfile_id;
			newFilter.Grp_id = this.Grp_id;
			newFilter.Activ_id = this.Activ_id;
			newFilter.Sess_dt = this.Sess_dt;
			newFilter.Stm = this.Stm;
			newFilter.Etm = this.Etm;
			newFilter.Sess_desc = this.Sess_desc;
			newFilter.Max_app = this.Max_app;
			newFilter.Lastapptint = this.Lastapptint;
			newFilter.Rem_apps = this.Rem_apps;
			newFilter.Int_loc_id = this.Int_loc_id;
			newFilter.Tci_rnding_int = this.Tci_rnding_int;
			newFilter.Prfile_sess_stat = this.Prfile_sess_stat;
			newFilter.Prfile_sess_dur = this.Prfile_sess_dur;
			newFilter.Rem_tm = this.Rem_tm;
			newFilter.Act_ind = this.Act_ind;
			newFilter.Act_stm = this.Act_stm;
			newFilter.Act_etm = this.Act_etm;
			newFilter.Stat_reas = this.Stat_reas;
			newFilter.Min_int = this.Min_int;
			newFilter.Mod_ind = this.Mod_ind;
			newFilter.Tstp = this.Tstp;
			newFilter.Sched_cat = this.Sched_cat;
			newFilter.Activ_name = this.Activ_name;
			newFilter.Adhoc = this.Adhoc;
			
			return newFilter;
		}
	}
	public final class Sd_sessionEditFilter
	{			
		public boolean IncludePrfile_sess_id = true;
		public boolean IncludePrfile_id = true;
		public boolean IncludeGrp_id = true;
		public boolean IncludeActiv_id = true;
		public boolean IncludeSess_dt = true;
		public boolean IncludeStm = true;
		public boolean IncludeEtm = true;
		public boolean IncludeSess_desc = true;
		public boolean IncludeMax_app = true;
		public boolean IncludeLastapptint = true;
		public boolean IncludeRem_apps = true;
		public boolean IncludeInt_loc_id = true;
		public boolean IncludeTci_rnding_int = true;
		public boolean IncludePrfile_sess_stat = true;
		public boolean IncludePrfile_sess_dur = true;
		public boolean IncludeRem_tm = true;
		public boolean IncludeAct_ind = true;
		public boolean IncludeAct_stm = true;
		public boolean IncludeAct_etm = true;
		public boolean IncludeStat_reas = true;
		public boolean IncludeMin_int = true;
		public boolean IncludeMod_ind = true;
		public boolean IncludeTstp = true;
		public boolean IncludeSched_cat = true;
		public boolean IncludeActiv_name = true;
		public boolean IncludeAdhoc = true;
		
		public void includeAll()
		{				
			IncludePrfile_sess_id = true;
			IncludePrfile_id = true;
			IncludeGrp_id = true;
			IncludeActiv_id = true;
			IncludeSess_dt = true;
			IncludeStm = true;
			IncludeEtm = true;
			IncludeSess_desc = true;
			IncludeMax_app = true;
			IncludeLastapptint = true;
			IncludeRem_apps = true;
			IncludeInt_loc_id = true;
			IncludeTci_rnding_int = true;
			IncludePrfile_sess_stat = true;
			IncludePrfile_sess_dur = true;
			IncludeRem_tm = true;
			IncludeAct_ind = true;
			IncludeAct_stm = true;
			IncludeAct_etm = true;
			IncludeStat_reas = true;
			IncludeMin_int = true;
			IncludeMod_ind = true;
			IncludeTstp = true;
			IncludeSched_cat = true;
			IncludeActiv_name = true;
			IncludeAdhoc = true;
		}	
		public void excludeAll()
		{				
			IncludePrfile_sess_id = false;
			IncludePrfile_id = false;
			IncludeGrp_id = false;
			IncludeActiv_id = false;
			IncludeSess_dt = false;
			IncludeStm = false;
			IncludeEtm = false;
			IncludeSess_desc = false;
			IncludeMax_app = false;
			IncludeLastapptint = false;
			IncludeRem_apps = false;
			IncludeInt_loc_id = false;
			IncludeTci_rnding_int = false;
			IncludePrfile_sess_stat = false;
			IncludePrfile_sess_dur = false;
			IncludeRem_tm = false;
			IncludeAct_ind = false;
			IncludeAct_stm = false;
			IncludeAct_etm = false;
			IncludeStat_reas = false;
			IncludeMin_int = false;
			IncludeMod_ind = false;
			IncludeTstp = false;
			IncludeSched_cat = false;
			IncludeActiv_name = false;
			IncludeAdhoc = false;
		}
		public Sd_sessionEditFilter cloneObject()
		{
			Sd_sessionEditFilter newEditFilter = new Sd_sessionEditFilter();
			
			newEditFilter.IncludePrfile_sess_id = this.IncludePrfile_sess_id;
			newEditFilter.IncludePrfile_id = this.IncludePrfile_id;
			newEditFilter.IncludeGrp_id = this.IncludeGrp_id;
			newEditFilter.IncludeActiv_id = this.IncludeActiv_id;
			newEditFilter.IncludeSess_dt = this.IncludeSess_dt;
			newEditFilter.IncludeStm = this.IncludeStm;
			newEditFilter.IncludeEtm = this.IncludeEtm;
			newEditFilter.IncludeSess_desc = this.IncludeSess_desc;
			newEditFilter.IncludeMax_app = this.IncludeMax_app;
			newEditFilter.IncludeLastapptint = this.IncludeLastapptint;
			newEditFilter.IncludeRem_apps = this.IncludeRem_apps;
			newEditFilter.IncludeInt_loc_id = this.IncludeInt_loc_id;
			newEditFilter.IncludeTci_rnding_int = this.IncludeTci_rnding_int;
			newEditFilter.IncludePrfile_sess_stat = this.IncludePrfile_sess_stat;
			newEditFilter.IncludePrfile_sess_dur = this.IncludePrfile_sess_dur;
			newEditFilter.IncludeRem_tm = this.IncludeRem_tm;
			newEditFilter.IncludeAct_ind = this.IncludeAct_ind;
			newEditFilter.IncludeAct_stm = this.IncludeAct_stm;
			newEditFilter.IncludeAct_etm = this.IncludeAct_etm;
			newEditFilter.IncludeStat_reas = this.IncludeStat_reas;
			newEditFilter.IncludeMin_int = this.IncludeMin_int;
			newEditFilter.IncludeMod_ind = this.IncludeMod_ind;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeSched_cat = this.IncludeSched_cat;
			newEditFilter.IncludeActiv_name = this.IncludeActiv_name;
			newEditFilter.IncludeAdhoc = this.IncludeAdhoc;
			
			return newEditFilter;
		}
	}
}
