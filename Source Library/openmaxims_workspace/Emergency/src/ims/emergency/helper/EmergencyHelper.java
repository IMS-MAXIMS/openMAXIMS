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
import ims.admin.vo.domain.EDAttendanceControlsConfigVoAssembler;
import ims.admin.vo.lookups.EDAttendenceControlType;
import ims.core.admin.domain.objects.ChartRequested;
import ims.core.admin.domain.objects.EmergencyAttendance;
import ims.core.admin.domain.objects.EmergencyAttendanceBilling;
import ims.core.admin.pas.domain.objects.PendingEmergencyAdmission;
import ims.core.admin.pas.vo.PendingEmergencyAdmissionRefVo;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.admin.vo.EmergencyAttendanceBillingRefVo;
import ims.core.admin.vo.EmergencyAttendanceRefVo;
import ims.core.admin.vo.EpisodeOfCareRefVo;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.resource.people.vo.MemberOfStaffRefVo;
import ims.core.resource.place.domain.objects.Location;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.CareContextShortVoCollection;
import ims.core.vo.EDAttendanceformsConfigVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.PendingEmergencyAdmissionAdmitVo;
import ims.core.vo.domain.CareContextShortVoAssembler;
import ims.core.vo.domain.EDAttendanceformsConfigVoAssembler;
import ims.core.vo.domain.LocationLiteVoAssembler;
import ims.core.vo.domain.PendingEmergencyAdmissionAdmitVoAssembler;
import ims.core.vo.lookups.EmergencyAdmissionStatus;
import ims.core.vo.lookups.HcpDisType;
import ims.core.vo.lookups.LocationType;
import ims.core.vo.lookups.LookupHelper;
import ims.core.vo.lookups.Specialty;
import ims.domain.DomainFactory;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.emergency.configuration.vo.TrackingAreaRefVo;
import ims.emergency.domain.objects.Tracking;
import ims.emergency.vo.AttendanceDetailsVo;
import ims.emergency.vo.CareContextForAttendanceNotesVoCollection;
import ims.emergency.vo.ChartRequestedVo;
import ims.emergency.vo.EmergencyAttendanceBillingVo;
import ims.emergency.vo.TrackingAttendanceOutcomeVo;
import ims.emergency.vo.TrackingAttendanceStatusVo;
import ims.emergency.vo.TrackingSendToAreaVo;
import ims.emergency.vo.TrackingSendToAreaVoCollection;
import ims.emergency.vo.domain.AttendanceDetailsVoAssembler;
import ims.emergency.vo.domain.CareContextForAttendanceNotesVoAssembler;
import ims.emergency.vo.domain.ChartRequestedVoAssembler;
import ims.emergency.vo.domain.EmergencyAttendanceBillingVoAssembler;
import ims.emergency.vo.domain.TrackingAttendanceOutcomeVoAssembler;
import ims.emergency.vo.domain.TrackingSendToAreaVoAssembler;
import ims.emergency.vo.lookups.AttendanceOutcome;
import ims.emergency.vo.lookups.TrackingStatus;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.interfaces.ILocation;
import ims.framework.utils.DateTime;

import java.util.List;

