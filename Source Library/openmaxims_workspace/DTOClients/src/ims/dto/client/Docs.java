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
// Template ver. 1.1.0 - Last modified on 04/10/2004 11:00 by Marius Mihalec

package ims.dto.client;

public final class Docs implements ims.vo.ImsCloneable
{
	private DocsFilter lastGetFilter = null;
	private final String serviceName = "DOCS";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public DocsFilter Filter = new DocsFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public DocsEditFilter EditFilter = new DocsEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public DocsCollection DataCollection = new DocsCollection();

	/**
	 * Creates a new Docs Data Transfer Object.
	 */ 
	public Docs(ims.dto.Connection connection)
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
	public Docs cloneObject()
	{
		Docs cloneObject = new Docs(Connection);
			
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
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Rhcp = DataCollection.get(x).Rhcp;
			cloneObject.DataCollection.get(index).Rspecid = DataCollection.get(x).Rspecid;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Uhcp = DataCollection.get(x).Uhcp;
			cloneObject.DataCollection.get(index).Linktype = DataCollection.get(x).Linktype;
			cloneObject.DataCollection.get(index).Startdate = DataCollection.get(x).Startdate;
			cloneObject.DataCollection.get(index).Consultant = DataCollection.get(x).Consultant;
			cloneObject.DataCollection.get(index).Specialty = DataCollection.get(x).Specialty;
			cloneObject.DataCollection.get(index).Uspecid = DataCollection.get(x).Uspecid;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Modu = DataCollection.get(x).Modu;
			cloneObject.DataCollection.get(index).Ahid = DataCollection.get(x).Ahid;
			cloneObject.DataCollection.get(index).Ccsepid = DataCollection.get(x).Ccsepid;
			cloneObject.DataCollection.get(index).Doc_type_id = DataCollection.get(x).Doc_type_id;
			cloneObject.DataCollection.get(index).Doc_stat = DataCollection.get(x).Doc_stat;
			cloneObject.DataCollection.get(index).Doc_fname = DataCollection.get(x).Doc_fname;
			cloneObject.DataCollection.get(index).Doc_dir = DataCollection.get(x).Doc_dir;
			cloneObject.DataCollection.get(index).Doc_source = DataCollection.get(x).Doc_source;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Doc_content = DataCollection.get(x).Doc_content;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).Clof = DataCollection.get(x).Clof;
			cloneObject.DataCollection.get(index).Leftmargin = DataCollection.get(x).Leftmargin;
			cloneObject.DataCollection.get(index).Rightmargin = DataCollection.get(x).Rightmargin;
			cloneObject.DataCollection.get(index).Topmargin = DataCollection.get(x).Topmargin;
			cloneObject.DataCollection.get(index).Bottommargin = DataCollection.get(x).Bottommargin;
			cloneObject.DataCollection.get(index).Papersize = DataCollection.get(x).Papersize;
			cloneObject.DataCollection.get(index).Orientation = DataCollection.get(x).Orientation;
			cloneObject.DataCollection.get(index).Headerfooter = DataCollection.get(x).Headerfooter;
			cloneObject.DataCollection.get(index).Section = DataCollection.get(x).Section;
			cloneObject.DataCollection.get(index).Rhcptxt = DataCollection.get(x).Rhcptxt;
			cloneObject.DataCollection.get(index).Rspecidtxt = DataCollection.get(x).Rspecidtxt;
			cloneObject.DataCollection.get(index).Rusrtxt = DataCollection.get(x).Rusrtxt;
			cloneObject.DataCollection.get(index).Uhcptxt = DataCollection.get(x).Uhcptxt;
			cloneObject.DataCollection.get(index).Uspecidtxt = DataCollection.get(x).Uspecidtxt;
			cloneObject.DataCollection.get(index).Uusrtxt = DataCollection.get(x).Uusrtxt;
			cloneObject.DataCollection.get(index).Modutxt = DataCollection.get(x).Modutxt;
			cloneObject.DataCollection.get(index).Doc_descr = DataCollection.get(x).Doc_descr;
			cloneObject.DataCollection.get(index).Doc_stattxt = DataCollection.get(x).Doc_stattxt;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Consultxt = DataCollection.get(x).Consultxt;
			cloneObject.DataCollection.get(index).Copy_doc = DataCollection.get(x).Copy_doc;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.2 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Docs.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Docs.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Docs.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Docs.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Docs.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Docs.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Docs.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Docs.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Docs.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Docs.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Docs.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Docs.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Docs.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Docs.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Docs.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Docs.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Docs.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Docs.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Docs.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Docs.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Docs.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Docs.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Docs.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Docs.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Docs.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Docs.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Docs.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Docs.List");
							
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
	private String encodeNASFilter(DocsFilter filter)
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
		
