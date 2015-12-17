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
package ims.assessment.instantiation.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class PatientAssessment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100048;
	private static final long serialVersionUID = 1003100048L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** AssessmentData */
	private ims.assessment.instantiation.domain.objects.PatientAssessmentData assessmentData;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** StatusReason */
	private ims.domain.lookups.LookupInstance statusReason;
	/** StatusReasonText */
	private String statusReasonText;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Score  (calculated field) */
	private java.lang.Float score;
	/** DPPType */
	private ims.domain.lookups.LookupInstance dPPType;
	/** DPPTypeText */
	private String dPPTypeText;
	/** isCurrentForType */
	private Boolean isCurrentForType;
	/** CompletedHCP */
	private ims.core.resource.people.domain.objects.Hcp completedHCP;
	/** CompletedDateTime */
	private java.util.Date completedDateTime;
	/** Episode Of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Is the Assessment Document Saved against the Patient record */
	private Boolean isAssessmentDocumentSaved;
	/** Associated Document */
	private ims.core.documents.domain.objects.PatientDocument associatedDocument;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientAssessment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientAssessment ()
    {
    	super();
    }
    public PatientAssessment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.assessment.instantiation.domain.objects.PatientAssessment.class;
	}


	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessmentData getAssessmentData() {
		return assessmentData;
	}
	public void setAssessmentData(ims.assessment.instantiation.domain.objects.PatientAssessmentData assessmentData) {
		this.assessmentData = assessmentData;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public ims.domain.lookups.LookupInstance getStatusReason() {
		return statusReason;
	}
	public void setStatusReason(ims.domain.lookups.LookupInstance statusReason) {
		this.statusReason = statusReason;
	}

	public String getStatusReasonText() {
		return statusReasonText;
	}
	public void setStatusReasonText(String statusReasonText) {
		if ( null != statusReasonText && statusReasonText.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for statusReasonText. Tried to set value: "+
				statusReasonText);
		}
		this.statusReasonText = statusReasonText;
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

	public java.lang.Float getScore() {
		return score;
	}
	public void setScore(java.lang.Float score) {
		this.score = score;
	}

	public ims.domain.lookups.LookupInstance getDPPType() {
		return dPPType;
	}
	public void setDPPType(ims.domain.lookups.LookupInstance dPPType) {
		this.dPPType = dPPType;
	}

	public String getDPPTypeText() {
		return dPPTypeText;
	}
	public void setDPPTypeText(String dPPTypeText) {
		if ( null != dPPTypeText && dPPTypeText.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for dPPTypeText. Tried to set value: "+
				dPPTypeText);
		}
		this.dPPTypeText = dPPTypeText;
	}

	public Boolean isIsCurrentForType() {
		return isCurrentForType;
	}
	public void setIsCurrentForType(Boolean isCurrentForType) {
		this.isCurrentForType = isCurrentForType;
	}

	public ims.core.resource.people.domain.objects.Hcp getCompletedHCP() {
		return completedHCP;
	}
	public void setCompletedHCP(ims.core.resource.people.domain.objects.Hcp completedHCP) {
		this.completedHCP = completedHCP;
	}

	public java.util.Date getCompletedDateTime() {
		return completedDateTime;
	}
	public void setCompletedDateTime(java.util.Date completedDateTime) {
		this.completedDateTime = completedDateTime;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public Boolean isIsAssessmentDocumentSaved() {
		return isAssessmentDocumentSaved;
	}
	public void setIsAssessmentDocumentSaved(Boolean isAssessmentDocumentSaved) {
		this.isAssessmentDocumentSaved = isAssessmentDocumentSaved;
	}

	public ims.core.documents.domain.objects.PatientDocument getAssociatedDocument() {
		return associatedDocument;
	}
	public void setAssociatedDocument(ims.core.documents.domain.objects.PatientDocument associatedDocument) {
		this.associatedDocument = associatedDocument;
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
		auditStr.append("\r\n*assessmentData* :");
		if (assessmentData != null)
		{
			auditStr.append(toShortClassName(assessmentData));
				
		    auditStr.append(assessmentData.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*statusReason* :");
		if (statusReason != null)
			auditStr.append(statusReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*statusReasonText* :");
		auditStr.append(statusReasonText);
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
		auditStr.append("\r\n*score* :");
		auditStr.append(score);
	    auditStr.append("; ");
		auditStr.append("\r\n*dPPType* :");
		if (dPPType != null)
			auditStr.append(dPPType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dPPTypeText* :");
		auditStr.append(dPPTypeText);
	    auditStr.append("; ");
		auditStr.append("\r\n*isCurrentForType* :");
		auditStr.append(isCurrentForType);
	    auditStr.append("; ");
		auditStr.append("\r\n*completedHCP* :");
		if (completedHCP != null)
		{
			auditStr.append(toShortClassName(completedHCP));
				
		    auditStr.append(completedHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*completedDateTime* :");
		auditStr.append(completedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isAssessmentDocumentSaved* :");
		auditStr.append(isAssessmentDocumentSaved);
	    auditStr.append("; ");
		auditStr.append("\r\n*associatedDocument* :");
		if (associatedDocument != null)
		{
			auditStr.append(toShortClassName(associatedDocument));
				
		    auditStr.append(associatedDocument.getId());
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
		
		String keyClassName = "PatientAssessment";
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
		if (this.getAssessmentData() != null)
		{
			sb.append("<assessmentData>");
			sb.append(this.getAssessmentData().toXMLString(domMap)); 	
			sb.append("</assessmentData>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getStatusReason() != null)
		{
			sb.append("<statusReason>");
			sb.append(this.getStatusReason().toXMLString()); 
			sb.append("</statusReason>");		
		}
		if (this.getStatusReasonText() != null)
		{
			sb.append("<statusReasonText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStatusReasonText().toString()));
			sb.append("</statusReasonText>");		
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
		if (this.getScore() != null)
		{
			sb.append("<score>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getScore().toString()));
			sb.append("</score>");		
		}
		if (this.getDPPType() != null)
		{
			sb.append("<dPPType>");
			sb.append(this.getDPPType().toXMLString()); 
			sb.append("</dPPType>");		
		}
		if (this.getDPPTypeText() != null)
		{
			sb.append("<dPPTypeText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDPPTypeText().toString()));
			sb.append("</dPPTypeText>");		
		}
		if (this.isIsCurrentForType() != null)
		{
			sb.append("<isCurrentForType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCurrentForType().toString()));
			sb.append("</isCurrentForType>");		
		}
		if (this.getCompletedHCP() != null)
		{
			sb.append("<completedHCP>");
			sb.append(this.getCompletedHCP().toXMLString(domMap)); 	
			sb.append("</completedHCP>");		
		}
		if (this.getCompletedDateTime() != null)
		{
			sb.append("<completedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getCompletedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</completedDateTime>");		
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.isIsAssessmentDocumentSaved() != null)
		{
			sb.append("<isAssessmentDocumentSaved>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsAssessmentDocumentSaved().toString()));
			sb.append("</isAssessmentDocumentSaved>");		
		}
		if (this.getAssociatedDocument() != null)
		{
			sb.append("<associatedDocument>");
			sb.append(this.getAssociatedDocument().toXMLString(domMap)); 	
			sb.append("</associatedDocument>");		
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
			PatientAssessment domainObject = getPatientAssessmentfromXML(itemEl, factory, domMap);

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
			PatientAssessment domainObject = getPatientAssessmentfromXML(itemEl, factory, domMap);

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
		
	public static PatientAssessment getPatientAssessmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientAssessmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientAssessment getPatientAssessmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientAssessment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientAssessment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientAssessment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientAssessment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientAssessment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientAssessment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientAssessment)factory.getImportedDomainObject(PatientAssessment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientAssessment();
		}
		String keyClassName = "PatientAssessment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientAssessment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientAssessment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assessmentData");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssessmentData(ims.assessment.instantiation.domain.objects.PatientAssessmentData.getPatientAssessmentDatafromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("statusReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatusReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("statusReasonText");
		if(fldEl != null)
		{	
    		obj.setStatusReasonText(new String(fldEl.getTextTrim()));	
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
		fldEl = el.element("score");
		if(fldEl != null)
		{	
    		obj.setScore(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dPPType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDPPType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dPPTypeText");
		if(fldEl != null)
		{	
    		obj.setDPPTypeText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isCurrentForType");
		if(fldEl != null)
		{	
    		obj.setIsCurrentForType(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("completedHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCompletedHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("completedDateTime");
		if(fldEl != null)
		{	
    		obj.setCompletedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isAssessmentDocumentSaved");
		if(fldEl != null)
		{	
    		obj.setIsAssessmentDocumentSaved(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("associatedDocument");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssociatedDocument(ims.core.documents.domain.objects.PatientDocument.getPatientDocumentfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalContact = "clinicalContact";
		public static final String AssessmentData = "assessmentData";
		public static final String Status = "status";
		public static final String StatusReason = "statusReason";
		public static final String StatusReasonText = "statusReasonText";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String Score = "score";
		public static final String DPPType = "dPPType";
		public static final String DPPTypeText = "dPPTypeText";
		public static final String IsCurrentForType = "isCurrentForType";
		public static final String CompletedHCP = "completedHCP";
		public static final String CompletedDateTime = "completedDateTime";
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String Patient = "patient";
		public static final String IsAssessmentDocumentSaved = "isAssessmentDocumentSaved";
		public static final String AssociatedDocument = "associatedDocument";
	}
}

