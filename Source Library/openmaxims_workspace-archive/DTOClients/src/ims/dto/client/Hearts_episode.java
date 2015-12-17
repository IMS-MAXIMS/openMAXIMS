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
// Template ver. 1.0.3 - Last modified on 12/03/2004 10:13 by Marius Mihalec

package ims.dto.client;

public final class Hearts_episode
{
	private Hearts_episodeFilter lastGetFilter = null;
	private final String serviceName = "HEARTS_EPISODE";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Hearts_episodeFilter Filter = new Hearts_episodeFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Hearts_episodeEditFilter EditFilter = new Hearts_episodeEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Hearts_episodeCollection DataCollection = new Hearts_episodeCollection();

	/**
	 * Creates a new Hearts_episode Data Transfer Object.
	 */ 
	public Hearts_episode(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Hearts_episode cloneObject() throws ims.dto.Exception
	{
		Hearts_episode cloneObject = new Hearts_episode(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Epsd = DataCollection.get(x).Epsd;
			cloneObject.DataCollection.get(index).Date = DataCollection.get(x).Date;
			cloneObject.DataCollection.get(index).Cons = DataCollection.get(x).Cons;
			cloneObject.DataCollection.get(index).Hosp = DataCollection.get(x).Hosp;
			cloneObject.DataCollection.get(index).Rect = DataCollection.get(x).Rect;
			cloneObject.DataCollection.get(index).Sex = DataCollection.get(x).Sex;
			cloneObject.DataCollection.get(index).Mart = DataCollection.get(x).Mart;
			cloneObject.DataCollection.get(index).Addt = DataCollection.get(x).Addt;
			cloneObject.DataCollection.get(index).Admt = DataCollection.get(x).Admt;
			cloneObject.DataCollection.get(index).Adsc = DataCollection.get(x).Adsc;
			cloneObject.DataCollection.get(index).Eldt = DataCollection.get(x).Eldt;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).Intn = DataCollection.get(x).Intn;
			cloneObject.DataCollection.get(index).Epst = DataCollection.get(x).Epst;
			cloneObject.DataCollection.get(index).Epen = DataCollection.get(x).Epen;
			cloneObject.DataCollection.get(index).Spcd = DataCollection.get(x).Spcd;
			cloneObject.DataCollection.get(index).Prdi = DataCollection.get(x).Prdi;
			cloneObject.DataCollection.get(index).Dsmt = DataCollection.get(x).Dsmt;
			cloneObject.DataCollection.get(index).Dsds = DataCollection.get(x).Dsds;
			cloneObject.DataCollection.get(index).Ward = DataCollection.get(x).Ward;
			cloneObject.DataCollection.get(index).Codt = DataCollection.get(x).Codt;
			cloneObject.DataCollection.get(index).Clin = DataCollection.get(x).Clin;
			cloneObject.DataCollection.get(index).Ckey = DataCollection.get(x).Ckey;
			cloneObject.DataCollection.get(index).Rfcd = DataCollection.get(x).Rfcd;
			cloneObject.DataCollection.get(index).Rfgp = DataCollection.get(x).Rfgp;
			cloneObject.DataCollection.get(index).Adtm = DataCollection.get(x).Adtm;
			cloneObject.DataCollection.get(index).Estm = DataCollection.get(x).Estm;
			cloneObject.DataCollection.get(index).Eetm = DataCollection.get(x).Eetm;
			cloneObject.DataCollection.get(index).Wkey = DataCollection.get(x).Wkey;
			cloneObject.DataCollection.get(index).Oned = DataCollection.get(x).Oned;
			cloneObject.DataCollection.get(index).Post = DataCollection.get(x).Post;
			cloneObject.DataCollection.get(index).Harc = DataCollection.get(x).Harc;
			cloneObject.DataCollection.get(index).Refr = DataCollection.get(x).Refr;
			cloneObject.DataCollection.get(index).Cars = DataCollection.get(x).Cars;
			cloneObject.DataCollection.get(index).Lofs = DataCollection.get(x).Lofs;
			cloneObject.DataCollection.get(index).Hcpname = DataCollection.get(x).Hcpname;
			cloneObject.DataCollection.get(index).Spctext = DataCollection.get(x).Spctext;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Max_no = DataCollection.get(x).Max_no;
			cloneObject.DataCollection.get(index).Codttxt = DataCollection.get(x).Codttxt;
			cloneObject.DataCollection.get(index).Wardname = DataCollection.get(x).Wardname;
			cloneObject.DataCollection.get(index).Adsctxt = DataCollection.get(x).Adsctxt;
			cloneObject.DataCollection.get(index).Dsdstxt = DataCollection.get(x).Dsdstxt;
			cloneObject.DataCollection.get(index).Dsmttxt = DataCollection.get(x).Dsmttxt;
			cloneObject.DataCollection.get(index).Rfcdtxt = DataCollection.get(x).Rfcdtxt;
			cloneObject.DataCollection.get(index).Pcg1 = DataCollection.get(x).Pcg1;
			cloneObject.DataCollection.get(index).Ha1 = DataCollection.get(x).Ha1;
			cloneObject.DataCollection.get(index).Pcg2 = DataCollection.get(x).Pcg2;
			cloneObject.DataCollection.get(index).Ha2 = DataCollection.get(x).Ha2;
			cloneObject.DataCollection.get(index).Mc = DataCollection.get(x).Mc;
			cloneObject.DataCollection.get(index).Cota = DataCollection.get(x).Cota;
			cloneObject.DataCollection.get(index).Har = DataCollection.get(x).Har;
			cloneObject.DataCollection.get(index).Hrg = DataCollection.get(x).Hrg;
			cloneObject.DataCollection.get(index).Dgvp = DataCollection.get(x).Dgvp;
			cloneObject.DataCollection.get(index).Ver = DataCollection.get(x).Ver;
			cloneObject.DataCollection.get(index).Prditxt = DataCollection.get(x).Prditxt;
							
			
		}
		
		return cloneObject;
	}		
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_episode.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Hearts_episode.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_episode.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_episode.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_episode.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Hearts_episode.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Hearts_episode.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_episode.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Hearts_episode.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Hearts_episode.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Hearts_episode.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Hearts_episode.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Hearts_episode.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_episode.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Hearts_episode.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Hearts_episode.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Hearts_episode.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Hearts_episode.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Hearts_episode.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_episode.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Hearts_episode.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Hearts_episode.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_episode.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Hearts_episode.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Hearts_episode.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Hearts_episode.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Hearts_episode.List");
							
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
	private String encodeNASFilter(Hearts_episodeFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey;
		}
		
