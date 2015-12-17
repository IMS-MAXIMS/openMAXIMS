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





import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v231.message.SIU_S12;
import ca.uhn.hl7v2.model.v231.segment.AIG;
import ca.uhn.hl7v2.model.v231.segment.AIL;
import ca.uhn.hl7v2.model.v231.segment.AIP;
import ca.uhn.hl7v2.model.v231.segment.AIS;
import ca.uhn.hl7v2.model.v231.segment.MSH;
import ca.uhn.hl7v2.model.v231.segment.SCH;


public class V231S12NasMapper extends V231NasMapper
{
	public ImsNasMsg translate(Message msg) throws Exception 
	{
		if (conn == null) 
		{
			throw new Exception("Cannot operate without connection to NAS Server.");
		}
		
		if (!(msg instanceof SIU_S12))
		{
			throw new Exception("Message type for S12 must be SIU_S12");			
		}	
		
		SIU_S12 s12Mess = (SIU_S12)msg;			
		SCH sch = (SCH)msg.get("SCH");
		MSH msh = (MSH)msg.get("MSH");
		AIL ail = s12Mess.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE(0).getSIU_S12_AILNTE(0).getAIL();
		
		ImsNasMsg nm = startGenSchedMsg(msh,sch);
		
		if (ail != null)
			nm.addPair("CLIN_NM",ail.getLocationResourceID().getLocationDescription().getValue());
		else
			nm.addPair("CLIN_NM","");
		
		AIS ais = null;		
		AIP aip = null;
		AIG aig = null;
		
		int nResSeqNo = 0;
		
		for (int i = 0; i < s12Mess.getSIU_S12_PIDPD1PV1PV2OBXDG1Reps(); i++)
		{
			for (int j = 0; j < s12Mess.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE(i).getSIU_S12_AISNTEReps();j++,nResSeqNo++)
			{
				ais = s12Mess.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE(i).getSIU_S12_AISNTE(j).getAIS();
				if (ais.getSetIDAIS().getValue() == null)
					break;
				getServiceInfo(ais,nResSeqNo,nm);
			}
			for (int j = 0; j < s12Mess.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE(i).getSIU_S12_AIGNTEReps();j++,nResSeqNo++)
			{
				aig = s12Mess.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE(i).getSIU_S12_AIGNTE(j).getAIG();
				if (aig.getSetIDAIG().getValue() == null)
					break;
				getGroupInfo(aig,nResSeqNo,nm);
			}
			for (int j = 0; j < s12Mess.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE(i).getSIU_S12_AILNTEReps();j++,nResSeqNo++)
			{
				ail = s12Mess.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE(i).getSIU_S12_AILNTE(j).getAIL();
				if (ail.getSetIDAIL().getValue() == null)
					break;
				getLocationInfo(ail,nResSeqNo,nm);				
			}
			for (int j = 0; j < s12Mess.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE(i).getSIU_S12_AIPNTEReps();j++,nResSeqNo++)
			{
				aip = s12Mess.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE(i).getSIU_S12_AIPNTE(j).getAIP();
				if (aip.getSetIDAIP().getValue() == null)
					break;
				getPersonnellInfo(aip,nResSeqNo,nm);				
			}
		}
		
		return nm;
	}		
}
