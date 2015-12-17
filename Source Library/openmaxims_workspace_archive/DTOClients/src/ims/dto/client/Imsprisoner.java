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

public final class Imsprisoner
{
	private ImsprisonerFilter lastGetFilter = null;
	private final String serviceName = "IMSPRISONER";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public ImsprisonerFilter Filter = new ImsprisonerFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public ImsprisonerEditFilter EditFilter = new ImsprisonerEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public ImsprisonerCollection DataCollection = new ImsprisonerCollection();

	/**
	 * Creates a new Imsprisoner Data Transfer Object.
	 */ 
	public Imsprisoner(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Imsprisoner cloneObject() throws ims.dto.Exception
	{
		Imsprisoner cloneObject = new Imsprisoner(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Pprisnum = DataCollection.get(x).Pprisnum;
			cloneObject.DataCollection.get(index).Pninum = DataCollection.get(x).Pninum;
			cloneObject.DataCollection.get(index).Pgcronum = DataCollection.get(x).Pgcronum;
			cloneObject.DataCollection.get(index).Pshhdfilenum = DataCollection.get(x).Pshhdfilenum;
			cloneObject.DataCollection.get(index).Psex = DataCollection.get(x).Psex;
			cloneObject.DataCollection.get(index).Eestabcd = DataCollection.get(x).Eestabcd;
			cloneObject.DataCollection.get(index).Pdbdob = DataCollection.get(x).Pdbdob;
			cloneObject.DataCollection.get(index).P_county = DataCollection.get(x).P_county;
			cloneObject.DataCollection.get(index).P_country = DataCollection.get(x).P_country;
			cloneObject.DataCollection.get(index).Paprisaddr1 = DataCollection.get(x).Paprisaddr1;
			cloneObject.DataCollection.get(index).Paprisaddr2 = DataCollection.get(x).Paprisaddr2;
			cloneObject.DataCollection.get(index).Paprisaddr3 = DataCollection.get(x).Paprisaddr3;
			cloneObject.DataCollection.get(index).Paprisaddr4 = DataCollection.get(x).Paprisaddr4;
			cloneObject.DataCollection.get(index).Addrnum = DataCollection.get(x).Addrnum;
			cloneObject.DataCollection.get(index).Pnsurnam = DataCollection.get(x).Pnsurnam;
			cloneObject.DataCollection.get(index).Pnprenam1 = DataCollection.get(x).Pnprenam1;
			cloneObject.DataCollection.get(index).Pnnamtype = DataCollection.get(x).Pnnamtype;
			cloneObject.DataCollection.get(index).County = DataCollection.get(x).County;
			cloneObject.DataCollection.get(index).Country = DataCollection.get(x).Country;
			cloneObject.DataCollection.get(index).Gendtxt = DataCollection.get(x).Gendtxt;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Eyecolour = DataCollection.get(x).Eyecolour;
			cloneObject.DataCollection.get(index).Complexion = DataCollection.get(x).Complexion;
			cloneObject.DataCollection.get(index).Occupation = DataCollection.get(x).Occupation;
			cloneObject.DataCollection.get(index).Marital = DataCollection.get(x).Marital;
			cloneObject.DataCollection.get(index).Religion = DataCollection.get(x).Religion;
			cloneObject.DataCollection.get(index).Nation = DataCollection.get(x).Nation;
			cloneObject.DataCollection.get(index).Height = DataCollection.get(x).Height;
			cloneObject.DataCollection.get(index).Weight = DataCollection.get(x).Weight;
			cloneObject.DataCollection.get(index).Ageleftschool = DataCollection.get(x).Ageleftschool;
			cloneObject.DataCollection.get(index).Readandwrite = DataCollection.get(x).Readandwrite;
			cloneObject.DataCollection.get(index).Education = DataCollection.get(x).Education;
			cloneObject.DataCollection.get(index).Sexoffender = DataCollection.get(x).Sexoffender;
			cloneObject.DataCollection.get(index).Committaltype = DataCollection.get(x).Committaltype;
			cloneObject.DataCollection.get(index).Legalstatus = DataCollection.get(x).Legalstatus;
			cloneObject.DataCollection.get(index).Remanduntil = DataCollection.get(x).Remanduntil;
			cloneObject.DataCollection.get(index).Osl = DataCollection.get(x).Osl;
			cloneObject.DataCollection.get(index).Mso = DataCollection.get(x).Mso;
			cloneObject.DataCollection.get(index).Currentstatus = DataCollection.get(x).Currentstatus;
			cloneObject.DataCollection.get(index).Movedatein = DataCollection.get(x).Movedatein;
			cloneObject.DataCollection.get(index).Movetimein = DataCollection.get(x).Movetimein;
			cloneObject.DataCollection.get(index).Releasedate = DataCollection.get(x).Releasedate;
			cloneObject.DataCollection.get(index).Committingprison = DataCollection.get(x).Committingprison;
			cloneObject.DataCollection.get(index).Lastprison = DataCollection.get(x).Lastprison;
			cloneObject.DataCollection.get(index).Eyecolourtxt = DataCollection.get(x).Eyecolourtxt;
			cloneObject.DataCollection.get(index).Complexiontxt = DataCollection.get(x).Complexiontxt;
			cloneObject.DataCollection.get(index).Occupationtxt = DataCollection.get(x).Occupationtxt;
			cloneObject.DataCollection.get(index).Maritaltxt = DataCollection.get(x).Maritaltxt;
			cloneObject.DataCollection.get(index).Religiontxt = DataCollection.get(x).Religiontxt;
			cloneObject.DataCollection.get(index).Nationtxt = DataCollection.get(x).Nationtxt;
			cloneObject.DataCollection.get(index).Readandwritetxt = DataCollection.get(x).Readandwritetxt;
			cloneObject.DataCollection.get(index).Educationtxt = DataCollection.get(x).Educationtxt;
			cloneObject.DataCollection.get(index).Sexoffendertxt = DataCollection.get(x).Sexoffendertxt;
			cloneObject.DataCollection.get(index).Committaltypetxt = DataCollection.get(x).Committaltypetxt;
			cloneObject.DataCollection.get(index).Legalstatustxt = DataCollection.get(x).Legalstatustxt;
			cloneObject.DataCollection.get(index).Msotxt = DataCollection.get(x).Msotxt;
			cloneObject.DataCollection.get(index).Currentstatustxt = DataCollection.get(x).Currentstatustxt;
			cloneObject.DataCollection.get(index).Committingprisontxt = DataCollection.get(x).Committingprisontxt;
			cloneObject.DataCollection.get(index).Lastprisontxt = DataCollection.get(x).Lastprisontxt;
			cloneObject.DataCollection.get(index).Haircolourtxt = DataCollection.get(x).Haircolourtxt;
			cloneObject.DataCollection.get(index).Haircolour = DataCollection.get(x).Haircolour;
			cloneObject.DataCollection.get(index).Pnoksnam = DataCollection.get(x).Pnoksnam;
			cloneObject.DataCollection.get(index).Pnokfnam = DataCollection.get(x).Pnokfnam;
			cloneObject.DataCollection.get(index).Pnokrelationship = DataCollection.get(x).Pnokrelationship;
			cloneObject.DataCollection.get(index).Pnokadr1 = DataCollection.get(x).Pnokadr1;
			cloneObject.DataCollection.get(index).Pnokadr2 = DataCollection.get(x).Pnokadr2;
			cloneObject.DataCollection.get(index).Pnokadr3 = DataCollection.get(x).Pnokadr3;
			cloneObject.DataCollection.get(index).Pnokadr4 = DataCollection.get(x).Pnokadr4;
			cloneObject.DataCollection.get(index).Pnokcnty = DataCollection.get(x).Pnokcnty;
			cloneObject.DataCollection.get(index).Pnokcntry = DataCollection.get(x).Pnokcntry;
			cloneObject.DataCollection.get(index).Pnokph1 = DataCollection.get(x).Pnokph1;
			cloneObject.DataCollection.get(index).Pnokph2 = DataCollection.get(x).Pnokph2;
			cloneObject.DataCollection.get(index).Nokctytxt = DataCollection.get(x).Nokctytxt;
			cloneObject.DataCollection.get(index).Nokctrytxt = DataCollection.get(x).Nokctrytxt;
			cloneObject.DataCollection.get(index).Nokrelship = DataCollection.get(x).Nokrelship;
			cloneObject.DataCollection.get(index).Mainid = DataCollection.get(x).Mainid;
			cloneObject.DataCollection.get(index).Hallcd = DataCollection.get(x).Hallcd;
			cloneObject.DataCollection.get(index).Cell = DataCollection.get(x).Cell;
			cloneObject.DataCollection.get(index).Hallname = DataCollection.get(x).Hallname;
			cloneObject.DataCollection.get(index).Hallestabcd = DataCollection.get(x).Hallestabcd;
			cloneObject.DataCollection.get(index).Lastmovereason = DataCollection.get(x).Lastmovereason;
			cloneObject.DataCollection.get(index).Lastmovereasontxt = DataCollection.get(x).Lastmovereasontxt;
			cloneObject.DataCollection.get(index).Movedateout = DataCollection.get(x).Movedateout;
			cloneObject.DataCollection.get(index).Estabout = DataCollection.get(x).Estabout;
			cloneObject.DataCollection.get(index).Movetimeout = DataCollection.get(x).Movetimeout;
			cloneObject.DataCollection.get(index).Att4 = DataCollection.get(x).Att4;
			cloneObject.DataCollection.get(index).Att5 = DataCollection.get(x).Att5;
			cloneObject.DataCollection.get(index).Att6 = DataCollection.get(x).Att6;
			cloneObject.DataCollection.get(index).Att7 = DataCollection.get(x).Att7;
			cloneObject.DataCollection.get(index).Att8 = DataCollection.get(x).Att8;
							
			
			for(int iSeqno = 0; iSeqno < DataCollection.get(x).SeqnoCollection.count(); iSeqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnoCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Seqno = DataCollection.get(x).SeqnoCollection.get(iSeqno).Seqno;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Pnum = DataCollection.get(x).SeqnoCollection.get(iSeqno).Pnum;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Extid = DataCollection.get(x).SeqnoCollection.get(iSeqno).Extid;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Idtype = DataCollection.get(x).SeqnoCollection.get(iSeqno).Idtype;
										
			}
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "75";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Imsprisoner.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Imsprisoner.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Imsprisoner.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Imsprisoner.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Imsprisoner.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Imsprisoner.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Imsprisoner.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Imsprisoner.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Imsprisoner.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Imsprisoner.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Imsprisoner.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Imsprisoner.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Imsprisoner.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Imsprisoner.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Imsprisoner.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Imsprisoner.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Imsprisoner.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Imsprisoner.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Imsprisoner.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Imsprisoner.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Imsprisoner.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Imsprisoner.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Imsprisoner.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Imsprisoner.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Imsprisoner.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Imsprisoner.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Imsprisoner.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Imsprisoner.List");
							
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
	private String encodeNASFilter(ImsprisonerFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Pprisnum != null && filter.Pprisnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PPRISNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pprisnum;
		}
		
		if(Filter.Pninum != null && filter.Pninum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNINUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pninum;
		}
		
		if(Filter.Pgcronum != null && filter.Pgcronum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PGCRONUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pgcronum;
		}
		
		if(Filter.Pshhdfilenum != null && filter.Pshhdfilenum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PSHHDFILENUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pshhdfilenum;
		}
		
		if(Filter.Psex != null && filter.Psex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PSEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Psex;
		}
		
		if(Filter.Eestabcd != null && filter.Eestabcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EESTABCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eestabcd;
		}
		
		if(Filter.Pdbdob != null && filter.Pdbdob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PDBDOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pdbdob;
		}
		
		if(Filter.P_county != null && filter.P_county.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "P_COUNTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.P_county;
		}
		
		if(Filter.P_country != null && filter.P_country.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "P_COUNTRY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.P_country;
		}
		
		if(Filter.Paprisaddr1 != null && filter.Paprisaddr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PAPRISADDR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Paprisaddr1;
		}
		
		if(Filter.Paprisaddr2 != null && filter.Paprisaddr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PAPRISADDR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Paprisaddr2;
		}
		
		if(Filter.Paprisaddr3 != null && filter.Paprisaddr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PAPRISADDR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Paprisaddr3;
		}
		
		if(Filter.Paprisaddr4 != null && filter.Paprisaddr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PAPRISADDR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Paprisaddr4;
		}
		
		if(Filter.Addrnum != null && filter.Addrnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADDRNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Addrnum;
		}
		
		if(Filter.Pnsurnam != null && filter.Pnsurnam.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNSURNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnsurnam;
		}
		
		if(Filter.Pnprenam1 != null && filter.Pnprenam1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNPRENAM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnprenam1;
		}
		
		if(Filter.Pnnamtype != null && filter.Pnnamtype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNNAMTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnnamtype;
		}
		
		if(Filter.County != null && filter.County.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COUNTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.County;
		}
		
		if(Filter.Country != null && filter.Country.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COUNTRY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Country;
		}
		
		if(Filter.Gendtxt != null && filter.Gendtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GENDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gendtxt;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Eyecolour != null && filter.Eyecolour.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EYECOLOUR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eyecolour;
		}
		
		if(Filter.Complexion != null && filter.Complexion.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COMPLEXION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Complexion;
		}
		
		if(Filter.Occupation != null && filter.Occupation.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OCCUPATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Occupation;
		}
		
		if(Filter.Marital != null && filter.Marital.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MARITAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Marital;
		}
		
		if(Filter.Religion != null && filter.Religion.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RELIGION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Religion;
		}
		
		if(Filter.Nation != null && filter.Nation.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nation;
		}
		
		if(Filter.Height != null && filter.Height.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HEIGHT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Height;
		}
		
		if(Filter.Weight != null && filter.Weight.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WEIGHT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Weight;
		}
		
		if(Filter.Ageleftschool != null && filter.Ageleftschool.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AGELEFTSCHOOL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ageleftschool;
		}
		
		if(Filter.Readandwrite != null && filter.Readandwrite.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "READANDWRITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Readandwrite;
		}
		
		if(Filter.Education != null && filter.Education.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EDUCATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Education;
		}
		
		if(Filter.Sexoffender != null && filter.Sexoffender.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SEXOFFENDER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sexoffender;
		}
		
		if(Filter.Committaltype != null && filter.Committaltype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COMMITTALTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Committaltype;
		}
		
		if(Filter.Legalstatus != null && filter.Legalstatus.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LEGALSTATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Legalstatus;
		}
		
		if(Filter.Remanduntil != null && filter.Remanduntil.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REMANDUNTIL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Remanduntil;
		}
		
		if(Filter.Osl != null && filter.Osl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OSL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Osl;
		}
		
		if(Filter.Mso != null && filter.Mso.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MSO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mso;
		}
		
		if(Filter.Currentstatus != null && filter.Currentstatus.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CURRENTSTATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Currentstatus;
		}
		
		if(Filter.Movedatein != null && filter.Movedatein.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MOVEDATEIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Movedatein;
		}
		
		if(Filter.Movetimein != null && filter.Movetimein.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MOVETIMEIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Movetimein;
		}
		
		if(Filter.Releasedate != null && filter.Releasedate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RELEASEDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Releasedate;
		}
		
		if(Filter.Committingprison != null && filter.Committingprison.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COMMITTINGPRISON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Committingprison;
		}
		
		if(Filter.Lastprison != null && filter.Lastprison.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LASTPRISON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lastprison;
		}
		
		if(Filter.Eyecolourtxt != null && filter.Eyecolourtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EYECOLOURTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eyecolourtxt;
		}
		
		if(Filter.Complexiontxt != null && filter.Complexiontxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COMPLEXIONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Complexiontxt;
		}
		
		if(Filter.Occupationtxt != null && filter.Occupationtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OCCUPATIONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Occupationtxt;
		}
		
		if(Filter.Maritaltxt != null && filter.Maritaltxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MARITALTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Maritaltxt;
		}
		
		if(Filter.Religiontxt != null && filter.Religiontxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RELIGIONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Religiontxt;
		}
		
		if(Filter.Nationtxt != null && filter.Nationtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NATIONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nationtxt;
		}
		
		if(Filter.Readandwritetxt != null && filter.Readandwritetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "READANDWRITETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Readandwritetxt;
		}
		
		if(Filter.Educationtxt != null && filter.Educationtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EDUCATIONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Educationtxt;
		}
		
		if(Filter.Sexoffendertxt != null && filter.Sexoffendertxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SEXOFFENDERTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sexoffendertxt;
		}
		
		if(Filter.Committaltypetxt != null && filter.Committaltypetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COMMITTALTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Committaltypetxt;
		}
		
		if(Filter.Legalstatustxt != null && filter.Legalstatustxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LEGALSTATUSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Legalstatustxt;
		}
		
		if(Filter.Msotxt != null && filter.Msotxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MSOTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Msotxt;
		}
		
		if(Filter.Currentstatustxt != null && filter.Currentstatustxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CURRENTSTATUSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Currentstatustxt;
		}
		
		if(Filter.Committingprisontxt != null && filter.Committingprisontxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COMMITTINGPRISONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Committingprisontxt;
		}
		
		if(Filter.Lastprisontxt != null && filter.Lastprisontxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LASTPRISONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lastprisontxt;
		}
		
		if(Filter.Haircolourtxt != null && filter.Haircolourtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HAIRCOLOURTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Haircolourtxt;
		}
		
		if(Filter.Haircolour != null && filter.Haircolour.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HAIRCOLOUR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Haircolour;
		}
		
		if(Filter.Pnoksnam != null && filter.Pnoksnam.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNOKSNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnoksnam;
		}
		
		if(Filter.Pnokfnam != null && filter.Pnokfnam.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNOKFNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnokfnam;
		}
		
		if(Filter.Pnokrelationship != null && filter.Pnokrelationship.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNOKRELATIONSHIP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnokrelationship;
		}
		
		if(Filter.Pnokadr1 != null && filter.Pnokadr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNOKADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnokadr1;
		}
		
		if(Filter.Pnokadr2 != null && filter.Pnokadr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNOKADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnokadr2;
		}
		
		if(Filter.Pnokadr3 != null && filter.Pnokadr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNOKADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnokadr3;
		}
		
		if(Filter.Pnokadr4 != null && filter.Pnokadr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNOKADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnokadr4;
		}
		
		if(Filter.Pnokcnty != null && filter.Pnokcnty.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNOKCNTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnokcnty;
		}
		
		if(Filter.Pnokcntry != null && filter.Pnokcntry.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNOKCNTRY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnokcntry;
		}
		
		if(Filter.Pnokph1 != null && filter.Pnokph1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNOKPH1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnokph1;
		}
		
		if(Filter.Pnokph2 != null && filter.Pnokph2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PNOKPH2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pnokph2;
		}
		
		if(Filter.Nokctytxt != null && filter.Nokctytxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NOKCTYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nokctytxt;
		}
		
		if(Filter.Nokctrytxt != null && filter.Nokctrytxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NOKCTRYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nokctrytxt;
		}
		
		if(Filter.Nokrelship != null && filter.Nokrelship.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NOKRELSHIP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nokrelship;
		}
		
		if(Filter.Mainid != null && filter.Mainid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MAINID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mainid;
		}
		
		if(Filter.Hallcd != null && filter.Hallcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HALLCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hallcd;
		}
		
		if(Filter.Cell != null && filter.Cell.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CELL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cell;
		}
		
		if(Filter.Hallname != null && filter.Hallname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HALLNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hallname;
		}
		
		if(Filter.Hallestabcd != null && filter.Hallestabcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HALLESTABCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hallestabcd;
		}
		
		if(Filter.Lastmovereason != null && filter.Lastmovereason.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LASTMOVEREASON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lastmovereason;
		}
		
		if(Filter.Lastmovereasontxt != null && filter.Lastmovereasontxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LASTMOVEREASONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lastmovereasontxt;
		}
		
		if(Filter.Movedateout != null && filter.Movedateout.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MOVEDATEOUT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Movedateout;
		}
		
		if(Filter.Estabout != null && filter.Estabout.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ESTABOUT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Estabout;
		}
		
		if(Filter.Movetimeout != null && filter.Movetimeout.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MOVETIMEOUT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Movetimeout;
		}
		
		if(Filter.Att4 != null && filter.Att4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ATT4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Att4;
		}
		
		if(Filter.Att5 != null && filter.Att5.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ATT5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Att5;
		}
		
		if(Filter.Att6 != null && filter.Att6.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ATT6" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Att6;
		}
		
		if(Filter.Att7 != null && filter.Att7.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ATT7" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Att7;
		}
		
		if(Filter.Att8 != null && filter.Att8.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ATT8" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Att8;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		ImsprisonerRecord data = (ImsprisonerRecord)DataCollection.get(0);
		
		if(EditFilter.IncludePprisnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PPRISNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pprisnum);
		}
		
		if(EditFilter.IncludePninum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNINUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pninum);
		}
		
		if(EditFilter.IncludePgcronum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PGCRONUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pgcronum);
		}
		
		if(EditFilter.IncludePshhdfilenum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PSHHDFILENUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pshhdfilenum);
		}
		
