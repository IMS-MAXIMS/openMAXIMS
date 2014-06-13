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
import ims.hl7.utils.SegName;
import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v231.datatype.CX;
import ca.uhn.hl7v2.model.v231.datatype.ST;
import ca.uhn.hl7v2.model.v231.datatype.XAD;
import ca.uhn.hl7v2.model.v231.datatype.XPN;
import ca.uhn.hl7v2.model.v231.segment.PID;

public class V231A08NasMapper extends V231NasMapper
{

	public ImsNasMsg translate(Message msg) throws Exception
	{
		if (conn == null) 
		{
			throw new Exception("Cannot operate without connection to NAS Server.");
		}
		ImsNasMsg updNm = null;
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "PATIENT");
		
		String action = "INSERT";
		String hospNum = "";
		hospNum = new Integer(getPatientPkey(msg)).toString(); 
		if (hospNum != null && hospNum.length() != 0)
		{
			updNm = new ImsNasMsg();
			
			updNm.addPair("*SERVICE", "PATIENT");
			updNm.addPair("ACTION", "GET");
			updNm.addPair("HOSPNUM", hospNum);

			//nm = updNm; 
			action = "UPDATE";			
			nm.addPair("HOSPNUM", hospNum);			
		}
		else
			nm.addPair("HOSPNUM", "");
		
		nm.addPair("ACTION", action);
		
		PID pid = (PID) msg.get(SegName.PID);
		
		String codeVal = null;
		String transVal = null;
		
		//MART
		if ((codeVal = pid.getMaritalStatus().getIdentifier().getValue()) != null)				
		{
			transVal = this.getCodeTranslation("MART", codeVal).getId();
			nm.addPair("MART", transVal);
		}		
		
		//ETHC
		if ((codeVal = pid.getEthnicGroup(0).getIdentifier().getValue()) != null)
		{
			transVal = this.getCodeTranslation("ETHC", codeVal).getId();
			nm.addPair("ETHC", transVal);
		}
		
		//RELG		
		if ((codeVal = pid.getReligion().getIdentifier().getValue()) != null)
		{
			transVal = this.getCodeTranslation("RELG", codeVal).getId();
			nm.addPair("RELG", transVal);
		}
		
		//SEX
		if ((codeVal = pid.getSex().getValue()) != null)
		{			
			nm.addPair("PAS_SEX", codeVal);
		}
		
		XPN name = pid.getPatientName(0);
		if (name == null)
		{
			 throw new HL7Exception("There must be at least one name in PID.05");
		}
		ST snm = name.getFamilyLastName().getFamilyName(); 
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
			nm.addPair("FNM1", fnm.getValue());
			nm.addPair("UPPFNM", fnm.getValue().toUpperCase());
		}
		
		//nm.addPair("FNM2", name.		
		nm.addPair("TITLTXT", name.getPrefixEgDR().getValue());
		
		if ((codeVal = name.getNameTypeCode().getValue()) != null)
		{
			transVal = this.getCodeTranslation("NAMET", codeVal).getId();
			nm.addPair("NMTYPE", transVal);
		}
		
		//DOB
		nm.addPair("DOB", pid.getDateTimeOfBirth().getTimeOfAnEvent().getValue());
		
		//DOD
		nm.addPair("DOD", pid.getPatientDeathDateAndTime().getTimeOfAnEvent().getValue());
		
		if (action.equals("INSERT"))
		{
			nm.addPair("RGDT", new Date().toString(DateFormat.ISO));			
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
				localIdType = "HOISPNUM";
				/*this.getCodeTranslation("PID",idType).getId();
				if (localIdType == null)
				{
					throw new HL7Exception("Lookup Mapping for Primary Patient ID Type not available : " + cfg.getPrimaryPatidType());
				}
				if (updNm == null)
				{
					nm.addPair("OIDTYPE", localIdType);
					nm.addPair("OIDVAL", idVal);
				}*/
			}
			if (idType.equals(cfg.getHospnumIdtypeCode()))
			{
				nm.addPair("HOSPNUM", idVal);				
			}
			else if (idType.equals(cfg.getNhsnIdtypeCode()))
			{
				nm.addPair("NHSN", idVal);				
			}
		}						

		XAD address = pid.getPatientAddress(0);
		if (address != null)
		{
			nm.addPair("ADR1", address.getStreetAddress().getValue());				
			nm.addPair("ADR2", address.getOtherDesignation().getValue());				
			nm.addPair("ADR3", address.getCity().getValue());				
			nm.addPair("ADR4", address.getStateOrProvince().getValue());
			nm.addPair("POST", address.getZipOrPostalCode().getValue());
		}		
		nm.addPair("NTEL", pid.getPhoneNumberHome(0).getAnyText().getValue());
		nm.addPair("DTEL", pid.getPhoneNumberBusiness(0).getAnyText().getValue());
		
		// Patient's GP and Surgery
		/*
		PD1 pd1 = (PD1) msg.get(SegName.PD1);		
		
		String tmpVal = "";
		int intTmpVal;
		//gp code first
		//Don't know yet what's happening with Kodak and this kind of stuff
		
		if (pd1.getPatientPrimaryCareProviderNameIDNo() != null)
		{
			tmpVal = pd1.getPatientPrimaryCareProviderNameIDNo(0).getIDNumber().getValue();
			if (tmpVal != null && tmpVal.length() > 0)
			{			
				intTmpVal = this.getResourceByNationalCode(tmpVal,"MOS");
				if (intTmpVal <= 0)
					throw new HL7Exception("PD1.04 - Doctor's code cannot be mapped");
				else
					nm.addPair("GPCD",Integer.toString(intTmpVal));
			}
		}
		
		nm.addPair("LPDSTAT", "1");
		if (updNm != null)
		{
			updNm.append(nm);
			updNm.append(getIDUpdateMsg(msg,pkey.toString()));
			return updNm;
		}
		else	
			return nm;*/
		return nm;
	}
	
}
