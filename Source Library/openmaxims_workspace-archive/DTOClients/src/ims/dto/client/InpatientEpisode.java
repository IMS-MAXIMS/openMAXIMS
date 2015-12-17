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

public final class InpatientEpisode
{
	private InpatientEpisodeFilter lastGetFilter = null;
	private final String serviceName = "InpatientEpisode";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public InpatientEpisodeFilter Filter = new InpatientEpisodeFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public InpatientEpisodeEditFilter EditFilter = new InpatientEpisodeEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public InpatientEpisodeCollection DataCollection = new InpatientEpisodeCollection();

	/**
	 * Creates a new InpatientEpisode Data Transfer Object.
	 */ 
	public InpatientEpisode(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public InpatientEpisode cloneObject() throws ims.dto.Exception
	{
		InpatientEpisode cloneObject = new InpatientEpisode(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Hcpcode = DataCollection.get(x).Hcpcode;
			cloneObject.DataCollection.get(index).Hcpname = DataCollection.get(x).Hcpname;
			cloneObject.DataCollection.get(index).Rescode = DataCollection.get(x).Rescode;
			cloneObject.DataCollection.get(index).Resname = DataCollection.get(x).Resname;
			cloneObject.DataCollection.get(index).Maxno = DataCollection.get(x).Maxno;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Titl = DataCollection.get(x).Titl;
			cloneObject.DataCollection.get(index).Snm = DataCollection.get(x).Snm;
			cloneObject.DataCollection.get(index).Fnm1 = DataCollection.get(x).Fnm1;
			cloneObject.DataCollection.get(index).Fnm2 = DataCollection.get(x).Fnm2;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Apptdate = DataCollection.get(x).Apptdate;
			cloneObject.DataCollection.get(index).Appttime = DataCollection.get(x).Appttime;
			cloneObject.DataCollection.get(index).Epid = DataCollection.get(x).Epid;
			cloneObject.DataCollection.get(index).Addt = DataCollection.get(x).Addt;
			cloneObject.DataCollection.get(index).Adtm = DataCollection.get(x).Adtm;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Sex = DataCollection.get(x).Sex;
			cloneObject.DataCollection.get(index).Ctype = DataCollection.get(x).Ctype;
			cloneObject.DataCollection.get(index).Type = DataCollection.get(x).Type;
			cloneObject.DataCollection.get(index).Cat = DataCollection.get(x).Cat;
			cloneObject.DataCollection.get(index).Resr = DataCollection.get(x).Resr;
			cloneObject.DataCollection.get(index).Rfdt = DataCollection.get(x).Rfdt;
			cloneObject.DataCollection.get(index).Psta = DataCollection.get(x).Psta;
			cloneObject.DataCollection.get(index).Tran = DataCollection.get(x).Tran;
			cloneObject.DataCollection.get(index).Pltr = DataCollection.get(x).Pltr;
			cloneObject.DataCollection.get(index).Gltr = DataCollection.get(x).Gltr;
			cloneObject.DataCollection.get(index).Hpcd = DataCollection.get(x).Hpcd;
			cloneObject.DataCollection.get(index).Post = DataCollection.get(x).Post;
			cloneObject.DataCollection.get(index).Harc = DataCollection.get(x).Harc;
			cloneObject.DataCollection.get(index).Spcd = DataCollection.get(x).Spcd;
			cloneObject.DataCollection.get(index).Rfgp = DataCollection.get(x).Rfgp;
			cloneObject.DataCollection.get(index).Disdate = DataCollection.get(x).Disdate;
			cloneObject.DataCollection.get(index).Nhsnum = DataCollection.get(x).Nhsnum;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "4";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "InpatientEpisode.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.InpatientEpisode.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.InpatientEpisode.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.InpatientEpisode.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.InpatientEpisode.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.InpatientEpisode.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.InpatientEpisode.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.InpatientEpisode.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.InpatientEpisode.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.InpatientEpisode.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.InpatientEpisode.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.InpatientEpisode.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.InpatientEpisode.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.InpatientEpisode.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.InpatientEpisode.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.InpatientEpisode.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.InpatientEpisode.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.InpatientEpisode.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.InpatientEpisode.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.InpatientEpisode.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.InpatientEpisode.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.InpatientEpisode.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.InpatientEpisode.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.InpatientEpisode.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.InpatientEpisode.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.InpatientEpisode.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.InpatientEpisode.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.InpatientEpisode.List");
							
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
	private String encodeNASFilter(InpatientEpisodeFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Hcpcode != null && filter.Hcpcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpcode;
		}
		
		if(Filter.Hcpname != null && filter.Hcpname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpname;
		}
		
		if(Filter.Rescode != null && filter.Rescode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rescode;
		}
		
		if(Filter.Resname != null && filter.Resname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resname;
		}
		
		if(Filter.Maxno != null && filter.Maxno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAXNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Maxno;
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey;
		}
		
		if(Filter.Titl != null && filter.Titl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Titl;
		}
		
		if(Filter.Snm != null && filter.Snm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Snm;
		}
		
		if(Filter.Fnm1 != null && filter.Fnm1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fnm1;
		}
		
		if(Filter.Fnm2 != null && filter.Fnm2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FNM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fnm2;
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum;
		}
		
		if(Filter.Apptdate != null && filter.Apptdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "APPTDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Apptdate;
		}
		
		if(Filter.Appttime != null && filter.Appttime.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "APPTTIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Appttime;
		}
		
		if(Filter.Epid != null && filter.Epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Epid;
		}
		
		if(Filter.Addt != null && filter.Addt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Addt;
		}
		
		if(Filter.Adtm != null && filter.Adtm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adtm;
		}
		
		if(Filter.Dob != null && filter.Dob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dob;
		}
		
		if(Filter.Sex != null && filter.Sex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sex;
		}
		
		if(Filter.Ctype != null && filter.Ctype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ctype;
		}
		
		if(Filter.Type != null && filter.Type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Type;
		}
		
		if(Filter.Cat != null && filter.Cat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cat;
		}
		
		if(Filter.Resr != null && filter.Resr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resr;
		}
		
		if(Filter.Rfdt != null && filter.Rfdt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RFDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rfdt;
		}
		
		if(Filter.Psta != null && filter.Psta.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PSTA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Psta;
		}
		
		if(Filter.Tran != null && filter.Tran.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TRAN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tran;
		}
		
		if(Filter.Pltr != null && filter.Pltr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PLTR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pltr;
		}
		
		if(Filter.Gltr != null && filter.Gltr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GLTR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gltr;
		}
		
		if(Filter.Hpcd != null && filter.Hpcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hpcd;
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
		
		if(Filter.Spcd != null && filter.Spcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spcd;
		}
		
		if(Filter.Rfgp != null && filter.Rfgp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RFGP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rfgp;
		}
		
		if(Filter.Disdate != null && filter.Disdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DISDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Disdate;
		}
		
		if(Filter.Nhsnum != null && filter.Nhsnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NHSNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsnum;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		InpatientEpisodeRecord data = (InpatientEpisodeRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeHcpcode)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpcode);
		}
		
		if(EditFilter.IncludeHcpname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpname);
		}
		
		if(EditFilter.IncludeRescode)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rescode);
		}
		
		if(EditFilter.IncludeResname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resname);
		}
		
		if(EditFilter.IncludeMaxno)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MAXNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Maxno);
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
		}
		
		if(EditFilter.IncludeTitl)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Titl);
		}
		
		if(EditFilter.IncludeSnm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Snm);
		}
		
		if(EditFilter.IncludeFnm1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "FNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fnm1);
		}
		
		if(EditFilter.IncludeFnm2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "FNM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fnm2);
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum);
		}
		
		if(EditFilter.IncludeApptdate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "APPTDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Apptdate);
		}
		
		if(EditFilter.IncludeAppttime)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "APPTTIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Appttime);
		}
		
		if(EditFilter.IncludeEpid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Epid);
		}
		
		if(EditFilter.IncludeAddt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Addt);
		}
		
		if(EditFilter.IncludeAdtm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adtm);
		}
		
		if(EditFilter.IncludeDob)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dob);
		}
		
		if(EditFilter.IncludeSex)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sex);
		}
		
		if(EditFilter.IncludeCtype)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ctype);
		}
		
		if(EditFilter.IncludeType)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Type);
		}
		
		if(EditFilter.IncludeCat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cat);
		}
		
		if(EditFilter.IncludeResr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resr);
		}
		
		if(EditFilter.IncludeRfdt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RFDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rfdt);
		}
		
		if(EditFilter.IncludePsta)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PSTA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Psta);
		}
		
		if(EditFilter.IncludeTran)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TRAN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tran);
		}
		
		if(EditFilter.IncludePltr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PLTR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pltr);
		}
		
		if(EditFilter.IncludeGltr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "GLTR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gltr);
		}
		
		if(EditFilter.IncludeHpcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hpcd);
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
		
		if(EditFilter.IncludeSpcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spcd);
		}
		
		if(EditFilter.IncludeRfgp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RFGP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rfgp);
		}
		
		if(EditFilter.IncludeDisdate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DISDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Disdate);
		}
		
		if(EditFilter.IncludeNhsnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NHSNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsnum);
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
			InpatientEpisodeRecord record = new InpatientEpisodeRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Hcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPCODE"));
			record.Hcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNAME"));
			record.Rescode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESCODE"));
			record.Resname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESNAME"));
			record.Maxno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXNO"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Fnm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM2"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Apptdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTDATE"));
			record.Appttime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTTIME"));
			record.Epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPID"));
			record.Addt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDT"));
			record.Adtm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADTM"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Ctype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTYPE"));
			record.Type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TYPE"));
			record.Cat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CAT"));
			record.Resr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESR"));
			record.Rfdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFDT"));
			record.Psta = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PSTA"));
			record.Tran = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRAN"));
			record.Pltr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLTR"));
			record.Gltr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GLTR"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
			record.Post = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POST"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
			record.Spcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCD"));
			record.Rfgp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFGP"));
			record.Disdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISDATE"));
			record.Nhsnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNUM"));
									
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
			InpatientEpisodeRecord record = new InpatientEpisodeRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Hcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPCODE"));
			record.Hcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNAME"));
			record.Rescode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESCODE"));
			record.Resname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESNAME"));
			record.Maxno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXNO"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Fnm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM2"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Apptdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTDATE"));
			record.Appttime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTTIME"));
			record.Epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPID"));
			record.Addt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDT"));
			record.Adtm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADTM"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Ctype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTYPE"));
			record.Type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TYPE"));
			record.Cat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CAT"));
			record.Resr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESR"));
			record.Rfdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFDT"));
			record.Psta = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PSTA"));
			record.Tran = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRAN"));
			record.Pltr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLTR"));
			record.Gltr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GLTR"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
			record.Post = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POST"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
			record.Spcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCD"));
			record.Rfgp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFGP"));
			record.Disdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DISDATE"));
			record.Nhsnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNUM"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class InpatientEpisodeCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			InpatientEpisodeRecord newRecord = new InpatientEpisodeRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(InpatientEpisodeRecord record)
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
		public InpatientEpisodeRecord get(int index)
		{
			return (InpatientEpisodeRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class InpatientEpisodeRecord
	{
		public String Hcpcode = "";
		public String Hcpname = "";
		public String Rescode = "";
		public String Resname = "";
		public String Maxno = "";
		public String Pkey = "";
		public String Titl = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Fnm2 = "";
		public String Hospnum = "";
		public String Apptdate = "";
		public String Appttime = "";
		public String Epid = "";
		public String Addt = "";
		public String Adtm = "";
		public String Dob = "";
		public String Sex = "";
		public String Ctype = "";
		public String Type = "";
		public String Cat = "";
		public String Resr = "";
		public String Rfdt = "";
		public String Psta = "";
		public String Tran = "";
		public String Pltr = "";
		public String Gltr = "";
		public String Hpcd = "";
		public String Post = "";
		public String Harc = "";
		public String Spcd = "";
		public String Rfgp = "";
		public String Disdate = "";
		public String Nhsnum = "";
				
		
		public void clear()
		{
			Hcpcode = "";
			Hcpname = "";
			Rescode = "";
			Resname = "";
			Maxno = "";
			Pkey = "";
			Titl = "";
			Snm = "";
			Fnm1 = "";
			Fnm2 = "";
			Hospnum = "";
			Apptdate = "";
			Appttime = "";
			Epid = "";
			Addt = "";
			Adtm = "";
			Dob = "";
			Sex = "";
			Ctype = "";
			Type = "";
			Cat = "";
			Resr = "";
			Rfdt = "";
			Psta = "";
			Tran = "";
			Pltr = "";
			Gltr = "";
			Hpcd = "";
			Post = "";
			Harc = "";
			Spcd = "";
			Rfgp = "";
			Disdate = "";
			Nhsnum = "";
			
		}		
	}
		
		
	public final class InpatientEpisodeFilter
	{			
		public String Hcpcode = "";
		public String Hcpname = "";
		public String Rescode = "";
		public String Resname = "";
		public String Maxno = "";
		public String Pkey = "";
		public String Titl = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Fnm2 = "";
		public String Hospnum = "";
		public String Apptdate = "";
		public String Appttime = "";
		public String Epid = "";
		public String Addt = "";
		public String Adtm = "";
		public String Dob = "";
		public String Sex = "";
		public String Ctype = "";
		public String Type = "";
		public String Cat = "";
		public String Resr = "";
		public String Rfdt = "";
		public String Psta = "";
		public String Tran = "";
		public String Pltr = "";
		public String Gltr = "";
		public String Hpcd = "";
		public String Post = "";
		public String Harc = "";
		public String Spcd = "";
		public String Rfgp = "";
		public String Disdate = "";
		public String Nhsnum = "";
		
		public void clear()
		{				
			Hcpcode = "";
			Hcpname = "";
			Rescode = "";
			Resname = "";
			Maxno = "";
			Pkey = "";
			Titl = "";
			Snm = "";
			Fnm1 = "";
			Fnm2 = "";
			Hospnum = "";
			Apptdate = "";
			Appttime = "";
			Epid = "";
			Addt = "";
			Adtm = "";
			Dob = "";
			Sex = "";
			Ctype = "";
			Type = "";
			Cat = "";
			Resr = "";
			Rfdt = "";
			Psta = "";
			Tran = "";
			Pltr = "";
			Gltr = "";
			Hpcd = "";
			Post = "";
			Harc = "";
			Spcd = "";
			Rfgp = "";
			Disdate = "";
			Nhsnum = "";
		}	
		public InpatientEpisodeFilter cloneObject()
		{
			InpatientEpisodeFilter newFilter = new InpatientEpisodeFilter();
			
			newFilter.Hcpcode = this.Hcpcode;
			newFilter.Hcpname = this.Hcpname;
			newFilter.Rescode = this.Rescode;
			newFilter.Resname = this.Resname;
			newFilter.Maxno = this.Maxno;
			newFilter.Pkey = this.Pkey;
			newFilter.Titl = this.Titl;
			newFilter.Snm = this.Snm;
			newFilter.Fnm1 = this.Fnm1;
			newFilter.Fnm2 = this.Fnm2;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Apptdate = this.Apptdate;
			newFilter.Appttime = this.Appttime;
			newFilter.Epid = this.Epid;
			newFilter.Addt = this.Addt;
			newFilter.Adtm = this.Adtm;
			newFilter.Dob = this.Dob;
			newFilter.Sex = this.Sex;
			newFilter.Ctype = this.Ctype;
			newFilter.Type = this.Type;
			newFilter.Cat = this.Cat;
			newFilter.Resr = this.Resr;
			newFilter.Rfdt = this.Rfdt;
			newFilter.Psta = this.Psta;
			newFilter.Tran = this.Tran;
			newFilter.Pltr = this.Pltr;
			newFilter.Gltr = this.Gltr;
			newFilter.Hpcd = this.Hpcd;
			newFilter.Post = this.Post;
			newFilter.Harc = this.Harc;
			newFilter.Spcd = this.Spcd;
			newFilter.Rfgp = this.Rfgp;
			newFilter.Disdate = this.Disdate;
			newFilter.Nhsnum = this.Nhsnum;
			
			return newFilter;
		}
	}
	public final class InpatientEpisodeEditFilter
	{			
		public boolean IncludeHcpcode = true;
		public boolean IncludeHcpname = true;
		public boolean IncludeRescode = true;
		public boolean IncludeResname = true;
		public boolean IncludeMaxno = true;
		public boolean IncludePkey = true;
		public boolean IncludeTitl = true;
		public boolean IncludeSnm = true;
		public boolean IncludeFnm1 = true;
		public boolean IncludeFnm2 = true;
		public boolean IncludeHospnum = true;
		public boolean IncludeApptdate = true;
		public boolean IncludeAppttime = true;
		public boolean IncludeEpid = true;
		public boolean IncludeAddt = true;
		public boolean IncludeAdtm = true;
		public boolean IncludeDob = true;
		public boolean IncludeSex = true;
		public boolean IncludeCtype = true;
		public boolean IncludeType = true;
		public boolean IncludeCat = true;
		public boolean IncludeResr = true;
		public boolean IncludeRfdt = true;
		public boolean IncludePsta = true;
		public boolean IncludeTran = true;
		public boolean IncludePltr = true;
		public boolean IncludeGltr = true;
		public boolean IncludeHpcd = true;
		public boolean IncludePost = true;
		public boolean IncludeHarc = true;
		public boolean IncludeSpcd = true;
		public boolean IncludeRfgp = true;
		public boolean IncludeDisdate = true;
		public boolean IncludeNhsnum = true;
		
		public void includeAll()
		{				
			IncludeHcpcode = true;
			IncludeHcpname = true;
			IncludeRescode = true;
			IncludeResname = true;
			IncludeMaxno = true;
			IncludePkey = true;
			IncludeTitl = true;
			IncludeSnm = true;
			IncludeFnm1 = true;
			IncludeFnm2 = true;
			IncludeHospnum = true;
			IncludeApptdate = true;
			IncludeAppttime = true;
			IncludeEpid = true;
			IncludeAddt = true;
			IncludeAdtm = true;
			IncludeDob = true;
			IncludeSex = true;
			IncludeCtype = true;
			IncludeType = true;
			IncludeCat = true;
			IncludeResr = true;
			IncludeRfdt = true;
			IncludePsta = true;
			IncludeTran = true;
			IncludePltr = true;
			IncludeGltr = true;
			IncludeHpcd = true;
			IncludePost = true;
			IncludeHarc = true;
			IncludeSpcd = true;
			IncludeRfgp = true;
			IncludeDisdate = true;
			IncludeNhsnum = true;
		}	
		public void excludeAll()
		{				
			IncludeHcpcode = false;
			IncludeHcpname = false;
			IncludeRescode = false;
			IncludeResname = false;
			IncludeMaxno = false;
			IncludePkey = false;
			IncludeTitl = false;
			IncludeSnm = false;
			IncludeFnm1 = false;
			IncludeFnm2 = false;
			IncludeHospnum = false;
			IncludeApptdate = false;
			IncludeAppttime = false;
			IncludeEpid = false;
			IncludeAddt = false;
			IncludeAdtm = false;
			IncludeDob = false;
			IncludeSex = false;
			IncludeCtype = false;
			IncludeType = false;
			IncludeCat = false;
			IncludeResr = false;
			IncludeRfdt = false;
			IncludePsta = false;
			IncludeTran = false;
			IncludePltr = false;
			IncludeGltr = false;
			IncludeHpcd = false;
			IncludePost = false;
			IncludeHarc = false;
			IncludeSpcd = false;
			IncludeRfgp = false;
			IncludeDisdate = false;
			IncludeNhsnum = false;
		}
		public InpatientEpisodeEditFilter cloneObject()
		{
			InpatientEpisodeEditFilter newEditFilter = new InpatientEpisodeEditFilter();
			
			newEditFilter.IncludeHcpcode = this.IncludeHcpcode;
			newEditFilter.IncludeHcpname = this.IncludeHcpname;
			newEditFilter.IncludeRescode = this.IncludeRescode;
			newEditFilter.IncludeResname = this.IncludeResname;
			newEditFilter.IncludeMaxno = this.IncludeMaxno;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeTitl = this.IncludeTitl;
			newEditFilter.IncludeSnm = this.IncludeSnm;
			newEditFilter.IncludeFnm1 = this.IncludeFnm1;
			newEditFilter.IncludeFnm2 = this.IncludeFnm2;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeApptdate = this.IncludeApptdate;
			newEditFilter.IncludeAppttime = this.IncludeAppttime;
			newEditFilter.IncludeEpid = this.IncludeEpid;
			newEditFilter.IncludeAddt = this.IncludeAddt;
			newEditFilter.IncludeAdtm = this.IncludeAdtm;
			newEditFilter.IncludeDob = this.IncludeDob;
			newEditFilter.IncludeSex = this.IncludeSex;
			newEditFilter.IncludeCtype = this.IncludeCtype;
			newEditFilter.IncludeType = this.IncludeType;
			newEditFilter.IncludeCat = this.IncludeCat;
			newEditFilter.IncludeResr = this.IncludeResr;
			newEditFilter.IncludeRfdt = this.IncludeRfdt;
			newEditFilter.IncludePsta = this.IncludePsta;
			newEditFilter.IncludeTran = this.IncludeTran;
			newEditFilter.IncludePltr = this.IncludePltr;
			newEditFilter.IncludeGltr = this.IncludeGltr;
			newEditFilter.IncludeHpcd = this.IncludeHpcd;
			newEditFilter.IncludePost = this.IncludePost;
			newEditFilter.IncludeHarc = this.IncludeHarc;
			newEditFilter.IncludeSpcd = this.IncludeSpcd;
			newEditFilter.IncludeRfgp = this.IncludeRfgp;
			newEditFilter.IncludeDisdate = this.IncludeDisdate;
			newEditFilter.IncludeNhsnum = this.IncludeNhsnum;
			
			return newEditFilter;
		}
	}
}
