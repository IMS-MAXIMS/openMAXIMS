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
// Template ver. 1.1.2 - Last modified on 19/10/2005 13:00 by Barbara Worwood

package ims.dto.client;


import java.util.HashMap;

public final class Booklist implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Booklist.class);
	
	private BooklistFilter lastGetFilter = null;
	private final String serviceName = "BOOKLIST";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public BooklistFilter Filter = new BooklistFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public BooklistEditFilter EditFilter = new BooklistEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public BooklistCollection DataCollection = new BooklistCollection();

	/**
	 * Creates a new Booklist Data Transfer Object.
	 */ 
	public Booklist(ims.dto.Connection connection)
	{	
		this.Connection = connection;
	}
	/**
	 * Returns the last result data after an insert or an update call
	 */
	public ims.dto.ResultData getLastResultData()
	{
		return this.lastResultData;
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
	public Booklist cloneObject()
	{
		Booklist cloneObject = new Booklist(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Date = DataCollection.get(x).Date;
			cloneObject.DataCollection.get(index).Time = DataCollection.get(x).Time;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Hcpcode = DataCollection.get(x).Hcpcode;
			cloneObject.DataCollection.get(index).Rescode = DataCollection.get(x).Rescode;
			cloneObject.DataCollection.get(index).Spcd = DataCollection.get(x).Spcd;
			cloneObject.DataCollection.get(index).Plbk = DataCollection.get(x).Plbk;
			cloneObject.DataCollection.get(index).Intn = DataCollection.get(x).Intn;
			cloneObject.DataCollection.get(index).Reas = DataCollection.get(x).Reas;
			cloneObject.DataCollection.get(index).Xrea = DataCollection.get(x).Xrea;
			cloneObject.DataCollection.get(index).Comm = DataCollection.get(x).Comm;
			cloneObject.DataCollection.get(index).Xcom = DataCollection.get(x).Xcom;
			cloneObject.DataCollection.get(index).Admt = DataCollection.get(x).Admt;
			cloneObject.DataCollection.get(index).Adsc = DataCollection.get(x).Adsc;
			cloneObject.DataCollection.get(index).Stay = DataCollection.get(x).Stay;
			cloneObject.DataCollection.get(index).Wkey = DataCollection.get(x).Wkey;
			cloneObject.DataCollection.get(index).Wlno = DataCollection.get(x).Wlno;
			cloneObject.DataCollection.get(index).Refr = DataCollection.get(x).Refr;
			cloneObject.DataCollection.get(index).Pflg = DataCollection.get(x).Pflg;
			cloneObject.DataCollection.get(index).Gflg = DataCollection.get(x).Gflg;
			cloneObject.DataCollection.get(index).Acco = DataCollection.get(x).Acco;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).Hcpname = DataCollection.get(x).Hcpname;
			cloneObject.DataCollection.get(index).Resname = DataCollection.get(x).Resname;
			cloneObject.DataCollection.get(index).Wlname = DataCollection.get(x).Wlname;
			cloneObject.DataCollection.get(index).Spcdtxt = DataCollection.get(x).Spcdtxt;
			cloneObject.DataCollection.get(index).Titl = DataCollection.get(x).Titl;
			cloneObject.DataCollection.get(index).Snm = DataCollection.get(x).Snm;
			cloneObject.DataCollection.get(index).Fnm1 = DataCollection.get(x).Fnm1;
			cloneObject.DataCollection.get(index).Fnm2 = DataCollection.get(x).Fnm2;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Sex = DataCollection.get(x).Sex;
			cloneObject.DataCollection.get(index).Rfcd = DataCollection.get(x).Rfcd;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Maxno = DataCollection.get(x).Maxno;
			cloneObject.DataCollection.get(index).Pcho = DataCollection.get(x).Pcho;
			cloneObject.DataCollection.get(index).Pcln = DataCollection.get(x).Pcln;
			cloneObject.DataCollection.get(index).Refrname = DataCollection.get(x).Refrname;
			cloneObject.DataCollection.get(index).Webadt = DataCollection.get(x).Webadt;
							
			
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
		return "Booklist.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Booklist.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Booklist.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Booklist.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Booklist.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Booklist.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Booklist.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Booklist.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Booklist.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Booklist.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Booklist.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Booklist.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Booklist.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Booklist.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Booklist.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Booklist.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Booklist.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Booklist.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Booklist.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Booklist.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Booklist.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Booklist.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Booklist.TransferData");
			
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
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Booklist.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Booklist.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Booklist.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Booklist.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Booklist nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Booklist After NextList ");
				
		decodeNASMessage();		
		logger.debug("Booklist After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Booklist.List");
							
		listInProgress = true;	
		logger.debug("Booklist Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Booklist After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Booklist After Parse Message");
		
						
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
	private String encodeNASFilter(BooklistFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Date != null && filter.Date.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Date);
		}
		
		if(Filter.Time != null && filter.Time.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Time);
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey);
		}
		
		if(Filter.Hcpcode != null && filter.Hcpcode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HCPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpcode);
		}
		
		if(Filter.Rescode != null && filter.Rescode.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RESCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rescode);
		}
		
		if(Filter.Spcd != null && filter.Spcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spcd);
		}
		
		if(Filter.Plbk != null && filter.Plbk.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PLBK" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Plbk);
		}
		
		if(Filter.Intn != null && filter.Intn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INTN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Intn);
		}
		
		if(Filter.Reas != null && filter.Reas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reas);
		}
		
		if(Filter.Xrea != null && filter.Xrea.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("XREA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Xrea);
		}
		
		if(Filter.Comm != null && filter.Comm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Comm);
		}
		
		if(Filter.Xcom != null && filter.Xcom.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("XCOM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Xcom);
		}
		
		if(Filter.Admt != null && filter.Admt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADMT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Admt);
		}
		
		if(Filter.Adsc != null && filter.Adsc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADSC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adsc);
		}
		
		if(Filter.Stay != null && filter.Stay.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STAY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stay);
		}
		
		if(Filter.Wkey != null && filter.Wkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("WKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wkey);
		}
		
		if(Filter.Wlno != null && filter.Wlno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("WLNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wlno);
		}
		
		if(Filter.Refr != null && filter.Refr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REFR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refr);
		}
		
		if(Filter.Pflg != null && filter.Pflg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PFLG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pflg);
		}
		
		if(Filter.Gflg != null && filter.Gflg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GFLG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gflg);
		}
		
		if(Filter.Acco != null && filter.Acco.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACCO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Acco);
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat);
		}
		
		if(Filter.Hcpname != null && filter.Hcpname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpname);
		}
		
		if(Filter.Resname != null && filter.Resname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RESNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resname);
		}
		
		if(Filter.Wlname != null && filter.Wlname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("WLNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wlname);
		}
		
		if(Filter.Spcdtxt != null && filter.Spcdtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SPCDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spcdtxt);
		}
		
		if(Filter.Titl != null && filter.Titl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Titl);
		}
		
		if(Filter.Snm != null && filter.Snm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Snm);
		}
		
		if(Filter.Fnm1 != null && filter.Fnm1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fnm1);
		}
		
		if(Filter.Fnm2 != null && filter.Fnm2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FNM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fnm2);
		}
		
		if(Filter.Dob != null && filter.Dob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dob);
		}
		
		if(Filter.Sex != null && filter.Sex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sex);
		}
		
		if(Filter.Rfcd != null && filter.Rfcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RFCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rfcd);
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum);
		}
		
		if(Filter.Maxno != null && filter.Maxno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MAXNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Maxno);
		}
		
		if(Filter.Pcho != null && filter.Pcho.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PCHO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pcho);
		}
		
		if(Filter.Pcln != null && filter.Pcln.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PCLN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pcln);
		}
		
		if(Filter.Refrname != null && filter.Refrname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REFRNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refrname);
		}
		
		if(Filter.Webadt != null && filter.Webadt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("WEBADT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Webadt);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		BooklistRecord data = (BooklistRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeDate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Date));
		}
		
		if(EditFilter.IncludeTime)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Time));
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey));
		}
		
		if(EditFilter.IncludeHcpcode)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HCPCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpcode));
		}
		
		if(EditFilter.IncludeRescode)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESCODE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rescode));
		}
		
		if(EditFilter.IncludeSpcd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spcd));
		}
		
		if(EditFilter.IncludePlbk)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PLBK" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Plbk));
		}
		
		if(EditFilter.IncludeIntn)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INTN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Intn));
		}
		
		if(EditFilter.IncludeReas)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reas));
		}
		
		if(EditFilter.IncludeXrea)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("XREA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Xrea));
		}
		
		if(EditFilter.IncludeComm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("COMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Comm));
		}
		
		if(EditFilter.IncludeXcom)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("XCOM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Xcom));
		}
		
		if(EditFilter.IncludeAdmt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADMT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Admt));
		}
		
		if(EditFilter.IncludeAdsc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADSC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adsc));
		}
		
		if(EditFilter.IncludeStay)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STAY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stay));
		}
		
		if(EditFilter.IncludeWkey)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("WKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wkey));
		}
		
		if(EditFilter.IncludeWlno)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("WLNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wlno));
		}
		
		if(EditFilter.IncludeRefr)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REFR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refr));
		}
		
		if(EditFilter.IncludePflg)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PFLG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pflg));
		}
		
		if(EditFilter.IncludeGflg)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GFLG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gflg));
		}
		
		if(EditFilter.IncludeAcco)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACCO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Acco));
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat));
		}
		
		if(EditFilter.IncludeHcpname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpname));
		}
		
		if(EditFilter.IncludeResname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resname));
		}
		
		if(EditFilter.IncludeWlname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("WLNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wlname));
		}
		
		if(EditFilter.IncludeSpcdtxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SPCDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spcdtxt));
		}
		
		if(EditFilter.IncludeTitl)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Titl));
		}
		
		if(EditFilter.IncludeSnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Snm));
		}
		
		if(EditFilter.IncludeFnm1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fnm1));
		}
		
		if(EditFilter.IncludeFnm2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FNM2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fnm2));
		}
		
		if(EditFilter.IncludeDob)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dob));
		}
		
		if(EditFilter.IncludeSex)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sex));
		}
		
		if(EditFilter.IncludeRfcd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RFCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rfcd));
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum));
		}
		
		if(EditFilter.IncludeMaxno)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MAXNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Maxno));
		}
		
		if(EditFilter.IncludePcho)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PCHO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pcho));
		}
		
		if(EditFilter.IncludePcln)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PCLN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pcln));
		}
		
		if(EditFilter.IncludeRefrname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REFRNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refrname));
		}
		
		if(EditFilter.IncludeWebadt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("WEBADT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Webadt));
		}
		
		
			
		return dataString.toString();	
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
			BooklistRecord record = new BooklistRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATE"));
			record.Time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TIME"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Hcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPCODE"));
			record.Rescode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESCODE"));
			record.Spcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCD"));
			record.Plbk = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLBK"));
			record.Intn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INTN"));
			record.Reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REAS"));
			record.Xrea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "XREA"));
			record.Comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMM"));
			record.Xcom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "XCOM"));
			record.Admt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMT"));
			record.Adsc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSC"));
			record.Stay = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAY"));
			record.Wkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WKEY"));
			record.Wlno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WLNO"));
			record.Refr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFR"));
			record.Pflg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PFLG"));
			record.Gflg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GFLG"));
			record.Acco = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACCO"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Hcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNAME"));
			record.Resname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESNAME"));
			record.Wlname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WLNAME"));
			record.Spcdtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCDTXT"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Fnm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM2"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Rfcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFCD"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Maxno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXNO"));
			record.Pcho = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCHO"));
			record.Pcln = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCLN"));
			record.Refrname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFRNAME"));
			record.Webadt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WEBADT"));
									
			DataCollection.add(record);
		}	
		
		return records;
	}
	private void decodeResultData()
	{
		this.lastResultData = null;
		String[] items = Connection.getResponseItems(Connection.getValueAt(6));
		if(items == null)
			return;
		int records = items.length;
		if(records == 0)
			return;
		
		String[] valueItems = Connection.splitResponseItem(items[0]);
		
		this.lastResultData = new ims.dto.ResultData();
		String attName = "";
		for(int x = 0; x < valueItems.length; x++)
		{
			attName = Connection.getAttributeName(valueItems[x]);
			this.lastResultData.add(attName, Connection.getValueFor(valueItems, attName));
		}
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
			BooklistRecord record = new BooklistRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Date = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DATE"));
			record.Time = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TIME"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Hcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPCODE"));
			record.Rescode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESCODE"));
			record.Spcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCD"));
			record.Plbk = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLBK"));
			record.Intn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INTN"));
			record.Reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REAS"));
			record.Xrea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "XREA"));
			record.Comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMM"));
			record.Xcom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "XCOM"));
			record.Admt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMT"));
			record.Adsc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSC"));
			record.Stay = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAY"));
			record.Wkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WKEY"));
			record.Wlno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WLNO"));
			record.Refr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFR"));
			record.Pflg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PFLG"));
			record.Gflg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GFLG"));
			record.Acco = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACCO"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Hcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNAME"));
			record.Resname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESNAME"));
			record.Wlname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WLNAME"));
			record.Spcdtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCDTXT"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Fnm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM2"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Rfcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFCD"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Maxno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXNO"));
			record.Pcho = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCHO"));
			record.Pcln = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCLN"));
			record.Refrname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFRNAME"));
			record.Webadt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WEBADT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class BooklistCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			BooklistRecord newRecord = new BooklistRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(BooklistRecord record)
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
		public BooklistRecord get(int index)
		{
			return (BooklistRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class BooklistRecord
	{
		public String Date = "";
		public String Time = "";
		public String Pkey = "";
		public String Hcpcode = "";
		public String Rescode = "";
		public String Spcd = "";
		public String Plbk = "";
		public String Intn = "";
		public String Reas = "";
		public String Xrea = "";
		public String Comm = "";
		public String Xcom = "";
		public String Admt = "";
		public String Adsc = "";
		public String Stay = "";
		public String Wkey = "";
		public String Wlno = "";
		public String Refr = "";
		public String Pflg = "";
		public String Gflg = "";
		public String Acco = "";
		public String Stat = "";
		public String Hcpname = "";
		public String Resname = "";
		public String Wlname = "";
		public String Spcdtxt = "";
		public String Titl = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Fnm2 = "";
		public String Dob = "";
		public String Sex = "";
		public String Rfcd = "";
		public String Hospnum = "";
		public String Maxno = "";
		public String Pcho = "";
		public String Pcln = "";
		public String Refrname = "";
		public String Webadt = "";
				
		
		public void clear()
		{
			Date = "";
			Time = "";
			Pkey = "";
			Hcpcode = "";
			Rescode = "";
			Spcd = "";
			Plbk = "";
			Intn = "";
			Reas = "";
			Xrea = "";
			Comm = "";
			Xcom = "";
			Admt = "";
			Adsc = "";
			Stay = "";
			Wkey = "";
			Wlno = "";
			Refr = "";
			Pflg = "";
			Gflg = "";
			Acco = "";
			Stat = "";
			Hcpname = "";
			Resname = "";
			Wlname = "";
			Spcdtxt = "";
			Titl = "";
			Snm = "";
			Fnm1 = "";
			Fnm2 = "";
			Dob = "";
			Sex = "";
			Rfcd = "";
			Hospnum = "";
			Maxno = "";
			Pcho = "";
			Pcln = "";
			Refrname = "";
			Webadt = "";
			
		}		
	}
		
		
	public final class BooklistFilter
	{			
		public String Date = "";
		public String Time = "";
		public String Pkey = "";
		public String Hcpcode = "";
		public String Rescode = "";
		public String Spcd = "";
		public String Plbk = "";
		public String Intn = "";
		public String Reas = "";
		public String Xrea = "";
		public String Comm = "";
		public String Xcom = "";
		public String Admt = "";
		public String Adsc = "";
		public String Stay = "";
		public String Wkey = "";
		public String Wlno = "";
		public String Refr = "";
		public String Pflg = "";
		public String Gflg = "";
		public String Acco = "";
		public String Stat = "";
		public String Hcpname = "";
		public String Resname = "";
		public String Wlname = "";
		public String Spcdtxt = "";
		public String Titl = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Fnm2 = "";
		public String Dob = "";
		public String Sex = "";
		public String Rfcd = "";
		public String Hospnum = "";
		public String Maxno = "";
		public String Pcho = "";
		public String Pcln = "";
		public String Refrname = "";
		public String Webadt = "";
		
		public void clear()
		{				
			Date = "";
			Time = "";
			Pkey = "";
			Hcpcode = "";
			Rescode = "";
			Spcd = "";
			Plbk = "";
			Intn = "";
			Reas = "";
			Xrea = "";
			Comm = "";
			Xcom = "";
			Admt = "";
			Adsc = "";
			Stay = "";
			Wkey = "";
			Wlno = "";
			Refr = "";
			Pflg = "";
			Gflg = "";
			Acco = "";
			Stat = "";
			Hcpname = "";
			Resname = "";
			Wlname = "";
			Spcdtxt = "";
			Titl = "";
			Snm = "";
			Fnm1 = "";
			Fnm2 = "";
			Dob = "";
			Sex = "";
			Rfcd = "";
			Hospnum = "";
			Maxno = "";
			Pcho = "";
			Pcln = "";
			Refrname = "";
			Webadt = "";
		}	
		public BooklistFilter cloneObject()
		{
			BooklistFilter newFilter = new BooklistFilter();
			
			newFilter.Date = this.Date;
			newFilter.Time = this.Time;
			newFilter.Pkey = this.Pkey;
			newFilter.Hcpcode = this.Hcpcode;
			newFilter.Rescode = this.Rescode;
			newFilter.Spcd = this.Spcd;
			newFilter.Plbk = this.Plbk;
			newFilter.Intn = this.Intn;
			newFilter.Reas = this.Reas;
			newFilter.Xrea = this.Xrea;
			newFilter.Comm = this.Comm;
			newFilter.Xcom = this.Xcom;
			newFilter.Admt = this.Admt;
			newFilter.Adsc = this.Adsc;
			newFilter.Stay = this.Stay;
			newFilter.Wkey = this.Wkey;
			newFilter.Wlno = this.Wlno;
			newFilter.Refr = this.Refr;
			newFilter.Pflg = this.Pflg;
			newFilter.Gflg = this.Gflg;
			newFilter.Acco = this.Acco;
			newFilter.Stat = this.Stat;
			newFilter.Hcpname = this.Hcpname;
			newFilter.Resname = this.Resname;
			newFilter.Wlname = this.Wlname;
			newFilter.Spcdtxt = this.Spcdtxt;
			newFilter.Titl = this.Titl;
			newFilter.Snm = this.Snm;
			newFilter.Fnm1 = this.Fnm1;
			newFilter.Fnm2 = this.Fnm2;
			newFilter.Dob = this.Dob;
			newFilter.Sex = this.Sex;
			newFilter.Rfcd = this.Rfcd;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Maxno = this.Maxno;
			newFilter.Pcho = this.Pcho;
			newFilter.Pcln = this.Pcln;
			newFilter.Refrname = this.Refrname;
			newFilter.Webadt = this.Webadt;
			
			return newFilter;
		}
	}
	public final class BooklistEditFilter
	{			
		public boolean IncludeDate = true;
		public boolean IncludeTime = true;
		public boolean IncludePkey = true;
		public boolean IncludeHcpcode = true;
		public boolean IncludeRescode = true;
		public boolean IncludeSpcd = true;
		public boolean IncludePlbk = true;
		public boolean IncludeIntn = true;
		public boolean IncludeReas = true;
		public boolean IncludeXrea = true;
		public boolean IncludeComm = true;
		public boolean IncludeXcom = true;
		public boolean IncludeAdmt = true;
		public boolean IncludeAdsc = true;
		public boolean IncludeStay = true;
		public boolean IncludeWkey = true;
		public boolean IncludeWlno = true;
		public boolean IncludeRefr = true;
		public boolean IncludePflg = true;
		public boolean IncludeGflg = true;
		public boolean IncludeAcco = true;
		public boolean IncludeStat = true;
		public boolean IncludeHcpname = true;
		public boolean IncludeResname = true;
		public boolean IncludeWlname = true;
		public boolean IncludeSpcdtxt = true;
		public boolean IncludeTitl = true;
		public boolean IncludeSnm = true;
		public boolean IncludeFnm1 = true;
		public boolean IncludeFnm2 = true;
		public boolean IncludeDob = true;
		public boolean IncludeSex = true;
		public boolean IncludeRfcd = true;
		public boolean IncludeHospnum = true;
		public boolean IncludeMaxno = true;
		public boolean IncludePcho = true;
		public boolean IncludePcln = true;
		public boolean IncludeRefrname = true;
		public boolean IncludeWebadt = true;
		
		public void includeAll()
		{				
			IncludeDate = true;
			IncludeTime = true;
			IncludePkey = true;
			IncludeHcpcode = true;
			IncludeRescode = true;
			IncludeSpcd = true;
			IncludePlbk = true;
			IncludeIntn = true;
			IncludeReas = true;
			IncludeXrea = true;
			IncludeComm = true;
			IncludeXcom = true;
			IncludeAdmt = true;
			IncludeAdsc = true;
			IncludeStay = true;
			IncludeWkey = true;
			IncludeWlno = true;
			IncludeRefr = true;
			IncludePflg = true;
			IncludeGflg = true;
			IncludeAcco = true;
			IncludeStat = true;
			IncludeHcpname = true;
			IncludeResname = true;
			IncludeWlname = true;
			IncludeSpcdtxt = true;
			IncludeTitl = true;
			IncludeSnm = true;
			IncludeFnm1 = true;
			IncludeFnm2 = true;
			IncludeDob = true;
			IncludeSex = true;
			IncludeRfcd = true;
			IncludeHospnum = true;
			IncludeMaxno = true;
			IncludePcho = true;
			IncludePcln = true;
			IncludeRefrname = true;
			IncludeWebadt = true;
		}	
		public void excludeAll()
		{				
			IncludeDate = false;
			IncludeTime = false;
			IncludePkey = false;
			IncludeHcpcode = false;
			IncludeRescode = false;
			IncludeSpcd = false;
			IncludePlbk = false;
			IncludeIntn = false;
			IncludeReas = false;
			IncludeXrea = false;
			IncludeComm = false;
			IncludeXcom = false;
			IncludeAdmt = false;
			IncludeAdsc = false;
			IncludeStay = false;
			IncludeWkey = false;
			IncludeWlno = false;
			IncludeRefr = false;
			IncludePflg = false;
			IncludeGflg = false;
			IncludeAcco = false;
			IncludeStat = false;
			IncludeHcpname = false;
			IncludeResname = false;
			IncludeWlname = false;
			IncludeSpcdtxt = false;
			IncludeTitl = false;
			IncludeSnm = false;
			IncludeFnm1 = false;
			IncludeFnm2 = false;
			IncludeDob = false;
			IncludeSex = false;
			IncludeRfcd = false;
			IncludeHospnum = false;
			IncludeMaxno = false;
			IncludePcho = false;
			IncludePcln = false;
			IncludeRefrname = false;
			IncludeWebadt = false;
		}
		public BooklistEditFilter cloneObject()
		{
			BooklistEditFilter newEditFilter = new BooklistEditFilter();
			
			newEditFilter.IncludeDate = this.IncludeDate;
			newEditFilter.IncludeTime = this.IncludeTime;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeHcpcode = this.IncludeHcpcode;
			newEditFilter.IncludeRescode = this.IncludeRescode;
			newEditFilter.IncludeSpcd = this.IncludeSpcd;
			newEditFilter.IncludePlbk = this.IncludePlbk;
			newEditFilter.IncludeIntn = this.IncludeIntn;
			newEditFilter.IncludeReas = this.IncludeReas;
			newEditFilter.IncludeXrea = this.IncludeXrea;
			newEditFilter.IncludeComm = this.IncludeComm;
			newEditFilter.IncludeXcom = this.IncludeXcom;
			newEditFilter.IncludeAdmt = this.IncludeAdmt;
			newEditFilter.IncludeAdsc = this.IncludeAdsc;
			newEditFilter.IncludeStay = this.IncludeStay;
			newEditFilter.IncludeWkey = this.IncludeWkey;
			newEditFilter.IncludeWlno = this.IncludeWlno;
			newEditFilter.IncludeRefr = this.IncludeRefr;
			newEditFilter.IncludePflg = this.IncludePflg;
			newEditFilter.IncludeGflg = this.IncludeGflg;
			newEditFilter.IncludeAcco = this.IncludeAcco;
			newEditFilter.IncludeStat = this.IncludeStat;
			newEditFilter.IncludeHcpname = this.IncludeHcpname;
			newEditFilter.IncludeResname = this.IncludeResname;
			newEditFilter.IncludeWlname = this.IncludeWlname;
			newEditFilter.IncludeSpcdtxt = this.IncludeSpcdtxt;
			newEditFilter.IncludeTitl = this.IncludeTitl;
			newEditFilter.IncludeSnm = this.IncludeSnm;
			newEditFilter.IncludeFnm1 = this.IncludeFnm1;
			newEditFilter.IncludeFnm2 = this.IncludeFnm2;
			newEditFilter.IncludeDob = this.IncludeDob;
			newEditFilter.IncludeSex = this.IncludeSex;
			newEditFilter.IncludeRfcd = this.IncludeRfcd;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeMaxno = this.IncludeMaxno;
			newEditFilter.IncludePcho = this.IncludePcho;
			newEditFilter.IncludePcln = this.IncludePcln;
			newEditFilter.IncludeRefrname = this.IncludeRefrname;
			newEditFilter.IncludeWebadt = this.IncludeWebadt;
			
			return newEditFilter;
		}
	}
}
