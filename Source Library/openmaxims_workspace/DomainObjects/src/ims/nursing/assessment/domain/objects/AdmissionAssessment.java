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
package ims.nursing.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class AdmissionAssessment extends ims.core.clinical.domain.objects.Assessment implements java.io.Serializable {
	public static final int CLASSID = 1015100000;
	private static final long serialVersionUID = 1015100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** 
	  * Collection of ims.nursing.assessment.domain.objects.AssessmentComponent.
	  */
	private java.util.Set components;
	private ims.domain.lookups.LookupInstance assessmentType;
	private ims.domain.lookups.LookupInstance assessmentStatus;
	private ims.core.resource.people.domain.objects.Hcp hCPComplete;
	private java.util.Date dateTimeComplete;
    public AdmissionAssessment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AdmissionAssessment ()
    {
    	super();
    }
    public AdmissionAssessment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.assessment.domain.objects.AdmissionAssessment.class;
	}


	public java.util.Set getComponents() {
		if ( null == components ) {
			components = new java.util.HashSet();
		}
		return components;
	}
	public void setComponents(java.util.Set paramValue) {
		this.components = paramValue;
	}

	public ims.domain.lookups.LookupInstance getAssessmentType() {
		return assessmentType;
	}
	public void setAssessmentType(ims.domain.lookups.LookupInstance assessmentType) {
		this.assessmentType = assessmentType;
	}

	public ims.domain.lookups.LookupInstance getAssessmentStatus() {
		return assessmentStatus;
	}
	public void setAssessmentStatus(ims.domain.lookups.LookupInstance assessmentStatus) {
		this.assessmentStatus = assessmentStatus;
	}

	public ims.core.resource.people.domain.objects.Hcp getHCPComplete() {
		return hCPComplete;
	}
	public void setHCPComplete(ims.core.resource.people.domain.objects.Hcp hCPComplete) {
		this.hCPComplete = hCPComplete;
	}

	public java.util.Date getDateTimeComplete() {
		return dateTimeComplete;
	}
	public void setDateTimeComplete(java.util.Date dateTimeComplete) {
		this.dateTimeComplete = dateTimeComplete;
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
		
		auditStr.append(super.toAuditString());
		auditStr.append("\r\n*components* :");
		if (components != null)
		{
			java.util.Iterator it1 = components.iterator();
			int i1=0;
			while (it1.hasNext())
			{
				if (i1 > 0)
					auditStr.append(",");
				ims.nursing.assessment.domain.objects.AssessmentComponent obj = (ims.nursing.assessment.domain.objects.AssessmentComponent)it1.next();
		if (obj != null)
		{
		   if (i1 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i1++;
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentType* :");
		if (assessmentType != null)
			auditStr.append(assessmentType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentStatus* :");
		if (assessmentStatus != null)
			auditStr.append(assessmentStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*hCPComplete* :");
		if (hCPComplete != null)
		{
			auditStr.append(toShortClassName(hCPComplete));
				
		    auditStr.append(hCPComplete.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTimeComplete* :");
		auditStr.append(dateTimeComplete);
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
		
		String keyClassName = "AdmissionAssessment";
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
		sb.append(super.fieldsToXMLString(domMap));
		if (this.getComponents() != null)
		{
			if (this.getComponents().size() > 0 )
			{
			sb.append("<components>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getComponents(), domMap));
			sb.append("</components>");		
			}
		}
		if (this.getAssessmentType() != null)
		{
			sb.append("<assessmentType>");
			sb.append(this.getAssessmentType().toXMLString()); 
			sb.append("</assessmentType>");		
		}
		if (this.getAssessmentStatus() != null)
		{
			sb.append("<assessmentStatus>");
			sb.append(this.getAssessmentStatus().toXMLString()); 
			sb.append("</assessmentStatus>");		
		}
		if (this.getHCPComplete() != null)
		{
			sb.append("<hCPComplete>");
			sb.append(this.getHCPComplete().toXMLString(domMap)); 	
			sb.append("</hCPComplete>");		
		}
		if (this.getDateTimeComplete() != null)
		{
			sb.append("<dateTimeComplete>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeComplete()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeComplete>");		
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
			AdmissionAssessment domainObject = getAdmissionAssessmentfromXML(itemEl, factory, domMap);

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
			AdmissionAssessment domainObject = getAdmissionAssessmentfromXML(itemEl, factory, domMap);

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
		
	public static AdmissionAssessment getAdmissionAssessmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAdmissionAssessmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AdmissionAssessment getAdmissionAssessmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AdmissionAssessment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AdmissionAssessment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AdmissionAssessment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AdmissionAssessment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AdmissionAssessment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AdmissionAssessment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AdmissionAssessment)factory.getImportedDomainObject(AdmissionAssessment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AdmissionAssessment();
		}
		String keyClassName = "AdmissionAssessment";
		Class clz = ret.getClass().getSuperclass();
		while (!clz.equals(ims.domain.DomainObject.class))
		{
			int dotIndex = clz.getName().lastIndexOf(".") + 1;
			keyClassName = clz.getName().substring(dotIndex); 
			clz = clz.getSuperclass();
		}

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AdmissionAssessment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AdmissionAssessment obj, java.util.HashMap domMap) throws Exception
	{
		ims.core.clinical.domain.objects.Assessment.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("components");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setComponents(ims.nursing.assessment.domain.objects.AssessmentComponent.fromSetXMLString(fldEl, factory, obj.getComponents(), domMap));
		}
		fldEl = el.element("assessmentType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAssessmentType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("assessmentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAssessmentStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("hCPComplete");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHCPComplete(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateTimeComplete");
		if(fldEl != null)
		{	
    		obj.setDateTimeComplete(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "components"
		};
	}

	/**
	isAssessmentCompleted()
	*/
public boolean isAssessmentCompleted()
{
	if (this.getComponents().size() < ims.configuration.ConfigFlag.DOM.ASSESSMENT_COMPONENT_NO.getValue()) 
		return false;
	
	java.util.Iterator iter = this.getComponents().iterator();
	ims.nursing.assessment.domain.objects.AssessmentComponent comp;
	while (iter.hasNext())
	{
		comp = (ims.nursing.assessment.domain.objects.AssessmentComponent)iter.next();
		if (comp.isIsComplete() == null || comp.isIsComplete().booleanValue() == false)
		{
	        return false;
		}				
	}
	return true;
}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Components = "components";
		public static final String AssessmentType = "assessmentType";
		public static final String AssessmentStatus = "assessmentStatus";
		public static final String HCPComplete = "hCPComplete";
		public static final String DateTimeComplete = "dateTimeComplete";
	}
}

