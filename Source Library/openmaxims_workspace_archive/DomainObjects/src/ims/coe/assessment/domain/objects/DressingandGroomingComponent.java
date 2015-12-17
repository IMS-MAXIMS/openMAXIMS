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
package ims.coe.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class DressingandGroomingComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements java.io.Serializable {
	public static final int CLASSID = 1012100020;
	private static final long serialVersionUID = 1012100020L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** 
	  * Collection of ims.nursing.assessment.domain.objects.DressingandGroomingActivities.
	  */
	private java.util.List activities;
	/** 
	  * Collection of ims.coe.assessment.domain.objects.DressingandGroomingPreferences.
	  */
	private java.util.List preferences;
	private ims.domain.lookups.LookupInstance shavingPreference;
	private String shavingPattern;
	private ims.domain.lookups.LookupInstance assistanceWithDressingAndGrooming;
    public DressingandGroomingComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DressingandGroomingComponent ()
    {
    	super();
    }
    public DressingandGroomingComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.DressingandGroomingComponent.class;
	}


	public java.util.List getActivities() {
		if ( null == activities ) {
			activities = new java.util.ArrayList();
		}
		return activities;
	}
	public void setActivities(java.util.List paramValue) {
		this.activities = paramValue;
	}

	public java.util.List getPreferences() {
		if ( null == preferences ) {
			preferences = new java.util.ArrayList();
		}
		return preferences;
	}
	public void setPreferences(java.util.List paramValue) {
		this.preferences = paramValue;
	}

	public ims.domain.lookups.LookupInstance getShavingPreference() {
		return shavingPreference;
	}
	public void setShavingPreference(ims.domain.lookups.LookupInstance shavingPreference) {
		this.shavingPreference = shavingPreference;
	}

	public String getShavingPattern() {
		return shavingPattern;
	}
	public void setShavingPattern(String shavingPattern) {
		this.shavingPattern = shavingPattern;
	}

	public ims.domain.lookups.LookupInstance getAssistanceWithDressingAndGrooming() {
		return assistanceWithDressingAndGrooming;
	}
	public void setAssistanceWithDressingAndGrooming(ims.domain.lookups.LookupInstance assistanceWithDressingAndGrooming) {
		this.assistanceWithDressingAndGrooming = assistanceWithDressingAndGrooming;
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
		auditStr.append("\r\n*activities* :");
		if (activities != null)
		{
		int i1=0;
		for (i1=0; i1<activities.size(); i1++)
		{
			if (i1 > 0)
				auditStr.append(",");
			ims.nursing.assessment.domain.objects.DressingandGroomingActivities obj = (ims.nursing.assessment.domain.objects.DressingandGroomingActivities)activities.get(i1);
		    if (obj != null)
			{
				if (i1 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*preferences* :");
		if (preferences != null)
		{
		int i2=0;
		for (i2=0; i2<preferences.size(); i2++)
		{
			if (i2 > 0)
				auditStr.append(",");
			ims.coe.assessment.domain.objects.DressingandGroomingPreferences obj = (ims.coe.assessment.domain.objects.DressingandGroomingPreferences)preferences.get(i2);
		    if (obj != null)
			{
				if (i2 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*shavingPreference* :");
		if (shavingPreference != null)
			auditStr.append(shavingPreference.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*shavingPattern* :");
		auditStr.append(shavingPattern);
	    auditStr.append("; ");
		auditStr.append("\r\n*assistanceWithDressingAndGrooming* :");
		if (assistanceWithDressingAndGrooming != null)
			auditStr.append(assistanceWithDressingAndGrooming.getText());
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
		
		String keyClassName = "DressingandGroomingComponent";
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
		if (this.getActivities() != null)
		{
			if (this.getActivities().size() > 0 )
			{
			sb.append("<activities>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActivities(), domMap));
			sb.append("</activities>");		
			}
		}
		if (this.getPreferences() != null)
		{
			if (this.getPreferences().size() > 0 )
			{
			sb.append("<preferences>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPreferences(), domMap));
			sb.append("</preferences>");		
			}
		}
		if (this.getShavingPreference() != null)
		{
			sb.append("<shavingPreference>");
			sb.append(this.getShavingPreference().toXMLString()); 
			sb.append("</shavingPreference>");		
		}
		if (this.getShavingPattern() != null)
		{
			sb.append("<shavingPattern>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getShavingPattern().toString()));
			sb.append("</shavingPattern>");		
		}
		if (this.getAssistanceWithDressingAndGrooming() != null)
		{
			sb.append("<assistanceWithDressingAndGrooming>");
			sb.append(this.getAssistanceWithDressingAndGrooming().toXMLString()); 
			sb.append("</assistanceWithDressingAndGrooming>");		
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
			DressingandGroomingComponent domainObject = getDressingandGroomingComponentfromXML(itemEl, factory, domMap);

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
			DressingandGroomingComponent domainObject = getDressingandGroomingComponentfromXML(itemEl, factory, domMap);

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
		
	public static DressingandGroomingComponent getDressingandGroomingComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDressingandGroomingComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DressingandGroomingComponent getDressingandGroomingComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DressingandGroomingComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DressingandGroomingComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DressingandGroomingComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DressingandGroomingComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DressingandGroomingComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DressingandGroomingComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DressingandGroomingComponent)factory.getImportedDomainObject(DressingandGroomingComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DressingandGroomingComponent();
		}
		String keyClassName = "DressingandGroomingComponent";
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
			return (DressingandGroomingComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DressingandGroomingComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("activities");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setActivities(ims.nursing.assessment.domain.objects.DressingandGroomingActivities.fromListXMLString(fldEl, factory, obj.getActivities(), domMap));
		}
		fldEl = el.element("preferences");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPreferences(ims.coe.assessment.domain.objects.DressingandGroomingPreferences.fromListXMLString(fldEl, factory, obj.getPreferences(), domMap));
		}
		fldEl = el.element("shavingPreference");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setShavingPreference(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("shavingPattern");
		if(fldEl != null)
		{	
    		obj.setShavingPattern(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("assistanceWithDressingAndGrooming");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAssistanceWithDressingAndGrooming(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "activities"
		, "preferences"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Activities = "activities";
		public static final String Preferences = "preferences";
		public static final String ShavingPreference = "shavingPreference";
		public static final String ShavingPattern = "shavingPattern";
		public static final String AssistanceWithDressingAndGrooming = "assistanceWithDressingAndGrooming";
	}
}

