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
import ims.framework.utils.Time;
import ims.framework.utils.TimeFormat;
import ims.hl7.utils.SegName;
import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.PV1;

public class A01NasMapper extends NasMapper
{

	public ImsNasMsg translate(Message msg) throws Exception 
	{
		if (conn == null) 
		{
			throw new Exception("Cannot operate without connection to NAS Server.");
		}
		
		String tmpVal = null;
		String codeVal = null;
		String transVal = null;
		String scep = null;
		int intTmpVal = 0;
		
		ImsNasMsg nm = new ImsNasMsg();
		
		Integer pkey = null;
		if ((pkey = getPatientPkey(msg)) != null)
		{
			nm.addPair("*SERVICE", "ADT");
			nm.addPair("ACTION", "ADMIT");
			nm.addPair("PKEY", pkey.toString());					
			
			//EVN
			EVN evn = (EVN) msg.get(SegName.EVN);
			/* field 1 */
			if (!evn.getEventTypeCode().getValue().equalsIgnoreCase("A01"))
			{
				throw new HL7Exception("Unexpected Event Type Code for this message type");
			}
			
			/* field 2 */
			String strTmpDateTime = null;
			strTmpDateTime = evn.getRecordedDateTime().getTimeOfAnEvent().getValue();
			if (strTmpDateTime == null || strTmpDateTime.equals(""))
				throw new HL7Exception("EVN.02 - Recorded Date/Time is a required field");
			
			//use for ADDT and ADTM if pv1.44 is empty
			Date tmpDate = new DateTime(strTmpDateTime).getDate();
			Time tmpTime  = new DateTime(strTmpDateTime).getTime();
					
			//PV1
			PV1 pv1 = (PV1) msg.get(SegName.PV1);
			scep = getVisitNumberFromPV1(pv1);
			/* field 1 */
			
			/* field 2 */
			/*
			tmpVal = pv1.getPatientClass().getValue();
			if (tmpVal == null || !tmpVal.equalsIgnoreCase("I"))
			{
				throw new HL7Exception("PV1.2 Unexpected patient class value, expected \"I\"");
			}*/

			if (super.checkPatientClass(msg,scep) != INPATIENT)
				throw new HL7Exception("PV1.2 Unexpected patient class value");
			
			/* field 3 */
			codeVal = pv1.getAssignedPatientLocation().getPointOfCare().getValue();
			if (codeVal != null && codeVal.length() > 0 )
			{
				transVal = this.getCodeTranslation("LOCNME", codeVal).getId();
				if (transVal != null && transVal.length() > 0)
					nm.addPair("WARD",transVal);
				else
					throw new HL7Exception("PV1.3 Assigned Patient Location could not be mapped");
			}
			else
			{
				throw new HL7Exception("PV1.3 Assigned Patient Location cannot be blank");
			}
			
			/* field 4 */
			//LKT_TYP(750) LKT_NAME(ADMT) - LKUP_EXTERN
			codeVal = pv1.getAdmissionType().getValue();
			if (codeVal != null && codeVal.length() > 0)
			{
				transVal = this.getCodeTranslation("ADMT", codeVal).getId();
				nm.addPair("ADMT",transVal); 
			}
			else
			{
				throw new HL7Exception("PV1.10 Hospital Service cannot be blank");
			}
			
			/* field 5 */
			/* field 6 */
			/* field 7 */
			tmpVal = pv1.getAttendingDoctor(0).getIDNumber().getValue();
			if (tmpVal == null || tmpVal.equals(""))			
				throw new HL7Exception("PV1.07 - Attending Doctor is a required field");
			
			intTmpVal = getResourceByNationalCode(tmpVal,"MOS");
			if (intTmpVal < 0)
				throw new HL7Exception("PV1.07 - Attending Doctor cannot be mapped");
			else
				nm.addPair("CONS",Integer.toString(intTmpVal));

			
			/* field 8 */
			tmpVal = pv1.getReferringDoctor(0).getIDNumber().getValue();
			if (tmpVal == null || tmpVal.equals(""))
				throw new HL7Exception("PV1.08 - Referring Doctor is a required field");
			intTmpVal = getResourceByNationalCode(tmpVal,"MOS");
			if (intTmpVal <= 0)
				throw new HL7Exception("PV1.08 - Referring Doctor cannot be mapped");
			else
				nm.addPair("REFR",Integer.toString(intTmpVal));
			
			/* field 9 */
			
			/* field 10 */
			//LKT_TYP(789) LKT_NAME(SSC) - LKUP_EXTERN
			codeVal = pv1.getHospitalService().getValue();
			if (codeVal != null && codeVal.length() > 0)
			{
				transVal = this.getCodeTranslation("SSC", codeVal).getId();
				nm.addPair("SPCD",transVal);
			}
			else
			{
				throw new HL7Exception("PV1.10 Hospital Service cannot be blank");
			}
				
			/* field 11 */
			/* field 12 */
			/* field 13 */
			
			/* field 14 */
			//LKT_TYP(751) LKT_NAME(ADSC) - LKUP_EXTERN
			codeVal = pv1.getAdmitSource().getValue();
			if (codeVal != null && codeVal.length() > 0)
			{
				transVal = this.getCodeTranslation("ADSC", codeVal).getId();
				nm.addPair("ADSC",transVal);
			}
			else
			{
				throw new HL7Exception("PV1.14 Admit Source cannot be blank");
			}
			
			/* field 16 */
			
			/* field 17 */
			//Try and map with the national code else try the local pas code in second rep
			intTmpVal = -1;
			tmpVal = pv1.getAdmittingDoctor(0).getIDNumber().getValue();
			if (tmpVal != null && !tmpVal.equals(""))
			{
				intTmpVal = getResourceByNationalCode(tmpVal,"MOS");
			}else
			{
				tmpVal = pv1.getAdmittingDoctor(1).getIDNumber().getValue();
				if (tmpVal != null && !tmpVal.equals(""))
				{
					intTmpVal = getResourceBySrccType(tmpVal,"MOS");
				}else
				{
					//if no value supplied in rep 0 or 1 set it to the attending doctor value
					intTmpVal = Integer.parseInt(nm.getPairVal("CONS"));
				}
			}
			if (intTmpVal < 0)
				throw new HL7Exception("PV1.17 - Admitting Doctor cannot be mapped");
			else
				nm.addPair("ADHP",Integer.toString(intTmpVal));
			
			nm.addPair("EPSD",scep);
			
			/* field 20 */
			/* field 21 */
			/* field 22 */
			/* field 23 */
			/* field 24 */
			/* field 25 */
			/* field 26 */
			/* field 27 */
			/* field 28 */
			/* field 29 */
			/* field 30 */
			/* field 31 */
			/* field 32 */
			/* field 33 */
			/* field 34 */
			/* field 35 */
			
			/* field 36 */
			
			//MAXGEN-435 - back out changes making PV1.36 and 37 mandatory, site request.
			
			//LKT_TYP(756) LKT_NAME(DSDS) - LKUP_EXTERN
			codeVal = pv1.getDischargeDisposition().getValue();
			if (codeVal != null && codeVal.length() > 0)
			{						
				transVal = this.getCodeTranslation("DSMT", codeVal).getId();
				nm.addPair("DSMT",transVal);
			}			
				
			
			/* field 37 */
			//LKT_TYP(757) LKT_NAME(DSGD) - LKUP_EXTERN
			codeVal = pv1.getDischargedToLocation().getDischargeLocation().getValue();
			if (codeVal != null && codeVal.length() > 0)
			{						
				transVal = this.getCodeTranslation("DSDS", codeVal).getId();		
				nm.addPair("DSDS",transVal);
			}
			/* field 38 */
			/* field 39 */
			/* field 40 */
			/* field 41 */
			/* field 42 */
			/* field 43 */
			
			/* field 44 */
			strTmpDateTime = pv1.getAdmitDateTime().getTimeOfAnEvent().getValue();
			if (strTmpDateTime != null && !strTmpDateTime.equals(""))
			{
				tmpDate = new DateTime(strTmpDateTime).getDate();
				tmpTime  = new DateTime(strTmpDateTime).getTime();
			}
			//PV1.44 empty use EVN.2
			nm.addPair("ADDT", tmpDate.toString(DateFormat.ISO));
			nm.addPair("ADTM", tmpTime.toString(TimeFormat.FLAT6));
			
			/* field 45 */
			//Discharge Date/Time ignore on admission
			
		}else
		{
			throw new HL7Exception("Unable to match patient");
		}
		
		return nm;
	}	
}
