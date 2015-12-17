//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
package ims.hl7.domain.mapping;

import ims.core.vo.Patient;
import ims.domain.exceptions.StaleObjectException;
import ims.hl7.domain.EventResponse;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.vo.interfaces.IHL7OutboundMessageHandler;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.SIU_S12;
import ca.uhn.hl7v2.model.v24.segment.PID;

public class S26VoMapper extends VoMapper
{
//	private static final Logger	LOG	= Logger.getLogger(S26VoMapper.class);
	private S12VoMapper s12Vomapper;

	@Override
	public Message populateMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception 
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception 
	{
		EventResponse response = new EventResponse();
		
		PID pid = null;
		pid = (PID) msg.get("PID");
		Patient patVo = getPrimaryIdFromPid(pid, providerSystem);
		try
		{
			Patient patVo2 = getDemog().getPatient(patVo);
			response.setPatient(patVo2);
		}
		catch (StaleObjectException e)
		{
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response;
		}
		String eventCode = HL7Utils.getEventCode(msg);
		response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: Inbound " + eventCode + " events not currently processed by application!", HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112	
	}
	
	
	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		s12Vomapper = (S12VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.S12);
		if(s12Vomapper==null)
		{
			throw new HL7Exception("S26 mapper requires S12 mapper. S12 mapper not found in list of registered mappers.");			
		}
		SIU_S12 s26=(SIU_S12)s12Vomapper.populateMessage(event);
		populateMSH( event.getProviderSystem(),  s26.getMSH(),Long.toString( new java.util.Date().getTime()),"SIU","S26");
		return s26;
	}

}
