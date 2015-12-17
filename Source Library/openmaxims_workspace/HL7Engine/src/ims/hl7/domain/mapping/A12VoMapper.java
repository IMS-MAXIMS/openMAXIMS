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
import ims.hl7.domain.EventResponse;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocs_if.vo.InpatientEpisodeQueueVo;
import ims.vo.interfaces.IHL7OutboundMessageHandler;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A09;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;

public class A12VoMapper extends VoMapper
{
	private A01VoMapper a01Vomapper; //WDEV-19481
	private A02VoMapper a02mapper;
	private static final Logger			LOG		= Logger.getLogger(A13VoMapper.class); //WDEV-19481

	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		//WDEV-20112
		EventResponse response = new EventResponse(); //WDEV-20112
		
		a02mapper = (A02VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.A02);
		if (a02mapper == null)
		{
			throw new HL7Exception("A12 mapper requires A02 mapper. A02 mapper not found in list of registerd mappers.");			
		}
		//20112
//		return(a02mapper.processPatientTransfer(msg, providerSystem));
		response = a02mapper.processPatientTransfer(msg, providerSystem, response);
		return response; //20112
	}

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}

	//WDEV-19481
	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		LOG.debug("A12VoMapper populateMessage: entry");
		
		ADT_A09 message = new ADT_A09();

		PV1 pv1 = message.getPV1();
		PV2 pv2 = message.getPV2();

		Patient patient=null;
		
		if(event instanceof InpatientEpisodeQueueVo)
		{

			a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);
			if(a01Vomapper==null)
			{
				throw new HL7Exception("A12 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
			}
	
			InpatientEpisodeQueueVo feedVo           = (InpatientEpisodeQueueVo)event;
			ifInpatientEpisodeVo    inpatientEpisode = adt.getInpatientEpisodeDetails(feedVo);
			patient                                  = inpatientEpisode.getPatient();

			a01Vomapper.populateBasicEpisodeData(event, inpatientEpisode, pv1, pv2);
			
			// PV1-6-1 Prior Point of Care (IS)
			if(inpatientEpisode.getPriorWardLocation().getCodeMappings() != null)
			{
				for (int i=0; i<inpatientEpisode.getPriorWardLocation().getCodeMappings().size(); i++)
				{
					TaxonomyMap codeMapping = inpatientEpisode.getPriorWardLocation().getCodeMappings().get(i);
					if(codeMapping.getTaxonomyCode() != null
							&& codeMapping.getTaxonomyCode().length() > 0)
					{
						pv1.getAssignedPatientLocation().getPointOfCare().setValue(codeMapping.getTaxonomyCode().toString());
					}
				}
			}
			
			// PV1-6-3 Prior Bed (IS)
			if(inpatientEpisode.getPriorBedNo() != null && inpatientEpisode.getPriorBedNo().length() > 0)
			{
				pv1.getPriorPatientLocation().getBed().setValue(inpatientEpisode.getPriorBedNo());
			}

			// PV1-6-4 Prior Facility (HD)
			if(inpatientEpisode.getPriorWardLocation().getParentLocation().getCodeMappings() !=null)
			{
				for (int i=0; i<inpatientEpisode.getPriorWardLocation().getParentLocation().getCodeMappings().size(); i++)
				{
					TaxonomyMap codeMapping = inpatientEpisode.getPriorWardLocation().getParentLocation().getCodeMappings().get(i);
					if(codeMapping.getTaxonomyCode() != null 
							&& codeMapping.getTaxonomyCode().length() > 0
							&& codeMapping.getTaxonomyName() != null
							&& codeMapping.getTaxonomyName().getText().length() > 0
							&& inpatientEpisode.getPriorWardLocation().getParentLocation().getName().length() > 0)
					{
						pv1.getAssignedPatientLocation().getFacility().getNamespaceID().setValue(inpatientEpisode.getPriorWardLocation().getParentLocation().getName());
						pv1.getAssignedPatientLocation().getFacility().getUniversalID().setValue(codeMapping.getTaxonomyCode());
						pv1.getAssignedPatientLocation().getFacility().getUniversalIDType().setValue(codeMapping.getTaxonomyName().toString());
					}
				}
			}
			
			// PV1-16-9 Prior Location Description (ST)
			if(inpatientEpisode.getPriorWardLocation().getName() != null 
					&& inpatientEpisode.getPriorWardLocation().getName().length() > 0)
			{
				pv1.getPriorPatientLocation().getLocationDescription().setValue(inpatientEpisode.getPriorWardLocation().getName());
			}
			
			//WDEV-22673
			// PV2-4 Transfer Reason (CE)
			if (inpatientEpisode.getPriorTransferReason() != null)
			{
				pv2.getTransferReason().getIdentifier().setValue((svc.getRemoteLookup(inpatientEpisode.getPriorTransferReason().getID(), event.getProviderSystem().getCodeSystem().getText())));
			} //WDEV-22673
		
		}

		populateMSH(event.getProviderSystem(), message.getMSH(), Long.toString( new java.util.Date().getTime()), "ADT", "A12");
		message.getEVN().getEventTypeCode().setValue("A12");

		if(patient!=null)
		{
			renderPatientVoToPID(patient,message.getPID(),event.getProviderSystem());
			PD1 pd1=message.getPD1();
			//WDEV-20993
//			renderGPDetailsToPD1(patient,pd1);
			renderGPDetailsToPD1(patient, pd1, event.getProviderSystem());
			renderPatientDetailsToPD1(patient, pd1, event.getProviderSystem()); //WDEV-22624
		}
		
		

		return message;

	}

}
