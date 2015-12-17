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

import ims.hl7.utils.SegName;
import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.PV1;

public class A03NasMapper extends NasMapper
{
	public ImsNasMsg translate(Message msg) throws Exception
	{
		if (conn == null) 
		{
			throw new Exception("Cannot operate without connection to NAS Server.");
		}
		
		String    tmpVal    = null;
		String    codeVal   = null;
		String    transVal  = null;
		
		ImsNasMsg nm = new ImsNasMsg();
		
		Integer pkey = null;
		if ((pkey = getPatientPkey(msg)) != null)
		{
			nm.addPair("*SERVICE", "ADT");
			nm.addPair("ACTION", "DISCHARGE");
			nm.addPair("PKEY", pkey.toString());

			//EVN
			EVN evn = (EVN) msg.get(SegName.EVN);
			/* field 1 */
			if (!evn.getEventTypeCode().getValue().equalsIgnoreCase("A03"))
				throw new HL7Exception("Unexpected Event Type Code for this message type");
			
			/* field 2 */
			tmpVal = evn.getRecordedDateTime().getTimeOfAnEvent().getValue();
			if (tmpVal == null || tmpVal.equals(""))
				throw new HL7Exception("EVN.02 - Recorded Date/Time is a required field");
			
			//use for Discharge date and time if pv1.45 is empty
			Date tmpDate = new DateTime(tmpVal).getDate(); 
			
			//PV1
			PV1 pv1 = (PV1) msg.get(SegName.PV1);
			String scep = getVisitNumberFromPV1(pv1);
			/* field 1 */
			
			/* field 2 */
			if (super.checkPatientClass(msg,scep) != INPATIENT)
				throw new HL7Exception("PV1.2 Unexpected patient class value");

			nm.addPair("EPSD",scep);
			
			/* field 36 */
			//LKT_TYP(756) LKT_NAME(DSDS) - LKUP_EXTERN
			codeVal = pv1.getDischargeDisposition().getValue();			
			transVal = this.getCodeTranslation("DSMT", codeVal).getId();
			nm.addPair("DSMT",transVal);
			
			/* field 37 */
			//LKT_TYP(757) LKT_NAME(DSGD) - LKUP_EXTERN
			codeVal = pv1.getDischargedToLocation().getDischargeLocation().getValue();
			transVal = this.getCodeTranslation("DSDS", codeVal).getId();		
			nm.addPair("DSDS",transVal);
		
			/* field 45 */
			tmpVal = pv1.getDischargeDateTime(0).getTimeOfAnEvent().toString();
			if (tmpVal != null && !tmpVal.equals(""))
			{
				tmpDate = new DateTime(tmpVal).getDate();
			}
			//PV1.45 empty use EVN.2
			nm.addPair("EPEN", tmpDate.toString(DateFormat.ISO));
		}else
		{
			throw new HL7Exception("Unable to match patient");
		}
		
		return nm;
	}

}
