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
// Template ver. 1.0.3 - Last modified on 12/03/2004 10:13 by Marius Mihalec

package ims.dto.client;

public final class Hearts_diagnosis
{
	private Hearts_diagnosisFilter lastGetFilter = null;
	private final String serviceName = "HEARTS_DIAGNOSIS";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Hearts_diagnosisFilter Filter = new Hearts_diagnosisFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Hearts_diagnosisEditFilter EditFilter = new Hearts_diagnosisEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Hearts_diagnosisCollection DataCollection = new Hearts_diagnosisCollection();

	/**
	 * Creates a new Hearts_diagnosis Data Transfer Object.
	 */ 
	public Hearts_diagnosis(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Hearts_diagnosis cloneObject() throws ims.dto.Exception
	{
		Hearts_diagnosis cloneObject = new Hearts_diagnosis(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Epsd = DataCollection.get(x).Epsd;
			cloneObject.DataCollection.get(index).Seqn = DataCollection.get(x).Seqn;
			cloneObject.DataCollection.get(index).Icd = DataCollection.get(x).Icd;
			cloneObject.DataCollection.get(index).Rseq = DataCollection.get(x).Rseq;
			cloneObject.DataCollection.get(index).Eseq = DataCollection.get(x).Eseq;
			cloneObject.DataCollection.get(index).Icdtxt = DataCollection.get(x).Icdtxt;
			cloneObject.DataCollection.get(index).Epst = DataCollection.get(x).Epst;
			cloneObject.DataCollection.get(index).Exclude_blank = DataCollection.get(x).Exclude_blank;
			cloneObject.DataCollection.get(index).__orderby = DataCollection.get(x).__orderby;
							
			
		}
		
		return cloneObject;
	}		
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_diagnosis.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Hearts_diagnosis.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_diagnosis.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_diagnosis.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_diagnosis.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Hearts_diagnosis.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Hearts_diagnosis.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_diagnosis.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Hearts_diagnosis.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Hearts_diagnosis.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Hearts_diagnosis.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Hearts_diagnosis.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Hearts_diagnosis.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_diagnosis.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Hearts_diagnosis.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Hearts_diagnosis.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Hearts_diagnosis.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Hearts_diagnosis.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Hearts_diagnosis.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_diagnosis.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Hearts_diagnosis.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Hearts_diagnosis.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_diagnosis.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Hearts_diagnosis.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Hearts_diagnosis.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Hearts_diagnosis.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_diagnosis.List");
							
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
	private String encodeNASFilter(Hearts_diagnosisFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey;
		}
		
		if(Filter.Epsd != null && filter.Epsd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EPSD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Epsd;
		}
		
		if(Filter.Seqn != null && filter.Seqn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SEQN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Seqn;
		}
		
		if(Filter.Icd != null && filter.Icd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ICD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Icd;
		}
		
		if(Filter.Rseq != null && filter.Rseq.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RSEQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rseq;
		}
		
		if(Filter.Eseq != null && filter.Eseq.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ESEQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eseq;
		}
		
		if(Filter.Icdtxt != null && filter.Icdtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ICDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Icdtxt;
		}
		
		if(Filter.Epst != null && filter.Epst.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EPST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Epst;
		}
		
		if(Filter.Exclude_blank != null && filter.Exclude_blank.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EXCLUDE_BLANK" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Exclude_blank;
		}
		
		if(Filter.__orderby != null && filter.__orderby.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "__ORDERBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.__orderby;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Hearts_diagnosisRecord data = (Hearts_diagnosisRecord)DataCollection.get(0);
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
		}
		
		if(EditFilter.IncludeEpsd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EPSD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Epsd);
		}
		
