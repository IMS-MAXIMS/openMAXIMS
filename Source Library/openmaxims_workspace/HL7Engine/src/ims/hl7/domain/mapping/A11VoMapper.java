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

import org.apache.log4j.Logger;

import ims.admin.vo.EDAttendanceFeedVo;
import ims.admin.vo.InPatientADTFeedVo;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.InpatientEpisodeVo;
import ims.core.vo.Patient;
import ims.emergency.vo.ifEDAttendanceVo;
import ims.emergency.vo.ifInpatientADTVo;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
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

	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		return(processCancelAdmission(msg, providerSystem));
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
		EDAttendanceFeedVo edAttendance = null;
		Patient patient=null;
		PV1 pv = message.getPV1();

		if(event instanceof EDAttendanceFeedVo)
		{
			edAttendance = (EDAttendanceFeedVo)event;
			ifEDAttendanceVo attendenceDetails= adt.getEDAttendanceDetails(edAttendance.getAttendance());
			patient=attendenceDetails.getPatient();
			//PV1-3
			renderPatientLocationToPV1(attendenceDetails.getRegistrationLocation(), null, null, pv, event.getProviderSystem());
			
			//PV1-2
			pv.getPatientClass().setValue("E");  // only mandatory item
			
			//PV1-10
			pv.getHospitalService().setValue("E");
			
			//PV1-19
			if(attendenceDetails.getBoId()!=null)
			{
				pv.getVisitNumber().getID().setValue(attendenceDetails.getBoId().toString());
			}
			//PV1-13
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
			ifInpatientADTVo details=adt.getPartialAdmissionDetails(feedVo);
			ifEDAttendanceVo attendenceDetails = details.getAttendance();
			patient=attendenceDetails.getPatient();
			
		//EVN-4
			EVN evn = message.getEVN();
			if(details.getPartialAdmissionIsNotNull()&&details.getPartialAdmission().getAllocatedStatusIsNotNull())
			{
				evn.getEventReasonCode().setValue(svc.getRemoteLookup(details.getPartialAdmission().getAllocatedStatus().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
		//PV1-19 //ED Attendance ID
			if(attendenceDetails.getBoId()!=null)
			{
				pv.getVisitNumber().getID().setValue(attendenceDetails.getBoId().toString());
			}

			
		//PV1-50 // Bed waiting ID
			if(details.getPartialAdmissionIsNotNull()&&details.getPartialAdmission().getBoId()!=null)
			{
				pv.getAlternateVisitID().getID().setValue(details.getPartialAdmission().getBoId().toString());
			}
		//PV1-2  // Episode type
			
		//EVN-2 //Registration Date
			
		//PV1-9 //Consultant
			
		//PV1-10 //Speciality
			if(details.getPartialAdmissionIsNotNull()&&details.getPartialAdmission().getSpecialtyIsNotNull())
			{
				pv.getHospitalService().setValue(svc.getRemoteLookup(details.getPartialAdmission().getSpecialty().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
		
		//PV1 -3  //Ward (IP) Outbound Virtual ward
			if(details.getPartialAdmissionIsNotNull())
			{
				renderPatientLocationToPV1(details.getPartialAdmission().getAllocatedWard(), null, null, pv, event.getProviderSystem());
			}
			
		//PV1-20  //Public or Private
			
		//PV1 -18 // Requested bed type
			
		
		}
		else //Other event types
		{
			
		}
		
		populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"ADT","A11");
		renderPatientVoToPID(patient,message.getPID(),event.getProviderSystem());
		PD1 pd1=message.getPD1();
		renderGPDetailsToPD1(patient,pd1);
		populateEVN(message.getEVN(),"A11");
		return message;
	}
	
	
	private Message processCancelAdmission(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		Patient patVo;
		try
		{
			patVo = savePatient(msg, providerSystem, false);
		}
		catch (Exception ex)
		{
			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
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
			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}
		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;
	}


}
