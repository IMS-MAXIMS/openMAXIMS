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
package ims.hl7.nas.mapping;


import ims.framework.utils.Date;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;
import ims.framework.utils.Time;
import ims.framework.utils.TimeFormat;
import ims.hl7.utils.SegName;
import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.CX;
import ca.uhn.hl7v2.model.v24.datatype.FN;
import ca.uhn.hl7v2.model.v24.datatype.ST;
import ca.uhn.hl7v2.model.v24.datatype.XAD;
import ca.uhn.hl7v2.model.v24.datatype.XPN;
import ca.uhn.hl7v2.model.v24.segment.NK1;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PID;


public class A28NasMapper extends NasMapper
{
	public ImsNasMsg translate(Message msg) throws Exception
	{
		//getMAXIMSRis() this config flag denotes that we're using the RAD_IRL dbm section of patient, rather than the PAS EPM, or CORE.
		
		if (conn == null) 
		{
			throw new Exception("Cannot operate without connection to NAS Server.");
		}
		ImsNasMsg updNm = null;
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "PATIENT");
		
		String action = "INSERT";
		Integer pkey = null;
		
		if (cfg.getMAXIMSRis())
		{
			if ((pkey = getXRAYPatient((PID)msg.get("PID"))) != null)
			{
				updNm = new ImsNasMsg();				
				updNm.addPair("*SERVICE", "PATIENT");
				updNm.addPair("ACTION", "GET");
				updNm.addPair("XRAYNUM", pkey.toString());
				action = "UPDATE";
				nm.addPair("XRAYNUM", pkey.toString());
			}
		}
		else if ((pkey = getPatientPkey(msg)) != null)				
		{
			updNm = new ImsNasMsg();
			updNm.addPair("*SERVICE", "PATIENT");
			updNm.addPair("ACTION", "GET");
			updNm.addPair("PKEY", pkey.toString());				
			//nm = updNm; 
			action = "UPDATE";				
			nm.addPair("PKEY", pkey.toString());		
		}
		
		nm.addPair("ACTION", action);
		nm.addPair("INACTIVE", "0");
		
		PID pid = (PID) msg.get(SegName.PID);		
		
		String codeVal = null;
		String transVal = null;
		
		//Coombe (Maternity Hospital) use Mother's ID		
		nm.addPair("MOTHERID", pid.getMotherSIdentifier(0).getID().getValue());		 
		
		//MART
		if ((codeVal = pid.getMaritalStatus().getIdentifier().getValue()) != null)				
		{
			transVal = this.getCodeTranslation("MART", codeVal).getId();
			nm.addPair("MART", transVal);
		}		
		else
			nm.addPair("MART", "0");
		
		//ETHC
		if ((codeVal = pid.getEthnicGroup(0).getIdentifier().getValue()) != null)
		{
			transVal = this.getCodeTranslation("ETHC", codeVal).getId();
			nm.addPair("ETHC", transVal);
		}
		else
			nm.addPair("ETHC", "0");
		//RELG		
		if ((codeVal = pid.getReligion().getIdentifier().getValue()) != null)
		{
			transVal = this.getCodeTranslation("RELG", codeVal).getId();
			nm.addPair("RELG", transVal);
		}
		else
			nm.addPair("RELG", "0");
		
		//SEX
		if ((codeVal = pid.getAdministrativeSex().getValue()) != null)
		{
			transVal = this.getCodeTranslation("SEX", codeVal).getId();
			nm.addPair("SEX", transVal);
		}
		else
			nm.addPair("SEX", "0");
		
		XPN name = pid.getPatientName(0);
		if (name == null)
		{
			 throw new HL7Exception("There must be at least one name in PID.05");
		}
		ST snm = name.getFamilyName().getSurname(); 
		if (snm != null && snm.getValue() != null && snm.getValue().length() > 0)
		{
			nm.addPair("SNM", snm.getValue());
			nm.addPair("UPPSNM", snm.getValue().toUpperCase());
		}
		else
			throw new HL7Exception("Patient Surname (PV1.5) cannot be blank");
		
		ST fnm = name.getGivenName();
		if (fnm != null && fnm.getValue() != null)
		{
			//WDEV-4141 - append additional forenames to forename
			if (cfg.getMAXIMSRis())
			{				
				StringBuffer risFnm = new StringBuffer();
				risFnm.append(fnm.getValue());
				
				if (name.getSecondAndFurtherGivenNamesOrInitialsThereof() != null  && name.getSecondAndFurtherGivenNamesOrInitialsThereof().getValue() != null)
				{					
					risFnm.append(" ");
					risFnm.append(name.getSecondAndFurtherGivenNamesOrInitialsThereof().getValue());
				}
				nm.addPair("FNM1", risFnm.toString());					
			}
			else
			{
				nm.addPair("FNM1", fnm.getValue());
				nm.addPair("UPPFNM", fnm.getValue().toUpperCase());
			}
		}
		
