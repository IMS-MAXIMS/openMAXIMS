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
// Template ver. 1.0.9 - Last modified on 20/09/2004 11:20 by Marius Mihalec

package ims.dto.client;

public final class Onc_diaginvest implements ims.vo.ImsCloneable
{
	private Onc_diaginvestFilter lastGetFilter = null;
	private final String serviceName = "ONC_DIAGINVEST";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Onc_diaginvestFilter Filter = new Onc_diaginvestFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Onc_diaginvestEditFilter EditFilter = new Onc_diaginvestEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Onc_diaginvestCollection DataCollection = new Onc_diaginvestCollection();

	/**
	 * Creates a new Onc_diaginvest Data Transfer Object.
	 */ 
	public Onc_diaginvest(ims.dto.Connection connection)
	{	
		this.Connection = connection;
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
	public Onc_diaginvest cloneObject()
	{
		Onc_diaginvest cloneObject = new Onc_diaginvest(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Onc_invest_id = DataCollection.get(x).Onc_invest_id;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Rhcp = DataCollection.get(x).Rhcp;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Uhcp = DataCollection.get(x).Uhcp;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Modu = DataCollection.get(x).Modu;
			cloneObject.DataCollection.get(index).Ccs_epid = DataCollection.get(x).Ccs_epid;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Invtype = DataCollection.get(x).Invtype;
			cloneObject.DataCollection.get(index).Invhosp = DataCollection.get(x).Invhosp;
			cloneObject.DataCollection.get(index).Invcons = DataCollection.get(x).Invcons;
			cloneObject.DataCollection.get(index).Invdate = DataCollection.get(x).Invdate;
			cloneObject.DataCollection.get(index).Invmodality = DataCollection.get(x).Invmodality;
			cloneObject.DataCollection.get(index).Invsite = DataCollection.get(x).Invsite;
			cloneObject.DataCollection.get(index).Invresdate = DataCollection.get(x).Invresdate;
			cloneObject.DataCollection.get(index).Invres = DataCollection.get(x).Invres;
			cloneObject.DataCollection.get(index).Invmodtxt = DataCollection.get(x).Invmodtxt;
			cloneObject.DataCollection.get(index).Invsitetxt = DataCollection.get(x).Invsitetxt;
			cloneObject.DataCollection.get(index).Invrestxt = DataCollection.get(x).Invrestxt;
							
			
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
		return "Onc_diaginvest.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_diaginvest.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Onc_diaginvest.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_diaginvest.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_diaginvest.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_diaginvest.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Onc_diaginvest.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Onc_diaginvest.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_diaginvest.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Onc_diaginvest.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Onc_diaginvest.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Onc_diaginvest.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Onc_diaginvest.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Onc_diaginvest.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_diaginvest.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Onc_diaginvest.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Onc_diaginvest.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Onc_diaginvest.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Onc_diaginvest.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Onc_diaginvest.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_diaginvest.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Onc_diaginvest.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Onc_diaginvest.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_diaginvest.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Onc_diaginvest.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Onc_diaginvest.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Onc_diaginvest.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_diaginvest.List");
							
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
	private String encodeNASFilter(Onc_diaginvestFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Onc_invest_id != null && filter.Onc_invest_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ONC_INVEST_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Onc_invest_id;
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey;
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
		
		if(Filter.Rhcp != null && filter.Rhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rhcp;
		}
		
		if(Filter.Rusr != null && filter.Rusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusr;
		}
		
		if(Filter.Udat != null && filter.Udat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Udat;
		}
		
		if(Filter.Utim != null && filter.Utim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Utim;
		}
		
		if(Filter.Uhcp != null && filter.Uhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uhcp;
		}
		
		if(Filter.Uusr != null && filter.Uusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uusr;
		}
		
		if(Filter.Cdat != null && filter.Cdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cdat;
		}
		
		if(Filter.Ctim != null && filter.Ctim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ctim;
		}
		
		if(Filter.Modu != null && filter.Modu.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modu;
		}
		
		if(Filter.Ccs_epid != null && filter.Ccs_epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccs_epid;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Invtype != null && filter.Invtype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INVTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Invtype;
		}
		
		if(Filter.Invhosp != null && filter.Invhosp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INVHOSP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Invhosp;
		}
		
		if(Filter.Invcons != null && filter.Invcons.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INVCONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Invcons;
		}
		
		if(Filter.Invdate != null && filter.Invdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INVDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Invdate;
		}
		
		if(Filter.Invmodality != null && filter.Invmodality.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INVMODALITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Invmodality;
		}
		
		if(Filter.Invsite != null && filter.Invsite.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INVSITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Invsite;
		}
		
		if(Filter.Invresdate != null && filter.Invresdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INVRESDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Invresdate;
		}
		
		if(Filter.Invres != null && filter.Invres.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INVRES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Invres;
		}
		
		if(Filter.Invmodtxt != null && filter.Invmodtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INVMODTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Invmodtxt;
		}
		
		if(Filter.Invsitetxt != null && filter.Invsitetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INVSITETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Invsitetxt;
		}
		
		if(Filter.Invrestxt != null && filter.Invrestxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INVRESTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Invrestxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Onc_diaginvestRecord data = (Onc_diaginvestRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeOnc_invest_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ONC_INVEST_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Onc_invest_id);
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
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
		
		if(EditFilter.IncludeRhcp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rhcp);
		}
		
		if(EditFilter.IncludeRusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusr);
		}
		
		if(EditFilter.IncludeUdat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Udat);
		}
		
		if(EditFilter.IncludeUtim)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Utim);
		}
		
		if(EditFilter.IncludeUhcp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uhcp);
		}
		
		if(EditFilter.IncludeUusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uusr);
		}
		
		if(EditFilter.IncludeCdat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cdat);
		}
		
		if(EditFilter.IncludeCtim)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ctim);
		}
		
		if(EditFilter.IncludeModu)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modu);
		}
		
		if(EditFilter.IncludeCcs_epid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccs_epid);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeInvtype)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INVTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Invtype);
		}
		
		if(EditFilter.IncludeInvhosp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INVHOSP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Invhosp);
		}
		
		if(EditFilter.IncludeInvcons)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INVCONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Invcons);
		}
		
		if(EditFilter.IncludeInvdate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INVDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Invdate);
		}
		
		if(EditFilter.IncludeInvmodality)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INVMODALITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Invmodality);
		}
		
		if(EditFilter.IncludeInvsite)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INVSITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Invsite);
		}
		
		if(EditFilter.IncludeInvresdate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INVRESDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Invresdate);
		}
		
		if(EditFilter.IncludeInvres)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INVRES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Invres);
		}
		
		if(EditFilter.IncludeInvmodtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INVMODTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Invmodtxt);
		}
		
		if(EditFilter.IncludeInvsitetxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INVSITETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Invsitetxt);
		}
		
		if(EditFilter.IncludeInvrestxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INVRESTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Invrestxt);
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
			Onc_diaginvestRecord record = new Onc_diaginvestRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Onc_invest_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONC_INVEST_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Invtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVTYPE"));
			record.Invhosp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVHOSP"));
			record.Invcons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVCONS"));
			record.Invdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVDATE"));
			record.Invmodality = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVMODALITY"));
			record.Invsite = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVSITE"));
			record.Invresdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVRESDATE"));
			record.Invres = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVRES"));
			record.Invmodtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVMODTXT"));
			record.Invsitetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVSITETXT"));
			record.Invrestxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVRESTXT"));
									
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
			Onc_diaginvestRecord record = new Onc_diaginvestRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Onc_invest_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONC_INVEST_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Invtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVTYPE"));
			record.Invhosp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVHOSP"));
			record.Invcons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVCONS"));
			record.Invdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVDATE"));
			record.Invmodality = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVMODALITY"));
			record.Invsite = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVSITE"));
			record.Invresdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVRESDATE"));
			record.Invres = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVRES"));
			record.Invmodtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVMODTXT"));
			record.Invsitetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVSITETXT"));
			record.Invrestxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INVRESTXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Onc_diaginvestCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_diaginvestRecord newRecord = new Onc_diaginvestRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_diaginvestRecord record)
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
		public Onc_diaginvestRecord get(int index)
		{
			return (Onc_diaginvestRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Onc_diaginvestRecord
	{
		public String Onc_invest_id = "";
		public String Pkey = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Modu = "";
		public String Ccs_epid = "";
		public String Tstp = "";
		public String Invtype = "";
		public String Invhosp = "";
		public String Invcons = "";
		public String Invdate = "";
		public String Invmodality = "";
		public String Invsite = "";
		public String Invresdate = "";
		public String Invres = "";
		public String Invmodtxt = "";
		public String Invsitetxt = "";
		public String Invrestxt = "";
				
		
		public void clear()
		{
			Onc_invest_id = "";
			Pkey = "";
			Rdat = "";
			Rtim = "";
			Rhcp = "";
			Rusr = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Uusr = "";
			Cdat = "";
			Ctim = "";
			Modu = "";
			Ccs_epid = "";
			Tstp = "";
			Invtype = "";
			Invhosp = "";
			Invcons = "";
			Invdate = "";
			Invmodality = "";
			Invsite = "";
			Invresdate = "";
			Invres = "";
			Invmodtxt = "";
			Invsitetxt = "";
			Invrestxt = "";
			
		}		
	}
		
		
	public final class Onc_diaginvestFilter
	{			
		public String Onc_invest_id = "";
		public String Pkey = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Modu = "";
		public String Ccs_epid = "";
		public String Tstp = "";
		public String Invtype = "";
		public String Invhosp = "";
		public String Invcons = "";
		public String Invdate = "";
		public String Invmodality = "";
		public String Invsite = "";
		public String Invresdate = "";
		public String Invres = "";
		public String Invmodtxt = "";
		public String Invsitetxt = "";
		public String Invrestxt = "";
		
		public void clear()
		{				
			Onc_invest_id = "";
			Pkey = "";
			Rdat = "";
			Rtim = "";
			Rhcp = "";
			Rusr = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Uusr = "";
			Cdat = "";
			Ctim = "";
			Modu = "";
			Ccs_epid = "";
			Tstp = "";
			Invtype = "";
			Invhosp = "";
			Invcons = "";
			Invdate = "";
			Invmodality = "";
			Invsite = "";
			Invresdate = "";
			Invres = "";
			Invmodtxt = "";
			Invsitetxt = "";
			Invrestxt = "";
		}	
		public Onc_diaginvestFilter cloneObject()
		{
			Onc_diaginvestFilter newFilter = new Onc_diaginvestFilter();
			
			newFilter.Onc_invest_id = this.Onc_invest_id;
			newFilter.Pkey = this.Pkey;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Rhcp = this.Rhcp;
			newFilter.Rusr = this.Rusr;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Uhcp = this.Uhcp;
			newFilter.Uusr = this.Uusr;
			newFilter.Cdat = this.Cdat;
			newFilter.Ctim = this.Ctim;
			newFilter.Modu = this.Modu;
			newFilter.Ccs_epid = this.Ccs_epid;
			newFilter.Tstp = this.Tstp;
			newFilter.Invtype = this.Invtype;
			newFilter.Invhosp = this.Invhosp;
			newFilter.Invcons = this.Invcons;
			newFilter.Invdate = this.Invdate;
			newFilter.Invmodality = this.Invmodality;
			newFilter.Invsite = this.Invsite;
			newFilter.Invresdate = this.Invresdate;
			newFilter.Invres = this.Invres;
			newFilter.Invmodtxt = this.Invmodtxt;
			newFilter.Invsitetxt = this.Invsitetxt;
			newFilter.Invrestxt = this.Invrestxt;
			
			return newFilter;
		}
	}
	public final class Onc_diaginvestEditFilter
	{			
		public boolean IncludeOnc_invest_id = true;
		public boolean IncludePkey = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeRhcp = true;
		public boolean IncludeRusr = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeUhcp = true;
		public boolean IncludeUusr = true;
		public boolean IncludeCdat = true;
		public boolean IncludeCtim = true;
		public boolean IncludeModu = true;
		public boolean IncludeCcs_epid = true;
		public boolean IncludeTstp = true;
		public boolean IncludeInvtype = true;
		public boolean IncludeInvhosp = true;
		public boolean IncludeInvcons = true;
		public boolean IncludeInvdate = true;
		public boolean IncludeInvmodality = true;
		public boolean IncludeInvsite = true;
		public boolean IncludeInvresdate = true;
		public boolean IncludeInvres = true;
		public boolean IncludeInvmodtxt = true;
		public boolean IncludeInvsitetxt = true;
		public boolean IncludeInvrestxt = true;
		
		public void includeAll()
		{				
			IncludeOnc_invest_id = true;
			IncludePkey = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeRhcp = true;
			IncludeRusr = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeUhcp = true;
			IncludeUusr = true;
			IncludeCdat = true;
			IncludeCtim = true;
			IncludeModu = true;
			IncludeCcs_epid = true;
			IncludeTstp = true;
			IncludeInvtype = true;
			IncludeInvhosp = true;
			IncludeInvcons = true;
			IncludeInvdate = true;
			IncludeInvmodality = true;
			IncludeInvsite = true;
			IncludeInvresdate = true;
			IncludeInvres = true;
			IncludeInvmodtxt = true;
			IncludeInvsitetxt = true;
			IncludeInvrestxt = true;
		}	
		public void excludeAll()
		{				
			IncludeOnc_invest_id = false;
			IncludePkey = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeRhcp = false;
			IncludeRusr = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeUhcp = false;
			IncludeUusr = false;
			IncludeCdat = false;
			IncludeCtim = false;
			IncludeModu = false;
			IncludeCcs_epid = false;
			IncludeTstp = false;
			IncludeInvtype = false;
			IncludeInvhosp = false;
			IncludeInvcons = false;
			IncludeInvdate = false;
			IncludeInvmodality = false;
			IncludeInvsite = false;
			IncludeInvresdate = false;
			IncludeInvres = false;
			IncludeInvmodtxt = false;
			IncludeInvsitetxt = false;
			IncludeInvrestxt = false;
		}
		public Onc_diaginvestEditFilter cloneObject()
		{
			Onc_diaginvestEditFilter newEditFilter = new Onc_diaginvestEditFilter();
			
			newEditFilter.IncludeOnc_invest_id = this.IncludeOnc_invest_id;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeRhcp = this.IncludeRhcp;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeUhcp = this.IncludeUhcp;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeModu = this.IncludeModu;
			newEditFilter.IncludeCcs_epid = this.IncludeCcs_epid;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeInvtype = this.IncludeInvtype;
			newEditFilter.IncludeInvhosp = this.IncludeInvhosp;
			newEditFilter.IncludeInvcons = this.IncludeInvcons;
			newEditFilter.IncludeInvdate = this.IncludeInvdate;
			newEditFilter.IncludeInvmodality = this.IncludeInvmodality;
			newEditFilter.IncludeInvsite = this.IncludeInvsite;
			newEditFilter.IncludeInvresdate = this.IncludeInvresdate;
			newEditFilter.IncludeInvres = this.IncludeInvres;
			newEditFilter.IncludeInvmodtxt = this.IncludeInvmodtxt;
			newEditFilter.IncludeInvsitetxt = this.IncludeInvsitetxt;
			newEditFilter.IncludeInvrestxt = this.IncludeInvrestxt;
			
			return newEditFilter;
		}
	}
}
