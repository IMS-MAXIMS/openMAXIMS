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
package ims.emergency.helper;

import ims.admin.vo.EDAttendanceControlsConfigVoCollection;
import ims.admin.vo.lookups.EDAttendenceControlType;
import ims.core.admin.vo.EmergencyAttendanceRefVo;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.vo.CareContextShortVoCollection;
import ims.core.vo.EDAttendanceformsConfigVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.lookups.HcpDisType;
import ims.core.vo.lookups.Specialty;
import ims.domain.DomainInterface;
import ims.emergency.vo.AttendanceDetailsVo;
import ims.emergency.vo.ChartRequestedVo;
import ims.emergency.vo.EmergencyAttendanceBillingVo;
import ims.emergency.vo.TrackingSendToAreaVo;
import ims.framework.interfaces.ILocation;

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
	
	public CareContextShortVoCollection getCareContextsByPatient(PatientRefVo patientRef);//WDEV-16791
	public Specialty getSpecialtyForHCP(HcpRefVo hcpRef, HcpDisType hcpDisType);//WDEV-16791
	public LocationLiteVo getCurrentHospital(ILocation currentLocation);//WDEV-17615
}
