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
import ims.admin.vo.domain.EDAttendanceControlsConfigVoAssembler;
import ims.admin.vo.lookups.EDAttendenceControlType;
import ims.core.admin.domain.objects.ChartRequested;
import ims.core.admin.domain.objects.EmergencyAttendance;
import ims.core.admin.domain.objects.EmergencyAttendanceBilling;
import ims.core.admin.vo.EmergencyAttendanceBillingRefVo;
import ims.core.admin.vo.EmergencyAttendanceRefVo;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.resource.place.domain.objects.Location;
import ims.core.vo.CareContextShortVoCollection;
import ims.core.vo.EDAttendanceformsConfigVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.domain.CareContextShortVoAssembler;
import ims.core.vo.domain.EDAttendanceformsConfigVoAssembler;
import ims.core.vo.domain.LocationLiteVoAssembler;
import ims.core.vo.lookups.HcpDisType;
import ims.core.vo.lookups.LocationType;
import ims.core.vo.lookups.LookupHelper;
import ims.core.vo.lookups.Specialty;
import ims.domain.DomainFactory;
import ims.domain.impl.DomainImpl;
import ims.emergency.vo.AttendanceDetailsVo;
import ims.emergency.vo.ChartRequestedVo;
import ims.emergency.vo.EmergencyAttendanceBillingVo;
import ims.emergency.vo.TrackingSendToAreaVo;
import ims.emergency.vo.TrackingSendToAreaVoCollection;
import ims.emergency.vo.domain.AttendanceDetailsVoAssembler;
import ims.emergency.vo.domain.ChartRequestedVoAssembler;
import ims.emergency.vo.domain.EmergencyAttendanceBillingVoAssembler;
import ims.emergency.vo.domain.TrackingSendToAreaVoAssembler;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.interfaces.ILocation;

import java.util.List;

public class EmergencyHelper extends DomainImpl implements IEmergencyHelper
{
	private static final long serialVersionUID = 1L;
	
	public EDAttendanceformsConfigVo getEDAttendanceformsConfig()
	{
		DomainFactory factory = getDomainFactory();
		String hql = "select edAttFormConfig from EDAttendenceformsConfig as edAttFormConfig";
		List<?> list = factory.find(hql);
		
		return EDAttendanceformsConfigVoAssembler.createEDAttendanceformsConfigVoCollectionFromEDAttendenceformsConfig(list).get(0);
		
	}
	
	public EDAttendanceControlsConfigVoCollection getEDAttendanceControlsConfig(EDAttendenceControlType controlType)
	{
		
		DomainFactory factory = getDomainFactory();
		String hql = "select edAttConfig from EDAttendenceControlsConfig as edAttConfig left join edAttConfig.controlType as controlType where (controlType.id = :ControlTypeId)";
		List <?>list = factory.find(hql.toString(), new String[] { "ControlTypeId" }, new Object[] { getDomLookup(controlType).getId()});
		
		return EDAttendanceControlsConfigVoAssembler.createEDAttendanceControlsConfigVoCollectionFromEDAttendenceControlsConfig(list);
	}

	public TrackingSendToAreaVo isPatientCurrentlyinED(PatientRefVo patient)
	{
		if(patient == null)
			throw new CodingRuntimeException("Patient not provided");
		
		DomainFactory factory = getDomainFactory();
		
		String hsql = "select t1_1	from Tracking as t1_1 left join t1_1.patient as p1_1 left join t1_1.currentArea as t2_1 where (t1_1.currentArea is not null  and p1_1.id = :id and (t1_1.isDischarged is null or t1_1.isDischarged <> 1 )and t1_1.isRIE is null)";
		
		List <?> trakings = factory.find(hsql, new String[] {"id"}, new Object[] {patient.getID_Patient()});
		if(	trakings != null && trakings.size() > 0)
		{
			TrackingSendToAreaVoCollection tempColl  = TrackingSendToAreaVoAssembler.createTrackingSendToAreaVoCollectionFromTracking(trakings);
			if(	tempColl != null && tempColl.size() > 0)
				return tempColl.get(0);
		}
		
		return null;
	}

	
	public ChartRequestedVo getChartRequestedByEmergencyAttendance(EmergencyAttendanceRefVo emergencyAttendanceRef)
	{

		if (emergencyAttendanceRef == null || emergencyAttendanceRef.getID_EmergencyAttendance() == null)
		{
			throw new CodingRuntimeException("Cannot get ChartRequestedVo on null Id for EmergencyAttendance ");
		}

		DomainFactory factory = getDomainFactory();
	
		StringBuffer hql = new StringBuffer();
		hql.append("select chartReq from ChartRequested as chartReq left join chartReq.emergencyAttendence as emergeAtt  where 	(emergeAtt.id = :emergAttID) ");

		List<?> list = factory.find(hql.toString(), new String[] { "emergAttID" }, new Object[] { emergencyAttendanceRef.getID_EmergencyAttendance() });

		if (list!=null && list.size()>0)
		{
			return ChartRequestedVoAssembler.create((ChartRequested) list.get(0));
		}
		
		return null;
	}
	
