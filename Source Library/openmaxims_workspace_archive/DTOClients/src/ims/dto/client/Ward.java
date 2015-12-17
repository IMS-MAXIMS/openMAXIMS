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

public final class Ward
{
	private WardFilter lastGetFilter = null;
	private final String serviceName = "WARD";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public WardFilter Filter = new WardFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public WardEditFilter EditFilter = new WardEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public WardCollection DataCollection = new WardCollection();

	/**
	 * Creates a new Ward Data Transfer Object.
	 */ 
	public Ward(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Ward cloneObject() throws ims.dto.Exception
	{
		Ward cloneObject = new Ward(Connection);
			
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
			cloneObject.DataCollection.get(index).Hpcd = DataCollection.get(x).Hpcd;
			cloneObject.DataCollection.get(index).Site = DataCollection.get(x).Site;
			cloneObject.DataCollection.get(index).Pdate = DataCollection.get(x).Pdate;
			cloneObject.DataCollection.get(index).Mtot = DataCollection.get(x).Mtot;
			cloneObject.DataCollection.get(index).Mocc = DataCollection.get(x).Mocc;
			cloneObject.DataCollection.get(index).Mphd = DataCollection.get(x).Mphd;
			cloneObject.DataCollection.get(index).Mohd = DataCollection.get(x).Mohd;
			cloneObject.DataCollection.get(index).Stot = DataCollection.get(x).Stot;
			cloneObject.DataCollection.get(index).Socc = DataCollection.get(x).Socc;
			cloneObject.DataCollection.get(index).Sphd = DataCollection.get(x).Sphd;
			cloneObject.DataCollection.get(index).Sohd = DataCollection.get(x).Sohd;
			cloneObject.DataCollection.get(index).Name = DataCollection.get(x).Name;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).At01 = DataCollection.get(x).At01;
			cloneObject.DataCollection.get(index).Mavl = DataCollection.get(x).Mavl;
			cloneObject.DataCollection.get(index).Savl = DataCollection.get(x).Savl;
			cloneObject.DataCollection.get(index).Total = DataCollection.get(x).Total;
			cloneObject.DataCollection.get(index).Avail = DataCollection.get(x).Avail;
			cloneObject.DataCollection.get(index).Closed = DataCollection.get(x).Closed;
			cloneObject.DataCollection.get(index).Tci = DataCollection.get(x).Tci;
			cloneObject.DataCollection.get(index).Disc = DataCollection.get(x).Disc;
			cloneObject.DataCollection.get(index).Hltotal = DataCollection.get(x).Hltotal;
			cloneObject.DataCollection.get(index).Allstat = DataCollection.get(x).Allstat;
			cloneObject.DataCollection.get(index).Maxno = DataCollection.get(x).Maxno;
							
			
			for(int iSeqno = 0; iSeqno < DataCollection.get(x).SeqnoCollection.count(); iSeqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnoCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Seqno = DataCollection.get(x).SeqnoCollection.get(iSeqno).Seqno;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Btyp = DataCollection.get(x).SeqnoCollection.get(iSeqno).Btyp;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Mors = DataCollection.get(x).SeqnoCollection.get(iSeqno).Mors;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Dofw = DataCollection.get(x).SeqnoCollection.get(iSeqno).Dofw;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Nbed = DataCollection.get(x).SeqnoCollection.get(iSeqno).Nbed;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Occp = DataCollection.get(x).SeqnoCollection.get(iSeqno).Occp;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Phld = DataCollection.get(x).SeqnoCollection.get(iSeqno).Phld;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Ohld = DataCollection.get(x).SeqnoCollection.get(iSeqno).Ohld;
										
			}
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "0";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Ward.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ward.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Ward.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ward.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ward.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ward.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Ward.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Ward.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ward.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Ward.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Ward.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Ward.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Ward.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Ward.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ward.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Ward.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Ward.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Ward.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Ward.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Ward.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ward.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Ward.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Ward.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ward.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Ward.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Ward.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Ward.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Ward.List");
							
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
	private String encodeNASFilter(WardFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Rsno != null && filter.Rsno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RSNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rsno;
		}
		
		if(Filter.Hpcd != null && filter.Hpcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hpcd;
		}
		
		if(Filter.Site != null && filter.Site.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Site;
		}
		
		if(Filter.Pdate != null && filter.Pdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pdate;
		}
		
		if(Filter.Mtot != null && filter.Mtot.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MTOT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mtot;
		}
		
		if(Filter.Mocc != null && filter.Mocc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MOCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mocc;
		}
		
		if(Filter.Mphd != null && filter.Mphd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MPHD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mphd;
		}
		
		if(Filter.Mohd != null && filter.Mohd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MOHD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mohd;
		}
		
		if(Filter.Stot != null && filter.Stot.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STOT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stot;
		}
		
		if(Filter.Socc != null && filter.Socc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SOCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Socc;
		}
		
		if(Filter.Sphd != null && filter.Sphd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPHD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sphd;
		}
		
		if(Filter.Sohd != null && filter.Sohd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SOHD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sohd;
		}
		
		if(Filter.Name != null && filter.Name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Name;
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat;
		}
		
		if(Filter.At01 != null && filter.At01.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AT01" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.At01;
		}
		
		if(Filter.Mavl != null && filter.Mavl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAVL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mavl;
		}
		
		if(Filter.Savl != null && filter.Savl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SAVL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Savl;
		}
		
		if(Filter.Total != null && filter.Total.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TOTAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Total;
		}
		
		if(Filter.Avail != null && filter.Avail.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AVAIL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Avail;
		}
		
		if(Filter.Closed != null && filter.Closed.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLOSED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Closed;
		}
		
		if(Filter.Tci != null && filter.Tci.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TCI" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tci;
		}
		
		if(Filter.Disc != null && filter.Disc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DISC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Disc;
		}
		
		if(Filter.Hltotal != null && filter.Hltotal.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HLTOTAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hltotal;
		}
		
		if(Filter.Allstat != null && filter.Allstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ALLSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Allstat;
		}
		
		if(Filter.Maxno != null && filter.Maxno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAXNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Maxno;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		WardRecord data = (WardRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeRsno)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RSNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rsno);
		}
		