		if(Filter.Epsd != null && filter.Epsd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EPSD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Epsd;
		}
		
		if(Filter.Date != null && filter.Date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Date;
		}
		
		if(Filter.Cons != null && filter.Cons.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cons;
		}
		
		if(Filter.Hosp != null && filter.Hosp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HOSP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hosp;
		}
		
		if(Filter.Rect != null && filter.Rect.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RECT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rect;
		}
		
		if(Filter.Sex != null && filter.Sex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sex;
		}
		
		if(Filter.Mart != null && filter.Mart.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MART" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mart;
		}
		
		if(Filter.Addt != null && filter.Addt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Addt;
		}
		
		if(Filter.Admt != null && filter.Admt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADMT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Admt;
		}
		
		if(Filter.Adsc != null && filter.Adsc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADSC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adsc;
		}
		
		if(Filter.Eldt != null && filter.Eldt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ELDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eldt;
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat;
		}
		
		if(Filter.Intn != null && filter.Intn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "INTN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Intn;
		}
		
		if(Filter.Epst != null && filter.Epst.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EPST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Epst;
		}
		
		if(Filter.Epen != null && filter.Epen.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EPEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Epen;
		}
		
		if(Filter.Spcd != null && filter.Spcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spcd;
		}
		
		if(Filter.Prdi != null && filter.Prdi.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PRDI" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prdi;
		}
		
		if(Filter.Dsmt != null && filter.Dsmt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DSMT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dsmt;
		}
		
		if(Filter.Dsds != null && filter.Dsds.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DSDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dsds;
		}
		
		if(Filter.Ward != null && filter.Ward.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WARD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ward;
		}
		
		if(Filter.Codt != null && filter.Codt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CODT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Codt;
		}
		
		if(Filter.Clin != null && filter.Clin.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clin;
		}
		
		if(Filter.Ckey != null && filter.Ckey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ckey;
		}
		
		if(Filter.Rfcd != null && filter.Rfcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RFCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rfcd;
		}
		
		if(Filter.Rfgp != null && filter.Rfgp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RFGP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rfgp;
		}
		
		if(Filter.Adtm != null && filter.Adtm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adtm;
		}
		
		if(Filter.Estm != null && filter.Estm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ESTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Estm;
		}
		
		if(Filter.Eetm != null && filter.Eetm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EETM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eetm;
		}
		
		if(Filter.Wkey != null && filter.Wkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wkey;
		}
		
		if(Filter.Oned != null && filter.Oned.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ONED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Oned;
		}
		
		if(Filter.Post != null && filter.Post.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "POST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Post;
		}
		
		if(Filter.Harc != null && filter.Harc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HARC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Harc;
		}
		
		if(Filter.Refr != null && filter.Refr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refr;
		}
		
		if(Filter.Cars != null && filter.Cars.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CARS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cars;
		}
		
		if(Filter.Lofs != null && filter.Lofs.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LOFS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lofs;
		}
		
		if(Filter.Hcpname != null && filter.Hcpname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpname;
		}
		
