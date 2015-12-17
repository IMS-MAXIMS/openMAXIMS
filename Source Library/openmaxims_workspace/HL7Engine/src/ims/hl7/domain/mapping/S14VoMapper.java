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

import ims.RefMan.vo.CatsReferralListVo;
import ims.clinical.helper.HL7ClinicListWithICPActions;
import ims.core.vo.Patient;
import ims.core.vo.lookups.MsgEventType;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.utils.DateTime;
import ims.framework.utils.Time;
import ims.hl7.domain.EventResponse;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.scheduling.vo.Appointment_StatusVo;
import ims.scheduling.vo.Appointment_StatusVoCollection;
import ims.scheduling.vo.Appt_Tracking_Status_HistoryVo;
import ims.scheduling.vo.Appt_Tracking_Status_HistoryVoCollection;
import ims.scheduling.vo.Booking_AppointmentVo;
import ims.scheduling.vo.SessionSlotVo;
import ims.scheduling.vo.lookups.AppointmentTrackingStatus;
import ims.scheduling.vo.lookups.Status_Reason;
import ims.vo.interfaces.IHL7OutboundMessageHandler;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.SIU_S12;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.model.v24.segment.SCH;

public class S14VoMapper extends VoMapper
{
	private static final Logger	LOG	= Logger.getLogger(S14VoMapper.class);
	private S12VoMapper s12Vomapper;

	@Override
	public Message populateMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		//WDEV-20112
		EventResponse response = new EventResponse(); //WDEV-20112
		
		SIU_S12 S14=(SIU_S12)msg;
		SCH sch=S14.getSCH();
		PID pid=S14.getSIU_S12_PIDPD1PV1PV2OBXDG1().getPID();
		
		String apptIDStr = sch.getFillerAppointmentID().getEntityIdentifier().getValue();
		//WDEV-22425 
//		Integer appIdInt = Integer.parseInt(apptIDStr);
		/* 
		 * Ensure that non integer appt id is caught. String extAppIdStr will be used to locate appointment instead
		 */
		Integer appIdInt = null;
		try
		{
			appIdInt = Integer.parseInt(apptIDStr);
		}
		catch (NumberFormatException e)
		{
			LOG.debug("S14VoMapper: Appointment ID in SCH-2 is not an integer");
			appIdInt = null;
		} //WDEV-22425
		
		//WDEV-20658
		String extAppIdStr = sch.getFillerAppointmentID().getEntityIdentifier().getValue(); //WDEV-20658
		
		//WDEV-22425 Ensure that SCH-6 has a value
//		MsgEventType type =  (MsgEventType) svc.getLocalLookup(MsgEventType.class, MsgEventType.TYPE_ID, providerSystem.getCodeSystem().getText(), sch.getEventReason().getIdentifier().getValue().trim());
		MsgEventType type = null;
		if (sch.getEventReason().getIdentifier().getValue() != null)
		{
			type =  (MsgEventType) svc.getLocalLookup(MsgEventType.class, MsgEventType.TYPE_ID, providerSystem.getCodeSystem().getText(), sch.getEventReason().getIdentifier().getValue().trim());
		}
		else
		{
			throw new HL7Exception("S14 mapper SCH-6 (Event Reason) needs to have a mapped value");
		} //WDEv-22425
		
		
		Patient patientFromMsg = null;
		
		if (pid.getPatientIdentifierList().length != 0)
		{
			patientFromMsg = getPrimaryIdFromPid(pid,providerSystem);
			//WDEV-20112
			if (patientFromMsg != null)
			{
				try
				{
					Patient patVo2 = getDemog().getPatient(patientFromMsg);
					if (patVo2 != null)
					{
						response.setPatient(patVo2);
					}
				}
				catch (StaleObjectException e)
				{
//					response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
				}
			} //WDEV-20112
		}
		
