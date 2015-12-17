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



