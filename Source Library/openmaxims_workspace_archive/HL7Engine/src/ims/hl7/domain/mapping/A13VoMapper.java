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
import ims.configuration.gen.ConfigFlag;
import ims.core.admin.pas.vo.PASEventRefVo;
import ims.core.vo.CareContextInterfaceVo;
import ims.core.vo.DischargedEpisodeVo;
import ims.core.vo.Patient;
import ims.emergency.vo.ifEDAttendanceVo;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
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
	private static final Logger			LOG		= Logger.getLogger(A13VoMapper.class);

	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		return(processCancelDischarge(msg, providerSystem));
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
		else //Other event types
		{
			
		}
		
		populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"ADT","A13");
		renderPatientVoToPID(patient,message.getPID(),event.getProviderSystem());
		NK1 nk1 = message.getNK1();
		renderNextOfKinVoToNK1(patient.getNok(), nk1,event.getProviderSystem());
		PD1 pd1=message.getPD1();
		renderGPDetailsToPD1(patient,pd1);
		populateEVN(message.getEVN(),"A13");
		return message;
	}

	private Message processCancelDischarge(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
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
			
			Message ack = a05mapper.processEvent(msg, providerSystem);
			return ack;

		}

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
			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}
		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;
	}
	
}
