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
import ims.core.resource.place.vo.LocSiteRefVo;
import ims.core.vo.CareContextInterfaceVo;
import ims.core.vo.DischargedEpisodeVo;
import ims.core.vo.InpatientEpisodeVo;
import ims.core.vo.LocSiteShortVo;
import ims.core.vo.OutPatientAttendanceVo;
import ims.core.vo.PasEventVo;
import ims.core.vo.Patient;
import ims.core.vo.lookups.Specialty;
import ims.core.vo.lookups.TaxonomyType;
import ims.emergency.vo.ifEDAttendanceVo;
import ims.framework.utils.Date;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DateTime;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.scheduling.vo.lookups.Status_Reason;
import ims.vo.interfaces.IHL7OutboundMessageHandler;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.NK1;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;

public class A08VoMapper extends VoMapper
{
	private static final Logger			LOG		= Logger.getLogger(A08VoMapper.class);
	
	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		LOG.debug("A08VoMapper populateMessage: entry");
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
		
		populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"ADT","A08");
		renderPatientVoToPID(patient,message.getPID(),event.getProviderSystem());
		NK1 nk1 = message.getNK1();
		renderNextOfKinVoToNK1(patient.getNok(), nk1,event.getProviderSystem());
		PD1 pd1=message.getPD1();
		renderGPDetailsToPD1(patient,pd1);
		populateEVN(message.getEVN(),"A08");
		return message;
	}

	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		return (processUpdatePatientInformation(msg, providerSystem));
	}

	private Message processUpdatePatientInformation(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		try
		{

			PV1 pv1 = (PV1) msg.get("PV1");
			String patClass = pv1.getPatientClass().getValue();
			
			if (patClass!=null && (patClass.equals(PREADMIT)||patClass.equals(EMERGENCY_APP)))
			{
				A05VoMapper a05mapper = (A05VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.A05);
				if (a05mapper == null)
				{
					throw new HL7Exception("A08 mapper requires A05 mapper. A05 mapper not found in list of registerd mappers.");			
				}
				
				Message ack = a05mapper.processEvent(msg, providerSystem);
				return ack;

			}
			Patient patVo = savePatient(msg, providerSystem, false);

			if(ConfigFlag.HL7.ADT_IN_UPDATE_PARTIAL_ADMISSION_ONLY.getValue())
			{
				InpatientEpisodeVo episVo=null;
				episVo = fillEpisFromMsg(episVo, msg, getOrgLoc(), getHcpAdmin(),providerSystem);
				episVo.getPasEvent().setPatient(patVo);
				String[] errs = episVo.validate();
				if (errs != null)
				{
					throw new HL7Exception("Validation of Episode failed. " + VoMapper.toDisplayString(errs));				
				}
				adt.updateInpatient(episVo, null);
				Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
				return ack;

			}

			if (patClass != null && patClass.equals(OUTPATIENT_APP))
			{
				PasEventVo pasEventVo = new PasEventVo(); 
				fillPasEventFromEVN((EVN) msg.get("EVN"), pasEventVo, null);
				fillPasEventFromPV1(pv1, pasEventVo, getOrgLoc(), getHcpAdmin(),providerSystem);
				pasEventVo.setPatient(patVo);
			    OutPatientAttendanceVo attVo = getADT().getOutpatientAppointment(pasEventVo);
			    if (attVo == null)
			    {
			    	// wdev-2858 This could be an appointment re-arrange (CCO) so we will try to get an appointment
					// by the third and fourth components.  The new eventId will be set later in fillAttFromMsg
					String oldEventId = pv1.getVisitNumber().getComponent(2) + "_" + pv1.getVisitNumber().getAssigningAuthority().getNamespaceID();
					if (!oldEventId.equals("_") && !oldEventId.equals("null_null"))
					{
						pasEventVo.setPasEventId(oldEventId);
						attVo = getADT().getOutpatientAppointment(pasEventVo);
					}
					if (attVo == null)
						attVo = new OutPatientAttendanceVo();
			    }
				
				attVo = fillAttFromMsg(attVo, msg, getOrgLoc(), getHcpAdmin(),providerSystem);
				attVo.getPasEvent().setPatient(patVo);  // wdev-7445
				// Force the update of the attend date by taking it from PV1.44
				if (pv1.getAdmitDateTime().getTimeOfAnEvent() != null && pv1.getAdmitDateTime().getTimeOfAnEvent().getValue() != null)
				{
					attVo.getPasEvent().setEventDateTime(new DateTime(pv1.getAdmitDateTime().getTimeOfAnEvent().getValue()));					
				}				
			
				// WDEV-13455 - Check if a disposal code was supplied
				// as the Attendance could have been marked as OnHold (DH) or DNA (DA)
				// if so, set the appointment status appropriately
				String disposal = pv1.getDischargeDisposition().getValue();
				if (disposal != null && !disposal.equals(""))
				{
					if (disposal.equals("DH"))  // On Hold
						attVo.setAppointmentStatus(Status_Reason.SUSPENDED);
					else if (disposal.equals("DA"))  // DNA
						attVo.setAppointmentStatus(Status_Reason.DNA);
				}
				
				// WDEV-13455 
				// For Patient Diary, send the recording user which is sent in EVN-5
				EVN evn = (EVN) msg.get("EVN");
				// WDEV-15884 Check not null!
				if (evn != null && evn.getOperatorID() != null && evn.getOperatorID().length > 0)
					attVo.setRecordingUser(evn.getOperatorID()[0].getIDNumber().getValue());
				
				
				String[] errs = attVo.validate();
				if (errs != null)
				{
					throw new HL7Exception("Validation of Outpatient Attendance failed. " + VoMapper.toDisplayString(errs));				
				}
				patVo.validate();
				
				//WDEV-10231
				CareContextInterfaceVo voCareContext = null;
				if(ConfigFlag.HL7.INSTANTIATE_EPISODE_FROM_ADT.getValue())
				{
					if(attVo != null && attVo.getPasEventIsNotNull())
					{
						voCareContext = getADT().getCareContextByPasEvent(attVo.getPasEvent());
						if(voCareContext != null)
						{
							// WDEV-13901 may need to create the history record
							// check if history records required for CC and EpisodeOfCare 
							voCareContext = createHistoryCareContextAndEpis(voCareContext, true, pv1, providerSystem.getCodeSystem().getText());

							voCareContext.setStartDateTime(attVo.getPasEvent().getEventDateTime());
							voCareContext.setResponsibleHCP(attVo.getPasEvent().getConsultant());
						}
					}
				}
				
				getADT().recordOPAttendance(patVo, attVo, voCareContext);
			}
			else if (patClass != null && patClass.equals(INPATIENT_APP))
			{
				DischargedEpisodeVo dischVo=null;
				InpatientEpisodeVo episVo = getADT().getCurrentAdmissionRecord(patVo);
				if (episVo == null)
				{
					// This might be a discharged inpatient record being updated!  Need to check this too
					PasEventVo pe = new PasEventVo();
					dischVo = new DischargedEpisodeVo();
					pe.setPasEventId(pv1.getVisitNumber().getID().getValue() + "_" + pv1.getVisitNumber().getComponent(1));
					dischVo.setPasEvent(pe);
					dischVo = getADT().getCurrentDischarge(patVo, dischVo);
					if (dischVo == null)  // No discharge found either, create Inpatient
						episVo = new InpatientEpisodeVo();
				}
				
				if (dischVo != null)
					updateDischargeDetails(patVo, dischVo, msg, pv1,providerSystem);
				else
					updateInpatientDetails(patVo, episVo, msg, pv1,providerSystem);

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
	
	
	private void updateInpatientDetails(Patient patVo, InpatientEpisodeVo episVo, Message msg, PV1 pv1,ProviderSystemVo providerSystem) throws Exception
	{
		// wdev-12588  Hold on to previous PasEvent, as if location changed, we have to set bed number to null
		// we may also have to update the EpisodeOfCare hcp, start date etc..
		PasEventVo originalPE = (PasEventVo) episVo.getPasEvent().clone();
		
		fillEpisFromMsg(episVo, msg, getOrgLoc(), getHcpAdmin(),providerSystem);
		
		//Force the update of the admission date by taking it from PV1.44
		if (pv1.getAdmitDateTime().getTimeOfAnEvent() != null && pv1.getAdmitDateTime().getTimeOfAnEvent().getValue() != null)
		{
			episVo.getPasEvent().setEventDateTime(new DateTime(pv1.getAdmitDateTime().getTimeOfAnEvent().getValue()));					
		}		
		
		episVo.getPasEvent().setPatient(patVo);
		String[] errs = episVo.validate();
		if (errs != null)
		{
			throw new HL7Exception("Validation of Admission failed. " + VoMapper.toDisplayString(errs));				
		}
		
		//WDEV-10231
		CareContextInterfaceVo voCareContext = null;
		if(ConfigFlag.HL7.INSTANTIATE_EPISODE_FROM_ADT.getValue() || ConfigFlag.HL7.INPATIENT_EPISODE_MANAGEMENT_FROM_PAS.getValue())
		{
			if(episVo != null && episVo.getPasEventIsNotNull())
			{
				voCareContext = getADT().getCareContextByPasEvent(episVo.getPasEvent());
				if(voCareContext != null)
				{
					// WDEV-13901 may need to create the history record
					// check if history records required for CC and EpisodeOfCare 
					voCareContext = createHistoryCareContextAndEpis(voCareContext, true, pv1, providerSystem.getCodeSystem().getText());

					voCareContext.setStartDateTime(episVo.getPasEvent().getEventDateTime());
					voCareContext.setResponsibleHCP(episVo.getPasEvent().getConsultant());

					// wdev-12588
					voCareContext.setEstimatedDischargeDate(episVo.getEstDischargeDate());
					voCareContext.getEpisodeOfCare().setStartDate(episVo.getPasEvent().getEventDateTime().getDate());
					voCareContext.getEpisodeOfCare().setResponsibleHCP(episVo.getPasEvent().getConsultant());
					voCareContext.getEpisodeOfCare().getCareSpell().setStartDate(episVo.getPasEvent().getEventDateTime().getDate());				
					
					LocSiteShortVo loc = orgLoc.getLocSiteShortByTaxonomyType(pv1.getAssignedPatientLocation().getBuilding().getValue(), TaxonomyType.PAS);
					LocSiteRefVo orderingHospRef = new LocSiteRefVo();
					if (loc!=null)
					{
						orderingHospRef.setID_Location(loc.getBoId());
						voCareContext.setOrderingHospital(orderingHospRef);
					}
					
					// wdev-12588 If location changes, we need to set the carecontext bed number to null
					if (episVo.getPasEventIsNotNull() && episVo.getPasEvent().getLocationIsNotNull() &&
							originalPE != null && originalPE.getLocationIsNotNull() && !originalPE.getLocation().equals(episVo.getPasEvent().getLocation()))
					{
						voCareContext.setBedNumber(null);
					}
					
					//specialty in episode of care
					if(voCareContext.getEpisodeOfCareIsNotNull() && providerSystem != null &&  providerSystem.getCodeSystemIsNotNull())
					{
						voCareContext.getEpisodeOfCare().setSpecialty((Specialty) svc.getLocalLookup(Specialty.class, Specialty.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getHospitalService().getValue()));
						if (!voCareContext.getEpisodeOfCare().getSpecialtyIsNotNull())
						{
							throw new HL7Exception("Specialty not found with mapping value = " + pv1.getHospitalService().getValue());
						}
					}
				}
			}
		}
		
		getADT().updateInpatient(episVo, voCareContext);
	}

	private void updateDischargeDetails(Patient patVo, DischargedEpisodeVo dischVo, Message msg, PV1 pv1,ProviderSystemVo providerSystem) throws Exception
	{
		fillDischargeFromMsg(dischVo, msg, getOrgLoc(), getHcpAdmin(),providerSystem);
		
		dischVo.getPasEvent().setPatient(patVo);
		String[] errs = dischVo.validate();
		if (errs != null)
		{
			throw new HL7Exception("Validation of Admission failed. " + VoMapper.toDisplayString(errs));				
		}
		
		// wdev-8924 - Validate Patient too
		errs = patVo.validate();
		if (errs != null)
		{
			throw new HL7Exception("Validation of Patient failed. " + VoMapper.toDisplayString(errs));				
		}
		
		//WDEV-10231
		CareContextInterfaceVo voCareContext = null;
		if(ConfigFlag.HL7.INSTANTIATE_EPISODE_FROM_ADT.getValue() || ConfigFlag.HL7.INPATIENT_EPISODE_MANAGEMENT_FROM_PAS.getValue())
		{
			if(dischVo != null && dischVo.getPasEventIsNotNull())
			{
				voCareContext = getADT().getCareContextByPasEvent(dischVo.getPasEvent());
				if(voCareContext != null)
				{
					// WDEV-13901 may need to create the history record
					// check if history records required for CC and EpisodeOfCare 
					voCareContext = createHistoryCareContextAndEpis(voCareContext, true, pv1, providerSystem.getCodeSystem().getText());

					voCareContext.setEndDateTime(dischVo.getPasEvent().getEventDateTime());
					voCareContext.setResponsibleHCP(dischVo.getPasEvent().getConsultant());
					voCareContext.getEpisodeOfCare().setResponsibleHCP(dischVo.getPasEvent().getConsultant());
					if(voCareContext.getEpisodeOfCareIsNotNull() && providerSystem != null &&  providerSystem.getCodeSystemIsNotNull())
						voCareContext.getEpisodeOfCare().setSpecialty((Specialty) svc.getLocalLookup(Specialty.class, Specialty.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getHospitalService().getValue()));

					if (pv1.getAdmitDateTime().getTimeOfAnEvent() != null && pv1.getAdmitDateTime().getTimeOfAnEvent().getValue() != null)
					{
						Date newStartDate = new Date(pv1.getAdmitDateTime().getTimeOfAnEvent().getValue().substring(0,8), DateFormat.ISO);
						voCareContext.setStartDateTime(new DateTime(pv1.getAdmitDateTime().getTimeOfAnEvent().getValue()));
						voCareContext.getEpisodeOfCare().setStartDate(newStartDate);
						voCareContext.getEpisodeOfCare().getCareSpell().setStartDate(newStartDate);
					}				

				}
			}
		}
	
		getADT().dischargePatient(patVo, dischVo, voCareContext);	
	}

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}

}
