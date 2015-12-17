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
 * @author Rory Fitzpatrick
 * Generated.
 */


public class PatientJourneyComment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1088100012;
	private static final long serialVersionUID = 1088100012L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** RecordingInfo */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInfo;
	/** Comment */
	private String comment;
	/** CommentLevel */
	private ims.domain.lookups.LookupInstance commentLevel;
	/** LinkedEvent */
	private ims.pathways.domain.objects.PatientEvent linkedEvent;
	/** LinkedTarget */
	private ims.pathways.domain.objects.PatientJourneyTarget linkedTarget;
	/** Reason why no validation date was etered with the comment */
	private String reasonNoValidationDate;
	private Boolean corrected;
	private String correctionComments;
	private ims.core.clinical.domain.objects.AuthoringInformation correctedAuthoringInformation;
	private ims.domain.lookups.LookupInstance reasonNoValidation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientJourneyComment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientJourneyComment ()
    {
    	super();
    }
    public PatientJourneyComment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pathways.domain.objects.PatientJourneyComment.class;
	}


	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInfo() {
		return recordingInfo;
	}
	public void setRecordingInfo(ims.core.clinical.domain.objects.RecordingUserInformation recordingInfo) {
		this.recordingInfo = recordingInfo;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public ims.domain.lookups.LookupInstance getCommentLevel() {
		return commentLevel;
	}
	public void setCommentLevel(ims.domain.lookups.LookupInstance commentLevel) {
		this.commentLevel = commentLevel;
	}

	public ims.pathways.domain.objects.PatientEvent getLinkedEvent() {
		return linkedEvent;
	}
	public void setLinkedEvent(ims.pathways.domain.objects.PatientEvent linkedEvent) {
		this.linkedEvent = linkedEvent;
	}

	public ims.pathways.domain.objects.PatientJourneyTarget getLinkedTarget() {
		return linkedTarget;
	}
	public void setLinkedTarget(ims.pathways.domain.objects.PatientJourneyTarget linkedTarget) {
		this.linkedTarget = linkedTarget;
	}

	public String getReasonNoValidationDate() {
		return reasonNoValidationDate;
	}
	public void setReasonNoValidationDate(String reasonNoValidationDate) {
		if ( null != reasonNoValidationDate && reasonNoValidationDate.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonNoValidationDate. Tried to set value: "+
				reasonNoValidationDate);
		}
		this.reasonNoValidationDate = reasonNoValidationDate;
	}

	public Boolean isCorrected() {
		return corrected;
	}
	public void setCorrected(Boolean corrected) {
		this.corrected = corrected;
	}

	public String getCorrectionComments() {
		return correctionComments;
	}
	public void setCorrectionComments(String correctionComments) {
		if ( null != correctionComments && correctionComments.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for correctionComments. Tried to set value: "+
				correctionComments);
		}
		this.correctionComments = correctionComments;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getCorrectedAuthoringInformation() {
		return correctedAuthoringInformation;
	}
	public void setCorrectedAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation correctedAuthoringInformation) {
		this.correctedAuthoringInformation = correctedAuthoringInformation;
	}

	public ims.domain.lookups.LookupInstance getReasonNoValidation() {
		return reasonNoValidation;
	}
	public void setReasonNoValidation(ims.domain.lookups.LookupInstance reasonNoValidation) {
		this.reasonNoValidation = reasonNoValidation;
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
		
		auditStr.append("\r\n*recordingInfo* :");
		if (recordingInfo != null)
		{
			auditStr.append(toShortClassName(recordingInfo));
				
		    auditStr.append(recordingInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*commentLevel* :");
		if (commentLevel != null)
			auditStr.append(commentLevel.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedEvent* :");
		if (linkedEvent != null)
		{
			auditStr.append(toShortClassName(linkedEvent));
				
		    auditStr.append(linkedEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedTarget* :");
		if (linkedTarget != null)
		{
			auditStr.append(toShortClassName(linkedTarget));
				
		    auditStr.append(linkedTarget.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonNoValidationDate* :");
		auditStr.append(reasonNoValidationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*corrected* :");
		auditStr.append(corrected);
	    auditStr.append("; ");
		auditStr.append("\r\n*correctionComments* :");
		auditStr.append(correctionComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*correctedAuthoringInformation* :");
		if (correctedAuthoringInformation != null)
		{
			auditStr.append(toShortClassName(correctedAuthoringInformation));
				
		    auditStr.append(correctedAuthoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonNoValidation* :");
		if (reasonNoValidation != null)
			auditStr.append(reasonNoValidation.getText());
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
		
		String keyClassName = "PatientJourneyComment";
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
		if (this.getRecordingInfo() != null)
		{
			sb.append("<recordingInfo>");
			sb.append(this.getRecordingInfo().toXMLString(domMap)); 	
			sb.append("</recordingInfo>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.getCommentLevel() != null)
		{
			sb.append("<commentLevel>");
			sb.append(this.getCommentLevel().toXMLString()); 
			sb.append("</commentLevel>");		
		}
		if (this.getLinkedEvent() != null)
		{
			sb.append("<linkedEvent>");
			sb.append(this.getLinkedEvent().toXMLString(domMap)); 	
			sb.append("</linkedEvent>");		
		}
		if (this.getLinkedTarget() != null)
		{
			sb.append("<linkedTarget>");
			sb.append(this.getLinkedTarget().toXMLString(domMap)); 	
			sb.append("</linkedTarget>");		
		}
		if (this.getReasonNoValidationDate() != null)
		{
			sb.append("<reasonNoValidationDate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonNoValidationDate().toString()));
			sb.append("</reasonNoValidationDate>");		
		}
		if (this.isCorrected() != null)
		{
			sb.append("<corrected>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCorrected().toString()));
			sb.append("</corrected>");		
		}
		if (this.getCorrectionComments() != null)
		{
			sb.append("<correctionComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCorrectionComments().toString()));
			sb.append("</correctionComments>");		
		}
		if (this.getCorrectedAuthoringInformation() != null)
		{
			sb.append("<correctedAuthoringInformation>");
			sb.append(this.getCorrectedAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</correctedAuthoringInformation>");		
		}
		if (this.getReasonNoValidation() != null)
		{
			sb.append("<reasonNoValidation>");
			sb.append(this.getReasonNoValidation().toXMLString()); 
			sb.append("</reasonNoValidation>");		
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
			PatientJourneyComment domainObject = getPatientJourneyCommentfromXML(itemEl, factory, domMap);

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
			PatientJourneyComment domainObject = getPatientJourneyCommentfromXML(itemEl, factory, domMap);

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
		
	public static PatientJourneyComment getPatientJourneyCommentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientJourneyCommentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientJourneyComment getPatientJourneyCommentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientJourneyComment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientJourneyComment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientJourneyComment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientJourneyComment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientJourneyComment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientJourneyComment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientJourneyComment)factory.getImportedDomainObject(PatientJourneyComment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientJourneyComment();
		}
		String keyClassName = "PatientJourneyComment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientJourneyComment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientJourneyComment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("recordingInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInfo(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("commentLevel");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCommentLevel(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("linkedEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLinkedEvent(ims.pathways.domain.objects.PatientEvent.getPatientEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("linkedTarget");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLinkedTarget(ims.pathways.domain.objects.PatientJourneyTarget.getPatientJourneyTargetfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("reasonNoValidationDate");
		if(fldEl != null)
		{	
    		obj.setReasonNoValidationDate(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("corrected");
		if(fldEl != null)
		{	
    		obj.setCorrected(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("correctionComments");
		if(fldEl != null)
		{	
    		obj.setCorrectionComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("correctedAuthoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCorrectedAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("reasonNoValidation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonNoValidation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String RecordingInfo = "recordingInfo";
		public static final String Comment = "comment";
		public static final String CommentLevel = "commentLevel";
		public static final String LinkedEvent = "linkedEvent";
		public static final String LinkedTarget = "linkedTarget";
		public static final String ReasonNoValidationDate = "reasonNoValidationDate";
		public static final String Corrected = "corrected";
		public static final String CorrectionComments = "correctionComments";
		public static final String CorrectedAuthoringInformation = "correctedAuthoringInformation";
		public static final String ReasonNoValidation = "reasonNoValidation";
	}
}

