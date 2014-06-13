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
// Template ver. 1.1.0 - Last modified on 04/10/2004 11:00 by Marius Mihalec

package ims.dto.client;

public final class Clinical_team implements ims.vo.ImsCloneable
{
	private Clinical_teamFilter lastGetFilter = null;
	private final String serviceName = "CLINICAL_TEAM";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Clinical_teamFilter Filter = new Clinical_teamFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Clinical_teamEditFilter EditFilter = new Clinical_teamEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Clinical_teamCollection DataCollection = new Clinical_teamCollection();

	/**
	 * Creates a new Clinical_team Data Transfer Object.
	 */ 
	public Clinical_team(ims.dto.Connection connection)
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
	public Clinical_team cloneObject()
	{
		Clinical_team cloneObject = new Clinical_team(Connection);
			
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
			cloneObject.DataCollection.get(index).Cons_firm_id = DataCollection.get(x).Cons_firm_id;
			cloneObject.DataCollection.get(index).Hcp_id = DataCollection.get(x).Hcp_id;
			cloneObject.DataCollection.get(index).Team_role_id = DataCollection.get(x).Team_role_id;
			cloneObject.DataCollection.get(index).Sdate = DataCollection.get(x).Sdate;
			cloneObject.DataCollection.get(index).Edate = DataCollection.get(x).Edate;
			cloneObject.DataCollection.get(index).Accred = DataCollection.get(x).Accred;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).Inactfilter = DataCollection.get(x).Inactfilter;
			cloneObject.DataCollection.get(index).Hcp_surname = DataCollection.get(x).Hcp_surname;
			cloneObject.DataCollection.get(index).Hcp_txt = DataCollection.get(x).Hcp_txt;
			cloneObject.DataCollection.get(index).Hcpaddr1 = DataCollection.get(x).Hcpaddr1;
			cloneObject.DataCollection.get(index).Hcpaddr2 = DataCollection.get(x).Hcpaddr2;
			cloneObject.DataCollection.get(index).Team_roletxt = DataCollection.get(x).Team_roletxt;
			cloneObject.DataCollection.get(index).Accredtxt = DataCollection.get(x).Accredtxt;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.4 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Clinical_team.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Clinical_team.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Clinical_team.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Clinical_team.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Clinical_team.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Clinical_team.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Clinical_team.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Clinical_team.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Clinical_team.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Clinical_team.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Clinical_team.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Clinical_team.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Clinical_team.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Clinical_team.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Clinical_team.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Clinical_team.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Clinical_team.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Clinical_team.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Clinical_team.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Clinical_team.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Clinical_team.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Clinical_team.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Clinical_team.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Clinical_team.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Clinical_team.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Clinical_team.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Clinical_team.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Clinical_team.List");
							
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
	private String encodeNASFilter(Clinical_teamFilter filter)
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
		
		if(Filter.Cons_firm_id != null && filter.Cons_firm_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONS_FIRM_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cons_firm_id;
		}
		
		if(Filter.Hcp_id != null && filter.Hcp_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_id;
		}
		
		if(Filter.Team_role_id != null && filter.Team_role_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TEAM_ROLE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Team_role_id;
		}
		
		if(Filter.Sdate != null && filter.Sdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sdate;
		}
		
		if(Filter.Edate != null && filter.Edate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Edate;
		}
		
		if(Filter.Accred != null && filter.Accred.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACCRED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Accred;
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat;
		}
		
		if(Filter.Inactfilter != null && filter.Inactfilter.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INACTFILTER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Inactfilter;
		}
		
		if(Filter.Hcp_surname != null && filter.Hcp_surname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCP_SURNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_surname;
		}
		
		if(Filter.Hcp_txt != null && filter.Hcp_txt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCP_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcp_txt;
		}
		
		if(Filter.Hcpaddr1 != null && filter.Hcpaddr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPADDR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpaddr1;
		}
		
		if(Filter.Hcpaddr2 != null && filter.Hcpaddr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPADDR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpaddr2;
		}
		
		if(Filter.Team_roletxt != null && filter.Team_roletxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TEAM_ROLETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Team_roletxt;
		}
		
		if(Filter.Accredtxt != null && filter.Accredtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACCREDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Accredtxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Clinical_teamRecord data = (Clinical_teamRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeUnid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unid);
		}
		
