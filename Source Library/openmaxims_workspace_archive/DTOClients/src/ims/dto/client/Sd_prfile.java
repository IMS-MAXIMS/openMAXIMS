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

public final class Sd_prfile implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_prfile.class);
	
	private Sd_prfileFilter lastGetFilter = null;
	private final String serviceName = "SD_PRFILE";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_prfileFilter Filter = new Sd_prfileFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_prfileEditFilter EditFilter = new Sd_prfileEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_prfileCollection DataCollection = new Sd_prfileCollection();

	/**
	 * Creates a new Sd_prfile Data Transfer Object.
	 */ 
	public Sd_prfile(ims.dto.Connection connection)
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
	public Sd_prfile cloneObject()
	{
		Sd_prfile cloneObject = new Sd_prfile(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Prfile_id = DataCollection.get(x).Prfile_id;
			cloneObject.DataCollection.get(index).Activ_id = DataCollection.get(x).Activ_id;
			cloneObject.DataCollection.get(index).Grp_id = DataCollection.get(x).Grp_id;
			cloneObject.DataCollection.get(index).Int_loc_id = DataCollection.get(x).Int_loc_id;
			cloneObject.DataCollection.get(index).Prfile_desc = DataCollection.get(x).Prfile_desc;
			cloneObject.DataCollection.get(index).Sched_cat = DataCollection.get(x).Sched_cat;
			cloneObject.DataCollection.get(index).Stm = DataCollection.get(x).Stm;
			cloneObject.DataCollection.get(index).Etm = DataCollection.get(x).Etm;
			cloneObject.DataCollection.get(index).Effr = DataCollection.get(x).Effr;
			cloneObject.DataCollection.get(index).Efto = DataCollection.get(x).Efto;
			cloneObject.DataCollection.get(index).Max_app = DataCollection.get(x).Max_app;
			cloneObject.DataCollection.get(index).Inttyp = DataCollection.get(x).Inttyp;
			cloneObject.DataCollection.get(index).Intsize = DataCollection.get(x).Intsize;
			cloneObject.DataCollection.get(index).Sched_type = DataCollection.get(x).Sched_type;
			cloneObject.DataCollection.get(index).Lastapptint = DataCollection.get(x).Lastapptint;
			cloneObject.DataCollection.get(index).Cmd_ext_value = DataCollection.get(x).Cmd_ext_value;
			cloneObject.DataCollection.get(index).Spec_clinic = DataCollection.get(x).Spec_clinic;
			cloneObject.DataCollection.get(index).Tci_rnding_int = DataCollection.get(x).Tci_rnding_int;
			cloneObject.DataCollection.get(index).Last_gen_dt = DataCollection.get(x).Last_gen_dt;
			cloneObject.DataCollection.get(index).Sch_mon = DataCollection.get(x).Sch_mon;
			cloneObject.DataCollection.get(index).Sch_tue = DataCollection.get(x).Sch_tue;
			cloneObject.DataCollection.get(index).Sch_wed = DataCollection.get(x).Sch_wed;
			cloneObject.DataCollection.get(index).Sch_thu = DataCollection.get(x).Sch_thu;
			cloneObject.DataCollection.get(index).Sch_fri = DataCollection.get(x).Sch_fri;
			cloneObject.DataCollection.get(index).Sch_sat = DataCollection.get(x).Sch_sat;
			cloneObject.DataCollection.get(index).Sch_sun = DataCollection.get(x).Sch_sun;
			cloneObject.DataCollection.get(index).Sch_week1 = DataCollection.get(x).Sch_week1;
			cloneObject.DataCollection.get(index).Sch_week2 = DataCollection.get(x).Sch_week2;
			cloneObject.DataCollection.get(index).Sch_week3 = DataCollection.get(x).Sch_week3;
			cloneObject.DataCollection.get(index).Sch_week4 = DataCollection.get(x).Sch_week4;
			cloneObject.DataCollection.get(index).Sch_week5 = DataCollection.get(x).Sch_week5;
			cloneObject.DataCollection.get(index).Act_ind = DataCollection.get(x).Act_ind;
			cloneObject.DataCollection.get(index).Min_int = DataCollection.get(x).Min_int;
			cloneObject.DataCollection.get(index).Cont_arr = DataCollection.get(x).Cont_arr;
			cloneObject.DataCollection.get(index).Cont_loc = DataCollection.get(x).Cont_loc;
			cloneObject.DataCollection.get(index).Spec_code = DataCollection.get(x).Spec_code;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Gen_start_date = DataCollection.get(x).Gen_start_date;
			cloneObject.DataCollection.get(index).Gen_end_date = DataCollection.get(x).Gen_end_date;
							
			
			for(int iPrfiled_id1 = 0; iPrfiled_id1 < DataCollection.get(x).Prfiled_id1Collection.count(); iPrfiled_id1++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Prfiled_id1Collection.add();
					
				cloneObject.DataCollection.get(index).Prfiled_id1Collection.get(rIndex).Prfiled_id1 = DataCollection.get(x).Prfiled_id1Collection.get(iPrfiled_id1).Prfiled_id1;
				cloneObject.DataCollection.get(index).Prfiled_id1Collection.get(rIndex).Min_int1 = DataCollection.get(x).Prfiled_id1Collection.get(iPrfiled_id1).Min_int1;
				cloneObject.DataCollection.get(index).Prfiled_id1Collection.get(rIndex).Act_ind1 = DataCollection.get(x).Prfiled_id1Collection.get(iPrfiled_id1).Act_ind1;
				cloneObject.DataCollection.get(index).Prfiled_id1Collection.get(rIndex).Int_loc_id1 = DataCollection.get(x).Prfiled_id1Collection.get(iPrfiled_id1).Int_loc_id1;
				cloneObject.DataCollection.get(index).Prfiled_id1Collection.get(rIndex).Mc_id = DataCollection.get(x).Prfiled_id1Collection.get(iPrfiled_id1).Mc_id;
				cloneObject.DataCollection.get(index).Prfiled_id1Collection.get(rIndex).Prfiled_desc = DataCollection.get(x).Prfiled_id1Collection.get(iPrfiled_id1).Prfiled_desc;
				cloneObject.DataCollection.get(index).Prfiled_id1Collection.get(rIndex).Max_app1 = DataCollection.get(x).Prfiled_id1Collection.get(iPrfiled_id1).Max_app1;
										
			}
			
			for(int iSeqno2 = 0; iSeqno2 < DataCollection.get(x).Seqno2Collection.count(); iSeqno2++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno2Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Seqno2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Seqno2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Act_ind2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Act_ind2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Prfiled_id2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Prfiled_id2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Mos_id = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Mos_id;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Stm2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Stm2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Etm2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Etm2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Max_app2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Max_app2;
										
			}
			
			for(int iUsr_id = 0; iUsr_id < DataCollection.get(x).Usr_idCollection.count(); iUsr_id++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Usr_idCollection.add();
					
				cloneObject.DataCollection.get(index).Usr_idCollection.get(rIndex).Usr_id = DataCollection.get(x).Usr_idCollection.get(iUsr_id).Usr_id;
				cloneObject.DataCollection.get(index).Usr_idCollection.get(rIndex).User_name = DataCollection.get(x).Usr_idCollection.get(iUsr_id).User_name;
				cloneObject.DataCollection.get(index).Usr_idCollection.get(rIndex).Usr_act_ind = DataCollection.get(x).Usr_idCollection.get(iUsr_id).Usr_act_ind;
				cloneObject.DataCollection.get(index).Usr_idCollection.get(rIndex).Susr = DataCollection.get(x).Usr_idCollection.get(iUsr_id).Susr;
										
			}
			
			for(int iSeqno4 = 0; iSeqno4 < DataCollection.get(x).Seqno4Collection.count(); iSeqno4++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno4Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Seqno4 = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Seqno4;
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Prfiled_id4 = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Prfiled_id4;
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Startdatim = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Startdatim;
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Enddatim = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Enddatim;
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Act_ind4 = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Act_ind4;
										
			}
			
			for(int iSeqno5 = 0; iSeqno5 < DataCollection.get(x).Seqno5Collection.count(); iSeqno5++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno5Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno5Collection.get(rIndex).Seqno5 = DataCollection.get(x).Seqno5Collection.get(iSeqno5).Seqno5;
				cloneObject.DataCollection.get(index).Seqno5Collection.get(rIndex).Act_ind5 = DataCollection.get(x).Seqno5Collection.get(iSeqno5).Act_ind5;
				cloneObject.DataCollection.get(index).Seqno5Collection.get(rIndex).Prfiled_id5 = DataCollection.get(x).Seqno5Collection.get(iSeqno5).Prfiled_id5;
				cloneObject.DataCollection.get(index).Seqno5Collection.get(rIndex).Max_no = DataCollection.get(x).Seqno5Collection.get(iSeqno5).Max_no;
				cloneObject.DataCollection.get(index).Seqno5Collection.get(rIndex).Action_id = DataCollection.get(x).Seqno5Collection.get(iSeqno5).Action_id;
										
			}
			
			for(int iSeqno6 = 0; iSeqno6 < DataCollection.get(x).Seqno6Collection.count(); iSeqno6++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno6Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno6Collection.get(rIndex).Seqno6 = DataCollection.get(x).Seqno6Collection.get(iSeqno6).Seqno6;
				cloneObject.DataCollection.get(index).Seqno6Collection.get(rIndex).Act_ind_tm = DataCollection.get(x).Seqno6Collection.get(iSeqno6).Act_ind_tm;
				cloneObject.DataCollection.get(index).Seqno6Collection.get(rIndex).Etm6 = DataCollection.get(x).Seqno6Collection.get(iSeqno6).Etm6;
				cloneObject.DataCollection.get(index).Seqno6Collection.get(rIndex).Stm6 = DataCollection.get(x).Seqno6Collection.get(iSeqno6).Stm6;
				cloneObject.DataCollection.get(index).Seqno6Collection.get(rIndex).Prfiled_id = DataCollection.get(x).Seqno6Collection.get(iSeqno6).Prfiled_id;
										
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
		return "Sd_prfile.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_prfile.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_prfile.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_prfile.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_prfile.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_prfile.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_prfile.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_prfile.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_prfile.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_prfile.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_prfile.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_prfile.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_prfile.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_prfile.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_prfile.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_prfile.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_prfile.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_prfile.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_prfile.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_prfile.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_prfile.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_prfile.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_prfile.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_prfile.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_prfile.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_prfile.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_prfile.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_prfile nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_prfile After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_prfile After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_prfile.List");
							
		listInProgress = true;	
		logger.debug("Sd_prfile Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_prfile After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_prfile After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_prfileFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Prfile_id != null && filter.Prfile_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRFILE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prfile_id);
		}
		
		if(Filter.Activ_id != null && filter.Activ_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activ_id);
		}
		
		if(Filter.Grp_id != null && filter.Grp_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GRP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Grp_id);
		}
		
		if(Filter.Int_loc_id != null && filter.Int_loc_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INT_LOC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_loc_id);
		}
		
		if(Filter.Prfile_desc != null && filter.Prfile_desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRFILE_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prfile_desc);
		}
		
		if(Filter.Sched_cat != null && filter.Sched_cat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCHED_CAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sched_cat);
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
		
		if(Filter.Effr != null && filter.Effr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EFFR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Effr);
		}
		
		if(Filter.Efto != null && filter.Efto.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EFTO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Efto);
		}
		
		if(Filter.Max_app != null && filter.Max_app.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MAX_APP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Max_app);
		}
		
		if(Filter.Inttyp != null && filter.Inttyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INTTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Inttyp);
		}
		
		if(Filter.Intsize != null && filter.Intsize.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INTSIZE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Intsize);
		}
		
		if(Filter.Sched_type != null && filter.Sched_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCHED_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sched_type);
		}
		
		if(Filter.Lastapptint != null && filter.Lastapptint.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LASTAPPTINT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lastapptint);
		}
		
		if(Filter.Cmd_ext_value != null && filter.Cmd_ext_value.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CMD_EXT_VALUE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cmd_ext_value);
		}
		
		if(Filter.Spec_clinic != null && filter.Spec_clinic.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SPEC_CLINIC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spec_clinic);
		}
		
		if(Filter.Tci_rnding_int != null && filter.Tci_rnding_int.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TCI_RNDING_INT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tci_rnding_int);
		}
		
		if(Filter.Last_gen_dt != null && filter.Last_gen_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LAST_GEN_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Last_gen_dt);
		}
		
		if(Filter.Sch_mon != null && filter.Sch_mon.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCH_MON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sch_mon);
		}
		
		if(Filter.Sch_tue != null && filter.Sch_tue.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCH_TUE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sch_tue);
		}
		
		if(Filter.Sch_wed != null && filter.Sch_wed.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCH_WED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sch_wed);
		}
		
		if(Filter.Sch_thu != null && filter.Sch_thu.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCH_THU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sch_thu);
		}
		
		if(Filter.Sch_fri != null && filter.Sch_fri.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCH_FRI" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sch_fri);
		}
		
		if(Filter.Sch_sat != null && filter.Sch_sat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCH_SAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sch_sat);
		}
		
		if(Filter.Sch_sun != null && filter.Sch_sun.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCH_SUN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sch_sun);
		}
		
		if(Filter.Sch_week1 != null && filter.Sch_week1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCH_WEEK1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sch_week1);
		}
		
		if(Filter.Sch_week2 != null && filter.Sch_week2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCH_WEEK2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sch_week2);
		}
		
		if(Filter.Sch_week3 != null && filter.Sch_week3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCH_WEEK3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sch_week3);
		}
		
		if(Filter.Sch_week4 != null && filter.Sch_week4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCH_WEEK4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sch_week4);
		}
		
		if(Filter.Sch_week5 != null && filter.Sch_week5.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCH_WEEK5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sch_week5);
		}
		
		if(Filter.Act_ind != null && filter.Act_ind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_ind);
		}
		
		if(Filter.Min_int != null && filter.Min_int.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MIN_INT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Min_int);
		}
		
		if(Filter.Cont_arr != null && filter.Cont_arr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONT_ARR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cont_arr);
		}
		
		if(Filter.Cont_loc != null && filter.Cont_loc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONT_LOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cont_loc);
		}
		
		if(Filter.Spec_code != null && filter.Spec_code.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SPEC_CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spec_code);
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
		}
		
		if(Filter.Gen_start_date != null && filter.Gen_start_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GEN_START_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gen_start_date);
		}
		
		if(Filter.Gen_end_date != null && filter.Gen_end_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GEN_END_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gen_end_date);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_prfileRecord data = (Sd_prfileRecord)DataCollection.get(0);
		
		if(EditFilter.IncludePrfile_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prfile_id));
		}
		
		if(EditFilter.IncludeActiv_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activ_id));
		}
		
		if(EditFilter.IncludeGrp_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GRP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Grp_id));
		}
		
		if(EditFilter.IncludeInt_loc_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INT_LOC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_loc_id));
		}
		
		if(EditFilter.IncludePrfile_desc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILE_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prfile_desc));
		}
		
		if(EditFilter.IncludeSched_cat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCHED_CAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sched_cat));
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
		
		if(EditFilter.IncludeEffr)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EFFR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Effr));
		}
		
		if(EditFilter.IncludeEfto)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EFTO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Efto));
		}
		
		if(EditFilter.IncludeMax_app)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MAX_APP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Max_app));
		}
		
		if(EditFilter.IncludeInttyp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INTTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Inttyp));
		}
		
		if(EditFilter.IncludeIntsize)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INTSIZE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Intsize));
		}
		
		if(EditFilter.IncludeSched_type)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCHED_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sched_type));
		}
		
		if(EditFilter.IncludeLastapptint)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LASTAPPTINT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lastapptint));
		}
		
		if(EditFilter.IncludeCmd_ext_value)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CMD_EXT_VALUE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cmd_ext_value));
		}
		
		if(EditFilter.IncludeSpec_clinic)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SPEC_CLINIC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spec_clinic));
		}
		
		if(EditFilter.IncludeTci_rnding_int)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TCI_RNDING_INT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tci_rnding_int));
		}
		
		if(EditFilter.IncludeLast_gen_dt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LAST_GEN_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Last_gen_dt));
		}
		
		if(EditFilter.IncludeSch_mon)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCH_MON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sch_mon));
		}
		
		if(EditFilter.IncludeSch_tue)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCH_TUE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sch_tue));
		}
		
		if(EditFilter.IncludeSch_wed)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCH_WED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sch_wed));
		}
		
		if(EditFilter.IncludeSch_thu)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCH_THU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sch_thu));
		}
		
		if(EditFilter.IncludeSch_fri)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCH_FRI" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sch_fri));
		}
		
		if(EditFilter.IncludeSch_sat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCH_SAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sch_sat));
		}
		
		if(EditFilter.IncludeSch_sun)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCH_SUN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sch_sun));
		}
		
		if(EditFilter.IncludeSch_week1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCH_WEEK1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sch_week1));
		}
		
		if(EditFilter.IncludeSch_week2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCH_WEEK2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sch_week2));
		}
		
		if(EditFilter.IncludeSch_week3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCH_WEEK3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sch_week3));
		}
		
		if(EditFilter.IncludeSch_week4)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCH_WEEK4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sch_week4));
		}
		
		if(EditFilter.IncludeSch_week5)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCH_WEEK5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sch_week5));
		}
		
		if(EditFilter.IncludeAct_ind)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_ind));
		}
		
		if(EditFilter.IncludeMin_int)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MIN_INT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Min_int));
		}
		
		if(EditFilter.IncludeCont_arr)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONT_ARR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cont_arr));
		}
		
		if(EditFilter.IncludeCont_loc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONT_LOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cont_loc));
		}
		
		if(EditFilter.IncludeSpec_code)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SPEC_CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spec_code));
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
		}
		
		if(EditFilter.IncludeGen_start_date)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GEN_START_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gen_start_date));
		}
		
		if(EditFilter.IncludeGen_end_date)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GEN_END_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gen_end_date));
		}
		
		
		for(int x = 0; x < data.Prfiled_id1Collection.count(); x++)
		{
			Sd_prfilePrfiled_id1Record rgRecord = (Sd_prfilePrfiled_id1Record)data.Prfiled_id1Collection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILED_ID1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Prfiled_id1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MIN_INT1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Min_int1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INT_LOC_ID1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Int_loc_id1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mc_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILED_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Prfiled_desc));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MAX_APP1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Max_app1));
			
		}
		for(int x = 0; x < data.Seqno2Collection.count(); x++)
		{
			Sd_prfileSeqno2Record rgRecord = (Sd_prfileSeqno2Record)data.Seqno2Collection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILED_ID2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Prfiled_id2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MOS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mos_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Stm2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ETM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Etm2));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MAX_APP2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Max_app2));
			
		}
		for(int x = 0; x < data.Usr_idCollection.count(); x++)
		{
			Sd_prfileUsr_idRecord rgRecord = (Sd_prfileUsr_idRecord)data.Usr_idCollection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("USR_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Usr_id));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("USER_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.User_name));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("USR_ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Usr_act_ind));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Susr));
			
		}
		for(int x = 0; x < data.Seqno4Collection.count(); x++)
		{
			Sd_prfileSeqno4Record rgRecord = (Sd_prfileSeqno4Record)data.Seqno4Collection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno4));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILED_ID4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Prfiled_id4));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STARTDATIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Startdatim));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ENDDATIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Enddatim));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind4));
			
		}
		for(int x = 0; x < data.Seqno5Collection.count(); x++)
		{
			Sd_prfileSeqno5Record rgRecord = (Sd_prfileSeqno5Record)data.Seqno5Collection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno5));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind5));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILED_ID5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Prfiled_id5));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MAX_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Max_no));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Action_id));
			
		}
		for(int x = 0; x < data.Seqno6Collection.count(); x++)
		{
			Sd_prfileSeqno6Record rgRecord = (Sd_prfileSeqno6Record)data.Seqno6Collection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEQNO6" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno6));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_TM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Act_ind_tm));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ETM6" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Etm6));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STM6" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Stm6));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILED_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Prfiled_id));
			
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
			Sd_prfileRecord record = new Sd_prfileRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Prfile_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_ID"));
			record.Activ_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIV_ID"));
			record.Grp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GRP_ID"));
			record.Int_loc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_LOC_ID"));
			record.Prfile_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_DESC"));
			record.Sched_cat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCHED_CAT"));
			record.Stm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STM"));
			record.Etm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETM"));
			record.Effr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EFFR"));
			record.Efto = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EFTO"));
			record.Max_app = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAX_APP"));
			record.Inttyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INTTYP"));
			record.Intsize = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INTSIZE"));
			record.Sched_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCHED_TYPE"));
			record.Lastapptint = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LASTAPPTINT"));
			record.Cmd_ext_value = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CMD_EXT_VALUE"));
			record.Spec_clinic = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPEC_CLINIC"));
			record.Tci_rnding_int = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TCI_RNDING_INT"));
			record.Last_gen_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LAST_GEN_DT"));
			record.Sch_mon = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_MON"));
			record.Sch_tue = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_TUE"));
			record.Sch_wed = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_WED"));
			record.Sch_thu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_THU"));
			record.Sch_fri = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_FRI"));
			record.Sch_sat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_SAT"));
			record.Sch_sun = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_SUN"));
			record.Sch_week1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_WEEK1"));
			record.Sch_week2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_WEEK2"));
			record.Sch_week3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_WEEK3"));
			record.Sch_week4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_WEEK4"));
			record.Sch_week5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_WEEK5"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
			record.Min_int = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MIN_INT"));
			record.Cont_arr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONT_ARR"));
			record.Cont_loc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONT_LOC"));
			record.Spec_code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPEC_CODE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Gen_start_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GEN_START_DATE"));
			record.Gen_end_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GEN_END_DATE"));
									
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
			Sd_prfileRecord record = new Sd_prfileRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Prfile_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_ID"));
			record.Activ_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIV_ID"));
			record.Grp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GRP_ID"));
			record.Int_loc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_LOC_ID"));
			record.Prfile_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_DESC"));
			record.Sched_cat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCHED_CAT"));
			record.Stm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STM"));
			record.Etm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETM"));
			record.Effr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EFFR"));
			record.Efto = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EFTO"));
			record.Max_app = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAX_APP"));
			record.Inttyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INTTYP"));
			record.Intsize = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INTSIZE"));
			record.Sched_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCHED_TYPE"));
			record.Lastapptint = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LASTAPPTINT"));
			record.Cmd_ext_value = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CMD_EXT_VALUE"));
			record.Spec_clinic = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPEC_CLINIC"));
			record.Tci_rnding_int = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TCI_RNDING_INT"));
			record.Last_gen_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LAST_GEN_DT"));
			record.Sch_mon = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_MON"));
			record.Sch_tue = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_TUE"));
			record.Sch_wed = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_WED"));
			record.Sch_thu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_THU"));
			record.Sch_fri = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_FRI"));
			record.Sch_sat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_SAT"));
			record.Sch_sun = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_SUN"));
			record.Sch_week1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_WEEK1"));
			record.Sch_week2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_WEEK2"));
			record.Sch_week3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_WEEK3"));
			record.Sch_week4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_WEEK4"));
			record.Sch_week5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCH_WEEK5"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
			record.Min_int = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MIN_INT"));
			record.Cont_arr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONT_ARR"));
			record.Cont_loc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONT_LOC"));
			record.Spec_code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPEC_CODE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Gen_start_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GEN_START_DATE"));
			record.Gen_end_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GEN_END_DATE"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfiled_id1"))
					record.Prfiled_id1Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno2"))
					record.Seqno2Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("usr_id"))
					record.Usr_idCollection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno4"))
					record.Seqno4Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno5"))
					record.Seqno5Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno6"))
					record.Seqno6Collection.add();
			
									
			rgCount = record.Prfiled_id1Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfiled_id1"))
					{
						Sd_prfilePrfiled_id1Record rgRecord = record.Prfiled_id1Collection.get(recCount);
						rgRecord.Prfiled_id1 = Connection.getAttributeValue(valueItems[i]);
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
						Sd_prfilePrfiled_id1Record rgRecord = record.Prfiled_id1Collection.get(recCount);
						rgRecord.Min_int1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind1"))
					{
						Sd_prfilePrfiled_id1Record rgRecord = record.Prfiled_id1Collection.get(recCount);
						rgRecord.Act_ind1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("int_loc_id1"))
					{
						Sd_prfilePrfiled_id1Record rgRecord = record.Prfiled_id1Collection.get(recCount);
						rgRecord.Int_loc_id1 = Connection.getAttributeValue(valueItems[i]);
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
						Sd_prfilePrfiled_id1Record rgRecord = record.Prfiled_id1Collection.get(recCount);
						rgRecord.Mc_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfiled_desc"))
					{
						Sd_prfilePrfiled_id1Record rgRecord = record.Prfiled_id1Collection.get(recCount);
						rgRecord.Prfiled_desc = Connection.getAttributeValue(valueItems[i]);
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
						Sd_prfilePrfiled_id1Record rgRecord = record.Prfiled_id1Collection.get(recCount);
						rgRecord.Max_app1 = Connection.getAttributeValue(valueItems[i]);
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
						Sd_prfileSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Seqno2 = Connection.getAttributeValue(valueItems[i]);
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
						Sd_prfileSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Act_ind2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfiled_id2"))
					{
						Sd_prfileSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Prfiled_id2 = Connection.getAttributeValue(valueItems[i]);
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
						Sd_prfileSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Mos_id = Connection.getAttributeValue(valueItems[i]);
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
						Sd_prfileSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
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
						Sd_prfileSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Etm2 = Connection.getAttributeValue(valueItems[i]);
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
						Sd_prfileSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Max_app2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Usr_idCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("usr_id"))
					{
						Sd_prfileUsr_idRecord rgRecord = record.Usr_idCollection.get(recCount);
						rgRecord.Usr_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("user_name"))
					{
						Sd_prfileUsr_idRecord rgRecord = record.Usr_idCollection.get(recCount);
						rgRecord.User_name = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("usr_act_ind"))
					{
						Sd_prfileUsr_idRecord rgRecord = record.Usr_idCollection.get(recCount);
						rgRecord.Usr_act_ind = Connection.getAttributeValue(valueItems[i]);
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
						Sd_prfileUsr_idRecord rgRecord = record.Usr_idCollection.get(recCount);
						rgRecord.Susr = Connection.getAttributeValue(valueItems[i]);
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
						Sd_prfileSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Seqno4 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfiled_id4"))
					{
						Sd_prfileSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Prfiled_id4 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("startdatim"))
					{
						Sd_prfileSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Startdatim = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("enddatim"))
					{
						Sd_prfileSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Enddatim = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind4"))
					{
						Sd_prfileSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Act_ind4 = Connection.getAttributeValue(valueItems[i]);
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
						Sd_prfileSeqno5Record rgRecord = record.Seqno5Collection.get(recCount);
						rgRecord.Seqno5 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("act_ind5"))
					{
						Sd_prfileSeqno5Record rgRecord = record.Seqno5Collection.get(recCount);
						rgRecord.Act_ind5 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfiled_id5"))
					{
						Sd_prfileSeqno5Record rgRecord = record.Seqno5Collection.get(recCount);
						rgRecord.Prfiled_id5 = Connection.getAttributeValue(valueItems[i]);
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
						Sd_prfileSeqno5Record rgRecord = record.Seqno5Collection.get(recCount);
						rgRecord.Max_no = Connection.getAttributeValue(valueItems[i]);
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
						Sd_prfileSeqno5Record rgRecord = record.Seqno5Collection.get(recCount);
						rgRecord.Action_id = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Seqno6Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno6"))
					{
						Sd_prfileSeqno6Record rgRecord = record.Seqno6Collection.get(recCount);
						rgRecord.Seqno6 = Connection.getAttributeValue(valueItems[i]);
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
						Sd_prfileSeqno6Record rgRecord = record.Seqno6Collection.get(recCount);
						rgRecord.Act_ind_tm = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("etm6"))
					{
						Sd_prfileSeqno6Record rgRecord = record.Seqno6Collection.get(recCount);
						rgRecord.Etm6 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("stm6"))
					{
						Sd_prfileSeqno6Record rgRecord = record.Seqno6Collection.get(recCount);
						rgRecord.Stm6 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfiled_id"))
					{
						Sd_prfileSeqno6Record rgRecord = record.Seqno6Collection.get(recCount);
						rgRecord.Prfiled_id = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Sd_prfileCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_prfileRecord newRecord = new Sd_prfileRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_prfileRecord record)
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
		public Sd_prfileRecord get(int index)
		{
			return (Sd_prfileRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_prfileRecord
	{
		public String Prfile_id = "";
		public String Activ_id = "";
		public String Grp_id = "";
		public String Int_loc_id = "";
		public String Prfile_desc = "";
		public String Sched_cat = "";
		public String Stm = "";
		public String Etm = "";
		public String Effr = "";
		public String Efto = "";
		public String Max_app = "";
		public String Inttyp = "";
		public String Intsize = "";
		public String Sched_type = "";
		public String Lastapptint = "";
		public String Cmd_ext_value = "";
		public String Spec_clinic = "";
		public String Tci_rnding_int = "";
		public String Last_gen_dt = "";
		public String Sch_mon = "";
		public String Sch_tue = "";
		public String Sch_wed = "";
		public String Sch_thu = "";
		public String Sch_fri = "";
		public String Sch_sat = "";
		public String Sch_sun = "";
		public String Sch_week1 = "";
		public String Sch_week2 = "";
		public String Sch_week3 = "";
		public String Sch_week4 = "";
		public String Sch_week5 = "";
		public String Act_ind = "";
		public String Min_int = "";
		public String Cont_arr = "";
		public String Cont_loc = "";
		public String Spec_code = "";
		public String Tstp = "";
		public String Gen_start_date = "";
		public String Gen_end_date = "";
		
		public Sd_prfilePrfiled_id1Collection Prfiled_id1Collection = new Sd_prfilePrfiled_id1Collection();
		public Sd_prfileSeqno2Collection Seqno2Collection = new Sd_prfileSeqno2Collection();
		public Sd_prfileUsr_idCollection Usr_idCollection = new Sd_prfileUsr_idCollection();
		public Sd_prfileSeqno4Collection Seqno4Collection = new Sd_prfileSeqno4Collection();
		public Sd_prfileSeqno5Collection Seqno5Collection = new Sd_prfileSeqno5Collection();
		public Sd_prfileSeqno6Collection Seqno6Collection = new Sd_prfileSeqno6Collection();		
		
		public void clear()
		{
			Prfile_id = "";
			Activ_id = "";
			Grp_id = "";
			Int_loc_id = "";
			Prfile_desc = "";
			Sched_cat = "";
			Stm = "";
			Etm = "";
			Effr = "";
			Efto = "";
			Max_app = "";
			Inttyp = "";
			Intsize = "";
			Sched_type = "";
			Lastapptint = "";
			Cmd_ext_value = "";
			Spec_clinic = "";
			Tci_rnding_int = "";
			Last_gen_dt = "";
			Sch_mon = "";
			Sch_tue = "";
			Sch_wed = "";
			Sch_thu = "";
			Sch_fri = "";
			Sch_sat = "";
			Sch_sun = "";
			Sch_week1 = "";
			Sch_week2 = "";
			Sch_week3 = "";
			Sch_week4 = "";
			Sch_week5 = "";
			Act_ind = "";
			Min_int = "";
			Cont_arr = "";
			Cont_loc = "";
			Spec_code = "";
			Tstp = "";
			Gen_start_date = "";
			Gen_end_date = "";
			
			Prfiled_id1Collection.clear();
			Seqno2Collection.clear();
			Usr_idCollection.clear();
			Seqno4Collection.clear();
			Seqno5Collection.clear();
			Seqno6Collection.clear();
		}		
	}
	
	public final class Sd_prfilePrfiled_id1Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_prfilePrfiled_id1Record newRecord = new Sd_prfilePrfiled_id1Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_prfilePrfiled_id1Record record)
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
		public Sd_prfilePrfiled_id1Record get(int index)
		{
			return (Sd_prfilePrfiled_id1Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_prfileSeqno2Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_prfileSeqno2Record newRecord = new Sd_prfileSeqno2Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_prfileSeqno2Record record)
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
		public Sd_prfileSeqno2Record get(int index)
		{
			return (Sd_prfileSeqno2Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_prfileUsr_idCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_prfileUsr_idRecord newRecord = new Sd_prfileUsr_idRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_prfileUsr_idRecord record)
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
		public Sd_prfileUsr_idRecord get(int index)
		{
			return (Sd_prfileUsr_idRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_prfileSeqno4Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_prfileSeqno4Record newRecord = new Sd_prfileSeqno4Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_prfileSeqno4Record record)
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
		public Sd_prfileSeqno4Record get(int index)
		{
			return (Sd_prfileSeqno4Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_prfileSeqno5Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_prfileSeqno5Record newRecord = new Sd_prfileSeqno5Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_prfileSeqno5Record record)
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
		public Sd_prfileSeqno5Record get(int index)
		{
			return (Sd_prfileSeqno5Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Sd_prfileSeqno6Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_prfileSeqno6Record newRecord = new Sd_prfileSeqno6Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_prfileSeqno6Record record)
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
		public Sd_prfileSeqno6Record get(int index)
		{
			return (Sd_prfileSeqno6Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Sd_prfilePrfiled_id1Record
	{
		public String Prfiled_id1 = "";
		public String Min_int1 = "";
		public String Act_ind1 = "";
		public String Int_loc_id1 = "";
		public String Mc_id = "";
		public String Prfiled_desc = "";
		public String Max_app1 = "";
		
		public void clear()
		{
			Prfiled_id1 = "";
			Min_int1 = "";
			Act_ind1 = "";
			Int_loc_id1 = "";
			Mc_id = "";
			Prfiled_desc = "";
			Max_app1 = "";
			
		}
	}
	public final class Sd_prfileSeqno2Record
	{
		public String Seqno2 = "";
		public String Act_ind2 = "";
		public String Prfiled_id2 = "";
		public String Mos_id = "";
		public String Stm2 = "";
		public String Etm2 = "";
		public String Max_app2 = "";
		
		public void clear()
		{
			Seqno2 = "";
			Act_ind2 = "";
			Prfiled_id2 = "";
			Mos_id = "";
			Stm2 = "";
			Etm2 = "";
			Max_app2 = "";
			
		}
	}
	public final class Sd_prfileUsr_idRecord
	{
		public String Usr_id = "";
		public String User_name = "";
		public String Usr_act_ind = "";
		public String Susr = "";
		
		public void clear()
		{
			Usr_id = "";
			User_name = "";
			Usr_act_ind = "";
			Susr = "";
			
		}
	}
	public final class Sd_prfileSeqno4Record
	{
		public String Seqno4 = "";
		public String Prfiled_id4 = "";
		public String Startdatim = "";
		public String Enddatim = "";
		public String Act_ind4 = "";
		
		public void clear()
		{
			Seqno4 = "";
			Prfiled_id4 = "";
			Startdatim = "";
			Enddatim = "";
			Act_ind4 = "";
			
		}
	}
	public final class Sd_prfileSeqno5Record
	{
		public String Seqno5 = "";
		public String Act_ind5 = "";
		public String Prfiled_id5 = "";
		public String Max_no = "";
		public String Action_id = "";
		
		public void clear()
		{
			Seqno5 = "";
			Act_ind5 = "";
			Prfiled_id5 = "";
			Max_no = "";
			Action_id = "";
			
		}
	}
	public final class Sd_prfileSeqno6Record
	{
		public String Seqno6 = "";
		public String Act_ind_tm = "";
		public String Etm6 = "";
		public String Stm6 = "";
		public String Prfiled_id = "";
		
		public void clear()
		{
			Seqno6 = "";
			Act_ind_tm = "";
			Etm6 = "";
			Stm6 = "";
			Prfiled_id = "";
			
		}
	}	
	public final class Sd_prfileFilter
	{			
		public String Prfile_id = "";
		public String Activ_id = "";
		public String Grp_id = "";
		public String Int_loc_id = "";
		public String Prfile_desc = "";
		public String Sched_cat = "";
		public String Stm = "";
		public String Etm = "";
		public String Effr = "";
		public String Efto = "";
		public String Max_app = "";
		public String Inttyp = "";
		public String Intsize = "";
		public String Sched_type = "";
		public String Lastapptint = "";
		public String Cmd_ext_value = "";
		public String Spec_clinic = "";
		public String Tci_rnding_int = "";
		public String Last_gen_dt = "";
		public String Sch_mon = "";
		public String Sch_tue = "";
		public String Sch_wed = "";
		public String Sch_thu = "";
		public String Sch_fri = "";
		public String Sch_sat = "";
		public String Sch_sun = "";
		public String Sch_week1 = "";
		public String Sch_week2 = "";
		public String Sch_week3 = "";
		public String Sch_week4 = "";
		public String Sch_week5 = "";
		public String Act_ind = "";
		public String Min_int = "";
		public String Cont_arr = "";
		public String Cont_loc = "";
		public String Spec_code = "";
		public String Tstp = "";
		public String Gen_start_date = "";
		public String Gen_end_date = "";
		
		public void clear()
		{				
			Prfile_id = "";
			Activ_id = "";
			Grp_id = "";
			Int_loc_id = "";
			Prfile_desc = "";
			Sched_cat = "";
			Stm = "";
			Etm = "";
			Effr = "";
			Efto = "";
			Max_app = "";
			Inttyp = "";
			Intsize = "";
			Sched_type = "";
			Lastapptint = "";
			Cmd_ext_value = "";
			Spec_clinic = "";
			Tci_rnding_int = "";
			Last_gen_dt = "";
			Sch_mon = "";
			Sch_tue = "";
			Sch_wed = "";
			Sch_thu = "";
			Sch_fri = "";
			Sch_sat = "";
			Sch_sun = "";
			Sch_week1 = "";
			Sch_week2 = "";
			Sch_week3 = "";
			Sch_week4 = "";
			Sch_week5 = "";
			Act_ind = "";
			Min_int = "";
			Cont_arr = "";
			Cont_loc = "";
			Spec_code = "";
			Tstp = "";
			Gen_start_date = "";
			Gen_end_date = "";
		}	
		public Sd_prfileFilter cloneObject()
		{
			Sd_prfileFilter newFilter = new Sd_prfileFilter();
			
			newFilter.Prfile_id = this.Prfile_id;
			newFilter.Activ_id = this.Activ_id;
			newFilter.Grp_id = this.Grp_id;
			newFilter.Int_loc_id = this.Int_loc_id;
			newFilter.Prfile_desc = this.Prfile_desc;
			newFilter.Sched_cat = this.Sched_cat;
			newFilter.Stm = this.Stm;
			newFilter.Etm = this.Etm;
			newFilter.Effr = this.Effr;
			newFilter.Efto = this.Efto;
			newFilter.Max_app = this.Max_app;
			newFilter.Inttyp = this.Inttyp;
			newFilter.Intsize = this.Intsize;
			newFilter.Sched_type = this.Sched_type;
			newFilter.Lastapptint = this.Lastapptint;
			newFilter.Cmd_ext_value = this.Cmd_ext_value;
			newFilter.Spec_clinic = this.Spec_clinic;
			newFilter.Tci_rnding_int = this.Tci_rnding_int;
			newFilter.Last_gen_dt = this.Last_gen_dt;
			newFilter.Sch_mon = this.Sch_mon;
			newFilter.Sch_tue = this.Sch_tue;
			newFilter.Sch_wed = this.Sch_wed;
			newFilter.Sch_thu = this.Sch_thu;
			newFilter.Sch_fri = this.Sch_fri;
			newFilter.Sch_sat = this.Sch_sat;
			newFilter.Sch_sun = this.Sch_sun;
			newFilter.Sch_week1 = this.Sch_week1;
			newFilter.Sch_week2 = this.Sch_week2;
			newFilter.Sch_week3 = this.Sch_week3;
			newFilter.Sch_week4 = this.Sch_week4;
			newFilter.Sch_week5 = this.Sch_week5;
			newFilter.Act_ind = this.Act_ind;
			newFilter.Min_int = this.Min_int;
			newFilter.Cont_arr = this.Cont_arr;
			newFilter.Cont_loc = this.Cont_loc;
			newFilter.Spec_code = this.Spec_code;
			newFilter.Tstp = this.Tstp;
			newFilter.Gen_start_date = this.Gen_start_date;
			newFilter.Gen_end_date = this.Gen_end_date;
			
			return newFilter;
		}
	}
	public final class Sd_prfileEditFilter
	{			
		public boolean IncludePrfile_id = true;
		public boolean IncludeActiv_id = true;
		public boolean IncludeGrp_id = true;
		public boolean IncludeInt_loc_id = true;
		public boolean IncludePrfile_desc = true;
		public boolean IncludeSched_cat = true;
		public boolean IncludeStm = true;
		public boolean IncludeEtm = true;
		public boolean IncludeEffr = true;
		public boolean IncludeEfto = true;
		public boolean IncludeMax_app = true;
		public boolean IncludeInttyp = true;
		public boolean IncludeIntsize = true;
		public boolean IncludeSched_type = true;
		public boolean IncludeLastapptint = true;
		public boolean IncludeCmd_ext_value = true;
		public boolean IncludeSpec_clinic = true;
		public boolean IncludeTci_rnding_int = true;
		public boolean IncludeLast_gen_dt = true;
		public boolean IncludeSch_mon = true;
		public boolean IncludeSch_tue = true;
		public boolean IncludeSch_wed = true;
		public boolean IncludeSch_thu = true;
		public boolean IncludeSch_fri = true;
		public boolean IncludeSch_sat = true;
		public boolean IncludeSch_sun = true;
		public boolean IncludeSch_week1 = true;
		public boolean IncludeSch_week2 = true;
		public boolean IncludeSch_week3 = true;
		public boolean IncludeSch_week4 = true;
		public boolean IncludeSch_week5 = true;
		public boolean IncludeAct_ind = true;
		public boolean IncludeMin_int = true;
		public boolean IncludeCont_arr = true;
		public boolean IncludeCont_loc = true;
		public boolean IncludeSpec_code = true;
		public boolean IncludeTstp = true;
		public boolean IncludeGen_start_date = true;
		public boolean IncludeGen_end_date = true;
		
		public void includeAll()
		{				
			IncludePrfile_id = true;
			IncludeActiv_id = true;
			IncludeGrp_id = true;
			IncludeInt_loc_id = true;
			IncludePrfile_desc = true;
			IncludeSched_cat = true;
			IncludeStm = true;
			IncludeEtm = true;
			IncludeEffr = true;
			IncludeEfto = true;
			IncludeMax_app = true;
			IncludeInttyp = true;
			IncludeIntsize = true;
			IncludeSched_type = true;
			IncludeLastapptint = true;
			IncludeCmd_ext_value = true;
			IncludeSpec_clinic = true;
			IncludeTci_rnding_int = true;
			IncludeLast_gen_dt = true;
			IncludeSch_mon = true;
			IncludeSch_tue = true;
			IncludeSch_wed = true;
			IncludeSch_thu = true;
			IncludeSch_fri = true;
			IncludeSch_sat = true;
			IncludeSch_sun = true;
			IncludeSch_week1 = true;
			IncludeSch_week2 = true;
			IncludeSch_week3 = true;
			IncludeSch_week4 = true;
			IncludeSch_week5 = true;
			IncludeAct_ind = true;
			IncludeMin_int = true;
			IncludeCont_arr = true;
			IncludeCont_loc = true;
			IncludeSpec_code = true;
			IncludeTstp = true;
			IncludeGen_start_date = true;
			IncludeGen_end_date = true;
		}	
		public void excludeAll()
		{				
			IncludePrfile_id = false;
			IncludeActiv_id = false;
			IncludeGrp_id = false;
			IncludeInt_loc_id = false;
			IncludePrfile_desc = false;
			IncludeSched_cat = false;
			IncludeStm = false;
			IncludeEtm = false;
			IncludeEffr = false;
			IncludeEfto = false;
			IncludeMax_app = false;
			IncludeInttyp = false;
			IncludeIntsize = false;
			IncludeSched_type = false;
			IncludeLastapptint = false;
			IncludeCmd_ext_value = false;
			IncludeSpec_clinic = false;
			IncludeTci_rnding_int = false;
			IncludeLast_gen_dt = false;
			IncludeSch_mon = false;
			IncludeSch_tue = false;
			IncludeSch_wed = false;
			IncludeSch_thu = false;
			IncludeSch_fri = false;
			IncludeSch_sat = false;
			IncludeSch_sun = false;
			IncludeSch_week1 = false;
			IncludeSch_week2 = false;
			IncludeSch_week3 = false;
			IncludeSch_week4 = false;
			IncludeSch_week5 = false;
			IncludeAct_ind = false;
			IncludeMin_int = false;
			IncludeCont_arr = false;
			IncludeCont_loc = false;
			IncludeSpec_code = false;
			IncludeTstp = false;
			IncludeGen_start_date = false;
			IncludeGen_end_date = false;
		}
		public Sd_prfileEditFilter cloneObject()
		{
			Sd_prfileEditFilter newEditFilter = new Sd_prfileEditFilter();
			
			newEditFilter.IncludePrfile_id = this.IncludePrfile_id;
			newEditFilter.IncludeActiv_id = this.IncludeActiv_id;
			newEditFilter.IncludeGrp_id = this.IncludeGrp_id;
			newEditFilter.IncludeInt_loc_id = this.IncludeInt_loc_id;
			newEditFilter.IncludePrfile_desc = this.IncludePrfile_desc;
			newEditFilter.IncludeSched_cat = this.IncludeSched_cat;
			newEditFilter.IncludeStm = this.IncludeStm;
			newEditFilter.IncludeEtm = this.IncludeEtm;
			newEditFilter.IncludeEffr = this.IncludeEffr;
			newEditFilter.IncludeEfto = this.IncludeEfto;
			newEditFilter.IncludeMax_app = this.IncludeMax_app;
			newEditFilter.IncludeInttyp = this.IncludeInttyp;
			newEditFilter.IncludeIntsize = this.IncludeIntsize;
			newEditFilter.IncludeSched_type = this.IncludeSched_type;
			newEditFilter.IncludeLastapptint = this.IncludeLastapptint;
			newEditFilter.IncludeCmd_ext_value = this.IncludeCmd_ext_value;
			newEditFilter.IncludeSpec_clinic = this.IncludeSpec_clinic;
			newEditFilter.IncludeTci_rnding_int = this.IncludeTci_rnding_int;
			newEditFilter.IncludeLast_gen_dt = this.IncludeLast_gen_dt;
			newEditFilter.IncludeSch_mon = this.IncludeSch_mon;
			newEditFilter.IncludeSch_tue = this.IncludeSch_tue;
			newEditFilter.IncludeSch_wed = this.IncludeSch_wed;
			newEditFilter.IncludeSch_thu = this.IncludeSch_thu;
			newEditFilter.IncludeSch_fri = this.IncludeSch_fri;
			newEditFilter.IncludeSch_sat = this.IncludeSch_sat;
			newEditFilter.IncludeSch_sun = this.IncludeSch_sun;
			newEditFilter.IncludeSch_week1 = this.IncludeSch_week1;
			newEditFilter.IncludeSch_week2 = this.IncludeSch_week2;
			newEditFilter.IncludeSch_week3 = this.IncludeSch_week3;
			newEditFilter.IncludeSch_week4 = this.IncludeSch_week4;
			newEditFilter.IncludeSch_week5 = this.IncludeSch_week5;
			newEditFilter.IncludeAct_ind = this.IncludeAct_ind;
			newEditFilter.IncludeMin_int = this.IncludeMin_int;
			newEditFilter.IncludeCont_arr = this.IncludeCont_arr;
			newEditFilter.IncludeCont_loc = this.IncludeCont_loc;
			newEditFilter.IncludeSpec_code = this.IncludeSpec_code;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeGen_start_date = this.IncludeGen_start_date;
			newEditFilter.IncludeGen_end_date = this.IncludeGen_end_date;
			
			return newEditFilter;
		}
	}
}
