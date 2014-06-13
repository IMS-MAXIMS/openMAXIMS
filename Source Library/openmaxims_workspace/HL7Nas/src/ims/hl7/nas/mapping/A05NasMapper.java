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

import ims.hl7.utils.SegName;
import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.PV1;

public class A05NasMapper extends NasMapper
{
	
	
	public ImsNasMsg translate(Message msg) throws Exception 
	{
		if (conn == null) 
		{
			throw new Exception("Cannot operate without connection to NAS Server.");
		}
		
		String tmpVal = "";
		int patientClass = -1;
		
		ImsNasMsg optNm = new ImsNasMsg();
		ImsNasMsg optGetNm = null;
		
		ImsNasMsg apdNm = new ImsNasMsg(); 		
		
		
		Integer pkey = null;
		if ((pkey = getPatientPkey(msg)) != null)
		{
			//EVN
			EVN evn = (EVN) msg.get(SegName.EVN);
			/* field 1 */
			if (!evn.getEventTypeCode().getValue().equalsIgnoreCase("A05") && !evn.getEventTypeCode().getValue().equalsIgnoreCase("A04") && !evn.getEventTypeCode().getValue().equalsIgnoreCase("A08"))
			{
				throw new HL7Exception("Unexpected Event Type Code for this message type");
			}
								
			//PV1			
			PV1 pv1 = (PV1)msg.get("PV1");		
			String scep = getVisitNumberFromPV1(pv1);
			if (scep == null || scep.length() == 0)
				throw new HL7Exception("PV1.19 VISIT ID must be supplied");
						
			if ( (patientClass = checkPatientClass(msg,scep)) != OUTPATIENT)			
				throw new HL7Exception("PV1.2 Unexpected patient class value or unable to determine patient status");			
			else if (patientClass == NONE)
			{}
			//Business rule will take care of this now
			/*if (super.isCurrentOutpatient(scep,pkey)) //update, A04 etc
			{
				optGetNm = new ImsNasMsg();
				optGetNm.addPair("*SERVICE", "OUTPATIENT");
				optGetNm.addPair("ACTION", "GETFORUPD"); 
				optGetNm.addPair("PKEY", pkey.toString());				
				//optGetNm.addPair("SCEP","");
				optGetNm.addPair("EPID",scep);
				//optGetNm.addPair("SCSQ","1");
				
				optNm.addPair("*SERVICE", "OUTPATIENT");
				optNm.addPair("ACTION", "UPDATE"); 
				optNm.addPair("PKEY", pkey.toString());				
				//optNm.addPair("SCEP","");
				optNm.addPair("EPID",scep);
				//optNm.addPair("SCSQ","1");
			}
			else //insert
			{*/
				optNm.addPair("*SERVICE", "OUTPATIENT");
				optNm.addPair("ACTION", "INSERT"); //OPT AND APD service inserts in BR (only APD if date less than today) 
				optNm.addPair("PKEY", pkey.toString());				
				//optNm.addPair("SCEP","");
				optNm.addPair("EPID",scep);
				//optNm.addPair("SCSQ","1");
			//}

			//no clinics in RCHT, but mandatory.
			int intTmpVal = getResourceBySrccType("CLIN","CLIN");
			//if (intTmpVal < 0)
			//	throw new HL7Exception("Error getting default clinic from RSF ");
			
			optNm.addPair("CLIN",Integer.toString(intTmpVal));
		
			String tstp = pv1.getAdmitDateTime().getTimeOfAnEvent().getValue();
			if (tstp == null || tstp.length() == 0 && patientClass != WAITLIST)
			{
				throw new HL7Exception("PV1.44 Admit date/time cannot be null ");
			}	
			else
			{
				optNm.addPair("DATE",getDateTime(tstp,DATE));
				optNm.addPair("TIME",getDateTime(tstp,TIME));
				apdNm.addPair("DATE",getDateTime(tstp,DATE));
				apdNm.addPair("TIME",getDateTime(tstp,TIME));
			}
			
			tmpVal = pv1.getAttendingDoctor(0).getIDNumber().getValue();
			if (tmpVal == null || tmpVal.equals(""))
				throw new HL7Exception("PV1.07 - Attending Doctor is a required field");
			intTmpVal = getResourceByNationalCode(tmpVal,"MOS");
			if (intTmpVal < 0)
				throw new HL7Exception("PV1.07 - Attending Doctor cannot be mapped");
			
			
			optNm.addPair("SCLN",Integer.toString(intTmpVal));
			
			//apdNm.addPair("SCLN",Integer.toString(intTmpVal));
		}else
		{
			throw new HL7Exception("Unable to match patient");
		}
		
		if (optGetNm != null)
		{
			optGetNm.append(optNm);
			return optGetNm;
		}
		return optNm;
		//apdNm.append(optNm);
		/*if (patientClass == OUTPATIENT  || patientClass == WAITLIST)		
			return optNm;
		else
		{
			inpNm.append(epgNm);
			return inpNm; 
		}*/
				
	}


}
