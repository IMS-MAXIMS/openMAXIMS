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
// Template ver. 1.0.6 - Last modified on 25/05/2004 15:00 by Marius Mihalec

package ims.dto.client;

public final class Dojimmscheck
{
	private DojimmscheckFilter lastGetFilter = null;
	private final String serviceName = "DOJIMMSCHECK";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public DojimmscheckFilter Filter = new DojimmscheckFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public DojimmscheckEditFilter EditFilter = new DojimmscheckEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public DojimmscheckCollection DataCollection = new DojimmscheckCollection();

	/**
	 * Creates a new Dojimmscheck Data Transfer Object.
	 */ 
	public Dojimmscheck(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Dojimmscheck cloneObject() throws ims.dto.Exception
	{
		Dojimmscheck cloneObject = new Dojimmscheck(Connection);
			
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
			cloneObject.DataCollection.get(index).Pnum = DataCollection.get(x).Pnum;
			cloneObject.DataCollection.get(index).Progid = DataCollection.get(x).Progid;
			cloneObject.DataCollection.get(index).Stage = DataCollection.get(x).Stage;
			cloneObject.DataCollection.get(index).Reqid = DataCollection.get(x).Reqid;
			cloneObject.DataCollection.get(index).Doseid = DataCollection.get(x).Doseid;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Rusrtxt = DataCollection.get(x).Rusrtxt;
							
			
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
		return "Dojimmscheck.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmscheck.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Dojimmscheck.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmscheck.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmscheck.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmscheck.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Dojimmscheck.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Dojimmscheck.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmscheck.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Dojimmscheck.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Dojimmscheck.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Dojimmscheck.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Dojimmscheck.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojimmscheck.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmscheck.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Dojimmscheck.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Dojimmscheck.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Dojimmscheck.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Dojimmscheck.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojimmscheck.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmscheck.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Dojimmscheck.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Dojimmscheck.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmscheck.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Dojimmscheck.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Dojimmscheck.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Dojimmscheck.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmscheck.List");
							
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
						
		if(execResult != null)
		{
			if(execResult.getId() != -3) 
			{
				listInProgress = false;
				return execResult;
			}
		}
		else // NAS next list empty
		{
			listInProgress = false;
			return null;
		}				
					
		if(!loadAllRecords || !listInProgress)
		{
			listInProgress = false;
			return Connection.stopList(serviceName);
		}
		
		listInProgress = false;
		return null;
	}	

	private String encodeNASFilter()
	{
		return encodeNASFilter(Filter);
	}
	private String encodeNASFilter(DojimmscheckFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Unid != null && filter.Unid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Unid;
		}
		
		if(Filter.Pnum != null && filter.Pnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnum;
		}
		
		if(Filter.Progid != null && filter.Progid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PROGID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Progid;
		}
		
		if(Filter.Stage != null && filter.Stage.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stage;
		}
		
		if(Filter.Reqid != null && filter.Reqid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reqid;
		}
		
		if(Filter.Doseid != null && filter.Doseid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOSEID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doseid;
		}
		
		if(Filter.Active != null && filter.Active.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Active;
		}
		
		if(Filter.Rusr != null && filter.Rusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusr;
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
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Rusrtxt != null && filter.Rusrtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusrtxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		DojimmscheckRecord data = (DojimmscheckRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeUnid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unid);
		}
		
		if(EditFilter.IncludePnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnum);
		}
		
		if(EditFilter.IncludeProgid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PROGID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Progid);
		}
		
		if(EditFilter.IncludeStage)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stage);
		}
		
		if(EditFilter.IncludeReqid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reqid);
		}
		
		if(EditFilter.IncludeDoseid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOSEID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doseid);
		}
		
		if(EditFilter.IncludeActive)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Active);
		}
		
		if(EditFilter.IncludeRusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusr);
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
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeRusrtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusrtxt);
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
			DojimmscheckRecord record = new DojimmscheckRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNUM"));
			record.Progid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROGID"));
			record.Stage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAGE"));
			record.Reqid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQID"));
			record.Doseid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOSEID"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Rusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSRTXT"));
									
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
			DojimmscheckRecord record = new DojimmscheckRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNUM"));
			record.Progid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROGID"));
			record.Stage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAGE"));
			record.Reqid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQID"));
			record.Doseid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOSEID"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Rusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSRTXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class DojimmscheckCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DojimmscheckRecord newRecord = new DojimmscheckRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DojimmscheckRecord record)
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
		public DojimmscheckRecord get(int index)
		{
			return (DojimmscheckRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class DojimmscheckRecord
	{
		public String Unid = "";
		public String Pnum = "";
		public String Progid = "";
		public String Stage = "";
		public String Reqid = "";
		public String Doseid = "";
		public String Active = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Tstp = "";
		public String Rusrtxt = "";
				
		
		public void clear()
		{
			Unid = "";
			Pnum = "";
			Progid = "";
			Stage = "";
			Reqid = "";
			Doseid = "";
			Active = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Tstp = "";
			Rusrtxt = "";
			
		}		
	}
		
		
	public final class DojimmscheckFilter
	{			
		public String Unid = "";
		public String Pnum = "";
		public String Progid = "";
		public String Stage = "";
		public String Reqid = "";
		public String Doseid = "";
		public String Active = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Tstp = "";
		public String Rusrtxt = "";
		
		public void clear()
		{				
			Unid = "";
			Pnum = "";
			Progid = "";
			Stage = "";
			Reqid = "";
			Doseid = "";
			Active = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Tstp = "";
			Rusrtxt = "";
		}	
		public DojimmscheckFilter cloneObject()
		{
			DojimmscheckFilter newFilter = new DojimmscheckFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Pnum = this.Pnum;
			newFilter.Progid = this.Progid;
			newFilter.Stage = this.Stage;
			newFilter.Reqid = this.Reqid;
			newFilter.Doseid = this.Doseid;
			newFilter.Active = this.Active;
			newFilter.Rusr = this.Rusr;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Tstp = this.Tstp;
			newFilter.Rusrtxt = this.Rusrtxt;
			
			return newFilter;
		}
	}
	public final class DojimmscheckEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludePnum = true;
		public boolean IncludeProgid = true;
		public boolean IncludeStage = true;
		public boolean IncludeReqid = true;
		public boolean IncludeDoseid = true;
		public boolean IncludeActive = true;
		public boolean IncludeRusr = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeTstp = true;
		public boolean IncludeRusrtxt = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludePnum = true;
			IncludeProgid = true;
			IncludeStage = true;
			IncludeReqid = true;
			IncludeDoseid = true;
			IncludeActive = true;
			IncludeRusr = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeTstp = true;
			IncludeRusrtxt = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludePnum = false;
			IncludeProgid = false;
			IncludeStage = false;
			IncludeReqid = false;
			IncludeDoseid = false;
			IncludeActive = false;
			IncludeRusr = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeTstp = false;
			IncludeRusrtxt = false;
		}
		public DojimmscheckEditFilter cloneObject()
		{
			DojimmscheckEditFilter newEditFilter = new DojimmscheckEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludePnum = this.IncludePnum;
			newEditFilter.IncludeProgid = this.IncludeProgid;
			newEditFilter.IncludeStage = this.IncludeStage;
			newEditFilter.IncludeReqid = this.IncludeReqid;
			newEditFilter.IncludeDoseid = this.IncludeDoseid;
			newEditFilter.IncludeActive = this.IncludeActive;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeRusrtxt = this.IncludeRusrtxt;
			
			return newEditFilter;
		}
	}
}
