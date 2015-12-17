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

public final class Sd_activstaff implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_activstaff.class);
	
	private Sd_activstaffFilter lastGetFilter = null;
	private final String serviceName = "SD_ACTIVSTAFF";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_activstaffFilter Filter = new Sd_activstaffFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_activstaffEditFilter EditFilter = new Sd_activstaffEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_activstaffCollection DataCollection = new Sd_activstaffCollection();

	/**
	 * Creates a new Sd_activstaff Data Transfer Object.
	 */ 
	public Sd_activstaff(ims.dto.Connection connection)
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
	public Sd_activstaff cloneObject()
	{
		Sd_activstaff cloneObject = new Sd_activstaff(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Staffactiv_id = DataCollection.get(x).Staffactiv_id;
			cloneObject.DataCollection.get(index).Grp_id = DataCollection.get(x).Grp_id;
			cloneObject.DataCollection.get(index).Act_ind = DataCollection.get(x).Act_ind;
			cloneObject.DataCollection.get(index).Staff_no = DataCollection.get(x).Staff_no;
			cloneObject.DataCollection.get(index).Act_indstf = DataCollection.get(x).Act_indstf;
			cloneObject.DataCollection.get(index).Activ_id = DataCollection.get(x).Activ_id;
			cloneObject.DataCollection.get(index).Staff_name = DataCollection.get(x).Staff_name;
							
			
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
		return "Sd_activstaff.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_activstaff.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_activstaff.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_activstaff.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_activstaff.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_activstaff.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_activstaff.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_activstaff.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_activstaff.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_activstaff.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_activstaff.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_activstaff.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_activstaff.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_activstaff.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_activstaff.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_activstaff.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_activstaff.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_activstaff.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_activstaff.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_activstaff.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_activstaff.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_activstaff.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_activstaff.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_activstaff.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_activstaff.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_activstaff.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_activstaff.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_activstaff nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_activstaff After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_activstaff After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_activstaff.List");
							
		listInProgress = true;	
		logger.debug("Sd_activstaff Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_activstaff After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_activstaff After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_activstaffFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Staffactiv_id != null && filter.Staffactiv_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STAFFACTIV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Staffactiv_id);
		}
		
		if(Filter.Grp_id != null && filter.Grp_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GRP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Grp_id);
		}
		
		if(Filter.Act_ind != null && filter.Act_ind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_ind);
		}
		
		if(Filter.Staff_no != null && filter.Staff_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STAFF_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Staff_no);
		}
		
		if(Filter.Act_indstf != null && filter.Act_indstf.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACT_INDSTF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_indstf);
		}
		
		if(Filter.Activ_id != null && filter.Activ_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Activ_id);
		}
		
		if(Filter.Staff_name != null && filter.Staff_name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STAFF_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Staff_name);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_activstaffRecord data = (Sd_activstaffRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeStaffactiv_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STAFFACTIV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Staffactiv_id));
		}
		
		if(EditFilter.IncludeGrp_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GRP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Grp_id));
		}
		
		if(EditFilter.IncludeAct_ind)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_IND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_ind));
		}
		
		if(EditFilter.IncludeStaff_no)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STAFF_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Staff_no));
		}
		
		if(EditFilter.IncludeAct_indstf)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACT_INDSTF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_indstf));
		}
		
		if(EditFilter.IncludeActiv_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIV_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Activ_id));
		}
		
		if(EditFilter.IncludeStaff_name)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STAFF_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Staff_name));
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
			Sd_activstaffRecord record = new Sd_activstaffRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Staffactiv_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAFFACTIV_ID"));
			record.Grp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GRP_ID"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
			record.Staff_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAFF_NO"));
			record.Act_indstf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_INDSTF"));
			record.Activ_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIV_ID"));
			record.Staff_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAFF_NAME"));
									
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
			Sd_activstaffRecord record = new Sd_activstaffRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Staffactiv_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAFFACTIV_ID"));
			record.Grp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GRP_ID"));
			record.Act_ind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_IND"));
			record.Staff_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAFF_NO"));
			record.Act_indstf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_INDSTF"));
			record.Activ_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIV_ID"));
			record.Staff_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAFF_NAME"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Sd_activstaffCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_activstaffRecord newRecord = new Sd_activstaffRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_activstaffRecord record)
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
		public Sd_activstaffRecord get(int index)
		{
			return (Sd_activstaffRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_activstaffRecord
	{
		public String Staffactiv_id = "";
		public String Grp_id = "";
		public String Act_ind = "";
		public String Staff_no = "";
		public String Act_indstf = "";
		public String Activ_id = "";
		public String Staff_name = "";
				
		
		public void clear()
		{
			Staffactiv_id = "";
			Grp_id = "";
			Act_ind = "";
			Staff_no = "";
			Act_indstf = "";
			Activ_id = "";
			Staff_name = "";
			
		}		
	}
		
		
	public final class Sd_activstaffFilter
	{			
		public String Staffactiv_id = "";
		public String Grp_id = "";
		public String Act_ind = "";
		public String Staff_no = "";
		public String Act_indstf = "";
		public String Activ_id = "";
		public String Staff_name = "";
		
		public void clear()
		{				
			Staffactiv_id = "";
			Grp_id = "";
			Act_ind = "";
			Staff_no = "";
			Act_indstf = "";
			Activ_id = "";
			Staff_name = "";
		}	
		public Sd_activstaffFilter cloneObject()
		{
			Sd_activstaffFilter newFilter = new Sd_activstaffFilter();
			
			newFilter.Staffactiv_id = this.Staffactiv_id;
			newFilter.Grp_id = this.Grp_id;
			newFilter.Act_ind = this.Act_ind;
			newFilter.Staff_no = this.Staff_no;
			newFilter.Act_indstf = this.Act_indstf;
			newFilter.Activ_id = this.Activ_id;
			newFilter.Staff_name = this.Staff_name;
			
			return newFilter;
		}
	}
	public final class Sd_activstaffEditFilter
	{			
		public boolean IncludeStaffactiv_id = true;
		public boolean IncludeGrp_id = true;
		public boolean IncludeAct_ind = true;
		public boolean IncludeStaff_no = true;
		public boolean IncludeAct_indstf = true;
		public boolean IncludeActiv_id = true;
		public boolean IncludeStaff_name = true;
		
		public void includeAll()
		{				
			IncludeStaffactiv_id = true;
			IncludeGrp_id = true;
			IncludeAct_ind = true;
			IncludeStaff_no = true;
			IncludeAct_indstf = true;
			IncludeActiv_id = true;
			IncludeStaff_name = true;
		}	
		public void excludeAll()
		{				
			IncludeStaffactiv_id = false;
			IncludeGrp_id = false;
			IncludeAct_ind = false;
			IncludeStaff_no = false;
			IncludeAct_indstf = false;
			IncludeActiv_id = false;
			IncludeStaff_name = false;
		}
		public Sd_activstaffEditFilter cloneObject()
		{
			Sd_activstaffEditFilter newEditFilter = new Sd_activstaffEditFilter();
			
			newEditFilter.IncludeStaffactiv_id = this.IncludeStaffactiv_id;
			newEditFilter.IncludeGrp_id = this.IncludeGrp_id;
			newEditFilter.IncludeAct_ind = this.IncludeAct_ind;
			newEditFilter.IncludeStaff_no = this.IncludeStaff_no;
			newEditFilter.IncludeAct_indstf = this.IncludeAct_indstf;
			newEditFilter.IncludeActiv_id = this.IncludeActiv_id;
			newEditFilter.IncludeStaff_name = this.IncludeStaff_name;
			
			return newEditFilter;
		}
	}
}
