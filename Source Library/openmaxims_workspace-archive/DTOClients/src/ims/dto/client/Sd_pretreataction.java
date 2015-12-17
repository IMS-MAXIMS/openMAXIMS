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

public final class Sd_pretreataction implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sd_pretreataction.class);
	
	private Sd_pretreatactionFilter lastGetFilter = null;
	private final String serviceName = "SD_PRETREATACTION";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Sd_pretreatactionFilter Filter = new Sd_pretreatactionFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Sd_pretreatactionEditFilter EditFilter = new Sd_pretreatactionEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Sd_pretreatactionCollection DataCollection = new Sd_pretreatactionCollection();

	/**
	 * Creates a new Sd_pretreataction Data Transfer Object.
	 */ 
	public Sd_pretreataction(ims.dto.Connection connection)
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
	public Sd_pretreataction cloneObject()
	{
		Sd_pretreataction cloneObject = new Sd_pretreataction(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Sd_pretreataction_id = DataCollection.get(x).Sd_pretreataction_id;
			cloneObject.DataCollection.get(index).Actionname = DataCollection.get(x).Actionname;
			cloneObject.DataCollection.get(index).Actiondesc = DataCollection.get(x).Actiondesc;
			cloneObject.DataCollection.get(index).Isdefault = DataCollection.get(x).Isdefault;
			cloneObject.DataCollection.get(index).Requiresmachine = DataCollection.get(x).Requiresmachine;
			cloneObject.DataCollection.get(index).Actind = DataCollection.get(x).Actind;
			cloneObject.DataCollection.get(index).Requiresconsultant = DataCollection.get(x).Requiresconsultant;
			cloneObject.DataCollection.get(index).Isdosecalc = DataCollection.get(x).Isdosecalc;
			cloneObject.DataCollection.get(index).Ismouldroom = DataCollection.get(x).Ismouldroom;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
							
			
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
		return "Sd_pretreataction.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_pretreataction.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Sd_pretreataction.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_pretreataction.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_pretreataction.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_pretreataction.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Sd_pretreataction.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Sd_pretreataction.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_pretreataction.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Sd_pretreataction.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Sd_pretreataction.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Sd_pretreataction.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Sd_pretreataction.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_pretreataction.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_pretreataction.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Sd_pretreataction.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Sd_pretreataction.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Sd_pretreataction.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Sd_pretreataction.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Sd_pretreataction.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_pretreataction.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Sd_pretreataction.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Sd_pretreataction.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_pretreataction.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Sd_pretreataction.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Sd_pretreataction.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Sd_pretreataction.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Sd_pretreataction nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Sd_pretreataction After NextList ");
				
		decodeNASMessage();		
		logger.debug("Sd_pretreataction After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Sd_pretreataction.List");
							
		listInProgress = true;	
		logger.debug("Sd_pretreataction Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Sd_pretreataction After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Sd_pretreataction After Parse Message");
		
						
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
	private String encodeNASFilter(Sd_pretreatactionFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Sd_pretreataction_id != null && filter.Sd_pretreataction_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SD_PRETREATACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sd_pretreataction_id);
		}
		
		if(Filter.Actionname != null && filter.Actionname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIONNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Actionname);
		}
		
		if(Filter.Actiondesc != null && filter.Actiondesc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIONDESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Actiondesc);
		}
		
		if(Filter.Isdefault != null && filter.Isdefault.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ISDEFAULT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Isdefault);
		}
		
		if(Filter.Requiresmachine != null && filter.Requiresmachine.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REQUIRESMACHINE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Requiresmachine);
		}
		
		if(Filter.Actind != null && filter.Actind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACTIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Actind);
		}
		
		if(Filter.Requiresconsultant != null && filter.Requiresconsultant.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REQUIRESCONSULTANT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Requiresconsultant);
		}
		
		if(Filter.Isdosecalc != null && filter.Isdosecalc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ISDOSECALC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Isdosecalc);
		}
		
		if(Filter.Ismouldroom != null && filter.Ismouldroom.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ISMOULDROOM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ismouldroom);
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Sd_pretreatactionRecord data = (Sd_pretreatactionRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeSd_pretreataction_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SD_PRETREATACTION_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sd_pretreataction_id));
		}
		
		if(EditFilter.IncludeActionname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIONNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Actionname));
		}
		
		if(EditFilter.IncludeActiondesc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIONDESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Actiondesc));
		}
		
		if(EditFilter.IncludeIsdefault)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ISDEFAULT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Isdefault));
		}
		
		if(EditFilter.IncludeRequiresmachine)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REQUIRESMACHINE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Requiresmachine));
		}
		
		if(EditFilter.IncludeActind)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACTIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Actind));
		}
		
		if(EditFilter.IncludeRequiresconsultant)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REQUIRESCONSULTANT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Requiresconsultant));
		}
		
		if(EditFilter.IncludeIsdosecalc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ISDOSECALC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Isdosecalc));
		}
		
		if(EditFilter.IncludeIsmouldroom)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ISMOULDROOM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ismouldroom));
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
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
			Sd_pretreatactionRecord record = new Sd_pretreatactionRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Sd_pretreataction_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_PRETREATACTION_ID"));
			record.Actionname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIONNAME"));
			record.Actiondesc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIONDESC"));
			record.Isdefault = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ISDEFAULT"));
			record.Requiresmachine = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQUIRESMACHINE"));
			record.Actind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIND"));
			record.Requiresconsultant = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQUIRESCONSULTANT"));
			record.Isdosecalc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ISDOSECALC"));
			record.Ismouldroom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ISMOULDROOM"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
									
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
			Sd_pretreatactionRecord record = new Sd_pretreatactionRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Sd_pretreataction_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SD_PRETREATACTION_ID"));
			record.Actionname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIONNAME"));
			record.Actiondesc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIONDESC"));
			record.Isdefault = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ISDEFAULT"));
			record.Requiresmachine = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQUIRESMACHINE"));
			record.Actind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIND"));
			record.Requiresconsultant = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQUIRESCONSULTANT"));
			record.Isdosecalc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ISDOSECALC"));
			record.Ismouldroom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ISMOULDROOM"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Sd_pretreatactionCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Sd_pretreatactionRecord newRecord = new Sd_pretreatactionRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Sd_pretreatactionRecord record)
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
		public Sd_pretreatactionRecord get(int index)
		{
			return (Sd_pretreatactionRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Sd_pretreatactionRecord
	{
		public String Sd_pretreataction_id = "";
		public String Actionname = "";
		public String Actiondesc = "";
		public String Isdefault = "";
		public String Requiresmachine = "";
		public String Actind = "";
		public String Requiresconsultant = "";
		public String Isdosecalc = "";
		public String Ismouldroom = "";
		public String Tstp = "";
				
		
		public void clear()
		{
			Sd_pretreataction_id = "";
			Actionname = "";
			Actiondesc = "";
			Isdefault = "";
			Requiresmachine = "";
			Actind = "";
			Requiresconsultant = "";
			Isdosecalc = "";
			Ismouldroom = "";
			Tstp = "";
			
		}		
	}
		
		
	public final class Sd_pretreatactionFilter
	{			
		public String Sd_pretreataction_id = "";
		public String Actionname = "";
		public String Actiondesc = "";
		public String Isdefault = "";
		public String Requiresmachine = "";
		public String Actind = "";
		public String Requiresconsultant = "";
		public String Isdosecalc = "";
		public String Ismouldroom = "";
		public String Tstp = "";
		
		public void clear()
		{				
			Sd_pretreataction_id = "";
			Actionname = "";
			Actiondesc = "";
			Isdefault = "";
			Requiresmachine = "";
			Actind = "";
			Requiresconsultant = "";
			Isdosecalc = "";
			Ismouldroom = "";
			Tstp = "";
		}	
		public Sd_pretreatactionFilter cloneObject()
		{
			Sd_pretreatactionFilter newFilter = new Sd_pretreatactionFilter();
			
			newFilter.Sd_pretreataction_id = this.Sd_pretreataction_id;
			newFilter.Actionname = this.Actionname;
			newFilter.Actiondesc = this.Actiondesc;
			newFilter.Isdefault = this.Isdefault;
			newFilter.Requiresmachine = this.Requiresmachine;
			newFilter.Actind = this.Actind;
			newFilter.Requiresconsultant = this.Requiresconsultant;
			newFilter.Isdosecalc = this.Isdosecalc;
			newFilter.Ismouldroom = this.Ismouldroom;
			newFilter.Tstp = this.Tstp;
			
			return newFilter;
		}
	}
	public final class Sd_pretreatactionEditFilter
	{			
		public boolean IncludeSd_pretreataction_id = true;
		public boolean IncludeActionname = true;
		public boolean IncludeActiondesc = true;
		public boolean IncludeIsdefault = true;
		public boolean IncludeRequiresmachine = true;
		public boolean IncludeActind = true;
		public boolean IncludeRequiresconsultant = true;
		public boolean IncludeIsdosecalc = true;
		public boolean IncludeIsmouldroom = true;
		public boolean IncludeTstp = true;
		
		public void includeAll()
		{				
			IncludeSd_pretreataction_id = true;
			IncludeActionname = true;
			IncludeActiondesc = true;
			IncludeIsdefault = true;
			IncludeRequiresmachine = true;
			IncludeActind = true;
			IncludeRequiresconsultant = true;
			IncludeIsdosecalc = true;
			IncludeIsmouldroom = true;
			IncludeTstp = true;
		}	
		public void excludeAll()
		{				
			IncludeSd_pretreataction_id = false;
			IncludeActionname = false;
			IncludeActiondesc = false;
			IncludeIsdefault = false;
			IncludeRequiresmachine = false;
			IncludeActind = false;
			IncludeRequiresconsultant = false;
			IncludeIsdosecalc = false;
			IncludeIsmouldroom = false;
			IncludeTstp = false;
		}
		public Sd_pretreatactionEditFilter cloneObject()
		{
			Sd_pretreatactionEditFilter newEditFilter = new Sd_pretreatactionEditFilter();
			
			newEditFilter.IncludeSd_pretreataction_id = this.IncludeSd_pretreataction_id;
			newEditFilter.IncludeActionname = this.IncludeActionname;
			newEditFilter.IncludeActiondesc = this.IncludeActiondesc;
			newEditFilter.IncludeIsdefault = this.IncludeIsdefault;
			newEditFilter.IncludeRequiresmachine = this.IncludeRequiresmachine;
			newEditFilter.IncludeActind = this.IncludeActind;
			newEditFilter.IncludeRequiresconsultant = this.IncludeRequiresconsultant;
			newEditFilter.IncludeIsdosecalc = this.IncludeIsdosecalc;
			newEditFilter.IncludeIsmouldroom = this.IncludeIsmouldroom;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			
			return newEditFilter;
		}
	}
}
