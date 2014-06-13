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

public final class Outpat
{
	private OutpatFilter lastGetFilter = null;
	private final String serviceName = "OUTPAT";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public OutpatFilter Filter = new OutpatFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public OutpatEditFilter EditFilter = new OutpatEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public OutpatCollection DataCollection = new OutpatCollection();

	/**
	 * Creates a new Outpat Data Transfer Object.
	 */ 
	public Outpat(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Outpat cloneObject() throws ims.dto.Exception
	{
		Outpat cloneObject = new Outpat(Connection);
			
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
			cloneObject.DataCollection.get(index).Hcpcode = DataCollection.get(x).Hcpcode;
			cloneObject.DataCollection.get(index).Rescode = DataCollection.get(x).Rescode;
			cloneObject.DataCollection.get(index).Apptdate = DataCollection.get(x).Apptdate;
			cloneObject.DataCollection.get(index).Appttime = DataCollection.get(x).Appttime;
			cloneObject.DataCollection.get(index).Type = DataCollection.get(x).Type;
			cloneObject.DataCollection.get(index).Resr = DataCollection.get(x).Resr;
			cloneObject.DataCollection.get(index).Rfdt = DataCollection.get(x).Rfdt;
			cloneObject.DataCollection.get(index).Psta = DataCollection.get(x).Psta;
			cloneObject.DataCollection.get(index).Rfgp = DataCollection.get(x).Rfgp;
			cloneObject.DataCollection.get(index).Post = DataCollection.get(x).Post;
			cloneObject.DataCollection.get(index).Harc = DataCollection.get(x).Harc;
			cloneObject.DataCollection.get(index).Dspc = DataCollection.get(x).Dspc;
			cloneObject.DataCollection.get(index).Reas = DataCollection.get(x).Reas;
			cloneObject.DataCollection.get(index).Rkey = DataCollection.get(x).Rkey;
			cloneObject.DataCollection.get(index).Cat = DataCollection.get(x).Cat;
			cloneObject.DataCollection.get(index).Tran = DataCollection.get(x).Tran;
			cloneObject.DataCollection.get(index).Pltr = DataCollection.get(x).Pltr;
			cloneObject.DataCollection.get(index).Gltr = DataCollection.get(x).Gltr;
			cloneObject.DataCollection.get(index).Titl = DataCollection.get(x).Titl;
			cloneObject.DataCollection.get(index).Snm = DataCollection.get(x).Snm;
			cloneObject.DataCollection.get(index).Fnm1 = DataCollection.get(x).Fnm1;
			cloneObject.DataCollection.get(index).Fnm2 = DataCollection.get(x).Fnm2;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Sex = DataCollection.get(x).Sex;
			cloneObject.DataCollection.get(index).Nhsnum = DataCollection.get(x).Nhsnum;
			cloneObject.DataCollection.get(index).Hcpname = DataCollection.get(x).Hcpname;
			cloneObject.DataCollection.get(index).Resname = DataCollection.get(x).Resname;
			cloneObject.DataCollection.get(index).Resmnem = DataCollection.get(x).Resmnem;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Hpcd = DataCollection.get(x).Hpcd;
			cloneObject.DataCollection.get(index).Maxno = DataCollection.get(x).Maxno;
			cloneObject.DataCollection.get(index).Rd = DataCollection.get(x).Rd;
			cloneObject.DataCollection.get(index).Rdtxt = DataCollection.get(x).Rdtxt;
			cloneObject.DataCollection.get(index).Unid = DataCollection.get(x).Unid;
			cloneObject.DataCollection.get(index).Ddat = DataCollection.get(x).Ddat;
			cloneObject.DataCollection.get(index).Dtim = DataCollection.get(x).Dtim;
			cloneObject.DataCollection.get(index).Outc = DataCollection.get(x).Outc;
			cloneObject.DataCollection.get(index).Firstseen = DataCollection.get(x).Firstseen;
			cloneObject.DataCollection.get(index).Stim = DataCollection.get(x).Stim;
			cloneObject.DataCollection.get(index).Sdat = DataCollection.get(x).Sdat;
			cloneObject.DataCollection.get(index).Gpu = DataCollection.get(x).Gpu;
			cloneObject.DataCollection.get(index).Clss = DataCollection.get(x).Clss;
			cloneObject.DataCollection.get(index).Susp = DataCollection.get(x).Susp;
			cloneObject.DataCollection.get(index).Clsscode = DataCollection.get(x).Clsscode;
			cloneObject.DataCollection.get(index).Mainhcpcode = DataCollection.get(x).Mainhcpcode;
			cloneObject.DataCollection.get(index).Mainhcpname = DataCollection.get(x).Mainhcpname;
			cloneObject.DataCollection.get(index).Exclude_nonatt = DataCollection.get(x).Exclude_nonatt;
			cloneObject.DataCollection.get(index).Clnhpcd = DataCollection.get(x).Clnhpcd;
			cloneObject.DataCollection.get(index).Mainhcpmnem = DataCollection.get(x).Mainhcpmnem;
			cloneObject.DataCollection.get(index).__orderby = DataCollection.get(x).__orderby;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
							
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpat.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Outpat.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpat.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpat.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpat.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Outpat.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Outpat.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpat.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Outpat.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Outpat.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Outpat.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Outpat.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Outpat.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpat.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Outpat.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Outpat.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Outpat.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Outpat.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Outpat.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpat.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Outpat.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Outpat.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpat.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Outpat.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Outpat.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Outpat.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Outpat.List");
							
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
	private String encodeNASFilter(OutpatFilter filter)
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
		
		if(Filter.Hcpcode != null && filter.Hcpcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpcode;
		}
		
		if(Filter.Rescode != null && filter.Rescode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rescode;
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
		
		if(Filter.Type != null && filter.Type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Type;
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
		
		if(Filter.Rfgp != null && filter.Rfgp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RFGP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rfgp;
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
		
		if(Filter.Dspc != null && filter.Dspc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DSPC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dspc;
		}
		
		if(Filter.Reas != null && filter.Reas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reas;
		}
		
		if(Filter.Rkey != null && filter.Rkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rkey;
		}
		
		if(Filter.Cat != null && filter.Cat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cat;
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
		
		if(Filter.Nhsnum != null && filter.Nhsnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NHSNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsnum;
		}
		
		if(Filter.Hcpname != null && filter.Hcpname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpname;
		}
		
		if(Filter.Resname != null && filter.Resname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resname;
		}
		
		if(Filter.Resmnem != null && filter.Resmnem.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESMNEM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resmnem;
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum;
		}
		
		if(Filter.Hpcd != null && filter.Hpcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hpcd;
		}
		
		if(Filter.Maxno != null && filter.Maxno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAXNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Maxno;
		}
		
		if(Filter.Rd != null && filter.Rd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rd;
		}
		
		if(Filter.Rdtxt != null && filter.Rdtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rdtxt;
		}
		
		if(Filter.Unid != null && filter.Unid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Unid;
		}
		
		if(Filter.Ddat != null && filter.Ddat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ddat;
		}
		
		if(Filter.Dtim != null && filter.Dtim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dtim;
		}
		
		if(Filter.Outc != null && filter.Outc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OUTC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Outc;
		}
		
		if(Filter.Firstseen != null && filter.Firstseen.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FIRSTSEEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Firstseen;
		}
		
		if(Filter.Stim != null && filter.Stim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stim;
		}
		
		if(Filter.Sdat != null && filter.Sdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sdat;
		}
		
		if(Filter.Gpu != null && filter.Gpu.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GPU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpu;
		}
		
		if(Filter.Clss != null && filter.Clss.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLSS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clss;
		}
		
		if(Filter.Susp != null && filter.Susp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SUSP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Susp;
		}
		
		if(Filter.Clsscode != null && filter.Clsscode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLSSCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clsscode;
		}
		
		if(Filter.Mainhcpcode != null && filter.Mainhcpcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAINHCPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mainhcpcode;
		}
		
		if(Filter.Mainhcpname != null && filter.Mainhcpname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAINHCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mainhcpname;
		}
		
		if(Filter.Exclude_nonatt != null && filter.Exclude_nonatt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EXCLUDE_NONATT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Exclude_nonatt;
		}
		
		if(Filter.Clnhpcd != null && filter.Clnhpcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLNHPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clnhpcd;
		}
		
		if(Filter.Mainhcpmnem != null && filter.Mainhcpmnem.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAINHCPMNEM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mainhcpmnem;
		}
		
		if(Filter.__orderby != null && filter.__orderby.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "__ORDERBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.__orderby;
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		OutpatRecord data = (OutpatRecord)DataCollection.get(0);
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
		}
		
		if(EditFilter.IncludeHcpcode)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpcode);
		}
		
		if(EditFilter.IncludeRescode)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rescode);
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
		
		if(EditFilter.IncludeType)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Type);
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
		
		if(EditFilter.IncludeRfgp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RFGP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rfgp);
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
		
		if(EditFilter.IncludeDspc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DSPC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dspc);
		}
		
		if(EditFilter.IncludeReas)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reas);
		}
		
		if(EditFilter.IncludeRkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rkey);
		}
		
		if(EditFilter.IncludeCat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cat);
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
		
		if(EditFilter.IncludeNhsnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NHSNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsnum);
		}
		
		if(EditFilter.IncludeHcpname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpname);
		}
		
		if(EditFilter.IncludeResname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resname);
		}
		
		if(EditFilter.IncludeResmnem)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESMNEM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resmnem);
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum);
		}
		
		if(EditFilter.IncludeHpcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hpcd);
		}
		
		if(EditFilter.IncludeMaxno)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MAXNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Maxno);
		}
		
		if(EditFilter.IncludeRd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rd);
		}
		
		if(EditFilter.IncludeRdtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rdtxt);
		}
		
		if(EditFilter.IncludeUnid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unid);
		}
		
		if(EditFilter.IncludeDdat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ddat);
		}
		
		if(EditFilter.IncludeDtim)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dtim);
		}
		
		if(EditFilter.IncludeOutc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OUTC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Outc);
		}
		
		if(EditFilter.IncludeFirstseen)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "FIRSTSEEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Firstseen);
		}
		
		if(EditFilter.IncludeStim)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stim);
		}
		
		if(EditFilter.IncludeSdat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sdat);
		}
		
		if(EditFilter.IncludeGpu)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "GPU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpu);
		}
		
		if(EditFilter.IncludeClss)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLSS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clss);
		}
		
		if(EditFilter.IncludeSusp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SUSP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Susp);
		}
		
		if(EditFilter.IncludeClsscode)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLSSCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clsscode);
		}
		
		if(EditFilter.IncludeMainhcpcode)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MAINHCPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mainhcpcode);
		}
		
		if(EditFilter.IncludeMainhcpname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MAINHCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mainhcpname);
		}
		
		if(EditFilter.IncludeExclude_nonatt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EXCLUDE_NONATT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Exclude_nonatt);
		}
		
		if(EditFilter.IncludeClnhpcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLNHPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clnhpcd);
		}
		
		if(EditFilter.IncludeMainhcpmnem)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MAINHCPMNEM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mainhcpmnem);
		}
		
		if(EditFilter.Include__orderby)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "__ORDERBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.__orderby);
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat);
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
			OutpatRecord record = new OutpatRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Hcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPCODE"));
			record.Rescode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESCODE"));
			record.Apptdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTDATE"));
			record.Appttime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTTIME"));
			record.Type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TYPE"));
			record.Resr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESR"));
			record.Rfdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFDT"));
			record.Psta = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PSTA"));
			record.Rfgp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFGP"));
			record.Post = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POST"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
			record.Dspc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSPC"));
			record.Reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REAS"));
			record.Rkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RKEY"));
			record.Cat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CAT"));
			record.Tran = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRAN"));
			record.Pltr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLTR"));
			record.Gltr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GLTR"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Fnm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM2"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Nhsnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNUM"));
			record.Hcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNAME"));
			record.Resname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESNAME"));
			record.Resmnem = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESMNEM"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
			record.Maxno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXNO"));
			record.Rd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RD"));
			record.Rdtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDTXT"));
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Ddat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DDAT"));
			record.Dtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTIM"));
			record.Outc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUTC"));
			record.Firstseen = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRSTSEEN"));
			record.Stim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STIM"));
			record.Sdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SDAT"));
			record.Gpu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPU"));
			record.Clss = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLSS"));
			record.Susp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SUSP"));
			record.Clsscode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLSSCODE"));
			record.Mainhcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAINHCPCODE"));
			record.Mainhcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAINHCPNAME"));
			record.Exclude_nonatt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXCLUDE_NONATT"));
			record.Clnhpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLNHPCD"));
			record.Mainhcpmnem = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAINHCPMNEM"));
			record.__orderby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "__ORDERBY"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
									
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
			OutpatRecord record = new OutpatRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Hcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPCODE"));
			record.Rescode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESCODE"));
			record.Apptdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTDATE"));
			record.Appttime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "APPTTIME"));
			record.Type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TYPE"));
			record.Resr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESR"));
			record.Rfdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFDT"));
			record.Psta = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PSTA"));
			record.Rfgp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFGP"));
			record.Post = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POST"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
			record.Dspc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSPC"));
			record.Reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REAS"));
			record.Rkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RKEY"));
			record.Cat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CAT"));
			record.Tran = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRAN"));
			record.Pltr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLTR"));
			record.Gltr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GLTR"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Fnm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM2"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Nhsnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNUM"));
			record.Hcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNAME"));
			record.Resname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESNAME"));
			record.Resmnem = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESMNEM"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
			record.Maxno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXNO"));
			record.Rd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RD"));
			record.Rdtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDTXT"));
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Ddat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DDAT"));
			record.Dtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTIM"));
			record.Outc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUTC"));
			record.Firstseen = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FIRSTSEEN"));
			record.Stim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STIM"));
			record.Sdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SDAT"));
			record.Gpu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPU"));
			record.Clss = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLSS"));
			record.Susp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SUSP"));
			record.Clsscode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLSSCODE"));
			record.Mainhcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAINHCPCODE"));
			record.Mainhcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAINHCPNAME"));
			record.Exclude_nonatt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXCLUDE_NONATT"));
			record.Clnhpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLNHPCD"));
			record.Mainhcpmnem = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAINHCPMNEM"));
			record.__orderby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "__ORDERBY"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class OutpatCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			OutpatRecord newRecord = new OutpatRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(OutpatRecord record)
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
		public OutpatRecord get(int index)
		{
			return (OutpatRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class OutpatRecord
	{
		public String Pkey = "";
		public String Hcpcode = "";
		public String Rescode = "";
		public String Apptdate = "";
		public String Appttime = "";
		public String Type = "";
		public String Resr = "";
		public String Rfdt = "";
		public String Psta = "";
		public String Rfgp = "";
		public String Post = "";
		public String Harc = "";
		public String Dspc = "";
		public String Reas = "";
		public String Rkey = "";
		public String Cat = "";
		public String Tran = "";
		public String Pltr = "";
		public String Gltr = "";
		public String Titl = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Fnm2 = "";
		public String Dob = "";
		public String Sex = "";
		public String Nhsnum = "";
		public String Hcpname = "";
		public String Resname = "";
		public String Resmnem = "";
		public String Hospnum = "";
		public String Hpcd = "";
		public String Maxno = "";
		public String Rd = "";
		public String Rdtxt = "";
		public String Unid = "";
		public String Ddat = "";
		public String Dtim = "";
		public String Outc = "";
		public String Firstseen = "";
		public String Stim = "";
		public String Sdat = "";
		public String Gpu = "";
		public String Clss = "";
		public String Susp = "";
		public String Clsscode = "";
		public String Mainhcpcode = "";
		public String Mainhcpname = "";
		public String Exclude_nonatt = "";
		public String Clnhpcd = "";
		public String Mainhcpmnem = "";
		public String __orderby = "";
		public String Stat = "";
				
		
		public void clear()
		{
			Pkey = "";
			Hcpcode = "";
			Rescode = "";
			Apptdate = "";
			Appttime = "";
			Type = "";
			Resr = "";
			Rfdt = "";
			Psta = "";
			Rfgp = "";
			Post = "";
			Harc = "";
			Dspc = "";
			Reas = "";
			Rkey = "";
			Cat = "";
			Tran = "";
			Pltr = "";
			Gltr = "";
			Titl = "";
			Snm = "";
			Fnm1 = "";
			Fnm2 = "";
			Dob = "";
			Sex = "";
			Nhsnum = "";
			Hcpname = "";
			Resname = "";
			Resmnem = "";
			Hospnum = "";
			Hpcd = "";
			Maxno = "";
			Rd = "";
			Rdtxt = "";
			Unid = "";
			Ddat = "";
			Dtim = "";
			Outc = "";
			Firstseen = "";
			Stim = "";
			Sdat = "";
			Gpu = "";
			Clss = "";
			Susp = "";
			Clsscode = "";
			Mainhcpcode = "";
			Mainhcpname = "";
			Exclude_nonatt = "";
			Clnhpcd = "";
			Mainhcpmnem = "";
			__orderby = "";
			Stat = "";
			
		}		
	}
		
		
	public final class OutpatFilter
	{			
		public String Pkey = "";
		public String Hcpcode = "";
		public String Rescode = "";
		public String Apptdate = "";
		public String Appttime = "";
		public String Type = "";
		public String Resr = "";
		public String Rfdt = "";
		public String Psta = "";
		public String Rfgp = "";
		public String Post = "";
		public String Harc = "";
		public String Dspc = "";
		public String Reas = "";
		public String Rkey = "";
		public String Cat = "";
		public String Tran = "";
		public String Pltr = "";
		public String Gltr = "";
		public String Titl = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Fnm2 = "";
		public String Dob = "";
		public String Sex = "";
		public String Nhsnum = "";
		public String Hcpname = "";
		public String Resname = "";
		public String Resmnem = "";
		public String Hospnum = "";
		public String Hpcd = "";
		public String Maxno = "";
		public String Rd = "";
		public String Rdtxt = "";
		public String Unid = "";
		public String Ddat = "";
		public String Dtim = "";
		public String Outc = "";
		public String Firstseen = "";
		public String Stim = "";
		public String Sdat = "";
		public String Gpu = "";
		public String Clss = "";
		public String Susp = "";
		public String Clsscode = "";
		public String Mainhcpcode = "";
		public String Mainhcpname = "";
		public String Exclude_nonatt = "";
		public String Clnhpcd = "";
		public String Mainhcpmnem = "";
		public String __orderby = "";
		public String Stat = "";
		
		public void clear()
		{				
			Pkey = "";
			Hcpcode = "";
			Rescode = "";
			Apptdate = "";
			Appttime = "";
			Type = "";
			Resr = "";
			Rfdt = "";
			Psta = "";
			Rfgp = "";
			Post = "";
			Harc = "";
			Dspc = "";
			Reas = "";
			Rkey = "";
			Cat = "";
			Tran = "";
			Pltr = "";
			Gltr = "";
			Titl = "";
			Snm = "";
			Fnm1 = "";
			Fnm2 = "";
			Dob = "";
			Sex = "";
			Nhsnum = "";
			Hcpname = "";
			Resname = "";
			Resmnem = "";
			Hospnum = "";
			Hpcd = "";
			Maxno = "";
			Rd = "";
			Rdtxt = "";
			Unid = "";
			Ddat = "";
			Dtim = "";
			Outc = "";
			Firstseen = "";
			Stim = "";
			Sdat = "";
			Gpu = "";
			Clss = "";
			Susp = "";
			Clsscode = "";
			Mainhcpcode = "";
			Mainhcpname = "";
			Exclude_nonatt = "";
			Clnhpcd = "";
			Mainhcpmnem = "";
			__orderby = "";
			Stat = "";
		}	
		public OutpatFilter cloneObject()
		{
			OutpatFilter newFilter = new OutpatFilter();
			
			newFilter.Pkey = this.Pkey;
			newFilter.Hcpcode = this.Hcpcode;
			newFilter.Rescode = this.Rescode;
			newFilter.Apptdate = this.Apptdate;
			newFilter.Appttime = this.Appttime;
			newFilter.Type = this.Type;
			newFilter.Resr = this.Resr;
			newFilter.Rfdt = this.Rfdt;
			newFilter.Psta = this.Psta;
			newFilter.Rfgp = this.Rfgp;
			newFilter.Post = this.Post;
			newFilter.Harc = this.Harc;
			newFilter.Dspc = this.Dspc;
			newFilter.Reas = this.Reas;
			newFilter.Rkey = this.Rkey;
			newFilter.Cat = this.Cat;
			newFilter.Tran = this.Tran;
			newFilter.Pltr = this.Pltr;
			newFilter.Gltr = this.Gltr;
			newFilter.Titl = this.Titl;
			newFilter.Snm = this.Snm;
			newFilter.Fnm1 = this.Fnm1;
			newFilter.Fnm2 = this.Fnm2;
			newFilter.Dob = this.Dob;
			newFilter.Sex = this.Sex;
			newFilter.Nhsnum = this.Nhsnum;
			newFilter.Hcpname = this.Hcpname;
			newFilter.Resname = this.Resname;
			newFilter.Resmnem = this.Resmnem;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Hpcd = this.Hpcd;
			newFilter.Maxno = this.Maxno;
			newFilter.Rd = this.Rd;
			newFilter.Rdtxt = this.Rdtxt;
			newFilter.Unid = this.Unid;
			newFilter.Ddat = this.Ddat;
			newFilter.Dtim = this.Dtim;
			newFilter.Outc = this.Outc;
			newFilter.Firstseen = this.Firstseen;
			newFilter.Stim = this.Stim;
			newFilter.Sdat = this.Sdat;
			newFilter.Gpu = this.Gpu;
			newFilter.Clss = this.Clss;
			newFilter.Susp = this.Susp;
			newFilter.Clsscode = this.Clsscode;
			newFilter.Mainhcpcode = this.Mainhcpcode;
			newFilter.Mainhcpname = this.Mainhcpname;
			newFilter.Exclude_nonatt = this.Exclude_nonatt;
			newFilter.Clnhpcd = this.Clnhpcd;
			newFilter.Mainhcpmnem = this.Mainhcpmnem;
			newFilter.__orderby = this.__orderby;
			newFilter.Stat = this.Stat;
			
			return newFilter;
		}
	}
	public final class OutpatEditFilter
	{			
		public boolean IncludePkey = true;
		public boolean IncludeHcpcode = true;
		public boolean IncludeRescode = true;
		public boolean IncludeApptdate = true;
		public boolean IncludeAppttime = true;
		public boolean IncludeType = true;
		public boolean IncludeResr = true;
		public boolean IncludeRfdt = true;
		public boolean IncludePsta = true;
		public boolean IncludeRfgp = true;
		public boolean IncludePost = true;
		public boolean IncludeHarc = true;
		public boolean IncludeDspc = true;
		public boolean IncludeReas = true;
		public boolean IncludeRkey = true;
		public boolean IncludeCat = true;
		public boolean IncludeTran = true;
		public boolean IncludePltr = true;
		public boolean IncludeGltr = true;
		public boolean IncludeTitl = true;
		public boolean IncludeSnm = true;
		public boolean IncludeFnm1 = true;
		public boolean IncludeFnm2 = true;
		public boolean IncludeDob = true;
		public boolean IncludeSex = true;
		public boolean IncludeNhsnum = true;
		public boolean IncludeHcpname = true;
		public boolean IncludeResname = true;
		public boolean IncludeResmnem = true;
		public boolean IncludeHospnum = true;
		public boolean IncludeHpcd = true;
		public boolean IncludeMaxno = true;
		public boolean IncludeRd = true;
		public boolean IncludeRdtxt = true;
		public boolean IncludeUnid = true;
		public boolean IncludeDdat = true;
		public boolean IncludeDtim = true;
		public boolean IncludeOutc = true;
		public boolean IncludeFirstseen = true;
		public boolean IncludeStim = true;
		public boolean IncludeSdat = true;
		public boolean IncludeGpu = true;
		public boolean IncludeClss = true;
		public boolean IncludeSusp = true;
		public boolean IncludeClsscode = true;
		public boolean IncludeMainhcpcode = true;
		public boolean IncludeMainhcpname = true;
		public boolean IncludeExclude_nonatt = true;
		public boolean IncludeClnhpcd = true;
		public boolean IncludeMainhcpmnem = true;
		public boolean Include__orderby = true;
		public boolean IncludeStat = true;
		
		public void includeAll()
		{				
			IncludePkey = true;
			IncludeHcpcode = true;
			IncludeRescode = true;
			IncludeApptdate = true;
			IncludeAppttime = true;
			IncludeType = true;
			IncludeResr = true;
			IncludeRfdt = true;
			IncludePsta = true;
			IncludeRfgp = true;
			IncludePost = true;
			IncludeHarc = true;
			IncludeDspc = true;
			IncludeReas = true;
			IncludeRkey = true;
			IncludeCat = true;
			IncludeTran = true;
			IncludePltr = true;
			IncludeGltr = true;
			IncludeTitl = true;
			IncludeSnm = true;
			IncludeFnm1 = true;
			IncludeFnm2 = true;
			IncludeDob = true;
			IncludeSex = true;
			IncludeNhsnum = true;
			IncludeHcpname = true;
			IncludeResname = true;
			IncludeResmnem = true;
			IncludeHospnum = true;
			IncludeHpcd = true;
			IncludeMaxno = true;
			IncludeRd = true;
			IncludeRdtxt = true;
			IncludeUnid = true;
			IncludeDdat = true;
			IncludeDtim = true;
			IncludeOutc = true;
			IncludeFirstseen = true;
			IncludeStim = true;
			IncludeSdat = true;
			IncludeGpu = true;
			IncludeClss = true;
			IncludeSusp = true;
			IncludeClsscode = true;
			IncludeMainhcpcode = true;
			IncludeMainhcpname = true;
			IncludeExclude_nonatt = true;
			IncludeClnhpcd = true;
			IncludeMainhcpmnem = true;
			Include__orderby = true;
			IncludeStat = true;
		}	
		public void excludeAll()
		{				
			IncludePkey = false;
			IncludeHcpcode = false;
			IncludeRescode = false;
			IncludeApptdate = false;
			IncludeAppttime = false;
			IncludeType = false;
			IncludeResr = false;
			IncludeRfdt = false;
			IncludePsta = false;
			IncludeRfgp = false;
			IncludePost = false;
			IncludeHarc = false;
			IncludeDspc = false;
			IncludeReas = false;
			IncludeRkey = false;
			IncludeCat = false;
			IncludeTran = false;
			IncludePltr = false;
			IncludeGltr = false;
			IncludeTitl = false;
			IncludeSnm = false;
			IncludeFnm1 = false;
			IncludeFnm2 = false;
			IncludeDob = false;
			IncludeSex = false;
			IncludeNhsnum = false;
			IncludeHcpname = false;
			IncludeResname = false;
			IncludeResmnem = false;
			IncludeHospnum = false;
			IncludeHpcd = false;
			IncludeMaxno = false;
			IncludeRd = false;
			IncludeRdtxt = false;
			IncludeUnid = false;
			IncludeDdat = false;
			IncludeDtim = false;
			IncludeOutc = false;
			IncludeFirstseen = false;
			IncludeStim = false;
			IncludeSdat = false;
			IncludeGpu = false;
			IncludeClss = false;
			IncludeSusp = false;
			IncludeClsscode = false;
			IncludeMainhcpcode = false;
			IncludeMainhcpname = false;
			IncludeExclude_nonatt = false;
			IncludeClnhpcd = false;
			IncludeMainhcpmnem = false;
			Include__orderby = false;
			IncludeStat = false;
		}
		public OutpatEditFilter cloneObject()
		{
			OutpatEditFilter newEditFilter = new OutpatEditFilter();
			
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeHcpcode = this.IncludeHcpcode;
			newEditFilter.IncludeRescode = this.IncludeRescode;
			newEditFilter.IncludeApptdate = this.IncludeApptdate;
			newEditFilter.IncludeAppttime = this.IncludeAppttime;
			newEditFilter.IncludeType = this.IncludeType;
			newEditFilter.IncludeResr = this.IncludeResr;
			newEditFilter.IncludeRfdt = this.IncludeRfdt;
			newEditFilter.IncludePsta = this.IncludePsta;
			newEditFilter.IncludeRfgp = this.IncludeRfgp;
			newEditFilter.IncludePost = this.IncludePost;
			newEditFilter.IncludeHarc = this.IncludeHarc;
			newEditFilter.IncludeDspc = this.IncludeDspc;
			newEditFilter.IncludeReas = this.IncludeReas;
			newEditFilter.IncludeRkey = this.IncludeRkey;
			newEditFilter.IncludeCat = this.IncludeCat;
			newEditFilter.IncludeTran = this.IncludeTran;
			newEditFilter.IncludePltr = this.IncludePltr;
			newEditFilter.IncludeGltr = this.IncludeGltr;
			newEditFilter.IncludeTitl = this.IncludeTitl;
			newEditFilter.IncludeSnm = this.IncludeSnm;
			newEditFilter.IncludeFnm1 = this.IncludeFnm1;
			newEditFilter.IncludeFnm2 = this.IncludeFnm2;
			newEditFilter.IncludeDob = this.IncludeDob;
			newEditFilter.IncludeSex = this.IncludeSex;
			newEditFilter.IncludeNhsnum = this.IncludeNhsnum;
			newEditFilter.IncludeHcpname = this.IncludeHcpname;
			newEditFilter.IncludeResname = this.IncludeResname;
			newEditFilter.IncludeResmnem = this.IncludeResmnem;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeHpcd = this.IncludeHpcd;
			newEditFilter.IncludeMaxno = this.IncludeMaxno;
			newEditFilter.IncludeRd = this.IncludeRd;
			newEditFilter.IncludeRdtxt = this.IncludeRdtxt;
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludeDdat = this.IncludeDdat;
			newEditFilter.IncludeDtim = this.IncludeDtim;
			newEditFilter.IncludeOutc = this.IncludeOutc;
			newEditFilter.IncludeFirstseen = this.IncludeFirstseen;
			newEditFilter.IncludeStim = this.IncludeStim;
			newEditFilter.IncludeSdat = this.IncludeSdat;
			newEditFilter.IncludeGpu = this.IncludeGpu;
			newEditFilter.IncludeClss = this.IncludeClss;
			newEditFilter.IncludeSusp = this.IncludeSusp;
			newEditFilter.IncludeClsscode = this.IncludeClsscode;
			newEditFilter.IncludeMainhcpcode = this.IncludeMainhcpcode;
			newEditFilter.IncludeMainhcpname = this.IncludeMainhcpname;
			newEditFilter.IncludeExclude_nonatt = this.IncludeExclude_nonatt;
			newEditFilter.IncludeClnhpcd = this.IncludeClnhpcd;
			newEditFilter.IncludeMainhcpmnem = this.IncludeMainhcpmnem;
			newEditFilter.Include__orderby = this.Include__orderby;
			newEditFilter.IncludeStat = this.IncludeStat;
			
			return newEditFilter;
		}
	}
}
