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

public final class Lkt implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Lkt.class);
	
	private LktFilter lastGetFilter = null;
	private final String serviceName = "LKT";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public LktFilter Filter = new LktFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public LktEditFilter EditFilter = new LktEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public LktCollection DataCollection = new LktCollection();

	/**
	 * Creates a new Lkt Data Transfer Object.
	 */ 
	public Lkt(ims.dto.Connection connection)
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
	public Lkt cloneObject()
	{
		Lkt cloneObject = new Lkt(Connection);
			
		if(Filter != null)
			cloneObject.Filter = Filter.cloneObject();			
					
		if(lastGetFilter != null)
			cloneObject.lastGetFilter = lastGetFilter.cloneObject();
		else
			cloneObject.lastGetFilter = null;
				
		for(int x = 0; x < DataCollection.count(); x++)
		{
			int index = cloneObject.DataCollection.add();
			
			cloneObject.DataCollection.get(index).Lkt_typ = DataCollection.get(x).Lkt_typ;
			cloneObject.DataCollection.get(index).Lkt_nm = DataCollection.get(x).Lkt_nm;
			cloneObject.DataCollection.get(index).Lkt_desc = DataCollection.get(x).Lkt_desc;
			cloneObject.DataCollection.get(index).Lkt_tblname = DataCollection.get(x).Lkt_tblname;
			cloneObject.DataCollection.get(index).Lkt_stat = DataCollection.get(x).Lkt_stat;
			cloneObject.DataCollection.get(index).Lkt_modu = DataCollection.get(x).Lkt_modu;
			cloneObject.DataCollection.get(index).Lkt_oldtype = DataCollection.get(x).Lkt_oldtype;
			cloneObject.DataCollection.get(index).Lkt_parent = DataCollection.get(x).Lkt_parent;
			cloneObject.DataCollection.get(index).Cnt_val = DataCollection.get(x).Cnt_val;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Lkt_sable = DataCollection.get(x).Lkt_sable;
			cloneObject.DataCollection.get(index).Lkt_mcmds = DataCollection.get(x).Lkt_mcmds;
							
			
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
		return "Lkt.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkt.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Lkt.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkt.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkt.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkt.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Lkt.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Lkt.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkt.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Lkt.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Lkt.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Lkt.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Lkt.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Lkt.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkt.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Lkt.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Lkt.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Lkt.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Lkt.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Lkt.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkt.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Lkt.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Lkt.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkt.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Lkt.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Lkt.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Lkt.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Lkt nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Lkt After NextList ");
				
		decodeNASMessage();		
		logger.debug("Lkt After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Lkt.List");
							
		listInProgress = true;	
		logger.debug("Lkt Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Lkt After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Lkt After Parse Message");
		
						
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
	private String encodeNASFilter(LktFilter filter)
	{
		if(filter == null)
			return "";
			
		StringBuffer filterString = new StringBuffer();
		
		if(Filter.Lkt_typ != null && filter.Lkt_typ.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LKT_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkt_typ);
		}
		
		if(Filter.Lkt_nm != null && filter.Lkt_nm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LKT_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkt_nm);
		}
		
		if(Filter.Lkt_desc != null && filter.Lkt_desc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LKT_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkt_desc);
		}
		
		if(Filter.Lkt_tblname != null && filter.Lkt_tblname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LKT_TBLNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkt_tblname);
		}
		
		if(Filter.Lkt_stat != null && filter.Lkt_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LKT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkt_stat);
		}
		
		if(Filter.Lkt_modu != null && filter.Lkt_modu.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LKT_MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkt_modu);
		}
		
		if(Filter.Lkt_oldtype != null && filter.Lkt_oldtype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LKT_OLDTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkt_oldtype);
		}
		
		if(Filter.Lkt_parent != null && filter.Lkt_parent.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LKT_PARENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkt_parent);
		}
		
		if(Filter.Cnt_val != null && filter.Cnt_val.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CNT_VAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cnt_val);
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
		}
		
		if(Filter.Lkt_sable != null && filter.Lkt_sable.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LKT_SABLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkt_sable);
		}
		
		if(Filter.Lkt_mcmds != null && filter.Lkt_mcmds.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LKT_MCMDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lkt_mcmds);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		LktRecord data = (LktRecord)DataCollection.get(0);
		
		if(EditFilter.IncludeLkt_typ)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LKT_TYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkt_typ));
		}
		
		if(EditFilter.IncludeLkt_nm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LKT_NM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkt_nm));
		}
		
		if(EditFilter.IncludeLkt_desc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LKT_DESC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkt_desc));
		}
		
		if(EditFilter.IncludeLkt_tblname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LKT_TBLNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkt_tblname));
		}
		
		if(EditFilter.IncludeLkt_stat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LKT_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkt_stat));
		}
		
		if(EditFilter.IncludeLkt_modu)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LKT_MODU" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkt_modu));
		}
		
		if(EditFilter.IncludeLkt_oldtype)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LKT_OLDTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkt_oldtype));
		}
		
		if(EditFilter.IncludeLkt_parent)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LKT_PARENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkt_parent));
		}
		
		if(EditFilter.IncludeCnt_val)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CNT_VAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cnt_val));
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
		}
		
		if(EditFilter.IncludeLkt_sable)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LKT_SABLE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkt_sable));
		}
		
		if(EditFilter.IncludeLkt_mcmds)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LKT_MCMDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lkt_mcmds));
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
			LktRecord record = new LktRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Lkt_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_TYP"));
			record.Lkt_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_NM"));
			record.Lkt_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_DESC"));
			record.Lkt_tblname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_TBLNAME"));
			record.Lkt_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_STAT"));
			record.Lkt_modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_MODU"));
			record.Lkt_oldtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_OLDTYPE"));
			record.Lkt_parent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_PARENT"));
			record.Cnt_val = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CNT_VAL"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Lkt_sable = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_SABLE"));
			record.Lkt_mcmds = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_MCMDS"));
									
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
			LktRecord record = new LktRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Lkt_typ = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_TYP"));
			record.Lkt_nm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_NM"));
			record.Lkt_desc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_DESC"));
			record.Lkt_tblname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_TBLNAME"));
			record.Lkt_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_STAT"));
			record.Lkt_modu = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_MODU"));
			record.Lkt_oldtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_OLDTYPE"));
			record.Lkt_parent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_PARENT"));
			record.Cnt_val = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CNT_VAL"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Lkt_sable = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_SABLE"));
			record.Lkt_mcmds = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LKT_MCMDS"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class LktCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			LktRecord newRecord = new LktRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(LktRecord record)
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
		public LktRecord get(int index)
		{
			return (LktRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class LktRecord
	{
		public String Lkt_typ = "";
		public String Lkt_nm = "";
		public String Lkt_desc = "";
		public String Lkt_tblname = "";
		public String Lkt_stat = "";
		public String Lkt_modu = "";
		public String Lkt_oldtype = "";
		public String Lkt_parent = "";
		public String Cnt_val = "";
		public String Tstp = "";
		public String Lkt_sable = "";
		public String Lkt_mcmds = "";
				
		
		public void clear()
		{
			Lkt_typ = "";
			Lkt_nm = "";
			Lkt_desc = "";
			Lkt_tblname = "";
			Lkt_stat = "";
			Lkt_modu = "";
			Lkt_oldtype = "";
			Lkt_parent = "";
			Cnt_val = "";
			Tstp = "";
			Lkt_sable = "";
			Lkt_mcmds = "";
			
		}		
	}
		
		
	public final class LktFilter
	{			
		public String Lkt_typ = "";
		public String Lkt_nm = "";
		public String Lkt_desc = "";
		public String Lkt_tblname = "";
		public String Lkt_stat = "";
		public String Lkt_modu = "";
		public String Lkt_oldtype = "";
		public String Lkt_parent = "";
		public String Cnt_val = "";
		public String Tstp = "";
		public String Lkt_sable = "";
		public String Lkt_mcmds = "";
		
		public void clear()
		{				
			Lkt_typ = "";
			Lkt_nm = "";
			Lkt_desc = "";
			Lkt_tblname = "";
			Lkt_stat = "";
			Lkt_modu = "";
			Lkt_oldtype = "";
			Lkt_parent = "";
			Cnt_val = "";
			Tstp = "";
			Lkt_sable = "";
			Lkt_mcmds = "";
		}	
		public LktFilter cloneObject()
		{
			LktFilter newFilter = new LktFilter();
			
			newFilter.Lkt_typ = this.Lkt_typ;
			newFilter.Lkt_nm = this.Lkt_nm;
			newFilter.Lkt_desc = this.Lkt_desc;
			newFilter.Lkt_tblname = this.Lkt_tblname;
			newFilter.Lkt_stat = this.Lkt_stat;
			newFilter.Lkt_modu = this.Lkt_modu;
			newFilter.Lkt_oldtype = this.Lkt_oldtype;
			newFilter.Lkt_parent = this.Lkt_parent;
			newFilter.Cnt_val = this.Cnt_val;
			newFilter.Tstp = this.Tstp;
			newFilter.Lkt_sable = this.Lkt_sable;
			newFilter.Lkt_mcmds = this.Lkt_mcmds;
			
			return newFilter;
		}
	}
	public final class LktEditFilter
	{			
		public boolean IncludeLkt_typ = true;
		public boolean IncludeLkt_nm = true;
		public boolean IncludeLkt_desc = true;
		public boolean IncludeLkt_tblname = true;
		public boolean IncludeLkt_stat = true;
		public boolean IncludeLkt_modu = true;
		public boolean IncludeLkt_oldtype = true;
		public boolean IncludeLkt_parent = true;
		public boolean IncludeCnt_val = true;
		public boolean IncludeTstp = true;
		public boolean IncludeLkt_sable = true;
		public boolean IncludeLkt_mcmds = true;
		
		public void includeAll()
		{				
			IncludeLkt_typ = true;
			IncludeLkt_nm = true;
			IncludeLkt_desc = true;
			IncludeLkt_tblname = true;
			IncludeLkt_stat = true;
			IncludeLkt_modu = true;
			IncludeLkt_oldtype = true;
			IncludeLkt_parent = true;
			IncludeCnt_val = true;
			IncludeTstp = true;
			IncludeLkt_sable = true;
			IncludeLkt_mcmds = true;
		}	
		public void excludeAll()
		{				
			IncludeLkt_typ = false;
			IncludeLkt_nm = false;
			IncludeLkt_desc = false;
			IncludeLkt_tblname = false;
			IncludeLkt_stat = false;
			IncludeLkt_modu = false;
			IncludeLkt_oldtype = false;
			IncludeLkt_parent = false;
			IncludeCnt_val = false;
			IncludeTstp = false;
			IncludeLkt_sable = false;
			IncludeLkt_mcmds = false;
		}
		public LktEditFilter cloneObject()
		{
			LktEditFilter newEditFilter = new LktEditFilter();
			
			newEditFilter.IncludeLkt_typ = this.IncludeLkt_typ;
			newEditFilter.IncludeLkt_nm = this.IncludeLkt_nm;
			newEditFilter.IncludeLkt_desc = this.IncludeLkt_desc;
			newEditFilter.IncludeLkt_tblname = this.IncludeLkt_tblname;
			newEditFilter.IncludeLkt_stat = this.IncludeLkt_stat;
			newEditFilter.IncludeLkt_modu = this.IncludeLkt_modu;
			newEditFilter.IncludeLkt_oldtype = this.IncludeLkt_oldtype;
			newEditFilter.IncludeLkt_parent = this.IncludeLkt_parent;
			newEditFilter.IncludeCnt_val = this.IncludeCnt_val;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeLkt_sable = this.IncludeLkt_sable;
			newEditFilter.IncludeLkt_mcmds = this.IncludeLkt_mcmds;
			
			return newEditFilter;
		}
	}
}
