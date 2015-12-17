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

public final class Inp
{
	private InpFilter lastGetFilter = null;
	private final String serviceName = "INP";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public InpFilter Filter = new InpFilter();			
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public InpCollection DataCollection = new InpCollection();

	/**
	 * Creates a new Inp Data Transfer Object.
	 */ 
	public Inp(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Inp cloneObject() throws ims.dto.Exception
	{
		Inp cloneObject = new Inp(Connection);
			
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
			cloneObject.DataCollection.get(index).Epid = DataCollection.get(x).Epid;
			cloneObject.DataCollection.get(index).Scep = DataCollection.get(x).Scep;
			cloneObject.DataCollection.get(index).Scsq = DataCollection.get(x).Scsq;
			cloneObject.DataCollection.get(index).Rect = DataCollection.get(x).Rect;
			cloneObject.DataCollection.get(index).Addt = DataCollection.get(x).Addt;
			cloneObject.DataCollection.get(index).Adtm = DataCollection.get(x).Adtm;
			cloneObject.DataCollection.get(index).Admt = DataCollection.get(x).Admt;
			cloneObject.DataCollection.get(index).Pflg = DataCollection.get(x).Pflg;
			cloneObject.DataCollection.get(index).Unit = DataCollection.get(x).Unit;
			cloneObject.DataCollection.get(index).Ward = DataCollection.get(x).Ward;
			cloneObject.DataCollection.get(index).Adhp = DataCollection.get(x).Adhp;
			cloneObject.DataCollection.get(index).Adsc = DataCollection.get(x).Adsc;
			cloneObject.DataCollection.get(index).Comm = DataCollection.get(x).Comm;
			cloneObject.DataCollection.get(index).Spcd = DataCollection.get(x).Spcd;
			cloneObject.DataCollection.get(index).Cons = DataCollection.get(x).Cons;
			cloneObject.DataCollection.get(index).Refr = DataCollection.get(x).Refr;
			cloneObject.DataCollection.get(index).Rfcd = DataCollection.get(x).Rfcd;
			cloneObject.DataCollection.get(index).Prop = DataCollection.get(x).Prop;
			cloneObject.DataCollection.get(index).Sop1 = DataCollection.get(x).Sop1;
			cloneObject.DataCollection.get(index).Sop2 = DataCollection.get(x).Sop2;
			cloneObject.DataCollection.get(index).Sop3 = DataCollection.get(x).Sop3;
			cloneObject.DataCollection.get(index).Propdesc = DataCollection.get(x).Propdesc;
			cloneObject.DataCollection.get(index).Sop1desc = DataCollection.get(x).Sop1desc;
			cloneObject.DataCollection.get(index).Sop2desc = DataCollection.get(x).Sop2desc;
			cloneObject.DataCollection.get(index).Sop3desc = DataCollection.get(x).Sop3desc;
			cloneObject.DataCollection.get(index).Opsg = DataCollection.get(x).Opsg;
			cloneObject.DataCollection.get(index).Oplc = DataCollection.get(x).Oplc;
			cloneObject.DataCollection.get(index).Wkey = DataCollection.get(x).Wkey;
			cloneObject.DataCollection.get(index).Wlst = DataCollection.get(x).Wlst;
			cloneObject.DataCollection.get(index).Prdi = DataCollection.get(x).Prdi;
			cloneObject.DataCollection.get(index).Admttxt = DataCollection.get(x).Admttxt;
			cloneObject.DataCollection.get(index).Unittxt = DataCollection.get(x).Unittxt;
			cloneObject.DataCollection.get(index).Wardtxt = DataCollection.get(x).Wardtxt;
			cloneObject.DataCollection.get(index).Adhptxt = DataCollection.get(x).Adhptxt;
			cloneObject.DataCollection.get(index).Adsctxt = DataCollection.get(x).Adsctxt;
			cloneObject.DataCollection.get(index).Spcdtxt = DataCollection.get(x).Spcdtxt;
			cloneObject.DataCollection.get(index).Constxt = DataCollection.get(x).Constxt;
			cloneObject.DataCollection.get(index).Refrtxt = DataCollection.get(x).Refrtxt;
			cloneObject.DataCollection.get(index).Rfcdtxt = DataCollection.get(x).Rfcdtxt;
			cloneObject.DataCollection.get(index).Proptxt = DataCollection.get(x).Proptxt;
			cloneObject.DataCollection.get(index).Sop1txt = DataCollection.get(x).Sop1txt;
			cloneObject.DataCollection.get(index).Sop2txt = DataCollection.get(x).Sop2txt;
			cloneObject.DataCollection.get(index).Sop3txt = DataCollection.get(x).Sop3txt;
			cloneObject.DataCollection.get(index).Opsgtxt = DataCollection.get(x).Opsgtxt;
			cloneObject.DataCollection.get(index).Oplctxt = DataCollection.get(x).Oplctxt;
			cloneObject.DataCollection.get(index).Wkeytxt = DataCollection.get(x).Wkeytxt;
			cloneObject.DataCollection.get(index).Snm = DataCollection.get(x).Snm;
			cloneObject.DataCollection.get(index).Nmtype = DataCollection.get(x).Nmtype;
			cloneObject.DataCollection.get(index).Fnm = DataCollection.get(x).Fnm;
			cloneObject.DataCollection.get(index).Sex = DataCollection.get(x).Sex;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Sextxt = DataCollection.get(x).Sextxt;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Patstat = DataCollection.get(x).Patstat;
							
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inp.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Inp.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inp.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inp.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inp.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Inp.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Inp.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inp.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Inp.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Inp.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Inp.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Inp.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Inp.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inp.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Inp.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Inp.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Inp.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Inp.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Inp.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inp.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Inp.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Inp.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inp.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Inp.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Inp.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Inp.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inp.List");
							
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
	private String encodeNASFilter(InpFilter filter)
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
		
		if(Filter.Epid != null && filter.Epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Epid;
		}
		
		if(Filter.Scep != null && filter.Scep.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SCEP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Scep;
		}
		
		if(Filter.Scsq != null && filter.Scsq.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SCSQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Scsq;
		}
		
		if(Filter.Rect != null && filter.Rect.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RECT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rect;
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
		
		if(Filter.Admt != null && filter.Admt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADMT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Admt;
		}
		
		if(Filter.Pflg != null && filter.Pflg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PFLG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pflg;
		}
		
		if(Filter.Unit != null && filter.Unit.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Unit;
		}
		
		if(Filter.Ward != null && filter.Ward.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WARD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ward;
		}
		
		if(Filter.Adhp != null && filter.Adhp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADHP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adhp;
		}
		
		if(Filter.Adsc != null && filter.Adsc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADSC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adsc;
		}
		
		if(Filter.Comm != null && filter.Comm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Comm;
		}
		
		if(Filter.Spcd != null && filter.Spcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spcd;
		}
		
		if(Filter.Cons != null && filter.Cons.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cons;
		}
		
		if(Filter.Refr != null && filter.Refr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refr;
		}
		
		if(Filter.Rfcd != null && filter.Rfcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RFCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rfcd;
		}
		
		if(Filter.Prop != null && filter.Prop.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PROP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prop;
		}
		
		if(Filter.Sop1 != null && filter.Sop1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SOP1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sop1;
		}
		
		if(Filter.Sop2 != null && filter.Sop2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SOP2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sop2;
		}
		
		if(Filter.Sop3 != null && filter.Sop3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SOP3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sop3;
		}
		
		if(Filter.Propdesc != null && filter.Propdesc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PROPDESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Propdesc;
		}
		
		if(Filter.Sop1desc != null && filter.Sop1desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SOP1DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sop1desc;
		}
		
		if(Filter.Sop2desc != null && filter.Sop2desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SOP2DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sop2desc;
		}
		
		if(Filter.Sop3desc != null && filter.Sop3desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SOP3DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sop3desc;
		}
		
		if(Filter.Opsg != null && filter.Opsg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OPSG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Opsg;
		}
		
		if(Filter.Oplc != null && filter.Oplc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OPLC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Oplc;
		}
		
		if(Filter.Wkey != null && filter.Wkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wkey;
		}
		
		if(Filter.Wlst != null && filter.Wlst.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WLST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wlst;
		}
		
		if(Filter.Prdi != null && filter.Prdi.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PRDI" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prdi;
		}
		
		if(Filter.Admttxt != null && filter.Admttxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADMTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Admttxt;
		}
		
		if(Filter.Unittxt != null && filter.Unittxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UNITTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Unittxt;
		}
		
		if(Filter.Wardtxt != null && filter.Wardtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WARDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wardtxt;
		}
		
		if(Filter.Adhptxt != null && filter.Adhptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADHPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adhptxt;
		}
		
		if(Filter.Adsctxt != null && filter.Adsctxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADSCTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adsctxt;
		}
		
		if(Filter.Spcdtxt != null && filter.Spcdtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPCDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spcdtxt;
		}
		
		if(Filter.Constxt != null && filter.Constxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Constxt;
		}
		
		if(Filter.Refrtxt != null && filter.Refrtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refrtxt;
		}
		
		if(Filter.Rfcdtxt != null && filter.Rfcdtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RFCDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rfcdtxt;
		}
		
		if(Filter.Proptxt != null && filter.Proptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PROPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Proptxt;
		}
		
		if(Filter.Sop1txt != null && filter.Sop1txt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SOP1TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sop1txt;
		}
		
		if(Filter.Sop2txt != null && filter.Sop2txt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SOP2TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sop2txt;
		}
		
		if(Filter.Sop3txt != null && filter.Sop3txt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SOP3TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sop3txt;
		}
		
		if(Filter.Opsgtxt != null && filter.Opsgtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OPSGTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Opsgtxt;
		}
		
		if(Filter.Oplctxt != null && filter.Oplctxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "OPLCTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Oplctxt;
		}
		
		if(Filter.Wkeytxt != null && filter.Wkeytxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "WKEYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wkeytxt;
		}
		
		if(Filter.Snm != null && filter.Snm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Snm;
		}
		
		if(Filter.Nmtype != null && filter.Nmtype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NMTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nmtype;
		}
		
		if(Filter.Fnm != null && filter.Fnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fnm;
		}
		
		if(Filter.Sex != null && filter.Sex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sex;
		}
		
		if(Filter.Dob != null && filter.Dob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dob;
		}
		
		if(Filter.Sextxt != null && filter.Sextxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SEXTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sextxt;
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum;
		}
		
		if(Filter.Patstat != null && filter.Patstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PATSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Patstat;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		InpRecord data = (InpRecord)DataCollection.get(0);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Epid);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SCEP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Scep);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SCSQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Scsq);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RECT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rect);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Addt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adtm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADMT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Admt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PFLG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pflg);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "UNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unit);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "WARD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ward);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADHP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adhp);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADSC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adsc);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Comm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spcd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "CONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cons);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "REFR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refr);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RFCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rfcd);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PROP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prop);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SOP1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sop1);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SOP2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sop2);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SOP3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sop3);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PROPDESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Propdesc);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SOP1DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sop1desc);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SOP2DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sop2desc);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SOP3DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sop3desc);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "OPSG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Opsg);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "OPLC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Oplc);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "WKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wkey);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "WLST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wlst);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PRDI" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prdi);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADMTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Admttxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "UNITTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unittxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "WARDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wardtxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADHPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adhptxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "ADSCTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adsctxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SPCDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spcdtxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "CONSTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Constxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "REFRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refrtxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "RFCDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rfcdtxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PROPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Proptxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SOP1TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sop1txt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SOP2TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sop2txt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SOP3TXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sop3txt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "OPSGTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Opsgtxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "OPLCTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Oplctxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "WKEYTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wkeytxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Snm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "NMTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nmtype);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "FNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fnm);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sex);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dob);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "SEXTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sextxt);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum);
		
		if(dataString.length() > 0)
			dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
		dataString += "PATSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Patstat);
		
		
			
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
			InpRecord record = new InpRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPID"));
			record.Scep = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCEP"));
			record.Scsq = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCSQ"));
			record.Rect = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RECT"));
			record.Addt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDT"));
			record.Adtm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADTM"));
			record.Admt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMT"));
			record.Pflg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PFLG"));
			record.Unit = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNIT"));
			record.Ward = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WARD"));
			record.Adhp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADHP"));
			record.Adsc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSC"));
			record.Comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMM"));
			record.Spcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCD"));
			record.Cons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONS"));
			record.Refr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFR"));
			record.Rfcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFCD"));
			record.Prop = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROP"));
			record.Sop1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP1"));
			record.Sop2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP2"));
			record.Sop3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP3"));
			record.Propdesc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROPDESC"));
			record.Sop1desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP1DESC"));
			record.Sop2desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP2DESC"));
			record.Sop3desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP3DESC"));
			record.Opsg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPSG"));
			record.Oplc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPLC"));
			record.Wkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WKEY"));
			record.Wlst = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WLST"));
			record.Prdi = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRDI"));
			record.Admttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMTTXT"));
			record.Unittxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNITTXT"));
			record.Wardtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WARDTXT"));
			record.Adhptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADHPTXT"));
			record.Adsctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSCTXT"));
			record.Spcdtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCDTXT"));
			record.Constxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONSTXT"));
			record.Refrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFRTXT"));
			record.Rfcdtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFCDTXT"));
			record.Proptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROPTXT"));
			record.Sop1txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP1TXT"));
			record.Sop2txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP2TXT"));
			record.Sop3txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP3TXT"));
			record.Opsgtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPSGTXT"));
			record.Oplctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPLCTXT"));
			record.Wkeytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WKEYTXT"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Nmtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NMTYPE"));
			record.Fnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sextxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEXTXT"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Patstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATSTAT"));
									
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
			InpRecord record = new InpRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPID"));
			record.Scep = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCEP"));
			record.Scsq = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCSQ"));
			record.Rect = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RECT"));
			record.Addt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDT"));
			record.Adtm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADTM"));
			record.Admt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMT"));
			record.Pflg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PFLG"));
			record.Unit = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNIT"));
			record.Ward = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WARD"));
			record.Adhp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADHP"));
			record.Adsc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSC"));
			record.Comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMM"));
			record.Spcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCD"));
			record.Cons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONS"));
			record.Refr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFR"));
			record.Rfcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFCD"));
			record.Prop = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROP"));
			record.Sop1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP1"));
			record.Sop2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP2"));
			record.Sop3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP3"));
			record.Propdesc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROPDESC"));
			record.Sop1desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP1DESC"));
			record.Sop2desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP2DESC"));
			record.Sop3desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP3DESC"));
			record.Opsg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPSG"));
			record.Oplc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPLC"));
			record.Wkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WKEY"));
			record.Wlst = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WLST"));
			record.Prdi = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRDI"));
			record.Admttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMTTXT"));
			record.Unittxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNITTXT"));
			record.Wardtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WARDTXT"));
			record.Adhptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADHPTXT"));
			record.Adsctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSCTXT"));
			record.Spcdtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCDTXT"));
			record.Constxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONSTXT"));
			record.Refrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFRTXT"));
			record.Rfcdtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFCDTXT"));
			record.Proptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PROPTXT"));
			record.Sop1txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP1TXT"));
			record.Sop2txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP2TXT"));
			record.Sop3txt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOP3TXT"));
			record.Opsgtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPSGTXT"));
			record.Oplctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OPLCTXT"));
			record.Wkeytxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WKEYTXT"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Nmtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NMTYPE"));
			record.Fnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sextxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEXTXT"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Patstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATSTAT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class InpCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			InpRecord newRecord = new InpRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(InpRecord record)
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
		public InpRecord get(int index)
		{
			return (InpRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class InpRecord
	{
		public String Pkey = "";
		public String Epid = "";
		public String Scep = "";
		public String Scsq = "";
		public String Rect = "";
		public String Addt = "";
		public String Adtm = "";
		public String Admt = "";
		public String Pflg = "";
		public String Unit = "";
		public String Ward = "";
		public String Adhp = "";
		public String Adsc = "";
		public String Comm = "";
		public String Spcd = "";
		public String Cons = "";
		public String Refr = "";
		public String Rfcd = "";
		public String Prop = "";
		public String Sop1 = "";
		public String Sop2 = "";
		public String Sop3 = "";
		public String Propdesc = "";
		public String Sop1desc = "";
		public String Sop2desc = "";
		public String Sop3desc = "";
		public String Opsg = "";
		public String Oplc = "";
		public String Wkey = "";
		public String Wlst = "";
		public String Prdi = "";
		public String Admttxt = "";
		public String Unittxt = "";
		public String Wardtxt = "";
		public String Adhptxt = "";
		public String Adsctxt = "";
		public String Spcdtxt = "";
		public String Constxt = "";
		public String Refrtxt = "";
		public String Rfcdtxt = "";
		public String Proptxt = "";
		public String Sop1txt = "";
		public String Sop2txt = "";
		public String Sop3txt = "";
		public String Opsgtxt = "";
		public String Oplctxt = "";
		public String Wkeytxt = "";
		public String Snm = "";
		public String Nmtype = "";
		public String Fnm = "";
		public String Sex = "";
		public String Dob = "";
		public String Sextxt = "";
		public String Hospnum = "";
		public String Patstat = "";
				
		
		public void clear()
		{
			Pkey = "";
			Epid = "";
			Scep = "";
			Scsq = "";
			Rect = "";
			Addt = "";
			Adtm = "";
			Admt = "";
			Pflg = "";
			Unit = "";
			Ward = "";
			Adhp = "";
			Adsc = "";
			Comm = "";
			Spcd = "";
			Cons = "";
			Refr = "";
			Rfcd = "";
			Prop = "";
			Sop1 = "";
			Sop2 = "";
			Sop3 = "";
			Propdesc = "";
			Sop1desc = "";
			Sop2desc = "";
			Sop3desc = "";
			Opsg = "";
			Oplc = "";
			Wkey = "";
			Wlst = "";
			Prdi = "";
			Admttxt = "";
			Unittxt = "";
			Wardtxt = "";
			Adhptxt = "";
			Adsctxt = "";
			Spcdtxt = "";
			Constxt = "";
			Refrtxt = "";
			Rfcdtxt = "";
			Proptxt = "";
			Sop1txt = "";
			Sop2txt = "";
			Sop3txt = "";
			Opsgtxt = "";
			Oplctxt = "";
			Wkeytxt = "";
			Snm = "";
			Nmtype = "";
			Fnm = "";
			Sex = "";
			Dob = "";
			Sextxt = "";
			Hospnum = "";
			Patstat = "";
			
		}		
	}
		
		
	public final class InpFilter
	{			
		public String Pkey = "";
		public String Epid = "";
		public String Scep = "";
		public String Scsq = "";
		public String Rect = "";
		public String Addt = "";
		public String Adtm = "";
		public String Admt = "";
		public String Pflg = "";
		public String Unit = "";
		public String Ward = "";
		public String Adhp = "";
		public String Adsc = "";
		public String Comm = "";
		public String Spcd = "";
		public String Cons = "";
		public String Refr = "";
		public String Rfcd = "";
		public String Prop = "";
		public String Sop1 = "";
		public String Sop2 = "";
		public String Sop3 = "";
		public String Propdesc = "";
		public String Sop1desc = "";
		public String Sop2desc = "";
		public String Sop3desc = "";
		public String Opsg = "";
		public String Oplc = "";
		public String Wkey = "";
		public String Wlst = "";
		public String Prdi = "";
		public String Admttxt = "";
		public String Unittxt = "";
		public String Wardtxt = "";
		public String Adhptxt = "";
		public String Adsctxt = "";
		public String Spcdtxt = "";
		public String Constxt = "";
		public String Refrtxt = "";
		public String Rfcdtxt = "";
		public String Proptxt = "";
		public String Sop1txt = "";
		public String Sop2txt = "";
		public String Sop3txt = "";
		public String Opsgtxt = "";
		public String Oplctxt = "";
		public String Wkeytxt = "";
		public String Snm = "";
		public String Nmtype = "";
		public String Fnm = "";
		public String Sex = "";
		public String Dob = "";
		public String Sextxt = "";
		public String Hospnum = "";
		public String Patstat = "";
		
		public void clear()
		{				
			Pkey = "";
			Epid = "";
			Scep = "";
			Scsq = "";
			Rect = "";
			Addt = "";
			Adtm = "";
			Admt = "";
			Pflg = "";
			Unit = "";
			Ward = "";
			Adhp = "";
			Adsc = "";
			Comm = "";
			Spcd = "";
			Cons = "";
			Refr = "";
			Rfcd = "";
			Prop = "";
			Sop1 = "";
			Sop2 = "";
			Sop3 = "";
			Propdesc = "";
			Sop1desc = "";
			Sop2desc = "";
			Sop3desc = "";
			Opsg = "";
			Oplc = "";
			Wkey = "";
			Wlst = "";
			Prdi = "";
			Admttxt = "";
			Unittxt = "";
			Wardtxt = "";
			Adhptxt = "";
			Adsctxt = "";
			Spcdtxt = "";
			Constxt = "";
			Refrtxt = "";
			Rfcdtxt = "";
			Proptxt = "";
			Sop1txt = "";
			Sop2txt = "";
			Sop3txt = "";
			Opsgtxt = "";
			Oplctxt = "";
			Wkeytxt = "";
			Snm = "";
			Nmtype = "";
			Fnm = "";
			Sex = "";
			Dob = "";
			Sextxt = "";
			Hospnum = "";
			Patstat = "";
		}	
		public InpFilter cloneObject()
		{
			InpFilter newFilter = new InpFilter();
			
			newFilter.Pkey = this.Pkey;
			newFilter.Epid = this.Epid;
			newFilter.Scep = this.Scep;
			newFilter.Scsq = this.Scsq;
			newFilter.Rect = this.Rect;
			newFilter.Addt = this.Addt;
			newFilter.Adtm = this.Adtm;
			newFilter.Admt = this.Admt;
			newFilter.Pflg = this.Pflg;
			newFilter.Unit = this.Unit;
			newFilter.Ward = this.Ward;
			newFilter.Adhp = this.Adhp;
			newFilter.Adsc = this.Adsc;
			newFilter.Comm = this.Comm;
			newFilter.Spcd = this.Spcd;
			newFilter.Cons = this.Cons;
			newFilter.Refr = this.Refr;
			newFilter.Rfcd = this.Rfcd;
			newFilter.Prop = this.Prop;
			newFilter.Sop1 = this.Sop1;
			newFilter.Sop2 = this.Sop2;
			newFilter.Sop3 = this.Sop3;
			newFilter.Propdesc = this.Propdesc;
			newFilter.Sop1desc = this.Sop1desc;
			newFilter.Sop2desc = this.Sop2desc;
			newFilter.Sop3desc = this.Sop3desc;
			newFilter.Opsg = this.Opsg;
			newFilter.Oplc = this.Oplc;
			newFilter.Wkey = this.Wkey;
			newFilter.Wlst = this.Wlst;
			newFilter.Prdi = this.Prdi;
			newFilter.Admttxt = this.Admttxt;
			newFilter.Unittxt = this.Unittxt;
			newFilter.Wardtxt = this.Wardtxt;
			newFilter.Adhptxt = this.Adhptxt;
			newFilter.Adsctxt = this.Adsctxt;
			newFilter.Spcdtxt = this.Spcdtxt;
			newFilter.Constxt = this.Constxt;
			newFilter.Refrtxt = this.Refrtxt;
			newFilter.Rfcdtxt = this.Rfcdtxt;
			newFilter.Proptxt = this.Proptxt;
			newFilter.Sop1txt = this.Sop1txt;
			newFilter.Sop2txt = this.Sop2txt;
			newFilter.Sop3txt = this.Sop3txt;
			newFilter.Opsgtxt = this.Opsgtxt;
			newFilter.Oplctxt = this.Oplctxt;
			newFilter.Wkeytxt = this.Wkeytxt;
			newFilter.Snm = this.Snm;
			newFilter.Nmtype = this.Nmtype;
			newFilter.Fnm = this.Fnm;
			newFilter.Sex = this.Sex;
			newFilter.Dob = this.Dob;
			newFilter.Sextxt = this.Sextxt;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Patstat = this.Patstat;
			
			return newFilter;
		}
	}
}
