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

public final class Sd_clinicview implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_clinicview.class);
	
	private Sd_clinicviewFilter lastGetFilter = null;
	private final String serviceName = "SD_CLINICVIEW";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_clinicviewFilter Filter = new Sd_clinicviewFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_clinicviewEditFilter EditFilter = new Sd_clinicviewEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_clinicviewCollection DataCollection = new Sd_clinicviewCollection();

	/**
	 * Creates a new Sd_clinicview Data Transfer Object.
	 */ 
	public Sd_clinicview(ims.dto.Connection connection)
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
	public Sd_clinicview cloneObject()
	{
		Sd_clinicview cloneObject = new Sd_clinicview(Connection);
			
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
			cloneObject.DataCollection.get(index).Sess_desc = DataCollection.get(x).Sess_desc;
			cloneObject.DataCollection.get(index).Int_loc_id = DataCollection.get(x).Int_loc_id;
			cloneObject.DataCollection.get(index).Prfile_sess_stat = DataCollection.get(x).Prfile_sess_stat;
			cloneObject.DataCollection.get(index).Act_ind = DataCollection.get(x).Act_ind;
			cloneObject.DataCollection.get(index).Act_stm = DataCollection.get(x).Act_stm;
			cloneObject.DataCollection.get(index).Act_etm = DataCollection.get(x).Act_etm;
			cloneObject.DataCollection.get(index).Stat_reas = DataCollection.get(x).Stat_reas;
							
			
			for(int iPrfiled_sess_id1 = 0; iPrfiled_sess_id1 < DataCollection.get(x).Prfiled_sess_id1Collection.count(); iPrfiled_sess_id1++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.add();
					
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Prfiled_sess_id1 = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Prfiled_sess_id1;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Sess_stat = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Sess_stat;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Sess_int_loc = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Sess_int_loc;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Prfiled_id1 = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Prfiled_id1;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Mc_id = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Mc_id;
				cloneObject.DataCollection.get(index).Prfiled_sess_id1Collection.get(rIndex).Sessd_desc = DataCollection.get(x).Prfiled_sess_id1Collection.get(iPrfiled_sess_id1).Sessd_desc;
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
		return "Sd_clinicview.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_clinicview.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_clinicview.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_clinicview.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_clinicview.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_clinicview.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_clinicview.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_clinicview.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_clinicview.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_clinicview.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_clinicview.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_clinicview.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_clinicview.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_clinicview.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_clinicview.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_clinicview.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_clinicview.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_clinicview.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_clinicview.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_clinicview.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_clinicview.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_clinicview.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_clinicview.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_clinicview.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_clinicview.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_clinicview.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_clinicview.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_clinicview nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_clinicview After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_clinicview After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_clinicview.List");
							
		listInProgress = true;	
		logger.debug("Sd_clinicview Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_clinicview After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_clinicview After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_clinicviewFilter filter)
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
		
		if(Filter.Sess_desc != null && filter.Sess_desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SESS_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sess_desc);
		}
		
		if(Filter.Int_loc_id != null && filter.Int_loc_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INT_LOC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Int_loc_id);
		}
		
		if(Filter.Prfile_sess_stat != null && filter.Prfile_sess_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRFILE_SESS_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prfile_sess_stat);
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
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_clinicviewRecord data = (Sd_clinicviewRecord)DataCollection.get(0);
		
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
		
		if(EditFilter.IncludeSess_desc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESS_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sess_desc));
		}
		
		if(EditFilter.IncludeInt_loc_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INT_LOC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Int_loc_id));
		}
		
		if(EditFilter.IncludePrfile_sess_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILE_SESS_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prfile_sess_stat));
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
		
		
		for(int x = 0; x < data.Prfiled_sess_id1Collection.count(); x++)
		{
			Sd_clinicviewPrfiled_sess_id1Record rgRecord = (Sd_clinicviewPrfiled_sess_id1Record)data.Prfiled_sess_id1Collection.get(x);
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRFILED_SESS_ID1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Prfiled_sess_id1));
			
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SESS_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Sess_stat));
			
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
			Sd_clinicviewRecord record = new Sd_clinicviewRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Prfile_sess_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_ID"));
			record.Prfile_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_ID"));
			record.Grp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GRP_ID"));
			record.Activ_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIV_ID"));
			record.Sess_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_DT"));
			record.Sess_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_DESC"));
			record.Int_loc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_LOC_ID"));
			record.Prfile_sess_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_STAT"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
			record.Act_stm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STM"));
			record.Act_etm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_ETM"));
			record.Stat_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT_REAS"));
									
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
			Sd_clinicviewRecord record = new Sd_clinicviewRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Prfile_sess_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_ID"));
			record.Prfile_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_ID"));
			record.Grp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GRP_ID"));
			record.Activ_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIV_ID"));
			record.Sess_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_DT"));
			record.Sess_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SESS_DESC"));
			record.Int_loc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INT_LOC_ID"));
			record.Prfile_sess_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRFILE_SESS_STAT"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
			record.Act_stm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_STM"));
			record.Act_etm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_ETM"));
			record.Stat_reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT_REAS"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfiled_sess_id1"))
					record.Prfiled_sess_id1Collection.add();
			
									
			rgCount = record.Prfiled_sess_id1Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("prfiled_sess_id1"))
					{
						Sd_clinicviewPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Prfiled_sess_id1 = Connection.getAttributeValue(valueItems[i]);
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
						Sd_clinicviewPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Sess_stat = Connection.getAttributeValue(valueItems[i]);
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
						Sd_clinicviewPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
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
						Sd_clinicviewPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
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
						Sd_clinicviewPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
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
						Sd_clinicviewPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
						rgRecord.Sessd_desc = Connection.getAttributeValue(valueItems[i]);
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
						Sd_clinicviewPrfiled_sess_id1Record rgRecord = record.Prfiled_sess_id1Collection.get(recCount);
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
	
	public final class Sd_clinicviewCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_clinicviewRecord newRecord = new Sd_clinicviewRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_clinicviewRecord record)
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
		public Sd_clinicviewRecord get(int index)
		{
			return (Sd_clinicviewRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_clinicviewRecord
	{
		public String Prfile_sess_id = "";
		public String Prfile_id = "";
		public String Grp_id = "";
		public String Activ_id = "";
		public String Sess_dt = "";
		public String Sess_desc = "";
		public String Int_loc_id = "";
		public String Prfile_sess_stat = "";
		public String Act_ind = "";
		public String Act_stm = "";
		public String Act_etm = "";
		public String Stat_reas = "";
		
		public Sd_clinicviewPrfiled_sess_id1Collection Prfiled_sess_id1Collection = new Sd_clinicviewPrfiled_sess_id1Collection();		
		
		public void clear()
		{
			Prfile_sess_id = "";
			Prfile_id = "";
			Grp_id = "";
			Activ_id = "";
			Sess_dt = "";
			Sess_desc = "";
			Int_loc_id = "";
			Prfile_sess_stat = "";
			Act_ind = "";
			Act_stm = "";
			Act_etm = "";
			Stat_reas = "";
			
			Prfiled_sess_id1Collection.clear();
		}		
	}
	
	public final class Sd_clinicviewPrfiled_sess_id1Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_clinicviewPrfiled_sess_id1Record newRecord = new Sd_clinicviewPrfiled_sess_id1Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_clinicviewPrfiled_sess_id1Record record)
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
		public Sd_clinicviewPrfiled_sess_id1Record get(int index)
		{
			return (Sd_clinicviewPrfiled_sess_id1Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Sd_clinicviewPrfiled_sess_id1Record
	{
		public String Prfiled_sess_id1 = "";
		public String Sess_stat = "";
		public String Sess_int_loc = "";
		public String Prfiled_id1 = "";
		public String Mc_id = "";
		public String Sessd_desc = "";
		public String Act_ind2 = "";
		
		public void clear()
		{
			Prfiled_sess_id1 = "";
			Sess_stat = "";
			Sess_int_loc = "";
			Prfiled_id1 = "";
			Mc_id = "";
			Sessd_desc = "";
			Act_ind2 = "";
			
		}
	}	
	public final class Sd_clinicviewFilter
	{			
		public String Prfile_sess_id = "";
		public String Prfile_id = "";
		public String Grp_id = "";
		public String Activ_id = "";
		public String Sess_dt = "";
		public String Sess_desc = "";
		public String Int_loc_id = "";
		public String Prfile_sess_stat = "";
		public String Act_ind = "";
		public String Act_stm = "";
		public String Act_etm = "";
		public String Stat_reas = "";
		
		public void clear()
		{				
			Prfile_sess_id = "";
			Prfile_id = "";
			Grp_id = "";
			Activ_id = "";
			Sess_dt = "";
			Sess_desc = "";
			Int_loc_id = "";
			Prfile_sess_stat = "";
			Act_ind = "";
			Act_stm = "";
			Act_etm = "";
			Stat_reas = "";
		}	
		public Sd_clinicviewFilter cloneObject()
		{
			Sd_clinicviewFilter newFilter = new Sd_clinicviewFilter();
			
			newFilter.Prfile_sess_id = this.Prfile_sess_id;
			newFilter.Prfile_id = this.Prfile_id;
			newFilter.Grp_id = this.Grp_id;
			newFilter.Activ_id = this.Activ_id;
			newFilter.Sess_dt = this.Sess_dt;
			newFilter.Sess_desc = this.Sess_desc;
			newFilter.Int_loc_id = this.Int_loc_id;
			newFilter.Prfile_sess_stat = this.Prfile_sess_stat;
			newFilter.Act_ind = this.Act_ind;
			newFilter.Act_stm = this.Act_stm;
			newFilter.Act_etm = this.Act_etm;
			newFilter.Stat_reas = this.Stat_reas;
			
			return newFilter;
		}
	}
	public final class Sd_clinicviewEditFilter
	{			
		public boolean IncludePrfile_sess_id = true;
		public boolean IncludePrfile_id = true;
		public boolean IncludeGrp_id = true;
		public boolean IncludeActiv_id = true;
		public boolean IncludeSess_dt = true;
		public boolean IncludeSess_desc = true;
		public boolean IncludeInt_loc_id = true;
		public boolean IncludePrfile_sess_stat = true;
		public boolean IncludeAct_ind = true;
		public boolean IncludeAct_stm = true;
		public boolean IncludeAct_etm = true;
		public boolean IncludeStat_reas = true;
		
		public void includeAll()
		{				
			IncludePrfile_sess_id = true;
			IncludePrfile_id = true;
			IncludeGrp_id = true;
			IncludeActiv_id = true;
			IncludeSess_dt = true;
			IncludeSess_desc = true;
			IncludeInt_loc_id = true;
			IncludePrfile_sess_stat = true;
			IncludeAct_ind = true;
			IncludeAct_stm = true;
			IncludeAct_etm = true;
			IncludeStat_reas = true;
		}	
		public void excludeAll()
		{				
			IncludePrfile_sess_id = false;
			IncludePrfile_id = false;
			IncludeGrp_id = false;
			IncludeActiv_id = false;
			IncludeSess_dt = false;
			IncludeSess_desc = false;
			IncludeInt_loc_id = false;
			IncludePrfile_sess_stat = false;
			IncludeAct_ind = false;
			IncludeAct_stm = false;
			IncludeAct_etm = false;
			IncludeStat_reas = false;
		}
		public Sd_clinicviewEditFilter cloneObject()
		{
			Sd_clinicviewEditFilter newEditFilter = new Sd_clinicviewEditFilter();
			
			newEditFilter.IncludePrfile_sess_id = this.IncludePrfile_sess_id;
			newEditFilter.IncludePrfile_id = this.IncludePrfile_id;
			newEditFilter.IncludeGrp_id = this.IncludeGrp_id;
			newEditFilter.IncludeActiv_id = this.IncludeActiv_id;
			newEditFilter.IncludeSess_dt = this.IncludeSess_dt;
			newEditFilter.IncludeSess_desc = this.IncludeSess_desc;
			newEditFilter.IncludeInt_loc_id = this.IncludeInt_loc_id;
			newEditFilter.IncludePrfile_sess_stat = this.IncludePrfile_sess_stat;
			newEditFilter.IncludeAct_ind = this.IncludeAct_ind;
			newEditFilter.IncludeAct_stm = this.IncludeAct_stm;
			newEditFilter.IncludeAct_etm = this.IncludeAct_etm;
			newEditFilter.IncludeStat_reas = this.IncludeStat_reas;
			
			return newEditFilter;
		}
	}
}