		if(EditFilter.IncludeCons_firm_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONS_FIRM_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cons_firm_id);
		}
		
		if(EditFilter.IncludeHcp_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_id);
		}
		
		if(EditFilter.IncludeTeam_role_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TEAM_ROLE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Team_role_id);
		}
		
		if(EditFilter.IncludeSdate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sdate);
		}
		
		if(EditFilter.IncludeEdate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Edate);
		}
		
		if(EditFilter.IncludeAccred)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACCRED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Accred);
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat);
		}
		
		if(EditFilter.IncludeInactfilter)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INACTFILTER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Inactfilter);
		}
		
		if(EditFilter.IncludeHcp_surname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCP_SURNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_surname);
		}
		
		if(EditFilter.IncludeHcp_txt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCP_TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcp_txt);
		}
		
		if(EditFilter.IncludeHcpaddr1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPADDR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpaddr1);
		}
		
		if(EditFilter.IncludeHcpaddr2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPADDR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpaddr2);
		}
		
		if(EditFilter.IncludeTeam_roletxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TEAM_ROLETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Team_roletxt);
		}
		
		if(EditFilter.IncludeAccredtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACCREDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Accredtxt);
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
			Clinical_teamRecord record = new Clinical_teamRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Cons_firm_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONS_FIRM_ID"));
			record.Hcp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_ID"));
			record.Team_role_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEAM_ROLE_ID"));
			record.Sdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SDATE"));
			record.Edate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EDATE"));
			record.Accred = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACCRED"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Inactfilter = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INACTFILTER"));
			record.Hcp_surname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_SURNAME"));
			record.Hcp_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_TXT"));
			record.Hcpaddr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPADDR1"));
			record.Hcpaddr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPADDR2"));
			record.Team_roletxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEAM_ROLETXT"));
			record.Accredtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACCREDTXT"));
									
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
			Clinical_teamRecord record = new Clinical_teamRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Cons_firm_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONS_FIRM_ID"));
			record.Hcp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_ID"));
			record.Team_role_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEAM_ROLE_ID"));
			record.Sdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SDATE"));
			record.Edate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EDATE"));
			record.Accred = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACCRED"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Inactfilter = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INACTFILTER"));
			record.Hcp_surname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_SURNAME"));
			record.Hcp_txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCP_TXT"));
			record.Hcpaddr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPADDR1"));
			record.Hcpaddr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPADDR2"));
			record.Team_roletxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEAM_ROLETXT"));
			record.Accredtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACCREDTXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Clinical_teamCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Clinical_teamRecord newRecord = new Clinical_teamRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Clinical_teamRecord record)
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
		public Clinical_teamRecord get(int index)
		{
			return (Clinical_teamRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Clinical_teamRecord
	{
		public String Unid = "";
		public String Cons_firm_id = "";
		public String Hcp_id = "";
		public String Team_role_id = "";
		public String Sdate = "";
		public String Edate = "";
		public String Accred = "";
		public String Stat = "";
		public String Inactfilter = "";
		public String Hcp_surname = "";
		public String Hcp_txt = "";
		public String Hcpaddr1 = "";
		public String Hcpaddr2 = "";
		public String Team_roletxt = "";
		public String Accredtxt = "";
				
		
		public void clear()
		{
			Unid = "";
			Cons_firm_id = "";
			Hcp_id = "";
			Team_role_id = "";
			Sdate = "";
			Edate = "";
			Accred = "";
			Stat = "";
			Inactfilter = "";
			Hcp_surname = "";
			Hcp_txt = "";
			Hcpaddr1 = "";
			Hcpaddr2 = "";
			Team_roletxt = "";
			Accredtxt = "";
			
		}		
	}
		
		
	public final class Clinical_teamFilter
	{			
		public String Unid = "";
		public String Cons_firm_id = "";
		public String Hcp_id = "";
		public String Team_role_id = "";
		public String Sdate = "";
		public String Edate = "";
		public String Accred = "";
		public String Stat = "";
		public String Inactfilter = "";
		public String Hcp_surname = "";
		public String Hcp_txt = "";
		public String Hcpaddr1 = "";
		public String Hcpaddr2 = "";
		public String Team_roletxt = "";
		public String Accredtxt = "";
		
		public void clear()
		{				
			Unid = "";
			Cons_firm_id = "";
			Hcp_id = "";
			Team_role_id = "";
			Sdate = "";
			Edate = "";
			Accred = "";
			Stat = "";
			Inactfilter = "";
			Hcp_surname = "";
			Hcp_txt = "";
			Hcpaddr1 = "";
			Hcpaddr2 = "";
			Team_roletxt = "";
			Accredtxt = "";
		}	
		public Clinical_teamFilter cloneObject()
		{
			Clinical_teamFilter newFilter = new Clinical_teamFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Cons_firm_id = this.Cons_firm_id;
			newFilter.Hcp_id = this.Hcp_id;
			newFilter.Team_role_id = this.Team_role_id;
			newFilter.Sdate = this.Sdate;
			newFilter.Edate = this.Edate;
			newFilter.Accred = this.Accred;
			newFilter.Stat = this.Stat;
			newFilter.Inactfilter = this.Inactfilter;
			newFilter.Hcp_surname = this.Hcp_surname;
			newFilter.Hcp_txt = this.Hcp_txt;
			newFilter.Hcpaddr1 = this.Hcpaddr1;
			newFilter.Hcpaddr2 = this.Hcpaddr2;
			newFilter.Team_roletxt = this.Team_roletxt;
			newFilter.Accredtxt = this.Accredtxt;
			
			return newFilter;
		}
	}
	public final class Clinical_teamEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludeCons_firm_id = true;
		public boolean IncludeHcp_id = true;
		public boolean IncludeTeam_role_id = true;
		public boolean IncludeSdate = true;
		public boolean IncludeEdate = true;
		public boolean IncludeAccred = true;
		public boolean IncludeStat = true;
		public boolean IncludeInactfilter = true;
		public boolean IncludeHcp_surname = true;
		public boolean IncludeHcp_txt = true;
		public boolean IncludeHcpaddr1 = true;
		public boolean IncludeHcpaddr2 = true;
		public boolean IncludeTeam_roletxt = true;
		public boolean IncludeAccredtxt = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludeCons_firm_id = true;
			IncludeHcp_id = true;
			IncludeTeam_role_id = true;
			IncludeSdate = true;
			IncludeEdate = true;
			IncludeAccred = true;
			IncludeStat = true;
			IncludeInactfilter = true;
			IncludeHcp_surname = true;
			IncludeHcp_txt = true;
			IncludeHcpaddr1 = true;
			IncludeHcpaddr2 = true;
			IncludeTeam_roletxt = true;
			IncludeAccredtxt = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludeCons_firm_id = false;
			IncludeHcp_id = false;
			IncludeTeam_role_id = false;
			IncludeSdate = false;
			IncludeEdate = false;
			IncludeAccred = false;
			IncludeStat = false;
			IncludeInactfilter = false;
			IncludeHcp_surname = false;
			IncludeHcp_txt = false;
			IncludeHcpaddr1 = false;
			IncludeHcpaddr2 = false;
			IncludeTeam_roletxt = false;
			IncludeAccredtxt = false;
		}
		public Clinical_teamEditFilter cloneObject()
		{
			Clinical_teamEditFilter newEditFilter = new Clinical_teamEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludeCons_firm_id = this.IncludeCons_firm_id;
			newEditFilter.IncludeHcp_id = this.IncludeHcp_id;
			newEditFilter.IncludeTeam_role_id = this.IncludeTeam_role_id;
			newEditFilter.IncludeSdate = this.IncludeSdate;
			newEditFilter.IncludeEdate = this.IncludeEdate;
			newEditFilter.IncludeAccred = this.IncludeAccred;
			newEditFilter.IncludeStat = this.IncludeStat;
			newEditFilter.IncludeInactfilter = this.IncludeInactfilter;
			newEditFilter.IncludeHcp_surname = this.IncludeHcp_surname;
			newEditFilter.IncludeHcp_txt = this.IncludeHcp_txt;
			newEditFilter.IncludeHcpaddr1 = this.IncludeHcpaddr1;
			newEditFilter.IncludeHcpaddr2 = this.IncludeHcpaddr2;
			newEditFilter.IncludeTeam_roletxt = this.IncludeTeam_roletxt;
			newEditFilter.IncludeAccredtxt = this.IncludeAccredtxt;
			
			return newEditFilter;
		}
	}
}
