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

import ims.admin.vo.EDAttendanceFeedVo;
import ims.admin.vo.InPatientADTFeedVo;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.InpatientEpisodeVo;
import ims.core.vo.Patient;
import ims.core.vo.ifInpatientEpisodeVo;
import ims.emergency.vo.ifEDAttendanceVo;
import ims.emergency.vo.ifInpatientADTVo;
import ims.framework.utils.DateTime;
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
import ca.uhn.hl7v2.model.v24.message.ADT_A09;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;

public class A11VoMapper extends VoMapper
{
	private static final Logger			LOG		= Logger.getLogger(A11VoMapper.class);
	private A01VoMapper a01Vomapper; //WDEV-19481

	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		//WDEV-20112
//		return(processCancelAdmission(msg, providerSystem));
		EventResponse response = new EventResponse();
		response = processCancelAdmission(msg, providerSystem, response);
		return response;//WDEV-20112
	}

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}

	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		LOG.debug("A01VoMapper populateMessage: entry");
		ADT_A09 message = new ADT_A09();
		Patient patient=null;
		PV1 pv = message.getPV1();

		if(event instanceof EDAttendanceFeedVo)
		{
			ifEDAttendanceVo attendenceDetails= adt.getEDAttendanceDetails(event);
			patient=attendenceDetails.getPatient();
			//PV1-3
			renderPatientLocationToPV1(attendenceDetails.getRegistrationLocation(), null, null, pv, event.getProviderSystem());
			
			//PV1-2
			pv.getPatientClass().setValue("E");  // only mandatory item
			
			//PV1-10
			pv.getHospitalService().setValue("E");
			
			//PV1-19
			//PV1-19
			if(ConfigFlag.GEN.ED_USE_CUSTOM_ATTENDANCE_ID.getValue()
					&&attendenceDetails.getCustomIDIsNotNull())
			{
				pv.getVisitNumber().getID().setValue(attendenceDetails.getCustomID());
			}
			else if(attendenceDetails.getBoId()!=null)
			{
				pv.getVisitNumber().getID().setValue(attendenceDetails.getBoId().toString());
			}			//PV1-13
			if(attendenceDetails.getAttendanceTypeIsNotNull())
			{
				pv.getReAdmissionIndicator().setValue(svc.getRemoteLookup(attendenceDetails.getAttendanceType().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
			//PV1-44 EVN-2
			if(attendenceDetails.getRegistrationDateTimeIsNotNull())
			{
				renderDateTimeVoToTS(attendenceDetails.getRegistrationDateTime(), pv.getAdmitDateTime());
				renderDateTimeVoToTS(attendenceDetails.getRegistrationDateTime(), message.getEVN().getRecordedDateTime());
			}
			
//			//PV1-45
//			if(attendenceDetails.getDischargeDateTimeIsNotNull())
//			{
//				renderDateTimeVoToTS(attendenceDetails.getDischargeDateTime(), pv.getDischargeDateTime(0));
//			}
			//PV2-3
			PV2 pv2=message.getPV2();
			if(attendenceDetails.getEmergencyEpisodeIsNotNull()&&attendenceDetails.getEmergencyEpisode().getPresentingComplaintIsNotNull())
			{
				pv2.getAdmitReason().getIdentifier().setValue(svc.getRemoteLookup(
						attendenceDetails.getEmergencyEpisode().getPresentingComplaint().getID(),event.getProviderSystem().getCodeSystem().getText()));
			}
		}
		
		else if(event instanceof InPatientADTFeedVo)
		{
			InPatientADTFeedVo feedVo = (InPatientADTFeedVo)event;
			ifInpatientADTVo details = adt.getPartialAdmissionDetails(feedVo);
			ifEDAttendanceVo attendenceDetails = details.getAttendance();
			patient = attendenceDetails.getPatient();
			
			//EVN-4
			EVN evn = message.getEVN();
			if (attendenceDetails!=null)
				renderDateTimeVoToTS(attendenceDetails.getRegistrationDateTime(), evn.getRecordedDateTime());
			
			if (details.getPartialAdmissionIsNotNull()
					&& details.getPartialAdmission().getAllocatedStatusIsNotNull())
			{
				evn.getEventReasonCode().setValue(svc.getRemoteLookup(details.getPartialAdmission().getAllocatedStatus().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
			
			//PV1-19 Visit number (CX)
			if (ConfigFlag.GEN.ED_USE_CUSTOM_ATTENDANCE_ID.getValue()
					&& attendenceDetails.getCustomIDIsNotNull())
			{
				pv.getVisitNumber().getID().setValue(attendenceDetails.getCustomID());
			}
			else if (attendenceDetails.getBoId()!=null)
			{
				pv.getVisitNumber().getID().setValue(attendenceDetails.getBoId().toString());
			}
			
			//PV1-20 Financial class (FC) 
			//Public or Private
			if (attendenceDetails.getPatientAttendanceStatusIsNotNull())
			{
				pv.getFinancialClass(0).getFinancialClass().setValue(svc.getRemoteLookup(attendenceDetails.getPatientAttendanceStatus().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
			
			//PV1-50 Alternate visit ID (CX) 
			// Bed waiting ID
			if (details.getPartialAdmissionIsNotNull()
					&& details.getPartialAdmission().getBoId()!=null)
			{
				pv.getAlternateVisitID().getID().setValue(details.getPartialAdmission().getBoId().toString());
			}
			
			//PV1-2 Patient class (IS) 
			// Episode type
			pv.getPatientClass().setValue("I");
			
			if (details.getPartialAdmissionIsNotNull())
			{
				//PV1-3 Assigned patient location (PL) 
				// Ward (IP) Outbound Virtual ward
				pv.getAssignedPatientLocation().getPointOfCare().setValue("ED");
				//renderPatientLocationToPV1(details.getPartialAdmission().getAllocatedWard(), null, null, pv, event.getProviderSystem());
				
				//PV1-10 Hospital service (IS)
				// Speciality
				if(details.getPartialAdmission().getSpecialtyIsNotNull())
				{
					pv.getHospitalService().setValue(svc.getRemoteLookup(details.getPartialAdmission().getSpecialty().getID(), event.getProviderSystem().getCodeSystem().getText()));
				}
				
				//PV1-18 Patient type (IS)
				// Requested bed type
				if(details.getPartialAdmission().getAccomodationRequestedTypeIsNotNull())
				{
					pv.getPatientType().setValue(svc.getRemoteLookup(details.getPartialAdmission().getAccomodationRequestedType().getID(), event.getProviderSystem().getCodeSystem().getText()));
				}
				
				//PV1-9 Consulting doctor (XCN)
				// Consultant
				if(details.getPartialAdmission().getAdmittingConsultantIsNotNull()
						&& details.getPartialAdmission().getAdmittingConsultant().getMosIsNotNull())
				{
					//WDEV-21000
//					renderMemberOfStaffShortVoToXCN(details.getPartialAdmission().getAdmittingConsultant().getMos(),
//							pv.getConsultingDoctor(0), event.getProviderSystem());
					if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
					{
						renderMemberOfStaffShortVoToConsultingDoctor(details.getPartialAdmission().getAdmittingConsultant().getMos(), pv, event.getProviderSystem());
					}
					else
					{
						renderMemberOfStaffShortVoToXCN(details.getPartialAdmission().getAdmittingConsultant().getMos(), pv.getConsultingDoctor(0), event.getProviderSystem());
					}
				}
				
				//WDEV-23100
				//PV1-44 Admit date/time (TS)
				if (details.getPartialAdmission().getDecisionToAdmitDateTimeIsNotNull())
				{
					DateTime admitDateTime = details.getPartialAdmission().getDecisionToAdmitDateTime();
					renderDateTimeVoToTS(admitDateTime, pv.getAdmitDateTime(), DateTimeFormat.ISO);
				} //WDEV-23100
				
			}		
		}
		
		//WDEV-19481	
		else if(event instanceof InpatientEpisodeQueueVo)
		{

			LOG.debug("A11VoMapper populateMessage: entry");

			a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);
			if(a01Vomapper==null)
			{
				throw new HL7Exception("A11 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
			}

			PV1 pv1 = message.getPV1();
			PV2 pv2 = message.getPV2();

			InpatientEpisodeQueueVo feedVo = (InpatientEpisodeQueueVo)event;
			ifInpatientEpisodeVo inpatientEpisode = adt.getInpatientEpisodeDetails(feedVo);
			patient=inpatientEpisode.getPatient();

			a01Vomapper.populateBasicEpisodeData(event, inpatientEpisode, pv1, pv2);
			
			//WDEV-22918
			// EVN-2 Recorded Date/Time (TS)
			if (inpatientEpisode.getAdmissionEventDateTime() != null)
			{
				renderDateTimeVoToTS(inpatientEpisode.getAdmissionEventDateTime(), message.getEVN().getRecordedDateTime());
			} //WDEV-22918
			

		}
		
		populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"ADT","A11");

		renderPatientVoToPID(patient,message.getPID(),event.getProviderSystem());
		
		PD1 pd1=message.getPD1();
		//WDEV-20993
//		renderGPDetailsToPD1(patient,pd1);
		renderGPDetailsToPD1(patient, pd1, event.getProviderSystem());
		renderPatientDetailsToPD1(patient, pd1, event.getProviderSystem()); //WDEV-22624
		message.getEVN().getEventTypeCode().setValue("A11");

		return message;
		
	}
	
	//WDEV-20112
//	private Message processCancelAdmission(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	private EventResponse processCancelAdmission(Message msg, ProviderSystemVo providerSystem, EventResponse response) throws HL7Exception //WDEV-20112
	{
	
		Patient patVo;
		try
		{
			patVo = savePatient(msg, providerSystem, false);
			//WDEV-20112
			response.setPatient(patVo); //WDEV-20112
		}
		catch (Exception ex)
		{
			//WDEV-20112
//			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}
		try
		{
			if(ConfigFlag.HL7.ADT_IN_UPDATE_PARTIAL_ADMISSION_ONLY.getValue())
			{
				PV1 pv = (PV1)msg.get("PV1");
				String partialAdmissionId=pv.getAlternateVisitID().getID().getValue();
				adt.cancelPartialAdmission(partialAdmissionId);
			}
			else
			{
				String[] errs = patVo.validate();
				if (errs != null)
				{
					throw new HL7Exception("Validation of Patient failed. " + VoMapper.toDisplayString(errs));				
				}
				InpatientEpisodeVo currentEpisVo = getADT().getCurrentAdmissionRecord(patVo);
				if (currentEpisVo != null)
				{
					InpatientEpisodeVo msgEpisVo=null;
					msgEpisVo = fillEpisFromMsg(msgEpisVo, msg, getOrgLoc(), getHcpAdmin(),providerSystem);	
					if(msgEpisVo!=null
							&&msgEpisVo.getPasEvent()!=null
							&&msgEpisVo.getPasEvent().getPasEventId()!=null
							&&currentEpisVo.getPasEvent()!=null
							&&msgEpisVo.getPasEvent().getPasEventId().equals(currentEpisVo.getPasEvent().getPasEventId()))
					{
						getADT().cancelAdmission(patVo);	
					}
				}
			}
		}
		catch (Exception ex)
		{
			//WDEV-20112
//			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}
		//WDEV-20112
//		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		return ack;
		response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
	}

}
