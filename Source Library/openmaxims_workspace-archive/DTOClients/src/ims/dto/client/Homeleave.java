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

public final class Homeleave implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Homeleave.class);
	
	private HomeleaveFilter lastGetFilter = null;
	private final String serviceName = "HOMELEAVE";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public HomeleaveFilter Filter = new HomeleaveFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public HomeleaveEditFilter EditFilter = new HomeleaveEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public HomeleaveCollection DataCollection = new HomeleaveCollection();

	/**
	 * Creates a new Homeleave Data Transfer Object.
	 */ 
	public Homeleave(ims.dto.Connection connection)
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
	public Homeleave cloneObject()
	{
		Homeleave cloneObject = new Homeleave(Connection);
			
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
			cloneObject.DataCollection.get(index).Leavedt = DataCollection.get(x).Leavedt;
			cloneObject.DataCollection.get(index).Leavetm = DataCollection.get(x).Leavetm;
			cloneObject.DataCollection.get(index).Exdt = DataCollection.get(x).Exdt;
			cloneObject.DataCollection.get(index).Extm = DataCollection.get(x).Extm;
			cloneObject.DataCollection.get(index).Rescode = DataCollection.get(x).Rescode;
			cloneObject.DataCollection.get(index).Mors = DataCollection.get(x).Mors;
			cloneObject.DataCollection.get(index).Btyp = DataCollection.get(x).Btyp;
			cloneObject.DataCollection.get(index).Returndt = DataCollection.get(x).Returndt;
			cloneObject.DataCollection.get(index).Returntm = DataCollection.get(x).Returntm;
			cloneObject.DataCollection.get(index).Cflup = DataCollection.get(x).Cflup;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Desc = DataCollection.get(x).Desc;
			cloneObject.DataCollection.get(index).Webadt = DataCollection.get(x).Webadt;
			cloneObject.DataCollection.get(index).Hlfl = DataCollection.get(x).Hlfl;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.1.14.3 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Homeleave.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Homeleave.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Homeleave.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Homeleave.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Homeleave.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Homeleave.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Homeleave.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Homeleave.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Homeleave.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Homeleave.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Homeleave.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Homeleave.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Homeleave.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Homeleave.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Homeleave.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Homeleave.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Homeleave.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Homeleave.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Homeleave.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Homeleave.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Homeleave.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Homeleave.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Homeleave.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Homeleave.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Homeleave.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Homeleave.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Homeleave.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Homeleave nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Homeleave After NextList ");
				
		decodeNASMessage();		
		logger.debug("Homeleave After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Homeleave.List");
							
		listInProgress = true;	
		logger.debug("Homeleave Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Homeleave After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Homeleave After Parse Message");
		
						
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
	private String encodeNASFilter(HomeleaveFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey);
		}
		
		if(Filter.Leavedt != null && filter.Leavedt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LEAVEDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Leavedt);
		}
		
		if(Filter.Leavetm != null && filter.Leavetm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LEAVETM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Leavetm);
		}
		
		if(Filter.Exdt != null && filter.Exdt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EXDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Exdt);
		}
		
		if(Filter.Extm != null && filter.Extm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EXTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Extm);
		}
		
		if(Filter.Rescode != null && filter.Rescode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RESCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rescode);
		}
		
		if(Filter.Mors != null && filter.Mors.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MORS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mors);
		}
		
		if(Filter.Btyp != null && filter.Btyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("BTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Btyp);
		}
		
		if(Filter.Returndt != null && filter.Returndt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RETURNDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Returndt);
		}
		
		if(Filter.Returntm != null && filter.Returntm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RETURNTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Returntm);
		}
		
		if(Filter.Cflup != null && filter.Cflup.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CFLUP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cflup);
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum);
		}
		
		if(Filter.Desc != null && filter.Desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Desc);
		}
		
		if(Filter.Webadt != null && filter.Webadt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("WEBADT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Webadt);
		}
		
		if(Filter.Hlfl != null && filter.Hlfl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HLFL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hlfl);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		HomeleaveRecord data = (HomeleaveRecord)DataCollection.get(0);
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey));
		}
		
		if(EditFilter.IncludeLeavedt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LEAVEDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Leavedt));
		}
		
		if(EditFilter.IncludeLeavetm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LEAVETM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Leavetm));
		}
		
		if(EditFilter.IncludeExdt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EXDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Exdt));
		}
		
		if(EditFilter.IncludeExtm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EXTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Extm));
		}
		
		if(EditFilter.IncludeRescode)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rescode));
		}
		
		if(EditFilter.IncludeMors)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MORS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mors));
		}
		
		if(EditFilter.IncludeBtyp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("BTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Btyp));
		}
		
		if(EditFilter.IncludeReturndt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RETURNDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Returndt));
		}
		
		if(EditFilter.IncludeReturntm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RETURNTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Returntm));
		}
		
		if(EditFilter.IncludeCflup)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CFLUP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cflup));
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum));
		}
		
		if(EditFilter.IncludeDesc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Desc));
		}
		
		if(EditFilter.IncludeWebadt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("WEBADT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Webadt));
		}
		
		if(EditFilter.IncludeHlfl)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HLFL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hlfl));
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
			HomeleaveRecord record = new HomeleaveRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Leavedt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LEAVEDT"));
			record.Leavetm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LEAVETM"));
			record.Exdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXDT"));
			record.Extm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXTM"));
			record.Rescode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESCODE"));
			record.Mors = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MORS"));
			record.Btyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BTYP"));
			record.Returndt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RETURNDT"));
			record.Returntm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RETURNTM"));
			record.Cflup = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFLUP"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DESC"));
			record.Webadt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WEBADT"));
			record.Hlfl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HLFL"));
									
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
			HomeleaveRecord record = new HomeleaveRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Leavedt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LEAVEDT"));
			record.Leavetm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LEAVETM"));
			record.Exdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXDT"));
			record.Extm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXTM"));
			record.Rescode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESCODE"));
			record.Mors = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MORS"));
			record.Btyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BTYP"));
			record.Returndt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RETURNDT"));
			record.Returntm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RETURNTM"));
			record.Cflup = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFLUP"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DESC"));
			record.Webadt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WEBADT"));
			record.Hlfl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HLFL"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class HomeleaveCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			HomeleaveRecord newRecord = new HomeleaveRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(HomeleaveRecord record)
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
		public HomeleaveRecord get(int index)
		{
			return (HomeleaveRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class HomeleaveRecord
	{
		public String Pkey = "";
		public String Leavedt = "";
		public String Leavetm = "";
		public String Exdt = "";
		public String Extm = "";
		public String Rescode = "";
		public String Mors = "";
		public String Btyp = "";
		public String Returndt = "";
		public String Returntm = "";
		public String Cflup = "";
		public String Hospnum = "";
		public String Desc = "";
		public String Webadt = "";
		public String Hlfl = "";
				
		
		public void clear()
		{
			Pkey = "";
			Leavedt = "";
			Leavetm = "";
			Exdt = "";
			Extm = "";
			Rescode = "";
			Mors = "";
			Btyp = "";
			Returndt = "";
			Returntm = "";
			Cflup = "";
			Hospnum = "";
			Desc = "";
			Webadt = "";
			Hlfl = "";
			
		}		
	}
		
		
	public final class HomeleaveFilter
	{			
		public String Pkey = "";
		public String Leavedt = "";
		public String Leavetm = "";
		public String Exdt = "";
		public String Extm = "";
		public String Rescode = "";
		public String Mors = "";
		public String Btyp = "";
		public String Returndt = "";
		public String Returntm = "";
		public String Cflup = "";
		public String Hospnum = "";
		public String Desc = "";
		public String Webadt = "";
		public String Hlfl = "";
		
		public void clear()
		{				
			Pkey = "";
			Leavedt = "";
			Leavetm = "";
			Exdt = "";
			Extm = "";
			Rescode = "";
			Mors = "";
			Btyp = "";
			Returndt = "";
			Returntm = "";
			Cflup = "";
			Hospnum = "";
			Desc = "";
			Webadt = "";
			Hlfl = "";
		}	
		public HomeleaveFilter cloneObject()
		{
			HomeleaveFilter newFilter = new HomeleaveFilter();
			
			newFilter.Pkey = this.Pkey;
			newFilter.Leavedt = this.Leavedt;
			newFilter.Leavetm = this.Leavetm;
			newFilter.Exdt = this.Exdt;
			newFilter.Extm = this.Extm;
			newFilter.Rescode = this.Rescode;
			newFilter.Mors = this.Mors;
			newFilter.Btyp = this.Btyp;
			newFilter.Returndt = this.Returndt;
			newFilter.Returntm = this.Returntm;
			newFilter.Cflup = this.Cflup;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Desc = this.Desc;
			newFilter.Webadt = this.Webadt;
			newFilter.Hlfl = this.Hlfl;
			
			return newFilter;
		}
	}
	public final class HomeleaveEditFilter
	{			
		public boolean IncludePkey = true;
		public boolean IncludeLeavedt = true;
		public boolean IncludeLeavetm = true;
		public boolean IncludeExdt = true;
		public boolean IncludeExtm = true;
		public boolean IncludeRescode = true;
		public boolean IncludeMors = true;
		public boolean IncludeBtyp = true;
		public boolean IncludeReturndt = true;
		public boolean IncludeReturntm = true;
		public boolean IncludeCflup = true;
		public boolean IncludeHospnum = true;
		public boolean IncludeDesc = true;
		public boolean IncludeWebadt = true;
		public boolean IncludeHlfl = true;
		
		public void includeAll()
		{				
			IncludePkey = true;
			IncludeLeavedt = true;
			IncludeLeavetm = true;
			IncludeExdt = true;
			IncludeExtm = true;
			IncludeRescode = true;
			IncludeMors = true;
			IncludeBtyp = true;
			IncludeReturndt = true;
			IncludeReturntm = true;
			IncludeCflup = true;
			IncludeHospnum = true;
			IncludeDesc = true;
			IncludeWebadt = true;
			IncludeHlfl = true;
		}	
		public void excludeAll()
		{				
			IncludePkey = false;
			IncludeLeavedt = false;
			IncludeLeavetm = false;
			IncludeExdt = false;
			IncludeExtm = false;
			IncludeRescode = false;
			IncludeMors = false;
			IncludeBtyp = false;
			IncludeReturndt = false;
			IncludeReturntm = false;
			IncludeCflup = false;
			IncludeHospnum = false;
			IncludeDesc = false;
			IncludeWebadt = false;
			IncludeHlfl = false;
		}
		public HomeleaveEditFilter cloneObject()
		{
			HomeleaveEditFilter newEditFilter = new HomeleaveEditFilter();
			
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeLeavedt = this.IncludeLeavedt;
			newEditFilter.IncludeLeavetm = this.IncludeLeavetm;
			newEditFilter.IncludeExdt = this.IncludeExdt;
			newEditFilter.IncludeExtm = this.IncludeExtm;
			newEditFilter.IncludeRescode = this.IncludeRescode;
			newEditFilter.IncludeMors = this.IncludeMors;
			newEditFilter.IncludeBtyp = this.IncludeBtyp;
			newEditFilter.IncludeReturndt = this.IncludeReturndt;
			newEditFilter.IncludeReturntm = this.IncludeReturntm;
			newEditFilter.IncludeCflup = this.IncludeCflup;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeDesc = this.IncludeDesc;
			newEditFilter.IncludeWebadt = this.IncludeWebadt;
			newEditFilter.IncludeHlfl = this.IncludeHlfl;
			
			return newEditFilter;
		}
	}
}
