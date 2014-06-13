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

/*
 * This code was generated.
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:38
 */
package ims.scheduling.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static AppointmentActionCollection getAppointmentAction(LookupService lookupService) {
		AppointmentActionCollection collection =
			(AppointmentActionCollection) lookupService.getLookupCollection(AppointmentAction.TYPE_ID, 
				AppointmentActionCollection.class, AppointmentAction.class);
		return collection;
	}

	public static AppointmentAction getAppointmentActionInstance(LookupService lookupService, int id) 
	{
		return (AppointmentAction)lookupService.getLookupInstance(AppointmentAction.class, AppointmentAction.TYPE_ID, id);
	}
	

	public static AppointmentTrackingStatusCollection getAppointmentTrackingStatus(LookupService lookupService) {
		AppointmentTrackingStatusCollection collection =
			(AppointmentTrackingStatusCollection) lookupService.getLookupCollection(AppointmentTrackingStatus.TYPE_ID, 
				AppointmentTrackingStatusCollection.class, AppointmentTrackingStatus.class);
		return collection;
	}

	public static AppointmentTrackingStatus getAppointmentTrackingStatusInstance(LookupService lookupService, int id) 
	{
		return (AppointmentTrackingStatus)lookupService.getLookupInstance(AppointmentTrackingStatus.class, AppointmentTrackingStatus.TYPE_ID, id);
	}
	

	public static ExternalSystemEventTypesCollection getExternalSystemEventTypes(LookupService lookupService) {
		ExternalSystemEventTypesCollection collection =
			(ExternalSystemEventTypesCollection) lookupService.getLookupCollection(ExternalSystemEventTypes.TYPE_ID, 
				ExternalSystemEventTypesCollection.class, ExternalSystemEventTypes.class);
		return collection;
	}

	public static ExternalSystemEventTypes getExternalSystemEventTypesInstance(LookupService lookupService, int id) 
	{
		return (ExternalSystemEventTypes)lookupService.getLookupInstance(ExternalSystemEventTypes.class, ExternalSystemEventTypes.TYPE_ID, id);
	}
	

	public static ApptAttStatusCollection getApptAttStatus(LookupService lookupService) {
		ApptAttStatusCollection collection =
			(ApptAttStatusCollection) lookupService.getLookupCollection(ApptAttStatus.TYPE_ID, 
				ApptAttStatusCollection.class, ApptAttStatus.class);
		return collection;
	}

	public static ApptAttStatus getApptAttStatusInstance(LookupService lookupService, int id) 
	{
		return (ApptAttStatus)lookupService.getLookupInstance(ApptAttStatus.class, ApptAttStatus.TYPE_ID, id);
	}
	

	public static OutcomeActionCollection getOutcomeAction(LookupService lookupService) {
		OutcomeActionCollection collection =
			(OutcomeActionCollection) lookupService.getLookupCollection(OutcomeAction.TYPE_ID, 
				OutcomeActionCollection.class, OutcomeAction.class);
		return collection;
	}

	public static OutcomeAction getOutcomeActionInstance(LookupService lookupService, int id) 
	{
		return (OutcomeAction)lookupService.getLookupInstance(OutcomeAction.class, OutcomeAction.TYPE_ID, id);
	}
	

	public static Session_Status_and_ReasonCollection getSession_Status_and_Reason(LookupService lookupService) {
		Session_Status_and_ReasonCollection collection =
			(Session_Status_and_ReasonCollection) lookupService.getLookupCollection(Session_Status_and_Reason.TYPE_ID, 
				Session_Status_and_ReasonCollection.class, Session_Status_and_Reason.class);
		return collection;
	}

	public static Session_Status_and_Reason getSession_Status_and_ReasonInstance(LookupService lookupService, int id) 
	{
		return (Session_Status_and_Reason)lookupService.getLookupInstance(Session_Status_and_Reason.class, Session_Status_and_Reason.TYPE_ID, id);
	}
	

	public static Sched_Prfile_CatCollection getSched_Prfile_Cat(LookupService lookupService) {
		Sched_Prfile_CatCollection collection =
			(Sched_Prfile_CatCollection) lookupService.getLookupCollection(Sched_Prfile_Cat.TYPE_ID, 
				Sched_Prfile_CatCollection.class, Sched_Prfile_Cat.class);
		return collection;
	}

	public static Sched_Prfile_Cat getSched_Prfile_CatInstance(LookupService lookupService, int id) 
	{
		return (Sched_Prfile_Cat)lookupService.getLookupInstance(Sched_Prfile_Cat.class, Sched_Prfile_Cat.TYPE_ID, id);
	}
	

	public static ConsultationMediaTypeCollection getConsultationMediaType(LookupService lookupService) {
		ConsultationMediaTypeCollection collection =
			(ConsultationMediaTypeCollection) lookupService.getLookupCollection(ConsultationMediaType.TYPE_ID, 
				ConsultationMediaTypeCollection.class, ConsultationMediaType.class);
		return collection;
	}

	public static ConsultationMediaType getConsultationMediaTypeInstance(LookupService lookupService, int id) 
	{
		return (ConsultationMediaType)lookupService.getLookupInstance(ConsultationMediaType.class, ConsultationMediaType.TYPE_ID, id);
	}
	

	public static SlotTypeCollection getSlotType(LookupService lookupService) {
		SlotTypeCollection collection =
			(SlotTypeCollection) lookupService.getLookupCollection(SlotType.TYPE_ID, 
				SlotTypeCollection.class, SlotType.class);
		return collection;
	}

	public static SlotType getSlotTypeInstance(LookupService lookupService, int id) 
	{
		return (SlotType)lookupService.getLookupInstance(SlotType.class, SlotType.TYPE_ID, id);
	}
	

	public static TheatreTypeCollection getTheatreType(LookupService lookupService) {
		TheatreTypeCollection collection =
			(TheatreTypeCollection) lookupService.getLookupCollection(TheatreType.TYPE_ID, 
				TheatreTypeCollection.class, TheatreType.class);
		return collection;
	}

	public static TheatreType getTheatreTypeInstance(LookupService lookupService, int id) 
	{
		return (TheatreType)lookupService.getLookupInstance(TheatreType.class, TheatreType.TYPE_ID, id);
	}
	

	public static TCITimeCollection getTCITime(LookupService lookupService) {
		TCITimeCollection collection =
			(TCITimeCollection) lookupService.getLookupCollection(TCITime.TYPE_ID, 
				TCITimeCollection.class, TCITime.class);
		return collection;
	}

	public static TCITime getTCITimeInstance(LookupService lookupService, int id) 
	{
		return (TCITime)lookupService.getLookupInstance(TCITime.class, TCITime.TYPE_ID, id);
	}
	

	public static ApptOutcomeCollection getApptOutcome(LookupService lookupService) {
		ApptOutcomeCollection collection =
			(ApptOutcomeCollection) lookupService.getLookupCollection(ApptOutcome.TYPE_ID, 
				ApptOutcomeCollection.class, ApptOutcome.class);
		return collection;
	}

	public static ApptOutcome getApptOutcomeInstance(LookupService lookupService, int id) 
	{
		return (ApptOutcome)lookupService.getLookupInstance(ApptOutcome.class, ApptOutcome.TYPE_ID, id);
	}
	

	public static SchedPASClinicCollection getSchedPASClinic(LookupService lookupService) {
		SchedPASClinicCollection collection =
			(SchedPASClinicCollection) lookupService.getLookupCollection(SchedPASClinic.TYPE_ID, 
				SchedPASClinicCollection.class, SchedPASClinic.class);
		return collection;
	}

	public static SchedPASClinic getSchedPASClinicInstance(LookupService lookupService, int id) 
	{
		return (SchedPASClinic)lookupService.getLookupInstance(SchedPASClinic.class, SchedPASClinic.TYPE_ID, id);
	}
	

	public static BookingSourceCollection getBookingSource(LookupService lookupService) {
		BookingSourceCollection collection =
			(BookingSourceCollection) lookupService.getLookupCollection(BookingSource.TYPE_ID, 
				BookingSourceCollection.class, BookingSource.class);
		return collection;
	}

	public static BookingSource getBookingSourceInstance(LookupService lookupService, int id) 
	{
		return (BookingSource)lookupService.getLookupInstance(BookingSource.class, BookingSource.TYPE_ID, id);
	}
	

	public static SchedCABSlotTypeCollection getSchedCABSlotType(LookupService lookupService) {
		SchedCABSlotTypeCollection collection =
			(SchedCABSlotTypeCollection) lookupService.getLookupCollection(SchedCABSlotType.TYPE_ID, 
				SchedCABSlotTypeCollection.class, SchedCABSlotType.class);
		return collection;
	}

	public static SchedCABSlotType getSchedCABSlotTypeInstance(LookupService lookupService, int id) 
	{
		return (SchedCABSlotType)lookupService.getLookupInstance(SchedCABSlotType.class, SchedCABSlotType.TYPE_ID, id);
	}
	

	public static ApptTransportTypeCollection getApptTransportType(LookupService lookupService) {
		ApptTransportTypeCollection collection =
			(ApptTransportTypeCollection) lookupService.getLookupCollection(ApptTransportType.TYPE_ID, 
				ApptTransportTypeCollection.class, ApptTransportType.class);
		return collection;
	}

	public static ApptTransportType getApptTransportTypeInstance(LookupService lookupService, int id) 
	{
		return (ApptTransportType)lookupService.getLookupInstance(ApptTransportType.class, ApptTransportType.TYPE_ID, id);
	}
	

	public static SchedulingPriorityCollection getSchedulingPriority(LookupService lookupService) {
		SchedulingPriorityCollection collection =
			(SchedulingPriorityCollection) lookupService.getLookupCollection(SchedulingPriority.TYPE_ID, 
				SchedulingPriorityCollection.class, SchedulingPriority.class);
		return collection;
	}

	public static SchedulingPriority getSchedulingPriorityInstance(LookupService lookupService, int id) 
	{
		return (SchedulingPriority)lookupService.getLookupInstance(SchedulingPriority.class, SchedulingPriority.TYPE_ID, id);
	}
	

	public static Status_ReasonCollection getStatus_Reason(LookupService lookupService) {
		Status_ReasonCollection collection =
			(Status_ReasonCollection) lookupService.getLookupCollection(Status_Reason.TYPE_ID, 
				Status_ReasonCollection.class, Status_Reason.class);
		return collection;
	}

	public static Status_Reason getStatus_ReasonInstance(LookupService lookupService, int id) 
	{
		return (Status_Reason)lookupService.getLookupInstance(Status_Reason.class, Status_Reason.TYPE_ID, id);
	}
	

	public static CancelAppointmentReasonCollection getCancelAppointmentReason(LookupService lookupService) {
		CancelAppointmentReasonCollection collection =
			(CancelAppointmentReasonCollection) lookupService.getLookupCollection(CancelAppointmentReason.TYPE_ID, 
				CancelAppointmentReasonCollection.class, CancelAppointmentReason.class);
		return collection;
	}

	public static CancelAppointmentReason getCancelAppointmentReasonInstance(LookupService lookupService, int id) 
	{
		return (CancelAppointmentReason)lookupService.getLookupInstance(CancelAppointmentReason.class, CancelAppointmentReason.TYPE_ID, id);
	}
	

	public static Profile_Interval_TypeCollection getProfile_Interval_Type(LookupService lookupService) {
		Profile_Interval_TypeCollection collection =
			(Profile_Interval_TypeCollection) lookupService.getLookupCollection(Profile_Interval_Type.TYPE_ID, 
				Profile_Interval_TypeCollection.class, Profile_Interval_Type.class);
		return collection;
	}

	public static Profile_Interval_Type getProfile_Interval_TypeInstance(LookupService lookupService, int id) 
	{
		return (Profile_Interval_Type)lookupService.getLookupInstance(Profile_Interval_Type.class, Profile_Interval_Type.TYPE_ID, id);
	}
	

	public static Sched_Profile_TypeCollection getSched_Profile_Type(LookupService lookupService) {
		Sched_Profile_TypeCollection collection =
			(Sched_Profile_TypeCollection) lookupService.getLookupCollection(Sched_Profile_Type.TYPE_ID, 
				Sched_Profile_TypeCollection.class, Sched_Profile_Type.class);
		return collection;
	}

	public static Sched_Profile_Type getSched_Profile_TypeInstance(LookupService lookupService, int id) 
	{
		return (Sched_Profile_Type)lookupService.getLookupInstance(Sched_Profile_Type.class, Sched_Profile_Type.TYPE_ID, id);
	}
	
}



