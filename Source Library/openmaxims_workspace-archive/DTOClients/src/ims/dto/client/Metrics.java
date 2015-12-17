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

public final class Metrics
{
	private MetricsFilter lastGetFilter = null;
	private final String serviceName = "METRICS";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public MetricsFilter Filter = new MetricsFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public MetricsEditFilter EditFilter = new MetricsEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public MetricsCollection DataCollection = new MetricsCollection();

	/**
	 * Creates a new Metrics Data Transfer Object.
	 */ 
	public Metrics(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Metrics cloneObject() throws ims.dto.Exception
	{
		Metrics cloneObject = new Metrics(Connection);
			
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
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Rhcp = DataCollection.get(x).Rhcp;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Uhcp = DataCollection.get(x).Uhcp;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Modu = DataCollection.get(x).Modu;
			cloneObject.DataCollection.get(index).Ccsepid = DataCollection.get(x).Ccsepid;
			cloneObject.DataCollection.get(index).Refid_type = DataCollection.get(x).Refid_type;
			cloneObject.DataCollection.get(index).Refid = DataCollection.get(x).Refid;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Wght = DataCollection.get(x).Wght;
			cloneObject.DataCollection.get(index).Wghtg = DataCollection.get(x).Wghtg;
			cloneObject.DataCollection.get(index).Wgtu = DataCollection.get(x).Wgtu;
			cloneObject.DataCollection.get(index).Mwgt = DataCollection.get(x).Mwgt;
			cloneObject.DataCollection.get(index).Hgt = DataCollection.get(x).Hgt;
			cloneObject.DataCollection.get(index).Hgtu = DataCollection.get(x).Hgtu;
			cloneObject.DataCollection.get(index).Mhgt = DataCollection.get(x).Mhgt;
			cloneObject.DataCollection.get(index).Sare = DataCollection.get(x).Sare;
			cloneObject.DataCollection.get(index).Waist_hip = DataCollection.get(x).Waist_hip;
			cloneObject.DataCollection.get(index).Bmi = DataCollection.get(x).Bmi;
			cloneObject.DataCollection.get(index).Ntes = DataCollection.get(x).Ntes;
			cloneObject.DataCollection.get(index).Status = DataCollection.get(x).Status;
			cloneObject.DataCollection.get(index).Rhcptxt = DataCollection.get(x).Rhcptxt;
			cloneObject.DataCollection.get(index).Rusrtxt = DataCollection.get(x).Rusrtxt;
			cloneObject.DataCollection.get(index).Uhcptxt = DataCollection.get(x).Uhcptxt;
			cloneObject.DataCollection.get(index).Uusrtxt = DataCollection.get(x).Uusrtxt;
			cloneObject.DataCollection.get(index).Modutxt = DataCollection.get(x).Modutxt;
			cloneObject.DataCollection.get(index).Wgtutxt = DataCollection.get(x).Wgtutxt;
			cloneObject.DataCollection.get(index).Hgtutxt = DataCollection.get(x).Hgtutxt;
			cloneObject.DataCollection.get(index).Active_flag = DataCollection.get(x).Active_flag;
							
			
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
		return "Metrics.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Metrics.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Metrics.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Metrics.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Metrics.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Metrics.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Metrics.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Metrics.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Metrics.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Metrics.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Metrics.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Metrics.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Metrics.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Metrics.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Metrics.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Metrics.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Metrics.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Metrics.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Metrics.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Metrics.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Metrics.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Metrics.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Metrics.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Metrics.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Metrics.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Metrics.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Metrics.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Metrics.List");
							
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
	private String encodeNASFilter(MetricsFilter filter)
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
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey;
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
		
		if(Filter.Modu != null && filter.Modu.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modu;
		}
		
		if(Filter.Ccsepid != null && filter.Ccsepid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CCSEPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccsepid;
		}
		
		if(Filter.Refid_type != null && filter.Refid_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFID_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refid_type;
		}
		
		if(Filter.Refid != null && filter.Refid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refid;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Wght != null && filter.Wght.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WGHT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wght;
		}
		
		if(Filter.Wghtg != null && filter.Wghtg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WGHTG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wghtg;
		}
		
		if(Filter.Wgtu != null && filter.Wgtu.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WGTU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wgtu;
		}
		
		if(Filter.Mwgt != null && filter.Mwgt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MWGT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mwgt;
		}
		
		if(Filter.Hgt != null && filter.Hgt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HGT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hgt;
		}
		
		if(Filter.Hgtu != null && filter.Hgtu.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HGTU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hgtu;
		}
		
		if(Filter.Mhgt != null && filter.Mhgt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MHGT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mhgt;
		}
		
		if(Filter.Sare != null && filter.Sare.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SARE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sare;
		}
		
		if(Filter.Waist_hip != null && filter.Waist_hip.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WAIST_HIP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Waist_hip;
		}
		
		if(Filter.Bmi != null && filter.Bmi.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BMI" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Bmi;
		}
		
		if(Filter.Ntes != null && filter.Ntes.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ntes;
		}
		
		if(Filter.Status != null && filter.Status.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Status;
		}
		
		if(Filter.Rhcptxt != null && filter.Rhcptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rhcptxt;
		}
		
		if(Filter.Rusrtxt != null && filter.Rusrtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusrtxt;
		}
		
		if(Filter.Uhcptxt != null && filter.Uhcptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uhcptxt;
		}
		
		if(Filter.Uusrtxt != null && filter.Uusrtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uusrtxt;
		}
		
		if(Filter.Modutxt != null && filter.Modutxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MODUTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modutxt;
		}
		
		if(Filter.Wgtutxt != null && filter.Wgtutxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WGTUTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wgtutxt;
		}
		
		if(Filter.Hgtutxt != null && filter.Hgtutxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HGTUTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hgtutxt;
		}
		
		if(Filter.Active_flag != null && filter.Active_flag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIVE_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Active_flag;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		MetricsRecord data = (MetricsRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeUnid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unid);
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
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
		
		if(EditFilter.IncludeModu)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modu);
		}
		
