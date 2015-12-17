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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.core.cds.domain.objects;

/**
 * 
 * @author Michael Noonan
 * Generated.
 */


public class CDSElectiveList extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1104100007;
	private static final long serialVersionUID = 1104100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
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
	/** Referral to Treatment  Clock Impact */
	private String waitTimeMeasureType;
	/** Referral to Treatment Period Start Date */
	private java.util.Date rTTStartDate;
	/** Referral to Treatment Period End Date */
	private java.util.Date rTTEndDate;
	/** Local Patient Identifier */
	private String localPatientIdentifier;
	/** CCG code of patient address */
	private String cCGOrgCode;
	/** Withheld Identity Reason */
	private String withHeldIdentityReason;
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
	/** Commission Serial Number */
	private String commSerialNumber;
	/** NHS Service Agreement Line Number */
	private String nHSServAgreeLineNum;
	/** Provider Reference Number */
	private String providerRefNum;
	/** Commissioner Reference Number */
	private String commissionerReferenceNum;
	/** Organisation Code of Provider */
	private String orgCodeProvider;
	/** Organisation Code of Commissioner */
	private String orgCodeCommissioner;
	/** NHS Service Agreement Change Date */
	private java.util.Date nHSServAgreeChangeDate;
	/** Elective Admission List Entry Number (Unique) */
	private String electiveListID;
	/** Administrative Category Code */
	private String adminCategory;
	/** Count of Days Suspended */
	private Integer countSuspendedDays;
	/** Elective Admission List Status */
	private String eLEStatus;
	/** Elective Admission Type code */
	private String eLEType;
	/** Intended Management */
	private String intendedManagement;
	/** Intended Procedure Status Code */
	private String intendedProcedure;
	/** Priority Type code */
	private String priorityTypeCode;
	/** Patient Classification */
	private String patientClassification;
	/** Decided To Admit Date */
	private java.util.Date decidedToAdmitDate;
	/** Age At CDS Activity */
	private Integer ageAtCDSActivity;
	/** Admission Method */
	private String admissionMethod;
	/** Overseas Status Classification at CDS  activity date */
	private String overseasVisitorStatus;
	/** Guarenteed Admission Date */
	private java.util.Date guarenteedAdmissionDate;
	/** Last DNA or cancelled date */
	private java.util.Date lastDNACancelledDate;
	/** Waiting List Entry last reviewed date */
	private java.util.Date lastReviewedDate;
	/** Consultant Code */
	private String consultantCode;
	/** Care professional main Specialty Code */
	private String specialtyCode;
	/** Treatment Function Code */
	private String treatmentFuncCode;
	/** Local Sub Specialty Code */
	private String localSubSpecialtyCode;
	/** ProcedureSchemaInUse */
	private String procedureScheme;
	/** Primary Procedure (OPCS) */
	private String procedure;
	/** Procedure Date */
	private java.util.Date procedureDate;
	/** Profession Registration Issuer Code */
	private String profRegistrationCode;
	/** Profession Registration Entry Identifier (Main Operating Care Professional) */
	private String profRegistrationID;
	/** General Medical Practioner (Specified) */
	private String patientGPCode;
	/** General Medical Practice Code (Patient Registration) */
	private String patientGPPractice;
	/** Referrer Code */
	private String referrerCode;
	/** Referring Organisation Code */
	private String referrerPractice;
	/** Admission Offer Outcome Code */
	private String outcomeCode;
	/** Offered For Admission Date */
	private java.util.Date dateTCIOffered;
	/** Earliest Reasonable Offer Date */
	private java.util.Date eRODate;
	/** Original Decided To Admit Date */
	private java.util.Date origDecisionToAdmitDate;
	/** Start Date (Hospital Provider Spell) */
	private java.util.Date startDate;
	/** Elective Admission List Removal Reason Code */
	private String removalReason;
	/** Elective Admission List Removal Date */
	private java.util.Date removalDate;
	/** Start Date Episode */
	private java.util.Date episodeStartDate;
	/** OPCS Procedure Scheme In Use
	  * Collection of ims.core.cds.domain.objects.CDSProcedureDetails.
	  */
	private java.util.List oPCSProcedureGroup;
	/** READ Procedure Scheme In Use */
	private ims.core.cds.domain.objects.CDSProcedureDetails rEADProcedureGroup;
	/** Location Group */
	private ims.core.cds.domain.objects.CDSWaitingListLocGroup locationGroup;
	/** Used by HRG Grouper Report */
	private Integer careContextId;
	/** The HRG Configured Code associated with opcs4 code from CDS */
	private String hRGCode;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CDSElectiveList (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CDSElectiveList ()
    {
    	super();
    }
    public CDSElectiveList (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.cds.domain.objects.CDSElectiveList.class;
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

	public String getWaitTimeMeasureType() {
		return waitTimeMeasureType;
	}
	public void setWaitTimeMeasureType(String waitTimeMeasureType) {
		if ( null != waitTimeMeasureType && waitTimeMeasureType.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for waitTimeMeasureType. Tried to set value: "+
				waitTimeMeasureType);
		}
		this.waitTimeMeasureType = waitTimeMeasureType;
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

	public String getCCGOrgCode() {
		return cCGOrgCode;
	}
	public void setCCGOrgCode(String cCGOrgCode) {
		if ( null != cCGOrgCode && cCGOrgCode.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cCGOrgCode. Tried to set value: "+
				cCGOrgCode);
		}
		this.cCGOrgCode = cCGOrgCode;
	}

	public String getWithHeldIdentityReason() {
		return withHeldIdentityReason;
	}
	public void setWithHeldIdentityReason(String withHeldIdentityReason) {
		if ( null != withHeldIdentityReason && withHeldIdentityReason.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for withHeldIdentityReason. Tried to set value: "+
				withHeldIdentityReason);
		}
		this.withHeldIdentityReason = withHeldIdentityReason;
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

	public String getCommSerialNumber() {
		return commSerialNumber;
	}
	public void setCommSerialNumber(String commSerialNumber) {
		if ( null != commSerialNumber && commSerialNumber.length() > 6 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for commSerialNumber. Tried to set value: "+
				commSerialNumber);
		}
		this.commSerialNumber = commSerialNumber;
	}

	public String getNHSServAgreeLineNum() {
		return nHSServAgreeLineNum;
	}
	public void setNHSServAgreeLineNum(String nHSServAgreeLineNum) {
		if ( null != nHSServAgreeLineNum && nHSServAgreeLineNum.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nHSServAgreeLineNum. Tried to set value: "+
				nHSServAgreeLineNum);
		}
		this.nHSServAgreeLineNum = nHSServAgreeLineNum;
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

	public String getCommissionerReferenceNum() {
		return commissionerReferenceNum;
	}
	public void setCommissionerReferenceNum(String commissionerReferenceNum) {
		if ( null != commissionerReferenceNum && commissionerReferenceNum.length() > 17 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for commissionerReferenceNum. Tried to set value: "+
				commissionerReferenceNum);
		}
		this.commissionerReferenceNum = commissionerReferenceNum;
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

	public java.util.Date getNHSServAgreeChangeDate() {
		return nHSServAgreeChangeDate;
	}
	public void setNHSServAgreeChangeDate(java.util.Date nHSServAgreeChangeDate) {
		this.nHSServAgreeChangeDate = nHSServAgreeChangeDate;
	}

	public String getElectiveListID() {
		return electiveListID;
	}
	public static CDSElectiveList getCDSElectiveListFromElectiveListID(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from CDSElectiveList c where c.electiveListID = :electiveListID";		
		java.util.List l = factory.find(hql, new String[]{"electiveListID"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. CDSElectiveList.electiveListID = " + val + " returned " + l.size() + " records. " );
		return (CDSElectiveList)l.get(0);
	}
	public void setElectiveListID(String electiveListID) {
		if ( null != electiveListID && electiveListID.length() > 12 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for electiveListID. Tried to set value: "+
				electiveListID);
		}
		this.electiveListID = electiveListID;
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

	public Integer getCountSuspendedDays() {
		return countSuspendedDays;
	}
	public void setCountSuspendedDays(Integer countSuspendedDays) {
		this.countSuspendedDays = countSuspendedDays;
	}

	public String getELEStatus() {
		return eLEStatus;
	}
	public void setELEStatus(String eLEStatus) {
		if ( null != eLEStatus && eLEStatus.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for eLEStatus. Tried to set value: "+
				eLEStatus);
		}
		this.eLEStatus = eLEStatus;
	}

	public String getELEType() {
		return eLEType;
	}
	public void setELEType(String eLEType) {
		if ( null != eLEType && eLEType.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for eLEType. Tried to set value: "+
				eLEType);
		}
		this.eLEType = eLEType;
	}

	public String getIntendedManagement() {
		return intendedManagement;
	}
	public void setIntendedManagement(String intendedManagement) {
		if ( null != intendedManagement && intendedManagement.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for intendedManagement. Tried to set value: "+
				intendedManagement);
		}
		this.intendedManagement = intendedManagement;
	}

	public String getIntendedProcedure() {
		return intendedProcedure;
	}
	public void setIntendedProcedure(String intendedProcedure) {
		if ( null != intendedProcedure && intendedProcedure.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for intendedProcedure. Tried to set value: "+
				intendedProcedure);
		}
		this.intendedProcedure = intendedProcedure;
	}

	public String getPriorityTypeCode() {
		return priorityTypeCode;
	}
	public void setPriorityTypeCode(String priorityTypeCode) {
		if ( null != priorityTypeCode && priorityTypeCode.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for priorityTypeCode. Tried to set value: "+
				priorityTypeCode);
		}
		this.priorityTypeCode = priorityTypeCode;
	}

	public String getPatientClassification() {
		return patientClassification;
	}
	public void setPatientClassification(String patientClassification) {
		if ( null != patientClassification && patientClassification.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for patientClassification. Tried to set value: "+
				patientClassification);
		}
		this.patientClassification = patientClassification;
	}

	public java.util.Date getDecidedToAdmitDate() {
		return decidedToAdmitDate;
	}
	public void setDecidedToAdmitDate(java.util.Date decidedToAdmitDate) {
		this.decidedToAdmitDate = decidedToAdmitDate;
	}

	public Integer getAgeAtCDSActivity() {
		return ageAtCDSActivity;
	}
	public void setAgeAtCDSActivity(Integer ageAtCDSActivity) {
		this.ageAtCDSActivity = ageAtCDSActivity;
	}

	public String getAdmissionMethod() {
		return admissionMethod;
	}
	public void setAdmissionMethod(String admissionMethod) {
		if ( null != admissionMethod && admissionMethod.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for admissionMethod. Tried to set value: "+
				admissionMethod);
		}
		this.admissionMethod = admissionMethod;
	}

	public String getOverseasVisitorStatus() {
		return overseasVisitorStatus;
	}
	public void setOverseasVisitorStatus(String overseasVisitorStatus) {
		if ( null != overseasVisitorStatus && overseasVisitorStatus.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for overseasVisitorStatus. Tried to set value: "+
				overseasVisitorStatus);
		}
		this.overseasVisitorStatus = overseasVisitorStatus;
	}

	public java.util.Date getGuarenteedAdmissionDate() {
		return guarenteedAdmissionDate;
	}
	public void setGuarenteedAdmissionDate(java.util.Date guarenteedAdmissionDate) {
		this.guarenteedAdmissionDate = guarenteedAdmissionDate;
	}

	public java.util.Date getLastDNACancelledDate() {
		return lastDNACancelledDate;
	}
	public void setLastDNACancelledDate(java.util.Date lastDNACancelledDate) {
		this.lastDNACancelledDate = lastDNACancelledDate;
	}

	public java.util.Date getLastReviewedDate() {
		return lastReviewedDate;
	}
	public void setLastReviewedDate(java.util.Date lastReviewedDate) {
		this.lastReviewedDate = lastReviewedDate;
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

	public String getLocalSubSpecialtyCode() {
		return localSubSpecialtyCode;
	}
	public void setLocalSubSpecialtyCode(String localSubSpecialtyCode) {
		if ( null != localSubSpecialtyCode && localSubSpecialtyCode.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for localSubSpecialtyCode. Tried to set value: "+
				localSubSpecialtyCode);
		}
		this.localSubSpecialtyCode = localSubSpecialtyCode;
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

	public String getProcedure() {
		return procedure;
	}
	public void setProcedure(String procedure) {
		if ( null != procedure && procedure.length() > 4 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for procedure. Tried to set value: "+
				procedure);
		}
		this.procedure = procedure;
	}

	public java.util.Date getProcedureDate() {
		return procedureDate;
	}
	public void setProcedureDate(java.util.Date procedureDate) {
		this.procedureDate = procedureDate;
	}

	public String getProfRegistrationCode() {
		return profRegistrationCode;
	}
	public void setProfRegistrationCode(String profRegistrationCode) {
		if ( null != profRegistrationCode && profRegistrationCode.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for profRegistrationCode. Tried to set value: "+
				profRegistrationCode);
		}
		this.profRegistrationCode = profRegistrationCode;
	}

	public String getProfRegistrationID() {
		return profRegistrationID;
	}
	public void setProfRegistrationID(String profRegistrationID) {
		if ( null != profRegistrationID && profRegistrationID.length() > 12 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for profRegistrationID. Tried to set value: "+
				profRegistrationID);
		}
		this.profRegistrationID = profRegistrationID;
	}

	public String getPatientGPCode() {
		return patientGPCode;
	}
	public void setPatientGPCode(String patientGPCode) {
		if ( null != patientGPCode && patientGPCode.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for patientGPCode. Tried to set value: "+
				patientGPCode);
		}
		this.patientGPCode = patientGPCode;
	}

	public String getPatientGPPractice() {
		return patientGPPractice;
	}
	public void setPatientGPPractice(String patientGPPractice) {
		if ( null != patientGPPractice && patientGPPractice.length() > 6 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for patientGPPractice. Tried to set value: "+
				patientGPPractice);
		}
		this.patientGPPractice = patientGPPractice;
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

	public String getReferrerPractice() {
		return referrerPractice;
	}
	public void setReferrerPractice(String referrerPractice) {
		if ( null != referrerPractice && referrerPractice.length() > 6 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referrerPractice. Tried to set value: "+
				referrerPractice);
		}
		this.referrerPractice = referrerPractice;
	}

	public String getOutcomeCode() {
		return outcomeCode;
	}
	public void setOutcomeCode(String outcomeCode) {
		if ( null != outcomeCode && outcomeCode.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for outcomeCode. Tried to set value: "+
				outcomeCode);
		}
		this.outcomeCode = outcomeCode;
	}

	public java.util.Date getDateTCIOffered() {
		return dateTCIOffered;
	}
	public void setDateTCIOffered(java.util.Date dateTCIOffered) {
		this.dateTCIOffered = dateTCIOffered;
	}

	public java.util.Date getERODate() {
		return eRODate;
	}
	public void setERODate(java.util.Date eRODate) {
		this.eRODate = eRODate;
	}

	public java.util.Date getOrigDecisionToAdmitDate() {
		return origDecisionToAdmitDate;
	}
	public void setOrigDecisionToAdmitDate(java.util.Date origDecisionToAdmitDate) {
		this.origDecisionToAdmitDate = origDecisionToAdmitDate;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public String getRemovalReason() {
		return removalReason;
	}
	public void setRemovalReason(String removalReason) {
		if ( null != removalReason && removalReason.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for removalReason. Tried to set value: "+
				removalReason);
		}
		this.removalReason = removalReason;
	}

	public java.util.Date getRemovalDate() {
		return removalDate;
	}
	public void setRemovalDate(java.util.Date removalDate) {
		this.removalDate = removalDate;
	}

	public java.util.Date getEpisodeStartDate() {
		return episodeStartDate;
	}
	public void setEpisodeStartDate(java.util.Date episodeStartDate) {
		this.episodeStartDate = episodeStartDate;
	}

	public java.util.List getOPCSProcedureGroup() {
		if ( null == oPCSProcedureGroup ) {
			oPCSProcedureGroup = new java.util.ArrayList();
		}
		return oPCSProcedureGroup;
	}
	public void setOPCSProcedureGroup(java.util.List paramValue) {
		this.oPCSProcedureGroup = paramValue;
	}

	public ims.core.cds.domain.objects.CDSProcedureDetails getREADProcedureGroup() {
		return rEADProcedureGroup;
	}
	public void setREADProcedureGroup(ims.core.cds.domain.objects.CDSProcedureDetails rEADProcedureGroup) {
		this.rEADProcedureGroup = rEADProcedureGroup;
	}

	public ims.core.cds.domain.objects.CDSWaitingListLocGroup getLocationGroup() {
		return locationGroup;
	}
	public void setLocationGroup(ims.core.cds.domain.objects.CDSWaitingListLocGroup locationGroup) {
		this.locationGroup = locationGroup;
	}

	public Integer getCareContextId() {
		return careContextId;
	}
	public void setCareContextId(Integer careContextId) {
		this.careContextId = careContextId;
	}

	public String getHRGCode() {
		return hRGCode;
	}
	public void setHRGCode(String hRGCode) {
		if ( null != hRGCode && hRGCode.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for hRGCode. Tried to set value: "+
				hRGCode);
		}
		this.hRGCode = hRGCode;
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
		auditStr.append("\r\n*waitTimeMeasureType* :");
		auditStr.append(waitTimeMeasureType);
	    auditStr.append("; ");
		auditStr.append("\r\n*rTTStartDate* :");
		auditStr.append(rTTStartDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*rTTEndDate* :");
		auditStr.append(rTTEndDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*localPatientIdentifier* :");
		auditStr.append(localPatientIdentifier);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCGOrgCode* :");
		auditStr.append(cCGOrgCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*withHeldIdentityReason* :");
		auditStr.append(withHeldIdentityReason);
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
		auditStr.append("\r\n*commSerialNumber* :");
		auditStr.append(commSerialNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*nHSServAgreeLineNum* :");
		auditStr.append(nHSServAgreeLineNum);
	    auditStr.append("; ");
		auditStr.append("\r\n*providerRefNum* :");
		auditStr.append(providerRefNum);
	    auditStr.append("; ");
		auditStr.append("\r\n*commissionerReferenceNum* :");
		auditStr.append(commissionerReferenceNum);
	    auditStr.append("; ");
		auditStr.append("\r\n*orgCodeProvider* :");
		auditStr.append(orgCodeProvider);
	    auditStr.append("; ");
		auditStr.append("\r\n*orgCodeCommissioner* :");
		auditStr.append(orgCodeCommissioner);
	    auditStr.append("; ");
		auditStr.append("\r\n*nHSServAgreeChangeDate* :");
		auditStr.append(nHSServAgreeChangeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*electiveListID* :");
		auditStr.append(electiveListID);
	    auditStr.append("; ");
		auditStr.append("\r\n*adminCategory* :");
		auditStr.append(adminCategory);
	    auditStr.append("; ");
		auditStr.append("\r\n*countSuspendedDays* :");
		auditStr.append(countSuspendedDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*eLEStatus* :");
		auditStr.append(eLEStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*eLEType* :");
		auditStr.append(eLEType);
	    auditStr.append("; ");
		auditStr.append("\r\n*intendedManagement* :");
		auditStr.append(intendedManagement);
	    auditStr.append("; ");
		auditStr.append("\r\n*intendedProcedure* :");
		auditStr.append(intendedProcedure);
	    auditStr.append("; ");
		auditStr.append("\r\n*priorityTypeCode* :");
		auditStr.append(priorityTypeCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientClassification* :");
		auditStr.append(patientClassification);
	    auditStr.append("; ");
		auditStr.append("\r\n*decidedToAdmitDate* :");
		auditStr.append(decidedToAdmitDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*ageAtCDSActivity* :");
		auditStr.append(ageAtCDSActivity);
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionMethod* :");
		auditStr.append(admissionMethod);
	    auditStr.append("; ");
		auditStr.append("\r\n*overseasVisitorStatus* :");
		auditStr.append(overseasVisitorStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*guarenteedAdmissionDate* :");
		auditStr.append(guarenteedAdmissionDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastDNACancelledDate* :");
		auditStr.append(lastDNACancelledDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastReviewedDate* :");
		auditStr.append(lastReviewedDate);
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
		auditStr.append("\r\n*localSubSpecialtyCode* :");
		auditStr.append(localSubSpecialtyCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureScheme* :");
		auditStr.append(procedureScheme);
	    auditStr.append("; ");
		auditStr.append("\r\n*procedure* :");
		auditStr.append(procedure);
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureDate* :");
		auditStr.append(procedureDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*profRegistrationCode* :");
		auditStr.append(profRegistrationCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*profRegistrationID* :");
		auditStr.append(profRegistrationID);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientGPCode* :");
		auditStr.append(patientGPCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientGPPractice* :");
		auditStr.append(patientGPPractice);
	    auditStr.append("; ");
		auditStr.append("\r\n*referrerCode* :");
		auditStr.append(referrerCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*referrerPractice* :");
		auditStr.append(referrerPractice);
	    auditStr.append("; ");
		auditStr.append("\r\n*outcomeCode* :");
		auditStr.append(outcomeCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTCIOffered* :");
		auditStr.append(dateTCIOffered);
	    auditStr.append("; ");
		auditStr.append("\r\n*eRODate* :");
		auditStr.append(eRODate);
	    auditStr.append("; ");
		auditStr.append("\r\n*origDecisionToAdmitDate* :");
		auditStr.append(origDecisionToAdmitDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*removalReason* :");
		auditStr.append(removalReason);
	    auditStr.append("; ");
		auditStr.append("\r\n*removalDate* :");
		auditStr.append(removalDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeStartDate* :");
		auditStr.append(episodeStartDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*oPCSProcedureGroup* :");
		if (oPCSProcedureGroup != null)
		{
		int i67=0;
		for (i67=0; i67<oPCSProcedureGroup.size(); i67++)
		{
			if (i67 > 0)
				auditStr.append(",");
			ims.core.cds.domain.objects.CDSProcedureDetails obj = (ims.core.cds.domain.objects.CDSProcedureDetails)oPCSProcedureGroup.get(i67);
		    if (obj != null)
			{
				if (i67 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i67 > 0)
			auditStr.append("] " + i67);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*rEADProcedureGroup* :");
		if (rEADProcedureGroup != null)
		{
			auditStr.append(toShortClassName(rEADProcedureGroup));
				
		    auditStr.append(rEADProcedureGroup.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*locationGroup* :");
		if (locationGroup != null)
		{
			auditStr.append(toShortClassName(locationGroup));
				
		    auditStr.append(locationGroup.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContextId* :");
		auditStr.append(careContextId);
	    auditStr.append("; ");
		auditStr.append("\r\n*hRGCode* :");
		auditStr.append(hRGCode);
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
		
		String keyClassName = "CDSElectiveList";
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
		if (this.getWaitTimeMeasureType() != null)
		{
			sb.append("<waitTimeMeasureType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWaitTimeMeasureType().toString()));
			sb.append("</waitTimeMeasureType>");		
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
		if (this.getLocalPatientIdentifier() != null)
		{
			sb.append("<localPatientIdentifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLocalPatientIdentifier().toString()));
			sb.append("</localPatientIdentifier>");		
		}
		if (this.getCCGOrgCode() != null)
		{
			sb.append("<cCGOrgCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCGOrgCode().toString()));
			sb.append("</cCGOrgCode>");		
		}
		if (this.getWithHeldIdentityReason() != null)
		{
			sb.append("<withHeldIdentityReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWithHeldIdentityReason().toString()));
			sb.append("</withHeldIdentityReason>");		
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
		if (this.getCommSerialNumber() != null)
		{
			sb.append("<commSerialNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCommSerialNumber().toString()));
			sb.append("</commSerialNumber>");		
		}
		if (this.getNHSServAgreeLineNum() != null)
		{
			sb.append("<nHSServAgreeLineNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNHSServAgreeLineNum().toString()));
			sb.append("</nHSServAgreeLineNum>");		
		}
		if (this.getProviderRefNum() != null)
		{
			sb.append("<providerRefNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProviderRefNum().toString()));
			sb.append("</providerRefNum>");		
		}
		if (this.getCommissionerReferenceNum() != null)
		{
			sb.append("<commissionerReferenceNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCommissionerReferenceNum().toString()));
			sb.append("</commissionerReferenceNum>");		
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
		if (this.getNHSServAgreeChangeDate() != null)
		{
			sb.append("<nHSServAgreeChangeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getNHSServAgreeChangeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</nHSServAgreeChangeDate>");		
		}
		if (this.getElectiveListID() != null)
		{
			sb.append("<electiveListID>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getElectiveListID().toString()));
			sb.append("</electiveListID>");		
		}
		if (this.getAdminCategory() != null)
		{
			sb.append("<adminCategory>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdminCategory().toString()));
			sb.append("</adminCategory>");		
		}
		if (this.getCountSuspendedDays() != null)
		{
			sb.append("<countSuspendedDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCountSuspendedDays().toString()));
			sb.append("</countSuspendedDays>");		
		}
		if (this.getELEStatus() != null)
		{
			sb.append("<eLEStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getELEStatus().toString()));
			sb.append("</eLEStatus>");		
		}
		if (this.getELEType() != null)
		{
			sb.append("<eLEType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getELEType().toString()));
			sb.append("</eLEType>");		
		}
		if (this.getIntendedManagement() != null)
		{
			sb.append("<intendedManagement>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIntendedManagement().toString()));
			sb.append("</intendedManagement>");		
		}
		if (this.getIntendedProcedure() != null)
		{
			sb.append("<intendedProcedure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIntendedProcedure().toString()));
			sb.append("</intendedProcedure>");		
		}
		if (this.getPriorityTypeCode() != null)
		{
			sb.append("<priorityTypeCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPriorityTypeCode().toString()));
			sb.append("</priorityTypeCode>");		
		}
		if (this.getPatientClassification() != null)
		{
			sb.append("<patientClassification>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatientClassification().toString()));
			sb.append("</patientClassification>");		
		}
		if (this.getDecidedToAdmitDate() != null)
		{
			sb.append("<decidedToAdmitDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDecidedToAdmitDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</decidedToAdmitDate>");		
		}
		if (this.getAgeAtCDSActivity() != null)
		{
			sb.append("<ageAtCDSActivity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAgeAtCDSActivity().toString()));
			sb.append("</ageAtCDSActivity>");		
		}
		if (this.getAdmissionMethod() != null)
		{
			sb.append("<admissionMethod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdmissionMethod().toString()));
			sb.append("</admissionMethod>");		
		}
		if (this.getOverseasVisitorStatus() != null)
		{
			sb.append("<overseasVisitorStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOverseasVisitorStatus().toString()));
			sb.append("</overseasVisitorStatus>");		
		}
		if (this.getGuarenteedAdmissionDate() != null)
		{
			sb.append("<guarenteedAdmissionDate>");
			sb.append(new ims.framework.utils.DateTime(this.getGuarenteedAdmissionDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</guarenteedAdmissionDate>");		
		}
		if (this.getLastDNACancelledDate() != null)
		{
			sb.append("<lastDNACancelledDate>");
			sb.append(new ims.framework.utils.DateTime(this.getLastDNACancelledDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastDNACancelledDate>");		
		}
		if (this.getLastReviewedDate() != null)
		{
			sb.append("<lastReviewedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getLastReviewedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastReviewedDate>");		
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
		if (this.getLocalSubSpecialtyCode() != null)
		{
			sb.append("<localSubSpecialtyCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLocalSubSpecialtyCode().toString()));
			sb.append("</localSubSpecialtyCode>");		
		}
		if (this.getProcedureScheme() != null)
		{
			sb.append("<procedureScheme>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcedureScheme().toString()));
			sb.append("</procedureScheme>");		
		}
		if (this.getProcedure() != null)
		{
			sb.append("<procedure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcedure().toString()));
			sb.append("</procedure>");		
		}
		if (this.getProcedureDate() != null)
		{
			sb.append("<procedureDate>");
			sb.append(new ims.framework.utils.DateTime(this.getProcedureDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</procedureDate>");		
		}
		if (this.getProfRegistrationCode() != null)
		{
			sb.append("<profRegistrationCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProfRegistrationCode().toString()));
			sb.append("</profRegistrationCode>");		
		}
		if (this.getProfRegistrationID() != null)
		{
			sb.append("<profRegistrationID>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProfRegistrationID().toString()));
			sb.append("</profRegistrationID>");		
		}
		if (this.getPatientGPCode() != null)
		{
			sb.append("<patientGPCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatientGPCode().toString()));
			sb.append("</patientGPCode>");		
		}
		if (this.getPatientGPPractice() != null)
		{
			sb.append("<patientGPPractice>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatientGPPractice().toString()));
			sb.append("</patientGPPractice>");		
		}
		if (this.getReferrerCode() != null)
		{
			sb.append("<referrerCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferrerCode().toString()));
			sb.append("</referrerCode>");		
		}
		if (this.getReferrerPractice() != null)
		{
			sb.append("<referrerPractice>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferrerPractice().toString()));
			sb.append("</referrerPractice>");		
		}
		if (this.getOutcomeCode() != null)
		{
			sb.append("<outcomeCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOutcomeCode().toString()));
			sb.append("</outcomeCode>");		
		}
		if (this.getDateTCIOffered() != null)
		{
			sb.append("<dateTCIOffered>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTCIOffered()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTCIOffered>");		
		}
		if (this.getERODate() != null)
		{
			sb.append("<eRODate>");
			sb.append(new ims.framework.utils.DateTime(this.getERODate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</eRODate>");		
		}
		if (this.getOrigDecisionToAdmitDate() != null)
		{
			sb.append("<origDecisionToAdmitDate>");
			sb.append(new ims.framework.utils.DateTime(this.getOrigDecisionToAdmitDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</origDecisionToAdmitDate>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
		}
		if (this.getRemovalReason() != null)
		{
			sb.append("<removalReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRemovalReason().toString()));
			sb.append("</removalReason>");		
		}
		if (this.getRemovalDate() != null)
		{
			sb.append("<removalDate>");
			sb.append(new ims.framework.utils.DateTime(this.getRemovalDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</removalDate>");		
		}
		if (this.getEpisodeStartDate() != null)
		{
			sb.append("<episodeStartDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEpisodeStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</episodeStartDate>");		
		}
		if (this.getOPCSProcedureGroup() != null)
		{
			if (this.getOPCSProcedureGroup().size() > 0 )
			{
			sb.append("<oPCSProcedureGroup>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOPCSProcedureGroup(), domMap));
			sb.append("</oPCSProcedureGroup>");		
			}
		}
		if (this.getREADProcedureGroup() != null)
		{
			sb.append("<rEADProcedureGroup>");
			sb.append(this.getREADProcedureGroup().toXMLString(domMap)); 	
			sb.append("</rEADProcedureGroup>");		
		}
		if (this.getLocationGroup() != null)
		{
			sb.append("<locationGroup>");
			sb.append(this.getLocationGroup().toXMLString(domMap)); 	
			sb.append("</locationGroup>");		
		}
		if (this.getCareContextId() != null)
		{
			sb.append("<careContextId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCareContextId().toString()));
			sb.append("</careContextId>");		
		}
		if (this.getHRGCode() != null)
		{
			sb.append("<hRGCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHRGCode().toString()));
			sb.append("</hRGCode>");		
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
			CDSElectiveList domainObject = getCDSElectiveListfromXML(itemEl, factory, domMap);

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
			CDSElectiveList domainObject = getCDSElectiveListfromXML(itemEl, factory, domMap);

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
		
	public static CDSElectiveList getCDSElectiveListfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCDSElectiveListfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CDSElectiveList getCDSElectiveListfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CDSElectiveList.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CDSElectiveList.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CDSElectiveList class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CDSElectiveList)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CDSElectiveList.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CDSElectiveList ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CDSElectiveList)factory.getImportedDomainObject(CDSElectiveList.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CDSElectiveList();
		}
		String keyClassName = "CDSElectiveList";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CDSElectiveList)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CDSElectiveList obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("waitTimeMeasureType");
		if(fldEl != null)
		{	
    		obj.setWaitTimeMeasureType(new String(fldEl.getTextTrim()));	
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
		fldEl = el.element("localPatientIdentifier");
		if(fldEl != null)
		{	
    		obj.setLocalPatientIdentifier(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cCGOrgCode");
		if(fldEl != null)
		{	
    		obj.setCCGOrgCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("withHeldIdentityReason");
		if(fldEl != null)
		{	
    		obj.setWithHeldIdentityReason(new String(fldEl.getTextTrim()));	
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
		fldEl = el.element("commSerialNumber");
		if(fldEl != null)
		{	
    		obj.setCommSerialNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nHSServAgreeLineNum");
		if(fldEl != null)
		{	
    		obj.setNHSServAgreeLineNum(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("providerRefNum");
		if(fldEl != null)
		{	
    		obj.setProviderRefNum(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("commissionerReferenceNum");
		if(fldEl != null)
		{	
    		obj.setCommissionerReferenceNum(new String(fldEl.getTextTrim()));	
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
		fldEl = el.element("nHSServAgreeChangeDate");
		if(fldEl != null)
		{	
    		obj.setNHSServAgreeChangeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("electiveListID");
		if(fldEl != null)
		{	
    		obj.setElectiveListID(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("adminCategory");
		if(fldEl != null)
		{	
    		obj.setAdminCategory(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("countSuspendedDays");
		if(fldEl != null)
		{	
    		obj.setCountSuspendedDays(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("eLEStatus");
		if(fldEl != null)
		{	
    		obj.setELEStatus(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("eLEType");
		if(fldEl != null)
		{	
    		obj.setELEType(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("intendedManagement");
		if(fldEl != null)
		{	
    		obj.setIntendedManagement(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("intendedProcedure");
		if(fldEl != null)
		{	
    		obj.setIntendedProcedure(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("priorityTypeCode");
		if(fldEl != null)
		{	
    		obj.setPriorityTypeCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientClassification");
		if(fldEl != null)
		{	
    		obj.setPatientClassification(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("decidedToAdmitDate");
		if(fldEl != null)
		{	
    		obj.setDecidedToAdmitDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("ageAtCDSActivity");
		if(fldEl != null)
		{	
    		obj.setAgeAtCDSActivity(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("admissionMethod");
		if(fldEl != null)
		{	
    		obj.setAdmissionMethod(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("overseasVisitorStatus");
		if(fldEl != null)
		{	
    		obj.setOverseasVisitorStatus(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("guarenteedAdmissionDate");
		if(fldEl != null)
		{	
    		obj.setGuarenteedAdmissionDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("lastDNACancelledDate");
		if(fldEl != null)
		{	
    		obj.setLastDNACancelledDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("lastReviewedDate");
		if(fldEl != null)
		{	
    		obj.setLastReviewedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		fldEl = el.element("localSubSpecialtyCode");
		if(fldEl != null)
		{	
    		obj.setLocalSubSpecialtyCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procedureScheme");
		if(fldEl != null)
		{	
    		obj.setProcedureScheme(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procedure");
		if(fldEl != null)
		{	
    		obj.setProcedure(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procedureDate");
		if(fldEl != null)
		{	
    		obj.setProcedureDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("profRegistrationCode");
		if(fldEl != null)
		{	
    		obj.setProfRegistrationCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("profRegistrationID");
		if(fldEl != null)
		{	
    		obj.setProfRegistrationID(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientGPCode");
		if(fldEl != null)
		{	
    		obj.setPatientGPCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientGPPractice");
		if(fldEl != null)
		{	
    		obj.setPatientGPPractice(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referrerCode");
		if(fldEl != null)
		{	
    		obj.setReferrerCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referrerPractice");
		if(fldEl != null)
		{	
    		obj.setReferrerPractice(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("outcomeCode");
		if(fldEl != null)
		{	
    		obj.setOutcomeCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateTCIOffered");
		if(fldEl != null)
		{	
    		obj.setDateTCIOffered(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("eRODate");
		if(fldEl != null)
		{	
    		obj.setERODate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("origDecisionToAdmitDate");
		if(fldEl != null)
		{	
    		obj.setOrigDecisionToAdmitDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("removalReason");
		if(fldEl != null)
		{	
    		obj.setRemovalReason(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("removalDate");
		if(fldEl != null)
		{	
    		obj.setRemovalDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("episodeStartDate");
		if(fldEl != null)
		{	
    		obj.setEpisodeStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("oPCSProcedureGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOPCSProcedureGroup(ims.core.cds.domain.objects.CDSProcedureDetails.fromListXMLString(fldEl, factory, obj.getOPCSProcedureGroup(), domMap));
		}
		fldEl = el.element("rEADProcedureGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setREADProcedureGroup(ims.core.cds.domain.objects.CDSProcedureDetails.getCDSProcedureDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("locationGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocationGroup(ims.core.cds.domain.objects.CDSWaitingListLocGroup.getCDSWaitingListLocGroupfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContextId");
		if(fldEl != null)
		{	
    		obj.setCareContextId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hRGCode");
		if(fldEl != null)
		{	
    		obj.setHRGCode(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "oPCSProcedureGroup"
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
		public static final String WaitTimeMeasureType = "waitTimeMeasureType";
		public static final String RTTStartDate = "rTTStartDate";
		public static final String RTTEndDate = "rTTEndDate";
		public static final String LocalPatientIdentifier = "localPatientIdentifier";
		public static final String CCGOrgCode = "cCGOrgCode";
		public static final String WithHeldIdentityReason = "withHeldIdentityReason";
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
		public static final String CommSerialNumber = "commSerialNumber";
		public static final String NHSServAgreeLineNum = "nHSServAgreeLineNum";
		public static final String ProviderRefNum = "providerRefNum";
		public static final String CommissionerReferenceNum = "commissionerReferenceNum";
		public static final String OrgCodeProvider = "orgCodeProvider";
		public static final String OrgCodeCommissioner = "orgCodeCommissioner";
		public static final String NHSServAgreeChangeDate = "nHSServAgreeChangeDate";
		public static final String ElectiveListID = "electiveListID";
		public static final String AdminCategory = "adminCategory";
		public static final String CountSuspendedDays = "countSuspendedDays";
		public static final String ELEStatus = "eLEStatus";
		public static final String ELEType = "eLEType";
		public static final String IntendedManagement = "intendedManagement";
		public static final String IntendedProcedure = "intendedProcedure";
		public static final String PriorityTypeCode = "priorityTypeCode";
		public static final String PatientClassification = "patientClassification";
		public static final String DecidedToAdmitDate = "decidedToAdmitDate";
		public static final String AgeAtCDSActivity = "ageAtCDSActivity";
		public static final String AdmissionMethod = "admissionMethod";
		public static final String OverseasVisitorStatus = "overseasVisitorStatus";
		public static final String GuarenteedAdmissionDate = "guarenteedAdmissionDate";
		public static final String LastDNACancelledDate = "lastDNACancelledDate";
		public static final String LastReviewedDate = "lastReviewedDate";
		public static final String ConsultantCode = "consultantCode";
		public static final String SpecialtyCode = "specialtyCode";
		public static final String TreatmentFuncCode = "treatmentFuncCode";
		public static final String LocalSubSpecialtyCode = "localSubSpecialtyCode";
		public static final String ProcedureScheme = "procedureScheme";
		public static final String Procedure = "procedure";
		public static final String ProcedureDate = "procedureDate";
		public static final String ProfRegistrationCode = "profRegistrationCode";
		public static final String ProfRegistrationID = "profRegistrationID";
		public static final String PatientGPCode = "patientGPCode";
		public static final String PatientGPPractice = "patientGPPractice";
		public static final String ReferrerCode = "referrerCode";
		public static final String ReferrerPractice = "referrerPractice";
		public static final String OutcomeCode = "outcomeCode";
		public static final String DateTCIOffered = "dateTCIOffered";
		public static final String ERODate = "eRODate";
		public static final String OrigDecisionToAdmitDate = "origDecisionToAdmitDate";
		public static final String StartDate = "startDate";
		public static final String RemovalReason = "removalReason";
		public static final String RemovalDate = "removalDate";
		public static final String EpisodeStartDate = "episodeStartDate";
		public static final String OPCSProcedureGroup = "oPCSProcedureGroup";
		public static final String READProcedureGroup = "rEADProcedureGroup";
		public static final String LocationGroup = "locationGroup";
		public static final String CareContextId = "careContextId";
		public static final String HRGCode = "hRGCode";
	}
}

