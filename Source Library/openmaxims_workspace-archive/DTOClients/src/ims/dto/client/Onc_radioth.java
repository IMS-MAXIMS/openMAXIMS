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

public final class Onc_radioth implements ims.vo.ImsCloneable
{
	private Onc_radiothFilter lastGetFilter = null;
	private final String serviceName = "ONC_RADIOTH";
	private boolean listInProgress = false;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public Onc_radiothFilter Filter = new Onc_radiothFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public Onc_radiothEditFilter EditFilter = new Onc_radiothEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public Onc_radiothCollection DataCollection = new Onc_radiothCollection();

	/**
	 * Creates a new Onc_radioth Data Transfer Object.
	 */ 
	public Onc_radioth(ims.dto.Connection connection)
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
	public Onc_radioth cloneObject()
	{
		Onc_radioth cloneObject = new Onc_radioth(Connection);
			
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
			cloneObject.DataCollection.get(index).Act_id = DataCollection.get(x).Act_id;
			cloneObject.DataCollection.get(index).Therapy_type = DataCollection.get(x).Therapy_type;
			cloneObject.DataCollection.get(index).Hospital = DataCollection.get(x).Hospital;
			cloneObject.DataCollection.get(index).Clin_onc = DataCollection.get(x).Clin_onc;
			cloneObject.DataCollection.get(index).Trdate = DataCollection.get(x).Trdate;
			cloneObject.DataCollection.get(index).Reasdel1 = DataCollection.get(x).Reasdel1;
			cloneObject.DataCollection.get(index).Reasdel2 = DataCollection.get(x).Reasdel2;
			cloneObject.DataCollection.get(index).Brachytxtyp = DataCollection.get(x).Brachytxtyp;
			cloneObject.DataCollection.get(index).Ict = DataCollection.get(x).Ict;
			cloneObject.DataCollection.get(index).Trt_asite = DataCollection.get(x).Trt_asite;
			cloneObject.DataCollection.get(index).Trt_intent = DataCollection.get(x).Trt_intent;
			cloneObject.DataCollection.get(index).Trt_site = DataCollection.get(x).Trt_site;
			cloneObject.DataCollection.get(index).Txcat = DataCollection.get(x).Txcat;
			cloneObject.DataCollection.get(index).Startdate = DataCollection.get(x).Startdate;
			cloneObject.DataCollection.get(index).Enddate = DataCollection.get(x).Enddate;
			cloneObject.DataCollection.get(index).Conchemotx = DataCollection.get(x).Conchemotx;
			cloneObject.DataCollection.get(index).Total_dose = DataCollection.get(x).Total_dose;
			cloneObject.DataCollection.get(index).Adose = DataCollection.get(x).Adose;
			cloneObject.DataCollection.get(index).Fractions = DataCollection.get(x).Fractions;
			cloneObject.DataCollection.get(index).Afraction = DataCollection.get(x).Afraction;
			cloneObject.DataCollection.get(index).Duration = DataCollection.get(x).Duration;
			cloneObject.DataCollection.get(index).Aduration = DataCollection.get(x).Aduration;
			cloneObject.DataCollection.get(index).Teltx_ppoint = DataCollection.get(x).Teltx_ppoint;
			cloneObject.DataCollection.get(index).Btx_ppoint = DataCollection.get(x).Btx_ppoint;
			cloneObject.DataCollection.get(index).Astart_dt = DataCollection.get(x).Astart_dt;
			cloneObject.DataCollection.get(index).Aend_dt = DataCollection.get(x).Aend_dt;
			cloneObject.DataCollection.get(index).Chreas = DataCollection.get(x).Chreas;
			cloneObject.DataCollection.get(index).Asplis_supcl = DataCollection.get(x).Asplis_supcl;
			cloneObject.DataCollection.get(index).Tot_as_dose = DataCollection.get(x).Tot_as_dose;
			cloneObject.DataCollection.get(index).Tot_as_tx_no = DataCollection.get(x).Tot_as_tx_no;
			cloneObject.DataCollection.get(index).Adj_flds = DataCollection.get(x).Adj_flds;
			cloneObject.DataCollection.get(index).Dis_stat = DataCollection.get(x).Dis_stat;
			cloneObject.DataCollection.get(index).Primd_tx = DataCollection.get(x).Primd_tx;
			cloneObject.DataCollection.get(index).Secd_tx = DataCollection.get(x).Secd_tx;
			cloneObject.DataCollection.get(index).Recd_tx = DataCollection.get(x).Recd_tx;
			cloneObject.DataCollection.get(index).Retxf = DataCollection.get(x).Retxf;
			cloneObject.DataCollection.get(index).Hypfrac = DataCollection.get(x).Hypfrac;
			cloneObject.DataCollection.get(index).Specteq = DataCollection.get(x).Specteq;
			cloneObject.DataCollection.get(index).Preoptx = DataCollection.get(x).Preoptx;
			cloneObject.DataCollection.get(index).Radtype = DataCollection.get(x).Radtype;
			cloneObject.DataCollection.get(index).Beamen = DataCollection.get(x).Beamen;
			cloneObject.DataCollection.get(index).Nofields = DataCollection.get(x).Nofields;
			cloneObject.DataCollection.get(index).Plcompl = DataCollection.get(x).Plcompl;
			cloneObject.DataCollection.get(index).Multplan = DataCollection.get(x).Multplan;
			cloneObject.DataCollection.get(index).Txlen = DataCollection.get(x).Txlen;
			cloneObject.DataCollection.get(index).Brdeltype = DataCollection.get(x).Brdeltype;
			cloneObject.DataCollection.get(index).Brradsrctyp = DataCollection.get(x).Brradsrctyp;
			cloneObject.DataCollection.get(index).Attendtyp = DataCollection.get(x).Attendtyp;
			cloneObject.DataCollection.get(index).Hrg = DataCollection.get(x).Hrg;
			cloneObject.DataCollection.get(index).Chart = DataCollection.get(x).Chart;
			cloneObject.DataCollection.get(index).Dnotes = DataCollection.get(x).Dnotes;
			cloneObject.DataCollection.get(index).Active = DataCollection.get(x).Active;
			cloneObject.DataCollection.get(index).Cl_onctxt = DataCollection.get(x).Cl_onctxt;
			cloneObject.DataCollection.get(index).Pt_act_id = DataCollection.get(x).Pt_act_id;
			cloneObject.DataCollection.get(index).Genanest = DataCollection.get(x).Genanest;
			cloneObject.DataCollection.get(index).Doserate = DataCollection.get(x).Doserate;
			cloneObject.DataCollection.get(index).Plnnophases = DataCollection.get(x).Plnnophases;
			cloneObject.DataCollection.get(index).Plnascld = DataCollection.get(x).Plnascld;
			cloneObject.DataCollection.get(index).Plnasscdfxns = DataCollection.get(x).Plnasscdfxns;
			cloneObject.DataCollection.get(index).Plnasscddse = DataCollection.get(x).Plnasscddse;
			cloneObject.DataCollection.get(index).Plnadjflds = DataCollection.get(x).Plnadjflds;
			cloneObject.DataCollection.get(index).Actnophases = DataCollection.get(x).Actnophases;
			cloneObject.DataCollection.get(index).Brytdse = DataCollection.get(x).Brytdse;
			cloneObject.DataCollection.get(index).Brytdseunit = DataCollection.get(x).Brytdseunit;
			cloneObject.DataCollection.get(index).Bryactnooftx = DataCollection.get(x).Bryactnooftx;
			cloneObject.DataCollection.get(index).Hosptxt = DataCollection.get(x).Hosptxt;
			cloneObject.DataCollection.get(index).Therapy_typetxt = DataCollection.get(x).Therapy_typetxt;
							
			
			for(int iSeqno1 = 0; iSeqno1 < DataCollection.get(x).Seqno1Collection.count(); iSeqno1++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno1Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno1Collection.get(rIndex).Seqno1 = DataCollection.get(x).Seqno1Collection.get(iSeqno1).Seqno1;
				cloneObject.DataCollection.get(index).Seqno1Collection.get(rIndex).Tele_phse = DataCollection.get(x).Seqno1Collection.get(iSeqno1).Tele_phse;
				cloneObject.DataCollection.get(index).Seqno1Collection.get(rIndex).Tele_dse = DataCollection.get(x).Seqno1Collection.get(iSeqno1).Tele_dse;
				cloneObject.DataCollection.get(index).Seqno1Collection.get(rIndex).Tele_frac = DataCollection.get(x).Seqno1Collection.get(iSeqno1).Tele_frac;
										
			}
			
			for(int iSeqno2 = 0; iSeqno2 < DataCollection.get(x).Seqno2Collection.count(); iSeqno2++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno2Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Seqno2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Seqno2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Adjtx_phse = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Adjtx_phse;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Adj_dse1 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Adj_dse1;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Adj_notx1 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Adj_notx1;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Adj_dse2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Adj_dse2;
				cloneObject.DataCollection.get(index).Seqno2Collection.get(rIndex).Adj_notx2 = DataCollection.get(x).Seqno2Collection.get(iSeqno2).Adj_notx2;
										
			}
			
			for(int iSeqno3 = 0; iSeqno3 < DataCollection.get(x).Seqno3Collection.count(); iSeqno3++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno3Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Seqno3 = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Seqno3;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Bragy_date = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Bragy_date;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Bragy_dse = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Bragy_dse;
				cloneObject.DataCollection.get(index).Seqno3Collection.get(rIndex).Bragy_ga = DataCollection.get(x).Seqno3Collection.get(iSeqno3).Bragy_ga;
										
			}
			
			for(int iSeqno4 = 0; iSeqno4 < DataCollection.get(x).Seqno4Collection.count(); iSeqno4++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno4Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Seqno4 = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Seqno4;
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Mbq_dt = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Mbq_dt;
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Mbq_dse = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Mbq_dse;
				cloneObject.DataCollection.get(index).Seqno4Collection.get(rIndex).Mbq_ga = DataCollection.get(x).Seqno4Collection.get(iSeqno4).Mbq_ga;
										
			}
			
			for(int iSeqno5 = 0; iSeqno5 < DataCollection.get(x).Seqno5Collection.count(); iSeqno5++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno5Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno5Collection.get(rIndex).Seqno5 = DataCollection.get(x).Seqno5Collection.get(iSeqno5).Seqno5;
				cloneObject.DataCollection.get(index).Seqno5Collection.get(rIndex).Tele_pphase = DataCollection.get(x).Seqno5Collection.get(iSeqno5).Tele_pphase;
				cloneObject.DataCollection.get(index).Seqno5Collection.get(rIndex).Tele_pdse = DataCollection.get(x).Seqno5Collection.get(iSeqno5).Tele_pdse;
				cloneObject.DataCollection.get(index).Seqno5Collection.get(rIndex).Tele_pfrac = DataCollection.get(x).Seqno5Collection.get(iSeqno5).Tele_pfrac;
										
			}
			
			for(int iSeqno6 = 0; iSeqno6 < DataCollection.get(x).Seqno6Collection.count(); iSeqno6++)
			{
				int rIndex = cloneObject.DataCollection.get(index).Seqno6Collection.add();
					
				cloneObject.DataCollection.get(index).Seqno6Collection.get(rIndex).Seqno6 = DataCollection.get(x).Seqno6Collection.get(iSeqno6).Seqno6;
				cloneObject.DataCollection.get(index).Seqno6Collection.get(rIndex).Adjtx_pphse = DataCollection.get(x).Seqno6Collection.get(iSeqno6).Adjtx_pphse;
				cloneObject.DataCollection.get(index).Seqno6Collection.get(rIndex).Adj_pdse1 = DataCollection.get(x).Seqno6Collection.get(iSeqno6).Adj_pdse1;
				cloneObject.DataCollection.get(index).Seqno6Collection.get(rIndex).Adj_pnotx1 = DataCollection.get(x).Seqno6Collection.get(iSeqno6).Adj_pnotx1;
				cloneObject.DataCollection.get(index).Seqno6Collection.get(rIndex).Adj_pdse2 = DataCollection.get(x).Seqno6Collection.get(iSeqno6).Adj_pdse2;
				cloneObject.DataCollection.get(index).Seqno6Collection.get(rIndex).Adj_pnotx2 = DataCollection.get(x).Seqno6Collection.get(iSeqno6).Adj_pnotx2;
										
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
		return "Onc_radioth.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_radioth.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Onc_radioth.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_radioth.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_radioth.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_radioth.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Onc_radioth.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Onc_radioth.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_radioth.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Onc_radioth.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Onc_radioth.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Onc_radioth.Insert");
		}
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Onc_radioth.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Onc_radioth.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_radioth.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Onc_radioth.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Onc_radioth.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Onc_radioth.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Onc_radioth.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Onc_radioth.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_radioth.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Onc_radioth.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Onc_radioth.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_radioth.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Onc_radioth.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Onc_radioth.Update");
			
