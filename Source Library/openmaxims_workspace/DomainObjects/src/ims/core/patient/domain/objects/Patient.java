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
package ims.core.patient.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class Patient extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1001100000;
	private static final long serialVersionUID = 1001100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient Name */
	private ims.core.generic.domain.objects.PersonName name;
	/** Sex */
	private ims.domain.lookups.LookupInstance sex;
	/** Partial Date as not always fully known */
	private Integer dob;
	/** Date of Death */
	private java.util.Date dod;
	/** Source of DOD */
	private ims.domain.lookups.LookupInstance dodSource;
	/** Patient Address */
	private ims.core.generic.domain.objects.Address address;
	/** Names associated with Patient
	  * Collection of ims.core.generic.domain.objects.PersonName.
	  */
	private java.util.List otherNames;
	/** Identifier's associated with Patient
	  * Collection of ims.core.patient.domain.objects.PatientId.
	  */
	private java.util.List identifiers;
	/** Collection of Patient Addresses
	  * Collection of ims.core.generic.domain.objects.Address.
	  */
	private java.util.List addresses;
	/** Temporary Adress */
	private ims.core.generic.domain.objects.Address correspondenceAddress;
	/** Patient's GP */
	private ims.core.resource.people.domain.objects.Gp gp;
	/** Surgery at which Patient Attends */
	private ims.core.resource.place.domain.objects.LocSite gpSurgery;
	/** Patient's Next of Kin */
	private ims.core.patient.domain.objects.NextOfKin nok;
	/** Nearest Legal Relative */
	private ims.core.patient.domain.objects.NearestLegalRel nlr;
	/** Ethnic Origin Lookup */
	private ims.domain.lookups.LookupInstance ethnicOrigin;
	/** Religion Lookup */
	private ims.domain.lookups.LookupInstance religion;
	/** Marital Status Lookup */
	private ims.domain.lookups.LookupInstance maritalStatus;
	/** Occupation Lookup */
	private ims.domain.lookups.LookupInstance occupation;
	/** Language Lookup */
	private ims.domain.lookups.LookupInstance language;
	/** Nationality */
	private ims.domain.lookups.LookupInstance nationality;
	/** Ward patient is in, if currently an inpatient */
	private ims.core.resource.place.domain.objects.Location ward;
	/** Patient Medical Cover Details(Non Insurance) */
	private ims.core.patient.domain.objects.NationalHealthCover nationalHealthCover;
	/** Patient that data has been merged to  */
	private ims.core.patient.domain.objects.Patient associatedPatient;
	/** Set to false if patient is deleted from PMI */
	private Boolean isActive;
	/** Communication Channels
	  * Collection of ims.core.generic.domain.objects.CommunicationChannel.
	  */
	private java.util.List commChannels;
	/** Confidential Flag */
	private Boolean isConfidential;
	/** Reason for marking record as Confidential or sensitive */
	private ims.domain.lookups.LookupInstance confidentialReason;
	/** Registration Source Of Information */
	private ims.domain.lookups.LookupInstance sourceOfInformation;
	/** Link to Parent Guradian record */
	private ims.core.patient.domain.objects.Patient clientParent;
	/** Flag to indicate of the client record is a child record */
	private Boolean isChild;
	/** For PCI - Linkl to Community Care Details */
	private ims.core.patient.domain.objects.CommunityCareDetail communityCare;
	/** Serial Change Number used for Choose and Book PDS */
	private Integer sCN;
	/** Demographic conflict that needs to be resolved manually */
	private Boolean validationRequired;
	/** PatientAlerts
	  * Collection of ims.core.clinical.domain.objects.PatientAlert.
	  */
	private java.util.Set patientAlerts;
	/** Patient Photo */
	private ims.core.configuration.domain.objects.AppDBImage photo;
	/** Transient field used by rules engine to know when a patient has been saved */
	private Boolean saveComplete;
	/** Transient field used by rules engine to know when a patient is new */
	private Boolean isNewPatient;
	/** Bed Number at time of Ordering */
	private String bedNumber;
	private ims.domain.lookups.LookupInstance homeFolderLocation;
	private ims.domain.lookups.LookupInstance prefCommLanguage;
	/** Time of Death if available */
	private String timeOfDeath;
	/** practice */
	private ims.core.resource.place.domain.objects.Organisation practice;
	/** OCS Notification information */
	private ims.core.clinical.domain.objects.PatientNotification oCSNotification;
	/** IsQuickRegistrationPatient */
	private Boolean isQuickRegistrationPatient;
	/** Current Medical Insurance */
	private ims.core.clinical.domain.objects.PatientMedicalInsurance currentMedicalInsurance;
	/** for Bi directional HL7 interface the status of the MRN */
	private ims.domain.lookups.LookupInstance mRNStatus;
	private Boolean copyPatientOnCorrespondence;
	private java.util.Date copyPatientOnCorrespondenceDate;
	/** This value should be the same as the one InpatientEpisode.pasEvent.Consultant (if an Inpatient Episode exists) */
	private ims.core.resource.people.domain.objects.Medic currentResponsibleConsultant;
	/** The value of the Primary Identifier used to find/validate patient */
	private String primaryIdValueUsed;
	/** Dementia Breach Date Time */
	private java.util.Date dementiaBreachDateTime;
	/** DementiaWorklistStatus */
	private ims.domain.lookups.LookupInstance dementiaWorklistStatus;
	/** AlternativeContact */
	private ims.core.patient.domain.objects.PatientContactPreference alternativeContact;
	/** HealthBoard */
	private ims.domain.lookups.LookupInstance healthBoard;
	private Boolean hasScannedCaseNoteFolders;
	/** 
	  * Collection of ims.core.clinical.domain.objects.SupportNetworkFamily.
	  */
	private java.util.Set supportNetworkFamily;
	/** Current CaseNote Location */
	private ims.core.resource.place.domain.objects.Location currentCaseNoteLocation;
	/** Case Note Last Transfer Date */
	private java.util.Date caseNoteLastTransferDate;
	private String timeOfBirth;
	/** PDS - Indicates whether the death notification is formal or informal. */
	private ims.domain.lookups.LookupInstance pDSDeathNotificationStatus;
	/** PDS Primary Care additional information returned */
	private ims.core.domain.objects.PatientGP pDSPatientGP;
	/** InterpreterRequired */
	private Boolean pDSInterpreterRequired;
	/** PDS Relatives of the patient
	  * Collection of ims.core.patient.domain.objects.Relative.
	  */
	private java.util.List pDSrelatives;
	/** PDS Update Inforamtion */
	private ims.core.patient.domain.objects.PDSPatientUpdate pDSPatientUpdate;
	/** Patient Assigned Gp History
	  * Collection of ims.core.domain.objects.PatientGP.
	  */
	private java.util.List pDSPatientGPHistory;
	/** School College */
	private ims.core.resource.place.domain.objects.School school;
	/** Identifies if the patient is an overseas visitor  */
	private Boolean overseasVisitor;
	private ims.domain.lookups.LookupInstance overseasClassification;
	/** A record which is explicitly exempt from synchronisation for a given period of time, normally because of some data anomaly */
	private Boolean decoupled;
	/** Last date that a PDS crosscheck was performed */
	private java.util.Date pDSDateLastChecked;
	/** Has the patient lived in the UK for the last 12 months? */
	private Boolean hasLivedUK;
	/** Patient Status/Category - NHS, Private */
	private ims.domain.lookups.LookupInstance patientCategory;
	/** School or Colledge from Emergency Episode */
	private ims.domain.lookups.LookupInstance schoolOrCollege;
	private Boolean isChildInPublicCare;
	private ims.domain.lookups.LookupInstance publicCareNeed;
	/** Occupation if age is not paediatric. */
	private String txtOccupation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Patient (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Patient ()
    {
    	super();
    }
    public Patient (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.Patient.class;
	}


	public ims.core.generic.domain.objects.PersonName getName() {
		return name;
	}
	public void setName(ims.core.generic.domain.objects.PersonName name) {
		this.name = name;
	}

	public ims.domain.lookups.LookupInstance getSex() {
		return sex;
	}
	public void setSex(ims.domain.lookups.LookupInstance sex) {
		this.sex = sex;
	}

	public Integer getDob() {
		return dob;
	}
	public void setDob(Integer dob) {
		this.dob = dob;
	}

	public java.util.Date getDod() {
		return dod;
	}
	public void setDod(java.util.Date dod) {
		this.dod = dod;
	}

	public ims.domain.lookups.LookupInstance getDodSource() {
		return dodSource;
	}
	public void setDodSource(ims.domain.lookups.LookupInstance dodSource) {
		this.dodSource = dodSource;
	}

	public ims.core.generic.domain.objects.Address getAddress() {
		return address;
	}
	public void setAddress(ims.core.generic.domain.objects.Address address) {
		this.address = address;
	}

	public java.util.List getOtherNames() {
		if ( null == otherNames ) {
			otherNames = new java.util.ArrayList();
		}
		return otherNames;
	}
	public void setOtherNames(java.util.List paramValue) {
		this.otherNames = paramValue;
	}

	public java.util.List getIdentifiers() {
		if ( null == identifiers ) {
			identifiers = new java.util.ArrayList();
		}
		return identifiers;
	}
	public void setIdentifiers(java.util.List paramValue) {
		this.identifiers = paramValue;
	}

	public java.util.List getAddresses() {
		if ( null == addresses ) {
			addresses = new java.util.ArrayList();
		}
		return addresses;
	}
	public void setAddresses(java.util.List paramValue) {
		this.addresses = paramValue;
	}

	public ims.core.generic.domain.objects.Address getCorrespondenceAddress() {
		return correspondenceAddress;
	}
	public void setCorrespondenceAddress(ims.core.generic.domain.objects.Address correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	public ims.core.resource.people.domain.objects.Gp getGp() {
		return gp;
	}
	public void setGp(ims.core.resource.people.domain.objects.Gp gp) {
		this.gp = gp;
	}

	public ims.core.resource.place.domain.objects.LocSite getGpSurgery() {
		return gpSurgery;
	}
	public void setGpSurgery(ims.core.resource.place.domain.objects.LocSite gpSurgery) {
		this.gpSurgery = gpSurgery;
	}

	public ims.core.patient.domain.objects.NextOfKin getNok() {
		return nok;
	}
	public void setNok(ims.core.patient.domain.objects.NextOfKin nok) {
		this.nok = nok;
	}

	public ims.core.patient.domain.objects.NearestLegalRel getNlr() {
		return nlr;
	}
	public void setNlr(ims.core.patient.domain.objects.NearestLegalRel nlr) {
		this.nlr = nlr;
	}

	public ims.domain.lookups.LookupInstance getEthnicOrigin() {
		return ethnicOrigin;
	}
	public void setEthnicOrigin(ims.domain.lookups.LookupInstance ethnicOrigin) {
		this.ethnicOrigin = ethnicOrigin;
	}

	public ims.domain.lookups.LookupInstance getReligion() {
		return religion;
	}
	public void setReligion(ims.domain.lookups.LookupInstance religion) {
		this.religion = religion;
	}

	public ims.domain.lookups.LookupInstance getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(ims.domain.lookups.LookupInstance maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public ims.domain.lookups.LookupInstance getOccupation() {
		return occupation;
	}
	public void setOccupation(ims.domain.lookups.LookupInstance occupation) {
		this.occupation = occupation;
	}

	public ims.domain.lookups.LookupInstance getLanguage() {
		return language;
	}
	public void setLanguage(ims.domain.lookups.LookupInstance language) {
		this.language = language;
	}

	public ims.domain.lookups.LookupInstance getNationality() {
		return nationality;
	}
	public void setNationality(ims.domain.lookups.LookupInstance nationality) {
		this.nationality = nationality;
	}

	public ims.core.resource.place.domain.objects.Location getWard() {
		return ward;
	}
	public void setWard(ims.core.resource.place.domain.objects.Location ward) {
		this.ward = ward;
	}

	public ims.core.patient.domain.objects.NationalHealthCover getNationalHealthCover() {
		return nationalHealthCover;
	}
	public void setNationalHealthCover(ims.core.patient.domain.objects.NationalHealthCover nationalHealthCover) {
		this.nationalHealthCover = nationalHealthCover;
	}

	public ims.core.patient.domain.objects.Patient getAssociatedPatient() {
		return associatedPatient;
	}
	public void setAssociatedPatient(ims.core.patient.domain.objects.Patient associatedPatient) {
		this.associatedPatient = associatedPatient;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public java.util.List getCommChannels() {
		if ( null == commChannels ) {
			commChannels = new java.util.ArrayList();
		}
		return commChannels;
	}
	public void setCommChannels(java.util.List paramValue) {
		this.commChannels = paramValue;
	}

	public Boolean isIsConfidential() {
		return isConfidential;
	}
	public void setIsConfidential(Boolean isConfidential) {
		this.isConfidential = isConfidential;
	}

	public ims.domain.lookups.LookupInstance getConfidentialReason() {
		return confidentialReason;
	}
	public void setConfidentialReason(ims.domain.lookups.LookupInstance confidentialReason) {
		this.confidentialReason = confidentialReason;
	}

	public ims.domain.lookups.LookupInstance getSourceOfInformation() {
		return sourceOfInformation;
	}
	public void setSourceOfInformation(ims.domain.lookups.LookupInstance sourceOfInformation) {
		this.sourceOfInformation = sourceOfInformation;
	}

	public ims.core.patient.domain.objects.Patient getClientParent() {
		return clientParent;
	}
	public void setClientParent(ims.core.patient.domain.objects.Patient clientParent) {
		this.clientParent = clientParent;
	}

	public Boolean isIsChild() {
		return isChild;
	}
	public void setIsChild(Boolean isChild) {
		this.isChild = isChild;
	}

	public ims.core.patient.domain.objects.CommunityCareDetail getCommunityCare() {
		return communityCare;
	}
	public void setCommunityCare(ims.core.patient.domain.objects.CommunityCareDetail communityCare) {
		this.communityCare = communityCare;
	}

	public Integer getSCN() {
		return sCN;
	}
	public void setSCN(Integer sCN) {
		this.sCN = sCN;
	}

	public Boolean isValidationRequired() {
		return validationRequired;
	}
	public void setValidationRequired(Boolean validationRequired) {
		this.validationRequired = validationRequired;
	}

	public java.util.Set getPatientAlerts() {
		if ( null == patientAlerts ) {
			patientAlerts = new java.util.HashSet();
		}
		return patientAlerts;
	}
	public void setPatientAlerts(java.util.Set paramValue) {
		this.patientAlerts = paramValue;
	}

	public ims.core.configuration.domain.objects.AppDBImage getPhoto() {
		return photo;
	}
	public void setPhoto(ims.core.configuration.domain.objects.AppDBImage photo) {
		this.photo = photo;
	}

	public Boolean isSaveComplete() {
		return saveComplete;
	}
	public void setSaveComplete(Boolean saveComplete) {
		this.saveComplete = saveComplete;
	}

	public Boolean isIsNewPatient() {
		return isNewPatient;
	}
	public void setIsNewPatient(Boolean isNewPatient) {
		this.isNewPatient = isNewPatient;
	}

	public String getBedNumber() {
		return bedNumber;
	}
	public void setBedNumber(String bedNumber) {
		if ( null != bedNumber && bedNumber.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for bedNumber. Tried to set value: "+
				bedNumber);
		}
		this.bedNumber = bedNumber;
	}

	public ims.domain.lookups.LookupInstance getHomeFolderLocation() {
		return homeFolderLocation;
	}
	public void setHomeFolderLocation(ims.domain.lookups.LookupInstance homeFolderLocation) {
		this.homeFolderLocation = homeFolderLocation;
	}

	public ims.domain.lookups.LookupInstance getPrefCommLanguage() {
		return prefCommLanguage;
	}
	public void setPrefCommLanguage(ims.domain.lookups.LookupInstance prefCommLanguage) {
		this.prefCommLanguage = prefCommLanguage;
	}

	public String getTimeOfDeath() {
		return timeOfDeath;
	}
	public void setTimeOfDeath(String timeOfDeath) {
		this.timeOfDeath = timeOfDeath;
	}

	public ims.core.resource.place.domain.objects.Organisation getPractice() {
		return practice;
	}
	public void setPractice(ims.core.resource.place.domain.objects.Organisation practice) {
		this.practice = practice;
	}

	public ims.core.clinical.domain.objects.PatientNotification getOCSNotification() {
		return oCSNotification;
	}
	public void setOCSNotification(ims.core.clinical.domain.objects.PatientNotification oCSNotification) {
		this.oCSNotification = oCSNotification;
	}

	public Boolean isIsQuickRegistrationPatient() {
		return isQuickRegistrationPatient;
	}
	public void setIsQuickRegistrationPatient(Boolean isQuickRegistrationPatient) {
		this.isQuickRegistrationPatient = isQuickRegistrationPatient;
	}

	public ims.core.clinical.domain.objects.PatientMedicalInsurance getCurrentMedicalInsurance() {
		return currentMedicalInsurance;
	}
	public void setCurrentMedicalInsurance(ims.core.clinical.domain.objects.PatientMedicalInsurance currentMedicalInsurance) {
		this.currentMedicalInsurance = currentMedicalInsurance;
	}

	public ims.domain.lookups.LookupInstance getMRNStatus() {
		return mRNStatus;
	}
	public void setMRNStatus(ims.domain.lookups.LookupInstance mRNStatus) {
		this.mRNStatus = mRNStatus;
	}

	public Boolean isCopyPatientOnCorrespondence() {
		return copyPatientOnCorrespondence;
	}
	public void setCopyPatientOnCorrespondence(Boolean copyPatientOnCorrespondence) {
		this.copyPatientOnCorrespondence = copyPatientOnCorrespondence;
	}

	public java.util.Date getCopyPatientOnCorrespondenceDate() {
		return copyPatientOnCorrespondenceDate;
	}
	public void setCopyPatientOnCorrespondenceDate(java.util.Date copyPatientOnCorrespondenceDate) {
		this.copyPatientOnCorrespondenceDate = copyPatientOnCorrespondenceDate;
	}

	public ims.core.resource.people.domain.objects.Medic getCurrentResponsibleConsultant() {
		return currentResponsibleConsultant;
	}
	public void setCurrentResponsibleConsultant(ims.core.resource.people.domain.objects.Medic currentResponsibleConsultant) {
		this.currentResponsibleConsultant = currentResponsibleConsultant;
	}

	public String getPrimaryIdValueUsed() {
		return primaryIdValueUsed;
	}
	public void setPrimaryIdValueUsed(String primaryIdValueUsed) {
		if ( null != primaryIdValueUsed && primaryIdValueUsed.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for primaryIdValueUsed. Tried to set value: "+
				primaryIdValueUsed);
		}
		this.primaryIdValueUsed = primaryIdValueUsed;
	}

	public java.util.Date getDementiaBreachDateTime() {
		return dementiaBreachDateTime;
	}
	public void setDementiaBreachDateTime(java.util.Date dementiaBreachDateTime) {
		this.dementiaBreachDateTime = dementiaBreachDateTime;
	}

	public ims.domain.lookups.LookupInstance getDementiaWorklistStatus() {
		return dementiaWorklistStatus;
	}
	public void setDementiaWorklistStatus(ims.domain.lookups.LookupInstance dementiaWorklistStatus) {
		this.dementiaWorklistStatus = dementiaWorklistStatus;
	}

	public ims.core.patient.domain.objects.PatientContactPreference getAlternativeContact() {
		return alternativeContact;
	}
	public void setAlternativeContact(ims.core.patient.domain.objects.PatientContactPreference alternativeContact) {
		this.alternativeContact = alternativeContact;
	}

	public ims.domain.lookups.LookupInstance getHealthBoard() {
		return healthBoard;
	}
	public void setHealthBoard(ims.domain.lookups.LookupInstance healthBoard) {
		this.healthBoard = healthBoard;
	}

	public Boolean isHasScannedCaseNoteFolders() {
		return hasScannedCaseNoteFolders;
	}
	public void setHasScannedCaseNoteFolders(Boolean hasScannedCaseNoteFolders) {
		this.hasScannedCaseNoteFolders = hasScannedCaseNoteFolders;
	}

	public java.util.Set getSupportNetworkFamily() {
		if ( null == supportNetworkFamily ) {
			supportNetworkFamily = new java.util.HashSet();
		}
		return supportNetworkFamily;
	}
	public void setSupportNetworkFamily(java.util.Set paramValue) {
		this.supportNetworkFamily = paramValue;
	}

	public ims.core.resource.place.domain.objects.Location getCurrentCaseNoteLocation() {
		return currentCaseNoteLocation;
	}
	public void setCurrentCaseNoteLocation(ims.core.resource.place.domain.objects.Location currentCaseNoteLocation) {
		this.currentCaseNoteLocation = currentCaseNoteLocation;
	}

	public java.util.Date getCaseNoteLastTransferDate() {
		return caseNoteLastTransferDate;
	}
	public void setCaseNoteLastTransferDate(java.util.Date caseNoteLastTransferDate) {
		this.caseNoteLastTransferDate = caseNoteLastTransferDate;
	}

	public String getTimeOfBirth() {
		return timeOfBirth;
	}
	public void setTimeOfBirth(String timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}

	public ims.domain.lookups.LookupInstance getPDSDeathNotificationStatus() {
		return pDSDeathNotificationStatus;
	}
	public void setPDSDeathNotificationStatus(ims.domain.lookups.LookupInstance pDSDeathNotificationStatus) {
		this.pDSDeathNotificationStatus = pDSDeathNotificationStatus;
	}

	public ims.core.domain.objects.PatientGP getPDSPatientGP() {
		return pDSPatientGP;
	}
	public void setPDSPatientGP(ims.core.domain.objects.PatientGP pDSPatientGP) {
		this.pDSPatientGP = pDSPatientGP;
	}

	public Boolean isPDSInterpreterRequired() {
		return pDSInterpreterRequired;
	}
	public void setPDSInterpreterRequired(Boolean pDSInterpreterRequired) {
		this.pDSInterpreterRequired = pDSInterpreterRequired;
	}

	public java.util.List getPDSrelatives() {
		if ( null == pDSrelatives ) {
			pDSrelatives = new java.util.ArrayList();
		}
		return pDSrelatives;
	}
	public void setPDSrelatives(java.util.List paramValue) {
		this.pDSrelatives = paramValue;
	}

	public ims.core.patient.domain.objects.PDSPatientUpdate getPDSPatientUpdate() {
		return pDSPatientUpdate;
	}
	public void setPDSPatientUpdate(ims.core.patient.domain.objects.PDSPatientUpdate pDSPatientUpdate) {
		this.pDSPatientUpdate = pDSPatientUpdate;
	}

	public java.util.List getPDSPatientGPHistory() {
		if ( null == pDSPatientGPHistory ) {
			pDSPatientGPHistory = new java.util.ArrayList();
		}
		return pDSPatientGPHistory;
	}
	public void setPDSPatientGPHistory(java.util.List paramValue) {
		this.pDSPatientGPHistory = paramValue;
	}

	public ims.core.resource.place.domain.objects.School getSchool() {
		return school;
	}
	public void setSchool(ims.core.resource.place.domain.objects.School school) {
		this.school = school;
	}

	public Boolean isOverseasVisitor() {
		return overseasVisitor;
	}
	public void setOverseasVisitor(Boolean overseasVisitor) {
		this.overseasVisitor = overseasVisitor;
	}

	public ims.domain.lookups.LookupInstance getOverseasClassification() {
		return overseasClassification;
	}
	public void setOverseasClassification(ims.domain.lookups.LookupInstance overseasClassification) {
		this.overseasClassification = overseasClassification;
	}

	public Boolean isDecoupled() {
		return decoupled;
	}
	public void setDecoupled(Boolean decoupled) {
		this.decoupled = decoupled;
	}

	public java.util.Date getPDSDateLastChecked() {
		return pDSDateLastChecked;
	}
	public void setPDSDateLastChecked(java.util.Date pDSDateLastChecked) {
		this.pDSDateLastChecked = pDSDateLastChecked;
	}

	public Boolean isHasLivedUK() {
		return hasLivedUK;
	}
	public void setHasLivedUK(Boolean hasLivedUK) {
		this.hasLivedUK = hasLivedUK;
	}

	public ims.domain.lookups.LookupInstance getPatientCategory() {
		return patientCategory;
	}
	public void setPatientCategory(ims.domain.lookups.LookupInstance patientCategory) {
		this.patientCategory = patientCategory;
	}

	public ims.domain.lookups.LookupInstance getSchoolOrCollege() {
		return schoolOrCollege;
	}
	public void setSchoolOrCollege(ims.domain.lookups.LookupInstance schoolOrCollege) {
		this.schoolOrCollege = schoolOrCollege;
	}

	public Boolean isIsChildInPublicCare() {
		return isChildInPublicCare;
	}
	public void setIsChildInPublicCare(Boolean isChildInPublicCare) {
		this.isChildInPublicCare = isChildInPublicCare;
	}

	public ims.domain.lookups.LookupInstance getPublicCareNeed() {
		return publicCareNeed;
	}
	public void setPublicCareNeed(ims.domain.lookups.LookupInstance publicCareNeed) {
		this.publicCareNeed = publicCareNeed;
	}

	public String getTxtOccupation() {
		return txtOccupation;
	}
	public void setTxtOccupation(String txtOccupation) {
		if ( null != txtOccupation && txtOccupation.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for txtOccupation. Tried to set value: "+
				txtOccupation);
		}
		this.txtOccupation = txtOccupation;
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
		
		auditStr.append("\r\n*name* :");
		if (name != null)
		{
			auditStr.append(toShortClassName(name));
				
		    auditStr.append(name.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sex* :");
		if (sex != null)
			auditStr.append(sex.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dob* :");
		auditStr.append(dob);
	    auditStr.append("; ");
		auditStr.append("\r\n*dod* :");
		auditStr.append(dod);
	    auditStr.append("; ");
		auditStr.append("\r\n*dodSource* :");
		if (dodSource != null)
			auditStr.append(dodSource.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*address* :");
		if (address != null)
		{
			auditStr.append(toShortClassName(address));
				
		    auditStr.append(address.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherNames* :");
		if (otherNames != null)
		{
		int i7=0;
		for (i7=0; i7<otherNames.size(); i7++)
		{
			if (i7 > 0)
				auditStr.append(",");
			ims.core.generic.domain.objects.PersonName obj = (ims.core.generic.domain.objects.PersonName)otherNames.get(i7);
		    if (obj != null)
			{
				if (i7 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*identifiers* :");
		if (identifiers != null)
		{
		int i8=0;
		for (i8=0; i8<identifiers.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.core.patient.domain.objects.PatientId obj = (ims.core.patient.domain.objects.PatientId)identifiers.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*addresses* :");
		if (addresses != null)
		{
		int i9=0;
		for (i9=0; i9<addresses.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.core.generic.domain.objects.Address obj = (ims.core.generic.domain.objects.Address)addresses.get(i9);
		    if (obj != null)
			{
				if (i9 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*correspondenceAddress* :");
		if (correspondenceAddress != null)
		{
			auditStr.append(toShortClassName(correspondenceAddress));
				
		    auditStr.append(correspondenceAddress.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*gp* :");
		if (gp != null)
		{
			auditStr.append(toShortClassName(gp));
				
		    auditStr.append(gp.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*gpSurgery* :");
		if (gpSurgery != null)
		{
			auditStr.append(toShortClassName(gpSurgery));
				
		    auditStr.append(gpSurgery.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*nok* :");
		if (nok != null)
		{
			auditStr.append(toShortClassName(nok));
				
		    auditStr.append(nok.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*nlr* :");
		if (nlr != null)
		{
			auditStr.append(toShortClassName(nlr));
				
		    auditStr.append(nlr.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*ethnicOrigin* :");
		if (ethnicOrigin != null)
			auditStr.append(ethnicOrigin.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*religion* :");
		if (religion != null)
			auditStr.append(religion.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*maritalStatus* :");
		if (maritalStatus != null)
			auditStr.append(maritalStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*occupation* :");
		if (occupation != null)
			auditStr.append(occupation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*language* :");
		if (language != null)
			auditStr.append(language.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*nationality* :");
		if (nationality != null)
			auditStr.append(nationality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*ward* :");
		if (ward != null)
		{
			auditStr.append(toShortClassName(ward));
				
		    auditStr.append(ward.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*nationalHealthCover* :");
		if (nationalHealthCover != null)
		{
			auditStr.append(toShortClassName(nationalHealthCover));
				
		    auditStr.append(nationalHealthCover.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*associatedPatient* :");
		if (associatedPatient != null)
		{
			auditStr.append(toShortClassName(associatedPatient));
				
		    auditStr.append(associatedPatient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*commChannels* :");
		if (commChannels != null)
		{
		int i25=0;
		for (i25=0; i25<commChannels.size(); i25++)
		{
			if (i25 > 0)
				auditStr.append(",");
			ims.core.generic.domain.objects.CommunicationChannel obj = (ims.core.generic.domain.objects.CommunicationChannel)commChannels.get(i25);
		    if (obj != null)
			{
				if (i25 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i25 > 0)
			auditStr.append("] " + i25);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isConfidential* :");
		auditStr.append(isConfidential);
	    auditStr.append("; ");
		auditStr.append("\r\n*confidentialReason* :");
		if (confidentialReason != null)
			auditStr.append(confidentialReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceOfInformation* :");
		if (sourceOfInformation != null)
			auditStr.append(sourceOfInformation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*clientParent* :");
		if (clientParent != null)
		{
			auditStr.append(toShortClassName(clientParent));
				
		    auditStr.append(clientParent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isChild* :");
		auditStr.append(isChild);
	    auditStr.append("; ");
		auditStr.append("\r\n*communityCare* :");
		if (communityCare != null)
		{
			auditStr.append(toShortClassName(communityCare));
				
		    auditStr.append(communityCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sCN* :");
		auditStr.append(sCN);
	    auditStr.append("; ");
		auditStr.append("\r\n*validationRequired* :");
		auditStr.append(validationRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientAlerts* :");
		if (patientAlerts != null)
		{
			java.util.Iterator it34 = patientAlerts.iterator();
			int i34=0;
			while (it34.hasNext())
			{
				if (i34 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientAlert obj = (ims.core.clinical.domain.objects.PatientAlert)it34.next();
		if (obj != null)
		{
		   if (i34 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i34++;
		}
		if (i34 > 0)
			auditStr.append("] " + i34);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*photo* :");
		if (photo != null)
		{
			auditStr.append(toShortClassName(photo));
				
		    auditStr.append(photo.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*saveComplete* :");
		auditStr.append(saveComplete);
	    auditStr.append("; ");
		auditStr.append("\r\n*isNewPatient* :");
		auditStr.append(isNewPatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*bedNumber* :");
		auditStr.append(bedNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*homeFolderLocation* :");
		if (homeFolderLocation != null)
			auditStr.append(homeFolderLocation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*prefCommLanguage* :");
		if (prefCommLanguage != null)
			auditStr.append(prefCommLanguage.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*timeOfDeath* :");
		auditStr.append(timeOfDeath);
	    auditStr.append("; ");
		auditStr.append("\r\n*practice* :");
		if (practice != null)
		{
			auditStr.append(toShortClassName(practice));
				
		    auditStr.append(practice.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*oCSNotification* :");
		if (oCSNotification != null)
		{
			auditStr.append(toShortClassName(oCSNotification));
				
		    auditStr.append(oCSNotification.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isQuickRegistrationPatient* :");
		auditStr.append(isQuickRegistrationPatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentMedicalInsurance* :");
		if (currentMedicalInsurance != null)
		{
			auditStr.append(toShortClassName(currentMedicalInsurance));
				
		    auditStr.append(currentMedicalInsurance.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*mRNStatus* :");
		if (mRNStatus != null)
			auditStr.append(mRNStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*copyPatientOnCorrespondence* :");
		auditStr.append(copyPatientOnCorrespondence);
	    auditStr.append("; ");
		auditStr.append("\r\n*copyPatientOnCorrespondenceDate* :");
		auditStr.append(copyPatientOnCorrespondenceDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentResponsibleConsultant* :");
		if (currentResponsibleConsultant != null)
		{
			auditStr.append(toShortClassName(currentResponsibleConsultant));
				
		    auditStr.append(currentResponsibleConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryIdValueUsed* :");
		auditStr.append(primaryIdValueUsed);
	    auditStr.append("; ");
		auditStr.append("\r\n*dementiaBreachDateTime* :");
		auditStr.append(dementiaBreachDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*dementiaWorklistStatus* :");
		if (dementiaWorklistStatus != null)
			auditStr.append(dementiaWorklistStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*alternativeContact* :");
		if (alternativeContact != null)
		{
			auditStr.append(toShortClassName(alternativeContact));
				
		    auditStr.append(alternativeContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*healthBoard* :");
		if (healthBoard != null)
			auditStr.append(healthBoard.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*hasScannedCaseNoteFolders* :");
		auditStr.append(hasScannedCaseNoteFolders);
	    auditStr.append("; ");
		auditStr.append("\r\n*supportNetworkFamily* :");
		if (supportNetworkFamily != null)
		{
			java.util.Iterator it56 = supportNetworkFamily.iterator();
			int i56=0;
			while (it56.hasNext())
			{
				if (i56 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.SupportNetworkFamily obj = (ims.core.clinical.domain.objects.SupportNetworkFamily)it56.next();
		if (obj != null)
		{
		   if (i56 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i56++;
		}
		if (i56 > 0)
			auditStr.append("] " + i56);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentCaseNoteLocation* :");
		if (currentCaseNoteLocation != null)
		{
			auditStr.append(toShortClassName(currentCaseNoteLocation));
				
		    auditStr.append(currentCaseNoteLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*caseNoteLastTransferDate* :");
		auditStr.append(caseNoteLastTransferDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeOfBirth* :");
		auditStr.append(timeOfBirth);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDSDeathNotificationStatus* :");
		if (pDSDeathNotificationStatus != null)
			auditStr.append(pDSDeathNotificationStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pDSPatientGP* :");
		if (pDSPatientGP != null)
		{
			auditStr.append(toShortClassName(pDSPatientGP));
				
		    auditStr.append(pDSPatientGP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pDSInterpreterRequired* :");
		auditStr.append(pDSInterpreterRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDSrelatives* :");
		if (pDSrelatives != null)
		{
		int i63=0;
		for (i63=0; i63<pDSrelatives.size(); i63++)
		{
			if (i63 > 0)
				auditStr.append(",");
			ims.core.patient.domain.objects.Relative obj = (ims.core.patient.domain.objects.Relative)pDSrelatives.get(i63);
		    if (obj != null)
			{
				if (i63 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i63 > 0)
			auditStr.append("] " + i63);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pDSPatientUpdate* :");
		if (pDSPatientUpdate != null)
		{
			auditStr.append(toShortClassName(pDSPatientUpdate));
				
		    auditStr.append(pDSPatientUpdate.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pDSPatientGPHistory* :");
		if (pDSPatientGPHistory != null)
		{
		int i65=0;
		for (i65=0; i65<pDSPatientGPHistory.size(); i65++)
		{
			if (i65 > 0)
				auditStr.append(",");
			ims.core.domain.objects.PatientGP obj = (ims.core.domain.objects.PatientGP)pDSPatientGPHistory.get(i65);
		    if (obj != null)
			{
				if (i65 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i65 > 0)
			auditStr.append("] " + i65);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*school* :");
		if (school != null)
		{
			auditStr.append(toShortClassName(school));
				
		    auditStr.append(school.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*overseasVisitor* :");
		auditStr.append(overseasVisitor);
	    auditStr.append("; ");
		auditStr.append("\r\n*overseasClassification* :");
		if (overseasClassification != null)
			auditStr.append(overseasClassification.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*decoupled* :");
		auditStr.append(decoupled);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDSDateLastChecked* :");
		auditStr.append(pDSDateLastChecked);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasLivedUK* :");
		auditStr.append(hasLivedUK);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientCategory* :");
		if (patientCategory != null)
			auditStr.append(patientCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*schoolOrCollege* :");
		if (schoolOrCollege != null)
			auditStr.append(schoolOrCollege.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isChildInPublicCare* :");
		auditStr.append(isChildInPublicCare);
	    auditStr.append("; ");
		auditStr.append("\r\n*publicCareNeed* :");
		if (publicCareNeed != null)
			auditStr.append(publicCareNeed.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*txtOccupation* :");
		auditStr.append(txtOccupation);
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
		
		String keyClassName = "Patient";
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
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(this.getName().toXMLString(domMap)); 	
			sb.append("</name>");		
		}
		if (this.getSex() != null)
		{
			sb.append("<sex>");
			sb.append(this.getSex().toXMLString()); 
			sb.append("</sex>");		
		}
		if (this.getDob() != null)
		{
			sb.append("<dob>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDob().toString()));
			sb.append("</dob>");		
		}
		if (this.getDod() != null)
		{
			sb.append("<dod>");
			sb.append(new ims.framework.utils.DateTime(this.getDod()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dod>");		
		}
		if (this.getDodSource() != null)
		{
			sb.append("<dodSource>");
			sb.append(this.getDodSource().toXMLString()); 
			sb.append("</dodSource>");		
		}
		if (this.getAddress() != null)
		{
			sb.append("<address>");
			sb.append(this.getAddress().toXMLString(domMap)); 	
			sb.append("</address>");		
		}
		if (this.getOtherNames() != null)
		{
			if (this.getOtherNames().size() > 0 )
			{
			sb.append("<otherNames>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOtherNames(), domMap));
			sb.append("</otherNames>");		
			}
		}
		if (this.getIdentifiers() != null)
		{
			if (this.getIdentifiers().size() > 0 )
			{
			sb.append("<identifiers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getIdentifiers(), domMap));
			sb.append("</identifiers>");		
			}
		}
		if (this.getAddresses() != null)
		{
			if (this.getAddresses().size() > 0 )
			{
			sb.append("<addresses>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAddresses(), domMap));
			sb.append("</addresses>");		
			}
		}
		if (this.getCorrespondenceAddress() != null)
		{
			sb.append("<correspondenceAddress>");
			sb.append(this.getCorrespondenceAddress().toXMLString(domMap)); 	
			sb.append("</correspondenceAddress>");		
		}
		if (this.getGp() != null)
		{
			sb.append("<gp>");
			sb.append(this.getGp().toXMLString(domMap)); 	
			sb.append("</gp>");		
		}
		if (this.getGpSurgery() != null)
		{
			sb.append("<gpSurgery>");
			sb.append(this.getGpSurgery().toXMLString(domMap)); 	
			sb.append("</gpSurgery>");		
		}
		if (this.getNok() != null)
		{
			sb.append("<nok>");
			sb.append(this.getNok().toXMLString(domMap)); 	
			sb.append("</nok>");		
		}
		if (this.getNlr() != null)
		{
			sb.append("<nlr>");
			sb.append(this.getNlr().toXMLString(domMap)); 	
			sb.append("</nlr>");		
		}
		if (this.getEthnicOrigin() != null)
		{
			sb.append("<ethnicOrigin>");
			sb.append(this.getEthnicOrigin().toXMLString()); 
			sb.append("</ethnicOrigin>");		
		}
		if (this.getReligion() != null)
		{
			sb.append("<religion>");
			sb.append(this.getReligion().toXMLString()); 
			sb.append("</religion>");		
		}
		if (this.getMaritalStatus() != null)
		{
			sb.append("<maritalStatus>");
			sb.append(this.getMaritalStatus().toXMLString()); 
			sb.append("</maritalStatus>");		
		}
		if (this.getOccupation() != null)
		{
			sb.append("<occupation>");
			sb.append(this.getOccupation().toXMLString()); 
			sb.append("</occupation>");		
		}
		if (this.getLanguage() != null)
		{
			sb.append("<language>");
			sb.append(this.getLanguage().toXMLString()); 
			sb.append("</language>");		
		}
		if (this.getNationality() != null)
		{
			sb.append("<nationality>");
			sb.append(this.getNationality().toXMLString()); 
			sb.append("</nationality>");		
		}
		if (this.getWard() != null)
		{
			sb.append("<ward>");
			sb.append(this.getWard().toXMLString(domMap)); 	
			sb.append("</ward>");		
		}
		if (this.getNationalHealthCover() != null)
		{
			sb.append("<nationalHealthCover>");
			sb.append(this.getNationalHealthCover().toXMLString(domMap)); 	
			sb.append("</nationalHealthCover>");		
		}
		if (this.getAssociatedPatient() != null)
		{
			sb.append("<associatedPatient>");
			sb.append(this.getAssociatedPatient().toXMLString(domMap)); 	
			sb.append("</associatedPatient>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getCommChannels() != null)
		{
			if (this.getCommChannels().size() > 0 )
			{
			sb.append("<commChannels>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCommChannels(), domMap));
			sb.append("</commChannels>");		
			}
		}
		if (this.isIsConfidential() != null)
		{
			sb.append("<isConfidential>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsConfidential().toString()));
			sb.append("</isConfidential>");		
		}
		if (this.getConfidentialReason() != null)
		{
			sb.append("<confidentialReason>");
			sb.append(this.getConfidentialReason().toXMLString()); 
			sb.append("</confidentialReason>");		
		}
		if (this.getSourceOfInformation() != null)
		{
			sb.append("<sourceOfInformation>");
			sb.append(this.getSourceOfInformation().toXMLString()); 
			sb.append("</sourceOfInformation>");		
		}
		if (this.getClientParent() != null)
		{
			sb.append("<clientParent>");
			sb.append(this.getClientParent().toXMLString(domMap)); 	
			sb.append("</clientParent>");		
		}
		if (this.isIsChild() != null)
		{
			sb.append("<isChild>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsChild().toString()));
			sb.append("</isChild>");		
		}
		if (this.getCommunityCare() != null)
		{
			sb.append("<communityCare>");
			sb.append(this.getCommunityCare().toXMLString(domMap)); 	
			sb.append("</communityCare>");		
		}
		if (this.getSCN() != null)
		{
			sb.append("<sCN>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSCN().toString()));
			sb.append("</sCN>");		
		}
		if (this.isValidationRequired() != null)
		{
			sb.append("<validationRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isValidationRequired().toString()));
			sb.append("</validationRequired>");		
		}
		if (this.getPatientAlerts() != null)
		{
			if (this.getPatientAlerts().size() > 0 )
			{
			sb.append("<patientAlerts>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPatientAlerts(), domMap));
			sb.append("</patientAlerts>");		
			}
		}
		if (this.getPhoto() != null)
		{
			sb.append("<photo>");
			sb.append(this.getPhoto().toXMLString(domMap)); 	
			sb.append("</photo>");		
		}
		if (this.isSaveComplete() != null)
		{
			sb.append("<saveComplete>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSaveComplete().toString()));
			sb.append("</saveComplete>");		
		}
		if (this.isIsNewPatient() != null)
		{
			sb.append("<isNewPatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsNewPatient().toString()));
			sb.append("</isNewPatient>");		
		}
		if (this.getBedNumber() != null)
		{
			sb.append("<bedNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBedNumber().toString()));
			sb.append("</bedNumber>");		
		}
		if (this.getHomeFolderLocation() != null)
		{
			sb.append("<homeFolderLocation>");
			sb.append(this.getHomeFolderLocation().toXMLString()); 
			sb.append("</homeFolderLocation>");		
		}
		if (this.getPrefCommLanguage() != null)
		{
			sb.append("<prefCommLanguage>");
			sb.append(this.getPrefCommLanguage().toXMLString()); 
			sb.append("</prefCommLanguage>");		
		}
		if (this.getTimeOfDeath() != null)
		{
			sb.append("<timeOfDeath>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeOfDeath().toString()));
			sb.append("</timeOfDeath>");		
		}
		if (this.getPractice() != null)
		{
			sb.append("<practice>");
			sb.append(this.getPractice().toXMLString(domMap)); 	
			sb.append("</practice>");		
		}
		if (this.getOCSNotification() != null)
		{
			sb.append("<oCSNotification>");
			sb.append(this.getOCSNotification().toXMLString(domMap)); 	
			sb.append("</oCSNotification>");		
		}
		if (this.isIsQuickRegistrationPatient() != null)
		{
			sb.append("<isQuickRegistrationPatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsQuickRegistrationPatient().toString()));
			sb.append("</isQuickRegistrationPatient>");		
		}
		if (this.getCurrentMedicalInsurance() != null)
		{
			sb.append("<currentMedicalInsurance>");
			sb.append(this.getCurrentMedicalInsurance().toXMLString(domMap)); 	
			sb.append("</currentMedicalInsurance>");		
		}
		if (this.getMRNStatus() != null)
		{
			sb.append("<mRNStatus>");
			sb.append(this.getMRNStatus().toXMLString()); 
			sb.append("</mRNStatus>");		
		}
		if (this.isCopyPatientOnCorrespondence() != null)
		{
			sb.append("<copyPatientOnCorrespondence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCopyPatientOnCorrespondence().toString()));
			sb.append("</copyPatientOnCorrespondence>");		
		}
		if (this.getCopyPatientOnCorrespondenceDate() != null)
		{
			sb.append("<copyPatientOnCorrespondenceDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCopyPatientOnCorrespondenceDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</copyPatientOnCorrespondenceDate>");		
		}
		if (this.getCurrentResponsibleConsultant() != null)
		{
			sb.append("<currentResponsibleConsultant>");
			sb.append(this.getCurrentResponsibleConsultant().toXMLString(domMap)); 	
			sb.append("</currentResponsibleConsultant>");		
		}
		if (this.getPrimaryIdValueUsed() != null)
		{
			sb.append("<primaryIdValueUsed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPrimaryIdValueUsed().toString()));
			sb.append("</primaryIdValueUsed>");		
		}
		if (this.getDementiaBreachDateTime() != null)
		{
			sb.append("<dementiaBreachDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getDementiaBreachDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dementiaBreachDateTime>");		
		}
		if (this.getDementiaWorklistStatus() != null)
		{
			sb.append("<dementiaWorklistStatus>");
			sb.append(this.getDementiaWorklistStatus().toXMLString()); 
			sb.append("</dementiaWorklistStatus>");		
		}
		if (this.getAlternativeContact() != null)
		{
			sb.append("<alternativeContact>");
			sb.append(this.getAlternativeContact().toXMLString(domMap)); 	
			sb.append("</alternativeContact>");		
		}
		if (this.getHealthBoard() != null)
		{
			sb.append("<healthBoard>");
			sb.append(this.getHealthBoard().toXMLString()); 
			sb.append("</healthBoard>");		
		}
		if (this.isHasScannedCaseNoteFolders() != null)
		{
			sb.append("<hasScannedCaseNoteFolders>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasScannedCaseNoteFolders().toString()));
			sb.append("</hasScannedCaseNoteFolders>");		
		}
		if (this.getSupportNetworkFamily() != null)
		{
			if (this.getSupportNetworkFamily().size() > 0 )
			{
			sb.append("<supportNetworkFamily>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSupportNetworkFamily(), domMap));
			sb.append("</supportNetworkFamily>");		
			}
		}
		if (this.getCurrentCaseNoteLocation() != null)
		{
			sb.append("<currentCaseNoteLocation>");
			sb.append(this.getCurrentCaseNoteLocation().toXMLString(domMap)); 	
			sb.append("</currentCaseNoteLocation>");		
		}
		if (this.getCaseNoteLastTransferDate() != null)
		{
			sb.append("<caseNoteLastTransferDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCaseNoteLastTransferDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</caseNoteLastTransferDate>");		
		}
		if (this.getTimeOfBirth() != null)
		{
			sb.append("<timeOfBirth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeOfBirth().toString()));
			sb.append("</timeOfBirth>");		
		}
		if (this.getPDSDeathNotificationStatus() != null)
		{
			sb.append("<pDSDeathNotificationStatus>");
			sb.append(this.getPDSDeathNotificationStatus().toXMLString()); 
			sb.append("</pDSDeathNotificationStatus>");		
		}
		if (this.getPDSPatientGP() != null)
		{
			sb.append("<pDSPatientGP>");
			sb.append(this.getPDSPatientGP().toXMLString(domMap)); 	
			sb.append("</pDSPatientGP>");		
		}
		if (this.isPDSInterpreterRequired() != null)
		{
			sb.append("<pDSInterpreterRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPDSInterpreterRequired().toString()));
			sb.append("</pDSInterpreterRequired>");		
		}
		if (this.getPDSrelatives() != null)
		{
			if (this.getPDSrelatives().size() > 0 )
			{
			sb.append("<pDSrelatives>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPDSrelatives(), domMap));
			sb.append("</pDSrelatives>");		
			}
		}
		if (this.getPDSPatientUpdate() != null)
		{
			sb.append("<pDSPatientUpdate>");
			sb.append(this.getPDSPatientUpdate().toXMLString(domMap)); 	
			sb.append("</pDSPatientUpdate>");		
		}
		if (this.getPDSPatientGPHistory() != null)
		{
			if (this.getPDSPatientGPHistory().size() > 0 )
			{
			sb.append("<pDSPatientGPHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPDSPatientGPHistory(), domMap));
			sb.append("</pDSPatientGPHistory>");		
			}
		}
		if (this.getSchool() != null)
		{
			sb.append("<school>");
			sb.append(this.getSchool().toXMLString(domMap)); 	
			sb.append("</school>");		
		}
		if (this.isOverseasVisitor() != null)
		{
			sb.append("<overseasVisitor>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isOverseasVisitor().toString()));
			sb.append("</overseasVisitor>");		
		}
		if (this.getOverseasClassification() != null)
		{
			sb.append("<overseasClassification>");
			sb.append(this.getOverseasClassification().toXMLString()); 
			sb.append("</overseasClassification>");		
		}
		if (this.isDecoupled() != null)
		{
			sb.append("<decoupled>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDecoupled().toString()));
			sb.append("</decoupled>");		
		}
		if (this.getPDSDateLastChecked() != null)
		{
			sb.append("<pDSDateLastChecked>");
			sb.append(new ims.framework.utils.DateTime(this.getPDSDateLastChecked()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</pDSDateLastChecked>");		
		}
		if (this.isHasLivedUK() != null)
		{
			sb.append("<hasLivedUK>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasLivedUK().toString()));
			sb.append("</hasLivedUK>");		
		}
		if (this.getPatientCategory() != null)
		{
			sb.append("<patientCategory>");
			sb.append(this.getPatientCategory().toXMLString()); 
			sb.append("</patientCategory>");		
		}
		if (this.getSchoolOrCollege() != null)
		{
			sb.append("<schoolOrCollege>");
			sb.append(this.getSchoolOrCollege().toXMLString()); 
			sb.append("</schoolOrCollege>");		
		}
		if (this.isIsChildInPublicCare() != null)
		{
			sb.append("<isChildInPublicCare>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsChildInPublicCare().toString()));
			sb.append("</isChildInPublicCare>");		
		}
		if (this.getPublicCareNeed() != null)
		{
			sb.append("<publicCareNeed>");
			sb.append(this.getPublicCareNeed().toXMLString()); 
			sb.append("</publicCareNeed>");		
		}
		if (this.getTxtOccupation() != null)
		{
			sb.append("<txtOccupation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTxtOccupation().toString()));
			sb.append("</txtOccupation>");		
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
			Patient domainObject = getPatientfromXML(itemEl, factory, domMap);

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
			Patient domainObject = getPatientfromXML(itemEl, factory, domMap);

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
		
	public static Patient getPatientfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Patient getPatientfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Patient.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Patient.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Patient class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Patient)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Patient.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Patient ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Patient)factory.getImportedDomainObject(Patient.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Patient();
		}
		String keyClassName = "Patient";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Patient)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Patient obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setName(ims.core.generic.domain.objects.PersonName.getPersonNamefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sex");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSex(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dob");
		if(fldEl != null)
		{	
    		obj.setDob(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dod");
		if(fldEl != null)
		{	
    		obj.setDod(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dodSource");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDodSource(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("address");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAddress(ims.core.generic.domain.objects.Address.getAddressfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("otherNames");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOtherNames(ims.core.generic.domain.objects.PersonName.fromListXMLString(fldEl, factory, obj.getOtherNames(), domMap));
		}
		fldEl = el.element("identifiers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setIdentifiers(ims.core.patient.domain.objects.PatientId.fromListXMLString(fldEl, factory, obj.getIdentifiers(), domMap));
		}
		fldEl = el.element("addresses");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAddresses(ims.core.generic.domain.objects.Address.fromListXMLString(fldEl, factory, obj.getAddresses(), domMap));
		}
		fldEl = el.element("correspondenceAddress");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCorrespondenceAddress(ims.core.generic.domain.objects.Address.getAddressfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("gp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGp(ims.core.resource.people.domain.objects.Gp.getGpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("gpSurgery");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGpSurgery(ims.core.resource.place.domain.objects.LocSite.getLocSitefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("nok");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNok(ims.core.patient.domain.objects.NextOfKin.getNextOfKinfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("nlr");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNlr(ims.core.patient.domain.objects.NearestLegalRel.getNearestLegalRelfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("ethnicOrigin");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEthnicOrigin(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("religion");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReligion(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("maritalStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMaritalStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("occupation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOccupation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("language");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLanguage(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("nationality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNationality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("ward");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("nationalHealthCover");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNationalHealthCover(ims.core.patient.domain.objects.NationalHealthCover.getNationalHealthCoverfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("associatedPatient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssociatedPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("commChannels");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCommChannels(ims.core.generic.domain.objects.CommunicationChannel.fromListXMLString(fldEl, factory, obj.getCommChannels(), domMap));
		}
		fldEl = el.element("isConfidential");
		if(fldEl != null)
		{	
    		obj.setIsConfidential(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("confidentialReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConfidentialReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sourceOfInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSourceOfInformation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("clientParent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClientParent(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isChild");
		if(fldEl != null)
		{	
    		obj.setIsChild(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("communityCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCommunityCare(ims.core.patient.domain.objects.CommunityCareDetail.getCommunityCareDetailfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sCN");
		if(fldEl != null)
		{	
    		obj.setSCN(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("validationRequired");
		if(fldEl != null)
		{	
    		obj.setValidationRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientAlerts");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPatientAlerts(ims.core.clinical.domain.objects.PatientAlert.fromSetXMLString(fldEl, factory, obj.getPatientAlerts(), domMap));
		}
		fldEl = el.element("photo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPhoto(ims.core.configuration.domain.objects.AppDBImage.getAppDBImagefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("saveComplete");
		if(fldEl != null)
		{	
    		obj.setSaveComplete(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isNewPatient");
		if(fldEl != null)
		{	
    		obj.setIsNewPatient(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bedNumber");
		if(fldEl != null)
		{	
    		obj.setBedNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("homeFolderLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHomeFolderLocation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("prefCommLanguage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrefCommLanguage(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("timeOfDeath");
		if(fldEl != null)
		{	
    		obj.setTimeOfDeath(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("practice");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPractice(ims.core.resource.place.domain.objects.Organisation.getOrganisationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("oCSNotification");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOCSNotification(ims.core.clinical.domain.objects.PatientNotification.getPatientNotificationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isQuickRegistrationPatient");
		if(fldEl != null)
		{	
    		obj.setIsQuickRegistrationPatient(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("currentMedicalInsurance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentMedicalInsurance(ims.core.clinical.domain.objects.PatientMedicalInsurance.getPatientMedicalInsurancefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("mRNStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMRNStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("copyPatientOnCorrespondence");
		if(fldEl != null)
		{	
    		obj.setCopyPatientOnCorrespondence(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("copyPatientOnCorrespondenceDate");
		if(fldEl != null)
		{	
    		obj.setCopyPatientOnCorrespondenceDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("currentResponsibleConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentResponsibleConsultant(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("primaryIdValueUsed");
		if(fldEl != null)
		{	
    		obj.setPrimaryIdValueUsed(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dementiaBreachDateTime");
		if(fldEl != null)
		{	
    		obj.setDementiaBreachDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dementiaWorklistStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDementiaWorklistStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("alternativeContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAlternativeContact(ims.core.patient.domain.objects.PatientContactPreference.getPatientContactPreferencefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("healthBoard");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHealthBoard(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("hasScannedCaseNoteFolders");
		if(fldEl != null)
		{	
    		obj.setHasScannedCaseNoteFolders(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("supportNetworkFamily");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSupportNetworkFamily(ims.core.clinical.domain.objects.SupportNetworkFamily.fromSetXMLString(fldEl, factory, obj.getSupportNetworkFamily(), domMap));
		}
		fldEl = el.element("currentCaseNoteLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentCaseNoteLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("caseNoteLastTransferDate");
		if(fldEl != null)
		{	
    		obj.setCaseNoteLastTransferDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("timeOfBirth");
		if(fldEl != null)
		{	
    		obj.setTimeOfBirth(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDSDeathNotificationStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPDSDeathNotificationStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pDSPatientGP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPDSPatientGP(ims.core.domain.objects.PatientGP.getPatientGPfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pDSInterpreterRequired");
		if(fldEl != null)
		{	
    		obj.setPDSInterpreterRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDSrelatives");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPDSrelatives(ims.core.patient.domain.objects.Relative.fromListXMLString(fldEl, factory, obj.getPDSrelatives(), domMap));
		}
		fldEl = el.element("pDSPatientUpdate");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPDSPatientUpdate(ims.core.patient.domain.objects.PDSPatientUpdate.getPDSPatientUpdatefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pDSPatientGPHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPDSPatientGPHistory(ims.core.domain.objects.PatientGP.fromListXMLString(fldEl, factory, obj.getPDSPatientGPHistory(), domMap));
		}
		fldEl = el.element("school");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSchool(ims.core.resource.place.domain.objects.School.getSchoolfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("overseasVisitor");
		if(fldEl != null)
		{	
    		obj.setOverseasVisitor(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("overseasClassification");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOverseasClassification(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("decoupled");
		if(fldEl != null)
		{	
    		obj.setDecoupled(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDSDateLastChecked");
		if(fldEl != null)
		{	
    		obj.setPDSDateLastChecked(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("hasLivedUK");
		if(fldEl != null)
		{	
    		obj.setHasLivedUK(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("schoolOrCollege");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSchoolOrCollege(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isChildInPublicCare");
		if(fldEl != null)
		{	
    		obj.setIsChildInPublicCare(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("publicCareNeed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPublicCareNeed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("txtOccupation");
		if(fldEl != null)
		{	
    		obj.setTxtOccupation(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "otherNames"
		, "identifiers"
		, "addresses"
		, "commChannels"
		, "patientAlerts"
		, "supportNetworkFamily"
		, "pDSrelatives"
		, "pDSPatientGPHistory"
		};
	}

	/**
	getMergedMessage : returns a string containing the specifics of which patient this patient was merged from
	*/
public String getMergedMessage(Patient patient)
{
	StringBuffer sbMessage = new StringBuffer();
	if(patient != null)
	{
		if(patient.getName() != null)
		{
			sbMessage.append(patient.getName().getForename() != null ? patient.getName().getForename()+" ":"" + " ");   //wdev-13104  //WDEV-22238
			sbMessage.append(patient.getName().getSurname());
			if (patient.getDob() != null) 
				sbMessage.append(" with DOB: " + new ims.framework.utils.PartialDate(patient.getDob()).toString());   //WDEV-22238
		}
		if(this.name != null)
		{
			sbMessage.append(" has been merged with \r");
			sbMessage.append(this.name.getForename() != null ? this.name.getForename()+" ":"" + " ");				//wdev-13104  //WDEV-22238	 
			sbMessage.append(this.name.getSurname());
			if (this.dob != null) 
				sbMessage.append(" with DOB: " + new ims.framework.utils.PartialDate(this.dob).toString());   //WDEV-22238
		}
		return sbMessage.toString();
	}	
	return "";
}

	/**
	getAgeInYearsOn
	*/
	/*
	 * Calculate patient age on a particular date if dob is not set returns null
	 */
	public Integer getAgeInYearsOn(java.util.Date date)
	{
		if (dob != null&&date!=null)
		{		
			int patAge = 0;
			java.util.Date endDate = null;
			if(dod!=null)
			{
				endDate=dod.after(date)?date:dod;
			}
			else
			{
				endDate=date;
			}
			patAge = new ims.framework.utils.Age(new ims.framework.utils.Date(new ims.framework.utils.PartialDate(this.dob).toDate()),new ims.framework.utils.Date( endDate)).getYears();
			return new Integer(patAge); 
		}
		return null; // No Age
	}
	


	/**
	isPaediatricOn
	*/
	/**
	 * Checks if a patient is below the Paediatric age on a particular date
	 * if no DOB recorded for patient returns false
	 * @param date
	 * @return
	 */
	public Boolean isPaediatricOn(java.util.Date date)
	{
		Integer age = getAgeInYearsOn(date);
		if (age!=null &&age.compareTo(Integer.valueOf(ims.configuration.gen.ConfigFlag.GEN.PAEDIATRIC_AGE.getValue()))<=0)
			return true;
		else
			return false;
	}



	public void createHCPAlert(ims.domain.DomainFactory factory, ims.rules.engine.RulesRuntimeEngine engine, String message, int alertType)
	{	
// do nothing
	}

	public void notifyAdministors(ims.domain.DomainFactory factory, ims.rules.engine.RulesRuntimeEngine engine)
	{	
// do nothing
	}

	public void triggerDemographicsMessage(ims.domain.DomainFactory factory, ims.rules.engine.RulesRuntimeEngine engine)
	{	
		// Lookup IDs
		try {
        final int QueueType_DEMOGRAPHICFEED = -1851;
        final int MsgEventType_A28 = -1852;
        final int MsgEventType_A31 = -1853;
        final int MsgEventType_A40 = -1854;
        final int MsgEventType_A47 = -2551;

        final int MRN_PSEUDO = -2539;
        final int MRN_NONE = -2540;
		
		if (getId()==null||getName()==null||"DUMMYICABSURNAME".equals( getName().getUpperSurname()))
		{
			return;
		}
			java.sql.Connection conn = factory.getJdbcConnection();
			String sqlProviderSystems=null;
			if(getSystemInformation()!=null&&"HL7Inbound".equals(getSystemInformation().getLastUpdateUser()))
			{
				sqlProviderSystems = "select id from core_providersystem_configitem where id in(select id from core_providersystem_configitem	where (propertyna='SendDeomgraphicFeed' and propertyva='TRUE')) and propertyna='forwardHL7DemographicUpdates' and propertyva='TRUE'";
			}
			else
			{
				sqlProviderSystems = "select core_providersystem.id from core_providersystem   join core_providersystem_configitem as ci   on core_providersystem.id = ci.id and ci.propertyna='SendDeomgraphicFeed' and propertyva='TRUE'";
			}
			java.sql.PreparedStatement preStPS = conn.prepareStatement(sqlProviderSystems);
			java.sql.ResultSet rs = preStPS.executeQuery();
			while (rs.next())
			{
				int providerSystemId=rs.getInt(1);
				ims.core.admin.domain.objects.ProviderSystem psDom = (ims.core.admin.domain.objects.ProviderSystem)factory.getDomainObject(ims.core.admin.domain.objects.ProviderSystem.class, providerSystemId);
				
				long msgCount=0;
				String sql = "select count(id) from adto_demographicsmq where patient=? and providersy=? and wasprocess is null and wasdiscard is null";
				java.sql.PreparedStatement preSt = conn.prepareStatement(sql);
				preSt.setInt(1, getId());
				preSt.setInt(2, providerSystemId);
				java.sql.ResultSet rs1 = preSt.executeQuery();
				if (rs1.next())
				{
					msgCount = new Long(rs1.getLong(1));
				}
				if (msgCount>0) //more than one unprocessed message already there 
				{
					continue; //skip to the next provider system
				}
				
				String oldPatientSql="select count(id) from adto_demographicsmq where patient=? and providersy=? and wasprocess =1";
				java.sql.PreparedStatement oldPtCount = conn.prepareStatement(oldPatientSql);
				oldPtCount.setInt(1, getId());
				oldPtCount.setInt(2, providerSystemId);
				java.sql.ResultSet rs2 = oldPtCount.executeQuery();
				long oldMsgCount=0;
				if (rs2.next())
				{
					oldMsgCount = new Long(rs2.getLong(1));
				}
				ims.hl7adtout.domain.objects.DemographicsMessageQueue msg= new ims.hl7adtout.domain.objects.DemographicsMessageQueue();
				msg.setPatient(this);
				msg.setProviderSystem(psDom);
				
				msg.setQueueType(factory.getLookupInstance(QueueType_DEMOGRAPHICFEED) );// QueueType.DEMOGRAPHICFEED));
				if (oldMsgCount==0)
				{
					msg.setMsgType(factory.getLookupInstance(MsgEventType_A28));
				}
				else if(this.getMRNStatus()!=null&&(this.getMRNStatus().getId()==MRN_PSEUDO||this.getMRNStatus().getId()==MRN_NONE))
				{
					msg.setMsgType(factory.getLookupInstance(MsgEventType_A47));
				}
				else 
				{
					msg.setMsgType(factory.getLookupInstance(MsgEventType_A31));
				}
					factory.save(msg);	
			}
		}catch (Exception e)
		{
			throw new RuntimeException (e); 
		}

	}

	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Sex = "sex";
		public static final String Dob = "dob";
		public static final String Dod = "dod";
		public static final String DodSource = "dodSource";
		public static final String Address = "address";
		public static final String OtherNames = "otherNames";
		public static final String Identifiers = "identifiers";
		public static final String Addresses = "addresses";
		public static final String CorrespondenceAddress = "correspondenceAddress";
		public static final String Gp = "gp";
		public static final String GpSurgery = "gpSurgery";
		public static final String Nok = "nok";
		public static final String Nlr = "nlr";
		public static final String EthnicOrigin = "ethnicOrigin";
		public static final String Religion = "religion";
		public static final String MaritalStatus = "maritalStatus";
		public static final String Occupation = "occupation";
		public static final String Language = "language";
		public static final String Nationality = "nationality";
		public static final String Ward = "ward";
		public static final String NationalHealthCover = "nationalHealthCover";
		public static final String AssociatedPatient = "associatedPatient";
		public static final String IsActive = "isActive";
		public static final String CommChannels = "commChannels";
		public static final String IsConfidential = "isConfidential";
		public static final String ConfidentialReason = "confidentialReason";
		public static final String SourceOfInformation = "sourceOfInformation";
		public static final String ClientParent = "clientParent";
		public static final String IsChild = "isChild";
		public static final String CommunityCare = "communityCare";
		public static final String SCN = "sCN";
		public static final String ValidationRequired = "validationRequired";
		public static final String PatientAlerts = "patientAlerts";
		public static final String Photo = "photo";
		public static final String SaveComplete = "saveComplete";
		public static final String IsNewPatient = "isNewPatient";
		public static final String BedNumber = "bedNumber";
		public static final String HomeFolderLocation = "homeFolderLocation";
		public static final String PrefCommLanguage = "prefCommLanguage";
		public static final String TimeOfDeath = "timeOfDeath";
		public static final String Practice = "practice";
		public static final String OCSNotification = "oCSNotification";
		public static final String IsQuickRegistrationPatient = "isQuickRegistrationPatient";
		public static final String CurrentMedicalInsurance = "currentMedicalInsurance";
		public static final String MRNStatus = "mRNStatus";
		public static final String CopyPatientOnCorrespondence = "copyPatientOnCorrespondence";
		public static final String CopyPatientOnCorrespondenceDate = "copyPatientOnCorrespondenceDate";
		public static final String CurrentResponsibleConsultant = "currentResponsibleConsultant";
		public static final String PrimaryIdValueUsed = "primaryIdValueUsed";
		public static final String DementiaBreachDateTime = "dementiaBreachDateTime";
		public static final String DementiaWorklistStatus = "dementiaWorklistStatus";
		public static final String AlternativeContact = "alternativeContact";
		public static final String HealthBoard = "healthBoard";
		public static final String HasScannedCaseNoteFolders = "hasScannedCaseNoteFolders";
		public static final String SupportNetworkFamily = "supportNetworkFamily";
		public static final String CurrentCaseNoteLocation = "currentCaseNoteLocation";
		public static final String CaseNoteLastTransferDate = "caseNoteLastTransferDate";
		public static final String TimeOfBirth = "timeOfBirth";
		public static final String PDSDeathNotificationStatus = "pDSDeathNotificationStatus";
		public static final String PDSPatientGP = "pDSPatientGP";
		public static final String PDSInterpreterRequired = "pDSInterpreterRequired";
		public static final String PDSrelatives = "pDSrelatives";
		public static final String PDSPatientUpdate = "pDSPatientUpdate";
		public static final String PDSPatientGPHistory = "pDSPatientGPHistory";
		public static final String School = "school";
		public static final String OverseasVisitor = "overseasVisitor";
		public static final String OverseasClassification = "overseasClassification";
		public static final String Decoupled = "decoupled";
		public static final String PDSDateLastChecked = "pDSDateLastChecked";
		public static final String HasLivedUK = "hasLivedUK";
		public static final String PatientCategory = "patientCategory";
		public static final String SchoolOrCollege = "schoolOrCollege";
		public static final String IsChildInPublicCare = "isChildInPublicCare";
		public static final String PublicCareNeed = "publicCareNeed";
		public static final String TxtOccupation = "txtOccupation";
	}
}

