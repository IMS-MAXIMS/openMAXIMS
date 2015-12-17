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
package ims.core.cds.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class CDSOutpatient extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1104100000;
	private static final long serialVersionUID = 1104100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return false;
	}
	@Override
	public boolean canNeverBeAudited()
	{
		return true;
	}

	/** CDS Applicable DateTime */
	private java.util.Date cDSApplicableDate;
	/** CDS Sender Organisation Code */
	private String cDSSenderOrgCode;
	/** Unique Booking Reference Number */
	private String uBRN;
	/** Patient Pathway Identifier */
	private String pathwayIdentifier;
	/** Organisation Code (Patient Pathway Identifier Issuer) */
	private String pathwayOrgCode;
	/** Referral To Treatment Status */
	private String referralToTreatmentStatus;
	/** Referral to Treatment Period Start Date */
	private java.util.Date rTTStartDate;
	/** Referral to Treatment Period End Date */
	private java.util.Date rTTEndDate;
	/** Lead Care Activity Indicator */
	private String leadCareActInd;
	/** Local Patient Identifier */
	private String localPatientIdentifier;
	/** Organisation Code for Patient Identifier */
	private String patIdOrgCode;
	/** NHS Number */
	private String nHSNumber;
	/** NHS Number Status Indicator - 01, 02 or 07 */
	private String nHSNumberStatusInd;
	/** Patient Name */
	private String patientName;
	/** Patient Usual Address */
	private String patientAddress;
	/** Postcode of usual address */
	private String postCode;
	/** Organisation Code (PCT of residence) */
	private String pCTOrgCode;
	/** Person Birth Date */
	private java.util.Date dateOfBirth;
	/** Person Gender Current */
	private String personGender;
	/** Carer Support Indicator */
	private String carerSupportInd;
	/** Ethnic Category */
	private String ethnicCategory;
	/** Consultant Code */
	private String consultantCode;
	/** Main Specialty Code */
	private String specialtyCode;
	/** Treatment Function Code */
	private String treatmentFuncCode;
	/** ICD Diagnosis Group
	  * Collection of ims.core.cds.domain.objects.CDSDiagnosisDetails.
	  */
	private java.util.List iCDDiagGroup;
	/** READ Diagnosis Group */
	private ims.core.cds.domain.objects.CDSDiagnosisDetails readDiagGroup;
	/** Attendance Identifier */
	private String attendanceIdentifier;
	/** Administrative Category */
	private String adminCategory;
	/** Attended or Did not Attend */
	private String attendedOrDNA;
	/** First Attendance */
	private String firstAttendance;
	/** Medical Staff Type Seeing Patient */
	private String medStaffType;
	/** Operation Status (per attendance) */
	private String operationStatus;
	/** Outcome of Attendance */
	private String attendOutcome;
	/** Appointment Date */
	private java.util.Date apptDate;
	/** Age at CDS Activity Date */
	private Integer age;
	/** Earliest Reasonable Offer Date */
	private java.util.Date earliestOfferDate;
	/** Commissioning Serial Number */
	private String serialNumber;
	/** NHS Service Agreement Line Number */
	private String nHSServiceAgreeNum;
	/** Provider Reference Number */
	private String providerRefNum;
	/** Commissioner Reference Number */
	private String commissionerRefNum;
	/** Organisation Code of Provider */
	private String orgCodeProvider;
	/** Organisation Code of Commissioner */
	private String orgCodeCommissioner;
	/** OPCS Procedure Group
	  * Collection of ims.core.cds.domain.objects.CDSProcedureDetails.
	  */
	private java.util.List oPCSProcedure;
	/** READ Procedure Group */
	private ims.core.cds.domain.objects.CDSProcedureDetails rEADProcedure;
	/** Location Class */
	private String locationClass;
	/** Site Code of Treatment */
	private String siteCodeTreatment;
	/** General Medical Practitioner (Specified) */
	private String gPCode;
	/** General Medical Practice Code (Patient Registration) */
	private String practiceCode;
	/** Priority Type */
	private String priorityType;
	/** Service Type Requested */
	private String serviceTypeReq;
	/** Source of Referral for Outpatients */
	private String referralSource;
	/** Referral Request Received Date */
	private java.util.Date referralReceivedDate;
	/** Referrer Code */
	private String referrerCode;
	/** Referring Organisation Code */
	private String orgCodeReferrer;
	/** Last DNA or Patient Cancelled Date */
	private java.util.Date lastDNACancelDate;
	/** Healthcare Resource Group Code */
	private String resourceGrpCode;
	/** Healthcare Resource GRoup Code - Version Number */
	private String resourceGPVersion;
	/** ProcedureSchemaInUse */
	private String procedureScheme;
	/** HRG Dominant Grouping Variable - Procedure */
	private String hrgDominantGrouping;
	/** Link to ApptId that created this record */
	private Integer appointmentId;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CDSOutpatient (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CDSOutpatient ()
    {
    	super();
    }
    public CDSOutpatient (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.cds.domain.objects.CDSOutpatient.class;
	}


	public java.util.Date getCDSApplicableDate() {
		return cDSApplicableDate;
	}
	public void setCDSApplicableDate(java.util.Date cDSApplicableDate) {
		this.cDSApplicableDate = cDSApplicableDate;
	}

	public String getCDSSenderOrgCode() {
		return cDSSenderOrgCode;
	}
	public void setCDSSenderOrgCode(String cDSSenderOrgCode) {
		if ( null != cDSSenderOrgCode && cDSSenderOrgCode.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cDSSenderOrgCode. Tried to set value: "+
				cDSSenderOrgCode);
		}
		this.cDSSenderOrgCode = cDSSenderOrgCode;
	}

	public String getUBRN() {
		return uBRN;
	}
	public void setUBRN(String uBRN) {
		if ( null != uBRN && uBRN.length() > 12 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uBRN. Tried to set value: "+
				uBRN);
		}
		this.uBRN = uBRN;
	}

	public String getPathwayIdentifier() {
		return pathwayIdentifier;
	}
	public void setPathwayIdentifier(String pathwayIdentifier) {
		if ( null != pathwayIdentifier && pathwayIdentifier.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pathwayIdentifier. Tried to set value: "+
				pathwayIdentifier);
		}
		this.pathwayIdentifier = pathwayIdentifier;
	}

	public String getPathwayOrgCode() {
		return pathwayOrgCode;
	}
	public void setPathwayOrgCode(String pathwayOrgCode) {
		if ( null != pathwayOrgCode && pathwayOrgCode.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pathwayOrgCode. Tried to set value: "+
				pathwayOrgCode);
		}
		this.pathwayOrgCode = pathwayOrgCode;
	}

	public String getReferralToTreatmentStatus() {
		return referralToTreatmentStatus;
	}
	public void setReferralToTreatmentStatus(String referralToTreatmentStatus) {
		if ( null != referralToTreatmentStatus && referralToTreatmentStatus.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referralToTreatmentStatus. Tried to set value: "+
				referralToTreatmentStatus);
		}
		this.referralToTreatmentStatus = referralToTreatmentStatus;
	}

	public java.util.Date getRTTStartDate() {
		return rTTStartDate;
	}
	public void setRTTStartDate(java.util.Date rTTStartDate) {
		this.rTTStartDate = rTTStartDate;
	}

	public java.util.Date getRTTEndDate() {
		return rTTEndDate;
	}
	public void setRTTEndDate(java.util.Date rTTEndDate) {
		this.rTTEndDate = rTTEndDate;
	}

	public String getLeadCareActInd() {
		return leadCareActInd;
	}
	public void setLeadCareActInd(String leadCareActInd) {
		if ( null != leadCareActInd && leadCareActInd.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for leadCareActInd. Tried to set value: "+
				leadCareActInd);
		}
		this.leadCareActInd = leadCareActInd;
	}

	public String getLocalPatientIdentifier() {
		return localPatientIdentifier;
	}
	public void setLocalPatientIdentifier(String localPatientIdentifier) {
		if ( null != localPatientIdentifier && localPatientIdentifier.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for localPatientIdentifier. Tried to set value: "+
				localPatientIdentifier);
		}
		this.localPatientIdentifier = localPatientIdentifier;
	}

	public String getPatIdOrgCode() {
		return patIdOrgCode;
	}
	public void setPatIdOrgCode(String patIdOrgCode) {
		if ( null != patIdOrgCode && patIdOrgCode.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for patIdOrgCode. Tried to set value: "+
				patIdOrgCode);
		}
		this.patIdOrgCode = patIdOrgCode;
	}

	public String getNHSNumber() {
		return nHSNumber;
	}
	public void setNHSNumber(String nHSNumber) {
		if ( null != nHSNumber && nHSNumber.length() > 17 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nHSNumber. Tried to set value: "+
				nHSNumber);
		}
		this.nHSNumber = nHSNumber;
	}

	public String getNHSNumberStatusInd() {
		return nHSNumberStatusInd;
	}
	public void setNHSNumberStatusInd(String nHSNumberStatusInd) {
		if ( null != nHSNumberStatusInd && nHSNumberStatusInd.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nHSNumberStatusInd. Tried to set value: "+
				nHSNumberStatusInd);
		}
		this.nHSNumberStatusInd = nHSNumberStatusInd;
	}

	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		if ( null != patientName && patientName.length() > 70 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for patientName. Tried to set value: "+
				patientName);
		}
		this.patientName = patientName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		if ( null != patientAddress && patientAddress.length() > 175 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for patientAddress. Tried to set value: "+
				patientAddress);
		}
		this.patientAddress = patientAddress;
	}

	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		if ( null != postCode && postCode.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for postCode. Tried to set value: "+
				postCode);
		}
		this.postCode = postCode;
	}

	public String getPCTOrgCode() {
		return pCTOrgCode;
	}
	public void setPCTOrgCode(String pCTOrgCode) {
		if ( null != pCTOrgCode && pCTOrgCode.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pCTOrgCode. Tried to set value: "+
				pCTOrgCode);
		}
		this.pCTOrgCode = pCTOrgCode;
	}

	public java.util.Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(java.util.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPersonGender() {
		return personGender;
	}
	public void setPersonGender(String personGender) {
		if ( null != personGender && personGender.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for personGender. Tried to set value: "+
				personGender);
		}
		this.personGender = personGender;
	}

	public String getCarerSupportInd() {
		return carerSupportInd;
	}
	public void setCarerSupportInd(String carerSupportInd) {
		if ( null != carerSupportInd && carerSupportInd.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for carerSupportInd. Tried to set value: "+
				carerSupportInd);
		}
		this.carerSupportInd = carerSupportInd;
	}

	public String getEthnicCategory() {
		return ethnicCategory;
	}
	public void setEthnicCategory(String ethnicCategory) {
		if ( null != ethnicCategory && ethnicCategory.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for ethnicCategory. Tried to set value: "+
				ethnicCategory);
		}
		this.ethnicCategory = ethnicCategory;
	}

	public String getConsultantCode() {
		return consultantCode;
	}
	public void setConsultantCode(String consultantCode) {
		if ( null != consultantCode && consultantCode.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for consultantCode. Tried to set value: "+
				consultantCode);
		}
		this.consultantCode = consultantCode;
	}

	public String getSpecialtyCode() {
		return specialtyCode;
	}
	public void setSpecialtyCode(String specialtyCode) {
		if ( null != specialtyCode && specialtyCode.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for specialtyCode. Tried to set value: "+
				specialtyCode);
		}
		this.specialtyCode = specialtyCode;
	}

	public String getTreatmentFuncCode() {
		return treatmentFuncCode;
	}
	public void setTreatmentFuncCode(String treatmentFuncCode) {
		if ( null != treatmentFuncCode && treatmentFuncCode.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for treatmentFuncCode. Tried to set value: "+
				treatmentFuncCode);
		}
		this.treatmentFuncCode = treatmentFuncCode;
	}

	public java.util.List getICDDiagGroup() {
		if ( null == iCDDiagGroup ) {
			iCDDiagGroup = new java.util.ArrayList();
		}
		return iCDDiagGroup;
	}
	public void setICDDiagGroup(java.util.List paramValue) {
		this.iCDDiagGroup = paramValue;
	}

	public ims.core.cds.domain.objects.CDSDiagnosisDetails getReadDiagGroup() {
		return readDiagGroup;
	}
	public void setReadDiagGroup(ims.core.cds.domain.objects.CDSDiagnosisDetails readDiagGroup) {
		this.readDiagGroup = readDiagGroup;
	}

	public String getAttendanceIdentifier() {
		return attendanceIdentifier;
	}
	public void setAttendanceIdentifier(String attendanceIdentifier) {
		if ( null != attendanceIdentifier && attendanceIdentifier.length() > 12 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for attendanceIdentifier. Tried to set value: "+
				attendanceIdentifier);
		}
		this.attendanceIdentifier = attendanceIdentifier;
	}

	public String getAdminCategory() {
		return adminCategory;
	}
	public void setAdminCategory(String adminCategory) {
		if ( null != adminCategory && adminCategory.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for adminCategory. Tried to set value: "+
				adminCategory);
		}
		this.adminCategory = adminCategory;
	}

	public String getAttendedOrDNA() {
		return attendedOrDNA;
	}
	public void setAttendedOrDNA(String attendedOrDNA) {
		if ( null != attendedOrDNA && attendedOrDNA.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for attendedOrDNA. Tried to set value: "+
				attendedOrDNA);
		}
		this.attendedOrDNA = attendedOrDNA;
	}

	public String getFirstAttendance() {
		return firstAttendance;
	}
	public void setFirstAttendance(String firstAttendance) {
		if ( null != firstAttendance && firstAttendance.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for firstAttendance. Tried to set value: "+
				firstAttendance);
		}
		this.firstAttendance = firstAttendance;
	}

	public String getMedStaffType() {
		return medStaffType;
	}
	public void setMedStaffType(String medStaffType) {
		if ( null != medStaffType && medStaffType.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for medStaffType. Tried to set value: "+
				medStaffType);
		}
		this.medStaffType = medStaffType;
	}

	public String getOperationStatus() {
		return operationStatus;
	}
	public void setOperationStatus(String operationStatus) {
		if ( null != operationStatus && operationStatus.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for operationStatus. Tried to set value: "+
				operationStatus);
		}
		this.operationStatus = operationStatus;
	}

	public String getAttendOutcome() {
		return attendOutcome;
	}
	public void setAttendOutcome(String attendOutcome) {
		if ( null != attendOutcome && attendOutcome.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for attendOutcome. Tried to set value: "+
				attendOutcome);
		}
		this.attendOutcome = attendOutcome;
	}

	public java.util.Date getApptDate() {
		return apptDate;
	}
	public void setApptDate(java.util.Date apptDate) {
		this.apptDate = apptDate;
	}

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public java.util.Date getEarliestOfferDate() {
		return earliestOfferDate;
	}
	public void setEarliestOfferDate(java.util.Date earliestOfferDate) {
		this.earliestOfferDate = earliestOfferDate;
	}

	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		if ( null != serialNumber && serialNumber.length() > 6 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for serialNumber. Tried to set value: "+
				serialNumber);
		}
		this.serialNumber = serialNumber;
	}

	public String getNHSServiceAgreeNum() {
		return nHSServiceAgreeNum;
	}
	public void setNHSServiceAgreeNum(String nHSServiceAgreeNum) {
		if ( null != nHSServiceAgreeNum && nHSServiceAgreeNum.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nHSServiceAgreeNum. Tried to set value: "+
				nHSServiceAgreeNum);
		}
		this.nHSServiceAgreeNum = nHSServiceAgreeNum;
	}

	public String getProviderRefNum() {
		return providerRefNum;
	}
	public void setProviderRefNum(String providerRefNum) {
		if ( null != providerRefNum && providerRefNum.length() > 17 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for providerRefNum. Tried to set value: "+
				providerRefNum);
		}
		this.providerRefNum = providerRefNum;
	}

	public String getCommissionerRefNum() {
		return commissionerRefNum;
	}
	public void setCommissionerRefNum(String commissionerRefNum) {
		if ( null != commissionerRefNum && commissionerRefNum.length() > 17 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for commissionerRefNum. Tried to set value: "+
				commissionerRefNum);
		}
		this.commissionerRefNum = commissionerRefNum;
	}

	public String getOrgCodeProvider() {
		return orgCodeProvider;
	}
	public void setOrgCodeProvider(String orgCodeProvider) {
		if ( null != orgCodeProvider && orgCodeProvider.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for orgCodeProvider. Tried to set value: "+
				orgCodeProvider);
		}
		this.orgCodeProvider = orgCodeProvider;
	}

	public String getOrgCodeCommissioner() {
		return orgCodeCommissioner;
	}
	public void setOrgCodeCommissioner(String orgCodeCommissioner) {
		if ( null != orgCodeCommissioner && orgCodeCommissioner.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for orgCodeCommissioner. Tried to set value: "+
				orgCodeCommissioner);
		}
		this.orgCodeCommissioner = orgCodeCommissioner;
	}

	public java.util.List getOPCSProcedure() {
		if ( null == oPCSProcedure ) {
			oPCSProcedure = new java.util.ArrayList();
		}
		return oPCSProcedure;
	}
	public void setOPCSProcedure(java.util.List paramValue) {
		this.oPCSProcedure = paramValue;
	}

	public ims.core.cds.domain.objects.CDSProcedureDetails getREADProcedure() {
		return rEADProcedure;
	}
	public void setREADProcedure(ims.core.cds.domain.objects.CDSProcedureDetails rEADProcedure) {
		this.rEADProcedure = rEADProcedure;
	}

	public String getLocationClass() {
		return locationClass;
	}
	public void setLocationClass(String locationClass) {
		if ( null != locationClass && locationClass.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for locationClass. Tried to set value: "+
				locationClass);
		}
		this.locationClass = locationClass;
	}

	public String getSiteCodeTreatment() {
		return siteCodeTreatment;
	}
	public void setSiteCodeTreatment(String siteCodeTreatment) {
		if ( null != siteCodeTreatment && siteCodeTreatment.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for siteCodeTreatment. Tried to set value: "+
				siteCodeTreatment);
		}
		this.siteCodeTreatment = siteCodeTreatment;
	}

	public String getGPCode() {
		return gPCode;
	}
	public void setGPCode(String gPCode) {
		if ( null != gPCode && gPCode.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for gPCode. Tried to set value: "+
				gPCode);
		}
		this.gPCode = gPCode;
	}

	public String getPracticeCode() {
		return practiceCode;
	}
	public void setPracticeCode(String practiceCode) {
		if ( null != practiceCode && practiceCode.length() > 6 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for practiceCode. Tried to set value: "+
				practiceCode);
		}
		this.practiceCode = practiceCode;
	}

	public String getPriorityType() {
		return priorityType;
	}
	public void setPriorityType(String priorityType) {
		if ( null != priorityType && priorityType.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for priorityType. Tried to set value: "+
				priorityType);
		}
		this.priorityType = priorityType;
	}

	public String getServiceTypeReq() {
		return serviceTypeReq;
	}
	public void setServiceTypeReq(String serviceTypeReq) {
		if ( null != serviceTypeReq && serviceTypeReq.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for serviceTypeReq. Tried to set value: "+
				serviceTypeReq);
		}
		this.serviceTypeReq = serviceTypeReq;
	}

	public String getReferralSource() {
		return referralSource;
	}
	public void setReferralSource(String referralSource) {
		if ( null != referralSource && referralSource.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referralSource. Tried to set value: "+
				referralSource);
		}
		this.referralSource = referralSource;
	}

	public java.util.Date getReferralReceivedDate() {
		return referralReceivedDate;
	}
	public void setReferralReceivedDate(java.util.Date referralReceivedDate) {
		this.referralReceivedDate = referralReceivedDate;
	}

	public String getReferrerCode() {
		return referrerCode;
	}
	public void setReferrerCode(String referrerCode) {
		if ( null != referrerCode && referrerCode.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referrerCode. Tried to set value: "+
				referrerCode);
		}
		this.referrerCode = referrerCode;
	}

	public String getOrgCodeReferrer() {
		return orgCodeReferrer;
	}
	public void setOrgCodeReferrer(String orgCodeReferrer) {
		if ( null != orgCodeReferrer && orgCodeReferrer.length() > 6 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for orgCodeReferrer. Tried to set value: "+
				orgCodeReferrer);
		}
		this.orgCodeReferrer = orgCodeReferrer;
	}

	public java.util.Date getLastDNACancelDate() {
		return lastDNACancelDate;
	}
	public void setLastDNACancelDate(java.util.Date lastDNACancelDate) {
		this.lastDNACancelDate = lastDNACancelDate;
	}

	public String getResourceGrpCode() {
		return resourceGrpCode;
	}
	public void setResourceGrpCode(String resourceGrpCode) {
		if ( null != resourceGrpCode && resourceGrpCode.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for resourceGrpCode. Tried to set value: "+
				resourceGrpCode);
		}
		this.resourceGrpCode = resourceGrpCode;
	}

	public String getResourceGPVersion() {
		return resourceGPVersion;
	}
	public void setResourceGPVersion(String resourceGPVersion) {
		if ( null != resourceGPVersion && resourceGPVersion.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for resourceGPVersion. Tried to set value: "+
				resourceGPVersion);
		}
		this.resourceGPVersion = resourceGPVersion;
	}

	public String getProcedureScheme() {
		return procedureScheme;
	}
	public void setProcedureScheme(String procedureScheme) {
		if ( null != procedureScheme && procedureScheme.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for procedureScheme. Tried to set value: "+
				procedureScheme);
		}
		this.procedureScheme = procedureScheme;
	}

	public String getHrgDominantGrouping() {
		return hrgDominantGrouping;
	}
	public void setHrgDominantGrouping(String hrgDominantGrouping) {
		if ( null != hrgDominantGrouping && hrgDominantGrouping.length() > 4 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for hrgDominantGrouping. Tried to set value: "+
				hrgDominantGrouping);
		}
		this.hrgDominantGrouping = hrgDominantGrouping;
	}

	public Integer getAppointmentId() {
		return appointmentId;
	}
	public static CDSOutpatient getCDSOutpatientFromAppointmentId(ims.domain.ILightweightDomainFactory factory, Integer val)
	{
		String hql = "from CDSOutpatient c where c.appointmentId = :appointmentId";		
		java.util.List l = factory.find(hql, new String[]{"appointmentId"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. CDSOutpatient.appointmentId = " + val + " returned " + l.size() + " records. " );
		return (CDSOutpatient)l.get(0);
	}
	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
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
		
		auditStr.append("\r\n*cDSApplicableDate* :");
		auditStr.append(cDSApplicableDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*cDSSenderOrgCode* :");
		auditStr.append(cDSSenderOrgCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*uBRN* :");
		auditStr.append(uBRN);
	    auditStr.append("; ");
		auditStr.append("\r\n*pathwayIdentifier* :");
		auditStr.append(pathwayIdentifier);
	    auditStr.append("; ");
		auditStr.append("\r\n*pathwayOrgCode* :");
		auditStr.append(pathwayOrgCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralToTreatmentStatus* :");
		auditStr.append(referralToTreatmentStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*rTTStartDate* :");
		auditStr.append(rTTStartDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*rTTEndDate* :");
		auditStr.append(rTTEndDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*leadCareActInd* :");
		auditStr.append(leadCareActInd);
	    auditStr.append("; ");
		auditStr.append("\r\n*localPatientIdentifier* :");
		auditStr.append(localPatientIdentifier);
	    auditStr.append("; ");
		auditStr.append("\r\n*patIdOrgCode* :");
		auditStr.append(patIdOrgCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*nHSNumber* :");
		auditStr.append(nHSNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*nHSNumberStatusInd* :");
		auditStr.append(nHSNumberStatusInd);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientName* :");
		auditStr.append(patientName);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientAddress* :");
		auditStr.append(patientAddress);
	    auditStr.append("; ");
		auditStr.append("\r\n*postCode* :");
		auditStr.append(postCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*pCTOrgCode* :");
		auditStr.append(pCTOrgCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfBirth* :");
		auditStr.append(dateOfBirth);
	    auditStr.append("; ");
		auditStr.append("\r\n*personGender* :");
		auditStr.append(personGender);
	    auditStr.append("; ");
		auditStr.append("\r\n*carerSupportInd* :");
		auditStr.append(carerSupportInd);
	    auditStr.append("; ");
		auditStr.append("\r\n*ethnicCategory* :");
		auditStr.append(ethnicCategory);
	    auditStr.append("; ");
		auditStr.append("\r\n*consultantCode* :");
		auditStr.append(consultantCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialtyCode* :");
		auditStr.append(specialtyCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentFuncCode* :");
		auditStr.append(treatmentFuncCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*iCDDiagGroup* :");
		if (iCDDiagGroup != null)
		{
		int i25=0;
		for (i25=0; i25<iCDDiagGroup.size(); i25++)
		{
			if (i25 > 0)
				auditStr.append(",");
			ims.core.cds.domain.objects.CDSDiagnosisDetails obj = (ims.core.cds.domain.objects.CDSDiagnosisDetails)iCDDiagGroup.get(i25);
		    if (obj != null)
			{
				if (i25 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i25 > 0)
			auditStr.append("] " + i25);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*readDiagGroup* :");
		if (readDiagGroup != null)
		{
			auditStr.append(toShortClassName(readDiagGroup));
				
		    auditStr.append(readDiagGroup.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*attendanceIdentifier* :");
		auditStr.append(attendanceIdentifier);
	    auditStr.append("; ");
		auditStr.append("\r\n*adminCategory* :");
		auditStr.append(adminCategory);
	    auditStr.append("; ");
		auditStr.append("\r\n*attendedOrDNA* :");
		auditStr.append(attendedOrDNA);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstAttendance* :");
		auditStr.append(firstAttendance);
	    auditStr.append("; ");
		auditStr.append("\r\n*medStaffType* :");
		auditStr.append(medStaffType);
	    auditStr.append("; ");
		auditStr.append("\r\n*operationStatus* :");
		auditStr.append(operationStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*attendOutcome* :");
		auditStr.append(attendOutcome);
	    auditStr.append("; ");
		auditStr.append("\r\n*apptDate* :");
		auditStr.append(apptDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*age* :");
		auditStr.append(age);
	    auditStr.append("; ");
		auditStr.append("\r\n*earliestOfferDate* :");
		auditStr.append(earliestOfferDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*serialNumber* :");
		auditStr.append(serialNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*nHSServiceAgreeNum* :");
		auditStr.append(nHSServiceAgreeNum);
	    auditStr.append("; ");
		auditStr.append("\r\n*providerRefNum* :");
		auditStr.append(providerRefNum);
	    auditStr.append("; ");
		auditStr.append("\r\n*commissionerRefNum* :");
		auditStr.append(commissionerRefNum);
	    auditStr.append("; ");
		auditStr.append("\r\n*orgCodeProvider* :");
		auditStr.append(orgCodeProvider);
	    auditStr.append("; ");
		auditStr.append("\r\n*orgCodeCommissioner* :");
		auditStr.append(orgCodeCommissioner);
	    auditStr.append("; ");
		auditStr.append("\r\n*oPCSProcedure* :");
		if (oPCSProcedure != null)
		{
		int i43=0;
		for (i43=0; i43<oPCSProcedure.size(); i43++)
		{
			if (i43 > 0)
				auditStr.append(",");
			ims.core.cds.domain.objects.CDSProcedureDetails obj = (ims.core.cds.domain.objects.CDSProcedureDetails)oPCSProcedure.get(i43);
		    if (obj != null)
			{
				if (i43 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i43 > 0)
			auditStr.append("] " + i43);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*rEADProcedure* :");
		if (rEADProcedure != null)
		{
			auditStr.append(toShortClassName(rEADProcedure));
				
		    auditStr.append(rEADProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*locationClass* :");
		auditStr.append(locationClass);
	    auditStr.append("; ");
		auditStr.append("\r\n*siteCodeTreatment* :");
		auditStr.append(siteCodeTreatment);
	    auditStr.append("; ");
		auditStr.append("\r\n*gPCode* :");
		auditStr.append(gPCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*practiceCode* :");
		auditStr.append(practiceCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*priorityType* :");
		auditStr.append(priorityType);
	    auditStr.append("; ");
		auditStr.append("\r\n*serviceTypeReq* :");
		auditStr.append(serviceTypeReq);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralSource* :");
		auditStr.append(referralSource);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralReceivedDate* :");
		auditStr.append(referralReceivedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*referrerCode* :");
		auditStr.append(referrerCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*orgCodeReferrer* :");
		auditStr.append(orgCodeReferrer);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastDNACancelDate* :");
		auditStr.append(lastDNACancelDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*resourceGrpCode* :");
		auditStr.append(resourceGrpCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*resourceGPVersion* :");
		auditStr.append(resourceGPVersion);
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureScheme* :");
		auditStr.append(procedureScheme);
	    auditStr.append("; ");
		auditStr.append("\r\n*hrgDominantGrouping* :");
		auditStr.append(hrgDominantGrouping);
	    auditStr.append("; ");
		auditStr.append("\r\n*appointmentId* :");
		auditStr.append(appointmentId);
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
		
		String keyClassName = "CDSOutpatient";
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
		if (this.getCDSApplicableDate() != null)
		{
			sb.append("<cDSApplicableDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCDSApplicableDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</cDSApplicableDate>");		
		}
		if (this.getCDSSenderOrgCode() != null)
		{
			sb.append("<cDSSenderOrgCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCDSSenderOrgCode().toString()));
			sb.append("</cDSSenderOrgCode>");		
		}
		if (this.getUBRN() != null)
		{
			sb.append("<uBRN>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUBRN().toString()));
			sb.append("</uBRN>");		
		}
		if (this.getPathwayIdentifier() != null)
		{
			sb.append("<pathwayIdentifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPathwayIdentifier().toString()));
			sb.append("</pathwayIdentifier>");		
		}
		if (this.getPathwayOrgCode() != null)
		{
			sb.append("<pathwayOrgCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPathwayOrgCode().toString()));
			sb.append("</pathwayOrgCode>");		
		}
		if (this.getReferralToTreatmentStatus() != null)
		{
			sb.append("<referralToTreatmentStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferralToTreatmentStatus().toString()));
			sb.append("</referralToTreatmentStatus>");		
		}
		if (this.getRTTStartDate() != null)
		{
			sb.append("<rTTStartDate>");
			sb.append(new ims.framework.utils.DateTime(this.getRTTStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</rTTStartDate>");		
		}
		if (this.getRTTEndDate() != null)
		{
			sb.append("<rTTEndDate>");
			sb.append(new ims.framework.utils.DateTime(this.getRTTEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</rTTEndDate>");		
		}
		if (this.getLeadCareActInd() != null)
		{
			sb.append("<leadCareActInd>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLeadCareActInd().toString()));
			sb.append("</leadCareActInd>");		
		}
		if (this.getLocalPatientIdentifier() != null)
		{
			sb.append("<localPatientIdentifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLocalPatientIdentifier().toString()));
			sb.append("</localPatientIdentifier>");		
		}
		if (this.getPatIdOrgCode() != null)
		{
			sb.append("<patIdOrgCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatIdOrgCode().toString()));
			sb.append("</patIdOrgCode>");		
		}
		if (this.getNHSNumber() != null)
		{
			sb.append("<nHSNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNHSNumber().toString()));
			sb.append("</nHSNumber>");		
		}
		if (this.getNHSNumberStatusInd() != null)
		{
			sb.append("<nHSNumberStatusInd>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNHSNumberStatusInd().toString()));
			sb.append("</nHSNumberStatusInd>");		
		}
		if (this.getPatientName() != null)
		{
			sb.append("<patientName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatientName().toString()));
			sb.append("</patientName>");		
		}
		if (this.getPatientAddress() != null)
		{
			sb.append("<patientAddress>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatientAddress().toString()));
			sb.append("</patientAddress>");		
		}
		if (this.getPostCode() != null)
		{
			sb.append("<postCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPostCode().toString()));
			sb.append("</postCode>");		
		}
		if (this.getPCTOrgCode() != null)
		{
			sb.append("<pCTOrgCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPCTOrgCode().toString()));
			sb.append("</pCTOrgCode>");		
		}
		if (this.getDateOfBirth() != null)
		{
			sb.append("<dateOfBirth>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOfBirth()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOfBirth>");		
		}
		if (this.getPersonGender() != null)
		{
			sb.append("<personGender>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPersonGender().toString()));
			sb.append("</personGender>");		
		}
		if (this.getCarerSupportInd() != null)
		{
			sb.append("<carerSupportInd>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCarerSupportInd().toString()));
			sb.append("</carerSupportInd>");		
		}
		if (this.getEthnicCategory() != null)
		{
			sb.append("<ethnicCategory>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEthnicCategory().toString()));
			sb.append("</ethnicCategory>");		
		}
		if (this.getConsultantCode() != null)
		{
			sb.append("<consultantCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getConsultantCode().toString()));
			sb.append("</consultantCode>");		
		}
		if (this.getSpecialtyCode() != null)
		{
			sb.append("<specialtyCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSpecialtyCode().toString()));
			sb.append("</specialtyCode>");		
		}
		if (this.getTreatmentFuncCode() != null)
		{
			sb.append("<treatmentFuncCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTreatmentFuncCode().toString()));
			sb.append("</treatmentFuncCode>");		
		}
		if (this.getICDDiagGroup() != null)
		{
			if (this.getICDDiagGroup().size() > 0 )
			{
			sb.append("<iCDDiagGroup>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getICDDiagGroup(), domMap));
			sb.append("</iCDDiagGroup>");		
			}
		}
		if (this.getReadDiagGroup() != null)
		{
			sb.append("<readDiagGroup>");
			sb.append(this.getReadDiagGroup().toXMLString(domMap)); 	
			sb.append("</readDiagGroup>");		
		}
		if (this.getAttendanceIdentifier() != null)
		{
			sb.append("<attendanceIdentifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAttendanceIdentifier().toString()));
			sb.append("</attendanceIdentifier>");		
		}
		if (this.getAdminCategory() != null)
		{
			sb.append("<adminCategory>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdminCategory().toString()));
			sb.append("</adminCategory>");		
		}
		if (this.getAttendedOrDNA() != null)
		{
			sb.append("<attendedOrDNA>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAttendedOrDNA().toString()));
			sb.append("</attendedOrDNA>");		
		}
		if (this.getFirstAttendance() != null)
		{
			sb.append("<firstAttendance>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFirstAttendance().toString()));
			sb.append("</firstAttendance>");		
		}
		if (this.getMedStaffType() != null)
		{
			sb.append("<medStaffType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMedStaffType().toString()));
			sb.append("</medStaffType>");		
		}
		if (this.getOperationStatus() != null)
		{
			sb.append("<operationStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOperationStatus().toString()));
			sb.append("</operationStatus>");		
		}
		if (this.getAttendOutcome() != null)
		{
			sb.append("<attendOutcome>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAttendOutcome().toString()));
			sb.append("</attendOutcome>");		
		}
		if (this.getApptDate() != null)
		{
			sb.append("<apptDate>");
			sb.append(new ims.framework.utils.DateTime(this.getApptDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</apptDate>");		
		}
		if (this.getAge() != null)
		{
			sb.append("<age>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAge().toString()));
			sb.append("</age>");		
		}
		if (this.getEarliestOfferDate() != null)
		{
			sb.append("<earliestOfferDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEarliestOfferDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</earliestOfferDate>");		
		}
		if (this.getSerialNumber() != null)
		{
			sb.append("<serialNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSerialNumber().toString()));
			sb.append("</serialNumber>");		
		}
		if (this.getNHSServiceAgreeNum() != null)
		{
			sb.append("<nHSServiceAgreeNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNHSServiceAgreeNum().toString()));
			sb.append("</nHSServiceAgreeNum>");		
		}
		if (this.getProviderRefNum() != null)
		{
			sb.append("<providerRefNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProviderRefNum().toString()));
			sb.append("</providerRefNum>");		
		}
		if (this.getCommissionerRefNum() != null)
		{
			sb.append("<commissionerRefNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCommissionerRefNum().toString()));
			sb.append("</commissionerRefNum>");		
		}
		if (this.getOrgCodeProvider() != null)
		{
			sb.append("<orgCodeProvider>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOrgCodeProvider().toString()));
			sb.append("</orgCodeProvider>");		
		}
		if (this.getOrgCodeCommissioner() != null)
		{
			sb.append("<orgCodeCommissioner>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOrgCodeCommissioner().toString()));
			sb.append("</orgCodeCommissioner>");		
		}
		if (this.getOPCSProcedure() != null)
		{
			if (this.getOPCSProcedure().size() > 0 )
			{
			sb.append("<oPCSProcedure>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOPCSProcedure(), domMap));
			sb.append("</oPCSProcedure>");		
			}
		}
		if (this.getREADProcedure() != null)
		{
			sb.append("<rEADProcedure>");
			sb.append(this.getREADProcedure().toXMLString(domMap)); 	
			sb.append("</rEADProcedure>");		
		}
		if (this.getLocationClass() != null)
		{
			sb.append("<locationClass>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLocationClass().toString()));
			sb.append("</locationClass>");		
		}
		if (this.getSiteCodeTreatment() != null)
		{
			sb.append("<siteCodeTreatment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSiteCodeTreatment().toString()));
			sb.append("</siteCodeTreatment>");		
		}
		if (this.getGPCode() != null)
		{
			sb.append("<gPCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGPCode().toString()));
			sb.append("</gPCode>");		
		}
		if (this.getPracticeCode() != null)
		{
			sb.append("<practiceCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPracticeCode().toString()));
			sb.append("</practiceCode>");		
		}
		if (this.getPriorityType() != null)
		{
			sb.append("<priorityType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPriorityType().toString()));
			sb.append("</priorityType>");		
		}
		if (this.getServiceTypeReq() != null)
		{
			sb.append("<serviceTypeReq>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getServiceTypeReq().toString()));
			sb.append("</serviceTypeReq>");		
		}
		if (this.getReferralSource() != null)
		{
			sb.append("<referralSource>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferralSource().toString()));
			sb.append("</referralSource>");		
		}
		if (this.getReferralReceivedDate() != null)
		{
			sb.append("<referralReceivedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getReferralReceivedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</referralReceivedDate>");		
		}
		if (this.getReferrerCode() != null)
		{
			sb.append("<referrerCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferrerCode().toString()));
			sb.append("</referrerCode>");		
		}
		if (this.getOrgCodeReferrer() != null)
		{
			sb.append("<orgCodeReferrer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOrgCodeReferrer().toString()));
			sb.append("</orgCodeReferrer>");		
		}
		if (this.getLastDNACancelDate() != null)
		{
			sb.append("<lastDNACancelDate>");
			sb.append(new ims.framework.utils.DateTime(this.getLastDNACancelDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastDNACancelDate>");		
		}
		if (this.getResourceGrpCode() != null)
		{
			sb.append("<resourceGrpCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getResourceGrpCode().toString()));
			sb.append("</resourceGrpCode>");		
		}
		if (this.getResourceGPVersion() != null)
		{
			sb.append("<resourceGPVersion>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getResourceGPVersion().toString()));
			sb.append("</resourceGPVersion>");		
		}
		if (this.getProcedureScheme() != null)
		{
			sb.append("<procedureScheme>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcedureScheme().toString()));
			sb.append("</procedureScheme>");		
		}
		if (this.getHrgDominantGrouping() != null)
		{
			sb.append("<hrgDominantGrouping>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHrgDominantGrouping().toString()));
			sb.append("</hrgDominantGrouping>");		
		}
		if (this.getAppointmentId() != null)
		{
			sb.append("<appointmentId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAppointmentId().toString()));
			sb.append("</appointmentId>");		
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
			CDSOutpatient domainObject = getCDSOutpatientfromXML(itemEl, factory, domMap);

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
			CDSOutpatient domainObject = getCDSOutpatientfromXML(itemEl, factory, domMap);

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
		
	public static CDSOutpatient getCDSOutpatientfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCDSOutpatientfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CDSOutpatient getCDSOutpatientfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CDSOutpatient.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CDSOutpatient.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CDSOutpatient class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CDSOutpatient)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CDSOutpatient.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CDSOutpatient ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CDSOutpatient)factory.getImportedDomainObject(CDSOutpatient.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CDSOutpatient();
		}
		String keyClassName = "CDSOutpatient";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CDSOutpatient)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CDSOutpatient obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("cDSApplicableDate");
		if(fldEl != null)
		{	
    		obj.setCDSApplicableDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("cDSSenderOrgCode");
		if(fldEl != null)
		{	
    		obj.setCDSSenderOrgCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("uBRN");
		if(fldEl != null)
		{	
    		obj.setUBRN(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pathwayIdentifier");
		if(fldEl != null)
		{	
    		obj.setPathwayIdentifier(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pathwayOrgCode");
		if(fldEl != null)
		{	
    		obj.setPathwayOrgCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referralToTreatmentStatus");
		if(fldEl != null)
		{	
    		obj.setReferralToTreatmentStatus(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rTTStartDate");
		if(fldEl != null)
		{	
    		obj.setRTTStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("rTTEndDate");
		if(fldEl != null)
		{	
    		obj.setRTTEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("leadCareActInd");
		if(fldEl != null)
		{	
    		obj.setLeadCareActInd(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("localPatientIdentifier");
		if(fldEl != null)
		{	
    		obj.setLocalPatientIdentifier(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patIdOrgCode");
		if(fldEl != null)
		{	
    		obj.setPatIdOrgCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nHSNumber");
		if(fldEl != null)
		{	
    		obj.setNHSNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nHSNumberStatusInd");
		if(fldEl != null)
		{	
    		obj.setNHSNumberStatusInd(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientName");
		if(fldEl != null)
		{	
    		obj.setPatientName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientAddress");
		if(fldEl != null)
		{	
    		obj.setPatientAddress(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("postCode");
		if(fldEl != null)
		{	
    		obj.setPostCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pCTOrgCode");
		if(fldEl != null)
		{	
    		obj.setPCTOrgCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateOfBirth");
		if(fldEl != null)
		{	
    		obj.setDateOfBirth(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("personGender");
		if(fldEl != null)
		{	
    		obj.setPersonGender(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("carerSupportInd");
		if(fldEl != null)
		{	
    		obj.setCarerSupportInd(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ethnicCategory");
		if(fldEl != null)
		{	
    		obj.setEthnicCategory(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("consultantCode");
		if(fldEl != null)
		{	
    		obj.setConsultantCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specialtyCode");
		if(fldEl != null)
		{	
    		obj.setSpecialtyCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("treatmentFuncCode");
		if(fldEl != null)
		{	
    		obj.setTreatmentFuncCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("iCDDiagGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setICDDiagGroup(ims.core.cds.domain.objects.CDSDiagnosisDetails.fromListXMLString(fldEl, factory, obj.getICDDiagGroup(), domMap));
		}
		fldEl = el.element("readDiagGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReadDiagGroup(ims.core.cds.domain.objects.CDSDiagnosisDetails.getCDSDiagnosisDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("attendanceIdentifier");
		if(fldEl != null)
		{	
    		obj.setAttendanceIdentifier(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("adminCategory");
		if(fldEl != null)
		{	
    		obj.setAdminCategory(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("attendedOrDNA");
		if(fldEl != null)
		{	
    		obj.setAttendedOrDNA(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("firstAttendance");
		if(fldEl != null)
		{	
    		obj.setFirstAttendance(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("medStaffType");
		if(fldEl != null)
		{	
    		obj.setMedStaffType(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("operationStatus");
		if(fldEl != null)
		{	
    		obj.setOperationStatus(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("attendOutcome");
		if(fldEl != null)
		{	
    		obj.setAttendOutcome(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("apptDate");
		if(fldEl != null)
		{	
    		obj.setApptDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("age");
		if(fldEl != null)
		{	
    		obj.setAge(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("earliestOfferDate");
		if(fldEl != null)
		{	
    		obj.setEarliestOfferDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("serialNumber");
		if(fldEl != null)
		{	
    		obj.setSerialNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nHSServiceAgreeNum");
		if(fldEl != null)
		{	
    		obj.setNHSServiceAgreeNum(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("providerRefNum");
		if(fldEl != null)
		{	
    		obj.setProviderRefNum(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("commissionerRefNum");
		if(fldEl != null)
		{	
    		obj.setCommissionerRefNum(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("orgCodeProvider");
		if(fldEl != null)
		{	
    		obj.setOrgCodeProvider(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("orgCodeCommissioner");
		if(fldEl != null)
		{	
    		obj.setOrgCodeCommissioner(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("oPCSProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOPCSProcedure(ims.core.cds.domain.objects.CDSProcedureDetails.fromListXMLString(fldEl, factory, obj.getOPCSProcedure(), domMap));
		}
		fldEl = el.element("rEADProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setREADProcedure(ims.core.cds.domain.objects.CDSProcedureDetails.getCDSProcedureDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("locationClass");
		if(fldEl != null)
		{	
    		obj.setLocationClass(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("siteCodeTreatment");
		if(fldEl != null)
		{	
    		obj.setSiteCodeTreatment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("gPCode");
		if(fldEl != null)
		{	
    		obj.setGPCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("practiceCode");
		if(fldEl != null)
		{	
    		obj.setPracticeCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("priorityType");
		if(fldEl != null)
		{	
    		obj.setPriorityType(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("serviceTypeReq");
		if(fldEl != null)
		{	
    		obj.setServiceTypeReq(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referralSource");
		if(fldEl != null)
		{	
    		obj.setReferralSource(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referralReceivedDate");
		if(fldEl != null)
		{	
    		obj.setReferralReceivedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("referrerCode");
		if(fldEl != null)
		{	
    		obj.setReferrerCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("orgCodeReferrer");
		if(fldEl != null)
		{	
    		obj.setOrgCodeReferrer(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lastDNACancelDate");
		if(fldEl != null)
		{	
    		obj.setLastDNACancelDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("resourceGrpCode");
		if(fldEl != null)
		{	
    		obj.setResourceGrpCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("resourceGPVersion");
		if(fldEl != null)
		{	
    		obj.setResourceGPVersion(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procedureScheme");
		if(fldEl != null)
		{	
    		obj.setProcedureScheme(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hrgDominantGrouping");
		if(fldEl != null)
		{	
    		obj.setHrgDominantGrouping(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("appointmentId");
		if(fldEl != null)
		{	
    		obj.setAppointmentId(new Integer(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "iCDDiagGroup"
		, "oPCSProcedure"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CDSApplicableDate = "cDSApplicableDate";
		public static final String CDSSenderOrgCode = "cDSSenderOrgCode";
		public static final String UBRN = "uBRN";
		public static final String PathwayIdentifier = "pathwayIdentifier";
		public static final String PathwayOrgCode = "pathwayOrgCode";
		public static final String ReferralToTreatmentStatus = "referralToTreatmentStatus";
		public static final String RTTStartDate = "rTTStartDate";
		public static final String RTTEndDate = "rTTEndDate";
		public static final String LeadCareActInd = "leadCareActInd";
		public static final String LocalPatientIdentifier = "localPatientIdentifier";
		public static final String PatIdOrgCode = "patIdOrgCode";
		public static final String NHSNumber = "nHSNumber";
		public static final String NHSNumberStatusInd = "nHSNumberStatusInd";
		public static final String PatientName = "patientName";
		public static final String PatientAddress = "patientAddress";
		public static final String PostCode = "postCode";
		public static final String PCTOrgCode = "pCTOrgCode";
		public static final String DateOfBirth = "dateOfBirth";
		public static final String PersonGender = "personGender";
		public static final String CarerSupportInd = "carerSupportInd";
		public static final String EthnicCategory = "ethnicCategory";
		public static final String ConsultantCode = "consultantCode";
		public static final String SpecialtyCode = "specialtyCode";
		public static final String TreatmentFuncCode = "treatmentFuncCode";
		public static final String ICDDiagGroup = "iCDDiagGroup";
		public static final String ReadDiagGroup = "readDiagGroup";
		public static final String AttendanceIdentifier = "attendanceIdentifier";
		public static final String AdminCategory = "adminCategory";
		public static final String AttendedOrDNA = "attendedOrDNA";
		public static final String FirstAttendance = "firstAttendance";
		public static final String MedStaffType = "medStaffType";
		public static final String OperationStatus = "operationStatus";
		public static final String AttendOutcome = "attendOutcome";
		public static final String ApptDate = "apptDate";
		public static final String Age = "age";
		public static final String EarliestOfferDate = "earliestOfferDate";
		public static final String SerialNumber = "serialNumber";
		public static final String NHSServiceAgreeNum = "nHSServiceAgreeNum";
		public static final String ProviderRefNum = "providerRefNum";
		public static final String CommissionerRefNum = "commissionerRefNum";
		public static final String OrgCodeProvider = "orgCodeProvider";
		public static final String OrgCodeCommissioner = "orgCodeCommissioner";
		public static final String OPCSProcedure = "oPCSProcedure";
		public static final String READProcedure = "rEADProcedure";
		public static final String LocationClass = "locationClass";
		public static final String SiteCodeTreatment = "siteCodeTreatment";
		public static final String GPCode = "gPCode";
		public static final String PracticeCode = "practiceCode";
		public static final String PriorityType = "priorityType";
		public static final String ServiceTypeReq = "serviceTypeReq";
		public static final String ReferralSource = "referralSource";
		public static final String ReferralReceivedDate = "referralReceivedDate";
		public static final String ReferrerCode = "referrerCode";
		public static final String OrgCodeReferrer = "orgCodeReferrer";
		public static final String LastDNACancelDate = "lastDNACancelDate";
		public static final String ResourceGrpCode = "resourceGrpCode";
		public static final String ResourceGPVersion = "resourceGPVersion";
		public static final String ProcedureScheme = "procedureScheme";
		public static final String HrgDominantGrouping = "hrgDominantGrouping";
		public static final String AppointmentId = "appointmentId";
	}
}

