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

public final class Inpat implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Inpat.class);
	
	private InpatFilter lastGetFilter = null;
	private final String serviceName = "INPAT";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public InpatFilter Filter = new InpatFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public InpatEditFilter EditFilter = new InpatEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public InpatCollection DataCollection = new InpatCollection();

	/**
	 * Creates a new Inpat Data Transfer Object.
	 */ 
	public Inpat(ims.dto.Connection connection)
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
	public Inpat cloneObject()
	{
		Inpat cloneObject = new Inpat(Connection);
			
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
			cloneObject.DataCollection.get(index).Snm = DataCollection.get(x).Snm;
			cloneObject.DataCollection.get(index).Conf = DataCollection.get(x).Conf;
			cloneObject.DataCollection.get(index).Amen = DataCollection.get(x).Amen;
			cloneObject.DataCollection.get(index).Addt = DataCollection.get(x).Addt;
			cloneObject.DataCollection.get(index).Adtm = DataCollection.get(x).Adtm;
			cloneObject.DataCollection.get(index).Adso = DataCollection.get(x).Adso;
			cloneObject.DataCollection.get(index).Sevr = DataCollection.get(x).Sevr;
			cloneObject.DataCollection.get(index).Ltdt = DataCollection.get(x).Ltdt;
			cloneObject.DataCollection.get(index).Eddt = DataCollection.get(x).Eddt;
			cloneObject.DataCollection.get(index).Mors = DataCollection.get(x).Mors;
			cloneObject.DataCollection.get(index).Hlfl = DataCollection.get(x).Hlfl;
			cloneObject.DataCollection.get(index).Detn = DataCollection.get(x).Detn;
			cloneObject.DataCollection.get(index).Pflg = DataCollection.get(x).Pflg;
			cloneObject.DataCollection.get(index).Gflg = DataCollection.get(x).Gflg;
			cloneObject.DataCollection.get(index).Plbk = DataCollection.get(x).Plbk;
			cloneObject.DataCollection.get(index).Spcd = DataCollection.get(x).Spcd;
			cloneObject.DataCollection.get(index).Refr = DataCollection.get(x).Refr;
			cloneObject.DataCollection.get(index).Stay = DataCollection.get(x).Stay;
			cloneObject.DataCollection.get(index).Reas = DataCollection.get(x).Reas;
			cloneObject.DataCollection.get(index).Comm = DataCollection.get(x).Comm;
			cloneObject.DataCollection.get(index).Xcom = DataCollection.get(x).Xcom;
			cloneObject.DataCollection.get(index).Srq1 = DataCollection.get(x).Srq1;
			cloneObject.DataCollection.get(index).Srq2 = DataCollection.get(x).Srq2;
			cloneObject.DataCollection.get(index).Srq3 = DataCollection.get(x).Srq3;
			cloneObject.DataCollection.get(index).Srq4 = DataCollection.get(x).Srq4;
			cloneObject.DataCollection.get(index).Srq5 = DataCollection.get(x).Srq5;
			cloneObject.DataCollection.get(index).Srq6 = DataCollection.get(x).Srq6;
			cloneObject.DataCollection.get(index).Srq7 = DataCollection.get(x).Srq7;
			cloneObject.DataCollection.get(index).Srq8 = DataCollection.get(x).Srq8;
			cloneObject.DataCollection.get(index).Intn = DataCollection.get(x).Intn;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).Acco = DataCollection.get(x).Acco;
			cloneObject.DataCollection.get(index).Lttm = DataCollection.get(x).Lttm;
			cloneObject.DataCollection.get(index).Exdt = DataCollection.get(x).Exdt;
			cloneObject.DataCollection.get(index).Extm = DataCollection.get(x).Extm;
			cloneObject.DataCollection.get(index).Chap = DataCollection.get(x).Chap;
			cloneObject.DataCollection.get(index).Hcpname = DataCollection.get(x).Hcpname;
			cloneObject.DataCollection.get(index).Resmnem = DataCollection.get(x).Resmnem;
			cloneObject.DataCollection.get(index).Resname = DataCollection.get(x).Resname;
			cloneObject.DataCollection.get(index).Titl = DataCollection.get(x).Titl;
			cloneObject.DataCollection.get(index).Fnm1 = DataCollection.get(x).Fnm1;
			cloneObject.DataCollection.get(index).Fnm2 = DataCollection.get(x).Fnm2;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Sex = DataCollection.get(x).Sex;
			cloneObject.DataCollection.get(index).Flag = DataCollection.get(x).Flag;
			cloneObject.DataCollection.get(index).Nhsnum = DataCollection.get(x).Nhsnum;
			cloneObject.DataCollection.get(index).Epid = DataCollection.get(x).Epid;
			cloneObject.DataCollection.get(index).Lgls = DataCollection.get(x).Lgls;
			cloneObject.DataCollection.get(index).Mcat = DataCollection.get(x).Mcat;
			cloneObject.DataCollection.get(index).Maxno = DataCollection.get(x).Maxno;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Patalert = DataCollection.get(x).Patalert;
			cloneObject.DataCollection.get(index).Admt = DataCollection.get(x).Admt;
			cloneObject.DataCollection.get(index).Adsc = DataCollection.get(x).Adsc;
			cloneObject.DataCollection.get(index).Dsmt = DataCollection.get(x).Dsmt;
			cloneObject.DataCollection.get(index).Dsds = DataCollection.get(x).Dsds;
			cloneObject.DataCollection.get(index).Epen = DataCollection.get(x).Epen;
			cloneObject.DataCollection.get(index).Eetm = DataCollection.get(x).Eetm;
			cloneObject.DataCollection.get(index).Rfcd = DataCollection.get(x).Rfcd;
			cloneObject.DataCollection.get(index).Cflup = DataCollection.get(x).Cflup;
			cloneObject.DataCollection.get(index).Cfl = DataCollection.get(x).Cfl;
			cloneObject.DataCollection.get(index).Cflcomm = DataCollection.get(x).Cflcomm;
			cloneObject.DataCollection.get(index).Sprg = DataCollection.get(x).Sprg;
			cloneObject.DataCollection.get(index).Pcpa = DataCollection.get(x).Pcpa;
			cloneObject.DataCollection.get(index).Bookremv = DataCollection.get(x).Bookremv;
			cloneObject.DataCollection.get(index).Bookdate = DataCollection.get(x).Bookdate;
			cloneObject.DataCollection.get(index).Booktime = DataCollection.get(x).Booktime;
			cloneObject.DataCollection.get(index).Rrea = DataCollection.get(x).Rrea;
			cloneObject.DataCollection.get(index).Outc = DataCollection.get(x).Outc;
			cloneObject.DataCollection.get(index).Btyp = DataCollection.get(x).Btyp;
			cloneObject.DataCollection.get(index).Desc = DataCollection.get(x).Desc;
			cloneObject.DataCollection.get(index).Congmcn = DataCollection.get(x).Congmcn;
			cloneObject.DataCollection.get(index).Ocsc = DataCollection.get(x).Ocsc;
			cloneObject.DataCollection.get(index).Rect = DataCollection.get(x).Rect;
			cloneObject.DataCollection.get(index).Ethc = DataCollection.get(x).Ethc;
			cloneObject.DataCollection.get(index).Clin = DataCollection.get(x).Clin;
			cloneObject.DataCollection.get(index).Adsctxt = DataCollection.get(x).Adsctxt;
			cloneObject.DataCollection.get(index).Wardhpcd = DataCollection.get(x).Wardhpcd;
			cloneObject.DataCollection.get(index).Hcpmnem = DataCollection.get(x).Hcpmnem;
			cloneObject.DataCollection.get(index).Refrname = DataCollection.get(x).Refrname;
			cloneObject.DataCollection.get(index).Condpbn = DataCollection.get(x).Condpbn;
			cloneObject.DataCollection.get(index).Rtpstat = DataCollection.get(x).Rtpstat;
			cloneObject.DataCollection.get(index).Rtpendt = DataCollection.get(x).Rtpendt;
			cloneObject.DataCollection.get(index).Rttstop = DataCollection.get(x).Rttstop;
			cloneObject.DataCollection.get(index).Dspn = DataCollection.get(x).Dspn;
			cloneObject.DataCollection.get(index).Drdt = DataCollection.get(x).Drdt;
			cloneObject.DataCollection.get(index).Gdcn = DataCollection.get(x).Gdcn;
			cloneObject.DataCollection.get(index).Webadt = DataCollection.get(x).Webadt;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "14";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Inpat.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpat.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Inpat.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpat.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpat.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpat.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Inpat.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Inpat.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpat.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Inpat.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Inpat.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Inpat.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Inpat.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Inpat.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpat.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Inpat.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Inpat.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Inpat.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Inpat.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Inpat.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpat.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Inpat.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Inpat.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpat.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Inpat.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Inpat.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Inpat.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Inpat nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Inpat After NextList ");
				
		decodeNASMessage();		
		logger.debug("Inpat After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Inpat.List");
							
		listInProgress = true;	
		logger.debug("Inpat Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Inpat After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Inpat After Parse Message");
		
						
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
	private String encodeNASFilter(InpatFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
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
		
		if(Filter.Snm != null && filter.Snm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Snm);
		}
		
		if(Filter.Conf != null && filter.Conf.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Conf);
		}
		
		if(Filter.Amen != null && filter.Amen.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AMEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Amen);
		}
		
		if(Filter.Addt != null && filter.Addt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Addt);
		}
		
		if(Filter.Adtm != null && filter.Adtm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adtm);
		}
		
		if(Filter.Adso != null && filter.Adso.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADSO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adso);
		}
		
		if(Filter.Sevr != null && filter.Sevr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SEVR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sevr);
		}
		
		if(Filter.Ltdt != null && filter.Ltdt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LTDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ltdt);
		}
		
		if(Filter.Eddt != null && filter.Eddt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EDDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eddt);
		}
		
		if(Filter.Mors != null && filter.Mors.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MORS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mors);
		}
		
		if(Filter.Hlfl != null && filter.Hlfl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HLFL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hlfl);
		}
		
		if(Filter.Detn != null && filter.Detn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DETN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Detn);
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
		
		if(Filter.Plbk != null && filter.Plbk.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PLBK" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Plbk);
		}
		
		if(Filter.Spcd != null && filter.Spcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spcd);
		}
		
		if(Filter.Refr != null && filter.Refr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REFR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refr);
		}
		
		if(Filter.Stay != null && filter.Stay.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STAY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stay);
		}
		
		if(Filter.Reas != null && filter.Reas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reas);
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
		
		if(Filter.Srq1 != null && filter.Srq1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SRQ1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Srq1);
		}
		
		if(Filter.Srq2 != null && filter.Srq2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SRQ2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Srq2);
		}
		
		if(Filter.Srq3 != null && filter.Srq3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SRQ3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Srq3);
		}
		
		if(Filter.Srq4 != null && filter.Srq4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SRQ4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Srq4);
		}
		
		if(Filter.Srq5 != null && filter.Srq5.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SRQ5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Srq5);
		}
		
		if(Filter.Srq6 != null && filter.Srq6.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SRQ6" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Srq6);
		}
		
		if(Filter.Srq7 != null && filter.Srq7.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SRQ7" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Srq7);
		}
		
		if(Filter.Srq8 != null && filter.Srq8.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SRQ8" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Srq8);
		}
		
		if(Filter.Intn != null && filter.Intn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INTN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Intn);
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat);
		}
		
		if(Filter.Acco != null && filter.Acco.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ACCO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Acco);
		}
		
		if(Filter.Lttm != null && filter.Lttm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LTTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lttm);
		}
		
		if(Filter.Exdt != null && filter.Exdt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EXDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Exdt);
		}
		
		if(Filter.Extm != null && filter.Extm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EXTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Extm);
		}
		
		if(Filter.Chap != null && filter.Chap.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CHAP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Chap);
		}
		
		if(Filter.Hcpname != null && filter.Hcpname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpname);
		}
		
		if(Filter.Resmnem != null && filter.Resmnem.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RESMNEM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resmnem);
		}
		
		if(Filter.Resname != null && filter.Resname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RESNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resname);
		}
		
		if(Filter.Titl != null && filter.Titl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Titl);
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
		
		if(Filter.Flag != null && filter.Flag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Flag);
		}
		
		if(Filter.Nhsnum != null && filter.Nhsnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NHSNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsnum);
		}
		
		if(Filter.Epid != null && filter.Epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Epid);
		}
		
		if(Filter.Lgls != null && filter.Lgls.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LGLS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lgls);
		}
		
		if(Filter.Mcat != null && filter.Mcat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MCAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mcat);
		}
		
		if(Filter.Maxno != null && filter.Maxno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MAXNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Maxno);
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum);
		}
		
		if(Filter.Patalert != null && filter.Patalert.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PATALERT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Patalert);
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
		
		if(Filter.Dsmt != null && filter.Dsmt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DSMT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dsmt);
		}
		
		if(Filter.Dsds != null && filter.Dsds.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DSDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dsds);
		}
		
		if(Filter.Epen != null && filter.Epen.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EPEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Epen);
		}
		
		if(Filter.Eetm != null && filter.Eetm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EETM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Eetm);
		}
		
		if(Filter.Rfcd != null && filter.Rfcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RFCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rfcd);
		}
		
		if(Filter.Cflup != null && filter.Cflup.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CFLUP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cflup);
		}
		
		if(Filter.Cfl != null && filter.Cfl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CFL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cfl);
		}
		
		if(Filter.Cflcomm != null && filter.Cflcomm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CFLCOMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cflcomm);
		}
		
		if(Filter.Sprg != null && filter.Sprg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SPRG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sprg);
		}
		
		if(Filter.Pcpa != null && filter.Pcpa.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PCPA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pcpa);
		}
		
		if(Filter.Bookremv != null && filter.Bookremv.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("BOOKREMV" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Bookremv);
		}
		
		if(Filter.Bookdate != null && filter.Bookdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("BOOKDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Bookdate);
		}
		
		if(Filter.Booktime != null && filter.Booktime.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("BOOKTIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Booktime);
		}
		
		if(Filter.Rrea != null && filter.Rrea.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RREA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rrea);
		}
		
		if(Filter.Outc != null && filter.Outc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OUTC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Outc);
		}
		
		if(Filter.Btyp != null && filter.Btyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("BTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Btyp);
		}
		
		if(Filter.Desc != null && filter.Desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Desc);
		}
		
		if(Filter.Congmcn != null && filter.Congmcn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONGMCN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Congmcn);
		}
		
		if(Filter.Ocsc != null && filter.Ocsc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OCSC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ocsc);
		}
		
		if(Filter.Rect != null && filter.Rect.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RECT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rect);
		}
		
		if(Filter.Ethc != null && filter.Ethc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ETHC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ethc);
		}
		
		if(Filter.Clin != null && filter.Clin.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CLIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clin);
		}
		
		if(Filter.Adsctxt != null && filter.Adsctxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADSCTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adsctxt);
		}
		
		if(Filter.Wardhpcd != null && filter.Wardhpcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("WARDHPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Wardhpcd);
		}
		
		if(Filter.Hcpmnem != null && filter.Hcpmnem.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HCPMNEM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpmnem);
		}
		
		if(Filter.Refrname != null && filter.Refrname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REFRNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refrname);
		}
		
		if(Filter.Condpbn != null && filter.Condpbn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONDPBN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Condpbn);
		}
		
		if(Filter.Rtpstat != null && filter.Rtpstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RTPSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rtpstat);
		}
		
		if(Filter.Rtpendt != null && filter.Rtpendt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RTPENDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rtpendt);
		}
		
		if(Filter.Rttstop != null && filter.Rttstop.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RTTSTOP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rttstop);
		}
		
		if(Filter.Dspn != null && filter.Dspn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DSPN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dspn);
		}
		
		if(Filter.Drdt != null && filter.Drdt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DRDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Drdt);
		}
		
		if(Filter.Gdcn != null && filter.Gdcn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GDCN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gdcn);
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
			
		InpatRecord data = (InpatRecord)DataCollection.get(0);
		
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
		
		if(EditFilter.IncludeSnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Snm));
		}
		
		if(EditFilter.IncludeConf)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Conf));
		}
		
		if(EditFilter.IncludeAmen)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AMEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Amen));
		}
		
		if(EditFilter.IncludeAddt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Addt));
		}
		
		if(EditFilter.IncludeAdtm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adtm));
		}
		
		if(EditFilter.IncludeAdso)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADSO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adso));
		}
		
		if(EditFilter.IncludeSevr)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEVR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sevr));
		}
		
		if(EditFilter.IncludeLtdt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LTDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ltdt));
		}
		
		if(EditFilter.IncludeEddt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EDDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eddt));
		}
		
		if(EditFilter.IncludeMors)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MORS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mors));
		}
		
		if(EditFilter.IncludeHlfl)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HLFL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hlfl));
		}
		
		if(EditFilter.IncludeDetn)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DETN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Detn));
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
		
		if(EditFilter.IncludePlbk)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PLBK" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Plbk));
		}
		
		if(EditFilter.IncludeSpcd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spcd));
		}
		
		if(EditFilter.IncludeRefr)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REFR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refr));
		}
		
		if(EditFilter.IncludeStay)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STAY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stay));
		}
		
		if(EditFilter.IncludeReas)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reas));
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
		
		if(EditFilter.IncludeSrq1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SRQ1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Srq1));
		}
		
		if(EditFilter.IncludeSrq2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SRQ2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Srq2));
		}
		
		if(EditFilter.IncludeSrq3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SRQ3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Srq3));
		}
		
		if(EditFilter.IncludeSrq4)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SRQ4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Srq4));
		}
		
		if(EditFilter.IncludeSrq5)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SRQ5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Srq5));
		}
		
		if(EditFilter.IncludeSrq6)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SRQ6" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Srq6));
		}
		
		if(EditFilter.IncludeSrq7)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SRQ7" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Srq7));
		}
		
		if(EditFilter.IncludeSrq8)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SRQ8" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Srq8));
		}
		
		if(EditFilter.IncludeIntn)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INTN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Intn));
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat));
		}
		
		if(EditFilter.IncludeAcco)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ACCO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Acco));
		}
		
		if(EditFilter.IncludeLttm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LTTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lttm));
		}
		
		if(EditFilter.IncludeExdt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EXDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Exdt));
		}
		
		if(EditFilter.IncludeExtm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EXTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Extm));
		}
		
		if(EditFilter.IncludeChap)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CHAP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Chap));
		}
		
		if(EditFilter.IncludeHcpname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HCPNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpname));
		}
		
		if(EditFilter.IncludeResmnem)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESMNEM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resmnem));
		}
		
		if(EditFilter.IncludeResname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RESNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resname));
		}
		
		if(EditFilter.IncludeTitl)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Titl));
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
		
		if(EditFilter.IncludeFlag)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Flag));
		}
		
		if(EditFilter.IncludeNhsnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NHSNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsnum));
		}
		
		if(EditFilter.IncludeEpid)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Epid));
		}
		
		if(EditFilter.IncludeLgls)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LGLS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lgls));
		}
		
		if(EditFilter.IncludeMcat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MCAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mcat));
		}
		
		if(EditFilter.IncludeMaxno)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MAXNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Maxno));
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum));
		}
		
		if(EditFilter.IncludePatalert)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PATALERT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Patalert));
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
		
		if(EditFilter.IncludeDsmt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DSMT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dsmt));
		}
		
		if(EditFilter.IncludeDsds)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DSDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dsds));
		}
		
		if(EditFilter.IncludeEpen)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EPEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Epen));
		}
		
		if(EditFilter.IncludeEetm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EETM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Eetm));
		}
		
		if(EditFilter.IncludeRfcd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RFCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rfcd));
		}
		
		if(EditFilter.IncludeCflup)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CFLUP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cflup));
		}
		
		if(EditFilter.IncludeCfl)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CFL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cfl));
		}
		
		if(EditFilter.IncludeCflcomm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CFLCOMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cflcomm));
		}
		
		if(EditFilter.IncludeSprg)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SPRG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sprg));
		}
		
		if(EditFilter.IncludePcpa)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PCPA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pcpa));
		}
		
		if(EditFilter.IncludeBookremv)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("BOOKREMV" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Bookremv));
		}
		
		if(EditFilter.IncludeBookdate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("BOOKDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Bookdate));
		}
		
		if(EditFilter.IncludeBooktime)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("BOOKTIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Booktime));
		}
		
		if(EditFilter.IncludeRrea)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RREA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rrea));
		}
		
		if(EditFilter.IncludeOutc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OUTC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Outc));
		}
		
		if(EditFilter.IncludeBtyp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("BTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Btyp));
		}
		
		if(EditFilter.IncludeDesc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Desc));
		}
		
		if(EditFilter.IncludeCongmcn)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONGMCN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Congmcn));
		}
		
		if(EditFilter.IncludeOcsc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OCSC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ocsc));
		}
		
		if(EditFilter.IncludeRect)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RECT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rect));
		}
		
		if(EditFilter.IncludeEthc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ETHC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ethc));
		}
		
		if(EditFilter.IncludeClin)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CLIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clin));
		}
		
		if(EditFilter.IncludeAdsctxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADSCTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adsctxt));
		}
		
		if(EditFilter.IncludeWardhpcd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("WARDHPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Wardhpcd));
		}
		
		if(EditFilter.IncludeHcpmnem)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HCPMNEM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpmnem));
		}
		
		if(EditFilter.IncludeRefrname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REFRNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refrname));
		}
		
		if(EditFilter.IncludeCondpbn)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONDPBN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Condpbn));
		}
		
		if(EditFilter.IncludeRtpstat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RTPSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rtpstat));
		}
		
		if(EditFilter.IncludeRtpendt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RTPENDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rtpendt));
		}
		
		if(EditFilter.IncludeRttstop)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RTTSTOP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rttstop));
		}
		
		if(EditFilter.IncludeDspn)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DSPN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dspn));
		}
		
		if(EditFilter.IncludeDrdt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DRDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Drdt));
		}
		
		if(EditFilter.IncludeGdcn)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GDCN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gdcn));
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
			InpatRecord record = new InpatRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Hcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPCODE"));
			record.Rescode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESCODE"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Conf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONF"));
			record.Amen = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AMEN"));
			record.Addt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDT"));
			record.Adtm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADTM"));
			record.Adso = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSO"));
			record.Sevr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEVR"));
			record.Ltdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LTDT"));
			record.Eddt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EDDT"));
			record.Mors = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MORS"));
			record.Hlfl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HLFL"));
			record.Detn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DETN"));
			record.Pflg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PFLG"));
			record.Gflg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GFLG"));
			record.Plbk = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLBK"));
			record.Spcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCD"));
			record.Refr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFR"));
			record.Stay = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAY"));
			record.Reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REAS"));
			record.Comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMM"));
			record.Xcom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "XCOM"));
			record.Srq1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ1"));
			record.Srq2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ2"));
			record.Srq3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ3"));
			record.Srq4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ4"));
			record.Srq5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ5"));
			record.Srq6 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ6"));
			record.Srq7 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ7"));
			record.Srq8 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ8"));
			record.Intn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INTN"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Acco = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACCO"));
			record.Lttm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LTTM"));
			record.Exdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXDT"));
			record.Extm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXTM"));
			record.Chap = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHAP"));
			record.Hcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNAME"));
			record.Resmnem = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESMNEM"));
			record.Resname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESNAME"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Fnm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM2"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FLAG"));
			record.Nhsnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNUM"));
			record.Epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPID"));
			record.Lgls = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LGLS"));
			record.Mcat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MCAT"));
			record.Maxno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXNO"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Patalert = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATALERT"));
			record.Admt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMT"));
			record.Adsc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSC"));
			record.Dsmt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSMT"));
			record.Dsds = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSDS"));
			record.Epen = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPEN"));
			record.Eetm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EETM"));
			record.Rfcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFCD"));
			record.Cflup = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFLUP"));
			record.Cfl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFL"));
			record.Cflcomm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFLCOMM"));
			record.Sprg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPRG"));
			record.Pcpa = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCPA"));
			record.Bookremv = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BOOKREMV"));
			record.Bookdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BOOKDATE"));
			record.Booktime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BOOKTIME"));
			record.Rrea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RREA"));
			record.Outc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUTC"));
			record.Btyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BTYP"));
			record.Desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DESC"));
			record.Congmcn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONGMCN"));
			record.Ocsc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OCSC"));
			record.Rect = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RECT"));
			record.Ethc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETHC"));
			record.Clin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLIN"));
			record.Adsctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSCTXT"));
			record.Wardhpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WARDHPCD"));
			record.Hcpmnem = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPMNEM"));
			record.Refrname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFRNAME"));
			record.Condpbn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONDPBN"));
			record.Rtpstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTPSTAT"));
			record.Rtpendt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTPENDT"));
			record.Rttstop = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTTSTOP"));
			record.Dspn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSPN"));
			record.Drdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DRDT"));
			record.Gdcn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GDCN"));
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
			InpatRecord record = new InpatRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Hcpcode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPCODE"));
			record.Rescode = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESCODE"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Conf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONF"));
			record.Amen = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AMEN"));
			record.Addt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADDT"));
			record.Adtm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADTM"));
			record.Adso = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSO"));
			record.Sevr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEVR"));
			record.Ltdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LTDT"));
			record.Eddt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EDDT"));
			record.Mors = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MORS"));
			record.Hlfl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HLFL"));
			record.Detn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DETN"));
			record.Pflg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PFLG"));
			record.Gflg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GFLG"));
			record.Plbk = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLBK"));
			record.Spcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPCD"));
			record.Refr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFR"));
			record.Stay = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAY"));
			record.Reas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REAS"));
			record.Comm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMM"));
			record.Xcom = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "XCOM"));
			record.Srq1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ1"));
			record.Srq2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ2"));
			record.Srq3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ3"));
			record.Srq4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ4"));
			record.Srq5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ5"));
			record.Srq6 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ6"));
			record.Srq7 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ7"));
			record.Srq8 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRQ8"));
			record.Intn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INTN"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Acco = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACCO"));
			record.Lttm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LTTM"));
			record.Exdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXDT"));
			record.Extm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXTM"));
			record.Chap = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHAP"));
			record.Hcpname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPNAME"));
			record.Resmnem = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESMNEM"));
			record.Resname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESNAME"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Fnm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM2"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Flag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FLAG"));
			record.Nhsnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNUM"));
			record.Epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPID"));
			record.Lgls = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LGLS"));
			record.Mcat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MCAT"));
			record.Maxno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MAXNO"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Patalert = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATALERT"));
			record.Admt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADMT"));
			record.Adsc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSC"));
			record.Dsmt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSMT"));
			record.Dsds = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSDS"));
			record.Epen = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPEN"));
			record.Eetm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EETM"));
			record.Rfcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RFCD"));
			record.Cflup = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFLUP"));
			record.Cfl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFL"));
			record.Cflcomm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFLCOMM"));
			record.Sprg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPRG"));
			record.Pcpa = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PCPA"));
			record.Bookremv = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BOOKREMV"));
			record.Bookdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BOOKDATE"));
			record.Booktime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BOOKTIME"));
			record.Rrea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RREA"));
			record.Outc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OUTC"));
			record.Btyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BTYP"));
			record.Desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DESC"));
			record.Congmcn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONGMCN"));
			record.Ocsc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OCSC"));
			record.Rect = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RECT"));
			record.Ethc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETHC"));
			record.Clin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLIN"));
			record.Adsctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADSCTXT"));
			record.Wardhpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WARDHPCD"));
			record.Hcpmnem = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPMNEM"));
			record.Refrname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFRNAME"));
			record.Condpbn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONDPBN"));
			record.Rtpstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTPSTAT"));
			record.Rtpendt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTPENDT"));
			record.Rttstop = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTTSTOP"));
			record.Dspn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DSPN"));
			record.Drdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DRDT"));
			record.Gdcn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GDCN"));
			record.Webadt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WEBADT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class InpatCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			InpatRecord newRecord = new InpatRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(InpatRecord record)
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
		public InpatRecord get(int index)
		{
			return (InpatRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class InpatRecord
	{
		public String Pkey = "";
		public String Hcpcode = "";
		public String Rescode = "";
		public String Snm = "";
		public String Conf = "";
		public String Amen = "";
		public String Addt = "";
		public String Adtm = "";
		public String Adso = "";
		public String Sevr = "";
		public String Ltdt = "";
		public String Eddt = "";
		public String Mors = "";
		public String Hlfl = "";
		public String Detn = "";
		public String Pflg = "";
		public String Gflg = "";
		public String Plbk = "";
		public String Spcd = "";
		public String Refr = "";
		public String Stay = "";
		public String Reas = "";
		public String Comm = "";
		public String Xcom = "";
		public String Srq1 = "";
		public String Srq2 = "";
		public String Srq3 = "";
		public String Srq4 = "";
		public String Srq5 = "";
		public String Srq6 = "";
		public String Srq7 = "";
		public String Srq8 = "";
		public String Intn = "";
		public String Stat = "";
		public String Acco = "";
		public String Lttm = "";
		public String Exdt = "";
		public String Extm = "";
		public String Chap = "";
		public String Hcpname = "";
		public String Resmnem = "";
		public String Resname = "";
		public String Titl = "";
		public String Fnm1 = "";
		public String Fnm2 = "";
		public String Dob = "";
		public String Sex = "";
		public String Flag = "";
		public String Nhsnum = "";
		public String Epid = "";
		public String Lgls = "";
		public String Mcat = "";
		public String Maxno = "";
		public String Hospnum = "";
		public String Patalert = "";
		public String Admt = "";
		public String Adsc = "";
		public String Dsmt = "";
		public String Dsds = "";
		public String Epen = "";
		public String Eetm = "";
		public String Rfcd = "";
		public String Cflup = "";
		public String Cfl = "";
		public String Cflcomm = "";
		public String Sprg = "";
		public String Pcpa = "";
		public String Bookremv = "";
		public String Bookdate = "";
		public String Booktime = "";
		public String Rrea = "";
		public String Outc = "";
		public String Btyp = "";
		public String Desc = "";
		public String Congmcn = "";
		public String Ocsc = "";
		public String Rect = "";
		public String Ethc = "";
		public String Clin = "";
		public String Adsctxt = "";
		public String Wardhpcd = "";
		public String Hcpmnem = "";
		public String Refrname = "";
		public String Condpbn = "";
		public String Rtpstat = "";
		public String Rtpendt = "";
		public String Rttstop = "";
		public String Dspn = "";
		public String Drdt = "";
		public String Gdcn = "";
		public String Webadt = "";
				
		
		public void clear()
		{
			Pkey = "";
			Hcpcode = "";
			Rescode = "";
			Snm = "";
			Conf = "";
			Amen = "";
			Addt = "";
			Adtm = "";
			Adso = "";
			Sevr = "";
			Ltdt = "";
			Eddt = "";
			Mors = "";
			Hlfl = "";
			Detn = "";
			Pflg = "";
			Gflg = "";
			Plbk = "";
			Spcd = "";
			Refr = "";
			Stay = "";
			Reas = "";
			Comm = "";
			Xcom = "";
			Srq1 = "";
			Srq2 = "";
			Srq3 = "";
			Srq4 = "";
			Srq5 = "";
			Srq6 = "";
			Srq7 = "";
			Srq8 = "";
			Intn = "";
			Stat = "";
			Acco = "";
			Lttm = "";
			Exdt = "";
			Extm = "";
			Chap = "";
			Hcpname = "";
			Resmnem = "";
			Resname = "";
			Titl = "";
			Fnm1 = "";
			Fnm2 = "";
			Dob = "";
			Sex = "";
			Flag = "";
			Nhsnum = "";
			Epid = "";
			Lgls = "";
			Mcat = "";
			Maxno = "";
			Hospnum = "";
			Patalert = "";
			Admt = "";
			Adsc = "";
			Dsmt = "";
			Dsds = "";
			Epen = "";
			Eetm = "";
			Rfcd = "";
			Cflup = "";
			Cfl = "";
			Cflcomm = "";
			Sprg = "";
			Pcpa = "";
			Bookremv = "";
			Bookdate = "";
			Booktime = "";
			Rrea = "";
			Outc = "";
			Btyp = "";
			Desc = "";
			Congmcn = "";
			Ocsc = "";
			Rect = "";
			Ethc = "";
			Clin = "";
			Adsctxt = "";
			Wardhpcd = "";
			Hcpmnem = "";
			Refrname = "";
			Condpbn = "";
			Rtpstat = "";
			Rtpendt = "";
			Rttstop = "";
			Dspn = "";
			Drdt = "";
			Gdcn = "";
			Webadt = "";
			
		}		
	}
		
		
	public final class InpatFilter
	{			
		public String Pkey = "";
		public String Hcpcode = "";
		public String Rescode = "";
		public String Snm = "";
		public String Conf = "";
		public String Amen = "";
		public String Addt = "";
		public String Adtm = "";
		public String Adso = "";
		public String Sevr = "";
		public String Ltdt = "";
		public String Eddt = "";
		public String Mors = "";
		public String Hlfl = "";
		public String Detn = "";
		public String Pflg = "";
		public String Gflg = "";
		public String Plbk = "";
		public String Spcd = "";
		public String Refr = "";
		public String Stay = "";
		public String Reas = "";
		public String Comm = "";
		public String Xcom = "";
		public String Srq1 = "";
		public String Srq2 = "";
		public String Srq3 = "";
		public String Srq4 = "";
		public String Srq5 = "";
		public String Srq6 = "";
		public String Srq7 = "";
		public String Srq8 = "";
		public String Intn = "";
		public String Stat = "";
		public String Acco = "";
		public String Lttm = "";
		public String Exdt = "";
		public String Extm = "";
		public String Chap = "";
		public String Hcpname = "";
		public String Resmnem = "";
		public String Resname = "";
		public String Titl = "";
		public String Fnm1 = "";
		public String Fnm2 = "";
		public String Dob = "";
		public String Sex = "";
		public String Flag = "";
		public String Nhsnum = "";
		public String Epid = "";
		public String Lgls = "";
		public String Mcat = "";
		public String Maxno = "";
		public String Hospnum = "";
		public String Patalert = "";
		public String Admt = "";
		public String Adsc = "";
		public String Dsmt = "";
		public String Dsds = "";
		public String Epen = "";
		public String Eetm = "";
		public String Rfcd = "";
		public String Cflup = "";
		public String Cfl = "";
		public String Cflcomm = "";
		public String Sprg = "";
		public String Pcpa = "";
		public String Bookremv = "";
		public String Bookdate = "";
		public String Booktime = "";
		public String Rrea = "";
		public String Outc = "";
		public String Btyp = "";
		public String Desc = "";
		public String Congmcn = "";
		public String Ocsc = "";
		public String Rect = "";
		public String Ethc = "";
		public String Clin = "";
		public String Adsctxt = "";
		public String Wardhpcd = "";
		public String Hcpmnem = "";
		public String Refrname = "";
		public String Condpbn = "";
		public String Rtpstat = "";
		public String Rtpendt = "";
		public String Rttstop = "";
		public String Dspn = "";
		public String Drdt = "";
		public String Gdcn = "";
		public String Webadt = "";
		
		public void clear()
		{				
			Pkey = "";
			Hcpcode = "";
			Rescode = "";
			Snm = "";
			Conf = "";
			Amen = "";
			Addt = "";
			Adtm = "";
			Adso = "";
			Sevr = "";
			Ltdt = "";
			Eddt = "";
			Mors = "";
			Hlfl = "";
			Detn = "";
			Pflg = "";
			Gflg = "";
			Plbk = "";
			Spcd = "";
			Refr = "";
			Stay = "";
			Reas = "";
			Comm = "";
			Xcom = "";
			Srq1 = "";
			Srq2 = "";
			Srq3 = "";
			Srq4 = "";
			Srq5 = "";
			Srq6 = "";
			Srq7 = "";
			Srq8 = "";
			Intn = "";
			Stat = "";
			Acco = "";
			Lttm = "";
			Exdt = "";
			Extm = "";
			Chap = "";
			Hcpname = "";
			Resmnem = "";
			Resname = "";
			Titl = "";
			Fnm1 = "";
			Fnm2 = "";
			Dob = "";
			Sex = "";
			Flag = "";
			Nhsnum = "";
			Epid = "";
			Lgls = "";
			Mcat = "";
			Maxno = "";
			Hospnum = "";
			Patalert = "";
			Admt = "";
			Adsc = "";
			Dsmt = "";
			Dsds = "";
			Epen = "";
			Eetm = "";
			Rfcd = "";
			Cflup = "";
			Cfl = "";
			Cflcomm = "";
			Sprg = "";
			Pcpa = "";
			Bookremv = "";
			Bookdate = "";
			Booktime = "";
			Rrea = "";
			Outc = "";
			Btyp = "";
			Desc = "";
			Congmcn = "";
			Ocsc = "";
			Rect = "";
			Ethc = "";
			Clin = "";
			Adsctxt = "";
			Wardhpcd = "";
			Hcpmnem = "";
			Refrname = "";
			Condpbn = "";
			Rtpstat = "";
			Rtpendt = "";
			Rttstop = "";
			Dspn = "";
			Drdt = "";
			Gdcn = "";
			Webadt = "";
		}	
		public InpatFilter cloneObject()
		{
			InpatFilter newFilter = new InpatFilter();
			
			newFilter.Pkey = this.Pkey;
			newFilter.Hcpcode = this.Hcpcode;
			newFilter.Rescode = this.Rescode;
			newFilter.Snm = this.Snm;
			newFilter.Conf = this.Conf;
			newFilter.Amen = this.Amen;
			newFilter.Addt = this.Addt;
			newFilter.Adtm = this.Adtm;
			newFilter.Adso = this.Adso;
			newFilter.Sevr = this.Sevr;
			newFilter.Ltdt = this.Ltdt;
			newFilter.Eddt = this.Eddt;
			newFilter.Mors = this.Mors;
			newFilter.Hlfl = this.Hlfl;
			newFilter.Detn = this.Detn;
			newFilter.Pflg = this.Pflg;
			newFilter.Gflg = this.Gflg;
			newFilter.Plbk = this.Plbk;
			newFilter.Spcd = this.Spcd;
			newFilter.Refr = this.Refr;
			newFilter.Stay = this.Stay;
			newFilter.Reas = this.Reas;
			newFilter.Comm = this.Comm;
			newFilter.Xcom = this.Xcom;
			newFilter.Srq1 = this.Srq1;
			newFilter.Srq2 = this.Srq2;
			newFilter.Srq3 = this.Srq3;
			newFilter.Srq4 = this.Srq4;
			newFilter.Srq5 = this.Srq5;
			newFilter.Srq6 = this.Srq6;
			newFilter.Srq7 = this.Srq7;
			newFilter.Srq8 = this.Srq8;
			newFilter.Intn = this.Intn;
			newFilter.Stat = this.Stat;
			newFilter.Acco = this.Acco;
			newFilter.Lttm = this.Lttm;
			newFilter.Exdt = this.Exdt;
			newFilter.Extm = this.Extm;
			newFilter.Chap = this.Chap;
			newFilter.Hcpname = this.Hcpname;
			newFilter.Resmnem = this.Resmnem;
			newFilter.Resname = this.Resname;
			newFilter.Titl = this.Titl;
			newFilter.Fnm1 = this.Fnm1;
			newFilter.Fnm2 = this.Fnm2;
			newFilter.Dob = this.Dob;
			newFilter.Sex = this.Sex;
			newFilter.Flag = this.Flag;
			newFilter.Nhsnum = this.Nhsnum;
			newFilter.Epid = this.Epid;
			newFilter.Lgls = this.Lgls;
			newFilter.Mcat = this.Mcat;
			newFilter.Maxno = this.Maxno;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Patalert = this.Patalert;
			newFilter.Admt = this.Admt;
			newFilter.Adsc = this.Adsc;
			newFilter.Dsmt = this.Dsmt;
			newFilter.Dsds = this.Dsds;
			newFilter.Epen = this.Epen;
			newFilter.Eetm = this.Eetm;
			newFilter.Rfcd = this.Rfcd;
			newFilter.Cflup = this.Cflup;
			newFilter.Cfl = this.Cfl;
			newFilter.Cflcomm = this.Cflcomm;
			newFilter.Sprg = this.Sprg;
			newFilter.Pcpa = this.Pcpa;
			newFilter.Bookremv = this.Bookremv;
			newFilter.Bookdate = this.Bookdate;
			newFilter.Booktime = this.Booktime;
			newFilter.Rrea = this.Rrea;
			newFilter.Outc = this.Outc;
			newFilter.Btyp = this.Btyp;
			newFilter.Desc = this.Desc;
			newFilter.Congmcn = this.Congmcn;
			newFilter.Ocsc = this.Ocsc;
			newFilter.Rect = this.Rect;
			newFilter.Ethc = this.Ethc;
			newFilter.Clin = this.Clin;
			newFilter.Adsctxt = this.Adsctxt;
			newFilter.Wardhpcd = this.Wardhpcd;
			newFilter.Hcpmnem = this.Hcpmnem;
			newFilter.Refrname = this.Refrname;
			newFilter.Condpbn = this.Condpbn;
			newFilter.Rtpstat = this.Rtpstat;
			newFilter.Rtpendt = this.Rtpendt;
			newFilter.Rttstop = this.Rttstop;
			newFilter.Dspn = this.Dspn;
			newFilter.Drdt = this.Drdt;
			newFilter.Gdcn = this.Gdcn;
			newFilter.Webadt = this.Webadt;
			
			return newFilter;
		}
	}
	public final class InpatEditFilter
	{			
		public boolean IncludePkey = true;
		public boolean IncludeHcpcode = true;
		public boolean IncludeRescode = true;
		public boolean IncludeSnm = true;
		public boolean IncludeConf = true;
		public boolean IncludeAmen = true;
		public boolean IncludeAddt = true;
		public boolean IncludeAdtm = true;
		public boolean IncludeAdso = true;
		public boolean IncludeSevr = true;
		public boolean IncludeLtdt = true;
		public boolean IncludeEddt = true;
		public boolean IncludeMors = true;
		public boolean IncludeHlfl = true;
		public boolean IncludeDetn = true;
		public boolean IncludePflg = true;
		public boolean IncludeGflg = true;
		public boolean IncludePlbk = true;
		public boolean IncludeSpcd = true;
		public boolean IncludeRefr = true;
		public boolean IncludeStay = true;
		public boolean IncludeReas = true;
		public boolean IncludeComm = true;
		public boolean IncludeXcom = true;
		public boolean IncludeSrq1 = true;
		public boolean IncludeSrq2 = true;
		public boolean IncludeSrq3 = true;
		public boolean IncludeSrq4 = true;
		public boolean IncludeSrq5 = true;
		public boolean IncludeSrq6 = true;
		public boolean IncludeSrq7 = true;
		public boolean IncludeSrq8 = true;
		public boolean IncludeIntn = true;
		public boolean IncludeStat = true;
		public boolean IncludeAcco = true;
		public boolean IncludeLttm = true;
		public boolean IncludeExdt = true;
		public boolean IncludeExtm = true;
		public boolean IncludeChap = true;
		public boolean IncludeHcpname = true;
		public boolean IncludeResmnem = true;
		public boolean IncludeResname = true;
		public boolean IncludeTitl = true;
		public boolean IncludeFnm1 = true;
		public boolean IncludeFnm2 = true;
		public boolean IncludeDob = true;
		public boolean IncludeSex = true;
		public boolean IncludeFlag = true;
		public boolean IncludeNhsnum = true;
		public boolean IncludeEpid = true;
		public boolean IncludeLgls = true;
		public boolean IncludeMcat = true;
		public boolean IncludeMaxno = true;
		public boolean IncludeHospnum = true;
		public boolean IncludePatalert = true;
		public boolean IncludeAdmt = true;
		public boolean IncludeAdsc = true;
		public boolean IncludeDsmt = true;
		public boolean IncludeDsds = true;
		public boolean IncludeEpen = true;
		public boolean IncludeEetm = true;
		public boolean IncludeRfcd = true;
		public boolean IncludeCflup = true;
		public boolean IncludeCfl = true;
		public boolean IncludeCflcomm = true;
		public boolean IncludeSprg = true;
		public boolean IncludePcpa = true;
		public boolean IncludeBookremv = true;
		public boolean IncludeBookdate = true;
		public boolean IncludeBooktime = true;
		public boolean IncludeRrea = true;
		public boolean IncludeOutc = true;
		public boolean IncludeBtyp = true;
		public boolean IncludeDesc = true;
		public boolean IncludeCongmcn = true;
		public boolean IncludeOcsc = true;
		public boolean IncludeRect = true;
		public boolean IncludeEthc = true;
		public boolean IncludeClin = true;
		public boolean IncludeAdsctxt = true;
		public boolean IncludeWardhpcd = true;
		public boolean IncludeHcpmnem = true;
		public boolean IncludeRefrname = true;
		public boolean IncludeCondpbn = true;
		public boolean IncludeRtpstat = true;
		public boolean IncludeRtpendt = true;
		public boolean IncludeRttstop = true;
		public boolean IncludeDspn = true;
		public boolean IncludeDrdt = true;
		public boolean IncludeGdcn = true;
		public boolean IncludeWebadt = true;
		
		public void includeAll()
		{				
			IncludePkey = true;
			IncludeHcpcode = true;
			IncludeRescode = true;
			IncludeSnm = true;
			IncludeConf = true;
			IncludeAmen = true;
			IncludeAddt = true;
			IncludeAdtm = true;
			IncludeAdso = true;
			IncludeSevr = true;
			IncludeLtdt = true;
			IncludeEddt = true;
			IncludeMors = true;
			IncludeHlfl = true;
			IncludeDetn = true;
			IncludePflg = true;
			IncludeGflg = true;
			IncludePlbk = true;
			IncludeSpcd = true;
			IncludeRefr = true;
			IncludeStay = true;
			IncludeReas = true;
			IncludeComm = true;
			IncludeXcom = true;
			IncludeSrq1 = true;
			IncludeSrq2 = true;
			IncludeSrq3 = true;
			IncludeSrq4 = true;
			IncludeSrq5 = true;
			IncludeSrq6 = true;
			IncludeSrq7 = true;
			IncludeSrq8 = true;
			IncludeIntn = true;
			IncludeStat = true;
			IncludeAcco = true;
			IncludeLttm = true;
			IncludeExdt = true;
			IncludeExtm = true;
			IncludeChap = true;
			IncludeHcpname = true;
			IncludeResmnem = true;
			IncludeResname = true;
			IncludeTitl = true;
			IncludeFnm1 = true;
			IncludeFnm2 = true;
			IncludeDob = true;
			IncludeSex = true;
			IncludeFlag = true;
			IncludeNhsnum = true;
			IncludeEpid = true;
			IncludeLgls = true;
			IncludeMcat = true;
			IncludeMaxno = true;
			IncludeHospnum = true;
			IncludePatalert = true;
			IncludeAdmt = true;
			IncludeAdsc = true;
			IncludeDsmt = true;
			IncludeDsds = true;
			IncludeEpen = true;
			IncludeEetm = true;
			IncludeRfcd = true;
			IncludeCflup = true;
			IncludeCfl = true;
			IncludeCflcomm = true;
			IncludeSprg = true;
			IncludePcpa = true;
			IncludeBookremv = true;
			IncludeBookdate = true;
			IncludeBooktime = true;
			IncludeRrea = true;
			IncludeOutc = true;
			IncludeBtyp = true;
			IncludeDesc = true;
			IncludeCongmcn = true;
			IncludeOcsc = true;
			IncludeRect = true;
			IncludeEthc = true;
			IncludeClin = true;
			IncludeAdsctxt = true;
			IncludeWardhpcd = true;
			IncludeHcpmnem = true;
			IncludeRefrname = true;
			IncludeCondpbn = true;
			IncludeRtpstat = true;
			IncludeRtpendt = true;
			IncludeRttstop = true;
			IncludeDspn = true;
			IncludeDrdt = true;
			IncludeGdcn = true;
			IncludeWebadt = true;
		}	
		public void excludeAll()
		{				
			IncludePkey = false;
			IncludeHcpcode = false;
			IncludeRescode = false;
			IncludeSnm = false;
			IncludeConf = false;
			IncludeAmen = false;
			IncludeAddt = false;
			IncludeAdtm = false;
			IncludeAdso = false;
			IncludeSevr = false;
			IncludeLtdt = false;
			IncludeEddt = false;
			IncludeMors = false;
			IncludeHlfl = false;
			IncludeDetn = false;
			IncludePflg = false;
			IncludeGflg = false;
			IncludePlbk = false;
			IncludeSpcd = false;
			IncludeRefr = false;
			IncludeStay = false;
			IncludeReas = false;
			IncludeComm = false;
			IncludeXcom = false;
			IncludeSrq1 = false;
			IncludeSrq2 = false;
			IncludeSrq3 = false;
			IncludeSrq4 = false;
			IncludeSrq5 = false;
			IncludeSrq6 = false;
			IncludeSrq7 = false;
			IncludeSrq8 = false;
			IncludeIntn = false;
			IncludeStat = false;
			IncludeAcco = false;
			IncludeLttm = false;
			IncludeExdt = false;
			IncludeExtm = false;
			IncludeChap = false;
			IncludeHcpname = false;
			IncludeResmnem = false;
			IncludeResname = false;
			IncludeTitl = false;
			IncludeFnm1 = false;
			IncludeFnm2 = false;
			IncludeDob = false;
			IncludeSex = false;
			IncludeFlag = false;
			IncludeNhsnum = false;
			IncludeEpid = false;
			IncludeLgls = false;
			IncludeMcat = false;
			IncludeMaxno = false;
			IncludeHospnum = false;
			IncludePatalert = false;
			IncludeAdmt = false;
			IncludeAdsc = false;
			IncludeDsmt = false;
			IncludeDsds = false;
			IncludeEpen = false;
			IncludeEetm = false;
			IncludeRfcd = false;
			IncludeCflup = false;
			IncludeCfl = false;
			IncludeCflcomm = false;
			IncludeSprg = false;
			IncludePcpa = false;
			IncludeBookremv = false;
			IncludeBookdate = false;
			IncludeBooktime = false;
			IncludeRrea = false;
			IncludeOutc = false;
			IncludeBtyp = false;
			IncludeDesc = false;
			IncludeCongmcn = false;
			IncludeOcsc = false;
			IncludeRect = false;
			IncludeEthc = false;
			IncludeClin = false;
			IncludeAdsctxt = false;
			IncludeWardhpcd = false;
			IncludeHcpmnem = false;
			IncludeRefrname = false;
			IncludeCondpbn = false;
			IncludeRtpstat = false;
			IncludeRtpendt = false;
			IncludeRttstop = false;
			IncludeDspn = false;
			IncludeDrdt = false;
			IncludeGdcn = false;
			IncludeWebadt = false;
		}
		public InpatEditFilter cloneObject()
		{
			InpatEditFilter newEditFilter = new InpatEditFilter();
			
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeHcpcode = this.IncludeHcpcode;
			newEditFilter.IncludeRescode = this.IncludeRescode;
			newEditFilter.IncludeSnm = this.IncludeSnm;
			newEditFilter.IncludeConf = this.IncludeConf;
			newEditFilter.IncludeAmen = this.IncludeAmen;
			newEditFilter.IncludeAddt = this.IncludeAddt;
			newEditFilter.IncludeAdtm = this.IncludeAdtm;
			newEditFilter.IncludeAdso = this.IncludeAdso;
			newEditFilter.IncludeSevr = this.IncludeSevr;
			newEditFilter.IncludeLtdt = this.IncludeLtdt;
			newEditFilter.IncludeEddt = this.IncludeEddt;
			newEditFilter.IncludeMors = this.IncludeMors;
			newEditFilter.IncludeHlfl = this.IncludeHlfl;
			newEditFilter.IncludeDetn = this.IncludeDetn;
			newEditFilter.IncludePflg = this.IncludePflg;
			newEditFilter.IncludeGflg = this.IncludeGflg;
			newEditFilter.IncludePlbk = this.IncludePlbk;
			newEditFilter.IncludeSpcd = this.IncludeSpcd;
			newEditFilter.IncludeRefr = this.IncludeRefr;
			newEditFilter.IncludeStay = this.IncludeStay;
			newEditFilter.IncludeReas = this.IncludeReas;
			newEditFilter.IncludeComm = this.IncludeComm;
			newEditFilter.IncludeXcom = this.IncludeXcom;
			newEditFilter.IncludeSrq1 = this.IncludeSrq1;
			newEditFilter.IncludeSrq2 = this.IncludeSrq2;
			newEditFilter.IncludeSrq3 = this.IncludeSrq3;
			newEditFilter.IncludeSrq4 = this.IncludeSrq4;
			newEditFilter.IncludeSrq5 = this.IncludeSrq5;
			newEditFilter.IncludeSrq6 = this.IncludeSrq6;
			newEditFilter.IncludeSrq7 = this.IncludeSrq7;
			newEditFilter.IncludeSrq8 = this.IncludeSrq8;
			newEditFilter.IncludeIntn = this.IncludeIntn;
			newEditFilter.IncludeStat = this.IncludeStat;
			newEditFilter.IncludeAcco = this.IncludeAcco;
			newEditFilter.IncludeLttm = this.IncludeLttm;
			newEditFilter.IncludeExdt = this.IncludeExdt;
			newEditFilter.IncludeExtm = this.IncludeExtm;
			newEditFilter.IncludeChap = this.IncludeChap;
			newEditFilter.IncludeHcpname = this.IncludeHcpname;
			newEditFilter.IncludeResmnem = this.IncludeResmnem;
			newEditFilter.IncludeResname = this.IncludeResname;
			newEditFilter.IncludeTitl = this.IncludeTitl;
			newEditFilter.IncludeFnm1 = this.IncludeFnm1;
			newEditFilter.IncludeFnm2 = this.IncludeFnm2;
			newEditFilter.IncludeDob = this.IncludeDob;
			newEditFilter.IncludeSex = this.IncludeSex;
			newEditFilter.IncludeFlag = this.IncludeFlag;
			newEditFilter.IncludeNhsnum = this.IncludeNhsnum;
			newEditFilter.IncludeEpid = this.IncludeEpid;
			newEditFilter.IncludeLgls = this.IncludeLgls;
			newEditFilter.IncludeMcat = this.IncludeMcat;
			newEditFilter.IncludeMaxno = this.IncludeMaxno;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludePatalert = this.IncludePatalert;
			newEditFilter.IncludeAdmt = this.IncludeAdmt;
			newEditFilter.IncludeAdsc = this.IncludeAdsc;
			newEditFilter.IncludeDsmt = this.IncludeDsmt;
			newEditFilter.IncludeDsds = this.IncludeDsds;
			newEditFilter.IncludeEpen = this.IncludeEpen;
			newEditFilter.IncludeEetm = this.IncludeEetm;
			newEditFilter.IncludeRfcd = this.IncludeRfcd;
			newEditFilter.IncludeCflup = this.IncludeCflup;
			newEditFilter.IncludeCfl = this.IncludeCfl;
			newEditFilter.IncludeCflcomm = this.IncludeCflcomm;
			newEditFilter.IncludeSprg = this.IncludeSprg;
			newEditFilter.IncludePcpa = this.IncludePcpa;
			newEditFilter.IncludeBookremv = this.IncludeBookremv;
			newEditFilter.IncludeBookdate = this.IncludeBookdate;
			newEditFilter.IncludeBooktime = this.IncludeBooktime;
			newEditFilter.IncludeRrea = this.IncludeRrea;
			newEditFilter.IncludeOutc = this.IncludeOutc;
			newEditFilter.IncludeBtyp = this.IncludeBtyp;
			newEditFilter.IncludeDesc = this.IncludeDesc;
			newEditFilter.IncludeCongmcn = this.IncludeCongmcn;
			newEditFilter.IncludeOcsc = this.IncludeOcsc;
			newEditFilter.IncludeRect = this.IncludeRect;
			newEditFilter.IncludeEthc = this.IncludeEthc;
			newEditFilter.IncludeClin = this.IncludeClin;
			newEditFilter.IncludeAdsctxt = this.IncludeAdsctxt;
			newEditFilter.IncludeWardhpcd = this.IncludeWardhpcd;
			newEditFilter.IncludeHcpmnem = this.IncludeHcpmnem;
			newEditFilter.IncludeRefrname = this.IncludeRefrname;
			newEditFilter.IncludeCondpbn = this.IncludeCondpbn;
			newEditFilter.IncludeRtpstat = this.IncludeRtpstat;
			newEditFilter.IncludeRtpendt = this.IncludeRtpendt;
			newEditFilter.IncludeRttstop = this.IncludeRttstop;
			newEditFilter.IncludeDspn = this.IncludeDspn;
			newEditFilter.IncludeDrdt = this.IncludeDrdt;
			newEditFilter.IncludeGdcn = this.IncludeGdcn;
			newEditFilter.IncludeWebadt = this.IncludeWebadt;
			
			return newEditFilter;
		}
	}
}
