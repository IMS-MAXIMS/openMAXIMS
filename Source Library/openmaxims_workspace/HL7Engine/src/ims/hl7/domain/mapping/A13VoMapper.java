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
import ims.configuration.gen.ConfigFlag;
import ims.core.admin.pas.vo.PASEventRefVo;
import ims.core.vo.CareContextInterfaceVo;
import ims.core.vo.DischargedEpisodeVo;
import ims.core.vo.PatRelative;
import ims.core.vo.Patient;
import ims.core.vo.ifInpatientEpisodeVo;
import ims.emergency.vo.ifEDAttendanceVo;
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
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.model.v24.segment.NK1;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;

public class A13VoMapper extends VoMapper
{
	// The A13 event is sent when an A03 (discharge/end visit) event is cancelled
	
	private static final Logger			LOG		= Logger.getLogger(A13VoMapper.class);
	private A01VoMapper a01Vomapper; //WDEV-19481

	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		//WDEV-20112
//		return(processCancelDischarge(msg, providerSystem));
		EventResponse response = new EventResponse();
		response = processCancelDischarge(msg, providerSystem, response);
		return response; //WDEV-20112
	}

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}
	
	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		LOG.debug("A13VoMapper populateMessage: entry");
		ADT_A01 message = new ADT_A01();
		Patient patient = null;
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
			
			//PV1-45
			if(attendenceDetails.getDischargeDateTimeIsNotNull())
			{
				renderDateTimeVoToTS(attendenceDetails.getDischargeDateTime(), pv.getDischargeDateTime(0));
			}
			//PV2-3
			PV2 pv2=message.getPV2();
			if(attendenceDetails.getEmergencyEpisodeIsNotNull()&&attendenceDetails.getEmergencyEpisode().getPresentingComplaintIsNotNull())
			{
				pv2.getAdmitReason().getIdentifier().setValue(svc.getRemoteLookup(
						attendenceDetails.getEmergencyEpisode().getPresentingComplaint().getID(),event.getProviderSystem().getCodeSystem().getText()));
			}
		}

		//WDEV-19481
		else if(event instanceof InpatientEpisodeQueueVo)
		{
			a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);
			if(a01Vomapper==null)
			{
				throw new HL7Exception("A13 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
			}

			PV1 pv1 = message.getPV1();
			PV2 pv2 = message.getPV2();
			
			InpatientEpisodeQueueVo feedVo = (InpatientEpisodeQueueVo)event;
			ifInpatientEpisodeVo inpatientEpisode = adt.getInpatientEpisodeDetails(feedVo);
			patient = inpatientEpisode.getPatient();

			a01Vomapper.populateBasicEpisodeData(event, inpatientEpisode, pv1, pv2);
			
			// PV1-36 Discharge disposition (IS)
			if(inpatientEpisode != null
					&& inpatientEpisode.getDischargeDisposition() != null)
			{
				pv1.getDischargeDisposition().setValue(svc.getRemoteLookup(inpatientEpisode.getDischargeDestination().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
	
			// PV1-37 Discharged to location (CM)
			if(inpatientEpisode != null
					&& inpatientEpisode.getDischargeDestination() !=null 
					&& inpatientEpisode.getDischargeDestination().getText().length() > 0)
			{
				pv1.getDischargedToLocation().getDischargeLocation().setValue(inpatientEpisode.getDischargeDestination().toString());
			}

			// PV1-45 Discharge date/time
			if(inpatientEpisode != null
					&& inpatientEpisode.getDischargeDateTime() != null)
			{
				renderDateTimeVoToTS(inpatientEpisode.getDischargeDateTime(), pv1.getDischargeDateTime(0));
			}
			
			//WDEV-22918
			// EVN-2 Recorded Date/Time (TS)
			// Discharge has been cancelled, thus new admission object created?
			if (inpatientEpisode.getAdmissionEventDateTime() != null)
			{
				renderDateTimeVoToTS(inpatientEpisode.getAdmissionEventDateTime(), message.getEVN().getRecordedDateTime());
			} //WDEV-22918
				
		}
	
		
		populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"ADT","A13");

		message.getEVN().getEventTypeCode().setValue("A13");
		
		renderPatientVoToPID(patient,message.getPID(),event.getProviderSystem());

		PD1 pd1=message.getPD1();
		//WDEV-20993
//		renderGPDetailsToPD1(patient,pd1);
		renderGPDetailsToPD1(patient, pd1, event.getProviderSystem());
		renderPatientDetailsToPD1(patient, pd1, event.getProviderSystem()); //WDEV-22624

		//WDEV-22006 Comment out following code and replace by calling a single method
//		NK1 nk1 = message.getNK1();
//		//WDEV-20335
//		Boolean isConfidential = patient.getIsConfidential();
//		
//		//WDEV-20336 Populate NK1 from PDSRelative object first. If object is Null then use Next of Kin VO
//		int NK1Iteration = 0;
//		
//		if(patient.getPDSrelativesIsNotNull()
//				&& patient.getPDSrelatives().size() > 0)
//		{
//			for (int i=0; i < patient.getPDSrelatives().size(); i++)
//			{
//				PatRelative patRelative = patient.getPDSrelatives().get(i);
//				renderPatRelativeVoToNK1(patRelative, nk1, event.getProviderSystem(), isConfidential);
//				NK1Iteration ++;
//			}
//		} 
//		else
//		{
//			renderNextOfKinVoToNK1(patient.getNok(), nk1, event.getProviderSystem(), isConfidential);
//			NK1Iteration ++;
//		}
//		
//		if(patient.getSupportNetworkFamilyIsNotNull() && ConfigFlag.HL7.HL7_INCLUDE_FAMILY_SUPPORT.getValue())
//		{
//			for (int i=0; i < patient.getSupportNetworkFamily().size(); i++)
//			{
//				NK1 sfn = message.getNK1(NK1Iteration);
//				if(patient.getSupportNetworkFamily().get(i).getInactivatingDateTime() == null)
//				{
//					renderSupportNetworkFamilyVoToNK1(patient.getSupportNetworkFamily().get(i), sfn, event.getProviderSystem(), isConfidential);
//					NK1Iteration++;
//				}
//			}
//		} //WDEV-20336

		renderPatientVoToNK1(patient, message, event.getProviderSystem());
		//WDEV-22006

		return message;
	}

	//WDEV-20112
//	private Message processCancelDischarge(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	private EventResponse processCancelDischarge(Message msg, ProviderSystemVo providerSystem, EventResponse response) throws HL7Exception //WDEV-20112
	{
		
		PV1 pv1 = (PV1) msg.get("PV1");
		String patClass = pv1.getPatientClass().getValue();
		
		if (patClass!=null && patClass.equals(EMERGENCY_APP))
		{
			A05VoMapper a05mapper = (A05VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.A05);
			if (a05mapper == null)
			{
				throw new HL7Exception("A13 mapper requires A05 mapper. A05 mapper not found in list of registerd mappers.");			
			}
			
			//WDEV-20112
//			Message ack = a05mapper.processEvent(msg, providerSystem);
//			return ack;
			response.setMessage((Message) a05mapper.processEvent(msg, providerSystem));
			return response; //WDEV-20112

		}

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
			DischargedEpisodeVo dischargeVo = fillDischargeFromMsg(msg, getOrgLoc(), getHcpAdmin(),providerSystem);
			dischargeVo.getPasEvent().setPatient(patVo);
			String[] errs = dischargeVo.validate();
			if (errs != null)
			{
				throw new HL7Exception("Validation of Discharge failed. " + VoMapper.toDisplayString(errs));				
			}
			// wdev-7261 - Patient needs to be validated also
			errs = patVo.validate();
			if (errs != null)
			{
				throw new HL7Exception("Validation of Patient failed. " + VoMapper.toDisplayString(errs));				
			}
			
			// wdev-12588 Need to remove the end date on the care context
			CareContextInterfaceVo voCareContext =null;
			if (ConfigFlag.HL7.INPATIENT_EPISODE_MANAGEMENT_FROM_PAS.getValue() || ConfigFlag.HL7.INSTANTIATE_EPISODE_FROM_ADT.getValue())
			{
				PASEventRefVo pasEvt=null;
				if (!dischargeVo.getPasEvent().getID_PASEventIsNotNull())
				{
					pasEvt= getADT().getPasEventByUnqIdx(patVo, dischargeVo.getPasEvent().getPasEventId());
				}
				else
				{
					pasEvt = dischargeVo.getPasEvent();
				}
				
				if (pasEvt != null)
				{
					voCareContext = getADT().getCareContextByPasEvent(pasEvt);
					if (voCareContext != null)
					{
						voCareContext.setEndDateTime(null);
						voCareContext.setBedNumber(null);
					}
				}
			}
			
			getADT().cancelDischarge(patVo, dischargeVo, voCareContext);
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
		response.setPatient(patVo);
		response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
	}
	
}
