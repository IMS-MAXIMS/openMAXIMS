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

public final class Onc_symptoms implements ims.vo.ImsCloneable
{
	private Onc_symptomsFilter lastGetFilter = null;
	private final String serviceName = "ONC_SYMPTOMS";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Onc_symptomsFilter Filter = new Onc_symptomsFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Onc_symptomsEditFilter EditFilter = new Onc_symptomsEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Onc_symptomsCollection DataCollection = new Onc_symptomsCollection();

	/**
	 * Creates a new Onc_symptoms Data Transfer Object.
	 */ 
	public Onc_symptoms(ims.dto.Connection connection)
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
	public Onc_symptoms cloneObject()
	{
		Onc_symptoms cloneObject = new Onc_symptoms(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Symp_id = DataCollection.get(x).Symp_id;
			cloneObject.DataCollection.get(index).Pkey = DataCollection.get(x).Pkey;
			cloneObject.DataCollection.get(index).Vis_typ = DataCollection.get(x).Vis_typ;
			cloneObject.DataCollection.get(index).Vis_id = DataCollection.get(x).Vis_id;
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Rhcp = DataCollection.get(x).Rhcp;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Uhcp = DataCollection.get(x).Uhcp;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Modu = DataCollection.get(x).Modu;
			cloneObject.DataCollection.get(index).Ccs_epid = DataCollection.get(x).Ccs_epid;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Resolved = DataCollection.get(x).Resolved;
			cloneObject.DataCollection.get(index).Res_vis_id = DataCollection.get(x).Res_vis_id;
			cloneObject.DataCollection.get(index).Spec = DataCollection.get(x).Spec;
			cloneObject.DataCollection.get(index).Symtyp = DataCollection.get(x).Symtyp;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Duration = DataCollection.get(x).Duration;
			cloneObject.DataCollection.get(index).Durtyp = DataCollection.get(x).Durtyp;
			cloneObject.DataCollection.get(index).Symdate = DataCollection.get(x).Symdate;
			cloneObject.DataCollection.get(index).Symlat = DataCollection.get(x).Symlat;
			cloneObject.DataCollection.get(index).Symptm = DataCollection.get(x).Symptm;
			cloneObject.DataCollection.get(index).Symptmtxt = DataCollection.get(x).Symptmtxt;
							
			
			for(int iSeqno = 0; iSeqno < DataCollection.get(x).SeqnoCollection.count(); iSeqno++)
			{
				int rIndex = cloneObject.DataCollection.get(index).SeqnoCollection.add();
					
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Seqno = DataCollection.get(x).SeqnoCollection.get(iSeqno).Seqno;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Bswdate = DataCollection.get(x).SeqnoCollection.get(iSeqno).Bswdate;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Condition = DataCollection.get(x).SeqnoCollection.get(iSeqno).Condition;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Condcomment = DataCollection.get(x).SeqnoCollection.get(iSeqno).Condcomment;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Condactive = DataCollection.get(x).SeqnoCollection.get(iSeqno).Condactive;
				cloneObject.DataCollection.get(index).SeqnoCollection.get(rIndex).Visit_id = DataCollection.get(x).SeqnoCollection.get(iSeqno).Visit_id;
										
			}
			
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
		return "Onc_symptoms.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_symptoms.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Onc_symptoms.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_symptoms.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_symptoms.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_symptoms.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Onc_symptoms.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Onc_symptoms.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_symptoms.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Onc_symptoms.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Onc_symptoms.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Onc_symptoms.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Onc_symptoms.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Onc_symptoms.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_symptoms.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Onc_symptoms.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Onc_symptoms.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Onc_symptoms.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Onc_symptoms.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Onc_symptoms.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_symptoms.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Onc_symptoms.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Onc_symptoms.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_symptoms.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Onc_symptoms.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Onc_symptoms.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Onc_symptoms.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_symptoms.List");
							
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
	private String encodeNASFilter(Onc_symptomsFilter filter)
	{
		if(filter == null)
			return "";
			
		String filterString = "";
		
		if(Filter.Symp_id != null && filter.Symp_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SYMP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Symp_id;
		}
		
		if(Filter.Pkey != null && filter.Pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pkey;
		}
		
		if(Filter.Vis_typ != null && filter.Vis_typ.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "VIS_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Vis_typ;
		}
		
		if(Filter.Vis_id != null && filter.Vis_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "VIS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Vis_id;
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
		
		if(Filter.Utim != null && filter.Utim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Utim;
		}
		
		if(Filter.Udat != null && filter.Udat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Udat;
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
		
		if(Filter.Modu != null && filter.Modu.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modu;
		}
		
		if(Filter.Ccs_epid != null && filter.Ccs_epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccs_epid;
		}
		
		if(Filter.Active != null && filter.Active.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Active;
		}
		
		if(Filter.Resolved != null && filter.Resolved.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RESOLVED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Resolved;
		}
		
		if(Filter.Res_vis_id != null && filter.Res_vis_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RES_VIS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Res_vis_id;
		}
		
		if(Filter.Spec != null && filter.Spec.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPEC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Spec;
		}
		
		if(Filter.Symtyp != null && filter.Symtyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SYMTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Symtyp;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Duration != null && filter.Duration.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DURATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Duration;
		}
		
		if(Filter.Durtyp != null && filter.Durtyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DURTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Durtyp;
		}
		
		if(Filter.Symdate != null && filter.Symdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SYMDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Symdate;
		}
		
		if(Filter.Symlat != null && filter.Symlat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SYMLAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Symlat;
		}
		
		if(Filter.Symptm != null && filter.Symptm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SYMPTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Symptm;
		}
		
		if(Filter.Symptmtxt != null && filter.Symptmtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SYMPTMTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Symptmtxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Onc_symptomsRecord data = (Onc_symptomsRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeSymp_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SYMP_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Symp_id);
		}
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey);
		}
		
		if(EditFilter.IncludeVis_typ)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "VIS_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Vis_typ);
		}
		
		if(EditFilter.IncludeVis_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "VIS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Vis_id);
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
		
		if(EditFilter.IncludeUtim)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Utim);
		}
		
