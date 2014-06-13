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
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.core.admin.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class EmergencyAttendance extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100025;
	private static final long serialVersionUID = 1004100025L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ArrivalDateTime */
	private java.util.Date arrivalDateTime;
	/** Registration DateTime */
	private java.util.Date registrationDateTime;
	/** Discharge Date Time */
	private java.util.Date dischargeDateTime;
	/** Attendance Type */
	private ims.domain.lookups.LookupInstance attendanceType;
	/** Emergency Department Type */
	private ims.domain.lookups.LookupInstance emergencyDeptType;
	/** Mode Of Arrival */
	private ims.domain.lookups.LookupInstance modeOfArrival;
	/** Accompanied By */
	private ims.domain.lookups.LookupInstance accompaniedBy;
	/** RegistrationLocation */
	private ims.core.resource.place.domain.objects.Location registrationLocation;
	/** Discharge Outcome */
	private ims.domain.lookups.LookupInstance outcome;
	/** Destination */
	private String destination;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** EmergencyEpisode */
	private ims.core.admin.domain.objects.EmergencyEpisode emergencyEpisode;
	/** Triage Date and Time */
	private java.util.Date triageDateTime;
	/** Age At Time of Attendance */
	private Integer ageAtAttendance;
	/** Comments */
	private String comments;
	/** isUnknownPatient */
	private Boolean isUnknownPatient;
	/** isPrimaryCare */
	private Boolean isPrimaryCare;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Episode */
	private ims.core.admin.domain.objects.EmergencyEpisode episode;
	/** Ambulance Arrival DateTime */
	private java.util.Date ambulanceArrivalDateTime;
	/** Ambulance Job No */
	private String ambulanceJobNo;
	/** Conclusion Date Time */
	private java.util.Date conclusionDateTime;
	/** BedTypeRequested */
	private ims.domain.lookups.LookupInstance bedTypeRequested;
	/** PatientAttendanceStatus - Private/Publin/Unknown */
	private ims.domain.lookups.LookupInstance patientAttendanceStatus;
	/** AttendanceDataVerified */
	private ims.domain.lookups.LookupInstance attendanceDataVerified;
	/** AttendanceSourceOfData */
	private ims.domain.lookups.LookupInstance attendanceSourceOfData;
	/** AttendanceReasonNotVerified */
	private ims.domain.lookups.LookupInstance attendanceReasonNotVerified;
	/** UrgencyLevel */
	private ims.domain.lookups.LookupInstance urgencyLevel;
	/** Was this attendance a Quick Registration  */
	private Boolean isQuickRegistration;
	/** Was this attendance an Expected Arrival */
	private Boolean isExpectedArrival;
	/** Was this attendance a Major Incident */
	private Boolean isMajorIncident;
	/** Expected Arrival Date Time */
	private java.util.Date expectedArrivalDateTime;
	/** DischargingHCP */
	private ims.core.clinical.domain.objects.AuthoringInformation dischargingHCP;
	/** Visit Type */
	private ims.domain.lookups.LookupInstance visitType;
	/** ED Consultant */
	private ims.domain.lookups.LookupInstance eDConsultant;
	/** RegisteringMOS */
	private ims.core.resource.people.domain.objects.MemberOfStaff registeringMOS;
	/** UpdatingMOS */
	private ims.core.resource.people.domain.objects.MemberOfStaff updatingMOS;
	/** ObsPatientAssessment */
	private ims.assessment.instantiation.domain.objects.PatientAssessment obsPatientAssessment;
	/** PreferedLanguage */
	private ims.domain.lookups.LookupInstance preferedLanguage;
	/** IntrepreterRequired */
	private ims.domain.lookups.LookupInstance intrepreterRequired;
	/** Department type */
	private ims.domain.lookups.LookupInstance deptType;
	/** Defaults to false. SEt to true as part of coding Process. */
	private Boolean isCoded;
	/** Main Comissioner */
	private String mC;
	/** Organisation to which Cost of Treatment Accrues */
	private String cOTA;
	/** CCG/PCG of GP */
	private String pCG1;
	/** CCG/PCG of Patient */
	private String pCG2;
	/** Prime Recipient */
	private String hAR;
	/** Purchaser */
	private String purchaser;
	/** SequenceNumber */
	private String sequenceNumber;
	/** Patient Medical Insurance Details */
	private ims.core.patient.domain.objects.Insurance insurance;
	/** PatientMedicalInsurance */
	private ims.core.clinical.domain.objects.PatientMedicalInsurance patientMedicalInsurance;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public EmergencyAttendance (Integer id, int ver)
    {
    	super(id, ver);
    }
    public EmergencyAttendance ()
    {
    	super();
    }
    public EmergencyAttendance (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.EmergencyAttendance.class;
	}


	public java.util.Date getArrivalDateTime() {
		return arrivalDateTime;
	}
	public void setArrivalDateTime(java.util.Date arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public java.util.Date getRegistrationDateTime() {
		return registrationDateTime;
	}
	public void setRegistrationDateTime(java.util.Date registrationDateTime) {
		this.registrationDateTime = registrationDateTime;
	}

	public java.util.Date getDischargeDateTime() {
		return dischargeDateTime;
	}
	public void setDischargeDateTime(java.util.Date dischargeDateTime) {
		this.dischargeDateTime = dischargeDateTime;
	}

	public ims.domain.lookups.LookupInstance getAttendanceType() {
		return attendanceType;
	}
	public void setAttendanceType(ims.domain.lookups.LookupInstance attendanceType) {
		this.attendanceType = attendanceType;
	}

	public ims.domain.lookups.LookupInstance getEmergencyDeptType() {
		return emergencyDeptType;
	}
	public void setEmergencyDeptType(ims.domain.lookups.LookupInstance emergencyDeptType) {
		this.emergencyDeptType = emergencyDeptType;
	}

	public ims.domain.lookups.LookupInstance getModeOfArrival() {
		return modeOfArrival;
	}
	public void setModeOfArrival(ims.domain.lookups.LookupInstance modeOfArrival) {
		this.modeOfArrival = modeOfArrival;
	}

	public ims.domain.lookups.LookupInstance getAccompaniedBy() {
		return accompaniedBy;
	}
	public void setAccompaniedBy(ims.domain.lookups.LookupInstance accompaniedBy) {
		this.accompaniedBy = accompaniedBy;
	}

	public ims.core.resource.place.domain.objects.Location getRegistrationLocation() {
		return registrationLocation;
	}
	public void setRegistrationLocation(ims.core.resource.place.domain.objects.Location registrationLocation) {
		this.registrationLocation = registrationLocation;
	}

	public ims.domain.lookups.LookupInstance getOutcome() {
		return outcome;
	}
	public void setOutcome(ims.domain.lookups.LookupInstance outcome) {
		this.outcome = outcome;
	}

	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		if ( null != destination && destination.length() > 120 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for destination. Tried to set value: "+
				destination);
		}
		this.destination = destination;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.admin.domain.objects.EmergencyEpisode getEmergencyEpisode() {
		return emergencyEpisode;
	}
	public void setEmergencyEpisode(ims.core.admin.domain.objects.EmergencyEpisode emergencyEpisode) {
		this.emergencyEpisode = emergencyEpisode;
	}

	public java.util.Date getTriageDateTime() {
		return triageDateTime;
	}
	public void setTriageDateTime(java.util.Date triageDateTime) {
		this.triageDateTime = triageDateTime;
	}

	public Integer getAgeAtAttendance() {
		return ageAtAttendance;
	}
	public void setAgeAtAttendance(Integer ageAtAttendance) {
		this.ageAtAttendance = ageAtAttendance;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public Boolean isIsUnknownPatient() {
		return isUnknownPatient;
	}
	public void setIsUnknownPatient(Boolean isUnknownPatient) {
		this.isUnknownPatient = isUnknownPatient;
	}

	public Boolean isIsPrimaryCare() {
		return isPrimaryCare;
	}
	public void setIsPrimaryCare(Boolean isPrimaryCare) {
		this.isPrimaryCare = isPrimaryCare;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.EmergencyEpisode getEpisode() {
		return episode;
	}
	public void setEpisode(ims.core.admin.domain.objects.EmergencyEpisode episode) {
		this.episode = episode;
	}

	public java.util.Date getAmbulanceArrivalDateTime() {
		return ambulanceArrivalDateTime;
	}
	public void setAmbulanceArrivalDateTime(java.util.Date ambulanceArrivalDateTime) {
		this.ambulanceArrivalDateTime = ambulanceArrivalDateTime;
	}

	public String getAmbulanceJobNo() {
		return ambulanceJobNo;
	}
	public void setAmbulanceJobNo(String ambulanceJobNo) {
		if ( null != ambulanceJobNo && ambulanceJobNo.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for ambulanceJobNo. Tried to set value: "+
				ambulanceJobNo);
		}
		this.ambulanceJobNo = ambulanceJobNo;
	}

	public java.util.Date getConclusionDateTime() {
		return conclusionDateTime;
	}
	public void setConclusionDateTime(java.util.Date conclusionDateTime) {
		this.conclusionDateTime = conclusionDateTime;
	}

	public ims.domain.lookups.LookupInstance getBedTypeRequested() {
		return bedTypeRequested;
	}
	public void setBedTypeRequested(ims.domain.lookups.LookupInstance bedTypeRequested) {
		this.bedTypeRequested = bedTypeRequested;
	}

	public ims.domain.lookups.LookupInstance getPatientAttendanceStatus() {
		return patientAttendanceStatus;
	}
	public void setPatientAttendanceStatus(ims.domain.lookups.LookupInstance patientAttendanceStatus) {
		this.patientAttendanceStatus = patientAttendanceStatus;
	}

	public ims.domain.lookups.LookupInstance getAttendanceDataVerified() {
		return attendanceDataVerified;
	}
	public void setAttendanceDataVerified(ims.domain.lookups.LookupInstance attendanceDataVerified) {
		this.attendanceDataVerified = attendanceDataVerified;
	}

	public ims.domain.lookups.LookupInstance getAttendanceSourceOfData() {
		return attendanceSourceOfData;
	}
	public void setAttendanceSourceOfData(ims.domain.lookups.LookupInstance attendanceSourceOfData) {
		this.attendanceSourceOfData = attendanceSourceOfData;
	}

	public ims.domain.lookups.LookupInstance getAttendanceReasonNotVerified() {
		return attendanceReasonNotVerified;
	}
	public void setAttendanceReasonNotVerified(ims.domain.lookups.LookupInstance attendanceReasonNotVerified) {
		this.attendanceReasonNotVerified = attendanceReasonNotVerified;
	}

	public ims.domain.lookups.LookupInstance getUrgencyLevel() {
		return urgencyLevel;
	}
	public void setUrgencyLevel(ims.domain.lookups.LookupInstance urgencyLevel) {
		this.urgencyLevel = urgencyLevel;
	}

	public Boolean isIsQuickRegistration() {
		return isQuickRegistration;
	}
	public void setIsQuickRegistration(Boolean isQuickRegistration) {
		this.isQuickRegistration = isQuickRegistration;
	}

	public Boolean isIsExpectedArrival() {
		return isExpectedArrival;
	}
	public void setIsExpectedArrival(Boolean isExpectedArrival) {
		this.isExpectedArrival = isExpectedArrival;
	}

	public Boolean isIsMajorIncident() {
		return isMajorIncident;
	}
	public void setIsMajorIncident(Boolean isMajorIncident) {
		this.isMajorIncident = isMajorIncident;
	}

	public java.util.Date getExpectedArrivalDateTime() {
		return expectedArrivalDateTime;
	}
	public void setExpectedArrivalDateTime(java.util.Date expectedArrivalDateTime) {
		this.expectedArrivalDateTime = expectedArrivalDateTime;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getDischargingHCP() {
		return dischargingHCP;
	}
	public void setDischargingHCP(ims.core.clinical.domain.objects.AuthoringInformation dischargingHCP) {
		this.dischargingHCP = dischargingHCP;
	}

	public ims.domain.lookups.LookupInstance getVisitType() {
		return visitType;
	}
	public void setVisitType(ims.domain.lookups.LookupInstance visitType) {
		this.visitType = visitType;
	}

	public ims.domain.lookups.LookupInstance getEDConsultant() {
		return eDConsultant;
	}
	public void setEDConsultant(ims.domain.lookups.LookupInstance eDConsultant) {
		this.eDConsultant = eDConsultant;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRegisteringMOS() {
		return registeringMOS;
	}
	public void setRegisteringMOS(ims.core.resource.people.domain.objects.MemberOfStaff registeringMOS) {
		this.registeringMOS = registeringMOS;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getUpdatingMOS() {
		return updatingMOS;
	}
	public void setUpdatingMOS(ims.core.resource.people.domain.objects.MemberOfStaff updatingMOS) {
		this.updatingMOS = updatingMOS;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getObsPatientAssessment() {
		return obsPatientAssessment;
	}
	public void setObsPatientAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment obsPatientAssessment) {
		this.obsPatientAssessment = obsPatientAssessment;
	}

	public ims.domain.lookups.LookupInstance getPreferedLanguage() {
		return preferedLanguage;
	}
	public void setPreferedLanguage(ims.domain.lookups.LookupInstance preferedLanguage) {
		this.preferedLanguage = preferedLanguage;
	}

	public ims.domain.lookups.LookupInstance getIntrepreterRequired() {
		return intrepreterRequired;
	}
	public void setIntrepreterRequired(ims.domain.lookups.LookupInstance intrepreterRequired) {
		this.intrepreterRequired = intrepreterRequired;
	}

	public ims.domain.lookups.LookupInstance getDeptType() {
		return deptType;
	}
	public void setDeptType(ims.domain.lookups.LookupInstance deptType) {
		this.deptType = deptType;
	}

	public Boolean isIsCoded() {
		return isCoded;
	}
	public void setIsCoded(Boolean isCoded) {
		this.isCoded = isCoded;
	}

	public String getMC() {
		return mC;
	}
	public void setMC(String mC) {
		if ( null != mC && mC.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for mC. Tried to set value: "+
				mC);
		}
		this.mC = mC;
	}

	public String getCOTA() {
		return cOTA;
	}
	public void setCOTA(String cOTA) {
		if ( null != cOTA && cOTA.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cOTA. Tried to set value: "+
				cOTA);
		}
		this.cOTA = cOTA;
	}

	public String getPCG1() {
		return pCG1;
	}
	public void setPCG1(String pCG1) {
		if ( null != pCG1 && pCG1.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pCG1. Tried to set value: "+
				pCG1);
		}
		this.pCG1 = pCG1;
	}

	public String getPCG2() {
		return pCG2;
	}
	public void setPCG2(String pCG2) {
		if ( null != pCG2 && pCG2.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pCG2. Tried to set value: "+
				pCG2);
		}
		this.pCG2 = pCG2;
	}

	public String getHAR() {
		return hAR;
	}
	public void setHAR(String hAR) {
		if ( null != hAR && hAR.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for hAR. Tried to set value: "+
				hAR);
		}
		this.hAR = hAR;
	}

	public String getPurchaser() {
		return purchaser;
	}
	public void setPurchaser(String purchaser) {
		if ( null != purchaser && purchaser.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for purchaser. Tried to set value: "+
				purchaser);
		}
		this.purchaser = purchaser;
	}

	public String getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(String sequenceNumber) {
		if ( null != sequenceNumber && sequenceNumber.length() > 6 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for sequenceNumber. Tried to set value: "+
				sequenceNumber);
		}
		this.sequenceNumber = sequenceNumber;
	}

	public ims.core.patient.domain.objects.Insurance getInsurance() {
		return insurance;
	}
	public void setInsurance(ims.core.patient.domain.objects.Insurance insurance) {
		this.insurance = insurance;
	}

	public ims.core.clinical.domain.objects.PatientMedicalInsurance getPatientMedicalInsurance() {
		return patientMedicalInsurance;
	}
	public void setPatientMedicalInsurance(ims.core.clinical.domain.objects.PatientMedicalInsurance patientMedicalInsurance) {
		this.patientMedicalInsurance = patientMedicalInsurance;
	}

	public ims.domain.SystemInformation getSystemInformation() {
		if (systemInformation == null) systemInformation = new ims.domain.SystemInformation();
		return systemInformation;
	}


	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Instantiation".equals("Configuration") )
			return true;
		else
			return false;
	}





	public int getClassId() {
		return CLASSID;
	}

	public String getClassVersion()
	{
		return CLASSVERSION;
	}

	public String toAuditString()
	{
		StringBuffer auditStr = new StringBuffer();
		
		auditStr.append("\r\n*arrivalDateTime* :");
		auditStr.append(arrivalDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*registrationDateTime* :");
		auditStr.append(registrationDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDateTime* :");
		auditStr.append(dischargeDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*attendanceType* :");
		if (attendanceType != null)
			auditStr.append(attendanceType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*emergencyDeptType* :");
		if (emergencyDeptType != null)
			auditStr.append(emergencyDeptType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*modeOfArrival* :");
		if (modeOfArrival != null)
			auditStr.append(modeOfArrival.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*accompaniedBy* :");
		if (accompaniedBy != null)
			auditStr.append(accompaniedBy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*registrationLocation* :");
		if (registrationLocation != null)
		{
			auditStr.append(toShortClassName(registrationLocation));
				
		    auditStr.append(registrationLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*outcome* :");
		if (outcome != null)
			auditStr.append(outcome.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*destination* :");
		auditStr.append(destination);
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*emergencyEpisode* :");
		if (emergencyEpisode != null)
		{
			auditStr.append(toShortClassName(emergencyEpisode));
				
		    auditStr.append(emergencyEpisode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*triageDateTime* :");
		auditStr.append(triageDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*ageAtAttendance* :");
		auditStr.append(ageAtAttendance);
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*isUnknownPatient* :");
		auditStr.append(isUnknownPatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*isPrimaryCare* :");
		auditStr.append(isPrimaryCare);
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episode* :");
		if (episode != null)
		{
			auditStr.append(toShortClassName(episode));
				
		    auditStr.append(episode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*ambulanceArrivalDateTime* :");
		auditStr.append(ambulanceArrivalDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*ambulanceJobNo* :");
		auditStr.append(ambulanceJobNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*conclusionDateTime* :");
		auditStr.append(conclusionDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*bedTypeRequested* :");
		if (bedTypeRequested != null)
			auditStr.append(bedTypeRequested.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientAttendanceStatus* :");
		if (patientAttendanceStatus != null)
			auditStr.append(patientAttendanceStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*attendanceDataVerified* :");
		if (attendanceDataVerified != null)
			auditStr.append(attendanceDataVerified.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*attendanceSourceOfData* :");
		if (attendanceSourceOfData != null)
			auditStr.append(attendanceSourceOfData.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*attendanceReasonNotVerified* :");
		if (attendanceReasonNotVerified != null)
			auditStr.append(attendanceReasonNotVerified.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*urgencyLevel* :");
		if (urgencyLevel != null)
			auditStr.append(urgencyLevel.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isQuickRegistration* :");
		auditStr.append(isQuickRegistration);
	    auditStr.append("; ");
		auditStr.append("\r\n*isExpectedArrival* :");
		auditStr.append(isExpectedArrival);
	    auditStr.append("; ");
		auditStr.append("\r\n*isMajorIncident* :");
		auditStr.append(isMajorIncident);
	    auditStr.append("; ");
		auditStr.append("\r\n*expectedArrivalDateTime* :");
		auditStr.append(expectedArrivalDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargingHCP* :");
		if (dischargingHCP != null)
		{
			auditStr.append(toShortClassName(dischargingHCP));
				
		    auditStr.append(dischargingHCP.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*visitType* :");
		if (visitType != null)
			auditStr.append(visitType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*eDConsultant* :");
		if (eDConsultant != null)
			auditStr.append(eDConsultant.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*registeringMOS* :");
		if (registeringMOS != null)
		{
			auditStr.append(toShortClassName(registeringMOS));
				
		    auditStr.append(registeringMOS.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*updatingMOS* :");
		if (updatingMOS != null)
		{
			auditStr.append(toShortClassName(updatingMOS));
				
		    auditStr.append(updatingMOS.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*obsPatientAssessment* :");
		if (obsPatientAssessment != null)
		{
			auditStr.append(toShortClassName(obsPatientAssessment));
				
		    auditStr.append(obsPatientAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*preferedLanguage* :");
		if (preferedLanguage != null)
			auditStr.append(preferedLanguage.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*intrepreterRequired* :");
		if (intrepreterRequired != null)
			auditStr.append(intrepreterRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*deptType* :");
		if (deptType != null)
			auditStr.append(deptType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isCoded* :");
		auditStr.append(isCoded);
	    auditStr.append("; ");
		auditStr.append("\r\n*mC* :");
		auditStr.append(mC);
	    auditStr.append("; ");
		auditStr.append("\r\n*cOTA* :");
		auditStr.append(cOTA);
	    auditStr.append("; ");
		auditStr.append("\r\n*pCG1* :");
		auditStr.append(pCG1);
	    auditStr.append("; ");
		auditStr.append("\r\n*pCG2* :");
		auditStr.append(pCG2);
	    auditStr.append("; ");
		auditStr.append("\r\n*hAR* :");
		auditStr.append(hAR);
	    auditStr.append("; ");
		auditStr.append("\r\n*purchaser* :");
		auditStr.append(purchaser);
	    auditStr.append("; ");
		auditStr.append("\r\n*sequenceNumber* :");
		auditStr.append(sequenceNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*insurance* :");
		if (insurance != null)
		{
			auditStr.append(toShortClassName(insurance));
				
		    auditStr.append(insurance.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientMedicalInsurance* :");
		if (patientMedicalInsurance != null)
		{
			auditStr.append(toShortClassName(patientMedicalInsurance));
				
		    auditStr.append(patientMedicalInsurance.getId());
		}
	    auditStr.append("; ");
		return auditStr.toString();
	}
	
	public String toXMLString()
	{
		return toXMLString(new java.util.HashMap());
	}
	
	public String toXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<class type=\"" + this.getClass().getName() + "\" ");		
		sb.append(" id=\"" + this.getId() + "\""); 
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		String keyClassName = "EmergencyAttendance";
		String externalSource = ims.configuration.EnvironmentConfig.getImportExportSourceName();
		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + this.getId());
		if (impObj == null)
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(this.getId());
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(this);
			impObj.setLocalId(this.getId()); 
    		impObj.setClassName(keyClassName); 
			domMap.put(keyClassName + "_" + externalSource + "_" + this.getId(), impObj);
		}
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getArrivalDateTime() != null)
		{
			sb.append("<arrivalDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getArrivalDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</arrivalDateTime>");		
		}
		if (this.getRegistrationDateTime() != null)
		{
			sb.append("<registrationDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRegistrationDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</registrationDateTime>");		
		}
		if (this.getDischargeDateTime() != null)
		{
			sb.append("<dischargeDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDateTime>");		
		}
		if (this.getAttendanceType() != null)
		{
			sb.append("<attendanceType>");
			sb.append(this.getAttendanceType().toXMLString()); 
			sb.append("</attendanceType>");		
		}
		if (this.getEmergencyDeptType() != null)
		{
			sb.append("<emergencyDeptType>");
			sb.append(this.getEmergencyDeptType().toXMLString()); 
			sb.append("</emergencyDeptType>");		
		}
		if (this.getModeOfArrival() != null)
		{
			sb.append("<modeOfArrival>");
			sb.append(this.getModeOfArrival().toXMLString()); 
			sb.append("</modeOfArrival>");		
		}
		if (this.getAccompaniedBy() != null)
		{
			sb.append("<accompaniedBy>");
			sb.append(this.getAccompaniedBy().toXMLString()); 
			sb.append("</accompaniedBy>");		
		}
		if (this.getRegistrationLocation() != null)
		{
			sb.append("<registrationLocation>");
			sb.append(this.getRegistrationLocation().toXMLString(domMap)); 	
			sb.append("</registrationLocation>");		
		}
		if (this.getOutcome() != null)
		{
			sb.append("<outcome>");
			sb.append(this.getOutcome().toXMLString()); 
			sb.append("</outcome>");		
		}
		if (this.getDestination() != null)
		{
			sb.append("<destination>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDestination().toString()));
			sb.append("</destination>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getEmergencyEpisode() != null)
		{
			sb.append("<emergencyEpisode>");
			sb.append(this.getEmergencyEpisode().toXMLString(domMap)); 	
			sb.append("</emergencyEpisode>");		
		}
		if (this.getTriageDateTime() != null)
		{
			sb.append("<triageDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getTriageDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</triageDateTime>");		
		}
		if (this.getAgeAtAttendance() != null)
		{
			sb.append("<ageAtAttendance>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAgeAtAttendance().toString()));
			sb.append("</ageAtAttendance>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.isIsUnknownPatient() != null)
		{
			sb.append("<isUnknownPatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsUnknownPatient().toString()));
			sb.append("</isUnknownPatient>");		
		}
		if (this.isIsPrimaryCare() != null)
		{
			sb.append("<isPrimaryCare>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPrimaryCare().toString()));
			sb.append("</isPrimaryCare>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getEpisode() != null)
		{
			sb.append("<episode>");
			sb.append(this.getEpisode().toXMLString(domMap)); 	
			sb.append("</episode>");		
		}
		if (this.getAmbulanceArrivalDateTime() != null)
		{
			sb.append("<ambulanceArrivalDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAmbulanceArrivalDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</ambulanceArrivalDateTime>");		
		}
		if (this.getAmbulanceJobNo() != null)
		{
			sb.append("<ambulanceJobNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAmbulanceJobNo().toString()));
			sb.append("</ambulanceJobNo>");		
		}
		if (this.getConclusionDateTime() != null)
		{
			sb.append("<conclusionDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getConclusionDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</conclusionDateTime>");		
		}
		if (this.getBedTypeRequested() != null)
		{
			sb.append("<bedTypeRequested>");
			sb.append(this.getBedTypeRequested().toXMLString()); 
			sb.append("</bedTypeRequested>");		
		}
		if (this.getPatientAttendanceStatus() != null)
		{
			sb.append("<patientAttendanceStatus>");
			sb.append(this.getPatientAttendanceStatus().toXMLString()); 
			sb.append("</patientAttendanceStatus>");		
		}
		if (this.getAttendanceDataVerified() != null)
		{
			sb.append("<attendanceDataVerified>");
			sb.append(this.getAttendanceDataVerified().toXMLString()); 
			sb.append("</attendanceDataVerified>");		
		}
		if (this.getAttendanceSourceOfData() != null)
		{
			sb.append("<attendanceSourceOfData>");
			sb.append(this.getAttendanceSourceOfData().toXMLString()); 
			sb.append("</attendanceSourceOfData>");		
		}
		if (this.getAttendanceReasonNotVerified() != null)
		{
			sb.append("<attendanceReasonNotVerified>");
			sb.append(this.getAttendanceReasonNotVerified().toXMLString()); 
			sb.append("</attendanceReasonNotVerified>");		
		}
		if (this.getUrgencyLevel() != null)
		{
			sb.append("<urgencyLevel>");
			sb.append(this.getUrgencyLevel().toXMLString()); 
			sb.append("</urgencyLevel>");		
		}
		if (this.isIsQuickRegistration() != null)
		{
			sb.append("<isQuickRegistration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsQuickRegistration().toString()));
			sb.append("</isQuickRegistration>");		
		}
		if (this.isIsExpectedArrival() != null)
		{
			sb.append("<isExpectedArrival>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsExpectedArrival().toString()));
			sb.append("</isExpectedArrival>");		
		}
		if (this.isIsMajorIncident() != null)
		{
			sb.append("<isMajorIncident>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMajorIncident().toString()));
			sb.append("</isMajorIncident>");		
		}
		if (this.getExpectedArrivalDateTime() != null)
		{
			sb.append("<expectedArrivalDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getExpectedArrivalDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</expectedArrivalDateTime>");		
		}
		if (this.getDischargingHCP() != null)
		{
			sb.append("<dischargingHCP>");
			sb.append(this.getDischargingHCP().toXMLString(domMap)); 	
			sb.append("</dischargingHCP>");		
		}
		if (this.getVisitType() != null)
		{
			sb.append("<visitType>");
			sb.append(this.getVisitType().toXMLString()); 
			sb.append("</visitType>");		
		}
		if (this.getEDConsultant() != null)
		{
			sb.append("<eDConsultant>");
			sb.append(this.getEDConsultant().toXMLString()); 
			sb.append("</eDConsultant>");		
		}
		if (this.getRegisteringMOS() != null)
		{
			sb.append("<registeringMOS>");
			sb.append(this.getRegisteringMOS().toXMLString(domMap)); 	
			sb.append("</registeringMOS>");		
		}
		if (this.getUpdatingMOS() != null)
		{
			sb.append("<updatingMOS>");
			sb.append(this.getUpdatingMOS().toXMLString(domMap)); 	
			sb.append("</updatingMOS>");		
		}
		if (this.getObsPatientAssessment() != null)
		{
			sb.append("<obsPatientAssessment>");
			sb.append(this.getObsPatientAssessment().toXMLString(domMap)); 	
			sb.append("</obsPatientAssessment>");		
		}
		if (this.getPreferedLanguage() != null)
		{
			sb.append("<preferedLanguage>");
			sb.append(this.getPreferedLanguage().toXMLString()); 
			sb.append("</preferedLanguage>");		
		}
		if (this.getIntrepreterRequired() != null)
		{
			sb.append("<intrepreterRequired>");
			sb.append(this.getIntrepreterRequired().toXMLString()); 
			sb.append("</intrepreterRequired>");		
		}
		if (this.getDeptType() != null)
		{
			sb.append("<deptType>");
			sb.append(this.getDeptType().toXMLString()); 
			sb.append("</deptType>");		
		}
		if (this.isIsCoded() != null)
		{
			sb.append("<isCoded>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCoded().toString()));
			sb.append("</isCoded>");		
		}
		if (this.getMC() != null)
		{
			sb.append("<mC>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMC().toString()));
			sb.append("</mC>");		
		}
		if (this.getCOTA() != null)
		{
			sb.append("<cOTA>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCOTA().toString()));
			sb.append("</cOTA>");		
		}
		if (this.getPCG1() != null)
		{
			sb.append("<pCG1>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPCG1().toString()));
			sb.append("</pCG1>");		
		}
		if (this.getPCG2() != null)
		{
			sb.append("<pCG2>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPCG2().toString()));
			sb.append("</pCG2>");		
		}
		if (this.getHAR() != null)
		{
			sb.append("<hAR>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHAR().toString()));
			sb.append("</hAR>");		
		}
		if (this.getPurchaser() != null)
		{
			sb.append("<purchaser>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPurchaser().toString()));
			sb.append("</purchaser>");		
		}
		if (this.getSequenceNumber() != null)
		{
			sb.append("<sequenceNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSequenceNumber().toString()));
			sb.append("</sequenceNumber>");		
		}
		if (this.getInsurance() != null)
		{
			sb.append("<insurance>");
			sb.append(this.getInsurance().toXMLString(domMap)); 	
			sb.append("</insurance>");		
		}
		if (this.getPatientMedicalInsurance() != null)
		{
			sb.append("<patientMedicalInsurance>");
			sb.append(this.getPatientMedicalInsurance().toXMLString(domMap)); 	
			sb.append("</patientMedicalInsurance>");		
		}
		return sb.toString();
	}
		
	public static java.util.List fromListXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.List list, java.util.HashMap domMap) throws Exception
	{
		if (list == null)
		 list = new java.util.ArrayList();
		fillListFromXMLString(list, el, factory, domMap);
		return list;
	}
	
	public static java.util.Set fromSetXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.Set set, java.util.HashMap domMap) throws Exception
	{
		if (set == null)
			 set = new java.util.HashSet();
		fillSetFromXMLString(set, el, factory, domMap);
		return set;
	}
	
	private static void fillSetFromXMLString(java.util.Set set, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			EmergencyAttendance domainObject = getEmergencyAttendancefromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!set.contains(domainObject)) 
				set.add(domainObject);
			newSet.add(domainObject);			
		}
		
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = set.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			set.remove(iter.next());
		}		
	}
	
	private static void fillListFromXMLString(java.util.List list, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			EmergencyAttendance domainObject = getEmergencyAttendancefromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}

			int domIdx = list.indexOf(domainObject);
			if (domIdx == -1)
			{
				list.add(i, domainObject);
			}
			else if (i != domIdx && i < list.size())
			{
				Object tmp = list.get(i);
				list.set(i, list.get(domIdx));
				list.set(domIdx, tmp);
			}
		}		
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=list.size();
		while (i1 > size)
		{
			list.remove(i1-1);
			i1=list.size();
		}
	}
		
	public static EmergencyAttendance getEmergencyAttendancefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getEmergencyAttendancefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static EmergencyAttendance getEmergencyAttendancefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!EmergencyAttendance.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!EmergencyAttendance.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the EmergencyAttendance class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (EmergencyAttendance)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(EmergencyAttendance.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		EmergencyAttendance ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (EmergencyAttendance)factory.getImportedDomainObject(EmergencyAttendance.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new EmergencyAttendance();
		}
		String keyClassName = "EmergencyAttendance";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (EmergencyAttendance)impObj.getDomainObject();
		}
		else
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(extId);
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(ret);
			domMap.put(keyClassName + "_" + externalSource + "_" + extId, impObj);
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, EmergencyAttendance obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("arrivalDateTime");
		if(fldEl != null)
		{	
    		obj.setArrivalDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("registrationDateTime");
		if(fldEl != null)
		{	
    		obj.setRegistrationDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dischargeDateTime");
		if(fldEl != null)
		{	
    		obj.setDischargeDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("attendanceType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAttendanceType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("emergencyDeptType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEmergencyDeptType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("modeOfArrival");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setModeOfArrival(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("accompaniedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAccompaniedBy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("registrationLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRegistrationLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("outcome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOutcome(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("destination");
		if(fldEl != null)
		{	
    		obj.setDestination(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("emergencyEpisode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEmergencyEpisode(ims.core.admin.domain.objects.EmergencyEpisode.getEmergencyEpisodefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("triageDateTime");
		if(fldEl != null)
		{	
    		obj.setTriageDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("ageAtAttendance");
		if(fldEl != null)
		{	
    		obj.setAgeAtAttendance(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isUnknownPatient");
		if(fldEl != null)
		{	
    		obj.setIsUnknownPatient(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isPrimaryCare");
		if(fldEl != null)
		{	
    		obj.setIsPrimaryCare(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisode(ims.core.admin.domain.objects.EmergencyEpisode.getEmergencyEpisodefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("ambulanceArrivalDateTime");
		if(fldEl != null)
		{	
    		obj.setAmbulanceArrivalDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("ambulanceJobNo");
		if(fldEl != null)
		{	
    		obj.setAmbulanceJobNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("conclusionDateTime");
		if(fldEl != null)
		{	
    		obj.setConclusionDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("bedTypeRequested");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBedTypeRequested(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientAttendanceStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientAttendanceStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("attendanceDataVerified");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAttendanceDataVerified(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("attendanceSourceOfData");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAttendanceSourceOfData(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("attendanceReasonNotVerified");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAttendanceReasonNotVerified(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("urgencyLevel");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUrgencyLevel(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isQuickRegistration");
		if(fldEl != null)
		{	
    		obj.setIsQuickRegistration(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isExpectedArrival");
		if(fldEl != null)
		{	
    		obj.setIsExpectedArrival(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isMajorIncident");
		if(fldEl != null)
		{	
    		obj.setIsMajorIncident(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("expectedArrivalDateTime");
		if(fldEl != null)
		{	
    		obj.setExpectedArrivalDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dischargingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDischargingHCP(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("visitType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setVisitType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("eDConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEDConsultant(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("registeringMOS");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRegisteringMOS(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("updatingMOS");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setUpdatingMOS(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("obsPatientAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setObsPatientAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("preferedLanguage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreferedLanguage(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("intrepreterRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIntrepreterRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("deptType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDeptType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isCoded");
		if(fldEl != null)
		{	
    		obj.setIsCoded(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("mC");
		if(fldEl != null)
		{	
    		obj.setMC(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cOTA");
		if(fldEl != null)
		{	
    		obj.setCOTA(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pCG1");
		if(fldEl != null)
		{	
    		obj.setPCG1(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pCG2");
		if(fldEl != null)
		{	
    		obj.setPCG2(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hAR");
		if(fldEl != null)
		{	
    		obj.setHAR(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("purchaser");
		if(fldEl != null)
		{	
    		obj.setPurchaser(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sequenceNumber");
		if(fldEl != null)
		{	
    		obj.setSequenceNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("insurance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInsurance(ims.core.patient.domain.objects.Insurance.getInsurancefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientMedicalInsurance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientMedicalInsurance(ims.core.clinical.domain.objects.PatientMedicalInsurance.getPatientMedicalInsurancefromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ArrivalDateTime = "arrivalDateTime";
		public static final String RegistrationDateTime = "registrationDateTime";
		public static final String DischargeDateTime = "dischargeDateTime";
		public static final String AttendanceType = "attendanceType";
		public static final String EmergencyDeptType = "emergencyDeptType";
		public static final String ModeOfArrival = "modeOfArrival";
		public static final String AccompaniedBy = "accompaniedBy";
		public static final String RegistrationLocation = "registrationLocation";
		public static final String Outcome = "outcome";
		public static final String Destination = "destination";
		public static final String CareContext = "careContext";
		public static final String EmergencyEpisode = "emergencyEpisode";
		public static final String TriageDateTime = "triageDateTime";
		public static final String AgeAtAttendance = "ageAtAttendance";
		public static final String Comments = "comments";
		public static final String IsUnknownPatient = "isUnknownPatient";
		public static final String IsPrimaryCare = "isPrimaryCare";
		public static final String Patient = "patient";
		public static final String Episode = "episode";
		public static final String AmbulanceArrivalDateTime = "ambulanceArrivalDateTime";
		public static final String AmbulanceJobNo = "ambulanceJobNo";
		public static final String ConclusionDateTime = "conclusionDateTime";
		public static final String BedTypeRequested = "bedTypeRequested";
		public static final String PatientAttendanceStatus = "patientAttendanceStatus";
		public static final String AttendanceDataVerified = "attendanceDataVerified";
		public static final String AttendanceSourceOfData = "attendanceSourceOfData";
		public static final String AttendanceReasonNotVerified = "attendanceReasonNotVerified";
		public static final String UrgencyLevel = "urgencyLevel";
		public static final String IsQuickRegistration = "isQuickRegistration";
		public static final String IsExpectedArrival = "isExpectedArrival";
		public static final String IsMajorIncident = "isMajorIncident";
		public static final String ExpectedArrivalDateTime = "expectedArrivalDateTime";
		public static final String DischargingHCP = "dischargingHCP";
		public static final String VisitType = "visitType";
		public static final String EDConsultant = "eDConsultant";
		public static final String RegisteringMOS = "registeringMOS";
		public static final String UpdatingMOS = "updatingMOS";
		public static final String ObsPatientAssessment = "obsPatientAssessment";
		public static final String PreferedLanguage = "preferedLanguage";
		public static final String IntrepreterRequired = "intrepreterRequired";
		public static final String DeptType = "deptType";
		public static final String IsCoded = "isCoded";
		public static final String MC = "mC";
		public static final String COTA = "cOTA";
		public static final String PCG1 = "pCG1";
		public static final String PCG2 = "pCG2";
		public static final String HAR = "hAR";
		public static final String Purchaser = "purchaser";
		public static final String SequenceNumber = "sequenceNumber";
		public static final String Insurance = "insurance";
		public static final String PatientMedicalInsurance = "patientMedicalInsurance";
	}
}

