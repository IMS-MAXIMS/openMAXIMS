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
import ims.hl7.nas.HL7NasApplication;
import ims.hl7.utils.SegName;
import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.TS;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.PV1;

public class A08NasMapper extends NasMapper {

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
		boolean currentInpatient = false;
		
		
		ImsNasMsg nmInp = new ImsNasMsg();
		ImsNasMsg nmEPG = new ImsNasMsg();
		
		Integer pkey = null;
		if ((pkey = getPatientPkey(msg)) == null)
		{
			throw new HL7Exception("Unable to match patient");
		}
		
		//EVN
		EVN evn = (EVN) msg.get(SegName.EVN);
		/* field 1 */
		if (!evn.getEventTypeCode().getValue().equalsIgnoreCase("A08"))
		{
			throw new HL7Exception("Unexpected Event Type Code for this message type");
		}
		
		/* field 2 */
		
		tmpVal = evn.getRecordedDateTime().getTimeOfAnEvent().getValue();
		if (tmpVal == null || tmpVal.equals(""))
			throw new HL7Exception("EVN.02 - Recorded Date/Time is a required field");

		//use for ADDT and ADTM if pv1.44 is empty
		Date tmpDate = new DateTime(tmpVal).getDate();
		Time tmpTime  = new DateTime(tmpVal).getTime();

		//PV1
		PV1 pv1 = (PV1) msg.get(SegName.PV1);
		/* field 1 */
		
		/* field 2 */
		tmpVal = pv1.getPatientClass().getValue();
		
		/*if (tmpVal == null || tmpVal.equals(""))
		{
			throw new HL7Exception("PV1.2 Unexpected patient class value");
		}else if (tmpVal.equalsIgnoreCase("I"))*/
		if (super.checkPatientClass(msg,"") == INPATIENT)
		{
			
			scep = getVisitNumberFromPV1(pv1);
			
			currentInpatient = isCurrentInpatient(scep, pkey);
			
			nmEPG.addPair("*SERVICE", "EPG");
			nmEPG.addPair("ACTION", "GETFORUPD");
			nmEPG.addPair("EPID", scep);
			nmEPG.addPair("PKEY", pkey.toString());
			nmEPG.addPair("*SERVICE", "EPG");
			nmEPG.addPair("ACTION", "UPDATE");
			
			if (currentInpatient)
			{
				nmInp.addPair("*SERVICE", "INP");
				nmInp.addPair("ACTION", "GETFORUPD");
				nmInp.addPair("EPID", scep);
				nmInp.addPair("PKEY", pkey.toString());
				
				nmInp.addPair("*SERVICE", "INP");
				nmInp.addPair("ACTION", "UPDATE");
			}
			/*else
			{
				nmEPG.addPair("*SERVICE", "EPG");
				nmEPG.addPair("ACTION", "UPDATE");
			}*/
		}else if (super.checkPatientClass(msg,"") == OUTPATIENT)
		{
			NasMapper mapper = HL7NasApplication.getNasMapper("A05");
			if (mapper == null)
			{
				throw new Exception("A08 mapper requires A05 mapper for Outpatients. A05 mapper not found in list of registerd mappers.");			
			}
			mapper.setConnection(conn);
			return mapper.translate(msg);

		}else
		{
			throw new HL7Exception("PV1.2 Unexpected patient class value");
		}
		
		/*nmGet.addPair("ACTION", "GETFORUPD");
		nmGet.addPair("EPID", scep);
		nmGet.addPair("PKEY", pkey.toString());
		
		nmEPGGet.addPair("ACTION", "GETFORUPD");
		nmEPGGet.addPair("EPID", scep);
		nmEPGGet.addPair("PKEY", pkey.toString());

		nmUpd.addPair("ACTION", "UPDATE");
		nmUpd.addPair("EPID",scep);
		nmUpd.addPair("PKEY", pkey.toString());
		
		nmEPGUpd.addPair("ACTION", "UPDATE");
		nmEPGUpd.addPair("EPID",scep);
		nmEPGUpd.addPair("PKEY", pkey.toString());*/

		
		/* field 3 */
		codeVal = pv1.getAssignedPatientLocation().getPointOfCare().getValue();
		if (codeVal != null && codeVal.length() > 0)
		{
			transVal = this.getCodeTranslation("LOCNME", codeVal).getId();
			nmInp.addPair("WARD",transVal); 			
			nmEPG.addPair("WARD",transVal);
		}
		else
		{
			nmInp.addPair("WARD",""); 			
			nmEPG.addPair("WARD","");
		}
		
		/* field 4 */
		//LKT_TYP(750) LKT_NAME(ADMT) - LKUP_EXTERN
		codeVal = pv1.getAdmissionType().getValue();
		if (codeVal != null && codeVal.length() > 0)
		{
			transVal = this.getCodeTranslation("ADMT", codeVal).getId();
			nmInp.addPair("ADMT",transVal); 			
			nmEPG.addPair("ADMT",transVal);
		}
		else
		{
			nmInp.addPair("ADMT",""); 			
			nmEPG.addPair("ADMT","");
		}
		
