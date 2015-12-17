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
package ims.ccosched.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static ActionStatusReasonCollection getActionStatusReason(LookupService lookupService) {
		ActionStatusReasonCollection collection =
			(ActionStatusReasonCollection) lookupService.getLookupCollection(ActionStatusReason.TYPE_ID, 
				ActionStatusReasonCollection.class, ActionStatusReason.class);
		return collection;
	}

	public static ActionStatusReason getActionStatusReasonInstance(LookupService lookupService, int id) 
	{
		return (ActionStatusReason)lookupService.getLookupInstance(ActionStatusReason.class, ActionStatusReason.TYPE_ID, id);
	}
	

	public static SchedCategoryCollection getSchedCategory(LookupService lookupService) {
		SchedCategoryCollection collection =
			(SchedCategoryCollection) lookupService.getLookupCollection(SchedCategory.TYPE_ID, 
				SchedCategoryCollection.class, SchedCategory.class);
		return collection;
	}

	public static SchedCategory getSchedCategoryInstance(LookupService lookupService, int id) 
	{
		return (SchedCategory)lookupService.getLookupInstance(SchedCategory.class, SchedCategory.TYPE_ID, id);
	}
	

	public static UnitCollection getUnit(LookupService lookupService) {
		UnitCollection collection =
			(UnitCollection) lookupService.getLookupCollection(Unit.TYPE_ID, 
				UnitCollection.class, Unit.class);
		return collection;
	}

	public static Unit getUnitInstance(LookupService lookupService, int id) 
	{
		return (Unit)lookupService.getLookupInstance(Unit.class, Unit.TYPE_ID, id);
	}
	

	public static TechniquesCollection getTechniques(LookupService lookupService) {
		TechniquesCollection collection =
			(TechniquesCollection) lookupService.getLookupCollection(Techniques.TYPE_ID, 
				TechniquesCollection.class, Techniques.class);
		return collection;
	}

	public static Techniques getTechniquesInstance(LookupService lookupService, int id) 
	{
		return (Techniques)lookupService.getLookupInstance(Techniques.class, Techniques.TYPE_ID, id);
	}
	

	public static SeenAtCollection getSeenAt(LookupService lookupService) {
		SeenAtCollection collection =
			(SeenAtCollection) lookupService.getLookupCollection(SeenAt.TYPE_ID, 
				SeenAtCollection.class, SeenAt.class);
		return collection;
	}

	public static SeenAt getSeenAtInstance(LookupService lookupService, int id) 
	{
		return (SeenAt)lookupService.getLookupInstance(SeenAt.class, SeenAt.TYPE_ID, id);
	}
	

	public static RequirementsCollection getRequirements(LookupService lookupService) {
		RequirementsCollection collection =
			(RequirementsCollection) lookupService.getLookupCollection(Requirements.TYPE_ID, 
				RequirementsCollection.class, Requirements.class);
		return collection;
	}

	public static Requirements getRequirementsInstance(LookupService lookupService, int id) 
	{
		return (Requirements)lookupService.getLookupInstance(Requirements.class, Requirements.TYPE_ID, id);
	}
	

	public static ReasonDNACollection getReasonDNA(LookupService lookupService) {
		ReasonDNACollection collection =
			(ReasonDNACollection) lookupService.getLookupCollection(ReasonDNA.TYPE_ID, 
				ReasonDNACollection.class, ReasonDNA.class);
		return collection;
	}

	public static ReasonDNA getReasonDNAInstance(LookupService lookupService, int id) 
	{
		return (ReasonDNA)lookupService.getLookupInstance(ReasonDNA.class, ReasonDNA.TYPE_ID, id);
	}
	

	public static PriorityCollection getPriority(LookupService lookupService) {
		PriorityCollection collection =
			(PriorityCollection) lookupService.getLookupCollection(Priority.TYPE_ID, 
				PriorityCollection.class, Priority.class);
		return collection;
	}

	public static Priority getPriorityInstance(LookupService lookupService, int id) 
	{
		return (Priority)lookupService.getLookupInstance(Priority.class, Priority.TYPE_ID, id);
	}
	

	public static PlannedRegimeCollection getPlannedRegime(LookupService lookupService) {
		PlannedRegimeCollection collection =
			(PlannedRegimeCollection) lookupService.getLookupCollection(PlannedRegime.TYPE_ID, 
				PlannedRegimeCollection.class, PlannedRegime.class);
		return collection;
	}

	public static PlannedRegime getPlannedRegimeInstance(LookupService lookupService, int id) 
	{
		return (PlannedRegime)lookupService.getLookupInstance(PlannedRegime.class, PlannedRegime.TYPE_ID, id);
	}
	

	public static PeriodCollection getPeriod(LookupService lookupService) {
		PeriodCollection collection =
			(PeriodCollection) lookupService.getLookupCollection(Period.TYPE_ID, 
				PeriodCollection.class, Period.class);
		return collection;
	}

	public static Period getPeriodInstance(LookupService lookupService, int id) 
	{
		return (Period)lookupService.getLookupInstance(Period.class, Period.TYPE_ID, id);
	}
	

	public static DoctorsWorkListItemCollection getDoctorsWorkListItem(LookupService lookupService) {
		DoctorsWorkListItemCollection collection =
			(DoctorsWorkListItemCollection) lookupService.getLookupCollection(DoctorsWorkListItem.TYPE_ID, 
				DoctorsWorkListItemCollection.class, DoctorsWorkListItem.class);
		return collection;
	}

	public static DoctorsWorkListItem getDoctorsWorkListItemInstance(LookupService lookupService, int id) 
	{
		return (DoctorsWorkListItem)lookupService.getLookupInstance(DoctorsWorkListItem.class, DoctorsWorkListItem.TYPE_ID, id);
	}
	

	public static AttendingAsCollection getAttendingAs(LookupService lookupService) {
		AttendingAsCollection collection =
			(AttendingAsCollection) lookupService.getLookupCollection(AttendingAs.TYPE_ID, 
				AttendingAsCollection.class, AttendingAs.class);
		return collection;
	}

	public static AttendingAs getAttendingAsInstance(LookupService lookupService, int id) 
	{
		return (AttendingAs)lookupService.getLookupInstance(AttendingAs.class, AttendingAs.TYPE_ID, id);
	}
	

	public static AppointmentStatusCollection getAppointmentStatus(LookupService lookupService) {
		AppointmentStatusCollection collection =
			(AppointmentStatusCollection) lookupService.getLookupCollection(AppointmentStatus.TYPE_ID, 
				AppointmentStatusCollection.class, AppointmentStatus.class);
		return collection;
	}

	public static AppointmentStatus getAppointmentStatusInstance(LookupService lookupService, int id) 
	{
		return (AppointmentStatus)lookupService.getLookupInstance(AppointmentStatus.class, AppointmentStatus.TYPE_ID, id);
	}
	

	public static AnaestheticCollection getAnaesthetic(LookupService lookupService) {
		AnaestheticCollection collection =
			(AnaestheticCollection) lookupService.getLookupCollection(Anaesthetic.TYPE_ID, 
				AnaestheticCollection.class, Anaesthetic.class);
		return collection;
	}

	public static Anaesthetic getAnaestheticInstance(LookupService lookupService, int id) 
	{
		return (Anaesthetic)lookupService.getLookupInstance(Anaesthetic.class, Anaesthetic.TYPE_ID, id);
	}
	

	public static TreatmentIntentCollection getTreatmentIntent(LookupService lookupService) {
		TreatmentIntentCollection collection =
			(TreatmentIntentCollection) lookupService.getLookupCollection(TreatmentIntent.TYPE_ID, 
				TreatmentIntentCollection.class, TreatmentIntent.class);
		return collection;
	}

	public static TreatmentIntent getTreatmentIntentInstance(LookupService lookupService, int id) 
	{
		return (TreatmentIntent)lookupService.getLookupInstance(TreatmentIntent.class, TreatmentIntent.TYPE_ID, id);
	}
	

	public static ReasonIncompleteCollection getReasonIncomplete(LookupService lookupService) {
		ReasonIncompleteCollection collection =
			(ReasonIncompleteCollection) lookupService.getLookupCollection(ReasonIncomplete.TYPE_ID, 
				ReasonIncompleteCollection.class, ReasonIncomplete.class);
		return collection;
	}

	public static ReasonIncomplete getReasonIncompleteInstance(LookupService lookupService, int id) 
	{
		return (ReasonIncomplete)lookupService.getLookupInstance(ReasonIncomplete.class, ReasonIncomplete.TYPE_ID, id);
	}
	

	public static ModalityCollection getModality(LookupService lookupService) {
		ModalityCollection collection =
			(ModalityCollection) lookupService.getLookupCollection(Modality.TYPE_ID, 
				ModalityCollection.class, Modality.class);
		return collection;
	}

	public static Modality getModalityInstance(LookupService lookupService, int id) 
	{
		return (Modality)lookupService.getLookupInstance(Modality.class, Modality.TYPE_ID, id);
	}
	

	public static LocationCollection getLocation(LookupService lookupService) {
		LocationCollection collection =
			(LocationCollection) lookupService.getLookupCollection(Location.TYPE_ID, 
				LocationCollection.class, Location.class);
		return collection;
	}

	public static Location getLocationInstance(LookupService lookupService, int id) 
	{
		return (Location)lookupService.getLookupInstance(Location.class, Location.TYPE_ID, id);
	}
	

	public static ConfirmationStatusCollection getConfirmationStatus(LookupService lookupService) {
		ConfirmationStatusCollection collection =
			(ConfirmationStatusCollection) lookupService.getLookupCollection(ConfirmationStatus.TYPE_ID, 
				ConfirmationStatusCollection.class, ConfirmationStatus.class);
		return collection;
	}

	public static ConfirmationStatus getConfirmationStatusInstance(LookupService lookupService, int id) 
	{
		return (ConfirmationStatus)lookupService.getLookupInstance(ConfirmationStatus.class, ConfirmationStatus.TYPE_ID, id);
	}
	

	public static BookingSystemTypeCollection getBookingSystemType(LookupService lookupService) {
		BookingSystemTypeCollection collection =
			(BookingSystemTypeCollection) lookupService.getLookupCollection(BookingSystemType.TYPE_ID, 
				BookingSystemTypeCollection.class, BookingSystemType.class);
		return collection;
	}

	public static BookingSystemType getBookingSystemTypeInstance(LookupService lookupService, int id) 
	{
		return (BookingSystemType)lookupService.getLookupInstance(BookingSystemType.class, BookingSystemType.TYPE_ID, id);
	}
	

	public static TransportCollection getTransport(LookupService lookupService) {
		TransportCollection collection =
			(TransportCollection) lookupService.getLookupCollection(Transport.TYPE_ID, 
				TransportCollection.class, Transport.class);
		return collection;
	}

	public static Transport getTransportInstance(LookupService lookupService, int id) 
	{
		return (Transport)lookupService.getLookupInstance(Transport.class, Transport.TYPE_ID, id);
	}
	

	public static StatusCollection getStatus(LookupService lookupService) {
		StatusCollection collection =
			(StatusCollection) lookupService.getLookupCollection(Status.TYPE_ID, 
				StatusCollection.class, Status.class);
		return collection;
	}

	public static Status getStatusInstance(LookupService lookupService, int id) 
	{
		return (Status)lookupService.getLookupInstance(Status.class, Status.TYPE_ID, id);
	}
	
}



