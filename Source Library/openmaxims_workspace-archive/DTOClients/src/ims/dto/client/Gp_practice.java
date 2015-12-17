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

public final class Gp_practice implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Gp_practice.class);
	
	private Gp_practiceFilter lastGetFilter = null;
	private final String serviceName = "GP_PRACTICE";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Gp_practiceFilter Filter = new Gp_practiceFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Gp_practiceEditFilter EditFilter = new Gp_practiceEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Gp_practiceCollection DataCollection = new Gp_practiceCollection();

	/**
	 * Creates a new Gp_practice Data Transfer Object.
	 */ 
	public Gp_practice(ims.dto.Connection connection)
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
	public Gp_practice cloneObject()
	{
		Gp_practice cloneObject = new Gp_practice(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Gp_code = DataCollection.get(x).Gp_code;
			cloneObject.DataCollection.get(index).Gp_practice_id = DataCollection.get(x).Gp_practice_id;
			cloneObject.DataCollection.get(index).Gp_id = DataCollection.get(x).Gp_id;
			cloneObject.DataCollection.get(index).Practice_id = DataCollection.get(x).Practice_id;
			cloneObject.DataCollection.get(index).Gp_surname = DataCollection.get(x).Gp_surname;
			cloneObject.DataCollection.get(index).Gp_first_name = DataCollection.get(x).Gp_first_name;
			cloneObject.DataCollection.get(index).Gp_title = DataCollection.get(x).Gp_title;
			cloneObject.DataCollection.get(index).Gp_phone_no = DataCollection.get(x).Gp_phone_no;
			cloneObject.DataCollection.get(index).Gp_mobile_no = DataCollection.get(x).Gp_mobile_no;
			cloneObject.DataCollection.get(index).Gp_email = DataCollection.get(x).Gp_email;
			cloneObject.DataCollection.get(index).Practice_name = DataCollection.get(x).Practice_name;
			cloneObject.DataCollection.get(index).Address_line1 = DataCollection.get(x).Address_line1;
			cloneObject.DataCollection.get(index).Address_line2 = DataCollection.get(x).Address_line2;
			cloneObject.DataCollection.get(index).Address_line3 = DataCollection.get(x).Address_line3;
			cloneObject.DataCollection.get(index).Address_line4 = DataCollection.get(x).Address_line4;
			cloneObject.DataCollection.get(index).Address_line5 = DataCollection.get(x).Address_line5;
			cloneObject.DataCollection.get(index).Practice_phone_no = DataCollection.get(x).Practice_phone_no;
			cloneObject.DataCollection.get(index).Practice_fax_no = DataCollection.get(x).Practice_fax_no;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision$";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Gp_practice.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp_practice.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Gp_practice.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp_practice.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp_practice.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp_practice.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Gp_practice.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Gp_practice.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp_practice.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Gp_practice.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Gp_practice.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Gp_practice.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Gp_practice.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Gp_practice.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp_practice.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Gp_practice.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Gp_practice.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Gp_practice.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Gp_practice.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Gp_practice.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp_practice.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Gp_practice.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Gp_practice.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp_practice.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Gp_practice.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Gp_practice.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Gp_practice.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Gp_practice nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Gp_practice After NextList ");
				
		decodeNASMessage();		
		logger.debug("Gp_practice After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp_practice.List");
							
		listInProgress = true;	
		logger.debug("Gp_practice Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Gp_practice After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Gp_practice After Parse Message");
		
						
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
	private String encodeNASFilter(Gp_practiceFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Gp_code != null && filter.Gp_code.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GP_CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gp_code);
		}
		
		if(Filter.Gp_practice_id != null && filter.Gp_practice_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GP_PRACTICE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gp_practice_id);
		}
		
		if(Filter.Gp_id != null && filter.Gp_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gp_id);
		}
		
		if(Filter.Practice_id != null && filter.Practice_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRACTICE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Practice_id);
		}
		
		if(Filter.Gp_surname != null && filter.Gp_surname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GP_SURNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gp_surname);
		}
		
		if(Filter.Gp_first_name != null && filter.Gp_first_name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GP_FIRST_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gp_first_name);
		}
		
		if(Filter.Gp_title != null && filter.Gp_title.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GP_TITLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gp_title);
		}
		
		if(Filter.Gp_phone_no != null && filter.Gp_phone_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GP_PHONE_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gp_phone_no);
		}
		
		if(Filter.Gp_mobile_no != null && filter.Gp_mobile_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GP_MOBILE_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gp_mobile_no);
		}
		
		if(Filter.Gp_email != null && filter.Gp_email.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GP_EMAIL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gp_email);
		}
		
		if(Filter.Practice_name != null && filter.Practice_name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRACTICE_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Practice_name);
		}
		
		if(Filter.Address_line1 != null && filter.Address_line1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADDRESS_LINE1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Address_line1);
		}
		
		if(Filter.Address_line2 != null && filter.Address_line2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADDRESS_LINE2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Address_line2);
		}
		
		if(Filter.Address_line3 != null && filter.Address_line3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADDRESS_LINE3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Address_line3);
		}
		
		if(Filter.Address_line4 != null && filter.Address_line4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADDRESS_LINE4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Address_line4);
		}
		
		if(Filter.Address_line5 != null && filter.Address_line5.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADDRESS_LINE5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Address_line5);
		}
		
		if(Filter.Practice_phone_no != null && filter.Practice_phone_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRACTICE_PHONE_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Practice_phone_no);
		}
		
		if(Filter.Practice_fax_no != null && filter.Practice_fax_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRACTICE_FAX_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Practice_fax_no);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		Gp_practiceRecord data = (Gp_practiceRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeGp_code)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GP_CODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gp_code));
		}
		
		if(EditFilter.IncludeGp_practice_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GP_PRACTICE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gp_practice_id));
		}
		
		if(EditFilter.IncludeGp_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gp_id));
		}
		
		if(EditFilter.IncludePractice_id)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRACTICE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Practice_id));
		}
		
		if(EditFilter.IncludeGp_surname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GP_SURNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gp_surname));
		}
		
		if(EditFilter.IncludeGp_first_name)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GP_FIRST_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gp_first_name));
		}
		
		if(EditFilter.IncludeGp_title)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GP_TITLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gp_title));
		}
		
		if(EditFilter.IncludeGp_phone_no)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GP_PHONE_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gp_phone_no));
		}
		
		if(EditFilter.IncludeGp_mobile_no)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GP_MOBILE_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gp_mobile_no));
		}
		
		if(EditFilter.IncludeGp_email)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GP_EMAIL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gp_email));
		}
		
		if(EditFilter.IncludePractice_name)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRACTICE_NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Practice_name));
		}
		
		if(EditFilter.IncludeAddress_line1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADDRESS_LINE1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Address_line1));
		}
		
		if(EditFilter.IncludeAddress_line2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADDRESS_LINE2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Address_line2));
		}
		
		if(EditFilter.IncludeAddress_line3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADDRESS_LINE3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Address_line3));
		}
		
		if(EditFilter.IncludeAddress_line4)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADDRESS_LINE4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Address_line4));
		}
		
		if(EditFilter.IncludeAddress_line5)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADDRESS_LINE5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Address_line5));
		}
		
		if(EditFilter.IncludePractice_phone_no)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRACTICE_PHONE_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Practice_phone_no));
		}
		
		if(EditFilter.IncludePractice_fax_no)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRACTICE_FAX_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Practice_fax_no));
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
			Gp_practiceRecord record = new Gp_practiceRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Gp_code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_CODE"));
			record.Gp_practice_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_PRACTICE_ID"));
			record.Gp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_ID"));
			record.Practice_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRACTICE_ID"));
			record.Gp_surname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_SURNAME"));
			record.Gp_first_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_FIRST_NAME"));
			record.Gp_title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_TITLE"));
			record.Gp_phone_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_PHONE_NO"));
			record.Gp_mobile_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_MOBILE_NO"));
			record.Gp_email = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_EMAIL"));
			record.Practice_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRACTICE_NAME"));
			record.Address_line1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDRESS_LINE1"));
			record.Address_line2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDRESS_LINE2"));
			record.Address_line3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDRESS_LINE3"));
			record.Address_line4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDRESS_LINE4"));
			record.Address_line5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDRESS_LINE5"));
			record.Practice_phone_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRACTICE_PHONE_NO"));
			record.Practice_fax_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRACTICE_FAX_NO"));
									
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
			Gp_practiceRecord record = new Gp_practiceRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Gp_code = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_CODE"));
			record.Gp_practice_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_PRACTICE_ID"));
			record.Gp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_ID"));
			record.Practice_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRACTICE_ID"));
			record.Gp_surname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_SURNAME"));
			record.Gp_first_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_FIRST_NAME"));
			record.Gp_title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_TITLE"));
			record.Gp_phone_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_PHONE_NO"));
			record.Gp_mobile_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_MOBILE_NO"));
			record.Gp_email = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GP_EMAIL"));
			record.Practice_name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRACTICE_NAME"));
			record.Address_line1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDRESS_LINE1"));
			record.Address_line2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDRESS_LINE2"));
			record.Address_line3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDRESS_LINE3"));
			record.Address_line4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDRESS_LINE4"));
			record.Address_line5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDRESS_LINE5"));
			record.Practice_phone_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRACTICE_PHONE_NO"));
			record.Practice_fax_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRACTICE_FAX_NO"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Gp_practiceCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Gp_practiceRecord newRecord = new Gp_practiceRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Gp_practiceRecord record)
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
		public Gp_practiceRecord get(int index)
		{
			return (Gp_practiceRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Gp_practiceRecord
	{
		public String Gp_code = "";
		public String Gp_practice_id = "";
		public String Gp_id = "";
		public String Practice_id = "";
		public String Gp_surname = "";
		public String Gp_first_name = "";
		public String Gp_title = "";
		public String Gp_phone_no = "";
		public String Gp_mobile_no = "";
		public String Gp_email = "";
		public String Practice_name = "";
		public String Address_line1 = "";
		public String Address_line2 = "";
		public String Address_line3 = "";
		public String Address_line4 = "";
		public String Address_line5 = "";
		public String Practice_phone_no = "";
		public String Practice_fax_no = "";
				
		
		public void clear()
		{
			Gp_code = "";
			Gp_practice_id = "";
			Gp_id = "";
			Practice_id = "";
			Gp_surname = "";
			Gp_first_name = "";
			Gp_title = "";
			Gp_phone_no = "";
			Gp_mobile_no = "";
			Gp_email = "";
			Practice_name = "";
			Address_line1 = "";
			Address_line2 = "";
			Address_line3 = "";
			Address_line4 = "";
			Address_line5 = "";
			Practice_phone_no = "";
			Practice_fax_no = "";
			
		}		
	}
		
		
	public final class Gp_practiceFilter
	{			
		public String Gp_code = "";
		public String Gp_practice_id = "";
		public String Gp_id = "";
		public String Practice_id = "";
		public String Gp_surname = "";
		public String Gp_first_name = "";
		public String Gp_title = "";
		public String Gp_phone_no = "";
		public String Gp_mobile_no = "";
		public String Gp_email = "";
		public String Practice_name = "";
		public String Address_line1 = "";
		public String Address_line2 = "";
		public String Address_line3 = "";
		public String Address_line4 = "";
		public String Address_line5 = "";
		public String Practice_phone_no = "";
		public String Practice_fax_no = "";
		
		public void clear()
		{				
			Gp_code = "";
			Gp_practice_id = "";
			Gp_id = "";
			Practice_id = "";
			Gp_surname = "";
			Gp_first_name = "";
			Gp_title = "";
			Gp_phone_no = "";
			Gp_mobile_no = "";
			Gp_email = "";
			Practice_name = "";
			Address_line1 = "";
			Address_line2 = "";
			Address_line3 = "";
			Address_line4 = "";
			Address_line5 = "";
			Practice_phone_no = "";
			Practice_fax_no = "";
		}	
		public Gp_practiceFilter cloneObject()
		{
			Gp_practiceFilter newFilter = new Gp_practiceFilter();
			
			newFilter.Gp_code = this.Gp_code;
			newFilter.Gp_practice_id = this.Gp_practice_id;
			newFilter.Gp_id = this.Gp_id;
			newFilter.Practice_id = this.Practice_id;
			newFilter.Gp_surname = this.Gp_surname;
			newFilter.Gp_first_name = this.Gp_first_name;
			newFilter.Gp_title = this.Gp_title;
			newFilter.Gp_phone_no = this.Gp_phone_no;
			newFilter.Gp_mobile_no = this.Gp_mobile_no;
			newFilter.Gp_email = this.Gp_email;
			newFilter.Practice_name = this.Practice_name;
			newFilter.Address_line1 = this.Address_line1;
			newFilter.Address_line2 = this.Address_line2;
			newFilter.Address_line3 = this.Address_line3;
			newFilter.Address_line4 = this.Address_line4;
			newFilter.Address_line5 = this.Address_line5;
			newFilter.Practice_phone_no = this.Practice_phone_no;
			newFilter.Practice_fax_no = this.Practice_fax_no;
			
			return newFilter;
		}
	}
	public final class Gp_practiceEditFilter
	{			
		public boolean IncludeGp_code = true;
		public boolean IncludeGp_practice_id = true;
		public boolean IncludeGp_id = true;
		public boolean IncludePractice_id = true;
		public boolean IncludeGp_surname = true;
		public boolean IncludeGp_first_name = true;
		public boolean IncludeGp_title = true;
		public boolean IncludeGp_phone_no = true;
		public boolean IncludeGp_mobile_no = true;
		public boolean IncludeGp_email = true;
		public boolean IncludePractice_name = true;
		public boolean IncludeAddress_line1 = true;
		public boolean IncludeAddress_line2 = true;
		public boolean IncludeAddress_line3 = true;
		public boolean IncludeAddress_line4 = true;
		public boolean IncludeAddress_line5 = true;
		public boolean IncludePractice_phone_no = true;
		public boolean IncludePractice_fax_no = true;
		
		public void includeAll()
		{				
			IncludeGp_code = true;
			IncludeGp_practice_id = true;
			IncludeGp_id = true;
			IncludePractice_id = true;
			IncludeGp_surname = true;
			IncludeGp_first_name = true;
			IncludeGp_title = true;
			IncludeGp_phone_no = true;
			IncludeGp_mobile_no = true;
			IncludeGp_email = true;
			IncludePractice_name = true;
			IncludeAddress_line1 = true;
			IncludeAddress_line2 = true;
			IncludeAddress_line3 = true;
			IncludeAddress_line4 = true;
			IncludeAddress_line5 = true;
			IncludePractice_phone_no = true;
			IncludePractice_fax_no = true;
		}	
		public void excludeAll()
		{				
			IncludeGp_code = false;
			IncludeGp_practice_id = false;
			IncludeGp_id = false;
			IncludePractice_id = false;
			IncludeGp_surname = false;
			IncludeGp_first_name = false;
			IncludeGp_title = false;
			IncludeGp_phone_no = false;
			IncludeGp_mobile_no = false;
			IncludeGp_email = false;
			IncludePractice_name = false;
			IncludeAddress_line1 = false;
			IncludeAddress_line2 = false;
			IncludeAddress_line3 = false;
			IncludeAddress_line4 = false;
			IncludeAddress_line5 = false;
			IncludePractice_phone_no = false;
			IncludePractice_fax_no = false;
		}
		public Gp_practiceEditFilter cloneObject()
		{
			Gp_practiceEditFilter newEditFilter = new Gp_practiceEditFilter();
			
			newEditFilter.IncludeGp_code = this.IncludeGp_code;
			newEditFilter.IncludeGp_practice_id = this.IncludeGp_practice_id;
			newEditFilter.IncludeGp_id = this.IncludeGp_id;
			newEditFilter.IncludePractice_id = this.IncludePractice_id;
			newEditFilter.IncludeGp_surname = this.IncludeGp_surname;
			newEditFilter.IncludeGp_first_name = this.IncludeGp_first_name;
			newEditFilter.IncludeGp_title = this.IncludeGp_title;
			newEditFilter.IncludeGp_phone_no = this.IncludeGp_phone_no;
			newEditFilter.IncludeGp_mobile_no = this.IncludeGp_mobile_no;
			newEditFilter.IncludeGp_email = this.IncludeGp_email;
			newEditFilter.IncludePractice_name = this.IncludePractice_name;
			newEditFilter.IncludeAddress_line1 = this.IncludeAddress_line1;
			newEditFilter.IncludeAddress_line2 = this.IncludeAddress_line2;
			newEditFilter.IncludeAddress_line3 = this.IncludeAddress_line3;
			newEditFilter.IncludeAddress_line4 = this.IncludeAddress_line4;
			newEditFilter.IncludeAddress_line5 = this.IncludeAddress_line5;
			newEditFilter.IncludePractice_phone_no = this.IncludePractice_phone_no;
			newEditFilter.IncludePractice_fax_no = this.IncludePractice_fax_no;
			
			return newEditFilter;
		}
	}
}
