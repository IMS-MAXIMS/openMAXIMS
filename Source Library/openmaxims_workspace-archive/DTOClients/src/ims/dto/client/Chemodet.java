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
// Template ver. 1.0.6 - Last modified on 25/05/2004 15:00 by Marius Mihalec

package ims.dto.client;

public final class Chemodet
{
	private ChemodetFilter lastGetFilter = null;
	private final String serviceName = "CHEMODET";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public ChemodetFilter Filter = new ChemodetFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public ChemodetEditFilter EditFilter = new ChemodetEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public ChemodetCollection DataCollection = new ChemodetCollection();

	/**
	 * Creates a new Chemodet Data Transfer Object.
	 */ 
	public Chemodet(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Chemodet cloneObject() throws ims.dto.Exception
	{
		Chemodet cloneObject = new Chemodet(Connection);
			
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
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Rhcp = DataCollection.get(x).Rhcp;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Uhcp = DataCollection.get(x).Uhcp;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Modu = DataCollection.get(x).Modu;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Ims_del = DataCollection.get(x).Ims_del;
			cloneObject.DataCollection.get(index).Ccs_epid = DataCollection.get(x).Ccs_epid;
			cloneObject.DataCollection.get(index).Hospital = DataCollection.get(x).Hospital;
			cloneObject.DataCollection.get(index).Clin_onc = DataCollection.get(x).Clin_onc;
			cloneObject.DataCollection.get(index).Dectreat = DataCollection.get(x).Dectreat;
			cloneObject.DataCollection.get(index).Trt_intent = DataCollection.get(x).Trt_intent;
			cloneObject.DataCollection.get(index).Ptbodarea = DataCollection.get(x).Ptbodarea;
			cloneObject.DataCollection.get(index).Ptsercr = DataCollection.get(x).Ptsercr;
			cloneObject.DataCollection.get(index).Regime = DataCollection.get(x).Regime;
			cloneObject.DataCollection.get(index).Num_cycles = DataCollection.get(x).Num_cycles;
			cloneObject.DataCollection.get(index).Anum_cycles = DataCollection.get(x).Anum_cycles;
			cloneObject.DataCollection.get(index).Reasdel1 = DataCollection.get(x).Reasdel1;
			cloneObject.DataCollection.get(index).Reasdel2 = DataCollection.get(x).Reasdel2;
			cloneObject.DataCollection.get(index).Startdate = DataCollection.get(x).Startdate;
			cloneObject.DataCollection.get(index).Enddate = DataCollection.get(x).Enddate;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Drug_type = DataCollection.get(x).Drug_type;
			cloneObject.DataCollection.get(index).Pretxchemo = DataCollection.get(x).Pretxchemo;
			cloneObject.DataCollection.get(index).Actenddate = DataCollection.get(x).Actenddate;
			cloneObject.DataCollection.get(index).Pt_act_id = DataCollection.get(x).Pt_act_id;
			cloneObject.DataCollection.get(index).Treatresp = DataCollection.get(x).Treatresp;
			cloneObject.DataCollection.get(index).Reaschangeptx = DataCollection.get(x).Reaschangeptx;
			cloneObject.DataCollection.get(index).Chrgs = DataCollection.get(x).Chrgs;
			cloneObject.DataCollection.get(index).Hospitaltxt = DataCollection.get(x).Hospitaltxt;
			cloneObject.DataCollection.get(index).Regiemetxt = DataCollection.get(x).Regiemetxt;
							
			
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
		return "Chemodet.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Chemodet.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Chemodet.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Chemodet.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Chemodet.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Chemodet.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Chemodet.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Chemodet.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Chemodet.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Chemodet.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Chemodet.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Chemodet.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Chemodet.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Chemodet.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Chemodet.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Chemodet.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Chemodet.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Chemodet.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Chemodet.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Chemodet.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Chemodet.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Chemodet.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Chemodet.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Chemodet.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Chemodet.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Chemodet.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Chemodet.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Chemodet.List");
							
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
	private String encodeNASFilter(ChemodetFilter filter)
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
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey;
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
		
		if(Filter.Rhcp != null && filter.Rhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rhcp;
		}
		
		if(Filter.Rusr != null && filter.Rusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusr;
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
		
		if(Filter.Uhcp != null && filter.Uhcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uhcp;
		}
		
		if(Filter.Uusr != null && filter.Uusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uusr;
		}
		
		if(Filter.Cdat != null && filter.Cdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cdat;
		}
		
		if(Filter.Ctim != null && filter.Ctim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ctim;
		}
		
		if(Filter.Modu != null && filter.Modu.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modu;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Ims_del != null && filter.Ims_del.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "IMS_DEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ims_del;
		}
		
		if(Filter.Ccs_epid != null && filter.Ccs_epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccs_epid;
		}
		
		if(Filter.Hospital != null && filter.Hospital.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HOSPITAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospital;
		}
		
		if(Filter.Clin_onc != null && filter.Clin_onc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLIN_ONC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clin_onc;
		}
		
		if(Filter.Dectreat != null && filter.Dectreat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DECTREAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dectreat;
		}
		
		if(Filter.Trt_intent != null && filter.Trt_intent.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TRT_INTENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Trt_intent;
		}
		
		if(Filter.Ptbodarea != null && filter.Ptbodarea.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PTBODAREA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ptbodarea;
		}
		
		if(Filter.Ptsercr != null && filter.Ptsercr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PTSERCR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ptsercr;
		}
		
		if(Filter.Regime != null && filter.Regime.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REGIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Regime;
		}
		
		if(Filter.Num_cycles != null && filter.Num_cycles.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NUM_CYCLES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Num_cycles;
		}
		
		if(Filter.Anum_cycles != null && filter.Anum_cycles.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ANUM_CYCLES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Anum_cycles;
		}
		
		if(Filter.Reasdel1 != null && filter.Reasdel1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REASDEL1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reasdel1;
		}
		
		if(Filter.Reasdel2 != null && filter.Reasdel2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REASDEL2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reasdel2;
		}
		
		if(Filter.Startdate != null && filter.Startdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STARTDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Startdate;
		}
		
		if(Filter.Enddate != null && filter.Enddate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ENDDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Enddate;
		}
		
		if(Filter.Active != null && filter.Active.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Active;
		}
		
		if(Filter.Drug_type != null && filter.Drug_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DRUG_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Drug_type;
		}
		
		if(Filter.Pretxchemo != null && filter.Pretxchemo.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PRETXCHEMO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pretxchemo;
		}
		
		if(Filter.Actenddate != null && filter.Actenddate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTENDDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Actenddate;
		}
		
		if(Filter.Pt_act_id != null && filter.Pt_act_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PT_ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pt_act_id;
		}
		
		if(Filter.Treatresp != null && filter.Treatresp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TREATRESP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Treatresp;
		}
		
		if(Filter.Reaschangeptx != null && filter.Reaschangeptx.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REASCHANGEPTX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reaschangeptx;
		}
		
		if(Filter.Chrgs != null && filter.Chrgs.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CHRGS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Chrgs;
		}
		
		if(Filter.Hospitaltxt != null && filter.Hospitaltxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HOSPITALTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospitaltxt;
		}
		
		if(Filter.Regiemetxt != null && filter.Regiemetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REGIEMETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Regiemetxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		ChemodetRecord data = (ChemodetRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeUnid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UNID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Unid);
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
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
		
		if(EditFilter.IncludeRhcp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rhcp);
		}
		
		if(EditFilter.IncludeRusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusr);
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
		
		if(EditFilter.IncludeUhcp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uhcp);
		}
		
		if(EditFilter.IncludeUusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uusr);
		}
		