		nm.addPair("FNM2", name.getSecondAndFurtherGivenNamesOrInitialsThereof().getValue());		
		nm.addPair("TITLTXT", name.getPrefixEgDR().getValue());
		
		if ((codeVal = name.getNameTypeCode().getValue()) != null)
		{
			transVal = this.getCodeTranslation("NAMET", codeVal).getId();
			nm.addPair("NMTYPE", transVal);
		}
		
		//DOB
		nm.addPair("DOB", pid.getDateTimeOfBirth().getTimeOfAnEvent().getValue());
		//nm.addPair("DOB", new Date(pid.getDateTimeOfBirth().getTimeOfAnEvent().getValue()).toString(DateFormat.ISO));
		
		
		//DOD
		nm.addPair("DOD", pid.getPatientDeathDateAndTime().getTimeOfAnEvent().getValue());
		
		if (action.equals("INSERT"))
		{
			nm.addPair("RGDT", new Date().toString(DateFormat.ISO));			
		}
		
		//WDEV-4139
		if (cfg.getMAXIMSRis())
		{
			if (action.equals("INSERT"))
				nm.addPair("WHENENTERED", new DateTime().toString(DateTimeFormat.ISO_SECS));
			else			
				nm.addPair("WHENUPDATED", new DateTime().toString(DateTimeFormat.ISO_SECS));			
		}
		
		CX[] idList = pid.getPatientIdentifierList();
		int i;
		for (i = 0; i < idList.length; i++)
		{
			String idVal = null;
			String localIdType = null;

			String idType = idList[i].getIdentifierTypeCode().getValue();
			if (cfg.getIdentifierTypeComponent().equals("C4"))
			{
				idType = idList[i].getAssigningAuthority().getNamespaceID().getValue();
			}
			
			idVal = idList[i].getID().getValue();
			if (idType.equals(cfg.getPrimaryPatidType()))
			{
				if (cfg.getMAXIMSRis())
				{
					nm.addPair("PAS_PKEY", idVal);	
					//MAXGEN-194
					nm.addPair("CHARTNUM", idVal);
				}
				else
				{
					localIdType = this.getCodeTranslation("PID",idType).getId();
					if (localIdType == null)
					{
						throw new HL7Exception("Lookup Mapping for Primary Patient ID Type not available : " + cfg.getPrimaryPatidType());
					}
					if (updNm == null)
					{
						nm.addPair("OIDTYPE", localIdType);
						nm.addPair("OIDVAL", idVal);
					}
					/*else
					{
						updNm.addPair("OIDTYPE", localIdType);
						updNm.addPair("OIDVAL", idVal);
					}*/
					if (idType.equals(cfg.getHospnumIdtypeCode()))
					{
						nm.addPair("HOSPNUM", idVal);				
					}										
					else if (idType.equals(cfg.getNhsnIdtypeCode()))
					{
						nm.addPair("NHSN", idVal);				
					}
					else //ensure copying of primary id to HOSPNUM
						nm.addPair("HOSPNUM", idVal);
				}
			}			
		}
		
		XAD address = pid.getPatientAddress(0);
		if (address != null)
		{
			nm.addPair("ADR1", address.getStreetAddress().getStreetOrMailingAddress().getValue());				
			nm.addPair("ADR2", address.getOtherDesignation().getValue());				
			nm.addPair("ADR3", address.getCity().getValue());				
			nm.addPair("ADR4", address.getStateOrProvince().getValue());
			if (cfg.getMAXIMSRis())
			{
				nm.addPair("AREA", address.getZipOrPostalCode().getValue());
			}
			else
			{
				nm.addPair("POST", address.getZipOrPostalCode().getValue());
			}
		}		
		
		//Next of Kin 
		NK1 nk1 = (NK1)msg.get(SegName.NK1);
		nm.addPair("NAME", nk1.getNKName(0).getFamilyName().getSurname().getValue());
		nm.addPair("NKFNAM", nk1.getNKName(0).getGivenName().getValue());
		XAD nkaddress = nk1.getAddress(0);
		if (nkaddress != null)
		{
			nm.addPair("NADR1", nkaddress.getStreetAddress().getStreetOrMailingAddress().getValue());				
			nm.addPair("NADR2", nkaddress.getOtherDesignation().getValue());				
			nm.addPair("NADR3", nkaddress.getCity().getValue());				
			nm.addPair("NADR4", nkaddress.getStateOrProvince().getValue());
			nm.addPair("NPOST", nkaddress.getZipOrPostalCode().getValue());
		}		
		nm.addPair("NNTEL", nk1.getPhoneNumber(0).getAnyText().getValue());
		nm.addPair("NDTEL", nk1.getBusinessPhoneNumber(0).getAnyText().getValue());
		
		if ((codeVal = nk1.getRelationship().getIdentifier().getValue()) != null)
		{
			transVal = this.getCodeTranslation("NKREL", codeVal).getId();
			nm.addPair("REL", transVal);
		}
		else
			nm.addPair("RELTXT", codeVal);

