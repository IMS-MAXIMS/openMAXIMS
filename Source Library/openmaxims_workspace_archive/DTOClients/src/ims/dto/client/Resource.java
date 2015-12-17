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

public final class Resource implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Resource.class);
	
	private ResourceFilter lastGetFilter = null;
	private final String serviceName = "RESOURCE";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public ResourceFilter Filter = new ResourceFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public ResourceEditFilter EditFilter = new ResourceEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public ResourceCollection DataCollection = new ResourceCollection();

	/**
	 * Creates a new Resource Data Transfer Object.
	 */ 
	public Resource(ims.dto.Connection connection)
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
	public Resource cloneObject()
	{
		Resource cloneObject = new Resource(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Rsno = DataCollection.get(x).Rsno;
			cloneObject.DataCollection.get(index).Name = DataCollection.get(x).Name;
			cloneObject.DataCollection.get(index).Code = DataCollection.get(x).Code;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).Srcc = DataCollection.get(x).Srcc;
			cloneObject.DataCollection.get(index).Type = DataCollection.get(x).Type;
			cloneObject.DataCollection.get(index).Adnm = DataCollection.get(x).Adnm;
			cloneObject.DataCollection.get(index).Surname = DataCollection.get(x).Surname;
			cloneObject.DataCollection.get(index).Restype = DataCollection.get(x).Restype;
			cloneObject.DataCollection.get(index).Adr1 = DataCollection.get(x).Adr1;
			cloneObject.DataCollection.get(index).Adr2 = DataCollection.get(x).Adr2;
			cloneObject.DataCollection.get(index).Adr3 = DataCollection.get(x).Adr3;
			cloneObject.DataCollection.get(index).Adr4 = DataCollection.get(x).Adr4;
			cloneObject.DataCollection.get(index).Tel = DataCollection.get(x).Tel;
			cloneObject.DataCollection.get(index).Ext = DataCollection.get(x).Ext;
			cloneObject.DataCollection.get(index).Tel2 = DataCollection.get(x).Tel2;
			cloneObject.DataCollection.get(index).Ext2 = DataCollection.get(x).Ext2;
			cloneObject.DataCollection.get(index).Bleep = DataCollection.get(x).Bleep;
			cloneObject.DataCollection.get(index).Pcod = DataCollection.get(x).Pcod;
			cloneObject.DataCollection.get(index).Email = DataCollection.get(x).Email;
			cloneObject.DataCollection.get(index).Icws_insert = DataCollection.get(x).Icws_insert;
			cloneObject.DataCollection.get(index).At01 = DataCollection.get(x).At01;
			cloneObject.DataCollection.get(index).At02 = DataCollection.get(x).At02;
			cloneObject.DataCollection.get(index).At03 = DataCollection.get(x).At03;
			cloneObject.DataCollection.get(index).At04 = DataCollection.get(x).At04;
			cloneObject.DataCollection.get(index).At05 = DataCollection.get(x).At05;
			cloneObject.DataCollection.get(index).At06 = DataCollection.get(x).At06;
			cloneObject.DataCollection.get(index).At07 = DataCollection.get(x).At07;
			cloneObject.DataCollection.get(index).At08 = DataCollection.get(x).At08;
			cloneObject.DataCollection.get(index).At09 = DataCollection.get(x).At09;
			cloneObject.DataCollection.get(index).At10 = DataCollection.get(x).At10;
			cloneObject.DataCollection.get(index).At11 = DataCollection.get(x).At11;
			cloneObject.DataCollection.get(index).At12 = DataCollection.get(x).At12;
			cloneObject.DataCollection.get(index).At13 = DataCollection.get(x).At13;
			cloneObject.DataCollection.get(index).At14 = DataCollection.get(x).At14;
			cloneObject.DataCollection.get(index).At15 = DataCollection.get(x).At15;
			cloneObject.DataCollection.get(index).At16 = DataCollection.get(x).At16;
			cloneObject.DataCollection.get(index).At17 = DataCollection.get(x).At17;
			cloneObject.DataCollection.get(index).At18 = DataCollection.get(x).At18;
			cloneObject.DataCollection.get(index).At19 = DataCollection.get(x).At19;
			cloneObject.DataCollection.get(index).At20 = DataCollection.get(x).At20;
			cloneObject.DataCollection.get(index).At21 = DataCollection.get(x).At21;
			cloneObject.DataCollection.get(index).At22 = DataCollection.get(x).At22;
			cloneObject.DataCollection.get(index).At23 = DataCollection.get(x).At23;
			cloneObject.DataCollection.get(index).At24 = DataCollection.get(x).At24;
			cloneObject.DataCollection.get(index).At25 = DataCollection.get(x).At25;
			cloneObject.DataCollection.get(index).At26 = DataCollection.get(x).At26;
			cloneObject.DataCollection.get(index).At27 = DataCollection.get(x).At27;
			cloneObject.DataCollection.get(index).At28 = DataCollection.get(x).At28;
			cloneObject.DataCollection.get(index).At29 = DataCollection.get(x).At29;
			cloneObject.DataCollection.get(index).At30 = DataCollection.get(x).At30;
			cloneObject.DataCollection.get(index).At31 = DataCollection.get(x).At31;
			cloneObject.DataCollection.get(index).At32 = DataCollection.get(x).At32;
			cloneObject.DataCollection.get(index).At33 = DataCollection.get(x).At33;
			cloneObject.DataCollection.get(index).At34 = DataCollection.get(x).At34;
			cloneObject.DataCollection.get(index).At35 = DataCollection.get(x).At35;
			cloneObject.DataCollection.get(index).At36 = DataCollection.get(x).At36;
			cloneObject.DataCollection.get(index).At37 = DataCollection.get(x).At37;
			cloneObject.DataCollection.get(index).At38 = DataCollection.get(x).At38;
			cloneObject.DataCollection.get(index).At39 = DataCollection.get(x).At39;
			cloneObject.DataCollection.get(index).At40 = DataCollection.get(x).At40;
			cloneObject.DataCollection.get(index).At41 = DataCollection.get(x).At41;
			cloneObject.DataCollection.get(index).At42 = DataCollection.get(x).At42;
			cloneObject.DataCollection.get(index).At43 = DataCollection.get(x).At43;
			cloneObject.DataCollection.get(index).At44 = DataCollection.get(x).At44;
			cloneObject.DataCollection.get(index).At45 = DataCollection.get(x).At45;
			cloneObject.DataCollection.get(index).At46 = DataCollection.get(x).At46;
			cloneObject.DataCollection.get(index).At47 = DataCollection.get(x).At47;
			cloneObject.DataCollection.get(index).At48 = DataCollection.get(x).At48;
			cloneObject.DataCollection.get(index).Rsflocation = DataCollection.get(x).Rsflocation;
			cloneObject.DataCollection.get(index).Restypetxt = DataCollection.get(x).Restypetxt;
			cloneObject.DataCollection.get(index).Rsflocationtxt = DataCollection.get(x).Rsflocationtxt;
							
			
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
		return "Resource.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Resource.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Resource.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Resource.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Resource.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Resource.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Resource.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Resource.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Resource.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Resource.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Resource.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Resource.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Resource.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Resource.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Resource.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Resource.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Resource.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Resource.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Resource.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Resource.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Resource.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Resource.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Resource.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Resource.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Resource.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Resource.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Resource.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Resource nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Resource After NextList ");
				
		decodeNASMessage();		
		logger.debug("Resource After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Resource.List");
							
		listInProgress = true;	
		logger.debug("Resource Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Resource After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Resource After Parse Message");
		
						
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
	private String encodeNASFilter(ResourceFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Rsno != null && filter.Rsno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RSNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rsno);
		}
		
		if(Filter.Name != null && filter.Name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Name);
		}
		
		if(Filter.Code != null && filter.Code.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Code);
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat);
		}
		
		if(Filter.Srcc != null && filter.Srcc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SRCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Srcc);
		}
		
		if(Filter.Type != null && filter.Type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Type);
		}
		
		if(Filter.Adnm != null && filter.Adnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adnm);
		}
		
		if(Filter.Surname != null && filter.Surname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SURNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Surname);
		}
		
		if(Filter.Restype != null && filter.Restype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RESTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Restype);
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
		
		if(Filter.Tel != null && filter.Tel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tel);
		}
		
		if(Filter.Ext != null && filter.Ext.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ext);
		}
		
		if(Filter.Tel2 != null && filter.Tel2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TEL2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tel2);
		}
		
		if(Filter.Ext2 != null && filter.Ext2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EXT2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ext2);
		}
		
		if(Filter.Bleep != null && filter.Bleep.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("BLEEP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Bleep);
		}
		
		if(Filter.Pcod != null && filter.Pcod.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PCOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pcod);
		}
		
		if(Filter.Email != null && filter.Email.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EMAIL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Email);
		}
		
		if(Filter.Icws_insert != null && filter.Icws_insert.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ICWS_INSERT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Icws_insert);
		}
		
		if(Filter.At01 != null && filter.At01.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT01" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At01);
		}
		
		if(Filter.At02 != null && filter.At02.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT02" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At02);
		}
		
		if(Filter.At03 != null && filter.At03.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT03" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At03);
		}
		
		if(Filter.At04 != null && filter.At04.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT04" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At04);
		}
		
		if(Filter.At05 != null && filter.At05.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT05" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At05);
		}
		
		if(Filter.At06 != null && filter.At06.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT06" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At06);
		}
		
		if(Filter.At07 != null && filter.At07.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT07" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At07);
		}
		
		if(Filter.At08 != null && filter.At08.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT08" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At08);
		}
		
		if(Filter.At09 != null && filter.At09.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT09" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At09);
		}
		
		if(Filter.At10 != null && filter.At10.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT10" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At10);
		}
		
		if(Filter.At11 != null && filter.At11.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT11" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At11);
		}
		
		if(Filter.At12 != null && filter.At12.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT12" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At12);
		}
		
		if(Filter.At13 != null && filter.At13.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT13" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At13);
		}
		
		if(Filter.At14 != null && filter.At14.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT14" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At14);
		}
		
		if(Filter.At15 != null && filter.At15.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT15" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At15);
		}
		
		if(Filter.At16 != null && filter.At16.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT16" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At16);
		}
		
		if(Filter.At17 != null && filter.At17.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT17" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At17);
		}
		
		if(Filter.At18 != null && filter.At18.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT18" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At18);
		}
		
		if(Filter.At19 != null && filter.At19.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT19" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At19);
		}
		
		if(Filter.At20 != null && filter.At20.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT20" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At20);
		}
		
		if(Filter.At21 != null && filter.At21.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT21" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At21);
		}
		
		if(Filter.At22 != null && filter.At22.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT22" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At22);
		}
		
		if(Filter.At23 != null && filter.At23.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT23" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At23);
		}
		
		if(Filter.At24 != null && filter.At24.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT24" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At24);
		}
		
		if(Filter.At25 != null && filter.At25.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT25" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At25);
		}
		
		if(Filter.At26 != null && filter.At26.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT26" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At26);
		}
		
		if(Filter.At27 != null && filter.At27.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT27" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At27);
		}
		
		if(Filter.At28 != null && filter.At28.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT28" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At28);
		}
		
		if(Filter.At29 != null && filter.At29.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT29" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At29);
		}
		
		if(Filter.At30 != null && filter.At30.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT30" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At30);
		}
		
		if(Filter.At31 != null && filter.At31.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT31" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At31);
		}
		
		if(Filter.At32 != null && filter.At32.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT32" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At32);
		}
		
		if(Filter.At33 != null && filter.At33.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT33" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At33);
		}
		
		if(Filter.At34 != null && filter.At34.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT34" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At34);
		}
		
		if(Filter.At35 != null && filter.At35.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT35" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At35);
		}
		
		if(Filter.At36 != null && filter.At36.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT36" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At36);
		}
		
		if(Filter.At37 != null && filter.At37.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT37" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At37);
		}
		
		if(Filter.At38 != null && filter.At38.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT38" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At38);
		}
		
		if(Filter.At39 != null && filter.At39.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT39" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At39);
		}
		
		if(Filter.At40 != null && filter.At40.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT40" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At40);
		}
		
		if(Filter.At41 != null && filter.At41.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT41" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At41);
		}
		
		if(Filter.At42 != null && filter.At42.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT42" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At42);
		}
		
		if(Filter.At43 != null && filter.At43.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT43" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At43);
		}
		
		if(Filter.At44 != null && filter.At44.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT44" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At44);
		}
		
		if(Filter.At45 != null && filter.At45.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT45" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At45);
		}
		
		if(Filter.At46 != null && filter.At46.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT46" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At46);
		}
		
		if(Filter.At47 != null && filter.At47.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT47" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At47);
		}
		
		if(Filter.At48 != null && filter.At48.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AT48" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At48);
		}
		
		if(Filter.Rsflocation != null && filter.Rsflocation.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RSFLOCATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rsflocation);
		}
		
		if(Filter.Restypetxt != null && filter.Restypetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RESTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Restypetxt);
		}
		
		if(Filter.Rsflocationtxt != null && filter.Rsflocationtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RSFLOCATIONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rsflocationtxt);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		ResourceRecord data = (ResourceRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeRsno)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RSNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rsno));
		}
		
		if(EditFilter.IncludeName)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Name));
		}
		
		if(EditFilter.IncludeCode)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Code));
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat));
		}
		
		if(EditFilter.IncludeSrcc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SRCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Srcc));
		}
		
		if(EditFilter.IncludeType)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Type));
		}
		
		if(EditFilter.IncludeAdnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adnm));
		}
		
		if(EditFilter.IncludeSurname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SURNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Surname));
		}
		
		if(EditFilter.IncludeRestype)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Restype));
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
		
		if(EditFilter.IncludeTel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tel));
		}
		
		if(EditFilter.IncludeExt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ext));
		}
		
		if(EditFilter.IncludeTel2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TEL2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tel2));
		}
		
		if(EditFilter.IncludeExt2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EXT2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ext2));
		}
		
		if(EditFilter.IncludeBleep)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("BLEEP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Bleep));
		}
		
		if(EditFilter.IncludePcod)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PCOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pcod));
		}
		
		if(EditFilter.IncludeEmail)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EMAIL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Email));
		}
		
		if(EditFilter.IncludeIcws_insert)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ICWS_INSERT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Icws_insert));
		}
		
		if(EditFilter.IncludeAt01)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT01" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At01));
		}
		
		if(EditFilter.IncludeAt02)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT02" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At02));
		}
		
		if(EditFilter.IncludeAt03)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT03" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At03));
		}
		
		if(EditFilter.IncludeAt04)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT04" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At04));
		}
		
		if(EditFilter.IncludeAt05)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT05" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At05));
		}
		
		if(EditFilter.IncludeAt06)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT06" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At06));
		}
		
		if(EditFilter.IncludeAt07)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT07" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At07));
		}
		
		if(EditFilter.IncludeAt08)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT08" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At08));
		}
		
		if(EditFilter.IncludeAt09)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT09" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At09));
		}
		
		if(EditFilter.IncludeAt10)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT10" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At10));
		}
		
		if(EditFilter.IncludeAt11)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT11" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At11));
		}
		
		if(EditFilter.IncludeAt12)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT12" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At12));
		}
		
		if(EditFilter.IncludeAt13)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT13" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At13));
		}
		
		if(EditFilter.IncludeAt14)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT14" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At14));
		}
		
		if(EditFilter.IncludeAt15)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT15" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At15));
		}
		
		if(EditFilter.IncludeAt16)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT16" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At16));
		}
		
		if(EditFilter.IncludeAt17)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT17" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At17));
		}
		
		if(EditFilter.IncludeAt18)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT18" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At18));
		}
		
		if(EditFilter.IncludeAt19)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT19" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At19));
		}
		
		if(EditFilter.IncludeAt20)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT20" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At20));
		}
		
		if(EditFilter.IncludeAt21)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT21" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At21));
		}
		
		if(EditFilter.IncludeAt22)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT22" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At22));
		}
		
		if(EditFilter.IncludeAt23)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT23" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At23));
		}
		
		if(EditFilter.IncludeAt24)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT24" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At24));
		}
		
		if(EditFilter.IncludeAt25)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT25" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At25));
		}
		
		if(EditFilter.IncludeAt26)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT26" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At26));
		}
		
		if(EditFilter.IncludeAt27)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT27" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At27));
		}
		
		if(EditFilter.IncludeAt28)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT28" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At28));
		}
		
		if(EditFilter.IncludeAt29)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT29" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At29));
		}
		
		if(EditFilter.IncludeAt30)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT30" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At30));
		}
		
		if(EditFilter.IncludeAt31)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT31" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At31));
		}
		
		if(EditFilter.IncludeAt32)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT32" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At32));
		}
		
		if(EditFilter.IncludeAt33)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT33" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At33));
		}
		
		if(EditFilter.IncludeAt34)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT34" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At34));
		}
		
		if(EditFilter.IncludeAt35)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT35" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At35));
		}
		
		if(EditFilter.IncludeAt36)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT36" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At36));
		}
		
		if(EditFilter.IncludeAt37)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT37" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At37));
		}
		
		if(EditFilter.IncludeAt38)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT38" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At38));
		}
		
		if(EditFilter.IncludeAt39)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT39" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At39));
		}
		
		if(EditFilter.IncludeAt40)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT40" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At40));
		}
		
		if(EditFilter.IncludeAt41)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT41" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At41));
		}
		
		if(EditFilter.IncludeAt42)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT42" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At42));
		}
		
		if(EditFilter.IncludeAt43)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT43" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At43));
		}
		
		if(EditFilter.IncludeAt44)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT44" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At44));
		}
		
		if(EditFilter.IncludeAt45)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT45" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At45));
		}
		
		if(EditFilter.IncludeAt46)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT46" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At46));
		}
		
		if(EditFilter.IncludeAt47)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT47" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At47));
		}
		
		if(EditFilter.IncludeAt48)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AT48" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At48));
		}
		
		if(EditFilter.IncludeRsflocation)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RSFLOCATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rsflocation));
		}
		
		if(EditFilter.IncludeRestypetxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Restypetxt));
		}
		
		if(EditFilter.IncludeRsflocationtxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RSFLOCATIONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rsflocationtxt));
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
			ResourceRecord record = new ResourceRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSNO"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CODE"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Srcc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRCC"));
			record.Type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TYPE"));
			record.Adnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADNM"));
			record.Surname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SURNAME"));
			record.Restype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESTYPE"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Tel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEL"));
			record.Ext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXT"));
			record.Tel2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEL2"));
			record.Ext2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXT2"));
			record.Bleep = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BLEEP"));
			record.Pcod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCOD"));
			record.Email = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMAIL"));
			record.Icws_insert = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ICWS_INSERT"));
			record.At01 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT01"));
			record.At02 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT02"));
			record.At03 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT03"));
			record.At04 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT04"));
			record.At05 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT05"));
			record.At06 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT06"));
			record.At07 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT07"));
			record.At08 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT08"));
			record.At09 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT09"));
			record.At10 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT10"));
			record.At11 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT11"));
			record.At12 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT12"));
			record.At13 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT13"));
			record.At14 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT14"));
			record.At15 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT15"));
			record.At16 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT16"));
			record.At17 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT17"));
			record.At18 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT18"));
			record.At19 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT19"));
			record.At20 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT20"));
			record.At21 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT21"));
			record.At22 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT22"));
			record.At23 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT23"));
			record.At24 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT24"));
			record.At25 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT25"));
			record.At26 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT26"));
			record.At27 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT27"));
			record.At28 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT28"));
			record.At29 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT29"));
			record.At30 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT30"));
			record.At31 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT31"));
			record.At32 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT32"));
			record.At33 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT33"));
			record.At34 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT34"));
			record.At35 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT35"));
			record.At36 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT36"));
			record.At37 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT37"));
			record.At38 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT38"));
			record.At39 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT39"));
			record.At40 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT40"));
			record.At41 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT41"));
			record.At42 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT42"));
			record.At43 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT43"));
			record.At44 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT44"));
			record.At45 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT45"));
			record.At46 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT46"));
			record.At47 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT47"));
			record.At48 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT48"));
			record.Rsflocation = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSFLOCATION"));
			record.Restypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESTYPETXT"));
			record.Rsflocationtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSFLOCATIONTXT"));
									
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
			ResourceRecord record = new ResourceRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSNO"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CODE"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Srcc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRCC"));
			record.Type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TYPE"));
			record.Adnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADNM"));
			record.Surname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SURNAME"));
			record.Restype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESTYPE"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Tel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEL"));
			record.Ext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXT"));
			record.Tel2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEL2"));
			record.Ext2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXT2"));
			record.Bleep = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BLEEP"));
			record.Pcod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCOD"));
			record.Email = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMAIL"));
			record.Icws_insert = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ICWS_INSERT"));
			record.At01 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT01"));
			record.At02 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT02"));
			record.At03 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT03"));
			record.At04 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT04"));
			record.At05 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT05"));
			record.At06 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT06"));
			record.At07 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT07"));
			record.At08 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT08"));
			record.At09 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT09"));
			record.At10 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT10"));
			record.At11 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT11"));
			record.At12 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT12"));
			record.At13 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT13"));
			record.At14 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT14"));
			record.At15 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT15"));
			record.At16 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT16"));
			record.At17 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT17"));
			record.At18 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT18"));
			record.At19 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT19"));
			record.At20 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT20"));
			record.At21 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT21"));
			record.At22 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT22"));
			record.At23 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT23"));
			record.At24 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT24"));
			record.At25 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT25"));
			record.At26 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT26"));
			record.At27 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT27"));
			record.At28 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT28"));
			record.At29 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT29"));
			record.At30 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT30"));
			record.At31 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT31"));
			record.At32 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT32"));
			record.At33 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT33"));
			record.At34 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT34"));
			record.At35 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT35"));
			record.At36 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT36"));
			record.At37 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT37"));
			record.At38 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT38"));
			record.At39 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT39"));
			record.At40 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT40"));
			record.At41 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT41"));
			record.At42 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT42"));
			record.At43 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT43"));
			record.At44 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT44"));
			record.At45 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT45"));
			record.At46 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT46"));
			record.At47 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT47"));
			record.At48 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT48"));
			record.Rsflocation = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSFLOCATION"));
			record.Restypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESTYPETXT"));
			record.Rsflocationtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSFLOCATIONTXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class ResourceCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			ResourceRecord newRecord = new ResourceRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(ResourceRecord record)
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
		public ResourceRecord get(int index)
		{
			return (ResourceRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class ResourceRecord
	{
		public String Rsno = "";
		public String Name = "";
		public String Code = "";
		public String Stat = "";
		public String Srcc = "";
		public String Type = "";
		public String Adnm = "";
		public String Surname = "";
		public String Restype = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Tel = "";
		public String Ext = "";
		public String Tel2 = "";
		public String Ext2 = "";
		public String Bleep = "";
		public String Pcod = "";
		public String Email = "";
		public String Icws_insert = "";
		public String At01 = "";
		public String At02 = "";
		public String At03 = "";
		public String At04 = "";
		public String At05 = "";
		public String At06 = "";
		public String At07 = "";
		public String At08 = "";
		public String At09 = "";
		public String At10 = "";
		public String At11 = "";
		public String At12 = "";
		public String At13 = "";
		public String At14 = "";
		public String At15 = "";
		public String At16 = "";
		public String At17 = "";
		public String At18 = "";
		public String At19 = "";
		public String At20 = "";
		public String At21 = "";
		public String At22 = "";
		public String At23 = "";
		public String At24 = "";
		public String At25 = "";
		public String At26 = "";
		public String At27 = "";
		public String At28 = "";
		public String At29 = "";
		public String At30 = "";
		public String At31 = "";
		public String At32 = "";
		public String At33 = "";
		public String At34 = "";
		public String At35 = "";
		public String At36 = "";
		public String At37 = "";
		public String At38 = "";
		public String At39 = "";
		public String At40 = "";
		public String At41 = "";
		public String At42 = "";
		public String At43 = "";
		public String At44 = "";
		public String At45 = "";
		public String At46 = "";
		public String At47 = "";
		public String At48 = "";
		public String Rsflocation = "";
		public String Restypetxt = "";
		public String Rsflocationtxt = "";
				
		
		public void clear()
		{
			Rsno = "";
			Name = "";
			Code = "";
			Stat = "";
			Srcc = "";
			Type = "";
			Adnm = "";
			Surname = "";
			Restype = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Tel = "";
			Ext = "";
			Tel2 = "";
			Ext2 = "";
			Bleep = "";
			Pcod = "";
			Email = "";
			Icws_insert = "";
			At01 = "";
			At02 = "";
			At03 = "";
			At04 = "";
			At05 = "";
			At06 = "";
			At07 = "";
			At08 = "";
			At09 = "";
			At10 = "";
			At11 = "";
			At12 = "";
			At13 = "";
			At14 = "";
			At15 = "";
			At16 = "";
			At17 = "";
			At18 = "";
			At19 = "";
			At20 = "";
			At21 = "";
			At22 = "";
			At23 = "";
			At24 = "";
			At25 = "";
			At26 = "";
			At27 = "";
			At28 = "";
			At29 = "";
			At30 = "";
			At31 = "";
			At32 = "";
			At33 = "";
			At34 = "";
			At35 = "";
			At36 = "";
			At37 = "";
			At38 = "";
			At39 = "";
			At40 = "";
			At41 = "";
			At42 = "";
			At43 = "";
			At44 = "";
			At45 = "";
			At46 = "";
			At47 = "";
			At48 = "";
			Rsflocation = "";
			Restypetxt = "";
			Rsflocationtxt = "";
			
		}		
	}
		
		
	public final class ResourceFilter
	{			
		public String Rsno = "";
		public String Name = "";
		public String Code = "";
		public String Stat = "";
		public String Srcc = "";
		public String Type = "";
		public String Adnm = "";
		public String Surname = "";
		public String Restype = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Tel = "";
		public String Ext = "";
		public String Tel2 = "";
		public String Ext2 = "";
		public String Bleep = "";
		public String Pcod = "";
		public String Email = "";
		public String Icws_insert = "";
		public String At01 = "";
		public String At02 = "";
		public String At03 = "";
		public String At04 = "";
		public String At05 = "";
		public String At06 = "";
		public String At07 = "";
		public String At08 = "";
		public String At09 = "";
		public String At10 = "";
		public String At11 = "";
		public String At12 = "";
		public String At13 = "";
		public String At14 = "";
		public String At15 = "";
		public String At16 = "";
		public String At17 = "";
		public String At18 = "";
		public String At19 = "";
		public String At20 = "";
		public String At21 = "";
		public String At22 = "";
		public String At23 = "";
		public String At24 = "";
		public String At25 = "";
		public String At26 = "";
		public String At27 = "";
		public String At28 = "";
		public String At29 = "";
		public String At30 = "";
		public String At31 = "";
		public String At32 = "";
		public String At33 = "";
		public String At34 = "";
		public String At35 = "";
		public String At36 = "";
		public String At37 = "";
		public String At38 = "";
		public String At39 = "";
		public String At40 = "";
		public String At41 = "";
		public String At42 = "";
		public String At43 = "";
		public String At44 = "";
		public String At45 = "";
		public String At46 = "";
		public String At47 = "";
		public String At48 = "";
		public String Rsflocation = "";
		public String Restypetxt = "";
		public String Rsflocationtxt = "";
		
		public void clear()
		{				
			Rsno = "";
			Name = "";
			Code = "";
			Stat = "";
			Srcc = "";
			Type = "";
			Adnm = "";
			Surname = "";
			Restype = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Tel = "";
			Ext = "";
			Tel2 = "";
			Ext2 = "";
			Bleep = "";
			Pcod = "";
			Email = "";
			Icws_insert = "";
			At01 = "";
			At02 = "";
			At03 = "";
			At04 = "";
			At05 = "";
			At06 = "";
			At07 = "";
			At08 = "";
			At09 = "";
			At10 = "";
			At11 = "";
			At12 = "";
			At13 = "";
			At14 = "";
			At15 = "";
			At16 = "";
			At17 = "";
			At18 = "";
			At19 = "";
			At20 = "";
			At21 = "";
			At22 = "";
			At23 = "";
			At24 = "";
			At25 = "";
			At26 = "";
			At27 = "";
			At28 = "";
			At29 = "";
			At30 = "";
			At31 = "";
			At32 = "";
			At33 = "";
			At34 = "";
			At35 = "";
			At36 = "";
			At37 = "";
			At38 = "";
			At39 = "";
			At40 = "";
			At41 = "";
			At42 = "";
			At43 = "";
			At44 = "";
			At45 = "";
			At46 = "";
			At47 = "";
			At48 = "";
			Rsflocation = "";
			Restypetxt = "";
			Rsflocationtxt = "";
		}	
		public ResourceFilter cloneObject()
		{
			ResourceFilter newFilter = new ResourceFilter();
			
			newFilter.Rsno = this.Rsno;
			newFilter.Name = this.Name;
			newFilter.Code = this.Code;
			newFilter.Stat = this.Stat;
			newFilter.Srcc = this.Srcc;
			newFilter.Type = this.Type;
			newFilter.Adnm = this.Adnm;
			newFilter.Surname = this.Surname;
			newFilter.Restype = this.Restype;
			newFilter.Adr1 = this.Adr1;
			newFilter.Adr2 = this.Adr2;
			newFilter.Adr3 = this.Adr3;
			newFilter.Adr4 = this.Adr4;
			newFilter.Tel = this.Tel;
			newFilter.Ext = this.Ext;
			newFilter.Tel2 = this.Tel2;
			newFilter.Ext2 = this.Ext2;
			newFilter.Bleep = this.Bleep;
			newFilter.Pcod = this.Pcod;
			newFilter.Email = this.Email;
			newFilter.Icws_insert = this.Icws_insert;
			newFilter.At01 = this.At01;
			newFilter.At02 = this.At02;
			newFilter.At03 = this.At03;
			newFilter.At04 = this.At04;
			newFilter.At05 = this.At05;
			newFilter.At06 = this.At06;
			newFilter.At07 = this.At07;
			newFilter.At08 = this.At08;
			newFilter.At09 = this.At09;
			newFilter.At10 = this.At10;
			newFilter.At11 = this.At11;
			newFilter.At12 = this.At12;
			newFilter.At13 = this.At13;
			newFilter.At14 = this.At14;
			newFilter.At15 = this.At15;
			newFilter.At16 = this.At16;
			newFilter.At17 = this.At17;
			newFilter.At18 = this.At18;
			newFilter.At19 = this.At19;
			newFilter.At20 = this.At20;
			newFilter.At21 = this.At21;
			newFilter.At22 = this.At22;
			newFilter.At23 = this.At23;
			newFilter.At24 = this.At24;
			newFilter.At25 = this.At25;
			newFilter.At26 = this.At26;
			newFilter.At27 = this.At27;
			newFilter.At28 = this.At28;
			newFilter.At29 = this.At29;
			newFilter.At30 = this.At30;
			newFilter.At31 = this.At31;
			newFilter.At32 = this.At32;
			newFilter.At33 = this.At33;
			newFilter.At34 = this.At34;
			newFilter.At35 = this.At35;
			newFilter.At36 = this.At36;
			newFilter.At37 = this.At37;
			newFilter.At38 = this.At38;
			newFilter.At39 = this.At39;
			newFilter.At40 = this.At40;
			newFilter.At41 = this.At41;
			newFilter.At42 = this.At42;
			newFilter.At43 = this.At43;
			newFilter.At44 = this.At44;
			newFilter.At45 = this.At45;
			newFilter.At46 = this.At46;
			newFilter.At47 = this.At47;
			newFilter.At48 = this.At48;
			newFilter.Rsflocation = this.Rsflocation;
			newFilter.Restypetxt = this.Restypetxt;
			newFilter.Rsflocationtxt = this.Rsflocationtxt;
			
			return newFilter;
		}
	}
	public final class ResourceEditFilter
	{			
		public boolean IncludeRsno = true;
		public boolean IncludeName = true;
		public boolean IncludeCode = true;
		public boolean IncludeStat = true;
		public boolean IncludeSrcc = true;
		public boolean IncludeType = true;
		public boolean IncludeAdnm = true;
		public boolean IncludeSurname = true;
		public boolean IncludeRestype = true;
		public boolean IncludeAdr1 = true;
		public boolean IncludeAdr2 = true;
		public boolean IncludeAdr3 = true;
		public boolean IncludeAdr4 = true;
		public boolean IncludeTel = true;
		public boolean IncludeExt = true;
		public boolean IncludeTel2 = true;
		public boolean IncludeExt2 = true;
		public boolean IncludeBleep = true;
		public boolean IncludePcod = true;
		public boolean IncludeEmail = true;
		public boolean IncludeIcws_insert = true;
		public boolean IncludeAt01 = true;
		public boolean IncludeAt02 = true;
		public boolean IncludeAt03 = true;
		public boolean IncludeAt04 = true;
		public boolean IncludeAt05 = true;
		public boolean IncludeAt06 = true;
		public boolean IncludeAt07 = true;
		public boolean IncludeAt08 = true;
		public boolean IncludeAt09 = true;
		public boolean IncludeAt10 = true;
		public boolean IncludeAt11 = true;
		public boolean IncludeAt12 = true;
		public boolean IncludeAt13 = true;
		public boolean IncludeAt14 = true;
		public boolean IncludeAt15 = true;
		public boolean IncludeAt16 = true;
		public boolean IncludeAt17 = true;
		public boolean IncludeAt18 = true;
		public boolean IncludeAt19 = true;
		public boolean IncludeAt20 = true;
		public boolean IncludeAt21 = true;
		public boolean IncludeAt22 = true;
		public boolean IncludeAt23 = true;
		public boolean IncludeAt24 = true;
		public boolean IncludeAt25 = true;
		public boolean IncludeAt26 = true;
		public boolean IncludeAt27 = true;
		public boolean IncludeAt28 = true;
		public boolean IncludeAt29 = true;
		public boolean IncludeAt30 = true;
		public boolean IncludeAt31 = true;
		public boolean IncludeAt32 = true;
		public boolean IncludeAt33 = true;
		public boolean IncludeAt34 = true;
		public boolean IncludeAt35 = true;
		public boolean IncludeAt36 = true;
		public boolean IncludeAt37 = true;
		public boolean IncludeAt38 = true;
		public boolean IncludeAt39 = true;
		public boolean IncludeAt40 = true;
		public boolean IncludeAt41 = true;
		public boolean IncludeAt42 = true;
		public boolean IncludeAt43 = true;
		public boolean IncludeAt44 = true;
		public boolean IncludeAt45 = true;
		public boolean IncludeAt46 = true;
		public boolean IncludeAt47 = true;
		public boolean IncludeAt48 = true;
		public boolean IncludeRsflocation = true;
		public boolean IncludeRestypetxt = true;
		public boolean IncludeRsflocationtxt = true;
		
		public void includeAll()
		{				
			IncludeRsno = true;
			IncludeName = true;
			IncludeCode = true;
			IncludeStat = true;
			IncludeSrcc = true;
			IncludeType = true;
			IncludeAdnm = true;
			IncludeSurname = true;
			IncludeRestype = true;
			IncludeAdr1 = true;
			IncludeAdr2 = true;
			IncludeAdr3 = true;
			IncludeAdr4 = true;
			IncludeTel = true;
			IncludeExt = true;
			IncludeTel2 = true;
			IncludeExt2 = true;
			IncludeBleep = true;
			IncludePcod = true;
			IncludeEmail = true;
			IncludeIcws_insert = true;
			IncludeAt01 = true;
			IncludeAt02 = true;
			IncludeAt03 = true;
			IncludeAt04 = true;
			IncludeAt05 = true;
			IncludeAt06 = true;
			IncludeAt07 = true;
			IncludeAt08 = true;
			IncludeAt09 = true;
			IncludeAt10 = true;
			IncludeAt11 = true;
			IncludeAt12 = true;
			IncludeAt13 = true;
			IncludeAt14 = true;
			IncludeAt15 = true;
			IncludeAt16 = true;
			IncludeAt17 = true;
			IncludeAt18 = true;
			IncludeAt19 = true;
			IncludeAt20 = true;
			IncludeAt21 = true;
			IncludeAt22 = true;
			IncludeAt23 = true;
			IncludeAt24 = true;
			IncludeAt25 = true;
			IncludeAt26 = true;
			IncludeAt27 = true;
			IncludeAt28 = true;
			IncludeAt29 = true;
			IncludeAt30 = true;
			IncludeAt31 = true;
			IncludeAt32 = true;
			IncludeAt33 = true;
			IncludeAt34 = true;
			IncludeAt35 = true;
			IncludeAt36 = true;
			IncludeAt37 = true;
			IncludeAt38 = true;
			IncludeAt39 = true;
			IncludeAt40 = true;
			IncludeAt41 = true;
			IncludeAt42 = true;
			IncludeAt43 = true;
			IncludeAt44 = true;
			IncludeAt45 = true;
			IncludeAt46 = true;
			IncludeAt47 = true;
			IncludeAt48 = true;
			IncludeRsflocation = true;
			IncludeRestypetxt = true;
			IncludeRsflocationtxt = true;
		}	
		public void excludeAll()
		{				
			IncludeRsno = false;
			IncludeName = false;
			IncludeCode = false;
			IncludeStat = false;
			IncludeSrcc = false;
			IncludeType = false;
			IncludeAdnm = false;
			IncludeSurname = false;
			IncludeRestype = false;
			IncludeAdr1 = false;
			IncludeAdr2 = false;
			IncludeAdr3 = false;
			IncludeAdr4 = false;
			IncludeTel = false;
			IncludeExt = false;
			IncludeTel2 = false;
			IncludeExt2 = false;
			IncludeBleep = false;
			IncludePcod = false;
			IncludeEmail = false;
			IncludeIcws_insert = false;
			IncludeAt01 = false;
			IncludeAt02 = false;
			IncludeAt03 = false;
			IncludeAt04 = false;
			IncludeAt05 = false;
			IncludeAt06 = false;
			IncludeAt07 = false;
			IncludeAt08 = false;
			IncludeAt09 = false;
			IncludeAt10 = false;
			IncludeAt11 = false;
			IncludeAt12 = false;
			IncludeAt13 = false;
			IncludeAt14 = false;
			IncludeAt15 = false;
			IncludeAt16 = false;
			IncludeAt17 = false;
			IncludeAt18 = false;
			IncludeAt19 = false;
			IncludeAt20 = false;
			IncludeAt21 = false;
			IncludeAt22 = false;
			IncludeAt23 = false;
			IncludeAt24 = false;
			IncludeAt25 = false;
			IncludeAt26 = false;
			IncludeAt27 = false;
			IncludeAt28 = false;
			IncludeAt29 = false;
			IncludeAt30 = false;
			IncludeAt31 = false;
			IncludeAt32 = false;
			IncludeAt33 = false;
			IncludeAt34 = false;
			IncludeAt35 = false;
			IncludeAt36 = false;
			IncludeAt37 = false;
			IncludeAt38 = false;
			IncludeAt39 = false;
			IncludeAt40 = false;
			IncludeAt41 = false;
			IncludeAt42 = false;
			IncludeAt43 = false;
			IncludeAt44 = false;
			IncludeAt45 = false;
			IncludeAt46 = false;
			IncludeAt47 = false;
			IncludeAt48 = false;
			IncludeRsflocation = false;
			IncludeRestypetxt = false;
			IncludeRsflocationtxt = false;
		}
		public ResourceEditFilter cloneObject()
		{
			ResourceEditFilter newEditFilter = new ResourceEditFilter();
			
			newEditFilter.IncludeRsno = this.IncludeRsno;
			newEditFilter.IncludeName = this.IncludeName;
			newEditFilter.IncludeCode = this.IncludeCode;
			newEditFilter.IncludeStat = this.IncludeStat;
			newEditFilter.IncludeSrcc = this.IncludeSrcc;
			newEditFilter.IncludeType = this.IncludeType;
			newEditFilter.IncludeAdnm = this.IncludeAdnm;
			newEditFilter.IncludeSurname = this.IncludeSurname;
			newEditFilter.IncludeRestype = this.IncludeRestype;
			newEditFilter.IncludeAdr1 = this.IncludeAdr1;
			newEditFilter.IncludeAdr2 = this.IncludeAdr2;
			newEditFilter.IncludeAdr3 = this.IncludeAdr3;
			newEditFilter.IncludeAdr4 = this.IncludeAdr4;
			newEditFilter.IncludeTel = this.IncludeTel;
			newEditFilter.IncludeExt = this.IncludeExt;
			newEditFilter.IncludeTel2 = this.IncludeTel2;
			newEditFilter.IncludeExt2 = this.IncludeExt2;
			newEditFilter.IncludeBleep = this.IncludeBleep;
			newEditFilter.IncludePcod = this.IncludePcod;
			newEditFilter.IncludeEmail = this.IncludeEmail;
			newEditFilter.IncludeIcws_insert = this.IncludeIcws_insert;
			newEditFilter.IncludeAt01 = this.IncludeAt01;
			newEditFilter.IncludeAt02 = this.IncludeAt02;
			newEditFilter.IncludeAt03 = this.IncludeAt03;
			newEditFilter.IncludeAt04 = this.IncludeAt04;
			newEditFilter.IncludeAt05 = this.IncludeAt05;
			newEditFilter.IncludeAt06 = this.IncludeAt06;
			newEditFilter.IncludeAt07 = this.IncludeAt07;
			newEditFilter.IncludeAt08 = this.IncludeAt08;
			newEditFilter.IncludeAt09 = this.IncludeAt09;
			newEditFilter.IncludeAt10 = this.IncludeAt10;
			newEditFilter.IncludeAt11 = this.IncludeAt11;
			newEditFilter.IncludeAt12 = this.IncludeAt12;
			newEditFilter.IncludeAt13 = this.IncludeAt13;
			newEditFilter.IncludeAt14 = this.IncludeAt14;
			newEditFilter.IncludeAt15 = this.IncludeAt15;
			newEditFilter.IncludeAt16 = this.IncludeAt16;
			newEditFilter.IncludeAt17 = this.IncludeAt17;
			newEditFilter.IncludeAt18 = this.IncludeAt18;
			newEditFilter.IncludeAt19 = this.IncludeAt19;
			newEditFilter.IncludeAt20 = this.IncludeAt20;
			newEditFilter.IncludeAt21 = this.IncludeAt21;
			newEditFilter.IncludeAt22 = this.IncludeAt22;
			newEditFilter.IncludeAt23 = this.IncludeAt23;
			newEditFilter.IncludeAt24 = this.IncludeAt24;
			newEditFilter.IncludeAt25 = this.IncludeAt25;
			newEditFilter.IncludeAt26 = this.IncludeAt26;
			newEditFilter.IncludeAt27 = this.IncludeAt27;
			newEditFilter.IncludeAt28 = this.IncludeAt28;
			newEditFilter.IncludeAt29 = this.IncludeAt29;
			newEditFilter.IncludeAt30 = this.IncludeAt30;
			newEditFilter.IncludeAt31 = this.IncludeAt31;
			newEditFilter.IncludeAt32 = this.IncludeAt32;
			newEditFilter.IncludeAt33 = this.IncludeAt33;
			newEditFilter.IncludeAt34 = this.IncludeAt34;
			newEditFilter.IncludeAt35 = this.IncludeAt35;
			newEditFilter.IncludeAt36 = this.IncludeAt36;
			newEditFilter.IncludeAt37 = this.IncludeAt37;
			newEditFilter.IncludeAt38 = this.IncludeAt38;
			newEditFilter.IncludeAt39 = this.IncludeAt39;
			newEditFilter.IncludeAt40 = this.IncludeAt40;
			newEditFilter.IncludeAt41 = this.IncludeAt41;
			newEditFilter.IncludeAt42 = this.IncludeAt42;
			newEditFilter.IncludeAt43 = this.IncludeAt43;
			newEditFilter.IncludeAt44 = this.IncludeAt44;
			newEditFilter.IncludeAt45 = this.IncludeAt45;
			newEditFilter.IncludeAt46 = this.IncludeAt46;
			newEditFilter.IncludeAt47 = this.IncludeAt47;
			newEditFilter.IncludeAt48 = this.IncludeAt48;
			newEditFilter.IncludeRsflocation = this.IncludeRsflocation;
			newEditFilter.IncludeRestypetxt = this.IncludeRestypetxt;
			newEditFilter.IncludeRsflocationtxt = this.IncludeRsflocationtxt;
			
			return newEditFilter;
		}
	}
}
