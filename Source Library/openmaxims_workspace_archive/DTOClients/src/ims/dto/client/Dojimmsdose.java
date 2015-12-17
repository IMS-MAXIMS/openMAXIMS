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

public final class Dojimmsdose
{
	private DojimmsdoseFilter lastGetFilter = null;
	private final String serviceName = "DOJIMMSDOSE";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public DojimmsdoseFilter Filter = new DojimmsdoseFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public DojimmsdoseEditFilter EditFilter = new DojimmsdoseEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public DojimmsdoseCollection DataCollection = new DojimmsdoseCollection();

	/**
	 * Creates a new Dojimmsdose Data Transfer Object.
	 */ 
	public Dojimmsdose(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Dojimmsdose cloneObject() throws ims.dto.Exception
	{
		Dojimmsdose cloneObject = new Dojimmsdose(Connection);
			
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
			cloneObject.DataCollection.get(index).Pnum = DataCollection.get(x).Pnum;
			cloneObject.DataCollection.get(index).Ahid = DataCollection.get(x).Ahid;
			cloneObject.DataCollection.get(index).Immprofileid = DataCollection.get(x).Immprofileid;
			cloneObject.DataCollection.get(index).Product = DataCollection.get(x).Product;
			cloneObject.DataCollection.get(index).Dosage = DataCollection.get(x).Dosage;
			cloneObject.DataCollection.get(index).Unitdose = DataCollection.get(x).Unitdose;
			cloneObject.DataCollection.get(index).Route = DataCollection.get(x).Route;
			cloneObject.DataCollection.get(index).Admindate = DataCollection.get(x).Admindate;
			cloneObject.DataCollection.get(index).Adminby = DataCollection.get(x).Adminby;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Reqid = DataCollection.get(x).Reqid;
			cloneObject.DataCollection.get(index).Sideeffect = DataCollection.get(x).Sideeffect;
			cloneObject.DataCollection.get(index).Batchnum = DataCollection.get(x).Batchnum;
			cloneObject.DataCollection.get(index).Eventnum = DataCollection.get(x).Eventnum;
			cloneObject.DataCollection.get(index).Immcomment = DataCollection.get(x).Immcomment;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Routetxt = DataCollection.get(x).Routetxt;
			cloneObject.DataCollection.get(index).Unitdosetxt = DataCollection.get(x).Unitdosetxt;
			cloneObject.DataCollection.get(index).Adminbytxt = DataCollection.get(x).Adminbytxt;
			cloneObject.DataCollection.get(index).Rusrtxt = DataCollection.get(x).Rusrtxt;
			cloneObject.DataCollection.get(index).Progname = DataCollection.get(x).Progname;
			cloneObject.DataCollection.get(index).Eventname = DataCollection.get(x).Eventname;
			cloneObject.DataCollection.get(index).Daystonext = DataCollection.get(x).Daystonext;
							
			
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
		return "Dojimmsdose.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmsdose.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Dojimmsdose.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmsdose.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmsdose.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmsdose.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Dojimmsdose.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Dojimmsdose.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmsdose.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Dojimmsdose.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Dojimmsdose.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Dojimmsdose.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Dojimmsdose.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojimmsdose.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmsdose.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Dojimmsdose.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Dojimmsdose.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Dojimmsdose.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Dojimmsdose.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojimmsdose.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmsdose.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Dojimmsdose.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Dojimmsdose.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmsdose.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Dojimmsdose.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Dojimmsdose.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Dojimmsdose.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojimmsdose.List");
							
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
	private String encodeNASFilter(DojimmsdoseFilter filter)
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
		
		if(Filter.Pnum != null && filter.Pnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnum;
		}
		
		if(Filter.Ahid != null && filter.Ahid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AHID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ahid;
		}
		
		if(Filter.Immprofileid != null && filter.Immprofileid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "IMMPROFILEID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Immprofileid;
		}
		
		if(Filter.Product != null && filter.Product.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PRODUCT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Product;
		}
		
		if(Filter.Dosage != null && filter.Dosage.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOSAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dosage;
		}
		
		if(Filter.Unitdose != null && filter.Unitdose.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UNITDOSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Unitdose;
		}
		
		if(Filter.Route != null && filter.Route.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ROUTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Route;
		}
		
		if(Filter.Admindate != null && filter.Admindate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADMINDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Admindate;
		}
		
		if(Filter.Adminby != null && filter.Adminby.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADMINBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adminby;
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
		
		if(Filter.Rusr != null && filter.Rusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusr;
		}
		
		if(Filter.Reqid != null && filter.Reqid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reqid;
		}
		
		if(Filter.Sideeffect != null && filter.Sideeffect.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SIDEEFFECT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sideeffect;
		}
		
		if(Filter.Batchnum != null && filter.Batchnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BATCHNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Batchnum;
		}
		
		if(Filter.Eventnum != null && filter.Eventnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EVENTNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eventnum;
		}
		
		if(Filter.Immcomment != null && filter.Immcomment.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "IMMCOMMENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Immcomment;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Routetxt != null && filter.Routetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ROUTETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Routetxt;
		}
		
		if(Filter.Unitdosetxt != null && filter.Unitdosetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UNITDOSETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Unitdosetxt;
		}
		
		if(Filter.Adminbytxt != null && filter.Adminbytxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADMINBYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adminbytxt;
		}
		
		if(Filter.Rusrtxt != null && filter.Rusrtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusrtxt;
		}
		
		if(Filter.Progname != null && filter.Progname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PROGNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Progname;
		}
		
		if(Filter.Eventname != null && filter.Eventname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EVENTNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eventname;
		}
		
		if(Filter.Daystonext != null && filter.Daystonext.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DAYSTONEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Daystonext;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		DojimmsdoseRecord data = (DojimmsdoseRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeUnid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unid);
		}
		
		if(EditFilter.IncludePnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnum);
		}
		
		if(EditFilter.IncludeAhid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AHID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ahid);
		}
		