		if(Filter.Rspecid != null && filter.Rspecid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RSPECID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rspecid;
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
		
		if(Filter.Linktype != null && filter.Linktype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LINKTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Linktype;
		}
		
		if(Filter.Startdate != null && filter.Startdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STARTDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Startdate;
		}
		
		if(Filter.Consultant != null && filter.Consultant.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONSULTANT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Consultant;
		}
		
		if(Filter.Specialty != null && filter.Specialty.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPECIALTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Specialty;
		}
		
		if(Filter.Uspecid != null && filter.Uspecid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "USPECID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uspecid;
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
		
		if(Filter.Ahid != null && filter.Ahid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AHID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ahid;
		}
		
		if(Filter.Ccsepid != null && filter.Ccsepid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CCSEPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ccsepid;
		}
		
		if(Filter.Doc_type_id != null && filter.Doc_type_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOC_TYPE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_type_id;
		}
		
		if(Filter.Doc_stat != null && filter.Doc_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOC_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_stat;
		}
		
		if(Filter.Doc_fname != null && filter.Doc_fname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOC_FNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_fname;
		}
		
		if(Filter.Doc_dir != null && filter.Doc_dir.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOC_DIR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_dir;
		}
		
		if(Filter.Doc_source != null && filter.Doc_source.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOC_SOURCE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_source;
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp;
		}
		
		if(Filter.Doc_content != null && filter.Doc_content.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOC_CONTENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_content;
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat;
		}
		
		if(Filter.Clof != null && filter.Clof.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CLOF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Clof;
		}
		
		if(Filter.Leftmargin != null && filter.Leftmargin.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "LEFTMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Leftmargin;
		}
		
		if(Filter.Rightmargin != null && filter.Rightmargin.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RIGHTMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rightmargin;
		}
		
		if(Filter.Topmargin != null && filter.Topmargin.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TOPMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Topmargin;
		}
		
		if(Filter.Bottommargin != null && filter.Bottommargin.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BOTTOMMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Bottommargin;
		}
		
		if(Filter.Papersize != null && filter.Papersize.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PAPERSIZE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Papersize;
		}
		
		if(Filter.Orientation != null && filter.Orientation.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ORIENTATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Orientation;
		}
		
		if(Filter.Headerfooter != null && filter.Headerfooter.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HEADERFOOTER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Headerfooter;
		}
		
		if(Filter.Section != null && filter.Section.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SECTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Section;
		}
		
		if(Filter.Rhcptxt != null && filter.Rhcptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rhcptxt;
		}
		
		if(Filter.Rspecidtxt != null && filter.Rspecidtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RSPECIDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rspecidtxt;
		}
		
		if(Filter.Rusrtxt != null && filter.Rusrtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusrtxt;
		}
		
		if(Filter.Uhcptxt != null && filter.Uhcptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uhcptxt;
		}
		
		if(Filter.Uspecidtxt != null && filter.Uspecidtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "USPECIDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uspecidtxt;
		}
		
		if(Filter.Uusrtxt != null && filter.Uusrtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "UUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uusrtxt;
		}
		
		if(Filter.Modutxt != null && filter.Modutxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MODUTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Modutxt;
		}
		
		if(Filter.Doc_descr != null && filter.Doc_descr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOC_DESCR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_descr;
		}
		
		if(Filter.Doc_stattxt != null && filter.Doc_stattxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOC_STATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doc_stattxt;
		}
		
		if(Filter.Active != null && filter.Active.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Active;
		}
		
		if(Filter.Consultxt != null && filter.Consultxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONSULTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Consultxt;
		}
		
		if(Filter.Copy_doc != null && filter.Copy_doc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "COPY_DOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Copy_doc;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		DocsRecord data = (DocsRecord)DataCollection.get(0);
		
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
		
		if(EditFilter.IncludeRspecid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RSPECID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rspecid);
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
		
		if(EditFilter.IncludeLinktype)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LINKTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Linktype);
		}
		
		if(EditFilter.IncludeStartdate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STARTDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Startdate);
		}
		
