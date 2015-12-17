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
package ims.emergency.helper;

import ims.admin.vo.EDAttendanceControlsConfigVoCollection;
import ims.admin.vo.lookups.EDAttendenceControlType;
import ims.core.admin.pas.vo.PendingEmergencyAdmissionRefVo;
import ims.core.admin.vo.EmergencyAttendanceRefVo;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.vo.CareContextShortVoCollection;
import ims.core.vo.EDAttendanceformsConfigVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.PendingEmergencyAdmissionAdmitVo;
import ims.core.vo.lookups.HcpDisType;
import ims.core.vo.lookups.Specialty;
import ims.domain.DomainInterface;
import ims.domain.exceptions.StaleObjectException;
import ims.emergency.vo.AttendanceDetailsVo;
import ims.emergency.vo.CareContextForAttendanceNotesVoCollection;
import ims.emergency.vo.ChartRequestedVo;
import ims.emergency.vo.EmergencyAttendanceBillingVo;
import ims.emergency.vo.TrackingSendToAreaVo;
import ims.framework.interfaces.ILocation;
import ims.framework.utils.DateTime;

public interface IEmergencyHelper extends DomainInterface
{
	public EDAttendanceformsConfigVo getEDAttendanceformsConfig();
	public EDAttendanceControlsConfigVoCollection getEDAttendanceControlsConfig(EDAttendenceControlType controlType);
	public TrackingSendToAreaVo isPatientCurrentlyinED(PatientRefVo patient); 
	public ChartRequestedVo getChartRequestedByEmergencyAttendance(EmergencyAttendanceRefVo emergencyEpisodeRef);
	public EmergencyAttendanceBillingVo getAttendanceBillingByEmergencyAttendance(EmergencyAttendanceRefVo emergencyAttendanceRef);
	public ims.emergency.vo.ChartRequestedVo getChartRequested(ims.core.admin.vo.ChartRequestedRefVo chartRequestedRef);
	public EmergencyAttendanceBillingVo getAttendanceBilling(ims.core.admin.vo.EmergencyAttendanceBillingRefVo attendanceBillingRef);
	public AttendanceDetailsVo getAttendanceDetails(EmergencyAttendanceRefVo attendanceDetailsRef);
	
	public CareContextForAttendanceNotesVoCollection getCareContextsLiteByPatient(PatientRefVo patientRef);//WDEV-16791
	public CareContextShortVoCollection getCareContextsByPatient(PatientRefVo patientRef);
	public Specialty getSpecialtyForHCP(HcpRefVo hcpRef, HcpDisType hcpDisType);//WDEV-16791
	public LocationLiteVo getCurrentHospital(ILocation currentLocation);//WDEV-17615
	
	public PendingEmergencyAdmissionAdmitVo autoDischargeFromEmergencyTracking(PendingEmergencyAdmissionRefVo pendingEmergencyAdmissionRef, DateTime conclusionDateTime, HcpLiteVo consultant) throws StaleObjectException;
}
