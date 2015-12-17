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


import ims.admin.vo.EDAttendanceFeedVo;
import ims.configuration.gen.ConfigFlag;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.vo.AneAttendanceVo;
import ims.core.vo.CareContextInterfaceVo;
import ims.core.vo.DischargedEpisodeVo;
import ims.core.vo.PasEventVo;
import ims.core.vo.Patient;
import ims.core.vo.PendingEmergencyAdmissionVo;
import ims.core.vo.ifInpatientEpisodeVo;
import ims.core.vo.lookups.EmergencyAdmissionStatus;
import ims.emergency.vo.ifEDAttendanceVo;
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
	private A01VoMapper a01Vomapper; //WDEV-19481

	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		//WDEV-20112
//		return(processPatientDischarge(msg, providerSystem));
		EventResponse response = new EventResponse();
		response = processPatientDischarge(msg, providerSystem, response);
		return response; //WDEV-20112		
	}

	public Message populateMessage()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		//WDEV-22703
		a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);
		if(a01Vomapper==null)
		{
			throw new HL7Exception("A03 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
		}
		
		LOG.debug("A03VoMapper populateMessage: entry");
		ADT_A03 message = new ADT_A03();
		Patient patient = null;
		
		PV1 pv1 = message.getPV1();
		PV2 pv2 = message.getPV2();
		PD1 pd1 = message.getPD1();

		//WDEV-22703 Duplicate code
//		message = new ADT_A03();
//		PV1 pv1 = message.getPV1();
		

		if (event instanceof EDAttendanceFeedVo)
		{
			ifEDAttendanceVo attendenceDetails= adt.getEDAttendanceDetails(event);
			patient = attendenceDetails.getPatient();

			//PV1-2 Patient class (IS)
			pv1.getPatientClass().setValue("E");  // only mandatory item

			//PV1-3 Assigned patient location (PL)
			renderPatientLocationToPV1(attendenceDetails.getRegistrationLocation(), null, null, pv1, event.getProviderSystem());
						
			//PV1-10 Hospital service (IS)
			pv1.getHospitalService().setValue("E");
			
			//PV1-19 Visit number (CX)
			if (ConfigFlag.GEN.ED_USE_CUSTOM_ATTENDANCE_ID.getValue()
					&& attendenceDetails.getCustomIDIsNotNull())
			{
				pv1.getVisitNumber().getID().setValue(attendenceDetails.getCustomID());
			}
			else if (attendenceDetails.getBoId()!=null)
			{
				pv1.getVisitNumber().getID().setValue(attendenceDetails.getBoId().toString());
			}
			
			//PV1-13 Re-admission indicator (IS)
			if (attendenceDetails.getAttendanceTypeIsNotNull())
			{
				pv1.getReAdmissionIndicator().setValue(svc.getRemoteLookup(attendenceDetails.getAttendanceType().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
			
			//PV1-44 Admit date/time (TS) 
			//EVN-2 
			if (attendenceDetails.getRegistrationDateTimeIsNotNull())
			{
				renderDateTimeVoToTS(attendenceDetails.getRegistrationDateTime(), pv1.getAdmitDateTime());
				renderDateTimeVoToTS(attendenceDetails.getRegistrationDateTime(), message.getEVN().getRecordedDateTime());
			}
			
			//PV1-45 Discharge date/time (TS)
			if (attendenceDetails.getDischargeDateTimeIsNotNull())
			{
				renderDateTimeVoToTS(attendenceDetails.getDischargeDateTime(), pv1.getDischargeDateTime(0));
			}
			
			//PV2-3 Admit reason (CE)
//			PV2 pv2=message.getPV2(); //WDEV-22703 Moved code to top of method
			if (attendenceDetails.getEmergencyEpisodeIsNotNull()&&attendenceDetails.getEmergencyEpisode().getPresentingComplaintIsNotNull())
			{
				pv2.getAdmitReason().getIdentifier().setValue(svc.getRemoteLookup(attendenceDetails.getEmergencyEpisode().getPresentingComplaint().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
			
			//WDEV-22703
			populateMSH(event.getProviderSystem(), message.getMSH(), Long.toString( new java.util.Date().getTime()), "ADT", "A03");
			message.getEVN().getEventTypeCode().setValue("A03");
			renderPatientVoToPID(patient, message.getPID(), event.getProviderSystem());
			renderGPDetailsToPD1(patient,pd1);
			renderPatientDetailsToPD1(patient, pd1, event.getProviderSystem()); //WDEV-22624
			
		}

		//WDEV-19481
		else if(event instanceof InpatientEpisodeQueueVo)
		{

			//WDEV-22703 Moved code to top of method
//			a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);
//			if(a01Vomapper==null)
//			{
//				throw new HL7Exception("A03 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
//			}
//
//			message = new ADT_A03();
//			PV1 pv1 = message.getPV1();
//			PV2 pv2 = message.getPV2();

			if(event instanceof InpatientEpisodeQueueVo)
			{
				
				InpatientEpisodeQueueVo feedVo = (InpatientEpisodeQueueVo)event;
				ifInpatientEpisodeVo inpatientEpisode = adt.getInpatientEpisodeDetails(feedVo);
				patient = inpatientEpisode.getPatient();

				a01Vomapper.populateBasicEpisodeData(event, inpatientEpisode, pv1, pv2);
				
				// PV1-36 Discharge disposition (IS)
				//WDEV-22260
//				if(inpatientEpisode.getDischargeDisposition() != null)
//				{
//					pv1.getDischargeDisposition().setValue(svc.getRemoteLookup(inpatientEpisode.getDischargeDestination().getID(), event.getProviderSystem().getCodeSystem().getText()));
//				}
				if (inpatientEpisode.getMethodOfDischarge() != null)
				{
					pv1.getDischargeDisposition().setValue(svc.getRemoteLookup(inpatientEpisode.getMethodOfDischarge().getID(), event.getProviderSystem().getCodeSystem().getText()));
				} //WDEV-22260
	
				// PV1-37 Discharged to location (CM)
				//WDEV-22260
//				if(inpatientEpisode.getDischargeDestination() !=null 
//						&& inpatientEpisode.getDischargeDestination().getText().length() > 0)
//				{
//					pv1.getDischargedToLocation().getDischargeLocation().setValue(inpatientEpisode.getDischargeDestination().toString());
//					//WDEV-22260
//					pv1.getDischargedToLocation().getDischargeLocation().setValue(svc.getRemoteLookup(inpatientEpisode.getDischargeDestination().getID(), event.getProviderSystem().getCodeSystem().getText()));
//				}
				if(inpatientEpisode.getDischargeDestination() !=null)
				{
					pv1.getDischargedToLocation().getDischargeLocation().setValue(svc.getRemoteLookup(inpatientEpisode.getDischargeDestination().getID(), event.getProviderSystem().getCodeSystem().getText()));
				} // WDEV-22260

				// PV1-45 Discharge date/time (TS)
				if(inpatientEpisode.getDischargeDateTime() != null)
				{
					renderDateTimeVoToTS(inpatientEpisode.getDischargeDateTime(), pv1.getDischargeDateTime(0));
				}

				renderPatientVoToPID(patient, message.getPID(), event.getProviderSystem());
//				PD1 pd1 = message.getPD1(); //WDEV-22703 Moved to top of method
				//WDEV-20993
//				renderGPDetailsToPD1(patient, pd1);				
				renderGPDetailsToPD1(patient, pd1, event.getProviderSystem());
				renderPatientDetailsToPD1(patient, pd1, event.getProviderSystem()); //WDEV-22624
				
				//WDEV-22918
				// EVN-2 Recorded Date/Time (TS)
				if (inpatientEpisode.getDischargeEventDateTime() != null)
				{
					message.getEVN().getRecordedDateTime().getTimeOfAnEvent().setValue(inpatientEpisode.getDischargeEventDateTime().toString(DateTimeFormat.ISO));
				} //WDEV-22918

			}


			populateMSH(event.getProviderSystem(), message.getMSH(), Long.toString( new java.util.Date().getTime()), "ADT", "A03");
			message.getEVN().getEventTypeCode().setValue("A03");
	
		}

		return message;

	}

	
	//WDEV-20112
//	private Message processPatientDischarge(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	private EventResponse processPatientDischarge(Message msg, ProviderSystemVo providerSystem, EventResponse response) throws HL7Exception //WDEV-20112
	{
		Patient patVo;
		try
		{
			patVo = savePatient(msg,providerSystem, false);
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
