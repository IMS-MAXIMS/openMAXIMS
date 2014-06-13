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

public final class Mhc_family_social
{
	private Mhc_family_socialFilter lastGetFilter = null;
	private final String serviceName = "MHC_FAMILY_SOCIAL";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Mhc_family_socialFilter Filter = new Mhc_family_socialFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Mhc_family_socialEditFilter EditFilter = new Mhc_family_socialEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Mhc_family_socialCollection DataCollection = new Mhc_family_socialCollection();

	/**
	 * Creates a new Mhc_family_social Data Transfer Object.
	 */ 
	public Mhc_family_social(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Mhc_family_social cloneObject() throws ims.dto.Exception
	{
		Mhc_family_social cloneObject = new Mhc_family_social(Connection);
			
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
			cloneObject.DataCollection.get(index).Ccs_epid = DataCollection.get(x).Ccs_epid;
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Rhcp = DataCollection.get(x).Rhcp;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Uhcp = DataCollection.get(x).Uhcp;
			cloneObject.DataCollection.get(index).Modu = DataCollection.get(x).Modu;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Surname = DataCollection.get(x).Surname;
			cloneObject.DataCollection.get(index).Forename = DataCollection.get(x).Forename;
			cloneObject.DataCollection.get(index).Adrress1 = DataCollection.get(x).Adrress1;
			cloneObject.DataCollection.get(index).Adrress2 = DataCollection.get(x).Adrress2;
			cloneObject.DataCollection.get(index).Adrress3 = DataCollection.get(x).Adrress3;
			cloneObject.DataCollection.get(index).Adrress4 = DataCollection.get(x).Adrress4;
			cloneObject.DataCollection.get(index).Postcode = DataCollection.get(x).Postcode;
			cloneObject.DataCollection.get(index).Phone = DataCollection.get(x).Phone;
			cloneObject.DataCollection.get(index).Homecontact = DataCollection.get(x).Homecontact;
			cloneObject.DataCollection.get(index).Homemessage = DataCollection.get(x).Homemessage;
			cloneObject.DataCollection.get(index).Mobilephone = DataCollection.get(x).Mobilephone;
			cloneObject.DataCollection.get(index).Mobilecontact = DataCollection.get(x).Mobilecontact;
			cloneObject.DataCollection.get(index).Mobilemessage = DataCollection.get(x).Mobilemessage;
			cloneObject.DataCollection.get(index).Workphone = DataCollection.get(x).Workphone;
			cloneObject.DataCollection.get(index).Workcontact = DataCollection.get(x).Workcontact;
			cloneObject.DataCollection.get(index).Workmessage = DataCollection.get(x).Workmessage;
			cloneObject.DataCollection.get(index).Email = DataCollection.get(x).Email;
			cloneObject.DataCollection.get(index).Emailcontact = DataCollection.get(x).Emailcontact;
			cloneObject.DataCollection.get(index).Relationship = DataCollection.get(x).Relationship;
			cloneObject.DataCollection.get(index).Ageband = DataCollection.get(x).Ageband;
			cloneObject.DataCollection.get(index).Deceased = DataCollection.get(x).Deceased;
			cloneObject.DataCollection.get(index).Permcontact = DataCollection.get(x).Permcontact;
			cloneObject.DataCollection.get(index).Maincarer = DataCollection.get(x).Maincarer;
			cloneObject.DataCollection.get(index).Employment = DataCollection.get(x).Employment;
			cloneObject.DataCollection.get(index).Occupation = DataCollection.get(x).Occupation;
			cloneObject.DataCollection.get(index).Freqcontact = DataCollection.get(x).Freqcontact;
			cloneObject.DataCollection.get(index).Emrgncy = DataCollection.get(x).Emrgncy;
			cloneObject.DataCollection.get(index).Aware = DataCollection.get(x).Aware;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Well = DataCollection.get(x).Well;
			cloneObject.DataCollection.get(index).Potconflict = DataCollection.get(x).Potconflict;
			cloneObject.DataCollection.get(index).Relgbelief = DataCollection.get(x).Relgbelief;
			cloneObject.DataCollection.get(index).Attitudetopat = DataCollection.get(x).Attitudetopat;
			cloneObject.DataCollection.get(index).Copeskills = DataCollection.get(x).Copeskills;
			cloneObject.DataCollection.get(index).Rhcptxt = DataCollection.get(x).Rhcptxt;
			cloneObject.DataCollection.get(index).Uhcptxt = DataCollection.get(x).Uhcptxt;
							
			
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
		return "Mhc_family_social.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_family_social.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Mhc_family_social.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_family_social.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_family_social.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_family_social.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Mhc_family_social.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Mhc_family_social.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_family_social.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Mhc_family_social.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Mhc_family_social.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Mhc_family_social.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Mhc_family_social.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Mhc_family_social.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_family_social.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Mhc_family_social.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Mhc_family_social.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Mhc_family_social.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Mhc_family_social.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Mhc_family_social.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_family_social.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Mhc_family_social.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Mhc_family_social.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_family_social.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Mhc_family_social.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Mhc_family_social.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Mhc_family_social.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Mhc_family_social.List");
							
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
	private String encodeNASFilter(Mhc_family_socialFilter filter)
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
		
		if(Filter.Ccs_epid != null && filter.Ccs_epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccs_epid;
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
		
		if(Filter.Rhcp != null && filter.Rhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rhcp;
		}
		
		if(Filter.Uusr != null && filter.Uusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uusr;
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
		
		if(Filter.Modu != null && filter.Modu.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modu;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Active != null && filter.Active.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Active;
		}
		
		if(Filter.Surname != null && filter.Surname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SURNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Surname;
		}
		
		if(Filter.Forename != null && filter.Forename.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FORENAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Forename;
		}
		
		if(Filter.Adrress1 != null && filter.Adrress1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADRRESS1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adrress1;
		}
		
		if(Filter.Adrress2 != null && filter.Adrress2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADRRESS2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adrress2;
		}
		
		if(Filter.Adrress3 != null && filter.Adrress3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADRRESS3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adrress3;
		}
		
		if(Filter.Adrress4 != null && filter.Adrress4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADRRESS4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adrress4;
		}
		
		if(Filter.Postcode != null && filter.Postcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "POSTCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Postcode;
		}
		
		if(Filter.Phone != null && filter.Phone.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PHONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Phone;
		}
		
		if(Filter.Homecontact != null && filter.Homecontact.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HOMECONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Homecontact;
		}
		
		if(Filter.Homemessage != null && filter.Homemessage.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HOMEMESSAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Homemessage;
		}
		
		if(Filter.Mobilephone != null && filter.Mobilephone.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MOBILEPHONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mobilephone;
		}
		
		if(Filter.Mobilecontact != null && filter.Mobilecontact.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MOBILECONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mobilecontact;
		}
		
		if(Filter.Mobilemessage != null && filter.Mobilemessage.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MOBILEMESSAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mobilemessage;
		}
		
		if(Filter.Workphone != null && filter.Workphone.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WORKPHONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Workphone;
		}
		
		if(Filter.Workcontact != null && filter.Workcontact.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WORKCONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Workcontact;
		}
		
		if(Filter.Workmessage != null && filter.Workmessage.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WORKMESSAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Workmessage;
		}
		
		if(Filter.Email != null && filter.Email.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EMAIL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Email;
		}
		
		if(Filter.Emailcontact != null && filter.Emailcontact.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EMAILCONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Emailcontact;
		}
		
		if(Filter.Relationship != null && filter.Relationship.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RELATIONSHIP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Relationship;
		}
		
		if(Filter.Ageband != null && filter.Ageband.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AGEBAND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ageband;
		}
		
		if(Filter.Deceased != null && filter.Deceased.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DECEASED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Deceased;
		}
		
		if(Filter.Permcontact != null && filter.Permcontact.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PERMCONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Permcontact;
		}
		
		if(Filter.Maincarer != null && filter.Maincarer.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAINCARER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Maincarer;
		}
		
		if(Filter.Employment != null && filter.Employment.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EMPLOYMENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Employment;
		}
		
		if(Filter.Occupation != null && filter.Occupation.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OCCUPATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Occupation;
		}
		
		if(Filter.Freqcontact != null && filter.Freqcontact.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FREQCONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Freqcontact;
		}
		
		if(Filter.Emrgncy != null && filter.Emrgncy.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EMRGNCY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Emrgncy;
		}
		
		if(Filter.Aware != null && filter.Aware.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AWARE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Aware;
		}
		
		if(Filter.Dob != null && filter.Dob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dob;
		}
		
		if(Filter.Well != null && filter.Well.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WELL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Well;
		}
		
		if(Filter.Potconflict != null && filter.Potconflict.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "POTCONFLICT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Potconflict;
		}
		
		if(Filter.Relgbelief != null && filter.Relgbelief.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RELGBELIEF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Relgbelief;
		}
		
		if(Filter.Attitudetopat != null && filter.Attitudetopat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ATTITUDETOPAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Attitudetopat;
		}
		
		if(Filter.Copeskills != null && filter.Copeskills.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COPESKILLS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Copeskills;
		}
		
		if(Filter.Rhcptxt != null && filter.Rhcptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rhcptxt;
		}
		
		if(Filter.Uhcptxt != null && filter.Uhcptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uhcptxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Mhc_family_socialRecord data = (Mhc_family_socialRecord)DataCollection.get(0);
		
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
		
		if(EditFilter.IncludeCcs_epid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccs_epid);
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
		
		if(EditFilter.IncludeRhcp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rhcp);
		}
		
		if(EditFilter.IncludeUusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uusr);
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
		
		if(EditFilter.IncludeModu)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modu);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeActive)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Active);
		}
		
		if(EditFilter.IncludeSurname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SURNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Surname);
		}
		
		if(EditFilter.IncludeForename)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "FORENAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Forename);
		}
		
		if(EditFilter.IncludeAdrress1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADRRESS1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adrress1);
		}
		
		if(EditFilter.IncludeAdrress2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADRRESS2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adrress2);
		}
		
		if(EditFilter.IncludeAdrress3)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADRRESS3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adrress3);
		}
		
		if(EditFilter.IncludeAdrress4)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADRRESS4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adrress4);
		}
		
		if(EditFilter.IncludePostcode)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "POSTCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Postcode);
		}
		
		if(EditFilter.IncludePhone)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PHONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Phone);
		}
		
		if(EditFilter.IncludeHomecontact)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HOMECONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Homecontact);
		}
		
		if(EditFilter.IncludeHomemessage)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HOMEMESSAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Homemessage);
		}
		
		if(EditFilter.IncludeMobilephone)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MOBILEPHONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mobilephone);
		}
		
		if(EditFilter.IncludeMobilecontact)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MOBILECONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mobilecontact);
		}
		
		if(EditFilter.IncludeMobilemessage)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MOBILEMESSAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mobilemessage);
		}
		
		if(EditFilter.IncludeWorkphone)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WORKPHONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Workphone);
		}
		
		if(EditFilter.IncludeWorkcontact)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WORKCONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Workcontact);
		}
		
		if(EditFilter.IncludeWorkmessage)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WORKMESSAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Workmessage);
		}
		
		if(EditFilter.IncludeEmail)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EMAIL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Email);
		}
		
		if(EditFilter.IncludeEmailcontact)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EMAILCONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Emailcontact);
		}
		
		if(EditFilter.IncludeRelationship)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RELATIONSHIP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Relationship);
		}
		
		if(EditFilter.IncludeAgeband)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AGEBAND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ageband);
		}
		
		if(EditFilter.IncludeDeceased)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DECEASED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Deceased);
		}
		
		if(EditFilter.IncludePermcontact)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PERMCONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Permcontact);
		}
		
		if(EditFilter.IncludeMaincarer)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MAINCARER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Maincarer);
		}
		
		if(EditFilter.IncludeEmployment)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EMPLOYMENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Employment);
		}
		
		if(EditFilter.IncludeOccupation)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OCCUPATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Occupation);
		}
		
		if(EditFilter.IncludeFreqcontact)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "FREQCONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Freqcontact);
		}
		
		if(EditFilter.IncludeEmrgncy)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EMRGNCY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Emrgncy);
		}
		
		if(EditFilter.IncludeAware)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AWARE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Aware);
		}
		
		if(EditFilter.IncludeDob)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dob);
		}
		
		if(EditFilter.IncludeWell)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WELL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Well);
		}
		
		if(EditFilter.IncludePotconflict)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "POTCONFLICT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Potconflict);
		}
		
		if(EditFilter.IncludeRelgbelief)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RELGBELIEF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Relgbelief);
		}
		
		if(EditFilter.IncludeAttitudetopat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ATTITUDETOPAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Attitudetopat);
		}
		
		if(EditFilter.IncludeCopeskills)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COPESKILLS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Copeskills);
		}
		
		if(EditFilter.IncludeRhcptxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rhcptxt);
		}
		
		if(EditFilter.IncludeUhcptxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uhcptxt);
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
			Mhc_family_socialRecord record = new Mhc_family_socialRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Surname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SURNAME"));
			record.Forename = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FORENAME"));
			record.Adrress1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADRRESS1"));
			record.Adrress2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADRRESS2"));
			record.Adrress3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADRRESS3"));
			record.Adrress4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADRRESS4"));
			record.Postcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POSTCODE"));
			record.Phone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PHONE"));
			record.Homecontact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOMECONTACT"));
			record.Homemessage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOMEMESSAGE"));
			record.Mobilephone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOBILEPHONE"));
			record.Mobilecontact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOBILECONTACT"));
			record.Mobilemessage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOBILEMESSAGE"));
			record.Workphone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WORKPHONE"));
			record.Workcontact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WORKCONTACT"));
			record.Workmessage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WORKMESSAGE"));
			record.Email = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMAIL"));
			record.Emailcontact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMAILCONTACT"));
			record.Relationship = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELATIONSHIP"));
			record.Ageband = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AGEBAND"));
			record.Deceased = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DECEASED"));
			record.Permcontact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERMCONTACT"));
			record.Maincarer = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAINCARER"));
			record.Employment = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMPLOYMENT"));
			record.Occupation = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OCCUPATION"));
			record.Freqcontact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FREQCONTACT"));
			record.Emrgncy = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMRGNCY"));
			record.Aware = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AWARE"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Well = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WELL"));
			record.Potconflict = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POTCONFLICT"));
			record.Relgbelief = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELGBELIEF"));
			record.Attitudetopat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTITUDETOPAT"));
			record.Copeskills = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COPESKILLS"));
			record.Rhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCPTXT"));
			record.Uhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCPTXT"));
									
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
			Mhc_family_socialRecord record = new Mhc_family_socialRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Surname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SURNAME"));
			record.Forename = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FORENAME"));
			record.Adrress1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADRRESS1"));
			record.Adrress2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADRRESS2"));
			record.Adrress3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADRRESS3"));
			record.Adrress4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADRRESS4"));
			record.Postcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POSTCODE"));
			record.Phone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PHONE"));
			record.Homecontact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOMECONTACT"));
			record.Homemessage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOMEMESSAGE"));
			record.Mobilephone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOBILEPHONE"));
			record.Mobilecontact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOBILECONTACT"));
			record.Mobilemessage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOBILEMESSAGE"));
			record.Workphone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WORKPHONE"));
			record.Workcontact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WORKCONTACT"));
			record.Workmessage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WORKMESSAGE"));
			record.Email = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMAIL"));
			record.Emailcontact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMAILCONTACT"));
			record.Relationship = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELATIONSHIP"));
			record.Ageband = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AGEBAND"));
			record.Deceased = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DECEASED"));
			record.Permcontact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PERMCONTACT"));
			record.Maincarer = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAINCARER"));
			record.Employment = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMPLOYMENT"));
			record.Occupation = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OCCUPATION"));
			record.Freqcontact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FREQCONTACT"));
			record.Emrgncy = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMRGNCY"));
			record.Aware = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AWARE"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Well = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WELL"));
			record.Potconflict = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POTCONFLICT"));
			record.Relgbelief = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELGBELIEF"));
			record.Attitudetopat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTITUDETOPAT"));
			record.Copeskills = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COPESKILLS"));
			record.Rhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCPTXT"));
			record.Uhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCPTXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Mhc_family_socialCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Mhc_family_socialRecord newRecord = new Mhc_family_socialRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Mhc_family_socialRecord record)
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
		public Mhc_family_socialRecord get(int index)
		{
			return (Mhc_family_socialRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Mhc_family_socialRecord
	{
		public String Unid = "";
		public String Pkey = "";
		public String Ccs_epid = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Rhcp = "";
		public String Uusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Modu = "";
		public String Tstp = "";
		public String Active = "";
		public String Surname = "";
		public String Forename = "";
		public String Adrress1 = "";
		public String Adrress2 = "";
		public String Adrress3 = "";
		public String Adrress4 = "";
		public String Postcode = "";
		public String Phone = "";
		public String Homecontact = "";
		public String Homemessage = "";
		public String Mobilephone = "";
		public String Mobilecontact = "";
		public String Mobilemessage = "";
		public String Workphone = "";
		public String Workcontact = "";
		public String Workmessage = "";
		public String Email = "";
		public String Emailcontact = "";
		public String Relationship = "";
		public String Ageband = "";
		public String Deceased = "";
		public String Permcontact = "";
		public String Maincarer = "";
		public String Employment = "";
		public String Occupation = "";
		public String Freqcontact = "";
		public String Emrgncy = "";
		public String Aware = "";
		public String Dob = "";
		public String Well = "";
		public String Potconflict = "";
		public String Relgbelief = "";
		public String Attitudetopat = "";
		public String Copeskills = "";
		public String Rhcptxt = "";
		public String Uhcptxt = "";
				
		
		public void clear()
		{
			Unid = "";
			Pkey = "";
			Ccs_epid = "";
			Cdat = "";
			Ctim = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Rhcp = "";
			Uusr = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Modu = "";
			Tstp = "";
			Active = "";
			Surname = "";
			Forename = "";
			Adrress1 = "";
			Adrress2 = "";
			Adrress3 = "";
			Adrress4 = "";
			Postcode = "";
			Phone = "";
			Homecontact = "";
			Homemessage = "";
			Mobilephone = "";
			Mobilecontact = "";
			Mobilemessage = "";
			Workphone = "";
			Workcontact = "";
			Workmessage = "";
			Email = "";
			Emailcontact = "";
			Relationship = "";
			Ageband = "";
			Deceased = "";
			Permcontact = "";
			Maincarer = "";
			Employment = "";
			Occupation = "";
			Freqcontact = "";
			Emrgncy = "";
			Aware = "";
			Dob = "";
			Well = "";
			Potconflict = "";
			Relgbelief = "";
			Attitudetopat = "";
			Copeskills = "";
			Rhcptxt = "";
			Uhcptxt = "";
			
		}		
	}
		
		
	public final class Mhc_family_socialFilter
	{			
		public String Unid = "";
		public String Pkey = "";
		public String Ccs_epid = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Rhcp = "";
		public String Uusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Modu = "";
		public String Tstp = "";
		public String Active = "";
		public String Surname = "";
		public String Forename = "";
		public String Adrress1 = "";
		public String Adrress2 = "";
		public String Adrress3 = "";
		public String Adrress4 = "";
		public String Postcode = "";
		public String Phone = "";
		public String Homecontact = "";
		public String Homemessage = "";
		public String Mobilephone = "";
		public String Mobilecontact = "";
		public String Mobilemessage = "";
		public String Workphone = "";
		public String Workcontact = "";
		public String Workmessage = "";
		public String Email = "";
		public String Emailcontact = "";
		public String Relationship = "";
		public String Ageband = "";
		public String Deceased = "";
		public String Permcontact = "";
		public String Maincarer = "";
		public String Employment = "";
		public String Occupation = "";
		public String Freqcontact = "";
		public String Emrgncy = "";
		public String Aware = "";
		public String Dob = "";
		public String Well = "";
		public String Potconflict = "";
		public String Relgbelief = "";
		public String Attitudetopat = "";
		public String Copeskills = "";
		public String Rhcptxt = "";
		public String Uhcptxt = "";
		
		public void clear()
		{				
			Unid = "";
			Pkey = "";
			Ccs_epid = "";
			Cdat = "";
			Ctim = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Rhcp = "";
			Uusr = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Modu = "";
			Tstp = "";
			Active = "";
			Surname = "";
			Forename = "";
			Adrress1 = "";
			Adrress2 = "";
			Adrress3 = "";
			Adrress4 = "";
			Postcode = "";
			Phone = "";
			Homecontact = "";
			Homemessage = "";
			Mobilephone = "";
			Mobilecontact = "";
			Mobilemessage = "";
			Workphone = "";
			Workcontact = "";
			Workmessage = "";
			Email = "";
			Emailcontact = "";
			Relationship = "";
			Ageband = "";
			Deceased = "";
			Permcontact = "";
			Maincarer = "";
			Employment = "";
			Occupation = "";
			Freqcontact = "";
			Emrgncy = "";
			Aware = "";
			Dob = "";
			Well = "";
			Potconflict = "";
			Relgbelief = "";
			Attitudetopat = "";
			Copeskills = "";
			Rhcptxt = "";
			Uhcptxt = "";
		}	
		public Mhc_family_socialFilter cloneObject()
		{
			Mhc_family_socialFilter newFilter = new Mhc_family_socialFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Pkey = this.Pkey;
			newFilter.Ccs_epid = this.Ccs_epid;
			newFilter.Cdat = this.Cdat;
			newFilter.Ctim = this.Ctim;
			newFilter.Rusr = this.Rusr;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Rhcp = this.Rhcp;
			newFilter.Uusr = this.Uusr;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Uhcp = this.Uhcp;
			newFilter.Modu = this.Modu;
			newFilter.Tstp = this.Tstp;
			newFilter.Active = this.Active;
			newFilter.Surname = this.Surname;
			newFilter.Forename = this.Forename;
			newFilter.Adrress1 = this.Adrress1;
			newFilter.Adrress2 = this.Adrress2;
			newFilter.Adrress3 = this.Adrress3;
			newFilter.Adrress4 = this.Adrress4;
			newFilter.Postcode = this.Postcode;
			newFilter.Phone = this.Phone;
			newFilter.Homecontact = this.Homecontact;
			newFilter.Homemessage = this.Homemessage;
			newFilter.Mobilephone = this.Mobilephone;
			newFilter.Mobilecontact = this.Mobilecontact;
			newFilter.Mobilemessage = this.Mobilemessage;
			newFilter.Workphone = this.Workphone;
			newFilter.Workcontact = this.Workcontact;
			newFilter.Workmessage = this.Workmessage;
			newFilter.Email = this.Email;
			newFilter.Emailcontact = this.Emailcontact;
			newFilter.Relationship = this.Relationship;
			newFilter.Ageband = this.Ageband;
			newFilter.Deceased = this.Deceased;
			newFilter.Permcontact = this.Permcontact;
			newFilter.Maincarer = this.Maincarer;
			newFilter.Employment = this.Employment;
			newFilter.Occupation = this.Occupation;
			newFilter.Freqcontact = this.Freqcontact;
			newFilter.Emrgncy = this.Emrgncy;
			newFilter.Aware = this.Aware;
			newFilter.Dob = this.Dob;
			newFilter.Well = this.Well;
			newFilter.Potconflict = this.Potconflict;
			newFilter.Relgbelief = this.Relgbelief;
			newFilter.Attitudetopat = this.Attitudetopat;
			newFilter.Copeskills = this.Copeskills;
			newFilter.Rhcptxt = this.Rhcptxt;
			newFilter.Uhcptxt = this.Uhcptxt;
			
			return newFilter;
		}
	}
	public final class Mhc_family_socialEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludePkey = true;
		public boolean IncludeCcs_epid = true;
		public boolean IncludeCdat = true;
		public boolean IncludeCtim = true;
		public boolean IncludeRusr = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeRhcp = true;
		public boolean IncludeUusr = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeUhcp = true;
		public boolean IncludeModu = true;
		public boolean IncludeTstp = true;
		public boolean IncludeActive = true;
		public boolean IncludeSurname = true;
		public boolean IncludeForename = true;
		public boolean IncludeAdrress1 = true;
		public boolean IncludeAdrress2 = true;
		public boolean IncludeAdrress3 = true;
		public boolean IncludeAdrress4 = true;
		public boolean IncludePostcode = true;
		public boolean IncludePhone = true;
		public boolean IncludeHomecontact = true;
		public boolean IncludeHomemessage = true;
		public boolean IncludeMobilephone = true;
		public boolean IncludeMobilecontact = true;
		public boolean IncludeMobilemessage = true;
		public boolean IncludeWorkphone = true;
		public boolean IncludeWorkcontact = true;
		public boolean IncludeWorkmessage = true;
		public boolean IncludeEmail = true;
		public boolean IncludeEmailcontact = true;
		public boolean IncludeRelationship = true;
		public boolean IncludeAgeband = true;
		public boolean IncludeDeceased = true;
		public boolean IncludePermcontact = true;
		public boolean IncludeMaincarer = true;
		public boolean IncludeEmployment = true;
		public boolean IncludeOccupation = true;
		public boolean IncludeFreqcontact = true;
		public boolean IncludeEmrgncy = true;
		public boolean IncludeAware = true;
		public boolean IncludeDob = true;
		public boolean IncludeWell = true;
		public boolean IncludePotconflict = true;
		public boolean IncludeRelgbelief = true;
		public boolean IncludeAttitudetopat = true;
		public boolean IncludeCopeskills = true;
		public boolean IncludeRhcptxt = true;
		public boolean IncludeUhcptxt = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludePkey = true;
			IncludeCcs_epid = true;
			IncludeCdat = true;
			IncludeCtim = true;
			IncludeRusr = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeRhcp = true;
			IncludeUusr = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeUhcp = true;
			IncludeModu = true;
			IncludeTstp = true;
			IncludeActive = true;
			IncludeSurname = true;
			IncludeForename = true;
			IncludeAdrress1 = true;
			IncludeAdrress2 = true;
			IncludeAdrress3 = true;
			IncludeAdrress4 = true;
			IncludePostcode = true;
			IncludePhone = true;
			IncludeHomecontact = true;
			IncludeHomemessage = true;
			IncludeMobilephone = true;
			IncludeMobilecontact = true;
			IncludeMobilemessage = true;
			IncludeWorkphone = true;
			IncludeWorkcontact = true;
			IncludeWorkmessage = true;
			IncludeEmail = true;
			IncludeEmailcontact = true;
			IncludeRelationship = true;
			IncludeAgeband = true;
			IncludeDeceased = true;
			IncludePermcontact = true;
			IncludeMaincarer = true;
			IncludeEmployment = true;
			IncludeOccupation = true;
			IncludeFreqcontact = true;
			IncludeEmrgncy = true;
			IncludeAware = true;
			IncludeDob = true;
			IncludeWell = true;
			IncludePotconflict = true;
			IncludeRelgbelief = true;
			IncludeAttitudetopat = true;
			IncludeCopeskills = true;
			IncludeRhcptxt = true;
			IncludeUhcptxt = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludePkey = false;
			IncludeCcs_epid = false;
			IncludeCdat = false;
			IncludeCtim = false;
			IncludeRusr = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeRhcp = false;
			IncludeUusr = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeUhcp = false;
			IncludeModu = false;
			IncludeTstp = false;
			IncludeActive = false;
			IncludeSurname = false;
			IncludeForename = false;
			IncludeAdrress1 = false;
			IncludeAdrress2 = false;
			IncludeAdrress3 = false;
			IncludeAdrress4 = false;
			IncludePostcode = false;
			IncludePhone = false;
			IncludeHomecontact = false;
			IncludeHomemessage = false;
			IncludeMobilephone = false;
			IncludeMobilecontact = false;
			IncludeMobilemessage = false;
			IncludeWorkphone = false;
			IncludeWorkcontact = false;
			IncludeWorkmessage = false;
			IncludeEmail = false;
			IncludeEmailcontact = false;
			IncludeRelationship = false;
			IncludeAgeband = false;
			IncludeDeceased = false;
			IncludePermcontact = false;
			IncludeMaincarer = false;
			IncludeEmployment = false;
			IncludeOccupation = false;
			IncludeFreqcontact = false;
			IncludeEmrgncy = false;
			IncludeAware = false;
			IncludeDob = false;
			IncludeWell = false;
			IncludePotconflict = false;
			IncludeRelgbelief = false;
			IncludeAttitudetopat = false;
			IncludeCopeskills = false;
			IncludeRhcptxt = false;
			IncludeUhcptxt = false;
		}
		public Mhc_family_socialEditFilter cloneObject()
		{
			Mhc_family_socialEditFilter newEditFilter = new Mhc_family_socialEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeCcs_epid = this.IncludeCcs_epid;
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeRhcp = this.IncludeRhcp;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeUhcp = this.IncludeUhcp;
			newEditFilter.IncludeModu = this.IncludeModu;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeActive = this.IncludeActive;
			newEditFilter.IncludeSurname = this.IncludeSurname;
			newEditFilter.IncludeForename = this.IncludeForename;
			newEditFilter.IncludeAdrress1 = this.IncludeAdrress1;
			newEditFilter.IncludeAdrress2 = this.IncludeAdrress2;
			newEditFilter.IncludeAdrress3 = this.IncludeAdrress3;
			newEditFilter.IncludeAdrress4 = this.IncludeAdrress4;
			newEditFilter.IncludePostcode = this.IncludePostcode;
			newEditFilter.IncludePhone = this.IncludePhone;
			newEditFilter.IncludeHomecontact = this.IncludeHomecontact;
			newEditFilter.IncludeHomemessage = this.IncludeHomemessage;
			newEditFilter.IncludeMobilephone = this.IncludeMobilephone;
			newEditFilter.IncludeMobilecontact = this.IncludeMobilecontact;
			newEditFilter.IncludeMobilemessage = this.IncludeMobilemessage;
			newEditFilter.IncludeWorkphone = this.IncludeWorkphone;
			newEditFilter.IncludeWorkcontact = this.IncludeWorkcontact;
			newEditFilter.IncludeWorkmessage = this.IncludeWorkmessage;
			newEditFilter.IncludeEmail = this.IncludeEmail;
			newEditFilter.IncludeEmailcontact = this.IncludeEmailcontact;
			newEditFilter.IncludeRelationship = this.IncludeRelationship;
			newEditFilter.IncludeAgeband = this.IncludeAgeband;
			newEditFilter.IncludeDeceased = this.IncludeDeceased;
			newEditFilter.IncludePermcontact = this.IncludePermcontact;
			newEditFilter.IncludeMaincarer = this.IncludeMaincarer;
			newEditFilter.IncludeEmployment = this.IncludeEmployment;
			newEditFilter.IncludeOccupation = this.IncludeOccupation;
			newEditFilter.IncludeFreqcontact = this.IncludeFreqcontact;
			newEditFilter.IncludeEmrgncy = this.IncludeEmrgncy;
			newEditFilter.IncludeAware = this.IncludeAware;
			newEditFilter.IncludeDob = this.IncludeDob;
			newEditFilter.IncludeWell = this.IncludeWell;
			newEditFilter.IncludePotconflict = this.IncludePotconflict;
			newEditFilter.IncludeRelgbelief = this.IncludeRelgbelief;
			newEditFilter.IncludeAttitudetopat = this.IncludeAttitudetopat;
			newEditFilter.IncludeCopeskills = this.IncludeCopeskills;
			newEditFilter.IncludeRhcptxt = this.IncludeRhcptxt;
			newEditFilter.IncludeUhcptxt = this.IncludeUhcptxt;
			
			return newEditFilter;
		}
	}
}
