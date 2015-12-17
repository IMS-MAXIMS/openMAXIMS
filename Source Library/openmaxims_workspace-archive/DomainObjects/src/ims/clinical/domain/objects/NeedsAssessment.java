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


public class NeedsAssessment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100026;
	private static final long serialVersionUID = 1072100026L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient User Defined Object */
	private ims.assessment.instantiation.domain.objects.PatientUserDefinedObject patientUserDefinedObject;
	/** MobilisationDate */
	private java.util.Date mobilisationDate;
	/** Goal Plan Meeting Date */
	private java.util.Date goalPlanMeetingDate;
	/** NeedAssessmentNumber(first/second/Third) */
	private ims.domain.lookups.LookupInstance needAssessmentNumber;
	/** HadBooklet */
	private ims.domain.lookups.LookupInstance hadBooklet;
	/** Attach Booklet To Summary Sheet */
	private ims.domain.lookups.LookupInstance attachBookletToSummarySheet;
	/** DateStarted */
	private java.util.Date dateStarted;
	/** ComponentScore
	  * Collection of ims.clinical.domain.objects.NeedsAssessmentComponentScore.
	  */
	private java.util.Set componentScore;
	/** Authoring HCP  - editable on New, disabled on Update  */
	private ims.core.resource.people.domain.objects.Hcp authoringHCP;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public NeedsAssessment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public NeedsAssessment ()
    {
    	super();
    }
    public NeedsAssessment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.NeedsAssessment.class;
	}


	public ims.assessment.instantiation.domain.objects.PatientUserDefinedObject getPatientUserDefinedObject() {
		return patientUserDefinedObject;
	}
	public void setPatientUserDefinedObject(ims.assessment.instantiation.domain.objects.PatientUserDefinedObject patientUserDefinedObject) {
		this.patientUserDefinedObject = patientUserDefinedObject;
	}

	public java.util.Date getMobilisationDate() {
		return mobilisationDate;
	}
	public void setMobilisationDate(java.util.Date mobilisationDate) {
		this.mobilisationDate = mobilisationDate;
	}

	public java.util.Date getGoalPlanMeetingDate() {
		return goalPlanMeetingDate;
	}
	public void setGoalPlanMeetingDate(java.util.Date goalPlanMeetingDate) {
		this.goalPlanMeetingDate = goalPlanMeetingDate;
	}

	public ims.domain.lookups.LookupInstance getNeedAssessmentNumber() {
		return needAssessmentNumber;
	}
	public void setNeedAssessmentNumber(ims.domain.lookups.LookupInstance needAssessmentNumber) {
		this.needAssessmentNumber = needAssessmentNumber;
	}

	public ims.domain.lookups.LookupInstance getHadBooklet() {
		return hadBooklet;
	}
	public void setHadBooklet(ims.domain.lookups.LookupInstance hadBooklet) {
		this.hadBooklet = hadBooklet;
	}

	public ims.domain.lookups.LookupInstance getAttachBookletToSummarySheet() {
		return attachBookletToSummarySheet;
	}
	public void setAttachBookletToSummarySheet(ims.domain.lookups.LookupInstance attachBookletToSummarySheet) {
		this.attachBookletToSummarySheet = attachBookletToSummarySheet;
	}

	public java.util.Date getDateStarted() {
		return dateStarted;
	}
	public void setDateStarted(java.util.Date dateStarted) {
		this.dateStarted = dateStarted;
	}

	public java.util.Set getComponentScore() {
		if ( null == componentScore ) {
			componentScore = new java.util.HashSet();
		}
		return componentScore;
	}
	public void setComponentScore(java.util.Set paramValue) {
		this.componentScore = paramValue;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringHCP() {
		return authoringHCP;
	}
	public void setAuthoringHCP(ims.core.resource.people.domain.objects.Hcp authoringHCP) {
		this.authoringHCP = authoringHCP;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
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
		
		auditStr.append("\r\n*patientUserDefinedObject* :");
		if (patientUserDefinedObject != null)
		{
			auditStr.append(toShortClassName(patientUserDefinedObject));
				
		    auditStr.append(patientUserDefinedObject.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*mobilisationDate* :");
		auditStr.append(mobilisationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*goalPlanMeetingDate* :");
		auditStr.append(goalPlanMeetingDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*needAssessmentNumber* :");
		if (needAssessmentNumber != null)
			auditStr.append(needAssessmentNumber.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*hadBooklet* :");
		if (hadBooklet != null)
			auditStr.append(hadBooklet.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*attachBookletToSummarySheet* :");
		if (attachBookletToSummarySheet != null)
			auditStr.append(attachBookletToSummarySheet.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dateStarted* :");
		auditStr.append(dateStarted);
	    auditStr.append("; ");
		auditStr.append("\r\n*componentScore* :");
		if (componentScore != null)
		{
			java.util.Iterator it8 = componentScore.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.NeedsAssessmentComponentScore obj = (ims.clinical.domain.objects.NeedsAssessmentComponentScore)it8.next();
		if (obj != null)
		{
		   if (i8 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringHCP* :");
		if (authoringHCP != null)
		{
			auditStr.append(toShortClassName(authoringHCP));
				
		    auditStr.append(authoringHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
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
		
		String keyClassName = "NeedsAssessment";
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
		if (this.getPatientUserDefinedObject() != null)
		{
			sb.append("<patientUserDefinedObject>");
			sb.append(this.getPatientUserDefinedObject().toXMLString(domMap)); 	
			sb.append("</patientUserDefinedObject>");		
		}
		if (this.getMobilisationDate() != null)
		{
			sb.append("<mobilisationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getMobilisationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</mobilisationDate>");		
		}
		if (this.getGoalPlanMeetingDate() != null)
		{
			sb.append("<goalPlanMeetingDate>");
			sb.append(new ims.framework.utils.DateTime(this.getGoalPlanMeetingDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</goalPlanMeetingDate>");		
		}
		if (this.getNeedAssessmentNumber() != null)
		{
			sb.append("<needAssessmentNumber>");
			sb.append(this.getNeedAssessmentNumber().toXMLString()); 
			sb.append("</needAssessmentNumber>");		
		}
		if (this.getHadBooklet() != null)
		{
			sb.append("<hadBooklet>");
			sb.append(this.getHadBooklet().toXMLString()); 
			sb.append("</hadBooklet>");		
		}
		if (this.getAttachBookletToSummarySheet() != null)
		{
			sb.append("<attachBookletToSummarySheet>");
			sb.append(this.getAttachBookletToSummarySheet().toXMLString()); 
			sb.append("</attachBookletToSummarySheet>");		
		}
		if (this.getDateStarted() != null)
		{
			sb.append("<dateStarted>");
			sb.append(new ims.framework.utils.DateTime(this.getDateStarted()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateStarted>");		
		}
		if (this.getComponentScore() != null)
		{
			if (this.getComponentScore().size() > 0 )
			{
			sb.append("<componentScore>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getComponentScore(), domMap));
			sb.append("</componentScore>");		
			}
		}
		if (this.getAuthoringHCP() != null)
		{
			sb.append("<authoringHCP>");
			sb.append(this.getAuthoringHCP().toXMLString(domMap)); 	
			sb.append("</authoringHCP>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
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
			NeedsAssessment domainObject = getNeedsAssessmentfromXML(itemEl, factory, domMap);

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
			NeedsAssessment domainObject = getNeedsAssessmentfromXML(itemEl, factory, domMap);

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
		
	public static NeedsAssessment getNeedsAssessmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getNeedsAssessmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static NeedsAssessment getNeedsAssessmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!NeedsAssessment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!NeedsAssessment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the NeedsAssessment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (NeedsAssessment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(NeedsAssessment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		NeedsAssessment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (NeedsAssessment)factory.getImportedDomainObject(NeedsAssessment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new NeedsAssessment();
		}
		String keyClassName = "NeedsAssessment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (NeedsAssessment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, NeedsAssessment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patientUserDefinedObject");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientUserDefinedObject(ims.assessment.instantiation.domain.objects.PatientUserDefinedObject.getPatientUserDefinedObjectfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("mobilisationDate");
		if(fldEl != null)
		{	
    		obj.setMobilisationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("goalPlanMeetingDate");
		if(fldEl != null)
		{	
    		obj.setGoalPlanMeetingDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("needAssessmentNumber");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNeedAssessmentNumber(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("hadBooklet");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHadBooklet(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("attachBookletToSummarySheet");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAttachBookletToSummarySheet(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dateStarted");
		if(fldEl != null)
		{	
    		obj.setDateStarted(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("componentScore");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setComponentScore(ims.clinical.domain.objects.NeedsAssessmentComponentScore.fromSetXMLString(fldEl, factory, obj.getComponentScore(), domMap));
		}
		fldEl = el.element("authoringHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "componentScore"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PatientUserDefinedObject = "patientUserDefinedObject";
		public static final String MobilisationDate = "mobilisationDate";
		public static final String GoalPlanMeetingDate = "goalPlanMeetingDate";
		public static final String NeedAssessmentNumber = "needAssessmentNumber";
		public static final String HadBooklet = "hadBooklet";
		public static final String AttachBookletToSummarySheet = "attachBookletToSummarySheet";
		public static final String DateStarted = "dateStarted";
		public static final String ComponentScore = "componentScore";
		public static final String AuthoringHCP = "authoringHCP";
		public static final String CareContext = "careContext";
	}
}

