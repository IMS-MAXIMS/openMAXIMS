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

public final class Patient implements ims.vo.ImsCloneable
{
	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Patient.class);
	
	private PatientFilter lastGetFilter = null;
	private final String serviceName = "PATIENT";
	private boolean listInProgress = false;
	private ims.dto.ResultData lastResultData = null;
	/**
	 * Represents the Data Transfer Object Connection used for this client object.
	 */ 
	public ims.dto.Connection Connection = null;
	/**
	 * Represents the filter used by the current Data Transfer Object.
	 */ 
	public PatientFilter Filter = new PatientFilter();			
	/**
	 * Represents the filter used by the current Data Transfer Object to Insert/Update data.
	 */ 
	public PatientEditFilter EditFilter = new PatientEditFilter();
	/**
	 * Contains the data records for the current Data Transfer Object
	 */ 
	public PatientCollection DataCollection = new PatientCollection();

	/**
	 * Creates a new Patient Data Transfer Object.
	 */ 
	public Patient(ims.dto.Connection connection)
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
	public Patient cloneObject()
	{
		Patient cloneObject = new Patient(Connection);
			
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
			cloneObject.DataCollection.get(index).Snm = DataCollection.get(x).Snm;
			cloneObject.DataCollection.get(index).Fnm1 = DataCollection.get(x).Fnm1;
			cloneObject.DataCollection.get(index).Fnm2 = DataCollection.get(x).Fnm2;
			cloneObject.DataCollection.get(index).Nmtype = DataCollection.get(x).Nmtype;
			cloneObject.DataCollection.get(index).Uppsnm = DataCollection.get(x).Uppsnm;
			cloneObject.DataCollection.get(index).Uppfnm = DataCollection.get(x).Uppfnm;
			cloneObject.DataCollection.get(index).Titl = DataCollection.get(x).Titl;
			cloneObject.DataCollection.get(index).Titltxt = DataCollection.get(x).Titltxt;
			cloneObject.DataCollection.get(index).Soundex = DataCollection.get(x).Soundex;
			cloneObject.DataCollection.get(index).Soundex_fnm = DataCollection.get(x).Soundex_fnm;
			cloneObject.DataCollection.get(index).Dob = DataCollection.get(x).Dob;
			cloneObject.DataCollection.get(index).Dod = DataCollection.get(x).Dod;
			cloneObject.DataCollection.get(index).Sex = DataCollection.get(x).Sex;
			cloneObject.DataCollection.get(index).Nhsn = DataCollection.get(x).Nhsn;
			cloneObject.DataCollection.get(index).Tsta = DataCollection.get(x).Tsta;
			cloneObject.DataCollection.get(index).Csta = DataCollection.get(x).Csta;
			cloneObject.DataCollection.get(index).Hospnum = DataCollection.get(x).Hospnum;
			cloneObject.DataCollection.get(index).Pmrn = DataCollection.get(x).Pmrn;
			cloneObject.DataCollection.get(index).Lpdpkey = DataCollection.get(x).Lpdpkey;
			cloneObject.DataCollection.get(index).Hpcd = DataCollection.get(x).Hpcd;
			cloneObject.DataCollection.get(index).Ploc = DataCollection.get(x).Ploc;
			cloneObject.DataCollection.get(index).Patstat = DataCollection.get(x).Patstat;
			cloneObject.DataCollection.get(index).Cfl = DataCollection.get(x).Cfl;
			cloneObject.DataCollection.get(index).Cflname = DataCollection.get(x).Cflname;
			cloneObject.DataCollection.get(index).Cfdt = DataCollection.get(x).Cfdt;
			cloneObject.DataCollection.get(index).Lpdstat = DataCollection.get(x).Lpdstat;
			cloneObject.DataCollection.get(index).Plocname = DataCollection.get(x).Plocname;
			cloneObject.DataCollection.get(index).Aldt = DataCollection.get(x).Aldt;
			cloneObject.DataCollection.get(index).Tydt = DataCollection.get(x).Tydt;
			cloneObject.DataCollection.get(index).Cnt = DataCollection.get(x).Cnt;
			cloneObject.DataCollection.get(index).Cntname = DataCollection.get(x).Cntname;
			cloneObject.DataCollection.get(index).Adr1 = DataCollection.get(x).Adr1;
			cloneObject.DataCollection.get(index).Adr2 = DataCollection.get(x).Adr2;
			cloneObject.DataCollection.get(index).Adr3 = DataCollection.get(x).Adr3;
			cloneObject.DataCollection.get(index).Adr4 = DataCollection.get(x).Adr4;
			cloneObject.DataCollection.get(index).Adr5 = DataCollection.get(x).Adr5;
			cloneObject.DataCollection.get(index).Post = DataCollection.get(x).Post;
			cloneObject.DataCollection.get(index).Harc = DataCollection.get(x).Harc;
			cloneObject.DataCollection.get(index).Ntel = DataCollection.get(x).Ntel;
			cloneObject.DataCollection.get(index).Dtel = DataCollection.get(x).Dtel;
			cloneObject.DataCollection.get(index).Pob = DataCollection.get(x).Pob;
			cloneObject.DataCollection.get(index).Stat = DataCollection.get(x).Stat;
			cloneObject.DataCollection.get(index).Mart = DataCollection.get(x).Mart;
			cloneObject.DataCollection.get(index).Ethc = DataCollection.get(x).Ethc;
			cloneObject.DataCollection.get(index).Pmipkey = DataCollection.get(x).Pmipkey;
			cloneObject.DataCollection.get(index).Relg = DataCollection.get(x).Relg;
			cloneObject.DataCollection.get(index).Epsd = DataCollection.get(x).Epsd;
			cloneObject.DataCollection.get(index).Gpcd = DataCollection.get(x).Gpcd;
			cloneObject.DataCollection.get(index).Gploc = DataCollection.get(x).Gploc;
			cloneObject.DataCollection.get(index).Prcd = DataCollection.get(x).Prcd;
			cloneObject.DataCollection.get(index).Gpfh = DataCollection.get(x).Gpfh;
			cloneObject.DataCollection.get(index).Pocc = DataCollection.get(x).Pocc;
			cloneObject.DataCollection.get(index).Pocctxt = DataCollection.get(x).Pocctxt;
			cloneObject.DataCollection.get(index).Socc = DataCollection.get(x).Socc;
			cloneObject.DataCollection.get(index).School = DataCollection.get(x).School;
			cloneObject.DataCollection.get(index).Rgdt = DataCollection.get(x).Rgdt;
			cloneObject.DataCollection.get(index).Bgrp = DataCollection.get(x).Bgrp;
			cloneObject.DataCollection.get(index).Adat = DataCollection.get(x).Adat;
			cloneObject.DataCollection.get(index).Srce = DataCollection.get(x).Srce;
			cloneObject.DataCollection.get(index).Alert = DataCollection.get(x).Alert;
			cloneObject.DataCollection.get(index).Mfr1 = DataCollection.get(x).Mfr1;
			cloneObject.DataCollection.get(index).Mfr2 = DataCollection.get(x).Mfr2;
			cloneObject.DataCollection.get(index).Mfr3 = DataCollection.get(x).Mfr3;
			cloneObject.DataCollection.get(index).Mfr4 = DataCollection.get(x).Mfr4;
			cloneObject.DataCollection.get(index).Mfr5 = DataCollection.get(x).Mfr5;
			cloneObject.DataCollection.get(index).Mfr6 = DataCollection.get(x).Mfr6;
			cloneObject.DataCollection.get(index).Mrsa = DataCollection.get(x).Mrsa;
			cloneObject.DataCollection.get(index).Gpcdname = DataCollection.get(x).Gpcdname;
			cloneObject.DataCollection.get(index).Gptitlftxt = DataCollection.get(x).Gptitlftxt;
			cloneObject.DataCollection.get(index).Gpadr1 = DataCollection.get(x).Gpadr1;
			cloneObject.DataCollection.get(index).Gpadr2 = DataCollection.get(x).Gpadr2;
			cloneObject.DataCollection.get(index).Gpadr3 = DataCollection.get(x).Gpadr3;
			cloneObject.DataCollection.get(index).Gpadr4 = DataCollection.get(x).Gpadr4;
			cloneObject.DataCollection.get(index).Gpadr5 = DataCollection.get(x).Gpadr5;
			cloneObject.DataCollection.get(index).Gppost = DataCollection.get(x).Gppost;
			cloneObject.DataCollection.get(index).Gptel = DataCollection.get(x).Gptel;
			cloneObject.DataCollection.get(index).Name = DataCollection.get(x).Name;
			cloneObject.DataCollection.get(index).Nkfnam = DataCollection.get(x).Nkfnam;
			cloneObject.DataCollection.get(index).Ntitl = DataCollection.get(x).Ntitl;
			cloneObject.DataCollection.get(index).Nadr1 = DataCollection.get(x).Nadr1;
			cloneObject.DataCollection.get(index).Nadr2 = DataCollection.get(x).Nadr2;
			cloneObject.DataCollection.get(index).Nadr3 = DataCollection.get(x).Nadr3;
			cloneObject.DataCollection.get(index).Nadr4 = DataCollection.get(x).Nadr4;
			cloneObject.DataCollection.get(index).Nadr5 = DataCollection.get(x).Nadr5;
			cloneObject.DataCollection.get(index).Npost = DataCollection.get(x).Npost;
			cloneObject.DataCollection.get(index).Nntel = DataCollection.get(x).Nntel;
			cloneObject.DataCollection.get(index).Ndtel = DataCollection.get(x).Ndtel;
			cloneObject.DataCollection.get(index).Rel = DataCollection.get(x).Rel;
			cloneObject.DataCollection.get(index).Reltxt = DataCollection.get(x).Reltxt;
			cloneObject.DataCollection.get(index).Ntitltxt = DataCollection.get(x).Ntitltxt;
			cloneObject.DataCollection.get(index).Aliasname = DataCollection.get(x).Aliasname;
			cloneObject.DataCollection.get(index).Snmb = DataCollection.get(x).Snmb;
			cloneObject.DataCollection.get(index).Tadr1 = DataCollection.get(x).Tadr1;
			cloneObject.DataCollection.get(index).Tadr2 = DataCollection.get(x).Tadr2;
			cloneObject.DataCollection.get(index).Tadr3 = DataCollection.get(x).Tadr3;
			cloneObject.DataCollection.get(index).Tadr4 = DataCollection.get(x).Tadr4;
			cloneObject.DataCollection.get(index).Tpost = DataCollection.get(x).Tpost;
			cloneObject.DataCollection.get(index).Tdtel = DataCollection.get(x).Tdtel;
			cloneObject.DataCollection.get(index).Tntel = DataCollection.get(x).Tntel;
			cloneObject.DataCollection.get(index).Sextxt = DataCollection.get(x).Sextxt;
			cloneObject.DataCollection.get(index).Otherhnos = DataCollection.get(x).Otherhnos;
			cloneObject.DataCollection.get(index).Remote = DataCollection.get(x).Remote;
			cloneObject.DataCollection.get(index).Healthcat = DataCollection.get(x).Healthcat;
			cloneObject.DataCollection.get(index).Medcard = DataCollection.get(x).Medcard;
			cloneObject.DataCollection.get(index).Medcardno = DataCollection.get(x).Medcardno;
			cloneObject.DataCollection.get(index).Medname = DataCollection.get(x).Medname;
			cloneObject.DataCollection.get(index).Medprof = DataCollection.get(x).Medprof;
			cloneObject.DataCollection.get(index).Medeldate = DataCollection.get(x).Medeldate;
			cloneObject.DataCollection.get(index).Medreviewclass = DataCollection.get(x).Medreviewclass;
			cloneObject.DataCollection.get(index).Medreviewdate = DataCollection.get(x).Medreviewdate;
			cloneObject.DataCollection.get(index).Ecnational = DataCollection.get(x).Ecnational;
			cloneObject.DataCollection.get(index).Insurer = DataCollection.get(x).Insurer;
			cloneObject.DataCollection.get(index).Policytype = DataCollection.get(x).Policytype;
			cloneObject.DataCollection.get(index).Policynum = DataCollection.get(x).Policynum;
			cloneObject.DataCollection.get(index).Chartnum = DataCollection.get(x).Chartnum;
			cloneObject.DataCollection.get(index).Xraynum = DataCollection.get(x).Xraynum;
			cloneObject.DataCollection.get(index).Mobile = DataCollection.get(x).Mobile;
			cloneObject.DataCollection.get(index).Tmobile = DataCollection.get(x).Tmobile;
			cloneObject.DataCollection.get(index).Nkmobile = DataCollection.get(x).Nkmobile;
			cloneObject.DataCollection.get(index).Contact = DataCollection.get(x).Contact;
			cloneObject.DataCollection.get(index).Ded = DataCollection.get(x).Ded;
			cloneObject.DataCollection.get(index).Occstat = DataCollection.get(x).Occstat;
			cloneObject.DataCollection.get(index).Pas_pkey = DataCollection.get(x).Pas_pkey;
			cloneObject.DataCollection.get(index).Bedtyper = DataCollection.get(x).Bedtyper;
			cloneObject.DataCollection.get(index).__key = DataCollection.get(x).__key;
			cloneObject.DataCollection.get(index).Chinum = DataCollection.get(x).Chinum;
			cloneObject.DataCollection.get(index).Chtnum = DataCollection.get(x).Chtnum;
			cloneObject.DataCollection.get(index).Ovstat = DataCollection.get(x).Ovstat;
			cloneObject.DataCollection.get(index).Ovsdate = DataCollection.get(x).Ovsdate;
			cloneObject.DataCollection.get(index).Flang = DataCollection.get(x).Flang;
			cloneObject.DataCollection.get(index).Intreq = DataCollection.get(x).Intreq;
			cloneObject.DataCollection.get(index).Dobver = DataCollection.get(x).Dobver;
			cloneObject.DataCollection.get(index).Extended = DataCollection.get(x).Extended;
			cloneObject.DataCollection.get(index).Genhspno = DataCollection.get(x).Genhspno;
			cloneObject.DataCollection.get(index).Rusr = DataCollection.get(x).Rusr;
			cloneObject.DataCollection.get(index).Rdat = DataCollection.get(x).Rdat;
			cloneObject.DataCollection.get(index).Rtim = DataCollection.get(x).Rtim;
			cloneObject.DataCollection.get(index).Uusr = DataCollection.get(x).Uusr;
			cloneObject.DataCollection.get(index).Udat = DataCollection.get(x).Udat;
			cloneObject.DataCollection.get(index).Utim = DataCollection.get(x).Utim;
			cloneObject.DataCollection.get(index).Cdat = DataCollection.get(x).Cdat;
			cloneObject.DataCollection.get(index).Ctim = DataCollection.get(x).Ctim;
			cloneObject.DataCollection.get(index).Idstat = DataCollection.get(x).Idstat;
			cloneObject.DataCollection.get(index).Oidtype = DataCollection.get(x).Oidtype;
			cloneObject.DataCollection.get(index).Oidval = DataCollection.get(x).Oidval;
			cloneObject.DataCollection.get(index).Relgtxt = DataCollection.get(x).Relgtxt;
			cloneObject.DataCollection.get(index).Ethctxt = DataCollection.get(x).Ethctxt;
			cloneObject.DataCollection.get(index).Marttxt = DataCollection.get(x).Marttxt;
			cloneObject.DataCollection.get(index).Areacodetext = DataCollection.get(x).Areacodetext;
			cloneObject.DataCollection.get(index).Hbdtext = DataCollection.get(x).Hbdtext;
			cloneObject.DataCollection.get(index).Policytypetext = DataCollection.get(x).Policytypetext;
			cloneObject.DataCollection.get(index).Insurertext = DataCollection.get(x).Insurertext;
			cloneObject.DataCollection.get(index).Bgrptxt = DataCollection.get(x).Bgrptxt;
			cloneObject.DataCollection.get(index).Comment = DataCollection.get(x).Comment;
			cloneObject.DataCollection.get(index).Tstp = DataCollection.get(x).Tstp;
			cloneObject.DataCollection.get(index).Renewdate = DataCollection.get(x).Renewdate;
			cloneObject.DataCollection.get(index).Race = DataCollection.get(x).Race;
			cloneObject.DataCollection.get(index).Inactive = DataCollection.get(x).Inactive;
			cloneObject.DataCollection.get(index).State = DataCollection.get(x).State;
			cloneObject.DataCollection.get(index).City = DataCollection.get(x).City;
			cloneObject.DataCollection.get(index).Guarid = DataCollection.get(x).Guarid;
			cloneObject.DataCollection.get(index).Guarrel = DataCollection.get(x).Guarrel;
			cloneObject.DataCollection.get(index).Insrel = DataCollection.get(x).Insrel;
			cloneObject.DataCollection.get(index).Insuredid = DataCollection.get(x).Insuredid;
			cloneObject.DataCollection.get(index).Conadr1 = DataCollection.get(x).Conadr1;
			cloneObject.DataCollection.get(index).Conadr2 = DataCollection.get(x).Conadr2;
			cloneObject.DataCollection.get(index).Conadr3 = DataCollection.get(x).Conadr3;
			cloneObject.DataCollection.get(index).Conadr4 = DataCollection.get(x).Conadr4;
			cloneObject.DataCollection.get(index).Contel = DataCollection.get(x).Contel;
			cloneObject.DataCollection.get(index).Motherid = DataCollection.get(x).Motherid;
			cloneObject.DataCollection.get(index).Contractpc = DataCollection.get(x).Contractpc;
			cloneObject.DataCollection.get(index).Area = DataCollection.get(x).Area;
			cloneObject.DataCollection.get(index).Whenentered = DataCollection.get(x).Whenentered;
			cloneObject.DataCollection.get(index).Whenupdated = DataCollection.get(x).Whenupdated;
			cloneObject.DataCollection.get(index).Nhsnfmtver = DataCollection.get(x).Nhsnfmtver;
			cloneObject.DataCollection.get(index).Nhsnfmt = DataCollection.get(x).Nhsnfmt;
			cloneObject.DataCollection.get(index).Nhsnfmtvflag = DataCollection.get(x).Nhsnfmtvflag;
			cloneObject.DataCollection.get(index).Nhsnver = DataCollection.get(x).Nhsnver;
			cloneObject.DataCollection.get(index).Capfnm1 = DataCollection.get(x).Capfnm1;
			cloneObject.DataCollection.get(index).Cflcomm = DataCollection.get(x).Cflcomm;
			cloneObject.DataCollection.get(index).Webadt = DataCollection.get(x).Webadt;
			cloneObject.DataCollection.get(index).Delpatact = DataCollection.get(x).Delpatact;
							
			
		}
		
		return cloneObject;
	}
	/**
	 * Returns the Imx version
	 */	
	public String getImxVersion()
	{
		return "$Revision: 1.16.4.3 $";
	}
	/**
	 * Returns the Imx name
	 */	
	public String getImxName()
	{
		return "Patient.imx".toLowerCase();
	}
	/**
	 * Returns the number of records using the specified filter. This method always returns a non null result. The ID field holds the count result (when greater or equal to zero) or the error number (when less than zero).
	 */
	public ims.dto.Result count()
	{
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patient.Count");
			
		int result = Connection.count(serviceName, encodeNASFilter());
		if(result >= 0)
			return new ims.dto.Result(result, "No error detected. The count result is held in the ID field", "DTO.Client.Patient.Count");
				
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patient.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patient.Get");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patient.GetForUpdate");
							
		if(lastGetFilter == null)	
			return new ims.dto.Result("Last get method failed or not called", "DTO.Client.Patient.GetForUpdate");
			
		ims.dto.Result result = Connection.getForUpdate(serviceName, encodeNASFilter(lastGetFilter));
		if(result != null)
			return result;
			
		if(Connection.countResponseItems(Connection.getValueAt(6)) == 0)
			return null;
			
		DataCollection.clear();	
		decodeNASMessageWithRepeatingGroups();
				
		return new ims.dto.Result("The data was changed by another user", "DTO.Client.Patient.GetForUpdate");
	}		
	/**
	* Inserts a new record. This method always returns a non null result. The ID field holds the Unique ID for the inserted record (when greater than zero) or the error number (when less than zero). If the ID is zero, the record was inserted but the server did not returned the Unique ID.
	*/
	public ims.dto.Result insert()
	{
		this.lastResultData = null;
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patient.Insert");
					
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to insert", "DTO.Client.Patient.Insert");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object insert not allowed", "DTO.Client.Patient.Insert");
			
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
			return new ims.dto.Result("Invalid record ID returned", "DTO.Client.Patient.Insert");
		}
		
		decodeResultData();
		
		return new ims.dto.Result(recordID, "No error. The ID of the new record is in the ID field", "DTO.Client.Patient.Insert");
	}
	/**
	 * Executes a specific action. This method always returns a non null result.
	 */
	public ims.dto.Result executeAction(String action)
	{
		this.lastResultData = null;
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Patient.ExecuteAction");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patient.ExecuteAction");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("Data container is empty", "DTO.Client.Patient.ExecuteAction");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects are not allowed", "DTO.Client.Patient.ExecuteAction");
			
		ims.dto.Result result = Connection.executeAction(serviceName, encodeNASMessage(), action);
		if(result != null)
			return result;
			
		decodeResultData();
			
		try
		{
			return new ims.dto.Result(new Integer(Connection.getValueAt(2)).intValue(), "No error", "DTO.Client.Patient.ExecuteAction");	
		}
		catch(NumberFormatException ex)
		{
			return new ims.dto.Result("Invalid server response", "DTO.Client.Patient.ExecuteAction");
		}
	}
	/**
	 * Transfers a record. If the result returned is not null an error occured.
	 */
	public ims.dto.Result transferData(String action)
	{
		if(action.length() == 0)
			return new ims.dto.Result("Invalid action name", "DTO.Client.Patient.TransferData");
			
		ims.dto.Result reLoginResult = Connection.reLogin();
		if(reLoginResult != null)
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patient.TransferData");
		
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to transfer", "DTO.Client.Patient.TransferData");
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple objects not allowed", "DTO.Client.Patient.TransferData");
			
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patient.Update");
				
		if(DataCollection.count() == 0)
			return new ims.dto.Result("No data to update", "DTO.Client.Patient.Update");	
			
		if(DataCollection.count() > 1)
			return new ims.dto.Result("Multiple object update not allowed", "DTO.Client.Patient.Update");
					
		ims.dto.Result result = Connection.update(serviceName, encodeNASMessage());
		if(result != null)
			return result;
			
		decodeResultData();
			
		return null;
	}
			
	private ims.dto.Result stopList()
	{
		if(!listInProgress)
			return new ims.dto.Result("No active list running", "DTO.Client.Patient.StopList");
				
		listInProgress = false;				
		return null;
	}
	
	private ims.dto.Result nextList()
	{				
		logger.debug("Patient nextList Entry");
		ims.dto.Result result = Connection.nextList(serviceName);
		if(result != null)
			return result;
		logger.debug("Patient After NextList ");
				
		decodeNASMessage();		
		logger.debug("Patient After decode NasMsg NextList");
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
			return new ims.dto.Result(reLoginResult.getMessage(), "DTO.Client.Patient.List");
							
		listInProgress = true;	
		logger.debug("Patient Before List");
		
		ims.dto.Result result = Connection.list(serviceName, encodeNASFilter());
		if(result != null)
		{
			listInProgress = false;
			if(result.getId() == -2) // NAS list empty
				return null;
			return result;
		}
					
		logger.debug("Patient After List");
		
		if(decodeNASMessage() == 0)
		{
			listInProgress = false;
			return null;
		}
		logger.debug("Patient After Parse Message");
		
						
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
	private String encodeNASFilter(PatientFilter filter)
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
		
		if(Filter.Nmtype != null && filter.Nmtype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NMTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nmtype);
		}
		
		if(Filter.Uppsnm != null && filter.Uppsnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UPPSNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uppsnm);
		}
		
		if(Filter.Uppfnm != null && filter.Uppfnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UPPFNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uppfnm);
		}
		
		if(Filter.Titl != null && filter.Titl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Titl);
		}
		
		if(Filter.Titltxt != null && filter.Titltxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TITLTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Titltxt);
		}
		
		if(Filter.Soundex != null && filter.Soundex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SOUNDEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Soundex);
		}
		
		if(Filter.Soundex_fnm != null && filter.Soundex_fnm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SOUNDEX_FNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Soundex_fnm);
		}
		
		if(Filter.Dob != null && filter.Dob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dob);
		}
		
		if(Filter.Dod != null && filter.Dod.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dod);
		}
		
		if(Filter.Sex != null && filter.Sex.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sex);
		}
		
		if(Filter.Nhsn != null && filter.Nhsn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NHSN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsn);
		}
		
		if(Filter.Tsta != null && filter.Tsta.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tsta);
		}
		
		if(Filter.Csta != null && filter.Csta.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CSTA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Csta);
		}
		
		if(Filter.Hospnum != null && filter.Hospnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hospnum);
		}
		
		if(Filter.Pmrn != null && filter.Pmrn.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PMRN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pmrn);
		}
		
		if(Filter.Lpdpkey != null && filter.Lpdpkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LPDPKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lpdpkey);
		}
		
		if(Filter.Hpcd != null && filter.Hpcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hpcd);
		}
		
		if(Filter.Ploc != null && filter.Ploc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PLOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ploc);
		}
		
		if(Filter.Patstat != null && filter.Patstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PATSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Patstat);
		}
		
		if(Filter.Cfl != null && filter.Cfl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CFL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cfl);
		}
		
		if(Filter.Cflname != null && filter.Cflname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CFLNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cflname);
		}
		
		if(Filter.Cfdt != null && filter.Cfdt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CFDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cfdt);
		}
		
		if(Filter.Lpdstat != null && filter.Lpdstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("LPDSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Lpdstat);
		}
		
		if(Filter.Plocname != null && filter.Plocname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PLOCNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Plocname);
		}
		
		if(Filter.Aldt != null && filter.Aldt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ALDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Aldt);
		}
		
		if(Filter.Tydt != null && filter.Tydt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TYDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tydt);
		}
		
		if(Filter.Cnt != null && filter.Cnt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CNT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cnt);
		}
		
		if(Filter.Cntname != null && filter.Cntname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CNTNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cntname);
		}
		
		if(Filter.Adr1 != null && filter.Adr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr1);
		}
		
		if(Filter.Adr2 != null && filter.Adr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr2);
		}
		
		if(Filter.Adr3 != null && filter.Adr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr3);
		}
		
		if(Filter.Adr4 != null && filter.Adr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr4);
		}
		
		if(Filter.Adr5 != null && filter.Adr5.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adr5);
		}
		
		if(Filter.Post != null && filter.Post.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("POST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Post);
		}
		
		if(Filter.Harc != null && filter.Harc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HARC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Harc);
		}
		
		if(Filter.Ntel != null && filter.Ntel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ntel);
		}
		
		if(Filter.Dtel != null && filter.Dtel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dtel);
		}
		
		if(Filter.Pob != null && filter.Pob.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("POB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pob);
		}
		
		if(Filter.Stat != null && filter.Stat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Stat);
		}
		
		if(Filter.Mart != null && filter.Mart.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MART" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mart);
		}
		
		if(Filter.Ethc != null && filter.Ethc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ETHC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ethc);
		}
		
		if(Filter.Pmipkey != null && filter.Pmipkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PMIPKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pmipkey);
		}
		
		if(Filter.Relg != null && filter.Relg.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RELG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Relg);
		}
		
		if(Filter.Epsd != null && filter.Epsd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EPSD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Epsd);
		}
		
		if(Filter.Gpcd != null && filter.Gpcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpcd);
		}
		
		if(Filter.Gploc != null && filter.Gploc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPLOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gploc);
		}
		
		if(Filter.Prcd != null && filter.Prcd.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PRCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Prcd);
		}
		
		if(Filter.Gpfh != null && filter.Gpfh.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPFH" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpfh);
		}
		
		if(Filter.Pocc != null && filter.Pocc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("POCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pocc);
		}
		
		if(Filter.Pocctxt != null && filter.Pocctxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("POCCTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pocctxt);
		}
		
		if(Filter.Socc != null && filter.Socc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SOCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Socc);
		}
		
		if(Filter.School != null && filter.School.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SCHOOL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.School);
		}
		
		if(Filter.Rgdt != null && filter.Rgdt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RGDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rgdt);
		}
		
		if(Filter.Bgrp != null && filter.Bgrp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("BGRP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Bgrp);
		}
		
		if(Filter.Adat != null && filter.Adat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ADAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Adat);
		}
		
		if(Filter.Srce != null && filter.Srce.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SRCE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Srce);
		}
		
		if(Filter.Alert != null && filter.Alert.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ALERT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Alert);
		}
		
		if(Filter.Mfr1 != null && filter.Mfr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MFR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mfr1);
		}
		
		if(Filter.Mfr2 != null && filter.Mfr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MFR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mfr2);
		}
		
		if(Filter.Mfr3 != null && filter.Mfr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MFR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mfr3);
		}
		
		if(Filter.Mfr4 != null && filter.Mfr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MFR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mfr4);
		}
		
		if(Filter.Mfr5 != null && filter.Mfr5.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MFR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mfr5);
		}
		
		if(Filter.Mfr6 != null && filter.Mfr6.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MFR6" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mfr6);
		}
		
		if(Filter.Mrsa != null && filter.Mrsa.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MRSA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mrsa);
		}
		
		if(Filter.Gpcdname != null && filter.Gpcdname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPCDNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpcdname);
		}
		
		if(Filter.Gptitlftxt != null && filter.Gptitlftxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPTITLFTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gptitlftxt);
		}
		
		if(Filter.Gpadr1 != null && filter.Gpadr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpadr1);
		}
		
		if(Filter.Gpadr2 != null && filter.Gpadr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpadr2);
		}
		
		if(Filter.Gpadr3 != null && filter.Gpadr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpadr3);
		}
		
		if(Filter.Gpadr4 != null && filter.Gpadr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpadr4);
		}
		
		if(Filter.Gpadr5 != null && filter.Gpadr5.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPADR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gpadr5);
		}
		
		if(Filter.Gppost != null && filter.Gppost.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPPOST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gppost);
		}
		
		if(Filter.Gptel != null && filter.Gptel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GPTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Gptel);
		}
		
		if(Filter.Name != null && filter.Name.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Name);
		}
		
		if(Filter.Nkfnam != null && filter.Nkfnam.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NKFNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nkfnam);
		}
		
		if(Filter.Ntitl != null && filter.Ntitl.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NTITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ntitl);
		}
		
		if(Filter.Nadr1 != null && filter.Nadr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nadr1);
		}
		
		if(Filter.Nadr2 != null && filter.Nadr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nadr2);
		}
		
		if(Filter.Nadr3 != null && filter.Nadr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nadr3);
		}
		
		if(Filter.Nadr4 != null && filter.Nadr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nadr4);
		}
		
		if(Filter.Nadr5 != null && filter.Nadr5.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NADR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nadr5);
		}
		
		if(Filter.Npost != null && filter.Npost.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NPOST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Npost);
		}
		
		if(Filter.Nntel != null && filter.Nntel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NNTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nntel);
		}
		
		if(Filter.Ndtel != null && filter.Ndtel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NDTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ndtel);
		}
		
		if(Filter.Rel != null && filter.Rel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rel);
		}
		
		if(Filter.Reltxt != null && filter.Reltxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RELTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Reltxt);
		}
		
		if(Filter.Ntitltxt != null && filter.Ntitltxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NTITLTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ntitltxt);
		}
		
		if(Filter.Aliasname != null && filter.Aliasname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ALIASNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Aliasname);
		}
		
		if(Filter.Snmb != null && filter.Snmb.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SNMB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Snmb);
		}
		
		if(Filter.Tadr1 != null && filter.Tadr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tadr1);
		}
		
		if(Filter.Tadr2 != null && filter.Tadr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tadr2);
		}
		
		if(Filter.Tadr3 != null && filter.Tadr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tadr3);
		}
		
		if(Filter.Tadr4 != null && filter.Tadr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tadr4);
		}
		
		if(Filter.Tpost != null && filter.Tpost.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TPOST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tpost);
		}
		
		if(Filter.Tdtel != null && filter.Tdtel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TDTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tdtel);
		}
		
		if(Filter.Tntel != null && filter.Tntel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TNTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tntel);
		}
		
		if(Filter.Sextxt != null && filter.Sextxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("SEXTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Sextxt);
		}
		
		if(Filter.Otherhnos != null && filter.Otherhnos.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OTHERHNOS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Otherhnos);
		}
		
		if(Filter.Remote != null && filter.Remote.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("REMOTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Remote);
		}
		
		if(Filter.Healthcat != null && filter.Healthcat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HEALTHCAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Healthcat);
		}
		
		if(Filter.Medcard != null && filter.Medcard.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MEDCARD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Medcard);
		}
		
		if(Filter.Medcardno != null && filter.Medcardno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MEDCARDNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Medcardno);
		}
		
		if(Filter.Medname != null && filter.Medname.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MEDNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Medname);
		}
		
		if(Filter.Medprof != null && filter.Medprof.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MEDPROF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Medprof);
		}
		
		if(Filter.Medeldate != null && filter.Medeldate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MEDELDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Medeldate);
		}
		
		if(Filter.Medreviewclass != null && filter.Medreviewclass.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MEDREVIEWCLASS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Medreviewclass);
		}
		
		if(Filter.Medreviewdate != null && filter.Medreviewdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MEDREVIEWDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Medreviewdate);
		}
		
		if(Filter.Ecnational != null && filter.Ecnational.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ECNATIONAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ecnational);
		}
		
		if(Filter.Insurer != null && filter.Insurer.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INSURER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Insurer);
		}
		
		if(Filter.Policytype != null && filter.Policytype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("POLICYTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Policytype);
		}
		
		if(Filter.Policynum != null && filter.Policynum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("POLICYNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Policynum);
		}
		
		if(Filter.Chartnum != null && filter.Chartnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CHARTNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Chartnum);
		}
		
		if(Filter.Xraynum != null && filter.Xraynum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("XRAYNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Xraynum);
		}
		
		if(Filter.Mobile != null && filter.Mobile.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MOBILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Mobile);
		}
		
		if(Filter.Tmobile != null && filter.Tmobile.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TMOBILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tmobile);
		}
		
		if(Filter.Nkmobile != null && filter.Nkmobile.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NKMOBILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nkmobile);
		}
		
		if(Filter.Contact != null && filter.Contact.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Contact);
		}
		
		if(Filter.Ded != null && filter.Ded.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ded);
		}
		
		if(Filter.Occstat != null && filter.Occstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OCCSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Occstat);
		}
		
		if(Filter.Pas_pkey != null && filter.Pas_pkey.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("PAS_PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Pas_pkey);
		}
		
		if(Filter.Bedtyper != null && filter.Bedtyper.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("BEDTYPER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Bedtyper);
		}
		
		if(Filter.__key != null && filter.__key.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("__KEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.__key);
		}
		
		if(Filter.Chinum != null && filter.Chinum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CHINUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Chinum);
		}
		
		if(Filter.Chtnum != null && filter.Chtnum.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CHTNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Chtnum);
		}
		
		if(Filter.Ovstat != null && filter.Ovstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OVSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ovstat);
		}
		
		if(Filter.Ovsdate != null && filter.Ovsdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OVSDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ovsdate);
		}
		
		if(Filter.Flang != null && filter.Flang.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("FLANG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Flang);
		}
		
		if(Filter.Intreq != null && filter.Intreq.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INTREQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Intreq);
		}
		
		if(Filter.Dobver != null && filter.Dobver.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DOBVER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Dobver);
		}
		
		if(Filter.Extended != null && filter.Extended.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("EXTENDED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Extended);
		}
		
		if(Filter.Genhspno != null && filter.Genhspno.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GENHSPNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Genhspno);
		}
		
		if(Filter.Rusr != null && filter.Rusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rusr);
		}
		
		if(Filter.Rdat != null && filter.Rdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rdat);
		}
		
		if(Filter.Rtim != null && filter.Rtim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Rtim);
		}
		
		if(Filter.Uusr != null && filter.Uusr.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Uusr);
		}
		
		if(Filter.Udat != null && filter.Udat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Udat);
		}
		
		if(Filter.Utim != null && filter.Utim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("UTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Utim);
		}
		
		if(Filter.Cdat != null && filter.Cdat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cdat);
		}
		
		if(Filter.Ctim != null && filter.Ctim.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ctim);
		}
		
		if(Filter.Idstat != null && filter.Idstat.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("IDSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Idstat);
		}
		
		if(Filter.Oidtype != null && filter.Oidtype.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OIDTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Oidtype);
		}
		
		if(Filter.Oidval != null && filter.Oidval.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("OIDVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Oidval);
		}
		
		if(Filter.Relgtxt != null && filter.Relgtxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RELGTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Relgtxt);
		}
		
		if(Filter.Ethctxt != null && filter.Ethctxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("ETHCTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Ethctxt);
		}
		
		if(Filter.Marttxt != null && filter.Marttxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MARTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Marttxt);
		}
		
		if(Filter.Areacodetext != null && filter.Areacodetext.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AREACODETEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Areacodetext);
		}
		
		if(Filter.Hbdtext != null && filter.Hbdtext.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("HBDTEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Hbdtext);
		}
		
		if(Filter.Policytypetext != null && filter.Policytypetext.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("POLICYTYPETEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Policytypetext);
		}
		
		if(Filter.Insurertext != null && filter.Insurertext.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INSURERTEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Insurertext);
		}
		
		if(Filter.Bgrptxt != null && filter.Bgrptxt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("BGRPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Bgrptxt);
		}
		
		if(Filter.Comment != null && filter.Comment.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("COMMENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Comment);
		}
		
		if(Filter.Tstp != null && filter.Tstp.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Tstp);
		}
		
		if(Filter.Renewdate != null && filter.Renewdate.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RENEWDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Renewdate);
		}
		
		if(Filter.Race != null && filter.Race.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("RACE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Race);
		}
		
		if(Filter.Inactive != null && filter.Inactive.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Inactive);
		}
		
		if(Filter.State != null && filter.State.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("STATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.State);
		}
		
		if(Filter.City != null && filter.City.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.City);
		}
		
		if(Filter.Guarid != null && filter.Guarid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GUARID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Guarid);
		}
		
		if(Filter.Guarrel != null && filter.Guarrel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("GUARREL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Guarrel);
		}
		
		if(Filter.Insrel != null && filter.Insrel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INSREL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Insrel);
		}
		
		if(Filter.Insuredid != null && filter.Insuredid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("INSUREDID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Insuredid);
		}
		
		if(Filter.Conadr1 != null && filter.Conadr1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Conadr1);
		}
		
		if(Filter.Conadr2 != null && filter.Conadr2.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Conadr2);
		}
		
		if(Filter.Conadr3 != null && filter.Conadr3.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Conadr3);
		}
		
		if(Filter.Conadr4 != null && filter.Conadr4.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Conadr4);
		}
		
		if(Filter.Contel != null && filter.Contel.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Contel);
		}
		
		if(Filter.Motherid != null && filter.Motherid.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("MOTHERID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Motherid);
		}
		
		if(Filter.Contractpc != null && filter.Contractpc.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CONTRACTPC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Contractpc);
		}
		
		if(Filter.Area != null && filter.Area.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("AREA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Area);
		}
		
		if(Filter.Whenentered != null && filter.Whenentered.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("WHENENTERED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Whenentered);
		}
		
		if(Filter.Whenupdated != null && filter.Whenupdated.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("WHENUPDATED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Whenupdated);
		}
		
		if(Filter.Nhsnfmtver != null && filter.Nhsnfmtver.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NHSNFMTVER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsnfmtver);
		}
		
		if(Filter.Nhsnfmt != null && filter.Nhsnfmt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NHSNFMT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsnfmt);
		}
		
		if(Filter.Nhsnfmtvflag != null && filter.Nhsnfmtvflag.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NHSNFMTVFLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsnfmtvflag);
		}
		
		if(Filter.Nhsnver != null && filter.Nhsnver.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("NHSNVER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Nhsnver);
		}
		
		if(Filter.Capfnm1 != null && filter.Capfnm1.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CAPFNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Capfnm1);
		}
		
		if(Filter.Cflcomm != null && filter.Cflcomm.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("CFLCOMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Cflcomm);
		}
		
		if(Filter.Webadt != null && filter.Webadt.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("WEBADT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Webadt);
		}
		
		if(Filter.Delpatact != null && filter.Delpatact.length()> 0)
		{
			if(filterString.length() > 0)
				filterString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			filterString.append("DELPATACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + filter.Delpatact);
		}
		
		return filterString.toString();	
	}
	
	private String encodeNASMessage()
	{
		StringBuffer dataString = new StringBuffer();
		if(DataCollection.count() == 0)
			return dataString.toString();
			
		PatientRecord data = (PatientRecord)DataCollection.get(0);
		
		if(EditFilter.IncludePkey)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pkey));
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
		
		if(EditFilter.IncludeNmtype)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NMTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nmtype));
		}
		
		if(EditFilter.IncludeUppsnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UPPSNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uppsnm));
		}
		
		if(EditFilter.IncludeUppfnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UPPFNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uppfnm));
		}
		
		if(EditFilter.IncludeTitl)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Titl));
		}
		
		if(EditFilter.IncludeTitltxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TITLTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Titltxt));
		}
		
		if(EditFilter.IncludeSoundex)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SOUNDEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Soundex));
		}
		
		if(EditFilter.IncludeSoundex_fnm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SOUNDEX_FNM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Soundex_fnm));
		}
		
		if(EditFilter.IncludeDob)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dob));
		}
		
		if(EditFilter.IncludeDod)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dod));
		}
		
		if(EditFilter.IncludeSex)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEX" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sex));
		}
		
		if(EditFilter.IncludeNhsn)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NHSN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsn));
		}
		
		if(EditFilter.IncludeTsta)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tsta));
		}
		
		if(EditFilter.IncludeCsta)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CSTA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Csta));
		}
		
		if(EditFilter.IncludeHospnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HOSPNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hospnum));
		}
		
		if(EditFilter.IncludePmrn)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PMRN" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pmrn));
		}
		
		if(EditFilter.IncludeLpdpkey)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LPDPKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lpdpkey));
		}
		
		if(EditFilter.IncludeHpcd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hpcd));
		}
		
		if(EditFilter.IncludePloc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PLOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ploc));
		}
		
		if(EditFilter.IncludePatstat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PATSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Patstat));
		}
		
		if(EditFilter.IncludeCfl)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CFL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cfl));
		}
		
		if(EditFilter.IncludeCflname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CFLNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cflname));
		}
		
		if(EditFilter.IncludeCfdt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CFDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cfdt));
		}
		
		if(EditFilter.IncludeLpdstat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("LPDSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Lpdstat));
		}
		
		if(EditFilter.IncludePlocname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PLOCNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Plocname));
		}
		
		if(EditFilter.IncludeAldt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ALDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Aldt));
		}
		
		if(EditFilter.IncludeTydt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TYDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tydt));
		}
		
		if(EditFilter.IncludeCnt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CNT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cnt));
		}
		
		if(EditFilter.IncludeCntname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CNTNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cntname));
		}
		
		if(EditFilter.IncludeAdr1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr1));
		}
		
		if(EditFilter.IncludeAdr2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr2));
		}
		
		if(EditFilter.IncludeAdr3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr3));
		}
		
		if(EditFilter.IncludeAdr4)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr4));
		}
		
		if(EditFilter.IncludeAdr5)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adr5));
		}
		
		if(EditFilter.IncludePost)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("POST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Post));
		}
		
		if(EditFilter.IncludeHarc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HARC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Harc));
		}
		
		if(EditFilter.IncludeNtel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ntel));
		}
		
		if(EditFilter.IncludeDtel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dtel));
		}
		
		if(EditFilter.IncludePob)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("POB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pob));
		}
		
		if(EditFilter.IncludeStat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Stat));
		}
		
		if(EditFilter.IncludeMart)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MART" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mart));
		}
		
		if(EditFilter.IncludeEthc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ETHC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ethc));
		}
		
		if(EditFilter.IncludePmipkey)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PMIPKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pmipkey));
		}
		
		if(EditFilter.IncludeRelg)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RELG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Relg));
		}
		
		if(EditFilter.IncludeEpsd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EPSD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Epsd));
		}
		
		if(EditFilter.IncludeGpcd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpcd));
		}
		
		if(EditFilter.IncludeGploc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPLOC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gploc));
		}
		
		if(EditFilter.IncludePrcd)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PRCD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Prcd));
		}
		
		if(EditFilter.IncludeGpfh)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPFH" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpfh));
		}
		
		if(EditFilter.IncludePocc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("POCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pocc));
		}
		
		if(EditFilter.IncludePocctxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("POCCTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pocctxt));
		}
		
		if(EditFilter.IncludeSocc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SOCC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Socc));
		}
		
		if(EditFilter.IncludeSchool)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SCHOOL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.School));
		}
		
		if(EditFilter.IncludeRgdt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RGDT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rgdt));
		}
		
		if(EditFilter.IncludeBgrp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("BGRP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Bgrp));
		}
		
		if(EditFilter.IncludeAdat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ADAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Adat));
		}
		
		if(EditFilter.IncludeSrce)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SRCE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Srce));
		}
		
		if(EditFilter.IncludeAlert)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ALERT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Alert));
		}
		
		if(EditFilter.IncludeMfr1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MFR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mfr1));
		}
		
		if(EditFilter.IncludeMfr2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MFR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mfr2));
		}
		
		if(EditFilter.IncludeMfr3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MFR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mfr3));
		}
		
		if(EditFilter.IncludeMfr4)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MFR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mfr4));
		}
		
		if(EditFilter.IncludeMfr5)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MFR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mfr5));
		}
		
		if(EditFilter.IncludeMfr6)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MFR6" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mfr6));
		}
		
		if(EditFilter.IncludeMrsa)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MRSA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mrsa));
		}
		
		if(EditFilter.IncludeGpcdname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPCDNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpcdname));
		}
		
		if(EditFilter.IncludeGptitlftxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPTITLFTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gptitlftxt));
		}
		
		if(EditFilter.IncludeGpadr1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpadr1));
		}
		
		if(EditFilter.IncludeGpadr2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpadr2));
		}
		
		if(EditFilter.IncludeGpadr3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpadr3));
		}
		
		if(EditFilter.IncludeGpadr4)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpadr4));
		}
		
		if(EditFilter.IncludeGpadr5)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPADR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gpadr5));
		}
		
		if(EditFilter.IncludeGppost)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPPOST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gppost));
		}
		
		if(EditFilter.IncludeGptel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GPTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Gptel));
		}
		
		if(EditFilter.IncludeName)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Name));
		}
		
		if(EditFilter.IncludeNkfnam)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NKFNAM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nkfnam));
		}
		
		if(EditFilter.IncludeNtitl)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NTITL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ntitl));
		}
		
		if(EditFilter.IncludeNadr1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nadr1));
		}
		
		if(EditFilter.IncludeNadr2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nadr2));
		}
		
		if(EditFilter.IncludeNadr3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nadr3));
		}
		
		if(EditFilter.IncludeNadr4)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nadr4));
		}
		
		if(EditFilter.IncludeNadr5)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NADR5" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nadr5));
		}
		
		if(EditFilter.IncludeNpost)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NPOST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Npost));
		}
		
		if(EditFilter.IncludeNntel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NNTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nntel));
		}
		
		if(EditFilter.IncludeNdtel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NDTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ndtel));
		}
		
		if(EditFilter.IncludeRel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rel));
		}
		
		if(EditFilter.IncludeReltxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RELTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Reltxt));
		}
		
		if(EditFilter.IncludeNtitltxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NTITLTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ntitltxt));
		}
		
		if(EditFilter.IncludeAliasname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ALIASNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Aliasname));
		}
		
		if(EditFilter.IncludeSnmb)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SNMB" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Snmb));
		}
		
		if(EditFilter.IncludeTadr1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tadr1));
		}
		
		if(EditFilter.IncludeTadr2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tadr2));
		}
		
		if(EditFilter.IncludeTadr3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tadr3));
		}
		
		if(EditFilter.IncludeTadr4)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tadr4));
		}
		
		if(EditFilter.IncludeTpost)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TPOST" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tpost));
		}
		
		if(EditFilter.IncludeTdtel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TDTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tdtel));
		}
		
		if(EditFilter.IncludeTntel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TNTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tntel));
		}
		
		if(EditFilter.IncludeSextxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("SEXTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Sextxt));
		}
		
		if(EditFilter.IncludeOtherhnos)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OTHERHNOS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Otherhnos));
		}
		
		if(EditFilter.IncludeRemote)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("REMOTE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Remote));
		}
		
		if(EditFilter.IncludeHealthcat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HEALTHCAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Healthcat));
		}
		
		if(EditFilter.IncludeMedcard)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MEDCARD" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Medcard));
		}
		
		if(EditFilter.IncludeMedcardno)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MEDCARDNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Medcardno));
		}
		
		if(EditFilter.IncludeMedname)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MEDNAME" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Medname));
		}
		
		if(EditFilter.IncludeMedprof)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MEDPROF" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Medprof));
		}
		
		if(EditFilter.IncludeMedeldate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MEDELDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Medeldate));
		}
		
		if(EditFilter.IncludeMedreviewclass)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MEDREVIEWCLASS" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Medreviewclass));
		}
		
		if(EditFilter.IncludeMedreviewdate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MEDREVIEWDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Medreviewdate));
		}
		
		if(EditFilter.IncludeEcnational)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ECNATIONAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ecnational));
		}
		
		if(EditFilter.IncludeInsurer)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INSURER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Insurer));
		}
		
		if(EditFilter.IncludePolicytype)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("POLICYTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Policytype));
		}
		
		if(EditFilter.IncludePolicynum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("POLICYNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Policynum));
		}
		
		if(EditFilter.IncludeChartnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CHARTNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Chartnum));
		}
		
		if(EditFilter.IncludeXraynum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("XRAYNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Xraynum));
		}
		
		if(EditFilter.IncludeMobile)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MOBILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Mobile));
		}
		
		if(EditFilter.IncludeTmobile)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TMOBILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tmobile));
		}
		
		if(EditFilter.IncludeNkmobile)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NKMOBILE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nkmobile));
		}
		
		if(EditFilter.IncludeContact)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONTACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Contact));
		}
		
		if(EditFilter.IncludeDed)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ded));
		}
		
		if(EditFilter.IncludeOccstat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OCCSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Occstat));
		}
		
		if(EditFilter.IncludePas_pkey)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("PAS_PKEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Pas_pkey));
		}
		
		if(EditFilter.IncludeBedtyper)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("BEDTYPER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Bedtyper));
		}
		
		if(EditFilter.Include__key)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("__KEY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.__key));
		}
		
		if(EditFilter.IncludeChinum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CHINUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Chinum));
		}
		
		if(EditFilter.IncludeChtnum)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CHTNUM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Chtnum));
		}
		
		if(EditFilter.IncludeOvstat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OVSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ovstat));
		}
		
		if(EditFilter.IncludeOvsdate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OVSDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ovsdate));
		}
		
		if(EditFilter.IncludeFlang)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("FLANG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Flang));
		}
		
		if(EditFilter.IncludeIntreq)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INTREQ" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Intreq));
		}
		
		if(EditFilter.IncludeDobver)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DOBVER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Dobver));
		}
		
		if(EditFilter.IncludeExtended)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("EXTENDED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Extended));
		}
		
		if(EditFilter.IncludeGenhspno)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GENHSPNO" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Genhspno));
		}
		
		if(EditFilter.IncludeRusr)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rusr));
		}
		
		if(EditFilter.IncludeRdat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rdat));
		}
		
		if(EditFilter.IncludeRtim)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Rtim));
		}
		
		if(EditFilter.IncludeUusr)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UUSR" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Uusr));
		}
		
		if(EditFilter.IncludeUdat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Udat));
		}
		
		if(EditFilter.IncludeUtim)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("UTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Utim));
		}
		
		if(EditFilter.IncludeCdat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CDAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cdat));
		}
		
		if(EditFilter.IncludeCtim)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CTIM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ctim));
		}
		
		if(EditFilter.IncludeIdstat)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("IDSTAT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Idstat));
		}
		
		if(EditFilter.IncludeOidtype)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OIDTYPE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Oidtype));
		}
		
		if(EditFilter.IncludeOidval)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("OIDVAL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Oidval));
		}
		
		if(EditFilter.IncludeRelgtxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RELGTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Relgtxt));
		}
		
		if(EditFilter.IncludeEthctxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("ETHCTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Ethctxt));
		}
		
		if(EditFilter.IncludeMarttxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MARTTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Marttxt));
		}
		
		if(EditFilter.IncludeAreacodetext)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AREACODETEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Areacodetext));
		}
		
		if(EditFilter.IncludeHbdtext)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("HBDTEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Hbdtext));
		}
		
		if(EditFilter.IncludePolicytypetext)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("POLICYTYPETEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Policytypetext));
		}
		
		if(EditFilter.IncludeInsurertext)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INSURERTEXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Insurertext));
		}
		
		if(EditFilter.IncludeBgrptxt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("BGRPTXT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Bgrptxt));
		}
		
		if(EditFilter.IncludeComment)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("COMMENT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Comment));
		}
		
		if(EditFilter.IncludeTstp)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("TSTP" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Tstp));
		}
		
		if(EditFilter.IncludeRenewdate)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RENEWDATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Renewdate));
		}
		
		if(EditFilter.IncludeRace)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("RACE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Race));
		}
		
		if(EditFilter.IncludeInactive)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INACTIVE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Inactive));
		}
		
		if(EditFilter.IncludeState)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("STATE" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.State));
		}
		
		if(EditFilter.IncludeCity)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CITY" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.City));
		}
		
		if(EditFilter.IncludeGuarid)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GUARID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Guarid));
		}
		
		if(EditFilter.IncludeGuarrel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("GUARREL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Guarrel));
		}
		
		if(EditFilter.IncludeInsrel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INSREL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Insrel));
		}
		
		if(EditFilter.IncludeInsuredid)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("INSUREDID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Insuredid));
		}
		
		if(EditFilter.IncludeConadr1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONADR1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Conadr1));
		}
		
		if(EditFilter.IncludeConadr2)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONADR2" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Conadr2));
		}
		
		if(EditFilter.IncludeConadr3)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONADR3" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Conadr3));
		}
		
		if(EditFilter.IncludeConadr4)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONADR4" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Conadr4));
		}
		
		if(EditFilter.IncludeContel)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONTEL" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Contel));
		}
		
		if(EditFilter.IncludeMotherid)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("MOTHERID" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Motherid));
		}
		
		if(EditFilter.IncludeContractpc)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CONTRACTPC" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Contractpc));
		}
		
		if(EditFilter.IncludeArea)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("AREA" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Area));
		}
		
		if(EditFilter.IncludeWhenentered)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("WHENENTERED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Whenentered));
		}
		
		if(EditFilter.IncludeWhenupdated)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("WHENUPDATED" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Whenupdated));
		}
		
		if(EditFilter.IncludeNhsnfmtver)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NHSNFMTVER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsnfmtver));
		}
		
		if(EditFilter.IncludeNhsnfmt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NHSNFMT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsnfmt));
		}
		
		if(EditFilter.IncludeNhsnfmtvflag)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NHSNFMTVFLAG" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsnfmtvflag));
		}
		
		if(EditFilter.IncludeNhsnver)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("NHSNVER" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Nhsnver));
		}
		
		if(EditFilter.IncludeCapfnm1)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CAPFNM1" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Capfnm1));
		}
		
		if(EditFilter.IncludeCflcomm)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("CFLCOMM" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Cflcomm));
		}
		
		if(EditFilter.IncludeWebadt)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("WEBADT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Webadt));
		}
		
		if(EditFilter.IncludeDelpatact)
		{
			if(dataString.length() > 0)
				dataString.append(ims.dto.NASMessageCodes.PAIRSEPARATOR);
			dataString.append("DELPATACT" + ims.dto.NASMessageCodes.ATTRIBUTEVALUESEPARATOR + Connection.encodeFieldValue(data.Delpatact));
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
			PatientRecord record = new PatientRecord();
			HashMap valueItems = Connection.splitResponseItemToMap(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Fnm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM2"));
			record.Nmtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NMTYPE"));
			record.Uppsnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UPPSNM"));
			record.Uppfnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UPPFNM"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Titltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLTXT"));
			record.Soundex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOUNDEX"));
			record.Soundex_fnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOUNDEX_FNM"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Dod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOD"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Nhsn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSN"));
			record.Tsta = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTA"));
			record.Csta = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CSTA"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Pmrn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PMRN"));
			record.Lpdpkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LPDPKEY"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
			record.Ploc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLOC"));
			record.Patstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATSTAT"));
			record.Cfl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFL"));
			record.Cflname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFLNAME"));
			record.Cfdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFDT"));
			record.Lpdstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LPDSTAT"));
			record.Plocname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLOCNAME"));
			record.Aldt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALDT"));
			record.Tydt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TYDT"));
			record.Cnt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CNT"));
			record.Cntname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CNTNAME"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Adr5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR5"));
			record.Post = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POST"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
			record.Ntel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NTEL"));
			record.Dtel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTEL"));
			record.Pob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POB"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Mart = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MART"));
			record.Ethc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETHC"));
			record.Pmipkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PMIPKEY"));
			record.Relg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELG"));
			record.Epsd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPSD"));
			record.Gpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCD"));
			record.Gploc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPLOC"));
			record.Prcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRCD"));
			record.Gpfh = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPFH"));
			record.Pocc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POCC"));
			record.Pocctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POCCTXT"));
			record.Socc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOCC"));
			record.School = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCHOOL"));
			record.Rgdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RGDT"));
			record.Bgrp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BGRP"));
			record.Adat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADAT"));
			record.Srce = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRCE"));
			record.Alert = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALERT"));
			record.Mfr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MFR1"));
			record.Mfr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MFR2"));
			record.Mfr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MFR3"));
			record.Mfr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MFR4"));
			record.Mfr5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MFR5"));
			record.Mfr6 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MFR6"));
			record.Mrsa = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MRSA"));
			record.Gpcdname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCDNAME"));
			record.Gptitlftxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPTITLFTXT"));
			record.Gpadr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPADR1"));
			record.Gpadr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPADR2"));
			record.Gpadr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPADR3"));
			record.Gpadr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPADR4"));
			record.Gpadr5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPADR5"));
			record.Gppost = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPPOST"));
			record.Gptel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPTEL"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Nkfnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NKFNAM"));
			record.Ntitl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NTITL"));
			record.Nadr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR1"));
			record.Nadr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR2"));
			record.Nadr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR3"));
			record.Nadr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR4"));
			record.Nadr5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR5"));
			record.Npost = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NPOST"));
			record.Nntel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NNTEL"));
			record.Ndtel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NDTEL"));
			record.Rel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REL"));
			record.Reltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELTXT"));
			record.Ntitltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NTITLTXT"));
			record.Aliasname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALIASNAME"));
			record.Snmb = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNMB"));
			record.Tadr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR1"));
			record.Tadr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR2"));
			record.Tadr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR3"));
			record.Tadr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR4"));
			record.Tpost = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TPOST"));
			record.Tdtel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TDTEL"));
			record.Tntel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TNTEL"));
			record.Sextxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEXTXT"));
			record.Otherhnos = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OTHERHNOS"));
			record.Remote = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REMOTE"));
			record.Healthcat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HEALTHCAT"));
			record.Medcard = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDCARD"));
			record.Medcardno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDCARDNO"));
			record.Medname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDNAME"));
			record.Medprof = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDPROF"));
			record.Medeldate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDELDATE"));
			record.Medreviewclass = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDREVIEWCLASS"));
			record.Medreviewdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDREVIEWDATE"));
			record.Ecnational = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ECNATIONAL"));
			record.Insurer = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INSURER"));
			record.Policytype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POLICYTYPE"));
			record.Policynum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POLICYNUM"));
			record.Chartnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHARTNUM"));
			record.Xraynum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "XRAYNUM"));
			record.Mobile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOBILE"));
			record.Tmobile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TMOBILE"));
			record.Nkmobile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NKMOBILE"));
			record.Contact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTACT"));
			record.Ded = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DED"));
			record.Occstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OCCSTAT"));
			record.Pas_pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAS_PKEY"));
			record.Bedtyper = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BEDTYPER"));
			record.__key = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "__KEY"));
			record.Chinum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHINUM"));
			record.Chtnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHTNUM"));
			record.Ovstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OVSTAT"));
			record.Ovsdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OVSDATE"));
			record.Flang = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FLANG"));
			record.Intreq = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INTREQ"));
			record.Dobver = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOBVER"));
			record.Extended = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXTENDED"));
			record.Genhspno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GENHSPNO"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Idstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "IDSTAT"));
			record.Oidtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OIDTYPE"));
			record.Oidval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OIDVAL"));
			record.Relgtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELGTXT"));
			record.Ethctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETHCTXT"));
			record.Marttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MARTTXT"));
			record.Areacodetext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AREACODETEXT"));
			record.Hbdtext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HBDTEXT"));
			record.Policytypetext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POLICYTYPETEXT"));
			record.Insurertext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INSURERTEXT"));
			record.Bgrptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BGRPTXT"));
			record.Comment = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMMENT"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Renewdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RENEWDATE"));
			record.Race = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RACE"));
			record.Inactive = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INACTIVE"));
			record.State = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STATE"));
			record.City = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CITY"));
			record.Guarid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GUARID"));
			record.Guarrel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GUARREL"));
			record.Insrel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INSREL"));
			record.Insuredid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INSUREDID"));
			record.Conadr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONADR1"));
			record.Conadr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONADR2"));
			record.Conadr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONADR3"));
			record.Conadr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONADR4"));
			record.Contel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTEL"));
			record.Motherid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOTHERID"));
			record.Contractpc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTRACTPC"));
			record.Area = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AREA"));
			record.Whenentered = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WHENENTERED"));
			record.Whenupdated = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WHENUPDATED"));
			record.Nhsnfmtver = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNFMTVER"));
			record.Nhsnfmt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNFMT"));
			record.Nhsnfmtvflag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNFMTVFLAG"));
			record.Nhsnver = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNVER"));
			record.Capfnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CAPFNM1"));
			record.Cflcomm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFLCOMM"));
			record.Webadt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WEBADT"));
			record.Delpatact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DELPATACT"));
									
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
			PatientRecord record = new PatientRecord();
			String[] valueItems = Connection.splitResponseItem(items[x]);
			
			record.Pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PKEY"));
			record.Snm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNM"));
			record.Fnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM1"));
			record.Fnm2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FNM2"));
			record.Nmtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NMTYPE"));
			record.Uppsnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UPPSNM"));
			record.Uppfnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UPPFNM"));
			record.Titl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITL"));
			record.Titltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TITLTXT"));
			record.Soundex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOUNDEX"));
			record.Soundex_fnm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOUNDEX_FNM"));
			record.Dob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOB"));
			record.Dod = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOD"));
			record.Sex = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEX"));
			record.Nhsn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSN"));
			record.Tsta = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTA"));
			record.Csta = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CSTA"));
			record.Hospnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HOSPNUM"));
			record.Pmrn = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PMRN"));
			record.Lpdpkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LPDPKEY"));
			record.Hpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HPCD"));
			record.Ploc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLOC"));
			record.Patstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PATSTAT"));
			record.Cfl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFL"));
			record.Cflname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFLNAME"));
			record.Cfdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFDT"));
			record.Lpdstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "LPDSTAT"));
			record.Plocname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PLOCNAME"));
			record.Aldt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALDT"));
			record.Tydt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TYDT"));
			record.Cnt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CNT"));
			record.Cntname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CNTNAME"));
			record.Adr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR1"));
			record.Adr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR2"));
			record.Adr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR3"));
			record.Adr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR4"));
			record.Adr5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADR5"));
			record.Post = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POST"));
			record.Harc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HARC"));
			record.Ntel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NTEL"));
			record.Dtel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DTEL"));
			record.Pob = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POB"));
			record.Stat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STAT"));
			record.Mart = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MART"));
			record.Ethc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETHC"));
			record.Pmipkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PMIPKEY"));
			record.Relg = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELG"));
			record.Epsd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EPSD"));
			record.Gpcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCD"));
			record.Gploc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPLOC"));
			record.Prcd = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PRCD"));
			record.Gpfh = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPFH"));
			record.Pocc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POCC"));
			record.Pocctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POCCTXT"));
			record.Socc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SOCC"));
			record.School = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SCHOOL"));
			record.Rgdt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RGDT"));
			record.Bgrp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BGRP"));
			record.Adat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ADAT"));
			record.Srce = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SRCE"));
			record.Alert = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALERT"));
			record.Mfr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MFR1"));
			record.Mfr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MFR2"));
			record.Mfr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MFR3"));
			record.Mfr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MFR4"));
			record.Mfr5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MFR5"));
			record.Mfr6 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MFR6"));
			record.Mrsa = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MRSA"));
			record.Gpcdname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPCDNAME"));
			record.Gptitlftxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPTITLFTXT"));
			record.Gpadr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPADR1"));
			record.Gpadr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPADR2"));
			record.Gpadr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPADR3"));
			record.Gpadr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPADR4"));
			record.Gpadr5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPADR5"));
			record.Gppost = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPPOST"));
			record.Gptel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GPTEL"));
			record.Name = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NAME"));
			record.Nkfnam = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NKFNAM"));
			record.Ntitl = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NTITL"));
			record.Nadr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR1"));
			record.Nadr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR2"));
			record.Nadr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR3"));
			record.Nadr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR4"));
			record.Nadr5 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NADR5"));
			record.Npost = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NPOST"));
			record.Nntel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NNTEL"));
			record.Ndtel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NDTEL"));
			record.Rel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REL"));
			record.Reltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELTXT"));
			record.Ntitltxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NTITLTXT"));
			record.Aliasname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ALIASNAME"));
			record.Snmb = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SNMB"));
			record.Tadr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR1"));
			record.Tadr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR2"));
			record.Tadr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR3"));
			record.Tadr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TADR4"));
			record.Tpost = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TPOST"));
			record.Tdtel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TDTEL"));
			record.Tntel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TNTEL"));
			record.Sextxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "SEXTXT"));
			record.Otherhnos = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OTHERHNOS"));
			record.Remote = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "REMOTE"));
			record.Healthcat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HEALTHCAT"));
			record.Medcard = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDCARD"));
			record.Medcardno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDCARDNO"));
			record.Medname = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDNAME"));
			record.Medprof = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDPROF"));
			record.Medeldate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDELDATE"));
			record.Medreviewclass = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDREVIEWCLASS"));
			record.Medreviewdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MEDREVIEWDATE"));
			record.Ecnational = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ECNATIONAL"));
			record.Insurer = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INSURER"));
			record.Policytype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POLICYTYPE"));
			record.Policynum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POLICYNUM"));
			record.Chartnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHARTNUM"));
			record.Xraynum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "XRAYNUM"));
			record.Mobile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOBILE"));
			record.Tmobile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TMOBILE"));
			record.Nkmobile = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NKMOBILE"));
			record.Contact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTACT"));
			record.Ded = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DED"));
			record.Occstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OCCSTAT"));
			record.Pas_pkey = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "PAS_PKEY"));
			record.Bedtyper = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BEDTYPER"));
			record.__key = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "__KEY"));
			record.Chinum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHINUM"));
			record.Chtnum = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CHTNUM"));
			record.Ovstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OVSTAT"));
			record.Ovsdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OVSDATE"));
			record.Flang = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "FLANG"));
			record.Intreq = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INTREQ"));
			record.Dobver = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DOBVER"));
			record.Extended = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "EXTENDED"));
			record.Genhspno = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GENHSPNO"));
			record.Rusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RUSR"));
			record.Rdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RDAT"));
			record.Rtim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RTIM"));
			record.Uusr = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UUSR"));
			record.Udat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UDAT"));
			record.Utim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "UTIM"));
			record.Cdat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CDAT"));
			record.Ctim = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CTIM"));
			record.Idstat = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "IDSTAT"));
			record.Oidtype = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OIDTYPE"));
			record.Oidval = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "OIDVAL"));
			record.Relgtxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RELGTXT"));
			record.Ethctxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "ETHCTXT"));
			record.Marttxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MARTTXT"));
			record.Areacodetext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AREACODETEXT"));
			record.Hbdtext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "HBDTEXT"));
			record.Policytypetext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "POLICYTYPETEXT"));
			record.Insurertext = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INSURERTEXT"));
			record.Bgrptxt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "BGRPTXT"));
			record.Comment = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "COMMENT"));
			record.Tstp = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "TSTP"));
			record.Renewdate = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RENEWDATE"));
			record.Race = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "RACE"));
			record.Inactive = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INACTIVE"));
			record.State = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "STATE"));
			record.City = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CITY"));
			record.Guarid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GUARID"));
			record.Guarrel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "GUARREL"));
			record.Insrel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INSREL"));
			record.Insuredid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "INSUREDID"));
			record.Conadr1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONADR1"));
			record.Conadr2 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONADR2"));
			record.Conadr3 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONADR3"));
			record.Conadr4 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONADR4"));
			record.Contel = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTEL"));
			record.Motherid = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "MOTHERID"));
			record.Contractpc = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CONTRACTPC"));
			record.Area = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "AREA"));
			record.Whenentered = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WHENENTERED"));
			record.Whenupdated = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WHENUPDATED"));
			record.Nhsnfmtver = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNFMTVER"));
			record.Nhsnfmt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNFMT"));
			record.Nhsnfmtvflag = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNFMTVFLAG"));
			record.Nhsnver = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "NHSNVER"));
			record.Capfnm1 = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CAPFNM1"));
			record.Cflcomm = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "CFLCOMM"));
			record.Webadt = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "WEBADT"));
			record.Delpatact = Connection.decodeFieldValue(Connection.getValueFor(valueItems, "DELPATACT"));
									
			
			
			
			DataCollection.add(record);
		}	
		
		return records;
	}
	
	public final class PatientCollection
	{
		private java.util.ArrayList recordCollection = new java.util.ArrayList();
		
		public int add()
		{
			PatientRecord newRecord = new PatientRecord();
			recordCollection.add(newRecord);
			return count() - 1;
		}
		public int add(PatientRecord record)
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
		public PatientRecord get(int index)
		{
			return (PatientRecord)recordCollection.get(index);
		}
		public void remove(int index)
		{
			recordCollection.remove(index);
		}
	}
	
	public final class PatientRecord
	{
		public String Pkey = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Fnm2 = "";
		public String Nmtype = "";
		public String Uppsnm = "";
		public String Uppfnm = "";
		public String Titl = "";
		public String Titltxt = "";
		public String Soundex = "";
		public String Soundex_fnm = "";
		public String Dob = "";
		public String Dod = "";
		public String Sex = "";
		public String Nhsn = "";
		public String Tsta = "";
		public String Csta = "";
		public String Hospnum = "";
		public String Pmrn = "";
		public String Lpdpkey = "";
		public String Hpcd = "";
		public String Ploc = "";
		public String Patstat = "";
		public String Cfl = "";
		public String Cflname = "";
		public String Cfdt = "";
		public String Lpdstat = "";
		public String Plocname = "";
		public String Aldt = "";
		public String Tydt = "";
		public String Cnt = "";
		public String Cntname = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Adr5 = "";
		public String Post = "";
		public String Harc = "";
		public String Ntel = "";
		public String Dtel = "";
		public String Pob = "";
		public String Stat = "";
		public String Mart = "";
		public String Ethc = "";
		public String Pmipkey = "";
		public String Relg = "";
		public String Epsd = "";
		public String Gpcd = "";
		public String Gploc = "";
		public String Prcd = "";
		public String Gpfh = "";
		public String Pocc = "";
		public String Pocctxt = "";
		public String Socc = "";
		public String School = "";
		public String Rgdt = "";
		public String Bgrp = "";
		public String Adat = "";
		public String Srce = "";
		public String Alert = "";
		public String Mfr1 = "";
		public String Mfr2 = "";
		public String Mfr3 = "";
		public String Mfr4 = "";
		public String Mfr5 = "";
		public String Mfr6 = "";
		public String Mrsa = "";
		public String Gpcdname = "";
		public String Gptitlftxt = "";
		public String Gpadr1 = "";
		public String Gpadr2 = "";
		public String Gpadr3 = "";
		public String Gpadr4 = "";
		public String Gpadr5 = "";
		public String Gppost = "";
		public String Gptel = "";
		public String Name = "";
		public String Nkfnam = "";
		public String Ntitl = "";
		public String Nadr1 = "";
		public String Nadr2 = "";
		public String Nadr3 = "";
		public String Nadr4 = "";
		public String Nadr5 = "";
		public String Npost = "";
		public String Nntel = "";
		public String Ndtel = "";
		public String Rel = "";
		public String Reltxt = "";
		public String Ntitltxt = "";
		public String Aliasname = "";
		public String Snmb = "";
		public String Tadr1 = "";
		public String Tadr2 = "";
		public String Tadr3 = "";
		public String Tadr4 = "";
		public String Tpost = "";
		public String Tdtel = "";
		public String Tntel = "";
		public String Sextxt = "";
		public String Otherhnos = "";
		public String Remote = "";
		public String Healthcat = "";
		public String Medcard = "";
		public String Medcardno = "";
		public String Medname = "";
		public String Medprof = "";
		public String Medeldate = "";
		public String Medreviewclass = "";
		public String Medreviewdate = "";
		public String Ecnational = "";
		public String Insurer = "";
		public String Policytype = "";
		public String Policynum = "";
		public String Chartnum = "";
		public String Xraynum = "";
		public String Mobile = "";
		public String Tmobile = "";
		public String Nkmobile = "";
		public String Contact = "";
		public String Ded = "";
		public String Occstat = "";
		public String Pas_pkey = "";
		public String Bedtyper = "";
		public String __key = "";
		public String Chinum = "";
		public String Chtnum = "";
		public String Ovstat = "";
		public String Ovsdate = "";
		public String Flang = "";
		public String Intreq = "";
		public String Dobver = "";
		public String Extended = "";
		public String Genhspno = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Uusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Idstat = "";
		public String Oidtype = "";
		public String Oidval = "";
		public String Relgtxt = "";
		public String Ethctxt = "";
		public String Marttxt = "";
		public String Areacodetext = "";
		public String Hbdtext = "";
		public String Policytypetext = "";
		public String Insurertext = "";
		public String Bgrptxt = "";
		public String Comment = "";
		public String Tstp = "";
		public String Renewdate = "";
		public String Race = "";
		public String Inactive = "";
		public String State = "";
		public String City = "";
		public String Guarid = "";
		public String Guarrel = "";
		public String Insrel = "";
		public String Insuredid = "";
		public String Conadr1 = "";
		public String Conadr2 = "";
		public String Conadr3 = "";
		public String Conadr4 = "";
		public String Contel = "";
		public String Motherid = "";
		public String Contractpc = "";
		public String Area = "";
		public String Whenentered = "";
		public String Whenupdated = "";
		public String Nhsnfmtver = "";
		public String Nhsnfmt = "";
		public String Nhsnfmtvflag = "";
		public String Nhsnver = "";
		public String Capfnm1 = "";
		public String Cflcomm = "";
		public String Webadt = "";
		public String Delpatact = "";
				
		
		public void clear()
		{
			Pkey = "";
			Snm = "";
			Fnm1 = "";
			Fnm2 = "";
			Nmtype = "";
			Uppsnm = "";
			Uppfnm = "";
			Titl = "";
			Titltxt = "";
			Soundex = "";
			Soundex_fnm = "";
			Dob = "";
			Dod = "";
			Sex = "";
			Nhsn = "";
			Tsta = "";
			Csta = "";
			Hospnum = "";
			Pmrn = "";
			Lpdpkey = "";
			Hpcd = "";
			Ploc = "";
			Patstat = "";
			Cfl = "";
			Cflname = "";
			Cfdt = "";
			Lpdstat = "";
			Plocname = "";
			Aldt = "";
			Tydt = "";
			Cnt = "";
			Cntname = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Adr5 = "";
			Post = "";
			Harc = "";
			Ntel = "";
			Dtel = "";
			Pob = "";
			Stat = "";
			Mart = "";
			Ethc = "";
			Pmipkey = "";
			Relg = "";
			Epsd = "";
			Gpcd = "";
			Gploc = "";
			Prcd = "";
			Gpfh = "";
			Pocc = "";
			Pocctxt = "";
			Socc = "";
			School = "";
			Rgdt = "";
			Bgrp = "";
			Adat = "";
			Srce = "";
			Alert = "";
			Mfr1 = "";
			Mfr2 = "";
			Mfr3 = "";
			Mfr4 = "";
			Mfr5 = "";
			Mfr6 = "";
			Mrsa = "";
			Gpcdname = "";
			Gptitlftxt = "";
			Gpadr1 = "";
			Gpadr2 = "";
			Gpadr3 = "";
			Gpadr4 = "";
			Gpadr5 = "";
			Gppost = "";
			Gptel = "";
			Name = "";
			Nkfnam = "";
			Ntitl = "";
			Nadr1 = "";
			Nadr2 = "";
			Nadr3 = "";
			Nadr4 = "";
			Nadr5 = "";
			Npost = "";
			Nntel = "";
			Ndtel = "";
			Rel = "";
			Reltxt = "";
			Ntitltxt = "";
			Aliasname = "";
			Snmb = "";
			Tadr1 = "";
			Tadr2 = "";
			Tadr3 = "";
			Tadr4 = "";
			Tpost = "";
			Tdtel = "";
			Tntel = "";
			Sextxt = "";
			Otherhnos = "";
			Remote = "";
			Healthcat = "";
			Medcard = "";
			Medcardno = "";
			Medname = "";
			Medprof = "";
			Medeldate = "";
			Medreviewclass = "";
			Medreviewdate = "";
			Ecnational = "";
			Insurer = "";
			Policytype = "";
			Policynum = "";
			Chartnum = "";
			Xraynum = "";
			Mobile = "";
			Tmobile = "";
			Nkmobile = "";
			Contact = "";
			Ded = "";
			Occstat = "";
			Pas_pkey = "";
			Bedtyper = "";
			__key = "";
			Chinum = "";
			Chtnum = "";
			Ovstat = "";
			Ovsdate = "";
			Flang = "";
			Intreq = "";
			Dobver = "";
			Extended = "";
			Genhspno = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Uusr = "";
			Udat = "";
			Utim = "";
			Cdat = "";
			Ctim = "";
			Idstat = "";
			Oidtype = "";
			Oidval = "";
			Relgtxt = "";
			Ethctxt = "";
			Marttxt = "";
			Areacodetext = "";
			Hbdtext = "";
			Policytypetext = "";
			Insurertext = "";
			Bgrptxt = "";
			Comment = "";
			Tstp = "";
			Renewdate = "";
			Race = "";
			Inactive = "";
			State = "";
			City = "";
			Guarid = "";
			Guarrel = "";
			Insrel = "";
			Insuredid = "";
			Conadr1 = "";
			Conadr2 = "";
			Conadr3 = "";
			Conadr4 = "";
			Contel = "";
			Motherid = "";
			Contractpc = "";
			Area = "";
			Whenentered = "";
			Whenupdated = "";
			Nhsnfmtver = "";
			Nhsnfmt = "";
			Nhsnfmtvflag = "";
			Nhsnver = "";
			Capfnm1 = "";
			Cflcomm = "";
			Webadt = "";
			Delpatact = "";
			
		}		
	}
		
		
	public final class PatientFilter
	{			
		public String Pkey = "";
		public String Snm = "";
		public String Fnm1 = "";
		public String Fnm2 = "";
		public String Nmtype = "";
		public String Uppsnm = "";
		public String Uppfnm = "";
		public String Titl = "";
		public String Titltxt = "";
		public String Soundex = "";
		public String Soundex_fnm = "";
		public String Dob = "";
		public String Dod = "";
		public String Sex = "";
		public String Nhsn = "";
		public String Tsta = "";
		public String Csta = "";
		public String Hospnum = "";
		public String Pmrn = "";
		public String Lpdpkey = "";
		public String Hpcd = "";
		public String Ploc = "";
		public String Patstat = "";
		public String Cfl = "";
		public String Cflname = "";
		public String Cfdt = "";
		public String Lpdstat = "";
		public String Plocname = "";
		public String Aldt = "";
		public String Tydt = "";
		public String Cnt = "";
		public String Cntname = "";
		public String Adr1 = "";
		public String Adr2 = "";
		public String Adr3 = "";
		public String Adr4 = "";
		public String Adr5 = "";
		public String Post = "";
		public String Harc = "";
		public String Ntel = "";
		public String Dtel = "";
		public String Pob = "";
		public String Stat = "";
		public String Mart = "";
		public String Ethc = "";
		public String Pmipkey = "";
		public String Relg = "";
		public String Epsd = "";
		public String Gpcd = "";
		public String Gploc = "";
		public String Prcd = "";
		public String Gpfh = "";
		public String Pocc = "";
		public String Pocctxt = "";
		public String Socc = "";
		public String School = "";
		public String Rgdt = "";
		public String Bgrp = "";
		public String Adat = "";
		public String Srce = "";
		public String Alert = "";
		public String Mfr1 = "";
		public String Mfr2 = "";
		public String Mfr3 = "";
		public String Mfr4 = "";
		public String Mfr5 = "";
		public String Mfr6 = "";
		public String Mrsa = "";
		public String Gpcdname = "";
		public String Gptitlftxt = "";
		public String Gpadr1 = "";
		public String Gpadr2 = "";
		public String Gpadr3 = "";
		public String Gpadr4 = "";
		public String Gpadr5 = "";
		public String Gppost = "";
		public String Gptel = "";
		public String Name = "";
		public String Nkfnam = "";
		public String Ntitl = "";
		public String Nadr1 = "";
		public String Nadr2 = "";
		public String Nadr3 = "";
		public String Nadr4 = "";
		public String Nadr5 = "";
		public String Npost = "";
		public String Nntel = "";
		public String Ndtel = "";
		public String Rel = "";
		public String Reltxt = "";
		public String Ntitltxt = "";
		public String Aliasname = "";
		public String Snmb = "";
		public String Tadr1 = "";
		public String Tadr2 = "";
		public String Tadr3 = "";
		public String Tadr4 = "";
		public String Tpost = "";
		public String Tdtel = "";
		public String Tntel = "";
		public String Sextxt = "";
		public String Otherhnos = "";
		public String Remote = "";
		public String Healthcat = "";
		public String Medcard = "";
		public String Medcardno = "";
		public String Medname = "";
		public String Medprof = "";
		public String Medeldate = "";
		public String Medreviewclass = "";
		public String Medreviewdate = "";
		public String Ecnational = "";
		public String Insurer = "";
		public String Policytype = "";
		public String Policynum = "";
		public String Chartnum = "";
		public String Xraynum = "";
		public String Mobile = "";
		public String Tmobile = "";
		public String Nkmobile = "";
		public String Contact = "";
		public String Ded = "";
		public String Occstat = "";
		public String Pas_pkey = "";
		public String Bedtyper = "";
		public String __key = "";
		public String Chinum = "";
		public String Chtnum = "";
		public String Ovstat = "";
		public String Ovsdate = "";
		public String Flang = "";
		public String Intreq = "";
		public String Dobver = "";
		public String Extended = "";
		public String Genhspno = "";
		public String Rusr = "";
		public String Rdat = "";
		public String Rtim = "";
		public String Uusr = "";
		public String Udat = "";
		public String Utim = "";
		public String Cdat = "";
		public String Ctim = "";
		public String Idstat = "";
		public String Oidtype = "";
		public String Oidval = "";
		public String Relgtxt = "";
		public String Ethctxt = "";
		public String Marttxt = "";
		public String Areacodetext = "";
		public String Hbdtext = "";
		public String Policytypetext = "";
		public String Insurertext = "";
		public String Bgrptxt = "";
		public String Comment = "";
		public String Tstp = "";
		public String Renewdate = "";
		public String Race = "";
		public String Inactive = "";
		public String State = "";
		public String City = "";
		public String Guarid = "";
		public String Guarrel = "";
		public String Insrel = "";
		public String Insuredid = "";
		public String Conadr1 = "";
		public String Conadr2 = "";
		public String Conadr3 = "";
		public String Conadr4 = "";
		public String Contel = "";
		public String Motherid = "";
		public String Contractpc = "";
		public String Area = "";
		public String Whenentered = "";
		public String Whenupdated = "";
		public String Nhsnfmtver = "";
		public String Nhsnfmt = "";
		public String Nhsnfmtvflag = "";
		public String Nhsnver = "";
		public String Capfnm1 = "";
		public String Cflcomm = "";
		public String Webadt = "";
		public String Delpatact = "";
		
		public void clear()
		{				
			Pkey = "";
			Snm = "";
			Fnm1 = "";
			Fnm2 = "";
			Nmtype = "";
			Uppsnm = "";
			Uppfnm = "";
			Titl = "";
			Titltxt = "";
			Soundex = "";
			Soundex_fnm = "";
			Dob = "";
			Dod = "";
			Sex = "";
			Nhsn = "";
			Tsta = "";
			Csta = "";
			Hospnum = "";
			Pmrn = "";
			Lpdpkey = "";
			Hpcd = "";
			Ploc = "";
			Patstat = "";
			Cfl = "";
			Cflname = "";
			Cfdt = "";
			Lpdstat = "";
			Plocname = "";
			Aldt = "";
			Tydt = "";
			Cnt = "";
			Cntname = "";
			Adr1 = "";
			Adr2 = "";
			Adr3 = "";
			Adr4 = "";
			Adr5 = "";
			Post = "";
			Harc = "";
			Ntel = "";
			Dtel = "";
			Pob = "";
			Stat = "";
			Mart = "";
			Ethc = "";
			Pmipkey = "";
			Relg = "";
			Epsd = "";
			Gpcd = "";
			Gploc = "";
			Prcd = "";
			Gpfh = "";
			Pocc = "";
			Pocctxt = "";
			Socc = "";
			School = "";
			Rgdt = "";
			Bgrp = "";
			Adat = "";
			Srce = "";
			Alert = "";
			Mfr1 = "";
			Mfr2 = "";
			Mfr3 = "";
			Mfr4 = "";
			Mfr5 = "";
			Mfr6 = "";
			Mrsa = "";
			Gpcdname = "";
			Gptitlftxt = "";
			Gpadr1 = "";
			Gpadr2 = "";
			Gpadr3 = "";
			Gpadr4 = "";
			Gpadr5 = "";
			Gppost = "";
			Gptel = "";
			Name = "";
			Nkfnam = "";
			Ntitl = "";
			Nadr1 = "";
			Nadr2 = "";
			Nadr3 = "";
			Nadr4 = "";
			Nadr5 = "";
			Npost = "";
			Nntel = "";
			Ndtel = "";
			Rel = "";
			Reltxt = "";
			Ntitltxt = "";
			Aliasname = "";
			Snmb = "";
			Tadr1 = "";
			Tadr2 = "";
			Tadr3 = "";
			Tadr4 = "";
			Tpost = "";
			Tdtel = "";
			Tntel = "";
			Sextxt = "";
			Otherhnos = "";
			Remote = "";
			Healthcat = "";
			Medcard = "";
			Medcardno = "";
			Medname = "";
			Medprof = "";
			Medeldate = "";
			Medreviewclass = "";
			Medreviewdate = "";
			Ecnational = "";
			Insurer = "";
			Policytype = "";
			Policynum = "";
			Chartnum = "";
			Xraynum = "";
			Mobile = "";
			Tmobile = "";
			Nkmobile = "";
			Contact = "";
			Ded = "";
			Occstat = "";
			Pas_pkey = "";
			Bedtyper = "";
			__key = "";
			Chinum = "";
			Chtnum = "";
			Ovstat = "";
			Ovsdate = "";
			Flang = "";
			Intreq = "";
			Dobver = "";
			Extended = "";
			Genhspno = "";
			Rusr = "";
			Rdat = "";
			Rtim = "";
			Uusr = "";
			Udat = "";
			Utim = "";
			Cdat = "";
			Ctim = "";
			Idstat = "";
			Oidtype = "";
			Oidval = "";
			Relgtxt = "";
			Ethctxt = "";
			Marttxt = "";
			Areacodetext = "";
			Hbdtext = "";
			Policytypetext = "";
			Insurertext = "";
			Bgrptxt = "";
			Comment = "";
			Tstp = "";
			Renewdate = "";
			Race = "";
			Inactive = "";
			State = "";
			City = "";
			Guarid = "";
			Guarrel = "";
			Insrel = "";
			Insuredid = "";
			Conadr1 = "";
			Conadr2 = "";
			Conadr3 = "";
			Conadr4 = "";
			Contel = "";
			Motherid = "";
			Contractpc = "";
			Area = "";
			Whenentered = "";
			Whenupdated = "";
			Nhsnfmtver = "";
			Nhsnfmt = "";
			Nhsnfmtvflag = "";
			Nhsnver = "";
			Capfnm1 = "";
			Cflcomm = "";
			Webadt = "";
			Delpatact = "";
		}	
		public PatientFilter cloneObject()
		{
			PatientFilter newFilter = new PatientFilter();
			
			newFilter.Pkey = this.Pkey;
			newFilter.Snm = this.Snm;
			newFilter.Fnm1 = this.Fnm1;
			newFilter.Fnm2 = this.Fnm2;
			newFilter.Nmtype = this.Nmtype;
			newFilter.Uppsnm = this.Uppsnm;
			newFilter.Uppfnm = this.Uppfnm;
			newFilter.Titl = this.Titl;
			newFilter.Titltxt = this.Titltxt;
			newFilter.Soundex = this.Soundex;
			newFilter.Soundex_fnm = this.Soundex_fnm;
			newFilter.Dob = this.Dob;
			newFilter.Dod = this.Dod;
			newFilter.Sex = this.Sex;
			newFilter.Nhsn = this.Nhsn;
			newFilter.Tsta = this.Tsta;
			newFilter.Csta = this.Csta;
			newFilter.Hospnum = this.Hospnum;
			newFilter.Pmrn = this.Pmrn;
			newFilter.Lpdpkey = this.Lpdpkey;
			newFilter.Hpcd = this.Hpcd;
			newFilter.Ploc = this.Ploc;
			newFilter.Patstat = this.Patstat;
			newFilter.Cfl = this.Cfl;
			newFilter.Cflname = this.Cflname;
			newFilter.Cfdt = this.Cfdt;
			newFilter.Lpdstat = this.Lpdstat;
			newFilter.Plocname = this.Plocname;
			newFilter.Aldt = this.Aldt;
			newFilter.Tydt = this.Tydt;
			newFilter.Cnt = this.Cnt;
			newFilter.Cntname = this.Cntname;
			newFilter.Adr1 = this.Adr1;
			newFilter.Adr2 = this.Adr2;
			newFilter.Adr3 = this.Adr3;
			newFilter.Adr4 = this.Adr4;
			newFilter.Adr5 = this.Adr5;
			newFilter.Post = this.Post;
			newFilter.Harc = this.Harc;
			newFilter.Ntel = this.Ntel;
			newFilter.Dtel = this.Dtel;
			newFilter.Pob = this.Pob;
			newFilter.Stat = this.Stat;
			newFilter.Mart = this.Mart;
			newFilter.Ethc = this.Ethc;
			newFilter.Pmipkey = this.Pmipkey;
			newFilter.Relg = this.Relg;
			newFilter.Epsd = this.Epsd;
			newFilter.Gpcd = this.Gpcd;
			newFilter.Gploc = this.Gploc;
			newFilter.Prcd = this.Prcd;
			newFilter.Gpfh = this.Gpfh;
			newFilter.Pocc = this.Pocc;
			newFilter.Pocctxt = this.Pocctxt;
			newFilter.Socc = this.Socc;
			newFilter.School = this.School;
			newFilter.Rgdt = this.Rgdt;
			newFilter.Bgrp = this.Bgrp;
			newFilter.Adat = this.Adat;
			newFilter.Srce = this.Srce;
			newFilter.Alert = this.Alert;
			newFilter.Mfr1 = this.Mfr1;
			newFilter.Mfr2 = this.Mfr2;
			newFilter.Mfr3 = this.Mfr3;
			newFilter.Mfr4 = this.Mfr4;
			newFilter.Mfr5 = this.Mfr5;
			newFilter.Mfr6 = this.Mfr6;
			newFilter.Mrsa = this.Mrsa;
			newFilter.Gpcdname = this.Gpcdname;
			newFilter.Gptitlftxt = this.Gptitlftxt;
			newFilter.Gpadr1 = this.Gpadr1;
			newFilter.Gpadr2 = this.Gpadr2;
			newFilter.Gpadr3 = this.Gpadr3;
			newFilter.Gpadr4 = this.Gpadr4;
			newFilter.Gpadr5 = this.Gpadr5;
			newFilter.Gppost = this.Gppost;
			newFilter.Gptel = this.Gptel;
			newFilter.Name = this.Name;
			newFilter.Nkfnam = this.Nkfnam;
			newFilter.Ntitl = this.Ntitl;
			newFilter.Nadr1 = this.Nadr1;
			newFilter.Nadr2 = this.Nadr2;
			newFilter.Nadr3 = this.Nadr3;
			newFilter.Nadr4 = this.Nadr4;
			newFilter.Nadr5 = this.Nadr5;
			newFilter.Npost = this.Npost;
			newFilter.Nntel = this.Nntel;
			newFilter.Ndtel = this.Ndtel;
			newFilter.Rel = this.Rel;
			newFilter.Reltxt = this.Reltxt;
			newFilter.Ntitltxt = this.Ntitltxt;
			newFilter.Aliasname = this.Aliasname;
			newFilter.Snmb = this.Snmb;
			newFilter.Tadr1 = this.Tadr1;
			newFilter.Tadr2 = this.Tadr2;
			newFilter.Tadr3 = this.Tadr3;
			newFilter.Tadr4 = this.Tadr4;
			newFilter.Tpost = this.Tpost;
			newFilter.Tdtel = this.Tdtel;
			newFilter.Tntel = this.Tntel;
			newFilter.Sextxt = this.Sextxt;
			newFilter.Otherhnos = this.Otherhnos;
			newFilter.Remote = this.Remote;
			newFilter.Healthcat = this.Healthcat;
			newFilter.Medcard = this.Medcard;
			newFilter.Medcardno = this.Medcardno;
			newFilter.Medname = this.Medname;
			newFilter.Medprof = this.Medprof;
			newFilter.Medeldate = this.Medeldate;
			newFilter.Medreviewclass = this.Medreviewclass;
			newFilter.Medreviewdate = this.Medreviewdate;
			newFilter.Ecnational = this.Ecnational;
			newFilter.Insurer = this.Insurer;
			newFilter.Policytype = this.Policytype;
			newFilter.Policynum = this.Policynum;
			newFilter.Chartnum = this.Chartnum;
			newFilter.Xraynum = this.Xraynum;
			newFilter.Mobile = this.Mobile;
			newFilter.Tmobile = this.Tmobile;
			newFilter.Nkmobile = this.Nkmobile;
			newFilter.Contact = this.Contact;
			newFilter.Ded = this.Ded;
			newFilter.Occstat = this.Occstat;
			newFilter.Pas_pkey = this.Pas_pkey;
			newFilter.Bedtyper = this.Bedtyper;
			newFilter.__key = this.__key;
			newFilter.Chinum = this.Chinum;
			newFilter.Chtnum = this.Chtnum;
			newFilter.Ovstat = this.Ovstat;
			newFilter.Ovsdate = this.Ovsdate;
			newFilter.Flang = this.Flang;
			newFilter.Intreq = this.Intreq;
			newFilter.Dobver = this.Dobver;
			newFilter.Extended = this.Extended;
			newFilter.Genhspno = this.Genhspno;
			newFilter.Rusr = this.Rusr;
			newFilter.Rdat = this.Rdat;
			newFilter.Rtim = this.Rtim;
			newFilter.Uusr = this.Uusr;
			newFilter.Udat = this.Udat;
			newFilter.Utim = this.Utim;
			newFilter.Cdat = this.Cdat;
			newFilter.Ctim = this.Ctim;
			newFilter.Idstat = this.Idstat;
			newFilter.Oidtype = this.Oidtype;
			newFilter.Oidval = this.Oidval;
			newFilter.Relgtxt = this.Relgtxt;
			newFilter.Ethctxt = this.Ethctxt;
			newFilter.Marttxt = this.Marttxt;
			newFilter.Areacodetext = this.Areacodetext;
			newFilter.Hbdtext = this.Hbdtext;
			newFilter.Policytypetext = this.Policytypetext;
			newFilter.Insurertext = this.Insurertext;
			newFilter.Bgrptxt = this.Bgrptxt;
			newFilter.Comment = this.Comment;
			newFilter.Tstp = this.Tstp;
			newFilter.Renewdate = this.Renewdate;
			newFilter.Race = this.Race;
			newFilter.Inactive = this.Inactive;
			newFilter.State = this.State;
			newFilter.City = this.City;
			newFilter.Guarid = this.Guarid;
			newFilter.Guarrel = this.Guarrel;
			newFilter.Insrel = this.Insrel;
			newFilter.Insuredid = this.Insuredid;
			newFilter.Conadr1 = this.Conadr1;
			newFilter.Conadr2 = this.Conadr2;
			newFilter.Conadr3 = this.Conadr3;
			newFilter.Conadr4 = this.Conadr4;
			newFilter.Contel = this.Contel;
			newFilter.Motherid = this.Motherid;
			newFilter.Contractpc = this.Contractpc;
			newFilter.Area = this.Area;
			newFilter.Whenentered = this.Whenentered;
			newFilter.Whenupdated = this.Whenupdated;
			newFilter.Nhsnfmtver = this.Nhsnfmtver;
			newFilter.Nhsnfmt = this.Nhsnfmt;
			newFilter.Nhsnfmtvflag = this.Nhsnfmtvflag;
			newFilter.Nhsnver = this.Nhsnver;
			newFilter.Capfnm1 = this.Capfnm1;
			newFilter.Cflcomm = this.Cflcomm;
			newFilter.Webadt = this.Webadt;
			newFilter.Delpatact = this.Delpatact;
			
			return newFilter;
		}
	}
	public final class PatientEditFilter
	{			
		public boolean IncludePkey = true;
		public boolean IncludeSnm = true;
		public boolean IncludeFnm1 = true;
		public boolean IncludeFnm2 = true;
		public boolean IncludeNmtype = true;
		public boolean IncludeUppsnm = true;
		public boolean IncludeUppfnm = true;
		public boolean IncludeTitl = true;
		public boolean IncludeTitltxt = true;
		public boolean IncludeSoundex = true;
		public boolean IncludeSoundex_fnm = true;
		public boolean IncludeDob = true;
		public boolean IncludeDod = true;
		public boolean IncludeSex = true;
		public boolean IncludeNhsn = true;
		public boolean IncludeTsta = true;
		public boolean IncludeCsta = true;
		public boolean IncludeHospnum = true;
		public boolean IncludePmrn = true;
		public boolean IncludeLpdpkey = true;
		public boolean IncludeHpcd = true;
		public boolean IncludePloc = true;
		public boolean IncludePatstat = true;
		public boolean IncludeCfl = true;
		public boolean IncludeCflname = true;
		public boolean IncludeCfdt = true;
		public boolean IncludeLpdstat = true;
		public boolean IncludePlocname = true;
		public boolean IncludeAldt = true;
		public boolean IncludeTydt = true;
		public boolean IncludeCnt = true;
		public boolean IncludeCntname = true;
		public boolean IncludeAdr1 = true;
		public boolean IncludeAdr2 = true;
		public boolean IncludeAdr3 = true;
		public boolean IncludeAdr4 = true;
		public boolean IncludeAdr5 = true;
		public boolean IncludePost = true;
		public boolean IncludeHarc = true;
		public boolean IncludeNtel = true;
		public boolean IncludeDtel = true;
		public boolean IncludePob = true;
		public boolean IncludeStat = true;
		public boolean IncludeMart = true;
		public boolean IncludeEthc = true;
		public boolean IncludePmipkey = true;
		public boolean IncludeRelg = true;
		public boolean IncludeEpsd = true;
		public boolean IncludeGpcd = true;
		public boolean IncludeGploc = true;
		public boolean IncludePrcd = true;
		public boolean IncludeGpfh = true;
		public boolean IncludePocc = true;
		public boolean IncludePocctxt = true;
		public boolean IncludeSocc = true;
		public boolean IncludeSchool = true;
		public boolean IncludeRgdt = true;
		public boolean IncludeBgrp = true;
		public boolean IncludeAdat = true;
		public boolean IncludeSrce = true;
		public boolean IncludeAlert = true;
		public boolean IncludeMfr1 = true;
		public boolean IncludeMfr2 = true;
		public boolean IncludeMfr3 = true;
		public boolean IncludeMfr4 = true;
		public boolean IncludeMfr5 = true;
		public boolean IncludeMfr6 = true;
		public boolean IncludeMrsa = true;
		public boolean IncludeGpcdname = true;
		public boolean IncludeGptitlftxt = true;
		public boolean IncludeGpadr1 = true;
		public boolean IncludeGpadr2 = true;
		public boolean IncludeGpadr3 = true;
		public boolean IncludeGpadr4 = true;
		public boolean IncludeGpadr5 = true;
		public boolean IncludeGppost = true;
		public boolean IncludeGptel = true;
		public boolean IncludeName = true;
		public boolean IncludeNkfnam = true;
		public boolean IncludeNtitl = true;
		public boolean IncludeNadr1 = true;
		public boolean IncludeNadr2 = true;
		public boolean IncludeNadr3 = true;
		public boolean IncludeNadr4 = true;
		public boolean IncludeNadr5 = true;
		public boolean IncludeNpost = true;
		public boolean IncludeNntel = true;
		public boolean IncludeNdtel = true;
		public boolean IncludeRel = true;
		public boolean IncludeReltxt = true;
		public boolean IncludeNtitltxt = true;
		public boolean IncludeAliasname = true;
		public boolean IncludeSnmb = true;
		public boolean IncludeTadr1 = true;
		public boolean IncludeTadr2 = true;
		public boolean IncludeTadr3 = true;
		public boolean IncludeTadr4 = true;
		public boolean IncludeTpost = true;
		public boolean IncludeTdtel = true;
		public boolean IncludeTntel = true;
		public boolean IncludeSextxt = true;
		public boolean IncludeOtherhnos = true;
		public boolean IncludeRemote = true;
		public boolean IncludeHealthcat = true;
		public boolean IncludeMedcard = true;
		public boolean IncludeMedcardno = true;
		public boolean IncludeMedname = true;
		public boolean IncludeMedprof = true;
		public boolean IncludeMedeldate = true;
		public boolean IncludeMedreviewclass = true;
		public boolean IncludeMedreviewdate = true;
		public boolean IncludeEcnational = true;
		public boolean IncludeInsurer = true;
		public boolean IncludePolicytype = true;
		public boolean IncludePolicynum = true;
		public boolean IncludeChartnum = true;
		public boolean IncludeXraynum = true;
		public boolean IncludeMobile = true;
		public boolean IncludeTmobile = true;
		public boolean IncludeNkmobile = true;
		public boolean IncludeContact = true;
		public boolean IncludeDed = true;
		public boolean IncludeOccstat = true;
		public boolean IncludePas_pkey = true;
		public boolean IncludeBedtyper = true;
		public boolean Include__key = true;
		public boolean IncludeChinum = true;
		public boolean IncludeChtnum = true;
		public boolean IncludeOvstat = true;
		public boolean IncludeOvsdate = true;
		public boolean IncludeFlang = true;
		public boolean IncludeIntreq = true;
		public boolean IncludeDobver = true;
		public boolean IncludeExtended = true;
		public boolean IncludeGenhspno = true;
		public boolean IncludeRusr = true;
		public boolean IncludeRdat = true;
		public boolean IncludeRtim = true;
		public boolean IncludeUusr = true;
		public boolean IncludeUdat = true;
		public boolean IncludeUtim = true;
		public boolean IncludeCdat = true;
		public boolean IncludeCtim = true;
		public boolean IncludeIdstat = true;
		public boolean IncludeOidtype = true;
		public boolean IncludeOidval = true;
		public boolean IncludeRelgtxt = true;
		public boolean IncludeEthctxt = true;
		public boolean IncludeMarttxt = true;
		public boolean IncludeAreacodetext = true;
		public boolean IncludeHbdtext = true;
		public boolean IncludePolicytypetext = true;
		public boolean IncludeInsurertext = true;
		public boolean IncludeBgrptxt = true;
		public boolean IncludeComment = true;
		public boolean IncludeTstp = true;
		public boolean IncludeRenewdate = true;
		public boolean IncludeRace = true;
		public boolean IncludeInactive = true;
		public boolean IncludeState = true;
		public boolean IncludeCity = true;
		public boolean IncludeGuarid = true;
		public boolean IncludeGuarrel = true;
		public boolean IncludeInsrel = true;
		public boolean IncludeInsuredid = true;
		public boolean IncludeConadr1 = true;
		public boolean IncludeConadr2 = true;
		public boolean IncludeConadr3 = true;
		public boolean IncludeConadr4 = true;
		public boolean IncludeContel = true;
		public boolean IncludeMotherid = true;
		public boolean IncludeContractpc = true;
		public boolean IncludeArea = true;
		public boolean IncludeWhenentered = true;
		public boolean IncludeWhenupdated = true;
		public boolean IncludeNhsnfmtver = true;
		public boolean IncludeNhsnfmt = true;
		public boolean IncludeNhsnfmtvflag = true;
		public boolean IncludeNhsnver = true;
		public boolean IncludeCapfnm1 = true;
		public boolean IncludeCflcomm = true;
		public boolean IncludeWebadt = true;
		public boolean IncludeDelpatact = true;
		
		public void includeAll()
		{				
			IncludePkey = true;
			IncludeSnm = true;
			IncludeFnm1 = true;
			IncludeFnm2 = true;
			IncludeNmtype = true;
			IncludeUppsnm = true;
			IncludeUppfnm = true;
			IncludeTitl = true;
			IncludeTitltxt = true;
			IncludeSoundex = true;
			IncludeSoundex_fnm = true;
			IncludeDob = true;
			IncludeDod = true;
			IncludeSex = true;
			IncludeNhsn = true;
			IncludeTsta = true;
			IncludeCsta = true;
			IncludeHospnum = true;
			IncludePmrn = true;
			IncludeLpdpkey = true;
			IncludeHpcd = true;
			IncludePloc = true;
			IncludePatstat = true;
			IncludeCfl = true;
			IncludeCflname = true;
			IncludeCfdt = true;
			IncludeLpdstat = true;
			IncludePlocname = true;
			IncludeAldt = true;
			IncludeTydt = true;
			IncludeCnt = true;
			IncludeCntname = true;
			IncludeAdr1 = true;
			IncludeAdr2 = true;
			IncludeAdr3 = true;
			IncludeAdr4 = true;
			IncludeAdr5 = true;
			IncludePost = true;
			IncludeHarc = true;
			IncludeNtel = true;
			IncludeDtel = true;
			IncludePob = true;
			IncludeStat = true;
			IncludeMart = true;
			IncludeEthc = true;
			IncludePmipkey = true;
			IncludeRelg = true;
			IncludeEpsd = true;
			IncludeGpcd = true;
			IncludeGploc = true;
			IncludePrcd = true;
			IncludeGpfh = true;
			IncludePocc = true;
			IncludePocctxt = true;
			IncludeSocc = true;
			IncludeSchool = true;
			IncludeRgdt = true;
			IncludeBgrp = true;
			IncludeAdat = true;
			IncludeSrce = true;
			IncludeAlert = true;
			IncludeMfr1 = true;
			IncludeMfr2 = true;
			IncludeMfr3 = true;
			IncludeMfr4 = true;
			IncludeMfr5 = true;
			IncludeMfr6 = true;
			IncludeMrsa = true;
			IncludeGpcdname = true;
			IncludeGptitlftxt = true;
			IncludeGpadr1 = true;
			IncludeGpadr2 = true;
			IncludeGpadr3 = true;
			IncludeGpadr4 = true;
			IncludeGpadr5 = true;
			IncludeGppost = true;
			IncludeGptel = true;
			IncludeName = true;
			IncludeNkfnam = true;
			IncludeNtitl = true;
			IncludeNadr1 = true;
			IncludeNadr2 = true;
			IncludeNadr3 = true;
			IncludeNadr4 = true;
			IncludeNadr5 = true;
			IncludeNpost = true;
			IncludeNntel = true;
			IncludeNdtel = true;
			IncludeRel = true;
			IncludeReltxt = true;
			IncludeNtitltxt = true;
			IncludeAliasname = true;
			IncludeSnmb = true;
			IncludeTadr1 = true;
			IncludeTadr2 = true;
			IncludeTadr3 = true;
			IncludeTadr4 = true;
			IncludeTpost = true;
			IncludeTdtel = true;
			IncludeTntel = true;
			IncludeSextxt = true;
			IncludeOtherhnos = true;
			IncludeRemote = true;
			IncludeHealthcat = true;
			IncludeMedcard = true;
			IncludeMedcardno = true;
			IncludeMedname = true;
			IncludeMedprof = true;
			IncludeMedeldate = true;
			IncludeMedreviewclass = true;
			IncludeMedreviewdate = true;
			IncludeEcnational = true;
			IncludeInsurer = true;
			IncludePolicytype = true;
			IncludePolicynum = true;
			IncludeChartnum = true;
			IncludeXraynum = true;
			IncludeMobile = true;
			IncludeTmobile = true;
			IncludeNkmobile = true;
			IncludeContact = true;
			IncludeDed = true;
			IncludeOccstat = true;
			IncludePas_pkey = true;
			IncludeBedtyper = true;
			Include__key = true;
			IncludeChinum = true;
			IncludeChtnum = true;
			IncludeOvstat = true;
			IncludeOvsdate = true;
			IncludeFlang = true;
			IncludeIntreq = true;
			IncludeDobver = true;
			IncludeExtended = true;
			IncludeGenhspno = true;
			IncludeRusr = true;
			IncludeRdat = true;
			IncludeRtim = true;
			IncludeUusr = true;
			IncludeUdat = true;
			IncludeUtim = true;
			IncludeCdat = true;
			IncludeCtim = true;
			IncludeIdstat = true;
			IncludeOidtype = true;
			IncludeOidval = true;
			IncludeRelgtxt = true;
			IncludeEthctxt = true;
			IncludeMarttxt = true;
			IncludeAreacodetext = true;
			IncludeHbdtext = true;
			IncludePolicytypetext = true;
			IncludeInsurertext = true;
			IncludeBgrptxt = true;
			IncludeComment = true;
			IncludeTstp = true;
			IncludeRenewdate = true;
			IncludeRace = true;
			IncludeInactive = true;
			IncludeState = true;
			IncludeCity = true;
			IncludeGuarid = true;
			IncludeGuarrel = true;
			IncludeInsrel = true;
			IncludeInsuredid = true;
			IncludeConadr1 = true;
			IncludeConadr2 = true;
			IncludeConadr3 = true;
			IncludeConadr4 = true;
			IncludeContel = true;
			IncludeMotherid = true;
			IncludeContractpc = true;
			IncludeArea = true;
			IncludeWhenentered = true;
			IncludeWhenupdated = true;
			IncludeNhsnfmtver = true;
			IncludeNhsnfmt = true;
			IncludeNhsnfmtvflag = true;
			IncludeNhsnver = true;
			IncludeCapfnm1 = true;
			IncludeCflcomm = true;
			IncludeWebadt = true;
			IncludeDelpatact = true;
		}	
		public void excludeAll()
		{				
			IncludePkey = false;
			IncludeSnm = false;
			IncludeFnm1 = false;
			IncludeFnm2 = false;
			IncludeNmtype = false;
			IncludeUppsnm = false;
			IncludeUppfnm = false;
			IncludeTitl = false;
			IncludeTitltxt = false;
			IncludeSoundex = false;
			IncludeSoundex_fnm = false;
			IncludeDob = false;
			IncludeDod = false;
			IncludeSex = false;
			IncludeNhsn = false;
			IncludeTsta = false;
			IncludeCsta = false;
			IncludeHospnum = false;
			IncludePmrn = false;
			IncludeLpdpkey = false;
			IncludeHpcd = false;
			IncludePloc = false;
			IncludePatstat = false;
			IncludeCfl = false;
			IncludeCflname = false;
			IncludeCfdt = false;
			IncludeLpdstat = false;
			IncludePlocname = false;
			IncludeAldt = false;
			IncludeTydt = false;
			IncludeCnt = false;
			IncludeCntname = false;
			IncludeAdr1 = false;
			IncludeAdr2 = false;
			IncludeAdr3 = false;
			IncludeAdr4 = false;
			IncludeAdr5 = false;
			IncludePost = false;
			IncludeHarc = false;
			IncludeNtel = false;
			IncludeDtel = false;
			IncludePob = false;
			IncludeStat = false;
			IncludeMart = false;
			IncludeEthc = false;
			IncludePmipkey = false;
			IncludeRelg = false;
			IncludeEpsd = false;
			IncludeGpcd = false;
			IncludeGploc = false;
			IncludePrcd = false;
			IncludeGpfh = false;
			IncludePocc = false;
			IncludePocctxt = false;
			IncludeSocc = false;
			IncludeSchool = false;
			IncludeRgdt = false;
			IncludeBgrp = false;
			IncludeAdat = false;
			IncludeSrce = false;
			IncludeAlert = false;
			IncludeMfr1 = false;
			IncludeMfr2 = false;
			IncludeMfr3 = false;
			IncludeMfr4 = false;
			IncludeMfr5 = false;
			IncludeMfr6 = false;
			IncludeMrsa = false;
			IncludeGpcdname = false;
			IncludeGptitlftxt = false;
			IncludeGpadr1 = false;
			IncludeGpadr2 = false;
			IncludeGpadr3 = false;
			IncludeGpadr4 = false;
			IncludeGpadr5 = false;
			IncludeGppost = false;
			IncludeGptel = false;
			IncludeName = false;
			IncludeNkfnam = false;
			IncludeNtitl = false;
			IncludeNadr1 = false;
			IncludeNadr2 = false;
			IncludeNadr3 = false;
			IncludeNadr4 = false;
			IncludeNadr5 = false;
			IncludeNpost = false;
			IncludeNntel = false;
			IncludeNdtel = false;
			IncludeRel = false;
			IncludeReltxt = false;
			IncludeNtitltxt = false;
			IncludeAliasname = false;
			IncludeSnmb = false;
			IncludeTadr1 = false;
			IncludeTadr2 = false;
			IncludeTadr3 = false;
			IncludeTadr4 = false;
			IncludeTpost = false;
			IncludeTdtel = false;
			IncludeTntel = false;
			IncludeSextxt = false;
			IncludeOtherhnos = false;
			IncludeRemote = false;
			IncludeHealthcat = false;
			IncludeMedcard = false;
			IncludeMedcardno = false;
			IncludeMedname = false;
			IncludeMedprof = false;
			IncludeMedeldate = false;
			IncludeMedreviewclass = false;
			IncludeMedreviewdate = false;
			IncludeEcnational = false;
			IncludeInsurer = false;
			IncludePolicytype = false;
			IncludePolicynum = false;
			IncludeChartnum = false;
			IncludeXraynum = false;
			IncludeMobile = false;
			IncludeTmobile = false;
			IncludeNkmobile = false;
			IncludeContact = false;
			IncludeDed = false;
			IncludeOccstat = false;
			IncludePas_pkey = false;
			IncludeBedtyper = false;
			Include__key = false;
			IncludeChinum = false;
			IncludeChtnum = false;
			IncludeOvstat = false;
			IncludeOvsdate = false;
			IncludeFlang = false;
			IncludeIntreq = false;
			IncludeDobver = false;
			IncludeExtended = false;
			IncludeGenhspno = false;
			IncludeRusr = false;
			IncludeRdat = false;
			IncludeRtim = false;
			IncludeUusr = false;
			IncludeUdat = false;
			IncludeUtim = false;
			IncludeCdat = false;
			IncludeCtim = false;
			IncludeIdstat = false;
			IncludeOidtype = false;
			IncludeOidval = false;
			IncludeRelgtxt = false;
			IncludeEthctxt = false;
			IncludeMarttxt = false;
			IncludeAreacodetext = false;
			IncludeHbdtext = false;
			IncludePolicytypetext = false;
			IncludeInsurertext = false;
			IncludeBgrptxt = false;
			IncludeComment = false;
			IncludeTstp = false;
			IncludeRenewdate = false;
			IncludeRace = false;
			IncludeInactive = false;
			IncludeState = false;
			IncludeCity = false;
			IncludeGuarid = false;
			IncludeGuarrel = false;
			IncludeInsrel = false;
			IncludeInsuredid = false;
			IncludeConadr1 = false;
			IncludeConadr2 = false;
			IncludeConadr3 = false;
			IncludeConadr4 = false;
			IncludeContel = false;
			IncludeMotherid = false;
			IncludeContractpc = false;
			IncludeArea = false;
			IncludeWhenentered = false;
			IncludeWhenupdated = false;
			IncludeNhsnfmtver = false;
			IncludeNhsnfmt = false;
			IncludeNhsnfmtvflag = false;
			IncludeNhsnver = false;
			IncludeCapfnm1 = false;
			IncludeCflcomm = false;
			IncludeWebadt = false;
			IncludeDelpatact = false;
		}
		public PatientEditFilter cloneObject()
		{
			PatientEditFilter newEditFilter = new PatientEditFilter();
			
			newEditFilter.IncludePkey = this.IncludePkey;
			newEditFilter.IncludeSnm = this.IncludeSnm;
			newEditFilter.IncludeFnm1 = this.IncludeFnm1;
			newEditFilter.IncludeFnm2 = this.IncludeFnm2;
			newEditFilter.IncludeNmtype = this.IncludeNmtype;
			newEditFilter.IncludeUppsnm = this.IncludeUppsnm;
			newEditFilter.IncludeUppfnm = this.IncludeUppfnm;
			newEditFilter.IncludeTitl = this.IncludeTitl;
			newEditFilter.IncludeTitltxt = this.IncludeTitltxt;
			newEditFilter.IncludeSoundex = this.IncludeSoundex;
			newEditFilter.IncludeSoundex_fnm = this.IncludeSoundex_fnm;
			newEditFilter.IncludeDob = this.IncludeDob;
			newEditFilter.IncludeDod = this.IncludeDod;
			newEditFilter.IncludeSex = this.IncludeSex;
			newEditFilter.IncludeNhsn = this.IncludeNhsn;
			newEditFilter.IncludeTsta = this.IncludeTsta;
			newEditFilter.IncludeCsta = this.IncludeCsta;
			newEditFilter.IncludeHospnum = this.IncludeHospnum;
			newEditFilter.IncludePmrn = this.IncludePmrn;
			newEditFilter.IncludeLpdpkey = this.IncludeLpdpkey;
			newEditFilter.IncludeHpcd = this.IncludeHpcd;
			newEditFilter.IncludePloc = this.IncludePloc;
			newEditFilter.IncludePatstat = this.IncludePatstat;
			newEditFilter.IncludeCfl = this.IncludeCfl;
			newEditFilter.IncludeCflname = this.IncludeCflname;
			newEditFilter.IncludeCfdt = this.IncludeCfdt;
			newEditFilter.IncludeLpdstat = this.IncludeLpdstat;
			newEditFilter.IncludePlocname = this.IncludePlocname;
			newEditFilter.IncludeAldt = this.IncludeAldt;
			newEditFilter.IncludeTydt = this.IncludeTydt;
			newEditFilter.IncludeCnt = this.IncludeCnt;
			newEditFilter.IncludeCntname = this.IncludeCntname;
			newEditFilter.IncludeAdr1 = this.IncludeAdr1;
			newEditFilter.IncludeAdr2 = this.IncludeAdr2;
			newEditFilter.IncludeAdr3 = this.IncludeAdr3;
			newEditFilter.IncludeAdr4 = this.IncludeAdr4;
			newEditFilter.IncludeAdr5 = this.IncludeAdr5;
			newEditFilter.IncludePost = this.IncludePost;
			newEditFilter.IncludeHarc = this.IncludeHarc;
			newEditFilter.IncludeNtel = this.IncludeNtel;
			newEditFilter.IncludeDtel = this.IncludeDtel;
			newEditFilter.IncludePob = this.IncludePob;
			newEditFilter.IncludeStat = this.IncludeStat;
			newEditFilter.IncludeMart = this.IncludeMart;
			newEditFilter.IncludeEthc = this.IncludeEthc;
			newEditFilter.IncludePmipkey = this.IncludePmipkey;
			newEditFilter.IncludeRelg = this.IncludeRelg;
			newEditFilter.IncludeEpsd = this.IncludeEpsd;
			newEditFilter.IncludeGpcd = this.IncludeGpcd;
			newEditFilter.IncludeGploc = this.IncludeGploc;
			newEditFilter.IncludePrcd = this.IncludePrcd;
			newEditFilter.IncludeGpfh = this.IncludeGpfh;
			newEditFilter.IncludePocc = this.IncludePocc;
			newEditFilter.IncludePocctxt = this.IncludePocctxt;
			newEditFilter.IncludeSocc = this.IncludeSocc;
			newEditFilter.IncludeSchool = this.IncludeSchool;
			newEditFilter.IncludeRgdt = this.IncludeRgdt;
			newEditFilter.IncludeBgrp = this.IncludeBgrp;
			newEditFilter.IncludeAdat = this.IncludeAdat;
			newEditFilter.IncludeSrce = this.IncludeSrce;
			newEditFilter.IncludeAlert = this.IncludeAlert;
			newEditFilter.IncludeMfr1 = this.IncludeMfr1;
			newEditFilter.IncludeMfr2 = this.IncludeMfr2;
			newEditFilter.IncludeMfr3 = this.IncludeMfr3;
			newEditFilter.IncludeMfr4 = this.IncludeMfr4;
			newEditFilter.IncludeMfr5 = this.IncludeMfr5;
			newEditFilter.IncludeMfr6 = this.IncludeMfr6;
			newEditFilter.IncludeMrsa = this.IncludeMrsa;
			newEditFilter.IncludeGpcdname = this.IncludeGpcdname;
			newEditFilter.IncludeGptitlftxt = this.IncludeGptitlftxt;
			newEditFilter.IncludeGpadr1 = this.IncludeGpadr1;
			newEditFilter.IncludeGpadr2 = this.IncludeGpadr2;
			newEditFilter.IncludeGpadr3 = this.IncludeGpadr3;
			newEditFilter.IncludeGpadr4 = this.IncludeGpadr4;
			newEditFilter.IncludeGpadr5 = this.IncludeGpadr5;
			newEditFilter.IncludeGppost = this.IncludeGppost;
			newEditFilter.IncludeGptel = this.IncludeGptel;
			newEditFilter.IncludeName = this.IncludeName;
			newEditFilter.IncludeNkfnam = this.IncludeNkfnam;
			newEditFilter.IncludeNtitl = this.IncludeNtitl;
			newEditFilter.IncludeNadr1 = this.IncludeNadr1;
			newEditFilter.IncludeNadr2 = this.IncludeNadr2;
			newEditFilter.IncludeNadr3 = this.IncludeNadr3;
			newEditFilter.IncludeNadr4 = this.IncludeNadr4;
			newEditFilter.IncludeNadr5 = this.IncludeNadr5;
			newEditFilter.IncludeNpost = this.IncludeNpost;
			newEditFilter.IncludeNntel = this.IncludeNntel;
			newEditFilter.IncludeNdtel = this.IncludeNdtel;
			newEditFilter.IncludeRel = this.IncludeRel;
			newEditFilter.IncludeReltxt = this.IncludeReltxt;
			newEditFilter.IncludeNtitltxt = this.IncludeNtitltxt;
			newEditFilter.IncludeAliasname = this.IncludeAliasname;
			newEditFilter.IncludeSnmb = this.IncludeSnmb;
			newEditFilter.IncludeTadr1 = this.IncludeTadr1;
			newEditFilter.IncludeTadr2 = this.IncludeTadr2;
			newEditFilter.IncludeTadr3 = this.IncludeTadr3;
			newEditFilter.IncludeTadr4 = this.IncludeTadr4;
			newEditFilter.IncludeTpost = this.IncludeTpost;
			newEditFilter.IncludeTdtel = this.IncludeTdtel;
			newEditFilter.IncludeTntel = this.IncludeTntel;
			newEditFilter.IncludeSextxt = this.IncludeSextxt;
			newEditFilter.IncludeOtherhnos = this.IncludeOtherhnos;
			newEditFilter.IncludeRemote = this.IncludeRemote;
			newEditFilter.IncludeHealthcat = this.IncludeHealthcat;
			newEditFilter.IncludeMedcard = this.IncludeMedcard;
			newEditFilter.IncludeMedcardno = this.IncludeMedcardno;
			newEditFilter.IncludeMedname = this.IncludeMedname;
			newEditFilter.IncludeMedprof = this.IncludeMedprof;
			newEditFilter.IncludeMedeldate = this.IncludeMedeldate;
			newEditFilter.IncludeMedreviewclass = this.IncludeMedreviewclass;
			newEditFilter.IncludeMedreviewdate = this.IncludeMedreviewdate;
			newEditFilter.IncludeEcnational = this.IncludeEcnational;
			newEditFilter.IncludeInsurer = this.IncludeInsurer;
			newEditFilter.IncludePolicytype = this.IncludePolicytype;
			newEditFilter.IncludePolicynum = this.IncludePolicynum;
			newEditFilter.IncludeChartnum = this.IncludeChartnum;
			newEditFilter.IncludeXraynum = this.IncludeXraynum;
			newEditFilter.IncludeMobile = this.IncludeMobile;
			newEditFilter.IncludeTmobile = this.IncludeTmobile;
			newEditFilter.IncludeNkmobile = this.IncludeNkmobile;
			newEditFilter.IncludeContact = this.IncludeContact;
			newEditFilter.IncludeDed = this.IncludeDed;
			newEditFilter.IncludeOccstat = this.IncludeOccstat;
			newEditFilter.IncludePas_pkey = this.IncludePas_pkey;
			newEditFilter.IncludeBedtyper = this.IncludeBedtyper;
			newEditFilter.Include__key = this.Include__key;
			newEditFilter.IncludeChinum = this.IncludeChinum;
			newEditFilter.IncludeChtnum = this.IncludeChtnum;
			newEditFilter.IncludeOvstat = this.IncludeOvstat;
			newEditFilter.IncludeOvsdate = this.IncludeOvsdate;
			newEditFilter.IncludeFlang = this.IncludeFlang;
			newEditFilter.IncludeIntreq = this.IncludeIntreq;
			newEditFilter.IncludeDobver = this.IncludeDobver;
			newEditFilter.IncludeExtended = this.IncludeExtended;
			newEditFilter.IncludeGenhspno = this.IncludeGenhspno;
			newEditFilter.IncludeRusr = this.IncludeRusr;
			newEditFilter.IncludeRdat = this.IncludeRdat;
			newEditFilter.IncludeRtim = this.IncludeRtim;
			newEditFilter.IncludeUusr = this.IncludeUusr;
			newEditFilter.IncludeUdat = this.IncludeUdat;
			newEditFilter.IncludeUtim = this.IncludeUtim;
			newEditFilter.IncludeCdat = this.IncludeCdat;
			newEditFilter.IncludeCtim = this.IncludeCtim;
			newEditFilter.IncludeIdstat = this.IncludeIdstat;
			newEditFilter.IncludeOidtype = this.IncludeOidtype;
			newEditFilter.IncludeOidval = this.IncludeOidval;
			newEditFilter.IncludeRelgtxt = this.IncludeRelgtxt;
			newEditFilter.IncludeEthctxt = this.IncludeEthctxt;
			newEditFilter.IncludeMarttxt = this.IncludeMarttxt;
			newEditFilter.IncludeAreacodetext = this.IncludeAreacodetext;
			newEditFilter.IncludeHbdtext = this.IncludeHbdtext;
			newEditFilter.IncludePolicytypetext = this.IncludePolicytypetext;
			newEditFilter.IncludeInsurertext = this.IncludeInsurertext;
			newEditFilter.IncludeBgrptxt = this.IncludeBgrptxt;
			newEditFilter.IncludeComment = this.IncludeComment;
			newEditFilter.IncludeTstp = this.IncludeTstp;
			newEditFilter.IncludeRenewdate = this.IncludeRenewdate;
			newEditFilter.IncludeRace = this.IncludeRace;
			newEditFilter.IncludeInactive = this.IncludeInactive;
			newEditFilter.IncludeState = this.IncludeState;
			newEditFilter.IncludeCity = this.IncludeCity;
			newEditFilter.IncludeGuarid = this.IncludeGuarid;
			newEditFilter.IncludeGuarrel = this.IncludeGuarrel;
			newEditFilter.IncludeInsrel = this.IncludeInsrel;
			newEditFilter.IncludeInsuredid = this.IncludeInsuredid;
			newEditFilter.IncludeConadr1 = this.IncludeConadr1;
			newEditFilter.IncludeConadr2 = this.IncludeConadr2;
			newEditFilter.IncludeConadr3 = this.IncludeConadr3;
			newEditFilter.IncludeConadr4 = this.IncludeConadr4;
			newEditFilter.IncludeContel = this.IncludeContel;
			newEditFilter.IncludeMotherid = this.IncludeMotherid;
			newEditFilter.IncludeContractpc = this.IncludeContractpc;
			newEditFilter.IncludeArea = this.IncludeArea;
			newEditFilter.IncludeWhenentered = this.IncludeWhenentered;
			newEditFilter.IncludeWhenupdated = this.IncludeWhenupdated;
			newEditFilter.IncludeNhsnfmtver = this.IncludeNhsnfmtver;
			newEditFilter.IncludeNhsnfmt = this.IncludeNhsnfmt;
			newEditFilter.IncludeNhsnfmtvflag = this.IncludeNhsnfmtvflag;
			newEditFilter.IncludeNhsnver = this.IncludeNhsnver;
			newEditFilter.IncludeCapfnm1 = this.IncludeCapfnm1;
			newEditFilter.IncludeCflcomm = this.IncludeCflcomm;
			newEditFilter.IncludeWebadt = this.IncludeWebadt;
			newEditFilter.IncludeDelpatact = this.IncludeDelpatact;
			
			return newEditFilter;
		}
	}
}
