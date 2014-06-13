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
package ims.pathways.configuration.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class Event extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1089100000;
	private static final long serialVersionUID = 1089100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name of this event */
	private String name;
	/** Upper Event Name - Only used for Searching */
	private String upperName;
	/** Description of this target */
	private String description;
	/** Event Type - Event Created as a result of an external event, internal event or both */
	private ims.domain.lookups.LookupInstance eventType;
	/** Image to be displayed on Patient Journey */
	private ims.core.configuration.domain.objects.AppImage icon;
	/** Pathway Status inactive, preactive or active */
	private ims.domain.lookups.LookupInstance status;
	/** Flag to determine whether the patient diary is effected by this event */
	private Boolean patientDiaryImpact;
	/** Mappings
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List taxonomyMaps;
	/** Roles that can manually add these events
	  * Collection of ims.core.configuration.domain.objects.AppRole.
	  */
	private java.util.Set actioningRoles;
	/** Does this Event Start A clock - True or False */
	private Boolean startsClock;
	/** Does this Event Stop A clock - True or False */
	private Boolean stopsClock;
	/** Does this Event End a pathway and stop the clock - True or False */
	private Boolean endsPathway;
	/** Is a Manual Scheduled Event */
	private Boolean isManualScheduledEvent;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Event (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Event ()
    {
    	super();
    }
    public Event (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pathways.configuration.domain.objects.Event.class;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public String getUpperName() {
		return upperName;
	}
	public void setUpperName(String upperName) {
		if ( null != upperName && upperName.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for upperName. Tried to set value: "+
				upperName);
		}
		this.upperName = upperName;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public ims.domain.lookups.LookupInstance getEventType() {
		return eventType;
	}
	public void setEventType(ims.domain.lookups.LookupInstance eventType) {
		this.eventType = eventType;
	}

	public ims.core.configuration.domain.objects.AppImage getIcon() {
		return icon;
	}
	public void setIcon(ims.core.configuration.domain.objects.AppImage icon) {
		this.icon = icon;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public Boolean isPatientDiaryImpact() {
		return patientDiaryImpact;
	}
	public void setPatientDiaryImpact(Boolean patientDiaryImpact) {
		this.patientDiaryImpact = patientDiaryImpact;
	}

	public java.util.List getTaxonomyMaps() {
		if ( null == taxonomyMaps ) {
			taxonomyMaps = new java.util.ArrayList();
		}
		return taxonomyMaps;
	}
	public void setTaxonomyMaps(java.util.List paramValue) {
		this.taxonomyMaps = paramValue;
	}

	public java.util.Set getActioningRoles() {
		if ( null == actioningRoles ) {
			actioningRoles = new java.util.HashSet();
		}
		return actioningRoles;
	}
	public void setActioningRoles(java.util.Set paramValue) {
		this.actioningRoles = paramValue;
	}

	public Boolean isStartsClock() {
		return startsClock;
	}
	public void setStartsClock(Boolean startsClock) {
		this.startsClock = startsClock;
	}

	public Boolean isStopsClock() {
		return stopsClock;
	}
	public void setStopsClock(Boolean stopsClock) {
		this.stopsClock = stopsClock;
	}

	public Boolean isEndsPathway() {
		return endsPathway;
	}
	public void setEndsPathway(Boolean endsPathway) {
		this.endsPathway = endsPathway;
	}

	public Boolean isIsManualScheduledEvent() {
		return isManualScheduledEvent;
	}
	public void setIsManualScheduledEvent(Boolean isManualScheduledEvent) {
		this.isManualScheduledEvent = isManualScheduledEvent;
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
		
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*upperName* :");
		auditStr.append(upperName);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*eventType* :");
		if (eventType != null)
			auditStr.append(eventType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*icon* :");
		if (icon != null)
		{
			auditStr.append(toShortClassName(icon));
				
		    auditStr.append(icon.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientDiaryImpact* :");
		auditStr.append(patientDiaryImpact);
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyMaps* :");
		if (taxonomyMaps != null)
		{
		int i8=0;
		for (i8=0; i8<taxonomyMaps.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)taxonomyMaps.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*actioningRoles* :");
		if (actioningRoles != null)
		{
			java.util.Iterator it9 = actioningRoles.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.core.configuration.domain.objects.AppRole obj = (ims.core.configuration.domain.objects.AppRole)it9.next();
		if (obj != null)
		{
		   if (i9 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*startsClock* :");
		auditStr.append(startsClock);
	    auditStr.append("; ");
		auditStr.append("\r\n*stopsClock* :");
		auditStr.append(stopsClock);
	    auditStr.append("; ");
		auditStr.append("\r\n*endsPathway* :");
		auditStr.append(endsPathway);
	    auditStr.append("; ");
		auditStr.append("\r\n*isManualScheduledEvent* :");
		auditStr.append(isManualScheduledEvent);
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
		
		String keyClassName = "Event";
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
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getUpperName() != null)
		{
			sb.append("<upperName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUpperName().toString()));
			sb.append("</upperName>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getEventType() != null)
		{
			sb.append("<eventType>");
			sb.append(this.getEventType().toXMLString()); 
			sb.append("</eventType>");		
		}
		if (this.getIcon() != null)
		{
			sb.append("<icon>");
			sb.append(this.getIcon().toXMLString(domMap)); 	
			sb.append("</icon>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.isPatientDiaryImpact() != null)
		{
			sb.append("<patientDiaryImpact>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPatientDiaryImpact().toString()));
			sb.append("</patientDiaryImpact>");		
		}
		if (this.getTaxonomyMaps() != null)
		{
			if (this.getTaxonomyMaps().size() > 0 )
			{
			sb.append("<taxonomyMaps>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTaxonomyMaps(), domMap));
			sb.append("</taxonomyMaps>");		
			}
		}
		if (this.getActioningRoles() != null)
		{
			if (this.getActioningRoles().size() > 0 )
			{
			sb.append("<actioningRoles>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActioningRoles(), domMap));
			sb.append("</actioningRoles>");		
			}
		}
		if (this.isStartsClock() != null)
		{
			sb.append("<startsClock>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isStartsClock().toString()));
			sb.append("</startsClock>");		
		}
		if (this.isStopsClock() != null)
		{
			sb.append("<stopsClock>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isStopsClock().toString()));
			sb.append("</stopsClock>");		
		}
		if (this.isEndsPathway() != null)
		{
			sb.append("<endsPathway>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isEndsPathway().toString()));
			sb.append("</endsPathway>");		
		}
		if (this.isIsManualScheduledEvent() != null)
		{
			sb.append("<isManualScheduledEvent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsManualScheduledEvent().toString()));
			sb.append("</isManualScheduledEvent>");		
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
			Event domainObject = getEventfromXML(itemEl, factory, domMap);

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
			Event domainObject = getEventfromXML(itemEl, factory, domMap);

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
		
	public static Event getEventfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getEventfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Event getEventfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Event.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Event.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Event class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Event)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Event.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Event ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Event)factory.getImportedDomainObject(Event.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Event();
		}
		String keyClassName = "Event";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Event)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Event obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("upperName");
		if(fldEl != null)
		{	
    		obj.setUpperName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("eventType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEventType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("icon");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setIcon(ims.core.configuration.domain.objects.AppImage.getAppImagefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientDiaryImpact");
		if(fldEl != null)
		{	
    		obj.setPatientDiaryImpact(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("taxonomyMaps");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTaxonomyMaps(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getTaxonomyMaps(), domMap));
		}
		fldEl = el.element("actioningRoles");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setActioningRoles(ims.core.configuration.domain.objects.AppRole.fromSetXMLString(fldEl, factory, obj.getActioningRoles(), domMap));
		}
		fldEl = el.element("startsClock");
		if(fldEl != null)
		{	
    		obj.setStartsClock(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("stopsClock");
		if(fldEl != null)
		{	
    		obj.setStopsClock(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("endsPathway");
		if(fldEl != null)
		{	
    		obj.setEndsPathway(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isManualScheduledEvent");
		if(fldEl != null)
		{	
    		obj.setIsManualScheduledEvent(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "taxonomyMaps"
		, "actioningRoles"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String UpperName = "upperName";
		public static final String Description = "description";
		public static final String EventType = "eventType";
		public static final String Icon = "icon";
		public static final String Status = "status";
		public static final String PatientDiaryImpact = "patientDiaryImpact";
		public static final String TaxonomyMaps = "taxonomyMaps";
		public static final String ActioningRoles = "actioningRoles";
		public static final String StartsClock = "startsClock";
		public static final String StopsClock = "stopsClock";
		public static final String EndsPathway = "endsPathway";
		public static final String IsManualScheduledEvent = "isManualScheduledEvent";
	}
}

