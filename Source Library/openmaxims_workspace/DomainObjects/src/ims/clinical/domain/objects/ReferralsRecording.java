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


public class ReferralsRecording extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100062;
	private static final long serialVersionUID = 1072100062L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Authoring Information - HCP and DateTime */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInfo;
	/** CareSpell */
	private ims.core.admin.domain.objects.CareSpell careSpell;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Referral Category */
	private ims.domain.lookups.LookupInstance referralCategory;
	/** Primary Preceeding */
	private ims.domain.lookups.LookupInstance primaryPreceeding;
	/** Referral Type */
	private ims.domain.lookups.LookupInstance referralType;
	/** Referral Source */
	private ims.domain.lookups.LookupInstance referralSource;
	/** Referring Organisation Code (Hospital/GP Practice) */
	private ims.core.resource.place.domain.objects.Organisation refOrgaCode;
	/** Referred By (Consultant) */
	private ims.core.resource.people.domain.objects.Hcp referredBy;
	/** Referred By (GP) */
	private ims.core.resource.people.domain.objects.Gp referredByGP;
	/** Referred to HCP */
	private ims.core.resource.people.domain.objects.MemberOfStaff referralHCP;
	/** Supplied Referral Professional */
	private ims.core.clinical.domain.objects.ReferralProfessionalDetail suppliedReferralProfessional;
	/** Date Sent */
	private java.util.Date dateSent;
	/** Date Received */
	private java.util.Date dateReceived;
	/** DateFirstSeen */
	private java.util.Date dateFirstSeen;
	/** Details */
	private String details;
	/** Referred to HCP's Location */
	private ims.core.resource.place.domain.objects.Location referredtoLocation;
	/** ReferralStatus */
	private ims.domain.lookups.LookupInstance referralStatus;
	/** ReferralPriority */
	private ims.domain.lookups.LookupInstance referralPriority;
	/** ReasonForReferral */
	private ims.domain.lookups.LookupInstance reasonForReferral;
	/** Specialty Function Code */
	private ims.domain.lookups.LookupInstance specialtyFunctionCode;
	/** UrgentCancerReferralType */
	private ims.domain.lookups.LookupInstance urgentCancerReferralType;
	/** CancerStatus */
	private ims.domain.lookups.LookupInstance cancerStatus;
	/** PreceedingReferrals
	  * Collection of ims.clinical.domain.objects.ReferralsRecording.
	  */
	private java.util.Set preceedingReferrals;
	/** DelayReasonGPUrgentReferral */
	private ims.domain.lookups.LookupInstance delayReasonGPUrgentReferral;
	/** DelayReasonText */
	private String delayReasonText;
	/** RecordingMOS */
	private ims.core.resource.people.domain.objects.MemberOfStaff recordingMOS;
	/** ReasonForReferralText */
	private String reasonForReferralText;
	/** Discipline */
	private ims.domain.lookups.LookupInstance discipline;
	/** Supplied Referral HCP Details */
	private ims.clinical.domain.objects.SuppliedReferralDetails suppliedReferralDetails;
	/** Patient Assessment */
	private ims.assessment.instantiation.domain.objects.PatientAssessment assessment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ReferralsRecording (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ReferralsRecording ()
    {
    	super();
    }
    public ReferralsRecording (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.ReferralsRecording.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInfo() {
		return authoringInfo;
	}
	public void setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation authoringInfo) {
		this.authoringInfo = authoringInfo;
	}

	public ims.core.admin.domain.objects.CareSpell getCareSpell() {
		return careSpell;
	}
	public void setCareSpell(ims.core.admin.domain.objects.CareSpell careSpell) {
		this.careSpell = careSpell;
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

	public ims.domain.lookups.LookupInstance getReferralCategory() {
		return referralCategory;
	}
	public void setReferralCategory(ims.domain.lookups.LookupInstance referralCategory) {
		this.referralCategory = referralCategory;
	}

	public ims.domain.lookups.LookupInstance getPrimaryPreceeding() {
		return primaryPreceeding;
	}
	public void setPrimaryPreceeding(ims.domain.lookups.LookupInstance primaryPreceeding) {
		this.primaryPreceeding = primaryPreceeding;
	}

	public ims.domain.lookups.LookupInstance getReferralType() {
		return referralType;
	}
	public void setReferralType(ims.domain.lookups.LookupInstance referralType) {
		this.referralType = referralType;
	}

	public ims.domain.lookups.LookupInstance getReferralSource() {
		return referralSource;
	}
	public void setReferralSource(ims.domain.lookups.LookupInstance referralSource) {
		this.referralSource = referralSource;
	}

	public ims.core.resource.place.domain.objects.Organisation getRefOrgaCode() {
		return refOrgaCode;
	}
	public void setRefOrgaCode(ims.core.resource.place.domain.objects.Organisation refOrgaCode) {
		this.refOrgaCode = refOrgaCode;
	}

	public ims.core.resource.people.domain.objects.Hcp getReferredBy() {
		return referredBy;
	}
	public void setReferredBy(ims.core.resource.people.domain.objects.Hcp referredBy) {
		this.referredBy = referredBy;
	}

	public ims.core.resource.people.domain.objects.Gp getReferredByGP() {
		return referredByGP;
	}
	public void setReferredByGP(ims.core.resource.people.domain.objects.Gp referredByGP) {
		this.referredByGP = referredByGP;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getReferralHCP() {
		return referralHCP;
	}
	public void setReferralHCP(ims.core.resource.people.domain.objects.MemberOfStaff referralHCP) {
		this.referralHCP = referralHCP;
	}

	public ims.core.clinical.domain.objects.ReferralProfessionalDetail getSuppliedReferralProfessional() {
		return suppliedReferralProfessional;
	}
	public void setSuppliedReferralProfessional(ims.core.clinical.domain.objects.ReferralProfessionalDetail suppliedReferralProfessional) {
		this.suppliedReferralProfessional = suppliedReferralProfessional;
	}

	public java.util.Date getDateSent() {
		return dateSent;
	}
	public void setDateSent(java.util.Date dateSent) {
		this.dateSent = dateSent;
	}

	public java.util.Date getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(java.util.Date dateReceived) {
		this.dateReceived = dateReceived;
	}

	public java.util.Date getDateFirstSeen() {
		return dateFirstSeen;
	}
	public void setDateFirstSeen(java.util.Date dateFirstSeen) {
		this.dateFirstSeen = dateFirstSeen;
	}

	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		if ( null != details && details.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for details. Tried to set value: "+
				details);
		}
		this.details = details;
	}

	public ims.core.resource.place.domain.objects.Location getReferredtoLocation() {
		return referredtoLocation;
	}
	public void setReferredtoLocation(ims.core.resource.place.domain.objects.Location referredtoLocation) {
		this.referredtoLocation = referredtoLocation;
	}

	public ims.domain.lookups.LookupInstance getReferralStatus() {
		return referralStatus;
	}
	public void setReferralStatus(ims.domain.lookups.LookupInstance referralStatus) {
		this.referralStatus = referralStatus;
	}

	public ims.domain.lookups.LookupInstance getReferralPriority() {
		return referralPriority;
	}
	public void setReferralPriority(ims.domain.lookups.LookupInstance referralPriority) {
		this.referralPriority = referralPriority;
	}

	public ims.domain.lookups.LookupInstance getReasonForReferral() {
		return reasonForReferral;
	}
	public void setReasonForReferral(ims.domain.lookups.LookupInstance reasonForReferral) {
		this.reasonForReferral = reasonForReferral;
	}

	public ims.domain.lookups.LookupInstance getSpecialtyFunctionCode() {
		return specialtyFunctionCode;
	}
	public void setSpecialtyFunctionCode(ims.domain.lookups.LookupInstance specialtyFunctionCode) {
		this.specialtyFunctionCode = specialtyFunctionCode;
	}

	public ims.domain.lookups.LookupInstance getUrgentCancerReferralType() {
		return urgentCancerReferralType;
	}
	public void setUrgentCancerReferralType(ims.domain.lookups.LookupInstance urgentCancerReferralType) {
		this.urgentCancerReferralType = urgentCancerReferralType;
	}

	public ims.domain.lookups.LookupInstance getCancerStatus() {
		return cancerStatus;
	}
	public void setCancerStatus(ims.domain.lookups.LookupInstance cancerStatus) {
		this.cancerStatus = cancerStatus;
	}

	public java.util.Set getPreceedingReferrals() {
		if ( null == preceedingReferrals ) {
			preceedingReferrals = new java.util.HashSet();
		}
		return preceedingReferrals;
	}
	public void setPreceedingReferrals(java.util.Set paramValue) {
		this.preceedingReferrals = paramValue;
	}

	public ims.domain.lookups.LookupInstance getDelayReasonGPUrgentReferral() {
		return delayReasonGPUrgentReferral;
	}
	public void setDelayReasonGPUrgentReferral(ims.domain.lookups.LookupInstance delayReasonGPUrgentReferral) {
		this.delayReasonGPUrgentReferral = delayReasonGPUrgentReferral;
	}

	public String getDelayReasonText() {
		return delayReasonText;
	}
	public void setDelayReasonText(String delayReasonText) {
		if ( null != delayReasonText && delayReasonText.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for delayReasonText. Tried to set value: "+
				delayReasonText);
		}
		this.delayReasonText = delayReasonText;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRecordingMOS() {
		return recordingMOS;
	}
	public void setRecordingMOS(ims.core.resource.people.domain.objects.MemberOfStaff recordingMOS) {
		this.recordingMOS = recordingMOS;
	}

	public String getReasonForReferralText() {
		return reasonForReferralText;
	}
	public void setReasonForReferralText(String reasonForReferralText) {
		if ( null != reasonForReferralText && reasonForReferralText.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonForReferralText. Tried to set value: "+
				reasonForReferralText);
		}
		this.reasonForReferralText = reasonForReferralText;
	}

	public ims.domain.lookups.LookupInstance getDiscipline() {
		return discipline;
	}
	public void setDiscipline(ims.domain.lookups.LookupInstance discipline) {
		this.discipline = discipline;
	}

	public ims.clinical.domain.objects.SuppliedReferralDetails getSuppliedReferralDetails() {
		return suppliedReferralDetails;
	}
	public void setSuppliedReferralDetails(ims.clinical.domain.objects.SuppliedReferralDetails suppliedReferralDetails) {
		this.suppliedReferralDetails = suppliedReferralDetails;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getAssessment() {
		return assessment;
	}
	public void setAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment assessment) {
		this.assessment = assessment;
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
		
		auditStr.append("\r\n*authoringInfo* :");
		if (authoringInfo != null)
		{
			auditStr.append(toShortClassName(authoringInfo));
				
		    auditStr.append(authoringInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careSpell* :");
		if (careSpell != null)
		{
			auditStr.append(toShortClassName(careSpell));
				
		    auditStr.append(careSpell.getId());
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
		auditStr.append("\r\n*referralCategory* :");
		if (referralCategory != null)
			auditStr.append(referralCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryPreceeding* :");
		if (primaryPreceeding != null)
			auditStr.append(primaryPreceeding.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referralType* :");
		if (referralType != null)
			auditStr.append(referralType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referralSource* :");
		if (referralSource != null)
			auditStr.append(referralSource.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*refOrgaCode* :");
		if (refOrgaCode != null)
		{
			auditStr.append(toShortClassName(refOrgaCode));
				
		    auditStr.append(refOrgaCode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referredBy* :");
		if (referredBy != null)
		{
			auditStr.append(toShortClassName(referredBy));
				
		    auditStr.append(referredBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referredByGP* :");
		if (referredByGP != null)
		{
			auditStr.append(toShortClassName(referredByGP));
				
		    auditStr.append(referredByGP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referralHCP* :");
		if (referralHCP != null)
		{
			auditStr.append(toShortClassName(referralHCP));
				
		    auditStr.append(referralHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*suppliedReferralProfessional* :");
		if (suppliedReferralProfessional != null)
		{
			auditStr.append(toShortClassName(suppliedReferralProfessional));
				
		    auditStr.append(suppliedReferralProfessional.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateSent* :");
		auditStr.append(dateSent);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateReceived* :");
		auditStr.append(dateReceived);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateFirstSeen* :");
		auditStr.append(dateFirstSeen);
	    auditStr.append("; ");
		auditStr.append("\r\n*details* :");
		auditStr.append(details);
	    auditStr.append("; ");
		auditStr.append("\r\n*referredtoLocation* :");
		if (referredtoLocation != null)
		{
			auditStr.append(toShortClassName(referredtoLocation));
				
		    auditStr.append(referredtoLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referralStatus* :");
		if (referralStatus != null)
			auditStr.append(referralStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referralPriority* :");
		if (referralPriority != null)
			auditStr.append(referralPriority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForReferral* :");
		if (reasonForReferral != null)
			auditStr.append(reasonForReferral.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*specialtyFunctionCode* :");
		if (specialtyFunctionCode != null)
			auditStr.append(specialtyFunctionCode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*urgentCancerReferralType* :");
		if (urgentCancerReferralType != null)
			auditStr.append(urgentCancerReferralType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cancerStatus* :");
		if (cancerStatus != null)
			auditStr.append(cancerStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*preceedingReferrals* :");
		if (preceedingReferrals != null)
		{
			java.util.Iterator it25 = preceedingReferrals.iterator();
			int i25=0;
			while (it25.hasNext())
			{
				if (i25 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.ReferralsRecording obj = (ims.clinical.domain.objects.ReferralsRecording)it25.next();
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
		auditStr.append("\r\n*delayReasonGPUrgentReferral* :");
		if (delayReasonGPUrgentReferral != null)
			auditStr.append(delayReasonGPUrgentReferral.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*delayReasonText* :");
		auditStr.append(delayReasonText);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingMOS* :");
		if (recordingMOS != null)
		{
			auditStr.append(toShortClassName(recordingMOS));
				
		    auditStr.append(recordingMOS.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForReferralText* :");
		auditStr.append(reasonForReferralText);
	    auditStr.append("; ");
		auditStr.append("\r\n*discipline* :");
		if (discipline != null)
			auditStr.append(discipline.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*suppliedReferralDetails* :");
		if (suppliedReferralDetails != null)
		{
			auditStr.append(toShortClassName(suppliedReferralDetails));
				
		    auditStr.append(suppliedReferralDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assessment* :");
		if (assessment != null)
		{
			auditStr.append(toShortClassName(assessment));
				
		    auditStr.append(assessment.getId());
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
		
		String keyClassName = "ReferralsRecording";
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
		if (this.getAuthoringInfo() != null)
		{
			sb.append("<authoringInfo>");
			sb.append(this.getAuthoringInfo().toXMLString(domMap)); 	
			sb.append("</authoringInfo>");		
		}
		if (this.getCareSpell() != null)
		{
			sb.append("<careSpell>");
			sb.append(this.getCareSpell().toXMLString(domMap)); 	
			sb.append("</careSpell>");		
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
		if (this.getReferralCategory() != null)
		{
			sb.append("<referralCategory>");
			sb.append(this.getReferralCategory().toXMLString()); 
			sb.append("</referralCategory>");		
		}
		if (this.getPrimaryPreceeding() != null)
		{
			sb.append("<primaryPreceeding>");
			sb.append(this.getPrimaryPreceeding().toXMLString()); 
			sb.append("</primaryPreceeding>");		
		}
		if (this.getReferralType() != null)
		{
			sb.append("<referralType>");
			sb.append(this.getReferralType().toXMLString()); 
			sb.append("</referralType>");		
		}
		if (this.getReferralSource() != null)
		{
			sb.append("<referralSource>");
			sb.append(this.getReferralSource().toXMLString()); 
			sb.append("</referralSource>");		
		}
		if (this.getRefOrgaCode() != null)
		{
			sb.append("<refOrgaCode>");
			sb.append(this.getRefOrgaCode().toXMLString(domMap)); 	
			sb.append("</refOrgaCode>");		
		}
		if (this.getReferredBy() != null)
		{
			sb.append("<referredBy>");
			sb.append(this.getReferredBy().toXMLString(domMap)); 	
			sb.append("</referredBy>");		
		}
		if (this.getReferredByGP() != null)
		{
			sb.append("<referredByGP>");
			sb.append(this.getReferredByGP().toXMLString(domMap)); 	
			sb.append("</referredByGP>");		
		}
		if (this.getReferralHCP() != null)
		{
			sb.append("<referralHCP>");
			sb.append(this.getReferralHCP().toXMLString(domMap)); 	
			sb.append("</referralHCP>");		
		}
		if (this.getSuppliedReferralProfessional() != null)
		{
			sb.append("<suppliedReferralProfessional>");
			sb.append(this.getSuppliedReferralProfessional().toXMLString(domMap)); 	
			sb.append("</suppliedReferralProfessional>");		
		}
		if (this.getDateSent() != null)
		{
			sb.append("<dateSent>");
			sb.append(new ims.framework.utils.DateTime(this.getDateSent()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateSent>");		
		}
		if (this.getDateReceived() != null)
		{
			sb.append("<dateReceived>");
			sb.append(new ims.framework.utils.DateTime(this.getDateReceived()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateReceived>");		
		}
		if (this.getDateFirstSeen() != null)
		{
			sb.append("<dateFirstSeen>");
			sb.append(new ims.framework.utils.DateTime(this.getDateFirstSeen()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateFirstSeen>");		
		}
		if (this.getDetails() != null)
		{
			sb.append("<details>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDetails().toString()));
			sb.append("</details>");		
		}
		if (this.getReferredtoLocation() != null)
		{
			sb.append("<referredtoLocation>");
			sb.append(this.getReferredtoLocation().toXMLString(domMap)); 	
			sb.append("</referredtoLocation>");		
		}
		if (this.getReferralStatus() != null)
		{
			sb.append("<referralStatus>");
			sb.append(this.getReferralStatus().toXMLString()); 
			sb.append("</referralStatus>");		
		}
		if (this.getReferralPriority() != null)
		{
			sb.append("<referralPriority>");
			sb.append(this.getReferralPriority().toXMLString()); 
			sb.append("</referralPriority>");		
		}
		if (this.getReasonForReferral() != null)
		{
			sb.append("<reasonForReferral>");
			sb.append(this.getReasonForReferral().toXMLString()); 
			sb.append("</reasonForReferral>");		
		}
		if (this.getSpecialtyFunctionCode() != null)
		{
			sb.append("<specialtyFunctionCode>");
			sb.append(this.getSpecialtyFunctionCode().toXMLString()); 
			sb.append("</specialtyFunctionCode>");		
		}
		if (this.getUrgentCancerReferralType() != null)
		{
			sb.append("<urgentCancerReferralType>");
			sb.append(this.getUrgentCancerReferralType().toXMLString()); 
			sb.append("</urgentCancerReferralType>");		
		}
		if (this.getCancerStatus() != null)
		{
			sb.append("<cancerStatus>");
			sb.append(this.getCancerStatus().toXMLString()); 
			sb.append("</cancerStatus>");		
		}
		if (this.getPreceedingReferrals() != null)
		{
			if (this.getPreceedingReferrals().size() > 0 )
			{
			sb.append("<preceedingReferrals>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPreceedingReferrals(), domMap));
			sb.append("</preceedingReferrals>");		
			}
		}
		if (this.getDelayReasonGPUrgentReferral() != null)
		{
			sb.append("<delayReasonGPUrgentReferral>");
			sb.append(this.getDelayReasonGPUrgentReferral().toXMLString()); 
			sb.append("</delayReasonGPUrgentReferral>");		
		}
		if (this.getDelayReasonText() != null)
		{
			sb.append("<delayReasonText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDelayReasonText().toString()));
			sb.append("</delayReasonText>");		
		}
		if (this.getRecordingMOS() != null)
		{
			sb.append("<recordingMOS>");
			sb.append(this.getRecordingMOS().toXMLString(domMap)); 	
			sb.append("</recordingMOS>");		
		}
		if (this.getReasonForReferralText() != null)
		{
			sb.append("<reasonForReferralText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonForReferralText().toString()));
			sb.append("</reasonForReferralText>");		
		}
		if (this.getDiscipline() != null)
		{
			sb.append("<discipline>");
			sb.append(this.getDiscipline().toXMLString()); 
			sb.append("</discipline>");		
		}
		if (this.getSuppliedReferralDetails() != null)
		{
			sb.append("<suppliedReferralDetails>");
			sb.append(this.getSuppliedReferralDetails().toXMLString(domMap)); 	
			sb.append("</suppliedReferralDetails>");		
		}
		if (this.getAssessment() != null)
		{
			sb.append("<assessment>");
			sb.append(this.getAssessment().toXMLString(domMap)); 	
			sb.append("</assessment>");		
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
			ReferralsRecording domainObject = getReferralsRecordingfromXML(itemEl, factory, domMap);

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
			ReferralsRecording domainObject = getReferralsRecordingfromXML(itemEl, factory, domMap);

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
		
	public static ReferralsRecording getReferralsRecordingfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getReferralsRecordingfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ReferralsRecording getReferralsRecordingfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ReferralsRecording.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ReferralsRecording.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ReferralsRecording class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ReferralsRecording)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ReferralsRecording.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ReferralsRecording ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ReferralsRecording)factory.getImportedDomainObject(ReferralsRecording.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ReferralsRecording();
		}
		String keyClassName = "ReferralsRecording";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ReferralsRecording)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ReferralsRecording obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careSpell");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareSpell(ims.core.admin.domain.objects.CareSpell.getCareSpellfromXML(fldEl, factory, domMap)); 
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
		fldEl = el.element("referralCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("primaryPreceeding");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrimaryPreceeding(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referralType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referralSource");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralSource(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("refOrgaCode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRefOrgaCode(ims.core.resource.place.domain.objects.Organisation.getOrganisationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referredBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferredBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referredByGP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferredByGP(ims.core.resource.people.domain.objects.Gp.getGpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referralHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferralHCP(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("suppliedReferralProfessional");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSuppliedReferralProfessional(ims.core.clinical.domain.objects.ReferralProfessionalDetail.getReferralProfessionalDetailfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateSent");
		if(fldEl != null)
		{	
    		obj.setDateSent(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateReceived");
		if(fldEl != null)
		{	
    		obj.setDateReceived(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateFirstSeen");
		if(fldEl != null)
		{	
    		obj.setDateFirstSeen(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("details");
		if(fldEl != null)
		{	
    		obj.setDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referredtoLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferredtoLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referralStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referralPriority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralPriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonForReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonForReferral(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("specialtyFunctionCode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialtyFunctionCode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("urgentCancerReferralType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUrgentCancerReferralType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cancerStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCancerStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("preceedingReferrals");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPreceedingReferrals(ims.clinical.domain.objects.ReferralsRecording.fromSetXMLString(fldEl, factory, obj.getPreceedingReferrals(), domMap));
		}
		fldEl = el.element("delayReasonGPUrgentReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDelayReasonGPUrgentReferral(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("delayReasonText");
		if(fldEl != null)
		{	
    		obj.setDelayReasonText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recordingMOS");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingMOS(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("reasonForReferralText");
		if(fldEl != null)
		{	
    		obj.setReasonForReferralText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("discipline");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDiscipline(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("suppliedReferralDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSuppliedReferralDetails(ims.clinical.domain.objects.SuppliedReferralDetails.getSuppliedReferralDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "preceedingReferrals"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AuthoringInfo = "authoringInfo";
		public static final String CareSpell = "careSpell";
		public static final String CareContext = "careContext";
		public static final String ClinicalContact = "clinicalContact";
		public static final String ReferralCategory = "referralCategory";
		public static final String PrimaryPreceeding = "primaryPreceeding";
		public static final String ReferralType = "referralType";
		public static final String ReferralSource = "referralSource";
		public static final String RefOrgaCode = "refOrgaCode";
		public static final String ReferredBy = "referredBy";
		public static final String ReferredByGP = "referredByGP";
		public static final String ReferralHCP = "referralHCP";
		public static final String SuppliedReferralProfessional = "suppliedReferralProfessional";
		public static final String DateSent = "dateSent";
		public static final String DateReceived = "dateReceived";
		public static final String DateFirstSeen = "dateFirstSeen";
		public static final String Details = "details";
		public static final String ReferredtoLocation = "referredtoLocation";
		public static final String ReferralStatus = "referralStatus";
		public static final String ReferralPriority = "referralPriority";
		public static final String ReasonForReferral = "reasonForReferral";
		public static final String SpecialtyFunctionCode = "specialtyFunctionCode";
		public static final String UrgentCancerReferralType = "urgentCancerReferralType";
		public static final String CancerStatus = "cancerStatus";
		public static final String PreceedingReferrals = "preceedingReferrals";
		public static final String DelayReasonGPUrgentReferral = "delayReasonGPUrgentReferral";
		public static final String DelayReasonText = "delayReasonText";
		public static final String RecordingMOS = "recordingMOS";
		public static final String ReasonForReferralText = "reasonForReferralText";
		public static final String Discipline = "discipline";
		public static final String SuppliedReferralDetails = "suppliedReferralDetails";
		public static final String Assessment = "assessment";
	}
}

