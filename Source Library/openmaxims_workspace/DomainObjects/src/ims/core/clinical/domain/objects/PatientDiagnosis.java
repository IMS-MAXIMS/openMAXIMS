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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class PatientDiagnosis extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100016;
	private static final long serialVersionUID = 1003100016L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Diagnosis Lookup */
	private ims.core.clinical.domain.objects.Diagnosis diagnosis;
	/** Diagnosis Description */
	private String diagnosisDescription;
	/** Laterality */
	private ims.domain.lookups.LookupInstance diagLaterality;
	/** Site BO */
	private ims.domain.lookups.LookupInstance site;
	/** Site Text - if no site is selected from above */
	private String siteText;
	/** Source of Information - GP/Patient/Notes */
	private ims.domain.lookups.LookupInstance sourceofInformation;
	/** Date Diagnosis Made */
	private Integer diagnosedDate;
	/** Hcp who Made Diagnosis */
	private ims.core.resource.people.domain.objects.Hcp diagnosedBy;
	/** Date Onset */
	private java.util.Date dateOnset;
	/** is Resolved */
	private Boolean isResolved;
	/** Date Resolved */
	private java.util.Date dateResolved;
	/** Resolved HCP */
	private ims.core.resource.people.domain.objects.Medic resolvedHCP;
	/** isComplication */
	private Boolean isComplication;
	/** CurrentStatus */
	private ims.core.clinical.domain.objects.PatientDiagnosisStatus currentStatus;
	/** Status History
	  * Collection of ims.core.clinical.domain.objects.PatientDiagnosisStatus.
	  */
	private java.util.Set statusHistory;
	/** Informed Of Diagnosis
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List informedOfDiagnosis;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Text notes associated with record */
	private String notes;
	/** Specialty */
	private ims.domain.lookups.LookupInstance specialty;
	/** Basis - Clinical/Pathological etc
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List basisofDiagnosis;
	/** Exclude From Others */
	private Boolean excludefromOthers;
	/** Confirmation Status */
	private ims.domain.lookups.LookupInstance diagConfirmedStatus;
	/** Confrmed By */
	private ims.core.resource.people.domain.objects.Hcp diagConfirmedBy;
	/** Confirmation Date and Time */
	private java.util.Date diagConfirmedDateTime;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Primary For Care Spells Collection
	  * Collection of ims.core.clinical.domain.objects.CsPrimaryDiagnosis.
	  */
	private java.util.Set primaryForCareSpells;
	/** Diagnosis added to PMH */
	private Boolean isPMH;
	/** is a Cancer Diagnosis */
	private Boolean isCancerDiagnosis;
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInfo;
	/** Is the Diagnosis a comorbidity */
	private Boolean isComorbidity;
	/** Co-Morbidity for Episode of Cares
	  * Collection of ims.core.clinical.domain.objects.EpisodeOfCareCoMorbidity.
	  */
	private java.util.Set coMorbidityForEpisodeOfCares;
	/** Include Diagnosis In Discharge Reports
	  * Collection of ims.core.clinical.domain.objects.IncludeDiagnosisInDischargeReport.
	  */
	private java.util.Set includeDiagnosisInDiscReports;
	/** is a Previous Relevant Diagnosis */
	private Boolean isPrevRelevantDiagnosis;
	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** AddedDuringCoding */
	private Boolean addedDuringCoding;
	/** Coding Sequence set on Coding Form */
	private Integer codingSequence;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientDiagnosis (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientDiagnosis ()
    {
    	super();
    }
    public PatientDiagnosis (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientDiagnosis.class;
	}


	public ims.core.clinical.domain.objects.Diagnosis getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(ims.core.clinical.domain.objects.Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDiagnosisDescription() {
		return diagnosisDescription;
	}
	public void setDiagnosisDescription(String diagnosisDescription) {
		if ( null != diagnosisDescription && diagnosisDescription.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for diagnosisDescription. Tried to set value: "+
				diagnosisDescription);
		}
		this.diagnosisDescription = diagnosisDescription;
	}

	public ims.domain.lookups.LookupInstance getDiagLaterality() {
		return diagLaterality;
	}
	public void setDiagLaterality(ims.domain.lookups.LookupInstance diagLaterality) {
		this.diagLaterality = diagLaterality;
	}

	public ims.domain.lookups.LookupInstance getSite() {
		return site;
	}
	public void setSite(ims.domain.lookups.LookupInstance site) {
		this.site = site;
	}

	public String getSiteText() {
		return siteText;
	}
	public void setSiteText(String siteText) {
		if ( null != siteText && siteText.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for siteText. Tried to set value: "+
				siteText);
		}
		this.siteText = siteText;
	}

	public ims.domain.lookups.LookupInstance getSourceofInformation() {
		return sourceofInformation;
	}
	public void setSourceofInformation(ims.domain.lookups.LookupInstance sourceofInformation) {
		this.sourceofInformation = sourceofInformation;
	}

	public Integer getDiagnosedDate() {
		return diagnosedDate;
	}
	public void setDiagnosedDate(Integer diagnosedDate) {
		this.diagnosedDate = diagnosedDate;
	}

	public ims.core.resource.people.domain.objects.Hcp getDiagnosedBy() {
		return diagnosedBy;
	}
	public void setDiagnosedBy(ims.core.resource.people.domain.objects.Hcp diagnosedBy) {
		this.diagnosedBy = diagnosedBy;
	}

	public java.util.Date getDateOnset() {
		return dateOnset;
	}
	public void setDateOnset(java.util.Date dateOnset) {
		this.dateOnset = dateOnset;
	}

	public Boolean isIsResolved() {
		return isResolved;
	}
	public void setIsResolved(Boolean isResolved) {
		this.isResolved = isResolved;
	}

	public java.util.Date getDateResolved() {
		return dateResolved;
	}
	public void setDateResolved(java.util.Date dateResolved) {
		this.dateResolved = dateResolved;
	}

	public ims.core.resource.people.domain.objects.Medic getResolvedHCP() {
		return resolvedHCP;
	}
	public void setResolvedHCP(ims.core.resource.people.domain.objects.Medic resolvedHCP) {
		this.resolvedHCP = resolvedHCP;
	}

	public Boolean isIsComplication() {
		return isComplication;
	}
	public void setIsComplication(Boolean isComplication) {
		this.isComplication = isComplication;
	}

	public ims.core.clinical.domain.objects.PatientDiagnosisStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.core.clinical.domain.objects.PatientDiagnosisStatus currentStatus) {
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

	public java.util.List getInformedOfDiagnosis() {
		if ( null == informedOfDiagnosis ) {
			informedOfDiagnosis = new java.util.ArrayList();
		}
		return informedOfDiagnosis;
	}
	public void setInformedOfDiagnosis(java.util.List paramValue) {
		this.informedOfDiagnosis = paramValue;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
	}

	public ims.domain.lookups.LookupInstance getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.domain.lookups.LookupInstance specialty) {
		this.specialty = specialty;
	}

	public java.util.List getBasisofDiagnosis() {
		if ( null == basisofDiagnosis ) {
			basisofDiagnosis = new java.util.ArrayList();
		}
		return basisofDiagnosis;
	}
	public void setBasisofDiagnosis(java.util.List paramValue) {
		this.basisofDiagnosis = paramValue;
	}

	public Boolean isExcludefromOthers() {
		return excludefromOthers;
	}
	public void setExcludefromOthers(Boolean excludefromOthers) {
		this.excludefromOthers = excludefromOthers;
	}

	public ims.domain.lookups.LookupInstance getDiagConfirmedStatus() {
		return diagConfirmedStatus;
	}
	public void setDiagConfirmedStatus(ims.domain.lookups.LookupInstance diagConfirmedStatus) {
		this.diagConfirmedStatus = diagConfirmedStatus;
	}

	public ims.core.resource.people.domain.objects.Hcp getDiagConfirmedBy() {
		return diagConfirmedBy;
	}
	public void setDiagConfirmedBy(ims.core.resource.people.domain.objects.Hcp diagConfirmedBy) {
		this.diagConfirmedBy = diagConfirmedBy;
	}

	public java.util.Date getDiagConfirmedDateTime() {
		return diagConfirmedDateTime;
	}
	public void setDiagConfirmedDateTime(java.util.Date diagConfirmedDateTime) {
		this.diagConfirmedDateTime = diagConfirmedDateTime;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public java.util.Set getPrimaryForCareSpells() {
		if ( null == primaryForCareSpells ) {
			primaryForCareSpells = new java.util.HashSet();
		}
		return primaryForCareSpells;
	}
	public void setPrimaryForCareSpells(java.util.Set paramValue) {
		this.primaryForCareSpells = paramValue;
	}

	public Boolean isIsPMH() {
		return isPMH;
	}
	public void setIsPMH(Boolean isPMH) {
		this.isPMH = isPMH;
	}

	public Boolean isIsCancerDiagnosis() {
		return isCancerDiagnosis;
	}
	public void setIsCancerDiagnosis(Boolean isCancerDiagnosis) {
		this.isCancerDiagnosis = isCancerDiagnosis;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInfo() {
		return authoringInfo;
	}
	public void setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation authoringInfo) {
		this.authoringInfo = authoringInfo;
	}

	public Boolean isIsComorbidity() {
		return isComorbidity;
	}
	public void setIsComorbidity(Boolean isComorbidity) {
		this.isComorbidity = isComorbidity;
	}

	public java.util.Set getCoMorbidityForEpisodeOfCares() {
		if ( null == coMorbidityForEpisodeOfCares ) {
			coMorbidityForEpisodeOfCares = new java.util.HashSet();
		}
		return coMorbidityForEpisodeOfCares;
	}
	public void setCoMorbidityForEpisodeOfCares(java.util.Set paramValue) {
		this.coMorbidityForEpisodeOfCares = paramValue;
	}

	public java.util.Set getIncludeDiagnosisInDiscReports() {
		if ( null == includeDiagnosisInDiscReports ) {
			includeDiagnosisInDiscReports = new java.util.HashSet();
		}
		return includeDiagnosisInDiscReports;
	}
	public void setIncludeDiagnosisInDiscReports(java.util.Set paramValue) {
		this.includeDiagnosisInDiscReports = paramValue;
	}

	public Boolean isIsPrevRelevantDiagnosis() {
		return isPrevRelevantDiagnosis;
	}
	public void setIsPrevRelevantDiagnosis(Boolean isPrevRelevantDiagnosis) {
		this.isPrevRelevantDiagnosis = isPrevRelevantDiagnosis;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public Boolean isAddedDuringCoding() {
		return addedDuringCoding;
	}
	public void setAddedDuringCoding(Boolean addedDuringCoding) {
		this.addedDuringCoding = addedDuringCoding;
	}

	public Integer getCodingSequence() {
		return codingSequence;
	}
	public void setCodingSequence(Integer codingSequence) {
		this.codingSequence = codingSequence;
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
		
		auditStr.append("\r\n*diagnosis* :");
		if (diagnosis != null)
		{
			auditStr.append(toShortClassName(diagnosis));
				
		    auditStr.append(diagnosis.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosisDescription* :");
		auditStr.append(diagnosisDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*diagLaterality* :");
		if (diagLaterality != null)
			auditStr.append(diagLaterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*site* :");
		if (site != null)
			auditStr.append(site.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*siteText* :");
		auditStr.append(siteText);
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceofInformation* :");
		if (sourceofInformation != null)
			auditStr.append(sourceofInformation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosedDate* :");
		auditStr.append(diagnosedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosedBy* :");
		if (diagnosedBy != null)
		{
			auditStr.append(toShortClassName(diagnosedBy));
				
		    auditStr.append(diagnosedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOnset* :");
		auditStr.append(dateOnset);
	    auditStr.append("; ");
		auditStr.append("\r\n*isResolved* :");
		auditStr.append(isResolved);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateResolved* :");
		auditStr.append(dateResolved);
	    auditStr.append("; ");
		auditStr.append("\r\n*resolvedHCP* :");
		if (resolvedHCP != null)
		{
			auditStr.append(toShortClassName(resolvedHCP));
				
		    auditStr.append(resolvedHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isComplication* :");
		auditStr.append(isComplication);
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
			java.util.Iterator it15 = statusHistory.iterator();
			int i15=0;
			while (it15.hasNext())
			{
				if (i15 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientDiagnosisStatus obj = (ims.core.clinical.domain.objects.PatientDiagnosisStatus)it15.next();
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
		auditStr.append("\r\n*informedOfDiagnosis* :");
		if (informedOfDiagnosis != null)
		{
			java.util.Iterator it16 = informedOfDiagnosis.iterator();
			int i16=0;
			while (it16.hasNext())
			{
				if (i16 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it16.next();
			auditStr.append(obj.getText());
			i16++;
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
			auditStr.append(specialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*basisofDiagnosis* :");
		if (basisofDiagnosis != null)
		{
			java.util.Iterator it20 = basisofDiagnosis.iterator();
			int i20=0;
			while (it20.hasNext())
			{
				if (i20 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it20.next();
			auditStr.append(obj.getText());
			i20++;
		}
		if (i20 > 0)
			auditStr.append("] " + i20);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*excludefromOthers* :");
		auditStr.append(excludefromOthers);
	    auditStr.append("; ");
		auditStr.append("\r\n*diagConfirmedStatus* :");
		if (diagConfirmedStatus != null)
			auditStr.append(diagConfirmedStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*diagConfirmedBy* :");
		if (diagConfirmedBy != null)
		{
			auditStr.append(toShortClassName(diagConfirmedBy));
				
		    auditStr.append(diagConfirmedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*diagConfirmedDateTime* :");
		auditStr.append(diagConfirmedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryForCareSpells* :");
		if (primaryForCareSpells != null)
		{
			java.util.Iterator it26 = primaryForCareSpells.iterator();
			int i26=0;
			while (it26.hasNext())
			{
				if (i26 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.CsPrimaryDiagnosis obj = (ims.core.clinical.domain.objects.CsPrimaryDiagnosis)it26.next();
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
		auditStr.append("\r\n*isPMH* :");
		auditStr.append(isPMH);
	    auditStr.append("; ");
		auditStr.append("\r\n*isCancerDiagnosis* :");
		auditStr.append(isCancerDiagnosis);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInfo* :");
		if (authoringInfo != null)
		{
			auditStr.append(toShortClassName(authoringInfo));
				
		    auditStr.append(authoringInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isComorbidity* :");
		auditStr.append(isComorbidity);
	    auditStr.append("; ");
		auditStr.append("\r\n*coMorbidityForEpisodeOfCares* :");
		if (coMorbidityForEpisodeOfCares != null)
		{
			java.util.Iterator it31 = coMorbidityForEpisodeOfCares.iterator();
			int i31=0;
			while (it31.hasNext())
			{
				if (i31 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.EpisodeOfCareCoMorbidity obj = (ims.core.clinical.domain.objects.EpisodeOfCareCoMorbidity)it31.next();
		if (obj != null)
		{
		   if (i31 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i31++;
		}
		if (i31 > 0)
			auditStr.append("] " + i31);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*includeDiagnosisInDiscReports* :");
		if (includeDiagnosisInDiscReports != null)
		{
			java.util.Iterator it32 = includeDiagnosisInDiscReports.iterator();
			int i32=0;
			while (it32.hasNext())
			{
				if (i32 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.IncludeDiagnosisInDischargeReport obj = (ims.core.clinical.domain.objects.IncludeDiagnosisInDischargeReport)it32.next();
		if (obj != null)
		{
		   if (i32 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i32++;
		}
		if (i32 > 0)
			auditStr.append("] " + i32);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isPrevRelevantDiagnosis* :");
		auditStr.append(isPrevRelevantDiagnosis);
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*addedDuringCoding* :");
		auditStr.append(addedDuringCoding);
	    auditStr.append("; ");
		auditStr.append("\r\n*codingSequence* :");
		auditStr.append(codingSequence);
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
		
		String keyClassName = "PatientDiagnosis";
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
		if (this.getDiagnosis() != null)
		{
			sb.append("<diagnosis>");
			sb.append(this.getDiagnosis().toXMLString(domMap)); 	
			sb.append("</diagnosis>");		
		}
		if (this.getDiagnosisDescription() != null)
		{
			sb.append("<diagnosisDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDiagnosisDescription().toString()));
			sb.append("</diagnosisDescription>");		
		}
		if (this.getDiagLaterality() != null)
		{
			sb.append("<diagLaterality>");
			sb.append(this.getDiagLaterality().toXMLString()); 
			sb.append("</diagLaterality>");		
		}
		if (this.getSite() != null)
		{
			sb.append("<site>");
			sb.append(this.getSite().toXMLString()); 
			sb.append("</site>");		
		}
		if (this.getSiteText() != null)
		{
			sb.append("<siteText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSiteText().toString()));
			sb.append("</siteText>");		
		}
		if (this.getSourceofInformation() != null)
		{
			sb.append("<sourceofInformation>");
			sb.append(this.getSourceofInformation().toXMLString()); 
			sb.append("</sourceofInformation>");		
		}
		if (this.getDiagnosedDate() != null)
		{
			sb.append("<diagnosedDate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDiagnosedDate().toString()));
			sb.append("</diagnosedDate>");		
		}
		if (this.getDiagnosedBy() != null)
		{
			sb.append("<diagnosedBy>");
			sb.append(this.getDiagnosedBy().toXMLString(domMap)); 	
			sb.append("</diagnosedBy>");		
		}
		if (this.getDateOnset() != null)
		{
			sb.append("<dateOnset>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOnset()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOnset>");		
		}
		if (this.isIsResolved() != null)
		{
			sb.append("<isResolved>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsResolved().toString()));
			sb.append("</isResolved>");		
		}
		if (this.getDateResolved() != null)
		{
			sb.append("<dateResolved>");
			sb.append(new ims.framework.utils.DateTime(this.getDateResolved()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateResolved>");		
		}
		if (this.getResolvedHCP() != null)
		{
			sb.append("<resolvedHCP>");
			sb.append(this.getResolvedHCP().toXMLString(domMap)); 	
			sb.append("</resolvedHCP>");		
		}
		if (this.isIsComplication() != null)
		{
			sb.append("<isComplication>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsComplication().toString()));
			sb.append("</isComplication>");		
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
		if (this.getInformedOfDiagnosis() != null)
		{
			if (this.getInformedOfDiagnosis().size() > 0 )
			{
			sb.append("<informedOfDiagnosis>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getInformedOfDiagnosis())); 
			sb.append("</informedOfDiagnosis>");		
			}
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString()); 
			sb.append("</specialty>");		
		}
		if (this.getBasisofDiagnosis() != null)
		{
			if (this.getBasisofDiagnosis().size() > 0 )
			{
			sb.append("<basisofDiagnosis>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getBasisofDiagnosis())); 
			sb.append("</basisofDiagnosis>");		
			}
		}
		if (this.isExcludefromOthers() != null)
		{
			sb.append("<excludefromOthers>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isExcludefromOthers().toString()));
			sb.append("</excludefromOthers>");		
		}
		if (this.getDiagConfirmedStatus() != null)
		{
			sb.append("<diagConfirmedStatus>");
			sb.append(this.getDiagConfirmedStatus().toXMLString()); 
			sb.append("</diagConfirmedStatus>");		
		}
		if (this.getDiagConfirmedBy() != null)
		{
			sb.append("<diagConfirmedBy>");
			sb.append(this.getDiagConfirmedBy().toXMLString(domMap)); 	
			sb.append("</diagConfirmedBy>");		
		}
		if (this.getDiagConfirmedDateTime() != null)
		{
			sb.append("<diagConfirmedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getDiagConfirmedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</diagConfirmedDateTime>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getPrimaryForCareSpells() != null)
		{
			if (this.getPrimaryForCareSpells().size() > 0 )
			{
			sb.append("<primaryForCareSpells>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPrimaryForCareSpells(), domMap));
			sb.append("</primaryForCareSpells>");		
			}
		}
		if (this.isIsPMH() != null)
		{
			sb.append("<isPMH>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPMH().toString()));
			sb.append("</isPMH>");		
		}
		if (this.isIsCancerDiagnosis() != null)
		{
			sb.append("<isCancerDiagnosis>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCancerDiagnosis().toString()));
			sb.append("</isCancerDiagnosis>");		
		}
		if (this.getAuthoringInfo() != null)
		{
			sb.append("<authoringInfo>");
			sb.append(this.getAuthoringInfo().toXMLString(domMap)); 	
			sb.append("</authoringInfo>");		
		}
		if (this.isIsComorbidity() != null)
		{
			sb.append("<isComorbidity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsComorbidity().toString()));
			sb.append("</isComorbidity>");		
		}
		if (this.getCoMorbidityForEpisodeOfCares() != null)
		{
			if (this.getCoMorbidityForEpisodeOfCares().size() > 0 )
			{
			sb.append("<coMorbidityForEpisodeOfCares>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCoMorbidityForEpisodeOfCares(), domMap));
			sb.append("</coMorbidityForEpisodeOfCares>");		
			}
		}
		if (this.getIncludeDiagnosisInDiscReports() != null)
		{
			if (this.getIncludeDiagnosisInDiscReports().size() > 0 )
			{
			sb.append("<includeDiagnosisInDiscReports>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getIncludeDiagnosisInDiscReports(), domMap));
			sb.append("</includeDiagnosisInDiscReports>");		
			}
		}
		if (this.isIsPrevRelevantDiagnosis() != null)
		{
			sb.append("<isPrevRelevantDiagnosis>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPrevRelevantDiagnosis().toString()));
			sb.append("</isPrevRelevantDiagnosis>");		
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.isAddedDuringCoding() != null)
		{
			sb.append("<addedDuringCoding>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAddedDuringCoding().toString()));
			sb.append("</addedDuringCoding>");		
		}
		if (this.getCodingSequence() != null)
		{
			sb.append("<codingSequence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCodingSequence().toString()));
			sb.append("</codingSequence>");		
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
			PatientDiagnosis domainObject = getPatientDiagnosisfromXML(itemEl, factory, domMap);

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
			PatientDiagnosis domainObject = getPatientDiagnosisfromXML(itemEl, factory, domMap);

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
		
	public static PatientDiagnosis getPatientDiagnosisfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientDiagnosisfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientDiagnosis getPatientDiagnosisfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientDiagnosis.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientDiagnosis.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientDiagnosis class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientDiagnosis)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientDiagnosis.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientDiagnosis ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientDiagnosis)factory.getImportedDomainObject(PatientDiagnosis.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientDiagnosis();
		}
		String keyClassName = "PatientDiagnosis";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientDiagnosis)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientDiagnosis obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("diagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDiagnosis(ims.core.clinical.domain.objects.Diagnosis.getDiagnosisfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("diagnosisDescription");
		if(fldEl != null)
		{	
    		obj.setDiagnosisDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("diagLaterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDiagLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("site");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSite(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("siteText");
		if(fldEl != null)
		{	
    		obj.setSiteText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sourceofInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSourceofInformation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("diagnosedDate");
		if(fldEl != null)
		{	
    		obj.setDiagnosedDate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("diagnosedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDiagnosedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateOnset");
		if(fldEl != null)
		{	
    		obj.setDateOnset(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isResolved");
		if(fldEl != null)
		{	
    		obj.setIsResolved(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateResolved");
		if(fldEl != null)
		{	
    		obj.setDateResolved(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("resolvedHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResolvedHCP(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isComplication");
		if(fldEl != null)
		{	
    		obj.setIsComplication(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.core.clinical.domain.objects.PatientDiagnosisStatus.getPatientDiagnosisStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setStatusHistory(ims.core.clinical.domain.objects.PatientDiagnosisStatus.fromSetXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("informedOfDiagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setInformedOfDiagnosis(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getInformedOfDiagnosis())); 
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("basisofDiagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setBasisofDiagnosis(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getBasisofDiagnosis())); 
		}
		fldEl = el.element("excludefromOthers");
		if(fldEl != null)
		{	
    		obj.setExcludefromOthers(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("diagConfirmedStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDiagConfirmedStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("diagConfirmedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDiagConfirmedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("diagConfirmedDateTime");
		if(fldEl != null)
		{	
    		obj.setDiagConfirmedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("primaryForCareSpells");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPrimaryForCareSpells(ims.core.clinical.domain.objects.CsPrimaryDiagnosis.fromSetXMLString(fldEl, factory, obj.getPrimaryForCareSpells(), domMap));
		}
		fldEl = el.element("isPMH");
		if(fldEl != null)
		{	
    		obj.setIsPMH(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isCancerDiagnosis");
		if(fldEl != null)
		{	
    		obj.setIsCancerDiagnosis(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("authoringInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isComorbidity");
		if(fldEl != null)
		{	
    		obj.setIsComorbidity(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("coMorbidityForEpisodeOfCares");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setCoMorbidityForEpisodeOfCares(ims.core.clinical.domain.objects.EpisodeOfCareCoMorbidity.fromSetXMLString(fldEl, factory, obj.getCoMorbidityForEpisodeOfCares(), domMap));
		}
		fldEl = el.element("includeDiagnosisInDiscReports");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setIncludeDiagnosisInDiscReports(ims.core.clinical.domain.objects.IncludeDiagnosisInDischargeReport.fromSetXMLString(fldEl, factory, obj.getIncludeDiagnosisInDiscReports(), domMap));
		}
		fldEl = el.element("isPrevRelevantDiagnosis");
		if(fldEl != null)
		{	
    		obj.setIsPrevRelevantDiagnosis(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("addedDuringCoding");
		if(fldEl != null)
		{	
    		obj.setAddedDuringCoding(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("codingSequence");
		if(fldEl != null)
		{	
    		obj.setCodingSequence(new Integer(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "statusHistory"
		, "informedOfDiagnosis"
		, "basisofDiagnosis"
		, "primaryForCareSpells"
		, "coMorbidityForEpisodeOfCares"
		, "includeDiagnosisInDiscReports"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Diagnosis = "diagnosis";
		public static final String DiagnosisDescription = "diagnosisDescription";
		public static final String DiagLaterality = "diagLaterality";
		public static final String Site = "site";
		public static final String SiteText = "siteText";
		public static final String SourceofInformation = "sourceofInformation";
		public static final String DiagnosedDate = "diagnosedDate";
		public static final String DiagnosedBy = "diagnosedBy";
		public static final String DateOnset = "dateOnset";
		public static final String IsResolved = "isResolved";
		public static final String DateResolved = "dateResolved";
		public static final String ResolvedHCP = "resolvedHCP";
		public static final String IsComplication = "isComplication";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String InformedOfDiagnosis = "informedOfDiagnosis";
		public static final String ClinicalContact = "clinicalContact";
		public static final String Notes = "notes";
		public static final String Specialty = "specialty";
		public static final String BasisofDiagnosis = "basisofDiagnosis";
		public static final String ExcludefromOthers = "excludefromOthers";
		public static final String DiagConfirmedStatus = "diagConfirmedStatus";
		public static final String DiagConfirmedBy = "diagConfirmedBy";
		public static final String DiagConfirmedDateTime = "diagConfirmedDateTime";
		public static final String CareContext = "careContext";
		public static final String PrimaryForCareSpells = "primaryForCareSpells";
		public static final String IsPMH = "isPMH";
		public static final String IsCancerDiagnosis = "isCancerDiagnosis";
		public static final String AuthoringInfo = "authoringInfo";
		public static final String IsComorbidity = "isComorbidity";
		public static final String CoMorbidityForEpisodeOfCares = "coMorbidityForEpisodeOfCares";
		public static final String IncludeDiagnosisInDiscReports = "includeDiagnosisInDiscReports";
		public static final String IsPrevRelevantDiagnosis = "isPrevRelevantDiagnosis";
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String AddedDuringCoding = "addedDuringCoding";
		public static final String CodingSequence = "codingSequence";
	}
}

