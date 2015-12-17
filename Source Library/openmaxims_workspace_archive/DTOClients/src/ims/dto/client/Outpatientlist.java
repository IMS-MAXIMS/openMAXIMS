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

public final class Outpatientlist implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Outpatientlist.class);
	
	private OutpatientlistFilter lastGetFilter = null;
	private final String serviceName = "OUTPATIENTLIST";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public OutpatientlistFilter Filter = new OutpatientlistFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public OutpatientlistEditFilter EditFilter = new OutpatientlistEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public OutpatientlistCollection DataCollection = new OutpatientlistCollection();

	/**
	 * Creates a new Outpatientlist Data Transfer Object.
	 */ 
	public Outpatientlist(ims.dto.Connection connection)
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
	public Outpatientlist cloneObject()
	{
		Outpatientlist cloneObject = new Outpatientlist(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Chartnum = DataCollection.get(x).Chartnum;
			cloneObject.DataCollection.get(index).Contactno = DataCollection.get(x).Contactno;
			cloneObject.DataCollection.get(index).Hcpcode = DataCollection.get(x).Hcpcode;
			cloneObject.DataCollection.get(index).Cliniccode = DataCollection.get(x).Cliniccode;
			cloneObject.DataCollection.get(index).Specialty = DataCollection.get(x).Specialty;
			cloneObject.DataCollection.get(index).Snm = DataCollection.get(x).Snm;
			cloneObject.DataCollection.get(index).Fnm1 = DataCollection.get(x).Fnm1;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Dod = DataCollection.get(x).Dod;
			cloneObject.DataCollection.get(index).Sex = DataCollection.get(x).Sex;
			cloneObject.DataCollection.get(index).Apptdate = DataCollection.get(x).Apptdate;
			cloneObject.DataCollection.get(index).Appttime = DataCollection.get(x).Appttime;
			cloneObject.DataCollection.get(index).Documentstatus = DataCollection.get(x).Documentstatus;
			cloneObject.DataCollection.get(index).Gpcode = DataCollection.get(x).Gpcode;
			cloneObject.DataCollection.get(index).Groupcond = DataCollection.get(x).Groupcond;
							
			
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
		return "Outpatientlist.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpatientlist.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Outpatientlist.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpatientlist.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpatientlist.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpatientlist.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Outpatientlist.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Outpatientlist.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpatientlist.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Outpatientlist.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Outpatientlist.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Outpatientlist.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Outpatientlist.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Outpatientlist.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpatientlist.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Outpatientlist.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Outpatientlist.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Outpatientlist.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Outpatientlist.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Outpatientlist.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpatientlist.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Outpatientlist.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Outpatientlist.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpatientlist.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Outpatientlist.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Outpatientlist.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Outpatientlist.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Outpatientlist nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Outpatientlist After NextList ");
				
		decodeNASMessage();		
		logger.debug("Outpatientlist After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpatientlist.List");
							
		listInProgress = true;	
		logger.debug("Outpatientlist Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Outpatientlist After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Outpatientlist After Parse Message");
		
						
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
	private String encodeNASFilter(OutpatientlistFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum);
		}
		
		if(Filter.Chartnum != null && filter.Chartnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CHARTNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Chartnum);
		}
		
		if(Filter.Contactno != null && filter.Contactno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONTACTNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Contactno);
		}
		
		if(Filter.Hcpcode != null && filter.Hcpcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HCPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpcode);
		}
		
		if(Filter.Cliniccode != null && filter.Cliniccode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CLINICCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cliniccode);
		}
		
		if(Filter.Specialty != null && filter.Specialty.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SPECIALTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Specialty);
		}
		
		if(Filter.Snm != null && filter.Snm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Snm);
		}
		
		if(Filter.Fnm1 != null && filter.Fnm1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fnm1);
		}
		
		if(Filter.Dob != null && filter.Dob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dob);
		}
		
		if(Filter.Dod != null && filter.Dod.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dod);
		}
		
		if(Filter.Sex != null && filter.Sex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sex);
		}
		
		if(Filter.Apptdate != null && filter.Apptdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPTDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Apptdate);
		}
		
		if(Filter.Appttime != null && filter.Appttime.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("APPTTIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appttime);
		}
		
		if(Filter.Documentstatus != null && filter.Documentstatus.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOCUMENTSTATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Documentstatus);
		}
		
		if(Filter.Gpcode != null && filter.Gpcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpcode);
		}
		
		if(Filter.Groupcond != null && filter.Groupcond.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GROUPCOND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Groupcond);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		OutpatientlistRecord data = (OutpatientlistRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum));
		}
		
		if(EditFilter.IncludeChartnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CHARTNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Chartnum));
		}
		
		if(EditFilter.IncludeContactno)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONTACTNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Contactno));
		}
		
		if(EditFilter.IncludeHcpcode)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HCPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpcode));
		}
		
		if(EditFilter.IncludeCliniccode)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CLINICCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cliniccode));
		}
		
		if(EditFilter.IncludeSpecialty)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SPECIALTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Specialty));
		}
		
		if(EditFilter.IncludeSnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Snm));
		}
		
		if(EditFilter.IncludeFnm1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fnm1));
		}
		
		if(EditFilter.IncludeDob)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dob));
		}
		
		if(EditFilter.IncludeDod)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dod));
		}
		
		if(EditFilter.IncludeSex)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sex));
		}
		
		if(EditFilter.IncludeApptdate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPTDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Apptdate));
		}
		
		if(EditFilter.IncludeAppttime)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("APPTTIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appttime));
		}
		
		if(EditFilter.IncludeDocumentstatus)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOCUMENTSTATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Documentstatus));
		}
		
		if(EditFilter.IncludeGpcode)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpcode));
		}
		
		if(EditFilter.IncludeGroupcond)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GROUPCOND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Groupcond));
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
			OutpatientlistRecord record = new OutpatientlistRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Chartnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHARTNUM"));
			record.Contactno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTACTNO"));
			record.Hcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPCODE"));
			record.Cliniccode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLINICCODE"));
			record.Specialty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPECIALTY"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Dod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOD"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Apptdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTDATE"));
			record.Appttime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTTIME"));
			record.Documentstatus = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOCUMENTSTATUS"));
			record.Gpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCODE"));
			record.Groupcond = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GROUPCOND"));
									
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
			OutpatientlistRecord record = new OutpatientlistRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Chartnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHARTNUM"));
			record.Contactno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTACTNO"));
			record.Hcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPCODE"));
			record.Cliniccode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLINICCODE"));
			record.Specialty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPECIALTY"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Dod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOD"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Apptdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTDATE"));
			record.Appttime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTTIME"));
			record.Documentstatus = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOCUMENTSTATUS"));
			record.Gpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCODE"));
			record.Groupcond = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GROUPCOND"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class OutpatientlistCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			OutpatientlistRecord newRecord = new OutpatientlistRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(OutpatientlistRecord record)
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
		public OutpatientlistRecord get(int index)
		{
			return (OutpatientlistRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class OutpatientlistRecord
	{
		public String Hospnum = "";
		public String Chartnum = "";
		public String Contactno = "";
		public String Hcpcode = "";
		public String Cliniccode = "";
		public String Specialty = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Dob = "";
		public String Dod = "";
		public String Sex = "";
		public String Apptdate = "";
		public String Appttime = "";
		public String Documentstatus = "";
		public String Gpcode = "";
		public String Groupcond = "";
				
		
		public void clear()
		{
			Hospnum = "";
			Chartnum = "";
			Contactno = "";
			Hcpcode = "";
			Cliniccode = "";
			Specialty = "";
			Snm = "";
			Fnm1 = "";
			Dob = "";
			Dod = "";
			Sex = "";
			Apptdate = "";
			Appttime = "";
			Documentstatus = "";
			Gpcode = "";
			Groupcond = "";
			
		}		
	}
		
		
	public final class OutpatientlistFilter
	{			
		public String Hospnum = "";
		public String Chartnum = "";
		public String Contactno = "";
		public String Hcpcode = "";
		public String Cliniccode = "";
		public String Specialty = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Dob = "";
		public String Dod = "";
		public String Sex = "";
		public String Apptdate = "";
		public String Appttime = "";
		public String Documentstatus = "";
		public String Gpcode = "";
		public String Groupcond = "";
		
		public void clear()
		{				
			Hospnum = "";
			Chartnum = "";
			Contactno = "";
			Hcpcode = "";
			Cliniccode = "";
			Specialty = "";
			Snm = "";
			Fnm1 = "";
			Dob = "";
			Dod = "";
			Sex = "";
			Apptdate = "";
			Appttime = "";
			Documentstatus = "";
			Gpcode = "";
			Groupcond = "";
		}	
		public OutpatientlistFilter cloneObject()
		{
			OutpatientlistFilter newFilter = new OutpatientlistFilter();
			
			newFilter.Hospnum = this.Hospnum;
			newFilter.Chartnum = this.Chartnum;
			newFilter.Contactno = this.Contactno;
			newFilter.Hcpcode = this.Hcpcode;
			newFilter.Cliniccode = this.Cliniccode;
			newFilter.Specialty = this.Specialty;
			newFilter.Snm = this.Snm;
			newFilter.Fnm1 = this.Fnm1;
			newFilter.Dob = this.Dob;
			newFilter.Dod = this.Dod;
			newFilter.Sex = this.Sex;
			newFilter.Apptdate = this.Apptdate;
			newFilter.Appttime = this.Appttime;
			newFilter.Documentstatus = this.Documentstatus;
			newFilter.Gpcode = this.Gpcode;
			newFilter.Groupcond = this.Groupcond;
			
			return newFilter;
		}
	}
	public final class OutpatientlistEditFilter
	{			
		public boolean IncludeHospnum = true;
		public boolean IncludeChartnum = true;
		public boolean IncludeContactno = true;
		public boolean IncludeHcpcode = true;
		public boolean IncludeCliniccode = true;
		public boolean IncludeSpecialty = true;
		public boolean IncludeSnm = true;
		public boolean IncludeFnm1 = true;
		public boolean IncludeDob = true;
		public boolean IncludeDod = true;
		public boolean IncludeSex = true;
		public boolean IncludeApptdate = true;
		public boolean IncludeAppttime = true;
		public boolean IncludeDocumentstatus = true;
		public boolean IncludeGpcode = true;
		public boolean IncludeGroupcond = true;
		
		public void includeAll()
		{				
			IncludeHospnum = true;
			IncludeChartnum = true;
			IncludeContactno = true;
			IncludeHcpcode = true;
			IncludeCliniccode = true;
			IncludeSpecialty = true;
			IncludeSnm = true;
			IncludeFnm1 = true;
			IncludeDob = true;
			IncludeDod = true;
			IncludeSex = true;
			IncludeApptdate = true;
			IncludeAppttime = true;
			IncludeDocumentstatus = true;
			IncludeGpcode = true;
			IncludeGroupcond = true;
		}	
		public void excludeAll()
		{				
			IncludeHospnum = false;
			IncludeChartnum = false;
			IncludeContactno = false;
			IncludeHcpcode = false;
			IncludeCliniccode = false;
			IncludeSpecialty = false;
			IncludeSnm = false;
			IncludeFnm1 = false;
			IncludeDob = false;
			IncludeDod = false;
			IncludeSex = false;
			IncludeApptdate = false;
			IncludeAppttime = false;
			IncludeDocumentstatus = false;
			IncludeGpcode = false;
			IncludeGroupcond = false;
		}
		public OutpatientlistEditFilter cloneObject()
		{
			OutpatientlistEditFilter newEditFilter = new OutpatientlistEditFilter();
			
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeChartnum = this.IncludeChartnum;
			newEditFilter.IncludeContactno = this.IncludeContactno;
			newEditFilter.IncludeHcpcode = this.IncludeHcpcode;
			newEditFilter.IncludeCliniccode = this.IncludeCliniccode;
			newEditFilter.IncludeSpecialty = this.IncludeSpecialty;
			newEditFilter.IncludeSnm = this.IncludeSnm;
			newEditFilter.IncludeFnm1 = this.IncludeFnm1;
			newEditFilter.IncludeDob = this.IncludeDob;
			newEditFilter.IncludeDod = this.IncludeDod;
			newEditFilter.IncludeSex = this.IncludeSex;
			newEditFilter.IncludeApptdate = this.IncludeApptdate;
			newEditFilter.IncludeAppttime = this.IncludeAppttime;
			newEditFilter.IncludeDocumentstatus = this.IncludeDocumentstatus;
			newEditFilter.IncludeGpcode = this.IncludeGpcode;
			newEditFilter.IncludeGroupcond = this.IncludeGroupcond;
			
			return newEditFilter;
		}
	}
}
