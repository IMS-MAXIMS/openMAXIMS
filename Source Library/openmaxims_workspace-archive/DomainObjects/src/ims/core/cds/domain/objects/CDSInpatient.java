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


public class CDSInpatient extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1104100001;
	private static final long serialVersionUID = 1104100001L;
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
	/** Marital Status */
	private String maritalStatus;
	/** Hospital Provider Spell Number */
	private String providerSpellNo;
	/** Administrative Category on Admission */
	private String adminCategoryADT;
	/** Patient Classification */
	private String patientClassification;
	/** Admission Method */
	private String admissionMethod;
	/** Source Of Admission */
	private String sourceOfAdmission;
	/** Start Date (Hospital Provider Spell) */
	private java.util.Date startDate;
	/** Age on Admission */
	private Integer age;
	/** Discharge Destination (Hosptial Provider Spell) */
	private String dischargeDestination;
	/** Discharge Method */
	private String dischargeMethod;
	/** Discharge Ready Date (Hospital Provider Spell) */
	private java.util.Date dischargeReadyDate;
	/** Discharge Date (Hospital Provider Spell) */
	private java.util.Date dischargeDate;
	/** Episode Number */
	private String episodeNumber;
	/** Last Epoisode in Spell Indicator */
	private String lastEpisodeInd;
	/** Administrative Category at start of episode */
	private String adminCategoryEPIS;
	/** Operation Status (per attendance) */
	private String operationStatus;
	/** Neonatal Level of care */
	private String neonatalCareLevel;
	/** First Regular Day or Night Admission */
	private String firstAdmission;
	/** Psychiatric Patient Status */
	private String psychPatientStatus;
	/** Legal Status Classification Code (at start of episode) */
	private String legalStatus;
	/** Start Date Episode */
	private java.util.Date episodeStartDate;
	/** End Date Episode */
	private java.util.Date episodeEndDate;
	/** Age Ad CDS Activity Date */
	private Integer ageAtCDSActivity;
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
	/** Consultant Code */
	private String consultantCode;
	/** Main Specialty Code */
	private String specialtyCode;
	/** Treatment Function Code */
	private String treatmentFuncCode;
	/** ICD Diagnosis Group
	  * Collection of ims.core.cds.domain.objects.CDSDiagnosisDetails.
	  */
	private java.util.List iCDDiagnosisGroup;
	/** READ Diagnosis Group */
	private ims.core.cds.domain.objects.CDSDiagnosisDetails readDiagGroup;
	/** OPCS Procedure Scheme In Use
	  * Collection of ims.core.cds.domain.objects.CDSProcedureDetails.
	  */
	private java.util.List oPCSProcedureGroup;
	/** READ Procedure Scheme In Use */
	private ims.core.cds.domain.objects.CDSProcedureDetails rEADProcedureGroup;
	/** Location Group Start of Episode */
	private ims.core.cds.domain.objects.CDSInpatientLocationGroup locationGroupStartEpis;
	/** Location Group Ward Stay
	  * Collection of ims.core.cds.domain.objects.CDSInpatientLocationGroup.
	  */
	private java.util.Set locationGroupWardStay;
	/** Location Group Episode End */
	private ims.core.cds.domain.objects.CDSInpatientLocationGroup locationGroupEndEpis;
	/** Critical Care Period - Neonatal Care */
	private ims.core.cds.domain.objects.CDSCriticalCareDetails neonatalCare;
	/** Critical Care Period - Paediatric */
	private ims.core.cds.domain.objects.CDSCriticalCareDetails paediatricCare;
	/** Critical Care Period - Adult */
	private ims.core.cds.domain.objects.CDSCriticalCareDetails adultCare;
	/** Critical Care Unit Bed Configuration */
	private String cCUnitBedConfiguration;
	/** Critical Care Admission Source */
	private String cCAdmissionSource;
	/** Critical Care Source Location */
	private String cCSourceLocation;
	/** Critical Care Admission Type */
	private String cCAdmissionType;
	/** Advanced Respiratory Support Days */
	private String advRespiratorySupDays;
	/** Basic Respiratory Support Days */
	private String bscRespiratorySupDays;
	/** Advanced Cardiovascular Support Days */
	private String advCardioSupDays;
	/** Basic Cardiovascular Support Days */
	private String bscCardioSupDays;
	/** Renal Support Days */
	private String renalSupportDays;
	/** Neurological Support Days */
	private String neuroSupportDays;
	/** Gastro-Intestinal Support Days */
	private String gastroSupportDays;
	/** Dermatological Support Days */
	private String dermaSupportDays;
	/** Liver Support Days */
	private String liverSupportDays;
	/** Organ Support Max */
	private String organSupportMax;
	/** Critical Care Level 2 Days */
	private String cCLevel2Days;
	/** Critical Care Level 3 days */
	private String cCLevel3Days;
	/** Critical Care Discharge Date */
	private java.util.Date cCDischargeDate;
	/** Critical Care Discharge Time */
	private String cCDischargeTime;
	/** Critical Care Discharge Ready Date */
	private java.util.Date cCDischargeReadyDate;
	/** Critical Care Discharge Ready Time */
	private String cCDischargeReadyTime;
	/** Critical Care Discharge Status */
	private String cCDischargeStatus;
	/** Critical Care Discharge Destination */
	private String cCDischargeDest;
	/** Critical Care Discharge Location */
	private String cCDischargeLocation;
	/** General Medical Practitioner (Specified) */
	private String gPCode;
	/** General Medical Practice Code (Patient Registration) */
	private String practiceCode;
	/** Referrer Code */
	private String referrerCode;
	/** Referring Organisation Code */
	private String orgCodeReferrer;
	/** Duration of Elective Wait */
	private String durElectiveWait;
	/** Intended Management */
	private String intendedManagement;
	/** Decided To Admit Date */
	private java.util.Date decidedToAdmitDate;
	/** Earliest Reasonable Offer Date */
	private java.util.Date eRODate;
	/** Healthcare Resource Group Code */
	private String resourceGrpCode;
	/** Healthcare Resource GRoup Code - Version Number */
	private String resourceGPVersion;
	/** ProcedureSchemaInUse */
	private String procedureScheme;
	/** HRG Dominant Grouping Variable - Procedure */
	private String hrgDominantGrouping;
	/** Link to the PasEvent that created this record */
	private Integer pasEventId;
	/** Used by HRG Grouper Report */
	private Integer careContextId;
	/** The HRG Configured Code associated with opcs4 code from CDS */
	private String hRGCode;
	/** Length of stay - diff between start date and discharge date */
	private Integer lengthOfStay;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CDSInpatient (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CDSInpatient ()
    {
    	super();
    }
    public CDSInpatient (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.cds.domain.objects.CDSInpatient.class;
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

	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		if ( null != maritalStatus && maritalStatus.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for maritalStatus. Tried to set value: "+
				maritalStatus);
		}
		this.maritalStatus = maritalStatus;
	}

	public String getProviderSpellNo() {
		return providerSpellNo;
	}
	public void setProviderSpellNo(String providerSpellNo) {
		if ( null != providerSpellNo && providerSpellNo.length() > 12 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for providerSpellNo. Tried to set value: "+
				providerSpellNo);
		}
		this.providerSpellNo = providerSpellNo;
	}

	public String getAdminCategoryADT() {
		return adminCategoryADT;
	}
	public void setAdminCategoryADT(String adminCategoryADT) {
		if ( null != adminCategoryADT && adminCategoryADT.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for adminCategoryADT. Tried to set value: "+
				adminCategoryADT);
		}
		this.adminCategoryADT = adminCategoryADT;
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

	public String getSourceOfAdmission() {
		return sourceOfAdmission;
	}
	public void setSourceOfAdmission(String sourceOfAdmission) {
		if ( null != sourceOfAdmission && sourceOfAdmission.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for sourceOfAdmission. Tried to set value: "+
				sourceOfAdmission);
		}
		this.sourceOfAdmission = sourceOfAdmission;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDischargeDestination() {
		return dischargeDestination;
	}
	public void setDischargeDestination(String dischargeDestination) {
		if ( null != dischargeDestination && dischargeDestination.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for dischargeDestination. Tried to set value: "+
				dischargeDestination);
		}
		this.dischargeDestination = dischargeDestination;
	}

	public String getDischargeMethod() {
		return dischargeMethod;
	}
	public void setDischargeMethod(String dischargeMethod) {
		if ( null != dischargeMethod && dischargeMethod.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for dischargeMethod. Tried to set value: "+
				dischargeMethod);
		}
		this.dischargeMethod = dischargeMethod;
	}

	public java.util.Date getDischargeReadyDate() {
		return dischargeReadyDate;
	}
	public void setDischargeReadyDate(java.util.Date dischargeReadyDate) {
		this.dischargeReadyDate = dischargeReadyDate;
	}

	public java.util.Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(java.util.Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public String getEpisodeNumber() {
		return episodeNumber;
	}
	public void setEpisodeNumber(String episodeNumber) {
		if ( null != episodeNumber && episodeNumber.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for episodeNumber. Tried to set value: "+
				episodeNumber);
		}
		this.episodeNumber = episodeNumber;
	}

	public String getLastEpisodeInd() {
		return lastEpisodeInd;
	}
	public void setLastEpisodeInd(String lastEpisodeInd) {
		if ( null != lastEpisodeInd && lastEpisodeInd.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for lastEpisodeInd. Tried to set value: "+
				lastEpisodeInd);
		}
		this.lastEpisodeInd = lastEpisodeInd;
	}

	public String getAdminCategoryEPIS() {
		return adminCategoryEPIS;
	}
	public void setAdminCategoryEPIS(String adminCategoryEPIS) {
		if ( null != adminCategoryEPIS && adminCategoryEPIS.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for adminCategoryEPIS. Tried to set value: "+
				adminCategoryEPIS);
		}
		this.adminCategoryEPIS = adminCategoryEPIS;
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

	public String getNeonatalCareLevel() {
		return neonatalCareLevel;
	}
	public void setNeonatalCareLevel(String neonatalCareLevel) {
		if ( null != neonatalCareLevel && neonatalCareLevel.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for neonatalCareLevel. Tried to set value: "+
				neonatalCareLevel);
		}
		this.neonatalCareLevel = neonatalCareLevel;
	}

	public String getFirstAdmission() {
		return firstAdmission;
	}
	public void setFirstAdmission(String firstAdmission) {
		if ( null != firstAdmission && firstAdmission.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for firstAdmission. Tried to set value: "+
				firstAdmission);
		}
		this.firstAdmission = firstAdmission;
	}

	public String getPsychPatientStatus() {
		return psychPatientStatus;
	}
	public void setPsychPatientStatus(String psychPatientStatus) {
		if ( null != psychPatientStatus && psychPatientStatus.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for psychPatientStatus. Tried to set value: "+
				psychPatientStatus);
		}
		this.psychPatientStatus = psychPatientStatus;
	}

	public String getLegalStatus() {
		return legalStatus;
	}
	public void setLegalStatus(String legalStatus) {
		if ( null != legalStatus && legalStatus.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for legalStatus. Tried to set value: "+
				legalStatus);
		}
		this.legalStatus = legalStatus;
	}

	public java.util.Date getEpisodeStartDate() {
		return episodeStartDate;
	}
	public void setEpisodeStartDate(java.util.Date episodeStartDate) {
		this.episodeStartDate = episodeStartDate;
	}

	public java.util.Date getEpisodeEndDate() {
		return episodeEndDate;
	}
	public void setEpisodeEndDate(java.util.Date episodeEndDate) {
		this.episodeEndDate = episodeEndDate;
	}

	public Integer getAgeAtCDSActivity() {
		return ageAtCDSActivity;
	}
	public void setAgeAtCDSActivity(Integer ageAtCDSActivity) {
		this.ageAtCDSActivity = ageAtCDSActivity;
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

	public java.util.List getICDDiagnosisGroup() {
		if ( null == iCDDiagnosisGroup ) {
			iCDDiagnosisGroup = new java.util.ArrayList();
		}
		return iCDDiagnosisGroup;
	}
	public void setICDDiagnosisGroup(java.util.List paramValue) {
		this.iCDDiagnosisGroup = paramValue;
	}

	public ims.core.cds.domain.objects.CDSDiagnosisDetails getReadDiagGroup() {
		return readDiagGroup;
	}
	public void setReadDiagGroup(ims.core.cds.domain.objects.CDSDiagnosisDetails readDiagGroup) {
		this.readDiagGroup = readDiagGroup;
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

	public ims.core.cds.domain.objects.CDSInpatientLocationGroup getLocationGroupStartEpis() {
		return locationGroupStartEpis;
	}
	public void setLocationGroupStartEpis(ims.core.cds.domain.objects.CDSInpatientLocationGroup locationGroupStartEpis) {
		this.locationGroupStartEpis = locationGroupStartEpis;
	}

	public java.util.Set getLocationGroupWardStay() {
		if ( null == locationGroupWardStay ) {
			locationGroupWardStay = new java.util.HashSet();
		}
		return locationGroupWardStay;
	}
	public void setLocationGroupWardStay(java.util.Set paramValue) {
		this.locationGroupWardStay = paramValue;
	}

	public ims.core.cds.domain.objects.CDSInpatientLocationGroup getLocationGroupEndEpis() {
		return locationGroupEndEpis;
	}
	public void setLocationGroupEndEpis(ims.core.cds.domain.objects.CDSInpatientLocationGroup locationGroupEndEpis) {
		this.locationGroupEndEpis = locationGroupEndEpis;
	}

	public ims.core.cds.domain.objects.CDSCriticalCareDetails getNeonatalCare() {
		return neonatalCare;
	}
	public void setNeonatalCare(ims.core.cds.domain.objects.CDSCriticalCareDetails neonatalCare) {
		this.neonatalCare = neonatalCare;
	}

	public ims.core.cds.domain.objects.CDSCriticalCareDetails getPaediatricCare() {
		return paediatricCare;
	}
	public void setPaediatricCare(ims.core.cds.domain.objects.CDSCriticalCareDetails paediatricCare) {
		this.paediatricCare = paediatricCare;
	}

	public ims.core.cds.domain.objects.CDSCriticalCareDetails getAdultCare() {
		return adultCare;
	}
	public void setAdultCare(ims.core.cds.domain.objects.CDSCriticalCareDetails adultCare) {
		this.adultCare = adultCare;
	}

	public String getCCUnitBedConfiguration() {
		return cCUnitBedConfiguration;
	}
	public void setCCUnitBedConfiguration(String cCUnitBedConfiguration) {
		if ( null != cCUnitBedConfiguration && cCUnitBedConfiguration.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cCUnitBedConfiguration. Tried to set value: "+
				cCUnitBedConfiguration);
		}
		this.cCUnitBedConfiguration = cCUnitBedConfiguration;
	}

	public String getCCAdmissionSource() {
		return cCAdmissionSource;
	}
	public void setCCAdmissionSource(String cCAdmissionSource) {
		if ( null != cCAdmissionSource && cCAdmissionSource.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cCAdmissionSource. Tried to set value: "+
				cCAdmissionSource);
		}
		this.cCAdmissionSource = cCAdmissionSource;
	}

	public String getCCSourceLocation() {
		return cCSourceLocation;
	}
	public void setCCSourceLocation(String cCSourceLocation) {
		if ( null != cCSourceLocation && cCSourceLocation.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cCSourceLocation. Tried to set value: "+
				cCSourceLocation);
		}
		this.cCSourceLocation = cCSourceLocation;
	}

	public String getCCAdmissionType() {
		return cCAdmissionType;
	}
	public void setCCAdmissionType(String cCAdmissionType) {
		if ( null != cCAdmissionType && cCAdmissionType.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cCAdmissionType. Tried to set value: "+
				cCAdmissionType);
		}
		this.cCAdmissionType = cCAdmissionType;
	}

	public String getAdvRespiratorySupDays() {
		return advRespiratorySupDays;
	}
	public void setAdvRespiratorySupDays(String advRespiratorySupDays) {
		if ( null != advRespiratorySupDays && advRespiratorySupDays.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for advRespiratorySupDays. Tried to set value: "+
				advRespiratorySupDays);
		}
		this.advRespiratorySupDays = advRespiratorySupDays;
	}

	public String getBscRespiratorySupDays() {
		return bscRespiratorySupDays;
	}
	public void setBscRespiratorySupDays(String bscRespiratorySupDays) {
		if ( null != bscRespiratorySupDays && bscRespiratorySupDays.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for bscRespiratorySupDays. Tried to set value: "+
				bscRespiratorySupDays);
		}
		this.bscRespiratorySupDays = bscRespiratorySupDays;
	}

	public String getAdvCardioSupDays() {
		return advCardioSupDays;
	}
	public void setAdvCardioSupDays(String advCardioSupDays) {
		if ( null != advCardioSupDays && advCardioSupDays.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for advCardioSupDays. Tried to set value: "+
				advCardioSupDays);
		}
		this.advCardioSupDays = advCardioSupDays;
	}

	public String getBscCardioSupDays() {
		return bscCardioSupDays;
	}
	public void setBscCardioSupDays(String bscCardioSupDays) {
		if ( null != bscCardioSupDays && bscCardioSupDays.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for bscCardioSupDays. Tried to set value: "+
				bscCardioSupDays);
		}
		this.bscCardioSupDays = bscCardioSupDays;
	}

	public String getRenalSupportDays() {
		return renalSupportDays;
	}
	public void setRenalSupportDays(String renalSupportDays) {
		if ( null != renalSupportDays && renalSupportDays.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for renalSupportDays. Tried to set value: "+
				renalSupportDays);
		}
		this.renalSupportDays = renalSupportDays;
	}

	public String getNeuroSupportDays() {
		return neuroSupportDays;
	}
	public void setNeuroSupportDays(String neuroSupportDays) {
		if ( null != neuroSupportDays && neuroSupportDays.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for neuroSupportDays. Tried to set value: "+
				neuroSupportDays);
		}
		this.neuroSupportDays = neuroSupportDays;
	}

	public String getGastroSupportDays() {
		return gastroSupportDays;
	}
	public void setGastroSupportDays(String gastroSupportDays) {
		if ( null != gastroSupportDays && gastroSupportDays.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for gastroSupportDays. Tried to set value: "+
				gastroSupportDays);
		}
		this.gastroSupportDays = gastroSupportDays;
	}

	public String getDermaSupportDays() {
		return dermaSupportDays;
	}
	public void setDermaSupportDays(String dermaSupportDays) {
		if ( null != dermaSupportDays && dermaSupportDays.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for dermaSupportDays. Tried to set value: "+
				dermaSupportDays);
		}
		this.dermaSupportDays = dermaSupportDays;
	}

	public String getLiverSupportDays() {
		return liverSupportDays;
	}
	public void setLiverSupportDays(String liverSupportDays) {
		if ( null != liverSupportDays && liverSupportDays.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for liverSupportDays. Tried to set value: "+
				liverSupportDays);
		}
		this.liverSupportDays = liverSupportDays;
	}

	public String getOrganSupportMax() {
		return organSupportMax;
	}
	public void setOrganSupportMax(String organSupportMax) {
		if ( null != organSupportMax && organSupportMax.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for organSupportMax. Tried to set value: "+
				organSupportMax);
		}
		this.organSupportMax = organSupportMax;
	}

	public String getCCLevel2Days() {
		return cCLevel2Days;
	}
	public void setCCLevel2Days(String cCLevel2Days) {
		if ( null != cCLevel2Days && cCLevel2Days.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cCLevel2Days. Tried to set value: "+
				cCLevel2Days);
		}
		this.cCLevel2Days = cCLevel2Days;
	}

	public String getCCLevel3Days() {
		return cCLevel3Days;
	}
	public void setCCLevel3Days(String cCLevel3Days) {
		if ( null != cCLevel3Days && cCLevel3Days.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cCLevel3Days. Tried to set value: "+
				cCLevel3Days);
		}
		this.cCLevel3Days = cCLevel3Days;
	}

	public java.util.Date getCCDischargeDate() {
		return cCDischargeDate;
	}
	public void setCCDischargeDate(java.util.Date cCDischargeDate) {
		this.cCDischargeDate = cCDischargeDate;
	}

	public String getCCDischargeTime() {
		return cCDischargeTime;
	}
	public void setCCDischargeTime(String cCDischargeTime) {
		this.cCDischargeTime = cCDischargeTime;
	}

	public java.util.Date getCCDischargeReadyDate() {
		return cCDischargeReadyDate;
	}
	public void setCCDischargeReadyDate(java.util.Date cCDischargeReadyDate) {
		this.cCDischargeReadyDate = cCDischargeReadyDate;
	}

	public String getCCDischargeReadyTime() {
		return cCDischargeReadyTime;
	}
	public void setCCDischargeReadyTime(String cCDischargeReadyTime) {
		this.cCDischargeReadyTime = cCDischargeReadyTime;
	}

	public String getCCDischargeStatus() {
		return cCDischargeStatus;
	}
	public void setCCDischargeStatus(String cCDischargeStatus) {
		if ( null != cCDischargeStatus && cCDischargeStatus.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cCDischargeStatus. Tried to set value: "+
				cCDischargeStatus);
		}
		this.cCDischargeStatus = cCDischargeStatus;
	}

	public String getCCDischargeDest() {
		return cCDischargeDest;
	}
	public void setCCDischargeDest(String cCDischargeDest) {
		if ( null != cCDischargeDest && cCDischargeDest.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cCDischargeDest. Tried to set value: "+
				cCDischargeDest);
		}
		this.cCDischargeDest = cCDischargeDest;
	}

	public String getCCDischargeLocation() {
		return cCDischargeLocation;
	}
	public void setCCDischargeLocation(String cCDischargeLocation) {
		if ( null != cCDischargeLocation && cCDischargeLocation.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cCDischargeLocation. Tried to set value: "+
				cCDischargeLocation);
		}
		this.cCDischargeLocation = cCDischargeLocation;
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

	public String getDurElectiveWait() {
		return durElectiveWait;
	}
	public void setDurElectiveWait(String durElectiveWait) {
		if ( null != durElectiveWait && durElectiveWait.length() > 4 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for durElectiveWait. Tried to set value: "+
				durElectiveWait);
		}
		this.durElectiveWait = durElectiveWait;
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

	public java.util.Date getDecidedToAdmitDate() {
		return decidedToAdmitDate;
	}
	public void setDecidedToAdmitDate(java.util.Date decidedToAdmitDate) {
		this.decidedToAdmitDate = decidedToAdmitDate;
	}

	public java.util.Date getERODate() {
		return eRODate;
	}
	public void setERODate(java.util.Date eRODate) {
		this.eRODate = eRODate;
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

	public Integer getPasEventId() {
		return pasEventId;
	}
	public static CDSInpatient getCDSInpatientFromPasEventId(ims.domain.ILightweightDomainFactory factory, Integer val)
	{
		String hql = "from CDSInpatient c where c.pasEventId = :pasEventId";		
		java.util.List l = factory.find(hql, new String[]{"pasEventId"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. CDSInpatient.pasEventId = " + val + " returned " + l.size() + " records. " );
		return (CDSInpatient)l.get(0);
	}
	public void setPasEventId(Integer pasEventId) {
		this.pasEventId = pasEventId;
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

	public Integer getLengthOfStay() {
		return lengthOfStay;
	}
	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
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
		auditStr.append("\r\n*maritalStatus* :");
		auditStr.append(maritalStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*providerSpellNo* :");
		auditStr.append(providerSpellNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*adminCategoryADT* :");
		auditStr.append(adminCategoryADT);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientClassification* :");
		auditStr.append(patientClassification);
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionMethod* :");
		auditStr.append(admissionMethod);
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceOfAdmission* :");
		auditStr.append(sourceOfAdmission);
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*age* :");
		auditStr.append(age);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDestination* :");
		auditStr.append(dischargeDestination);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeMethod* :");
		auditStr.append(dischargeMethod);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeReadyDate* :");
		auditStr.append(dischargeReadyDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDate* :");
		auditStr.append(dischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeNumber* :");
		auditStr.append(episodeNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastEpisodeInd* :");
		auditStr.append(lastEpisodeInd);
	    auditStr.append("; ");
		auditStr.append("\r\n*adminCategoryEPIS* :");
		auditStr.append(adminCategoryEPIS);
	    auditStr.append("; ");
		auditStr.append("\r\n*operationStatus* :");
		auditStr.append(operationStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*neonatalCareLevel* :");
		auditStr.append(neonatalCareLevel);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstAdmission* :");
		auditStr.append(firstAdmission);
	    auditStr.append("; ");
		auditStr.append("\r\n*psychPatientStatus* :");
		auditStr.append(psychPatientStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*legalStatus* :");
		auditStr.append(legalStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeStartDate* :");
		auditStr.append(episodeStartDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeEndDate* :");
		auditStr.append(episodeEndDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*ageAtCDSActivity* :");
		auditStr.append(ageAtCDSActivity);
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
		auditStr.append("\r\n*consultantCode* :");
		auditStr.append(consultantCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialtyCode* :");
		auditStr.append(specialtyCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentFuncCode* :");
		auditStr.append(treatmentFuncCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*iCDDiagnosisGroup* :");
		if (iCDDiagnosisGroup != null)
		{
		int i54=0;
		for (i54=0; i54<iCDDiagnosisGroup.size(); i54++)
		{
			if (i54 > 0)
				auditStr.append(",");
			ims.core.cds.domain.objects.CDSDiagnosisDetails obj = (ims.core.cds.domain.objects.CDSDiagnosisDetails)iCDDiagnosisGroup.get(i54);
		    if (obj != null)
			{
				if (i54 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i54 > 0)
			auditStr.append("] " + i54);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*readDiagGroup* :");
		if (readDiagGroup != null)
		{
			auditStr.append(toShortClassName(readDiagGroup));
				
		    auditStr.append(readDiagGroup.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*oPCSProcedureGroup* :");
		if (oPCSProcedureGroup != null)
		{
		int i56=0;
		for (i56=0; i56<oPCSProcedureGroup.size(); i56++)
		{
			if (i56 > 0)
				auditStr.append(",");
			ims.core.cds.domain.objects.CDSProcedureDetails obj = (ims.core.cds.domain.objects.CDSProcedureDetails)oPCSProcedureGroup.get(i56);
		    if (obj != null)
			{
				if (i56 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i56 > 0)
			auditStr.append("] " + i56);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*rEADProcedureGroup* :");
		if (rEADProcedureGroup != null)
		{
			auditStr.append(toShortClassName(rEADProcedureGroup));
				
		    auditStr.append(rEADProcedureGroup.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*locationGroupStartEpis* :");
		if (locationGroupStartEpis != null)
		{
			auditStr.append(toShortClassName(locationGroupStartEpis));
				
		    auditStr.append(locationGroupStartEpis.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*locationGroupWardStay* :");
		if (locationGroupWardStay != null)
		{
			java.util.Iterator it59 = locationGroupWardStay.iterator();
			int i59=0;
			while (it59.hasNext())
			{
				if (i59 > 0)
					auditStr.append(",");
				ims.core.cds.domain.objects.CDSInpatientLocationGroup obj = (ims.core.cds.domain.objects.CDSInpatientLocationGroup)it59.next();
		if (obj != null)
		{
		   if (i59 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i59++;
		}
		if (i59 > 0)
			auditStr.append("] " + i59);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*locationGroupEndEpis* :");
		if (locationGroupEndEpis != null)
		{
			auditStr.append(toShortClassName(locationGroupEndEpis));
				
		    auditStr.append(locationGroupEndEpis.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*neonatalCare* :");
		if (neonatalCare != null)
		{
			auditStr.append(toShortClassName(neonatalCare));
				
		    auditStr.append(neonatalCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*paediatricCare* :");
		if (paediatricCare != null)
		{
			auditStr.append(toShortClassName(paediatricCare));
				
		    auditStr.append(paediatricCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*adultCare* :");
		if (adultCare != null)
		{
			auditStr.append(toShortClassName(adultCare));
				
		    auditStr.append(adultCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*cCUnitBedConfiguration* :");
		auditStr.append(cCUnitBedConfiguration);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCAdmissionSource* :");
		auditStr.append(cCAdmissionSource);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCSourceLocation* :");
		auditStr.append(cCSourceLocation);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCAdmissionType* :");
		auditStr.append(cCAdmissionType);
	    auditStr.append("; ");
		auditStr.append("\r\n*advRespiratorySupDays* :");
		auditStr.append(advRespiratorySupDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*bscRespiratorySupDays* :");
		auditStr.append(bscRespiratorySupDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*advCardioSupDays* :");
		auditStr.append(advCardioSupDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*bscCardioSupDays* :");
		auditStr.append(bscCardioSupDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*renalSupportDays* :");
		auditStr.append(renalSupportDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*neuroSupportDays* :");
		auditStr.append(neuroSupportDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*gastroSupportDays* :");
		auditStr.append(gastroSupportDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*dermaSupportDays* :");
		auditStr.append(dermaSupportDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*liverSupportDays* :");
		auditStr.append(liverSupportDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*organSupportMax* :");
		auditStr.append(organSupportMax);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCLevel2Days* :");
		auditStr.append(cCLevel2Days);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCLevel3Days* :");
		auditStr.append(cCLevel3Days);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCDischargeDate* :");
		auditStr.append(cCDischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCDischargeTime* :");
		auditStr.append(cCDischargeTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCDischargeReadyDate* :");
		auditStr.append(cCDischargeReadyDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCDischargeReadyTime* :");
		auditStr.append(cCDischargeReadyTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCDischargeStatus* :");
		auditStr.append(cCDischargeStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCDischargeDest* :");
		auditStr.append(cCDischargeDest);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCDischargeLocation* :");
		auditStr.append(cCDischargeLocation);
	    auditStr.append("; ");
		auditStr.append("\r\n*gPCode* :");
		auditStr.append(gPCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*practiceCode* :");
		auditStr.append(practiceCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*referrerCode* :");
		auditStr.append(referrerCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*orgCodeReferrer* :");
		auditStr.append(orgCodeReferrer);
	    auditStr.append("; ");
		auditStr.append("\r\n*durElectiveWait* :");
		auditStr.append(durElectiveWait);
	    auditStr.append("; ");
		auditStr.append("\r\n*intendedManagement* :");
		auditStr.append(intendedManagement);
	    auditStr.append("; ");
		auditStr.append("\r\n*decidedToAdmitDate* :");
		auditStr.append(decidedToAdmitDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*eRODate* :");
		auditStr.append(eRODate);
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
		auditStr.append("\r\n*pasEventId* :");
		auditStr.append(pasEventId);
	    auditStr.append("; ");
		auditStr.append("\r\n*careContextId* :");
		auditStr.append(careContextId);
	    auditStr.append("; ");
		auditStr.append("\r\n*hRGCode* :");
		auditStr.append(hRGCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*lengthOfStay* :");
		auditStr.append(lengthOfStay);
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
		
		String keyClassName = "CDSInpatient";
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
		if (this.getMaritalStatus() != null)
		{
			sb.append("<maritalStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMaritalStatus().toString()));
			sb.append("</maritalStatus>");		
		}
		if (this.getProviderSpellNo() != null)
		{
			sb.append("<providerSpellNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProviderSpellNo().toString()));
			sb.append("</providerSpellNo>");		
		}
		if (this.getAdminCategoryADT() != null)
		{
			sb.append("<adminCategoryADT>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdminCategoryADT().toString()));
			sb.append("</adminCategoryADT>");		
		}
		if (this.getPatientClassification() != null)
		{
			sb.append("<patientClassification>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatientClassification().toString()));
			sb.append("</patientClassification>");		
		}
		if (this.getAdmissionMethod() != null)
		{
			sb.append("<admissionMethod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdmissionMethod().toString()));
			sb.append("</admissionMethod>");		
		}
		if (this.getSourceOfAdmission() != null)
		{
			sb.append("<sourceOfAdmission>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSourceOfAdmission().toString()));
			sb.append("</sourceOfAdmission>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
		}
		if (this.getAge() != null)
		{
			sb.append("<age>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAge().toString()));
			sb.append("</age>");		
		}
		if (this.getDischargeDestination() != null)
		{
			sb.append("<dischargeDestination>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDischargeDestination().toString()));
			sb.append("</dischargeDestination>");		
		}
		if (this.getDischargeMethod() != null)
		{
			sb.append("<dischargeMethod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDischargeMethod().toString()));
			sb.append("</dischargeMethod>");		
		}
		if (this.getDischargeReadyDate() != null)
		{
			sb.append("<dischargeReadyDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeReadyDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeReadyDate>");		
		}
		if (this.getDischargeDate() != null)
		{
			sb.append("<dischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDate>");		
		}
		if (this.getEpisodeNumber() != null)
		{
			sb.append("<episodeNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEpisodeNumber().toString()));
			sb.append("</episodeNumber>");		
		}
		if (this.getLastEpisodeInd() != null)
		{
			sb.append("<lastEpisodeInd>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLastEpisodeInd().toString()));
			sb.append("</lastEpisodeInd>");		
		}
		if (this.getAdminCategoryEPIS() != null)
		{
			sb.append("<adminCategoryEPIS>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdminCategoryEPIS().toString()));
			sb.append("</adminCategoryEPIS>");		
		}
		if (this.getOperationStatus() != null)
		{
			sb.append("<operationStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOperationStatus().toString()));
			sb.append("</operationStatus>");		
		}
		if (this.getNeonatalCareLevel() != null)
		{
			sb.append("<neonatalCareLevel>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNeonatalCareLevel().toString()));
			sb.append("</neonatalCareLevel>");		
		}
		if (this.getFirstAdmission() != null)
		{
			sb.append("<firstAdmission>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFirstAdmission().toString()));
			sb.append("</firstAdmission>");		
		}
		if (this.getPsychPatientStatus() != null)
		{
			sb.append("<psychPatientStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPsychPatientStatus().toString()));
			sb.append("</psychPatientStatus>");		
		}
		if (this.getLegalStatus() != null)
		{
			sb.append("<legalStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLegalStatus().toString()));
			sb.append("</legalStatus>");		
		}
		if (this.getEpisodeStartDate() != null)
		{
			sb.append("<episodeStartDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEpisodeStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</episodeStartDate>");		
		}
		if (this.getEpisodeEndDate() != null)
		{
			sb.append("<episodeEndDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEpisodeEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</episodeEndDate>");		
		}
		if (this.getAgeAtCDSActivity() != null)
		{
			sb.append("<ageAtCDSActivity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAgeAtCDSActivity().toString()));
			sb.append("</ageAtCDSActivity>");		
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
		if (this.getICDDiagnosisGroup() != null)
		{
			if (this.getICDDiagnosisGroup().size() > 0 )
			{
			sb.append("<iCDDiagnosisGroup>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getICDDiagnosisGroup(), domMap));
			sb.append("</iCDDiagnosisGroup>");		
			}
		}
		if (this.getReadDiagGroup() != null)
		{
			sb.append("<readDiagGroup>");
			sb.append(this.getReadDiagGroup().toXMLString(domMap)); 	
			sb.append("</readDiagGroup>");		
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
		if (this.getLocationGroupStartEpis() != null)
		{
			sb.append("<locationGroupStartEpis>");
			sb.append(this.getLocationGroupStartEpis().toXMLString(domMap)); 	
			sb.append("</locationGroupStartEpis>");		
		}
		if (this.getLocationGroupWardStay() != null)
		{
			if (this.getLocationGroupWardStay().size() > 0 )
			{
			sb.append("<locationGroupWardStay>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLocationGroupWardStay(), domMap));
			sb.append("</locationGroupWardStay>");		
			}
		}
		if (this.getLocationGroupEndEpis() != null)
		{
			sb.append("<locationGroupEndEpis>");
			sb.append(this.getLocationGroupEndEpis().toXMLString(domMap)); 	
			sb.append("</locationGroupEndEpis>");		
		}
		if (this.getNeonatalCare() != null)
		{
			sb.append("<neonatalCare>");
			sb.append(this.getNeonatalCare().toXMLString(domMap)); 	
			sb.append("</neonatalCare>");		
		}
		if (this.getPaediatricCare() != null)
		{
			sb.append("<paediatricCare>");
			sb.append(this.getPaediatricCare().toXMLString(domMap)); 	
			sb.append("</paediatricCare>");		
		}
		if (this.getAdultCare() != null)
		{
			sb.append("<adultCare>");
			sb.append(this.getAdultCare().toXMLString(domMap)); 	
			sb.append("</adultCare>");		
		}
		if (this.getCCUnitBedConfiguration() != null)
		{
			sb.append("<cCUnitBedConfiguration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCUnitBedConfiguration().toString()));
			sb.append("</cCUnitBedConfiguration>");		
		}
		if (this.getCCAdmissionSource() != null)
		{
			sb.append("<cCAdmissionSource>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCAdmissionSource().toString()));
			sb.append("</cCAdmissionSource>");		
		}
		if (this.getCCSourceLocation() != null)
		{
			sb.append("<cCSourceLocation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCSourceLocation().toString()));
			sb.append("</cCSourceLocation>");		
		}
		if (this.getCCAdmissionType() != null)
		{
			sb.append("<cCAdmissionType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCAdmissionType().toString()));
			sb.append("</cCAdmissionType>");		
		}
		if (this.getAdvRespiratorySupDays() != null)
		{
			sb.append("<advRespiratorySupDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdvRespiratorySupDays().toString()));
			sb.append("</advRespiratorySupDays>");		
		}
		if (this.getBscRespiratorySupDays() != null)
		{
			sb.append("<bscRespiratorySupDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBscRespiratorySupDays().toString()));
			sb.append("</bscRespiratorySupDays>");		
		}
		if (this.getAdvCardioSupDays() != null)
		{
			sb.append("<advCardioSupDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdvCardioSupDays().toString()));
			sb.append("</advCardioSupDays>");		
		}
		if (this.getBscCardioSupDays() != null)
		{
			sb.append("<bscCardioSupDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBscCardioSupDays().toString()));
			sb.append("</bscCardioSupDays>");		
		}
		if (this.getRenalSupportDays() != null)
		{
			sb.append("<renalSupportDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRenalSupportDays().toString()));
			sb.append("</renalSupportDays>");		
		}
		if (this.getNeuroSupportDays() != null)
		{
			sb.append("<neuroSupportDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNeuroSupportDays().toString()));
			sb.append("</neuroSupportDays>");		
		}
		if (this.getGastroSupportDays() != null)
		{
			sb.append("<gastroSupportDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGastroSupportDays().toString()));
			sb.append("</gastroSupportDays>");		
		}
		if (this.getDermaSupportDays() != null)
		{
			sb.append("<dermaSupportDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDermaSupportDays().toString()));
			sb.append("</dermaSupportDays>");		
		}
		if (this.getLiverSupportDays() != null)
		{
			sb.append("<liverSupportDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLiverSupportDays().toString()));
			sb.append("</liverSupportDays>");		
		}
		if (this.getOrganSupportMax() != null)
		{
			sb.append("<organSupportMax>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOrganSupportMax().toString()));
			sb.append("</organSupportMax>");		
		}
		if (this.getCCLevel2Days() != null)
		{
			sb.append("<cCLevel2Days>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCLevel2Days().toString()));
			sb.append("</cCLevel2Days>");		
		}
		if (this.getCCLevel3Days() != null)
		{
			sb.append("<cCLevel3Days>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCLevel3Days().toString()));
			sb.append("</cCLevel3Days>");		
		}
		if (this.getCCDischargeDate() != null)
		{
			sb.append("<cCDischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCCDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</cCDischargeDate>");		
		}
		if (this.getCCDischargeTime() != null)
		{
			sb.append("<cCDischargeTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCDischargeTime().toString()));
			sb.append("</cCDischargeTime>");		
		}
		if (this.getCCDischargeReadyDate() != null)
		{
			sb.append("<cCDischargeReadyDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCCDischargeReadyDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</cCDischargeReadyDate>");		
		}
		if (this.getCCDischargeReadyTime() != null)
		{
			sb.append("<cCDischargeReadyTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCDischargeReadyTime().toString()));
			sb.append("</cCDischargeReadyTime>");		
		}
		if (this.getCCDischargeStatus() != null)
		{
			sb.append("<cCDischargeStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCDischargeStatus().toString()));
			sb.append("</cCDischargeStatus>");		
		}
		if (this.getCCDischargeDest() != null)
		{
			sb.append("<cCDischargeDest>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCDischargeDest().toString()));
			sb.append("</cCDischargeDest>");		
		}
		if (this.getCCDischargeLocation() != null)
		{
			sb.append("<cCDischargeLocation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCDischargeLocation().toString()));
			sb.append("</cCDischargeLocation>");		
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
		if (this.getDurElectiveWait() != null)
		{
			sb.append("<durElectiveWait>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDurElectiveWait().toString()));
			sb.append("</durElectiveWait>");		
		}
		if (this.getIntendedManagement() != null)
		{
			sb.append("<intendedManagement>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIntendedManagement().toString()));
			sb.append("</intendedManagement>");		
		}
		if (this.getDecidedToAdmitDate() != null)
		{
			sb.append("<decidedToAdmitDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDecidedToAdmitDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</decidedToAdmitDate>");		
		}
		if (this.getERODate() != null)
		{
			sb.append("<eRODate>");
			sb.append(new ims.framework.utils.DateTime(this.getERODate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</eRODate>");		
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
		if (this.getPasEventId() != null)
		{
			sb.append("<pasEventId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPasEventId().toString()));
			sb.append("</pasEventId>");		
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
		if (this.getLengthOfStay() != null)
		{
			sb.append("<lengthOfStay>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLengthOfStay().toString()));
			sb.append("</lengthOfStay>");		
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
			CDSInpatient domainObject = getCDSInpatientfromXML(itemEl, factory, domMap);

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
			CDSInpatient domainObject = getCDSInpatientfromXML(itemEl, factory, domMap);

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
		
	public static CDSInpatient getCDSInpatientfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCDSInpatientfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CDSInpatient getCDSInpatientfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CDSInpatient.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CDSInpatient.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CDSInpatient class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CDSInpatient)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CDSInpatient.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CDSInpatient ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CDSInpatient)factory.getImportedDomainObject(CDSInpatient.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CDSInpatient();
		}
		String keyClassName = "CDSInpatient";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CDSInpatient)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CDSInpatient obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("maritalStatus");
		if(fldEl != null)
		{	
    		obj.setMaritalStatus(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("providerSpellNo");
		if(fldEl != null)
		{	
    		obj.setProviderSpellNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("adminCategoryADT");
		if(fldEl != null)
		{	
    		obj.setAdminCategoryADT(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientClassification");
		if(fldEl != null)
		{	
    		obj.setPatientClassification(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("admissionMethod");
		if(fldEl != null)
		{	
    		obj.setAdmissionMethod(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sourceOfAdmission");
		if(fldEl != null)
		{	
    		obj.setSourceOfAdmission(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("age");
		if(fldEl != null)
		{	
    		obj.setAge(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeDestination");
		if(fldEl != null)
		{	
    		obj.setDischargeDestination(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeMethod");
		if(fldEl != null)
		{	
    		obj.setDischargeMethod(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeReadyDate");
		if(fldEl != null)
		{	
    		obj.setDischargeReadyDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dischargeDate");
		if(fldEl != null)
		{	
    		obj.setDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("episodeNumber");
		if(fldEl != null)
		{	
    		obj.setEpisodeNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lastEpisodeInd");
		if(fldEl != null)
		{	
    		obj.setLastEpisodeInd(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("adminCategoryEPIS");
		if(fldEl != null)
		{	
    		obj.setAdminCategoryEPIS(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("operationStatus");
		if(fldEl != null)
		{	
    		obj.setOperationStatus(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("neonatalCareLevel");
		if(fldEl != null)
		{	
    		obj.setNeonatalCareLevel(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("firstAdmission");
		if(fldEl != null)
		{	
    		obj.setFirstAdmission(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("psychPatientStatus");
		if(fldEl != null)
		{	
    		obj.setPsychPatientStatus(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("legalStatus");
		if(fldEl != null)
		{	
    		obj.setLegalStatus(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("episodeStartDate");
		if(fldEl != null)
		{	
    		obj.setEpisodeStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("episodeEndDate");
		if(fldEl != null)
		{	
    		obj.setEpisodeEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("ageAtCDSActivity");
		if(fldEl != null)
		{	
    		obj.setAgeAtCDSActivity(new Integer(fldEl.getTextTrim()));	
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
		fldEl = el.element("iCDDiagnosisGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setICDDiagnosisGroup(ims.core.cds.domain.objects.CDSDiagnosisDetails.fromListXMLString(fldEl, factory, obj.getICDDiagnosisGroup(), domMap));
		}
		fldEl = el.element("readDiagGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReadDiagGroup(ims.core.cds.domain.objects.CDSDiagnosisDetails.getCDSDiagnosisDetailsfromXML(fldEl, factory, domMap)); 
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
		fldEl = el.element("locationGroupStartEpis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocationGroupStartEpis(ims.core.cds.domain.objects.CDSInpatientLocationGroup.getCDSInpatientLocationGroupfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("locationGroupWardStay");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setLocationGroupWardStay(ims.core.cds.domain.objects.CDSInpatientLocationGroup.fromSetXMLString(fldEl, factory, obj.getLocationGroupWardStay(), domMap));
		}
		fldEl = el.element("locationGroupEndEpis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocationGroupEndEpis(ims.core.cds.domain.objects.CDSInpatientLocationGroup.getCDSInpatientLocationGroupfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("neonatalCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNeonatalCare(ims.core.cds.domain.objects.CDSCriticalCareDetails.getCDSCriticalCareDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("paediatricCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPaediatricCare(ims.core.cds.domain.objects.CDSCriticalCareDetails.getCDSCriticalCareDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("adultCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAdultCare(ims.core.cds.domain.objects.CDSCriticalCareDetails.getCDSCriticalCareDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("cCUnitBedConfiguration");
		if(fldEl != null)
		{	
    		obj.setCCUnitBedConfiguration(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cCAdmissionSource");
		if(fldEl != null)
		{	
    		obj.setCCAdmissionSource(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cCSourceLocation");
		if(fldEl != null)
		{	
    		obj.setCCSourceLocation(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cCAdmissionType");
		if(fldEl != null)
		{	
    		obj.setCCAdmissionType(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("advRespiratorySupDays");
		if(fldEl != null)
		{	
    		obj.setAdvRespiratorySupDays(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bscRespiratorySupDays");
		if(fldEl != null)
		{	
    		obj.setBscRespiratorySupDays(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("advCardioSupDays");
		if(fldEl != null)
		{	
    		obj.setAdvCardioSupDays(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bscCardioSupDays");
		if(fldEl != null)
		{	
    		obj.setBscCardioSupDays(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("renalSupportDays");
		if(fldEl != null)
		{	
    		obj.setRenalSupportDays(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("neuroSupportDays");
		if(fldEl != null)
		{	
    		obj.setNeuroSupportDays(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("gastroSupportDays");
		if(fldEl != null)
		{	
    		obj.setGastroSupportDays(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dermaSupportDays");
		if(fldEl != null)
		{	
    		obj.setDermaSupportDays(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("liverSupportDays");
		if(fldEl != null)
		{	
    		obj.setLiverSupportDays(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("organSupportMax");
		if(fldEl != null)
		{	
    		obj.setOrganSupportMax(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cCLevel2Days");
		if(fldEl != null)
		{	
    		obj.setCCLevel2Days(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cCLevel3Days");
		if(fldEl != null)
		{	
    		obj.setCCLevel3Days(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cCDischargeDate");
		if(fldEl != null)
		{	
    		obj.setCCDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("cCDischargeTime");
		if(fldEl != null)
		{	
    		obj.setCCDischargeTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cCDischargeReadyDate");
		if(fldEl != null)
		{	
    		obj.setCCDischargeReadyDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("cCDischargeReadyTime");
		if(fldEl != null)
		{	
    		obj.setCCDischargeReadyTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cCDischargeStatus");
		if(fldEl != null)
		{	
    		obj.setCCDischargeStatus(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cCDischargeDest");
		if(fldEl != null)
		{	
    		obj.setCCDischargeDest(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cCDischargeLocation");
		if(fldEl != null)
		{	
    		obj.setCCDischargeLocation(new String(fldEl.getTextTrim()));	
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
		fldEl = el.element("durElectiveWait");
		if(fldEl != null)
		{	
    		obj.setDurElectiveWait(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("intendedManagement");
		if(fldEl != null)
		{	
    		obj.setIntendedManagement(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("decidedToAdmitDate");
		if(fldEl != null)
		{	
    		obj.setDecidedToAdmitDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("eRODate");
		if(fldEl != null)
		{	
    		obj.setERODate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		fldEl = el.element("pasEventId");
		if(fldEl != null)
		{	
    		obj.setPasEventId(new Integer(fldEl.getTextTrim()));	
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
		fldEl = el.element("lengthOfStay");
		if(fldEl != null)
		{	
    		obj.setLengthOfStay(new Integer(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "iCDDiagnosisGroup"
		, "oPCSProcedureGroup"
		, "locationGroupWardStay"
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
		public static final String MaritalStatus = "maritalStatus";
		public static final String ProviderSpellNo = "providerSpellNo";
		public static final String AdminCategoryADT = "adminCategoryADT";
		public static final String PatientClassification = "patientClassification";
		public static final String AdmissionMethod = "admissionMethod";
		public static final String SourceOfAdmission = "sourceOfAdmission";
		public static final String StartDate = "startDate";
		public static final String Age = "age";
		public static final String DischargeDestination = "dischargeDestination";
		public static final String DischargeMethod = "dischargeMethod";
		public static final String DischargeReadyDate = "dischargeReadyDate";
		public static final String DischargeDate = "dischargeDate";
		public static final String EpisodeNumber = "episodeNumber";
		public static final String LastEpisodeInd = "lastEpisodeInd";
		public static final String AdminCategoryEPIS = "adminCategoryEPIS";
		public static final String OperationStatus = "operationStatus";
		public static final String NeonatalCareLevel = "neonatalCareLevel";
		public static final String FirstAdmission = "firstAdmission";
		public static final String PsychPatientStatus = "psychPatientStatus";
		public static final String LegalStatus = "legalStatus";
		public static final String EpisodeStartDate = "episodeStartDate";
		public static final String EpisodeEndDate = "episodeEndDate";
		public static final String AgeAtCDSActivity = "ageAtCDSActivity";
		public static final String SerialNumber = "serialNumber";
		public static final String NHSServiceAgreeNum = "nHSServiceAgreeNum";
		public static final String ProviderRefNum = "providerRefNum";
		public static final String CommissionerRefNum = "commissionerRefNum";
		public static final String OrgCodeProvider = "orgCodeProvider";
		public static final String OrgCodeCommissioner = "orgCodeCommissioner";
		public static final String ConsultantCode = "consultantCode";
		public static final String SpecialtyCode = "specialtyCode";
		public static final String TreatmentFuncCode = "treatmentFuncCode";
		public static final String ICDDiagnosisGroup = "iCDDiagnosisGroup";
		public static final String ReadDiagGroup = "readDiagGroup";
		public static final String OPCSProcedureGroup = "oPCSProcedureGroup";
		public static final String READProcedureGroup = "rEADProcedureGroup";
		public static final String LocationGroupStartEpis = "locationGroupStartEpis";
		public static final String LocationGroupWardStay = "locationGroupWardStay";
		public static final String LocationGroupEndEpis = "locationGroupEndEpis";
		public static final String NeonatalCare = "neonatalCare";
		public static final String PaediatricCare = "paediatricCare";
		public static final String AdultCare = "adultCare";
		public static final String CCUnitBedConfiguration = "cCUnitBedConfiguration";
		public static final String CCAdmissionSource = "cCAdmissionSource";
		public static final String CCSourceLocation = "cCSourceLocation";
		public static final String CCAdmissionType = "cCAdmissionType";
		public static final String AdvRespiratorySupDays = "advRespiratorySupDays";
		public static final String BscRespiratorySupDays = "bscRespiratorySupDays";
		public static final String AdvCardioSupDays = "advCardioSupDays";
		public static final String BscCardioSupDays = "bscCardioSupDays";
		public static final String RenalSupportDays = "renalSupportDays";
		public static final String NeuroSupportDays = "neuroSupportDays";
		public static final String GastroSupportDays = "gastroSupportDays";
		public static final String DermaSupportDays = "dermaSupportDays";
		public static final String LiverSupportDays = "liverSupportDays";
		public static final String OrganSupportMax = "organSupportMax";
		public static final String CCLevel2Days = "cCLevel2Days";
		public static final String CCLevel3Days = "cCLevel3Days";
		public static final String CCDischargeDate = "cCDischargeDate";
		public static final String CCDischargeTime = "cCDischargeTime";
		public static final String CCDischargeReadyDate = "cCDischargeReadyDate";
		public static final String CCDischargeReadyTime = "cCDischargeReadyTime";
		public static final String CCDischargeStatus = "cCDischargeStatus";
		public static final String CCDischargeDest = "cCDischargeDest";
		public static final String CCDischargeLocation = "cCDischargeLocation";
		public static final String GPCode = "gPCode";
		public static final String PracticeCode = "practiceCode";
		public static final String ReferrerCode = "referrerCode";
		public static final String OrgCodeReferrer = "orgCodeReferrer";
		public static final String DurElectiveWait = "durElectiveWait";
		public static final String IntendedManagement = "intendedManagement";
		public static final String DecidedToAdmitDate = "decidedToAdmitDate";
		public static final String ERODate = "eRODate";
		public static final String ResourceGrpCode = "resourceGrpCode";
		public static final String ResourceGPVersion = "resourceGPVersion";
		public static final String ProcedureScheme = "procedureScheme";
		public static final String HrgDominantGrouping = "hrgDominantGrouping";
		public static final String PasEventId = "pasEventId";
		public static final String CareContextId = "careContextId";
		public static final String HRGCode = "hRGCode";
		public static final String LengthOfStay = "lengthOfStay";
	}
}

