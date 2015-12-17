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

import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.vo.HL7ReferralVo;
import ims.core.vo.MedicLiteVo;
import ims.core.vo.Patient;
import ims.core.vo.ReferralLiteVo;
import ims.core.vo.lookups.ReferralType;
import ims.core.vo.lookups.Specialty;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.utils.DateTime;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.pathways.domain.HL7PathwayIf;
import ims.pathways.vo.EventVo;
import ims.pathways.vo.ExternalEventMappingVo;
import ims.pathways.vo.PathwayClockVo;
import ims.pathways.vo.PathwayClockVoCollection;
import ims.pathways.vo.PathwayLiteVo;
import ims.pathways.vo.PatientEventVo;
import ims.pathways.vo.PatientJourneyVo;
import ims.pathways.vo.RTTEventVo;
import ims.pathways.vo.lookups.EventStatus;
import ims.pathways.vo.lookups.PathwaysDetail;
import ims.pathways.vo.lookups.PathwaysGroup;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.group.PPG_PCG_PTHNTEVARROLVARGOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR;
import ca.uhn.hl7v2.model.v24.group.PPG_PCG_PV1PV2;
import ca.uhn.hl7v2.model.v24.segment.GOL;
import ca.uhn.hl7v2.model.v24.segment.PTH;
import ca.uhn.hl7v2.model.v24.segment.PV1;

/**
 * WDEV-3569
 * PCGVoMapper.java
 * This class is used to parse the Patient Pathway RTT message
 * and populate the Value Object to instantiate the Patient Event
 * @author bworwood
 *
 */
public class PCGVoMapper extends VoMapper {
	
