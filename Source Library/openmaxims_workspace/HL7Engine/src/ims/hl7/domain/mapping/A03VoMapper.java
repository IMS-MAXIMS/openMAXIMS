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


import ims.admin.vo.EDAttendanceFeedVo;
import ims.configuration.gen.ConfigFlag;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.vo.AneAttendanceVo;
import ims.core.vo.CareContextInterfaceVo;
import ims.core.vo.DischargedEpisodeVo;
import ims.core.vo.PasEventVo;
import ims.core.vo.Patient;
import ims.core.vo.PendingEmergencyAdmissionVo;
import ims.core.vo.lookups.EmergencyAdmissionStatus;
import ims.emergency.vo.ifEDAttendanceVo;
import ims.framework.utils.DateTime;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.vo.interfaces.IHL7OutboundMessageHandler;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A03;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;

public class A03VoMapper extends VoMapper
{
	private static final Logger			LOG		= Logger.getLogger(A03VoMapper.class);

	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		return(processPatientDischarge(msg, providerSystem));
	}

	public Message populateMessage()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		LOG.debug("A03VoMapper populateMessage: entry");
		ADT_A03 message = new ADT_A03();
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
		
		populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"ADT","A03");
		renderPatientVoToPID(patient,message.getPID(),event.getProviderSystem());
		PD1 pd1=message.getPD1();
		renderGPDetailsToPD1(patient,pd1);
		populateEVN(message.getEVN(),"A03");
		return message;
	}


	private Message processPatientDischarge(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		Patient patVo;
		
		try
		{
			patVo = savePatient(msg,providerSystem, false);
		}
		catch (Exception ex)
		{
			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}
		DischargedEpisodeVo dischargeVo = null;
		try
		{
			PV1 pv1 = (PV1) msg.get("PV1");
			String patClass = pv1.getPatientClass().getValue();
			if (patClass != null && patClass.equals(EMERGENCY_APP))
			{
				PasEventVo pasEventVo = new PasEventVo();
				pasEventVo.setPatient(patVo);
				String eventId = pv1.getVisitNumber().getID().getValue() + "_" + pv1.getVisitNumber().getComponent(1);
				pasEventVo.setPasEventId(eventId);
				PendingEmergencyAdmissionVo peaVo = getADT().getPendingEmergencyAdmission(pasEventVo);
				if(peaVo==null)
				{
					
					AneAttendanceVo attVo = getADT().getAnEAttendance(pasEventVo);
					if (attVo == null)
						attVo = new AneAttendanceVo();
					
					attVo = fillAnEAttFromMsg(attVo, msg, getOrgLoc(), getHcpAdmin(),providerSystem);
					attVo.getPasEvent().setPatient(patVo);
					String[] errs = attVo.validate();
					errs = patVo.validate(errs);
					if (errs != null)
					{
						throw new HL7Exception("Validation failed: " + VoMapper.toDisplayString(errs));				
					}
					errs = patVo.validate();
					if (errs != null)
					{
						throw new HL7Exception("Validation of Patient failed. " + VoMapper.toDisplayString(errs));				
					}
					getADT().recordAEAttendance(attVo, patVo, false);
					peaVo = getADT().getPendingEmergencyAdmission(pasEventVo);
					
//					throw new HL7Exception("Pending Emergency Admission record not found.");
				}
				 if (peaVo.getPasEvent()!=null)
					pasEventVo=getADT().getPasEvent( peaVo.getPasEvent());
				peaVo.setAdmissionStatus(EmergencyAdmissionStatus.DISCHARGED);
				String[] errs = peaVo.validate();
				errs = pasEventVo.validate(errs);
				if (errs != null)
				{
					throw new HL7Exception("Validation failed: " + VoMapper.toDisplayString(errs));				
				}
				
				getADT().recordPendingEmergencyAdmission(pasEventVo, peaVo);
				
			}
			else if (patClass != null && patClass.equals(INPATIENT_APP))
			{
				
				// WDEV-13936 need PasEvent to be populated within the dischargeVo to retrieve a current discharge record if already exists
				dischargeVo = new DischargedEpisodeVo();
				String eventId = pv1.getVisitNumber().getID().getValue() + "_" + pv1.getVisitNumber().getComponent(1);
				PasEventVo pe = new PasEventVo();
				pe.setPasEventId(eventId);
				dischargeVo.setPasEvent(pe);
			
				dischargeVo= adt.getCurrentDischarge(patVo, dischargeVo);
				if (dischargeVo == null)
					dischargeVo = new DischargedEpisodeVo();
			    dischargeVo = fillDischargeFromMsg(dischargeVo, msg, getOrgLoc(), getHcpAdmin(),providerSystem);
			
			
			dischargeVo.getPasEvent().setPatient(patVo);
			List <String> error=new ArrayList<String>();
			DateTime admitDate=new DateTime(pv1.getAdmitDateTime().getTimeOfAnEvent().getValue());
			String [] errs=null;
			if (dischargeVo.getDischargeDateTimeIsNotNull())
			{
				if (admitDate!=null)
				{
					if (admitDate.isGreaterThan(dischargeVo.getDischargeDateTime()))
						error.add("Discharge Date cannot be before Admit Date");
				}
			}
			else
			{
				error.add("Discharge Date cannot be null");
			}
			if (error.size()>0)
			{
				errs=dischargeVo.validate(error.toArray(new String[0]));
			}
			else
			{
				errs = dischargeVo.validate();
				errs=patVo.validate(errs);
			}
			if (errs != null)
			{
				throw new HL7Exception("Validation of Discharge failed. " + VoMapper.toDisplayString(errs));				
			}
			errs = patVo.validate(); // wdev-6683
			if (errs != null)
			{
				throw new HL7Exception("Validation of Patient failed. " + VoMapper.toDisplayString(errs));				
			}
			dischargeVo = getADT().dischargePatient(patVo, dischargeVo, null);
			
			if(ConfigFlag.HL7.INSTANTIATE_EPISODE_FROM_ADT.getValue() || ConfigFlag.HL7.INPATIENT_EPISODE_MANAGEMENT_FROM_PAS.getValue())
			{
				CareContextRefVo careContext=null;
				// wdev-8320
				if (dischargeVo != null && dischargeVo.getPasEventIsNotNull())
				{
					careContext = careSpellDialog.getCareContextFromPasEvent(dischargeVo.getPasEvent());
				}
				else
				{
					
					PV1 pv=(PV1) msg.get("PV1");
					careContext = this.getCareContextFromPV1(pv);
				}
				
				if (careContext!=null)
				{	
					dischargeInpatient.updateCareContextWithEndDateTime(careContext, dischargeVo.getDischargeDateTime());
				}
			}
			}
			else 
			{
				throw new HL7Exception("Invalid patient class for discharge.");
			}
		
			
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}

		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;
	}
	
	public CareContextRefVo getCareContextFromPV1(PV1 pv) throws DataTypeException
	{
		String visitId=pv.getVisitNumber().getID().getValue() + "_" + pv.getVisitNumber().getComponent(1);
		String pasEpisodeId = pv.getAlternateVisitID().getID().getValue();
		CareContextInterfaceVo careContext;
		
		if (pasEpisodeId!=null)
		{
			careContext=careSpellDialog.getCareContextFromPasEpisodeId(pasEpisodeId,visitId);
			if (careContext!=null)
			{
				if (careContext.getEpisodeOfCare()!=null)
				{
					setCareContextContext(careContext.getID_CareContext(),careContext.getEpisodeOfCare().getID_EpisodeOfCare());
					return (CareContextRefVo)careContext;
				}
			}
		}	
		return null;
	}
}
