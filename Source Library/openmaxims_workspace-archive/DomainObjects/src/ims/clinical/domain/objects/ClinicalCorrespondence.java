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
package ims.clinical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class ClinicalCorrespondence extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100040;
	private static final long serialVersionUID = 1072100040L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** EpisodeOfCare */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** Type */
	private ims.domain.lookups.LookupInstance type;
	/** Recipients
	  * Collection of ims.clinical.domain.objects.CorrespondenceRecipients.
	  */
	private java.util.List recipients;
	/** PrimaryRecipient */
	private ims.clinical.domain.objects.CorrespondenceRecipients primaryRecipient;
	/** VerifyingHCP */
	private ims.core.resource.people.domain.objects.Hcp verifyingHCP;
	/** VerifyingDateTime */
	private java.util.Date verifyingDateTime;
	/** CurrentStatus */
	private ims.clinical.domain.objects.CorrespondenceStatus currentStatus;
	/** StatusHistory
	  * Collection of ims.clinical.domain.objects.CorrespondenceStatus.
	  */
	private java.util.Set statusHistory;
	/** InpatientDischargeSummary */
	private ims.clinical.domain.objects.InpatientDischargeNoteFollowup inpatientDischargeSummary;
	/** OPDNotes */
	private ims.clinical.domain.objects.OutpatientNotesOutcome oPDNotes;
	/** hasObjectiveNote */
	private Boolean hasObjectiveNote;
	/** hasPlanNote */
	private Boolean hasPlanNote;
	/** hasInstructionsNote */
	private Boolean hasInstructionsNote;
	/** Problems
	  * Collection of ims.clinical.domain.objects.CorrespondenceProblem.
	  */
	private java.util.Set problems;
	/** DiagnosesComplications
	  * Collection of ims.clinical.domain.objects.CorrespondenceDiagnosisComp.
	  */
	private java.util.Set diagnosesComplications;
	/** Procedures
	  * Collection of ims.clinical.domain.objects.CorrespondenceProcedure.
	  */
	private java.util.Set procedures;
	/** Medication */
	private ims.clinical.domain.objects.MedicationOverview medication;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** RUserVerifyingDateTime */
	private java.util.Date rUserVerifyingDateTime;
	/** RUserVerifyingHCP */
	private ims.core.resource.people.domain.objects.MemberOfStaff rUserVerifyingHCP;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClinicalCorrespondence (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClinicalCorrespondence ()
    {
    	super();
    }
    public ClinicalCorrespondence (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.ClinicalCorrespondence.class;
	}


	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public ims.domain.lookups.LookupInstance getType() {
		return type;
	}
	public void setType(ims.domain.lookups.LookupInstance type) {
		this.type = type;
	}

	public java.util.List getRecipients() {
		if ( null == recipients ) {
			recipients = new java.util.ArrayList();
		}
		return recipients;
	}
	public void setRecipients(java.util.List paramValue) {
		this.recipients = paramValue;
	}

	public ims.clinical.domain.objects.CorrespondenceRecipients getPrimaryRecipient() {
		return primaryRecipient;
	}
	public void setPrimaryRecipient(ims.clinical.domain.objects.CorrespondenceRecipients primaryRecipient) {
		this.primaryRecipient = primaryRecipient;
	}

	public ims.core.resource.people.domain.objects.Hcp getVerifyingHCP() {
		return verifyingHCP;
	}
	public void setVerifyingHCP(ims.core.resource.people.domain.objects.Hcp verifyingHCP) {
		this.verifyingHCP = verifyingHCP;
	}

	public java.util.Date getVerifyingDateTime() {
		return verifyingDateTime;
	}
	public void setVerifyingDateTime(java.util.Date verifyingDateTime) {
		this.verifyingDateTime = verifyingDateTime;
	}

	public ims.clinical.domain.objects.CorrespondenceStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.clinical.domain.objects.CorrespondenceStatus currentStatus) {
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

	public ims.clinical.domain.objects.InpatientDischargeNoteFollowup getInpatientDischargeSummary() {
		return inpatientDischargeSummary;
	}
	public void setInpatientDischargeSummary(ims.clinical.domain.objects.InpatientDischargeNoteFollowup inpatientDischargeSummary) {
		this.inpatientDischargeSummary = inpatientDischargeSummary;
	}

	public ims.clinical.domain.objects.OutpatientNotesOutcome getOPDNotes() {
		return oPDNotes;
	}
	public void setOPDNotes(ims.clinical.domain.objects.OutpatientNotesOutcome oPDNotes) {
		this.oPDNotes = oPDNotes;
	}

	public Boolean isHasObjectiveNote() {
		return hasObjectiveNote;
	}
	public void setHasObjectiveNote(Boolean hasObjectiveNote) {
		this.hasObjectiveNote = hasObjectiveNote;
	}

	public Boolean isHasPlanNote() {
		return hasPlanNote;
	}
	public void setHasPlanNote(Boolean hasPlanNote) {
		this.hasPlanNote = hasPlanNote;
	}

	public Boolean isHasInstructionsNote() {
		return hasInstructionsNote;
	}
	public void setHasInstructionsNote(Boolean hasInstructionsNote) {
		this.hasInstructionsNote = hasInstructionsNote;
	}

	public java.util.Set getProblems() {
		if ( null == problems ) {
			problems = new java.util.HashSet();
		}
		return problems;
	}
	public void setProblems(java.util.Set paramValue) {
		this.problems = paramValue;
	}

	public java.util.Set getDiagnosesComplications() {
		if ( null == diagnosesComplications ) {
			diagnosesComplications = new java.util.HashSet();
		}
		return diagnosesComplications;
	}
	public void setDiagnosesComplications(java.util.Set paramValue) {
		this.diagnosesComplications = paramValue;
	}

	public java.util.Set getProcedures() {
		if ( null == procedures ) {
			procedures = new java.util.HashSet();
		}
		return procedures;
	}
	public void setProcedures(java.util.Set paramValue) {
		this.procedures = paramValue;
	}

	public ims.clinical.domain.objects.MedicationOverview getMedication() {
		return medication;
	}
	public void setMedication(ims.clinical.domain.objects.MedicationOverview medication) {
		this.medication = medication;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public java.util.Date getRUserVerifyingDateTime() {
		return rUserVerifyingDateTime;
	}
	public void setRUserVerifyingDateTime(java.util.Date rUserVerifyingDateTime) {
		this.rUserVerifyingDateTime = rUserVerifyingDateTime;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRUserVerifyingHCP() {
		return rUserVerifyingHCP;
	}
	public void setRUserVerifyingHCP(ims.core.resource.people.domain.objects.MemberOfStaff rUserVerifyingHCP) {
		this.rUserVerifyingHCP = rUserVerifyingHCP;
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
		
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*type* :");
		if (type != null)
			auditStr.append(type.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*recipients* :");
		if (recipients != null)
		{
		int i5=0;
		for (i5=0; i5<recipients.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.clinical.domain.objects.CorrespondenceRecipients obj = (ims.clinical.domain.objects.CorrespondenceRecipients)recipients.get(i5);
		    if (obj != null)
			{
				if (i5 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryRecipient* :");
		if (primaryRecipient != null)
		{
			auditStr.append(toShortClassName(primaryRecipient));
				
		    auditStr.append(primaryRecipient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*verifyingHCP* :");
		if (verifyingHCP != null)
		{
			auditStr.append(toShortClassName(verifyingHCP));
				
		    auditStr.append(verifyingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*verifyingDateTime* :");
		auditStr.append(verifyingDateTime);
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
			java.util.Iterator it10 = statusHistory.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.CorrespondenceStatus obj = (ims.clinical.domain.objects.CorrespondenceStatus)it10.next();
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
		auditStr.append("\r\n*inpatientDischargeSummary* :");
		if (inpatientDischargeSummary != null)
		{
			auditStr.append(toShortClassName(inpatientDischargeSummary));
				
		    auditStr.append(inpatientDischargeSummary.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*oPDNotes* :");
		if (oPDNotes != null)
		{
			auditStr.append(toShortClassName(oPDNotes));
				
		    auditStr.append(oPDNotes.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasObjectiveNote* :");
		auditStr.append(hasObjectiveNote);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasPlanNote* :");
		auditStr.append(hasPlanNote);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasInstructionsNote* :");
		auditStr.append(hasInstructionsNote);
	    auditStr.append("; ");
		auditStr.append("\r\n*problems* :");
		if (problems != null)
		{
			java.util.Iterator it16 = problems.iterator();
			int i16=0;
			while (it16.hasNext())
			{
				if (i16 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.CorrespondenceProblem obj = (ims.clinical.domain.objects.CorrespondenceProblem)it16.next();
		if (obj != null)
		{
		   if (i16 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i16++;
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosesComplications* :");
		if (diagnosesComplications != null)
		{
			java.util.Iterator it17 = diagnosesComplications.iterator();
			int i17=0;
			while (it17.hasNext())
			{
				if (i17 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.CorrespondenceDiagnosisComp obj = (ims.clinical.domain.objects.CorrespondenceDiagnosisComp)it17.next();
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
		auditStr.append("\r\n*procedures* :");
		if (procedures != null)
		{
			java.util.Iterator it18 = procedures.iterator();
			int i18=0;
			while (it18.hasNext())
			{
				if (i18 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.CorrespondenceProcedure obj = (ims.clinical.domain.objects.CorrespondenceProcedure)it18.next();
		if (obj != null)
		{
		   if (i18 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i18++;
		}
		if (i18 > 0)
			auditStr.append("] " + i18);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*medication* :");
		if (medication != null)
		{
			auditStr.append(toShortClassName(medication));
				
		    auditStr.append(medication.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*rUserVerifyingDateTime* :");
		auditStr.append(rUserVerifyingDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*rUserVerifyingHCP* :");
		if (rUserVerifyingHCP != null)
		{
			auditStr.append(toShortClassName(rUserVerifyingHCP));
				
		    auditStr.append(rUserVerifyingHCP.getId());
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
		
		String keyClassName = "ClinicalCorrespondence";
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
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.getType() != null)
		{
			sb.append("<type>");
			sb.append(this.getType().toXMLString()); 
			sb.append("</type>");		
		}
		if (this.getRecipients() != null)
		{
			if (this.getRecipients().size() > 0 )
			{
			sb.append("<recipients>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getRecipients(), domMap));
			sb.append("</recipients>");		
			}
		}
		if (this.getPrimaryRecipient() != null)
		{
			sb.append("<primaryRecipient>");
			sb.append(this.getPrimaryRecipient().toXMLString(domMap)); 	
			sb.append("</primaryRecipient>");		
		}
		if (this.getVerifyingHCP() != null)
		{
			sb.append("<verifyingHCP>");
			sb.append(this.getVerifyingHCP().toXMLString(domMap)); 	
			sb.append("</verifyingHCP>");		
		}
		if (this.getVerifyingDateTime() != null)
		{
			sb.append("<verifyingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getVerifyingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</verifyingDateTime>");		
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
		if (this.getInpatientDischargeSummary() != null)
		{
			sb.append("<inpatientDischargeSummary>");
			sb.append(this.getInpatientDischargeSummary().toXMLString(domMap)); 	
			sb.append("</inpatientDischargeSummary>");		
		}
		if (this.getOPDNotes() != null)
		{
			sb.append("<oPDNotes>");
			sb.append(this.getOPDNotes().toXMLString(domMap)); 	
			sb.append("</oPDNotes>");		
		}
		if (this.isHasObjectiveNote() != null)
		{
			sb.append("<hasObjectiveNote>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasObjectiveNote().toString()));
			sb.append("</hasObjectiveNote>");		
		}
		if (this.isHasPlanNote() != null)
		{
			sb.append("<hasPlanNote>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasPlanNote().toString()));
			sb.append("</hasPlanNote>");		
		}
		if (this.isHasInstructionsNote() != null)
		{
			sb.append("<hasInstructionsNote>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasInstructionsNote().toString()));
			sb.append("</hasInstructionsNote>");		
		}
		if (this.getProblems() != null)
		{
			if (this.getProblems().size() > 0 )
			{
			sb.append("<problems>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProblems(), domMap));
			sb.append("</problems>");		
			}
		}
		if (this.getDiagnosesComplications() != null)
		{
			if (this.getDiagnosesComplications().size() > 0 )
			{
			sb.append("<diagnosesComplications>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDiagnosesComplications(), domMap));
			sb.append("</diagnosesComplications>");		
			}
		}
		if (this.getProcedures() != null)
		{
			if (this.getProcedures().size() > 0 )
			{
			sb.append("<procedures>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProcedures(), domMap));
			sb.append("</procedures>");		
			}
		}
		if (this.getMedication() != null)
		{
			sb.append("<medication>");
			sb.append(this.getMedication().toXMLString(domMap)); 	
			sb.append("</medication>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getRUserVerifyingDateTime() != null)
		{
			sb.append("<rUserVerifyingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRUserVerifyingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</rUserVerifyingDateTime>");		
		}
		if (this.getRUserVerifyingHCP() != null)
		{
			sb.append("<rUserVerifyingHCP>");
			sb.append(this.getRUserVerifyingHCP().toXMLString(domMap)); 	
			sb.append("</rUserVerifyingHCP>");		
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
			ClinicalCorrespondence domainObject = getClinicalCorrespondencefromXML(itemEl, factory, domMap);

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
			ClinicalCorrespondence domainObject = getClinicalCorrespondencefromXML(itemEl, factory, domMap);

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
		
	public static ClinicalCorrespondence getClinicalCorrespondencefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClinicalCorrespondencefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClinicalCorrespondence getClinicalCorrespondencefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClinicalCorrespondence.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClinicalCorrespondence.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClinicalCorrespondence class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClinicalCorrespondence)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClinicalCorrespondence.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClinicalCorrespondence ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClinicalCorrespondence)factory.getImportedDomainObject(ClinicalCorrespondence.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClinicalCorrespondence();
		}
		String keyClassName = "ClinicalCorrespondence";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClinicalCorrespondence)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClinicalCorrespondence obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("type");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("recipients");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setRecipients(ims.clinical.domain.objects.CorrespondenceRecipients.fromListXMLString(fldEl, factory, obj.getRecipients(), domMap));
		}
		fldEl = el.element("primaryRecipient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrimaryRecipient(ims.clinical.domain.objects.CorrespondenceRecipients.getCorrespondenceRecipientsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("verifyingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVerifyingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("verifyingDateTime");
		if(fldEl != null)
		{	
    		obj.setVerifyingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.clinical.domain.objects.CorrespondenceStatus.getCorrespondenceStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setStatusHistory(ims.clinical.domain.objects.CorrespondenceStatus.fromSetXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("inpatientDischargeSummary");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInpatientDischargeSummary(ims.clinical.domain.objects.InpatientDischargeNoteFollowup.getInpatientDischargeNoteFollowupfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("oPDNotes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOPDNotes(ims.clinical.domain.objects.OutpatientNotesOutcome.getOutpatientNotesOutcomefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hasObjectiveNote");
		if(fldEl != null)
		{	
    		obj.setHasObjectiveNote(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasPlanNote");
		if(fldEl != null)
		{	
    		obj.setHasPlanNote(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasInstructionsNote");
		if(fldEl != null)
		{	
    		obj.setHasInstructionsNote(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("problems");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setProblems(ims.clinical.domain.objects.CorrespondenceProblem.fromSetXMLString(fldEl, factory, obj.getProblems(), domMap));
		}
		fldEl = el.element("diagnosesComplications");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDiagnosesComplications(ims.clinical.domain.objects.CorrespondenceDiagnosisComp.fromSetXMLString(fldEl, factory, obj.getDiagnosesComplications(), domMap));
		}
		fldEl = el.element("procedures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setProcedures(ims.clinical.domain.objects.CorrespondenceProcedure.fromSetXMLString(fldEl, factory, obj.getProcedures(), domMap));
		}
		fldEl = el.element("medication");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMedication(ims.clinical.domain.objects.MedicationOverview.getMedicationOverviewfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("rUserVerifyingDateTime");
		if(fldEl != null)
		{	
    		obj.setRUserVerifyingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("rUserVerifyingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRUserVerifyingHCP(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "recipients"
		, "statusHistory"
		, "problems"
		, "diagnosesComplications"
		, "procedures"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String Type = "type";
		public static final String Recipients = "recipients";
		public static final String PrimaryRecipient = "primaryRecipient";
		public static final String VerifyingHCP = "verifyingHCP";
		public static final String VerifyingDateTime = "verifyingDateTime";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String InpatientDischargeSummary = "inpatientDischargeSummary";
		public static final String OPDNotes = "oPDNotes";
		public static final String HasObjectiveNote = "hasObjectiveNote";
		public static final String HasPlanNote = "hasPlanNote";
		public static final String HasInstructionsNote = "hasInstructionsNote";
		public static final String Problems = "problems";
		public static final String DiagnosesComplications = "diagnosesComplications";
		public static final String Procedures = "procedures";
		public static final String Medication = "medication";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String RUserVerifyingDateTime = "rUserVerifyingDateTime";
		public static final String RUserVerifyingHCP = "rUserVerifyingHCP";
	}
}

