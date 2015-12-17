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


public class SleepingComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements java.io.Serializable {
	public static final int CLASSID = 1012100039;
	private static final long serialVersionUID = 1012100039L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String timePatientGoToBed;
	private String timePatientGetUp;
	private Integer howManyBlankets;
	private Integer howManyPillows;
	private String patternOfSleep;
	private ims.domain.lookups.LookupInstance patientHaveDifficultyInSleeping;
	private ims.coe.assessment.domain.objects.SleepingAids sleepingAids;
    public SleepingComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SleepingComponent ()
    {
    	super();
    }
    public SleepingComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.SleepingComponent.class;
	}


	public String getTimePatientGoToBed() {
		return timePatientGoToBed;
	}
	public void setTimePatientGoToBed(String timePatientGoToBed) {
		this.timePatientGoToBed = timePatientGoToBed;
	}

	public String getTimePatientGetUp() {
		return timePatientGetUp;
	}
	public void setTimePatientGetUp(String timePatientGetUp) {
		this.timePatientGetUp = timePatientGetUp;
	}

	public Integer getHowManyBlankets() {
		return howManyBlankets;
	}
	public void setHowManyBlankets(Integer howManyBlankets) {
		this.howManyBlankets = howManyBlankets;
	}

	public Integer getHowManyPillows() {
		return howManyPillows;
	}
	public void setHowManyPillows(Integer howManyPillows) {
		this.howManyPillows = howManyPillows;
	}

	public String getPatternOfSleep() {
		return patternOfSleep;
	}
	public void setPatternOfSleep(String patternOfSleep) {
		if ( null != patternOfSleep && patternOfSleep.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for patternOfSleep. Tried to set value: "+
				patternOfSleep);
		}
		this.patternOfSleep = patternOfSleep;
	}

	public ims.domain.lookups.LookupInstance getPatientHaveDifficultyInSleeping() {
		return patientHaveDifficultyInSleeping;
	}
	public void setPatientHaveDifficultyInSleeping(ims.domain.lookups.LookupInstance patientHaveDifficultyInSleeping) {
		this.patientHaveDifficultyInSleeping = patientHaveDifficultyInSleeping;
	}

	public ims.coe.assessment.domain.objects.SleepingAids getSleepingAids() {
		return sleepingAids;
	}
	public void setSleepingAids(ims.coe.assessment.domain.objects.SleepingAids sleepingAids) {
		this.sleepingAids = sleepingAids;
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
		auditStr.append("\r\n*timePatientGoToBed* :");
		auditStr.append(timePatientGoToBed);
	    auditStr.append("; ");
		auditStr.append("\r\n*timePatientGetUp* :");
		auditStr.append(timePatientGetUp);
	    auditStr.append("; ");
		auditStr.append("\r\n*howManyBlankets* :");
		auditStr.append(howManyBlankets);
	    auditStr.append("; ");
		auditStr.append("\r\n*howManyPillows* :");
		auditStr.append(howManyPillows);
	    auditStr.append("; ");
		auditStr.append("\r\n*patternOfSleep* :");
		auditStr.append(patternOfSleep);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientHaveDifficultyInSleeping* :");
		if (patientHaveDifficultyInSleeping != null)
			auditStr.append(patientHaveDifficultyInSleeping.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sleepingAids* :");
		if (sleepingAids != null)
		{
			auditStr.append(toShortClassName(sleepingAids));
				
		    auditStr.append(sleepingAids.getId());
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
		
		String keyClassName = "SleepingComponent";
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
		if (this.getTimePatientGoToBed() != null)
		{
			sb.append("<timePatientGoToBed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimePatientGoToBed().toString()));
			sb.append("</timePatientGoToBed>");		
		}
		if (this.getTimePatientGetUp() != null)
		{
			sb.append("<timePatientGetUp>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimePatientGetUp().toString()));
			sb.append("</timePatientGetUp>");		
		}
		if (this.getHowManyBlankets() != null)
		{
			sb.append("<howManyBlankets>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHowManyBlankets().toString()));
			sb.append("</howManyBlankets>");		
		}
		if (this.getHowManyPillows() != null)
		{
			sb.append("<howManyPillows>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHowManyPillows().toString()));
			sb.append("</howManyPillows>");		
		}
		if (this.getPatternOfSleep() != null)
		{
			sb.append("<patternOfSleep>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatternOfSleep().toString()));
			sb.append("</patternOfSleep>");		
		}
		if (this.getPatientHaveDifficultyInSleeping() != null)
		{
			sb.append("<patientHaveDifficultyInSleeping>");
			sb.append(this.getPatientHaveDifficultyInSleeping().toXMLString()); 
			sb.append("</patientHaveDifficultyInSleeping>");		
		}
		if (this.getSleepingAids() != null)
		{
			sb.append("<sleepingAids>");
			sb.append(this.getSleepingAids().toXMLString(domMap)); 	
			sb.append("</sleepingAids>");		
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
			SleepingComponent domainObject = getSleepingComponentfromXML(itemEl, factory, domMap);

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
			SleepingComponent domainObject = getSleepingComponentfromXML(itemEl, factory, domMap);

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
		
	public static SleepingComponent getSleepingComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSleepingComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SleepingComponent getSleepingComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SleepingComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SleepingComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SleepingComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SleepingComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SleepingComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SleepingComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SleepingComponent)factory.getImportedDomainObject(SleepingComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SleepingComponent();
		}
		String keyClassName = "SleepingComponent";
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
			return (SleepingComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SleepingComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("timePatientGoToBed");
		if(fldEl != null)
		{	
    		obj.setTimePatientGoToBed(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("timePatientGetUp");
		if(fldEl != null)
		{	
    		obj.setTimePatientGetUp(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("howManyBlankets");
		if(fldEl != null)
		{	
    		obj.setHowManyBlankets(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("howManyPillows");
		if(fldEl != null)
		{	
    		obj.setHowManyPillows(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patternOfSleep");
		if(fldEl != null)
		{	
    		obj.setPatternOfSleep(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientHaveDifficultyInSleeping");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientHaveDifficultyInSleeping(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sleepingAids");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSleepingAids(ims.coe.assessment.domain.objects.SleepingAids.getSleepingAidsfromXML(fldEl, factory, domMap)); 
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
		public static final String TimePatientGoToBed = "timePatientGoToBed";
		public static final String TimePatientGetUp = "timePatientGetUp";
		public static final String HowManyBlankets = "howManyBlankets";
		public static final String HowManyPillows = "howManyPillows";
		public static final String PatternOfSleep = "patternOfSleep";
		public static final String PatientHaveDifficultyInSleeping = "patientHaveDifficultyInSleeping";
		public static final String SleepingAids = "sleepingAids";
	}
}

