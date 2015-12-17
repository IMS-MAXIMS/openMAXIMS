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

public final class Allergy implements ims.vo.ImsCloneable
{
	private AllergyFilter lastGetFilter = null;
	private final String serviceName = "ALLERGY";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public AllergyFilter Filter = new AllergyFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public AllergyEditFilter EditFilter = new AllergyEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public AllergyCollection DataCollection = new AllergyCollection();

	/**
	 * Creates a new Allergy Data Transfer Object.
	 */ 
	public Allergy(ims.dto.Connection connection)
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
	public Allergy cloneObject()
	{
		Allergy cloneObject = new Allergy(Connection);
			
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
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).Hcpnote = DataCollection.get(x).Hcpnote;
			cloneObject.DataCollection.get(index).Alcode = DataCollection.get(x).Alcode;
			cloneObject.DataCollection.get(index).Altext = DataCollection.get(x).Altext;
			cloneObject.DataCollection.get(index).Alterm = DataCollection.get(x).Alterm;
			cloneObject.DataCollection.get(index).Aclust = DataCollection.get(x).Aclust;
			cloneObject.DataCollection.get(index).Aefcode = DataCollection.get(x).Aefcode;
			cloneObject.DataCollection.get(index).Aefterm = DataCollection.get(x).Aefterm;
			cloneObject.DataCollection.get(index).Aeftext = DataCollection.get(x).Aeftext;
			cloneObject.DataCollection.get(index).Afclust = DataCollection.get(x).Afclust;
			cloneObject.DataCollection.get(index).Onsd = DataCollection.get(x).Onsd;
			cloneObject.DataCollection.get(index).Effc = DataCollection.get(x).Effc;
			cloneObject.DataCollection.get(index).Rhcptxt = DataCollection.get(x).Rhcptxt;
			cloneObject.DataCollection.get(index).Rusrtxt = DataCollection.get(x).Rusrtxt;
			cloneObject.DataCollection.get(index).Uhcptxt = DataCollection.get(x).Uhcptxt;
			cloneObject.DataCollection.get(index).Uusrtxt = DataCollection.get(x).Uusrtxt;
			cloneObject.DataCollection.get(index).Modutxt = DataCollection.get(x).Modutxt;
			cloneObject.DataCollection.get(index).Hcpnotetxt = DataCollection.get(x).Hcpnotetxt;
			cloneObject.DataCollection.get(index).Allkupid = DataCollection.get(x).Allkupid;
			cloneObject.DataCollection.get(index).Aelkupid = DataCollection.get(x).Aelkupid;
			cloneObject.DataCollection.get(index).Asevlkupid = DataCollection.get(x).Asevlkupid;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.3 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Allergy.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Allergy.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Allergy.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Allergy.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Allergy.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Allergy.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Allergy.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Allergy.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Allergy.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Allergy.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Allergy.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Allergy.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Allergy.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Allergy.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Allergy.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Allergy.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Allergy.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Allergy.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Allergy.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Allergy.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Allergy.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Allergy.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Allergy.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Allergy.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Allergy.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Allergy.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Allergy.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Allergy.List");
							
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
	private String encodeNASFilter(AllergyFilter filter)
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
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat;
		}
		
		if(Filter.Hcpnote != null && filter.Hcpnote.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPNOTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpnote;
		}
		
		if(Filter.Alcode != null && filter.Alcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ALCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Alcode;
		}
		
		if(Filter.Altext != null && filter.Altext.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ALTEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Altext;
		}
		
		if(Filter.Alterm != null && filter.Alterm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ALTERM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Alterm;
		}
		
		if(Filter.Aclust != null && filter.Aclust.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACLUST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Aclust;
		}
		
		if(Filter.Aefcode != null && filter.Aefcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AEFCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Aefcode;
		}
		
		if(Filter.Aefterm != null && filter.Aefterm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AEFTERM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Aefterm;
		}
		
		if(Filter.Aeftext != null && filter.Aeftext.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AEFTEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Aeftext;
		}
		
		if(Filter.Afclust != null && filter.Afclust.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AFCLUST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Afclust;
		}
		
		if(Filter.Onsd != null && filter.Onsd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ONSD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Onsd;
		}
		
		if(Filter.Effc != null && filter.Effc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EFFC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Effc;
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
		
		if(Filter.Hcpnotetxt != null && filter.Hcpnotetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPNOTETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpnotetxt;
		}
		
		if(Filter.Allkupid != null && filter.Allkupid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ALLKUPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Allkupid;
		}
		
		if(Filter.Aelkupid != null && filter.Aelkupid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AELKUPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Aelkupid;
		}
		
		if(Filter.Asevlkupid != null && filter.Asevlkupid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ASEVLKUPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Asevlkupid;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		AllergyRecord data = (AllergyRecord)DataCollection.get(0);
		
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
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat);
		}
		
		if(EditFilter.IncludeHcpnote)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPNOTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpnote);
		}
		
		if(EditFilter.IncludeAlcode)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ALCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Alcode);
		}
		
		if(EditFilter.IncludeAltext)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ALTEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Altext);
		}
		
		if(EditFilter.IncludeAlterm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ALTERM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Alterm);
		}
		
		if(EditFilter.IncludeAclust)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACLUST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Aclust);
		}
		
		if(EditFilter.IncludeAefcode)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AEFCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Aefcode);
		}
		
		if(EditFilter.IncludeAefterm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AEFTERM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Aefterm);
		}
		
		if(EditFilter.IncludeAeftext)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AEFTEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Aeftext);
		}
		
		if(EditFilter.IncludeAfclust)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AFCLUST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Afclust);
		}
		
		if(EditFilter.IncludeOnsd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ONSD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Onsd);
		}
		
		if(EditFilter.IncludeEffc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EFFC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Effc);
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
		
		if(EditFilter.IncludeHcpnotetxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPNOTETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpnotetxt);
		}
		
		if(EditFilter.IncludeAllkupid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ALLKUPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Allkupid);
		}
		
		if(EditFilter.IncludeAelkupid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AELKUPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Aelkupid);
		}
		
		if(EditFilter.IncludeAsevlkupid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ASEVLKUPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Asevlkupid);
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
			AllergyRecord record = new AllergyRecord();
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
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Hcpnote = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNOTE"));
			record.Alcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALCODE"));
			record.Altext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALTEXT"));
			record.Alterm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALTERM"));
			record.Aclust = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACLUST"));
			record.Aefcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AEFCODE"));
			record.Aefterm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AEFTERM"));
			record.Aeftext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AEFTEXT"));
			record.Afclust = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AFCLUST"));
			record.Onsd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONSD"));
			record.Effc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EFFC"));
			record.Rhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCPTXT"));
			record.Rusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSRTXT"));
			record.Uhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCPTXT"));
			record.Uusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSRTXT"));
			record.Modutxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODUTXT"));
			record.Hcpnotetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNOTETXT"));
			record.Allkupid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALLKUPID"));
			record.Aelkupid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AELKUPID"));
			record.Asevlkupid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ASEVLKUPID"));
									
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
			AllergyRecord record = new AllergyRecord();
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
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Hcpnote = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNOTE"));
			record.Alcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALCODE"));
			record.Altext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALTEXT"));
			record.Alterm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALTERM"));
			record.Aclust = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACLUST"));
			record.Aefcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AEFCODE"));
			record.Aefterm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AEFTERM"));
			record.Aeftext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AEFTEXT"));
			record.Afclust = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AFCLUST"));
			record.Onsd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONSD"));
			record.Effc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EFFC"));
			record.Rhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCPTXT"));
			record.Rusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSRTXT"));
			record.Uhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCPTXT"));
			record.Uusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSRTXT"));
			record.Modutxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODUTXT"));
			record.Hcpnotetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNOTETXT"));
			record.Allkupid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALLKUPID"));
			record.Aelkupid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AELKUPID"));
			record.Asevlkupid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ASEVLKUPID"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class AllergyCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			AllergyRecord newRecord = new AllergyRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(AllergyRecord record)
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
		public AllergyRecord get(int index)
		{
			return (AllergyRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class AllergyRecord
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
		public String Tstp = "";
		public String Stat = "";
		public String Hcpnote = "";
		public String Alcode = "";
		public String Altext = "";
		public String Alterm = "";
		public String Aclust = "";
		public String Aefcode = "";
		public String Aefterm = "";
		public String Aeftext = "";
		public String Afclust = "";
		public String Onsd = "";
		public String Effc = "";
		public String Rhcptxt = "";
		public String Rusrtxt = "";
		public String Uhcptxt = "";
		public String Uusrtxt = "";
		public String Modutxt = "";
		public String Hcpnotetxt = "";
		public String Allkupid = "";
		public String Aelkupid = "";
		public String Asevlkupid = "";
				
		
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
			Tstp = "";
			Stat = "";
			Hcpnote = "";
			Alcode = "";
			Altext = "";
			Alterm = "";
			Aclust = "";
			Aefcode = "";
			Aefterm = "";
			Aeftext = "";
			Afclust = "";
			Onsd = "";
			Effc = "";
			Rhcptxt = "";
			Rusrtxt = "";
			Uhcptxt = "";
			Uusrtxt = "";
			Modutxt = "";
			Hcpnotetxt = "";
			Allkupid = "";
			Aelkupid = "";
			Asevlkupid = "";
			
		}		
	}
		
		
	public final class AllergyFilter
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
		public String Tstp = "";
		public String Stat = "";
		public String Hcpnote = "";
		public String Alcode = "";
		public String Altext = "";
		public String Alterm = "";
		public String Aclust = "";
		public String Aefcode = "";
		public String Aefterm = "";
		public String Aeftext = "";
		public String Afclust = "";
		public String Onsd = "";
		public String Effc = "";
		public String Rhcptxt = "";
		public String Rusrtxt = "";
		public String Uhcptxt = "";
		public String Uusrtxt = "";
		public String Modutxt = "";
		public String Hcpnotetxt = "";
		public String Allkupid = "";
		public String Aelkupid = "";
		public String Asevlkupid = "";
		
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
			Tstp = "";
			Stat = "";
			Hcpnote = "";
			Alcode = "";
			Altext = "";
			Alterm = "";
			Aclust = "";
			Aefcode = "";
			Aefterm = "";
			Aeftext = "";
			Afclust = "";
			Onsd = "";
			Effc = "";
			Rhcptxt = "";
			Rusrtxt = "";
			Uhcptxt = "";
			Uusrtxt = "";
			Modutxt = "";
			Hcpnotetxt = "";
			Allkupid = "";
			Aelkupid = "";
			Asevlkupid = "";
		}	
		public AllergyFilter cloneObject()
		{
			AllergyFilter newFilter = new AllergyFilter();
			
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
			newFilter.Tstp = this.Tstp;
			newFilter.Stat = this.Stat;
			newFilter.Hcpnote = this.Hcpnote;
			newFilter.Alcode = this.Alcode;
			newFilter.Altext = this.Altext;
			newFilter.Alterm = this.Alterm;
			newFilter.Aclust = this.Aclust;
			newFilter.Aefcode = this.Aefcode;
			newFilter.Aefterm = this.Aefterm;
			newFilter.Aeftext = this.Aeftext;
			newFilter.Afclust = this.Afclust;
			newFilter.Onsd = this.Onsd;
			newFilter.Effc = this.Effc;
			newFilter.Rhcptxt = this.Rhcptxt;
			newFilter.Rusrtxt = this.Rusrtxt;
			newFilter.Uhcptxt = this.Uhcptxt;
			newFilter.Uusrtxt = this.Uusrtxt;
			newFilter.Modutxt = this.Modutxt;
			newFilter.Hcpnotetxt = this.Hcpnotetxt;
			newFilter.Allkupid = this.Allkupid;
			newFilter.Aelkupid = this.Aelkupid;
			newFilter.Asevlkupid = this.Asevlkupid;
			
			return newFilter;
		}
	}
	public final class AllergyEditFilter
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
		public boolean IncludeTstp = true;
		public boolean IncludeStat = true;
		public boolean IncludeHcpnote = true;
		public boolean IncludeAlcode = true;
		public boolean IncludeAltext = true;
		public boolean IncludeAlterm = true;
		public boolean IncludeAclust = true;
		public boolean IncludeAefcode = true;
		public boolean IncludeAefterm = true;
		public boolean IncludeAeftext = true;
		public boolean IncludeAfclust = true;
		public boolean IncludeOnsd = true;
		public boolean IncludeEffc = true;
		public boolean IncludeRhcptxt = true;
		public boolean IncludeRusrtxt = true;
		public boolean IncludeUhcptxt = true;
		public boolean IncludeUusrtxt = true;
		public boolean IncludeModutxt = true;
		public boolean IncludeHcpnotetxt = true;
		public boolean IncludeAllkupid = true;
		public boolean IncludeAelkupid = true;
		public boolean IncludeAsevlkupid = true;
		
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
			IncludeTstp = true;
			IncludeStat = true;
			IncludeHcpnote = true;
			IncludeAlcode = true;
			IncludeAltext = true;
			IncludeAlterm = true;
			IncludeAclust = true;
			IncludeAefcode = true;
			IncludeAefterm = true;
			IncludeAeftext = true;
			IncludeAfclust = true;
			IncludeOnsd = true;
			IncludeEffc = true;
			IncludeRhcptxt = true;
			IncludeRusrtxt = true;
			IncludeUhcptxt = true;
			IncludeUusrtxt = true;
			IncludeModutxt = true;
			IncludeHcpnotetxt = true;
			IncludeAllkupid = true;
			IncludeAelkupid = true;
			IncludeAsevlkupid = true;
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
			IncludeTstp = false;
			IncludeStat = false;
			IncludeHcpnote = false;
			IncludeAlcode = false;
			IncludeAltext = false;
			IncludeAlterm = false;
			IncludeAclust = false;
			IncludeAefcode = false;
			IncludeAefterm = false;
			IncludeAeftext = false;
			IncludeAfclust = false;
			IncludeOnsd = false;
			IncludeEffc = false;
			IncludeRhcptxt = false;
			IncludeRusrtxt = false;
			IncludeUhcptxt = false;
			IncludeUusrtxt = false;
			IncludeModutxt = false;
			IncludeHcpnotetxt = false;
			IncludeAllkupid = false;
			IncludeAelkupid = false;
			IncludeAsevlkupid = false;
		}
		public AllergyEditFilter cloneObject()
		{
			AllergyEditFilter newEditFilter = new AllergyEditFilter();
			
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
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeStat = this.IncludeStat;
			newEditFilter.IncludeHcpnote = this.IncludeHcpnote;
			newEditFilter.IncludeAlcode = this.IncludeAlcode;
			newEditFilter.IncludeAltext = this.IncludeAltext;
			newEditFilter.IncludeAlterm = this.IncludeAlterm;
			newEditFilter.IncludeAclust = this.IncludeAclust;
			newEditFilter.IncludeAefcode = this.IncludeAefcode;
			newEditFilter.IncludeAefterm = this.IncludeAefterm;
			newEditFilter.IncludeAeftext = this.IncludeAeftext;
			newEditFilter.IncludeAfclust = this.IncludeAfclust;
			newEditFilter.IncludeOnsd = this.IncludeOnsd;
			newEditFilter.IncludeEffc = this.IncludeEffc;
			newEditFilter.IncludeRhcptxt = this.IncludeRhcptxt;
			newEditFilter.IncludeRusrtxt = this.IncludeRusrtxt;
			newEditFilter.IncludeUhcptxt = this.IncludeUhcptxt;
			newEditFilter.IncludeUusrtxt = this.IncludeUusrtxt;
			newEditFilter.IncludeModutxt = this.IncludeModutxt;
			newEditFilter.IncludeHcpnotetxt = this.IncludeHcpnotetxt;
			newEditFilter.IncludeAllkupid = this.IncludeAllkupid;
			newEditFilter.IncludeAelkupid = this.IncludeAelkupid;
			newEditFilter.IncludeAsevlkupid = this.IncludeAsevlkupid;
			
			return newEditFilter;
		}
	}
}
