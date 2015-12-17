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
import ca.uhn.hl7v2.model.v24.datatype.CX;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.PID;

public class A29NasMapper extends NasMapper
{
	public ImsNasMsg translate(Message msg) throws Exception
	{
		if (conn == null) 
		{
			throw new Exception("Cannot operate without connection to NAS Server.");
		}

		ImsNasMsg nm = new ImsNasMsg();
				
		
		//EVN
		EVN evn = (EVN) msg.get(SegName.EVN);
		/* field 1 */
		if (!evn.getEventTypeCode().getValue().equalsIgnoreCase("A29"))
		{
			throw new HL7Exception("Unexpected Event Type Code for this message type");
		}
		
		
		nm.addPair("*SERVICE", "PATIENT");
		nm.addPair("ACTION", "GET");
		
		PID pid = (PID)msg.get("PID");

		String pkey = null;
		ImsNasMsg updNm = null;
		ImsNasMsg risMsg = new ImsNasMsg();
		
		if (cfg.getMAXIMSRis())
		{
			Integer tmpPkey = getXRAYPatient(pid);
			
			if ( tmpPkey != null && tmpPkey.toString().length() > 0)
			{
				risMsg.addPair("*SERVICE", "PATIENT");
				risMsg.addPair("ACTION", "UPDATE");
				risMsg.addPair("XRAYNUM", tmpPkey.toString());
				risMsg.addPair("INACTIVE", "1");
				return risMsg;
			}
			else
			{
				throw new HL7Exception("Patient does not exist.");
			}
		}
		
		
		
		CX[] idList = pid.getPatientIdentifierList();
		int i;
		String idVal = null;
		String localIdType = null;

		for (i = 0; i < idList.length; i++)
		{
		
			String idType = idList[i].getIdentifierTypeCode().getValue();
			if (cfg.getIdentifierTypeComponent().equals("C4"))
			{
				idType = idList[i].getAssigningAuthority().getNamespaceID().getValue();
			}
			
			idVal = idList[i].getID().getValue();
			if (idType.equals(cfg.getPrimaryPatidType()))
			{
				localIdType = this.getCodeTranslation("PID",idType).getId();
				if (localIdType == null)
				{
					throw new HL7Exception("Lookup Mapping for Primary Patient ID Type not available : " + cfg.getPrimaryPatidType());
				}
				nm.addPair("OIDTYPE", localIdType);
				nm.addPair("OIDVAL", idVal);				
			}			
		}
		
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();
		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv < 0 && rv != -2)
		{
			throw new HL7Exception("Error occurred getting patient :" + errMess);			
		}
		else if (rv == -2)
		{
			return null;			
		}
		
		
		
		nm = new ImsNasMsg(outMess.toString());
		pkey = nm.getPairVal("PKEY");
		nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "PATIENT");
		nm.addPair("ACTION", "DELETE");
		nm.addPair("PKEY", pkey);
		//causes key violation in PID if > 1 id exists - change to BR in patient Service
		//nm.addPair("OIDTYPE", localIdType);
		//nm.addPair("OIDVAL", idVal);
		//nm.addPair("LPDSTAT", "0");
		return nm;
	}
}
