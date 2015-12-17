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
package ims.core.documents.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PatientDocument extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1068100001;
	private static final long serialVersionUID = 1068100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** EpisodeOfCare */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeofCare;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Referral */
	private ims.core.admin.domain.objects.Referral referral;
	/** Document Name */
	private String name;
	/** Server Document */
	private ims.core.documents.domain.objects.ServerDocument serverDocument;
	/** Creation Type - Scanned - imported - generated etc */
	private ims.domain.lookups.LookupInstance creationType;
	/** Document Category */
	private ims.domain.lookups.LookupInstance category;
	/** Patient Document Status */
	private ims.domain.lookups.LookupInstance status;
	/** AuthoringHCP */
	private ims.core.resource.people.domain.objects.Hcp authoringHCP;
	/** RecordingUser */
	private ims.core.resource.people.domain.objects.MemberOfStaff recordingUser;
	/** Recording DateTime */
	private java.util.Date recordingDateTime;
	/** Authoring DateTime */
	private java.util.Date authoringDateTime;
	/** Specialty */
	private ims.domain.lookups.LookupInstance specialty;
	/** Correspondence Status */
	private ims.domain.lookups.LookupInstance correspondenceStatus;
	/** Current Document Status */
	private ims.core.documents.domain.objects.DocumentStatus currentDocumentStatus;
	/** Document Status History
	  * Collection of ims.core.documents.domain.objects.DocumentStatus.
	  */
	private java.util.List documentStatusHistory;
	/** Date of attendance that the document relates too */
	private java.util.Date documentDate;
	/** Clinic */
	private ims.core.resource.place.domain.objects.Clinic clinic;
	/** is the Document Locked for Editing */
	private Boolean isLockedForEditing;
	/** Locked By User */
	private ims.core.resource.people.domain.objects.MemberOfStaff lockedByUser;
	/** Document Locked Date Time */
	private java.util.Date lockedOnDateTime;
	/** Responsible HCP */
	private ims.core.resource.people.domain.objects.Hcp responsibleHCP;
	/** Number Of Copies to be Printed */
	private Integer noOfCopies;
	/** Name of the file before conversion */
	private String historicalFileName;
	/** Historical Document Id */
	private Integer historicDocId;
	/** Services
	  * Collection of ims.core.clinical.domain.objects.Service.
	  */
	private java.util.List services;
	/** was the document Printed */
	private Boolean wasPrinted;
	/** Email Status */
	private ims.domain.lookups.LookupInstance emailStatus;
	/** Record triggered for MDM HL7 messaging */
	private Boolean wasTriggered;
	private Boolean copyPatientOnCorrespondence;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientDocument (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientDocument ()
    {
    	super();
    }
    public PatientDocument (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.documents.domain.objects.PatientDocument.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeofCare() {
		return episodeofCare;
	}
	public void setEpisodeofCare(ims.core.admin.domain.objects.EpisodeOfCare episodeofCare) {
		this.episodeofCare = episodeofCare;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.admin.domain.objects.Referral getReferral() {
		return referral;
	}
	public void setReferral(ims.core.admin.domain.objects.Referral referral) {
		this.referral = referral;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public ims.core.documents.domain.objects.ServerDocument getServerDocument() {
		return serverDocument;
	}
	public void setServerDocument(ims.core.documents.domain.objects.ServerDocument serverDocument) {
		this.serverDocument = serverDocument;
	}

	public ims.domain.lookups.LookupInstance getCreationType() {
		return creationType;
	}
	public void setCreationType(ims.domain.lookups.LookupInstance creationType) {
		this.creationType = creationType;
	}

	public ims.domain.lookups.LookupInstance getCategory() {
		return category;
	}
	public void setCategory(ims.domain.lookups.LookupInstance category) {
		this.category = category;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringHCP() {
		return authoringHCP;
	}
	public void setAuthoringHCP(ims.core.resource.people.domain.objects.Hcp authoringHCP) {
		this.authoringHCP = authoringHCP;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRecordingUser() {
		return recordingUser;
	}
	public void setRecordingUser(ims.core.resource.people.domain.objects.MemberOfStaff recordingUser) {
		this.recordingUser = recordingUser;
	}

	public java.util.Date getRecordingDateTime() {
		return recordingDateTime;
	}
	public void setRecordingDateTime(java.util.Date recordingDateTime) {
		this.recordingDateTime = recordingDateTime;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.domain.lookups.LookupInstance getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.domain.lookups.LookupInstance specialty) {
		this.specialty = specialty;
	}

	public ims.domain.lookups.LookupInstance getCorrespondenceStatus() {
		return correspondenceStatus;
	}
	public void setCorrespondenceStatus(ims.domain.lookups.LookupInstance correspondenceStatus) {
		this.correspondenceStatus = correspondenceStatus;
	}

	public ims.core.documents.domain.objects.DocumentStatus getCurrentDocumentStatus() {
		return currentDocumentStatus;
	}
	public void setCurrentDocumentStatus(ims.core.documents.domain.objects.DocumentStatus currentDocumentStatus) {
		this.currentDocumentStatus = currentDocumentStatus;
	}

	public java.util.List getDocumentStatusHistory() {
		if ( null == documentStatusHistory ) {
			documentStatusHistory = new java.util.ArrayList();
		}
		return documentStatusHistory;
	}
	public void setDocumentStatusHistory(java.util.List paramValue) {
		this.documentStatusHistory = paramValue;
	}

	public java.util.Date getDocumentDate() {
		return documentDate;
	}
	public void setDocumentDate(java.util.Date documentDate) {
		this.documentDate = documentDate;
	}

	public ims.core.resource.place.domain.objects.Clinic getClinic() {
		return clinic;
	}
	public void setClinic(ims.core.resource.place.domain.objects.Clinic clinic) {
		this.clinic = clinic;
	}

	public Boolean isIsLockedForEditing() {
		return isLockedForEditing;
	}
	public void setIsLockedForEditing(Boolean isLockedForEditing) {
		this.isLockedForEditing = isLockedForEditing;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getLockedByUser() {
		return lockedByUser;
	}
	public void setLockedByUser(ims.core.resource.people.domain.objects.MemberOfStaff lockedByUser) {
		this.lockedByUser = lockedByUser;
	}

	public java.util.Date getLockedOnDateTime() {
		return lockedOnDateTime;
	}
	public void setLockedOnDateTime(java.util.Date lockedOnDateTime) {
		this.lockedOnDateTime = lockedOnDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getResponsibleHCP() {
		return responsibleHCP;
	}
	public void setResponsibleHCP(ims.core.resource.people.domain.objects.Hcp responsibleHCP) {
		this.responsibleHCP = responsibleHCP;
	}

	public Integer getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(Integer noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public String getHistoricalFileName() {
		return historicalFileName;
	}
	public void setHistoricalFileName(String historicalFileName) {
		if ( null != historicalFileName && historicalFileName.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for historicalFileName. Tried to set value: "+
				historicalFileName);
		}
		this.historicalFileName = historicalFileName;
	}

	public Integer getHistoricDocId() {
		return historicDocId;
	}
	public void setHistoricDocId(Integer historicDocId) {
		this.historicDocId = historicDocId;
	}

	public java.util.List getServices() {
		if ( null == services ) {
			services = new java.util.ArrayList();
		}
		return services;
	}
	public void setServices(java.util.List paramValue) {
		this.services = paramValue;
	}

	public Boolean isWasPrinted() {
		return wasPrinted;
	}
	public void setWasPrinted(Boolean wasPrinted) {
		this.wasPrinted = wasPrinted;
	}

	public ims.domain.lookups.LookupInstance getEmailStatus() {
		return emailStatus;
	}
	public void setEmailStatus(ims.domain.lookups.LookupInstance emailStatus) {
		this.emailStatus = emailStatus;
	}

	public Boolean isWasTriggered() {
		return wasTriggered;
	}
	public void setWasTriggered(Boolean wasTriggered) {
		this.wasTriggered = wasTriggered;
	}

	public Boolean isCopyPatientOnCorrespondence() {
		return copyPatientOnCorrespondence;
	}
	public void setCopyPatientOnCorrespondence(Boolean copyPatientOnCorrespondence) {
		this.copyPatientOnCorrespondence = copyPatientOnCorrespondence;
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
		auditStr.append("\r\n*episodeofCare* :");
		if (episodeofCare != null)
		{
			auditStr.append(toShortClassName(episodeofCare));
				
		    auditStr.append(episodeofCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referral* :");
		if (referral != null)
		{
			auditStr.append(toShortClassName(referral));
				
		    auditStr.append(referral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*serverDocument* :");
		if (serverDocument != null)
		{
			auditStr.append(toShortClassName(serverDocument));
				
		    auditStr.append(serverDocument.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*creationType* :");
		if (creationType != null)
			auditStr.append(creationType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*category* :");
		if (category != null)
			auditStr.append(category.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringHCP* :");
		if (authoringHCP != null)
		{
			auditStr.append(toShortClassName(authoringHCP));
				
		    auditStr.append(authoringHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingUser* :");
		if (recordingUser != null)
		{
			auditStr.append(toShortClassName(recordingUser));
				
		    auditStr.append(recordingUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingDateTime* :");
		auditStr.append(recordingDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
			auditStr.append(specialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*correspondenceStatus* :");
		if (correspondenceStatus != null)
			auditStr.append(correspondenceStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*currentDocumentStatus* :");
		if (currentDocumentStatus != null)
		{
			auditStr.append(toShortClassName(currentDocumentStatus));
				
		    auditStr.append(currentDocumentStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*documentStatusHistory* :");
		if (documentStatusHistory != null)
		{
		int i18=0;
		for (i18=0; i18<documentStatusHistory.size(); i18++)
		{
			if (i18 > 0)
				auditStr.append(",");
			ims.core.documents.domain.objects.DocumentStatus obj = (ims.core.documents.domain.objects.DocumentStatus)documentStatusHistory.get(i18);
		    if (obj != null)
			{
				if (i18 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i18 > 0)
			auditStr.append("] " + i18);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*documentDate* :");
		auditStr.append(documentDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinic* :");
		if (clinic != null)
		{
			auditStr.append(toShortClassName(clinic));
				
		    auditStr.append(clinic.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isLockedForEditing* :");
		auditStr.append(isLockedForEditing);
	    auditStr.append("; ");
		auditStr.append("\r\n*lockedByUser* :");
		if (lockedByUser != null)
		{
			auditStr.append(toShortClassName(lockedByUser));
				
		    auditStr.append(lockedByUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*lockedOnDateTime* :");
		auditStr.append(lockedOnDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*responsibleHCP* :");
		if (responsibleHCP != null)
		{
			auditStr.append(toShortClassName(responsibleHCP));
				
		    auditStr.append(responsibleHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*noOfCopies* :");
		auditStr.append(noOfCopies);
	    auditStr.append("; ");
		auditStr.append("\r\n*historicalFileName* :");
		auditStr.append(historicalFileName);
	    auditStr.append("; ");
		auditStr.append("\r\n*historicDocId* :");
		auditStr.append(historicDocId);
	    auditStr.append("; ");
		auditStr.append("\r\n*services* :");
		if (services != null)
		{
		int i28=0;
		for (i28=0; i28<services.size(); i28++)
		{
			if (i28 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.Service obj = (ims.core.clinical.domain.objects.Service)services.get(i28);
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
		auditStr.append("\r\n*wasPrinted* :");
		auditStr.append(wasPrinted);
	    auditStr.append("; ");
		auditStr.append("\r\n*emailStatus* :");
		if (emailStatus != null)
			auditStr.append(emailStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wasTriggered* :");
		auditStr.append(wasTriggered);
	    auditStr.append("; ");
		auditStr.append("\r\n*copyPatientOnCorrespondence* :");
		auditStr.append(copyPatientOnCorrespondence);
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
		
		String keyClassName = "PatientDocument";
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
		if (this.getEpisodeofCare() != null)
		{
			sb.append("<episodeofCare>");
			sb.append(this.getEpisodeofCare().toXMLString(domMap)); 	
			sb.append("</episodeofCare>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getReferral() != null)
		{
			sb.append("<referral>");
			sb.append(this.getReferral().toXMLString(domMap)); 	
			sb.append("</referral>");		
		}
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getServerDocument() != null)
		{
			sb.append("<serverDocument>");
			sb.append(this.getServerDocument().toXMLString(domMap)); 	
			sb.append("</serverDocument>");		
		}
		if (this.getCreationType() != null)
		{
			sb.append("<creationType>");
			sb.append(this.getCreationType().toXMLString()); 
			sb.append("</creationType>");		
		}
		if (this.getCategory() != null)
		{
			sb.append("<category>");
			sb.append(this.getCategory().toXMLString()); 
			sb.append("</category>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getAuthoringHCP() != null)
		{
			sb.append("<authoringHCP>");
			sb.append(this.getAuthoringHCP().toXMLString(domMap)); 	
			sb.append("</authoringHCP>");		
		}
		if (this.getRecordingUser() != null)
		{
			sb.append("<recordingUser>");
			sb.append(this.getRecordingUser().toXMLString(domMap)); 	
			sb.append("</recordingUser>");		
		}
		if (this.getRecordingDateTime() != null)
		{
			sb.append("<recordingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRecordingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</recordingDateTime>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString()); 
			sb.append("</specialty>");		
		}
		if (this.getCorrespondenceStatus() != null)
		{
			sb.append("<correspondenceStatus>");
			sb.append(this.getCorrespondenceStatus().toXMLString()); 
			sb.append("</correspondenceStatus>");		
		}
		if (this.getCurrentDocumentStatus() != null)
		{
			sb.append("<currentDocumentStatus>");
			sb.append(this.getCurrentDocumentStatus().toXMLString(domMap)); 	
			sb.append("</currentDocumentStatus>");		
		}
		if (this.getDocumentStatusHistory() != null)
		{
			if (this.getDocumentStatusHistory().size() > 0 )
			{
			sb.append("<documentStatusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDocumentStatusHistory(), domMap));
			sb.append("</documentStatusHistory>");		
			}
		}
		if (this.getDocumentDate() != null)
		{
			sb.append("<documentDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDocumentDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</documentDate>");		
		}
		if (this.getClinic() != null)
		{
			sb.append("<clinic>");
			sb.append(this.getClinic().toXMLString(domMap)); 	
			sb.append("</clinic>");		
		}
		if (this.isIsLockedForEditing() != null)
		{
			sb.append("<isLockedForEditing>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsLockedForEditing().toString()));
			sb.append("</isLockedForEditing>");		
		}
		if (this.getLockedByUser() != null)
		{
			sb.append("<lockedByUser>");
			sb.append(this.getLockedByUser().toXMLString(domMap)); 	
			sb.append("</lockedByUser>");		
		}
		if (this.getLockedOnDateTime() != null)
		{
			sb.append("<lockedOnDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getLockedOnDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lockedOnDateTime>");		
		}
		if (this.getResponsibleHCP() != null)
		{
			sb.append("<responsibleHCP>");
			sb.append(this.getResponsibleHCP().toXMLString(domMap)); 	
			sb.append("</responsibleHCP>");		
		}
		if (this.getNoOfCopies() != null)
		{
			sb.append("<noOfCopies>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNoOfCopies().toString()));
			sb.append("</noOfCopies>");		
		}
		if (this.getHistoricalFileName() != null)
		{
			sb.append("<historicalFileName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHistoricalFileName().toString()));
			sb.append("</historicalFileName>");		
		}
		if (this.getHistoricDocId() != null)
		{
			sb.append("<historicDocId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHistoricDocId().toString()));
			sb.append("</historicDocId>");		
		}
		if (this.getServices() != null)
		{
			if (this.getServices().size() > 0 )
			{
			sb.append("<services>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getServices(), domMap));
			sb.append("</services>");		
			}
		}
		if (this.isWasPrinted() != null)
		{
			sb.append("<wasPrinted>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasPrinted().toString()));
			sb.append("</wasPrinted>");		
		}
		if (this.getEmailStatus() != null)
		{
			sb.append("<emailStatus>");
			sb.append(this.getEmailStatus().toXMLString()); 
			sb.append("</emailStatus>");		
		}
		if (this.isWasTriggered() != null)
		{
			sb.append("<wasTriggered>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasTriggered().toString()));
			sb.append("</wasTriggered>");		
		}
		if (this.isCopyPatientOnCorrespondence() != null)
		{
			sb.append("<copyPatientOnCorrespondence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCopyPatientOnCorrespondence().toString()));
			sb.append("</copyPatientOnCorrespondence>");		
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
			PatientDocument domainObject = getPatientDocumentfromXML(itemEl, factory, domMap);

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
			PatientDocument domainObject = getPatientDocumentfromXML(itemEl, factory, domMap);

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
		
	public static PatientDocument getPatientDocumentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientDocumentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientDocument getPatientDocumentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientDocument.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientDocument.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientDocument class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientDocument)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientDocument.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientDocument ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientDocument)factory.getImportedDomainObject(PatientDocument.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientDocument();
		}
		String keyClassName = "PatientDocument";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientDocument)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientDocument obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episodeofCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeofCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferral(ims.core.admin.domain.objects.Referral.getReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("serverDocument");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setServerDocument(ims.core.documents.domain.objects.ServerDocument.getServerDocumentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("creationType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCreationType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("category");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("authoringHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingDateTime");
		if(fldEl != null)
		{	
    		obj.setRecordingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("correspondenceStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCorrespondenceStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("currentDocumentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentDocumentStatus(ims.core.documents.domain.objects.DocumentStatus.getDocumentStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("documentStatusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setDocumentStatusHistory(ims.core.documents.domain.objects.DocumentStatus.fromListXMLString(fldEl, factory, obj.getDocumentStatusHistory(), domMap));
		}
		fldEl = el.element("documentDate");
		if(fldEl != null)
		{	
    		obj.setDocumentDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("clinic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinic(ims.core.resource.place.domain.objects.Clinic.getClinicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isLockedForEditing");
		if(fldEl != null)
		{	
    		obj.setIsLockedForEditing(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lockedByUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLockedByUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("lockedOnDateTime");
		if(fldEl != null)
		{	
    		obj.setLockedOnDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("responsibleHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsibleHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("noOfCopies");
		if(fldEl != null)
		{	
    		obj.setNoOfCopies(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("historicalFileName");
		if(fldEl != null)
		{	
    		obj.setHistoricalFileName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("historicDocId");
		if(fldEl != null)
		{	
    		obj.setHistoricDocId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("services");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setServices(ims.core.clinical.domain.objects.Service.fromListXMLString(fldEl, factory, obj.getServices(), domMap));
		}
		fldEl = el.element("wasPrinted");
		if(fldEl != null)
		{	
    		obj.setWasPrinted(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("emailStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEmailStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wasTriggered");
		if(fldEl != null)
		{	
    		obj.setWasTriggered(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("copyPatientOnCorrespondence");
		if(fldEl != null)
		{	
    		obj.setCopyPatientOnCorrespondence(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "documentStatusHistory"
		, "services"
		};
	}


	public void triggerMDM_T02HL7Message(ims.domain.DomainFactory factory, ims.rules.engine.RulesRuntimeEngine engine)
	{	
try 
{
	final int QueueType_PATIENTDOCUMENT = -2150;
	final int MsgEventType_T02 = -2149;

	String hqlString = "select o1_1.providerSystem from OutboundTriggers as o1_1 left join o1_1.queueType as l1_1 left join l1_1.instance as l2_1"
			+ " where(l2_1.id = -2150)";

	java.util.List<ims.core.admin.domain.objects.ProviderSystem> list = factory.find(hqlString);
	this.setWasTriggered(true);
	factory.save(this);


	for (ims.core.admin.domain.objects.ProviderSystem providerSystem : list)
	{
		ims.hl7adtout.domain.objects.PatientDocumentMessageQueue msg = new ims.hl7adtout.domain.objects.PatientDocumentMessageQueue();
		msg.setPatientDocument(this);
		msg.setProviderSystem(providerSystem);
		msg.setQueueType(factory
				.getLookupInstance(QueueType_PATIENTDOCUMENT));// QueueType_PATIENTDOCUMENT));
		msg.setMsgType(factory
				.getLookupInstance(MsgEventType_T02));
		factory.save(msg);
	}
}
catch (Exception e)
{
	throw new RuntimeException(e);
}
	}

	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String EpisodeofCare = "episodeofCare";
		public static final String CareContext = "careContext";
		public static final String ClinicalContact = "clinicalContact";
		public static final String Referral = "referral";
		public static final String Name = "name";
		public static final String ServerDocument = "serverDocument";
		public static final String CreationType = "creationType";
		public static final String Category = "category";
		public static final String Status = "status";
		public static final String AuthoringHCP = "authoringHCP";
		public static final String RecordingUser = "recordingUser";
		public static final String RecordingDateTime = "recordingDateTime";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String Specialty = "specialty";
		public static final String CorrespondenceStatus = "correspondenceStatus";
		public static final String CurrentDocumentStatus = "currentDocumentStatus";
		public static final String DocumentStatusHistory = "documentStatusHistory";
		public static final String DocumentDate = "documentDate";
		public static final String Clinic = "clinic";
		public static final String IsLockedForEditing = "isLockedForEditing";
		public static final String LockedByUser = "lockedByUser";
		public static final String LockedOnDateTime = "lockedOnDateTime";
		public static final String ResponsibleHCP = "responsibleHCP";
		public static final String NoOfCopies = "noOfCopies";
		public static final String HistoricalFileName = "historicalFileName";
		public static final String HistoricDocId = "historicDocId";
		public static final String Services = "services";
		public static final String WasPrinted = "wasPrinted";
		public static final String EmailStatus = "emailStatus";
		public static final String WasTriggered = "wasTriggered";
		public static final String CopyPatientOnCorrespondence = "copyPatientOnCorrespondence";
	}
}

