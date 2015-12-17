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

public final class Casenote implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Casenote.class);
	
	private CasenoteFilter lastGetFilter = null;
	private final String serviceName = "CASENOTE";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public CasenoteFilter Filter = new CasenoteFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public CasenoteEditFilter EditFilter = new CasenoteEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public CasenoteCollection DataCollection = new CasenoteCollection();

	/**
	 * Creates a new Casenote Data Transfer Object.
	 */ 
	public Casenote(ims.dto.Connection connection)
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
	public Casenote cloneObject()
	{
		Casenote cloneObject = new Casenote(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).List_type = DataCollection.get(x).List_type;
			cloneObject.DataCollection.get(index).Vol = DataCollection.get(x).Vol;
			cloneObject.DataCollection.get(index).Curr_loc = DataCollection.get(x).Curr_loc;
			cloneObject.DataCollection.get(index).Move_to = DataCollection.get(x).Move_to;
			cloneObject.DataCollection.get(index).Loc_date = DataCollection.get(x).Loc_date;
			cloneObject.DataCollection.get(index).Loc_time = DataCollection.get(x).Loc_time;
			cloneObject.DataCollection.get(index).Comm = DataCollection.get(x).Comm;
			cloneObject.DataCollection.get(index).Unam = DataCollection.get(x).Unam;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "16";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Casenote.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Casenote.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Casenote.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Casenote.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Casenote.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Casenote.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Casenote.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Casenote.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Casenote.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Casenote.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Casenote.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Casenote.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Casenote.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Casenote.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Casenote.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Casenote.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Casenote.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Casenote.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Casenote.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Casenote.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Casenote.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Casenote.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Casenote.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Casenote.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Casenote.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Casenote.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Casenote.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Casenote nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Casenote After NextList ");
				
		decodeNASMessage();		
		logger.debug("Casenote After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Casenote.List");
							
		listInProgress = true;	
		logger.debug("Casenote Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Casenote After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Casenote After Parse Message");
		
						
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
	private String encodeNASFilter(CasenoteFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum);
		}
		
		if(Filter.List_type != null && filter.List_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LIST_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.List_type);
		}
		
		if(Filter.Vol != null && filter.Vol.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("VOL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Vol);
		}
		
		if(Filter.Curr_loc != null && filter.Curr_loc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CURR_LOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Curr_loc);
		}
		
		if(Filter.Move_to != null && filter.Move_to.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MOVE_TO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Move_to);
		}
		
		if(Filter.Loc_date != null && filter.Loc_date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LOC_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Loc_date);
		}
		
		if(Filter.Loc_time != null && filter.Loc_time.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LOC_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Loc_time);
		}
		
		if(Filter.Comm != null && filter.Comm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Comm);
		}
		
		if(Filter.Unam != null && filter.Unam.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Unam);
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
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		CasenoteRecord data = (CasenoteRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum));
		}
		
		if(EditFilter.IncludeList_type)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LIST_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.List_type));
		}
		
		if(EditFilter.IncludeVol)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("VOL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Vol));
		}
		
		if(EditFilter.IncludeCurr_loc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CURR_LOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Curr_loc));
		}
		
		if(EditFilter.IncludeMove_to)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MOVE_TO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Move_to));
		}
		
		if(EditFilter.IncludeLoc_date)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LOC_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Loc_date));
		}
		
		if(EditFilter.IncludeLoc_time)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LOC_TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Loc_time));
		}
		
		if(EditFilter.IncludeComm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Comm));
		}
		
		if(EditFilter.IncludeUnam)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unam));
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
			CasenoteRecord record = new CasenoteRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.List_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LIST_TYPE"));
			record.Vol = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VOL"));
			record.Curr_loc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURR_LOC"));
			record.Move_to = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOVE_TO"));
			record.Loc_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LOC_DATE"));
			record.Loc_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LOC_TIME"));
			record.Comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMM"));
			record.Unam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNAM"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
									
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
			CasenoteRecord record = new CasenoteRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.List_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LIST_TYPE"));
			record.Vol = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VOL"));
			record.Curr_loc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURR_LOC"));
			record.Move_to = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOVE_TO"));
			record.Loc_date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LOC_DATE"));
			record.Loc_time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LOC_TIME"));
			record.Comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMM"));
			record.Unam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNAM"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class CasenoteCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			CasenoteRecord newRecord = new CasenoteRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(CasenoteRecord record)
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
		public CasenoteRecord get(int index)
		{
			return (CasenoteRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class CasenoteRecord
	{
		public String Hospnum = "";
		public String List_type = "";
		public String Vol = "";
		public String Curr_loc = "";
		public String Move_to = "";
		public String Loc_date = "";
		public String Loc_time = "";
		public String Comm = "";
		public String Unam = "";
		public String Rdat = "";
		public String Rtim = "";
				
		
		public void clear()
		{
			Hospnum = "";
			List_type = "";
			Vol = "";
			Curr_loc = "";
			Move_to = "";
			Loc_date = "";
			Loc_time = "";
			Comm = "";
			Unam = "";
			Rdat = "";
			Rtim = "";
			
		}		
	}
		
		
	public final class CasenoteFilter
	{			
		public String Hospnum = "";
		public String List_type = "";
		public String Vol = "";
		public String Curr_loc = "";
		public String Move_to = "";
		public String Loc_date = "";
		public String Loc_time = "";
		public String Comm = "";
		public String Unam = "";
		public String Rdat = "";
		public String Rtim = "";
		
		public void clear()
		{				
			Hospnum = "";
			List_type = "";
			Vol = "";
			Curr_loc = "";
			Move_to = "";
			Loc_date = "";
			Loc_time = "";
			Comm = "";
			Unam = "";
			Rdat = "";
			Rtim = "";
		}	
		public CasenoteFilter cloneObject()
		{
			CasenoteFilter newFilter = new CasenoteFilter();
			
			newFilter.Hospnum = this.Hospnum;
			newFilter.List_type = this.List_type;
			newFilter.Vol = this.Vol;
			newFilter.Curr_loc = this.Curr_loc;
			newFilter.Move_to = this.Move_to;
			newFilter.Loc_date = this.Loc_date;
			newFilter.Loc_time = this.Loc_time;
			newFilter.Comm = this.Comm;
			newFilter.Unam = this.Unam;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			
			return newFilter;
		}
	}
	public final class CasenoteEditFilter
	{			
		public boolean IncludeHospnum = true;
		public boolean IncludeList_type = true;
		public boolean IncludeVol = true;
		public boolean IncludeCurr_loc = true;
		public boolean IncludeMove_to = true;
		public boolean IncludeLoc_date = true;
		public boolean IncludeLoc_time = true;
		public boolean IncludeComm = true;
		public boolean IncludeUnam = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		
		public void includeAll()
		{				
			IncludeHospnum = true;
			IncludeList_type = true;
			IncludeVol = true;
			IncludeCurr_loc = true;
			IncludeMove_to = true;
			IncludeLoc_date = true;
			IncludeLoc_time = true;
			IncludeComm = true;
			IncludeUnam = true;
			IncludeRdat = true;
			IncludeRtim = true;
		}	
		public void excludeAll()
		{				
			IncludeHospnum = false;
			IncludeList_type = false;
			IncludeVol = false;
			IncludeCurr_loc = false;
			IncludeMove_to = false;
			IncludeLoc_date = false;
			IncludeLoc_time = false;
			IncludeComm = false;
			IncludeUnam = false;
			IncludeRdat = false;
			IncludeRtim = false;
		}
		public CasenoteEditFilter cloneObject()
		{
			CasenoteEditFilter newEditFilter = new CasenoteEditFilter();
			
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeList_type = this.IncludeList_type;
			newEditFilter.IncludeVol = this.IncludeVol;
			newEditFilter.IncludeCurr_loc = this.IncludeCurr_loc;
			newEditFilter.IncludeMove_to = this.IncludeMove_to;
			newEditFilter.IncludeLoc_date = this.IncludeLoc_date;
			newEditFilter.IncludeLoc_time = this.IncludeLoc_time;
			newEditFilter.IncludeComm = this.IncludeComm;
			newEditFilter.IncludeUnam = this.IncludeUnam;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			
			return newEditFilter;
		}
	}
}
