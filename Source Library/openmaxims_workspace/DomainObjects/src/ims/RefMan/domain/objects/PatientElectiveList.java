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
	/** ElectiveAdmissionType */
	private ims.domain.lookups.LookupInstance electiveAdmissionType;
	/** ElectiveListStatus */
	private ims.RefMan.domain.objects.ElectiveListStatus electiveListStatus;
	/** ElectiveListStatus History
	  * Collection of ims.RefMan.domain.objects.ElectiveListStatus.
	  */
	private java.util.List electiveListStatusHistory;
	/** The Appointment who's outcome caused the creation of this Elective List record */
	private ims.scheduling.domain.objects.Booking_Appointment creatingAppointment;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Referral */
	private ims.RefMan.domain.objects.CatsReferral referral;
	/** EpisodeOfCare */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	private ims.core.resource.place.domain.objects.Location hospital;
	/** Bed */
	private String bed;
	/** PatientStatus */
	private ims.domain.lookups.LookupInstance patientStatus;
	/** Consultant */
	private ims.core.resource.people.domain.objects.Hcp consultant;
	/** DateOnList */
	private java.util.Date dateOnList;
	/** OriginalDecisionDate */
	private java.util.Date originalDecisionDate;
	/** Elective List Reason */
	private ims.domain.lookups.LookupInstance electiveListReason;
	/** TCIDetails */
	private ims.RefMan.domain.objects.TCIForPatientElectiveList tCIDetails;
	/** TCIHistory
	  * Collection of ims.RefMan.domain.objects.TCIForPatientElectiveList.
	  */
	private java.util.List tCIHistory;
	private Boolean tCIGiven;
	/** TCICancelledByProvider - Once set to TRUE it should never be unset */
	private Boolean tCICancelledByProvider;
	/** Suspensions
	  * Collection of ims.RefMan.domain.objects.SuspensionDetailsForPatientElectiveList.
	  */
	private java.util.List suspensions;
	/** CurrentSuspensionEndDate */
	private java.util.Date currentSuspensionEndDate;
	/** EROD */
	private ims.RefMan.domain.objects.ReferralEROD eROD;
	/** EROD history
	  * Collection of ims.RefMan.domain.objects.ReferralEROD.
	  */
	private java.util.List eRODHistory;
	/** PathwayClock */
	private ims.pathways.domain.objects.PathwayClock pathwayClock;
	/** Reviews
	  * Collection of ims.RefMan.domain.objects.ReviewPatientElectiveList.
	  */
	private java.util.Set reviews;
	/** Notes
	  * Collection of ims.RefMan.domain.objects.NotesForPatientElectiveList.
	  */
	private java.util.Set notes;
	/** Admissions
	  * Collection of ims.core.admin.pas.domain.objects.AdmissionDetail.
	  */
	private java.util.List admissions;
	/** IntendedManagement */
	private ims.domain.lookups.LookupInstance intendedManagement;
	/** Possible date given to Patient */
	private Boolean wasPossibleDateGiven;
	/** Date given to patient  */
	private java.util.Date dateGivenToPatient;
	/** PrimaryProcedure */
	private ims.core.clinical.domain.objects.Procedure primaryProcedure;
	/** ProcLaterality */
	private ims.domain.lookups.LookupInstance procLaterality;
	/** ProcedureDescription */
	private String procedureDescription;
	/** Secondary Procedure */
	private ims.core.clinical.domain.objects.Procedure secondaryProcedure;
	/** Secondary Procedure Laterality */
	private ims.domain.lookups.LookupInstance secondaryProcLaterality;
	/** Comments for standard of complex case */
	private Integer anticipatedProcedureLength;
	/** Priority */
	private ims.domain.lookups.LookupInstance priority;
	/** The anaesthetic type used (can be local anaesthetic, sedation, etc) */
	private ims.domain.lookups.LookupInstance anaestheticType;
	/** Waiting List The anaesthetic type used (can be local anaesthetic, sedation, etc) */
	private ims.domain.lookups.LookupInstance wLAnaestheticType;
	/** AvailableAtShortNotice */
	private Boolean availableAtShortNotice;
	/** AvailableAtShortNoticePeriod (Days) */
	private Integer availableAtShortNoticePeriod;
	/** AvailableAtShortNotice */
	private Boolean wLAvailableAtShortNotice;
	/** Waiting List AvailableAtShortNoticePeriod (Days) */
	private Integer wLAvailableAtShortNoticePeriod;
	/** Pre Operative Overnight Stay Required */
	private Boolean preOperativeOvernightStayRequired;
	/** Waiting List Pre Operative Overnight Stay Required */
	private Boolean wLPreOperativeOvernightStayRequired;
	/** No Of PreOperative Nights */
	private Integer noOfPreOperativeNights;
	/** Waiting List No Of PreOperative Nights */
	private Integer wLNoOfPreOperativeNights;
	/** AnticipatedStay */
	private Integer anticipatedStay;
	/** Waiting List AnticipatedStay */
	private Integer wLAnticipatedStay;
	/** Required Theatre Type (Day Case, Inaptient, etc.) */
	private ims.domain.lookups.LookupInstance requiredTheatreType;
	/** Critical Care Bed Required */
	private Boolean criticalCareBedRequired;
	/** HDU Bed Required */
	private Boolean hDUBedRequired;
	/** ITU Bed Required */
	private Boolean iTUBedRequired;
	/** Is an assessment of risk by an anaesthesis required for this patient */
	private Boolean anaesthesisRiskAssessmentRequest;
	/** Is this patient currently  */
	private ims.domain.lookups.LookupInstance patientReceivingAnticoagulantTherapy;
	/** Waiting List Is this patient currently  */
	private ims.domain.lookups.LookupInstance wLPatientReceivingAnticoagulantTherapy;
	/** Are you happy to follow  */
	private ims.domain.lookups.LookupInstance followPeriOperativeguidelines;
	/** Reason for not following PeriOp guidelines */
	private String periOpNoReasonComments;
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
	private String comments;
	private ims.domain.lookups.LookupInstance proceduredToBeCarriedBy;
	private ims.core.resource.people.domain.objects.Hcp procedureCarriedOutBy;
	/** Suspected GI Bleed  */
	private Boolean suspectedGIBleed;
	/** Points */
	private Integer points;
	/** Suitable for Training  */
	private Boolean suitableforTraining;
	/** General Anaesthetic */
	private ims.domain.lookups.LookupInstance generalAnaesthetic;
	/** Can this procedure beCarried out by a Nurse  */
	private Boolean canNurseCarryOutProcedure;
	/** Details For Non GA Endo Procedure */
	private String detailsForNonGAEndoProcedure;
	/** Pre Assessment Required */
	private Boolean preAssessmentRequired;
	/** Is this patient on any medication that should be stopped prior to oral bowel preparation */
	private Boolean medicationShouldBeStoppedOralBowelPrep;
	/** DrugInformation */
	private String drugInformation;
	/** Pacemaker / Defibrillator?  */
	private Boolean hasPacemakerDefib;
	/** Did the patient have an assessment of renalfunction taken within the last 6 months?  */
	private ims.domain.lookups.LookupInstance renalFunctionAssessment;
	/** Are there key therapeutic equipment and / or patient cognitive or physical capacity issues not covered by this form?  */
	private Boolean areThereKeyTherapeutic;
	/** Pre Assessment Outcome */
	private ims.RefMan.domain.objects.PreAssessmentOutcome preAssessmentOutcome;
	/** Is this patient fit for surgery following pre-assessment? */
	private ims.domain.lookups.LookupInstance fitForSurgery;
	/** OperativeProcedureStatus */
	private Boolean operativeProcedureStatus;
	/** isConsultantPerformingProcedure */
	private Boolean isConsultantPerformingProcedure;
	/** OtherProcedures
	  * Collection of ims.core.clinical.domain.objects.Procedure.
	  */
	private java.util.List otherProcedures;
	/** Comments if operating on patient on Anticoagulant Therapy */
	private String operateOnAnticoagulantComment;
	/** Is this a standard of coplex case */
	private Boolean takesLongerThanStandardTime;
	private ims.scheduling.domain.objects.AppointmentOutcomeAction appointmentOutcomeAction;
	private Boolean anaesthetistRequiredInTheatre;
	private ims.domain.lookups.LookupInstance careGiven;
	private ims.domain.lookups.LookupInstance admissionType;
	private Integer admittedIn;
	private ims.domain.lookups.LookupInstance admittedInUnitOfTime;
	private Integer numberOfProviderTCICancellations;
	private Boolean was28DayRuleApplied;
	/** CognitiveComments */
	private String cognitiveComments;
	/** To Be Planned In */
	private Integer toBePlannedIn;
	/** To Be Planned In Unit */
	private ims.domain.lookups.LookupInstance toBePlannedInUnit;
	/** Planned Date */
	private java.util.Date plannedDate;
	/** isSuitableForTelephoneAssessment */
	private Boolean isSuitableForTelephoneAssessment;
	/** Pre Assessment Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment preAssessmentAppointment;
	private Boolean subjectTo28DayRule;
	private ims.domain.lookups.LookupInstance rule28DayStatus;
	private java.util.Date rule28DayPeriodStart;
	/** Multi Service Case  */
	private Boolean multiServiceCase;
	/** Requires Vetting  */
	private Boolean requiresVetting;
	/** This will be set when the current TCI is cancelled without the linked Theatre Appointment to be cancelled */
	private ims.scheduling.domain.objects.Booking_Appointment theatreAppointment;
	/** For Medical Admission */
	private ims.core.resource.place.domain.objects.Location ward;
	/** Vetting Date */
	private java.util.Date vettingDate;
	/** Vetting HCP */
	private ims.core.resource.people.domain.objects.Hcp vettingHCP;
	/** Authoring Information */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInfo;
	private ims.domain.lookups.LookupInstance patientCategory;
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingUser;
	private ims.domain.lookups.LookupInstance preColonoscopyAssessmentRequired;
	private ims.core.resource.people.domain.objects.Hcp responsibleHCP;
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

	public ims.domain.lookups.LookupInstance getElectiveAdmissionType() {
		return electiveAdmissionType;
	}
	public void setElectiveAdmissionType(ims.domain.lookups.LookupInstance electiveAdmissionType) {
		this.electiveAdmissionType = electiveAdmissionType;
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

	public ims.scheduling.domain.objects.Booking_Appointment getCreatingAppointment() {
		return creatingAppointment;
	}
	public void setCreatingAppointment(ims.scheduling.domain.objects.Booking_Appointment creatingAppointment) {
		this.creatingAppointment = creatingAppointment;
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

	public ims.core.resource.place.domain.objects.Location getHospital() {
		return hospital;
	}
	public void setHospital(ims.core.resource.place.domain.objects.Location hospital) {
		this.hospital = hospital;
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

	public ims.domain.lookups.LookupInstance getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(ims.domain.lookups.LookupInstance patientStatus) {
		this.patientStatus = patientStatus;
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

	public Boolean isTCIGiven() {
		return tCIGiven;
	}
	public void setTCIGiven(Boolean tCIGiven) {
		this.tCIGiven = tCIGiven;
	}

	public Boolean isTCICancelledByProvider() {
		return tCICancelledByProvider;
	}
	public void setTCICancelledByProvider(Boolean tCICancelledByProvider) {
		this.tCICancelledByProvider = tCICancelledByProvider;
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

	public java.util.Set getReviews() {
		if ( null == reviews ) {
			reviews = new java.util.HashSet();
		}
		return reviews;
	}
	public void setReviews(java.util.Set paramValue) {
		this.reviews = paramValue;
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

	public java.util.List getAdmissions() {
		if ( null == admissions ) {
			admissions = new java.util.ArrayList();
		}
		return admissions;
	}
	public void setAdmissions(java.util.List paramValue) {
		this.admissions = paramValue;
	}

	public ims.domain.lookups.LookupInstance getIntendedManagement() {
		return intendedManagement;
	}
	public void setIntendedManagement(ims.domain.lookups.LookupInstance intendedManagement) {
		this.intendedManagement = intendedManagement;
	}

	public Boolean isWasPossibleDateGiven() {
		return wasPossibleDateGiven;
	}
	public void setWasPossibleDateGiven(Boolean wasPossibleDateGiven) {
		this.wasPossibleDateGiven = wasPossibleDateGiven;
	}

	public java.util.Date getDateGivenToPatient() {
		return dateGivenToPatient;
	}
	public void setDateGivenToPatient(java.util.Date dateGivenToPatient) {
		this.dateGivenToPatient = dateGivenToPatient;
	}

	public ims.core.clinical.domain.objects.Procedure getPrimaryProcedure() {
		return primaryProcedure;
	}
	public void setPrimaryProcedure(ims.core.clinical.domain.objects.Procedure primaryProcedure) {
		this.primaryProcedure = primaryProcedure;
	}

	public ims.domain.lookups.LookupInstance getProcLaterality() {
		return procLaterality;
	}
	public void setProcLaterality(ims.domain.lookups.LookupInstance procLaterality) {
		this.procLaterality = procLaterality;
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

	public ims.core.clinical.domain.objects.Procedure getSecondaryProcedure() {
		return secondaryProcedure;
	}
	public void setSecondaryProcedure(ims.core.clinical.domain.objects.Procedure secondaryProcedure) {
		this.secondaryProcedure = secondaryProcedure;
	}

	public ims.domain.lookups.LookupInstance getSecondaryProcLaterality() {
		return secondaryProcLaterality;
	}
	public void setSecondaryProcLaterality(ims.domain.lookups.LookupInstance secondaryProcLaterality) {
		this.secondaryProcLaterality = secondaryProcLaterality;
	}

	public Integer getAnticipatedProcedureLength() {
		return anticipatedProcedureLength;
	}
	public void setAnticipatedProcedureLength(Integer anticipatedProcedureLength) {
		this.anticipatedProcedureLength = anticipatedProcedureLength;
	}

	public ims.domain.lookups.LookupInstance getPriority() {
		return priority;
	}
	public void setPriority(ims.domain.lookups.LookupInstance priority) {
		this.priority = priority;
	}

	public ims.domain.lookups.LookupInstance getAnaestheticType() {
		return anaestheticType;
	}
	public void setAnaestheticType(ims.domain.lookups.LookupInstance anaestheticType) {
		this.anaestheticType = anaestheticType;
	}

	public ims.domain.lookups.LookupInstance getWLAnaestheticType() {
		return wLAnaestheticType;
	}
	public void setWLAnaestheticType(ims.domain.lookups.LookupInstance wLAnaestheticType) {
		this.wLAnaestheticType = wLAnaestheticType;
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

	public Boolean isWLAvailableAtShortNotice() {
		return wLAvailableAtShortNotice;
	}
	public void setWLAvailableAtShortNotice(Boolean wLAvailableAtShortNotice) {
		this.wLAvailableAtShortNotice = wLAvailableAtShortNotice;
	}

	public Integer getWLAvailableAtShortNoticePeriod() {
		return wLAvailableAtShortNoticePeriod;
	}
	public void setWLAvailableAtShortNoticePeriod(Integer wLAvailableAtShortNoticePeriod) {
		this.wLAvailableAtShortNoticePeriod = wLAvailableAtShortNoticePeriod;
	}

	public Boolean isPreOperativeOvernightStayRequired() {
		return preOperativeOvernightStayRequired;
	}
	public void setPreOperativeOvernightStayRequired(Boolean preOperativeOvernightStayRequired) {
		this.preOperativeOvernightStayRequired = preOperativeOvernightStayRequired;
	}

	public Boolean isWLPreOperativeOvernightStayRequired() {
		return wLPreOperativeOvernightStayRequired;
	}
	public void setWLPreOperativeOvernightStayRequired(Boolean wLPreOperativeOvernightStayRequired) {
		this.wLPreOperativeOvernightStayRequired = wLPreOperativeOvernightStayRequired;
	}

	public Integer getNoOfPreOperativeNights() {
		return noOfPreOperativeNights;
	}
	public void setNoOfPreOperativeNights(Integer noOfPreOperativeNights) {
		this.noOfPreOperativeNights = noOfPreOperativeNights;
	}

	public Integer getWLNoOfPreOperativeNights() {
		return wLNoOfPreOperativeNights;
	}
	public void setWLNoOfPreOperativeNights(Integer wLNoOfPreOperativeNights) {
		this.wLNoOfPreOperativeNights = wLNoOfPreOperativeNights;
	}

	public Integer getAnticipatedStay() {
		return anticipatedStay;
	}
	public void setAnticipatedStay(Integer anticipatedStay) {
		this.anticipatedStay = anticipatedStay;
	}

	public Integer getWLAnticipatedStay() {
		return wLAnticipatedStay;
	}
	public void setWLAnticipatedStay(Integer wLAnticipatedStay) {
		this.wLAnticipatedStay = wLAnticipatedStay;
	}

	public ims.domain.lookups.LookupInstance getRequiredTheatreType() {
		return requiredTheatreType;
	}
	public void setRequiredTheatreType(ims.domain.lookups.LookupInstance requiredTheatreType) {
		this.requiredTheatreType = requiredTheatreType;
	}

	public Boolean isCriticalCareBedRequired() {
		return criticalCareBedRequired;
	}
	public void setCriticalCareBedRequired(Boolean criticalCareBedRequired) {
		this.criticalCareBedRequired = criticalCareBedRequired;
	}

	public Boolean isHDUBedRequired() {
		return hDUBedRequired;
	}
	public void setHDUBedRequired(Boolean hDUBedRequired) {
		this.hDUBedRequired = hDUBedRequired;
	}

	public Boolean isITUBedRequired() {
		return iTUBedRequired;
	}
	public void setITUBedRequired(Boolean iTUBedRequired) {
		this.iTUBedRequired = iTUBedRequired;
	}

	public Boolean isAnaesthesisRiskAssessmentRequest() {
		return anaesthesisRiskAssessmentRequest;
	}
	public void setAnaesthesisRiskAssessmentRequest(Boolean anaesthesisRiskAssessmentRequest) {
		this.anaesthesisRiskAssessmentRequest = anaesthesisRiskAssessmentRequest;
	}

	public ims.domain.lookups.LookupInstance getPatientReceivingAnticoagulantTherapy() {
		return patientReceivingAnticoagulantTherapy;
	}
	public void setPatientReceivingAnticoagulantTherapy(ims.domain.lookups.LookupInstance patientReceivingAnticoagulantTherapy) {
		this.patientReceivingAnticoagulantTherapy = patientReceivingAnticoagulantTherapy;
	}

	public ims.domain.lookups.LookupInstance getWLPatientReceivingAnticoagulantTherapy() {
		return wLPatientReceivingAnticoagulantTherapy;
	}
	public void setWLPatientReceivingAnticoagulantTherapy(ims.domain.lookups.LookupInstance wLPatientReceivingAnticoagulantTherapy) {
		this.wLPatientReceivingAnticoagulantTherapy = wLPatientReceivingAnticoagulantTherapy;
	}

	public ims.domain.lookups.LookupInstance getFollowPeriOperativeguidelines() {
		return followPeriOperativeguidelines;
	}
	public void setFollowPeriOperativeguidelines(ims.domain.lookups.LookupInstance followPeriOperativeguidelines) {
		this.followPeriOperativeguidelines = followPeriOperativeguidelines;
	}

	public String getPeriOpNoReasonComments() {
		return periOpNoReasonComments;
	}
	public void setPeriOpNoReasonComments(String periOpNoReasonComments) {
		if ( null != periOpNoReasonComments && periOpNoReasonComments.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for periOpNoReasonComments. Tried to set value: "+
				periOpNoReasonComments);
		}
		this.periOpNoReasonComments = periOpNoReasonComments;
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

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public ims.domain.lookups.LookupInstance getProceduredToBeCarriedBy() {
		return proceduredToBeCarriedBy;
	}
	public void setProceduredToBeCarriedBy(ims.domain.lookups.LookupInstance proceduredToBeCarriedBy) {
		this.proceduredToBeCarriedBy = proceduredToBeCarriedBy;
	}

	public ims.core.resource.people.domain.objects.Hcp getProcedureCarriedOutBy() {
		return procedureCarriedOutBy;
	}
	public void setProcedureCarriedOutBy(ims.core.resource.people.domain.objects.Hcp procedureCarriedOutBy) {
		this.procedureCarriedOutBy = procedureCarriedOutBy;
	}

	public Boolean isSuspectedGIBleed() {
		return suspectedGIBleed;
	}
	public void setSuspectedGIBleed(Boolean suspectedGIBleed) {
		this.suspectedGIBleed = suspectedGIBleed;
	}

	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}

	public Boolean isSuitableforTraining() {
		return suitableforTraining;
	}
	public void setSuitableforTraining(Boolean suitableforTraining) {
		this.suitableforTraining = suitableforTraining;
	}

	public ims.domain.lookups.LookupInstance getGeneralAnaesthetic() {
		return generalAnaesthetic;
	}
	public void setGeneralAnaesthetic(ims.domain.lookups.LookupInstance generalAnaesthetic) {
		this.generalAnaesthetic = generalAnaesthetic;
	}

	public Boolean isCanNurseCarryOutProcedure() {
		return canNurseCarryOutProcedure;
	}
	public void setCanNurseCarryOutProcedure(Boolean canNurseCarryOutProcedure) {
		this.canNurseCarryOutProcedure = canNurseCarryOutProcedure;
	}

	public String getDetailsForNonGAEndoProcedure() {
		return detailsForNonGAEndoProcedure;
	}
	public void setDetailsForNonGAEndoProcedure(String detailsForNonGAEndoProcedure) {
		if ( null != detailsForNonGAEndoProcedure && detailsForNonGAEndoProcedure.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for detailsForNonGAEndoProcedure. Tried to set value: "+
				detailsForNonGAEndoProcedure);
		}
		this.detailsForNonGAEndoProcedure = detailsForNonGAEndoProcedure;
	}

	public Boolean isPreAssessmentRequired() {
		return preAssessmentRequired;
	}
	public void setPreAssessmentRequired(Boolean preAssessmentRequired) {
		this.preAssessmentRequired = preAssessmentRequired;
	}

	public Boolean isMedicationShouldBeStoppedOralBowelPrep() {
		return medicationShouldBeStoppedOralBowelPrep;
	}
	public void setMedicationShouldBeStoppedOralBowelPrep(Boolean medicationShouldBeStoppedOralBowelPrep) {
		this.medicationShouldBeStoppedOralBowelPrep = medicationShouldBeStoppedOralBowelPrep;
	}

	public String getDrugInformation() {
		return drugInformation;
	}
	public void setDrugInformation(String drugInformation) {
		if ( null != drugInformation && drugInformation.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for drugInformation. Tried to set value: "+
				drugInformation);
		}
		this.drugInformation = drugInformation;
	}

	public Boolean isHasPacemakerDefib() {
		return hasPacemakerDefib;
	}
	public void setHasPacemakerDefib(Boolean hasPacemakerDefib) {
		this.hasPacemakerDefib = hasPacemakerDefib;
	}

	public ims.domain.lookups.LookupInstance getRenalFunctionAssessment() {
		return renalFunctionAssessment;
	}
	public void setRenalFunctionAssessment(ims.domain.lookups.LookupInstance renalFunctionAssessment) {
		this.renalFunctionAssessment = renalFunctionAssessment;
	}

	public Boolean isAreThereKeyTherapeutic() {
		return areThereKeyTherapeutic;
	}
	public void setAreThereKeyTherapeutic(Boolean areThereKeyTherapeutic) {
		this.areThereKeyTherapeutic = areThereKeyTherapeutic;
	}

	public ims.RefMan.domain.objects.PreAssessmentOutcome getPreAssessmentOutcome() {
		return preAssessmentOutcome;
	}
	public void setPreAssessmentOutcome(ims.RefMan.domain.objects.PreAssessmentOutcome preAssessmentOutcome) {
		this.preAssessmentOutcome = preAssessmentOutcome;
	}

	public ims.domain.lookups.LookupInstance getFitForSurgery() {
		return fitForSurgery;
	}
	public void setFitForSurgery(ims.domain.lookups.LookupInstance fitForSurgery) {
		this.fitForSurgery = fitForSurgery;
	}

	public Boolean isOperativeProcedureStatus() {
		return operativeProcedureStatus;
	}
	public void setOperativeProcedureStatus(Boolean operativeProcedureStatus) {
		this.operativeProcedureStatus = operativeProcedureStatus;
	}

	public Boolean isIsConsultantPerformingProcedure() {
		return isConsultantPerformingProcedure;
	}
	public void setIsConsultantPerformingProcedure(Boolean isConsultantPerformingProcedure) {
		this.isConsultantPerformingProcedure = isConsultantPerformingProcedure;
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

	public String getOperateOnAnticoagulantComment() {
		return operateOnAnticoagulantComment;
	}
	public void setOperateOnAnticoagulantComment(String operateOnAnticoagulantComment) {
		if ( null != operateOnAnticoagulantComment && operateOnAnticoagulantComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for operateOnAnticoagulantComment. Tried to set value: "+
				operateOnAnticoagulantComment);
		}
		this.operateOnAnticoagulantComment = operateOnAnticoagulantComment;
	}

	public Boolean isTakesLongerThanStandardTime() {
		return takesLongerThanStandardTime;
	}
	public void setTakesLongerThanStandardTime(Boolean takesLongerThanStandardTime) {
		this.takesLongerThanStandardTime = takesLongerThanStandardTime;
	}

	public ims.scheduling.domain.objects.AppointmentOutcomeAction getAppointmentOutcomeAction() {
		return appointmentOutcomeAction;
	}
	public void setAppointmentOutcomeAction(ims.scheduling.domain.objects.AppointmentOutcomeAction appointmentOutcomeAction) {
		this.appointmentOutcomeAction = appointmentOutcomeAction;
	}

	public Boolean isAnaesthetistRequiredInTheatre() {
		return anaesthetistRequiredInTheatre;
	}
	public void setAnaesthetistRequiredInTheatre(Boolean anaesthetistRequiredInTheatre) {
		this.anaesthetistRequiredInTheatre = anaesthetistRequiredInTheatre;
	}

	public ims.domain.lookups.LookupInstance getCareGiven() {
		return careGiven;
	}
	public void setCareGiven(ims.domain.lookups.LookupInstance careGiven) {
		this.careGiven = careGiven;
	}

	public ims.domain.lookups.LookupInstance getAdmissionType() {
		return admissionType;
	}
	public void setAdmissionType(ims.domain.lookups.LookupInstance admissionType) {
		this.admissionType = admissionType;
	}

	public Integer getAdmittedIn() {
		return admittedIn;
	}
	public void setAdmittedIn(Integer admittedIn) {
		this.admittedIn = admittedIn;
	}

	public ims.domain.lookups.LookupInstance getAdmittedInUnitOfTime() {
		return admittedInUnitOfTime;
	}
	public void setAdmittedInUnitOfTime(ims.domain.lookups.LookupInstance admittedInUnitOfTime) {
		this.admittedInUnitOfTime = admittedInUnitOfTime;
	}

	public Integer getNumberOfProviderTCICancellations() {
		return numberOfProviderTCICancellations;
	}
	public void setNumberOfProviderTCICancellations(Integer numberOfProviderTCICancellations) {
		this.numberOfProviderTCICancellations = numberOfProviderTCICancellations;
	}

	public Boolean isWas28DayRuleApplied() {
		return was28DayRuleApplied;
	}
	public void setWas28DayRuleApplied(Boolean was28DayRuleApplied) {
		this.was28DayRuleApplied = was28DayRuleApplied;
	}

	public String getCognitiveComments() {
		return cognitiveComments;
	}
	public void setCognitiveComments(String cognitiveComments) {
		if ( null != cognitiveComments && cognitiveComments.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cognitiveComments. Tried to set value: "+
				cognitiveComments);
		}
		this.cognitiveComments = cognitiveComments;
	}

	public Integer getToBePlannedIn() {
		return toBePlannedIn;
	}
	public void setToBePlannedIn(Integer toBePlannedIn) {
		this.toBePlannedIn = toBePlannedIn;
	}

	public ims.domain.lookups.LookupInstance getToBePlannedInUnit() {
		return toBePlannedInUnit;
	}
	public void setToBePlannedInUnit(ims.domain.lookups.LookupInstance toBePlannedInUnit) {
		this.toBePlannedInUnit = toBePlannedInUnit;
	}

	public java.util.Date getPlannedDate() {
		return plannedDate;
	}
	public void setPlannedDate(java.util.Date plannedDate) {
		this.plannedDate = plannedDate;
	}

	public Boolean isIsSuitableForTelephoneAssessment() {
		return isSuitableForTelephoneAssessment;
	}
	public void setIsSuitableForTelephoneAssessment(Boolean isSuitableForTelephoneAssessment) {
		this.isSuitableForTelephoneAssessment = isSuitableForTelephoneAssessment;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getPreAssessmentAppointment() {
		return preAssessmentAppointment;
	}
	public void setPreAssessmentAppointment(ims.scheduling.domain.objects.Booking_Appointment preAssessmentAppointment) {
		this.preAssessmentAppointment = preAssessmentAppointment;
	}

	public Boolean isSubjectTo28DayRule() {
		return subjectTo28DayRule;
	}
	public void setSubjectTo28DayRule(Boolean subjectTo28DayRule) {
		this.subjectTo28DayRule = subjectTo28DayRule;
	}

	public ims.domain.lookups.LookupInstance getRule28DayStatus() {
		return rule28DayStatus;
	}
	public void setRule28DayStatus(ims.domain.lookups.LookupInstance rule28DayStatus) {
		this.rule28DayStatus = rule28DayStatus;
	}

	public java.util.Date getRule28DayPeriodStart() {
		return rule28DayPeriodStart;
	}
	public void setRule28DayPeriodStart(java.util.Date rule28DayPeriodStart) {
		this.rule28DayPeriodStart = rule28DayPeriodStart;
	}

	public Boolean isMultiServiceCase() {
		return multiServiceCase;
	}
	public void setMultiServiceCase(Boolean multiServiceCase) {
		this.multiServiceCase = multiServiceCase;
	}

	public Boolean isRequiresVetting() {
		return requiresVetting;
	}
	public void setRequiresVetting(Boolean requiresVetting) {
		this.requiresVetting = requiresVetting;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getTheatreAppointment() {
		return theatreAppointment;
	}
	public void setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment theatreAppointment) {
		this.theatreAppointment = theatreAppointment;
	}

	public ims.core.resource.place.domain.objects.Location getWard() {
		return ward;
	}
	public void setWard(ims.core.resource.place.domain.objects.Location ward) {
		this.ward = ward;
	}

	public java.util.Date getVettingDate() {
		return vettingDate;
	}
	public void setVettingDate(java.util.Date vettingDate) {
		this.vettingDate = vettingDate;
	}

	public ims.core.resource.people.domain.objects.Hcp getVettingHCP() {
		return vettingHCP;
	}
	public void setVettingHCP(ims.core.resource.people.domain.objects.Hcp vettingHCP) {
		this.vettingHCP = vettingHCP;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInfo() {
		return authoringInfo;
	}
	public void setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation authoringInfo) {
		this.authoringInfo = authoringInfo;
	}

	public ims.domain.lookups.LookupInstance getPatientCategory() {
		return patientCategory;
	}
	public void setPatientCategory(ims.domain.lookups.LookupInstance patientCategory) {
		this.patientCategory = patientCategory;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingUser() {
		return recordingUser;
	}
	public void setRecordingUser(ims.core.clinical.domain.objects.RecordingUserInformation recordingUser) {
		this.recordingUser = recordingUser;
	}

	public ims.domain.lookups.LookupInstance getPreColonoscopyAssessmentRequired() {
		return preColonoscopyAssessmentRequired;
	}
	public void setPreColonoscopyAssessmentRequired(ims.domain.lookups.LookupInstance preColonoscopyAssessmentRequired) {
		this.preColonoscopyAssessmentRequired = preColonoscopyAssessmentRequired;
	}

	public ims.core.resource.people.domain.objects.Hcp getResponsibleHCP() {
		return responsibleHCP;
	}
	public void setResponsibleHCP(ims.core.resource.people.domain.objects.Hcp responsibleHCP) {
		this.responsibleHCP = responsibleHCP;
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
		auditStr.append("\r\n*electiveAdmissionType* :");
		if (electiveAdmissionType != null)
			auditStr.append(electiveAdmissionType.getText());
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
		int i4=0;
		for (i4=0; i4<electiveListStatusHistory.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.ElectiveListStatus obj = (ims.RefMan.domain.objects.ElectiveListStatus)electiveListStatusHistory.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*creatingAppointment* :");
		if (creatingAppointment != null)
		{
			auditStr.append(toShortClassName(creatingAppointment));
				
		    auditStr.append(creatingAppointment.getId());
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
		auditStr.append("\r\n*hospital* :");
		if (hospital != null)
		{
			auditStr.append(toShortClassName(hospital));
				
		    auditStr.append(hospital.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bed* :");
		auditStr.append(bed);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientStatus* :");
		if (patientStatus != null)
			auditStr.append(patientStatus.getText());
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
		int i17=0;
		for (i17=0; i17<tCIHistory.size(); i17++)
		{
			if (i17 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.TCIForPatientElectiveList obj = (ims.RefMan.domain.objects.TCIForPatientElectiveList)tCIHistory.get(i17);
		    if (obj != null)
			{
				if (i17 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i17 > 0)
			auditStr.append("] " + i17);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tCIGiven* :");
		auditStr.append(tCIGiven);
	    auditStr.append("; ");
		auditStr.append("\r\n*tCICancelledByProvider* :");
		auditStr.append(tCICancelledByProvider);
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
		int i23=0;
		for (i23=0; i23<eRODHistory.size(); i23++)
		{
			if (i23 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.ReferralEROD obj = (ims.RefMan.domain.objects.ReferralEROD)eRODHistory.get(i23);
		    if (obj != null)
			{
				if (i23 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i23 > 0)
			auditStr.append("] " + i23);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pathwayClock* :");
		if (pathwayClock != null)
		{
			auditStr.append(toShortClassName(pathwayClock));
				
		    auditStr.append(pathwayClock.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*reviews* :");
		if (reviews != null)
		{
			java.util.Iterator it25 = reviews.iterator();
			int i25=0;
			while (it25.hasNext())
			{
				if (i25 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.ReviewPatientElectiveList obj = (ims.RefMan.domain.objects.ReviewPatientElectiveList)it25.next();
		if (obj != null)
		{
		   if (i25 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i25++;
		}
		if (i25 > 0)
			auditStr.append("] " + i25);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		if (notes != null)
		{
			java.util.Iterator it26 = notes.iterator();
			int i26=0;
			while (it26.hasNext())
			{
				if (i26 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.NotesForPatientElectiveList obj = (ims.RefMan.domain.objects.NotesForPatientElectiveList)it26.next();
		if (obj != null)
		{
		   if (i26 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i26++;
		}
		if (i26 > 0)
			auditStr.append("] " + i26);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*admissions* :");
		if (admissions != null)
		{
		int i27=0;
		for (i27=0; i27<admissions.size(); i27++)
		{
			if (i27 > 0)
				auditStr.append(",");
			ims.core.admin.pas.domain.objects.AdmissionDetail obj = (ims.core.admin.pas.domain.objects.AdmissionDetail)admissions.get(i27);
		    if (obj != null)
			{
				if (i27 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i27 > 0)
			auditStr.append("] " + i27);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*intendedManagement* :");
		if (intendedManagement != null)
			auditStr.append(intendedManagement.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wasPossibleDateGiven* :");
		auditStr.append(wasPossibleDateGiven);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateGivenToPatient* :");
		auditStr.append(dateGivenToPatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryProcedure* :");
		if (primaryProcedure != null)
		{
			auditStr.append(toShortClassName(primaryProcedure));
				
		    auditStr.append(primaryProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procLaterality* :");
		if (procLaterality != null)
			auditStr.append(procLaterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureDescription* :");
		auditStr.append(procedureDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*secondaryProcedure* :");
		if (secondaryProcedure != null)
		{
			auditStr.append(toShortClassName(secondaryProcedure));
				
		    auditStr.append(secondaryProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*secondaryProcLaterality* :");
		if (secondaryProcLaterality != null)
			auditStr.append(secondaryProcLaterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anticipatedProcedureLength* :");
		auditStr.append(anticipatedProcedureLength);
	    auditStr.append("; ");
		auditStr.append("\r\n*priority* :");
		if (priority != null)
			auditStr.append(priority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticType* :");
		if (anaestheticType != null)
			auditStr.append(anaestheticType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wLAnaestheticType* :");
		if (wLAnaestheticType != null)
			auditStr.append(wLAnaestheticType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*availableAtShortNotice* :");
		auditStr.append(availableAtShortNotice);
	    auditStr.append("; ");
		auditStr.append("\r\n*availableAtShortNoticePeriod* :");
		auditStr.append(availableAtShortNoticePeriod);
	    auditStr.append("; ");
		auditStr.append("\r\n*wLAvailableAtShortNotice* :");
		auditStr.append(wLAvailableAtShortNotice);
	    auditStr.append("; ");
		auditStr.append("\r\n*wLAvailableAtShortNoticePeriod* :");
		auditStr.append(wLAvailableAtShortNoticePeriod);
	    auditStr.append("; ");
		auditStr.append("\r\n*preOperativeOvernightStayRequired* :");
		auditStr.append(preOperativeOvernightStayRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*wLPreOperativeOvernightStayRequired* :");
		auditStr.append(wLPreOperativeOvernightStayRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*noOfPreOperativeNights* :");
		auditStr.append(noOfPreOperativeNights);
	    auditStr.append("; ");
		auditStr.append("\r\n*wLNoOfPreOperativeNights* :");
		auditStr.append(wLNoOfPreOperativeNights);
	    auditStr.append("; ");
		auditStr.append("\r\n*anticipatedStay* :");
		auditStr.append(anticipatedStay);
	    auditStr.append("; ");
		auditStr.append("\r\n*wLAnticipatedStay* :");
		auditStr.append(wLAnticipatedStay);
	    auditStr.append("; ");
		auditStr.append("\r\n*requiredTheatreType* :");
		if (requiredTheatreType != null)
			auditStr.append(requiredTheatreType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*criticalCareBedRequired* :");
		auditStr.append(criticalCareBedRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*hDUBedRequired* :");
		auditStr.append(hDUBedRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*iTUBedRequired* :");
		auditStr.append(iTUBedRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthesisRiskAssessmentRequest* :");
		auditStr.append(anaesthesisRiskAssessmentRequest);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientReceivingAnticoagulantTherapy* :");
		if (patientReceivingAnticoagulantTherapy != null)
			auditStr.append(patientReceivingAnticoagulantTherapy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wLPatientReceivingAnticoagulantTherapy* :");
		if (wLPatientReceivingAnticoagulantTherapy != null)
			auditStr.append(wLPatientReceivingAnticoagulantTherapy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*followPeriOperativeguidelines* :");
		if (followPeriOperativeguidelines != null)
			auditStr.append(followPeriOperativeguidelines.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*periOpNoReasonComments* :");
		auditStr.append(periOpNoReasonComments);
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
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*proceduredToBeCarriedBy* :");
		if (proceduredToBeCarriedBy != null)
			auditStr.append(proceduredToBeCarriedBy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureCarriedOutBy* :");
		if (procedureCarriedOutBy != null)
		{
			auditStr.append(toShortClassName(procedureCarriedOutBy));
				
		    auditStr.append(procedureCarriedOutBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*suspectedGIBleed* :");
		auditStr.append(suspectedGIBleed);
	    auditStr.append("; ");
		auditStr.append("\r\n*points* :");
		auditStr.append(points);
	    auditStr.append("; ");
		auditStr.append("\r\n*suitableforTraining* :");
		auditStr.append(suitableforTraining);
	    auditStr.append("; ");
		auditStr.append("\r\n*generalAnaesthetic* :");
		if (generalAnaesthetic != null)
			auditStr.append(generalAnaesthetic.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*canNurseCarryOutProcedure* :");
		auditStr.append(canNurseCarryOutProcedure);
	    auditStr.append("; ");
		auditStr.append("\r\n*detailsForNonGAEndoProcedure* :");
		auditStr.append(detailsForNonGAEndoProcedure);
	    auditStr.append("; ");
		auditStr.append("\r\n*preAssessmentRequired* :");
		auditStr.append(preAssessmentRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*medicationShouldBeStoppedOralBowelPrep* :");
		auditStr.append(medicationShouldBeStoppedOralBowelPrep);
	    auditStr.append("; ");
		auditStr.append("\r\n*drugInformation* :");
		auditStr.append(drugInformation);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasPacemakerDefib* :");
		auditStr.append(hasPacemakerDefib);
	    auditStr.append("; ");
		auditStr.append("\r\n*renalFunctionAssessment* :");
		if (renalFunctionAssessment != null)
			auditStr.append(renalFunctionAssessment.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*areThereKeyTherapeutic* :");
		auditStr.append(areThereKeyTherapeutic);
	    auditStr.append("; ");
		auditStr.append("\r\n*preAssessmentOutcome* :");
		if (preAssessmentOutcome != null)
		{
			auditStr.append(toShortClassName(preAssessmentOutcome));
				
		    auditStr.append(preAssessmentOutcome.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*fitForSurgery* :");
		if (fitForSurgery != null)
			auditStr.append(fitForSurgery.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*operativeProcedureStatus* :");
		auditStr.append(operativeProcedureStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*isConsultantPerformingProcedure* :");
		auditStr.append(isConsultantPerformingProcedure);
	    auditStr.append("; ");
		auditStr.append("\r\n*otherProcedures* :");
		if (otherProcedures != null)
		{
		int i84=0;
		for (i84=0; i84<otherProcedures.size(); i84++)
		{
			if (i84 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.Procedure obj = (ims.core.clinical.domain.objects.Procedure)otherProcedures.get(i84);
		    if (obj != null)
			{
				if (i84 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i84 > 0)
			auditStr.append("] " + i84);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*operateOnAnticoagulantComment* :");
		auditStr.append(operateOnAnticoagulantComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*takesLongerThanStandardTime* :");
		auditStr.append(takesLongerThanStandardTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*appointmentOutcomeAction* :");
		if (appointmentOutcomeAction != null)
		{
			auditStr.append(toShortClassName(appointmentOutcomeAction));
				
		    auditStr.append(appointmentOutcomeAction.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthetistRequiredInTheatre* :");
		auditStr.append(anaesthetistRequiredInTheatre);
	    auditStr.append("; ");
		auditStr.append("\r\n*careGiven* :");
		if (careGiven != null)
			auditStr.append(careGiven.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionType* :");
		if (admissionType != null)
			auditStr.append(admissionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*admittedIn* :");
		auditStr.append(admittedIn);
	    auditStr.append("; ");
		auditStr.append("\r\n*admittedInUnitOfTime* :");
		if (admittedInUnitOfTime != null)
			auditStr.append(admittedInUnitOfTime.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*numberOfProviderTCICancellations* :");
		auditStr.append(numberOfProviderTCICancellations);
	    auditStr.append("; ");
		auditStr.append("\r\n*was28DayRuleApplied* :");
		auditStr.append(was28DayRuleApplied);
	    auditStr.append("; ");
		auditStr.append("\r\n*cognitiveComments* :");
		auditStr.append(cognitiveComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*toBePlannedIn* :");
		auditStr.append(toBePlannedIn);
	    auditStr.append("; ");
		auditStr.append("\r\n*toBePlannedInUnit* :");
		if (toBePlannedInUnit != null)
			auditStr.append(toBePlannedInUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*plannedDate* :");
		auditStr.append(plannedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSuitableForTelephoneAssessment* :");
		auditStr.append(isSuitableForTelephoneAssessment);
	    auditStr.append("; ");
		auditStr.append("\r\n*preAssessmentAppointment* :");
		if (preAssessmentAppointment != null)
		{
			auditStr.append(toShortClassName(preAssessmentAppointment));
				
		    auditStr.append(preAssessmentAppointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*subjectTo28DayRule* :");
		auditStr.append(subjectTo28DayRule);
	    auditStr.append("; ");
		auditStr.append("\r\n*rule28DayStatus* :");
		if (rule28DayStatus != null)
			auditStr.append(rule28DayStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*rule28DayPeriodStart* :");
		auditStr.append(rule28DayPeriodStart);
	    auditStr.append("; ");
		auditStr.append("\r\n*multiServiceCase* :");
		auditStr.append(multiServiceCase);
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresVetting* :");
		auditStr.append(requiresVetting);
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreAppointment* :");
		if (theatreAppointment != null)
		{
			auditStr.append(toShortClassName(theatreAppointment));
				
		    auditStr.append(theatreAppointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*ward* :");
		if (ward != null)
		{
			auditStr.append(toShortClassName(ward));
				
		    auditStr.append(ward.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*vettingDate* :");
		auditStr.append(vettingDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*vettingHCP* :");
		if (vettingHCP != null)
		{
			auditStr.append(toShortClassName(vettingHCP));
				
		    auditStr.append(vettingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInfo* :");
		if (authoringInfo != null)
		{
			auditStr.append(toShortClassName(authoringInfo));
				
		    auditStr.append(authoringInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientCategory* :");
		if (patientCategory != null)
			auditStr.append(patientCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingUser* :");
		if (recordingUser != null)
		{
			auditStr.append(toShortClassName(recordingUser));
				
		    auditStr.append(recordingUser.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*preColonoscopyAssessmentRequired* :");
		if (preColonoscopyAssessmentRequired != null)
			auditStr.append(preColonoscopyAssessmentRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*responsibleHCP* :");
		if (responsibleHCP != null)
		{
			auditStr.append(toShortClassName(responsibleHCP));
				
		    auditStr.append(responsibleHCP.getId());
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
		if (this.getElectiveAdmissionType() != null)
		{
			sb.append("<electiveAdmissionType>");
			sb.append(this.getElectiveAdmissionType().toXMLString()); 
			sb.append("</electiveAdmissionType>");		
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
		if (this.getCreatingAppointment() != null)
		{
			sb.append("<creatingAppointment>");
			sb.append(this.getCreatingAppointment().toXMLString(domMap)); 	
			sb.append("</creatingAppointment>");		
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
		if (this.getHospital() != null)
		{
			sb.append("<hospital>");
			sb.append(this.getHospital().toXMLString(domMap)); 	
			sb.append("</hospital>");		
		}
		if (this.getBed() != null)
		{
			sb.append("<bed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBed().toString()));
			sb.append("</bed>");		
		}
		if (this.getPatientStatus() != null)
		{
			sb.append("<patientStatus>");
			sb.append(this.getPatientStatus().toXMLString()); 
			sb.append("</patientStatus>");		
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
		if (this.isTCIGiven() != null)
		{
			sb.append("<tCIGiven>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTCIGiven().toString()));
			sb.append("</tCIGiven>");		
		}
		if (this.isTCICancelledByProvider() != null)
		{
			sb.append("<tCICancelledByProvider>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTCICancelledByProvider().toString()));
			sb.append("</tCICancelledByProvider>");		
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
		if (this.getReviews() != null)
		{
			if (this.getReviews().size() > 0 )
			{
			sb.append("<reviews>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getReviews(), domMap));
			sb.append("</reviews>");		
			}
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
		if (this.getAdmissions() != null)
		{
			if (this.getAdmissions().size() > 0 )
			{
			sb.append("<admissions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAdmissions(), domMap));
			sb.append("</admissions>");		
			}
		}
		if (this.getIntendedManagement() != null)
		{
			sb.append("<intendedManagement>");
			sb.append(this.getIntendedManagement().toXMLString()); 
			sb.append("</intendedManagement>");		
		}
		if (this.isWasPossibleDateGiven() != null)
		{
			sb.append("<wasPossibleDateGiven>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasPossibleDateGiven().toString()));
			sb.append("</wasPossibleDateGiven>");		
		}
		if (this.getDateGivenToPatient() != null)
		{
			sb.append("<dateGivenToPatient>");
			sb.append(new ims.framework.utils.DateTime(this.getDateGivenToPatient()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateGivenToPatient>");		
		}
		if (this.getPrimaryProcedure() != null)
		{
			sb.append("<primaryProcedure>");
			sb.append(this.getPrimaryProcedure().toXMLString(domMap)); 	
			sb.append("</primaryProcedure>");		
		}
		if (this.getProcLaterality() != null)
		{
			sb.append("<procLaterality>");
			sb.append(this.getProcLaterality().toXMLString()); 
			sb.append("</procLaterality>");		
		}
		if (this.getProcedureDescription() != null)
		{
			sb.append("<procedureDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcedureDescription().toString()));
			sb.append("</procedureDescription>");		
		}
		if (this.getSecondaryProcedure() != null)
		{
			sb.append("<secondaryProcedure>");
			sb.append(this.getSecondaryProcedure().toXMLString(domMap)); 	
			sb.append("</secondaryProcedure>");		
		}
		if (this.getSecondaryProcLaterality() != null)
		{
			sb.append("<secondaryProcLaterality>");
			sb.append(this.getSecondaryProcLaterality().toXMLString()); 
			sb.append("</secondaryProcLaterality>");		
		}
		if (this.getAnticipatedProcedureLength() != null)
		{
			sb.append("<anticipatedProcedureLength>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnticipatedProcedureLength().toString()));
			sb.append("</anticipatedProcedureLength>");		
		}
		if (this.getPriority() != null)
		{
			sb.append("<priority>");
			sb.append(this.getPriority().toXMLString()); 
			sb.append("</priority>");		
		}
		if (this.getAnaestheticType() != null)
		{
			sb.append("<anaestheticType>");
			sb.append(this.getAnaestheticType().toXMLString()); 
			sb.append("</anaestheticType>");		
		}
		if (this.getWLAnaestheticType() != null)
		{
			sb.append("<wLAnaestheticType>");
			sb.append(this.getWLAnaestheticType().toXMLString()); 
			sb.append("</wLAnaestheticType>");		
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
		if (this.isWLAvailableAtShortNotice() != null)
		{
			sb.append("<wLAvailableAtShortNotice>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWLAvailableAtShortNotice().toString()));
			sb.append("</wLAvailableAtShortNotice>");		
		}
		if (this.getWLAvailableAtShortNoticePeriod() != null)
		{
			sb.append("<wLAvailableAtShortNoticePeriod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWLAvailableAtShortNoticePeriod().toString()));
			sb.append("</wLAvailableAtShortNoticePeriod>");		
		}
		if (this.isPreOperativeOvernightStayRequired() != null)
		{
			sb.append("<preOperativeOvernightStayRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPreOperativeOvernightStayRequired().toString()));
			sb.append("</preOperativeOvernightStayRequired>");		
		}
		if (this.isWLPreOperativeOvernightStayRequired() != null)
		{
			sb.append("<wLPreOperativeOvernightStayRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWLPreOperativeOvernightStayRequired().toString()));
			sb.append("</wLPreOperativeOvernightStayRequired>");		
		}
		if (this.getNoOfPreOperativeNights() != null)
		{
			sb.append("<noOfPreOperativeNights>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNoOfPreOperativeNights().toString()));
			sb.append("</noOfPreOperativeNights>");		
		}
		if (this.getWLNoOfPreOperativeNights() != null)
		{
			sb.append("<wLNoOfPreOperativeNights>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWLNoOfPreOperativeNights().toString()));
			sb.append("</wLNoOfPreOperativeNights>");		
		}
		if (this.getAnticipatedStay() != null)
		{
			sb.append("<anticipatedStay>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnticipatedStay().toString()));
			sb.append("</anticipatedStay>");		
		}
		if (this.getWLAnticipatedStay() != null)
		{
			sb.append("<wLAnticipatedStay>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWLAnticipatedStay().toString()));
			sb.append("</wLAnticipatedStay>");		
		}
		if (this.getRequiredTheatreType() != null)
		{
			sb.append("<requiredTheatreType>");
			sb.append(this.getRequiredTheatreType().toXMLString()); 
			sb.append("</requiredTheatreType>");		
		}
		if (this.isCriticalCareBedRequired() != null)
		{
			sb.append("<criticalCareBedRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCriticalCareBedRequired().toString()));
			sb.append("</criticalCareBedRequired>");		
		}
		if (this.isHDUBedRequired() != null)
		{
			sb.append("<hDUBedRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHDUBedRequired().toString()));
			sb.append("</hDUBedRequired>");		
		}
		if (this.isITUBedRequired() != null)
		{
			sb.append("<iTUBedRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isITUBedRequired().toString()));
			sb.append("</iTUBedRequired>");		
		}
		if (this.isAnaesthesisRiskAssessmentRequest() != null)
		{
			sb.append("<anaesthesisRiskAssessmentRequest>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAnaesthesisRiskAssessmentRequest().toString()));
			sb.append("</anaesthesisRiskAssessmentRequest>");		
		}
		if (this.getPatientReceivingAnticoagulantTherapy() != null)
		{
			sb.append("<patientReceivingAnticoagulantTherapy>");
			sb.append(this.getPatientReceivingAnticoagulantTherapy().toXMLString()); 
			sb.append("</patientReceivingAnticoagulantTherapy>");		
		}
		if (this.getWLPatientReceivingAnticoagulantTherapy() != null)
		{
			sb.append("<wLPatientReceivingAnticoagulantTherapy>");
			sb.append(this.getWLPatientReceivingAnticoagulantTherapy().toXMLString()); 
			sb.append("</wLPatientReceivingAnticoagulantTherapy>");		
		}
		if (this.getFollowPeriOperativeguidelines() != null)
		{
			sb.append("<followPeriOperativeguidelines>");
			sb.append(this.getFollowPeriOperativeguidelines().toXMLString()); 
			sb.append("</followPeriOperativeguidelines>");		
		}
		if (this.getPeriOpNoReasonComments() != null)
		{
			sb.append("<periOpNoReasonComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPeriOpNoReasonComments().toString()));
			sb.append("</periOpNoReasonComments>");		
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
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getProceduredToBeCarriedBy() != null)
		{
			sb.append("<proceduredToBeCarriedBy>");
			sb.append(this.getProceduredToBeCarriedBy().toXMLString()); 
			sb.append("</proceduredToBeCarriedBy>");		
		}
		if (this.getProcedureCarriedOutBy() != null)
		{
			sb.append("<procedureCarriedOutBy>");
			sb.append(this.getProcedureCarriedOutBy().toXMLString(domMap)); 	
			sb.append("</procedureCarriedOutBy>");		
		}
		if (this.isSuspectedGIBleed() != null)
		{
			sb.append("<suspectedGIBleed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSuspectedGIBleed().toString()));
			sb.append("</suspectedGIBleed>");		
		}
		if (this.getPoints() != null)
		{
			sb.append("<points>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPoints().toString()));
			sb.append("</points>");		
		}
		if (this.isSuitableforTraining() != null)
		{
			sb.append("<suitableforTraining>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSuitableforTraining().toString()));
			sb.append("</suitableforTraining>");		
		}
		if (this.getGeneralAnaesthetic() != null)
		{
			sb.append("<generalAnaesthetic>");
			sb.append(this.getGeneralAnaesthetic().toXMLString()); 
			sb.append("</generalAnaesthetic>");		
		}
		if (this.isCanNurseCarryOutProcedure() != null)
		{
			sb.append("<canNurseCarryOutProcedure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCanNurseCarryOutProcedure().toString()));
			sb.append("</canNurseCarryOutProcedure>");		
		}
		if (this.getDetailsForNonGAEndoProcedure() != null)
		{
			sb.append("<detailsForNonGAEndoProcedure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDetailsForNonGAEndoProcedure().toString()));
			sb.append("</detailsForNonGAEndoProcedure>");		
		}
		if (this.isPreAssessmentRequired() != null)
		{
			sb.append("<preAssessmentRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPreAssessmentRequired().toString()));
			sb.append("</preAssessmentRequired>");		
		}
		if (this.isMedicationShouldBeStoppedOralBowelPrep() != null)
		{
			sb.append("<medicationShouldBeStoppedOralBowelPrep>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMedicationShouldBeStoppedOralBowelPrep().toString()));
			sb.append("</medicationShouldBeStoppedOralBowelPrep>");		
		}
		if (this.getDrugInformation() != null)
		{
			sb.append("<drugInformation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDrugInformation().toString()));
			sb.append("</drugInformation>");		
		}
		if (this.isHasPacemakerDefib() != null)
		{
			sb.append("<hasPacemakerDefib>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasPacemakerDefib().toString()));
			sb.append("</hasPacemakerDefib>");		
		}
		if (this.getRenalFunctionAssessment() != null)
		{
			sb.append("<renalFunctionAssessment>");
			sb.append(this.getRenalFunctionAssessment().toXMLString()); 
			sb.append("</renalFunctionAssessment>");		
		}
		if (this.isAreThereKeyTherapeutic() != null)
		{
			sb.append("<areThereKeyTherapeutic>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAreThereKeyTherapeutic().toString()));
			sb.append("</areThereKeyTherapeutic>");		
		}
		if (this.getPreAssessmentOutcome() != null)
		{
			sb.append("<preAssessmentOutcome>");
			sb.append(this.getPreAssessmentOutcome().toXMLString(domMap)); 	
			sb.append("</preAssessmentOutcome>");		
		}
		if (this.getFitForSurgery() != null)
		{
			sb.append("<fitForSurgery>");
			sb.append(this.getFitForSurgery().toXMLString()); 
			sb.append("</fitForSurgery>");		
		}
		if (this.isOperativeProcedureStatus() != null)
		{
			sb.append("<operativeProcedureStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isOperativeProcedureStatus().toString()));
			sb.append("</operativeProcedureStatus>");		
		}
		if (this.isIsConsultantPerformingProcedure() != null)
		{
			sb.append("<isConsultantPerformingProcedure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsConsultantPerformingProcedure().toString()));
			sb.append("</isConsultantPerformingProcedure>");		
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
		if (this.getOperateOnAnticoagulantComment() != null)
		{
			sb.append("<operateOnAnticoagulantComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOperateOnAnticoagulantComment().toString()));
			sb.append("</operateOnAnticoagulantComment>");		
		}
		if (this.isTakesLongerThanStandardTime() != null)
		{
			sb.append("<takesLongerThanStandardTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTakesLongerThanStandardTime().toString()));
			sb.append("</takesLongerThanStandardTime>");		
		}
		if (this.getAppointmentOutcomeAction() != null)
		{
			sb.append("<appointmentOutcomeAction>");
			sb.append(this.getAppointmentOutcomeAction().toXMLString(domMap)); 	
			sb.append("</appointmentOutcomeAction>");		
		}
		if (this.isAnaesthetistRequiredInTheatre() != null)
		{
			sb.append("<anaesthetistRequiredInTheatre>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAnaesthetistRequiredInTheatre().toString()));
			sb.append("</anaesthetistRequiredInTheatre>");		
		}
		if (this.getCareGiven() != null)
		{
			sb.append("<careGiven>");
			sb.append(this.getCareGiven().toXMLString()); 
			sb.append("</careGiven>");		
		}
		if (this.getAdmissionType() != null)
		{
			sb.append("<admissionType>");
			sb.append(this.getAdmissionType().toXMLString()); 
			sb.append("</admissionType>");		
		}
		if (this.getAdmittedIn() != null)
		{
			sb.append("<admittedIn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdmittedIn().toString()));
			sb.append("</admittedIn>");		
		}
		if (this.getAdmittedInUnitOfTime() != null)
		{
			sb.append("<admittedInUnitOfTime>");
			sb.append(this.getAdmittedInUnitOfTime().toXMLString()); 
			sb.append("</admittedInUnitOfTime>");		
		}
		if (this.getNumberOfProviderTCICancellations() != null)
		{
			sb.append("<numberOfProviderTCICancellations>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumberOfProviderTCICancellations().toString()));
			sb.append("</numberOfProviderTCICancellations>");		
		}
		if (this.isWas28DayRuleApplied() != null)
		{
			sb.append("<was28DayRuleApplied>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWas28DayRuleApplied().toString()));
			sb.append("</was28DayRuleApplied>");		
		}
		if (this.getCognitiveComments() != null)
		{
			sb.append("<cognitiveComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCognitiveComments().toString()));
			sb.append("</cognitiveComments>");		
		}
		if (this.getToBePlannedIn() != null)
		{
			sb.append("<toBePlannedIn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getToBePlannedIn().toString()));
			sb.append("</toBePlannedIn>");		
		}
		if (this.getToBePlannedInUnit() != null)
		{
			sb.append("<toBePlannedInUnit>");
			sb.append(this.getToBePlannedInUnit().toXMLString()); 
			sb.append("</toBePlannedInUnit>");		
		}
		if (this.getPlannedDate() != null)
		{
			sb.append("<plannedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getPlannedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</plannedDate>");		
		}
		if (this.isIsSuitableForTelephoneAssessment() != null)
		{
			sb.append("<isSuitableForTelephoneAssessment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsSuitableForTelephoneAssessment().toString()));
			sb.append("</isSuitableForTelephoneAssessment>");		
		}
		if (this.getPreAssessmentAppointment() != null)
		{
			sb.append("<preAssessmentAppointment>");
			sb.append(this.getPreAssessmentAppointment().toXMLString(domMap)); 	
			sb.append("</preAssessmentAppointment>");		
		}
		if (this.isSubjectTo28DayRule() != null)
		{
			sb.append("<subjectTo28DayRule>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSubjectTo28DayRule().toString()));
			sb.append("</subjectTo28DayRule>");		
		}
		if (this.getRule28DayStatus() != null)
		{
			sb.append("<rule28DayStatus>");
			sb.append(this.getRule28DayStatus().toXMLString()); 
			sb.append("</rule28DayStatus>");		
		}
		if (this.getRule28DayPeriodStart() != null)
		{
			sb.append("<rule28DayPeriodStart>");
			sb.append(new ims.framework.utils.DateTime(this.getRule28DayPeriodStart()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</rule28DayPeriodStart>");		
		}
		if (this.isMultiServiceCase() != null)
		{
			sb.append("<multiServiceCase>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMultiServiceCase().toString()));
			sb.append("</multiServiceCase>");		
		}
		if (this.isRequiresVetting() != null)
		{
			sb.append("<requiresVetting>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRequiresVetting().toString()));
			sb.append("</requiresVetting>");		
		}
		if (this.getTheatreAppointment() != null)
		{
			sb.append("<theatreAppointment>");
			sb.append(this.getTheatreAppointment().toXMLString(domMap)); 	
			sb.append("</theatreAppointment>");		
		}
		if (this.getWard() != null)
		{
			sb.append("<ward>");
			sb.append(this.getWard().toXMLString(domMap)); 	
			sb.append("</ward>");		
		}
		if (this.getVettingDate() != null)
		{
			sb.append("<vettingDate>");
			sb.append(new ims.framework.utils.DateTime(this.getVettingDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</vettingDate>");		
		}
		if (this.getVettingHCP() != null)
		{
			sb.append("<vettingHCP>");
			sb.append(this.getVettingHCP().toXMLString(domMap)); 	
			sb.append("</vettingHCP>");		
		}
		if (this.getAuthoringInfo() != null)
		{
			sb.append("<authoringInfo>");
			sb.append(this.getAuthoringInfo().toXMLString(domMap)); 	
			sb.append("</authoringInfo>");		
		}
		if (this.getPatientCategory() != null)
		{
			sb.append("<patientCategory>");
			sb.append(this.getPatientCategory().toXMLString()); 
			sb.append("</patientCategory>");		
		}
		if (this.getRecordingUser() != null)
		{
			sb.append("<recordingUser>");
			sb.append(this.getRecordingUser().toXMLString(domMap)); 	
			sb.append("</recordingUser>");		
		}
		if (this.getPreColonoscopyAssessmentRequired() != null)
		{
			sb.append("<preColonoscopyAssessmentRequired>");
			sb.append(this.getPreColonoscopyAssessmentRequired().toXMLString()); 
			sb.append("</preColonoscopyAssessmentRequired>");		
		}
		if (this.getResponsibleHCP() != null)
		{
			sb.append("<responsibleHCP>");
			sb.append(this.getResponsibleHCP().toXMLString(domMap)); 	
			sb.append("</responsibleHCP>");		
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
		fldEl = el.element("electiveAdmissionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setElectiveAdmissionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		fldEl = el.element("creatingAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCreatingAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
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
		fldEl = el.element("hospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHospital(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bed");
		if(fldEl != null)
		{	
    		obj.setBed(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		fldEl = el.element("tCIGiven");
		if(fldEl != null)
		{	
    		obj.setTCIGiven(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tCICancelledByProvider");
		if(fldEl != null)
		{	
    		obj.setTCICancelledByProvider(new Boolean(fldEl.getTextTrim()));	
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
		fldEl = el.element("reviews");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setReviews(ims.RefMan.domain.objects.ReviewPatientElectiveList.fromSetXMLString(fldEl, factory, obj.getReviews(), domMap));
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setNotes(ims.RefMan.domain.objects.NotesForPatientElectiveList.fromSetXMLString(fldEl, factory, obj.getNotes(), domMap));
		}
		fldEl = el.element("admissions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAdmissions(ims.core.admin.pas.domain.objects.AdmissionDetail.fromListXMLString(fldEl, factory, obj.getAdmissions(), domMap));
		}
		fldEl = el.element("intendedManagement");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIntendedManagement(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wasPossibleDateGiven");
		if(fldEl != null)
		{	
    		obj.setWasPossibleDateGiven(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateGivenToPatient");
		if(fldEl != null)
		{	
    		obj.setDateGivenToPatient(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("primaryProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrimaryProcedure(ims.core.clinical.domain.objects.Procedure.getProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procLaterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("procedureDescription");
		if(fldEl != null)
		{	
    		obj.setProcedureDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("secondaryProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSecondaryProcedure(ims.core.clinical.domain.objects.Procedure.getProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("secondaryProcLaterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSecondaryProcLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anticipatedProcedureLength");
		if(fldEl != null)
		{	
    		obj.setAnticipatedProcedureLength(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("priority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anaestheticType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnaestheticType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wLAnaestheticType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWLAnaestheticType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		fldEl = el.element("wLAvailableAtShortNotice");
		if(fldEl != null)
		{	
    		obj.setWLAvailableAtShortNotice(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wLAvailableAtShortNoticePeriod");
		if(fldEl != null)
		{	
    		obj.setWLAvailableAtShortNoticePeriod(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("preOperativeOvernightStayRequired");
		if(fldEl != null)
		{	
    		obj.setPreOperativeOvernightStayRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wLPreOperativeOvernightStayRequired");
		if(fldEl != null)
		{	
    		obj.setWLPreOperativeOvernightStayRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noOfPreOperativeNights");
		if(fldEl != null)
		{	
    		obj.setNoOfPreOperativeNights(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wLNoOfPreOperativeNights");
		if(fldEl != null)
		{	
    		obj.setWLNoOfPreOperativeNights(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anticipatedStay");
		if(fldEl != null)
		{	
    		obj.setAnticipatedStay(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wLAnticipatedStay");
		if(fldEl != null)
		{	
    		obj.setWLAnticipatedStay(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requiredTheatreType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRequiredTheatreType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("criticalCareBedRequired");
		if(fldEl != null)
		{	
    		obj.setCriticalCareBedRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hDUBedRequired");
		if(fldEl != null)
		{	
    		obj.setHDUBedRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("iTUBedRequired");
		if(fldEl != null)
		{	
    		obj.setITUBedRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anaesthesisRiskAssessmentRequest");
		if(fldEl != null)
		{	
    		obj.setAnaesthesisRiskAssessmentRequest(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientReceivingAnticoagulantTherapy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientReceivingAnticoagulantTherapy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wLPatientReceivingAnticoagulantTherapy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWLPatientReceivingAnticoagulantTherapy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("followPeriOperativeguidelines");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFollowPeriOperativeguidelines(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("periOpNoReasonComments");
		if(fldEl != null)
		{	
    		obj.setPeriOpNoReasonComments(new String(fldEl.getTextTrim()));	
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
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("proceduredToBeCarriedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProceduredToBeCarriedBy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("procedureCarriedOutBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedureCarriedOutBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("suspectedGIBleed");
		if(fldEl != null)
		{	
    		obj.setSuspectedGIBleed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("points");
		if(fldEl != null)
		{	
    		obj.setPoints(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("suitableforTraining");
		if(fldEl != null)
		{	
    		obj.setSuitableforTraining(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("generalAnaesthetic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGeneralAnaesthetic(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("canNurseCarryOutProcedure");
		if(fldEl != null)
		{	
    		obj.setCanNurseCarryOutProcedure(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("detailsForNonGAEndoProcedure");
		if(fldEl != null)
		{	
    		obj.setDetailsForNonGAEndoProcedure(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("preAssessmentRequired");
		if(fldEl != null)
		{	
    		obj.setPreAssessmentRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("medicationShouldBeStoppedOralBowelPrep");
		if(fldEl != null)
		{	
    		obj.setMedicationShouldBeStoppedOralBowelPrep(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("drugInformation");
		if(fldEl != null)
		{	
    		obj.setDrugInformation(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasPacemakerDefib");
		if(fldEl != null)
		{	
    		obj.setHasPacemakerDefib(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("renalFunctionAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRenalFunctionAssessment(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("areThereKeyTherapeutic");
		if(fldEl != null)
		{	
    		obj.setAreThereKeyTherapeutic(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("preAssessmentOutcome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPreAssessmentOutcome(ims.RefMan.domain.objects.PreAssessmentOutcome.getPreAssessmentOutcomefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("fitForSurgery");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFitForSurgery(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("operativeProcedureStatus");
		if(fldEl != null)
		{	
    		obj.setOperativeProcedureStatus(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isConsultantPerformingProcedure");
		if(fldEl != null)
		{	
    		obj.setIsConsultantPerformingProcedure(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("otherProcedures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOtherProcedures(ims.core.clinical.domain.objects.Procedure.fromListXMLString(fldEl, factory, obj.getOtherProcedures(), domMap));
		}
		fldEl = el.element("operateOnAnticoagulantComment");
		if(fldEl != null)
		{	
    		obj.setOperateOnAnticoagulantComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("takesLongerThanStandardTime");
		if(fldEl != null)
		{	
    		obj.setTakesLongerThanStandardTime(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("appointmentOutcomeAction");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAppointmentOutcomeAction(ims.scheduling.domain.objects.AppointmentOutcomeAction.getAppointmentOutcomeActionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("anaesthetistRequiredInTheatre");
		if(fldEl != null)
		{	
    		obj.setAnaesthetistRequiredInTheatre(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("careGiven");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCareGiven(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("admissionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdmissionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("admittedIn");
		if(fldEl != null)
		{	
    		obj.setAdmittedIn(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("admittedInUnitOfTime");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdmittedInUnitOfTime(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("numberOfProviderTCICancellations");
		if(fldEl != null)
		{	
    		obj.setNumberOfProviderTCICancellations(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("was28DayRuleApplied");
		if(fldEl != null)
		{	
    		obj.setWas28DayRuleApplied(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cognitiveComments");
		if(fldEl != null)
		{	
    		obj.setCognitiveComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("toBePlannedIn");
		if(fldEl != null)
		{	
    		obj.setToBePlannedIn(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("toBePlannedInUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setToBePlannedInUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("plannedDate");
		if(fldEl != null)
		{	
    		obj.setPlannedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isSuitableForTelephoneAssessment");
		if(fldEl != null)
		{	
    		obj.setIsSuitableForTelephoneAssessment(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("preAssessmentAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPreAssessmentAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("subjectTo28DayRule");
		if(fldEl != null)
		{	
    		obj.setSubjectTo28DayRule(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rule28DayStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRule28DayStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("rule28DayPeriodStart");
		if(fldEl != null)
		{	
    		obj.setRule28DayPeriodStart(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("multiServiceCase");
		if(fldEl != null)
		{	
    		obj.setMultiServiceCase(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requiresVetting");
		if(fldEl != null)
		{	
    		obj.setRequiresVetting(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("theatreAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("ward");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("vettingDate");
		if(fldEl != null)
		{	
    		obj.setVettingDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("vettingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVettingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("recordingUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingUser(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("preColonoscopyAssessmentRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreColonoscopyAssessmentRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("responsibleHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsibleHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "electiveListStatusHistory"
		, "tCIHistory"
		, "suspensions"
		, "eRODHistory"
		, "reviews"
		, "notes"
		, "admissions"
		, "otherProcedures"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ElectiveList = "electiveList";
		public static final String ElectiveAdmissionType = "electiveAdmissionType";
		public static final String ElectiveListStatus = "electiveListStatus";
		public static final String ElectiveListStatusHistory = "electiveListStatusHistory";
		public static final String CreatingAppointment = "creatingAppointment";
		public static final String Patient = "patient";
		public static final String Referral = "referral";
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String Hospital = "hospital";
		public static final String Bed = "bed";
		public static final String PatientStatus = "patientStatus";
		public static final String Consultant = "consultant";
		public static final String DateOnList = "dateOnList";
		public static final String OriginalDecisionDate = "originalDecisionDate";
		public static final String ElectiveListReason = "electiveListReason";
		public static final String TCIDetails = "tCIDetails";
		public static final String TCIHistory = "tCIHistory";
		public static final String TCIGiven = "tCIGiven";
		public static final String TCICancelledByProvider = "tCICancelledByProvider";
		public static final String Suspensions = "suspensions";
		public static final String CurrentSuspensionEndDate = "currentSuspensionEndDate";
		public static final String EROD = "eROD";
		public static final String ERODHistory = "eRODHistory";
		public static final String PathwayClock = "pathwayClock";
		public static final String Reviews = "reviews";
		public static final String Notes = "notes";
		public static final String Admissions = "admissions";
		public static final String IntendedManagement = "intendedManagement";
		public static final String WasPossibleDateGiven = "wasPossibleDateGiven";
		public static final String DateGivenToPatient = "dateGivenToPatient";
		public static final String PrimaryProcedure = "primaryProcedure";
		public static final String ProcLaterality = "procLaterality";
		public static final String ProcedureDescription = "procedureDescription";
		public static final String SecondaryProcedure = "secondaryProcedure";
		public static final String SecondaryProcLaterality = "secondaryProcLaterality";
		public static final String AnticipatedProcedureLength = "anticipatedProcedureLength";
		public static final String Priority = "priority";
		public static final String AnaestheticType = "anaestheticType";
		public static final String WLAnaestheticType = "wLAnaestheticType";
		public static final String AvailableAtShortNotice = "availableAtShortNotice";
		public static final String AvailableAtShortNoticePeriod = "availableAtShortNoticePeriod";
		public static final String WLAvailableAtShortNotice = "wLAvailableAtShortNotice";
		public static final String WLAvailableAtShortNoticePeriod = "wLAvailableAtShortNoticePeriod";
		public static final String PreOperativeOvernightStayRequired = "preOperativeOvernightStayRequired";
		public static final String WLPreOperativeOvernightStayRequired = "wLPreOperativeOvernightStayRequired";
		public static final String NoOfPreOperativeNights = "noOfPreOperativeNights";
		public static final String WLNoOfPreOperativeNights = "wLNoOfPreOperativeNights";
		public static final String AnticipatedStay = "anticipatedStay";
		public static final String WLAnticipatedStay = "wLAnticipatedStay";
		public static final String RequiredTheatreType = "requiredTheatreType";
		public static final String CriticalCareBedRequired = "criticalCareBedRequired";
		public static final String HDUBedRequired = "hDUBedRequired";
		public static final String ITUBedRequired = "iTUBedRequired";
		public static final String AnaesthesisRiskAssessmentRequest = "anaesthesisRiskAssessmentRequest";
		public static final String PatientReceivingAnticoagulantTherapy = "patientReceivingAnticoagulantTherapy";
		public static final String WLPatientReceivingAnticoagulantTherapy = "wLPatientReceivingAnticoagulantTherapy";
		public static final String FollowPeriOperativeguidelines = "followPeriOperativeguidelines";
		public static final String PeriOpNoReasonComments = "periOpNoReasonComments";
		public static final String InterpretatorRequired = "interpretatorRequired";
		public static final String Language = "language";
		public static final String TransportRequired = "transportRequired";
		public static final String Transport = "transport";
		public static final String SpecialRequirements = "specialRequirements";
		public static final String SpecialRequirementsDetails = "specialRequirementsDetails";
		public static final String Comments = "comments";
		public static final String ProceduredToBeCarriedBy = "proceduredToBeCarriedBy";
		public static final String ProcedureCarriedOutBy = "procedureCarriedOutBy";
		public static final String SuspectedGIBleed = "suspectedGIBleed";
		public static final String Points = "points";
		public static final String SuitableforTraining = "suitableforTraining";
		public static final String GeneralAnaesthetic = "generalAnaesthetic";
		public static final String CanNurseCarryOutProcedure = "canNurseCarryOutProcedure";
		public static final String DetailsForNonGAEndoProcedure = "detailsForNonGAEndoProcedure";
		public static final String PreAssessmentRequired = "preAssessmentRequired";
		public static final String MedicationShouldBeStoppedOralBowelPrep = "medicationShouldBeStoppedOralBowelPrep";
		public static final String DrugInformation = "drugInformation";
		public static final String HasPacemakerDefib = "hasPacemakerDefib";
		public static final String RenalFunctionAssessment = "renalFunctionAssessment";
		public static final String AreThereKeyTherapeutic = "areThereKeyTherapeutic";
		public static final String PreAssessmentOutcome = "preAssessmentOutcome";
		public static final String FitForSurgery = "fitForSurgery";
		public static final String OperativeProcedureStatus = "operativeProcedureStatus";
		public static final String IsConsultantPerformingProcedure = "isConsultantPerformingProcedure";
		public static final String OtherProcedures = "otherProcedures";
		public static final String OperateOnAnticoagulantComment = "operateOnAnticoagulantComment";
		public static final String TakesLongerThanStandardTime = "takesLongerThanStandardTime";
		public static final String AppointmentOutcomeAction = "appointmentOutcomeAction";
		public static final String AnaesthetistRequiredInTheatre = "anaesthetistRequiredInTheatre";
		public static final String CareGiven = "careGiven";
		public static final String AdmissionType = "admissionType";
		public static final String AdmittedIn = "admittedIn";
		public static final String AdmittedInUnitOfTime = "admittedInUnitOfTime";
		public static final String NumberOfProviderTCICancellations = "numberOfProviderTCICancellations";
		public static final String Was28DayRuleApplied = "was28DayRuleApplied";
		public static final String CognitiveComments = "cognitiveComments";
		public static final String ToBePlannedIn = "toBePlannedIn";
		public static final String ToBePlannedInUnit = "toBePlannedInUnit";
		public static final String PlannedDate = "plannedDate";
		public static final String IsSuitableForTelephoneAssessment = "isSuitableForTelephoneAssessment";
		public static final String PreAssessmentAppointment = "preAssessmentAppointment";
		public static final String SubjectTo28DayRule = "subjectTo28DayRule";
		public static final String Rule28DayStatus = "rule28DayStatus";
		public static final String Rule28DayPeriodStart = "rule28DayPeriodStart";
		public static final String MultiServiceCase = "multiServiceCase";
		public static final String RequiresVetting = "requiresVetting";
		public static final String TheatreAppointment = "theatreAppointment";
		public static final String Ward = "ward";
		public static final String VettingDate = "vettingDate";
		public static final String VettingHCP = "vettingHCP";
		public static final String AuthoringInfo = "authoringInfo";
		public static final String PatientCategory = "patientCategory";
		public static final String RecordingUser = "recordingUser";
		public static final String PreColonoscopyAssessmentRequired = "preColonoscopyAssessmentRequired";
		public static final String ResponsibleHCP = "responsibleHCP";
	}
}

