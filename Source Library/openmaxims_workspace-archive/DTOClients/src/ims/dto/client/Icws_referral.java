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

public final class Icws_referral
{
	private Icws_referralFilter lastGetFilter = null;
	private final String serviceName = "ICWS_REFERRAL";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Icws_referralFilter Filter = new Icws_referralFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Icws_referralEditFilter EditFilter = new Icws_referralEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Icws_referralCollection DataCollection = new Icws_referralCollection();

	/**
	 * Creates a new Icws_referral Data Transfer Object.
	 */ 
	public Icws_referral(ims.dto.Connection connection) throws ims.dto.Exception
	{	
		if(connection == null)
			throw new ims.dto.Exception("Invalid Data Transfer Object Connection");
		this.Connection = connection;
	}
	/**
	 * Creates a new copy of the current Data Transfer Object
	 */
	public Icws_referral cloneObject() throws ims.dto.Exception
	{
		Icws_referral cloneObject = new Icws_referral(Connection);
			
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
			cloneObject.DataCollection.get(index).Epid = DataCollection.get(x).Epid;
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Modu = DataCollection.get(x).Modu;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Refsource = DataCollection.get(x).Refsource;
			cloneObject.DataCollection.get(index).Refsorg = DataCollection.get(x).Refsorg;
			cloneObject.DataCollection.get(index).Refshcp = DataCollection.get(x).Refshcp;
			cloneObject.DataCollection.get(index).Refsspec = DataCollection.get(x).Refsspec;
			cloneObject.DataCollection.get(index).Reftorg = DataCollection.get(x).Reftorg;
			cloneObject.DataCollection.get(index).Reftcons = DataCollection.get(x).Reftcons;
			cloneObject.DataCollection.get(index).Reftspec = DataCollection.get(x).Reftspec;
			cloneObject.DataCollection.get(index).Reftype = DataCollection.get(x).Reftype;
			cloneObject.DataCollection.get(index).Refreason = DataCollection.get(x).Refreason;
			cloneObject.DataCollection.get(index).Refidate = DataCollection.get(x).Refidate;
			cloneObject.DataCollection.get(index).Refrdate = DataCollection.get(x).Refrdate;
			cloneObject.DataCollection.get(index).Refpriority = DataCollection.get(x).Refpriority;
			cloneObject.DataCollection.get(index).Refdatefs = DataCollection.get(x).Refdatefs;
			cloneObject.DataCollection.get(index).Refbrtarget = DataCollection.get(x).Refbrtarget;
			cloneObject.DataCollection.get(index).Refparent = DataCollection.get(x).Refparent;
			cloneObject.DataCollection.get(index).Refhcptyp = DataCollection.get(x).Refhcptyp;
			cloneObject.DataCollection.get(index).Orgtxt = DataCollection.get(x).Orgtxt;
			cloneObject.DataCollection.get(index).Hcptxt = DataCollection.get(x).Hcptxt;
			cloneObject.DataCollection.get(index).Refsorgtxt = DataCollection.get(x).Refsorgtxt;
			cloneObject.DataCollection.get(index).Refshcptxt = DataCollection.get(x).Refshcptxt;
			cloneObject.DataCollection.get(index).Rorgextcde = DataCollection.get(x).Rorgextcde;
			cloneObject.DataCollection.get(index).Refhcpextcde = DataCollection.get(x).Refhcpextcde;
			cloneObject.DataCollection.get(index).Hcpextcde = DataCollection.get(x).Hcpextcde;
			cloneObject.DataCollection.get(index).Orgextcde = DataCollection.get(x).Orgextcde;
			cloneObject.DataCollection.get(index).Titltxt = DataCollection.get(x).Titltxt;
			cloneObject.DataCollection.get(index).Snm = DataCollection.get(x).Snm;
			cloneObject.DataCollection.get(index).Fnm = DataCollection.get(x).Fnm;
			cloneObject.DataCollection.get(index).Fnm1 = DataCollection.get(x).Fnm1;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Dod = DataCollection.get(x).Dod;
			cloneObject.DataCollection.get(index).Frstapptdt = DataCollection.get(x).Frstapptdt;
							
			
			for(int iSeqn1 = 0; iSeqn1 < DataCollection.get(x).Seqn1Collection.count(); iSeqn1++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqn1Collection.add();
					
				cloneObject.DataCollection.get(index).Seqn1Collection.get(rIndex).Seqn1 = DataCollection.get(x).Seqn1Collection.get(iSeqn1).Seqn1;
				cloneObject.DataCollection.get(index).Seqn1Collection.get(rIndex).Refdelayreas = DataCollection.get(x).Seqn1Collection.get(iSeqn1).Refdelayreas;
										
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
		return "Icws_referral.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Icws_referral.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Icws_referral.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Icws_referral.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Icws_referral.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Icws_referral.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Icws_referral.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Icws_referral.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Icws_referral.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Icws_referral.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Icws_referral.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Icws_referral.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Icws_referral.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Icws_referral.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Icws_referral.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Icws_referral.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Icws_referral.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Icws_referral.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Icws_referral.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Icws_referral.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Icws_referral.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Icws_referral.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Icws_referral.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Icws_referral.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Icws_referral.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Icws_referral.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Icws_referral.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Icws_referral.List");
							
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
	private String encodeNASFilter(Icws_referralFilter filter)
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
		
		if(Filter.Epid != null && filter.Epid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Epid;
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
		
		if(Filter.Uusr != null && filter.Uusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uusr;
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
		
		if(Filter.Active != null && filter.Active.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Active;
		}
		
		if(Filter.Refsource != null && filter.Refsource.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFSOURCE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refsource;
		}
		
		if(Filter.Refsorg != null && filter.Refsorg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFSORG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refsorg;
		}
		
		if(Filter.Refshcp != null && filter.Refshcp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFSHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refshcp;
		}
		
		if(Filter.Refsspec != null && filter.Refsspec.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFSSPEC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refsspec;
		}
		
		if(Filter.Reftorg != null && filter.Reftorg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFTORG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reftorg;
		}
		
		if(Filter.Reftcons != null && filter.Reftcons.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFTCONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reftcons;
		}
		
		if(Filter.Reftspec != null && filter.Reftspec.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFTSPEC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reftspec;
		}
		
		if(Filter.Reftype != null && filter.Reftype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reftype;
		}
		
		if(Filter.Refreason != null && filter.Refreason.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFREASON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refreason;
		}
		
		if(Filter.Refidate != null && filter.Refidate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFIDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refidate;
		}
		
		if(Filter.Refrdate != null && filter.Refrdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFRDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refrdate;
		}
		
		if(Filter.Refpriority != null && filter.Refpriority.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFPRIORITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refpriority;
		}
		
		if(Filter.Refdatefs != null && filter.Refdatefs.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFDATEFS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refdatefs;
		}
		
		if(Filter.Refbrtarget != null && filter.Refbrtarget.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFBRTARGET" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refbrtarget;
		}
		
		if(Filter.Refparent != null && filter.Refparent.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFPARENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refparent;
		}
		
		if(Filter.Refhcptyp != null && filter.Refhcptyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFHCPTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refhcptyp;
		}
		
		if(Filter.Orgtxt != null && filter.Orgtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORGTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Orgtxt;
		}
		
		if(Filter.Hcptxt != null && filter.Hcptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcptxt;
		}
		
		if(Filter.Refsorgtxt != null && filter.Refsorgtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFSORGTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refsorgtxt;
		}
		
		if(Filter.Refshcptxt != null && filter.Refshcptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFSHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refshcptxt;
		}
		
		if(Filter.Rorgextcde != null && filter.Rorgextcde.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RORGEXTCDE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rorgextcde;
		}
		
		if(Filter.Refhcpextcde != null && filter.Refhcpextcde.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "REFHCPEXTCDE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Refhcpextcde;
		}
		
		if(Filter.Hcpextcde != null && filter.Hcpextcde.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HCPEXTCDE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hcpextcde;
		}
		
		if(Filter.Orgextcde != null && filter.Orgextcde.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORGEXTCDE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Orgextcde;
		}
		
		if(Filter.Titltxt != null && filter.Titltxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TITLTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Titltxt;
		}
		
		if(Filter.Snm != null && filter.Snm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Snm;
		}
		
		if(Filter.Fnm != null && filter.Fnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fnm;
		}
		
		if(Filter.Fnm1 != null && filter.Fnm1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fnm1;
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum;
		}
		
		if(Filter.Dob != null && filter.Dob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dob;
		}
		
		if(Filter.Dod != null && filter.Dod.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dod;
		}
		
		if(Filter.Frstapptdt != null && filter.Frstapptdt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FRSTAPPTDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Frstapptdt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Icws_referralRecord data = (Icws_referralRecord)DataCollection.get(0);
		
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
		
		if(EditFilter.IncludeEpid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "EPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Epid);
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
		
		if(EditFilter.IncludeUusr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uusr);
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
		
		if(EditFilter.IncludeActive)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Active);
		}
		
		if(EditFilter.IncludeRefsource)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFSOURCE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refsource);
		}
		
		if(EditFilter.IncludeRefsorg)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFSORG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refsorg);
		}
		
		if(EditFilter.IncludeRefshcp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFSHCP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refshcp);
		}
		
		if(EditFilter.IncludeRefsspec)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFSSPEC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refsspec);
		}
		
		if(EditFilter.IncludeReftorg)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFTORG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reftorg);
		}
		
		if(EditFilter.IncludeReftcons)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFTCONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reftcons);
		}
		
		if(EditFilter.IncludeReftspec)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFTSPEC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reftspec);
		}
		
		if(EditFilter.IncludeReftype)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reftype);
		}
		
		if(EditFilter.IncludeRefreason)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFREASON" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refreason);
		}
		
		if(EditFilter.IncludeRefidate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFIDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refidate);
		}
		
		if(EditFilter.IncludeRefrdate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFRDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refrdate);
		}
		
		if(EditFilter.IncludeRefpriority)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFPRIORITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refpriority);
		}
		
		if(EditFilter.IncludeRefdatefs)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFDATEFS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refdatefs);
		}
		
		if(EditFilter.IncludeRefbrtarget)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFBRTARGET" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refbrtarget);
		}
		
		if(EditFilter.IncludeRefparent)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFPARENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refparent);
		}
		
		if(EditFilter.IncludeRefhcptyp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFHCPTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refhcptyp);
		}
		
		if(EditFilter.IncludeOrgtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORGTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Orgtxt);
		}
		
		if(EditFilter.IncludeHcptxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcptxt);
		}
		
		if(EditFilter.IncludeRefsorgtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFSORGTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refsorgtxt);
		}
		
		if(EditFilter.IncludeRefshcptxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFSHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refshcptxt);
		}
		
		if(EditFilter.IncludeRorgextcde)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RORGEXTCDE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rorgextcde);
		}
		
		if(EditFilter.IncludeRefhcpextcde)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFHCPEXTCDE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Refhcpextcde);
		}
		
		if(EditFilter.IncludeHcpextcde)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HCPEXTCDE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hcpextcde);
		}
		
		if(EditFilter.IncludeOrgextcde)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORGEXTCDE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Orgextcde);
		}
		
		if(EditFilter.IncludeTitltxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TITLTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Titltxt);
		}
		
		if(EditFilter.IncludeSnm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Snm);
		}
		
		if(EditFilter.IncludeFnm)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "FNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fnm);
		}
		
		if(EditFilter.IncludeFnm1)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "FNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fnm1);
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum);
		}
		
		if(EditFilter.IncludeDob)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dob);
		}
		
		if(EditFilter.IncludeDod)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dod);
		}
		
		if(EditFilter.IncludeFrstapptdt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "FRSTAPPTDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Frstapptdt);
		}
		
		
		for(int x = 0; x < data.Seqn1Collection.count(); x++)
		{
			Icws_referralSeqn1Record rgRecord = (Icws_referralSeqn1Record)data.Seqn1Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQN1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqn1);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "REFDELAYREAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Refdelayreas);
			
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
			Icws_referralRecord record = new Icws_referralRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPID"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Refsource = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFSOURCE"));
			record.Refsorg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFSORG"));
			record.Refshcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFSHCP"));
			record.Refsspec = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFSSPEC"));
			record.Reftorg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFTORG"));
			record.Reftcons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFTCONS"));
			record.Reftspec = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFTSPEC"));
			record.Reftype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFTYPE"));
			record.Refreason = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFREASON"));
			record.Refidate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFIDATE"));
			record.Refrdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFRDATE"));
			record.Refpriority = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFPRIORITY"));
			record.Refdatefs = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFDATEFS"));
			record.Refbrtarget = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFBRTARGET"));
			record.Refparent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFPARENT"));
			record.Refhcptyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFHCPTYP"));
			record.Orgtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORGTXT"));
			record.Hcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPTXT"));
			record.Refsorgtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFSORGTXT"));
			record.Refshcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFSHCPTXT"));
			record.Rorgextcde = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RORGEXTCDE"));
			record.Refhcpextcde = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFHCPEXTCDE"));
			record.Hcpextcde = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPEXTCDE"));
			record.Orgextcde = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORGEXTCDE"));
			record.Titltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLTXT"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Dod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOD"));
			record.Frstapptdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FRSTAPPTDT"));
									
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
			Icws_referralRecord record = new Icws_referralRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Epid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPID"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Refsource = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFSOURCE"));
			record.Refsorg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFSORG"));
			record.Refshcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFSHCP"));
			record.Refsspec = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFSSPEC"));
			record.Reftorg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFTORG"));
			record.Reftcons = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFTCONS"));
			record.Reftspec = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFTSPEC"));
			record.Reftype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFTYPE"));
			record.Refreason = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFREASON"));
			record.Refidate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFIDATE"));
			record.Refrdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFRDATE"));
			record.Refpriority = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFPRIORITY"));
			record.Refdatefs = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFDATEFS"));
			record.Refbrtarget = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFBRTARGET"));
			record.Refparent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFPARENT"));
			record.Refhcptyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFHCPTYP"));
			record.Orgtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORGTXT"));
			record.Hcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPTXT"));
			record.Refsorgtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFSORGTXT"));
			record.Refshcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFSHCPTXT"));
			record.Rorgextcde = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RORGEXTCDE"));
			record.Refhcpextcde = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REFHCPEXTCDE"));
			record.Hcpextcde = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HCPEXTCDE"));
			record.Orgextcde = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORGEXTCDE"));
			record.Titltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLTXT"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Dod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOD"));
			record.Frstapptdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FRSTAPPTDT"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqn1"))
					record.Seqn1Collection.add();
			
									
			rgCount = record.Seqn1Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqn1"))
					{
						Icws_referralSeqn1Record rgRecord = record.Seqn1Collection.get(recCount);
						rgRecord.Seqn1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("refdelayreas"))
					{
						Icws_referralSeqn1Record rgRecord = record.Seqn1Collection.get(recCount);
						rgRecord.Refdelayreas = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Icws_referralCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Icws_referralRecord newRecord = new Icws_referralRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Icws_referralRecord record)
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
		public Icws_referralRecord get(int index)
		{
			return (Icws_referralRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Icws_referralRecord
	{
		public String Unid = "";
		public String Pkey = "";
		public String Epid = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Uusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Modu = "";
		public String Tstp = "";
		public String Active = "";
		public String Refsource = "";
		public String Refsorg = "";
		public String Refshcp = "";
		public String Refsspec = "";
		public String Reftorg = "";
		public String Reftcons = "";
		public String Reftspec = "";
		public String Reftype = "";
		public String Refreason = "";
		public String Refidate = "";
		public String Refrdate = "";
		public String Refpriority = "";
		public String Refdatefs = "";
		public String Refbrtarget = "";
		public String Refparent = "";
		public String Refhcptyp = "";
		public String Orgtxt = "";
		public String Hcptxt = "";
		public String Refsorgtxt = "";
		public String Refshcptxt = "";
		public String Rorgextcde = "";
		public String Refhcpextcde = "";
		public String Hcpextcde = "";
		public String Orgextcde = "";
		public String Titltxt = "";
		public String Snm = "";
		public String Fnm = "";
		public String Fnm1 = "";
		public String Hospnum = "";
		public String Dob = "";
		public String Dod = "";
		public String Frstapptdt = "";
		
		public Icws_referralSeqn1Collection Seqn1Collection = new Icws_referralSeqn1Collection();		
		
		public void clear()
		{
			Unid = "";
			Pkey = "";
			Epid = "";
			Cdat = "";
			Ctim = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Uusr = "";
			Udat = "";
			Utim = "";
			Modu = "";
			Tstp = "";
			Active = "";
			Refsource = "";
			Refsorg = "";
			Refshcp = "";
			Refsspec = "";
			Reftorg = "";
			Reftcons = "";
			Reftspec = "";
			Reftype = "";
			Refreason = "";
			Refidate = "";
			Refrdate = "";
			Refpriority = "";
			Refdatefs = "";
			Refbrtarget = "";
			Refparent = "";
			Refhcptyp = "";
			Orgtxt = "";
			Hcptxt = "";
			Refsorgtxt = "";
			Refshcptxt = "";
			Rorgextcde = "";
			Refhcpextcde = "";
			Hcpextcde = "";
			Orgextcde = "";
			Titltxt = "";
			Snm = "";
			Fnm = "";
			Fnm1 = "";
			Hospnum = "";
			Dob = "";
			Dod = "";
			Frstapptdt = "";
			
			Seqn1Collection.clear();
		}		
	}
	
	public final class Icws_referralSeqn1Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Icws_referralSeqn1Record newRecord = new Icws_referralSeqn1Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Icws_referralSeqn1Record record)
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
		public Icws_referralSeqn1Record get(int index)
		{
			return (Icws_referralSeqn1Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Icws_referralSeqn1Record
	{
		public String Seqn1 = "";
		public String Refdelayreas = "";
		
		public void clear()
		{
			Seqn1 = "";
			Refdelayreas = "";
			
		}
	}	
	public final class Icws_referralFilter
	{			
		public String Unid = "";
		public String Pkey = "";
		public String Epid = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Uusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Modu = "";
		public String Tstp = "";
		public String Active = "";
		public String Refsource = "";
		public String Refsorg = "";
		public String Refshcp = "";
		public String Refsspec = "";
		public String Reftorg = "";
		public String Reftcons = "";
		public String Reftspec = "";
		public String Reftype = "";
		public String Refreason = "";
		public String Refidate = "";
		public String Refrdate = "";
		public String Refpriority = "";
		public String Refdatefs = "";
		public String Refbrtarget = "";
		public String Refparent = "";
		public String Refhcptyp = "";
		public String Orgtxt = "";
		public String Hcptxt = "";
		public String Refsorgtxt = "";
		public String Refshcptxt = "";
		public String Rorgextcde = "";
		public String Refhcpextcde = "";
		public String Hcpextcde = "";
		public String Orgextcde = "";
		public String Titltxt = "";
		public String Snm = "";
		public String Fnm = "";
		public String Fnm1 = "";
		public String Hospnum = "";
		public String Dob = "";
		public String Dod = "";
		public String Frstapptdt = "";
		
		public void clear()
		{				
			Unid = "";
			Pkey = "";
			Epid = "";
			Cdat = "";
			Ctim = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Uusr = "";
			Udat = "";
			Utim = "";
			Modu = "";
			Tstp = "";
			Active = "";
			Refsource = "";
			Refsorg = "";
			Refshcp = "";
			Refsspec = "";
			Reftorg = "";
			Reftcons = "";
			Reftspec = "";
			Reftype = "";
			Refreason = "";
			Refidate = "";
			Refrdate = "";
			Refpriority = "";
			Refdatefs = "";
			Refbrtarget = "";
			Refparent = "";
			Refhcptyp = "";
			Orgtxt = "";
			Hcptxt = "";
			Refsorgtxt = "";
			Refshcptxt = "";
			Rorgextcde = "";
			Refhcpextcde = "";
			Hcpextcde = "";
			Orgextcde = "";
			Titltxt = "";
			Snm = "";
			Fnm = "";
			Fnm1 = "";
			Hospnum = "";
			Dob = "";
			Dod = "";
			Frstapptdt = "";
		}	
		public Icws_referralFilter cloneObject()
		{
			Icws_referralFilter newFilter = new Icws_referralFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Pkey = this.Pkey;
			newFilter.Epid = this.Epid;
			newFilter.Cdat = this.Cdat;
			newFilter.Ctim = this.Ctim;
			newFilter.Rusr = this.Rusr;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Uusr = this.Uusr;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Modu = this.Modu;
			newFilter.Tstp = this.Tstp;
			newFilter.Active = this.Active;
			newFilter.Refsource = this.Refsource;
			newFilter.Refsorg = this.Refsorg;
			newFilter.Refshcp = this.Refshcp;
			newFilter.Refsspec = this.Refsspec;
			newFilter.Reftorg = this.Reftorg;
			newFilter.Reftcons = this.Reftcons;
			newFilter.Reftspec = this.Reftspec;
			newFilter.Reftype = this.Reftype;
			newFilter.Refreason = this.Refreason;
			newFilter.Refidate = this.Refidate;
			newFilter.Refrdate = this.Refrdate;
			newFilter.Refpriority = this.Refpriority;
			newFilter.Refdatefs = this.Refdatefs;
			newFilter.Refbrtarget = this.Refbrtarget;
			newFilter.Refparent = this.Refparent;
			newFilter.Refhcptyp = this.Refhcptyp;
			newFilter.Orgtxt = this.Orgtxt;
			newFilter.Hcptxt = this.Hcptxt;
			newFilter.Refsorgtxt = this.Refsorgtxt;
			newFilter.Refshcptxt = this.Refshcptxt;
			newFilter.Rorgextcde = this.Rorgextcde;
			newFilter.Refhcpextcde = this.Refhcpextcde;
			newFilter.Hcpextcde = this.Hcpextcde;
			newFilter.Orgextcde = this.Orgextcde;
			newFilter.Titltxt = this.Titltxt;
			newFilter.Snm = this.Snm;
			newFilter.Fnm = this.Fnm;
			newFilter.Fnm1 = this.Fnm1;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Dob = this.Dob;
			newFilter.Dod = this.Dod;
			newFilter.Frstapptdt = this.Frstapptdt;
			
			return newFilter;
		}
	}
	public final class Icws_referralEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludePkey = true;
		public boolean IncludeEpid = true;
		public boolean IncludeCdat = true;
		public boolean IncludeCtim = true;
		public boolean IncludeRusr = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeUusr = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeModu = true;
		public boolean IncludeTstp = true;
		public boolean IncludeActive = true;
		public boolean IncludeRefsource = true;
		public boolean IncludeRefsorg = true;
		public boolean IncludeRefshcp = true;
		public boolean IncludeRefsspec = true;
		public boolean IncludeReftorg = true;
		public boolean IncludeReftcons = true;
		public boolean IncludeReftspec = true;
		public boolean IncludeReftype = true;
		public boolean IncludeRefreason = true;
		public boolean IncludeRefidate = true;
		public boolean IncludeRefrdate = true;
		public boolean IncludeRefpriority = true;
		public boolean IncludeRefdatefs = true;
		public boolean IncludeRefbrtarget = true;
		public boolean IncludeRefparent = true;
		public boolean IncludeRefhcptyp = true;
		public boolean IncludeOrgtxt = true;
		public boolean IncludeHcptxt = true;
		public boolean IncludeRefsorgtxt = true;
		public boolean IncludeRefshcptxt = true;
		public boolean IncludeRorgextcde = true;
		public boolean IncludeRefhcpextcde = true;
		public boolean IncludeHcpextcde = true;
		public boolean IncludeOrgextcde = true;
		public boolean IncludeTitltxt = true;
		public boolean IncludeSnm = true;
		public boolean IncludeFnm = true;
		public boolean IncludeFnm1 = true;
		public boolean IncludeHospnum = true;
		public boolean IncludeDob = true;
		public boolean IncludeDod = true;
		public boolean IncludeFrstapptdt = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludePkey = true;
			IncludeEpid = true;
			IncludeCdat = true;
			IncludeCtim = true;
			IncludeRusr = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeUusr = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeModu = true;
			IncludeTstp = true;
			IncludeActive = true;
			IncludeRefsource = true;
			IncludeRefsorg = true;
			IncludeRefshcp = true;
			IncludeRefsspec = true;
			IncludeReftorg = true;
			IncludeReftcons = true;
			IncludeReftspec = true;
			IncludeReftype = true;
			IncludeRefreason = true;
			IncludeRefidate = true;
			IncludeRefrdate = true;
			IncludeRefpriority = true;
			IncludeRefdatefs = true;
			IncludeRefbrtarget = true;
			IncludeRefparent = true;
			IncludeRefhcptyp = true;
			IncludeOrgtxt = true;
			IncludeHcptxt = true;
			IncludeRefsorgtxt = true;
			IncludeRefshcptxt = true;
			IncludeRorgextcde = true;
			IncludeRefhcpextcde = true;
			IncludeHcpextcde = true;
			IncludeOrgextcde = true;
			IncludeTitltxt = true;
			IncludeSnm = true;
			IncludeFnm = true;
			IncludeFnm1 = true;
			IncludeHospnum = true;
			IncludeDob = true;
			IncludeDod = true;
			IncludeFrstapptdt = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludePkey = false;
			IncludeEpid = false;
			IncludeCdat = false;
			IncludeCtim = false;
			IncludeRusr = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeUusr = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeModu = false;
			IncludeTstp = false;
			IncludeActive = false;
			IncludeRefsource = false;
			IncludeRefsorg = false;
			IncludeRefshcp = false;
			IncludeRefsspec = false;
			IncludeReftorg = false;
			IncludeReftcons = false;
			IncludeReftspec = false;
			IncludeReftype = false;
			IncludeRefreason = false;
			IncludeRefidate = false;
			IncludeRefrdate = false;
			IncludeRefpriority = false;
			IncludeRefdatefs = false;
			IncludeRefbrtarget = false;
			IncludeRefparent = false;
			IncludeRefhcptyp = false;
			IncludeOrgtxt = false;
			IncludeHcptxt = false;
			IncludeRefsorgtxt = false;
			IncludeRefshcptxt = false;
			IncludeRorgextcde = false;
			IncludeRefhcpextcde = false;
			IncludeHcpextcde = false;
			IncludeOrgextcde = false;
			IncludeTitltxt = false;
			IncludeSnm = false;
			IncludeFnm = false;
			IncludeFnm1 = false;
			IncludeHospnum = false;
			IncludeDob = false;
			IncludeDod = false;
			IncludeFrstapptdt = false;
		}
		public Icws_referralEditFilter cloneObject()
		{
			Icws_referralEditFilter newEditFilter = new Icws_referralEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeEpid = this.IncludeEpid;
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeModu = this.IncludeModu;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeActive = this.IncludeActive;
			newEditFilter.IncludeRefsource = this.IncludeRefsource;
			newEditFilter.IncludeRefsorg = this.IncludeRefsorg;
			newEditFilter.IncludeRefshcp = this.IncludeRefshcp;
			newEditFilter.IncludeRefsspec = this.IncludeRefsspec;
			newEditFilter.IncludeReftorg = this.IncludeReftorg;
			newEditFilter.IncludeReftcons = this.IncludeReftcons;
			newEditFilter.IncludeReftspec = this.IncludeReftspec;
			newEditFilter.IncludeReftype = this.IncludeReftype;
			newEditFilter.IncludeRefreason = this.IncludeRefreason;
			newEditFilter.IncludeRefidate = this.IncludeRefidate;
			newEditFilter.IncludeRefrdate = this.IncludeRefrdate;
			newEditFilter.IncludeRefpriority = this.IncludeRefpriority;
			newEditFilter.IncludeRefdatefs = this.IncludeRefdatefs;
			newEditFilter.IncludeRefbrtarget = this.IncludeRefbrtarget;
			newEditFilter.IncludeRefparent = this.IncludeRefparent;
			newEditFilter.IncludeRefhcptyp = this.IncludeRefhcptyp;
			newEditFilter.IncludeOrgtxt = this.IncludeOrgtxt;
			newEditFilter.IncludeHcptxt = this.IncludeHcptxt;
			newEditFilter.IncludeRefsorgtxt = this.IncludeRefsorgtxt;
			newEditFilter.IncludeRefshcptxt = this.IncludeRefshcptxt;
			newEditFilter.IncludeRorgextcde = this.IncludeRorgextcde;
			newEditFilter.IncludeRefhcpextcde = this.IncludeRefhcpextcde;
			newEditFilter.IncludeHcpextcde = this.IncludeHcpextcde;
			newEditFilter.IncludeOrgextcde = this.IncludeOrgextcde;
			newEditFilter.IncludeTitltxt = this.IncludeTitltxt;
			newEditFilter.IncludeSnm = this.IncludeSnm;
			newEditFilter.IncludeFnm = this.IncludeFnm;
			newEditFilter.IncludeFnm1 = this.IncludeFnm1;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludeDob = this.IncludeDob;
			newEditFilter.IncludeDod = this.IncludeDod;
			newEditFilter.IncludeFrstapptdt = this.IncludeFrstapptdt;
			
			return newEditFilter;
		}
	}
}
