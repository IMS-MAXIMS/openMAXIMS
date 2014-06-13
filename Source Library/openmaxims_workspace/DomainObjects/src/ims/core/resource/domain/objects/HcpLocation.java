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
package ims.core.resource.domain.objects;

/**
 * 
 * @author Daniel Laffan
 * Generated.
 */


public class HcpLocation extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1005100003;
	private static final long serialVersionUID = 1005100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Location */
	private ims.core.resource.place.domain.objects.Location location;
	/** Services
	  * Collection of ims.core.resource.domain.objects.HcpLocationService.
	  */
	private java.util.Set services;
	/** is Primary */
	private Boolean isPrimary;
	/** Current Accreditation Status */
	private ims.domain.lookups.LookupInstance accreditationStatus;
	/** Current Accreditation Start Date */
	private java.util.Date startDate;
	/** Current Accreditation End Date */
	private java.util.Date endDate;
	/** Accreditation History for this location
	  * Collection of ims.core.resource.domain.objects.HcpLocationAccredHis.
	  */
	private java.util.List accreditationHistory;
	/** Case Types
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List caseTypes;
    public HcpLocation (Integer id, int ver)
    {
    	super(id, ver);
    }
    public HcpLocation ()
    {
    	super();
    }
    public HcpLocation (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.resource.domain.objects.HcpLocation.class;
	}


	public ims.core.resource.place.domain.objects.Location getLocation() {
		return location;
	}
	public void setLocation(ims.core.resource.place.domain.objects.Location location) {
		this.location = location;
	}

	public java.util.Set getServices() {
		if ( null == services ) {
			services = new java.util.HashSet();
		}
		return services;
	}
	public void setServices(java.util.Set paramValue) {
		this.services = paramValue;
	}

	public Boolean isIsPrimary() {
		return isPrimary;
	}
	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public ims.domain.lookups.LookupInstance getAccreditationStatus() {
		return accreditationStatus;
	}
	public void setAccreditationStatus(ims.domain.lookups.LookupInstance accreditationStatus) {
		this.accreditationStatus = accreditationStatus;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public java.util.Date getEndDate() {
		return endDate;
	}
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	public java.util.List getAccreditationHistory() {
		if ( null == accreditationHistory ) {
			accreditationHistory = new java.util.ArrayList();
		}
		return accreditationHistory;
	}
	public void setAccreditationHistory(java.util.List paramValue) {
		this.accreditationHistory = paramValue;
	}

	public java.util.List getCaseTypes() {
		if ( null == caseTypes ) {
			caseTypes = new java.util.ArrayList();
		}
		return caseTypes;
	}
	public void setCaseTypes(java.util.List paramValue) {
		this.caseTypes = paramValue;
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
		
		auditStr.append("\r\n*location* :");
		if (location != null)
		{
			auditStr.append(toShortClassName(location));
				
		    auditStr.append(location.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*services* :");
		if (services != null)
		{
			java.util.Iterator it2 = services.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.core.resource.domain.objects.HcpLocationService obj = (ims.core.resource.domain.objects.HcpLocationService)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isPrimary* :");
		auditStr.append(isPrimary);
	    auditStr.append("; ");
		auditStr.append("\r\n*accreditationStatus* :");
		if (accreditationStatus != null)
			auditStr.append(accreditationStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDate* :");
		auditStr.append(endDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*accreditationHistory* :");
		if (accreditationHistory != null)
		{
		int i7=0;
		for (i7=0; i7<accreditationHistory.size(); i7++)
		{
			if (i7 > 0)
				auditStr.append(",");
			ims.core.resource.domain.objects.HcpLocationAccredHis obj = (ims.core.resource.domain.objects.HcpLocationAccredHis)accreditationHistory.get(i7);
		    if (obj != null)
			{
				if (i7 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*caseTypes* :");
		if (caseTypes != null)
		{
			java.util.Iterator it8 = caseTypes.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it8.next();
			auditStr.append(obj.getText());
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
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
		
		String keyClassName = "HcpLocation";
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
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(this.getLocation().toXMLString(domMap)); 	
			sb.append("</location>");		
		}
		if (this.getServices() != null)
		{
			if (this.getServices().size() > 0 )
			{
			sb.append("<services>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getServices(), domMap));
			sb.append("</services>");		
			}
		}
		if (this.isIsPrimary() != null)
		{
			sb.append("<isPrimary>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPrimary().toString()));
			sb.append("</isPrimary>");		
		}
		if (this.getAccreditationStatus() != null)
		{
			sb.append("<accreditationStatus>");
			sb.append(this.getAccreditationStatus().toXMLString()); 
			sb.append("</accreditationStatus>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
		}
		if (this.getEndDate() != null)
		{
			sb.append("<endDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDate>");		
		}
		if (this.getAccreditationHistory() != null)
		{
			if (this.getAccreditationHistory().size() > 0 )
			{
			sb.append("<accreditationHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAccreditationHistory(), domMap));
			sb.append("</accreditationHistory>");		
			}
		}
		if (this.getCaseTypes() != null)
		{
			if (this.getCaseTypes().size() > 0 )
			{
			sb.append("<caseTypes>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getCaseTypes())); 
			sb.append("</caseTypes>");		
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
			HcpLocation domainObject = getHcpLocationfromXML(itemEl, factory, domMap);

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
			HcpLocation domainObject = getHcpLocationfromXML(itemEl, factory, domMap);

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
		
	public static HcpLocation getHcpLocationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getHcpLocationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static HcpLocation getHcpLocationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!HcpLocation.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!HcpLocation.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the HcpLocation class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (HcpLocation)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(HcpLocation.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		HcpLocation ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (HcpLocation)factory.getImportedDomainObject(HcpLocation.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new HcpLocation();
		}
		String keyClassName = "HcpLocation";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (HcpLocation)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, HcpLocation obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("location");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("services");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setServices(ims.core.resource.domain.objects.HcpLocationService.fromSetXMLString(fldEl, factory, obj.getServices(), domMap));
		}
		fldEl = el.element("isPrimary");
		if(fldEl != null)
		{	
    		obj.setIsPrimary(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("accreditationStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAccreditationStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endDate");
		if(fldEl != null)
		{	
    		obj.setEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("accreditationHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAccreditationHistory(ims.core.resource.domain.objects.HcpLocationAccredHis.fromListXMLString(fldEl, factory, obj.getAccreditationHistory(), domMap));
		}
		fldEl = el.element("caseTypes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCaseTypes(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getCaseTypes())); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "services"
		, "accreditationHistory"
		, "caseTypes"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Location = "location";
		public static final String Services = "services";
		public static final String IsPrimary = "isPrimary";
		public static final String AccreditationStatus = "accreditationStatus";
		public static final String StartDate = "startDate";
		public static final String EndDate = "endDate";
		public static final String AccreditationHistory = "accreditationHistory";
		public static final String CaseTypes = "caseTypes";
	}
}