	public EmergencyAttendanceBillingVo getAttendanceBillingByEmergencyAttendance(EmergencyAttendanceRefVo emergencyAttendanceRef)
	{
		if (emergencyAttendanceRef == null || emergencyAttendanceRef.getID_EmergencyAttendance() == null)
		{
			throw new CodingRuntimeException("Cannot get EmergencyAttendanceBillingVo on null Id for EmergencyAttendance ");
		}

		DomainFactory factory = getDomainFactory();
	
		StringBuffer hql = new StringBuffer();
		hql.append("select emergeAttBilling from EmergencyAttendanceBilling as emergeAttBilling left join emergeAttBilling.emergencyAttendence as emergeAtt  where 	(emergeAtt.id = :emergAttID) ");

		List<?> list = factory.find(hql.toString(), new String[] { "emergAttID" }, new Object[] { emergencyAttendanceRef.getID_EmergencyAttendance() });

		if (list!=null && list.size()>0)
		{
			return EmergencyAttendanceBillingVoAssembler.create((EmergencyAttendanceBilling) list.get(0));
		}
		
		return null;
	}

	public ims.emergency.vo.ChartRequestedVo getChartRequested(ims.core.admin.vo.ChartRequestedRefVo chartRequestedRef)
	{
		if (chartRequestedRef == null || chartRequestedRef.getID_ChartRequested() == null)
		{
			throw new CodingRuntimeException("Cannot get ChartRequestedVo on null Id ");
		}

		DomainFactory factory = getDomainFactory();

		ChartRequested domainChartRequested  = (ChartRequested) factory.getDomainObject(ChartRequested.class, chartRequestedRef.getID_ChartRequested());

		return ChartRequestedVoAssembler.create(domainChartRequested);
	}
	
	public EmergencyAttendanceBillingVo getAttendanceBilling(EmergencyAttendanceBillingRefVo attendanceBillingRef)
	{
		if (attendanceBillingRef == null || attendanceBillingRef.getID_EmergencyAttendanceBilling() == null)
		{
			throw new CodingRuntimeException("Cannot get EmergencyAttendanceBillingVo on null Id ");
		}

		DomainFactory factory = getDomainFactory();

		EmergencyAttendanceBilling domainEmergAttBilling  = (EmergencyAttendanceBilling) factory.getDomainObject(EmergencyAttendanceBilling.class, attendanceBillingRef.getID_EmergencyAttendanceBilling());

		return EmergencyAttendanceBillingVoAssembler.create(domainEmergAttBilling);
	}
	
	public AttendanceDetailsVo getAttendanceDetails(EmergencyAttendanceRefVo attendanceDetailsRef)
	{
		if (attendanceDetailsRef == null || attendanceDetailsRef.getID_EmergencyAttendance() == null)
		{
			throw new CodingRuntimeException("Cannot get AttendanceDetailsVo on null Id ");
		}

		DomainFactory factory = getDomainFactory();

		EmergencyAttendance domainEmergAttDet  = (EmergencyAttendance) factory.getDomainObject(EmergencyAttendance.class, attendanceDetailsRef.getID_EmergencyAttendance());

		return AttendanceDetailsVoAssembler.create(domainEmergAttDet);
	}

	//WDEV-16791
	public CareContextShortVoCollection getCareContextsByPatient(PatientRefVo patientRef)
	{
		if (patientRef == null || patientRef.getID_Patient() == null)
		{
			throw new CodingRuntimeException("Cannot get CareContextShortVoCollection on null Id for Patient ");
		}
		
		DomainFactory factory = getDomainFactory();

		StringBuffer hql = new StringBuffer();
		hql.append("select careContext from CareContext as careContext left join careContext.episodeOfCare as episOfCare left join episOfCare.careSpell as careSpell where careSpell.patient.id = :patID ");

		List<?> list = factory.find(hql.toString(), new String[] { "patID" }, new Object[] { patientRef.getID_Patient() });

		return CareContextShortVoAssembler.createCareContextShortVoCollectionFromCareContext(list);
	}
	
	//WDEV-16791
	public Specialty getSpecialtyForHCP(HcpRefVo hcpRef, HcpDisType hcpDisType)
	{
		String hql="";
		
		if (HcpDisType.MEDICAL.equals(hcpDisType))
		{
			hql="select med.specialty.id from Medic as med where med.id = :idHCP ";
		}
		else if (HcpDisType.NURSING.equals(hcpDisType))	
		{
			hql="select nurse.specialty.id from Nurse as nurse where nurse.id = :idHCP ";
		}
		else if (HcpDisType.THERAPY.equals(hcpDisType))	
		{
			hql="select therapist.specialty.id from Therapist as therapist where therapist.id = :idHCP ";
		}
		else
			return null;
		
		List<?> specialtyIds = getDomainFactory().find(hql, new String[] {"idHCP"}, new Object[] {hcpRef.getID_Hcp()});
		if(specialtyIds != null && specialtyIds.size() == 1)
		{
			if(specialtyIds.get(0) != null)
				return LookupHelper.getSpecialtyInstance(getLookupService(), ((Integer)specialtyIds.get(0)).intValue());
		}
			
		return null;
	}

	//WDEV-17615
	public LocationLiteVo getCurrentHospital(ILocation currentLocation)
	{
		if(currentLocation == null)
			return null;
		
		DomainFactory factory = getDomainFactory();
		
		Location currentHospital = getHospital((Location) factory.getDomainObject(Location.class, currentLocation.getID()));
		
		if(currentHospital instanceof Location)
			return LocationLiteVoAssembler.create((Location) currentHospital);
		
		return null;
	}
	
	//WDEV-17615
	private Location getHospital(Location doLocation)
	{
		if(doLocation == null)
			return null;
		
		if(doLocation instanceof Location && doLocation.getType().equals(getDomLookup(LocationType.HOSP)))
			return doLocation;
	
		while(doLocation.getParentLocation() != null) 
		{
			doLocation = doLocation.getParentLocation();
			if(doLocation instanceof Location && doLocation.getType().equals(getDomLookup(LocationType.HOSP)))
				return doLocation;
		}
		
		return null;
	}
}