		if(EditFilter.IncludePsex)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PSEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Psex);
		}
		
		if(EditFilter.IncludeEestabcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EESTABCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eestabcd);
		}
		
		if(EditFilter.IncludePdbdob)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PDBDOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pdbdob);
		}
		
		if(EditFilter.IncludeP_county)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "P_COUNTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.P_county);
		}
		
		if(EditFilter.IncludeP_country)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "P_COUNTRY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.P_country);
		}
		
		if(EditFilter.IncludePaprisaddr1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PAPRISADDR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Paprisaddr1);
		}
		
		if(EditFilter.IncludePaprisaddr2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PAPRISADDR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Paprisaddr2);
		}
		
		if(EditFilter.IncludePaprisaddr3)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PAPRISADDR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Paprisaddr3);
		}
		
		if(EditFilter.IncludePaprisaddr4)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PAPRISADDR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Paprisaddr4);
		}
		
		if(EditFilter.IncludeAddrnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADDRNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Addrnum);
		}
		
		if(EditFilter.IncludePnsurnam)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNSURNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnsurnam);
		}
		
		if(EditFilter.IncludePnprenam1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNPRENAM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnprenam1);
		}
		
		if(EditFilter.IncludePnnamtype)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNNAMTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnnamtype);
		}
		
		if(EditFilter.IncludeCounty)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COUNTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.County);
		}
		
		if(EditFilter.IncludeCountry)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COUNTRY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Country);
		}
		
		if(EditFilter.IncludeGendtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "GENDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gendtxt);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeEyecolour)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EYECOLOUR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eyecolour);
		}
		
		if(EditFilter.IncludeComplexion)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COMPLEXION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Complexion);
		}
		
		if(EditFilter.IncludeOccupation)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OCCUPATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Occupation);
		}
		
		if(EditFilter.IncludeMarital)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MARITAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Marital);
		}
		
		if(EditFilter.IncludeReligion)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RELIGION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Religion);
		}
		
		if(EditFilter.IncludeNation)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nation);
		}
		
		if(EditFilter.IncludeHeight)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HEIGHT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Height);
		}
		
		if(EditFilter.IncludeWeight)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WEIGHT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Weight);
		}
		
		if(EditFilter.IncludeAgeleftschool)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AGELEFTSCHOOL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ageleftschool);
		}
		
		if(EditFilter.IncludeReadandwrite)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "READANDWRITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Readandwrite);
		}
		
		if(EditFilter.IncludeEducation)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EDUCATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Education);
		}
		
		if(EditFilter.IncludeSexoffender)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEXOFFENDER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sexoffender);
		}
		
		if(EditFilter.IncludeCommittaltype)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COMMITTALTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Committaltype);
		}
		
		if(EditFilter.IncludeLegalstatus)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LEGALSTATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Legalstatus);
		}
		
		if(EditFilter.IncludeRemanduntil)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REMANDUNTIL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Remanduntil);
		}
		
		if(EditFilter.IncludeOsl)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OSL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Osl);
		}
		
		if(EditFilter.IncludeMso)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MSO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mso);
		}
		
		if(EditFilter.IncludeCurrentstatus)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CURRENTSTATUS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Currentstatus);
		}
		
		if(EditFilter.IncludeMovedatein)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MOVEDATEIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Movedatein);
		}
		
		if(EditFilter.IncludeMovetimein)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MOVETIMEIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Movetimein);
		}
		
		if(EditFilter.IncludeReleasedate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RELEASEDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Releasedate);
		}
		
		if(EditFilter.IncludeCommittingprison)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COMMITTINGPRISON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Committingprison);
		}
		
		if(EditFilter.IncludeLastprison)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LASTPRISON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lastprison);
		}
		
		if(EditFilter.IncludeEyecolourtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EYECOLOURTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eyecolourtxt);
		}
		
		if(EditFilter.IncludeComplexiontxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COMPLEXIONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Complexiontxt);
		}
		
		if(EditFilter.IncludeOccupationtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "OCCUPATIONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Occupationtxt);
		}
		
		if(EditFilter.IncludeMaritaltxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MARITALTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Maritaltxt);
		}
		
		if(EditFilter.IncludeReligiontxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RELIGIONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Religiontxt);
		}
		
		if(EditFilter.IncludeNationtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NATIONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nationtxt);
		}
		
		if(EditFilter.IncludeReadandwritetxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "READANDWRITETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Readandwritetxt);
		}
		
		if(EditFilter.IncludeEducationtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EDUCATIONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Educationtxt);
		}
		
		if(EditFilter.IncludeSexoffendertxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEXOFFENDERTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sexoffendertxt);
		}
		
		if(EditFilter.IncludeCommittaltypetxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COMMITTALTYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Committaltypetxt);
		}
		
		if(EditFilter.IncludeLegalstatustxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LEGALSTATUSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Legalstatustxt);
		}
		
		if(EditFilter.IncludeMsotxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MSOTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Msotxt);
		}
		
		if(EditFilter.IncludeCurrentstatustxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CURRENTSTATUSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Currentstatustxt);
		}
		
		if(EditFilter.IncludeCommittingprisontxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COMMITTINGPRISONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Committingprisontxt);
		}
		
		if(EditFilter.IncludeLastprisontxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LASTPRISONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lastprisontxt);
		}
		
		if(EditFilter.IncludeHaircolourtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HAIRCOLOURTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Haircolourtxt);
		}
		
		if(EditFilter.IncludeHaircolour)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HAIRCOLOUR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Haircolour);
		}
		
		if(EditFilter.IncludePnoksnam)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNOKSNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnoksnam);
		}
		
		if(EditFilter.IncludePnokfnam)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNOKFNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnokfnam);
		}
		
		if(EditFilter.IncludePnokrelationship)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNOKRELATIONSHIP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnokrelationship);
		}
		
		if(EditFilter.IncludePnokadr1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNOKADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnokadr1);
		}
		
		if(EditFilter.IncludePnokadr2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNOKADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnokadr2);
		}
		
		if(EditFilter.IncludePnokadr3)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNOKADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnokadr3);
		}
		
		if(EditFilter.IncludePnokadr4)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNOKADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnokadr4);
		}
		
		if(EditFilter.IncludePnokcnty)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNOKCNTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnokcnty);
		}
		
		if(EditFilter.IncludePnokcntry)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNOKCNTRY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnokcntry);
		}
		
		if(EditFilter.IncludePnokph1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNOKPH1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnokph1);
		}
		
		if(EditFilter.IncludePnokph2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNOKPH2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pnokph2);
		}
		
		if(EditFilter.IncludeNokctytxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NOKCTYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nokctytxt);
		}
		
		if(EditFilter.IncludeNokctrytxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NOKCTRYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nokctrytxt);
		}
		
		if(EditFilter.IncludeNokrelship)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NOKRELSHIP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nokrelship);
		}
		
		if(EditFilter.IncludeMainid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MAINID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mainid);
		}
		
		if(EditFilter.IncludeHallcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HALLCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hallcd);
		}
		
		if(EditFilter.IncludeCell)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CELL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cell);
		}
		
		if(EditFilter.IncludeHallname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HALLNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hallname);
		}
		
		if(EditFilter.IncludeHallestabcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HALLESTABCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hallestabcd);
		}
		
		if(EditFilter.IncludeLastmovereason)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LASTMOVEREASON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lastmovereason);
		}
		
		if(EditFilter.IncludeLastmovereasontxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LASTMOVEREASONTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lastmovereasontxt);
		}
		
		if(EditFilter.IncludeMovedateout)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MOVEDATEOUT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Movedateout);
		}
		
		if(EditFilter.IncludeEstabout)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ESTABOUT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Estabout);
		}
		
		if(EditFilter.IncludeMovetimeout)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MOVETIMEOUT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Movetimeout);
		}
		
		if(EditFilter.IncludeAtt4)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ATT4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Att4);
		}
		
		if(EditFilter.IncludeAtt5)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ATT5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Att5);
		}
		
		if(EditFilter.IncludeAtt6)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ATT6" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Att6);
		}
		
		if(EditFilter.IncludeAtt7)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ATT7" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Att7);
		}
		
		if(EditFilter.IncludeAtt8)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ATT8" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Att8);
		}
		
		
		for(int x = 0; x < data.SeqnoCollection.count(); x++)
		{
			ImsprisonerSeqnoRecord rgRecord = (ImsprisonerSeqnoRecord)data.SeqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Pnum);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EXTID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Extid);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "IDTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Idtype);
			
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
			ImsprisonerRecord record = new ImsprisonerRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pprisnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PPRISNUM"));
			record.Pninum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNINUM"));
			record.Pgcronum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PGCRONUM"));
			record.Pshhdfilenum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PSHHDFILENUM"));
			record.Psex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PSEX"));
			record.Eestabcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EESTABCD"));
			record.Pdbdob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PDBDOB"));
			record.P_county = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "P_COUNTY"));
			record.P_country = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "P_COUNTRY"));
			record.Paprisaddr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAPRISADDR1"));
			record.Paprisaddr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAPRISADDR2"));
			record.Paprisaddr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAPRISADDR3"));
			record.Paprisaddr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAPRISADDR4"));
			record.Addrnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDRNUM"));
			record.Pnsurnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNSURNAM"));
			record.Pnprenam1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNPRENAM1"));
			record.Pnnamtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNNAMTYPE"));
			record.County = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COUNTY"));
			record.Country = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COUNTRY"));
			record.Gendtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GENDTXT"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Eyecolour = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EYECOLOUR"));
			record.Complexion = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPLEXION"));
			record.Occupation = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OCCUPATION"));
			record.Marital = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MARITAL"));
			record.Religion = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELIGION"));
			record.Nation = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NATION"));
			record.Height = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HEIGHT"));
			record.Weight = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WEIGHT"));
			record.Ageleftschool = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AGELEFTSCHOOL"));
			record.Readandwrite = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "READANDWRITE"));
			record.Education = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EDUCATION"));
			record.Sexoffender = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEXOFFENDER"));
			record.Committaltype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMMITTALTYPE"));
			record.Legalstatus = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LEGALSTATUS"));
			record.Remanduntil = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REMANDUNTIL"));
			record.Osl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OSL"));
			record.Mso = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSO"));
			record.Currentstatus = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURRENTSTATUS"));
			record.Movedatein = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOVEDATEIN"));
			record.Movetimein = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOVETIMEIN"));
			record.Releasedate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELEASEDATE"));
			record.Committingprison = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMMITTINGPRISON"));
			record.Lastprison = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LASTPRISON"));
			record.Eyecolourtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EYECOLOURTXT"));
			record.Complexiontxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPLEXIONTXT"));
			record.Occupationtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OCCUPATIONTXT"));
			record.Maritaltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MARITALTXT"));
			record.Religiontxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELIGIONTXT"));
			record.Nationtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NATIONTXT"));
			record.Readandwritetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "READANDWRITETXT"));
			record.Educationtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EDUCATIONTXT"));
			record.Sexoffendertxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEXOFFENDERTXT"));
			record.Committaltypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMMITTALTYPETXT"));
			record.Legalstatustxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LEGALSTATUSTXT"));
			record.Msotxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSOTXT"));
			record.Currentstatustxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURRENTSTATUSTXT"));
			record.Committingprisontxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMMITTINGPRISONTXT"));
			record.Lastprisontxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LASTPRISONTXT"));
			record.Haircolourtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HAIRCOLOURTXT"));
			record.Haircolour = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HAIRCOLOUR"));
			record.Pnoksnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKSNAM"));
			record.Pnokfnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKFNAM"));
			record.Pnokrelationship = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKRELATIONSHIP"));
			record.Pnokadr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKADR1"));
			record.Pnokadr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKADR2"));
			record.Pnokadr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKADR3"));
			record.Pnokadr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKADR4"));
			record.Pnokcnty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKCNTY"));
			record.Pnokcntry = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKCNTRY"));
			record.Pnokph1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKPH1"));
			record.Pnokph2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKPH2"));
			record.Nokctytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOKCTYTXT"));
			record.Nokctrytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOKCTRYTXT"));
			record.Nokrelship = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOKRELSHIP"));
			record.Mainid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAINID"));
			record.Hallcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HALLCD"));
			record.Cell = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CELL"));
			record.Hallname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HALLNAME"));
			record.Hallestabcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HALLESTABCD"));
			record.Lastmovereason = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LASTMOVEREASON"));
			record.Lastmovereasontxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LASTMOVEREASONTXT"));
			record.Movedateout = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOVEDATEOUT"));
			record.Estabout = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTABOUT"));
			record.Movetimeout = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOVETIMEOUT"));
			record.Att4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT4"));
			record.Att5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT5"));
			record.Att6 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT6"));
			record.Att7 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT7"));
			record.Att8 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT8"));
									
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
			ImsprisonerRecord record = new ImsprisonerRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pprisnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PPRISNUM"));
			record.Pninum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNINUM"));
			record.Pgcronum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PGCRONUM"));
			record.Pshhdfilenum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PSHHDFILENUM"));
			record.Psex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PSEX"));
			record.Eestabcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EESTABCD"));
			record.Pdbdob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PDBDOB"));
			record.P_county = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "P_COUNTY"));
			record.P_country = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "P_COUNTRY"));
			record.Paprisaddr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAPRISADDR1"));
			record.Paprisaddr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAPRISADDR2"));
			record.Paprisaddr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAPRISADDR3"));
			record.Paprisaddr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAPRISADDR4"));
			record.Addrnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDRNUM"));
			record.Pnsurnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNSURNAM"));
			record.Pnprenam1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNPRENAM1"));
			record.Pnnamtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNNAMTYPE"));
			record.County = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COUNTY"));
			record.Country = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COUNTRY"));
			record.Gendtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GENDTXT"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Eyecolour = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EYECOLOUR"));
			record.Complexion = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPLEXION"));
			record.Occupation = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OCCUPATION"));
			record.Marital = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MARITAL"));
			record.Religion = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELIGION"));
			record.Nation = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NATION"));
			record.Height = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HEIGHT"));
			record.Weight = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WEIGHT"));
			record.Ageleftschool = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AGELEFTSCHOOL"));
			record.Readandwrite = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "READANDWRITE"));
			record.Education = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EDUCATION"));
			record.Sexoffender = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEXOFFENDER"));
			record.Committaltype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMMITTALTYPE"));
			record.Legalstatus = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LEGALSTATUS"));
			record.Remanduntil = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REMANDUNTIL"));
			record.Osl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OSL"));
			record.Mso = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSO"));
			record.Currentstatus = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURRENTSTATUS"));
			record.Movedatein = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOVEDATEIN"));
			record.Movetimein = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOVETIMEIN"));
			record.Releasedate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELEASEDATE"));
			record.Committingprison = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMMITTINGPRISON"));
			record.Lastprison = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LASTPRISON"));
			record.Eyecolourtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EYECOLOURTXT"));
			record.Complexiontxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMPLEXIONTXT"));
			record.Occupationtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OCCUPATIONTXT"));
			record.Maritaltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MARITALTXT"));
			record.Religiontxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELIGIONTXT"));
			record.Nationtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NATIONTXT"));
			record.Readandwritetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "READANDWRITETXT"));
			record.Educationtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EDUCATIONTXT"));
			record.Sexoffendertxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEXOFFENDERTXT"));
			record.Committaltypetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMMITTALTYPETXT"));
			record.Legalstatustxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LEGALSTATUSTXT"));
			record.Msotxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MSOTXT"));
			record.Currentstatustxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CURRENTSTATUSTXT"));
			record.Committingprisontxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMMITTINGPRISONTXT"));
			record.Lastprisontxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LASTPRISONTXT"));
			record.Haircolourtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HAIRCOLOURTXT"));
			record.Haircolour = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HAIRCOLOUR"));
			record.Pnoksnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKSNAM"));
			record.Pnokfnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKFNAM"));
			record.Pnokrelationship = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKRELATIONSHIP"));
			record.Pnokadr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKADR1"));
			record.Pnokadr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKADR2"));
			record.Pnokadr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKADR3"));
			record.Pnokadr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKADR4"));
			record.Pnokcnty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKCNTY"));
			record.Pnokcntry = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKCNTRY"));
			record.Pnokph1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKPH1"));
			record.Pnokph2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PNOKPH2"));
			record.Nokctytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOKCTYTXT"));
			record.Nokctrytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOKCTRYTXT"));
			record.Nokrelship = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOKRELSHIP"));
			record.Mainid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAINID"));
			record.Hallcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HALLCD"));
			record.Cell = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CELL"));
			record.Hallname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HALLNAME"));
			record.Hallestabcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HALLESTABCD"));
			record.Lastmovereason = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LASTMOVEREASON"));
			record.Lastmovereasontxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LASTMOVEREASONTXT"));
			record.Movedateout = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOVEDATEOUT"));
			record.Estabout = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ESTABOUT"));
			record.Movetimeout = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOVETIMEOUT"));
			record.Att4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT4"));
			record.Att5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT5"));
			record.Att6 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT6"));
			record.Att7 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT7"));
			record.Att8 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATT8"));
									
			
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
						ImsprisonerSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("pnum"))
					{
						ImsprisonerSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Pnum = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("extid"))
					{
						ImsprisonerSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Extid = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("idtype"))
					{
						ImsprisonerSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Idtype = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class ImsprisonerCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			ImsprisonerRecord newRecord = new ImsprisonerRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(ImsprisonerRecord record)
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
		public ImsprisonerRecord get(int index)
		{
			return (ImsprisonerRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class ImsprisonerRecord
	{
		public String Pprisnum = "";
		public String Pninum = "";
		public String Pgcronum = "";
		public String Pshhdfilenum = "";
		public String Psex = "";
		public String Eestabcd = "";
		public String Pdbdob = "";
		public String P_county = "";
		public String P_country = "";
		public String Paprisaddr1 = "";
		public String Paprisaddr2 = "";
		public String Paprisaddr3 = "";
		public String Paprisaddr4 = "";
		public String Addrnum = "";
		public String Pnsurnam = "";
		public String Pnprenam1 = "";
		public String Pnnamtype = "";
		public String County = "";
		public String Country = "";
		public String Gendtxt = "";
		public String Tstp = "";
		public String Eyecolour = "";
		public String Complexion = "";
		public String Occupation = "";
		public String Marital = "";
		public String Religion = "";
		public String Nation = "";
		public String Height = "";
		public String Weight = "";
		public String Ageleftschool = "";
		public String Readandwrite = "";
		public String Education = "";
		public String Sexoffender = "";
		public String Committaltype = "";
		public String Legalstatus = "";
		public String Remanduntil = "";
		public String Osl = "";
		public String Mso = "";
		public String Currentstatus = "";
		public String Movedatein = "";
		public String Movetimein = "";
		public String Releasedate = "";
		public String Committingprison = "";
		public String Lastprison = "";
		public String Eyecolourtxt = "";
		public String Complexiontxt = "";
		public String Occupationtxt = "";
		public String Maritaltxt = "";
		public String Religiontxt = "";
		public String Nationtxt = "";
		public String Readandwritetxt = "";
		public String Educationtxt = "";
		public String Sexoffendertxt = "";
		public String Committaltypetxt = "";
		public String Legalstatustxt = "";
		public String Msotxt = "";
		public String Currentstatustxt = "";
		public String Committingprisontxt = "";
		public String Lastprisontxt = "";
		public String Haircolourtxt = "";
		public String Haircolour = "";
		public String Pnoksnam = "";
		public String Pnokfnam = "";
		public String Pnokrelationship = "";
		public String Pnokadr1 = "";
		public String Pnokadr2 = "";
		public String Pnokadr3 = "";
		public String Pnokadr4 = "";
		public String Pnokcnty = "";
		public String Pnokcntry = "";
		public String Pnokph1 = "";
		public String Pnokph2 = "";
		public String Nokctytxt = "";
		public String Nokctrytxt = "";
		public String Nokrelship = "";
		public String Mainid = "";
		public String Hallcd = "";
		public String Cell = "";
		public String Hallname = "";
		public String Hallestabcd = "";
		public String Lastmovereason = "";
		public String Lastmovereasontxt = "";
		public String Movedateout = "";
		public String Estabout = "";
		public String Movetimeout = "";
		public String Att4 = "";
		public String Att5 = "";
		public String Att6 = "";
		public String Att7 = "";
		public String Att8 = "";
		
		public ImsprisonerSeqnoCollection SeqnoCollection = new ImsprisonerSeqnoCollection();		
		
		public void clear()
		{
			Pprisnum = "";
			Pninum = "";
			Pgcronum = "";
			Pshhdfilenum = "";
			Psex = "";
			Eestabcd = "";
			Pdbdob = "";
			P_county = "";
			P_country = "";
			Paprisaddr1 = "";
			Paprisaddr2 = "";
			Paprisaddr3 = "";
			Paprisaddr4 = "";
			Addrnum = "";
			Pnsurnam = "";
			Pnprenam1 = "";
			Pnnamtype = "";
			County = "";
			Country = "";
			Gendtxt = "";
			Tstp = "";
			Eyecolour = "";
			Complexion = "";
			Occupation = "";
			Marital = "";
			Religion = "";
			Nation = "";
			Height = "";
			Weight = "";
			Ageleftschool = "";
			Readandwrite = "";
			Education = "";
			Sexoffender = "";
			Committaltype = "";
			Legalstatus = "";
			Remanduntil = "";
			Osl = "";
			Mso = "";
			Currentstatus = "";
			Movedatein = "";
			Movetimein = "";
			Releasedate = "";
			Committingprison = "";
			Lastprison = "";
			Eyecolourtxt = "";
			Complexiontxt = "";
			Occupationtxt = "";
			Maritaltxt = "";
			Religiontxt = "";
			Nationtxt = "";
			Readandwritetxt = "";
			Educationtxt = "";
			Sexoffendertxt = "";
			Committaltypetxt = "";
			Legalstatustxt = "";
			Msotxt = "";
			Currentstatustxt = "";
			Committingprisontxt = "";
			Lastprisontxt = "";
			Haircolourtxt = "";
			Haircolour = "";
			Pnoksnam = "";
			Pnokfnam = "";
			Pnokrelationship = "";
			Pnokadr1 = "";
			Pnokadr2 = "";
			Pnokadr3 = "";
			Pnokadr4 = "";
			Pnokcnty = "";
			Pnokcntry = "";
			Pnokph1 = "";
			Pnokph2 = "";
			Nokctytxt = "";
			Nokctrytxt = "";
			Nokrelship = "";
			Mainid = "";
			Hallcd = "";
			Cell = "";
			Hallname = "";
			Hallestabcd = "";
			Lastmovereason = "";
			Lastmovereasontxt = "";
			Movedateout = "";
			Estabout = "";
			Movetimeout = "";
			Att4 = "";
			Att5 = "";
			Att6 = "";
			Att7 = "";
			Att8 = "";
			
			SeqnoCollection.clear();
		}		
	}
	
	public final class ImsprisonerSeqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			ImsprisonerSeqnoRecord newRecord = new ImsprisonerSeqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(ImsprisonerSeqnoRecord record)
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
		public ImsprisonerSeqnoRecord get(int index)
		{
			return (ImsprisonerSeqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class ImsprisonerSeqnoRecord
	{
		public String Seqno = "";
		public String Pnum = "";
		public String Extid = "";
		public String Idtype = "";
		
		public void clear()
		{
			Seqno = "";
			Pnum = "";
			Extid = "";
			Idtype = "";
			
		}
	}	
	public final class ImsprisonerFilter
	{			
		public String Pprisnum = "";
		public String Pninum = "";
		public String Pgcronum = "";
		public String Pshhdfilenum = "";
		public String Psex = "";
		public String Eestabcd = "";
		public String Pdbdob = "";
		public String P_county = "";
		public String P_country = "";
		public String Paprisaddr1 = "";
		public String Paprisaddr2 = "";
		public String Paprisaddr3 = "";
		public String Paprisaddr4 = "";
		public String Addrnum = "";
		public String Pnsurnam = "";
		public String Pnprenam1 = "";
		public String Pnnamtype = "";
		public String County = "";
		public String Country = "";
		public String Gendtxt = "";
		public String Tstp = "";
		public String Eyecolour = "";
		public String Complexion = "";
		public String Occupation = "";
		public String Marital = "";
		public String Religion = "";
		public String Nation = "";
		public String Height = "";
		public String Weight = "";
		public String Ageleftschool = "";
		public String Readandwrite = "";
		public String Education = "";
		public String Sexoffender = "";
		public String Committaltype = "";
		public String Legalstatus = "";
		public String Remanduntil = "";
		public String Osl = "";
		public String Mso = "";
		public String Currentstatus = "";
		public String Movedatein = "";
		public String Movetimein = "";
		public String Releasedate = "";
		public String Committingprison = "";
		public String Lastprison = "";
		public String Eyecolourtxt = "";
		public String Complexiontxt = "";
		public String Occupationtxt = "";
		public String Maritaltxt = "";
		public String Religiontxt = "";
		public String Nationtxt = "";
		public String Readandwritetxt = "";
		public String Educationtxt = "";
		public String Sexoffendertxt = "";
		public String Committaltypetxt = "";
		public String Legalstatustxt = "";
		public String Msotxt = "";
		public String Currentstatustxt = "";
		public String Committingprisontxt = "";
		public String Lastprisontxt = "";
		public String Haircolourtxt = "";
		public String Haircolour = "";
		public String Pnoksnam = "";
		public String Pnokfnam = "";
		public String Pnokrelationship = "";
		public String Pnokadr1 = "";
		public String Pnokadr2 = "";
		public String Pnokadr3 = "";
		public String Pnokadr4 = "";
		public String Pnokcnty = "";
		public String Pnokcntry = "";
		public String Pnokph1 = "";
		public String Pnokph2 = "";
		public String Nokctytxt = "";
		public String Nokctrytxt = "";
		public String Nokrelship = "";
		public String Mainid = "";
		public String Hallcd = "";
		public String Cell = "";
		public String Hallname = "";
		public String Hallestabcd = "";
		public String Lastmovereason = "";
		public String Lastmovereasontxt = "";
		public String Movedateout = "";
		public String Estabout = "";
		public String Movetimeout = "";
		public String Att4 = "";
		public String Att5 = "";
		public String Att6 = "";
		public String Att7 = "";
		public String Att8 = "";
		
		public void clear()
		{				
			Pprisnum = "";
			Pninum = "";
			Pgcronum = "";
			Pshhdfilenum = "";
			Psex = "";
			Eestabcd = "";
			Pdbdob = "";
			P_county = "";
			P_country = "";
			Paprisaddr1 = "";
			Paprisaddr2 = "";
			Paprisaddr3 = "";
			Paprisaddr4 = "";
			Addrnum = "";
			Pnsurnam = "";
			Pnprenam1 = "";
			Pnnamtype = "";
			County = "";
			Country = "";
			Gendtxt = "";
			Tstp = "";
			Eyecolour = "";
			Complexion = "";
			Occupation = "";
			Marital = "";
			Religion = "";
			Nation = "";
			Height = "";
			Weight = "";
			Ageleftschool = "";
			Readandwrite = "";
			Education = "";
			Sexoffender = "";
			Committaltype = "";
			Legalstatus = "";
			Remanduntil = "";
			Osl = "";
			Mso = "";
			Currentstatus = "";
			Movedatein = "";
			Movetimein = "";
			Releasedate = "";
			Committingprison = "";
			Lastprison = "";
			Eyecolourtxt = "";
			Complexiontxt = "";
			Occupationtxt = "";
			Maritaltxt = "";
			Religiontxt = "";
			Nationtxt = "";
			Readandwritetxt = "";
			Educationtxt = "";
			Sexoffendertxt = "";
			Committaltypetxt = "";
			Legalstatustxt = "";
			Msotxt = "";
			Currentstatustxt = "";
			Committingprisontxt = "";
			Lastprisontxt = "";
			Haircolourtxt = "";
			Haircolour = "";
			Pnoksnam = "";
			Pnokfnam = "";
			Pnokrelationship = "";
			Pnokadr1 = "";
			Pnokadr2 = "";
			Pnokadr3 = "";
			Pnokadr4 = "";
			Pnokcnty = "";
			Pnokcntry = "";
			Pnokph1 = "";
			Pnokph2 = "";
			Nokctytxt = "";
			Nokctrytxt = "";
			Nokrelship = "";
			Mainid = "";
			Hallcd = "";
			Cell = "";
			Hallname = "";
			Hallestabcd = "";
			Lastmovereason = "";
			Lastmovereasontxt = "";
			Movedateout = "";
			Estabout = "";
			Movetimeout = "";
			Att4 = "";
			Att5 = "";
			Att6 = "";
			Att7 = "";
			Att8 = "";
		}	
		public ImsprisonerFilter cloneObject()
		{
			ImsprisonerFilter newFilter = new ImsprisonerFilter();
			
			newFilter.Pprisnum = this.Pprisnum;
			newFilter.Pninum = this.Pninum;
			newFilter.Pgcronum = this.Pgcronum;
			newFilter.Pshhdfilenum = this.Pshhdfilenum;
			newFilter.Psex = this.Psex;
			newFilter.Eestabcd = this.Eestabcd;
			newFilter.Pdbdob = this.Pdbdob;
			newFilter.P_county = this.P_county;
			newFilter.P_country = this.P_country;
			newFilter.Paprisaddr1 = this.Paprisaddr1;
			newFilter.Paprisaddr2 = this.Paprisaddr2;
			newFilter.Paprisaddr3 = this.Paprisaddr3;
			newFilter.Paprisaddr4 = this.Paprisaddr4;
			newFilter.Addrnum = this.Addrnum;
			newFilter.Pnsurnam = this.Pnsurnam;
			newFilter.Pnprenam1 = this.Pnprenam1;
			newFilter.Pnnamtype = this.Pnnamtype;
			newFilter.County = this.County;
			newFilter.Country = this.Country;
			newFilter.Gendtxt = this.Gendtxt;
			newFilter.Tstp = this.Tstp;
			newFilter.Eyecolour = this.Eyecolour;
			newFilter.Complexion = this.Complexion;
			newFilter.Occupation = this.Occupation;
			newFilter.Marital = this.Marital;
			newFilter.Religion = this.Religion;
			newFilter.Nation = this.Nation;
			newFilter.Height = this.Height;
			newFilter.Weight = this.Weight;
			newFilter.Ageleftschool = this.Ageleftschool;
			newFilter.Readandwrite = this.Readandwrite;
			newFilter.Education = this.Education;
			newFilter.Sexoffender = this.Sexoffender;
			newFilter.Committaltype = this.Committaltype;
			newFilter.Legalstatus = this.Legalstatus;
			newFilter.Remanduntil = this.Remanduntil;
			newFilter.Osl = this.Osl;
			newFilter.Mso = this.Mso;
			newFilter.Currentstatus = this.Currentstatus;
			newFilter.Movedatein = this.Movedatein;
			newFilter.Movetimein = this.Movetimein;
			newFilter.Releasedate = this.Releasedate;
			newFilter.Committingprison = this.Committingprison;
			newFilter.Lastprison = this.Lastprison;
			newFilter.Eyecolourtxt = this.Eyecolourtxt;
			newFilter.Complexiontxt = this.Complexiontxt;
			newFilter.Occupationtxt = this.Occupationtxt;
			newFilter.Maritaltxt = this.Maritaltxt;
			newFilter.Religiontxt = this.Religiontxt;
			newFilter.Nationtxt = this.Nationtxt;
			newFilter.Readandwritetxt = this.Readandwritetxt;
			newFilter.Educationtxt = this.Educationtxt;
			newFilter.Sexoffendertxt = this.Sexoffendertxt;
			newFilter.Committaltypetxt = this.Committaltypetxt;
			newFilter.Legalstatustxt = this.Legalstatustxt;
			newFilter.Msotxt = this.Msotxt;
			newFilter.Currentstatustxt = this.Currentstatustxt;
			newFilter.Committingprisontxt = this.Committingprisontxt;
			newFilter.Lastprisontxt = this.Lastprisontxt;
			newFilter.Haircolourtxt = this.Haircolourtxt;
			newFilter.Haircolour = this.Haircolour;
			newFilter.Pnoksnam = this.Pnoksnam;
			newFilter.Pnokfnam = this.Pnokfnam;
			newFilter.Pnokrelationship = this.Pnokrelationship;
			newFilter.Pnokadr1 = this.Pnokadr1;
			newFilter.Pnokadr2 = this.Pnokadr2;
			newFilter.Pnokadr3 = this.Pnokadr3;
			newFilter.Pnokadr4 = this.Pnokadr4;
			newFilter.Pnokcnty = this.Pnokcnty;
			newFilter.Pnokcntry = this.Pnokcntry;
			newFilter.Pnokph1 = this.Pnokph1;
			newFilter.Pnokph2 = this.Pnokph2;
			newFilter.Nokctytxt = this.Nokctytxt;
			newFilter.Nokctrytxt = this.Nokctrytxt;
			newFilter.Nokrelship = this.Nokrelship;
			newFilter.Mainid = this.Mainid;
			newFilter.Hallcd = this.Hallcd;
			newFilter.Cell = this.Cell;
			newFilter.Hallname = this.Hallname;
			newFilter.Hallestabcd = this.Hallestabcd;
			newFilter.Lastmovereason = this.Lastmovereason;
			newFilter.Lastmovereasontxt = this.Lastmovereasontxt;
			newFilter.Movedateout = this.Movedateout;
			newFilter.Estabout = this.Estabout;
			newFilter.Movetimeout = this.Movetimeout;
			newFilter.Att4 = this.Att4;
			newFilter.Att5 = this.Att5;
			newFilter.Att6 = this.Att6;
			newFilter.Att7 = this.Att7;
			newFilter.Att8 = this.Att8;
			
			return newFilter;
		}
	}
	public final class ImsprisonerEditFilter
	{			
		public boolean IncludePprisnum = true;
		public boolean IncludePninum = true;
		public boolean IncludePgcronum = true;
		public boolean IncludePshhdfilenum = true;
		public boolean IncludePsex = true;
		public boolean IncludeEestabcd = true;
		public boolean IncludePdbdob = true;
		public boolean IncludeP_county = true;
		public boolean IncludeP_country = true;
		public boolean IncludePaprisaddr1 = true;
		public boolean IncludePaprisaddr2 = true;
		public boolean IncludePaprisaddr3 = true;
		public boolean IncludePaprisaddr4 = true;
		public boolean IncludeAddrnum = true;
		public boolean IncludePnsurnam = true;
		public boolean IncludePnprenam1 = true;
		public boolean IncludePnnamtype = true;
		public boolean IncludeCounty = true;
		public boolean IncludeCountry = true;
		public boolean IncludeGendtxt = true;
		public boolean IncludeTstp = true;
		public boolean IncludeEyecolour = true;
		public boolean IncludeComplexion = true;
		public boolean IncludeOccupation = true;
		public boolean IncludeMarital = true;
		public boolean IncludeReligion = true;
		public boolean IncludeNation = true;
		public boolean IncludeHeight = true;
		public boolean IncludeWeight = true;
		public boolean IncludeAgeleftschool = true;
		public boolean IncludeReadandwrite = true;
		public boolean IncludeEducation = true;
		public boolean IncludeSexoffender = true;
		public boolean IncludeCommittaltype = true;
		public boolean IncludeLegalstatus = true;
		public boolean IncludeRemanduntil = true;
		public boolean IncludeOsl = true;
		public boolean IncludeMso = true;
		public boolean IncludeCurrentstatus = true;
		public boolean IncludeMovedatein = true;
		public boolean IncludeMovetimein = true;
		public boolean IncludeReleasedate = true;
		public boolean IncludeCommittingprison = true;
		public boolean IncludeLastprison = true;
		public boolean IncludeEyecolourtxt = true;
		public boolean IncludeComplexiontxt = true;
		public boolean IncludeOccupationtxt = true;
		public boolean IncludeMaritaltxt = true;
		public boolean IncludeReligiontxt = true;
		public boolean IncludeNationtxt = true;
		public boolean IncludeReadandwritetxt = true;
		public boolean IncludeEducationtxt = true;
		public boolean IncludeSexoffendertxt = true;
		public boolean IncludeCommittaltypetxt = true;
		public boolean IncludeLegalstatustxt = true;
		public boolean IncludeMsotxt = true;
		public boolean IncludeCurrentstatustxt = true;
		public boolean IncludeCommittingprisontxt = true;
		public boolean IncludeLastprisontxt = true;
		public boolean IncludeHaircolourtxt = true;
		public boolean IncludeHaircolour = true;
		public boolean IncludePnoksnam = true;
		public boolean IncludePnokfnam = true;
		public boolean IncludePnokrelationship = true;
		public boolean IncludePnokadr1 = true;
		public boolean IncludePnokadr2 = true;
		public boolean IncludePnokadr3 = true;
		public boolean IncludePnokadr4 = true;
		public boolean IncludePnokcnty = true;
		public boolean IncludePnokcntry = true;
		public boolean IncludePnokph1 = true;
		public boolean IncludePnokph2 = true;
		public boolean IncludeNokctytxt = true;
		public boolean IncludeNokctrytxt = true;
		public boolean IncludeNokrelship = true;
		public boolean IncludeMainid = true;
		public boolean IncludeHallcd = true;
		public boolean IncludeCell = true;
		public boolean IncludeHallname = true;
		public boolean IncludeHallestabcd = true;
		public boolean IncludeLastmovereason = true;
		public boolean IncludeLastmovereasontxt = true;
		public boolean IncludeMovedateout = true;
		public boolean IncludeEstabout = true;
		public boolean IncludeMovetimeout = true;
		public boolean IncludeAtt4 = true;
		public boolean IncludeAtt5 = true;
		public boolean IncludeAtt6 = true;
		public boolean IncludeAtt7 = true;
		public boolean IncludeAtt8 = true;
		
		public void includeAll()
		{				
			IncludePprisnum = true;
			IncludePninum = true;
			IncludePgcronum = true;
			IncludePshhdfilenum = true;
			IncludePsex = true;
			IncludeEestabcd = true;
			IncludePdbdob = true;
			IncludeP_county = true;
			IncludeP_country = true;
			IncludePaprisaddr1 = true;
			IncludePaprisaddr2 = true;
			IncludePaprisaddr3 = true;
			IncludePaprisaddr4 = true;
			IncludeAddrnum = true;
			IncludePnsurnam = true;
			IncludePnprenam1 = true;
			IncludePnnamtype = true;
			IncludeCounty = true;
			IncludeCountry = true;
			IncludeGendtxt = true;
			IncludeTstp = true;
			IncludeEyecolour = true;
			IncludeComplexion = true;
			IncludeOccupation = true;
			IncludeMarital = true;
			IncludeReligion = true;
			IncludeNation = true;
			IncludeHeight = true;
			IncludeWeight = true;
			IncludeAgeleftschool = true;
			IncludeReadandwrite = true;
			IncludeEducation = true;
			IncludeSexoffender = true;
			IncludeCommittaltype = true;
			IncludeLegalstatus = true;
			IncludeRemanduntil = true;
			IncludeOsl = true;
			IncludeMso = true;
			IncludeCurrentstatus = true;
			IncludeMovedatein = true;
			IncludeMovetimein = true;
			IncludeReleasedate = true;
			IncludeCommittingprison = true;
			IncludeLastprison = true;
			IncludeEyecolourtxt = true;
			IncludeComplexiontxt = true;
			IncludeOccupationtxt = true;
			IncludeMaritaltxt = true;
			IncludeReligiontxt = true;
			IncludeNationtxt = true;
			IncludeReadandwritetxt = true;
			IncludeEducationtxt = true;
			IncludeSexoffendertxt = true;
			IncludeCommittaltypetxt = true;
			IncludeLegalstatustxt = true;
			IncludeMsotxt = true;
			IncludeCurrentstatustxt = true;
			IncludeCommittingprisontxt = true;
			IncludeLastprisontxt = true;
			IncludeHaircolourtxt = true;
			IncludeHaircolour = true;
			IncludePnoksnam = true;
			IncludePnokfnam = true;
			IncludePnokrelationship = true;
			IncludePnokadr1 = true;
			IncludePnokadr2 = true;
			IncludePnokadr3 = true;
			IncludePnokadr4 = true;
			IncludePnokcnty = true;
			IncludePnokcntry = true;
			IncludePnokph1 = true;
			IncludePnokph2 = true;
			IncludeNokctytxt = true;
			IncludeNokctrytxt = true;
			IncludeNokrelship = true;
			IncludeMainid = true;
			IncludeHallcd = true;
			IncludeCell = true;
			IncludeHallname = true;
			IncludeHallestabcd = true;
			IncludeLastmovereason = true;
			IncludeLastmovereasontxt = true;
			IncludeMovedateout = true;
			IncludeEstabout = true;
			IncludeMovetimeout = true;
			IncludeAtt4 = true;
			IncludeAtt5 = true;
			IncludeAtt6 = true;
			IncludeAtt7 = true;
			IncludeAtt8 = true;
		}	
		public void excludeAll()
		{				
			IncludePprisnum = false;
			IncludePninum = false;
			IncludePgcronum = false;
			IncludePshhdfilenum = false;
			IncludePsex = false;
			IncludeEestabcd = false;
			IncludePdbdob = false;
			IncludeP_county = false;
			IncludeP_country = false;
			IncludePaprisaddr1 = false;
			IncludePaprisaddr2 = false;
			IncludePaprisaddr3 = false;
			IncludePaprisaddr4 = false;
			IncludeAddrnum = false;
			IncludePnsurnam = false;
			IncludePnprenam1 = false;
			IncludePnnamtype = false;
			IncludeCounty = false;
			IncludeCountry = false;
			IncludeGendtxt = false;
			IncludeTstp = false;
			IncludeEyecolour = false;
			IncludeComplexion = false;
			IncludeOccupation = false;
			IncludeMarital = false;
			IncludeReligion = false;
			IncludeNation = false;
			IncludeHeight = false;
			IncludeWeight = false;
			IncludeAgeleftschool = false;
			IncludeReadandwrite = false;
			IncludeEducation = false;
			IncludeSexoffender = false;
			IncludeCommittaltype = false;
			IncludeLegalstatus = false;
			IncludeRemanduntil = false;
			IncludeOsl = false;
			IncludeMso = false;
			IncludeCurrentstatus = false;
			IncludeMovedatein = false;
			IncludeMovetimein = false;
			IncludeReleasedate = false;
			IncludeCommittingprison = false;
			IncludeLastprison = false;
			IncludeEyecolourtxt = false;
			IncludeComplexiontxt = false;
			IncludeOccupationtxt = false;
			IncludeMaritaltxt = false;
			IncludeReligiontxt = false;
			IncludeNationtxt = false;
			IncludeReadandwritetxt = false;
			IncludeEducationtxt = false;
			IncludeSexoffendertxt = false;
			IncludeCommittaltypetxt = false;
			IncludeLegalstatustxt = false;
			IncludeMsotxt = false;
			IncludeCurrentstatustxt = false;
			IncludeCommittingprisontxt = false;
			IncludeLastprisontxt = false;
			IncludeHaircolourtxt = false;
			IncludeHaircolour = false;
			IncludePnoksnam = false;
			IncludePnokfnam = false;
			IncludePnokrelationship = false;
			IncludePnokadr1 = false;
			IncludePnokadr2 = false;
			IncludePnokadr3 = false;
			IncludePnokadr4 = false;
			IncludePnokcnty = false;
			IncludePnokcntry = false;
			IncludePnokph1 = false;
			IncludePnokph2 = false;
			IncludeNokctytxt = false;
			IncludeNokctrytxt = false;
			IncludeNokrelship = false;
			IncludeMainid = false;
			IncludeHallcd = false;
			IncludeCell = false;
			IncludeHallname = false;
			IncludeHallestabcd = false;
			IncludeLastmovereason = false;
			IncludeLastmovereasontxt = false;
			IncludeMovedateout = false;
			IncludeEstabout = false;
			IncludeMovetimeout = false;
			IncludeAtt4 = false;
			IncludeAtt5 = false;
			IncludeAtt6 = false;
			IncludeAtt7 = false;
			IncludeAtt8 = false;
		}
		public ImsprisonerEditFilter cloneObject()
		{
			ImsprisonerEditFilter newEditFilter = new ImsprisonerEditFilter();
			
			newEditFilter.IncludePprisnum = this.IncludePprisnum;
			newEditFilter.IncludePninum = this.IncludePninum;
			newEditFilter.IncludePgcronum = this.IncludePgcronum;
			newEditFilter.IncludePshhdfilenum = this.IncludePshhdfilenum;
			newEditFilter.IncludePsex = this.IncludePsex;
			newEditFilter.IncludeEestabcd = this.IncludeEestabcd;
			newEditFilter.IncludePdbdob = this.IncludePdbdob;
			newEditFilter.IncludeP_county = this.IncludeP_county;
			newEditFilter.IncludeP_country = this.IncludeP_country;
			newEditFilter.IncludePaprisaddr1 = this.IncludePaprisaddr1;
			newEditFilter.IncludePaprisaddr2 = this.IncludePaprisaddr2;
			newEditFilter.IncludePaprisaddr3 = this.IncludePaprisaddr3;
			newEditFilter.IncludePaprisaddr4 = this.IncludePaprisaddr4;
			newEditFilter.IncludeAddrnum = this.IncludeAddrnum;
			newEditFilter.IncludePnsurnam = this.IncludePnsurnam;
			newEditFilter.IncludePnprenam1 = this.IncludePnprenam1;
			newEditFilter.IncludePnnamtype = this.IncludePnnamtype;
			newEditFilter.IncludeCounty = this.IncludeCounty;
			newEditFilter.IncludeCountry = this.IncludeCountry;
			newEditFilter.IncludeGendtxt = this.IncludeGendtxt;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeEyecolour = this.IncludeEyecolour;
			newEditFilter.IncludeComplexion = this.IncludeComplexion;
			newEditFilter.IncludeOccupation = this.IncludeOccupation;
			newEditFilter.IncludeMarital = this.IncludeMarital;
			newEditFilter.IncludeReligion = this.IncludeReligion;
			newEditFilter.IncludeNation = this.IncludeNation;
			newEditFilter.IncludeHeight = this.IncludeHeight;
			newEditFilter.IncludeWeight = this.IncludeWeight;
			newEditFilter.IncludeAgeleftschool = this.IncludeAgeleftschool;
			newEditFilter.IncludeReadandwrite = this.IncludeReadandwrite;
			newEditFilter.IncludeEducation = this.IncludeEducation;
			newEditFilter.IncludeSexoffender = this.IncludeSexoffender;
			newEditFilter.IncludeCommittaltype = this.IncludeCommittaltype;
			newEditFilter.IncludeLegalstatus = this.IncludeLegalstatus;
			newEditFilter.IncludeRemanduntil = this.IncludeRemanduntil;
			newEditFilter.IncludeOsl = this.IncludeOsl;
			newEditFilter.IncludeMso = this.IncludeMso;
			newEditFilter.IncludeCurrentstatus = this.IncludeCurrentstatus;
			newEditFilter.IncludeMovedatein = this.IncludeMovedatein;
			newEditFilter.IncludeMovetimein = this.IncludeMovetimein;
			newEditFilter.IncludeReleasedate = this.IncludeReleasedate;
			newEditFilter.IncludeCommittingprison = this.IncludeCommittingprison;
			newEditFilter.IncludeLastprison = this.IncludeLastprison;
			newEditFilter.IncludeEyecolourtxt = this.IncludeEyecolourtxt;
			newEditFilter.IncludeComplexiontxt = this.IncludeComplexiontxt;
			newEditFilter.IncludeOccupationtxt = this.IncludeOccupationtxt;
			newEditFilter.IncludeMaritaltxt = this.IncludeMaritaltxt;
			newEditFilter.IncludeReligiontxt = this.IncludeReligiontxt;
			newEditFilter.IncludeNationtxt = this.IncludeNationtxt;
			newEditFilter.IncludeReadandwritetxt = this.IncludeReadandwritetxt;
			newEditFilter.IncludeEducationtxt = this.IncludeEducationtxt;
			newEditFilter.IncludeSexoffendertxt = this.IncludeSexoffendertxt;
			newEditFilter.IncludeCommittaltypetxt = this.IncludeCommittaltypetxt;
			newEditFilter.IncludeLegalstatustxt = this.IncludeLegalstatustxt;
			newEditFilter.IncludeMsotxt = this.IncludeMsotxt;
			newEditFilter.IncludeCurrentstatustxt = this.IncludeCurrentstatustxt;
			newEditFilter.IncludeCommittingprisontxt = this.IncludeCommittingprisontxt;
			newEditFilter.IncludeLastprisontxt = this.IncludeLastprisontxt;
			newEditFilter.IncludeHaircolourtxt = this.IncludeHaircolourtxt;
			newEditFilter.IncludeHaircolour = this.IncludeHaircolour;
			newEditFilter.IncludePnoksnam = this.IncludePnoksnam;
			newEditFilter.IncludePnokfnam = this.IncludePnokfnam;
			newEditFilter.IncludePnokrelationship = this.IncludePnokrelationship;
			newEditFilter.IncludePnokadr1 = this.IncludePnokadr1;
			newEditFilter.IncludePnokadr2 = this.IncludePnokadr2;
			newEditFilter.IncludePnokadr3 = this.IncludePnokadr3;
			newEditFilter.IncludePnokadr4 = this.IncludePnokadr4;
			newEditFilter.IncludePnokcnty = this.IncludePnokcnty;
			newEditFilter.IncludePnokcntry = this.IncludePnokcntry;
			newEditFilter.IncludePnokph1 = this.IncludePnokph1;
			newEditFilter.IncludePnokph2 = this.IncludePnokph2;
			newEditFilter.IncludeNokctytxt = this.IncludeNokctytxt;
			newEditFilter.IncludeNokctrytxt = this.IncludeNokctrytxt;
			newEditFilter.IncludeNokrelship = this.IncludeNokrelship;
			newEditFilter.IncludeMainid = this.IncludeMainid;
			newEditFilter.IncludeHallcd = this.IncludeHallcd;
			newEditFilter.IncludeCell = this.IncludeCell;
			newEditFilter.IncludeHallname = this.IncludeHallname;
			newEditFilter.IncludeHallestabcd = this.IncludeHallestabcd;
			newEditFilter.IncludeLastmovereason = this.IncludeLastmovereason;
			newEditFilter.IncludeLastmovereasontxt = this.IncludeLastmovereasontxt;
			newEditFilter.IncludeMovedateout = this.IncludeMovedateout;
			newEditFilter.IncludeEstabout = this.IncludeEstabout;
			newEditFilter.IncludeMovetimeout = this.IncludeMovetimeout;
			newEditFilter.IncludeAtt4 = this.IncludeAtt4;
			newEditFilter.IncludeAtt5 = this.IncludeAtt5;
			newEditFilter.IncludeAtt6 = this.IncludeAtt6;
			newEditFilter.IncludeAtt7 = this.IncludeAtt7;
			newEditFilter.IncludeAtt8 = this.IncludeAtt8;
			
			return newEditFilter;
		}
	}
}
