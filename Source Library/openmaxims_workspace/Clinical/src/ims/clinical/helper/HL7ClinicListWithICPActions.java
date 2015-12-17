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
package ims.clinical.helper;

import ims.RefMan.vo.CatsReferralListVo;
import ims.RefMan.vo.PatientElectiveListForDNAAppointmentsVo;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.scheduling.vo.Booking_AppointmentRefVo;
import ims.scheduling.vo.Booking_AppointmentVo;
import ims.scheduling.vo.SessionSlotVo;

public interface HL7ClinicListWithICPActions
{
	public void saveOPEpisode(Booking_AppointmentVo voOP, CatsReferralListVo voCatsReferral, SessionSlotVo dnaSessionSlot, PatientElectiveListForDNAAppointmentsVo electiveList, Boolean isFirstAppointmentActivity, Boolean isUndoDNA, Boolean isUndoArrival) throws DomainInterfaceException, StaleObjectException;
	public CatsReferralListVo getCatsReferral(Booking_AppointmentRefVo voBookRefVo);
}
