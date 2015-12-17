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

public final class Patientcontacts implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Patientcontacts.class);
	
	private PatientcontactsFilter lastGetFilter = null;
	private final String serviceName = "PATIENTCONTACTS";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public PatientcontactsFilter Filter = new PatientcontactsFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public PatientcontactsEditFilter EditFilter = new PatientcontactsEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public PatientcontactsCollection DataCollection = new PatientcontactsCollection();

	/**
	 * Creates a new Patientcontacts Data Transfer Object.
	 */ 
	public Patientcontacts(ims.dto.Connection connection)
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
	public Patientcontacts cloneObject()
	{
		Patientcontacts cloneObject = new Patientcontacts(Connection);
			
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
			cloneObject.DataCollection.get(index).Contactno = DataCollection.get(x).Contactno;
			cloneObject.DataCollection.get(index).Outpatconsultant = DataCollection.get(x).Outpatconsultant;
			cloneObject.DataCollection.get(index).Cliniccode = DataCollection.get(x).Cliniccode;
			cloneObject.DataCollection.get(index).Outpatspecialty = DataCollection.get(x).Outpatspecialty;
			cloneObject.DataCollection.get(index).Apptdate = DataCollection.get(x).Apptdate;
			cloneObject.DataCollection.get(index).Appttime = DataCollection.get(x).Appttime;
			cloneObject.DataCollection.get(index).Inpatconsultant = DataCollection.get(x).Inpatconsultant;
			cloneObject.DataCollection.get(index).Inpatspecialty = DataCollection.get(x).Inpatspecialty;
			cloneObject.DataCollection.get(index).Ward = DataCollection.get(x).Ward;
			cloneObject.DataCollection.get(index).Dischargedate = DataCollection.get(x).Dischargedate;
			cloneObject.DataCollection.get(index).Documentstatus = DataCollection.get(x).Documentstatus;
			cloneObject.DataCollection.get(index).Contacttype = DataCollection.get(x).Contacttype;
			cloneObject.DataCollection.get(index).Ip_gpcode = DataCollection.get(x).Ip_gpcode;
			cloneObject.DataCollection.get(index).Op_gpcode = DataCollection.get(x).Op_gpcode;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.6 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Patientcontacts.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patientcontacts.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Patientcontacts.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patientcontacts.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patientcontacts.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patientcontacts.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Patientcontacts.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Patientcontacts.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patientcontacts.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Patientcontacts.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Patientcontacts.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Patientcontacts.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Patientcontacts.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Patientcontacts.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patientcontacts.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Patientcontacts.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Patientcontacts.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Patientcontacts.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Patientcontacts.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Patientcontacts.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patientcontacts.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Patientcontacts.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Patientcontacts.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patientcontacts.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Patientcontacts.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Patientcontacts.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Patientcontacts.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Patientcontacts nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Patientcontacts After NextList ");
				
		decodeNASMessage();		
		logger.debug("Patientcontacts After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patientcontacts.List");
							
		listInProgress = true;	
		logger.debug("Patientcontacts Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Patientcontacts After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Patientcontacts After Parse Message");
		
						
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
	private String encodeNASFilter(PatientcontactsFilter filter)
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
		
		if(Filter.Contactno != null && filter.Contactno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONTACTNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Contactno);
		}
		
		if(Filter.Outpatconsultant != null && filter.Outpatconsultant.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OUTPATCONSULTANT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Outpatconsultant);
		}
		
		if(Filter.Cliniccode != null && filter.Cliniccode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CLINICCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cliniccode);
		}
		
		if(Filter.Outpatspecialty != null && filter.Outpatspecialty.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OUTPATSPECIALTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Outpatspecialty);
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
		
		if(Filter.Inpatconsultant != null && filter.Inpatconsultant.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INPATCONSULTANT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Inpatconsultant);
		}
		
		if(Filter.Inpatspecialty != null && filter.Inpatspecialty.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INPATSPECIALTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Inpatspecialty);
		}
		
		if(Filter.Ward != null && filter.Ward.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("WARD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ward);
		}
		
		if(Filter.Dischargedate != null && filter.Dischargedate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DISCHARGEDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dischargedate);
		}
		
		if(Filter.Documentstatus != null && filter.Documentstatus.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOCUMENTSTATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Documentstatus);
		}
		
		if(Filter.Contacttype != null && filter.Contacttype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONTACTTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Contacttype);
		}
		
		if(Filter.Ip_gpcode != null && filter.Ip_gpcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("IP_GPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ip_gpcode);
		}
		
		if(Filter.Op_gpcode != null && filter.Op_gpcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OP_GPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Op_gpcode);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		PatientcontactsRecord data = (PatientcontactsRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum));
		}
		
		if(EditFilter.IncludeContactno)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONTACTNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Contactno));
		}
		
		if(EditFilter.IncludeOutpatconsultant)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OUTPATCONSULTANT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Outpatconsultant));
		}
		
		if(EditFilter.IncludeCliniccode)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CLINICCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cliniccode));
		}
		
		if(EditFilter.IncludeOutpatspecialty)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OUTPATSPECIALTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Outpatspecialty));
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
		
		if(EditFilter.IncludeInpatconsultant)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INPATCONSULTANT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Inpatconsultant));
		}
		
		if(EditFilter.IncludeInpatspecialty)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INPATSPECIALTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Inpatspecialty));
		}
		
		if(EditFilter.IncludeWard)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("WARD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ward));
		}
		
		if(EditFilter.IncludeDischargedate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DISCHARGEDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dischargedate));
		}
		
		if(EditFilter.IncludeDocumentstatus)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOCUMENTSTATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Documentstatus));
		}
		
		if(EditFilter.IncludeContacttype)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONTACTTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Contacttype));
		}
		
		if(EditFilter.IncludeIp_gpcode)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("IP_GPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ip_gpcode));
		}
		
		if(EditFilter.IncludeOp_gpcode)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OP_GPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Op_gpcode));
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
			PatientcontactsRecord record = new PatientcontactsRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Contactno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTACTNO"));
			record.Outpatconsultant = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUTPATCONSULTANT"));
			record.Cliniccode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLINICCODE"));
			record.Outpatspecialty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUTPATSPECIALTY"));
			record.Apptdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTDATE"));
			record.Appttime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTTIME"));
			record.Inpatconsultant = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INPATCONSULTANT"));
			record.Inpatspecialty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INPATSPECIALTY"));
			record.Ward = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WARD"));
			record.Dischargedate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISCHARGEDATE"));
			record.Documentstatus = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOCUMENTSTATUS"));
			record.Contacttype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTACTTYPE"));
			record.Ip_gpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "IP_GPCODE"));
			record.Op_gpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OP_GPCODE"));
									
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
			PatientcontactsRecord record = new PatientcontactsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Contactno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTACTNO"));
			record.Outpatconsultant = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUTPATCONSULTANT"));
			record.Cliniccode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLINICCODE"));
			record.Outpatspecialty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUTPATSPECIALTY"));
			record.Apptdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTDATE"));
			record.Appttime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTTIME"));
			record.Inpatconsultant = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INPATCONSULTANT"));
			record.Inpatspecialty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INPATSPECIALTY"));
			record.Ward = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WARD"));
			record.Dischargedate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISCHARGEDATE"));
			record.Documentstatus = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOCUMENTSTATUS"));
			record.Contacttype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTACTTYPE"));
			record.Ip_gpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "IP_GPCODE"));
			record.Op_gpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OP_GPCODE"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class PatientcontactsCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			PatientcontactsRecord newRecord = new PatientcontactsRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(PatientcontactsRecord record)
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
		public PatientcontactsRecord get(int index)
		{
			return (PatientcontactsRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class PatientcontactsRecord
	{
		public String Hospnum = "";
		public String Contactno = "";
		public String Outpatconsultant = "";
		public String Cliniccode = "";
		public String Outpatspecialty = "";
		public String Apptdate = "";
		public String Appttime = "";
		public String Inpatconsultant = "";
		public String Inpatspecialty = "";
		public String Ward = "";
		public String Dischargedate = "";
		public String Documentstatus = "";
		public String Contacttype = "";
		public String Ip_gpcode = "";
		public String Op_gpcode = "";
				
		
		public void clear()
		{
			Hospnum = "";
			Contactno = "";
			Outpatconsultant = "";
			Cliniccode = "";
			Outpatspecialty = "";
			Apptdate = "";
			Appttime = "";
			Inpatconsultant = "";
			Inpatspecialty = "";
			Ward = "";
			Dischargedate = "";
			Documentstatus = "";
			Contacttype = "";
			Ip_gpcode = "";
			Op_gpcode = "";
			
		}		
	}
		
		
	public final class PatientcontactsFilter
	{			
		public String Hospnum = "";
		public String Contactno = "";
		public String Outpatconsultant = "";
		public String Cliniccode = "";
		public String Outpatspecialty = "";
		public String Apptdate = "";
		public String Appttime = "";
		public String Inpatconsultant = "";
		public String Inpatspecialty = "";
		public String Ward = "";
		public String Dischargedate = "";
		public String Documentstatus = "";
		public String Contacttype = "";
		public String Ip_gpcode = "";
		public String Op_gpcode = "";
		
		public void clear()
		{				
			Hospnum = "";
			Contactno = "";
			Outpatconsultant = "";
			Cliniccode = "";
			Outpatspecialty = "";
			Apptdate = "";
			Appttime = "";
			Inpatconsultant = "";
			Inpatspecialty = "";
			Ward = "";
			Dischargedate = "";
			Documentstatus = "";
			Contacttype = "";
			Ip_gpcode = "";
			Op_gpcode = "";
		}	
		public PatientcontactsFilter cloneObject()
		{
			PatientcontactsFilter newFilter = new PatientcontactsFilter();
			
			newFilter.Hospnum = this.Hospnum;
			newFilter.Contactno = this.Contactno;
			newFilter.Outpatconsultant = this.Outpatconsultant;
			newFilter.Cliniccode = this.Cliniccode;
			newFilter.Outpatspecialty = this.Outpatspecialty;
			newFilter.Apptdate = this.Apptdate;
			newFilter.Appttime = this.Appttime;
			newFilter.Inpatconsultant = this.Inpatconsultant;
			newFilter.Inpatspecialty = this.Inpatspecialty;
			newFilter.Ward = this.Ward;
			newFilter.Dischargedate = this.Dischargedate;
			newFilter.Documentstatus = this.Documentstatus;
			newFilter.Contacttype = this.Contacttype;
			newFilter.Ip_gpcode = this.Ip_gpcode;
			newFilter.Op_gpcode = this.Op_gpcode;
			
			return newFilter;
		}
	}
	public final class PatientcontactsEditFilter
	{			
		public boolean IncludeHospnum = true;
		public boolean IncludeContactno = true;
		public boolean IncludeOutpatconsultant = true;
		public boolean IncludeCliniccode = true;
		public boolean IncludeOutpatspecialty = true;
		public boolean IncludeApptdate = true;
		public boolean IncludeAppttime = true;
		public boolean IncludeInpatconsultant = true;
		public boolean IncludeInpatspecialty = true;
		public boolean IncludeWard = true;
		public boolean IncludeDischargedate = true;
		public boolean IncludeDocumentstatus = true;
		public boolean IncludeContacttype = true;
		public boolean IncludeIp_gpcode = true;
		public boolean IncludeOp_gpcode = true;
		
		public void includeAll()
		{				
			IncludeHospnum = true;
			IncludeContactno = true;
			IncludeOutpatconsultant = true;
			IncludeCliniccode = true;
			IncludeOutpatspecialty = true;
			IncludeApptdate = true;
			IncludeAppttime = true;
			IncludeInpatconsultant = true;
			IncludeInpatspecialty = true;
			IncludeWard = true;
			IncludeDischargedate = true;
			IncludeDocumentstatus = true;
			IncludeContacttype = true;
			IncludeIp_gpcode = true;
			IncludeOp_gpcode = true;
		}	
		public void excludeAll()
		{				
			IncludeHospnum = false;
			IncludeContactno = false;
			IncludeOutpatconsultant = false;
			IncludeCliniccode = false;
			IncludeOutpatspecialty = false;
			IncludeApptdate = false;
			IncludeAppttime = false;
			IncludeInpatconsultant = false;
			IncludeInpatspecialty = false;
			IncludeWard = false;
			IncludeDischargedate = false;
			IncludeDocumentstatus = false;
			IncludeContacttype = false;
			IncludeIp_gpcode = false;
			IncludeOp_gpcode = false;
		}
		public PatientcontactsEditFilter cloneObject()
		{
			PatientcontactsEditFilter newEditFilter = new PatientcontactsEditFilter();
			
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeContactno = this.IncludeContactno;
			newEditFilter.IncludeOutpatconsultant = this.IncludeOutpatconsultant;
			newEditFilter.IncludeCliniccode = this.IncludeCliniccode;
			newEditFilter.IncludeOutpatspecialty = this.IncludeOutpatspecialty;
			newEditFilter.IncludeApptdate = this.IncludeApptdate;
			newEditFilter.IncludeAppttime = this.IncludeAppttime;
			newEditFilter.IncludeInpatconsultant = this.IncludeInpatconsultant;
			newEditFilter.IncludeInpatspecialty = this.IncludeInpatspecialty;
			newEditFilter.IncludeWard = this.IncludeWard;
			newEditFilter.IncludeDischargedate = this.IncludeDischargedate;
			newEditFilter.IncludeDocumentstatus = this.IncludeDocumentstatus;
			newEditFilter.IncludeContacttype = this.IncludeContacttype;
			newEditFilter.IncludeIp_gpcode = this.IncludeIp_gpcode;
			newEditFilter.IncludeOp_gpcode = this.IncludeOp_gpcode;
			
			return newEditFilter;
		}
	}
}
