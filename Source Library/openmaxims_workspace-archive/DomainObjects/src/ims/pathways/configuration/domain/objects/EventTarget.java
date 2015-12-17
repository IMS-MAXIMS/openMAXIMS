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
 * @author Neil McAnaspie
 * Generated.
 */


public class EventTarget extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1089100006;
	private static final long serialVersionUID = 1089100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Target */
	private ims.pathways.configuration.domain.objects.Target target;
	/** Event */
	private ims.pathways.configuration.domain.objects.Event event;
	/** Pathway Status inactive, preactive or active */
	private ims.domain.lookups.LookupInstance status;
	/** List of targets that could be activated as a result of this event
	  * Collection of ims.pathways.configuration.domain.objects.Target.
	  */
	private java.util.Set activateTargets;
	/** SetJourneyTargetStatusTo */
	private ims.domain.lookups.LookupInstance setJourneyTargetStatusTo;
	/** Set to In Scope */
	private Boolean setToInScope;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public EventTarget (Integer id, int ver)
    {
    	super(id, ver);
    }
    public EventTarget ()
    {
    	super();
    }
    public EventTarget (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pathways.configuration.domain.objects.EventTarget.class;
	}


	public ims.pathways.configuration.domain.objects.Target getTarget() {
		return target;
	}
	public void setTarget(ims.pathways.configuration.domain.objects.Target target) {
		this.target = target;
	}

	public ims.pathways.configuration.domain.objects.Event getEvent() {
		return event;
	}
	public void setEvent(ims.pathways.configuration.domain.objects.Event event) {
		this.event = event;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public java.util.Set getActivateTargets() {
		if ( null == activateTargets ) {
			activateTargets = new java.util.HashSet();
		}
		return activateTargets;
	}
	public void setActivateTargets(java.util.Set paramValue) {
		this.activateTargets = paramValue;
	}

	public ims.domain.lookups.LookupInstance getSetJourneyTargetStatusTo() {
		return setJourneyTargetStatusTo;
	}
	public void setSetJourneyTargetStatusTo(ims.domain.lookups.LookupInstance setJourneyTargetStatusTo) {
		this.setJourneyTargetStatusTo = setJourneyTargetStatusTo;
	}

	public Boolean isSetToInScope() {
		return setToInScope;
	}
	public void setSetToInScope(Boolean setToInScope) {
		this.setToInScope = setToInScope;
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
	// method generated based on 'eventtarg_unq1' unique index.
	public static boolean recordExistForTargetAndEvent(ims.domain.ILightweightDomainFactory factory,
		 ims.pathways.configuration.domain.objects.Target target
	,
	 ims.pathways.configuration.domain.objects.Event event
	)	
	{
		return recordExistForTargetAndEvent(factory, target, event, null);
	}	

	// method generated based on 'eventtarg_unq1' unique index.
	public static boolean recordExistForTargetAndEvent(ims.domain.ILightweightDomainFactory factory,
		 ims.pathways.configuration.domain.objects.Target target
	,
	 ims.pathways.configuration.domain.objects.Event event
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from EventTarget c where ");
		hql.append(" c.target = :target ");
		names[0] = "target";
		values[0] = target;		
		hql.append(" and "); 
		hql.append(" c.event = :event ");
		names[1] = "event";
		values[1] = event;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'eventtarg_unq1' unique index.
	public static EventTarget getRecordByTargetAndEvent(ims.domain.ILightweightDomainFactory factory,
	 ims.pathways.configuration.domain.objects.Target target
	,
	 ims.pathways.configuration.domain.objects.Event event
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from EventTarget c where ");
		hql.append(" c.target = :target ");
		names[0] = "target";
		values[0] = target;		
		hql.append(" and "); 
		hql.append(" c.event = :event ");
		names[1] = "event";
		values[1] = event;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (EventTarget)l.get(0);
	}

	public static EventTarget getEventTargetFromeventtarg_unq1(ims.domain.ILightweightDomainFactory factory,
	 ims.pathways.configuration.domain.objects.Target target
	,
	 ims.pathways.configuration.domain.objects.Event event
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from EventTarget c where ");
		hql.append(" c.target = :target ");
		names[0] = "target";
		values[0] = target;		
		hql.append(" and "); 
		hql.append(" c.event = :event ");
		names[1] = "event";
		values[1] = event;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (EventTarget)l.get(0);
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
		
		auditStr.append("\r\n*target* :");
		if (target != null)
		{
			auditStr.append(toShortClassName(target));
				
		    auditStr.append(target.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*event* :");
		if (event != null)
		{
			auditStr.append(toShortClassName(event));
				
		    auditStr.append(event.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activateTargets* :");
		if (activateTargets != null)
		{
			java.util.Iterator it4 = activateTargets.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.pathways.configuration.domain.objects.Target obj = (ims.pathways.configuration.domain.objects.Target)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*setJourneyTargetStatusTo* :");
		if (setJourneyTargetStatusTo != null)
			auditStr.append(setJourneyTargetStatusTo.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*setToInScope* :");
		auditStr.append(setToInScope);
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
		
		String keyClassName = "EventTarget";
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
		if (this.getTarget() != null)
		{
			sb.append("<target>");
			sb.append(this.getTarget().toXMLString(domMap)); 	
			sb.append("</target>");		
		}
		if (this.getEvent() != null)
		{
			sb.append("<event>");
			sb.append(this.getEvent().toXMLString(domMap)); 	
			sb.append("</event>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getActivateTargets() != null)
		{
			if (this.getActivateTargets().size() > 0 )
			{
			sb.append("<activateTargets>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActivateTargets(), domMap));
			sb.append("</activateTargets>");		
			}
		}
		if (this.getSetJourneyTargetStatusTo() != null)
		{
			sb.append("<setJourneyTargetStatusTo>");
			sb.append(this.getSetJourneyTargetStatusTo().toXMLString()); 
			sb.append("</setJourneyTargetStatusTo>");		
		}
		if (this.isSetToInScope() != null)
		{
			sb.append("<setToInScope>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSetToInScope().toString()));
			sb.append("</setToInScope>");		
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
			EventTarget domainObject = getEventTargetfromXML(itemEl, factory, domMap);

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
			EventTarget domainObject = getEventTargetfromXML(itemEl, factory, domMap);

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
		
	public static EventTarget getEventTargetfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getEventTargetfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static EventTarget getEventTargetfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!EventTarget.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!EventTarget.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the EventTarget class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (EventTarget)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(EventTarget.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		EventTarget ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (EventTarget)factory.getImportedDomainObject(EventTarget.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new EventTarget();
		}
		String keyClassName = "EventTarget";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (EventTarget)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, EventTarget obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("target");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTarget(ims.pathways.configuration.domain.objects.Target.getTargetfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("event");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEvent(ims.pathways.configuration.domain.objects.Event.getEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activateTargets");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setActivateTargets(ims.pathways.configuration.domain.objects.Target.fromSetXMLString(fldEl, factory, obj.getActivateTargets(), domMap));
		}
		fldEl = el.element("setJourneyTargetStatusTo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSetJourneyTargetStatusTo(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("setToInScope");
		if(fldEl != null)
		{	
    		obj.setSetToInScope(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "activateTargets"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Target = "target";
		public static final String Event = "event";
		public static final String Status = "status";
		public static final String ActivateTargets = "activateTargets";
		public static final String SetJourneyTargetStatusTo = "setJourneyTargetStatusTo";
		public static final String SetToInScope = "setToInScope";
	}
}

