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
import ims.core.vo.ifInpatientEpisodeVo;
import ims.framework.utils.DateTimeFormat;
import ims.hl7.domain.EventResponse;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocs_if.vo.InpatientEpisodeQueueVo;
import ims.vo.interfaces.IHL7OutboundMessageHandler;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A52;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;

public class A52VoMapper extends VoMapper
{
	// This event is called when a send on leave event A21 is cancelled, i.e. the patient
	// is no longer on leave!
	
	private A21VoMapper a21mapper;
	private static final Logger	LOG	= Logger.getLogger(A52VoMapper.class); //WDEV-19481
	private A01VoMapper a01Vomapper; //WDEV-19481

	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{

		//WDEV-20112
		EventResponse response = new EventResponse(); //WDEV-20112
		
		a21mapper = (A21VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.A21);
		if (a21mapper == null)
		{
			throw new HL7Exception("A52 mapper requires A21 mapper. A21 mapper not found in list of registerd mappers.");			
		}
		//WDEV-20112
//		return(a21mapper.processPatientLeave(msg, providerSystem));
		response = a21mapper.processPatientLeave(msg, providerSystem);
		return response; //WDEV-20112
	}

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}

	//WDEV-19481
	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		LOG.debug("A52VoMapper populateMessage: entry");
		
		ADT_A52 message = new ADT_A52();
		PV1 pv1 = message.getPV1();
		PV2 pv2 = message.getPV2();
		Patient patient=null;
	
		if(event instanceof InpatientEpisodeQueueVo)
		{
			a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);
			if(a01Vomapper==null)
			{
				throw new HL7Exception("A52 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
			}

			InpatientEpisodeQueueVo feedVo = (InpatientEpisodeQueueVo)event;
			ifInpatientEpisodeVo inpatientEpisode = adt.getInpatientEpisodeDetails(feedVo);
			patient = inpatientEpisode.getPatient();
			
			a01Vomapper.populateBasicEpisodeData(event, inpatientEpisode, pv1, pv2);

			// PV2-47 Expected LOA return date/time (TS)
			if(inpatientEpisode != null 
					&& inpatientEpisode.getExpectedLOAReturnDateTime() != null)
			{
				renderDateTimeVoToTS(inpatientEpisode.getExpectedLOAReturnDateTime(), pv2.getExpectedLOAReturnDateTime());
			}
			
			//WDEV-22918
			// EVN-2 Record date/time (TS)
			if (feedVo.getSysInfo() != null)
			{
				if (feedVo.getSysInfo().getLastupdateDateTime() != null)
				{
					message.getEVN().getRecordedDateTime().getTimeOfAnEvent().setValue(feedVo.getSysInfo().getLastupdateDateTime().toString(DateTimeFormat.ISO));
				}
				else if (feedVo.getSysInfo().getCreationDateTime() != null)
				{
					message.getEVN().getRecordedDateTime().getTimeOfAnEvent().setValue(feedVo.getSysInfo().getCreationDateTime().toString(DateTimeFormat.ISO));
				}
			} //WDEV-22918
			
			// EVN-6 Event occurred (TS)
			if(inpatientEpisode != null
					&& inpatientEpisode.getDateTimeOnHomeLeave() != null)
			{
				message.getEVN().getEventOccurred().getTimeOfAnEvent().setValue(inpatientEpisode.getDateTimeOnHomeLeave().toString());
			}

		}
		
		populateMSH(event.getProviderSystem(), message.getMSH(), Long.toString( new java.util.Date().getTime()), "ADT", "A52");
		message.getEVN().getEventTypeCode().setValue("A52");
		
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


}
