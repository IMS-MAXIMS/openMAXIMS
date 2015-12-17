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

public class A02NasMapper extends NasMapper
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
		
		int intTmpVal = 0;
		
		ImsNasMsg nm = new ImsNasMsg();
		
		Integer pkey = null;
		if ((pkey = getPatientPkey(msg)) != null)
		{
			nm.addPair("*SERVICE", "ADT");
			nm.addPair("ACTION", "TRANSFER");
			nm.addPair("PKEY", pkey.toString());
			
			//EVN
			EVN evn = (EVN) msg.get(SegName.EVN);
			/* field 1 */
			if (!evn.getEventTypeCode().getValue().equalsIgnoreCase("A02"))
			{
				throw new HL7Exception("Unexpected Event Type Code for this message type");
			}
								
			//PV1
			PV1 pv1 = (PV1) msg.get(SegName.PV1);
			String scep = getVisitNumberFromPV1(pv1);
			/* field 1 */
			/* field 2 */
			if (super.checkPatientClass(msg,scep) != INPATIENT)
				throw new HL7Exception("PV1.2 Unexpected patient class value");

			
			/* field 3 */
			//LKT_TYP(772) LKT_NAME(ORGNME) - LKUP_EXTERN
			codeVal = pv1.getAssignedPatientLocation().getPointOfCare().getValue();
			if (codeVal == null || codeVal.length() == 0)
				throw new HL7Exception("PV1.07 - (Transfer) Assigned patient location cannot be null");
			transVal = this.getCodeTranslation("LOCNME", codeVal).getId();
			if (transVal == null || transVal.length() == 0)
				throw new HL7Exception("PV1.07 - (Transfer) Assigned patient location cannot be mapped");
			nm.addPair("WARD",transVal); 
			
			/* field 7 */
			tmpVal = pv1.getAttendingDoctor(0).getIDNumber().getValue();
			if (tmpVal == null || tmpVal.equals(""))
				throw new HL7Exception("PV1.07 - Attending Doctor is a required field");
			intTmpVal = getResourceByNationalCode(tmpVal,"MOS");
			if (intTmpVal < 0)
				throw new HL7Exception("PV1.07 - Attending Doctor code " + tmpVal + " cannot be mapped");
			else
				nm.addPair("CONS",Integer.toString(intTmpVal));

			/* field 10 */
			//LKT_TYP(789) LKT_NAME(SSC) - LKUP_EXTERN
			codeVal = pv1.getHospitalService().getValue();
			transVal = this.getCodeTranslation("SSC", codeVal).getId();
			nm.addPair("SPCD",transVal);
			
			nm.addPair("EPSD",scep);
		}else
		{
			throw new HL7Exception("Unable to match patient");
		}
		
		return nm;
	}	
}
