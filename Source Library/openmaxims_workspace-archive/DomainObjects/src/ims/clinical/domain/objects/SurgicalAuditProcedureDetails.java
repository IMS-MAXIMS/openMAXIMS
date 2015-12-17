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
 * @author Neil McAnaspie
 * Generated.
 */


public class SurgicalAuditProcedureDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100103;
	private static final long serialVersionUID = 1072100103L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Anaesthetist Not Required */
	private Boolean anaesthetistNotRequired;
	/** Anaesthetists
	  * Collection of ims.core.resource.people.domain.objects.Medic.
	  */
	private java.util.List anaesthetists;
	/** Anaesthetist Assistants Not Required */
	private Boolean anaesthetistAssistNotRequired;
	/** Anaesthetist Assisted By 
	  * Collection of ims.core.resource.people.domain.objects.Medic.
	  */
	private java.util.List anaesthetistAssistedBy;
	/** Operation performed by
	  * Collection of ims.core.resource.people.domain.objects.Medic.
	  */
	private java.util.List opPerformedBy;
	/** Consultant Assisted By
	  * Collection of ims.core.resource.people.domain.objects.Medic.
	  */
	private java.util.List consultantAssistedBy;
	/** Radiographers
	  * Collection of ims.core.resource.people.domain.objects.Hcp.
	  */
	private java.util.List radiographers;
	/** Anaesthetic Nurse
	  * Collection of ims.core.resource.people.domain.objects.Nurse.
	  */
	private java.util.List anaestheticNurse;
	/** Locum Anaesthetic Nurse(s) */
	private String locumAnaestNurse;
	/** Scrub Nurse 
	  * Collection of ims.core.resource.people.domain.objects.Nurse.
	  */
	private java.util.List scrubNurse;
	/** Locum Scrub Nurse(s) */
	private String locumScrubNurse;
	/** Circulating Nurse
	  * Collection of ims.core.resource.people.domain.objects.Nurse.
	  */
	private java.util.List circulatingNurse;
	/** Locum Circulating Nurse(s) */
	private String locumCirculatingNurse;
	/** Other */
	private String other;
	/** Surgical Check List Performed  */
	private ims.domain.lookups.LookupInstance surgicalCheckListPerformed;
	/** Check List Not Performed Reason */
	private ims.domain.lookups.LookupInstance checkListNotPerformedReason;
	/** Anaesthetic Type Used */
	private ims.domain.lookups.LookupInstance anaestheticUsed;
	/** Anaesthetic Used Comment */
	private String anaestheticUsedComment;
	/** Enter Operating Theatre */
	private java.util.Date enterOpTheatreTime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SurgicalAuditProcedureDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SurgicalAuditProcedureDetails ()
    {
    	super();
    }
    public SurgicalAuditProcedureDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.SurgicalAuditProcedureDetails.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public Boolean isAnaesthetistNotRequired() {
		return anaesthetistNotRequired;
	}
	public void setAnaesthetistNotRequired(Boolean anaesthetistNotRequired) {
		this.anaesthetistNotRequired = anaesthetistNotRequired;
	}

	public java.util.List getAnaesthetists() {
		if ( null == anaesthetists ) {
			anaesthetists = new java.util.ArrayList();
		}
		return anaesthetists;
	}
	public void setAnaesthetists(java.util.List paramValue) {
		this.anaesthetists = paramValue;
	}

	public Boolean isAnaesthetistAssistNotRequired() {
		return anaesthetistAssistNotRequired;
	}
	public void setAnaesthetistAssistNotRequired(Boolean anaesthetistAssistNotRequired) {
		this.anaesthetistAssistNotRequired = anaesthetistAssistNotRequired;
	}

	public java.util.List getAnaesthetistAssistedBy() {
		if ( null == anaesthetistAssistedBy ) {
			anaesthetistAssistedBy = new java.util.ArrayList();
		}
		return anaesthetistAssistedBy;
	}
	public void setAnaesthetistAssistedBy(java.util.List paramValue) {
		this.anaesthetistAssistedBy = paramValue;
	}

	public java.util.List getOpPerformedBy() {
		if ( null == opPerformedBy ) {
			opPerformedBy = new java.util.ArrayList();
		}
		return opPerformedBy;
	}
	public void setOpPerformedBy(java.util.List paramValue) {
		this.opPerformedBy = paramValue;
	}

	public java.util.List getConsultantAssistedBy() {
		if ( null == consultantAssistedBy ) {
			consultantAssistedBy = new java.util.ArrayList();
		}
		return consultantAssistedBy;
	}
	public void setConsultantAssistedBy(java.util.List paramValue) {
		this.consultantAssistedBy = paramValue;
	}

	public java.util.List getRadiographers() {
		if ( null == radiographers ) {
			radiographers = new java.util.ArrayList();
		}
		return radiographers;
	}
	public void setRadiographers(java.util.List paramValue) {
		this.radiographers = paramValue;
	}

	public java.util.List getAnaestheticNurse() {
		if ( null == anaestheticNurse ) {
			anaestheticNurse = new java.util.ArrayList();
		}
		return anaestheticNurse;
	}
	public void setAnaestheticNurse(java.util.List paramValue) {
		this.anaestheticNurse = paramValue;
	}

	public String getLocumAnaestNurse() {
		return locumAnaestNurse;
	}
	public void setLocumAnaestNurse(String locumAnaestNurse) {
		if ( null != locumAnaestNurse && locumAnaestNurse.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for locumAnaestNurse. Tried to set value: "+
				locumAnaestNurse);
		}
		this.locumAnaestNurse = locumAnaestNurse;
	}

	public java.util.List getScrubNurse() {
		if ( null == scrubNurse ) {
			scrubNurse = new java.util.ArrayList();
		}
		return scrubNurse;
	}
	public void setScrubNurse(java.util.List paramValue) {
		this.scrubNurse = paramValue;
	}

	public String getLocumScrubNurse() {
		return locumScrubNurse;
	}
	public void setLocumScrubNurse(String locumScrubNurse) {
		if ( null != locumScrubNurse && locumScrubNurse.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for locumScrubNurse. Tried to set value: "+
				locumScrubNurse);
		}
		this.locumScrubNurse = locumScrubNurse;
	}

	public java.util.List getCirculatingNurse() {
		if ( null == circulatingNurse ) {
			circulatingNurse = new java.util.ArrayList();
		}
		return circulatingNurse;
	}
	public void setCirculatingNurse(java.util.List paramValue) {
		this.circulatingNurse = paramValue;
	}

	public String getLocumCirculatingNurse() {
		return locumCirculatingNurse;
	}
	public void setLocumCirculatingNurse(String locumCirculatingNurse) {
		if ( null != locumCirculatingNurse && locumCirculatingNurse.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for locumCirculatingNurse. Tried to set value: "+
				locumCirculatingNurse);
		}
		this.locumCirculatingNurse = locumCirculatingNurse;
	}

	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		if ( null != other && other.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for other. Tried to set value: "+
				other);
		}
		this.other = other;
	}

	public ims.domain.lookups.LookupInstance getSurgicalCheckListPerformed() {
		return surgicalCheckListPerformed;
	}
	public void setSurgicalCheckListPerformed(ims.domain.lookups.LookupInstance surgicalCheckListPerformed) {
		this.surgicalCheckListPerformed = surgicalCheckListPerformed;
	}

	public ims.domain.lookups.LookupInstance getCheckListNotPerformedReason() {
		return checkListNotPerformedReason;
	}
	public void setCheckListNotPerformedReason(ims.domain.lookups.LookupInstance checkListNotPerformedReason) {
		this.checkListNotPerformedReason = checkListNotPerformedReason;
	}

	public ims.domain.lookups.LookupInstance getAnaestheticUsed() {
		return anaestheticUsed;
	}
	public void setAnaestheticUsed(ims.domain.lookups.LookupInstance anaestheticUsed) {
		this.anaestheticUsed = anaestheticUsed;
	}

	public String getAnaestheticUsedComment() {
		return anaestheticUsedComment;
	}
	public void setAnaestheticUsedComment(String anaestheticUsedComment) {
		if ( null != anaestheticUsedComment && anaestheticUsedComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for anaestheticUsedComment. Tried to set value: "+
				anaestheticUsedComment);
		}
		this.anaestheticUsedComment = anaestheticUsedComment;
	}

	public java.util.Date getEnterOpTheatreTime() {
		return enterOpTheatreTime;
	}
	public void setEnterOpTheatreTime(java.util.Date enterOpTheatreTime) {
		this.enterOpTheatreTime = enterOpTheatreTime;
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
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthetistNotRequired* :");
		auditStr.append(anaesthetistNotRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthetists* :");
		if (anaesthetists != null)
		{
		int i5=0;
		for (i5=0; i5<anaesthetists.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.core.resource.people.domain.objects.Medic obj = (ims.core.resource.people.domain.objects.Medic)anaesthetists.get(i5);
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
		auditStr.append("\r\n*anaesthetistAssistNotRequired* :");
		auditStr.append(anaesthetistAssistNotRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthetistAssistedBy* :");
		if (anaesthetistAssistedBy != null)
		{
		int i7=0;
		for (i7=0; i7<anaesthetistAssistedBy.size(); i7++)
		{
			if (i7 > 0)
				auditStr.append(",");
			ims.core.resource.people.domain.objects.Medic obj = (ims.core.resource.people.domain.objects.Medic)anaesthetistAssistedBy.get(i7);
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
		auditStr.append("\r\n*opPerformedBy* :");
		if (opPerformedBy != null)
		{
		int i8=0;
		for (i8=0; i8<opPerformedBy.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.core.resource.people.domain.objects.Medic obj = (ims.core.resource.people.domain.objects.Medic)opPerformedBy.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*consultantAssistedBy* :");
		if (consultantAssistedBy != null)
		{
		int i9=0;
		for (i9=0; i9<consultantAssistedBy.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.core.resource.people.domain.objects.Medic obj = (ims.core.resource.people.domain.objects.Medic)consultantAssistedBy.get(i9);
		    if (obj != null)
			{
				if (i9 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*radiographers* :");
		if (radiographers != null)
		{
		int i10=0;
		for (i10=0; i10<radiographers.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.core.resource.people.domain.objects.Hcp obj = (ims.core.resource.people.domain.objects.Hcp)radiographers.get(i10);
		    if (obj != null)
			{
				if (i10 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticNurse* :");
		if (anaestheticNurse != null)
		{
		int i11=0;
		for (i11=0; i11<anaestheticNurse.size(); i11++)
		{
			if (i11 > 0)
				auditStr.append(",");
			ims.core.resource.people.domain.objects.Nurse obj = (ims.core.resource.people.domain.objects.Nurse)anaestheticNurse.get(i11);
		    if (obj != null)
			{
				if (i11 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*locumAnaestNurse* :");
		auditStr.append(locumAnaestNurse);
	    auditStr.append("; ");
		auditStr.append("\r\n*scrubNurse* :");
		if (scrubNurse != null)
		{
		int i13=0;
		for (i13=0; i13<scrubNurse.size(); i13++)
		{
			if (i13 > 0)
				auditStr.append(",");
			ims.core.resource.people.domain.objects.Nurse obj = (ims.core.resource.people.domain.objects.Nurse)scrubNurse.get(i13);
		    if (obj != null)
			{
				if (i13 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*locumScrubNurse* :");
		auditStr.append(locumScrubNurse);
	    auditStr.append("; ");
		auditStr.append("\r\n*circulatingNurse* :");
		if (circulatingNurse != null)
		{
		int i15=0;
		for (i15=0; i15<circulatingNurse.size(); i15++)
		{
			if (i15 > 0)
				auditStr.append(",");
			ims.core.resource.people.domain.objects.Nurse obj = (ims.core.resource.people.domain.objects.Nurse)circulatingNurse.get(i15);
		    if (obj != null)
			{
				if (i15 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i15 > 0)
			auditStr.append("] " + i15);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*locumCirculatingNurse* :");
		auditStr.append(locumCirculatingNurse);
	    auditStr.append("; ");
		auditStr.append("\r\n*other* :");
		auditStr.append(other);
	    auditStr.append("; ");
		auditStr.append("\r\n*surgicalCheckListPerformed* :");
		if (surgicalCheckListPerformed != null)
			auditStr.append(surgicalCheckListPerformed.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*checkListNotPerformedReason* :");
		if (checkListNotPerformedReason != null)
			auditStr.append(checkListNotPerformedReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticUsed* :");
		if (anaestheticUsed != null)
			auditStr.append(anaestheticUsed.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticUsedComment* :");
		auditStr.append(anaestheticUsedComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*enterOpTheatreTime* :");
		auditStr.append(enterOpTheatreTime);
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
		
		String keyClassName = "SurgicalAuditProcedureDetails";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.isAnaesthetistNotRequired() != null)
		{
			sb.append("<anaesthetistNotRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAnaesthetistNotRequired().toString()));
			sb.append("</anaesthetistNotRequired>");		
		}
		if (this.getAnaesthetists() != null)
		{
			if (this.getAnaesthetists().size() > 0 )
			{
			sb.append("<anaesthetists>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAnaesthetists(), domMap));
			sb.append("</anaesthetists>");		
			}
		}
		if (this.isAnaesthetistAssistNotRequired() != null)
		{
			sb.append("<anaesthetistAssistNotRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAnaesthetistAssistNotRequired().toString()));
			sb.append("</anaesthetistAssistNotRequired>");		
		}
		if (this.getAnaesthetistAssistedBy() != null)
		{
			if (this.getAnaesthetistAssistedBy().size() > 0 )
			{
			sb.append("<anaesthetistAssistedBy>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAnaesthetistAssistedBy(), domMap));
			sb.append("</anaesthetistAssistedBy>");		
			}
		}
		if (this.getOpPerformedBy() != null)
		{
			if (this.getOpPerformedBy().size() > 0 )
			{
			sb.append("<opPerformedBy>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOpPerformedBy(), domMap));
			sb.append("</opPerformedBy>");		
			}
		}
		if (this.getConsultantAssistedBy() != null)
		{
			if (this.getConsultantAssistedBy().size() > 0 )
			{
			sb.append("<consultantAssistedBy>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getConsultantAssistedBy(), domMap));
			sb.append("</consultantAssistedBy>");		
			}
		}
		if (this.getRadiographers() != null)
		{
			if (this.getRadiographers().size() > 0 )
			{
			sb.append("<radiographers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getRadiographers(), domMap));
			sb.append("</radiographers>");		
			}
		}
		if (this.getAnaestheticNurse() != null)
		{
			if (this.getAnaestheticNurse().size() > 0 )
			{
			sb.append("<anaestheticNurse>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAnaestheticNurse(), domMap));
			sb.append("</anaestheticNurse>");		
			}
		}
		if (this.getLocumAnaestNurse() != null)
		{
			sb.append("<locumAnaestNurse>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLocumAnaestNurse().toString()));
			sb.append("</locumAnaestNurse>");		
		}
		if (this.getScrubNurse() != null)
		{
			if (this.getScrubNurse().size() > 0 )
			{
			sb.append("<scrubNurse>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getScrubNurse(), domMap));
			sb.append("</scrubNurse>");		
			}
		}
		if (this.getLocumScrubNurse() != null)
		{
			sb.append("<locumScrubNurse>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLocumScrubNurse().toString()));
			sb.append("</locumScrubNurse>");		
		}
		if (this.getCirculatingNurse() != null)
		{
			if (this.getCirculatingNurse().size() > 0 )
			{
			sb.append("<circulatingNurse>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCirculatingNurse(), domMap));
			sb.append("</circulatingNurse>");		
			}
		}
		if (this.getLocumCirculatingNurse() != null)
		{
			sb.append("<locumCirculatingNurse>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLocumCirculatingNurse().toString()));
			sb.append("</locumCirculatingNurse>");		
		}
		if (this.getOther() != null)
		{
			sb.append("<other>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOther().toString()));
			sb.append("</other>");		
		}
		if (this.getSurgicalCheckListPerformed() != null)
		{
			sb.append("<surgicalCheckListPerformed>");
			sb.append(this.getSurgicalCheckListPerformed().toXMLString()); 
			sb.append("</surgicalCheckListPerformed>");		
		}
		if (this.getCheckListNotPerformedReason() != null)
		{
			sb.append("<checkListNotPerformedReason>");
			sb.append(this.getCheckListNotPerformedReason().toXMLString()); 
			sb.append("</checkListNotPerformedReason>");		
		}
		if (this.getAnaestheticUsed() != null)
		{
			sb.append("<anaestheticUsed>");
			sb.append(this.getAnaestheticUsed().toXMLString()); 
			sb.append("</anaestheticUsed>");		
		}
		if (this.getAnaestheticUsedComment() != null)
		{
			sb.append("<anaestheticUsedComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnaestheticUsedComment().toString()));
			sb.append("</anaestheticUsedComment>");		
		}
		if (this.getEnterOpTheatreTime() != null)
		{
			sb.append("<enterOpTheatreTime>");
			sb.append(new ims.framework.utils.DateTime(this.getEnterOpTheatreTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</enterOpTheatreTime>");		
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
			SurgicalAuditProcedureDetails domainObject = getSurgicalAuditProcedureDetailsfromXML(itemEl, factory, domMap);

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
			SurgicalAuditProcedureDetails domainObject = getSurgicalAuditProcedureDetailsfromXML(itemEl, factory, domMap);

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
		
	public static SurgicalAuditProcedureDetails getSurgicalAuditProcedureDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSurgicalAuditProcedureDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SurgicalAuditProcedureDetails getSurgicalAuditProcedureDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SurgicalAuditProcedureDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SurgicalAuditProcedureDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SurgicalAuditProcedureDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SurgicalAuditProcedureDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SurgicalAuditProcedureDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SurgicalAuditProcedureDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SurgicalAuditProcedureDetails)factory.getImportedDomainObject(SurgicalAuditProcedureDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SurgicalAuditProcedureDetails();
		}
		String keyClassName = "SurgicalAuditProcedureDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SurgicalAuditProcedureDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SurgicalAuditProcedureDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("anaesthetistNotRequired");
		if(fldEl != null)
		{	
    		obj.setAnaesthetistNotRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anaesthetists");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAnaesthetists(ims.core.resource.people.domain.objects.Medic.fromListXMLString(fldEl, factory, obj.getAnaesthetists(), domMap));
		}
		fldEl = el.element("anaesthetistAssistNotRequired");
		if(fldEl != null)
		{	
    		obj.setAnaesthetistAssistNotRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anaesthetistAssistedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAnaesthetistAssistedBy(ims.core.resource.people.domain.objects.Medic.fromListXMLString(fldEl, factory, obj.getAnaesthetistAssistedBy(), domMap));
		}
		fldEl = el.element("opPerformedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOpPerformedBy(ims.core.resource.people.domain.objects.Medic.fromListXMLString(fldEl, factory, obj.getOpPerformedBy(), domMap));
		}
		fldEl = el.element("consultantAssistedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setConsultantAssistedBy(ims.core.resource.people.domain.objects.Medic.fromListXMLString(fldEl, factory, obj.getConsultantAssistedBy(), domMap));
		}
		fldEl = el.element("radiographers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setRadiographers(ims.core.resource.people.domain.objects.Hcp.fromListXMLString(fldEl, factory, obj.getRadiographers(), domMap));
		}
		fldEl = el.element("anaestheticNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAnaestheticNurse(ims.core.resource.people.domain.objects.Nurse.fromListXMLString(fldEl, factory, obj.getAnaestheticNurse(), domMap));
		}
		fldEl = el.element("locumAnaestNurse");
		if(fldEl != null)
		{	
    		obj.setLocumAnaestNurse(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("scrubNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setScrubNurse(ims.core.resource.people.domain.objects.Nurse.fromListXMLString(fldEl, factory, obj.getScrubNurse(), domMap));
		}
		fldEl = el.element("locumScrubNurse");
		if(fldEl != null)
		{	
    		obj.setLocumScrubNurse(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("circulatingNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCirculatingNurse(ims.core.resource.people.domain.objects.Nurse.fromListXMLString(fldEl, factory, obj.getCirculatingNurse(), domMap));
		}
		fldEl = el.element("locumCirculatingNurse");
		if(fldEl != null)
		{	
    		obj.setLocumCirculatingNurse(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("other");
		if(fldEl != null)
		{	
    		obj.setOther(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("surgicalCheckListPerformed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSurgicalCheckListPerformed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("checkListNotPerformedReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCheckListNotPerformedReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anaestheticUsed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnaestheticUsed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anaestheticUsedComment");
		if(fldEl != null)
		{	
    		obj.setAnaestheticUsedComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("enterOpTheatreTime");
		if(fldEl != null)
		{	
    		obj.setEnterOpTheatreTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "anaesthetists"
		, "anaesthetistAssistedBy"
		, "opPerformedBy"
		, "consultantAssistedBy"
		, "radiographers"
		, "anaestheticNurse"
		, "scrubNurse"
		, "circulatingNurse"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String AnaesthetistNotRequired = "anaesthetistNotRequired";
		public static final String Anaesthetists = "anaesthetists";
		public static final String AnaesthetistAssistNotRequired = "anaesthetistAssistNotRequired";
		public static final String AnaesthetistAssistedBy = "anaesthetistAssistedBy";
		public static final String OpPerformedBy = "opPerformedBy";
		public static final String ConsultantAssistedBy = "consultantAssistedBy";
		public static final String Radiographers = "radiographers";
		public static final String AnaestheticNurse = "anaestheticNurse";
		public static final String LocumAnaestNurse = "locumAnaestNurse";
		public static final String ScrubNurse = "scrubNurse";
		public static final String LocumScrubNurse = "locumScrubNurse";
		public static final String CirculatingNurse = "circulatingNurse";
		public static final String LocumCirculatingNurse = "locumCirculatingNurse";
		public static final String Other = "other";
		public static final String SurgicalCheckListPerformed = "surgicalCheckListPerformed";
		public static final String CheckListNotPerformedReason = "checkListNotPerformedReason";
		public static final String AnaestheticUsed = "anaestheticUsed";
		public static final String AnaestheticUsedComment = "anaestheticUsedComment";
		public static final String EnterOpTheatreTime = "enterOpTheatreTime";
	}
}