		if(EditFilter.IncludeCdat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cdat);
		}
		
		if(EditFilter.IncludeCtim)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ctim);
		}
		
		if(EditFilter.IncludeModu)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modu);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeIms_del)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "IMS_DEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ims_del);
		}
		
		if(EditFilter.IncludeCcs_epid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccs_epid);
		}
		
		if(EditFilter.IncludeHospital)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HOSPITAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospital);
		}
		
		if(EditFilter.IncludeClin_onc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLIN_ONC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clin_onc);
		}
		
		if(EditFilter.IncludeDectreat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DECTREAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dectreat);
		}
		
		if(EditFilter.IncludeTrt_intent)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TRT_INTENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Trt_intent);
		}
		
		if(EditFilter.IncludePtbodarea)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PTBODAREA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ptbodarea);
		}
		
		if(EditFilter.IncludePtsercr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PTSERCR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ptsercr);
		}
		
		if(EditFilter.IncludeRegime)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REGIME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Regime);
		}
		
		if(EditFilter.IncludeNum_cycles)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NUM_CYCLES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Num_cycles);
		}
		
		if(EditFilter.IncludeAnum_cycles)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ANUM_CYCLES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Anum_cycles);
		}
		
		if(EditFilter.IncludeReasdel1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REASDEL1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reasdel1);
		}
		
		if(EditFilter.IncludeReasdel2)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REASDEL2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reasdel2);
		}
		
		if(EditFilter.IncludeStartdate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STARTDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Startdate);
		}
		
		if(EditFilter.IncludeEnddate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ENDDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Enddate);
		}
		
		if(EditFilter.IncludeActive)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Active);
		}
		
		if(EditFilter.IncludeDrug_type)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DRUG_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Drug_type);
		}
		
		if(EditFilter.IncludePretxchemo)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PRETXCHEMO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pretxchemo);
		}
		
		if(EditFilter.IncludeActenddate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTENDDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Actenddate);
		}
		
		if(EditFilter.IncludePt_act_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PT_ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pt_act_id);
		}
		
		if(EditFilter.IncludeTreatresp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TREATRESP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Treatresp);
		}
		
		if(EditFilter.IncludeReaschangeptx)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REASCHANGEPTX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reaschangeptx);
		}
		
		if(EditFilter.IncludeChrgs)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CHRGS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Chrgs);
		}
		
		if(EditFilter.IncludeHospitaltxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HOSPITALTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospitaltxt);
		}
		
		if(EditFilter.IncludeRegiemetxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REGIEMETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Regiemetxt);
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
			ChemodetRecord record = new ChemodetRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Ims_del = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "IMS_DEL"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Hospital = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPITAL"));
			record.Clin_onc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLIN_ONC"));
			record.Dectreat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DECTREAT"));
			record.Trt_intent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRT_INTENT"));
			record.Ptbodarea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PTBODAREA"));
			record.Ptsercr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PTSERCR"));
			record.Regime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REGIME"));
			record.Num_cycles = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NUM_CYCLES"));
			record.Anum_cycles = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ANUM_CYCLES"));
			record.Reasdel1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REASDEL1"));
			record.Reasdel2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REASDEL2"));
			record.Startdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STARTDATE"));
			record.Enddate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENDDATE"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Drug_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DRUG_TYPE"));
			record.Pretxchemo = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRETXCHEMO"));
			record.Actenddate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTENDDATE"));
			record.Pt_act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PT_ACT_ID"));
			record.Treatresp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TREATRESP"));
			record.Reaschangeptx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REASCHANGEPTX"));
			record.Chrgs = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHRGS"));
			record.Hospitaltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPITALTXT"));
			record.Regiemetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REGIEMETXT"));
									
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
			ChemodetRecord record = new ChemodetRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Ims_del = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "IMS_DEL"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Hospital = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPITAL"));
			record.Clin_onc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLIN_ONC"));
			record.Dectreat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DECTREAT"));
			record.Trt_intent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRT_INTENT"));
			record.Ptbodarea = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PTBODAREA"));
			record.Ptsercr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PTSERCR"));
			record.Regime = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REGIME"));
			record.Num_cycles = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NUM_CYCLES"));
			record.Anum_cycles = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ANUM_CYCLES"));
			record.Reasdel1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REASDEL1"));
			record.Reasdel2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REASDEL2"));
			record.Startdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STARTDATE"));
			record.Enddate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENDDATE"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Drug_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DRUG_TYPE"));
			record.Pretxchemo = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRETXCHEMO"));
			record.Actenddate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTENDDATE"));
			record.Pt_act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PT_ACT_ID"));
			record.Treatresp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TREATRESP"));
			record.Reaschangeptx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REASCHANGEPTX"));
			record.Chrgs = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHRGS"));
			record.Hospitaltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPITALTXT"));
			record.Regiemetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REGIEMETXT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class ChemodetCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			ChemodetRecord newRecord = new ChemodetRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(ChemodetRecord record)
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
		public ChemodetRecord get(int index)
		{
			return (ChemodetRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class ChemodetRecord
	{
		public String Unid = "";
		public String Pkey = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Modu = "";
		public String Tstp = "";
		public String Ims_del = "";
		public String Ccs_epid = "";
		public String Hospital = "";
		public String Clin_onc = "";
		public String Dectreat = "";
		public String Trt_intent = "";
		public String Ptbodarea = "";
		public String Ptsercr = "";
		public String Regime = "";
		public String Num_cycles = "";
		public String Anum_cycles = "";
		public String Reasdel1 = "";
		public String Reasdel2 = "";
		public String Startdate = "";
		public String Enddate = "";
		public String Active = "";
		public String Drug_type = "";
		public String Pretxchemo = "";
		public String Actenddate = "";
		public String Pt_act_id = "";
		public String Treatresp = "";
		public String Reaschangeptx = "";
		public String Chrgs = "";
		public String Hospitaltxt = "";
		public String Regiemetxt = "";
				
		
		public void clear()
		{
			Unid = "";
			Pkey = "";
			Rdat = "";
			Rtim = "";
			Rhcp = "";
			Rusr = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Uusr = "";
			Cdat = "";
			Ctim = "";
			Modu = "";
			Tstp = "";
			Ims_del = "";
			Ccs_epid = "";
			Hospital = "";
			Clin_onc = "";
			Dectreat = "";
			Trt_intent = "";
			Ptbodarea = "";
			Ptsercr = "";
			Regime = "";
			Num_cycles = "";
			Anum_cycles = "";
			Reasdel1 = "";
			Reasdel2 = "";
			Startdate = "";
			Enddate = "";
			Active = "";
			Drug_type = "";
			Pretxchemo = "";
			Actenddate = "";
			Pt_act_id = "";
			Treatresp = "";
			Reaschangeptx = "";
			Chrgs = "";
			Hospitaltxt = "";
			Regiemetxt = "";
			
		}		
	}
		
		
	public final class ChemodetFilter
	{			
		public String Unid = "";
		public String Pkey = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Modu = "";
		public String Tstp = "";
		public String Ims_del = "";
		public String Ccs_epid = "";
		public String Hospital = "";
		public String Clin_onc = "";
		public String Dectreat = "";
		public String Trt_intent = "";
		public String Ptbodarea = "";
		public String Ptsercr = "";
		public String Regime = "";
		public String Num_cycles = "";
		public String Anum_cycles = "";
		public String Reasdel1 = "";
		public String Reasdel2 = "";
		public String Startdate = "";
		public String Enddate = "";
		public String Active = "";
		public String Drug_type = "";
		public String Pretxchemo = "";
		public String Actenddate = "";
		public String Pt_act_id = "";
		public String Treatresp = "";
		public String Reaschangeptx = "";
		public String Chrgs = "";
		public String Hospitaltxt = "";
		public String Regiemetxt = "";
		
		public void clear()
		{				
			Unid = "";
			Pkey = "";
			Rdat = "";
			Rtim = "";
			Rhcp = "";
			Rusr = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Uusr = "";
			Cdat = "";
			Ctim = "";
			Modu = "";
			Tstp = "";
			Ims_del = "";
			Ccs_epid = "";
			Hospital = "";
			Clin_onc = "";
			Dectreat = "";
			Trt_intent = "";
			Ptbodarea = "";
			Ptsercr = "";
			Regime = "";
			Num_cycles = "";
			Anum_cycles = "";
			Reasdel1 = "";
			Reasdel2 = "";
			Startdate = "";
			Enddate = "";
			Active = "";
			Drug_type = "";
			Pretxchemo = "";
			Actenddate = "";
			Pt_act_id = "";
			Treatresp = "";
			Reaschangeptx = "";
			Chrgs = "";
			Hospitaltxt = "";
			Regiemetxt = "";
		}	
		public ChemodetFilter cloneObject()
		{
			ChemodetFilter newFilter = new ChemodetFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Pkey = this.Pkey;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Rhcp = this.Rhcp;
			newFilter.Rusr = this.Rusr;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Uhcp = this.Uhcp;
			newFilter.Uusr = this.Uusr;
			newFilter.Cdat = this.Cdat;
			newFilter.Ctim = this.Ctim;
			newFilter.Modu = this.Modu;
			newFilter.Tstp = this.Tstp;
			newFilter.Ims_del = this.Ims_del;
			newFilter.Ccs_epid = this.Ccs_epid;
			newFilter.Hospital = this.Hospital;
			newFilter.Clin_onc = this.Clin_onc;
			newFilter.Dectreat = this.Dectreat;
			newFilter.Trt_intent = this.Trt_intent;
			newFilter.Ptbodarea = this.Ptbodarea;
			newFilter.Ptsercr = this.Ptsercr;
			newFilter.Regime = this.Regime;
			newFilter.Num_cycles = this.Num_cycles;
			newFilter.Anum_cycles = this.Anum_cycles;
			newFilter.Reasdel1 = this.Reasdel1;
			newFilter.Reasdel2 = this.Reasdel2;
			newFilter.Startdate = this.Startdate;
			newFilter.Enddate = this.Enddate;
			newFilter.Active = this.Active;
			newFilter.Drug_type = this.Drug_type;
			newFilter.Pretxchemo = this.Pretxchemo;
			newFilter.Actenddate = this.Actenddate;
			newFilter.Pt_act_id = this.Pt_act_id;
			newFilter.Treatresp = this.Treatresp;
			newFilter.Reaschangeptx = this.Reaschangeptx;
			newFilter.Chrgs = this.Chrgs;
			newFilter.Hospitaltxt = this.Hospitaltxt;
			newFilter.Regiemetxt = this.Regiemetxt;
			
			return newFilter;
		}
	}
	public final class ChemodetEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludePkey = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeRhcp = true;
		public boolean IncludeRusr = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeUhcp = true;
		public boolean IncludeUusr = true;
		public boolean IncludeCdat = true;
		public boolean IncludeCtim = true;
		public boolean IncludeModu = true;
		public boolean IncludeTstp = true;
		public boolean IncludeIms_del = true;
		public boolean IncludeCcs_epid = true;
		public boolean IncludeHospital = true;
		public boolean IncludeClin_onc = true;
		public boolean IncludeDectreat = true;
		public boolean IncludeTrt_intent = true;
		public boolean IncludePtbodarea = true;
		public boolean IncludePtsercr = true;
		public boolean IncludeRegime = true;
		public boolean IncludeNum_cycles = true;
		public boolean IncludeAnum_cycles = true;
		public boolean IncludeReasdel1 = true;
		public boolean IncludeReasdel2 = true;
		public boolean IncludeStartdate = true;
		public boolean IncludeEnddate = true;
		public boolean IncludeActive = true;
		public boolean IncludeDrug_type = true;
		public boolean IncludePretxchemo = true;
		public boolean IncludeActenddate = true;
		public boolean IncludePt_act_id = true;
		public boolean IncludeTreatresp = true;
		public boolean IncludeReaschangeptx = true;
		public boolean IncludeChrgs = true;
		public boolean IncludeHospitaltxt = true;
		public boolean IncludeRegiemetxt = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludePkey = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeRhcp = true;
			IncludeRusr = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeUhcp = true;
			IncludeUusr = true;
			IncludeCdat = true;
			IncludeCtim = true;
			IncludeModu = true;
			IncludeTstp = true;
			IncludeIms_del = true;
			IncludeCcs_epid = true;
			IncludeHospital = true;
			IncludeClin_onc = true;
			IncludeDectreat = true;
			IncludeTrt_intent = true;
			IncludePtbodarea = true;
			IncludePtsercr = true;
			IncludeRegime = true;
			IncludeNum_cycles = true;
			IncludeAnum_cycles = true;
			IncludeReasdel1 = true;
			IncludeReasdel2 = true;
			IncludeStartdate = true;
			IncludeEnddate = true;
			IncludeActive = true;
			IncludeDrug_type = true;
			IncludePretxchemo = true;
			IncludeActenddate = true;
			IncludePt_act_id = true;
			IncludeTreatresp = true;
			IncludeReaschangeptx = true;
			IncludeChrgs = true;
			IncludeHospitaltxt = true;
			IncludeRegiemetxt = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludePkey = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeRhcp = false;
			IncludeRusr = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeUhcp = false;
			IncludeUusr = false;
			IncludeCdat = false;
			IncludeCtim = false;
			IncludeModu = false;
			IncludeTstp = false;
			IncludeIms_del = false;
			IncludeCcs_epid = false;
			IncludeHospital = false;
			IncludeClin_onc = false;
			IncludeDectreat = false;
			IncludeTrt_intent = false;
			IncludePtbodarea = false;
			IncludePtsercr = false;
			IncludeRegime = false;
			IncludeNum_cycles = false;
			IncludeAnum_cycles = false;
			IncludeReasdel1 = false;
			IncludeReasdel2 = false;
			IncludeStartdate = false;
			IncludeEnddate = false;
			IncludeActive = false;
			IncludeDrug_type = false;
			IncludePretxchemo = false;
			IncludeActenddate = false;
			IncludePt_act_id = false;
			IncludeTreatresp = false;
			IncludeReaschangeptx = false;
			IncludeChrgs = false;
			IncludeHospitaltxt = false;
			IncludeRegiemetxt = false;
		}
		public ChemodetEditFilter cloneObject()
		{
			ChemodetEditFilter newEditFilter = new ChemodetEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeRhcp = this.IncludeRhcp;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeUhcp = this.IncludeUhcp;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeModu = this.IncludeModu;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeIms_del = this.IncludeIms_del;
			newEditFilter.IncludeCcs_epid = this.IncludeCcs_epid;
			newEditFilter.IncludeHospital = this.IncludeHospital;
			newEditFilter.IncludeClin_onc = this.IncludeClin_onc;
			newEditFilter.IncludeDectreat = this.IncludeDectreat;
			newEditFilter.IncludeTrt_intent = this.IncludeTrt_intent;
			newEditFilter.IncludePtbodarea = this.IncludePtbodarea;
			newEditFilter.IncludePtsercr = this.IncludePtsercr;
			newEditFilter.IncludeRegime = this.IncludeRegime;
			newEditFilter.IncludeNum_cycles = this.IncludeNum_cycles;
			newEditFilter.IncludeAnum_cycles = this.IncludeAnum_cycles;
			newEditFilter.IncludeReasdel1 = this.IncludeReasdel1;
			newEditFilter.IncludeReasdel2 = this.IncludeReasdel2;
			newEditFilter.IncludeStartdate = this.IncludeStartdate;
			newEditFilter.IncludeEnddate = this.IncludeEnddate;
			newEditFilter.IncludeActive = this.IncludeActive;
			newEditFilter.IncludeDrug_type = this.IncludeDrug_type;
			newEditFilter.IncludePretxchemo = this.IncludePretxchemo;
			newEditFilter.IncludeActenddate = this.IncludeActenddate;
			newEditFilter.IncludePt_act_id = this.IncludePt_act_id;
			newEditFilter.IncludeTreatresp = this.IncludeTreatresp;
			newEditFilter.IncludeReaschangeptx = this.IncludeReaschangeptx;
			newEditFilter.IncludeChrgs = this.IncludeChrgs;
			newEditFilter.IncludeHospitaltxt = this.IncludeHospitaltxt;
			newEditFilter.IncludeRegiemetxt = this.IncludeRegiemetxt;
			
			return newEditFilter;
		}
	}
}
