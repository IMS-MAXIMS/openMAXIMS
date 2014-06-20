/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class PatientElectiveList extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100020;
	private static final long serialVersionUID = 1014100020L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ElectiveList */
	private ims.core.configuration.domain.objects.ElectiveListConfiguration electiveList;
	/** ElectiveListStatus */
	private ims.RefMan.domain.objects.ElectiveListStatus electiveListStatus;
	/** ElectiveListStatus History
	  * Collection of ims.RefMan.domain.objects.ElectiveListStatus.
	  */
	private java.util.List electiveListStatusHistory;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Referral */
	private ims.RefMan.domain.objects.CatsReferral referral;
	/** EpisodeOfCare */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** Ward */
	private ims.core.resource.place.domain.objects.Location ward;
	/** Bed */
	private String bed;
	/** Consultant */
	private ims.core.resource.people.domain.objects.Hcp consultant;
	/** DateOnList */
	private java.util.Date dateOnList;
	/** OriginalDecisionDate */
	private java.util.Date originalDecisionDate;
	/** Elective List Reason */
	private ims.domain.lookups.LookupInstance electiveListReason;
	/** PatientStatus */
	private ims.domain.lookups.LookupInstance patientStatus;
	/** ElectiveAdmissionType */
	private ims.domain.lookups.LookupInstance electiveAdmissionType;
	/** IntendedManagement */
	private ims.domain.lookups.LookupInstance intendedManagement;
	/** AnticipatedStay */
	private Integer anticipatedStay;
	/** AvailableAtShortNotice */
	private Boolean availableAtShortNotice;
	/** AvailableAtShortNoticePeriod (Days) */
	private Integer availableAtShortNoticePeriod;
	/** Priority */
	private ims.domain.lookups.LookupInstance priority;
	/** Suspensions
	  * Collection of ims.RefMan.domain.objects.SuspensionDetailsForPatientElectiveList.
	  */
	private java.util.List suspensions;
	/** CurrentSuspensionEndDate */
	private java.util.Date currentSuspensionEndDate;
	/** OperativeProcedureStatus */
	private Boolean operativeProcedureStatus;
	/** PrimaryProcedure */
	private ims.core.clinical.domain.objects.Procedure primaryProcedure;
	/** ProcedureDescription */
	private String procedureDescription;
	/** OtherProcedures
	  * Collection of ims.core.clinical.domain.objects.Procedure.
	  */
	private java.util.List otherProcedures;
	/** RequiresTCIBy */
	private java.util.Date requiresTCIBy;
	/** TCIDetails */
	private ims.RefMan.domain.objects.TCIForPatientElectiveList tCIDetails;
	/** TCIHistory
	  * Collection of ims.RefMan.domain.objects.TCIForPatientElectiveList.
	  */
	private java.util.List tCIHistory;
	/** InterpretatorRequired */
	private Boolean interpretatorRequired;
	/** Language */
	private ims.domain.lookups.LookupInstance language;
	/** TransportRequired */
	private Boolean transportRequired;
	/** Transport */
	private ims.domain.lookups.LookupInstance transport;
	/** SpecialRequirements */
	private Boolean specialRequirements;
	/** SpecialRequirementsDetails */
	private String specialRequirementsDetails;
	/** PreAdmissionRequired */
	private Boolean preAdmissionRequired;
	/** Notes
	  * Collection of ims.RefMan.domain.objects.NotesForPatientElectiveList.
	  */
	private java.util.Set notes;
	/** EROD */
	private ims.RefMan.domain.objects.ReferralEROD eROD;
	/** EROD history
	  * Collection of ims.RefMan.domain.objects.ReferralEROD.
	  */
	private java.util.List eRODHistory;
	/** PathwayClock */
	private ims.pathways.domain.objects.PathwayClock pathwayClock;
	/** TCICancelledByProvider - Once set to TRUE it should never be unset */
	private Boolean tCICancelledByProvider;
	/** Reviews
	  * Collection of ims.RefMan.domain.objects.ReviewPatientElectiveList.
	  */
	private java.util.Set reviews;
	/** Admissions
	  * Collection of ims.core.admin.pas.domain.objects.AdmissionDetail.
	  */
	private java.util.List admissions;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientElectiveList (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientElectiveList ()
    {
    	super();
    }
    public PatientElectiveList (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.PatientElectiveList.class;
	}


	public ims.core.configuration.domain.objects.ElectiveListConfiguration getElectiveList() {
		return electiveList;
	}
	public void setElectiveList(ims.core.configuration.domain.objects.ElectiveListConfiguration electiveList) {
		this.electiveList = electiveList;
	}

	public ims.RefMan.domain.objects.ElectiveListStatus getElectiveListStatus() {
		return electiveListStatus;
	}
	public void setElectiveListStatus(ims.RefMan.domain.objects.ElectiveListStatus electiveListStatus) {
		this.electiveListStatus = electiveListStatus;
	}

	public java.util.List getElectiveListStatusHistory() {
		if ( null == electiveListStatusHistory ) {
			electiveListStatusHistory = new java.util.ArrayList();
		}
		return electiveListStatusHistory;
	}
	public void setElectiveListStatusHistory(java.util.List paramValue) {
		this.electiveListStatusHistory = paramValue;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.RefMan.domain.objects.CatsReferral getReferral() {
		return referral;
	}
	public void setReferral(ims.RefMan.domain.objects.CatsReferral referral) {
		this.referral = referral;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public ims.core.resource.place.domain.objects.Location getWard() {
		return ward;
	}
	public void setWard(ims.core.resource.place.domain.objects.Location ward) {
		this.ward = ward;
	}

	public String getBed() {
		return bed;
	}
	public void setBed(String bed) {
		if ( null != bed && bed.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for bed. Tried to set value: "+
				bed);
		}
		this.bed = bed;
	}

	public ims.core.resource.people.domain.objects.Hcp getConsultant() {
		return consultant;
	}
	public void setConsultant(ims.core.resource.people.domain.objects.Hcp consultant) {
		this.consultant = consultant;
	}

	public java.util.Date getDateOnList() {
		return dateOnList;
	}
	public void setDateOnList(java.util.Date dateOnList) {
		this.dateOnList = dateOnList;
	}

	public java.util.Date getOriginalDecisionDate() {
		return originalDecisionDate;
	}
	public void setOriginalDecisionDate(java.util.Date originalDecisionDate) {
		this.originalDecisionDate = originalDecisionDate;
	}

	public ims.domain.lookups.LookupInstance getElectiveListReason() {
		return electiveListReason;
	}
	public void setElectiveListReason(ims.domain.lookups.LookupInstance electiveListReason) {
		this.electiveListReason = electiveListReason;
	}

	public ims.domain.lookups.LookupInstance getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(ims.domain.lookups.LookupInstance patientStatus) {
		this.patientStatus = patientStatus;
	}

	public ims.domain.lookups.LookupInstance getElectiveAdmissionType() {
		return electiveAdmissionType;
	}
	public void setElectiveAdmissionType(ims.domain.lookups.LookupInstance electiveAdmissionType) {
		this.electiveAdmissionType = electiveAdmissionType;
	}

	public ims.domain.lookups.LookupInstance getIntendedManagement() {
		return intendedManagement;
	}
	public void setIntendedManagement(ims.domain.lookups.LookupInstance intendedManagement) {
		this.intendedManagement = intendedManagement;
	}

	public Integer getAnticipatedStay() {
		return anticipatedStay;
	}
	public void setAnticipatedStay(Integer anticipatedStay) {
		this.anticipatedStay = anticipatedStay;
	}

	public Boolean isAvailableAtShortNotice() {
		return availableAtShortNotice;
	}
	public void setAvailableAtShortNotice(Boolean availableAtShortNotice) {
		this.availableAtShortNotice = availableAtShortNotice;
	}

	public Integer getAvailableAtShortNoticePeriod() {
		return availableAtShortNoticePeriod;
	}
	public void setAvailableAtShortNoticePeriod(Integer availableAtShortNoticePeriod) {
		this.availableAtShortNoticePeriod = availableAtShortNoticePeriod;
	}

	public ims.domain.lookups.LookupInstance getPriority() {
		return priority;
	}
	public void setPriority(ims.domain.lookups.LookupInstance priority) {
		this.priority = priority;
	}

	public java.util.List getSuspensions() {
		if ( null == suspensions ) {
			suspensions = new java.util.ArrayList();
		}
		return suspensions;
	}
	public void setSuspensions(java.util.List paramValue) {
		this.suspensions = paramValue;
	}

	public java.util.Date getCurrentSuspensionEndDate() {
		return currentSuspensionEndDate;
	}
	public void setCurrentSuspensionEndDate(java.util.Date currentSuspensionEndDate) {
		this.currentSuspensionEndDate = currentSuspensionEndDate;
	}

	public Boolean isOperativeProcedureStatus() {
		return operativeProcedureStatus;
	}
	public void setOperativeProcedureStatus(Boolean operativeProcedureStatus) {
		this.operativeProcedureStatus = operativeProcedureStatus;
	}

	public ims.core.clinical.domain.objects.Procedure getPrimaryProcedure() {
		return primaryProcedure;
	}
	public void setPrimaryProcedure(ims.core.clinical.domain.objects.Procedure primaryProcedure) {
		this.primaryProcedure = primaryProcedure;
	}

	public String getProcedureDescription() {
		return procedureDescription;
	}
	public void setProcedureDescription(String procedureDescription) {
		if ( null != procedureDescription && procedureDescription.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for procedureDescription. Tried to set value: "+
				procedureDescription);
		}
		this.procedureDescription = procedureDescription;
	}

	public java.util.List getOtherProcedures() {
		if ( null == otherProcedures ) {
			otherProcedures = new java.util.ArrayList();
		}
		return otherProcedures;
	}
	public void setOtherProcedures(java.util.List paramValue) {
		this.otherProcedures = paramValue;
	}

	public java.util.Date getRequiresTCIBy() {
		return requiresTCIBy;
	}
	public void setRequiresTCIBy(java.util.Date requiresTCIBy) {
		this.requiresTCIBy = requiresTCIBy;
	}

	public ims.RefMan.domain.objects.TCIForPatientElectiveList getTCIDetails() {
		return tCIDetails;
	}
	public void setTCIDetails(ims.RefMan.domain.objects.TCIForPatientElectiveList tCIDetails) {
		this.tCIDetails = tCIDetails;
	}

	public java.util.List getTCIHistory() {
		if ( null == tCIHistory ) {
			tCIHistory = new java.util.ArrayList();
		}
		return tCIHistory;
	}
	public void setTCIHistory(java.util.List paramValue) {
		this.tCIHistory = paramValue;
	}

	public Boolean isInterpretatorRequired() {
		return interpretatorRequired;
	}
	public void setInterpretatorRequired(Boolean interpretatorRequired) {
		this.interpretatorRequired = interpretatorRequired;
	}

	public ims.domain.lookups.LookupInstance getLanguage() {
		return language;
	}
	public void setLanguage(ims.domain.lookups.LookupInstance language) {
		this.language = language;
	}

	public Boolean isTransportRequired() {
		return transportRequired;
	}
	public void setTransportRequired(Boolean transportRequired) {
		this.transportRequired = transportRequired;
	}

	public ims.domain.lookups.LookupInstance getTransport() {
		return transport;
	}
	public void setTransport(ims.domain.lookups.LookupInstance transport) {
		this.transport = transport;
	}

	public Boolean isSpecialRequirements() {
		return specialRequirements;
	}
	public void setSpecialRequirements(Boolean specialRequirements) {
		this.specialRequirements = specialRequirements;
	}

	public String getSpecialRequirementsDetails() {
		return specialRequirementsDetails;
	}
	public void setSpecialRequirementsDetails(String specialRequirementsDetails) {
		if ( null != specialRequirementsDetails && specialRequirementsDetails.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for specialRequirementsDetails. Tried to set value: "+
				specialRequirementsDetails);
		}
		this.specialRequirementsDetails = specialRequirementsDetails;
	}

	public Boolean isPreAdmissionRequired() {
		return preAdmissionRequired;
	}
	public void setPreAdmissionRequired(Boolean preAdmissionRequired) {
		this.preAdmissionRequired = preAdmissionRequired;
	}

	public java.util.Set getNotes() {
		if ( null == notes ) {
			notes = new java.util.HashSet();
		}
		return notes;
	}
	public void setNotes(java.util.Set paramValue) {
		this.notes = paramValue;
	}

	public ims.RefMan.domain.objects.ReferralEROD getEROD() {
		return eROD;
	}
	public void setEROD(ims.RefMan.domain.objects.ReferralEROD eROD) {
		this.eROD = eROD;
	}

	public java.util.List getERODHistory() {
		if ( null == eRODHistory ) {
			eRODHistory = new java.util.ArrayList();
		}
		return eRODHistory;
	}
	public void setERODHistory(java.util.List paramValue) {
		this.eRODHistory = paramValue;
	}

	public ims.pathways.domain.objects.PathwayClock getPathwayClock() {
		return pathwayClock;
	}
	public void setPathwayClock(ims.pathways.domain.objects.PathwayClock pathwayClock) {
		this.pathwayClock = pathwayClock;
	}

	public Boolean isTCICancelledByProvider() {
		return tCICancelledByProvider;
	}
	public void setTCICancelledByProvider(Boolean tCICancelledByProvider) {
		this.tCICancelledByProvider = tCICancelledByProvider;
	}

	public java.util.Set getReviews() {
		if ( null == reviews ) {
			reviews = new java.util.HashSet();
		}
		return reviews;
	}
	public void setReviews(java.util.Set paramValue) {
		this.reviews = paramValue;
	}

	public java.util.List getAdmissions() {
		if ( null == admissions ) {
			admissions = new java.util.ArrayList();
		}
		return admissions;
	}
	public void setAdmissions(java.util.List paramValue) {
		this.admissions = paramValue;
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
		
		auditStr.append("\r\n*electiveList* :");
		if (electiveList != null)
		{
			auditStr.append(toShortClassName(electiveList));
				
		    auditStr.append(electiveList.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*electiveListStatus* :");
		if (electiveListStatus != null)
		{
			auditStr.append(toShortClassName(electiveListStatus));
				
		    auditStr.append(electiveListStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*electiveListStatusHistory* :");
		if (electiveListStatusHistory != null)
		{
		int i3=0;
		for (i3=0; i3<electiveListStatusHistory.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.ElectiveListStatus obj = (ims.RefMan.domain.objects.ElectiveListStatus)electiveListStatusHistory.get(i3);
		    if (obj != null)
			{
				if (i3 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referral* :");
		if (referral != null)
		{
			auditStr.append(toShortClassName(referral));
				
		    auditStr.append(referral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*ward* :");
		if (ward != null)
		{
			auditStr.append(toShortClassName(ward));
				
		    auditStr.append(ward.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bed* :");
		auditStr.append(bed);
	    auditStr.append("; ");
		auditStr.append("\r\n*consultant* :");
		if (consultant != null)
		{
			auditStr.append(toShortClassName(consultant));
				
		    auditStr.append(consultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOnList* :");
		auditStr.append(dateOnList);
	    auditStr.append("; ");
		auditStr.append("\r\n*originalDecisionDate* :");
		auditStr.append(originalDecisionDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*electiveListReason* :");
		if (electiveListReason != null)
			auditStr.append(electiveListReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientStatus* :");
		if (patientStatus != null)
			auditStr.append(patientStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*electiveAdmissionType* :");
		if (electiveAdmissionType != null)
			auditStr.append(electiveAdmissionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*intendedManagement* :");
		if (intendedManagement != null)
			auditStr.append(intendedManagement.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anticipatedStay* :");
		auditStr.append(anticipatedStay);
	    auditStr.append("; ");
		auditStr.append("\r\n*availableAtShortNotice* :");
		auditStr.append(availableAtShortNotice);
	    auditStr.append("; ");
		auditStr.append("\r\n*availableAtShortNoticePeriod* :");
		auditStr.append(availableAtShortNoticePeriod);
	    auditStr.append("; ");
		auditStr.append("\r\n*priority* :");
		if (priority != null)
			auditStr.append(priority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*suspensions* :");
		if (suspensions != null)
		{
		int i20=0;
		for (i20=0; i20<suspensions.size(); i20++)
		{
			if (i20 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.SuspensionDetailsForPatientElectiveList obj = (ims.RefMan.domain.objects.SuspensionDetailsForPatientElectiveList)suspensions.get(i20);
		    if (obj != null)
			{
				if (i20 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i20 > 0)
			auditStr.append("] " + i20);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentSuspensionEndDate* :");
		auditStr.append(currentSuspensionEndDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*operativeProcedureStatus* :");
		auditStr.append(operativeProcedureStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryProcedure* :");
		if (primaryProcedure != null)
		{
			auditStr.append(toShortClassName(primaryProcedure));
				
		    auditStr.append(primaryProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureDescription* :");
		auditStr.append(procedureDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*otherProcedures* :");
		if (otherProcedures != null)
		{
		int i25=0;
		for (i25=0; i25<otherProcedures.size(); i25++)
		{
			if (i25 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.Procedure obj = (ims.core.clinical.domain.objects.Procedure)otherProcedures.get(i25);
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
		auditStr.append("\r\n*requiresTCIBy* :");
		auditStr.append(requiresTCIBy);
	    auditStr.append("; ");
		auditStr.append("\r\n*tCIDetails* :");
		if (tCIDetails != null)
		{
			auditStr.append(toShortClassName(tCIDetails));
				
		    auditStr.append(tCIDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tCIHistory* :");
		if (tCIHistory != null)
		{
		int i28=0;
		for (i28=0; i28<tCIHistory.size(); i28++)
		{
			if (i28 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.TCIForPatientElectiveList obj = (ims.RefMan.domain.objects.TCIForPatientElectiveList)tCIHistory.get(i28);
		    if (obj != null)
			{
				if (i28 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i28 > 0)
			auditStr.append("] " + i28);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*interpretatorRequired* :");
		auditStr.append(interpretatorRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*language* :");
		if (language != null)
			auditStr.append(language.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*transportRequired* :");
		auditStr.append(transportRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*transport* :");
		if (transport != null)
			auditStr.append(transport.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*specialRequirements* :");
		auditStr.append(specialRequirements);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialRequirementsDetails* :");
		auditStr.append(specialRequirementsDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*preAdmissionRequired* :");
		auditStr.append(preAdmissionRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		if (notes != null)
		{
			java.util.Iterator it36 = notes.iterator();
			int i36=0;
			while (it36.hasNext())
			{
				if (i36 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.NotesForPatientElectiveList obj = (ims.RefMan.domain.objects.NotesForPatientElectiveList)it36.next();
		if (obj != null)
		{
		   if (i36 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i36++;
		}
		if (i36 > 0)
			auditStr.append("] " + i36);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*eROD* :");
		if (eROD != null)
		{
			auditStr.append(toShortClassName(eROD));
				
		    auditStr.append(eROD.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*eRODHistory* :");
		if (eRODHistory != null)
		{
		int i38=0;
		for (i38=0; i38<eRODHistory.size(); i38++)
		{
			if (i38 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.ReferralEROD obj = (ims.RefMan.domain.objects.ReferralEROD)eRODHistory.get(i38);
		    if (obj != null)
			{
				if (i38 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i38 > 0)
			auditStr.append("] " + i38);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pathwayClock* :");
		if (pathwayClock != null)
		{
			auditStr.append(toShortClassName(pathwayClock));
				
		    auditStr.append(pathwayClock.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tCICancelledByProvider* :");
		auditStr.append(tCICancelledByProvider);
	    auditStr.append("; ");
		auditStr.append("\r\n*reviews* :");
		if (reviews != null)
		{
			java.util.Iterator it41 = reviews.iterator();
			int i41=0;
			while (it41.hasNext())
			{
				if (i41 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.ReviewPatientElectiveList obj = (ims.RefMan.domain.objects.ReviewPatientElectiveList)it41.next();
		if (obj != null)
		{
		   if (i41 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i41++;
		}
		if (i41 > 0)
			auditStr.append("] " + i41);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*admissions* :");
		if (admissions != null)
		{
		int i42=0;
		for (i42=0; i42<admissions.size(); i42++)
		{
			if (i42 > 0)
				auditStr.append(",");
			ims.core.admin.pas.domain.objects.AdmissionDetail obj = (ims.core.admin.pas.domain.objects.AdmissionDetail)admissions.get(i42);
		    if (obj != null)
			{
				if (i42 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i42 > 0)
			auditStr.append("] " + i42);
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
		
		String keyClassName = "PatientElectiveList";
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
		if (this.getElectiveList() != null)
		{
			sb.append("<electiveList>");
			sb.append(this.getElectiveList().toXMLString(domMap)); 	
			sb.append("</electiveList>");		
		}
		if (this.getElectiveListStatus() != null)
		{
			sb.append("<electiveListStatus>");
			sb.append(this.getElectiveListStatus().toXMLString(domMap)); 	
			sb.append("</electiveListStatus>");		
		}
		if (this.getElectiveListStatusHistory() != null)
		{
			if (this.getElectiveListStatusHistory().size() > 0 )
			{
			sb.append("<electiveListStatusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getElectiveListStatusHistory(), domMap));
			sb.append("</electiveListStatusHistory>");		
			}
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getReferral() != null)
		{
			sb.append("<referral>");
			sb.append(this.getReferral().toXMLString(domMap)); 	
			sb.append("</referral>");		
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.getWard() != null)
		{
			sb.append("<ward>");
			sb.append(this.getWard().toXMLString(domMap)); 	
			sb.append("</ward>");		
		}
		if (this.getBed() != null)
		{
			sb.append("<bed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBed().toString()));
			sb.append("</bed>");		
		}
		if (this.getConsultant() != null)
		{
			sb.append("<consultant>");
			sb.append(this.getConsultant().toXMLString(domMap)); 	
			sb.append("</consultant>");		
		}
		if (this.getDateOnList() != null)
		{
			sb.append("<dateOnList>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOnList()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOnList>");		
		}
		if (this.getOriginalDecisionDate() != null)
		{
			sb.append("<originalDecisionDate>");
			sb.append(new ims.framework.utils.DateTime(this.getOriginalDecisionDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</originalDecisionDate>");		
		}
		if (this.getElectiveListReason() != null)
		{
			sb.append("<electiveListReason>");
			sb.append(this.getElectiveListReason().toXMLString()); 
			sb.append("</electiveListReason>");		
		}
		if (this.getPatientStatus() != null)
		{
			sb.append("<patientStatus>");
			sb.append(this.getPatientStatus().toXMLString()); 
			sb.append("</patientStatus>");		
		}
		if (this.getElectiveAdmissionType() != null)
		{
			sb.append("<electiveAdmissionType>");
			sb.append(this.getElectiveAdmissionType().toXMLString()); 
			sb.append("</electiveAdmissionType>");		
		}
		if (this.getIntendedManagement() != null)
		{
			sb.append("<intendedManagement>");
			sb.append(this.getIntendedManagement().toXMLString()); 
			sb.append("</intendedManagement>");		
		}
		if (this.getAnticipatedStay() != null)
		{
			sb.append("<anticipatedStay>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnticipatedStay().toString()));
			sb.append("</anticipatedStay>");		
		}
		if (this.isAvailableAtShortNotice() != null)
		{
			sb.append("<availableAtShortNotice>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAvailableAtShortNotice().toString()));
			sb.append("</availableAtShortNotice>");		
		}
		if (this.getAvailableAtShortNoticePeriod() != null)
		{
			sb.append("<availableAtShortNoticePeriod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAvailableAtShortNoticePeriod().toString()));
			sb.append("</availableAtShortNoticePeriod>");		
		}
		if (this.getPriority() != null)
		{
			sb.append("<priority>");
			sb.append(this.getPriority().toXMLString()); 
			sb.append("</priority>");		
		}
		if (this.getSuspensions() != null)
		{
			if (this.getSuspensions().size() > 0 )
			{
			sb.append("<suspensions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSuspensions(), domMap));
			sb.append("</suspensions>");		
			}
		}
		if (this.getCurrentSuspensionEndDate() != null)
		{
			sb.append("<currentSuspensionEndDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCurrentSuspensionEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</currentSuspensionEndDate>");		
		}
		if (this.isOperativeProcedureStatus() != null)
		{
			sb.append("<operativeProcedureStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isOperativeProcedureStatus().toString()));
			sb.append("</operativeProcedureStatus>");		
		}
		if (this.getPrimaryProcedure() != null)
		{
			sb.append("<primaryProcedure>");
			sb.append(this.getPrimaryProcedure().toXMLString(domMap)); 	
			sb.append("</primaryProcedure>");		
		}
		if (this.getProcedureDescription() != null)
		{
			sb.append("<procedureDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcedureDescription().toString()));
			sb.append("</procedureDescription>");		
		}
		if (this.getOtherProcedures() != null)
		{
			if (this.getOtherProcedures().size() > 0 )
			{
			sb.append("<otherProcedures>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOtherProcedures(), domMap));
			sb.append("</otherProcedures>");		
			}
		}
		if (this.getRequiresTCIBy() != null)
		{
			sb.append("<requiresTCIBy>");
			sb.append(new ims.framework.utils.DateTime(this.getRequiresTCIBy()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</requiresTCIBy>");		
		}
		if (this.getTCIDetails() != null)
		{
			sb.append("<tCIDetails>");
			sb.append(this.getTCIDetails().toXMLString(domMap)); 	
			sb.append("</tCIDetails>");		
		}
		if (this.getTCIHistory() != null)
		{
			if (this.getTCIHistory().size() > 0 )
			{
			sb.append("<tCIHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTCIHistory(), domMap));
			sb.append("</tCIHistory>");		
			}
		}
		if (this.isInterpretatorRequired() != null)
		{
			sb.append("<interpretatorRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isInterpretatorRequired().toString()));
			sb.append("</interpretatorRequired>");		
		}
		if (this.getLanguage() != null)
		{
			sb.append("<language>");
			sb.append(this.getLanguage().toXMLString()); 
			sb.append("</language>");		
		}
		if (this.isTransportRequired() != null)
		{
			sb.append("<transportRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTransportRequired().toString()));
			sb.append("</transportRequired>");		
		}
		if (this.getTransport() != null)
		{
			sb.append("<transport>");
			sb.append(this.getTransport().toXMLString()); 
			sb.append("</transport>");		
		}
		if (this.isSpecialRequirements() != null)
		{
			sb.append("<specialRequirements>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSpecialRequirements().toString()));
			sb.append("</specialRequirements>");		
		}
		if (this.getSpecialRequirementsDetails() != null)
		{
			sb.append("<specialRequirementsDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSpecialRequirementsDetails().toString()));
			sb.append("</specialRequirementsDetails>");		
		}
		if (this.isPreAdmissionRequired() != null)
		{
			sb.append("<preAdmissionRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPreAdmissionRequired().toString()));
			sb.append("</preAdmissionRequired>");		
		}
		if (this.getNotes() != null)
		{
			if (this.getNotes().size() > 0 )
			{
			sb.append("<notes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getNotes(), domMap));
			sb.append("</notes>");		
			}
		}
		if (this.getEROD() != null)
		{
			sb.append("<eROD>");
			sb.append(this.getEROD().toXMLString(domMap)); 	
			sb.append("</eROD>");		
		}
		if (this.getERODHistory() != null)
		{
			if (this.getERODHistory().size() > 0 )
			{
			sb.append("<eRODHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getERODHistory(), domMap));
			sb.append("</eRODHistory>");		
			}
		}
		if (this.getPathwayClock() != null)
		{
			sb.append("<pathwayClock>");
			sb.append(this.getPathwayClock().toXMLString(domMap)); 	
			sb.append("</pathwayClock>");		
		}
		if (this.isTCICancelledByProvider() != null)
		{
			sb.append("<tCICancelledByProvider>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTCICancelledByProvider().toString()));
			sb.append("</tCICancelledByProvider>");		
		}
		if (this.getReviews() != null)
		{
			if (this.getReviews().size() > 0 )
			{
			sb.append("<reviews>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getReviews(), domMap));
			sb.append("</reviews>");		
			}
		}
		if (this.getAdmissions() != null)
		{
			if (this.getAdmissions().size() > 0 )
			{
			sb.append("<admissions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAdmissions(), domMap));
			sb.append("</admissions>");		
			}
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
			PatientElectiveList domainObject = getPatientElectiveListfromXML(itemEl, factory, domMap);

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
			PatientElectiveList domainObject = getPatientElectiveListfromXML(itemEl, factory, domMap);

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
		
	public static PatientElectiveList getPatientElectiveListfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientElectiveListfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientElectiveList getPatientElectiveListfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientElectiveList.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientElectiveList.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientElectiveList class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientElectiveList)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientElectiveList.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientElectiveList ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientElectiveList)factory.getImportedDomainObject(PatientElectiveList.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientElectiveList();
		}
		String keyClassName = "PatientElectiveList";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientElectiveList)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientElectiveList obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("electiveList");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setElectiveList(ims.core.configuration.domain.objects.ElectiveListConfiguration.getElectiveListConfigurationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("electiveListStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setElectiveListStatus(ims.RefMan.domain.objects.ElectiveListStatus.getElectiveListStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("electiveListStatusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setElectiveListStatusHistory(ims.RefMan.domain.objects.ElectiveListStatus.fromListXMLString(fldEl, factory, obj.getElectiveListStatusHistory(), domMap));
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("ward");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bed");
		if(fldEl != null)
		{	
    		obj.setBed(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("consultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConsultant(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateOnList");
		if(fldEl != null)
		{	
    		obj.setDateOnList(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("originalDecisionDate");
		if(fldEl != null)
		{	
    		obj.setOriginalDecisionDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("electiveListReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setElectiveListReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("electiveAdmissionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setElectiveAdmissionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("intendedManagement");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIntendedManagement(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anticipatedStay");
		if(fldEl != null)
		{	
    		obj.setAnticipatedStay(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("availableAtShortNotice");
		if(fldEl != null)
		{	
    		obj.setAvailableAtShortNotice(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("availableAtShortNoticePeriod");
		if(fldEl != null)
		{	
    		obj.setAvailableAtShortNoticePeriod(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("priority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("suspensions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSuspensions(ims.RefMan.domain.objects.SuspensionDetailsForPatientElectiveList.fromListXMLString(fldEl, factory, obj.getSuspensions(), domMap));
		}
		fldEl = el.element("currentSuspensionEndDate");
		if(fldEl != null)
		{	
    		obj.setCurrentSuspensionEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("operativeProcedureStatus");
		if(fldEl != null)
		{	
    		obj.setOperativeProcedureStatus(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("primaryProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrimaryProcedure(ims.core.clinical.domain.objects.Procedure.getProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedureDescription");
		if(fldEl != null)
		{	
    		obj.setProcedureDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("otherProcedures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOtherProcedures(ims.core.clinical.domain.objects.Procedure.fromListXMLString(fldEl, factory, obj.getOtherProcedures(), domMap));
		}
		fldEl = el.element("requiresTCIBy");
		if(fldEl != null)
		{	
    		obj.setRequiresTCIBy(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("tCIDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTCIDetails(ims.RefMan.domain.objects.TCIForPatientElectiveList.getTCIForPatientElectiveListfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tCIHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTCIHistory(ims.RefMan.domain.objects.TCIForPatientElectiveList.fromListXMLString(fldEl, factory, obj.getTCIHistory(), domMap));
		}
		fldEl = el.element("interpretatorRequired");
		if(fldEl != null)
		{	
    		obj.setInterpretatorRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("language");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLanguage(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("transportRequired");
		if(fldEl != null)
		{	
    		obj.setTransportRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("transport");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTransport(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("specialRequirements");
		if(fldEl != null)
		{	
    		obj.setSpecialRequirements(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specialRequirementsDetails");
		if(fldEl != null)
		{	
    		obj.setSpecialRequirementsDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("preAdmissionRequired");
		if(fldEl != null)
		{	
    		obj.setPreAdmissionRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setNotes(ims.RefMan.domain.objects.NotesForPatientElectiveList.fromSetXMLString(fldEl, factory, obj.getNotes(), domMap));
		}
		fldEl = el.element("eROD");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEROD(ims.RefMan.domain.objects.ReferralEROD.getReferralERODfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("eRODHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setERODHistory(ims.RefMan.domain.objects.ReferralEROD.fromListXMLString(fldEl, factory, obj.getERODHistory(), domMap));
		}
		fldEl = el.element("pathwayClock");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathwayClock(ims.pathways.domain.objects.PathwayClock.getPathwayClockfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tCICancelledByProvider");
		if(fldEl != null)
		{	
    		obj.setTCICancelledByProvider(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reviews");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setReviews(ims.RefMan.domain.objects.ReviewPatientElectiveList.fromSetXMLString(fldEl, factory, obj.getReviews(), domMap));
		}
		fldEl = el.element("admissions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAdmissions(ims.core.admin.pas.domain.objects.AdmissionDetail.fromListXMLString(fldEl, factory, obj.getAdmissions(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "electiveListStatusHistory"
		, "suspensions"
		, "otherProcedures"
		, "tCIHistory"
		, "notes"
		, "eRODHistory"
		, "reviews"
		, "admissions"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ElectiveList = "electiveList";
		public static final String ElectiveListStatus = "electiveListStatus";
		public static final String ElectiveListStatusHistory = "electiveListStatusHistory";
		public static final String Patient = "patient";
		public static final String Referral = "referral";
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String Ward = "ward";
		public static final String Bed = "bed";
		public static final String Consultant = "consultant";
		public static final String DateOnList = "dateOnList";
		public static final String OriginalDecisionDate = "originalDecisionDate";
		public static final String ElectiveListReason = "electiveListReason";
		public static final String PatientStatus = "patientStatus";
		public static final String ElectiveAdmissionType = "electiveAdmissionType";
		public static final String IntendedManagement = "intendedManagement";
		public static final String AnticipatedStay = "anticipatedStay";
		public static final String AvailableAtShortNotice = "availableAtShortNotice";
		public static final String AvailableAtShortNoticePeriod = "availableAtShortNoticePeriod";
		public static final String Priority = "priority";
		public static final String Suspensions = "suspensions";
		public static final String CurrentSuspensionEndDate = "currentSuspensionEndDate";
		public static final String OperativeProcedureStatus = "operativeProcedureStatus";
		public static final String PrimaryProcedure = "primaryProcedure";
		public static final String ProcedureDescription = "procedureDescription";
		public static final String OtherProcedures = "otherProcedures";
		public static final String RequiresTCIBy = "requiresTCIBy";
		public static final String TCIDetails = "tCIDetails";
		public static final String TCIHistory = "tCIHistory";
		public static final String InterpretatorRequired = "interpretatorRequired";
		public static final String Language = "language";
		public static final String TransportRequired = "transportRequired";
		public static final String Transport = "transport";
		public static final String SpecialRequirements = "specialRequirements";
		public static final String SpecialRequirementsDetails = "specialRequirementsDetails";
		public static final String PreAdmissionRequired = "preAdmissionRequired";
		public static final String Notes = "notes";
		public static final String EROD = "eROD";
		public static final String ERODHistory = "eRODHistory";
		public static final String PathwayClock = "pathwayClock";
		public static final String TCICancelledByProvider = "tCICancelledByProvider";
		public static final String Reviews = "reviews";
		public static final String Admissions = "admissions";
	}
}

