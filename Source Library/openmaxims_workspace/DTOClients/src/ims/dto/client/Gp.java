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
// Template ver. 1.0.2 - Last modified on 08/03/2004 10:42 by Marius Mihalec

package ims.dto.client;

public final class Gp
{
	private GpFilter lastGetFilter = null;
	private final String serviceName = "GP";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public GpFilter Filter = new GpFilter();			
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public GpCollection DataCollection = new GpCollection();

	/**
	 * Creates a new Gp Data Transfer Object.
	 */ 
	public Gp(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Gp cloneObject() throws ims.dto.Exception
	{
		Gp cloneObject = new Gp(Connection);
			
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
			cloneObject.DataCollection.get(index).Srcc = DataCollection.get(x).Srcc;
			cloneObject.DataCollection.get(index).Sname = DataCollection.get(x).Sname;
			cloneObject.DataCollection.get(index).Searchname = DataCollection.get(x).Searchname;
			cloneObject.DataCollection.get(index).Fname = DataCollection.get(x).Fname;
			cloneObject.DataCollection.get(index).Title = DataCollection.get(x).Title;
			cloneObject.DataCollection.get(index).Titleftxt = DataCollection.get(x).Titleftxt;
			cloneObject.DataCollection.get(index).Fullname = DataCollection.get(x).Fullname;
			cloneObject.DataCollection.get(index).Practice = DataCollection.get(x).Practice;
			cloneObject.DataCollection.get(index).Searchpractice = DataCollection.get(x).Searchpractice;
			cloneObject.DataCollection.get(index).Adr1 = DataCollection.get(x).Adr1;
			cloneObject.DataCollection.get(index).Adr2 = DataCollection.get(x).Adr2;
			cloneObject.DataCollection.get(index).Adr3 = DataCollection.get(x).Adr3;
			cloneObject.DataCollection.get(index).Adr4 = DataCollection.get(x).Adr4;
			cloneObject.DataCollection.get(index).Adr5 = DataCollection.get(x).Adr5;
			cloneObject.DataCollection.get(index).Pcod = DataCollection.get(x).Pcod;
			cloneObject.DataCollection.get(index).Gplocn = DataCollection.get(x).Gplocn;
			cloneObject.DataCollection.get(index).Tel = DataCollection.get(x).Tel;
			cloneObject.DataCollection.get(index).Mobile = DataCollection.get(x).Mobile;
			cloneObject.DataCollection.get(index).Surgphone = DataCollection.get(x).Surgphone;
			cloneObject.DataCollection.get(index).Fax = DataCollection.get(x).Fax;
			cloneObject.DataCollection.get(index).Email = DataCollection.get(x).Email;
			cloneObject.DataCollection.get(index).Tpp = DataCollection.get(x).Tpp;
			cloneObject.DataCollection.get(index).Gmpcode = DataCollection.get(x).Gmpcode;
			cloneObject.DataCollection.get(index).Gmscode = DataCollection.get(x).Gmscode;
			cloneObject.DataCollection.get(index).Gppractice = DataCollection.get(x).Gppractice;
			cloneObject.DataCollection.get(index).Pcgcode = DataCollection.get(x).Pcgcode;
			cloneObject.DataCollection.get(index).Fromdate = DataCollection.get(x).Fromdate;
			cloneObject.DataCollection.get(index).Todate = DataCollection.get(x).Todate;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Titlet = DataCollection.get(x).Titlet;
			cloneObject.DataCollection.get(index).Harc = DataCollection.get(x).Harc;
			cloneObject.DataCollection.get(index).Roc = DataCollection.get(x).Roc;
							
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Gp.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Gp.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Gp.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Gp.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Gp.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Gp.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Gp.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Gp.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Gp.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Gp.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Gp.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Gp.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Gp.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Gp.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Gp.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Gp.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Gp.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Gp.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Gp.List");
							
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
	private String encodeNASFilter(GpFilter filter)
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
		
		if(Filter.Srcc != null && filter.Srcc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SRCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Srcc;
		}
		
		if(Filter.Sname != null && filter.Sname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sname;
		}
		
		if(Filter.Searchname != null && filter.Searchname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SEARCHNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Searchname;
		}
		
		if(Filter.Fname != null && filter.Fname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fname;
		}
		
		if(Filter.Title != null && filter.Title.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TITLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Title;
		}
		
		if(Filter.Titleftxt != null && filter.Titleftxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TITLEFTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Titleftxt;
		}
		
		if(Filter.Fullname != null && filter.Fullname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FULLNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fullname;
		}
		
		if(Filter.Practice != null && filter.Practice.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PRACTICE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Practice;
		}
		
		if(Filter.Searchpractice != null && filter.Searchpractice.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SEARCHPRACTICE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Searchpractice;
		}
		
		if(Filter.Adr1 != null && filter.Adr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr1;
		}
		
		if(Filter.Adr2 != null && filter.Adr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr2;
		}
		
		if(Filter.Adr3 != null && filter.Adr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr3;
		}
		
		if(Filter.Adr4 != null && filter.Adr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr4;
		}
		
		if(Filter.Adr5 != null && filter.Adr5.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr5;
		}
		
		if(Filter.Pcod != null && filter.Pcod.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PCOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pcod;
		}
		
		if(Filter.Gplocn != null && filter.Gplocn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GPLOCN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gplocn;
		}
		
		if(Filter.Tel != null && filter.Tel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tel;
		}
		
		if(Filter.Mobile != null && filter.Mobile.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MOBILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mobile;
		}
		
		if(Filter.Surgphone != null && filter.Surgphone.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SURGPHONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Surgphone;
		}
		
		if(Filter.Fax != null && filter.Fax.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FAX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fax;
		}
		
		if(Filter.Email != null && filter.Email.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EMAIL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Email;
		}
		
		if(Filter.Tpp != null && filter.Tpp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TPP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tpp;
		}
		
		if(Filter.Gmpcode != null && filter.Gmpcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GMPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gmpcode;
		}
		
		if(Filter.Gmscode != null && filter.Gmscode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GMSCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gmscode;
		}
		
		if(Filter.Gppractice != null && filter.Gppractice.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GPPRACTICE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gppractice;
		}
		
		if(Filter.Pcgcode != null && filter.Pcgcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PCGCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pcgcode;
		}
		
		if(Filter.Fromdate != null && filter.Fromdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FROMDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fromdate;
		}
		
		if(Filter.Todate != null && filter.Todate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TODATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Todate;
		}
		
		if(Filter.Active != null && filter.Active.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Active;
		}
		
		if(Filter.Titlet != null && filter.Titlet.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TITLET" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Titlet;
		}
		
		if(Filter.Harc != null && filter.Harc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HARC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Harc;
		}
		
		if(Filter.Roc != null && filter.Roc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ROC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Roc;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		GpRecord data = (GpRecord)DataCollection.get(0);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RSNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rsno);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SRCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Srcc);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sname);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SEARCHNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Searchname);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "FNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fname);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TITLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Title);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TITLEFTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Titleftxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "FULLNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fullname);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PRACTICE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Practice);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SEARCHPRACTICE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Searchpractice);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr1);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr2);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr3);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr4);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr5);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PCOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pcod);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "GPLOCN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gplocn);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tel);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "MOBILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mobile);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SURGPHONE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Surgphone);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "FAX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fax);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "EMAIL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Email);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TPP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tpp);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "GMPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gmpcode);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "GMSCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gmscode);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "GPPRACTICE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gppractice);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PCGCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pcgcode);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "FROMDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fromdate);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TODATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Todate);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Active);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "TITLET" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Titlet);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "HARC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Harc);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ROC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Roc);
		
		
			
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
			GpRecord record = new GpRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSNO"));
			record.Srcc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRCC"));
			record.Sname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNAME"));
			record.Searchname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEARCHNAME"));
			record.Fname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNAME"));
			record.Title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLE"));
			record.Titleftxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLEFTXT"));
			record.Fullname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FULLNAME"));
			record.Practice = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRACTICE"));
			record.Searchpractice = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEARCHPRACTICE"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Adr5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR5"));
			record.Pcod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCOD"));
			record.Gplocn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPLOCN"));
			record.Tel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEL"));
			record.Mobile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOBILE"));
			record.Surgphone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SURGPHONE"));
			record.Fax = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FAX"));
			record.Email = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMAIL"));
			record.Tpp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TPP"));
			record.Gmpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GMPCODE"));
			record.Gmscode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GMSCODE"));
			record.Gppractice = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPPRACTICE"));
			record.Pcgcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCGCODE"));
			record.Fromdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FROMDATE"));
			record.Todate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TODATE"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Titlet = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLET"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
			record.Roc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ROC"));
									
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
			GpRecord record = new GpRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Rsno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSNO"));
			record.Srcc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRCC"));
			record.Sname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNAME"));
			record.Searchname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEARCHNAME"));
			record.Fname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNAME"));
			record.Title = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLE"));
			record.Titleftxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLEFTXT"));
			record.Fullname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FULLNAME"));
			record.Practice = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRACTICE"));
			record.Searchpractice = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEARCHPRACTICE"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Adr5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR5"));
			record.Pcod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCOD"));
			record.Gplocn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPLOCN"));
			record.Tel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TEL"));
			record.Mobile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOBILE"));
			record.Surgphone = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SURGPHONE"));
			record.Fax = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FAX"));
			record.Email = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EMAIL"));
			record.Tpp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TPP"));
			record.Gmpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GMPCODE"));
			record.Gmscode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GMSCODE"));
			record.Gppractice = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPPRACTICE"));
			record.Pcgcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCGCODE"));
			record.Fromdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FROMDATE"));
			record.Todate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TODATE"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Titlet = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLET"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
			record.Roc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ROC"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class GpCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			GpRecord newRecord = new GpRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(GpRecord record)
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
		public GpRecord get(int index)
		{
			return (GpRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class GpRecord
	{
		public String Rsno = "";
		public String Srcc = "";
		public String Sname = "";
		public String Searchname = "";
		public String Fname = "";
		public String Title = "";
		public String Titleftxt = "";
		public String Fullname = "";
		public String Practice = "";
		public String Searchpractice = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Adr5 = "";
		public String Pcod = "";
		public String Gplocn = "";
		public String Tel = "";
		public String Mobile = "";
		public String Surgphone = "";
		public String Fax = "";
		public String Email = "";
		public String Tpp = "";
		public String Gmpcode = "";
		public String Gmscode = "";
		public String Gppractice = "";
		public String Pcgcode = "";
		public String Fromdate = "";
		public String Todate = "";
		public String Active = "";
		public String Titlet = "";
		public String Harc = "";
		public String Roc = "";
				
		
		public void clear()
		{
			Rsno = "";
			Srcc = "";
			Sname = "";
			Searchname = "";
			Fname = "";
			Title = "";
			Titleftxt = "";
			Fullname = "";
			Practice = "";
			Searchpractice = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Adr5 = "";
			Pcod = "";
			Gplocn = "";
			Tel = "";
			Mobile = "";
			Surgphone = "";
			Fax = "";
			Email = "";
			Tpp = "";
			Gmpcode = "";
			Gmscode = "";
			Gppractice = "";
			Pcgcode = "";
			Fromdate = "";
			Todate = "";
			Active = "";
			Titlet = "";
			Harc = "";
			Roc = "";
			
		}		
	}
		
		
	public final class GpFilter
	{			
		public String Rsno = "";
		public String Srcc = "";
		public String Sname = "";
		public String Searchname = "";
		public String Fname = "";
		public String Title = "";
		public String Titleftxt = "";
		public String Fullname = "";
		public String Practice = "";
		public String Searchpractice = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Adr5 = "";
		public String Pcod = "";
		public String Gplocn = "";
		public String Tel = "";
		public String Mobile = "";
		public String Surgphone = "";
		public String Fax = "";
		public String Email = "";
		public String Tpp = "";
		public String Gmpcode = "";
		public String Gmscode = "";
		public String Gppractice = "";
		public String Pcgcode = "";
		public String Fromdate = "";
		public String Todate = "";
		public String Active = "";
		public String Titlet = "";
		public String Harc = "";
		public String Roc = "";
		
		public void clear()
		{				
			Rsno = "";
			Srcc = "";
			Sname = "";
			Searchname = "";
			Fname = "";
			Title = "";
			Titleftxt = "";
			Fullname = "";
			Practice = "";
			Searchpractice = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Adr5 = "";
			Pcod = "";
			Gplocn = "";
			Tel = "";
			Mobile = "";
			Surgphone = "";
			Fax = "";
			Email = "";
			Tpp = "";
			Gmpcode = "";
			Gmscode = "";
			Gppractice = "";
			Pcgcode = "";
			Fromdate = "";
			Todate = "";
			Active = "";
			Titlet = "";
			Harc = "";
			Roc = "";
		}	
		public GpFilter cloneObject()
		{
			GpFilter newFilter = new GpFilter();
			
			newFilter.Rsno = this.Rsno;
			newFilter.Srcc = this.Srcc;
			newFilter.Sname = this.Sname;
			newFilter.Searchname = this.Searchname;
			newFilter.Fname = this.Fname;
			newFilter.Title = this.Title;
			newFilter.Titleftxt = this.Titleftxt;
			newFilter.Fullname = this.Fullname;
			newFilter.Practice = this.Practice;
			newFilter.Searchpractice = this.Searchpractice;
			newFilter.Adr1 = this.Adr1;
			newFilter.Adr2 = this.Adr2;
			newFilter.Adr3 = this.Adr3;
			newFilter.Adr4 = this.Adr4;
			newFilter.Adr5 = this.Adr5;
			newFilter.Pcod = this.Pcod;
			newFilter.Gplocn = this.Gplocn;
			newFilter.Tel = this.Tel;
			newFilter.Mobile = this.Mobile;
			newFilter.Surgphone = this.Surgphone;
			newFilter.Fax = this.Fax;
			newFilter.Email = this.Email;
			newFilter.Tpp = this.Tpp;
			newFilter.Gmpcode = this.Gmpcode;
			newFilter.Gmscode = this.Gmscode;
			newFilter.Gppractice = this.Gppractice;
			newFilter.Pcgcode = this.Pcgcode;
			newFilter.Fromdate = this.Fromdate;
			newFilter.Todate = this.Todate;
			newFilter.Active = this.Active;
			newFilter.Titlet = this.Titlet;
			newFilter.Harc = this.Harc;
			newFilter.Roc = this.Roc;
			
			return newFilter;
		}
	}
}
