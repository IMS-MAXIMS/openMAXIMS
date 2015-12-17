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
package ims.scheduling.helper;

import ims.RefMan.vo.AdmissionDetailUndoClockImpactVo;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.pathways.vo.AdminEventVo;
import ims.pathways.vo.EventLiteVo;
import ims.pathways.vo.PathwayRTTClockImpactVo;
import ims.scheduling.vo.AppointmentUndoClockImpactVo;
import ims.scheduling.vo.BookingAppointmentOutcomeVo;
import ims.scheduling.vo.lookups.ApptOutcome;

public interface IRecordRTTClockImpact
{
	public static final Integer NO_CLOCK_IMPACT = 0;
	public static final Integer NOT_LAST_IMPACT = 1;
	public static final Integer UNDO_CLOCK_IMPACT_SUCCESS = 2;
	
	/**
	 * Function used to record the Clock Impact for an AppointmentOutcome
	 * @param appointmentOutcome
	 * @param firstDefinitiveTreatmentEvent
	 * @return
	 * @throws DomainInterfaceException
	 * @throws StaleObjectException
	 */
	public boolean recordAppointmentOutcomeClockImpact(BookingAppointmentOutcomeVo appointmentOutcome, EventLiteVo firstDefinitiveTreatmentEvent) throws DomainInterfaceException, StaleObjectException;

	
	/**
	 * Function used to undo the Clock Impact for an AppointmentOutcome
	 * @param appointmentOutcome
	 * @param clockImpact
	 * @param outcomeBeeingReverted 
	 * @return
	 * @throws DomainInterfaceException
	 * @throws StaleObjectException
	 */
	public Integer undoAppointmentOutcomeClockImpact(BookingAppointmentOutcomeVo appointmentOutcome, PathwayRTTClockImpactVo clockImpact, ApptOutcome outcomeBeeingReverted) throws DomainInterfaceException, StaleObjectException;
	
	
	/**
	 * Function used to undo the Clock Impact for an AdminEvent
	 * @param adminEvent
	 * @param clockImpact
	 * @return
	 * @throws DomainInterfaceException
	 * @throws StaleObjectException
	 */
	public Integer undoAdminEventClockImpact(AdminEventVo adminEvent, PathwayRTTClockImpactVo clockImpact) throws DomainInterfaceException, StaleObjectException;

	
	/**
	 * Function used to undo the Clock Impact for an AdmissionDetails
	 * @param admissionDetail
	 * @param clockImpact
	 * @return
	 * @throws DomainInterfaceException
	 * @throws StaleObjectException
	 */
	public Integer undoAdmissionClockImpact(AdmissionDetailUndoClockImpactVo admissionDetail, PathwayRTTClockImpactVo clockImpact) throws DomainInterfaceException, StaleObjectException;
	
	
	/**
	 * Function used to undo the Clock Impact for an Appointment
	 * @param appointment
	 * @param clockImpact
	 * @return
	 * @throws DomainInterfaceException
	 */
	public Integer undoAppointmentClockImpact(AppointmentUndoClockImpactVo appointment, PathwayRTTClockImpactVo clockImpact) throws DomainInterfaceException, StaleObjectException;
}
