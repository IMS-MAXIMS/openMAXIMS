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

import org.apache.log4j.Logger;

import ims.core.vo.Patient;
import ims.core.vo.TaxonomyMap;
import ims.core.vo.ifInpatientEpisodeVo;
import ims.domain.exceptions.StaleObjectException;
import ims.hl7.domain.EventResponse;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocs_if.vo.InpatientEpisodeQueueVo;
import ims.vo.interfaces.IHL7OutboundMessageHandler;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A21;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;

public class A25VoMapper extends VoMapper
{
	// WDEV-20445
	// This event is called when a Cancel Pending Discharge event is triggered
	
	private static final Logger	LOG	= Logger.getLogger(A25VoMapper.class);
	private A01VoMapper a01Vomapper;


	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}

	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		LOG.debug("A25VoMapper populateMessage: entry");
		
		ADT_A21 message = new ADT_A21();
		PV1 pv1 = message.getPV1();
		PV2 pv2 = message.getPV2();
		Patient patient=null;
	
		if(event instanceof InpatientEpisodeQueueVo)
		{
			a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);
			if(a01Vomapper==null)
			{
				throw new HL7Exception("A25 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
			}

			InpatientEpisodeQueueVo feedVo = (InpatientEpisodeQueueVo)event;
			ifInpatientEpisodeVo inpatientEpisode = adt.getInpatientEpisodeDetails(feedVo);
			patient = inpatientEpisode.getPatient();
			a01Vomapper.populateBasicEpisodeData(event, inpatientEpisode, pv1, pv2);	
		}
		
		populateMSH(event.getProviderSystem(), message.getMSH(), Long.toString( new java.util.Date().getTime()), "ADT", "A25");
		message.getEVN().getEventTypeCode().setValue("A25");
		
		if(patient != null)
		{
			renderPatientVoToPID(patient, message.getPID(), event.getProviderSystem());
			PD1 pd1 = message.getPD1();
			//WDEV-20993
//			renderGPDetailsToPD1(patient, pd1);
			renderGPDetailsToPD1(patient, pd1, event.getProviderSystem());
			renderPatientDetailsToPD1(patient, pd1, event.getProviderSystem()); //WDEV-22624
		}
	
		return message;
		
	}

	@Override
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		// TODO Auto-generated method stub
		return null;
	}

}
