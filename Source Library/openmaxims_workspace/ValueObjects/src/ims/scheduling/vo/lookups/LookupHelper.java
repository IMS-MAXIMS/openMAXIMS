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

/*
 * This code was generated.
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 13/10/2015, 13:23
 */
package ims.scheduling.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static SafetyBriefDelayReasonCollection getSafetyBriefDelayReason(LookupService lookupService) {
		SafetyBriefDelayReasonCollection collection =
			(SafetyBriefDelayReasonCollection) lookupService.getLookupCollection(SafetyBriefDelayReason.TYPE_ID, 
				SafetyBriefDelayReasonCollection.class, SafetyBriefDelayReason.class);
		return collection;
	}

	public static SafetyBriefDelayReason getSafetyBriefDelayReasonInstance(LookupService lookupService, int id) 
	{
		return (SafetyBriefDelayReason)lookupService.getLookupInstance(SafetyBriefDelayReason.class, SafetyBriefDelayReason.TYPE_ID, id);
	}
	

	public static Rule28DayStatusCollection getRule28DayStatus(LookupService lookupService) {
		Rule28DayStatusCollection collection =
			(Rule28DayStatusCollection) lookupService.getLookupCollection(Rule28DayStatus.TYPE_ID, 
				Rule28DayStatusCollection.class, Rule28DayStatus.class);
		return collection;
	}

	public static Rule28DayStatus getRule28DayStatusInstance(LookupService lookupService, int id) 
	{
		return (Rule28DayStatus)lookupService.getLookupInstance(Rule28DayStatus.class, Rule28DayStatus.TYPE_ID, id);
	}
	

	public static PendingEmergencyTheatreStatusCollection getPendingEmergencyTheatreStatus(LookupService lookupService) {
		PendingEmergencyTheatreStatusCollection collection =
			(PendingEmergencyTheatreStatusCollection) lookupService.getLookupCollection(PendingEmergencyTheatreStatus.TYPE_ID, 
				PendingEmergencyTheatreStatusCollection.class, PendingEmergencyTheatreStatus.class);
		return collection;
	}

	public static PendingEmergencyTheatreStatus getPendingEmergencyTheatreStatusInstance(LookupService lookupService, int id) 
	{
		return (PendingEmergencyTheatreStatus)lookupService.getLookupInstance(PendingEmergencyTheatreStatus.class, PendingEmergencyTheatreStatus.TYPE_ID, id);
	}
	

	public static PendingEmergencyCurrentPatientLocationCollection getPendingEmergencyCurrentPatientLocation(LookupService lookupService) {
		PendingEmergencyCurrentPatientLocationCollection collection =
			(PendingEmergencyCurrentPatientLocationCollection) lookupService.getLookupCollection(PendingEmergencyCurrentPatientLocation.TYPE_ID, 
				PendingEmergencyCurrentPatientLocationCollection.class, PendingEmergencyCurrentPatientLocation.class);
		return collection;
	}

	public static PendingEmergencyCurrentPatientLocation getPendingEmergencyCurrentPatientLocationInstance(LookupService lookupService, int id) 
	{
		return (PendingEmergencyCurrentPatientLocation)lookupService.getLookupInstance(PendingEmergencyCurrentPatientLocation.class, PendingEmergencyCurrentPatientLocation.TYPE_ID, id);
	}
	

	public static PendingTheatreUrgencyCategoryCollection getPendingTheatreUrgencyCategory(LookupService lookupService) {
		PendingTheatreUrgencyCategoryCollection collection =
			(PendingTheatreUrgencyCategoryCollection) lookupService.getLookupCollection(PendingTheatreUrgencyCategory.TYPE_ID, 
				PendingTheatreUrgencyCategoryCollection.class, PendingTheatreUrgencyCategory.class);
		return collection;
	}

	public static PendingTheatreUrgencyCategory getPendingTheatreUrgencyCategoryInstance(LookupService lookupService, int id) 
	{
		return (PendingTheatreUrgencyCategory)lookupService.getLookupInstance(PendingTheatreUrgencyCategory.class, PendingTheatreUrgencyCategory.TYPE_ID, id);
	}
	

	public static RequestToScheduleCollection getRequestToSchedule(LookupService lookupService) {
		RequestToScheduleCollection collection =
			(RequestToScheduleCollection) lookupService.getLookupCollection(RequestToSchedule.TYPE_ID, 
				RequestToScheduleCollection.class, RequestToSchedule.class);
		return collection;
	}

	public static RequestToSchedule getRequestToScheduleInstance(LookupService lookupService, int id) 
	{
		return (RequestToSchedule)lookupService.getLookupInstance(RequestToSchedule.class, RequestToSchedule.TYPE_ID, id);
	}
	

	public static AcuteTheateListBookingStateCollection getAcuteTheateListBookingState(LookupService lookupService) {
		AcuteTheateListBookingStateCollection collection =
			(AcuteTheateListBookingStateCollection) lookupService.getLookupCollection(AcuteTheateListBookingState.TYPE_ID, 
				AcuteTheateListBookingStateCollection.class, AcuteTheateListBookingState.class);
		return collection;
	}

	public static AcuteTheateListBookingState getAcuteTheateListBookingStateInstance(LookupService lookupService, int id) 
	{
		return (AcuteTheateListBookingState)lookupService.getLookupInstance(AcuteTheateListBookingState.class, AcuteTheateListBookingState.TYPE_ID, id);
	}
	

	public static FutureAppointmentSourceCollection getFutureAppointmentSource(LookupService lookupService) {
		FutureAppointmentSourceCollection collection =
			(FutureAppointmentSourceCollection) lookupService.getLookupCollection(FutureAppointmentSource.TYPE_ID, 
				FutureAppointmentSourceCollection.class, FutureAppointmentSource.class);
		return collection;
	}

	public static FutureAppointmentSource getFutureAppointmentSourceInstance(LookupService lookupService, int id) 
	{
		return (FutureAppointmentSource)lookupService.getLookupInstance(FutureAppointmentSource.class, FutureAppointmentSource.TYPE_ID, id);
	}
	

	public static FutureApptRemovalReasonCollection getFutureApptRemovalReason(LookupService lookupService) {
		FutureApptRemovalReasonCollection collection =
			(FutureApptRemovalReasonCollection) lookupService.getLookupCollection(FutureApptRemovalReason.TYPE_ID, 
				FutureApptRemovalReasonCollection.class, FutureApptRemovalReason.class);
		return collection;
	}

	public static FutureApptRemovalReason getFutureApptRemovalReasonInstance(LookupService lookupService, int id) 
	{
		return (FutureApptRemovalReason)lookupService.getLookupInstance(FutureApptRemovalReason.class, FutureApptRemovalReason.TYPE_ID, id);
	}
	

	public static FutureAppointmentStatusCollection getFutureAppointmentStatus(LookupService lookupService) {
		FutureAppointmentStatusCollection collection =
			(FutureAppointmentStatusCollection) lookupService.getLookupCollection(FutureAppointmentStatus.TYPE_ID, 
				FutureAppointmentStatusCollection.class, FutureAppointmentStatus.class);
		return collection;
	}

	public static FutureAppointmentStatus getFutureAppointmentStatusInstance(LookupService lookupService, int id) 
	{
		return (FutureAppointmentStatus)lookupService.getLookupInstance(FutureAppointmentStatus.class, FutureAppointmentStatus.TYPE_ID, id);
	}
	

	public static RTTWeekWaitOr28DayRuleBreachReasonCollection getRTTWeekWaitOr28DayRuleBreachReason(LookupService lookupService) {
		RTTWeekWaitOr28DayRuleBreachReasonCollection collection =
			(RTTWeekWaitOr28DayRuleBreachReasonCollection) lookupService.getLookupCollection(RTTWeekWaitOr28DayRuleBreachReason.TYPE_ID, 
				RTTWeekWaitOr28DayRuleBreachReasonCollection.class, RTTWeekWaitOr28DayRuleBreachReason.class);
		return collection;
	}

	public static RTTWeekWaitOr28DayRuleBreachReason getRTTWeekWaitOr28DayRuleBreachReasonInstance(LookupService lookupService, int id) 
	{
		return (RTTWeekWaitOr28DayRuleBreachReason)lookupService.getLookupInstance(RTTWeekWaitOr28DayRuleBreachReason.class, RTTWeekWaitOr28DayRuleBreachReason.TYPE_ID, id);
	}
	

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
	

	public static ApptConfStatusCollection getApptConfStatus(LookupService lookupService) {
		ApptConfStatusCollection collection =
			(ApptConfStatusCollection) lookupService.getLookupCollection(ApptConfStatus.TYPE_ID, 
				ApptConfStatusCollection.class, ApptConfStatus.class);
		return collection;
	}

	public static ApptConfStatus getApptConfStatusInstance(LookupService lookupService, int id) 
	{
		return (ApptConfStatus)lookupService.getLookupInstance(ApptConfStatus.class, ApptConfStatus.TYPE_ID, id);
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
	

	public static PendingEmergencyTheatreRemovalReasonCollection getPendingEmergencyTheatreRemovalReason(LookupService lookupService) {
		PendingEmergencyTheatreRemovalReasonCollection collection =
			(PendingEmergencyTheatreRemovalReasonCollection) lookupService.getLookupCollection(PendingEmergencyTheatreRemovalReason.TYPE_ID, 
				PendingEmergencyTheatreRemovalReasonCollection.class, PendingEmergencyTheatreRemovalReason.class);
		return collection;
	}

	public static PendingEmergencyTheatreRemovalReason getPendingEmergencyTheatreRemovalReasonInstance(LookupService lookupService, int id) 
	{
		return (PendingEmergencyTheatreRemovalReason)lookupService.getLookupInstance(PendingEmergencyTheatreRemovalReason.class, PendingEmergencyTheatreRemovalReason.TYPE_ID, id);
	}
	

	public static SchProfileTypeCollection getSchProfileType(LookupService lookupService) {
		SchProfileTypeCollection collection =
			(SchProfileTypeCollection) lookupService.getLookupCollection(SchProfileType.TYPE_ID, 
				SchProfileTypeCollection.class, SchProfileType.class);
		return collection;
	}

	public static SchProfileType getSchProfileTypeInstance(LookupService lookupService, int id) 
	{
		return (SchProfileType)lookupService.getLookupInstance(SchProfileType.class, SchProfileType.TYPE_ID, id);
	}
	

	public static ProfileListTypeCollection getProfileListType(LookupService lookupService) {
		ProfileListTypeCollection collection =
			(ProfileListTypeCollection) lookupService.getLookupCollection(ProfileListType.TYPE_ID, 
				ProfileListTypeCollection.class, ProfileListType.class);
		return collection;
	}

	public static ProfileListType getProfileListTypeInstance(LookupService lookupService, int id) 
	{
		return (ProfileListType)lookupService.getLookupInstance(ProfileListType.class, ProfileListType.TYPE_ID, id);
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