		if(EditFilter.IncludeUdat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Udat);
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
		
		if(EditFilter.IncludeModu)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modu);
		}
		
		if(EditFilter.IncludeCcs_epid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CCS_EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccs_epid);
		}
		
		if(EditFilter.IncludeActive)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Active);
		}
		
		if(EditFilter.IncludeResolved)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RESOLVED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Resolved);
		}
		
		if(EditFilter.IncludeRes_vis_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RES_VIS_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Res_vis_id);
		}
		
		if(EditFilter.IncludeSpec)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPEC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Spec);
		}
		
		if(EditFilter.IncludeSymtyp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SYMTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Symtyp);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeDuration)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DURATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Duration);
		}
		
		if(EditFilter.IncludeDurtyp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DURTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Durtyp);
		}
		
		if(EditFilter.IncludeSymdate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SYMDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Symdate);
		}
		
		if(EditFilter.IncludeSymlat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SYMLAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Symlat);
		}
		
		if(EditFilter.IncludeSymptm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SYMPTM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Symptm);
		}
		
		if(EditFilter.IncludeSymptmtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SYMPTMTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Symptmtxt);
		}
		
		
		for(int x = 0; x < data.SeqnoCollection.count(); x++)
		{
			Onc_symptomsSeqnoRecord rgRecord = (Onc_symptomsSeqnoRecord)data.SeqnoCollection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BSWDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Bswdate);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONDITION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Condition);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONDCOMMENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Condcomment);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONDACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Condactive);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "VISIT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Visit_id);
			
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
			Onc_symptomsRecord record = new Onc_symptomsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Symp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYMP_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Vis_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VIS_TYP"));
			record.Vis_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VIS_ID"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Resolved = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESOLVED"));
			record.Res_vis_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_VIS_ID"));
			record.Spec = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPEC"));
			record.Symtyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYMTYP"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Duration = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DURATION"));
			record.Durtyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DURTYP"));
			record.Symdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYMDATE"));
			record.Symlat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYMLAT"));
			record.Symptm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYMPTM"));
			record.Symptmtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYMPTMTXT"));
									
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
			Onc_symptomsRecord record = new Onc_symptomsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Symp_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYMP_ID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Vis_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VIS_TYP"));
			record.Vis_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "VIS_ID"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ccs_epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCS_EPID"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Resolved = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RESOLVED"));
			record.Res_vis_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RES_VIS_ID"));
			record.Spec = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPEC"));
			record.Symtyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYMTYP"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Duration = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DURATION"));
			record.Durtyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DURTYP"));
			record.Symdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYMDATE"));
			record.Symlat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYMLAT"));
			record.Symptm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYMPTM"));
			record.Symptmtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SYMPTMTXT"));
									
			
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
						Onc_symptomsSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Seqno = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("bswdate"))
					{
						Onc_symptomsSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Bswdate = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("condition"))
					{
						Onc_symptomsSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Condition = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("condcomment"))
					{
						Onc_symptomsSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Condcomment = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("condactive"))
					{
						Onc_symptomsSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Condactive = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("visit_id"))
					{
						Onc_symptomsSeqnoRecord rgRecord = record.SeqnoCollection.get(recCount);
						rgRecord.Visit_id = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Onc_symptomsCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_symptomsRecord newRecord = new Onc_symptomsRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_symptomsRecord record)
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
		public Onc_symptomsRecord get(int index)
		{
			return (Onc_symptomsRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Onc_symptomsRecord
	{
		public String Symp_id = "";
		public String Pkey = "";
		public String Vis_typ = "";
		public String Vis_id = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Utim = "";
		public String Udat = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Modu = "";
		public String Ccs_epid = "";
		public String Active = "";
		public String Resolved = "";
		public String Res_vis_id = "";
		public String Spec = "";
		public String Symtyp = "";
		public String Tstp = "";
		public String Duration = "";
		public String Durtyp = "";
		public String Symdate = "";
		public String Symlat = "";
		public String Symptm = "";
		public String Symptmtxt = "";
		
		public Onc_symptomsSeqnoCollection SeqnoCollection = new Onc_symptomsSeqnoCollection();		
		
		public void clear()
		{
			Symp_id = "";
			Pkey = "";
			Vis_typ = "";
			Vis_id = "";
			Cdat = "";
			Ctim = "";
			Rhcp = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Utim = "";
			Udat = "";
			Uhcp = "";
			Uusr = "";
			Modu = "";
			Ccs_epid = "";
			Active = "";
			Resolved = "";
			Res_vis_id = "";
			Spec = "";
			Symtyp = "";
			Tstp = "";
			Duration = "";
			Durtyp = "";
			Symdate = "";
			Symlat = "";
			Symptm = "";
			Symptmtxt = "";
			
			SeqnoCollection.clear();
		}		
	}
	
	public final class Onc_symptomsSeqnoCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_symptomsSeqnoRecord newRecord = new Onc_symptomsSeqnoRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_symptomsSeqnoRecord record)
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
		public Onc_symptomsSeqnoRecord get(int index)
		{
			return (Onc_symptomsSeqnoRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Onc_symptomsSeqnoRecord
	{
		public String Seqno = "";
		public String Bswdate = "";
		public String Condition = "";
		public String Condcomment = "";
		public String Condactive = "";
		public String Visit_id = "";
		
		public void clear()
		{
			Seqno = "";
			Bswdate = "";
			Condition = "";
			Condcomment = "";
			Condactive = "";
			Visit_id = "";
			
		}
	}	
	public final class Onc_symptomsFilter
	{			
		public String Symp_id = "";
		public String Pkey = "";
		public String Vis_typ = "";
		public String Vis_id = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Rhcp = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Utim = "";
		public String Udat = "";
		public String Uhcp = "";
		public String Uusr = "";
		public String Modu = "";
		public String Ccs_epid = "";
		public String Active = "";
		public String Resolved = "";
		public String Res_vis_id = "";
		public String Spec = "";
		public String Symtyp = "";
		public String Tstp = "";
		public String Duration = "";
		public String Durtyp = "";
		public String Symdate = "";
		public String Symlat = "";
		public String Symptm = "";
		public String Symptmtxt = "";
		
		public void clear()
		{				
			Symp_id = "";
			Pkey = "";
			Vis_typ = "";
			Vis_id = "";
			Cdat = "";
			Ctim = "";
			Rhcp = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Utim = "";
			Udat = "";
			Uhcp = "";
			Uusr = "";
			Modu = "";
			Ccs_epid = "";
			Active = "";
			Resolved = "";
			Res_vis_id = "";
			Spec = "";
			Symtyp = "";
			Tstp = "";
			Duration = "";
			Durtyp = "";
			Symdate = "";
			Symlat = "";
			Symptm = "";
			Symptmtxt = "";
		}	
		public Onc_symptomsFilter cloneObject()
		{
			Onc_symptomsFilter newFilter = new Onc_symptomsFilter();
			
			newFilter.Symp_id = this.Symp_id;
			newFilter.Pkey = this.Pkey;
			newFilter.Vis_typ = this.Vis_typ;
			newFilter.Vis_id = this.Vis_id;
			newFilter.Cdat = this.Cdat;
			newFilter.Ctim = this.Ctim;
			newFilter.Rhcp = this.Rhcp;
			newFilter.Rusr = this.Rusr;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Utim = this.Utim;
			newFilter.Udat = this.Udat;
			newFilter.Uhcp = this.Uhcp;
			newFilter.Uusr = this.Uusr;
			newFilter.Modu = this.Modu;
			newFilter.Ccs_epid = this.Ccs_epid;
			newFilter.Active = this.Active;
			newFilter.Resolved = this.Resolved;
			newFilter.Res_vis_id = this.Res_vis_id;
			newFilter.Spec = this.Spec;
			newFilter.Symtyp = this.Symtyp;
			newFilter.Tstp = this.Tstp;
			newFilter.Duration = this.Duration;
			newFilter.Durtyp = this.Durtyp;
			newFilter.Symdate = this.Symdate;
			newFilter.Symlat = this.Symlat;
			newFilter.Symptm = this.Symptm;
			newFilter.Symptmtxt = this.Symptmtxt;
			
			return newFilter;
		}
	}
	public final class Onc_symptomsEditFilter
	{			
		public boolean IncludeSymp_id = true;
		public boolean IncludePkey = true;
		public boolean IncludeVis_typ = true;
		public boolean IncludeVis_id = true;
		public boolean IncludeCdat = true;
		public boolean IncludeCtim = true;
		public boolean IncludeRhcp = true;
		public boolean IncludeRusr = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeUtim = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUhcp = true;
		public boolean IncludeUusr = true;
		public boolean IncludeModu = true;
		public boolean IncludeCcs_epid = true;
		public boolean IncludeActive = true;
		public boolean IncludeResolved = true;
		public boolean IncludeRes_vis_id = true;
		public boolean IncludeSpec = true;
		public boolean IncludeSymtyp = true;
		public boolean IncludeTstp = true;
		public boolean IncludeDuration = true;
		public boolean IncludeDurtyp = true;
		public boolean IncludeSymdate = true;
		public boolean IncludeSymlat = true;
		public boolean IncludeSymptm = true;
		public boolean IncludeSymptmtxt = true;
		
		public void includeAll()
		{				
			IncludeSymp_id = true;
			IncludePkey = true;
			IncludeVis_typ = true;
			IncludeVis_id = true;
			IncludeCdat = true;
			IncludeCtim = true;
			IncludeRhcp = true;
			IncludeRusr = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeUtim = true;
			IncludeUdat = true;
			IncludeUhcp = true;
			IncludeUusr = true;
			IncludeModu = true;
			IncludeCcs_epid = true;
			IncludeActive = true;
			IncludeResolved = true;
			IncludeRes_vis_id = true;
			IncludeSpec = true;
			IncludeSymtyp = true;
			IncludeTstp = true;
			IncludeDuration = true;
			IncludeDurtyp = true;
			IncludeSymdate = true;
			IncludeSymlat = true;
			IncludeSymptm = true;
			IncludeSymptmtxt = true;
		}	
		public void excludeAll()
		{				
			IncludeSymp_id = false;
			IncludePkey = false;
			IncludeVis_typ = false;
			IncludeVis_id = false;
			IncludeCdat = false;
			IncludeCtim = false;
			IncludeRhcp = false;
			IncludeRusr = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeUtim = false;
			IncludeUdat = false;
			IncludeUhcp = false;
			IncludeUusr = false;
			IncludeModu = false;
			IncludeCcs_epid = false;
			IncludeActive = false;
			IncludeResolved = false;
			IncludeRes_vis_id = false;
			IncludeSpec = false;
			IncludeSymtyp = false;
			IncludeTstp = false;
			IncludeDuration = false;
			IncludeDurtyp = false;
			IncludeSymdate = false;
			IncludeSymlat = false;
			IncludeSymptm = false;
			IncludeSymptmtxt = false;
		}
		public Onc_symptomsEditFilter cloneObject()
		{
			Onc_symptomsEditFilter newEditFilter = new Onc_symptomsEditFilter();
			
			newEditFilter.IncludeSymp_id = this.IncludeSymp_id;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeVis_typ = this.IncludeVis_typ;
			newEditFilter.IncludeVis_id = this.IncludeVis_id;
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeRhcp = this.IncludeRhcp;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUhcp = this.IncludeUhcp;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeModu = this.IncludeModu;
			newEditFilter.IncludeCcs_epid = this.IncludeCcs_epid;
			newEditFilter.IncludeActive = this.IncludeActive;
			newEditFilter.IncludeResolved = this.IncludeResolved;
			newEditFilter.IncludeRes_vis_id = this.IncludeRes_vis_id;
			newEditFilter.IncludeSpec = this.IncludeSpec;
			newEditFilter.IncludeSymtyp = this.IncludeSymtyp;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeDuration = this.IncludeDuration;
			newEditFilter.IncludeDurtyp = this.IncludeDurtyp;
			newEditFilter.IncludeSymdate = this.IncludeSymdate;
			newEditFilter.IncludeSymlat = this.IncludeSymlat;
			newEditFilter.IncludeSymptm = this.IncludeSymptm;
			newEditFilter.IncludeSymptmtxt = this.IncludeSymptmtxt;
			
			return newEditFilter;
		}
	}
}
