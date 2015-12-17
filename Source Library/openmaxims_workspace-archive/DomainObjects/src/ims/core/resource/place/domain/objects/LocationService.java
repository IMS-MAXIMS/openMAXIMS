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
package ims.core.resource.place.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class LocationService extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1007100000;
	private static final long serialVersionUID = 1007100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Contact */
	private ims.core.resource.people.domain.objects.ServiceContact contact;
	/** Service */
	private ims.core.clinical.domain.objects.Service service;
	/** Location */
	private ims.core.resource.place.domain.objects.Location location;
	/** Allows the user to set the service to inactive */
	private Boolean isActive;
	/** Functions
	  * Collection of ims.core.resource.place.domain.objects.LocationServiceFunction.
	  */
	private java.util.Set functions;
	/** EffectiveTo */
	private java.util.Date effectiveTo;
	/** Activities
	  * Collection of ims.core.resource.place.domain.objects.LocationServiceActivity.
	  */
	private java.util.Set activities;
	/** Provides the ability to route a Rad Request to the correct printer */
	private String defaultPrinter;
    public LocationService (Integer id, int ver)
    {
    	super(id, ver);
    }
    public LocationService ()
    {
    	super();
    }
    public LocationService (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.resource.place.domain.objects.LocationService.class;
	}


	public ims.core.resource.people.domain.objects.ServiceContact getContact() {
		return contact;
	}
	public void setContact(ims.core.resource.people.domain.objects.ServiceContact contact) {
		this.contact = contact;
	}

	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
	}

	public ims.core.resource.place.domain.objects.Location getLocation() {
		return location;
	}
	public void setLocation(ims.core.resource.place.domain.objects.Location location) {
		this.location = location;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public java.util.Set getFunctions() {
		if ( null == functions ) {
			functions = new java.util.HashSet();
		}
		return functions;
	}
	public void setFunctions(java.util.Set paramValue) {
		this.functions = paramValue;
	}

	public java.util.Date getEffectiveTo() {
		return effectiveTo;
	}
	public void setEffectiveTo(java.util.Date effectiveTo) {
		this.effectiveTo = effectiveTo;
	}

	public java.util.Set getActivities() {
		if ( null == activities ) {
			activities = new java.util.HashSet();
		}
		return activities;
	}
	public void setActivities(java.util.Set paramValue) {
		this.activities = paramValue;
	}

	public String getDefaultPrinter() {
		return defaultPrinter;
	}
	public void setDefaultPrinter(String defaultPrinter) {
		if ( null != defaultPrinter && defaultPrinter.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for defaultPrinter. Tried to set value: "+
				defaultPrinter);
		}
		this.defaultPrinter = defaultPrinter;
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
	// method generated based on 'locsvc_unq1' unique index.
	public static boolean recordExistForServiceAndLocation(ims.domain.ILightweightDomainFactory factory,
		 ims.core.clinical.domain.objects.Service service
	,
	 ims.core.resource.place.domain.objects.Location location
	)	
	{
		return recordExistForServiceAndLocation(factory, service, location, null);
	}	

	// method generated based on 'locsvc_unq1' unique index.
	public static boolean recordExistForServiceAndLocation(ims.domain.ILightweightDomainFactory factory,
		 ims.core.clinical.domain.objects.Service service
	,
	 ims.core.resource.place.domain.objects.Location location
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from LocationService c where ");
		hql.append(" c.service = :service ");
		names[0] = "service";
		values[0] = service;		
		hql.append(" and "); 
		hql.append(" c.location = :location ");
		names[1] = "location";
		values[1] = location;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'locsvc_unq1' unique index.
	public static LocationService getRecordByServiceAndLocation(ims.domain.ILightweightDomainFactory factory,
	 ims.core.clinical.domain.objects.Service service
	,
	 ims.core.resource.place.domain.objects.Location location
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from LocationService c where ");
		hql.append(" c.service = :service ");
		names[0] = "service";
		values[0] = service;		
		hql.append(" and "); 
		hql.append(" c.location = :location ");
		names[1] = "location";
		values[1] = location;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (LocationService)l.get(0);
	}

	public static LocationService getLocationServiceFromlocsvc_unq1(ims.domain.ILightweightDomainFactory factory,
	 ims.core.clinical.domain.objects.Service service
	,
	 ims.core.resource.place.domain.objects.Location location
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from LocationService c where ");
		hql.append(" c.service = :service ");
		names[0] = "service";
		values[0] = service;		
		hql.append(" and "); 
		hql.append(" c.location = :location ");
		names[1] = "location";
		values[1] = location;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (LocationService)l.get(0);
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
		
		auditStr.append("\r\n*contact* :");
		if (contact != null)
		{
			auditStr.append(toShortClassName(contact));
				
		    auditStr.append(contact.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*location* :");
		if (location != null)
		{
			auditStr.append(toShortClassName(location));
				
		    auditStr.append(location.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*functions* :");
		if (functions != null)
		{
			java.util.Iterator it5 = functions.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.core.resource.place.domain.objects.LocationServiceFunction obj = (ims.core.resource.place.domain.objects.LocationServiceFunction)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*effectiveTo* :");
		auditStr.append(effectiveTo);
	    auditStr.append("; ");
		auditStr.append("\r\n*activities* :");
		if (activities != null)
		{
			java.util.Iterator it7 = activities.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.core.resource.place.domain.objects.LocationServiceActivity obj = (ims.core.resource.place.domain.objects.LocationServiceActivity)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*defaultPrinter* :");
		auditStr.append(defaultPrinter);
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
		
		String keyClassName = "LocationService";
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
		if (this.getContact() != null)
		{
			sb.append("<contact>");
			sb.append(this.getContact().toXMLString(domMap)); 	
			sb.append("</contact>");		
		}
		if (this.getService() != null)
		{
			sb.append("<service>");
			sb.append(this.getService().toXMLString(domMap)); 	
			sb.append("</service>");		
		}
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(this.getLocation().toXMLString(domMap)); 	
			sb.append("</location>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getFunctions() != null)
		{
			if (this.getFunctions().size() > 0 )
			{
			sb.append("<functions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFunctions(), domMap));
			sb.append("</functions>");		
			}
		}
		if (this.getEffectiveTo() != null)
		{
			sb.append("<effectiveTo>");
			sb.append(new ims.framework.utils.DateTime(this.getEffectiveTo()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effectiveTo>");		
		}
		if (this.getActivities() != null)
		{
			if (this.getActivities().size() > 0 )
			{
			sb.append("<activities>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActivities(), domMap));
			sb.append("</activities>");		
			}
		}
		if (this.getDefaultPrinter() != null)
		{
			sb.append("<defaultPrinter>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDefaultPrinter().toString()));
			sb.append("</defaultPrinter>");		
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
			LocationService domainObject = getLocationServicefromXML(itemEl, factory, domMap);

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
			LocationService domainObject = getLocationServicefromXML(itemEl, factory, domMap);

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
		
	public static LocationService getLocationServicefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getLocationServicefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static LocationService getLocationServicefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!LocationService.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!LocationService.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the LocationService class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (LocationService)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(LocationService.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		LocationService ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (LocationService)factory.getImportedDomainObject(LocationService.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new LocationService();
		}
		String keyClassName = "LocationService";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (LocationService)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, LocationService obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("contact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setContact(ims.core.resource.people.domain.objects.ServiceContact.getServiceContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("location");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("functions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setFunctions(ims.core.resource.place.domain.objects.LocationServiceFunction.fromSetXMLString(fldEl, factory, obj.getFunctions(), domMap));
		}
		fldEl = el.element("effectiveTo");
		if(fldEl != null)
		{	
    		obj.setEffectiveTo(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("activities");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setActivities(ims.core.resource.place.domain.objects.LocationServiceActivity.fromSetXMLString(fldEl, factory, obj.getActivities(), domMap));
		}
		fldEl = el.element("defaultPrinter");
		if(fldEl != null)
		{	
    		obj.setDefaultPrinter(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "functions"
		, "activities"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Contact = "contact";
		public static final String Service = "service";
		public static final String Location = "location";
		public static final String IsActive = "isActive";
		public static final String Functions = "functions";
		public static final String EffectiveTo = "effectiveTo";
		public static final String Activities = "activities";
		public static final String DefaultPrinter = "defaultPrinter";
	}
}

