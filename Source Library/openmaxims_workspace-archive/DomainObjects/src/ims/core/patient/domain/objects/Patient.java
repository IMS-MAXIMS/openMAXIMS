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
	/** Patient Medical Insurance Details */
	private ims.core.patient.domain.objects.Insurance insurance;
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

	public ims.core.patient.domain.objects.Insurance getInsurance() {
		return insurance;
	}
	public void setInsurance(ims.core.patient.domain.objects.Insurance insurance) {
		this.insurance = insurance;
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
		auditStr.append("\r\n*insurance* :");
		if (insurance != null)
		{
			auditStr.append(toShortClassName(insurance));
				
		    auditStr.append(insurance.toString());
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
		if (this.getInsurance() != null)
		{
			sb.append("<insurance>");
			sb.append(this.getInsurance().toXMLString(domMap)); 	
			sb.append("</insurance>");		
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
		fldEl = el.element("insurance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInsurance(ims.core.patient.domain.objects.Insurance.getInsurancefromXML(fldEl, factory, domMap)); 
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
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "otherNames"
		, "identifiers"
		, "addresses"
		, "commChannels"
		, "patientAlerts"
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
			sbMessage.append(patient.getName().getForename() != null ? patient.getName().getForename():"" + " ");    //wdev-13104
			sbMessage.append(patient.getName().getSurname());
			if (patient.getDob() != null) 
				sbMessage.append(" " + new ims.framework.utils.PartialDate(patient.getDob()).toString());   
		}
		if(this.name != null)
		{
			sbMessage.append(" has been merged with \r");
			sbMessage.append(this.name.getForename() != null ? this.name.getForename():"" + " ");					//wdev-13104	
			sbMessage.append(this.name.getSurname());
			if (this.dob != null) 
				sbMessage.append(" " + new ims.framework.utils.PartialDate(this.dob).toString());   
		}
		return sbMessage.toString();
	}	
	return "";
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
		public static final String Insurance = "insurance";
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
	}
}

