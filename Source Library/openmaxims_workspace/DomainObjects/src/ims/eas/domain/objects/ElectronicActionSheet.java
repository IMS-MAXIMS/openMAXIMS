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
package ims.eas.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class ElectronicActionSheet extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1113100000;
	private static final long serialVersionUID = 1113100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient who this Action Sheet is for */
	private ims.core.patient.domain.objects.Patient patient;
	private ims.eas.domain.objects.EASStatusRecord easStatus;
	/** 
	  * Collection of ims.eas.domain.objects.EASStatusRecord.
	  */
	private java.util.List statusHistory;
	/** Details of who recorded this data */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInfo;
	/** Who authorised this EAS */
	private ims.core.resource.people.domain.objects.MemberOfStaff authorisedBy;
	private java.util.Date authorisedDateTime;
	private ims.core.resource.people.domain.objects.Hcp responsibleHcp;
	/** Indicator as to whether the treatment plan has been created */
	private Boolean tPCreated;
	/** Indicator as to whether an action is required for this EAS */
	private Boolean actionRequired;
	/** Has this EAS record been manually removed */
	private Boolean removedStat;
	private ims.domain.lookups.LookupInstance removalReason;
	private ims.core.resource.people.domain.objects.Hcp seenBy;
	private java.util.Date dateSeen;
	private java.util.Date dateDecisionToTreat;
	private ims.domain.lookups.LookupInstance seenAt;
	private ims.domain.lookups.LookupInstance intent;
	private ims.domain.lookups.LookupInstance priority;
	private Boolean delayed;
	private String delayedComment;
	private Integer readyToTreatDate;
	/** Children of Delayed lookup instances to be list */
	private ims.domain.lookups.LookupInstance delayedReason;
	private ims.eas.configuration.domain.objects.PrimaryTumour primaryTumour;
	private ims.eas.configuration.domain.objects.TreatmentSites treatmentSite;
	/** Laterality relevant for this TS */
	private ims.domain.lookups.LookupInstance treatSiteLaterality;
	private String anatomicalSite;
	private Boolean firstTherapeuticIntervention;
	/** Is it possible for this patient to be on Clinical Trial */
	private Boolean clinicalTrialPatient;
	private ims.domain.lookups.LookupInstance clinicalTrial;
	/** Specify whether protocol is used for this Action Sheet */
	private Boolean protocolUsed;
	/** The protocol being used for this Action Sheet */
	private ims.eas.configuration.domain.objects.Protocol protocol;
	/** The reason protocol is not used */
	private String offProtocolReason;
	/** Has Patient Consented to Radiotherapy Treatment */
	private ims.domain.lookups.LookupInstance patientConsent;
	/** Must Plan in Consultation Session */
	private ims.domain.lookups.LookupInstance planConsSession;
	/** Appropriate for CCC-L */
	private ims.domain.lookups.LookupInstance appropCCCL;
	/** Request Image Transfer */
	private ims.domain.lookups.LookupInstance imageTransfer;
	/** EAS Comment */
	private String easComment;
	/** Patient Graphic Assessment associated with treatment site */
	private ims.assessment.instantiation.domain.objects.PatientAssessment graphicAssessment;
	/** Phases associated with this EAS record
	  * Collection of ims.eas.domain.objects.EASPhase.
	  */
	private java.util.List phases;
	/** Collection of ImageTransfers for this EAS
	  * Collection of ims.eas.domain.objects.ImageTransfer.
	  */
	private java.util.List imageTransfers;
	private ims.domain.lookups.LookupInstance planningCT;
	private String planningCTText;
	/** MRI for co-reg  */
	private ims.domain.lookups.LookupInstance mRIforCoReg;
	/** Dentist Required */
	private ims.domain.lookups.LookupInstance dentistRequired;
	/** Peg Required */
	private ims.domain.lookups.LookupInstance pegRequired;
	/** SimulationRequired */
	private ims.domain.lookups.LookupInstance simulationRequired;
	private ims.domain.lookups.LookupInstance iVContrast;
	/** Date of Investigation */
	private java.util.Date investigationDate;
	/** Recent Creatinine Level Recorded? */
	private Boolean recentCreatinine;
	/** Serum Creatinine Level  */
	private java.lang.Float creatinineLevel;
	/** 
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List oralContrast;
	private ims.domain.lookups.LookupInstance gatingOptions;
	private ims.domain.lookups.LookupInstance iMRT;
	/** PET CT for co-reg. */
	private ims.domain.lookups.LookupInstance petCT;
	/** Immobilisation Type */
	private ims.domain.lookups.LookupInstance immobType;
	/** Mould Room Activity */
	private ims.domain.lookups.LookupInstance mouldRoomActivity;
	private ims.domain.lookups.LookupInstance agent;
	/** Planning Appointment at CCC given */
	private java.util.Date planningApptDate;
	private ims.domain.lookups.LookupInstance planningTransport;
	private ims.domain.lookups.LookupInstance treatmentTransport;
	/** Concurrent Systemic Treatment */
	private ims.domain.lookups.LookupInstance concurrentSystemicTreatment;
	private ims.domain.lookups.LookupInstance iP_OP_Planning;
	private ims.domain.lookups.LookupInstance iP_OP_Treatment;
	/** PatientStatus NHS / Private */
	private ims.domain.lookups.LookupInstance patientStatus;
	/** The Generated Document associated with this EAS */
	private ims.core.documents.domain.objects.ServerDocument generatedDocument;
	/** Updates to this EAS record are held here
	  * Collection of ims.eas.domain.objects.EASAnnotationNote.
	  */
	private java.util.List annotation;
	/** Is Planning CT required */
	private Boolean planningCTRequired;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ElectronicActionSheet (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ElectronicActionSheet ()
    {
    	super();
    }
    public ElectronicActionSheet (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.eas.domain.objects.ElectronicActionSheet.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.eas.domain.objects.EASStatusRecord getEasStatus() {
		return easStatus;
	}
	public void setEasStatus(ims.eas.domain.objects.EASStatusRecord easStatus) {
		this.easStatus = easStatus;
	}

	public java.util.List getStatusHistory() {
		if ( null == statusHistory ) {
			statusHistory = new java.util.ArrayList();
		}
		return statusHistory;
	}
	public void setStatusHistory(java.util.List paramValue) {
		this.statusHistory = paramValue;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInfo() {
		return recordingInfo;
	}
	public void setRecordingInfo(ims.core.clinical.domain.objects.RecordingUserInformation recordingInfo) {
		this.recordingInfo = recordingInfo;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getAuthorisedBy() {
		return authorisedBy;
	}
	public void setAuthorisedBy(ims.core.resource.people.domain.objects.MemberOfStaff authorisedBy) {
		this.authorisedBy = authorisedBy;
	}

	public java.util.Date getAuthorisedDateTime() {
		return authorisedDateTime;
	}
	public void setAuthorisedDateTime(java.util.Date authorisedDateTime) {
		this.authorisedDateTime = authorisedDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getResponsibleHcp() {
		return responsibleHcp;
	}
	public void setResponsibleHcp(ims.core.resource.people.domain.objects.Hcp responsibleHcp) {
		this.responsibleHcp = responsibleHcp;
	}

	public Boolean isTPCreated() {
		return tPCreated;
	}
	public void setTPCreated(Boolean tPCreated) {
		this.tPCreated = tPCreated;
	}

	public Boolean isActionRequired() {
		return actionRequired;
	}
	public void setActionRequired(Boolean actionRequired) {
		this.actionRequired = actionRequired;
	}

	public Boolean isRemovedStat() {
		return removedStat;
	}
	public void setRemovedStat(Boolean removedStat) {
		this.removedStat = removedStat;
	}

	public ims.domain.lookups.LookupInstance getRemovalReason() {
		return removalReason;
	}
	public void setRemovalReason(ims.domain.lookups.LookupInstance removalReason) {
		this.removalReason = removalReason;
	}

	public ims.core.resource.people.domain.objects.Hcp getSeenBy() {
		return seenBy;
	}
	public void setSeenBy(ims.core.resource.people.domain.objects.Hcp seenBy) {
		this.seenBy = seenBy;
	}

	public java.util.Date getDateSeen() {
		return dateSeen;
	}
	public void setDateSeen(java.util.Date dateSeen) {
		this.dateSeen = dateSeen;
	}

	public java.util.Date getDateDecisionToTreat() {
		return dateDecisionToTreat;
	}
	public void setDateDecisionToTreat(java.util.Date dateDecisionToTreat) {
		this.dateDecisionToTreat = dateDecisionToTreat;
	}

	public ims.domain.lookups.LookupInstance getSeenAt() {
		return seenAt;
	}
	public void setSeenAt(ims.domain.lookups.LookupInstance seenAt) {
		this.seenAt = seenAt;
	}

	public ims.domain.lookups.LookupInstance getIntent() {
		return intent;
	}
	public void setIntent(ims.domain.lookups.LookupInstance intent) {
		this.intent = intent;
	}

	public ims.domain.lookups.LookupInstance getPriority() {
		return priority;
	}
	public void setPriority(ims.domain.lookups.LookupInstance priority) {
		this.priority = priority;
	}

	public Boolean isDelayed() {
		return delayed;
	}
	public void setDelayed(Boolean delayed) {
		this.delayed = delayed;
	}

	public String getDelayedComment() {
		return delayedComment;
	}
	public void setDelayedComment(String delayedComment) {
		if ( null != delayedComment && delayedComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for delayedComment. Tried to set value: "+
				delayedComment);
		}
		this.delayedComment = delayedComment;
	}

	public Integer getReadyToTreatDate() {
		return readyToTreatDate;
	}
	public void setReadyToTreatDate(Integer readyToTreatDate) {
		this.readyToTreatDate = readyToTreatDate;
	}

	public ims.domain.lookups.LookupInstance getDelayedReason() {
		return delayedReason;
	}
	public void setDelayedReason(ims.domain.lookups.LookupInstance delayedReason) {
		this.delayedReason = delayedReason;
	}

	public ims.eas.configuration.domain.objects.PrimaryTumour getPrimaryTumour() {
		return primaryTumour;
	}
	public void setPrimaryTumour(ims.eas.configuration.domain.objects.PrimaryTumour primaryTumour) {
		this.primaryTumour = primaryTumour;
	}

	public ims.eas.configuration.domain.objects.TreatmentSites getTreatmentSite() {
		return treatmentSite;
	}
	public void setTreatmentSite(ims.eas.configuration.domain.objects.TreatmentSites treatmentSite) {
		this.treatmentSite = treatmentSite;
	}

	public ims.domain.lookups.LookupInstance getTreatSiteLaterality() {
		return treatSiteLaterality;
	}
	public void setTreatSiteLaterality(ims.domain.lookups.LookupInstance treatSiteLaterality) {
		this.treatSiteLaterality = treatSiteLaterality;
	}

	public String getAnatomicalSite() {
		return anatomicalSite;
	}
	public void setAnatomicalSite(String anatomicalSite) {
		if ( null != anatomicalSite && anatomicalSite.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for anatomicalSite. Tried to set value: "+
				anatomicalSite);
		}
		this.anatomicalSite = anatomicalSite;
	}

	public Boolean isFirstTherapeuticIntervention() {
		return firstTherapeuticIntervention;
	}
	public void setFirstTherapeuticIntervention(Boolean firstTherapeuticIntervention) {
		this.firstTherapeuticIntervention = firstTherapeuticIntervention;
	}

	public Boolean isClinicalTrialPatient() {
		return clinicalTrialPatient;
	}
	public void setClinicalTrialPatient(Boolean clinicalTrialPatient) {
		this.clinicalTrialPatient = clinicalTrialPatient;
	}

	public ims.domain.lookups.LookupInstance getClinicalTrial() {
		return clinicalTrial;
	}
	public void setClinicalTrial(ims.domain.lookups.LookupInstance clinicalTrial) {
		this.clinicalTrial = clinicalTrial;
	}

	public Boolean isProtocolUsed() {
		return protocolUsed;
	}
	public void setProtocolUsed(Boolean protocolUsed) {
		this.protocolUsed = protocolUsed;
	}

	public ims.eas.configuration.domain.objects.Protocol getProtocol() {
		return protocol;
	}
	public void setProtocol(ims.eas.configuration.domain.objects.Protocol protocol) {
		this.protocol = protocol;
	}

	public String getOffProtocolReason() {
		return offProtocolReason;
	}
	public void setOffProtocolReason(String offProtocolReason) {
		if ( null != offProtocolReason && offProtocolReason.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for offProtocolReason. Tried to set value: "+
				offProtocolReason);
		}
		this.offProtocolReason = offProtocolReason;
	}

	public ims.domain.lookups.LookupInstance getPatientConsent() {
		return patientConsent;
	}
	public void setPatientConsent(ims.domain.lookups.LookupInstance patientConsent) {
		this.patientConsent = patientConsent;
	}

	public ims.domain.lookups.LookupInstance getPlanConsSession() {
		return planConsSession;
	}
	public void setPlanConsSession(ims.domain.lookups.LookupInstance planConsSession) {
		this.planConsSession = planConsSession;
	}

	public ims.domain.lookups.LookupInstance getAppropCCCL() {
		return appropCCCL;
	}
	public void setAppropCCCL(ims.domain.lookups.LookupInstance appropCCCL) {
		this.appropCCCL = appropCCCL;
	}

	public ims.domain.lookups.LookupInstance getImageTransfer() {
		return imageTransfer;
	}
	public void setImageTransfer(ims.domain.lookups.LookupInstance imageTransfer) {
		this.imageTransfer = imageTransfer;
	}

	public String getEasComment() {
		return easComment;
	}
	public void setEasComment(String easComment) {
		if ( null != easComment && easComment.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for easComment. Tried to set value: "+
				easComment);
		}
		this.easComment = easComment;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getGraphicAssessment() {
		return graphicAssessment;
	}
	public void setGraphicAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment graphicAssessment) {
		this.graphicAssessment = graphicAssessment;
	}

	public java.util.List getPhases() {
		if ( null == phases ) {
			phases = new java.util.ArrayList();
		}
		return phases;
	}
	public void setPhases(java.util.List paramValue) {
		this.phases = paramValue;
	}

	public java.util.List getImageTransfers() {
		if ( null == imageTransfers ) {
			imageTransfers = new java.util.ArrayList();
		}
		return imageTransfers;
	}
	public void setImageTransfers(java.util.List paramValue) {
		this.imageTransfers = paramValue;
	}

	public ims.domain.lookups.LookupInstance getPlanningCT() {
		return planningCT;
	}
	public void setPlanningCT(ims.domain.lookups.LookupInstance planningCT) {
		this.planningCT = planningCT;
	}

	public String getPlanningCTText() {
		return planningCTText;
	}
	public void setPlanningCTText(String planningCTText) {
		if ( null != planningCTText && planningCTText.length() > 70 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for planningCTText. Tried to set value: "+
				planningCTText);
		}
		this.planningCTText = planningCTText;
	}

	public ims.domain.lookups.LookupInstance getMRIforCoReg() {
		return mRIforCoReg;
	}
	public void setMRIforCoReg(ims.domain.lookups.LookupInstance mRIforCoReg) {
		this.mRIforCoReg = mRIforCoReg;
	}

	public ims.domain.lookups.LookupInstance getDentistRequired() {
		return dentistRequired;
	}
	public void setDentistRequired(ims.domain.lookups.LookupInstance dentistRequired) {
		this.dentistRequired = dentistRequired;
	}

	public ims.domain.lookups.LookupInstance getPegRequired() {
		return pegRequired;
	}
	public void setPegRequired(ims.domain.lookups.LookupInstance pegRequired) {
		this.pegRequired = pegRequired;
	}

	public ims.domain.lookups.LookupInstance getSimulationRequired() {
		return simulationRequired;
	}
	public void setSimulationRequired(ims.domain.lookups.LookupInstance simulationRequired) {
		this.simulationRequired = simulationRequired;
	}

	public ims.domain.lookups.LookupInstance getIVContrast() {
		return iVContrast;
	}
	public void setIVContrast(ims.domain.lookups.LookupInstance iVContrast) {
		this.iVContrast = iVContrast;
	}

	public java.util.Date getInvestigationDate() {
		return investigationDate;
	}
	public void setInvestigationDate(java.util.Date investigationDate) {
		this.investigationDate = investigationDate;
	}

	public Boolean isRecentCreatinine() {
		return recentCreatinine;
	}
	public void setRecentCreatinine(Boolean recentCreatinine) {
		this.recentCreatinine = recentCreatinine;
	}

	public java.lang.Float getCreatinineLevel() {
		return creatinineLevel;
	}
	public void setCreatinineLevel(java.lang.Float creatinineLevel) {
		this.creatinineLevel = creatinineLevel;
	}

	public java.util.List getOralContrast() {
		if ( null == oralContrast ) {
			oralContrast = new java.util.ArrayList();
		}
		return oralContrast;
	}
	public void setOralContrast(java.util.List paramValue) {
		this.oralContrast = paramValue;
	}

	public ims.domain.lookups.LookupInstance getGatingOptions() {
		return gatingOptions;
	}
	public void setGatingOptions(ims.domain.lookups.LookupInstance gatingOptions) {
		this.gatingOptions = gatingOptions;
	}

	public ims.domain.lookups.LookupInstance getIMRT() {
		return iMRT;
	}
	public void setIMRT(ims.domain.lookups.LookupInstance iMRT) {
		this.iMRT = iMRT;
	}

	public ims.domain.lookups.LookupInstance getPetCT() {
		return petCT;
	}
	public void setPetCT(ims.domain.lookups.LookupInstance petCT) {
		this.petCT = petCT;
	}

	public ims.domain.lookups.LookupInstance getImmobType() {
		return immobType;
	}
	public void setImmobType(ims.domain.lookups.LookupInstance immobType) {
		this.immobType = immobType;
	}

	public ims.domain.lookups.LookupInstance getMouldRoomActivity() {
		return mouldRoomActivity;
	}
	public void setMouldRoomActivity(ims.domain.lookups.LookupInstance mouldRoomActivity) {
		this.mouldRoomActivity = mouldRoomActivity;
	}

	public ims.domain.lookups.LookupInstance getAgent() {
		return agent;
	}
	public void setAgent(ims.domain.lookups.LookupInstance agent) {
		this.agent = agent;
	}

	public java.util.Date getPlanningApptDate() {
		return planningApptDate;
	}
	public void setPlanningApptDate(java.util.Date planningApptDate) {
		this.planningApptDate = planningApptDate;
	}

	public ims.domain.lookups.LookupInstance getPlanningTransport() {
		return planningTransport;
	}
	public void setPlanningTransport(ims.domain.lookups.LookupInstance planningTransport) {
		this.planningTransport = planningTransport;
	}

	public ims.domain.lookups.LookupInstance getTreatmentTransport() {
		return treatmentTransport;
	}
	public void setTreatmentTransport(ims.domain.lookups.LookupInstance treatmentTransport) {
		this.treatmentTransport = treatmentTransport;
	}

	public ims.domain.lookups.LookupInstance getConcurrentSystemicTreatment() {
		return concurrentSystemicTreatment;
	}
	public void setConcurrentSystemicTreatment(ims.domain.lookups.LookupInstance concurrentSystemicTreatment) {
		this.concurrentSystemicTreatment = concurrentSystemicTreatment;
	}

	public ims.domain.lookups.LookupInstance getIP_OP_Planning() {
		return iP_OP_Planning;
	}
	public void setIP_OP_Planning(ims.domain.lookups.LookupInstance iP_OP_Planning) {
		this.iP_OP_Planning = iP_OP_Planning;
	}

	public ims.domain.lookups.LookupInstance getIP_OP_Treatment() {
		return iP_OP_Treatment;
	}
	public void setIP_OP_Treatment(ims.domain.lookups.LookupInstance iP_OP_Treatment) {
		this.iP_OP_Treatment = iP_OP_Treatment;
	}

	public ims.domain.lookups.LookupInstance getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(ims.domain.lookups.LookupInstance patientStatus) {
		this.patientStatus = patientStatus;
	}

	public ims.core.documents.domain.objects.ServerDocument getGeneratedDocument() {
		return generatedDocument;
	}
	public void setGeneratedDocument(ims.core.documents.domain.objects.ServerDocument generatedDocument) {
		this.generatedDocument = generatedDocument;
	}

	public java.util.List getAnnotation() {
		if ( null == annotation ) {
			annotation = new java.util.ArrayList();
		}
		return annotation;
	}
	public void setAnnotation(java.util.List paramValue) {
		this.annotation = paramValue;
	}

	public Boolean isPlanningCTRequired() {
		return planningCTRequired;
	}
	public void setPlanningCTRequired(Boolean planningCTRequired) {
		this.planningCTRequired = planningCTRequired;
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
		
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*easStatus* :");
		if (easStatus != null)
		{
			auditStr.append(toShortClassName(easStatus));
				
		    auditStr.append(easStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*statusHistory* :");
		if (statusHistory != null)
		{
		int i3=0;
		for (i3=0; i3<statusHistory.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.eas.domain.objects.EASStatusRecord obj = (ims.eas.domain.objects.EASStatusRecord)statusHistory.get(i3);
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
		auditStr.append("\r\n*recordingInfo* :");
		if (recordingInfo != null)
		{
			auditStr.append(toShortClassName(recordingInfo));
				
		    auditStr.append(recordingInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authorisedBy* :");
		if (authorisedBy != null)
		{
			auditStr.append(toShortClassName(authorisedBy));
				
		    auditStr.append(authorisedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authorisedDateTime* :");
		auditStr.append(authorisedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*responsibleHcp* :");
		if (responsibleHcp != null)
		{
			auditStr.append(toShortClassName(responsibleHcp));
				
		    auditStr.append(responsibleHcp.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tPCreated* :");
		auditStr.append(tPCreated);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionRequired* :");
		auditStr.append(actionRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*removedStat* :");
		auditStr.append(removedStat);
	    auditStr.append("; ");
		auditStr.append("\r\n*removalReason* :");
		if (removalReason != null)
			auditStr.append(removalReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*seenBy* :");
		if (seenBy != null)
		{
			auditStr.append(toShortClassName(seenBy));
				
		    auditStr.append(seenBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateSeen* :");
		auditStr.append(dateSeen);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateDecisionToTreat* :");
		auditStr.append(dateDecisionToTreat);
	    auditStr.append("; ");
		auditStr.append("\r\n*seenAt* :");
		if (seenAt != null)
			auditStr.append(seenAt.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*intent* :");
		if (intent != null)
			auditStr.append(intent.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*priority* :");
		if (priority != null)
			auditStr.append(priority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*delayed* :");
		auditStr.append(delayed);
	    auditStr.append("; ");
		auditStr.append("\r\n*delayedComment* :");
		auditStr.append(delayedComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*readyToTreatDate* :");
		auditStr.append(readyToTreatDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*delayedReason* :");
		if (delayedReason != null)
			auditStr.append(delayedReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryTumour* :");
		if (primaryTumour != null)
		{
			auditStr.append(toShortClassName(primaryTumour));
				
		    auditStr.append(primaryTumour.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentSite* :");
		if (treatmentSite != null)
		{
			auditStr.append(toShortClassName(treatmentSite));
				
		    auditStr.append(treatmentSite.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatSiteLaterality* :");
		if (treatSiteLaterality != null)
			auditStr.append(treatSiteLaterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anatomicalSite* :");
		auditStr.append(anatomicalSite);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstTherapeuticIntervention* :");
		auditStr.append(firstTherapeuticIntervention);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalTrialPatient* :");
		auditStr.append(clinicalTrialPatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalTrial* :");
		if (clinicalTrial != null)
			auditStr.append(clinicalTrial.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*protocolUsed* :");
		auditStr.append(protocolUsed);
	    auditStr.append("; ");
		auditStr.append("\r\n*protocol* :");
		if (protocol != null)
		{
			auditStr.append(toShortClassName(protocol));
				
		    auditStr.append(protocol.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*offProtocolReason* :");
		auditStr.append(offProtocolReason);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientConsent* :");
		if (patientConsent != null)
			auditStr.append(patientConsent.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*planConsSession* :");
		if (planConsSession != null)
			auditStr.append(planConsSession.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*appropCCCL* :");
		if (appropCCCL != null)
			auditStr.append(appropCCCL.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*imageTransfer* :");
		if (imageTransfer != null)
			auditStr.append(imageTransfer.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*easComment* :");
		auditStr.append(easComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*graphicAssessment* :");
		if (graphicAssessment != null)
		{
			auditStr.append(toShortClassName(graphicAssessment));
				
		    auditStr.append(graphicAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*phases* :");
		if (phases != null)
		{
		int i38=0;
		for (i38=0; i38<phases.size(); i38++)
		{
			if (i38 > 0)
				auditStr.append(",");
			ims.eas.domain.objects.EASPhase obj = (ims.eas.domain.objects.EASPhase)phases.get(i38);
		    if (obj != null)
			{
				if (i38 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i38 > 0)
			auditStr.append("] " + i38);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*imageTransfers* :");
		if (imageTransfers != null)
		{
		int i39=0;
		for (i39=0; i39<imageTransfers.size(); i39++)
		{
			if (i39 > 0)
				auditStr.append(",");
			ims.eas.domain.objects.ImageTransfer obj = (ims.eas.domain.objects.ImageTransfer)imageTransfers.get(i39);
		    if (obj != null)
			{
				if (i39 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i39 > 0)
			auditStr.append("] " + i39);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*planningCT* :");
		if (planningCT != null)
			auditStr.append(planningCT.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*planningCTText* :");
		auditStr.append(planningCTText);
	    auditStr.append("; ");
		auditStr.append("\r\n*mRIforCoReg* :");
		if (mRIforCoReg != null)
			auditStr.append(mRIforCoReg.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dentistRequired* :");
		if (dentistRequired != null)
			auditStr.append(dentistRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pegRequired* :");
		if (pegRequired != null)
			auditStr.append(pegRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*simulationRequired* :");
		if (simulationRequired != null)
			auditStr.append(simulationRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*iVContrast* :");
		if (iVContrast != null)
			auditStr.append(iVContrast.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*investigationDate* :");
		auditStr.append(investigationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*recentCreatinine* :");
		auditStr.append(recentCreatinine);
	    auditStr.append("; ");
		auditStr.append("\r\n*creatinineLevel* :");
		auditStr.append(creatinineLevel);
	    auditStr.append("; ");
		auditStr.append("\r\n*oralContrast* :");
		if (oralContrast != null)
		{
		int i50=0;
		for (i50=0; i50<oralContrast.size(); i50++)
		{
			if (i50 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)oralContrast.get(i50);
			auditStr.append(obj.getText());
		}
		if (i50 > 0)
			auditStr.append("] " + i50);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*gatingOptions* :");
		if (gatingOptions != null)
			auditStr.append(gatingOptions.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*iMRT* :");
		if (iMRT != null)
			auditStr.append(iMRT.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*petCT* :");
		if (petCT != null)
			auditStr.append(petCT.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*immobType* :");
		if (immobType != null)
			auditStr.append(immobType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mouldRoomActivity* :");
		if (mouldRoomActivity != null)
			auditStr.append(mouldRoomActivity.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*agent* :");
		if (agent != null)
			auditStr.append(agent.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*planningApptDate* :");
		auditStr.append(planningApptDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*planningTransport* :");
		if (planningTransport != null)
			auditStr.append(planningTransport.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentTransport* :");
		if (treatmentTransport != null)
			auditStr.append(treatmentTransport.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*concurrentSystemicTreatment* :");
		if (concurrentSystemicTreatment != null)
			auditStr.append(concurrentSystemicTreatment.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*iP_OP_Planning* :");
		if (iP_OP_Planning != null)
			auditStr.append(iP_OP_Planning.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*iP_OP_Treatment* :");
		if (iP_OP_Treatment != null)
			auditStr.append(iP_OP_Treatment.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientStatus* :");
		if (patientStatus != null)
			auditStr.append(patientStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*generatedDocument* :");
		if (generatedDocument != null)
		{
			auditStr.append(toShortClassName(generatedDocument));
				
		    auditStr.append(generatedDocument.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*annotation* :");
		if (annotation != null)
		{
		int i65=0;
		for (i65=0; i65<annotation.size(); i65++)
		{
			if (i65 > 0)
				auditStr.append(",");
			ims.eas.domain.objects.EASAnnotationNote obj = (ims.eas.domain.objects.EASAnnotationNote)annotation.get(i65);
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
		auditStr.append("\r\n*planningCTRequired* :");
		auditStr.append(planningCTRequired);
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
		
		String keyClassName = "ElectronicActionSheet";
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
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getEasStatus() != null)
		{
			sb.append("<easStatus>");
			sb.append(this.getEasStatus().toXMLString(domMap)); 	
			sb.append("</easStatus>");		
		}
		if (this.getStatusHistory() != null)
		{
			if (this.getStatusHistory().size() > 0 )
			{
			sb.append("<statusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStatusHistory(), domMap));
			sb.append("</statusHistory>");		
			}
		}
		if (this.getRecordingInfo() != null)
		{
			sb.append("<recordingInfo>");
			sb.append(this.getRecordingInfo().toXMLString(domMap)); 	
			sb.append("</recordingInfo>");		
		}
		if (this.getAuthorisedBy() != null)
		{
			sb.append("<authorisedBy>");
			sb.append(this.getAuthorisedBy().toXMLString(domMap)); 	
			sb.append("</authorisedBy>");		
		}
		if (this.getAuthorisedDateTime() != null)
		{
			sb.append("<authorisedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthorisedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authorisedDateTime>");		
		}
		if (this.getResponsibleHcp() != null)
		{
			sb.append("<responsibleHcp>");
			sb.append(this.getResponsibleHcp().toXMLString(domMap)); 	
			sb.append("</responsibleHcp>");		
		}
		if (this.isTPCreated() != null)
		{
			sb.append("<tPCreated>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTPCreated().toString()));
			sb.append("</tPCreated>");		
		}
		if (this.isActionRequired() != null)
		{
			sb.append("<actionRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActionRequired().toString()));
			sb.append("</actionRequired>");		
		}
		if (this.isRemovedStat() != null)
		{
			sb.append("<removedStat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRemovedStat().toString()));
			sb.append("</removedStat>");		
		}
		if (this.getRemovalReason() != null)
		{
			sb.append("<removalReason>");
			sb.append(this.getRemovalReason().toXMLString()); 
			sb.append("</removalReason>");		
		}
		if (this.getSeenBy() != null)
		{
			sb.append("<seenBy>");
			sb.append(this.getSeenBy().toXMLString(domMap)); 	
			sb.append("</seenBy>");		
		}
		if (this.getDateSeen() != null)
		{
			sb.append("<dateSeen>");
			sb.append(new ims.framework.utils.DateTime(this.getDateSeen()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateSeen>");		
		}
		if (this.getDateDecisionToTreat() != null)
		{
			sb.append("<dateDecisionToTreat>");
			sb.append(new ims.framework.utils.DateTime(this.getDateDecisionToTreat()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateDecisionToTreat>");		
		}
		if (this.getSeenAt() != null)
		{
			sb.append("<seenAt>");
			sb.append(this.getSeenAt().toXMLString()); 
			sb.append("</seenAt>");		
		}
		if (this.getIntent() != null)
		{
			sb.append("<intent>");
			sb.append(this.getIntent().toXMLString()); 
			sb.append("</intent>");		
		}
		if (this.getPriority() != null)
		{
			sb.append("<priority>");
			sb.append(this.getPriority().toXMLString()); 
			sb.append("</priority>");		
		}
		if (this.isDelayed() != null)
		{
			sb.append("<delayed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDelayed().toString()));
			sb.append("</delayed>");		
		}
		if (this.getDelayedComment() != null)
		{
			sb.append("<delayedComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDelayedComment().toString()));
			sb.append("</delayedComment>");		
		}
		if (this.getReadyToTreatDate() != null)
		{
			sb.append("<readyToTreatDate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReadyToTreatDate().toString()));
			sb.append("</readyToTreatDate>");		
		}
		if (this.getDelayedReason() != null)
		{
			sb.append("<delayedReason>");
			sb.append(this.getDelayedReason().toXMLString()); 
			sb.append("</delayedReason>");		
		}
		if (this.getPrimaryTumour() != null)
		{
			sb.append("<primaryTumour>");
			sb.append(this.getPrimaryTumour().toXMLString(domMap)); 	
			sb.append("</primaryTumour>");		
		}
		if (this.getTreatmentSite() != null)
		{
			sb.append("<treatmentSite>");
			sb.append(this.getTreatmentSite().toXMLString(domMap)); 	
			sb.append("</treatmentSite>");		
		}
		if (this.getTreatSiteLaterality() != null)
		{
			sb.append("<treatSiteLaterality>");
			sb.append(this.getTreatSiteLaterality().toXMLString()); 
			sb.append("</treatSiteLaterality>");		
		}
		if (this.getAnatomicalSite() != null)
		{
			sb.append("<anatomicalSite>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnatomicalSite().toString()));
			sb.append("</anatomicalSite>");		
		}
		if (this.isFirstTherapeuticIntervention() != null)
		{
			sb.append("<firstTherapeuticIntervention>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isFirstTherapeuticIntervention().toString()));
			sb.append("</firstTherapeuticIntervention>");		
		}
		if (this.isClinicalTrialPatient() != null)
		{
			sb.append("<clinicalTrialPatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isClinicalTrialPatient().toString()));
			sb.append("</clinicalTrialPatient>");		
		}
		if (this.getClinicalTrial() != null)
		{
			sb.append("<clinicalTrial>");
			sb.append(this.getClinicalTrial().toXMLString()); 
			sb.append("</clinicalTrial>");		
		}
		if (this.isProtocolUsed() != null)
		{
			sb.append("<protocolUsed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isProtocolUsed().toString()));
			sb.append("</protocolUsed>");		
		}
		if (this.getProtocol() != null)
		{
			sb.append("<protocol>");
			sb.append(this.getProtocol().toXMLString(domMap)); 	
			sb.append("</protocol>");		
		}
		if (this.getOffProtocolReason() != null)
		{
			sb.append("<offProtocolReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOffProtocolReason().toString()));
			sb.append("</offProtocolReason>");		
		}
		if (this.getPatientConsent() != null)
		{
			sb.append("<patientConsent>");
			sb.append(this.getPatientConsent().toXMLString()); 
			sb.append("</patientConsent>");		
		}
		if (this.getPlanConsSession() != null)
		{
			sb.append("<planConsSession>");
			sb.append(this.getPlanConsSession().toXMLString()); 
			sb.append("</planConsSession>");		
		}
		if (this.getAppropCCCL() != null)
		{
			sb.append("<appropCCCL>");
			sb.append(this.getAppropCCCL().toXMLString()); 
			sb.append("</appropCCCL>");		
		}
		if (this.getImageTransfer() != null)
		{
			sb.append("<imageTransfer>");
			sb.append(this.getImageTransfer().toXMLString()); 
			sb.append("</imageTransfer>");		
		}
		if (this.getEasComment() != null)
		{
			sb.append("<easComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEasComment().toString()));
			sb.append("</easComment>");		
		}
		if (this.getGraphicAssessment() != null)
		{
			sb.append("<graphicAssessment>");
			sb.append(this.getGraphicAssessment().toXMLString(domMap)); 	
			sb.append("</graphicAssessment>");		
		}
		if (this.getPhases() != null)
		{
			if (this.getPhases().size() > 0 )
			{
			sb.append("<phases>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPhases(), domMap));
			sb.append("</phases>");		
			}
		}
		if (this.getImageTransfers() != null)
		{
			if (this.getImageTransfers().size() > 0 )
			{
			sb.append("<imageTransfers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getImageTransfers(), domMap));
			sb.append("</imageTransfers>");		
			}
		}
		if (this.getPlanningCT() != null)
		{
			sb.append("<planningCT>");
			sb.append(this.getPlanningCT().toXMLString()); 
			sb.append("</planningCT>");		
		}
		if (this.getPlanningCTText() != null)
		{
			sb.append("<planningCTText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPlanningCTText().toString()));
			sb.append("</planningCTText>");		
		}
		if (this.getMRIforCoReg() != null)
		{
			sb.append("<mRIforCoReg>");
			sb.append(this.getMRIforCoReg().toXMLString()); 
			sb.append("</mRIforCoReg>");		
		}
		if (this.getDentistRequired() != null)
		{
			sb.append("<dentistRequired>");
			sb.append(this.getDentistRequired().toXMLString()); 
			sb.append("</dentistRequired>");		
		}
		if (this.getPegRequired() != null)
		{
			sb.append("<pegRequired>");
			sb.append(this.getPegRequired().toXMLString()); 
			sb.append("</pegRequired>");		
		}
		if (this.getSimulationRequired() != null)
		{
			sb.append("<simulationRequired>");
			sb.append(this.getSimulationRequired().toXMLString()); 
			sb.append("</simulationRequired>");		
		}
		if (this.getIVContrast() != null)
		{
			sb.append("<iVContrast>");
			sb.append(this.getIVContrast().toXMLString()); 
			sb.append("</iVContrast>");		
		}
		if (this.getInvestigationDate() != null)
		{
			sb.append("<investigationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getInvestigationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</investigationDate>");		
		}
		if (this.isRecentCreatinine() != null)
		{
			sb.append("<recentCreatinine>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRecentCreatinine().toString()));
			sb.append("</recentCreatinine>");		
		}
		if (this.getCreatinineLevel() != null)
		{
			sb.append("<creatinineLevel>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCreatinineLevel().toString()));
			sb.append("</creatinineLevel>");		
		}
		if (this.getOralContrast() != null)
		{
			if (this.getOralContrast().size() > 0 )
			{
			sb.append("<oralContrast>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getOralContrast())); 
			sb.append("</oralContrast>");		
			}
		}
		if (this.getGatingOptions() != null)
		{
			sb.append("<gatingOptions>");
			sb.append(this.getGatingOptions().toXMLString()); 
			sb.append("</gatingOptions>");		
		}
		if (this.getIMRT() != null)
		{
			sb.append("<iMRT>");
			sb.append(this.getIMRT().toXMLString()); 
			sb.append("</iMRT>");		
		}
		if (this.getPetCT() != null)
		{
			sb.append("<petCT>");
			sb.append(this.getPetCT().toXMLString()); 
			sb.append("</petCT>");		
		}
		if (this.getImmobType() != null)
		{
			sb.append("<immobType>");
			sb.append(this.getImmobType().toXMLString()); 
			sb.append("</immobType>");		
		}
		if (this.getMouldRoomActivity() != null)
		{
			sb.append("<mouldRoomActivity>");
			sb.append(this.getMouldRoomActivity().toXMLString()); 
			sb.append("</mouldRoomActivity>");		
		}
		if (this.getAgent() != null)
		{
			sb.append("<agent>");
			sb.append(this.getAgent().toXMLString()); 
			sb.append("</agent>");		
		}
		if (this.getPlanningApptDate() != null)
		{
			sb.append("<planningApptDate>");
			sb.append(new ims.framework.utils.DateTime(this.getPlanningApptDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</planningApptDate>");		
		}
		if (this.getPlanningTransport() != null)
		{
			sb.append("<planningTransport>");
			sb.append(this.getPlanningTransport().toXMLString()); 
			sb.append("</planningTransport>");		
		}
		if (this.getTreatmentTransport() != null)
		{
			sb.append("<treatmentTransport>");
			sb.append(this.getTreatmentTransport().toXMLString()); 
			sb.append("</treatmentTransport>");		
		}
		if (this.getConcurrentSystemicTreatment() != null)
		{
			sb.append("<concurrentSystemicTreatment>");
			sb.append(this.getConcurrentSystemicTreatment().toXMLString()); 
			sb.append("</concurrentSystemicTreatment>");		
		}
		if (this.getIP_OP_Planning() != null)
		{
			sb.append("<iP_OP_Planning>");
			sb.append(this.getIP_OP_Planning().toXMLString()); 
			sb.append("</iP_OP_Planning>");		
		}
		if (this.getIP_OP_Treatment() != null)
		{
			sb.append("<iP_OP_Treatment>");
			sb.append(this.getIP_OP_Treatment().toXMLString()); 
			sb.append("</iP_OP_Treatment>");		
		}
		if (this.getPatientStatus() != null)
		{
			sb.append("<patientStatus>");
			sb.append(this.getPatientStatus().toXMLString()); 
			sb.append("</patientStatus>");		
		}
		if (this.getGeneratedDocument() != null)
		{
			sb.append("<generatedDocument>");
			sb.append(this.getGeneratedDocument().toXMLString(domMap)); 	
			sb.append("</generatedDocument>");		
		}
		if (this.getAnnotation() != null)
		{
			if (this.getAnnotation().size() > 0 )
			{
			sb.append("<annotation>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAnnotation(), domMap));
			sb.append("</annotation>");		
			}
		}
		if (this.isPlanningCTRequired() != null)
		{
			sb.append("<planningCTRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPlanningCTRequired().toString()));
			sb.append("</planningCTRequired>");		
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
			ElectronicActionSheet domainObject = getElectronicActionSheetfromXML(itemEl, factory, domMap);

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
			ElectronicActionSheet domainObject = getElectronicActionSheetfromXML(itemEl, factory, domMap);

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
		
	public static ElectronicActionSheet getElectronicActionSheetfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getElectronicActionSheetfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ElectronicActionSheet getElectronicActionSheetfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ElectronicActionSheet.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ElectronicActionSheet.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ElectronicActionSheet class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ElectronicActionSheet)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ElectronicActionSheet.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ElectronicActionSheet ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ElectronicActionSheet)factory.getImportedDomainObject(ElectronicActionSheet.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ElectronicActionSheet();
		}
		String keyClassName = "ElectronicActionSheet";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ElectronicActionSheet)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ElectronicActionSheet obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("easStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEasStatus(ims.eas.domain.objects.EASStatusRecord.getEASStatusRecordfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setStatusHistory(ims.eas.domain.objects.EASStatusRecord.fromListXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("recordingInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInfo(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authorisedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthorisedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authorisedDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthorisedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("responsibleHcp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsibleHcp(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tPCreated");
		if(fldEl != null)
		{	
    		obj.setTPCreated(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actionRequired");
		if(fldEl != null)
		{	
    		obj.setActionRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("removedStat");
		if(fldEl != null)
		{	
    		obj.setRemovedStat(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("removalReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRemovalReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("seenBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSeenBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateSeen");
		if(fldEl != null)
		{	
    		obj.setDateSeen(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateDecisionToTreat");
		if(fldEl != null)
		{	
    		obj.setDateDecisionToTreat(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("seenAt");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSeenAt(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("intent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIntent(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("priority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("delayed");
		if(fldEl != null)
		{	
    		obj.setDelayed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("delayedComment");
		if(fldEl != null)
		{	
    		obj.setDelayedComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("readyToTreatDate");
		if(fldEl != null)
		{	
    		obj.setReadyToTreatDate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("delayedReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDelayedReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("primaryTumour");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrimaryTumour(ims.eas.configuration.domain.objects.PrimaryTumour.getPrimaryTumourfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("treatmentSite");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatmentSite(ims.eas.configuration.domain.objects.TreatmentSites.getTreatmentSitesfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("treatSiteLaterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatSiteLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anatomicalSite");
		if(fldEl != null)
		{	
    		obj.setAnatomicalSite(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("firstTherapeuticIntervention");
		if(fldEl != null)
		{	
    		obj.setFirstTherapeuticIntervention(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalTrialPatient");
		if(fldEl != null)
		{	
    		obj.setClinicalTrialPatient(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalTrial");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setClinicalTrial(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("protocolUsed");
		if(fldEl != null)
		{	
    		obj.setProtocolUsed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("protocol");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProtocol(ims.eas.configuration.domain.objects.Protocol.getProtocolfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("offProtocolReason");
		if(fldEl != null)
		{	
    		obj.setOffProtocolReason(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientConsent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientConsent(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("planConsSession");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPlanConsSession(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("appropCCCL");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAppropCCCL(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("imageTransfer");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setImageTransfer(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("easComment");
		if(fldEl != null)
		{	
    		obj.setEasComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("graphicAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGraphicAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("phases");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPhases(ims.eas.domain.objects.EASPhase.fromListXMLString(fldEl, factory, obj.getPhases(), domMap));
		}
		fldEl = el.element("imageTransfers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setImageTransfers(ims.eas.domain.objects.ImageTransfer.fromListXMLString(fldEl, factory, obj.getImageTransfers(), domMap));
		}
		fldEl = el.element("planningCT");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPlanningCT(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("planningCTText");
		if(fldEl != null)
		{	
    		obj.setPlanningCTText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("mRIforCoReg");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMRIforCoReg(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dentistRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDentistRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pegRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPegRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("simulationRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSimulationRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("iVContrast");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIVContrast(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("investigationDate");
		if(fldEl != null)
		{	
    		obj.setInvestigationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("recentCreatinine");
		if(fldEl != null)
		{	
    		obj.setRecentCreatinine(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("creatinineLevel");
		if(fldEl != null)
		{	
    		obj.setCreatinineLevel(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("oralContrast");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOralContrast(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getOralContrast())); 
		}
		fldEl = el.element("gatingOptions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGatingOptions(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("iMRT");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIMRT(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("petCT");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPetCT(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("immobType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setImmobType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mouldRoomActivity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMouldRoomActivity(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("agent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAgent(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("planningApptDate");
		if(fldEl != null)
		{	
    		obj.setPlanningApptDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("planningTransport");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPlanningTransport(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("treatmentTransport");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatmentTransport(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("concurrentSystemicTreatment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConcurrentSystemicTreatment(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("iP_OP_Planning");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIP_OP_Planning(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("iP_OP_Treatment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIP_OP_Treatment(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("generatedDocument");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGeneratedDocument(ims.core.documents.domain.objects.ServerDocument.getServerDocumentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("annotation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAnnotation(ims.eas.domain.objects.EASAnnotationNote.fromListXMLString(fldEl, factory, obj.getAnnotation(), domMap));
		}
		fldEl = el.element("planningCTRequired");
		if(fldEl != null)
		{	
    		obj.setPlanningCTRequired(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "statusHistory"
		, "phases"
		, "imageTransfers"
		, "oralContrast"
		, "annotation"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String EasStatus = "easStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String RecordingInfo = "recordingInfo";
		public static final String AuthorisedBy = "authorisedBy";
		public static final String AuthorisedDateTime = "authorisedDateTime";
		public static final String ResponsibleHcp = "responsibleHcp";
		public static final String TPCreated = "tPCreated";
		public static final String ActionRequired = "actionRequired";
		public static final String RemovedStat = "removedStat";
		public static final String RemovalReason = "removalReason";
		public static final String SeenBy = "seenBy";
		public static final String DateSeen = "dateSeen";
		public static final String DateDecisionToTreat = "dateDecisionToTreat";
		public static final String SeenAt = "seenAt";
		public static final String Intent = "intent";
		public static final String Priority = "priority";
		public static final String Delayed = "delayed";
		public static final String DelayedComment = "delayedComment";
		public static final String ReadyToTreatDate = "readyToTreatDate";
		public static final String DelayedReason = "delayedReason";
		public static final String PrimaryTumour = "primaryTumour";
		public static final String TreatmentSite = "treatmentSite";
		public static final String TreatSiteLaterality = "treatSiteLaterality";
		public static final String AnatomicalSite = "anatomicalSite";
		public static final String FirstTherapeuticIntervention = "firstTherapeuticIntervention";
		public static final String ClinicalTrialPatient = "clinicalTrialPatient";
		public static final String ClinicalTrial = "clinicalTrial";
		public static final String ProtocolUsed = "protocolUsed";
		public static final String Protocol = "protocol";
		public static final String OffProtocolReason = "offProtocolReason";
		public static final String PatientConsent = "patientConsent";
		public static final String PlanConsSession = "planConsSession";
		public static final String AppropCCCL = "appropCCCL";
		public static final String ImageTransfer = "imageTransfer";
		public static final String EasComment = "easComment";
		public static final String GraphicAssessment = "graphicAssessment";
		public static final String Phases = "phases";
		public static final String ImageTransfers = "imageTransfers";
		public static final String PlanningCT = "planningCT";
		public static final String PlanningCTText = "planningCTText";
		public static final String MRIforCoReg = "mRIforCoReg";
		public static final String DentistRequired = "dentistRequired";
		public static final String PegRequired = "pegRequired";
		public static final String SimulationRequired = "simulationRequired";
		public static final String IVContrast = "iVContrast";
		public static final String InvestigationDate = "investigationDate";
		public static final String RecentCreatinine = "recentCreatinine";
		public static final String CreatinineLevel = "creatinineLevel";
		public static final String OralContrast = "oralContrast";
		public static final String GatingOptions = "gatingOptions";
		public static final String IMRT = "iMRT";
		public static final String PetCT = "petCT";
		public static final String ImmobType = "immobType";
		public static final String MouldRoomActivity = "mouldRoomActivity";
		public static final String Agent = "agent";
		public static final String PlanningApptDate = "planningApptDate";
		public static final String PlanningTransport = "planningTransport";
		public static final String TreatmentTransport = "treatmentTransport";
		public static final String ConcurrentSystemicTreatment = "concurrentSystemicTreatment";
		public static final String IP_OP_Planning = "iP_OP_Planning";
		public static final String IP_OP_Treatment = "iP_OP_Treatment";
		public static final String PatientStatus = "patientStatus";
		public static final String GeneratedDocument = "generatedDocument";
		public static final String Annotation = "annotation";
		public static final String PlanningCTRequired = "planningCTRequired";
	}
}

