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

import ims.hl7.utils.HL7Utils;
import ims.hl7.nas.mapping.NasMapper;
import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Varies;
import ca.uhn.hl7v2.model.v24.message.MFN_M01;
import ca.uhn.hl7v2.model.v24.segment.MFI;
import ca.uhn.hl7v2.model.v24.segment.MFE;

public class M01NasMapper extends NasMapper
{
	public ImsNasMsg translate(Message msg) throws Exception
	{
		if (conn == null)
		{
			throw new Exception("Cannot operate without connection to NAS Server.");
		}
		ImsNasMsg sendMsg = new ImsNasMsg();		
		boolean insertRequired=true;

		if (!(msg instanceof MFN_M01))
		{
			throw new Exception("Message type for M01 must be MFN_M01");			
		}		
		
		MFN_M01 mt = (MFN_M01)msg;
		MFI mfi = mt.getMFI();
					
		int mfe_count = mt.getMFN_M01_MFEZxxReps();
		for (int i = 0; i < mfe_count; i++)
		{			
			ImsNasMsg nm = new ImsNasMsg();
			MFE mfe = mt.getMFN_M01_MFEZxx(i).getMFE();
			Varies v = mfe.getPrimaryKeyValueMFE(0);
			String type = mfi.getMasterFileIdentifier().getText().getValue();
			String extCode = HL7Utils.getValueFromVariant(v, 0);
			String extText = HL7Utils.getValueFromVariant(v, 1);			
			String activeFlag = "";
			String evtCode = mfe.getRecordLevelEventCode().getValue();
			String cmds = mfe.getPrimaryKeyValueType(0).getValue();
			StringBuffer curText = new StringBuffer();
			if (extCode == null)
				continue;
			LookupInfo lkpInfo = getCodeTranslation(type, extCode); 
			if (lkpInfo.getId() == null)
			{
				nm.addPair("ACTION", "INSERT");
				activeFlag = "Y";
			}
			else
			{			
				insertRequired=false;
				
				// for updates, check for difference betwen text values (saves unnecessary server call if they are identical (including case))
				// MUP	Update record for master file
				if ( (evtCode.equals("MUP") || evtCode.equals("MAD")) && curText.toString().compareTo(extText) == 0) 
					return null;
				//MDL	Delete record from master file			
				//MDC	Deactivate: discontinue using record in master file, but do not delete from database
				else if (evtCode.equals("MDL") || evtCode.equals("MDC"))
					activeFlag = "N";
				//MAC	Reactivate deactivated record
				else if (evtCode == "MAC")
					activeFlag = "Y";
				
				nm.addPair("ACTION", "UPDATE");	
			}
			
			String table = getLookupTable(type); //move to superclass? 
			if (table != null && table.equals(""))
				return null;
			else if (table.equals("LKUP_EXTERN")) 
			{
				nm.addPair("*SERVICE", "LCODE");		
				nm.addPair("TYPE", type);
				nm.addPair("SRCC", extCode);
				nm.addPair("TEXT", extText);
				nm.addPair("CMDS", cmds);
				if (!activeFlag.equals(""))
					nm.addPair("ACTIVE", activeFlag);
				
				sendMsg.addPair("*SERVICE", "LCODE");
				sendMsg.addPair("ACTION", "GETFORUPD");
				sendMsg.addPair("TYPE", type);
				sendMsg.addPair("SRCC", extCode);
				if (!insertRequired)
				{
					nm.addPair("CODE", lkpInfo.getId());
					sendMsg.addPair("CODE", lkpInfo.getId());
				}
			}
			else		
			{
				
				nm.addPair("*SERVICE", "LKUP");
				if (lkpInfo.getType() != null)
					nm.addPair("LKUP_TYP", lkpInfo.getType());
				nm.addPair("LKUP_SRCT", type);
				nm.addPair("LKUP_NM", extText);
				nm.addPair("LKUP_DESC", extText);
				nm.addPair("LKUP_SRCC", extCode);
				nm.addPair("LKUP_CMDS", cmds);
				if (!activeFlag.equals(""))
					nm.addPair("LKP_STAT", activeFlag);
				
				sendMsg.addPair("*SERVICE", "LKUP");
				sendMsg.addPair("ACTION", "GETFORUPD");
				sendMsg.addPair("LKUP_SRCT", type);
				sendMsg.addPair("LKUP_SRCC", extCode);
				if (!insertRequired)
				{
					nm.addPair("LKUP_ID", lkpInfo.getId());
					sendMsg.addPair("LKUP_ID", lkpInfo.getId());
				}
			}		
			sendMsg.append(nm);
			
		}
		return sendMsg;
		/*if (!insertRequired)
		//{
			sendMsg.append(nm);
			return sendMsg;
		}
		else
			return nm;*/
	}
}
