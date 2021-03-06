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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BaseBookTheatreImpl extends DomainImpl implements ims.RefMan.domain.BookTheatre, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validatesaveTheatreBooking(ims.scheduling.vo.Sch_BookingTheatreVo booking, ims.RefMan.vo.CatsReferralRefVo catsReferral, ims.scheduling.vo.SessionTheatreTCISlotLiteVo voSessTheatreSlot, ims.scheduling.vo.lookups.TheatreType theatreType)
	{
		if(booking == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'booking' of type 'ims.scheduling.vo.Sch_BookingTheatreVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatelistSession(ims.framework.utils.Date startDate, ims.framework.utils.Date endDate, ims.core.clinical.vo.ServiceRefVo service, ims.core.resource.place.vo.LocationRefVo location, ims.vo.interfaces.IMos consultant, ims.vo.interfaces.IGenericItem procedure, ims.scheduling.vo.lookups.TheatreType theatreType, Integer timeRequired, Boolean allowOverBook)
	{
		if(allowOverBook == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'allowOverBook' of type 'Boolean' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatelistBookingAppointment(ims.scheduling.vo.Sch_SessionRefVo session)
	{
		if(session == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'session' of type 'ims.scheduling.vo.Sch_SessionRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatehasBookingRights(ims.framework.interfaces.IAppRole role, ims.scheduling.vo.Sch_SessionRefVo session)
	{
		if(session == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'session' of type 'ims.scheduling.vo.Sch_SessionRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetCurrentMonth(ims.core.clinical.vo.ServiceRefVo service, ims.core.resource.place.vo.LocationRefVo location, ims.vo.interfaces.IMos consultant, ims.vo.interfaces.IGenericItem procedure, ims.scheduling.vo.lookups.TheatreType theatreType)
	{
	}

	@SuppressWarnings("unused")
	public void validategetReferralDetail(ims.RefMan.vo.CatsReferralRefVo catsReferral)
	{
		if(catsReferral == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'catsReferral' of type 'ims.RefMan.vo.CatsReferralRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetSch_BookingByAppt(ims.scheduling.vo.Booking_AppointmentRefVo appt)
	{
		if(appt == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'appt' of type 'ims.scheduling.vo.Booking_AppointmentRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetBookingAppointment(ims.scheduling.vo.Booking_AppointmentRefVo appt)
	{
		if(appt == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'appt' of type 'ims.scheduling.vo.Booking_AppointmentRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatelistProcedures(String filter)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPatientICP(ims.core.admin.vo.CareContextRefVo careCOntextRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatesavePatientICP(ims.icp.vo.PatientICPFullVo pateintICPVo)
	{
	}

	@SuppressWarnings("unused")
	public void validategetSuitableForSurgeryAssessmentByCareContext(ims.core.admin.vo.CareContextRefVo careContext)
	{
		if(careContext == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'careContext' of type 'ims.core.admin.vo.CareContextRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetLatestFitForSurgeryAssessment(ims.RefMan.vo.CatsReferralRefVo referral)
	{
	}

	@SuppressWarnings("unused")
	public void validatecountNonCancelledAppointmentsForSession(ims.scheduling.vo.Sch_SessionRefVo session)
	{
		if(session == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'session' of type 'ims.scheduling.vo.Sch_SessionRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validateremoveApptFromExistingSessionApptOrder( ims.scheduling.domain.objects.Booking_Appointment doAppt)
	{
		if(doAppt == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'doAppt' of type ' ims.scheduling.domain.objects.Booking_Appointment' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatealreadyExists( ims.scheduling.domain.objects.Sch_Session_Appointment_Order doSessApptOrder,  ims.scheduling.domain.objects.Booking_Appointment doAppt)
	{
		if(doSessApptOrder == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'doSessApptOrder' of type ' ims.scheduling.domain.objects.Sch_Session_Appointment_Order' cannot be null.");
		if(doAppt == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'doAppt' of type ' ims.scheduling.domain.objects.Booking_Appointment' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetLastSuitableForSurgeryAssessmentProcedureTextByCareContext(ims.core.admin.vo.CareContextRefVo careContextRef)
	{
		if(careContextRef == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'careContextRef' of type 'ims.core.admin.vo.CareContextRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validateupdateActiveMonitoring(ims.RefMan.vo.CatsReferralRefVo voCatsRef)
	{
		if(voCatsRef == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'voCatsRef' of type 'ims.RefMan.vo.CatsReferralRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetSessionTheatre(ims.scheduling.vo.Sch_SessionRefVo sessionRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetLastTheatreEROD(ims.RefMan.vo.CatsReferralRefVo catsReferral)
	{
	}

	@SuppressWarnings("unused")
	public void validategetTheatreDetailsForSession(ims.scheduling.vo.Sch_SessionRefVo session)
	{
	}
}
