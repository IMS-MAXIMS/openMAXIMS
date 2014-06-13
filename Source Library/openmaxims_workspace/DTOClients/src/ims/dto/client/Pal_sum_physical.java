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

public final class Pal_sum_physical
{
	private Pal_sum_physicalFilter lastGetFilter = null;
	private final String serviceName = "PAL_SUM_PHYSICAL";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Pal_sum_physicalFilter Filter = new Pal_sum_physicalFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Pal_sum_physicalEditFilter EditFilter = new Pal_sum_physicalEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Pal_sum_physicalCollection DataCollection = new Pal_sum_physicalCollection();

	/**
	 * Creates a new Pal_sum_physical Data Transfer Object.
	 */ 
	public Pal_sum_physical(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Pal_sum_physical cloneObject() throws ims.dto.Exception
	{
		Pal_sum_physical cloneObject = new Pal_sum_physical(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Pal_sum_physical_id = DataCollection.get(x).Pal_sum_physical_id;
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
			cloneObject.DataCollection.get(index).Actind = DataCollection.get(x).Actind;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Unableswallow = DataCollection.get(x).Unableswallow;
			cloneObject.DataCollection.get(index).Nausea = DataCollection.get(x).Nausea;
			cloneObject.DataCollection.get(index).Vomiting = DataCollection.get(x).Vomiting;
			cloneObject.DataCollection.get(index).Constipated = DataCollection.get(x).Constipated;
			cloneObject.DataCollection.get(index).Confused = DataCollection.get(x).Confused;
			cloneObject.DataCollection.get(index).Aggitated = DataCollection.get(x).Aggitated;
			cloneObject.DataCollection.get(index).Restless = DataCollection.get(x).Restless;
			cloneObject.DataCollection.get(index).Distressed = DataCollection.get(x).Distressed;
			cloneObject.DataCollection.get(index).Aware = DataCollection.get(x).Aware;
			cloneObject.DataCollection.get(index).Conscious = DataCollection.get(x).Conscious;
			cloneObject.DataCollection.get(index).Utiprob = DataCollection.get(x).Utiprob;
			cloneObject.DataCollection.get(index).Cathether = DataCollection.get(x).Cathether;
			cloneObject.DataCollection.get(index).Resptrsec = DataCollection.get(x).Resptrsec;
			cloneObject.DataCollection.get(index).Dyspnoea = DataCollection.get(x).Dyspnoea;
			cloneObject.DataCollection.get(index).Pain = DataCollection.get(x).Pain;
			cloneObject.DataCollection.get(index).Other = DataCollection.get(x).Other;
			cloneObject.DataCollection.get(index).Othertxt = DataCollection.get(x).Othertxt;
							
			
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
		return "Pal_sum_physical.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Pal_sum_physical.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Pal_sum_physical.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Pal_sum_physical.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Pal_sum_physical.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Pal_sum_physical.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Pal_sum_physical.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Pal_sum_physical.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Pal_sum_physical.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Pal_sum_physical.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Pal_sum_physical.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Pal_sum_physical.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Pal_sum_physical.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Pal_sum_physical.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Pal_sum_physical.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Pal_sum_physical.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Pal_sum_physical.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Pal_sum_physical.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Pal_sum_physical.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Pal_sum_physical.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Pal_sum_physical.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Pal_sum_physical.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Pal_sum_physical.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Pal_sum_physical.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Pal_sum_physical.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Pal_sum_physical.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Pal_sum_physical.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Pal_sum_physical.List");
							
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
	private String encodeNASFilter(Pal_sum_physicalFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Pal_sum_physical_id != null && filter.Pal_sum_physical_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PAL_SUM_PHYSICAL_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pal_sum_physical_id;
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
		
		if(Filter.Actind != null && filter.Actind.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Actind;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Unableswallow != null && filter.Unableswallow.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UNABLESWALLOW" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Unableswallow;
		}
		
		if(Filter.Nausea != null && filter.Nausea.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAUSEA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nausea;
		}
		
		if(Filter.Vomiting != null && filter.Vomiting.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "VOMITING" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Vomiting;
		}
		
		if(Filter.Constipated != null && filter.Constipated.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONSTIPATED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Constipated;
		}
		
		if(Filter.Confused != null && filter.Confused.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONFUSED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Confused;
		}
		
		if(Filter.Aggitated != null && filter.Aggitated.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AGGITATED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Aggitated;
		}
		
		if(Filter.Restless != null && filter.Restless.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESTLESS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Restless;
		}
		
		if(Filter.Distressed != null && filter.Distressed.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DISTRESSED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Distressed;
		}
		
		if(Filter.Aware != null && filter.Aware.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AWARE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Aware;
		}
		
		if(Filter.Conscious != null && filter.Conscious.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONSCIOUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Conscious;
		}
		
		if(Filter.Utiprob != null && filter.Utiprob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UTIPROB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Utiprob;
		}
		
		if(Filter.Cathether != null && filter.Cathether.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CATHETHER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cathether;
		}
		
		if(Filter.Resptrsec != null && filter.Resptrsec.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESPTRSEC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resptrsec;
		}
		
		if(Filter.Dyspnoea != null && filter.Dyspnoea.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DYSPNOEA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dyspnoea;
		}
		
		if(Filter.Pain != null && filter.Pain.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PAIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pain;
		}
		
		if(Filter.Other != null && filter.Other.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OTHER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Other;
		}
		
		if(Filter.Othertxt != null && filter.Othertxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OTHERTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Othertxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Pal_sum_physicalRecord data = (Pal_sum_physicalRecord)DataCollection.get(0);
		
		if(EditFilter.IncludePal_sum_physical_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PAL_SUM_PHYSICAL_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pal_sum_physical_id);
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
		
		if(EditFilter.IncludeActind)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Actind);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeUnableswallow)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNABLESWALLOW" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unableswallow);
		}
		
		if(EditFilter.IncludeNausea)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NAUSEA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nausea);
		}
		
		if(EditFilter.IncludeVomiting)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "VOMITING" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Vomiting);
		}
		
		if(EditFilter.IncludeConstipated)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONSTIPATED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Constipated);
		}
		
		if(EditFilter.IncludeConfused)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONFUSED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Confused);
		}
		
		if(EditFilter.IncludeAggitated)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AGGITATED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Aggitated);
		}
		
		if(EditFilter.IncludeRestless)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESTLESS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Restless);
		}
		
		if(EditFilter.IncludeDistressed)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DISTRESSED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Distressed);
		}
		
		if(EditFilter.IncludeAware)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AWARE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Aware);
		}
		
		if(EditFilter.IncludeConscious)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONSCIOUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Conscious);
		}
		
		if(EditFilter.IncludeUtiprob)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UTIPROB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Utiprob);
		}
		
		if(EditFilter.IncludeCathether)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CATHETHER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cathether);
		}
		
		if(EditFilter.IncludeResptrsec)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESPTRSEC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resptrsec);
		}
		
		if(EditFilter.IncludeDyspnoea)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DYSPNOEA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dyspnoea);
		}
		
		if(EditFilter.IncludePain)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PAIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pain);
		}
		
		if(EditFilter.IncludeOther)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OTHER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Other);
		}
		
		if(EditFilter.IncludeOthertxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OTHERTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Othertxt);
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
			Pal_sum_physicalRecord record = new Pal_sum_physicalRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pal_sum_physical_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAL_SUM_PHYSICAL_ID"));
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
			record.Actind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIND"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Unableswallow = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNABLESWALLOW"));
			record.Nausea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAUSEA"));
			record.Vomiting = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VOMITING"));
			record.Constipated = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONSTIPATED"));
			record.Confused = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONFUSED"));
			record.Aggitated = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AGGITATED"));
			record.Restless = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESTLESS"));
			record.Distressed = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISTRESSED"));
			record.Aware = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AWARE"));
			record.Conscious = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONSCIOUS"));
			record.Utiprob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIPROB"));
			record.Cathether = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CATHETHER"));
			record.Resptrsec = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESPTRSEC"));
			record.Dyspnoea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DYSPNOEA"));
			record.Pain = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAIN"));
			record.Other = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OTHER"));
			record.Othertxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OTHERTXT"));
									
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
			Pal_sum_physicalRecord record = new Pal_sum_physicalRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pal_sum_physical_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAL_SUM_PHYSICAL_ID"));
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
			record.Actind = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIND"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Unableswallow = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNABLESWALLOW"));
			record.Nausea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAUSEA"));
			record.Vomiting = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VOMITING"));
			record.Constipated = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONSTIPATED"));
			record.Confused = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONFUSED"));
			record.Aggitated = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AGGITATED"));
			record.Restless = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESTLESS"));
			record.Distressed = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISTRESSED"));
			record.Aware = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AWARE"));
			record.Conscious = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONSCIOUS"));
			record.Utiprob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIPROB"));
			record.Cathether = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CATHETHER"));
			record.Resptrsec = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESPTRSEC"));
			record.Dyspnoea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DYSPNOEA"));
			record.Pain = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAIN"));
			record.Other = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OTHER"));
			record.Othertxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OTHERTXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Pal_sum_physicalCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Pal_sum_physicalRecord newRecord = new Pal_sum_physicalRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Pal_sum_physicalRecord record)
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
		public Pal_sum_physicalRecord get(int index)
		{
			return (Pal_sum_physicalRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Pal_sum_physicalRecord
	{
		public String Pal_sum_physical_id = "";
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
		public String Actind = "";
		public String Tstp = "";
		public String Unableswallow = "";
		public String Nausea = "";
		public String Vomiting = "";
		public String Constipated = "";
		public String Confused = "";
		public String Aggitated = "";
		public String Restless = "";
		public String Distressed = "";
		public String Aware = "";
		public String Conscious = "";
		public String Utiprob = "";
		public String Cathether = "";
		public String Resptrsec = "";
		public String Dyspnoea = "";
		public String Pain = "";
		public String Other = "";
		public String Othertxt = "";
				
		
		public void clear()
		{
			Pal_sum_physical_id = "";
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
			Actind = "";
			Tstp = "";
			Unableswallow = "";
			Nausea = "";
			Vomiting = "";
			Constipated = "";
			Confused = "";
			Aggitated = "";
			Restless = "";
			Distressed = "";
			Aware = "";
			Conscious = "";
			Utiprob = "";
			Cathether = "";
			Resptrsec = "";
			Dyspnoea = "";
			Pain = "";
			Other = "";
			Othertxt = "";
			
		}		
	}
		
		
	public final class Pal_sum_physicalFilter
	{			
		public String Pal_sum_physical_id = "";
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
		public String Actind = "";
		public String Tstp = "";
		public String Unableswallow = "";
		public String Nausea = "";
		public String Vomiting = "";
		public String Constipated = "";
		public String Confused = "";
		public String Aggitated = "";
		public String Restless = "";
		public String Distressed = "";
		public String Aware = "";
		public String Conscious = "";
		public String Utiprob = "";
		public String Cathether = "";
		public String Resptrsec = "";
		public String Dyspnoea = "";
		public String Pain = "";
		public String Other = "";
		public String Othertxt = "";
		
		public void clear()
		{				
			Pal_sum_physical_id = "";
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
			Actind = "";
			Tstp = "";
			Unableswallow = "";
			Nausea = "";
			Vomiting = "";
			Constipated = "";
			Confused = "";
			Aggitated = "";
			Restless = "";
			Distressed = "";
			Aware = "";
			Conscious = "";
			Utiprob = "";
			Cathether = "";
			Resptrsec = "";
			Dyspnoea = "";
			Pain = "";
			Other = "";
			Othertxt = "";
		}	
		public Pal_sum_physicalFilter cloneObject()
		{
			Pal_sum_physicalFilter newFilter = new Pal_sum_physicalFilter();
			
			newFilter.Pal_sum_physical_id = this.Pal_sum_physical_id;
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
			newFilter.Actind = this.Actind;
			newFilter.Tstp = this.Tstp;
			newFilter.Unableswallow = this.Unableswallow;
			newFilter.Nausea = this.Nausea;
			newFilter.Vomiting = this.Vomiting;
			newFilter.Constipated = this.Constipated;
			newFilter.Confused = this.Confused;
			newFilter.Aggitated = this.Aggitated;
			newFilter.Restless = this.Restless;
			newFilter.Distressed = this.Distressed;
			newFilter.Aware = this.Aware;
			newFilter.Conscious = this.Conscious;
			newFilter.Utiprob = this.Utiprob;
			newFilter.Cathether = this.Cathether;
			newFilter.Resptrsec = this.Resptrsec;
			newFilter.Dyspnoea = this.Dyspnoea;
			newFilter.Pain = this.Pain;
			newFilter.Other = this.Other;
			newFilter.Othertxt = this.Othertxt;
			
			return newFilter;
		}
	}
	public final class Pal_sum_physicalEditFilter
	{			
		public boolean IncludePal_sum_physical_id = true;
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
		public boolean IncludeActind = true;
		public boolean IncludeTstp = true;
		public boolean IncludeUnableswallow = true;
		public boolean IncludeNausea = true;
		public boolean IncludeVomiting = true;
		public boolean IncludeConstipated = true;
		public boolean IncludeConfused = true;
		public boolean IncludeAggitated = true;
		public boolean IncludeRestless = true;
		public boolean IncludeDistressed = true;
		public boolean IncludeAware = true;
		public boolean IncludeConscious = true;
		public boolean IncludeUtiprob = true;
		public boolean IncludeCathether = true;
		public boolean IncludeResptrsec = true;
		public boolean IncludeDyspnoea = true;
		public boolean IncludePain = true;
		public boolean IncludeOther = true;
		public boolean IncludeOthertxt = true;
		
		public void includeAll()
		{				
			IncludePal_sum_physical_id = true;
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
			IncludeActind = true;
			IncludeTstp = true;
			IncludeUnableswallow = true;
			IncludeNausea = true;
			IncludeVomiting = true;
			IncludeConstipated = true;
			IncludeConfused = true;
			IncludeAggitated = true;
			IncludeRestless = true;
			IncludeDistressed = true;
			IncludeAware = true;
			IncludeConscious = true;
			IncludeUtiprob = true;
			IncludeCathether = true;
			IncludeResptrsec = true;
			IncludeDyspnoea = true;
			IncludePain = true;
			IncludeOther = true;
			IncludeOthertxt = true;
		}	
		public void excludeAll()
		{				
			IncludePal_sum_physical_id = false;
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
			IncludeActind = false;
			IncludeTstp = false;
			IncludeUnableswallow = false;
			IncludeNausea = false;
			IncludeVomiting = false;
			IncludeConstipated = false;
			IncludeConfused = false;
			IncludeAggitated = false;
			IncludeRestless = false;
			IncludeDistressed = false;
			IncludeAware = false;
			IncludeConscious = false;
			IncludeUtiprob = false;
			IncludeCathether = false;
			IncludeResptrsec = false;
			IncludeDyspnoea = false;
			IncludePain = false;
			IncludeOther = false;
			IncludeOthertxt = false;
		}
		public Pal_sum_physicalEditFilter cloneObject()
		{
			Pal_sum_physicalEditFilter newEditFilter = new Pal_sum_physicalEditFilter();
			
			newEditFilter.IncludePal_sum_physical_id = this.IncludePal_sum_physical_id;
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
			newEditFilter.IncludeActind = this.IncludeActind;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeUnableswallow = this.IncludeUnableswallow;
			newEditFilter.IncludeNausea = this.IncludeNausea;
			newEditFilter.IncludeVomiting = this.IncludeVomiting;
			newEditFilter.IncludeConstipated = this.IncludeConstipated;
			newEditFilter.IncludeConfused = this.IncludeConfused;
			newEditFilter.IncludeAggitated = this.IncludeAggitated;
			newEditFilter.IncludeRestless = this.IncludeRestless;
			newEditFilter.IncludeDistressed = this.IncludeDistressed;
			newEditFilter.IncludeAware = this.IncludeAware;
			newEditFilter.IncludeConscious = this.IncludeConscious;
			newEditFilter.IncludeUtiprob = this.IncludeUtiprob;
			newEditFilter.IncludeCathether = this.IncludeCathether;
			newEditFilter.IncludeResptrsec = this.IncludeResptrsec;
			newEditFilter.IncludeDyspnoea = this.IncludeDyspnoea;
			newEditFilter.IncludePain = this.IncludePain;
			newEditFilter.IncludeOther = this.IncludeOther;
			newEditFilter.IncludeOthertxt = this.IncludeOthertxt;
			
			return newEditFilter;
		}
	}
}
