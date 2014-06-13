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
// Template ver. 1.1.1 - Last modified on 15/11/2004 10:30 by Marius Mihalec

package ims.dto.client;

public final class Lkup implements ims.vo.ImsCloneable
{
	private LkupFilter lastGetFilter = null;
	private final String serviceName = "LKUP";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public LkupFilter Filter = new LkupFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public LkupEditFilter EditFilter = new LkupEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public LkupCollection DataCollection = new LkupCollection();

	/**
	 * Creates a new Lkup Data Transfer Object.
	 */ 
	public Lkup(ims.dto.Connection connection)
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
	public Lkup cloneObject()
	{
		Lkup cloneObject = new Lkup(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Lkup_id = DataCollection.get(x).Lkup_id;
			cloneObject.DataCollection.get(index).Lkup_typ = DataCollection.get(x).Lkup_typ;
			cloneObject.DataCollection.get(index).Lkup_nm = DataCollection.get(x).Lkup_nm;
			cloneObject.DataCollection.get(index).Lkup_desc = DataCollection.get(x).Lkup_desc;
			cloneObject.DataCollection.get(index).Lkup_stat = DataCollection.get(x).Lkup_stat;
			cloneObject.DataCollection.get(index).Lkup_parent = DataCollection.get(x).Lkup_parent;
			cloneObject.DataCollection.get(index).Lkup_order = DataCollection.get(x).Lkup_order;
			cloneObject.DataCollection.get(index).Lkup_srcc = DataCollection.get(x).Lkup_srcc;
			cloneObject.DataCollection.get(index).Lkup_srct = DataCollection.get(x).Lkup_srct;
			cloneObject.DataCollection.get(index).Lkup_tblname = DataCollection.get(x).Lkup_tblname;
			cloneObject.DataCollection.get(index).Lkup_cmds = DataCollection.get(x).Lkup_cmds;
			cloneObject.DataCollection.get(index).Lkup_haschild = DataCollection.get(x).Lkup_haschild;
			cloneObject.DataCollection.get(index).Lkup_inactfilter = DataCollection.get(x).Lkup_inactfilter;
			cloneObject.DataCollection.get(index).Lkup_users_list = DataCollection.get(x).Lkup_users_list;
			cloneObject.DataCollection.get(index).Lkup_global_list = DataCollection.get(x).Lkup_global_list;
			cloneObject.DataCollection.get(index).Lkup_onglobal = DataCollection.get(x).Lkup_onglobal;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.2 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Lkup.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkup.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Lkup.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkup.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkup.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkup.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Lkup.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Lkup.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkup.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Lkup.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Lkup.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Lkup.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Lkup.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Lkup.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkup.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Lkup.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Lkup.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Lkup.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Lkup.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Lkup.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkup.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Lkup.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Lkup.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkup.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Lkup.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Lkup.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Lkup.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkup.List");
							
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
	private String encodeNASFilter(LkupFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Lkup_id != null && filter.Lkup_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_id;
		}
		
		if(Filter.Lkup_typ != null && filter.Lkup_typ.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_typ;
		}
		
		if(Filter.Lkup_nm != null && filter.Lkup_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_nm;
		}
		
		if(Filter.Lkup_desc != null && filter.Lkup_desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_desc;
		}
		
		if(Filter.Lkup_stat != null && filter.Lkup_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_stat;
		}
		
		if(Filter.Lkup_parent != null && filter.Lkup_parent.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_PARENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_parent;
		}
		
		if(Filter.Lkup_order != null && filter.Lkup_order.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_ORDER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_order;
		}
		
		if(Filter.Lkup_srcc != null && filter.Lkup_srcc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_SRCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_srcc;
		}
		
		if(Filter.Lkup_srct != null && filter.Lkup_srct.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_SRCT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_srct;
		}
		
		if(Filter.Lkup_tblname != null && filter.Lkup_tblname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_TBLNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_tblname;
		}
		
		if(Filter.Lkup_cmds != null && filter.Lkup_cmds.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_CMDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_cmds;
		}
		
		if(Filter.Lkup_haschild != null && filter.Lkup_haschild.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_HASCHILD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_haschild;
		}
		
		if(Filter.Lkup_inactfilter != null && filter.Lkup_inactfilter.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_INACTFILTER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_inactfilter;
		}
		
		if(Filter.Lkup_users_list != null && filter.Lkup_users_list.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_USERS_LIST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_users_list;
		}
		
		if(Filter.Lkup_global_list != null && filter.Lkup_global_list.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_GLOBAL_LIST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_global_list;
		}
		
		if(Filter.Lkup_onglobal != null && filter.Lkup_onglobal.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LKUP_ONGLOBAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkup_onglobal;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		LkupRecord data = (LkupRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeLkup_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_id);
		}
		
		if(EditFilter.IncludeLkup_typ)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_typ);
		}
		
