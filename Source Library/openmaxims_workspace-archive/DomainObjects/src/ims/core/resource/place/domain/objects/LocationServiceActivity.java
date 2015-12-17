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
 * @author Kevin O'Carroll
 * Generated.
 */


public class LocationServiceActivity extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1007100001;
	private static final long serialVersionUID = 1007100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ActivityContextPricings
	  * Collection of ims.core.clinical.domain.objects.ActivityContextPricingDetails.
	  */
	private java.util.Set activityContextPricings;
	/** Active Indicator */
	private Boolean isActive;
	/** ServiceActivity */
	private ims.core.resource.domain.objects.ServiceActivity serviceActivity;
	/** LocationService */
	private ims.core.resource.place.domain.objects.LocationService locationService;
    public LocationServiceActivity (Integer id, int ver)
    {
    	super(id, ver);
    }
    public LocationServiceActivity ()
    {
    	super();
    }
    public LocationServiceActivity (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.resource.place.domain.objects.LocationServiceActivity.class;
	}


	public java.util.Set getActivityContextPricings() {
		if ( null == activityContextPricings ) {
			activityContextPricings = new java.util.HashSet();
		}
		return activityContextPricings;
	}
	public void setActivityContextPricings(java.util.Set paramValue) {
		this.activityContextPricings = paramValue;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.core.resource.domain.objects.ServiceActivity getServiceActivity() {
		return serviceActivity;
	}
	public void setServiceActivity(ims.core.resource.domain.objects.ServiceActivity serviceActivity) {
		this.serviceActivity = serviceActivity;
	}

	public ims.core.resource.place.domain.objects.LocationService getLocationService() {
		return locationService;
	}
	public void setLocationService(ims.core.resource.place.domain.objects.LocationService locationService) {
		this.locationService = locationService;
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
		
		auditStr.append("\r\n*activityContextPricings* :");
		if (activityContextPricings != null)
		{
			java.util.Iterator it1 = activityContextPricings.iterator();
			int i1=0;
			while (it1.hasNext())
			{
				if (i1 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.ActivityContextPricingDetails obj = (ims.core.clinical.domain.objects.ActivityContextPricingDetails)it1.next();
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
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*serviceActivity* :");
		if (serviceActivity != null)
		{
			auditStr.append(toShortClassName(serviceActivity));
				
		    auditStr.append(serviceActivity.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*locationService* :");
		if (locationService != null)
		{
			auditStr.append(toShortClassName(locationService));
				
		    auditStr.append(locationService.getId());
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
		
		String keyClassName = "LocationServiceActivity";
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
		if (this.getActivityContextPricings() != null)
		{
			if (this.getActivityContextPricings().size() > 0 )
			{
			sb.append("<activityContextPricings>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActivityContextPricings(), domMap));
			sb.append("</activityContextPricings>");		
			}
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getServiceActivity() != null)
		{
			sb.append("<serviceActivity>");
			sb.append(this.getServiceActivity().toXMLString(domMap)); 	
			sb.append("</serviceActivity>");		
		}
		if (this.getLocationService() != null)
		{
			sb.append("<locationService>");
			sb.append(this.getLocationService().toXMLString(domMap)); 	
			sb.append("</locationService>");		
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
			LocationServiceActivity domainObject = getLocationServiceActivityfromXML(itemEl, factory, domMap);

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
			LocationServiceActivity domainObject = getLocationServiceActivityfromXML(itemEl, factory, domMap);

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
		
	public static LocationServiceActivity getLocationServiceActivityfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getLocationServiceActivityfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static LocationServiceActivity getLocationServiceActivityfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!LocationServiceActivity.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!LocationServiceActivity.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the LocationServiceActivity class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (LocationServiceActivity)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(LocationServiceActivity.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		LocationServiceActivity ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (LocationServiceActivity)factory.getImportedDomainObject(LocationServiceActivity.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new LocationServiceActivity();
		}
		String keyClassName = "LocationServiceActivity";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (LocationServiceActivity)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, LocationServiceActivity obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("activityContextPricings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setActivityContextPricings(ims.core.clinical.domain.objects.ActivityContextPricingDetails.fromSetXMLString(fldEl, factory, obj.getActivityContextPricings(), domMap));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("serviceActivity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setServiceActivity(ims.core.resource.domain.objects.ServiceActivity.getServiceActivityfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("locationService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocationService(ims.core.resource.place.domain.objects.LocationService.getLocationServicefromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "activityContextPricings"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ActivityContextPricings = "activityContextPricings";
		public static final String IsActive = "isActive";
		public static final String ServiceActivity = "serviceActivity";
		public static final String LocationService = "locationService";
	}
}