		if(EditFilter.IncludeSeqn)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Seqn);
		}
		
		if(EditFilter.IncludeIcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ICD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Icd);
		}
		
		if(EditFilter.IncludeRseq)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RSEQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rseq);
		}
		
		if(EditFilter.IncludeEseq)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ESEQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eseq);
		}
		
		if(EditFilter.IncludeIcdtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ICDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Icdtxt);
		}
		
		if(EditFilter.IncludeEpst)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EPST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Epst);
		}
		
		if(EditFilter.IncludeExclude_blank)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EXCLUDE_BLANK" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Exclude_blank);
		}
		
		if(EditFilter.Include__orderby)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "__ORDERBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.__orderby);
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
			Hearts_diagnosisRecord record = new Hearts_diagnosisRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Epsd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPSD"));
			record.Seqn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEQN"));
			record.Icd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ICD"));
			record.Rseq = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSEQ"));
			record.Eseq = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESEQ"));
			record.Icdtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ICDTXT"));
			record.Epst = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPST"));
			record.Exclude_blank = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXCLUDE_BLANK"));
			record.__orderby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "__ORDERBY"));
									
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
			Hearts_diagnosisRecord record = new Hearts_diagnosisRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Epsd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPSD"));
			record.Seqn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEQN"));
			record.Icd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ICD"));
			record.Rseq = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSEQ"));
			record.Eseq = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESEQ"));
			record.Icdtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ICDTXT"));
			record.Epst = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPST"));
			record.Exclude_blank = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXCLUDE_BLANK"));
			record.__orderby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "__ORDERBY"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Hearts_diagnosisCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Hearts_diagnosisRecord newRecord = new Hearts_diagnosisRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Hearts_diagnosisRecord record)
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
		public Hearts_diagnosisRecord get(int index)
		{
			return (Hearts_diagnosisRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Hearts_diagnosisRecord
	{
		public String Pkey = "";
		public String Epsd = "";
		public String Seqn = "";
		public String Icd = "";
		public String Rseq = "";
		public String Eseq = "";
		public String Icdtxt = "";
		public String Epst = "";
		public String Exclude_blank = "";
		public String __orderby = "";
				
		
		public void clear()
		{
			Pkey = "";
			Epsd = "";
			Seqn = "";
			Icd = "";
			Rseq = "";
			Eseq = "";
			Icdtxt = "";
			Epst = "";
			Exclude_blank = "";
			__orderby = "";
			
		}		
	}
		
		
	public final class Hearts_diagnosisFilter
	{			
		public String Pkey = "";
		public String Epsd = "";
		public String Seqn = "";
		public String Icd = "";
		public String Rseq = "";
		public String Eseq = "";
		public String Icdtxt = "";
		public String Epst = "";
		public String Exclude_blank = "";
		public String __orderby = "";
		
		public void clear()
		{				
			Pkey = "";
			Epsd = "";
			Seqn = "";
			Icd = "";
			Rseq = "";
			Eseq = "";
			Icdtxt = "";
			Epst = "";
			Exclude_blank = "";
			__orderby = "";
		}	
		public Hearts_diagnosisFilter cloneObject()
		{
			Hearts_diagnosisFilter newFilter = new Hearts_diagnosisFilter();
			
			newFilter.Pkey = this.Pkey;
			newFilter.Epsd = this.Epsd;
			newFilter.Seqn = this.Seqn;
			newFilter.Icd = this.Icd;
			newFilter.Rseq = this.Rseq;
			newFilter.Eseq = this.Eseq;
			newFilter.Icdtxt = this.Icdtxt;
			newFilter.Epst = this.Epst;
			newFilter.Exclude_blank = this.Exclude_blank;
			newFilter.__orderby = this.__orderby;
			
			return newFilter;
		}
	}
	public final class Hearts_diagnosisEditFilter
	{			
		public boolean IncludePkey = true;
		public boolean IncludeEpsd = true;
		public boolean IncludeSeqn = true;
		public boolean IncludeIcd = true;
		public boolean IncludeRseq = true;
		public boolean IncludeEseq = true;
		public boolean IncludeIcdtxt = true;
		public boolean IncludeEpst = true;
		public boolean IncludeExclude_blank = true;
		public boolean Include__orderby = true;
		
		public void includeAll()
		{				
			IncludePkey = true;
			IncludeEpsd = true;
			IncludeSeqn = true;
			IncludeIcd = true;
			IncludeRseq = true;
			IncludeEseq = true;
			IncludeIcdtxt = true;
			IncludeEpst = true;
			IncludeExclude_blank = true;
			Include__orderby = true;
		}	
		public void excludeAll()
		{				
			IncludePkey = false;
			IncludeEpsd = false;
			IncludeSeqn = false;
			IncludeIcd = false;
			IncludeRseq = false;
			IncludeEseq = false;
			IncludeIcdtxt = false;
			IncludeEpst = false;
			IncludeExclude_blank = false;
			Include__orderby = false;
		}
		public Hearts_diagnosisEditFilter cloneObject()
		{
			Hearts_diagnosisEditFilter newEditFilter = new Hearts_diagnosisEditFilter();
			
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeEpsd = this.IncludeEpsd;
			newEditFilter.IncludeSeqn = this.IncludeSeqn;
			newEditFilter.IncludeIcd = this.IncludeIcd;
			newEditFilter.IncludeRseq = this.IncludeRseq;
			newEditFilter.IncludeEseq = this.IncludeEseq;
			newEditFilter.IncludeIcdtxt = this.IncludeIcdtxt;
			newEditFilter.IncludeEpst = this.IncludeEpst;
			newEditFilter.IncludeExclude_blank = this.IncludeExclude_blank;
			newEditFilter.Include__orderby = this.Include__orderby;
			
			return newEditFilter;
		}
	}
}
