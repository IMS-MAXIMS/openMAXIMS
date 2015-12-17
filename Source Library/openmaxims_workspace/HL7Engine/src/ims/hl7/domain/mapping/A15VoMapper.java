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

import ims.core.resource.place.domain.objects.Location;
import ims.core.vo.LocMostVo;
import ims.core.vo.Patient;
import ims.core.vo.TaxonomyMap;
import ims.core.vo.ifInpatientEpisodeVo;
import ims.core.vo.domain.LocMostVoAssembler;
import ims.core.vo.lookups.LocationType;
import ims.domain.exceptions.StaleObjectException;
import ims.hl7.domain.EventResponse;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocs_if.vo.InpatientEpisodeQueueVo;
import ims.vo.interfaces.IHL7OutboundMessageHandler;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A15;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;

public class A15VoMapper extends VoMapper
{
	// This event is called when a send on leave event A21 is cancelled, i.e. the patient
	// is no longer on leave!
	
	private static final Logger	LOG	= Logger.getLogger(A15VoMapper.class);
	private A01VoMapper a01Vomapper;

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}

	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		LOG.debug("A15VoMapper populateMessage: entry");
		
		ADT_A15 message = new ADT_A15();
		PV1 pv1 = message.getPV1();
		PV2 pv2 = message.getPV2();
		Patient patient=null;
	
		//WDEV-22479
		populateMSH(event.getProviderSystem(), message.getMSH(), Long.toString( new java.util.Date().getTime()), "ADT", "A15");
		message.getEVN().getEventTypeCode().setValue("A15");

		
		if(event instanceof InpatientEpisodeQueueVo)
		{
			a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);
			if(a01Vomapper==null)
			{
				throw new HL7Exception("A15 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
			}

			InpatientEpisodeQueueVo feedVo = (InpatientEpisodeQueueVo)event;
			ifInpatientEpisodeVo inpatientEpisode = adt.getInpatientEpisodeDetails(feedVo);
			patient = inpatientEpisode.getPatient();
			
			a01Vomapper.populateBasicEpisodeData(event, inpatientEpisode, pv1, pv2);
			
			if(inpatientEpisode.getPendingTransfer() != null)
			{
				
				// PV1-42 Pending location (PL)
				// 	PV1-42-1 Point of care (IS)
				if(inpatientEpisode.getPendingTransfer().getDestinationWard() != null
						&& inpatientEpisode.getPendingTransfer().getDestinationWard().getCodeMappings() != null)
				{
					//WDEV-20269
//					for (int i=0; i<inpatientEpisode.getPendingTransfer().getDestinationWard().getCodeMappings().size(); i++)
//					{
//						TaxonomyMap codeMapping = inpatientEpisode.getPendingTransfer().getDestinationWard().getCodeMappings().get(i);
//						if(codeMapping.getTaxonomyCode() != null
//								&& codeMapping.getTaxonomyCode().length() > 0)
//						{
//						 pv1.getPendingLocation().getPointOfCare().setValue(codeMapping.getTaxonomyCode().toString());
//						}
//					}
					TaxonomyMap map = inpatientEpisode.getPendingTransfer().getDestinationWard().getTaxonomyMap(event.getProviderSystem().getCodeSystem());	
					if (map != null)
					{
						pv1.getPendingLocation().getPointOfCare().setValue(map.getTaxonomyCode());
					} //WDEV-20269
				}
				
				// 	PV1-42-4 Facility (HD)
				//WDEV-20269
//				if(inpatientEpisode.getPendingTransfer().getDestinationWard() != null
//						&& inpatientEpisode.getPendingTransfer().getDestinationWard().getParentLocation() != null
//						&& inpatientEpisode.getPendingTransfer().getDestinationWard().getParentLocation().getName() != null
//						&& inpatientEpisode.getPendingTransfer().getDestinationWard().getParentLocation().getCodeMappings() !=null)
//				{
//					for (int i=0; i<inpatientEpisode.getPendingTransfer().getDestinationWard().getParentLocation().getCodeMappings().size(); i++)
//					{
//						TaxonomyMap codeMapping = inpatientEpisode.getPendingTransfer().getDestinationWard().getParentLocation().getCodeMappings().get(i);
//						if(codeMapping.getTaxonomyCode() != null 
//								&& codeMapping.getTaxonomyCode().length() > 0
//								&& codeMapping.getTaxonomyName() != null
//								&& codeMapping.getTaxonomyName().getText().length() > 0
//								&& inpatientEpisode.getPendingTransfer().getDestinationWard().getParentLocation().getName().length() > 0)
//						{
//							pv1.getPendingLocation().getFacility().getNamespaceID().setValue(inpatientEpisode.getPendingTransfer().getDestinationWard().getParentLocation().getName());
//							pv1.getPendingLocation().getFacility().getUniversalID().setValue(codeMapping.getTaxonomyCode());
//							pv1.getPendingLocation().getFacility().getUniversalIDType().setValue(codeMapping.getTaxonomyName().toString());
//						}
//					}
//				}
				// Need to recurse up Location.Parent to highest parent to obtain current facility (hospital)
				if(inpatientEpisode.getPendingTransfer().getDestinationWard() != null
						&& inpatientEpisode.getPendingTransfer().getDestinationWard().getParentLocation() !=null)
				{
					
					LocMostVo internalLocation = inpatientEpisode.getPendingTransfer().getDestinationWard().getParentLocation();

					while (internalLocation != null)
					{
						if(internalLocation.getType() != null
								&& internalLocation.getType().equals(LocationType.HOSP)
								&& internalLocation.getCodeMappings() != null)
						{
							TaxonomyMap map = internalLocation.getTaxonomyMap(event.getProviderSystem().getCodeSystem());	
							if (map != null)
							{
								pv1.getPendingLocation().getFacility().getNamespaceID().setValue(map.getTaxonomyCode());
							}
						}
						internalLocation = internalLocation.getParentLocation();
					}
				} //WDEV-20269

		
				//	PV1-42-9 Location description (ST)
				if(inpatientEpisode.getPendingTransfer().getDestinationWard() != null
						&& inpatientEpisode.getPendingTransfer().getDestinationWard().getName() != null
						&& inpatientEpisode.getPendingTransfer().getDestinationWard().getName().length() > 0) 
				{
					pv1.getPendingLocation().getLocationDescription().setValue(inpatientEpisode.getPendingTransfer().getDestinationWard().getName());
				}

				
				// PV2-4 Transfer reason (CE)
				if(inpatientEpisode.getPendingTransfer().getTransferReason() != null)
				{
					pv2.getTransferReason().getIdentifier().setValue((svc.getRemoteLookup(inpatientEpisode.getPendingTransfer().getTransferReason().getID(), event.getProviderSystem().getCodeSystem().getText())));
				}
				
				//WDEV-22479
				// EVN-2 Recorded Date/Time  (TS)
				if (inpatientEpisode.getPendingTransfer() != null
						&& inpatientEpisode.getPendingTransfer().getTransferRequestDateTime() != null)
				{
					renderDateTimeVoToTS(inpatientEpisode.getPendingTransfer().getTransferRequestDateTime(), message.getEVN().getRecordedDateTime());
				}

			}
		
		}

		//WDEV-22479 Move to beginning of method
//		populateMSH(event.getProviderSystem(), message.getMSH(), Long.toString( new java.util.Date().getTime()), "ADT", "A15");
//		message.getEVN().getEventTypeCode().setValue("A15");
		
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
	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		EventResponse response = new EventResponse();
		
		PID pid=null;
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


}
