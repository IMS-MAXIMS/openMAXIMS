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

public final class Inpatientlist implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Inpatientlist.class);
	
	private InpatientlistFilter lastGetFilter = null;
	private final String serviceName = "INPATIENTLIST";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public InpatientlistFilter Filter = new InpatientlistFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public InpatientlistEditFilter EditFilter = new InpatientlistEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public InpatientlistCollection DataCollection = new InpatientlistCollection();

	/**
	 * Creates a new Inpatientlist Data Transfer Object.
	 */ 
	public Inpatientlist(ims.dto.Connection connection)
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
	public Inpatientlist cloneObject()
	{
		Inpatientlist cloneObject = new Inpatientlist(Connection);
			
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
			cloneObject.DataCollection.get(index).Epsd = DataCollection.get(x).Epsd;
			cloneObject.DataCollection.get(index).Hcpcode = DataCollection.get(x).Hcpcode;
			cloneObject.DataCollection.get(index).Hcpname = DataCollection.get(x).Hcpname;
			cloneObject.DataCollection.get(index).Rescode = DataCollection.get(x).Rescode;
			cloneObject.DataCollection.get(index).Resname = DataCollection.get(x).Resname;
			cloneObject.DataCollection.get(index).Specialty = DataCollection.get(x).Specialty;
			cloneObject.DataCollection.get(index).Snm = DataCollection.get(x).Snm;
			cloneObject.DataCollection.get(index).Fnm1 = DataCollection.get(x).Fnm1;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Sex = DataCollection.get(x).Sex;
			cloneObject.DataCollection.get(index).Addt = DataCollection.get(x).Addt;
			cloneObject.DataCollection.get(index).Adtm = DataCollection.get(x).Adtm;
			cloneObject.DataCollection.get(index).Daycase = DataCollection.get(x).Daycase;
			cloneObject.DataCollection.get(index).Dod = DataCollection.get(x).Dod;
			cloneObject.DataCollection.get(index).Dischargedate = DataCollection.get(x).Dischargedate;
			cloneObject.DataCollection.get(index).Documentstatus = DataCollection.get(x).Documentstatus;
			cloneObject.DataCollection.get(index).Groupcond = DataCollection.get(x).Groupcond;
			cloneObject.DataCollection.get(index).Gpcode = DataCollection.get(x).Gpcode;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.8 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Inpatientlist.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpatientlist.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Inpatientlist.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpatientlist.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpatientlist.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpatientlist.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Inpatientlist.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Inpatientlist.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpatientlist.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Inpatientlist.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Inpatientlist.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Inpatientlist.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Inpatientlist.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Inpatientlist.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpatientlist.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Inpatientlist.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Inpatientlist.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Inpatientlist.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Inpatientlist.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Inpatientlist.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpatientlist.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Inpatientlist.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Inpatientlist.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpatientlist.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Inpatientlist.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Inpatientlist.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Inpatientlist.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Inpatientlist nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Inpatientlist After NextList ");
				
		decodeNASMessage();		
		logger.debug("Inpatientlist After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpatientlist.List");
							
		listInProgress = true;	
		logger.debug("Inpatientlist Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Inpatientlist After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Inpatientlist After Parse Message");
		
						
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
	private String encodeNASFilter(InpatientlistFilter filter)
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
		
		if(Filter.Epsd != null && filter.Epsd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EPSD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Epsd);
		}
		
		if(Filter.Hcpcode != null && filter.Hcpcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HCPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpcode);
		}
		
		if(Filter.Hcpname != null && filter.Hcpname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpname);
		}
		
		if(Filter.Rescode != null && filter.Rescode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RESCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rescode);
		}
		
		if(Filter.Resname != null && filter.Resname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RESNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resname);
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
		
		if(Filter.Sex != null && filter.Sex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sex);
		}
		
		if(Filter.Addt != null && filter.Addt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Addt);
		}
		
		if(Filter.Adtm != null && filter.Adtm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adtm);
		}
		
		if(Filter.Daycase != null && filter.Daycase.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DAYCASE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Daycase);
		}
		
		if(Filter.Dod != null && filter.Dod.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dod);
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
		
		if(Filter.Groupcond != null && filter.Groupcond.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GROUPCOND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Groupcond);
		}
		
		if(Filter.Gpcode != null && filter.Gpcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpcode);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		InpatientlistRecord data = (InpatientlistRecord)DataCollection.get(0);
		
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
		
		if(EditFilter.IncludeEpsd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EPSD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Epsd));
		}
		
		if(EditFilter.IncludeHcpcode)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HCPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpcode));
		}
		
		if(EditFilter.IncludeHcpname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpname));
		}
		
		if(EditFilter.IncludeRescode)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rescode));
		}
		
		if(EditFilter.IncludeResname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resname));
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
		
		if(EditFilter.IncludeSex)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sex));
		}
		
		if(EditFilter.IncludeAddt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Addt));
		}
		
		if(EditFilter.IncludeAdtm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adtm));
		}
		
		if(EditFilter.IncludeDaycase)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DAYCASE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Daycase));
		}
		
		if(EditFilter.IncludeDod)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dod));
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
		
		if(EditFilter.IncludeGroupcond)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GROUPCOND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Groupcond));
		}
		
		if(EditFilter.IncludeGpcode)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpcode));
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
			InpatientlistRecord record = new InpatientlistRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Chartnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHARTNUM"));
			record.Contactno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTACTNO"));
			record.Epsd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPSD"));
			record.Hcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPCODE"));
			record.Hcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNAME"));
			record.Rescode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESCODE"));
			record.Resname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESNAME"));
			record.Specialty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPECIALTY"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Addt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDT"));
			record.Adtm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADTM"));
			record.Daycase = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DAYCASE"));
			record.Dod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOD"));
			record.Dischargedate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISCHARGEDATE"));
			record.Documentstatus = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOCUMENTSTATUS"));
			record.Groupcond = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GROUPCOND"));
			record.Gpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCODE"));
									
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
			InpatientlistRecord record = new InpatientlistRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Chartnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHARTNUM"));
			record.Contactno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTACTNO"));
			record.Epsd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPSD"));
			record.Hcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPCODE"));
			record.Hcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNAME"));
			record.Rescode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESCODE"));
			record.Resname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESNAME"));
			record.Specialty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPECIALTY"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Addt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDT"));
			record.Adtm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADTM"));
			record.Daycase = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DAYCASE"));
			record.Dod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOD"));
			record.Dischargedate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISCHARGEDATE"));
			record.Documentstatus = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOCUMENTSTATUS"));
			record.Groupcond = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GROUPCOND"));
			record.Gpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCODE"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class InpatientlistCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			InpatientlistRecord newRecord = new InpatientlistRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(InpatientlistRecord record)
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
		public InpatientlistRecord get(int index)
		{
			return (InpatientlistRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class InpatientlistRecord
	{
		public String Hospnum = "";
		public String Chartnum = "";
		public String Contactno = "";
		public String Epsd = "";
		public String Hcpcode = "";
		public String Hcpname = "";
		public String Rescode = "";
		public String Resname = "";
		public String Specialty = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Dob = "";
		public String Sex = "";
		public String Addt = "";
		public String Adtm = "";
		public String Daycase = "";
		public String Dod = "";
		public String Dischargedate = "";
		public String Documentstatus = "";
		public String Groupcond = "";
		public String Gpcode = "";
				
		
		public void clear()
		{
			Hospnum = "";
			Chartnum = "";
			Contactno = "";
			Epsd = "";
			Hcpcode = "";
			Hcpname = "";
			Rescode = "";
			Resname = "";
			Specialty = "";
			Snm = "";
			Fnm1 = "";
			Dob = "";
			Sex = "";
			Addt = "";
			Adtm = "";
			Daycase = "";
			Dod = "";
			Dischargedate = "";
			Documentstatus = "";
			Groupcond = "";
			Gpcode = "";
			
		}		
	}
		
		
	public final class InpatientlistFilter
	{			
		public String Hospnum = "";
		public String Chartnum = "";
		public String Contactno = "";
		public String Epsd = "";
		public String Hcpcode = "";
		public String Hcpname = "";
		public String Rescode = "";
		public String Resname = "";
		public String Specialty = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Dob = "";
		public String Sex = "";
		public String Addt = "";
		public String Adtm = "";
		public String Daycase = "";
		public String Dod = "";
		public String Dischargedate = "";
		public String Documentstatus = "";
		public String Groupcond = "";
		public String Gpcode = "";
		
		public void clear()
		{				
			Hospnum = "";
			Chartnum = "";
			Contactno = "";
			Epsd = "";
			Hcpcode = "";
			Hcpname = "";
			Rescode = "";
			Resname = "";
			Specialty = "";
			Snm = "";
			Fnm1 = "";
			Dob = "";
			Sex = "";
			Addt = "";
			Adtm = "";
			Daycase = "";
			Dod = "";
			Dischargedate = "";
			Documentstatus = "";
			Groupcond = "";
			Gpcode = "";
		}	
		public InpatientlistFilter cloneObject()
		{
			InpatientlistFilter newFilter = new InpatientlistFilter();
			
			newFilter.Hospnum = this.Hospnum;
			newFilter.Chartnum = this.Chartnum;
			newFilter.Contactno = this.Contactno;
			newFilter.Epsd = this.Epsd;
			newFilter.Hcpcode = this.Hcpcode;
			newFilter.Hcpname = this.Hcpname;
			newFilter.Rescode = this.Rescode;
			newFilter.Resname = this.Resname;
			newFilter.Specialty = this.Specialty;
			newFilter.Snm = this.Snm;
			newFilter.Fnm1 = this.Fnm1;
			newFilter.Dob = this.Dob;
			newFilter.Sex = this.Sex;
			newFilter.Addt = this.Addt;
			newFilter.Adtm = this.Adtm;
			newFilter.Daycase = this.Daycase;
			newFilter.Dod = this.Dod;
			newFilter.Dischargedate = this.Dischargedate;
			newFilter.Documentstatus = this.Documentstatus;
			newFilter.Groupcond = this.Groupcond;
			newFilter.Gpcode = this.Gpcode;
			
			return newFilter;
		}
	}
	public final class InpatientlistEditFilter
	{			
		public boolean IncludeHospnum = true;
		public boolean IncludeChartnum = true;
		public boolean IncludeContactno = true;
		public boolean IncludeEpsd = true;
		public boolean IncludeHcpcode = true;
		public boolean IncludeHcpname = true;
		public boolean IncludeRescode = true;
		public boolean IncludeResname = true;
		public boolean IncludeSpecialty = true;
		public boolean IncludeSnm = true;
		public boolean IncludeFnm1 = true;
		public boolean IncludeDob = true;
		public boolean IncludeSex = true;
		public boolean IncludeAddt = true;
		public boolean IncludeAdtm = true;
		public boolean IncludeDaycase = true;
		public boolean IncludeDod = true;
		public boolean IncludeDischargedate = true;
		public boolean IncludeDocumentstatus = true;
		public boolean IncludeGroupcond = true;
		public boolean IncludeGpcode = true;
		
		public void includeAll()
		{				
			IncludeHospnum = true;
			IncludeChartnum = true;
			IncludeContactno = true;
			IncludeEpsd = true;
			IncludeHcpcode = true;
			IncludeHcpname = true;
			IncludeRescode = true;
			IncludeResname = true;
			IncludeSpecialty = true;
			IncludeSnm = true;
			IncludeFnm1 = true;
			IncludeDob = true;
			IncludeSex = true;
			IncludeAddt = true;
			IncludeAdtm = true;
			IncludeDaycase = true;
			IncludeDod = true;
			IncludeDischargedate = true;
			IncludeDocumentstatus = true;
			IncludeGroupcond = true;
			IncludeGpcode = true;
		}	
		public void excludeAll()
		{				
			IncludeHospnum = false;
			IncludeChartnum = false;
			IncludeContactno = false;
			IncludeEpsd = false;
			IncludeHcpcode = false;
			IncludeHcpname = false;
			IncludeRescode = false;
			IncludeResname = false;
			IncludeSpecialty = false;
			IncludeSnm = false;
			IncludeFnm1 = false;
			IncludeDob = false;
			IncludeSex = false;
			IncludeAddt = false;
			IncludeAdtm = false;
			IncludeDaycase = false;
			IncludeDod = false;
			IncludeDischargedate = false;
			IncludeDocumentstatus = false;
			IncludeGroupcond = false;
			IncludeGpcode = false;
		}
		public InpatientlistEditFilter cloneObject()
		{
			InpatientlistEditFilter newEditFilter = new InpatientlistEditFilter();
			
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeChartnum = this.IncludeChartnum;
			newEditFilter.IncludeContactno = this.IncludeContactno;
			newEditFilter.IncludeEpsd = this.IncludeEpsd;
			newEditFilter.IncludeHcpcode = this.IncludeHcpcode;
			newEditFilter.IncludeHcpname = this.IncludeHcpname;
			newEditFilter.IncludeRescode = this.IncludeRescode;
			newEditFilter.IncludeResname = this.IncludeResname;
			newEditFilter.IncludeSpecialty = this.IncludeSpecialty;
			newEditFilter.IncludeSnm = this.IncludeSnm;
			newEditFilter.IncludeFnm1 = this.IncludeFnm1;
			newEditFilter.IncludeDob = this.IncludeDob;
			newEditFilter.IncludeSex = this.IncludeSex;
			newEditFilter.IncludeAddt = this.IncludeAddt;
			newEditFilter.IncludeAdtm = this.IncludeAdtm;
			newEditFilter.IncludeDaycase = this.IncludeDaycase;
			newEditFilter.IncludeDod = this.IncludeDod;
			newEditFilter.IncludeDischargedate = this.IncludeDischargedate;
			newEditFilter.IncludeDocumentstatus = this.IncludeDocumentstatus;
			newEditFilter.IncludeGroupcond = this.IncludeGroupcond;
			newEditFilter.IncludeGpcode = this.IncludeGpcode;
			
			return newEditFilter;
		}
	}
}