		if (type != null 
				&& type.getID() == MsgEventType.S14.getID())
		{
			//WDEV-20658
			// Extra string value (extAppIdStr) for appointment ID passed to method
//			updateBooking(patientFromMsg, null, appIdInt, Status_Reason.ARRIVAL, AppointmentTrackingStatus.PATIENT_ARRIVED, false);
			updateBooking(patientFromMsg, null, appIdInt, extAppIdStr, Status_Reason.ARRIVAL, AppointmentTrackingStatus.PATIENT_ARRIVED, false); //WDEV-20658
		}
		else if (type != null 
				&& type.getID() == MsgEventType.S14UNARRIVE.getID())
		{
			//WDEV-20658
//			updateBooking(patientFromMsg, null, appIdInt, Status_Reason.BOOKED, AppointmentTrackingStatus.UNDO_ARRIVAL, false);
			updateBooking(patientFromMsg, null, appIdInt, extAppIdStr, Status_Reason.BOOKED, AppointmentTrackingStatus.UNDO_ARRIVAL, false); //WDEV-20658
		}
		else
		{
			
		}
		
		//WDEV-20112
//		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		return ack;
		response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
	}
	
	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		s12Vomapper = (S12VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.S12);
		if(s12Vomapper==null)
		{
			throw new HL7Exception("S14 mapper requires S12 mapper. S12 mapper not found in list of registered mappers.");			
		}
		SIU_S12 S14=(SIU_S12)s12Vomapper.populateMessage(event);
		populateMSH( event.getProviderSystem(),  S14.getMSH(),Long.toString( new java.util.Date().getTime()),"SIU","S14");
		return S14;
	}
	
	
	//WDEV-20658
