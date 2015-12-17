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
// Template ver. 1.0.5 - Last modified on 30/04/2004 10:13 by Marius Mihalec

package ims.dto.client;

public final class Dojnotes
{
	private DojnotesFilter lastGetFilter = null;
	private final String serviceName = "DOJNOTES";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public DojnotesFilter Filter = new DojnotesFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public DojnotesEditFilter EditFilter = new DojnotesEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public DojnotesCollection DataCollection = new DojnotesCollection();

	/**
	 * Creates a new Dojnotes Data Transfer Object.
	 */ 
	public Dojnotes(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Dojnotes cloneObject() throws ims.dto.Exception
	{
		Dojnotes cloneObject = new Dojnotes(Connection);
			
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
			cloneObject.DataCollection.get(index).Epid = DataCollection.get(x).Epid;
			cloneObject.DataCollection.get(index).Ahid = DataCollection.get(x).Ahid;
			cloneObject.DataCollection.get(index).Notestyp = DataCollection.get(x).Notestyp;
			cloneObject.DataCollection.get(index).Role = DataCollection.get(x).Role;
			cloneObject.DataCollection.get(index).Notes = DataCollection.get(x).Notes;
			cloneObject.DataCollection.get(index).Author = DataCollection.get(x).Author;
			cloneObject.DataCollection.get(index).Reqid = DataCollection.get(x).Reqid;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Rusrnam = DataCollection.get(x).Rusrnam;
			cloneObject.DataCollection.get(index).Uusrnam = DataCollection.get(x).Uusrnam;
			cloneObject.DataCollection.get(index).Roletxt = DataCollection.get(x).Roletxt;
							
			
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
		return "Dojnotes.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojnotes.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Dojnotes.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojnotes.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojnotes.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojnotes.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Dojnotes.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Dojnotes.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojnotes.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Dojnotes.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Dojnotes.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Dojnotes.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Dojnotes.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojnotes.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojnotes.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Dojnotes.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Dojnotes.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Dojnotes.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Dojnotes.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Dojnotes.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojnotes.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Dojnotes.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Dojnotes.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojnotes.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Dojnotes.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Dojnotes.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Dojnotes.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Dojnotes.List");
							
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
	private String encodeNASFilter(DojnotesFilter filter)
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
		
		if(Filter.Epid != null && filter.Epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Epid;
		}
		
		if(Filter.Ahid != null && filter.Ahid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AHID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ahid;
		}
		
		if(Filter.Notestyp != null && filter.Notestyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NOTESTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Notestyp;
		}
		
		if(Filter.Role != null && filter.Role.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ROLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Role;
		}
		
		if(Filter.Notes != null && filter.Notes.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NOTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Notes;
		}
		
		if(Filter.Author != null && filter.Author.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AUTHOR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Author;
		}
		
		if(Filter.Reqid != null && filter.Reqid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REQID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reqid;
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
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Rusrnam != null && filter.Rusrnam.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RUSRNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusrnam;
		}
		
		if(Filter.Uusrnam != null && filter.Uusrnam.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UUSRNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uusrnam;
		}
		
		if(Filter.Roletxt != null && filter.Roletxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ROLETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Roletxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		DojnotesRecord data = (DojnotesRecord)DataCollection.get(0);
		
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
		
		if(EditFilter.IncludeEpid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Epid);
		}
		
		if(EditFilter.IncludeAhid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AHID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ahid);
		}
		
