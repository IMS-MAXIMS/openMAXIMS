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
package ims.pathways.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class PatientPathwayJourney extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1088100000;
	private static final long serialVersionUID = 1088100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.patient.domain.objects.Patient patient;
	private ims.pathways.configuration.domain.objects.Pathway pathway;
	/** List of Patient Targets associated with the Journey
	  * Collection of ims.pathways.domain.objects.PatientJourneyTarget.
	  */
	private java.util.Set patientTargets;
	private ims.core.admin.domain.objects.Referral referral;
	/** Start Date of this Journey */
	private java.util.Date startDate;
	private ims.pathways.domain.objects.PatientJourneyStatus currentStatus;
	/** 
	  * Collection of ims.pathways.domain.objects.PatientJourneyStatus.
	  */
	private java.util.Set statusHistory;
	/** Actual End Date of this Journey */
	private java.util.Date endedOnDate;
	/** Current Clock */
	private ims.pathways.domain.objects.PathwayClock currentClock;
	/** Clock History
	  * Collection of ims.pathways.domain.objects.PathwayClock.
	  */
	private java.util.Set clockHistory;
	/** External Referal Key RKEY */
	private String extReferralKey;
	/** PathwayHistory
	  * Collection of ims.pathways.domain.objects.PathwayHistory.
	  */
	private java.util.Set pathwayHistory;
	/** Responsible Consultant */
	private ims.core.resource.people.domain.objects.Hcp responsibleConsultant;
	/** Indicates whether this is a cancer pathway or not */
	private Boolean isCancerPathway;
	/** Date the Journey was set as a Cancer Pathway */
	private java.util.Date cancerPathwayDate;
	/** LinkedComments
	  * Collection of ims.pathways.domain.objects.PatientJourneyComment.
	  */
	private java.util.List linkedComments;
	/** LastValidationDate */
	private java.util.Date lastValidationDate;
	/** NextValidationDate */
	private java.util.Date nextValidationDate;
	/** 
	  * Collection of ims.pathways.domain.objects.PatientJourneyBreach.
	  */
	private java.util.List patientJourneyBreachReason;
	private java.util.Date validationCompletedDT;
	private ims.core.resource.people.domain.objects.MemberOfStaff validationCompletedBy;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientPathwayJourney (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientPathwayJourney ()
    {
    	super();
    }
    public PatientPathwayJourney (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pathways.domain.objects.PatientPathwayJourney.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.pathways.configuration.domain.objects.Pathway getPathway() {
		return pathway;
	}
	public void setPathway(ims.pathways.configuration.domain.objects.Pathway pathway) {
		this.pathway = pathway;
	}

	public java.util.Set getPatientTargets() {
		if ( null == patientTargets ) {
			patientTargets = new java.util.HashSet();
		}
		return patientTargets;
	}
	public void setPatientTargets(java.util.Set paramValue) {
		this.patientTargets = paramValue;
	}

	public ims.core.admin.domain.objects.Referral getReferral() {
		return referral;
	}
	public void setReferral(ims.core.admin.domain.objects.Referral referral) {
		this.referral = referral;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public ims.pathways.domain.objects.PatientJourneyStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.pathways.domain.objects.PatientJourneyStatus currentStatus) {
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

	public java.util.Date getEndedOnDate() {
		return endedOnDate;
	}
	public void setEndedOnDate(java.util.Date endedOnDate) {
		this.endedOnDate = endedOnDate;
	}

	public ims.pathways.domain.objects.PathwayClock getCurrentClock() {
		return currentClock;
	}
	public void setCurrentClock(ims.pathways.domain.objects.PathwayClock currentClock) {
		this.currentClock = currentClock;
	}

	public java.util.Set getClockHistory() {
		if ( null == clockHistory ) {
			clockHistory = new java.util.HashSet();
		}
		return clockHistory;
	}
	public void setClockHistory(java.util.Set paramValue) {
		this.clockHistory = paramValue;
	}

	public String getExtReferralKey() {
		return extReferralKey;
	}
	public static PatientPathwayJourney getPatientPathwayJourneyFromExtReferralKey(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from PatientPathwayJourney c where c.extReferralKey = :extReferralKey";		
		java.util.List l = factory.find(hql, new String[]{"extReferralKey"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. PatientPathwayJourney.extReferralKey = " + val + " returned " + l.size() + " records. " );
		return (PatientPathwayJourney)l.get(0);
	}
	public void setExtReferralKey(String extReferralKey) {
		if ( null != extReferralKey && extReferralKey.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for extReferralKey. Tried to set value: "+
				extReferralKey);
		}
		this.extReferralKey = extReferralKey;
	}

	public java.util.Set getPathwayHistory() {
		if ( null == pathwayHistory ) {
			pathwayHistory = new java.util.HashSet();
		}
		return pathwayHistory;
	}
	public void setPathwayHistory(java.util.Set paramValue) {
		this.pathwayHistory = paramValue;
	}

	public ims.core.resource.people.domain.objects.Hcp getResponsibleConsultant() {
		return responsibleConsultant;
	}
	public void setResponsibleConsultant(ims.core.resource.people.domain.objects.Hcp responsibleConsultant) {
		this.responsibleConsultant = responsibleConsultant;
	}

	public Boolean isIsCancerPathway() {
		return isCancerPathway;
	}
	public void setIsCancerPathway(Boolean isCancerPathway) {
		this.isCancerPathway = isCancerPathway;
	}

	public java.util.Date getCancerPathwayDate() {
		return cancerPathwayDate;
	}
	public void setCancerPathwayDate(java.util.Date cancerPathwayDate) {
		this.cancerPathwayDate = cancerPathwayDate;
	}

	public java.util.List getLinkedComments() {
		if ( null == linkedComments ) {
			linkedComments = new java.util.ArrayList();
		}
		return linkedComments;
	}
	public void setLinkedComments(java.util.List paramValue) {
		this.linkedComments = paramValue;
	}

	public java.util.Date getLastValidationDate() {
		return lastValidationDate;
	}
	public void setLastValidationDate(java.util.Date lastValidationDate) {
		this.lastValidationDate = lastValidationDate;
	}

	public java.util.Date getNextValidationDate() {
		return nextValidationDate;
	}
	public void setNextValidationDate(java.util.Date nextValidationDate) {
		this.nextValidationDate = nextValidationDate;
	}

	public java.util.List getPatientJourneyBreachReason() {
		if ( null == patientJourneyBreachReason ) {
			patientJourneyBreachReason = new java.util.ArrayList();
		}
		return patientJourneyBreachReason;
	}
	public void setPatientJourneyBreachReason(java.util.List paramValue) {
		this.patientJourneyBreachReason = paramValue;
	}

	public java.util.Date getValidationCompletedDT() {
		return validationCompletedDT;
	}
	public void setValidationCompletedDT(java.util.Date validationCompletedDT) {
		this.validationCompletedDT = validationCompletedDT;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getValidationCompletedBy() {
		return validationCompletedBy;
	}
	public void setValidationCompletedBy(ims.core.resource.people.domain.objects.MemberOfStaff validationCompletedBy) {
		this.validationCompletedBy = validationCompletedBy;
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
		auditStr.append("\r\n*pathway* :");
		if (pathway != null)
		{
			auditStr.append(toShortClassName(pathway));
				
		    auditStr.append(pathway.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientTargets* :");
		if (patientTargets != null)
		{
			java.util.Iterator it3 = patientTargets.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.pathways.domain.objects.PatientJourneyTarget obj = (ims.pathways.domain.objects.PatientJourneyTarget)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referral* :");
		if (referral != null)
		{
			auditStr.append(toShortClassName(referral));
				
		    auditStr.append(referral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
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
			java.util.Iterator it7 = statusHistory.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.pathways.domain.objects.PatientJourneyStatus obj = (ims.pathways.domain.objects.PatientJourneyStatus)it7.next();
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
		auditStr.append("\r\n*endedOnDate* :");
		auditStr.append(endedOnDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentClock* :");
		if (currentClock != null)
		{
			auditStr.append(toShortClassName(currentClock));
				
		    auditStr.append(currentClock.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clockHistory* :");
		if (clockHistory != null)
		{
			java.util.Iterator it10 = clockHistory.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.pathways.domain.objects.PathwayClock obj = (ims.pathways.domain.objects.PathwayClock)it10.next();
		if (obj != null)
		{
		   if (i10 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*extReferralKey* :");
		auditStr.append(extReferralKey);
	    auditStr.append("; ");
		auditStr.append("\r\n*pathwayHistory* :");
		if (pathwayHistory != null)
		{
			java.util.Iterator it12 = pathwayHistory.iterator();
			int i12=0;
			while (it12.hasNext())
			{
				if (i12 > 0)
					auditStr.append(",");
				ims.pathways.domain.objects.PathwayHistory obj = (ims.pathways.domain.objects.PathwayHistory)it12.next();
		if (obj != null)
		{
		   if (i12 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i12++;
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*responsibleConsultant* :");
		if (responsibleConsultant != null)
		{
			auditStr.append(toShortClassName(responsibleConsultant));
				
		    auditStr.append(responsibleConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isCancerPathway* :");
		auditStr.append(isCancerPathway);
	    auditStr.append("; ");
		auditStr.append("\r\n*cancerPathwayDate* :");
		auditStr.append(cancerPathwayDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedComments* :");
		if (linkedComments != null)
		{
		int i16=0;
		for (i16=0; i16<linkedComments.size(); i16++)
		{
			if (i16 > 0)
				auditStr.append(",");
			ims.pathways.domain.objects.PatientJourneyComment obj = (ims.pathways.domain.objects.PatientJourneyComment)linkedComments.get(i16);
		    if (obj != null)
			{
				if (i16 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*lastValidationDate* :");
		auditStr.append(lastValidationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*nextValidationDate* :");
		auditStr.append(nextValidationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientJourneyBreachReason* :");
		if (patientJourneyBreachReason != null)
		{
		int i19=0;
		for (i19=0; i19<patientJourneyBreachReason.size(); i19++)
		{
			if (i19 > 0)
				auditStr.append(",");
			ims.pathways.domain.objects.PatientJourneyBreach obj = (ims.pathways.domain.objects.PatientJourneyBreach)patientJourneyBreachReason.get(i19);
		    if (obj != null)
			{
				if (i19 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i19 > 0)
			auditStr.append("] " + i19);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*validationCompletedDT* :");
		auditStr.append(validationCompletedDT);
	    auditStr.append("; ");
		auditStr.append("\r\n*validationCompletedBy* :");
		if (validationCompletedBy != null)
		{
			auditStr.append(toShortClassName(validationCompletedBy));
				
		    auditStr.append(validationCompletedBy.getId());
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
		
		String keyClassName = "PatientPathwayJourney";
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
		if (this.getPathway() != null)
		{
			sb.append("<pathway>");
			sb.append(this.getPathway().toXMLString(domMap)); 	
			sb.append("</pathway>");		
		}
		if (this.getPatientTargets() != null)
		{
			if (this.getPatientTargets().size() > 0 )
			{
			sb.append("<patientTargets>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPatientTargets(), domMap));
			sb.append("</patientTargets>");		
			}
		}
		if (this.getReferral() != null)
		{
			sb.append("<referral>");
			sb.append(this.getReferral().toXMLString(domMap)); 	
			sb.append("</referral>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
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
		if (this.getEndedOnDate() != null)
		{
			sb.append("<endedOnDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEndedOnDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endedOnDate>");		
		}
		if (this.getCurrentClock() != null)
		{
			sb.append("<currentClock>");
			sb.append(this.getCurrentClock().toXMLString(domMap)); 	
			sb.append("</currentClock>");		
		}
		if (this.getClockHistory() != null)
		{
			if (this.getClockHistory().size() > 0 )
			{
			sb.append("<clockHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getClockHistory(), domMap));
			sb.append("</clockHistory>");		
			}
		}
		if (this.getExtReferralKey() != null)
		{
			sb.append("<extReferralKey>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExtReferralKey().toString()));
			sb.append("</extReferralKey>");		
		}
		if (this.getPathwayHistory() != null)
		{
			if (this.getPathwayHistory().size() > 0 )
			{
			sb.append("<pathwayHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPathwayHistory(), domMap));
			sb.append("</pathwayHistory>");		
			}
		}
		if (this.getResponsibleConsultant() != null)
		{
			sb.append("<responsibleConsultant>");
			sb.append(this.getResponsibleConsultant().toXMLString(domMap)); 	
			sb.append("</responsibleConsultant>");		
		}
		if (this.isIsCancerPathway() != null)
		{
			sb.append("<isCancerPathway>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCancerPathway().toString()));
			sb.append("</isCancerPathway>");		
		}
		if (this.getCancerPathwayDate() != null)
		{
			sb.append("<cancerPathwayDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCancerPathwayDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</cancerPathwayDate>");		
		}
		if (this.getLinkedComments() != null)
		{
			if (this.getLinkedComments().size() > 0 )
			{
			sb.append("<linkedComments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLinkedComments(), domMap));
			sb.append("</linkedComments>");		
			}
		}
		if (this.getLastValidationDate() != null)
		{
			sb.append("<lastValidationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getLastValidationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastValidationDate>");		
		}
		if (this.getNextValidationDate() != null)
		{
			sb.append("<nextValidationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getNextValidationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</nextValidationDate>");		
		}
		if (this.getPatientJourneyBreachReason() != null)
		{
			if (this.getPatientJourneyBreachReason().size() > 0 )
			{
			sb.append("<patientJourneyBreachReason>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPatientJourneyBreachReason(), domMap));
			sb.append("</patientJourneyBreachReason>");		
			}
		}
		if (this.getValidationCompletedDT() != null)
		{
			sb.append("<validationCompletedDT>");
			sb.append(new ims.framework.utils.DateTime(this.getValidationCompletedDT()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</validationCompletedDT>");		
		}
		if (this.getValidationCompletedBy() != null)
		{
			sb.append("<validationCompletedBy>");
			sb.append(this.getValidationCompletedBy().toXMLString(domMap)); 	
			sb.append("</validationCompletedBy>");		
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
			PatientPathwayJourney domainObject = getPatientPathwayJourneyfromXML(itemEl, factory, domMap);

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
			PatientPathwayJourney domainObject = getPatientPathwayJourneyfromXML(itemEl, factory, domMap);

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
		
	public static PatientPathwayJourney getPatientPathwayJourneyfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientPathwayJourneyfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientPathwayJourney getPatientPathwayJourneyfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientPathwayJourney.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientPathwayJourney.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientPathwayJourney class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientPathwayJourney)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientPathwayJourney.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientPathwayJourney ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientPathwayJourney)factory.getImportedDomainObject(PatientPathwayJourney.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientPathwayJourney();
		}
		String keyClassName = "PatientPathwayJourney";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientPathwayJourney)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientPathwayJourney obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pathway");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathway(ims.pathways.configuration.domain.objects.Pathway.getPathwayfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientTargets");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPatientTargets(ims.pathways.domain.objects.PatientJourneyTarget.fromSetXMLString(fldEl, factory, obj.getPatientTargets(), domMap));
		}
		fldEl = el.element("referral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferral(ims.core.admin.domain.objects.Referral.getReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.pathways.domain.objects.PatientJourneyStatus.getPatientJourneyStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setStatusHistory(ims.pathways.domain.objects.PatientJourneyStatus.fromSetXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("endedOnDate");
		if(fldEl != null)
		{	
    		obj.setEndedOnDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("currentClock");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentClock(ims.pathways.domain.objects.PathwayClock.getPathwayClockfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clockHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setClockHistory(ims.pathways.domain.objects.PathwayClock.fromSetXMLString(fldEl, factory, obj.getClockHistory(), domMap));
		}
		fldEl = el.element("extReferralKey");
		if(fldEl != null)
		{	
    		obj.setExtReferralKey(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pathwayHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPathwayHistory(ims.pathways.domain.objects.PathwayHistory.fromSetXMLString(fldEl, factory, obj.getPathwayHistory(), domMap));
		}
		fldEl = el.element("responsibleConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsibleConsultant(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isCancerPathway");
		if(fldEl != null)
		{	
    		obj.setIsCancerPathway(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cancerPathwayDate");
		if(fldEl != null)
		{	
    		obj.setCancerPathwayDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("linkedComments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setLinkedComments(ims.pathways.domain.objects.PatientJourneyComment.fromListXMLString(fldEl, factory, obj.getLinkedComments(), domMap));
		}
		fldEl = el.element("lastValidationDate");
		if(fldEl != null)
		{	
    		obj.setLastValidationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("nextValidationDate");
		if(fldEl != null)
		{	
    		obj.setNextValidationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("patientJourneyBreachReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPatientJourneyBreachReason(ims.pathways.domain.objects.PatientJourneyBreach.fromListXMLString(fldEl, factory, obj.getPatientJourneyBreachReason(), domMap));
		}
		fldEl = el.element("validationCompletedDT");
		if(fldEl != null)
		{	
    		obj.setValidationCompletedDT(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("validationCompletedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setValidationCompletedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "patientTargets"
		, "statusHistory"
		, "clockHistory"
		, "pathwayHistory"
		, "linkedComments"
		, "patientJourneyBreachReason"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String Pathway = "pathway";
		public static final String PatientTargets = "patientTargets";
		public static final String Referral = "referral";
		public static final String StartDate = "startDate";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String EndedOnDate = "endedOnDate";
		public static final String CurrentClock = "currentClock";
		public static final String ClockHistory = "clockHistory";
		public static final String ExtReferralKey = "extReferralKey";
		public static final String PathwayHistory = "pathwayHistory";
		public static final String ResponsibleConsultant = "responsibleConsultant";
		public static final String IsCancerPathway = "isCancerPathway";
		public static final String CancerPathwayDate = "cancerPathwayDate";
		public static final String LinkedComments = "linkedComments";
		public static final String LastValidationDate = "lastValidationDate";
		public static final String NextValidationDate = "nextValidationDate";
		public static final String PatientJourneyBreachReason = "patientJourneyBreachReason";
		public static final String ValidationCompletedDT = "validationCompletedDT";
		public static final String ValidationCompletedBy = "validationCompletedBy";
	}
}

