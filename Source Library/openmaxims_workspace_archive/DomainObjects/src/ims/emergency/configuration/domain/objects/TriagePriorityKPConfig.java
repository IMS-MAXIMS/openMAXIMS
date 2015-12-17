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
package ims.emergency.configuration.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class TriagePriorityKPConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1087100008;
	private static final long serialVersionUID = 1087100008L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Triage Priority */
	private ims.domain.lookups.LookupInstance triagePriority;
	/** Priority  Breach Warning KPI in Mins */
	private Integer priorityBreachWarningKPI;
	/** Priority Breach Warning KPI Colour */
	private ims.framework.utils.Color priorityBreachWarningKPITextColour;
	/** Priority Breach Warning KPI Flashing Text */
	private ims.domain.lookups.LookupInstance priorityBreachWarningKPIFlashingText;
	/** Priority Breach Warning KPI Flashing Text Colour */
	private ims.framework.utils.Color priorityBreachWarningKPIFlashingTextColour;
	/** Priority Breach Warning KPI Background Colour */
	private ims.framework.utils.Color priorityBreachWarningKPIBackgroundColour;
	/** Priority Breached KPI */
	private Integer priorityBreachedKPI;
	/** Priority Breach KPI Text Colour */
	private ims.framework.utils.Color priorityBreachKPITextColour;
	/** PriorityBreachedKPIFlashingText */
	private ims.domain.lookups.LookupInstance priorityBreachedKPIFlashingText;
	/** PriorityBreachedKPIFlashingTextColour */
	private ims.framework.utils.Color priorityBreachedKPIFlashingTextColour;
	/** PriorityBreachedKPIBackgroundColour */
	private ims.framework.utils.Color priorityBreachedKPIBackgroundColour;
	/** DefaultRowColour */
	private ims.framework.utils.Color defaultRowColour;
	/** DefaultFontColour */
	private ims.framework.utils.Color defaultFontColour;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TriagePriorityKPConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TriagePriorityKPConfig ()
    {
    	super();
    }
    public TriagePriorityKPConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.configuration.domain.objects.TriagePriorityKPConfig.class;
	}


	public ims.domain.lookups.LookupInstance getTriagePriority() {
		return triagePriority;
	}
	public void setTriagePriority(ims.domain.lookups.LookupInstance triagePriority) {
		this.triagePriority = triagePriority;
	}

	public Integer getPriorityBreachWarningKPI() {
		return priorityBreachWarningKPI;
	}
	public void setPriorityBreachWarningKPI(Integer priorityBreachWarningKPI) {
		this.priorityBreachWarningKPI = priorityBreachWarningKPI;
	}

	public ims.framework.utils.Color getPriorityBreachWarningKPITextColour() {
		return priorityBreachWarningKPITextColour;
	}
	public void setPriorityBreachWarningKPITextColour(ims.framework.utils.Color priorityBreachWarningKPITextColour) {
		this.priorityBreachWarningKPITextColour = priorityBreachWarningKPITextColour;
	}

	public ims.domain.lookups.LookupInstance getPriorityBreachWarningKPIFlashingText() {
		return priorityBreachWarningKPIFlashingText;
	}
	public void setPriorityBreachWarningKPIFlashingText(ims.domain.lookups.LookupInstance priorityBreachWarningKPIFlashingText) {
		this.priorityBreachWarningKPIFlashingText = priorityBreachWarningKPIFlashingText;
	}

	public ims.framework.utils.Color getPriorityBreachWarningKPIFlashingTextColour() {
		return priorityBreachWarningKPIFlashingTextColour;
	}
	public void setPriorityBreachWarningKPIFlashingTextColour(ims.framework.utils.Color priorityBreachWarningKPIFlashingTextColour) {
		this.priorityBreachWarningKPIFlashingTextColour = priorityBreachWarningKPIFlashingTextColour;
	}

	public ims.framework.utils.Color getPriorityBreachWarningKPIBackgroundColour() {
		return priorityBreachWarningKPIBackgroundColour;
	}
	public void setPriorityBreachWarningKPIBackgroundColour(ims.framework.utils.Color priorityBreachWarningKPIBackgroundColour) {
		this.priorityBreachWarningKPIBackgroundColour = priorityBreachWarningKPIBackgroundColour;
	}

	public Integer getPriorityBreachedKPI() {
		return priorityBreachedKPI;
	}
	public void setPriorityBreachedKPI(Integer priorityBreachedKPI) {
		this.priorityBreachedKPI = priorityBreachedKPI;
	}

	public ims.framework.utils.Color getPriorityBreachKPITextColour() {
		return priorityBreachKPITextColour;
	}
	public void setPriorityBreachKPITextColour(ims.framework.utils.Color priorityBreachKPITextColour) {
		this.priorityBreachKPITextColour = priorityBreachKPITextColour;
	}

	public ims.domain.lookups.LookupInstance getPriorityBreachedKPIFlashingText() {
		return priorityBreachedKPIFlashingText;
	}
	public void setPriorityBreachedKPIFlashingText(ims.domain.lookups.LookupInstance priorityBreachedKPIFlashingText) {
		this.priorityBreachedKPIFlashingText = priorityBreachedKPIFlashingText;
	}

	public ims.framework.utils.Color getPriorityBreachedKPIFlashingTextColour() {
		return priorityBreachedKPIFlashingTextColour;
	}
	public void setPriorityBreachedKPIFlashingTextColour(ims.framework.utils.Color priorityBreachedKPIFlashingTextColour) {
		this.priorityBreachedKPIFlashingTextColour = priorityBreachedKPIFlashingTextColour;
	}

	public ims.framework.utils.Color getPriorityBreachedKPIBackgroundColour() {
		return priorityBreachedKPIBackgroundColour;
	}
	public void setPriorityBreachedKPIBackgroundColour(ims.framework.utils.Color priorityBreachedKPIBackgroundColour) {
		this.priorityBreachedKPIBackgroundColour = priorityBreachedKPIBackgroundColour;
	}

	public ims.framework.utils.Color getDefaultRowColour() {
		return defaultRowColour;
	}
	public void setDefaultRowColour(ims.framework.utils.Color defaultRowColour) {
		this.defaultRowColour = defaultRowColour;
	}

	public ims.framework.utils.Color getDefaultFontColour() {
		return defaultFontColour;
	}
	public void setDefaultFontColour(ims.framework.utils.Color defaultFontColour) {
		this.defaultFontColour = defaultFontColour;
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
		if ( "Configuration".equals("Configuration") )
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
		
		auditStr.append("\r\n*triagePriority* :");
		if (triagePriority != null)
			auditStr.append(triagePriority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*priorityBreachWarningKPI* :");
		auditStr.append(priorityBreachWarningKPI);
	    auditStr.append("; ");
		auditStr.append("\r\n*priorityBreachWarningKPITextColour* :");
		auditStr.append(priorityBreachWarningKPITextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*priorityBreachWarningKPIFlashingText* :");
		if (priorityBreachWarningKPIFlashingText != null)
			auditStr.append(priorityBreachWarningKPIFlashingText.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*priorityBreachWarningKPIFlashingTextColour* :");
		auditStr.append(priorityBreachWarningKPIFlashingTextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*priorityBreachWarningKPIBackgroundColour* :");
		auditStr.append(priorityBreachWarningKPIBackgroundColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*priorityBreachedKPI* :");
		auditStr.append(priorityBreachedKPI);
	    auditStr.append("; ");
		auditStr.append("\r\n*priorityBreachKPITextColour* :");
		auditStr.append(priorityBreachKPITextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*priorityBreachedKPIFlashingText* :");
		if (priorityBreachedKPIFlashingText != null)
			auditStr.append(priorityBreachedKPIFlashingText.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*priorityBreachedKPIFlashingTextColour* :");
		auditStr.append(priorityBreachedKPIFlashingTextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*priorityBreachedKPIBackgroundColour* :");
		auditStr.append(priorityBreachedKPIBackgroundColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*defaultRowColour* :");
		auditStr.append(defaultRowColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*defaultFontColour* :");
		auditStr.append(defaultFontColour);
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
		
		String keyClassName = "TriagePriorityKPConfig";
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
		if (this.getTriagePriority() != null)
		{
			sb.append("<triagePriority>");
			sb.append(this.getTriagePriority().toXMLString()); 
			sb.append("</triagePriority>");		
		}
		if (this.getPriorityBreachWarningKPI() != null)
		{
			sb.append("<priorityBreachWarningKPI>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPriorityBreachWarningKPI().toString()));
			sb.append("</priorityBreachWarningKPI>");		
		}
		if (this.getPriorityBreachWarningKPITextColour() != null)
		{
			sb.append("<priorityBreachWarningKPITextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPriorityBreachWarningKPITextColour().toString()));
			sb.append("</priorityBreachWarningKPITextColour>");		
		}
		if (this.getPriorityBreachWarningKPIFlashingText() != null)
		{
			sb.append("<priorityBreachWarningKPIFlashingText>");
			sb.append(this.getPriorityBreachWarningKPIFlashingText().toXMLString()); 
			sb.append("</priorityBreachWarningKPIFlashingText>");		
		}
		if (this.getPriorityBreachWarningKPIFlashingTextColour() != null)
		{
			sb.append("<priorityBreachWarningKPIFlashingTextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPriorityBreachWarningKPIFlashingTextColour().toString()));
			sb.append("</priorityBreachWarningKPIFlashingTextColour>");		
		}
		if (this.getPriorityBreachWarningKPIBackgroundColour() != null)
		{
			sb.append("<priorityBreachWarningKPIBackgroundColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPriorityBreachWarningKPIBackgroundColour().toString()));
			sb.append("</priorityBreachWarningKPIBackgroundColour>");		
		}
		if (this.getPriorityBreachedKPI() != null)
		{
			sb.append("<priorityBreachedKPI>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPriorityBreachedKPI().toString()));
			sb.append("</priorityBreachedKPI>");		
		}
		if (this.getPriorityBreachKPITextColour() != null)
		{
			sb.append("<priorityBreachKPITextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPriorityBreachKPITextColour().toString()));
			sb.append("</priorityBreachKPITextColour>");		
		}
		if (this.getPriorityBreachedKPIFlashingText() != null)
		{
			sb.append("<priorityBreachedKPIFlashingText>");
			sb.append(this.getPriorityBreachedKPIFlashingText().toXMLString()); 
			sb.append("</priorityBreachedKPIFlashingText>");		
		}
		if (this.getPriorityBreachedKPIFlashingTextColour() != null)
		{
			sb.append("<priorityBreachedKPIFlashingTextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPriorityBreachedKPIFlashingTextColour().toString()));
			sb.append("</priorityBreachedKPIFlashingTextColour>");		
		}
		if (this.getPriorityBreachedKPIBackgroundColour() != null)
		{
			sb.append("<priorityBreachedKPIBackgroundColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPriorityBreachedKPIBackgroundColour().toString()));
			sb.append("</priorityBreachedKPIBackgroundColour>");		
		}
		if (this.getDefaultRowColour() != null)
		{
			sb.append("<defaultRowColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDefaultRowColour().toString()));
			sb.append("</defaultRowColour>");		
		}
		if (this.getDefaultFontColour() != null)
		{
			sb.append("<defaultFontColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDefaultFontColour().toString()));
			sb.append("</defaultFontColour>");		
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
			TriagePriorityKPConfig domainObject = getTriagePriorityKPConfigfromXML(itemEl, factory, domMap);

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
			TriagePriorityKPConfig domainObject = getTriagePriorityKPConfigfromXML(itemEl, factory, domMap);

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
		
	public static TriagePriorityKPConfig getTriagePriorityKPConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTriagePriorityKPConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TriagePriorityKPConfig getTriagePriorityKPConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TriagePriorityKPConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TriagePriorityKPConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TriagePriorityKPConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TriagePriorityKPConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TriagePriorityKPConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TriagePriorityKPConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TriagePriorityKPConfig)factory.getImportedDomainObject(TriagePriorityKPConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TriagePriorityKPConfig();
		}
		String keyClassName = "TriagePriorityKPConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TriagePriorityKPConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TriagePriorityKPConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("triagePriority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTriagePriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("priorityBreachWarningKPI");
		if(fldEl != null)
		{	
    		obj.setPriorityBreachWarningKPI(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("priorityBreachWarningKPITextColour");
		if(fldEl != null)
		{	
    		obj.setPriorityBreachWarningKPITextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("priorityBreachWarningKPIFlashingText");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPriorityBreachWarningKPIFlashingText(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("priorityBreachWarningKPIFlashingTextColour");
		if(fldEl != null)
		{	
    		obj.setPriorityBreachWarningKPIFlashingTextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("priorityBreachWarningKPIBackgroundColour");
		if(fldEl != null)
		{	
    		obj.setPriorityBreachWarningKPIBackgroundColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("priorityBreachedKPI");
		if(fldEl != null)
		{	
    		obj.setPriorityBreachedKPI(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("priorityBreachKPITextColour");
		if(fldEl != null)
		{	
    		obj.setPriorityBreachKPITextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("priorityBreachedKPIFlashingText");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPriorityBreachedKPIFlashingText(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("priorityBreachedKPIFlashingTextColour");
		if(fldEl != null)
		{	
    		obj.setPriorityBreachedKPIFlashingTextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("priorityBreachedKPIBackgroundColour");
		if(fldEl != null)
		{	
    		obj.setPriorityBreachedKPIBackgroundColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("defaultRowColour");
		if(fldEl != null)
		{	
    		obj.setDefaultRowColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("defaultFontColour");
		if(fldEl != null)
		{	
    		obj.setDefaultFontColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
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
		public static final String TriagePriority = "triagePriority";
		public static final String PriorityBreachWarningKPI = "priorityBreachWarningKPI";
		public static final String PriorityBreachWarningKPITextColour = "priorityBreachWarningKPITextColour";
		public static final String PriorityBreachWarningKPIFlashingText = "priorityBreachWarningKPIFlashingText";
		public static final String PriorityBreachWarningKPIFlashingTextColour = "priorityBreachWarningKPIFlashingTextColour";
		public static final String PriorityBreachWarningKPIBackgroundColour = "priorityBreachWarningKPIBackgroundColour";
		public static final String PriorityBreachedKPI = "priorityBreachedKPI";
		public static final String PriorityBreachKPITextColour = "priorityBreachKPITextColour";
		public static final String PriorityBreachedKPIFlashingText = "priorityBreachedKPIFlashingText";
		public static final String PriorityBreachedKPIFlashingTextColour = "priorityBreachedKPIFlashingTextColour";
		public static final String PriorityBreachedKPIBackgroundColour = "priorityBreachedKPIBackgroundColour";
		public static final String DefaultRowColour = "defaultRowColour";
		public static final String DefaultFontColour = "defaultFontColour";
	}
}