		if(EditFilter.IncludeConsultant)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONSULTANT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Consultant);
		}
		
		if(EditFilter.IncludeSpecialty)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPECIALTY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Specialty);
		}
		
		if(EditFilter.IncludeUspecid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "USPECID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uspecid);
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
		
		if(EditFilter.IncludeAhid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AHID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ahid);
		}
		
		if(EditFilter.IncludeCcsepid)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CCSEPID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ccsepid);
		}
		
		if(EditFilter.IncludeDoc_type_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOC_TYPE_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_type_id);
		}
		
		if(EditFilter.IncludeDoc_stat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOC_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_stat);
		}
		
		if(EditFilter.IncludeDoc_fname)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOC_FNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_fname);
		}
		
		if(EditFilter.IncludeDoc_dir)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOC_DIR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_dir);
		}
		
		if(EditFilter.IncludeDoc_source)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOC_SOURCE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_source);
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp);
		}
		
		if(EditFilter.IncludeDoc_content)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOC_CONTENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_content);
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat);
		}
		
		if(EditFilter.IncludeClof)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CLOF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Clof);
		}
		
		if(EditFilter.IncludeLeftmargin)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "LEFTMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Leftmargin);
		}
		
		if(EditFilter.IncludeRightmargin)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RIGHTMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rightmargin);
		}
		
		if(EditFilter.IncludeTopmargin)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TOPMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Topmargin);
		}
		
		if(EditFilter.IncludeBottommargin)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BOTTOMMARGIN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Bottommargin);
		}
		
		if(EditFilter.IncludePapersize)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PAPERSIZE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Papersize);
		}
		
		if(EditFilter.IncludeOrientation)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ORIENTATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Orientation);
		}
		
		if(EditFilter.IncludeHeaderfooter)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HEADERFOOTER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Headerfooter);
		}
		
		if(EditFilter.IncludeSection)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SECTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Section);
		}
		
		if(EditFilter.IncludeRhcptxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rhcptxt);
		}
		
		if(EditFilter.IncludeRspecidtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RSPECIDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rspecidtxt);
		}
		
		if(EditFilter.IncludeRusrtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusrtxt);
		}
		
		if(EditFilter.IncludeUhcptxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UHCPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uhcptxt);
		}
		
		if(EditFilter.IncludeUspecidtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "USPECIDTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uspecidtxt);
		}
		
		if(EditFilter.IncludeUusrtxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "UUSRTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uusrtxt);
		}
		
		if(EditFilter.IncludeModutxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MODUTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Modutxt);
		}
		
		if(EditFilter.IncludeDoc_descr)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOC_DESCR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_descr);
		}
		
		if(EditFilter.IncludeDoc_stattxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOC_STATTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doc_stattxt);
		}
		
		if(EditFilter.IncludeActive)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Active);
		}
		
		if(EditFilter.IncludeConsultxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONSULTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Consultxt);
		}
		
		if(EditFilter.IncludeCopy_doc)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "COPY_DOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Copy_doc);
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
			DocsRecord record = new DocsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rspecid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSPECID"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Linktype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LINKTYPE"));
			record.Startdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STARTDATE"));
			record.Consultant = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONSULTANT"));
			record.Specialty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPECIALTY"));
			record.Uspecid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "USPECID"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ahid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AHID"));
			record.Ccsepid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCSEPID"));
			record.Doc_type_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_TYPE_ID"));
			record.Doc_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_STAT"));
			record.Doc_fname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_FNAME"));
			record.Doc_dir = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_DIR"));
			record.Doc_source = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_SOURCE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Doc_content = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_CONTENT"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Clof = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLOF"));
			record.Leftmargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LEFTMARGIN"));
			record.Rightmargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RIGHTMARGIN"));
			record.Topmargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TOPMARGIN"));
			record.Bottommargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BOTTOMMARGIN"));
			record.Papersize = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAPERSIZE"));
			record.Orientation = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORIENTATION"));
			record.Headerfooter = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HEADERFOOTER"));
			record.Section = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SECTION"));
			record.Rhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCPTXT"));
			record.Rspecidtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSPECIDTXT"));
			record.Rusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSRTXT"));
			record.Uhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCPTXT"));
			record.Uspecidtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "USPECIDTXT"));
			record.Uusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSRTXT"));
			record.Modutxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODUTXT"));
			record.Doc_descr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_DESCR"));
			record.Doc_stattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_STATTXT"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Consultxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONSULTXT"));
			record.Copy_doc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COPY_DOC"));
									
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
			DocsRecord record = new DocsRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Unid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UNID"));
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Rhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCP"));
			record.Rspecid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSPECID"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Uhcp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCP"));
			record.Linktype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LINKTYPE"));
			record.Startdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STARTDATE"));
			record.Consultant = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONSULTANT"));
			record.Specialty = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPECIALTY"));
			record.Uspecid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "USPECID"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODU"));
			record.Ahid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AHID"));
			record.Ccsepid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CCSEPID"));
			record.Doc_type_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_TYPE_ID"));
			record.Doc_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_STAT"));
			record.Doc_fname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_FNAME"));
			record.Doc_dir = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_DIR"));
			record.Doc_source = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_SOURCE"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Doc_content = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_CONTENT"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Clof = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLOF"));
			record.Leftmargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LEFTMARGIN"));
			record.Rightmargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RIGHTMARGIN"));
			record.Topmargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TOPMARGIN"));
			record.Bottommargin = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BOTTOMMARGIN"));
			record.Papersize = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAPERSIZE"));
			record.Orientation = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ORIENTATION"));
			record.Headerfooter = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HEADERFOOTER"));
			record.Section = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SECTION"));
			record.Rhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RHCPTXT"));
			record.Rspecidtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RSPECIDTXT"));
			record.Rusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSRTXT"));
			record.Uhcptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UHCPTXT"));
			record.Uspecidtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "USPECIDTXT"));
			record.Uusrtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSRTXT"));
			record.Modutxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MODUTXT"));
			record.Doc_descr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_DESCR"));
			record.Doc_stattxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOC_STATTXT"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Consultxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONSULTXT"));
			record.Copy_doc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COPY_DOC"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class DocsCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			DocsRecord newRecord = new DocsRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(DocsRecord record)
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
		public DocsRecord get(int index)
		{
			return (DocsRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class DocsRecord
	{
		public String Unid = "";
		public String Pkey = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Rhcp = "";
		public String Rspecid = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Linktype = "";
		public String Startdate = "";
		public String Consultant = "";
		public String Specialty = "";
		public String Uspecid = "";
		public String Uusr = "";
		public String Modu = "";
		public String Ahid = "";
		public String Ccsepid = "";
		public String Doc_type_id = "";
		public String Doc_stat = "";
		public String Doc_fname = "";
		public String Doc_dir = "";
		public String Doc_source = "";
		public String Tstp = "";
		public String Doc_content = "";
		public String Stat = "";
		public String Clof = "";
		public String Leftmargin = "";
		public String Rightmargin = "";
		public String Topmargin = "";
		public String Bottommargin = "";
		public String Papersize = "";
		public String Orientation = "";
		public String Headerfooter = "";
		public String Section = "";
		public String Rhcptxt = "";
		public String Rspecidtxt = "";
		public String Rusrtxt = "";
		public String Uhcptxt = "";
		public String Uspecidtxt = "";
		public String Uusrtxt = "";
		public String Modutxt = "";
		public String Doc_descr = "";
		public String Doc_stattxt = "";
		public String Active = "";
		public String Consultxt = "";
		public String Copy_doc = "";
				
		
		public void clear()
		{
			Unid = "";
			Pkey = "";
			Cdat = "";
			Ctim = "";
			Rhcp = "";
			Rspecid = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Linktype = "";
			Startdate = "";
			Consultant = "";
			Specialty = "";
			Uspecid = "";
			Uusr = "";
			Modu = "";
			Ahid = "";
			Ccsepid = "";
			Doc_type_id = "";
			Doc_stat = "";
			Doc_fname = "";
			Doc_dir = "";
			Doc_source = "";
			Tstp = "";
			Doc_content = "";
			Stat = "";
			Clof = "";
			Leftmargin = "";
			Rightmargin = "";
			Topmargin = "";
			Bottommargin = "";
			Papersize = "";
			Orientation = "";
			Headerfooter = "";
			Section = "";
			Rhcptxt = "";
			Rspecidtxt = "";
			Rusrtxt = "";
			Uhcptxt = "";
			Uspecidtxt = "";
			Uusrtxt = "";
			Modutxt = "";
			Doc_descr = "";
			Doc_stattxt = "";
			Active = "";
			Consultxt = "";
			Copy_doc = "";
			
		}		
	}
		
		
	public final class DocsFilter
	{			
		public String Unid = "";
		public String Pkey = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Rhcp = "";
		public String Rspecid = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Udat = "";
		public String Utim = "";
		public String Uhcp = "";
		public String Linktype = "";
		public String Startdate = "";
		public String Consultant = "";
		public String Specialty = "";
		public String Uspecid = "";
		public String Uusr = "";
		public String Modu = "";
		public String Ahid = "";
		public String Ccsepid = "";
		public String Doc_type_id = "";
		public String Doc_stat = "";
		public String Doc_fname = "";
		public String Doc_dir = "";
		public String Doc_source = "";
		public String Tstp = "";
		public String Doc_content = "";
		public String Stat = "";
		public String Clof = "";
		public String Leftmargin = "";
		public String Rightmargin = "";
		public String Topmargin = "";
		public String Bottommargin = "";
		public String Papersize = "";
		public String Orientation = "";
		public String Headerfooter = "";
		public String Section = "";
		public String Rhcptxt = "";
		public String Rspecidtxt = "";
		public String Rusrtxt = "";
		public String Uhcptxt = "";
		public String Uspecidtxt = "";
		public String Uusrtxt = "";
		public String Modutxt = "";
		public String Doc_descr = "";
		public String Doc_stattxt = "";
		public String Active = "";
		public String Consultxt = "";
		public String Copy_doc = "";
		
		public void clear()
		{				
			Unid = "";
			Pkey = "";
			Cdat = "";
			Ctim = "";
			Rhcp = "";
			Rspecid = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Udat = "";
			Utim = "";
			Uhcp = "";
			Linktype = "";
			Startdate = "";
			Consultant = "";
			Specialty = "";
			Uspecid = "";
			Uusr = "";
			Modu = "";
			Ahid = "";
			Ccsepid = "";
			Doc_type_id = "";
			Doc_stat = "";
			Doc_fname = "";
			Doc_dir = "";
			Doc_source = "";
			Tstp = "";
			Doc_content = "";
			Stat = "";
			Clof = "";
			Leftmargin = "";
			Rightmargin = "";
			Topmargin = "";
			Bottommargin = "";
			Papersize = "";
			Orientation = "";
			Headerfooter = "";
			Section = "";
			Rhcptxt = "";
			Rspecidtxt = "";
			Rusrtxt = "";
			Uhcptxt = "";
			Uspecidtxt = "";
			Uusrtxt = "";
			Modutxt = "";
			Doc_descr = "";
			Doc_stattxt = "";
			Active = "";
			Consultxt = "";
			Copy_doc = "";
		}	
		public DocsFilter cloneObject()
		{
			DocsFilter newFilter = new DocsFilter();
			
			newFilter.Unid = this.Unid;
			newFilter.Pkey = this.Pkey;
			newFilter.Cdat = this.Cdat;
			newFilter.Ctim = this.Ctim;
			newFilter.Rhcp = this.Rhcp;
			newFilter.Rspecid = this.Rspecid;
			newFilter.Rusr = this.Rusr;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Uhcp = this.Uhcp;
			newFilter.Linktype = this.Linktype;
			newFilter.Startdate = this.Startdate;
			newFilter.Consultant = this.Consultant;
			newFilter.Specialty = this.Specialty;
			newFilter.Uspecid = this.Uspecid;
			newFilter.Uusr = this.Uusr;
			newFilter.Modu = this.Modu;
			newFilter.Ahid = this.Ahid;
			newFilter.Ccsepid = this.Ccsepid;
			newFilter.Doc_type_id = this.Doc_type_id;
			newFilter.Doc_stat = this.Doc_stat;
			newFilter.Doc_fname = this.Doc_fname;
			newFilter.Doc_dir = this.Doc_dir;
			newFilter.Doc_source = this.Doc_source;
			newFilter.Tstp = this.Tstp;
			newFilter.Doc_content = this.Doc_content;
			newFilter.Stat = this.Stat;
			newFilter.Clof = this.Clof;
			newFilter.Leftmargin = this.Leftmargin;
			newFilter.Rightmargin = this.Rightmargin;
			newFilter.Topmargin = this.Topmargin;
			newFilter.Bottommargin = this.Bottommargin;
			newFilter.Papersize = this.Papersize;
			newFilter.Orientation = this.Orientation;
			newFilter.Headerfooter = this.Headerfooter;
			newFilter.Section = this.Section;
			newFilter.Rhcptxt = this.Rhcptxt;
			newFilter.Rspecidtxt = this.Rspecidtxt;
			newFilter.Rusrtxt = this.Rusrtxt;
			newFilter.Uhcptxt = this.Uhcptxt;
			newFilter.Uspecidtxt = this.Uspecidtxt;
			newFilter.Uusrtxt = this.Uusrtxt;
			newFilter.Modutxt = this.Modutxt;
			newFilter.Doc_descr = this.Doc_descr;
			newFilter.Doc_stattxt = this.Doc_stattxt;
			newFilter.Active = this.Active;
			newFilter.Consultxt = this.Consultxt;
			newFilter.Copy_doc = this.Copy_doc;
			
			return newFilter;
		}
	}
	public final class DocsEditFilter
	{			
		public boolean IncludeUnid = true;
		public boolean IncludePkey = true;
		public boolean IncludeCdat = true;
		public boolean IncludeCtim = true;
		public boolean IncludeRhcp = true;
		public boolean IncludeRspecid = true;
		public boolean IncludeRusr = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeUhcp = true;
		public boolean IncludeLinktype = true;
		public boolean IncludeStartdate = true;
		public boolean IncludeConsultant = true;
		public boolean IncludeSpecialty = true;
		public boolean IncludeUspecid = true;
		public boolean IncludeUusr = true;
		public boolean IncludeModu = true;
		public boolean IncludeAhid = true;
		public boolean IncludeCcsepid = true;
		public boolean IncludeDoc_type_id = true;
		public boolean IncludeDoc_stat = true;
		public boolean IncludeDoc_fname = true;
		public boolean IncludeDoc_dir = true;
		public boolean IncludeDoc_source = true;
		public boolean IncludeTstp = true;
		public boolean IncludeDoc_content = true;
		public boolean IncludeStat = true;
		public boolean IncludeClof = true;
		public boolean IncludeLeftmargin = true;
		public boolean IncludeRightmargin = true;
		public boolean IncludeTopmargin = true;
		public boolean IncludeBottommargin = true;
		public boolean IncludePapersize = true;
		public boolean IncludeOrientation = true;
		public boolean IncludeHeaderfooter = true;
		public boolean IncludeSection = true;
		public boolean IncludeRhcptxt = true;
		public boolean IncludeRspecidtxt = true;
		public boolean IncludeRusrtxt = true;
		public boolean IncludeUhcptxt = true;
		public boolean IncludeUspecidtxt = true;
		public boolean IncludeUusrtxt = true;
		public boolean IncludeModutxt = true;
		public boolean IncludeDoc_descr = true;
		public boolean IncludeDoc_stattxt = true;
		public boolean IncludeActive = true;
		public boolean IncludeConsultxt = true;
		public boolean IncludeCopy_doc = true;
		
		public void includeAll()
		{				
			IncludeUnid = true;
			IncludePkey = true;
			IncludeCdat = true;
			IncludeCtim = true;
			IncludeRhcp = true;
			IncludeRspecid = true;
			IncludeRusr = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeUhcp = true;
			IncludeLinktype = true;
			IncludeStartdate = true;
			IncludeConsultant = true;
			IncludeSpecialty = true;
			IncludeUspecid = true;
			IncludeUusr = true;
			IncludeModu = true;
			IncludeAhid = true;
			IncludeCcsepid = true;
			IncludeDoc_type_id = true;
			IncludeDoc_stat = true;
			IncludeDoc_fname = true;
			IncludeDoc_dir = true;
			IncludeDoc_source = true;
			IncludeTstp = true;
			IncludeDoc_content = true;
			IncludeStat = true;
			IncludeClof = true;
			IncludeLeftmargin = true;
			IncludeRightmargin = true;
			IncludeTopmargin = true;
			IncludeBottommargin = true;
			IncludePapersize = true;
			IncludeOrientation = true;
			IncludeHeaderfooter = true;
			IncludeSection = true;
			IncludeRhcptxt = true;
			IncludeRspecidtxt = true;
			IncludeRusrtxt = true;
			IncludeUhcptxt = true;
			IncludeUspecidtxt = true;
			IncludeUusrtxt = true;
			IncludeModutxt = true;
			IncludeDoc_descr = true;
			IncludeDoc_stattxt = true;
			IncludeActive = true;
			IncludeConsultxt = true;
			IncludeCopy_doc = true;
		}	
		public void excludeAll()
		{				
			IncludeUnid = false;
			IncludePkey = false;
			IncludeCdat = false;
			IncludeCtim = false;
			IncludeRhcp = false;
			IncludeRspecid = false;
			IncludeRusr = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeUhcp = false;
			IncludeLinktype = false;
			IncludeStartdate = false;
			IncludeConsultant = false;
			IncludeSpecialty = false;
			IncludeUspecid = false;
			IncludeUusr = false;
			IncludeModu = false;
			IncludeAhid = false;
			IncludeCcsepid = false;
			IncludeDoc_type_id = false;
			IncludeDoc_stat = false;
			IncludeDoc_fname = false;
			IncludeDoc_dir = false;
			IncludeDoc_source = false;
			IncludeTstp = false;
			IncludeDoc_content = false;
			IncludeStat = false;
			IncludeClof = false;
			IncludeLeftmargin = false;
			IncludeRightmargin = false;
			IncludeTopmargin = false;
			IncludeBottommargin = false;
			IncludePapersize = false;
			IncludeOrientation = false;
			IncludeHeaderfooter = false;
			IncludeSection = false;
			IncludeRhcptxt = false;
			IncludeRspecidtxt = false;
			IncludeRusrtxt = false;
			IncludeUhcptxt = false;
			IncludeUspecidtxt = false;
			IncludeUusrtxt = false;
			IncludeModutxt = false;
			IncludeDoc_descr = false;
			IncludeDoc_stattxt = false;
			IncludeActive = false;
			IncludeConsultxt = false;
			IncludeCopy_doc = false;
		}
		public DocsEditFilter cloneObject()
		{
			DocsEditFilter newEditFilter = new DocsEditFilter();
			
			newEditFilter.IncludeUnid = this.IncludeUnid;
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeRhcp = this.IncludeRhcp;
			newEditFilter.IncludeRspecid = this.IncludeRspecid;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeUhcp = this.IncludeUhcp;
			newEditFilter.IncludeLinktype = this.IncludeLinktype;
			newEditFilter.IncludeStartdate = this.IncludeStartdate;
			newEditFilter.IncludeConsultant = this.IncludeConsultant;
			newEditFilter.IncludeSpecialty = this.IncludeSpecialty;
			newEditFilter.IncludeUspecid = this.IncludeUspecid;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeModu = this.IncludeModu;
			newEditFilter.IncludeAhid = this.IncludeAhid;
			newEditFilter.IncludeCcsepid = this.IncludeCcsepid;
			newEditFilter.IncludeDoc_type_id = this.IncludeDoc_type_id;
			newEditFilter.IncludeDoc_stat = this.IncludeDoc_stat;
			newEditFilter.IncludeDoc_fname = this.IncludeDoc_fname;
			newEditFilter.IncludeDoc_dir = this.IncludeDoc_dir;
			newEditFilter.IncludeDoc_source = this.IncludeDoc_source;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeDoc_content = this.IncludeDoc_content;
			newEditFilter.IncludeStat = this.IncludeStat;
			newEditFilter.IncludeClof = this.IncludeClof;
			newEditFilter.IncludeLeftmargin = this.IncludeLeftmargin;
			newEditFilter.IncludeRightmargin = this.IncludeRightmargin;
			newEditFilter.IncludeTopmargin = this.IncludeTopmargin;
			newEditFilter.IncludeBottommargin = this.IncludeBottommargin;
			newEditFilter.IncludePapersize = this.IncludePapersize;
			newEditFilter.IncludeOrientation = this.IncludeOrientation;
			newEditFilter.IncludeHeaderfooter = this.IncludeHeaderfooter;
			newEditFilter.IncludeSection = this.IncludeSection;
			newEditFilter.IncludeRhcptxt = this.IncludeRhcptxt;
			newEditFilter.IncludeRspecidtxt = this.IncludeRspecidtxt;
			newEditFilter.IncludeRusrtxt = this.IncludeRusrtxt;
			newEditFilter.IncludeUhcptxt = this.IncludeUhcptxt;
			newEditFilter.IncludeUspecidtxt = this.IncludeUspecidtxt;
			newEditFilter.IncludeUusrtxt = this.IncludeUusrtxt;
			newEditFilter.IncludeModutxt = this.IncludeModutxt;
			newEditFilter.IncludeDoc_descr = this.IncludeDoc_descr;
			newEditFilter.IncludeDoc_stattxt = this.IncludeDoc_stattxt;
			newEditFilter.IncludeActive = this.IncludeActive;
			newEditFilter.IncludeConsultxt = this.IncludeConsultxt;
			newEditFilter.IncludeCopy_doc = this.IncludeCopy_doc;
			
			return newEditFilter;
		}
	}
}