public class EmergencyHelper extends DomainImpl implements IEmergencyHelper, ims.core.helper.IEmergencyHelper
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
		hql.append("select chartReq from ChartRequested as chartReq left join chartReq.emergencyAttendence as emergeAtt  where 	(emergeAtt.id = :emergAttID and (emergeAtt.isRIE is null or emergeAtt.isRIE = 0) ) "); //WDEV-22956

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
		hql.append("select emergeAttBilling from EmergencyAttendanceBilling as emergeAttBilling left join emergeAttBilling.emergencyAttendence as emergeAtt  where 	(emergeAtt.id = :emergAttID and (emergeAtt.isRIE is null or emergeAtt.isRIE = 0)) "); //WDEV-22956

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
	
	public CareContextForAttendanceNotesVoCollection getCareContextsLiteByPatient(PatientRefVo patientRef)
	{
		if (patientRef == null || patientRef.getID_Patient() == null)
		{
			throw new CodingRuntimeException("Cannot get CareContextShortVoCollection on null Id for Patient ");
		}
		
		DomainFactory factory = getDomainFactory();

		StringBuffer hql = new StringBuffer();
		hql.append("select careContext from CareContext as careContext left join careContext.episodeOfCare as episOfCare left join episOfCare.careSpell as careSpell where careSpell.patient.id = :patID ");

		List<?> list = factory.find(hql.toString(), new String[] { "patID" }, new Object[] { patientRef.getID_Patient() });

		return CareContextForAttendanceNotesVoAssembler.createCareContextForAttendanceNotesVoCollectionFromCareContext(list);
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


	public PendingEmergencyAdmissionAdmitVo autoDischargeFromEmergencyTracking(PendingEmergencyAdmissionRefVo pendingEmergencyAdmissionRef, DateTime conclusionDateTime, HcpLiteVo consultant) throws StaleObjectException
	{
		if (pendingEmergencyAdmissionRef == null || pendingEmergencyAdmissionRef.getID_PendingEmergencyAdmission() == null)
			throw new CodingRuntimeException("Invalid parameter: PendingEmergencyAdmission record cannot be null.");

		DomainFactory factory = getDomainFactory();
		
		// Get Tracking record
		StringBuilder queryTracking = new StringBuilder("SELECT tracking ");
		queryTracking.append(" FROM Tracking AS tracking ");
		queryTracking.append(" LEFT JOIN tracking.associatedPendingEmergencyAdmission AS emergency ");
		
		queryTracking.append(" WHERE emergency.id = :ER_ADMISSION_ID ");
		
		
		Tracking doTracking = (Tracking) factory.findFirst(queryTracking.toString(), "ER_ADMISSION_ID", pendingEmergencyAdmissionRef.getID_PendingEmergencyAdmission());
		TrackingAttendanceOutcomeVo tracking = TrackingAttendanceOutcomeVoAssembler.create(doTracking);
		
		// Set the Conclusion and Outcome details
		tracking.getAttendance().setConclusionDateTime(conclusionDateTime);
		tracking.getAttendance().setOutcome(AttendanceOutcome.ADMISSIONS);
		tracking.getAttendance().setDischargeDateTime(conclusionDateTime);
		
		AuthoringInformationVo discharghingAuthoringInformation = new AuthoringInformationVo();
		discharghingAuthoringInformation.setAuthoringDateTime(conclusionDateTime);
		discharghingAuthoringInformation.setAuthoringHcp(consultant);
		
		tracking.getAttendance().setDischargingHCP(discharghingAuthoringInformation);
		
		// Set tracking status
		// Create new current status (Decision To Admit) for tracking
		TrackingAttendanceStatusVo newStatus = new TrackingAttendanceStatusVo();

		newStatus.setPatient(new PatientRefVo(doTracking.getPatient().getId(), doTracking.getPatient().getVersion()));
		newStatus.setEpisode(new EpisodeOfCareRefVo(doTracking.getEpisode().getEpisodeOfCare().getId(), doTracking.getEpisode().getEpisodeOfCare().getVersion()));
		newStatus.setAttendance(new CareContextRefVo(doTracking.getAttendance().getCareContext().getId(), doTracking.getAttendance().getCareContext().getVersion()));
		if (doTracking.getCurrentArea() != null)
			newStatus.setTrackingArea(new TrackingAreaRefVo(doTracking.getCurrentArea().getId(), doTracking.getCurrentArea().getVersion()));
		newStatus.setStatusDatetime(new DateTime());
		newStatus.setCreatedBy((MemberOfStaffRefVo) getMosUser());
		newStatus.setStatus(TrackingStatus.DISCHARGED);
		
		newStatus.setPrevStatus((tracking != null && tracking.getCurrentStatus() != null) ? tracking.getCurrentStatus().getStatus() : null);
		newStatus.setPrevTrackingArea((tracking != null && tracking.getCurrentStatus() != null) ? tracking.getCurrentStatus().getTrackingArea() : null);
		tracking.setCurrentStatus(newStatus);
		
		// Set the status of the associated PendingEmergencyAddmision
		if (tracking.getAssociatedPendingEmergencyAdmission() != null && EmergencyAdmissionStatus.DTA.equals(tracking.getAssociatedPendingEmergencyAdmission().getAdmissionStatus()))
		{
			tracking.getAssociatedPendingEmergencyAdmission().setAdmissionStatus(EmergencyAdmissionStatus.DISCHARGED);
			tracking.getAssociatedPendingEmergencyAdmission().setConclusionDate(conclusionDateTime);
		}
		
		tracking.setRequiringDischargeDocumentationReview(true);
		
		// Set Discharging data
		tracking.setIsDischarged(Boolean.TRUE);
		tracking.setCurrentArea(null);
		tracking.getAttendance().getCareContext().setEndDateTime(conclusionDateTime);
		
		// Save Tracking record
		doTracking = TrackingAttendanceOutcomeVoAssembler.extractTracking(getDomainFactory(), tracking);
		factory.save(doTracking);
		
		// Return updated PendingEmergencyAdmission
		return PendingEmergencyAdmissionAdmitVoAssembler.create((PendingEmergencyAdmission) factory.getDomainObject(PendingEmergencyAdmission.class, pendingEmergencyAdmissionRef.getID_PendingEmergencyAdmission()));
	}
}
