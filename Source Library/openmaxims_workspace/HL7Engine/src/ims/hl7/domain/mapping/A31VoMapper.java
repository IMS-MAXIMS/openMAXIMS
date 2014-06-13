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
package ims.hl7.domain.mapping;

import ims.core.patient.vo.PatientRefVo;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.ocrr.vo.ProviderSystemVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A05;
import ca.uhn.hl7v2.model.v24.segment.EVN;

public class A31VoMapper extends VoMapper
{
	private A28VoMapper a28mapper;

	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		a28mapper = (A28VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.A28);
		if (a28mapper == null)
		{
			throw new HL7Exception("A31 mapper requires A28 mapper. A28 mapper not found in list of registerd mappers.");			
		}
		return(a28mapper.processPatientUpdate(msg, providerSystem));
	}

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
		
	}
	
	public Message populateMessage(PatientRefVo patient, String hl7Application,ProviderSystemVo providerSystem) throws Exception
	{
		a28mapper = (A28VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.A28);
		if (a28mapper == null)
		{
			throw new HL7Exception("A31 mapper requires A28 mapper. A28 mapper not found in list of registerd mappers.");			
		}
		ADT_A05 msg =(ADT_A05)a28mapper.populateMessage(patient,hl7Application,providerSystem);
		EVN evn = msg.getEVN();
		evn.getEventTypeCode().setValue("A31");
		msg.getMSH().getMessageType().getTriggerEvent().setValue("A31");
		return msg;
	}

}
