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
package ims.nursing.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class PlanOfCare extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1009100002;
	private static final long serialVersionUID = 1009100002L;
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
	/** Authoring Information */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Start Date Time */
	private java.util.Date startDateTime;
	private ims.core.resource.people.domain.objects.Hcp startHCP;
	private ims.framework.utils.Color levelOfIntervention;
	/** Group */
	private ims.domain.lookups.LookupInstance group;
	/** Title */
	private String title;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** Resolved Date Time */
	private java.util.Date resolvedDateTime;
	private ims.core.resource.people.domain.objects.Hcp resolvingHCP;
	/** Start Date Time */
	private java.util.Date confirmingDateTime;
	private ims.core.resource.people.domain.objects.Hcp confirmingHCP;
	/** Actions
	  * Collection of ims.nursing.domain.objects.PlanOfCareActions.
	  */
	private java.util.Set actions;
	/** AssessmentQuestion */
	private ims.assessment.configuration.domain.objects.AssessmentQuestion assessmentQuestion;
	/** 
	  * Collection of ims.nursing.domain.objects.PlanOfCareHistory.
	  */
	private java.util.Set answerHistory;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PlanOfCare (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PlanOfCare ()
    {
    	super();
    }
    public PlanOfCare (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.domain.objects.PlanOfCare.class;
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

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public java.util.Date getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(java.util.Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getStartHCP() {
		return startHCP;
	}
	public void setStartHCP(ims.core.resource.people.domain.objects.Hcp startHCP) {
		this.startHCP = startHCP;
	}

	public ims.framework.utils.Color getLevelOfIntervention() {
		return levelOfIntervention;
	}
	public void setLevelOfIntervention(ims.framework.utils.Color levelOfIntervention) {
		this.levelOfIntervention = levelOfIntervention;
	}

	public ims.domain.lookups.LookupInstance getGroup() {
		return group;
	}
	public void setGroup(ims.domain.lookups.LookupInstance group) {
		this.group = group;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public java.util.Date getResolvedDateTime() {
		return resolvedDateTime;
	}
	public void setResolvedDateTime(java.util.Date resolvedDateTime) {
		this.resolvedDateTime = resolvedDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getResolvingHCP() {
		return resolvingHCP;
	}
	public void setResolvingHCP(ims.core.resource.people.domain.objects.Hcp resolvingHCP) {
		this.resolvingHCP = resolvingHCP;
	}

	public java.util.Date getConfirmingDateTime() {
		return confirmingDateTime;
	}
	public void setConfirmingDateTime(java.util.Date confirmingDateTime) {
		this.confirmingDateTime = confirmingDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getConfirmingHCP() {
		return confirmingHCP;
	}
	public void setConfirmingHCP(ims.core.resource.people.domain.objects.Hcp confirmingHCP) {
		this.confirmingHCP = confirmingHCP;
	}

	public java.util.Set getActions() {
		if ( null == actions ) {
			actions = new java.util.HashSet();
		}
		return actions;
	}
	public void setActions(java.util.Set paramValue) {
		this.actions = paramValue;
	}

	public ims.assessment.configuration.domain.objects.AssessmentQuestion getAssessmentQuestion() {
		return assessmentQuestion;
	}
	public void setAssessmentQuestion(ims.assessment.configuration.domain.objects.AssessmentQuestion assessmentQuestion) {
		this.assessmentQuestion = assessmentQuestion;
	}

	public java.util.Set getAnswerHistory() {
		if ( null == answerHistory ) {
			answerHistory = new java.util.HashSet();
		}
		return answerHistory;
	}
	public void setAnswerHistory(java.util.Set paramValue) {
		this.answerHistory = paramValue;
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
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*startDateTime* :");
		auditStr.append(startDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*startHCP* :");
		if (startHCP != null)
		{
			auditStr.append(toShortClassName(startHCP));
				
		    auditStr.append(startHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*levelOfIntervention* :");
		auditStr.append(levelOfIntervention);
	    auditStr.append("; ");
		auditStr.append("\r\n*group* :");
		if (group != null)
			auditStr.append(group.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*title* :");
		auditStr.append(title);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*resolvedDateTime* :");
		auditStr.append(resolvedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*resolvingHCP* :");
		if (resolvingHCP != null)
		{
			auditStr.append(toShortClassName(resolvingHCP));
				
		    auditStr.append(resolvingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmingDateTime* :");
		auditStr.append(confirmingDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmingHCP* :");
		if (confirmingHCP != null)
		{
			auditStr.append(toShortClassName(confirmingHCP));
				
		    auditStr.append(confirmingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*actions* :");
		if (actions != null)
		{
			java.util.Iterator it14 = actions.iterator();
			int i14=0;
			while (it14.hasNext())
			{
				if (i14 > 0)
					auditStr.append(",");
				ims.nursing.domain.objects.PlanOfCareActions obj = (ims.nursing.domain.objects.PlanOfCareActions)it14.next();
		if (obj != null)
		{
		   if (i14 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i14++;
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentQuestion* :");
		if (assessmentQuestion != null)
		{
			auditStr.append(toShortClassName(assessmentQuestion));
				
		    auditStr.append(assessmentQuestion.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*answerHistory* :");
		if (answerHistory != null)
		{
			java.util.Iterator it16 = answerHistory.iterator();
			int i16=0;
			while (it16.hasNext())
			{
				if (i16 > 0)
					auditStr.append(",");
				ims.nursing.domain.objects.PlanOfCareHistory obj = (ims.nursing.domain.objects.PlanOfCareHistory)it16.next();
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
		
		String keyClassName = "PlanOfCare";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getStartDateTime() != null)
		{
			sb.append("<startDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDateTime>");		
		}
		if (this.getStartHCP() != null)
		{
			sb.append("<startHCP>");
			sb.append(this.getStartHCP().toXMLString(domMap)); 	
			sb.append("</startHCP>");		
		}
		if (this.getLevelOfIntervention() != null)
		{
			sb.append("<levelOfIntervention>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLevelOfIntervention().toString()));
			sb.append("</levelOfIntervention>");		
		}
		if (this.getGroup() != null)
		{
			sb.append("<group>");
			sb.append(this.getGroup().toXMLString()); 
			sb.append("</group>");		
		}
		if (this.getTitle() != null)
		{
			sb.append("<title>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTitle().toString()));
			sb.append("</title>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getResolvedDateTime() != null)
		{
			sb.append("<resolvedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getResolvedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</resolvedDateTime>");		
		}
		if (this.getResolvingHCP() != null)
		{
			sb.append("<resolvingHCP>");
			sb.append(this.getResolvingHCP().toXMLString(domMap)); 	
			sb.append("</resolvingHCP>");		
		}
		if (this.getConfirmingDateTime() != null)
		{
			sb.append("<confirmingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getConfirmingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</confirmingDateTime>");		
		}
		if (this.getConfirmingHCP() != null)
		{
			sb.append("<confirmingHCP>");
			sb.append(this.getConfirmingHCP().toXMLString(domMap)); 	
			sb.append("</confirmingHCP>");		
		}
		if (this.getActions() != null)
		{
			if (this.getActions().size() > 0 )
			{
			sb.append("<actions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActions(), domMap));
			sb.append("</actions>");		
			}
		}
		if (this.getAssessmentQuestion() != null)
		{
			sb.append("<assessmentQuestion>");
			sb.append(this.getAssessmentQuestion().toXMLString(domMap)); 	
			sb.append("</assessmentQuestion>");		
		}
		if (this.getAnswerHistory() != null)
		{
			if (this.getAnswerHistory().size() > 0 )
			{
			sb.append("<answerHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAnswerHistory(), domMap));
			sb.append("</answerHistory>");		
			}
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
			PlanOfCare domainObject = getPlanOfCarefromXML(itemEl, factory, domMap);

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
			PlanOfCare domainObject = getPlanOfCarefromXML(itemEl, factory, domMap);

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
		
	public static PlanOfCare getPlanOfCarefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPlanOfCarefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PlanOfCare getPlanOfCarefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PlanOfCare.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PlanOfCare.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PlanOfCare class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PlanOfCare)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PlanOfCare.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PlanOfCare ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PlanOfCare)factory.getImportedDomainObject(PlanOfCare.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PlanOfCare();
		}
		String keyClassName = "PlanOfCare";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PlanOfCare)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PlanOfCare obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("startDateTime");
		if(fldEl != null)
		{	
    		obj.setStartDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("startHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setStartHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("levelOfIntervention");
		if(fldEl != null)
		{	
    		obj.setLevelOfIntervention(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("group");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGroup(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("title");
		if(fldEl != null)
		{	
    		obj.setTitle(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("resolvedDateTime");
		if(fldEl != null)
		{	
    		obj.setResolvedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("resolvingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResolvingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("confirmingDateTime");
		if(fldEl != null)
		{	
    		obj.setConfirmingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("confirmingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConfirmingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("actions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setActions(ims.nursing.domain.objects.PlanOfCareActions.fromSetXMLString(fldEl, factory, obj.getActions(), domMap));
		}
		fldEl = el.element("assessmentQuestion");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssessmentQuestion(ims.assessment.configuration.domain.objects.AssessmentQuestion.getAssessmentQuestionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("answerHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAnswerHistory(ims.nursing.domain.objects.PlanOfCareHistory.fromSetXMLString(fldEl, factory, obj.getAnswerHistory(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "actions"
		, "answerHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String StartDateTime = "startDateTime";
		public static final String StartHCP = "startHCP";
		public static final String LevelOfIntervention = "levelOfIntervention";
		public static final String Group = "group";
		public static final String Title = "title";
		public static final String Status = "status";
		public static final String ResolvedDateTime = "resolvedDateTime";
		public static final String ResolvingHCP = "resolvingHCP";
		public static final String ConfirmingDateTime = "confirmingDateTime";
		public static final String ConfirmingHCP = "confirmingHCP";
		public static final String Actions = "actions";
		public static final String AssessmentQuestion = "assessmentQuestion";
		public static final String AnswerHistory = "answerHistory";
	}
}