	protected HL7PathwayIf	hL7PathwayIf=null;
	private static final String AMEND_CLOCK_START="AS";

	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception 
	{
		try
		{
			if (hL7PathwayIf == null)
				hL7PathwayIf = (HL7PathwayIf) getDomainImpl("ims.pathways.domain.impl.HL7PathwayIfImpl");
			processMessage(msg, providerSystem);
		}
		catch (Exception ex)
		{
			return HL7Utils.buildRejAck(msg.get("MSH"), ex.getClass().getName() + " occurred. " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}

		Message ack = HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;	
	}

	private void processMessage(Message msg, ProviderSystemVo providerSystem) throws Exception 
	{
		PPG_PCG_PTHNTEVARROLVARGOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR ppg = (PPG_PCG_PTHNTEVARROLVARGOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) msg.get("PPG_PCG_PTHNTEVARROLVARGOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR");
		MessageEvent messageEvent = new MessageEvent();

		PTH pth = ppg.getPTH();
		GOL gol = ppg.getPPG_PCG_GOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR(0).getGOL();
		PPG_PCG_PV1PV2 pv12 = (PPG_PCG_PV1PV2) msg.get("PPG_PCG_PV1PV2");
		
		// IF this is a delete pathway event, we simply want to end the journey,
		// so we will not attempt to go and get any mappings, events etc..
		// PTH-01 If the action code is to delete this Journey, then set the status to cancelled
		String actionCode = pth.getActionCode().getValue();
		if (actionCode != null && actionCode.equalsIgnoreCase("DE"))
		{
			ReferralLiteVo referral = new ReferralLiteVo();
			referral.setExtReferralKey(gol.getGoalInstanceID().getEntityIdentifier().getValue());
			if (!referral.getExtReferralKeyIsNotNull() || referral.getExtReferralKey().equalsIgnoreCase("NA"))
				throw new HL7Exception("Invalid Referral Key provided (GOL-4) - Pathway cannot be deleted");
			
			PatientJourneyVo journey = hL7PathwayIf.getPatientJourney(referral);
			if (journey != null)
				hL7PathwayIf.endPatientJourney(journey);
			return;
		}
		
		// Identify the Patient, Register if required
		Patient patient = savePatient(msg, providerSystem);
		messageEvent.patient = patient;
		
		Boolean unlink=false;  // wdev-7351 needed if updating a previous patient event
		
		EventVo event=null;
		ExternalEventMappingVo extMapVo=null;
		// Get the Group value from GOL-09 - A value of RTT will indicate that this is a RTT Status event,
		// so we need to get the Event via RTT and not ExternalEventMappings
		PathwaysGroup pthGroupLkp =(PathwaysGroup) svc.getLocalLookup(PathwaysGroup.class, PathwaysGroup.TYPE_ID, providerSystem.getCodeSystem().getText(), gol.getGoalClassification().getIdentifier().getValue()); 
		if (pthGroupLkp != null && pthGroupLkp.getId() == PathwaysGroup.RTT.getId())
		{
			RTTEventVo rttVo = buildRttEvent(messageEvent, providerSystem, gol, pv12.getPV1());
			if (rttVo != null)
			{
				event = hL7PathwayIf.getEventByRttValues(rttVo);
				messageEvent.rttEvent = rttVo;
			}
		}
		else
		{
			// First of all we need to identify the event by the External Event Mapping values
			extMapVo = buildExternalEvent(messageEvent, providerSystem, ppg, pv12.getPV1(), gol);
			if (extMapVo != null)
			{
				extMapVo.setGroup(pthGroupLkp);
				event = hL7PathwayIf.getEventByExternalMappings(extMapVo);
				messageEvent.extMap = extMapVo;
				
				// wdev-7351, if this is an unlink event, we want to update previous event to unlinked rather then cancelled
				String unlinkVal=gol.getGoalClassification().getText().getValue();
				if (unlinkVal != null && unlinkVal.startsWith("LU"))
					unlink=true;
			}
		}
		
		
		if (event == null)  
			throw new HL7Exception("Event not found matching these mapping values - message rejected");
		
		// wdev-3933
		// If there is data found in the 3rd and 4th component of PV1-19, this is either
		// a rearrange or a cancellation.  We want to set the status of the original event to cancelled
		PV1 pv1 = pv12.getPV1();
		if (pv1 != null && pv1.getVisitNumber() != null)
		{
			// Get Component 3 and 4
			messageEvent.originalClinicCode = pv1.getVisitNumber().getCodeIdentifyingTheCheckDigitSchemeEmployed().getValue();  // Component 3
			String originalDateTime = pv1.getVisitNumber().getAssigningAuthority().getNamespaceID().getValue(); // Component 4
			if (originalDateTime != null)
				messageEvent.originalScheduledDateTime = new DateTime(originalDateTime);
		}
		
		
		messageEvent.event = event;
		messageEvent.messageId = HL7Utils.getMessageId(msg);
		messageEvent.referralKey = gol.getGoalInstanceID().getEntityIdentifier().getValue();  // GOL-4 Referral Key
		messageEvent.non18weekPway=false;
		String val = gol.getGoalListPriority().getValue();
		if (val != null && val.equals("2"))  // This is a pseudo Pathway
			messageEvent.non18weekPway=true;
		messageEvent.eventDateTime = populateDateTimeVoFromTS(gol.getActionDateTime());  // GOL-2 Event Date
		messageEvent.scheduleDateTime = populateDateTimeVoFromTS(pv12.getPV1().getAdmitDateTime());  // PV1-44 Admission/Attendance/TCI Date/Time
				
		// PTH-2 and PTH-3 Check to see if the Pathway already exists within this system
		messageEvent.extClockId = pth.getPathwayID().getIdentifier().getValue();
		messageEvent.extClockName = pth.getPathwayInstanceID().getEntityIdentifier().getValue();
		// If NA is the value for extClockId, this is an event only without pathway
		if (messageEvent.extClockId != null && !messageEvent.extClockId.equalsIgnoreCase("NA") &&
				(messageEvent.referralKey != null && !messageEvent.referralKey.equals("NA")))  // wdev-14066
		{
			ReferralLiteVo referral = new ReferralLiteVo();
			referral.setExtReferralKey(messageEvent.referralKey);
			PatientJourneyVo journey = hL7PathwayIf.getPatientJourney(referral);

			// If the Patient Journey is null, we want to create one
			try
			{
				
				if (journey == null)  
				{
					// 	GOL-7 Patient Journey Start Date
					
					// WDEV-11723 The referral may already exist from an REF message,
					// so check prior to instantiating a new one
					HL7ReferralVo hl7Referral = hL7PathwayIf.getReferralByPatientAndRKEY(patient, messageEvent.referralKey);
					if (hl7Referral != null)
					{
						referral = hl7Referral;
						hl7Referral.setClockId("PWID " + messageEvent.extClockId);
						hl7Referral.validate();
						referral = hL7PathwayIf.saveReferral(hl7Referral);  // WDEV-13493 re-assign referral with latest version
					}
					else
					{
						referral = new ReferralLiteVo();
						referral.setExtReferralKey(messageEvent.referralKey);
						referral.setPatient(messageEvent.patient);
						referral.setReferralType(ReferralType.EXTERNAL);
						referral.setAuthoringDateTime(populateDateTimeVoFromTS(pth.getPathwayEstablishedDateTime()));  // PTH-4 Established date for referral
						referral.setReferralReceivedDate(populateDateVoFromTS(gol.getGoalLifeCycleStatusDateTime()));  // GOL-19
						referral.setOriginalReferralDate(populateDateVoFromTS(gol.getCurrentGoalReviewDateTime())); // GOL-12
						// wdev-3815 referral.setDetails(gol.getGoalEvaluationComment(0).getValue());  // GOL-17 Referral text
						// wdev-7327 - Add clockId to the details
						referral.setDetails("PWID " + messageEvent.extClockId);
						referral.setClockId("PWID " + messageEvent.extClockId);
					}
					journey = new PatientJourneyVo();
					journey.setPatient(patient);
					journey.setStartDate(populateDateVoFromTS(pth.getPathwayEstablishedDateTime()));
					journey.setTargetEndDate(populateDateVoFromTS(gol.getExpectedGoalAchieveDateTime())); // GOl-8
					journey.setExtReferralKey(messageEvent.referralKey);
					journey.setResponsibleConsultant(messageEvent.pathwayConsultant);  // wdev-4508
					PathwayClockVo clock = new PathwayClockVo();
					clock.setExtClockId(messageEvent.extClockId);
					clock.setExtClockName(messageEvent.extClockName);
					clock.setStartDate(journey.getStartDate());
					journey.setCurrentClock(clock);
					if (!journey.getClockHistoryIsNotNull())
						journey.setClockHistory(new PathwayClockVoCollection());
					journey.getClockHistory().add(clock);

					try {
						journey = hL7PathwayIf.createPatientJourney(journey, referral, messageEvent.pathwaySpecialty, messageEvent.pathwayConsultant, messageEvent.non18weekPway);
					} catch (DomainInterfaceException e) {
						throw new HL7Exception(e.getMessage(), e);
					}
				}
				else
				{
					messageEvent.journey = journey;
					
					// WDEV-14066 - updating a journey, validate the patients are the same
					if (!messageEvent.journey.getPatient().getID_Patient().equals(patient.getID_Patient()))
						throw new HL7Exception("Patient mismatch between this message and existing recorded journey - message rejected");
					
					// wdev-7919 If the pathway type for this is pseudo and the actual pathway is non-pseudo
					// or vice-versa, change the pathway type just as the option to Associate Another Pathway with Journey does
					PathwayLiteVo newPathway =null;
					if (messageEvent.non18weekPway != null && messageEvent.non18weekPway.booleanValue() == true)
					{
						// Current is standard
						if (messageEvent.journey != null && (!messageEvent.journey.getPathway().getIsNon18WeekIsNotNull() ||
															messageEvent.journey.getPathway().getIsNon18Week().booleanValue() == false))
						{
							// Update Pathway Type to non-standard i.e. non-18 week for Specialty
							// Get the pseudi pathway for this specialty
							newPathway = hL7PathwayIf.findPseudoPathway(messageEvent.eventSpecialty);
						}
					}
					else
					{
						if (messageEvent.journey != null && messageEvent.journey.getPathway().getIsNon18WeekIsNotNull() &&
								messageEvent.journey.getPathway().getIsNon18Week().booleanValue() == true)
						{
							// Update Pathway Type to standard 18 week i.e. default for Specialty
							// Get the pathway for this specialty
							newPathway = hL7PathwayIf.findDefaultPathway(messageEvent.eventSpecialty);

						}
					}
					if (newPathway != null)
					{
						journey = hL7PathwayIf.updatePatientJourney(messageEvent.journey, newPathway);
					}

					
					// Journey is not null, but it might be a new clock, so check to see if we
					// need to start a new one
					if (!messageEvent.extClockId.equals(journey.getCurrentClock().getExtClockId()))
					{
						if (!journey.getCurrentClock().getStopDateIsNotNull())
							journey.getCurrentClock().setStopDate(messageEvent.eventDateTime.getDate());
						// Clock is different
						PathwayClockVo newClock = new PathwayClockVo();
						newClock.setExtClockId(messageEvent.extClockId);
						newClock.setExtClockName(messageEvent.extClockName);
						newClock.setStartDate(messageEvent.eventDateTime.getDate());
							
						journey.setCurrentClock(newClock);
						journey.getClockHistory().add(newClock);
						journey.setTargetEndDate(populateDateVoFromTS(gol.getExpectedGoalAchieveDateTime())); // GOL-8 may be a new TargetEndDate
							
					}
				}
					
				// wdev-7264 If this is an AMEND Clock Start, we want to store the new clock start in the scheduledDateTime
				if (messageEvent.rttEvent != null && messageEvent.rttEvent.getPASCodeIsNotNull() && messageEvent.rttEvent.getPASCode().equals(AMEND_CLOCK_START))
					messageEvent.scheduleDateTime = populateDateTimeVoFromTS(pth.getPathwayEstablishedDateTime());
					

				// We need to instantiate the Patient Event record linked to the Patient Journey
				messageEvent.journey = journey;
				messageEvent.journey  =	recordPatientEvent(messageEvent, gol);
							
			}
			catch (StaleObjectException e)
			{
				throw new HL7Exception("StaleObjectException occurred Creating Patient Pathway Journey - " + e.getMessage(), e);
			}

		}
		else
			messageEvent.journey  =	recordPatientEvent(messageEvent, gol);  // Record Patient Event only for non-pathway items
		
		
		// wdev-3933 If the original values are set, we want to update another event
		if (messageEvent.originalClinicCode != null && messageEvent.originalScheduledDateTime != null)
		{
			try
			{
				// wdev-7351 - If this is an unlink, we want to set the previous status to Unlinked, otherwise, set it to cancelled
				if (unlink)
					hL7PathwayIf.updatePatientEvent(messageEvent.patient, messageEvent.originalClinicCode, messageEvent.originalScheduledDateTime, EventStatus.UNLINKED_EVT);
				else
					hL7PathwayIf.updatePatientEvent(messageEvent.patient, messageEvent.originalClinicCode, messageEvent.originalScheduledDateTime, EventStatus.CANCELLED_EVT);
			}
			catch (DomainInterfaceException e)
			{
				throw new HL7Exception(e.getMessage(), e);
			}
		}

		// Message Processed
		return;
	}

	private RTTEventVo buildRttEvent(MessageEvent messageEvent, ProviderSystemVo providerSystem, GOL gol, PV1 pv1) throws HL7Exception, DomainInterfaceException
	{
		RTTEventVo rttVo = new RTTEventVo();
		rttVo.setProviderSystem(providerSystem);
		rttVo.setPASCode(gol.getCurrentGoalReviewStatus().getIdentifier().getValue());
		rttVo.setNationalCode(gol.getCurrentGoalReviewStatus().getNameOfCodingSystem().getValue());
		
		// Specialty GOL-10 component 0 is the pathwaySpecialty, component 1 is the current event's specialty
		messageEvent.pathwaySpecialty = (Specialty) svc.getLocalLookup(Specialty.class, Specialty.TYPE_ID, providerSystem.getCodeSystem().getText(), gol.getGoalManagementDiscipline().getIdentifier().getValue());
		messageEvent.eventSpecialty = (Specialty) svc.getLocalLookup(Specialty.class, Specialty.TYPE_ID, providerSystem.getCodeSystem().getText(), gol.getGoalManagementDiscipline().getAlternateIdentifier().getValue());
		if (messageEvent.eventSpecialty == null)
			messageEvent.eventSpecialty = messageEvent.pathwaySpecialty;

		// PV1-09 contains the consultant for this rttEvent and Pathway 
		String pathwayConsultant = pv1.getConsultingDoctor(0).getIDNumber().getValue();
		if (pathwayConsultant == null || pathwayConsultant.equals(VoMapper.Hl7Null))
		{
			pathwayConsultant = pv1.getConsultingDoctor(1).getIDNumber().getValue();
		}
		if (pathwayConsultant != null)
		{
			MedicLiteVo medLite=null;
			if (medLite == null)
			{
				// 	Check to see if the pas code has been specified in second repetition of consulting doctor, try this if found
				medLite = hcpAdmin.getMedicLiteByExternalCode(TaxonomyType.PAS, pathwayConsultant);
				if (medLite == null)
				{
					// Try the second repetition for national consultant code
					medLite = hcpAdmin.getMedicLiteByExternalCode(TaxonomyType.NAT_CONS_CODE, pathwayConsultant);
				}
			}
			messageEvent.pathwayConsultant=medLite;
		}
		
		
		String rttEventConsultant = pv1.getConsultingDoctor(2).getIDNumber().getValue();
		if (rttEventConsultant == null || rttEventConsultant.equals(VoMapper.Hl7Null))
		{
			rttEventConsultant = pv1.getConsultingDoctor(3).getIDNumber().getValue();
		}
		
		if (rttEventConsultant != null)
		{
			MedicLiteVo medLite=null;
			if (medLite == null)
			{
				// 	Check to see if the pas code has been specified in second repetition of consulting doctor, try this if found
				medLite = hcpAdmin.getMedicLiteByExternalCode(TaxonomyType.PAS, rttEventConsultant);
				if (medLite == null)
				{
					// Try the second repetition for national consultant code
					medLite = hcpAdmin.getMedicLiteByExternalCode(TaxonomyType.NAT_CONS_CODE, rttEventConsultant);
				}
			}
			messageEvent.eventConsultant=medLite;
		}
	
		// PV1-03 Clinic Code
		messageEvent.clinicCode =pv1.getAssignedPatientLocation().getPointOfCare().getValue(); 
		
		// See if a record exists matching these values
		return hL7PathwayIf.getRttMapping(rttVo);
		
	}

	private PatientJourneyVo recordPatientEvent(MessageEvent messageEvent, GOL gol) throws Exception 
	{
		PatientEventVo patEvent = new PatientEventVo();
		patEvent.setActionCode(gol.getActionCode().getValue());
		patEvent.setClinicCode(messageEvent.clinicCode);
		patEvent.setConsultant(messageEvent.eventConsultant);
		patEvent.setDescription(gol.getGoalEvaluationComment(0).getValue());  // GOL-17 Event Description
		patEvent.setEvent(messageEvent.event);
		patEvent.setEventDateTime(messageEvent.eventDateTime);
		patEvent.setExternalEvent(messageEvent.extMap);
		String externalEventId = gol.getGoalID().getIdentifier().getValue();
		if (externalEventId != null && !externalEventId.equals("NA"))
			patEvent.setExternalEventId(new Integer(externalEventId)); // GOL-3 Goal ID = Unique external Id
		patEvent.setJourney(messageEvent.journey);
		patEvent.setMessageId(messageEvent.messageId);
		patEvent.setSpecialty(messageEvent.eventSpecialty);
		patEvent.setRttExternalEvent(messageEvent.rttEvent);
		patEvent.setPatient(messageEvent.patient);
		patEvent.setScheduledDate(messageEvent.scheduleDateTime);
		
		// wdev-8708 return the journey as it may have been updated
		return (hL7PathwayIf.instantiatePatientEvent(patEvent).getJourney());
	}

	private ExternalEventMappingVo buildExternalEvent(MessageEvent messageEvent, ProviderSystemVo providerSystem, PPG_PCG_PTHNTEVARROLVARGOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR ppg, PV1 pv1, GOL gol) throws HL7Exception, DomainInterfaceException
	{
		ExternalEventMappingVo extMapVo = new ExternalEventMappingVo();
		extMapVo.setProviderSystem(providerSystem);
		
				
		// Group and Detail are lookups, so we need to get the local lookup based on this.
		// GOL-09 The Goal Classification will hold the group and detail values
		extMapVo.setDetail((PathwaysDetail) svc.getLocalLookup(PathwaysDetail.class, PathwaysDetail.TYPE_ID, providerSystem.getCodeSystem().getText(), gol.getGoalClassification().getText().getValue()));
		extMapVo.setGroup((PathwaysGroup) svc.getLocalLookup(PathwaysGroup.class, PathwaysGroup.TYPE_ID, providerSystem.getCodeSystem().getText(), gol.getGoalClassification().getIdentifier().getValue()));
		
		// Specialty GOL-10 component 0 is the pathwaySpecialty, component 1 is the current event's specialty
		messageEvent.pathwaySpecialty  =(Specialty) svc.getLocalLookup(Specialty.class, Specialty.TYPE_ID, providerSystem.getCodeSystem().getText(), gol.getGoalManagementDiscipline().getIdentifier().getValue());
		messageEvent.eventSpecialty = (Specialty) svc.getLocalLookup(Specialty.class, Specialty.TYPE_ID,providerSystem.getCodeSystem().getText(), gol.getGoalManagementDiscipline().getText().getValue());
		if (messageEvent.eventSpecialty == null)
			messageEvent.eventSpecialty=messageEvent.pathwaySpecialty;
		// wdev-3813 - event specialty was not being set correctly
		extMapVo.setSpecialty(messageEvent.eventSpecialty);

		// PV1-07 contains the consultant for this event, it may differ from the Pathway Consultant - PV1-09
		// If it has a value, we use it, otherwise, we use PV1-09
		String pathwayConsultant = pv1.getConsultingDoctor(0).getIDNumber().getValue();
		if (pathwayConsultant == null || pathwayConsultant.equals(VoMapper.Hl7Null))
		{
			pathwayConsultant = pv1.getConsultingDoctor(1).getIDNumber().getValue();
		}
		if (pathwayConsultant != null)
		{
			MedicLiteVo medLite=null;
			if (medLite == null)
			{
				// 	Check to see if the pas code has been specified in second repetition of consulting doctor, try this if found
				medLite = hcpAdmin.getMedicLiteByExternalCode(TaxonomyType.PAS, pathwayConsultant);
				if (medLite == null)
				{
					// Try the second repetition for national consultant code
					medLite = hcpAdmin.getMedicLiteByExternalCode(TaxonomyType.NAT_CONS_CODE, pathwayConsultant);
				}
			}
			messageEvent.pathwayConsultant=medLite;
			extMapVo.setConsultant(medLite);
		}
		
		
		String eventConsultant = pv1.getAttendingDoctor(0).getIDNumber().getValue();
		if (eventConsultant == null || eventConsultant.equals(VoMapper.Hl7Null))
		{
			eventConsultant = pv1.getAttendingDoctor(1).getIDNumber().getValue();
		}
		
		if (eventConsultant != null)
		{
			MedicLiteVo medLite=null;
			if (medLite == null)
			{
				// 	Check to see if the pas code has been specified in second repetition of consulting doctor, try this if found
				medLite = hcpAdmin.getMedicLiteByExternalCode(TaxonomyType.PAS, eventConsultant);
				if (medLite == null)
				{
					// Try the second repetition for national consultant code
					medLite = hcpAdmin.getMedicLiteByExternalCode(TaxonomyType.NAT_CONS_CODE, eventConsultant);
				}
			}
			messageEvent.eventConsultant=medLite;
			extMapVo.setConsultant(medLite);  // The Event Consultant overrides Pathway consultent when identifying events
		}

		// PV1-03 Clinic Code
		extMapVo.setClinicCode(pv1.getAssignedPatientLocation().getPointOfCare().getValue());
		messageEvent.clinicCode = pv1.getAssignedPatientLocation().getPointOfCare().getValue();
		
		return hL7PathwayIf.getExternalEventMappings(extMapVo);
	}
	
	public Message populateMessage() 
	{
		// Pathway Message is inbound only - this method is not required
		return null;
	}

}

// Inner class to store event consultant, specialty etc.. as depending on event type i.e. ExtMap or RTT, it
// could come from a different location
class MessageEvent
{
	HcpRefVo pathwayConsultant;
	HcpRefVo eventConsultant;
	Specialty pathwaySpecialty;
	Specialty eventSpecialty;
	String clinicCode;
	PatientJourneyVo journey;
	PatientRefVo patient;
	EventVo event;
	RTTEventVo rttEvent;
	ExternalEventMappingVo extMap;
	String messageId;
	String extClockId;
	String extClockName;
	String referralKey;
	DateTime eventDateTime;
	DateTime scheduleDateTime;
	Boolean non18weekPway;
	
	String originalClinicCode;
	DateTime originalScheduledDateTime;
}
