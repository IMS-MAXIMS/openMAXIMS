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
 * @author Neil McAnaspie
 * Generated.
 */


public class CatsReferral extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100035;
	private static final long serialVersionUID = 1004100035L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** ICAB Referral */
	private ims.core.admin.domain.objects.ICABReferral iCABReferral;
	/** Referral Letter Details */
	private ims.core.clinical.domain.objects.ReferralLetterDetails referralDetails;
	/** DOS */
	private ims.scheduling.domain.objects.DirectoryofService dOS;
	/** Investigation Orders
	  * Collection of ims.ocrr.orderingresults.domain.objects.OcsOrderSession.
	  */
	private java.util.Set investigationOrders;
	/** Has Investigations ordered */
	private Boolean hasInvestigations;
	/** Appointments
	  * Collection of ims.scheduling.domain.objects.Booking_Appointment.
	  */
	private java.util.Set appointments;
	/** Has Appointments */
	private Boolean hasAppointments;
	/** Referral Documents
	  * Collection of ims.core.documents.domain.objects.PatientDocument.
	  */
	private java.util.Set referralDocuments;
	/** Has Scanned images - Documents */
	private Boolean hasDocuments;
	/** Has Referral Letter */
	private Boolean hasReferralLetter;
	/** Current Referral Status */
	private ims.RefMan.domain.objects.CATSReferralStatus currentStatus;
	/** CATS Referral Status History
	  * Collection of ims.RefMan.domain.objects.CATSReferralStatus.
	  */
	private java.util.Set statusHistory;
	/** Order Investigation Appointments
	  * Collection of ims.RefMan.domain.objects.OrderInvAppt.
	  */
	private java.util.Set orderInvAppts;
	/** Appointment Call Attempts
	  * Collection of ims.RefMan.domain.objects.AppointmentCallAttempts.
	  */
	private java.util.Set callAttempts;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** C&B Referral */
	private Boolean isCAB;
	/** Consultation Appt */
	private ims.scheduling.domain.objects.Booking_Appointment consultationAppt;
	/** Additional Inv Appts Status */
	private ims.domain.lookups.LookupInstance additionalInvApptsStatus;
	/** Reject Referral Detail */
	private ims.RefMan.domain.objects.ReferralReject rejectReferralDetail;
	/** Referral has a Rejected Investigation requiring Review */
	private Boolean hasRejectedInv;
	/** Provider Cancellation */
	private ims.RefMan.domain.objects.ProviderCancellation providerCancellation;
	/** Is the Referral Flagged For Review */
	private Boolean isFlaggedForReview;
	/** Current Review Detail 
	  * Collection of ims.RefMan.domain.objects.ReviewReferralDetail.
	  */
	private java.util.Set currentReviewDetail;
	/** Review Referral History
	  * Collection of ims.RefMan.domain.objects.ReviewReferralDetail.
	  */
	private java.util.Set reviewHistory;
	/** Onward Referral Status */
	private ims.domain.lookups.LookupInstance onwardReferralStatus;
	/** UniqueLineRefNo - Used for Monthly Activity Report */
	private String uniqueLineRefNo;
	/** Has Consultation Details */
	private Boolean hasConsultationDetails;
	/** is Final Report Required */
	private ims.domain.lookups.LookupInstance isFinalReportRequired;
	/** Discharge Date */
	private java.util.Date dischargeDate;
	/** TriageDateTime */
	private java.util.Date triageDateTime;
	/** Last Appt Arrived Date */
	private java.util.Date lastApptArrivedDate;
	/** Has a TLT contact */
	private Boolean hasTLTStartContact;
	/** Is Patient Suitable For Surgery */
	private Boolean isSuitableForSurgery;
	/** Is Patient Fit For Surgery */
	private Boolean isFitForSurgery;
	/** Has the patient a Theatre Appointment */
	private Boolean hasTheatreAppt;
	/** Is the referral marked as accepted on CAB */
	private Boolean isAcceptedOnCAB;
	/** Is Referral Rejected On C&B */
	private Boolean isReferralRejectedOnCAB;
	/** Was the Patient Rejection Letter Sent */
	private Boolean wasPatientRejectionLetterSent;
	/** Was the Patient Provider Cancellation Letter Sent */
	private Boolean wasPatientProviderCancellationLetterSent;
	/** Requires Discharge Report */
	private Boolean requiresDischargeRep;
	/** There are DNA appointments requiring revioew */
	private Boolean hasDNAApptsForReview;
	/** There are Cancelled appointments requiring revioew */
	private Boolean hasCancelledApptsForReview;
	/** is Secondary Report Required */
	private ims.domain.lookups.LookupInstance isSecondaryReportRequired;
	/** Was the Further Management Details Reviewed */
	private Boolean wasFurtherManagementDetailsReviewed;
	/** Is the Referral Currently Allocated */
	private Boolean isCurrentlyAllocated;
	/** Onward Referral Reason */
	private ims.domain.lookups.LookupInstance onwardReferralReason;
	/** wasOutputtedToWeeklyReport */
	private Boolean wasOutputtedToWeeklyReport;
	/** wasOutputtedToMonthlyReport */
	private Boolean wasOutputtedToMonthlyReport;
	/** Used to hold a collection of Reports Required to be printed
	  * Collection of ims.RefMan.domain.objects.ReportsRequiredForPrinting.
	  */
	private java.util.Set reportsRequired;
	/** Discharge To GP Details Review Status */
	private ims.domain.lookups.LookupInstance dischargeToGPDetailsReviewStatus;
	/** Contract */
	private ims.core.configuration.domain.objects.ContractConfig contract;
	/** Awaiting Clinical Information */
	private ims.RefMan.domain.objects.AwaitingClinicalInfo awaitingClinicalInfo;
	/** Is the referral awaiting clinical information */
	private Boolean isAwaitingClinicalInfo;
	/** Active Monitoring Appt Required */
	private Boolean isActiveMonitorApptRequired;
	/** CATS Report Sent Date */
	private java.util.Date cATSReportSentDate;
	/** Suitable ForSurgery Date */
	private java.util.Date suitableForSurgeryDate;
	/** Location of Outpatient Appt */
	private ims.core.resource.place.domain.objects.Location oPDLocation;
	/** EndOfCareDate */
	private java.util.Date endOfCareDate;
	/** Procedure For PostOp Review */
	private ims.core.clinical.domain.objects.PatientProcedure procedureForPostOpReview;
	/** Referral Category */
	private ims.domain.lookups.LookupInstance referralCategory;
	/** isOnwardReferralTriage */
	private Boolean isOnwardReferralTriage;
	/** Nearest Treatment Centre Location */
	private ims.core.resource.place.domain.objects.Location nearestTreatmentCentre;
	/** Is there an OP Procedure awaiting appointment’ */
	private Boolean hasOPProcAwaitingAppt;
	/** Urgency */
	private ims.domain.lookups.LookupInstance urgency;
	/** The Associated Patient journey that was created for this referral */
	private ims.pathways.domain.objects.PatientPathwayJourney journey;
	/** Pathway ID */
	private String pathwayID;
	/** Indicates whether this Referral has RTT Clocks */
	private Boolean rTTClockImpact;
	/** Elective EROD
	  * Collection of ims.RefMan.domain.objects.ReferralEROD.
	  */
	private java.util.List electiveEROD;
	/** Elective EROD History
	  * Collection of ims.RefMan.domain.objects.ReferralEROD.
	  */
	private java.util.List electiveERODHistory;
	/** Outpatient EROD
	  * Collection of ims.RefMan.domain.objects.ReferralEROD.
	  */
	private java.util.List outpatientEROD;
	/** Current RTT Status of this Referral */
	private ims.pathways.domain.objects.PathwayRTTStatus currentRTTStatus;
	/** Patient Admin Events
	  * Collection of ims.pathways.domain.objects.AdminEvent.
	  */
	private java.util.List adminEvent;
	/** Admissions
	  * Collection of ims.core.admin.pas.domain.objects.AdmissionDetail.
	  */
	private java.util.List admissions;
	/** Referral Transfer */
	private ims.RefMan.domain.objects.ReferralTransfer referralTransfer;
	/** ConsultantUpgradeDate */
	private java.util.Date consUpgradeDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CatsReferral (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CatsReferral ()
    {
    	super();
    }
    public CatsReferral (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.CatsReferral.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public static java.util.List listCatsReferralByPatient(ims.domain.ILightweightDomainFactory factory, ims.core.patient.domain.objects.Patient val)
	{
		String hql = "from CatsReferral c where c.patient = :patient";		
		return factory.find(hql, new String[]{"patient"}, new Object[]{val});		
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.ICABReferral getICABReferral() {
		return iCABReferral;
	}
	public void setICABReferral(ims.core.admin.domain.objects.ICABReferral iCABReferral) {
		this.iCABReferral = iCABReferral;
	}

	public ims.core.clinical.domain.objects.ReferralLetterDetails getReferralDetails() {
		return referralDetails;
	}
	public void setReferralDetails(ims.core.clinical.domain.objects.ReferralLetterDetails referralDetails) {
		this.referralDetails = referralDetails;
	}

	public ims.scheduling.domain.objects.DirectoryofService getDOS() {
		return dOS;
	}
	public void setDOS(ims.scheduling.domain.objects.DirectoryofService dOS) {
		this.dOS = dOS;
	}

	public java.util.Set getInvestigationOrders() {
		if ( null == investigationOrders ) {
			investigationOrders = new java.util.HashSet();
		}
		return investigationOrders;
	}
	public void setInvestigationOrders(java.util.Set paramValue) {
		this.investigationOrders = paramValue;
	}

	public Boolean isHasInvestigations() {
		return hasInvestigations;
	}
	public void setHasInvestigations(Boolean hasInvestigations) {
		this.hasInvestigations = hasInvestigations;
	}

	public java.util.Set getAppointments() {
		if ( null == appointments ) {
			appointments = new java.util.HashSet();
		}
		return appointments;
	}
	public void setAppointments(java.util.Set paramValue) {
		this.appointments = paramValue;
	}

	public Boolean isHasAppointments() {
		return hasAppointments;
	}
	public void setHasAppointments(Boolean hasAppointments) {
		this.hasAppointments = hasAppointments;
	}

	public java.util.Set getReferralDocuments() {
		if ( null == referralDocuments ) {
			referralDocuments = new java.util.HashSet();
		}
		return referralDocuments;
	}
	public void setReferralDocuments(java.util.Set paramValue) {
		this.referralDocuments = paramValue;
	}

	public Boolean isHasDocuments() {
		return hasDocuments;
	}
	public void setHasDocuments(Boolean hasDocuments) {
		this.hasDocuments = hasDocuments;
	}

	public Boolean isHasReferralLetter() {
		return hasReferralLetter;
	}
	public void setHasReferralLetter(Boolean hasReferralLetter) {
		this.hasReferralLetter = hasReferralLetter;
	}

	public ims.RefMan.domain.objects.CATSReferralStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.RefMan.domain.objects.CATSReferralStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public java.util.Set getStatusHistory() {
		if ( null == statusHistory ) {
			statusHistory = new java.util.HashSet();
		}
		return statusHistory;
	}
	public void setStatusHistory(java.util.Set paramValue) {
		this.statusHistory = paramValue;
	}

	public java.util.Set getOrderInvAppts() {
		if ( null == orderInvAppts ) {
			orderInvAppts = new java.util.HashSet();
		}
		return orderInvAppts;
	}
	public void setOrderInvAppts(java.util.Set paramValue) {
		this.orderInvAppts = paramValue;
	}

	public java.util.Set getCallAttempts() {
		if ( null == callAttempts ) {
			callAttempts = new java.util.HashSet();
		}
		return callAttempts;
	}
	public void setCallAttempts(java.util.Set paramValue) {
		this.callAttempts = paramValue;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public Boolean isIsCAB() {
		return isCAB;
	}
	public void setIsCAB(Boolean isCAB) {
		this.isCAB = isCAB;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getConsultationAppt() {
		return consultationAppt;
	}
	public void setConsultationAppt(ims.scheduling.domain.objects.Booking_Appointment consultationAppt) {
		this.consultationAppt = consultationAppt;
	}

	public ims.domain.lookups.LookupInstance getAdditionalInvApptsStatus() {
		return additionalInvApptsStatus;
	}
	public void setAdditionalInvApptsStatus(ims.domain.lookups.LookupInstance additionalInvApptsStatus) {
		this.additionalInvApptsStatus = additionalInvApptsStatus;
	}

	public ims.RefMan.domain.objects.ReferralReject getRejectReferralDetail() {
		return rejectReferralDetail;
	}
	public void setRejectReferralDetail(ims.RefMan.domain.objects.ReferralReject rejectReferralDetail) {
		this.rejectReferralDetail = rejectReferralDetail;
	}

	public Boolean isHasRejectedInv() {
		return hasRejectedInv;
	}
	public void setHasRejectedInv(Boolean hasRejectedInv) {
		this.hasRejectedInv = hasRejectedInv;
	}

	public ims.RefMan.domain.objects.ProviderCancellation getProviderCancellation() {
		return providerCancellation;
	}
	public void setProviderCancellation(ims.RefMan.domain.objects.ProviderCancellation providerCancellation) {
		this.providerCancellation = providerCancellation;
	}

	public Boolean isIsFlaggedForReview() {
		return isFlaggedForReview;
	}
	public void setIsFlaggedForReview(Boolean isFlaggedForReview) {
		this.isFlaggedForReview = isFlaggedForReview;
	}

	public java.util.Set getCurrentReviewDetail() {
		if ( null == currentReviewDetail ) {
			currentReviewDetail = new java.util.HashSet();
		}
		return currentReviewDetail;
	}
	public void setCurrentReviewDetail(java.util.Set paramValue) {
		this.currentReviewDetail = paramValue;
	}

	public java.util.Set getReviewHistory() {
		if ( null == reviewHistory ) {
			reviewHistory = new java.util.HashSet();
		}
		return reviewHistory;
	}
	public void setReviewHistory(java.util.Set paramValue) {
		this.reviewHistory = paramValue;
	}

	public ims.domain.lookups.LookupInstance getOnwardReferralStatus() {
		return onwardReferralStatus;
	}
	public void setOnwardReferralStatus(ims.domain.lookups.LookupInstance onwardReferralStatus) {
		this.onwardReferralStatus = onwardReferralStatus;
	}

	public String getUniqueLineRefNo() {
		return uniqueLineRefNo;
	}
	public void setUniqueLineRefNo(String uniqueLineRefNo) {
		if ( null != uniqueLineRefNo && uniqueLineRefNo.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uniqueLineRefNo. Tried to set value: "+
				uniqueLineRefNo);
		}
		this.uniqueLineRefNo = uniqueLineRefNo;
	}

	public Boolean isHasConsultationDetails() {
		return hasConsultationDetails;
	}
	public void setHasConsultationDetails(Boolean hasConsultationDetails) {
		this.hasConsultationDetails = hasConsultationDetails;
	}

	public ims.domain.lookups.LookupInstance getIsFinalReportRequired() {
		return isFinalReportRequired;
	}
	public void setIsFinalReportRequired(ims.domain.lookups.LookupInstance isFinalReportRequired) {
		this.isFinalReportRequired = isFinalReportRequired;
	}

	public java.util.Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(java.util.Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public java.util.Date getTriageDateTime() {
		return triageDateTime;
	}
	public void setTriageDateTime(java.util.Date triageDateTime) {
		this.triageDateTime = triageDateTime;
	}

	public java.util.Date getLastApptArrivedDate() {
		return lastApptArrivedDate;
	}
	public void setLastApptArrivedDate(java.util.Date lastApptArrivedDate) {
		this.lastApptArrivedDate = lastApptArrivedDate;
	}

	public Boolean isHasTLTStartContact() {
		return hasTLTStartContact;
	}
	public void setHasTLTStartContact(Boolean hasTLTStartContact) {
		this.hasTLTStartContact = hasTLTStartContact;
	}

	public Boolean isIsSuitableForSurgery() {
		return isSuitableForSurgery;
	}
	public void setIsSuitableForSurgery(Boolean isSuitableForSurgery) {
		this.isSuitableForSurgery = isSuitableForSurgery;
	}

	public Boolean isIsFitForSurgery() {
		return isFitForSurgery;
	}
	public void setIsFitForSurgery(Boolean isFitForSurgery) {
		this.isFitForSurgery = isFitForSurgery;
	}

	public Boolean isHasTheatreAppt() {
		return hasTheatreAppt;
	}
	public void setHasTheatreAppt(Boolean hasTheatreAppt) {
		this.hasTheatreAppt = hasTheatreAppt;
	}

	public Boolean isIsAcceptedOnCAB() {
		return isAcceptedOnCAB;
	}
	public void setIsAcceptedOnCAB(Boolean isAcceptedOnCAB) {
		this.isAcceptedOnCAB = isAcceptedOnCAB;
	}

	public Boolean isIsReferralRejectedOnCAB() {
		return isReferralRejectedOnCAB;
	}
	public void setIsReferralRejectedOnCAB(Boolean isReferralRejectedOnCAB) {
		this.isReferralRejectedOnCAB = isReferralRejectedOnCAB;
	}

	public Boolean isWasPatientRejectionLetterSent() {
		return wasPatientRejectionLetterSent;
	}
	public void setWasPatientRejectionLetterSent(Boolean wasPatientRejectionLetterSent) {
		this.wasPatientRejectionLetterSent = wasPatientRejectionLetterSent;
	}

	public Boolean isWasPatientProviderCancellationLetterSent() {
		return wasPatientProviderCancellationLetterSent;
	}
	public void setWasPatientProviderCancellationLetterSent(Boolean wasPatientProviderCancellationLetterSent) {
		this.wasPatientProviderCancellationLetterSent = wasPatientProviderCancellationLetterSent;
	}

	public Boolean isRequiresDischargeRep() {
		return requiresDischargeRep;
	}
	public void setRequiresDischargeRep(Boolean requiresDischargeRep) {
		this.requiresDischargeRep = requiresDischargeRep;
	}

	public Boolean isHasDNAApptsForReview() {
		return hasDNAApptsForReview;
	}
	public void setHasDNAApptsForReview(Boolean hasDNAApptsForReview) {
		this.hasDNAApptsForReview = hasDNAApptsForReview;
	}

	public Boolean isHasCancelledApptsForReview() {
		return hasCancelledApptsForReview;
	}
	public void setHasCancelledApptsForReview(Boolean hasCancelledApptsForReview) {
		this.hasCancelledApptsForReview = hasCancelledApptsForReview;
	}

	public ims.domain.lookups.LookupInstance getIsSecondaryReportRequired() {
		return isSecondaryReportRequired;
	}
	public void setIsSecondaryReportRequired(ims.domain.lookups.LookupInstance isSecondaryReportRequired) {
		this.isSecondaryReportRequired = isSecondaryReportRequired;
	}

	public Boolean isWasFurtherManagementDetailsReviewed() {
		return wasFurtherManagementDetailsReviewed;
	}
	public void setWasFurtherManagementDetailsReviewed(Boolean wasFurtherManagementDetailsReviewed) {
		this.wasFurtherManagementDetailsReviewed = wasFurtherManagementDetailsReviewed;
	}

	public Boolean isIsCurrentlyAllocated() {
		return isCurrentlyAllocated;
	}
	public void setIsCurrentlyAllocated(Boolean isCurrentlyAllocated) {
		this.isCurrentlyAllocated = isCurrentlyAllocated;
	}

	public ims.domain.lookups.LookupInstance getOnwardReferralReason() {
		return onwardReferralReason;
	}
	public void setOnwardReferralReason(ims.domain.lookups.LookupInstance onwardReferralReason) {
		this.onwardReferralReason = onwardReferralReason;
	}

	public Boolean isWasOutputtedToWeeklyReport() {
		return wasOutputtedToWeeklyReport;
	}
	public void setWasOutputtedToWeeklyReport(Boolean wasOutputtedToWeeklyReport) {
		this.wasOutputtedToWeeklyReport = wasOutputtedToWeeklyReport;
	}

	public Boolean isWasOutputtedToMonthlyReport() {
		return wasOutputtedToMonthlyReport;
	}
	public void setWasOutputtedToMonthlyReport(Boolean wasOutputtedToMonthlyReport) {
		this.wasOutputtedToMonthlyReport = wasOutputtedToMonthlyReport;
	}

	public java.util.Set getReportsRequired() {
		if ( null == reportsRequired ) {
			reportsRequired = new java.util.HashSet();
		}
		return reportsRequired;
	}
	public void setReportsRequired(java.util.Set paramValue) {
		this.reportsRequired = paramValue;
	}

	public ims.domain.lookups.LookupInstance getDischargeToGPDetailsReviewStatus() {
		return dischargeToGPDetailsReviewStatus;
	}
	public void setDischargeToGPDetailsReviewStatus(ims.domain.lookups.LookupInstance dischargeToGPDetailsReviewStatus) {
		this.dischargeToGPDetailsReviewStatus = dischargeToGPDetailsReviewStatus;
	}

	public ims.core.configuration.domain.objects.ContractConfig getContract() {
		return contract;
	}
	public void setContract(ims.core.configuration.domain.objects.ContractConfig contract) {
		this.contract = contract;
	}

	public ims.RefMan.domain.objects.AwaitingClinicalInfo getAwaitingClinicalInfo() {
		return awaitingClinicalInfo;
	}
	public void setAwaitingClinicalInfo(ims.RefMan.domain.objects.AwaitingClinicalInfo awaitingClinicalInfo) {
		this.awaitingClinicalInfo = awaitingClinicalInfo;
	}

	public Boolean isIsAwaitingClinicalInfo() {
		return isAwaitingClinicalInfo;
	}
	public void setIsAwaitingClinicalInfo(Boolean isAwaitingClinicalInfo) {
		this.isAwaitingClinicalInfo = isAwaitingClinicalInfo;
	}

	public Boolean isIsActiveMonitorApptRequired() {
		return isActiveMonitorApptRequired;
	}
	public void setIsActiveMonitorApptRequired(Boolean isActiveMonitorApptRequired) {
		this.isActiveMonitorApptRequired = isActiveMonitorApptRequired;
	}

	public java.util.Date getCATSReportSentDate() {
		return cATSReportSentDate;
	}
	public void setCATSReportSentDate(java.util.Date cATSReportSentDate) {
		this.cATSReportSentDate = cATSReportSentDate;
	}

	public java.util.Date getSuitableForSurgeryDate() {
		return suitableForSurgeryDate;
	}
	public void setSuitableForSurgeryDate(java.util.Date suitableForSurgeryDate) {
		this.suitableForSurgeryDate = suitableForSurgeryDate;
	}

	public ims.core.resource.place.domain.objects.Location getOPDLocation() {
		return oPDLocation;
	}
	public void setOPDLocation(ims.core.resource.place.domain.objects.Location oPDLocation) {
		this.oPDLocation = oPDLocation;
	}

	public java.util.Date getEndOfCareDate() {
		return endOfCareDate;
	}
	public void setEndOfCareDate(java.util.Date endOfCareDate) {
		this.endOfCareDate = endOfCareDate;
	}

	public ims.core.clinical.domain.objects.PatientProcedure getProcedureForPostOpReview() {
		return procedureForPostOpReview;
	}
	public void setProcedureForPostOpReview(ims.core.clinical.domain.objects.PatientProcedure procedureForPostOpReview) {
		this.procedureForPostOpReview = procedureForPostOpReview;
	}

	public ims.domain.lookups.LookupInstance getReferralCategory() {
		return referralCategory;
	}
	public void setReferralCategory(ims.domain.lookups.LookupInstance referralCategory) {
		this.referralCategory = referralCategory;
	}

	public Boolean isIsOnwardReferralTriage() {
		return isOnwardReferralTriage;
	}
	public void setIsOnwardReferralTriage(Boolean isOnwardReferralTriage) {
		this.isOnwardReferralTriage = isOnwardReferralTriage;
	}

	public ims.core.resource.place.domain.objects.Location getNearestTreatmentCentre() {
		return nearestTreatmentCentre;
	}
	public void setNearestTreatmentCentre(ims.core.resource.place.domain.objects.Location nearestTreatmentCentre) {
		this.nearestTreatmentCentre = nearestTreatmentCentre;
	}

	public Boolean isHasOPProcAwaitingAppt() {
		return hasOPProcAwaitingAppt;
	}
	public void setHasOPProcAwaitingAppt(Boolean hasOPProcAwaitingAppt) {
		this.hasOPProcAwaitingAppt = hasOPProcAwaitingAppt;
	}

	public ims.domain.lookups.LookupInstance getUrgency() {
		return urgency;
	}
	public void setUrgency(ims.domain.lookups.LookupInstance urgency) {
		this.urgency = urgency;
	}

	public ims.pathways.domain.objects.PatientPathwayJourney getJourney() {
		return journey;
	}
	public void setJourney(ims.pathways.domain.objects.PatientPathwayJourney journey) {
		this.journey = journey;
	}

	public String getPathwayID() {
		return pathwayID;
	}
	public void setPathwayID(String pathwayID) {
		if ( null != pathwayID && pathwayID.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pathwayID. Tried to set value: "+
				pathwayID);
		}
		this.pathwayID = pathwayID;
	}

	public Boolean isRTTClockImpact() {
		return rTTClockImpact;
	}
	public void setRTTClockImpact(Boolean rTTClockImpact) {
		this.rTTClockImpact = rTTClockImpact;
	}

	public java.util.List getElectiveEROD() {
		if ( null == electiveEROD ) {
			electiveEROD = new java.util.ArrayList();
		}
		return electiveEROD;
	}
	public void setElectiveEROD(java.util.List paramValue) {
		this.electiveEROD = paramValue;
	}

	public java.util.List getElectiveERODHistory() {
		if ( null == electiveERODHistory ) {
			electiveERODHistory = new java.util.ArrayList();
		}
		return electiveERODHistory;
	}
	public void setElectiveERODHistory(java.util.List paramValue) {
		this.electiveERODHistory = paramValue;
	}

	public java.util.List getOutpatientEROD() {
		if ( null == outpatientEROD ) {
			outpatientEROD = new java.util.ArrayList();
		}
		return outpatientEROD;
	}
	public void setOutpatientEROD(java.util.List paramValue) {
		this.outpatientEROD = paramValue;
	}

	public ims.pathways.domain.objects.PathwayRTTStatus getCurrentRTTStatus() {
		return currentRTTStatus;
	}
	public void setCurrentRTTStatus(ims.pathways.domain.objects.PathwayRTTStatus currentRTTStatus) {
		this.currentRTTStatus = currentRTTStatus;
	}

	public java.util.List getAdminEvent() {
		if ( null == adminEvent ) {
			adminEvent = new java.util.ArrayList();
		}
		return adminEvent;
	}
	public void setAdminEvent(java.util.List paramValue) {
		this.adminEvent = paramValue;
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

	public ims.RefMan.domain.objects.ReferralTransfer getReferralTransfer() {
		return referralTransfer;
	}
	public void setReferralTransfer(ims.RefMan.domain.objects.ReferralTransfer referralTransfer) {
		this.referralTransfer = referralTransfer;
	}

	public java.util.Date getConsUpgradeDate() {
		return consUpgradeDate;
	}
	public void setConsUpgradeDate(java.util.Date consUpgradeDate) {
		this.consUpgradeDate = consUpgradeDate;
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
		auditStr.append("\r\n*iCABReferral* :");
		if (iCABReferral != null)
		{
			auditStr.append(toShortClassName(iCABReferral));
				
		    auditStr.append(iCABReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referralDetails* :");
		if (referralDetails != null)
		{
			auditStr.append(toShortClassName(referralDetails));
				
		    auditStr.append(referralDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dOS* :");
		if (dOS != null)
		{
			auditStr.append(toShortClassName(dOS));
				
		    auditStr.append(dOS.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*investigationOrders* :");
		if (investigationOrders != null)
		{
			java.util.Iterator it5 = investigationOrders.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.OcsOrderSession obj = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasInvestigations* :");
		auditStr.append(hasInvestigations);
	    auditStr.append("; ");
		auditStr.append("\r\n*appointments* :");
		if (appointments != null)
		{
			java.util.Iterator it7 = appointments.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Booking_Appointment obj = (ims.scheduling.domain.objects.Booking_Appointment)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasAppointments* :");
		auditStr.append(hasAppointments);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralDocuments* :");
		if (referralDocuments != null)
		{
			java.util.Iterator it9 = referralDocuments.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.core.documents.domain.objects.PatientDocument obj = (ims.core.documents.domain.objects.PatientDocument)it9.next();
		if (obj != null)
		{
		   if (i9 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasDocuments* :");
		auditStr.append(hasDocuments);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasReferralLetter* :");
		auditStr.append(hasReferralLetter);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
		{
			auditStr.append(toShortClassName(currentStatus));
				
		    auditStr.append(currentStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*statusHistory* :");
		if (statusHistory != null)
		{
			java.util.Iterator it13 = statusHistory.iterator();
			int i13=0;
			while (it13.hasNext())
			{
				if (i13 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.CATSReferralStatus obj = (ims.RefMan.domain.objects.CATSReferralStatus)it13.next();
		if (obj != null)
		{
		   if (i13 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i13++;
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*orderInvAppts* :");
		if (orderInvAppts != null)
		{
			java.util.Iterator it14 = orderInvAppts.iterator();
			int i14=0;
			while (it14.hasNext())
			{
				if (i14 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.OrderInvAppt obj = (ims.RefMan.domain.objects.OrderInvAppt)it14.next();
		if (obj != null)
		{
		   if (i14 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i14++;
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*callAttempts* :");
		if (callAttempts != null)
		{
			java.util.Iterator it15 = callAttempts.iterator();
			int i15=0;
			while (it15.hasNext())
			{
				if (i15 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.AppointmentCallAttempts obj = (ims.RefMan.domain.objects.AppointmentCallAttempts)it15.next();
		if (obj != null)
		{
		   if (i15 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i15++;
		}
		if (i15 > 0)
			auditStr.append("] " + i15);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isCAB* :");
		auditStr.append(isCAB);
	    auditStr.append("; ");
		auditStr.append("\r\n*consultationAppt* :");
		if (consultationAppt != null)
		{
			auditStr.append(toShortClassName(consultationAppt));
				
		    auditStr.append(consultationAppt.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*additionalInvApptsStatus* :");
		if (additionalInvApptsStatus != null)
			auditStr.append(additionalInvApptsStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*rejectReferralDetail* :");
		if (rejectReferralDetail != null)
		{
			auditStr.append(toShortClassName(rejectReferralDetail));
				
		    auditStr.append(rejectReferralDetail.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasRejectedInv* :");
		auditStr.append(hasRejectedInv);
	    auditStr.append("; ");
		auditStr.append("\r\n*providerCancellation* :");
		if (providerCancellation != null)
		{
			auditStr.append(toShortClassName(providerCancellation));
				
		    auditStr.append(providerCancellation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isFlaggedForReview* :");
		auditStr.append(isFlaggedForReview);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentReviewDetail* :");
		if (currentReviewDetail != null)
		{
			java.util.Iterator it24 = currentReviewDetail.iterator();
			int i24=0;
			while (it24.hasNext())
			{
				if (i24 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.ReviewReferralDetail obj = (ims.RefMan.domain.objects.ReviewReferralDetail)it24.next();
		if (obj != null)
		{
		   if (i24 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i24++;
		}
		if (i24 > 0)
			auditStr.append("] " + i24);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*reviewHistory* :");
		if (reviewHistory != null)
		{
			java.util.Iterator it25 = reviewHistory.iterator();
			int i25=0;
			while (it25.hasNext())
			{
				if (i25 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.ReviewReferralDetail obj = (ims.RefMan.domain.objects.ReviewReferralDetail)it25.next();
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
		auditStr.append("\r\n*onwardReferralStatus* :");
		if (onwardReferralStatus != null)
			auditStr.append(onwardReferralStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*uniqueLineRefNo* :");
		auditStr.append(uniqueLineRefNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasConsultationDetails* :");
		auditStr.append(hasConsultationDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*isFinalReportRequired* :");
		if (isFinalReportRequired != null)
			auditStr.append(isFinalReportRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDate* :");
		auditStr.append(dischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*triageDateTime* :");
		auditStr.append(triageDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastApptArrivedDate* :");
		auditStr.append(lastApptArrivedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasTLTStartContact* :");
		auditStr.append(hasTLTStartContact);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSuitableForSurgery* :");
		auditStr.append(isSuitableForSurgery);
	    auditStr.append("; ");
		auditStr.append("\r\n*isFitForSurgery* :");
		auditStr.append(isFitForSurgery);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasTheatreAppt* :");
		auditStr.append(hasTheatreAppt);
	    auditStr.append("; ");
		auditStr.append("\r\n*isAcceptedOnCAB* :");
		auditStr.append(isAcceptedOnCAB);
	    auditStr.append("; ");
		auditStr.append("\r\n*isReferralRejectedOnCAB* :");
		auditStr.append(isReferralRejectedOnCAB);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasPatientRejectionLetterSent* :");
		auditStr.append(wasPatientRejectionLetterSent);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasPatientProviderCancellationLetterSent* :");
		auditStr.append(wasPatientProviderCancellationLetterSent);
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresDischargeRep* :");
		auditStr.append(requiresDischargeRep);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasDNAApptsForReview* :");
		auditStr.append(hasDNAApptsForReview);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasCancelledApptsForReview* :");
		auditStr.append(hasCancelledApptsForReview);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSecondaryReportRequired* :");
		if (isSecondaryReportRequired != null)
			auditStr.append(isSecondaryReportRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wasFurtherManagementDetailsReviewed* :");
		auditStr.append(wasFurtherManagementDetailsReviewed);
	    auditStr.append("; ");
		auditStr.append("\r\n*isCurrentlyAllocated* :");
		auditStr.append(isCurrentlyAllocated);
	    auditStr.append("; ");
		auditStr.append("\r\n*onwardReferralReason* :");
		if (onwardReferralReason != null)
			auditStr.append(onwardReferralReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToWeeklyReport* :");
		auditStr.append(wasOutputtedToWeeklyReport);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToMonthlyReport* :");
		auditStr.append(wasOutputtedToMonthlyReport);
	    auditStr.append("; ");
		auditStr.append("\r\n*reportsRequired* :");
		if (reportsRequired != null)
		{
			java.util.Iterator it50 = reportsRequired.iterator();
			int i50=0;
			while (it50.hasNext())
			{
				if (i50 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.ReportsRequiredForPrinting obj = (ims.RefMan.domain.objects.ReportsRequiredForPrinting)it50.next();
		if (obj != null)
		{
		   if (i50 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i50++;
		}
		if (i50 > 0)
			auditStr.append("] " + i50);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeToGPDetailsReviewStatus* :");
		if (dischargeToGPDetailsReviewStatus != null)
			auditStr.append(dischargeToGPDetailsReviewStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*contract* :");
		if (contract != null)
		{
			auditStr.append(toShortClassName(contract));
				
		    auditStr.append(contract.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingClinicalInfo* :");
		if (awaitingClinicalInfo != null)
		{
			auditStr.append(toShortClassName(awaitingClinicalInfo));
				
		    auditStr.append(awaitingClinicalInfo.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isAwaitingClinicalInfo* :");
		auditStr.append(isAwaitingClinicalInfo);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActiveMonitorApptRequired* :");
		auditStr.append(isActiveMonitorApptRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*cATSReportSentDate* :");
		auditStr.append(cATSReportSentDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*suitableForSurgeryDate* :");
		auditStr.append(suitableForSurgeryDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*oPDLocation* :");
		if (oPDLocation != null)
		{
			auditStr.append(toShortClassName(oPDLocation));
				
		    auditStr.append(oPDLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*endOfCareDate* :");
		auditStr.append(endOfCareDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureForPostOpReview* :");
		if (procedureForPostOpReview != null)
		{
			auditStr.append(toShortClassName(procedureForPostOpReview));
				
		    auditStr.append(procedureForPostOpReview.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referralCategory* :");
		if (referralCategory != null)
			auditStr.append(referralCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isOnwardReferralTriage* :");
		auditStr.append(isOnwardReferralTriage);
	    auditStr.append("; ");
		auditStr.append("\r\n*nearestTreatmentCentre* :");
		if (nearestTreatmentCentre != null)
		{
			auditStr.append(toShortClassName(nearestTreatmentCentre));
				
		    auditStr.append(nearestTreatmentCentre.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasOPProcAwaitingAppt* :");
		auditStr.append(hasOPProcAwaitingAppt);
	    auditStr.append("; ");
		auditStr.append("\r\n*urgency* :");
		if (urgency != null)
			auditStr.append(urgency.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*journey* :");
		if (journey != null)
		{
			auditStr.append(toShortClassName(journey));
				
		    auditStr.append(journey.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pathwayID* :");
		auditStr.append(pathwayID);
	    auditStr.append("; ");
		auditStr.append("\r\n*rTTClockImpact* :");
		auditStr.append(rTTClockImpact);
	    auditStr.append("; ");
		auditStr.append("\r\n*electiveEROD* :");
		if (electiveEROD != null)
		{
		int i69=0;
		for (i69=0; i69<electiveEROD.size(); i69++)
		{
			if (i69 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.ReferralEROD obj = (ims.RefMan.domain.objects.ReferralEROD)electiveEROD.get(i69);
		    if (obj != null)
			{
				if (i69 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i69 > 0)
			auditStr.append("] " + i69);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*electiveERODHistory* :");
		if (electiveERODHistory != null)
		{
		int i70=0;
		for (i70=0; i70<electiveERODHistory.size(); i70++)
		{
			if (i70 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.ReferralEROD obj = (ims.RefMan.domain.objects.ReferralEROD)electiveERODHistory.get(i70);
		    if (obj != null)
			{
				if (i70 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i70 > 0)
			auditStr.append("] " + i70);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*outpatientEROD* :");
		if (outpatientEROD != null)
		{
		int i71=0;
		for (i71=0; i71<outpatientEROD.size(); i71++)
		{
			if (i71 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.ReferralEROD obj = (ims.RefMan.domain.objects.ReferralEROD)outpatientEROD.get(i71);
		    if (obj != null)
			{
				if (i71 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i71 > 0)
			auditStr.append("] " + i71);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentRTTStatus* :");
		if (currentRTTStatus != null)
		{
			auditStr.append(toShortClassName(currentRTTStatus));
				
		    auditStr.append(currentRTTStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*adminEvent* :");
		if (adminEvent != null)
		{
		int i73=0;
		for (i73=0; i73<adminEvent.size(); i73++)
		{
			if (i73 > 0)
				auditStr.append(",");
			ims.pathways.domain.objects.AdminEvent obj = (ims.pathways.domain.objects.AdminEvent)adminEvent.get(i73);
		    if (obj != null)
			{
				if (i73 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i73 > 0)
			auditStr.append("] " + i73);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*admissions* :");
		if (admissions != null)
		{
		int i74=0;
		for (i74=0; i74<admissions.size(); i74++)
		{
			if (i74 > 0)
				auditStr.append(",");
			ims.core.admin.pas.domain.objects.AdmissionDetail obj = (ims.core.admin.pas.domain.objects.AdmissionDetail)admissions.get(i74);
		    if (obj != null)
			{
				if (i74 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i74 > 0)
			auditStr.append("] " + i74);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referralTransfer* :");
		if (referralTransfer != null)
		{
			auditStr.append(toShortClassName(referralTransfer));
				
		    auditStr.append(referralTransfer.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*consUpgradeDate* :");
		auditStr.append(consUpgradeDate);
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
		
		String keyClassName = "CatsReferral";
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
		if (this.getICABReferral() != null)
		{
			sb.append("<iCABReferral>");
			sb.append(this.getICABReferral().toXMLString(domMap)); 	
			sb.append("</iCABReferral>");		
		}
		if (this.getReferralDetails() != null)
		{
			sb.append("<referralDetails>");
			sb.append(this.getReferralDetails().toXMLString(domMap)); 	
			sb.append("</referralDetails>");		
		}
		if (this.getDOS() != null)
		{
			sb.append("<dOS>");
			sb.append(this.getDOS().toXMLString(domMap)); 	
			sb.append("</dOS>");		
		}
		if (this.getInvestigationOrders() != null)
		{
			if (this.getInvestigationOrders().size() > 0 )
			{
			sb.append("<investigationOrders>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInvestigationOrders(), domMap));
			sb.append("</investigationOrders>");		
			}
		}
		if (this.isHasInvestigations() != null)
		{
			sb.append("<hasInvestigations>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasInvestigations().toString()));
			sb.append("</hasInvestigations>");		
		}
		if (this.getAppointments() != null)
		{
			if (this.getAppointments().size() > 0 )
			{
			sb.append("<appointments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAppointments(), domMap));
			sb.append("</appointments>");		
			}
		}
		if (this.isHasAppointments() != null)
		{
			sb.append("<hasAppointments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasAppointments().toString()));
			sb.append("</hasAppointments>");		
		}
		if (this.getReferralDocuments() != null)
		{
			if (this.getReferralDocuments().size() > 0 )
			{
			sb.append("<referralDocuments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getReferralDocuments(), domMap));
			sb.append("</referralDocuments>");		
			}
		}
		if (this.isHasDocuments() != null)
		{
			sb.append("<hasDocuments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasDocuments().toString()));
			sb.append("</hasDocuments>");		
		}
		if (this.isHasReferralLetter() != null)
		{
			sb.append("<hasReferralLetter>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasReferralLetter().toString()));
			sb.append("</hasReferralLetter>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString(domMap)); 	
			sb.append("</currentStatus>");		
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
		if (this.getOrderInvAppts() != null)
		{
			if (this.getOrderInvAppts().size() > 0 )
			{
			sb.append("<orderInvAppts>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOrderInvAppts(), domMap));
			sb.append("</orderInvAppts>");		
			}
		}
		if (this.getCallAttempts() != null)
		{
			if (this.getCallAttempts().size() > 0 )
			{
			sb.append("<callAttempts>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCallAttempts(), domMap));
			sb.append("</callAttempts>");		
			}
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.isIsCAB() != null)
		{
			sb.append("<isCAB>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCAB().toString()));
			sb.append("</isCAB>");		
		}
		if (this.getConsultationAppt() != null)
		{
			sb.append("<consultationAppt>");
			sb.append(this.getConsultationAppt().toXMLString(domMap)); 	
			sb.append("</consultationAppt>");		
		}
		if (this.getAdditionalInvApptsStatus() != null)
		{
			sb.append("<additionalInvApptsStatus>");
			sb.append(this.getAdditionalInvApptsStatus().toXMLString()); 
			sb.append("</additionalInvApptsStatus>");		
		}
		if (this.getRejectReferralDetail() != null)
		{
			sb.append("<rejectReferralDetail>");
			sb.append(this.getRejectReferralDetail().toXMLString(domMap)); 	
			sb.append("</rejectReferralDetail>");		
		}
		if (this.isHasRejectedInv() != null)
		{
			sb.append("<hasRejectedInv>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasRejectedInv().toString()));
			sb.append("</hasRejectedInv>");		
		}
		if (this.getProviderCancellation() != null)
		{
			sb.append("<providerCancellation>");
			sb.append(this.getProviderCancellation().toXMLString(domMap)); 	
			sb.append("</providerCancellation>");		
		}
		if (this.isIsFlaggedForReview() != null)
		{
			sb.append("<isFlaggedForReview>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsFlaggedForReview().toString()));
			sb.append("</isFlaggedForReview>");		
		}
		if (this.getCurrentReviewDetail() != null)
		{
			if (this.getCurrentReviewDetail().size() > 0 )
			{
			sb.append("<currentReviewDetail>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCurrentReviewDetail(), domMap));
			sb.append("</currentReviewDetail>");		
			}
		}
		if (this.getReviewHistory() != null)
		{
			if (this.getReviewHistory().size() > 0 )
			{
			sb.append("<reviewHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getReviewHistory(), domMap));
			sb.append("</reviewHistory>");		
			}
		}
		if (this.getOnwardReferralStatus() != null)
		{
			sb.append("<onwardReferralStatus>");
			sb.append(this.getOnwardReferralStatus().toXMLString()); 
			sb.append("</onwardReferralStatus>");		
		}
		if (this.getUniqueLineRefNo() != null)
		{
			sb.append("<uniqueLineRefNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUniqueLineRefNo().toString()));
			sb.append("</uniqueLineRefNo>");		
		}
		if (this.isHasConsultationDetails() != null)
		{
			sb.append("<hasConsultationDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasConsultationDetails().toString()));
			sb.append("</hasConsultationDetails>");		
		}
		if (this.getIsFinalReportRequired() != null)
		{
			sb.append("<isFinalReportRequired>");
			sb.append(this.getIsFinalReportRequired().toXMLString()); 
			sb.append("</isFinalReportRequired>");		
		}
		if (this.getDischargeDate() != null)
		{
			sb.append("<dischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDate>");		
		}
		if (this.getTriageDateTime() != null)
		{
			sb.append("<triageDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getTriageDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</triageDateTime>");		
		}
		if (this.getLastApptArrivedDate() != null)
		{
			sb.append("<lastApptArrivedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getLastApptArrivedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastApptArrivedDate>");		
		}
		if (this.isHasTLTStartContact() != null)
		{
			sb.append("<hasTLTStartContact>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasTLTStartContact().toString()));
			sb.append("</hasTLTStartContact>");		
		}
		if (this.isIsSuitableForSurgery() != null)
		{
			sb.append("<isSuitableForSurgery>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsSuitableForSurgery().toString()));
			sb.append("</isSuitableForSurgery>");		
		}
		if (this.isIsFitForSurgery() != null)
		{
			sb.append("<isFitForSurgery>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsFitForSurgery().toString()));
			sb.append("</isFitForSurgery>");		
		}
		if (this.isHasTheatreAppt() != null)
		{
			sb.append("<hasTheatreAppt>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasTheatreAppt().toString()));
			sb.append("</hasTheatreAppt>");		
		}
		if (this.isIsAcceptedOnCAB() != null)
		{
			sb.append("<isAcceptedOnCAB>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsAcceptedOnCAB().toString()));
			sb.append("</isAcceptedOnCAB>");		
		}
		if (this.isIsReferralRejectedOnCAB() != null)
		{
			sb.append("<isReferralRejectedOnCAB>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsReferralRejectedOnCAB().toString()));
			sb.append("</isReferralRejectedOnCAB>");		
		}
		if (this.isWasPatientRejectionLetterSent() != null)
		{
			sb.append("<wasPatientRejectionLetterSent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasPatientRejectionLetterSent().toString()));
			sb.append("</wasPatientRejectionLetterSent>");		
		}
		if (this.isWasPatientProviderCancellationLetterSent() != null)
		{
			sb.append("<wasPatientProviderCancellationLetterSent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasPatientProviderCancellationLetterSent().toString()));
			sb.append("</wasPatientProviderCancellationLetterSent>");		
		}
		if (this.isRequiresDischargeRep() != null)
		{
			sb.append("<requiresDischargeRep>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRequiresDischargeRep().toString()));
			sb.append("</requiresDischargeRep>");		
		}
		if (this.isHasDNAApptsForReview() != null)
		{
			sb.append("<hasDNAApptsForReview>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasDNAApptsForReview().toString()));
			sb.append("</hasDNAApptsForReview>");		
		}
		if (this.isHasCancelledApptsForReview() != null)
		{
			sb.append("<hasCancelledApptsForReview>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasCancelledApptsForReview().toString()));
			sb.append("</hasCancelledApptsForReview>");		
		}
		if (this.getIsSecondaryReportRequired() != null)
		{
			sb.append("<isSecondaryReportRequired>");
			sb.append(this.getIsSecondaryReportRequired().toXMLString()); 
			sb.append("</isSecondaryReportRequired>");		
		}
		if (this.isWasFurtherManagementDetailsReviewed() != null)
		{
			sb.append("<wasFurtherManagementDetailsReviewed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasFurtherManagementDetailsReviewed().toString()));
			sb.append("</wasFurtherManagementDetailsReviewed>");		
		}
		if (this.isIsCurrentlyAllocated() != null)
		{
			sb.append("<isCurrentlyAllocated>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCurrentlyAllocated().toString()));
			sb.append("</isCurrentlyAllocated>");		
		}
		if (this.getOnwardReferralReason() != null)
		{
			sb.append("<onwardReferralReason>");
			sb.append(this.getOnwardReferralReason().toXMLString()); 
			sb.append("</onwardReferralReason>");		
		}
		if (this.isWasOutputtedToWeeklyReport() != null)
		{
			sb.append("<wasOutputtedToWeeklyReport>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasOutputtedToWeeklyReport().toString()));
			sb.append("</wasOutputtedToWeeklyReport>");		
		}
		if (this.isWasOutputtedToMonthlyReport() != null)
		{
			sb.append("<wasOutputtedToMonthlyReport>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasOutputtedToMonthlyReport().toString()));
			sb.append("</wasOutputtedToMonthlyReport>");		
		}
		if (this.getReportsRequired() != null)
		{
			if (this.getReportsRequired().size() > 0 )
			{
			sb.append("<reportsRequired>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getReportsRequired(), domMap));
			sb.append("</reportsRequired>");		
			}
		}
		if (this.getDischargeToGPDetailsReviewStatus() != null)
		{
			sb.append("<dischargeToGPDetailsReviewStatus>");
			sb.append(this.getDischargeToGPDetailsReviewStatus().toXMLString()); 
			sb.append("</dischargeToGPDetailsReviewStatus>");		
		}
		if (this.getContract() != null)
		{
			sb.append("<contract>");
			sb.append(this.getContract().toXMLString(domMap)); 	
			sb.append("</contract>");		
		}
		if (this.getAwaitingClinicalInfo() != null)
		{
			sb.append("<awaitingClinicalInfo>");
			sb.append(this.getAwaitingClinicalInfo().toXMLString(domMap)); 	
			sb.append("</awaitingClinicalInfo>");		
		}
		if (this.isIsAwaitingClinicalInfo() != null)
		{
			sb.append("<isAwaitingClinicalInfo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsAwaitingClinicalInfo().toString()));
			sb.append("</isAwaitingClinicalInfo>");		
		}
		if (this.isIsActiveMonitorApptRequired() != null)
		{
			sb.append("<isActiveMonitorApptRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActiveMonitorApptRequired().toString()));
			sb.append("</isActiveMonitorApptRequired>");		
		}
		if (this.getCATSReportSentDate() != null)
		{
			sb.append("<cATSReportSentDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCATSReportSentDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</cATSReportSentDate>");		
		}
		if (this.getSuitableForSurgeryDate() != null)
		{
			sb.append("<suitableForSurgeryDate>");
			sb.append(new ims.framework.utils.DateTime(this.getSuitableForSurgeryDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</suitableForSurgeryDate>");		
		}
		if (this.getOPDLocation() != null)
		{
			sb.append("<oPDLocation>");
			sb.append(this.getOPDLocation().toXMLString(domMap)); 	
			sb.append("</oPDLocation>");		
		}
		if (this.getEndOfCareDate() != null)
		{
			sb.append("<endOfCareDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEndOfCareDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endOfCareDate>");		
		}
		if (this.getProcedureForPostOpReview() != null)
		{
			sb.append("<procedureForPostOpReview>");
			sb.append(this.getProcedureForPostOpReview().toXMLString(domMap)); 	
			sb.append("</procedureForPostOpReview>");		
		}
		if (this.getReferralCategory() != null)
		{
			sb.append("<referralCategory>");
			sb.append(this.getReferralCategory().toXMLString()); 
			sb.append("</referralCategory>");		
		}
		if (this.isIsOnwardReferralTriage() != null)
		{
			sb.append("<isOnwardReferralTriage>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsOnwardReferralTriage().toString()));
			sb.append("</isOnwardReferralTriage>");		
		}
		if (this.getNearestTreatmentCentre() != null)
		{
			sb.append("<nearestTreatmentCentre>");
			sb.append(this.getNearestTreatmentCentre().toXMLString(domMap)); 	
			sb.append("</nearestTreatmentCentre>");		
		}
		if (this.isHasOPProcAwaitingAppt() != null)
		{
			sb.append("<hasOPProcAwaitingAppt>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasOPProcAwaitingAppt().toString()));
			sb.append("</hasOPProcAwaitingAppt>");		
		}
		if (this.getUrgency() != null)
		{
			sb.append("<urgency>");
			sb.append(this.getUrgency().toXMLString()); 
			sb.append("</urgency>");		
		}
		if (this.getJourney() != null)
		{
			sb.append("<journey>");
			sb.append(this.getJourney().toXMLString(domMap)); 	
			sb.append("</journey>");		
		}
		if (this.getPathwayID() != null)
		{
			sb.append("<pathwayID>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPathwayID().toString()));
			sb.append("</pathwayID>");		
		}
		if (this.isRTTClockImpact() != null)
		{
			sb.append("<rTTClockImpact>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRTTClockImpact().toString()));
			sb.append("</rTTClockImpact>");		
		}
		if (this.getElectiveEROD() != null)
		{
			if (this.getElectiveEROD().size() > 0 )
			{
			sb.append("<electiveEROD>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getElectiveEROD(), domMap));
			sb.append("</electiveEROD>");		
			}
		}
		if (this.getElectiveERODHistory() != null)
		{
			if (this.getElectiveERODHistory().size() > 0 )
			{
			sb.append("<electiveERODHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getElectiveERODHistory(), domMap));
			sb.append("</electiveERODHistory>");		
			}
		}
		if (this.getOutpatientEROD() != null)
		{
			if (this.getOutpatientEROD().size() > 0 )
			{
			sb.append("<outpatientEROD>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOutpatientEROD(), domMap));
			sb.append("</outpatientEROD>");		
			}
		}
		if (this.getCurrentRTTStatus() != null)
		{
			sb.append("<currentRTTStatus>");
			sb.append(this.getCurrentRTTStatus().toXMLString(domMap)); 	
			sb.append("</currentRTTStatus>");		
		}
		if (this.getAdminEvent() != null)
		{
			if (this.getAdminEvent().size() > 0 )
			{
			sb.append("<adminEvent>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAdminEvent(), domMap));
			sb.append("</adminEvent>");		
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
		if (this.getReferralTransfer() != null)
		{
			sb.append("<referralTransfer>");
			sb.append(this.getReferralTransfer().toXMLString(domMap)); 	
			sb.append("</referralTransfer>");		
		}
		if (this.getConsUpgradeDate() != null)
		{
			sb.append("<consUpgradeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getConsUpgradeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</consUpgradeDate>");		
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
			CatsReferral domainObject = getCatsReferralfromXML(itemEl, factory, domMap);

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
			CatsReferral domainObject = getCatsReferralfromXML(itemEl, factory, domMap);

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
		
	public static CatsReferral getCatsReferralfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCatsReferralfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CatsReferral getCatsReferralfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CatsReferral.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CatsReferral.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CatsReferral class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CatsReferral)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CatsReferral.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CatsReferral ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CatsReferral)factory.getImportedDomainObject(CatsReferral.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CatsReferral();
		}
		String keyClassName = "CatsReferral";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CatsReferral)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CatsReferral obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("iCABReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setICABReferral(ims.core.admin.domain.objects.ICABReferral.getICABReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referralDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferralDetails(ims.core.clinical.domain.objects.ReferralLetterDetails.getReferralLetterDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dOS");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDOS(ims.scheduling.domain.objects.DirectoryofService.getDirectoryofServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("investigationOrders");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInvestigationOrders(ims.ocrr.orderingresults.domain.objects.OcsOrderSession.fromSetXMLString(fldEl, factory, obj.getInvestigationOrders(), domMap));
		}
		fldEl = el.element("hasInvestigations");
		if(fldEl != null)
		{	
    		obj.setHasInvestigations(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("appointments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAppointments(ims.scheduling.domain.objects.Booking_Appointment.fromSetXMLString(fldEl, factory, obj.getAppointments(), domMap));
		}
		fldEl = el.element("hasAppointments");
		if(fldEl != null)
		{	
    		obj.setHasAppointments(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referralDocuments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setReferralDocuments(ims.core.documents.domain.objects.PatientDocument.fromSetXMLString(fldEl, factory, obj.getReferralDocuments(), domMap));
		}
		fldEl = el.element("hasDocuments");
		if(fldEl != null)
		{	
    		obj.setHasDocuments(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasReferralLetter");
		if(fldEl != null)
		{	
    		obj.setHasReferralLetter(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.RefMan.domain.objects.CATSReferralStatus.getCATSReferralStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setStatusHistory(ims.RefMan.domain.objects.CATSReferralStatus.fromSetXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("orderInvAppts");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setOrderInvAppts(ims.RefMan.domain.objects.OrderInvAppt.fromSetXMLString(fldEl, factory, obj.getOrderInvAppts(), domMap));
		}
		fldEl = el.element("callAttempts");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setCallAttempts(ims.RefMan.domain.objects.AppointmentCallAttempts.fromSetXMLString(fldEl, factory, obj.getCallAttempts(), domMap));
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isCAB");
		if(fldEl != null)
		{	
    		obj.setIsCAB(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("consultationAppt");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConsultationAppt(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("additionalInvApptsStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdditionalInvApptsStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("rejectReferralDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRejectReferralDetail(ims.RefMan.domain.objects.ReferralReject.getReferralRejectfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hasRejectedInv");
		if(fldEl != null)
		{	
    		obj.setHasRejectedInv(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("providerCancellation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProviderCancellation(ims.RefMan.domain.objects.ProviderCancellation.getProviderCancellationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isFlaggedForReview");
		if(fldEl != null)
		{	
    		obj.setIsFlaggedForReview(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("currentReviewDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setCurrentReviewDetail(ims.RefMan.domain.objects.ReviewReferralDetail.fromSetXMLString(fldEl, factory, obj.getCurrentReviewDetail(), domMap));
		}
		fldEl = el.element("reviewHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setReviewHistory(ims.RefMan.domain.objects.ReviewReferralDetail.fromSetXMLString(fldEl, factory, obj.getReviewHistory(), domMap));
		}
		fldEl = el.element("onwardReferralStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOnwardReferralStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("uniqueLineRefNo");
		if(fldEl != null)
		{	
    		obj.setUniqueLineRefNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasConsultationDetails");
		if(fldEl != null)
		{	
    		obj.setHasConsultationDetails(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isFinalReportRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIsFinalReportRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dischargeDate");
		if(fldEl != null)
		{	
    		obj.setDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("triageDateTime");
		if(fldEl != null)
		{	
    		obj.setTriageDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("lastApptArrivedDate");
		if(fldEl != null)
		{	
    		obj.setLastApptArrivedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("hasTLTStartContact");
		if(fldEl != null)
		{	
    		obj.setHasTLTStartContact(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSuitableForSurgery");
		if(fldEl != null)
		{	
    		obj.setIsSuitableForSurgery(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isFitForSurgery");
		if(fldEl != null)
		{	
    		obj.setIsFitForSurgery(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasTheatreAppt");
		if(fldEl != null)
		{	
    		obj.setHasTheatreAppt(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isAcceptedOnCAB");
		if(fldEl != null)
		{	
    		obj.setIsAcceptedOnCAB(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isReferralRejectedOnCAB");
		if(fldEl != null)
		{	
    		obj.setIsReferralRejectedOnCAB(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasPatientRejectionLetterSent");
		if(fldEl != null)
		{	
    		obj.setWasPatientRejectionLetterSent(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasPatientProviderCancellationLetterSent");
		if(fldEl != null)
		{	
    		obj.setWasPatientProviderCancellationLetterSent(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requiresDischargeRep");
		if(fldEl != null)
		{	
    		obj.setRequiresDischargeRep(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasDNAApptsForReview");
		if(fldEl != null)
		{	
    		obj.setHasDNAApptsForReview(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasCancelledApptsForReview");
		if(fldEl != null)
		{	
    		obj.setHasCancelledApptsForReview(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSecondaryReportRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIsSecondaryReportRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wasFurtherManagementDetailsReviewed");
		if(fldEl != null)
		{	
    		obj.setWasFurtherManagementDetailsReviewed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isCurrentlyAllocated");
		if(fldEl != null)
		{	
    		obj.setIsCurrentlyAllocated(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("onwardReferralReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOnwardReferralReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wasOutputtedToWeeklyReport");
		if(fldEl != null)
		{	
    		obj.setWasOutputtedToWeeklyReport(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasOutputtedToMonthlyReport");
		if(fldEl != null)
		{	
    		obj.setWasOutputtedToMonthlyReport(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reportsRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setReportsRequired(ims.RefMan.domain.objects.ReportsRequiredForPrinting.fromSetXMLString(fldEl, factory, obj.getReportsRequired(), domMap));
		}
		fldEl = el.element("dischargeToGPDetailsReviewStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeToGPDetailsReviewStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("contract");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setContract(ims.core.configuration.domain.objects.ContractConfig.getContractConfigfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("awaitingClinicalInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAwaitingClinicalInfo(ims.RefMan.domain.objects.AwaitingClinicalInfo.getAwaitingClinicalInfofromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isAwaitingClinicalInfo");
		if(fldEl != null)
		{	
    		obj.setIsAwaitingClinicalInfo(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActiveMonitorApptRequired");
		if(fldEl != null)
		{	
    		obj.setIsActiveMonitorApptRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cATSReportSentDate");
		if(fldEl != null)
		{	
    		obj.setCATSReportSentDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("suitableForSurgeryDate");
		if(fldEl != null)
		{	
    		obj.setSuitableForSurgeryDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("oPDLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOPDLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("endOfCareDate");
		if(fldEl != null)
		{	
    		obj.setEndOfCareDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("procedureForPostOpReview");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedureForPostOpReview(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referralCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isOnwardReferralTriage");
		if(fldEl != null)
		{	
    		obj.setIsOnwardReferralTriage(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nearestTreatmentCentre");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNearestTreatmentCentre(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hasOPProcAwaitingAppt");
		if(fldEl != null)
		{	
    		obj.setHasOPProcAwaitingAppt(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("urgency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUrgency(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("journey");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setJourney(ims.pathways.domain.objects.PatientPathwayJourney.getPatientPathwayJourneyfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pathwayID");
		if(fldEl != null)
		{	
    		obj.setPathwayID(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rTTClockImpact");
		if(fldEl != null)
		{	
    		obj.setRTTClockImpact(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("electiveEROD");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setElectiveEROD(ims.RefMan.domain.objects.ReferralEROD.fromListXMLString(fldEl, factory, obj.getElectiveEROD(), domMap));
		}
		fldEl = el.element("electiveERODHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setElectiveERODHistory(ims.RefMan.domain.objects.ReferralEROD.fromListXMLString(fldEl, factory, obj.getElectiveERODHistory(), domMap));
		}
		fldEl = el.element("outpatientEROD");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOutpatientEROD(ims.RefMan.domain.objects.ReferralEROD.fromListXMLString(fldEl, factory, obj.getOutpatientEROD(), domMap));
		}
		fldEl = el.element("currentRTTStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentRTTStatus(ims.pathways.domain.objects.PathwayRTTStatus.getPathwayRTTStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("adminEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAdminEvent(ims.pathways.domain.objects.AdminEvent.fromListXMLString(fldEl, factory, obj.getAdminEvent(), domMap));
		}
		fldEl = el.element("admissions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAdmissions(ims.core.admin.pas.domain.objects.AdmissionDetail.fromListXMLString(fldEl, factory, obj.getAdmissions(), domMap));
		}
		fldEl = el.element("referralTransfer");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferralTransfer(ims.RefMan.domain.objects.ReferralTransfer.getReferralTransferfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("consUpgradeDate");
		if(fldEl != null)
		{	
    		obj.setConsUpgradeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "investigationOrders"
		, "appointments"
		, "referralDocuments"
		, "statusHistory"
		, "orderInvAppts"
		, "callAttempts"
		, "currentReviewDetail"
		, "reviewHistory"
		, "reportsRequired"
		, "electiveEROD"
		, "electiveERODHistory"
		, "outpatientEROD"
		, "adminEvent"
		, "admissions"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String ICABReferral = "iCABReferral";
		public static final String ReferralDetails = "referralDetails";
		public static final String DOS = "dOS";
		public static final String InvestigationOrders = "investigationOrders";
		public static final String HasInvestigations = "hasInvestigations";
		public static final String Appointments = "appointments";
		public static final String HasAppointments = "hasAppointments";
		public static final String ReferralDocuments = "referralDocuments";
		public static final String HasDocuments = "hasDocuments";
		public static final String HasReferralLetter = "hasReferralLetter";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String OrderInvAppts = "orderInvAppts";
		public static final String CallAttempts = "callAttempts";
		public static final String CareContext = "careContext";
		public static final String IsCAB = "isCAB";
		public static final String ConsultationAppt = "consultationAppt";
		public static final String AdditionalInvApptsStatus = "additionalInvApptsStatus";
		public static final String RejectReferralDetail = "rejectReferralDetail";
		public static final String HasRejectedInv = "hasRejectedInv";
		public static final String ProviderCancellation = "providerCancellation";
		public static final String IsFlaggedForReview = "isFlaggedForReview";
		public static final String CurrentReviewDetail = "currentReviewDetail";
		public static final String ReviewHistory = "reviewHistory";
		public static final String OnwardReferralStatus = "onwardReferralStatus";
		public static final String UniqueLineRefNo = "uniqueLineRefNo";
		public static final String HasConsultationDetails = "hasConsultationDetails";
		public static final String IsFinalReportRequired = "isFinalReportRequired";
		public static final String DischargeDate = "dischargeDate";
		public static final String TriageDateTime = "triageDateTime";
		public static final String LastApptArrivedDate = "lastApptArrivedDate";
		public static final String HasTLTStartContact = "hasTLTStartContact";
		public static final String IsSuitableForSurgery = "isSuitableForSurgery";
		public static final String IsFitForSurgery = "isFitForSurgery";
		public static final String HasTheatreAppt = "hasTheatreAppt";
		public static final String IsAcceptedOnCAB = "isAcceptedOnCAB";
		public static final String IsReferralRejectedOnCAB = "isReferralRejectedOnCAB";
		public static final String WasPatientRejectionLetterSent = "wasPatientRejectionLetterSent";
		public static final String WasPatientProviderCancellationLetterSent = "wasPatientProviderCancellationLetterSent";
		public static final String RequiresDischargeRep = "requiresDischargeRep";
		public static final String HasDNAApptsForReview = "hasDNAApptsForReview";
		public static final String HasCancelledApptsForReview = "hasCancelledApptsForReview";
		public static final String IsSecondaryReportRequired = "isSecondaryReportRequired";
		public static final String WasFurtherManagementDetailsReviewed = "wasFurtherManagementDetailsReviewed";
		public static final String IsCurrentlyAllocated = "isCurrentlyAllocated";
		public static final String OnwardReferralReason = "onwardReferralReason";
		public static final String WasOutputtedToWeeklyReport = "wasOutputtedToWeeklyReport";
		public static final String WasOutputtedToMonthlyReport = "wasOutputtedToMonthlyReport";
		public static final String ReportsRequired = "reportsRequired";
		public static final String DischargeToGPDetailsReviewStatus = "dischargeToGPDetailsReviewStatus";
		public static final String Contract = "contract";
		public static final String AwaitingClinicalInfo = "awaitingClinicalInfo";
		public static final String IsAwaitingClinicalInfo = "isAwaitingClinicalInfo";
		public static final String IsActiveMonitorApptRequired = "isActiveMonitorApptRequired";
		public static final String CATSReportSentDate = "cATSReportSentDate";
		public static final String SuitableForSurgeryDate = "suitableForSurgeryDate";
		public static final String OPDLocation = "oPDLocation";
		public static final String EndOfCareDate = "endOfCareDate";
		public static final String ProcedureForPostOpReview = "procedureForPostOpReview";
		public static final String ReferralCategory = "referralCategory";
		public static final String IsOnwardReferralTriage = "isOnwardReferralTriage";
		public static final String NearestTreatmentCentre = "nearestTreatmentCentre";
		public static final String HasOPProcAwaitingAppt = "hasOPProcAwaitingAppt";
		public static final String Urgency = "urgency";
		public static final String Journey = "journey";
		public static final String PathwayID = "pathwayID";
		public static final String RTTClockImpact = "rTTClockImpact";
		public static final String ElectiveEROD = "electiveEROD";
		public static final String ElectiveERODHistory = "electiveERODHistory";
		public static final String OutpatientEROD = "outpatientEROD";
		public static final String CurrentRTTStatus = "currentRTTStatus";
		public static final String AdminEvent = "adminEvent";
		public static final String Admissions = "admissions";
		public static final String ReferralTransfer = "referralTransfer";
		public static final String ConsUpgradeDate = "consUpgradeDate";
	}
}