		if(EditFilter.IncludeHpcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hpcd);
		}
		
		if(EditFilter.IncludeSite)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Site);
		}
		
		if(EditFilter.IncludePdate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pdate);
		}
		
		if(EditFilter.IncludeMtot)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MTOT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mtot);
		}
		
		if(EditFilter.IncludeMocc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MOCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mocc);
		}
		
		if(EditFilter.IncludeMphd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MPHD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mphd);
		}
		
		if(EditFilter.IncludeMohd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MOHD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mohd);
		}
		
		if(EditFilter.IncludeStot)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STOT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stot);
		}
		
		if(EditFilter.IncludeSocc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SOCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Socc);
		}
		
		if(EditFilter.IncludeSphd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPHD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sphd);
		}
		
		if(EditFilter.IncludeSohd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SOHD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sohd);
		}
		
		if(EditFilter.IncludeName)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Name);
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat);
		}
		
		if(EditFilter.IncludeAt01)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AT01" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.At01);
		}
		
		if(EditFilter.IncludeMavl)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MAVL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mavl);
		}
		
		if(EditFilter.IncludeSavl)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SAVL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Savl);
		}
		
		if(EditFilter.IncludeTotal)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TOTAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Total);
		}
		
		if(EditFilter.IncludeAvail)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AVAIL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Avail);
		}
		
		if(EditFilter.IncludeClosed)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLOSED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Closed);
		}
		
		if(EditFilter.IncludeTci)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TCI" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tci);
		}
		
		if(EditFilter.IncludeDisc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DISC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Disc);
		}
		
		if(EditFilter.IncludeHltotal)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HLTOTAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hltotal);
		}
		
		if(EditFilter.IncludeAllstat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ALLSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Allstat);
		}
		
		if(EditFilter.IncludeMaxno)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MAXNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Maxno);
		}
		
		
		for(int x = 0; x < data.SeqnoCollection.count(); x++)
		{
			WardSeqnoRecord rgRecord = (WardSeqnoRecord)data.SeqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Btyp);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MORS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mors);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOFW" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Dofw);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NBED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Nbed);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OCCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Occp);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PHLD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Phld);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OHLD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Ohld);
			
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
			WardRecord record = new WardRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSNO"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
			record.Site = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SITE"));
			record.Pdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PDATE"));
			record.Mtot = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MTOT"));
			record.Mocc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOCC"));
			record.Mphd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MPHD"));
			record.Mohd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOHD"));
			record.Stot = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STOT"));
			record.Socc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOCC"));
			record.Sphd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPHD"));
			record.Sohd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOHD"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.At01 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT01"));
			record.Mavl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAVL"));
			record.Savl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SAVL"));
			record.Total = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TOTAL"));
			record.Avail = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AVAIL"));
			record.Closed = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLOSED"));
			record.Tci = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TCI"));
			record.Disc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISC"));
			record.Hltotal = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HLTOTAL"));
			record.Allstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALLSTAT"));
			record.Maxno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXNO"));
									
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
			WardRecord record = new WardRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSNO"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
			record.Site = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SITE"));
			record.Pdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PDATE"));
			record.Mtot = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MTOT"));
			record.Mocc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOCC"));
			record.Mphd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MPHD"));
			record.Mohd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOHD"));
			record.Stot = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STOT"));
			record.Socc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOCC"));
			record.Sphd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPHD"));
			record.Sohd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOHD"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.At01 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AT01"));
			record.Mavl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAVL"));
			record.Savl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SAVL"));
			record.Total = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TOTAL"));
			record.Avail = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AVAIL"));
			record.Closed = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLOSED"));
			record.Tci = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TCI"));
			record.Disc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISC"));
			record.Hltotal = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HLTOTAL"));
			record.Allstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALLSTAT"));
			record.Maxno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXNO"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					record.SeqnoCollection.add();
			
									
			rgCount = record.SeqnoCollection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno"))
					{
						WardSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("btyp"))
					{
						WardSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Btyp = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("mors"))
					{
						WardSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Mors = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("dofw"))
					{
						WardSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Dofw = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("nbed"))
					{
						WardSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Nbed = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("occp"))
					{
						WardSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Occp = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("phld"))
					{
						WardSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Phld = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("ohld"))
					{
						WardSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Ohld = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class WardCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			WardRecord newRecord = new WardRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(WardRecord record)
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
		public WardRecord get(int index)
		{
			return (WardRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class WardRecord
	{
		public String Rsno = "";
		public String Hpcd = "";
		public String Site = "";
		public String Pdate = "";
		public String Mtot = "";
		public String Mocc = "";
		public String Mphd = "";
		public String Mohd = "";
		public String Stot = "";
		public String Socc = "";
		public String Sphd = "";
		public String Sohd = "";
		public String Name = "";
		public String Stat = "";
		public String At01 = "";
		public String Mavl = "";
		public String Savl = "";
		public String Total = "";
		public String Avail = "";
		public String Closed = "";
		public String Tci = "";
		public String Disc = "";
		public String Hltotal = "";
		public String Allstat = "";
		public String Maxno = "";
		
		public WardSeqnoCollection SeqnoCollection = new WardSeqnoCollection();		
		
		public void clear()
		{
			Rsno = "";
			Hpcd = "";
			Site = "";
			Pdate = "";
			Mtot = "";
			Mocc = "";
			Mphd = "";
			Mohd = "";
			Stot = "";
			Socc = "";
			Sphd = "";
			Sohd = "";
			Name = "";
			Stat = "";
			At01 = "";
			Mavl = "";
			Savl = "";
			Total = "";
			Avail = "";
			Closed = "";
			Tci = "";
			Disc = "";
			Hltotal = "";
			Allstat = "";
			Maxno = "";
			
			SeqnoCollection.clear();
		}		
	}
	
	public final class WardSeqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			WardSeqnoRecord newRecord = new WardSeqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(WardSeqnoRecord record)
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
		public WardSeqnoRecord get(int index)
		{
			return (WardSeqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class WardSeqnoRecord
	{
		public String Seqno = "";
		public String Btyp = "";
		public String Mors = "";
		public String Dofw = "";
		public String Nbed = "";
		public String Occp = "";
		public String Phld = "";
		public String Ohld = "";
		
		public void clear()
		{
			Seqno = "";
			Btyp = "";
			Mors = "";
			Dofw = "";
			Nbed = "";
			Occp = "";
			Phld = "";
			Ohld = "";
			
		}
	}	
	public final class WardFilter
	{			
		public String Rsno = "";
		public String Hpcd = "";
		public String Site = "";
		public String Pdate = "";
		public String Mtot = "";
		public String Mocc = "";
		public String Mphd = "";
		public String Mohd = "";
		public String Stot = "";
		public String Socc = "";
		public String Sphd = "";
		public String Sohd = "";
		public String Name = "";
		public String Stat = "";
		public String At01 = "";
		public String Mavl = "";
		public String Savl = "";
		public String Total = "";
		public String Avail = "";
		public String Closed = "";
		public String Tci = "";
		public String Disc = "";
		public String Hltotal = "";
		public String Allstat = "";
		public String Maxno = "";
		
		public void clear()
		{				
			Rsno = "";
			Hpcd = "";
			Site = "";
			Pdate = "";
			Mtot = "";
			Mocc = "";
			Mphd = "";
			Mohd = "";
			Stot = "";
			Socc = "";
			Sphd = "";
			Sohd = "";
			Name = "";
			Stat = "";
			At01 = "";
			Mavl = "";
			Savl = "";
			Total = "";
			Avail = "";
			Closed = "";
			Tci = "";
			Disc = "";
			Hltotal = "";
			Allstat = "";
			Maxno = "";
		}	
		public WardFilter cloneObject()
		{
			WardFilter newFilter = new WardFilter();
			
			newFilter.Rsno = this.Rsno;
			newFilter.Hpcd = this.Hpcd;
			newFilter.Site = this.Site;
			newFilter.Pdate = this.Pdate;
			newFilter.Mtot = this.Mtot;
			newFilter.Mocc = this.Mocc;
			newFilter.Mphd = this.Mphd;
			newFilter.Mohd = this.Mohd;
			newFilter.Stot = this.Stot;
			newFilter.Socc = this.Socc;
			newFilter.Sphd = this.Sphd;
			newFilter.Sohd = this.Sohd;
			newFilter.Name = this.Name;
			newFilter.Stat = this.Stat;
			newFilter.At01 = this.At01;
			newFilter.Mavl = this.Mavl;
			newFilter.Savl = this.Savl;
			newFilter.Total = this.Total;
			newFilter.Avail = this.Avail;
			newFilter.Closed = this.Closed;
			newFilter.Tci = this.Tci;
			newFilter.Disc = this.Disc;
			newFilter.Hltotal = this.Hltotal;
			newFilter.Allstat = this.Allstat;
			newFilter.Maxno = this.Maxno;
			
			return newFilter;
		}
	}
	public final class WardEditFilter
	{			
		public boolean IncludeRsno = true;
		public boolean IncludeHpcd = true;
		public boolean IncludeSite = true;
		public boolean IncludePdate = true;
		public boolean IncludeMtot = true;
		public boolean IncludeMocc = true;
		public boolean IncludeMphd = true;
		public boolean IncludeMohd = true;
		public boolean IncludeStot = true;
		public boolean IncludeSocc = true;
		public boolean IncludeSphd = true;
		public boolean IncludeSohd = true;
		public boolean IncludeName = true;
		public boolean IncludeStat = true;
		public boolean IncludeAt01 = true;
		public boolean IncludeMavl = true;
		public boolean IncludeSavl = true;
		public boolean IncludeTotal = true;
		public boolean IncludeAvail = true;
		public boolean IncludeClosed = true;
		public boolean IncludeTci = true;
		public boolean IncludeDisc = true;
		public boolean IncludeHltotal = true;
		public boolean IncludeAllstat = true;
		public boolean IncludeMaxno = true;
		
		public void includeAll()
		{				
			IncludeRsno = true;
			IncludeHpcd = true;
			IncludeSite = true;
			IncludePdate = true;
			IncludeMtot = true;
			IncludeMocc = true;
			IncludeMphd = true;
			IncludeMohd = true;
			IncludeStot = true;
			IncludeSocc = true;
			IncludeSphd = true;
			IncludeSohd = true;
			IncludeName = true;
			IncludeStat = true;
			IncludeAt01 = true;
			IncludeMavl = true;
			IncludeSavl = true;
			IncludeTotal = true;
			IncludeAvail = true;
			IncludeClosed = true;
			IncludeTci = true;
			IncludeDisc = true;
			IncludeHltotal = true;
			IncludeAllstat = true;
			IncludeMaxno = true;
		}	
		public void excludeAll()
		{				
			IncludeRsno = false;
			IncludeHpcd = false;
			IncludeSite = false;
			IncludePdate = false;
			IncludeMtot = false;
			IncludeMocc = false;
			IncludeMphd = false;
			IncludeMohd = false;
			IncludeStot = false;
			IncludeSocc = false;
			IncludeSphd = false;
			IncludeSohd = false;
			IncludeName = false;
			IncludeStat = false;
			IncludeAt01 = false;
			IncludeMavl = false;
			IncludeSavl = false;
			IncludeTotal = false;
			IncludeAvail = false;
			IncludeClosed = false;
			IncludeTci = false;
			IncludeDisc = false;
			IncludeHltotal = false;
			IncludeAllstat = false;
			IncludeMaxno = false;
		}
		public WardEditFilter cloneObject()
		{
			WardEditFilter newEditFilter = new WardEditFilter();
			
			newEditFilter.IncludeRsno = this.IncludeRsno;
			newEditFilter.IncludeHpcd = this.IncludeHpcd;
			newEditFilter.IncludeSite = this.IncludeSite;
			newEditFilter.IncludePdate = this.IncludePdate;
			newEditFilter.IncludeMtot = this.IncludeMtot;
			newEditFilter.IncludeMocc = this.IncludeMocc;
			newEditFilter.IncludeMphd = this.IncludeMphd;
			newEditFilter.IncludeMohd = this.IncludeMohd;
			newEditFilter.IncludeStot = this.IncludeStot;
			newEditFilter.IncludeSocc = this.IncludeSocc;
			newEditFilter.IncludeSphd = this.IncludeSphd;
			newEditFilter.IncludeSohd = this.IncludeSohd;
			newEditFilter.IncludeName = this.IncludeName;
			newEditFilter.IncludeStat = this.IncludeStat;
			newEditFilter.IncludeAt01 = this.IncludeAt01;
			newEditFilter.IncludeMavl = this.IncludeMavl;
			newEditFilter.IncludeSavl = this.IncludeSavl;
			newEditFilter.IncludeTotal = this.IncludeTotal;
			newEditFilter.IncludeAvail = this.IncludeAvail;
			newEditFilter.IncludeClosed = this.IncludeClosed;
			newEditFilter.IncludeTci = this.IncludeTci;
			newEditFilter.IncludeDisc = this.IncludeDisc;
			newEditFilter.IncludeHltotal = this.IncludeHltotal;
			newEditFilter.IncludeAllstat = this.IncludeAllstat;
			newEditFilter.IncludeMaxno = this.IncludeMaxno;
			
			return newEditFilter;
		}
	}
}
