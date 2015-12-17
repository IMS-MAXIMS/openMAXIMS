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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class PatientMedication extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100014;
	private static final long serialVersionUID = 1003100014L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Medication */
	private ims.core.clinical.domain.objects.Medication medication;
	/** Free text field for other medications */
	private String otherMedicationText;
	/** Frequency Of Medication */
	private ims.domain.lookups.LookupInstance frequency;
	/** Description of difficulties taking medication */
	private String difficultiesWithMed;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** e.g GP/Patient/Notes */
	private ims.domain.lookups.LookupInstance sourceofInformation;
	/** Multiple Doses Prescribed
	  * Collection of ims.core.clinical.domain.objects.PatientMedicationDose.
	  */
	private java.util.List prescribedDoses;
	/** Date Drug Commenced */
	private java.util.Date commencedDate;
	/** CommencedByType */
	private ims.domain.lookups.LookupInstance commencedByType;
	/** HCP who Initially Commenced */
	private ims.core.resource.people.domain.objects.Hcp hcpCommenced;
	/** Medication Confirmed Flag */
	private Boolean confirmed;
	/** HCP who Confirmed */
	private ims.core.resource.people.domain.objects.Hcp confirmedBy;
	/** Date confirmed */
	private Integer confirmedDateTime;
	/** Flag - Discontinued */
	private Boolean isDiscontinued;
	/** DiscontinuedByType */
	private ims.domain.lookups.LookupInstance discontinuedByType;
	/** HCP who discontinued */
	private ims.core.resource.people.domain.objects.Hcp isDiscontinuedHcp;
	/** Date Discintinued */
	private java.util.Date isDiscontinuedDate;
	private ims.domain.lookups.LookupInstance isDiscontinuedReason;
	/** isDiscontinuedReasonText */
	private String isDiscontinuedReasonText;
	/** Flag to Indicate that this was an admission Medication */
	private Boolean isMedicationonAdmission;
	/** isDischargeMedication */
	private Boolean isDischargeMedication;
	private ims.domain.lookups.LookupInstance contextRecorded;
	/** Supplied */
	private ims.domain.lookups.LookupInstance supplied;
	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** inPossession */
	private Boolean inPossession;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** isInTTO */
	private Boolean isInTTO;
	/** NoDaysSupply */
	private Integer noDaysSupply;
	/** isCopied */
	private Boolean isCopied;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Batch Number */
	private String batchNo;
	/** ExpiryDate */
	private java.util.Date expiryDate;
	private Boolean selfMedicating;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation;
	private String comment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientMedication (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientMedication ()
    {
    	super();
    }
    public PatientMedication (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientMedication.class;
	}


	public ims.core.clinical.domain.objects.Medication getMedication() {
		return medication;
	}
	public void setMedication(ims.core.clinical.domain.objects.Medication medication) {
		this.medication = medication;
	}

	public String getOtherMedicationText() {
		return otherMedicationText;
	}
	public void setOtherMedicationText(String otherMedicationText) {
		if ( null != otherMedicationText && otherMedicationText.length() > 700 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherMedicationText. Tried to set value: "+
				otherMedicationText);
		}
		this.otherMedicationText = otherMedicationText;
	}

	public ims.domain.lookups.LookupInstance getFrequency() {
		return frequency;
	}
	public void setFrequency(ims.domain.lookups.LookupInstance frequency) {
		this.frequency = frequency;
	}

	public String getDifficultiesWithMed() {
		return difficultiesWithMed;
	}
	public void setDifficultiesWithMed(String difficultiesWithMed) {
		if ( null != difficultiesWithMed && difficultiesWithMed.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for difficultiesWithMed. Tried to set value: "+
				difficultiesWithMed);
		}
		this.difficultiesWithMed = difficultiesWithMed;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.domain.lookups.LookupInstance getSourceofInformation() {
		return sourceofInformation;
	}
	public void setSourceofInformation(ims.domain.lookups.LookupInstance sourceofInformation) {
		this.sourceofInformation = sourceofInformation;
	}

	public java.util.List getPrescribedDoses() {
		if ( null == prescribedDoses ) {
			prescribedDoses = new java.util.ArrayList();
		}
		return prescribedDoses;
	}
	public void setPrescribedDoses(java.util.List paramValue) {
		this.prescribedDoses = paramValue;
	}

	public java.util.Date getCommencedDate() {
		return commencedDate;
	}
	public void setCommencedDate(java.util.Date commencedDate) {
		this.commencedDate = commencedDate;
	}

	public ims.domain.lookups.LookupInstance getCommencedByType() {
		return commencedByType;
	}
	public void setCommencedByType(ims.domain.lookups.LookupInstance commencedByType) {
		this.commencedByType = commencedByType;
	}

	public ims.core.resource.people.domain.objects.Hcp getHcpCommenced() {
		return hcpCommenced;
	}
	public void setHcpCommenced(ims.core.resource.people.domain.objects.Hcp hcpCommenced) {
		this.hcpCommenced = hcpCommenced;
	}

	public Boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
	}

	public ims.core.resource.people.domain.objects.Hcp getConfirmedBy() {
		return confirmedBy;
	}
	public void setConfirmedBy(ims.core.resource.people.domain.objects.Hcp confirmedBy) {
		this.confirmedBy = confirmedBy;
	}

	public Integer getConfirmedDateTime() {
		return confirmedDateTime;
	}
	public void setConfirmedDateTime(Integer confirmedDateTime) {
		this.confirmedDateTime = confirmedDateTime;
	}

	public Boolean isIsDiscontinued() {
		return isDiscontinued;
	}
	public void setIsDiscontinued(Boolean isDiscontinued) {
		this.isDiscontinued = isDiscontinued;
	}

	public ims.domain.lookups.LookupInstance getDiscontinuedByType() {
		return discontinuedByType;
	}
	public void setDiscontinuedByType(ims.domain.lookups.LookupInstance discontinuedByType) {
		this.discontinuedByType = discontinuedByType;
	}

	public ims.core.resource.people.domain.objects.Hcp getIsDiscontinuedHcp() {
		return isDiscontinuedHcp;
	}
	public void setIsDiscontinuedHcp(ims.core.resource.people.domain.objects.Hcp isDiscontinuedHcp) {
		this.isDiscontinuedHcp = isDiscontinuedHcp;
	}

	public java.util.Date getIsDiscontinuedDate() {
		return isDiscontinuedDate;
	}
	public void setIsDiscontinuedDate(java.util.Date isDiscontinuedDate) {
		this.isDiscontinuedDate = isDiscontinuedDate;
	}

	public ims.domain.lookups.LookupInstance getIsDiscontinuedReason() {
		return isDiscontinuedReason;
	}
	public void setIsDiscontinuedReason(ims.domain.lookups.LookupInstance isDiscontinuedReason) {
		this.isDiscontinuedReason = isDiscontinuedReason;
	}

	public String getIsDiscontinuedReasonText() {
		return isDiscontinuedReasonText;
	}
	public void setIsDiscontinuedReasonText(String isDiscontinuedReasonText) {
		if ( null != isDiscontinuedReasonText && isDiscontinuedReasonText.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isDiscontinuedReasonText. Tried to set value: "+
				isDiscontinuedReasonText);
		}
		this.isDiscontinuedReasonText = isDiscontinuedReasonText;
	}

	public Boolean isIsMedicationonAdmission() {
		return isMedicationonAdmission;
	}
	public void setIsMedicationonAdmission(Boolean isMedicationonAdmission) {
		this.isMedicationonAdmission = isMedicationonAdmission;
	}

	public Boolean isIsDischargeMedication() {
		return isDischargeMedication;
	}
	public void setIsDischargeMedication(Boolean isDischargeMedication) {
		this.isDischargeMedication = isDischargeMedication;
	}

	public ims.domain.lookups.LookupInstance getContextRecorded() {
		return contextRecorded;
	}
	public void setContextRecorded(ims.domain.lookups.LookupInstance contextRecorded) {
		this.contextRecorded = contextRecorded;
	}

	public ims.domain.lookups.LookupInstance getSupplied() {
		return supplied;
	}
	public void setSupplied(ims.domain.lookups.LookupInstance supplied) {
		this.supplied = supplied;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public Boolean isInPossession() {
		return inPossession;
	}
	public void setInPossession(Boolean inPossession) {
		this.inPossession = inPossession;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public Boolean isIsInTTO() {
		return isInTTO;
	}
	public void setIsInTTO(Boolean isInTTO) {
		this.isInTTO = isInTTO;
	}

	public Integer getNoDaysSupply() {
		return noDaysSupply;
	}
	public void setNoDaysSupply(Integer noDaysSupply) {
		this.noDaysSupply = noDaysSupply;
	}

	public Boolean isIsCopied() {
		return isCopied;
	}
	public void setIsCopied(Boolean isCopied) {
		this.isCopied = isCopied;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		if ( null != batchNo && batchNo.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for batchNo. Tried to set value: "+
				batchNo);
		}
		this.batchNo = batchNo;
	}

	public java.util.Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(java.util.Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Boolean isSelfMedicating() {
		return selfMedicating;
	}
	public void setSelfMedicating(Boolean selfMedicating) {
		this.selfMedicating = selfMedicating;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		if ( null != comment && comment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comment. Tried to set value: "+
				comment);
		}
		this.comment = comment;
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
		
		auditStr.append("\r\n*medication* :");
		if (medication != null)
		{
			auditStr.append(toShortClassName(medication));
				
		    auditStr.append(medication.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherMedicationText* :");
		auditStr.append(otherMedicationText);
	    auditStr.append("; ");
		auditStr.append("\r\n*frequency* :");
		if (frequency != null)
			auditStr.append(frequency.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*difficultiesWithMed* :");
		auditStr.append(difficultiesWithMed);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceofInformation* :");
		if (sourceofInformation != null)
			auditStr.append(sourceofInformation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*prescribedDoses* :");
		if (prescribedDoses != null)
		{
		int i7=0;
		for (i7=0; i7<prescribedDoses.size(); i7++)
		{
			if (i7 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.PatientMedicationDose obj = (ims.core.clinical.domain.objects.PatientMedicationDose)prescribedDoses.get(i7);
		    if (obj != null)
			{
				if (i7 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*commencedDate* :");
		auditStr.append(commencedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*commencedByType* :");
		if (commencedByType != null)
			auditStr.append(commencedByType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*hcpCommenced* :");
		if (hcpCommenced != null)
		{
			auditStr.append(toShortClassName(hcpCommenced));
				
		    auditStr.append(hcpCommenced.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmed* :");
		auditStr.append(confirmed);
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedBy* :");
		if (confirmedBy != null)
		{
			auditStr.append(toShortClassName(confirmedBy));
				
		    auditStr.append(confirmedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedDateTime* :");
		auditStr.append(confirmedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*isDiscontinued* :");
		auditStr.append(isDiscontinued);
	    auditStr.append("; ");
		auditStr.append("\r\n*discontinuedByType* :");
		if (discontinuedByType != null)
			auditStr.append(discontinuedByType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isDiscontinuedHcp* :");
		if (isDiscontinuedHcp != null)
		{
			auditStr.append(toShortClassName(isDiscontinuedHcp));
				
		    auditStr.append(isDiscontinuedHcp.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isDiscontinuedDate* :");
		auditStr.append(isDiscontinuedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*isDiscontinuedReason* :");
		if (isDiscontinuedReason != null)
			auditStr.append(isDiscontinuedReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isDiscontinuedReasonText* :");
		auditStr.append(isDiscontinuedReasonText);
	    auditStr.append("; ");
		auditStr.append("\r\n*isMedicationonAdmission* :");
		auditStr.append(isMedicationonAdmission);
	    auditStr.append("; ");
		auditStr.append("\r\n*isDischargeMedication* :");
		auditStr.append(isDischargeMedication);
	    auditStr.append("; ");
		auditStr.append("\r\n*contextRecorded* :");
		if (contextRecorded != null)
			auditStr.append(contextRecorded.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*supplied* :");
		if (supplied != null)
			auditStr.append(supplied.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inPossession* :");
		auditStr.append(inPossession);
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isInTTO* :");
		auditStr.append(isInTTO);
	    auditStr.append("; ");
		auditStr.append("\r\n*noDaysSupply* :");
		auditStr.append(noDaysSupply);
	    auditStr.append("; ");
		auditStr.append("\r\n*isCopied* :");
		auditStr.append(isCopied);
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*batchNo* :");
		auditStr.append(batchNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*expiryDate* :");
		auditStr.append(expiryDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*selfMedicating* :");
		auditStr.append(selfMedicating);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
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
		
		String keyClassName = "PatientMedication";
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
		if (this.getMedication() != null)
		{
			sb.append("<medication>");
			sb.append(this.getMedication().toXMLString(domMap)); 	
			sb.append("</medication>");		
		}
		if (this.getOtherMedicationText() != null)
		{
			sb.append("<otherMedicationText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherMedicationText().toString()));
			sb.append("</otherMedicationText>");		
		}
		if (this.getFrequency() != null)
		{
			sb.append("<frequency>");
			sb.append(this.getFrequency().toXMLString()); 
			sb.append("</frequency>");		
		}
		if (this.getDifficultiesWithMed() != null)
		{
			sb.append("<difficultiesWithMed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDifficultiesWithMed().toString()));
			sb.append("</difficultiesWithMed>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getSourceofInformation() != null)
		{
			sb.append("<sourceofInformation>");
			sb.append(this.getSourceofInformation().toXMLString()); 
			sb.append("</sourceofInformation>");		
		}
		if (this.getPrescribedDoses() != null)
		{
			if (this.getPrescribedDoses().size() > 0 )
			{
			sb.append("<prescribedDoses>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPrescribedDoses(), domMap));
			sb.append("</prescribedDoses>");		
			}
		}
		if (this.getCommencedDate() != null)
		{
			sb.append("<commencedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCommencedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</commencedDate>");		
		}
		if (this.getCommencedByType() != null)
		{
			sb.append("<commencedByType>");
			sb.append(this.getCommencedByType().toXMLString()); 
			sb.append("</commencedByType>");		
		}
		if (this.getHcpCommenced() != null)
		{
			sb.append("<hcpCommenced>");
			sb.append(this.getHcpCommenced().toXMLString(domMap)); 	
			sb.append("</hcpCommenced>");		
		}
		if (this.isConfirmed() != null)
		{
			sb.append("<confirmed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isConfirmed().toString()));
			sb.append("</confirmed>");		
		}
		if (this.getConfirmedBy() != null)
		{
			sb.append("<confirmedBy>");
			sb.append(this.getConfirmedBy().toXMLString(domMap)); 	
			sb.append("</confirmedBy>");		
		}
		if (this.getConfirmedDateTime() != null)
		{
			sb.append("<confirmedDateTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getConfirmedDateTime().toString()));
			sb.append("</confirmedDateTime>");		
		}
		if (this.isIsDiscontinued() != null)
		{
			sb.append("<isDiscontinued>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDiscontinued().toString()));
			sb.append("</isDiscontinued>");		
		}
		if (this.getDiscontinuedByType() != null)
		{
			sb.append("<discontinuedByType>");
			sb.append(this.getDiscontinuedByType().toXMLString()); 
			sb.append("</discontinuedByType>");		
		}
		if (this.getIsDiscontinuedHcp() != null)
		{
			sb.append("<isDiscontinuedHcp>");
			sb.append(this.getIsDiscontinuedHcp().toXMLString(domMap)); 	
			sb.append("</isDiscontinuedHcp>");		
		}
		if (this.getIsDiscontinuedDate() != null)
		{
			sb.append("<isDiscontinuedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getIsDiscontinuedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</isDiscontinuedDate>");		
		}
		if (this.getIsDiscontinuedReason() != null)
		{
			sb.append("<isDiscontinuedReason>");
			sb.append(this.getIsDiscontinuedReason().toXMLString()); 
			sb.append("</isDiscontinuedReason>");		
		}
		if (this.getIsDiscontinuedReasonText() != null)
		{
			sb.append("<isDiscontinuedReasonText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsDiscontinuedReasonText().toString()));
			sb.append("</isDiscontinuedReasonText>");		
		}
		if (this.isIsMedicationonAdmission() != null)
		{
			sb.append("<isMedicationonAdmission>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMedicationonAdmission().toString()));
			sb.append("</isMedicationonAdmission>");		
		}
		if (this.isIsDischargeMedication() != null)
		{
			sb.append("<isDischargeMedication>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDischargeMedication().toString()));
			sb.append("</isDischargeMedication>");		
		}
		if (this.getContextRecorded() != null)
		{
			sb.append("<contextRecorded>");
			sb.append(this.getContextRecorded().toXMLString()); 
			sb.append("</contextRecorded>");		
		}
		if (this.getSupplied() != null)
		{
			sb.append("<supplied>");
			sb.append(this.getSupplied().toXMLString()); 
			sb.append("</supplied>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.isInPossession() != null)
		{
			sb.append("<inPossession>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isInPossession().toString()));
			sb.append("</inPossession>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.isIsInTTO() != null)
		{
			sb.append("<isInTTO>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsInTTO().toString()));
			sb.append("</isInTTO>");		
		}
		if (this.getNoDaysSupply() != null)
		{
			sb.append("<noDaysSupply>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNoDaysSupply().toString()));
			sb.append("</noDaysSupply>");		
		}
		if (this.isIsCopied() != null)
		{
			sb.append("<isCopied>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCopied().toString()));
			sb.append("</isCopied>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getBatchNo() != null)
		{
			sb.append("<batchNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBatchNo().toString()));
			sb.append("</batchNo>");		
		}
		if (this.getExpiryDate() != null)
		{
			sb.append("<expiryDate>");
			sb.append(new ims.framework.utils.DateTime(this.getExpiryDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</expiryDate>");		
		}
		if (this.isSelfMedicating() != null)
		{
			sb.append("<selfMedicating>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSelfMedicating().toString()));
			sb.append("</selfMedicating>");		
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
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
			PatientMedication domainObject = getPatientMedicationfromXML(itemEl, factory, domMap);

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
			PatientMedication domainObject = getPatientMedicationfromXML(itemEl, factory, domMap);

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
		
	public static PatientMedication getPatientMedicationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientMedicationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientMedication getPatientMedicationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientMedication.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientMedication.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientMedication class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientMedication)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientMedication.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientMedication ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientMedication)factory.getImportedDomainObject(PatientMedication.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientMedication();
		}
		String keyClassName = "PatientMedication";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientMedication)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientMedication obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("medication");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMedication(ims.core.clinical.domain.objects.Medication.getMedicationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("otherMedicationText");
		if(fldEl != null)
		{	
    		obj.setOtherMedicationText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("frequency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFrequency(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("difficultiesWithMed");
		if(fldEl != null)
		{	
    		obj.setDifficultiesWithMed(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sourceofInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSourceofInformation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("prescribedDoses");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPrescribedDoses(ims.core.clinical.domain.objects.PatientMedicationDose.fromListXMLString(fldEl, factory, obj.getPrescribedDoses(), domMap));
		}
		fldEl = el.element("commencedDate");
		if(fldEl != null)
		{	
    		obj.setCommencedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("commencedByType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCommencedByType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("hcpCommenced");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHcpCommenced(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("confirmed");
		if(fldEl != null)
		{	
    		obj.setConfirmed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("confirmedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConfirmedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("confirmedDateTime");
		if(fldEl != null)
		{	
    		obj.setConfirmedDateTime(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isDiscontinued");
		if(fldEl != null)
		{	
    		obj.setIsDiscontinued(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("discontinuedByType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDiscontinuedByType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isDiscontinuedHcp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setIsDiscontinuedHcp(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isDiscontinuedDate");
		if(fldEl != null)
		{	
    		obj.setIsDiscontinuedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isDiscontinuedReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIsDiscontinuedReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isDiscontinuedReasonText");
		if(fldEl != null)
		{	
    		obj.setIsDiscontinuedReasonText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isMedicationonAdmission");
		if(fldEl != null)
		{	
    		obj.setIsMedicationonAdmission(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isDischargeMedication");
		if(fldEl != null)
		{	
    		obj.setIsDischargeMedication(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("contextRecorded");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setContextRecorded(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("supplied");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSupplied(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("inPossession");
		if(fldEl != null)
		{	
    		obj.setInPossession(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isInTTO");
		if(fldEl != null)
		{	
    		obj.setIsInTTO(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noDaysSupply");
		if(fldEl != null)
		{	
    		obj.setNoDaysSupply(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isCopied");
		if(fldEl != null)
		{	
    		obj.setIsCopied(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("batchNo");
		if(fldEl != null)
		{	
    		obj.setBatchNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("expiryDate");
		if(fldEl != null)
		{	
    		obj.setExpiryDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("selfMedicating");
		if(fldEl != null)
		{	
    		obj.setSelfMedicating(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "prescribedDoses"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Medication = "medication";
		public static final String OtherMedicationText = "otherMedicationText";
		public static final String Frequency = "frequency";
		public static final String DifficultiesWithMed = "difficultiesWithMed";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String SourceofInformation = "sourceofInformation";
		public static final String PrescribedDoses = "prescribedDoses";
		public static final String CommencedDate = "commencedDate";
		public static final String CommencedByType = "commencedByType";
		public static final String HcpCommenced = "hcpCommenced";
		public static final String Confirmed = "confirmed";
		public static final String ConfirmedBy = "confirmedBy";
		public static final String ConfirmedDateTime = "confirmedDateTime";
		public static final String IsDiscontinued = "isDiscontinued";
		public static final String DiscontinuedByType = "discontinuedByType";
		public static final String IsDiscontinuedHcp = "isDiscontinuedHcp";
		public static final String IsDiscontinuedDate = "isDiscontinuedDate";
		public static final String IsDiscontinuedReason = "isDiscontinuedReason";
		public static final String IsDiscontinuedReasonText = "isDiscontinuedReasonText";
		public static final String IsMedicationonAdmission = "isMedicationonAdmission";
		public static final String IsDischargeMedication = "isDischargeMedication";
		public static final String ContextRecorded = "contextRecorded";
		public static final String Supplied = "supplied";
		public static final String ClinicalContact = "clinicalContact";
		public static final String InPossession = "inPossession";
		public static final String CareContext = "careContext";
		public static final String IsInTTO = "isInTTO";
		public static final String NoDaysSupply = "noDaysSupply";
		public static final String IsCopied = "isCopied";
		public static final String Patient = "patient";
		public static final String BatchNo = "batchNo";
		public static final String ExpiryDate = "expiryDate";
		public static final String SelfMedicating = "selfMedicating";
		public static final String RecordingInformation = "recordingInformation";
		public static final String Comment = "comment";
	}
}

