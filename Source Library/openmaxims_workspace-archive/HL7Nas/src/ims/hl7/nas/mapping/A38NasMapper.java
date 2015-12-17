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

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ims.hl7.utils.SegName;
import imsmaxims.common.ImsNasMsg;

public class A38NasMapper extends NasMapper
{
	public ImsNasMsg translate(Message msg) throws Exception 
	{
		if (conn == null) 
		{
			throw new Exception("Cannot operate without connection to NAS Server.");
		}
		
		String tmpVal = null;
				
		ImsNasMsg nm = new ImsNasMsg();
		ImsNasMsg getNm = new ImsNasMsg();
		Integer pkey = null;
		if ((pkey = getPatientPkey(msg)) != null)
		{
			getNm.addPair("*SERVICE", "OUTPATIENT");
			getNm.addPair("ACTION", "GETFORUPD");
			getNm.addPair("PKEY", pkey.toString());
			
			nm.addPair("*SERVICE", "OUTPATIENT");
			nm.addPair("ACTION", "DEACTIVATE");
			nm.addPair("PKEY", pkey.toString());
			
			//EVN
			EVN evn = (EVN) msg.get(SegName.EVN);
			/* field 1 */
			if (!evn.getEventTypeCode().getValue().equalsIgnoreCase("A38"))
			{
				throw new HL7Exception("Unexpected Event Type Code for this message type");
			}
								
			//PV1
			PV1 pv1 = (PV1) msg.get(SegName.PV1);
			/* field 1 */
			/* field 2 */
			tmpVal = pv1.getPatientClass().getValue();
			if (tmpVal == null || !tmpVal.equalsIgnoreCase("O"))
			{
				throw new HL7Exception("PV1.2 Unexpected patient class value (expected \"O\") ");
			}
			getNm.addPair("EPID",getVisitNumberFromPV1(pv1));
			nm.addPair("EPID",getVisitNumberFromPV1(pv1));
		}else
		{
			throw new HL7Exception("Unable to match patient");
		}
		getNm.append(nm);
		return nm;	
	}

}
