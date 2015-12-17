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
package ims.clinical.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class ClinicalReferrals extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100112;
	private static final long serialVersionUID = 1072100112L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Referral Type */
	private ims.domain.lookups.LookupInstance referralType;
	/** CurrentReferralStatus */
	private ims.clinical.domain.objects.ClinicalReferralStatus currentReferralStatus;
	/** HistoryOfReferralStatus
	  * Collection of ims.clinical.domain.objects.ClinicalReferralStatus.
	  */
	private java.util.List historyOfReferralStatus;
	/** Refer From Service */
	private ims.core.clinical.domain.objects.Service referringService;
	/** Referring HCP */
	private ims.core.resource.people.domain.objects.Hcp referringHCP;
	/** Refer To Service */
	private ims.clinical.configuration.domain.objects.ServiceConfigIntReferral referToService;
	/** Refer To HCP */
	private ims.core.resource.people.domain.objects.Hcp referToHCP;
	/** Urgent Referral */
	private Boolean urgentReferral;
	/** New Condition */
	private Boolean newCondition;
	/** Requires Authorisation */
	private Boolean requiresAuthorisation;
	/** Service Specific Answers
	  * Collection of ims.assessment.instantiation.domain.objects.PatientAssessmentQuestion.
	  */
	private java.util.List serviceSpecificAnswers;
	/** Reason For Referral */
	private String reasonForReferral;
	/** Date Decision To Refer */
	private java.util.Date dateDecisionToRefer;
	/** PathwayID */
	private String pathwayID;
	/** RecordingInfo */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInfo;
	/** Referral Document
	  * Collection of ims.core.documents.domain.objects.PatientDocument.
	  */
	private java.util.Set referralDocument;
	/** ClinicalReferralNotes
	  * Collection of ims.clinical.domain.objects.ClinicalReferralNotes.
	  */
	private java.util.List clinicalReferralNotes;
	/** AcknowledgeRejection */
	private Boolean acknowledgeRejection;
	/** AuthorisingInfo */
	private ims.core.clinical.domain.objects.RecordingUserInformation authorisingInfo;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClinicalReferrals (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClinicalReferrals ()
    {
    	super();
    }
    public ClinicalReferrals (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.ClinicalReferrals.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public static java.util.List listClinicalReferralsByPatient(ims.domain.ILightweightDomainFactory factory, ims.core.patient.domain.objects.Patient val)
	{
		String hql = "from ClinicalReferrals c where c.patient = :patient";		
		return factory.find(hql, new String[]{"patient"}, new Object[]{val});		
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.domain.lookups.LookupInstance getReferralType() {
		return referralType;
	}
	public void setReferralType(ims.domain.lookups.LookupInstance referralType) {
		this.referralType = referralType;
	}

	public ims.clinical.domain.objects.ClinicalReferralStatus getCurrentReferralStatus() {
		return currentReferralStatus;
	}
	public void setCurrentReferralStatus(ims.clinical.domain.objects.ClinicalReferralStatus currentReferralStatus) {
		this.currentReferralStatus = currentReferralStatus;
	}

	public java.util.List getHistoryOfReferralStatus() {
		if ( null == historyOfReferralStatus ) {
			historyOfReferralStatus = new java.util.ArrayList();
		}
		return historyOfReferralStatus;
	}
	public void setHistoryOfReferralStatus(java.util.List paramValue) {
		this.historyOfReferralStatus = paramValue;
	}

	public ims.core.clinical.domain.objects.Service getReferringService() {
		return referringService;
	}
	public void setReferringService(ims.core.clinical.domain.objects.Service referringService) {
		this.referringService = referringService;
	}

	public ims.core.resource.people.domain.objects.Hcp getReferringHCP() {
		return referringHCP;
	}
	public void setReferringHCP(ims.core.resource.people.domain.objects.Hcp referringHCP) {
		this.referringHCP = referringHCP;
	}

	public ims.clinical.configuration.domain.objects.ServiceConfigIntReferral getReferToService() {
		return referToService;
	}
	public void setReferToService(ims.clinical.configuration.domain.objects.ServiceConfigIntReferral referToService) {
		this.referToService = referToService;
	}

	public ims.core.resource.people.domain.objects.Hcp getReferToHCP() {
		return referToHCP;
	}
	public void setReferToHCP(ims.core.resource.people.domain.objects.Hcp referToHCP) {
		this.referToHCP = referToHCP;
	}

	public Boolean isUrgentReferral() {
		return urgentReferral;
	}
	public void setUrgentReferral(Boolean urgentReferral) {
		this.urgentReferral = urgentReferral;
	}

	public Boolean isNewCondition() {
		return newCondition;
	}
	public void setNewCondition(Boolean newCondition) {
		this.newCondition = newCondition;
	}

	public Boolean isRequiresAuthorisation() {
		return requiresAuthorisation;
	}
	public void setRequiresAuthorisation(Boolean requiresAuthorisation) {
		this.requiresAuthorisation = requiresAuthorisation;
	}

	public java.util.List getServiceSpecificAnswers() {
		if ( null == serviceSpecificAnswers ) {
			serviceSpecificAnswers = new java.util.ArrayList();
		}
		return serviceSpecificAnswers;
	}
	public void setServiceSpecificAnswers(java.util.List paramValue) {
		this.serviceSpecificAnswers = paramValue;
	}

	public String getReasonForReferral() {
		return reasonForReferral;
	}
	public void setReasonForReferral(String reasonForReferral) {
		if ( null != reasonForReferral && reasonForReferral.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonForReferral. Tried to set value: "+
				reasonForReferral);
		}
		this.reasonForReferral = reasonForReferral;
	}

	public java.util.Date getDateDecisionToRefer() {
		return dateDecisionToRefer;
	}
	public void setDateDecisionToRefer(java.util.Date dateDecisionToRefer) {
		this.dateDecisionToRefer = dateDecisionToRefer;
	}

	public String getPathwayID() {
		return pathwayID;
	}
	public void setPathwayID(String pathwayID) {
		if ( null != pathwayID && pathwayID.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pathwayID. Tried to set value: "+
				pathwayID);
		}
		this.pathwayID = pathwayID;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInfo() {
		return recordingInfo;
	}
	public void setRecordingInfo(ims.core.clinical.domain.objects.RecordingUserInformation recordingInfo) {
		this.recordingInfo = recordingInfo;
	}

	public java.util.Set getReferralDocument() {
		if ( null == referralDocument ) {
			referralDocument = new java.util.HashSet();
		}
		return referralDocument;
	}
	public void setReferralDocument(java.util.Set paramValue) {
		this.referralDocument = paramValue;
	}

	public java.util.List getClinicalReferralNotes() {
		if ( null == clinicalReferralNotes ) {
			clinicalReferralNotes = new java.util.ArrayList();
		}
		return clinicalReferralNotes;
	}
	public void setClinicalReferralNotes(java.util.List paramValue) {
		this.clinicalReferralNotes = paramValue;
	}

	public Boolean isAcknowledgeRejection() {
		return acknowledgeRejection;
	}
	public void setAcknowledgeRejection(Boolean acknowledgeRejection) {
		this.acknowledgeRejection = acknowledgeRejection;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getAuthorisingInfo() {
		return authorisingInfo;
	}
	public void setAuthorisingInfo(ims.core.clinical.domain.objects.RecordingUserInformation authorisingInfo) {
		this.authorisingInfo = authorisingInfo;
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
		auditStr.append("\r\n*referralType* :");
		if (referralType != null)
			auditStr.append(referralType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*currentReferralStatus* :");
		if (currentReferralStatus != null)
		{
			auditStr.append(toShortClassName(currentReferralStatus));
				
		    auditStr.append(currentReferralStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*historyOfReferralStatus* :");
		if (historyOfReferralStatus != null)
		{
		int i4=0;
		for (i4=0; i4<historyOfReferralStatus.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.clinical.domain.objects.ClinicalReferralStatus obj = (ims.clinical.domain.objects.ClinicalReferralStatus)historyOfReferralStatus.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referringService* :");
		if (referringService != null)
		{
			auditStr.append(toShortClassName(referringService));
				
		    auditStr.append(referringService.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referringHCP* :");
		if (referringHCP != null)
		{
			auditStr.append(toShortClassName(referringHCP));
				
		    auditStr.append(referringHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referToService* :");
		if (referToService != null)
		{
			auditStr.append(toShortClassName(referToService));
				
		    auditStr.append(referToService.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referToHCP* :");
		if (referToHCP != null)
		{
			auditStr.append(toShortClassName(referToHCP));
				
		    auditStr.append(referToHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*urgentReferral* :");
		auditStr.append(urgentReferral);
	    auditStr.append("; ");
		auditStr.append("\r\n*newCondition* :");
		auditStr.append(newCondition);
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresAuthorisation* :");
		auditStr.append(requiresAuthorisation);
	    auditStr.append("; ");
		auditStr.append("\r\n*serviceSpecificAnswers* :");
		if (serviceSpecificAnswers != null)
		{
		int i12=0;
		for (i12=0; i12<serviceSpecificAnswers.size(); i12++)
		{
			if (i12 > 0)
				auditStr.append(",");
			ims.assessment.instantiation.domain.objects.PatientAssessmentQuestion obj = (ims.assessment.instantiation.domain.objects.PatientAssessmentQuestion)serviceSpecificAnswers.get(i12);
		    if (obj != null)
			{
				if (i12 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForReferral* :");
		auditStr.append(reasonForReferral);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateDecisionToRefer* :");
		auditStr.append(dateDecisionToRefer);
	    auditStr.append("; ");
		auditStr.append("\r\n*pathwayID* :");
		auditStr.append(pathwayID);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInfo* :");
		if (recordingInfo != null)
		{
			auditStr.append(toShortClassName(recordingInfo));
				
		    auditStr.append(recordingInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referralDocument* :");
		if (referralDocument != null)
		{
			java.util.Iterator it17 = referralDocument.iterator();
			int i17=0;
			while (it17.hasNext())
			{
				if (i17 > 0)
					auditStr.append(",");
				ims.core.documents.domain.objects.PatientDocument obj = (ims.core.documents.domain.objects.PatientDocument)it17.next();
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
		auditStr.append("\r\n*clinicalReferralNotes* :");
		if (clinicalReferralNotes != null)
		{
		int i18=0;
		for (i18=0; i18<clinicalReferralNotes.size(); i18++)
		{
			if (i18 > 0)
				auditStr.append(",");
			ims.clinical.domain.objects.ClinicalReferralNotes obj = (ims.clinical.domain.objects.ClinicalReferralNotes)clinicalReferralNotes.get(i18);
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
		auditStr.append("\r\n*acknowledgeRejection* :");
		auditStr.append(acknowledgeRejection);
	    auditStr.append("; ");
		auditStr.append("\r\n*authorisingInfo* :");
		if (authorisingInfo != null)
		{
			auditStr.append(toShortClassName(authorisingInfo));
				
		    auditStr.append(authorisingInfo.toString());
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
		
		String keyClassName = "ClinicalReferrals";
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
		if (this.getReferralType() != null)
		{
			sb.append("<referralType>");
			sb.append(this.getReferralType().toXMLString()); 
			sb.append("</referralType>");		
		}
		if (this.getCurrentReferralStatus() != null)
		{
			sb.append("<currentReferralStatus>");
			sb.append(this.getCurrentReferralStatus().toXMLString(domMap)); 	
			sb.append("</currentReferralStatus>");		
		}
		if (this.getHistoryOfReferralStatus() != null)
		{
			if (this.getHistoryOfReferralStatus().size() > 0 )
			{
			sb.append("<historyOfReferralStatus>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getHistoryOfReferralStatus(), domMap));
			sb.append("</historyOfReferralStatus>");		
			}
		}
		if (this.getReferringService() != null)
		{
			sb.append("<referringService>");
			sb.append(this.getReferringService().toXMLString(domMap)); 	
			sb.append("</referringService>");		
		}
		if (this.getReferringHCP() != null)
		{
			sb.append("<referringHCP>");
			sb.append(this.getReferringHCP().toXMLString(domMap)); 	
			sb.append("</referringHCP>");		
		}
		if (this.getReferToService() != null)
		{
			sb.append("<referToService>");
			sb.append(this.getReferToService().toXMLString(domMap)); 	
			sb.append("</referToService>");		
		}
		if (this.getReferToHCP() != null)
		{
			sb.append("<referToHCP>");
			sb.append(this.getReferToHCP().toXMLString(domMap)); 	
			sb.append("</referToHCP>");		
		}
		if (this.isUrgentReferral() != null)
		{
			sb.append("<urgentReferral>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isUrgentReferral().toString()));
			sb.append("</urgentReferral>");		
		}
		if (this.isNewCondition() != null)
		{
			sb.append("<newCondition>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNewCondition().toString()));
			sb.append("</newCondition>");		
		}
		if (this.isRequiresAuthorisation() != null)
		{
			sb.append("<requiresAuthorisation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRequiresAuthorisation().toString()));
			sb.append("</requiresAuthorisation>");		
		}
		if (this.getServiceSpecificAnswers() != null)
		{
			if (this.getServiceSpecificAnswers().size() > 0 )
			{
			sb.append("<serviceSpecificAnswers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getServiceSpecificAnswers(), domMap));
			sb.append("</serviceSpecificAnswers>");		
			}
		}
		if (this.getReasonForReferral() != null)
		{
			sb.append("<reasonForReferral>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonForReferral().toString()));
			sb.append("</reasonForReferral>");		
		}
		if (this.getDateDecisionToRefer() != null)
		{
			sb.append("<dateDecisionToRefer>");
			sb.append(new ims.framework.utils.DateTime(this.getDateDecisionToRefer()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateDecisionToRefer>");		
		}
		if (this.getPathwayID() != null)
		{
			sb.append("<pathwayID>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPathwayID().toString()));
			sb.append("</pathwayID>");		
		}
		if (this.getRecordingInfo() != null)
		{
			sb.append("<recordingInfo>");
			sb.append(this.getRecordingInfo().toXMLString(domMap)); 	
			sb.append("</recordingInfo>");		
		}
		if (this.getReferralDocument() != null)
		{
			if (this.getReferralDocument().size() > 0 )
			{
			sb.append("<referralDocument>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getReferralDocument(), domMap));
			sb.append("</referralDocument>");		
			}
		}
		if (this.getClinicalReferralNotes() != null)
		{
			if (this.getClinicalReferralNotes().size() > 0 )
			{
			sb.append("<clinicalReferralNotes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getClinicalReferralNotes(), domMap));
			sb.append("</clinicalReferralNotes>");		
			}
		}
		if (this.isAcknowledgeRejection() != null)
		{
			sb.append("<acknowledgeRejection>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAcknowledgeRejection().toString()));
			sb.append("</acknowledgeRejection>");		
		}
		if (this.getAuthorisingInfo() != null)
		{
			sb.append("<authorisingInfo>");
			sb.append(this.getAuthorisingInfo().toXMLString(domMap)); 	
			sb.append("</authorisingInfo>");		
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
			ClinicalReferrals domainObject = getClinicalReferralsfromXML(itemEl, factory, domMap);

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
			ClinicalReferrals domainObject = getClinicalReferralsfromXML(itemEl, factory, domMap);

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
		
	public static ClinicalReferrals getClinicalReferralsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClinicalReferralsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClinicalReferrals getClinicalReferralsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClinicalReferrals.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClinicalReferrals.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClinicalReferrals class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClinicalReferrals)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClinicalReferrals.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClinicalReferrals ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClinicalReferrals)factory.getImportedDomainObject(ClinicalReferrals.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClinicalReferrals();
		}
		String keyClassName = "ClinicalReferrals";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClinicalReferrals)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClinicalReferrals obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referralType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("currentReferralStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentReferralStatus(ims.clinical.domain.objects.ClinicalReferralStatus.getClinicalReferralStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("historyOfReferralStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setHistoryOfReferralStatus(ims.clinical.domain.objects.ClinicalReferralStatus.fromListXMLString(fldEl, factory, obj.getHistoryOfReferralStatus(), domMap));
		}
		fldEl = el.element("referringService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referringHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referToService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferToService(ims.clinical.configuration.domain.objects.ServiceConfigIntReferral.getServiceConfigIntReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referToHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferToHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("urgentReferral");
		if(fldEl != null)
		{	
    		obj.setUrgentReferral(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("newCondition");
		if(fldEl != null)
		{	
    		obj.setNewCondition(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requiresAuthorisation");
		if(fldEl != null)
		{	
    		obj.setRequiresAuthorisation(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("serviceSpecificAnswers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setServiceSpecificAnswers(ims.assessment.instantiation.domain.objects.PatientAssessmentQuestion.fromListXMLString(fldEl, factory, obj.getServiceSpecificAnswers(), domMap));
		}
		fldEl = el.element("reasonForReferral");
		if(fldEl != null)
		{	
    		obj.setReasonForReferral(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateDecisionToRefer");
		if(fldEl != null)
		{	
    		obj.setDateDecisionToRefer(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("pathwayID");
		if(fldEl != null)
		{	
    		obj.setPathwayID(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recordingInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInfo(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referralDocument");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setReferralDocument(ims.core.documents.domain.objects.PatientDocument.fromSetXMLString(fldEl, factory, obj.getReferralDocument(), domMap));
		}
		fldEl = el.element("clinicalReferralNotes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setClinicalReferralNotes(ims.clinical.domain.objects.ClinicalReferralNotes.fromListXMLString(fldEl, factory, obj.getClinicalReferralNotes(), domMap));
		}
		fldEl = el.element("acknowledgeRejection");
		if(fldEl != null)
		{	
    		obj.setAcknowledgeRejection(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("authorisingInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthorisingInfo(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "historyOfReferralStatus"
		, "serviceSpecificAnswers"
		, "referralDocument"
		, "clinicalReferralNotes"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String ReferralType = "referralType";
		public static final String CurrentReferralStatus = "currentReferralStatus";
		public static final String HistoryOfReferralStatus = "historyOfReferralStatus";
		public static final String ReferringService = "referringService";
		public static final String ReferringHCP = "referringHCP";
		public static final String ReferToService = "referToService";
		public static final String ReferToHCP = "referToHCP";
		public static final String UrgentReferral = "urgentReferral";
		public static final String NewCondition = "newCondition";
		public static final String RequiresAuthorisation = "requiresAuthorisation";
		public static final String ServiceSpecificAnswers = "serviceSpecificAnswers";
		public static final String ReasonForReferral = "reasonForReferral";
		public static final String DateDecisionToRefer = "dateDecisionToRefer";
		public static final String PathwayID = "pathwayID";
		public static final String RecordingInfo = "recordingInfo";
		public static final String ReferralDocument = "referralDocument";
		public static final String ClinicalReferralNotes = "clinicalReferralNotes";
		public static final String AcknowledgeRejection = "acknowledgeRejection";
		public static final String AuthorisingInfo = "authorisingInfo";
	}
}