		if(EditFilter.IncludeLkup_nm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_nm);
		}
		
		if(EditFilter.IncludeLkup_desc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_desc);
		}
		
		if(EditFilter.IncludeLkup_stat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_stat);
		}
		
		if(EditFilter.IncludeLkup_parent)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_PARENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_parent);
		}
		
		if(EditFilter.IncludeLkup_order)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_ORDER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_order);
		}
		
		if(EditFilter.IncludeLkup_srcc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_SRCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_srcc);
		}
		
		if(EditFilter.IncludeLkup_srct)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_SRCT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_srct);
		}
		
		if(EditFilter.IncludeLkup_tblname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_TBLNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_tblname);
		}
		
		if(EditFilter.IncludeLkup_cmds)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_CMDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_cmds);
		}
		
		if(EditFilter.IncludeLkup_haschild)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_HASCHILD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_haschild);
		}
		
		if(EditFilter.IncludeLkup_inactfilter)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_INACTFILTER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_inactfilter);
		}
		
		if(EditFilter.IncludeLkup_users_list)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_USERS_LIST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_users_list);
		}
		
		if(EditFilter.IncludeLkup_global_list)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_GLOBAL_LIST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_global_list);
		}
		
		if(EditFilter.IncludeLkup_onglobal)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LKUP_ONGLOBAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkup_onglobal);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
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
			LkupRecord record = new LkupRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Lkup_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_ID"));
			record.Lkup_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_TYP"));
			record.Lkup_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_NM"));
			record.Lkup_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_DESC"));
			record.Lkup_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_STAT"));
			record.Lkup_parent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_PARENT"));
			record.Lkup_order = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_ORDER"));
			record.Lkup_srcc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_SRCC"));
			record.Lkup_srct = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_SRCT"));
			record.Lkup_tblname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_TBLNAME"));
			record.Lkup_cmds = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_CMDS"));
			record.Lkup_haschild = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_HASCHILD"));
			record.Lkup_inactfilter = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_INACTFILTER"));
			record.Lkup_users_list = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_USERS_LIST"));
			record.Lkup_global_list = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_GLOBAL_LIST"));
			record.Lkup_onglobal = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_ONGLOBAL"));
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
			LkupRecord record = new LkupRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Lkup_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_ID"));
			record.Lkup_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_TYP"));
			record.Lkup_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_NM"));
			record.Lkup_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_DESC"));
			record.Lkup_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_STAT"));
			record.Lkup_parent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_PARENT"));
			record.Lkup_order = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_ORDER"));
			record.Lkup_srcc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_SRCC"));
			record.Lkup_srct = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_SRCT"));
			record.Lkup_tblname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_TBLNAME"));
			record.Lkup_cmds = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_CMDS"));
			record.Lkup_haschild = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_HASCHILD"));
			record.Lkup_inactfilter = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_INACTFILTER"));
			record.Lkup_users_list = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_USERS_LIST"));
			record.Lkup_global_list = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_GLOBAL_LIST"));
			record.Lkup_onglobal = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKUP_ONGLOBAL"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class LkupCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			LkupRecord newRecord = new LkupRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(LkupRecord record)
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
		public LkupRecord get(int index)
		{
			return (LkupRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class LkupRecord
	{
		public String Lkup_id = "";
		public String Lkup_typ = "";
		public String Lkup_nm = "";
		public String Lkup_desc = "";
		public String Lkup_stat = "";
		public String Lkup_parent = "";
		public String Lkup_order = "";
		public String Lkup_srcc = "";
		public String Lkup_srct = "";
		public String Lkup_tblname = "";
		public String Lkup_cmds = "";
		public String Lkup_haschild = "";
		public String Lkup_inactfilter = "";
		public String Lkup_users_list = "";
		public String Lkup_global_list = "";
		public String Lkup_onglobal = "";
		public String Tstp = "";
				
		
		public void clear()
		{
			Lkup_id = "";
			Lkup_typ = "";
			Lkup_nm = "";
			Lkup_desc = "";
			Lkup_stat = "";
			Lkup_parent = "";
			Lkup_order = "";
			Lkup_srcc = "";
			Lkup_srct = "";
			Lkup_tblname = "";
			Lkup_cmds = "";
			Lkup_haschild = "";
			Lkup_inactfilter = "";
			Lkup_users_list = "";
			Lkup_global_list = "";
			Lkup_onglobal = "";
			Tstp = "";
			
		}		
	}
		
		
	public final class LkupFilter
	{			
		public String Lkup_id = "";
		public String Lkup_typ = "";
		public String Lkup_nm = "";
		public String Lkup_desc = "";
		public String Lkup_stat = "";
		public String Lkup_parent = "";
		public String Lkup_order = "";
		public String Lkup_srcc = "";
		public String Lkup_srct = "";
		public String Lkup_tblname = "";
		public String Lkup_cmds = "";
		public String Lkup_haschild = "";
		public String Lkup_inactfilter = "";
		public String Lkup_users_list = "";
		public String Lkup_global_list = "";
		public String Lkup_onglobal = "";
		public String Tstp = "";
		
		public void clear()
		{				
			Lkup_id = "";
			Lkup_typ = "";
			Lkup_nm = "";
			Lkup_desc = "";
			Lkup_stat = "";
			Lkup_parent = "";
			Lkup_order = "";
			Lkup_srcc = "";
			Lkup_srct = "";
			Lkup_tblname = "";
			Lkup_cmds = "";
			Lkup_haschild = "";
			Lkup_inactfilter = "";
			Lkup_users_list = "";
			Lkup_global_list = "";
			Lkup_onglobal = "";
			Tstp = "";
		}	
		public LkupFilter cloneObject()
		{
			LkupFilter newFilter = new LkupFilter();
			
			newFilter.Lkup_id = this.Lkup_id;
			newFilter.Lkup_typ = this.Lkup_typ;
			newFilter.Lkup_nm = this.Lkup_nm;
			newFilter.Lkup_desc = this.Lkup_desc;
			newFilter.Lkup_stat = this.Lkup_stat;
			newFilter.Lkup_parent = this.Lkup_parent;
			newFilter.Lkup_order = this.Lkup_order;
			newFilter.Lkup_srcc = this.Lkup_srcc;
			newFilter.Lkup_srct = this.Lkup_srct;
			newFilter.Lkup_tblname = this.Lkup_tblname;
			newFilter.Lkup_cmds = this.Lkup_cmds;
			newFilter.Lkup_haschild = this.Lkup_haschild;
			newFilter.Lkup_inactfilter = this.Lkup_inactfilter;
			newFilter.Lkup_users_list = this.Lkup_users_list;
			newFilter.Lkup_global_list = this.Lkup_global_list;
			newFilter.Lkup_onglobal = this.Lkup_onglobal;
			newFilter.Tstp = this.Tstp;
			
			return newFilter;
		}
	}
	public final class LkupEditFilter
	{			
		public boolean IncludeLkup_id = true;
		public boolean IncludeLkup_typ = true;
		public boolean IncludeLkup_nm = true;
		public boolean IncludeLkup_desc = true;
		public boolean IncludeLkup_stat = true;
		public boolean IncludeLkup_parent = true;
		public boolean IncludeLkup_order = true;
		public boolean IncludeLkup_srcc = true;
		public boolean IncludeLkup_srct = true;
		public boolean IncludeLkup_tblname = true;
		public boolean IncludeLkup_cmds = true;
		public boolean IncludeLkup_haschild = true;
		public boolean IncludeLkup_inactfilter = true;
		public boolean IncludeLkup_users_list = true;
		public boolean IncludeLkup_global_list = true;
		public boolean IncludeLkup_onglobal = true;
		public boolean IncludeTstp = true;
		
		public void includeAll()
		{				
			IncludeLkup_id = true;
			IncludeLkup_typ = true;
			IncludeLkup_nm = true;
			IncludeLkup_desc = true;
			IncludeLkup_stat = true;
			IncludeLkup_parent = true;
			IncludeLkup_order = true;
			IncludeLkup_srcc = true;
			IncludeLkup_srct = true;
			IncludeLkup_tblname = true;
			IncludeLkup_cmds = true;
			IncludeLkup_haschild = true;
			IncludeLkup_inactfilter = true;
			IncludeLkup_users_list = true;
			IncludeLkup_global_list = true;
			IncludeLkup_onglobal = true;
			IncludeTstp = true;
		}	
		public void excludeAll()
		{				
			IncludeLkup_id = false;
			IncludeLkup_typ = false;
			IncludeLkup_nm = false;
			IncludeLkup_desc = false;
			IncludeLkup_stat = false;
			IncludeLkup_parent = false;
			IncludeLkup_order = false;
			IncludeLkup_srcc = false;
			IncludeLkup_srct = false;
			IncludeLkup_tblname = false;
			IncludeLkup_cmds = false;
			IncludeLkup_haschild = false;
			IncludeLkup_inactfilter = false;
			IncludeLkup_users_list = false;
			IncludeLkup_global_list = false;
			IncludeLkup_onglobal = false;
			IncludeTstp = false;
		}
		public LkupEditFilter cloneObject()
		{
			LkupEditFilter newEditFilter = new LkupEditFilter();
			
			newEditFilter.IncludeLkup_id = this.IncludeLkup_id;
			newEditFilter.IncludeLkup_typ = this.IncludeLkup_typ;
			newEditFilter.IncludeLkup_nm = this.IncludeLkup_nm;
			newEditFilter.IncludeLkup_desc = this.IncludeLkup_desc;
			newEditFilter.IncludeLkup_stat = this.IncludeLkup_stat;
			newEditFilter.IncludeLkup_parent = this.IncludeLkup_parent;
			newEditFilter.IncludeLkup_order = this.IncludeLkup_order;
			newEditFilter.IncludeLkup_srcc = this.IncludeLkup_srcc;
			newEditFilter.IncludeLkup_srct = this.IncludeLkup_srct;
			newEditFilter.IncludeLkup_tblname = this.IncludeLkup_tblname;
			newEditFilter.IncludeLkup_cmds = this.IncludeLkup_cmds;
			newEditFilter.IncludeLkup_haschild = this.IncludeLkup_haschild;
			newEditFilter.IncludeLkup_inactfilter = this.IncludeLkup_inactfilter;
			newEditFilter.IncludeLkup_users_list = this.IncludeLkup_users_list;
			newEditFilter.IncludeLkup_global_list = this.IncludeLkup_global_list;
			newEditFilter.IncludeLkup_onglobal = this.IncludeLkup_onglobal;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			
			return newEditFilter;
		}
	}
}
