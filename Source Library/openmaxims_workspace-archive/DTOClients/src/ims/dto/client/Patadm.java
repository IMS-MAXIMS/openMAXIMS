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
// Template ver. 1.0.9 - Last modified on 20/09/2004 11:20 by Marius Mihalec

package ims.dto.client;

public final class Patadm implements ims.vo.ImsCloneable
{
	private PatadmFilter lastGetFilter = null;
	private final String serviceName = "PATADM";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public PatadmFilter Filter = new PatadmFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public PatadmEditFilter EditFilter = new PatadmEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public PatadmCollection DataCollection = new PatadmCollection();

	/**
	 * Creates a new Patadm Data Transfer Object.
	 */ 
	public Patadm(ims.dto.Connection connection)
	{	
		this.Connection = connection;
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
	public Patadm cloneObject()
	{
		Patadm cloneObject = new Patadm(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Contactno = DataCollection.get(x).Contactno;
			cloneObject.DataCollection.get(index).Atid = DataCollection.get(x).Atid;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Cons = DataCollection.get(x).Cons;
			cloneObject.DataCollection.get(index).Secons = DataCollection.get(x).Secons;
			cloneObject.DataCollection.get(index).Conss = DataCollection.get(x).Conss;
			cloneObject.DataCollection.get(index).Ward = DataCollection.get(x).Ward;
			cloneObject.DataCollection.get(index).Bedtypea = DataCollection.get(x).Bedtypea;
			cloneObject.DataCollection.get(index).Bedtyper = DataCollection.get(x).Bedtyper;
			cloneObject.DataCollection.get(index).Adate = DataCollection.get(x).Adate;
			cloneObject.DataCollection.get(index).Atime = DataCollection.get(x).Atime;
			cloneObject.DataCollection.get(index).Adsrc = DataCollection.get(x).Adsrc;
			cloneObject.DataCollection.get(index).Gpcd = DataCollection.get(x).Gpcd;
			cloneObject.DataCollection.get(index).Mcnd = DataCollection.get(x).Mcnd;
			cloneObject.DataCollection.get(index).Privtocons = DataCollection.get(x).Privtocons;
			cloneObject.DataCollection.get(index).Daycase = DataCollection.get(x).Daycase;
			cloneObject.DataCollection.get(index).Rtacontact = DataCollection.get(x).Rtacontact;
			cloneObject.DataCollection.get(index).Matcase = DataCollection.get(x).Matcase;
			cloneObject.DataCollection.get(index).Exempcode = DataCollection.get(x).Exempcode;
			cloneObject.DataCollection.get(index).Recfrom = DataCollection.get(x).Recfrom;
			cloneObject.DataCollection.get(index).Recby = DataCollection.get(x).Recby;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "10";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Patadm.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patadm.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Patadm.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patadm.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patadm.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patadm.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Patadm.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Patadm.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patadm.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Patadm.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Patadm.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Patadm.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Patadm.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Patadm.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patadm.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Patadm.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Patadm.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Patadm.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Patadm.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Patadm.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patadm.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Patadm.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Patadm.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patadm.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Patadm.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Patadm.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Patadm.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patadm.List");
							
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
	private String encodeNASFilter(PatadmFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Contactno != null && filter.Contactno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONTACTNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Contactno;
		}
		
		if(Filter.Atid != null && filter.Atid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ATID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Atid;
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey;
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
		
		if(Filter.Cons != null && filter.Cons.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cons;
		}
		
		if(Filter.Secons != null && filter.Secons.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SECONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Secons;
		}
		
		if(Filter.Conss != null && filter.Conss.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONSS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Conss;
		}
		
		if(Filter.Ward != null && filter.Ward.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WARD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ward;
		}
		
		if(Filter.Bedtypea != null && filter.Bedtypea.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BEDTYPEA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Bedtypea;
		}
		
		if(Filter.Bedtyper != null && filter.Bedtyper.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BEDTYPER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Bedtyper;
		}
		
		if(Filter.Adate != null && filter.Adate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adate;
		}
		
		if(Filter.Atime != null && filter.Atime.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ATIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Atime;
		}
		
		if(Filter.Adsrc != null && filter.Adsrc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADSRC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adsrc;
		}
		
		if(Filter.Gpcd != null && filter.Gpcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpcd;
		}
		
		if(Filter.Mcnd != null && filter.Mcnd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MCND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mcnd;
		}
		
		if(Filter.Privtocons != null && filter.Privtocons.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PRIVTOCONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Privtocons;
		}
		
		if(Filter.Daycase != null && filter.Daycase.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DAYCASE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Daycase;
		}
		
		if(Filter.Rtacontact != null && filter.Rtacontact.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RTACONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rtacontact;
		}
		
		if(Filter.Matcase != null && filter.Matcase.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MATCASE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Matcase;
		}
		
		if(Filter.Exempcode != null && filter.Exempcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EXEMPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Exempcode;
		}
		
		if(Filter.Recfrom != null && filter.Recfrom.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RECFROM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Recfrom;
		}
		
		if(Filter.Recby != null && filter.Recby.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RECBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Recby;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		PatadmRecord data = (PatadmRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeContactno)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONTACTNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Contactno);
		}
		
		if(EditFilter.IncludeAtid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ATID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Atid);
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
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
		
		if(EditFilter.IncludeCons)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cons);
		}
		
		if(EditFilter.IncludeSecons)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SECONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Secons);
		}
		
		if(EditFilter.IncludeConss)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONSS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Conss);
		}
		
		if(EditFilter.IncludeWard)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "WARD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ward);
		}
		
		if(EditFilter.IncludeBedtypea)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BEDTYPEA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Bedtypea);
		}
		
		if(EditFilter.IncludeBedtyper)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BEDTYPER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Bedtyper);
		}
		
		if(EditFilter.IncludeAdate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adate);
		}
		
		if(EditFilter.IncludeAtime)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ATIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Atime);
		}
		
		if(EditFilter.IncludeAdsrc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADSRC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adsrc);
		}
		
		if(EditFilter.IncludeGpcd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "GPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpcd);
		}
		
		if(EditFilter.IncludeMcnd)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MCND" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mcnd);
		}
		
		if(EditFilter.IncludePrivtocons)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PRIVTOCONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Privtocons);
		}
		
		if(EditFilter.IncludeDaycase)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DAYCASE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Daycase);
		}
		
		if(EditFilter.IncludeRtacontact)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RTACONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rtacontact);
		}
		
		if(EditFilter.IncludeMatcase)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MATCASE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Matcase);
		}
		
		if(EditFilter.IncludeExempcode)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EXEMPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Exempcode);
		}
		
		if(EditFilter.IncludeRecfrom)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RECFROM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Recfrom);
		}
		
		if(EditFilter.IncludeRecby)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RECBY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Recby);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum);
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
			PatadmRecord record = new PatadmRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Contactno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTACTNO"));
			record.Atid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Cons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONS"));
			record.Secons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SECONS"));
			record.Conss = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONSS"));
			record.Ward = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WARD"));
			record.Bedtypea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BEDTYPEA"));
			record.Bedtyper = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BEDTYPER"));
			record.Adate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADATE"));
			record.Atime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATIME"));
			record.Adsrc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSRC"));
			record.Gpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCD"));
			record.Mcnd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MCND"));
			record.Privtocons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRIVTOCONS"));
			record.Daycase = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DAYCASE"));
			record.Rtacontact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTACONTACT"));
			record.Matcase = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MATCASE"));
			record.Exempcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXEMPCODE"));
			record.Recfrom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RECFROM"));
			record.Recby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RECBY"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
									
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
			PatadmRecord record = new PatadmRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Contactno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTACTNO"));
			record.Atid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Cons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONS"));
			record.Secons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SECONS"));
			record.Conss = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONSS"));
			record.Ward = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WARD"));
			record.Bedtypea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BEDTYPEA"));
			record.Bedtyper = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BEDTYPER"));
			record.Adate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADATE"));
			record.Atime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATIME"));
			record.Adsrc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSRC"));
			record.Gpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCD"));
			record.Mcnd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MCND"));
			record.Privtocons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRIVTOCONS"));
			record.Daycase = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DAYCASE"));
			record.Rtacontact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTACONTACT"));
			record.Matcase = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MATCASE"));
			record.Exempcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXEMPCODE"));
			record.Recfrom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RECFROM"));
			record.Recby = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RECBY"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class PatadmCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			PatadmRecord newRecord = new PatadmRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(PatadmRecord record)
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
		public PatadmRecord get(int index)
		{
			return (PatadmRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class PatadmRecord
	{
		public String Contactno = "";
		public String Atid = "";
		public String Pkey = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Cons = "";
		public String Secons = "";
		public String Conss = "";
		public String Ward = "";
		public String Bedtypea = "";
		public String Bedtyper = "";
		public String Adate = "";
		public String Atime = "";
		public String Adsrc = "";
		public String Gpcd = "";
		public String Mcnd = "";
		public String Privtocons = "";
		public String Daycase = "";
		public String Rtacontact = "";
		public String Matcase = "";
		public String Exempcode = "";
		public String Recfrom = "";
		public String Recby = "";
		public String Tstp = "";
		public String Hospnum = "";
				
		
		public void clear()
		{
			Contactno = "";
			Atid = "";
			Pkey = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Cons = "";
			Secons = "";
			Conss = "";
			Ward = "";
			Bedtypea = "";
			Bedtyper = "";
			Adate = "";
			Atime = "";
			Adsrc = "";
			Gpcd = "";
			Mcnd = "";
			Privtocons = "";
			Daycase = "";
			Rtacontact = "";
			Matcase = "";
			Exempcode = "";
			Recfrom = "";
			Recby = "";
			Tstp = "";
			Hospnum = "";
			
		}		
	}
		
		
	public final class PatadmFilter
	{			
		public String Contactno = "";
		public String Atid = "";
		public String Pkey = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Cons = "";
		public String Secons = "";
		public String Conss = "";
		public String Ward = "";
		public String Bedtypea = "";
		public String Bedtyper = "";
		public String Adate = "";
		public String Atime = "";
		public String Adsrc = "";
		public String Gpcd = "";
		public String Mcnd = "";
		public String Privtocons = "";
		public String Daycase = "";
		public String Rtacontact = "";
		public String Matcase = "";
		public String Exempcode = "";
		public String Recfrom = "";
		public String Recby = "";
		public String Tstp = "";
		public String Hospnum = "";
		
		public void clear()
		{				
			Contactno = "";
			Atid = "";
			Pkey = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Cons = "";
			Secons = "";
			Conss = "";
			Ward = "";
			Bedtypea = "";
			Bedtyper = "";
			Adate = "";
			Atime = "";
			Adsrc = "";
			Gpcd = "";
			Mcnd = "";
			Privtocons = "";
			Daycase = "";
			Rtacontact = "";
			Matcase = "";
			Exempcode = "";
			Recfrom = "";
			Recby = "";
			Tstp = "";
			Hospnum = "";
		}	
		public PatadmFilter cloneObject()
		{
			PatadmFilter newFilter = new PatadmFilter();
			
			newFilter.Contactno = this.Contactno;
			newFilter.Atid = this.Atid;
			newFilter.Pkey = this.Pkey;
			newFilter.Rusr = this.Rusr;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Cons = this.Cons;
			newFilter.Secons = this.Secons;
			newFilter.Conss = this.Conss;
			newFilter.Ward = this.Ward;
			newFilter.Bedtypea = this.Bedtypea;
			newFilter.Bedtyper = this.Bedtyper;
			newFilter.Adate = this.Adate;
			newFilter.Atime = this.Atime;
			newFilter.Adsrc = this.Adsrc;
			newFilter.Gpcd = this.Gpcd;
			newFilter.Mcnd = this.Mcnd;
			newFilter.Privtocons = this.Privtocons;
			newFilter.Daycase = this.Daycase;
			newFilter.Rtacontact = this.Rtacontact;
			newFilter.Matcase = this.Matcase;
			newFilter.Exempcode = this.Exempcode;
			newFilter.Recfrom = this.Recfrom;
			newFilter.Recby = this.Recby;
			newFilter.Tstp = this.Tstp;
			newFilter.Hospnum = this.Hospnum;
			
			return newFilter;
		}
	}
	public final class PatadmEditFilter
	{			
		public boolean IncludeContactno = true;
		public boolean IncludeAtid = true;
		public boolean IncludePkey = true;
		public boolean IncludeRusr = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeCons = true;
		public boolean IncludeSecons = true;
		public boolean IncludeConss = true;
		public boolean IncludeWard = true;
		public boolean IncludeBedtypea = true;
		public boolean IncludeBedtyper = true;
		public boolean IncludeAdate = true;
		public boolean IncludeAtime = true;
		public boolean IncludeAdsrc = true;
		public boolean IncludeGpcd = true;
		public boolean IncludeMcnd = true;
		public boolean IncludePrivtocons = true;
		public boolean IncludeDaycase = true;
		public boolean IncludeRtacontact = true;
		public boolean IncludeMatcase = true;
		public boolean IncludeExempcode = true;
		public boolean IncludeRecfrom = true;
		public boolean IncludeRecby = true;
		public boolean IncludeTstp = true;
		public boolean IncludeHospnum = true;
		
		public void includeAll()
		{				
			IncludeContactno = true;
			IncludeAtid = true;
			IncludePkey = true;
			IncludeRusr = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeCons = true;
			IncludeSecons = true;
			IncludeConss = true;
			IncludeWard = true;
			IncludeBedtypea = true;
			IncludeBedtyper = true;
			IncludeAdate = true;
			IncludeAtime = true;
			IncludeAdsrc = true;
			IncludeGpcd = true;
			IncludeMcnd = true;
			IncludePrivtocons = true;
			IncludeDaycase = true;
			IncludeRtacontact = true;
			IncludeMatcase = true;
			IncludeExempcode = true;
			IncludeRecfrom = true;
			IncludeRecby = true;
			IncludeTstp = true;
			IncludeHospnum = true;
		}	
		public void excludeAll()
		{				
			IncludeContactno = false;
			IncludeAtid = false;
			IncludePkey = false;
			IncludeRusr = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeCons = false;
			IncludeSecons = false;
			IncludeConss = false;
			IncludeWard = false;
			IncludeBedtypea = false;
			IncludeBedtyper = false;
			IncludeAdate = false;
			IncludeAtime = false;
			IncludeAdsrc = false;
			IncludeGpcd = false;
			IncludeMcnd = false;
			IncludePrivtocons = false;
			IncludeDaycase = false;
			IncludeRtacontact = false;
			IncludeMatcase = false;
			IncludeExempcode = false;
			IncludeRecfrom = false;
			IncludeRecby = false;
			IncludeTstp = false;
			IncludeHospnum = false;
		}
		public PatadmEditFilter cloneObject()
		{
			PatadmEditFilter newEditFilter = new PatadmEditFilter();
			
			newEditFilter.IncludeContactno = this.IncludeContactno;
			newEditFilter.IncludeAtid = this.IncludeAtid;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeCons = this.IncludeCons;
			newEditFilter.IncludeSecons = this.IncludeSecons;
			newEditFilter.IncludeConss = this.IncludeConss;
			newEditFilter.IncludeWard = this.IncludeWard;
			newEditFilter.IncludeBedtypea = this.IncludeBedtypea;
			newEditFilter.IncludeBedtyper = this.IncludeBedtyper;
			newEditFilter.IncludeAdate = this.IncludeAdate;
			newEditFilter.IncludeAtime = this.IncludeAtime;
			newEditFilter.IncludeAdsrc = this.IncludeAdsrc;
			newEditFilter.IncludeGpcd = this.IncludeGpcd;
			newEditFilter.IncludeMcnd = this.IncludeMcnd;
			newEditFilter.IncludePrivtocons = this.IncludePrivtocons;
			newEditFilter.IncludeDaycase = this.IncludeDaycase;
			newEditFilter.IncludeRtacontact = this.IncludeRtacontact;
			newEditFilter.IncludeMatcase = this.IncludeMatcase;
			newEditFilter.IncludeExempcode = this.IncludeExempcode;
			newEditFilter.IncludeRecfrom = this.IncludeRecfrom;
			newEditFilter.IncludeRecby = this.IncludeRecby;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			
			return newEditFilter;
		}
	}
}
