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

import ims.core.vo.LocShortVo;
import ims.core.vo.Patient;
import ims.core.vo.PatientShort;
import ims.core.vo.ifInpatientEpisodeVo;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.utils.DateTimeFormat;
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
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PV2;
import ca.uhn.hl7v2.model.v24.message.ADT_A21;
import ca.uhn.hl7v2.model.v24.segment.PV1;

public class A21VoMapper extends VoMapper
{
	private static final Logger			LOG		= Logger.getLogger(A13VoMapper.class); //WDEV-19481
	private A01VoMapper a01Vomapper; //WDEV-19481
	
	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		return processPatientLeave(msg, providerSystem);
	}

	public Message populateMessage()
	{
		// Not needed for inbound messages
		return null;
	}
	
	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		//WDEV-19481
		LOG.debug("A21VoMapper populateMessage: entry");
		
		ADT_A21 message = new ADT_A21();
		
		PV1 pv1 = message.getPV1();
		PV2 pv2 = message.getPV2();
		
		Patient patient=null;

		
		if(event instanceof InpatientEpisodeQueueVo)
		{
			a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);
			if(a01Vomapper==null)
			{
				throw new HL7Exception("A21 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
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
				//WDEV-20660
//				message.getEVN().getEventOccurred().getTimeOfAnEvent().setValue(inpatientEpisode.getDateTimeOnHomeLeave().toString());
				String formatDateTime = inpatientEpisode.getDateTimeOnHomeLeave().toString(ims.framework.utils.DateTimeFormat.ISO);
				message.getEVN().getEventOccurred().getTimeOfAnEvent().setValue(formatDateTime); //WDEV-20660
			}
			 

		}
			
		populateMSH(event.getProviderSystem(), message.getMSH(), Long.toString(new java.util.Date().getTime()), "ADT", "A21");
		message.getEVN().getEventTypeCode().setValue("A21");
		
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
	
		
	
	
	
	//WDEV-20112
//	protected Message processPatientLeave(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	protected EventResponse processPatientLeave(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{

		//WDEV-20112
		EventResponse response = new EventResponse(); //WDEV-20112
		
		try
		{
			
			PatientShort patVo = (PatientShort)getPrimaryIdFromPid(msg, providerSystem);
			
			if (patVo != null)
			{
				patVo = getDemog().getPatient(patVo);
				
				if (patVo == null)
					//WDEV-20112
//					return HL7Utils.buildRejAck(msg.get("MSH"), "This patient has not been registered within the system", HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
				{		
					response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: This patient has not been registered within the system", HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
					return response; //WDEV-20112
				}

				//WDEV-20112
				response.setPatient(patVo); //WDEV-20112

				String eventCode = HL7Utils.getEventCode(msg);
				if (eventCode.equals("A21") || eventCode.equals("A53"))  // A21 set's patient on leave, A53 cancels the cancelled Patient Leave i.e. sets them on leave again
					adt.recordInpatientLeave(patVo);
				else if (eventCode.equals("A22") || eventCode.equals("A52"))  // Cancel Patient's Leave
				{
					PV1 pv1 = (PV1) msg.get("PV1");

					//WDEV-20280
					if(pv1.getAssignedPatientLocation().getPointOfCare().getValue() == null)
					{
						response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: No point of care assigned to patient (PV1-3)", HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
						return response; 
					} //WDEV-20280
					
					LocShortVo loc = null;
					//WDEV-20278
//					loc = orgLoc.getLocationByTaxonomyType(pv1.getAssignedPatientLocation().getPointOfCare().getValue(), TaxonomyType.PAS);
					loc = orgLoc.getLocationByTaxonomyType(pv1.getAssignedPatientLocation().getPointOfCare().getValue(), providerSystem.getCodeSystem()); //WDEV-20278
					
					//WDEV-20280
					if(loc == null)
					{
						response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: No mapping found for patient location: " + pv1.getAssignedPatientLocation().getPointOfCare().getValue(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
						return response; 
					} //WDEV-20280

					patVo.setWard(loc);
					adt.cancelInpatientLeave(patVo);  // A22
				}
			}
		}
		catch (StaleObjectException ex)
		{
			//WEDEV-20112
//			return HL7Utils.buildRejAck( msg.get("MSH"), "StaleObjectException occured recording Inpatient Leave - " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck( msg.get("MSH"), "StaleObjectException occured recording Inpatient Leave - " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}

		//WDEV-20112
//		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		return ack;
		response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
	}


}
