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
package ims.ocs_if.helper;

import ims.core.patient.vo.PatientRefVo;
import ims.domain.DomainInterface;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.utils.DateTime;
import ims.ocs_if.vo.IfOrderInvestigationVo;

/*
 * CARE UK specific domain methods copied from the Form 
 */
public interface IRefManDomainHelper extends DomainInterface{
	// Generated from form domain interface definition
	public ims.RefMan.vo.IFCATSExternalEventVo getCATSIFValues(ims.ocs_if.vo.IfOrderInvestigationVo investigationRef, Boolean includeApptStatus);

	// Generated from form domain interface definition
	public ims.scheduling.vo.IfPatientLocationVo getPatientLocFromAppointment(ims.scheduling.vo.Booking_AppointmentRefVo appointment) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.core.patient.vo.PatientRefVo getPatientFromAppointment(ims.scheduling.vo.Booking_AppointmentRefVo appointment) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo getOrderFromInvestigation(ims.ocrr.orderingresults.vo.OrderInvestigationRefVo investigation) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.scheduling.vo.ExternalEventVo updateEventVoWithInvestigation(ims.scheduling.vo.ExternalEventVo event) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.scheduling.vo.Booking_AppointmentRefVo getLatestAppointmentForInvestigation(ims.ocrr.orderingresults.vo.OrderInvestigationRefVo invRef) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void generateOrderCancelAsRequestedEvent(ims.scheduling.vo.Booking_AppointmentRefVo appointment, ims.ocrr.orderingresults.vo.OrderInvestigationRefVo inv) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void generateOrderNumberAllocatedEvent(ims.scheduling.vo.Booking_AppointmentRefVo appointment, ims.ocrr.orderingresults.vo.OrderInvestigationRefVo investigation) throws ims.domain.exceptions.StaleObjectException;
	
	public void setCATSReferralHasRejectedInv(ims.ocrr.orderingresults.vo.OrderInvestigationRefVo orderInvRef) throws DomainInterfaceException, StaleObjectException; 

	public void setAppointmentArrivedForUBRN(PatientRefVo patient, String ubrn, String maximsApptId, DateTime arrivalDateTime) throws DomainInterfaceException, StaleObjectException;
	
	public void acceptReferralFromInvestigation(IfOrderInvestigationVo inv) throws DomainInterfaceException, StaleObjectException;

}
