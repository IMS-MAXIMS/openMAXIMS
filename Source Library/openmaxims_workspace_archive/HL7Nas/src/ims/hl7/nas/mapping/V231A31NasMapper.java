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

public class V231A31NasMapper extends V231NasMapper
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
		hospNum = new Integer(getPatientPkeyV231(msg)).toString(); 
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
			//transVal = this.getCodeTranslation("ETHC", codeVal).getId();
			nm.addPair("ETHC", codeVal);
		}
		
		//RELG		
		if ((codeVal = pid.getReligion().getIdentifier().getValue()) != null)
		{
			//transVal = this.getCodeTranslation("RELG", codeVal).getId();
			nm.addPair("RELG", codeVal);
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
			//transVal = this.getCodeTranslation("NAMET", codeVal).getId();
			nm.addPair("NMTYPE", codeVal);
		}
		
		//DOB
		nm.addPair("DOB", pid.getDateTimeOfBirth().getTimeOfAnEvent().getValue());
		
		//DOD
		nm.addPair("DOD", pid.getPatientDeathDateAndTime().getTimeOfAnEvent().getValue());
		
		if (action.equals("INSERT"))
		{
			nm.addPair("RGDT", new Date().toString(DateFormat.ISO));			
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
		String nTel = pid.getPhoneNumberHome(0).getAnyText().getValue();
		String dTel = pid.getPhoneNumberBusiness(0).getAnyText().getValue();
		nm.addPair("NTEL", nTel);
		nm.addPair("DTEL", dTel);
		
		return nm;
	}
	
}