		nm.addPair("NTEL", pid.getPhoneNumberHome(0).getAnyText().getValue());
		nm.addPair("DTEL", pid.getPhoneNumberBusiness(0).getAnyText().getValue());
		
		nm.addPair("STATE", "0");
		nm.addPair("CITY", "0");
		nm.addPair("GUARID", "0");
		nm.addPair("GUARREL", "0");
		nm.addPair("INSREL", "0");
		nm.addPair("INSUREDID", "0");

		
		// Patient's GP and Surgery
		PD1 pd1 = (PD1) msg.get(SegName.PD1);		
		
		String mosCode = "",practiceCode = "";
		int intTmpVal = 0;
		
		
		//gp code first		
		if (pd1.getPatientPrimaryCareProviderNameIDNo() != null)
		{
			mosCode = pd1.getPatientPrimaryCareProviderNameIDNo(0).getIDNumber().getValue();
			practiceCode = pd1.getPatientPrimaryFacility(0).getOrganizationName().getValue();
			if (mosCode != null && mosCode.length() > 0)
			{			
				if (cfg.getMAXIMSRis())
				{	
					int[] vals = this.getXRAYDoctorInfo(mosCode,practiceCode);
					if(vals != null){
						nm.addPair("GPCD",Integer.toString(vals[0]));
						nm.addPair("GPLOC",Integer.toString(vals[1]));
					}
					else
					{
						nm.addPair("GPCD","0");
						nm.addPair("GPLOC","0");
					}
					
				} 
				else
				{
					intTmpVal = this.getResourceByNationalCode(mosCode,"MOS");				
					if (intTmpVal <= 0)
						throw new HL7Exception("PD1.04 - Doctor's code cannot be mapped");
					else
						nm.addPair("GPCD",Integer.toString(intTmpVal));		
				}
			}
			else
			{
				nm.addPair("GPCD","0");
				nm.addPair("GPLOC","0");
			}
		}
		
		
		//now surgery
		/* but nothing useful done with it so leave for moment to save a few calls
		if (pd1.getPatientPrimaryFacility() != null)
		{
			tmpVal = pd1.getPatientPrimaryFacility(0).getOrganizationNameTypeCode().getValue();
			if (tmpVal == null || tmpVal.equals(""))
				throw new HL7Exception("PD1.03 - Doctor's surgery is a required field");
			
			intTmpVal = this.getOrganisationByOrgCode(tmpVal);
			if (intTmpVal <= 0)
				throw new HL7Exception("PD1.03 - Doctor's surgery cannot be mapped");
			else
				nm.addPair("PRCD",Integer.toString(intTmpVal));
		}*/
		
		
		nm.addPair("LPDSTAT", "1");
		if (updNm != null)
		{
			updNm.append(nm);
			updNm.append(getIDUpdateMsg(msg,pkey.toString()));
			return updNm;
		}
		else	
			return nm;
	}

	private ImsNasMsg getIDUpdateMsg(Message msg, String pkey) throws Exception
	{
		PID pid = (PID)msg.get("PID");
		CX[] idNewList = pid.getPatientIdentifierList();
		StringBuffer csvList = new StringBuffer();
		String hospNum = "", nhsn = "";
		
		for (int i = 0; i < idNewList.length; i++)
		{
		
			String idType = idNewList[i].getIdentifierTypeCode().getValue();
			if (cfg.getIdentifierTypeComponent().equals("C4"))
			{
				idType = idNewList[i].getAssigningAuthority().getNamespaceID().getValue();
			}
			
			String idVal = idNewList[i].getID().getValue();
			if (!idType.equals(cfg.getPrimaryPatidType())) //prevent updating primary id for the moment?
			{
				String localIdType = this.getCodeTranslation("PID",idType).getId();
				if (localIdType == null)
				{
					throw new HL7Exception("Lookup Mapping for Patient ID Type not available : " + idType);
				}			
				//check for HOSPNUM and NHSN
				if (idVal != null && localIdType.length() > 0 && idVal.length() > 0)
				{
					csvList.append(localIdType);
					csvList.append(",");
					csvList.append(idVal);
					if (i < idNewList.length - 1)
						csvList.append(",");
				}
				else
				{
					throw new HL7Exception("No new IDs supplied for update.");
				}
				if (idType.equals(cfg.getHospnumIdtypeCode()))
				{
					hospNum = idVal;
				}
				else if (idType.equals(cfg.getNhsnIdtypeCode()))
				{
					nhsn = idVal;
				}
			}			
		}
		
		ImsNasMsg nm = new ImsNasMsg();		
		nm.addPair("*SERVICE", "PATIENT");
		nm.addPair("ACTION", "UPDATE_IDS");		 
		nm.addPair("PKEY", pkey);
		nm.addPair("HOSPNUM", hospNum);
		nm.addPair("NHSN", nhsn);
		nm.addPair("ID_LIST", csvList.toString()); //comma seperated OIDTYPE,OIDVALS
		return nm;
		
	}
}
