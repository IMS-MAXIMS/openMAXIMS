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
package ims.edischarge.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class FuturePlan extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1099100000;
	private static final long serialVersionUID = 1099100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** HospitalFollowUp */
	private ims.domain.lookups.LookupInstance hospitalFollowUp;
	/** FollowupIn */
	private Integer followupIn;
	/** Followup In Interval - Days, Weeks etc */
	private ims.domain.lookups.LookupInstance followupInInterval;
	/** FollowupHCP */
	private ims.core.resource.people.domain.objects.Hcp followupHCP;
	/** Hospital Plan */
	private String hospitalPlan;
	/** Actions for GP and Community */
	private String actionsforGPandCommunity;
	/** ResultsAwaited
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderInvestigation.
	  */
	private java.util.Set resultsAwaited;
	/** Other Results Awaited */
	private String otherResultsAwaited;
	/** Medical Certification Issued */
	private ims.domain.lookups.LookupInstance medicalCertificationIssued;
	/** Certificate Expires Date */
	private java.util.Date certificateExpiresDate;
	/** Refrain From Work for X  */
	private Integer refrainFromWorkValue;
	/** Refrain From Work Unit */
	private ims.domain.lookups.LookupInstance refrainFromWorkUnit;
	/** Comments */
	private String comments;
	/** Discharge Details */
	private ims.edischarge.domain.objects.DischargeDetails dischargeDetails;
	/** was Nurse Enabled Discharge */
	private Boolean wasNurseEnabledDischarge;
	/** FollowUpDetails
	  * Collection of ims.edischarge.domain.objects.FuturePlanFollowUp.
	  */
	private java.util.Set followUpDetails;
	/** Linked Surgical Operation Note  */
	private ims.clinical.domain.objects.SurgicalOperationNotes linkedSurgicalOperationNote;
	/** NurseEnabledInstructions */
	private ims.edischarge.domain.objects.NurseEnabledInstructions nurseEnabledInstructions;
	/** LivesAlone */
	private ims.domain.lookups.LookupInstance livesAlone;
	/** Statement Of Fitness To Work Issue */
	private ims.domain.lookups.LookupInstance statementOfFitnessToWorkIssue;
	/** Fit ToReturn To Work */
	private ims.domain.lookups.LookupInstance fitToReturnToWork;
	/** Return To Work Advice */
	private ims.domain.lookups.LookupInstance returnToWorkAdvice;
	/** Advice Applicatiable For */
	private Integer adviceApplicatiableFor;
	/** Advice Applicatiable For Unit */
	private ims.domain.lookups.LookupInstance adviceApplicatiableForUnit;
	/** is Complete */
	private Boolean isComplete;
	/** Certificate Starts Date */
	private java.util.Date certificateStartsDate;
	/** is Surgical Op Notes Complete */
	private Boolean isSugicalOpNotesComplete;
	/** Op Notes Actions for GP and Community */
	private String opNotesActionsforGPandCommunity;
	/** OpNotesFollowUpDetails
	  * Collection of ims.edischarge.domain.objects.FuturePlanFollowUp.
	  */
	private java.util.Set opNotesFollowUpDetails;
	/** OpNotesNurseEnabledInstructions */
	private ims.edischarge.domain.objects.NurseEnabledInstructions opNotesNurseEnabledInstructions;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public FuturePlan (Integer id, int ver)
    {
    	super(id, ver);
    }
    public FuturePlan ()
    {
    	super();
    }
    public FuturePlan (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.FuturePlan.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.domain.lookups.LookupInstance getHospitalFollowUp() {
		return hospitalFollowUp;
	}
	public void setHospitalFollowUp(ims.domain.lookups.LookupInstance hospitalFollowUp) {
		this.hospitalFollowUp = hospitalFollowUp;
	}

	public Integer getFollowupIn() {
		return followupIn;
	}
	public void setFollowupIn(Integer followupIn) {
		this.followupIn = followupIn;
	}

	public ims.domain.lookups.LookupInstance getFollowupInInterval() {
		return followupInInterval;
	}
	public void setFollowupInInterval(ims.domain.lookups.LookupInstance followupInInterval) {
		this.followupInInterval = followupInInterval;
	}

	public ims.core.resource.people.domain.objects.Hcp getFollowupHCP() {
		return followupHCP;
	}
	public void setFollowupHCP(ims.core.resource.people.domain.objects.Hcp followupHCP) {
		this.followupHCP = followupHCP;
	}

	public String getHospitalPlan() {
		return hospitalPlan;
	}
	public void setHospitalPlan(String hospitalPlan) {
		this.hospitalPlan = hospitalPlan;
	}

	public String getActionsforGPandCommunity() {
		return actionsforGPandCommunity;
	}
	public void setActionsforGPandCommunity(String actionsforGPandCommunity) {
		this.actionsforGPandCommunity = actionsforGPandCommunity;
	}

	public java.util.Set getResultsAwaited() {
		if ( null == resultsAwaited ) {
			resultsAwaited = new java.util.HashSet();
		}
		return resultsAwaited;
	}
	public void setResultsAwaited(java.util.Set paramValue) {
		this.resultsAwaited = paramValue;
	}

	public String getOtherResultsAwaited() {
		return otherResultsAwaited;
	}
	public void setOtherResultsAwaited(String otherResultsAwaited) {
		this.otherResultsAwaited = otherResultsAwaited;
	}

	public ims.domain.lookups.LookupInstance getMedicalCertificationIssued() {
		return medicalCertificationIssued;
	}
	public void setMedicalCertificationIssued(ims.domain.lookups.LookupInstance medicalCertificationIssued) {
		this.medicalCertificationIssued = medicalCertificationIssued;
	}

	public java.util.Date getCertificateExpiresDate() {
		return certificateExpiresDate;
	}
	public void setCertificateExpiresDate(java.util.Date certificateExpiresDate) {
		this.certificateExpiresDate = certificateExpiresDate;
	}

	public Integer getRefrainFromWorkValue() {
		return refrainFromWorkValue;
	}
	public void setRefrainFromWorkValue(Integer refrainFromWorkValue) {
		this.refrainFromWorkValue = refrainFromWorkValue;
	}

	public ims.domain.lookups.LookupInstance getRefrainFromWorkUnit() {
		return refrainFromWorkUnit;
	}
	public void setRefrainFromWorkUnit(ims.domain.lookups.LookupInstance refrainFromWorkUnit) {
		this.refrainFromWorkUnit = refrainFromWorkUnit;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public ims.edischarge.domain.objects.DischargeDetails getDischargeDetails() {
		return dischargeDetails;
	}
	public void setDischargeDetails(ims.edischarge.domain.objects.DischargeDetails dischargeDetails) {
		this.dischargeDetails = dischargeDetails;
	}

	public Boolean isWasNurseEnabledDischarge() {
		return wasNurseEnabledDischarge;
	}
	public void setWasNurseEnabledDischarge(Boolean wasNurseEnabledDischarge) {
		this.wasNurseEnabledDischarge = wasNurseEnabledDischarge;
	}

	public java.util.Set getFollowUpDetails() {
		if ( null == followUpDetails ) {
			followUpDetails = new java.util.HashSet();
		}
		return followUpDetails;
	}
	public void setFollowUpDetails(java.util.Set paramValue) {
		this.followUpDetails = paramValue;
	}

	public ims.clinical.domain.objects.SurgicalOperationNotes getLinkedSurgicalOperationNote() {
		return linkedSurgicalOperationNote;
	}
	public void setLinkedSurgicalOperationNote(ims.clinical.domain.objects.SurgicalOperationNotes linkedSurgicalOperationNote) {
		this.linkedSurgicalOperationNote = linkedSurgicalOperationNote;
	}

	public ims.edischarge.domain.objects.NurseEnabledInstructions getNurseEnabledInstructions() {
		return nurseEnabledInstructions;
	}
	public void setNurseEnabledInstructions(ims.edischarge.domain.objects.NurseEnabledInstructions nurseEnabledInstructions) {
		this.nurseEnabledInstructions = nurseEnabledInstructions;
	}

	public ims.domain.lookups.LookupInstance getLivesAlone() {
		return livesAlone;
	}
	public void setLivesAlone(ims.domain.lookups.LookupInstance livesAlone) {
		this.livesAlone = livesAlone;
	}

	public ims.domain.lookups.LookupInstance getStatementOfFitnessToWorkIssue() {
		return statementOfFitnessToWorkIssue;
	}
	public void setStatementOfFitnessToWorkIssue(ims.domain.lookups.LookupInstance statementOfFitnessToWorkIssue) {
		this.statementOfFitnessToWorkIssue = statementOfFitnessToWorkIssue;
	}

	public ims.domain.lookups.LookupInstance getFitToReturnToWork() {
		return fitToReturnToWork;
	}
	public void setFitToReturnToWork(ims.domain.lookups.LookupInstance fitToReturnToWork) {
		this.fitToReturnToWork = fitToReturnToWork;
	}

	public ims.domain.lookups.LookupInstance getReturnToWorkAdvice() {
		return returnToWorkAdvice;
	}
	public void setReturnToWorkAdvice(ims.domain.lookups.LookupInstance returnToWorkAdvice) {
		this.returnToWorkAdvice = returnToWorkAdvice;
	}

	public Integer getAdviceApplicatiableFor() {
		return adviceApplicatiableFor;
	}
	public void setAdviceApplicatiableFor(Integer adviceApplicatiableFor) {
		this.adviceApplicatiableFor = adviceApplicatiableFor;
	}

	public ims.domain.lookups.LookupInstance getAdviceApplicatiableForUnit() {
		return adviceApplicatiableForUnit;
	}
	public void setAdviceApplicatiableForUnit(ims.domain.lookups.LookupInstance adviceApplicatiableForUnit) {
		this.adviceApplicatiableForUnit = adviceApplicatiableForUnit;
	}

	public Boolean isIsComplete() {
		return isComplete;
	}
	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}

	public java.util.Date getCertificateStartsDate() {
		return certificateStartsDate;
	}
	public void setCertificateStartsDate(java.util.Date certificateStartsDate) {
		this.certificateStartsDate = certificateStartsDate;
	}

	public Boolean isIsSugicalOpNotesComplete() {
		return isSugicalOpNotesComplete;
	}
	public void setIsSugicalOpNotesComplete(Boolean isSugicalOpNotesComplete) {
		this.isSugicalOpNotesComplete = isSugicalOpNotesComplete;
	}

	public String getOpNotesActionsforGPandCommunity() {
		return opNotesActionsforGPandCommunity;
	}
	public void setOpNotesActionsforGPandCommunity(String opNotesActionsforGPandCommunity) {
		this.opNotesActionsforGPandCommunity = opNotesActionsforGPandCommunity;
	}

	public java.util.Set getOpNotesFollowUpDetails() {
		if ( null == opNotesFollowUpDetails ) {
			opNotesFollowUpDetails = new java.util.HashSet();
		}
		return opNotesFollowUpDetails;
	}
	public void setOpNotesFollowUpDetails(java.util.Set paramValue) {
		this.opNotesFollowUpDetails = paramValue;
	}

	public ims.edischarge.domain.objects.NurseEnabledInstructions getOpNotesNurseEnabledInstructions() {
		return opNotesNurseEnabledInstructions;
	}
	public void setOpNotesNurseEnabledInstructions(ims.edischarge.domain.objects.NurseEnabledInstructions opNotesNurseEnabledInstructions) {
		this.opNotesNurseEnabledInstructions = opNotesNurseEnabledInstructions;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hospitalFollowUp* :");
		if (hospitalFollowUp != null)
			auditStr.append(hospitalFollowUp.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*followupIn* :");
		auditStr.append(followupIn);
	    auditStr.append("; ");
		auditStr.append("\r\n*followupInInterval* :");
		if (followupInInterval != null)
			auditStr.append(followupInInterval.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*followupHCP* :");
		if (followupHCP != null)
		{
			auditStr.append(toShortClassName(followupHCP));
				
		    auditStr.append(followupHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hospitalPlan* :");
		auditStr.append(hospitalPlan);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionsforGPandCommunity* :");
		auditStr.append(actionsforGPandCommunity);
	    auditStr.append("; ");
		auditStr.append("\r\n*resultsAwaited* :");
		if (resultsAwaited != null)
		{
			java.util.Iterator it8 = resultsAwaited.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.OrderInvestigation obj = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)it8.next();
		if (obj != null)
		{
		   if (i8 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherResultsAwaited* :");
		auditStr.append(otherResultsAwaited);
	    auditStr.append("; ");
		auditStr.append("\r\n*medicalCertificationIssued* :");
		if (medicalCertificationIssued != null)
			auditStr.append(medicalCertificationIssued.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*certificateExpiresDate* :");
		auditStr.append(certificateExpiresDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*refrainFromWorkValue* :");
		auditStr.append(refrainFromWorkValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*refrainFromWorkUnit* :");
		if (refrainFromWorkUnit != null)
			auditStr.append(refrainFromWorkUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDetails* :");
		if (dischargeDetails != null)
		{
			auditStr.append(toShortClassName(dischargeDetails));
				
		    auditStr.append(dischargeDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wasNurseEnabledDischarge* :");
		auditStr.append(wasNurseEnabledDischarge);
	    auditStr.append("; ");
		auditStr.append("\r\n*followUpDetails* :");
		if (followUpDetails != null)
		{
			java.util.Iterator it17 = followUpDetails.iterator();
			int i17=0;
			while (it17.hasNext())
			{
				if (i17 > 0)
					auditStr.append(",");
				ims.edischarge.domain.objects.FuturePlanFollowUp obj = (ims.edischarge.domain.objects.FuturePlanFollowUp)it17.next();
		if (obj != null)
		{
		   if (i17 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i17++;
		}
		if (i17 > 0)
			auditStr.append("] " + i17);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedSurgicalOperationNote* :");
		if (linkedSurgicalOperationNote != null)
		{
			auditStr.append(toShortClassName(linkedSurgicalOperationNote));
				
		    auditStr.append(linkedSurgicalOperationNote.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*nurseEnabledInstructions* :");
		if (nurseEnabledInstructions != null)
		{
			auditStr.append(toShortClassName(nurseEnabledInstructions));
				
		    auditStr.append(nurseEnabledInstructions.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*livesAlone* :");
		if (livesAlone != null)
			auditStr.append(livesAlone.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*statementOfFitnessToWorkIssue* :");
		if (statementOfFitnessToWorkIssue != null)
			auditStr.append(statementOfFitnessToWorkIssue.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*fitToReturnToWork* :");
		if (fitToReturnToWork != null)
			auditStr.append(fitToReturnToWork.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*returnToWorkAdvice* :");
		if (returnToWorkAdvice != null)
			auditStr.append(returnToWorkAdvice.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*adviceApplicatiableFor* :");
		auditStr.append(adviceApplicatiableFor);
	    auditStr.append("; ");
		auditStr.append("\r\n*adviceApplicatiableForUnit* :");
		if (adviceApplicatiableForUnit != null)
			auditStr.append(adviceApplicatiableForUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isComplete* :");
		auditStr.append(isComplete);
	    auditStr.append("; ");
		auditStr.append("\r\n*certificateStartsDate* :");
		auditStr.append(certificateStartsDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSugicalOpNotesComplete* :");
		auditStr.append(isSugicalOpNotesComplete);
	    auditStr.append("; ");
		auditStr.append("\r\n*opNotesActionsforGPandCommunity* :");
		auditStr.append(opNotesActionsforGPandCommunity);
	    auditStr.append("; ");
		auditStr.append("\r\n*opNotesFollowUpDetails* :");
		if (opNotesFollowUpDetails != null)
		{
			java.util.Iterator it30 = opNotesFollowUpDetails.iterator();
			int i30=0;
			while (it30.hasNext())
			{
				if (i30 > 0)
					auditStr.append(",");
				ims.edischarge.domain.objects.FuturePlanFollowUp obj = (ims.edischarge.domain.objects.FuturePlanFollowUp)it30.next();
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
		auditStr.append("\r\n*opNotesNurseEnabledInstructions* :");
		if (opNotesNurseEnabledInstructions != null)
		{
			auditStr.append(toShortClassName(opNotesNurseEnabledInstructions));
				
		    auditStr.append(opNotesNurseEnabledInstructions.getId());
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
		
		String keyClassName = "FuturePlan";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getHospitalFollowUp() != null)
		{
			sb.append("<hospitalFollowUp>");
			sb.append(this.getHospitalFollowUp().toXMLString()); 
			sb.append("</hospitalFollowUp>");		
		}
		if (this.getFollowupIn() != null)
		{
			sb.append("<followupIn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFollowupIn().toString()));
			sb.append("</followupIn>");		
		}
		if (this.getFollowupInInterval() != null)
		{
			sb.append("<followupInInterval>");
			sb.append(this.getFollowupInInterval().toXMLString()); 
			sb.append("</followupInInterval>");		
		}
		if (this.getFollowupHCP() != null)
		{
			sb.append("<followupHCP>");
			sb.append(this.getFollowupHCP().toXMLString(domMap)); 	
			sb.append("</followupHCP>");		
		}
		if (this.getHospitalPlan() != null)
		{
			sb.append("<hospitalPlan>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHospitalPlan().toString()));
			sb.append("</hospitalPlan>");		
		}
		if (this.getActionsforGPandCommunity() != null)
		{
			sb.append("<actionsforGPandCommunity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActionsforGPandCommunity().toString()));
			sb.append("</actionsforGPandCommunity>");		
		}
		if (this.getResultsAwaited() != null)
		{
			if (this.getResultsAwaited().size() > 0 )
			{
			sb.append("<resultsAwaited>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getResultsAwaited(), domMap));
			sb.append("</resultsAwaited>");		
			}
		}
		if (this.getOtherResultsAwaited() != null)
		{
			sb.append("<otherResultsAwaited>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherResultsAwaited().toString()));
			sb.append("</otherResultsAwaited>");		
		}
		if (this.getMedicalCertificationIssued() != null)
		{
			sb.append("<medicalCertificationIssued>");
			sb.append(this.getMedicalCertificationIssued().toXMLString()); 
			sb.append("</medicalCertificationIssued>");		
		}
		if (this.getCertificateExpiresDate() != null)
		{
			sb.append("<certificateExpiresDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCertificateExpiresDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</certificateExpiresDate>");		
		}
		if (this.getRefrainFromWorkValue() != null)
		{
			sb.append("<refrainFromWorkValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRefrainFromWorkValue().toString()));
			sb.append("</refrainFromWorkValue>");		
		}
		if (this.getRefrainFromWorkUnit() != null)
		{
			sb.append("<refrainFromWorkUnit>");
			sb.append(this.getRefrainFromWorkUnit().toXMLString()); 
			sb.append("</refrainFromWorkUnit>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getDischargeDetails() != null)
		{
			sb.append("<dischargeDetails>");
			sb.append(this.getDischargeDetails().toXMLString(domMap)); 	
			sb.append("</dischargeDetails>");		
		}
		if (this.isWasNurseEnabledDischarge() != null)
		{
			sb.append("<wasNurseEnabledDischarge>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasNurseEnabledDischarge().toString()));
			sb.append("</wasNurseEnabledDischarge>");		
		}
		if (this.getFollowUpDetails() != null)
		{
			if (this.getFollowUpDetails().size() > 0 )
			{
			sb.append("<followUpDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFollowUpDetails(), domMap));
			sb.append("</followUpDetails>");		
			}
		}
		if (this.getLinkedSurgicalOperationNote() != null)
		{
			sb.append("<linkedSurgicalOperationNote>");
			sb.append(this.getLinkedSurgicalOperationNote().toXMLString(domMap)); 	
			sb.append("</linkedSurgicalOperationNote>");		
		}
		if (this.getNurseEnabledInstructions() != null)
		{
			sb.append("<nurseEnabledInstructions>");
			sb.append(this.getNurseEnabledInstructions().toXMLString(domMap)); 	
			sb.append("</nurseEnabledInstructions>");		
		}
		if (this.getLivesAlone() != null)
		{
			sb.append("<livesAlone>");
			sb.append(this.getLivesAlone().toXMLString()); 
			sb.append("</livesAlone>");		
		}
		if (this.getStatementOfFitnessToWorkIssue() != null)
		{
			sb.append("<statementOfFitnessToWorkIssue>");
			sb.append(this.getStatementOfFitnessToWorkIssue().toXMLString()); 
			sb.append("</statementOfFitnessToWorkIssue>");		
		}
		if (this.getFitToReturnToWork() != null)
		{
			sb.append("<fitToReturnToWork>");
			sb.append(this.getFitToReturnToWork().toXMLString()); 
			sb.append("</fitToReturnToWork>");		
		}
		if (this.getReturnToWorkAdvice() != null)
		{
			sb.append("<returnToWorkAdvice>");
			sb.append(this.getReturnToWorkAdvice().toXMLString()); 
			sb.append("</returnToWorkAdvice>");		
		}
		if (this.getAdviceApplicatiableFor() != null)
		{
			sb.append("<adviceApplicatiableFor>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdviceApplicatiableFor().toString()));
			sb.append("</adviceApplicatiableFor>");		
		}
		if (this.getAdviceApplicatiableForUnit() != null)
		{
			sb.append("<adviceApplicatiableForUnit>");
			sb.append(this.getAdviceApplicatiableForUnit().toXMLString()); 
			sb.append("</adviceApplicatiableForUnit>");		
		}
		if (this.isIsComplete() != null)
		{
			sb.append("<isComplete>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsComplete().toString()));
			sb.append("</isComplete>");		
		}
		if (this.getCertificateStartsDate() != null)
		{
			sb.append("<certificateStartsDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCertificateStartsDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</certificateStartsDate>");		
		}
		if (this.isIsSugicalOpNotesComplete() != null)
		{
			sb.append("<isSugicalOpNotesComplete>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsSugicalOpNotesComplete().toString()));
			sb.append("</isSugicalOpNotesComplete>");		
		}
		if (this.getOpNotesActionsforGPandCommunity() != null)
		{
			sb.append("<opNotesActionsforGPandCommunity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOpNotesActionsforGPandCommunity().toString()));
			sb.append("</opNotesActionsforGPandCommunity>");		
		}
		if (this.getOpNotesFollowUpDetails() != null)
		{
			if (this.getOpNotesFollowUpDetails().size() > 0 )
			{
			sb.append("<opNotesFollowUpDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOpNotesFollowUpDetails(), domMap));
			sb.append("</opNotesFollowUpDetails>");		
			}
		}
		if (this.getOpNotesNurseEnabledInstructions() != null)
		{
			sb.append("<opNotesNurseEnabledInstructions>");
			sb.append(this.getOpNotesNurseEnabledInstructions().toXMLString(domMap)); 	
			sb.append("</opNotesNurseEnabledInstructions>");		
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
			FuturePlan domainObject = getFuturePlanfromXML(itemEl, factory, domMap);

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
			FuturePlan domainObject = getFuturePlanfromXML(itemEl, factory, domMap);

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
		
	public static FuturePlan getFuturePlanfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getFuturePlanfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static FuturePlan getFuturePlanfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!FuturePlan.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!FuturePlan.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the FuturePlan class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (FuturePlan)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(FuturePlan.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		FuturePlan ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (FuturePlan)factory.getImportedDomainObject(FuturePlan.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new FuturePlan();
		}
		String keyClassName = "FuturePlan";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (FuturePlan)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, FuturePlan obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hospitalFollowUp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHospitalFollowUp(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("followupIn");
		if(fldEl != null)
		{	
    		obj.setFollowupIn(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("followupInInterval");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFollowupInInterval(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("followupHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setFollowupHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hospitalPlan");
		if(fldEl != null)
		{	
    		obj.setHospitalPlan(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actionsforGPandCommunity");
		if(fldEl != null)
		{	
    		obj.setActionsforGPandCommunity(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("resultsAwaited");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setResultsAwaited(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.fromSetXMLString(fldEl, factory, obj.getResultsAwaited(), domMap));
		}
		fldEl = el.element("otherResultsAwaited");
		if(fldEl != null)
		{	
    		obj.setOtherResultsAwaited(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("medicalCertificationIssued");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMedicalCertificationIssued(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("certificateExpiresDate");
		if(fldEl != null)
		{	
    		obj.setCertificateExpiresDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("refrainFromWorkValue");
		if(fldEl != null)
		{	
    		obj.setRefrainFromWorkValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("refrainFromWorkUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRefrainFromWorkUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDischargeDetails(ims.edischarge.domain.objects.DischargeDetails.getDischargeDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("wasNurseEnabledDischarge");
		if(fldEl != null)
		{	
    		obj.setWasNurseEnabledDischarge(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("followUpDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setFollowUpDetails(ims.edischarge.domain.objects.FuturePlanFollowUp.fromSetXMLString(fldEl, factory, obj.getFollowUpDetails(), domMap));
		}
		fldEl = el.element("linkedSurgicalOperationNote");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLinkedSurgicalOperationNote(ims.clinical.domain.objects.SurgicalOperationNotes.getSurgicalOperationNotesfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("nurseEnabledInstructions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNurseEnabledInstructions(ims.edischarge.domain.objects.NurseEnabledInstructions.getNurseEnabledInstructionsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("livesAlone");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLivesAlone(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("statementOfFitnessToWorkIssue");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatementOfFitnessToWorkIssue(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("fitToReturnToWork");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFitToReturnToWork(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("returnToWorkAdvice");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReturnToWorkAdvice(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("adviceApplicatiableFor");
		if(fldEl != null)
		{	
    		obj.setAdviceApplicatiableFor(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("adviceApplicatiableForUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdviceApplicatiableForUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isComplete");
		if(fldEl != null)
		{	
    		obj.setIsComplete(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("certificateStartsDate");
		if(fldEl != null)
		{	
    		obj.setCertificateStartsDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isSugicalOpNotesComplete");
		if(fldEl != null)
		{	
    		obj.setIsSugicalOpNotesComplete(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("opNotesActionsforGPandCommunity");
		if(fldEl != null)
		{	
    		obj.setOpNotesActionsforGPandCommunity(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("opNotesFollowUpDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setOpNotesFollowUpDetails(ims.edischarge.domain.objects.FuturePlanFollowUp.fromSetXMLString(fldEl, factory, obj.getOpNotesFollowUpDetails(), domMap));
		}
		fldEl = el.element("opNotesNurseEnabledInstructions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOpNotesNurseEnabledInstructions(ims.edischarge.domain.objects.NurseEnabledInstructions.getNurseEnabledInstructionsfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "resultsAwaited"
		, "followUpDetails"
		, "opNotesFollowUpDetails"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String HospitalFollowUp = "hospitalFollowUp";
		public static final String FollowupIn = "followupIn";
		public static final String FollowupInInterval = "followupInInterval";
		public static final String FollowupHCP = "followupHCP";
		public static final String HospitalPlan = "hospitalPlan";
		public static final String ActionsforGPandCommunity = "actionsforGPandCommunity";
		public static final String ResultsAwaited = "resultsAwaited";
		public static final String OtherResultsAwaited = "otherResultsAwaited";
		public static final String MedicalCertificationIssued = "medicalCertificationIssued";
		public static final String CertificateExpiresDate = "certificateExpiresDate";
		public static final String RefrainFromWorkValue = "refrainFromWorkValue";
		public static final String RefrainFromWorkUnit = "refrainFromWorkUnit";
		public static final String Comments = "comments";
		public static final String DischargeDetails = "dischargeDetails";
		public static final String WasNurseEnabledDischarge = "wasNurseEnabledDischarge";
		public static final String FollowUpDetails = "followUpDetails";
		public static final String LinkedSurgicalOperationNote = "linkedSurgicalOperationNote";
		public static final String NurseEnabledInstructions = "nurseEnabledInstructions";
		public static final String LivesAlone = "livesAlone";
		public static final String StatementOfFitnessToWorkIssue = "statementOfFitnessToWorkIssue";
		public static final String FitToReturnToWork = "fitToReturnToWork";
		public static final String ReturnToWorkAdvice = "returnToWorkAdvice";
		public static final String AdviceApplicatiableFor = "adviceApplicatiableFor";
		public static final String AdviceApplicatiableForUnit = "adviceApplicatiableForUnit";
		public static final String IsComplete = "isComplete";
		public static final String CertificateStartsDate = "certificateStartsDate";
		public static final String IsSugicalOpNotesComplete = "isSugicalOpNotesComplete";
		public static final String OpNotesActionsforGPandCommunity = "opNotesActionsforGPandCommunity";
		public static final String OpNotesFollowUpDetails = "opNotesFollowUpDetails";
		public static final String OpNotesNurseEnabledInstructions = "opNotesNurseEnabledInstructions";
	}
}