		/* field 5 */
		/* field 6 */
		/* field 7 */
		tmpVal = pv1.getAttendingDoctor(0).getIDNumber().getValue();
		if (tmpVal != null && tmpVal.length() > 0)
		{
			intTmpVal = getResourceByNationalCode(tmpVal,"MOS");
			
			if (intTmpVal < 0)
				throw new HL7Exception("PV1.07 - Attending Doctor cannot be mapped");
			
			nmInp.addPair("CONS",Integer.toString(intTmpVal));			
			nmEPG.addPair("CONS",Integer.toString(intTmpVal));
		}
		else
		{			
			nmInp.addPair("CONS","");
			nmEPG.addPair("CONS","");
		}
		
		/* field 8 */
		tmpVal = pv1.getReferringDoctor(0).getIDNumber().getValue();
		if (tmpVal == null || tmpVal.equals(""))
			throw new HL7Exception("PV1.08 - Referring Doctor is a required field");
		
		intTmpVal = getResourceByNationalCode(tmpVal,"MOS");
		
		if (intTmpVal <= 0)
			throw new HL7Exception("PV1.08 - Referring Doctor cannot be mapped");
		
		nmInp.addPair("REFR",Integer.toString(intTmpVal));		
		nmEPG.addPair("REFR",Integer.toString(intTmpVal));
		
		/* field 9 */
		
		/* field 10 */
		//LKT_TYP(789) LKT_NAME(SSC) - LKUP_EXTERN
		codeVal = pv1.getHospitalService().getValue();
		if (codeVal != null && codeVal.length() > 0)
		{
			transVal = this.getCodeTranslation("SSC", codeVal).getId();
			nmInp.addPair("SPCD",transVal);			
			nmEPG.addPair("SPCD",transVal);
		}
		else
		{
			nmInp.addPair("SPCD","");			
			nmEPG.addPair("SPCD","");
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
			nmInp.addPair("ADSC",transVal);			
			nmEPG.addPair("ADSC",transVal);
		}
		else
		{
			nmInp.addPair("ADSC","");			
			nmEPG.addPair("ADSC","");
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
				String s = nmInp.getPairVal("CONS");
				if (s != null && s.length() > 0)
				{
					intTmpVal = Integer.parseInt(s);
					if (intTmpVal < 0)			
						throw new HL7Exception("PV1.17 - Admitting Doctor cannot be mapped");
				}
				else
				{
					nmInp.addPair("ADHP","");					
					nmEPG.addPair("ADHP","");					
				}
			}
			
			
		}
		

		nmInp.addPair("ADHP",Integer.toString(intTmpVal));		
		nmEPG.addPair("ADHP",Integer.toString(intTmpVal));
		
		/* field 18 */			
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
		//LKT_TYP(756) LKT_NAME(DSDS) - LKUP_EXTERN
		codeVal = pv1.getDischargeDisposition().getValue();
		if (codeVal != null && codeVal.length() > 0)
		{
			transVal = this.getCodeTranslation("DSMT", codeVal).getId();
			nmInp.addPair("DSMT",transVal);
			nmEPG.addPair("DSMT",transVal);
		}
		else
		{
			nmInp.addPair("DSMT","");			
			nmEPG.addPair("DSMT","");
		}
		
		/* field 37 */
		//LKT_TYP(757) LKT_NAME(DSGD) - LKUP_EXTERN
		codeVal = pv1.getDischargedToLocation().getDischargeLocation().getValue();
		if (codeVal != null && codeVal.length() > 0)
		{		
			transVal = this.getCodeTranslation("DSDS", codeVal).getId();		
			nmInp.addPair("DSDS",transVal);			
			nmEPG.addPair("DSDS",transVal);
		}
		else
		{
			nmInp.addPair("DSDS","");			
			nmEPG.addPair("DSDS","");
		}
		
		/* field 38 */
		/* field 39 */
		/* field 40 */
		/* field 41 */
		/* field 42 */
		/* field 43 */
		
		/* field 44 */
		tmpVal = pv1.getAdmitDateTime().getTimeOfAnEvent().getValue();
		if (tmpVal != null && !tmpVal.equals(""))
		{
			tmpDate = new DateTime(tmpVal).getDate();
			tmpTime  = new DateTime(tmpVal).getTime();
		}
		//PV1.44 empty use EVN.2
		nmInp.addPair("ADDT", tmpDate.toString(DateFormat.ISO));
		nmInp.addPair("ADTM", tmpTime.toString(TimeFormat.FLAT6));
		
		nmEPG.addPair("ADDT", tmpDate.toString(DateFormat.ISO));
		nmEPG.addPair("ADTM", tmpTime.toString(TimeFormat.FLAT6));
		
		
		/* field 45 */
		//Update the discharge Date/Time in the epg
		if (!currentInpatient)
		{
			//EPEN
			tmpVal = "";
			TS[] tsDischargeDateTime = pv1.getDischargeDateTime();
			if (tsDischargeDateTime != null)
			{
				if (tsDischargeDateTime.length > 0)
				{
					tmpVal = tsDischargeDateTime[0].getTimeOfAnEvent().getValue();
					if (tmpVal != null && !tmpVal.equals(""))
					{
						tmpVal = new DateTime(tmpVal).getDate().toString(DateFormat.ISO);
					}					
				}									
			}
			
			//nmInp.addPair("EPEN", tmpVal);			
			nmEPG.addPair("EPEN", tmpVal);
			
			return nmEPG;
		}
		else
		{
			nmEPG.addPair("EPEN", tmpVal);
			nmInp.append(nmEPG); //4 messages
			return nmInp;			
		}
		
	}
}