		return Connection.update(serviceName, encodeNASMessage());
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Onc_radioth.StopList");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Onc_radioth.List");
							
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
	private String encodeNASFilter(Onc_radiothFilter filter)
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
		
		if(Filter.Act_id != null && filter.Act_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Act_id;
		}
		
		if(Filter.Therapy_type != null && filter.Therapy_type.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "THERAPY_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Therapy_type;
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
		
		if(Filter.Trdate != null && filter.Trdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TRDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Trdate;
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
		
		if(Filter.Brachytxtyp != null && filter.Brachytxtyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BRACHYTXTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Brachytxtyp;
		}
		
		if(Filter.Ict != null && filter.Ict.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ICT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ict;
		}
		
		if(Filter.Trt_asite != null && filter.Trt_asite.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TRT_ASITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Trt_asite;
		}
		
		if(Filter.Trt_intent != null && filter.Trt_intent.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TRT_INTENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Trt_intent;
		}
		
		if(Filter.Trt_site != null && filter.Trt_site.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TRT_SITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Trt_site;
		}
		
		if(Filter.Txcat != null && filter.Txcat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TXCAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Txcat;
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
		
		if(Filter.Conchemotx != null && filter.Conchemotx.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CONCHEMOTX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Conchemotx;
		}
		
		if(Filter.Total_dose != null && filter.Total_dose.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TOTAL_DOSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Total_dose;
		}
		
		if(Filter.Adose != null && filter.Adose.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADOSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adose;
		}
		
		if(Filter.Fractions != null && filter.Fractions.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "FRACTIONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Fractions;
		}
		
		if(Filter.Afraction != null && filter.Afraction.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AFRACTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Afraction;
		}
		
		if(Filter.Duration != null && filter.Duration.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DURATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Duration;
		}
		
		if(Filter.Aduration != null && filter.Aduration.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADURATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Aduration;
		}
		
		if(Filter.Teltx_ppoint != null && filter.Teltx_ppoint.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TELTX_PPOINT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Teltx_ppoint;
		}
		
		if(Filter.Btx_ppoint != null && filter.Btx_ppoint.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BTX_PPOINT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Btx_ppoint;
		}
		
		if(Filter.Astart_dt != null && filter.Astart_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ASTART_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Astart_dt;
		}
		
		if(Filter.Aend_dt != null && filter.Aend_dt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "AEND_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Aend_dt;
		}
		
		if(Filter.Chreas != null && filter.Chreas.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CHREAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Chreas;
		}
		
		if(Filter.Asplis_supcl != null && filter.Asplis_supcl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ASPLIS_SUPCL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Asplis_supcl;
		}
		
		if(Filter.Tot_as_dose != null && filter.Tot_as_dose.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TOT_AS_DOSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tot_as_dose;
		}
		
		if(Filter.Tot_as_tx_no != null && filter.Tot_as_tx_no.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TOT_AS_TX_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tot_as_tx_no;
		}
		
		if(Filter.Adj_flds != null && filter.Adj_flds.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ADJ_FLDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adj_flds;
		}
		
		if(Filter.Dis_stat != null && filter.Dis_stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DIS_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dis_stat;
		}
		
		if(Filter.Primd_tx != null && filter.Primd_tx.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PRIMD_TX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Primd_tx;
		}
		
		if(Filter.Secd_tx != null && filter.Secd_tx.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SECD_TX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Secd_tx;
		}
		
		if(Filter.Recd_tx != null && filter.Recd_tx.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RECD_TX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Recd_tx;
		}
		
		if(Filter.Retxf != null && filter.Retxf.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RETXF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Retxf;
		}
		
		if(Filter.Hypfrac != null && filter.Hypfrac.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HYPFRAC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hypfrac;
		}
		
		if(Filter.Specteq != null && filter.Specteq.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "SPECTEQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Specteq;
		}
		
		if(Filter.Preoptx != null && filter.Preoptx.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PREOPTX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Preoptx;
		}
		
		if(Filter.Radtype != null && filter.Radtype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "RADTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Radtype;
		}
		
		if(Filter.Beamen != null && filter.Beamen.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BEAMEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Beamen;
		}
		
		if(Filter.Nofields != null && filter.Nofields.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "NOFIELDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nofields;
		}
		
		if(Filter.Plcompl != null && filter.Plcompl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PLCOMPL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Plcompl;
		}
		
		if(Filter.Multplan != null && filter.Multplan.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "MULTPLAN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Multplan;
		}
		
		if(Filter.Txlen != null && filter.Txlen.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "TXLEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Txlen;
		}
		
		if(Filter.Brdeltype != null && filter.Brdeltype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BRDELTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Brdeltype;
		}
		
		if(Filter.Brradsrctyp != null && filter.Brradsrctyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BRRADSRCTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Brradsrctyp;
		}
		
		if(Filter.Attendtyp != null && filter.Attendtyp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ATTENDTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Attendtyp;
		}
		
		if(Filter.Hrg != null && filter.Hrg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HRG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hrg;
		}
		
		if(Filter.Chart != null && filter.Chart.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CHART" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Chart;
		}
		
		if(Filter.Dnotes != null && filter.Dnotes.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DNOTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dnotes;
		}
		
		if(Filter.Active != null && filter.Active.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Active;
		}
		
		if(Filter.Cl_onctxt != null && filter.Cl_onctxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "CL_ONCTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cl_onctxt;
		}
		
		if(Filter.Pt_act_id != null && filter.Pt_act_id.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PT_ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pt_act_id;
		}
		
		if(Filter.Genanest != null && filter.Genanest.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "GENANEST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Genanest;
		}
		
		if(Filter.Doserate != null && filter.Doserate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "DOSERATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Doserate;
		}
		
		if(Filter.Plnnophases != null && filter.Plnnophases.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PLNNOPHASES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Plnnophases;
		}
		
		if(Filter.Plnascld != null && filter.Plnascld.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PLNASCLD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Plnascld;
		}
		
		if(Filter.Plnasscdfxns != null && filter.Plnasscdfxns.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PLNASSCDFXNS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Plnasscdfxns;
		}
		
		if(Filter.Plnasscddse != null && filter.Plnasscddse.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PLNASSCDDSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Plnasscddse;
		}
		
		if(Filter.Plnadjflds != null && filter.Plnadjflds.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "PLNADJFLDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Plnadjflds;
		}
		
		if(Filter.Actnophases != null && filter.Actnophases.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "ACTNOPHASES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Actnophases;
		}
		
		if(Filter.Brytdse != null && filter.Brytdse.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BRYTDSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Brytdse;
		}
		
		if(Filter.Brytdseunit != null && filter.Brytdseunit.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BRYTDSEUNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Brytdseunit;
		}
		
		if(Filter.Bryactnooftx != null && filter.Bryactnooftx.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "BRYACTNOOFTX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Bryactnooftx;
		}
		
		if(Filter.Hosptxt != null && filter.Hosptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "HOSPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hosptxt;
		}
		
		if(Filter.Therapy_typetxt != null && filter.Therapy_typetxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			filterString += "THERAPY_TYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Therapy_typetxt;
		}
		
		return filterString;	
	}
	
	private String encodeNASMessage()
	{
		String dataString = "";
		if(DataCollection.count() == 0)
			return dataString;
			
		Onc_radiothRecord data = (Onc_radiothRecord)DataCollection.get(0);
		
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
		
		if(EditFilter.IncludeAct_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Act_id);
		}
		
		if(EditFilter.IncludeTherapy_type)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "THERAPY_TYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Therapy_type);
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
		
		if(EditFilter.IncludeTrdate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TRDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Trdate);
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
		
		if(EditFilter.IncludeBrachytxtyp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BRACHYTXTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Brachytxtyp);
		}
		
		if(EditFilter.IncludeIct)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ICT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ict);
		}
		
		if(EditFilter.IncludeTrt_asite)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TRT_ASITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Trt_asite);
		}
		
		if(EditFilter.IncludeTrt_intent)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TRT_INTENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Trt_intent);
		}
		
		if(EditFilter.IncludeTrt_site)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TRT_SITE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Trt_site);
		}
		
		if(EditFilter.IncludeTxcat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TXCAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Txcat);
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
		
		if(EditFilter.IncludeConchemotx)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CONCHEMOTX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Conchemotx);
		}
		
		if(EditFilter.IncludeTotal_dose)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TOTAL_DOSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Total_dose);
		}
		
		if(EditFilter.IncludeAdose)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADOSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adose);
		}
		
		if(EditFilter.IncludeFractions)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "FRACTIONS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Fractions);
		}
		
		if(EditFilter.IncludeAfraction)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AFRACTION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Afraction);
		}
		
		if(EditFilter.IncludeDuration)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DURATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Duration);
		}
		
		if(EditFilter.IncludeAduration)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADURATION" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Aduration);
		}
		
		if(EditFilter.IncludeTeltx_ppoint)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TELTX_PPOINT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Teltx_ppoint);
		}
		
		if(EditFilter.IncludeBtx_ppoint)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BTX_PPOINT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Btx_ppoint);
		}
		
		if(EditFilter.IncludeAstart_dt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ASTART_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Astart_dt);
		}
		
		if(EditFilter.IncludeAend_dt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "AEND_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Aend_dt);
		}
		
		if(EditFilter.IncludeChreas)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CHREAS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Chreas);
		}
		
		if(EditFilter.IncludeAsplis_supcl)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ASPLIS_SUPCL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Asplis_supcl);
		}
		
		if(EditFilter.IncludeTot_as_dose)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TOT_AS_DOSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tot_as_dose);
		}
		
		if(EditFilter.IncludeTot_as_tx_no)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TOT_AS_TX_NO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tot_as_tx_no);
		}
		
		if(EditFilter.IncludeAdj_flds)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADJ_FLDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adj_flds);
		}
		
		if(EditFilter.IncludeDis_stat)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DIS_STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dis_stat);
		}
		
		if(EditFilter.IncludePrimd_tx)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PRIMD_TX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Primd_tx);
		}
		
		if(EditFilter.IncludeSecd_tx)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SECD_TX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Secd_tx);
		}
		
		if(EditFilter.IncludeRecd_tx)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RECD_TX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Recd_tx);
		}
		
		if(EditFilter.IncludeRetxf)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RETXF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Retxf);
		}
		
		if(EditFilter.IncludeHypfrac)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HYPFRAC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hypfrac);
		}
		
		if(EditFilter.IncludeSpecteq)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SPECTEQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Specteq);
		}
		
		if(EditFilter.IncludePreoptx)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PREOPTX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Preoptx);
		}
		
		if(EditFilter.IncludeRadtype)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "RADTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Radtype);
		}
		
		if(EditFilter.IncludeBeamen)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BEAMEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Beamen);
		}
		
		if(EditFilter.IncludeNofields)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "NOFIELDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nofields);
		}
		
		if(EditFilter.IncludePlcompl)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PLCOMPL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Plcompl);
		}
		
		if(EditFilter.IncludeMultplan)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MULTPLAN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Multplan);
		}
		
		if(EditFilter.IncludeTxlen)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TXLEN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Txlen);
		}
		
		if(EditFilter.IncludeBrdeltype)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BRDELTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Brdeltype);
		}
		
		if(EditFilter.IncludeBrradsrctyp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BRRADSRCTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Brradsrctyp);
		}
		
		if(EditFilter.IncludeAttendtyp)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ATTENDTYP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Attendtyp);
		}
		
		if(EditFilter.IncludeHrg)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HRG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hrg);
		}
		
		if(EditFilter.IncludeChart)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CHART" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Chart);
		}
		
		if(EditFilter.IncludeDnotes)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DNOTES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dnotes);
		}
		
		if(EditFilter.IncludeActive)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Active);
		}
		
		if(EditFilter.IncludeCl_onctxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "CL_ONCTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cl_onctxt);
		}
		
		if(EditFilter.IncludePt_act_id)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PT_ACT_ID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pt_act_id);
		}
		
		if(EditFilter.IncludeGenanest)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "GENANEST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Genanest);
		}
		
		if(EditFilter.IncludeDoserate)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "DOSERATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Doserate);
		}
		
		if(EditFilter.IncludePlnnophases)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PLNNOPHASES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Plnnophases);
		}
		
		if(EditFilter.IncludePlnascld)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PLNASCLD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Plnascld);
		}
		
		if(EditFilter.IncludePlnasscdfxns)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PLNASSCDFXNS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Plnasscdfxns);
		}
		
		if(EditFilter.IncludePlnasscddse)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PLNASSCDDSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Plnasscddse);
		}
		
		if(EditFilter.IncludePlnadjflds)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "PLNADJFLDS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Plnadjflds);
		}
		
		if(EditFilter.IncludeActnophases)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ACTNOPHASES" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Actnophases);
		}
		
		if(EditFilter.IncludeBrytdse)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BRYTDSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Brytdse);
		}
		
		if(EditFilter.IncludeBrytdseunit)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BRYTDSEUNIT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Brytdseunit);
		}
		
		if(EditFilter.IncludeBryactnooftx)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BRYACTNOOFTX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Bryactnooftx);
		}
		
		if(EditFilter.IncludeHosptxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "HOSPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hosptxt);
		}
		
		if(EditFilter.IncludeTherapy_typetxt)
		{
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "THERAPY_TYPETXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Therapy_typetxt);
		}
		
		
		for(int x = 0; x < data.Seqno1Collection.count(); x++)
		{
			Onc_radiothSeqno1Record rgRecord = (Onc_radiothSeqno1Record)data.Seqno1Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno1);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TELE_PHSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Tele_phse);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TELE_DSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Tele_dse);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TELE_FRAC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Tele_frac);
			
		}
		for(int x = 0; x < data.Seqno2Collection.count(); x++)
		{
			Onc_radiothSeqno2Record rgRecord = (Onc_radiothSeqno2Record)data.Seqno2Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno2);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADJTX_PHSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Adjtx_phse);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADJ_DSE1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Adj_dse1);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADJ_NOTX1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Adj_notx1);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADJ_DSE2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Adj_dse2);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADJ_NOTX2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Adj_notx2);
			
		}
		for(int x = 0; x < data.Seqno3Collection.count(); x++)
		{
			Onc_radiothSeqno3Record rgRecord = (Onc_radiothSeqno3Record)data.Seqno3Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno3);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BRAGY_DATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Bragy_date);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BRAGY_DSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Bragy_dse);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "BRAGY_GA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Bragy_ga);
			
		}
		for(int x = 0; x < data.Seqno4Collection.count(); x++)
		{
			Onc_radiothSeqno4Record rgRecord = (Onc_radiothSeqno4Record)data.Seqno4Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno4);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MBQ_DT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mbq_dt);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MBQ_DSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mbq_dse);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "MBQ_GA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Mbq_ga);
			
		}
		for(int x = 0; x < data.Seqno5Collection.count(); x++)
		{
			Onc_radiothSeqno5Record rgRecord = (Onc_radiothSeqno5Record)data.Seqno5Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno5);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TELE_PPHASE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Tele_pphase);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TELE_PDSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Tele_pdse);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "TELE_PFRAC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Tele_pfrac);
			
		}
		for(int x = 0; x < data.Seqno6Collection.count(); x++)
		{
			Onc_radiothSeqno6Record rgRecord = (Onc_radiothSeqno6Record)data.Seqno6Collection.get(x);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "SEQNO6" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Seqno6);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADJTX_PPHSE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Adjtx_pphse);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADJ_PDSE1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Adj_pdse1);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADJ_PNOTX1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Adj_pnotx1);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADJ_PDSE2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Adj_pdse2);
			
			if(dataString.length() > 0)
				dataString += ims.dto.NASMessageCodes.PAIRSEPARATOR;
			dataString += "ADJ_PNOTX2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(rgRecord.Adj_pnotx2);
			
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
			Onc_radiothRecord record = new Onc_radiothRecord();
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
			record.Act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_ID"));
			record.Therapy_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "THERAPY_TYPE"));
			record.Hospital = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPITAL"));
			record.Clin_onc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLIN_ONC"));
			record.Trdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRDATE"));
			record.Reasdel1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REASDEL1"));
			record.Reasdel2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REASDEL2"));
			record.Brachytxtyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BRACHYTXTYP"));
			record.Ict = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ICT"));
			record.Trt_asite = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRT_ASITE"));
			record.Trt_intent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRT_INTENT"));
			record.Trt_site = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRT_SITE"));
			record.Txcat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCAT"));
			record.Startdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STARTDATE"));
			record.Enddate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENDDATE"));
			record.Conchemotx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONCHEMOTX"));
			record.Total_dose = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TOTAL_DOSE"));
			record.Adose = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADOSE"));
			record.Fractions = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FRACTIONS"));
			record.Afraction = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AFRACTION"));
			record.Duration = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DURATION"));
			record.Aduration = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADURATION"));
			record.Teltx_ppoint = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TELTX_PPOINT"));
			record.Btx_ppoint = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BTX_PPOINT"));
			record.Astart_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ASTART_DT"));
			record.Aend_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AEND_DT"));
			record.Chreas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHREAS"));
			record.Asplis_supcl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ASPLIS_SUPCL"));
			record.Tot_as_dose = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TOT_AS_DOSE"));
			record.Tot_as_tx_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TOT_AS_TX_NO"));
			record.Adj_flds = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADJ_FLDS"));
			record.Dis_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIS_STAT"));
			record.Primd_tx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRIMD_TX"));
			record.Secd_tx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SECD_TX"));
			record.Recd_tx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RECD_TX"));
			record.Retxf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RETXF"));
			record.Hypfrac = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HYPFRAC"));
			record.Specteq = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPECTEQ"));
			record.Preoptx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PREOPTX"));
			record.Radtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RADTYPE"));
			record.Beamen = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BEAMEN"));
			record.Nofields = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOFIELDS"));
			record.Plcompl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLCOMPL"));
			record.Multplan = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MULTPLAN"));
			record.Txlen = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXLEN"));
			record.Brdeltype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BRDELTYPE"));
			record.Brradsrctyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BRRADSRCTYP"));
			record.Attendtyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTENDTYP"));
			record.Hrg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HRG"));
			record.Chart = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHART"));
			record.Dnotes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DNOTES"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Cl_onctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CL_ONCTXT"));
			record.Pt_act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PT_ACT_ID"));
			record.Genanest = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GENANEST"));
			record.Doserate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOSERATE"));
			record.Plnnophases = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLNNOPHASES"));
			record.Plnascld = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLNASCLD"));
			record.Plnasscdfxns = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLNASSCDFXNS"));
			record.Plnasscddse = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLNASSCDDSE"));
			record.Plnadjflds = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLNADJFLDS"));
			record.Actnophases = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTNOPHASES"));
			record.Brytdse = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BRYTDSE"));
			record.Brytdseunit = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BRYTDSEUNIT"));
			record.Bryactnooftx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BRYACTNOOFTX"));
			record.Hosptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPTXT"));
			record.Therapy_typetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "THERAPY_TYPETXT"));
									
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
			Onc_radiothRecord record = new Onc_radiothRecord();
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
			record.Act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACT_ID"));
			record.Therapy_type = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "THERAPY_TYPE"));
			record.Hospital = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPITAL"));
			record.Clin_onc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CLIN_ONC"));
			record.Trdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRDATE"));
			record.Reasdel1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REASDEL1"));
			record.Reasdel2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REASDEL2"));
			record.Brachytxtyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BRACHYTXTYP"));
			record.Ict = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ICT"));
			record.Trt_asite = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRT_ASITE"));
			record.Trt_intent = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRT_INTENT"));
			record.Trt_site = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TRT_SITE"));
			record.Txcat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXCAT"));
			record.Startdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STARTDATE"));
			record.Enddate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ENDDATE"));
			record.Conchemotx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONCHEMOTX"));
			record.Total_dose = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TOTAL_DOSE"));
			record.Adose = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADOSE"));
			record.Fractions = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FRACTIONS"));
			record.Afraction = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AFRACTION"));
			record.Duration = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DURATION"));
			record.Aduration = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADURATION"));
			record.Teltx_ppoint = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TELTX_PPOINT"));
			record.Btx_ppoint = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BTX_PPOINT"));
			record.Astart_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ASTART_DT"));
			record.Aend_dt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AEND_DT"));
			record.Chreas = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHREAS"));
			record.Asplis_supcl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ASPLIS_SUPCL"));
			record.Tot_as_dose = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TOT_AS_DOSE"));
			record.Tot_as_tx_no = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TOT_AS_TX_NO"));
			record.Adj_flds = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADJ_FLDS"));
			record.Dis_stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DIS_STAT"));
			record.Primd_tx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRIMD_TX"));
			record.Secd_tx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SECD_TX"));
			record.Recd_tx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RECD_TX"));
			record.Retxf = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RETXF"));
			record.Hypfrac = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HYPFRAC"));
			record.Specteq = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SPECTEQ"));
			record.Preoptx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PREOPTX"));
			record.Radtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RADTYPE"));
			record.Beamen = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BEAMEN"));
			record.Nofields = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NOFIELDS"));
			record.Plcompl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLCOMPL"));
			record.Multplan = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MULTPLAN"));
			record.Txlen = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TXLEN"));
			record.Brdeltype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BRDELTYPE"));
			record.Brradsrctyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BRRADSRCTYP"));
			record.Attendtyp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ATTENDTYP"));
			record.Hrg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HRG"));
			record.Chart = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHART"));
			record.Dnotes = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DNOTES"));
			record.Active = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTIVE"));
			record.Cl_onctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CL_ONCTXT"));
			record.Pt_act_id = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PT_ACT_ID"));
			record.Genanest = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GENANEST"));
			record.Doserate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOSERATE"));
			record.Plnnophases = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLNNOPHASES"));
			record.Plnascld = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLNASCLD"));
			record.Plnasscdfxns = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLNASSCDFXNS"));
			record.Plnasscddse = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLNASSCDDSE"));
			record.Plnadjflds = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLNADJFLDS"));
			record.Actnophases = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ACTNOPHASES"));
			record.Brytdse = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BRYTDSE"));
			record.Brytdseunit = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BRYTDSEUNIT"));
			record.Bryactnooftx = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BRYACTNOOFTX"));
			record.Hosptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPTXT"));
			record.Therapy_typetxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "THERAPY_TYPETXT"));
									
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno1"))
					record.Seqno1Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno2"))
					record.Seqno2Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno3"))
					record.Seqno3Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno4"))
					record.Seqno4Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno5"))
					record.Seqno5Collection.add();
			
			for(int i = 0; i < valueItems.length; i++)
				if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno6"))
					record.Seqno6Collection.add();
			
									
			rgCount = record.Seqno1Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno1"))
					{
						Onc_radiothSeqno1Record rgRecord = record.Seqno1Collection.get(recCount);
						rgRecord.Seqno1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("tele_phse"))
					{
						Onc_radiothSeqno1Record rgRecord = record.Seqno1Collection.get(recCount);
						rgRecord.Tele_phse = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("tele_dse"))
					{
						Onc_radiothSeqno1Record rgRecord = record.Seqno1Collection.get(recCount);
						rgRecord.Tele_dse = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("tele_frac"))
					{
						Onc_radiothSeqno1Record rgRecord = record.Seqno1Collection.get(recCount);
						rgRecord.Tele_frac = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Seqno2Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno2"))
					{
						Onc_radiothSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Seqno2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("adjtx_phse"))
					{
						Onc_radiothSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Adjtx_phse = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("adj_dse1"))
					{
						Onc_radiothSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Adj_dse1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("adj_notx1"))
					{
						Onc_radiothSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Adj_notx1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("adj_dse2"))
					{
						Onc_radiothSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Adj_dse2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("adj_notx2"))
					{
						Onc_radiothSeqno2Record rgRecord = record.Seqno2Collection.get(recCount);
						rgRecord.Adj_notx2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Seqno3Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno3"))
					{
						Onc_radiothSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Seqno3 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("bragy_date"))
					{
						Onc_radiothSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Bragy_date = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("bragy_dse"))
					{
						Onc_radiothSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Bragy_dse = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("bragy_ga"))
					{
						Onc_radiothSeqno3Record rgRecord = record.Seqno3Collection.get(recCount);
						rgRecord.Bragy_ga = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Seqno4Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno4"))
					{
						Onc_radiothSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Seqno4 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("mbq_dt"))
					{
						Onc_radiothSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Mbq_dt = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("mbq_dse"))
					{
						Onc_radiothSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Mbq_dse = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("mbq_ga"))
					{
						Onc_radiothSeqno4Record rgRecord = record.Seqno4Collection.get(recCount);
						rgRecord.Mbq_ga = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Seqno5Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno5"))
					{
						Onc_radiothSeqno5Record rgRecord = record.Seqno5Collection.get(recCount);
						rgRecord.Seqno5 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("tele_pphase"))
					{
						Onc_radiothSeqno5Record rgRecord = record.Seqno5Collection.get(recCount);
						rgRecord.Tele_pphase = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("tele_pdse"))
					{
						Onc_radiothSeqno5Record rgRecord = record.Seqno5Collection.get(recCount);
						rgRecord.Tele_pdse = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("tele_pfrac"))
					{
						Onc_radiothSeqno5Record rgRecord = record.Seqno5Collection.get(recCount);
						rgRecord.Tele_pfrac = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
			}
									
			rgCount = record.Seqno6Collection.count();
			if(rgCount > 0)
			{
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("seqno6"))
					{
						Onc_radiothSeqno6Record rgRecord = record.Seqno6Collection.get(recCount);
						rgRecord.Seqno6 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("adjtx_pphse"))
					{
						Onc_radiothSeqno6Record rgRecord = record.Seqno6Collection.get(recCount);
						rgRecord.Adjtx_pphse = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("adj_pdse1"))
					{
						Onc_radiothSeqno6Record rgRecord = record.Seqno6Collection.get(recCount);
						rgRecord.Adj_pdse1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("adj_pnotx1"))
					{
						Onc_radiothSeqno6Record rgRecord = record.Seqno6Collection.get(recCount);
						rgRecord.Adj_pnotx1 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("adj_pdse2"))
					{
						Onc_radiothSeqno6Record rgRecord = record.Seqno6Collection.get(recCount);
						rgRecord.Adj_pdse2 = Connection.getAttributeValue(valueItems[i]);
						recCount++;
					}
									
					if(rgCount == recCount)
						break;
				}
				
				recCount = 0;
				for(int i = 0; i < valueItems.length; i++)
				{
					if(Connection.getAttributeName(valueItems[i]).toLowerCase().equals("adj_pnotx2"))
					{
						Onc_radiothSeqno6Record rgRecord = record.Seqno6Collection.get(recCount);
						rgRecord.Adj_pnotx2 = Connection.getAttributeValue(valueItems[i]);
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
	
	public final class Onc_radiothCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_radiothRecord newRecord = new Onc_radiothRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_radiothRecord record)
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
		public Onc_radiothRecord get(int index)
		{
			return (Onc_radiothRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class Onc_radiothRecord
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
		public String Act_id = "";
		public String Therapy_type = "";
		public String Hospital = "";
		public String Clin_onc = "";
		public String Trdate = "";
		public String Reasdel1 = "";
		public String Reasdel2 = "";
		public String Brachytxtyp = "";
		public String Ict = "";
		public String Trt_asite = "";
		public String Trt_intent = "";
		public String Trt_site = "";
		public String Txcat = "";
		public String Startdate = "";
		public String Enddate = "";
		public String Conchemotx = "";
		public String Total_dose = "";
		public String Adose = "";
		public String Fractions = "";
		public String Afraction = "";
		public String Duration = "";
		public String Aduration = "";
		public String Teltx_ppoint = "";
		public String Btx_ppoint = "";
		public String Astart_dt = "";
		public String Aend_dt = "";
		public String Chreas = "";
		public String Asplis_supcl = "";
		public String Tot_as_dose = "";
		public String Tot_as_tx_no = "";
		public String Adj_flds = "";
		public String Dis_stat = "";
		public String Primd_tx = "";
		public String Secd_tx = "";
		public String Recd_tx = "";
		public String Retxf = "";
		public String Hypfrac = "";
		public String Specteq = "";
		public String Preoptx = "";
		public String Radtype = "";
		public String Beamen = "";
		public String Nofields = "";
		public String Plcompl = "";
		public String Multplan = "";
		public String Txlen = "";
		public String Brdeltype = "";
		public String Brradsrctyp = "";
		public String Attendtyp = "";
		public String Hrg = "";
		public String Chart = "";
		public String Dnotes = "";
		public String Active = "";
		public String Cl_onctxt = "";
		public String Pt_act_id = "";
		public String Genanest = "";
		public String Doserate = "";
		public String Plnnophases = "";
		public String Plnascld = "";
		public String Plnasscdfxns = "";
		public String Plnasscddse = "";
		public String Plnadjflds = "";
		public String Actnophases = "";
		public String Brytdse = "";
		public String Brytdseunit = "";
		public String Bryactnooftx = "";
		public String Hosptxt = "";
		public String Therapy_typetxt = "";
		
		public Onc_radiothSeqno1Collection Seqno1Collection = new Onc_radiothSeqno1Collection();
		public Onc_radiothSeqno2Collection Seqno2Collection = new Onc_radiothSeqno2Collection();
		public Onc_radiothSeqno3Collection Seqno3Collection = new Onc_radiothSeqno3Collection();
		public Onc_radiothSeqno4Collection Seqno4Collection = new Onc_radiothSeqno4Collection();
		public Onc_radiothSeqno5Collection Seqno5Collection = new Onc_radiothSeqno5Collection();
		public Onc_radiothSeqno6Collection Seqno6Collection = new Onc_radiothSeqno6Collection();		
		
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
			Act_id = "";
			Therapy_type = "";
			Hospital = "";
			Clin_onc = "";
			Trdate = "";
			Reasdel1 = "";
			Reasdel2 = "";
			Brachytxtyp = "";
			Ict = "";
			Trt_asite = "";
			Trt_intent = "";
			Trt_site = "";
			Txcat = "";
			Startdate = "";
			Enddate = "";
			Conchemotx = "";
			Total_dose = "";
			Adose = "";
			Fractions = "";
			Afraction = "";
			Duration = "";
			Aduration = "";
			Teltx_ppoint = "";
			Btx_ppoint = "";
			Astart_dt = "";
			Aend_dt = "";
			Chreas = "";
			Asplis_supcl = "";
			Tot_as_dose = "";
			Tot_as_tx_no = "";
			Adj_flds = "";
			Dis_stat = "";
			Primd_tx = "";
			Secd_tx = "";
			Recd_tx = "";
			Retxf = "";
			Hypfrac = "";
			Specteq = "";
			Preoptx = "";
			Radtype = "";
			Beamen = "";
			Nofields = "";
			Plcompl = "";
			Multplan = "";
			Txlen = "";
			Brdeltype = "";
			Brradsrctyp = "";
			Attendtyp = "";
			Hrg = "";
			Chart = "";
			Dnotes = "";
			Active = "";
			Cl_onctxt = "";
			Pt_act_id = "";
			Genanest = "";
			Doserate = "";
			Plnnophases = "";
			Plnascld = "";
			Plnasscdfxns = "";
			Plnasscddse = "";
			Plnadjflds = "";
			Actnophases = "";
			Brytdse = "";
			Brytdseunit = "";
			Bryactnooftx = "";
			Hosptxt = "";
			Therapy_typetxt = "";
			
			Seqno1Collection.clear();
			Seqno2Collection.clear();
			Seqno3Collection.clear();
			Seqno4Collection.clear();
			Seqno5Collection.clear();
			Seqno6Collection.clear();
		}		
	}
	
	public final class Onc_radiothSeqno1Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_radiothSeqno1Record newRecord = new Onc_radiothSeqno1Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_radiothSeqno1Record record)
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
		public Onc_radiothSeqno1Record get(int index)
		{
			return (Onc_radiothSeqno1Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Onc_radiothSeqno2Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_radiothSeqno2Record newRecord = new Onc_radiothSeqno2Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_radiothSeqno2Record record)
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
		public Onc_radiothSeqno2Record get(int index)
		{
			return (Onc_radiothSeqno2Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Onc_radiothSeqno3Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_radiothSeqno3Record newRecord = new Onc_radiothSeqno3Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_radiothSeqno3Record record)
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
		public Onc_radiothSeqno3Record get(int index)
		{
			return (Onc_radiothSeqno3Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Onc_radiothSeqno4Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_radiothSeqno4Record newRecord = new Onc_radiothSeqno4Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_radiothSeqno4Record record)
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
		public Onc_radiothSeqno4Record get(int index)
		{
			return (Onc_radiothSeqno4Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Onc_radiothSeqno5Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_radiothSeqno5Record newRecord = new Onc_radiothSeqno5Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_radiothSeqno5Record record)
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
		public Onc_radiothSeqno5Record get(int index)
		{
			return (Onc_radiothSeqno5Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	public final class Onc_radiothSeqno6Collection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			Onc_radiothSeqno6Record newRecord = new Onc_radiothSeqno6Record();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(Onc_radiothSeqno6Record record)
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
		public Onc_radiothSeqno6Record get(int index)
		{
			return (Onc_radiothSeqno6Record)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}	
	
	public final class Onc_radiothSeqno1Record
	{
		public String Seqno1 = "";
		public String Tele_phse = "";
		public String Tele_dse = "";
		public String Tele_frac = "";
		
		public void clear()
		{
			Seqno1 = "";
			Tele_phse = "";
			Tele_dse = "";
			Tele_frac = "";
			
		}
	}
	public final class Onc_radiothSeqno2Record
	{
		public String Seqno2 = "";
		public String Adjtx_phse = "";
		public String Adj_dse1 = "";
		public String Adj_notx1 = "";
		public String Adj_dse2 = "";
		public String Adj_notx2 = "";
		
		public void clear()
		{
			Seqno2 = "";
			Adjtx_phse = "";
			Adj_dse1 = "";
			Adj_notx1 = "";
			Adj_dse2 = "";
			Adj_notx2 = "";
			
		}
	}
	public final class Onc_radiothSeqno3Record
	{
		public String Seqno3 = "";
		public String Bragy_date = "";
		public String Bragy_dse = "";
		public String Bragy_ga = "";
		
		public void clear()
		{
			Seqno3 = "";
			Bragy_date = "";
			Bragy_dse = "";
			Bragy_ga = "";
			
		}
	}
	public final class Onc_radiothSeqno4Record
	{
		public String Seqno4 = "";
		public String Mbq_dt = "";
		public String Mbq_dse = "";
		public String Mbq_ga = "";
		
		public void clear()
		{
			Seqno4 = "";
			Mbq_dt = "";
			Mbq_dse = "";
			Mbq_ga = "";
			
		}
	}
	public final class Onc_radiothSeqno5Record
	{
		public String Seqno5 = "";
		public String Tele_pphase = "";
		public String Tele_pdse = "";
		public String Tele_pfrac = "";
		
		public void clear()
		{
			Seqno5 = "";
			Tele_pphase = "";
			Tele_pdse = "";
			Tele_pfrac = "";
			
		}
	}
	public final class Onc_radiothSeqno6Record
	{
		public String Seqno6 = "";
		public String Adjtx_pphse = "";
		public String Adj_pdse1 = "";
		public String Adj_pnotx1 = "";
		public String Adj_pdse2 = "";
		public String Adj_pnotx2 = "";
		
		public void clear()
		{
			Seqno6 = "";
			Adjtx_pphse = "";
			Adj_pdse1 = "";
			Adj_pnotx1 = "";
			Adj_pdse2 = "";
			Adj_pnotx2 = "";
			
		}
	}	
	public final class Onc_radiothFilter
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
		public String Act_id = "";
		public String Therapy_type = "";
		public String Hospital = "";
		public String Clin_onc = "";
		public String Trdate = "";
		public String Reasdel1 = "";
		public String Reasdel2 = "";
		public String Brachytxtyp = "";
		public String Ict = "";
		public String Trt_asite = "";
		public String Trt_intent = "";
		public String Trt_site = "";
		public String Txcat = "";
		public String Startdate = "";
		public String Enddate = "";
		public String Conchemotx = "";
		public String Total_dose = "";
		public String Adose = "";
		public String Fractions = "";
		public String Afraction = "";
		public String Duration = "";
		public String Aduration = "";
		public String Teltx_ppoint = "";
		public String Btx_ppoint = "";
		public String Astart_dt = "";
		public String Aend_dt = "";
		public String Chreas = "";
		public String Asplis_supcl = "";
		public String Tot_as_dose = "";
		public String Tot_as_tx_no = "";
		public String Adj_flds = "";
		public String Dis_stat = "";
		public String Primd_tx = "";
		public String Secd_tx = "";
		public String Recd_tx = "";
		public String Retxf = "";
		public String Hypfrac = "";
		public String Specteq = "";
		public String Preoptx = "";
		public String Radtype = "";
		public String Beamen = "";
		public String Nofields = "";
		public String Plcompl = "";
		public String Multplan = "";
		public String Txlen = "";
		public String Brdeltype = "";
		public String Brradsrctyp = "";
		public String Attendtyp = "";
		public String Hrg = "";
		public String Chart = "";
		public String Dnotes = "";
		public String Active = "";
		public String Cl_onctxt = "";
		public String Pt_act_id = "";
		public String Genanest = "";
		public String Doserate = "";
		public String Plnnophases = "";
		public String Plnascld = "";
		public String Plnasscdfxns = "";
		public String Plnasscddse = "";
		public String Plnadjflds = "";
		public String Actnophases = "";
		public String Brytdse = "";
		public String Brytdseunit = "";
		public String Bryactnooftx = "";
		public String Hosptxt = "";
		public String Therapy_typetxt = "";
		
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
			Act_id = "";
			Therapy_type = "";
			Hospital = "";
			Clin_onc = "";
			Trdate = "";
			Reasdel1 = "";
			Reasdel2 = "";
			Brachytxtyp = "";
			Ict = "";
			Trt_asite = "";
			Trt_intent = "";
			Trt_site = "";
			Txcat = "";
			Startdate = "";
			Enddate = "";
			Conchemotx = "";
			Total_dose = "";
			Adose = "";
			Fractions = "";
			Afraction = "";
			Duration = "";
			Aduration = "";
			Teltx_ppoint = "";
			Btx_ppoint = "";
			Astart_dt = "";
			Aend_dt = "";
			Chreas = "";
			Asplis_supcl = "";
			Tot_as_dose = "";
			Tot_as_tx_no = "";
			Adj_flds = "";
			Dis_stat = "";
			Primd_tx = "";
			Secd_tx = "";
			Recd_tx = "";
			Retxf = "";
			Hypfrac = "";
			Specteq = "";
			Preoptx = "";
			Radtype = "";
			Beamen = "";
			Nofields = "";
			Plcompl = "";
			Multplan = "";
			Txlen = "";
			Brdeltype = "";
			Brradsrctyp = "";
			Attendtyp = "";
			Hrg = "";
			Chart = "";
			Dnotes = "";
			Active = "";
			Cl_onctxt = "";
			Pt_act_id = "";
			Genanest = "";
			Doserate = "";
			Plnnophases = "";
			Plnascld = "";
			Plnasscdfxns = "";
			Plnasscddse = "";
			Plnadjflds = "";
			Actnophases = "";
			Brytdse = "";
			Brytdseunit = "";
			Bryactnooftx = "";
			Hosptxt = "";
			Therapy_typetxt = "";
		}	
		public Onc_radiothFilter cloneObject()
		{
			Onc_radiothFilter newFilter = new Onc_radiothFilter();
			
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
			newFilter.Act_id = this.Act_id;
			newFilter.Therapy_type = this.Therapy_type;
			newFilter.Hospital = this.Hospital;
			newFilter.Clin_onc = this.Clin_onc;
			newFilter.Trdate = this.Trdate;
			newFilter.Reasdel1 = this.Reasdel1;
			newFilter.Reasdel2 = this.Reasdel2;
			newFilter.Brachytxtyp = this.Brachytxtyp;
			newFilter.Ict = this.Ict;
			newFilter.Trt_asite = this.Trt_asite;
			newFilter.Trt_intent = this.Trt_intent;
			newFilter.Trt_site = this.Trt_site;
			newFilter.Txcat = this.Txcat;
			newFilter.Startdate = this.Startdate;
			newFilter.Enddate = this.Enddate;
			newFilter.Conchemotx = this.Conchemotx;
			newFilter.Total_dose = this.Total_dose;
			newFilter.Adose = this.Adose;
			newFilter.Fractions = this.Fractions;
			newFilter.Afraction = this.Afraction;
			newFilter.Duration = this.Duration;
			newFilter.Aduration = this.Aduration;
			newFilter.Teltx_ppoint = this.Teltx_ppoint;
			newFilter.Btx_ppoint = this.Btx_ppoint;
			newFilter.Astart_dt = this.Astart_dt;
			newFilter.Aend_dt = this.Aend_dt;
			newFilter.Chreas = this.Chreas;
			newFilter.Asplis_supcl = this.Asplis_supcl;
			newFilter.Tot_as_dose = this.Tot_as_dose;
			newFilter.Tot_as_tx_no = this.Tot_as_tx_no;
			newFilter.Adj_flds = this.Adj_flds;
			newFilter.Dis_stat = this.Dis_stat;
			newFilter.Primd_tx = this.Primd_tx;
			newFilter.Secd_tx = this.Secd_tx;
			newFilter.Recd_tx = this.Recd_tx;
			newFilter.Retxf = this.Retxf;
			newFilter.Hypfrac = this.Hypfrac;
			newFilter.Specteq = this.Specteq;
			newFilter.Preoptx = this.Preoptx;
			newFilter.Radtype = this.Radtype;
			newFilter.Beamen = this.Beamen;
			newFilter.Nofields = this.Nofields;
			newFilter.Plcompl = this.Plcompl;
			newFilter.Multplan = this.Multplan;
			newFilter.Txlen = this.Txlen;
			newFilter.Brdeltype = this.Brdeltype;
			newFilter.Brradsrctyp = this.Brradsrctyp;
			newFilter.Attendtyp = this.Attendtyp;
			newFilter.Hrg = this.Hrg;
			newFilter.Chart = this.Chart;
			newFilter.Dnotes = this.Dnotes;
			newFilter.Active = this.Active;
			newFilter.Cl_onctxt = this.Cl_onctxt;
			newFilter.Pt_act_id = this.Pt_act_id;
			newFilter.Genanest = this.Genanest;
			newFilter.Doserate = this.Doserate;
			newFilter.Plnnophases = this.Plnnophases;
			newFilter.Plnascld = this.Plnascld;
			newFilter.Plnasscdfxns = this.Plnasscdfxns;
			newFilter.Plnasscddse = this.Plnasscddse;
			newFilter.Plnadjflds = this.Plnadjflds;
			newFilter.Actnophases = this.Actnophases;
			newFilter.Brytdse = this.Brytdse;
			newFilter.Brytdseunit = this.Brytdseunit;
			newFilter.Bryactnooftx = this.Bryactnooftx;
			newFilter.Hosptxt = this.Hosptxt;
			newFilter.Therapy_typetxt = this.Therapy_typetxt;
			
			return newFilter;
		}
	}
	public final class Onc_radiothEditFilter
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
		public boolean IncludeAct_id = true;
		public boolean IncludeTherapy_type = true;
		public boolean IncludeHospital = true;
		public boolean IncludeClin_onc = true;
		public boolean IncludeTrdate = true;
		public boolean IncludeReasdel1 = true;
		public boolean IncludeReasdel2 = true;
		public boolean IncludeBrachytxtyp = true;
		public boolean IncludeIct = true;
		public boolean IncludeTrt_asite = true;
		public boolean IncludeTrt_intent = true;
		public boolean IncludeTrt_site = true;
		public boolean IncludeTxcat = true;
		public boolean IncludeStartdate = true;
		public boolean IncludeEnddate = true;
		public boolean IncludeConchemotx = true;
		public boolean IncludeTotal_dose = true;
		public boolean IncludeAdose = true;
		public boolean IncludeFractions = true;
		public boolean IncludeAfraction = true;
		public boolean IncludeDuration = true;
		public boolean IncludeAduration = true;
		public boolean IncludeTeltx_ppoint = true;
		public boolean IncludeBtx_ppoint = true;
		public boolean IncludeAstart_dt = true;
		public boolean IncludeAend_dt = true;
		public boolean IncludeChreas = true;
		public boolean IncludeAsplis_supcl = true;
		public boolean IncludeTot_as_dose = true;
		public boolean IncludeTot_as_tx_no = true;
		public boolean IncludeAdj_flds = true;
		public boolean IncludeDis_stat = true;
		public boolean IncludePrimd_tx = true;
		public boolean IncludeSecd_tx = true;
		public boolean IncludeRecd_tx = true;
		public boolean IncludeRetxf = true;
		public boolean IncludeHypfrac = true;
		public boolean IncludeSpecteq = true;
		public boolean IncludePreoptx = true;
		public boolean IncludeRadtype = true;
		public boolean IncludeBeamen = true;
		public boolean IncludeNofields = true;
		public boolean IncludePlcompl = true;
		public boolean IncludeMultplan = true;
		public boolean IncludeTxlen = true;
		public boolean IncludeBrdeltype = true;
		public boolean IncludeBrradsrctyp = true;
		public boolean IncludeAttendtyp = true;
		public boolean IncludeHrg = true;
		public boolean IncludeChart = true;
		public boolean IncludeDnotes = true;
		public boolean IncludeActive = true;
		public boolean IncludeCl_onctxt = true;
		public boolean IncludePt_act_id = true;
		public boolean IncludeGenanest = true;
		public boolean IncludeDoserate = true;
		public boolean IncludePlnnophases = true;
		public boolean IncludePlnascld = true;
		public boolean IncludePlnasscdfxns = true;
		public boolean IncludePlnasscddse = true;
		public boolean IncludePlnadjflds = true;
		public boolean IncludeActnophases = true;
		public boolean IncludeBrytdse = true;
		public boolean IncludeBrytdseunit = true;
		public boolean IncludeBryactnooftx = true;
		public boolean IncludeHosptxt = true;
		public boolean IncludeTherapy_typetxt = true;
		
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
			IncludeAct_id = true;
			IncludeTherapy_type = true;
			IncludeHospital = true;
			IncludeClin_onc = true;
			IncludeTrdate = true;
			IncludeReasdel1 = true;
			IncludeReasdel2 = true;
			IncludeBrachytxtyp = true;
			IncludeIct = true;
			IncludeTrt_asite = true;
			IncludeTrt_intent = true;
			IncludeTrt_site = true;
			IncludeTxcat = true;
			IncludeStartdate = true;
			IncludeEnddate = true;
			IncludeConchemotx = true;
			IncludeTotal_dose = true;
			IncludeAdose = true;
			IncludeFractions = true;
			IncludeAfraction = true;
			IncludeDuration = true;
			IncludeAduration = true;
			IncludeTeltx_ppoint = true;
			IncludeBtx_ppoint = true;
			IncludeAstart_dt = true;
			IncludeAend_dt = true;
			IncludeChreas = true;
			IncludeAsplis_supcl = true;
			IncludeTot_as_dose = true;
			IncludeTot_as_tx_no = true;
			IncludeAdj_flds = true;
			IncludeDis_stat = true;
			IncludePrimd_tx = true;
			IncludeSecd_tx = true;
			IncludeRecd_tx = true;
			IncludeRetxf = true;
			IncludeHypfrac = true;
			IncludeSpecteq = true;
			IncludePreoptx = true;
			IncludeRadtype = true;
			IncludeBeamen = true;
			IncludeNofields = true;
			IncludePlcompl = true;
			IncludeMultplan = true;
			IncludeTxlen = true;
			IncludeBrdeltype = true;
			IncludeBrradsrctyp = true;
			IncludeAttendtyp = true;
			IncludeHrg = true;
			IncludeChart = true;
			IncludeDnotes = true;
			IncludeActive = true;
			IncludeCl_onctxt = true;
			IncludePt_act_id = true;
			IncludeGenanest = true;
			IncludeDoserate = true;
			IncludePlnnophases = true;
			IncludePlnascld = true;
			IncludePlnasscdfxns = true;
			IncludePlnasscddse = true;
			IncludePlnadjflds = true;
			IncludeActnophases = true;
			IncludeBrytdse = true;
			IncludeBrytdseunit = true;
			IncludeBryactnooftx = true;
			IncludeHosptxt = true;
			IncludeTherapy_typetxt = true;
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
			IncludeAct_id = false;
			IncludeTherapy_type = false;
			IncludeHospital = false;
			IncludeClin_onc = false;
			IncludeTrdate = false;
			IncludeReasdel1 = false;
			IncludeReasdel2 = false;
			IncludeBrachytxtyp = false;
			IncludeIct = false;
			IncludeTrt_asite = false;
			IncludeTrt_intent = false;
			IncludeTrt_site = false;
			IncludeTxcat = false;
			IncludeStartdate = false;
			IncludeEnddate = false;
			IncludeConchemotx = false;
			IncludeTotal_dose = false;
			IncludeAdose = false;
			IncludeFractions = false;
			IncludeAfraction = false;
			IncludeDuration = false;
			IncludeAduration = false;
			IncludeTeltx_ppoint = false;
			IncludeBtx_ppoint = false;
			IncludeAstart_dt = false;
			IncludeAend_dt = false;
			IncludeChreas = false;
			IncludeAsplis_supcl = false;
			IncludeTot_as_dose = false;
			IncludeTot_as_tx_no = false;
			IncludeAdj_flds = false;
			IncludeDis_stat = false;
			IncludePrimd_tx = false;
			IncludeSecd_tx = false;
			IncludeRecd_tx = false;
			IncludeRetxf = false;
			IncludeHypfrac = false;
			IncludeSpecteq = false;
			IncludePreoptx = false;
			IncludeRadtype = false;
			IncludeBeamen = false;
			IncludeNofields = false;
			IncludePlcompl = false;
			IncludeMultplan = false;
			IncludeTxlen = false;
			IncludeBrdeltype = false;
			IncludeBrradsrctyp = false;
			IncludeAttendtyp = false;
			IncludeHrg = false;
			IncludeChart = false;
			IncludeDnotes = false;
			IncludeActive = false;
			IncludeCl_onctxt = false;
			IncludePt_act_id = false;
			IncludeGenanest = false;
			IncludeDoserate = false;
			IncludePlnnophases = false;
			IncludePlnascld = false;
			IncludePlnasscdfxns = false;
			IncludePlnasscddse = false;
			IncludePlnadjflds = false;
			IncludeActnophases = false;
			IncludeBrytdse = false;
			IncludeBrytdseunit = false;
			IncludeBryactnooftx = false;
			IncludeHosptxt = false;
			IncludeTherapy_typetxt = false;
		}
		public Onc_radiothEditFilter cloneObject()
		{
			Onc_radiothEditFilter newEditFilter = new Onc_radiothEditFilter();
			
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
			newEditFilter.IncludeAct_id = this.IncludeAct_id;
			newEditFilter.IncludeTherapy_type = this.IncludeTherapy_type;
			newEditFilter.IncludeHospital = this.IncludeHospital;
			newEditFilter.IncludeClin_onc = this.IncludeClin_onc;
			newEditFilter.IncludeTrdate = this.IncludeTrdate;
			newEditFilter.IncludeReasdel1 = this.IncludeReasdel1;
			newEditFilter.IncludeReasdel2 = this.IncludeReasdel2;
			newEditFilter.IncludeBrachytxtyp = this.IncludeBrachytxtyp;
			newEditFilter.IncludeIct = this.IncludeIct;
			newEditFilter.IncludeTrt_asite = this.IncludeTrt_asite;
			newEditFilter.IncludeTrt_intent = this.IncludeTrt_intent;
			newEditFilter.IncludeTrt_site = this.IncludeTrt_site;
			newEditFilter.IncludeTxcat = this.IncludeTxcat;
			newEditFilter.IncludeStartdate = this.IncludeStartdate;
			newEditFilter.IncludeEnddate = this.IncludeEnddate;
			newEditFilter.IncludeConchemotx = this.IncludeConchemotx;
			newEditFilter.IncludeTotal_dose = this.IncludeTotal_dose;
			newEditFilter.IncludeAdose = this.IncludeAdose;
			newEditFilter.IncludeFractions = this.IncludeFractions;
			newEditFilter.IncludeAfraction = this.IncludeAfraction;
			newEditFilter.IncludeDuration = this.IncludeDuration;
			newEditFilter.IncludeAduration = this.IncludeAduration;
			newEditFilter.IncludeTeltx_ppoint = this.IncludeTeltx_ppoint;
			newEditFilter.IncludeBtx_ppoint = this.IncludeBtx_ppoint;
			newEditFilter.IncludeAstart_dt = this.IncludeAstart_dt;
			newEditFilter.IncludeAend_dt = this.IncludeAend_dt;
			newEditFilter.IncludeChreas = this.IncludeChreas;
			newEditFilter.IncludeAsplis_supcl = this.IncludeAsplis_supcl;
			newEditFilter.IncludeTot_as_dose = this.IncludeTot_as_dose;
			newEditFilter.IncludeTot_as_tx_no = this.IncludeTot_as_tx_no;
			newEditFilter.IncludeAdj_flds = this.IncludeAdj_flds;
			newEditFilter.IncludeDis_stat = this.IncludeDis_stat;
			newEditFilter.IncludePrimd_tx = this.IncludePrimd_tx;
			newEditFilter.IncludeSecd_tx = this.IncludeSecd_tx;
			newEditFilter.IncludeRecd_tx = this.IncludeRecd_tx;
			newEditFilter.IncludeRetxf = this.IncludeRetxf;
			newEditFilter.IncludeHypfrac = this.IncludeHypfrac;
			newEditFilter.IncludeSpecteq = this.IncludeSpecteq;
			newEditFilter.IncludePreoptx = this.IncludePreoptx;
			newEditFilter.IncludeRadtype = this.IncludeRadtype;
			newEditFilter.IncludeBeamen = this.IncludeBeamen;
			newEditFilter.IncludeNofields = this.IncludeNofields;
			newEditFilter.IncludePlcompl = this.IncludePlcompl;
			newEditFilter.IncludeMultplan = this.IncludeMultplan;
			newEditFilter.IncludeTxlen = this.IncludeTxlen;
			newEditFilter.IncludeBrdeltype = this.IncludeBrdeltype;
			newEditFilter.IncludeBrradsrctyp = this.IncludeBrradsrctyp;
			newEditFilter.IncludeAttendtyp = this.IncludeAttendtyp;
			newEditFilter.IncludeHrg = this.IncludeHrg;
			newEditFilter.IncludeChart = this.IncludeChart;
			newEditFilter.IncludeDnotes = this.IncludeDnotes;
			newEditFilter.IncludeActive = this.IncludeActive;
			newEditFilter.IncludeCl_onctxt = this.IncludeCl_onctxt;
			newEditFilter.IncludePt_act_id = this.IncludePt_act_id;
			newEditFilter.IncludeGenanest = this.IncludeGenanest;
			newEditFilter.IncludeDoserate = this.IncludeDoserate;
			newEditFilter.IncludePlnnophases = this.IncludePlnnophases;
			newEditFilter.IncludePlnascld = this.IncludePlnascld;
			newEditFilter.IncludePlnasscdfxns = this.IncludePlnasscdfxns;
			newEditFilter.IncludePlnasscddse = this.IncludePlnasscddse;
			newEditFilter.IncludePlnadjflds = this.IncludePlnadjflds;
			newEditFilter.IncludeActnophases = this.IncludeActnophases;
			newEditFilter.IncludeBrytdse = this.IncludeBrytdse;
			newEditFilter.IncludeBrytdseunit = this.IncludeBrytdseunit;
			newEditFilter.IncludeBryactnooftx = this.IncludeBryactnooftx;
			newEditFilter.IncludeHosptxt = this.IncludeHosptxt;
			newEditFilter.IncludeTherapy_typetxt = this.IncludeTherapy_typetxt;
			
			return newEditFilter;
		}
	}
}
