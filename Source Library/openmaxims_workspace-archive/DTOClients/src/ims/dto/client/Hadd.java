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

public final class Hadd implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Hadd.class);
	
	private HaddFilter lastGetFilter = null;
	private final String serviceName = "HADD";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public HaddFilter Filter = new HaddFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public HaddEditFilter EditFilter = new HaddEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public HaddCollection DataCollection = new HaddCollection();

	/**
	 * Creates a new Hadd Data Transfer Object.
	 */ 
	public Hadd(ims.dto.Connection connection)
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
	public Hadd cloneObject()
	{
		Hadd cloneObject = new Hadd(Connection);
			
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
			cloneObject.DataCollection.get(index).Datefrom = DataCollection.get(x).Datefrom;
			cloneObject.DataCollection.get(index).Adr1 = DataCollection.get(x).Adr1;
			cloneObject.DataCollection.get(index).Adr2 = DataCollection.get(x).Adr2;
			cloneObject.DataCollection.get(index).Adr3 = DataCollection.get(x).Adr3;
			cloneObject.DataCollection.get(index).Adr4 = DataCollection.get(x).Adr4;
			cloneObject.DataCollection.get(index).Post = DataCollection.get(x).Post;
			cloneObject.DataCollection.get(index).Harc = DataCollection.get(x).Harc;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.3.4.3 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Hadd.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hadd.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Hadd.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hadd.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hadd.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hadd.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Hadd.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Hadd.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hadd.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Hadd.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Hadd.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Hadd.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Hadd.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Hadd.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hadd.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Hadd.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Hadd.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Hadd.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Hadd.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Hadd.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hadd.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Hadd.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Hadd.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hadd.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Hadd.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Hadd.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Hadd.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Hadd nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Hadd After NextList ");
				
		decodeNASMessage();		
		logger.debug("Hadd After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hadd.List");
							
		listInProgress = true;	
		logger.debug("Hadd Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Hadd After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Hadd After Parse Message");
		
						
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
	private String encodeNASFilter(HaddFilter filter)
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
		
		if(Filter.Datefrom != null && filter.Datefrom.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DATEFROM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Datefrom);
		}
		
		if(Filter.Adr1 != null && filter.Adr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr1);
		}
		
		if(Filter.Adr2 != null && filter.Adr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr2);
		}
		
		if(Filter.Adr3 != null && filter.Adr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr3);
		}
		
		if(Filter.Adr4 != null && filter.Adr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr4);
		}
		
		if(Filter.Post != null && filter.Post.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("POST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Post);
		}
		
		if(Filter.Harc != null && filter.Harc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HARC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Harc);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		HaddRecord data = (HaddRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum));
		}
		
		if(EditFilter.IncludeDatefrom)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DATEFROM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Datefrom));
		}
		
		if(EditFilter.IncludeAdr1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr1));
		}
		
		if(EditFilter.IncludeAdr2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr2));
		}
		
		if(EditFilter.IncludeAdr3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr3));
		}
		
		if(EditFilter.IncludeAdr4)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr4));
		}
		
		if(EditFilter.IncludePost)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("POST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Post));
		}
		
		if(EditFilter.IncludeHarc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HARC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Harc));
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
			HaddRecord record = new HaddRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Datefrom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATEFROM"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Post = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POST"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
									
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
			HaddRecord record = new HaddRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Datefrom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATEFROM"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Post = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POST"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class HaddCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			HaddRecord newRecord = new HaddRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(HaddRecord record)
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
		public HaddRecord get(int index)
		{
			return (HaddRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class HaddRecord
	{
		public String Hospnum = "";
		public String Datefrom = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Post = "";
		public String Harc = "";
				
		
		public void clear()
		{
			Hospnum = "";
			Datefrom = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Post = "";
			Harc = "";
			
		}		
	}
		
		
	public final class HaddFilter
	{			
		public String Hospnum = "";
		public String Datefrom = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Post = "";
		public String Harc = "";
		
		public void clear()
		{				
			Hospnum = "";
			Datefrom = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Post = "";
			Harc = "";
		}	
		public HaddFilter cloneObject()
		{
			HaddFilter newFilter = new HaddFilter();
			
			newFilter.Hospnum = this.Hospnum;
			newFilter.Datefrom = this.Datefrom;
			newFilter.Adr1 = this.Adr1;
			newFilter.Adr2 = this.Adr2;
			newFilter.Adr3 = this.Adr3;
			newFilter.Adr4 = this.Adr4;
			newFilter.Post = this.Post;
			newFilter.Harc = this.Harc;
			
			return newFilter;
		}
	}
	public final class HaddEditFilter
	{			
		public boolean IncludeHospnum = true;
		public boolean IncludeDatefrom = true;
		public boolean IncludeAdr1 = true;
		public boolean IncludeAdr2 = true;
		public boolean IncludeAdr3 = true;
		public boolean IncludeAdr4 = true;
		public boolean IncludePost = true;
		public boolean IncludeHarc = true;
		
		public void includeAll()
		{				
			IncludeHospnum = true;
			IncludeDatefrom = true;
			IncludeAdr1 = true;
			IncludeAdr2 = true;
			IncludeAdr3 = true;
			IncludeAdr4 = true;
			IncludePost = true;
			IncludeHarc = true;
		}	
		public void excludeAll()
		{				
			IncludeHospnum = false;
			IncludeDatefrom = false;
			IncludeAdr1 = false;
			IncludeAdr2 = false;
			IncludeAdr3 = false;
			IncludeAdr4 = false;
			IncludePost = false;
			IncludeHarc = false;
		}
		public HaddEditFilter cloneObject()
		{
			HaddEditFilter newEditFilter = new HaddEditFilter();
			
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeDatefrom = this.IncludeDatefrom;
			newEditFilter.IncludeAdr1 = this.IncludeAdr1;
			newEditFilter.IncludeAdr2 = this.IncludeAdr2;
			newEditFilter.IncludeAdr3 = this.IncludeAdr3;
			newEditFilter.IncludeAdr4 = this.IncludeAdr4;
			newEditFilter.IncludePost = this.IncludePost;
			newEditFilter.IncludeHarc = this.IncludeHarc;
			
			return newEditFilter;
		}
	}
}
