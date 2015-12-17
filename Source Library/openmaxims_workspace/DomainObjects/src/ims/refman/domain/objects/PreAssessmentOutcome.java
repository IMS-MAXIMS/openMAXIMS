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
 * @author Barbara Worwood
 * Generated.
 */


public class PreAssessmentOutcome extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100083;
	private static final long serialVersionUID = 1096100083L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Recording Information */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation;
	/** Last Update Details */
	private ims.core.clinical.domain.objects.RecordingUserInformation lastUpdatingInformation;
	/** PrimaryProcedure */
	private ims.core.clinical.domain.objects.Procedure primaryProcedure;
	/** ProcedureDescription */
	private String procedureDescription;
	/** ProcLaterality */
	private ims.domain.lookups.LookupInstance procLaterality;
	/** The anaesthetic type used (can be local anaesthetic, sedation, etc) */
	private ims.domain.lookups.LookupInstance anaestheticType;
	/** SecondaryProcedure */
	private ims.core.clinical.domain.objects.Procedure secondaryProcedure;
	/** Secondary ProcedureDescription */
	private String secondaryDescription;
	/** Secondary ProcLaterality */
	private ims.domain.lookups.LookupInstance secondaryProcLaterality;
	/** Metrics */
	private ims.core.vitals.domain.objects.Metrics metrics;
	/** Is the patient a diabetic */
	private ims.domain.lookups.LookupInstance patientDiabetic;
	/** Pace Maker / Defibrillator in Situ */
	private ims.domain.lookups.LookupInstance paceMakerDefib;
	/** Pacemaker Defib Type */
	private ims.domain.lookups.LookupInstance paceMakerType;
	/** The date of the last check of the Pacemaker */
	private java.util.Date dateLastCheckPacemaker;
	/** Receiving Anticoagulant / Antiplatelet Therapy */
	private ims.domain.lookups.LookupInstance receivingAntiCoag;
	/** What action is being undertaken for the patient receiving Anti Coag meds */
	private ims.domain.lookups.LookupInstance therapyAction;
	/** Mobility Considerations ? */
	private Boolean mobilityConsideration;
	/** Mobility Comment */
	private String mobilityComment;
	/** Electric Bed Required? */
	private Boolean electricBedNeeded;
	/** Available at short notice */
	private Boolean shortNotice;
	/** Notice Period Value */
	private Integer noticePeriodValue;
	/** Notice Period Type */
	private ims.domain.lookups.LookupInstance noticePeriodType;
	/** Pre-operative overnight stay */
	private Boolean preOpOvernight;
	/** Number of nights */
	private Integer nights;
	/** Anticipated Post Operative Stay */
	private Integer postOpStay;
	/** Theatre Type */
	private ims.domain.lookups.LookupInstance theatreType;
	/** Post Operative Comments */
	private String postOpComments;
	/** Senior Anaesthetist Required? */
	private Boolean seniorAnaestRequired;
	/** Senior Anaesthetist Required Comments */
	private String seniorAnaestComments;
	/** Critical Care Bed Required */
	private Boolean criticalCareBedRequired;
	/** HDU */
	private Boolean hduCriticalCareBed;
	/** ITU */
	private Boolean ituCriticalCareBed;
	/** Anaesthetic Hazards
	  * Collection of ims.core.clinical.domain.objects.PatientAlert.
	  */
	private java.util.List anaestheticHazards;
	/** Information required / received
	  * Collection of ims.RefMan.domain.objects.PreAssessmentInformation.
	  */
	private java.util.List waitingForDetails;
	/** Indicator if any items in WaitingForDetails collection is still outstaning i.e. not all received */
	private Boolean detailsOutstanding;
	/** Cross-match required prior to day of surgery */
	private Boolean crossmatchRequired;
	/** Crossmatch Required Comments */
	private String crossmatchComments;
	/** Patient Fit to proceed */
	private Boolean fitToProceed;
	/** General Comments */
	private String generalComments;
	/** Pre Assessment Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment preAssessmentAppointment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PreAssessmentOutcome (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PreAssessmentOutcome ()
    {
    	super();
    }
    public PreAssessmentOutcome (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.PreAssessmentOutcome.class;
	}


	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getLastUpdatingInformation() {
		return lastUpdatingInformation;
	}
	public void setLastUpdatingInformation(ims.core.clinical.domain.objects.RecordingUserInformation lastUpdatingInformation) {
		this.lastUpdatingInformation = lastUpdatingInformation;
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

	public ims.domain.lookups.LookupInstance getProcLaterality() {
		return procLaterality;
	}
	public void setProcLaterality(ims.domain.lookups.LookupInstance procLaterality) {
		this.procLaterality = procLaterality;
	}

	public ims.domain.lookups.LookupInstance getAnaestheticType() {
		return anaestheticType;
	}
	public void setAnaestheticType(ims.domain.lookups.LookupInstance anaestheticType) {
		this.anaestheticType = anaestheticType;
	}

	public ims.core.clinical.domain.objects.Procedure getSecondaryProcedure() {
		return secondaryProcedure;
	}
	public void setSecondaryProcedure(ims.core.clinical.domain.objects.Procedure secondaryProcedure) {
		this.secondaryProcedure = secondaryProcedure;
	}

	public String getSecondaryDescription() {
		return secondaryDescription;
	}
	public void setSecondaryDescription(String secondaryDescription) {
		if ( null != secondaryDescription && secondaryDescription.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for secondaryDescription. Tried to set value: "+
				secondaryDescription);
		}
		this.secondaryDescription = secondaryDescription;
	}

	public ims.domain.lookups.LookupInstance getSecondaryProcLaterality() {
		return secondaryProcLaterality;
	}
	public void setSecondaryProcLaterality(ims.domain.lookups.LookupInstance secondaryProcLaterality) {
		this.secondaryProcLaterality = secondaryProcLaterality;
	}

	public ims.core.vitals.domain.objects.Metrics getMetrics() {
		return metrics;
	}
	public void setMetrics(ims.core.vitals.domain.objects.Metrics metrics) {
		this.metrics = metrics;
	}

	public ims.domain.lookups.LookupInstance getPatientDiabetic() {
		return patientDiabetic;
	}
	public void setPatientDiabetic(ims.domain.lookups.LookupInstance patientDiabetic) {
		this.patientDiabetic = patientDiabetic;
	}

	public ims.domain.lookups.LookupInstance getPaceMakerDefib() {
		return paceMakerDefib;
	}
	public void setPaceMakerDefib(ims.domain.lookups.LookupInstance paceMakerDefib) {
		this.paceMakerDefib = paceMakerDefib;
	}

	public ims.domain.lookups.LookupInstance getPaceMakerType() {
		return paceMakerType;
	}
	public void setPaceMakerType(ims.domain.lookups.LookupInstance paceMakerType) {
		this.paceMakerType = paceMakerType;
	}

	public java.util.Date getDateLastCheckPacemaker() {
		return dateLastCheckPacemaker;
	}
	public void setDateLastCheckPacemaker(java.util.Date dateLastCheckPacemaker) {
		this.dateLastCheckPacemaker = dateLastCheckPacemaker;
	}

	public ims.domain.lookups.LookupInstance getReceivingAntiCoag() {
		return receivingAntiCoag;
	}
	public void setReceivingAntiCoag(ims.domain.lookups.LookupInstance receivingAntiCoag) {
		this.receivingAntiCoag = receivingAntiCoag;
	}

	public ims.domain.lookups.LookupInstance getTherapyAction() {
		return therapyAction;
	}
	public void setTherapyAction(ims.domain.lookups.LookupInstance therapyAction) {
		this.therapyAction = therapyAction;
	}

	public Boolean isMobilityConsideration() {
		return mobilityConsideration;
	}
	public void setMobilityConsideration(Boolean mobilityConsideration) {
		this.mobilityConsideration = mobilityConsideration;
	}

	public String getMobilityComment() {
		return mobilityComment;
	}
	public void setMobilityComment(String mobilityComment) {
		if ( null != mobilityComment && mobilityComment.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for mobilityComment. Tried to set value: "+
				mobilityComment);
		}
		this.mobilityComment = mobilityComment;
	}

	public Boolean isElectricBedNeeded() {
		return electricBedNeeded;
	}
	public void setElectricBedNeeded(Boolean electricBedNeeded) {
		this.electricBedNeeded = electricBedNeeded;
	}

	public Boolean isShortNotice() {
		return shortNotice;
	}
	public void setShortNotice(Boolean shortNotice) {
		this.shortNotice = shortNotice;
	}

	public Integer getNoticePeriodValue() {
		return noticePeriodValue;
	}
	public void setNoticePeriodValue(Integer noticePeriodValue) {
		this.noticePeriodValue = noticePeriodValue;
	}

	public ims.domain.lookups.LookupInstance getNoticePeriodType() {
		return noticePeriodType;
	}
	public void setNoticePeriodType(ims.domain.lookups.LookupInstance noticePeriodType) {
		this.noticePeriodType = noticePeriodType;
	}

	public Boolean isPreOpOvernight() {
		return preOpOvernight;
	}
	public void setPreOpOvernight(Boolean preOpOvernight) {
		this.preOpOvernight = preOpOvernight;
	}

	public Integer getNights() {
		return nights;
	}
	public void setNights(Integer nights) {
		this.nights = nights;
	}

	public Integer getPostOpStay() {
		return postOpStay;
	}
	public void setPostOpStay(Integer postOpStay) {
		this.postOpStay = postOpStay;
	}

	public ims.domain.lookups.LookupInstance getTheatreType() {
		return theatreType;
	}
	public void setTheatreType(ims.domain.lookups.LookupInstance theatreType) {
		this.theatreType = theatreType;
	}

	public String getPostOpComments() {
		return postOpComments;
	}
	public void setPostOpComments(String postOpComments) {
		if ( null != postOpComments && postOpComments.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for postOpComments. Tried to set value: "+
				postOpComments);
		}
		this.postOpComments = postOpComments;
	}

	public Boolean isSeniorAnaestRequired() {
		return seniorAnaestRequired;
	}
	public void setSeniorAnaestRequired(Boolean seniorAnaestRequired) {
		this.seniorAnaestRequired = seniorAnaestRequired;
	}

	public String getSeniorAnaestComments() {
		return seniorAnaestComments;
	}
	public void setSeniorAnaestComments(String seniorAnaestComments) {
		if ( null != seniorAnaestComments && seniorAnaestComments.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for seniorAnaestComments. Tried to set value: "+
				seniorAnaestComments);
		}
		this.seniorAnaestComments = seniorAnaestComments;
	}

	public Boolean isCriticalCareBedRequired() {
		return criticalCareBedRequired;
	}
	public void setCriticalCareBedRequired(Boolean criticalCareBedRequired) {
		this.criticalCareBedRequired = criticalCareBedRequired;
	}

	public Boolean isHduCriticalCareBed() {
		return hduCriticalCareBed;
	}
	public void setHduCriticalCareBed(Boolean hduCriticalCareBed) {
		this.hduCriticalCareBed = hduCriticalCareBed;
	}

	public Boolean isItuCriticalCareBed() {
		return ituCriticalCareBed;
	}
	public void setItuCriticalCareBed(Boolean ituCriticalCareBed) {
		this.ituCriticalCareBed = ituCriticalCareBed;
	}

	public java.util.List getAnaestheticHazards() {
		if ( null == anaestheticHazards ) {
			anaestheticHazards = new java.util.ArrayList();
		}
		return anaestheticHazards;
	}
	public void setAnaestheticHazards(java.util.List paramValue) {
		this.anaestheticHazards = paramValue;
	}

	public java.util.List getWaitingForDetails() {
		if ( null == waitingForDetails ) {
			waitingForDetails = new java.util.ArrayList();
		}
		return waitingForDetails;
	}
	public void setWaitingForDetails(java.util.List paramValue) {
		this.waitingForDetails = paramValue;
	}

	public Boolean isDetailsOutstanding() {
		return detailsOutstanding;
	}
	public void setDetailsOutstanding(Boolean detailsOutstanding) {
		this.detailsOutstanding = detailsOutstanding;
	}

	public Boolean isCrossmatchRequired() {
		return crossmatchRequired;
	}
	public void setCrossmatchRequired(Boolean crossmatchRequired) {
		this.crossmatchRequired = crossmatchRequired;
	}

	public String getCrossmatchComments() {
		return crossmatchComments;
	}
	public void setCrossmatchComments(String crossmatchComments) {
		if ( null != crossmatchComments && crossmatchComments.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for crossmatchComments. Tried to set value: "+
				crossmatchComments);
		}
		this.crossmatchComments = crossmatchComments;
	}

	public Boolean isFitToProceed() {
		return fitToProceed;
	}
	public void setFitToProceed(Boolean fitToProceed) {
		this.fitToProceed = fitToProceed;
	}

	public String getGeneralComments() {
		return generalComments;
	}
	public void setGeneralComments(String generalComments) {
		if ( null != generalComments && generalComments.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for generalComments. Tried to set value: "+
				generalComments);
		}
		this.generalComments = generalComments;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getPreAssessmentAppointment() {
		return preAssessmentAppointment;
	}
	public void setPreAssessmentAppointment(ims.scheduling.domain.objects.Booking_Appointment preAssessmentAppointment) {
		this.preAssessmentAppointment = preAssessmentAppointment;
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
		
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*lastUpdatingInformation* :");
		if (lastUpdatingInformation != null)
		{
			auditStr.append(toShortClassName(lastUpdatingInformation));
				
		    auditStr.append(lastUpdatingInformation.toString());
		}
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
		auditStr.append("\r\n*procLaterality* :");
		if (procLaterality != null)
			auditStr.append(procLaterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticType* :");
		if (anaestheticType != null)
			auditStr.append(anaestheticType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*secondaryProcedure* :");
		if (secondaryProcedure != null)
		{
			auditStr.append(toShortClassName(secondaryProcedure));
				
		    auditStr.append(secondaryProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*secondaryDescription* :");
		auditStr.append(secondaryDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*secondaryProcLaterality* :");
		if (secondaryProcLaterality != null)
			auditStr.append(secondaryProcLaterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*metrics* :");
		if (metrics != null)
		{
			auditStr.append(toShortClassName(metrics));
				
		    auditStr.append(metrics.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientDiabetic* :");
		if (patientDiabetic != null)
			auditStr.append(patientDiabetic.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*paceMakerDefib* :");
		if (paceMakerDefib != null)
			auditStr.append(paceMakerDefib.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*paceMakerType* :");
		if (paceMakerType != null)
			auditStr.append(paceMakerType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dateLastCheckPacemaker* :");
		auditStr.append(dateLastCheckPacemaker);
	    auditStr.append("; ");
		auditStr.append("\r\n*receivingAntiCoag* :");
		if (receivingAntiCoag != null)
			auditStr.append(receivingAntiCoag.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*therapyAction* :");
		if (therapyAction != null)
			auditStr.append(therapyAction.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mobilityConsideration* :");
		auditStr.append(mobilityConsideration);
	    auditStr.append("; ");
		auditStr.append("\r\n*mobilityComment* :");
		auditStr.append(mobilityComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*electricBedNeeded* :");
		auditStr.append(electricBedNeeded);
	    auditStr.append("; ");
		auditStr.append("\r\n*shortNotice* :");
		auditStr.append(shortNotice);
	    auditStr.append("; ");
		auditStr.append("\r\n*noticePeriodValue* :");
		auditStr.append(noticePeriodValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*noticePeriodType* :");
		if (noticePeriodType != null)
			auditStr.append(noticePeriodType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*preOpOvernight* :");
		auditStr.append(preOpOvernight);
	    auditStr.append("; ");
		auditStr.append("\r\n*nights* :");
		auditStr.append(nights);
	    auditStr.append("; ");
		auditStr.append("\r\n*postOpStay* :");
		auditStr.append(postOpStay);
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreType* :");
		if (theatreType != null)
			auditStr.append(theatreType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*postOpComments* :");
		auditStr.append(postOpComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*seniorAnaestRequired* :");
		auditStr.append(seniorAnaestRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*seniorAnaestComments* :");
		auditStr.append(seniorAnaestComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*criticalCareBedRequired* :");
		auditStr.append(criticalCareBedRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*hduCriticalCareBed* :");
		auditStr.append(hduCriticalCareBed);
	    auditStr.append("; ");
		auditStr.append("\r\n*ituCriticalCareBed* :");
		auditStr.append(ituCriticalCareBed);
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticHazards* :");
		if (anaestheticHazards != null)
		{
		int i33=0;
		for (i33=0; i33<anaestheticHazards.size(); i33++)
		{
			if (i33 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.PatientAlert obj = (ims.core.clinical.domain.objects.PatientAlert)anaestheticHazards.get(i33);
		    if (obj != null)
			{
				if (i33 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i33 > 0)
			auditStr.append("] " + i33);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*waitingForDetails* :");
		if (waitingForDetails != null)
		{
		int i34=0;
		for (i34=0; i34<waitingForDetails.size(); i34++)
		{
			if (i34 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.PreAssessmentInformation obj = (ims.RefMan.domain.objects.PreAssessmentInformation)waitingForDetails.get(i34);
		    if (obj != null)
			{
				if (i34 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i34 > 0)
			auditStr.append("] " + i34);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*detailsOutstanding* :");
		auditStr.append(detailsOutstanding);
	    auditStr.append("; ");
		auditStr.append("\r\n*crossmatchRequired* :");
		auditStr.append(crossmatchRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*crossmatchComments* :");
		auditStr.append(crossmatchComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*fitToProceed* :");
		auditStr.append(fitToProceed);
	    auditStr.append("; ");
		auditStr.append("\r\n*generalComments* :");
		auditStr.append(generalComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*preAssessmentAppointment* :");
		if (preAssessmentAppointment != null)
		{
			auditStr.append(toShortClassName(preAssessmentAppointment));
				
		    auditStr.append(preAssessmentAppointment.getId());
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
		
		String keyClassName = "PreAssessmentOutcome";
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
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
		}
		if (this.getLastUpdatingInformation() != null)
		{
			sb.append("<lastUpdatingInformation>");
			sb.append(this.getLastUpdatingInformation().toXMLString(domMap)); 	
			sb.append("</lastUpdatingInformation>");		
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
		if (this.getProcLaterality() != null)
		{
			sb.append("<procLaterality>");
			sb.append(this.getProcLaterality().toXMLString()); 
			sb.append("</procLaterality>");		
		}
		if (this.getAnaestheticType() != null)
		{
			sb.append("<anaestheticType>");
			sb.append(this.getAnaestheticType().toXMLString()); 
			sb.append("</anaestheticType>");		
		}
		if (this.getSecondaryProcedure() != null)
		{
			sb.append("<secondaryProcedure>");
			sb.append(this.getSecondaryProcedure().toXMLString(domMap)); 	
			sb.append("</secondaryProcedure>");		
		}
		if (this.getSecondaryDescription() != null)
		{
			sb.append("<secondaryDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSecondaryDescription().toString()));
			sb.append("</secondaryDescription>");		
		}
		if (this.getSecondaryProcLaterality() != null)
		{
			sb.append("<secondaryProcLaterality>");
			sb.append(this.getSecondaryProcLaterality().toXMLString()); 
			sb.append("</secondaryProcLaterality>");		
		}
		if (this.getMetrics() != null)
		{
			sb.append("<metrics>");
			sb.append(this.getMetrics().toXMLString(domMap)); 	
			sb.append("</metrics>");		
		}
		if (this.getPatientDiabetic() != null)
		{
			sb.append("<patientDiabetic>");
			sb.append(this.getPatientDiabetic().toXMLString()); 
			sb.append("</patientDiabetic>");		
		}
		if (this.getPaceMakerDefib() != null)
		{
			sb.append("<paceMakerDefib>");
			sb.append(this.getPaceMakerDefib().toXMLString()); 
			sb.append("</paceMakerDefib>");		
		}
		if (this.getPaceMakerType() != null)
		{
			sb.append("<paceMakerType>");
			sb.append(this.getPaceMakerType().toXMLString()); 
			sb.append("</paceMakerType>");		
		}
		if (this.getDateLastCheckPacemaker() != null)
		{
			sb.append("<dateLastCheckPacemaker>");
			sb.append(new ims.framework.utils.DateTime(this.getDateLastCheckPacemaker()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateLastCheckPacemaker>");		
		}
		if (this.getReceivingAntiCoag() != null)
		{
			sb.append("<receivingAntiCoag>");
			sb.append(this.getReceivingAntiCoag().toXMLString()); 
			sb.append("</receivingAntiCoag>");		
		}
		if (this.getTherapyAction() != null)
		{
			sb.append("<therapyAction>");
			sb.append(this.getTherapyAction().toXMLString()); 
			sb.append("</therapyAction>");		
		}
		if (this.isMobilityConsideration() != null)
		{
			sb.append("<mobilityConsideration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMobilityConsideration().toString()));
			sb.append("</mobilityConsideration>");		
		}
		if (this.getMobilityComment() != null)
		{
			sb.append("<mobilityComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMobilityComment().toString()));
			sb.append("</mobilityComment>");		
		}
		if (this.isElectricBedNeeded() != null)
		{
			sb.append("<electricBedNeeded>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isElectricBedNeeded().toString()));
			sb.append("</electricBedNeeded>");		
		}
		if (this.isShortNotice() != null)
		{
			sb.append("<shortNotice>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isShortNotice().toString()));
			sb.append("</shortNotice>");		
		}
		if (this.getNoticePeriodValue() != null)
		{
			sb.append("<noticePeriodValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNoticePeriodValue().toString()));
			sb.append("</noticePeriodValue>");		
		}
		if (this.getNoticePeriodType() != null)
		{
			sb.append("<noticePeriodType>");
			sb.append(this.getNoticePeriodType().toXMLString()); 
			sb.append("</noticePeriodType>");		
		}
		if (this.isPreOpOvernight() != null)
		{
			sb.append("<preOpOvernight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPreOpOvernight().toString()));
			sb.append("</preOpOvernight>");		
		}
		if (this.getNights() != null)
		{
			sb.append("<nights>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNights().toString()));
			sb.append("</nights>");		
		}
		if (this.getPostOpStay() != null)
		{
			sb.append("<postOpStay>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPostOpStay().toString()));
			sb.append("</postOpStay>");		
		}
		if (this.getTheatreType() != null)
		{
			sb.append("<theatreType>");
			sb.append(this.getTheatreType().toXMLString()); 
			sb.append("</theatreType>");		
		}
		if (this.getPostOpComments() != null)
		{
			sb.append("<postOpComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPostOpComments().toString()));
			sb.append("</postOpComments>");		
		}
		if (this.isSeniorAnaestRequired() != null)
		{
			sb.append("<seniorAnaestRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSeniorAnaestRequired().toString()));
			sb.append("</seniorAnaestRequired>");		
		}
		if (this.getSeniorAnaestComments() != null)
		{
			sb.append("<seniorAnaestComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSeniorAnaestComments().toString()));
			sb.append("</seniorAnaestComments>");		
		}
		if (this.isCriticalCareBedRequired() != null)
		{
			sb.append("<criticalCareBedRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCriticalCareBedRequired().toString()));
			sb.append("</criticalCareBedRequired>");		
		}
		if (this.isHduCriticalCareBed() != null)
		{
			sb.append("<hduCriticalCareBed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHduCriticalCareBed().toString()));
			sb.append("</hduCriticalCareBed>");		
		}
		if (this.isItuCriticalCareBed() != null)
		{
			sb.append("<ituCriticalCareBed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isItuCriticalCareBed().toString()));
			sb.append("</ituCriticalCareBed>");		
		}
		if (this.getAnaestheticHazards() != null)
		{
			if (this.getAnaestheticHazards().size() > 0 )
			{
			sb.append("<anaestheticHazards>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAnaestheticHazards(), domMap));
			sb.append("</anaestheticHazards>");		
			}
		}
		if (this.getWaitingForDetails() != null)
		{
			if (this.getWaitingForDetails().size() > 0 )
			{
			sb.append("<waitingForDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getWaitingForDetails(), domMap));
			sb.append("</waitingForDetails>");		
			}
		}
		if (this.isDetailsOutstanding() != null)
		{
			sb.append("<detailsOutstanding>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDetailsOutstanding().toString()));
			sb.append("</detailsOutstanding>");		
		}
		if (this.isCrossmatchRequired() != null)
		{
			sb.append("<crossmatchRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCrossmatchRequired().toString()));
			sb.append("</crossmatchRequired>");		
		}
		if (this.getCrossmatchComments() != null)
		{
			sb.append("<crossmatchComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCrossmatchComments().toString()));
			sb.append("</crossmatchComments>");		
		}
		if (this.isFitToProceed() != null)
		{
			sb.append("<fitToProceed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isFitToProceed().toString()));
			sb.append("</fitToProceed>");		
		}
		if (this.getGeneralComments() != null)
		{
			sb.append("<generalComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGeneralComments().toString()));
			sb.append("</generalComments>");		
		}
		if (this.getPreAssessmentAppointment() != null)
		{
			sb.append("<preAssessmentAppointment>");
			sb.append(this.getPreAssessmentAppointment().toXMLString(domMap)); 	
			sb.append("</preAssessmentAppointment>");		
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
			PreAssessmentOutcome domainObject = getPreAssessmentOutcomefromXML(itemEl, factory, domMap);

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
			PreAssessmentOutcome domainObject = getPreAssessmentOutcomefromXML(itemEl, factory, domMap);

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
		
	public static PreAssessmentOutcome getPreAssessmentOutcomefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPreAssessmentOutcomefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PreAssessmentOutcome getPreAssessmentOutcomefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PreAssessmentOutcome.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PreAssessmentOutcome.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PreAssessmentOutcome class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PreAssessmentOutcome)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PreAssessmentOutcome.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PreAssessmentOutcome ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PreAssessmentOutcome)factory.getImportedDomainObject(PreAssessmentOutcome.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PreAssessmentOutcome();
		}
		String keyClassName = "PreAssessmentOutcome";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PreAssessmentOutcome)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PreAssessmentOutcome obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("lastUpdatingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLastUpdatingInformation(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
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
		fldEl = el.element("procLaterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anaestheticType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnaestheticType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("secondaryProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSecondaryProcedure(ims.core.clinical.domain.objects.Procedure.getProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("secondaryDescription");
		if(fldEl != null)
		{	
    		obj.setSecondaryDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("secondaryProcLaterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSecondaryProcLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("metrics");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMetrics(ims.core.vitals.domain.objects.Metrics.getMetricsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientDiabetic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientDiabetic(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("paceMakerDefib");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPaceMakerDefib(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("paceMakerType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPaceMakerType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dateLastCheckPacemaker");
		if(fldEl != null)
		{	
    		obj.setDateLastCheckPacemaker(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("receivingAntiCoag");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReceivingAntiCoag(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("therapyAction");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTherapyAction(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mobilityConsideration");
		if(fldEl != null)
		{	
    		obj.setMobilityConsideration(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("mobilityComment");
		if(fldEl != null)
		{	
    		obj.setMobilityComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("electricBedNeeded");
		if(fldEl != null)
		{	
    		obj.setElectricBedNeeded(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("shortNotice");
		if(fldEl != null)
		{	
    		obj.setShortNotice(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noticePeriodValue");
		if(fldEl != null)
		{	
    		obj.setNoticePeriodValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noticePeriodType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNoticePeriodType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("preOpOvernight");
		if(fldEl != null)
		{	
    		obj.setPreOpOvernight(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nights");
		if(fldEl != null)
		{	
    		obj.setNights(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("postOpStay");
		if(fldEl != null)
		{	
    		obj.setPostOpStay(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("theatreType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTheatreType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("postOpComments");
		if(fldEl != null)
		{	
    		obj.setPostOpComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("seniorAnaestRequired");
		if(fldEl != null)
		{	
    		obj.setSeniorAnaestRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("seniorAnaestComments");
		if(fldEl != null)
		{	
    		obj.setSeniorAnaestComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("criticalCareBedRequired");
		if(fldEl != null)
		{	
    		obj.setCriticalCareBedRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hduCriticalCareBed");
		if(fldEl != null)
		{	
    		obj.setHduCriticalCareBed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ituCriticalCareBed");
		if(fldEl != null)
		{	
    		obj.setItuCriticalCareBed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anaestheticHazards");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAnaestheticHazards(ims.core.clinical.domain.objects.PatientAlert.fromListXMLString(fldEl, factory, obj.getAnaestheticHazards(), domMap));
		}
		fldEl = el.element("waitingForDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setWaitingForDetails(ims.RefMan.domain.objects.PreAssessmentInformation.fromListXMLString(fldEl, factory, obj.getWaitingForDetails(), domMap));
		}
		fldEl = el.element("detailsOutstanding");
		if(fldEl != null)
		{	
    		obj.setDetailsOutstanding(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("crossmatchRequired");
		if(fldEl != null)
		{	
    		obj.setCrossmatchRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("crossmatchComments");
		if(fldEl != null)
		{	
    		obj.setCrossmatchComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("fitToProceed");
		if(fldEl != null)
		{	
    		obj.setFitToProceed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("generalComments");
		if(fldEl != null)
		{	
    		obj.setGeneralComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("preAssessmentAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPreAssessmentAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "anaestheticHazards"
		, "waitingForDetails"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String RecordingInformation = "recordingInformation";
		public static final String LastUpdatingInformation = "lastUpdatingInformation";
		public static final String PrimaryProcedure = "primaryProcedure";
		public static final String ProcedureDescription = "procedureDescription";
		public static final String ProcLaterality = "procLaterality";
		public static final String AnaestheticType = "anaestheticType";
		public static final String SecondaryProcedure = "secondaryProcedure";
		public static final String SecondaryDescription = "secondaryDescription";
		public static final String SecondaryProcLaterality = "secondaryProcLaterality";
		public static final String Metrics = "metrics";
		public static final String PatientDiabetic = "patientDiabetic";
		public static final String PaceMakerDefib = "paceMakerDefib";
		public static final String PaceMakerType = "paceMakerType";
		public static final String DateLastCheckPacemaker = "dateLastCheckPacemaker";
		public static final String ReceivingAntiCoag = "receivingAntiCoag";
		public static final String TherapyAction = "therapyAction";
		public static final String MobilityConsideration = "mobilityConsideration";
		public static final String MobilityComment = "mobilityComment";
		public static final String ElectricBedNeeded = "electricBedNeeded";
		public static final String ShortNotice = "shortNotice";
		public static final String NoticePeriodValue = "noticePeriodValue";
		public static final String NoticePeriodType = "noticePeriodType";
		public static final String PreOpOvernight = "preOpOvernight";
		public static final String Nights = "nights";
		public static final String PostOpStay = "postOpStay";
		public static final String TheatreType = "theatreType";
		public static final String PostOpComments = "postOpComments";
		public static final String SeniorAnaestRequired = "seniorAnaestRequired";
		public static final String SeniorAnaestComments = "seniorAnaestComments";
		public static final String CriticalCareBedRequired = "criticalCareBedRequired";
		public static final String HduCriticalCareBed = "hduCriticalCareBed";
		public static final String ItuCriticalCareBed = "ituCriticalCareBed";
		public static final String AnaestheticHazards = "anaestheticHazards";
		public static final String WaitingForDetails = "waitingForDetails";
		public static final String DetailsOutstanding = "detailsOutstanding";
		public static final String CrossmatchRequired = "crossmatchRequired";
		public static final String CrossmatchComments = "crossmatchComments";
		public static final String FitToProceed = "fitToProceed";
		public static final String GeneralComments = "generalComments";
		public static final String PreAssessmentAppointment = "preAssessmentAppointment";
	}
}

