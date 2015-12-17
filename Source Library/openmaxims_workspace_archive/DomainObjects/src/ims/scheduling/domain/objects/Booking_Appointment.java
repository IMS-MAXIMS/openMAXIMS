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
package ims.scheduling.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class Booking_Appointment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1055100007;
	private static final long serialVersionUID = 1055100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** AppointmentDate */
	private java.util.Date appointmentDate;
	/** ApptStartTime */
	private String apptStartTime;
	/** ApptEndTime */
	private String apptEndTime;
	/** ApptStatus */
	private ims.domain.lookups.LookupInstance apptStatus;
	/** ApptStatusReas */
	private ims.domain.lookups.LookupInstance apptStatusReas;
	/** ApptStatusHistory
	  * Collection of ims.scheduling.domain.objects.Appointment_Status.
	  */
	private java.util.Set apptStatusHistory;
	/** ApptConfirmStatus */
	private ims.domain.lookups.LookupInstance apptConfirmStatus;
	/** AttendanceTime(At Booking) */
	private String attendanceTime;
	/** ArrivalTime */
	private String arrivalTime;
	/** ArrivalStatus */
	private ims.domain.lookups.LookupInstance arrivalStatus;
	/** SeenTime */
	private String seenTime;
	/** SeenBy */
	private ims.core.resource.people.domain.objects.Hcp seenBy;
	/** ApptComplete Time */
	private String apptCompleteTime;
	/** ActCompleteFlag */
	private ims.domain.lookups.LookupInstance actCompleteFlag;
	/** Comments */
	private String comments;
	/** TransportType */
	private ims.domain.lookups.LookupInstance transportType;
	/** Priority */
	private ims.domain.lookups.LookupInstance priority;
	/** DispCode */
	private ims.domain.lookups.LookupInstance dispCode;
	/** ContractId */
	private String contractId;
	/** Recipient1 */
	private String recipient1;
	/** Recipient2 */
	private String recipient2;
	/** Recipient3 */
	private String recipient3;
	/** Recipient4 */
	private String recipient4;
	/** Recipient5 */
	private String recipient5;
	/** Recipient6 */
	private String recipient6;
	/** Recipient7 */
	private String recipient7;
	/** Activity */
	private ims.core.resource.place.domain.objects.Activity activity;
	/** ProfileSession */
	private ims.scheduling.domain.objects.Sch_Session session;
	/** SessionSlot */
	private ims.scheduling.domain.objects.Session_Slot sessionSlot;
	/** Pathway Events
	  * Collection of ims.pathways.domain.objects.PatientEvent.
	  */
	private java.util.Set pathwayEvents;
	/** set to true when booked from CAB */
	private Boolean isCABBooking;
	/** Patient who this appointment is made for */
	private ims.core.patient.domain.objects.Patient patient;
	private Boolean requiresRebook;
	/** EROD - EarliestReasonableOfferedDate */
	private java.util.Date earliestOfferedDate;
	/** Does the patient require Transport for Appt */
	private Boolean isTransportRequired;
	/** Is Transport booked for Appt */
	private Boolean isTransportBooked;
	/** Current Appt Status Record */
	private ims.scheduling.domain.objects.Appointment_Status currentStatusRecord;
	/** UniqueLineRefNo - Used for Monthly Activity Report */
	private String uniqueLineRefNo;
	/** Outcome */
	private ims.domain.lookups.LookupInstance outcome;
	/** OutcomeReason */
	private ims.domain.lookups.LookupInstance outcomeReason;
	/** OutcomeComments */
	private String outcomeComments;
	/** First Definitive Treatment checked */
	private Boolean wasFirstDefinitiveTreatment;
	/** Theatre Slot Booking */
	private ims.scheduling.domain.objects.TheatreBooking theatreBooking;
	/** wasOutputtedToWeeklyReport */
	private Boolean wasOutputtedToWeeklyReport;
	/** wasOutputtedToMonthlyReport */
	private Boolean wasOutputtedToMonthlyReport;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Used for Theatre Booking when user wishes to use more time than is allocated */
	private Integer customProcedureDuration;
	/** Appt Tracking Status History
	  * Collection of ims.scheduling.domain.objects.Appt_Tracking_Status_History.
	  */
	private java.util.List apptTrackingStatusHistory;
	/** TheatreSlot that this appointment is booked into */
	private ims.scheduling.domain.objects.SessionTheatreTCISlot theatreSlot;
	/** Was the cancellation reviewed */
	private Boolean wasReviewed;
	/** IntraOperativeCareRecord
	  * Collection of ims.core.clinical.domain.objects.IntraOperativeCareRecord.
	  */
	private java.util.List intraOperativeCareRecord;
	/** Appointment TCI Time */
	private String appointmentTCITime;
	/** ParentChildSlot that this appointment is booked into */
	private ims.scheduling.domain.objects.SessionParentChildSlot parentChildSlot;
	/** CurrentClock from CatsReferral at the time when Booking_Appointment was created */
	private ims.pathways.domain.objects.PathwayClock pathwayClock;
	/** Linked PAS Event */
	private ims.core.admin.pas.domain.objects.PASEvent pASEvent;
	/** True where on an EL, False otherwise  */
	private Boolean hasElectiveList;
	/** Consultation Media Type */
	private ims.domain.lookups.LookupInstance consMediaType;
	/** OutpatientProcedures
	  * Collection of ims.core.clinical.domain.objects.PatientProcedure.
	  */
	private java.util.Set outpatientProcedures;
	/** OutpatientDiagnoses
	  * Collection of ims.core.clinical.domain.objects.PatientDiagnosis.
	  */
	private java.util.Set outpatientDiagnoses;
	/** For use on clinic cash up form
	  * Collection of ims.scheduling.domain.objects.AppointmentOutcomeAction.
	  */
	private java.util.List outcomeActions;
	/** Referral Category */
	private ims.domain.lookups.LookupInstance category;
	/** CaseNotesPulled */
	private Boolean caseNotesPulled;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Booking_Appointment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Booking_Appointment ()
    {
    	super();
    }
    public Booking_Appointment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.Booking_Appointment.class;
	}


	public java.util.Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(java.util.Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getApptStartTime() {
		return apptStartTime;
	}
	public void setApptStartTime(String apptStartTime) {
		this.apptStartTime = apptStartTime;
	}

	public String getApptEndTime() {
		return apptEndTime;
	}
	public void setApptEndTime(String apptEndTime) {
		this.apptEndTime = apptEndTime;
	}

	public ims.domain.lookups.LookupInstance getApptStatus() {
		return apptStatus;
	}
	public void setApptStatus(ims.domain.lookups.LookupInstance apptStatus) {
		this.apptStatus = apptStatus;
	}

	public ims.domain.lookups.LookupInstance getApptStatusReas() {
		return apptStatusReas;
	}
	public void setApptStatusReas(ims.domain.lookups.LookupInstance apptStatusReas) {
		this.apptStatusReas = apptStatusReas;
	}

	public java.util.Set getApptStatusHistory() {
		if ( null == apptStatusHistory ) {
			apptStatusHistory = new java.util.HashSet();
		}
		return apptStatusHistory;
	}
	public void setApptStatusHistory(java.util.Set paramValue) {
		this.apptStatusHistory = paramValue;
	}

	public ims.domain.lookups.LookupInstance getApptConfirmStatus() {
		return apptConfirmStatus;
	}
	public void setApptConfirmStatus(ims.domain.lookups.LookupInstance apptConfirmStatus) {
		this.apptConfirmStatus = apptConfirmStatus;
	}

	public String getAttendanceTime() {
		return attendanceTime;
	}
	public void setAttendanceTime(String attendanceTime) {
		this.attendanceTime = attendanceTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public ims.domain.lookups.LookupInstance getArrivalStatus() {
		return arrivalStatus;
	}
	public void setArrivalStatus(ims.domain.lookups.LookupInstance arrivalStatus) {
		this.arrivalStatus = arrivalStatus;
	}

	public String getSeenTime() {
		return seenTime;
	}
	public void setSeenTime(String seenTime) {
		this.seenTime = seenTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getSeenBy() {
		return seenBy;
	}
	public void setSeenBy(ims.core.resource.people.domain.objects.Hcp seenBy) {
		this.seenBy = seenBy;
	}

	public String getApptCompleteTime() {
		return apptCompleteTime;
	}
	public void setApptCompleteTime(String apptCompleteTime) {
		this.apptCompleteTime = apptCompleteTime;
	}

	public ims.domain.lookups.LookupInstance getActCompleteFlag() {
		return actCompleteFlag;
	}
	public void setActCompleteFlag(ims.domain.lookups.LookupInstance actCompleteFlag) {
		this.actCompleteFlag = actCompleteFlag;
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

	public ims.domain.lookups.LookupInstance getTransportType() {
		return transportType;
	}
	public void setTransportType(ims.domain.lookups.LookupInstance transportType) {
		this.transportType = transportType;
	}

	public ims.domain.lookups.LookupInstance getPriority() {
		return priority;
	}
	public void setPriority(ims.domain.lookups.LookupInstance priority) {
		this.priority = priority;
	}

	public ims.domain.lookups.LookupInstance getDispCode() {
		return dispCode;
	}
	public void setDispCode(ims.domain.lookups.LookupInstance dispCode) {
		this.dispCode = dispCode;
	}

	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		if ( null != contractId && contractId.length() > 15 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for contractId. Tried to set value: "+
				contractId);
		}
		this.contractId = contractId;
	}

	public String getRecipient1() {
		return recipient1;
	}
	public void setRecipient1(String recipient1) {
		if ( null != recipient1 && recipient1.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recipient1. Tried to set value: "+
				recipient1);
		}
		this.recipient1 = recipient1;
	}

	public String getRecipient2() {
		return recipient2;
	}
	public void setRecipient2(String recipient2) {
		if ( null != recipient2 && recipient2.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recipient2. Tried to set value: "+
				recipient2);
		}
		this.recipient2 = recipient2;
	}

	public String getRecipient3() {
		return recipient3;
	}
	public void setRecipient3(String recipient3) {
		if ( null != recipient3 && recipient3.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recipient3. Tried to set value: "+
				recipient3);
		}
		this.recipient3 = recipient3;
	}

	public String getRecipient4() {
		return recipient4;
	}
	public void setRecipient4(String recipient4) {
		if ( null != recipient4 && recipient4.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recipient4. Tried to set value: "+
				recipient4);
		}
		this.recipient4 = recipient4;
	}

	public String getRecipient5() {
		return recipient5;
	}
	public void setRecipient5(String recipient5) {
		if ( null != recipient5 && recipient5.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recipient5. Tried to set value: "+
				recipient5);
		}
		this.recipient5 = recipient5;
	}

	public String getRecipient6() {
		return recipient6;
	}
	public void setRecipient6(String recipient6) {
		if ( null != recipient6 && recipient6.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recipient6. Tried to set value: "+
				recipient6);
		}
		this.recipient6 = recipient6;
	}

	public String getRecipient7() {
		return recipient7;
	}
	public void setRecipient7(String recipient7) {
		if ( null != recipient7 && recipient7.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recipient7. Tried to set value: "+
				recipient7);
		}
		this.recipient7 = recipient7;
	}

	public ims.core.resource.place.domain.objects.Activity getActivity() {
		return activity;
	}
	public void setActivity(ims.core.resource.place.domain.objects.Activity activity) {
		this.activity = activity;
	}

	public ims.scheduling.domain.objects.Sch_Session getSession() {
		return session;
	}
	public void setSession(ims.scheduling.domain.objects.Sch_Session session) {
		this.session = session;
	}

	public ims.scheduling.domain.objects.Session_Slot getSessionSlot() {
		return sessionSlot;
	}
	public void setSessionSlot(ims.scheduling.domain.objects.Session_Slot sessionSlot) {
		this.sessionSlot = sessionSlot;
	}

	public java.util.Set getPathwayEvents() {
		if ( null == pathwayEvents ) {
			pathwayEvents = new java.util.HashSet();
		}
		return pathwayEvents;
	}
	public void setPathwayEvents(java.util.Set paramValue) {
		this.pathwayEvents = paramValue;
	}

	public Boolean isIsCABBooking() {
		return isCABBooking;
	}
	public void setIsCABBooking(Boolean isCABBooking) {
		this.isCABBooking = isCABBooking;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public Boolean isRequiresRebook() {
		return requiresRebook;
	}
	public void setRequiresRebook(Boolean requiresRebook) {
		this.requiresRebook = requiresRebook;
	}

	public java.util.Date getEarliestOfferedDate() {
		return earliestOfferedDate;
	}
	public void setEarliestOfferedDate(java.util.Date earliestOfferedDate) {
		this.earliestOfferedDate = earliestOfferedDate;
	}

	public Boolean isIsTransportRequired() {
		return isTransportRequired;
	}
	public void setIsTransportRequired(Boolean isTransportRequired) {
		this.isTransportRequired = isTransportRequired;
	}

	public Boolean isIsTransportBooked() {
		return isTransportBooked;
	}
	public void setIsTransportBooked(Boolean isTransportBooked) {
		this.isTransportBooked = isTransportBooked;
	}

	public ims.scheduling.domain.objects.Appointment_Status getCurrentStatusRecord() {
		return currentStatusRecord;
	}
	public void setCurrentStatusRecord(ims.scheduling.domain.objects.Appointment_Status currentStatusRecord) {
		this.currentStatusRecord = currentStatusRecord;
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

	public ims.domain.lookups.LookupInstance getOutcome() {
		return outcome;
	}
	public void setOutcome(ims.domain.lookups.LookupInstance outcome) {
		this.outcome = outcome;
	}

	public ims.domain.lookups.LookupInstance getOutcomeReason() {
		return outcomeReason;
	}
	public void setOutcomeReason(ims.domain.lookups.LookupInstance outcomeReason) {
		this.outcomeReason = outcomeReason;
	}

	public String getOutcomeComments() {
		return outcomeComments;
	}
	public void setOutcomeComments(String outcomeComments) {
		if ( null != outcomeComments && outcomeComments.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for outcomeComments. Tried to set value: "+
				outcomeComments);
		}
		this.outcomeComments = outcomeComments;
	}

	public Boolean isWasFirstDefinitiveTreatment() {
		return wasFirstDefinitiveTreatment;
	}
	public void setWasFirstDefinitiveTreatment(Boolean wasFirstDefinitiveTreatment) {
		this.wasFirstDefinitiveTreatment = wasFirstDefinitiveTreatment;
	}

	public ims.scheduling.domain.objects.TheatreBooking getTheatreBooking() {
		return theatreBooking;
	}
	public void setTheatreBooking(ims.scheduling.domain.objects.TheatreBooking theatreBooking) {
		this.theatreBooking = theatreBooking;
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

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public Integer getCustomProcedureDuration() {
		return customProcedureDuration;
	}
	public void setCustomProcedureDuration(Integer customProcedureDuration) {
		this.customProcedureDuration = customProcedureDuration;
	}

	public java.util.List getApptTrackingStatusHistory() {
		if ( null == apptTrackingStatusHistory ) {
			apptTrackingStatusHistory = new java.util.ArrayList();
		}
		return apptTrackingStatusHistory;
	}
	public void setApptTrackingStatusHistory(java.util.List paramValue) {
		this.apptTrackingStatusHistory = paramValue;
	}

	public ims.scheduling.domain.objects.SessionTheatreTCISlot getTheatreSlot() {
		return theatreSlot;
	}
	public void setTheatreSlot(ims.scheduling.domain.objects.SessionTheatreTCISlot theatreSlot) {
		this.theatreSlot = theatreSlot;
	}

	public Boolean isWasReviewed() {
		return wasReviewed;
	}
	public void setWasReviewed(Boolean wasReviewed) {
		this.wasReviewed = wasReviewed;
	}

	public java.util.List getIntraOperativeCareRecord() {
		if ( null == intraOperativeCareRecord ) {
			intraOperativeCareRecord = new java.util.ArrayList();
		}
		return intraOperativeCareRecord;
	}
	public void setIntraOperativeCareRecord(java.util.List paramValue) {
		this.intraOperativeCareRecord = paramValue;
	}

	public String getAppointmentTCITime() {
		return appointmentTCITime;
	}
	public void setAppointmentTCITime(String appointmentTCITime) {
		this.appointmentTCITime = appointmentTCITime;
	}

	public ims.scheduling.domain.objects.SessionParentChildSlot getParentChildSlot() {
		return parentChildSlot;
	}
	public void setParentChildSlot(ims.scheduling.domain.objects.SessionParentChildSlot parentChildSlot) {
		this.parentChildSlot = parentChildSlot;
	}

	public ims.pathways.domain.objects.PathwayClock getPathwayClock() {
		return pathwayClock;
	}
	public void setPathwayClock(ims.pathways.domain.objects.PathwayClock pathwayClock) {
		this.pathwayClock = pathwayClock;
	}

	public ims.core.admin.pas.domain.objects.PASEvent getPASEvent() {
		return pASEvent;
	}
	public void setPASEvent(ims.core.admin.pas.domain.objects.PASEvent pASEvent) {
		this.pASEvent = pASEvent;
	}

	public Boolean isHasElectiveList() {
		return hasElectiveList;
	}
	public void setHasElectiveList(Boolean hasElectiveList) {
		this.hasElectiveList = hasElectiveList;
	}

	public ims.domain.lookups.LookupInstance getConsMediaType() {
		return consMediaType;
	}
	public void setConsMediaType(ims.domain.lookups.LookupInstance consMediaType) {
		this.consMediaType = consMediaType;
	}

	public java.util.Set getOutpatientProcedures() {
		if ( null == outpatientProcedures ) {
			outpatientProcedures = new java.util.HashSet();
		}
		return outpatientProcedures;
	}
	public void setOutpatientProcedures(java.util.Set paramValue) {
		this.outpatientProcedures = paramValue;
	}

	public java.util.Set getOutpatientDiagnoses() {
		if ( null == outpatientDiagnoses ) {
			outpatientDiagnoses = new java.util.HashSet();
		}
		return outpatientDiagnoses;
	}
	public void setOutpatientDiagnoses(java.util.Set paramValue) {
		this.outpatientDiagnoses = paramValue;
	}

	public java.util.List getOutcomeActions() {
		if ( null == outcomeActions ) {
			outcomeActions = new java.util.ArrayList();
		}
		return outcomeActions;
	}
	public void setOutcomeActions(java.util.List paramValue) {
		this.outcomeActions = paramValue;
	}

	public ims.domain.lookups.LookupInstance getCategory() {
		return category;
	}
	public void setCategory(ims.domain.lookups.LookupInstance category) {
		this.category = category;
	}

	public Boolean isCaseNotesPulled() {
		return caseNotesPulled;
	}
	public void setCaseNotesPulled(Boolean caseNotesPulled) {
		this.caseNotesPulled = caseNotesPulled;
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
		
		auditStr.append("\r\n*appointmentDate* :");
		auditStr.append(appointmentDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*apptStartTime* :");
		auditStr.append(apptStartTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*apptEndTime* :");
		auditStr.append(apptEndTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*apptStatus* :");
		if (apptStatus != null)
			auditStr.append(apptStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*apptStatusReas* :");
		if (apptStatusReas != null)
			auditStr.append(apptStatusReas.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*apptStatusHistory* :");
		if (apptStatusHistory != null)
		{
			java.util.Iterator it6 = apptStatusHistory.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Appointment_Status obj = (ims.scheduling.domain.objects.Appointment_Status)it6.next();
		if (obj != null)
		{
		   if (i6 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*apptConfirmStatus* :");
		if (apptConfirmStatus != null)
			auditStr.append(apptConfirmStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*attendanceTime* :");
		auditStr.append(attendanceTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*arrivalTime* :");
		auditStr.append(arrivalTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*arrivalStatus* :");
		if (arrivalStatus != null)
			auditStr.append(arrivalStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*seenTime* :");
		auditStr.append(seenTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*seenBy* :");
		if (seenBy != null)
		{
			auditStr.append(toShortClassName(seenBy));
				
		    auditStr.append(seenBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*apptCompleteTime* :");
		auditStr.append(apptCompleteTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*actCompleteFlag* :");
		if (actCompleteFlag != null)
			auditStr.append(actCompleteFlag.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*transportType* :");
		if (transportType != null)
			auditStr.append(transportType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*priority* :");
		if (priority != null)
			auditStr.append(priority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dispCode* :");
		if (dispCode != null)
			auditStr.append(dispCode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*contractId* :");
		auditStr.append(contractId);
	    auditStr.append("; ");
		auditStr.append("\r\n*recipient1* :");
		auditStr.append(recipient1);
	    auditStr.append("; ");
		auditStr.append("\r\n*recipient2* :");
		auditStr.append(recipient2);
	    auditStr.append("; ");
		auditStr.append("\r\n*recipient3* :");
		auditStr.append(recipient3);
	    auditStr.append("; ");
		auditStr.append("\r\n*recipient4* :");
		auditStr.append(recipient4);
	    auditStr.append("; ");
		auditStr.append("\r\n*recipient5* :");
		auditStr.append(recipient5);
	    auditStr.append("; ");
		auditStr.append("\r\n*recipient6* :");
		auditStr.append(recipient6);
	    auditStr.append("; ");
		auditStr.append("\r\n*recipient7* :");
		auditStr.append(recipient7);
	    auditStr.append("; ");
		auditStr.append("\r\n*activity* :");
		if (activity != null)
		{
			auditStr.append(toShortClassName(activity));
				
		    auditStr.append(activity.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*session* :");
		if (session != null)
		{
			auditStr.append(toShortClassName(session));
				
		    auditStr.append(session.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sessionSlot* :");
		if (sessionSlot != null)
		{
			auditStr.append(toShortClassName(sessionSlot));
				
		    auditStr.append(sessionSlot.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pathwayEvents* :");
		if (pathwayEvents != null)
		{
			java.util.Iterator it30 = pathwayEvents.iterator();
			int i30=0;
			while (it30.hasNext())
			{
				if (i30 > 0)
					auditStr.append(",");
				ims.pathways.domain.objects.PatientEvent obj = (ims.pathways.domain.objects.PatientEvent)it30.next();
		if (obj != null)
		{
		   if (i30 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i30++;
		}
		if (i30 > 0)
			auditStr.append("] " + i30);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isCABBooking* :");
		auditStr.append(isCABBooking);
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresRebook* :");
		auditStr.append(requiresRebook);
	    auditStr.append("; ");
		auditStr.append("\r\n*earliestOfferedDate* :");
		auditStr.append(earliestOfferedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*isTransportRequired* :");
		auditStr.append(isTransportRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*isTransportBooked* :");
		auditStr.append(isTransportBooked);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatusRecord* :");
		if (currentStatusRecord != null)
		{
			auditStr.append(toShortClassName(currentStatusRecord));
				
		    auditStr.append(currentStatusRecord.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*uniqueLineRefNo* :");
		auditStr.append(uniqueLineRefNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*outcome* :");
		if (outcome != null)
			auditStr.append(outcome.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*outcomeReason* :");
		if (outcomeReason != null)
			auditStr.append(outcomeReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*outcomeComments* :");
		auditStr.append(outcomeComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasFirstDefinitiveTreatment* :");
		auditStr.append(wasFirstDefinitiveTreatment);
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreBooking* :");
		if (theatreBooking != null)
		{
			auditStr.append(toShortClassName(theatreBooking));
				
		    auditStr.append(theatreBooking.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToWeeklyReport* :");
		auditStr.append(wasOutputtedToWeeklyReport);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToMonthlyReport* :");
		auditStr.append(wasOutputtedToMonthlyReport);
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*customProcedureDuration* :");
		auditStr.append(customProcedureDuration);
	    auditStr.append("; ");
		auditStr.append("\r\n*apptTrackingStatusHistory* :");
		if (apptTrackingStatusHistory != null)
		{
		int i48=0;
		for (i48=0; i48<apptTrackingStatusHistory.size(); i48++)
		{
			if (i48 > 0)
				auditStr.append(",");
			ims.scheduling.domain.objects.Appt_Tracking_Status_History obj = (ims.scheduling.domain.objects.Appt_Tracking_Status_History)apptTrackingStatusHistory.get(i48);
		    if (obj != null)
			{
				if (i48 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i48 > 0)
			auditStr.append("] " + i48);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreSlot* :");
		if (theatreSlot != null)
		{
			auditStr.append(toShortClassName(theatreSlot));
				
		    auditStr.append(theatreSlot.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wasReviewed* :");
		auditStr.append(wasReviewed);
	    auditStr.append("; ");
		auditStr.append("\r\n*intraOperativeCareRecord* :");
		if (intraOperativeCareRecord != null)
		{
		int i51=0;
		for (i51=0; i51<intraOperativeCareRecord.size(); i51++)
		{
			if (i51 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.IntraOperativeCareRecord obj = (ims.core.clinical.domain.objects.IntraOperativeCareRecord)intraOperativeCareRecord.get(i51);
		    if (obj != null)
			{
				if (i51 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i51 > 0)
			auditStr.append("] " + i51);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*appointmentTCITime* :");
		auditStr.append(appointmentTCITime);
	    auditStr.append("; ");
		auditStr.append("\r\n*parentChildSlot* :");
		if (parentChildSlot != null)
		{
			auditStr.append(toShortClassName(parentChildSlot));
				
		    auditStr.append(parentChildSlot.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pathwayClock* :");
		if (pathwayClock != null)
		{
			auditStr.append(toShortClassName(pathwayClock));
				
		    auditStr.append(pathwayClock.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pASEvent* :");
		if (pASEvent != null)
		{
			auditStr.append(toShortClassName(pASEvent));
				
		    auditStr.append(pASEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasElectiveList* :");
		auditStr.append(hasElectiveList);
	    auditStr.append("; ");
		auditStr.append("\r\n*consMediaType* :");
		if (consMediaType != null)
			auditStr.append(consMediaType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*outpatientProcedures* :");
		if (outpatientProcedures != null)
		{
			java.util.Iterator it58 = outpatientProcedures.iterator();
			int i58=0;
			while (it58.hasNext())
			{
				if (i58 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientProcedure obj = (ims.core.clinical.domain.objects.PatientProcedure)it58.next();
		if (obj != null)
		{
		   if (i58 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i58++;
		}
		if (i58 > 0)
			auditStr.append("] " + i58);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*outpatientDiagnoses* :");
		if (outpatientDiagnoses != null)
		{
			java.util.Iterator it59 = outpatientDiagnoses.iterator();
			int i59=0;
			while (it59.hasNext())
			{
				if (i59 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientDiagnosis obj = (ims.core.clinical.domain.objects.PatientDiagnosis)it59.next();
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
		auditStr.append("\r\n*outcomeActions* :");
		if (outcomeActions != null)
		{
		int i60=0;
		for (i60=0; i60<outcomeActions.size(); i60++)
		{
			if (i60 > 0)
				auditStr.append(",");
			ims.scheduling.domain.objects.AppointmentOutcomeAction obj = (ims.scheduling.domain.objects.AppointmentOutcomeAction)outcomeActions.get(i60);
		    if (obj != null)
			{
				if (i60 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i60 > 0)
			auditStr.append("] " + i60);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*category* :");
		if (category != null)
			auditStr.append(category.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*caseNotesPulled* :");
		auditStr.append(caseNotesPulled);
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
		
		String keyClassName = "Booking_Appointment";
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
		if (this.getAppointmentDate() != null)
		{
			sb.append("<appointmentDate>");
			sb.append(new ims.framework.utils.DateTime(this.getAppointmentDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</appointmentDate>");		
		}
		if (this.getApptStartTime() != null)
		{
			sb.append("<apptStartTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApptStartTime().toString()));
			sb.append("</apptStartTime>");		
		}
		if (this.getApptEndTime() != null)
		{
			sb.append("<apptEndTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApptEndTime().toString()));
			sb.append("</apptEndTime>");		
		}
		if (this.getApptStatus() != null)
		{
			sb.append("<apptStatus>");
			sb.append(this.getApptStatus().toXMLString()); 
			sb.append("</apptStatus>");		
		}
		if (this.getApptStatusReas() != null)
		{
			sb.append("<apptStatusReas>");
			sb.append(this.getApptStatusReas().toXMLString()); 
			sb.append("</apptStatusReas>");		
		}
		if (this.getApptStatusHistory() != null)
		{
			if (this.getApptStatusHistory().size() > 0 )
			{
			sb.append("<apptStatusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getApptStatusHistory(), domMap));
			sb.append("</apptStatusHistory>");		
			}
		}
		if (this.getApptConfirmStatus() != null)
		{
			sb.append("<apptConfirmStatus>");
			sb.append(this.getApptConfirmStatus().toXMLString()); 
			sb.append("</apptConfirmStatus>");		
		}
		if (this.getAttendanceTime() != null)
		{
			sb.append("<attendanceTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAttendanceTime().toString()));
			sb.append("</attendanceTime>");		
		}
		if (this.getArrivalTime() != null)
		{
			sb.append("<arrivalTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getArrivalTime().toString()));
			sb.append("</arrivalTime>");		
		}
		if (this.getArrivalStatus() != null)
		{
			sb.append("<arrivalStatus>");
			sb.append(this.getArrivalStatus().toXMLString()); 
			sb.append("</arrivalStatus>");		
		}
		if (this.getSeenTime() != null)
		{
			sb.append("<seenTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSeenTime().toString()));
			sb.append("</seenTime>");		
		}
		if (this.getSeenBy() != null)
		{
			sb.append("<seenBy>");
			sb.append(this.getSeenBy().toXMLString(domMap)); 	
			sb.append("</seenBy>");		
		}
		if (this.getApptCompleteTime() != null)
		{
			sb.append("<apptCompleteTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApptCompleteTime().toString()));
			sb.append("</apptCompleteTime>");		
		}
		if (this.getActCompleteFlag() != null)
		{
			sb.append("<actCompleteFlag>");
			sb.append(this.getActCompleteFlag().toXMLString()); 
			sb.append("</actCompleteFlag>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getTransportType() != null)
		{
			sb.append("<transportType>");
			sb.append(this.getTransportType().toXMLString()); 
			sb.append("</transportType>");		
		}
		if (this.getPriority() != null)
		{
			sb.append("<priority>");
			sb.append(this.getPriority().toXMLString()); 
			sb.append("</priority>");		
		}
		if (this.getDispCode() != null)
		{
			sb.append("<dispCode>");
			sb.append(this.getDispCode().toXMLString()); 
			sb.append("</dispCode>");		
		}
		if (this.getContractId() != null)
		{
			sb.append("<contractId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getContractId().toString()));
			sb.append("</contractId>");		
		}
		if (this.getRecipient1() != null)
		{
			sb.append("<recipient1>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecipient1().toString()));
			sb.append("</recipient1>");		
		}
		if (this.getRecipient2() != null)
		{
			sb.append("<recipient2>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecipient2().toString()));
			sb.append("</recipient2>");		
		}
		if (this.getRecipient3() != null)
		{
			sb.append("<recipient3>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecipient3().toString()));
			sb.append("</recipient3>");		
		}
		if (this.getRecipient4() != null)
		{
			sb.append("<recipient4>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecipient4().toString()));
			sb.append("</recipient4>");		
		}
		if (this.getRecipient5() != null)
		{
			sb.append("<recipient5>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecipient5().toString()));
			sb.append("</recipient5>");		
		}
		if (this.getRecipient6() != null)
		{
			sb.append("<recipient6>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecipient6().toString()));
			sb.append("</recipient6>");		
		}
		if (this.getRecipient7() != null)
		{
			sb.append("<recipient7>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecipient7().toString()));
			sb.append("</recipient7>");		
		}
		if (this.getActivity() != null)
		{
			sb.append("<activity>");
			sb.append(this.getActivity().toXMLString(domMap)); 	
			sb.append("</activity>");		
		}
		if (this.getSession() != null)
		{
			sb.append("<session>");
			sb.append(this.getSession().toXMLString(domMap)); 	
			sb.append("</session>");		
		}
		if (this.getSessionSlot() != null)
		{
			sb.append("<sessionSlot>");
			sb.append(this.getSessionSlot().toXMLString(domMap)); 	
			sb.append("</sessionSlot>");		
		}
		if (this.getPathwayEvents() != null)
		{
			if (this.getPathwayEvents().size() > 0 )
			{
			sb.append("<pathwayEvents>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPathwayEvents(), domMap));
			sb.append("</pathwayEvents>");		
			}
		}
		if (this.isIsCABBooking() != null)
		{
			sb.append("<isCABBooking>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCABBooking().toString()));
			sb.append("</isCABBooking>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.isRequiresRebook() != null)
		{
			sb.append("<requiresRebook>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRequiresRebook().toString()));
			sb.append("</requiresRebook>");		
		}
		if (this.getEarliestOfferedDate() != null)
		{
			sb.append("<earliestOfferedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEarliestOfferedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</earliestOfferedDate>");		
		}
		if (this.isIsTransportRequired() != null)
		{
			sb.append("<isTransportRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsTransportRequired().toString()));
			sb.append("</isTransportRequired>");		
		}
		if (this.isIsTransportBooked() != null)
		{
			sb.append("<isTransportBooked>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsTransportBooked().toString()));
			sb.append("</isTransportBooked>");		
		}
		if (this.getCurrentStatusRecord() != null)
		{
			sb.append("<currentStatusRecord>");
			sb.append(this.getCurrentStatusRecord().toXMLString(domMap)); 	
			sb.append("</currentStatusRecord>");		
		}
		if (this.getUniqueLineRefNo() != null)
		{
			sb.append("<uniqueLineRefNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUniqueLineRefNo().toString()));
			sb.append("</uniqueLineRefNo>");		
		}
		if (this.getOutcome() != null)
		{
			sb.append("<outcome>");
			sb.append(this.getOutcome().toXMLString()); 
			sb.append("</outcome>");		
		}
		if (this.getOutcomeReason() != null)
		{
			sb.append("<outcomeReason>");
			sb.append(this.getOutcomeReason().toXMLString()); 
			sb.append("</outcomeReason>");		
		}
		if (this.getOutcomeComments() != null)
		{
			sb.append("<outcomeComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOutcomeComments().toString()));
			sb.append("</outcomeComments>");		
		}
		if (this.isWasFirstDefinitiveTreatment() != null)
		{
			sb.append("<wasFirstDefinitiveTreatment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasFirstDefinitiveTreatment().toString()));
			sb.append("</wasFirstDefinitiveTreatment>");		
		}
		if (this.getTheatreBooking() != null)
		{
			sb.append("<theatreBooking>");
			sb.append(this.getTheatreBooking().toXMLString(domMap)); 	
			sb.append("</theatreBooking>");		
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getCustomProcedureDuration() != null)
		{
			sb.append("<customProcedureDuration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCustomProcedureDuration().toString()));
			sb.append("</customProcedureDuration>");		
		}
		if (this.getApptTrackingStatusHistory() != null)
		{
			if (this.getApptTrackingStatusHistory().size() > 0 )
			{
			sb.append("<apptTrackingStatusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getApptTrackingStatusHistory(), domMap));
			sb.append("</apptTrackingStatusHistory>");		
			}
		}
		if (this.getTheatreSlot() != null)
		{
			sb.append("<theatreSlot>");
			sb.append(this.getTheatreSlot().toXMLString(domMap)); 	
			sb.append("</theatreSlot>");		
		}
		if (this.isWasReviewed() != null)
		{
			sb.append("<wasReviewed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasReviewed().toString()));
			sb.append("</wasReviewed>");		
		}
		if (this.getIntraOperativeCareRecord() != null)
		{
			if (this.getIntraOperativeCareRecord().size() > 0 )
			{
			sb.append("<intraOperativeCareRecord>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getIntraOperativeCareRecord(), domMap));
			sb.append("</intraOperativeCareRecord>");		
			}
		}
		if (this.getAppointmentTCITime() != null)
		{
			sb.append("<appointmentTCITime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAppointmentTCITime().toString()));
			sb.append("</appointmentTCITime>");		
		}
		if (this.getParentChildSlot() != null)
		{
			sb.append("<parentChildSlot>");
			sb.append(this.getParentChildSlot().toXMLString(domMap)); 	
			sb.append("</parentChildSlot>");		
		}
		if (this.getPathwayClock() != null)
		{
			sb.append("<pathwayClock>");
			sb.append(this.getPathwayClock().toXMLString(domMap)); 	
			sb.append("</pathwayClock>");		
		}
		if (this.getPASEvent() != null)
		{
			sb.append("<pASEvent>");
			sb.append(this.getPASEvent().toXMLString(domMap)); 	
			sb.append("</pASEvent>");		
		}
		if (this.isHasElectiveList() != null)
		{
			sb.append("<hasElectiveList>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasElectiveList().toString()));
			sb.append("</hasElectiveList>");		
		}
		if (this.getConsMediaType() != null)
		{
			sb.append("<consMediaType>");
			sb.append(this.getConsMediaType().toXMLString()); 
			sb.append("</consMediaType>");		
		}
		if (this.getOutpatientProcedures() != null)
		{
			if (this.getOutpatientProcedures().size() > 0 )
			{
			sb.append("<outpatientProcedures>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOutpatientProcedures(), domMap));
			sb.append("</outpatientProcedures>");		
			}
		}
		if (this.getOutpatientDiagnoses() != null)
		{
			if (this.getOutpatientDiagnoses().size() > 0 )
			{
			sb.append("<outpatientDiagnoses>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOutpatientDiagnoses(), domMap));
			sb.append("</outpatientDiagnoses>");		
			}
		}
		if (this.getOutcomeActions() != null)
		{
			if (this.getOutcomeActions().size() > 0 )
			{
			sb.append("<outcomeActions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOutcomeActions(), domMap));
			sb.append("</outcomeActions>");		
			}
		}
		if (this.getCategory() != null)
		{
			sb.append("<category>");
			sb.append(this.getCategory().toXMLString()); 
			sb.append("</category>");		
		}
		if (this.isCaseNotesPulled() != null)
		{
			sb.append("<caseNotesPulled>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCaseNotesPulled().toString()));
			sb.append("</caseNotesPulled>");		
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
			Booking_Appointment domainObject = getBooking_AppointmentfromXML(itemEl, factory, domMap);

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
			Booking_Appointment domainObject = getBooking_AppointmentfromXML(itemEl, factory, domMap);

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
		
	public static Booking_Appointment getBooking_AppointmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getBooking_AppointmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Booking_Appointment getBooking_AppointmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Booking_Appointment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Booking_Appointment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Booking_Appointment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Booking_Appointment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Booking_Appointment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Booking_Appointment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Booking_Appointment)factory.getImportedDomainObject(Booking_Appointment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Booking_Appointment();
		}
		String keyClassName = "Booking_Appointment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Booking_Appointment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Booking_Appointment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("appointmentDate");
		if(fldEl != null)
		{	
    		obj.setAppointmentDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("apptStartTime");
		if(fldEl != null)
		{	
    		obj.setApptStartTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("apptEndTime");
		if(fldEl != null)
		{	
    		obj.setApptEndTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("apptStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setApptStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("apptStatusReas");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setApptStatusReas(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("apptStatusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setApptStatusHistory(ims.scheduling.domain.objects.Appointment_Status.fromSetXMLString(fldEl, factory, obj.getApptStatusHistory(), domMap));
		}
		fldEl = el.element("apptConfirmStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setApptConfirmStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("attendanceTime");
		if(fldEl != null)
		{	
    		obj.setAttendanceTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("arrivalTime");
		if(fldEl != null)
		{	
    		obj.setArrivalTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("arrivalStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setArrivalStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("seenTime");
		if(fldEl != null)
		{	
    		obj.setSeenTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("seenBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSeenBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("apptCompleteTime");
		if(fldEl != null)
		{	
    		obj.setApptCompleteTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actCompleteFlag");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActCompleteFlag(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("transportType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTransportType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("priority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dispCode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDispCode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("contractId");
		if(fldEl != null)
		{	
    		obj.setContractId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recipient1");
		if(fldEl != null)
		{	
    		obj.setRecipient1(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recipient2");
		if(fldEl != null)
		{	
    		obj.setRecipient2(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recipient3");
		if(fldEl != null)
		{	
    		obj.setRecipient3(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recipient4");
		if(fldEl != null)
		{	
    		obj.setRecipient4(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recipient5");
		if(fldEl != null)
		{	
    		obj.setRecipient5(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recipient6");
		if(fldEl != null)
		{	
    		obj.setRecipient6(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recipient7");
		if(fldEl != null)
		{	
    		obj.setRecipient7(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActivity(ims.core.resource.place.domain.objects.Activity.getActivityfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("session");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSession(ims.scheduling.domain.objects.Sch_Session.getSch_SessionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sessionSlot");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSessionSlot(ims.scheduling.domain.objects.Session_Slot.getSession_SlotfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pathwayEvents");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPathwayEvents(ims.pathways.domain.objects.PatientEvent.fromSetXMLString(fldEl, factory, obj.getPathwayEvents(), domMap));
		}
		fldEl = el.element("isCABBooking");
		if(fldEl != null)
		{	
    		obj.setIsCABBooking(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("requiresRebook");
		if(fldEl != null)
		{	
    		obj.setRequiresRebook(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("earliestOfferedDate");
		if(fldEl != null)
		{	
    		obj.setEarliestOfferedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isTransportRequired");
		if(fldEl != null)
		{	
    		obj.setIsTransportRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isTransportBooked");
		if(fldEl != null)
		{	
    		obj.setIsTransportBooked(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("currentStatusRecord");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatusRecord(ims.scheduling.domain.objects.Appointment_Status.getAppointment_StatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("uniqueLineRefNo");
		if(fldEl != null)
		{	
    		obj.setUniqueLineRefNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("outcome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOutcome(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("outcomeReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOutcomeReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("outcomeComments");
		if(fldEl != null)
		{	
    		obj.setOutcomeComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasFirstDefinitiveTreatment");
		if(fldEl != null)
		{	
    		obj.setWasFirstDefinitiveTreatment(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("theatreBooking");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreBooking(ims.scheduling.domain.objects.TheatreBooking.getTheatreBookingfromXML(fldEl, factory, domMap)); 
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
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("customProcedureDuration");
		if(fldEl != null)
		{	
    		obj.setCustomProcedureDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("apptTrackingStatusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setApptTrackingStatusHistory(ims.scheduling.domain.objects.Appt_Tracking_Status_History.fromListXMLString(fldEl, factory, obj.getApptTrackingStatusHistory(), domMap));
		}
		fldEl = el.element("theatreSlot");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreSlot(ims.scheduling.domain.objects.SessionTheatreTCISlot.getSessionTheatreTCISlotfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("wasReviewed");
		if(fldEl != null)
		{	
    		obj.setWasReviewed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("intraOperativeCareRecord");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setIntraOperativeCareRecord(ims.core.clinical.domain.objects.IntraOperativeCareRecord.fromListXMLString(fldEl, factory, obj.getIntraOperativeCareRecord(), domMap));
		}
		fldEl = el.element("appointmentTCITime");
		if(fldEl != null)
		{	
    		obj.setAppointmentTCITime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("parentChildSlot");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setParentChildSlot(ims.scheduling.domain.objects.SessionParentChildSlot.getSessionParentChildSlotfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pathwayClock");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathwayClock(ims.pathways.domain.objects.PathwayClock.getPathwayClockfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pASEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPASEvent(ims.core.admin.pas.domain.objects.PASEvent.getPASEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hasElectiveList");
		if(fldEl != null)
		{	
    		obj.setHasElectiveList(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("consMediaType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConsMediaType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("outpatientProcedures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setOutpatientProcedures(ims.core.clinical.domain.objects.PatientProcedure.fromSetXMLString(fldEl, factory, obj.getOutpatientProcedures(), domMap));
		}
		fldEl = el.element("outpatientDiagnoses");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setOutpatientDiagnoses(ims.core.clinical.domain.objects.PatientDiagnosis.fromSetXMLString(fldEl, factory, obj.getOutpatientDiagnoses(), domMap));
		}
		fldEl = el.element("outcomeActions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOutcomeActions(ims.scheduling.domain.objects.AppointmentOutcomeAction.fromListXMLString(fldEl, factory, obj.getOutcomeActions(), domMap));
		}
		fldEl = el.element("category");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("caseNotesPulled");
		if(fldEl != null)
		{	
    		obj.setCaseNotesPulled(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "apptStatusHistory"
		, "pathwayEvents"
		, "apptTrackingStatusHistory"
		, "intraOperativeCareRecord"
		, "outpatientProcedures"
		, "outpatientDiagnoses"
		, "outcomeActions"
		};
	}

	/**
	buildCabMessage
	*/
public String buildCabMessage(ims.domain.lookups.LookupInstance requestType) 
{
	StringBuffer sb = new StringBuffer();
					

	sb.append("UBRN:");
	String ubrn=null;
	if(this.sessionSlot != null)
	{
		ubrn=this.sessionSlot.getUBRN();
		sb.append(ubrn);
	}
	sb.append(";");
	
	sb.append("USRN:");
	if (this.sessionSlot != null)
	{
		sb.append(this.sessionSlot.getUSRNfromUBRN(ubrn));
	}
	sb.append(";");
	
	sb.append("REASON:");
	if (this.currentStatusRecord != null && this.currentStatusRecord.getCancellationReason() != null)
		sb.append(this.currentStatusRecord.getCancellationReason().getId());	
			
	sb.append(";");
	return sb.toString();	
}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AppointmentDate = "appointmentDate";
		public static final String ApptStartTime = "apptStartTime";
		public static final String ApptEndTime = "apptEndTime";
		public static final String ApptStatus = "apptStatus";
		public static final String ApptStatusReas = "apptStatusReas";
		public static final String ApptStatusHistory = "apptStatusHistory";
		public static final String ApptConfirmStatus = "apptConfirmStatus";
		public static final String AttendanceTime = "attendanceTime";
		public static final String ArrivalTime = "arrivalTime";
		public static final String ArrivalStatus = "arrivalStatus";
		public static final String SeenTime = "seenTime";
		public static final String SeenBy = "seenBy";
		public static final String ApptCompleteTime = "apptCompleteTime";
		public static final String ActCompleteFlag = "actCompleteFlag";
		public static final String Comments = "comments";
		public static final String TransportType = "transportType";
		public static final String Priority = "priority";
		public static final String DispCode = "dispCode";
		public static final String ContractId = "contractId";
		public static final String Recipient1 = "recipient1";
		public static final String Recipient2 = "recipient2";
		public static final String Recipient3 = "recipient3";
		public static final String Recipient4 = "recipient4";
		public static final String Recipient5 = "recipient5";
		public static final String Recipient6 = "recipient6";
		public static final String Recipient7 = "recipient7";
		public static final String Activity = "activity";
		public static final String Session = "session";
		public static final String SessionSlot = "sessionSlot";
		public static final String PathwayEvents = "pathwayEvents";
		public static final String IsCABBooking = "isCABBooking";
		public static final String Patient = "patient";
		public static final String RequiresRebook = "requiresRebook";
		public static final String EarliestOfferedDate = "earliestOfferedDate";
		public static final String IsTransportRequired = "isTransportRequired";
		public static final String IsTransportBooked = "isTransportBooked";
		public static final String CurrentStatusRecord = "currentStatusRecord";
		public static final String UniqueLineRefNo = "uniqueLineRefNo";
		public static final String Outcome = "outcome";
		public static final String OutcomeReason = "outcomeReason";
		public static final String OutcomeComments = "outcomeComments";
		public static final String WasFirstDefinitiveTreatment = "wasFirstDefinitiveTreatment";
		public static final String TheatreBooking = "theatreBooking";
		public static final String WasOutputtedToWeeklyReport = "wasOutputtedToWeeklyReport";
		public static final String WasOutputtedToMonthlyReport = "wasOutputtedToMonthlyReport";
		public static final String CareContext = "careContext";
		public static final String CustomProcedureDuration = "customProcedureDuration";
		public static final String ApptTrackingStatusHistory = "apptTrackingStatusHistory";
		public static final String TheatreSlot = "theatreSlot";
		public static final String WasReviewed = "wasReviewed";
		public static final String IntraOperativeCareRecord = "intraOperativeCareRecord";
		public static final String AppointmentTCITime = "appointmentTCITime";
		public static final String ParentChildSlot = "parentChildSlot";
		public static final String PathwayClock = "pathwayClock";
		public static final String PASEvent = "pASEvent";
		public static final String HasElectiveList = "hasElectiveList";
		public static final String ConsMediaType = "consMediaType";
		public static final String OutpatientProcedures = "outpatientProcedures";
		public static final String OutpatientDiagnoses = "outpatientDiagnoses";
		public static final String OutcomeActions = "outcomeActions";
		public static final String Category = "category";
		public static final String CaseNotesPulled = "caseNotesPulled";
	}
}