//	private void updateBooking(Patient patientFromMsg, Time arrivalTime, Integer apptId, Status_Reason stat, AppointmentTrackingStatus trackingStatus, boolean requiresNewTCI) throws HL7Exception 
	private void updateBooking(Patient patientFromMsg, Time arrivalTime, Integer apptId, String extAppIdStr, Status_Reason stat, AppointmentTrackingStatus trackingStatus, boolean requiresNewTCI) throws HL7Exception 
	{
		Boolean isUndoDNA = false;
		Boolean isUndoArrival = false;
		Boolean isFirstApptActivityforDNA = false;
		HL7ClinicListWithICPActions domain = null;
		
		try 
		{
			domain = (HL7ClinicListWithICPActions)getDomainImpl("ims.clinical.domain.impl.ClinicListwithICPActionsImpl");
		} 
		catch (Exception e1) 
		{
			LOG.warn(e1.getMessage(), e1);
		}
		
		//WDEV-20658
		// First attempt to obtain Booking Appointment VO using string value of appointment ID.
		// This will try to select appointment using column externalID on object schl_sch_booking
		// If NULL returned, use the integer value of the appointment ID and attempt to obtain 
		// row using id.0
//		Booking_AppointmentVo voBooking = adt.getBookingAppointment(apptId);
		Booking_AppointmentVo voBooking = null;
		voBooking = adt.getBookingAppointmentWithExternalId(extAppIdStr);
		if (voBooking == null)
			voBooking = adt.getBookingAppointment(apptId); //WDEV-20658
	
		if (voBooking == null)
		{
			LOG.warn("No Booking Found for ID."+apptId);
			throw new HL7Exception("No Booking Found for ID."+apptId);
		}
		
		//WDEV-23583
		/*
		 * If arriving a patient and the appointment status has already been marked as Arrived or Seen
		 * do not set the status back (do not process message)
		 */
		if (Status_Reason.ARRIVAL.equals(stat)
				&& voBooking.getApptStatusIsNotNull()
				&& (Status_Reason.ARRIVAL.equals(voBooking.getApptStatus())
						|| Status_Reason.SEEN.equals(voBooking.getApptStatus())))
		{
			if (Status_Reason.ARRIVAL.equals(voBooking.getApptStatus()))
			{
				adt.createSystemLogEntry(SystemLogType.HL7, SystemLogLevel.INFORMATION, "Inbound HL7 S14 message for Appointment: " 
						+ apptId 
						+ ". Appt has already been Arrived. Message not processed");
				LOG.warn("Appointment: " + apptId + " has already been Arrived");
			}
			if (Status_Reason.SEEN.equals(voBooking.getApptStatus()))
			{
				adt.createSystemLogEntry(SystemLogType.HL7, SystemLogLevel.INFORMATION, "Inbound HL7 S14 message for Appointment: " 
							+ apptId 
							+ ". Appt has already been Seen. Message not processed");
				LOG.warn("Appointment: " + apptId + " has already been Seen");
			}
		} 
		else
		{
			String matchingPatientID = demog.validatePatient(patientFromMsg,voBooking.getPatient()); //WDEV-19142
			if (null == matchingPatientID)
			{
				LOG.warn("Patient mismatch between appointment and message for filler . "+apptId);
				throw new HL7Exception("Patient mismatch between appointment and message for filler . "+apptId);
			}
			
			CatsReferralListVo voCats = domain.getCatsReferral(voBooking);
			if (voCats == null)
			{
				LOG.warn("No Referral Found for ID."+apptId);
				throw new HL7Exception("No Referral Found for ID."+apptId);
			}
			
			SessionSlotVo sessionSlot = null;
			voBooking.setApptStatus(stat);
			
			Appointment_StatusVo voStatus = new Appointment_StatusVo();
			voStatus.setApptDate(voBooking.getAppointmentDate());
			voStatus.setApptTime(voBooking.getApptStartTime());
			voStatus.setStatusChangeDateTime(new DateTime());
			voStatus.setSession(voBooking.getSession()); //WDEV-23185
			voStatus.setStatus(stat);
			
			Appointment_StatusVoCollection voCollStatusHistory = voBooking.getApptStatusHistory();
			if(voCollStatusHistory == null)
				voCollStatusHistory =  new Appointment_StatusVoCollection();
			
			voCollStatusHistory.add(voStatus);
			voBooking.setCurrentStatusRecord(voStatus); 
			voBooking.setApptStatusHistory(voCollStatusHistory);

			if (stat.equals(Status_Reason.ARRIVAL))
			{
				if (arrivalTime == null)
					voBooking.setArrivalTime(new Time());
				else
					voBooking.setArrivalTime(arrivalTime);
				
				voBooking.setSeenBy(null);
				voBooking.setSeenTime(null);
			}

			
			//WDEV-11665
			populateAppointmentWithTrackingStatus(voBooking, trackingStatus);
			
			String[] error = voBooking.validate();
			if (error != null)
			{
				LOG.warn(getErrors(error));
				throw new HL7Exception(getErrors(error)); 
			}
			error = voCats.validate(error);
			if (error != null)
			{
				LOG.warn(getErrors(error));
				throw new HL7Exception(getErrors(error));
			}
			try 
		 	{
				domain.saveOPEpisode(voBooking, voCats, sessionSlot, null, isFirstApptActivityforDNA, isUndoDNA, isUndoArrival);
			} 
		 	catch (StaleObjectException e) 
		 	{
		 		LOG.warn(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue(), e);
		 		throw new HL7Exception(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			} 
		 	catch (DomainInterfaceException e) 
		 	{
		 		LOG.warn(e.getMessage(), e);
		 		throw new HL7Exception(e.getMessage());
			}

		} //WDEV-23583
		

//		String matchingPatientID = demog.validatePatient(patientFromMsg,voBooking.getPatient()); //WDEV-19142
//		if (null == matchingPatientID)
//		{
//			LOG.warn("Patient mismatch between appointment and message for filler . "+apptId);
//			throw new HL7Exception("Patient mismatch between appointment and message for filler . "+apptId);
//		}
//		
//		CatsReferralListVo voCats = domain.getCatsReferral(voBooking);
//		if (voCats == null)
//		{
//			LOG.warn("No Referral Found for ID."+apptId);
//			throw new HL7Exception("No Referral Found for ID."+apptId);
//		}
//		
//		SessionSlotVo sessionSlot = null;
//		voBooking.setApptStatus(stat);
//		
//		Appointment_StatusVo voStatus = new Appointment_StatusVo();
//		voStatus.setApptDate(voBooking.getAppointmentDate());
//		voStatus.setApptTime(voBooking.getApptStartTime());
//		voStatus.setStatusChangeDateTime(new DateTime());
//		voStatus.setSession(voBooking.getSession()); //WDEV-23185
//		voStatus.setStatus(stat);
//		
//		Appointment_StatusVoCollection voCollStatusHistory = voBooking.getApptStatusHistory();
//		if(voCollStatusHistory == null)
//			voCollStatusHistory =  new Appointment_StatusVoCollection();
//		
//		voCollStatusHistory.add(voStatus);
//		voBooking.setCurrentStatusRecord(voStatus); 
//		voBooking.setApptStatusHistory(voCollStatusHistory);
//
//		if (stat.equals(Status_Reason.ARRIVAL))
//		{
//			if (arrivalTime == null)
//				voBooking.setArrivalTime(new Time());
//			else
//				voBooking.setArrivalTime(arrivalTime);
//			
//			voBooking.setSeenBy(null);
//			voBooking.setSeenTime(null);
//		}
//
//		
//		//WDEV-11665
//		populateAppointmentWithTrackingStatus(voBooking, trackingStatus);
//		
//		String[] error = voBooking.validate();
//		if (error != null)
//		{
//			LOG.warn(getErrors(error));
//			throw new HL7Exception(getErrors(error)); 
//		}
//		error = voCats.validate(error);
//		if (error != null)
//		{
//			LOG.warn(getErrors(error));
//			throw new HL7Exception(getErrors(error));
//		}
//		try 
//	 	{
//			domain.saveOPEpisode(voBooking, voCats, sessionSlot, null, isFirstApptActivityforDNA, isUndoDNA, isUndoArrival);
//		} 
//	 	catch (StaleObjectException e) 
//	 	{
//	 		LOG.warn(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue(), e);
//	 		throw new HL7Exception(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
//		} 
//	 	catch (DomainInterfaceException e) 
//	 	{
//	 		LOG.warn(e.getMessage(), e);
//	 		throw new HL7Exception(e.getMessage());
//		}
	}
	
	
	private String getErrors(String[] validateErrors) 
	{
		if(validateErrors == null || validateErrors.length == 0)
			return null;
		
		String errors = "";
		
		for(int i=0; i<validateErrors.length; i++)
		{
			errors += validateErrors[i] + " ";
		}
		
		return errors;
	}

	//WDEV-11665 - starts here
	private void populateAppointmentWithTrackingStatus(Booking_AppointmentVo voBooking, AppointmentTrackingStatus trackingStatus) 
	{
		if(voBooking == null || trackingStatus == null)
			return;
		
		Appt_Tracking_Status_HistoryVoCollection trackingCollection = voBooking.getApptTrackingStatusHistory();
		
		if(trackingCollection == null)
			trackingCollection = new Appt_Tracking_Status_HistoryVoCollection();
		
		Appt_Tracking_Status_HistoryVo newTrackingStatus = new Appt_Tracking_Status_HistoryVo();
		newTrackingStatus.setTrackingStatus(trackingStatus);
		newTrackingStatus.setApptDate(voBooking.getAppointmentDate());
		newTrackingStatus.setApptTime(voBooking.getApptStartTime());
		newTrackingStatus.setStatusChangeDateTime(new DateTime());
		
		newTrackingStatus.setChangedBy(null);
		
		trackingCollection.add(newTrackingStatus);
		voBooking.setApptTrackingStatusHistory(trackingCollection);
	}
	//WDEV-11665 - ends here

	

}