		if(EditFilter.IncludeImmprofileid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "IMMPROFILEID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Immprofileid);
		}
		
		if(EditFilter.IncludeProduct)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PRODUCT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Product);
		}
		
		if(EditFilter.IncludeDosage)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOSAGE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dosage);
		}
		
		if(EditFilter.IncludeUnitdose)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNITDOSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unitdose);
		}
		
		if(EditFilter.IncludeRoute)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ROUTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Route);
		}
		
		if(EditFilter.IncludeAdmindate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADMINDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Admindate);
		}
		
		if(EditFilter.IncludeAdminby)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADMINBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adminby);
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
		
		if(EditFilter.IncludeRusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusr);
		}
		
		if(EditFilter.IncludeReqid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reqid);
		}
		
		if(EditFilter.IncludeSideeffect)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SIDEEFFECT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sideeffect);
		}
		
		if(EditFilter.IncludeBatchnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BATCHNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Batchnum);
		}
		
		if(EditFilter.IncludeEventnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EVENTNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eventnum);
		}
		
		if(EditFilter.IncludeImmcomment)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "IMMCOMMENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Immcomment);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeRoutetxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ROUTETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Routetxt);
		}
		
		if(EditFilter.IncludeUnitdosetxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNITDOSETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unitdosetxt);
		}
		
		if(EditFilter.IncludeAdminbytxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADMINBYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adminbytxt);
		}
		
		if(EditFilter.IncludeRusrtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusrtxt);
		}
		
		if(EditFilter.IncludeProgname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PROGNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Progname);
		}
		
		if(EditFilter.IncludeEventname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EVENTNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eventname);
		}
		
		if(EditFilter.IncludeDaystonext)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DAYSTONEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Daystonext);
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
			DojimmsdoseRecord record = new DojimmsdoseRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNUM"));
			record.Ahid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AHID"));
			record.Immprofileid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "IMMPROFILEID"));
			record.Product = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRODUCT"));
			record.Dosage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOSAGE"));
			record.Unitdose = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNITDOSE"));
			record.Route = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ROUTE"));
			record.Admindate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMINDATE"));
			record.Adminby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMINBY"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Reqid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQID"));
			record.Sideeffect = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SIDEEFFECT"));
			record.Batchnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BATCHNUM"));
			record.Eventnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EVENTNUM"));
			record.Immcomment = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "IMMCOMMENT"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Routetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ROUTETXT"));
			record.Unitdosetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNITDOSETXT"));
			record.Adminbytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMINBYTXT"));
			record.Rusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSRTXT"));
			record.Progname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROGNAME"));
			record.Eventname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EVENTNAME"));
			record.Daystonext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DAYSTONEXT"));
									
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
			DojimmsdoseRecord record = new DojimmsdoseRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNUM"));
			record.Ahid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AHID"));
			record.Immprofileid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "IMMPROFILEID"));
			record.Product = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRODUCT"));
			record.Dosage = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOSAGE"));
			record.Unitdose = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNITDOSE"));
			record.Route = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ROUTE"));
			record.Admindate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMINDATE"));
			record.Adminby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMINBY"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Reqid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQID"));
			record.Sideeffect = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SIDEEFFECT"));
			record.Batchnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BATCHNUM"));
			record.Eventnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EVENTNUM"));
			record.Immcomment = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "IMMCOMMENT"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Routetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ROUTETXT"));
			record.Unitdosetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNITDOSETXT"));
			record.Adminbytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMINBYTXT"));
			record.Rusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSRTXT"));
			record.Progname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROGNAME"));
			record.Eventname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EVENTNAME"));
			record.Daystonext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DAYSTONEXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class DojimmsdoseCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DojimmsdoseRecord newRecord = new DojimmsdoseRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DojimmsdoseRecord record)
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
		public DojimmsdoseRecord get(int index)
		{
			return (DojimmsdoseRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class DojimmsdoseRecord
	{
		public String Unid = "";
		public String Pnum = "";
		public String Ahid = "";
		public String Immprofileid = "";
		public String Product = "";
		public String Dosage = "";
		public String Unitdose = "";
		public String Route = "";
		public String Admindate = "";
		public String Adminby = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Rusr = "";
		public String Reqid = "";
		public String Sideeffect = "";
		public String Batchnum = "";
		public String Eventnum = "";
		public String Immcomment = "";
		public String Tstp = "";
		public String Routetxt = "";
		public String Unitdosetxt = "";
		public String Adminbytxt = "";
		public String Rusrtxt = "";
		public String Progname = "";
		public String Eventname = "";
		public String Daystonext = "";
				
		
		public void clear()
		{
			Unid = "";
			Pnum = "";
			Ahid = "";
			Immprofileid = "";
			Product = "";
			Dosage = "";
			Unitdose = "";
			Route = "";
			Admindate = "";
			Adminby = "";
			Rdat = "";
			Rtim = "";
			Rusr = "";
			Reqid = "";
			Sideeffect = "";
			Batchnum = "";
			Eventnum = "";
			Immcomment = "";
			Tstp = "";
			Routetxt = "";
			Unitdosetxt = "";
			Adminbytxt = "";
			Rusrtxt = "";
			Progname = "";
			Eventname = "";
			Daystonext = "";
			
		}		
	}
		
		
	public final class DojimmsdoseFilter
	{			
		public String Unid = "";
		public String Pnum = "";
		public String Ahid = "";
		public String Immprofileid = "";
		public String Product = "";
		public String Dosage = "";
		public String Unitdose = "";
		public String Route = "";
		public String Admindate = "";
		public String Adminby = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Rusr = "";
		public String Reqid = "";
		public String Sideeffect = "";
		public String Batchnum = "";
		public String Eventnum = "";
		public String Immcomment = "";
		public String Tstp = "";
		public String Routetxt = "";
		public String Unitdosetxt = "";
		public String Adminbytxt = "";
		public String Rusrtxt = "";
		public String Progname = "";
		public String Eventname = "";
		public String Daystonext = "";
		
		public void clear()
		{				
			Unid = "";
			Pnum = "";
			Ahid = "";
			Immprofileid = "";
			Product = "";
			Dosage = "";
			Unitdose = "";
			Route = "";
			Admindate = "";
			Adminby = "";
			Rdat = "";
			Rtim = "";
			Rusr = "";
			Reqid = "";
			Sideeffect = "";
			Batchnum = "";
			Eventnum = "";
			Immcomment = "";
			Tstp = "";
			Routetxt = "";
			Unitdosetxt = "";
			Adminbytxt = "";
			Rusrtxt = "";
			Progname = "";
			Eventname = "";
			Daystonext = "";
		}	
		public DojimmsdoseFilter cloneObject()
		{
			DojimmsdoseFilter newFilter = new DojimmsdoseFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Pnum = this.Pnum;
			newFilter.Ahid = this.Ahid;
			newFilter.Immprofileid = this.Immprofileid;
			newFilter.Product = this.Product;
			newFilter.Dosage = this.Dosage;
			newFilter.Unitdose = this.Unitdose;
			newFilter.Route = this.Route;
			newFilter.Admindate = this.Admindate;
			newFilter.Adminby = this.Adminby;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Rusr = this.Rusr;
			newFilter.Reqid = this.Reqid;
			newFilter.Sideeffect = this.Sideeffect;
			newFilter.Batchnum = this.Batchnum;
			newFilter.Eventnum = this.Eventnum;
			newFilter.Immcomment = this.Immcomment;
			newFilter.Tstp = this.Tstp;
			newFilter.Routetxt = this.Routetxt;
			newFilter.Unitdosetxt = this.Unitdosetxt;
			newFilter.Adminbytxt = this.Adminbytxt;
			newFilter.Rusrtxt = this.Rusrtxt;
			newFilter.Progname = this.Progname;
			newFilter.Eventname = this.Eventname;
			newFilter.Daystonext = this.Daystonext;
			
			return newFilter;
		}
	}
	public final class DojimmsdoseEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludePnum = true;
		public boolean IncludeAhid = true;
		public boolean IncludeImmprofileid = true;
		public boolean IncludeProduct = true;
		public boolean IncludeDosage = true;
		public boolean IncludeUnitdose = true;
		public boolean IncludeRoute = true;
		public boolean IncludeAdmindate = true;
		public boolean IncludeAdminby = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeRusr = true;
		public boolean IncludeReqid = true;
		public boolean IncludeSideeffect = true;
		public boolean IncludeBatchnum = true;
		public boolean IncludeEventnum = true;
		public boolean IncludeImmcomment = true;
		public boolean IncludeTstp = true;
		public boolean IncludeRoutetxt = true;
		public boolean IncludeUnitdosetxt = true;
		public boolean IncludeAdminbytxt = true;
		public boolean IncludeRusrtxt = true;
		public boolean IncludeProgname = true;
		public boolean IncludeEventname = true;
		public boolean IncludeDaystonext = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludePnum = true;
			IncludeAhid = true;
			IncludeImmprofileid = true;
			IncludeProduct = true;
			IncludeDosage = true;
			IncludeUnitdose = true;
			IncludeRoute = true;
			IncludeAdmindate = true;
			IncludeAdminby = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeRusr = true;
			IncludeReqid = true;
			IncludeSideeffect = true;
			IncludeBatchnum = true;
			IncludeEventnum = true;
			IncludeImmcomment = true;
			IncludeTstp = true;
			IncludeRoutetxt = true;
			IncludeUnitdosetxt = true;
			IncludeAdminbytxt = true;
			IncludeRusrtxt = true;
			IncludeProgname = true;
			IncludeEventname = true;
			IncludeDaystonext = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludePnum = false;
			IncludeAhid = false;
			IncludeImmprofileid = false;
			IncludeProduct = false;
			IncludeDosage = false;
			IncludeUnitdose = false;
			IncludeRoute = false;
			IncludeAdmindate = false;
			IncludeAdminby = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeRusr = false;
			IncludeReqid = false;
			IncludeSideeffect = false;
			IncludeBatchnum = false;
			IncludeEventnum = false;
			IncludeImmcomment = false;
			IncludeTstp = false;
			IncludeRoutetxt = false;
			IncludeUnitdosetxt = false;
			IncludeAdminbytxt = false;
			IncludeRusrtxt = false;
			IncludeProgname = false;
			IncludeEventname = false;
			IncludeDaystonext = false;
		}
		public DojimmsdoseEditFilter cloneObject()
		{
			DojimmsdoseEditFilter newEditFilter = new DojimmsdoseEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludePnum = this.IncludePnum;
			newEditFilter.IncludeAhid = this.IncludeAhid;
			newEditFilter.IncludeImmprofileid = this.IncludeImmprofileid;
			newEditFilter.IncludeProduct = this.IncludeProduct;
			newEditFilter.IncludeDosage = this.IncludeDosage;
			newEditFilter.IncludeUnitdose = this.IncludeUnitdose;
			newEditFilter.IncludeRoute = this.IncludeRoute;
			newEditFilter.IncludeAdmindate = this.IncludeAdmindate;
			newEditFilter.IncludeAdminby = this.IncludeAdminby;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeReqid = this.IncludeReqid;
			newEditFilter.IncludeSideeffect = this.IncludeSideeffect;
			newEditFilter.IncludeBatchnum = this.IncludeBatchnum;
			newEditFilter.IncludeEventnum = this.IncludeEventnum;
			newEditFilter.IncludeImmcomment = this.IncludeImmcomment;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeRoutetxt = this.IncludeRoutetxt;
			newEditFilter.IncludeUnitdosetxt = this.IncludeUnitdosetxt;
			newEditFilter.IncludeAdminbytxt = this.IncludeAdminbytxt;
			newEditFilter.IncludeRusrtxt = this.IncludeRusrtxt;
			newEditFilter.IncludeProgname = this.IncludeProgname;
			newEditFilter.IncludeEventname = this.IncludeEventname;
			newEditFilter.IncludeDaystonext = this.IncludeDaystonext;
			
			return newEditFilter;
		}
	}
}