		if(EditFilter.IncludeCcsepid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CCSEPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccsepid);
		}
		
		if(EditFilter.IncludeRefid_type)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFID_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refid_type);
		}
		
		if(EditFilter.IncludeRefid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refid);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeWght)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WGHT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wght);
		}
		
		if(EditFilter.IncludeWghtg)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WGHTG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wghtg);
		}
		
		if(EditFilter.IncludeWgtu)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WGTU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wgtu);
		}
		
		if(EditFilter.IncludeMwgt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MWGT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mwgt);
		}
		
		if(EditFilter.IncludeHgt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HGT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hgt);
		}
		
		if(EditFilter.IncludeHgtu)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HGTU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hgtu);
		}
		
		if(EditFilter.IncludeMhgt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MHGT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mhgt);
		}
		
		if(EditFilter.IncludeSare)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SARE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sare);
		}
		
		if(EditFilter.IncludeWaist_hip)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WAIST_HIP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Waist_hip);
		}
		
		if(EditFilter.IncludeBmi)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BMI" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Bmi);
		}
		
		if(EditFilter.IncludeNtes)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ntes);
		}
		
		if(EditFilter.IncludeStatus)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Status);
		}
		
		if(EditFilter.IncludeRhcptxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rhcptxt);
		}
		
		if(EditFilter.IncludeRusrtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusrtxt);
		}
		
		if(EditFilter.IncludeUhcptxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uhcptxt);
		}
		
		if(EditFilter.IncludeUusrtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uusrtxt);
		}
		
		if(EditFilter.IncludeModutxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MODUTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modutxt);
		}
		
		if(EditFilter.IncludeWgtutxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WGTUTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wgtutxt);
		}
		
		if(EditFilter.IncludeHgtutxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HGTUTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hgtutxt);
		}
		
		if(EditFilter.IncludeActive_flag)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIVE_FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Active_flag);
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
			MetricsRecord record = new MetricsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ccsepid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCSEPID"));
			record.Refid_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFID_TYPE"));
			record.Refid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFID"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Wght = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WGHT"));
			record.Wghtg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WGHTG"));
			record.Wgtu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WGTU"));
			record.Mwgt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MWGT"));
			record.Hgt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HGT"));
			record.Hgtu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HGTU"));
			record.Mhgt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MHGT"));
			record.Sare = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SARE"));
			record.Waist_hip = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WAIST_HIP"));
			record.Bmi = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BMI"));
			record.Ntes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NTES"));
			record.Status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STATUS"));
			record.Rhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCPTXT"));
			record.Rusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSRTXT"));
			record.Uhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCPTXT"));
			record.Uusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSRTXT"));
			record.Modutxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODUTXT"));
			record.Wgtutxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WGTUTXT"));
			record.Hgtutxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HGTUTXT"));
			record.Active_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE_FLAG"));
									
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
			MetricsRecord record = new MetricsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ccsepid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCSEPID"));
			record.Refid_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFID_TYPE"));
			record.Refid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFID"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Wght = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WGHT"));
			record.Wghtg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WGHTG"));
			record.Wgtu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WGTU"));
			record.Mwgt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MWGT"));
			record.Hgt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HGT"));
			record.Hgtu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HGTU"));
			record.Mhgt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MHGT"));
			record.Sare = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SARE"));
			record.Waist_hip = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WAIST_HIP"));
			record.Bmi = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BMI"));
			record.Ntes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NTES"));
			record.Status = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STATUS"));
			record.Rhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCPTXT"));
			record.Rusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSRTXT"));
			record.Uhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCPTXT"));
			record.Uusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSRTXT"));
			record.Modutxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODUTXT"));
			record.Wgtutxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WGTUTXT"));
			record.Hgtutxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HGTUTXT"));
			record.Active_flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE_FLAG"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class MetricsCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			MetricsRecord newRecord = new MetricsRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(MetricsRecord record)
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
		public MetricsRecord get(int index)
		{
			return (MetricsRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class MetricsRecord
	{
		public String Unid = "";
		public String Pkey = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Modu = "";
		public String Ccsepid = "";
		public String Refid_type = "";
		public String Refid = "";
		public String Tstp = "";
		public String Wght = "";
		public String Wghtg = "";
		public String Wgtu = "";
		public String Mwgt = "";
		public String Hgt = "";
		public String Hgtu = "";
		public String Mhgt = "";
		public String Sare = "";
		public String Waist_hip = "";
		public String Bmi = "";
		public String Ntes = "";
		public String Status = "";
		public String Rhcptxt = "";
		public String Rusrtxt = "";
		public String Uhcptxt = "";
		public String Uusrtxt = "";
		public String Modutxt = "";
		public String Wgtutxt = "";
		public String Hgtutxt = "";
		public String Active_flag = "";
				
		
		public void clear()
		{
			Unid = "";
			Pkey = "";
			Cdat = "";
			Ctim = "";
			Rhcp = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Uusr = "";
			Modu = "";
			Ccsepid = "";
			Refid_type = "";
			Refid = "";
			Tstp = "";
			Wght = "";
			Wghtg = "";
			Wgtu = "";
			Mwgt = "";
			Hgt = "";
			Hgtu = "";
			Mhgt = "";
			Sare = "";
			Waist_hip = "";
			Bmi = "";
			Ntes = "";
			Status = "";
			Rhcptxt = "";
			Rusrtxt = "";
			Uhcptxt = "";
			Uusrtxt = "";
			Modutxt = "";
			Wgtutxt = "";
			Hgtutxt = "";
			Active_flag = "";
			
		}		
	}
		
		
	public final class MetricsFilter
	{			
		public String Unid = "";
		public String Pkey = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Modu = "";
		public String Ccsepid = "";
		public String Refid_type = "";
		public String Refid = "";
		public String Tstp = "";
		public String Wght = "";
		public String Wghtg = "";
		public String Wgtu = "";
		public String Mwgt = "";
		public String Hgt = "";
		public String Hgtu = "";
		public String Mhgt = "";
		public String Sare = "";
		public String Waist_hip = "";
		public String Bmi = "";
		public String Ntes = "";
		public String Status = "";
		public String Rhcptxt = "";
		public String Rusrtxt = "";
		public String Uhcptxt = "";
		public String Uusrtxt = "";
		public String Modutxt = "";
		public String Wgtutxt = "";
		public String Hgtutxt = "";
		public String Active_flag = "";
		
		public void clear()
		{				
			Unid = "";
			Pkey = "";
			Cdat = "";
			Ctim = "";
			Rhcp = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Uusr = "";
			Modu = "";
			Ccsepid = "";
			Refid_type = "";
			Refid = "";
			Tstp = "";
			Wght = "";
			Wghtg = "";
			Wgtu = "";
			Mwgt = "";
			Hgt = "";
			Hgtu = "";
			Mhgt = "";
			Sare = "";
			Waist_hip = "";
			Bmi = "";
			Ntes = "";
			Status = "";
			Rhcptxt = "";
			Rusrtxt = "";
			Uhcptxt = "";
			Uusrtxt = "";
			Modutxt = "";
			Wgtutxt = "";
			Hgtutxt = "";
			Active_flag = "";
		}	
		public MetricsFilter cloneObject()
		{
			MetricsFilter newFilter = new MetricsFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Pkey = this.Pkey;
			newFilter.Cdat = this.Cdat;
			newFilter.Ctim = this.Ctim;
			newFilter.Rhcp = this.Rhcp;
			newFilter.Rusr = this.Rusr;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Uhcp = this.Uhcp;
			newFilter.Uusr = this.Uusr;
			newFilter.Modu = this.Modu;
			newFilter.Ccsepid = this.Ccsepid;
			newFilter.Refid_type = this.Refid_type;
			newFilter.Refid = this.Refid;
			newFilter.Tstp = this.Tstp;
			newFilter.Wght = this.Wght;
			newFilter.Wghtg = this.Wghtg;
			newFilter.Wgtu = this.Wgtu;
			newFilter.Mwgt = this.Mwgt;
			newFilter.Hgt = this.Hgt;
			newFilter.Hgtu = this.Hgtu;
			newFilter.Mhgt = this.Mhgt;
			newFilter.Sare = this.Sare;
			newFilter.Waist_hip = this.Waist_hip;
			newFilter.Bmi = this.Bmi;
			newFilter.Ntes = this.Ntes;
			newFilter.Status = this.Status;
			newFilter.Rhcptxt = this.Rhcptxt;
			newFilter.Rusrtxt = this.Rusrtxt;
			newFilter.Uhcptxt = this.Uhcptxt;
			newFilter.Uusrtxt = this.Uusrtxt;
			newFilter.Modutxt = this.Modutxt;
			newFilter.Wgtutxt = this.Wgtutxt;
			newFilter.Hgtutxt = this.Hgtutxt;
			newFilter.Active_flag = this.Active_flag;
			
			return newFilter;
		}
	}
	public final class MetricsEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludePkey = true;
		public boolean IncludeCdat = true;
		public boolean IncludeCtim = true;
		public boolean IncludeRhcp = true;
		public boolean IncludeRusr = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeUhcp = true;
		public boolean IncludeUusr = true;
		public boolean IncludeModu = true;
		public boolean IncludeCcsepid = true;
		public boolean IncludeRefid_type = true;
		public boolean IncludeRefid = true;
		public boolean IncludeTstp = true;
		public boolean IncludeWght = true;
		public boolean IncludeWghtg = true;
		public boolean IncludeWgtu = true;
		public boolean IncludeMwgt = true;
		public boolean IncludeHgt = true;
		public boolean IncludeHgtu = true;
		public boolean IncludeMhgt = true;
		public boolean IncludeSare = true;
		public boolean IncludeWaist_hip = true;
		public boolean IncludeBmi = true;
		public boolean IncludeNtes = true;
		public boolean IncludeStatus = true;
		public boolean IncludeRhcptxt = true;
		public boolean IncludeRusrtxt = true;
		public boolean IncludeUhcptxt = true;
		public boolean IncludeUusrtxt = true;
		public boolean IncludeModutxt = true;
		public boolean IncludeWgtutxt = true;
		public boolean IncludeHgtutxt = true;
		public boolean IncludeActive_flag = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludePkey = true;
			IncludeCdat = true;
			IncludeCtim = true;
			IncludeRhcp = true;
			IncludeRusr = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeUhcp = true;
			IncludeUusr = true;
			IncludeModu = true;
			IncludeCcsepid = true;
			IncludeRefid_type = true;
			IncludeRefid = true;
			IncludeTstp = true;
			IncludeWght = true;
			IncludeWghtg = true;
			IncludeWgtu = true;
			IncludeMwgt = true;
			IncludeHgt = true;
			IncludeHgtu = true;
			IncludeMhgt = true;
			IncludeSare = true;
			IncludeWaist_hip = true;
			IncludeBmi = true;
			IncludeNtes = true;
			IncludeStatus = true;
			IncludeRhcptxt = true;
			IncludeRusrtxt = true;
			IncludeUhcptxt = true;
			IncludeUusrtxt = true;
			IncludeModutxt = true;
			IncludeWgtutxt = true;
			IncludeHgtutxt = true;
			IncludeActive_flag = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludePkey = false;
			IncludeCdat = false;
			IncludeCtim = false;
			IncludeRhcp = false;
			IncludeRusr = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeUhcp = false;
			IncludeUusr = false;
			IncludeModu = false;
			IncludeCcsepid = false;
			IncludeRefid_type = false;
			IncludeRefid = false;
			IncludeTstp = false;
			IncludeWght = false;
			IncludeWghtg = false;
			IncludeWgtu = false;
			IncludeMwgt = false;
			IncludeHgt = false;
			IncludeHgtu = false;
			IncludeMhgt = false;
			IncludeSare = false;
			IncludeWaist_hip = false;
			IncludeBmi = false;
			IncludeNtes = false;
			IncludeStatus = false;
			IncludeRhcptxt = false;
			IncludeRusrtxt = false;
			IncludeUhcptxt = false;
			IncludeUusrtxt = false;
			IncludeModutxt = false;
			IncludeWgtutxt = false;
			IncludeHgtutxt = false;
			IncludeActive_flag = false;
		}
		public MetricsEditFilter cloneObject()
		{
			MetricsEditFilter newEditFilter = new MetricsEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeRhcp = this.IncludeRhcp;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeUhcp = this.IncludeUhcp;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeModu = this.IncludeModu;
			newEditFilter.IncludeCcsepid = this.IncludeCcsepid;
			newEditFilter.IncludeRefid_type = this.IncludeRefid_type;
			newEditFilter.IncludeRefid = this.IncludeRefid;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeWght = this.IncludeWght;
			newEditFilter.IncludeWghtg = this.IncludeWghtg;
			newEditFilter.IncludeWgtu = this.IncludeWgtu;
			newEditFilter.IncludeMwgt = this.IncludeMwgt;
			newEditFilter.IncludeHgt = this.IncludeHgt;
			newEditFilter.IncludeHgtu = this.IncludeHgtu;
			newEditFilter.IncludeMhgt = this.IncludeMhgt;
			newEditFilter.IncludeSare = this.IncludeSare;
			newEditFilter.IncludeWaist_hip = this.IncludeWaist_hip;
			newEditFilter.IncludeBmi = this.IncludeBmi;
			newEditFilter.IncludeNtes = this.IncludeNtes;
			newEditFilter.IncludeStatus = this.IncludeStatus;
			newEditFilter.IncludeRhcptxt = this.IncludeRhcptxt;
			newEditFilter.IncludeRusrtxt = this.IncludeRusrtxt;
			newEditFilter.IncludeUhcptxt = this.IncludeUhcptxt;
			newEditFilter.IncludeUusrtxt = this.IncludeUusrtxt;
			newEditFilter.IncludeModutxt = this.IncludeModutxt;
			newEditFilter.IncludeWgtutxt = this.IncludeWgtutxt;
			newEditFilter.IncludeHgtutxt = this.IncludeHgtutxt;
			newEditFilter.IncludeActive_flag = this.IncludeActive_flag;
			
			return newEditFilter;
		}
	}
}