		if(Filter.Spctext != null && filter.Spctext.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPCTEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spctext;
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum;
		}
		
		if(Filter.Max_no != null && filter.Max_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAX_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Max_no;
		}
		
		if(Filter.Codttxt != null && filter.Codttxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CODTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Codttxt;
		}
		
		if(Filter.Wardname != null && filter.Wardname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WARDNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wardname;
		}
		
		if(Filter.Adsctxt != null && filter.Adsctxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADSCTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adsctxt;
		}
		
		if(Filter.Dsdstxt != null && filter.Dsdstxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DSDSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dsdstxt;
		}
		
		if(Filter.Dsmttxt != null && filter.Dsmttxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DSMTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dsmttxt;
		}
		
		if(Filter.Rfcdtxt != null && filter.Rfcdtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RFCDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rfcdtxt;
		}
		
		if(Filter.Pcg1 != null && filter.Pcg1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PCG1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pcg1;
		}
		
		if(Filter.Ha1 != null && filter.Ha1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HA1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ha1;
		}
		
		if(Filter.Pcg2 != null && filter.Pcg2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PCG2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pcg2;
		}
		
		if(Filter.Ha2 != null && filter.Ha2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HA2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ha2;
		}
		
		if(Filter.Mc != null && filter.Mc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mc;
		}
		
		if(Filter.Cota != null && filter.Cota.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COTA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cota;
		}
		
		if(Filter.Har != null && filter.Har.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HAR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Har;
		}
		
		if(Filter.Hrg != null && filter.Hrg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HRG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hrg;
		}
		
		if(Filter.Dgvp != null && filter.Dgvp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DGVP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dgvp;
		}
		
		if(Filter.Ver != null && filter.Ver.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "VER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ver;
		}
		
		if(Filter.Prditxt != null && filter.Prditxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PRDITXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prditxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Hearts_episodeRecord data = (Hearts_episodeRecord)DataCollection.get(0);
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
		}
		
