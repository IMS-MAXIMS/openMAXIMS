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

public final class Sd_modactmc implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_modactmc.class);
	
	private Sd_modactmcFilter lastGetFilter = null;
	private final String serviceName = "SD_MODACTMC";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_modactmcFilter Filter = new Sd_modactmcFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_modactmcEditFilter EditFilter = new Sd_modactmcEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_modactmcCollection DataCollection = new Sd_modactmcCollection();

	/**
	 * Creates a new Sd_modactmc Data Transfer Object.
	 */ 
	public Sd_modactmc(ims.dto.Connection connection)
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
	public Sd_modactmc cloneObject()
	{
		Sd_modactmc cloneObject = new Sd_modactmc(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Mc_id = DataCollection.get(x).Mc_id;
			cloneObject.DataCollection.get(index).Mc_nm = DataCollection.get(x).Mc_nm;
			cloneObject.DataCollection.get(index).Mc_typ = DataCollection.get(x).Mc_typ;
			cloneObject.DataCollection.get(index).Dt_comm = DataCollection.get(x).Dt_comm;
			cloneObject.DataCollection.get(index).Dt_decomm = DataCollection.get(x).Dt_decomm;
			cloneObject.DataCollection.get(index).Act_ind = DataCollection.get(x).Act_ind;
			cloneObject.DataCollection.get(index).Modal_id = DataCollection.get(x).Modal_id;
			cloneObject.DataCollection.get(index).Modal_type_id = DataCollection.get(x).Modal_type_id;
			cloneObject.DataCollection.get(index).Energy = DataCollection.get(x).Energy;
			cloneObject.DataCollection.get(index).Energy_unit = DataCollection.get(x).Energy_unit;
			cloneObject.DataCollection.get(index).End_date = DataCollection.get(x).End_date;
			cloneObject.DataCollection.get(index).Act_ind_mod = DataCollection.get(x).Act_ind_mod;
			cloneObject.DataCollection.get(index).Action_id = DataCollection.get(x).Action_id;
			cloneObject.DataCollection.get(index).Act_ind_action = DataCollection.get(x).Act_ind_action;
							
			
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
		return "Sd_modactmc.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_modactmc.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_modactmc.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_modactmc.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_modactmc.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_modactmc.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_modactmc.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_modactmc.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_modactmc.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_modactmc.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_modactmc.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_modactmc.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_modactmc.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_modactmc.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_modactmc.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_modactmc.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_modactmc.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_modactmc.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_modactmc.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_modactmc.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_modactmc.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_modactmc.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_modactmc.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_modactmc.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_modactmc.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_modactmc.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_modactmc.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_modactmc nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_modactmc After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_modactmc After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_modactmc.List");
							
		listInProgress = true;	
		logger.debug("Sd_modactmc Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_modactmc After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_modactmc After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_modactmcFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Mc_id != null && filter.Mc_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_id);
		}
		
		if(Filter.Mc_nm != null && filter.Mc_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_nm);
		}
		
		if(Filter.Mc_typ != null && filter.Mc_typ.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MC_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc_typ);
		}
		
		if(Filter.Dt_comm != null && filter.Dt_comm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DT_COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dt_comm);
		}
		
		if(Filter.Dt_decomm != null && filter.Dt_decomm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DT_DECOMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dt_decomm);
		}
		
		if(Filter.Act_ind != null && filter.Act_ind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_ind);
		}
		
		if(Filter.Modal_id != null && filter.Modal_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MODAL_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modal_id);
		}
		
		if(Filter.Modal_type_id != null && filter.Modal_type_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MODAL_TYPE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modal_type_id);
		}
		
		if(Filter.Energy != null && filter.Energy.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ENERGY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Energy);
		}
		
		if(Filter.Energy_unit != null && filter.Energy_unit.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ENERGY_UNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Energy_unit);
		}
		
		if(Filter.End_date != null && filter.End_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("END_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.End_date);
		}
		
		if(Filter.Act_ind_mod != null && filter.Act_ind_mod.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_IND_MOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_ind_mod);
		}
		
		if(Filter.Action_id != null && filter.Action_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Action_id);
		}
		
		if(Filter.Act_ind_action != null && filter.Act_ind_action.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_IND_ACTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_ind_action);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_modactmcRecord data = (Sd_modactmcRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeMc_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_id));
		}
		
		if(EditFilter.IncludeMc_nm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_nm));
		}
		
		if(EditFilter.IncludeMc_typ)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MC_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc_typ));
		}
		
		if(EditFilter.IncludeDt_comm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DT_COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dt_comm));
		}
		
		if(EditFilter.IncludeDt_decomm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DT_DECOMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dt_decomm));
		}
		
		if(EditFilter.IncludeAct_ind)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_ind));
		}
		
		if(EditFilter.IncludeModal_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODAL_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modal_id));
		}
		
		if(EditFilter.IncludeModal_type_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MODAL_TYPE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modal_type_id));
		}
		
		if(EditFilter.IncludeEnergy)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ENERGY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Energy));
		}
		
		if(EditFilter.IncludeEnergy_unit)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ENERGY_UNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Energy_unit));
		}
		
		if(EditFilter.IncludeEnd_date)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("END_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.End_date));
		}
		
		if(EditFilter.IncludeAct_ind_mod)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_MOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_ind_mod));
		}
		
		if(EditFilter.IncludeAction_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Action_id));
		}
		
		if(EditFilter.IncludeAct_ind_action)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND_ACTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_ind_action));
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
			Sd_modactmcRecord record = new Sd_modactmcRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Mc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID"));
			record.Mc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_NM"));
			record.Mc_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_TYP"));
			record.Dt_comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DT_COMM"));
			record.Dt_decomm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DT_DECOMM"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
			record.Modal_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODAL_ID"));
			record.Modal_type_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODAL_TYPE_ID"));
			record.Energy = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENERGY"));
			record.Energy_unit = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENERGY_UNIT"));
			record.End_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "END_DATE"));
			record.Act_ind_mod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND_MOD"));
			record.Action_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_ID"));
			record.Act_ind_action = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND_ACTION"));
									
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
			Sd_modactmcRecord record = new Sd_modactmcRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Mc_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_ID"));
			record.Mc_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_NM"));
			record.Mc_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC_TYP"));
			record.Dt_comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DT_COMM"));
			record.Dt_decomm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DT_DECOMM"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
			record.Modal_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODAL_ID"));
			record.Modal_type_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODAL_TYPE_ID"));
			record.Energy = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENERGY"));
			record.Energy_unit = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENERGY_UNIT"));
			record.End_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "END_DATE"));
			record.Act_ind_mod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND_MOD"));
			record.Action_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTION_ID"));
			record.Act_ind_action = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND_ACTION"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Sd_modactmcCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_modactmcRecord newRecord = new Sd_modactmcRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_modactmcRecord record)
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
		public Sd_modactmcRecord get(int index)
		{
			return (Sd_modactmcRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_modactmcRecord
	{
		public String Mc_id = "";
		public String Mc_nm = "";
		public String Mc_typ = "";
		public String Dt_comm = "";
		public String Dt_decomm = "";
		public String Act_ind = "";
		public String Modal_id = "";
		public String Modal_type_id = "";
		public String Energy = "";
		public String Energy_unit = "";
		public String End_date = "";
		public String Act_ind_mod = "";
		public String Action_id = "";
		public String Act_ind_action = "";
				
		
		public void clear()
		{
			Mc_id = "";
			Mc_nm = "";
			Mc_typ = "";
			Dt_comm = "";
			Dt_decomm = "";
			Act_ind = "";
			Modal_id = "";
			Modal_type_id = "";
			Energy = "";
			Energy_unit = "";
			End_date = "";
			Act_ind_mod = "";
			Action_id = "";
			Act_ind_action = "";
			
		}		
	}
		
		
	public final class Sd_modactmcFilter
	{			
		public String Mc_id = "";
		public String Mc_nm = "";
		public String Mc_typ = "";
		public String Dt_comm = "";
		public String Dt_decomm = "";
		public String Act_ind = "";
		public String Modal_id = "";
		public String Modal_type_id = "";
		public String Energy = "";
		public String Energy_unit = "";
		public String End_date = "";
		public String Act_ind_mod = "";
		public String Action_id = "";
		public String Act_ind_action = "";
		
		public void clear()
		{				
			Mc_id = "";
			Mc_nm = "";
			Mc_typ = "";
			Dt_comm = "";
			Dt_decomm = "";
			Act_ind = "";
			Modal_id = "";
			Modal_type_id = "";
			Energy = "";
			Energy_unit = "";
			End_date = "";
			Act_ind_mod = "";
			Action_id = "";
			Act_ind_action = "";
		}	
		public Sd_modactmcFilter cloneObject()
		{
			Sd_modactmcFilter newFilter = new Sd_modactmcFilter();
			
			newFilter.Mc_id = this.Mc_id;
			newFilter.Mc_nm = this.Mc_nm;
			newFilter.Mc_typ = this.Mc_typ;
			newFilter.Dt_comm = this.Dt_comm;
			newFilter.Dt_decomm = this.Dt_decomm;
			newFilter.Act_ind = this.Act_ind;
			newFilter.Modal_id = this.Modal_id;
			newFilter.Modal_type_id = this.Modal_type_id;
			newFilter.Energy = this.Energy;
			newFilter.Energy_unit = this.Energy_unit;
			newFilter.End_date = this.End_date;
			newFilter.Act_ind_mod = this.Act_ind_mod;
			newFilter.Action_id = this.Action_id;
			newFilter.Act_ind_action = this.Act_ind_action;
			
			return newFilter;
		}
	}
	public final class Sd_modactmcEditFilter
	{			
		public boolean IncludeMc_id = true;
		public boolean IncludeMc_nm = true;
		public boolean IncludeMc_typ = true;
		public boolean IncludeDt_comm = true;
		public boolean IncludeDt_decomm = true;
		public boolean IncludeAct_ind = true;
		public boolean IncludeModal_id = true;
		public boolean IncludeModal_type_id = true;
		public boolean IncludeEnergy = true;
		public boolean IncludeEnergy_unit = true;
		public boolean IncludeEnd_date = true;
		public boolean IncludeAct_ind_mod = true;
		public boolean IncludeAction_id = true;
		public boolean IncludeAct_ind_action = true;
		
		public void includeAll()
		{				
			IncludeMc_id = true;
			IncludeMc_nm = true;
			IncludeMc_typ = true;
			IncludeDt_comm = true;
			IncludeDt_decomm = true;
			IncludeAct_ind = true;
			IncludeModal_id = true;
			IncludeModal_type_id = true;
			IncludeEnergy = true;
			IncludeEnergy_unit = true;
			IncludeEnd_date = true;
			IncludeAct_ind_mod = true;
			IncludeAction_id = true;
			IncludeAct_ind_action = true;
		}	
		public void excludeAll()
		{				
			IncludeMc_id = false;
			IncludeMc_nm = false;
			IncludeMc_typ = false;
			IncludeDt_comm = false;
			IncludeDt_decomm = false;
			IncludeAct_ind = false;
			IncludeModal_id = false;
			IncludeModal_type_id = false;
			IncludeEnergy = false;
			IncludeEnergy_unit = false;
			IncludeEnd_date = false;
			IncludeAct_ind_mod = false;
			IncludeAction_id = false;
			IncludeAct_ind_action = false;
		}
		public Sd_modactmcEditFilter cloneObject()
		{
			Sd_modactmcEditFilter newEditFilter = new Sd_modactmcEditFilter();
			
			newEditFilter.IncludeMc_id = this.IncludeMc_id;
			newEditFilter.IncludeMc_nm = this.IncludeMc_nm;
			newEditFilter.IncludeMc_typ = this.IncludeMc_typ;
			newEditFilter.IncludeDt_comm = this.IncludeDt_comm;
			newEditFilter.IncludeDt_decomm = this.IncludeDt_decomm;
			newEditFilter.IncludeAct_ind = this.IncludeAct_ind;
			newEditFilter.IncludeModal_id = this.IncludeModal_id;
			newEditFilter.IncludeModal_type_id = this.IncludeModal_type_id;
			newEditFilter.IncludeEnergy = this.IncludeEnergy;
			newEditFilter.IncludeEnergy_unit = this.IncludeEnergy_unit;
			newEditFilter.IncludeEnd_date = this.IncludeEnd_date;
			newEditFilter.IncludeAct_ind_mod = this.IncludeAct_ind_mod;
			newEditFilter.IncludeAction_id = this.IncludeAction_id;
			newEditFilter.IncludeAct_ind_action = this.IncludeAct_ind_action;
			
			return newEditFilter;
		}
	}
}
