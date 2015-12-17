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
import ca.uhn.hl7v2.model.v24.segment.MRG;
import ca.uhn.hl7v2.model.v24.segment.PID;

public class A47NasMapper extends NasMapper
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
		if (!evn.getEventTypeCode().getValue().equalsIgnoreCase("A47"))
		{
			throw new HL7Exception("Unexpected Event Type Code for this message type");
		}
		
		// Get patient to update from MRG segment: 
		// The assumption here is that (flag) configured 
		// primary patient id ID will be supplied in MRG[1].
		
		nm.addPair("*SERVICE", "PATIENT");
		nm.addPair("ACTION", "GET");
		
		MRG mrg = (MRG)msg.get("MRG");
		CX[] idPriorList = mrg.getPriorPatientIdentifierList();
		int i;
		String idVal = null;
		String localIdType = null;

		for (i = 0; i < idPriorList.length; i++)
		{
		
			String idType = idPriorList[i].getIdentifierTypeCode().getValue();
			if (cfg.getIdentifierTypeComponent().equals("C4"))
			{
				idType = idPriorList[i].getAssigningAuthority().getNamespaceID().getValue();
			}
			
			idVal = idPriorList[i].getID().getValue();
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
		String pkey = nm.getPairVal("PKEY");
		
		//Have PKEY, now build csv list of new ids from PID and copy out Hospnum and NHS number if supplied
		
		PID pid = (PID)msg.get("PID");
		CX[] idNewList = pid.getPatientIdentifierList();
		StringBuffer csvList = new StringBuffer();
		String hospNum = "", nhsn = "";
		
		for (i = 0; i < idNewList.length; i++)
		{
		
			String idType = idNewList[i].getIdentifierTypeCode().getValue();
			if (cfg.getIdentifierTypeComponent().equals("C4"))
			{
				idType = idNewList[i].getAssigningAuthority().getNamespaceID().getValue();
			}
			
			idVal = idNewList[i].getID().getValue();
			//if (!idType.equals(cfg.getPrimaryPatidType())) //prevent updating primary id for the moment?
			//{
				localIdType = this.getCodeTranslation("PID",idType).getId();
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
			//}			
		}
		
		nm = new ImsNasMsg();		
		nm.addPair("*SERVICE", "PATIENT");
		nm.addPair("ACTION", "UPDATE_IDS");		 
		nm.addPair("PKEY", pkey);
		nm.addPair("HOSPNUM", hospNum);
		nm.addPair("NHSN", nhsn);
		nm.addPair("ID_LIST", csvList.toString()); //comma seperated OIDTYPE,OIDVALS
		return nm;

	}

}