		if(EditFilter.IncludeEpsd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EPSD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Epsd);
		}
		
		if(EditFilter.IncludeDate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Date);
		}
		
		if(EditFilter.IncludeCons)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cons);
		}
		
		if(EditFilter.IncludeHosp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HOSP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hosp);
		}
		
		if(EditFilter.IncludeRect)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RECT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rect);
		}
		
		if(EditFilter.IncludeSex)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sex);
		}
		
		if(EditFilter.IncludeMart)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MART" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mart);
		}
		
		if(EditFilter.IncludeAddt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Addt);
		}
		
		if(EditFilter.IncludeAdmt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADMT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Admt);
		}
		
		if(EditFilter.IncludeAdsc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADSC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adsc);
		}
		
		if(EditFilter.IncludeEldt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ELDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eldt);
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat);
		}
		
		if(EditFilter.IncludeIntn)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "INTN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Intn);
		}
		
		if(EditFilter.IncludeEpst)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EPST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Epst);
		}
		
		if(EditFilter.IncludeEpen)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EPEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Epen);
		}
		
		if(EditFilter.IncludeSpcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spcd);
		}
		
		if(EditFilter.IncludePrdi)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PRDI" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prdi);
		}
		
		if(EditFilter.IncludeDsmt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DSMT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dsmt);
		}
		
		if(EditFilter.IncludeDsds)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DSDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dsds);
		}
		
		if(EditFilter.IncludeWard)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WARD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ward);
		}
		
		if(EditFilter.IncludeCodt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CODT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Codt);
		}
		
		if(EditFilter.IncludeClin)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clin);
		}
		
		if(EditFilter.IncludeCkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ckey);
		}
		
		if(EditFilter.IncludeRfcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RFCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rfcd);
		}
		
		if(EditFilter.IncludeRfgp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RFGP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rfgp);
		}
		
		if(EditFilter.IncludeAdtm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adtm);
		}
		
		if(EditFilter.IncludeEstm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ESTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Estm);
		}
		
		if(EditFilter.IncludeEetm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EETM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eetm);
		}
		
		if(EditFilter.IncludeWkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wkey);
		}
		
		if(EditFilter.IncludeOned)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ONED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Oned);
		}
		
		if(EditFilter.IncludePost)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "POST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Post);
		}
		
		if(EditFilter.IncludeHarc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HARC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Harc);
		}
		
		if(EditFilter.IncludeRefr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refr);
		}
		
		if(EditFilter.IncludeCars)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CARS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cars);
		}
		
		if(EditFilter.IncludeLofs)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LOFS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lofs);
		}
		
		if(EditFilter.IncludeHcpname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpname);
		}
		
		if(EditFilter.IncludeSpctext)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPCTEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spctext);
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum);
		}
		
		if(EditFilter.IncludeMax_no)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MAX_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Max_no);
		}
		
		if(EditFilter.IncludeCodttxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CODTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Codttxt);
		}
		
		if(EditFilter.IncludeWardname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WARDNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wardname);
		}
		
		if(EditFilter.IncludeAdsctxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADSCTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adsctxt);
		}
		
		if(EditFilter.IncludeDsdstxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DSDSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dsdstxt);
		}
		
		if(EditFilter.IncludeDsmttxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DSMTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dsmttxt);
		}
		
		if(EditFilter.IncludeRfcdtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RFCDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rfcdtxt);
		}
		
		if(EditFilter.IncludePcg1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PCG1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pcg1);
		}
		
		if(EditFilter.IncludeHa1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HA1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ha1);
		}
		
		if(EditFilter.IncludePcg2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PCG2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pcg2);
		}
		
		if(EditFilter.IncludeHa2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HA2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ha2);
		}
		
		if(EditFilter.IncludeMc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mc);
		}
		
		if(EditFilter.IncludeCota)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COTA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cota);
		}
		
		if(EditFilter.IncludeHar)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HAR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Har);
		}
		
		if(EditFilter.IncludeHrg)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HRG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hrg);
		}
		
		if(EditFilter.IncludeDgvp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DGVP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dgvp);
		}
		
		if(EditFilter.IncludeVer)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "VER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ver);
		}
		
		if(EditFilter.IncludePrditxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PRDITXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prditxt);
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
			Hearts_episodeRecord record = new Hearts_episodeRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Epsd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPSD"));
			record.Date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATE"));
			record.Cons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONS"));
			record.Hosp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSP"));
			record.Rect = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RECT"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Mart = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MART"));
			record.Addt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDT"));
			record.Admt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMT"));
			record.Adsc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSC"));
			record.Eldt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ELDT"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Intn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INTN"));
			record.Epst = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPST"));
			record.Epen = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPEN"));
			record.Spcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCD"));
			record.Prdi = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRDI"));
			record.Dsmt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSMT"));
			record.Dsds = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSDS"));
			record.Ward = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WARD"));
			record.Codt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CODT"));
			record.Clin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLIN"));
			record.Ckey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CKEY"));
			record.Rfcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFCD"));
			record.Rfgp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFGP"));
			record.Adtm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADTM"));
			record.Estm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTM"));
			record.Eetm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EETM"));
			record.Wkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WKEY"));
			record.Oned = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONED"));
			record.Post = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POST"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
			record.Refr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFR"));
			record.Cars = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CARS"));
			record.Lofs = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LOFS"));
			record.Hcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNAME"));
			record.Spctext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCTEXT"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Max_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAX_NO"));
			record.Codttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CODTTXT"));
			record.Wardname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WARDNAME"));
			record.Adsctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSCTXT"));
			record.Dsdstxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSDSTXT"));
			record.Dsmttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSMTTXT"));
			record.Rfcdtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFCDTXT"));
			record.Pcg1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCG1"));
			record.Ha1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HA1"));
			record.Pcg2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCG2"));
			record.Ha2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HA2"));
			record.Mc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC"));
			record.Cota = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COTA"));
			record.Har = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HAR"));
			record.Hrg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HRG"));
			record.Dgvp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DGVP"));
			record.Ver = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VER"));
			record.Prditxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRDITXT"));
									
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
			Hearts_episodeRecord record = new Hearts_episodeRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Epsd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPSD"));
			record.Date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATE"));
			record.Cons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONS"));
			record.Hosp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSP"));
			record.Rect = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RECT"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Mart = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MART"));
			record.Addt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDT"));
			record.Admt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMT"));
			record.Adsc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSC"));
			record.Eldt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ELDT"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Intn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INTN"));
			record.Epst = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPST"));
			record.Epen = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPEN"));
			record.Spcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCD"));
			record.Prdi = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRDI"));
			record.Dsmt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSMT"));
			record.Dsds = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSDS"));
			record.Ward = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WARD"));
			record.Codt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CODT"));
			record.Clin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLIN"));
			record.Ckey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CKEY"));
			record.Rfcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFCD"));
			record.Rfgp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFGP"));
			record.Adtm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADTM"));
			record.Estm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTM"));
			record.Eetm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EETM"));
			record.Wkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WKEY"));
			record.Oned = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ONED"));
			record.Post = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POST"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
			record.Refr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFR"));
			record.Cars = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CARS"));
			record.Lofs = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LOFS"));
			record.Hcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNAME"));
			record.Spctext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCTEXT"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Max_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAX_NO"));
			record.Codttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CODTTXT"));
			record.Wardname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WARDNAME"));
			record.Adsctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSCTXT"));
			record.Dsdstxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSDSTXT"));
			record.Dsmttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSMTTXT"));
			record.Rfcdtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFCDTXT"));
			record.Pcg1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCG1"));
			record.Ha1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HA1"));
			record.Pcg2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCG2"));
			record.Ha2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HA2"));
			record.Mc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MC"));
			record.Cota = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COTA"));
			record.Har = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HAR"));
			record.Hrg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HRG"));
			record.Dgvp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DGVP"));
			record.Ver = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VER"));
			record.Prditxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRDITXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class Hearts_episodeCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Hearts_episodeRecord newRecord = new Hearts_episodeRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Hearts_episodeRecord record)
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
		public Hearts_episodeRecord get(int index)
		{
			return (Hearts_episodeRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Hearts_episodeRecord
	{
		public String Pkey = "";
		public String Epsd = "";
		public String Date = "";
		public String Cons = "";
		public String Hosp = "";
		public String Rect = "";
		public String Sex = "";
		public String Mart = "";
		public String Addt = "";
		public String Admt = "";
		public String Adsc = "";
		public String Eldt = "";
		public String Stat = "";
		public String Intn = "";
		public String Epst = "";
		public String Epen = "";
		public String Spcd = "";
		public String Prdi = "";
		public String Dsmt = "";
		public String Dsds = "";
		public String Ward = "";
		public String Codt = "";
		public String Clin = "";
		public String Ckey = "";
		public String Rfcd = "";
		public String Rfgp = "";
		public String Adtm = "";
		public String Estm = "";
		public String Eetm = "";
		public String Wkey = "";
		public String Oned = "";
		public String Post = "";
		public String Harc = "";
		public String Refr = "";
		public String Cars = "";
		public String Lofs = "";
		public String Hcpname = "";
		public String Spctext = "";
		public String Hospnum = "";
		public String Max_no = "";
		public String Codttxt = "";
		public String Wardname = "";
		public String Adsctxt = "";
		public String Dsdstxt = "";
		public String Dsmttxt = "";
		public String Rfcdtxt = "";
		public String Pcg1 = "";
		public String Ha1 = "";
		public String Pcg2 = "";
		public String Ha2 = "";
		public String Mc = "";
		public String Cota = "";
		public String Har = "";
		public String Hrg = "";
		public String Dgvp = "";
		public String Ver = "";
		public String Prditxt = "";
				
		
		public void clear()
		{
			Pkey = "";
			Epsd = "";
			Date = "";
			Cons = "";
			Hosp = "";
			Rect = "";
			Sex = "";
			Mart = "";
			Addt = "";
			Admt = "";
			Adsc = "";
			Eldt = "";
			Stat = "";
			Intn = "";
			Epst = "";
			Epen = "";
			Spcd = "";
			Prdi = "";
			Dsmt = "";
			Dsds = "";
			Ward = "";
			Codt = "";
			Clin = "";
			Ckey = "";
			Rfcd = "";
			Rfgp = "";
			Adtm = "";
			Estm = "";
			Eetm = "";
			Wkey = "";
			Oned = "";
			Post = "";
			Harc = "";
			Refr = "";
			Cars = "";
			Lofs = "";
			Hcpname = "";
			Spctext = "";
			Hospnum = "";
			Max_no = "";
			Codttxt = "";
			Wardname = "";
			Adsctxt = "";
			Dsdstxt = "";
			Dsmttxt = "";
			Rfcdtxt = "";
			Pcg1 = "";
			Ha1 = "";
			Pcg2 = "";
			Ha2 = "";
			Mc = "";
			Cota = "";
			Har = "";
			Hrg = "";
			Dgvp = "";
			Ver = "";
			Prditxt = "";
			
		}		
	}
		
		
	public final class Hearts_episodeFilter
	{			
		public String Pkey = "";
		public String Epsd = "";
		public String Date = "";
		public String Cons = "";
		public String Hosp = "";
		public String Rect = "";
		public String Sex = "";
		public String Mart = "";
		public String Addt = "";
		public String Admt = "";
		public String Adsc = "";
		public String Eldt = "";
		public String Stat = "";
		public String Intn = "";
		public String Epst = "";
		public String Epen = "";
		public String Spcd = "";
		public String Prdi = "";
		public String Dsmt = "";
		public String Dsds = "";
		public String Ward = "";
		public String Codt = "";
		public String Clin = "";
		public String Ckey = "";
		public String Rfcd = "";
		public String Rfgp = "";
		public String Adtm = "";
		public String Estm = "";
		public String Eetm = "";
		public String Wkey = "";
		public String Oned = "";
		public String Post = "";
		public String Harc = "";
		public String Refr = "";
		public String Cars = "";
		public String Lofs = "";
		public String Hcpname = "";
		public String Spctext = "";
		public String Hospnum = "";
		public String Max_no = "";
		public String Codttxt = "";
		public String Wardname = "";
		public String Adsctxt = "";
		public String Dsdstxt = "";
		public String Dsmttxt = "";
		public String Rfcdtxt = "";
		public String Pcg1 = "";
		public String Ha1 = "";
		public String Pcg2 = "";
		public String Ha2 = "";
		public String Mc = "";
		public String Cota = "";
		public String Har = "";
		public String Hrg = "";
		public String Dgvp = "";
		public String Ver = "";
		public String Prditxt = "";
		
		public void clear()
		{				
			Pkey = "";
			Epsd = "";
			Date = "";
			Cons = "";
			Hosp = "";
			Rect = "";
			Sex = "";
			Mart = "";
			Addt = "";
			Admt = "";
			Adsc = "";
			Eldt = "";
			Stat = "";
			Intn = "";
			Epst = "";
			Epen = "";
			Spcd = "";
			Prdi = "";
			Dsmt = "";
			Dsds = "";
			Ward = "";
			Codt = "";
			Clin = "";
			Ckey = "";
			Rfcd = "";
			Rfgp = "";
			Adtm = "";
			Estm = "";
			Eetm = "";
			Wkey = "";
			Oned = "";
			Post = "";
			Harc = "";
			Refr = "";
			Cars = "";
			Lofs = "";
			Hcpname = "";
			Spctext = "";
			Hospnum = "";
			Max_no = "";
			Codttxt = "";
			Wardname = "";
			Adsctxt = "";
			Dsdstxt = "";
			Dsmttxt = "";
			Rfcdtxt = "";
			Pcg1 = "";
			Ha1 = "";
			Pcg2 = "";
			Ha2 = "";
			Mc = "";
			Cota = "";
			Har = "";
			Hrg = "";
			Dgvp = "";
			Ver = "";
			Prditxt = "";
		}	
		public Hearts_episodeFilter cloneObject()
		{
			Hearts_episodeFilter newFilter = new Hearts_episodeFilter();
			
			newFilter.Pkey = this.Pkey;
			newFilter.Epsd = this.Epsd;
			newFilter.Date = this.Date;
			newFilter.Cons = this.Cons;
			newFilter.Hosp = this.Hosp;
			newFilter.Rect = this.Rect;
			newFilter.Sex = this.Sex;
			newFilter.Mart = this.Mart;
			newFilter.Addt = this.Addt;
			newFilter.Admt = this.Admt;
			newFilter.Adsc = this.Adsc;
			newFilter.Eldt = this.Eldt;
			newFilter.Stat = this.Stat;
			newFilter.Intn = this.Intn;
			newFilter.Epst = this.Epst;
			newFilter.Epen = this.Epen;
			newFilter.Spcd = this.Spcd;
			newFilter.Prdi = this.Prdi;
			newFilter.Dsmt = this.Dsmt;
			newFilter.Dsds = this.Dsds;
			newFilter.Ward = this.Ward;
			newFilter.Codt = this.Codt;
			newFilter.Clin = this.Clin;
			newFilter.Ckey = this.Ckey;
			newFilter.Rfcd = this.Rfcd;
			newFilter.Rfgp = this.Rfgp;
			newFilter.Adtm = this.Adtm;
			newFilter.Estm = this.Estm;
			newFilter.Eetm = this.Eetm;
			newFilter.Wkey = this.Wkey;
			newFilter.Oned = this.Oned;
			newFilter.Post = this.Post;
			newFilter.Harc = this.Harc;
			newFilter.Refr = this.Refr;
			newFilter.Cars = this.Cars;
			newFilter.Lofs = this.Lofs;
			newFilter.Hcpname = this.Hcpname;
			newFilter.Spctext = this.Spctext;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Max_no = this.Max_no;
			newFilter.Codttxt = this.Codttxt;
			newFilter.Wardname = this.Wardname;
			newFilter.Adsctxt = this.Adsctxt;
			newFilter.Dsdstxt = this.Dsdstxt;
			newFilter.Dsmttxt = this.Dsmttxt;
			newFilter.Rfcdtxt = this.Rfcdtxt;
			newFilter.Pcg1 = this.Pcg1;
			newFilter.Ha1 = this.Ha1;
			newFilter.Pcg2 = this.Pcg2;
			newFilter.Ha2 = this.Ha2;
			newFilter.Mc = this.Mc;
			newFilter.Cota = this.Cota;
			newFilter.Har = this.Har;
			newFilter.Hrg = this.Hrg;
			newFilter.Dgvp = this.Dgvp;
			newFilter.Ver = this.Ver;
			newFilter.Prditxt = this.Prditxt;
			
			return newFilter;
		}
	}
	public final class Hearts_episodeEditFilter
	{			
		public boolean IncludePkey = true;
		public boolean IncludeEpsd = true;
		public boolean IncludeDate = true;
		public boolean IncludeCons = true;
		public boolean IncludeHosp = true;
		public boolean IncludeRect = true;
		public boolean IncludeSex = true;
		public boolean IncludeMart = true;
		public boolean IncludeAddt = true;
		public boolean IncludeAdmt = true;
		public boolean IncludeAdsc = true;
		public boolean IncludeEldt = true;
		public boolean IncludeStat = true;
		public boolean IncludeIntn = true;
		public boolean IncludeEpst = true;
		public boolean IncludeEpen = true;
		public boolean IncludeSpcd = true;
		public boolean IncludePrdi = true;
		public boolean IncludeDsmt = true;
		public boolean IncludeDsds = true;
		public boolean IncludeWard = true;
		public boolean IncludeCodt = true;
		public boolean IncludeClin = true;
		public boolean IncludeCkey = true;
		public boolean IncludeRfcd = true;
		public boolean IncludeRfgp = true;
		public boolean IncludeAdtm = true;
		public boolean IncludeEstm = true;
		public boolean IncludeEetm = true;
		public boolean IncludeWkey = true;
		public boolean IncludeOned = true;
		public boolean IncludePost = true;
		public boolean IncludeHarc = true;
		public boolean IncludeRefr = true;
		public boolean IncludeCars = true;
		public boolean IncludeLofs = true;
		public boolean IncludeHcpname = true;
		public boolean IncludeSpctext = true;
		public boolean IncludeHospnum = true;
		public boolean IncludeMax_no = true;
		public boolean IncludeCodttxt = true;
		public boolean IncludeWardname = true;
		public boolean IncludeAdsctxt = true;
		public boolean IncludeDsdstxt = true;
		public boolean IncludeDsmttxt = true;
		public boolean IncludeRfcdtxt = true;
		public boolean IncludePcg1 = true;
		public boolean IncludeHa1 = true;
		public boolean IncludePcg2 = true;
		public boolean IncludeHa2 = true;
		public boolean IncludeMc = true;
		public boolean IncludeCota = true;
		public boolean IncludeHar = true;
		public boolean IncludeHrg = true;
		public boolean IncludeDgvp = true;
		public boolean IncludeVer = true;
		public boolean IncludePrditxt = true;
		
		public void includeAll()
		{				
			IncludePkey = true;
			IncludeEpsd = true;
			IncludeDate = true;
			IncludeCons = true;
			IncludeHosp = true;
			IncludeRect = true;
			IncludeSex = true;
			IncludeMart = true;
			IncludeAddt = true;
			IncludeAdmt = true;
			IncludeAdsc = true;
			IncludeEldt = true;
			IncludeStat = true;
			IncludeIntn = true;
			IncludeEpst = true;
			IncludeEpen = true;
			IncludeSpcd = true;
			IncludePrdi = true;
			IncludeDsmt = true;
			IncludeDsds = true;
			IncludeWard = true;
			IncludeCodt = true;
			IncludeClin = true;
			IncludeCkey = true;
			IncludeRfcd = true;
			IncludeRfgp = true;
			IncludeAdtm = true;
			IncludeEstm = true;
			IncludeEetm = true;
			IncludeWkey = true;
			IncludeOned = true;
			IncludePost = true;
			IncludeHarc = true;
			IncludeRefr = true;
			IncludeCars = true;
			IncludeLofs = true;
			IncludeHcpname = true;
			IncludeSpctext = true;
			IncludeHospnum = true;
			IncludeMax_no = true;
			IncludeCodttxt = true;
			IncludeWardname = true;
			IncludeAdsctxt = true;
			IncludeDsdstxt = true;
			IncludeDsmttxt = true;
			IncludeRfcdtxt = true;
			IncludePcg1 = true;
			IncludeHa1 = true;
			IncludePcg2 = true;
			IncludeHa2 = true;
			IncludeMc = true;
			IncludeCota = true;
			IncludeHar = true;
			IncludeHrg = true;
			IncludeDgvp = true;
			IncludeVer = true;
			IncludePrditxt = true;
		}	
		public void excludeAll()
		{				
			IncludePkey = false;
			IncludeEpsd = false;
			IncludeDate = false;
			IncludeCons = false;
			IncludeHosp = false;
			IncludeRect = false;
			IncludeSex = false;
			IncludeMart = false;
			IncludeAddt = false;
			IncludeAdmt = false;
			IncludeAdsc = false;
			IncludeEldt = false;
			IncludeStat = false;
			IncludeIntn = false;
			IncludeEpst = false;
			IncludeEpen = false;
			IncludeSpcd = false;
			IncludePrdi = false;
			IncludeDsmt = false;
			IncludeDsds = false;
			IncludeWard = false;
			IncludeCodt = false;
			IncludeClin = false;
			IncludeCkey = false;
			IncludeRfcd = false;
			IncludeRfgp = false;
			IncludeAdtm = false;
			IncludeEstm = false;
			IncludeEetm = false;
			IncludeWkey = false;
			IncludeOned = false;
			IncludePost = false;
			IncludeHarc = false;
			IncludeRefr = false;
			IncludeCars = false;
			IncludeLofs = false;
			IncludeHcpname = false;
			IncludeSpctext = false;
			IncludeHospnum = false;
			IncludeMax_no = false;
			IncludeCodttxt = false;
			IncludeWardname = false;
			IncludeAdsctxt = false;
			IncludeDsdstxt = false;
			IncludeDsmttxt = false;
			IncludeRfcdtxt = false;
			IncludePcg1 = false;
			IncludeHa1 = false;
			IncludePcg2 = false;
			IncludeHa2 = false;
			IncludeMc = false;
			IncludeCota = false;
			IncludeHar = false;
			IncludeHrg = false;
			IncludeDgvp = false;
			IncludeVer = false;
			IncludePrditxt = false;
		}
		public Hearts_episodeEditFilter cloneObject()
		{
			Hearts_episodeEditFilter newEditFilter = new Hearts_episodeEditFilter();
			
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeEpsd = this.IncludeEpsd;
			newEditFilter.IncludeDate = this.IncludeDate;
			newEditFilter.IncludeCons = this.IncludeCons;
			newEditFilter.IncludeHosp = this.IncludeHosp;
			newEditFilter.IncludeRect = this.IncludeRect;
			newEditFilter.IncludeSex = this.IncludeSex;
			newEditFilter.IncludeMart = this.IncludeMart;
			newEditFilter.IncludeAddt = this.IncludeAddt;
			newEditFilter.IncludeAdmt = this.IncludeAdmt;
			newEditFilter.IncludeAdsc = this.IncludeAdsc;
			newEditFilter.IncludeEldt = this.IncludeEldt;
			newEditFilter.IncludeStat = this.IncludeStat;
			newEditFilter.IncludeIntn = this.IncludeIntn;
			newEditFilter.IncludeEpst = this.IncludeEpst;
			newEditFilter.IncludeEpen = this.IncludeEpen;
			newEditFilter.IncludeSpcd = this.IncludeSpcd;
			newEditFilter.IncludePrdi = this.IncludePrdi;
			newEditFilter.IncludeDsmt = this.IncludeDsmt;
			newEditFilter.IncludeDsds = this.IncludeDsds;
			newEditFilter.IncludeWard = this.IncludeWard;
			newEditFilter.IncludeCodt = this.IncludeCodt;
			newEditFilter.IncludeClin = this.IncludeClin;
			newEditFilter.IncludeCkey = this.IncludeCkey;
			newEditFilter.IncludeRfcd = this.IncludeRfcd;
			newEditFilter.IncludeRfgp = this.IncludeRfgp;
			newEditFilter.IncludeAdtm = this.IncludeAdtm;
			newEditFilter.IncludeEstm = this.IncludeEstm;
			newEditFilter.IncludeEetm = this.IncludeEetm;
			newEditFilter.IncludeWkey = this.IncludeWkey;
			newEditFilter.IncludeOned = this.IncludeOned;
			newEditFilter.IncludePost = this.IncludePost;
			newEditFilter.IncludeHarc = this.IncludeHarc;
			newEditFilter.IncludeRefr = this.IncludeRefr;
			newEditFilter.IncludeCars = this.IncludeCars;
			newEditFilter.IncludeLofs = this.IncludeLofs;
			newEditFilter.IncludeHcpname = this.IncludeHcpname;
			newEditFilter.IncludeSpctext = this.IncludeSpctext;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeMax_no = this.IncludeMax_no;
			newEditFilter.IncludeCodttxt = this.IncludeCodttxt;
			newEditFilter.IncludeWardname = this.IncludeWardname;
			newEditFilter.IncludeAdsctxt = this.IncludeAdsctxt;
			newEditFilter.IncludeDsdstxt = this.IncludeDsdstxt;
			newEditFilter.IncludeDsmttxt = this.IncludeDsmttxt;
			newEditFilter.IncludeRfcdtxt = this.IncludeRfcdtxt;
			newEditFilter.IncludePcg1 = this.IncludePcg1;
			newEditFilter.IncludeHa1 = this.IncludeHa1;
			newEditFilter.IncludePcg2 = this.IncludePcg2;
			newEditFilter.IncludeHa2 = this.IncludeHa2;
			newEditFilter.IncludeMc = this.IncludeMc;
			newEditFilter.IncludeCota = this.IncludeCota;
			newEditFilter.IncludeHar = this.IncludeHar;
			newEditFilter.IncludeHrg = this.IncludeHrg;
			newEditFilter.IncludeDgvp = this.IncludeDgvp;
			newEditFilter.IncludeVer = this.IncludeVer;
			newEditFilter.IncludePrditxt = this.IncludePrditxt;
			
			return newEditFilter;
		}
	}
}