		if(EditFilter.IncludeNotestyp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NOTESTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Notestyp);
		}
		
		if(EditFilter.IncludeRole)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ROLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Role);
		}
		
		if(EditFilter.IncludeNotes)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NOTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Notes);
		}
		
		if(EditFilter.IncludeAuthor)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AUTHOR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Author);
		}
		
		if(EditFilter.IncludeReqid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REQID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reqid);
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
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeRusrnam)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RUSRNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusrnam);
		}
		
		if(EditFilter.IncludeUusrnam)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UUSRNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uusrnam);
		}
		
		if(EditFilter.IncludeRoletxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ROLETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Roletxt);
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
			DojnotesRecord record = new DojnotesRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNUM"));
			record.Epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPID"));
			record.Ahid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AHID"));
			record.Notestyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOTESTYP"));
			record.Role = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ROLE"));
			record.Notes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOTES"));
			record.Author = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AUTHOR"));
			record.Reqid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQID"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Rusrnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSRNAM"));
			record.Uusrnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSRNAM"));
			record.Roletxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ROLETXT"));
									
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
			DojnotesRecord record = new DojnotesRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNUM"));
			record.Epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPID"));
			record.Ahid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AHID"));
			record.Notestyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOTESTYP"));
			record.Role = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ROLE"));
			record.Notes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOTES"));
			record.Author = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AUTHOR"));
			record.Reqid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REQID"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Rusrnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSRNAM"));
			record.Uusrnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSRNAM"));
			record.Roletxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ROLETXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class DojnotesCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DojnotesRecord newRecord = new DojnotesRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DojnotesRecord record)
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
		public DojnotesRecord get(int index)
		{
			return (DojnotesRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class DojnotesRecord
	{
		public String Unid = "";
		public String Pnum = "";
		public String Epid = "";
		public String Ahid = "";
		public String Notestyp = "";
		public String Role = "";
		public String Notes = "";
		public String Author = "";
		public String Reqid = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Uusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Tstp = "";
		public String Rusrnam = "";
		public String Uusrnam = "";
		public String Roletxt = "";
				
		
		public void clear()
		{
			Unid = "";
			Pnum = "";
			Epid = "";
			Ahid = "";
			Notestyp = "";
			Role = "";
			Notes = "";
			Author = "";
			Reqid = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Uusr = "";
			Udat = "";
			Utim = "";
			Tstp = "";
			Rusrnam = "";
			Uusrnam = "";
			Roletxt = "";
			
		}		
	}
		
		
	public final class DojnotesFilter
	{			
		public String Unid = "";
		public String Pnum = "";
		public String Epid = "";
		public String Ahid = "";
		public String Notestyp = "";
		public String Role = "";
		public String Notes = "";
		public String Author = "";
		public String Reqid = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Uusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Tstp = "";
		public String Rusrnam = "";
		public String Uusrnam = "";
		public String Roletxt = "";
		
		public void clear()
		{				
			Unid = "";
			Pnum = "";
			Epid = "";
			Ahid = "";
			Notestyp = "";
			Role = "";
			Notes = "";
			Author = "";
			Reqid = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Uusr = "";
			Udat = "";
			Utim = "";
			Tstp = "";
			Rusrnam = "";
			Uusrnam = "";
			Roletxt = "";
		}	
		public DojnotesFilter cloneObject()
		{
			DojnotesFilter newFilter = new DojnotesFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Pnum = this.Pnum;
			newFilter.Epid = this.Epid;
			newFilter.Ahid = this.Ahid;
			newFilter.Notestyp = this.Notestyp;
			newFilter.Role = this.Role;
			newFilter.Notes = this.Notes;
			newFilter.Author = this.Author;
			newFilter.Reqid = this.Reqid;
			newFilter.Rusr = this.Rusr;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Uusr = this.Uusr;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Tstp = this.Tstp;
			newFilter.Rusrnam = this.Rusrnam;
			newFilter.Uusrnam = this.Uusrnam;
			newFilter.Roletxt = this.Roletxt;
			
			return newFilter;
		}
	}
	public final class DojnotesEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludePnum = true;
		public boolean IncludeEpid = true;
		public boolean IncludeAhid = true;
		public boolean IncludeNotestyp = true;
		public boolean IncludeRole = true;
		public boolean IncludeNotes = true;
		public boolean IncludeAuthor = true;
		public boolean IncludeReqid = true;
		public boolean IncludeRusr = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeUusr = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeTstp = true;
		public boolean IncludeRusrnam = true;
		public boolean IncludeUusrnam = true;
		public boolean IncludeRoletxt = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludePnum = true;
			IncludeEpid = true;
			IncludeAhid = true;
			IncludeNotestyp = true;
			IncludeRole = true;
			IncludeNotes = true;
			IncludeAuthor = true;
			IncludeReqid = true;
			IncludeRusr = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeUusr = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeTstp = true;
			IncludeRusrnam = true;
			IncludeUusrnam = true;
			IncludeRoletxt = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludePnum = false;
			IncludeEpid = false;
			IncludeAhid = false;
			IncludeNotestyp = false;
			IncludeRole = false;
			IncludeNotes = false;
			IncludeAuthor = false;
			IncludeReqid = false;
			IncludeRusr = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeUusr = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeTstp = false;
			IncludeRusrnam = false;
			IncludeUusrnam = false;
			IncludeRoletxt = false;
		}
		public DojnotesEditFilter cloneObject()
		{
			DojnotesEditFilter newEditFilter = new DojnotesEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludePnum = this.IncludePnum;
			newEditFilter.IncludeEpid = this.IncludeEpid;
			newEditFilter.IncludeAhid = this.IncludeAhid;
			newEditFilter.IncludeNotestyp = this.IncludeNotestyp;
			newEditFilter.IncludeRole = this.IncludeRole;
			newEditFilter.IncludeNotes = this.IncludeNotes;
			newEditFilter.IncludeAuthor = this.IncludeAuthor;
			newEditFilter.IncludeReqid = this.IncludeReqid;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeRusrnam = this.IncludeRusrnam;
			newEditFilter.IncludeUusrnam = this.IncludeUusrnam;
			newEditFilter.IncludeRoletxt = this.IncludeRoletxt;
			
			return newEditFilter;
		}
	}
}
